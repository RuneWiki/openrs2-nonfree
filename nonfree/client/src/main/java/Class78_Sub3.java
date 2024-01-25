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

@OriginalClass("client!lj")
public final class Class78_Sub3 extends Class78 {

	@OriginalMember(owner = "client!lj", name = "eb", descriptor = "I")
	public int anInt5405;

	@OriginalMember(owner = "client!lj", name = "Ad", descriptor = "I")
	public int anInt5524;

	@OriginalMember(owner = "client!lj", name = "Hd", descriptor = "I")
	private int anInt5531;

	@OriginalMember(owner = "client!lj", name = "Td", descriptor = "I")
	private int anInt5543;

	@OriginalMember(owner = "client!lj", name = "te", descriptor = "I")
	public int anInt5559;

	@OriginalMember(owner = "client!lj", name = "ue", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!lj", name = "ye", descriptor = "Lclient!vca;")
	private Class343 aClass343_3;

	@OriginalMember(owner = "client!lj", name = "ze", descriptor = "Lclient!bw;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!lj", name = "Ce", descriptor = "Lclient!iea;")
	private Class5_Sub3 aClass5_Sub3_1;

	@OriginalMember(owner = "client!lj", name = "De", descriptor = "Lclient!bw;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!lj", name = "Ie", descriptor = "I")
	public int anInt5563;

	@OriginalMember(owner = "client!lj", name = "Je", descriptor = "I")
	private int anInt5564;

	@OriginalMember(owner = "client!lj", name = "Ke", descriptor = "I")
	public int anInt5565;

	@OriginalMember(owner = "client!lj", name = "Le", descriptor = "I")
	private int anInt5566;

	@OriginalMember(owner = "client!lj", name = "Se", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!lj", name = "Te", descriptor = "Z")
	private boolean aBoolean408;

	@OriginalMember(owner = "client!lj", name = "Ue", descriptor = "Z")
	private boolean aBoolean409;

	@OriginalMember(owner = "client!lj", name = "Ve", descriptor = "I")
	private int anInt5567;

	@OriginalMember(owner = "client!lj", name = "We", descriptor = "I")
	private int anInt5568;

	@OriginalMember(owner = "client!lj", name = "Xe", descriptor = "I")
	private int anInt5569;

	@OriginalMember(owner = "client!lj", name = "Ye", descriptor = "Z")
	private boolean aBoolean410;

	@OriginalMember(owner = "client!lj", name = "af", descriptor = "Z")
	private boolean aBoolean411;

	@OriginalMember(owner = "client!lj", name = "df", descriptor = "Z")
	public boolean aBoolean412;

	@OriginalMember(owner = "client!lj", name = "ef", descriptor = "Z")
	private boolean aBoolean413;

	@OriginalMember(owner = "client!lj", name = "jf", descriptor = "Lclient!mq;")
	public Class226 aClass226_6;

	@OriginalMember(owner = "client!lj", name = "kf", descriptor = "Lclient!ii;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!lj", name = "lf", descriptor = "Z")
	public boolean aBoolean415;

	@OriginalMember(owner = "client!lj", name = "of", descriptor = "[Lclient!vf;")
	private Class46[] aClass46Array1;

	@OriginalMember(owner = "client!lj", name = "pf", descriptor = "Z")
	public boolean aBoolean416;

	@OriginalMember(owner = "client!lj", name = "tf", descriptor = "Ljava/lang/String;")
	private String aString66;

	@OriginalMember(owner = "client!lj", name = "xf", descriptor = "Lclient!vca;")
	public Class343 aClass343_4;

	@OriginalMember(owner = "client!lj", name = "yf", descriptor = "Z")
	public boolean aBoolean418;

	@OriginalMember(owner = "client!lj", name = "zf", descriptor = "Lclient!os;")
	public Class52_Sub1 aClass52_Sub1_1;

	@OriginalMember(owner = "client!lj", name = "Af", descriptor = "Lclient!os;")
	public Class52_Sub1 aClass52_Sub1_2;

	@OriginalMember(owner = "client!lj", name = "Bf", descriptor = "Lclient!cw;")
	public Class46_Sub2 aClass46_Sub2_4;

	@OriginalMember(owner = "client!lj", name = "Cf", descriptor = "I")
	public int anInt5575;

	@OriginalMember(owner = "client!lj", name = "Df", descriptor = "Lclient!os;")
	public Class52_Sub1 aClass52_Sub1_3;

	@OriginalMember(owner = "client!lj", name = "Ef", descriptor = "I")
	private int anInt5576;

	@OriginalMember(owner = "client!lj", name = "Ff", descriptor = "Z")
	private boolean aBoolean419;

	@OriginalMember(owner = "client!lj", name = "Gf", descriptor = "Lclient!os;")
	public Class52_Sub1 aClass52_Sub1_4;

	@OriginalMember(owner = "client!lj", name = "If", descriptor = "I")
	public int anInt5577;

	@OriginalMember(owner = "client!lj", name = "Lf", descriptor = "Lclient!os;")
	public Class52_Sub1 aClass52_Sub1_5;

	@OriginalMember(owner = "client!lj", name = "Nf", descriptor = "Z")
	public boolean aBoolean421;

	@OriginalMember(owner = "client!lj", name = "Of", descriptor = "Lclient!mq;")
	public Class226 aClass226_7;

	@OriginalMember(owner = "client!lj", name = "Qf", descriptor = "Lclient!os;")
	public Class52_Sub1 aClass52_Sub1_6;

	@OriginalMember(owner = "client!lj", name = "Sf", descriptor = "Lclient!os;")
	public Class52_Sub1 aClass52_Sub1_7;

	@OriginalMember(owner = "client!lj", name = "Uf", descriptor = "Z")
	private boolean aBoolean423;

	@OriginalMember(owner = "client!lj", name = "Vf", descriptor = "I")
	private int anInt5579;

	@OriginalMember(owner = "client!lj", name = "Wf", descriptor = "Z")
	public boolean aBoolean424;

	@OriginalMember(owner = "client!lj", name = "Xf", descriptor = "Ljava/lang/String;")
	private String aString67;

	@OriginalMember(owner = "client!lj", name = "ag", descriptor = "Lclient!oq;")
	private Class209_Sub2 aClass209_Sub2_1;

	@OriginalMember(owner = "client!lj", name = "bg", descriptor = "I")
	public int anInt5581;

	@OriginalMember(owner = "client!lj", name = "cg", descriptor = "I")
	private int anInt5582;

	@OriginalMember(owner = "client!lj", name = "dg", descriptor = "Z")
	public boolean aBoolean425;

	@OriginalMember(owner = "client!lj", name = "eg", descriptor = "Lclient!eq;")
	private Interface8 anInterface8_2;

	@OriginalMember(owner = "client!lj", name = "hg", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!lj", name = "jg", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!lj", name = "kg", descriptor = "I")
	private int anInt5585;

	@OriginalMember(owner = "client!lj", name = "lg", descriptor = "Lclient!os;")
	public Class52_Sub1 aClass52_Sub1_8;

	@OriginalMember(owner = "client!lj", name = "mg", descriptor = "I")
	private int anInt5586;

	@OriginalMember(owner = "client!lj", name = "pg", descriptor = "I")
	private int anInt5589;

	@OriginalMember(owner = "client!lj", name = "rg", descriptor = "Z")
	private boolean aBoolean426;

	@OriginalMember(owner = "client!lj", name = "tg", descriptor = "I")
	private int anInt5592;

	@OriginalMember(owner = "client!lj", name = "zg", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!lj", name = "Ag", descriptor = "F")
	private float aFloat146;

	@OriginalMember(owner = "client!lj", name = "Hg", descriptor = "Z")
	public boolean aBoolean429;

	@OriginalMember(owner = "client!lj", name = "Ig", descriptor = "Lclient!nea;")
	private Class46_Sub2_Sub1 aClass46_Sub2_Sub1_4;

	@OriginalMember(owner = "client!lj", name = "Jg", descriptor = "Lclient!os;")
	public Class52_Sub1 aClass52_Sub1_9;

	@OriginalMember(owner = "client!lj", name = "Kg", descriptor = "Z")
	private boolean aBoolean430;

	@OriginalMember(owner = "client!lj", name = "Og", descriptor = "Z")
	private boolean aBoolean433;

	@OriginalMember(owner = "client!lj", name = "Pg", descriptor = "Z")
	public boolean aBoolean434;

	@OriginalMember(owner = "client!lj", name = "Qg", descriptor = "Lclient!os;")
	public Class52_Sub1 aClass52_Sub1_10;

	@OriginalMember(owner = "client!lj", name = "Vg", descriptor = "F")
	private float aFloat150;

	@OriginalMember(owner = "client!lj", name = "Xg", descriptor = "Z")
	private boolean aBoolean435;

	@OriginalMember(owner = "client!lj", name = "Yg", descriptor = "Lclient!eq;")
	private Interface8 anInterface8_3;

	@OriginalMember(owner = "client!lj", name = "ah", descriptor = "F")
	private float aFloat151;

	@OriginalMember(owner = "client!lj", name = "bh", descriptor = "I")
	private int anInt5602;

	@OriginalMember(owner = "client!lj", name = "ch", descriptor = "F")
	public float aFloat152;

	@OriginalMember(owner = "client!lj", name = "gh", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!lj", name = "hh", descriptor = "I")
	public int anInt5603;

	@OriginalMember(owner = "client!lj", name = "ih", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!lj", name = "kh", descriptor = "I")
	private int anInt5604;

	@OriginalMember(owner = "client!lj", name = "nh", descriptor = "I")
	private int anInt5605;

	@OriginalMember(owner = "client!lj", name = "xb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!lj", name = "ce", descriptor = "I")
	public int anInt5549 = 128;

	@OriginalMember(owner = "client!lj", name = "Zd", descriptor = "Lclient!pm;")
	private final Class270 aClass270_1 = new Class270();

	@OriginalMember(owner = "client!lj", name = "le", descriptor = "Lclient!cf;")
	private final Class34_Sub2 aClass34_Sub2_1 = new Class34_Sub2();

	@OriginalMember(owner = "client!lj", name = "me", descriptor = "Lclient!cf;")
	public final Class34_Sub2 aClass34_Sub2_2 = new Class34_Sub2();

	@OriginalMember(owner = "client!lj", name = "qe", descriptor = "I")
	public int anInt5558 = 8;

	@OriginalMember(owner = "client!lj", name = "re", descriptor = "Z")
	private boolean aBoolean407 = false;

	@OriginalMember(owner = "client!lj", name = "pe", descriptor = "I")
	public int anInt5557 = 3;

	@OriginalMember(owner = "client!lj", name = "se", descriptor = "Lclient!gca;")
	private final Class111 aClass111_26 = new Class111();

	@OriginalMember(owner = "client!lj", name = "ve", descriptor = "I")
	private int anInt5560 = -1;

	@OriginalMember(owner = "client!lj", name = "xe", descriptor = "[Lclient!bw;")
	private final Interface3[] anInterface3Array1 = new Interface3[4];

	@OriginalMember(owner = "client!lj", name = "Be", descriptor = "I")
	private int anInt5562 = -1;

	@OriginalMember(owner = "client!lj", name = "Ae", descriptor = "I")
	private int anInt5561 = -1;

	@OriginalMember(owner = "client!lj", name = "Ee", descriptor = "[Lclient!bw;")
	private final Interface3[] anInterface3Array2 = new Interface3[4];

	@OriginalMember(owner = "client!lj", name = "Fe", descriptor = "[Lclient!bw;")
	private final Interface3[] anInterface3Array3 = new Interface3[4];

	@OriginalMember(owner = "client!lj", name = "we", descriptor = "Lclient!je;")
	private final Class170 aClass170_8 = new Class170();

	@OriginalMember(owner = "client!lj", name = "Ge", descriptor = "Lclient!faa;")
	private final Class91 aClass91_24 = new Class91(16);

	@OriginalMember(owner = "client!lj", name = "He", descriptor = "Lclient!gca;")
	private final Class111 aClass111_27 = new Class111();

	@OriginalMember(owner = "client!lj", name = "Me", descriptor = "Lclient!gca;")
	private final Class111 aClass111_28 = new Class111();

	@OriginalMember(owner = "client!lj", name = "Ne", descriptor = "Lclient!gca;")
	private final Class111 aClass111_29 = new Class111();

	@OriginalMember(owner = "client!lj", name = "Oe", descriptor = "Lclient!gca;")
	private final Class111 aClass111_30 = new Class111();

	@OriginalMember(owner = "client!lj", name = "Pe", descriptor = "Lclient!gca;")
	private final Class111 aClass111_31 = new Class111();

	@OriginalMember(owner = "client!lj", name = "Qe", descriptor = "Lclient!gca;")
	private final Class111 aClass111_32 = new Class111();

	@OriginalMember(owner = "client!lj", name = "Re", descriptor = "Lclient!gca;")
	private final Class111 aClass111_33 = new Class111();

	@OriginalMember(owner = "client!lj", name = "Ze", descriptor = "Lclient!cf;")
	public final Class34_Sub2 aClass34_Sub2_3 = new Class34_Sub2();

	@OriginalMember(owner = "client!lj", name = "bf", descriptor = "Lclient!cf;")
	public final Class34_Sub2 bf = new Class34_Sub2();

	@OriginalMember(owner = "client!lj", name = "cf", descriptor = "Lclient!cf;")
	public final Class34_Sub2 aClass34_Sub2_4 = new Class34_Sub2();

	@OriginalMember(owner = "client!lj", name = "rf", descriptor = "F")
	private float aFloat136 = 0.0F;

	@OriginalMember(owner = "client!lj", name = "qf", descriptor = "I")
	private int anInt5572 = -1;

	@OriginalMember(owner = "client!lj", name = "mf", descriptor = "[F")
	private final float[] aFloatArray48 = new float[16];

	@OriginalMember(owner = "client!lj", name = "uf", descriptor = "I")
	public int anInt5574 = 0;

	@OriginalMember(owner = "client!lj", name = "sf", descriptor = "I")
	private int anInt5573 = 0;

	@OriginalMember(owner = "client!lj", name = "Pf", descriptor = "F")
	private float aFloat139 = -1.0F;

	@OriginalMember(owner = "client!lj", name = "ff", descriptor = "I")
	private int anInt5570 = 8448;

	@OriginalMember(owner = "client!lj", name = "nf", descriptor = "F")
	private float aFloat135 = 1.0F;

	@OriginalMember(owner = "client!lj", name = "wf", descriptor = "F")
	public float aFloat137 = 3584.0F;

	@OriginalMember(owner = "client!lj", name = "Yf", descriptor = "F")
	public float aFloat141 = -1.0F;

	@OriginalMember(owner = "client!lj", name = "og", descriptor = "I")
	private int anInt5588 = 0;

	@OriginalMember(owner = "client!lj", name = "gg", descriptor = "I")
	public int anInt5583 = 512;

	@OriginalMember(owner = "client!lj", name = "qg", descriptor = "I")
	private int anInt5590 = 0;

	@OriginalMember(owner = "client!lj", name = "Mf", descriptor = "I")
	public int anInt5578 = -1;

	@OriginalMember(owner = "client!lj", name = "xg", descriptor = "[F")
	private final float[] aFloatArray50 = new float[4];

	@OriginalMember(owner = "client!lj", name = "vg", descriptor = "I")
	public int anInt5593 = 0;

	@OriginalMember(owner = "client!lj", name = "Dg", descriptor = "F")
	private float aFloat147 = -1.0F;

	@OriginalMember(owner = "client!lj", name = "fg", descriptor = "[F")
	public final float[] aFloatArray49 = new float[4];

	@OriginalMember(owner = "client!lj", name = "Mg", descriptor = "I")
	public int anInt5597 = 512;

	@OriginalMember(owner = "client!lj", name = "Eg", descriptor = "F")
	public float aFloat148 = 1.0F;

	@OriginalMember(owner = "client!lj", name = "sg", descriptor = "I")
	private int anInt5591 = 0;

	@OriginalMember(owner = "client!lj", name = "wg", descriptor = "Z")
	private boolean aBoolean427 = false;

	@OriginalMember(owner = "client!lj", name = "Zg", descriptor = "I")
	private int anInt5601 = 0;

	@OriginalMember(owner = "client!lj", name = "Gg", descriptor = "I")
	public int anInt5596 = 0;

	@OriginalMember(owner = "client!lj", name = "Tg", descriptor = "F")
	public float aFloat149 = 1.0F;

	@OriginalMember(owner = "client!lj", name = "Kf", descriptor = "F")
	public float aFloat138 = 3584.0F;

	@OriginalMember(owner = "client!lj", name = "ng", descriptor = "I")
	private int anInt5587 = 0;

	@OriginalMember(owner = "client!lj", name = "ig", descriptor = "I")
	private int anInt5584 = 3584;

	@OriginalMember(owner = "client!lj", name = "Cg", descriptor = "I")
	public int anInt5595 = -1;

	@OriginalMember(owner = "client!lj", name = "fh", descriptor = "F")
	public float aFloat153 = 1.0F;

	@OriginalMember(owner = "client!lj", name = "Bg", descriptor = "[F")
	private final float[] aFloatArray51 = new float[4];

	@OriginalMember(owner = "client!lj", name = "ug", descriptor = "F")
	private float aFloat144 = 1.0F;

	@OriginalMember(owner = "client!lj", name = "Sg", descriptor = "I")
	public int anInt5598 = -1;

	@OriginalMember(owner = "client!lj", name = "vf", descriptor = "Z")
	private boolean aBoolean417 = true;

	@OriginalMember(owner = "client!lj", name = "Ug", descriptor = "I")
	public int anInt5599 = 0;

	@OriginalMember(owner = "client!lj", name = "Rg", descriptor = "[F")
	private final float[] aFloatArray52 = new float[4];

	@OriginalMember(owner = "client!lj", name = "hf", descriptor = "I")
	public int anInt5571 = 50;

	@OriginalMember(owner = "client!lj", name = "Wg", descriptor = "I")
	public int anInt5600 = -1;

	@OriginalMember(owner = "client!lj", name = "Rf", descriptor = "F")
	public float aFloat140 = -1.0F;

	@OriginalMember(owner = "client!lj", name = "Zf", descriptor = "I")
	private int anInt5580 = 8448;

	@OriginalMember(owner = "client!lj", name = "jh", descriptor = "[Lclient!tw;")
	private final Class1_Sub24[] aClass1_Sub24Array4 = new Class1_Sub24[Static524.anInt1400];

	@OriginalMember(owner = "client!lj", name = "Hf", descriptor = "Lclient!wu;")
	public Class1_Sub3_Sub2 aClass1_Sub3_Sub2_1 = new Class1_Sub3_Sub2(8192);

	@OriginalMember(owner = "client!lj", name = "mh", descriptor = "[I")
	public int[] anIntArray311 = new int[1];

	@OriginalMember(owner = "client!lj", name = "lh", descriptor = "[I")
	public int[] anIntArray310 = new int[1];

	@OriginalMember(owner = "client!lj", name = "oh", descriptor = "[I")
	public int[] anIntArray312 = new int[1];

	@OriginalMember(owner = "client!lj", name = "ph", descriptor = "[B")
	public final byte[] aByteArray43 = new byte[16384];

	@OriginalMember(owner = "client!lj", name = "W", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas8;

	@OriginalMember(owner = "client!lj", name = "ib", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!lj", name = "Wd", descriptor = "I")
	public final int anInt5546;

	@OriginalMember(owner = "client!lj", name = "Ob", descriptor = "Lclient!jaggl/OpenGL;")
	public OpenGL anOpenGL1;

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "J")
	private final long aLong134;

	@OriginalMember(owner = "client!lj", name = "Nb", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!lj", name = "yg", descriptor = "I")
	public final int anInt5594;

	@OriginalMember(owner = "client!lj", name = "Lg", descriptor = "Z")
	public boolean aBoolean431;

	@OriginalMember(owner = "client!lj", name = "Ng", descriptor = "Z")
	public boolean aBoolean432;

	@OriginalMember(owner = "client!lj", name = "gf", descriptor = "Z")
	private boolean aBoolean414;

	@OriginalMember(owner = "client!lj", name = "dh", descriptor = "Z")
	public boolean aBoolean436;

	@OriginalMember(owner = "client!lj", name = "eh", descriptor = "Z")
	public boolean aBoolean437;

	@OriginalMember(owner = "client!lj", name = "Jf", descriptor = "Z")
	private boolean aBoolean420;

	@OriginalMember(owner = "client!lj", name = "Fg", descriptor = "Z")
	public boolean aBoolean428;

	@OriginalMember(owner = "client!lj", name = "Tf", descriptor = "Z")
	private final boolean aBoolean422;

	@OriginalMember(owner = "client!lj", name = "de", descriptor = "Lclient!pu;")
	private final Class276 aClass276_1;

	@OriginalMember(owner = "client!lj", name = "oe", descriptor = "Lclient!of;")
	public final Class250 aClass250_1;

	@OriginalMember(owner = "client!lj", name = "fe", descriptor = "Lclient!pv;")
	private final Class277 aClass277_1;

	@OriginalMember(owner = "client!lj", name = "be", descriptor = "Lclient!cs;")
	private Class1_Sub15_Sub1 aClass1_Sub15_Sub1_1;

	@OriginalMember(owner = "client!lj", name = "Xd", descriptor = "Lclient!lt;")
	private final Class213 aClass213_1;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;I)V")
	public Class78_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		this.aCanvas9 = this.aCanvas8 = arg0;
		this.anInt5546 = arg2;
		if (!Static362.method5319("jaclib")) {
			throw new RuntimeException("");
		} else if (Static362.method5319("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong135 = this.aLong134 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt5546);
				if (this.aLong134 == 0L) {
					throw new RuntimeException("");
				}
				this.method4502();
				@Pc(339) int local339 = this.method4518();
				if (local339 != 0) {
					throw new RuntimeException("");
				}
				this.anInt5594 = this.aBoolean425 ? 33639 : 5121;
				if (this.aString67.indexOf("radeon") != -1) {
					@Pc(362) int local362 = 0;
					@Pc(364) boolean local364 = false;
					@Pc(366) boolean local366 = false;
					@Pc(375) String[] local375 = Static95.method1438(this.aString67.replace('/', ' '), ' ');
					for (@Pc(377) int local377 = 0; local377 < local375.length; local377++) {
						@Pc(383) String local383 = local375[local377];
						try {
							if (local383.length() > 0) {
								if (local383.charAt(0) == 'x' && local383.length() >= 3 && Static570.method7674(local383.substring(1, 3))) {
									local383 = local383.substring(1);
									local366 = true;
								}
								if (local383.equals("hd")) {
									local364 = true;
								} else {
									if (local383.startsWith("hd")) {
										local383 = local383.substring(2);
										local364 = true;
									}
									if (local383.length() >= 4 && Static570.method7674(local383.substring(0, 4))) {
										local362 = Static216.method3234(local383.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(448) Exception local448) {
						}
					}
					if (!local364 || local362 < 4000) {
						this.aBoolean431 = false;
					}
					if (!local366 && !local364) {
						if (local362 >= 7000 && local362 <= 9250) {
							this.aBoolean432 = false;
						}
						if (local362 >= 7000 && local362 <= 7999) {
							this.aBoolean414 = false;
						}
					}
					this.aBoolean436 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean437 = true;
					this.aBoolean420 = this.aBoolean414;
				}
				if (this.aString66.indexOf("intel") != -1) {
					this.aBoolean428 = false;
				}
				this.aBoolean422 = !this.aString66.equals("s3 graphics");
				if (this.aBoolean414) {
					try {
						@Pc(535) int[] local535 = new int[1];
						OpenGL.glGenBuffersARB(1, local535, 0);
					} catch (@Pc(541) Throwable local541) {
						throw new RuntimeException("");
					}
				}
				Static171.method2748(true, false);
				this.aBoolean407 = true;
				this.aClass276_1 = new Class276(this, super.anInterface9_13);
				this.method4523();
				this.aClass250_1 = new Class250(this);
				this.aClass277_1 = new Class277(this);
				if (this.aClass277_1.method5868()) {
					this.aClass1_Sub15_Sub1_1 = new Class1_Sub15_Sub1(this);
					if (!this.aClass1_Sub15_Sub1_1.method1222()) {
						this.aClass1_Sub15_Sub1_1.method1203();
						this.aClass1_Sub15_Sub1_1 = null;
					}
				}
				this.aClass213_1 = new Class213(this);
				this.method4499();
				this.method4533();
				this.method6809();
			} catch (@Pc(615) Throwable local615) {
				local615.printStackTrace();
				this.method6789();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "(I)V")
	public void method4489() {
		if (this.anInt5568 == 2) {
			return;
		}
		this.method4540();
		this.method4506(false);
		this.method4524(false);
		this.method4547(false);
		this.method4542(false);
		this.method4567(-2);
		this.anInt5568 = 2;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!bw;)V")
	public void method4490(@OriginalArg(1) Interface3 arg0) {
		if (this.anInt5561 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5561 >= 0) {
			this.anInterface3Array2[this.anInt5561].method7454();
		}
		this.anInterface3_2 = this.anInterface3Array2[++this.anInt5561] = arg0;
		this.anInterface3_2.method7458();
	}

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "()V")
	@Override
	public void method6816() {
	}

	@OriginalMember(owner = "client!lj", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 > this.anInt5590) {
			this.anInt5590 = arg1;
		}
		if (this.anInt5588 > arg3) {
			this.anInt5588 = arg3;
		}
		if (arg2 < this.anInt5591) {
			this.anInt5591 = arg2;
		}
		if (this.anInt5601 < arg0) {
			this.anInt5601 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method4551();
		this.method4501();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass277_1.method5873(arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "()Z")
	@Override
	public boolean method6831() {
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)V")
	public void method4491(@OriginalArg(1) int arg0) {
		Static325.aFloatArray54[3] = (float) (arg0 >>> 24) / 255.0F;
		Static325.aFloatArray54[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static325.aFloatArray54[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static325.aFloatArray54[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static325.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!bw;B)V")
	public void method4492(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt5562 < 0 || arg0 != this.anInterface3Array1[this.anInt5562]) {
			throw new RuntimeException();
		}
		this.anInterface3Array1[this.anInt5562--] = null;
		arg0.method7457();
		if (this.anInt5562 < 0) {
			this.anInterface3_1 = null;
		} else {
			this.anInterface3_1 = this.anInterface3Array1[this.anInt5562];
			this.anInterface3_1.method7456();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIBI)V")
	public void method4493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6815(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "()Z")
	@Override
	public boolean method6794() {
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)I")
	public int method4494(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6827(@OriginalArg(0) Class5 arg0) {
		this.aClass5_Sub3_1 = (Class5_Sub3) arg0;
		@Pc(65) Class1_Sub8 local65;
		if (this.aBoolean428) {
			if (this.aClass343_3 == null) {
				this.aClass343_3 = new Class343(this);
			}
			if (this.aClass343_3 == this.anInterface3_1) {
				throw new RuntimeException();
			}
			this.method4529(this.aClass343_3);
			@Pc(165) Class1_Sub8_Sub19 local165 = (Class1_Sub8_Sub19) this.aClass91_24.method2271((long) (this.aClass5_Sub3_1.E() << 16 | this.aClass5_Sub3_1.u()));
			if (local165 == null) {
				local165 = new Class1_Sub8_Sub19(this, 6402, this.aClass5_Sub3_1.E(), this.aClass5_Sub3_1.u());
				@Pc(200) Class1_Sub8_Sub19 local200;
				for (this.anInt5564 += local165.anInt9223; this.anInt5564 > 2097152; this.anInt5564 -= local200.anInt9223) {
					local65 = this.aClass170_8.method3554();
					if (local65 == null) {
						break;
					}
					local200 = (Class1_Sub8_Sub19) local65;
					local200.method7712();
					local200.method7908();
					local200.method7515();
				}
				this.aClass91_24.method2269((long) (this.aClass5_Sub3_1.E() << 16 | this.aClass5_Sub3_1.u()), local165);
			}
			this.aClass170_8.method3549(local165);
			this.aClass343_3.method7468(8, local165);
			this.aClass343_3.method7472(this.aClass5_Sub3_1.aClass46_Sub2_Sub1_2, 0);
		} else if (this.aBoolean426) {
			@Pc(36) Class1_Sub8_Sub12 local36 = (Class1_Sub8_Sub12) this.aClass91_24.method2271((long) (this.aClass5_Sub3_1.E() << 16 | this.aClass5_Sub3_1.u()));
			if (local36 == null) {
				local36 = new Class1_Sub8_Sub12(this, this.aClass5_Sub3_1.E(), this.aClass5_Sub3_1.u());
				@Pc(70) Class1_Sub8_Sub12 local70;
				for (this.anInt5564 += local36.anInt7487 * 4; this.anInt5564 > 2097152; this.anInt5564 -= local70.anInt7487) {
					local65 = this.aClass170_8.method3554();
					if (local65 == null) {
						break;
					}
					local70 = (Class1_Sub8_Sub12) local65;
					local70.method7712();
					local70.method7908();
					this.anOpenGL1.releasePbuffer(local70.method6013());
				}
				this.aClass91_24.method2269((long) (this.aClass5_Sub3_1.E() << 16 | this.aClass5_Sub3_1.u()), local36);
			}
			this.aClass170_8.method3549(local36);
			this.anOpenGL1.setPbuffer(local36.method6013());
		} else {
			throw new RuntimeException("");
		}
		this.anInt5405 = arg0.E();
		this.anInt5524 = arg0.u();
		this.method4553();
		this.method4522();
		this.JA();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class129 method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class129_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6780(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas8) {
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
			@Pc(53) long local53 = this.anOpenGL1.prepareSurface(arg0);
			if (local53 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!lj", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(6) int local6 = this.anInt5604;
		this.anInt5604 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(Lclient!bw;B)V")
	public void method4495(@OriginalArg(0) Interface3 arg0) {
		if (this.aBoolean434) {
			this.method4563(arg0);
			this.method4492(arg0);
		} else if (this.anInt5560 >= 0 && arg0 == this.anInterface3Array3[this.anInt5560]) {
			this.anInterface3Array3[this.anInt5560--] = null;
			arg0.method7459();
			if (this.anInt5560 >= 0) {
				this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array3[this.anInt5560];
				this.anInterface3_2.method7455();
			} else {
				this.anInterface3_2 = this.anInterface3_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "(I)V")
	private void method4496() {
		@Pc(14) float[] local14 = this.aFloatArray48;
		@Pc(26) float local26 = (float) (this.anInt5571 * -this.anInt5596) / (float) this.anInt5597;
		@Pc(41) float local41 = (float) ((this.anInt5405 - this.anInt5596) * this.anInt5571) / (float) this.anInt5597;
		@Pc(52) float local52 = (float) (this.anInt5571 * this.anInt5599) / (float) this.anInt5583;
		@Pc(67) float local67 = (float) (this.anInt5571 * (this.anInt5599 - this.anInt5524)) / (float) this.anInt5583;
		if (local26 == local41 || local67 == local52) {
			local14[11] = 0.0F;
			local14[13] = 0.0F;
			local14[9] = 0.0F;
			local14[15] = 1.0F;
			local14[4] = 0.0F;
			local14[10] = 1.0F;
			local14[14] = 0.0F;
			local14[1] = 0.0F;
			local14[0] = 1.0F;
			local14[3] = 0.0F;
			local14[8] = 0.0F;
			local14[7] = 0.0F;
			local14[12] = 0.0F;
			local14[2] = 0.0F;
			local14[6] = 0.0F;
			local14[5] = 1.0F;
		} else {
			@Pc(81) float local81 = (float) this.anInt5571 * 2.0F;
			local14[8] = (local26 + local41) / (local41 - local26);
			local14[3] = 0.0F;
			local14[6] = 0.0F;
			local14[14] = this.aFloat150 = -(local81 * (float) this.anInt5584) / (float) (this.anInt5584 - this.anInt5571);
			local14[7] = 0.0F;
			local14[0] = local81 / (local41 - local26);
			local14[15] = 0.0F;
			local14[1] = 0.0F;
			local14[12] = 0.0F;
			local14[9] = (local52 + local67) / (local52 - local67);
			local14[11] = -1.0F;
			local14[2] = 0.0F;
			local14[13] = 0.0F;
			local14[10] = this.aFloat151 = (float) -(this.anInt5571 + this.anInt5584) / (float) (this.anInt5584 - this.anInt5571);
			local14[4] = 0.0F;
			local14[5] = local81 / (local52 - local67);
		}
		this.method4543();
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(IIIIII)Lclient!wn;")
	@Override
	public Class209 method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean424 ? new Class209_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)Lclient!hda;")
	public Class46_Sub4 method4497() {
		return this.aClass209_Sub2_1 == null ? null : this.aClass209_Sub2_1.method7881();
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V")
	@Override
	public void method6852(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!nba;IIII)Lclient!da;")
	@Override
	public Class52 method6817(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class52_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!lj", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(45) float local45;
		if (this.aClass46_Sub2_Sub1_4 == null || arg2 > this.aClass46_Sub2_Sub1_4.anInt6356 || this.aClass46_Sub2_Sub1_4.anInt6360 < arg3) {
			this.aClass46_Sub2_Sub1_4 = Static330.method4876(arg2, arg6, this, arg3);
			this.aClass46_Sub2_Sub1_4.method5150(false, false);
			local41 = this.aClass46_Sub2_Sub1_4.aFloat173;
			local45 = this.aClass46_Sub2_Sub1_4.aFloat174;
		} else {
			this.aClass46_Sub2_Sub1_4.method5145(6406, false, arg2, arg6, arg3);
			local41 = (float) arg3 * this.aClass46_Sub2_Sub1_4.aFloat173 / (float) this.aClass46_Sub2_Sub1_4.anInt6360;
			local45 = this.aClass46_Sub2_Sub1_4.aFloat174 * (float) arg2 / (float) this.aClass46_Sub2_Sub1_4.anInt6356;
		}
		this.method4489();
		this.method4535(this.aClass46_Sub2_Sub1_4);
		this.method4566(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4491(arg5);
		this.method4539(34165, 34165);
		this.method4493(34166, 0, 768);
		this.method4493(5890, 2, 770);
		this.method4527(0, 34166);
		this.method4527(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = (float) arg3 + local150;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local41, local45);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local41, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method4493(5890, 0, 768);
		this.method4493(34166, 2, 770);
		this.method4527(0, 5890);
		this.method4527(2, 34166);
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(Z)V")
	public void method4498() {
		if (this.anInt5568 == 16) {
			return;
		}
		this.method4546();
		this.method4506(true);
		this.method4547(true);
		this.method4542(true);
		this.method4566(1);
		this.anInt5568 = 16;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)I")
	@Override
	public int method6819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!lj", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass34_Sub2_3.aFloat30 + this.aClass34_Sub2_3.aFloat27 * (float) arg1 + this.aClass34_Sub2_3.aFloat33 * (float) arg0 + this.aClass34_Sub2_3.aFloat28 * (float) arg2;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass34_Sub2_3.aFloat30 + (float) arg5 * this.aClass34_Sub2_3.aFloat28 + (float) arg3 * this.aClass34_Sub2_3.aFloat33 + (float) arg4 * this.aClass34_Sub2_3.aFloat27;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt5571 && (float) this.anInt5571 > local59 || !(!(local28 > (float) this.anInt5584) || !((float) this.anInt5584 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass34_Sub2_3.aFloat36 + (float) arg0 * this.aClass34_Sub2_3.aFloat29 + this.aClass34_Sub2_3.aFloat26 * (float) arg1 + (float) arg2 * this.aClass34_Sub2_3.aFloat31) * (float) this.anInt5597 / local28);
		@Pc(155) int local155 = (int) (((float) arg3 * this.aClass34_Sub2_3.aFloat29 + this.aClass34_Sub2_3.aFloat26 * (float) arg4 + (float) arg5 * this.aClass34_Sub2_3.aFloat31 + this.aClass34_Sub2_3.aFloat36) * (float) this.anInt5597 / local59);
		if ((float) local123 < this.aFloat152 && (float) local155 < this.aFloat152 || this.aFloat155 < (float) local123 && (float) local155 > this.aFloat155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass34_Sub2_3.aFloat34 * (float) arg1 + this.aClass34_Sub2_3.aFloat32 * (float) arg0 + this.aClass34_Sub2_3.aFloat25 * (float) arg2 + this.aClass34_Sub2_3.aFloat35) * (float) this.anInt5583 / local28);
			@Pc(245) int local245 = (int) ((this.aClass34_Sub2_3.aFloat35 + (float) arg3 * this.aClass34_Sub2_3.aFloat32 + this.aClass34_Sub2_3.aFloat34 * (float) arg4 + this.aClass34_Sub2_3.aFloat25 * (float) arg5) * (float) this.anInt5583 / local59);
			return (!(this.aFloat143 > (float) local213) || !((float) local245 < this.aFloat143)) && (!((float) local213 > this.aFloat142) || !((float) local245 > this.aFloat142));
		}
	}

	@OriginalMember(owner = "client!lj", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.anInt5557 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt5557++;
		}
		this.anInt5558 = 0x1 << this.anInt5557;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
	private void method4499() {
		this.method4567(-2);
		for (@Pc(14) int local14 = this.anInt5581 - 1; local14 >= 0; local14--) {
			this.method4549(local14);
			this.method4535(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method4539(8448, 8448);
		this.method4493(34168, 2, 770);
		this.method4545();
		this.anInt5569 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt5567 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean411 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean408 = true;
		this.method4506(true);
		this.method4524(true);
		this.method4547(true);
		this.method4542(true);
		this.method4553();
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
		@Pc(125) float[] local125 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(127) int local127 = 0; local127 < 8; local127++) {
			@Pc(133) int local133 = local127 + 16384;
			OpenGL.glLightfv(local133, 4608, local125, 0);
			OpenGL.glLightf(local133, 4615, 0.0F);
			OpenGL.glLightf(local133, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt5572 = this.anInt5600 = -1;
		this.JA();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(FBFFF)V")
	public void method4500(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static325.aFloatArray54[0] = arg2;
		Static325.aFloatArray54[2] = arg3;
		Static325.aFloatArray54[1] = arg0;
		Static325.aFloatArray54[3] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static325.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!qga;Z)Lclient!f;")
	@Override
	public Class5 method6838(@OriginalArg(0) Class282 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt7493 * arg0.anInt7490];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray73 == null) {
			for (local21 = 0; local21 < arg0.anInt7493; local21++) {
				for (local25 = 0; local25 < arg0.anInt7490; local25++) {
					@Pc(38) int local38 = arg0.anIntArray445[arg0.aByteArray74[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt7493; local21++) {
				for (local25 = 0; local25 < arg0.anInt7490; local25++) {
					local12[local16++] = arg0.aByteArray73[local14] << 24 | arg0.anIntArray445[arg0.aByteArray74[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(114) Class5 local114 = this.method6842(local12, arg0.anInt7490, arg0.anInt7490, arg0.anInt7493);
		local114.Q(arg0.anInt7491, arg0.anInt7492, arg0.anInt7488, arg0.anInt7489);
		return local114;
	}

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "(I)V")
	private void method4501() {
		if (this.anInt5591 >= this.anInt5601 && this.anInt5590 <= this.anInt5588) {
			OpenGL.glScissor(this.anInt5601 + this.anInt5587, this.anInt5524 + this.anInt5573 - this.anInt5588, this.anInt5591 - this.anInt5601, this.anInt5588 + -this.anInt5590);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6847(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas8) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable6.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!lj", name = "B", descriptor = "()Z")
	@Override
	public boolean method6851() {
		return this.aClass213_1.method4626();
	}

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "(I)V")
	private void method4502() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL1.a()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static408.method5841(1000L);
		}
	}

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "(I)V")
	public void method4503() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!lj", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5600 == arg0 && this.anInt5578 == arg1 && this.anInt5574 == arg2) {
			return;
		}
		this.anInt5600 = arg0;
		this.anInt5574 = arg2;
		this.anInt5578 = arg1;
		this.method4554();
		this.method4552();
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V")
	private void method4504() {
		Static325.aFloatArray54[1] = this.aFloat140 * this.aFloat149;
		Static325.aFloatArray54[3] = 1.0F;
		Static325.aFloatArray54[0] = this.aFloat148 * this.aFloat140;
		Static325.aFloatArray54[2] = this.aFloat140 * this.aFloat153;
		OpenGL.glLightfv(16384, 4609, Static325.aFloatArray54, 0);
		Static325.aFloatArray54[1] = -this.aFloat141 * this.aFloat149;
		Static325.aFloatArray54[2] = this.aFloat153 * -this.aFloat141;
		Static325.aFloatArray54[0] = this.aFloat148 * -this.aFloat141;
		Static325.aFloatArray54[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static325.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!lj", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		if (this.aFloat145 != arg0) {
			this.aFloat145 = arg0;
			this.method4520();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6812(@OriginalArg(0) Class34 arg0) {
		this.aClass34_Sub2_3.M(arg0);
		this.bf.M(this.aClass34_Sub2_3);
		this.bf.method972();
		this.aClass34_Sub2_4.method973(this.bf);
		if (this.anInt5602 != 1) {
			this.method4505();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([I)V")
	@Override
	public void method6822(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt5524;
		arg0[0] = this.anInt5405;
	}

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "(I)V")
	private void method4505() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.bf.method971(), 0);
		if (this.aBoolean427) {
			this.aClass213_1.aClass85_Sub1_1.method2215();
		}
		this.method4517();
		this.method4570();
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(ZI)V")
	public void method4506(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean435) {
			this.aBoolean435 = arg0;
			this.method4552();
			this.anInt5568 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V")
	public void method4507(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5573 = arg1;
		this.anInt5587 = arg0;
		this.method4522();
		this.method4501();
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
	@Override
	public void method6785(@OriginalArg(0) int arg0) {
		this.method4516();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([BIIIZ)Lclient!ii;")
	public Interface12 method4508(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) boolean arg2) {
		return (Interface12) (this.aBoolean414 && (!arg2 || this.aBoolean420) ? new Class126_Sub1(this, 5123, arg0, arg1, arg2) : new Class86_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!lj", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt5590 = 0;
		this.anInt5591 = this.anInt5405;
		this.anInt5588 = this.anInt5524;
		this.anInt5601 = 0;
		OpenGL.glDisable(3089);
		this.method4551();
	}

	@OriginalMember(owner = "client!lj", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass34_Sub2_3.aFloat30 + (float) arg1 * this.aClass34_Sub2_3.aFloat27 + (float) arg0 * this.aClass34_Sub2_3.aFloat33 + this.aClass34_Sub2_3.aFloat28 * (float) arg2;
		if (local28 < (float) this.anInt5571 || (float) this.anInt5584 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt5597 * (this.aClass34_Sub2_3.aFloat36 + this.aClass34_Sub2_3.aFloat31 * (float) arg2 + this.aClass34_Sub2_3.aFloat29 * (float) arg0 + this.aClass34_Sub2_3.aFloat26 * (float) arg1) / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt5583 * (this.aClass34_Sub2_3.aFloat35 + this.aClass34_Sub2_3.aFloat34 * (float) arg1 + this.aClass34_Sub2_3.aFloat32 * (float) arg0 + (float) arg2 * this.aClass34_Sub2_3.aFloat25) / local28);
		if (this.aFloat152 <= (float) local85 && (float) local85 <= this.aFloat155 && this.aFloat143 <= (float) local117 && (float) local117 <= this.aFloat142) {
			arg3[1] = (int) ((float) local117 - this.aFloat143);
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat152);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)V")
	private void method4509() {
		@Pc(15) float local15 = (float) -this.anInt5596 * this.aFloat135 / (float) this.anInt5597;
		@Pc(27) float local27 = this.aFloat135 * (float) -this.anInt5599 / (float) this.anInt5583;
		@Pc(42) float local42 = this.aFloat135 * (float) (this.anInt5405 - this.anInt5596) / (float) this.anInt5597;
		@Pc(57) float local57 = (float) (this.anInt5524 - this.anInt5599) * this.aFloat135 / (float) this.anInt5583;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local27 != local57) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) this.anInt5571, (double) this.anInt5584);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method6815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4530();
		this.method4566(arg5);
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

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!cf;)V")
	public void method4510(@OriginalArg(1) Class34_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method971(), 0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(FFI)V")
	public void method4511(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat144 = arg0;
		this.aFloat136 = arg1;
		this.method4554();
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
	@Override
	public void method6793(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)I")
	public int method4512(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4530();
		this.method4566(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "()V")
	@Override
	protected void method6789() {
		for (@Pc(6) Class1 local6 = this.aClass111_26.method2547(); local6 != null; local6 = this.aClass111_26.method2554()) {
			((Class1_Sub16_Sub1) local6).method1349();
		}
		if (this.aClass277_1 != null) {
			this.aClass277_1.method5865();
		}
		if (this.anOpenGL1 != null) {
			this.method4516();
			@Pc(40) Enumeration local40 = this.aHashtable6.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable6.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean407) {
			Static81.method1350(false, true);
			this.aBoolean407 = false;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class181 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class181_Sub2 local6 = (Class181_Sub2) arg5;
		@Pc(9) Class46_Sub2_Sub1 local9 = local6.aClass46_Sub2_Sub1_5;
		this.method4489();
		this.method4535(local6.aClass46_Sub2_Sub1_5);
		this.method4566(1);
		this.method4539(7681, 8448);
		this.method4493(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat174 / (float) local9.anInt6370;
		@Pc(46) float local46 = local9.aFloat173 / (float) local9.anInt6372;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(58) float local58 = (float) arg3 - (float) arg1;
		@Pc(71) float local71 = (float) (1.0D / Math.sqrt((double) (local58 * local58 + local52 * local52)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(90) float local90 = local52 * local71;
		@Pc(94) float local94 = local58 * local71;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f(local90 + (float) arg2 + 0.35F, (float) arg3 + local94 + 0.35F);
		OpenGL.glEnd();
		this.method4493(5890, 0, 768);
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)V")
	public synchronized void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub27 local8 = new Class1_Sub27(arg0);
		local8.aLong268 = arg1;
		this.aClass111_28.method2552(local8);
	}

	@OriginalMember(owner = "client!lj", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5577 = arg0;
		this.anInt5598 = arg1;
		this.anInt5595 = arg2;
		this.aBoolean416 = true;
		this.anInt5593 = arg3;
	}

	@OriginalMember(owner = "client!lj", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt5571;
	}

	@OriginalMember(owner = "client!lj", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5599 = arg1;
		this.anInt5596 = arg0;
		this.anInt5583 = arg3;
		this.anInt5597 = arg2;
		this.method4496();
		this.method4551();
		if (this.anInt5602 == 3) {
			this.method4509();
		} else if (this.anInt5602 == 2) {
			this.method4558();
		}
	}

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "()Z")
	@Override
	public boolean method6808() {
		return this.aBoolean419 && (!this.method6802() || this.aBoolean423);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(JI)V")
	public synchronized void method4514(@OriginalArg(0) long arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong268 = arg0;
		this.aClass111_33.method2552(local7);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(FIFF)V")
	private void method4515(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean433) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg1, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean433 = true;
	}

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "(I)V")
	private void method4516() {
		this.anOpenGL1.b();
	}

	@OriginalMember(owner = "client!lj", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt5572;
		if (local11 || this.aFloat140 != arg1 || this.aFloat141 != arg2) {
			this.aFloat141 = arg2;
			this.anInt5572 = arg0;
			this.aFloat140 = arg1;
			if (local11) {
				this.aFloat149 = (float) (this.anInt5572 & 0xFF00) / 65280.0F;
				this.aFloat153 = (float) (this.anInt5572 & 0xFF) / 255.0F;
				this.aFloat148 = (float) (this.anInt5572 & 0xFF0000) / 1.671168E7F;
				this.method4520();
			}
			this.method4504();
		}
		if (arg3 == this.aFloatArray51[0] && arg4 == this.aFloatArray51[1] && arg5 == this.aFloatArray51[2]) {
			return;
		}
		this.aFloatArray51[2] = arg5;
		this.aFloatArray51[1] = arg4;
		this.aFloatArray51[0] = arg3;
		this.aFloatArray52[0] = -arg3;
		this.aFloatArray52[1] = -arg4;
		this.aFloatArray52[2] = -arg5;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray49[0] = local138 * arg3;
		this.aFloatArray49[1] = local138 * arg4;
		this.aFloatArray49[2] = arg5 * local138;
		this.aFloatArray50[2] = -this.aFloatArray49[2];
		this.aFloatArray50[1] = -this.aFloatArray49[1];
		this.aFloatArray50[0] = -this.aFloatArray49[0];
		this.method4517();
		this.anInt5603 = (int) (arg3 * 256.0F / arg4);
		this.anInt5575 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(Z)V")
	public void method4517() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray49, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray50, 0);
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(B)I")
	private int method4518() {
		@Pc(5) int local5 = 0;
		this.aString66 = OpenGL.glGetString(7936).toLowerCase();
		this.aString67 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString66.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString66.indexOf("brian paul") != -1 || this.aString66.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(52) String local52 = OpenGL.glGetString(7938);
		@Pc(60) String[] local60 = Static95.method1438(local52.replace('.', ' '), ' ');
		if (local60.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(78) int local78 = Static216.method3234(local60[0]);
				@Pc(84) int local84 = Static216.method3234(local60[1]);
				this.anInt5589 = local78 * 10 + local84;
			} catch (@Pc(93) NumberFormatException local93) {
				local5 |= 0x4;
			}
		}
		if (this.anInt5589 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(129) int[] local129 = new int[1];
		OpenGL.glGetIntegerv(34018, local129, 0);
		this.anInt5581 = local129[0];
		OpenGL.glGetIntegerv(34929, local129, 0);
		this.anInt5576 = local129[0];
		OpenGL.glGetIntegerv(34930, local129, 0);
		this.anInt5586 = local129[0];
		if (this.anInt5581 < 2 || this.anInt5576 < 2 || this.anInt5586 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean425 = Stream.b();
		this.aBoolean426 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean414 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean419 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean429 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean415 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean418 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean432 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean436 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean424 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean431 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean412 = false;
		this.aBoolean428 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean434 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean421 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean423 = this.aBoolean421 & this.aBoolean434;
		OpenGL.glGetFloatv(2834, Static325.aFloatArray54, 0);
		this.aFloat139 = Static325.aFloatArray54[0];
		this.aFloat147 = Static325.aFloatArray54[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(II)V")
	public synchronized void method4519(@OriginalArg(1) int arg0) {
		@Pc(13) Class1 local13 = new Class1();
		local13.aLong268 = arg0;
		this.aClass111_32.method2552(local13);
	}

	@OriginalMember(owner = "client!lj", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt5590;
		arg0[3] = this.anInt5588;
		arg0[0] = this.anInt5601;
		arg0[2] = this.anInt5591;
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(B)V")
	private void method4520() {
		Static325.aFloatArray54[3] = 1.0F;
		Static325.aFloatArray54[2] = this.aFloat145 * this.aFloat153;
		Static325.aFloatArray54[0] = this.aFloat148 * this.aFloat145;
		Static325.aFloatArray54[1] = this.aFloat145 * this.aFloat149;
		OpenGL.glLightModelfv(2899, Static325.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLclient!bw;)V")
	public void method4521(@OriginalArg(1) Interface3 arg0) {
		if (this.anInt5562 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5562 >= 0) {
			this.anInterface3Array1[this.anInt5562].method7457();
		}
		this.anInterface3_1 = this.anInterface3Array1[++this.anInt5562] = arg0;
		this.anInterface3_1.method7456();
	}

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "()Lclient!q;")
	@Override
	public Class34 method6843() {
		return this.aClass34_Sub2_3;
	}

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "(B)V")
	private void method4522() {
		OpenGL.glViewport(this.anInt5587, this.anInt5573, this.anInt5405, this.anInt5524);
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(Z)V")
	private void method4523() {
		this.aClass46Array1 = new Class46[this.anInt5581];
		this.aClass46_Sub2_4 = new Class46_Sub2(this, 3553, 6408, 1, 1);
		new Class46_Sub2(this, 3553, 6408, 1, 1);
		new Class46_Sub2(this, 3553, 6408, 1, 1);
		this.aClass52_Sub1_9 = new Class52_Sub1(this);
		this.aClass52_Sub1_2 = new Class52_Sub1(this);
		this.aClass52_Sub1_5 = new Class52_Sub1(this);
		this.aClass52_Sub1_3 = new Class52_Sub1(this);
		this.aClass52_Sub1_10 = new Class52_Sub1(this);
		this.aClass52_Sub1_1 = new Class52_Sub1(this);
		this.aClass52_Sub1_8 = new Class52_Sub1(this);
		this.aClass52_Sub1_6 = new Class52_Sub1(this);
		this.aClass52_Sub1_7 = new Class52_Sub1(this);
		this.aClass52_Sub1_4 = new Class52_Sub1(this);
		if (this.aBoolean428) {
			this.aClass343_4 = new Class343(this);
			new Class343(this);
		}
	}

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "()Lclient!q;")
	@Override
	public Class34 method6833() {
		return new Class34_Sub2();
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6795(@OriginalArg(0) Canvas arg0) {
		this.aLong135 = 0L;
		this.aCanvas9 = null;
		if (arg0 == null || arg0 == this.aCanvas8) {
			this.aCanvas9 = this.aCanvas8;
			this.aLong135 = this.aLong134;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable6.get(arg0);
			this.aLong135 = local36;
			this.aCanvas9 = arg0;
		}
		if (this.aCanvas9 == null || this.aLong135 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong135);
		this.method4533();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6821(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6820();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BZ)V")
	public void method4524(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean430) {
			this.aBoolean430 = arg0;
			this.method4557();
			this.anInt5568 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZZIB)V")
	public void method4525(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5592 != arg2 || this.aBoolean416 != this.aBoolean427) {
			@Pc(24) Class46_Sub2 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean416 ? 3 : 0;
			if (arg2 < 0) {
				this.method4545();
			} else {
				local24 = this.aClass276_1.method5859(arg2);
				@Pc(59) Class17 local59 = super.anInterface9_13.method947(arg2);
				if (local59.aByte18 == 0 && local59.aByte19 == 0) {
					this.method4545();
				} else {
					@Pc(75) int local75 = local59.aBoolean33 ? 64 : 128;
					@Pc(79) int local79 = local75 * 50;
					this.method4515(0.0F, (float) (local59.aByte19 * (this.anInt5559 % local79)) / (float) local79, (float) (local59.aByte18 * (this.anInt5559 % local79)) / (float) local79);
				}
				local26 = local59.anInt577;
				if (!this.aBoolean416) {
					local30 = local59.anInt576;
					local28 = local59.aByte20;
					local37 = local59.aByte22;
				}
			}
			this.aClass213_1.method4622(arg0, local28, arg1, local37, local30);
			if (!this.aClass213_1.method4629(local24, local26)) {
				this.method4535(local24);
				this.method4534(local26);
			}
			this.anInt5592 = arg2;
			this.aBoolean427 = this.aBoolean416;
		}
		this.anInt5568 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!ii;)V")
	public void method4526(@OriginalArg(1) Interface12 arg0) {
		if (this.anInterface12_1 != arg0) {
			if (this.aBoolean414) {
				OpenGL.glBindBufferARB(34963, arg0.method4196());
			}
			this.anInterface12_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class181 method6797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static499.method7034(arg0, arg3, this, arg2, arg1);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZI)V")
	public void method4527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!dk;I)V")
	@Override
	public void method6850(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		this.aClass270_1.method5827(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!lj", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method4530();
		this.method4566(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean419) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean419) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZII)V")
	public synchronized void method4528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub27 local13 = new Class1_Sub27(arg0);
		local13.aLong268 = arg1;
		this.aClass111_29.method2552(local13);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!bw;)V")
	public void method4529(@OriginalArg(1) Interface3 arg0) {
		if (this.aBoolean434) {
			this.method4490(arg0);
			this.method4521(arg0);
		} else if (this.anInt5560 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt5560 >= 0) {
				this.anInterface3Array3[this.anInt5560].method7459();
			}
			this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array3[++this.anInt5560] = arg0;
			this.anInterface3_2.method7455();
		}
	}

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "()V")
	@Override
	public void method6820() throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "(B)V")
	private void method4530() {
		if (this.anInt5568 == 1) {
			return;
		}
		this.method4540();
		this.method4506(false);
		this.method4524(false);
		this.method4547(false);
		this.method4542(false);
		this.method4535(null);
		this.method4567(-2);
		this.method4534(1);
		this.anInt5568 = 1;
	}

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "()Z")
	@Override
	public boolean method6810() {
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class5 method6832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class5_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(ZI)V")
	public void method4531(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean413 != arg0) {
			this.aBoolean413 = arg0;
			this.method4557();
		}
	}

	@OriginalMember(owner = "client!lj", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt5405) {
			arg2 = this.anInt5405;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt5524 < arg3) {
			arg3 = this.anInt5524;
		}
		this.anInt5588 = arg3;
		this.anInt5601 = arg0;
		this.anInt5591 = arg2;
		this.anInt5590 = arg1;
		OpenGL.glEnable(3089);
		this.method4551();
		this.method4501();
	}

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "(I)V")
	private void method4532() {
		OpenGL.glDepthMask(this.aBoolean410 && this.aBoolean417);
	}

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "(I)V")
	private void method4533() {
		if (this.aCanvas9 == null) {
			this.anInt5531 = this.anInt5543 = 0;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas9.getSize();
			this.anInt5531 = local6.width;
			this.anInt5543 = local6.height;
		}
		if (this.anInterface3_1 == null) {
			this.anInt5405 = this.anInt5531;
			this.anInt5524 = this.anInt5543;
			this.method4522();
		}
		this.method4553();
		this.JA();
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(II)V")
	public void method4534(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method4539(7681, 7681);
		} else if (arg0 == 0) {
			this.method4539(8448, 8448);
		} else if (arg0 == 2) {
			this.method4539(34165, 7681);
		} else if (arg0 == 3) {
			this.method4539(260, 8448);
		} else if (arg0 == 4) {
			this.method4539(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "()V")
	@Override
	public void method6834() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "()Z")
	@Override
	public boolean method6801() {
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class181_Sub2 local6 = (Class181_Sub2) arg1;
		@Pc(9) Class46_Sub2_Sub1 local9 = local6.aClass46_Sub2_Sub1_5;
		this.method4489();
		this.method4535(local6.aClass46_Sub2_Sub1_5);
		this.method4566(1);
		this.method4539(7681, 8448);
		this.method4493(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat174 / (float) local9.anInt6370;
		@Pc(46) float local46 = local9.aFloat173 / (float) local9.anInt6372;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt5601 - arg2) * local39, local46 * (float) (this.anInt5590 - arg3));
		OpenGL.glVertex2i(this.anInt5601, this.anInt5590);
		OpenGL.glTexCoord2f((float) (this.anInt5601 - arg2) * local39, local46 * (float) (this.anInt5588 - arg3));
		OpenGL.glVertex2i(this.anInt5601, this.anInt5588);
		OpenGL.glTexCoord2f((float) (this.anInt5591 - arg2) * local39, (float) (this.anInt5588 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5591, this.anInt5588);
		OpenGL.glTexCoord2f((float) (this.anInt5591 - arg2) * local39, (float) (this.anInt5590 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5591, this.anInt5590);
		OpenGL.glEnd();
		this.method4493(5890, 0, 768);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!vf;B)V")
	public void method4535(@OriginalArg(0) Class46 arg0) {
		@Pc(11) Class46 local11 = this.aClass46Array1[this.anInt5582];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt6350);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt6350);
				} else if (local11.anInt6350 != arg0.anInt6350) {
					OpenGL.glDisable(local11.anInt6350);
					OpenGL.glEnable(arg0.anInt6350);
				}
				OpenGL.glBindTexture(arg0.anInt6350, arg0.method5136());
			}
			this.aClass46Array1[this.anInt5582] = arg0;
		}
		this.anInt5568 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6836() {
		this.method4530();
		this.method4566(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6853(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas8) {
			local5 = this.aLong134;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable6.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas9 == arg0) {
			this.method4533();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6798(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aNativeHeap4 = ((Class1_Sub16_Sub1) arg0).aNativeHeap1;
		if (this.anInterface8_2 != null) {
			return;
		}
		@Pc(16) Class1_Sub3_Sub2 local16 = new Class1_Sub3_Sub2(80);
		if (this.aBoolean425) {
			local16.method7979(-1.0F);
			local16.method7979(-1.0F);
			local16.method7979(0.0F);
			local16.method7979(0.0F);
			local16.method7979(1.0F);
			local16.method7979(1.0F);
			local16.method7979(-1.0F);
			local16.method7979(0.0F);
			local16.method7979(1.0F);
			local16.method7979(1.0F);
			local16.method7979(1.0F);
			local16.method7979(1.0F);
			local16.method7979(0.0F);
			local16.method7979(1.0F);
			local16.method7979(0.0F);
			local16.method7979(-1.0F);
			local16.method7979(1.0F);
			local16.method7979(0.0F);
			local16.method7979(0.0F);
			local16.method7979(0.0F);
		} else {
			local16.method7984(-1.0F);
			local16.method7984(-1.0F);
			local16.method7984(0.0F);
			local16.method7984(0.0F);
			local16.method7984(1.0F);
			local16.method7984(1.0F);
			local16.method7984(-1.0F);
			local16.method7984(0.0F);
			local16.method7984(1.0F);
			local16.method7984(1.0F);
			local16.method7984(1.0F);
			local16.method7984(1.0F);
			local16.method7984(0.0F);
			local16.method7984(1.0F);
			local16.method7984(0.0F);
			local16.method7984(-1.0F);
			local16.method7984(1.0F);
			local16.method7984(0.0F);
			local16.method7984(0.0F);
			local16.method7984(0.0F);
		}
		this.anInterface8_2 = this.method4550(local16.anInt9802, false, local16.aByteArray104, 20);
		this.aClass226_6 = new Class226(this.anInterface8_2, 5126, 3, 0);
		this.aClass226_7 = new Class226(this.anInterface8_2, 5126, 2, 12);
		this.aClass270_1.method5830(this);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(FI)V")
	public void method4536(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat135) {
			this.aFloat135 = arg0;
			if (this.anInt5602 == 3) {
				this.method4509();
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "()Lclient!ho;")
	@Override
	public Class141 method6841() {
		@Pc(7) int local7 = -1;
		if (this.aString66.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString66.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString66.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class141(local7, "OpenGL", this.anInt5589, this.aString67, 0L);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!mq;BLclient!mq;Lclient!mq;Lclient!mq;)V")
	public void method4537(@OriginalArg(0) Class226 arg0, @OriginalArg(2) Class226 arg1, @OriginalArg(3) Class226 arg2, @OriginalArg(4) Class226 arg3) {
		if (arg2 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method4561(arg2.anInterface8_4);
			OpenGL.glVertexPointer(arg2.aByte84, arg2.aShort64, this.anInterface8_3.method7525(), this.anInterface8_3.method7524() + (long) arg2.aByte85);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method4561(arg1.anInterface8_4);
			OpenGL.glNormalPointer(arg1.aShort64, this.anInterface8_3.method7525(), this.anInterface8_3.method7524() + (long) arg1.aByte85);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method4561(arg3.anInterface8_4);
			OpenGL.glColorPointer(arg3.aByte84, arg3.aShort64, this.anInterface8_3.method7525(), this.anInterface8_3.method7524() + (long) arg3.aByte85);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method4561(arg0.anInterface8_4);
			OpenGL.glTexCoordPointer(arg0.aByte84, arg0.aShort64, this.anInterface8_3.method7525(), this.anInterface8_3.method7524() + (long) arg0.aByte85);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "(B)V")
	public void method4538() {
		if (this.anInt5568 == 8) {
			return;
		}
		this.method4559();
		this.method4506(true);
		this.method4547(true);
		this.method4542(true);
		this.method4566(1);
		this.anInt5568 = 8;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)V")
	public void method4539(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5582 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(25) boolean local25 = false;
		if (this.anInt5570 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local25 = true;
			this.anInt5570 = arg0;
		}
		if (this.anInt5580 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt5580 = arg1;
			local25 = true;
		}
		if (local25) {
			this.anInt5568 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(Z)V")
	private void method4540() {
		if (this.anInt5602 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt5405 > 0 && this.anInt5524 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt5405, (double) this.anInt5524, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt5568 &= 0xFFFFFFE7;
		this.anInt5602 = 1;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(IIII)V")
	public void method4541(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(ZI)V")
	public void method4542(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean410) {
			this.aBoolean410 = arg0;
			this.method4532();
			this.anInt5568 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class5 method6823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class5_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "(Z)V")
	private void method4543() {
		this.aFloatArray48[10] = this.aFloat151;
		this.aFloatArray48[14] = this.aFloat150;
		this.aFloat138 = this.anInt5584;
		this.aFloat137 = ((float) -this.anInt5584 + this.aFloatArray48[14]) / this.aFloatArray48[10];
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZB)V")
	public void method4544(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4525(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)I")
	@Override
	public int method6782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I[Lclient!tw;)V")
	@Override
	public void method6825(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub24[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass1_Sub24Array4[local7] = arg1[local7];
		}
		this.anInt5579 = arg0;
		if (this.anInt5602 != 1) {
			this.method4570();
		}
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6799(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class1_Sub27 local19;
		while (!this.aClass111_28.method2546()) {
			local19 = (Class1_Sub27) this.aClass111_28.method2553();
			Static426.anIntArray459[local7++] = (int) local19.aLong268;
			this.anInt5563 -= local19.anInt3348;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static426.anIntArray459, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static426.anIntArray459, 0);
			local7 = 0;
		}
		while (!this.aClass111_29.method2546()) {
			local19 = (Class1_Sub27) this.aClass111_29.method2553();
			Static426.anIntArray459[local7++] = (int) local19.aLong268;
			this.anInt5565 -= local19.anInt3348;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static426.anIntArray459, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static426.anIntArray459, 0);
			local7 = 0;
		}
		while (!this.aClass111_30.method2546()) {
			local19 = (Class1_Sub27) this.aClass111_30.method2553();
			Static426.anIntArray459[local7++] = local19.anInt3348;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static426.anIntArray459, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static426.anIntArray459, 0);
			local7 = 0;
		}
		while (!this.aClass111_31.method2546()) {
			local19 = (Class1_Sub27) this.aClass111_31.method2553();
			Static426.anIntArray459[local7++] = (int) local19.aLong268;
			this.anInt5566 -= local19.anInt3348;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static426.anIntArray459, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static426.anIntArray459, 0);
		}
		while (!this.aClass111_27.method2546()) {
			local19 = (Class1_Sub27) this.aClass111_27.method2553();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt3348);
		}
		@Pc(220) Class1 local220;
		while (!this.aClass111_32.method2546()) {
			local220 = this.aClass111_32.method2553();
			OpenGL.glDeleteProgramARB((int) local220.aLong268);
		}
		while (!this.aClass111_33.method2546()) {
			local220 = this.aClass111_33.method2553();
			OpenGL.glDeleteObjectARB(local220.aLong268);
		}
		while (!this.aClass111_27.method2546()) {
			local19 = (Class1_Sub27) this.aClass111_27.method2553();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt3348);
		}
		this.aClass276_1.method5857();
		if (this.b() > 100663296 && Static480.method6650() > this.aLong136 + 60000L) {
			System.gc();
			this.aLong136 = Static480.method6650();
		}
		this.anInt5559 = local11;
	}

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V")
	@Override
	public void method6839(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt5549 = arg0;
		this.aClass276_1.method5858();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!wn;)V")
	@Override
	public void method6781(@OriginalArg(0) Class209 arg0) {
		this.aClass209_Sub2_1 = (Class209_Sub2) arg0;
	}

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "()Z")
	@Override
	public boolean method6854() {
		if (this.aClass1_Sub15_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass1_Sub15_Sub1_1.method1206()) {
			if (!this.aClass277_1.method5867(this.aClass1_Sub15_Sub1_1)) {
				return false;
			}
			this.aClass276_1.method5858();
		}
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass34_Sub2_3.aFloat28 * (float) arg2 + (float) arg0 * this.aClass34_Sub2_3.aFloat33 + this.aClass34_Sub2_3.aFloat27 * (float) arg1 + this.aClass34_Sub2_3.aFloat30;
		if (local28 < (float) this.anInt5571 || (float) this.anInt5584 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) (((float) arg1 * this.aClass34_Sub2_3.aFloat26 + this.aClass34_Sub2_3.aFloat29 * (float) arg0 + (float) arg2 * this.aClass34_Sub2_3.aFloat31 + this.aClass34_Sub2_3.aFloat36) * (float) this.anInt5597 / local28);
		arg3[0] = (int) ((float) local85 - this.aFloat152);
		@Pc(126) int local126 = (int) ((float) this.anInt5583 * (this.aClass34_Sub2_3.aFloat35 + (float) arg0 * this.aClass34_Sub2_3.aFloat32 + (float) arg1 * this.aClass34_Sub2_3.aFloat34 + (float) arg2 * this.aClass34_Sub2_3.aFloat25) / local28);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local126 - this.aFloat143);
	}

	@OriginalMember(owner = "client!lj", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.method4566(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "(I)V")
	private void method4545() {
		if (this.aBoolean433) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean433 = false;
		}
	}

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "()V")
	@Override
	public void method6813() {
		if (this.aClass1_Sub15_Sub1_1 != null && this.aClass1_Sub15_Sub1_1.method1206()) {
			this.aClass277_1.method5866(this.aClass1_Sub15_Sub1_1);
			this.aClass276_1.method5858();
		}
	}

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "(B)V")
	private void method4546() {
		if (this.anInt5602 != 3) {
			this.anInt5602 = 3;
			this.method4509();
			this.method4505();
			this.anInt5568 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)Lclient!e;")
	@Override
	public Class1_Sub16 method6829(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub16_Sub1 local8 = new Class1_Sub16_Sub1(arg0);
		this.aClass111_26.method2552(local8);
		return local8;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!wn;Lclient!wn;FLclient!wn;)Lclient!wn;")
	@Override
	public Class209 method6811(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class209 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean424 && this.aBoolean428) {
			@Pc(15) Class209_Sub2_Sub1 local15 = null;
			@Pc(18) Class209_Sub2 local18 = (Class209_Sub2) arg0;
			@Pc(21) Class209_Sub2 local21 = (Class209_Sub2) arg1;
			@Pc(25) Class46_Sub4 local25 = local18.method7881();
			@Pc(29) Class46_Sub4 local29 = local21.method7881();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local25.anInt3712 <= local29.anInt3712 ? local29.anInt3712 : local25.anInt3712;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class209_Sub2_Sub1) {
					@Pc(56) Class209_Sub2_Sub1 local56 = (Class209_Sub2_Sub1) arg3;
					if (local56.method7766() == local44) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class209_Sub2_Sub1(this, local44);
				}
				if (local15.method7768(local29, arg2, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!lj", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt5584;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZB)V")
	public void method4547(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean409) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean409 = arg0;
		this.anInt5568 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!lj", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean416) {
			throw new RuntimeException("");
		}
		this.anInt5598 = arg1;
		this.anInt5593 = arg3;
		this.anInt5595 = arg2;
		this.anInt5577 = arg0;
		if (this.aBoolean427) {
			this.aClass213_1.aClass85_Sub1_1.method2215();
			this.aClass213_1.aClass85_Sub1_1.method2217();
		}
	}

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "(Z)V")
	public void method4548() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(II)V")
	public void method4549(@OriginalArg(1) int arg0) {
		if (this.anInt5582 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt5582 = arg0;
		}
	}

	@OriginalMember(owner = "client!lj", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4530();
		this.method4566(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZ[BI)Lclient!eq;")
	public Interface8 method4550(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		return (Interface8) (this.aBoolean414 && (!arg1 || this.aBoolean420) ? new Class126_Sub2(this, arg3, arg2, arg0, arg1) : new Class86_Sub2(this, arg3, arg2, arg0));
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIF)Lclient!tw;")
	@Override
	public Class1_Sub24 method6790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub24_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "()Z")
	@Override
	public boolean method6804() {
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5571 == arg0 && arg1 == this.anInt5584) {
			return;
		}
		this.anInt5571 = arg0;
		this.anInt5584 = arg1;
		this.method4496();
		this.method4554();
		if (this.anInt5602 == 3) {
			this.method4509();
		} else if (this.anInt5602 == 2) {
			this.method4558();
		}
	}

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "()V")
	@Override
	public void method6846() {
		if (this.aBoolean428) {
			if (this.aClass343_3 != this.anInterface3_1) {
				throw new RuntimeException();
			}
			this.aClass343_3.method7470(0);
			this.aClass343_3.method7470(8);
			this.method4495(this.aClass343_3);
		} else if (this.aBoolean426) {
			this.aClass5_Sub3_1.da(0, 0, this.anInt5405, this.anInt5524, 0, 0);
			this.anOpenGL1.setSurface(this.aLong135);
		} else {
			throw new RuntimeException("");
		}
		this.aClass5_Sub3_1 = null;
		this.anInt5405 = this.anInt5531;
		this.anInt5524 = this.anInt5543;
		this.method4553();
		this.method4522();
		this.JA();
	}

	@OriginalMember(owner = "client!lj", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(6) int local6 = this.anInt5605;
		this.anInt5605 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "(B)V")
	private void method4551() {
		this.aFloat142 = this.anInt5588 - this.anInt5599;
		this.aFloat143 = this.anInt5590 - this.anInt5599;
		this.aFloat155 = this.anInt5591 - this.anInt5596;
		this.aFloat152 = this.anInt5601 - this.anInt5596;
	}

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)V")
	@Override
	public void method6849(@OriginalArg(0) int arg0) {
		this.method4502();
	}

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "(I)V")
	private void method4552() {
		if (this.aBoolean435 && this.anInt5578 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "(I)V")
	public void method4553() {
		if (this.anInt5602 != 0) {
			this.anInt5568 &= 0xFFFFFFE0;
			this.anInt5602 = 0;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class5 method6842(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class5_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!lj", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean417 = arg0;
		this.method4532();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
	@Override
	public void method6824(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method4530();
		this.method4566(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean419) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean419) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "(I)V")
	private void method4554() {
		this.aFloat146 = (float) (this.anInt5584 - this.anInt5574) - this.aFloat136;
		this.aFloat154 = this.aFloat146 - this.aFloat144 * (float) this.anInt5578;
		if ((float) this.anInt5571 > this.aFloat154) {
			this.aFloat154 = this.anInt5571;
		}
		OpenGL.glFogf(2915, this.aFloat154);
		OpenGL.glFogf(2916, this.aFloat146);
		Static325.aFloatArray54[0] = (float) (this.anInt5600 & 0xFF0000) / 1.671168E7F;
		Static325.aFloatArray54[1] = (float) (this.anInt5600 & 0xFF00) / 65280.0F;
		Static325.aFloatArray54[2] = (float) (this.anInt5600 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static325.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt5601 || this.anInt5591 < arg0 - arg2 || this.anInt5590 > arg1 + arg2 || arg1 - arg2 > this.anInt5588) {
			return;
		}
		this.method4530();
		this.method4566(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(71) float local71 = (float) arg0 + 0.35F;
		@Pc(76) float local76 = (float) arg1 + 0.35F;
		@Pc(80) int local80 = arg2 << 1;
		if ((float) local80 < this.aFloat139) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local71 + 1.0F, local76 + 1.0F);
			OpenGL.glVertex2f(local71 + 1.0F, -1.0F + local76);
			OpenGL.glVertex2f(local71 - 1.0F, -1.0F + local76);
			OpenGL.glVertex2f(local71 - 1.0F, local76 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat147 >= (float) local80) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local80);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local71, local76);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local71, local76);
			@Pc(135) int local135 = 262144 / (arg2 * 6);
			if (local135 <= 64) {
				local135 = 64;
			} else if (local135 > 512) {
				local135 = 512;
			}
			local135 = Static505.method7085(local135);
			OpenGL.glVertex2f(local71 + (float) arg2, local76);
			for (@Pc(164) int local164 = 16384 - local135; local164 > 0; local164 -= local135) {
				OpenGL.glVertex2f((float) arg2 * Class260.aFloatArray58[local164] + local71, local76 + (float) arg2 * Class260.aFloatArray57[local164]);
			}
			OpenGL.glVertex2f((float) arg2 + local71, local76);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(ZI)V")
	public synchronized void method4555(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub27 local14 = new Class1_Sub27(arg0);
		this.aClass111_30.method2552(local14);
	}

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "()V")
	@Override
	public void method6844() {
		this.aClass277_1.method5870();
	}

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt5596, this.anInt5599, this.anInt5597, this.anInt5583 };
	}

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "(B)V")
	public void method4556() {
		if (this.anInt5568 == 4) {
			return;
		}
		this.method4540();
		this.method4506(false);
		this.method4524(false);
		this.method4547(false);
		this.method4542(false);
		this.method4567(-2);
		this.method4566(1);
		this.anInt5568 = 4;
	}

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "()Z")
	@Override
	public boolean method6802() {
		return this.aClass1_Sub15_Sub1_1 != null && this.aClass1_Sub15_Sub1_1.method1206();
	}

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "(B)V")
	private void method4557() {
		if (this.aBoolean430 && !this.aBoolean413) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!lj", name = "A", descriptor = "()Lclient!q;")
	@Override
	public Class34 method6848() {
		return this.aClass34_Sub2_1;
	}

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "(B)V")
	private void method4558() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray48, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "()Z")
	@Override
	public boolean method6828() {
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "()Z")
	@Override
	public boolean method6787() {
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "(I)V")
	private void method4559() {
		if (this.anInt5602 != 2) {
			this.anInt5602 = 2;
			this.method4558();
			this.method4505();
			this.anInt5568 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!eq;)V")
	public void method4561(@OriginalArg(1) Interface8 arg0) {
		if (this.anInterface8_3 != arg0) {
			if (this.aBoolean414) {
				OpenGL.glBindBufferARB(34962, arg0.method7526());
			}
			this.anInterface8_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(IB)I")
	public int method4562(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "()V")
	@Override
	public void method6809() {
		if (!this.aBoolean422 || this.anInt5405 <= 0 || this.anInt5524 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt5601;
		@Pc(22) int local22 = this.anInt5591;
		@Pc(25) int local25 = this.anInt5590;
		@Pc(28) int local28 = this.anInt5588;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4553();
		this.method4506(false);
		this.method4524(false);
		this.method4547(false);
		this.method4542(false);
		this.method4535(null);
		this.method4567(-2);
		this.method4534(1);
		this.method4566(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt5405, this.anInt5524, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt5524 - local12 - arg1, arg2, 1, 32993, this.anInt5594, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(ZLclient!bw;)V")
	public void method4563(@OriginalArg(1) Interface3 arg0) {
		if (this.anInt5561 < 0 || arg0 != this.anInterface3Array2[this.anInt5561]) {
			throw new RuntimeException();
		}
		this.anInterface3Array2[this.anInt5561--] = null;
		arg0.method7454();
		if (this.anInt5561 >= 0) {
			this.anInterface3_2 = this.anInterface3Array2[this.anInt5561];
			this.anInterface3_2.method7458();
		} else {
			this.anInterface3_2 = null;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!ii;ZI)V")
	public void method4564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface12 arg2) {
		@Pc(13) int local13 = arg2.method4197();
		@Pc(20) int local20 = arg1 * this.method4494(local13);
		this.method4526(arg2);
		OpenGL.glDrawElements(4, arg0, local13, arg2.method4198() + (long) local20);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!vn;[Lclient!qga;Z)Lclient!la;")
	@Override
	public Class96 method6837(@OriginalArg(0) Class352 arg0, @OriginalArg(1) Class282[] arg1) {
		return new Class96_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "()Z")
	@Override
	public boolean method6792() {
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6826(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static42.aFloat12 = arg1;
		Static380.aFloat181 = arg0;
		Static471.aFloat202 = arg2;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(III)V")
	public synchronized void method4565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub27 local8 = new Class1_Sub27(arg0);
		local8.aLong268 = arg1;
		this.aClass111_31.method2552(local8);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "()I")
	@Override
	public int method6777() {
		return 4;
	}

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "(II)V")
	public void method4566(@OriginalArg(1) int arg0) {
		if (this.anInt5569 == arg0) {
			return;
		}
		@Pc(12) boolean local12;
		@Pc(14) byte local14;
		if (arg0 == 1) {
			local12 = true;
			local14 = 1;
		} else if (arg0 == 2) {
			local12 = false;
			local14 = 2;
		} else if (arg0 == 128) {
			local14 = 3;
			local12 = true;
		} else {
			local12 = false;
			local14 = 0;
		}
		if (!this.aBoolean408) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean408 = true;
		}
		if (local12 != this.aBoolean411) {
			if (local12) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean411 = local12;
		}
		if (local14 != this.anInt5567) {
			if (local14 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local14 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local14 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt5567 = local14;
		}
		this.anInt5569 = arg0;
		this.anInt5568 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!lj", name = "L", descriptor = "()V")
	@Override
	public void L() {
		this.aBoolean416 = false;
	}

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "(II)V")
	public void method4567(@OriginalArg(1) int arg0) {
		this.method4544(arg0, true);
	}

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "()Z")
	@Override
	public boolean method6840() {
		return this.aClass1_Sub15_Sub1_1 != null && (this.anInt5546 <= 1 || this.aBoolean423);
	}

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "()Z")
	@Override
	public boolean method6845() {
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!dk;)V")
	@Override
	public void method6796(@OriginalArg(0) Class64 arg0) {
		this.aClass270_1.method5827(arg0, this, -1);
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt5565 + this.anInt5563 + this.anInt5566;
	}

	@OriginalMember(owner = "client!lj", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4542(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZZLclient!jaclib/memory/Buffer;)Lclient!eq;")
	public Interface8 method4568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Buffer arg2) {
		return (Interface8) (this.aBoolean414 ? new Class126_Sub2(this, arg0, arg2, arg1, false) : new Class86_Sub2(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLclient!cf;)V")
	public void method4569(@OriginalArg(1) Class34_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method971(), 0);
	}

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "(I)V")
	private void method4570() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt5579; local7++) {
			@Pc(20) Class1_Sub24 local20 = this.aClass1_Sub24Array4[local7];
			@Pc(24) int local24 = local7 + 16386;
			Static179.aFloatArray33[0] = local20.method7609();
			Static179.aFloatArray33[1] = local20.method7612();
			Static179.aFloatArray33[2] = local20.method7608();
			Static179.aFloatArray33[3] = 1.0F;
			OpenGL.glLightfv(local24, 4611, Static179.aFloatArray33, 0);
			@Pc(60) int local60 = local20.method7613();
			@Pc(66) float local66 = local20.method7615() / 255.0F;
			Static179.aFloatArray33[2] = (float) (local60 & 0xFF) * local66;
			Static179.aFloatArray33[0] = local66 * (float) (local60 >> 16 & 0xFF);
			Static179.aFloatArray33[1] = (float) (local60 >> 8 & 0xFF) * local66;
			OpenGL.glLightfv(local24, 4609, Static179.aFloatArray33, 0);
			OpenGL.glLightf(local24, 4617, 1.0F / (float) (local20.method7610() * local20.method7610()));
			OpenGL.glEnable(local24);
		}
		while (this.anInt5585 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt5585 = this.anInt5579;
	}
}
