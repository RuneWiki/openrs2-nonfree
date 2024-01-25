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

@OriginalClass("client!um")
public abstract class Class162_Sub1 extends Class162 {

	@OriginalMember(owner = "client!um", name = "sb", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable4;

	@OriginalMember(owner = "client!um", name = "Ib", descriptor = "Lclient!gb;")
	protected Class120 aClass120_6;

	@OriginalMember(owner = "client!um", name = "Lb", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!um", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!um", name = "Jc", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!um", name = "xd", descriptor = "I")
	protected int anInt4564;

	@OriginalMember(owner = "client!um", name = "Dd", descriptor = "I")
	public int anInt4570;

	@OriginalMember(owner = "client!um", name = "Ld", descriptor = "I")
	public int anInt4577;

	@OriginalMember(owner = "client!um", name = "ce", descriptor = "I")
	public int anInt4587;

	@OriginalMember(owner = "client!um", name = "ee", descriptor = "[Lclient!tg;")
	protected Class2_Sub11[] aClass2_Sub11Array4;

	@OriginalMember(owner = "client!um", name = "fe", descriptor = "Lclient!he;")
	private Class17_Sub2 aClass17_Sub2_3;

	@OriginalMember(owner = "client!um", name = "he", descriptor = "[Lclient!qda;")
	private Interface20[] anInterface20Array3;

	@OriginalMember(owner = "client!um", name = "ie", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!um", name = "je", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!um", name = "le", descriptor = "[Lclient!vf;")
	protected Class348[] aClass348Array3;

	@OriginalMember(owner = "client!um", name = "ne", descriptor = "I")
	protected int anInt4589;

	@OriginalMember(owner = "client!um", name = "ue", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!um", name = "we", descriptor = "Z")
	protected boolean aBoolean336;

	@OriginalMember(owner = "client!um", name = "ye", descriptor = "F")
	private float aFloat134;

	@OriginalMember(owner = "client!um", name = "Be", descriptor = "F")
	private float aFloat135;

	@OriginalMember(owner = "client!um", name = "De", descriptor = "I")
	protected int anInt4595;

	@OriginalMember(owner = "client!um", name = "Le", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!um", name = "Me", descriptor = "Z")
	public boolean aBoolean341;

	@OriginalMember(owner = "client!um", name = "Ne", descriptor = "I")
	public int anInt4597;

	@OriginalMember(owner = "client!um", name = "Re", descriptor = "[Lclient!nw;")
	protected Class247[] aClass247Array5;

	@OriginalMember(owner = "client!um", name = "Ve", descriptor = "I")
	protected int anInt4602;

	@OriginalMember(owner = "client!um", name = "Xe", descriptor = "Lclient!pi;")
	private Class269 aClass269_3;

	@OriginalMember(owner = "client!um", name = "hf", descriptor = "[Lclient!ica;")
	protected Class25_Sub2[] aClass25_Sub2Array3;

	@OriginalMember(owner = "client!um", name = "kf", descriptor = "[Lclient!nw;")
	protected Class247[] aClass247Array6;

	@OriginalMember(owner = "client!um", name = "lf", descriptor = "I")
	protected int anInt4607;

	@OriginalMember(owner = "client!um", name = "of", descriptor = "I")
	public int anInt4609;

	@OriginalMember(owner = "client!um", name = "pf", descriptor = "I")
	private int anInt4610;

	@OriginalMember(owner = "client!um", name = "sf", descriptor = "Lclient!qda;")
	public Interface20 anInterface20_3;

	@OriginalMember(owner = "client!um", name = "tf", descriptor = "I")
	public int anInt4612;

	@OriginalMember(owner = "client!um", name = "wf", descriptor = "Z")
	public boolean aBoolean344;

	@OriginalMember(owner = "client!um", name = "Af", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!um", name = "Jf", descriptor = "Z")
	protected boolean aBoolean347;

	@OriginalMember(owner = "client!um", name = "Kf", descriptor = "I")
	private int anInt4622;

	@OriginalMember(owner = "client!um", name = "Nf", descriptor = "Lclient!wc;")
	private Class34 aClass34_3;

	@OriginalMember(owner = "client!um", name = "Of", descriptor = "Z")
	public boolean aBoolean349;

	@OriginalMember(owner = "client!um", name = "Sf", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!um", name = "Xf", descriptor = "Lclient!de;")
	public Class33_Sub2 aClass33_Sub2_21;

	@OriginalMember(owner = "client!um", name = "Yf", descriptor = "Lclient!de;")
	public Class33_Sub2 aClass33_Sub2_22;

	@OriginalMember(owner = "client!um", name = "Zf", descriptor = "Lclient!de;")
	public Class33_Sub2 aClass33_Sub2_23;

	@OriginalMember(owner = "client!um", name = "ag", descriptor = "Lclient!ega;")
	private Interface8 anInterface8_8;

	@OriginalMember(owner = "client!um", name = "bg", descriptor = "Lclient!de;")
	public Class33_Sub2 aClass33_Sub2_24;

	@OriginalMember(owner = "client!um", name = "cg", descriptor = "Lclient!cl;")
	public Class59 aClass59_13;

	@OriginalMember(owner = "client!um", name = "dg", descriptor = "Lclient!de;")
	public Class33_Sub2 aClass33_Sub2_25;

	@OriginalMember(owner = "client!um", name = "eg", descriptor = "Lclient!de;")
	public Class33_Sub2 aClass33_Sub2_26;

	@OriginalMember(owner = "client!um", name = "fg", descriptor = "Lclient!cl;")
	public Class59 aClass59_14;

	@OriginalMember(owner = "client!um", name = "gg", descriptor = "Lclient!ip;")
	private Interface13 anInterface13_4;

	@OriginalMember(owner = "client!um", name = "hg", descriptor = "Lclient!de;")
	public Class33_Sub2 aClass33_Sub2_27;

	@OriginalMember(owner = "client!um", name = "ig", descriptor = "Lclient!de;")
	public Class33_Sub2 aClass33_Sub2_28;

	@OriginalMember(owner = "client!um", name = "jg", descriptor = "Lclient!de;")
	public Class33_Sub2 aClass33_Sub2_29;

	@OriginalMember(owner = "client!um", name = "kg", descriptor = "Lclient!de;")
	public Class33_Sub2 aClass33_Sub2_30;

	@OriginalMember(owner = "client!um", name = "lg", descriptor = "Lclient!cl;")
	private Class59 aClass59_15;

	@OriginalMember(owner = "client!um", name = "mg", descriptor = "Lclient!ega;")
	private Interface8 anInterface8_9;

	@OriginalMember(owner = "client!um", name = "ng", descriptor = "Lclient!cl;")
	public Class59 aClass59_16;

	@OriginalMember(owner = "client!um", name = "pg", descriptor = "Lclient!cl;")
	public Class59 aClass59_17;

	@OriginalMember(owner = "client!um", name = "qg", descriptor = "Lclient!cl;")
	private Class59 aClass59_18;

	@OriginalMember(owner = "client!um", name = "rg", descriptor = "I")
	private int anInt4626;

	@OriginalMember(owner = "client!um", name = "sg", descriptor = "Z")
	protected boolean aBoolean351;

	@OriginalMember(owner = "client!um", name = "M", descriptor = "Lclient!dc;")
	private final Class70 aClass70_27 = new Class70();

	@OriginalMember(owner = "client!um", name = "od", descriptor = "Z")
	protected boolean aBoolean330 = true;

	@OriginalMember(owner = "client!um", name = "td", descriptor = "Lclient!ica;")
	protected final Class25_Sub2 aClass25_Sub2_15 = new Class25_Sub2();

	@OriginalMember(owner = "client!um", name = "Td", descriptor = "Lclient!ica;")
	public Class25_Sub2 aClass25_Sub2_16 = new Class25_Sub2();

	@OriginalMember(owner = "client!um", name = "Vd", descriptor = "Lclient!ica;")
	public final Class25_Sub2 aClass25_Sub2_17 = new Class25_Sub2();

	@OriginalMember(owner = "client!um", name = "Wd", descriptor = "Lclient!ica;")
	protected final Class25_Sub2 aClass25_Sub2_18 = new Class25_Sub2();

	@OriginalMember(owner = "client!um", name = "Xd", descriptor = "Lclient!ica;")
	private final Class25_Sub2 aClass25_Sub2_19 = new Class25_Sub2();

	@OriginalMember(owner = "client!um", name = "Yd", descriptor = "Lclient!ica;")
	private final Class25_Sub2 aClass25_Sub2_20 = new Class25_Sub2();

	@OriginalMember(owner = "client!um", name = "be", descriptor = "I")
	private int anInt4586 = 16777215;

	@OriginalMember(owner = "client!um", name = "me", descriptor = "F")
	public float aFloat132 = 3584.0F;

	@OriginalMember(owner = "client!um", name = "te", descriptor = "Lclient!oba;")
	protected Class250 aClass250_9 = Static40.aClass250_1;

	@OriginalMember(owner = "client!um", name = "re", descriptor = "I")
	protected int anInt4593 = 0;

	@OriginalMember(owner = "client!um", name = "Ce", descriptor = "[F")
	private final float[] aFloatArray36 = new float[16];

	@OriginalMember(owner = "client!um", name = "qe", descriptor = "I")
	protected final int anInt4592 = 0;

	@OriginalMember(owner = "client!um", name = "ae", descriptor = "Z")
	protected boolean aBoolean332 = true;

	@OriginalMember(owner = "client!um", name = "Ge", descriptor = "F")
	private float aFloat136 = 1.0F;

	@OriginalMember(owner = "client!um", name = "We", descriptor = "I")
	protected int anInt4603 = 3584;

	@OriginalMember(owner = "client!um", name = "He", descriptor = "Z")
	protected boolean aBoolean339 = false;

	@OriginalMember(owner = "client!um", name = "Ye", descriptor = "I")
	public int anInt4604 = -1;

	@OriginalMember(owner = "client!um", name = "mf", descriptor = "I")
	public int anInt4608 = 0;

	@OriginalMember(owner = "client!um", name = "de", descriptor = "I")
	public int anInt4588 = 512;

	@OriginalMember(owner = "client!um", name = "Ue", descriptor = "I")
	private int anInt4601 = 0;

	@OriginalMember(owner = "client!um", name = "Ee", descriptor = "Lclient!vs;")
	protected Class354 aClass354_6 = Static51.aClass354_2;

	@OriginalMember(owner = "client!um", name = "oe", descriptor = "I")
	public int anInt4590 = 512;

	@OriginalMember(owner = "client!um", name = "ve", descriptor = "Z")
	protected boolean aBoolean335 = true;

	@OriginalMember(owner = "client!um", name = "Oe", descriptor = "Z")
	protected boolean aBoolean342 = true;

	@OriginalMember(owner = "client!um", name = "Zd", descriptor = "Z")
	private boolean aBoolean331 = false;

	@OriginalMember(owner = "client!um", name = "xe", descriptor = "Z")
	private boolean aBoolean337 = false;

	@OriginalMember(owner = "client!um", name = "Qe", descriptor = "I")
	private int anInt4599 = -1;

	@OriginalMember(owner = "client!um", name = "Te", descriptor = "I")
	private int anInt4600 = 0;

	@OriginalMember(owner = "client!um", name = "df", descriptor = "I")
	public int anInt4605 = 50;

	@OriginalMember(owner = "client!um", name = "Je", descriptor = "Z")
	private boolean aBoolean340 = false;

	@OriginalMember(owner = "client!um", name = "cf", descriptor = "F")
	public float aFloat139 = 1.0F;

	@OriginalMember(owner = "client!um", name = "pe", descriptor = "I")
	public int anInt4591 = 128;

	@OriginalMember(owner = "client!um", name = "zf", descriptor = "I")
	protected int anInt4617 = 0;

	@OriginalMember(owner = "client!um", name = "Fe", descriptor = "Z")
	private boolean aBoolean338 = false;

	@OriginalMember(owner = "client!um", name = "Se", descriptor = "[Lclient!wc;")
	private final Class34[] aClass34Array3 = new Class34[10];

	@OriginalMember(owner = "client!um", name = "xf", descriptor = "I")
	public int anInt4615 = 0;

	@OriginalMember(owner = "client!um", name = "Ie", descriptor = "[F")
	private final float[] aFloatArray37 = new float[16];

	@OriginalMember(owner = "client!um", name = "gf", descriptor = "F")
	public float aFloat140 = -1.0F;

	@OriginalMember(owner = "client!um", name = "yf", descriptor = "I")
	protected int anInt4616 = 0;

	@OriginalMember(owner = "client!um", name = "Ff", descriptor = "[F")
	private final float[] aFloatArray41 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!um", name = "Bf", descriptor = "Z")
	private boolean aBoolean345 = false;

	@OriginalMember(owner = "client!um", name = "ge", descriptor = "F")
	public float aFloat129 = 3584.0F;

	@OriginalMember(owner = "client!um", name = "Ze", descriptor = "F")
	public float aFloat138 = 1.0F;

	@OriginalMember(owner = "client!um", name = "qf", descriptor = "I")
	protected final int anInt4611 = 0;

	@OriginalMember(owner = "client!um", name = "Lf", descriptor = "Z")
	protected boolean aBoolean348 = true;

	@OriginalMember(owner = "client!um", name = "ze", descriptor = "I")
	private int anInt4594 = 0;

	@OriginalMember(owner = "client!um", name = "rf", descriptor = "[F")
	private final float[] aFloatArray40 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!um", name = "vf", descriptor = "I")
	protected int anInt4614 = 0;

	@OriginalMember(owner = "client!um", name = "uf", descriptor = "I")
	private int anInt4613 = 0;

	@OriginalMember(owner = "client!um", name = "se", descriptor = "Z")
	protected boolean aBoolean334 = false;

	@OriginalMember(owner = "client!um", name = "Cf", descriptor = "I")
	private int anInt4618 = -1;

	@OriginalMember(owner = "client!um", name = "nf", descriptor = "[F")
	public final float[] aFloatArray39 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!um", name = "Mf", descriptor = "F")
	public float aFloat142 = -1.0F;

	@OriginalMember(owner = "client!um", name = "Pf", descriptor = "I")
	private int anInt4623 = 1;

	@OriginalMember(owner = "client!um", name = "jf", descriptor = "Z")
	protected boolean aBoolean343 = true;

	@OriginalMember(owner = "client!um", name = "Qf", descriptor = "F")
	public float aFloat143 = 1.0F;

	@OriginalMember(owner = "client!um", name = "If", descriptor = "[F")
	public final float[] aFloatArray42 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!um", name = "ef", descriptor = "I")
	public int anInt4606 = 8;

	@OriginalMember(owner = "client!um", name = "Df", descriptor = "I")
	public int anInt4619 = 0;

	@OriginalMember(owner = "client!um", name = "ke", descriptor = "Z")
	protected boolean aBoolean333 = false;

	@OriginalMember(owner = "client!um", name = "Pe", descriptor = "I")
	private int anInt4598 = -1;

	@OriginalMember(owner = "client!um", name = "Tf", descriptor = "Z")
	protected boolean aBoolean350 = false;

	@OriginalMember(owner = "client!um", name = "Hf", descriptor = "I")
	public int anInt4621 = 3;

	@OriginalMember(owner = "client!um", name = "Ae", descriptor = "[F")
	private final float[] aFloatArray35 = new float[16];

	@OriginalMember(owner = "client!um", name = "Gf", descriptor = "Z")
	private boolean aBoolean346 = false;

	@OriginalMember(owner = "client!um", name = "Rf", descriptor = "F")
	public float aFloat144 = 1.0F;

	@OriginalMember(owner = "client!um", name = "Uf", descriptor = "[F")
	private final float[] aFloatArray43 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!um", name = "af", descriptor = "[F")
	protected float[] aFloatArray38 = this.aFloatArray43;

	@OriginalMember(owner = "client!um", name = "Vf", descriptor = "I")
	protected int anInt4624 = 0;

	@OriginalMember(owner = "client!um", name = "Wf", descriptor = "I")
	public int anInt4625 = -1;

	@OriginalMember(owner = "client!um", name = "bf", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream bf = new Stream();

	@OriginalMember(owner = "client!um", name = "og", descriptor = "Lclient!ica;")
	private final Class25_Sub2 aClass25_Sub2_21 = new Class25_Sub2();

	@OriginalMember(owner = "client!um", name = "Ab", descriptor = "Ljava/lang/Object;")
	protected final Object anObject12;

	@OriginalMember(owner = "client!um", name = "zc", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!um", name = "Ke", descriptor = "I")
	protected final int anInt4596;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas7;

	@OriginalMember(owner = "client!um", name = "rb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!um", name = "Zc", descriptor = "Lclient!mv;")
	protected final Class229 aClass229_65;

	@OriginalMember(owner = "client!um", name = "Wc", descriptor = "I")
	private int anInt4540;

	@OriginalMember(owner = "client!um", name = "Rb", descriptor = "I")
	public int anInt4487;

	@OriginalMember(owner = "client!um", name = "Ic", descriptor = "I")
	private int anInt4527;

	@OriginalMember(owner = "client!um", name = "ec", descriptor = "I")
	public int anInt4500;

	@OriginalMember(owner = "client!um", name = "Ef", descriptor = "I")
	public final int anInt4620;

	@OriginalMember(owner = "client!um", name = "ff", descriptor = "Lclient!uh;")
	private final Class337 aClass337_3;

	@OriginalMember(owner = "client!um", name = "jc", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!fa;Lclient!mv;II)V")
	protected Class162_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface9 arg2, @OriginalArg(3) Class229 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anObject13 = this.anObject12 = arg1;
		this.anInt4596 = arg4;
		this.aCanvas8 = this.aCanvas7 = arg0;
		this.aClass229_65 = arg3;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt4487 = this.anInt4540 = local307.height;
		this.anInt4500 = this.anInt4527 = local307.width;
		this.anInt4620 = arg5;
		Static50.method866(true, false);
		if (super.anInterface9_10 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt4620);
			this.aClass337_3 = null;
		} else {
			this.aClass337_3 = new Class337(this, super.anInterface9_10);
			this.aNativeInterface3 = new NativeInterface(super.anInterface9_10.method1077(), this.anInt4620);
			for (@Pc(352) int local352 = 0; local352 < super.anInterface9_10.method1077(); local352++) {
				@Pc(360) Class291 local360 = super.anInterface9_10.method1074(local352);
				if (local360 != null) {
					this.aNativeInterface3.initTextureMetrics(local352, local360.aByte98, local360.aByte101);
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(B)V")
	public final void method3825() {
		this.aBoolean330 = false;
		this.method3951();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)Lclient!ega;")
	public abstract Interface8 method3826(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(B)V")
	private void method3827() {
		this.aBoolean338 = false;
		this.method3866();
		if (this.aClass250_9 == Static85.aClass250_2) {
			this.method3916();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZZLclient!pca;II)V")
	public abstract void method3828(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class263 arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!uo;I)V")
	@Override
	public final void method6883(@OriginalArg(0) Class339 arg0, @OriginalArg(1) int arg1) {
		this.aClass269_3.method5557(arg1, this, arg0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!fo;[Lclient!ut;Z)Lclient!la;")
	@Override
	public final Class37 method6864(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class344[] arg1) {
		return new Class37_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6814(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas7 == arg0) {
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
			@Pc(53) Object local53 = this.method3913(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable4.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZB)V")
	public final void method3829(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean334 != arg0) {
			this.aBoolean334 = arg0;
			this.method3862();
			this.anInt4622 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!um", name = "da", descriptor = "(IIII)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt4500 - 1 && arg1 <= 0 && this.anInt4487 - 1 <= arg3) {
			this.JA();
			return;
		}
		this.anInt4616 = arg0 >= 0 ? arg0 : 0;
		this.anInt4624 = arg1 < 0 ? 0 : arg1;
		this.anInt4593 = arg3 <= this.anInt4500 ? arg3 : 0;
		this.anInt4614 = arg2 > this.anInt4500 ? 0 : arg2;
		if (!this.aBoolean351) {
			this.aBoolean351 = true;
			this.method3844();
		}
		this.method3932();
		this.method3876();
	}

	@OriginalMember(owner = "client!um", name = "BA", descriptor = "()I")
	@Override
	public final int BA() {
		return this.anInt4605;
	}

	@OriginalMember(owner = "client!um", name = "V", descriptor = "(IIII)V")
	@Override
	public final void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt4616) {
			this.anInt4616 = arg0;
			local5 = true;
		}
		if (this.anInt4614 > arg2) {
			local5 = true;
			this.anInt4614 = arg2;
		}
		if (arg1 > this.anInt4624) {
			this.anInt4624 = arg1;
			local5 = true;
		}
		if (this.anInt4593 > arg3) {
			local5 = true;
			this.anInt4593 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean351) {
			this.aBoolean351 = true;
			this.method3844();
		}
		this.method3932();
		this.method3876();
	}

	@OriginalMember(owner = "client!um", name = "J", descriptor = "(IIIIII)V")
	@Override
	public final void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3912();
		this.method3891(arg4);
		this.method3885(Static504.aClass263_4, 0);
		this.method3877(0, Static504.aClass263_4);
		this.method3957(arg5);
		this.aClass25_Sub2_15.method2696((float) arg2, 1.0F, (float) arg3);
		this.aClass25_Sub2_15.U(arg0, arg1, 0);
		this.method3825();
		this.method3894(false);
		this.method3838();
		this.method3894(true);
		this.method3877(0, Static191.aClass263_2);
		this.method3885(Static191.aClass263_2, 0);
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(Z)V")
	protected abstract void method3831();

	@OriginalMember(owner = "client!um", name = "JA", descriptor = "()V")
	@Override
	public final void JA() {
		this.anInt4593 = this.anInt4487;
		this.anInt4614 = this.anInt4500;
		this.anInt4624 = 0;
		this.anInt4616 = 0;
		if (this.aBoolean351) {
			this.aBoolean351 = false;
			this.method3844();
		}
		this.method3876();
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "(I)V")
	public final void method3832() {
		if (this.anInt4622 == 8) {
			return;
		}
		this.method3939();
		this.method3958(true);
		this.method3829(true);
		this.method3940(true);
		this.method3957(1);
		this.anInt4622 = 8;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(B)V")
	protected abstract void method3833();

	@OriginalMember(owner = "client!um", name = "h", descriptor = "(I)V")
	protected abstract void method3834();

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(B)V")
	protected abstract void method3835();

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!ut;Z)Lclient!f;")
	@Override
	public final Class38 method6845(@OriginalArg(0) Class344 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(132) Class38 local132;
		if (arg0.anInt8947 == 0 || arg0.anInt8946 == 0) {
			local132 = this.method6879(new int[1], 1, 1, 1);
		} else {
			@Pc(18) int[] local18 = new int[arg0.anInt8947 * arg0.anInt8946];
			@Pc(20) int local20 = 0;
			@Pc(22) int local22 = 0;
			@Pc(27) int local27;
			@Pc(31) int local31;
			if (arg0.aByteArray95 == null) {
				for (local27 = 0; local27 < arg0.anInt8946; local27++) {
					for (local31 = 0; local31 < arg0.anInt8947; local31++) {
						@Pc(89) int local89 = arg0.anIntArray585[arg0.aByteArray94[local20++] & 0xFF];
						local18[local22++] = local89 == 0 ? 0 : local89 | 0xFF000000;
					}
				}
			} else {
				for (local27 = 0; local27 < arg0.anInt8946; local27++) {
					for (local31 = 0; local31 < arg0.anInt8947; local31++) {
						local18[local22++] = arg0.anIntArray585[arg0.aByteArray94[local20] & 0xFF] | arg0.aByteArray95[local20] << 24;
						local20++;
					}
				}
			}
			local132 = this.method6879(local18, arg0.anInt8947, arg0.anInt8947, arg0.anInt8946);
		}
		local132.Q(arg0.anInt8948, arg0.anInt8950, arg0.anInt8949, arg0.anInt8945);
		return local132;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(IZ)V")
	public final void method3836(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean333 != arg0) {
			this.aBoolean333 = arg0;
			this.method3835();
			this.anInt4622 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!um", name = "i", descriptor = "(I)V")
	protected abstract void method3837();

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!uo;)V")
	@Override
	public final void method6860(@OriginalArg(0) Class339 arg0) {
		this.aClass269_3.method5557(-1, this, arg0);
	}

	@OriginalMember(owner = "client!um", name = "j", descriptor = "()Z")
	@Override
	public final boolean method6841() {
		return false;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt4577 + this.anInt4570 + this.anInt4564;
	}

	@OriginalMember(owner = "client!um", name = "XA", descriptor = "(IIIII)V")
	@Override
	public final void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6810(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "()Z")
	@Override
	public final boolean method6822() {
		return false;
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "(B)V")
	public final void method3838() {
		this.method3869(Static248.aClass155_5, 2);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method3839(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap5.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "()Z")
	@Override
	public final boolean method6818() {
		return true;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BI)V")
	public final void method3840(@OriginalArg(0) byte arg0) {
		this.method3891(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!um", name = "l", descriptor = "()V")
	@Override
	public final void method6843() {
		if (this.aClass337_3 != null) {
			this.aClass337_3.method7042();
		}
	}

	@OriginalMember(owner = "client!um", name = "la", descriptor = "(IIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4615 = arg1;
		this.anInt4588 = arg2;
		this.anInt4590 = arg3;
		this.anInt4619 = arg0;
		this.method3920();
		this.method3827();
		this.method3858();
		this.method3876();
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(Z)Lclient!ica;")
	public final Class25_Sub2 method3841() {
		return this.aClass25_Sub2_18;
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(Z)Lclient!ap;")
	public final Interface3 method3842() {
		return this.aClass17_Sub2_3 == null ? null : this.aClass17_Sub2_3.method3586();
	}

	@OriginalMember(owner = "client!um", name = "YA", descriptor = "(IIII)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean344) {
			throw new RuntimeException("");
		}
		this.anInt4610 = arg0;
		this.anInt4599 = arg1;
		this.anInt4601 = arg3;
		this.anInt4598 = arg2;
		if (this.aBoolean340) {
			this.aClass34Array3[3].method7359();
			this.aClass34Array3[3].method7365();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIILclient!pca;)V")
	protected abstract void method3843(@OriginalArg(2) int arg0, @OriginalArg(3) Class263 arg1);

	@OriginalMember(owner = "client!um", name = "h", descriptor = "(B)V")
	protected abstract void method3844();

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!rf;B)V")
	public abstract void method3845(@OriginalArg(0) Class297 arg0);

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
	@Override
	public final void method6850(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public final Class151 method6858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class151_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public final Class38 method6879(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class38_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!um", name = "i", descriptor = "(B)V")
	protected abstract void method3846();

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!wu;Lclient!bk;I)Z")
	public abstract boolean method3847(@OriginalArg(0) Class366 arg0, @OriginalArg(1) Class35 arg1);

	@OriginalMember(owner = "client!um", name = "j", descriptor = "(B)I")
	public final int method3848() {
		return this.anInt4617;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!wu;BLclient!bk;I)Lclient!fj;")
	public abstract Interface11 method3849(@OriginalArg(0) int arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(3) Class35 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		if (local10 == 0.0F && local17 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(42) float local42 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
			local10 *= local42;
			local17 *= local42;
		}
		if (!this.method3927(0.0F, 0.0F, (float) arg3 + local17, (float) arg0, (float) arg2 + local10, (float) arg1)) {
			return;
		}
		this.method3912();
		this.method3891(arg4);
		this.method3885(Static504.aClass263_4, 0);
		this.method3877(0, Static504.aClass263_4);
		this.method3957(arg5);
		this.method3952();
		this.method3894(false);
		this.method3903();
		this.method3894(true);
		this.method3877(0, Static191.aClass263_2);
		this.method3885(Static191.aClass263_2, 0);
	}

	@OriginalMember(owner = "client!um", name = "j", descriptor = "(I)V")
	private void method3850() {
		this.aBoolean337 = false;
		if (this.aClass250_9 == Static130.aClass250_3) {
			this.method3896();
			this.method3916();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method3851(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!um", name = "k", descriptor = "(I)V")
	private void method3852() {
		if (Static130.aClass250_3 == this.aClass250_9) {
			return;
		}
		@Pc(10) Class250 local10 = this.aClass250_9;
		this.aClass250_9 = Static130.aClass250_3;
		if (local10.method5245()) {
			this.method3887();
		}
		this.method3896();
		this.aFloatArray38 = this.aFloatArray36;
		this.method3916();
		this.anInt4622 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6831(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas7 == arg0) {
			local5 = this.anObject13;
		} else if (this.aHashtable4.containsKey(arg0)) {
			local5 = this.aHashtable4.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method3917(arg0, local5);
		if (arg0 == this.aCanvas8) {
			this.method3948();
		}
	}

	@OriginalMember(owner = "client!um", name = "l", descriptor = "(I)F")
	protected abstract float method3853();

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!id;IBI)V")
	public abstract void method3854(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
	@Override
	public final void method6830(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!um", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!um", name = "m", descriptor = "(I)V")
	public final void method3855() {
		if (Static221.aClass348_5 != this.aClass348Array3[this.anInt4617]) {
			this.aClass348Array3[this.anInt4617] = Static221.aClass348_5;
			this.aClass25_Sub2Array3[this.anInt4617].Y();
			this.method3898();
		}
	}

	@OriginalMember(owner = "client!um", name = "n", descriptor = "(I)V")
	protected abstract void method3856();

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(II)I")
	@Override
	public final int method6881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!um", name = "o", descriptor = "(I)Lclient!ica;")
	public final Class25_Sub2 method3857() {
		if (!this.aBoolean346) {
			this.aClass25_Sub2_20.method2701(this.aClass25_Sub2_18, this.aClass25_Sub2_15);
			this.aBoolean346 = true;
		}
		return this.aClass25_Sub2_20;
	}

	@OriginalMember(owner = "client!um", name = "p", descriptor = "(I)V")
	public final void method3858() {
		if (Static40.aClass250_1 == this.aClass250_9) {
			return;
		}
		@Pc(6) Class250 local6 = this.aClass250_9;
		this.aClass250_9 = Static40.aClass250_1;
		if (local6.method5245()) {
			this.method3887();
		}
		this.anInt4622 &= 0xFFFFFFE0;
		this.aFloatArray38 = this.aFloatArray43;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!ica;)V")
	public final void method3859(@OriginalArg(1) Class25_Sub2 arg0) {
		this.aClass25_Sub2_15.M(arg0);
		this.aBoolean330 = false;
		this.method3951();
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(II)Lclient!ip;")
	public final Interface13 method3860(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface13_4.method7030()) {
			this.anInterface13_4.method7035(arg0);
		}
		return this.anInterface13_4;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method6828() {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III[FZLclient!wu;)Lclient!fj;")
	public final Interface11 method3861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class366 arg4) {
		return this.method3931(arg2, arg1, arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!um", name = "q", descriptor = "(I)V")
	protected abstract void method3862();

	@OriginalMember(owner = "client!um", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public final void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class84_Sub2 local6 = (Class84_Sub2) arg1;
		@Pc(9) Interface11 local9 = local6.anInterface11_2;
		this.method3881();
		this.method3865(local9);
		this.method3957(1);
		this.method3867(Static317.aClass247_2, Static317.aClass247_2);
		this.method3885(Static504.aClass263_4, 0);
		this.method3891(arg0);
		this.aClass25_Sub2_15.method2696((float) this.anInt4500, 0.0F, (float) this.anInt4487);
		this.method3825();
		this.aClass25_Sub2Array3[0].method2696(local9.method7640((float) this.anInt4500), 1.0F, local9.method7636((float) this.anInt4487));
		this.aClass25_Sub2Array3[0].method2699(0.0F, local9.method7636((float) -arg3), local9.method7640((float) -arg2));
		this.aClass348Array3[0] = Static194.aClass348_4;
		this.method3898();
		this.method3838();
		this.method3855();
		this.method3885(Static191.aClass263_2, 0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([BBIZLclient!wu;I)Lclient!fj;")
	public final Interface11 method3863(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class366 arg3, @OriginalArg(5) int arg4) {
		return this.method3947(arg0, arg3, arg2, arg4, arg1);
	}

	@OriginalMember(owner = "client!um", name = "ZA", descriptor = "(Z)V")
	@Override
	public final void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean348 = arg0;
		this.method3908();
	}

	@OriginalMember(owner = "client!um", name = "r", descriptor = "(I)V")
	public final void method3864() {
		this.aClass348Array3 = new Class348[this.anInt4587];
		this.aClass247Array6 = new Class247[this.anInt4587];
		this.anInterface20Array3 = new Interface20[this.anInt4587];
		this.aClass247Array5 = new Class247[this.anInt4587];
		this.aClass25_Sub2Array3 = new Class25_Sub2[this.anInt4587];
		for (@Pc(32) int local32 = 0; local32 < this.anInt4587; local32++) {
			this.aClass247Array5[local32] = Static460.aClass247_4;
			this.aClass247Array6[local32] = Static460.aClass247_4;
			this.aClass348Array3[local32] = Static221.aClass348_5;
			this.aClass25_Sub2Array3[local32] = new Class25_Sub2();
		}
		this.aClass2_Sub11Array4 = new Class2_Sub11[this.anInt4589 - 2];
		this.anInterface20_3 = this.method3849(1, Static225.aClass366_3, Static42.aClass35_4, 1);
		this.method6836(new Class2_Sub12_Sub1(262144));
		this.aClass59_13 = this.method3935(new Class76[] { new Class76(new Class341[] { Static545.aClass341_1, Static545.aClass341_5 }) });
		this.aClass59_17 = this.method3935(new Class76[] { new Class76(new Class341[] { Static545.aClass341_1, Static545.aClass341_3 }) });
		this.aClass59_14 = this.method3935(new Class76[] { new Class76(Static545.aClass341_1), new Class76(Static545.aClass341_3), new Class76(Static545.aClass341_5), new Class76(Static545.aClass341_2) });
		this.aClass59_16 = this.method3935(new Class76[] { new Class76(Static545.aClass341_1), new Class76(Static545.aClass341_3), new Class76(Static545.aClass341_5) });
		this.aClass33_Sub2_21 = new Class33_Sub2(this, 0, 0, false, false);
		this.aClass33_Sub2_29 = new Class33_Sub2(this, 0, 0, true, true);
		this.aClass33_Sub2_28 = new Class33_Sub2(this, 0, 0, false, false);
		this.aClass33_Sub2_25 = new Class33_Sub2(this, 0, 0, true, true);
		this.aClass33_Sub2_22 = new Class33_Sub2(this, 0, 0, false, false);
		this.aClass33_Sub2_27 = new Class33_Sub2(this, 0, 0, true, true);
		this.aClass33_Sub2_30 = new Class33_Sub2(this, 0, 0, false, false);
		this.aClass33_Sub2_23 = new Class33_Sub2(this, 0, 0, true, true);
		this.aClass33_Sub2_24 = new Class33_Sub2(this, 0, 0, false, false);
		this.aClass33_Sub2_26 = new Class33_Sub2(this, 0, 0, true, true);
		this.aClass269_3 = new Class269(this);
		this.anInterface13_4 = this.method3889(true);
		this.method3938();
		this.aClass120_6 = new Class120(this);
		this.aClass34Array3[1] = this.method3934(1);
		this.aClass34Array3[2] = this.method3934(2);
		this.aClass34Array3[4] = this.method3934(4);
		this.aClass34Array3[5] = this.method3934(5);
		this.aClass34Array3[6] = this.method3934(6);
		this.aClass34Array3[7] = this.method3934(7);
		this.aClass34Array3[3] = this.method3934(3);
		this.aClass34Array3[8] = this.method3934(8);
		this.aClass34Array3[9] = this.method3934(9);
		if (!this.aClass34Array3[2].method7362()) {
			this.aClass34Array3[2] = this.method3934(0);
		}
		if (!this.aClass34Array3[4].method7362()) {
			this.aClass34Array3[4] = this.aClass34Array3[2];
		}
		if (!this.aClass34Array3[8].method7362()) {
			this.aClass34Array3[8] = this.aClass34Array3[4];
		}
		if (!this.aClass34Array3[9].method7362()) {
			this.aClass34Array3[9] = this.aClass34Array3[8];
		}
		this.method3911();
		this.JA();
		this.method6832();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!qda;)V")
	public final void method3865(@OriginalArg(1) Interface20 arg0) {
		if (this.anInterface20Array3[this.anInt4617] == arg0) {
			return;
		}
		this.anInterface20Array3[this.anInt4617] = arg0;
		if (arg0 == null) {
			this.method3953();
		} else {
			arg0.method7635();
		}
		this.anInt4622 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!um", name = "x", descriptor = "()Z")
	@Override
	public final boolean method6865() {
		return true;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!ak;IIII)Lclient!da;")
	@Override
	public final Class33 method6839(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class33_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public final Class84 method6817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static155.method2110(arg2, this, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!um", name = "k", descriptor = "(B)V")
	private void method3866() {
		if (this.aBoolean338) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray37;
		@Pc(17) float local17 = (float) (this.anInt4605 * -this.anInt4619) / (float) this.anInt4588;
		@Pc(31) float local31 = (float) ((this.anInt4500 - this.anInt4619) * this.anInt4605) / (float) this.anInt4588;
		@Pc(42) float local42 = (float) (this.anInt4615 * this.anInt4605) / (float) this.anInt4590;
		@Pc(57) float local57 = (float) (this.anInt4605 * (this.anInt4615 - this.anInt4487)) / (float) this.anInt4590;
		if (local17 == local31 || local57 == local42) {
			local5[5] = 1.0F;
			local5[13] = 0.0F;
			local5[7] = 0.0F;
			local5[10] = 1.0F;
			local5[0] = 1.0F;
			local5[11] = 0.0F;
			local5[2] = 0.0F;
			local5[3] = 0.0F;
			local5[12] = 0.0F;
			local5[6] = 0.0F;
			local5[15] = 1.0F;
			local5[4] = 0.0F;
			local5[9] = 0.0F;
			local5[14] = 0.0F;
			local5[1] = 0.0F;
			local5[8] = 0.0F;
		} else {
			@Pc(137) float local137 = (float) this.anInt4605 * 2.0F;
			local5[2] = 0.0F;
			local5[9] = (local42 + local57) / (-local57 + local42);
			local5[6] = 0.0F;
			local5[3] = 0.0F;
			local5[14] = this.aFloat135 = (float) (this.anInt4605 * this.anInt4603) / (float) (this.anInt4605 - this.anInt4603);
			local5[8] = (local17 + local31) / (local31 - local17);
			local5[5] = local137 / (local42 - local57);
			local5[13] = 0.0F;
			local5[15] = 0.0F;
			local5[0] = local137 / (local31 - local17);
			local5[12] = 0.0F;
			local5[4] = 0.0F;
			local5[7] = 0.0F;
			local5[1] = 0.0F;
			local5[11] = -1.0F;
			local5[10] = this.aFloat134 = (float) this.anInt4603 / (float) (this.anInt4605 - this.anInt4603);
		}
		this.method3902();
		this.aBoolean338 = true;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(II)I")
	@Override
	public final int method6846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public final Class38 method6868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class38_Sub2 local11 = new Class38_Sub2(this, arg2, arg3, arg4);
		local11.da(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!um", name = "m", descriptor = "(IIIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6810(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!nw;ILclient!nw;)V")
	public final void method3867(@OriginalArg(0) Class247 arg0, @OriginalArg(2) Class247 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg0 != this.aClass247Array6[this.anInt4617]) {
			this.aClass247Array6[this.anInt4617] = arg0;
			local5 = true;
			this.method3833();
		}
		if (this.aClass247Array5[this.anInt4617] != arg1) {
			this.aClass247Array5[this.anInt4617] = arg1;
			local5 = true;
			this.method3895();
		}
		if (local5) {
			this.anInt4622 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!um", name = "s", descriptor = "(I)Lclient!ica;")
	public final Class25_Sub2 method3868() {
		return this.aClass25_Sub2_15;
	}

	@OriginalMember(owner = "client!um", name = "r", descriptor = "()Z")
	@Override
	public final boolean method6856() {
		return false;
	}

	@OriginalMember(owner = "client!um", name = "C", descriptor = "()Lclient!q;")
	@Override
	public final Class25 method6889() {
		return new Class25_Sub2();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6813(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!um", name = "MA", descriptor = "(III[I)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass25_Sub2_16.method2705((float) arg1, (float) arg0, (float) arg2);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt4588 * this.aClass25_Sub2_16.method2708((float) arg2, (float) arg1, (float) arg0) / local14);
			local25 = (int) ((float) this.anInt4590 * this.aClass25_Sub2_16.method2707((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local25 = this.anInt4615;
			local28 = this.anInt4619;
		}
		arg3[0] = (int) ((float) local28 - this.aFloat130);
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local25 - this.aFloat137);
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method3853();
		this.method3912();
		this.method3891(arg4);
		this.method3885(Static504.aClass263_4, 0);
		this.method3877(0, Static504.aClass263_4);
		this.method3957(arg5);
		this.aClass25_Sub2_15.method2696((float) (arg2 - 1), 1.0F, (float) (arg3 - 1));
		this.aClass25_Sub2_15.method2699(0.0F, (float) arg1 - local7, -local7 + (float) arg0);
		this.method3825();
		this.method3894(false);
		this.method3869(Static172.aClass155_4, 4);
		this.method3894(true);
		this.method3877(0, Static191.aClass263_2);
		this.method3885(Static191.aClass263_2, 0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!id;II)V")
	private void method3869(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		this.method3954(this.anInterface8_9, 0);
		this.method3882(this.aClass59_15);
		this.method3854(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!um", name = "l", descriptor = "(B)V")
	private void method3870() {
		this.method3837();
		this.method3925();
		this.method3835();
		this.method3929();
		this.method3933();
		this.method3873();
		this.method3901();
		this.method3862();
		this.method3908();
		this.method3944();
		this.method3918();
		this.method3930();
		this.method3856();
		this.method3831();
		for (@Pc(60) int local60 = this.anInt4587 - 1; local60 >= 0; local60--) {
			this.method3926(local60);
			this.method3833();
			this.method3895();
			this.method3855();
		}
		this.method3924();
		this.method3872();
		this.method3900();
		this.method3846();
		this.method3883();
	}

	@OriginalMember(owner = "client!um", name = "p", descriptor = "()I")
	@Override
	public final int method6851() {
		return this.anInt4589 - 2;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([FI)[F")
	public final float[] method3871(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloatArray38[1];
		arg0[0] = this.aFloatArray38[0];
		arg0[8] = this.aFloatArray38[2];
		arg0[12] = this.aFloatArray38[3];
		arg0[2] = this.aFloatArray38[8];
		arg0[1] = this.aFloatArray38[4];
		arg0[5] = this.aFloatArray38[5];
		arg0[13] = this.aFloatArray38[7];
		arg0[9] = this.aFloatArray38[6];
		arg0[10] = this.aFloatArray38[10];
		arg0[6] = this.aFloatArray38[9];
		arg0[14] = this.aFloatArray38[11];
		arg0[7] = this.aFloatArray38[13];
		arg0[3] = this.aFloatArray38[12];
		arg0[11] = this.aFloatArray38[14];
		arg0[15] = this.aFloatArray38[15];
		return arg0;
	}

	@OriginalMember(owner = "client!um", name = "GA", descriptor = "(II)V")
	@Override
	public final void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt4605 && this.anInt4603 == arg1) {
			return;
		}
		this.anInt4603 = arg1;
		this.anInt4605 = arg0;
		this.method3827();
		this.method3920();
		this.method3955();
	}

	@OriginalMember(owner = "client!um", name = "t", descriptor = "(I)V")
	protected abstract void method3872();

	@OriginalMember(owner = "client!um", name = "u", descriptor = "(I)V")
	protected abstract void method3873();

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IILclient!wu;I[BI)Lclient!jf;")
	public abstract Interface15 method3874(@OriginalArg(2) Class366 arg0, @OriginalArg(4) byte[] arg1);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([IIIIZII)Lclient!fj;")
	public abstract Interface11 method3875(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!um", name = "v", descriptor = "(I)V")
	private void method3876() {
		this.aFloat141 = this.anInt4614 - this.anInt4619;
		this.aFloat137 = this.anInt4624 - this.anInt4615;
		this.aFloat130 = this.anInt4616 - this.anInt4619;
		this.aFloat133 = this.anInt4593 - this.anInt4615;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IILclient!pca;)V")
	public final void method3877(@OriginalArg(0) int arg0, @OriginalArg(2) Class263 arg1) {
		this.method3843(arg0, arg1);
	}

	@OriginalMember(owner = "client!um", name = "AA", descriptor = "(III[I)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass25_Sub2_16.method2705((float) arg1, (float) arg0, (float) arg2);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt4588 * this.aClass25_Sub2_16.method2708((float) arg2, (float) arg1, (float) arg0) / local14);
			local25 = (int) ((float) this.anInt4590 * this.aClass25_Sub2_16.method2707((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local25 = this.anInt4615;
			local28 = this.anInt4619;
		}
		arg3[0] = (int) ((float) local28 - this.aFloat130);
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local25 - this.aFloat137);
	}

	@OriginalMember(owner = "client!um", name = "oa", descriptor = "([I)V")
	@Override
	public final void oa(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt4624;
		arg0[0] = this.anInt4616;
		arg0[2] = this.anInt4614;
		arg0[3] = this.anInt4593;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public final Class38 method6825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class38_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!um", name = "w", descriptor = "(I)I")
	public final int method3878() {
		return this.anInt4598;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZZ)V")
	public final void method3879(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean342) {
			this.aBoolean342 = arg0;
			this.method3901();
		}
	}

	@OriginalMember(owner = "client!um", name = "x", descriptor = "(I)I")
	public final int method3880() {
		return this.anInt4610;
	}

	@OriginalMember(owner = "client!um", name = "y", descriptor = "(I)V")
	public final void method3881() {
		if (this.anInt4622 == 2) {
			return;
		}
		this.method3852();
		this.method3958(false);
		this.method3836(false);
		this.method3829(false);
		this.method3940(false);
		this.method3943(false, -2, false);
		this.anInt4622 = 2;
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "()Z")
	@Override
	public final boolean method6835() {
		return true;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!cl;B)V")
	public abstract void method3882(@OriginalArg(0) Class59 arg0);

	@OriginalMember(owner = "client!um", name = "m", descriptor = "(B)V")
	protected abstract void method3883();

	@OriginalMember(owner = "client!um", name = "n", descriptor = "(B)V")
	private void method3884() {
		if (this.aClass250_9 == Static283.aClass250_11) {
			return;
		}
		@Pc(10) Class250 local10 = this.aClass250_9;
		this.aClass250_9 = Static283.aClass250_11;
		if (!local10.method5245()) {
			this.method3887();
		}
		this.method3945();
		this.aFloatArray38 = this.aFloatArray35;
		this.method3916();
		this.anInt4622 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!pca;II)V")
	public final void method3885(@OriginalArg(0) Class263 arg0, @OriginalArg(2) int arg1) {
		this.method3828(false, false, arg0, arg1);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!bk;ILclient!wu;)Z")
	public abstract boolean method3886(@OriginalArg(0) Class35 arg0, @OriginalArg(2) Class366 arg1);

	@OriginalMember(owner = "client!um", name = "y", descriptor = "()Z")
	@Override
	public final boolean method6866() {
		return true;
	}

	@OriginalMember(owner = "client!um", name = "z", descriptor = "(I)V")
	private void method3887() {
		this.aBoolean346 = false;
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7360();
		}
		this.method3883();
	}

	@OriginalMember(owner = "client!um", name = "o", descriptor = "(B)V")
	private void method3888() {
		this.aFloat132 = this.anInt4603;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Lclient!e;")
	@Override
	public final Class2_Sub12 method6820(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub12_Sub1 local8 = new Class2_Sub12_Sub1(arg0);
		this.aClass70_27.method1269(local8);
		return local8;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI)Lclient!ip;")
	public abstract Interface13 method3889(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	@Override
	public final void method6823(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ[[II)Lclient!ap;")
	public abstract Interface3 method3890(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(IZ)V")
	public final void method3891(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt4602) {
			this.anInt4602 = arg0;
			this.method3924();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIILclient!id;ILclient!ip;I)V")
	public abstract void method3892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class155 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface13 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
	protected abstract void method3893(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(IZ)V")
	public abstract void method3894(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!um", name = "A", descriptor = "(I)V")
	protected abstract void method3895();

	@OriginalMember(owner = "client!um", name = "B", descriptor = "(I)V")
	private void method3896() {
		if (this.aBoolean337) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray36;
		this.aBoolean337 = true;
		if (this.anInt4500 != 0 && this.anInt4487 != 0) {
			local9[15] = 1.0F;
			local9[0] = 2.0F / (float) this.anInt4500;
			local9[6] = 0.0F;
			local9[7] = 0.0F;
			local9[11] = 0.0F;
			local9[2] = 0.0F;
			local9[12] = -1.0F;
			local9[8] = 0.0F;
			local9[9] = 0.0F;
			local9[10] = 0.5F;
			local9[4] = 0.0F;
			local9[1] = 0.0F;
			local9[13] = 1.0F;
			local9[3] = 0.0F;
			local9[5] = -2.0F / (float) this.anInt4487;
			local9[14] = 0.5F;
			return;
		}
		local9[15] = 1.0F;
		local9[5] = 1.0F;
		local9[8] = 0.0F;
		local9[13] = 0.0F;
		local9[11] = 0.0F;
		local9[10] = 1.0F;
		local9[12] = 0.0F;
		local9[1] = 0.0F;
		local9[4] = 0.0F;
		local9[9] = 0.0F;
		local9[14] = 0.0F;
		local9[3] = 0.0F;
		local9[2] = 0.0F;
		local9[0] = 1.0F;
		local9[7] = 0.0F;
		local9[6] = 0.0F;
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "(Z)I")
	public final int method3897() {
		return this.anInt4601;
	}

	@OriginalMember(owner = "client!um", name = "p", descriptor = "(B)V")
	private void method3898() {
		this.method3937();
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7364();
		}
	}

	@OriginalMember(owner = "client!um", name = "C", descriptor = "(I)Lclient!ica;")
	public final Class25_Sub2 method3899() {
		return this.aClass25_Sub2Array3[this.anInt4617];
	}

	@OriginalMember(owner = "client!um", name = "ra", descriptor = "(F)V")
	@Override
	public final void ra(@OriginalArg(0) float arg0) {
		if (this.aFloat144 != arg0) {
			this.aFloat144 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method3837();
			this.method3873();
		}
	}

	@OriginalMember(owner = "client!um", name = "q", descriptor = "(B)V")
	protected abstract void method3900();

	@OriginalMember(owner = "client!um", name = "v", descriptor = "()[I")
	@Override
	public final int[] v() {
		return new int[] { this.anInt4619, this.anInt4615, this.anInt4588, this.anInt4590 };
	}

	@OriginalMember(owner = "client!um", name = "D", descriptor = "(I)V")
	protected abstract void method3901();

	@OriginalMember(owner = "client!um", name = "E", descriptor = "(I)V")
	private void method3902() {
		this.aFloatArray37[10] = this.aFloat134;
		this.aFloatArray37[14] = this.aFloat135;
		this.aFloat129 = (this.aFloatArray37[14] - (float) this.anInt4603) / this.aFloatArray37[10];
	}

	@OriginalMember(owner = "client!um", name = "F", descriptor = "(I)V")
	private void method3903() {
		this.method3954(this.anInterface8_8, 0);
		this.method3882(this.aClass59_18);
		this.method3854(Static151.aClass155_3, 1, 0);
	}

	@OriginalMember(owner = "client!um", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt4626;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIBZ[I)Lclient!fj;")
	public final Interface11 method3904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		return this.method3875(arg3, 0, arg1, 0, arg2, arg0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BF)V")
	public final void method3905(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat136) {
			this.aFloat136 = arg0;
			this.method3920();
		}
	}

	@OriginalMember(owner = "client!um", name = "A", descriptor = "()V")
	@Override
	protected void method6875() {
		if (this.aBoolean345) {
			return;
		}
		for (@Pc(13) Class2 local13 = this.aClass70_27.method1264(); local13 != null; local13 = this.aClass70_27.method1261()) {
			((Class2_Sub12_Sub1) local13).method2218();
		}
		@Pc(30) Enumeration local30 = this.aHashtable4.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method3893(local36, this.aHashtable4.get(local36));
		}
		Static5.method82(false, true);
		this.aNativeInterface3.release();
		this.aBoolean345 = true;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(IZ)V")
	public final void method3906(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method3867(Static317.aClass247_2, Static317.aClass247_2);
		} else if (arg0 == 0) {
			this.method3867(Static460.aClass247_4, Static460.aClass247_4);
		} else if (arg0 == 2) {
			this.method3867(Static584.aClass247_5, Static317.aClass247_2);
		} else if (arg0 == 3) {
			this.method3867(Static449.aClass247_3, Static460.aClass247_4);
		} else if (arg0 == 4) {
			this.method3867(Static100.aClass247_1, Static100.aClass247_1);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method3907(@OriginalArg(1) Buffer arg0) {
		this.bf.a(arg0);
		return this.bf;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(IIIII)V")
	@Override
	protected final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!um", name = "G", descriptor = "(I)V")
	protected abstract void method3908();

	@OriginalMember(owner = "client!um", name = "r", descriptor = "(B)Lclient!ica;")
	public final Class25_Sub2 method3909() {
		return this.aClass25_Sub2_19;
	}

	@OriginalMember(owner = "client!um", name = "CA", descriptor = "(IIII)V")
	@Override
	public final void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean344 = true;
		this.anInt4598 = arg2;
		this.anInt4610 = arg0;
		this.anInt4601 = arg3;
		this.anInt4599 = arg1;
	}

	@OriginalMember(owner = "client!um", name = "I", descriptor = "(I)V")
	protected void method3911() {
		this.method3870();
	}

	@OriginalMember(owner = "client!um", name = "s", descriptor = "(B)V")
	private void method3912() {
		if (this.anInt4622 == 1) {
			return;
		}
		this.method3852();
		this.method3958(false);
		this.method3836(false);
		this.method3829(false);
		this.method3940(false);
		this.method3943(false, -2, false);
		this.method3906(1);
		this.method3865(this.anInterface20_3);
		this.anInt4622 = 1;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	protected abstract Object method3913(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!um", name = "t", descriptor = "(B)V")
	public final void method3914() {
		if (this.anInt4622 == 16) {
			return;
		}
		this.method3884();
		this.method3958(true);
		this.method3829(true);
		this.method3940(true);
		this.method3957(1);
		this.anInt4622 = 16;
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "()Z")
	@Override
	public final boolean method6837() {
		return this.aClass34Array3[3].method7362();
	}

	@OriginalMember(owner = "client!um", name = "J", descriptor = "(I)V")
	public final void method3915() {
		this.method3858();
		this.method3916();
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V")
	@Override
	public void method6829(@OriginalArg(0) int arg0) {
		if (this.aClass337_3 != null) {
			this.aClass337_3.method7041();
		}
		this.anInt4612 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public final void method6836(@OriginalArg(0) Class2_Sub12 arg0) {
		this.aNativeHeap5 = ((Class2_Sub12_Sub1) arg0).aNativeHeap1;
		this.aNativeHeapBuffer6 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!um", name = "h", descriptor = "(Z)V")
	private void method3916() {
		this.method3900();
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7354();
		}
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(I)V")
	@Override
	public final void method6870(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass337_3 != null) {
			this.aClass337_3.method7042();
		}
		this.anInt4591 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	protected abstract void method3917(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!um", name = "i", descriptor = "(Z)V")
	protected abstract void method3918();

	@OriginalMember(owner = "client!um", name = "pa", descriptor = "(III)V")
	@Override
	public final void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt4625 && this.anInt4604 == arg1 && this.anInt4608 == arg2) {
			return;
		}
		this.anInt4604 = arg1;
		this.anInt4625 = arg0;
		this.anInt4608 = arg2;
		this.method3955();
		this.method3944();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!vf;)V")
	public final void method3919(@OriginalArg(1) Class348 arg0) {
		this.aClass348Array3[this.anInt4617] = arg0;
		this.method3898();
	}

	@OriginalMember(owner = "client!um", name = "K", descriptor = "(I)V")
	private void method3920() {
		this.aBoolean331 = false;
		this.method3945();
		if (this.aClass250_9 == Static283.aClass250_11) {
			this.method3916();
		}
	}

	@OriginalMember(owner = "client!um", name = "L", descriptor = "(I)V")
	private void method3921() {
		this.anInterface8_8 = this.method3826(true);
		this.anInterface8_8.method5367(24, 12);
		this.aClass59_18 = this.method3935(new Class76[] { new Class76(Static545.aClass341_1) });
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BZ)V")
	public final void method3922(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean343 != arg0) {
			this.aBoolean343 = arg0;
			this.method3944();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIF)Lclient!tg;")
	@Override
	public final Class2_Sub11 method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub11_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(IIIIII)Lclient!rs;")
	@Override
	public final Class17 method6815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class17_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!um", name = "j", descriptor = "(Z)[F")
	public final float[] method3923() {
		return this.aFloatArray43;
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6884(@OriginalArg(0) Canvas arg0) {
		this.anObject13 = null;
		this.aCanvas8 = null;
		if (arg0 == null || this.aCanvas7 == arg0) {
			this.anObject13 = this.anObject12;
			this.aCanvas8 = this.aCanvas7;
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.anObject13 = this.aHashtable4.get(arg0);
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.anObject13 == null) {
			throw new RuntimeException();
		}
		this.method3851(this.anObject13, this.aCanvas8);
		this.method3948();
	}

	@OriginalMember(owner = "client!um", name = "z", descriptor = "()Z")
	@Override
	public final boolean method6872() {
		return true;
	}

	@OriginalMember(owner = "client!um", name = "m", descriptor = "()Lclient!q;")
	@Override
	public final Class25 method6844() {
		return this.aClass25_Sub2_16;
	}

	@OriginalMember(owner = "client!um", name = "u", descriptor = "(B)V")
	protected abstract void method3924();

	@OriginalMember(owner = "client!um", name = "o", descriptor = "()Z")
	@Override
	public final boolean method6848() {
		return true;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public final void method6833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class84 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!um", name = "k", descriptor = "(Z)V")
	protected abstract void method3925();

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(II)V")
	public final void method3926(@OriginalArg(0) int arg0) {
		if (this.anInt4617 != arg0) {
			this.anInt4617 = arg0;
			this.method3834();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(FFIFFFF)Z")
	private boolean method3927(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface8_8.method5369();
		if (local9 == null) {
			return false;
		}
		@Pc(26) Stream local26 = this.method3907(local9);
		if (Stream.b()) {
			local26.a(arg3);
			local26.a(arg5);
			local26.a(arg1);
			local26.a(arg4);
			local26.a(arg2);
			local26.a(arg0);
		} else {
			local26.b(arg3);
			local26.b(arg5);
			local26.b(arg1);
			local26.b(arg4);
			local26.b(arg2);
			local26.b(arg0);
		}
		local26.c();
		return this.anInterface8_8.method5368();
	}

	@OriginalMember(owner = "client!um", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public final void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt4586;
		if (local15 || arg1 != this.aFloat140 || this.aFloat142 != arg2) {
			this.aFloat142 = arg2;
			this.anInt4586 = arg0;
			this.aFloat140 = arg1;
			if (local15) {
				this.aFloat138 = (float) (this.anInt4586 & 0xFF) / 255.0F;
				this.aFloat139 = (float) (this.anInt4586 & 0xFF00) / 65280.0F;
				this.aFloat143 = (float) (this.anInt4586 & 0xFF0000) / 1.671168E7F;
				this.method3837();
			}
			this.aNativeInterface3.setSunColour(this.aFloat143, this.aFloat139, this.aFloat138, arg1, arg2);
			this.method3925();
		}
		if (arg3 != this.aFloatArray40[0] || this.aFloatArray40[1] != arg4 || this.aFloatArray40[2] != arg5) {
			this.aFloatArray40[0] = arg3;
			this.aFloatArray40[2] = arg5;
			this.aFloatArray40[1] = arg4;
			this.aFloatArray41[0] = -arg3;
			this.aFloatArray41[2] = -arg5;
			this.aFloatArray41[1] = -arg4;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray39[1] = local153 * arg4;
			this.aFloatArray39[0] = local153 * arg3;
			this.aFloatArray39[2] = arg5 * local153;
			this.aFloatArray42[1] = -this.aFloatArray39[1];
			this.aFloatArray42[0] = -this.aFloatArray39[0];
			this.aFloatArray42[2] = -this.aFloatArray39[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray39[0], this.aFloatArray39[1], this.aFloatArray39[2]);
			this.method3933();
			this.anInt4597 = (int) (arg5 * 256.0F / arg4);
			this.anInt4609 = (int) (arg3 * 256.0F / arg4);
		}
		this.method3873();
	}

	@OriginalMember(owner = "client!um", name = "M", descriptor = "(I)V")
	protected final void method3928() {
		@Pc(14) Enumeration local14 = this.aHashtable4.keys();
		while (local14.hasMoreElements()) {
			@Pc(20) Canvas local20 = (Canvas) local14.nextElement();
			this.method3893(local20, this.aHashtable4.get(local20));
		}
		this.anInterface8_9.method7032();
		this.anInterface8_8.method7032();
		this.aClass33_Sub2_29.method1344();
		this.aClass33_Sub2_25.method1344();
		this.aClass33_Sub2_27.method1344();
		this.aClass33_Sub2_23.method1344();
		this.aClass33_Sub2_26.method1344();
		this.aClass269_3.method5565();
		this.anInterface13_4.method7032();
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6854(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas7) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.method3893(arg0, this.aHashtable4.get(arg0));
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!um", name = "N", descriptor = "(I)V")
	protected void method3929() {
		this.anInt4595 = this.anInt4607;
		this.anInt4607 = 0;
	}

	@OriginalMember(owner = "client!um", name = "O", descriptor = "(I)V")
	protected abstract void method3930();

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([FIIILclient!wu;ZII)Lclient!fj;")
	protected abstract Interface11 method3931(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class366 arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!um", name = "P", descriptor = "(I)V")
	protected abstract void method3932();

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!rs;)V")
	@Override
	public final void method6812(@OriginalArg(0) Class17 arg0) {
		this.aClass17_Sub2_3 = (Class17_Sub2) arg0;
	}

	@OriginalMember(owner = "client!um", name = "v", descriptor = "(B)V")
	public abstract void method3933();

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(II)Lclient!wc;")
	protected Class34 method3934(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class34_Sub10(this);
		} else if (arg0 == 1) {
			return new Class34_Sub2(this);
		} else if (arg0 == 2) {
			return new Class34_Sub5(this, this.aClass120_6);
		} else if (arg0 == 7) {
			return new Class34_Sub4(this);
		} else {
			return new Class34_Sub11(this);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([Lclient!dm;I)Lclient!cl;")
	public abstract Class59 method3935(@OriginalArg(0) Class76[] arg0);

	@OriginalMember(owner = "client!um", name = "Q", descriptor = "(I)I")
	public final int method3936() {
		return this.anInt4599;
	}

	@OriginalMember(owner = "client!um", name = "R", descriptor = "(I)V")
	protected abstract void method3937();

	@OriginalMember(owner = "client!um", name = "l", descriptor = "(Z)V")
	protected final void method3938() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable4 != null && !this.aHashtable4.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable4.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method3913(local26));
			}
		}
		this.aHashtable4 = local9;
		this.method3949();
		this.method3921();
		this.aClass269_3.method5560(this);
	}

	@OriginalMember(owner = "client!um", name = "w", descriptor = "(B)V")
	private void method3939() {
		if (Static85.aClass250_2 == this.aClass250_9) {
			return;
		}
		@Pc(6) Class250 local6 = this.aClass250_9;
		this.aClass250_9 = Static85.aClass250_2;
		if (!local6.method5245()) {
			this.method3887();
		}
		this.method3866();
		this.aFloatArray38 = this.aFloatArray37;
		this.method3916();
		this.anInt4622 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!um", name = "va", descriptor = "(I)V")
	@Override
	public final void va(@OriginalArg(0) int arg0) {
		this.anInt4621 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt4621++;
		}
		this.anInt4606 = 0x1 << this.anInt4621;
	}

	@OriginalMember(owner = "client!um", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public final boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass25_Sub2_16.method2705((float) arg1, (float) arg0, (float) arg2);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass25_Sub2_16.method2705((float) arg4, (float) arg3, (float) arg5);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt4605 > local14 && local31 < (float) this.anInt4605 || !(!((float) this.anInt4603 < local14) || !(local31 > (float) this.anInt4603))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt4588 * this.aClass25_Sub2_16.method2708((float) arg2, (float) arg1, (float) arg0) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt4588 * this.aClass25_Sub2_16.method2708((float) arg5, (float) arg4, (float) arg3) / local31);
		if (this.aFloat130 > (float) local81 && (float) local99 < this.aFloat130 || this.aFloat141 < (float) local81 && this.aFloat141 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt4590 * this.aClass25_Sub2_16.method2707((float) arg0, (float) arg1, (float) arg2) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt4590 * this.aClass25_Sub2_16.method2707((float) arg3, (float) arg4, (float) arg5) / local31);
			return (!((float) local143 < this.aFloat137) || !(this.aFloat137 > (float) local161)) && (!((float) local143 > this.aFloat133) || !((float) local161 > this.aFloat133));
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(ZB)V")
	public final void method3940(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean350 != arg0) {
			this.aBoolean350 = arg0;
			this.method3908();
			this.anInt4622 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(IZ)V")
	public final void method3941(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean339 != arg0) {
			this.aBoolean339 = arg0;
			this.method3835();
		}
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "()Z")
	@Override
	public final boolean method6824() {
		return this.aBoolean347;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(ZI)V")
	public abstract void method3942(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([I)V")
	@Override
	public final void method6811(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt4487;
		arg0[0] = this.anInt4500;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I[Lclient!tg;)V")
	@Override
	public final void method6874(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub11Array4[local7] = arg1[local7];
		}
		this.anInt4607 = arg0;
		if (this.aClass250_9.method5245()) {
			this.method3929();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIBZ)V")
	public final void method3943(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt4618 || this.aBoolean340 != this.aBoolean344) {
			@Pc(22) Interface11 local22 = null;
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = this.aBoolean344 ? 3 : 0;
			if (arg1 < 0) {
				this.method3855();
			} else {
				local22 = this.aClass337_3.method7039(arg1);
				@Pc(54) Class291 local54 = super.anInterface9_10.method1074(arg1);
				if (local54.aByte97 == 0 && local54.aByte100 == 0) {
					this.method3855();
				} else {
					@Pc(78) int local78 = local54.aBoolean602 ? 64 : 128;
					@Pc(82) int local82 = local78 * 50;
					@Pc(86) Class25_Sub2 local86 = this.method3899();
					local86.method2717((float) (this.anInt4612 % local82 * local54.aByte100) / (float) local82, 0.0F, (float) (local54.aByte97 * (this.anInt4612 % local82)) / (float) local82);
					this.method3919(Static194.aClass348_4);
				}
				if (!this.aBoolean344) {
					local26 = local54.aByte95;
					local35 = local54.aByte96;
					local28 = local54.anInt7228;
				}
				local24 = local54.anInt7229;
			}
			this.method3946(arg0, local26, local35, local28, arg2);
			if (this.aClass34_3 == null) {
				this.method3865(local22);
				this.method3906(local24);
			} else {
				this.aClass34_3.method7363(local22, local24);
			}
			this.anInt4618 = arg1;
			this.aBoolean340 = this.aBoolean344;
		}
		this.anInt4622 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!um", name = "x", descriptor = "(B)V")
	protected abstract void method3944();

	@OriginalMember(owner = "client!um", name = "m", descriptor = "(Z)V")
	private void method3945() {
		if (this.aBoolean331) {
			return;
		}
		@Pc(15) float[] local15 = this.aFloatArray35;
		@Pc(19) float local19 = (float) this.anInt4605;
		@Pc(23) float local23 = (float) this.anInt4603;
		@Pc(35) float local35 = this.aFloat136 * (float) -this.anInt4615 / (float) this.anInt4590;
		@Pc(47) float local47 = (float) -this.anInt4619 * this.aFloat136 / (float) this.anInt4588;
		@Pc(61) float local61 = (float) (this.anInt4500 - this.anInt4619) * this.aFloat136 / (float) this.anInt4588;
		@Pc(76) float local76 = (float) (this.anInt4487 - this.anInt4615) * this.aFloat136 / (float) this.anInt4590;
		if (local61 == local47 || local76 == local35) {
			local15[11] = 0.0F;
			local15[0] = 1.0F;
			local15[8] = 0.0F;
			local15[10] = 1.0F;
			local15[2] = 0.0F;
			local15[5] = 1.0F;
			local15[3] = 0.0F;
			local15[7] = 0.0F;
			local15[9] = 0.0F;
			local15[6] = 0.0F;
			local15[13] = 0.0F;
			local15[14] = 0.0F;
			local15[4] = 0.0F;
			local15[1] = 0.0F;
			local15[15] = 1.0F;
			local15[12] = 0.0F;
		} else {
			local15[9] = 0.0F;
			local15[10] = 1.0F / (local19 - local23);
			local15[15] = 1.0F;
			local15[11] = 0.0F;
			local15[0] = 2.0F / (local61 - local47);
			local15[14] = local19 / (local19 - local23);
			local15[3] = 0.0F;
			local15[13] = (local76 + local35) / (-local35 + local76);
			local15[5] = 2.0F / (local76 - local35);
			local15[1] = 0.0F;
			local15[2] = 0.0F;
			local15[6] = 0.0F;
			local15[4] = 0.0F;
			local15[8] = 0.0F;
			local15[12] = (local47 + local61) / (-local61 + local47);
			local15[7] = 0.0F;
		}
		this.method3888();
		this.aBoolean331 = true;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIIIZI)V")
	private void method3946(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) boolean local8 = arg0 & this.method6837();
		if (!local8 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			arg2 = 2;
			arg3 = 1;
			arg1 = 0;
		}
		if (arg2 != 0 && arg4) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt4613 != arg2) {
			if (this.anInt4613 != 0) {
				this.aClass34Array3[Integer.MAX_VALUE & this.anInt4613].method7357();
			}
			if (arg2 == 0) {
				this.aClass34_3 = null;
			} else {
				this.aClass34_3 = this.aClass34Array3[Integer.MAX_VALUE & arg2];
				this.aClass34_3.method7355(arg4);
				this.aClass34_3.method7361(arg4);
				this.aClass34_3.method7366(arg1, arg3);
			}
			this.anInt4594 = arg1;
			this.anInt4600 = arg3;
			this.anInt4613 = arg2;
		} else if (this.anInt4613 != 0) {
			this.aClass34Array3[this.anInt4613 & Integer.MAX_VALUE].method7361(arg4);
			if (this.anInt4594 != arg1 || arg3 != this.anInt4600) {
				this.aClass34Array3[this.anInt4613 & Integer.MAX_VALUE].method7366(arg1, arg3);
				this.anInt4600 = arg3;
				this.anInt4594 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([BLclient!wu;ZIIIII)Lclient!fj;")
	protected abstract Interface11 method3947(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!um", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt4603;
	}

	@OriginalMember(owner = "client!um", name = "S", descriptor = "(I)V")
	private void method3948() {
		if (this.aCanvas8 == null) {
			this.anInt4527 = this.anInt4540 = 1;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas8.getSize();
			this.anInt4527 = local14.width;
			this.anInt4540 = local14.height;
		}
		this.anInt4487 = this.anInt4540;
		this.anInt4500 = this.anInt4527;
		this.method3850();
		this.method3827();
		this.method3920();
		this.method3872();
		this.method3876();
		this.method3858();
		this.JA();
	}

	@OriginalMember(owner = "client!um", name = "n", descriptor = "(Z)V")
	private void method3949() {
		this.anInterface8_9 = this.method3826(false);
		this.anInterface8_9.method5367(140, 28);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface8_9.method5369();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method3907(local28);
				if (Stream.b()) {
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
				} else {
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
				}
				local35.c();
				if (this.anInterface8_9.method5368()) {
					break;
				}
			}
		}
		this.aClass59_15 = this.method3935(new Class76[] { new Class76(new Class341[] { Static545.aClass341_1, Static545.aClass341_5, Static545.aClass341_5 }) });
	}

	@OriginalMember(owner = "client!um", name = "y", descriptor = "(B)V")
	public final void method3950() {
		if (this.anInt4622 == 4) {
			return;
		}
		this.method3852();
		this.method3958(false);
		this.method3836(false);
		this.method3829(false);
		this.method3940(false);
		this.method3943(false, -2, false);
		this.method3957(1);
		this.method3906(0);
		this.anInt4622 = 4;
	}

	@OriginalMember(owner = "client!um", name = "T", descriptor = "(I)V")
	private void method3951() {
		if (this.aClass250_9 == Static130.aClass250_3) {
			@Pc(9) float local9 = this.method3853();
			this.aClass25_Sub2_15.method2699(0.0F, local9, local9);
		}
		this.aBoolean346 = false;
		this.method3846();
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7352();
		}
	}

	@OriginalMember(owner = "client!um", name = "q", descriptor = "()Z")
	@Override
	public final boolean method6853() {
		return true;
	}

	@OriginalMember(owner = "client!um", name = "U", descriptor = "(I)V")
	public final void method3952() {
		this.aClass25_Sub2_15.Y();
		this.aBoolean330 = true;
		this.method3951();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method6816(@OriginalArg(0) Class25 arg0) {
		this.aClass25_Sub2_16 = (Class25_Sub2) arg0;
		this.aClass25_Sub2_18.M(this.aClass25_Sub2_16);
		this.aClass25_Sub2_18.method2700();
		this.aClass25_Sub2_19.method2706(this.aClass25_Sub2_18);
		this.aClass25_Sub2_17.method2706(this.aClass25_Sub2_16);
		if (this.aClass250_9.method5245()) {
			this.method3887();
		}
	}

	@OriginalMember(owner = "client!um", name = "V", descriptor = "(I)V")
	protected abstract void method3953();

	@OriginalMember(owner = "client!um", name = "u", descriptor = "()Lclient!q;")
	@Override
	public final Class25 method6862() {
		return this.aClass25_Sub2_21;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!ega;II)V")
	public abstract void method3954(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!um", name = "W", descriptor = "(I)V")
	private void method3955() {
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7365();
		}
		this.method3918();
	}

	@OriginalMember(owner = "client!um", name = "X", descriptor = "(I)Lclient!ica;")
	public final Class25_Sub2 method3956() {
		return this.aClass25_Sub2Array3[this.anInt4617];
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "(II)V")
	public final void method3957(@OriginalArg(1) int arg0) {
		if (this.anInt4623 == arg0) {
			return;
		}
		@Pc(17) Class354 local17;
		@Pc(21) boolean local21;
		@Pc(19) boolean local19;
		if (arg0 == 1) {
			local21 = true;
			local17 = Static51.aClass354_2;
			local19 = true;
		} else if (arg0 == 2) {
			local17 = Static155.aClass354_3;
			local19 = false;
			local21 = true;
		} else if (arg0 == 128) {
			local19 = true;
			local17 = Static388.aClass354_7;
			local21 = true;
		} else {
			local19 = false;
			local21 = false;
			local17 = Static11.aClass354_1;
		}
		if (this.aBoolean332 != local19) {
			this.aBoolean332 = local19;
			this.method3831();
		}
		if (this.aBoolean335 != local21) {
			this.aBoolean335 = local21;
			this.method3930();
		}
		if (this.aClass354_6 != local17) {
			this.aClass354_6 = local17;
			this.method3856();
		}
		this.anInt4622 &= 0xFFFFFFE3;
		this.anInt4623 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "(IZ)V")
	public final void method3958(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean336 != arg0) {
			this.aBoolean336 = arg0;
			this.method3944();
			this.anInt4622 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!um", name = "L", descriptor = "()V")
	@Override
	public final void L() {
		this.aBoolean344 = false;
	}
}
