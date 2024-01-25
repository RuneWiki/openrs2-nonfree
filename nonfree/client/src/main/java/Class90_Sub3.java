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

@OriginalClass("client!gj")
public abstract class Class90_Sub3 extends Class90 {

	@OriginalMember(owner = "client!gj", name = "Y", descriptor = "Lclient!db;")
	protected Class66 aClass66_6;

	@OriginalMember(owner = "client!gj", name = "tb", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!gj", name = "Gc", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7;

	@OriginalMember(owner = "client!gj", name = "vd", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!gj", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!gj", name = "Cd", descriptor = "I")
	public int anInt9532;

	@OriginalMember(owner = "client!gj", name = "Dd", descriptor = "I")
	public int anInt9533;

	@OriginalMember(owner = "client!gj", name = "Pd", descriptor = "I")
	protected int anInt9544;

	@OriginalMember(owner = "client!gj", name = "ee", descriptor = "Z")
	public boolean aBoolean631;

	@OriginalMember(owner = "client!gj", name = "qe", descriptor = "Lclient!tf;")
	private Class34 aClass34_3;

	@OriginalMember(owner = "client!gj", name = "re", descriptor = "Lclient!ek;")
	public Interface3 anInterface3_3;

	@OriginalMember(owner = "client!gj", name = "we", descriptor = "Z")
	protected boolean aBoolean636;

	@OriginalMember(owner = "client!gj", name = "ze", descriptor = "[Lclient!ld;")
	protected Class6_Sub25[] aClass6_Sub25Array6;

	@OriginalMember(owner = "client!gj", name = "Ae", descriptor = "F")
	private float aFloat189;

	@OriginalMember(owner = "client!gj", name = "De", descriptor = "Lclient!lu;")
	private Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!gj", name = "Ee", descriptor = "I")
	private int anInt9560;

	@OriginalMember(owner = "client!gj", name = "Je", descriptor = "I")
	public int anInt9563;

	@OriginalMember(owner = "client!gj", name = "Ke", descriptor = "Z")
	public boolean aBoolean638;

	@OriginalMember(owner = "client!gj", name = "Oe", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!gj", name = "Te", descriptor = "Z")
	public boolean aBoolean640;

	@OriginalMember(owner = "client!gj", name = "Ve", descriptor = "F")
	private float aFloat194;

	@OriginalMember(owner = "client!gj", name = "We", descriptor = "I")
	protected int anInt9569;

	@OriginalMember(owner = "client!gj", name = "Xe", descriptor = "F")
	public float aFloat195;

	@OriginalMember(owner = "client!gj", name = "af", descriptor = "Z")
	protected boolean aBoolean642;

	@OriginalMember(owner = "client!gj", name = "bf", descriptor = "[Lclient!nd;")
	protected Class214[] bf;

	@OriginalMember(owner = "client!gj", name = "df", descriptor = "F")
	public float aFloat197;

	@OriginalMember(owner = "client!gj", name = "hf", descriptor = "[Lclient!kh;")
	protected Class172[] aClass172Array3;

	@OriginalMember(owner = "client!gj", name = "mf", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!gj", name = "nf", descriptor = "[Lclient!je;")
	protected Class93_Sub3[] aClass93_Sub3Array3;

	@OriginalMember(owner = "client!gj", name = "pf", descriptor = "I")
	protected int anInt9573;

	@OriginalMember(owner = "client!gj", name = "qf", descriptor = "[Lclient!nd;")
	protected Class214[] aClass214Array3;

	@OriginalMember(owner = "client!gj", name = "sf", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!gj", name = "xf", descriptor = "I")
	public int anInt9578;

	@OriginalMember(owner = "client!gj", name = "Df", descriptor = "I")
	public int anInt9580;

	@OriginalMember(owner = "client!gj", name = "Ff", descriptor = "F")
	public float aFloat203;

	@OriginalMember(owner = "client!gj", name = "Gf", descriptor = "I")
	protected int anInt9581;

	@OriginalMember(owner = "client!gj", name = "If", descriptor = "I")
	protected int anInt9582;

	@OriginalMember(owner = "client!gj", name = "Jf", descriptor = "I")
	public int anInt9583;

	@OriginalMember(owner = "client!gj", name = "Lf", descriptor = "Lclient!dga;")
	private Class73 aClass73_3;

	@OriginalMember(owner = "client!gj", name = "Rf", descriptor = "[Lclient!ek;")
	private Interface3[] anInterface3Array3;

	@OriginalMember(owner = "client!gj", name = "Uf", descriptor = "I")
	private int anInt9587;

	@OriginalMember(owner = "client!gj", name = "Vf", descriptor = "F")
	private float aFloat205;

	@OriginalMember(owner = "client!gj", name = "ag", descriptor = "Lclient!na;")
	public Class24_Sub3 aClass24_Sub3_21;

	@OriginalMember(owner = "client!gj", name = "bg", descriptor = "Lclient!na;")
	public Class24_Sub3 aClass24_Sub3_22;

	@OriginalMember(owner = "client!gj", name = "cg", descriptor = "Lclient!fl;")
	public Class107 aClass107_15;

	@OriginalMember(owner = "client!gj", name = "dg", descriptor = "Lclient!fl;")
	public Class107 aClass107_16;

	@OriginalMember(owner = "client!gj", name = "eg", descriptor = "Lclient!fl;")
	private Class107 aClass107_17;

	@OriginalMember(owner = "client!gj", name = "fg", descriptor = "Lclient!iq;")
	private Interface8 anInterface8_13;

	@OriginalMember(owner = "client!gj", name = "gg", descriptor = "Lclient!na;")
	public Class24_Sub3 aClass24_Sub3_23;

	@OriginalMember(owner = "client!gj", name = "hg", descriptor = "Lclient!na;")
	public Class24_Sub3 aClass24_Sub3_24;

	@OriginalMember(owner = "client!gj", name = "ig", descriptor = "Lclient!iq;")
	private Interface8 anInterface8_14;

	@OriginalMember(owner = "client!gj", name = "jg", descriptor = "Lclient!na;")
	public Class24_Sub3 aClass24_Sub3_25;

	@OriginalMember(owner = "client!gj", name = "kg", descriptor = "Lclient!fl;")
	private Class107 aClass107_18;

	@OriginalMember(owner = "client!gj", name = "lg", descriptor = "Lclient!na;")
	public Class24_Sub3 aClass24_Sub3_26;

	@OriginalMember(owner = "client!gj", name = "mg", descriptor = "Lclient!fl;")
	public Class107 aClass107_19;

	@OriginalMember(owner = "client!gj", name = "ng", descriptor = "Lclient!na;")
	public Class24_Sub3 aClass24_Sub3_27;

	@OriginalMember(owner = "client!gj", name = "og", descriptor = "Lclient!jn;")
	private Interface9 anInterface9_8;

	@OriginalMember(owner = "client!gj", name = "pg", descriptor = "Lclient!fl;")
	public Class107 aClass107_20;

	@OriginalMember(owner = "client!gj", name = "qg", descriptor = "Lclient!na;")
	public Class24_Sub3 aClass24_Sub3_28;

	@OriginalMember(owner = "client!gj", name = "rg", descriptor = "Lclient!na;")
	public Class24_Sub3 aClass24_Sub3_29;

	@OriginalMember(owner = "client!gj", name = "sg", descriptor = "Lclient!na;")
	public Class24_Sub3 aClass24_Sub3_30;

	@OriginalMember(owner = "client!gj", name = "ug", descriptor = "I")
	private int anInt9590;

	@OriginalMember(owner = "client!gj", name = "vg", descriptor = "Z")
	protected boolean aBoolean649;

	@OriginalMember(owner = "client!gj", name = "Ub", descriptor = "Lclient!su;")
	private final Class298 aClass298_198 = new Class298();

	@OriginalMember(owner = "client!gj", name = "Ud", descriptor = "Z")
	protected boolean aBoolean629 = true;

	@OriginalMember(owner = "client!gj", name = "Ed", descriptor = "Lclient!je;")
	protected final Class93_Sub3 aClass93_Sub3_15 = new Class93_Sub3();

	@OriginalMember(owner = "client!gj", name = "Vd", descriptor = "Lclient!je;")
	public Class93_Sub3 aClass93_Sub3_16 = new Class93_Sub3();

	@OriginalMember(owner = "client!gj", name = "Xd", descriptor = "Lclient!je;")
	public final Class93_Sub3 aClass93_Sub3_17 = new Class93_Sub3();

	@OriginalMember(owner = "client!gj", name = "Yd", descriptor = "Lclient!je;")
	protected final Class93_Sub3 aClass93_Sub3_18 = new Class93_Sub3();

	@OriginalMember(owner = "client!gj", name = "Zd", descriptor = "Lclient!je;")
	private final Class93_Sub3 aClass93_Sub3_19 = new Class93_Sub3();

	@OriginalMember(owner = "client!gj", name = "ae", descriptor = "Lclient!je;")
	private final Class93_Sub3 aClass93_Sub3_20 = new Class93_Sub3();

	@OriginalMember(owner = "client!gj", name = "je", descriptor = "I")
	private int anInt9554 = 0;

	@OriginalMember(owner = "client!gj", name = "ne", descriptor = "Z")
	private boolean aBoolean634 = false;

	@OriginalMember(owner = "client!gj", name = "Ne", descriptor = "I")
	public int anInt9565 = 128;

	@OriginalMember(owner = "client!gj", name = "ve", descriptor = "I")
	public int anInt9557 = 50;

	@OriginalMember(owner = "client!gj", name = "Ie", descriptor = "I")
	public int anInt9562 = -1;

	@OriginalMember(owner = "client!gj", name = "ke", descriptor = "I")
	protected int anInt9555 = 0;

	@OriginalMember(owner = "client!gj", name = "Ce", descriptor = "F")
	public float aFloat190 = 1.0F;

	@OriginalMember(owner = "client!gj", name = "le", descriptor = "I")
	private int anInt9556 = 16777215;

	@OriginalMember(owner = "client!gj", name = "ue", descriptor = "F")
	private float aFloat188 = 1.0F;

	@OriginalMember(owner = "client!gj", name = "Pe", descriptor = "I")
	protected final int anInt9566 = 0;

	@OriginalMember(owner = "client!gj", name = "fe", descriptor = "I")
	public int anInt9552 = 0;

	@OriginalMember(owner = "client!gj", name = "ie", descriptor = "Z")
	protected boolean aBoolean633 = false;

	@OriginalMember(owner = "client!gj", name = "pe", descriptor = "Z")
	protected boolean aBoolean635 = true;

	@OriginalMember(owner = "client!gj", name = "Ue", descriptor = "F")
	public float aFloat193 = 3584.0F;

	@OriginalMember(owner = "client!gj", name = "Le", descriptor = "I")
	public int anInt9564 = -1;

	@OriginalMember(owner = "client!gj", name = "ce", descriptor = "I")
	protected int anInt9550 = 0;

	@OriginalMember(owner = "client!gj", name = "me", descriptor = "[F")
	private final float[] aFloatArray81 = new float[16];

	@OriginalMember(owner = "client!gj", name = "kf", descriptor = "I")
	protected int anInt9571 = 0;

	@OriginalMember(owner = "client!gj", name = "jf", descriptor = "[F")
	private final float[] aFloatArray85 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!gj", name = "tf", descriptor = "I")
	public int anInt9575 = 512;

	@OriginalMember(owner = "client!gj", name = "lf", descriptor = "I")
	protected int anInt9572 = -1;

	@OriginalMember(owner = "client!gj", name = "be", descriptor = "Z")
	protected boolean aBoolean630 = true;

	@OriginalMember(owner = "client!gj", name = "Ze", descriptor = "F")
	public float aFloat196 = 3584.0F;

	@OriginalMember(owner = "client!gj", name = "Ge", descriptor = "Z")
	protected boolean aBoolean637 = false;

	@OriginalMember(owner = "client!gj", name = "Qe", descriptor = "I")
	protected int anInt9567 = 0;

	@OriginalMember(owner = "client!gj", name = "vf", descriptor = "I")
	public int anInt9576 = 0;

	@OriginalMember(owner = "client!gj", name = "he", descriptor = "I")
	public int anInt9553 = 0;

	@OriginalMember(owner = "client!gj", name = "xe", descriptor = "I")
	private int anInt9558 = -1;

	@OriginalMember(owner = "client!gj", name = "Ye", descriptor = "Z")
	protected boolean aBoolean641 = false;

	@OriginalMember(owner = "client!gj", name = "wf", descriptor = "I")
	protected int anInt9577 = 3584;

	@OriginalMember(owner = "client!gj", name = "Af", descriptor = "Z")
	protected boolean aBoolean645 = true;

	@OriginalMember(owner = "client!gj", name = "Hf", descriptor = "F")
	public float aFloat204 = 1.0F;

	@OriginalMember(owner = "client!gj", name = "Cf", descriptor = "F")
	public float aFloat202 = -1.0F;

	@OriginalMember(owner = "client!gj", name = "te", descriptor = "[F")
	private final float[] aFloatArray82 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!gj", name = "rf", descriptor = "I")
	public int anInt9574 = 3;

	@OriginalMember(owner = "client!gj", name = "ff", descriptor = "F")
	public float aFloat198 = -1.0F;

	@OriginalMember(owner = "client!gj", name = "Ef", descriptor = "[F")
	private final float[] aFloatArray87 = new float[16];

	@OriginalMember(owner = "client!gj", name = "ef", descriptor = "[F")
	public final float[] aFloatArray84 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!gj", name = "He", descriptor = "[F")
	protected float[] aFloatArray83 = this.aFloatArray82;

	@OriginalMember(owner = "client!gj", name = "Bf", descriptor = "[F")
	private final float[] aFloatArray86 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!gj", name = "of", descriptor = "Z")
	private boolean aBoolean644 = false;

	@OriginalMember(owner = "client!gj", name = "Mf", descriptor = "I")
	private int anInt9585 = 1;

	@OriginalMember(owner = "client!gj", name = "zf", descriptor = "Lclient!bf;")
	protected Class30 aClass30_7 = Static336.aClass30_5;

	@OriginalMember(owner = "client!gj", name = "gf", descriptor = "Z")
	private boolean aBoolean643 = false;

	@OriginalMember(owner = "client!gj", name = "se", descriptor = "[Lclient!tf;")
	private final Class34[] aClass34Array3 = new Class34[10];

	@OriginalMember(owner = "client!gj", name = "Nf", descriptor = "Z")
	protected boolean aBoolean646 = false;

	@OriginalMember(owner = "client!gj", name = "ye", descriptor = "I")
	private int anInt9559 = 0;

	@OriginalMember(owner = "client!gj", name = "Me", descriptor = "Z")
	private boolean aBoolean639 = false;

	@OriginalMember(owner = "client!gj", name = "cf", descriptor = "I")
	public int anInt9570 = 8;

	@OriginalMember(owner = "client!gj", name = "Qf", descriptor = "Z")
	protected boolean aBoolean648 = true;

	@OriginalMember(owner = "client!gj", name = "Pf", descriptor = "Z")
	protected boolean aBoolean647 = true;

	@OriginalMember(owner = "client!gj", name = "ge", descriptor = "Z")
	private boolean aBoolean632 = false;

	@OriginalMember(owner = "client!gj", name = "Tf", descriptor = "I")
	public int anInt9586 = 512;

	@OriginalMember(owner = "client!gj", name = "Kf", descriptor = "I")
	private int anInt9584 = 0;

	@OriginalMember(owner = "client!gj", name = "uf", descriptor = "F")
	public float aFloat201 = 1.0F;

	@OriginalMember(owner = "client!gj", name = "yf", descriptor = "I")
	protected int anInt9579 = 0;

	@OriginalMember(owner = "client!gj", name = "Sf", descriptor = "Lclient!sr;")
	protected Class296 aClass296_7 = Static450.aClass296_5;

	@OriginalMember(owner = "client!gj", name = "Se", descriptor = "F")
	private float aFloat192 = 3000.0F;

	@OriginalMember(owner = "client!gj", name = "Re", descriptor = "I")
	private int anInt9568 = 0;

	@OriginalMember(owner = "client!gj", name = "Xf", descriptor = "I")
	private int anInt9589 = -1;

	@OriginalMember(owner = "client!gj", name = "Of", descriptor = "[F")
	private final float[] aFloatArray88 = new float[16];

	@OriginalMember(owner = "client!gj", name = "Wf", descriptor = "I")
	protected final int anInt9588 = 0;

	@OriginalMember(owner = "client!gj", name = "Yf", descriptor = "F")
	public float aFloat206 = 1.0F;

	@OriginalMember(owner = "client!gj", name = "Zf", descriptor = "[F")
	public final float[] aFloatArray89 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!gj", name = "Be", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!gj", name = "tg", descriptor = "Lclient!je;")
	private final Class93_Sub3 aClass93_Sub3_21 = new Class93_Sub3();

	@OriginalMember(owner = "client!gj", name = "de", descriptor = "I")
	protected final int anInt9551;

	@OriginalMember(owner = "client!gj", name = "N", descriptor = "Lclient!pj;")
	protected final Class248 aClass248_106;

	@OriginalMember(owner = "client!gj", name = "T", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas14;

	@OriginalMember(owner = "client!gj", name = "ab", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas15;

	@OriginalMember(owner = "client!gj", name = "lc", descriptor = "Ljava/lang/Object;")
	protected final Object anObject19;

	@OriginalMember(owner = "client!gj", name = "hd", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!gj", name = "Fe", descriptor = "I")
	public final int anInt9561;

	@OriginalMember(owner = "client!gj", name = "wb", descriptor = "I")
	private int anInt9429;

	@OriginalMember(owner = "client!gj", name = "mc", descriptor = "I")
	public int anInt9469;

	@OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
	private int anInt9403;

	@OriginalMember(owner = "client!gj", name = "sd", descriptor = "I")
	public int anInt9524;

	@OriginalMember(owner = "client!gj", name = "oe", descriptor = "Lclient!nr;")
	private final Class221 aClass221_3;

	@OriginalMember(owner = "client!gj", name = "qb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!e;Lclient!pj;II)V")
	protected Class90_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) Class248 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anInt9551 = arg4;
		this.aClass248_106 = arg3;
		this.aCanvas15 = this.aCanvas14 = arg0;
		this.anObject20 = this.anObject19 = arg1;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt9561 = arg5;
		this.anInt9469 = this.anInt9429 = local307.height;
		this.anInt9524 = this.anInt9403 = local307.width;
		Static477.method6609(true, false);
		this.aClass221_3 = new Class221(this, super.anInterface2_15);
		this.aNativeInterface3 = new NativeInterface(super.anInterface2_15.method3090(), this.anInt9561);
		for (@Pc(349) int local349 = 0; local349 < super.anInterface2_15.method3090(); local349++) {
			@Pc(357) Class115 local357 = super.anInterface2_15.method3085(local349);
			if (local357 != null) {
				this.aNativeInterface3.initTextureMetrics(local349, local357.aByte40, local357.aByte38);
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)Lclient!je;")
	public final Class93_Sub3 method7527() {
		return this.aClass93_Sub3Array3[this.anInt9579];
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V")
	public final void method7528(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean641) {
			this.aBoolean641 = arg0;
			this.method7635();
			this.anInt9587 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public final void method7520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class17 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(Z)V")
	private void method7529() {
		this.method7646();
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7280();
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
	protected abstract void method7530();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIBLclient!uj;)V")
	public abstract void method7531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class321 arg2);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIF)Lclient!ld;")
	@Override
	public final Class6_Sub25 method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub25_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[FLclient!kf;ZZI)Lclient!hr;")
	public final Interface7 method7532(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method7534(arg4, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!gj", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt9550 < arg0) {
			this.anInt9550 = arg0;
			local5 = true;
		}
		if (this.anInt9555 > arg2) {
			local5 = true;
			this.anInt9555 = arg2;
		}
		if (this.anInt9571 < arg1) {
			this.anInt9571 = arg1;
			local5 = true;
		}
		if (this.anInt9567 > arg3) {
			this.anInt9567 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean649) {
			this.aBoolean649 = true;
			this.method7641();
		}
		this.method7642();
		this.method7577();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZB)V")
	public final void method7533(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean635) {
			this.aBoolean635 = arg0;
			this.method7536();
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7487(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas14) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.method7561(this.aHashtable7.get(arg0), arg0);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!rc;I)V")
	@Override
	public final void method7476(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class60_Sub6[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method7393(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)I")
	@Override
	public final int method7461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZLclient!kf;IIII[F)Lclient!hr;")
	protected abstract Interface7 method7534(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(4) int arg3, @OriginalArg(7) float[] arg4);

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "()F")
	public final float method7535() {
		return this.aFloat192;
	}

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)V")
	protected abstract void method7536();

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "(I)V")
	protected abstract void method7537();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[BILclient!kf;I)Lclient!k;")
	public abstract Interface11 method7538(@OriginalArg(2) byte[] arg0, @OriginalArg(4) Class171 arg1);

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "(I)V")
	protected abstract void method7539();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILclient!iv;)V")
	public final void method7540(@OriginalArg(0) int arg0, @OriginalArg(2) Class150 arg1) {
		this.method7557(false, arg1, false, arg0);
	}

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "(I)V")
	protected abstract void method7541();

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "(Z)V")
	private void method7542() {
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7279();
		}
		this.method7537();
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)I")
	public final int method7543() {
		return this.anInt9579;
	}

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "()Z")
	@Override
	public final boolean method7485() {
		return false;
	}

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "(Z)I")
	public final int method7544() {
		return this.anInt9560;
	}

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
	@Override
	public final void method7510(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt9565 = arg0;
		this.aClass221_3.method5329();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[Lclient!ld;)V")
	@Override
	public final void method7448(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub25[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass6_Sub25Array6[local3] = arg1[local3];
		}
		this.anInt9569 = arg0;
		if (this.aClass296_7.method6776()) {
			this.method7549();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)Lclient!jn;")
	public abstract Interface9 method7545(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7483(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)[F")
	public final float[] method7546() {
		return this.aFloatArray82;
	}

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "(I)V")
	private void method7547() {
		if (this.aBoolean632) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray87;
		if (this.anInt9524 == 0 || this.anInt9469 == 0) {
			local9[3] = 0.0F;
			local9[14] = 0.0F;
			local9[5] = 1.0F;
			local9[1] = 0.0F;
			local9[8] = 0.0F;
			local9[11] = 0.0F;
			local9[15] = 1.0F;
			local9[6] = 0.0F;
			local9[0] = 1.0F;
			local9[13] = 0.0F;
			local9[10] = 1.0F;
			local9[7] = 0.0F;
			local9[2] = 0.0F;
			local9[9] = 0.0F;
			local9[4] = 0.0F;
			local9[12] = 0.0F;
		} else {
			local9[11] = 0.0F;
			local9[5] = -2.0F / (float) this.anInt9469;
			local9[3] = 0.0F;
			local9[14] = 0.5F;
			local9[12] = -1.0F;
			local9[7] = 0.0F;
			local9[8] = 0.0F;
			local9[6] = 0.0F;
			local9[1] = 0.0F;
			local9[9] = 0.0F;
			local9[13] = 1.0F;
			local9[4] = 0.0F;
			local9[15] = 1.0F;
			local9[0] = 2.0F / (float) this.anInt9524;
			local9[2] = 0.0F;
			local9[10] = 0.5F;
		}
		this.aBoolean632 = true;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZIIZ)V")
	public final void method7548(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt9589 != arg1) {
			if (arg1 < 0) {
				this.method7576();
				this.method7624(null);
				this.method7620(0);
				if (!this.aBoolean631) {
					this.method7606(arg2, arg0, 0, 0, 0);
				}
			} else {
				@Pc(27) Interface7 local27 = this.aClass221_3.method5325(arg1);
				@Pc(33) Class115 local33 = super.anInterface2_15.method3085(arg1);
				if (local33.aByte36 == 0 && local33.aByte35 == 0) {
					this.method7576();
				} else {
					@Pc(49) int local49 = local33.aBoolean233 ? 64 : 128;
					@Pc(53) int local53 = local49 * 50;
					@Pc(57) Class93_Sub3 local57 = this.method7585();
					local57.method3776((float) (this.anInt9563 % local53 * local33.aByte36) / (float) local53, (float) (local33.aByte35 * (this.anInt9563 % local53)) / (float) local53, 0.0F);
					this.method7580(Static573.aClass172_11);
				}
				if (!this.aBoolean631) {
					this.method7606(arg2, arg0, local33.aByte39, local33.aByte34, local33.anInt2987);
				}
				if (this.aClass34_3 == null) {
					this.method7624(local27);
					this.method7620(local33.anInt2984);
				} else {
					this.aClass34_3.method7277(local27, local33.anInt2984);
				}
			}
			this.anInt9589 = arg1;
		}
		this.anInt9587 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)V")
	protected void method7549() {
		this.anInt9573 = this.anInt9569;
		this.anInt9569 = 0;
	}

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "(I)V")
	public final void method7550() {
		this.method7645();
		this.method7529();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7472(@OriginalArg(0) Canvas arg0) {
		this.anObject20 = null;
		this.aCanvas15 = null;
		if (arg0 == null || arg0 == this.aCanvas14) {
			this.anObject20 = this.anObject19;
			this.aCanvas15 = this.aCanvas14;
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.anObject20 = this.aHashtable7.get(arg0);
			this.aCanvas15 = arg0;
		}
		if (this.aCanvas15 == null || this.anObject20 == null) {
			throw new RuntimeException();
		}
		this.method7603(this.anObject20, this.aCanvas15);
		this.method7594();
	}

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "(I)V")
	protected abstract void method7551();

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "()I")
	@Override
	public final int v() {
		return this.anInt9533 + this.anInt9532 + this.anInt9544;
	}

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "(I)V")
	protected abstract void method7552();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!fl;)V")
	public abstract void method7553(@OriginalArg(1) Class107 arg0);

	@OriginalMember(owner = "client!gj", name = "ha", descriptor = "(F)V")
	@Override
	public final void ha(@OriginalArg(0) float arg0) {
		if (this.aFloat201 != arg0) {
			this.aFloat201 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method7564();
			this.method7551();
		}
	}

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class17_Sub3 local6 = (Class17_Sub3) arg1;
		@Pc(9) Interface7 local9 = local6.anInterface7_2;
		this.method7558();
		this.method7624(local9);
		this.method7640(1);
		this.method7570(Static140.aClass214_2, Static140.aClass214_2);
		this.method7540(0, Static20.aClass150_1);
		this.method7650(arg0);
		this.aClass93_Sub3_15.method3768((float) this.anInt9524, 0.0F, (float) this.anInt9469);
		this.method7619();
		this.aClass93_Sub3Array3[0].method3768(local9.method7052((float) this.anInt9524), 1.0F, local9.method7053((float) this.anInt9469));
		this.aClass93_Sub3Array3[0].method3762(0.0F, local9.method7053((float) -arg3), local9.method7052((float) -arg2));
		this.aClass172Array3[0] = Static573.aClass172_11;
		this.method7627();
		this.method7559();
		this.method7576();
		this.method7540(0, Static393.aClass150_6);
	}

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "(I)V")
	private void method7554() {
		this.aBoolean632 = false;
		if (Static72.aClass296_1 == this.aClass296_7) {
			this.method7547();
			this.method7529();
		}
	}

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "(Z)V")
	public final void method7555() {
		if (this.anInt9587 == 4) {
			return;
		}
		this.method7617();
		this.method7589(false);
		this.method7528(false);
		this.method7573(false);
		this.method7652(false);
		this.method7548(false, -2, false);
		this.method7640(1);
		this.method7620(0);
		this.anInt9587 = 4;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!kf;BLclient!ps;)Z")
	public abstract boolean method7556(@OriginalArg(0) Class171 arg0, @OriginalArg(2) Class254 arg1);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLclient!iv;ZIZ)V")
	public abstract void method7557(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class150 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "(I)V")
	public final void method7558() {
		if (this.anInt9587 == 2) {
			return;
		}
		this.method7617();
		this.method7589(false);
		this.method7528(false);
		this.method7573(false);
		this.method7652(false);
		this.method7548(false, -2, false);
		this.anInt9587 = 2;
	}

	@OriginalMember(owner = "client!gj", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt9557;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public final Class71 method7471(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class71_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "(B)V")
	public final void method7559() {
		this.method7644(Static190.aClass321_6, 2);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "()Z")
	@Override
	public final boolean method7452() {
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7484(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIILclient!jn;Lclient!uj;I)V")
	public abstract void method7560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface9 arg3, @OriginalArg(5) Class321 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method7561(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BZ)Lclient!iq;")
	public abstract Interface8 method7562(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "()I")
	@Override
	public final int method7458() {
		return this.anInt9582 - 2;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lclient!i;")
	@Override
	public final Class6_Sub2 method7451(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub1 local8 = new Class6_Sub2_Sub1(arg0);
		this.aClass298_198.method6812(local8);
		return local8;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public final Class46 method7477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class46_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "(I)V")
	public abstract void method7563();

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "(I)V")
	protected abstract void method7564();

	@OriginalMember(owner = "client!gj", name = "AA", descriptor = "(IIII)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean631 = true;
		this.anInt9558 = arg2;
		this.anInt9572 = arg1;
		this.anInt9560 = arg0;
		this.anInt9584 = arg3;
		this.method7606(false, false, 0, 3, 0);
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7273();
		}
		this.method7542();
		this.method7637();
	}

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "(B)V")
	protected abstract void method7565();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BB)V")
	public final void method7566(@OriginalArg(0) byte arg0) {
		this.method7650(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "(B)V")
	protected final void method7567() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable7 != null && !this.aHashtable7.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable7.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method7601(local26));
			}
		}
		this.aHashtable7 = local9;
		this.method7596();
		this.method7618();
		this.aClass73_3.method1435(this);
	}

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "(I)Lclient!je;")
	public final Class93_Sub3 method7568() {
		return this.aClass93_Sub3_19;
	}

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "(I)V")
	private void method7569() {
		this.aFloat196 = (float) this.anInt9577 - this.aFloat189;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!nd;Lclient!nd;I)V")
	public final void method7570(@OriginalArg(0) Class214 arg0, @OriginalArg(1) Class214 arg1) {
		@Pc(8) boolean local8 = false;
		if (arg0 != this.aClass214Array3[this.anInt9579]) {
			this.aClass214Array3[this.anInt9579] = arg0;
			this.method7616();
			local8 = true;
		}
		if (this.bf[this.anInt9579] != arg1) {
			this.bf[this.anInt9579] = arg1;
			this.method7587();
			local8 = true;
		}
		if (local8) {
			this.anInt9587 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "(I)V")
	protected abstract void method7571();

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public final void method7449(@OriginalArg(0) Class6_Sub2 arg0) {
		this.aNativeHeap6 = ((Class6_Sub2_Sub1) arg0).aNativeHeap1;
		this.aNativeHeapBuffer8 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!gj", name = "JA", descriptor = "(I)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0) {
		this.anInt9574 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt9574++;
		}
		this.anInt9570 = 0x1 << this.anInt9574;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([Lclient!ba;Lclient!hfa;Lclient!q;[Lclient!rc;I)V")
	@Override
	public final void method7524(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class60_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method7476(arg0, arg2, arg3, arg4);
		this.method7511(arg1);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(ZI)V")
	public final void method7572(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean646 != arg0) {
			this.aBoolean646 = arg0;
			this.method7635();
		}
	}

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "(IIIII)V")
	@Override
	protected final void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IZ)V")
	public final void method7573(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean633 != arg0) {
			this.aBoolean633 = arg0;
			this.method7653();
			this.anInt9587 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "(I)Lclient!je;")
	public final Class93_Sub3 method7574() {
		if (!this.aBoolean644) {
			this.aClass93_Sub3_20.method3761(this.aClass93_Sub3_18, this.aClass93_Sub3_15);
			this.aBoolean644 = true;
		}
		return this.aClass93_Sub3_20;
	}

	@OriginalMember(owner = "client!gj", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt9556;
		if (local15 || this.aFloat198 != arg1 || arg2 != this.aFloat202) {
			this.aFloat198 = arg1;
			this.aFloat202 = arg2;
			this.anInt9556 = arg0;
			if (local15) {
				this.aFloat190 = (float) (this.anInt9556 & 0xFF0000) / 1.671168E7F;
				this.aFloat204 = (float) (this.anInt9556 & 0xFF00) / 65280.0F;
				this.aFloat206 = (float) (this.anInt9556 & 0xFF) / 255.0F;
				this.method7564();
			}
			this.aNativeInterface3.setSunColour(this.aFloat190, this.aFloat204, this.aFloat206, arg1, arg2);
			this.method7541();
		}
		if (this.aFloatArray86[0] != arg3 || arg4 != this.aFloatArray86[1] || arg5 != this.aFloatArray86[2]) {
			this.aFloatArray86[2] = arg5;
			this.aFloatArray86[1] = arg4;
			this.aFloatArray86[0] = arg3;
			this.aFloatArray85[1] = -arg4;
			this.aFloatArray85[0] = -arg3;
			this.aFloatArray85[2] = -arg5;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
			this.aFloatArray89[0] = arg3 * local153;
			this.aFloatArray89[2] = local153 * arg5;
			this.aFloatArray89[1] = arg4 * local153;
			this.aFloatArray84[1] = -this.aFloatArray89[1];
			this.aFloatArray84[2] = -this.aFloatArray89[2];
			this.aFloatArray84[0] = -this.aFloatArray89[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray89[0], this.aFloatArray89[1], this.aFloatArray89[2]);
			this.method7563();
			this.anInt9583 = (int) (arg3 * 256.0F / arg4);
			this.anInt9578 = (int) (arg5 * 256.0F / arg4);
		}
		this.method7551();
	}

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "(Z)V")
	private void method7575() {
		if (this.aFloat189 == 0.0F) {
			this.aFloatArray88[10] = this.aFloat194;
			this.aFloatArray88[14] = this.aFloat205;
		} else {
			@Pc(33) float local33 = this.aFloat192 / (this.aFloat189 + this.aFloat192);
			@Pc(37) float local37 = local33 * local33;
			@Pc(54) float local54 = (1.0F - local33) * -this.aFloat205 * (1.0F - local33) / this.aFloat189;
			this.aFloatArray88[14] = this.aFloat205 * local37;
			this.aFloatArray88[10] = local54 + this.aFloat194;
		}
		this.aFloat193 = (this.aFloatArray88[14] - (float) this.anInt9577) / this.aFloatArray88[10];
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
	@Override
	public final void method7478(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "(B)V")
	public final void method7576() {
		if (Static16.aClass172_1 != this.aClass172Array3[this.anInt9579]) {
			this.aClass172Array3[this.anInt9579] = Static16.aClass172_1;
			this.aClass93_Sub3Array3[this.anInt9579].Y();
			this.method7627();
		}
	}

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "(I)V")
	private void method7577() {
		this.aFloat197 = this.anInt9555 - this.anInt9552;
		this.aFloat195 = this.anInt9567 - this.anInt9576;
		this.aFloat191 = this.anInt9571 - this.anInt9576;
		this.aFloat203 = this.anInt9550 - this.anInt9552;
	}

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "(I)F")
	protected abstract float method7578();

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "(B)V")
	protected final void method7579() {
		@Pc(9) Enumeration local9 = this.aHashtable7.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method7561(this.aHashtable7.get(local15), local15);
		}
		this.anInterface8_14.method6461();
		this.anInterface8_13.method6461();
		this.aClass24_Sub3_21.method5105();
		this.aClass24_Sub3_29.method5105();
		this.aClass24_Sub3_25.method5105();
		this.aClass24_Sub3_26.method5105();
		this.aClass24_Sub3_24.method5105();
		this.aClass73_3.method1436();
		this.anInterface9_8.method6461();
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		@Pc(29) float local29 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local16 * local16)));
		@Pc(33) float local33 = local16 * local29;
		@Pc(37) float local37 = local10 * local29;
		if (!this.method7634((float) arg2 + local37, 0.0F, (float) arg0, 0.0F, local33 + (float) arg3, (float) arg1)) {
			return;
		}
		this.method7612();
		this.method7650(arg4);
		this.method7540(0, Static20.aClass150_1);
		this.method7630(Static20.aClass150_1, 0);
		this.method7640(arg5);
		this.method7654();
		this.method7599(false);
		this.method7638();
		this.method7599(true);
		this.method7630(Static393.aClass150_6, 0);
		this.method7540(0, Static393.aClass150_6);
	}

	@OriginalMember(owner = "client!gj", name = "LA", descriptor = "(IIII)V")
	@Override
	public final void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean631) {
			throw new RuntimeException("");
		}
		if (arg0 != this.anInt9560) {
			this.anInt9560 = arg0;
			if (this.aClass34_3 != null) {
				this.aClass34_3.method7273();
			}
		}
		this.anInt9584 = arg3;
		this.anInt9572 = arg1;
		this.anInt9558 = arg2;
		this.method7542();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!kh;)V")
	public final void method7580(@OriginalArg(1) Class172 arg0) {
		this.aClass172Array3[this.anInt9579] = arg0;
		this.method7627();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)Lclient!jn;")
	public final Interface9 method7581(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface9_8.method6458()) {
			this.anInterface9_8.method5935(arg0);
		}
		return this.anInterface9_8;
	}

	@OriginalMember(owner = "client!gj", name = "IA", descriptor = "()I")
	@Override
	public final int IA() {
		return this.anInt9577;
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
	@Override
	public final void method7491(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!gj", name = "z", descriptor = "(I)V")
	protected void method7582() {
		this.method7631();
	}

	@OriginalMember(owner = "client!gj", name = "aa", descriptor = "()I")
	@Override
	public final int aa() {
		return this.anInt9590;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
	@Override
	public final void method7468(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "(I)V")
	protected abstract void method7583();

	@OriginalMember(owner = "client!gj", name = "B", descriptor = "(I)Lclient!je;")
	public final Class93_Sub3 method7585() {
		return this.aClass93_Sub3Array3[this.anInt9579];
	}

	@OriginalMember(owner = "client!gj", name = "ka", descriptor = "(FF)V")
	@Override
	public final void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat192 && arg1 == this.aFloat189) {
			return;
		}
		this.aFloat192 = arg0;
		this.aFloat189 = arg1;
		this.method7569();
		this.method7575();
		this.method7591();
		this.method7611();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!je;B)V")
	public final void method7586(@OriginalArg(0) Class93_Sub3 arg0) {
		this.aClass93_Sub3_15.la(arg0);
		this.aBoolean629 = false;
		this.method7629();
	}

	@OriginalMember(owner = "client!gj", name = "C", descriptor = "(I)V")
	protected abstract void method7587();

	@OriginalMember(owner = "client!gj", name = "E", descriptor = "(I)Lclient!je;")
	public final Class93_Sub3 method7588() {
		return this.aClass93_Sub3_18;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!kq;Z)Lclient!xa;")
	@Override
	public final Class71 method7522(@OriginalArg(0) Class177 arg0) {
		@Pc(20) Class71 local20;
		if (arg0.anInt4887 == 0 || arg0.anInt4884 == 0) {
			local20 = this.method7471(new int[1], 1, 1, 1);
		} else {
			@Pc(29) int[] local29 = new int[arg0.anInt4887 * arg0.anInt4884];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(38) int local38;
			@Pc(42) int local42;
			if (arg0.aByteArray67 == null) {
				for (local38 = 0; local38 < arg0.anInt4884; local38++) {
					for (local42 = 0; local42 < arg0.anInt4887; local42++) {
						@Pc(55) int local55 = arg0.anIntArray399[arg0.aByteArray66[local31++] & 0xFF];
						local29[local33++] = local55 == 0 ? 0 : local55 | 0xFF000000;
					}
				}
			} else {
				for (local38 = 0; local38 < arg0.anInt4884; local38++) {
					for (local42 = 0; local42 < arg0.anInt4887; local42++) {
						local29[local33++] = arg0.aByteArray67[local31] << 24 | arg0.anIntArray399[arg0.aByteArray66[local31] & 0xFF];
						local31++;
					}
				}
			}
			local20 = this.method7471(local29, arg0.anInt4887, arg0.anInt4887, arg0.anInt4884);
		}
		local20.EA(arg0.anInt4886, arg0.anInt4885, arg0.anInt4889, arg0.anInt4888);
		return local20;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(ZI)V")
	public final void method7589(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean642 != arg0) {
			this.aBoolean642 = arg0;
			this.method7637();
			this.anInt9587 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gj", name = "na", descriptor = "(III[I)V")
	@Override
	public final void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass93_Sub3_16.method3774((float) arg0, (float) arg1, (float) arg2);
		if ((float) this.anInt9557 > local14 || local14 > (float) this.anInt9577) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(57) int local57 = (int) ((float) this.anInt9575 * this.aClass93_Sub3_16.method3777((float) arg1, (float) arg2, (float) arg0) / local14);
		@Pc(75) int local75 = (int) ((float) this.anInt9586 * this.aClass93_Sub3_16.method3755((float) arg1, (float) arg0, (float) arg2) / local14);
		if (this.aFloat203 <= (float) local57 && this.aFloat197 >= (float) local57 && (float) local75 >= this.aFloat191 && this.aFloat195 >= (float) local75) {
			arg3[0] = (int) ((float) local57 - this.aFloat203);
			arg3[1] = (int) ((float) local75 - this.aFloat191);
			arg3[2] = (int) local14;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!gj", name = "E", descriptor = "()F")
	public final float method7590() {
		return this.aFloat189;
	}

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "(I)V")
	private void method7591() {
		this.aBoolean643 = false;
		if (Static220.aClass296_3 == this.aClass296_7) {
			this.method7633();
			this.method7529();
		}
	}

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7480() {
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZZILclient!iv;)V")
	protected abstract void method7592(@OriginalArg(2) int arg0, @OriginalArg(3) Class150 arg1);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public final Class17 method7517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static167.method2644(arg2, arg1, arg3, arg0, this);
	}

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "()V")
	@Override
	public final void F() {
		this.anInt9550 = 0;
		this.anInt9555 = this.anInt9524;
		this.anInt9571 = 0;
		this.anInt9567 = this.anInt9469;
		if (this.aBoolean649) {
			this.aBoolean649 = false;
			this.method7641();
		}
		this.method7577();
	}

	@OriginalMember(owner = "client!gj", name = "G", descriptor = "(I)V")
	private void method7593() {
		if (this.aBoolean634) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray88;
		@Pc(25) float local25 = (float) (this.anInt9557 * -this.anInt9552) / (float) this.anInt9575;
		@Pc(40) float local40 = (float) (this.anInt9557 * (this.anInt9524 - this.anInt9552)) / (float) this.anInt9575;
		@Pc(51) float local51 = (float) (this.anInt9576 * this.anInt9557) / (float) this.anInt9586;
		@Pc(66) float local66 = (float) ((this.anInt9576 - this.anInt9469) * this.anInt9557) / (float) this.anInt9586;
		if (local40 == local25 || local66 == local51) {
			local13[8] = 0.0F;
			local13[13] = 0.0F;
			local13[15] = 1.0F;
			local13[11] = 0.0F;
			local13[1] = 0.0F;
			local13[5] = 1.0F;
			local13[10] = 1.0F;
			local13[3] = 0.0F;
			local13[12] = 0.0F;
			local13[6] = 0.0F;
			local13[14] = 0.0F;
			local13[2] = 0.0F;
			local13[9] = 0.0F;
			local13[7] = 0.0F;
			local13[4] = 0.0F;
			local13[0] = 1.0F;
		} else {
			@Pc(146) float local146 = (float) this.anInt9557 * 2.0F;
			local13[8] = (local40 + local25) / (local40 - local25);
			local13[4] = 0.0F;
			local13[10] = this.aFloat194 = (float) this.anInt9577 / (float) (this.anInt9557 - this.anInt9577);
			local13[1] = 0.0F;
			local13[14] = this.aFloat205 = (float) (this.anInt9557 * this.anInt9577) / (float) (this.anInt9557 - this.anInt9577);
			local13[7] = 0.0F;
			local13[15] = 0.0F;
			local13[6] = 0.0F;
			local13[13] = 0.0F;
			local13[5] = local146 / (local51 - local66);
			local13[11] = -1.0F;
			local13[9] = (local66 + local51) / (-local66 + local51);
			local13[12] = 0.0F;
			local13[3] = 0.0F;
			local13[0] = local146 / (local40 - local25);
			local13[2] = 0.0F;
		}
		this.method7575();
		this.aBoolean634 = true;
	}

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "(Z)V")
	private void method7594() {
		if (this.aCanvas15 == null) {
			this.anInt9403 = this.anInt9429 = 1;
		} else {
			@Pc(22) Dimension local22 = this.aCanvas15.getSize();
			this.anInt9429 = local22.height;
			this.anInt9403 = local22.width;
		}
		this.anInt9469 = this.anInt9429;
		this.anInt9524 = this.anInt9403;
		this.method7554();
		this.method7611();
		this.method7591();
		this.method7659();
		this.method7577();
		this.method7645();
		this.F();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;B)Lclient!jaclib/memory/Stream;")
	public final Stream method7595(@OriginalArg(0) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!gj", name = "H", descriptor = "(I)V")
	private void method7596() {
		this.anInterface8_14 = this.method7562(false);
		this.anInterface8_14.method6463(140, 28);
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			@Pc(32) Buffer local32 = this.anInterface8_14.method6462();
			if (local32 != null) {
				@Pc(39) Stream local39 = this.method7595(local32);
				if (Stream.a()) {
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(1.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(1.0F);
					local39.a(0.0F);
					local39.a(1.0F);
					local39.a(1.0F);
					local39.a(1.0F);
					local39.a(0.0F);
					local39.a(1.0F);
					local39.a(1.0F);
					local39.a(1.0F);
					local39.a(1.0F);
					local39.a(1.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(1.0F);
					local39.a(0.0F);
					local39.a(1.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
				} else {
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(1.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(1.0F);
					local39.b(0.0F);
					local39.b(1.0F);
					local39.b(1.0F);
					local39.b(1.0F);
					local39.b(0.0F);
					local39.b(1.0F);
					local39.b(1.0F);
					local39.b(1.0F);
					local39.b(1.0F);
					local39.b(1.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(1.0F);
					local39.b(0.0F);
					local39.b(1.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
				}
				local39.b();
				if (this.anInterface8_14.method6460()) {
					break;
				}
			}
		}
		this.aClass107_17 = this.method7605(new Class185[] { new Class185(new Class217[] { Static347.aClass217_1, Static347.aClass217_5, Static347.aClass217_5 }) });
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III[IZ)Lclient!hr;")
	public final Interface7 method7597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		return this.method7623(arg2, arg3, 0, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "(Z)V")
	public final void method7598() {
		if (this.anInt9587 == 8) {
			return;
		}
		this.method7660();
		this.method7589(true);
		this.method7573(true);
		this.method7652(true);
		this.method7640(1);
		this.anInt9587 = 8;
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(ZI)V")
	public abstract void method7599(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "()Lclient!q;")
	@Override
	public final Class93 method7455() {
		return this.aClass93_Sub3_21;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZI[BLclient!kf;ZII)Lclient!hr;")
	protected abstract Interface7 method7600(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class171 arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method7601(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!gj", name = "I", descriptor = "(I)Lclient!je;")
	public final Class93_Sub3 method7602() {
		return this.aClass93_Sub3_15;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	protected abstract void method7603(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!gj", name = "J", descriptor = "(I)V")
	public final void method7604() {
		if (this.anInt9587 == 16) {
			return;
		}
		this.method7648();
		this.method7589(true);
		this.method7573(true);
		this.method7652(true);
		this.method7640(1);
		this.anInt9587 = 16;
	}

	@OriginalMember(owner = "client!gj", name = "sa", descriptor = "(II)V")
	@Override
	public final void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt9557 && this.anInt9577 == arg1) {
			return;
		}
		this.anInt9557 = arg0;
		this.anInt9577 = arg1;
		this.method7611();
		this.method7591();
		this.method7542();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([Lclient!lf;B)Lclient!fl;")
	public abstract Class107 method7605(@OriginalArg(0) Class185[] arg0);

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "([I)V")
	@Override
	public final void A(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt9567;
		arg0[1] = this.anInt9571;
		arg0[0] = this.anInt9550;
		arg0[2] = this.anInt9555;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZIZIII)V")
	private void method7606(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) boolean local4 = arg0 & this.method7502();
		if (!local4 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
			arg3 = 2;
			arg4 = 1;
			arg2 = 0;
		}
		if (arg3 != 0 && arg1) {
			arg3 |= Integer.MIN_VALUE;
		}
		if (arg3 != this.anInt9554) {
			if (this.anInt9554 != 0) {
				this.aClass34Array3[Integer.MAX_VALUE & this.anInt9554].method7282();
			}
			if (arg3 == 0) {
				this.aClass34_3 = null;
			} else {
				this.aClass34_3 = this.aClass34Array3[Integer.MAX_VALUE & arg3];
				this.aClass34_3.method7269(arg1);
				this.aClass34_3.method7271(arg1);
				this.aClass34_3.method7275(arg4, arg2);
			}
			this.anInt9568 = arg2;
			this.anInt9559 = arg4;
			this.anInt9554 = arg3;
		} else if (this.anInt9554 != 0) {
			this.aClass34Array3[this.anInt9554 & Integer.MAX_VALUE].method7271(arg1);
			if (this.anInt9568 != arg2 || arg4 != this.anInt9559) {
				this.aClass34Array3[Integer.MAX_VALUE & this.anInt9554].method7275(arg4, arg2);
				this.anInt9568 = arg2;
				this.anInt9559 = arg4;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gj", name = "K", descriptor = "(I)V")
	protected abstract void method7607();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IF)V")
	public final void method7608(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat188) {
			this.aFloat188 = arg0;
			this.method7591();
		}
	}

	@OriginalMember(owner = "client!gj", name = "ya", descriptor = "(IIIII)V")
	@Override
	public final void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7484(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)V")
	public final void method7609(@OriginalArg(0) int arg0) {
		if (this.anInt9579 != arg0) {
			this.anInt9579 = arg0;
			this.method7565();
		}
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(ZI)V")
	public final void method7610(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean648) {
			this.aBoolean648 = arg0;
			this.method7637();
		}
	}

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "(I)V")
	private void method7611() {
		this.aBoolean634 = false;
		this.method7593();
		if (Static453.aClass296_6 == this.aClass296_7) {
			this.method7529();
		}
	}

	@OriginalMember(owner = "client!gj", name = "M", descriptor = "(I)V")
	private void method7612() {
		if (this.anInt9587 == 1) {
			return;
		}
		this.method7617();
		this.method7589(false);
		this.method7528(false);
		this.method7573(false);
		this.method7652(false);
		this.method7548(false, -2, false);
		this.method7620(1);
		this.method7624(this.anInterface3_3);
		this.anInt9587 = 1;
	}

	@OriginalMember(owner = "client!gj", name = "ca", descriptor = "(IIII)V")
	@Override
	public final void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt9524 - 1 <= arg2 && arg1 <= 0 && arg3 >= this.anInt9469 - 1) {
			this.F();
			return;
		}
		this.anInt9555 = this.anInt9524 >= arg2 ? arg2 : 0;
		this.anInt9550 = arg0 < 0 ? 0 : arg0;
		this.anInt9567 = arg3 > this.anInt9524 ? 0 : arg3;
		this.anInt9571 = arg1 >= 0 ? arg1 : 0;
		if (!this.aBoolean649) {
			this.aBoolean649 = true;
			this.method7641();
		}
		this.method7642();
		this.method7577();
	}

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "()V")
	@Override
	public final void method7488() {
		this.aClass221_3.method5329();
	}

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "()V")
	@Override
	public final void k() {
		this.aBoolean631 = false;
		this.method7606(false, false, 0, 0, 0);
		this.method7542();
		this.method7637();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ka;)V")
	@Override
	public final void method7454(@OriginalArg(0) Class3 arg0) {
		this.aClass3_Sub2_3 = (Class3_Sub2) arg0;
	}

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "(Z)V")
	protected abstract void method7613();

	@OriginalMember(owner = "client!gj", name = "N", descriptor = "(I)V")
	protected abstract void method7616();

	@OriginalMember(owner = "client!gj", name = "O", descriptor = "(I)V")
	private void method7617() {
		if (Static72.aClass296_1 == this.aClass296_7) {
			return;
		}
		@Pc(14) Class296 local14 = this.aClass296_7;
		this.aClass296_7 = Static72.aClass296_1;
		if (local14.method6776()) {
			this.method7643();
		}
		this.method7547();
		this.aFloatArray83 = this.aFloatArray87;
		this.method7529();
		this.anInt9587 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "(Z)V")
	private void method7618() {
		this.anInterface8_13 = this.method7562(true);
		this.anInterface8_13.method6463(24, 12);
		this.aClass107_18 = this.method7605(new Class185[] { new Class185(Static347.aClass217_1) });
	}

	@OriginalMember(owner = "client!gj", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public final void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "(Z)V")
	public final void method7619() {
		this.aBoolean629 = false;
		this.method7629();
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(II)V")
	public final void method7620(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method7570(Static140.aClass214_2, Static140.aClass214_2);
		} else if (arg0 == 0) {
			this.method7570(Static547.aClass214_5, Static547.aClass214_5);
		} else if (arg0 == 2) {
			this.method7570(Static458.aClass214_3, Static140.aClass214_2);
		} else if (arg0 == 3) {
			this.method7570(Static74.aClass214_1, Static547.aClass214_5);
		} else if (arg0 == 4) {
			this.method7570(Static472.aClass214_4, Static472.aClass214_4);
			return;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([FB)[F")
	public final float[] method7621(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloatArray83[1];
		arg0[0] = this.aFloatArray83[0];
		arg0[8] = this.aFloatArray83[2];
		arg0[12] = this.aFloatArray83[3];
		arg0[1] = this.aFloatArray83[4];
		arg0[13] = this.aFloatArray83[7];
		arg0[9] = this.aFloatArray83[6];
		arg0[5] = this.aFloatArray83[5];
		arg0[2] = this.aFloatArray83[8];
		arg0[14] = this.aFloatArray83[11];
		arg0[6] = this.aFloatArray83[9];
		arg0[3] = this.aFloatArray83[12];
		arg0[10] = this.aFloatArray83[10];
		arg0[7] = this.aFloatArray83[13];
		arg0[11] = this.aFloatArray83[14];
		arg0[15] = this.aFloatArray83[15];
		return arg0;
	}

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "()Z")
	@Override
	public final boolean method7504() {
		return false;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([BIIZLclient!kf;I)Lclient!hr;")
	public final Interface7 method7622(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class171 arg3, @OriginalArg(5) int arg4) {
		return this.method7600(arg4, arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([IIZIIII)Lclient!hr;")
	public abstract Interface7 method7623(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)I")
	@Override
	public final int method7505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLclient!ek;)V")
	public final void method7624(@OriginalArg(1) Interface3 arg0) {
		if (this.anInterface3Array3[this.anInt9579] == arg0) {
			return;
		}
		this.anInterface3Array3[this.anInt9579] = arg0;
		if (arg0 == null) {
			this.method7583();
		} else {
			arg0.method7033();
		}
		this.anInt9587 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "(B)V")
	protected abstract void method7625();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!kf;IILclient!ps;I)Lclient!hr;")
	public abstract Interface7 method7626(@OriginalArg(0) Class171 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class254 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "(IIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9576 = arg1;
		this.anInt9552 = arg0;
		this.anInt9575 = arg2;
		this.anInt9586 = arg3;
		this.method7591();
		this.method7611();
		this.method7645();
		this.method7577();
	}

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "(Z)V")
	private void method7627() {
		this.method7647();
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7272();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!ps;Lclient!kf;)Z")
	public abstract boolean method7628(@OriginalArg(1) Class254 arg0, @OriginalArg(2) Class171 arg1);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!hfa;)V")
	@Override
	public final void method7511(@OriginalArg(0) Class127 arg0) {
		this.aClass73_3.method1434(this, arg0);
	}

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "(B)V")
	private void method7629() {
		if (Static72.aClass296_1 == this.aClass296_7) {
			@Pc(7) float local7 = this.method7578();
			this.aClass93_Sub3_15.method3762(0.0F, local7, local7);
		}
		this.aBoolean644 = false;
		this.method7625();
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7270();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!iv;II)V")
	public final void method7630(@OriginalArg(0) Class150 arg0, @OriginalArg(2) int arg1) {
		this.method7592(arg1, arg0);
	}

	@OriginalMember(owner = "client!gj", name = "C", descriptor = "(IIIIII)V")
	@Override
	public final void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7612();
		this.method7650(arg4);
		this.method7540(0, Static20.aClass150_1);
		this.method7630(Static20.aClass150_1, 0);
		this.method7640(arg5);
		this.aClass93_Sub3_15.method3768((float) arg2, 1.0F, (float) arg3);
		this.aClass93_Sub3_15.G(arg0, arg1, 0);
		this.method7619();
		this.method7599(false);
		this.method7559();
		this.method7599(true);
		this.method7630(Static393.aClass150_6, 0);
		this.method7540(0, Static393.aClass150_6);
	}

	@OriginalMember(owner = "client!gj", name = "P", descriptor = "(I)V")
	private void method7631() {
		this.method7564();
		this.method7541();
		this.method7635();
		this.method7549();
		this.method7563();
		this.method7551();
		this.method7536();
		this.method7653();
		this.method7607();
		this.method7637();
		this.method7537();
		this.method7539();
		this.method7613();
		this.method7530();
		for (@Pc(52) int local52 = this.anInt9580 - 1; local52 >= 0; local52--) {
			this.method7609(local52);
			this.method7616();
			this.method7587();
			this.method7576();
		}
		this.method7552();
		this.method7659();
		this.method7646();
		this.method7625();
		this.method7571();
	}

	@OriginalMember(owner = "client!gj", name = "Q", descriptor = "(I)V")
	public final void method7632() {
		this.anInterface3Array3 = new Interface3[this.anInt9580];
		this.aClass172Array3 = new Class172[this.anInt9580];
		this.bf = new Class214[this.anInt9580];
		this.aClass214Array3 = new Class214[this.anInt9580];
		this.aClass93_Sub3Array3 = new Class93_Sub3[this.anInt9580];
		for (@Pc(32) int local32 = 0; local32 < this.anInt9580; local32++) {
			this.bf[local32] = Static547.aClass214_5;
			this.aClass214Array3[local32] = Static547.aClass214_5;
			this.aClass172Array3[local32] = Static16.aClass172_1;
			this.aClass93_Sub3Array3[local32] = new Class93_Sub3();
		}
		this.aClass6_Sub25Array6 = new Class6_Sub25[this.anInt9582 - 2];
		this.anInterface3_3 = this.method7626(Static493.aClass171_15, 1, Static407.aClass254_14, 1);
		this.method7449(new Class6_Sub2_Sub1(262144));
		this.aClass107_19 = this.method7605(new Class185[] { new Class185(new Class217[] { Static347.aClass217_1, Static347.aClass217_5 }) });
		this.aClass107_16 = this.method7605(new Class185[] { new Class185(new Class217[] { Static347.aClass217_1, Static347.aClass217_3 }) });
		this.aClass107_20 = this.method7605(new Class185[] { new Class185(Static347.aClass217_1), new Class185(Static347.aClass217_3), new Class185(Static347.aClass217_5), new Class185(Static347.aClass217_2) });
		this.aClass107_15 = this.method7605(new Class185[] { new Class185(Static347.aClass217_1), new Class185(Static347.aClass217_3), new Class185(Static347.aClass217_5) });
		this.aClass24_Sub3_28 = new Class24_Sub3(this, 0, 0, false, false);
		this.aClass24_Sub3_21 = new Class24_Sub3(this, 0, 0, true, true);
		this.aClass24_Sub3_22 = new Class24_Sub3(this, 0, 0, false, false);
		this.aClass24_Sub3_29 = new Class24_Sub3(this, 0, 0, true, true);
		this.aClass24_Sub3_30 = new Class24_Sub3(this, 0, 0, false, false);
		this.aClass24_Sub3_25 = new Class24_Sub3(this, 0, 0, true, true);
		this.aClass24_Sub3_27 = new Class24_Sub3(this, 0, 0, false, false);
		this.aClass24_Sub3_26 = new Class24_Sub3(this, 0, 0, true, true);
		this.aClass24_Sub3_23 = new Class24_Sub3(this, 0, 0, false, false);
		this.aClass24_Sub3_24 = new Class24_Sub3(this, 0, 0, true, true);
		this.aClass73_3 = new Class73(this);
		this.anInterface9_8 = this.method7545(true);
		this.method7567();
		this.aClass66_6 = new Class66(this);
		this.aClass34Array3[1] = this.method7656(1);
		this.aClass34Array3[2] = this.method7656(2);
		this.aClass34Array3[4] = this.method7656(4);
		this.aClass34Array3[5] = this.method7656(5);
		this.aClass34Array3[6] = this.method7656(6);
		this.aClass34Array3[7] = this.method7656(7);
		this.aClass34Array3[3] = this.method7656(3);
		this.aClass34Array3[8] = this.method7656(8);
		this.aClass34Array3[9] = this.method7656(9);
		if (!this.aClass34Array3[2].method7276()) {
			this.aClass34Array3[2] = this.method7656(0);
		}
		if (!this.aClass34Array3[4].method7276()) {
			this.aClass34Array3[4] = this.aClass34Array3[2];
		}
		if (!this.aClass34Array3[8].method7276()) {
			this.aClass34Array3[8] = this.aClass34Array3[4];
		}
		if (!this.aClass34Array3[9].method7276()) {
			this.aClass34Array3[9] = this.aClass34Array3[8];
		}
		this.method7582();
		this.F();
	}

	@OriginalMember(owner = "client!gj", name = "R", descriptor = "(I)V")
	private void method7633() {
		if (this.aBoolean643) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray81;
		@Pc(16) float local16 = (float) this.anInt9557 - this.aFloat189;
		@Pc(24) float local24 = (float) this.anInt9577 - this.aFloat189;
		@Pc(36) float local36 = this.aFloat188 * (float) -this.anInt9576 / (float) this.anInt9586;
		@Pc(48) float local48 = (float) -this.anInt9552 * this.aFloat188 / (float) this.anInt9575;
		@Pc(63) float local63 = this.aFloat188 * (float) (this.anInt9524 - this.anInt9552) / (float) this.anInt9575;
		@Pc(78) float local78 = (float) (this.anInt9469 - this.anInt9576) * this.aFloat188 / (float) this.anInt9586;
		if (local63 == local48 || local78 == local36) {
			local9[7] = 0.0F;
			local9[8] = 0.0F;
			local9[3] = 0.0F;
			local9[11] = 0.0F;
			local9[0] = 1.0F;
			local9[9] = 0.0F;
			local9[4] = 0.0F;
			local9[13] = 0.0F;
			local9[12] = 0.0F;
			local9[15] = 1.0F;
			local9[1] = 0.0F;
			local9[5] = 1.0F;
			local9[6] = 0.0F;
			local9[2] = 0.0F;
			local9[14] = 0.0F;
			local9[10] = 1.0F;
		} else {
			local9[0] = 2.0F / (local63 - local48);
			local9[15] = 1.0F;
			local9[8] = 0.0F;
			local9[14] = local16 / (local16 - local24);
			local9[10] = 1.0F / (local16 - local24);
			local9[1] = 0.0F;
			local9[6] = 0.0F;
			local9[13] = (local36 + local78) / (local78 - local36);
			local9[3] = 0.0F;
			local9[4] = 0.0F;
			local9[12] = (local48 + local63) / (-local63 + local48);
			local9[5] = 2.0F / (local78 - local36);
			local9[11] = 0.0F;
			local9[2] = 0.0F;
			local9[9] = 0.0F;
			local9[7] = 0.0F;
		}
		this.method7569();
		this.aBoolean643 = true;
	}

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7493() {
		return this.aBoolean636;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public final Class71 method7453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class71_Sub1 local11 = new Class71_Sub1(this, arg2, arg3, arg4);
		local11.GA(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFFBFFF)Z")
	private boolean method7634(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(17) Buffer local17 = this.anInterface8_13.method6462();
		if (local17 == null) {
			return false;
		}
		@Pc(26) Stream local26 = this.method7595(local17);
		if (Stream.a()) {
			local26.a(arg2);
			local26.a(arg5);
			local26.a(arg3);
			local26.a(arg0);
			local26.a(arg4);
			local26.a(arg1);
		} else {
			local26.b(arg2);
			local26.b(arg5);
			local26.b(arg3);
			local26.b(arg0);
			local26.b(arg4);
			local26.b(arg1);
		}
		local26.b();
		return this.anInterface8_13.method6460();
	}

	@OriginalMember(owner = "client!gj", name = "S", descriptor = "(I)V")
	protected abstract void method7635();

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7526(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas14) {
			local5 = this.anObject20;
		} else if (this.aHashtable7.containsKey(arg0)) {
			local5 = this.aHashtable7.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method7636(arg0, local5);
		if (arg0 == this.aCanvas15) {
			this.method7594();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	protected abstract void method7636(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!gj", name = "D", descriptor = "()V")
	@Override
	protected void method7525() {
		if (this.aBoolean639) {
			return;
		}
		for (@Pc(13) Class6 local13 = this.aClass298_198.method6809(); local13 != null; local13 = this.aClass298_198.method6821()) {
			((Class6_Sub2_Sub1) local13).method103();
		}
		@Pc(30) Enumeration local30 = this.aHashtable7.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method7561(this.aHashtable7.get(local36), local36);
		}
		Static477.method6611(true, false);
		this.aNativeInterface3.release();
		this.aBoolean639 = true;
	}

	@OriginalMember(owner = "client!gj", name = "X", descriptor = "(III)V")
	@Override
	public final void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9562 == arg0 && this.anInt9564 == arg1 && arg2 == this.anInt9553) {
			return;
		}
		this.anInt9553 = arg2;
		this.anInt9562 = arg0;
		this.anInt9564 = arg1;
		if (this.aBoolean631) {
			return;
		}
		this.method7542();
		this.method7637();
	}

	@OriginalMember(owner = "client!gj", name = "T", descriptor = "(I)V")
	protected abstract void method7637();

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7466() {
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "(Z)V")
	private void method7638() {
		this.method7658(this.anInterface8_13, 0);
		this.method7553(this.aClass107_18);
		this.method7531(1, 0, Static384.aClass321_5);
	}

	@OriginalMember(owner = "client!gj", name = "U", descriptor = "(I)I")
	public final int method7639() {
		return this.anInt9558;
	}

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "()Z")
	@Override
	public final boolean method7474() {
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(II)V")
	public final void method7640(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt9585) {
			return;
		}
		@Pc(20) Class30 local20;
		@Pc(22) boolean local22;
		@Pc(24) boolean local24;
		if (arg0 == 1) {
			local20 = Static336.aClass30_5;
			local22 = true;
			local24 = true;
		} else if (arg0 == 2) {
			local20 = Static126.aClass30_1;
			local22 = true;
			local24 = false;
		} else if (arg0 == 128) {
			local22 = true;
			local20 = Static225.aClass30_3;
			local24 = true;
		} else {
			local22 = false;
			local24 = false;
			local20 = Static378.aClass30_6;
		}
		if (this.aBoolean645 != local24) {
			this.aBoolean645 = local24;
			this.method7530();
		}
		if (local22 != this.aBoolean647) {
			this.aBoolean647 = local22;
			this.method7539();
		}
		if (this.aClass30_7 != local20) {
			this.aClass30_7 = local20;
			this.method7613();
		}
		this.anInt9587 &= 0xFFFFFFE3;
		this.anInt9585 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "V", descriptor = "(I)V")
	protected abstract void method7641();

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "(B)V")
	protected abstract void method7642();

	@OriginalMember(owner = "client!gj", name = "W", descriptor = "(I)V")
	private void method7643() {
		this.aBoolean644 = false;
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7278();
		}
		this.method7571();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!uj;I)V")
	private void method7644(@OriginalArg(1) Class321 arg0, @OriginalArg(2) int arg1) {
		this.method7658(this.anInterface8_14, 0);
		this.method7553(this.aClass107_17);
		this.method7531(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!gj", name = "X", descriptor = "(I)V")
	public final void method7645() {
		if (Static450.aClass296_5 == this.aClass296_7) {
			return;
		}
		@Pc(10) Class296 local10 = this.aClass296_7;
		this.aClass296_7 = Static450.aClass296_5;
		if (local10.method6776()) {
			this.method7643();
		}
		this.anInt9587 &= 0xFFFFFFE0;
		this.aFloatArray83 = this.aFloatArray82;
	}

	@OriginalMember(owner = "client!gj", name = "Y", descriptor = "(I)V")
	protected abstract void method7646();

	@OriginalMember(owner = "client!gj", name = "Z", descriptor = "(I)V")
	protected abstract void method7647();

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V")
	@Override
	public void method7486(@OriginalArg(0) int arg0) {
		this.aClass221_3.method5327();
		this.anInt9563 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!gj", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public final boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass93_Sub3_16.method3774((float) arg0, (float) arg1, (float) arg2);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass93_Sub3_16.method3774((float) arg3, (float) arg4, (float) arg5);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if (local14 < (float) this.anInt9557 && local31 < (float) this.anInt9557 || !(!(local14 > (float) this.anInt9577) || !(local31 > (float) this.anInt9577))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt9575 * this.aClass93_Sub3_16.method3777((float) arg1, (float) arg2, (float) arg0) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt9575 * this.aClass93_Sub3_16.method3777((float) arg4, (float) arg5, (float) arg3) / local31);
		if ((float) local81 < this.aFloat203 && this.aFloat203 > (float) local99 || this.aFloat197 < (float) local81 && (float) local99 > this.aFloat197) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt9586 * this.aClass93_Sub3_16.method3755((float) arg1, (float) arg0, (float) arg2) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt9586 * this.aClass93_Sub3_16.method3755((float) arg4, (float) arg3, (float) arg5) / local31);
			return (!(this.aFloat191 > (float) local143) || !(this.aFloat191 > (float) local161)) && (!((float) local143 > this.aFloat195) || !(this.aFloat195 < (float) local161));
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method7492(@OriginalArg(0) Class93 arg0) {
		this.aClass93_Sub3_16 = (Class93_Sub3) arg0;
		this.aClass93_Sub3_18.la(this.aClass93_Sub3_16);
		this.aClass93_Sub3_18.method3773();
		this.aClass93_Sub3_19.method3770(this.aClass93_Sub3_18);
		this.aClass93_Sub3_17.method3770(this.aClass93_Sub3_16);
		if (this.aClass296_7.method6776()) {
			this.method7643();
		}
	}

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "()Z")
	@Override
	public final boolean method7502() {
		return this.aClass34Array3[3].method7276();
	}

	@OriginalMember(owner = "client!gj", name = "B", descriptor = "()Lclient!q;")
	@Override
	public final Class93 method7518() {
		return new Class93_Sub3();
	}

	@OriginalMember(owner = "client!gj", name = "ab", descriptor = "(I)V")
	private void method7648() {
		if (this.aClass296_7 == Static220.aClass296_3) {
			return;
		}
		@Pc(12) Class296 local12 = this.aClass296_7;
		this.aClass296_7 = Static220.aClass296_3;
		if (!local12.method6776()) {
			this.method7643();
		}
		this.method7633();
		this.aFloatArray83 = this.aFloatArray81;
		this.method7529();
		this.anInt9587 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gj", name = "bb", descriptor = "(I)I")
	public final int method7649() {
		return this.anInt9584;
	}

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "()Z")
	@Override
	public final boolean method7506() {
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(BI)V")
	public final void method7650(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt9581) {
			this.anInt9581 = arg0;
			this.method7552();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method7651(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap6.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(Z)V")
	@Override
	public final void method7500(@OriginalArg(0) boolean arg0) {
		this.aBoolean630 = arg0;
		this.method7607();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZZ)V")
	public final void method7652(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean637) {
			this.aBoolean637 = arg0;
			this.method7607();
			this.anInt9587 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gj", name = "cb", descriptor = "(I)V")
	protected abstract void method7653();

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "(B)V")
	public final void method7654() {
		this.aClass93_Sub3_15.Y();
		this.aBoolean629 = true;
		this.method7629();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method7512() {
	}

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7499() {
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!kda;I)V")
	public abstract void method7655(@OriginalArg(0) Class168 arg0);

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7498() {
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!mj;[Lclient!kq;Z)Lclient!ta;")
	@Override
	public final Class82 method7523(@OriginalArg(0) Class202 arg0, @OriginalArg(1) Class177[] arg1) {
		return new Class82_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "(II)Lclient!tf;")
	protected Class34 method7656(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class34_Sub6(this);
		} else if (arg0 == 1) {
			return new Class34_Sub7(this);
		} else if (arg0 == 2) {
			return new Class34_Sub9(this, this.aClass66_6);
		} else if (arg0 == 7) {
			return new Class34_Sub4(this);
		} else {
			return new Class34_Sub5(this);
		}
	}

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "()Z")
	@Override
	public final boolean method7497() {
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[[IZI)Lclient!js;")
	public abstract Interface10 method7657(@OriginalArg(1) int[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!hn;IIII)Lclient!ba;")
	@Override
	public final Class24 method7464(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class24_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7507(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas14) {
			throw new RuntimeException();
		} else if (!this.aHashtable7.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) Object local53 = this.method7601(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!iq;II)V")
	public abstract void method7658(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIII)Lclient!ka;")
	@Override
	public final Class3 method7456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class3_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "(B)V")
	protected abstract void method7659();

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "(Z)V")
	private void method7660() {
		if (Static453.aClass296_6 == this.aClass296_7) {
			return;
		}
		@Pc(10) Class296 local10 = this.aClass296_7;
		this.aClass296_7 = Static453.aClass296_6;
		if (!local10.method6776()) {
			this.method7643();
		}
		this.method7593();
		this.aFloatArray83 = this.aFloatArray88;
		this.method7529();
		this.anInt9587 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method7494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method7578();
		this.method7612();
		this.method7650(arg4);
		this.method7540(0, Static20.aClass150_1);
		this.method7630(Static20.aClass150_1, 0);
		this.method7640(arg5);
		this.aClass93_Sub3_15.method3768((float) (arg2 - 1), 1.0F, (float) (arg3 - 1));
		this.aClass93_Sub3_15.method3762(0.0F, (float) arg1 - local7, -local7 + (float) arg0);
		this.method7619();
		this.method7599(false);
		this.method7644(Static543.aClass321_8, 4);
		this.method7599(true);
		this.method7630(Static393.aClass150_6, 0);
		this.method7540(0, Static393.aClass150_6);
	}

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "(B)Lclient!js;")
	public final Interface10 method7661() {
		return this.aClass3_Sub2_3 == null ? null : this.aClass3_Sub2_3.method1617();
	}

	@OriginalMember(owner = "client!gj", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7513() {
		return false;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ba;Lclient!hfa;Lclient!q;Lclient!rc;I)V")
	@Override
	public final void method7470(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class60_Sub6 arg3, @OriginalArg(4) int arg4) {
		arg0.method7393(arg2, arg3, arg4);
		this.method7511(arg1);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)V")
	public abstract void method7662(@OriginalArg(0) int arg0);
}
