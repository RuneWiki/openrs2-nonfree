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

@OriginalClass("client!rr")
public abstract class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!rr", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!rr", name = "Ib", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7;

	@OriginalMember(owner = "client!rr", name = "Mb", descriptor = "Lclient!tj;")
	protected Class318 aClass318_8;

	@OriginalMember(owner = "client!rr", name = "hd", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!rr", name = "Dd", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!rr", name = "Nd", descriptor = "I")
	public int anInt9099;

	@OriginalMember(owner = "client!rr", name = "Qd", descriptor = "I")
	protected int anInt9102;

	@OriginalMember(owner = "client!rr", name = "Td", descriptor = "I")
	public int anInt9103;

	@OriginalMember(owner = "client!rr", name = "ae", descriptor = "Lclient!cba;")
	private Class47_Sub1 aClass47_Sub1_3;

	@OriginalMember(owner = "client!rr", name = "ce", descriptor = "I")
	public int anInt9105;

	@OriginalMember(owner = "client!rr", name = "ie", descriptor = "[Lclient!ur;")
	protected Class42_Sub3[] aClass42_Sub3Array3;

	@OriginalMember(owner = "client!rr", name = "me", descriptor = "I")
	protected int anInt9109;

	@OriginalMember(owner = "client!rr", name = "oe", descriptor = "[Lclient!qaa;")
	protected Class266[] aClass266Array5;

	@OriginalMember(owner = "client!rr", name = "xe", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!rr", name = "ze", descriptor = "Z")
	public boolean aBoolean600;

	@OriginalMember(owner = "client!rr", name = "Be", descriptor = "I")
	public int anInt9118;

	@OriginalMember(owner = "client!rr", name = "Fe", descriptor = "I")
	protected int anInt9121;

	@OriginalMember(owner = "client!rr", name = "Ge", descriptor = "[Lclient!qaa;")
	protected Class266[] aClass266Array6;

	@OriginalMember(owner = "client!rr", name = "Ie", descriptor = "I")
	public int anInt9123;

	@OriginalMember(owner = "client!rr", name = "Ke", descriptor = "Lclient!ot;")
	private Class246 aClass246_3;

	@OriginalMember(owner = "client!rr", name = "Te", descriptor = "[Lclient!cf;")
	protected Class51[] aClass51Array3;

	@OriginalMember(owner = "client!rr", name = "We", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!rr", name = "Xe", descriptor = "F")
	private float aFloat197;

	@OriginalMember(owner = "client!rr", name = "af", descriptor = "Lclient!ia;")
	private Class32 aClass32_3;

	@OriginalMember(owner = "client!rr", name = "df", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!rr", name = "ef", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!rr", name = "ff", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!rr", name = "lf", descriptor = "I")
	protected int anInt9126;

	@OriginalMember(owner = "client!rr", name = "pf", descriptor = "F")
	public float aFloat203;

	@OriginalMember(owner = "client!rr", name = "tf", descriptor = "[Lclient!wq;")
	private Interface24[] anInterface24Array3;

	@OriginalMember(owner = "client!rr", name = "Bf", descriptor = "F")
	private float aFloat204;

	@OriginalMember(owner = "client!rr", name = "Cf", descriptor = "I")
	private int anInt9131;

	@OriginalMember(owner = "client!rr", name = "Df", descriptor = "Z")
	protected boolean aBoolean611;

	@OriginalMember(owner = "client!rr", name = "Ef", descriptor = "[Lclient!cp;")
	protected Class3_Sub9[] aClass3_Sub9Array6;

	@OriginalMember(owner = "client!rr", name = "Hf", descriptor = "Z")
	public boolean aBoolean612;

	@OriginalMember(owner = "client!rr", name = "If", descriptor = "Z")
	protected boolean aBoolean613;

	@OriginalMember(owner = "client!rr", name = "Lf", descriptor = "I")
	protected int anInt9135;

	@OriginalMember(owner = "client!rr", name = "Of", descriptor = "Z")
	public boolean aBoolean614;

	@OriginalMember(owner = "client!rr", name = "Qf", descriptor = "Lclient!wq;")
	public Interface24 anInterface24_3;

	@OriginalMember(owner = "client!rr", name = "Tf", descriptor = "I")
	private int anInt9141;

	@OriginalMember(owner = "client!rr", name = "Wf", descriptor = "I")
	public int anInt9143;

	@OriginalMember(owner = "client!rr", name = "Zf", descriptor = "Lclient!qf;")
	public Class1 aClass1_15;

	@OriginalMember(owner = "client!rr", name = "ag", descriptor = "Lclient!qf;")
	public Class1 aClass1_16;

	@OriginalMember(owner = "client!rr", name = "bg", descriptor = "Lclient!og;")
	private Interface15 anInterface15_14;

	@OriginalMember(owner = "client!rr", name = "cg", descriptor = "Lclient!cfa;")
	public Class52_Sub1 aClass52_Sub1_21;

	@OriginalMember(owner = "client!rr", name = "dg", descriptor = "Lclient!cfa;")
	public Class52_Sub1 aClass52_Sub1_22;

	@OriginalMember(owner = "client!rr", name = "eg", descriptor = "Lclient!qf;")
	public Class1 aClass1_17;

	@OriginalMember(owner = "client!rr", name = "fg", descriptor = "Lclient!cfa;")
	public Class52_Sub1 aClass52_Sub1_23;

	@OriginalMember(owner = "client!rr", name = "gg", descriptor = "Lclient!cfa;")
	public Class52_Sub1 aClass52_Sub1_24;

	@OriginalMember(owner = "client!rr", name = "hg", descriptor = "Lclient!cfa;")
	public Class52_Sub1 aClass52_Sub1_25;

	@OriginalMember(owner = "client!rr", name = "ig", descriptor = "Lclient!og;")
	private Interface15 anInterface15_15;

	@OriginalMember(owner = "client!rr", name = "jg", descriptor = "Lclient!qf;")
	public Class1 aClass1_18;

	@OriginalMember(owner = "client!rr", name = "kg", descriptor = "Lclient!qf;")
	private Class1 aClass1_19;

	@OriginalMember(owner = "client!rr", name = "lg", descriptor = "Lclient!cfa;")
	public Class52_Sub1 aClass52_Sub1_26;

	@OriginalMember(owner = "client!rr", name = "mg", descriptor = "Lclient!cfa;")
	public Class52_Sub1 aClass52_Sub1_27;

	@OriginalMember(owner = "client!rr", name = "ng", descriptor = "Lclient!bo;")
	private Interface2 anInterface2_6;

	@OriginalMember(owner = "client!rr", name = "og", descriptor = "Lclient!cfa;")
	public Class52_Sub1 aClass52_Sub1_28;

	@OriginalMember(owner = "client!rr", name = "pg", descriptor = "Lclient!qf;")
	private Class1 aClass1_20;

	@OriginalMember(owner = "client!rr", name = "qg", descriptor = "Lclient!cfa;")
	public Class52_Sub1 aClass52_Sub1_29;

	@OriginalMember(owner = "client!rr", name = "rg", descriptor = "Lclient!cfa;")
	public Class52_Sub1 aClass52_Sub1_30;

	@OriginalMember(owner = "client!rr", name = "sg", descriptor = "I")
	private int anInt9144;

	@OriginalMember(owner = "client!rr", name = "tg", descriptor = "Z")
	protected boolean aBoolean616;

	@OriginalMember(owner = "client!rr", name = "ec", descriptor = "Lclient!or;")
	private final Class244 aClass244_63 = new Class244();

	@OriginalMember(owner = "client!rr", name = "Sd", descriptor = "Z")
	protected boolean aBoolean595 = true;

	@OriginalMember(owner = "client!rr", name = "Rd", descriptor = "Lclient!ur;")
	protected final Class42_Sub3 aClass42_Sub3_15 = new Class42_Sub3();

	@OriginalMember(owner = "client!rr", name = "Vd", descriptor = "Lclient!ur;")
	public Class42_Sub3 aClass42_Sub3_16 = new Class42_Sub3();

	@OriginalMember(owner = "client!rr", name = "Wd", descriptor = "Lclient!ur;")
	public final Class42_Sub3 aClass42_Sub3_17 = new Class42_Sub3();

	@OriginalMember(owner = "client!rr", name = "Xd", descriptor = "Lclient!ur;")
	protected final Class42_Sub3 aClass42_Sub3_18 = new Class42_Sub3();

	@OriginalMember(owner = "client!rr", name = "Yd", descriptor = "Lclient!ur;")
	private final Class42_Sub3 aClass42_Sub3_19 = new Class42_Sub3();

	@OriginalMember(owner = "client!rr", name = "Zd", descriptor = "Lclient!ur;")
	private final Class42_Sub3 aClass42_Sub3_20 = new Class42_Sub3();

	@OriginalMember(owner = "client!rr", name = "be", descriptor = "F")
	public float aFloat189 = 1.0F;

	@OriginalMember(owner = "client!rr", name = "ge", descriptor = "Z")
	protected boolean aBoolean597 = false;

	@OriginalMember(owner = "client!rr", name = "qe", descriptor = "I")
	protected int anInt9111 = 0;

	@OriginalMember(owner = "client!rr", name = "ke", descriptor = "[F")
	private final float[] aFloatArray59 = new float[16];

	@OriginalMember(owner = "client!rr", name = "Je", descriptor = "F")
	public float aFloat194 = 3584.0F;

	@OriginalMember(owner = "client!rr", name = "Qe", descriptor = "I")
	public int anInt9124 = 512;

	@OriginalMember(owner = "client!rr", name = "te", descriptor = "F")
	public float aFloat191 = 1.0F;

	@OriginalMember(owner = "client!rr", name = "Re", descriptor = "[Lclient!ia;")
	private final Class32[] aClass32Array3 = new Class32[10];

	@OriginalMember(owner = "client!rr", name = "le", descriptor = "I")
	private int anInt9108 = 16777215;

	@OriginalMember(owner = "client!rr", name = "ee", descriptor = "I")
	public int anInt9106 = 0;

	@OriginalMember(owner = "client!rr", name = "he", descriptor = "F")
	public float aFloat190 = 3584.0F;

	@OriginalMember(owner = "client!rr", name = "Ee", descriptor = "[F")
	private final float[] aFloatArray60 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!rr", name = "ue", descriptor = "I")
	protected final int anInt9114 = 0;

	@OriginalMember(owner = "client!rr", name = "pe", descriptor = "I")
	public int anInt9110 = -1;

	@OriginalMember(owner = "client!rr", name = "ne", descriptor = "Z")
	private boolean aBoolean599 = false;

	@OriginalMember(owner = "client!rr", name = "fe", descriptor = "I")
	protected int anInt9107 = 0;

	@OriginalMember(owner = "client!rr", name = "hf", descriptor = "[F")
	private final float[] aFloatArray64 = new float[16];

	@OriginalMember(owner = "client!rr", name = "Ne", descriptor = "Lclient!wr;")
	protected Class363 aClass363_5 = Static519.aClass363_6;

	@OriginalMember(owner = "client!rr", name = "Me", descriptor = "[F")
	private final float[] aFloatArray61 = new float[16];

	@OriginalMember(owner = "client!rr", name = "rf", descriptor = "I")
	public int anInt9127 = 50;

	@OriginalMember(owner = "client!rr", name = "bf", descriptor = "I")
	public int bf = 512;

	@OriginalMember(owner = "client!rr", name = "se", descriptor = "I")
	protected int anInt9113 = 0;

	@OriginalMember(owner = "client!rr", name = "cf", descriptor = "Lclient!naa;")
	protected Class218 aClass218_8 = Static529.aClass218_9;

	@OriginalMember(owner = "client!rr", name = "Ue", descriptor = "[F")
	private final float[] aFloatArray63 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!rr", name = "ye", descriptor = "I")
	protected int anInt9117 = 0;

	@OriginalMember(owner = "client!rr", name = "uf", descriptor = "I")
	private int anInt9128 = 0;

	@OriginalMember(owner = "client!rr", name = "Gf", descriptor = "F")
	public float aFloat205 = -1.0F;

	@OriginalMember(owner = "client!rr", name = "De", descriptor = "I")
	public int anInt9120 = 128;

	@OriginalMember(owner = "client!rr", name = "Se", descriptor = "F")
	public float aFloat195 = -1.0F;

	@OriginalMember(owner = "client!rr", name = "gf", descriptor = "F")
	public float aFloat201 = 1.0F;

	@OriginalMember(owner = "client!rr", name = "vf", descriptor = "I")
	protected int anInt9129 = 3584;

	@OriginalMember(owner = "client!rr", name = "nf", descriptor = "[F")
	private final float[] aFloatArray65 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!rr", name = "Af", descriptor = "Z")
	protected boolean aBoolean610 = false;

	@OriginalMember(owner = "client!rr", name = "Ye", descriptor = "Z")
	private boolean aBoolean603 = false;

	@OriginalMember(owner = "client!rr", name = "Pe", descriptor = "[F")
	protected float[] aFloatArray62 = this.aFloatArray60;

	@OriginalMember(owner = "client!rr", name = "kf", descriptor = "Z")
	protected boolean aBoolean605 = true;

	@OriginalMember(owner = "client!rr", name = "Kf", descriptor = "I")
	protected int anInt9134 = 0;

	@OriginalMember(owner = "client!rr", name = "Oe", descriptor = "Z")
	private boolean aBoolean602 = false;

	@OriginalMember(owner = "client!rr", name = "we", descriptor = "I")
	private int anInt9116 = 0;

	@OriginalMember(owner = "client!rr", name = "qf", descriptor = "Z")
	protected boolean aBoolean606 = true;

	@OriginalMember(owner = "client!rr", name = "Ce", descriptor = "I")
	public int anInt9119 = 0;

	@OriginalMember(owner = "client!rr", name = "Nf", descriptor = "I")
	protected final int anInt9137 = 0;

	@OriginalMember(owner = "client!rr", name = "zf", descriptor = "Z")
	protected boolean aBoolean609 = true;

	@OriginalMember(owner = "client!rr", name = "re", descriptor = "I")
	private int anInt9112 = 0;

	@OriginalMember(owner = "client!rr", name = "Rf", descriptor = "I")
	private int anInt9139 = -1;

	@OriginalMember(owner = "client!rr", name = "jf", descriptor = "Z")
	private boolean aBoolean604 = false;

	@OriginalMember(owner = "client!rr", name = "Mf", descriptor = "I")
	public int anInt9136 = 8;

	@OriginalMember(owner = "client!rr", name = "yf", descriptor = "I")
	public int anInt9130 = 3;

	@OriginalMember(owner = "client!rr", name = "je", descriptor = "Z")
	protected boolean aBoolean598 = false;

	@OriginalMember(owner = "client!rr", name = "Ff", descriptor = "I")
	private int anInt9132 = -1;

	@OriginalMember(owner = "client!rr", name = "Ae", descriptor = "F")
	public float aFloat193 = 1.0F;

	@OriginalMember(owner = "client!rr", name = "sf", descriptor = "Z")
	protected boolean aBoolean607 = true;

	@OriginalMember(owner = "client!rr", name = "de", descriptor = "Z")
	protected boolean aBoolean596 = true;

	@OriginalMember(owner = "client!rr", name = "mf", descriptor = "F")
	private float aFloat202 = 1.0F;

	@OriginalMember(owner = "client!rr", name = "Pf", descriptor = "I")
	private int anInt9138 = 0;

	@OriginalMember(owner = "client!rr", name = "Sf", descriptor = "I")
	private int anInt9140 = 1;

	@OriginalMember(owner = "client!rr", name = "Uf", descriptor = "I")
	public int anInt9142 = 0;

	@OriginalMember(owner = "client!rr", name = "Jf", descriptor = "I")
	public int anInt9133 = -1;

	@OriginalMember(owner = "client!rr", name = "Le", descriptor = "Z")
	private boolean aBoolean601 = false;

	@OriginalMember(owner = "client!rr", name = "Ve", descriptor = "I")
	private int anInt9125 = -1;

	@OriginalMember(owner = "client!rr", name = "Vf", descriptor = "[F")
	public final float[] aFloatArray67 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!rr", name = "wf", descriptor = "Z")
	protected boolean aBoolean608 = false;

	@OriginalMember(owner = "client!rr", name = "xf", descriptor = "[F")
	public final float[] aFloatArray66 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!rr", name = "Xf", descriptor = "Z")
	private boolean aBoolean615 = false;

	@OriginalMember(owner = "client!rr", name = "of", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!rr", name = "Yf", descriptor = "Lclient!ur;")
	private final Class42_Sub3 aClass42_Sub3_21 = new Class42_Sub3();

	@OriginalMember(owner = "client!rr", name = "ve", descriptor = "I")
	protected final int anInt9115;

	@OriginalMember(owner = "client!rr", name = "dc", descriptor = "Ljava/lang/Object;")
	protected final Object anObject17;

	@OriginalMember(owner = "client!rr", name = "ed", descriptor = "Ljava/lang/Object;")
	private Object anObject18;

	@OriginalMember(owner = "client!rr", name = "Nc", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas11;

	@OriginalMember(owner = "client!rr", name = "Pc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!rr", name = "kb", descriptor = "Lclient!ri;")
	protected final Class284 aClass284_148;

	@OriginalMember(owner = "client!rr", name = "P", descriptor = "I")
	private int anInt8957;

	@OriginalMember(owner = "client!rr", name = "Gd", descriptor = "I")
	public int anInt9092;

	@OriginalMember(owner = "client!rr", name = "He", descriptor = "I")
	public final int anInt9122;

	@OriginalMember(owner = "client!rr", name = "oc", descriptor = "I")
	private int anInt9027;

	@OriginalMember(owner = "client!rr", name = "Ab", descriptor = "I")
	public int anInt8992;

	@OriginalMember(owner = "client!rr", name = "Pb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!rr", name = "Ze", descriptor = "Lclient!hr;")
	private final Class132 aClass132_3;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!fa;Lclient!ri;II)V")
	protected Class31_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class284 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anInt9115 = arg4;
		this.anObject18 = this.anObject17 = arg1;
		this.aCanvas12 = this.aCanvas11 = arg0;
		this.aClass284_148 = arg3;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt9092 = this.anInt8957 = local307.width;
		this.anInt9122 = arg5;
		this.anInt8992 = this.anInt9027 = local307.height;
		Static410.method5761(true, false);
		if (super.anInterface4_14 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt9122);
			this.aClass132_3 = null;
		} else {
			this.aClass132_3 = new Class132(this, super.anInterface4_14);
			this.aNativeInterface3 = new NativeInterface(super.anInterface4_14.method7231(), this.anInt9122);
			for (@Pc(364) int local364 = 0; local364 < super.anInterface4_14.method7231(); local364++) {
				@Pc(372) Class172 local372 = super.anInterface4_14.method7229(local364);
				if (local372 != null) {
					this.aNativeInterface3.initTextureMetrics(local364, local372.aByte61, local372.aByte58);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method8092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!rr", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt9129;
	}

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "(I)V")
	protected abstract void method7050();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	protected abstract void method7051(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
	private void method7052() {
		if (this.aClass218_8 == Static32.aClass218_6) {
			return;
		}
		@Pc(16) Class218 local16 = this.aClass218_8;
		this.aClass218_8 = Static32.aClass218_6;
		if (!local16.method5025()) {
			this.method7079();
		}
		this.method7169();
		this.aFloatArray62 = this.aFloatArray61;
		this.method7159();
		this.anInt9131 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)I")
	@Override
	public final int method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "()Z")
	@Override
	public final boolean method8074() {
		return true;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZZ[[II)Lclient!pfa;")
	public abstract Interface18 method7053(@OriginalArg(0) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!rr", name = "ra", descriptor = "(F)V")
	@Override
	public final void ra(@OriginalArg(0) float arg0) {
		if (this.aFloat191 != arg0) {
			this.aFloat191 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method7056();
			this.method7073();
		}
	}

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "()Z")
	@Override
	public final boolean method8095() {
		return this.aClass32Array3[3].method7454();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public final Class73 method8033(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class73_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(Z)V")
	private void method7054() {
		this.aFloat200 = this.anInt9117 - this.anInt9142;
		this.aFloat199 = this.anInt9111 - this.anInt9142;
		this.aFloat196 = this.anInt9107 - this.anInt9119;
		this.aFloat192 = this.anInt9113 - this.anInt9119;
	}

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "(I)V")
	protected abstract void method7055();

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(Z)V")
	protected abstract void method7056();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIBLclient!pw;)V")
	public abstract void method7057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class265 arg2);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BZ)V")
	public final void method7058(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean610 != arg0) {
			this.aBoolean610 = arg0;
			this.method7066();
			this.anInt9131 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "(I)V")
	public final void method7059() {
		if (this.anInt9131 == 4) {
			return;
		}
		this.method7069();
		this.method7157(false);
		this.method7082(false);
		this.method7167(false);
		this.method7058(false);
		this.method7088(false, -2, false);
		this.method7115(1);
		this.method7141(0);
		this.anInt9131 = 4;
	}

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "(I)V")
	public final void method7060() {
		this.aClass42_Sub3_15.Y();
		this.aBoolean595 = true;
		this.method7093();
	}

	@OriginalMember(owner = "client!rr", name = "XA", descriptor = "(IIIII)V")
	@Override
	public final void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8059(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "(I)V")
	private void method7061() {
		if (this.aClass218_8 == Static74.aClass218_5) {
			return;
		}
		@Pc(6) Class218 local6 = this.aClass218_8;
		this.aClass218_8 = Static74.aClass218_5;
		if (!local6.method5025()) {
			this.method7079();
		}
		this.method7072();
		this.aFloatArray62 = this.aFloatArray64;
		this.method7159();
		this.anInt9131 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V")
	private void method7062() {
		this.aFloatArray61[10] = this.aFloat204;
		this.aFloatArray61[14] = this.aFloat197;
		this.aFloat194 = (this.aFloatArray61[14] - (float) this.anInt9129) / this.aFloatArray61[10];
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V")
	protected abstract void method7063();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public final Class53 method8058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static223.method3698(arg0, arg3, this, arg1, arg2);
	}

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "()[I")
	@Override
	public final int[] v() {
		return new int[] { this.anInt9119, this.anInt9142, this.anInt9124, this.bf };
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(FIFFFFF)Z")
	private boolean method7064(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(14) Buffer local14 = this.anInterface15_14.method5275();
		if (local14 == null) {
			return false;
		}
		@Pc(23) Stream local23 = this.method7154(local14);
		if (Stream.a()) {
			local23.a(arg1);
			local23.a(arg2);
			local23.a(arg4);
			local23.a(arg0);
			local23.a(arg3);
			local23.a(arg5);
		} else {
			local23.b(arg1);
			local23.b(arg2);
			local23.b(arg4);
			local23.b(arg0);
			local23.b(arg3);
			local23.b(arg5);
		}
		local23.c();
		return this.anInterface15_14.method5276();
	}

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "(I)V")
	protected abstract void method7065();

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
	@Override
	public final void method8043(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V")
	protected abstract void method7066();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLclient!qs;)V")
	public abstract void method7067(@OriginalArg(1) Class273 arg0);

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "(I)V")
	protected abstract void method7068();

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "(I)V")
	private void method7069() {
		if (Static291.aClass218_7 == this.aClass218_8) {
			return;
		}
		@Pc(10) Class218 local10 = this.aClass218_8;
		this.aClass218_8 = Static291.aClass218_7;
		if (local10.method5025()) {
			this.method7079();
		}
		this.method7180();
		this.aFloatArray62 = this.aFloatArray59;
		this.method7159();
		this.anInt9131 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!rr", name = "da", descriptor = "(IIII)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt9092 - 1 && arg1 <= 0 && this.anInt8992 - 1 <= arg3) {
			this.JA();
			return;
		}
		this.anInt9107 = arg0 < 0 ? 0 : arg0;
		this.anInt9111 = arg3 <= this.anInt9092 ? arg3 : 0;
		this.anInt9113 = arg2 <= this.anInt9092 ? arg2 : 0;
		this.anInt9117 = arg1 >= 0 ? arg1 : 0;
		if (!this.aBoolean616) {
			this.aBoolean616 = true;
			this.method7177();
		}
		this.method7144();
		this.method7054();
	}

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "()Z")
	@Override
	public final boolean method8089() {
		return true;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[FIIIILclient!os;Z)Lclient!mca;")
	protected abstract Interface12 method7070(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(6) Class245 arg3, @OriginalArg(7) boolean arg4);

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(Z)V")
	public final void method7071() {
		if (this.anInt9131 == 16) {
			return;
		}
		this.method7061();
		this.method7157(true);
		this.method7167(true);
		this.method7058(true);
		this.method7115(1);
		this.anInt9131 = 16;
	}

	@OriginalMember(owner = "client!rr", name = "CA", descriptor = "(IIII)V")
	@Override
	public final void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9139 = arg2;
		this.aBoolean600 = true;
		this.anInt9125 = arg1;
		this.anInt9128 = arg3;
		this.anInt9141 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "(Z)V")
	private void method7072() {
		if (this.aBoolean601) {
			return;
		}
		@Pc(19) float[] local19 = this.aFloatArray64;
		@Pc(23) float local23 = (float) this.anInt9127;
		@Pc(27) float local27 = (float) this.anInt9129;
		@Pc(39) float local39 = (float) -this.anInt9142 * this.aFloat202 / (float) this.bf;
		@Pc(51) float local51 = (float) -this.anInt9119 * this.aFloat202 / (float) this.anInt9124;
		@Pc(66) float local66 = this.aFloat202 * (float) (this.anInt9092 - this.anInt9119) / (float) this.anInt9124;
		@Pc(81) float local81 = this.aFloat202 * (float) (this.anInt8992 - this.anInt9142) / (float) this.bf;
		if (local66 == local51 || local39 == local81) {
			local19[10] = 1.0F;
			local19[5] = 1.0F;
			local19[4] = 0.0F;
			local19[7] = 0.0F;
			local19[14] = 0.0F;
			local19[3] = 0.0F;
			local19[11] = 0.0F;
			local19[2] = 0.0F;
			local19[6] = 0.0F;
			local19[13] = 0.0F;
			local19[12] = 0.0F;
			local19[9] = 0.0F;
			local19[8] = 0.0F;
			local19[15] = 1.0F;
			local19[1] = 0.0F;
			local19[0] = 1.0F;
		} else {
			local19[4] = 0.0F;
			local19[8] = 0.0F;
			local19[9] = 0.0F;
			local19[13] = (local39 + local81) / (-local39 + local81);
			local19[3] = 0.0F;
			local19[15] = 1.0F;
			local19[11] = 0.0F;
			local19[7] = 0.0F;
			local19[2] = 0.0F;
			local19[12] = (local51 + local66) / (local51 - local66);
			local19[14] = local23 / (local23 - local27);
			local19[0] = 2.0F / (local66 - local51);
			local19[1] = 0.0F;
			local19[6] = 0.0F;
			local19[5] = 2.0F / (local81 - local39);
			local19[10] = 1.0F / (local23 - local27);
		}
		this.method7137();
		this.aBoolean601 = true;
	}

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(B)V")
	protected abstract void method7073();

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "(I)Lclient!ur;")
	public final Class42_Sub3 method7074() {
		return this.aClass42_Sub3_19;
	}

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "(I)Lclient!ur;")
	public final Class42_Sub3 method7075() {
		return this.aClass42_Sub3Array3[this.anInt9134];
	}

	@OriginalMember(owner = "client!rr", name = "GA", descriptor = "(II)V")
	@Override
	public final void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt9127 && arg1 == this.anInt9129) {
			return;
		}
		this.anInt9129 = arg1;
		this.anInt9127 = arg0;
		this.method7178();
		this.method7124();
		this.method7117();
	}

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "(IIIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8059(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(IIIII)V")
	@Override
	protected final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!mg;ILclient!os;)Lclient!mca;")
	public abstract Interface12 method7076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class204 arg2, @OriginalArg(4) Class245 arg3);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BI)V")
	public final void method7077(@OriginalArg(0) byte arg0) {
		this.method7160(arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16);
	}

	@OriginalMember(owner = "client!rr", name = "JA", descriptor = "()V")
	@Override
	public final void JA() {
		this.anInt9107 = 0;
		this.anInt9117 = 0;
		this.anInt9111 = this.anInt8992;
		this.anInt9113 = this.anInt9092;
		if (this.aBoolean616) {
			this.aBoolean616 = false;
			this.method7177();
		}
		this.method7054();
	}

	@OriginalMember(owner = "client!rr", name = "V", descriptor = "(IIII)V")
	@Override
	public final void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt9107) {
			local5 = true;
			this.anInt9107 = arg0;
		}
		if (this.anInt9113 > arg2) {
			local5 = true;
			this.anInt9113 = arg2;
		}
		if (this.anInt9117 < arg1) {
			local5 = true;
			this.anInt9117 = arg1;
		}
		if (this.anInt9111 > arg3) {
			local5 = true;
			this.anInt9111 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean616) {
			this.aBoolean616 = true;
			this.method7177();
		}
		this.method7144();
		this.method7054();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BZIZII)V")
	private void method7078(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) boolean local4 = arg2 & this.method8095();
		if (!local4 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg4 = 1;
			arg3 = 0;
		}
		if (arg1 != 0 && arg0) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt9116) {
			if (this.anInt9116 != 0) {
				this.aClass32Array3[Integer.MAX_VALUE & this.anInt9116].method7460();
			}
			if (arg1 == 0) {
				this.aClass32_3 = null;
			} else {
				this.aClass32_3 = this.aClass32Array3[Integer.MAX_VALUE & arg1];
				this.aClass32_3.method7446(arg0);
				this.aClass32_3.method7459(arg0);
				this.aClass32_3.method7458(arg3, arg4);
			}
			this.anInt9116 = arg1;
			this.anInt9112 = arg4;
			this.anInt9138 = arg3;
		} else if (this.anInt9116 != 0) {
			this.aClass32Array3[Integer.MAX_VALUE & this.anInt9116].method7459(arg0);
			if (arg3 != this.anInt9138 || this.anInt9112 != arg4) {
				this.aClass32Array3[Integer.MAX_VALUE & this.anInt9116].method7458(arg3, arg4);
				this.anInt9138 = arg3;
				this.anInt9112 = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "(I)V")
	private void method7079() {
		this.aBoolean615 = false;
		if (this.aClass32_3 != null) {
			this.aClass32_3.method7456();
		}
		this.method7135();
	}

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "()V")
	@Override
	public final void method8032() {
		if (this.aClass132_3 != null) {
			this.aClass132_3.method3506();
		}
	}

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "()Z")
	@Override
	public final boolean method8040() {
		return true;
	}

	@OriginalMember(owner = "client!rr", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "()V")
	@Override
	protected void method8079() {
		if (this.aBoolean603) {
			return;
		}
		for (@Pc(9) Class3 local9 = this.aClass244_63.method5572(); local9 != null; local9 = this.aClass244_63.method5576()) {
			((Class3_Sub8_Sub2) local9).method4277();
		}
		@Pc(26) Enumeration local26 = this.aHashtable7.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method7183(local32, this.aHashtable7.get(local32));
		}
		Static114.method2275(true, false);
		this.aNativeInterface3.release();
		this.aBoolean603 = true;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!mg;Lclient!os;I)Z")
	public abstract boolean method7080(@OriginalArg(0) Class204 arg0, @OriginalArg(1) Class245 arg1);

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "(B)V")
	protected abstract void method7081();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method8062(@OriginalArg(0) Class42 arg0) {
		this.aClass42_Sub3_16 = (Class42_Sub3) arg0;
		this.aClass42_Sub3_18.M(this.aClass42_Sub3_16);
		this.aClass42_Sub3_18.method7525();
		this.aClass42_Sub3_19.method7527(this.aClass42_Sub3_18);
		this.aClass42_Sub3_17.method7527(this.aClass42_Sub3_16);
		if (this.aClass218_8.method5025()) {
			this.method7079();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI)V")
	public final void method7082(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean608 != arg0) {
			this.aBoolean608 = arg0;
			this.method7163();
			this.anInt9131 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!ko;IZZB)V")
	public abstract void method7083(@OriginalArg(0) Class179 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "(Z)F")
	protected abstract float method7084();

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "(I)V")
	protected final void method7085() {
		@Pc(9) Enumeration local9 = this.aHashtable7.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method7183(local15, this.aHashtable7.get(local15));
		}
		this.anInterface15_15.method7285();
		this.anInterface15_14.method7285();
		this.aClass52_Sub1_23.method1568();
		this.aClass52_Sub1_26.method1568();
		this.aClass52_Sub1_25.method1568();
		this.aClass52_Sub1_29.method1568();
		this.aClass52_Sub1_22.method1568();
		this.aClass246_3.method5586();
		this.anInterface2_6.method7285();
	}

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "(B)V")
	public final void method7086() {
		if (Static529.aClass218_9 == this.aClass218_8) {
			return;
		}
		@Pc(14) Class218 local14 = this.aClass218_8;
		this.aClass218_8 = Static529.aClass218_9;
		if (local14.method5025()) {
			this.method7079();
		}
		this.anInt9131 &= 0xFFFFFFE0;
		this.aFloatArray62 = this.aFloatArray60;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([BIZLclient!os;II)Lclient!mca;")
	public final Interface12 method7087(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class245 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method7104(arg3, arg1, arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZIIZ)V")
	public final void method7088(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt9132 != arg1 || this.aBoolean600 != this.aBoolean602) {
			@Pc(28) Interface12 local28 = null;
			@Pc(30) int local30 = 0;
			@Pc(32) byte local32 = 0;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41 = this.aBoolean600 ? 3 : 0;
			if (arg1 < 0) {
				this.method7120();
			} else {
				local28 = this.aClass132_3.method3504(arg1);
				@Pc(57) Class172 local57 = super.anInterface4_14.method7229(arg1);
				if (local57.aByte57 == 0 && local57.aByte56 == 0) {
					this.method7120();
				} else {
					@Pc(78) int local78 = local57.aBoolean358 ? 64 : 128;
					@Pc(82) int local82 = local78 * 50;
					@Pc(86) Class42_Sub3 local86 = this.method7146();
					local86.method7524(0.0F, (float) (this.anInt9105 % local82 * local57.aByte56) / (float) local82, (float) (this.anInt9105 % local82 * local57.aByte57) / (float) local82);
					this.method7161(Static130.aClass51_15);
				}
				if (!this.aBoolean600) {
					local34 = local57.anInt5204;
					local32 = local57.aByte60;
					local41 = local57.aByte62;
				}
				local30 = local57.anInt5206;
			}
			this.method7078(arg2, local41, arg0, local32, local34);
			if (this.aClass32_3 == null) {
				this.method7129(local28);
				this.method7141(local30);
			} else {
				this.aClass32_3.method7453(local30, local28);
			}
			this.aBoolean602 = this.aBoolean600;
			this.anInt9132 = arg1;
		}
		this.anInt9131 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "()Z")
	@Override
	public final boolean method8063() {
		return true;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([IIZIB)Lclient!mca;")
	public final Interface12 method7089(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		return this.method7181(arg0, arg2, arg3, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!rr", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public final boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass42_Sub3_16.method7533((float) arg2, (float) arg1, (float) arg0);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass42_Sub3_16.method7533((float) arg5, (float) arg4, (float) arg3);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if (local14 < (float) this.anInt9127 && local31 < (float) this.anInt9127 || !(!(local14 > (float) this.anInt9129) || !((float) this.anInt9129 < local31))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt9124 * this.aClass42_Sub3_16.method7537((float) arg1, (float) arg2, (float) arg0) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt9124 * this.aClass42_Sub3_16.method7537((float) arg4, (float) arg5, (float) arg3) / local31);
		if ((float) local81 < this.aFloat196 && (float) local99 < this.aFloat196 || this.aFloat192 < (float) local81 && this.aFloat192 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.bf * this.aClass42_Sub3_16.method7542((float) arg1, (float) arg2, (float) arg0) / local14);
			@Pc(161) int local161 = (int) ((float) this.bf * this.aClass42_Sub3_16.method7542((float) arg4, (float) arg5, (float) arg3) / local31);
			return (!(this.aFloat200 > (float) local143) || !((float) local161 < this.aFloat200)) && (!((float) local143 > this.aFloat199) || !((float) local161 > this.aFloat199));
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8049(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas11 == arg0) {
			local5 = this.anObject18;
		} else if (this.aHashtable7.containsKey(arg0)) {
			local5 = this.aHashtable7.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method7051(local5, arg0);
		if (this.aCanvas12 == arg0) {
			this.method7122();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([I)V")
	@Override
	public final void method8057(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9092;
		arg0[1] = this.anInt8992;
	}

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "(I)V")
	protected abstract void method7090();

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "(I)V")
	protected void method7091() {
		this.method7109();
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(II)V")
	public final void method7092(@OriginalArg(0) int arg0) {
		if (this.anInt9134 != arg0) {
			this.anInt9134 = arg0;
			this.method7170();
		}
	}

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "()Lclient!q;")
	@Override
	public final Class42 method8052() {
		return this.aClass42_Sub3_21;
	}

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "(I)V")
	private void method7093() {
		if (this.aClass218_8 == Static291.aClass218_7) {
			@Pc(7) float local7 = this.method7084();
			this.aClass42_Sub3_15.method7522(local7, 0.0F, local7);
		}
		this.aBoolean615 = false;
		this.method7063();
		if (this.aClass32_3 != null) {
			this.aClass32_3.method7447();
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)I")
	@Override
	public final int method8050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public final Class73 method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class73_Sub2 local11 = new Class73_Sub2(this, arg2, arg3, arg4);
		local11.da(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "(I)I")
	public final int method7094() {
		return this.anInt9128;
	}

	@OriginalMember(owner = "client!rr", name = "y", descriptor = "(I)V")
	protected void method7095() {
		this.anInt9135 = this.anInt9121;
		this.anInt9121 = 0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public final Class73 method8080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class73_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!rr", name = "z", descriptor = "(I)V")
	public final void method7097() {
		this.method7086();
		this.method7159();
	}

	@OriginalMember(owner = "client!rr", name = "A", descriptor = "(I)Lclient!pfa;")
	public final Interface18 method7098() {
		return this.aClass47_Sub1_3 == null ? null : this.aClass47_Sub1_3.method6554();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!ko;ZII)V")
	protected abstract void method7099(@OriginalArg(0) Class179 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "(I)V")
	@Override
	public final void method8055(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "(I)V")
	public final void method7100() {
		this.method7101(2, Static87.aClass265_9);
	}

	@OriginalMember(owner = "client!rr", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public final void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class53_Sub3 local6 = (Class53_Sub3) arg1;
		@Pc(9) Interface12 local9 = local6.anInterface12_5;
		this.method7134();
		this.method7129(local9);
		this.method7115(1);
		this.method7136(Static514.aClass266_6, Static514.aClass266_6);
		this.method7155(0, Static438.aClass179_14);
		this.method7160(arg0);
		this.aClass42_Sub3_15.method7532((float) this.anInt9092, (float) this.anInt8992, 0.0F);
		this.method7128();
		this.aClass42_Sub3Array3[0].method7532(local9.method2988((float) this.anInt9092), local9.method2994((float) this.anInt8992), 1.0F);
		this.aClass42_Sub3Array3[0].method7522(local9.method2988((float) -arg2), 0.0F, local9.method2994((float) -arg3));
		this.aClass51Array3[0] = Static130.aClass51_15;
		this.method7108();
		this.method7100();
		this.method7120();
		this.method7155(0, Static402.aClass179_23);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!pw;B)V")
	private void method7101(@OriginalArg(0) int arg0, @OriginalArg(1) Class265 arg1) {
		this.method7113(this.anInterface15_15, 0);
		this.method7149(this.aClass1_19);
		this.method7057(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "(I)V")
	protected abstract void method7102();

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "(Z)V")
	private void method7103() {
		this.method7113(this.anInterface15_14, 0);
		this.method7149(this.aClass1_20);
		this.method7057(1, 0, Static226.aClass265_7);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZIILclient!os;[BII)Lclient!mca;")
	protected abstract Interface12 method7104(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class245 arg3, @OriginalArg(5) byte[] arg4);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public final Class127 method8077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class127_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "(Z)V")
	private void method7105() {
		this.anInterface15_14 = this.method7132(true);
		this.anInterface15_14.method5277(24, 12);
		this.aClass1_20 = this.method7116(new Class90[] { new Class90(Static248.aClass156_1) });
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	protected abstract void method7106(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!rr", name = "D", descriptor = "(I)V")
	private void method7108() {
		this.method7065();
		if (this.aClass32_3 != null) {
			this.aClass32_3.method7457();
		}
	}

	@OriginalMember(owner = "client!rr", name = "E", descriptor = "(I)V")
	private void method7109() {
		this.method7056();
		this.method7090();
		this.method7163();
		this.method7095();
		this.method7114();
		this.method7073();
		this.method7081();
		this.method7184();
		this.method7066();
		this.method7153();
		this.method7055();
		this.method7145();
		this.method7172();
		this.method7102();
		for (@Pc(56) int local56 = this.anInt9123 - 1; local56 >= 0; local56--) {
			this.method7092(local56);
			this.method7050();
			this.method7121();
			this.method7120();
		}
		this.method7156();
		this.method7179();
		this.method7068();
		this.method7063();
		this.method7135();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([FI)[F")
	public final float[] method7110(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloatArray62[1];
		arg0[0] = this.aFloatArray62[0];
		arg0[8] = this.aFloatArray62[2];
		arg0[12] = this.aFloatArray62[3];
		arg0[1] = this.aFloatArray62[4];
		arg0[5] = this.aFloatArray62[5];
		arg0[2] = this.aFloatArray62[8];
		arg0[9] = this.aFloatArray62[6];
		arg0[13] = this.aFloatArray62[7];
		arg0[7] = this.aFloatArray62[13];
		arg0[3] = this.aFloatArray62[12];
		arg0[10] = this.aFloatArray62[10];
		arg0[6] = this.aFloatArray62[9];
		arg0[14] = this.aFloatArray62[11];
		arg0[15] = this.aFloatArray62[15];
		arg0[11] = this.aFloatArray62[14];
		return arg0;
	}

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "()Z")
	@Override
	public final boolean method8066() {
		return this.aBoolean613;
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(II)Lclient!ia;")
	protected Class32 method7111(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class32_Sub11(this);
		} else if (arg0 == 1) {
			return new Class32_Sub4(this);
		} else if (arg0 == 2) {
			return new Class32_Sub1(this, this.aClass318_8);
		} else if (arg0 == 7) {
			return new Class32_Sub9(this);
		} else {
			return new Class32_Sub10(this);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "()Z")
	@Override
	public final boolean method8018() {
		return false;
	}

	@OriginalMember(owner = "client!rr", name = "F", descriptor = "(I)V")
	private void method7112() {
		if (this.anInt9131 == 1) {
			return;
		}
		this.method7069();
		this.method7157(false);
		this.method7082(false);
		this.method7167(false);
		this.method7058(false);
		this.method7088(false, -2, false);
		this.method7141(1);
		this.method7129(this.anInterface24_3);
		this.anInt9131 = 1;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!og;II)V")
	public abstract void method7113(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rr", name = "la", descriptor = "(IIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9124 = arg2;
		this.anInt9119 = arg0;
		this.bf = arg3;
		this.anInt9142 = arg1;
		this.method7124();
		this.method7178();
		this.method7086();
		this.method7054();
	}

	@OriginalMember(owner = "client!rr", name = "G", descriptor = "(I)V")
	public abstract void method7114();

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)V")
	@Override
	public final void method8051(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(II)V")
	public final void method7115(@OriginalArg(1) int arg0) {
		if (this.anInt9140 == arg0) {
			return;
		}
		@Pc(16) Class363 local16;
		@Pc(18) boolean local18;
		@Pc(20) boolean local20;
		if (arg0 == 1) {
			local16 = Static519.aClass363_6;
			local18 = true;
			local20 = true;
		} else if (arg0 == 2) {
			local18 = true;
			local20 = false;
			local16 = Static362.aClass363_3;
		} else if (arg0 == 128) {
			local18 = true;
			local20 = true;
			local16 = Static548.aClass363_7;
		} else {
			local18 = false;
			local20 = false;
			local16 = Static455.aClass363_4;
		}
		if (this.aBoolean596 != local20) {
			this.aBoolean596 = local20;
			this.method7102();
		}
		if (local18 != this.aBoolean609) {
			this.aBoolean609 = local18;
			this.method7145();
		}
		if (this.aClass363_5 != local16) {
			this.aClass363_5 = local16;
			this.method7172();
		}
		this.anInt9140 = arg0;
		this.anInt9131 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B[Lclient!ej;)Lclient!qf;")
	public abstract Class1 method7116(@OriginalArg(1) Class90[] arg0);

	@OriginalMember(owner = "client!rr", name = "MA", descriptor = "(III[I)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass42_Sub3_16.method7533((float) arg2, (float) arg1, (float) arg0);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt9124 * this.aClass42_Sub3_16.method7537((float) arg1, (float) arg2, (float) arg0) / local14);
			local25 = (int) ((float) this.bf * this.aClass42_Sub3_16.method7542((float) arg1, (float) arg2, (float) arg0) / local14);
		} else {
			local25 = this.anInt9142;
			local28 = this.anInt9119;
		}
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local25 - this.aFloat200);
		arg3[0] = (int) ((float) local28 - this.aFloat196);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIF)Lclient!cp;")
	@Override
	public final Class3_Sub9 method8078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub9_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "(B)V")
	private void method7117() {
		if (this.aClass32_3 != null) {
			this.aClass32_3.method7450();
		}
		this.method7055();
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(BZ)V")
	public final void method7118(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean605) {
			this.aBoolean605 = arg0;
			this.method7081();
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(BI)Lclient!bo;")
	public final Interface2 method7119(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface2_6.method7278()) {
			this.anInterface2_6.method7282(arg0);
		}
		return this.anInterface2_6;
	}

	@OriginalMember(owner = "client!rr", name = "BA", descriptor = "()I")
	@Override
	public final int BA() {
		return this.anInt9127;
	}

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "(B)V")
	public final void method7120() {
		if (Static389.aClass51_16 != this.aClass51Array3[this.anInt9134]) {
			this.aClass51Array3[this.anInt9134] = Static389.aClass51_16;
			this.aClass42_Sub3Array3[this.anInt9134].Y();
			this.method7108();
		}
	}

	@OriginalMember(owner = "client!rr", name = "H", descriptor = "(I)V")
	protected abstract void method7121();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method8035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method7084();
		this.method7112();
		this.method7160(arg4);
		this.method7155(0, Static438.aClass179_14);
		this.method7185(Static438.aClass179_14, 0);
		this.method7115(arg5);
		this.aClass42_Sub3_15.method7532((float) (arg2 - 1), (float) (arg3 - 1), 1.0F);
		this.aClass42_Sub3_15.method7522((float) arg0 - local7, 0.0F, (float) arg1 - local7);
		this.method7128();
		this.method7162(false);
		this.method7101(4, Static569.aClass265_11);
		this.method7162(true);
		this.method7185(Static402.aClass179_23, 0);
		this.method7155(0, Static402.aClass179_23);
	}

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "(B)V")
	private void method7122() {
		if (this.aCanvas12 == null) {
			this.anInt8957 = this.anInt9027 = 1;
		} else {
			@Pc(16) Dimension local16 = this.aCanvas12.getSize();
			this.anInt9027 = local16.height;
			this.anInt8957 = local16.width;
		}
		this.anInt9092 = this.anInt8957;
		this.anInt8992 = this.anInt9027;
		this.method7165();
		this.method7178();
		this.method7124();
		this.method7179();
		this.method7054();
		this.method7086();
		this.JA();
	}

	@OriginalMember(owner = "client!rr", name = "I", descriptor = "(I)V")
	private void method7124() {
		this.aBoolean601 = false;
		this.method7072();
		if (Static74.aClass218_5 == this.aClass218_8) {
			this.method7159();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZILclient!os;I[FZ)Lclient!mca;")
	public final Interface12 method7125(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class245 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4) {
		return this.method7070(arg1, arg4, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!rr", name = "J", descriptor = "(I)I")
	public final int method7126() {
		return this.anInt9125;
	}

	@OriginalMember(owner = "client!rr", name = "K", descriptor = "(I)V")
	public final void method7127() {
		this.aClass266Array6 = new Class266[this.anInt9123];
		this.aClass51Array3 = new Class51[this.anInt9123];
		this.anInterface24Array3 = new Interface24[this.anInt9123];
		this.aClass42_Sub3Array3 = new Class42_Sub3[this.anInt9123];
		this.aClass266Array5 = new Class266[this.anInt9123];
		for (@Pc(32) int local32 = 0; local32 < this.anInt9123; local32++) {
			this.aClass266Array5[local32] = Static486.aClass266_5;
			this.aClass266Array6[local32] = Static486.aClass266_5;
			this.aClass51Array3[local32] = Static389.aClass51_16;
			this.aClass42_Sub3Array3[local32] = new Class42_Sub3();
		}
		this.aClass3_Sub9Array6 = new Class3_Sub9[this.anInt9126 - 2];
		this.anInterface24_3 = this.method7076(1, 1, Static331.aClass204_13, Static18.aClass245_3);
		this.method8064(new Class3_Sub8_Sub2(262144));
		this.aClass1_17 = this.method7116(new Class90[] { new Class90(new Class156[] { Static248.aClass156_1, Static248.aClass156_5 }) });
		this.aClass1_18 = this.method7116(new Class90[] { new Class90(new Class156[] { Static248.aClass156_1, Static248.aClass156_3 }) });
		this.aClass1_15 = this.method7116(new Class90[] { new Class90(Static248.aClass156_1), new Class90(Static248.aClass156_3), new Class90(Static248.aClass156_5), new Class90(Static248.aClass156_2) });
		this.aClass1_16 = this.method7116(new Class90[] { new Class90(Static248.aClass156_1), new Class90(Static248.aClass156_3), new Class90(Static248.aClass156_5) });
		this.aClass52_Sub1_27 = new Class52_Sub1(this, 0, 0, false, false);
		this.aClass52_Sub1_23 = new Class52_Sub1(this, 0, 0, true, true);
		this.aClass52_Sub1_30 = new Class52_Sub1(this, 0, 0, false, false);
		this.aClass52_Sub1_26 = new Class52_Sub1(this, 0, 0, true, true);
		this.aClass52_Sub1_24 = new Class52_Sub1(this, 0, 0, false, false);
		this.aClass52_Sub1_25 = new Class52_Sub1(this, 0, 0, true, true);
		this.aClass52_Sub1_21 = new Class52_Sub1(this, 0, 0, false, false);
		this.aClass52_Sub1_29 = new Class52_Sub1(this, 0, 0, true, true);
		this.aClass52_Sub1_28 = new Class52_Sub1(this, 0, 0, false, false);
		this.aClass52_Sub1_22 = new Class52_Sub1(this, 0, 0, true, true);
		this.aClass246_3 = new Class246(this);
		this.anInterface2_6 = this.method7158(true);
		this.method7166();
		this.aClass318_8 = new Class318(this);
		this.aClass32Array3[1] = this.method7111(1);
		this.aClass32Array3[2] = this.method7111(2);
		this.aClass32Array3[4] = this.method7111(4);
		this.aClass32Array3[5] = this.method7111(5);
		this.aClass32Array3[6] = this.method7111(6);
		this.aClass32Array3[7] = this.method7111(7);
		this.aClass32Array3[3] = this.method7111(3);
		this.aClass32Array3[8] = this.method7111(8);
		this.aClass32Array3[9] = this.method7111(9);
		if (!this.aClass32Array3[2].method7454()) {
			this.aClass32Array3[2] = this.method7111(0);
		}
		if (!this.aClass32Array3[4].method7454()) {
			this.aClass32Array3[4] = this.aClass32Array3[2];
		}
		if (!this.aClass32Array3[8].method7454()) {
			this.aClass32Array3[8] = this.aClass32Array3[4];
		}
		if (!this.aClass32Array3[9].method7454()) {
			this.aClass32Array3[9] = this.aClass32Array3[8];
		}
		this.method7091();
		this.JA();
		this.method8030();
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)V")
	@Override
	public final void method8048(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass132_3 != null) {
			this.aClass132_3.method3506();
		}
		this.anInt9120 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "L", descriptor = "(I)V")
	public final void method7128() {
		this.aBoolean595 = false;
		this.method7093();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!wq;I)V")
	public final void method7129(@OriginalArg(0) Interface24 arg0) {
		if (this.anInterface24Array3[this.anInt9134] == arg0) {
			return;
		}
		this.anInterface24Array3[this.anInt9134] = arg0;
		if (arg0 == null) {
			this.method7131();
		} else {
			arg0.method7712();
		}
		this.anInt9131 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!rr", name = "M", descriptor = "(I)I")
	public final int method7130() {
		return this.anInt9141;
	}

	@OriginalMember(owner = "client!rr", name = "N", descriptor = "(I)V")
	protected abstract void method7131();

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(ZI)Lclient!og;")
	public abstract Interface15 method7132(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method8081() {
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(BZ)V")
	public final void method7133(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean598 != arg0) {
			this.aBoolean598 = arg0;
			this.method7163();
		}
	}

	@OriginalMember(owner = "client!rr", name = "O", descriptor = "(I)V")
	public final void method7134() {
		if (this.anInt9131 == 2) {
			return;
		}
		this.method7069();
		this.method7157(false);
		this.method7082(false);
		this.method7167(false);
		this.method7058(false);
		this.method7088(false, -2, false);
		this.anInt9131 = 2;
	}

	@OriginalMember(owner = "client!rr", name = "P", descriptor = "(I)V")
	protected abstract void method7135();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!qaa;ILclient!qaa;)V")
	public final void method7136(@OriginalArg(0) Class266 arg0, @OriginalArg(2) Class266 arg1) {
		@Pc(5) boolean local5 = false;
		if (this.aClass266Array6[this.anInt9134] != arg1) {
			this.aClass266Array6[this.anInt9134] = arg1;
			local5 = true;
			this.method7050();
		}
		if (this.aClass266Array5[this.anInt9134] != arg0) {
			this.aClass266Array5[this.anInt9134] = arg0;
			local5 = true;
			this.method7121();
		}
		if (local5) {
			this.anInt9131 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!rr", name = "YA", descriptor = "(IIII)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean600) {
			throw new RuntimeException("");
		}
		this.anInt9139 = arg2;
		this.anInt9128 = arg3;
		this.anInt9141 = arg0;
		this.anInt9125 = arg1;
		if (this.aBoolean602) {
			this.aClass32Array3[3].method7452();
			this.aClass32Array3[3].method7450();
		}
	}

	@OriginalMember(owner = "client!rr", name = "Q", descriptor = "(I)V")
	private void method7137() {
		this.aFloat190 = this.anInt9129;
	}

	@OriginalMember(owner = "client!rr", name = "R", descriptor = "(I)I")
	public final int method7138() {
		return this.anInt9134;
	}

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "(B)V")
	public final void method7139() {
		if (this.anInt9131 == 8) {
			return;
		}
		this.method7052();
		this.method7157(true);
		this.method7167(true);
		this.method7058(true);
		this.method7115(1);
		this.anInt9131 = 8;
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8076(@OriginalArg(0) Canvas arg0) {
		this.aCanvas12 = null;
		this.anObject18 = null;
		if (arg0 == null || arg0 == this.aCanvas11) {
			this.aCanvas12 = this.aCanvas11;
			this.anObject18 = this.anObject17;
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.anObject18 = this.aHashtable7.get(arg0);
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.anObject18 == null) {
			throw new RuntimeException();
		}
		this.method7106(this.aCanvas12, this.anObject18);
		this.method7122();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IF)V")
	public final void method7140(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat202) {
			this.aFloat202 = arg0;
			this.method7124();
		}
	}

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "(II)V")
	public final void method7141(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method7136(Static514.aClass266_6, Static514.aClass266_6);
		} else if (arg0 == 0) {
			this.method7136(Static486.aClass266_5, Static486.aClass266_5);
		} else if (arg0 == 2) {
			this.method7136(Static514.aClass266_6, Static336.aClass266_4);
		} else if (arg0 == 3) {
			this.method7136(Static486.aClass266_5, Static438.aClass266_2);
		} else if (arg0 == 4) {
			this.method7136(Static245.aClass266_3, Static245.aClass266_3);
		}
	}

	@OriginalMember(owner = "client!rr", name = "ZA", descriptor = "(Z)V")
	@Override
	public final void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean607 = arg0;
		this.method7066();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method7142(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "()Z")
	@Override
	public final boolean method8054() {
		return true;
	}

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "(Z)I")
	public final int method7143() {
		return this.anInt9139;
	}

	@OriginalMember(owner = "client!rr", name = "S", descriptor = "(I)V")
	protected abstract void method7144();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!tt;I)V")
	@Override
	public final void method8070(@OriginalArg(0) Class323 arg0, @OriginalArg(1) int arg1) {
		this.aClass246_3.method5585(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "(B)V")
	protected abstract void method7145();

	@OriginalMember(owner = "client!rr", name = "J", descriptor = "(IIIIII)V")
	@Override
	public final void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7112();
		this.method7160(arg4);
		this.method7155(0, Static438.aClass179_14);
		this.method7185(Static438.aClass179_14, 0);
		this.method7115(arg5);
		this.aClass42_Sub3_15.method7532((float) arg2, (float) arg3, 1.0F);
		this.aClass42_Sub3_15.U(arg0, arg1, 0);
		this.method7128();
		this.method7162(false);
		this.method7100();
		this.method7162(true);
		this.method7185(Static402.aClass179_23, 0);
		this.method7155(0, Static402.aClass179_23);
	}

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "(B)Lclient!ur;")
	public final Class42_Sub3 method7146() {
		return this.aClass42_Sub3Array3[this.anInt9134];
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[Lclient!cp;)V")
	@Override
	public final void method8038(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub9[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub9Array6[local7] = arg1[local7];
		}
		this.anInt9121 = arg0;
		if (this.aClass218_8.method5025()) {
			this.method7095();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V")
	@Override
	public final void method8045(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!os;Lclient!mg;B)Z")
	public abstract boolean method7147(@OriginalArg(0) Class245 arg0, @OriginalArg(1) Class204 arg1);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	@Override
	public void method8024(@OriginalArg(0) int arg0) {
		if (this.aClass132_3 != null) {
			this.aClass132_3.method3507();
		}
		this.anInt9105 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!dd;)V")
	@Override
	public final void method8068(@OriginalArg(0) Class47 arg0) {
		this.aClass47_Sub1_3 = (Class47_Sub1) arg0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!qf;)V")
	public abstract void method7149(@OriginalArg(1) Class1 arg0);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!tt;)V")
	@Override
	public final void method8090(@OriginalArg(0) Class323 arg0) {
		this.aClass246_3.method5585(arg0, this, -1);
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)Lclient!e;")
	@Override
	public final Class3_Sub8 method8036(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub8_Sub2 local8 = new Class3_Sub8_Sub2(arg0);
		this.aClass244_63.method5570(local8);
		return local8;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method7150(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap6.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!ufa;[Lclient!wt;Z)Lclient!la;")
	@Override
	public final Class63 method8027(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class365[] arg1) {
		return new Class63_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "()Z")
	@Override
	public final boolean method8069() {
		return true;
	}

	@OriginalMember(owner = "client!rr", name = "T", descriptor = "(I)[F")
	public final float[] method7151() {
		return this.aFloatArray60;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!os;I[BII)Lclient!qw;")
	public abstract Interface19 method7152(@OriginalArg(1) Class245 arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "(B)V")
	protected abstract void method7153();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public final void method8064(@OriginalArg(0) Class3_Sub8 arg0) {
		this.aNativeHeap6 = ((Class3_Sub8_Sub2) arg0).aNativeHeap5;
		this.aNativeHeapBuffer7 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;B)Lclient!jaclib/memory/Stream;")
	public final Stream method7154(@OriginalArg(0) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!rr", name = "pa", descriptor = "(III)V")
	@Override
	public final void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt9133 && this.anInt9110 == arg1 && this.anInt9106 == arg2) {
			return;
		}
		this.anInt9110 = arg1;
		this.anInt9133 = arg0;
		this.anInt9106 = arg2;
		this.method7117();
		this.method7153();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BILclient!ko;)V")
	public final void method7155(@OriginalArg(1) int arg0, @OriginalArg(2) Class179 arg1) {
		this.method7083(arg1, arg0, false, false);
	}

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "(Z)V")
	protected abstract void method7156();

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(BZ)V")
	public final void method7157(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean611 != arg0) {
			this.aBoolean611 = arg0;
			this.method7153();
			this.anInt9131 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rr", name = "oa", descriptor = "([I)V")
	@Override
	public final void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9107;
		arg0[1] = this.anInt9117;
		arg0[2] = this.anInt9113;
		arg0[3] = this.anInt9111;
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(ZI)Lclient!bo;")
	public abstract Interface2 method7158(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "(B)V")
	private void method7159() {
		this.method7068();
		if (this.aClass32_3 != null) {
			this.aClass32_3.method7455();
		}
	}

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "(II)V")
	public final void method7160(@OriginalArg(1) int arg0) {
		if (this.anInt9109 != arg0) {
			this.anInt9109 = arg0;
			this.method7156();
		}
	}

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "()Z")
	@Override
	public final boolean method8037() {
		return false;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!cf;I)V")
	public final void method7161(@OriginalArg(0) Class51 arg0) {
		this.aClass51Array3[this.anInt9134] = arg0;
		this.method7108();
	}

	@OriginalMember(owner = "client!rr", name = "va", descriptor = "(I)V")
	@Override
	public final void va(@OriginalArg(0) int arg0) {
		this.anInt9130 = 0;
		while (arg0 > 1) {
			this.anInt9130++;
			arg0 >>= 0x1;
		}
		this.anInt9136 = 0x1 << this.anInt9130;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V")
	public abstract void method7162(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!rr", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt9144;
	}

	@OriginalMember(owner = "client!rr", name = "U", descriptor = "(I)V")
	protected abstract void method7163();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!ur;I)V")
	public final void method7164(@OriginalArg(0) Class42_Sub3 arg0) {
		this.aClass42_Sub3_15.M(arg0);
		this.aBoolean595 = false;
		this.method7093();
	}

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "()Z")
	@Override
	public final boolean method8047() {
		return false;
	}

	@OriginalMember(owner = "client!rr", name = "V", descriptor = "(I)V")
	private void method7165() {
		this.aBoolean599 = false;
		if (this.aClass218_8 == Static291.aClass218_7) {
			this.method7180();
			this.method7159();
		}
	}

	@OriginalMember(owner = "client!rr", name = "W", descriptor = "(I)V")
	protected final void method7166() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable7 != null && !this.aHashtable7.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable7.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method7142(local26));
			}
		}
		this.aHashtable7 = local9;
		this.method7173();
		this.method7105();
		this.aClass246_3.method5590(this);
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(ZI)V")
	public final void method7167(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean597 != arg0) {
			this.aBoolean597 = arg0;
			this.method7184();
			this.anInt9131 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "()I")
	@Override
	public final int method8026() {
		return this.anInt9126 - 2;
	}

	@OriginalMember(owner = "client!rr", name = "X", descriptor = "(I)Lclient!ur;")
	public final Class42_Sub3 method7168() {
		return this.aClass42_Sub3_15;
	}

	@OriginalMember(owner = "client!rr", name = "Y", descriptor = "(I)V")
	private void method7169() {
		if (this.aBoolean604) {
			return;
		}
		@Pc(11) float[] local11 = this.aFloatArray61;
		@Pc(23) float local23 = (float) (this.anInt9127 * -this.anInt9119) / (float) this.anInt9124;
		@Pc(38) float local38 = (float) ((this.anInt9092 - this.anInt9119) * this.anInt9127) / (float) this.anInt9124;
		@Pc(49) float local49 = (float) (this.anInt9127 * this.anInt9142) / (float) this.bf;
		@Pc(63) float local63 = (float) (this.anInt9127 * (this.anInt9142 - this.anInt8992)) / (float) this.bf;
		if (local38 == local23 || local49 == local63) {
			local11[9] = 0.0F;
			local11[7] = 0.0F;
			local11[4] = 0.0F;
			local11[13] = 0.0F;
			local11[10] = 1.0F;
			local11[15] = 1.0F;
			local11[8] = 0.0F;
			local11[6] = 0.0F;
			local11[5] = 1.0F;
			local11[11] = 0.0F;
			local11[3] = 0.0F;
			local11[14] = 0.0F;
			local11[1] = 0.0F;
			local11[2] = 0.0F;
			local11[0] = 1.0F;
			local11[12] = 0.0F;
		} else {
			@Pc(77) float local77 = (float) this.anInt9127 * 2.0F;
			local11[7] = 0.0F;
			local11[13] = 0.0F;
			local11[1] = 0.0F;
			local11[4] = 0.0F;
			local11[15] = 0.0F;
			local11[12] = 0.0F;
			local11[14] = this.aFloat197 = (float) (this.anInt9129 * this.anInt9127) / (float) (this.anInt9127 - this.anInt9129);
			local11[6] = 0.0F;
			local11[3] = 0.0F;
			local11[11] = -1.0F;
			local11[2] = 0.0F;
			local11[0] = local77 / (local38 - local23);
			local11[10] = this.aFloat204 = (float) this.anInt9129 / (float) (this.anInt9127 - this.anInt9129);
			local11[9] = (local63 + local49) / (local49 - local63);
			local11[5] = local77 / (local49 - local63);
			local11[8] = (local38 + local23) / (local38 - local23);
		}
		this.method7062();
		this.aBoolean604 = true;
	}

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "(B)V")
	protected abstract void method7170();

	@OriginalMember(owner = "client!rr", name = "Z", descriptor = "(I)Lclient!ur;")
	public final Class42_Sub3 method7171() {
		return this.aClass42_Sub3_18;
	}

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "(B)V")
	protected abstract void method7172();

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "()Lclient!q;")
	@Override
	public final Class42 method8075() {
		return this.aClass42_Sub3_16;
	}

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "(B)V")
	private void method7173() {
		this.anInterface15_15 = this.method7132(false);
		this.anInterface15_15.method5277(140, 28);
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(30) Buffer local30 = this.anInterface15_15.method5275();
			if (local30 != null) {
				@Pc(37) Stream local37 = this.method7154(local30);
				if (Stream.a()) {
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
				} else {
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
				}
				local37.c();
				if (this.anInterface15_15.method5276()) {
					break;
				}
			}
		}
		this.aClass1_19 = this.method7116(new Class90[] { new Class90(new Class156[] { Static248.aClass156_1, Static248.aClass156_5, Static248.aClass156_5 }) });
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!pw;ILclient!bo;IIII)V")
	public abstract void method7174(@OriginalArg(0) Class265 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(BZ)V")
	public final void method7175(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean606) {
			this.aBoolean606 = arg0;
			this.method7153();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!wt;Z)Lclient!f;")
	@Override
	public final Class73 method8086(@OriginalArg(0) Class365 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(131) Class73 local131;
		if (arg0.anInt10318 == 0 || arg0.anInt10320 == 0) {
			local131 = this.method8033(new int[1], 1, 1, 1);
		} else {
			@Pc(21) int[] local21 = new int[arg0.anInt10318 * arg0.anInt10320];
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg0.aByteArray247 == null) {
				for (local30 = 0; local30 < arg0.anInt10320; local30++) {
					for (local34 = 0; local34 < arg0.anInt10318; local34++) {
						@Pc(47) int local47 = arg0.anIntArray601[arg0.aByteArray246[local23++] & 0xFF];
						local21[local25++] = local47 == 0 ? 0 : local47 | 0xFF000000;
					}
				}
			} else {
				for (local30 = 0; local30 < arg0.anInt10320; local30++) {
					for (local34 = 0; local34 < arg0.anInt10318; local34++) {
						local21[local25++] = arg0.anIntArray601[arg0.aByteArray246[local23] & 0xFF] | arg0.aByteArray247[local23] << 24;
						local23++;
					}
				}
			}
			local131 = this.method8033(local21, arg0.anInt10318, arg0.anInt10318, arg0.anInt10320);
		}
		local131.Q(arg0.anInt10316, arg0.anInt10321, arg0.anInt10317, arg0.anInt10319);
		return local131;
	}

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "(II)V")
	public abstract void method7176(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rr", name = "ab", descriptor = "(I)V")
	protected abstract void method7177();

	@OriginalMember(owner = "client!rr", name = "L", descriptor = "()V")
	@Override
	public final void L() {
		this.aBoolean600 = false;
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8060(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas11 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.method7183(arg0, this.aHashtable7.get(arg0));
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public final void method8056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class53 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method8059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		if (local9 == 0.0F && local16 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(41) float local41 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local9 * local9)));
			local9 *= local41;
			local16 *= local41;
		}
		if (!this.method7064(local9 + (float) arg2, (float) arg0, (float) arg1, (float) arg3 + local16, 0.0F, 0.0F)) {
			return;
		}
		this.method7112();
		this.method7160(arg4);
		this.method7155(0, Static438.aClass179_14);
		this.method7185(Static438.aClass179_14, 0);
		this.method7115(arg5);
		this.method7060();
		this.method7162(false);
		this.method7103();
		this.method7162(true);
		this.method7185(Static402.aClass179_23, 0);
		this.method7155(0, Static402.aClass179_23);
	}

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "(B)V")
	private void method7178() {
		this.aBoolean604 = false;
		this.method7169();
		if (this.aClass218_8 == Static32.aClass218_6) {
			this.method7159();
		}
	}

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "(Z)V")
	protected abstract void method7179();

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "(Z)V")
	private void method7180() {
		if (this.aBoolean599) {
			return;
		}
		@Pc(18) float[] local18 = this.aFloatArray59;
		this.aBoolean599 = true;
		if (this.anInt9092 != 0 && this.anInt8992 != 0) {
			local18[11] = 0.0F;
			local18[15] = 1.0F;
			local18[0] = 2.0F / (float) this.anInt9092;
			local18[10] = 0.5F;
			local18[13] = 1.0F;
			local18[5] = -2.0F / (float) this.anInt8992;
			local18[2] = 0.0F;
			local18[14] = 0.5F;
			local18[1] = 0.0F;
			local18[7] = 0.0F;
			local18[3] = 0.0F;
			local18[9] = 0.0F;
			local18[6] = 0.0F;
			local18[4] = 0.0F;
			local18[8] = 0.0F;
			local18[12] = -1.0F;
			return;
		}
		local18[13] = 0.0F;
		local18[12] = 0.0F;
		local18[7] = 0.0F;
		local18[4] = 0.0F;
		local18[3] = 0.0F;
		local18[9] = 0.0F;
		local18[14] = 0.0F;
		local18[10] = 1.0F;
		local18[2] = 0.0F;
		local18[0] = 1.0F;
		local18[6] = 0.0F;
		local18[11] = 0.0F;
		local18[8] = 0.0F;
		local18[1] = 0.0F;
		local18[15] = 1.0F;
		local18[5] = 1.0F;
	}

	@OriginalMember(owner = "client!rr", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public final void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt9108;
		if (local15 || arg1 != this.aFloat195 || arg2 != this.aFloat205) {
			this.aFloat195 = arg1;
			this.anInt9108 = arg0;
			this.aFloat205 = arg2;
			if (local15) {
				this.aFloat201 = (float) (this.anInt9108 & 0xFF00) / 65280.0F;
				this.aFloat189 = (float) (this.anInt9108 & 0xFF0000) / 1.671168E7F;
				this.aFloat193 = (float) (this.anInt9108 & 0xFF) / 255.0F;
				this.method7056();
			}
			this.aNativeInterface3.setSunColour(this.aFloat189, this.aFloat201, this.aFloat193, arg1, arg2);
			this.method7090();
		}
		if (this.aFloatArray65[0] != arg3 || this.aFloatArray65[1] != arg4 || arg5 != this.aFloatArray65[2]) {
			this.aFloatArray65[1] = arg4;
			this.aFloatArray65[0] = arg3;
			this.aFloatArray65[2] = arg5;
			this.aFloatArray63[1] = -arg4;
			this.aFloatArray63[2] = -arg5;
			this.aFloatArray63[0] = -arg3;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray67[1] = local153 * arg4;
			this.aFloatArray67[0] = arg3 * local153;
			this.aFloatArray67[2] = local153 * arg5;
			this.aFloatArray66[0] = -this.aFloatArray67[0];
			this.aFloatArray66[1] = -this.aFloatArray67[1];
			this.aFloatArray66[2] = -this.aFloatArray67[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray67[0], this.aFloatArray67[1], this.aFloatArray67[2]);
			this.method7114();
			this.anInt9118 = (int) (arg5 * 256.0F / arg4);
			this.anInt9143 = (int) (arg3 * 256.0F / arg4);
		}
		this.method7073();
	}

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "()Lclient!q;")
	@Override
	public final Class42 method8031() {
		return new Class42_Sub3();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([IIZIIII)Lclient!mca;")
	public abstract Interface12 method7181(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt9099 + this.anInt9103 + this.anInt9102;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!uo;IIII)Lclient!da;")
	@Override
	public final Class52 method8046(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class52_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "(B)Lclient!ur;")
	public final Class42_Sub3 method7182() {
		if (!this.aBoolean615) {
			this.aClass42_Sub3_20.method7534(this.aClass42_Sub3_18, this.aClass42_Sub3_15);
			this.aBoolean615 = true;
		}
		return this.aClass42_Sub3_20;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method7183(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "()Z")
	@Override
	public final boolean method8028() {
		return true;
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(IIIIII)Lclient!dd;")
	@Override
	public final Class47 method8083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class47_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rr", name = "bb", descriptor = "(I)V")
	protected abstract void method7184();

	@OriginalMember(owner = "client!rr", name = "AA", descriptor = "(III[I)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass42_Sub3_16.method7533((float) arg2, (float) arg1, (float) arg0);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt9124 * this.aClass42_Sub3_16.method7537((float) arg1, (float) arg2, (float) arg0) / local14);
			local25 = (int) ((float) this.bf * this.aClass42_Sub3_16.method7542((float) arg1, (float) arg2, (float) arg0) / local14);
		} else {
			local25 = this.anInt9142;
			local28 = this.anInt9119;
		}
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local28 - this.aFloat196);
		arg3[1] = (int) ((float) local25 - this.aFloat200);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8019(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas11) {
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
			@Pc(53) Object local53 = this.method7142(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!ko;II)V")
	public final void method7185(@OriginalArg(0) Class179 arg0, @OriginalArg(1) int arg1) {
		this.method7099(arg0, arg1);
	}
}
