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

@OriginalClass("client!sf")
public abstract class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!sf", name = "F", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!sf", name = "hb", descriptor = "Lclient!uw;")
	protected Class367 aClass367_5;

	@OriginalMember(owner = "client!sf", name = "Ib", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable4;

	@OriginalMember(owner = "client!sf", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!sf", name = "Cd", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!sf", name = "ae", descriptor = "I")
	public int anInt7432;

	@OriginalMember(owner = "client!sf", name = "be", descriptor = "I")
	protected int anInt7433;

	@OriginalMember(owner = "client!sf", name = "de", descriptor = "I")
	public int anInt7435;

	@OriginalMember(owner = "client!sf", name = "pe", descriptor = "[Lclient!am;")
	protected Class20[] aClass20Array3;

	@OriginalMember(owner = "client!sf", name = "te", descriptor = "[Lclient!afa;")
	protected Class11[] aClass11Array5;

	@OriginalMember(owner = "client!sf", name = "ve", descriptor = "Lclient!br;")
	public Interface3 anInterface3_3;

	@OriginalMember(owner = "client!sf", name = "xe", descriptor = "I")
	public int anInt7439;

	@OriginalMember(owner = "client!sf", name = "ye", descriptor = "F")
	private float aFloat158;

	@OriginalMember(owner = "client!sf", name = "Ce", descriptor = "F")
	private float aFloat160;

	@OriginalMember(owner = "client!sf", name = "Ge", descriptor = "Lclient!ue;")
	private Class106_Sub1 aClass106_Sub1_3;

	@OriginalMember(owner = "client!sf", name = "Le", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!sf", name = "Me", descriptor = "Z")
	protected boolean aBoolean554;

	@OriginalMember(owner = "client!sf", name = "Ne", descriptor = "I")
	private int anInt7444;

	@OriginalMember(owner = "client!sf", name = "Oe", descriptor = "I")
	protected int anInt7445;

	@OriginalMember(owner = "client!sf", name = "Xe", descriptor = "Z")
	public boolean aBoolean557;

	@OriginalMember(owner = "client!sf", name = "df", descriptor = "[Lclient!br;")
	private Interface3[] anInterface3Array3;

	@OriginalMember(owner = "client!sf", name = "ff", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!sf", name = "hf", descriptor = "Z")
	public boolean aBoolean558;

	@OriginalMember(owner = "client!sf", name = "nf", descriptor = "Lclient!mr;")
	private Class60 aClass60_3;

	@OriginalMember(owner = "client!sf", name = "rf", descriptor = "Z")
	protected boolean aBoolean561;

	@OriginalMember(owner = "client!sf", name = "uf", descriptor = "[Lclient!bq;")
	protected Class3_Sub7[] aClass3_Sub7Array5;

	@OriginalMember(owner = "client!sf", name = "vf", descriptor = "[Lclient!jba;")
	protected Class25_Sub3[] aClass25_Sub3Array3;

	@OriginalMember(owner = "client!sf", name = "Df", descriptor = "Z")
	public boolean aBoolean563;

	@OriginalMember(owner = "client!sf", name = "Hf", descriptor = "I")
	public int anInt7463;

	@OriginalMember(owner = "client!sf", name = "If", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!sf", name = "Lf", descriptor = "Lclient!um;")
	private Class362 aClass362_3;

	@OriginalMember(owner = "client!sf", name = "Mf", descriptor = "I")
	public int anInt7465;

	@OriginalMember(owner = "client!sf", name = "Pf", descriptor = "I")
	public int anInt7468;

	@OriginalMember(owner = "client!sf", name = "Qf", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!sf", name = "Rf", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!sf", name = "Tf", descriptor = "I")
	protected int anInt7470;

	@OriginalMember(owner = "client!sf", name = "Uf", descriptor = "I")
	protected int anInt7471;

	@OriginalMember(owner = "client!sf", name = "Vf", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!sf", name = "Yf", descriptor = "I")
	protected int anInt7473;

	@OriginalMember(owner = "client!sf", name = "ag", descriptor = "[Lclient!afa;")
	protected Class11[] aClass11Array6;

	@OriginalMember(owner = "client!sf", name = "bg", descriptor = "I")
	private int anInt7474;

	@OriginalMember(owner = "client!sf", name = "ig", descriptor = "Lclient!wp;")
	public Class277 aClass277_16;

	@OriginalMember(owner = "client!sf", name = "jg", descriptor = "Lclient!wp;")
	public Class277 aClass277_17;

	@OriginalMember(owner = "client!sf", name = "kg", descriptor = "Lclient!haa;")
	public Class28_Sub2 aClass28_Sub2_21;

	@OriginalMember(owner = "client!sf", name = "lg", descriptor = "Lclient!wp;")
	public Class277 aClass277_18;

	@OriginalMember(owner = "client!sf", name = "mg", descriptor = "Lclient!wp;")
	private Class277 aClass277_19;

	@OriginalMember(owner = "client!sf", name = "ng", descriptor = "Lclient!ta;")
	private Interface22 anInterface22_5;

	@OriginalMember(owner = "client!sf", name = "og", descriptor = "Lclient!haa;")
	public Class28_Sub2 aClass28_Sub2_22;

	@OriginalMember(owner = "client!sf", name = "pg", descriptor = "Lclient!haa;")
	public Class28_Sub2 aClass28_Sub2_23;

	@OriginalMember(owner = "client!sf", name = "qg", descriptor = "Lclient!haa;")
	public Class28_Sub2 aClass28_Sub2_24;

	@OriginalMember(owner = "client!sf", name = "rg", descriptor = "Lclient!haa;")
	public Class28_Sub2 aClass28_Sub2_25;

	@OriginalMember(owner = "client!sf", name = "sg", descriptor = "Lclient!wp;")
	public Class277 aClass277_20;

	@OriginalMember(owner = "client!sf", name = "tg", descriptor = "Lclient!haa;")
	public Class28_Sub2 aClass28_Sub2_26;

	@OriginalMember(owner = "client!sf", name = "ug", descriptor = "Lclient!mha;")
	private Interface16 anInterface16_14;

	@OriginalMember(owner = "client!sf", name = "wg", descriptor = "Lclient!haa;")
	public Class28_Sub2 aClass28_Sub2_27;

	@OriginalMember(owner = "client!sf", name = "xg", descriptor = "Lclient!wp;")
	private Class277 aClass277_21;

	@OriginalMember(owner = "client!sf", name = "yg", descriptor = "Lclient!mha;")
	private Interface16 anInterface16_15;

	@OriginalMember(owner = "client!sf", name = "zg", descriptor = "Lclient!wp;")
	private Class277 aClass277_22;

	@OriginalMember(owner = "client!sf", name = "Ag", descriptor = "Lclient!haa;")
	public Class28_Sub2 aClass28_Sub2_28;

	@OriginalMember(owner = "client!sf", name = "Bg", descriptor = "Lclient!haa;")
	public Class28_Sub2 aClass28_Sub2_29;

	@OriginalMember(owner = "client!sf", name = "Cg", descriptor = "Lclient!haa;")
	public Class28_Sub2 aClass28_Sub2_30;

	@OriginalMember(owner = "client!sf", name = "Dg", descriptor = "Lclient!mha;")
	private Interface16 anInterface16_16;

	@OriginalMember(owner = "client!sf", name = "Eg", descriptor = "Z")
	protected boolean aBoolean566;

	@OriginalMember(owner = "client!sf", name = "Fg", descriptor = "I")
	private int anInt7477;

	@OriginalMember(owner = "client!sf", name = "qd", descriptor = "Lclient!jia;")
	private final Class193 aClass193_39 = new Class193();

	@OriginalMember(owner = "client!sf", name = "Zd", descriptor = "Z")
	protected boolean aBoolean546 = true;

	@OriginalMember(owner = "client!sf", name = "Yd", descriptor = "Lclient!jba;")
	protected final Class25_Sub3 aClass25_Sub3_15 = new Class25_Sub3();

	@OriginalMember(owner = "client!sf", name = "fe", descriptor = "Lclient!jba;")
	public Class25_Sub3 aClass25_Sub3_16 = new Class25_Sub3();

	@OriginalMember(owner = "client!sf", name = "ge", descriptor = "Lclient!jba;")
	public final Class25_Sub3 aClass25_Sub3_17 = new Class25_Sub3();

	@OriginalMember(owner = "client!sf", name = "he", descriptor = "Lclient!jba;")
	protected final Class25_Sub3 aClass25_Sub3_18 = new Class25_Sub3();

	@OriginalMember(owner = "client!sf", name = "ie", descriptor = "Lclient!jba;")
	private final Class25_Sub3 aClass25_Sub3_19 = new Class25_Sub3();

	@OriginalMember(owner = "client!sf", name = "je", descriptor = "Lclient!jba;")
	private final Class25_Sub3 aClass25_Sub3_20 = new Class25_Sub3();

	@OriginalMember(owner = "client!sf", name = "qe", descriptor = "I")
	private int anInt7438 = -1;

	@OriginalMember(owner = "client!sf", name = "ue", descriptor = "F")
	public float aFloat157 = 1.0F;

	@OriginalMember(owner = "client!sf", name = "Ee", descriptor = "Z")
	private boolean aBoolean553 = false;

	@OriginalMember(owner = "client!sf", name = "Ae", descriptor = "Z")
	private boolean aBoolean552 = false;

	@OriginalMember(owner = "client!sf", name = "Be", descriptor = "F")
	public float aFloat159 = 1.0F;

	@OriginalMember(owner = "client!sf", name = "Ye", descriptor = "F")
	public float aFloat163 = 1.0F;

	@OriginalMember(owner = "client!sf", name = "Ue", descriptor = "I")
	protected int anInt7448 = 0;

	@OriginalMember(owner = "client!sf", name = "Ze", descriptor = "I")
	public int anInt7449 = -1;

	@OriginalMember(owner = "client!sf", name = "me", descriptor = "Z")
	private boolean aBoolean548 = false;

	@OriginalMember(owner = "client!sf", name = "Ie", descriptor = "I")
	public int anInt7442 = 512;

	@OriginalMember(owner = "client!sf", name = "of", descriptor = "F")
	public float aFloat167 = 3584.0F;

	@OriginalMember(owner = "client!sf", name = "He", descriptor = "[F")
	private final float[] aFloatArray54 = new float[16];

	@OriginalMember(owner = "client!sf", name = "tf", descriptor = "I")
	public int anInt7455 = 0;

	@OriginalMember(owner = "client!sf", name = "cf", descriptor = "I")
	protected int anInt7451 = 3584;

	@OriginalMember(owner = "client!sf", name = "Se", descriptor = "I")
	private int anInt7447 = -1;

	@OriginalMember(owner = "client!sf", name = "mf", descriptor = "Z")
	protected boolean aBoolean560 = false;

	@OriginalMember(owner = "client!sf", name = "Ve", descriptor = "Lclient!ad;")
	protected Class7 aClass7_3 = Static602.aClass7_6;

	@OriginalMember(owner = "client!sf", name = "we", descriptor = "Z")
	private boolean aBoolean551 = false;

	@OriginalMember(owner = "client!sf", name = "jf", descriptor = "F")
	public float aFloat166 = -1.0F;

	@OriginalMember(owner = "client!sf", name = "Te", descriptor = "[F")
	private final float[] aFloatArray56 = new float[16];

	@OriginalMember(owner = "client!sf", name = "We", descriptor = "Z")
	protected boolean aBoolean556 = false;

	@OriginalMember(owner = "client!sf", name = "gf", descriptor = "I")
	private int anInt7452 = -1;

	@OriginalMember(owner = "client!sf", name = "se", descriptor = "Z")
	protected boolean aBoolean550 = true;

	@OriginalMember(owner = "client!sf", name = "kf", descriptor = "[F")
	public final float[] aFloatArray57 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!sf", name = "Pe", descriptor = "I")
	public int anInt7446 = 3;

	@OriginalMember(owner = "client!sf", name = "Gf", descriptor = "I")
	private int anInt7462 = 0;

	@OriginalMember(owner = "client!sf", name = "ne", descriptor = "Z")
	protected boolean aBoolean549 = true;

	@OriginalMember(owner = "client!sf", name = "Ke", descriptor = "I")
	public int anInt7443 = 50;

	@OriginalMember(owner = "client!sf", name = "lf", descriptor = "Z")
	protected boolean aBoolean559 = false;

	@OriginalMember(owner = "client!sf", name = "Af", descriptor = "I")
	private int anInt7458 = 0;

	@OriginalMember(owner = "client!sf", name = "Bf", descriptor = "I")
	private int anInt7459 = 16777215;

	@OriginalMember(owner = "client!sf", name = "Sf", descriptor = "I")
	protected int anInt7469 = 0;

	@OriginalMember(owner = "client!sf", name = "Jf", descriptor = "I")
	public int anInt7464 = 512;

	@OriginalMember(owner = "client!sf", name = "bf", descriptor = "Z")
	private boolean bf = false;

	@OriginalMember(owner = "client!sf", name = "oe", descriptor = "I")
	public int anInt7437 = 128;

	@OriginalMember(owner = "client!sf", name = "Fe", descriptor = "[F")
	private final float[] aFloatArray53 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!sf", name = "Of", descriptor = "I")
	private int anInt7467 = 0;

	@OriginalMember(owner = "client!sf", name = "ef", descriptor = "F")
	public float aFloat164 = -1.0F;

	@OriginalMember(owner = "client!sf", name = "ke", descriptor = "Z")
	protected boolean aBoolean547 = true;

	@OriginalMember(owner = "client!sf", name = "Wf", descriptor = "F")
	private float aFloat172 = 1.0F;

	@OriginalMember(owner = "client!sf", name = "Kf", descriptor = "[F")
	private final float[] aFloatArray59 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!sf", name = "af", descriptor = "I")
	private int anInt7450 = 0;

	@OriginalMember(owner = "client!sf", name = "Cf", descriptor = "I")
	public int anInt7460 = 0;

	@OriginalMember(owner = "client!sf", name = "zf", descriptor = "Z")
	protected boolean aBoolean562 = true;

	@OriginalMember(owner = "client!sf", name = "Ff", descriptor = "Z")
	protected boolean aBoolean564 = false;

	@OriginalMember(owner = "client!sf", name = "eg", descriptor = "Z")
	protected boolean aBoolean565 = true;

	@OriginalMember(owner = "client!sf", name = "wf", descriptor = "[F")
	public final float[] aFloatArray58 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!sf", name = "sf", descriptor = "I")
	protected final int anInt7454 = 0;

	@OriginalMember(owner = "client!sf", name = "Je", descriptor = "F")
	public float aFloat161 = 1.0F;

	@OriginalMember(owner = "client!sf", name = "le", descriptor = "[F")
	protected float[] aFloatArray52 = this.aFloatArray53;

	@OriginalMember(owner = "client!sf", name = "qf", descriptor = "I")
	protected int anInt7453 = 0;

	@OriginalMember(owner = "client!sf", name = "xf", descriptor = "I")
	public int anInt7456 = 0;

	@OriginalMember(owner = "client!sf", name = "Xf", descriptor = "I")
	protected int anInt7472 = 0;

	@OriginalMember(owner = "client!sf", name = "Ef", descriptor = "I")
	protected final int anInt7461 = 0;

	@OriginalMember(owner = "client!sf", name = "re", descriptor = "[Lclient!mr;")
	private final Class60[] aClass60Array3 = new Class60[10];

	@OriginalMember(owner = "client!sf", name = "yf", descriptor = "I")
	public int anInt7457 = -1;

	@OriginalMember(owner = "client!sf", name = "Re", descriptor = "Z")
	private boolean aBoolean555 = false;

	@OriginalMember(owner = "client!sf", name = "cg", descriptor = "F")
	public float aFloat173 = 3584.0F;

	@OriginalMember(owner = "client!sf", name = "fg", descriptor = "Lclient!wm;")
	protected Class393 aClass393_5 = Static463.aClass393_6;

	@OriginalMember(owner = "client!sf", name = "dg", descriptor = "I")
	protected int anInt7475 = 0;

	@OriginalMember(owner = "client!sf", name = "Qe", descriptor = "[F")
	private final float[] aFloatArray55 = new float[16];

	@OriginalMember(owner = "client!sf", name = "Nf", descriptor = "I")
	private int anInt7466 = 1;

	@OriginalMember(owner = "client!sf", name = "hg", descriptor = "I")
	public int anInt7476 = 8;

	@OriginalMember(owner = "client!sf", name = "gg", descriptor = "[F")
	private final float[] aFloatArray60 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!sf", name = "pf", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!sf", name = "vg", descriptor = "Lclient!jba;")
	private final Class25_Sub3 aClass25_Sub3_21 = new Class25_Sub3();

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas7;

	@OriginalMember(owner = "client!sf", name = "ed", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!sf", name = "fb", descriptor = "Ljava/lang/Object;")
	protected final Object anObject12;

	@OriginalMember(owner = "client!sf", name = "xb", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!sf", name = "wd", descriptor = "Lclient!gj;")
	protected final Class143 aClass143_105;

	@OriginalMember(owner = "client!sf", name = "ze", descriptor = "I")
	protected final int anInt7440;

	@OriginalMember(owner = "client!sf", name = "sd", descriptor = "I")
	private int anInt7403;

	@OriginalMember(owner = "client!sf", name = "Xd", descriptor = "I")
	public int anInt7431;

	@OriginalMember(owner = "client!sf", name = "Bb", descriptor = "I")
	private int anInt7313;

	@OriginalMember(owner = "client!sf", name = "Wd", descriptor = "I")
	public int anInt7430;

	@OriginalMember(owner = "client!sf", name = "De", descriptor = "I")
	public final int anInt7441;

	@OriginalMember(owner = "client!sf", name = "Zf", descriptor = "Lclient!ai;")
	private final Class15 aClass15_3;

	@OriginalMember(owner = "client!sf", name = "Dc", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!gj;II)V")
	protected Class16_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(3) Class143 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.aCanvas8 = this.aCanvas7 = arg0;
			this.anObject13 = this.anObject12 = arg1;
			this.aClass143_105 = arg3;
			this.anInt7440 = arg4;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt7431 = this.anInt7403 = local307.width;
			this.anInt7430 = this.anInt7313 = local307.height;
			this.anInt7441 = arg5;
			Static69.method1566(true, false);
			if (super.anInterface5_12 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt7441);
				this.aClass15_3 = null;
			} else {
				this.aClass15_3 = new Class15(this, super.anInterface5_12);
				this.aNativeInterface3 = new NativeInterface(super.anInterface5_12.method5194(), this.anInt7441);
				for (@Pc(352) int local352 = 0; super.anInterface5_12.method5194() > local352; local352++) {
					@Pc(360) Class342 local360 = super.anInterface5_12.method5193(local352);
					if (local360 != null) {
						this.aNativeInterface3.initTextureMetrics(local352, local360.aByte126, local360.aByte124);
					}
				}
			}
		} catch (@Pc(395) Throwable local395) {
			local395.printStackTrace();
			this.method8199();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	protected abstract void method6194();

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	@Override
	public void method8121(@OriginalArg(0) int arg0) {
		if (this.aClass15_3 != null) {
			this.aClass15_3.method141();
		}
		this.anInt7468 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!sf", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6281();
		this.method6263(arg3);
		this.method6284(Static262.aClass188_2, 0);
		this.method6326(0, Static262.aClass188_2);
		this.method6239(arg4);
		this.aClass25_Sub3_15.method4323((float) arg2, (float) arg2, 1.0F);
		this.aClass25_Sub3_15.method4301(arg0, arg1, 0);
		this.method6256();
		this.method6305(false);
		this.method6257(0, this.anInterface16_16);
		this.method6287(this.aClass277_19);
		this.method6320(256, Static351.aClass44_3, 0);
		this.method6305(true);
		this.method6326(0, Static70.aClass188_1);
		this.method6284(Static70.aClass188_1, 0);
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
	protected void method6195() {
		this.method6319();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!dc;IIII)Lclient!ka;")
	@Override
	public final Class28 method8137(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class28_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	@Override
	public final void method8114(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass15_3 != null) {
			this.aClass15_3.method138();
		}
		this.anInt7437 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass25_Sub3_16.aFloat122 + (float) arg1 * this.aClass25_Sub3_16.aFloat125 + (float) arg0 * this.aClass25_Sub3_16.aFloat131 + (float) arg2 * this.aClass25_Sub3_16.aFloat124;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg5 * this.aClass25_Sub3_16.aFloat124 + (float) arg3 * this.aClass25_Sub3_16.aFloat131 + this.aClass25_Sub3_16.aFloat125 * (float) arg4 + this.aClass25_Sub3_16.aFloat122;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt7443 && local63 < (float) this.anInt7443) {
			local7 |= 0x10;
		} else if ((float) this.anInt7451 < local32 && (float) this.anInt7451 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt7442 * ((float) arg2 * this.aClass25_Sub3_16.aFloat126 + this.aClass25_Sub3_16.aFloat120 * (float) arg1 + this.aClass25_Sub3_16.aFloat121 * (float) arg0 + this.aClass25_Sub3_16.aFloat129) / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt7442 * ((float) arg5 * this.aClass25_Sub3_16.aFloat126 + this.aClass25_Sub3_16.aFloat120 * (float) arg4 + (float) arg3 * this.aClass25_Sub3_16.aFloat121 + this.aClass25_Sub3_16.aFloat129) / local63);
		if ((float) local135 < this.aFloat171 && (float) local167 < this.aFloat171) {
			local7 |= 0x1;
		} else if (this.aFloat169 < (float) local135 && this.aFloat169 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt7464 * (this.aClass25_Sub3_16.aFloat123 * (float) arg2 + this.aClass25_Sub3_16.aFloat127 * (float) arg0 + this.aClass25_Sub3_16.aFloat130 * (float) arg1 + this.aClass25_Sub3_16.aFloat128) / local32);
		@Pc(265) int local265 = (int) ((this.aClass25_Sub3_16.aFloat123 * (float) arg5 + this.aClass25_Sub3_16.aFloat127 * (float) arg3 + (float) arg4 * this.aClass25_Sub3_16.aFloat130 + this.aClass25_Sub3_16.aFloat128) * (float) this.anInt7464 / local63);
		if ((float) local233 < this.aFloat170 && (float) local265 < this.aFloat170) {
			local7 |= 0x4;
		} else if (this.aFloat168 < (float) local233 && this.aFloat168 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8140(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "()Z")
	@Override
	public final boolean method8124() {
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "(I)V")
	private void method6196() {
		this.aBoolean551 = false;
		if (this.aClass60_3 != null) {
			this.aClass60_3.method8298();
		}
		this.method6316();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!br;B)V")
	public final void method6197(@OriginalArg(0) Interface3 arg0) {
		if (arg0 == this.anInterface3Array3[this.anInt7448]) {
			return;
		}
		this.anInterface3Array3[this.anInt7448] = arg0;
		if (arg0 == null) {
			this.method6313();
		} else {
			arg0.method8759();
		}
		this.anInt7474 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(Z)Lclient!jba;")
	public final Class25_Sub3 method6198() {
		if (!this.aBoolean551) {
			this.aClass25_Sub3_20.method4309(this.aClass25_Sub3_18, this.aClass25_Sub3_15);
			this.aBoolean551 = true;
		}
		return this.aClass25_Sub3_20;
	}

	@OriginalMember(owner = "client!sf", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean557) {
			throw new RuntimeException("");
		}
		this.anInt7447 = arg1;
		this.anInt7452 = arg2;
		this.anInt7444 = arg0;
		this.anInt7462 = arg3;
		if (this.aBoolean555) {
			this.aClass60Array3[3].method8299();
			this.aClass60Array3[3].method8294();
		}
	}

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt7443;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BZ)V")
	public final void method6199(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean560) {
			this.aBoolean560 = arg0;
			this.method6200();
			this.anInt7474 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "()Z")
	@Override
	public final boolean method8120() {
		return true;
	}

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "(I)V")
	protected abstract void method6200();

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)F")
	protected abstract float method6201();

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "(I)V")
	public final void method6202() {
		this.method6307();
		this.method6302();
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)Lclient!jba;")
	public final Class25_Sub3 method6203() {
		return this.aClass25_Sub3_18;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
	@Override
	public final int method8122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass25_Sub3_16.aFloat124 * (float) arg2 + (float) arg0 * this.aClass25_Sub3_16.aFloat131 + this.aClass25_Sub3_16.aFloat125 * (float) arg1 + this.aClass25_Sub3_16.aFloat122;
		@Pc(57) float local57 = this.aClass25_Sub3_16.aFloat124 * (float) arg5 + (float) arg4 * this.aClass25_Sub3_16.aFloat125 + this.aClass25_Sub3_16.aFloat131 * (float) arg3 + this.aClass25_Sub3_16.aFloat122;
		if ((float) this.anInt7443 > local32 && local57 < (float) this.anInt7443) {
			local7 |= 0x10;
		} else if ((float) this.anInt7451 < local32 && local57 > (float) this.anInt7451) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass25_Sub3_16.aFloat129 + (float) arg2 * this.aClass25_Sub3_16.aFloat126 + (float) arg1 * this.aClass25_Sub3_16.aFloat120 + (float) arg0 * this.aClass25_Sub3_16.aFloat121) * (float) this.anInt7442 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt7442 * (this.aClass25_Sub3_16.aFloat121 * (float) arg3 + (float) arg4 * this.aClass25_Sub3_16.aFloat120 + this.aClass25_Sub3_16.aFloat126 * (float) arg5 + this.aClass25_Sub3_16.aFloat129) / (float) arg6);
		if ((float) local124 < this.aFloat171 && (float) local157 < this.aFloat171) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat169 && (float) local157 > this.aFloat169) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt7464 * ((float) arg0 * this.aClass25_Sub3_16.aFloat127 + this.aClass25_Sub3_16.aFloat130 * (float) arg1 + (float) arg2 * this.aClass25_Sub3_16.aFloat123 + this.aClass25_Sub3_16.aFloat128) / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt7464 * (this.aClass25_Sub3_16.aFloat128 + this.aClass25_Sub3_16.aFloat123 * (float) arg5 + this.aClass25_Sub3_16.aFloat130 * (float) arg4 + (float) arg3 * this.aClass25_Sub3_16.aFloat127) / (float) arg6);
		if (this.aFloat170 > (float) local224 && (float) local257 < this.aFloat170) {
			local7 |= 0x4;
		} else if ((float) local224 > this.aFloat168 && this.aFloat168 < (float) local257) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ul;BLclient!so;)Z")
	public abstract boolean method6204(@OriginalArg(0) Class361 arg0, @OriginalArg(2) Class330 arg1);

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
	protected abstract void method6205();

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V")
	private void method6206() {
		this.anInterface16_14 = this.method6244(true);
		this.anInterface16_14.method6040(24, 12);
		this.aClass277_22 = this.method6271(new Class355[] { new Class355(Static45.aClass37_1) });
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(Z)Lclient!jba;")
	public final Class25_Sub3 method6207() {
		return this.aClass25_Sub3_15;
	}

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "(I)Lclient!pj;")
	public final Interface20 method6208() {
		return this.aClass106_Sub1_3 == null ? null : this.aClass106_Sub1_3.method3047();
	}

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "()Z")
	@Override
	public final boolean method8187() {
		return true;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(41) float local41 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local10 * local10)));
			local10 *= local41;
			local16 *= local41;
		}
		if (!this.method6295(0.0F, (float) arg1, (float) arg0, local10 + (float) arg2, (float) arg3 + local16, 0.0F)) {
			return;
		}
		this.method6281();
		this.method6263(arg4);
		this.method6284(Static262.aClass188_2, 0);
		this.method6326(0, Static262.aClass188_2);
		this.method6239(arg5);
		this.method6279();
		this.method6305(false);
		this.method6228();
		this.method6305(true);
		this.method6326(0, Static70.aClass188_1);
		this.method6284(Static70.aClass188_1, 0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!jba;I)V")
	public final void method6209(@OriginalArg(0) Class25_Sub3 arg0) {
		this.aClass25_Sub3_15.method4297(arg0);
		this.aBoolean546 = false;
		this.method6323();
	}

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "(I)V")
	protected abstract void method6210();

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(B)V")
	protected abstract void method6211();

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!am;)V")
	public final void method6212(@OriginalArg(1) Class20 arg0) {
		this.aClass20Array3[this.anInt7448] = arg0;
		this.method6243();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([FI)[F")
	public final float[] method6213(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloatArray52[1];
		arg0[12] = this.aFloatArray52[3];
		arg0[8] = this.aFloatArray52[2];
		arg0[0] = this.aFloatArray52[0];
		arg0[1] = this.aFloatArray52[4];
		arg0[5] = this.aFloatArray52[5];
		arg0[2] = this.aFloatArray52[8];
		arg0[9] = this.aFloatArray52[6];
		arg0[13] = this.aFloatArray52[7];
		arg0[14] = this.aFloatArray52[11];
		arg0[3] = this.aFloatArray52[12];
		arg0[10] = this.aFloatArray52[10];
		arg0[6] = this.aFloatArray52[9];
		arg0[7] = this.aFloatArray52[13];
		arg0[15] = this.aFloatArray52[15];
		arg0[11] = this.aFloatArray52[14];
		return arg0;
	}

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "(I)V")
	protected abstract void method6214();

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "(B)V")
	protected abstract void method6215();

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(Z)V")
	public final void method6216() {
		if (this.anInt7474 == 4) {
			return;
		}
		this.method6265();
		this.method6311(false);
		this.method6260(false);
		this.method6199(false);
		this.method6232(false);
		this.method6264(-2, false, false);
		this.method6239(1);
		this.method6233(0);
		this.anInt7474 = 4;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(IIIIZ)Lclient!nf;")
	@Override
	public final Class102 method8148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class102_Sub3 local11 = new Class102_Sub3(this, arg2, arg3, arg4);
		local11.method6954(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "(B)V")
	public final void method6217() {
		if (this.anInt7474 == 2) {
			return;
		}
		this.method6265();
		this.method6311(false);
		this.method6260(false);
		this.method6199(false);
		this.method6232(false);
		this.method6264(-2, false, false);
		this.anInt7474 = 2;
	}

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "(I)V")
	protected abstract void method6218();

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "(I)V")
	protected abstract void method6219();

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "(B)V")
	public final void method6220() {
		this.aClass11Array5 = new Class11[this.anInt7465];
		this.aClass11Array6 = new Class11[this.anInt7465];
		this.aClass25_Sub3Array3 = new Class25_Sub3[this.anInt7465];
		this.anInterface3Array3 = new Interface3[this.anInt7465];
		this.aClass20Array3 = new Class20[this.anInt7465];
		for (@Pc(32) int local32 = 0; local32 < this.anInt7465; local32++) {
			this.aClass11Array6[local32] = Static458.aClass11_4;
			this.aClass11Array5[local32] = Static458.aClass11_4;
			this.aClass20Array3[local32] = Static226.aClass20_7;
			this.aClass25_Sub3Array3[local32] = new Class25_Sub3();
		}
		this.aClass3_Sub7Array5 = new Class3_Sub7[this.anInt7473 - 2];
		this.anInterface3_3 = this.method6300(1, 1, Static553.aClass330_14, Static264.aClass361_8);
		this.method8116(new Class3_Sub14_Sub2(262144));
		this.aClass277_18 = this.method6271(new Class355[] { new Class355(new Class37[] { Static45.aClass37_1, Static45.aClass37_5 }) });
		this.aClass277_17 = this.method6271(new Class355[] { new Class355(new Class37[] { Static45.aClass37_1, Static45.aClass37_3 }) });
		this.aClass277_16 = this.method6271(new Class355[] { new Class355(Static45.aClass37_1), new Class355(Static45.aClass37_3), new Class355(Static45.aClass37_5), new Class355(Static45.aClass37_2) });
		this.aClass277_20 = this.method6271(new Class355[] { new Class355(Static45.aClass37_1), new Class355(Static45.aClass37_3), new Class355(Static45.aClass37_5) });
		this.aClass28_Sub2_29 = new Class28_Sub2(this, 0, 0, false, false);
		this.aClass28_Sub2_28 = new Class28_Sub2(this, 0, 0, true, true);
		this.aClass28_Sub2_27 = new Class28_Sub2(this, 0, 0, false, false);
		this.aClass28_Sub2_21 = new Class28_Sub2(this, 0, 0, true, true);
		this.aClass28_Sub2_30 = new Class28_Sub2(this, 0, 0, false, false);
		this.aClass28_Sub2_24 = new Class28_Sub2(this, 0, 0, true, true);
		this.aClass28_Sub2_22 = new Class28_Sub2(this, 0, 0, false, false);
		this.aClass28_Sub2_25 = new Class28_Sub2(this, 0, 0, true, true);
		this.aClass28_Sub2_23 = new Class28_Sub2(this, 0, 0, false, false);
		this.aClass28_Sub2_26 = new Class28_Sub2(this, 0, 0, true, true);
		this.aClass362_3 = new Class362(this);
		this.anInterface22_5 = this.method6262(true);
		this.method6247();
		this.aClass367_5 = new Class367(this);
		this.aClass60Array3[1] = this.method6231(1);
		this.aClass60Array3[2] = this.method6231(2);
		this.aClass60Array3[4] = this.method6231(4);
		this.aClass60Array3[5] = this.method6231(5);
		this.aClass60Array3[6] = this.method6231(6);
		this.aClass60Array3[7] = this.method6231(7);
		this.aClass60Array3[3] = this.method6231(3);
		this.aClass60Array3[8] = this.method6231(8);
		this.aClass60Array3[9] = this.method6231(9);
		if (!this.aClass60Array3[2].method8296()) {
			this.aClass60Array3[2] = this.method6231(0);
		}
		if (!this.aClass60Array3[4].method8296()) {
			this.aClass60Array3[4] = this.aClass60Array3[2];
		}
		if (!this.aClass60Array3[8].method8296()) {
			this.aClass60Array3[8] = this.aClass60Array3[4];
		}
		if (!this.aClass60Array3[9].method8296()) {
			this.aClass60Array3[9] = this.aClass60Array3[8];
		}
		this.method6195();
		this.la();
		this.method8167();
	}

	@OriginalMember(owner = "client!sf", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt7460, this.anInt7456, this.anInt7442, this.anInt7464 };
	}

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "()Z")
	@Override
	public final boolean method8157() {
		return true;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method8116(@OriginalArg(0) Class3_Sub14 arg0) {
		this.aNativeHeap6 = ((Class3_Sub14_Sub2) arg0).aNativeHeap5;
		this.aNativeHeapBuffer7 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "(I)V")
	private void method6222() {
		this.aFloat170 = (float) (this.anInt7469 - this.anInt7456);
		this.aFloat168 = (float) (this.anInt7475 - this.anInt7456);
		this.aFloat171 = (float) (this.anInt7472 - this.anInt7460);
		this.aFloat169 = (float) (this.anInt7453 - this.anInt7460);
	}

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "(B)V")
	public abstract void method6223();

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "(I)I")
	public final int method6224() {
		return this.anInt7452;
	}

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "(I)V")
	private void method6225() {
		if (this.aBoolean552) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray56;
		@Pc(21) float local21 = (float) (this.anInt7443 * -this.anInt7460) / (float) this.anInt7442;
		@Pc(36) float local36 = (float) ((this.anInt7431 - this.anInt7460) * this.anInt7443) / (float) this.anInt7442;
		@Pc(47) float local47 = (float) (this.anInt7456 * this.anInt7443) / (float) this.anInt7464;
		@Pc(62) float local62 = (float) ((this.anInt7456 - this.anInt7430) * this.anInt7443) / (float) this.anInt7464;
		if (local36 == local21 || local47 == local62) {
			local9[8] = 0.0F;
			local9[12] = 0.0F;
			local9[9] = 0.0F;
			local9[6] = 0.0F;
			local9[14] = 0.0F;
			local9[4] = 0.0F;
			local9[1] = 0.0F;
			local9[3] = 0.0F;
			local9[0] = 1.0F;
			local9[10] = 1.0F;
			local9[11] = 0.0F;
			local9[15] = 1.0F;
			local9[13] = 0.0F;
			local9[5] = 1.0F;
			local9[7] = 0.0F;
			local9[2] = 0.0F;
		} else {
			@Pc(76) float local76 = (float) this.anInt7443 * 2.0F;
			local9[0] = local76 / (local36 - local21);
			local9[4] = 0.0F;
			local9[11] = -1.0F;
			local9[14] = this.aFloat158 = (float) (this.anInt7443 * this.anInt7451) / (float) (this.anInt7443 - this.anInt7451);
			local9[2] = 0.0F;
			local9[15] = 0.0F;
			local9[7] = 0.0F;
			local9[5] = local76 / (local47 - local62);
			local9[9] = (local62 + local47) / (-local62 + local47);
			local9[3] = 0.0F;
			local9[6] = 0.0F;
			local9[10] = this.aFloat160 = (float) this.anInt7451 / (float) (this.anInt7443 - this.anInt7451);
			local9[13] = 0.0F;
			local9[8] = (local21 + local36) / (local36 - local21);
			local9[12] = 0.0F;
			local9[1] = 0.0F;
		}
		this.method6288();
		this.aBoolean552 = true;
	}

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "(I)V")
	public final void method6226() {
		if (Static226.aClass20_7 != this.aClass20Array3[this.anInt7448]) {
			this.aClass20Array3[this.anInt7448] = Static226.aClass20_7;
			this.aClass25_Sub3Array3[this.anInt7448].method4291();
			this.method6243();
		}
	}

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "()Z")
	@Override
	public final boolean method8197() {
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "(I)V")
	private void method6227() {
		this.aFloat173 = (float) this.anInt7451;
	}

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "(I)V")
	private void method6228() {
		this.method6257(0, this.anInterface16_14);
		this.method6287(this.aClass277_22);
		this.method6320(1, Static43.aClass44_1, 0);
	}

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "(Z)V")
	protected abstract void method6229();

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "(I)I")
	public final int method6230() {
		return this.anInt7448;
	}

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "(II)Lclient!mr;")
	protected Class60 method6231(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class60_Sub1(this);
		} else if (arg0 == 1) {
			return new Class60_Sub8(this);
		} else if (arg0 == 2) {
			return new Class60_Sub4(this, this.aClass367_5);
		} else if (arg0 == 7) {
			return new Class60_Sub2(this);
		} else {
			return new Class60_Sub5(this);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZB)V")
	public final void method6232(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean556) {
			this.aBoolean556 = arg0;
			this.method6194();
			this.anInt7474 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "(II)V")
	public final void method6233(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method6241(Static19.aClass11_1, Static19.aClass11_1);
		} else if (arg0 == 0) {
			this.method6241(Static458.aClass11_4, Static458.aClass11_4);
		} else if (arg0 == 2) {
			this.method6241(Static19.aClass11_1, Static49.aClass11_2);
		} else if (arg0 == 3) {
			this.method6241(Static458.aClass11_4, Static333.aClass11_3);
		} else if (arg0 == 4) {
			this.method6241(Static539.aClass11_5, Static539.aClass11_5);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V")
	public final void method6234(@OriginalArg(0) int arg0) {
		if (this.anInt7448 != arg0) {
			this.anInt7448 = arg0;
			this.method6210();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
	public final void method6235(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean559) {
			this.aBoolean559 = arg0;
			this.method6249();
		}
	}

	@OriginalMember(owner = "client!sf", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean557 = false;
	}

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "(I)V")
	private void method6236() {
		if (Static532.aClass7_5 == this.aClass7_3) {
			return;
		}
		@Pc(14) Class7 local14 = this.aClass7_3;
		this.aClass7_3 = Static532.aClass7_5;
		if (!local14.method69()) {
			this.method6196();
		}
		this.method6272();
		this.aFloatArray52 = this.aFloatArray55;
		this.method6302();
		this.anInt7474 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "(I)V")
	protected abstract void method6237();

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "()Z")
	@Override
	public final boolean method8195() {
		return this.aClass60Array3[3].method8296();
	}

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public final Class3_Sub14 method8188(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub14_Sub2 local8 = new Class3_Sub14_Sub2(arg0);
		this.aClass193_39.method4462(local8);
		return local8;
	}

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "(Z)V")
	protected abstract void method6238();

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8184(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
			@Pc(53) Object local53 = this.method6245(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable4.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(IZ)V")
	public final void method6239(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt7466) {
			return;
		}
		@Pc(18) Class393 local18;
		@Pc(16) boolean local16;
		@Pc(20) boolean local20;
		if (arg0 == 1) {
			local16 = true;
			local18 = Static463.aClass393_6;
			local20 = true;
		} else if (arg0 == 2) {
			local20 = false;
			local16 = true;
			local18 = Static667.aClass393_8;
		} else if (arg0 == 128) {
			local20 = true;
			local18 = Static660.aClass393_7;
			local16 = true;
		} else {
			local18 = Static523.aClass393_4;
			local20 = false;
			local16 = false;
		}
		if (this.aBoolean562 != local20) {
			this.aBoolean562 = local20;
			this.method6280();
		}
		if (this.aBoolean549 != local16) {
			this.aBoolean549 = local16;
			this.method6211();
		}
		if (local18 != this.aClass393_5) {
			this.aClass393_5 = local18;
			this.method6321();
		}
		this.anInt7466 = arg0;
		this.anInt7474 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)V")
	@Override
	public final void method8183(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([IIIIIZ)Lclient!nf;")
	@Override
	public final Class102 method8194(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class102_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "()Z")
	@Override
	public final boolean method8179() {
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III[FZIILclient!ul;)Lclient!gl;")
	protected abstract Interface11 method6240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(7) Class361 arg4);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!afa;Lclient!afa;I)V")
	public final void method6241(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg1 != this.aClass11Array5[this.anInt7448]) {
			this.aClass11Array5[this.anInt7448] = arg1;
			this.method6215();
			local5 = true;
		}
		if (arg0 != this.aClass11Array6[this.anInt7448]) {
			this.aClass11Array6[this.anInt7448] = arg0;
			local5 = true;
			this.method6237();
		}
		if (local5) {
			this.anInt7474 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "(I)V")
	protected abstract void method6242();

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
	@Override
	public final void method8139(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "(B)V")
	private void method6243() {
		this.method6309();
		if (this.aClass60_3 != null) {
			this.aClass60_3.method8292();
		}
	}

	@OriginalMember(owner = "client!sf", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7464 = arg3;
		this.anInt7442 = arg2;
		this.anInt7460 = arg0;
		this.anInt7456 = arg1;
		this.method6283();
		this.method6248();
		this.method6307();
		this.method6222();
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(IZ)Lclient!mha;")
	public abstract Interface16 method6244(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method6245(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "(Z)V")
	private void method6246() {
		this.anInterface16_16 = this.method6244(false);
		this.anInterface16_16.method6040(3096, 12);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface16_16.method6041();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method6328(local28);
				local35.b(0.0F);
				local35.b(0.0F);
				local35.b(0.0F);
				for (@Pc(46) int local46 = 0; local46 <= 256; local46++) {
					@Pc(57) double local57 = (double) (local46 * 2) * 3.141592653589793D / 256.0D;
					@Pc(61) float local61 = (float) Math.cos(local57);
					@Pc(65) float local65 = (float) Math.sin(local57);
					if (Stream.c()) {
						local35.b(local65);
						local35.b(local61);
						local35.b(0.0F);
					} else {
						local35.a(local65);
						local35.a(local61);
						local35.a(0.0F);
					}
				}
				local35.b();
				if (this.anInterface16_16.method6039()) {
					break;
				}
			}
		}
		this.aClass277_19 = this.method6271(new Class355[] { new Class355(Static45.aClass37_1) });
	}

	@OriginalMember(owner = "client!sf", name = "C", descriptor = "(I)V")
	protected final void method6247() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable4 != null && !this.aHashtable4.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable4.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method6245(local26));
			}
		}
		this.aHashtable4 = local9;
		this.method6317();
		this.method6206();
		this.method6246();
		this.aClass362_3.method8064(this);
	}

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "(B)V")
	private void method6248() {
		this.aBoolean552 = false;
		this.method6225();
		if (Static642.aClass7_7 == this.aClass7_3) {
			this.method6302();
		}
	}

	@OriginalMember(owner = "client!sf", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass25_Sub3_16.method4306((float) arg2, (float) arg0, (float) arg1);
		if (local14 < (float) this.anInt7443 || local14 > (float) this.anInt7451) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt7442 * this.aClass25_Sub3_16.method4314((float) arg0, (float) arg1, (float) arg2) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt7464 * this.aClass25_Sub3_16.method4327((float) arg2, (float) arg1, (float) arg0) / (float) arg3);
		arg4[0] = (int) ((float) local58 - this.aFloat171);
		arg4[2] = (int) local14;
		arg4[1] = (int) ((float) local77 - this.aFloat170);
	}

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "(B)V")
	protected abstract void method6249();

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "(B)V")
	protected abstract void method6250();

	@OriginalMember(owner = "client!sf", name = "D", descriptor = "(I)V")
	public final void method6251() {
		this.method6266(Static351.aClass44_3, 2);
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt7443 && this.anInt7451 == arg1) {
			return;
		}
		this.anInt7451 = arg1;
		this.anInt7443 = arg0;
		this.method6248();
		this.method6283();
		this.method6289();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method6252(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([BZILclient!ul;IIII)Lclient!gl;")
	protected abstract Interface11 method6253(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class361 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "(B)I")
	public final int method6254() {
		return this.anInt7462;
	}

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "(I)Lclient!jba;")
	public final Class25_Sub3 method6255() {
		return this.aClass25_Sub3Array3[this.anInt7448];
	}

	@OriginalMember(owner = "client!sf", name = "F", descriptor = "(I)V")
	public final void method6256() {
		this.aBoolean546 = false;
		this.method6323();
	}

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "()Z")
	@Override
	public final boolean method8200() {
		return true;
	}

	@OriginalMember(owner = "client!sf", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat157 != arg0) {
			this.aFloat157 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method6205();
			this.method6296();
		}
	}

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V")
	@Override
	public final void method8165(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!en;)V")
	@Override
	public final void method8201(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub1_3 = (Class106_Sub1) arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!mf;I)V")
	@Override
	public final void method8115(@OriginalArg(0) Class237 arg0, @OriginalArg(1) int arg1) {
		this.aClass362_3.method8065(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBLclient!mha;)V")
	public abstract void method6257(@OriginalArg(0) int arg0, @OriginalArg(2) Interface16 arg1);

	@OriginalMember(owner = "client!sf", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8140(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBZ[[I)Lclient!pj;")
	public abstract Interface20 method6258(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[][] arg2);

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "()Lclient!sk;")
	@Override
	public final Class25 method8156() {
		return this.aClass25_Sub3_21;
	}

	@OriginalMember(owner = "client!sf", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt7431 - 1 && arg1 <= 0 && arg3 >= this.anInt7430 - 1) {
			this.la();
			return;
		}
		this.anInt7472 = arg0 >= 0 ? arg0 : 0;
		this.anInt7469 = arg1 >= 0 ? arg1 : 0;
		this.anInt7475 = arg3 <= this.anInt7431 ? arg3 : 0;
		this.anInt7453 = this.anInt7431 < arg2 ? 0 : arg2;
		if (!this.aBoolean566) {
			this.aBoolean566 = true;
			this.method6242();
		}
		this.method6229();
		this.method6222();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ)Lclient!nf;")
	@Override
	public final Class102 method8168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class102_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(ZI)V")
	public final void method6259(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean550 != arg0) {
			this.aBoolean550 = arg0;
			this.method6214();
		}
	}

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "()Z")
	@Override
	public final boolean method8192() {
		return true;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(BZ)V")
	public final void method6260(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean564) {
			this.aBoolean564 = arg0;
			this.method6249();
			this.anInt7474 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!sf", name = "G", descriptor = "(I)V")
	protected final void method6261() {
		@Pc(15) Enumeration local15 = this.aHashtable4.keys();
		while (local15.hasMoreElements()) {
			@Pc(21) Canvas local21 = (Canvas) local15.nextElement();
			this.method6252(this.aHashtable4.get(local21), local21);
		}
		this.anInterface16_15.method7731();
		this.anInterface16_14.method7731();
		this.anInterface16_16.method7731();
		this.aClass28_Sub2_28.method3358();
		this.aClass28_Sub2_21.method3358();
		this.aClass28_Sub2_24.method3358();
		this.aClass28_Sub2_25.method3358();
		this.aClass28_Sub2_26.method3358();
		this.aClass362_3.method8069();
		this.anInterface22_5.method7731();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8118(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas7 == arg0) {
			local5 = this.anObject13;
		} else if (this.aHashtable4.containsKey(arg0)) {
			local5 = this.aHashtable4.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method6269(arg0, local5);
		if (arg0 == this.aCanvas8) {
			this.method6291();
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(ZI)Lclient!ta;")
	public abstract Interface22 method6262(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)V")
	public final void method6263(@OriginalArg(1) int arg0) {
		if (this.anInt7470 != arg0) {
			this.anInt7470 = arg0;
			this.method6238();
		}
	}

	@OriginalMember(owner = "client!sf", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt7446 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt7446++;
		}
		this.anInt7476 = 0x1 << this.anInt7446;
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "()Z")
	@Override
	public final boolean method8149() {
		return this.aBoolean561;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZZ)V")
	public final void method6264(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt7438 || this.aBoolean555 != this.aBoolean557) {
			@Pc(24) Interface11 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean557 ? 3 : 0;
			if (arg0 < 0) {
				this.method6226();
			} else {
				local24 = this.aClass15_3.method143(arg0);
				@Pc(59) Class342 local59 = super.anInterface5_12.method5193(arg0);
				if (local59.aByte130 == 0 && local59.aByte127 == 0) {
					this.method6226();
				} else {
					@Pc(75) int local75 = local59.aBoolean695 ? 64 : 128;
					@Pc(79) int local79 = local75 * 50;
					@Pc(83) Class25_Sub3 local83 = this.method6255();
					local83.method4319(0.0F, (float) (local59.aByte127 * (this.anInt7468 % local79)) / (float) local79, (float) (this.anInt7468 % local79 * local59.aByte130) / (float) local79);
					this.method6212(Static523.aClass20_6);
				}
				local26 = local59.anInt9279;
				if (!this.aBoolean557) {
					local30 = local59.anInt9281;
					local28 = local59.aByte128;
					local37 = local59.aByte129;
				}
			}
			this.method6308(arg2, local37, local30, local28, arg1);
			if (this.aClass60_3 == null) {
				this.method6197(local24);
				this.method6233(local26);
			} else {
				this.aClass60_3.method8295(local24, local26);
			}
			this.aBoolean555 = this.aBoolean557;
			this.anInt7438 = arg0;
		}
		this.anInt7474 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(IIIIII)Lclient!en;")
	@Override
	public final Class106 method8177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class106_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "(I)V")
	private void method6265() {
		if (this.aClass7_3 == Static457.aClass7_4) {
			return;
		}
		@Pc(14) Class7 local14 = this.aClass7_3;
		this.aClass7_3 = Static457.aClass7_4;
		if (local14.method69()) {
			this.method6196();
		}
		this.method6299();
		this.aFloatArray52 = this.aFloatArray54;
		this.method6302();
		this.anInt7474 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!bo;I)V")
	private void method6266(@OriginalArg(1) Class44 arg0, @OriginalArg(2) int arg1) {
		this.method6257(0, this.anInterface16_15);
		this.method6287(this.aClass277_21);
		this.method6320(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "(B)V")
	public final void method6267() {
		if (this.anInt7474 == 8) {
			return;
		}
		this.method6318();
		this.method6311(true);
		this.method6199(true);
		this.method6232(true);
		this.method6239(1);
		this.anInt7474 = 8;
	}

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "(I)V")
	protected abstract void method6268();

	@OriginalMember(owner = "client!sf", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt7451;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIF)Lclient!bq;")
	@Override
	public final Class3_Sub7 method8154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub7_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method6269(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method6270(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[Lclient!ug;)Lclient!wp;")
	public abstract Class277 method6271(@OriginalArg(1) Class355[] arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[Lclient!bq;)V")
	@Override
	public final void method8162(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub7Array5[local7] = arg1[local7];
		}
		this.anInt7471 = arg0;
		if (this.aClass7_3.method69()) {
			this.method6304();
		}
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
	@Override
	public final void method8126() {
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8144(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas7 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.method6252(this.aHashtable4.get(arg0), arg0);
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!sf", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt7475 = this.anInt7430;
		this.anInt7453 = this.anInt7431;
		this.anInt7472 = 0;
		this.anInt7469 = 0;
		if (this.aBoolean566) {
			this.aBoolean566 = false;
			this.method6242();
		}
		this.method6222();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!mf;)V")
	@Override
	public final void method8119(@OriginalArg(0) Class237 arg0) {
		this.aClass362_3.method8065(this, -1, arg0);
	}

	@OriginalMember(owner = "client!sf", name = "J", descriptor = "(I)V")
	private void method6272() {
		if (this.aBoolean553) {
			return;
		}
		@Pc(11) float[] local11 = this.aFloatArray55;
		@Pc(15) float local15 = (float) this.anInt7443;
		@Pc(19) float local19 = (float) this.anInt7451;
		@Pc(31) float local31 = this.aFloat172 * (float) -this.anInt7456 / (float) this.anInt7464;
		@Pc(43) float local43 = this.aFloat172 * (float) -this.anInt7460 / (float) this.anInt7442;
		@Pc(58) float local58 = this.aFloat172 * (float) (this.anInt7431 - this.anInt7460) / (float) this.anInt7442;
		@Pc(73) float local73 = (float) (this.anInt7430 - this.anInt7456) * this.aFloat172 / (float) this.anInt7464;
		if (local58 == local43 || local31 == local73) {
			local11[4] = 0.0F;
			local11[8] = 0.0F;
			local11[7] = 0.0F;
			local11[11] = 0.0F;
			local11[12] = 0.0F;
			local11[0] = 1.0F;
			local11[14] = 0.0F;
			local11[3] = 0.0F;
			local11[13] = 0.0F;
			local11[6] = 0.0F;
			local11[1] = 0.0F;
			local11[2] = 0.0F;
			local11[15] = 1.0F;
			local11[5] = 1.0F;
			local11[9] = 0.0F;
			local11[10] = 1.0F;
		} else {
			local11[5] = 2.0F / (local73 - local31);
			local11[14] = local15 / (local15 - local19);
			local11[9] = 0.0F;
			local11[0] = 2.0F / (local58 - local43);
			local11[15] = 1.0F;
			local11[8] = 0.0F;
			local11[4] = 0.0F;
			local11[2] = 0.0F;
			local11[12] = (local58 + local43) / (local43 - local58);
			local11[7] = 0.0F;
			local11[10] = 1.0F / (local15 - local19);
			local11[13] = (local73 + local31) / (-local31 + local73);
			local11[11] = 0.0F;
			local11[3] = 0.0F;
			local11[6] = 0.0F;
			local11[1] = 0.0F;
		}
		this.method6227();
		this.aBoolean553 = true;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!gs;Z)Lclient!nf;")
	@Override
	public final Class102 method8132(@OriginalArg(0) Class150 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(125) Class102 local125;
		if (arg0.anInt3831 == 0 || arg0.anInt3828 == 0) {
			local125 = this.method8131(1, new int[1], 1, 1);
		} else {
			@Pc(21) int[] local21 = new int[arg0.anInt3828 * arg0.anInt3831];
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg0.aByteArray33 == null) {
				for (local30 = 0; local30 < arg0.anInt3828; local30++) {
					for (local34 = 0; local34 < arg0.anInt3831; local34++) {
						@Pc(47) int local47 = arg0.anIntArray258[arg0.aByteArray34[local23++] & 0xFF];
						local21[local25++] = local47 == 0 ? 0 : local47 | 0xFF000000;
					}
				}
			} else {
				for (local30 = 0; local30 < arg0.anInt3828; local30++) {
					for (local34 = 0; local34 < arg0.anInt3831; local34++) {
						local21[local25++] = arg0.anIntArray258[arg0.aByteArray34[local23] & 0xFF] | arg0.aByteArray33[local23] << 24;
						local23++;
					}
				}
			}
			local125 = this.method8131(arg0.anInt3831, local21, arg0.anInt3828, arg0.anInt3831);
		}
		local125.method6959(arg0.anInt3830, arg0.anInt3826, arg0.anInt3827, arg0.anInt3829);
		return local125;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(BI)Lclient!ta;")
	public final Interface22 method6273(@OriginalArg(1) int arg0) {
		if (this.anInterface22_5.method7727() < arg0 * 2) {
			this.anInterface22_5.method7734(arg0);
		}
		return this.anInterface22_5;
	}

	@OriginalMember(owner = "client!sf", name = "K", descriptor = "(I)I")
	public final int method6274() {
		return this.anInt7447;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIZI[I)Lclient!gl;")
	public final Interface11 method6276(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		return this.method6285(arg2, arg1, 0, arg0, 0, arg3);
	}

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface11 local9 = local6.anInterface11_6;
		this.method6217();
		this.method6197(local9);
		this.method6239(1);
		this.method6241(Static19.aClass11_1, Static19.aClass11_1);
		this.method6284(Static262.aClass188_2, 0);
		this.method6263(arg0);
		this.aClass25_Sub3_15.method4323((float) this.anInt7431, (float) this.anInt7430, 0.0F);
		this.method6256();
		this.aClass25_Sub3Array3[0].method4323(local9.method8762((float) this.anInt7431), local9.method8766((float) this.anInt7430), 1.0F);
		this.aClass25_Sub3Array3[0].method4322(local9.method8762((float) -arg2), 0.0F, local9.method8766((float) -arg3));
		this.aClass20Array3[0] = Static523.aClass20_6;
		this.method6243();
		this.method6251();
		this.method6226();
		this.method6284(Static70.aClass188_1, 0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!jda;ZIZI)V")
	public abstract void method6277(@OriginalArg(0) Class188 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V")
	public abstract void method6278(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sf", name = "L", descriptor = "(I)V")
	public final void method6279() {
		this.aClass25_Sub3_15.method4291();
		this.aBoolean546 = true;
		this.method6323();
	}

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "(B)V")
	protected abstract void method6280();

	@OriginalMember(owner = "client!sf", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7449 == arg0 && arg1 == this.anInt7457 && arg2 == this.anInt7455) {
			return;
		}
		this.anInt7449 = arg0;
		this.anInt7457 = arg1;
		this.anInt7455 = arg2;
		this.method6289();
		this.method6219();
	}

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "(Z)V")
	private void method6281() {
		if (this.anInt7474 == 1) {
			return;
		}
		this.method6265();
		this.method6311(false);
		this.method6260(false);
		this.method6199(false);
		this.method6232(false);
		this.method6264(-2, false, false);
		this.method6233(1);
		this.method6197(this.anInterface3_3);
		this.anInt7474 = 1;
	}

	@OriginalMember(owner = "client!sf", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass25_Sub3_16.method4306((float) arg2, (float) arg0, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt7442 * this.aClass25_Sub3_16.method4314((float) arg0, (float) arg1, (float) arg2) / local14);
			local58 = (int) ((float) this.anInt7464 * this.aClass25_Sub3_16.method4327((float) arg2, (float) arg1, (float) arg0) / local14);
		} else {
			local58 = this.anInt7456;
			local40 = this.anInt7460;
		}
		arg3[1] = (int) ((float) local58 - this.aFloat170);
		arg3[0] = (int) ((float) local40 - this.aFloat171);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8173(@OriginalArg(0) Canvas arg0) {
		this.anObject13 = null;
		this.aCanvas8 = null;
		if (arg0 == null || arg0 == this.aCanvas7) {
			this.anObject13 = this.anObject12;
			this.aCanvas8 = this.aCanvas7;
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.anObject13 = this.aHashtable4.get(arg0);
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.anObject13 == null) {
			throw new RuntimeException();
		}
		this.method6270(this.anObject13, this.aCanvas8);
		this.method6291();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!bl;B)V")
	public abstract void method6282(@OriginalArg(0) Class41 arg0);

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "(B)V")
	private void method6283() {
		this.aBoolean553 = false;
		this.method6272();
		if (Static532.aClass7_5 == this.aClass7_3) {
			this.method6302();
		}
	}

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass25_Sub3_16.method4306((float) arg2, (float) arg0, (float) arg1);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt7442 * this.aClass25_Sub3_16.method4314((float) arg0, (float) arg1, (float) arg2) / local14);
			local25 = (int) ((float) this.anInt7464 * this.aClass25_Sub3_16.method4327((float) arg2, (float) arg1, (float) arg0) / local14);
		} else {
			local25 = this.anInt7456;
			local28 = this.anInt7460;
		}
		arg3[0] = (int) ((float) local28 - this.aFloat171);
		arg3[1] = (int) ((float) local25 - this.aFloat170);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method8169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!jda;ZI)V")
	public final void method6284(@OriginalArg(0) Class188 arg0, @OriginalArg(2) int arg1) {
		this.method6277(arg0, false, arg1, false);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZIBII[I)Lclient!gl;")
	public abstract Interface11 method6285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class104 method8196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class104_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(FI)V")
	public final void method6286(@OriginalArg(0) float arg0) {
		if (this.aFloat172 != arg0) {
			this.aFloat172 = arg0;
			this.method6283();
		}
	}

	@OriginalMember(owner = "client!sf", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean557 = true;
		this.anInt7444 = arg0;
		this.anInt7452 = arg2;
		this.anInt7462 = arg3;
		this.anInt7447 = arg1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!wp;)V")
	public abstract void method6287(@OriginalArg(1) Class277 arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method8147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local10 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local16 * local16 + local10 * local10));
			local18 = (float) Math.atan2((double) local16, (double) local10);
		}
		this.method6281();
		this.method6263(arg4);
		this.method6284(Static262.aClass188_2, 0);
		this.method6326(0, Static262.aClass188_2);
		this.method6239(0);
		this.aClass25_Sub3_15.method4323(local20, (float) arg5, 1.0F);
		this.aClass25_Sub3_15.method4301(0, -arg5 / 2, 0);
		this.aClass25_Sub3_15.method4293((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass25_Sub3_15.method4301(arg0, arg1, 0);
		this.method6256();
		this.method6305(false);
		this.method6251();
		this.method6305(true);
		this.method6326(0, Static70.aClass188_1);
		this.method6284(Static70.aClass188_1, 0);
	}

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "(B)V")
	private void method6288() {
		this.aFloatArray56[10] = this.aFloat160;
		this.aFloatArray56[14] = this.aFloat158;
		this.aFloat167 = ((float) -this.anInt7451 + this.aFloatArray56[14]) / this.aFloatArray56[10];
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method8145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static307.method4714(arg3, arg1, this, arg2, arg0);
	}

	@OriginalMember(owner = "client!sf", name = "M", descriptor = "(I)V")
	private void method6289() {
		if (this.aClass60_3 != null) {
			this.aClass60_3.method8294();
		}
		this.method6218();
	}

	@OriginalMember(owner = "client!sf", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6281();
		this.method6263(arg4);
		this.method6284(Static262.aClass188_2, 0);
		this.method6326(0, Static262.aClass188_2);
		this.method6239(arg5);
		this.aClass25_Sub3_15.method4323((float) arg2, (float) arg3, 1.0F);
		this.aClass25_Sub3_15.method4301(arg0, arg1, 0);
		this.method6256();
		this.method6305(false);
		this.method6251();
		this.method6305(true);
		this.method6326(0, Static70.aClass188_1);
		this.method6284(Static70.aClass188_1, 0);
	}

	@OriginalMember(owner = "client!sf", name = "N", descriptor = "(I)V")
	public final void method6290() {
		if (this.anInt7474 == 16) {
			return;
		}
		this.method6236();
		this.method6311(true);
		this.method6199(true);
		this.method6232(true);
		this.method6239(1);
		this.anInt7474 = 16;
	}

	@OriginalMember(owner = "client!sf", name = "O", descriptor = "(I)V")
	private void method6291() {
		if (this.aCanvas8 == null) {
			this.anInt7403 = this.anInt7313 = 1;
		} else {
			@Pc(22) Dimension local22 = this.aCanvas8.getSize();
			this.anInt7403 = local22.width;
			this.anInt7313 = local22.height;
		}
		this.anInt7430 = this.anInt7313;
		this.anInt7431 = this.anInt7403;
		this.method6293();
		this.method6248();
		this.method6283();
		this.method6325();
		this.method6222();
		this.method6307();
		this.la();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!so;ZLclient!ul;)Z")
	public abstract boolean method6292(@OriginalArg(0) Class330 arg0, @OriginalArg(2) Class361 arg1);

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "(I)V")
	private void method6293() {
		this.bf = false;
		if (Static457.aClass7_4 == this.aClass7_3) {
			this.method6299();
			this.method6302();
		}
	}

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "(I)[F")
	public final float[] method6294() {
		return this.aFloatArray53;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(FFFIFFF)Z")
	private boolean method6295(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(15) Buffer local15 = this.anInterface16_14.method6041();
		if (local15 == null) {
			return false;
		}
		@Pc(24) Stream local24 = this.method6328(local15);
		if (Stream.c()) {
			local24.b(arg2);
			local24.b(arg1);
			local24.b(arg0);
			local24.b(arg3);
			local24.b(arg4);
			local24.b(arg5);
		} else {
			local24.a(arg2);
			local24.a(arg1);
			local24.a(arg0);
			local24.a(arg3);
			local24.a(arg4);
			local24.a(arg5);
		}
		local24.b();
		return this.anInterface16_14.method6039();
	}

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "(B)V")
	protected abstract void method6296();

	@OriginalMember(owner = "client!sf", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7472;
		arg0[2] = this.anInt7453;
		arg0[3] = this.anInt7475;
		arg0[1] = this.anInt7469;
	}

	@OriginalMember(owner = "client!sf", name = "R", descriptor = "(I)Lclient!jba;")
	public final Class25_Sub3 method6297() {
		return this.aClass25_Sub3Array3[this.anInt7448];
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[BILclient!ul;II)Lclient!vga;")
	public abstract Interface24 method6298(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class361 arg1);

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
	@Override
	public final void method8133(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!sf", name = "S", descriptor = "(I)V")
	private void method6299() {
		if (this.bf) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray54;
		if (this.anInt7431 == 0 || this.anInt7430 == 0) {
			local5[1] = 0.0F;
			local5[0] = 1.0F;
			local5[15] = 1.0F;
			local5[8] = 0.0F;
			local5[11] = 0.0F;
			local5[7] = 0.0F;
			local5[3] = 0.0F;
			local5[9] = 0.0F;
			local5[6] = 0.0F;
			local5[14] = 0.0F;
			local5[2] = 0.0F;
			local5[4] = 0.0F;
			local5[10] = 1.0F;
			local5[12] = 0.0F;
			local5[13] = 0.0F;
			local5[5] = 1.0F;
		} else {
			local5[1] = 0.0F;
			local5[0] = 2.0F / (float) this.anInt7431;
			local5[4] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt7430;
			local5[7] = 0.0F;
			local5[11] = 0.0F;
			local5[13] = 1.0F;
			local5[12] = -1.0F;
			local5[6] = 0.0F;
			local5[2] = 0.0F;
			local5[14] = 0.5F;
			local5[8] = 0.0F;
			local5[9] = 0.0F;
			local5[3] = 0.0F;
			local5[10] = 0.5F;
			local5[15] = 1.0F;
		}
		this.bf = true;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!so;ZLclient!ul;)Lclient!gl;")
	public abstract Interface11 method6300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(4) Class361 arg3);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ul;IBI[BZ)Lclient!gl;")
	public final Interface11 method6301(@OriginalArg(0) Class361 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) boolean arg4) {
		return this.method6253(arg3, arg4, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!sf", name = "T", descriptor = "(I)V")
	private void method6302() {
		this.method6268();
		if (this.aClass60_3 != null) {
			this.aClass60_3.method8303();
		}
	}

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "()Lclient!sk;")
	@Override
	public final Class25 method8178() {
		return new Class25_Sub3();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!jda;IIZ)V")
	protected abstract void method6303(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method8171() {
	}

	@OriginalMember(owner = "client!sf", name = "U", descriptor = "(I)V")
	protected void method6304() {
		this.anInt7445 = this.anInt7471;
		this.anInt7471 = 0;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(ZB)V")
	public abstract void method6305(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!ta;Lclient!bo;BIII)V")
	public abstract void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) Interface22 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "(B)V")
	public final void method6307() {
		if (this.aClass7_3 == Static602.aClass7_6) {
			return;
		}
		@Pc(10) Class7 local10 = this.aClass7_3;
		this.aClass7_3 = Static602.aClass7_6;
		if (local10.method69()) {
			this.method6196();
		}
		this.anInt7474 &= 0xFFFFFFE0;
		this.aFloatArray52 = this.aFloatArray53;
	}

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "()V")
	@Override
	protected void method8163() {
		if (this.aBoolean548) {
			return;
		}
		for (@Pc(9) Class3 local9 = this.aClass193_39.method4457(); local9 != null; local9 = this.aClass193_39.method4459()) {
			((Class3_Sub14_Sub2) local9).method5700();
		}
		@Pc(26) Enumeration local26 = this.aHashtable4.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method6252(this.aHashtable4.get(local32), local32);
		}
		Static22.method745(false, true);
		this.aNativeInterface3.release();
		this.aBoolean548 = true;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!kc;[Lclient!gs;Z)Lclient!da;")
	@Override
	public final Class69 method8117(@OriginalArg(0) Class202 arg0, @OriginalArg(1) Class150[] arg1) {
		return new Class69_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt7433 + this.anInt7432 + this.anInt7435;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZZIIIZ)V")
	private void method6308(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) boolean local4 = arg0 & this.method8195();
		if (!local4 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg2 = 1;
			arg3 = 0;
		}
		if (arg1 != 0 && arg4) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt7458 != arg1) {
			if (this.anInt7458 != 0) {
				this.aClass60Array3[this.anInt7458 & Integer.MAX_VALUE].method8300();
			}
			if (arg1 == 0) {
				this.aClass60_3 = null;
			} else {
				this.aClass60_3 = this.aClass60Array3[arg1 & Integer.MAX_VALUE];
				this.aClass60_3.method8293(arg4);
				this.aClass60_3.method8302(arg4);
				this.aClass60_3.method8291(arg3, arg2);
			}
			this.anInt7458 = arg1;
			this.anInt7450 = arg3;
			this.anInt7467 = arg2;
		} else if (this.anInt7458 != 0) {
			this.aClass60Array3[this.anInt7458 & Integer.MAX_VALUE].method8302(arg4);
			if (arg3 != this.anInt7450 || this.anInt7467 != arg2) {
				this.aClass60Array3[Integer.MAX_VALUE & this.anInt7458].method8291(arg3, arg2);
				this.anInt7450 = arg3;
				this.anInt7467 = arg2;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sf", name = "V", descriptor = "(I)V")
	protected abstract void method6309();

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "()Z")
	@Override
	public final boolean method8191() {
		return true;
	}

	@OriginalMember(owner = "client!sf", name = "W", descriptor = "(I)Lclient!jba;")
	public final Class25_Sub3 method6310() {
		return this.aClass25_Sub3_19;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(ZI)V")
	public final void method6311(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean554) {
			this.aBoolean554 = arg0;
			this.method6219();
			this.anInt7474 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!sf", name = "Y", descriptor = "(I)V")
	protected abstract void method6312();

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "()I")
	@Override
	public final int method8130() {
		return this.anInt7473 - 2;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public final void method8135(@OriginalArg(0) Class25 arg0) {
		this.aClass25_Sub3_16 = (Class25_Sub3) arg0;
		this.aClass25_Sub3_18.method4297(this.aClass25_Sub3_16);
		this.aClass25_Sub3_18.method4324();
		this.aClass25_Sub3_19.method4326(this.aClass25_Sub3_18);
		this.aClass25_Sub3_17.method4326(this.aClass25_Sub3_16);
		if (this.aClass7_3.method69()) {
			this.method6196();
		}
	}

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "(II)I")
	@Override
	public final int method8198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!sf", name = "Z", descriptor = "(I)V")
	protected abstract void method6313();

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZILclient!ul;IB[F)Lclient!gl;")
	public final Interface11 method6314(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class361 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float[] arg4) {
		return this.method6240(arg3, arg1, arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!sf", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt7459 != arg0;
		if (local11 || arg1 != this.aFloat164 || this.aFloat166 != arg2) {
			this.aFloat166 = arg2;
			this.anInt7459 = arg0;
			this.aFloat164 = arg1;
			if (local11) {
				this.aFloat161 = (float) (this.anInt7459 & 0xFF0000) / 1.671168E7F;
				this.aFloat163 = (float) (this.anInt7459 & 0xFF) / 255.0F;
				this.aFloat159 = (float) (this.anInt7459 & 0xFF00) / 65280.0F;
				this.method6205();
			}
			this.aNativeInterface3.setSunColour(this.aFloat161, this.aFloat159, this.aFloat163, arg1, arg2);
			this.method6250();
		}
		if (this.aFloatArray59[0] != arg3 || arg4 != this.aFloatArray59[1] || this.aFloatArray59[2] != arg5) {
			this.aFloatArray59[1] = arg4;
			this.aFloatArray59[0] = arg3;
			this.aFloatArray59[2] = arg5;
			this.aFloatArray60[1] = -arg4;
			this.aFloatArray60[0] = -arg3;
			this.aFloatArray60[2] = -arg5;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
			this.aFloatArray57[0] = local149 * arg3;
			this.aFloatArray57[1] = local149 * arg4;
			this.aFloatArray57[2] = arg5 * local149;
			this.aFloatArray58[1] = -this.aFloatArray57[1];
			this.aFloatArray58[2] = -this.aFloatArray57[2];
			this.aFloatArray58[0] = -this.aFloatArray57[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray57[0], this.aFloatArray57[1], this.aFloatArray57[2]);
			this.method6223();
			this.anInt7439 = (int) (arg3 * 256.0F / arg4);
			this.anInt7463 = (int) (arg5 * 256.0F / arg4);
		}
		this.method6296();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method6315(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap6.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "(B)V")
	protected abstract void method6316();

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "(B)V")
	private void method6317() {
		this.anInterface16_15 = this.method6244(false);
		this.anInterface16_15.method6040(140, 28);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface16_15.method6041();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method6328(local28);
				if (Stream.c()) {
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(1.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(1.0F);
					local35.b(0.0F);
					local35.b(1.0F);
					local35.b(1.0F);
					local35.b(1.0F);
					local35.b(0.0F);
					local35.b(1.0F);
					local35.b(1.0F);
					local35.b(1.0F);
					local35.b(1.0F);
					local35.b(1.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(1.0F);
					local35.b(0.0F);
					local35.b(1.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
				} else {
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(1.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(1.0F);
					local35.a(0.0F);
					local35.a(1.0F);
					local35.a(1.0F);
					local35.a(1.0F);
					local35.a(0.0F);
					local35.a(1.0F);
					local35.a(1.0F);
					local35.a(1.0F);
					local35.a(1.0F);
					local35.a(1.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(1.0F);
					local35.a(0.0F);
					local35.a(1.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
				}
				local35.b();
				if (this.anInterface16_15.method6039()) {
					break;
				}
			}
		}
		this.aClass277_21 = this.method6271(new Class355[] { new Class355(new Class37[] { Static45.aClass37_1, Static45.aClass37_5, Static45.aClass37_5 }) });
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method8129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(17) float local17 = (float) arg3 - (float) arg1;
		@Pc(38) float local38;
		if (local11 == 0.0F && local17 == 0.0F) {
			local11 = 1.0F;
		} else {
			local38 = (float) (1.0D / Math.sqrt((double) (local11 * local11 + local17 * local17)));
			local17 *= local38;
			local11 *= local38;
		}
		this.method6281();
		this.method6263(arg4);
		this.method6284(Static262.aClass188_2, 0);
		this.method6326(0, Static262.aClass188_2);
		this.method6239(1);
		this.method6279();
		@Pc(80) int local80 = arg7 % (arg5 + arg6);
		this.method6305(false);
		local38 = local11 * (float) arg5;
		@Pc(94) float local94 = (float) arg5 * local17;
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = local38;
		@Pc(102) float local102 = local94;
		if (local80 > arg5) {
			local98 = (float) (arg5 + arg6 - local80) * local17;
			local96 = (float) (arg5 + arg6 - local80) * local11;
		} else {
			local100 = local11 * (float) (arg5 - local80);
			local102 = local17 * (float) (arg5 - local80);
		}
		@Pc(148) float local148 = local96 + (float) arg0;
		@Pc(153) float local153 = local98 + (float) arg1;
		@Pc(158) float local158 = local11 * (float) arg6;
		@Pc(163) float local163 = local17 * (float) arg6;
		while (true) {
			if (arg0 < arg2) {
				if ((float) arg2 < local148) {
					break;
				}
				if (local100 + local148 > (float) arg2) {
					local100 = (float) arg2 - local148;
				}
			} else {
				if (local148 < (float) arg2) {
					break;
				}
				if ((float) arg2 > local100 + local148) {
					local100 = (float) arg2 - local148;
				}
			}
			if (arg3 > arg1) {
				if ((float) arg3 < local153) {
					break;
				}
				if ((float) arg3 < local102 + local153) {
					local102 = (float) arg3 - local153;
				}
			} else {
				if ((float) arg3 > local153) {
					break;
				}
				if (local102 + local153 < (float) arg3) {
					local102 = (float) arg3 - local153;
				}
			}
			if (!this.method6295(0.0F, local153, local148, local148 + local100, local102 + local153, 0.0F)) {
				return;
			}
			local148 += local158 + local100;
			local153 += local102 + local163;
			this.method6228();
			local100 = local38;
			local102 = local94;
		}
		this.method6305(true);
		this.method6326(0, Static70.aClass188_1);
		this.method6284(Static70.aClass188_1, 0);
	}

	@OriginalMember(owner = "client!sf", name = "ab", descriptor = "(I)V")
	private void method6318() {
		if (Static642.aClass7_7 == this.aClass7_3) {
			return;
		}
		@Pc(6) Class7 local6 = this.aClass7_3;
		this.aClass7_3 = Static642.aClass7_7;
		if (!local6.method69()) {
			this.method6196();
		}
		this.method6225();
		this.aFloatArray52 = this.aFloatArray56;
		this.method6302();
		this.anInt7474 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "()Lclient!sk;")
	@Override
	public final Class25 method8159() {
		return this.aClass25_Sub3_16;
	}

	@OriginalMember(owner = "client!sf", name = "bb", descriptor = "(I)V")
	private void method6319() {
		this.method6205();
		this.method6250();
		this.method6249();
		this.method6304();
		this.method6223();
		this.method6296();
		this.method6214();
		this.method6200();
		this.method6194();
		this.method6219();
		this.method6218();
		this.method6211();
		this.method6321();
		this.method6280();
		for (@Pc(54) int local54 = this.anInt7465 - 1; local54 >= 0; local54--) {
			this.method6234(local54);
			this.method6215();
			this.method6237();
			this.method6226();
		}
		this.method6238();
		this.method6325();
		this.method6268();
		this.method6312();
		this.method6316();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!bo;I)V")
	public abstract void method6320(@OriginalArg(1) int arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "(B)V")
	protected abstract void method6321();

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([I)V")
	@Override
	public final void method8190(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt7430;
		arg0[0] = this.anInt7431;
	}

	@OriginalMember(owner = "client!sf", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt7472 < arg0) {
			local5 = true;
			this.anInt7472 = arg0;
		}
		if (arg2 < this.anInt7453) {
			this.anInt7453 = arg2;
			local5 = true;
		}
		if (this.anInt7469 < arg1) {
			local5 = true;
			this.anInt7469 = arg1;
		}
		if (this.anInt7475 > arg3) {
			local5 = true;
			this.anInt7475 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean566) {
			this.aBoolean566 = true;
			this.method6242();
		}
		this.method6229();
		this.method6222();
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method8146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method6201();
		this.method6281();
		this.method6263(arg4);
		this.method6284(Static262.aClass188_2, 0);
		this.method6326(0, Static262.aClass188_2);
		this.method6239(arg5);
		this.aClass25_Sub3_15.method4323((float) (arg2 - 1), (float) (arg3 - 1), 1.0F);
		this.aClass25_Sub3_15.method4322((float) arg0 - local7, 0.0F, (float) arg1 - local7);
		this.method6256();
		this.method6305(false);
		this.method6266(Static576.aClass44_6, 4);
		this.method6305(true);
		this.method6326(0, Static70.aClass188_1);
		this.method6284(Static70.aClass188_1, 0);
	}

	@OriginalMember(owner = "client!sf", name = "cb", descriptor = "(I)I")
	public final int method6322() {
		return this.anInt7444;
	}

	@OriginalMember(owner = "client!sf", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean565 = arg0;
		this.method6194();
	}

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "(B)V")
	private void method6323() {
		if (this.aClass7_3 == Static457.aClass7_4) {
			@Pc(11) float local11 = this.method6201();
			this.aClass25_Sub3_15.method4322(local11, 0.0F, local11);
		}
		this.aBoolean551 = false;
		this.method6312();
		if (this.aClass60_3 != null) {
			this.aClass60_3.method8297();
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(IB)V")
	public final void method6324(@OriginalArg(1) byte arg0) {
		this.method6263(arg0 | arg0 << 16 | arg0 << 24 | arg0 << 8);
	}

	@OriginalMember(owner = "client!sf", name = "db", descriptor = "(I)V")
	protected abstract void method6325();

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILclient!jda;)V")
	public final void method6326(@OriginalArg(1) int arg0, @OriginalArg(2) Class188 arg1) {
		this.method6303(arg1, arg0);
	}

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "()V")
	@Override
	public final void method8161() {
		if (this.aClass15_3 != null) {
			this.aClass15_3.method138();
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(ZB)V")
	public final void method6327(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean547) {
			this.aBoolean547 = arg0;
			this.method6219();
		}
	}

	@OriginalMember(owner = "client!sf", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt7477;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method6328(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}
}
