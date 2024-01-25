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

@OriginalClass("client!ml")
public final class Class75_Sub3 extends Class75 {

	@OriginalMember(owner = "client!ml", name = "Yb", descriptor = "I")
	private int anInt6445;

	@OriginalMember(owner = "client!ml", name = "ob", descriptor = "I")
	private int anInt6490;

	@OriginalMember(owner = "client!ml", name = "wh", descriptor = "I")
	public int anInt6517;

	@OriginalMember(owner = "client!ml", name = "ie", descriptor = "I")
	public int anInt6525;

	@OriginalMember(owner = "client!ml", name = "nf", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!ml", name = "xf", descriptor = "I")
	public int anInt6532;

	@OriginalMember(owner = "client!ml", name = "T", descriptor = "Lclient!hb;")
	private Class146 aClass146_1;

	@OriginalMember(owner = "client!ml", name = "Hb", descriptor = "Lclient!aq;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ml", name = "If", descriptor = "Lclient!aq;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ml", name = "ac", descriptor = "Lclient!se;")
	private Class49_Sub2 aClass49_Sub2_1;

	@OriginalMember(owner = "client!ml", name = "yd", descriptor = "I")
	public int anInt6536;

	@OriginalMember(owner = "client!ml", name = "oc", descriptor = "I")
	public int anInt6537;

	@OriginalMember(owner = "client!ml", name = "Qg", descriptor = "I")
	private int anInt6538;

	@OriginalMember(owner = "client!ml", name = "ne", descriptor = "Z")
	private boolean aBoolean466;

	@OriginalMember(owner = "client!ml", name = "Hc", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!ml", name = "vc", descriptor = "I")
	private int anInt6539;

	@OriginalMember(owner = "client!ml", name = "Sf", descriptor = "Z")
	private boolean aBoolean468;

	@OriginalMember(owner = "client!ml", name = "ad", descriptor = "Z")
	private boolean aBoolean469;

	@OriginalMember(owner = "client!ml", name = "gf", descriptor = "I")
	private int anInt6540;

	@OriginalMember(owner = "client!ml", name = "ig", descriptor = "J")
	private long aLong220;

	@OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
	private int anInt6541;

	@OriginalMember(owner = "client!ml", name = "id", descriptor = "I")
	private int anInt6543;

	@OriginalMember(owner = "client!ml", name = "Tc", descriptor = "I")
	private int anInt6544;

	@OriginalMember(owner = "client!ml", name = "Cd", descriptor = "Lclient!cea;")
	public Class54_Sub1 aClass54_Sub1_1;

	@OriginalMember(owner = "client!ml", name = "Ic", descriptor = "F")
	public float aFloat113;

	@OriginalMember(owner = "client!ml", name = "Cc", descriptor = "Z")
	private boolean aBoolean472;

	@OriginalMember(owner = "client!ml", name = "kg", descriptor = "Z")
	private boolean aBoolean474;

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "[Lclient!ica;")
	private Class44[] aClass44Array1;

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "Z")
	public boolean aBoolean477;

	@OriginalMember(owner = "client!ml", name = "Te", descriptor = "Z")
	private boolean aBoolean478;

	@OriginalMember(owner = "client!ml", name = "Ad", descriptor = "Lclient!so;")
	public Class332 aClass332_8;

	@OriginalMember(owner = "client!ml", name = "Pc", descriptor = "Lclient!cea;")
	public Class54_Sub1 aClass54_Sub1_2;

	@OriginalMember(owner = "client!ml", name = "Vc", descriptor = "Lclient!so;")
	public Class332 aClass332_9;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "Z")
	private boolean aBoolean479;

	@OriginalMember(owner = "client!ml", name = "Fe", descriptor = "Lclient!gda;")
	private Class44_Sub1_Sub1 aClass44_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ml", name = "qe", descriptor = "I")
	private int anInt6555;

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "Lclient!or;")
	private Class81_Sub2 aClass81_Sub2_1;

	@OriginalMember(owner = "client!ml", name = "Xc", descriptor = "Lclient!bp;")
	public Class44_Sub1 aClass44_Sub1_3;

	@OriginalMember(owner = "client!ml", name = "cb", descriptor = "F")
	private float aFloat118;

	@OriginalMember(owner = "client!ml", name = "Cf", descriptor = "Lclient!cea;")
	public Class54_Sub1 aClass54_Sub1_3;

	@OriginalMember(owner = "client!ml", name = "jd", descriptor = "Lclient!cea;")
	public Class54_Sub1 aClass54_Sub1_4;

	@OriginalMember(owner = "client!ml", name = "Kc", descriptor = "F")
	private float aFloat119;

	@OriginalMember(owner = "client!ml", name = "Mg", descriptor = "Lclient!hb;")
	public Class146 aClass146_2;

	@OriginalMember(owner = "client!ml", name = "tb", descriptor = "Z")
	public boolean aBoolean480;

	@OriginalMember(owner = "client!ml", name = "qh", descriptor = "I")
	public int anInt6557;

	@OriginalMember(owner = "client!ml", name = "zh", descriptor = "F")
	private float aFloat121;

	@OriginalMember(owner = "client!ml", name = "hb", descriptor = "I")
	private int anInt6558;

	@OriginalMember(owner = "client!ml", name = "th", descriptor = "Z")
	public boolean aBoolean481;

	@OriginalMember(owner = "client!ml", name = "Eb", descriptor = "Lclient!cea;")
	public Class54_Sub1 aClass54_Sub1_5;

	@OriginalMember(owner = "client!ml", name = "fe", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!ml", name = "Jc", descriptor = "I")
	private int anInt6561;

	@OriginalMember(owner = "client!ml", name = "Ae", descriptor = "Lclient!bda;")
	private Interface4 anInterface4_5;

	@OriginalMember(owner = "client!ml", name = "Mb", descriptor = "Z")
	private boolean aBoolean482;

	@OriginalMember(owner = "client!ml", name = "je", descriptor = "Lclient!aj;")
	private Interface2 anInterface2_3;

	@OriginalMember(owner = "client!ml", name = "Pe", descriptor = "Z")
	public boolean aBoolean483;

	@OriginalMember(owner = "client!ml", name = "Ed", descriptor = "Lclient!cea;")
	public Class54_Sub1 aClass54_Sub1_6;

	@OriginalMember(owner = "client!ml", name = "wc", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!ml", name = "cf", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!ml", name = "ih", descriptor = "I")
	private int anInt6563;

	@OriginalMember(owner = "client!ml", name = "wg", descriptor = "Lclient!cea;")
	public Class54_Sub1 aClass54_Sub1_7;

	@OriginalMember(owner = "client!ml", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!ml", name = "R", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!ml", name = "Jb", descriptor = "Z")
	public boolean aBoolean486;

	@OriginalMember(owner = "client!ml", name = "U", descriptor = "Z")
	public boolean aBoolean487;

	@OriginalMember(owner = "client!ml", name = "vg", descriptor = "Z")
	private boolean aBoolean488;

	@OriginalMember(owner = "client!ml", name = "sf", descriptor = "Z")
	private boolean aBoolean489;

	@OriginalMember(owner = "client!ml", name = "jg", descriptor = "Z")
	public boolean aBoolean490;

	@OriginalMember(owner = "client!ml", name = "Bh", descriptor = "I")
	private int anInt6565;

	@OriginalMember(owner = "client!ml", name = "gc", descriptor = "Ljava/lang/String;")
	private String aString78;

	@OriginalMember(owner = "client!ml", name = "Wf", descriptor = "Lclient!cea;")
	public Class54_Sub1 aClass54_Sub1_8;

	@OriginalMember(owner = "client!ml", name = "ge", descriptor = "Z")
	public boolean aBoolean493;

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "Z")
	public boolean aBoolean494;

	@OriginalMember(owner = "client!ml", name = "ug", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!ml", name = "Ke", descriptor = "Lclient!cea;")
	public Class54_Sub1 aClass54_Sub1_9;

	@OriginalMember(owner = "client!ml", name = "Uf", descriptor = "Lclient!cea;")
	public Class54_Sub1 aClass54_Sub1_10;

	@OriginalMember(owner = "client!ml", name = "Qc", descriptor = "Lclient!aj;")
	private Interface2 anInterface2_4;

	@OriginalMember(owner = "client!ml", name = "Lc", descriptor = "Z")
	public boolean aBoolean495;

	@OriginalMember(owner = "client!ml", name = "vf", descriptor = "I")
	private int anInt6571;

	@OriginalMember(owner = "client!ml", name = "Vb", descriptor = "I")
	public int anInt6572;

	@OriginalMember(owner = "client!ml", name = "od", descriptor = "Ljava/lang/String;")
	private String aString79;

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
	public int anInt6574;

	@OriginalMember(owner = "client!ml", name = "Re", descriptor = "I")
	private int anInt6575;

	@OriginalMember(owner = "client!ml", name = "Pf", descriptor = "I")
	private int anInt6576;

	@OriginalMember(owner = "client!ml", name = "Rf", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!ml", name = "og", descriptor = "I")
	public int anInt6526 = 128;

	@OriginalMember(owner = "client!ml", name = "sb", descriptor = "Lclient!uq;")
	private final Class366 aClass366_1 = new Class366();

	@OriginalMember(owner = "client!ml", name = "ab", descriptor = "Lclient!gj;")
	private final Class109_Sub2 aClass109_Sub2_1 = new Class109_Sub2();

	@OriginalMember(owner = "client!ml", name = "jb", descriptor = "Lclient!gj;")
	public final Class109_Sub2 aClass109_Sub2_2 = new Class109_Sub2();

	@OriginalMember(owner = "client!ml", name = "bb", descriptor = "I")
	public int anInt6530 = 8;

	@OriginalMember(owner = "client!ml", name = "Xf", descriptor = "I")
	public int anInt6531 = 3;

	@OriginalMember(owner = "client!ml", name = "Yg", descriptor = "Z")
	private boolean aBoolean465 = false;

	@OriginalMember(owner = "client!ml", name = "S", descriptor = "Lclient!tf;")
	private final Class340 aClass340_43 = new Class340();

	@OriginalMember(owner = "client!ml", name = "Yd", descriptor = "I")
	private int anInt6535 = -1;

	@OriginalMember(owner = "client!ml", name = "Kf", descriptor = "[Lclient!aq;")
	private final Interface3[] anInterface3Array2 = new Interface3[4];

	@OriginalMember(owner = "client!ml", name = "Ag", descriptor = "[Lclient!aq;")
	private final Interface3[] anInterface3Array3 = new Interface3[4];

	@OriginalMember(owner = "client!ml", name = "De", descriptor = "I")
	private int anInt6533 = -1;

	@OriginalMember(owner = "client!ml", name = "Cg", descriptor = "[Lclient!aq;")
	private final Interface3[] anInterface3Array1 = new Interface3[4];

	@OriginalMember(owner = "client!ml", name = "ng", descriptor = "I")
	private int anInt6534 = -1;

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "Lclient!tf;")
	private final Class340 aClass340_44;

	@OriginalMember(owner = "client!ml", name = "rd", descriptor = "Lclient!tf;")
	private final Class340 aClass340_45;

	@OriginalMember(owner = "client!ml", name = "Fc", descriptor = "Lclient!tf;")
	private final Class340 aClass340_46;

	@OriginalMember(owner = "client!ml", name = "rc", descriptor = "Lclient!tf;")
	private final Class340 aClass340_47;

	@OriginalMember(owner = "client!ml", name = "Lf", descriptor = "Lclient!tf;")
	private final Class340 aClass340_48;

	@OriginalMember(owner = "client!ml", name = "ud", descriptor = "Lclient!tf;")
	private final Class340 aClass340_49;

	@OriginalMember(owner = "client!ml", name = "cc", descriptor = "Lclient!tf;")
	private final Class340 aClass340_50;

	@OriginalMember(owner = "client!ml", name = "Pb", descriptor = "Lclient!gj;")
	public final Class109_Sub2 aClass109_Sub2_3;

	@OriginalMember(owner = "client!ml", name = "Td", descriptor = "Lclient!gj;")
	public final Class109_Sub2 aClass109_Sub2_4;

	@OriginalMember(owner = "client!ml", name = "Bb", descriptor = "Lclient!gj;")
	public final Class109_Sub2 aClass109_Sub2_5;

	@OriginalMember(owner = "client!ml", name = "nd", descriptor = "F")
	private float aFloat112;

	@OriginalMember(owner = "client!ml", name = "rg", descriptor = "I")
	public int anInt6542;

	@OriginalMember(owner = "client!ml", name = "zg", descriptor = "[F")
	public final float[] aFloatArray51;

	@OriginalMember(owner = "client!ml", name = "Y", descriptor = "Z")
	private boolean aBoolean476;

	@OriginalMember(owner = "client!ml", name = "qg", descriptor = "F")
	public float aFloat115;

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "F")
	public float aFloat117;

	@OriginalMember(owner = "client!ml", name = "ve", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!ml", name = "Ob", descriptor = "I")
	private int anInt6547;

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!ml", name = "mc", descriptor = "I")
	private int anInt6549;

	@OriginalMember(owner = "client!ml", name = "V", descriptor = "F")
	private float aFloat122;

	@OriginalMember(owner = "client!ml", name = "hg", descriptor = "F")
	private float aFloat116;

	@OriginalMember(owner = "client!ml", name = "pg", descriptor = "I")
	public int anInt6559;

	@OriginalMember(owner = "client!ml", name = "wb", descriptor = "I")
	public int anInt6553;

	@OriginalMember(owner = "client!ml", name = "tg", descriptor = "[F")
	private final float[] aFloatArray54;

	@OriginalMember(owner = "client!ml", name = "we", descriptor = "I")
	private int anInt6545;

	@OriginalMember(owner = "client!ml", name = "Xe", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!ml", name = "of", descriptor = "I")
	private int anInt6566;

	@OriginalMember(owner = "client!ml", name = "Bg", descriptor = "F")
	private float aFloat120;

	@OriginalMember(owner = "client!ml", name = "ff", descriptor = "F")
	public float aFloat114;

	@OriginalMember(owner = "client!ml", name = "gg", descriptor = "Z")
	private boolean aBoolean485;

	@OriginalMember(owner = "client!ml", name = "Oe", descriptor = "I")
	private int anInt6569;

	@OriginalMember(owner = "client!ml", name = "zb", descriptor = "I")
	private int anInt6550;

	@OriginalMember(owner = "client!ml", name = "kb", descriptor = "I")
	public int anInt6546;

	@OriginalMember(owner = "client!ml", name = "td", descriptor = "I")
	private int anInt6552;

	@OriginalMember(owner = "client!ml", name = "rh", descriptor = "[F")
	private final float[] aFloatArray55;

	@OriginalMember(owner = "client!ml", name = "ye", descriptor = "[F")
	private final float[] aFloatArray52;

	@OriginalMember(owner = "client!ml", name = "fg", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!ml", name = "lc", descriptor = "I")
	public int anInt6548;

	@OriginalMember(owner = "client!ml", name = "Lb", descriptor = "I")
	public int anInt6567;

	@OriginalMember(owner = "client!ml", name = "Mf", descriptor = "I")
	private int anInt6568;

	@OriginalMember(owner = "client!ml", name = "Of", descriptor = "I")
	public int anInt6564;

	@OriginalMember(owner = "client!ml", name = "Zb", descriptor = "I")
	public int anInt6554;

	@OriginalMember(owner = "client!ml", name = "ke", descriptor = "I")
	public int anInt6556;

	@OriginalMember(owner = "client!ml", name = "Bd", descriptor = "F")
	private float aFloat130;

	@OriginalMember(owner = "client!ml", name = "Dd", descriptor = "I")
	public int anInt6573;

	@OriginalMember(owner = "client!ml", name = "Fg", descriptor = "I")
	private int anInt6562;

	@OriginalMember(owner = "client!ml", name = "Ch", descriptor = "[Lclient!ta;")
	private final Class6_Sub10[] aClass6_Sub10Array4;

	@OriginalMember(owner = "client!ml", name = "X", descriptor = "[F")
	private final float[] aFloatArray53;

	@OriginalMember(owner = "client!ml", name = "nc", descriptor = "I")
	public int anInt6570;

	@OriginalMember(owner = "client!ml", name = "Ef", descriptor = "I")
	private int anInt6560;

	@OriginalMember(owner = "client!ml", name = "Kd", descriptor = "Lclient!fca;")
	public Class6_Sub15_Sub2 aClass6_Sub15_Sub2_2;

	@OriginalMember(owner = "client!ml", name = "uc", descriptor = "[I")
	public int[] anIntArray371;

	@OriginalMember(owner = "client!ml", name = "yb", descriptor = "[I")
	public int[] anIntArray373;

	@OriginalMember(owner = "client!ml", name = "nh", descriptor = "[I")
	public int[] anIntArray372;

	@OriginalMember(owner = "client!ml", name = "Sg", descriptor = "[B")
	public final byte[] aByteArray57;

	@OriginalMember(owner = "client!ml", name = "Ie", descriptor = "I")
	public final int anInt6527;

	@OriginalMember(owner = "client!ml", name = "Tf", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas7;

	@OriginalMember(owner = "client!ml", name = "Rc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!ml", name = "Hg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!ml", name = "Vf", descriptor = "J")
	private final long aLong219;

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "J")
	private long aLong218;

	@OriginalMember(owner = "client!ml", name = "jf", descriptor = "I")
	public final int anInt6551;

	@OriginalMember(owner = "client!ml", name = "pc", descriptor = "Z")
	private boolean aBoolean475;

	@OriginalMember(owner = "client!ml", name = "Wd", descriptor = "Z")
	public boolean aBoolean496;

	@OriginalMember(owner = "client!ml", name = "Wg", descriptor = "Z")
	public boolean aBoolean471;

	@OriginalMember(owner = "client!ml", name = "Zg", descriptor = "Z")
	public boolean aBoolean492;

	@OriginalMember(owner = "client!ml", name = "kh", descriptor = "Z")
	public boolean aBoolean484;

	@OriginalMember(owner = "client!ml", name = "Hd", descriptor = "Z")
	private boolean aBoolean470;

	@OriginalMember(owner = "client!ml", name = "zc", descriptor = "Z")
	public boolean aBoolean473;

	@OriginalMember(owner = "client!ml", name = "Ig", descriptor = "Z")
	private final boolean aBoolean491;

	@OriginalMember(owner = "client!ml", name = "Af", descriptor = "Lclient!gk;")
	private final Class138 aClass138_1;

	@OriginalMember(owner = "client!ml", name = "vh", descriptor = "Lclient!bk;")
	public final Class41 aClass41_1;

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "Lclient!tq;")
	private final Class349 aClass349_1;

	@OriginalMember(owner = "client!ml", name = "Kb", descriptor = "Lclient!tt;")
	private Class6_Sub12_Sub1 aClass6_Sub12_Sub1_1;

	@OriginalMember(owner = "client!ml", name = "qf", descriptor = "Lclient!jda;")
	private final Class185 aClass185_1;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class75_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class82();
		new Class74(16);
		this.aClass340_44 = new Class340();
		this.aClass340_45 = new Class340();
		this.aClass340_46 = new Class340();
		this.aClass340_47 = new Class340();
		this.aClass340_48 = new Class340();
		this.aClass340_49 = new Class340();
		this.aClass340_50 = new Class340();
		this.aClass109_Sub2_3 = new Class109_Sub2();
		this.aClass109_Sub2_4 = new Class109_Sub2();
		this.aClass109_Sub2_5 = new Class109_Sub2();
		this.aFloat112 = -1.0F;
		this.anInt6542 = 512;
		this.aFloatArray51 = new float[4];
		this.aBoolean476 = true;
		this.aFloat115 = -1.0F;
		this.aFloat117 = 3584.0F;
		this.aFloat128 = 1.0F;
		this.anInt6547 = -1;
		this.aFloat125 = 3584.0F;
		this.anInt6549 = 0;
		this.aFloat122 = -1.0F;
		this.aFloat116 = 0.0F;
		this.anInt6559 = 0;
		this.anInt6553 = -1;
		this.aFloatArray54 = new float[4];
		this.anInt6545 = 0;
		this.aFloat123 = 1.0F;
		this.anInt6566 = 0;
		this.aFloat120 = 1.0F;
		this.aFloat114 = 1.0F;
		this.aBoolean485 = false;
		this.anInt6569 = 8448;
		this.anInt6550 = 0;
		this.anInt6546 = 0;
		this.anInt6552 = 0;
		this.aFloatArray55 = new float[16];
		this.aFloatArray52 = new float[4];
		this.aFloat131 = -1.0F;
		this.anInt6548 = 50;
		this.anInt6567 = 512;
		this.anInt6568 = 8448;
		this.anInt6564 = 0;
		this.anInt6554 = -1;
		this.anInt6556 = 0;
		this.aFloat130 = 1.0F;
		this.anInt6573 = -1;
		this.anInt6562 = 0;
		this.aClass6_Sub10Array4 = new Class6_Sub10[Static525.anInt8619];
		this.aFloatArray53 = new float[4];
		this.anInt6570 = -1;
		this.anInt6560 = 3584;
		this.aClass6_Sub15_Sub2_2 = new Class6_Sub15_Sub2(8192);
		this.anIntArray371 = new int[1];
		this.anIntArray373 = new int[1];
		this.anIntArray372 = new int[1];
		this.aByteArray57 = new byte[16384];
		this.anInt6527 = arg2;
		this.aCanvas8 = this.aCanvas7 = arg0;
		if (!Static34.method446("jaclib")) {
			throw new RuntimeException("");
		} else if (Static34.method446("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong218 = this.aLong219 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt6527);
				if (this.aLong219 == 0L) {
					throw new RuntimeException("");
				}
				this.method5785();
				@Pc(339) int local339 = this.method5764();
				if (local339 != 0) {
					throw new RuntimeException("");
				}
				this.anInt6551 = this.aBoolean480 ? 33639 : 5121;
				if (this.aString79.indexOf("radeon") != -1) {
					@Pc(367) int local367 = 0;
					@Pc(369) boolean local369 = false;
					@Pc(371) boolean local371 = false;
					@Pc(380) String[] local380 = Static26.method332(' ', this.aString79.replace('/', ' '));
					for (@Pc(382) int local382 = 0; local382 < local380.length; local382++) {
						@Pc(388) String local388 = local380[local382];
						try {
							if (local388.length() > 0) {
								if (local388.charAt(0) == 'x' && local388.length() >= 3 && Static298.method4815(local388.substring(1, 3))) {
									local388 = local388.substring(1);
									local371 = true;
								}
								if (local388.equals("hd")) {
									local369 = true;
								} else {
									if (local388.startsWith("hd")) {
										local388 = local388.substring(2);
										local369 = true;
									}
									if (local388.length() >= 4 && Static298.method4815(local388.substring(0, 4))) {
										local367 = Static543.method7715(local388.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(472) Exception local472) {
						}
					}
					if (!local371 && !local369) {
						if (local367 >= 7000 && local367 <= 7999) {
							this.aBoolean475 = false;
						}
						if (local367 >= 7000 && local367 <= 9250) {
							this.aBoolean496 = false;
						}
					}
					if (!local369 || local367 < 4000) {
						this.aBoolean471 = false;
					}
					this.aBoolean492 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean484 = true;
					this.aBoolean470 = this.aBoolean475;
				}
				if (this.aString78.indexOf("intel") != -1) {
					this.aBoolean473 = false;
				}
				this.aBoolean491 = !this.aString78.equals("s3 graphics");
				if (this.aBoolean475) {
					try {
						@Pc(581) int[] local581 = new int[1];
						OpenGL.glGenBuffersARB(1, local581, 0);
					} catch (@Pc(587) Throwable local587) {
						throw new RuntimeException("");
					}
				}
				Static529.method7605(true, false);
				this.aBoolean465 = true;
				this.aClass138_1 = new Class138(this, super.anInterface11_10);
				this.method5844();
				this.aClass41_1 = new Class41(this);
				this.aClass349_1 = new Class349(this);
				if (this.aClass349_1.method8251()) {
					this.aClass6_Sub12_Sub1_1 = new Class6_Sub12_Sub1(this);
					if (!this.aClass6_Sub12_Sub1_1.method8276()) {
						this.aClass6_Sub12_Sub1_1.method8266();
						this.aClass6_Sub12_Sub1_1 = null;
					}
				}
				this.aClass185_1 = new Class185(this);
				this.method5836();
				this.method5797();
				this.method6717();
			} catch (@Pc(665) Throwable local665) {
				local665.printStackTrace();
				this.method6667();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V")
	@Override
	public void method6650(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ml", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg0 * this.aClass109_Sub2_3.aFloat74 + this.aClass109_Sub2_3.aFloat83 * (float) arg1 + (float) arg2 * this.aClass109_Sub2_3.aFloat75 + this.aClass109_Sub2_3.aFloat72;
		if (local28 < (float) this.anInt6548 || local28 > (float) this.anInt6560) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(88) int local88 = (int) ((float) this.anInt6542 * ((float) arg2 * this.aClass109_Sub2_3.aFloat82 + this.aClass109_Sub2_3.aFloat78 * (float) arg0 + (float) arg1 * this.aClass109_Sub2_3.aFloat77 + this.aClass109_Sub2_3.aFloat73) / local28);
		@Pc(120) int local120 = (int) (((float) arg2 * this.aClass109_Sub2_3.aFloat76 + (float) arg0 * this.aClass109_Sub2_3.aFloat79 + (float) arg1 * this.aClass109_Sub2_3.aFloat80 + this.aClass109_Sub2_3.aFloat81) * (float) this.anInt6567 / local28);
		if ((float) local88 >= this.aFloat113 && this.aFloat124 >= (float) local88 && (float) local120 >= this.aFloat127 && this.aFloat126 >= (float) local120) {
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local88 - this.aFloat113);
			arg3[1] = (int) ((float) local120 - this.aFloat127);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method6671(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class6_Sub6 local19;
		while (!this.aClass340_45.method8121()) {
			local19 = (Class6_Sub6) this.aClass340_45.method8127();
			Static633.anIntArray517[local11++] = (int) local19.aLong346;
			this.anInt6537 -= local19.anInt482;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static633.anIntArray517, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static633.anIntArray517, 0);
			local11 = 0;
		}
		while (!this.aClass340_46.method8121()) {
			local19 = (Class6_Sub6) this.aClass340_46.method8127();
			Static633.anIntArray517[local11++] = (int) local19.aLong346;
			this.anInt6536 -= local19.anInt482;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static633.anIntArray517, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static633.anIntArray517, 0);
			local11 = 0;
		}
		while (!this.aClass340_47.method8121()) {
			local19 = (Class6_Sub6) this.aClass340_47.method8127();
			Static633.anIntArray517[local11++] = local19.anInt482;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static633.anIntArray517, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static633.anIntArray517, 0);
			local11 = 0;
		}
		while (!this.aClass340_48.method8121()) {
			local19 = (Class6_Sub6) this.aClass340_48.method8127();
			Static633.anIntArray517[local11++] = (int) local19.aLong346;
			this.anInt6538 -= local19.anInt482;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static633.anIntArray517, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static633.anIntArray517, 0);
		}
		while (!this.aClass340_44.method8121()) {
			local19 = (Class6_Sub6) this.aClass340_44.method8127();
			OpenGL.glDeleteLists((int) local19.aLong346, local19.anInt482);
		}
		@Pc(223) Class6 local223;
		while (!this.aClass340_49.method8121()) {
			local223 = this.aClass340_49.method8127();
			OpenGL.glDeleteProgramARB((int) local223.aLong346);
		}
		while (!this.aClass340_50.method8121()) {
			local223 = this.aClass340_50.method8127();
			OpenGL.glDeleteObjectARB(local223.aLong346);
		}
		while (!this.aClass340_44.method8121()) {
			local19 = (Class6_Sub6) this.aClass340_44.method8127();
			OpenGL.glDeleteLists((int) local19.aLong346, local19.anInt482);
		}
		this.aClass138_1.method3710();
		if (this.E() > 100663296 && this.aLong220 + 60000L < Static549.method7758()) {
			System.gc();
			this.aLong220 = Static549.method7758();
		}
		this.anInt6532 = local9;
	}

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "()Z")
	@Override
	public boolean method6658() {
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "()Z")
	@Override
	public boolean method6680() {
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "()V")
	@Override
	public void method6642() {
		this.aClass349_1.method8247();
	}

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "()Z")
	@Override
	public boolean method6693() {
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(49) float local49;
		@Pc(61) float local61;
		if (this.aClass44_Sub1_Sub1_3 == null || this.aClass44_Sub1_Sub1_3.anInt3719 < arg2 || arg3 > this.aClass44_Sub1_Sub1_3.anInt3716) {
			this.aClass44_Sub1_Sub1_3 = Static352.method5393(arg3, arg6, this, arg2);
			this.aClass44_Sub1_Sub1_3.method3476(false, false);
			local49 = this.aClass44_Sub1_Sub1_3.aFloat69;
			local61 = this.aClass44_Sub1_Sub1_3.aFloat68;
		} else {
			this.aClass44_Sub1_Sub1_3.method3475(arg6, 6406, arg2, false, arg3);
			local49 = this.aClass44_Sub1_Sub1_3.aFloat69 * (float) arg3 / (float) this.aClass44_Sub1_Sub1_3.anInt3716;
			local61 = this.aClass44_Sub1_Sub1_3.aFloat68 * (float) arg2 / (float) this.aClass44_Sub1_Sub1_3.anInt3719;
		}
		this.method5776();
		this.method5774(this.aClass44_Sub1_Sub1_3);
		this.method5826(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5794(arg5);
		this.method5784(34165, 34165);
		this.method5825(768, 0, 34166);
		this.method5825(770, 2, 5890);
		this.method5806(0, 34166);
		this.method5806(2, 5890);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = (float) arg2 + local151;
		OpenGL.glBegin(7);
		@Pc(166) float local166 = (float) arg3 + local154;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local61);
		OpenGL.glVertex2f(local151, local166);
		OpenGL.glTexCoord2f(local49, local61);
		OpenGL.glVertex2f(local159, local166);
		OpenGL.glTexCoord2f(local49, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method5825(768, 0, 5890);
		this.method5825(770, 2, 34166);
		this.method5806(0, 5890);
		this.method5806(2, 34166);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!rha;IIII)Lclient!ka;")
	@Override
	public Class54 method6688(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class54_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!cu;Z)Lclient!tb;")
	@Override
	public Class49 method6714(@OriginalArg(0) Class64 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt1297 * arg0.anInt1300];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray11 == null) {
			for (local21 = 0; local21 < arg0.anInt1297; local21++) {
				for (local25 = 0; local25 < arg0.anInt1300; local25++) {
					@Pc(87) int local87 = arg0.anIntArray82[arg0.aByteArray12[local14++] & 0xFF];
					local12[local16++] = local87 == 0 ? 0 : local87 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt1297; local21++) {
				for (local25 = 0; local25 < arg0.anInt1300; local25++) {
					local12[local16++] = arg0.anIntArray82[arg0.aByteArray12[local14] & 0xFF] | arg0.aByteArray11[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(131) Class49 local131 = this.method6692(arg0.anInt1297, arg0.anInt1300, local12, arg0.anInt1300);
		local131.method8989(arg0.anInt1302, arg0.anInt1301, arg0.anInt1298, arg0.anInt1299);
		return local131;
	}

	@OriginalMember(owner = "client!ml", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt6559, this.anInt6546, this.anInt6542, this.anInt6567 };
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IJ)V")
	public synchronized void method5763(@OriginalArg(1) long arg0) {
		@Pc(15) Class6 local15 = new Class6();
		local15.aLong346 = arg0;
		this.aClass340_50.method8131(local15);
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public Class6_Sub18 method6702(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub18_Sub2 local8 = new Class6_Sub18_Sub2(arg0);
		this.aClass340_43.method8131(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "(B)I")
	private int method5764() {
		@Pc(5) int local5 = 0;
		this.aString78 = OpenGL.glGetString(7936).toLowerCase();
		this.aString79 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString78.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString78.indexOf("brian paul") != -1 || this.aString78.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(53) String local53 = OpenGL.glGetString(7938);
		@Pc(63) String[] local63 = Static26.method332(' ', local53.replace('.', ' '));
		if (local63.length >= 2) {
			try {
				@Pc(75) int local75 = Static543.method7715(local63[0]);
				@Pc(81) int local81 = Static543.method7715(local63[1]);
				this.anInt6563 = local81 + local75 * 10;
			} catch (@Pc(90) NumberFormatException local90) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt6563 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(135) int[] local135 = new int[1];
		OpenGL.glGetIntegerv(34018, local135, 0);
		this.anInt6574 = local135[0];
		OpenGL.glGetIntegerv(34929, local135, 0);
		this.anInt6558 = local135[0];
		OpenGL.glGetIntegerv(34930, local135, 0);
		this.anInt6571 = local135[0];
		if (this.anInt6574 < 2 || this.anInt6558 < 2 || this.anInt6571 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean480 = Stream.b();
		this.aBoolean472 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean475 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean478 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean486 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean493 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean494 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean496 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean492 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean483 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean471 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean495 = false;
		this.aBoolean473 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean481 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean477 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean489 = this.aBoolean477 & this.aBoolean481;
		this.aBoolean490 = Class278.aString85.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static89.aFloatArray5, 0);
		this.aFloat122 = Static89.aFloatArray5[0];
		this.aFloat112 = Static89.aFloatArray5[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	private void method5765() {
		if (this.anInt6561 != 2) {
			this.anInt6561 = 2;
			this.method5839();
			this.method5845();
			this.anInt6539 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6657(@OriginalArg(0) Canvas arg0) {
		this.aLong218 = 0L;
		this.aCanvas8 = null;
		if (arg0 == null || this.aCanvas7 == arg0) {
			this.aCanvas8 = this.aCanvas7;
			this.aLong218 = this.aLong219;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(42) Long local42 = (Long) this.aHashtable6.get(arg0);
			this.aLong218 = local42;
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.aLong218 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong218);
		this.method5797();
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6548 == arg0 && this.anInt6560 == arg1) {
			return;
		}
		this.anInt6560 = arg1;
		this.anInt6548 = arg0;
		this.method5835();
		this.method5822();
		if (this.anInt6561 == 3) {
			this.method5843();
		} else if (this.anInt6561 == 2) {
			this.method5839();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!aq;I)V")
	public void method5766(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt6533 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6533 >= 0) {
			this.anInterface3Array3[this.anInt6533].method3874();
		}
		this.anInterface3_1 = this.anInterface3Array3[++this.anInt6533] = arg0;
		this.anInterface3_1.method3873();
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "()V")
	@Override
	public void method6717() {
		if (!this.aBoolean491 || this.anInt6517 <= 0 || this.anInt6525 <= 0) {
			return;
		}
		@Pc(21) int local21 = this.anInt6550;
		@Pc(24) int local24 = this.anInt6562;
		@Pc(27) int local27 = this.anInt6545;
		@Pc(30) int local30 = this.anInt6566;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5772();
		this.method5829(false);
		this.method5840(false);
		this.method5796(false);
		this.method5788(false);
		this.method5774((Class44) null);
		this.method5781(-2);
		this.method5787(1);
		this.method5826(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt6517, this.anInt6525, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local21, local27, local24, local30);
	}

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "()Z")
	@Override
	public boolean method6640() {
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass109_Sub2_3.aFloat72 + this.aClass109_Sub2_3.aFloat83 * (float) arg1 + (float) arg0 * this.aClass109_Sub2_3.aFloat74 + this.aClass109_Sub2_3.aFloat75 * (float) arg2;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass109_Sub2_3.aFloat75 * (float) arg5 + this.aClass109_Sub2_3.aFloat74 * (float) arg3 + (float) arg4 * this.aClass109_Sub2_3.aFloat83 + this.aClass109_Sub2_3.aFloat72;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt6548 > local32 && local63 < (float) this.anInt6548) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt6560 && local63 > (float) this.anInt6560) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) ((float) this.anInt6542 * (this.aClass109_Sub2_3.aFloat82 * (float) arg2 + (float) arg1 * this.aClass109_Sub2_3.aFloat77 + this.aClass109_Sub2_3.aFloat78 * (float) arg0 + this.aClass109_Sub2_3.aFloat73) / local32);
		@Pc(173) int local173 = (int) ((this.aClass109_Sub2_3.aFloat73 + (float) arg5 * this.aClass109_Sub2_3.aFloat82 + this.aClass109_Sub2_3.aFloat78 * (float) arg3 + this.aClass109_Sub2_3.aFloat77 * (float) arg4) * (float) this.anInt6542 / local63);
		if ((float) local141 < this.aFloat113 && (float) local173 < this.aFloat113) {
			local7 |= 0x1;
		} else if ((float) local141 > this.aFloat124 && (float) local173 > this.aFloat124) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) ((float) this.anInt6567 * ((float) arg0 * this.aClass109_Sub2_3.aFloat79 + this.aClass109_Sub2_3.aFloat80 * (float) arg1 + (float) arg2 * this.aClass109_Sub2_3.aFloat76 + this.aClass109_Sub2_3.aFloat81) / local32);
		@Pc(277) int local277 = (int) ((float) this.anInt6567 * (this.aClass109_Sub2_3.aFloat81 + (float) arg5 * this.aClass109_Sub2_3.aFloat76 + this.aClass109_Sub2_3.aFloat79 * (float) arg3 + this.aClass109_Sub2_3.aFloat80 * (float) arg4) / local63);
		if ((float) local245 < this.aFloat127 && (float) local277 < this.aFloat127) {
			local7 |= 0x4;
		} else if ((float) local245 > this.aFloat126 && (float) local277 > this.aFloat126) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "(II)Lclient!bha;")
	@Override
	public Interface5 method6674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass349_1.method8250(arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "()V")
	@Override
	public void method6645() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([IIIIIZ)Lclient!tb;")
	@Override
	public Class49 method6675(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class49_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZIZ[B)Lclient!bda;")
	public Interface4 method5768(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface4) (this.aBoolean475 && (!arg1 || this.aBoolean470) ? new Class63_Sub2(this, 5123, arg2, arg0, arg1) : new Class59_Sub1(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!ml", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6550;
		arg0[3] = this.anInt6566;
		arg0[1] = this.anInt6545;
		arg0[2] = this.anInt6562;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "()Z")
	@Override
	public boolean method6644() {
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "()V")
	@Override
	protected void method6667() {
		for (@Pc(6) Class6 local6 = this.aClass340_43.method8124(); local6 != null; local6 = this.aClass340_43.method8134()) {
			((Class6_Sub18_Sub2) local6).method8796();
		}
		if (this.aClass349_1 != null) {
			this.aClass349_1.method8253();
		}
		if (this.anOpenGL2 != null) {
			this.method5778();
			@Pc(48) Enumeration local48 = this.aHashtable6.keys();
			while (local48.hasMoreElements()) {
				@Pc(56) Canvas local56 = (Canvas) local48.nextElement();
				@Pc(62) Long local62 = (Long) this.aHashtable6.get(local56);
				this.anOpenGL2.releaseSurface(local56, local62);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean465) {
			Static217.method3969(false, true);
			this.aBoolean465 = false;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!aq;)V")
	public void method5769(@OriginalArg(1) Interface3 arg0) {
		if (this.aBoolean481) {
			this.method5831(arg0);
			this.method5766(arg0);
		} else if (this.anInt6535 < 3) {
			if (this.anInt6535 >= 0) {
				this.anInterface3Array1[this.anInt6535].method3871();
			}
			this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array1[++this.anInt6535] = arg0;
			this.anInterface3_2.method3875();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ml", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt6536 + this.anInt6537 + this.anInt6538;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(II)Lclient!kb;")
	@Override
	public Interface14 method6683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(B)V")
	private void method5770() {
		OpenGL.glViewport(this.anInt6549, this.anInt6552, this.anInt6517, this.anInt6525);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(IIIIII)Lclient!sn;")
	@Override
	public Class81 method6659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean483 ? new Class81_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ml", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < this.anInt6562) {
			this.anInt6562 = arg2;
		}
		if (arg3 < this.anInt6566) {
			this.anInt6566 = arg3;
		}
		if (arg0 > this.anInt6550) {
			this.anInt6550 = arg0;
		}
		if (arg1 > this.anInt6545) {
			this.anInt6545 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method5827();
		this.method5823();
	}

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass109_Sub2_3.aFloat72 + (float) arg2 * this.aClass109_Sub2_3.aFloat75 + this.aClass109_Sub2_3.aFloat74 * (float) arg0 + this.aClass109_Sub2_3.aFloat83 * (float) arg1;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(78) int local78 = (int) (((float) arg1 * this.aClass109_Sub2_3.aFloat77 + (float) arg0 * this.aClass109_Sub2_3.aFloat78 + (float) arg2 * this.aClass109_Sub2_3.aFloat82 + this.aClass109_Sub2_3.aFloat73) * (float) this.anInt6542 / local28);
		@Pc(110) int local110 = (int) ((float) this.anInt6567 * (this.aClass109_Sub2_3.aFloat80 * (float) arg1 + this.aClass109_Sub2_3.aFloat79 * (float) arg0 + (float) arg2 * this.aClass109_Sub2_3.aFloat76 + this.aClass109_Sub2_3.aFloat81) / local28);
		arg3[0] = (int) ((float) local78 - this.aFloat113);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local110 - this.aFloat127);
	}

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "()Z")
	@Override
	public boolean method6705() {
		return this.aClass6_Sub12_Sub1_1 != null && this.aClass6_Sub12_Sub1_1.method8270();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	@Override
	public void method6696(@OriginalArg(0) int arg0) {
		this.method5785();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(FFBF)V")
	private void method5771(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean482) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg1, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean482 = true;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6660(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static621.aFloat196 = arg0;
		Static410.aFloat136 = arg1;
		Static62.aFloat3 = arg2;
	}

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "(B)V")
	public void method5772() {
		if (this.anInt6561 != 0) {
			this.anInt6561 = 0;
			this.anInt6539 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBIZLclient!jaclib/memory/Buffer;)Lclient!aj;")
	public Interface2 method5773(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Buffer arg2) {
		return (Interface2) (this.aBoolean475 && (this.aBoolean470 || true) ? new Class63_Sub1(this, arg1, arg2, arg0, false) : new Class59_Sub2(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!ml", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt6531 = 0;
		while (arg0 > 1) {
			this.anInt6531++;
			arg0 >>= 0x1;
		}
		this.anInt6530 = 0x1 << this.anInt6531;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!ica;)V")
	public void method5774(@OriginalArg(1) Class44 arg0) {
		@Pc(11) Class44 local11 = this.aClass44Array1[this.anInt6544];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt10474);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt10474);
				} else if (local11.anInt10474 != arg0.anInt10474) {
					OpenGL.glDisable(local11.anInt10474);
					OpenGL.glEnable(arg0.anInt10474);
				}
				OpenGL.glBindTexture(arg0.anInt10474, arg0.method9009());
			}
			this.aClass44Array1[this.anInt6544] = arg0;
		}
		this.anInt6539 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)V")
	public void method5775(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt6544) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt6544 = arg0;
		}
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method6707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5828();
		this.method5826(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(24) float local24 = (float) -arg1 + (float) arg3;
		if (local17 == 0.0F && local24 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(51) float local51 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local24 * local24)));
			local24 *= local51;
			local17 *= local51;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local17 + 0.35F, local24 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "(B)V")
	public void method5776() {
		if (this.anInt6539 == 2) {
			return;
		}
		this.method5798();
		this.method5829(false);
		this.method5840(false);
		this.method5796(false);
		this.method5788(false);
		this.method5781(-2);
		this.anInt6539 = 2;
	}

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "(I)V")
	public void method5777() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray51, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray53, 0);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)V")
	private void method5778() {
		this.anOpenGL2.a();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIII)V")
	public void method5779(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "(I)V")
	private void method5780() {
		if (this.anInt6561 != 3) {
			this.anInt6561 = 3;
			this.method5843();
			this.method5845();
			this.anInt6539 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "(II)V")
	public void method5781(@OriginalArg(1) int arg0) {
		this.method5841(true, arg0);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(III)V")
	public synchronized void method5782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class6_Sub6 local16 = new Class6_Sub6(arg0);
		local16.aLong346 = (long) arg1;
		this.aClass340_46.method8131(local16);
	}

	@OriginalMember(owner = "client!ml", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean487) {
			throw new RuntimeException("");
		}
		this.anInt6573 = arg2;
		this.lb = arg0;
		this.anInt6556 = arg3;
		this.anInt6570 = arg1;
		if (this.aBoolean485) {
			this.aClass185_1.aClass69_Sub4_1.method3131();
			this.aClass185_1.aClass69_Sub4_1.method3132();
		}
	}

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "(B)V")
	private void method5783() {
		Static89.aFloatArray5[0] = this.aFloat132 * this.aFloat123;
		Static89.aFloatArray5[1] = this.aFloat128 * this.aFloat132;
		Static89.aFloatArray5[2] = this.aFloat132 * this.aFloat114;
		Static89.aFloatArray5[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static89.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)V")
	public void method5784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6544 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(8) boolean local8 = false;
		if (arg1 != this.anInt6569) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local8 = true;
			this.anInt6569 = arg1;
		}
		if (this.anInt6568 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			this.anInt6568 = arg0;
			local8 = true;
		}
		if (local8) {
			this.anInt6539 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "(I)V")
	private void method5785() {
		@Pc(14) int local14 = 0;
		while (!this.anOpenGL2.b()) {
			if (local14++ > 5) {
				throw new RuntimeException("");
			}
			Static255.method4444(1000L);
		}
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)V")
	@Override
	public void method6637(@OriginalArg(0) int arg0) {
		this.method5778();
	}

	@OriginalMember(owner = "client!ml", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(12) boolean local12 = arg0 != this.anInt6547;
		if (local12 || this.aFloat131 != arg1 || arg2 != this.aFloat115) {
			this.anInt6547 = arg0;
			this.aFloat131 = arg1;
			this.aFloat115 = arg2;
			if (local12) {
				this.aFloat128 = (float) (this.anInt6547 & 0xFF00) / 65280.0F;
				this.aFloat114 = (float) (this.anInt6547 & 0xFF) / 255.0F;
				this.aFloat123 = (float) (this.anInt6547 & 0xFF0000) / 1.671168E7F;
				this.method5783();
			}
			this.method5810();
		}
		if (arg3 == this.aFloatArray52[0] && this.aFloatArray52[1] == arg4 && this.aFloatArray52[2] == arg5) {
			return;
		}
		this.aFloatArray52[0] = arg3;
		this.aFloatArray52[2] = arg5;
		this.aFloatArray52[1] = arg4;
		this.aFloatArray54[2] = -arg5;
		this.aFloatArray54[1] = -arg4;
		this.aFloatArray54[0] = -arg3;
		@Pc(151) float local151 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray51[0] = local151 * arg3;
		this.aFloatArray51[1] = arg4 * local151;
		this.aFloatArray51[2] = arg5 * local151;
		this.aFloatArray53[1] = -this.aFloatArray51[1];
		this.aFloatArray53[2] = -this.aFloatArray51[2];
		this.aFloatArray53[0] = -this.aFloatArray51[0];
		this.method5777();
		this.anInt6557 = (int) (arg5 * 256.0F / arg4);
		this.anInt6572 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ml", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt6560;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BII)V")
	public synchronized void method5786(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class6_Sub6 local16 = new Class6_Sub6(arg0);
		local16.aLong346 = (long) arg1;
		this.aClass340_48.method8131(local16);
	}

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "(II)V")
	public void method5787(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method5784(7681, 7681);
		} else if (arg0 == 0) {
			this.method5784(8448, 8448);
		} else if (arg0 == 2) {
			this.method5784(7681, 34165);
		} else if (arg0 == 3) {
			this.method5784(8448, 260);
			return;
		} else if (arg0 == 4) {
			this.method5784(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZ)V")
	public void method5788(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean469 != arg0) {
			this.aBoolean469 = arg0;
			this.method5813();
			this.anInt6539 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean476 = arg0;
		this.method5813();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(IZ)V")
	public void method5789(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean479 != arg0) {
			this.aBoolean479 = arg0;
			this.method5816();
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(Z)V")
	private void method5790() {
		this.aFloatArray55[10] = this.aFloat118;
		this.aFloatArray55[14] = this.aFloat119;
		this.aFloat125 = (this.aFloatArray55[14] - (float) this.anInt6560) / this.aFloatArray55[10];
		this.aFloat117 = (float) this.anInt6560;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(ILclient!aq;)V")
	public void method5791(@OriginalArg(1) Interface3 arg0) {
		if (this.aBoolean481) {
			this.method5802(arg0);
			this.method5819(arg0);
		} else if (this.anInt6535 >= 0 && arg0 == this.anInterface3Array1[this.anInt6535]) {
			this.anInterface3Array1[this.anInt6535--] = null;
			arg0.method3871();
			if (this.anInt6535 >= 0) {
				this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array1[this.anInt6535];
				this.anInterface3_2.method3875();
			} else {
				this.anInterface3_2 = this.anInterface3_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6708(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas7) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(23) Long local23 = (Long) this.aHashtable6.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local23);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	@Override
	public void method6694(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "()Z")
	@Override
	public boolean method6633() {
		return this.aClass185_1.method4636();
	}

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "(I)V")
	public void method5792() {
		if (this.anInt6539 == 8) {
			return;
		}
		this.method5765();
		this.method5829(true);
		this.method5796(true);
		this.method5788(true);
		this.method5826(1);
		this.anInt6539 = 8;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(IB)I")
	public int method5793(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass109_Sub2_3.aFloat83 * (float) arg1 + (float) arg0 * this.aClass109_Sub2_3.aFloat74 + (float) arg2 * this.aClass109_Sub2_3.aFloat75 + this.aClass109_Sub2_3.aFloat72;
		@Pc(55) float local55 = this.aClass109_Sub2_3.aFloat83 * (float) arg4 + this.aClass109_Sub2_3.aFloat74 * (float) arg3 + (float) arg5 * this.aClass109_Sub2_3.aFloat75 + this.aClass109_Sub2_3.aFloat72;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt6548 && (float) this.anInt6548 > local55) {
			local57 |= 0x10;
		} else if ((float) this.anInt6560 < local30 && (float) this.anInt6560 < local55) {
			local57 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((float) this.anInt6542 * (this.aClass109_Sub2_3.aFloat73 + this.aClass109_Sub2_3.aFloat82 * (float) arg2 + this.aClass109_Sub2_3.aFloat78 * (float) arg0 + (float) arg1 * this.aClass109_Sub2_3.aFloat77) / (float) arg6);
		@Pc(163) int local163 = (int) ((this.aClass109_Sub2_3.aFloat73 + (float) arg5 * this.aClass109_Sub2_3.aFloat82 + this.aClass109_Sub2_3.aFloat77 * (float) arg4 + (float) arg3 * this.aClass109_Sub2_3.aFloat78) * (float) this.anInt6542 / (float) arg6);
		if ((float) local130 < this.aFloat113 && (float) local163 < this.aFloat113) {
			local57 |= 0x1;
		} else if (this.aFloat124 < (float) local130 && (float) local163 > this.aFloat124) {
			local57 |= 0x2;
		}
		@Pc(236) int local236 = (int) (((float) arg2 * this.aClass109_Sub2_3.aFloat76 + this.aClass109_Sub2_3.aFloat79 * (float) arg0 + (float) arg1 * this.aClass109_Sub2_3.aFloat80 + this.aClass109_Sub2_3.aFloat81) * (float) this.anInt6567 / (float) arg6);
		@Pc(269) int local269 = (int) ((this.aClass109_Sub2_3.aFloat79 * (float) arg3 + this.aClass109_Sub2_3.aFloat80 * (float) arg4 + (float) arg5 * this.aClass109_Sub2_3.aFloat76 + this.aClass109_Sub2_3.aFloat81) * (float) this.anInt6567 / (float) arg6);
		if (this.aFloat127 > (float) local236 && this.aFloat127 > (float) local269) {
			local57 |= 0x4;
		} else if (this.aFloat126 < (float) local236 && (float) local269 > this.aFloat126) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V")
	public void method5794(@OriginalArg(1) int arg0) {
		Static89.aFloatArray5[3] = (float) (arg0 >>> 24) / 255.0F;
		Static89.aFloatArray5[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static89.aFloatArray5[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static89.aFloatArray5[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static89.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "(I)V")
	public void method5795() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(ZB)V")
	public void method5796(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean468) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean468 = arg0;
		this.anInt6539 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "(B)V")
	private void method5797() {
		if (this.aCanvas8 == null) {
			this.anInt6445 = this.anInt6490 = 0;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas8.getSize();
			this.anInt6490 = local6.height;
			this.anInt6445 = local6.width;
		}
		if (this.anInterface3_1 == null) {
			this.anInt6517 = this.anInt6445;
			this.anInt6525 = this.anInt6490;
			this.method5770();
		}
		this.method5772();
		this.la();
	}

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "(I)V")
	private void method5798() {
		if (this.anInt6561 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt6517 > 0 && this.anInt6525 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt6517, (double) this.anInt6525, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt6539 &= 0xFFFFFFE7;
		this.anInt6561 = 1;
	}

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "()V")
	@Override
	public void method6663() {
		if (this.aClass6_Sub12_Sub1_1 != null && this.aClass6_Sub12_Sub1_1.method8270()) {
			this.aClass349_1.method8246(this.aClass6_Sub12_Sub1_1);
			this.aClass138_1.method3711();
		}
	}

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "()Z")
	@Override
	public boolean method6704() {
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class96 method6697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class96_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ml", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt6525) {
			arg3 = this.anInt6525;
		}
		if (this.anInt6517 < arg2) {
			arg2 = this.anInt6517;
		}
		this.anInt6566 = arg3;
		this.anInt6545 = arg1;
		this.anInt6562 = arg2;
		this.anInt6550 = arg0;
		OpenGL.glEnable(3089);
		this.method5827();
		this.method5823();
	}

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "(I)V")
	private void method5799() {
		if (this.aBoolean488 && this.anInt6554 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt6548;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!gj;B)V")
	public void method5800(@OriginalArg(0) Class109_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method3695(), 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[Lclient!ta;)V")
	@Override
	public void method6682(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub10[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass6_Sub10Array4[local3] = arg1[local3];
		}
		this.anInt6555 = arg0;
		if (this.anInt6561 != 1) {
			this.method5804();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static621.method8535(arg0, arg1, arg2, arg3, this);
	}

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "()I")
	@Override
	public int method6689() {
		return 4;
	}

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "(II)V")
	public synchronized void method5801(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub6 local8 = new Class6_Sub6(arg0);
		this.aClass340_47.method8131(local8);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!aq;Z)V")
	public void method5802(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt6534 < 0 || this.anInterface3Array2[this.anInt6534] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface3Array2[this.anInt6534--] = null;
		arg0.method3872();
		if (this.anInt6534 < 0) {
			this.anInterface3_2 = null;
		} else {
			this.anInterface3_2 = this.anInterface3Array2[this.anInt6534];
			this.anInterface3_2.method3870();
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)V")
	@Override
	public void method6639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILclient!bda;II)V")
	public void method5803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface4 arg2) {
		@Pc(7) int local7 = arg2.method5018();
		@Pc(14) int local14 = arg0 * this.method5821(local7);
		this.method5814(arg2);
		OpenGL.glDrawElements(4, arg1, local7, (long) local14 + arg2.method5016());
	}

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "(I)V")
	private void method5804() {
		@Pc(15) int local15;
		for (local15 = 0; local15 < this.anInt6555; local15++) {
			@Pc(22) Class6_Sub10 local22 = this.aClass6_Sub10Array4[local15];
			@Pc(26) int local26 = local15 + 16386;
			Static69.aFloatArray2[0] = (float) local22.method8332();
			Static69.aFloatArray2[1] = (float) local22.method8327();
			Static69.aFloatArray2[2] = (float) local22.method8329();
			Static69.aFloatArray2[3] = 1.0F;
			OpenGL.glLightfv(local26, 4611, Static69.aFloatArray2, 0);
			@Pc(62) int local62 = local22.method8328();
			@Pc(68) float local68 = local22.method8334() / 255.0F;
			Static69.aFloatArray2[0] = local68 * (float) (local62 >> 16 & 0xFF);
			Static69.aFloatArray2[1] = (float) (local62 >> 8 & 0xFF) * local68;
			Static69.aFloatArray2[2] = local68 * (float) (local62 & 0xFF);
			OpenGL.glLightfv(local26, 4609, Static69.aFloatArray2, 0);
			OpenGL.glLightf(local26, 4617, 1.0F / (float) (local22.method8331() * local22.method8331()));
			OpenGL.glEnable(local26);
		}
		while (local15 < this.anInt6565) {
			OpenGL.glDisable(local15 + 16386);
			local15++;
		}
		this.anInt6565 = this.anInt6555;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method5828();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method5826(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean478) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean478) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ml", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6556 = arg3;
		this.lb = arg0;
		this.anInt6570 = arg1;
		this.anInt6573 = arg2;
		this.aBoolean487 = true;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "()Z")
	@Override
	public boolean method6666() {
		return this.aClass6_Sub12_Sub1_1 != null && (this.anInt6527 <= 1 || this.aBoolean489);
	}

	@OriginalMember(owner = "client!ml", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5788(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6677() {
		this.method5828();
		this.method5826(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "()V")
	@Override
	public void method6715() {
		if (this.aBoolean473) {
			if (this.anInterface3_1 != this.aClass146_1) {
				throw new RuntimeException();
			}
			this.aClass146_1.method3887(0);
			this.aClass146_1.method3887(8);
			this.method5791(this.aClass146_1);
		} else if (this.aBoolean472) {
			this.aClass49_Sub2_1.method8976(0, 0, this.anInt6517, this.anInt6525, 0, 0);
			this.anOpenGL2.setSurface(this.aLong218);
		} else {
			throw new RuntimeException("");
		}
		this.anInt6525 = this.anInt6490;
		this.anInt6517 = this.anInt6445;
		this.aClass49_Sub2_1 = null;
		this.method5772();
		this.method5770();
		this.la();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBZ[B)Lclient!aj;")
	public Interface2 method5805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface2) (this.aBoolean475 && (!arg2 || this.aBoolean470) ? new Class63_Sub1(this, arg0, arg3, arg1, arg2) : new Class59_Sub2(this, arg0, arg3, arg1));
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "()Z")
	@Override
	public boolean method6664() {
		if (this.aClass6_Sub12_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass6_Sub12_Sub1_1.method8270()) {
			if (!this.aClass349_1.method8249(this.aClass6_Sub12_Sub1_1)) {
				return false;
			}
			this.aClass138_1.method3711();
		}
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBII)V")
	public void method5806(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "(B)Lclient!gfa;")
	public Class44_Sub2 method5807() {
		return this.aClass81_Sub2_1 == null ? null : this.aClass81_Sub2_1.method7366();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IF)V")
	public void method5808(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat120) {
			this.aFloat120 = arg0;
			if (this.anInt6561 == 3) {
				this.method5843();
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method5828();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method5826(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean478) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean478) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!so;Lclient!so;Lclient!so;Lclient!so;)V")
	public void method5809(@OriginalArg(1) Class332 arg0, @OriginalArg(2) Class332 arg1, @OriginalArg(3) Class332 arg2, @OriginalArg(4) Class332 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5832(arg3.anInterface2_6);
			OpenGL.glVertexPointer(arg3.aByte136, arg3.aShort116, this.anInterface2_3.method7560(), this.anInterface2_3.method7557() + (long) arg3.aByte137);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5832(arg2.anInterface2_6);
			OpenGL.glNormalPointer(arg2.aShort116, this.anInterface2_3.method7560(), this.anInterface2_3.method7557() + (long) arg2.aByte137);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5832(arg0.anInterface2_6);
			OpenGL.glColorPointer(arg0.aByte136, arg0.aShort116, this.anInterface2_3.method7560(), this.anInterface2_3.method7557() + (long) arg0.aByte137);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5832(arg1.anInterface2_6);
			OpenGL.glTexCoordPointer(arg1.aByte136, arg1.aShort116, this.anInterface2_3.method7560(), this.anInterface2_3.method7557() + (long) arg1.aByte137);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!bha;Lclient!kb;)Lclient!tha;")
	@Override
	public Interface24 method6641(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Interface14 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!tha;)V")
	@Override
	public void method6665(@OriginalArg(0) Interface24 arg0) {
	}

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "(I)V")
	private void method5810() {
		Static89.aFloatArray5[0] = this.aFloat123 * this.aFloat131;
		Static89.aFloatArray5[2] = this.aFloat131 * this.aFloat114;
		Static89.aFloatArray5[3] = 1.0F;
		Static89.aFloatArray5[1] = this.aFloat128 * this.aFloat131;
		OpenGL.glLightfv(16384, 4609, Static89.aFloatArray5, 0);
		Static89.aFloatArray5[3] = 1.0F;
		Static89.aFloatArray5[0] = -this.aFloat115 * this.aFloat123;
		Static89.aFloatArray5[2] = -this.aFloat115 * this.aFloat114;
		Static89.aFloatArray5[1] = this.aFloat128 * -this.aFloat115;
		OpenGL.glLightfv(16385, 4609, Static89.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "()Lclient!qa;")
	@Override
	public Class109 method6643() {
		return this.aClass109_Sub2_1;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(III)V")
	public void method5811(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6549 = arg1;
		this.anInt6552 = arg0;
		this.method5770();
		this.method5823();
	}

	@OriginalMember(owner = "client!ml", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat132) {
			this.aFloat132 = arg0;
			this.method5783();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6668(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas7 == arg0) {
			local5 = this.aLong219;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable6.get(arg0);
			local5 = local26;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas8 == arg0) {
			this.method5797();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg5;
		@Pc(9) Class44_Sub1_Sub1 local9 = local6.aClass44_Sub1_Sub1_1;
		this.method5776();
		this.method5774(local6.aClass44_Sub1_Sub1_1);
		this.method5826(1);
		this.method5784(8448, 7681);
		this.method5825(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat68 / (float) local9.anInt3730;
		@Pc(46) float local46 = local9.aFloat69 / (float) local9.anInt3729;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(60) float local60 = (float) -arg1 + (float) arg3;
		@Pc(73) float local73 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local60 * local60)));
		@Pc(77) float local77 = local60 * local73;
		@Pc(81) float local81 = local53 * local73;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f(local81 + (float) arg2 + 0.35F, (float) arg3 + local77 + 0.35F);
		OpenGL.glEnd();
		this.method5825(768, 0, 5890);
	}

	@OriginalMember(owner = "client!ml", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6553 == arg0 && arg1 == this.anInt6554 && arg2 == this.anInt6564) {
			return;
		}
		this.anInt6554 = arg1;
		this.anInt6564 = arg2;
		this.anInt6553 = arg0;
		this.method5822();
		this.method5799();
	}

	@OriginalMember(owner = "client!ml", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5828();
		this.method5826(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIZ)Lclient!tb;")
	@Override
	public Class49 method6687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class49_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(B)V")
	public void method5812() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "()Lclient!cba;")
	@Override
	public Class52 method6699() {
		@Pc(7) int local7 = -1;
		if (this.aString78.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString78.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString78.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class52(local7, "OpenGL", this.anInt6563, this.aString79, 0L);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([I)V")
	@Override
	public void method6669(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6517;
		arg0[1] = this.anInt6525;
	}

	@OriginalMember(owner = "client!ml", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt6576;
		this.anInt6576 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "(I)V")
	private void method5813() {
		OpenGL.glDepthMask(this.aBoolean469 && this.aBoolean476);
	}

	@OriginalMember(owner = "client!ml", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method5826(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!bda;I)V")
	public void method5814(@OriginalArg(0) Interface4 arg0) {
		if (arg0 != this.anInterface4_5) {
			if (this.aBoolean475) {
				OpenGL.glBindBufferARB(34963, arg0.method5015());
			}
			this.anInterface4_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "()Z")
	@Override
	public boolean method6676() {
		return this.aBoolean478 && (!this.method6705() || this.aBoolean489);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		this.method5828();
		this.method5826(1);
		@Pc(28) float local28 = (float) arg2 - (float) arg0;
		@Pc(34) float local34 = (float) arg3 - (float) arg1;
		@Pc(47) float local47 = (float) (1.0D / Math.sqrt((double) (local34 * local34 + local28 * local28)));
		@Pc(51) float local51 = local28 * local47;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(72) int local72 = arg7 % (arg6 + arg5);
		@Pc(76) float local76 = local34 * local47;
		@Pc(81) float local81 = (float) arg5 * local51;
		@Pc(86) float local86 = local76 * (float) arg5;
		@Pc(88) float local88 = 0.0F;
		@Pc(90) float local90 = 0.0F;
		@Pc(92) float local92 = local81;
		@Pc(94) float local94 = local86;
		if (local72 > arg5) {
			local90 = (float) (arg6 + arg5 - local72) * local76;
			local88 = local51 * (float) (arg6 + arg5 - local72);
		} else {
			local94 = (float) (arg5 - local72) * local76;
			local92 = local51 * (float) (arg5 - local72);
		}
		@Pc(145) float local145 = (float) arg0 + local88 + 0.35F;
		@Pc(152) float local152 = (float) arg1 + local90 + 0.35F;
		@Pc(157) float local157 = (float) arg6 * local51;
		@Pc(162) float local162 = local76 * (float) arg6;
		while (true) {
			if (arg0 >= arg2) {
				if (local145 < (float) arg2 + 0.35F) {
					break;
				}
				if (local145 + local92 < (float) arg2) {
					local92 = (float) arg2 - local145;
				}
			} else {
				if (local145 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local92 + local145) {
					local92 = (float) arg2 - local145;
				}
			}
			if (arg3 > arg1) {
				if ((float) arg3 + 0.35F < local152) {
					break;
				}
				if ((float) arg3 < local94 + local152) {
					local94 = (float) arg3 - local152;
				}
			} else {
				if ((float) arg3 + 0.35F > local152) {
					break;
				}
				if ((float) arg3 > local152 + local94) {
					local94 = (float) arg3 - local152;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local145, local152);
			OpenGL.glVertex2f(local145 + local92, local152 + local94);
			local145 += local157 + local92;
			local152 += local162 + local94;
			OpenGL.glEnd();
			local94 = local86;
			local92 = local81;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!cd;[Lclient!cu;Z)Lclient!da;")
	@Override
	public Class67 method6649(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class64[] arg1) {
		return new Class67_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ml", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt6562 = this.anInt6517;
		this.anInt6566 = this.anInt6525;
		this.anInt6545 = 0;
		this.anInt6550 = 0;
		OpenGL.glDisable(3089);
		this.method5827();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZFFFF)V")
	public void method5815(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static89.aFloatArray5[0] = arg2;
		Static89.aFloatArray5[1] = arg0;
		Static89.aFloatArray5[3] = arg1;
		Static89.aFloatArray5[2] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static89.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6698(@OriginalArg(0) Class6_Sub18 arg0) {
		this.aNativeHeap4 = ((Class6_Sub18_Sub2) arg0).aNativeHeap6;
		if (this.anInterface2_4 != null) {
			return;
		}
		@Pc(16) Class6_Sub15_Sub2 local16 = new Class6_Sub15_Sub2(80);
		if (this.aBoolean480) {
			local16.method3052(-1.0F);
			local16.method3052(-1.0F);
			local16.method3052(0.0F);
			local16.method3052(0.0F);
			local16.method3052(1.0F);
			local16.method3052(1.0F);
			local16.method3052(-1.0F);
			local16.method3052(0.0F);
			local16.method3052(1.0F);
			local16.method3052(1.0F);
			local16.method3052(1.0F);
			local16.method3052(1.0F);
			local16.method3052(0.0F);
			local16.method3052(1.0F);
			local16.method3052(0.0F);
			local16.method3052(-1.0F);
			local16.method3052(1.0F);
			local16.method3052(0.0F);
			local16.method3052(0.0F);
			local16.method3052(0.0F);
		} else {
			local16.method3055(-1.0F);
			local16.method3055(-1.0F);
			local16.method3055(0.0F);
			local16.method3055(0.0F);
			local16.method3055(1.0F);
			local16.method3055(1.0F);
			local16.method3055(-1.0F);
			local16.method3055(0.0F);
			local16.method3055(1.0F);
			local16.method3055(1.0F);
			local16.method3055(1.0F);
			local16.method3055(1.0F);
			local16.method3055(0.0F);
			local16.method3055(1.0F);
			local16.method3055(0.0F);
			local16.method3055(-1.0F);
			local16.method3055(1.0F);
			local16.method3055(0.0F);
			local16.method3055(0.0F);
			local16.method3055(0.0F);
		}
		this.anInterface2_4 = this.method5805(20, local16.anInt3174, false, local16.aByteArray20);
		this.aClass332_9 = new Class332(this.anInterface2_4, 5126, 3, 0);
		this.aClass332_8 = new Class332(this.anInterface2_4, 5126, 2, 12);
		this.aClass366_1.method8565(this);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
	@Override
	public void method6706(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt6526 = arg0;
		this.aClass138_1.method3711();
	}

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "(I)V")
	private void method5816() {
		if (this.aBoolean474 && !this.aBoolean479) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ml", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6546 = arg1;
		this.anInt6567 = arg3;
		this.anInt6559 = arg0;
		this.anInt6542 = arg2;
		this.method5835();
		this.method5827();
		if (this.anInt6561 == 3) {
			this.method5843();
		} else if (this.anInt6561 == 2) {
			this.method5839();
		}
	}

	@OriginalMember(owner = "client!ml", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt6550 > arg2 + arg0 || arg0 - arg2 > this.anInt6562 || this.anInt6545 > arg1 + arg2 || arg1 - arg2 > this.anInt6566) {
			return;
		}
		this.method5828();
		this.method5826(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(79) float local79 = (float) arg0 + 0.35F;
		@Pc(84) float local84 = (float) arg1 + 0.35F;
		@Pc(88) int local88 = arg2 << 1;
		if ((float) local88 < this.aFloat122) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local79 + 1.0F, local84 + 1.0F);
			OpenGL.glVertex2f(local79 + 1.0F, -1.0F + local84);
			OpenGL.glVertex2f(local79 - 1.0F, -1.0F + local84);
			OpenGL.glVertex2f(local79 - 1.0F, local84 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat112 >= (float) local88) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local88);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local79, local84);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local79, local84);
			@Pc(144) int local144 = 262144 / (arg2 * 6);
			if (local144 <= 64) {
				local144 = 64;
			} else if (local144 > 512) {
				local144 = 512;
			}
			local144 = Static468.method7064(local144);
			OpenGL.glVertex2f((float) arg2 + local79, local84);
			for (@Pc(177) int local177 = 16384 - local144; local177 > 0; local177 -= local144) {
				OpenGL.glVertex2f(local79 + (float) arg2 * Class144.aFloatArray43[local177], local84 + (float) arg2 * Class144.aFloatArray44[local177]);
			}
			OpenGL.glVertex2f(local79 + (float) arg2, local84);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(18) Class1_Sub1 local18 = (Class1_Sub1) arg5;
		@Pc(21) Class44_Sub1_Sub1 local21 = local18.aClass44_Sub1_Sub1_1;
		this.method5776();
		this.method5774(local18.aClass44_Sub1_Sub1_1);
		this.method5826(1);
		this.method5784(8448, 7681);
		this.method5825(768, 0, 34167);
		@Pc(51) float local51 = local21.aFloat68 / (float) local21.anInt3730;
		@Pc(58) float local58 = local21.aFloat69 / (float) local21.anInt3729;
		@Pc(64) float local64 = (float) arg2 - (float) arg0;
		@Pc(70) float local70 = (float) arg3 - (float) arg1;
		@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local70 * local70 + local64 * local64)));
		@Pc(89) int local89 = arg10 % (arg8 + arg9);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(108) float local108 = local64 * local83;
		@Pc(112) float local112 = local70 * local83;
		@Pc(117) float local117 = (float) arg8 * local108;
		@Pc(122) float local122 = local112 * (float) arg8;
		@Pc(124) float local124 = 0.0F;
		@Pc(126) float local126 = 0.0F;
		@Pc(128) float local128 = local117;
		@Pc(130) float local130 = local122;
		if (arg8 < local89) {
			local124 = local108 * (float) (arg9 + arg8 - local89);
			local126 = local112 * (float) (arg9 + arg8 - local89);
		} else {
			local128 = (float) (arg8 - local89) * local108;
			local130 = local112 * (float) (arg8 - local89);
		}
		@Pc(181) float local181 = (float) arg0 + local124 + 0.35F;
		@Pc(188) float local188 = local126 + (float) arg1 + 0.35F;
		@Pc(193) float local193 = (float) arg9 * local108;
		@Pc(198) float local198 = (float) arg9 * local112;
		while (true) {
			if (arg2 <= arg0) {
				if (local181 < (float) arg2 + 0.35F) {
					break;
				}
				if (local128 + local181 < (float) arg2) {
					local128 = (float) arg2 - local181;
				}
			} else {
				if (local181 > (float) arg2 + 0.35F) {
					break;
				}
				if (local128 + local181 > (float) arg2) {
					local128 = (float) arg2 - local181;
				}
			}
			if (arg3 <= arg1) {
				if ((float) arg3 + 0.35F > local188) {
					break;
				}
				if (local188 + local130 < (float) arg3) {
					local130 = (float) arg3 - local188;
				}
			} else {
				if ((float) arg3 + 0.35F < local188) {
					break;
				}
				if ((float) arg3 < local188 + local130) {
					local130 = (float) arg3 - local188;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f((local181 - (float) arg6) * local51, (local188 - (float) arg7) * local58);
			OpenGL.glVertex2f(local181, local188);
			OpenGL.glTexCoord2f((local128 + local181 - (float) arg6) * local51, (local130 + local188 - (float) arg7) * local58);
			OpenGL.glVertex2f(local128 + local181, local130 + local188);
			OpenGL.glEnd();
			local188 += local130 + local198;
			local181 += local128 + local193;
			local128 = local117;
			local130 = local122;
		}
		this.method5825(768, 0, 5890);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)I")
	public int method5817(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6711(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6639(arg2, arg3);
	}

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "()Lclient!qa;")
	@Override
	public Class109 method6636() {
		return this.aClass109_Sub2_3;
	}

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "(B)V")
	public void method5818() {
		if (this.anInt6539 == 4) {
			return;
		}
		this.method5798();
		this.method5829(false);
		this.method5840(false);
		this.method5796(false);
		this.method5788(false);
		this.method5781(-2);
		this.method5826(1);
		this.anInt6539 = 4;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLclient!aq;)V")
	public void method5819(@OriginalArg(1) Interface3 arg0) {
		if (this.anInt6533 < 0 || arg0 != this.anInterface3Array3[this.anInt6533]) {
			throw new RuntimeException();
		}
		this.anInterface3Array3[this.anInt6533--] = null;
		arg0.method3874();
		if (this.anInt6533 < 0) {
			this.anInterface3_1 = null;
		} else {
			this.anInterface3_1 = this.anInterface3Array3[this.anInt6533];
			this.anInterface3_1.method3873();
		}
	}

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "(II)V")
	public synchronized void method5820(@OriginalArg(0) int arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong346 = (long) arg0;
		this.aClass340_49.method8131(local7);
	}

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "(II)I")
	public int method5821(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "(I)V")
	private void method5822() {
		this.aFloat121 = (float) (this.anInt6560 - this.anInt6564) - this.aFloat116;
		this.aFloat129 = this.aFloat121 - this.aFloat130 * (float) this.anInt6554;
		if (this.aFloat129 < (float) this.anInt6548) {
			this.aFloat129 = (float) this.anInt6548;
		}
		OpenGL.glFogf(2915, this.aFloat129);
		OpenGL.glFogf(2916, this.aFloat121);
		Static89.aFloatArray5[1] = (float) (this.anInt6553 & 0xFF00) / 65280.0F;
		Static89.aFloatArray5[0] = (float) (this.anInt6553 & 0xFF0000) / 1.671168E7F;
		Static89.aFloatArray5[2] = (float) (this.anInt6553 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static89.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!sn;Lclient!sn;FLclient!sn;)Lclient!sn;")
	@Override
	public Class81 method6656(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class81 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean483 && this.aBoolean473) {
			@Pc(21) Class81_Sub2_Sub1 local21 = null;
			@Pc(24) Class81_Sub2 local24 = (Class81_Sub2) arg0;
			@Pc(27) Class81_Sub2 local27 = (Class81_Sub2) arg1;
			@Pc(31) Class44_Sub2 local31 = local24.method7366();
			@Pc(35) Class44_Sub2 local35 = local27.method7366();
			if (local31 != null && local35 != null) {
				@Pc(59) int local59 = local31.anInt3805 <= local35.anInt3805 ? local35.anInt3805 : local31.anInt3805;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class81_Sub2_Sub1) {
					@Pc(75) Class81_Sub2_Sub1 local75 = (Class81_Sub2_Sub1) arg3;
					if (local75.method5410() == local59) {
						local21 = local75;
					}
				}
				if (local21 == null) {
					local21 = new Class81_Sub2_Sub1(this, local59);
				}
				if (local21.method5412(arg2, local35, local31)) {
					return local21;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "(I)V")
	@Override
	public void method6655() {
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!qa;)V")
	@Override
	public void method6695(@OriginalArg(0) Class109 arg0) {
		this.aClass109_Sub2_3.method4595(arg0);
		this.aClass109_Sub2_4.method4595(this.aClass109_Sub2_3);
		this.aClass109_Sub2_4.method3694();
		this.aClass109_Sub2_5.method3696(this.aClass109_Sub2_4);
		if (this.anInt6561 != 1) {
			this.method5845();
		}
	}

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "()Z")
	@Override
	public boolean method6703() {
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)V")
	private void method5823() {
		if (this.anInt6550 <= this.anInt6562 && this.anInt6566 >= this.anInt6545) {
			OpenGL.glScissor(this.anInt6550 + this.anInt6549, -this.anInt6566 + this.anInt6525 + this.anInt6552, this.anInt6562 - this.anInt6550, this.anInt6566 - this.anInt6545);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ml", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5828();
		this.method5826(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!kia;I)V")
	@Override
	public void method6685(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1) {
		this.aClass366_1.method8566(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIB)V")
	public void method5825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg0);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(IB)V")
	public void method5826(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt6540) {
			return;
		}
		@Pc(28) boolean local28;
		@Pc(26) byte local26;
		if (arg0 == 1) {
			local26 = 1;
			local28 = true;
		} else if (arg0 == 2) {
			local26 = 2;
			local28 = false;
		} else if (arg0 == 128) {
			local26 = 3;
			local28 = true;
		} else {
			local28 = false;
			local26 = 0;
		}
		if (!this.aBoolean466) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean466 = true;
		}
		if (local28 != this.aBoolean467) {
			if (local28) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean467 = local28;
		}
		if (local26 != this.anInt6541) {
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
			this.anInt6541 = local26;
		}
		this.anInt6540 = arg0;
		this.anInt6539 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)V")
	@Override
	public void method6690(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ml", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass109_Sub2_3.aFloat75 * (float) arg2 + (float) arg1 * this.aClass109_Sub2_3.aFloat83 + this.aClass109_Sub2_3.aFloat74 * (float) arg0 + this.aClass109_Sub2_3.aFloat72;
		if ((float) this.anInt6548 > local28 || local28 > (float) this.anInt6560) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(89) int local89 = (int) ((float) this.anInt6542 * (this.aClass109_Sub2_3.aFloat73 + (float) arg2 * this.aClass109_Sub2_3.aFloat82 + this.aClass109_Sub2_3.aFloat78 * (float) arg0 + (float) arg1 * this.aClass109_Sub2_3.aFloat77) / (float) arg3);
		@Pc(122) int local122 = (int) (((float) arg2 * this.aClass109_Sub2_3.aFloat76 + this.aClass109_Sub2_3.aFloat80 * (float) arg1 + (float) arg0 * this.aClass109_Sub2_3.aFloat79 + this.aClass109_Sub2_3.aFloat81) * (float) this.anInt6567 / (float) arg3);
		if ((float) local89 >= this.aFloat113 && (float) local89 <= this.aFloat124 && (float) local122 >= this.aFloat127 && this.aFloat126 >= (float) local122) {
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local122 - this.aFloat127);
			arg4[0] = (int) ((float) local89 - this.aFloat113);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6707(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "(I)V")
	private void method5827() {
		this.aFloat113 = (float) (this.anInt6550 - this.anInt6559);
		this.aFloat124 = (float) (this.anInt6562 - this.anInt6559);
		this.aFloat126 = (float) (this.anInt6566 - this.anInt6546);
		this.aFloat127 = (float) (this.anInt6545 - this.anInt6546);
	}

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "(I)V")
	private void method5828() {
		if (this.anInt6539 == 1) {
			return;
		}
		this.method5798();
		this.method5829(false);
		this.method5840(false);
		this.method5796(false);
		this.method5788(false);
		this.method5774((Class44) null);
		this.method5781(-2);
		this.method5787(1);
		this.anInt6539 = 1;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "()Z")
	@Override
	public boolean method6670() {
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(II)I")
	@Override
	public int method6712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)V")
	public void method5829(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean488) {
			this.aBoolean488 = arg0;
			this.method5799();
			this.anInt6539 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ml", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean487 = false;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!sn;)V")
	@Override
	public void method6713(@OriginalArg(0) Class81 arg0) {
		this.aClass81_Sub2_1 = (Class81_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(FIF)V")
	public void method5830(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat116 = arg0;
		this.aFloat130 = arg1;
		this.method5822();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!aq;)V")
	public void method5831(@OriginalArg(1) Interface3 arg0) {
		if (this.anInt6534 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6534 >= 0) {
			this.anInterface3Array2[this.anInt6534].method3872();
		}
		this.anInterface3_2 = this.anInterface3Array2[++this.anInt6534] = arg0;
		this.anInterface3_2.method3870();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!aj;I)V")
	public void method5832(@OriginalArg(0) Interface2 arg0) {
		if (this.anInterface2_3 != arg0) {
			if (this.aBoolean475) {
				OpenGL.glBindBufferARB(34962, arg0.method7559());
			}
			this.anInterface2_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)I")
	@Override
	public int method6686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt6575;
		this.anInt6575 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!gj;I)V")
	public void method5833(@OriginalArg(0) Class109_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method3695(), 0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "(I)V")
	private void method5834() {
		if (this.aBoolean482) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean482 = false;
		}
	}

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "(I)V")
	private void method5835() {
		@Pc(6) float[] local6 = this.aFloatArray55;
		@Pc(18) float local18 = (float) (-this.anInt6559 * this.anInt6548) / (float) this.anInt6542;
		@Pc(33) float local33 = (float) ((this.anInt6517 - this.anInt6559) * this.anInt6548) / (float) this.anInt6542;
		@Pc(44) float local44 = (float) (this.anInt6546 * this.anInt6548) / (float) this.anInt6567;
		@Pc(58) float local58 = (float) ((this.anInt6546 - this.anInt6525) * this.anInt6548) / (float) this.anInt6567;
		if (local18 == local33 || local58 == local44) {
			local6[3] = 0.0F;
			local6[2] = 0.0F;
			local6[11] = 0.0F;
			local6[13] = 0.0F;
			local6[9] = 0.0F;
			local6[6] = 0.0F;
			local6[12] = 0.0F;
			local6[8] = 0.0F;
			local6[4] = 0.0F;
			local6[1] = 0.0F;
			local6[14] = 0.0F;
			local6[0] = 1.0F;
			local6[10] = 1.0F;
			local6[5] = 1.0F;
			local6[7] = 0.0F;
			local6[15] = 1.0F;
		} else {
			@Pc(74) float local74 = (float) this.anInt6548 * 2.0F;
			local6[9] = (local44 + local58) / (local44 - local58);
			local6[1] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = local74 / (local44 - local58);
			local6[15] = 0.0F;
			local6[12] = 0.0F;
			local6[4] = 0.0F;
			local6[14] = this.aFloat119 = -((float) this.anInt6560 * local74) / (float) (this.anInt6560 - this.anInt6548);
			local6[2] = 0.0F;
			local6[11] = -1.0F;
			local6[8] = (local18 + local33) / (-local18 + local33);
			local6[7] = 0.0F;
			local6[10] = this.aFloat118 = (float) -(this.anInt6560 + this.anInt6548) / (float) (this.anInt6560 - this.anInt6548);
			local6[13] = 0.0F;
			local6[6] = 0.0F;
			local6[0] = local74 / (local33 - local18);
		}
		this.method5790();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6652(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas7) {
			throw new RuntimeException();
		} else if (!this.aHashtable6.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(32) Class local32 = Class.forName("java.awt.Canvas");
				@Pc(44) Method local44 = local32.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local44.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(56) Exception local56) {
			}
			@Pc(61) long local61 = this.anOpenGL2.prepareSurface(arg0);
			if (local61 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, Long.valueOf(local61));
		}
	}

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "(I)V")
	private void method5836() {
		this.method5781(-2);
		for (@Pc(14) int local14 = this.anInt6574 - 1; local14 >= 0; local14--) {
			this.method5775(local14);
			this.method5774((Class44) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5784(8448, 8448);
		this.method5825(770, 2, 34168);
		this.method5834();
		this.anInt6540 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt6541 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean467 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean466 = true;
		this.method5829(true);
		this.method5840(true);
		this.method5796(true);
		this.method5788(true);
		this.method5772();
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
			@Pc(146) int local146 = local136 + 16384;
			OpenGL.glLightfv(local146, 4608, local134, 0);
			OpenGL.glLightf(local146, 4615, 0.0F);
			OpenGL.glLightf(local146, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt6547 = this.anInt6553 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "()Lclient!qa;")
	@Override
	public Class109 method6709() {
		return new Class109_Sub2();
	}

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "()V")
	@Override
	public void method6632() {
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
	public synchronized void method5837(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub6 local8 = new Class6_Sub6(arg1);
		local8.aLong346 = (long) arg0;
		this.aClass340_45.method8131(local8);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZIZI)V")
	public void method5838(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 != this.anInt6543 || this.aBoolean487 != this.aBoolean485) {
			@Pc(17) Class44_Sub1 local17 = null;
			@Pc(19) int local19 = 0;
			@Pc(21) byte local21 = 0;
			@Pc(23) int local23 = 0;
			@Pc(31) int local31 = this.aBoolean487 ? 3 : 0;
			if (arg1 < 0) {
				this.method5834();
			} else {
				local17 = this.aClass138_1.method3712(arg1);
				@Pc(45) Class297 local45 = super.anInterface11_10.method6027(arg1);
				if (local45.aByte121 == 0 && local45.aByte119 == 0) {
					this.method5834();
				} else {
					@Pc(69) int local69 = local45.aBoolean630 ? 64 : 128;
					@Pc(73) int local73 = local69 * 50;
					this.method5771(0.0F, (float) (local45.aByte119 * (this.anInt6532 % local73)) / (float) local73, (float) (local45.aByte121 * (this.anInt6532 % local73)) / (float) local73);
				}
				if (!this.aBoolean487) {
					local21 = local45.aByte122;
					local23 = local45.anInt8253;
					local31 = local45.aByte124;
				}
				local19 = local45.anInt8254;
			}
			this.aClass185_1.method4637(local23, arg0, arg2, local31, local21);
			if (!this.aClass185_1.method4641(local17, local19)) {
				this.method5774(local17);
				this.method5787(local19);
			}
			this.aBoolean485 = this.aBoolean487;
			this.anInt6543 = arg1;
		}
		this.anInt6539 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "(I)V")
	private void method5839() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray55, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZB)V")
	public void method5840(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean474) {
			this.aBoolean474 = arg0;
			this.method5816();
			this.anInt6539 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZBI)V")
	public void method5841(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method5838(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIF)Lclient!ta;")
	@Override
	public Class6_Sub10 method6647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub10_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "()Z")
	@Override
	public boolean method6646() {
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIZ)Lclient!tb;")
	@Override
	public Class49 method6710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class49_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "(I)V")
	public void method5842() {
		if (this.anInt6539 == 16) {
			return;
		}
		this.method5780();
		this.method5829(true);
		this.method5796(true);
		this.method5788(true);
		this.method5826(1);
		this.anInt6539 = 16;
	}

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Class44_Sub1_Sub1 local9 = local6.aClass44_Sub1_Sub1_1;
		this.method5776();
		this.method5774(local6.aClass44_Sub1_Sub1_1);
		this.method5826(1);
		this.method5784(8448, 7681);
		this.method5825(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat68 / (float) local9.anInt3730;
		@Pc(46) float local46 = local9.aFloat69 / (float) local9.anInt3729;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt6550 - arg2) * local39, local46 * (float) (this.anInt6545 - arg3));
		OpenGL.glVertex2i(this.anInt6550, this.anInt6545);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6550 - arg2), (float) (this.anInt6566 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6550, this.anInt6566);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6562 - arg2), (float) (this.anInt6566 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6562, this.anInt6566);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6562 - arg2), local46 * (float) (this.anInt6545 - arg3));
		OpenGL.glVertex2i(this.anInt6562, this.anInt6545);
		OpenGL.glEnd();
		this.method5825(768, 0, 5890);
	}

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "(B)V")
	private void method5843() {
		@Pc(15) float local15 = this.aFloat120 * (float) -this.anInt6559 / (float) this.anInt6542;
		@Pc(27) float local27 = this.aFloat120 * (float) -this.anInt6546 / (float) this.anInt6567;
		@Pc(50) float local50 = (float) (this.anInt6517 - this.anInt6559) * this.aFloat120 / (float) this.anInt6542;
		@Pc(65) float local65 = this.aFloat120 * (float) (this.anInt6525 - this.anInt6546) / (float) this.anInt6567;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local50 && local27 != local65) {
			OpenGL.glOrtho((double) local15, (double) local50, (double) -local65, (double) -local27, (double) this.anInt6548, (double) this.anInt6560);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!kia;)V")
	@Override
	public void method6634(@OriginalArg(0) Class209 arg0) {
		this.aClass366_1.method8566(arg0, -1, this);
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(Z)V")
	private void method5844() {
		this.aClass44Array1 = new Class44[this.anInt6574];
		this.aClass44_Sub1_3 = new Class44_Sub1(this, 3553, 6408, 1, 1);
		new Class44_Sub1(this, 3553, 6408, 1, 1);
		new Class44_Sub1(this, 3553, 6408, 1, 1);
		this.aClass54_Sub1_4 = new Class54_Sub1(this);
		this.aClass54_Sub1_1 = new Class54_Sub1(this);
		this.aClass54_Sub1_6 = new Class54_Sub1(this);
		this.aClass54_Sub1_10 = new Class54_Sub1(this);
		this.aClass54_Sub1_9 = new Class54_Sub1(this);
		this.aClass54_Sub1_7 = new Class54_Sub1(this);
		this.aClass54_Sub1_8 = new Class54_Sub1(this);
		this.aClass54_Sub1_5 = new Class54_Sub1(this);
		this.aClass54_Sub1_3 = new Class54_Sub1(this);
		this.aClass54_Sub1_2 = new Class54_Sub1(this);
		if (this.aBoolean473) {
			this.aClass146_2 = new Class146(this);
			new Class146(this);
		}
	}

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "(B)V")
	private void method5845() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass109_Sub2_4.method3695(), 0);
		if (this.aBoolean485) {
			this.aClass185_1.aClass69_Sub4_1.method3131();
		}
		this.method5777();
		this.method5804();
	}

	@OriginalMember(owner = "client!ml", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt6525 - arg1 - local12, arg2, 1, 32993, this.anInt6551, local10, local12 * arg2);
		}
		return local10;
	}
}
