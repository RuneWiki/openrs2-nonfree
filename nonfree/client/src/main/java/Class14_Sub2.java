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

@OriginalClass("client!kea")
public abstract class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!kea", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!kea", name = "rb", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7;

	@OriginalMember(owner = "client!kea", name = "Fb", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!kea", name = "Xb", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!kea", name = "Kd", descriptor = "Lclient!tca;")
	protected Class315 aClass315_5;

	@OriginalMember(owner = "client!kea", name = "Rd", descriptor = "I")
	public int anInt8573;

	@OriginalMember(owner = "client!kea", name = "Wd", descriptor = "I")
	protected int anInt8576;

	@OriginalMember(owner = "client!kea", name = "Xd", descriptor = "I")
	public int anInt8577;

	@OriginalMember(owner = "client!kea", name = "fe", descriptor = "Lclient!sda;")
	private Class26_Sub2 aClass26_Sub2_3;

	@OriginalMember(owner = "client!kea", name = "ge", descriptor = "Z")
	protected boolean aBoolean604;

	@OriginalMember(owner = "client!kea", name = "he", descriptor = "I")
	public int anInt8580;

	@OriginalMember(owner = "client!kea", name = "je", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!kea", name = "oe", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!kea", name = "qe", descriptor = "[Lclient!ns;")
	protected Class228[] aClass228Array5;

	@OriginalMember(owner = "client!kea", name = "we", descriptor = "I")
	private int anInt8583;

	@OriginalMember(owner = "client!kea", name = "ye", descriptor = "F")
	private float aFloat173;

	@OriginalMember(owner = "client!kea", name = "ze", descriptor = "Z")
	public boolean aBoolean609;

	@OriginalMember(owner = "client!kea", name = "Ce", descriptor = "Z")
	public boolean aBoolean610;

	@OriginalMember(owner = "client!kea", name = "Ee", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!kea", name = "He", descriptor = "Z")
	protected boolean aBoolean612;

	@OriginalMember(owner = "client!kea", name = "Je", descriptor = "[Lclient!ra;")
	protected Class280[] aClass280Array3;

	@OriginalMember(owner = "client!kea", name = "Le", descriptor = "F")
	private float aFloat175;

	@OriginalMember(owner = "client!kea", name = "Re", descriptor = "[Lclient!gl;")
	private Interface10[] anInterface10Array3;

	@OriginalMember(owner = "client!kea", name = "Te", descriptor = "I")
	public int anInt8587;

	@OriginalMember(owner = "client!kea", name = "Ze", descriptor = "I")
	public int anInt8589;

	@OriginalMember(owner = "client!kea", name = "bf", descriptor = "Lclient!qu;")
	private Class278 bf;

	@OriginalMember(owner = "client!kea", name = "ff", descriptor = "F")
	public float aFloat179;

	@OriginalMember(owner = "client!kea", name = "kf", descriptor = "[Lclient!of;")
	protected Class54_Sub3[] aClass54_Sub3Array3;

	@OriginalMember(owner = "client!kea", name = "sf", descriptor = "F")
	private float aFloat181;

	@OriginalMember(owner = "client!kea", name = "tf", descriptor = "Lclient!gl;")
	public Interface10 anInterface10_3;

	@OriginalMember(owner = "client!kea", name = "vf", descriptor = "I")
	protected int anInt8598;

	@OriginalMember(owner = "client!kea", name = "xf", descriptor = "[Lclient!ns;")
	protected Class228[] aClass228Array6;

	@OriginalMember(owner = "client!kea", name = "Af", descriptor = "I")
	public int anInt8600;

	@OriginalMember(owner = "client!kea", name = "Hf", descriptor = "Z")
	public boolean aBoolean621;

	@OriginalMember(owner = "client!kea", name = "Jf", descriptor = "I")
	private int anInt8606;

	@OriginalMember(owner = "client!kea", name = "Kf", descriptor = "I")
	protected int anInt8607;

	@OriginalMember(owner = "client!kea", name = "Qf", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!kea", name = "Sf", descriptor = "Lclient!ho;")
	private Class22 aClass22_3;

	@OriginalMember(owner = "client!kea", name = "Uf", descriptor = "I")
	protected int anInt8613;

	@OriginalMember(owner = "client!kea", name = "Xf", descriptor = "[Lclient!bj;")
	protected Class6_Sub7[] aClass6_Sub7Array5;

	@OriginalMember(owner = "client!kea", name = "Yf", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!kea", name = "ag", descriptor = "I")
	protected int anInt8616;

	@OriginalMember(owner = "client!kea", name = "dg", descriptor = "Lclient!ii;")
	private Interface13 anInterface13_14;

	@OriginalMember(owner = "client!kea", name = "eg", descriptor = "Lclient!og;")
	public Class20_Sub3 aClass20_Sub3_21;

	@OriginalMember(owner = "client!kea", name = "fg", descriptor = "Lclient!bf;")
	private Class28 aClass28_15;

	@OriginalMember(owner = "client!kea", name = "gg", descriptor = "Lclient!og;")
	public Class20_Sub3 aClass20_Sub3_22;

	@OriginalMember(owner = "client!kea", name = "hg", descriptor = "Lclient!vl;")
	private Interface23 anInterface23_8;

	@OriginalMember(owner = "client!kea", name = "ig", descriptor = "Lclient!og;")
	public Class20_Sub3 aClass20_Sub3_23;

	@OriginalMember(owner = "client!kea", name = "jg", descriptor = "Lclient!bf;")
	public Class28 aClass28_16;

	@OriginalMember(owner = "client!kea", name = "kg", descriptor = "Lclient!og;")
	public Class20_Sub3 aClass20_Sub3_24;

	@OriginalMember(owner = "client!kea", name = "lg", descriptor = "Lclient!og;")
	public Class20_Sub3 aClass20_Sub3_25;

	@OriginalMember(owner = "client!kea", name = "mg", descriptor = "Lclient!bf;")
	private Class28 aClass28_17;

	@OriginalMember(owner = "client!kea", name = "ng", descriptor = "Lclient!og;")
	public Class20_Sub3 aClass20_Sub3_26;

	@OriginalMember(owner = "client!kea", name = "og", descriptor = "Lclient!og;")
	public Class20_Sub3 aClass20_Sub3_27;

	@OriginalMember(owner = "client!kea", name = "pg", descriptor = "Lclient!ii;")
	private Interface13 anInterface13_15;

	@OriginalMember(owner = "client!kea", name = "rg", descriptor = "Lclient!og;")
	public Class20_Sub3 aClass20_Sub3_28;

	@OriginalMember(owner = "client!kea", name = "sg", descriptor = "Lclient!bf;")
	public Class28 aClass28_18;

	@OriginalMember(owner = "client!kea", name = "tg", descriptor = "Lclient!og;")
	public Class20_Sub3 aClass20_Sub3_29;

	@OriginalMember(owner = "client!kea", name = "ug", descriptor = "Lclient!bf;")
	public Class28 aClass28_19;

	@OriginalMember(owner = "client!kea", name = "vg", descriptor = "Lclient!bf;")
	public Class28 aClass28_20;

	@OriginalMember(owner = "client!kea", name = "wg", descriptor = "Lclient!og;")
	public Class20_Sub3 aClass20_Sub3_30;

	@OriginalMember(owner = "client!kea", name = "xg", descriptor = "Z")
	protected boolean aBoolean623;

	@OriginalMember(owner = "client!kea", name = "yg", descriptor = "I")
	private int anInt8619;

	@OriginalMember(owner = "client!kea", name = "tc", descriptor = "Lclient!ws;")
	private final Class361 aClass361_63 = new Class361();

	@OriginalMember(owner = "client!kea", name = "Sd", descriptor = "Z")
	protected boolean aBoolean603 = true;

	@OriginalMember(owner = "client!kea", name = "Ud", descriptor = "Lclient!of;")
	protected final Class54_Sub3 aClass54_Sub3_15 = new Class54_Sub3();

	@OriginalMember(owner = "client!kea", name = "Zd", descriptor = "Lclient!of;")
	public Class54_Sub3 aClass54_Sub3_16 = new Class54_Sub3();

	@OriginalMember(owner = "client!kea", name = "ae", descriptor = "Lclient!of;")
	public final Class54_Sub3 aClass54_Sub3_17 = new Class54_Sub3();

	@OriginalMember(owner = "client!kea", name = "be", descriptor = "Lclient!of;")
	protected final Class54_Sub3 aClass54_Sub3_18 = new Class54_Sub3();

	@OriginalMember(owner = "client!kea", name = "ce", descriptor = "Lclient!of;")
	private final Class54_Sub3 aClass54_Sub3_19 = new Class54_Sub3();

	@OriginalMember(owner = "client!kea", name = "de", descriptor = "Lclient!of;")
	private final Class54_Sub3 aClass54_Sub3_20 = new Class54_Sub3();

	@OriginalMember(owner = "client!kea", name = "se", descriptor = "Z")
	protected boolean aBoolean606 = true;

	@OriginalMember(owner = "client!kea", name = "pe", descriptor = "I")
	private int anInt8581 = 1;

	@OriginalMember(owner = "client!kea", name = "te", descriptor = "F")
	public float aFloat172 = 1.0F;

	@OriginalMember(owner = "client!kea", name = "De", descriptor = "I")
	public int anInt8584 = 50;

	@OriginalMember(owner = "client!kea", name = "le", descriptor = "[Lclient!ho;")
	private final Class22[] aClass22Array3 = new Class22[10];

	@OriginalMember(owner = "client!kea", name = "Me", descriptor = "F")
	public float aFloat176 = 1.0F;

	@OriginalMember(owner = "client!kea", name = "Ne", descriptor = "[F")
	public final float[] aFloatArray62 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!kea", name = "Be", descriptor = "[F")
	private final float[] aFloatArray61 = new float[16];

	@OriginalMember(owner = "client!kea", name = "Se", descriptor = "F")
	public float aFloat177 = 3584.0F;

	@OriginalMember(owner = "client!kea", name = "Ue", descriptor = "Lclient!dga;")
	protected Class68 aClass68_5 = Static593.aClass68_7;

	@OriginalMember(owner = "client!kea", name = "Pe", descriptor = "[F")
	private final float[] aFloatArray63 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!kea", name = "me", descriptor = "Z")
	protected boolean aBoolean605 = true;

	@OriginalMember(owner = "client!kea", name = "Fe", descriptor = "I")
	public int anInt8585 = -1;

	@OriginalMember(owner = "client!kea", name = "Ie", descriptor = "I")
	private int anInt8586 = -1;

	@OriginalMember(owner = "client!kea", name = "ne", descriptor = "F")
	public float aFloat170 = 1.0F;

	@OriginalMember(owner = "client!kea", name = "Ve", descriptor = "F")
	public float aFloat178 = -1.0F;

	@OriginalMember(owner = "client!kea", name = "lf", descriptor = "[F")
	private final float[] aFloatArray64 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!kea", name = "ke", descriptor = "F")
	private float aFloat169 = 3000.0F;

	@OriginalMember(owner = "client!kea", name = "Oe", descriptor = "Z")
	private boolean aBoolean614 = false;

	@OriginalMember(owner = "client!kea", name = "nf", descriptor = "I")
	protected int anInt8594 = 0;

	@OriginalMember(owner = "client!kea", name = "of", descriptor = "I")
	public int anInt8595 = 128;

	@OriginalMember(owner = "client!kea", name = "cf", descriptor = "Z")
	protected boolean aBoolean617 = true;

	@OriginalMember(owner = "client!kea", name = "Ae", descriptor = "[F")
	private final float[] aFloatArray60 = new float[16];

	@OriginalMember(owner = "client!kea", name = "Ke", descriptor = "Z")
	private boolean aBoolean613 = false;

	@OriginalMember(owner = "client!kea", name = "qf", descriptor = "Z")
	private boolean aBoolean619 = false;

	@OriginalMember(owner = "client!kea", name = "We", descriptor = "I")
	private int anInt8588 = 0;

	@OriginalMember(owner = "client!kea", name = "jf", descriptor = "I")
	public int anInt8592 = -1;

	@OriginalMember(owner = "client!kea", name = "yf", descriptor = "Lclient!uv;")
	protected Class340 aClass340_9 = Static450.aClass340_5;

	@OriginalMember(owner = "client!kea", name = "ue", descriptor = "I")
	private int anInt8582 = 16777215;

	@OriginalMember(owner = "client!kea", name = "wf", descriptor = "[F")
	public final float[] aFloatArray65 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!kea", name = "Qe", descriptor = "Z")
	private boolean aBoolean615 = false;

	@OriginalMember(owner = "client!kea", name = "rf", descriptor = "Z")
	protected boolean aBoolean620 = false;

	@OriginalMember(owner = "client!kea", name = "ee", descriptor = "I")
	private int anInt8579 = -1;

	@OriginalMember(owner = "client!kea", name = "pf", descriptor = "I")
	protected int anInt8596 = 0;

	@OriginalMember(owner = "client!kea", name = "Xe", descriptor = "Z")
	protected boolean aBoolean616 = false;

	@OriginalMember(owner = "client!kea", name = "Ge", descriptor = "Z")
	private boolean aBoolean611 = false;

	@OriginalMember(owner = "client!kea", name = "Bf", descriptor = "I")
	protected int anInt8601 = -1;

	@OriginalMember(owner = "client!kea", name = "uf", descriptor = "I")
	public int anInt8597 = 0;

	@OriginalMember(owner = "client!kea", name = "Df", descriptor = "F")
	public float aFloat182 = 1.0F;

	@OriginalMember(owner = "client!kea", name = "xe", descriptor = "Z")
	protected boolean aBoolean608 = true;

	@OriginalMember(owner = "client!kea", name = "Gf", descriptor = "I")
	public int anInt8604 = 8;

	@OriginalMember(owner = "client!kea", name = "re", descriptor = "[F")
	private final float[] aFloatArray59 = new float[16];

	@OriginalMember(owner = "client!kea", name = "af", descriptor = "I")
	public int anInt8590 = 0;

	@OriginalMember(owner = "client!kea", name = "Nf", descriptor = "I")
	public int anInt8609 = 512;

	@OriginalMember(owner = "client!kea", name = "Pf", descriptor = "I")
	protected int anInt8611 = 0;

	@OriginalMember(owner = "client!kea", name = "If", descriptor = "I")
	private int anInt8605 = 0;

	@OriginalMember(owner = "client!kea", name = "ve", descriptor = "Z")
	protected boolean aBoolean607 = false;

	@OriginalMember(owner = "client!kea", name = "Wf", descriptor = "I")
	protected int anInt8614 = 0;

	@OriginalMember(owner = "client!kea", name = "Mf", descriptor = "F")
	private float aFloat183 = 1.0F;

	@OriginalMember(owner = "client!kea", name = "Ef", descriptor = "I")
	public int anInt8603 = 512;

	@OriginalMember(owner = "client!kea", name = "Tf", descriptor = "[F")
	private final float[] aFloatArray67 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!kea", name = "ef", descriptor = "I")
	public int anInt8591 = 3;

	@OriginalMember(owner = "client!kea", name = "Of", descriptor = "I")
	protected final int anInt8610 = 0;

	@OriginalMember(owner = "client!kea", name = "Zf", descriptor = "I")
	protected int anInt8615 = 0;

	@OriginalMember(owner = "client!kea", name = "hf", descriptor = "F")
	public float aFloat180 = 3584.0F;

	@OriginalMember(owner = "client!kea", name = "Rf", descriptor = "I")
	private int anInt8612 = 0;

	@OriginalMember(owner = "client!kea", name = "Ff", descriptor = "[F")
	protected float[] aFloatArray66 = this.aFloatArray67;

	@OriginalMember(owner = "client!kea", name = "mf", descriptor = "I")
	protected final int anInt8593 = 0;

	@OriginalMember(owner = "client!kea", name = "Vf", descriptor = "Z")
	protected boolean aBoolean622 = true;

	@OriginalMember(owner = "client!kea", name = "df", descriptor = "Z")
	protected boolean aBoolean618 = false;

	@OriginalMember(owner = "client!kea", name = "ie", descriptor = "F")
	public float aFloat167 = -1.0F;

	@OriginalMember(owner = "client!kea", name = "bg", descriptor = "I")
	public int anInt8617 = 0;

	@OriginalMember(owner = "client!kea", name = "cg", descriptor = "I")
	protected int anInt8618 = 3584;

	@OriginalMember(owner = "client!kea", name = "Lf", descriptor = "I")
	private int anInt8608 = 0;

	@OriginalMember(owner = "client!kea", name = "gf", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream6 = new Stream();

	@OriginalMember(owner = "client!kea", name = "qg", descriptor = "Lclient!of;")
	private final Class54_Sub3 aClass54_Sub3_21 = new Class54_Sub3();

	@OriginalMember(owner = "client!kea", name = "Cb", descriptor = "Ljava/lang/Object;")
	protected final Object anObject14;

	@OriginalMember(owner = "client!kea", name = "wd", descriptor = "Ljava/lang/Object;")
	private Object anObject15;

	@OriginalMember(owner = "client!kea", name = "Hc", descriptor = "Lclient!pfa;")
	protected final Class251 aClass251_118;

	@OriginalMember(owner = "client!kea", name = "Nd", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas14;

	@OriginalMember(owner = "client!kea", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!kea", name = "zf", descriptor = "I")
	protected final int anInt8599;

	@OriginalMember(owner = "client!kea", name = "Hd", descriptor = "I")
	private int anInt8565;

	@OriginalMember(owner = "client!kea", name = "Ad", descriptor = "I")
	public int anInt8558;

	@OriginalMember(owner = "client!kea", name = "Cf", descriptor = "I")
	public final int anInt8602;

	@OriginalMember(owner = "client!kea", name = "fb", descriptor = "I")
	private int anInt8445;

	@OriginalMember(owner = "client!kea", name = "H", descriptor = "I")
	public int anInt8422;

	@OriginalMember(owner = "client!kea", name = "Ye", descriptor = "Lclient!rp;")
	private final Class290 aClass290_3;

	@OriginalMember(owner = "client!kea", name = "lb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface lb;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!e;Lclient!pfa;II)V")
	protected Class14_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class251 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anObject15 = this.anObject14 = arg1;
		this.aClass251_118 = arg3;
		this.aCanvas13 = this.aCanvas14 = arg0;
		this.anInt8599 = arg4;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt8558 = this.anInt8565 = local307.height;
		this.anInt8602 = arg5;
		this.anInt8422 = this.anInt8445 = local307.width;
		Static210.method3727(true, false);
		this.aClass290_3 = new Class290(this, super.anInterface4_15);
		this.lb = new NativeInterface(super.anInterface4_15.method4235(), this.anInt8602);
		for (@Pc(349) int local349 = 0; super.anInterface4_15.method4235() > local349; local349++) {
			@Pc(357) Class313 local357 = super.anInterface4_15.method4234(local349);
			if (local357 != null) {
				this.lb.initTextureMetrics(local349, local357.aByte101, local357.aByte100);
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZB)V")
	public final void method6906(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean618 != arg0) {
			this.aBoolean618 = arg0;
			this.method6948();
			this.anInt8583 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kea", name = "s", descriptor = "()F")
	public final float method6907() {
		return this.aFloat169;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II[BBILclient!nh;)Lclient!ht;")
	public abstract Interface11 method6908(@OriginalArg(2) byte[] arg0, @OriginalArg(5) Class219 arg1);

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(II)V")
	public abstract void method6909(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(I)V")
	protected abstract void method6910();

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "(I)V")
	protected abstract void method6911();

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6844(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas14 == arg0) {
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
			@Pc(53) Object local53 = this.method6976(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "()V")
	@Override
	public final void k() {
		this.aBoolean621 = false;
		this.method6988(false, 0, false, 0, 0);
		this.method7001();
		this.method6974();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public final void method6877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class86 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLclient!hs;I)V")
	public final void method6912(@OriginalArg(1) Class138 arg0, @OriginalArg(2) int arg1) {
		this.method6996(false, arg0, false, arg1);
	}

	@OriginalMember(owner = "client!kea", name = "G", descriptor = "()F")
	public final float method6913() {
		return this.aFloat173;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)I")
	@Override
	public final int method6879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "(I)F")
	protected abstract float method6914();

	@OriginalMember(owner = "client!kea", name = "IA", descriptor = "()I")
	@Override
	public final int IA() {
		return this.anInt8618;
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(B)V")
	protected abstract void method6915();

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "(I)V")
	private void method6916() {
		this.aFloat177 = (float) this.anInt8618 - this.aFloat173;
	}

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "(I)V")
	protected void method6917() {
		this.method7013();
	}

	@OriginalMember(owner = "client!kea", name = "l", descriptor = "(I)I")
	public final int method6918() {
		return this.anInt8606;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IB)V")
	public final void method6919(@OriginalArg(1) byte arg0) {
		this.method7025(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!kea", name = "m", descriptor = "(I)V")
	protected abstract void method6920();

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "()Z")
	@Override
	public final boolean method6837() {
		return true;
	}

	@OriginalMember(owner = "client!kea", name = "m", descriptor = "(IIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8603 = arg2;
		this.anInt8609 = arg3;
		this.anInt8597 = arg1;
		this.anInt8617 = arg0;
		this.method6952();
		this.method6969();
		this.method6942();
		this.method6960();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IF)V")
	public final void method6921(@OriginalArg(1) float arg0) {
		if (this.aFloat183 != arg0) {
			this.aFloat183 = arg0;
			this.method6952();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method6922(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(Z)V")
	protected final void method6923() {
		@Pc(9) Enumeration local9 = this.aHashtable7.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method6995(local15, this.aHashtable7.get(local15));
		}
		this.anInterface13_14.method4091();
		this.anInterface13_15.method4091();
		this.aClass20_Sub3_27.method5500();
		this.aClass20_Sub3_23.method5500();
		this.aClass20_Sub3_26.method5500();
		this.aClass20_Sub3_21.method5500();
		this.aClass20_Sub3_22.method5500();
		this.bf.method6212();
		this.anInterface23_8.method4091();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!jr;Lclient!nh;)Z")
	public abstract boolean method6924(@OriginalArg(1) Class161 arg0, @OriginalArg(2) Class219 arg1);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZZ)V")
	public final void method6925(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean606 != arg0) {
			this.aBoolean606 = arg0;
			this.method6920();
		}
	}

	@OriginalMember(owner = "client!kea", name = "n", descriptor = "(I)V")
	protected abstract void method6926();

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "(I)V")
	@Override
	public final void method6905(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kea", name = "o", descriptor = "(I)V")
	protected void method6927() {
		this.anInt8598 = this.anInt8607;
		this.anInt8607 = 0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IFFFFFF)Z")
	private boolean method6928(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface13_15.method4095();
		if (local9 == null) {
			return false;
		}
		@Pc(18) Stream local18 = this.method6939(local9);
		if (Stream.b()) {
			local18.a(arg3);
			local18.a(arg0);
			local18.a(arg2);
			local18.a(arg4);
			local18.a(arg5);
			local18.a(arg1);
		} else {
			local18.b(arg3);
			local18.b(arg0);
			local18.b(arg2);
			local18.b(arg4);
			local18.b(arg5);
			local18.b(arg1);
		}
		local18.c();
		return this.anInterface13_15.method4094();
	}

	@OriginalMember(owner = "client!kea", name = "F", descriptor = "()V")
	@Override
	public final void F() {
		this.anInt8596 = 0;
		this.anInt8611 = this.anInt8422;
		this.anInt8615 = this.anInt8558;
		this.anInt8614 = 0;
		if (this.aBoolean623) {
			this.aBoolean623 = false;
			this.method6931();
		}
		this.method6960();
	}

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "(B)V")
	public final void method6929() {
		if (this.anInt8583 == 4) {
			return;
		}
		this.method6987();
		this.method6966(false);
		this.method6947(false);
		this.method7028(false);
		this.method6906(false);
		this.method6981(false, -2, false);
		this.method6998(1);
		this.method7011(0);
		this.anInt8583 = 4;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BZ)V")
	public final void method6930(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean607 != arg0) {
			this.aBoolean607 = arg0;
			this.method6971();
		}
	}

	@OriginalMember(owner = "client!kea", name = "p", descriptor = "(I)V")
	protected abstract void method6931();

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II[[IZ)Lclient!qca;")
	public abstract Interface19 method6932(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!kea", name = "q", descriptor = "(I)V")
	private void method6933() {
		if (this.anInt8583 == 1) {
			return;
		}
		this.method6987();
		this.method6966(false);
		this.method6947(false);
		this.method7028(false);
		this.method6906(false);
		this.method6981(false, -2, false);
		this.method7011(1);
		this.method7034(this.anInterface10_3);
		this.anInt8583 = 1;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I[BBZLclient!nh;I)Lclient!em;")
	public final Interface6 method6934(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class219 arg3, @OriginalArg(5) int arg4) {
		return this.method7036(arg2, arg0, arg4, arg3, arg1);
	}

	@OriginalMember(owner = "client!kea", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt8582;
		if (local15 || this.aFloat167 != arg1 || arg2 != this.aFloat178) {
			this.anInt8582 = arg0;
			this.aFloat178 = arg2;
			this.aFloat167 = arg1;
			if (local15) {
				this.aFloat182 = (float) (this.anInt8582 & 0xFF0000) / 1.671168E7F;
				this.aFloat170 = (float) (this.anInt8582 & 0xFF) / 255.0F;
				this.aFloat172 = (float) (this.anInt8582 & 0xFF00) / 65280.0F;
				this.method6926();
			}
			this.lb.setSunColour(this.aFloat182, this.aFloat172, this.aFloat170, arg1, arg2);
			this.method7037();
		}
		if (arg3 != this.aFloatArray63[0] || arg4 != this.aFloatArray63[1] || arg5 != this.aFloatArray63[2]) {
			this.aFloatArray63[2] = arg5;
			this.aFloatArray63[0] = arg3;
			this.aFloatArray63[1] = arg4;
			this.aFloatArray64[0] = -arg3;
			this.aFloatArray64[1] = -arg4;
			this.aFloatArray64[2] = -arg5;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray62[0] = arg3 * local153;
			this.aFloatArray62[2] = arg5 * local153;
			this.aFloatArray62[1] = local153 * arg4;
			this.aFloatArray65[2] = -this.aFloatArray62[2];
			this.aFloatArray65[0] = -this.aFloatArray62[0];
			this.aFloatArray65[1] = -this.aFloatArray62[1];
			this.lb.setSunDirection(this.aFloatArray62[0], this.aFloatArray62[1], this.aFloatArray62[2]);
			this.method7006();
			this.anInt8580 = (int) (arg5 * 256.0F / arg4);
			this.anInt8589 = (int) (arg3 * 256.0F / arg4);
		}
		this.method6953();
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public final void method6891(@OriginalArg(0) Class6_Sub15 arg0) {
		this.aNativeHeap6 = ((Class6_Sub15_Sub2) arg0).aNativeHeap5;
		this.aNativeHeapBuffer7 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method6875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method6914();
		this.method6933();
		this.method7025(arg4);
		this.method6912(Static113.aClass138_2, 0);
		this.method6968(Static113.aClass138_2, 0);
		this.method6998(arg5);
		this.aClass54_Sub3_15.method5462((float) (arg2 - 1), (float) (arg3 - 1), 1.0F);
		this.aClass54_Sub3_15.method5458((float) arg0 - local7, 0.0F, (float) arg1 - local7);
		this.method7033();
		this.method6983(false);
		this.method6978(Static572.aClass311_8, 4);
		this.method6983(true);
		this.method6968(Static185.aClass138_3, 0);
		this.method6912(Static185.aClass138_3, 0);
	}

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "(IIIII)V")
	@Override
	protected final void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!ns;BLclient!ns;)V")
	public final void method6935(@OriginalArg(0) Class228 arg0, @OriginalArg(2) Class228 arg1) {
		@Pc(5) boolean local5 = false;
		if (this.aClass228Array6[this.anInt8594] != arg1) {
			this.aClass228Array6[this.anInt8594] = arg1;
			this.method6979();
			local5 = true;
		}
		if (arg0 != this.aClass228Array5[this.anInt8594]) {
			this.aClass228Array5[this.anInt8594] = arg0;
			this.method6943();
			local5 = true;
		}
		if (local5) {
			this.anInt8583 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method6936(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap6.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!kea", name = "r", descriptor = "(I)V")
	protected abstract void method6937();

	@OriginalMember(owner = "client!kea", name = "s", descriptor = "(I)V")
	protected abstract void method6938();

	@OriginalMember(owner = "client!kea", name = "A", descriptor = "([I)V")
	@Override
	public final void A(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt8611;
		arg0[0] = this.anInt8614;
		arg0[1] = this.anInt8596;
		arg0[3] = this.anInt8615;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method6939(@OriginalArg(1) Buffer arg0) {
		this.aStream6.a(arg0);
		return this.aStream6;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!iba;Z)Lclient!xa;")
	@Override
	public final Class58 method6889(@OriginalArg(0) Class140 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(128) Class58 local128;
		if (arg0.anInt4127 == 0 || arg0.anInt4129 == 0) {
			local128 = this.method6863(new int[1], 1, 1, 1);
		} else {
			@Pc(21) int[] local21 = new int[arg0.anInt4129 * arg0.anInt4127];
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg0.aByteArray38 == null) {
				for (local30 = 0; local30 < arg0.anInt4129; local30++) {
					for (local34 = 0; local34 < arg0.anInt4127; local34++) {
						@Pc(92) int local92 = arg0.anIntArray259[arg0.aByteArray39[local23++] & 0xFF];
						local21[local25++] = local92 == 0 ? 0 : local92 | 0xFF000000;
					}
				}
			} else {
				for (local30 = 0; local30 < arg0.anInt4129; local30++) {
					for (local34 = 0; local34 < arg0.anInt4127; local34++) {
						local21[local25++] = arg0.anIntArray259[arg0.aByteArray39[local23] & 0xFF] | arg0.aByteArray38[local23] << 24;
						local23++;
					}
				}
			}
			local128 = this.method6863(local21, arg0.anInt4127, arg0.anInt4127, arg0.anInt4129);
		}
		local128.EA(arg0.anInt4125, arg0.anInt4126, arg0.anInt4124, arg0.anInt4128);
		return local128;
	}

	@OriginalMember(owner = "client!kea", name = "t", descriptor = "(I)Lclient!of;")
	public final Class54_Sub3 method6940() {
		return this.aClass54_Sub3_19;
	}

	@OriginalMember(owner = "client!kea", name = "C", descriptor = "(IIIIII)V")
	@Override
	public final void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6933();
		this.method7025(arg4);
		this.method6912(Static113.aClass138_2, 0);
		this.method6968(Static113.aClass138_2, 0);
		this.method6998(arg5);
		this.aClass54_Sub3_15.method5462((float) arg2, (float) arg3, 1.0F);
		this.aClass54_Sub3_15.G(arg0, arg1, 0);
		this.method7033();
		this.method6983(false);
		this.method7019();
		this.method6983(true);
		this.method6968(Static185.aClass138_3, 0);
		this.method6912(Static185.aClass138_3, 0);
	}

	@OriginalMember(owner = "client!kea", name = "LA", descriptor = "(IIII)V")
	@Override
	public final void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean621) {
			throw new RuntimeException("");
		}
		if (this.anInt8606 != arg0) {
			this.anInt8606 = arg0;
			if (this.aClass22_3 != null) {
				this.aClass22_3.method7651();
			}
		}
		this.anInt8586 = arg2;
		this.anInt8612 = arg3;
		this.anInt8601 = arg1;
		this.method7001();
	}

	@OriginalMember(owner = "client!kea", name = "u", descriptor = "(I)V")
	protected final void method6941() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable7 != null && !this.aHashtable7.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable7.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method6976(local26));
			}
		}
		this.aHashtable7 = local9;
		this.method7024();
		this.method6956();
		this.bf.method6210(this);
	}

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "(B)V")
	public final void method6942() {
		if (Static450.aClass340_5 == this.aClass340_9) {
			return;
		}
		@Pc(14) Class340 local14 = this.aClass340_9;
		this.aClass340_9 = Static450.aClass340_5;
		if (local14.method7416()) {
			this.method6999();
		}
		this.anInt8583 &= 0xFFFFFFE0;
		this.aFloatArray66 = this.aFloatArray67;
	}

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "(B)V")
	protected abstract void method6943();

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!bf;)V")
	public abstract void method6944(@OriginalArg(1) Class28 arg0);

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(II)Lclient!vl;")
	public final Interface23 method6945(@OriginalArg(1) int arg0) {
		if (this.anInterface23_8.method4087() < arg0 * 2) {
			this.anInterface23_8.method4092(arg0);
		}
		return this.anInterface23_8;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!nba;Z)V")
	public abstract void method6946(@OriginalArg(0) Class215 arg0);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZI)V")
	public final void method6947(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean620) {
			this.aBoolean620 = arg0;
			this.method6971();
			this.anInt8583 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kea", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class86_Sub2 local6 = (Class86_Sub2) arg1;
		@Pc(9) Interface6 local9 = local6.anInterface6_3;
		this.method6951();
		this.method7034(local9);
		this.method6998(1);
		this.method6935(Static568.aClass228_14, Static568.aClass228_14);
		this.method6912(Static113.aClass138_2, 0);
		this.method7025(arg0);
		this.aClass54_Sub3_15.method5462((float) this.anInt8422, (float) this.anInt8558, 0.0F);
		this.method7033();
		this.aClass54_Sub3Array3[0].method5462(local9.method7604((float) this.anInt8422), local9.method7600((float) this.anInt8558), 1.0F);
		this.aClass54_Sub3Array3[0].method5458(local9.method7604((float) -arg2), 0.0F, local9.method7600((float) -arg3));
		this.aClass280Array3[0] = Static206.aClass280_4;
		this.method6967();
		this.method7019();
		this.method7002();
		this.method6912(Static185.aClass138_3, 0);
	}

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "(Z)V")
	protected abstract void method6948();

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!po;I)V")
	@Override
	public final void method6885(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class98_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method7256(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "v", descriptor = "(I)V")
	protected abstract void method6949();

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!ba;Lclient!ig;Lclient!q;Lclient!po;I)V")
	@Override
	public final void method6856(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class98_Sub5 arg3, @OriginalArg(4) int arg4) {
		arg0.method7256(arg2, arg3, arg4);
		this.method6888(arg1);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BI[IIZ)Lclient!em;")
	public final Interface6 method6950(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		return this.method6962(arg2, arg0, arg1, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!kea", name = "w", descriptor = "(I)V")
	public final void method6951() {
		if (this.anInt8583 == 2) {
			return;
		}
		this.method6987();
		this.method6966(false);
		this.method6947(false);
		this.method7028(false);
		this.method6906(false);
		this.method6981(false, -2, false);
		this.anInt8583 = 2;
	}

	@OriginalMember(owner = "client!kea", name = "x", descriptor = "(I)V")
	private void method6952() {
		this.aBoolean619 = false;
		if (Static131.aClass340_3 == this.aClass340_9) {
			this.method7021();
			this.method7018();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method6829(@OriginalArg(0) Class54 arg0) {
		this.aClass54_Sub3_16 = (Class54_Sub3) arg0;
		this.aClass54_Sub3_18.la(this.aClass54_Sub3_16);
		this.aClass54_Sub3_18.method5461();
		this.aClass54_Sub3_19.method5465(this.aClass54_Sub3_18);
		this.aClass54_Sub3_17.method5465(this.aClass54_Sub3_16);
		if (this.aClass340_9.method7416()) {
			this.method6999();
		}
	}

	@OriginalMember(owner = "client!kea", name = "y", descriptor = "(I)V")
	protected abstract void method6953();

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "(II)V")
	public final void method6954(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt8594) {
			this.anInt8594 = arg0;
			this.method6915();
		}
	}

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "(B)V")
	protected abstract void method6955();

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6894(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!kea", name = "JA", descriptor = "(I)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0) {
		this.anInt8591 = 0;
		while (arg0 > 1) {
			this.anInt8591++;
			arg0 >>= 0x1;
		}
		this.anInt8604 = 0x1 << this.anInt8591;
	}

	@OriginalMember(owner = "client!kea", name = "C", descriptor = "()Z")
	@Override
	public final boolean method6895() {
		return false;
	}

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "(Z)V")
	private void method6956() {
		this.anInterface13_15 = this.method7004(true);
		this.anInterface13_15.method1884(12, 24);
		this.aClass28_15 = this.method7000(new Class231[] { new Class231(Static321.aClass210_1) });
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!nh;ILclient!jr;I)Lclient!em;")
	public abstract Interface6 method6957(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(3) Class161 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!kea", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt8614 < arg0) {
			this.anInt8614 = arg0;
			local5 = true;
		}
		if (this.anInt8611 > arg2) {
			local5 = true;
			this.anInt8611 = arg2;
		}
		if (this.anInt8596 < arg1) {
			local5 = true;
			this.anInt8596 = arg1;
		}
		if (arg3 < this.anInt8615) {
			local5 = true;
			this.anInt8615 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean623) {
			this.aBoolean623 = true;
			this.method6931();
		}
		this.method7009();
		this.method6960();
	}

	@OriginalMember(owner = "client!kea", name = "z", descriptor = "(I)V")
	protected abstract void method6958();

	@OriginalMember(owner = "client!kea", name = "n", descriptor = "()I")
	@Override
	public final int method6847() {
		return this.anInt8616 - 2;
	}

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "(Z)V")
	public final void method6959() {
		this.aClass280Array3 = new Class280[this.anInt8600];
		this.aClass228Array5 = new Class228[this.anInt8600];
		this.aClass228Array6 = new Class228[this.anInt8600];
		this.aClass54_Sub3Array3 = new Class54_Sub3[this.anInt8600];
		this.anInterface10Array3 = new Interface10[this.anInt8600];
		for (@Pc(32) int local32 = 0; local32 < this.anInt8600; local32++) {
			this.aClass228Array5[local32] = Static41.aClass228_10;
			this.aClass228Array6[local32] = Static41.aClass228_10;
			this.aClass280Array3[local32] = Static304.aClass280_7;
			this.aClass54_Sub3Array3[local32] = new Class54_Sub3();
		}
		this.aClass6_Sub7Array5 = new Class6_Sub7[this.anInt8616 - 2];
		this.anInterface10_3 = this.method6957(1, Static122.aClass219_7, Static239.aClass161_12, 1);
		this.method6891(new Class6_Sub15_Sub2(262144));
		this.aClass28_19 = this.method7000(new Class231[] { new Class231(new Class210[] { Static321.aClass210_1, Static321.aClass210_5 }) });
		this.aClass28_16 = this.method7000(new Class231[] { new Class231(new Class210[] { Static321.aClass210_1, Static321.aClass210_3 }) });
		this.aClass28_20 = this.method7000(new Class231[] { new Class231(Static321.aClass210_1), new Class231(Static321.aClass210_3), new Class231(Static321.aClass210_5), new Class231(Static321.aClass210_2) });
		this.aClass28_18 = this.method7000(new Class231[] { new Class231(Static321.aClass210_1), new Class231(Static321.aClass210_3), new Class231(Static321.aClass210_5) });
		this.aClass20_Sub3_25 = new Class20_Sub3(this, 0, 0, false, false);
		this.aClass20_Sub3_27 = new Class20_Sub3(this, 0, 0, true, true);
		this.aClass20_Sub3_29 = new Class20_Sub3(this, 0, 0, false, false);
		this.aClass20_Sub3_23 = new Class20_Sub3(this, 0, 0, true, true);
		this.aClass20_Sub3_28 = new Class20_Sub3(this, 0, 0, false, false);
		this.aClass20_Sub3_26 = new Class20_Sub3(this, 0, 0, true, true);
		this.aClass20_Sub3_24 = new Class20_Sub3(this, 0, 0, false, false);
		this.aClass20_Sub3_21 = new Class20_Sub3(this, 0, 0, true, true);
		this.aClass20_Sub3_30 = new Class20_Sub3(this, 0, 0, false, false);
		this.aClass20_Sub3_22 = new Class20_Sub3(this, 0, 0, true, true);
		this.bf = new Class278(this);
		this.anInterface23_8 = this.method7005(true);
		this.method6941();
		this.aClass315_5 = new Class315(this);
		this.aClass22Array3[1] = this.method7007(1);
		this.aClass22Array3[2] = this.method7007(2);
		this.aClass22Array3[4] = this.method7007(4);
		this.aClass22Array3[5] = this.method7007(5);
		this.aClass22Array3[6] = this.method7007(6);
		this.aClass22Array3[7] = this.method7007(7);
		this.aClass22Array3[3] = this.method7007(3);
		this.aClass22Array3[8] = this.method7007(8);
		this.aClass22Array3[9] = this.method7007(9);
		if (!this.aClass22Array3[2].method7647()) {
			this.aClass22Array3[2] = this.method7007(0);
		}
		if (!this.aClass22Array3[4].method7647()) {
			this.aClass22Array3[4] = this.aClass22Array3[2];
		}
		if (!this.aClass22Array3[8].method7647()) {
			this.aClass22Array3[8] = this.aClass22Array3[4];
		}
		if (!this.aClass22Array3[9].method7647()) {
			this.aClass22Array3[9] = this.aClass22Array3[8];
		}
		this.method6917();
		this.F();
	}

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "(B)V")
	private void method6960() {
		this.aFloat184 = this.anInt8596 - this.anInt8597;
		this.aFloat174 = this.anInt8611 - this.anInt8617;
		this.aFloat171 = this.anInt8614 - this.anInt8617;
		this.aFloat168 = this.anInt8615 - this.anInt8597;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!ub;[Lclient!iba;Z)Lclient!ta;")
	@Override
	public final Class92 method6854(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class140[] arg1) {
		return new Class92_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!kea", name = "A", descriptor = "(I)V")
	protected abstract void method6961();

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(III[IZII)Lclient!em;")
	public abstract Interface6 method6962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6900(@OriginalArg(0) Canvas arg0) {
		this.aCanvas13 = null;
		this.anObject15 = null;
		if (arg0 == null || arg0 == this.aCanvas14) {
			this.aCanvas13 = this.aCanvas14;
			this.anObject15 = this.anObject14;
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.anObject15 = this.aHashtable7.get(arg0);
			this.aCanvas13 = arg0;
		}
		if (this.aCanvas13 == null || this.anObject15 == null) {
			throw new RuntimeException();
		}
		this.method6922(this.anObject15, this.aCanvas13);
		this.method6982();
	}

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "(Z)V")
	protected abstract void method6963();

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "()V")
	@Override
	protected void method6839() {
		if (this.aBoolean613) {
			return;
		}
		for (@Pc(13) Class6 local13 = this.aClass361_63.method7838(); local13 != null; local13 = this.aClass361_63.method7845()) {
			((Class6_Sub15_Sub2) local13).method5586();
		}
		@Pc(30) Enumeration local30 = this.aHashtable7.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method6995(local36, this.aHashtable7.get(local36));
		}
		Static397.method5811(true, false);
		this.lb.release();
		this.aBoolean613 = true;
	}

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "(B)V")
	protected abstract void method6964();

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(Z)V")
	@Override
	public final void method6880(@OriginalArg(0) boolean arg0) {
		this.aBoolean622 = arg0;
		this.method6948();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IILclient!hs;Z)V")
	protected abstract void method6965(@OriginalArg(1) int arg0, @OriginalArg(2) Class138 arg1);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "()Z")
	@Override
	public final boolean method6826() {
		return false;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(ZZ)V")
	public final void method6966(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean604) {
			this.aBoolean604 = arg0;
			this.method6974();
			this.anInt8583 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kea", name = "ca", descriptor = "(IIII)V")
	@Override
	public final void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt8422 - 1 <= arg2 && arg1 <= 0 && arg3 >= this.anInt8558 - 1) {
			this.F();
			return;
		}
		this.anInt8615 = this.anInt8422 >= arg3 ? arg3 : 0;
		this.anInt8614 = arg0 >= 0 ? arg0 : 0;
		this.anInt8611 = arg2 > this.anInt8422 ? 0 : arg2;
		this.anInt8596 = arg1 < 0 ? 0 : arg1;
		if (!this.aBoolean623) {
			this.aBoolean623 = true;
			this.method6931();
		}
		this.method7009();
		this.method6960();
	}

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "(B)V")
	private void method6967() {
		this.method6963();
		if (this.aClass22_3 != null) {
			this.aClass22_3.method7652();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!hs;IB)V")
	public final void method6968(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		this.method6965(arg1, arg0);
	}

	@OriginalMember(owner = "client!kea", name = "l", descriptor = "(B)V")
	private void method6969() {
		this.aBoolean615 = false;
		this.method7039();
		if (Static177.aClass340_6 == this.aClass340_9) {
			this.method7018();
		}
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)V")
	@Override
	public final void method6850(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kea", name = "B", descriptor = "(I)V")
	private void method6970() {
		this.method6994(0, this.anInterface13_15);
		this.method6944(this.aClass28_15);
		this.method6991(Static98.aClass311_1, 1, 0);
	}

	@OriginalMember(owner = "client!kea", name = "C", descriptor = "(I)V")
	protected abstract void method6971();

	@OriginalMember(owner = "client!kea", name = "E", descriptor = "(I)I")
	public final int method6972() {
		return this.anInt8594;
	}

	@OriginalMember(owner = "client!kea", name = "F", descriptor = "(I)I")
	public final int method6973() {
		return this.anInt8612;
	}

	@OriginalMember(owner = "client!kea", name = "G", descriptor = "(I)V")
	protected abstract void method6974();

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIZLclient!nh;I[FII)Lclient!em;")
	protected abstract Interface6 method6975(@OriginalArg(2) boolean arg0, @OriginalArg(3) Class219 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float[] arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!kea", name = "v", descriptor = "()I")
	@Override
	public final int v() {
		return this.anInt8573 + this.anInt8577 + this.anInt8576;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method6976(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!kea", name = "m", descriptor = "(B)V")
	private void method6977() {
		this.aBoolean614 = false;
		if (Static520.aClass340_8 == this.aClass340_9) {
			this.method7027();
			this.method7018();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!sv;I)V")
	private void method6978(@OriginalArg(1) Class311 arg0, @OriginalArg(2) int arg1) {
		this.method6994(0, this.anInterface13_14);
		this.method6944(this.aClass28_17);
		this.method6991(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!kea", name = "H", descriptor = "(I)V")
	protected abstract void method6979();

	@OriginalMember(owner = "client!kea", name = "I", descriptor = "(I)V")
	public final void method6980() {
		this.aClass54_Sub3_15.Y();
		this.aBoolean603 = true;
		this.method7040();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZIIZ)V")
	public final void method6981(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt8579) {
			if (arg1 < 0) {
				this.method7002();
				this.method7034(null);
				this.method7011(0);
				if (!this.aBoolean621) {
					this.method6988(arg0, 0, arg2, 0, 0);
				}
			} else {
				@Pc(44) Interface6 local44 = this.aClass290_3.method6457(arg1);
				@Pc(50) Class313 local50 = super.anInterface4_15.method4234(arg1);
				if (local50.aByte97 == 0 && local50.aByte102 == 0) {
					this.method7002();
				} else {
					@Pc(66) int local66 = local50.aBoolean595 ? 64 : 128;
					@Pc(70) int local70 = local66 * 50;
					@Pc(74) Class54_Sub3 local74 = this.method7020();
					local74.method5459((float) (local50.aByte97 * (this.anInt8587 % local70)) / (float) local70, 0.0F, (float) (this.anInt8587 % local70 * local50.aByte102) / (float) local70);
					this.method7023(Static206.aClass280_4);
				}
				if (!this.aBoolean621) {
					this.method6988(arg0, local50.anInt8313, arg2, local50.aByte99, local50.aByte98);
				}
				if (this.aClass22_3 == null) {
					this.method7034(local44);
					this.method7011(local50.anInt8310);
				} else {
					this.aClass22_3.method7645(local50.anInt8310, local44);
				}
			}
			this.anInt8579 = arg1;
		}
		this.anInt8583 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kea", name = "sa", descriptor = "(II)V")
	@Override
	public final void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt8584 && arg1 == this.anInt8618) {
			return;
		}
		this.anInt8618 = arg1;
		this.anInt8584 = arg0;
		this.method6969();
		this.method6952();
		this.method7001();
	}

	@OriginalMember(owner = "client!kea", name = "J", descriptor = "(I)V")
	private void method6982() {
		if (this.aCanvas13 == null) {
			this.anInt8445 = this.anInt8565 = 1;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas13.getSize();
			this.anInt8565 = local18.height;
			this.anInt8445 = local18.width;
		}
		this.anInt8422 = this.anInt8445;
		this.anInt8558 = this.anInt8565;
		this.method6977();
		this.method6969();
		this.method6952();
		this.method6990();
		this.method6960();
		this.method6942();
		this.F();
	}

	@OriginalMember(owner = "client!kea", name = "u", descriptor = "()Z")
	@Override
	public final boolean method6876() {
		return true;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(ZB)V")
	public abstract void method6983(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "([FIBZLclient!nh;I)Lclient!em;")
	public final Interface6 method6984(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class219 arg3, @OriginalArg(5) int arg4) {
		return this.method6975(arg2, arg3, arg1, arg0, arg4);
	}

	@OriginalMember(owner = "client!kea", name = "n", descriptor = "(B)V")
	private void method6985() {
		if (this.aFloat173 == 0.0F) {
			this.aFloatArray61[14] = this.aFloat175;
			this.aFloatArray61[10] = this.aFloat181;
		} else {
			@Pc(31) float local31 = this.aFloat169 / (this.aFloat169 + this.aFloat173);
			@Pc(35) float local35 = local31 * local31;
			@Pc(52) float local52 = -this.aFloat175 * (1.0F - local31) * (1.0F - local31) / this.aFloat173;
			this.aFloatArray61[14] = local35 * this.aFloat175;
			this.aFloatArray61[10] = this.aFloat181 + local52;
		}
		this.aFloat180 = (this.aFloatArray61[14] - (float) this.anInt8618) / this.aFloatArray61[10];
	}

	@OriginalMember(owner = "client!kea", name = "AA", descriptor = "(IIII)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8601 = arg1;
		this.anInt8586 = arg2;
		this.aBoolean621 = true;
		this.anInt8612 = arg3;
		this.anInt8606 = arg0;
		this.method6988(false, 0, false, 0, 3);
		if (this.aClass22_3 != null) {
			this.aClass22_3.method7651();
		}
		this.method7001();
		this.method6974();
	}

	@OriginalMember(owner = "client!kea", name = "K", descriptor = "(I)V")
	public final void method6986() {
		if (this.anInt8583 == 16) {
			return;
		}
		this.method7030();
		this.method6966(true);
		this.method7028(true);
		this.method6906(true);
		this.method6998(1);
		this.anInt8583 = 16;
	}

	@OriginalMember(owner = "client!kea", name = "L", descriptor = "(I)V")
	private void method6987() {
		if (this.aClass340_9 == Static520.aClass340_8) {
			return;
		}
		@Pc(12) Class340 local12 = this.aClass340_9;
		this.aClass340_9 = Static520.aClass340_8;
		if (local12.method7416()) {
			this.method6999();
		}
		this.method7027();
		this.aFloatArray66 = this.aFloatArray60;
		this.method7018();
		this.anInt8583 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "(I)Lclient!i;")
	@Override
	public final Class6_Sub15 method6898(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub15_Sub2 local8 = new Class6_Sub15_Sub2(arg0);
		this.aClass361_63.method7833(local8);
		return local8;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BZIZII)V")
	private void method6988(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) boolean local12 = arg2 & this.method6838();
		if (!local12 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			arg4 = 2;
			arg1 = 1;
			arg3 = 0;
		}
		if (arg4 != 0 && arg0) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (arg4 != this.anInt8588) {
			if (this.anInt8588 != 0) {
				this.aClass22Array3[Integer.MAX_VALUE & this.anInt8588].method7643();
			}
			if (arg4 == 0) {
				this.aClass22_3 = null;
			} else {
				this.aClass22_3 = this.aClass22Array3[arg4 & Integer.MAX_VALUE];
				this.aClass22_3.method7646(arg0);
				this.aClass22_3.method7642(arg0);
				this.aClass22_3.method7654(arg1, arg3);
			}
			this.anInt8605 = arg3;
			this.anInt8608 = arg1;
			this.anInt8588 = arg4;
		} else if (this.anInt8588 != 0) {
			this.aClass22Array3[Integer.MAX_VALUE & this.anInt8588].method7642(arg0);
			if (this.anInt8605 != arg3 || this.anInt8608 != arg1) {
				this.aClass22Array3[Integer.MAX_VALUE & this.anInt8588].method7654(arg1, arg3);
				this.anInt8605 = arg3;
				this.anInt8608 = arg1;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!nh;Lclient!jr;)Z")
	public abstract boolean method6989(@OriginalArg(1) Class219 arg0, @OriginalArg(2) Class161 arg1);

	@OriginalMember(owner = "client!kea", name = "E", descriptor = "()Z")
	@Override
	public final boolean method6901() {
		return true;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!ip;)V")
	@Override
	public final void method6835(@OriginalArg(0) Class26 arg0) {
		this.aClass26_Sub2_3 = (Class26_Sub2) arg0;
	}

	@OriginalMember(owner = "client!kea", name = "o", descriptor = "(B)V")
	protected abstract void method6990();

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "()Z")
	@Override
	public final boolean method6838() {
		return this.aClass22Array3[3].method7647();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!sv;II)V")
	public abstract void method6991(@OriginalArg(1) Class311 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!kea", name = "p", descriptor = "(B)Lclient!of;")
	public final Class54_Sub3 method6992() {
		return this.aClass54_Sub3_18;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "([FB)[F")
	public final float[] method6993(@OriginalArg(0) float[] arg0) {
		arg0[12] = this.aFloatArray66[3];
		arg0[8] = this.aFloatArray66[2];
		arg0[4] = this.aFloatArray66[1];
		arg0[0] = this.aFloatArray66[0];
		arg0[13] = this.aFloatArray66[7];
		arg0[1] = this.aFloatArray66[4];
		arg0[9] = this.aFloatArray66[6];
		arg0[5] = this.aFloatArray66[5];
		arg0[2] = this.aFloatArray66[8];
		arg0[3] = this.aFloatArray66[12];
		arg0[6] = this.aFloatArray66[9];
		arg0[10] = this.aFloatArray66[10];
		arg0[7] = this.aFloatArray66[13];
		arg0[14] = this.aFloatArray66[11];
		arg0[11] = this.aFloatArray66[14];
		arg0[15] = this.aFloatArray66[15];
		return arg0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IILclient!ii;)V")
	public abstract void method6994(@OriginalArg(1) int arg0, @OriginalArg(2) Interface13 arg1);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	protected abstract void method6995(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6902(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas14) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.method6995(arg0, this.aHashtable7.get(arg0));
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIIF)Lclient!bj;")
	@Override
	public final Class6_Sub7 method6827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub7_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I[Lclient!bj;)V")
	@Override
	public final void method6869(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub7[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass6_Sub7Array5[local7] = arg1[local7];
		}
		this.anInt8607 = arg0;
		if (this.aClass340_9.method7416()) {
			this.method6927();
		}
	}

	@OriginalMember(owner = "client!kea", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public final void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!kea", name = "x", descriptor = "()Lclient!q;")
	@Override
	public final Class54 method6882() {
		return new Class54_Sub3();
	}

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "()Z")
	@Override
	public final boolean method6842() {
		return true;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZLclient!hs;ZII)V")
	public abstract void method6996(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public final Class59 method6857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class59_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method6997(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "(II)V")
	public final void method6998(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt8581) {
			return;
		}
		@Pc(16) Class68 local16;
		@Pc(14) boolean local14;
		@Pc(18) boolean local18;
		if (arg0 == 1) {
			local14 = true;
			local16 = Static593.aClass68_7;
			local18 = true;
		} else if (arg0 == 2) {
			local18 = false;
			local14 = true;
			local16 = Static292.aClass68_3;
		} else if (arg0 == 128) {
			local16 = Static519.aClass68_6;
			local14 = true;
			local18 = true;
		} else {
			local16 = Static436.aClass68_4;
			local18 = false;
			local14 = false;
		}
		if (local18 != this.aBoolean605) {
			this.aBoolean605 = local18;
			this.method6964();
		}
		if (this.aBoolean608 != local14) {
			this.aBoolean608 = local14;
			this.method6937();
		}
		if (this.aClass68_5 != local16) {
			this.aClass68_5 = local16;
			this.method6938();
		}
		this.anInt8583 &= 0xFFFFFFE3;
		this.anInt8581 = arg0;
	}

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "()Z")
	@Override
	public final boolean method6836() {
		return false;
	}

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "()V")
	@Override
	public final void method6841() {
		this.aClass290_3.method6454();
	}

	@OriginalMember(owner = "client!kea", name = "M", descriptor = "(I)V")
	private void method6999() {
		this.aBoolean611 = false;
		if (this.aClass22_3 != null) {
			this.aClass22_3.method7653();
		}
		this.method6958();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V")
	@Override
	public final void method6822(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt8595 = arg0;
		this.aClass290_3.method6454();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public final Class58 method6863(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class58_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "([Lclient!oc;B)Lclient!bf;")
	public abstract Class28 method7000(@OriginalArg(0) Class231[] arg0);

	@OriginalMember(owner = "client!kea", name = "q", descriptor = "(B)V")
	private void method7001() {
		if (this.aClass22_3 != null) {
			this.aClass22_3.method7649();
		}
		this.method6910();
	}

	@OriginalMember(owner = "client!kea", name = "N", descriptor = "(I)V")
	public final void method7002() {
		if (this.aClass280Array3[this.anInt8594] != Static304.aClass280_7) {
			this.aClass280Array3[this.anInt8594] = Static304.aClass280_7;
			this.aClass54_Sub3Array3[this.anInt8594].Y();
			this.method6967();
		}
	}

	@OriginalMember(owner = "client!kea", name = "q", descriptor = "()Lclient!q;")
	@Override
	public final Class54 method6851() {
		return this.aClass54_Sub3_21;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method6868() {
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(II)I")
	@Override
	public final int method6884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!kea", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt8584;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(IIIIII)Lclient!ip;")
	@Override
	public final Class26 method6883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class26_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "(I)V")
	@Override
	public void method6897(@OriginalArg(0) int arg0) {
		this.aClass290_3.method6455();
		this.anInt8587 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZ)Lclient!ii;")
	public abstract Interface13 method7004(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(BZ)Lclient!vl;")
	public abstract Interface23 method7005(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!kea", name = "s", descriptor = "(B)V")
	public abstract void method7006();

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "(II)Lclient!ho;")
	protected Class22 method7007(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class22_Sub2(this);
		} else if (arg0 == 1) {
			return new Class22_Sub9(this);
		} else if (arg0 == 2) {
			return new Class22_Sub4(this, this.aClass315_5);
		} else if (arg0 == 7) {
			return new Class22_Sub8(this);
		} else {
			return new Class22_Sub3(this);
		}
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "()Z")
	@Override
	public final boolean method6832() {
		return true;
	}

	@OriginalMember(owner = "client!kea", name = "t", descriptor = "(B)[F")
	public final float[] method7008() {
		return this.aFloatArray67;
	}

	@OriginalMember(owner = "client!kea", name = "O", descriptor = "(I)V")
	protected abstract void method7009();

	@OriginalMember(owner = "client!kea", name = "aa", descriptor = "()I")
	@Override
	public final int aa() {
		return this.anInt8619;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(IZ)V")
	public final void method7010(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean617 != arg0) {
			this.aBoolean617 = arg0;
			this.method6974();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BI)V")
	public final void method7011(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method6935(Static568.aClass228_14, Static568.aClass228_14);
		} else if (arg0 == 0) {
			this.method6935(Static41.aClass228_10, Static41.aClass228_10);
		} else if (arg0 == 2) {
			this.method6935(Static568.aClass228_14, Static581.aClass228_15);
		} else if (arg0 == 3) {
			this.method6935(Static41.aClass228_10, Static350.aClass228_12);
		} else if (arg0 == 4) {
			this.method6935(Static164.aClass228_9, Static164.aClass228_9);
		}
	}

	@OriginalMember(owner = "client!kea", name = "P", descriptor = "(I)Lclient!of;")
	public final Class54_Sub3 method7012() {
		return this.aClass54_Sub3_15;
	}

	@OriginalMember(owner = "client!kea", name = "Q", descriptor = "(I)V")
	private void method7013() {
		this.method6926();
		this.method7037();
		this.method6971();
		this.method6927();
		this.method7006();
		this.method6953();
		this.method6920();
		this.method7014();
		this.method6948();
		this.method6974();
		this.method6910();
		this.method6937();
		this.method6938();
		this.method6964();
		for (@Pc(52) int local52 = this.anInt8600 - 1; local52 >= 0; local52--) {
			this.method6954(local52);
			this.method6979();
			this.method6943();
			this.method7002();
		}
		this.method6949();
		this.method6990();
		this.method6911();
		this.method6961();
		this.method6958();
	}

	@OriginalMember(owner = "client!kea", name = "R", descriptor = "(I)V")
	protected abstract void method7014();

	@OriginalMember(owner = "client!kea", name = "u", descriptor = "(B)Lclient!qca;")
	public final Interface19 method7015() {
		return this.aClass26_Sub2_3 == null ? null : this.aClass26_Sub2_3.method7126();
	}

	@OriginalMember(owner = "client!kea", name = "X", descriptor = "(III)V")
	@Override
	public final void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt8585 && arg1 == this.anInt8592 && this.anInt8590 == arg2) {
			return;
		}
		this.anInt8585 = arg0;
		this.anInt8592 = arg1;
		this.anInt8590 = arg2;
		if (this.aBoolean621) {
			return;
		}
		this.method7001();
		this.method6974();
	}

	@OriginalMember(owner = "client!kea", name = "ka", descriptor = "(FF)V")
	@Override
	public final void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat169 == arg0 && this.aFloat173 == arg1) {
			return;
		}
		this.aFloat173 = arg1;
		this.aFloat169 = arg0;
		this.method6916();
		this.method6985();
		this.method6952();
		this.method6969();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!of;)V")
	public final void method7017(@OriginalArg(1) Class54_Sub3 arg0) {
		this.aClass54_Sub3_15.la(arg0);
		this.aBoolean603 = false;
		this.method7040();
	}

	@OriginalMember(owner = "client!kea", name = "p", descriptor = "()Z")
	@Override
	public final boolean method6849() {
		return true;
	}

	@OriginalMember(owner = "client!kea", name = "v", descriptor = "(B)V")
	private void method7018() {
		this.method6911();
		if (this.aClass22_3 != null) {
			this.aClass22_3.method7650();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6823(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas14) {
			local5 = this.anObject15;
		} else if (this.aHashtable7.containsKey(arg0)) {
			local5 = this.aHashtable7.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method6997(arg0, local5);
		if (this.aCanvas13 == arg0) {
			this.method6982();
		}
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		@Pc(29) float local29 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local16 * local16)));
		@Pc(33) float local33 = local16 * local29;
		@Pc(37) float local37 = local9 * local29;
		if (!this.method6928((float) arg1, 0.0F, 0.0F, (float) arg0, local37 + (float) arg2, (float) arg3 + local33)) {
			return;
		}
		this.method6933();
		this.method7025(arg4);
		this.method6912(Static113.aClass138_2, 0);
		this.method6968(Static113.aClass138_2, 0);
		this.method6998(arg5);
		this.method6980();
		this.method6983(false);
		this.method6970();
		this.method6983(true);
		this.method6968(Static185.aClass138_3, 0);
		this.method6912(Static185.aClass138_3, 0);
	}

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "(Z)V")
	public final void method7019() {
		this.method6978(Static232.aClass311_6, 2);
	}

	@OriginalMember(owner = "client!kea", name = "S", descriptor = "(I)Lclient!of;")
	public final Class54_Sub3 method7020() {
		return this.aClass54_Sub3Array3[this.anInt8594];
	}

	@OriginalMember(owner = "client!kea", name = "T", descriptor = "(I)V")
	private void method7021() {
		if (this.aBoolean619) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray59;
		@Pc(17) float local17 = (float) this.anInt8584 - this.aFloat173;
		@Pc(24) float local24 = (float) this.anInt8618 - this.aFloat173;
		@Pc(36) float local36 = (float) -this.anInt8597 * this.aFloat183 / (float) this.anInt8609;
		@Pc(48) float local48 = (float) -this.anInt8617 * this.aFloat183 / (float) this.anInt8603;
		@Pc(62) float local62 = this.aFloat183 * (float) (this.anInt8422 - this.anInt8617) / (float) this.anInt8603;
		@Pc(76) float local76 = this.aFloat183 * (float) (this.anInt8558 - this.anInt8597) / (float) this.anInt8609;
		if (local48 == local62 || local76 == local36) {
			local9[8] = 0.0F;
			local9[11] = 0.0F;
			local9[3] = 0.0F;
			local9[10] = 1.0F;
			local9[5] = 1.0F;
			local9[7] = 0.0F;
			local9[12] = 0.0F;
			local9[0] = 1.0F;
			local9[9] = 0.0F;
			local9[6] = 0.0F;
			local9[1] = 0.0F;
			local9[15] = 1.0F;
			local9[4] = 0.0F;
			local9[13] = 0.0F;
			local9[2] = 0.0F;
			local9[14] = 0.0F;
		} else {
			local9[0] = 2.0F / (local62 - local48);
			local9[10] = 1.0F / (local17 - local24);
			local9[4] = 0.0F;
			local9[6] = 0.0F;
			local9[9] = 0.0F;
			local9[15] = 1.0F;
			local9[7] = 0.0F;
			local9[11] = 0.0F;
			local9[8] = 0.0F;
			local9[12] = (local48 + local62) / (-local62 + local48);
			local9[13] = (local76 + local36) / (-local36 + local76);
			local9[14] = local17 / (local17 - local24);
			local9[1] = 0.0F;
			local9[2] = 0.0F;
			local9[5] = 2.0F / (local76 - local36);
			local9[3] = 0.0F;
		}
		this.method6916();
		this.aBoolean619 = true;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public final Class58 method6874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class58_Sub3 local11 = new Class58_Sub3(this, arg2, arg3, arg4);
		local11.GA(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!kea", name = "w", descriptor = "(B)Lclient!of;")
	public final Class54_Sub3 method7022() {
		if (!this.aBoolean611) {
			this.aClass54_Sub3_20.method5467(this.aClass54_Sub3_18, this.aClass54_Sub3_15);
			this.aBoolean611 = true;
		}
		return this.aClass54_Sub3_20;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!ig;)V")
	@Override
	public final void method6888(@OriginalArg(0) Class144 arg0) {
		this.bf.method6215(this, arg0);
	}

	@OriginalMember(owner = "client!kea", name = "y", descriptor = "()Z")
	@Override
	public final boolean method6886() {
		return true;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZLclient!ra;)V")
	public final void method7023(@OriginalArg(1) Class280 arg0) {
		this.aClass280Array3[this.anInt8594] = arg0;
		this.method6967();
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)V")
	@Override
	public final void method6873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kea", name = "U", descriptor = "(I)V")
	private void method7024() {
		this.anInterface13_14 = this.method7004(false);
		this.anInterface13_14.method1884(28, 140);
		for (@Pc(29) int local29 = 0; local29 < 4; local29++) {
			@Pc(37) Buffer local37 = this.anInterface13_14.method4095();
			if (local37 != null) {
				@Pc(44) Stream local44 = this.method6939(local37);
				if (Stream.b()) {
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(1.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(1.0F);
					local44.a(0.0F);
					local44.a(1.0F);
					local44.a(1.0F);
					local44.a(1.0F);
					local44.a(0.0F);
					local44.a(1.0F);
					local44.a(1.0F);
					local44.a(1.0F);
					local44.a(1.0F);
					local44.a(1.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(1.0F);
					local44.a(0.0F);
					local44.a(1.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(0.0F);
					local44.a(0.0F);
				} else {
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(1.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(1.0F);
					local44.b(0.0F);
					local44.b(1.0F);
					local44.b(1.0F);
					local44.b(1.0F);
					local44.b(0.0F);
					local44.b(1.0F);
					local44.b(1.0F);
					local44.b(1.0F);
					local44.b(1.0F);
					local44.b(1.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(1.0F);
					local44.b(0.0F);
					local44.b(1.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(0.0F);
					local44.b(0.0F);
				}
				local44.c();
				if (this.anInterface13_14.method4094()) {
					break;
				}
			}
		}
		this.aClass28_17 = this.method7000(new Class231[] { new Class231(new Class210[] { Static321.aClass210_1, Static321.aClass210_5, Static321.aClass210_5 }) });
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(BI)V")
	public final void method7025(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt8613) {
			this.anInt8613 = arg0;
			this.method6949();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "([Lclient!ba;Lclient!ig;Lclient!q;[Lclient!po;I)V")
	@Override
	public final void method6872(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class98_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method6885(arg0, arg2, arg3, arg4);
		this.method6888(arg1);
	}

	@OriginalMember(owner = "client!kea", name = "na", descriptor = "(III[I)V")
	@Override
	public final void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass54_Sub3_16.method5463((float) arg0, (float) arg2, (float) arg1);
		if (local14 < (float) this.anInt8584 || (float) this.anInt8618 < local14) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(57) int local57 = (int) ((float) this.anInt8603 * this.aClass54_Sub3_16.method5457((float) arg0, (float) arg1, (float) arg2) / local14);
		@Pc(75) int local75 = (int) ((float) this.anInt8609 * this.aClass54_Sub3_16.method5447((float) arg0, (float) arg1, (float) arg2) / local14);
		if ((float) local57 >= this.aFloat171 && this.aFloat174 >= (float) local57 && (float) local75 >= this.aFloat184 && this.aFloat168 >= (float) local75) {
			arg3[2] = (int) local14;
			arg3[1] = (int) ((float) local75 - this.aFloat184);
			arg3[0] = (int) ((float) local57 - this.aFloat171);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!kea", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public final boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass54_Sub3_16.method5463((float) arg0, (float) arg2, (float) arg1);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass54_Sub3_16.method5463((float) arg3, (float) arg5, (float) arg4);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt8584 > local14 && local31 < (float) this.anInt8584 || !(!((float) this.anInt8618 < local14) || !((float) this.anInt8618 < local31))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt8603 * this.aClass54_Sub3_16.method5457((float) arg0, (float) arg1, (float) arg2) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt8603 * this.aClass54_Sub3_16.method5457((float) arg3, (float) arg4, (float) arg5) / local31);
		if ((float) local81 < this.aFloat171 && (float) local99 < this.aFloat171 || this.aFloat174 < (float) local81 && this.aFloat174 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt8609 * this.aClass54_Sub3_16.method5447((float) arg0, (float) arg1, (float) arg2) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt8609 * this.aClass54_Sub3_16.method5447((float) arg3, (float) arg4, (float) arg5) / local31);
			return (!((float) local143 < this.aFloat184) || !(this.aFloat184 > (float) local161)) && (!((float) local143 > this.aFloat168) || !((float) local161 > this.aFloat168));
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public final Class86 method6840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static457.method6448(arg2, arg0, arg3, this, arg1);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBIIILclient!sv;Lclient!vl;)V")
	public abstract void method7026(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class311 arg4, @OriginalArg(6) Interface23 arg5);

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "(Z)V")
	private void method7027() {
		if (this.aBoolean614) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray60;
		if (this.anInt8422 == 0 || this.anInt8558 == 0) {
			local9[9] = 0.0F;
			local9[7] = 0.0F;
			local9[5] = 1.0F;
			local9[14] = 0.0F;
			local9[11] = 0.0F;
			local9[0] = 1.0F;
			local9[8] = 0.0F;
			local9[2] = 0.0F;
			local9[1] = 0.0F;
			local9[3] = 0.0F;
			local9[4] = 0.0F;
			local9[12] = 0.0F;
			local9[6] = 0.0F;
			local9[15] = 1.0F;
			local9[10] = 1.0F;
			local9[13] = 0.0F;
		} else {
			local9[0] = 2.0F / (float) this.anInt8422;
			local9[13] = 1.0F;
			local9[9] = 0.0F;
			local9[1] = 0.0F;
			local9[7] = 0.0F;
			local9[15] = 1.0F;
			local9[2] = 0.0F;
			local9[3] = 0.0F;
			local9[5] = -2.0F / (float) this.anInt8558;
			local9[11] = 0.0F;
			local9[6] = 0.0F;
			local9[12] = -1.0F;
			local9[10] = 0.5F;
			local9[4] = 0.0F;
			local9[8] = 0.0F;
			local9[14] = 0.5F;
		}
		this.aBoolean614 = true;
	}

	@OriginalMember(owner = "client!kea", name = "ha", descriptor = "(F)V")
	@Override
	public final void ha(@OriginalArg(0) float arg0) {
		if (this.aFloat176 != arg0) {
			this.aFloat176 = arg0;
			this.lb.setAmbient(arg0);
			this.method6926();
			this.method6953();
		}
	}

	@OriginalMember(owner = "client!kea", name = "D", descriptor = "()Z")
	@Override
	public final boolean method6896() {
		return true;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "()Z")
	@Override
	public final boolean method6830() {
		return this.aBoolean612;
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(IZ)V")
	public final void method7028(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean616) {
			this.aBoolean616 = arg0;
			this.method7014();
			this.anInt8583 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kea", name = "V", descriptor = "(I)V")
	private void method7029() {
		if (Static177.aClass340_6 == this.aClass340_9) {
			return;
		}
		@Pc(6) Class340 local6 = this.aClass340_9;
		this.aClass340_9 = Static177.aClass340_6;
		if (!local6.method7416()) {
			this.method6999();
		}
		this.method7039();
		this.aFloatArray66 = this.aFloatArray61;
		this.method7018();
		this.anInt8583 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kea", name = "W", descriptor = "(I)V")
	private void method7030() {
		if (Static131.aClass340_3 == this.aClass340_9) {
			return;
		}
		@Pc(6) Class340 local6 = this.aClass340_9;
		this.aClass340_9 = Static131.aClass340_3;
		if (!local6.method7416()) {
			this.method6999();
		}
		this.method7021();
		this.aFloatArray66 = this.aFloatArray59;
		this.method7018();
		this.anInt8583 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kea", name = "x", descriptor = "(B)Lclient!of;")
	public final Class54_Sub3 method7031() {
		return this.aClass54_Sub3Array3[this.anInt8594];
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6861(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kea", name = "ya", descriptor = "(IIIII)V")
	@Override
	public final void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6894(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!nj;IIII)Lclient!ba;")
	@Override
	public final Class20 method6833(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class20_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!kea", name = "y", descriptor = "(B)V")
	public final void method7032() {
		if (this.anInt8583 == 8) {
			return;
		}
		this.method7029();
		this.method6966(true);
		this.method7028(true);
		this.method6906(true);
		this.method6998(1);
		this.anInt8583 = 8;
	}

	@OriginalMember(owner = "client!kea", name = "X", descriptor = "(I)V")
	public final void method7033() {
		this.aBoolean603 = false;
		this.method7040();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!gl;Z)V")
	public final void method7034(@OriginalArg(0) Interface10 arg0) {
		if (arg0 == this.anInterface10Array3[this.anInt8594]) {
			return;
		}
		this.anInterface10Array3[this.anInt8594] = arg0;
		if (arg0 == null) {
			this.method6955();
		} else {
			arg0.method7586();
		}
		this.anInt8583 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!kea", name = "z", descriptor = "(B)I")
	public final int method7035() {
		return this.anInt8586;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZIIILclient!nh;[BI)Lclient!em;")
	protected abstract Interface6 method7036(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class219 arg3, @OriginalArg(6) byte[] arg4);

	@OriginalMember(owner = "client!kea", name = "A", descriptor = "(B)V")
	protected abstract void method7037();

	@OriginalMember(owner = "client!kea", name = "Y", descriptor = "(I)V")
	public final void method7038() {
		this.method6942();
		this.method7018();
	}

	@OriginalMember(owner = "client!kea", name = "B", descriptor = "(B)V")
	private void method7039() {
		if (this.aBoolean615) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray61;
		@Pc(21) float local21 = (float) (this.anInt8584 * -this.anInt8617) / (float) this.anInt8603;
		@Pc(36) float local36 = (float) ((this.anInt8422 - this.anInt8617) * this.anInt8584) / (float) this.anInt8603;
		@Pc(47) float local47 = (float) (this.anInt8597 * this.anInt8584) / (float) this.anInt8609;
		@Pc(61) float local61 = (float) ((this.anInt8597 - this.anInt8558) * this.anInt8584) / (float) this.anInt8609;
		if (local21 == local36 || local61 == local47) {
			local9[11] = 0.0F;
			local9[13] = 0.0F;
			local9[0] = 1.0F;
			local9[5] = 1.0F;
			local9[3] = 0.0F;
			local9[4] = 0.0F;
			local9[8] = 0.0F;
			local9[10] = 1.0F;
			local9[1] = 0.0F;
			local9[6] = 0.0F;
			local9[12] = 0.0F;
			local9[14] = 0.0F;
			local9[7] = 0.0F;
			local9[2] = 0.0F;
			local9[15] = 1.0F;
			local9[9] = 0.0F;
		} else {
			@Pc(141) float local141 = (float) this.anInt8584 * 2.0F;
			local9[15] = 0.0F;
			local9[9] = (local61 + local47) / (-local61 + local47);
			local9[1] = 0.0F;
			local9[12] = 0.0F;
			local9[13] = 0.0F;
			local9[2] = 0.0F;
			local9[5] = local141 / (local47 - local61);
			local9[11] = -1.0F;
			local9[3] = 0.0F;
			local9[8] = (local21 + local36) / (-local21 + local36);
			local9[7] = 0.0F;
			local9[0] = local141 / (local36 - local21);
			local9[14] = this.aFloat175 = (float) (this.anInt8618 * this.anInt8584) / (float) (this.anInt8584 - this.anInt8618);
			local9[4] = 0.0F;
			local9[10] = this.aFloat181 = (float) this.anInt8618 / (float) (this.anInt8584 - this.anInt8618);
			local9[6] = 0.0F;
		}
		this.method6985();
		this.aBoolean615 = true;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIZ)Lclient!xa;")
	@Override
	public final Class58 method6862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class58_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!kea", name = "Z", descriptor = "(I)V")
	private void method7040() {
		if (Static520.aClass340_8 == this.aClass340_9) {
			@Pc(7) float local7 = this.method6914();
			this.aClass54_Sub3_15.method5458(local7, 0.0F, local7);
		}
		this.aBoolean611 = false;
		this.method6961();
		if (this.aClass22_3 != null) {
			this.aClass22_3.method7644();
		}
	}
}
