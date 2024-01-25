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

@OriginalClass("client!ch")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ch", name = "Y", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!ch", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!ch", name = "lb", descriptor = "Lclient!ur;")
	protected Class345 lb;

	@OriginalMember(owner = "client!ch", name = "lc", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!ch", name = "nc", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!ch", name = "Nd", descriptor = "I")
	public int anInt6497;

	@OriginalMember(owner = "client!ch", name = "Zd", descriptor = "I")
	protected int anInt6508;

	@OriginalMember(owner = "client!ch", name = "ae", descriptor = "I")
	public int anInt6509;

	@OriginalMember(owner = "client!ch", name = "ie", descriptor = "I")
	public int anInt6511;

	@OriginalMember(owner = "client!ch", name = "le", descriptor = "Z")
	protected boolean aBoolean453;

	@OriginalMember(owner = "client!ch", name = "me", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!ch", name = "pe", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!ch", name = "qe", descriptor = "Lclient!ec;")
	public Interface10 anInterface10_3;

	@OriginalMember(owner = "client!ch", name = "xe", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!ch", name = "ye", descriptor = "I")
	protected int anInt6513;

	@OriginalMember(owner = "client!ch", name = "ze", descriptor = "F")
	private float aFloat144;

	@OriginalMember(owner = "client!ch", name = "Ce", descriptor = "[Lclient!wk;")
	protected Class374[] aClass374Array5;

	@OriginalMember(owner = "client!ch", name = "Ee", descriptor = "I")
	private int anInt6515;

	@OriginalMember(owner = "client!ch", name = "Ge", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!ch", name = "Me", descriptor = "Lclient!bn;")
	private Class37 aClass37_3;

	@OriginalMember(owner = "client!ch", name = "Qe", descriptor = "[Lclient!wh;")
	protected Class3_Sub16[] aClass3_Sub16Array6;

	@OriginalMember(owner = "client!ch", name = "We", descriptor = "Z")
	protected boolean aBoolean461;

	@OriginalMember(owner = "client!ch", name = "Ye", descriptor = "I")
	protected int anInt6522;

	@OriginalMember(owner = "client!ch", name = "Ze", descriptor = "Lclient!sha;")
	private Class29 aClass29_3;

	@OriginalMember(owner = "client!ch", name = "bf", descriptor = "[Lclient!bt;")
	protected Class39_Sub1[] bf;

	@OriginalMember(owner = "client!ch", name = "cf", descriptor = "I")
	public int anInt6524;

	@OriginalMember(owner = "client!ch", name = "df", descriptor = "Lclient!ub;")
	private Class205_Sub2 aClass205_Sub2_3;

	@OriginalMember(owner = "client!ch", name = "nf", descriptor = "[Lclient!uia;")
	protected Class340[] aClass340Array3;

	@OriginalMember(owner = "client!ch", name = "sf", descriptor = "Z")
	public boolean aBoolean465;

	@OriginalMember(owner = "client!ch", name = "uf", descriptor = "Z")
	public boolean aBoolean466;

	@OriginalMember(owner = "client!ch", name = "vf", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!ch", name = "wf", descriptor = "[Lclient!ec;")
	private Interface10[] anInterface10Array3;

	@OriginalMember(owner = "client!ch", name = "Af", descriptor = "I")
	protected int anInt6533;

	@OriginalMember(owner = "client!ch", name = "Hf", descriptor = "Z")
	public boolean aBoolean469;

	@OriginalMember(owner = "client!ch", name = "Jf", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!ch", name = "Kf", descriptor = "I")
	private int anInt6537;

	@OriginalMember(owner = "client!ch", name = "Lf", descriptor = "I")
	public int anInt6538;

	@OriginalMember(owner = "client!ch", name = "Vf", descriptor = "[Lclient!wk;")
	protected Class374[] aClass374Array6;

	@OriginalMember(owner = "client!ch", name = "Zf", descriptor = "I")
	public int anInt6547;

	@OriginalMember(owner = "client!ch", name = "bg", descriptor = "I")
	protected int anInt6549;

	@OriginalMember(owner = "client!ch", name = "eg", descriptor = "F")
	private float aFloat152;

	@OriginalMember(owner = "client!ch", name = "fg", descriptor = "Lclient!eu;")
	private Class46 aClass46_17;

	@OriginalMember(owner = "client!ch", name = "gg", descriptor = "Lclient!rr;")
	private Interface19 anInterface19_6;

	@OriginalMember(owner = "client!ch", name = "hg", descriptor = "Lclient!lu;")
	public Class17_Sub3 aClass17_Sub3_21;

	@OriginalMember(owner = "client!ch", name = "ig", descriptor = "Lclient!lu;")
	public Class17_Sub3 aClass17_Sub3_22;

	@OriginalMember(owner = "client!ch", name = "kg", descriptor = "Lclient!eu;")
	public Class46 aClass46_18;

	@OriginalMember(owner = "client!ch", name = "lg", descriptor = "Lclient!eu;")
	public Class46 aClass46_19;

	@OriginalMember(owner = "client!ch", name = "mg", descriptor = "Lclient!lu;")
	public Class17_Sub3 aClass17_Sub3_23;

	@OriginalMember(owner = "client!ch", name = "ng", descriptor = "Lclient!fg;")
	private Interface11 anInterface11_13;

	@OriginalMember(owner = "client!ch", name = "og", descriptor = "Lclient!lu;")
	public Class17_Sub3 aClass17_Sub3_24;

	@OriginalMember(owner = "client!ch", name = "pg", descriptor = "Lclient!lu;")
	public Class17_Sub3 aClass17_Sub3_25;

	@OriginalMember(owner = "client!ch", name = "qg", descriptor = "Lclient!lu;")
	public Class17_Sub3 aClass17_Sub3_26;

	@OriginalMember(owner = "client!ch", name = "rg", descriptor = "Lclient!eu;")
	public Class46 aClass46_20;

	@OriginalMember(owner = "client!ch", name = "sg", descriptor = "Lclient!lu;")
	public Class17_Sub3 aClass17_Sub3_27;

	@OriginalMember(owner = "client!ch", name = "tg", descriptor = "Lclient!fg;")
	private Interface11 anInterface11_14;

	@OriginalMember(owner = "client!ch", name = "ug", descriptor = "Lclient!lu;")
	public Class17_Sub3 aClass17_Sub3_28;

	@OriginalMember(owner = "client!ch", name = "vg", descriptor = "Lclient!lu;")
	public Class17_Sub3 aClass17_Sub3_29;

	@OriginalMember(owner = "client!ch", name = "wg", descriptor = "Lclient!lu;")
	public Class17_Sub3 aClass17_Sub3_30;

	@OriginalMember(owner = "client!ch", name = "xg", descriptor = "Lclient!eu;")
	private Class46 aClass46_21;

	@OriginalMember(owner = "client!ch", name = "yg", descriptor = "Lclient!fg;")
	private Interface11 anInterface11_15;

	@OriginalMember(owner = "client!ch", name = "zg", descriptor = "Lclient!eu;")
	public Class46 aClass46_22;

	@OriginalMember(owner = "client!ch", name = "Ag", descriptor = "Lclient!eu;")
	private Class46 aClass46_23;

	@OriginalMember(owner = "client!ch", name = "Bg", descriptor = "Z")
	protected boolean aBoolean472;

	@OriginalMember(owner = "client!ch", name = "Cg", descriptor = "I")
	private int anInt6550;

	@OriginalMember(owner = "client!ch", name = "Kb", descriptor = "Lclient!mr;")
	private final Class223 aClass223_33 = new Class223();

	@OriginalMember(owner = "client!ch", name = "Wd", descriptor = "Z")
	protected boolean aBoolean451 = true;

	@OriginalMember(owner = "client!ch", name = "be", descriptor = "Lclient!bt;")
	protected final Class39_Sub1 aClass39_Sub1_15 = new Class39_Sub1();

	@OriginalMember(owner = "client!ch", name = "ce", descriptor = "Lclient!bt;")
	public Class39_Sub1 aClass39_Sub1_16 = new Class39_Sub1();

	@OriginalMember(owner = "client!ch", name = "de", descriptor = "Lclient!bt;")
	public final Class39_Sub1 aClass39_Sub1_17 = new Class39_Sub1();

	@OriginalMember(owner = "client!ch", name = "ee", descriptor = "Lclient!bt;")
	protected final Class39_Sub1 aClass39_Sub1_18 = new Class39_Sub1();

	@OriginalMember(owner = "client!ch", name = "fe", descriptor = "Lclient!bt;")
	private final Class39_Sub1 aClass39_Sub1_19 = new Class39_Sub1();

	@OriginalMember(owner = "client!ch", name = "ge", descriptor = "Lclient!bt;")
	private final Class39_Sub1 aClass39_Sub1_20 = new Class39_Sub1();

	@OriginalMember(owner = "client!ch", name = "ne", descriptor = "F")
	private float aFloat138 = 1.0F;

	@OriginalMember(owner = "client!ch", name = "Be", descriptor = "Z")
	private boolean aBoolean456 = false;

	@OriginalMember(owner = "client!ch", name = "je", descriptor = "Z")
	protected boolean aBoolean452 = true;

	@OriginalMember(owner = "client!ch", name = "He", descriptor = "I")
	public int anInt6517 = 128;

	@OriginalMember(owner = "client!ch", name = "Oe", descriptor = "I")
	protected int anInt6519 = 0;

	@OriginalMember(owner = "client!ch", name = "ue", descriptor = "F")
	public float aFloat141 = 1.0F;

	@OriginalMember(owner = "client!ch", name = "Ae", descriptor = "I")
	public int anInt6514 = 512;

	@OriginalMember(owner = "client!ch", name = "De", descriptor = "Z")
	protected boolean aBoolean457 = true;

	@OriginalMember(owner = "client!ch", name = "Ke", descriptor = "I")
	protected final int anInt6518 = 0;

	@OriginalMember(owner = "client!ch", name = "ve", descriptor = "F")
	public float aFloat142 = 1.0F;

	@OriginalMember(owner = "client!ch", name = "se", descriptor = "F")
	public float aFloat140 = 1.0F;

	@OriginalMember(owner = "client!ch", name = "hf", descriptor = "I")
	public int anInt6527 = 0;

	@OriginalMember(owner = "client!ch", name = "Te", descriptor = "Z")
	protected boolean aBoolean460 = true;

	@OriginalMember(owner = "client!ch", name = "oe", descriptor = "I")
	private int anInt6512 = -1;

	@OriginalMember(owner = "client!ch", name = "qf", descriptor = "I")
	public int anInt6530 = 512;

	@OriginalMember(owner = "client!ch", name = "Re", descriptor = "Z")
	protected boolean aBoolean459 = false;

	@OriginalMember(owner = "client!ch", name = "jf", descriptor = "[F")
	private final float[] aFloatArray48 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ch", name = "ef", descriptor = "I")
	private int anInt6525 = 0;

	@OriginalMember(owner = "client!ch", name = "Ie", descriptor = "Lclient!wg;")
	protected Class372 aClass372_13 = Static479.aClass372_11;

	@OriginalMember(owner = "client!ch", name = "Le", descriptor = "Z")
	protected boolean aBoolean458 = false;

	@OriginalMember(owner = "client!ch", name = "gf", descriptor = "Z")
	protected boolean aBoolean463 = true;

	@OriginalMember(owner = "client!ch", name = "Ve", descriptor = "F")
	public float aFloat146 = 3584.0F;

	@OriginalMember(owner = "client!ch", name = "zf", descriptor = "Z")
	private boolean aBoolean467 = false;

	@OriginalMember(owner = "client!ch", name = "we", descriptor = "Z")
	private boolean aBoolean455 = false;

	@OriginalMember(owner = "client!ch", name = "ff", descriptor = "I")
	public int anInt6526 = 3;

	@OriginalMember(owner = "client!ch", name = "Je", descriptor = "[F")
	private final float[] aFloatArray46 = new float[16];

	@OriginalMember(owner = "client!ch", name = "lf", descriptor = "I")
	private int anInt6528 = 0;

	@OriginalMember(owner = "client!ch", name = "Gf", descriptor = "Z")
	protected boolean aBoolean468 = false;

	@OriginalMember(owner = "client!ch", name = "he", descriptor = "I")
	public int anInt6510 = 50;

	@OriginalMember(owner = "client!ch", name = "of", descriptor = "I")
	public int anInt6529 = 8;

	@OriginalMember(owner = "client!ch", name = "Ff", descriptor = "I")
	protected int anInt6535 = 0;

	@OriginalMember(owner = "client!ch", name = "Bf", descriptor = "[F")
	public final float[] aFloatArray50 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ch", name = "af", descriptor = "I")
	protected int anInt6523 = 0;

	@OriginalMember(owner = "client!ch", name = "Ef", descriptor = "I")
	protected final int anInt6534 = 0;

	@OriginalMember(owner = "client!ch", name = "te", descriptor = "Lclient!ae;")
	protected Class7 aClass7_5 = Static57.aClass7_4;

	@OriginalMember(owner = "client!ch", name = "re", descriptor = "Z")
	private boolean aBoolean454 = false;

	@OriginalMember(owner = "client!ch", name = "Ue", descriptor = "[F")
	private final float[] aFloatArray47 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ch", name = "tf", descriptor = "I")
	public int anInt6531 = 0;

	@OriginalMember(owner = "client!ch", name = "Pf", descriptor = "I")
	private int anInt6541 = -1;

	@OriginalMember(owner = "client!ch", name = "Nf", descriptor = "I")
	public int anInt6539 = -1;

	@OriginalMember(owner = "client!ch", name = "Fe", descriptor = "I")
	protected int anInt6516 = 3584;

	@OriginalMember(owner = "client!ch", name = "Xe", descriptor = "Z")
	private boolean aBoolean462 = false;

	@OriginalMember(owner = "client!ch", name = "kf", descriptor = "[Lclient!sha;")
	private final Class29[] aClass29Array3 = new Class29[10];

	@OriginalMember(owner = "client!ch", name = "Qf", descriptor = "I")
	private int anInt6542 = 0;

	@OriginalMember(owner = "client!ch", name = "Df", descriptor = "[F")
	private final float[] aFloatArray51 = new float[16];

	@OriginalMember(owner = "client!ch", name = "mf", descriptor = "F")
	public float aFloat147 = -1.0F;

	@OriginalMember(owner = "client!ch", name = "rf", descriptor = "F")
	public float aFloat148 = -1.0F;

	@OriginalMember(owner = "client!ch", name = "ke", descriptor = "F")
	public float aFloat136 = 1.0F;

	@OriginalMember(owner = "client!ch", name = "Sf", descriptor = "I")
	private int anInt6543 = -1;

	@OriginalMember(owner = "client!ch", name = "Rf", descriptor = "[F")
	public final float[] aFloatArray53 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!ch", name = "If", descriptor = "I")
	protected int anInt6536 = 0;

	@OriginalMember(owner = "client!ch", name = "Se", descriptor = "I")
	public int anInt6521 = -1;

	@OriginalMember(owner = "client!ch", name = "yf", descriptor = "[F")
	private final float[] aFloatArray49 = new float[16];

	@OriginalMember(owner = "client!ch", name = "Yf", descriptor = "I")
	private int anInt6546 = 0;

	@OriginalMember(owner = "client!ch", name = "Xf", descriptor = "[F")
	protected float[] aFloatArray54 = this.aFloatArray48;

	@OriginalMember(owner = "client!ch", name = "pf", descriptor = "Z")
	protected boolean aBoolean464 = false;

	@OriginalMember(owner = "client!ch", name = "Of", descriptor = "I")
	public int anInt6540 = 0;

	@OriginalMember(owner = "client!ch", name = "Pe", descriptor = "I")
	protected int anInt6520 = 0;

	@OriginalMember(owner = "client!ch", name = "ag", descriptor = "I")
	private int anInt6548 = 16777215;

	@OriginalMember(owner = "client!ch", name = "Uf", descriptor = "I")
	private int anInt6544 = 1;

	@OriginalMember(owner = "client!ch", name = "Mf", descriptor = "[F")
	private final float[] aFloatArray52 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ch", name = "dg", descriptor = "F")
	public float aFloat151 = 3584.0F;

	@OriginalMember(owner = "client!ch", name = "cg", descriptor = "Z")
	private boolean aBoolean471 = false;

	@OriginalMember(owner = "client!ch", name = "Tf", descriptor = "Z")
	protected boolean aBoolean470 = true;

	@OriginalMember(owner = "client!ch", name = "Ne", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream6 = new Stream();

	@OriginalMember(owner = "client!ch", name = "jg", descriptor = "Lclient!bt;")
	private final Class39_Sub1 aClass39_Sub1_21 = new Class39_Sub1();

	@OriginalMember(owner = "client!ch", name = "Xc", descriptor = "Lclient!la;")
	protected final Class196 aClass196_66;

	@OriginalMember(owner = "client!ch", name = "Wf", descriptor = "I")
	protected final int anInt6545;

	@OriginalMember(owner = "client!ch", name = "fd", descriptor = "Ljava/lang/Object;")
	protected final Object anObject12;

	@OriginalMember(owner = "client!ch", name = "hc", descriptor = "Ljava/lang/Object;")
	private Object anObject11;

	@OriginalMember(owner = "client!ch", name = "rd", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas9;

	@OriginalMember(owner = "client!ch", name = "Yb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!ch", name = "Vc", descriptor = "I")
	private int anInt6459;

	@OriginalMember(owner = "client!ch", name = "hd", descriptor = "I")
	public int anInt6469;

	@OriginalMember(owner = "client!ch", name = "xf", descriptor = "I")
	public final int anInt6532;

	@OriginalMember(owner = "client!ch", name = "Dc", descriptor = "I")
	private int anInt6441;

	@OriginalMember(owner = "client!ch", name = "jc", descriptor = "I")
	public int anInt6423;

	@OriginalMember(owner = "client!ch", name = "Cf", descriptor = "Lclient!ek;")
	private final Class91 aClass91_3;

	@OriginalMember(owner = "client!ch", name = "ec", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!la;II)V")
	protected Class5_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class196 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.aClass196_66 = arg3;
		this.anInt6545 = arg4;
		this.anObject11 = this.anObject12 = arg1;
		this.aCanvas8 = this.aCanvas9 = arg0;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt6469 = this.anInt6459 = local307.width;
		this.anInt6532 = arg5;
		this.anInt6423 = this.anInt6441 = local307.height;
		Static335.method5470(false, true);
		if (super.anInterface7_15 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt6532);
			this.aClass91_3 = null;
		} else {
			this.aClass91_3 = new Class91(this, super.anInterface7_15);
			this.aNativeInterface3 = new NativeInterface(super.anInterface7_15.method8113(), this.anInt6532);
			for (@Pc(352) int local352 = 0; super.anInterface7_15.method8113() > local352; local352++) {
				@Pc(360) Class195 local360 = super.anInterface7_15.method8118(local352);
				if (local360 != null) {
					this.aNativeInterface3.initTextureMetrics(local352, local360.aByte79, local360.aByte84);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	public final void method5564() {
		if (Static479.aClass372_11 == this.aClass372_13) {
			return;
		}
		@Pc(16) Class372 local16 = this.aClass372_13;
		this.aClass372_13 = Static479.aClass372_11;
		if (local16.method8631()) {
			this.method5690();
		}
		this.anInt6537 &= 0xFFFFFFE0;
		this.aFloatArray54 = this.aFloatArray48;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "()V")
	@Override
	protected void method7493() {
		if (this.aBoolean471) {
			return;
		}
		for (@Pc(9) Class3 local9 = this.aClass223_33.method5874(); local9 != null; local9 = this.aClass223_33.method5870()) {
			((Class3_Sub5_Sub1) local9).method1051();
		}
		@Pc(26) Enumeration local26 = this.aHashtable5.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method5685(local32, this.aHashtable5.get(local32));
		}
		Static556.method8016(false, true);
		this.aNativeInterface3.release();
		this.aBoolean471 = true;
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(Z)V")
	protected abstract void method5565();

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "(II)V")
	public abstract void method5566(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)I")
	public final int method5567() {
		return this.anInt6535;
	}

	@OriginalMember(owner = "client!ch", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5628();
		this.method5574(arg3);
		this.method5583(Static161.aClass9_3, 0);
		this.method5592(Static161.aClass9_3, 0);
		this.method5666(arg4);
		this.aClass39_Sub1_15.method1551((float) arg2, 1.0F, (float) arg2);
		this.aClass39_Sub1_15.method7244(arg0, arg1, 0);
		this.method5680();
		this.method5590(false);
		this.method5692(this.anInterface11_14, 0);
		this.method5610(this.aClass46_23);
		this.method5688(Static62.aClass292_6, 256, 0);
		this.method5590(true);
		this.method5592(Static333.aClass9_2, 0);
		this.method5583(Static333.aClass9_2, 0);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BZ)V")
	public final void method5568(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean468) {
			this.aBoolean468 = arg0;
			this.method5684();
		}
	}

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "(I)Lclient!bt;")
	public final Class39_Sub1 method5569() {
		return this.aClass39_Sub1_19;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ffa;Z)Lclient!td;")
	@Override
	public final Class24 method7525(@OriginalArg(0) Class107 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(27) Class24 local27;
		if (arg0.anInt3006 == 0 || arg0.anInt3008 == 0) {
			local27 = this.method7536(new int[1], 1, 1, 1);
		} else {
			@Pc(36) int[] local36 = new int[arg0.anInt3006 * arg0.anInt3008];
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			@Pc(45) int local45;
			@Pc(49) int local49;
			if (arg0.aByteArray29 == null) {
				for (local45 = 0; local45 < arg0.anInt3008; local45++) {
					for (local49 = 0; local49 < arg0.anInt3006; local49++) {
						@Pc(103) int local103 = arg0.anIntArray143[arg0.aByteArray28[local38++] & 0xFF];
						local36[local40++] = local103 == 0 ? 0 : local103 | 0xFF000000;
					}
				}
			} else {
				for (local45 = 0; local45 < arg0.anInt3008; local45++) {
					for (local49 = 0; local49 < arg0.anInt3006; local49++) {
						local36[local40++] = arg0.aByteArray29[local38] << 24 | arg0.anIntArray143[arg0.aByteArray28[local38] & 0xFF];
						local38++;
					}
				}
			}
			local27 = this.method7536(local36, arg0.anInt3008, arg0.anInt3006, arg0.anInt3006);
		}
		local27.method8569(arg0.anInt3005, arg0.anInt3003, arg0.anInt3007, arg0.anInt3004);
		return local27;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
	protected abstract void method5570();

	@OriginalMember(owner = "client!ch", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean466 = false;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Lclient!za;")
	@Override
	public final Class3_Sub5 method7495(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub5_Sub1 local8 = new Class3_Sub5_Sub1(arg0);
		this.aClass223_33.method5868(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ch", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean466) {
			throw new RuntimeException("");
		}
		this.anInt6515 = arg0;
		this.anInt6512 = arg2;
		this.anInt6528 = arg3;
		this.anInt6541 = arg1;
		if (this.aBoolean467) {
			this.aClass29Array3[3].method8076();
			this.aClass29Array3[3].method8084();
		}
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7499() {
		return true;
	}

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "(II)V")
	public final void method5571(@OriginalArg(1) int arg0) {
		if (this.anInt6535 != arg0) {
			this.anInt6535 = arg0;
			this.method5616();
		}
	}

	@OriginalMember(owner = "client!ch", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6515 = arg0;
		this.aBoolean466 = true;
		this.anInt6541 = arg1;
		this.anInt6512 = arg2;
		this.anInt6528 = arg3;
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(Z)V")
	protected abstract void method5572();

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7542() {
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
	private void method5573() {
		this.aFloatArray51[14] = this.aFloat144;
		this.aFloatArray51[10] = this.aFloat152;
		this.aFloat151 = (this.aFloatArray51[14] - (float) this.anInt6516) / this.aFloatArray51[10];
	}

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "(II)V")
	public final void method5574(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt6513) {
			this.anInt6513 = arg0;
			this.method5565();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!eea;)V")
	@Override
	public final void method7538(@OriginalArg(0) Class85 arg0) {
		this.aClass37_3.method1420(-1, arg0, this);
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V")
	private void method5575() {
		this.aBoolean454 = false;
		if (this.aClass372_13 == Static480.aClass372_14) {
			this.method5632();
			this.method5664();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!eea;I)V")
	@Override
	public final void method7551(@OriginalArg(0) Class85 arg0, @OriginalArg(1) int arg1) {
		this.aClass37_3.method1420(arg1, arg0, this);
	}

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7532() {
		return this.aBoolean453;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method5576(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method7522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static90.method2065(arg2, arg0, arg1, arg3, this);
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(B)I")
	public final int method5577() {
		return this.anInt6528;
	}

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "(B)V")
	private void method5578() {
		this.method5608();
		if (this.aClass29_3 != null) {
			this.aClass29_3.method8077();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method7485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(18) float local18 = (float) -arg1 + (float) arg3;
		@Pc(43) float local43;
		if (local11 == 0.0F && local18 == 0.0F) {
			local11 = 1.0F;
		} else {
			local43 = (float) (1.0D / Math.sqrt((double) (local18 * local18 + local11 * local11)));
			local11 *= local43;
			local18 *= local43;
		}
		this.method5628();
		this.method5574(arg4);
		this.method5583(Static161.aClass9_3, 0);
		this.method5592(Static161.aClass9_3, 0);
		this.method5666(1);
		this.method5625();
		this.method5590(false);
		@Pc(85) int local85 = arg7 % (arg5 + arg6);
		local43 = local11 * (float) arg5;
		@Pc(95) float local95 = local18 * (float) arg5;
		@Pc(97) float local97 = 0.0F;
		@Pc(99) float local99 = 0.0F;
		@Pc(101) float local101 = local43;
		@Pc(103) float local103 = local95;
		if (arg5 >= local85) {
			local103 = (float) (arg5 - local85) * local18;
			local101 = local11 * (float) (arg5 - local85);
		} else {
			local99 = (float) (arg5 + arg6 - local85) * local18;
			local97 = (float) (arg6 + arg5 - local85) * local11;
		}
		@Pc(151) float local151 = (float) arg0 + local97;
		@Pc(156) float local156 = local99 + (float) arg1;
		@Pc(161) float local161 = (float) arg6 * local11;
		@Pc(166) float local166 = local18 * (float) arg6;
		while (true) {
			if (arg0 >= arg2) {
				if (local151 < (float) arg2) {
					break;
				}
				if (local101 + local151 < (float) arg2) {
					local101 = (float) arg2 - local151;
				}
			} else {
				if (local151 > (float) arg2) {
					break;
				}
				if ((float) arg2 < local151 + local101) {
					local101 = (float) arg2 - local151;
				}
			}
			if (arg3 > arg1) {
				if ((float) arg3 < local156) {
					break;
				}
				if ((float) arg3 < local103 + local156) {
					local103 = (float) arg3 - local156;
				}
			} else {
				if (local156 < (float) arg3) {
					break;
				}
				if (local103 + local156 < (float) arg3) {
					local103 = (float) arg3 - local156;
				}
			}
			if (!this.method5623(0.0F, local156, local151, 0.0F, local156 + local103, local101 + local151)) {
				return;
			}
			local151 += local101 + local161;
			this.method5673();
			local156 += local166 + local103;
			local101 = local43;
			local103 = local95;
		}
		this.method5590(true);
		this.method5592(Static333.aClass9_2, 0);
		this.method5583(Static333.aClass9_2, 0);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZZI)V")
	public final void method5579(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 != this.anInt6543 || this.aBoolean466 != this.aBoolean467) {
			@Pc(20) Interface24 local20 = null;
			@Pc(22) int local22 = 0;
			@Pc(24) byte local24 = 0;
			@Pc(26) int local26 = 0;
			@Pc(33) int local33 = this.aBoolean466 ? 3 : 0;
			if (arg2 < 0) {
				this.method5683();
			} else {
				local20 = this.aClass91_3.method2522(arg2);
				@Pc(50) Class195 local50 = super.anInterface7_15.method8118(arg2);
				if (local50.aByte80 == 0 && local50.aByte81 == 0) {
					this.method5683();
				} else {
					@Pc(66) int local66 = local50.aBoolean364 ? 64 : 128;
					@Pc(70) int local70 = local66 * 50;
					@Pc(74) Class39_Sub1 local74 = this.method5678();
					local74.method1550(0.0F, (float) (this.anInt6524 % local70 * local50.aByte80) / (float) local70, (float) (local50.aByte81 * (this.anInt6524 % local70)) / (float) local70);
					this.method5589(Static190.aClass340_2);
				}
				local22 = local50.anInt5428;
				if (!this.aBoolean466) {
					local26 = local50.anInt5427;
					local24 = local50.aByte82;
					local33 = local50.aByte83;
				}
			}
			this.method5584(local33, local26, arg0, local24, arg1);
			if (this.aClass29_3 == null) {
				this.method5609(local20);
				this.method5697(local22);
			} else {
				this.aClass29_3.method8072(local22, local20);
			}
			this.aBoolean467 = this.aBoolean466;
			this.anInt6543 = arg2;
		}
		this.anInt6537 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "(I)V")
	public final void method5580() {
		this.method5564();
		this.method5664();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI[[IZ)Lclient!au;")
	public abstract Interface3 method5581(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "(Z)V")
	private void method5582() {
		if (this.aClass372_13 == Static480.aClass372_14) {
			return;
		}
		@Pc(14) Class372 local14 = this.aClass372_13;
		this.aClass372_13 = Static480.aClass372_14;
		if (local14.method8631()) {
			this.method5690();
		}
		this.method5632();
		this.aFloatArray54 = this.aFloatArray49;
		this.method5664();
		this.anInt6537 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ch", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt6516;
	}

	@OriginalMember(owner = "client!ch", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass39_Sub1_16.aFloat53 * (float) arg0 + (float) arg1 * this.aClass39_Sub1_16.aFloat61 + (float) arg2 * this.aClass39_Sub1_16.aFloat60 + this.aClass39_Sub1_16.aFloat55;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass39_Sub1_16.aFloat55 + this.aClass39_Sub1_16.aFloat61 * (float) arg4 + this.aClass39_Sub1_16.aFloat53 * (float) arg3 + (float) arg5 * this.aClass39_Sub1_16.aFloat60;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt6510 && local63 < (float) this.anInt6510) {
			local7 |= 0x10;
		} else if ((float) this.anInt6516 < local32 && local63 > (float) this.anInt6516) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass39_Sub1_16.aFloat58 + this.aClass39_Sub1_16.aFloat51 * (float) arg2 + (float) arg0 * this.aClass39_Sub1_16.aFloat57 + this.aClass39_Sub1_16.aFloat50 * (float) arg1) * (float) this.anInt6530 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt6530 * (this.aClass39_Sub1_16.aFloat58 + this.aClass39_Sub1_16.aFloat51 * (float) arg5 + (float) arg4 * this.aClass39_Sub1_16.aFloat50 + this.aClass39_Sub1_16.aFloat57 * (float) arg3) / local63);
		if ((float) local135 < this.aFloat143 && (float) local167 < this.aFloat143) {
			local7 |= 0x1;
		} else if (this.aFloat149 < (float) local135 && this.aFloat149 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass39_Sub1_16.aFloat59 + this.aClass39_Sub1_16.aFloat54 * (float) arg1 + this.aClass39_Sub1_16.aFloat56 * (float) arg0 + this.aClass39_Sub1_16.aFloat52 * (float) arg2) * (float) this.anInt6514 / local32);
		@Pc(265) int local265 = (int) ((this.aClass39_Sub1_16.aFloat59 + (float) arg5 * this.aClass39_Sub1_16.aFloat52 + this.aClass39_Sub1_16.aFloat56 * (float) arg3 + (float) arg4 * this.aClass39_Sub1_16.aFloat54) * (float) this.anInt6514 / local63);
		if ((float) local233 < this.aFloat137 && this.aFloat137 > (float) local265) {
			local7 |= 0x4;
		} else if (this.aFloat150 < (float) local233 && this.aFloat150 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!af;II)V")
	public final void method5583(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1) {
		this.method5618(false, false, arg1, arg0);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZBIZ)V")
	private void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(8) boolean local8 = arg2 & this.method7497();
		if (!local8 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			arg0 = 2;
			arg1 = 1;
			arg3 = 0;
		}
		if (arg0 != 0 && arg4) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt6525 != arg0) {
			if (this.anInt6525 != 0) {
				this.aClass29Array3[this.anInt6525 & Integer.MAX_VALUE].method8071();
			}
			if (arg0 == 0) {
				this.aClass29_3 = null;
			} else {
				this.aClass29_3 = this.aClass29Array3[arg0 & Integer.MAX_VALUE];
				this.aClass29_3.method8080(arg4);
				this.aClass29_3.method8067(arg4);
				this.aClass29_3.method8083(arg1, arg3);
			}
			this.anInt6546 = arg1;
			this.anInt6542 = arg3;
			this.anInt6525 = arg0;
		} else if (this.anInt6525 != 0) {
			this.aClass29Array3[Integer.MAX_VALUE & this.anInt6525].method8067(arg4);
			if (arg3 != this.anInt6542 || this.anInt6546 != arg1) {
				this.aClass29Array3[Integer.MAX_VALUE & this.anInt6525].method8083(arg1, arg3);
				this.anInt6546 = arg1;
				this.anInt6542 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)Lclient!sha;")
	protected Class29 method5585(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class29_Sub10(this);
		} else if (arg0 == 1) {
			return new Class29_Sub2(this);
		} else if (arg0 == 2) {
			return new Class29_Sub1(this, this.lb);
		} else if (arg0 == 7) {
			return new Class29_Sub3(this);
		} else {
			return new Class29_Sub11(this);
		}
	}

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "(I)V")
	private void method5586() {
		this.anInterface11_14 = this.method5649(false);
		this.anInterface11_14.method6373(12, 3096);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(36) Buffer local36 = this.anInterface11_14.method6374();
			if (local36 != null) {
				@Pc(43) Stream local43 = this.method5647(local36);
				local43.a(0.0F);
				local43.a(0.0F);
				local43.a(0.0F);
				for (@Pc(54) int local54 = 0; local54 <= 256; local54++) {
					@Pc(65) double local65 = (double) (local54 * 2) * 3.141592653589793D / 256.0D;
					@Pc(69) float local69 = (float) Math.cos(local65);
					@Pc(73) float local73 = (float) Math.sin(local65);
					if (Stream.a()) {
						local43.a(local73);
						local43.a(local69);
						local43.a(0.0F);
					} else {
						local43.b(local73);
						local43.b(local69);
						local43.b(0.0F);
					}
				}
				local43.b();
				if (this.anInterface11_14.method6375()) {
					break;
				}
			}
		}
		this.aClass46_23 = this.method5652(new Class93[] { new Class93(Static196.aClass131_1) });
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method7533() {
	}

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean460 = arg0;
		this.method5615();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	protected abstract void method5587(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "(B)I")
	public final int method5588() {
		return this.anInt6515;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!uia;)V")
	public final void method5589(@OriginalArg(1) Class340 arg0) {
		this.aClass340Array3[this.anInt6535] = arg0;
		this.method5578();
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7547(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas9) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method5685(arg0, this.aHashtable5.get(arg0));
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZ)V")
	public abstract void method5590(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "(Z)V")
	public abstract void method5591();

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!af;I)V")
	public final void method5592(@OriginalArg(1) Class9 arg0, @OriginalArg(2) int arg1) {
		this.method5600(arg0, arg1);
	}

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "(I)V")
	public final void method5593() {
		if (this.anInt6537 == 16) {
			return;
		}
		this.method5656();
		this.method5599(true);
		this.method5611(true);
		this.method5636(true);
		this.method5666(1);
		this.anInt6537 = 16;
	}

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "(I)Lclient!bt;")
	public final Class39_Sub1 method5594() {
		if (!this.aBoolean456) {
			this.aClass39_Sub1_20.method1562(this.aClass39_Sub1_18, this.aClass39_Sub1_15);
			this.aBoolean456 = true;
		}
		return this.aClass39_Sub1_20;
	}

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "(B)V")
	protected abstract void method5595();

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "(B)V")
	private void method5596() {
		if (Static372.aClass372_10 == this.aClass372_13) {
			return;
		}
		@Pc(6) Class372 local6 = this.aClass372_13;
		this.aClass372_13 = Static372.aClass372_10;
		if (!local6.method8631()) {
			this.method5690();
		}
		this.method5617();
		this.aFloatArray54 = this.aFloatArray51;
		this.method5664();
		this.anInt6537 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ch", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt6540, this.anInt6527, this.anInt6530, this.anInt6514 };
	}

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "(I)V")
	public final void method5597() {
		if (this.anInt6537 == 8) {
			return;
		}
		this.method5596();
		this.method5599(true);
		this.method5611(true);
		this.method5636(true);
		this.method5666(1);
		this.anInt6537 = 8;
	}

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "(I)V")
	private void method5598() {
		this.aFloat146 = this.anInt6516;
	}

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "()V")
	@Override
	public final void method7507() {
		if (this.aClass91_3 != null) {
			this.aClass91_3.method2519();
		}
	}

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)V")
	@Override
	public final void method7556(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(BZ)V")
	public final void method5599(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean461) {
			this.aBoolean461 = arg0;
			this.method5657();
			this.anInt6537 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!af;IIZ)V")
	protected abstract void method5600(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "(I)V")
	private void method5601() {
		this.aBoolean455 = false;
		this.method5679();
		if (this.aClass372_13 == Static70.aClass372_12) {
			this.method5664();
		}
	}

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "()Z")
	@Override
	public final boolean method7559() {
		return true;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!kca;Lclient!wq;)Z")
	public abstract boolean method5602(@OriginalArg(1) Class182 arg0, @OriginalArg(2) Class376 arg1);

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "(I)[F")
	public final float[] method5603() {
		return this.aFloatArray48;
	}

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "(B)V")
	protected abstract void method5604();

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "(B)V")
	public final void method5605() {
		if (this.anInt6537 == 2) {
			return;
		}
		this.method5582();
		this.method5599(false);
		this.method5630(false);
		this.method5611(false);
		this.method5636(false);
		this.method5579(false, false, -2);
		this.anInt6537 = 2;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	@Override
	public void method7509(@OriginalArg(0) int arg0) {
		if (this.aClass91_3 != null) {
			this.aClass91_3.method2520();
		}
		this.anInt6524 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "(B)V")
	private void method5606() {
		if (this.aClass29_3 != null) {
			this.aClass29_3.method8084();
		}
		this.method5572();
	}

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "(I)V")
	private void method5607() {
		this.anInterface11_15 = this.method5649(false);
		this.anInterface11_15.method6373(28, 140);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(34) Buffer local34 = this.anInterface11_15.method6374();
			if (local34 != null) {
				@Pc(41) Stream local41 = this.method5647(local34);
				if (Stream.a()) {
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
				} else {
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
				}
				local41.b();
				if (this.anInterface11_15.method6375()) {
					break;
				}
			}
		}
		this.aClass46_17 = this.method5652(new Class93[] { new Class93(new Class131[] { Static196.aClass131_1, Static196.aClass131_5, Static196.aClass131_5 }) });
	}

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "(B)V")
	protected abstract void method5608();

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ec;I)V")
	public final void method5609(@OriginalArg(0) Interface10 arg0) {
		if (this.anInterface10Array3[this.anInt6535] == arg0) {
			return;
		}
		this.anInterface10Array3[this.anInt6535] = arg0;
		if (arg0 == null) {
			this.method5695();
		} else {
			arg0.method7474();
		}
		this.anInt6537 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!eu;B)V")
	public abstract void method5610(@OriginalArg(0) Class46 arg0);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)V")
	public final void method5611(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean458 != arg0) {
			this.aBoolean458 = arg0;
			this.method5694();
			this.anInt6537 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7537(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "(Z)V")
	public final void method5612() {
		if (this.anInt6537 == 4) {
			return;
		}
		this.method5582();
		this.method5599(false);
		this.method5630(false);
		this.method5611(false);
		this.method5636(false);
		this.method5579(false, false, -2);
		this.method5666(1);
		this.method5697(0);
		this.anInt6537 = 4;
	}

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "()I")
	@Override
	public final int method7517() {
		return this.anInt6549 - 2;
	}

	@OriginalMember(owner = "client!ch", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat141 != arg0) {
			this.aFloat141 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method5621();
			this.method5693();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!rf;I)V")
	private void method5613(@OriginalArg(1) Class292 arg0, @OriginalArg(2) int arg1) {
		this.method5692(this.anInterface11_15, 0);
		this.method5610(this.aClass46_17);
		this.method5688(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "(B)V")
	protected abstract void method5614();

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7491(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "(B)V")
	protected abstract void method5615();

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method7540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[Lclient!wh;)V")
	@Override
	public final void method7521(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub16[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass3_Sub16Array6[local3] = arg1[local3];
		}
		this.anInt6533 = arg0;
		if (this.aClass372_13.method8631()) {
			this.method5667();
		}
	}

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "(I)V")
	protected abstract void method5616();

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "(I)V")
	@Override
	public final void method7561(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass91_3 != null) {
			this.aClass91_3.method2519();
		}
		this.anInt6517 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "(I)V")
	private void method5617() {
		if (this.aBoolean462) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray51;
		@Pc(21) float local21 = (float) (-this.anInt6540 * this.anInt6510) / (float) this.anInt6530;
		@Pc(36) float local36 = (float) (this.anInt6510 * (this.anInt6469 - this.anInt6540)) / (float) this.anInt6530;
		@Pc(47) float local47 = (float) (this.anInt6510 * this.anInt6527) / (float) this.anInt6514;
		@Pc(62) float local62 = (float) ((this.anInt6527 - this.anInt6423) * this.anInt6510) / (float) this.anInt6514;
		if (local36 == local21 || local47 == local62) {
			local9[2] = 0.0F;
			local9[7] = 0.0F;
			local9[10] = 1.0F;
			local9[0] = 1.0F;
			local9[15] = 1.0F;
			local9[12] = 0.0F;
			local9[8] = 0.0F;
			local9[9] = 0.0F;
			local9[6] = 0.0F;
			local9[11] = 0.0F;
			local9[3] = 0.0F;
			local9[4] = 0.0F;
			local9[5] = 1.0F;
			local9[14] = 0.0F;
			local9[1] = 0.0F;
			local9[13] = 0.0F;
		} else {
			@Pc(76) float local76 = (float) this.anInt6510 * 2.0F;
			local9[8] = (local36 + local21) / (-local21 + local36);
			local9[0] = local76 / (local36 - local21);
			local9[6] = 0.0F;
			local9[5] = local76 / (local47 - local62);
			local9[7] = 0.0F;
			local9[1] = 0.0F;
			local9[3] = 0.0F;
			local9[4] = 0.0F;
			local9[12] = 0.0F;
			local9[11] = -1.0F;
			local9[13] = 0.0F;
			local9[15] = 0.0F;
			local9[14] = this.aFloat144 = (float) (this.anInt6516 * this.anInt6510) / (float) (this.anInt6510 - this.anInt6516);
			local9[2] = 0.0F;
			local9[10] = this.aFloat152 = (float) this.anInt6516 / (float) (this.anInt6510 - this.anInt6516);
			local9[9] = (local62 + local47) / (-local62 + local47);
		}
		this.method5573();
		this.aBoolean462 = true;
	}

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6510 == arg0 && this.anInt6516 == arg1) {
			return;
		}
		this.anInt6516 = arg1;
		this.anInt6510 = arg0;
		this.method5643();
		this.method5601();
		this.method5606();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZBILclient!af;)V")
	public abstract void method5618(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9 arg3);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!wq;Lclient!kca;)Z")
	public abstract boolean method5619(@OriginalArg(1) Class376 arg0, @OriginalArg(2) Class182 arg1);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!ew;)V")
	public abstract void method5620(@OriginalArg(1) Class99 arg0);

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "(I)V")
	protected abstract void method5621();

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "(I)V")
	protected abstract void method5622();

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(FFFFFFI)Z")
	private boolean method5623(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface11_13.method6374();
		if (local9 == null) {
			return false;
		}
		@Pc(18) Stream local18 = this.method5647(local9);
		if (Stream.a()) {
			local18.a(arg2);
			local18.a(arg1);
			local18.a(arg3);
			local18.a(arg5);
			local18.a(arg4);
			local18.a(arg0);
		} else {
			local18.b(arg2);
			local18.b(arg1);
			local18.b(arg3);
			local18.b(arg5);
			local18.b(arg4);
			local18.b(arg0);
		}
		local18.b();
		return this.anInterface11_13.method6375();
	}

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "(B)V")
	private void method5624() {
		if (this.aCanvas8 == null) {
			this.anInt6459 = this.anInt6441 = 1;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas8.getSize();
			this.anInt6459 = local14.width;
			this.anInt6441 = local14.height;
		}
		this.anInt6469 = this.anInt6459;
		this.anInt6423 = this.anInt6441;
		this.method5575();
		this.method5643();
		this.method5601();
		this.method5691();
		this.method5631();
		this.method5564();
		this.la();
	}

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "(Z)V")
	public final void method5625() {
		this.aClass39_Sub1_15.method7246();
		this.aBoolean451 = true;
		this.method5659();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZI[III)Lclient!ug;")
	public abstract Interface24 method5626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B[F)[F")
	public final float[] method5627(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloatArray54[0];
		arg0[8] = this.aFloatArray54[2];
		arg0[4] = this.aFloatArray54[1];
		arg0[12] = this.aFloatArray54[3];
		arg0[5] = this.aFloatArray54[5];
		arg0[2] = this.aFloatArray54[8];
		arg0[13] = this.aFloatArray54[7];
		arg0[9] = this.aFloatArray54[6];
		arg0[1] = this.aFloatArray54[4];
		arg0[6] = this.aFloatArray54[9];
		arg0[10] = this.aFloatArray54[10];
		arg0[7] = this.aFloatArray54[13];
		arg0[14] = this.aFloatArray54[11];
		arg0[3] = this.aFloatArray54[12];
		arg0[15] = this.aFloatArray54[15];
		arg0[11] = this.aFloatArray54[14];
		return arg0;
	}

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "()Z")
	@Override
	public final boolean method7518() {
		return true;
	}

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface24 local9 = local6.anInterface24_6;
		this.method5605();
		this.method5609(local9);
		this.method5666(1);
		this.method5682(Static314.aClass374_2, Static314.aClass374_2);
		this.method5583(Static161.aClass9_3, 0);
		this.method5574(arg0);
		this.aClass39_Sub1_15.method1551((float) this.anInt6423, 0.0F, (float) this.anInt6469);
		this.method5680();
		this.bf[0].method1551(local9.method7482((float) this.anInt6423), 1.0F, local9.method7476((float) this.anInt6469));
		this.bf[0].method1567(local9.method7476((float) -arg2), local9.method7482((float) -arg3), 0.0F);
		this.aClass340Array3[0] = Static190.aClass340_2;
		this.method5578();
		this.method5654();
		this.method5683();
		this.method5583(Static333.aClass9_2, 0);
	}

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "(I)V")
	private void method5628() {
		if (this.anInt6537 == 1) {
			return;
		}
		this.method5582();
		this.method5599(false);
		this.method5630(false);
		this.method5611(false);
		this.method5636(false);
		this.method5579(false, false, -2);
		this.method5697(1);
		this.method5609(this.anInterface10_3);
		this.anInt6537 = 1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!kca;IIB[BIZI)Lclient!ug;")
	protected abstract Interface24 method5629(@OriginalArg(0) Class182 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7497() {
		return this.aClass29Array3[3].method8073();
	}

	@OriginalMember(owner = "client!ch", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt6469 - 1 <= arg2 && arg1 <= 0 && this.anInt6423 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt6523 = arg3 > this.anInt6469 ? 0 : arg3;
		this.anInt6520 = arg1 >= 0 ? arg1 : 0;
		this.anInt6519 = arg2 > this.anInt6469 ? 0 : arg2;
		this.anInt6536 = arg0 < 0 ? 0 : arg0;
		if (!this.aBoolean472) {
			this.aBoolean472 = true;
			this.method5668();
		}
		this.method5604();
		this.method5631();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)Lclient!ss;")
	@Override
	public final Class205 method7486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class205_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(ZZ)V")
	public final void method5630(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean464) {
			this.aBoolean464 = arg0;
			this.method5684();
			this.anInt6537 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(II)I")
	@Override
	public final int method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "(I)V")
	private void method5631() {
		this.aFloat149 = this.anInt6519 - this.anInt6540;
		this.aFloat150 = this.anInt6523 - this.anInt6527;
		this.aFloat143 = this.anInt6536 - this.anInt6540;
		this.aFloat137 = this.anInt6520 - this.anInt6527;
	}

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "(B)V")
	private void method5632() {
		if (this.aBoolean454) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray49;
		this.aBoolean454 = true;
		if (this.anInt6469 != 0 && this.anInt6423 != 0) {
			local5[8] = 0.0F;
			local5[1] = 0.0F;
			local5[2] = 0.0F;
			local5[6] = 0.0F;
			local5[3] = 0.0F;
			local5[12] = -1.0F;
			local5[0] = 2.0F / (float) this.anInt6469;
			local5[10] = 0.5F;
			local5[9] = 0.0F;
			local5[7] = 0.0F;
			local5[4] = 0.0F;
			local5[13] = 1.0F;
			local5[15] = 1.0F;
			local5[14] = 0.5F;
			local5[11] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt6423;
			return;
		}
		local5[0] = 1.0F;
		local5[7] = 0.0F;
		local5[1] = 0.0F;
		local5[3] = 0.0F;
		local5[5] = 1.0F;
		local5[10] = 1.0F;
		local5[2] = 0.0F;
		local5[4] = 0.0F;
		local5[6] = 0.0F;
		local5[15] = 1.0F;
		local5[11] = 0.0F;
		local5[12] = 0.0F;
		local5[14] = 0.0F;
		local5[9] = 0.0F;
		local5[8] = 0.0F;
		local5[13] = 0.0F;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZII[II)Lclient!ug;")
	public final Interface24 method5633(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		return this.method5626(0, 0, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "()Lclient!sk;")
	@Override
	public final Class39 method7503() {
		return this.aClass39_Sub1_16;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method5660();
		this.method5628();
		this.method5574(arg4);
		this.method5583(Static161.aClass9_3, 0);
		this.method5592(Static161.aClass9_3, 0);
		this.method5666(arg5);
		this.aClass39_Sub1_15.method1551((float) (arg3 - 1), 1.0F, (float) (arg2 - 1));
		this.aClass39_Sub1_15.method1567((float) arg0 - local7, -local7 + (float) arg1, 0.0F);
		this.method5680();
		this.method5590(false);
		this.method5613(Static493.aClass292_4, 4);
		this.method5590(true);
		this.method5592(Static333.aClass9_2, 0);
		this.method5583(Static333.aClass9_2, 0);
	}

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "(B)V")
	protected final void method5634() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable5.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method5576(local26));
			}
		}
		this.aHashtable5 = local9;
		this.method5607();
		this.method5640();
		this.method5586();
		this.aClass37_3.method1425(this);
	}

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "(I)V")
	protected abstract void method5635();

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(IZ)V")
	public final void method5636(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean459) {
			this.aBoolean459 = arg0;
			this.method5615();
			this.anInt6537 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIF)Lclient!wh;")
	@Override
	public final Class3_Sub16 method7550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub16_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!kca;BII[BI)Lclient!iv;")
	public abstract Interface12 method5637(@OriginalArg(0) Class182 arg0, @OriginalArg(4) byte[] arg1);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class51 method7505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class51_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BF)V")
	public final void method5638(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat138) {
			this.aFloat138 = arg0;
			this.method5601();
		}
	}

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "(I)V")
	protected abstract void method5639();

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7554(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas9 == arg0) {
			local5 = this.anObject11;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method5587(local5, arg0);
		if (this.aCanvas8 == arg0) {
			this.method5624();
		}
	}

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "(I)V")
	private void method5640() {
		this.anInterface11_13 = this.method5649(true);
		this.anInterface11_13.method6373(12, 24);
		this.aClass46_21 = this.method5652(new Class93[] { new Class93(Static196.aClass131_1) });
	}

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "(I)V")
	protected abstract void method5641();

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)V")
	public final void method5642(@OriginalArg(1) byte arg0) {
		this.method5574(arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7520(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas9) {
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
			@Pc(53) Object local53 = this.method5576(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!ch", name = "E", descriptor = "(I)V")
	private void method5643() {
		this.aBoolean462 = false;
		this.method5617();
		if (this.aClass372_13 == Static372.aClass372_10) {
			this.method5664();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZB)V")
	public final void method5644(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean463 != arg0) {
			this.aBoolean463 = arg0;
			this.method5657();
		}
	}

	@OriginalMember(owner = "client!ch", name = "F", descriptor = "(I)V")
	protected abstract void method5645();

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!qt;[Lclient!ffa;Z)Lclient!da;")
	@Override
	public final Class62 method7515(@OriginalArg(0) Class282 arg0, @OriginalArg(1) Class107[] arg1) {
		return new Class62_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "(B)Lclient!bt;")
	public final Class39_Sub1 method5646() {
		return this.aClass39_Sub1_18;
	}

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass39_Sub1_16.aFloat55 + this.aClass39_Sub1_16.aFloat60 * (float) arg2 + this.aClass39_Sub1_16.aFloat53 * (float) arg0 + this.aClass39_Sub1_16.aFloat61 * (float) arg1;
		@Pc(57) float local57 = this.aClass39_Sub1_16.aFloat55 + (float) arg5 * this.aClass39_Sub1_16.aFloat60 + this.aClass39_Sub1_16.aFloat61 * (float) arg4 + this.aClass39_Sub1_16.aFloat53 * (float) arg3;
		if ((float) this.anInt6510 > local32 && local57 < (float) this.anInt6510) {
			local7 |= 0x10;
		} else if ((float) this.anInt6516 < local32 && (float) this.anInt6516 < local57) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt6530 * (this.aClass39_Sub1_16.aFloat51 * (float) arg2 + this.aClass39_Sub1_16.aFloat57 * (float) arg0 + this.aClass39_Sub1_16.aFloat50 * (float) arg1 + this.aClass39_Sub1_16.aFloat58) / (float) arg6);
		@Pc(157) int local157 = (int) ((this.aClass39_Sub1_16.aFloat58 + (float) arg4 * this.aClass39_Sub1_16.aFloat50 + (float) arg3 * this.aClass39_Sub1_16.aFloat57 + (float) arg5 * this.aClass39_Sub1_16.aFloat51) * (float) this.anInt6530 / (float) arg6);
		if ((float) local124 < this.aFloat143 && this.aFloat143 > (float) local157) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat149 && (float) local157 > this.aFloat149) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt6514 * (this.aClass39_Sub1_16.aFloat59 + (float) arg2 * this.aClass39_Sub1_16.aFloat52 + this.aClass39_Sub1_16.aFloat56 * (float) arg0 + this.aClass39_Sub1_16.aFloat54 * (float) arg1) / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt6514 * (this.aClass39_Sub1_16.aFloat52 * (float) arg5 + (float) arg3 * this.aClass39_Sub1_16.aFloat56 + this.aClass39_Sub1_16.aFloat54 * (float) arg4 + this.aClass39_Sub1_16.aFloat59) / (float) arg6);
		if (this.aFloat137 > (float) local224 && (float) local257 < this.aFloat137) {
			local7 |= 0x4;
		} else if (this.aFloat150 < (float) local224 && this.aFloat150 < (float) local257) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method5647(@OriginalArg(1) Buffer arg0) {
		this.aStream6.a(arg0);
		return this.aStream6;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method5648(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(ZZ)Lclient!fg;")
	public abstract Interface11 method5649(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ch", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt6536 = 0;
		this.anInt6520 = 0;
		this.anInt6519 = this.anInt6469;
		this.anInt6523 = this.anInt6423;
		if (this.aBoolean472) {
			this.aBoolean472 = false;
			this.method5668();
		}
		this.method5631();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBLclient!wq;Lclient!kca;)Lclient!ug;")
	public abstract Interface24 method5650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class376 arg2, @OriginalArg(4) Class182 arg3);

	@OriginalMember(owner = "client!ch", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass39_Sub1_16.method1545((float) arg0, (float) arg2, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt6530 * this.aClass39_Sub1_16.method1552((float) arg0, (float) arg2, (float) arg1) / local14);
			local58 = (int) ((float) this.anInt6514 * this.aClass39_Sub1_16.method1555((float) arg2, (float) arg1, (float) arg0) / local14);
		} else {
			local58 = this.anInt6527;
			local40 = this.anInt6540;
		}
		arg3[1] = (int) ((float) local58 - this.aFloat137);
		arg3[0] = (int) ((float) local40 - this.aFloat143);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!ch", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt6508 + this.anInt6497 + this.anInt6509;
	}

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt6550;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!bt;)V")
	public final void method5651(@OriginalArg(1) Class39_Sub1 arg0) {
		this.aClass39_Sub1_15.method7236(arg0);
		this.aBoolean451 = false;
		this.method5659();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[Lclient!en;)Lclient!eu;")
	public abstract Class46 method5652(@OriginalArg(1) Class93[] arg0);

	@OriginalMember(owner = "client!ch", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt6536 < arg0) {
			local5 = true;
			this.anInt6536 = arg0;
		}
		if (this.anInt6519 > arg2) {
			this.anInt6519 = arg2;
			local5 = true;
		}
		if (arg1 > this.anInt6520) {
			this.anInt6520 = arg1;
			local5 = true;
		}
		if (arg3 < this.anInt6523) {
			this.anInt6523 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean472) {
			this.aBoolean472 = true;
			this.method5668();
		}
		this.method5604();
		this.method5631();
	}

	@OriginalMember(owner = "client!ch", name = "G", descriptor = "(I)V")
	protected final void method5653() {
		@Pc(9) Enumeration local9 = this.aHashtable5.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method5685(local15, this.aHashtable5.get(local15));
		}
		this.anInterface11_15.method7982();
		this.anInterface11_13.method7982();
		this.anInterface11_14.method7982();
		this.aClass17_Sub3_28.method5439();
		this.aClass17_Sub3_23.method5439();
		this.aClass17_Sub3_25.method5439();
		this.aClass17_Sub3_21.method5439();
		this.aClass17_Sub3_30.method5439();
		this.aClass37_3.method1418();
		this.anInterface19_6.method7982();
	}

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "(B)V")
	public final void method5654() {
		this.method5613(Static62.aClass292_6, 2);
	}

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "(B)V")
	protected void method5655() {
		this.method5674();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([IIIIIZ)Lclient!td;")
	@Override
	public final Class24 method7563(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class24_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V")
	@Override
	public final void method7510(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ch", name = "H", descriptor = "(I)V")
	private void method5656() {
		if (this.aClass372_13 == Static70.aClass372_12) {
			return;
		}
		@Pc(14) Class372 local14 = this.aClass372_13;
		this.aClass372_13 = Static70.aClass372_12;
		if (!local14.method8631()) {
			this.method5690();
		}
		this.method5679();
		this.aFloatArray54 = this.aFloatArray46;
		this.method5664();
		this.anInt6537 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "()Lclient!sk;")
	@Override
	public final Class39 method7546() {
		return this.aClass39_Sub1_21;
	}

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "()Z")
	@Override
	public final boolean method7549() {
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "(Z)V")
	protected abstract void method5657();

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "(I)Lclient!bt;")
	public final Class39_Sub1 method5658() {
		return this.aClass39_Sub1_15;
	}

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "(Z)V")
	private void method5659() {
		if (Static480.aClass372_14 == this.aClass372_13) {
			@Pc(11) float local11 = this.method5660();
			this.aClass39_Sub1_15.method1567(local11, local11, 0.0F);
		}
		this.aBoolean456 = false;
		this.method5595();
		if (this.aClass29_3 != null) {
			this.aClass29_3.method8082();
		}
	}

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "(B)F")
	protected abstract float method5660();

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "()Lclient!sk;")
	@Override
	public final Class39 method7552() {
		return new Class39_Sub1();
	}

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "(B)Lclient!bt;")
	public final Class39_Sub1 method5661() {
		return this.bf[this.anInt6535];
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[BZIILclient!kca;)Lclient!ug;")
	public final Interface24 method5662(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class182 arg4) {
		return this.method5629(arg4, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method5663(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap5.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "(Z)V")
	private void method5664() {
		this.method5675();
		if (this.aClass29_3 != null) {
			this.aClass29_3.method8078();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ss;)V")
	@Override
	public final void method7498(@OriginalArg(0) Class205 arg0) {
		this.aClass205_Sub2_3 = (Class205_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!rf;IIILclient!rr;II)V")
	public abstract void method5665(@OriginalArg(0) Class292 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface19 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(IB)V")
	public final void method5666(@OriginalArg(0) int arg0) {
		if (this.anInt6544 == arg0) {
			return;
		}
		@Pc(28) Class7 local28;
		@Pc(26) boolean local26;
		@Pc(24) boolean local24;
		if (arg0 == 1) {
			local24 = true;
			local26 = true;
			local28 = Static57.aClass7_4;
		} else if (arg0 == 2) {
			local24 = false;
			local28 = Static32.aClass7_6;
			local26 = true;
		} else if (arg0 == 128) {
			local26 = true;
			local24 = true;
			local28 = Static608.aClass7_7;
		} else {
			local24 = false;
			local26 = false;
			local28 = Static639.aClass7_8;
		}
		if (this.aBoolean457 != local24) {
			this.aBoolean457 = local24;
			this.method5639();
		}
		if (this.aBoolean452 != local26) {
			this.aBoolean452 = local26;
			this.method5645();
		}
		if (this.aClass7_5 != local28) {
			this.aClass7_5 = local28;
			this.method5570();
		}
		this.anInt6537 &= 0xFFFFFFE3;
		this.anInt6544 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "(B)V")
	protected void method5667() {
		this.anInt6522 = this.anInt6533;
		this.anInt6533 = 0;
	}

	@OriginalMember(owner = "client!ch", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7537(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ch", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6520;
		arg0[3] = this.anInt6523;
		arg0[0] = this.anInt6536;
		arg0[2] = this.anInt6519;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIZ)Lclient!td;")
	@Override
	public final Class24 method7545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class24_Sub3 local11 = new Class24_Sub3(this, arg2, arg3, arg4);
		local11.method8565(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "(I)V")
	protected abstract void method5668();

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "(II)Lclient!rr;")
	public final Interface19 method5669(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface19_6.method7980()) {
			this.anInterface19_6.method7981(arg0);
		}
		return this.anInterface19_6;
	}

	@OriginalMember(owner = "client!ch", name = "K", descriptor = "(I)V")
	protected abstract void method5670();

	@OriginalMember(owner = "client!ch", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt6548 != arg0;
		if (local15 || this.aFloat148 != arg1 || arg2 != this.aFloat147) {
			this.anInt6548 = arg0;
			this.aFloat147 = arg2;
			this.aFloat148 = arg1;
			if (local15) {
				this.aFloat140 = (float) (this.anInt6548 & 0xFF) / 255.0F;
				this.aFloat142 = (float) (this.anInt6548 & 0xFF00) / 65280.0F;
				this.aFloat136 = (float) (this.anInt6548 & 0xFF0000) / 1.671168E7F;
				this.method5621();
			}
			this.aNativeInterface3.setSunColour(this.aFloat136, this.aFloat142, this.aFloat140, arg1, arg2);
			this.method5635();
		}
		if (this.aFloatArray52[0] != arg3 || arg4 != this.aFloatArray52[1] || arg5 != this.aFloatArray52[2]) {
			this.aFloatArray52[0] = arg3;
			this.aFloatArray52[1] = arg4;
			this.aFloatArray52[2] = arg5;
			this.aFloatArray47[0] = -arg3;
			this.aFloatArray47[2] = -arg5;
			this.aFloatArray47[1] = -arg4;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray50[0] = local153 * arg3;
			this.aFloatArray50[2] = arg5 * local153;
			this.aFloatArray50[1] = local153 * arg4;
			this.aFloatArray53[1] = -this.aFloatArray50[1];
			this.aFloatArray53[2] = -this.aFloatArray50[2];
			this.aFloatArray53[0] = -this.aFloatArray50[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray50[0], this.aFloatArray50[1], this.aFloatArray50[2]);
			this.method5591();
			this.anInt6511 = (int) (arg5 * 256.0F / arg4);
			this.anInt6547 = (int) (arg3 * 256.0F / arg4);
		}
		this.method5693();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public final void method7504(@OriginalArg(0) Class39 arg0) {
		this.aClass39_Sub1_16 = (Class39_Sub1) arg0;
		this.aClass39_Sub1_18.method7236(this.aClass39_Sub1_16);
		this.aClass39_Sub1_18.method1548();
		this.aClass39_Sub1_19.method1560(this.aClass39_Sub1_18);
		this.aClass39_Sub1_17.method1560(this.aClass39_Sub1_16);
		if (this.aClass372_13.method8631()) {
			this.method5690();
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "()Z")
	@Override
	public final boolean method7494() {
		return true;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(BZ)Lclient!rr;")
	public abstract Interface19 method5671(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLclient!kca;II[FB)Lclient!ug;")
	public final Interface24 method5672(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4) {
		return this.method5677(arg0, arg2, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!ch", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt6526 = 0;
		while (arg0 > 1) {
			this.anInt6526++;
			arg0 >>= 0x1;
		}
		this.anInt6529 = 0x1 << this.anInt6526;
	}

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "(I)V")
	private void method5673() {
		this.method5692(this.anInterface11_13, 0);
		this.method5610(this.aClass46_21);
		this.method5688(Static620.aClass292_7, 1, 0);
	}

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "(I)V")
	private void method5674() {
		this.method5621();
		this.method5635();
		this.method5684();
		this.method5667();
		this.method5591();
		this.method5693();
		this.method5670();
		this.method5694();
		this.method5615();
		this.method5657();
		this.method5572();
		this.method5645();
		this.method5570();
		this.method5639();
		for (@Pc(52) int local52 = this.anInt6538 - 1; local52 >= 0; local52--) {
			this.method5571(local52);
			this.method5614();
			this.method5622();
			this.method5683();
		}
		this.method5565();
		this.method5691();
		this.method5675();
		this.method5595();
		this.method5641();
	}

	@OriginalMember(owner = "client!ch", name = "N", descriptor = "(I)V")
	protected abstract void method5675();

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "(B)V")
	public final void method5676() {
		this.aClass340Array3 = new Class340[this.anInt6538];
		this.aClass374Array5 = new Class374[this.anInt6538];
		this.aClass374Array6 = new Class374[this.anInt6538];
		this.bf = new Class39_Sub1[this.anInt6538];
		this.anInterface10Array3 = new Interface10[this.anInt6538];
		for (@Pc(38) int local38 = 0; local38 < this.anInt6538; local38++) {
			this.aClass374Array5[local38] = Static514.aClass374_5;
			this.aClass374Array6[local38] = Static514.aClass374_5;
			this.aClass340Array3[local38] = Static362.aClass340_4;
			this.bf[local38] = new Class39_Sub1();
		}
		this.aClass3_Sub16Array6 = new Class3_Sub16[this.anInt6549 - 2];
		this.anInterface10_3 = this.method5650(1, 1, Static637.aClass376_16, Static502.aClass182_14);
		this.method7523(new Class3_Sub5_Sub1(262144));
		this.aClass46_19 = this.method5652(new Class93[] { new Class93(new Class131[] { Static196.aClass131_1, Static196.aClass131_5 }) });
		this.aClass46_18 = this.method5652(new Class93[] { new Class93(new Class131[] { Static196.aClass131_1, Static196.aClass131_3 }) });
		this.aClass46_20 = this.method5652(new Class93[] { new Class93(Static196.aClass131_1), new Class93(Static196.aClass131_3), new Class93(Static196.aClass131_5), new Class93(Static196.aClass131_2) });
		this.aClass46_22 = this.method5652(new Class93[] { new Class93(Static196.aClass131_1), new Class93(Static196.aClass131_3), new Class93(Static196.aClass131_5) });
		this.aClass17_Sub3_27 = new Class17_Sub3(this, 0, 0, false, false);
		this.aClass17_Sub3_28 = new Class17_Sub3(this, 0, 0, true, true);
		this.aClass17_Sub3_29 = new Class17_Sub3(this, 0, 0, false, false);
		this.aClass17_Sub3_23 = new Class17_Sub3(this, 0, 0, true, true);
		this.aClass17_Sub3_26 = new Class17_Sub3(this, 0, 0, false, false);
		this.aClass17_Sub3_25 = new Class17_Sub3(this, 0, 0, true, true);
		this.aClass17_Sub3_22 = new Class17_Sub3(this, 0, 0, false, false);
		this.aClass17_Sub3_21 = new Class17_Sub3(this, 0, 0, true, true);
		this.aClass17_Sub3_24 = new Class17_Sub3(this, 0, 0, false, false);
		this.aClass17_Sub3_30 = new Class17_Sub3(this, 0, 0, true, true);
		this.aClass37_3 = new Class37(this);
		this.anInterface19_6 = this.method5671(true);
		this.method5634();
		this.lb = new Class345(this);
		this.aClass29Array3[1] = this.method5585(1);
		this.aClass29Array3[2] = this.method5585(2);
		this.aClass29Array3[4] = this.method5585(4);
		this.aClass29Array3[5] = this.method5585(5);
		this.aClass29Array3[6] = this.method5585(6);
		this.aClass29Array3[7] = this.method5585(7);
		this.aClass29Array3[3] = this.method5585(3);
		this.aClass29Array3[8] = this.method5585(8);
		this.aClass29Array3[9] = this.method5585(9);
		if (!this.aClass29Array3[2].method8073()) {
			this.aClass29Array3[2] = this.method5585(0);
		}
		if (!this.aClass29Array3[4].method8073()) {
			this.aClass29Array3[4] = this.aClass29Array3[2];
		}
		if (!this.aClass29Array3[8].method8073()) {
			this.aClass29Array3[8] = this.aClass29Array3[4];
		}
		if (!this.aClass29Array3[9].method8073()) {
			this.aClass29Array3[9] = this.aClass29Array3[8];
		}
		this.method5655();
		this.la();
		this.method7567();
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)I")
	@Override
	public final int method7501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ch", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass39_Sub1_16.method1545((float) arg0, (float) arg2, (float) arg1);
		if ((float) this.anInt6510 > local14 || local14 > (float) this.anInt6516) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt6530 * this.aClass39_Sub1_16.method1552((float) arg0, (float) arg2, (float) arg1) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt6514 * this.aClass39_Sub1_16.method1555((float) arg2, (float) arg1, (float) arg0) / (float) arg3);
		arg4[2] = (int) local14;
		arg4[0] = (int) ((float) local58 - this.aFloat143);
		arg4[1] = (int) ((float) local77 - this.aFloat137);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBZIILclient!kca;[F)Lclient!ug;")
	protected abstract Interface24 method5677(@OriginalArg(3) boolean arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class182 arg3, @OriginalArg(7) float[] arg4);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZ)Lclient!td;")
	@Override
	public final Class24 method7524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class24_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7539(@OriginalArg(0) Canvas arg0) {
		this.anObject11 = null;
		this.aCanvas8 = null;
		if (arg0 == null || this.aCanvas9 == arg0) {
			this.aCanvas8 = this.aCanvas9;
			this.anObject11 = this.anObject12;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject11 = this.aHashtable5.get(arg0);
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.anObject11 == null) {
			throw new RuntimeException();
		}
		this.method5648(this.aCanvas8, this.anObject11);
		this.method5624();
	}

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
	@Override
	public final void method7526() {
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method7537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		if (local10 == 0.0F && local17 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(42) float local42 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
			local10 *= local42;
			local17 *= local42;
		}
		if (!this.method5623(0.0F, (float) arg1, (float) arg0, 0.0F, local17 + (float) arg3, local10 + (float) arg2)) {
			return;
		}
		this.method5628();
		this.method5574(arg4);
		this.method5583(Static161.aClass9_3, 0);
		this.method5592(Static161.aClass9_3, 0);
		this.method5666(arg5);
		this.method5625();
		this.method5590(false);
		this.method5673();
		this.method5590(true);
		this.method5592(Static333.aClass9_2, 0);
		this.method5583(Static333.aClass9_2, 0);
	}

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "(B)Lclient!bt;")
	public final Class39_Sub1 method5678() {
		return this.bf[this.anInt6535];
	}

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "(B)V")
	private void method5679() {
		if (this.aBoolean455) {
			return;
		}
		@Pc(18) float[] local18 = this.aFloatArray46;
		@Pc(22) float local22 = (float) this.anInt6510;
		@Pc(26) float local26 = (float) this.anInt6516;
		@Pc(38) float local38 = this.aFloat138 * (float) -this.anInt6527 / (float) this.anInt6514;
		@Pc(50) float local50 = (float) -this.anInt6540 * this.aFloat138 / (float) this.anInt6530;
		@Pc(64) float local64 = this.aFloat138 * (float) (this.anInt6469 - this.anInt6540) / (float) this.anInt6530;
		@Pc(79) float local79 = (float) (this.anInt6423 - this.anInt6527) * this.aFloat138 / (float) this.anInt6514;
		if (local50 == local64 || local38 == local79) {
			local18[9] = 0.0F;
			local18[4] = 0.0F;
			local18[13] = 0.0F;
			local18[6] = 0.0F;
			local18[2] = 0.0F;
			local18[7] = 0.0F;
			local18[8] = 0.0F;
			local18[11] = 0.0F;
			local18[0] = 1.0F;
			local18[3] = 0.0F;
			local18[15] = 1.0F;
			local18[12] = 0.0F;
			local18[14] = 0.0F;
			local18[1] = 0.0F;
			local18[10] = 1.0F;
			local18[5] = 1.0F;
		} else {
			local18[10] = 1.0F / (local22 - local26);
			local18[3] = 0.0F;
			local18[5] = 2.0F / (local79 - local38);
			local18[6] = 0.0F;
			local18[0] = 2.0F / (local64 - local50);
			local18[2] = 0.0F;
			local18[11] = 0.0F;
			local18[7] = 0.0F;
			local18[13] = (local38 + local79) / (local79 - local38);
			local18[9] = 0.0F;
			local18[1] = 0.0F;
			local18[8] = 0.0F;
			local18[14] = local22 / (local22 - local26);
			local18[15] = 1.0F;
			local18[4] = 0.0F;
			local18[12] = (local50 + local64) / (-local64 + local50);
		}
		this.method5598();
		this.aBoolean455 = true;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	@Override
	public final void method7502(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "(B)V")
	public final void method5680() {
		this.aBoolean451 = false;
		this.method5659();
	}

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "(I)Lclient!au;")
	public final Interface3 method5681() {
		return this.aClass205_Sub2_3 == null ? null : this.aClass205_Sub2_3.method5463();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!wk;Lclient!wk;)V")
	public final void method5682(@OriginalArg(1) Class374 arg0, @OriginalArg(2) Class374 arg1) {
		@Pc(13) boolean local13 = false;
		if (arg1 != this.aClass374Array6[this.anInt6535]) {
			this.aClass374Array6[this.anInt6535] = arg1;
			this.method5614();
			local13 = true;
		}
		if (this.aClass374Array5[this.anInt6535] != arg0) {
			this.aClass374Array5[this.anInt6535] = arg0;
			local13 = true;
			this.method5622();
		}
		if (local13) {
			this.anInt6537 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt6510;
	}

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt6521 && arg1 == this.anInt6539 && this.anInt6531 == arg2) {
			return;
		}
		this.anInt6531 = arg2;
		this.anInt6539 = arg1;
		this.anInt6521 = arg0;
		this.method5606();
		this.method5657();
	}

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "(B)V")
	public final void method5683() {
		if (this.aClass340Array3[this.anInt6535] != Static362.aClass340_4) {
			this.aClass340Array3[this.anInt6535] = Static362.aClass340_4;
			this.bf[this.anInt6535].method7246();
			this.method5578();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([I)V")
	@Override
	public final void method7530(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6423;
		arg0[0] = this.anInt6469;
	}

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "(I)V")
	protected abstract void method5684();

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	protected abstract void method5685(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method7523(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aNativeHeap5 = ((Class3_Sub5_Sub1) arg0).aNativeHeap3;
		this.aNativeHeapBuffer5 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(BZ)V")
	public final void method5686(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean470) {
			this.aBoolean470 = arg0;
			this.method5670();
		}
	}

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7543() {
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5628();
		this.method5574(arg4);
		this.method5583(Static161.aClass9_3, 0);
		this.method5592(Static161.aClass9_3, 0);
		this.method5666(arg5);
		this.aClass39_Sub1_15.method1551((float) arg3, 1.0F, (float) arg2);
		this.aClass39_Sub1_15.method7244(arg0, arg1, 0);
		this.method5680();
		this.method5590(false);
		this.method5654();
		this.method5590(true);
		this.method5592(Static333.aClass9_2, 0);
		this.method5583(Static333.aClass9_2, 0);
	}

	@OriginalMember(owner = "client!ch", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6530 = arg2;
		this.anInt6540 = arg0;
		this.anInt6527 = arg1;
		this.anInt6514 = arg3;
		this.method5601();
		this.method5643();
		this.method5564();
		this.method5631();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!rf;IIB)V")
	public abstract void method5688(@OriginalArg(0) Class292 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "(I)I")
	public final int method5689() {
		return this.anInt6512;
	}

	@OriginalMember(owner = "client!ch", name = "S", descriptor = "(I)V")
	private void method5690() {
		this.aBoolean456 = false;
		if (this.aClass29_3 != null) {
			this.aClass29_3.method8079();
		}
		this.method5641();
	}

	@OriginalMember(owner = "client!ch", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass39_Sub1_16.method1545((float) arg0, (float) arg2, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt6530 * this.aClass39_Sub1_16.method1552((float) arg0, (float) arg2, (float) arg1) / local14);
			local58 = (int) ((float) this.anInt6514 * this.aClass39_Sub1_16.method1555((float) arg2, (float) arg1, (float) arg0) / local14);
		} else {
			local40 = this.anInt6540;
			local58 = this.anInt6527;
		}
		arg3[1] = (int) ((float) local58 - this.aFloat137);
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local40 - this.aFloat143);
	}

	@OriginalMember(owner = "client!ch", name = "T", descriptor = "(I)V")
	protected abstract void method5691();

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!fu;IIII)Lclient!ka;")
	@Override
	public final Class17 method7490(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class17_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!fg;IB)V")
	public abstract void method5692(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ch", name = "U", descriptor = "(I)V")
	protected abstract void method5693();

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "()Z")
	@Override
	public final boolean method7529() {
		return true;
	}

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "(B)V")
	protected abstract void method5694();

	@OriginalMember(owner = "client!ch", name = "V", descriptor = "(I)V")
	protected abstract void method5695();

	@OriginalMember(owner = "client!ch", name = "W", descriptor = "(I)I")
	public final int method5696() {
		return this.anInt6541;
	}

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "(II)V")
	public final void method5697(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method5682(Static314.aClass374_2, Static314.aClass374_2);
		} else if (arg0 == 0) {
			this.method5682(Static514.aClass374_5, Static514.aClass374_5);
		} else if (arg0 == 2) {
			this.method5682(Static314.aClass374_2, Static275.aClass374_1);
		} else if (arg0 == 3) {
			this.method5682(Static514.aClass374_5, Static377.aClass374_3);
		} else if (arg0 == 4) {
			this.method5682(Static480.aClass374_4, Static480.aClass374_4);
		}
	}

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7568() {
		return true;
	}
}
