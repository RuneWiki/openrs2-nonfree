import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public abstract class Class87_Sub1 extends Class87 {

	@OriginalMember(owner = "client!gt", name = "L", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!gt", name = "sb", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable4;

	@OriginalMember(owner = "client!gt", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!gt", name = "kc", descriptor = "Lclient!wv;")
	protected Class378 aClass378_6;

	@OriginalMember(owner = "client!gt", name = "dd", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!gt", name = "fe", descriptor = "I")
	public int anInt6109;

	@OriginalMember(owner = "client!gt", name = "ge", descriptor = "I")
	public int anInt6110;

	@OriginalMember(owner = "client!gt", name = "le", descriptor = "I")
	protected int anInt6113;

	@OriginalMember(owner = "client!gt", name = "se", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!gt", name = "xe", descriptor = "F")
	private float aFloat135;

	@OriginalMember(owner = "client!gt", name = "De", descriptor = "I")
	protected int anInt6117;

	@OriginalMember(owner = "client!gt", name = "Ee", descriptor = "I")
	public int anInt6118;

	@OriginalMember(owner = "client!gt", name = "Fe", descriptor = "Z")
	public boolean aBoolean445;

	@OriginalMember(owner = "client!gt", name = "Ge", descriptor = "Lclient!dw;")
	private Class74 aClass74_3;

	@OriginalMember(owner = "client!gt", name = "Ke", descriptor = "[Lclient!bh;")
	protected Class2_Sub4[] aClass2_Sub4Array3;

	@OriginalMember(owner = "client!gt", name = "Le", descriptor = "[Lclient!rr;")
	protected Class300[] aClass300Array5;

	@OriginalMember(owner = "client!gt", name = "Me", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!gt", name = "Te", descriptor = "I")
	public int anInt6123;

	@OriginalMember(owner = "client!gt", name = "We", descriptor = "I")
	public int anInt6126;

	@OriginalMember(owner = "client!gt", name = "af", descriptor = "[Lclient!fba;")
	protected Class6_Sub2[] aClass6_Sub2Array3;

	@OriginalMember(owner = "client!gt", name = "bf", descriptor = "Lclient!dj;")
	private Class75 bf;

	@OriginalMember(owner = "client!gt", name = "cf", descriptor = "I")
	private int anInt6128;

	@OriginalMember(owner = "client!gt", name = "df", descriptor = "[Lclient!rr;")
	protected Class300[] aClass300Array6;

	@OriginalMember(owner = "client!gt", name = "mf", descriptor = "I")
	private int anInt6132;

	@OriginalMember(owner = "client!gt", name = "of", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!gt", name = "pf", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!gt", name = "sf", descriptor = "I")
	protected int anInt6135;

	@OriginalMember(owner = "client!gt", name = "xf", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!gt", name = "zf", descriptor = "Z")
	protected boolean aBoolean450;

	@OriginalMember(owner = "client!gt", name = "Df", descriptor = "[Lclient!du;")
	private Interface7[] anInterface7Array3;

	@OriginalMember(owner = "client!gt", name = "Ef", descriptor = "[Lclient!fga;")
	protected Class108[] aClass108Array3;

	@OriginalMember(owner = "client!gt", name = "Ff", descriptor = "F")
	public float aFloat146;

	@OriginalMember(owner = "client!gt", name = "Hf", descriptor = "Z")
	public boolean aBoolean453;

	@OriginalMember(owner = "client!gt", name = "Mf", descriptor = "I")
	protected int anInt6143;

	@OriginalMember(owner = "client!gt", name = "Sf", descriptor = "Lclient!du;")
	public Interface7 anInterface7_3;

	@OriginalMember(owner = "client!gt", name = "bg", descriptor = "Z")
	public boolean aBoolean461;

	@OriginalMember(owner = "client!gt", name = "cg", descriptor = "I")
	protected int anInt6148;

	@OriginalMember(owner = "client!gt", name = "gg", descriptor = "Lclient!nca;")
	private Class22_Sub2 aClass22_Sub2_3;

	@OriginalMember(owner = "client!gt", name = "jg", descriptor = "I")
	public int anInt6151;

	@OriginalMember(owner = "client!gt", name = "mg", descriptor = "Z")
	protected boolean aBoolean463;

	@OriginalMember(owner = "client!gt", name = "og", descriptor = "F")
	private float aFloat149;

	@OriginalMember(owner = "client!gt", name = "pg", descriptor = "Lclient!hi;")
	public Class147 aClass147_16;

	@OriginalMember(owner = "client!gt", name = "qg", descriptor = "Lclient!hi;")
	public Class147 aClass147_17;

	@OriginalMember(owner = "client!gt", name = "rg", descriptor = "Lclient!tv;")
	public Class25_Sub3 aClass25_Sub3_21;

	@OriginalMember(owner = "client!gt", name = "tg", descriptor = "Lclient!tv;")
	public Class25_Sub3 aClass25_Sub3_22;

	@OriginalMember(owner = "client!gt", name = "ug", descriptor = "Lclient!tv;")
	public Class25_Sub3 aClass25_Sub3_23;

	@OriginalMember(owner = "client!gt", name = "vg", descriptor = "Lclient!hi;")
	private Class147 aClass147_18;

	@OriginalMember(owner = "client!gt", name = "wg", descriptor = "Lclient!hi;")
	public Class147 aClass147_19;

	@OriginalMember(owner = "client!gt", name = "xg", descriptor = "Lclient!hi;")
	public Class147 aClass147_20;

	@OriginalMember(owner = "client!gt", name = "yg", descriptor = "Lclient!tv;")
	public Class25_Sub3 aClass25_Sub3_24;

	@OriginalMember(owner = "client!gt", name = "zg", descriptor = "Lclient!tv;")
	public Class25_Sub3 aClass25_Sub3_25;

	@OriginalMember(owner = "client!gt", name = "Ag", descriptor = "Lclient!caa;")
	private Interface3 anInterface3_12;

	@OriginalMember(owner = "client!gt", name = "Bg", descriptor = "Lclient!tv;")
	public Class25_Sub3 aClass25_Sub3_26;

	@OriginalMember(owner = "client!gt", name = "Cg", descriptor = "Lclient!tv;")
	public Class25_Sub3 aClass25_Sub3_27;

	@OriginalMember(owner = "client!gt", name = "Dg", descriptor = "Lclient!tv;")
	public Class25_Sub3 aClass25_Sub3_28;

	@OriginalMember(owner = "client!gt", name = "Eg", descriptor = "Lclient!tv;")
	public Class25_Sub3 aClass25_Sub3_29;

	@OriginalMember(owner = "client!gt", name = "Fg", descriptor = "Lclient!ida;")
	private Interface10 anInterface10_8;

	@OriginalMember(owner = "client!gt", name = "Gg", descriptor = "Lclient!hi;")
	private Class147 aClass147_21;

	@OriginalMember(owner = "client!gt", name = "Hg", descriptor = "Lclient!caa;")
	private Interface3 anInterface3_13;

	@OriginalMember(owner = "client!gt", name = "Ig", descriptor = "Lclient!caa;")
	private Interface3 anInterface3_14;

	@OriginalMember(owner = "client!gt", name = "Jg", descriptor = "Lclient!hi;")
	private Class147 aClass147_22;

	@OriginalMember(owner = "client!gt", name = "Kg", descriptor = "Lclient!tv;")
	public Class25_Sub3 aClass25_Sub3_30;

	@OriginalMember(owner = "client!gt", name = "Lg", descriptor = "Z")
	protected boolean aBoolean464;

	@OriginalMember(owner = "client!gt", name = "Mg", descriptor = "I")
	private int anInt6154;

	@OriginalMember(owner = "client!gt", name = "fc", descriptor = "Lclient!nt;")
	private final Class238 aClass238_35 = new Class238();

	@OriginalMember(owner = "client!gt", name = "ke", descriptor = "Z")
	protected boolean aBoolean443 = true;

	@OriginalMember(owner = "client!gt", name = "he", descriptor = "Lclient!fba;")
	protected final Class6_Sub2 aClass6_Sub2_15 = new Class6_Sub2();

	@OriginalMember(owner = "client!gt", name = "me", descriptor = "Lclient!fba;")
	public Class6_Sub2 aClass6_Sub2_16 = new Class6_Sub2();

	@OriginalMember(owner = "client!gt", name = "ne", descriptor = "Lclient!fba;")
	public final Class6_Sub2 aClass6_Sub2_17 = new Class6_Sub2();

	@OriginalMember(owner = "client!gt", name = "oe", descriptor = "Lclient!fba;")
	protected final Class6_Sub2 aClass6_Sub2_18 = new Class6_Sub2();

	@OriginalMember(owner = "client!gt", name = "pe", descriptor = "Lclient!fba;")
	private final Class6_Sub2 aClass6_Sub2_19 = new Class6_Sub2();

	@OriginalMember(owner = "client!gt", name = "qe", descriptor = "Lclient!fba;")
	private final Class6_Sub2 aClass6_Sub2_20 = new Class6_Sub2();

	@OriginalMember(owner = "client!gt", name = "ze", descriptor = "I")
	protected int anInt6115 = 0;

	@OriginalMember(owner = "client!gt", name = "re", descriptor = "I")
	protected int anInt6114 = 0;

	@OriginalMember(owner = "client!gt", name = "Be", descriptor = "[F")
	private final float[] aFloatArray45 = new float[16];

	@OriginalMember(owner = "client!gt", name = "Ae", descriptor = "I")
	private int anInt6116 = 0;

	@OriginalMember(owner = "client!gt", name = "He", descriptor = "Z")
	private boolean aBoolean446 = false;

	@OriginalMember(owner = "client!gt", name = "ve", descriptor = "F")
	public float aFloat134 = -1.0F;

	@OriginalMember(owner = "client!gt", name = "Xe", descriptor = "I")
	protected int anInt6127 = 3584;

	@OriginalMember(owner = "client!gt", name = "Ze", descriptor = "Z")
	protected boolean aBoolean448 = true;

	@OriginalMember(owner = "client!gt", name = "ef", descriptor = "I")
	public int anInt6129 = 3;

	@OriginalMember(owner = "client!gt", name = "hf", descriptor = "F")
	public float aFloat140 = 1.0F;

	@OriginalMember(owner = "client!gt", name = "Re", descriptor = "I")
	public int anInt6122 = -1;

	@OriginalMember(owner = "client!gt", name = "lf", descriptor = "I")
	public int anInt6131 = 8;

	@OriginalMember(owner = "client!gt", name = "te", descriptor = "Lclient!ek;")
	protected Class94 aClass94_4 = Static85.aClass94_1;

	@OriginalMember(owner = "client!gt", name = "wf", descriptor = "F")
	public float aFloat144 = -1.0F;

	@OriginalMember(owner = "client!gt", name = "vf", descriptor = "I")
	private int anInt6138 = 0;

	@OriginalMember(owner = "client!gt", name = "Ue", descriptor = "I")
	private int anInt6124 = -1;

	@OriginalMember(owner = "client!gt", name = "Pe", descriptor = "I")
	public int anInt6121 = 0;

	@OriginalMember(owner = "client!gt", name = "Qe", descriptor = "[F")
	private final float[] aFloatArray47 = new float[16];

	@OriginalMember(owner = "client!gt", name = "we", descriptor = "[Lclient!dw;")
	private final Class74[] aClass74Array3 = new Class74[10];

	@OriginalMember(owner = "client!gt", name = "yf", descriptor = "I")
	private int anInt6139 = 1;

	@OriginalMember(owner = "client!gt", name = "Af", descriptor = "I")
	protected int anInt6140 = 0;

	@OriginalMember(owner = "client!gt", name = "rf", descriptor = "I")
	public int anInt6134 = 0;

	@OriginalMember(owner = "client!gt", name = "ff", descriptor = "I")
	private int anInt6130 = 0;

	@OriginalMember(owner = "client!gt", name = "Ye", descriptor = "F")
	private float aFloat138 = 1.0F;

	@OriginalMember(owner = "client!gt", name = "Ie", descriptor = "I")
	protected int anInt6119 = 0;

	@OriginalMember(owner = "client!gt", name = "kf", descriptor = "F")
	public float aFloat141 = 3584.0F;

	@OriginalMember(owner = "client!gt", name = "Lf", descriptor = "Z")
	private boolean aBoolean456 = false;

	@OriginalMember(owner = "client!gt", name = "qf", descriptor = "Z")
	protected boolean aBoolean449 = false;

	@OriginalMember(owner = "client!gt", name = "Ce", descriptor = "[F")
	private final float[] aFloatArray46 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!gt", name = "Kf", descriptor = "I")
	protected int anInt6142 = 0;

	@OriginalMember(owner = "client!gt", name = "Oe", descriptor = "F")
	public float aFloat137 = 1.0F;

	@OriginalMember(owner = "client!gt", name = "Pf", descriptor = "Z")
	private boolean aBoolean457 = false;

	@OriginalMember(owner = "client!gt", name = "Nf", descriptor = "[F")
	private final float[] aFloatArray49 = new float[16];

	@OriginalMember(owner = "client!gt", name = "tf", descriptor = "I")
	public int anInt6136 = 128;

	@OriginalMember(owner = "client!gt", name = "ag", descriptor = "I")
	private int anInt6147 = 0;

	@OriginalMember(owner = "client!gt", name = "Yf", descriptor = "Z")
	private boolean aBoolean460 = false;

	@OriginalMember(owner = "client!gt", name = "ue", descriptor = "[F")
	public final float[] aFloatArray44 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!gt", name = "Gf", descriptor = "Z")
	protected boolean aBoolean452 = false;

	@OriginalMember(owner = "client!gt", name = "If", descriptor = "Z")
	private boolean aBoolean454 = false;

	@OriginalMember(owner = "client!gt", name = "fg", descriptor = "I")
	public int anInt6149 = -1;

	@OriginalMember(owner = "client!gt", name = "Tf", descriptor = "[F")
	private final float[] aFloatArray51 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!gt", name = "gf", descriptor = "F")
	public float aFloat139 = 3584.0F;

	@OriginalMember(owner = "client!gt", name = "Cf", descriptor = "Z")
	protected boolean aBoolean451 = true;

	@OriginalMember(owner = "client!gt", name = "Qf", descriptor = "I")
	public int anInt6144 = 512;

	@OriginalMember(owner = "client!gt", name = "Wf", descriptor = "I")
	public int anInt6146 = 50;

	@OriginalMember(owner = "client!gt", name = "dg", descriptor = "[F")
	public final float[] aFloatArray52 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!gt", name = "eg", descriptor = "Z")
	protected boolean aBoolean462 = true;

	@OriginalMember(owner = "client!gt", name = "Ne", descriptor = "Z")
	protected boolean aBoolean447 = false;

	@OriginalMember(owner = "client!gt", name = "Zf", descriptor = "F")
	public float aFloat147 = 1.0F;

	@OriginalMember(owner = "client!gt", name = "Xf", descriptor = "Z")
	protected boolean aBoolean459 = true;

	@OriginalMember(owner = "client!gt", name = "Uf", descriptor = "I")
	protected final int anInt6145 = 0;

	@OriginalMember(owner = "client!gt", name = "uf", descriptor = "I")
	public int anInt6137 = 0;

	@OriginalMember(owner = "client!gt", name = "hg", descriptor = "I")
	public int anInt6150 = 512;

	@OriginalMember(owner = "client!gt", name = "Jf", descriptor = "Z")
	protected boolean aBoolean455 = false;

	@OriginalMember(owner = "client!gt", name = "Of", descriptor = "[F")
	private final float[] aFloatArray50 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!gt", name = "Je", descriptor = "I")
	private int anInt6120 = 16777215;

	@OriginalMember(owner = "client!gt", name = "Vf", descriptor = "Lclient!sn;")
	protected Class308 aClass308_8 = Static79.aClass308_14;

	@OriginalMember(owner = "client!gt", name = "kg", descriptor = "F")
	public float aFloat148 = 1.0F;

	@OriginalMember(owner = "client!gt", name = "Ve", descriptor = "I")
	private int anInt6125 = -1;

	@OriginalMember(owner = "client!gt", name = "Rf", descriptor = "Z")
	private boolean aBoolean458 = false;

	@OriginalMember(owner = "client!gt", name = "lg", descriptor = "I")
	protected final int anInt6152 = 0;

	@OriginalMember(owner = "client!gt", name = "ng", descriptor = "I")
	private int anInt6153 = -1;

	@OriginalMember(owner = "client!gt", name = "ye", descriptor = "Z")
	protected boolean aBoolean444 = true;

	@OriginalMember(owner = "client!gt", name = "Se", descriptor = "[F")
	protected float[] aFloatArray48 = this.aFloatArray50;

	@OriginalMember(owner = "client!gt", name = "ig", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!gt", name = "sg", descriptor = "Lclient!fba;")
	private final Class6_Sub2 aClass6_Sub2_21 = new Class6_Sub2();

	@OriginalMember(owner = "client!gt", name = "Gb", descriptor = "Ljava/lang/Object;")
	protected final Object anObject11;

	@OriginalMember(owner = "client!gt", name = "Nb", descriptor = "Ljava/lang/Object;")
	private Object anObject12;

	@OriginalMember(owner = "client!gt", name = "be", descriptor = "Lclient!eq;")
	protected final Class97 aClass97_86;

	@OriginalMember(owner = "client!gt", name = "Id", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas8;

	@OriginalMember(owner = "client!gt", name = "wd", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!gt", name = "Bf", descriptor = "I")
	protected final int anInt6141;

	@OriginalMember(owner = "client!gt", name = "xd", descriptor = "I")
	private int anInt6077;

	@OriginalMember(owner = "client!gt", name = "ud", descriptor = "I")
	public int anInt6075;

	@OriginalMember(owner = "client!gt", name = "Ob", descriptor = "I")
	private int anInt5996;

	@OriginalMember(owner = "client!gt", name = "A", descriptor = "I")
	public int anInt5936;

	@OriginalMember(owner = "client!gt", name = "nf", descriptor = "I")
	public final int anInt6133;

	@OriginalMember(owner = "client!gt", name = "zb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!gt", name = "jf", descriptor = "Lclient!mv;")
	private final Class225 aClass225_3;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!eq;II)V")
	protected Class87_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface6 arg2, @OriginalArg(3) Class97 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anObject12 = this.anObject11 = arg1;
		this.aClass97_86 = arg3;
		this.aCanvas7 = this.aCanvas8 = arg0;
		this.anInt6141 = arg4;
		@Pc(305) Dimension local305 = arg0.getSize();
		this.anInt6075 = this.anInt6077 = local305.height;
		this.anInt5936 = this.anInt5996 = local305.width;
		this.anInt6133 = arg5;
		Static240.method3965(false, true);
		if (super.anInterface6_11 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt6133);
			this.aClass225_3 = null;
		} else {
			this.aClass225_3 = new Class225(this, super.anInterface6_11);
			this.aNativeInterface3 = new NativeInterface(super.anInterface6_11.method6353(), this.anInt6133);
			for (@Pc(362) int local362 = 0; local362 < super.anInterface6_11.method6353(); local362++) {
				@Pc(369) Class199 local369 = super.anInterface6_11.method6357(local362);
				if (local369 != null) {
					this.aNativeInterface3.initTextureMetrics(local362, local369.aByte84, local369.aByte83);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6128 = arg0;
		this.anInt6125 = arg2;
		this.anInt6124 = arg1;
		this.aBoolean461 = true;
		this.anInt6147 = arg3;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)V")
	public abstract void method5018();

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt6146;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(B)V")
	private void method5019() {
		this.aFloat141 = this.anInt6127;
	}

	@OriginalMember(owner = "client!gt", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Interface26 local9 = local6.anInterface26_5;
		this.method5152();
		this.method5079(local9);
		this.method5093(1);
		this.method5133(Static148.aClass300_3, Static148.aClass300_3);
		this.method5131(0, Static358.aClass315_1);
		this.method5075(arg0);
		this.aClass6_Sub2_15.method2717(0.0F, (float) this.anInt5936, (float) this.anInt6075);
		this.method5022();
		this.aClass6_Sub2Array3[0].method2717(1.0F, local9.method8056((float) this.anInt5936), local9.method8049((float) this.anInt6075));
		this.aClass6_Sub2Array3[0].method2710(local9.method8049((float) -arg3), local9.method8056((float) -arg2), 0.0F);
		this.aClass108Array3[0] = Static542.aClass108_23;
		this.method5040();
		this.method5120();
		this.method5127();
		this.method5131(0, Static516.aClass315_3);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IF)V")
	public final void method5020(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat138) {
			this.aFloat138 = arg0;
			this.method5049();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLclient!cv;)V")
	public abstract void method5021(@OriginalArg(1) Class62 arg0);

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)V")
	public final void method5022() {
		this.aBoolean443 = false;
		this.method5117();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!fga;I)V")
	public final void method5023(@OriginalArg(0) Class108 arg0) {
		this.aClass108Array3[this.anInt6114] = arg0;
		this.method5040();
	}

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "(I)V")
	public final void method5024() {
		if (this.aClass308_8 == Static79.aClass308_14) {
			return;
		}
		@Pc(14) Class308 local14 = this.aClass308_8;
		this.aClass308_8 = Static79.aClass308_14;
		if (local14.method7333()) {
			this.method5121();
		}
		this.anInt6132 &= 0xFFFFFFE0;
		this.aFloatArray48 = this.aFloatArray50;
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(B)V")
	protected abstract void method5025();

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(B)V")
	protected abstract void method5026();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7924(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas8 == arg0) {
			local5 = this.anObject12;
		} else if (this.aHashtable4.containsKey(arg0)) {
			local5 = this.aHashtable4.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method5097(local5, arg0);
		if (arg0 == this.aCanvas7) {
			this.method5030();
		}
	}

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "(B)V")
	private void method5027() {
		this.anInterface3_12 = this.method5043(false);
		this.anInterface3_12.method7186(28, 140);
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			@Pc(25) Buffer local25 = this.anInterface3_12.method7189();
			if (local25 != null) {
				@Pc(32) Stream local32 = this.method5128(local25);
				if (Stream.b()) {
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(1.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(1.0F);
					local32.b(0.0F);
					local32.b(1.0F);
					local32.b(1.0F);
					local32.b(1.0F);
					local32.b(0.0F);
					local32.b(1.0F);
					local32.b(1.0F);
					local32.b(1.0F);
					local32.b(1.0F);
					local32.b(1.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(1.0F);
					local32.b(0.0F);
					local32.b(1.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
				} else {
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(1.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(1.0F);
					local32.a(0.0F);
					local32.a(1.0F);
					local32.a(1.0F);
					local32.a(1.0F);
					local32.a(0.0F);
					local32.a(1.0F);
					local32.a(1.0F);
					local32.a(1.0F);
					local32.a(1.0F);
					local32.a(1.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(1.0F);
					local32.a(0.0F);
					local32.a(1.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
				}
				local32.a();
				if (this.anInterface3_12.method7187()) {
					break;
				}
			}
		}
		this.aClass147_21 = this.method5083(new Class241[] { new Class241(new Class365[] { Static620.aClass365_1, Static620.aClass365_5, Static620.aClass365_5 }) });
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method5028(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!taa;ZI)V")
	protected abstract void method5029(@OriginalArg(1) Class315 arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(Z)V")
	private void method5030() {
		if (this.aCanvas7 == null) {
			this.anInt5996 = this.anInt6077 = 1;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas7.getSize();
			this.anInt5996 = local14.width;
			this.anInt6077 = local14.height;
		}
		this.anInt6075 = this.anInt6077;
		this.anInt5936 = this.anInt5996;
		this.method5153();
		this.method5067();
		this.method5049();
		this.method5134();
		this.method5140();
		this.method5024();
		this.la();
	}

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "(I)V")
	protected abstract void method5031();

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "(B)V")
	protected abstract void method5032();

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "()Z")
	@Override
	public final boolean method7912() {
		return true;
	}

	@OriginalMember(owner = "client!gt", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5057();
		this.method5075(arg3);
		this.method5131(0, Static358.aClass315_1);
		this.method5118(0, Static358.aClass315_1);
		this.method5093(arg4);
		this.aClass6_Sub2_15.method2717(1.0F, (float) arg2, (float) arg2);
		this.aClass6_Sub2_15.method6694(arg0, arg1, 0);
		this.method5022();
		this.method5078(false);
		this.method5148(this.anInterface3_13, 0);
		this.method5110(this.aClass147_18);
		this.method5090(Static334.aClass334_6, 256, 0);
		this.method5078(true);
		this.method5118(0, Static516.aClass315_3);
		this.method5131(0, Static516.aClass315_3);
	}

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "(I)V")
	protected void method5033() {
		this.anInt6143 = this.anInt6135;
		this.anInt6135 = 0;
	}

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7943() {
		return this.aBoolean450;
	}

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "(B)V")
	protected abstract void method5035();

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7946(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas8 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.method5028(arg0, this.aHashtable4.get(arg0));
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "(I)V")
	private void method5036() {
		this.method5148(this.anInterface3_14, 0);
		this.method5110(this.aClass147_22);
		this.method5090(Static64.aClass334_1, 1, 0);
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)V")
	@Override
	public void method7918(@OriginalArg(0) int arg0) {
		if (this.aClass225_3 != null) {
			this.aClass225_3.method5518();
		}
		this.anInt6123 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!ww;IIII)Lclient!ka;")
	@Override
	public final Class25 method7975(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class25_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "(I)V")
	protected abstract void method5037();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[F)[F")
	public final float[] method5038(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloatArray48[1];
		arg0[8] = this.aFloatArray48[2];
		arg0[0] = this.aFloatArray48[0];
		arg0[12] = this.aFloatArray48[3];
		arg0[9] = this.aFloatArray48[6];
		arg0[2] = this.aFloatArray48[8];
		arg0[5] = this.aFloatArray48[5];
		arg0[13] = this.aFloatArray48[7];
		arg0[1] = this.aFloatArray48[4];
		arg0[7] = this.aFloatArray48[13];
		arg0[6] = this.aFloatArray48[9];
		arg0[3] = this.aFloatArray48[12];
		arg0[10] = this.aFloatArray48[10];
		arg0[14] = this.aFloatArray48[11];
		arg0[15] = this.aFloatArray48[15];
		arg0[11] = this.aFloatArray48[14];
		return arg0;
	}

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "(I)V")
	protected final void method5039() {
		@Pc(13) Hashtable local13 = new Hashtable();
		if (this.aHashtable4 != null && !this.aHashtable4.isEmpty()) {
			@Pc(24) Enumeration local24 = this.aHashtable4.keys();
			while (local24.hasMoreElements()) {
				@Pc(29) Canvas local29 = (Canvas) local24.nextElement();
				local13.put(local29, this.method5074(local29));
			}
		}
		this.aHashtable4 = local13;
		this.method5027();
		this.method5143();
		this.method5115();
		this.bf.method1662(this);
	}

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7936() {
		return true;
	}

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "(I)V")
	@Override
	public final void method7938(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gt", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt6120;
		if (local15 || arg1 != this.aFloat144 || this.aFloat134 != arg2) {
			this.anInt6120 = arg0;
			this.aFloat144 = arg1;
			this.aFloat134 = arg2;
			if (local15) {
				this.aFloat137 = (float) (this.anInt6120 & 0xFF0000) / 1.671168E7F;
				this.aFloat148 = (float) (this.anInt6120 & 0xFF) / 255.0F;
				this.aFloat147 = (float) (this.anInt6120 & 0xFF00) / 65280.0F;
				this.method5122();
			}
			this.aNativeInterface3.setSunColour(this.aFloat137, this.aFloat147, this.aFloat148, arg1, arg2);
			this.method5046();
		}
		if (this.aFloatArray46[0] != arg3 || this.aFloatArray46[1] != arg4 || arg5 != this.aFloatArray46[2]) {
			this.aFloatArray46[2] = arg5;
			this.aFloatArray46[0] = arg3;
			this.aFloatArray46[1] = arg4;
			this.aFloatArray51[2] = -arg5;
			this.aFloatArray51[0] = -arg3;
			this.aFloatArray51[1] = -arg4;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray52[2] = local153 * arg5;
			this.aFloatArray52[0] = arg3 * local153;
			this.aFloatArray52[1] = local153 * arg4;
			this.aFloatArray44[0] = -this.aFloatArray52[0];
			this.aFloatArray44[2] = -this.aFloatArray52[2];
			this.aFloatArray44[1] = -this.aFloatArray52[1];
			this.aNativeInterface3.setSunDirection(this.aFloatArray52[0], this.aFloatArray52[1], this.aFloatArray52[2]);
			this.method5018();
			this.anInt6126 = (int) (arg3 * 256.0F / arg4);
			this.anInt6118 = (int) (arg5 * 256.0F / arg4);
		}
		this.method5096();
	}

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "(I)V")
	private void method5040() {
		this.method5026();
		if (this.aClass74_3 != null) {
			this.aClass74_3.method8246();
		}
	}

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "(I)V")
	public final void method5041() {
		if (this.anInt6132 == 16) {
			return;
		}
		this.method5126();
		this.method5112(true);
		this.method5088(true);
		this.method5053(true);
		this.method5093(1);
		this.anInt6132 = 16;
	}

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "()V")
	@Override
	public final void method7917() {
		if (this.aClass225_3 != null) {
			this.aClass225_3.method5520();
		}
	}

	@OriginalMember(owner = "client!gt", name = "u", descriptor = "(I)V")
	protected void method5042() {
		this.method5066();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BZ)Lclient!caa;")
	public abstract Interface3 method5043(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIF)Lclient!bh;")
	@Override
	public final Class2_Sub4 method7928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub4_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!sfa;)V")
	@Override
	public final void method7934(@OriginalArg(0) Class22 arg0) {
		this.aClass22_Sub2_3 = (Class22_Sub2) arg0;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V")
	@Override
	public final void method7911(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass225_3 != null) {
			this.aClass225_3.method5520();
		}
		this.anInt6136 = arg0;
	}

	@OriginalMember(owner = "client!gt", name = "v", descriptor = "(I)V")
	private void method5044() {
		if (this.aBoolean458) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray47;
		@Pc(9) float local9 = (float) this.anInt6146;
		@Pc(13) float local13 = (float) this.anInt6127;
		@Pc(25) float local25 = (float) -this.anInt6134 * this.aFloat138 / (float) this.anInt6150;
		@Pc(37) float local37 = this.aFloat138 * (float) -this.anInt6121 / (float) this.anInt6144;
		@Pc(52) float local52 = (float) (this.anInt5936 - this.anInt6121) * this.aFloat138 / (float) this.anInt6144;
		@Pc(67) float local67 = (float) (this.anInt6075 - this.anInt6134) * this.aFloat138 / (float) this.anInt6150;
		if (local37 == local52 || local67 == local25) {
			local5[14] = 0.0F;
			local5[15] = 1.0F;
			local5[3] = 0.0F;
			local5[0] = 1.0F;
			local5[12] = 0.0F;
			local5[8] = 0.0F;
			local5[4] = 0.0F;
			local5[1] = 0.0F;
			local5[5] = 1.0F;
			local5[9] = 0.0F;
			local5[6] = 0.0F;
			local5[2] = 0.0F;
			local5[13] = 0.0F;
			local5[7] = 0.0F;
			local5[10] = 1.0F;
			local5[11] = 0.0F;
		} else {
			local5[2] = 0.0F;
			local5[3] = 0.0F;
			local5[11] = 0.0F;
			local5[15] = 1.0F;
			local5[13] = (local67 + local25) / (-local25 + local67);
			local5[1] = 0.0F;
			local5[14] = local9 / (local9 - local13);
			local5[5] = 2.0F / (local67 - local25);
			local5[8] = 0.0F;
			local5[7] = 0.0F;
			local5[9] = 0.0F;
			local5[12] = (local37 + local52) / (-local52 + local37);
			local5[0] = 2.0F / (local52 - local37);
			local5[6] = 0.0F;
			local5[10] = 1.0F / (local9 - local13);
			local5[4] = 0.0F;
		}
		this.method5019();
		this.aBoolean458 = true;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZBIIZI)V")
	private void method5045(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) boolean local8 = arg0 & this.method7962();
		if (!local8 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			arg2 = 2;
			arg1 = 1;
			arg4 = 0;
		}
		if (arg2 != 0 && arg3) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt6116) {
			if (this.anInt6116 != 0) {
				this.aClass74Array3[this.anInt6116 & Integer.MAX_VALUE].method8249();
			}
			if (arg2 == 0) {
				this.aClass74_3 = null;
			} else {
				this.aClass74_3 = this.aClass74Array3[Integer.MAX_VALUE & arg2];
				this.aClass74_3.method8251(arg3);
				this.aClass74_3.method8253(arg3);
				this.aClass74_3.method8243(arg4, arg1);
			}
			this.anInt6116 = arg2;
			this.anInt6138 = arg1;
			this.anInt6130 = arg4;
		} else if (this.anInt6116 != 0) {
			this.aClass74Array3[this.anInt6116 & Integer.MAX_VALUE].method8253(arg3);
			if (arg4 != this.anInt6130 || this.anInt6138 != arg1) {
				this.aClass74Array3[Integer.MAX_VALUE & this.anInt6116].method8243(arg4, arg1);
				this.anInt6130 = arg4;
				this.anInt6138 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "(B)V")
	protected abstract void method5046();

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "(I)V")
	public final void method5047() {
		this.aClass6_Sub2_15.method6706();
		this.aBoolean443 = true;
		this.method5117();
	}

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "(I)V")
	@Override
	public final void method7947() {
	}

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "(B)V")
	protected abstract void method5048();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "([IIIIIZ)Lclient!kr;")
	@Override
	public final Class20 method7956(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class20_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "(B)V")
	private void method5049() {
		this.aBoolean458 = false;
		this.method5044();
		if (Static199.aClass308_6 == this.aClass308_8) {
			this.method5095();
		}
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "()Lclient!kd;")
	@Override
	public final Class6 method7910() {
		return new Class6_Sub2();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)Lclient!ida;")
	public final Interface10 method5051(@OriginalArg(0) int arg0) {
		if (arg0 * 2 > this.anInterface10_8.method7668()) {
			this.anInterface10_8.method7675(arg0);
		}
		return this.anInterface10_8;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZZBILclient!taa;)V")
	public abstract void method5052(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class315 arg3);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZI)V")
	public final void method5053(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean447 != arg0) {
			this.aBoolean447 = arg0;
			this.method5138();
			this.anInt6132 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "(B)V")
	public final void method5054() {
		this.method5024();
		this.method5095();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class112 method7957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class112_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method7925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static177.method3262(arg1, arg3, arg0, arg2, this);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BB)V")
	public final void method5055(@OriginalArg(1) byte arg0) {
		this.method5075(arg0 | arg0 << 8 | arg0 << 16 | arg0 << 24);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!kca;IBI[BI)Lclient!ii;")
	public abstract Interface11 method5056(@OriginalArg(0) Class187 arg0, @OriginalArg(4) byte[] arg1);

	@OriginalMember(owner = "client!gt", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass6_Sub2_16.method2723((float) arg0, (float) arg2, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt6144 * this.aClass6_Sub2_16.method2702((float) arg2, (float) arg0, (float) arg1) / local14);
			local58 = (int) ((float) this.anInt6150 * this.aClass6_Sub2_16.method2721((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local40 = this.anInt6121;
			local58 = this.anInt6134;
		}
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local58 - this.aFloat133);
		arg3[0] = (int) ((float) local40 - this.aFloat146);
	}

	@OriginalMember(owner = "client!gt", name = "x", descriptor = "(I)V")
	private void method5057() {
		if (this.anInt6132 == 1) {
			return;
		}
		this.method5072();
		this.method5112(false);
		this.method5108(false);
		this.method5088(false);
		this.method5053(false);
		this.method5071(false, false, -2);
		this.method5062(1);
		this.method5079(this.anInterface7_3);
		this.anInt6132 = 1;
	}

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "(I)V")
	protected abstract void method5058();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II[FLclient!kca;IZ)Lclient!wda;")
	public final Interface26 method5059(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) Class187 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method5102(arg1, arg0, arg4, arg3, arg2);
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(II)I")
	@Override
	public final int method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(III[IZIZ)Lclient!wda;")
	public abstract Interface26 method5060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "(B)I")
	public final int method5061() {
		return this.anInt6125;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)V")
	public final void method5062(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method5133(Static148.aClass300_3, Static148.aClass300_3);
		} else if (arg0 == 0) {
			this.method5133(Static40.aClass300_1, Static40.aClass300_1);
		} else if (arg0 == 2) {
			this.method5133(Static148.aClass300_3, Static215.aClass300_4);
		} else if (arg0 == 3) {
			this.method5133(Static40.aClass300_1, Static591.aClass300_5);
		} else if (arg0 == 4) {
			this.method5133(Static52.aClass300_6, Static52.aClass300_6);
		}
	}

	@OriginalMember(owner = "client!gt", name = "z", descriptor = "(I)Lclient!fba;")
	public final Class6_Sub2 method5063() {
		return this.aClass6_Sub2Array3[this.anInt6114];
	}

	@OriginalMember(owner = "client!gt", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass6_Sub2_16.method2723((float) arg0, (float) arg2, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt6144 * this.aClass6_Sub2_16.method2702((float) arg2, (float) arg0, (float) arg1) / local14);
			local58 = (int) ((float) this.anInt6150 * this.aClass6_Sub2_16.method2721((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local40 = this.anInt6121;
			local58 = this.anInt6134;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat146);
		arg3[1] = (int) ((float) local58 - this.aFloat133);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!gt", name = "A", descriptor = "(I)V")
	private void method5064() {
		this.aFloatArray49[10] = this.aFloat149;
		this.aFloatArray49[14] = this.aFloat135;
		this.aFloat139 = ((float) -this.anInt6127 + this.aFloatArray49[14]) / this.aFloatArray49[10];
	}

	@OriginalMember(owner = "client!gt", name = "A", descriptor = "()V")
	@Override
	protected void method7970() {
		if (this.aBoolean456) {
			return;
		}
		for (@Pc(11) Class2 local11 = this.aClass238_35.method5833(); local11 != null; local11 = this.aClass238_35.method5838()) {
			((Class2_Sub11_Sub2) local11).method8171();
		}
		@Pc(27) Enumeration local27 = this.aHashtable4.keys();
		while (local27.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local27.nextElement();
			this.method5028(local32, this.aHashtable4.get(local32));
		}
		Static410.method6301(false, true);
		this.aNativeInterface3.release();
		this.aBoolean456 = true;
	}

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "(II)V")
	public abstract void method5065(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gt", name = "B", descriptor = "(I)V")
	private void method5066() {
		this.method5122();
		this.method5046();
		this.method5031();
		this.method5033();
		this.method5018();
		this.method5096();
		this.method5092();
		this.method5035();
		this.method5138();
		this.method5146();
		this.method5105();
		this.method5109();
		this.method5025();
		this.method5080();
		for (@Pc(54) int local54 = this.anInt6151 - 1; local54 >= 0; local54--) {
			this.method5116(local54);
			this.method5086();
			this.method5069();
			this.method5127();
		}
		this.method5073();
		this.method5134();
		this.method5032();
		this.method5145();
		this.method5048();
	}

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "(B)V")
	private void method5067() {
		this.aBoolean446 = false;
		this.method5082();
		if (Static401.aClass308_11 == this.aClass308_8) {
			this.method5095();
		}
	}

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "(B)[F")
	public final float[] method5068() {
		return this.aFloatArray50;
	}

	@OriginalMember(owner = "client!gt", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!gt", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean461 = false;
	}

	@OriginalMember(owner = "client!gt", name = "C", descriptor = "(I)V")
	protected abstract void method5069();

	@OriginalMember(owner = "client!gt", name = "x", descriptor = "()Z")
	@Override
	public final boolean method7962() {
		return this.aClass74Array3[3].method8245();
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(Z)I")
	public final int method5070() {
		return this.anInt6114;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZZBI)V")
	public final void method5071(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt6153 != arg2 || this.aBoolean461 != this.aBoolean454) {
			@Pc(20) Interface26 local20 = null;
			@Pc(22) int local22 = 0;
			@Pc(24) byte local24 = 0;
			@Pc(26) int local26 = 0;
			@Pc(33) int local33 = this.aBoolean461 ? 3 : 0;
			if (arg2 < 0) {
				this.method5127();
			} else {
				local20 = this.aClass225_3.method5519(arg2);
				@Pc(55) Class199 local55 = super.anInterface6_11.method6357(arg2);
				if (local55.aByte88 == 0 && local55.aByte87 == 0) {
					this.method5127();
				} else {
					@Pc(76) int local76 = local55.aBoolean428 ? 64 : 128;
					@Pc(80) int local80 = local76 * 50;
					@Pc(84) Class6_Sub2 local84 = this.method5141();
					local84.method2718((float) (local55.aByte88 * (this.anInt6123 % local80)) / (float) local80, 0.0F, (float) (local55.aByte87 * (this.anInt6123 % local80)) / (float) local80);
					this.method5023(Static542.aClass108_23);
				}
				if (!this.aBoolean461) {
					local24 = local55.aByte82;
					local33 = local55.aByte86;
					local26 = local55.anInt5688;
				}
				local22 = local55.anInt5687;
			}
			this.method5045(arg1, local26, local33, arg0, local24);
			if (this.aClass74_3 == null) {
				this.method5079(local20);
				this.method5062(local22);
			} else {
				this.aClass74_3.method8250(local20, local22);
			}
			this.aBoolean454 = this.aBoolean461;
			this.anInt6153 = arg2;
		}
		this.anInt6132 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7974(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas8 == arg0) {
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
			@Pc(53) Object local53 = this.method5074(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable4.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!gt", name = "D", descriptor = "(I)V")
	private void method5072() {
		if (Static84.aClass308_2 == this.aClass308_8) {
			return;
		}
		@Pc(14) Class308 local14 = this.aClass308_8;
		this.aClass308_8 = Static84.aClass308_2;
		if (local14.method7333()) {
			this.method5121();
		}
		this.method5101();
		this.aFloatArray48 = this.aFloatArray45;
		this.method5095();
		this.anInt6132 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "(B)V")
	protected abstract void method5073();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	protected abstract Object method5074(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "(II)V")
	public final void method5075(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt6117) {
			this.anInt6117 = arg0;
			this.method5073();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method7976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) float local12 = (float) -arg0 + (float) arg2;
		@Pc(19) float local19 = (float) -arg1 + (float) arg3;
		@Pc(40) float local40;
		if (local12 == 0.0F && local19 == 0.0F) {
			local12 = 1.0F;
		} else {
			local40 = (float) (1.0D / Math.sqrt((double) (local19 * local19 + local12 * local12)));
			local12 *= local40;
			local19 *= local40;
		}
		this.method5057();
		this.method5075(arg4);
		this.method5131(0, Static358.aClass315_1);
		this.method5118(0, Static358.aClass315_1);
		this.method5093(1);
		this.method5047();
		this.method5078(false);
		@Pc(86) int local86 = arg7 % (arg5 + arg6);
		local40 = (float) arg5 * local12;
		@Pc(96) float local96 = local19 * (float) arg5;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = 0.0F;
		@Pc(102) float local102 = local40;
		@Pc(104) float local104 = local96;
		if (local86 > arg5) {
			local100 = local19 * (float) (arg6 + arg5 - local86);
			local98 = (float) (arg6 + arg5 - local86) * local12;
		} else {
			local104 = (float) (arg5 - local86) * local19;
			local102 = local12 * (float) (arg5 - local86);
		}
		@Pc(147) float local147 = local98 + (float) arg0;
		@Pc(152) float local152 = (float) arg1 + local100;
		@Pc(157) float local157 = local12 * (float) arg6;
		@Pc(162) float local162 = local19 * (float) arg6;
		while (true) {
			if (arg2 <= arg0) {
				if (local147 < (float) arg2) {
					break;
				}
				if (local102 + local147 < (float) arg2) {
					local102 = (float) arg2 - local147;
				}
			} else {
				if ((float) arg2 < local147) {
					break;
				}
				if (local102 + local147 > (float) arg2) {
					local102 = (float) arg2 - local147;
				}
			}
			if (arg1 >= arg3) {
				if (local152 < (float) arg3) {
					break;
				}
				if ((float) arg3 > local104 + local152) {
					local104 = (float) arg3 - local152;
				}
			} else {
				if (local152 > (float) arg3) {
					break;
				}
				if ((float) arg3 < local152 + local104) {
					local104 = (float) arg3 - local152;
				}
			}
			if (!this.method5106(local152, local104 + local152, local147 + local102, 0.0F, local147, 0.0F)) {
				return;
			}
			local147 += local157 + local102;
			local152 += local104 + local162;
			this.method5036();
			local104 = local96;
			local102 = local40;
		}
		this.method5078(true);
		this.method5118(0, Static516.aClass315_3);
		this.method5131(0, Static516.aClass315_3);
	}

	@OriginalMember(owner = "client!gt", name = "E", descriptor = "(I)V")
	protected final void method5076() {
		@Pc(9) Enumeration local9 = this.aHashtable4.keys();
		while (local9.hasMoreElements()) {
			@Pc(23) Canvas local23 = (Canvas) local9.nextElement();
			this.method5028(local23, this.aHashtable4.get(local23));
		}
		this.anInterface3_12.method7671();
		this.anInterface3_14.method7671();
		this.anInterface3_13.method7671();
		this.aClass25_Sub3_26.method7737();
		this.aClass25_Sub3_29.method7737();
		this.aClass25_Sub3_21.method7737();
		this.aClass25_Sub3_28.method7737();
		this.aClass25_Sub3_23.method7737();
		this.bf.method1661();
		this.anInterface10_8.method7671();
	}

	@OriginalMember(owner = "client!gt", name = "F", descriptor = "(I)V")
	protected abstract void method5077();

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "()Z")
	@Override
	public final boolean method7967() {
		return false;
	}

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public final Class2_Sub11 method7920(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub11_Sub2 local8 = new Class2_Sub11_Sub2(arg0);
		this.aClass238_35.method5837(local8);
		return local8;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!oo;)V")
	@Override
	public final void method7939(@OriginalArg(0) Class247 arg0) {
		this.bf.method1663(this, arg0, -1);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZZ)V")
	public abstract void method5078(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!gt", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt6115;
		arg0[2] = this.anInt6142;
		arg0[1] = this.anInt6140;
		arg0[0] = this.anInt6119;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!du;)V")
	public final void method5079(@OriginalArg(1) Interface7 arg0) {
		if (arg0 == this.anInterface7Array3[this.anInt6114]) {
			return;
		}
		this.anInterface7Array3[this.anInt6114] = arg0;
		if (arg0 == null) {
			this.method5058();
		} else {
			arg0.method8048();
		}
		this.anInt6132 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "(B)V")
	protected abstract void method5080();

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(Z)I")
	public final int method5081() {
		return this.anInt6147;
	}

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "(B)V")
	private void method5082() {
		if (this.aBoolean446) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray49;
		@Pc(25) float local25 = (float) (this.anInt6146 * -this.anInt6121) / (float) this.anInt6144;
		@Pc(40) float local40 = (float) ((this.anInt5936 - this.anInt6121) * this.anInt6146) / (float) this.anInt6144;
		@Pc(51) float local51 = (float) (this.anInt6134 * this.anInt6146) / (float) this.anInt6150;
		@Pc(66) float local66 = (float) (this.anInt6146 * (this.anInt6134 - this.anInt6075)) / (float) this.anInt6150;
		if (local25 == local40 || local66 == local51) {
			local13[8] = 0.0F;
			local13[7] = 0.0F;
			local13[10] = 1.0F;
			local13[9] = 0.0F;
			local13[1] = 0.0F;
			local13[5] = 1.0F;
			local13[14] = 0.0F;
			local13[0] = 1.0F;
			local13[11] = 0.0F;
			local13[4] = 0.0F;
			local13[13] = 0.0F;
			local13[15] = 1.0F;
			local13[6] = 0.0F;
			local13[2] = 0.0F;
			local13[3] = 0.0F;
			local13[12] = 0.0F;
		} else {
			@Pc(80) float local80 = (float) this.anInt6146 * 2.0F;
			local13[13] = 0.0F;
			local13[12] = 0.0F;
			local13[0] = local80 / (local40 - local25);
			local13[6] = 0.0F;
			local13[3] = 0.0F;
			local13[4] = 0.0F;
			local13[7] = 0.0F;
			local13[10] = this.aFloat149 = (float) this.anInt6127 / (float) (this.anInt6146 - this.anInt6127);
			local13[15] = 0.0F;
			local13[1] = 0.0F;
			local13[9] = (local66 + local51) / (-local66 + local51);
			local13[14] = this.aFloat135 = (float) (this.anInt6146 * this.anInt6127) / (float) (this.anInt6146 - this.anInt6127);
			local13[11] = -1.0F;
			local13[8] = (local25 + local40) / (local40 - local25);
			local13[2] = 0.0F;
			local13[5] = local80 / (local51 - local66);
		}
		this.method5064();
		this.aBoolean446 = true;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[Lclient!ofa;)Lclient!hi;")
	public abstract Class147 method5083(@OriginalArg(1) Class241[] arg0);

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "(B)V")
	protected abstract void method5084();

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "(B)V")
	public final void method5085() {
		if (this.anInt6132 == 4) {
			return;
		}
		this.method5072();
		this.method5112(false);
		this.method5108(false);
		this.method5088(false);
		this.method5053(false);
		this.method5071(false, false, -2);
		this.method5093(1);
		this.method5062(0);
		this.anInt6132 = 4;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!fw;Z)Lclient!kr;")
	@Override
	public final Class20 method7969(@OriginalArg(0) Class120 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(124) Class20 local124;
		if (arg0.anInt3710 == 0 || arg0.anInt3707 == 0) {
			local124 = this.method7913(1, new int[1], 1, 1);
		} else {
			@Pc(21) int[] local21 = new int[arg0.anInt3710 * arg0.anInt3707];
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg0.aByteArray35 == null) {
				for (local30 = 0; local30 < arg0.anInt3707; local30++) {
					for (local34 = 0; local34 < arg0.anInt3710; local34++) {
						@Pc(47) int local47 = arg0.anIntArray261[arg0.aByteArray36[local23++] & 0xFF];
						local21[local25++] = local47 == 0 ? 0 : local47 | 0xFF000000;
					}
				}
			} else {
				for (local30 = 0; local30 < arg0.anInt3707; local30++) {
					for (local34 = 0; local34 < arg0.anInt3710; local34++) {
						local21[local25++] = arg0.anIntArray261[arg0.aByteArray36[local23] & 0xFF] | arg0.aByteArray35[local23] << 24;
						local23++;
					}
				}
			}
			local124 = this.method7913(arg0.anInt3710, local21, arg0.anInt3710, arg0.anInt3707);
		}
		local124.method4592(arg0.anInt3708, arg0.anInt3705, arg0.anInt3706, arg0.anInt3709);
		return local124;
	}

	@OriginalMember(owner = "client!gt", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt6119 < arg0) {
			this.anInt6119 = arg0;
			local5 = true;
		}
		if (arg2 < this.anInt6142) {
			this.anInt6142 = arg2;
			local5 = true;
		}
		if (this.anInt6140 < arg1) {
			local5 = true;
			this.anInt6140 = arg1;
		}
		if (this.anInt6115 > arg3) {
			local5 = true;
			this.anInt6115 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean464) {
			this.aBoolean464 = true;
			this.method5037();
		}
		this.method5084();
		this.method5140();
	}

	@OriginalMember(owner = "client!gt", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt6149 && this.anInt6122 == arg1 && arg2 == this.anInt6137) {
			return;
		}
		this.anInt6122 = arg1;
		this.anInt6149 = arg0;
		this.anInt6137 = arg2;
		this.method5099();
		this.method5146();
	}

	@OriginalMember(owner = "client!gt", name = "G", descriptor = "(I)V")
	protected abstract void method5086();

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(IZ)Lclient!ida;")
	public abstract Interface10 method5087(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(IZ)V")
	public final void method5088(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean452 != arg0) {
			this.aBoolean452 = arg0;
			this.method5035();
			this.anInt6132 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gt", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean461) {
			throw new RuntimeException("");
		}
		this.anInt6124 = arg1;
		this.anInt6147 = arg3;
		this.anInt6125 = arg2;
		this.anInt6128 = arg0;
		if (this.aBoolean454) {
			this.aClass74Array3[3].method8256();
			this.aClass74Array3[3].method8242();
		}
	}

	@OriginalMember(owner = "client!gt", name = "H", descriptor = "(I)I")
	public final int method5089() {
		return this.anInt6128;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!uf;III)V")
	public abstract void method5090(@OriginalArg(0) Class334 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!ti;Lclient!kca;)Z")
	public abstract boolean method5091(@OriginalArg(1) Class324 arg0, @OriginalArg(2) Class187 arg1);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!kd;)V")
	@Override
	public final void method7896(@OriginalArg(0) Class6 arg0) {
		this.aClass6_Sub2_16 = (Class6_Sub2) arg0;
		this.aClass6_Sub2_18.method6695(this.aClass6_Sub2_16);
		this.aClass6_Sub2_18.method2713();
		this.aClass6_Sub2_19.method2714(this.aClass6_Sub2_18);
		this.aClass6_Sub2_17.method2714(this.aClass6_Sub2_16);
		if (this.aClass308_8.method7333()) {
			this.method5121();
		}
	}

	@OriginalMember(owner = "client!gt", name = "I", descriptor = "(I)V")
	protected abstract void method5092();

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "(II)V")
	public final void method5093(@OriginalArg(1) int arg0) {
		if (this.anInt6139 == arg0) {
			return;
		}
		@Pc(32) Class94 local32;
		@Pc(30) boolean local30;
		@Pc(34) boolean local34;
		if (arg0 == 1) {
			local30 = true;
			local32 = Static85.aClass94_1;
			local34 = true;
		} else if (arg0 == 2) {
			local32 = Static340.aClass94_5;
			local34 = false;
			local30 = true;
		} else if (arg0 == 128) {
			local30 = true;
			local32 = Static474.aClass94_7;
			local34 = true;
		} else {
			local30 = false;
			local32 = Static474.aClass94_6;
			local34 = false;
		}
		if (local34 != this.aBoolean462) {
			this.aBoolean462 = local34;
			this.method5080();
		}
		if (this.aBoolean459 != local30) {
			this.aBoolean459 = local30;
			this.method5109();
		}
		if (this.aClass94_4 != local32) {
			this.aClass94_4 = local32;
			this.method5025();
		}
		this.anInt6139 = arg0;
		this.anInt6132 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!gt", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7968() {
		return true;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)Lclient!dw;")
	protected Class74 method5094(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class74_Sub10(this);
		} else if (arg0 == 1) {
			return new Class74_Sub1(this);
		} else if (arg0 == 2) {
			return new Class74_Sub7(this, this.aClass378_6);
		} else if (arg0 == 7) {
			return new Class74_Sub3(this);
		} else {
			return new Class74_Sub6(this);
		}
	}

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "(Z)V")
	private void method5095() {
		this.method5032();
		if (this.aClass74_3 != null) {
			this.aClass74_3.method8254();
		}
	}

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6146 == arg0 && this.anInt6127 == arg1) {
			return;
		}
		this.anInt6146 = arg0;
		this.anInt6127 = arg1;
		this.method5067();
		this.method5049();
		this.method5099();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIZ)Lclient!kr;")
	@Override
	public final Class20 method7931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class20_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!gt", name = "J", descriptor = "(I)V")
	protected abstract void method5096();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method5097(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "()Z")
	@Override
	public final boolean method7944() {
		return true;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZII[IB)Lclient!wda;")
	public final Interface26 method5098(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		return this.method5060(0, 0, arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7915() {
		return true;
	}

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "()Z")
	@Override
	public final boolean method7958() {
		return false;
	}

	@OriginalMember(owner = "client!gt", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7906(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!gt", name = "K", descriptor = "(I)V")
	private void method5099() {
		if (this.aClass74_3 != null) {
			this.aClass74_3.method8242();
		}
		this.method5105();
	}

	@OriginalMember(owner = "client!gt", name = "L", descriptor = "(I)Lclient!fba;")
	public final Class6_Sub2 method5100() {
		if (!this.aBoolean460) {
			this.aClass6_Sub2_20.method2698(this.aClass6_Sub2_18, this.aClass6_Sub2_15);
			this.aBoolean460 = true;
		}
		return this.aClass6_Sub2_20;
	}

	@OriginalMember(owner = "client!gt", name = "M", descriptor = "(I)V")
	private void method5101() {
		if (this.aBoolean457) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray45;
		this.aBoolean457 = true;
		if (this.anInt5936 != 0 && this.anInt6075 != 0) {
			local13[7] = 0.0F;
			local13[2] = 0.0F;
			local13[5] = -2.0F / (float) this.anInt6075;
			local13[10] = 0.5F;
			local13[15] = 1.0F;
			local13[6] = 0.0F;
			local13[8] = 0.0F;
			local13[0] = 2.0F / (float) this.anInt5936;
			local13[1] = 0.0F;
			local13[14] = 0.5F;
			local13[9] = 0.0F;
			local13[12] = -1.0F;
			local13[13] = 1.0F;
			local13[11] = 0.0F;
			local13[4] = 0.0F;
			local13[3] = 0.0F;
			return;
		}
		local13[3] = 0.0F;
		local13[13] = 0.0F;
		local13[10] = 1.0F;
		local13[0] = 1.0F;
		local13[2] = 0.0F;
		local13[1] = 0.0F;
		local13[14] = 0.0F;
		local13[6] = 0.0F;
		local13[7] = 0.0F;
		local13[9] = 0.0F;
		local13[4] = 0.0F;
		local13[12] = 0.0F;
		local13[11] = 0.0F;
		local13[8] = 0.0F;
		local13[15] = 1.0F;
		local13[5] = 1.0F;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIZ)Lclient!kr;")
	@Override
	public final Class20 method7927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class20_Sub2 local11 = new Class20_Sub2(this, arg2, arg3, arg4);
		local11.method4597(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "([FIIZIILclient!kca;I)Lclient!wda;")
	protected abstract Interface26 method5102(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class187 arg4);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILclient!kca;I[BZI)Lclient!wda;")
	protected abstract Interface26 method5103(@OriginalArg(3) Class187 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!gt", name = "N", descriptor = "(I)Lclient!fba;")
	public final Class6_Sub2 method5104() {
		return this.aClass6_Sub2_19;
	}

	@OriginalMember(owner = "client!gt", name = "O", descriptor = "(I)V")
	protected abstract void method5105();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(FFFFZFF)Z")
	private boolean method5106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(15) Buffer local15 = this.anInterface3_14.method7189();
		if (local15 == null) {
			return false;
		}
		@Pc(24) Stream local24 = this.method5128(local15);
		if (Stream.b()) {
			local24.b(arg4);
			local24.b(arg0);
			local24.b(arg3);
			local24.b(arg2);
			local24.b(arg1);
			local24.b(arg5);
		} else {
			local24.a(arg4);
			local24.a(arg0);
			local24.a(arg3);
			local24.a(arg2);
			local24.a(arg1);
			local24.a(arg5);
		}
		local24.a();
		return this.anInterface3_14.method7187();
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(IIIIII)Lclient!sfa;")
	@Override
	public final Class22 method7948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class22_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!fba;I)V")
	public final void method5107(@OriginalArg(0) Class6_Sub2 arg0) {
		this.aClass6_Sub2_15.method6695(arg0);
		this.aBoolean443 = false;
		this.method5117();
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(ZI)V")
	public final void method5108(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean455) {
			this.aBoolean455 = arg0;
			this.method5031();
			this.anInt6132 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!gt", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt6154;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!fp;[Lclient!fw;Z)Lclient!da;")
	@Override
	public final Class64 method7965(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class120[] arg1) {
		return new Class64_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!gt", name = "u", descriptor = "(B)V")
	protected abstract void method5109();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!hi;Z)V")
	public abstract void method5110(@OriginalArg(0) Class147 arg0);

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		if (local10 == 0.0F && local17 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(42) float local42 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
			local10 *= local42;
			local17 *= local42;
		}
		if (!this.method5106((float) arg1, local17 + (float) arg3, (float) arg2 + local10, 0.0F, (float) arg0, 0.0F)) {
			return;
		}
		this.method5057();
		this.method5075(arg4);
		this.method5131(0, Static358.aClass315_1);
		this.method5118(0, Static358.aClass315_1);
		this.method5093(arg5);
		this.method5047();
		this.method5078(false);
		this.method5036();
		this.method5078(true);
		this.method5118(0, Static516.aClass315_3);
		this.method5131(0, Static516.aClass315_3);
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(ZI)V")
	public final void method5111(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean448) {
			this.aBoolean448 = arg0;
			this.method5146();
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(ZZ)V")
	public final void method5112(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean463) {
			this.aBoolean463 = arg0;
			this.method5146();
			this.anInt6132 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "([BZILclient!kca;II)Lclient!wda;")
	public final Interface26 method5113(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class187 arg3, @OriginalArg(4) int arg4) {
		return this.method5103(arg3, arg2, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(IZ)V")
	public final void method5114(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean449 != arg0) {
			this.aBoolean449 = arg0;
			this.method5031();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method7935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!gt", name = "P", descriptor = "(I)V")
	private void method5115() {
		this.anInterface3_13 = this.method5043(false);
		this.anInterface3_13.method7186(12, 3096);
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(29) Buffer local29 = this.anInterface3_13.method7189();
			if (local29 != null) {
				@Pc(36) Stream local36 = this.method5128(local29);
				local36.b(0.0F);
				local36.b(0.0F);
				local36.b(0.0F);
				for (@Pc(47) int local47 = 0; local47 <= 256; local47++) {
					@Pc(57) double local57 = (double) (local47 * 2) * 3.141592653589793D / 256.0D;
					@Pc(61) float local61 = (float) Math.cos(local57);
					@Pc(65) float local65 = (float) Math.sin(local57);
					if (Stream.b()) {
						local36.b(local65);
						local36.b(local61);
						local36.b(0.0F);
					} else {
						local36.a(local65);
						local36.a(local61);
						local36.a(0.0F);
					}
				}
				local36.a();
				if (this.anInterface3_13.method7187()) {
					break;
				}
			}
		}
		this.aClass147_18 = this.method5083(new Class241[] { new Class241(Static620.aClass365_1) });
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(BI)V")
	public final void method5116(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt6114) {
			this.anInt6114 = arg0;
			this.method5077();
		}
	}

	@OriginalMember(owner = "client!gt", name = "Q", descriptor = "(I)V")
	private void method5117() {
		if (Static84.aClass308_2 == this.aClass308_8) {
			@Pc(11) float local11 = this.method5142();
			this.aClass6_Sub2_15.method2710(local11, local11, 0.0F);
		}
		this.aBoolean460 = false;
		this.method5145();
		if (this.aClass74_3 != null) {
			this.aClass74_3.method8255();
		}
	}

	@OriginalMember(owner = "client!gt", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass6_Sub2_16.method2723((float) arg0, (float) arg2, (float) arg1);
		if (local14 < (float) this.anInt6146 || (float) this.anInt6127 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt6144 * this.aClass6_Sub2_16.method2702((float) arg2, (float) arg0, (float) arg1) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt6150 * this.aClass6_Sub2_16.method2721((float) arg0, (float) arg2, (float) arg1) / (float) arg3);
		arg4[2] = (int) local14;
		arg4[0] = (int) ((float) local58 - this.aFloat146);
		arg4[1] = (int) ((float) local77 - this.aFloat133);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZILclient!taa;)V")
	public final void method5118(@OriginalArg(1) int arg0, @OriginalArg(2) Class315 arg1) {
		this.method5029(arg1, arg0);
	}

	@OriginalMember(owner = "client!gt", name = "R", descriptor = "(I)I")
	public final int method5119() {
		return this.anInt6124;
	}

	@OriginalMember(owner = "client!gt", name = "S", descriptor = "(I)V")
	public final void method5120() {
		this.method5125(Static334.aClass334_6, 2);
	}

	@OriginalMember(owner = "client!gt", name = "v", descriptor = "(B)V")
	private void method5121() {
		this.aBoolean460 = false;
		if (this.aClass74_3 != null) {
			this.aClass74_3.method8247();
		}
		this.method5048();
	}

	@OriginalMember(owner = "client!gt", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt6121, this.anInt6134, this.anInt6144, this.anInt6150 };
	}

	@OriginalMember(owner = "client!gt", name = "T", descriptor = "(I)V")
	protected abstract void method5122();

	@OriginalMember(owner = "client!gt", name = "U", descriptor = "(I)Lclient!saa;")
	public final Interface22 method5123() {
		return this.aClass22_Sub2_3 == null ? null : this.aClass22_Sub2_3.method3286();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method7894() {
	}

	@OriginalMember(owner = "client!gt", name = "V", descriptor = "(I)V")
	public final void method5124() {
		if (this.anInt6132 == 8) {
			return;
		}
		this.method5139();
		this.method5112(true);
		this.method5088(true);
		this.method5053(true);
		this.method5093(1);
		this.anInt6132 = 8;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	@Override
	public final void method7890(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!uf;I)V")
	private void method5125(@OriginalArg(1) Class334 arg0, @OriginalArg(2) int arg1) {
		this.method5148(this.anInterface3_12, 0);
		this.method5110(this.aClass147_21);
		this.method5090(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!gt", name = "W", descriptor = "(I)V")
	private void method5126() {
		if (Static199.aClass308_6 == this.aClass308_8) {
			return;
		}
		@Pc(6) Class308 local6 = this.aClass308_8;
		this.aClass308_8 = Static199.aClass308_6;
		if (!local6.method7333()) {
			this.method5121();
		}
		this.method5044();
		this.aFloatArray48 = this.aFloatArray47;
		this.method5095();
		this.anInt6132 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "(B)V")
	public final void method5127() {
		if (Static190.aClass108_25 != this.aClass108Array3[this.anInt6114]) {
			this.aClass108Array3[this.anInt6114] = Static190.aClass108_25;
			this.aClass6_Sub2Array3[this.anInt6114].method6706();
			this.method5040();
		}
	}

	@OriginalMember(owner = "client!gt", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt5936 - 1 && arg1 <= 0 && arg3 >= this.anInt6075 - 1) {
			this.la();
			return;
		}
		this.anInt6142 = arg2 <= this.anInt5936 ? arg2 : 0;
		this.anInt6115 = arg3 <= this.anInt5936 ? arg3 : 0;
		this.anInt6119 = arg0 >= 0 ? arg0 : 0;
		this.anInt6140 = arg1 >= 0 ? arg1 : 0;
		if (!this.aBoolean464) {
			this.aBoolean464 = true;
			this.method5037();
		}
		this.method5084();
		this.method5140();
	}

	@OriginalMember(owner = "client!gt", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean451 = arg0;
		this.method5138();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;B)Lclient!jaclib/memory/Stream;")
	public final Stream method5128(@OriginalArg(0) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!gt", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7906(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!gt", name = "x", descriptor = "(B)Lclient!fba;")
	public final Class6_Sub2 method5129() {
		return this.aClass6_Sub2_15;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(IIZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method5130(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap4.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILclient!taa;)V")
	public final void method5131(@OriginalArg(0) int arg0, @OriginalArg(2) Class315 arg1) {
		this.method5052(false, false, arg0, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt6129 = 0;
		while (arg0 > 1) {
			this.anInt6129++;
			arg0 >>= 0x1;
		}
		this.anInt6131 = 0x1 << this.anInt6129;
	}

	@OriginalMember(owner = "client!gt", name = "u", descriptor = "()I")
	@Override
	public final int method7953() {
		return this.anInt6148 - 2;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!rr;Lclient!rr;I)V")
	public final void method5133(@OriginalArg(0) Class300 arg0, @OriginalArg(1) Class300 arg1) {
		@Pc(17) boolean local17 = false;
		if (this.aClass300Array6[this.anInt6114] != arg1) {
			this.aClass300Array6[this.anInt6114] = arg1;
			local17 = true;
			this.method5086();
		}
		if (this.aClass300Array5[this.anInt6114] != arg0) {
			this.aClass300Array5[this.anInt6114] = arg0;
			this.method5069();
			local17 = true;
		}
		if (local17) {
			this.anInt6132 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!gt", name = "Y", descriptor = "(I)V")
	protected abstract void method5134();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[Lclient!bh;)V")
	@Override
	public final void method7926(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub4Array3[local7] = arg1[local7];
		}
		this.anInt6135 = arg0;
		if (this.aClass308_8.method7333()) {
			this.method5033();
		}
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(IZ)V")
	public final void method5135(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean444 != arg0) {
			this.aBoolean444 = arg0;
			this.method5092();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILclient!ida;BILclient!uf;I)V")
	public abstract void method5136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface10 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class334 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!gt", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt6113 + this.anInt6109 + this.anInt6110;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLclient!ti;Lclient!kca;)Z")
	public abstract boolean method5137(@OriginalArg(1) Class324 arg0, @OriginalArg(2) Class187 arg1);

	@OriginalMember(owner = "client!gt", name = "Z", descriptor = "(I)V")
	protected abstract void method5138();

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass6_Sub2_16.aFloat77 * (float) arg0 + this.aClass6_Sub2_16.aFloat74 * (float) arg1 + this.aClass6_Sub2_16.aFloat76 * (float) arg2 + this.aClass6_Sub2_16.aFloat72;
		@Pc(57) float local57 = this.aClass6_Sub2_16.aFloat76 * (float) arg5 + (float) arg3 * this.aClass6_Sub2_16.aFloat77 + this.aClass6_Sub2_16.aFloat74 * (float) arg4 + this.aClass6_Sub2_16.aFloat72;
		if (local32 < (float) this.anInt6146 && local57 < (float) this.anInt6146) {
			local7 |= 0x10;
		} else if ((float) this.anInt6127 < local32 && (float) this.anInt6127 < local57) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt6144 * (this.aClass6_Sub2_16.aFloat78 + (float) arg1 * this.aClass6_Sub2_16.aFloat80 + this.aClass6_Sub2_16.aFloat81 * (float) arg0 + this.aClass6_Sub2_16.aFloat71 * (float) arg2) / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt6144 * ((float) arg3 * this.aClass6_Sub2_16.aFloat81 + this.aClass6_Sub2_16.aFloat80 * (float) arg4 + this.aClass6_Sub2_16.aFloat71 * (float) arg5 + this.aClass6_Sub2_16.aFloat78) / (float) arg6);
		if ((float) local124 < this.aFloat146 && this.aFloat146 > (float) local157) {
			local7 |= 0x1;
		} else if (this.aFloat142 < (float) local124 && this.aFloat142 < (float) local157) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass6_Sub2_16.aFloat82 * (float) arg1 + (float) arg0 * this.aClass6_Sub2_16.aFloat73 + this.aClass6_Sub2_16.aFloat79 * (float) arg2 + this.aClass6_Sub2_16.aFloat75) * (float) this.anInt6150 / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass6_Sub2_16.aFloat73 * (float) arg3 + this.aClass6_Sub2_16.aFloat82 * (float) arg4 + (float) arg5 * this.aClass6_Sub2_16.aFloat79 + this.aClass6_Sub2_16.aFloat75) * (float) this.anInt6150 / (float) arg6);
		if ((float) local224 < this.aFloat133 && this.aFloat133 > (float) local257) {
			local7 |= 0x4;
		} else if ((float) local224 > this.aFloat136 && this.aFloat136 < (float) local257) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method7929(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aNativeHeap4 = ((Class2_Sub11_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer5 = this.aNativeHeap4.a(32768, false);
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7904() {
		return true;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7891(@OriginalArg(0) Canvas arg0) {
		this.aCanvas7 = null;
		this.anObject12 = null;
		if (arg0 == null || this.aCanvas8 == arg0) {
			this.aCanvas7 = this.aCanvas8;
			this.anObject12 = this.anObject11;
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.anObject12 = this.aHashtable4.get(arg0);
			this.aCanvas7 = arg0;
		}
		if (this.aCanvas7 == null || this.anObject12 == null) {
			throw new RuntimeException();
		}
		this.method5144(this.aCanvas7, this.anObject12);
		this.method5030();
	}

	@OriginalMember(owner = "client!gt", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt6127;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7902(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!oo;I)V")
	@Override
	public final void method7972(@OriginalArg(0) Class247 arg0, @OriginalArg(1) int arg1) {
		this.bf.method1663(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "(B)V")
	private void method5139() {
		if (this.aClass308_8 == Static401.aClass308_11) {
			return;
		}
		@Pc(10) Class308 local10 = this.aClass308_8;
		this.aClass308_8 = Static401.aClass308_11;
		if (!local10.method7333()) {
			this.method5121();
		}
		this.method5082();
		this.aFloatArray48 = this.aFloatArray49;
		this.method5095();
		this.anInt6132 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "()Lclient!kd;")
	@Override
	public final Class6 method7892() {
		return this.aClass6_Sub2_21;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(II)I")
	@Override
	public final int method7950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!gt", name = "ab", descriptor = "(I)V")
	private void method5140() {
		this.aFloat142 = this.anInt6142 - this.anInt6121;
		this.aFloat146 = this.anInt6119 - this.anInt6121;
		this.aFloat136 = this.anInt6115 - this.anInt6134;
		this.aFloat133 = this.anInt6140 - this.anInt6134;
	}

	@OriginalMember(owner = "client!gt", name = "z", descriptor = "(B)Lclient!fba;")
	public final Class6_Sub2 method5141() {
		return this.aClass6_Sub2Array3[this.anInt6114];
	}

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "(Z)F")
	protected abstract float method5142();

	@OriginalMember(owner = "client!gt", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5057();
		this.method5075(arg4);
		this.method5131(0, Static358.aClass315_1);
		this.method5118(0, Static358.aClass315_1);
		this.method5093(arg5);
		this.aClass6_Sub2_15.method2717(1.0F, (float) arg2, (float) arg3);
		this.aClass6_Sub2_15.method6694(arg0, arg1, 0);
		this.method5022();
		this.method5078(false);
		this.method5120();
		this.method5078(true);
		this.method5118(0, Static516.aClass315_3);
		this.method5131(0, Static516.aClass315_3);
	}

	@OriginalMember(owner = "client!gt", name = "A", descriptor = "(B)V")
	private void method5143() {
		this.anInterface3_14 = this.method5043(true);
		this.anInterface3_14.method7186(12, 24);
		this.aClass147_22 = this.method5083(new Class241[] { new Class241(Static620.aClass365_1) });
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	protected abstract void method5144(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "(IIIIII)V")
	@Override
	public final void method7954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method5142();
		this.method5057();
		this.method5075(arg4);
		this.method5131(0, Static358.aClass315_1);
		this.method5118(0, Static358.aClass315_1);
		this.method5093(arg5);
		this.aClass6_Sub2_15.method2717(1.0F, (float) (arg2 - 1), (float) (arg3 - 1));
		this.aClass6_Sub2_15.method2710((float) arg1 - local7, -local7 + (float) arg0, 0.0F);
		this.method5022();
		this.method5078(false);
		this.method5125(Static107.aClass334_2, 4);
		this.method5078(true);
		this.method5118(0, Static516.aClass315_3);
		this.method5131(0, Static516.aClass315_3);
	}

	@OriginalMember(owner = "client!gt", name = "bb", descriptor = "(I)V")
	protected abstract void method5145();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "([I)V")
	@Override
	public final void method7887(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5936;
		arg0[1] = this.anInt6075;
	}

	@OriginalMember(owner = "client!gt", name = "cb", descriptor = "(I)V")
	protected abstract void method5146();

	@OriginalMember(owner = "client!gt", name = "db", descriptor = "(I)Lclient!fba;")
	public final Class6_Sub2 method5147() {
		return this.aClass6_Sub2_18;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!caa;II)V")
	public abstract void method5148(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!kca;Lclient!ti;II)Lclient!wda;")
	public abstract Interface26 method5149(@OriginalArg(0) int arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) Class324 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!gt", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass6_Sub2_16.aFloat72 + this.aClass6_Sub2_16.aFloat74 * (float) arg1 + this.aClass6_Sub2_16.aFloat77 * (float) arg0 + (float) arg2 * this.aClass6_Sub2_16.aFloat76;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass6_Sub2_16.aFloat72 + (float) arg3 * this.aClass6_Sub2_16.aFloat77 + this.aClass6_Sub2_16.aFloat74 * (float) arg4 + (float) arg5 * this.aClass6_Sub2_16.aFloat76;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt6146 > local32 && (float) this.anInt6146 > local63) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt6127 && (float) this.anInt6127 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) (((float) arg2 * this.aClass6_Sub2_16.aFloat71 + (float) arg1 * this.aClass6_Sub2_16.aFloat80 + (float) arg0 * this.aClass6_Sub2_16.aFloat81 + this.aClass6_Sub2_16.aFloat78) * (float) this.anInt6144 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt6144 * ((float) arg5 * this.aClass6_Sub2_16.aFloat71 + this.aClass6_Sub2_16.aFloat80 * (float) arg4 + (float) arg3 * this.aClass6_Sub2_16.aFloat81 + this.aClass6_Sub2_16.aFloat78) / local63);
		if ((float) local135 < this.aFloat146 && this.aFloat146 > (float) local167) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat142 && (float) local167 > this.aFloat142) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) (((float) arg1 * this.aClass6_Sub2_16.aFloat82 + (float) arg0 * this.aClass6_Sub2_16.aFloat73 + this.aClass6_Sub2_16.aFloat79 * (float) arg2 + this.aClass6_Sub2_16.aFloat75) * (float) this.anInt6150 / local32);
		@Pc(265) int local265 = (int) (((float) arg4 * this.aClass6_Sub2_16.aFloat82 + (float) arg3 * this.aClass6_Sub2_16.aFloat73 + (float) arg5 * this.aClass6_Sub2_16.aFloat79 + this.aClass6_Sub2_16.aFloat75) * (float) this.anInt6150 / local63);
		if ((float) local233 < this.aFloat133 && this.aFloat133 > (float) local265) {
			local7 |= 0x4;
		} else if (this.aFloat136 < (float) local233 && this.aFloat136 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "(I)V")
	@Override
	public final void method7922(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "()Z")
	@Override
	public final boolean method7930() {
		return false;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZIZ[[I)Lclient!saa;")
	public abstract Interface22 method5150(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2);

	@OriginalMember(owner = "client!gt", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat140) {
			this.aFloat140 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method5122();
			this.method5096();
		}
	}

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "()Lclient!kd;")
	@Override
	public final Class6 method7951() {
		return this.aClass6_Sub2_16;
	}

	@OriginalMember(owner = "client!gt", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6150 = arg3;
		this.anInt6121 = arg0;
		this.anInt6144 = arg2;
		this.anInt6134 = arg1;
		this.method5049();
		this.method5067();
		this.method5024();
		this.method5140();
	}

	@OriginalMember(owner = "client!gt", name = "eb", descriptor = "(I)V")
	public final void method5151() {
		this.anInterface7Array3 = new Interface7[this.anInt6151];
		this.aClass108Array3 = new Class108[this.anInt6151];
		this.aClass300Array6 = new Class300[this.anInt6151];
		this.aClass6_Sub2Array3 = new Class6_Sub2[this.anInt6151];
		this.aClass300Array5 = new Class300[this.anInt6151];
		for (@Pc(30) int local30 = 0; local30 < this.anInt6151; local30++) {
			this.aClass300Array5[local30] = Static40.aClass300_1;
			this.aClass300Array6[local30] = Static40.aClass300_1;
			this.aClass108Array3[local30] = Static190.aClass108_25;
			this.aClass6_Sub2Array3[local30] = new Class6_Sub2();
		}
		this.aClass2_Sub4Array3 = new Class2_Sub4[this.anInt6148 - 2];
		this.anInterface7_3 = this.method5149(1, Static524.aClass187_15, Static545.aClass324_12, 1);
		this.method7929(new Class2_Sub11_Sub2(262144));
		this.aClass147_20 = this.method5083(new Class241[] { new Class241(new Class365[] { Static620.aClass365_1, Static620.aClass365_5 }) });
		this.aClass147_16 = this.method5083(new Class241[] { new Class241(new Class365[] { Static620.aClass365_1, Static620.aClass365_3 }) });
		this.aClass147_19 = this.method5083(new Class241[] { new Class241(Static620.aClass365_1), new Class241(Static620.aClass365_3), new Class241(Static620.aClass365_5), new Class241(Static620.aClass365_2) });
		this.aClass147_17 = this.method5083(new Class241[] { new Class241(Static620.aClass365_1), new Class241(Static620.aClass365_3), new Class241(Static620.aClass365_5) });
		this.aClass25_Sub3_27 = new Class25_Sub3(this, 0, 0, false, false);
		this.aClass25_Sub3_26 = new Class25_Sub3(this, 0, 0, true, true);
		this.aClass25_Sub3_22 = new Class25_Sub3(this, 0, 0, false, false);
		this.aClass25_Sub3_29 = new Class25_Sub3(this, 0, 0, true, true);
		this.aClass25_Sub3_30 = new Class25_Sub3(this, 0, 0, false, false);
		this.aClass25_Sub3_21 = new Class25_Sub3(this, 0, 0, true, true);
		this.aClass25_Sub3_24 = new Class25_Sub3(this, 0, 0, false, false);
		this.aClass25_Sub3_28 = new Class25_Sub3(this, 0, 0, true, true);
		this.aClass25_Sub3_25 = new Class25_Sub3(this, 0, 0, false, false);
		this.aClass25_Sub3_23 = new Class25_Sub3(this, 0, 0, true, true);
		this.bf = new Class75(this);
		this.anInterface10_8 = this.method5087(true);
		this.method5039();
		this.aClass378_6 = new Class378(this);
		this.aClass74Array3[1] = this.method5094(1);
		this.aClass74Array3[2] = this.method5094(2);
		this.aClass74Array3[4] = this.method5094(4);
		this.aClass74Array3[5] = this.method5094(5);
		this.aClass74Array3[6] = this.method5094(6);
		this.aClass74Array3[7] = this.method5094(7);
		this.aClass74Array3[3] = this.method5094(3);
		this.aClass74Array3[8] = this.method5094(8);
		this.aClass74Array3[9] = this.method5094(9);
		if (!this.aClass74Array3[2].method8245()) {
			this.aClass74Array3[2] = this.method5094(0);
		}
		if (!this.aClass74Array3[4].method8245()) {
			this.aClass74Array3[4] = this.aClass74Array3[2];
		}
		if (!this.aClass74Array3[8].method8245()) {
			this.aClass74Array3[8] = this.aClass74Array3[4];
		}
		if (!this.aClass74Array3[9].method8245()) {
			this.aClass74Array3[9] = this.aClass74Array3[8];
		}
		this.method5042();
		this.la();
		this.method7919();
	}

	@OriginalMember(owner = "client!gt", name = "B", descriptor = "(B)V")
	public final void method5152() {
		if (this.anInt6132 == 2) {
			return;
		}
		this.method5072();
		this.method5112(false);
		this.method5108(false);
		this.method5088(false);
		this.method5053(false);
		this.method5071(false, false, -2);
		this.anInt6132 = 2;
	}

	@OriginalMember(owner = "client!gt", name = "fb", descriptor = "(I)V")
	private void method5153() {
		this.aBoolean457 = false;
		if (Static84.aClass308_2 == this.aClass308_8) {
			this.method5101();
			this.method5095();
		}
	}

	@OriginalMember(owner = "client!gt", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt6119 = 0;
		this.anInt6140 = 0;
		this.anInt6115 = this.anInt6075;
		this.anInt6142 = this.anInt5936;
		if (this.aBoolean464) {
			this.aBoolean464 = false;
			this.method5037();
		}
		this.method5140();
	}
}
