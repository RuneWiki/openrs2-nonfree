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

@OriginalClass("client!mj")
public abstract class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!mj", name = "gb", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable4;

	@OriginalMember(owner = "client!mj", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!mj", name = "Sb", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!mj", name = "Tb", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!mj", name = "Yb", descriptor = "Lclient!tt;")
	protected Class331 aClass331_4;

	@OriginalMember(owner = "client!mj", name = "Jd", descriptor = "I")
	public int anInt5826;

	@OriginalMember(owner = "client!mj", name = "Md", descriptor = "I")
	protected int anInt5829;

	@OriginalMember(owner = "client!mj", name = "Od", descriptor = "I")
	public int anInt5831;

	@OriginalMember(owner = "client!mj", name = "be", descriptor = "Z")
	public boolean aBoolean409;

	@OriginalMember(owner = "client!mj", name = "ce", descriptor = "Z")
	protected boolean aBoolean410;

	@OriginalMember(owner = "client!mj", name = "ee", descriptor = "F")
	public float aFloat122;

	@OriginalMember(owner = "client!mj", name = "ge", descriptor = "I")
	protected int anInt5835;

	@OriginalMember(owner = "client!mj", name = "je", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!mj", name = "pe", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!mj", name = "te", descriptor = "[Lclient!afa;")
	protected Class11_Sub1[] aClass11_Sub1Array3;

	@OriginalMember(owner = "client!mj", name = "ve", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!mj", name = "xe", descriptor = "I")
	protected int anInt5839;

	@OriginalMember(owner = "client!mj", name = "ye", descriptor = "F")
	private float aFloat127;

	@OriginalMember(owner = "client!mj", name = "Ce", descriptor = "[Lclient!nd;")
	protected Class222[] aClass222Array3;

	@OriginalMember(owner = "client!mj", name = "Ee", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!mj", name = "Fe", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!mj", name = "Ge", descriptor = "I")
	private int anInt5843;

	@OriginalMember(owner = "client!mj", name = "Le", descriptor = "[Lclient!sea;")
	protected Class307[] aClass307Array5;

	@OriginalMember(owner = "client!mj", name = "Ne", descriptor = "Z")
	public boolean aBoolean421;

	@OriginalMember(owner = "client!mj", name = "Xe", descriptor = "I")
	public int anInt5850;

	@OriginalMember(owner = "client!mj", name = "Ye", descriptor = "[Lclient!sea;")
	protected Class307[] aClass307Array6;

	@OriginalMember(owner = "client!mj", name = "af", descriptor = "I")
	protected int anInt5852;

	@OriginalMember(owner = "client!mj", name = "ef", descriptor = "Z")
	protected boolean aBoolean424;

	@OriginalMember(owner = "client!mj", name = "hf", descriptor = "Lclient!aga;")
	private Class12_Sub1 aClass12_Sub1_3;

	@OriginalMember(owner = "client!mj", name = "mf", descriptor = "Lclient!lc;")
	public Interface11 anInterface11_3;

	@OriginalMember(owner = "client!mj", name = "of", descriptor = "Lclient!nm;")
	private Class72 aClass72_3;

	@OriginalMember(owner = "client!mj", name = "pf", descriptor = "I")
	public int anInt5856;

	@OriginalMember(owner = "client!mj", name = "qf", descriptor = "[Lclient!lc;")
	private Interface11[] anInterface11Array3;

	@OriginalMember(owner = "client!mj", name = "Hf", descriptor = "I")
	protected int anInt5863;

	@OriginalMember(owner = "client!mj", name = "If", descriptor = "Lclient!gp;")
	private Class115 aClass115_3;

	@OriginalMember(owner = "client!mj", name = "Kf", descriptor = "[Lclient!eq;")
	protected Class3_Sub10[] aClass3_Sub10Array4;

	@OriginalMember(owner = "client!mj", name = "Nf", descriptor = "I")
	public int anInt5867;

	@OriginalMember(owner = "client!mj", name = "Of", descriptor = "F")
	private float aFloat136;

	@OriginalMember(owner = "client!mj", name = "Qf", descriptor = "I")
	public int anInt5869;

	@OriginalMember(owner = "client!mj", name = "Rf", descriptor = "Z")
	public boolean aBoolean428;

	@OriginalMember(owner = "client!mj", name = "Uf", descriptor = "I")
	private int anInt5872;

	@OriginalMember(owner = "client!mj", name = "Vf", descriptor = "Lclient!d;")
	public Class60_Sub1 aClass60_Sub1_21;

	@OriginalMember(owner = "client!mj", name = "Wf", descriptor = "Lclient!d;")
	public Class60_Sub1 aClass60_Sub1_22;

	@OriginalMember(owner = "client!mj", name = "Xf", descriptor = "Lclient!d;")
	public Class60_Sub1 aClass60_Sub1_23;

	@OriginalMember(owner = "client!mj", name = "Yf", descriptor = "Lclient!su;")
	private Interface19 anInterface19_13;

	@OriginalMember(owner = "client!mj", name = "Zf", descriptor = "Lclient!d;")
	public Class60_Sub1 aClass60_Sub1_24;

	@OriginalMember(owner = "client!mj", name = "bg", descriptor = "Lclient!d;")
	public Class60_Sub1 aClass60_Sub1_25;

	@OriginalMember(owner = "client!mj", name = "cg", descriptor = "Lclient!d;")
	public Class60_Sub1 aClass60_Sub1_26;

	@OriginalMember(owner = "client!mj", name = "dg", descriptor = "Lclient!ada;")
	public Class7 aClass7_15;

	@OriginalMember(owner = "client!mj", name = "eg", descriptor = "Lclient!ada;")
	private Class7 aClass7_16;

	@OriginalMember(owner = "client!mj", name = "fg", descriptor = "Lclient!su;")
	private Interface19 anInterface19_14;

	@OriginalMember(owner = "client!mj", name = "gg", descriptor = "Lclient!ada;")
	public Class7 aClass7_17;

	@OriginalMember(owner = "client!mj", name = "hg", descriptor = "Lclient!d;")
	public Class60_Sub1 aClass60_Sub1_27;

	@OriginalMember(owner = "client!mj", name = "ig", descriptor = "Lclient!d;")
	public Class60_Sub1 aClass60_Sub1_28;

	@OriginalMember(owner = "client!mj", name = "jg", descriptor = "Lclient!d;")
	public Class60_Sub1 aClass60_Sub1_29;

	@OriginalMember(owner = "client!mj", name = "kg", descriptor = "Lclient!d;")
	public Class60_Sub1 aClass60_Sub1_30;

	@OriginalMember(owner = "client!mj", name = "lg", descriptor = "Lclient!ada;")
	public Class7 aClass7_18;

	@OriginalMember(owner = "client!mj", name = "mg", descriptor = "Lclient!ada;")
	private Class7 aClass7_19;

	@OriginalMember(owner = "client!mj", name = "ng", descriptor = "Lclient!ada;")
	public Class7 aClass7_20;

	@OriginalMember(owner = "client!mj", name = "og", descriptor = "Lclient!mda;")
	private Interface13 anInterface13_7;

	@OriginalMember(owner = "client!mj", name = "pg", descriptor = "Z")
	protected boolean aBoolean429;

	@OriginalMember(owner = "client!mj", name = "qg", descriptor = "I")
	private int anInt5873;

	@OriginalMember(owner = "client!mj", name = "D", descriptor = "Lclient!gk;")
	private final Class112 aClass112_39 = new Class112();

	@OriginalMember(owner = "client!mj", name = "Pd", descriptor = "Z")
	protected boolean aBoolean408 = true;

	@OriginalMember(owner = "client!mj", name = "Rd", descriptor = "Lclient!afa;")
	protected final Class11_Sub1 aClass11_Sub1_15 = new Class11_Sub1();

	@OriginalMember(owner = "client!mj", name = "Sd", descriptor = "Lclient!afa;")
	public Class11_Sub1 aClass11_Sub1_16 = new Class11_Sub1();

	@OriginalMember(owner = "client!mj", name = "Td", descriptor = "Lclient!afa;")
	public final Class11_Sub1 aClass11_Sub1_17 = new Class11_Sub1();

	@OriginalMember(owner = "client!mj", name = "Ud", descriptor = "Lclient!afa;")
	protected final Class11_Sub1 aClass11_Sub1_18 = new Class11_Sub1();

	@OriginalMember(owner = "client!mj", name = "Vd", descriptor = "Lclient!afa;")
	private final Class11_Sub1 aClass11_Sub1_19 = new Class11_Sub1();

	@OriginalMember(owner = "client!mj", name = "Wd", descriptor = "Lclient!afa;")
	private final Class11_Sub1 aClass11_Sub1_20 = new Class11_Sub1();

	@OriginalMember(owner = "client!mj", name = "ke", descriptor = "Lclient!oo;")
	protected Class242 aClass242_6 = Static544.aClass242_10;

	@OriginalMember(owner = "client!mj", name = "oe", descriptor = "I")
	public int anInt5836 = 50;

	@OriginalMember(owner = "client!mj", name = "fe", descriptor = "Z")
	private boolean aBoolean411 = false;

	@OriginalMember(owner = "client!mj", name = "Ke", descriptor = "I")
	private int anInt5845 = 0;

	@OriginalMember(owner = "client!mj", name = "se", descriptor = "I")
	public int anInt5838 = 8;

	@OriginalMember(owner = "client!mj", name = "Be", descriptor = "I")
	private int anInt5842 = 0;

	@OriginalMember(owner = "client!mj", name = "Se", descriptor = "[F")
	public final float[] aFloatArray66 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!mj", name = "Ie", descriptor = "Z")
	private boolean aBoolean418 = false;

	@OriginalMember(owner = "client!mj", name = "Yd", descriptor = "[Lclient!nm;")
	private final Class72[] aClass72Array3 = new Class72[10];

	@OriginalMember(owner = "client!mj", name = "ne", descriptor = "Z")
	protected boolean aBoolean415 = false;

	@OriginalMember(owner = "client!mj", name = "df", descriptor = "Z")
	protected boolean aBoolean423 = true;

	@OriginalMember(owner = "client!mj", name = "Ve", descriptor = "I")
	public int anInt5848 = 0;

	@OriginalMember(owner = "client!mj", name = "Ze", descriptor = "I")
	private int anInt5851 = 16777215;

	@OriginalMember(owner = "client!mj", name = "Pe", descriptor = "[F")
	private final float[] aFloatArray64 = new float[16];

	@OriginalMember(owner = "client!mj", name = "ff", descriptor = "I")
	protected int anInt5853 = 0;

	@OriginalMember(owner = "client!mj", name = "nf", descriptor = "Z")
	private boolean aBoolean425 = false;

	@OriginalMember(owner = "client!mj", name = "le", descriptor = "Z")
	protected boolean aBoolean413 = true;

	@OriginalMember(owner = "client!mj", name = "qe", descriptor = "Z")
	protected boolean aBoolean416 = false;

	@OriginalMember(owner = "client!mj", name = "Je", descriptor = "Z")
	private boolean aBoolean419 = false;

	@OriginalMember(owner = "client!mj", name = "uf", descriptor = "F")
	public float aFloat132 = 3584.0F;

	@OriginalMember(owner = "client!mj", name = "Ue", descriptor = "I")
	public int anInt5847 = -1;

	@OriginalMember(owner = "client!mj", name = "kf", descriptor = "F")
	public float aFloat130 = 3584.0F;

	@OriginalMember(owner = "client!mj", name = "sf", descriptor = "Z")
	protected boolean aBoolean426 = true;

	@OriginalMember(owner = "client!mj", name = "wf", descriptor = "Z")
	protected boolean aBoolean427 = false;

	@OriginalMember(owner = "client!mj", name = "We", descriptor = "I")
	public int anInt5849 = 512;

	@OriginalMember(owner = "client!mj", name = "de", descriptor = "F")
	private float aFloat121 = 1.0F;

	@OriginalMember(owner = "client!mj", name = "bf", descriptor = "F")
	public float bf = 1.0F;

	@OriginalMember(owner = "client!mj", name = "xf", descriptor = "F")
	public float aFloat133 = -1.0F;

	@OriginalMember(owner = "client!mj", name = "lf", descriptor = "[F")
	private final float[] aFloatArray68 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!mj", name = "He", descriptor = "I")
	private int anInt5844 = 0;

	@OriginalMember(owner = "client!mj", name = "cf", descriptor = "Z")
	protected boolean aBoolean422 = false;

	@OriginalMember(owner = "client!mj", name = "Te", descriptor = "[F")
	private final float[] aFloatArray67 = new float[16];

	@OriginalMember(owner = "client!mj", name = "vf", descriptor = "[F")
	private final float[] aFloatArray69 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!mj", name = "re", descriptor = "I")
	public int anInt5837 = -1;

	@OriginalMember(owner = "client!mj", name = "Cf", descriptor = "Lclient!jd;")
	protected Class158 aClass158_5 = Static538.aClass158_7;

	@OriginalMember(owner = "client!mj", name = "jf", descriptor = "I")
	protected int anInt5855 = 0;

	@OriginalMember(owner = "client!mj", name = "Me", descriptor = "Z")
	private boolean aBoolean420 = false;

	@OriginalMember(owner = "client!mj", name = "he", descriptor = "F")
	public float aFloat123 = 1.0F;

	@OriginalMember(owner = "client!mj", name = "ue", descriptor = "Z")
	protected boolean aBoolean417 = true;

	@OriginalMember(owner = "client!mj", name = "Oe", descriptor = "[F")
	private final float[] aFloatArray63 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!mj", name = "Ef", descriptor = "I")
	public int anInt5862 = 0;

	@OriginalMember(owner = "client!mj", name = "tf", descriptor = "F")
	public float aFloat131 = 1.0F;

	@OriginalMember(owner = "client!mj", name = "zf", descriptor = "I")
	private int anInt5859 = -1;

	@OriginalMember(owner = "client!mj", name = "yf", descriptor = "I")
	public int anInt5858 = 3;

	@OriginalMember(owner = "client!mj", name = "De", descriptor = "[F")
	private final float[] aFloatArray62 = new float[16];

	@OriginalMember(owner = "client!mj", name = "rf", descriptor = "I")
	public int anInt5857 = 0;

	@OriginalMember(owner = "client!mj", name = "Lf", descriptor = "I")
	public int anInt5865 = 128;

	@OriginalMember(owner = "client!mj", name = "me", descriptor = "Z")
	protected boolean aBoolean414 = true;

	@OriginalMember(owner = "client!mj", name = "ze", descriptor = "I")
	protected final int anInt5840 = 0;

	@OriginalMember(owner = "client!mj", name = "Zd", descriptor = "I")
	protected final int anInt5833 = 0;

	@OriginalMember(owner = "client!mj", name = "Mf", descriptor = "I")
	private int anInt5866 = 0;

	@OriginalMember(owner = "client!mj", name = "Af", descriptor = "F")
	public float aFloat134 = 1.0F;

	@OriginalMember(owner = "client!mj", name = "Jf", descriptor = "I")
	protected int anInt5864 = 0;

	@OriginalMember(owner = "client!mj", name = "Re", descriptor = "[F")
	protected float[] aFloatArray65 = this.aFloatArray63;

	@OriginalMember(owner = "client!mj", name = "ie", descriptor = "Z")
	private boolean aBoolean412 = false;

	@OriginalMember(owner = "client!mj", name = "Bf", descriptor = "I")
	private int anInt5860 = -1;

	@OriginalMember(owner = "client!mj", name = "gf", descriptor = "I")
	protected int anInt5854 = 0;

	@OriginalMember(owner = "client!mj", name = "we", descriptor = "[F")
	public final float[] aFloatArray61 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!mj", name = "Pf", descriptor = "I")
	private int anInt5868 = 1;

	@OriginalMember(owner = "client!mj", name = "Ae", descriptor = "I")
	private int anInt5841 = -1;

	@OriginalMember(owner = "client!mj", name = "Gf", descriptor = "F")
	public float aFloat135 = -1.0F;

	@OriginalMember(owner = "client!mj", name = "Df", descriptor = "I")
	protected int anInt5861 = 3584;

	@OriginalMember(owner = "client!mj", name = "Sf", descriptor = "I")
	public int anInt5870 = 512;

	@OriginalMember(owner = "client!mj", name = "Tf", descriptor = "I")
	protected int anInt5871 = 0;

	@OriginalMember(owner = "client!mj", name = "Ff", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!mj", name = "ag", descriptor = "Lclient!afa;")
	private final Class11_Sub1 aClass11_Sub1_21 = new Class11_Sub1();

	@OriginalMember(owner = "client!mj", name = "Fd", descriptor = "Ljava/lang/Object;")
	protected final Object anObject12;

	@OriginalMember(owner = "client!mj", name = "cc", descriptor = "Ljava/lang/Object;")
	private Object anObject11;

	@OriginalMember(owner = "client!mj", name = "rb", descriptor = "Lclient!tf;")
	protected final Class322 aClass322_107;

	@OriginalMember(owner = "client!mj", name = "Qe", descriptor = "I")
	protected final int anInt5846;

	@OriginalMember(owner = "client!mj", name = "Uc", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas7;

	@OriginalMember(owner = "client!mj", name = "pd", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!mj", name = "ud", descriptor = "I")
	private int anInt5812;

	@OriginalMember(owner = "client!mj", name = "Rc", descriptor = "I")
	public int anInt5786;

	@OriginalMember(owner = "client!mj", name = "sb", descriptor = "I")
	private int anInt5713;

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
	public int anInt5668;

	@OriginalMember(owner = "client!mj", name = "ae", descriptor = "I")
	public final int anInt5834;

	@OriginalMember(owner = "client!mj", name = "Xd", descriptor = "Lclient!je;")
	private final Class159 aClass159_3;

	@OriginalMember(owner = "client!mj", name = "bd", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!fa;Lclient!tf;II)V")
	protected Class45_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) Class322 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anObject11 = this.anObject12 = arg1;
		this.aClass322_107 = arg3;
		this.anInt5846 = arg4;
		this.aCanvas8 = this.aCanvas7 = arg0;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt5786 = this.anInt5812 = local307.height;
		this.anInt5668 = this.anInt5713 = local307.width;
		this.anInt5834 = arg5;
		Static218.method3484(true, false);
		if (super.anInterface3_12 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt5834);
			this.aClass159_3 = null;
		} else {
			this.aClass159_3 = new Class159(this, super.anInterface3_12);
			this.aNativeInterface3 = new NativeInterface(super.anInterface3_12.method4778(), this.anInt5834);
			for (@Pc(352) int local352 = 0; local352 < super.anInterface3_12.method4778(); local352++) {
				@Pc(360) Class55 local360 = super.anInterface3_12.method4776(local352);
				if (local360 != null) {
					this.aNativeInterface3.initTextureMetrics(local352, local360.aByte17, local360.aByte15);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	public final void method4899() {
		if (this.anInt5843 == 4) {
			return;
		}
		this.method5026();
		this.method4978(false);
		this.method4905(false);
		this.method4936(false);
		this.method4981(false);
		this.method4947(false, -2, false);
		this.method5019(1);
		this.method4939(0);
		this.anInt5843 = 4;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!gb;B)V")
	public final void method4900(@OriginalArg(0) int arg0, @OriginalArg(1) Class108 arg1) {
		this.method4923(arg1, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method4901(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "(I)V")
	public final void method4902() {
		this.method4977(Static24.aClass40_2, 2);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
	private void method4903() {
		this.aBoolean425 = false;
		this.method5029();
		if (Static136.aClass242_5 == this.aClass242_6) {
			this.method4907();
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt5831 + this.anInt5826 + this.anInt5829;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZBII[I)Lclient!pm;")
	public final Interface17 method4904(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		return this.method4965(arg0, 0, arg1, arg2, arg3, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZB)V")
	public final void method4905(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean422 != arg0) {
			this.aBoolean422 = arg0;
			this.method5022();
			this.anInt5843 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "(I)V")
	protected abstract void method4906();

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "(I)V")
	private void method4907() {
		this.method4969();
		if (this.aClass72_3 != null) {
			this.aClass72_3.method7190();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public final Class14 method7390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class14_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!mj", name = "V", descriptor = "(IIII)V")
	@Override
	public final void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt5853 < arg0) {
			this.anInt5853 = arg0;
			local5 = true;
		}
		if (arg2 < this.anInt5871) {
			local5 = true;
			this.anInt5871 = arg2;
		}
		if (arg1 > this.anInt5854) {
			local5 = true;
			this.anInt5854 = arg1;
		}
		if (arg3 < this.anInt5864) {
			local5 = true;
			this.anInt5864 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean429) {
			this.aBoolean429 = true;
			this.method4997();
		}
		this.method5011();
		this.method4974();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!sq;IZII[F)Lclient!pm;")
	protected abstract Interface17 method4908(@OriginalArg(0) int arg0, @OriginalArg(2) Class314 arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(7) float[] arg4);

	@OriginalMember(owner = "client!mj", name = "pa", descriptor = "(III)V")
	@Override
	public final void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt5847 && this.anInt5837 == arg1 && this.anInt5848 == arg2) {
			return;
		}
		this.anInt5847 = arg0;
		this.anInt5848 = arg2;
		this.anInt5837 = arg1;
		this.method4979();
		this.method4988();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BZ)V")
	public final void method4909(@OriginalArg(0) byte arg0) {
		this.method4912(arg0 | arg0 << 24 | arg0 << 16 | arg0 << 8);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!su;II)V")
	public abstract void method4910(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "(I)V")
	private void method4911() {
		this.aFloatArray62[10] = this.aFloat136;
		this.aFloatArray62[14] = this.aFloat127;
		this.aFloat132 = ((float) -this.anInt5861 + this.aFloatArray62[14]) / this.aFloatArray62[10];
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)V")
	public final void method4912(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt5835) {
			this.anInt5835 = arg0;
			this.method4956();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ho;[Lclient!qo;Z)Lclient!la;")
	@Override
	public final Class54 method7394(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class279[] arg1) {
		return new Class54_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "(I)V")
	protected abstract void method4913();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public final Class14 method7395(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class14_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
	@Override
	public final void method7416(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(II)Lclient!mda;")
	public final Interface13 method4914(@OriginalArg(0) int arg0) {
		if (this.anInterface13_7.method6432() < arg0 * 2) {
			this.anInterface13_7.method6435(arg0);
		}
		return this.anInterface13_7;
	}

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "(I)I")
	public final int method4915() {
		return this.anInt5859;
	}

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "(I)[F")
	public final float[] method4916() {
		return this.aFloatArray63;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
	private void method4917() {
		if (this.aCanvas8 == null) {
			this.anInt5713 = this.anInt5812 = 1;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas8.getSize();
			this.anInt5812 = local6.height;
			this.anInt5713 = local6.width;
		}
		this.anInt5786 = this.anInt5812;
		this.anInt5668 = this.anInt5713;
		this.method4937();
		this.method5030();
		this.method4903();
		this.method4983();
		this.method4974();
		this.method4968();
		this.JA();
	}

	@OriginalMember(owner = "client!mj", name = "J", descriptor = "(IIIIII)V")
	@Override
	public final void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4940();
		this.method4912(arg4);
		this.method4953(0, Static62.aClass108_1);
		this.method4900(0, Static62.aClass108_1);
		this.method5019(arg5);
		this.aClass11_Sub1_15.method184((float) arg2, (float) arg3, 1.0F);
		this.aClass11_Sub1_15.U(arg0, arg1, 0);
		this.method4992();
		this.method4918(false);
		this.method4902();
		this.method4918(true);
		this.method4900(0, Static164.aClass108_3);
		this.method4953(0, Static164.aClass108_3);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(ZB)V")
	public abstract void method4918(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!al;B)V")
	public abstract void method4919(@OriginalArg(0) Class17 arg0);

	@OriginalMember(owner = "client!mj", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public final void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt5851 != arg0;
		if (local15 || arg1 != this.aFloat135 || arg2 != this.aFloat133) {
			this.anInt5851 = arg0;
			this.aFloat135 = arg1;
			this.aFloat133 = arg2;
			if (local15) {
				this.aFloat123 = (float) (this.anInt5851 & 0xFF00) / 65280.0F;
				this.bf = (float) (this.anInt5851 & 0xFF) / 255.0F;
				this.aFloat131 = (float) (this.anInt5851 & 0xFF0000) / 1.671168E7F;
				this.method4913();
			}
			this.aNativeInterface3.setSunColour(this.aFloat131, this.aFloat123, this.bf, arg1, arg2);
			this.method4933();
		}
		if (this.aFloatArray69[0] != arg3 || this.aFloatArray69[1] != arg4 || this.aFloatArray69[2] != arg5) {
			this.aFloatArray69[1] = arg4;
			this.aFloatArray69[2] = arg5;
			this.aFloatArray69[0] = arg3;
			this.aFloatArray68[1] = -arg4;
			this.aFloatArray68[0] = -arg3;
			this.aFloatArray68[2] = -arg5;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray66[2] = local153 * arg5;
			this.aFloatArray66[1] = local153 * arg4;
			this.aFloatArray66[0] = local153 * arg3;
			this.aFloatArray61[2] = -this.aFloatArray66[2];
			this.aFloatArray61[0] = -this.aFloatArray66[0];
			this.aFloatArray61[1] = -this.aFloatArray66[1];
			this.aNativeInterface3.setSunDirection(this.aFloatArray66[0], this.aFloatArray66[1], this.aFloatArray66[2]);
			this.method4986();
			this.anInt5850 = (int) (arg3 * 256.0F / arg4);
			this.anInt5867 = (int) (arg5 * 256.0F / arg4);
		}
		this.method4928();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method4920(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap4.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public final boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass11_Sub1_16.method185((float) arg0, (float) arg2, (float) arg1);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass11_Sub1_16.method185((float) arg3, (float) arg5, (float) arg4);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt5836 > local14 && (float) this.anInt5836 > local31 || !(!((float) this.anInt5861 < local14) || !(local31 > (float) this.anInt5861))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt5849 * this.aClass11_Sub1_16.method168((float) arg0, (float) arg2, (float) arg1) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt5849 * this.aClass11_Sub1_16.method168((float) arg3, (float) arg5, (float) arg4) / local31);
		if (this.aFloat124 > (float) local81 && this.aFloat124 > (float) local99 || this.aFloat125 < (float) local81 && this.aFloat125 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt5870 * this.aClass11_Sub1_16.method165((float) arg2, (float) arg1, (float) arg0) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt5870 * this.aClass11_Sub1_16.method165((float) arg5, (float) arg4, (float) arg3) / local31);
			return (!((float) local143 < this.aFloat122) || !(this.aFloat122 > (float) local161)) && (!(this.aFloat126 < (float) local143) || !((float) local161 > this.aFloat126));
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!sea;Lclient!sea;)V")
	public final void method4921(@OriginalArg(1) Class307 arg0, @OriginalArg(2) Class307 arg1) {
		@Pc(5) boolean local5 = false;
		if (this.aClass307Array5[this.anInt5855] != arg1) {
			this.aClass307Array5[this.anInt5855] = arg1;
			local5 = true;
			this.method4982();
		}
		if (arg0 != this.aClass307Array6[this.anInt5855]) {
			this.aClass307Array6[this.anInt5855] = arg0;
			local5 = true;
			this.method4987();
		}
		if (local5) {
			this.anInt5843 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "(I)F")
	protected abstract float method4922();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!gb;IIZ)V")
	protected abstract void method4923(@OriginalArg(0) Class108 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
	private void method4924() {
		this.method4913();
		this.method4933();
		this.method5022();
		this.method4935();
		this.method4986();
		this.method4928();
		this.method5020();
		this.method4906();
		this.method5027();
		this.method4988();
		this.method4990();
		this.method4941();
		this.method5005();
		this.method4942();
		for (@Pc(58) int local58 = this.anInt5869 - 1; local58 >= 0; local58--) {
			this.method4961(local58);
			this.method4982();
			this.method4987();
			this.method4950();
		}
		this.method4956();
		this.method4983();
		this.method4969();
		this.method4980();
		this.method5028();
	}

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "(I)V")
	protected final void method4925() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable4 != null && !this.aHashtable4.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable4.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method5000(local26));
			}
		}
		this.aHashtable4 = local9;
		this.method4934();
		this.method4943();
		this.aClass115_3.method3123(this);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!lc;)V")
	public final void method4926(@OriginalArg(1) Interface11 arg0) {
		if (arg0 == this.anInterface11Array3[this.anInt5855]) {
			return;
		}
		this.anInterface11Array3[this.anInt5855] = arg0;
		if (arg0 == null) {
			this.method4949();
		} else {
			arg0.method6965();
		}
		this.anInt5843 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!mj", name = "YA", descriptor = "(IIII)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean421) {
			throw new RuntimeException("");
		}
		this.anInt5841 = arg2;
		this.anInt5859 = arg1;
		this.anInt5872 = arg0;
		this.anInt5844 = arg3;
		if (this.aBoolean418) {
			this.aClass72Array3[3].method7183();
			this.aClass72Array3[3].method7192();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public final Class14 method7362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class14_Sub1 local11 = new Class14_Sub1(this, arg2, arg3, arg4);
		local11.da(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!bs;IZI)V")
	public abstract void method4927(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!mj", name = "va", descriptor = "(I)V")
	@Override
	public final void va(@OriginalArg(0) int arg0) {
		this.anInt5858 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt5858++;
		}
		this.anInt5838 = 0x1 << this.anInt5858;
	}

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "(I)V")
	protected abstract void method4928();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)Lclient!nm;")
	protected Class72 method4929(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class72_Sub2(this);
		} else if (arg0 == 1) {
			return new Class72_Sub3(this);
		} else if (arg0 == 2) {
			return new Class72_Sub11(this, this.aClass331_4);
		} else if (arg0 == 7) {
			return new Class72_Sub6(this);
		} else {
			return new Class72_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "()[I")
	@Override
	public final int[] v() {
		return new int[] { this.anInt5857, this.anInt5862, this.anInt5849, this.anInt5870 };
	}

	@OriginalMember(owner = "client!mj", name = "JA", descriptor = "()V")
	@Override
	public final void JA() {
		this.anInt5864 = this.anInt5786;
		this.anInt5853 = 0;
		this.anInt5854 = 0;
		this.anInt5871 = this.anInt5668;
		if (this.aBoolean429) {
			this.aBoolean429 = false;
			this.method4997();
		}
		this.method4974();
	}

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "(I)V")
	private void method4930() {
		if (Static287.aClass242_8 == this.aClass242_6) {
			return;
		}
		@Pc(21) Class242 local21 = this.aClass242_6;
		this.aClass242_6 = Static287.aClass242_8;
		if (!local21.method5734()) {
			this.method4998();
		}
		this.method5004();
		this.aFloatArray65 = this.aFloatArray62;
		this.method4907();
		this.anInt5843 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIILclient!rt;Lclient!sq;)Lclient!pm;")
	public abstract Interface17 method4931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class298 arg2, @OriginalArg(4) Class314 arg3);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!nd;Z)V")
	public final void method4932(@OriginalArg(0) Class222 arg0) {
		this.aClass222Array3[this.anInt5855] = arg0;
		this.method4976();
	}

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "()Lclient!q;")
	@Override
	public final Class11 method7397() {
		return this.aClass11_Sub1_21;
	}

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "(I)V")
	protected abstract void method4933();

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)V")
	private void method4934() {
		this.anInterface19_13 = this.method5009(false);
		this.anInterface19_13.method6255(140, 28);
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			@Pc(32) Buffer local32 = this.anInterface19_13.method6252();
			if (local32 != null) {
				@Pc(39) Stream local39 = this.method4901(local32);
				if (Stream.c()) {
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
				local39.a();
				if (this.anInterface19_13.method6251()) {
					break;
				}
			}
		}
		this.aClass7_19 = this.method5002(new Class332[] { new Class332(new Class147[] { Static227.aClass147_1, Static227.aClass147_5, Static227.aClass147_5 }) });
	}

	@OriginalMember(owner = "client!mj", name = "MA", descriptor = "(III[I)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass11_Sub1_16.method185((float) arg0, (float) arg2, (float) arg1);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt5849 * this.aClass11_Sub1_16.method168((float) arg0, (float) arg2, (float) arg1) / local14);
			local25 = (int) ((float) this.anInt5870 * this.aClass11_Sub1_16.method165((float) arg2, (float) arg1, (float) arg0) / local14);
		} else {
			local25 = this.anInt5862;
			local28 = this.anInt5857;
		}
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local28 - this.aFloat124);
		arg3[1] = (int) ((float) local25 - this.aFloat122);
	}

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "()Z")
	@Override
	public final boolean method7417() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "()Lclient!q;")
	@Override
	public final Class11 method7422() {
		return new Class11_Sub1();
	}

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "(I)V")
	protected void method4935() {
		this.anInt5863 = this.anInt5839;
		this.anInt5839 = 0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([I)V")
	@Override
	public final void method7407(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5668;
		arg0[1] = this.anInt5786;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(ZB)V")
	public final void method4936(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean427 != arg0) {
			this.aBoolean427 = arg0;
			this.method4906();
			this.anInt5843 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public final void method7418(@OriginalArg(0) Class3_Sub15 arg0) {
		this.aNativeHeap4 = ((Class3_Sub15_Sub2) arg0).aNativeHeap5;
		this.aNativeHeapBuffer8 = this.aNativeHeap4.a(32768, false);
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(B)V")
	private void method4937() {
		this.aBoolean412 = false;
		if (this.aClass242_6 == Static458.aClass242_9) {
			this.method5024();
			this.method4907();
		}
	}

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "(I)V")
	public final void method4938() {
		if (this.anInt5843 == 16) {
			return;
		}
		this.method4999();
		this.method4978(true);
		this.method4936(true);
		this.method4981(true);
		this.method5019(1);
		this.anInt5843 = 16;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(II)V")
	public final void method4939(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4921(Static534.aClass307_7, Static534.aClass307_7);
		} else if (arg0 == 0) {
			this.method4921(Static19.aClass307_1, Static19.aClass307_1);
		} else if (arg0 == 2) {
			this.method4921(Static534.aClass307_7, Static479.aClass307_6);
		} else if (arg0 == 3) {
			this.method4921(Static19.aClass307_1, Static177.aClass307_2);
		} else if (arg0 == 4) {
			this.method4921(Static334.aClass307_5, Static334.aClass307_5);
			return;
		}
	}

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(B)V")
	private void method4940() {
		if (this.anInt5843 == 1) {
			return;
		}
		this.method5026();
		this.method4978(false);
		this.method4905(false);
		this.method4936(false);
		this.method4981(false);
		this.method4947(false, -2, false);
		this.method4939(1);
		this.method4926(this.anInterface11_3);
		this.anInt5843 = 1;
	}

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "(I)V")
	protected abstract void method4941();

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	@Override
	public final void method7372(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass159_3 != null) {
			this.aClass159_3.method3784();
		}
		this.anInt5865 = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(Z)V")
	protected abstract void method4942();

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "(B)V")
	private void method4943() {
		this.anInterface19_14 = this.method5009(true);
		this.anInterface19_14.method6255(24, 12);
		this.aClass7_16 = this.method5002(new Class332[] { new Class332(Static227.aClass147_1) });
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public final Class34 method7371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class34_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(II)V")
	public abstract void method4944(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()V")
	@Override
	protected void method7359() {
		if (this.aBoolean411) {
			return;
		}
		for (@Pc(9) Class3 local9 = this.aClass112_39.method3088(); local9 != null; local9 = this.aClass112_39.method3084()) {
			((Class3_Sub15_Sub2) local9).method6609();
		}
		@Pc(26) Enumeration local26 = this.aHashtable4.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method4964(local32, this.aHashtable4.get(local32));
		}
		Static133.method2618(true, false);
		this.aNativeInterface3.release();
		this.aBoolean411 = true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ)Lclient!mda;")
	public abstract Interface13 method4945(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!qw;)V")
	@Override
	public final void method7396(@OriginalArg(0) Class283 arg0) {
		this.aClass115_3.method3115(arg0, this, -1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[FLclient!sq;ZB)Lclient!pm;")
	public final Interface17 method4946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) Class314 arg3, @OriginalArg(4) boolean arg4) {
		return this.method4908(arg0, arg3, arg4, arg1, arg2);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZIIZ)V")
	public final void method4947(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt5860 != arg1 || this.aBoolean421 != this.aBoolean418) {
			@Pc(16) Interface17 local16 = null;
			@Pc(18) int local18 = 0;
			@Pc(20) byte local20 = 0;
			@Pc(22) int local22 = 0;
			@Pc(29) int local29 = this.aBoolean421 ? 3 : 0;
			if (arg1 < 0) {
				this.method4950();
			} else {
				local16 = this.aClass159_3.method3787(arg1);
				@Pc(46) Class55 local46 = super.anInterface3_12.method4776(arg1);
				if (local46.aByte18 == 0 && local46.aByte21 == 0) {
					this.method4950();
				} else {
					@Pc(59) int local59 = local46.aBoolean141 ? 64 : 128;
					@Pc(63) int local63 = local59 * 50;
					@Pc(67) Class11_Sub1 local67 = this.method5007();
					local67.method169((float) (this.anInt5856 % local63 * local46.aByte18) / (float) local63, 0.0F, (float) (local46.aByte21 * (this.anInt5856 % local63)) / (float) local63);
					this.method4932(Static3.aClass222_12);
				}
				local18 = local46.anInt1675;
				if (!this.aBoolean421) {
					local20 = local46.aByte20;
					local29 = local46.aByte16;
					local22 = local46.anInt1674;
				}
			}
			this.method4975(local29, arg0, local22, arg2, local20);
			if (this.aClass72_3 == null) {
				this.method4926(local16);
				this.method4939(local18);
			} else {
				this.aClass72_3.method7194(local18, local16);
			}
			this.anInt5860 = arg1;
			this.aBoolean418 = this.aBoolean421;
		}
		this.anInt5843 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!mj", name = "ra", descriptor = "(F)V")
	@Override
	public final void ra(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat134) {
			this.aFloat134 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method4913();
			this.method4928();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(FFFFFFI)Z")
	private boolean method4948(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface19_14.method6252();
		if (local9 == null) {
			return false;
		}
		@Pc(18) Stream local18 = this.method4901(local9);
		if (Stream.c()) {
			local18.a(arg2);
			local18.a(arg5);
			local18.a(arg0);
			local18.a(arg4);
			local18.a(arg1);
			local18.a(arg3);
		} else {
			local18.b(arg2);
			local18.b(arg5);
			local18.b(arg0);
			local18.b(arg4);
			local18.b(arg1);
			local18.b(arg3);
		}
		local18.a();
		return this.anInterface19_14.method6251();
	}

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "(I)V")
	protected abstract void method4949();

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "(I)V")
	public final void method4950() {
		if (this.aClass222Array3[this.anInt5855] != Static11.aClass222_5) {
			this.aClass222Array3[this.anInt5855] = Static11.aClass222_5;
			this.aClass11_Sub1Array3[this.anInt5855].Y();
			this.method4976();
		}
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(Z)V")
	protected void method4951() {
		this.method4924();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7385(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mj", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt5873;
	}

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7430() {
		return this.aClass72Array3[3].method7187();
	}

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "(IIIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7376(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method7376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(37) float local37 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local10 * local10)));
			local10 *= local37;
			local16 *= local37;
		}
		if (!this.method4948(0.0F, local16 + (float) arg3, (float) arg0, 0.0F, (float) arg2 + local10, (float) arg1)) {
			return;
		}
		this.method4940();
		this.method4912(arg4);
		this.method4953(0, Static62.aClass108_1);
		this.method4900(0, Static62.aClass108_1);
		this.method5019(arg5);
		this.method4952();
		this.method4918(false);
		this.method4958();
		this.method4918(true);
		this.method4900(0, Static164.aClass108_3);
		this.method4953(0, Static164.aClass108_3);
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(Z)V")
	public final void method4952() {
		this.aClass11_Sub1_15.Y();
		this.aBoolean408 = true;
		this.method4995();
	}

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7391() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BILclient!gb;)V")
	public final void method4953(@OriginalArg(1) int arg0, @OriginalArg(2) Class108 arg1) {
		this.method5010(arg0, false, false, arg1);
	}

	@OriginalMember(owner = "client!mj", name = "A", descriptor = "(I)V")
	protected abstract void method4954();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!rt;Lclient!sq;)Z")
	public abstract boolean method4955(@OriginalArg(1) Class298 arg0, @OriginalArg(2) Class314 arg1);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ef;IIII)Lclient!da;")
	@Override
	public final Class60 method7419(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class60_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!mj", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!mj", name = "B", descriptor = "(I)V")
	protected abstract void method4956();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public final Class81 method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static261.method4000(arg3, arg2, arg0, arg1, this);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLclient!ada;)V")
	public abstract void method4957(@OriginalArg(1) Class7 arg0);

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "(I)V")
	private void method4958() {
		this.method4910(this.anInterface19_14, 0);
		this.method4957(this.aClass7_16);
		this.method4927(Static33.aClass40_3, 0, 1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Z)V")
	protected abstract void method4959(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!mj", name = "D", descriptor = "(I)Lclient!afa;")
	public final Class11_Sub1 method4960() {
		return this.aClass11_Sub1_15;
	}

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "()Z")
	@Override
	public final boolean method7389() {
		return this.aBoolean410;
	}

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(II)V")
	public final void method4961(@OriginalArg(0) int arg0) {
		if (this.anInt5855 != arg0) {
			this.anInt5855 = arg0;
			this.method4954();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IF)V")
	public final void method4962(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat121) {
			this.aFloat121 = arg0;
			this.method4903();
		}
	}

	@OriginalMember(owner = "client!mj", name = "XA", descriptor = "(IIIII)V")
	@Override
	public final void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7376(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!qo;Z)Lclient!f;")
	@Override
	public final Class14 method7398(@OriginalArg(0) Class279 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(23) Class14 local23;
		if (arg0.anInt7341 == 0 || arg0.anInt7340 == 0) {
			local23 = this.method7395(new int[1], 1, 1, 1);
		} else {
			@Pc(32) int[] local32 = new int[arg0.anInt7341 * arg0.anInt7340];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			@Pc(41) int local41;
			@Pc(45) int local45;
			if (arg0.aByteArray79 == null) {
				for (local41 = 0; local41 < arg0.anInt7340; local41++) {
					for (local45 = 0; local45 < arg0.anInt7341; local45++) {
						@Pc(103) int local103 = arg0.anIntArray456[arg0.aByteArray80[local34++] & 0xFF];
						local32[local36++] = local103 == 0 ? 0 : local103 | 0xFF000000;
					}
				}
			} else {
				for (local41 = 0; local41 < arg0.anInt7340; local41++) {
					for (local45 = 0; local45 < arg0.anInt7341; local45++) {
						local32[local36++] = arg0.anIntArray456[arg0.aByteArray80[local34] & 0xFF] | arg0.aByteArray79[local34] << 24;
						local34++;
					}
				}
			}
			local23 = this.method7395(local32, arg0.anInt7341, arg0.anInt7341, arg0.anInt7340);
		}
		local23.Q(arg0.anInt7339, arg0.anInt7338, arg0.anInt7343, arg0.anInt7342);
		return local23;
	}

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7380() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "(B)V")
	public final void method4963() {
		this.aClass222Array3 = new Class222[this.anInt5869];
		this.anInterface11Array3 = new Interface11[this.anInt5869];
		this.aClass307Array5 = new Class307[this.anInt5869];
		this.aClass307Array6 = new Class307[this.anInt5869];
		this.aClass11_Sub1Array3 = new Class11_Sub1[this.anInt5869];
		for (@Pc(32) int local32 = 0; local32 < this.anInt5869; local32++) {
			this.aClass307Array6[local32] = Static19.aClass307_1;
			this.aClass307Array5[local32] = Static19.aClass307_1;
			this.aClass222Array3[local32] = Static11.aClass222_5;
			this.aClass11_Sub1Array3[local32] = new Class11_Sub1();
		}
		this.aClass3_Sub10Array4 = new Class3_Sub10[this.anInt5852 - 2];
		this.anInterface11_3 = this.method4931(1, 1, Static471.aClass298_15, Static469.aClass314_11);
		this.method7418(new Class3_Sub15_Sub2(262144));
		this.aClass7_20 = this.method5002(new Class332[] { new Class332(new Class147[] { Static227.aClass147_1, Static227.aClass147_5 }) });
		this.aClass7_17 = this.method5002(new Class332[] { new Class332(new Class147[] { Static227.aClass147_1, Static227.aClass147_3 }) });
		this.aClass7_15 = this.method5002(new Class332[] { new Class332(Static227.aClass147_1), new Class332(Static227.aClass147_3), new Class332(Static227.aClass147_5), new Class332(Static227.aClass147_2) });
		this.aClass7_18 = this.method5002(new Class332[] { new Class332(Static227.aClass147_1), new Class332(Static227.aClass147_3), new Class332(Static227.aClass147_5) });
		this.aClass60_Sub1_29 = new Class60_Sub1(this, 0, 0, false, false);
		this.aClass60_Sub1_30 = new Class60_Sub1(this, 0, 0, true, true);
		this.aClass60_Sub1_24 = new Class60_Sub1(this, 0, 0, false, false);
		this.aClass60_Sub1_27 = new Class60_Sub1(this, 0, 0, true, true);
		this.aClass60_Sub1_26 = new Class60_Sub1(this, 0, 0, false, false);
		this.aClass60_Sub1_25 = new Class60_Sub1(this, 0, 0, true, true);
		this.aClass60_Sub1_22 = new Class60_Sub1(this, 0, 0, false, false);
		this.aClass60_Sub1_21 = new Class60_Sub1(this, 0, 0, true, true);
		this.aClass60_Sub1_23 = new Class60_Sub1(this, 0, 0, false, false);
		this.aClass60_Sub1_28 = new Class60_Sub1(this, 0, 0, true, true);
		this.aClass115_3 = new Class115(this);
		this.anInterface13_7 = this.method4945(true);
		this.method4925();
		this.aClass331_4 = new Class331(this);
		this.aClass72Array3[1] = this.method4929(1);
		this.aClass72Array3[2] = this.method4929(2);
		this.aClass72Array3[4] = this.method4929(4);
		this.aClass72Array3[5] = this.method4929(5);
		this.aClass72Array3[6] = this.method4929(6);
		this.aClass72Array3[7] = this.method4929(7);
		this.aClass72Array3[3] = this.method4929(3);
		this.aClass72Array3[8] = this.method4929(8);
		this.aClass72Array3[9] = this.method4929(9);
		if (!this.aClass72Array3[2].method7187()) {
			this.aClass72Array3[2] = this.method4929(0);
		}
		if (!this.aClass72Array3[4].method7187()) {
			this.aClass72Array3[4] = this.aClass72Array3[2];
		}
		if (!this.aClass72Array3[8].method7187()) {
			this.aClass72Array3[8] = this.aClass72Array3[4];
		}
		if (!this.aClass72Array3[9].method7187()) {
			this.aClass72Array3[9] = this.aClass72Array3[8];
		}
		this.method4951();
		this.JA();
		this.method7361();
	}

	@OriginalMember(owner = "client!mj", name = "oa", descriptor = "([I)V")
	@Override
	public final void oa(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt5871;
		arg0[0] = this.anInt5853;
		arg0[3] = this.anInt5864;
		arg0[1] = this.anInt5854;
	}

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "(I)V")
	@Override
	public final void method7428(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method4964(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BZIII[II)Lclient!pm;")
	public abstract Interface17 method4965(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLclient!afa;)V")
	public final void method4966(@OriginalArg(1) Class11_Sub1 arg0) {
		this.aClass11_Sub1_15.M(arg0);
		this.aBoolean408 = false;
		this.method4995();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIZLclient!bs;Lclient!mda;I)V")
	public abstract void method4967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class40 arg3, @OriginalArg(5) Interface13 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
	@Override
	public void method7410(@OriginalArg(0) int arg0) {
		if (this.aClass159_3 != null) {
			this.aClass159_3.method3785();
		}
		this.anInt5856 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "(B)V")
	public final void method4968() {
		if (this.aClass242_6 == Static544.aClass242_10) {
			return;
		}
		@Pc(10) Class242 local10 = this.aClass242_6;
		this.aClass242_6 = Static544.aClass242_10;
		if (local10.method5734()) {
			this.method4998();
		}
		this.aFloatArray65 = this.aFloatArray63;
		this.anInt5843 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!mj", name = "ZA", descriptor = "(Z)V")
	@Override
	public final void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean414 = arg0;
		this.method5027();
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(Z)V")
	protected abstract void method4969();

	@OriginalMember(owner = "client!mj", name = "E", descriptor = "(I)Lclient!afa;")
	public final Class11_Sub1 method4970() {
		return this.aClass11_Sub1Array3[this.anInt5855];
	}

	@OriginalMember(owner = "client!mj", name = "F", descriptor = "(I)V")
	public final void method4971() {
		if (this.anInt5843 == 8) {
			return;
		}
		this.method4930();
		this.method4978(true);
		this.method4936(true);
		this.method4981(true);
		this.method5019(1);
		this.anInt5843 = 8;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI[BILclient!sq;)Lclient!n;")
	public abstract Interface14 method4972(@OriginalArg(3) byte[] arg0, @OriginalArg(5) Class314 arg1);

	@OriginalMember(owner = "client!mj", name = "G", descriptor = "(I)I")
	public final int method4973() {
		return this.anInt5841;
	}

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7406() {
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "H", descriptor = "(I)V")
	private void method4974() {
		this.aFloat125 = this.anInt5871 - this.anInt5857;
		this.aFloat122 = this.anInt5854 - this.anInt5862;
		this.aFloat124 = this.anInt5853 - this.anInt5857;
		this.aFloat126 = this.anInt5864 - this.anInt5862;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZIZII)V")
	private void method4975(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(4) boolean local4 = arg1 & this.method7430();
		if (!local4 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			arg0 = 2;
			arg2 = 1;
			arg4 = 0;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt5845) {
			if (this.anInt5845 != 0) {
				this.aClass72Array3[Integer.MAX_VALUE & this.anInt5845].method7184();
			}
			if (arg0 == 0) {
				this.aClass72_3 = null;
			} else {
				this.aClass72_3 = this.aClass72Array3[arg0 & Integer.MAX_VALUE];
				this.aClass72_3.method7193(arg3);
				this.aClass72_3.method7182(arg3);
				this.aClass72_3.method7188(arg4, arg2);
			}
			this.anInt5845 = arg0;
			this.anInt5842 = arg2;
			this.anInt5866 = arg4;
		} else if (this.anInt5845 != 0) {
			this.aClass72Array3[Integer.MAX_VALUE & this.anInt5845].method7182(arg3);
			if (arg4 != this.anInt5866 || arg2 != this.anInt5842) {
				this.aClass72Array3[Integer.MAX_VALUE & this.anInt5845].method7188(arg4, arg2);
				this.anInt5842 = arg2;
				this.anInt5866 = arg4;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!mj", name = "I", descriptor = "(I)V")
	private void method4976() {
		this.method5012();
		if (this.aClass72_3 != null) {
			this.aClass72_3.method7191();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!bs;II)V")
	private void method4977(@OriginalArg(0) Class40 arg0, @OriginalArg(2) int arg1) {
		this.method4910(this.anInterface19_13, 0);
		this.method4957(this.aClass7_19);
		this.method4927(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7404() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZZ)V")
	public final void method4978(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean424) {
			this.aBoolean424 = arg0;
			this.method4988();
			this.anInt5843 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "(B)V")
	private void method4979() {
		if (this.aClass72_3 != null) {
			this.aClass72_3.method7192();
		}
		this.method4990();
	}

	@OriginalMember(owner = "client!mj", name = "J", descriptor = "(I)V")
	protected abstract void method4980();

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(IZ)V")
	public final void method4981(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean415) {
			this.aBoolean415 = arg0;
			this.method5027();
			this.anInt5843 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "(B)V")
	protected abstract void method4982();

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(Z)V")
	protected abstract void method4983();

	@OriginalMember(owner = "client!mj", name = "K", descriptor = "(I)Lclient!afa;")
	public final Class11_Sub1 method4984() {
		return this.aClass11_Sub1_18;
	}

	@OriginalMember(owner = "client!mj", name = "L", descriptor = "(I)Lclient!ica;")
	public final Interface6 method4985() {
		return this.aClass12_Sub1_3 == null ? null : this.aClass12_Sub1_3.method4618();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method7367(@OriginalArg(0) Class11 arg0) {
		this.aClass11_Sub1_16 = (Class11_Sub1) arg0;
		this.aClass11_Sub1_18.M(this.aClass11_Sub1_16);
		this.aClass11_Sub1_18.method181();
		this.aClass11_Sub1_19.method180(this.aClass11_Sub1_18);
		this.aClass11_Sub1_17.method180(this.aClass11_Sub1_16);
		if (this.aClass242_6.method5734()) {
			this.method4998();
		}
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V")
	@Override
	public final void method7411(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "(Z)V")
	public abstract void method4986();

	@OriginalMember(owner = "client!mj", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt5861;
	}

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "()Z")
	@Override
	public final boolean method7435() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "M", descriptor = "(I)V")
	protected abstract void method4987();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIF)Lclient!eq;")
	@Override
	public final Class3_Sub10 method7357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub10_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "(B)V")
	protected abstract void method4988();

	@OriginalMember(owner = "client!mj", name = "GA", descriptor = "(II)V")
	@Override
	public final void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5836 == arg0 && arg1 == this.anInt5861) {
			return;
		}
		this.anInt5861 = arg1;
		this.anInt5836 = arg0;
		this.method5030();
		this.method4903();
		this.method4979();
	}

	@OriginalMember(owner = "client!mj", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public final void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class81_Sub2 local6 = (Class81_Sub2) arg1;
		@Pc(9) Interface17 local9 = local6.anInterface17_3;
		this.method5015();
		this.method4926(local9);
		this.method5019(1);
		this.method4921(Static534.aClass307_7, Static534.aClass307_7);
		this.method4953(0, Static62.aClass108_1);
		this.method4912(arg0);
		this.aClass11_Sub1_15.method184((float) this.anInt5668, (float) this.anInt5786, 0.0F);
		this.method4992();
		this.aClass11_Sub1Array3[0].method184(local9.method6970((float) this.anInt5668), local9.method6972((float) this.anInt5786), 1.0F);
		this.aClass11_Sub1Array3[0].method171(local9.method6970((float) -arg2), 0.0F, local9.method6972((float) -arg3));
		this.aClass222Array3[0] = Static3.aClass222_12;
		this.method4976();
		this.method4902();
		this.method4950();
		this.method4953(0, Static164.aClass108_3);
	}

	@OriginalMember(owner = "client!mj", name = "N", descriptor = "(I)Lclient!afa;")
	public final Class11_Sub1 method4989() {
		if (!this.aBoolean420) {
			this.aClass11_Sub1_20.method182(this.aClass11_Sub1_18, this.aClass11_Sub1_15);
			this.aBoolean420 = true;
		}
		return this.aClass11_Sub1_20;
	}

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "(Z)V")
	protected abstract void method4990();

	@OriginalMember(owner = "client!mj", name = "da", descriptor = "(IIII)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt5668 - 1 && arg1 <= 0 && this.anInt5786 - 1 <= arg3) {
			this.JA();
			return;
		}
		this.anInt5854 = arg1 < 0 ? 0 : arg1;
		this.anInt5853 = arg0 >= 0 ? arg0 : 0;
		this.anInt5864 = arg3 <= this.anInt5668 ? arg3 : 0;
		this.anInt5871 = arg2 <= this.anInt5668 ? arg2 : 0;
		if (!this.aBoolean429) {
			this.aBoolean429 = true;
			this.method4997();
		}
		this.method5011();
		this.method4974();
	}

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "()I")
	@Override
	public final int method7374() {
		return this.anInt5852 - 2;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ[[IB)Lclient!ica;")
	public abstract Interface6 method4991(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "(B)V")
	public final void method4992() {
		this.aBoolean408 = false;
		this.method4995();
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(BZ)V")
	public final void method4993(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean423 != arg0) {
			this.aBoolean423 = arg0;
			this.method5020();
		}
	}

	@OriginalMember(owner = "client!mj", name = "O", descriptor = "(I)V")
	private void method4994() {
		this.aFloat130 = this.anInt5861;
	}

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "(Z)V")
	private void method4995() {
		if (this.aClass242_6 == Static458.aClass242_9) {
			@Pc(11) float local11 = this.method4922();
			this.aClass11_Sub1_15.method171(local11, 0.0F, local11);
		}
		this.aBoolean420 = false;
		this.method4980();
		if (this.aClass72_3 != null) {
			this.aClass72_3.method7185();
		}
	}

	@OriginalMember(owner = "client!mj", name = "P", descriptor = "(I)I")
	public final int method4996() {
		return this.anInt5872;
	}

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "(B)V")
	protected abstract void method4997();

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "(B)V")
	private void method4998() {
		this.aBoolean420 = false;
		if (this.aClass72_3 != null) {
			this.aClass72_3.method7186();
		}
		this.method5028();
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7434(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas7) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.method4964(arg0, this.aHashtable4.get(arg0));
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "Q", descriptor = "(I)V")
	private void method4999() {
		if (Static136.aClass242_5 == this.aClass242_6) {
			return;
		}
		@Pc(19) Class242 local19 = this.aClass242_6;
		this.aClass242_6 = Static136.aClass242_5;
		if (!local19.method5734()) {
			this.method4998();
		}
		this.method5029();
		this.aFloatArray65 = this.aFloatArray67;
		this.method4907();
		this.anInt5843 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	protected abstract Object method5000(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(IIIIII)Lclient!lj;")
	@Override
	public final Class12 method7431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class12_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!mj", name = "R", descriptor = "(I)V")
	public final void method5001() {
		this.method4968();
		this.method4907();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Lclient!uaa;)Lclient!ada;")
	public abstract Class7 method5002(@OriginalArg(1) Class332[] arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)I")
	@Override
	public final int method7392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(ZZ)V")
	public final void method5003(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean426 != arg0) {
			this.aBoolean426 = arg0;
			this.method4988();
		}
	}

	@OriginalMember(owner = "client!mj", name = "S", descriptor = "(I)V")
	private void method5004() {
		if (this.aBoolean419) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray62;
		@Pc(21) float local21 = (float) (-this.anInt5857 * this.anInt5836) / (float) this.anInt5849;
		@Pc(36) float local36 = (float) ((this.anInt5668 - this.anInt5857) * this.anInt5836) / (float) this.anInt5849;
		@Pc(47) float local47 = (float) (this.anInt5836 * this.anInt5862) / (float) this.anInt5870;
		@Pc(62) float local62 = (float) ((this.anInt5862 - this.anInt5786) * this.anInt5836) / (float) this.anInt5870;
		if (local21 == local36 || local47 == local62) {
			local9[14] = 0.0F;
			local9[9] = 0.0F;
			local9[3] = 0.0F;
			local9[6] = 0.0F;
			local9[8] = 0.0F;
			local9[13] = 0.0F;
			local9[7] = 0.0F;
			local9[1] = 0.0F;
			local9[0] = 1.0F;
			local9[4] = 0.0F;
			local9[12] = 0.0F;
			local9[5] = 1.0F;
			local9[2] = 0.0F;
			local9[11] = 0.0F;
			local9[15] = 1.0F;
			local9[10] = 1.0F;
		} else {
			@Pc(142) float local142 = (float) this.anInt5836 * 2.0F;
			local9[15] = 0.0F;
			local9[11] = -1.0F;
			local9[4] = 0.0F;
			local9[2] = 0.0F;
			local9[13] = 0.0F;
			local9[8] = (local21 + local36) / (-local21 + local36);
			local9[0] = local142 / (local36 - local21);
			local9[5] = local142 / (local47 - local62);
			local9[10] = this.aFloat136 = (float) this.anInt5861 / (float) (this.anInt5836 - this.anInt5861);
			local9[9] = (local47 + local62) / (-local62 + local47);
			local9[6] = 0.0F;
			local9[3] = 0.0F;
			local9[1] = 0.0F;
			local9[12] = 0.0F;
			local9[7] = 0.0F;
			local9[14] = this.aFloat127 = (float) (this.anInt5836 * this.anInt5861) / (float) (this.anInt5836 - this.anInt5861);
		}
		this.method4911();
		this.aBoolean419 = true;
	}

	@OriginalMember(owner = "client!mj", name = "T", descriptor = "(I)V")
	protected abstract void method5005();

	@OriginalMember(owner = "client!mj", name = "BA", descriptor = "()I")
	@Override
	public final int BA() {
		return this.anInt5836;
	}

	@OriginalMember(owner = "client!mj", name = "AA", descriptor = "(III[I)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass11_Sub1_16.method185((float) arg0, (float) arg2, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt5849 * this.aClass11_Sub1_16.method168((float) arg0, (float) arg2, (float) arg1) / local14);
			local58 = (int) ((float) this.anInt5870 * this.aClass11_Sub1_16.method165((float) arg2, (float) arg1, (float) arg0) / local14);
		} else {
			local58 = this.anInt5862;
			local40 = this.anInt5857;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat124);
		arg3[1] = (int) ((float) local58 - this.aFloat122);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public final void method7382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class81 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!mj", name = "U", descriptor = "(I)I")
	public final int method5006() {
		return this.anInt5855;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Lclient!eq;)V")
	@Override
	public final void method7413(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub10[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub10Array4[local7] = arg1[local7];
		}
		this.anInt5839 = arg0;
		if (this.aClass242_6.method5734()) {
			this.method4935();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7403(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas7 == arg0) {
			local5 = this.anObject11;
		} else if (this.aHashtable4.containsKey(arg0)) {
			local5 = this.aHashtable4.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method5025(arg0, local5);
		if (arg0 == this.aCanvas8) {
			this.method4917();
		}
	}

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "()Z")
	@Override
	public final boolean method7384() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "V", descriptor = "(I)Lclient!afa;")
	public final Class11_Sub1 method5007() {
		return this.aClass11_Sub1Array3[this.anInt5855];
	}

	@OriginalMember(owner = "client!mj", name = "CA", descriptor = "(IIII)V")
	@Override
	public final void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5841 = arg2;
		this.anInt5844 = arg3;
		this.aBoolean421 = true;
		this.anInt5872 = arg0;
		this.anInt5859 = arg1;
	}

	@OriginalMember(owner = "client!mj", name = "W", descriptor = "(I)V")
	protected final void method5008() {
		@Pc(9) Enumeration local9 = this.aHashtable4.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method4964(local15, this.aHashtable4.get(local15));
		}
		this.anInterface19_13.method6436();
		this.anInterface19_14.method6436();
		this.aClass60_Sub1_30.method1663();
		this.aClass60_Sub1_27.method1663();
		this.aClass60_Sub1_25.method1663();
		this.aClass60_Sub1_21.method1663();
		this.aClass60_Sub1_28.method1663();
		this.aClass115_3.method3117();
		this.anInterface13_7.method6436();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)Lclient!su;")
	public abstract Interface19 method5009(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!mj", name = "L", descriptor = "()V")
	@Override
	public final void L() {
		this.aBoolean421 = false;
	}

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "()Z")
	@Override
	public final boolean method7429() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZZZLclient!gb;)V")
	public abstract void method5010(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class108 arg3);

	@OriginalMember(owner = "client!mj", name = "X", descriptor = "(I)V")
	protected abstract void method5011();

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(IIIII)V")
	@Override
	protected final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!mj", name = "Y", descriptor = "(I)V")
	protected abstract void method5012();

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7409(@OriginalArg(0) Canvas arg0) {
		this.anObject11 = null;
		this.aCanvas8 = null;
		if (arg0 == null || this.aCanvas7 == arg0) {
			this.aCanvas8 = this.aCanvas7;
			this.anObject11 = this.anObject12;
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.anObject11 = this.aHashtable4.get(arg0);
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.anObject11 == null) {
			throw new RuntimeException();
		}
		this.method4959(this.aCanvas8, this.anObject11);
		this.method4917();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[BBILclient!sq;Z)Lclient!pm;")
	public final Interface17 method5013(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class314 arg3, @OriginalArg(5) boolean arg4) {
		return this.method5021(arg1, arg4, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7414(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas7) {
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
			@Pc(53) Object local53 = this.method5000(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable4.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "()Z")
	@Override
	public final boolean method7360() {
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method7378() {
	}

	@OriginalMember(owner = "client!mj", name = "Z", descriptor = "(I)Lclient!afa;")
	public final Class11_Sub1 method5014() {
		return this.aClass11_Sub1_19;
	}

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "(Z)V")
	public final void method5015() {
		if (this.anInt5843 == 2) {
			return;
		}
		this.method5026();
		this.method4978(false);
		this.method4905(false);
		this.method4936(false);
		this.method4981(false);
		this.method4947(false, -2, false);
		this.anInt5843 = 2;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!rt;Lclient!sq;B)Z")
	public abstract boolean method5016(@OriginalArg(0) Class298 arg0, @OriginalArg(1) Class314 arg1);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B[F)[F")
	public final float[] method5017(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloatArray65[0];
		arg0[8] = this.aFloatArray65[2];
		arg0[12] = this.aFloatArray65[3];
		arg0[4] = this.aFloatArray65[1];
		arg0[5] = this.aFloatArray65[5];
		arg0[1] = this.aFloatArray65[4];
		arg0[9] = this.aFloatArray65[6];
		arg0[2] = this.aFloatArray65[8];
		arg0[13] = this.aFloatArray65[7];
		arg0[3] = this.aFloatArray65[12];
		arg0[7] = this.aFloatArray65[13];
		arg0[10] = this.aFloatArray65[10];
		arg0[14] = this.aFloatArray65[11];
		arg0[6] = this.aFloatArray65[9];
		arg0[15] = this.aFloatArray65[15];
		arg0[11] = this.aFloatArray65[14];
		return arg0;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(ZI)V")
	public final void method5018(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean416 != arg0) {
			this.aBoolean416 = arg0;
			this.method5022();
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(IB)V")
	public final void method5019(@OriginalArg(0) int arg0) {
		if (this.anInt5868 == arg0) {
			return;
		}
		@Pc(32) Class158 local32;
		@Pc(30) boolean local30;
		@Pc(28) boolean local28;
		if (arg0 == 1) {
			local32 = Static538.aClass158_7;
			local30 = true;
			local28 = true;
		} else if (arg0 == 2) {
			local32 = Static536.aClass158_6;
			local30 = true;
			local28 = false;
		} else if (arg0 == 128) {
			local28 = true;
			local30 = true;
			local32 = Static207.aClass158_4;
		} else {
			local28 = false;
			local32 = Static42.aClass158_1;
			local30 = false;
		}
		if (local28 != this.aBoolean417) {
			this.aBoolean417 = local28;
			this.method4942();
		}
		if (local30 != this.aBoolean413) {
			this.aBoolean413 = local30;
			this.method4941();
		}
		if (local32 != this.aClass158_5) {
			this.aClass158_5 = local32;
			this.method5005();
		}
		this.anInt5843 &= 0xFFFFFFE3;
		this.anInt5868 = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "(Z)V")
	protected abstract void method5020();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([BIZIIILclient!sq;I)Lclient!pm;")
	protected abstract Interface17 method5021(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class314 arg4);

	@OriginalMember(owner = "client!mj", name = "ab", descriptor = "(I)V")
	protected abstract void method5022();

	@OriginalMember(owner = "client!mj", name = "bb", descriptor = "(I)I")
	public final int method5023() {
		return this.anInt5844;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method4922();
		this.method4940();
		this.method4912(arg4);
		this.method4953(0, Static62.aClass108_1);
		this.method4900(0, Static62.aClass108_1);
		this.method5019(arg5);
		this.aClass11_Sub1_15.method184((float) (arg2 - 1), (float) (arg3 - 1), 1.0F);
		this.aClass11_Sub1_15.method171((float) arg0 - local7, 0.0F, (float) arg1 - local7);
		this.method4992();
		this.method4918(false);
		this.method4977(Static16.aClass40_1, 4);
		this.method4918(true);
		this.method4900(0, Static164.aClass108_3);
		this.method4953(0, Static164.aClass108_3);
	}

	@OriginalMember(owner = "client!mj", name = "cb", descriptor = "(I)V")
	private void method5024() {
		if (this.aBoolean412) {
			return;
		}
		@Pc(17) float[] local17 = this.aFloatArray64;
		if (this.anInt5668 == 0 || this.anInt5786 == 0) {
			local17[0] = 1.0F;
			local17[11] = 0.0F;
			local17[9] = 0.0F;
			local17[8] = 0.0F;
			local17[14] = 0.0F;
			local17[5] = 1.0F;
			local17[4] = 0.0F;
			local17[13] = 0.0F;
			local17[6] = 0.0F;
			local17[10] = 1.0F;
			local17[15] = 1.0F;
			local17[3] = 0.0F;
			local17[7] = 0.0F;
			local17[1] = 0.0F;
			local17[12] = 0.0F;
			local17[2] = 0.0F;
		} else {
			local17[7] = 0.0F;
			local17[5] = -2.0F / (float) this.anInt5786;
			local17[3] = 0.0F;
			local17[1] = 0.0F;
			local17[13] = 1.0F;
			local17[4] = 0.0F;
			local17[15] = 1.0F;
			local17[14] = 0.5F;
			local17[6] = 0.0F;
			local17[10] = 0.5F;
			local17[11] = 0.0F;
			local17[9] = 0.0F;
			local17[12] = -1.0F;
			local17[2] = 0.0F;
			local17[0] = 2.0F / (float) this.anInt5668;
			local17[8] = 0.0F;
		}
		this.aBoolean412 = true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method5025(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "()Lclient!q;")
	@Override
	public final Class11 method7408() {
		return this.aClass11_Sub1_16;
	}

	@OriginalMember(owner = "client!mj", name = "db", descriptor = "(I)V")
	private void method5026() {
		if (Static458.aClass242_9 == this.aClass242_6) {
			return;
		}
		@Pc(12) Class242 local12 = this.aClass242_6;
		this.aClass242_6 = Static458.aClass242_9;
		if (local12.method5734()) {
			this.method4998();
		}
		this.method5024();
		this.aFloatArray65 = this.aFloatArray64;
		this.method4907();
		this.anInt5843 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!lj;)V")
	@Override
	public final void method7415(@OriginalArg(0) Class12 arg0) {
		this.aClass12_Sub1_3 = (Class12_Sub1) arg0;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)I")
	@Override
	public final int method7393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "(B)V")
	protected abstract void method5027();

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)Lclient!e;")
	@Override
	public final Class3_Sub15 method7423(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub15_Sub2 local8 = new Class3_Sub15_Sub2(arg0);
		this.aClass112_39.method3079(local8);
		return local8;
	}

	@OriginalMember(owner = "client!mj", name = "B", descriptor = "()Z")
	@Override
	public final boolean method7433() {
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "la", descriptor = "(IIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5857 = arg0;
		this.anInt5849 = arg2;
		this.anInt5862 = arg1;
		this.anInt5870 = arg3;
		this.method4903();
		this.method5030();
		this.method4968();
		this.method4974();
	}

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "()V")
	@Override
	public final void method7370() {
		if (this.aClass159_3 != null) {
			this.aClass159_3.method3784();
		}
	}

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "(B)V")
	protected abstract void method5028();

	@OriginalMember(owner = "client!mj", name = "eb", descriptor = "(I)V")
	private void method5029() {
		if (this.aBoolean425) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray67;
		@Pc(9) float local9 = (float) this.anInt5836;
		@Pc(13) float local13 = (float) this.anInt5861;
		@Pc(25) float local25 = this.aFloat121 * (float) -this.anInt5862 / (float) this.anInt5870;
		@Pc(37) float local37 = this.aFloat121 * (float) -this.anInt5857 / (float) this.anInt5849;
		@Pc(52) float local52 = (float) (this.anInt5668 - this.anInt5857) * this.aFloat121 / (float) this.anInt5849;
		@Pc(66) float local66 = (float) (this.anInt5786 - this.anInt5862) * this.aFloat121 / (float) this.anInt5870;
		if (local52 == local37 || local25 == local66) {
			local5[12] = 0.0F;
			local5[15] = 1.0F;
			local5[13] = 0.0F;
			local5[5] = 1.0F;
			local5[2] = 0.0F;
			local5[4] = 0.0F;
			local5[10] = 1.0F;
			local5[11] = 0.0F;
			local5[8] = 0.0F;
			local5[7] = 0.0F;
			local5[3] = 0.0F;
			local5[14] = 0.0F;
			local5[0] = 1.0F;
			local5[6] = 0.0F;
			local5[1] = 0.0F;
			local5[9] = 0.0F;
		} else {
			local5[6] = 0.0F;
			local5[4] = 0.0F;
			local5[5] = 2.0F / (local66 - local25);
			local5[12] = (local52 + local37) / (local37 - local52);
			local5[13] = (local25 + local66) / (local66 - local25);
			local5[11] = 0.0F;
			local5[14] = local9 / (local9 - local13);
			local5[0] = 2.0F / (local52 - local37);
			local5[8] = 0.0F;
			local5[15] = 1.0F;
			local5[9] = 0.0F;
			local5[10] = 1.0F / (local9 - local13);
			local5[7] = 0.0F;
			local5[1] = 0.0F;
			local5[3] = 0.0F;
			local5[2] = 0.0F;
		}
		this.method4994();
		this.aBoolean425 = true;
	}

	@OriginalMember(owner = "client!mj", name = "fb", descriptor = "(I)V")
	private void method5030() {
		this.aBoolean419 = false;
		this.method5004();
		if (this.aClass242_6 == Static287.aClass242_8) {
			this.method4907();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!qw;I)V")
	@Override
	public final void method7358(@OriginalArg(0) Class283 arg0, @OriginalArg(1) int arg1) {
		this.aClass115_3.method3115(arg0, this, arg1);
	}
}
