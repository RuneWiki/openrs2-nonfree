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

@OriginalClass("client!qq")
public abstract class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!qq", name = "kb", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable6;

	@OriginalMember(owner = "client!qq", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!qq", name = "Zb", descriptor = "Lclient!ln;")
	protected Class204 aClass204_7;

	@OriginalMember(owner = "client!qq", name = "Cc", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!qq", name = "od", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!qq", name = "Wd", descriptor = "I")
	public int anInt7515;

	@OriginalMember(owner = "client!qq", name = "Xd", descriptor = "I")
	public int anInt7516;

	@OriginalMember(owner = "client!qq", name = "Zd", descriptor = "I")
	protected int anInt7518;

	@OriginalMember(owner = "client!qq", name = "ge", descriptor = "I")
	protected int anInt7519;

	@OriginalMember(owner = "client!qq", name = "he", descriptor = "Lclient!ik;")
	private Class36_Sub1 aClass36_Sub1_3;

	@OriginalMember(owner = "client!qq", name = "le", descriptor = "I")
	protected int anInt7521;

	@OriginalMember(owner = "client!qq", name = "oe", descriptor = "Lclient!ot;")
	public Interface18 anInterface18_3;

	@OriginalMember(owner = "client!qq", name = "se", descriptor = "F")
	private float aFloat184;

	@OriginalMember(owner = "client!qq", name = "te", descriptor = "Z")
	public boolean aBoolean531;

	@OriginalMember(owner = "client!qq", name = "we", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!qq", name = "ye", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!qq", name = "Ce", descriptor = "[Lclient!ot;")
	private Interface18[] anInterface18Array3;

	@OriginalMember(owner = "client!qq", name = "Ee", descriptor = "Z")
	protected boolean aBoolean533;

	@OriginalMember(owner = "client!qq", name = "He", descriptor = "Z")
	protected boolean aBoolean536;

	@OriginalMember(owner = "client!qq", name = "Ie", descriptor = "Z")
	public boolean aBoolean537;

	@OriginalMember(owner = "client!qq", name = "Je", descriptor = "F")
	private float aFloat187;

	@OriginalMember(owner = "client!qq", name = "Ke", descriptor = "I")
	private int anInt7528;

	@OriginalMember(owner = "client!qq", name = "Me", descriptor = "I")
	private int anInt7530;

	@OriginalMember(owner = "client!qq", name = "Te", descriptor = "Lclient!hm;")
	private Class139 aClass139_3;

	@OriginalMember(owner = "client!qq", name = "Ue", descriptor = "I")
	public int anInt7533;

	@OriginalMember(owner = "client!qq", name = "We", descriptor = "I")
	protected int anInt7534;

	@OriginalMember(owner = "client!qq", name = "Ze", descriptor = "I")
	public int anInt7536;

	@OriginalMember(owner = "client!qq", name = "ef", descriptor = "Lclient!ft;")
	private Class3 aClass3_3;

	@OriginalMember(owner = "client!qq", name = "gf", descriptor = "I")
	protected int anInt7537;

	@OriginalMember(owner = "client!qq", name = "kf", descriptor = "[Lclient!qea;")
	protected Class1_Sub5[] aClass1_Sub5Array6;

	@OriginalMember(owner = "client!qq", name = "tf", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!qq", name = "uf", descriptor = "[Lclient!fv;")
	protected Class108[] aClass108Array5;

	@OriginalMember(owner = "client!qq", name = "xf", descriptor = "I")
	public int anInt7542;

	@OriginalMember(owner = "client!qq", name = "yf", descriptor = "[Lclient!sj;")
	protected Class296[] aClass296Array3;

	@OriginalMember(owner = "client!qq", name = "Af", descriptor = "Z")
	public boolean aBoolean544;

	@OriginalMember(owner = "client!qq", name = "Df", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!qq", name = "Hf", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!qq", name = "Jf", descriptor = "I")
	public int anInt7549;

	@OriginalMember(owner = "client!qq", name = "Qf", descriptor = "[Lclient!fv;")
	protected Class108[] aClass108Array6;

	@OriginalMember(owner = "client!qq", name = "Yf", descriptor = "[Lclient!mh;")
	protected Class209_Sub2[] aClass209_Sub2Array3;

	@OriginalMember(owner = "client!qq", name = "ag", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!qq", name = "eg", descriptor = "Lclient!wr;")
	private Interface24 anInterface24_13;

	@OriginalMember(owner = "client!qq", name = "fg", descriptor = "Lclient!dw;")
	public Class61_Sub1 aClass61_Sub1_21;

	@OriginalMember(owner = "client!qq", name = "gg", descriptor = "Lclient!um;")
	public Class331 aClass331_15;

	@OriginalMember(owner = "client!qq", name = "hg", descriptor = "Lclient!dw;")
	public Class61_Sub1 aClass61_Sub1_22;

	@OriginalMember(owner = "client!qq", name = "ig", descriptor = "Lclient!um;")
	private Class331 aClass331_16;

	@OriginalMember(owner = "client!qq", name = "jg", descriptor = "Lclient!dw;")
	public Class61_Sub1 aClass61_Sub1_23;

	@OriginalMember(owner = "client!qq", name = "kg", descriptor = "Lclient!um;")
	private Class331 aClass331_17;

	@OriginalMember(owner = "client!qq", name = "lg", descriptor = "Lclient!wr;")
	private Interface24 anInterface24_14;

	@OriginalMember(owner = "client!qq", name = "mg", descriptor = "Lclient!um;")
	public Class331 aClass331_18;

	@OriginalMember(owner = "client!qq", name = "ng", descriptor = "Lclient!dw;")
	public Class61_Sub1 aClass61_Sub1_24;

	@OriginalMember(owner = "client!qq", name = "og", descriptor = "Lclient!dw;")
	public Class61_Sub1 aClass61_Sub1_25;

	@OriginalMember(owner = "client!qq", name = "pg", descriptor = "Lclient!dw;")
	public Class61_Sub1 aClass61_Sub1_26;

	@OriginalMember(owner = "client!qq", name = "qg", descriptor = "Lclient!kga;")
	private Interface13 anInterface13_7;

	@OriginalMember(owner = "client!qq", name = "rg", descriptor = "Lclient!um;")
	public Class331 aClass331_19;

	@OriginalMember(owner = "client!qq", name = "sg", descriptor = "Lclient!dw;")
	public Class61_Sub1 aClass61_Sub1_27;

	@OriginalMember(owner = "client!qq", name = "tg", descriptor = "Lclient!dw;")
	public Class61_Sub1 aClass61_Sub1_28;

	@OriginalMember(owner = "client!qq", name = "ug", descriptor = "Lclient!dw;")
	public Class61_Sub1 aClass61_Sub1_29;

	@OriginalMember(owner = "client!qq", name = "vg", descriptor = "Lclient!dw;")
	public Class61_Sub1 aClass61_Sub1_30;

	@OriginalMember(owner = "client!qq", name = "wg", descriptor = "Lclient!um;")
	public Class331 aClass331_20;

	@OriginalMember(owner = "client!qq", name = "xg", descriptor = "I")
	private int anInt7558;

	@OriginalMember(owner = "client!qq", name = "yg", descriptor = "Z")
	protected boolean aBoolean548;

	@OriginalMember(owner = "client!qq", name = "vc", descriptor = "Lclient!wo;")
	private final Class361 aClass361_80 = new Class361();

	@OriginalMember(owner = "client!qq", name = "Td", descriptor = "Z")
	protected boolean aBoolean527 = true;

	@OriginalMember(owner = "client!qq", name = "Vd", descriptor = "Lclient!mh;")
	protected final Class209_Sub2 aClass209_Sub2_15 = new Class209_Sub2();

	@OriginalMember(owner = "client!qq", name = "ae", descriptor = "Lclient!mh;")
	public Class209_Sub2 aClass209_Sub2_16 = new Class209_Sub2();

	@OriginalMember(owner = "client!qq", name = "be", descriptor = "Lclient!mh;")
	public final Class209_Sub2 aClass209_Sub2_17 = new Class209_Sub2();

	@OriginalMember(owner = "client!qq", name = "ce", descriptor = "Lclient!mh;")
	protected final Class209_Sub2 aClass209_Sub2_18 = new Class209_Sub2();

	@OriginalMember(owner = "client!qq", name = "de", descriptor = "Lclient!mh;")
	private final Class209_Sub2 aClass209_Sub2_19 = new Class209_Sub2();

	@OriginalMember(owner = "client!qq", name = "ee", descriptor = "Lclient!mh;")
	private final Class209_Sub2 aClass209_Sub2_20 = new Class209_Sub2();

	@OriginalMember(owner = "client!qq", name = "re", descriptor = "I")
	private int anInt7523 = -1;

	@OriginalMember(owner = "client!qq", name = "ve", descriptor = "I")
	public int anInt7524 = 128;

	@OriginalMember(owner = "client!qq", name = "Oe", descriptor = "Z")
	protected boolean aBoolean539 = true;

	@OriginalMember(owner = "client!qq", name = "Be", descriptor = "I")
	public int anInt7527 = 512;

	@OriginalMember(owner = "client!qq", name = "qe", descriptor = "Z")
	private boolean aBoolean530 = false;

	@OriginalMember(owner = "client!qq", name = "ue", descriptor = "[F")
	private final float[] aFloatArray57 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!qq", name = "je", descriptor = "I")
	public int anInt7520 = 0;

	@OriginalMember(owner = "client!qq", name = "bf", descriptor = "I")
	protected int bf = 3584;

	@OriginalMember(owner = "client!qq", name = "ff", descriptor = "[F")
	private final float[] aFloatArray60 = new float[16];

	@OriginalMember(owner = "client!qq", name = "ie", descriptor = "F")
	public float aFloat182 = 3584.0F;

	@OriginalMember(owner = "client!qq", name = "Le", descriptor = "I")
	private int anInt7529 = -1;

	@OriginalMember(owner = "client!qq", name = "Ve", descriptor = "[F")
	private final float[] aFloatArray59 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!qq", name = "lf", descriptor = "I")
	private int anInt7538 = 0;

	@OriginalMember(owner = "client!qq", name = "ze", descriptor = "I")
	private int anInt7526 = 0;

	@OriginalMember(owner = "client!qq", name = "Qe", descriptor = "Z")
	private boolean aBoolean540 = false;

	@OriginalMember(owner = "client!qq", name = "qf", descriptor = "F")
	public float aFloat191 = -1.0F;

	@OriginalMember(owner = "client!qq", name = "rf", descriptor = "[F")
	public final float[] aFloatArray62 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!qq", name = "mf", descriptor = "I")
	private int anInt7539 = 1;

	@OriginalMember(owner = "client!qq", name = "pe", descriptor = "Z")
	private boolean aBoolean529 = false;

	@OriginalMember(owner = "client!qq", name = "sf", descriptor = "I")
	protected int anInt7541 = 0;

	@OriginalMember(owner = "client!qq", name = "Pe", descriptor = "I")
	protected int anInt7531 = 0;

	@OriginalMember(owner = "client!qq", name = "Xe", descriptor = "I")
	public int anInt7535 = 0;

	@OriginalMember(owner = "client!qq", name = "Ne", descriptor = "Z")
	private boolean aBoolean538 = false;

	@OriginalMember(owner = "client!qq", name = "De", descriptor = "[F")
	private final float[] aFloatArray58 = new float[16];

	@OriginalMember(owner = "client!qq", name = "nf", descriptor = "Lclient!uda;")
	protected Class325 aClass325_6 = Static592.aClass325_8;

	@OriginalMember(owner = "client!qq", name = "Se", descriptor = "I")
	public int anInt7532 = 50;

	@OriginalMember(owner = "client!qq", name = "cf", descriptor = "F")
	public float aFloat189 = 3584.0F;

	@OriginalMember(owner = "client!qq", name = "Re", descriptor = "Z")
	private boolean aBoolean541 = false;

	@OriginalMember(owner = "client!qq", name = "Ef", descriptor = "I")
	public int anInt7546 = 512;

	@OriginalMember(owner = "client!qq", name = "Bf", descriptor = "I")
	private int anInt7544 = 0;

	@OriginalMember(owner = "client!qq", name = "af", descriptor = "F")
	public float aFloat188 = 1.0F;

	@OriginalMember(owner = "client!qq", name = "Gf", descriptor = "F")
	public float aFloat195 = 1.0F;

	@OriginalMember(owner = "client!qq", name = "Ae", descriptor = "Z")
	protected boolean aBoolean532 = false;

	@OriginalMember(owner = "client!qq", name = "If", descriptor = "I")
	protected int anInt7548 = 0;

	@OriginalMember(owner = "client!qq", name = "ne", descriptor = "I")
	protected final int anInt7522 = 0;

	@OriginalMember(owner = "client!qq", name = "Ff", descriptor = "I")
	protected int anInt7547 = 0;

	@OriginalMember(owner = "client!qq", name = "of", descriptor = "I")
	public int anInt7540 = 3;

	@OriginalMember(owner = "client!qq", name = "jf", descriptor = "Z")
	protected boolean aBoolean543 = false;

	@OriginalMember(owner = "client!qq", name = "Ge", descriptor = "Z")
	protected boolean aBoolean535 = false;

	@OriginalMember(owner = "client!qq", name = "Ye", descriptor = "Z")
	private boolean aBoolean542 = false;

	@OriginalMember(owner = "client!qq", name = "Pf", descriptor = "F")
	public float aFloat197 = 1.0F;

	@OriginalMember(owner = "client!qq", name = "Mf", descriptor = "I")
	public int anInt7552 = -1;

	@OriginalMember(owner = "client!qq", name = "Nf", descriptor = "I")
	public int anInt7553 = 0;

	@OriginalMember(owner = "client!qq", name = "Lf", descriptor = "I")
	private int anInt7551 = -1;

	@OriginalMember(owner = "client!qq", name = "Vf", descriptor = "I")
	public int anInt7555 = -1;

	@OriginalMember(owner = "client!qq", name = "hf", descriptor = "[F")
	protected float[] aFloatArray61 = this.aFloatArray57;

	@OriginalMember(owner = "client!qq", name = "Fe", descriptor = "Z")
	protected boolean aBoolean534 = true;

	@OriginalMember(owner = "client!qq", name = "Sf", descriptor = "[F")
	public final float[] aFloatArray63 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!qq", name = "ke", descriptor = "Z")
	protected boolean aBoolean528 = true;

	@OriginalMember(owner = "client!qq", name = "Kf", descriptor = "I")
	public int anInt7550 = 8;

	@OriginalMember(owner = "client!qq", name = "zf", descriptor = "I")
	protected final int anInt7543 = 0;

	@OriginalMember(owner = "client!qq", name = "pf", descriptor = "F")
	private float aFloat190 = 1.0F;

	@OriginalMember(owner = "client!qq", name = "Cf", descriptor = "I")
	protected int anInt7545 = 0;

	@OriginalMember(owner = "client!qq", name = "vf", descriptor = "[Lclient!ft;")
	private final Class3[] aClass3Array3 = new Class3[10];

	@OriginalMember(owner = "client!qq", name = "Wf", descriptor = "I")
	private int anInt7556 = 0;

	@OriginalMember(owner = "client!qq", name = "Tf", descriptor = "[F")
	private final float[] aFloatArray64 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!qq", name = "me", descriptor = "F")
	public float aFloat183 = 1.0F;

	@OriginalMember(owner = "client!qq", name = "Xf", descriptor = "[F")
	private final float[] aFloatArray65 = new float[16];

	@OriginalMember(owner = "client!qq", name = "wf", descriptor = "F")
	public float aFloat193 = -1.0F;

	@OriginalMember(owner = "client!qq", name = "Rf", descriptor = "Z")
	protected boolean aBoolean545 = false;

	@OriginalMember(owner = "client!qq", name = "Zf", descriptor = "Lclient!mt;")
	protected Class220 aClass220_18 = Static539.aClass220_21;

	@OriginalMember(owner = "client!qq", name = "Uf", descriptor = "Z")
	protected boolean aBoolean546 = true;

	@OriginalMember(owner = "client!qq", name = "bg", descriptor = "Z")
	protected boolean aBoolean547 = true;

	@OriginalMember(owner = "client!qq", name = "cg", descriptor = "I")
	private int anInt7557 = 16777215;

	@OriginalMember(owner = "client!qq", name = "fe", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream5 = new Stream();

	@OriginalMember(owner = "client!qq", name = "dg", descriptor = "Lclient!mh;")
	private final Class209_Sub2 aClass209_Sub2_21 = new Class209_Sub2();

	@OriginalMember(owner = "client!qq", name = "jd", descriptor = "Lclient!ga;")
	protected final Class111 aClass111_103;

	@OriginalMember(owner = "client!qq", name = "xe", descriptor = "I")
	protected final int anInt7525;

	@OriginalMember(owner = "client!qq", name = "Xc", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas10;

	@OriginalMember(owner = "client!qq", name = "Ib", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!qq", name = "wd", descriptor = "Ljava/lang/Object;")
	protected final Object anObject19;

	@OriginalMember(owner = "client!qq", name = "Rd", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!qq", name = "Hb", descriptor = "I")
	private int anInt7410;

	@OriginalMember(owner = "client!qq", name = "Yc", descriptor = "I")
	public int anInt7472;

	@OriginalMember(owner = "client!qq", name = "db", descriptor = "I")
	private int anInt7384;

	@OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
	public int anInt7363;

	@OriginalMember(owner = "client!qq", name = "Of", descriptor = "I")
	public final int anInt7554;

	@OriginalMember(owner = "client!qq", name = "df", descriptor = "Lclient!tu;")
	private final Class320 aClass320_3;

	@OriginalMember(owner = "client!qq", name = "ub", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!fa;Lclient!ga;II)V")
	protected Class12_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(3) Class111 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.aClass111_103 = arg3;
		this.anInt7525 = arg4;
		this.aCanvas9 = this.aCanvas10 = arg0;
		this.anObject20 = this.anObject19 = arg1;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt7472 = this.anInt7410 = local307.height;
		this.anInt7363 = this.anInt7384 = local307.width;
		this.anInt7554 = arg5;
		Static113.method1979(true, false);
		if (super.anInterface5_10 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt7554);
			this.aClass320_3 = null;
		} else {
			this.aClass320_3 = new Class320(this, super.anInterface5_10);
			this.aNativeInterface3 = new NativeInterface(super.anInterface5_10.method4046(), this.anInt7554);
			for (@Pc(352) int local352 = 0; local352 < super.anInterface5_10.method4046(); local352++) {
				@Pc(360) Class45 local360 = super.anInterface5_10.method4043(local352);
				if (local360 != null) {
					this.aNativeInterface3.initTextureMetrics(local352, local360.aByte22, local360.aByte28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I")
	public final int method6151() {
		return this.anInt7547;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method6435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method6202();
		this.method6172();
		this.method6259(arg4);
		this.method6179(Static135.aClass84_1, 0);
		this.method6234(0, Static135.aClass84_1);
		this.method6183(arg5);
		this.aClass209_Sub2_15.method4925((float) (arg2 - 1), (float) (arg3 - 1), 1.0F);
		this.aClass209_Sub2_15.method4932(0.0F, (float) arg1 - local7, -local7 + (float) arg0);
		this.method6275();
		this.method6182(false);
		this.method6158(4, Static358.aClass165_4);
		this.method6182(true);
		this.method6234(0, Static587.aClass84_6);
		this.method6179(Static587.aClass84_6, 0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	protected abstract void method6152(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt7515 + this.anInt7516 + this.anInt7518;
	}

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "(I)V")
	private void method6153() {
		this.method6173();
		this.method6230();
		this.method6166();
		this.method6156();
		this.method6171();
		this.method6246();
		this.method6254();
		this.method6242();
		this.method6163();
		this.method6210();
		this.method6253();
		this.method6235();
		this.method6168();
		this.method6252();
		for (@Pc(58) int local58 = this.anInt7533 - 1; local58 >= 0; local58--) {
			this.method6196(local58);
			this.method6188();
			this.method6174();
			this.method6237();
		}
		this.method6261();
		this.method6222();
		this.method6266();
		this.method6258();
		this.method6256();
	}

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "(I)V")
	private void method6154() {
		this.aBoolean540 = false;
		if (this.aClass3_3 != null) {
			this.aClass3_3.method7527();
		}
		this.method6256();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII[BLclient!sk;)Lclient!dea;")
	public abstract Interface4 method6155(@OriginalArg(4) byte[] arg0, @OriginalArg(5) Class297 arg1);

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "(I)V")
	protected void method6156() {
		this.anInt7521 = this.anInt7519;
		this.anInt7519 = 0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLclient!dn;)V")
	public abstract void method6157(@OriginalArg(1) Class74 arg0);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILclient!jb;)V")
	private void method6158(@OriginalArg(1) int arg0, @OriginalArg(2) Class165 arg1) {
		this.method6276(0, this.anInterface24_14);
		this.method6194(this.aClass331_17);
		this.method6167(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLclient!ot;)V")
	public final void method6159(@OriginalArg(1) Interface18 arg0) {
		if (arg0 == this.anInterface18Array3[this.anInt7547]) {
			return;
		}
		this.anInterface18Array3[this.anInt7547] = arg0;
		if (arg0 == null) {
			this.method6268();
		} else {
			arg0.method7671();
		}
		this.anInt7528 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6398(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "()Z")
	@Override
	public final boolean method6431() {
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;I)Lclient!jaclib/memory/Stream;")
	public final Stream method6160(@OriginalArg(0) Buffer arg0) {
		this.aStream5.a(arg0);
		return this.aStream5;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6395(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas10 == arg0) {
			local5 = this.anObject20;
		} else if (this.aHashtable6.containsKey(arg0)) {
			local5 = this.aHashtable6.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method6152(local5, arg0);
		if (this.aCanvas9 == arg0) {
			this.method6239();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BZ)V")
	public final void method6161(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean543 != arg0) {
			this.aBoolean543 = arg0;
			this.method6166();
			this.anInt7528 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qq", name = "y", descriptor = "()Z")
	@Override
	public final boolean method6463() {
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!sj;Z)V")
	public final void method6162(@OriginalArg(0) Class296 arg0) {
		this.aClass296Array3[this.anInt7547] = arg0;
		this.method6244();
	}

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "(I)V")
	protected abstract void method6163();

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)Lclient!mh;")
	public final Class209_Sub2 method6164() {
		if (!this.aBoolean540) {
			this.aClass209_Sub2_20.method4916(this.aClass209_Sub2_18, this.aClass209_Sub2_15);
			this.aBoolean540 = true;
		}
		return this.aClass209_Sub2_20;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)V")
	public final void method6165(@OriginalArg(1) byte arg0) {
		this.method6259(arg0 | arg0 << 24 | arg0 << 16 | arg0 << 8);
	}

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "(I)V")
	protected abstract void method6166();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILclient!jb;I)V")
	public abstract void method6167(@OriginalArg(0) int arg0, @OriginalArg(2) Class165 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!aga;[Lclient!tq;Z)Lclient!la;")
	@Override
	public final Class35 method6457(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class318[] arg1) {
		return new Class35_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "()Z")
	@Override
	public final boolean method6408() {
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "()Z")
	@Override
	public final boolean method6397() {
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public final boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass209_Sub2_16.method4921((float) arg2, (float) arg0, (float) arg1);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass209_Sub2_16.method4921((float) arg5, (float) arg3, (float) arg4);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt7532 > local14 && local31 < (float) this.anInt7532 || !(!((float) this.bf < local14) || !((float) this.bf < local31))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt7527 * this.aClass209_Sub2_16.method4920((float) arg1, (float) arg2, (float) arg0) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt7527 * this.aClass209_Sub2_16.method4920((float) arg4, (float) arg5, (float) arg3) / local31);
		if (this.aFloat198 > (float) local81 && this.aFloat198 > (float) local99 || this.aFloat192 < (float) local81 && this.aFloat192 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt7546 * this.aClass209_Sub2_16.method4911((float) arg0, (float) arg1, (float) arg2) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt7546 * this.aClass209_Sub2_16.method4911((float) arg3, (float) arg4, (float) arg5) / local31);
			return (!(this.aFloat196 > (float) local143) || !((float) local161 < this.aFloat196)) && (!((float) local143 > this.aFloat185) || !(this.aFloat185 < (float) local161));
		}
	}

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "(I)V")
	protected abstract void method6168();

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "()I")
	@Override
	public final int method6406() {
		return this.anInt7534 - 2;
	}

	@OriginalMember(owner = "client!qq", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt7558;
	}

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(IIIII)V")
	@Override
	protected final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!qq", name = "ra", descriptor = "(F)V")
	@Override
	public final void ra(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat188) {
			this.aFloat188 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method6173();
			this.method6246();
		}
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(IIIIII)Lclient!it;")
	@Override
	public final Class36 method6444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class36_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!tq;Z)Lclient!f;")
	@Override
	public final Class10 method6434(@OriginalArg(0) Class318 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(131) Class10 local131;
		if (arg0.anInt8537 == 0 || arg0.anInt8535 == 0) {
			local131 = this.method6429(new int[1], 1, 1, 1);
		} else {
			@Pc(21) int[] local21 = new int[arg0.anInt8537 * arg0.anInt8535];
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg0.aByteArray93 == null) {
				for (local30 = 0; local30 < arg0.anInt8535; local30++) {
					for (local34 = 0; local34 < arg0.anInt8537; local34++) {
						@Pc(96) int local96 = arg0.anIntArray587[arg0.aByteArray94[local23++] & 0xFF];
						local21[local25++] = local96 == 0 ? 0 : local96 | 0xFF000000;
					}
				}
			} else {
				for (local30 = 0; local30 < arg0.anInt8535; local30++) {
					for (local34 = 0; local34 < arg0.anInt8537; local34++) {
						local21[local25++] = arg0.anIntArray587[arg0.aByteArray94[local23] & 0xFF] | arg0.aByteArray93[local23] << 24;
						local23++;
					}
				}
			}
			local131 = this.method6429(local21, arg0.anInt8537, arg0.anInt8537, arg0.anInt8535);
		}
		local131.Q(arg0.anInt8533, arg0.anInt8534, arg0.anInt8536, arg0.anInt8538);
		return local131;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZ)V")
	public final void method6169(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean534 != arg0) {
			this.aBoolean534 = arg0;
			this.method6254();
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(BZ)V")
	public final void method6170(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean528 != arg0) {
			this.aBoolean528 = arg0;
			this.method6210();
		}
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(Z)V")
	public abstract void method6171();

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "(I)V")
	private void method6172() {
		if (this.anInt7528 == 1) {
			return;
		}
		this.method6228();
		this.method6225(false);
		this.method6161(false);
		this.method6199(false);
		this.method6184(false);
		this.method6236(-2, false, false);
		this.method6249(1);
		this.method6159(this.anInterface18_3);
		this.anInt7528 = 1;
	}

	@OriginalMember(owner = "client!qq", name = "B", descriptor = "()Z")
	@Override
	public final boolean method6473() {
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public final Class200 method6449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static587.method7843(arg3, arg1, arg0, this, arg2);
	}

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "(I)V")
	protected abstract void method6173();

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(Z)V")
	protected abstract void method6174();

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6396(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.method6272(arg0, this.aHashtable6.get(arg0));
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!qq", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public final void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt7557;
		if (local15 || this.aFloat193 != arg1 || this.aFloat191 != arg2) {
			this.aFloat193 = arg1;
			this.aFloat191 = arg2;
			this.anInt7557 = arg0;
			if (local15) {
				this.aFloat195 = (float) (this.anInt7557 & 0xFF) / 255.0F;
				this.aFloat183 = (float) (this.anInt7557 & 0xFF0000) / 1.671168E7F;
				this.aFloat197 = (float) (this.anInt7557 & 0xFF00) / 65280.0F;
				this.method6173();
			}
			this.aNativeInterface3.setSunColour(this.aFloat183, this.aFloat197, this.aFloat195, arg1, arg2);
			this.method6230();
		}
		if (this.aFloatArray59[0] != arg3 || this.aFloatArray59[1] != arg4 || this.aFloatArray59[2] != arg5) {
			this.aFloatArray59[2] = arg5;
			this.aFloatArray59[0] = arg3;
			this.aFloatArray59[1] = arg4;
			this.aFloatArray64[0] = -arg3;
			this.aFloatArray64[2] = -arg5;
			this.aFloatArray64[1] = -arg4;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray62[1] = arg4 * local153;
			this.aFloatArray62[2] = arg5 * local153;
			this.aFloatArray62[0] = arg3 * local153;
			this.aFloatArray63[0] = -this.aFloatArray62[0];
			this.aFloatArray63[1] = -this.aFloatArray62[1];
			this.aFloatArray63[2] = -this.aFloatArray62[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray62[0], this.aFloatArray62[1], this.aFloatArray62[2]);
			this.method6171();
			this.anInt7549 = (int) (arg3 * 256.0F / arg4);
			this.anInt7536 = (int) (arg5 * 256.0F / arg4);
		}
		this.method6246();
	}

	@OriginalMember(owner = "client!qq", name = "pa", descriptor = "(III)V")
	@Override
	public final void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt7555 && this.anInt7552 == arg1 && arg2 == this.anInt7520) {
			return;
		}
		this.anInt7555 = arg0;
		this.anInt7552 = arg1;
		this.anInt7520 = arg2;
		this.method6231();
		this.method6210();
	}

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "(I)V")
	public final void method6175() {
		this.aClass209_Sub2_15.Y();
		this.aBoolean527 = true;
		this.method6226();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZB)Lclient!wr;")
	public abstract Interface24 method6176(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public final Class10 method6429(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class10_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method6177(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap6.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public final void method6448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class200 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	protected abstract void method6178(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!ed;II)V")
	public final void method6179(@OriginalArg(0) Class84 arg0, @OriginalArg(2) int arg1) {
		this.method6280(arg1, arg0, false, false);
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(B)Lclient!mh;")
	public final Class209_Sub2 method6180() {
		return this.aClass209_Sub2_19;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZIZLclient!sk;[F)Lclient!gn;")
	public final Interface8 method6181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class297 arg3, @OriginalArg(5) float[] arg4) {
		return this.method6203(arg3, arg0, arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(IZ)V")
	public abstract void method6182(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)Lclient!e;")
	@Override
	public final Class1_Sub11 method6403(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub11_Sub2 local8 = new Class1_Sub11_Sub2(arg0);
		this.aClass361_80.method7855(local8);
		return local8;
	}

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "()Z")
	@Override
	public final boolean method6442() {
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "(IIIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6468(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(II)V")
	public final void method6183(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt7539) {
			return;
		}
		@Pc(29) Class220 local29;
		@Pc(33) boolean local33;
		@Pc(31) boolean local31;
		if (arg0 == 1) {
			local29 = Static539.aClass220_21;
			local33 = true;
			local31 = true;
		} else if (arg0 == 2) {
			local29 = Static256.aClass220_11;
			local31 = false;
			local33 = true;
		} else if (arg0 == 128) {
			local29 = Static287.aClass220_14;
			local33 = true;
			local31 = true;
		} else {
			local33 = false;
			local31 = false;
			local29 = Static451.aClass220_20;
		}
		if (local31 != this.aBoolean547) {
			this.aBoolean547 = local31;
			this.method6252();
		}
		if (this.aBoolean539 != local33) {
			this.aBoolean539 = local33;
			this.method6235();
		}
		if (this.aClass220_18 != local29) {
			this.aClass220_18 = local29;
			this.method6168();
		}
		this.anInt7539 = arg0;
		this.anInt7528 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(ZB)V")
	public final void method6184(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean545) {
			this.aBoolean545 = arg0;
			this.method6163();
			this.anInt7528 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qq", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.bf;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!ec;)V")
	@Override
	public final void method6460(@OriginalArg(0) Class82 arg0) {
		this.aClass139_3.method3413(this, arg0, -1);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method6471(@OriginalArg(0) Class209 arg0) {
		this.aClass209_Sub2_16 = (Class209_Sub2) arg0;
		this.aClass209_Sub2_18.M(this.aClass209_Sub2_16);
		this.aClass209_Sub2_18.method4914();
		this.aClass209_Sub2_19.method4918(this.aClass209_Sub2_18);
		this.aClass209_Sub2_17.method4918(this.aClass209_Sub2_16);
		if (this.aClass325_6.method7219()) {
			this.method6154();
		}
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(B)V")
	private void method6185() {
		this.aFloat189 = this.bf;
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(IZ)V")
	public final void method6186(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean535 != arg0) {
			this.aBoolean535 = arg0;
			this.method6166();
		}
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6437(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
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
			@Pc(53) Object local53 = this.method6265(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLclient!sk;Lclient!vea;II)Lclient!gn;")
	public abstract Interface8 method6187(@OriginalArg(1) Class297 arg0, @OriginalArg(2) Class340 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "(I)V")
	protected abstract void method6188();

	@OriginalMember(owner = "client!qq", name = "J", descriptor = "(IIIIII)V")
	@Override
	public final void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6172();
		this.method6259(arg4);
		this.method6179(Static135.aClass84_1, 0);
		this.method6234(0, Static135.aClass84_1);
		this.method6183(arg5);
		this.aClass209_Sub2_15.method4925((float) arg2, (float) arg3, 1.0F);
		this.aClass209_Sub2_15.U(arg0, arg1, 0);
		this.method6275();
		this.method6182(false);
		this.method6213();
		this.method6182(true);
		this.method6234(0, Static587.aClass84_6);
		this.method6179(Static587.aClass84_6, 0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B[Lclient!qp;)Lclient!um;")
	public abstract Class331 method6189(@OriginalArg(1) Class271[] arg0);

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(Z)[F")
	public final float[] method6190() {
		return this.aFloatArray57;
	}

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(B)V")
	private void method6191() {
		this.aFloatArray60[14] = this.aFloat187;
		this.aFloatArray60[10] = this.aFloat184;
		this.aFloat182 = (this.aFloatArray60[14] - (float) this.bf) / this.aFloatArray60[10];
	}

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "(I)V")
	private void method6192() {
		this.method6276(0, this.anInterface24_13);
		this.method6194(this.aClass331_16);
		this.method6167(1, Static236.aClass165_2, 0);
	}

	@OriginalMember(owner = "client!qq", name = "ZA", descriptor = "(Z)V")
	@Override
	public final void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean546 = arg0;
		this.method6163();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public final void method6422(@OriginalArg(0) Class1_Sub11 arg0) {
		this.aNativeHeap6 = ((Class1_Sub11_Sub2) arg0).aNativeHeap5;
		this.aNativeHeapBuffer7 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(IZ)Lclient!kga;")
	public abstract Interface13 method6193(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)I")
	@Override
	public final int method6467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!um;I)V")
	public abstract void method6194(@OriginalArg(0) Class331 arg0);

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
	@Override
	public final void method6401(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(B)V")
	private void method6195() {
		this.method6266();
		if (this.aClass3_3 != null) {
			this.aClass3_3.method7530();
		}
	}

	@OriginalMember(owner = "client!qq", name = "YA", descriptor = "(IIII)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean531) {
			throw new RuntimeException("");
		}
		this.anInt7530 = arg0;
		this.anInt7526 = arg3;
		this.anInt7529 = arg1;
		this.anInt7523 = arg2;
		if (this.aBoolean529) {
			this.aClass3Array3[3].method7532();
			this.aClass3Array3[3].method7525();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)V")
	public final void method6196(@OriginalArg(1) int arg0) {
		if (this.anInt7547 != arg0) {
			this.anInt7547 = arg0;
			this.method6250();
		}
	}

	@OriginalMember(owner = "client!qq", name = "XA", descriptor = "(IIIII)V")
	@Override
	public final void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6468(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!qq", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public final void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class200_Sub1 local6 = (Class200_Sub1) arg1;
		@Pc(9) Interface8 local9 = local6.anInterface8_5;
		this.method6201();
		this.method6159(local9);
		this.method6183(1);
		this.method6241(Static240.aClass108_5, Static240.aClass108_5);
		this.method6179(Static135.aClass84_1, 0);
		this.method6259(arg0);
		this.aClass209_Sub2_15.method4925((float) this.anInt7363, (float) this.anInt7472, 0.0F);
		this.method6275();
		this.aClass209_Sub2Array3[0].method4925(local9.method7326((float) this.anInt7363), local9.method7325((float) this.anInt7472), 1.0F);
		this.aClass209_Sub2Array3[0].method4932(0.0F, local9.method7325((float) -arg3), local9.method7326((float) -arg2));
		this.aClass296Array3[0] = Static315.aClass296_3;
		this.method6244();
		this.method6213();
		this.method6237();
		this.method6179(Static587.aClass84_6, 0);
	}

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "(B)V")
	private void method6197() {
		if (this.aBoolean542) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray58;
		@Pc(13) float local13 = (float) this.anInt7532;
		@Pc(17) float local17 = (float) this.bf;
		@Pc(29) float local29 = this.aFloat190 * (float) -this.anInt7535 / (float) this.anInt7546;
		@Pc(41) float local41 = (float) -this.anInt7553 * this.aFloat190 / (float) this.anInt7527;
		@Pc(56) float local56 = (float) (this.anInt7363 - this.anInt7553) * this.aFloat190 / (float) this.anInt7527;
		@Pc(71) float local71 = (float) (this.anInt7472 - this.anInt7535) * this.aFloat190 / (float) this.anInt7546;
		if (local41 == local56 || local71 == local29) {
			local9[15] = 1.0F;
			local9[4] = 0.0F;
			local9[2] = 0.0F;
			local9[11] = 0.0F;
			local9[5] = 1.0F;
			local9[3] = 0.0F;
			local9[6] = 0.0F;
			local9[8] = 0.0F;
			local9[9] = 0.0F;
			local9[1] = 0.0F;
			local9[7] = 0.0F;
			local9[12] = 0.0F;
			local9[13] = 0.0F;
			local9[14] = 0.0F;
			local9[10] = 1.0F;
			local9[0] = 1.0F;
		} else {
			local9[12] = (local56 + local41) / (local41 - local56);
			local9[8] = 0.0F;
			local9[11] = 0.0F;
			local9[4] = 0.0F;
			local9[7] = 0.0F;
			local9[2] = 0.0F;
			local9[15] = 1.0F;
			local9[13] = (local71 + local29) / (-local29 + local71);
			local9[14] = local13 / (local13 - local17);
			local9[5] = 2.0F / (local71 - local29);
			local9[6] = 0.0F;
			local9[0] = 2.0F / (local56 - local41);
			local9[9] = 0.0F;
			local9[1] = 0.0F;
			local9[3] = 0.0F;
			local9[10] = 1.0F / (local13 - local17);
		}
		this.method6185();
		this.aBoolean542 = true;
	}

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "(B)Lclient!mh;")
	public final Class209_Sub2 method6198() {
		return this.aClass209_Sub2_18;
	}

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(IZ)V")
	public final void method6199(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean532) {
			this.aBoolean532 = arg0;
			this.method6242();
			this.anInt7528 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qq", name = "CA", descriptor = "(IIII)V")
	@Override
	public final void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7530 = arg0;
		this.anInt7523 = arg2;
		this.anInt7529 = arg1;
		this.anInt7526 = arg3;
		this.aBoolean531 = true;
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(II)Lclient!kga;")
	public final Interface13 method6200(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface13_7.method7647()) {
			this.anInterface13_7.method7650(arg0);
		}
		return this.anInterface13_7;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIF)Lclient!qea;")
	@Override
	public final Class1_Sub5 method6426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub5_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "(B)V")
	public final void method6201() {
		if (this.anInt7528 == 2) {
			return;
		}
		this.method6228();
		this.method6225(false);
		this.method6161(false);
		this.method6199(false);
		this.method6184(false);
		this.method6236(-2, false, false);
		this.anInt7528 = 2;
	}

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "(B)F")
	protected abstract float method6202();

	@OriginalMember(owner = "client!qq", name = "V", descriptor = "(IIII)V")
	@Override
	public final void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt7531) {
			this.anInt7531 = arg0;
			local5 = true;
		}
		if (this.anInt7548 > arg2) {
			this.anInt7548 = arg2;
			local5 = true;
		}
		if (this.anInt7545 < arg1) {
			this.anInt7545 = arg1;
			local5 = true;
		}
		if (this.anInt7541 > arg3) {
			this.anInt7541 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean548) {
			this.aBoolean548 = true;
			this.method6262();
		}
		this.method6269();
		this.method6227();
	}

	@OriginalMember(owner = "client!qq", name = "GA", descriptor = "(II)V")
	@Override
	public final void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt7532 && arg1 == this.bf) {
			return;
		}
		this.anInt7532 = arg0;
		this.bf = arg1;
		this.method6204();
		this.method6215();
		this.method6231();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!sk;IZIIBI[F)Lclient!gn;")
	protected abstract Interface8 method6203(@OriginalArg(0) Class297 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(6) int arg3, @OriginalArg(7) float[] arg4);

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)V")
	@Override
	public void method6424(@OriginalArg(0) int arg0) {
		if (this.aClass320_3 != null) {
			this.aClass320_3.method7104();
		}
		this.anInt7542 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "(I)V")
	private void method6204() {
		this.aBoolean541 = false;
		this.method6260();
		if (Static345.aClass325_5 == this.aClass325_6) {
			this.method6195();
		}
	}

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)V")
	@Override
	public final void method6428(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "()Z")
	@Override
	public final boolean method6411() {
		return this.aBoolean536;
	}

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "(I)V")
	public final void method6205() {
		if (Static592.aClass325_8 == this.aClass325_6) {
			return;
		}
		@Pc(14) Class325 local14 = this.aClass325_6;
		this.aClass325_6 = Static592.aClass325_8;
		if (local14.method7219()) {
			this.method6154();
		}
		this.aFloatArray61 = this.aFloatArray57;
		this.anInt7528 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "(I)V")
	private void method6206() {
		this.aBoolean538 = false;
		if (Static441.aClass325_7 == this.aClass325_6) {
			this.method6284();
			this.method6195();
		}
	}

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "()V")
	@Override
	protected void method6414() {
		if (this.aBoolean530) {
			return;
		}
		for (@Pc(9) Class1 local9 = this.aClass361_80.method7854(); local9 != null; local9 = this.aClass361_80.method7853()) {
			((Class1_Sub11_Sub2) local9).method5953();
		}
		@Pc(26) Enumeration local26 = this.aHashtable6.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method6272(local32, this.aHashtable6.get(local32));
		}
		Static425.method5943(false, true);
		this.aNativeInterface3.release();
		this.aBoolean530 = true;
	}

	@OriginalMember(owner = "client!qq", name = "oa", descriptor = "([I)V")
	@Override
	public final void oa(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt7548;
		arg0[1] = this.anInt7545;
		arg0[3] = this.anInt7541;
		arg0[0] = this.anInt7531;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIZZI)V")
	private void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(6) boolean local6 = arg2 & this.method6413();
		if (!local6 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg0 = 1;
			arg4 = 0;
		}
		if (arg1 != 0 && arg3) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt7556) {
			if (this.anInt7556 != 0) {
				this.aClass3Array3[Integer.MAX_VALUE & this.anInt7556].method7534();
			}
			if (arg1 == 0) {
				this.aClass3_3 = null;
			} else {
				this.aClass3_3 = this.aClass3Array3[Integer.MAX_VALUE & arg1];
				this.aClass3_3.method7533(arg3);
				this.aClass3_3.method7535(arg3);
				this.aClass3_3.method7529(arg4, arg0);
			}
			this.anInt7544 = arg4;
			this.anInt7538 = arg0;
			this.anInt7556 = arg1;
		} else if (this.anInt7556 != 0) {
			this.aClass3Array3[Integer.MAX_VALUE & this.anInt7556].method7535(arg3);
			if (this.anInt7544 != arg4 || arg0 != this.anInt7538) {
				this.aClass3Array3[this.anInt7556 & Integer.MAX_VALUE].method7529(arg4, arg0);
				this.anInt7544 = arg4;
				this.anInt7538 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "(B)Lclient!jn;")
	public final Interface12 method6208() {
		return this.aClass36_Sub1_3 == null ? null : this.aClass36_Sub1_3.method1133();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(FFFFFBF)Z")
	private boolean method6209(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5) {
		@Pc(17) Buffer local17 = this.anInterface24_13.method6519();
		if (local17 == null) {
			return false;
		}
		@Pc(26) Stream local26 = this.method6160(local17);
		if (Stream.c()) {
			local26.b(arg2);
			local26.b(arg4);
			local26.b(arg1);
			local26.b(arg5);
			local26.b(arg0);
			local26.b(arg3);
		} else {
			local26.a(arg2);
			local26.a(arg4);
			local26.a(arg1);
			local26.a(arg5);
			local26.a(arg0);
			local26.a(arg3);
		}
		local26.a();
		return this.anInterface24_13.method6520();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method6433() {
	}

	@OriginalMember(owner = "client!qq", name = "v", descriptor = "(I)V")
	protected abstract void method6210();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!it;)V")
	@Override
	public final void method6421(@OriginalArg(0) Class36 arg0) {
		this.aClass36_Sub1_3 = (Class36_Sub1) arg0;
	}

	@OriginalMember(owner = "client!qq", name = "x", descriptor = "(I)V")
	public final void method6213() {
		this.method6158(2, Static450.aClass165_5);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!mh;)V")
	public final void method6214(@OriginalArg(1) Class209_Sub2 arg0) {
		this.aClass209_Sub2_15.M(arg0);
		this.aBoolean527 = false;
		this.method6226();
	}

	@OriginalMember(owner = "client!qq", name = "y", descriptor = "(I)V")
	private void method6215() {
		this.aBoolean542 = false;
		this.method6197();
		if (this.aClass325_6 == Static529.aClass325_4) {
			this.method6195();
		}
	}

	@OriginalMember(owner = "client!qq", name = "AA", descriptor = "(III[I)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass209_Sub2_16.method4921((float) arg2, (float) arg0, (float) arg1);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt7527 * this.aClass209_Sub2_16.method4920((float) arg1, (float) arg2, (float) arg0) / local14);
			local25 = (int) ((float) this.anInt7546 * this.aClass209_Sub2_16.method4911((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local25 = this.anInt7535;
			local28 = this.anInt7553;
		}
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local28 - this.aFloat198);
		arg3[1] = (int) ((float) local25 - this.aFloat196);
	}

	@OriginalMember(owner = "client!qq", name = "BA", descriptor = "()I")
	@Override
	public final int BA() {
		return this.anInt7532;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B[F)[F")
	public final float[] method6216(@OriginalArg(1) float[] arg0) {
		arg0[12] = this.aFloatArray61[3];
		arg0[0] = this.aFloatArray61[0];
		arg0[4] = this.aFloatArray61[1];
		arg0[8] = this.aFloatArray61[2];
		arg0[9] = this.aFloatArray61[6];
		arg0[2] = this.aFloatArray61[8];
		arg0[5] = this.aFloatArray61[5];
		arg0[1] = this.aFloatArray61[4];
		arg0[13] = this.aFloatArray61[7];
		arg0[14] = this.aFloatArray61[11];
		arg0[7] = this.aFloatArray61[13];
		arg0[6] = this.aFloatArray61[9];
		arg0[10] = this.aFloatArray61[10];
		arg0[3] = this.aFloatArray61[12];
		arg0[11] = this.aFloatArray61[14];
		arg0[15] = this.aFloatArray61[15];
		return arg0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!sk;I[BZII)Lclient!gn;")
	public final Interface8 method6217(@OriginalArg(0) Class297 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method6283(arg4, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!qq", name = "JA", descriptor = "()V")
	@Override
	public final void JA() {
		this.anInt7541 = this.anInt7472;
		this.anInt7531 = 0;
		this.anInt7548 = this.anInt7363;
		this.anInt7545 = 0;
		if (this.aBoolean548) {
			this.aBoolean548 = false;
			this.method6262();
		}
		this.method6227();
	}

	@OriginalMember(owner = "client!qq", name = "z", descriptor = "(I)V")
	public final void method6218() {
		this.anInterface18Array3 = new Interface18[this.anInt7533];
		this.aClass296Array3 = new Class296[this.anInt7533];
		this.aClass209_Sub2Array3 = new Class209_Sub2[this.anInt7533];
		this.aClass108Array6 = new Class108[this.anInt7533];
		this.aClass108Array5 = new Class108[this.anInt7533];
		for (@Pc(40) int local40 = 0; local40 < this.anInt7533; local40++) {
			this.aClass108Array5[local40] = Static9.aClass108_2;
			this.aClass108Array6[local40] = Static9.aClass108_2;
			this.aClass296Array3[local40] = Static146.aClass296_1;
			this.aClass209_Sub2Array3[local40] = new Class209_Sub2();
		}
		this.aClass1_Sub5Array6 = new Class1_Sub5[this.anInt7534 - 2];
		this.anInterface18_3 = this.method6187(Static253.aClass297_5, Static554.aClass340_14, 1, 1);
		this.method6422(new Class1_Sub11_Sub2(262144));
		this.aClass331_19 = this.method6189(new Class271[] { new Class271(new Class193[] { Static278.aClass193_1, Static278.aClass193_5 }) });
		this.aClass331_18 = this.method6189(new Class271[] { new Class271(new Class193[] { Static278.aClass193_1, Static278.aClass193_3 }) });
		this.aClass331_20 = this.method6189(new Class271[] { new Class271(Static278.aClass193_1), new Class271(Static278.aClass193_3), new Class271(Static278.aClass193_5), new Class271(Static278.aClass193_2) });
		this.aClass331_15 = this.method6189(new Class271[] { new Class271(Static278.aClass193_1), new Class271(Static278.aClass193_3), new Class271(Static278.aClass193_5) });
		this.aClass61_Sub1_25 = new Class61_Sub1(this, 0, 0, false, false);
		this.aClass61_Sub1_30 = new Class61_Sub1(this, 0, 0, true, true);
		this.aClass61_Sub1_26 = new Class61_Sub1(this, 0, 0, false, false);
		this.aClass61_Sub1_21 = new Class61_Sub1(this, 0, 0, true, true);
		this.aClass61_Sub1_24 = new Class61_Sub1(this, 0, 0, false, false);
		this.aClass61_Sub1_23 = new Class61_Sub1(this, 0, 0, true, true);
		this.aClass61_Sub1_27 = new Class61_Sub1(this, 0, 0, false, false);
		this.aClass61_Sub1_22 = new Class61_Sub1(this, 0, 0, true, true);
		this.aClass61_Sub1_29 = new Class61_Sub1(this, 0, 0, false, false);
		this.aClass61_Sub1_28 = new Class61_Sub1(this, 0, 0, true, true);
		this.aClass139_3 = new Class139(this);
		this.anInterface13_7 = this.method6193(true);
		this.method6286();
		this.aClass204_7 = new Class204(this);
		this.aClass3Array3[1] = this.method6223(1);
		this.aClass3Array3[2] = this.method6223(2);
		this.aClass3Array3[4] = this.method6223(4);
		this.aClass3Array3[5] = this.method6223(5);
		this.aClass3Array3[6] = this.method6223(6);
		this.aClass3Array3[7] = this.method6223(7);
		this.aClass3Array3[3] = this.method6223(3);
		this.aClass3Array3[8] = this.method6223(8);
		this.aClass3Array3[9] = this.method6223(9);
		if (!this.aClass3Array3[2].method7531()) {
			this.aClass3Array3[2] = this.method6223(0);
		}
		if (!this.aClass3Array3[4].method7531()) {
			this.aClass3Array3[4] = this.aClass3Array3[2];
		}
		if (!this.aClass3Array3[8].method7531()) {
			this.aClass3Array3[8] = this.aClass3Array3[4];
		}
		if (!this.aClass3Array3[9].method7531()) {
			this.aClass3Array3[9] = this.aClass3Array3[8];
		}
		this.method6263();
		this.JA();
		this.method6440();
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6405(@OriginalArg(0) Canvas arg0) {
		this.aCanvas9 = null;
		this.anObject20 = null;
		if (arg0 == null || this.aCanvas10 == arg0) {
			this.aCanvas9 = this.aCanvas10;
			this.anObject20 = this.anObject19;
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.anObject20 = this.aHashtable6.get(arg0);
			this.aCanvas9 = arg0;
		}
		if (this.aCanvas9 == null || this.anObject20 == null) {
			throw new RuntimeException();
		}
		this.method6178(this.aCanvas9, this.anObject20);
		this.method6239();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!vea;Lclient!sk;B)Z")
	public abstract boolean method6219(@OriginalArg(0) Class340 arg0, @OriginalArg(1) Class297 arg1);

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "(I)I")
	public final int method6220() {
		return this.anInt7526;
	}

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "(B)V")
	protected abstract void method6222();

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(II)Lclient!ft;")
	protected Class3 method6223(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class3_Sub5(this);
		} else if (arg0 == 1) {
			return new Class3_Sub9(this);
		} else if (arg0 == 2) {
			return new Class3_Sub7(this, this.aClass204_7);
		} else if (arg0 == 7) {
			return new Class3_Sub4(this);
		} else {
			return new Class3_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "(B)I")
	public final int method6224() {
		return this.anInt7523;
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(BZ)V")
	public final void method6225(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean533) {
			this.aBoolean533 = arg0;
			this.method6210();
			this.anInt7528 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qq", name = "B", descriptor = "(I)V")
	private void method6226() {
		if (Static441.aClass325_7 == this.aClass325_6) {
			@Pc(11) float local11 = this.method6202();
			this.aClass209_Sub2_15.method4932(0.0F, local11, local11);
		}
		this.aBoolean540 = false;
		this.method6258();
		if (this.aClass3_3 != null) {
			this.aClass3_3.method7526();
		}
	}

	@OriginalMember(owner = "client!qq", name = "C", descriptor = "(I)V")
	private void method6227() {
		this.aFloat196 = this.anInt7545 - this.anInt7535;
		this.aFloat198 = this.anInt7531 - this.anInt7553;
		this.aFloat192 = this.anInt7548 - this.anInt7553;
		this.aFloat185 = this.anInt7541 - this.anInt7535;
	}

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "(B)V")
	private void method6228() {
		if (Static441.aClass325_7 == this.aClass325_6) {
			return;
		}
		@Pc(6) Class325 local6 = this.aClass325_6;
		this.aClass325_6 = Static441.aClass325_7;
		if (local6.method7219()) {
			this.method6154();
		}
		this.method6284();
		this.aFloatArray61 = this.aFloatArray65;
		this.method6195();
		this.anInt7528 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZII[I)Lclient!gn;")
	public final Interface8 method6229(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		return this.method6257(arg3, 0, 0, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qq", name = "D", descriptor = "(I)V")
	protected abstract void method6230();

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "(B)V")
	private void method6231() {
		if (this.aClass3_3 != null) {
			this.aClass3_3.method7525();
		}
		this.method6253();
	}

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "(Z)V")
	public final void method6232() {
		this.method6205();
		this.method6195();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(FB)V")
	public final void method6233(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat190) {
			this.aFloat190 = arg0;
			this.method6215();
		}
	}

	@OriginalMember(owner = "client!qq", name = "L", descriptor = "()V")
	@Override
	public final void L() {
		this.aBoolean531 = false;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!ed;B)V")
	public final void method6234(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1) {
		this.method6255(arg0, arg1);
	}

	@OriginalMember(owner = "client!qq", name = "E", descriptor = "(I)V")
	protected abstract void method6235();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZZI)V")
	public final void method6236(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (this.anInt7551 != arg0 || this.aBoolean529 != this.aBoolean531) {
			@Pc(24) Interface8 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean531 ? 3 : 0;
			if (arg0 < 0) {
				this.method6237();
			} else {
				local24 = this.aClass320_3.method7100(arg0);
				@Pc(56) Class45 local56 = super.anInterface5_10.method4043(arg0);
				if (local56.aByte26 == 0 && local56.aByte24 == 0) {
					this.method6237();
				} else {
					@Pc(72) int local72 = local56.aBoolean124 ? 64 : 128;
					@Pc(76) int local76 = local72 * 50;
					@Pc(80) Class209_Sub2 local80 = this.method6270();
					local80.method4926((float) (local56.aByte24 * (this.anInt7542 % local76)) / (float) local76, (float) (this.anInt7542 % local76 * local56.aByte26) / (float) local76, 0.0F);
					this.method6162(Static315.aClass296_3);
				}
				local26 = local56.anInt1535;
				if (!this.aBoolean531) {
					local37 = local56.aByte25;
					local28 = local56.aByte23;
					local30 = local56.anInt1536;
				}
			}
			this.method6207(local30, local37, arg1, arg2, local28);
			if (this.aClass3_3 == null) {
				this.method6159(local24);
				this.method6249(local26);
			} else {
				this.aClass3_3.method7528(local24, local26);
			}
			this.anInt7551 = arg0;
			this.aBoolean529 = this.aBoolean531;
		}
		this.anInt7528 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([I)V")
	@Override
	public final void method6430(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7363;
		arg0[1] = this.anInt7472;
	}

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "()Z")
	@Override
	public final boolean method6439() {
		return false;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public final Class10 method6420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class10_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!qq", name = "F", descriptor = "(I)V")
	public final void method6237() {
		if (this.aClass296Array3[this.anInt7547] != Static146.aClass296_1) {
			this.aClass296Array3[this.anInt7547] = Static146.aClass296_1;
			this.aClass209_Sub2Array3[this.anInt7547].Y();
			this.method6244();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
	@Override
	public final void method6399(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qq", name = "G", descriptor = "(I)Lclient!mh;")
	public final Class209_Sub2 method6238() {
		return this.aClass209_Sub2Array3[this.anInt7547];
	}

	@OriginalMember(owner = "client!qq", name = "H", descriptor = "(I)V")
	private void method6239() {
		if (this.aCanvas9 == null) {
			this.anInt7384 = this.anInt7410 = 1;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas9.getSize();
			this.anInt7410 = local6.height;
			this.anInt7384 = local6.width;
		}
		this.anInt7363 = this.anInt7384;
		this.anInt7472 = this.anInt7410;
		this.method6206();
		this.method6204();
		this.method6215();
		this.method6222();
		this.method6227();
		this.method6205();
		this.JA();
	}

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "(B)V")
	private void method6240() {
		if (this.aClass325_6 == Static529.aClass325_4) {
			return;
		}
		@Pc(6) Class325 local6 = this.aClass325_6;
		this.aClass325_6 = Static529.aClass325_4;
		if (!local6.method7219()) {
			this.method6154();
		}
		this.method6197();
		this.aFloatArray61 = this.aFloatArray58;
		this.method6195();
		this.anInt7528 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLclient!fv;Lclient!fv;)V")
	public final void method6241(@OriginalArg(1) Class108 arg0, @OriginalArg(2) Class108 arg1) {
		@Pc(13) boolean local13 = false;
		if (arg1 != this.aClass108Array6[this.anInt7547]) {
			this.aClass108Array6[this.anInt7547] = arg1;
			this.method6188();
			local13 = true;
		}
		if (this.aClass108Array5[this.anInt7547] != arg0) {
			this.aClass108Array5[this.anInt7547] = arg0;
			this.method6174();
			local13 = true;
		}
		if (local13) {
			this.anInt7528 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "()V")
	@Override
	public final void method6472() {
		if (this.aClass320_3 != null) {
			this.aClass320_3.method7102();
		}
	}

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "(Z)V")
	protected abstract void method6242();

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "()Z")
	@Override
	public final boolean method6455() {
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)V")
	@Override
	public final void method6454(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass320_3 != null) {
			this.aClass320_3.method7102();
		}
		this.anInt7524 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "J", descriptor = "(I)V")
	private void method6244() {
		this.method6281();
		if (this.aClass3_3 != null) {
			this.aClass3_3.method7536();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!cca;IIII)Lclient!da;")
	@Override
	public final Class61 method6407(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class61_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!qq", name = "K", descriptor = "(I)Lclient!mh;")
	public final Class209_Sub2 method6245() {
		return this.aClass209_Sub2_15;
	}

	@OriginalMember(owner = "client!qq", name = "la", descriptor = "(IIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7546 = arg3;
		this.anInt7535 = arg1;
		this.anInt7527 = arg2;
		this.anInt7553 = arg0;
		this.method6215();
		this.method6204();
		this.method6205();
		this.method6227();
	}

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "(B)V")
	protected abstract void method6246();

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(II)V")
	public abstract void method6247(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BIZ[[I)Lclient!jn;")
	public abstract Interface12 method6248(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[][] arg2);

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(IB)V")
	public final void method6249(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6241(Static240.aClass108_5, Static240.aClass108_5);
		} else if (arg0 == 0) {
			this.method6241(Static9.aClass108_2, Static9.aClass108_2);
		} else if (arg0 == 2) {
			this.method6241(Static240.aClass108_5, Static6.aClass108_7);
		} else if (arg0 == 3) {
			this.method6241(Static9.aClass108_2, Static466.aClass108_4);
		} else if (arg0 == 4) {
			this.method6241(Static379.aClass108_8, Static379.aClass108_8);
		}
	}

	@OriginalMember(owner = "client!qq", name = "L", descriptor = "(I)V")
	protected abstract void method6250();

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "()Lclient!q;")
	@Override
	public final Class209 method6410() {
		return new Class209_Sub2();
	}

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "(B)I")
	public final int method6251() {
		return this.anInt7529;
	}

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "()Z")
	@Override
	public final boolean method6415() {
		return false;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[Lclient!qea;)V")
	@Override
	public final void method6402(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass1_Sub5Array6[local3] = arg1[local3];
		}
		this.anInt7519 = arg0;
		if (this.aClass325_6.method7219()) {
			this.method6156();
		}
	}

	@OriginalMember(owner = "client!qq", name = "M", descriptor = "(I)V")
	protected abstract void method6252();

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "(B)V")
	protected abstract void method6253();

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "(Z)V")
	protected abstract void method6254();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZLclient!ed;B)V")
	protected abstract void method6255(@OriginalArg(0) int arg0, @OriginalArg(2) Class84 arg1);

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "(B)V")
	protected abstract void method6256();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([IIIIZII)Lclient!gn;")
	public abstract Interface8 method6257(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qq", name = "N", descriptor = "(I)V")
	protected abstract void method6258();

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "(II)V")
	public final void method6259(@OriginalArg(1) int arg0) {
		if (this.anInt7537 != arg0) {
			this.anInt7537 = arg0;
			this.method6261();
		}
	}

	@OriginalMember(owner = "client!qq", name = "O", descriptor = "(I)V")
	private void method6260() {
		if (this.aBoolean541) {
			return;
		}
		@Pc(17) float[] local17 = this.aFloatArray60;
		@Pc(29) float local29 = (float) (this.anInt7532 * -this.anInt7553) / (float) this.anInt7527;
		@Pc(44) float local44 = (float) (this.anInt7532 * (this.anInt7363 - this.anInt7553)) / (float) this.anInt7527;
		@Pc(55) float local55 = (float) (this.anInt7532 * this.anInt7535) / (float) this.anInt7546;
		@Pc(69) float local69 = (float) ((this.anInt7535 - this.anInt7472) * this.anInt7532) / (float) this.anInt7546;
		if (local44 == local29 || local55 == local69) {
			local17[11] = 0.0F;
			local17[10] = 1.0F;
			local17[14] = 0.0F;
			local17[1] = 0.0F;
			local17[9] = 0.0F;
			local17[8] = 0.0F;
			local17[6] = 0.0F;
			local17[12] = 0.0F;
			local17[13] = 0.0F;
			local17[7] = 0.0F;
			local17[4] = 0.0F;
			local17[15] = 1.0F;
			local17[3] = 0.0F;
			local17[2] = 0.0F;
			local17[5] = 1.0F;
			local17[0] = 1.0F;
		} else {
			@Pc(149) float local149 = (float) this.anInt7532 * 2.0F;
			local17[8] = (local44 + local29) / (-local29 + local44);
			local17[3] = 0.0F;
			local17[2] = 0.0F;
			local17[10] = this.aFloat184 = (float) this.bf / (float) (this.anInt7532 - this.bf);
			local17[15] = 0.0F;
			local17[12] = 0.0F;
			local17[13] = 0.0F;
			local17[0] = local149 / (local44 - local29);
			local17[5] = local149 / (local55 - local69);
			local17[4] = 0.0F;
			local17[1] = 0.0F;
			local17[6] = 0.0F;
			local17[11] = -1.0F;
			local17[14] = this.aFloat187 = (float) (this.anInt7532 * this.bf) / (float) (this.anInt7532 - this.bf);
			local17[7] = 0.0F;
			local17[9] = (local55 + local69) / (local55 - local69);
		}
		this.method6191();
		this.aBoolean541 = true;
	}

	@OriginalMember(owner = "client!qq", name = "P", descriptor = "(I)V")
	protected abstract void method6261();

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "()Lclient!q;")
	@Override
	public final Class209 method6417() {
		return this.aClass209_Sub2_16;
	}

	@OriginalMember(owner = "client!qq", name = "va", descriptor = "(I)V")
	@Override
	public final void va(@OriginalArg(0) int arg0) {
		this.anInt7540 = 0;
		while (arg0 > 1) {
			this.anInt7540++;
			arg0 >>= 0x1;
		}
		this.anInt7550 = 0x1 << this.anInt7540;
	}

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "(B)V")
	protected abstract void method6262();

	@OriginalMember(owner = "client!qq", name = "Q", descriptor = "(I)V")
	protected void method6263() {
		this.method6153();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method6265(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qq", name = "R", descriptor = "(I)V")
	protected abstract void method6266();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!ec;I)V")
	@Override
	public final void method6404(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1) {
		this.aClass139_3.method3413(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!qq", name = "v", descriptor = "(B)V")
	public final void method6267() {
		if (this.anInt7528 == 16) {
			return;
		}
		this.method6240();
		this.method6225(true);
		this.method6199(true);
		this.method6184(true);
		this.method6183(1);
		this.anInt7528 = 16;
	}

	@OriginalMember(owner = "client!qq", name = "w", descriptor = "(B)V")
	protected abstract void method6268();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public final Class10 method6470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class10_Sub3 local11 = new Class10_Sub3(this, arg2, arg3, arg4);
		local11.da(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!qq", name = "x", descriptor = "(B)V")
	protected abstract void method6269();

	@OriginalMember(owner = "client!qq", name = "S", descriptor = "(I)Lclient!mh;")
	public final Class209_Sub2 method6270() {
		return this.aClass209_Sub2Array3[this.anInt7547];
	}

	@OriginalMember(owner = "client!qq", name = "v", descriptor = "()[I")
	@Override
	public final int[] v() {
		return new int[] { this.anInt7553, this.anInt7535, this.anInt7527, this.anInt7546 };
	}

	@OriginalMember(owner = "client!qq", name = "da", descriptor = "(IIII)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt7363 - 1 && arg1 <= 0 && arg3 >= this.anInt7472 - 1) {
			this.JA();
			return;
		}
		this.anInt7545 = arg1 < 0 ? 0 : arg1;
		this.anInt7531 = arg0 >= 0 ? arg0 : 0;
		this.anInt7541 = arg3 > this.anInt7363 ? 0 : arg3;
		this.anInt7548 = arg2 > this.anInt7363 ? 0 : arg2;
		if (!this.aBoolean548) {
			this.aBoolean548 = true;
			this.method6262();
		}
		this.method6269();
		this.method6227();
	}

	@OriginalMember(owner = "client!qq", name = "y", descriptor = "(B)V")
	public final void method6271() {
		if (this.anInt7528 == 4) {
			return;
		}
		this.method6228();
		this.method6225(false);
		this.method6161(false);
		this.method6199(false);
		this.method6184(false);
		this.method6236(-2, false, false);
		this.method6183(1);
		this.method6249(0);
		this.anInt7528 = 4;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method6272(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!qq", name = "z", descriptor = "(B)V")
	private void method6273() {
		this.anInterface24_14 = this.method6176(false);
		this.anInterface24_14.method6518(28, 140);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface24_14.method6519();
			if (local28 != null) {
				@Pc(37) Stream local37 = this.method6160(local28);
				if (Stream.c()) {
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
				} else {
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
				}
				local37.a();
				if (this.anInterface24_14.method6520()) {
					break;
				}
			}
		}
		this.aClass331_17 = this.method6189(new Class271[] { new Class271(new Class193[] { Static278.aClass193_1, Static278.aClass193_5, Static278.aClass193_5 }) });
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILclient!kga;IILclient!jb;)V")
	public abstract void method6274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class165 arg5);

	@OriginalMember(owner = "client!qq", name = "MA", descriptor = "(III[I)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass209_Sub2_16.method4921((float) arg2, (float) arg0, (float) arg1);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt7527 * this.aClass209_Sub2_16.method4920((float) arg1, (float) arg2, (float) arg0) / local14);
			local25 = (int) ((float) this.anInt7546 * this.aClass209_Sub2_16.method4911((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local25 = this.anInt7535;
			local28 = this.anInt7553;
		}
		arg3[0] = (int) ((float) local28 - this.aFloat198);
		arg3[1] = (int) ((float) local25 - this.aFloat196);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "()Z")
	@Override
	public final boolean method6413() {
		return this.aClass3Array3[3].method7531();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public final Class17 method6452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class17_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!qq", name = "T", descriptor = "(I)V")
	public final void method6275() {
		this.aBoolean527 = false;
		this.method6226();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILclient!wr;)V")
	public abstract void method6276(@OriginalArg(1) int arg0, @OriginalArg(2) Interface24 arg1);

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method6468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		if (local10 == 0.0F && local17 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(38) float local38 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
			local10 *= local38;
			local17 *= local38;
		}
		if (!this.method6209(local17 + (float) arg3, 0.0F, (float) arg0, 0.0F, (float) arg1, local10 + (float) arg2)) {
			return;
		}
		this.method6172();
		this.method6259(arg4);
		this.method6179(Static135.aClass84_1, 0);
		this.method6234(0, Static135.aClass84_1);
		this.method6183(arg5);
		this.method6175();
		this.method6182(false);
		this.method6192();
		this.method6182(true);
		this.method6234(0, Static587.aClass84_6);
		this.method6179(Static587.aClass84_6, 0);
	}

	@OriginalMember(owner = "client!qq", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "(Z)V")
	public final void method6277() {
		if (this.anInt7528 == 8) {
			return;
		}
		this.method6287();
		this.method6225(true);
		this.method6199(true);
		this.method6184(true);
		this.method6183(1);
		this.anInt7528 = 8;
	}

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "(B)V")
	protected final void method6278() {
		@Pc(9) Enumeration local9 = this.aHashtable6.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method6272(local15, this.aHashtable6.get(local15));
		}
		this.anInterface24_14.method7651();
		this.anInterface24_13.method7651();
		this.aClass61_Sub1_30.method1938();
		this.aClass61_Sub1_21.method1938();
		this.aClass61_Sub1_23.method1938();
		this.aClass61_Sub1_22.method1938();
		this.aClass61_Sub1_28.method1938();
		this.aClass139_3.method3411();
		this.anInterface13_7.method7651();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!sk;Lclient!vea;I)Z")
	public abstract boolean method6279(@OriginalArg(0) Class297 arg0, @OriginalArg(1) Class340 arg1);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!ed;IZZ)V")
	public abstract void method6280(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!qq", name = "U", descriptor = "(I)V")
	protected abstract void method6281();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)I")
	@Override
	public final int method6445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qq", name = "B", descriptor = "(B)I")
	public final int method6282() {
		return this.anInt7530;
	}

	@OriginalMember(owner = "client!qq", name = "C", descriptor = "()Z")
	@Override
	public final boolean method6474() {
		return false;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILclient!sk;I[BZI)Lclient!gn;")
	protected abstract Interface8 method6283(@OriginalArg(0) int arg0, @OriginalArg(3) Class297 arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "(Z)V")
	private void method6284() {
		if (this.aBoolean538) {
			return;
		}
		@Pc(15) float[] local15 = this.aFloatArray65;
		this.aBoolean538 = true;
		if (this.anInt7363 != 0 && this.anInt7472 != 0) {
			local15[5] = -2.0F / (float) this.anInt7472;
			local15[9] = 0.0F;
			local15[8] = 0.0F;
			local15[13] = 1.0F;
			local15[2] = 0.0F;
			local15[1] = 0.0F;
			local15[0] = 2.0F / (float) this.anInt7363;
			local15[11] = 0.0F;
			local15[15] = 1.0F;
			local15[10] = 0.5F;
			local15[12] = -1.0F;
			local15[4] = 0.0F;
			local15[6] = 0.0F;
			local15[3] = 0.0F;
			local15[7] = 0.0F;
			local15[14] = 0.5F;
			return;
		}
		local15[13] = 0.0F;
		local15[7] = 0.0F;
		local15[11] = 0.0F;
		local15[14] = 0.0F;
		local15[10] = 1.0F;
		local15[8] = 0.0F;
		local15[4] = 0.0F;
		local15[5] = 1.0F;
		local15[1] = 0.0F;
		local15[15] = 1.0F;
		local15[3] = 0.0F;
		local15[9] = 0.0F;
		local15[2] = 0.0F;
		local15[12] = 0.0F;
		local15[6] = 0.0F;
		local15[0] = 1.0F;
	}

	@OriginalMember(owner = "client!qq", name = "V", descriptor = "(I)V")
	private void method6285() {
		this.anInterface24_13 = this.method6176(true);
		this.anInterface24_13.method6518(12, 24);
		this.aClass331_16 = this.method6189(new Class271[] { new Class271(Static278.aClass193_1) });
	}

	@OriginalMember(owner = "client!qq", name = "W", descriptor = "(I)V")
	protected final void method6286() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable6 != null && !this.aHashtable6.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable6.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method6265(local26));
			}
		}
		this.aHashtable6 = local9;
		this.method6273();
		this.method6285();
		this.aClass139_3.method3417(this);
	}

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "(Z)V")
	private void method6287() {
		if (Static345.aClass325_5 == this.aClass325_6) {
			return;
		}
		@Pc(6) Class325 local6 = this.aClass325_6;
		this.aClass325_6 = Static345.aClass325_5;
		if (!local6.method7219()) {
			this.method6154();
		}
		this.method6260();
		this.aFloatArray61 = this.aFloatArray60;
		this.method6195();
		this.anInt7528 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "()Lclient!q;")
	@Override
	public final Class209 method6441() {
		return this.aClass209_Sub2_21;
	}
}
