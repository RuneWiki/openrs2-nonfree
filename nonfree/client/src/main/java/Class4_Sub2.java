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

@OriginalClass("client!bda")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!bda", name = "tb", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!bda", name = "xb", descriptor = "Lclient!lba;")
	protected Class173 aClass173_6;

	@OriginalMember(owner = "client!bda", name = "Bb", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable6;

	@OriginalMember(owner = "client!bda", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!bda", name = "Id", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!bda", name = "Rd", descriptor = "I")
	public int anInt8285;

	@OriginalMember(owner = "client!bda", name = "Ud", descriptor = "I")
	public int anInt8287;

	@OriginalMember(owner = "client!bda", name = "Wd", descriptor = "I")
	protected int anInt8288;

	@OriginalMember(owner = "client!bda", name = "de", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!bda", name = "fe", descriptor = "F")
	private float aFloat165;

	@OriginalMember(owner = "client!bda", name = "je", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!bda", name = "ke", descriptor = "Z")
	public boolean aBoolean594;

	@OriginalMember(owner = "client!bda", name = "pe", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!bda", name = "te", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!bda", name = "ue", descriptor = "F")
	private float aFloat170;

	@OriginalMember(owner = "client!bda", name = "Ge", descriptor = "I")
	public int anInt8302;

	@OriginalMember(owner = "client!bda", name = "Ke", descriptor = "I")
	private int anInt8303;

	@OriginalMember(owner = "client!bda", name = "Me", descriptor = "I")
	protected int anInt8305;

	@OriginalMember(owner = "client!bda", name = "Ne", descriptor = "I")
	protected int anInt8306;

	@OriginalMember(owner = "client!bda", name = "Pe", descriptor = "Lclient!fl;")
	private Class103_Sub1 aClass103_Sub1_3;

	@OriginalMember(owner = "client!bda", name = "Qe", descriptor = "Lclient!lj;")
	private Class73 aClass73_3;

	@OriginalMember(owner = "client!bda", name = "Se", descriptor = "Z")
	public boolean aBoolean603;

	@OriginalMember(owner = "client!bda", name = "Te", descriptor = "[Lclient!cba;")
	protected Class1_Sub5[] aClass1_Sub5Array6;

	@OriginalMember(owner = "client!bda", name = "Ue", descriptor = "I")
	protected int anInt8309;

	@OriginalMember(owner = "client!bda", name = "Ve", descriptor = "[Lclient!raa;")
	protected Class246[] aClass246Array5;

	@OriginalMember(owner = "client!bda", name = "We", descriptor = "F")
	private float aFloat173;

	@OriginalMember(owner = "client!bda", name = "Xe", descriptor = "Lclient!kr;")
	private Class169 aClass169_3;

	@OriginalMember(owner = "client!bda", name = "bf", descriptor = "F")
	public float bf;

	@OriginalMember(owner = "client!bda", name = "hf", descriptor = "Z")
	public boolean aBoolean605;

	@OriginalMember(owner = "client!bda", name = "mf", descriptor = "[Lclient!hv;")
	private Interface8[] anInterface8Array3;

	@OriginalMember(owner = "client!bda", name = "of", descriptor = "I")
	public int anInt8314;

	@OriginalMember(owner = "client!bda", name = "sf", descriptor = "[Lclient!raa;")
	protected Class246[] aClass246Array6;

	@OriginalMember(owner = "client!bda", name = "wf", descriptor = "I")
	public int anInt8319;

	@OriginalMember(owner = "client!bda", name = "yf", descriptor = "[Lclient!ft;")
	protected Class107[] aClass107Array3;

	@OriginalMember(owner = "client!bda", name = "zf", descriptor = "Z")
	protected boolean aBoolean607;

	@OriginalMember(owner = "client!bda", name = "Gf", descriptor = "I")
	protected int anInt8321;

	@OriginalMember(owner = "client!bda", name = "Hf", descriptor = "I")
	public int anInt8322;

	@OriginalMember(owner = "client!bda", name = "Pf", descriptor = "Z")
	protected boolean aBoolean610;

	@OriginalMember(owner = "client!bda", name = "Rf", descriptor = "[Lclient!sg;")
	protected Class128_Sub3[] aClass128_Sub3Array3;

	@OriginalMember(owner = "client!bda", name = "Vf", descriptor = "I")
	private int anInt8325;

	@OriginalMember(owner = "client!bda", name = "Wf", descriptor = "Lclient!hv;")
	public Interface8 anInterface8_3;

	@OriginalMember(owner = "client!bda", name = "Zf", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!bda", name = "bg", descriptor = "Lclient!rw;")
	public Class97_Sub2 aClass97_Sub2_21;

	@OriginalMember(owner = "client!bda", name = "cg", descriptor = "Lclient!rw;")
	public Class97_Sub2 aClass97_Sub2_22;

	@OriginalMember(owner = "client!bda", name = "dg", descriptor = "Lclient!rw;")
	public Class97_Sub2 aClass97_Sub2_23;

	@OriginalMember(owner = "client!bda", name = "eg", descriptor = "Lclient!vr;")
	public Class310 aClass310_16;

	@OriginalMember(owner = "client!bda", name = "fg", descriptor = "Lclient!iaa;")
	private Interface9 anInterface9_8;

	@OriginalMember(owner = "client!bda", name = "gg", descriptor = "Lclient!rw;")
	public Class97_Sub2 aClass97_Sub2_24;

	@OriginalMember(owner = "client!bda", name = "hg", descriptor = "Lclient!vr;")
	public Class310 aClass310_17;

	@OriginalMember(owner = "client!bda", name = "ig", descriptor = "Lclient!vr;")
	private Class310 aClass310_18;

	@OriginalMember(owner = "client!bda", name = "jg", descriptor = "Lclient!rw;")
	public Class97_Sub2 aClass97_Sub2_25;

	@OriginalMember(owner = "client!bda", name = "kg", descriptor = "Lclient!rq;")
	private Interface16 anInterface16_11;

	@OriginalMember(owner = "client!bda", name = "lg", descriptor = "Lclient!rw;")
	public Class97_Sub2 aClass97_Sub2_26;

	@OriginalMember(owner = "client!bda", name = "mg", descriptor = "Lclient!rw;")
	public Class97_Sub2 aClass97_Sub2_27;

	@OriginalMember(owner = "client!bda", name = "og", descriptor = "Lclient!vr;")
	private Class310 aClass310_19;

	@OriginalMember(owner = "client!bda", name = "pg", descriptor = "Lclient!rw;")
	public Class97_Sub2 aClass97_Sub2_28;

	@OriginalMember(owner = "client!bda", name = "qg", descriptor = "Lclient!rq;")
	private Interface16 anInterface16_12;

	@OriginalMember(owner = "client!bda", name = "rg", descriptor = "Lclient!vr;")
	public Class310 aClass310_20;

	@OriginalMember(owner = "client!bda", name = "sg", descriptor = "Lclient!rw;")
	public Class97_Sub2 aClass97_Sub2_29;

	@OriginalMember(owner = "client!bda", name = "tg", descriptor = "Lclient!rw;")
	public Class97_Sub2 aClass97_Sub2_30;

	@OriginalMember(owner = "client!bda", name = "ug", descriptor = "Lclient!vr;")
	public Class310 aClass310_21;

	@OriginalMember(owner = "client!bda", name = "vg", descriptor = "I")
	private int anInt8329;

	@OriginalMember(owner = "client!bda", name = "wg", descriptor = "Z")
	protected boolean aBoolean613;

	@OriginalMember(owner = "client!bda", name = "J", descriptor = "Lclient!ui;")
	private final Class295 aClass295_50 = new Class295();

	@OriginalMember(owner = "client!bda", name = "Vd", descriptor = "Z")
	protected boolean aBoolean593 = true;

	@OriginalMember(owner = "client!bda", name = "Sd", descriptor = "Lclient!sg;")
	protected final Class128_Sub3 aClass128_Sub3_15 = new Class128_Sub3();

	@OriginalMember(owner = "client!bda", name = "Xd", descriptor = "Lclient!sg;")
	public Class128_Sub3 aClass128_Sub3_16 = new Class128_Sub3();

	@OriginalMember(owner = "client!bda", name = "Yd", descriptor = "Lclient!sg;")
	public final Class128_Sub3 aClass128_Sub3_17 = new Class128_Sub3();

	@OriginalMember(owner = "client!bda", name = "Zd", descriptor = "Lclient!sg;")
	protected final Class128_Sub3 aClass128_Sub3_18 = new Class128_Sub3();

	@OriginalMember(owner = "client!bda", name = "ae", descriptor = "Lclient!sg;")
	private final Class128_Sub3 aClass128_Sub3_19 = new Class128_Sub3();

	@OriginalMember(owner = "client!bda", name = "be", descriptor = "Lclient!sg;")
	private final Class128_Sub3 aClass128_Sub3_20 = new Class128_Sub3();

	@OriginalMember(owner = "client!bda", name = "me", descriptor = "I")
	protected int anInt8293 = 0;

	@OriginalMember(owner = "client!bda", name = "re", descriptor = "I")
	private int anInt8296 = 0;

	@OriginalMember(owner = "client!bda", name = "we", descriptor = "I")
	protected final int anInt8298 = 0;

	@OriginalMember(owner = "client!bda", name = "ne", descriptor = "I")
	protected int anInt8294 = -1;

	@OriginalMember(owner = "client!bda", name = "se", descriptor = "I")
	public int anInt8297 = 8;

	@OriginalMember(owner = "client!bda", name = "ge", descriptor = "I")
	protected int anInt8291 = 3584;

	@OriginalMember(owner = "client!bda", name = "ce", descriptor = "I")
	public int anInt8289 = -1;

	@OriginalMember(owner = "client!bda", name = "Fe", descriptor = "Z")
	private boolean aBoolean601 = false;

	@OriginalMember(owner = "client!bda", name = "Re", descriptor = "I")
	private int anInt8308 = 16777215;

	@OriginalMember(owner = "client!bda", name = "De", descriptor = "I")
	public int anInt8300 = 512;

	@OriginalMember(owner = "client!bda", name = "ie", descriptor = "I")
	private int anInt8292 = 0;

	@OriginalMember(owner = "client!bda", name = "le", descriptor = "Z")
	protected boolean aBoolean595 = false;

	@OriginalMember(owner = "client!bda", name = "Ce", descriptor = "Z")
	protected boolean aBoolean600 = true;

	@OriginalMember(owner = "client!bda", name = "ef", descriptor = "I")
	public int anInt8311 = -1;

	@OriginalMember(owner = "client!bda", name = "Ee", descriptor = "I")
	protected int anInt8301 = 0;

	@OriginalMember(owner = "client!bda", name = "ff", descriptor = "[F")
	private final float[] aFloatArray67 = new float[16];

	@OriginalMember(owner = "client!bda", name = "He", descriptor = "Lclient!ih;")
	protected Class137 aClass137_7 = Static221.aClass137_4;

	@OriginalMember(owner = "client!bda", name = "Ye", descriptor = "[F")
	public final float[] aFloatArray66 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!bda", name = "jf", descriptor = "I")
	private int anInt8312 = -1;

	@OriginalMember(owner = "client!bda", name = "ve", descriptor = "Z")
	private boolean aBoolean596 = false;

	@OriginalMember(owner = "client!bda", name = "Ie", descriptor = "F")
	public float aFloat172 = 1.0F;

	@OriginalMember(owner = "client!bda", name = "Oe", descriptor = "I")
	public int anInt8307 = 0;

	@OriginalMember(owner = "client!bda", name = "ee", descriptor = "I")
	public int anInt8290 = 3;

	@OriginalMember(owner = "client!bda", name = "ze", descriptor = "Z")
	protected boolean aBoolean598 = false;

	@OriginalMember(owner = "client!bda", name = "tf", descriptor = "I")
	private int anInt8317 = 0;

	@OriginalMember(owner = "client!bda", name = "af", descriptor = "F")
	public float aFloat175 = 1.0F;

	@OriginalMember(owner = "client!bda", name = "Df", descriptor = "F")
	private float aFloat177 = 1.0F;

	@OriginalMember(owner = "client!bda", name = "Le", descriptor = "I")
	private int anInt8304 = -1;

	@OriginalMember(owner = "client!bda", name = "kf", descriptor = "[F")
	private final float[] aFloatArray69 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!bda", name = "vf", descriptor = "[F")
	private final float[] aFloatArray70 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!bda", name = "cf", descriptor = "Z")
	private boolean aBoolean604 = false;

	@OriginalMember(owner = "client!bda", name = "Je", descriptor = "Z")
	protected boolean aBoolean602 = true;

	@OriginalMember(owner = "client!bda", name = "Ze", descriptor = "F")
	public float aFloat174 = -1.0F;

	@OriginalMember(owner = "client!bda", name = "qf", descriptor = "I")
	protected int anInt8316 = 0;

	@OriginalMember(owner = "client!bda", name = "Cf", descriptor = "F")
	public float aFloat176 = 1.0F;

	@OriginalMember(owner = "client!bda", name = "ye", descriptor = "F")
	public float aFloat171 = 3584.0F;

	@OriginalMember(owner = "client!bda", name = "Af", descriptor = "I")
	public int anInt8320 = 128;

	@OriginalMember(owner = "client!bda", name = "Mf", descriptor = "F")
	private float aFloat178 = 3000.0F;

	@OriginalMember(owner = "client!bda", name = "df", descriptor = "I")
	protected int anInt8310 = 0;

	@OriginalMember(owner = "client!bda", name = "pf", descriptor = "I")
	protected int anInt8315 = 0;

	@OriginalMember(owner = "client!bda", name = "Ae", descriptor = "Z")
	protected boolean aBoolean599 = true;

	@OriginalMember(owner = "client!bda", name = "xe", descriptor = "Z")
	protected boolean aBoolean597 = true;

	@OriginalMember(owner = "client!bda", name = "Nf", descriptor = "Z")
	private boolean aBoolean609 = false;

	@OriginalMember(owner = "client!bda", name = "lf", descriptor = "I")
	protected final int anInt8313 = 0;

	@OriginalMember(owner = "client!bda", name = "oe", descriptor = "Lclient!ug;")
	protected Class294 aClass294_13 = Static143.aClass294_5;

	@OriginalMember(owner = "client!bda", name = "If", descriptor = "[F")
	private final float[] aFloatArray73 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!bda", name = "Ff", descriptor = "[F")
	private final float[] aFloatArray72 = new float[16];

	@OriginalMember(owner = "client!bda", name = "Jf", descriptor = "I")
	public int anInt8323 = 0;

	@OriginalMember(owner = "client!bda", name = "xf", descriptor = "[F")
	protected float[] aFloatArray71 = this.aFloatArray70;

	@OriginalMember(owner = "client!bda", name = "Kf", descriptor = "I")
	public int anInt8324 = 50;

	@OriginalMember(owner = "client!bda", name = "Of", descriptor = "[F")
	public final float[] aFloatArray74 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!bda", name = "rf", descriptor = "Z")
	protected boolean aBoolean606 = false;

	@OriginalMember(owner = "client!bda", name = "Tf", descriptor = "Z")
	protected boolean aBoolean612 = false;

	@OriginalMember(owner = "client!bda", name = "gf", descriptor = "[F")
	private final float[] aFloatArray68 = new float[16];

	@OriginalMember(owner = "client!bda", name = "Qf", descriptor = "Z")
	protected boolean aBoolean611 = true;

	@OriginalMember(owner = "client!bda", name = "Sf", descriptor = "F")
	public float aFloat179 = 1.0F;

	@OriginalMember(owner = "client!bda", name = "he", descriptor = "F")
	public float aFloat166 = -1.0F;

	@OriginalMember(owner = "client!bda", name = "Uf", descriptor = "F")
	public float aFloat180 = 3584.0F;

	@OriginalMember(owner = "client!bda", name = "Lf", descriptor = "Z")
	private boolean aBoolean608 = false;

	@OriginalMember(owner = "client!bda", name = "Yf", descriptor = "I")
	public int anInt8327 = 0;

	@OriginalMember(owner = "client!bda", name = "Ef", descriptor = "[Lclient!lj;")
	private final Class73[] aClass73Array3 = new Class73[10];

	@OriginalMember(owner = "client!bda", name = "qe", descriptor = "I")
	private int anInt8295 = 1;

	@OriginalMember(owner = "client!bda", name = "Xf", descriptor = "I")
	public int anInt8326 = 512;

	@OriginalMember(owner = "client!bda", name = "ag", descriptor = "I")
	private int anInt8328 = 0;

	@OriginalMember(owner = "client!bda", name = "Bf", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream6 = new Stream();

	@OriginalMember(owner = "client!bda", name = "ng", descriptor = "Lclient!sg;")
	private final Class128_Sub3 aClass128_Sub3_21 = new Class128_Sub3();

	@OriginalMember(owner = "client!bda", name = "vc", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas14;

	@OriginalMember(owner = "client!bda", name = "eb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!bda", name = "Be", descriptor = "I")
	protected final int anInt8299;

	@OriginalMember(owner = "client!bda", name = "W", descriptor = "Ljava/lang/Object;")
	protected final Object anObject15;

	@OriginalMember(owner = "client!bda", name = "I", descriptor = "Ljava/lang/Object;")
	private Object anObject14;

	@OriginalMember(owner = "client!bda", name = "Vb", descriptor = "Lclient!dn;")
	protected final Class69 aClass69_92;

	@OriginalMember(owner = "client!bda", name = "Pc", descriptor = "I")
	private int anInt8232;

	@OriginalMember(owner = "client!bda", name = "z", descriptor = "I")
	public int anInt8123;

	@OriginalMember(owner = "client!bda", name = "uf", descriptor = "I")
	public final int anInt8318;

	@OriginalMember(owner = "client!bda", name = "x", descriptor = "I")
	private int anInt8121;

	@OriginalMember(owner = "client!bda", name = "zb", descriptor = "I")
	public int anInt8167;

	@OriginalMember(owner = "client!bda", name = "nf", descriptor = "Lclient!faa;")
	private final Class94 aClass94_3;

	@OriginalMember(owner = "client!bda", name = "t", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!n;Lclient!dn;II)V")
	protected Class4_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface13 arg2, @OriginalArg(3) Class69 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.aCanvas13 = this.aCanvas14 = arg0;
		this.anInt8299 = arg4;
		this.anObject14 = this.anObject15 = arg1;
		this.aClass69_92 = arg3;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt8123 = this.anInt8232 = local307.width;
		this.anInt8318 = arg5;
		this.anInt8167 = this.anInt8121 = local307.height;
		Static290.method5100(false, true);
		this.aClass94_3 = new Class94(this, super.anInterface13_13);
		this.aNativeInterface3 = new NativeInterface(super.anInterface13_13.method5785(), this.anInt8318);
		for (@Pc(349) int local349 = 0; super.anInterface13_13.method5785() > local349; local349++) {
			@Pc(357) Class296 local357 = super.anInterface13_13.method5789(local349);
			if (local357 != null) {
				this.aNativeInterface3.initTextureMetrics(local349, local357.aByte103, local357.aByte99);
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "(Z)Lclient!sg;")
	public final Class128_Sub3 method7225() {
		if (!this.aBoolean609) {
			this.aClass128_Sub3_20.method6891(this.aClass128_Sub3_18, this.aClass128_Sub3_15);
			this.aBoolean609 = true;
		}
		return this.aClass128_Sub3_20;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method7215() {
	}

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7217(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas14 == arg0) {
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
			@Pc(53) Object local53 = this.method7233(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7153() {
		return true;
	}

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7203(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
	protected abstract void method7226();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZB)Lclient!iaa;")
	public abstract Interface9 method7227(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(II)V")
	public final void method7228(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt8295) {
			return;
		}
		@Pc(17) Class294 local17;
		@Pc(21) boolean local21;
		@Pc(19) boolean local19;
		if (arg0 == 1) {
			local17 = Static143.aClass294_5;
			local19 = true;
			local21 = true;
		} else if (arg0 == 2) {
			local17 = Static344.aClass294_9;
			local19 = false;
			local21 = true;
		} else if (arg0 == 128) {
			local19 = true;
			local21 = true;
			local17 = Static513.aClass294_15;
		} else {
			local19 = false;
			local17 = Static160.aClass294_14;
			local21 = false;
		}
		if (this.aBoolean597 != local19) {
			this.aBoolean597 = local19;
			this.method7307();
		}
		if (local21 != this.aBoolean602) {
			this.aBoolean602 = local21;
			this.method7230();
		}
		if (local17 != this.aClass294_13) {
			this.aClass294_13 = local17;
			this.method7342();
		}
		this.anInt8303 &= 0xFFFFFFE3;
		this.anInt8295 = arg0;
	}

	@OriginalMember(owner = "client!bda", name = "h", descriptor = "(I)V")
	private void method7229() {
		this.aBoolean609 = false;
		if (this.aClass73_3 != null) {
			this.aClass73_3.method7572();
		}
		this.method7300();
	}

	@OriginalMember(owner = "client!bda", name = "i", descriptor = "(I)V")
	protected abstract void method7230();

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7174(@OriginalArg(0) Canvas arg0) {
		this.anObject14 = null;
		this.aCanvas13 = null;
		if (arg0 == null || arg0 == this.aCanvas14) {
			this.anObject14 = this.anObject15;
			this.aCanvas13 = this.aCanvas14;
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.anObject14 = this.aHashtable6.get(arg0);
			this.aCanvas13 = arg0;
		}
		if (this.aCanvas13 == null || this.anObject14 == null) {
			throw new RuntimeException();
		}
		this.method7313(this.anObject14, this.aCanvas13);
		this.method7260();
	}

	@OriginalMember(owner = "client!bda", name = "CA", descriptor = "()I")
	@Override
	public final int CA() {
		return this.anInt8291;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BI)V")
	public abstract void method7231(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bda", name = "IA", descriptor = "(III[I)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass128_Sub3_16.method6888((float) arg2, (float) arg0, (float) arg1);
		if (local14 < (float) this.anInt8324 || local14 > (float) this.anInt8291) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(57) int local57 = (int) ((float) this.anInt8326 * this.aClass128_Sub3_16.method6897((float) arg2, (float) arg1, (float) arg0) / local14);
		@Pc(75) int local75 = (int) ((float) this.anInt8300 * this.aClass128_Sub3_16.method6894((float) arg1, (float) arg0, (float) arg2) / local14);
		if (this.aFloat181 <= (float) local57 && (float) local57 <= this.bf && (float) local75 >= this.aFloat168 && this.aFloat167 >= (float) local75) {
			arg3[2] = (int) local14;
			arg3[0] = (int) ((float) local57 - this.aFloat181);
			arg3[1] = (int) ((float) local75 - this.aFloat168);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!bda", name = "j", descriptor = "(I)V")
	protected abstract void method7232();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!r;Lclient!ka;Lclient!m;Lclient!cf;I)V")
	@Override
	public final void method7211(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) Class46_Sub1 arg3) {
		arg0.method6773(arg2, arg3, 0);
		this.method7179(arg1);
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7214(@OriginalArg(0) boolean arg0) {
		this.aBoolean600 = arg0;
		this.method7360();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method7233(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!bda", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7208() {
		return true;
	}

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "(Z)V")
	private void method7234() {
		this.method7226();
		if (this.aClass73_3 != null) {
			this.aClass73_3.method7573();
		}
	}

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "(Z)V")
	private void method7235() {
		if (this.anInt8303 == 1) {
			return;
		}
		this.method7359();
		this.method7261(false);
		this.method7299(false);
		this.method7283(false);
		this.method7348(false);
		this.method7281(-2, false, false);
		this.method7279(1);
		this.method7316(this.anInterface8_3);
		this.anInt8303 = 1;
	}

	@OriginalMember(owner = "client!bda", name = "UA", descriptor = "(IIIII)V")
	@Override
	public final void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7203(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!bda", name = "D", descriptor = "()Z")
	@Override
	public final boolean method7223() {
		return false;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!dp;Z)Lclient!ha;")
	@Override
	public final Class104 method7149(@OriginalArg(0) Class70 arg0) {
		@Pc(26) Class104 local26;
		if (arg0.anInt2013 == 0 || arg0.anInt2012 == 0) {
			local26 = this.method7156(new int[1], 1, 1, 1);
		} else {
			@Pc(35) int[] local35 = new int[arg0.anInt2012 * arg0.anInt2013];
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			@Pc(44) int local44;
			@Pc(48) int local48;
			if (arg0.aByteArray18 == null) {
				for (local44 = 0; local44 < arg0.anInt2012; local44++) {
					for (local48 = 0; local48 < arg0.anInt2013; local48++) {
						@Pc(110) int local110 = arg0.anIntArray142[arg0.aByteArray19[local37++] & 0xFF];
						local35[local39++] = local110 == 0 ? 0 : local110 | 0xFF000000;
					}
				}
			} else {
				for (local44 = 0; local44 < arg0.anInt2012; local44++) {
					for (local48 = 0; local48 < arg0.anInt2013; local48++) {
						local35[local39++] = arg0.aByteArray18[local37] << 24 | arg0.anIntArray142[arg0.aByteArray19[local37] & 0xFF];
						local37++;
					}
				}
			}
			local26 = this.method7156(local35, arg0.anInt2013, arg0.anInt2013, arg0.anInt2012);
		}
		local26.KA(arg0.anInt2011, arg0.anInt2010, arg0.anInt2015, arg0.anInt2014);
		return local26;
	}

	@OriginalMember(owner = "client!bda", name = "k", descriptor = "(I)V")
	protected void method7236() {
		this.method7295();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BLclient!g;Lclient!vp;)Z")
	public abstract boolean method7237(@OriginalArg(1) Class110 arg0, @OriginalArg(2) Class308 arg1);

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		@Pc(30) float local30 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
		@Pc(34) float local34 = local17 * local30;
		@Pc(38) float local38 = local10 * local30;
		if (!this.method7285(local38 + (float) arg2, (float) arg3 + local34, (float) arg1, 0.0F, (float) arg0, 0.0F)) {
			return;
		}
		this.method7235();
		this.method7275(arg4);
		this.method7277(0, Static319.aClass27_4);
		this.method7330(Static319.aClass27_4, 0);
		this.method7228(arg5);
		this.method7274();
		this.method7327(false);
		this.method7343();
		this.method7327(true);
		this.method7330(Static360.aClass27_5, 0);
		this.method7277(0, Static360.aClass27_5);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!ka;)V")
	@Override
	public final void method7179(@OriginalArg(0) Class158 arg0) {
		this.aClass169_3.method4650(arg0, this);
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(B)V")
	protected final void method7238() {
		@Pc(15) Enumeration local15 = this.aHashtable6.keys();
		while (local15.hasMoreElements()) {
			@Pc(21) Canvas local21 = (Canvas) local15.nextElement();
			this.method7258(this.aHashtable6.get(local21), local21);
		}
		this.anInterface16_11.method7609();
		this.anInterface16_12.method7609();
		this.aClass97_Sub2_28.method6746();
		this.aClass97_Sub2_21.method6746();
		this.aClass97_Sub2_23.method6746();
		this.aClass97_Sub2_29.method6746();
		this.aClass97_Sub2_22.method6746();
		this.aClass169_3.method4646();
		this.anInterface9_8.method7609();
	}

	@OriginalMember(owner = "client!bda", name = "l", descriptor = "(I)V")
	private void method7239() {
		if (this.aClass137_7 == Static159.aClass137_2) {
			return;
		}
		@Pc(12) Class137 local12 = this.aClass137_7;
		this.aClass137_7 = Static159.aClass137_2;
		if (!local12.method3761()) {
			this.method7229();
		}
		this.method7255();
		this.aFloatArray71 = this.aFloatArray67;
		this.method7354();
		this.anInt8303 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V")
	@Override
	public final void method7196(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!bda", name = "m", descriptor = "(I)V")
	public final void method7240() {
		if (this.anInt8303 == 8) {
			return;
		}
		this.method7282();
		this.method7261(true);
		this.method7283(true);
		this.method7348(true);
		this.method7228(1);
		this.anInt8303 = 8;
	}

	@OriginalMember(owner = "client!bda", name = "n", descriptor = "(I)V")
	private void method7241() {
		if (this.aBoolean596) {
			return;
		}
		@Pc(12) float[] local12 = this.aFloatArray68;
		this.aBoolean596 = true;
		if (this.anInt8123 != 0 && this.anInt8167 != 0) {
			local12[4] = 0.0F;
			local12[2] = 0.0F;
			local12[3] = 0.0F;
			local12[13] = 1.0F;
			local12[0] = 2.0F / (float) this.anInt8123;
			local12[9] = 0.0F;
			local12[5] = -2.0F / (float) this.anInt8167;
			local12[1] = 0.0F;
			local12[15] = 1.0F;
			local12[8] = 0.0F;
			local12[12] = -1.0F;
			local12[10] = 0.5F;
			local12[7] = 0.0F;
			local12[14] = 0.5F;
			local12[11] = 0.0F;
			local12[6] = 0.0F;
			return;
		}
		local12[4] = 0.0F;
		local12[0] = 1.0F;
		local12[15] = 1.0F;
		local12[12] = 0.0F;
		local12[10] = 1.0F;
		local12[1] = 0.0F;
		local12[7] = 0.0F;
		local12[6] = 0.0F;
		local12[9] = 0.0F;
		local12[8] = 0.0F;
		local12[11] = 0.0F;
		local12[13] = 0.0F;
		local12[14] = 0.0F;
		local12[3] = 0.0F;
		local12[2] = 0.0F;
		local12[5] = 1.0F;
	}

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "(B)V")
	private void method7242() {
		this.aBoolean608 = false;
		this.method7243();
		if (this.aClass137_7 == Static297.aClass137_5) {
			this.method7354();
		}
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7188(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas14 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.method7258(this.aHashtable6.get(arg0), arg0);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!fc;[Lclient!dp;Z)Lclient!ra;")
	@Override
	public final Class36 method7193(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class70[] arg1) {
		return new Class36_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!bda", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "(I)V")
	@Override
	public final void method7201(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt8320 = arg0;
		this.aClass94_3.method2334();
	}

	@OriginalMember(owner = "client!bda", name = "o", descriptor = "(I)V")
	private void method7243() {
		if (this.aBoolean608) {
			return;
		}
		@Pc(15) float[] local15 = this.aFloatArray72;
		@Pc(27) float local27 = (float) (this.anInt8324 * -this.anInt8307) / (float) this.anInt8326;
		@Pc(42) float local42 = (float) ((this.anInt8123 - this.anInt8307) * this.anInt8324) / (float) this.anInt8326;
		@Pc(53) float local53 = (float) (this.anInt8324 * this.anInt8323) / (float) this.anInt8300;
		@Pc(67) float local67 = (float) ((this.anInt8323 - this.anInt8167) * this.anInt8324) / (float) this.anInt8300;
		if (local42 == local27 || local67 == local53) {
			local15[6] = 0.0F;
			local15[1] = 0.0F;
			local15[9] = 0.0F;
			local15[12] = 0.0F;
			local15[7] = 0.0F;
			local15[5] = 1.0F;
			local15[4] = 0.0F;
			local15[3] = 0.0F;
			local15[0] = 1.0F;
			local15[10] = 1.0F;
			local15[8] = 0.0F;
			local15[11] = 0.0F;
			local15[15] = 1.0F;
			local15[13] = 0.0F;
			local15[2] = 0.0F;
			local15[14] = 0.0F;
		} else {
			@Pc(81) float local81 = (float) this.anInt8324 * 2.0F;
			local15[3] = 0.0F;
			local15[2] = 0.0F;
			local15[9] = (local53 + local67) / (-local67 + local53);
			local15[10] = this.aFloat170 = (float) this.anInt8291 / (float) (this.anInt8324 - this.anInt8291);
			local15[12] = 0.0F;
			local15[4] = 0.0F;
			local15[13] = 0.0F;
			local15[7] = 0.0F;
			local15[8] = (local42 + local27) / (local42 - local27);
			local15[15] = 0.0F;
			local15[14] = this.aFloat165 = (float) (this.anInt8324 * this.anInt8291) / (float) (this.anInt8324 - this.anInt8291);
			local15[11] = -1.0F;
			local15[6] = 0.0F;
			local15[5] = local81 / (local53 - local67);
			local15[0] = local81 / (local42 - local27);
			local15[1] = 0.0F;
		}
		this.method7357();
		this.aBoolean608 = true;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BB)V")
	public final void method7244(@OriginalArg(0) byte arg0) {
		this.method7275(arg0 << 24 | arg0 << 16 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "(B)V")
	public final void method7245() {
		if (this.anInt8303 == 2) {
			return;
		}
		this.method7359();
		this.method7261(false);
		this.method7299(false);
		this.method7283(false);
		this.method7348(false);
		this.method7281(-2, false, false);
		this.anInt8303 = 2;
	}

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "(B)V")
	protected abstract void method7246();

	@OriginalMember(owner = "client!bda", name = "p", descriptor = "(I)V")
	protected abstract void method7247();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BLclient!bk;)V")
	public abstract void method7248(@OriginalArg(1) Class31 arg0);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!mv;)V")
	@Override
	public final void method7218(@OriginalArg(0) Class103 arg0) {
		this.aClass103_Sub1_3 = (Class103_Sub1) arg0;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)I")
	@Override
	public final int method7167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IZ)Lclient!rq;")
	public abstract Interface16 method7250(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!rq;IB)V")
	public abstract void method7251(@OriginalArg(0) Interface16 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public final void method7198(@OriginalArg(0) Class128 arg0) {
		this.aClass128_Sub3_16 = (Class128_Sub3) arg0;
		this.aClass128_Sub3_18.EA(this.aClass128_Sub3_16);
		this.aClass128_Sub3_18.method6899();
		this.aClass128_Sub3_19.method6907(this.aClass128_Sub3_18);
		this.aClass128_Sub3_17.method6907(this.aClass128_Sub3_16);
		if (this.aClass137_7.method3761()) {
			this.method7229();
		}
	}

	@OriginalMember(owner = "client!bda", name = "g", descriptor = "(B)V")
	private void method7252() {
		this.aBoolean596 = false;
		if (this.aClass137_7 == Static159.aClass137_2) {
			this.method7255();
			this.method7354();
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIII)Lclient!mv;")
	@Override
	public final Class103 method7172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class103_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bda", name = "q", descriptor = "(I)V")
	private void method7253() {
		this.aBoolean596 = false;
		if (this.aClass137_7 == Static348.aClass137_6) {
			this.method7241();
			this.method7354();
		}
	}

	@OriginalMember(owner = "client!bda", name = "E", descriptor = "(III)V")
	@Override
	public final void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8311 == arg0 && arg1 == this.anInt8289 && arg2 == this.anInt8327) {
			return;
		}
		this.anInt8289 = arg1;
		this.anInt8311 = arg0;
		this.anInt8327 = arg2;
		if (!this.aBoolean594) {
			this.method7350();
			this.method7247();
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public final Class28 method7186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static467.method7126(arg1, arg3, arg2, this, arg0);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public final Class104 method7156(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class104_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZI)V")
	public final void method7254(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean611) {
			this.aBoolean611 = arg0;
			this.method7247();
		}
	}

	@OriginalMember(owner = "client!bda", name = "g", descriptor = "(Z)V")
	private void method7255() {
		if (this.aBoolean601) {
			return;
		}
		@Pc(11) float[] local11 = this.aFloatArray68;
		@Pc(18) float local18 = (float) this.anInt8324 - this.aFloat173;
		@Pc(25) float local25 = (float) this.anInt8291 - this.aFloat173;
		@Pc(37) float local37 = this.aFloat177 * (float) -this.anInt8323 / (float) this.anInt8300;
		@Pc(49) float local49 = (float) -this.anInt8307 * this.aFloat177 / (float) this.anInt8326;
		@Pc(64) float local64 = (float) (this.anInt8123 - this.anInt8307) * this.aFloat177 / (float) this.anInt8326;
		@Pc(79) float local79 = this.aFloat177 * (float) (this.anInt8167 - this.anInt8323) / (float) this.anInt8300;
		if (local49 == local64 || local37 == local79) {
			local11[5] = 1.0F;
			local11[14] = 0.0F;
			local11[0] = 1.0F;
			local11[7] = 0.0F;
			local11[9] = 0.0F;
			local11[3] = 0.0F;
			local11[11] = 0.0F;
			local11[10] = 1.0F;
			local11[2] = 0.0F;
			local11[12] = 0.0F;
			local11[1] = 0.0F;
			local11[15] = 1.0F;
			local11[8] = 0.0F;
			local11[4] = 0.0F;
			local11[6] = 0.0F;
			local11[13] = 0.0F;
		} else {
			local11[5] = 2.0F / (local37 - local79);
			local11[4] = 0.0F;
			local11[10] = -2.0F / (local25 - local18);
			local11[15] = 1.0F;
			local11[1] = 0.0F;
			local11[9] = 0.0F;
			local11[3] = 0.0F;
			local11[13] = -(local79 + local37) / (local37 - local79);
			local11[14] = -(local18 + local25) / (local25 - local18);
			local11[0] = 2.0F / (local64 - local49);
			local11[12] = -(local64 + local49) / (local64 - local49);
			local11[11] = 0.0F;
			local11[6] = 0.0F;
			local11[2] = 0.0F;
			local11[7] = 0.0F;
			local11[8] = 0.0F;
		}
		this.method7288();
		this.aBoolean601 = true;
	}

	@OriginalMember(owner = "client!bda", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7183() {
		return this.aBoolean610;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(BI)Lclient!lj;")
	protected Class73 method7256(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class73_Sub8(this);
		} else if (arg0 == 1) {
			return new Class73_Sub3(this);
		} else if (arg0 == 2) {
			return new Class73_Sub7(this, this.aClass173_6);
		} else if (arg0 == 7) {
			return new Class73_Sub5(this);
		} else {
			return new Class73_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!bda", name = "r", descriptor = "(I)V")
	protected abstract void method7257();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method7258(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!bda", name = "s", descriptor = "(I)[F")
	public final float[] method7259() {
		return this.aFloatArray70;
	}

	@OriginalMember(owner = "client!bda", name = "h", descriptor = "(B)V")
	private void method7260() {
		if (this.aCanvas13 == null) {
			this.anInt8232 = this.anInt8121 = 1;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas13.getSize();
			this.anInt8121 = local6.height;
			this.anInt8232 = local6.width;
		}
		this.anInt8167 = this.anInt8121;
		this.anInt8123 = this.anInt8232;
		this.method7253();
		this.method7242();
		this.method7252();
		this.method7246();
		this.method7315();
		this.method7355();
		this.n();
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(IZ)V")
	public final void method7261(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean607 != arg0) {
			this.aBoolean607 = arg0;
			this.method7247();
			this.anInt8303 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "(II)Lclient!iaa;")
	public final Interface9 method7262(@OriginalArg(0) int arg0) {
		if (this.anInterface9_8.method7605() < arg0 * 2) {
			this.anInterface9_8.method7607(arg0);
		}
		return this.anInterface9_8;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;B)Lclient!jaclib/memory/Stream;")
	public final Stream method7263(@OriginalArg(0) Buffer arg0) {
		this.aStream6.a(arg0);
		return this.aStream6;
	}

	@OriginalMember(owner = "client!bda", name = "i", descriptor = "(B)V")
	public final void method7264() {
		this.method7326(2, Static57.aClass263_3);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "()Z")
	@Override
	public final boolean method7148() {
		return true;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "([Lclient!jp;I)Lclient!vr;")
	public abstract Class310 method7266(@OriginalArg(0) Class154[] arg0);

	@OriginalMember(owner = "client!bda", name = "t", descriptor = "(I)V")
	protected abstract void method7267();

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "()Z")
	@Override
	public final boolean method7151() {
		return true;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!vr;I)V")
	public abstract void method7268(@OriginalArg(0) Class310 arg0);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public final void method7212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class28 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!bda", name = "j", descriptor = "(B)V")
	protected abstract void method7269();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!raa;Lclient!raa;I)V")
	public final void method7270(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1) {
		@Pc(5) boolean local5 = false;
		if (this.aClass246Array6[this.anInt8310] != arg1) {
			this.aClass246Array6[this.anInt8310] = arg1;
			this.method7334();
			local5 = true;
		}
		if (arg0 != this.aClass246Array5[this.anInt8310]) {
			this.aClass246Array5[this.anInt8310] = arg0;
			local5 = true;
			this.method7269();
		}
		if (local5) {
			this.anInt8303 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I[IIIZ)Lclient!eea;")
	public final Interface5 method7271(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		return this.method7323(arg3, arg1, arg0, 0, arg2, 0);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public final Class7 method7187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class7_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BLclient!ft;)V")
	public final void method7272(@OriginalArg(1) Class107 arg0) {
		this.aClass107Array3[this.anInt8310] = arg0;
		this.method7234();
	}

	@OriginalMember(owner = "client!bda", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt8308 != arg0;
		if (local11 || arg1 != this.aFloat174 || this.aFloat166 != arg2) {
			this.anInt8308 = arg0;
			this.aFloat174 = arg1;
			this.aFloat166 = arg2;
			if (local11) {
				this.aFloat175 = (float) (this.anInt8308 & 0xFF0000) / 1.671168E7F;
				this.aFloat179 = (float) (this.anInt8308 & 0xFF00) / 65280.0F;
				this.aFloat172 = (float) (this.anInt8308 & 0xFF) / 255.0F;
				this.method7320();
			}
			this.aNativeInterface3.setSunColour(this.aFloat175, this.aFloat179, this.aFloat172, arg1, arg2);
			this.method7346();
		}
		if (this.aFloatArray69[0] != arg3 || this.aFloatArray69[1] != arg4 || arg5 != this.aFloatArray69[2]) {
			this.aFloatArray69[2] = arg5;
			this.aFloatArray69[1] = arg4;
			this.aFloatArray69[0] = arg3;
			this.aFloatArray73[1] = -arg4;
			this.aFloatArray73[0] = -arg3;
			this.aFloatArray73[2] = -arg5;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray66[2] = arg5 * local149;
			this.aFloatArray66[1] = local149 * arg4;
			this.aFloatArray66[0] = local149 * arg3;
			this.aFloatArray74[2] = -this.aFloatArray66[2];
			this.aFloatArray74[1] = -this.aFloatArray66[1];
			this.aFloatArray74[0] = -this.aFloatArray66[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray66[0], this.aFloatArray66[1], this.aFloatArray66[2]);
			this.method7312();
			this.anInt8302 = (int) (arg3 * 256.0F / arg4);
			this.anInt8314 = (int) (arg5 * 256.0F / arg4);
		}
		this.method7352();
	}

	@OriginalMember(owner = "client!bda", name = "h", descriptor = "(Z)V")
	protected final void method7273() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable6 != null && !this.aHashtable6.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable6.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method7233(local26));
			}
		}
		this.aHashtable6 = local9;
		this.method7333();
		this.method7332();
		this.aClass169_3.method4651(this);
	}

	@OriginalMember(owner = "client!bda", name = "u", descriptor = "(I)V")
	public final void method7274() {
		this.aClass128_Sub3_15.ha();
		this.aBoolean593 = true;
		this.method7303();
	}

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "(II)V")
	public final void method7275(@OriginalArg(1) int arg0) {
		if (this.anInt8306 != arg0) {
			this.anInt8306 = arg0;
			this.method7232();
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method7276(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!bda", name = "k", descriptor = "()Z")
	@Override
	public final boolean method7166() {
		return true;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "([Lclient!r;Lclient!ka;Lclient!m;[Lclient!cf;I)V")
	@Override
	public final void method7175(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) Class46_Sub1[] arg3, @OriginalArg(4) int arg4) {
		this.method7159(arg0, arg2, arg3, arg4);
		this.method7179(arg1);
	}

	@OriginalMember(owner = "client!bda", name = "o", descriptor = "()V")
	@Override
	public final void method7173() {
		this.aClass94_3.method2334();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILclient!bg;)V")
	public final void method7277(@OriginalArg(0) int arg0, @OriginalArg(2) Class27 arg1) {
		this.method7351(false, false, arg0, arg1);
	}

	@OriginalMember(owner = "client!bda", name = "v", descriptor = "(I)V")
	public final void method7278() {
		if (this.anInt8303 == 16) {
			return;
		}
		this.method7239();
		this.method7261(true);
		this.method7283(true);
		this.method7348(true);
		this.method7228(1);
		this.anInt8303 = 16;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)V")
	@Override
	public final void method7185(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "(II)V")
	public final void method7279(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method7270(Static428.aClass246_3, Static428.aClass246_3);
		} else if (arg0 == 0) {
			this.method7270(Static459.aClass246_5, Static459.aClass246_5);
		} else if (arg0 == 2) {
			this.method7270(Static428.aClass246_3, Static449.aClass246_4);
		} else if (arg0 == 3) {
			this.method7270(Static459.aClass246_5, Static157.aClass246_1);
		} else if (arg0 == 4) {
			this.method7270(Static409.aClass246_2, Static409.aClass246_2);
		}
	}

	@OriginalMember(owner = "client!bda", name = "n", descriptor = "()V")
	@Override
	public final void n() {
		if (this.aBoolean613) {
			this.aBoolean613 = false;
			this.method7292();
			this.method7315();
		}
		this.anInt8315 = 0;
		this.anInt8316 = this.anInt8167;
		this.anInt8301 = 0;
		this.anInt8293 = this.anInt8123;
	}

	@OriginalMember(owner = "client!bda", name = "t", descriptor = "()Z")
	@Override
	public final boolean method7195() {
		return true;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IZZB)V")
	public final void method7281(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (this.anInt8304 != arg0) {
			if (arg0 < 0) {
				this.method7290();
				this.method7316(null);
				this.method7279(0);
				if (!this.aBoolean594) {
					this.method7325(arg2, 0, 0, 0, arg1);
				}
			} else {
				@Pc(22) Interface5 local22 = this.aClass94_3.method2333(arg0);
				@Pc(28) Class296 local28 = super.anInterface13_13.method5789(arg0);
				if (local28.aByte101 == 0 && local28.aByte105 == 0) {
					this.method7290();
				} else {
					@Pc(41) int local41 = local28.aBoolean638 ? 64 : 128;
					@Pc(45) int local45 = local41 * 50;
					@Pc(49) Class128_Sub3 local49 = this.method7349();
					local49.method6903((float) (this.anInt8322 % local45 * local28.aByte105) / (float) local45, (float) (local28.aByte101 * (this.anInt8322 % local45)) / (float) local45, 0.0F);
					this.method7272(Static333.aClass107_5);
				}
				if (!this.aBoolean594) {
					this.method7325(arg2, local28.aByte104, local28.aByte100, local28.anInt8641, arg1);
				}
				if (this.aClass73_3 == null) {
					this.method7316(local22);
					this.method7279(local28.anInt8644);
				} else {
					this.aClass73_3.method7568(local28.anInt8644, local22);
				}
			}
			this.anInt8304 = arg0;
		}
		this.anInt8303 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!bda", name = "w", descriptor = "(I)V")
	private void method7282() {
		if (this.aClass137_7 == Static297.aClass137_5) {
			return;
		}
		@Pc(13) Class137 local13 = this.aClass137_7;
		this.aClass137_7 = Static297.aClass137_5;
		if (!local13.method3761()) {
			this.method7229();
		}
		this.method7243();
		this.aFloatArray71 = this.aFloatArray72;
		this.method7354();
		this.anInt8303 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!bda", name = "B", descriptor = "()Z")
	@Override
	public final boolean method7219() {
		return this.aClass73Array3[3].method7569();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!ei;IIII)Lclient!r;")
	@Override
	public final Class97 method7192(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class97_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(ZI)V")
	public final void method7283(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean595) {
			this.aBoolean595 = arg0;
			this.method7309();
			this.anInt8303 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bda", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public final Class1_Sub23 method7220(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub23_Sub2 local8 = new Class1_Sub23_Sub2(arg0);
		this.aClass295_50.method7533(local8);
		return local8;
	}

	@OriginalMember(owner = "client!bda", name = "x", descriptor = "(I)V")
	protected abstract void method7284();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(FFFIFFF)Z")
	private boolean method7285(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(14) Buffer local14 = this.anInterface16_12.method7613();
		if (local14 == null) {
			return false;
		}
		@Pc(23) Stream local23 = this.method7263(local14);
		if (Stream.a()) {
			local23.b(arg4);
			local23.b(arg2);
			local23.b(arg5);
			local23.b(arg0);
			local23.b(arg1);
			local23.b(arg3);
		} else {
			local23.a(arg4);
			local23.a(arg2);
			local23.a(arg5);
			local23.a(arg0);
			local23.a(arg1);
			local23.a(arg3);
		}
		local23.b();
		return this.anInterface16_12.method7614();
	}

	@OriginalMember(owner = "client!bda", name = "L", descriptor = "(I)V")
	@Override
	public final void L(@OriginalArg(0) int arg0) {
		this.anInt8290 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt8290++;
		}
		this.anInt8297 = 0x1 << this.anInt8290;
	}

	@OriginalMember(owner = "client!bda", name = "y", descriptor = "(I)V")
	public final void method7286() {
		if (this.anInt8303 == 4) {
			return;
		}
		this.method7359();
		this.method7261(false);
		this.method7299(false);
		this.method7283(false);
		this.method7348(false);
		this.method7281(-2, false, false);
		this.method7228(1);
		this.method7279(0);
		this.anInt8303 = 4;
	}

	@OriginalMember(owner = "client!bda", name = "z", descriptor = "(I)I")
	public final int method7287() {
		return this.anInt8310;
	}

	@OriginalMember(owner = "client!bda", name = "A", descriptor = "(I)V")
	private void method7288() {
		this.aFloat171 = (float) this.anInt8291 - this.aFloat173;
	}

	@OriginalMember(owner = "client!bda", name = "j", descriptor = "(Z)V")
	public final void method7290() {
		if (Static158.aClass107_1 != this.aClass107Array3[this.anInt8310]) {
			this.aClass107Array3[this.anInt8310] = Static158.aClass107_1;
			this.aClass128_Sub3Array3[this.anInt8310].ha();
			this.method7234();
		}
	}

	@OriginalMember(owner = "client!bda", name = "P", descriptor = "()F")
	@Override
	public final float P() {
		return this.aFloat178;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIILclient!sc;Lclient!iaa;II)V")
	public abstract void method7291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class263 arg2, @OriginalArg(4) Interface9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!bda", name = "C", descriptor = "(I)V")
	protected abstract void method7292();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILclient!g;ZLclient!vp;)Lclient!eea;")
	public abstract Interface5 method7293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class110 arg2, @OriginalArg(4) Class308 arg3);

	@OriginalMember(owner = "client!bda", name = "N", descriptor = "(IIII)V")
	@Override
	public final void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8315 = arg0 < 0 ? 0 : arg0;
		this.anInt8316 = this.anInt8123 >= arg3 ? arg3 : 0;
		this.anInt8301 = arg1 >= 0 ? arg1 : 0;
		this.anInt8293 = this.anInt8123 >= arg2 ? arg2 : 0;
		if (this.anInt8315 <= 0 && this.anInt8123 <= this.anInt8293 && this.anInt8301 <= 0 && this.anInt8316 >= this.anInt8167) {
			this.n();
			return;
		}
		if (!this.aBoolean613) {
			this.aBoolean613 = true;
			this.method7292();
		}
		this.method7356();
		this.method7315();
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(ZI)V")
	public final void method7294(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean599) {
			this.aBoolean599 = arg0;
			this.method7352();
		}
	}

	@OriginalMember(owner = "client!bda", name = "D", descriptor = "(I)V")
	private void method7295() {
		this.method7320();
		this.method7346();
		this.method7336();
		this.method7310();
		this.method7312();
		this.method7352();
		this.method7257();
		this.method7309();
		this.method7360();
		this.method7247();
		this.method7311();
		this.method7230();
		this.method7342();
		this.method7307();
		for (@Pc(73) int local73 = this.anInt8319 - 1; local73 >= 0; local73--) {
			this.method7339(local73);
			this.method7334();
			this.method7269();
			this.method7290();
		}
		this.method7232();
		this.method7246();
		this.method7284();
		this.method7319();
		this.method7300();
	}

	@OriginalMember(owner = "client!bda", name = "E", descriptor = "(I)Lclient!sg;")
	public final Class128_Sub3 method7296() {
		return this.aClass128_Sub3_18;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZIZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method7297(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap6.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!bg;IZI)V")
	protected abstract void method7298(@OriginalArg(0) Class27 arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(ZB)V")
	public final void method7299(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean606 != arg0) {
			this.aBoolean606 = arg0;
			this.method7336();
			this.anInt8303 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bda", name = "k", descriptor = "(B)V")
	protected abstract void method7300();

	@OriginalMember(owner = "client!bda", name = "u", descriptor = "()V")
	@Override
	protected void method7197() {
		if (this.aBoolean604) {
			return;
		}
		for (@Pc(13) Class1 local13 = this.aClass295_50.method7543(); local13 != null; local13 = this.aClass295_50.method7540()) {
			((Class1_Sub23_Sub2) local13).method6252();
		}
		@Pc(30) Enumeration local30 = this.aHashtable6.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method7258(this.aHashtable6.get(local36), local36);
		}
		Static133.method7848(true, false);
		this.aNativeInterface3.release();
		this.aBoolean604 = true;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!sg;)V")
	public final void method7301(@OriginalArg(1) Class128_Sub3 arg0) {
		this.aClass128_Sub3_15.EA(arg0);
		this.aBoolean593 = false;
		this.method7303();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!g;Z[FII)Lclient!eea;")
	public final Interface5 method7302(@OriginalArg(1) Class110 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method7318(arg2, arg4, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!bda", name = "h", descriptor = "()I")
	@Override
	public final int method7163() {
		return this.anInt8321 - 2;
	}

	@OriginalMember(owner = "client!bda", name = "k", descriptor = "(Z)V")
	private void method7303() {
		if (Static348.aClass137_6 == this.aClass137_7) {
			@Pc(11) float local11 = this.method7314();
			this.aClass128_Sub3_15.method6898(local11, 0.0F, local11);
		}
		this.aBoolean609 = false;
		this.method7319();
		if (this.aClass73_3 != null) {
			this.aClass73_3.method7563();
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I[Lclient!cba;)V")
	@Override
	public final void method7222(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass1_Sub5Array6[local7] = arg1[local7];
		}
		this.anInt8305 = arg0;
		if (this.aClass137_7.method3761()) {
			this.method7310();
		}
	}

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "([I)V")
	@Override
	public final void d(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt8293;
		arg0[3] = this.anInt8316;
		arg0[1] = this.anInt8301;
		arg0[0] = this.anInt8315;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BZ)V")
	public final void method7304(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean598) {
			this.aBoolean598 = arg0;
			this.method7336();
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!g;III[BZ)Lclient!aw;")
	public abstract Interface3 method7305(@OriginalArg(0) Class110 arg0, @OriginalArg(4) byte[] arg1);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!bda", name = "l", descriptor = "(B)V")
	public final void method7306() {
		this.aBoolean593 = false;
		this.method7303();
	}

	@OriginalMember(owner = "client!bda", name = "F", descriptor = "(I)V")
	protected abstract void method7307();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!vp;Lclient!g;)Z")
	public abstract boolean method7308(@OriginalArg(1) Class308 arg0, @OriginalArg(2) Class110 arg1);

	@OriginalMember(owner = "client!bda", name = "m", descriptor = "(B)V")
	protected abstract void method7309();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public final void method7210(@OriginalArg(0) Class1_Sub23 arg0) {
		this.aNativeHeap6 = ((Class1_Sub23_Sub2) arg0).aNativeHeap5;
		this.aNativeHeapBuffer6 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!bda", name = "G", descriptor = "(I)V")
	protected void method7310() {
		this.anInt8309 = this.anInt8305;
		this.anInt8305 = 0;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(IIII)V")
	@Override
	public final void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8323 = arg1;
		this.anInt8326 = arg2;
		this.anInt8300 = arg3;
		this.anInt8307 = arg0;
		this.method7252();
		this.method7242();
		this.method7355();
		this.method7315();
	}

	@OriginalMember(owner = "client!bda", name = "A", descriptor = "()Z")
	@Override
	public final boolean method7209() {
		return false;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public final Class104 method7199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class104_Sub3 local11 = new Class104_Sub3(this, arg2, arg3, arg4);
		local11.P(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "(IIIIII)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7235();
		this.method7275(arg4);
		this.method7277(0, Static319.aClass27_4);
		this.method7330(Static319.aClass27_4, 0);
		this.method7228(arg5);
		this.aClass128_Sub3_15.method6895((float) arg3, 1.0F, (float) arg2);
		this.aClass128_Sub3_15.TA(arg0, arg1, 0);
		this.method7303();
		this.method7327(false);
		this.method7264();
		this.method7327(true);
		this.method7330(Static360.aClass27_5, 0);
		this.method7277(0, Static360.aClass27_5);
	}

	@OriginalMember(owner = "client!bda", name = "l", descriptor = "(Z)V")
	protected abstract void method7311();

	@OriginalMember(owner = "client!bda", name = "I", descriptor = "(I)V")
	public abstract void method7312();

	@OriginalMember(owner = "client!bda", name = "F", descriptor = "(IIII)V")
	@Override
	public final void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < this.anInt8293) {
			this.anInt8293 = arg2;
		}
		if (arg1 > this.anInt8301) {
			this.anInt8301 = arg1;
		}
		if (arg3 < this.anInt8316) {
			this.anInt8316 = arg3;
		}
		if (this.anInt8315 < arg0) {
			this.anInt8315 = arg0;
		}
		if (this.anInt8315 <= 0 && this.anInt8123 <= this.anInt8293 && this.anInt8301 <= 0 && this.anInt8316 >= this.anInt8167) {
			this.n();
			return;
		}
		if (!this.aBoolean613) {
			this.aBoolean613 = true;
			this.method7292();
		}
		this.method7356();
		this.method7315();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	protected abstract void method7313(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!bda", name = "J", descriptor = "(I)F")
	protected abstract float method7314();

	@OriginalMember(owner = "client!bda", name = "K", descriptor = "(I)V")
	private void method7315() {
		this.aFloat181 = this.anInt8315 - this.anInt8307;
		this.aFloat167 = this.anInt8316 - this.anInt8323;
		this.bf = this.anInt8293 - this.anInt8307;
		this.aFloat168 = this.anInt8301 - this.anInt8323;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!hv;)V")
	public final void method7316(@OriginalArg(1) Interface8 arg0) {
		if (this.anInterface8Array3[this.anInt8310] == arg0) {
			return;
		}
		this.anInterface8Array3[this.anInt8310] = arg0;
		if (arg0 == null) {
			this.method7267();
		} else {
			arg0.method7756();
		}
		this.anInt8303 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!bda", name = "M", descriptor = "(I)V")
	protected abstract void method7317();

	@OriginalMember(owner = "client!bda", name = "p", descriptor = "()Z")
	@Override
	public final boolean method7180() {
		return true;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "([FIIZIILclient!g;B)Lclient!eea;")
	protected abstract Interface5 method7318(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class110 arg4);

	@OriginalMember(owner = "client!bda", name = "N", descriptor = "(I)V")
	protected abstract void method7319();

	@OriginalMember(owner = "client!bda", name = "m", descriptor = "()Z")
	@Override
	public final boolean method7171() {
		return true;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(II)I")
	@Override
	public final int method7184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!bda", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public final void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class28_Sub2 local6 = (Class28_Sub2) arg1;
		@Pc(9) Interface5 local9 = local6.anInterface5_2;
		this.method7245();
		this.method7316(local9);
		this.method7228(1);
		this.method7270(Static428.aClass246_3, Static428.aClass246_3);
		this.method7277(0, Static319.aClass27_4);
		this.method7275(arg0);
		this.aClass128_Sub3_15.method6895((float) this.anInt8167, 0.0F, (float) this.anInt8123);
		this.method7303();
		this.aClass128_Sub3Array3[0].method6895(local9.method7768((float) this.anInt8167), 1.0F, local9.method7774((float) this.anInt8123));
		this.aClass128_Sub3Array3[0].method6898(local9.method7774((float) -arg2), 0.0F, local9.method7768((float) -arg3));
		this.aClass107Array3[0] = Static333.aClass107_5;
		this.method7234();
		this.method7264();
		this.method7290();
		this.method7277(0, Static360.aClass27_5);
	}

	@OriginalMember(owner = "client!bda", name = "O", descriptor = "(I)V")
	protected abstract void method7320();

	@OriginalMember(owner = "client!bda", name = "P", descriptor = "(I)I")
	public final int method7321() {
		return this.anInt8312;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!sc;III)V")
	public abstract void method7322(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IZI[IIII)Lclient!eea;")
	public abstract Interface5 method7323(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!bda", name = "M", descriptor = "(F)V")
	@Override
	public final void M(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat176) {
			this.aFloat176 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method7320();
			this.method7352();
		}
	}

	@OriginalMember(owner = "client!bda", name = "n", descriptor = "(B)V")
	public final void method7324() {
		this.method7355();
		this.method7354();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZIIIIZ)V")
	private void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) boolean local4 = arg4 & this.method7219();
		if (!local4 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg3 = 1;
			arg2 = 0;
		}
		if (arg1 != 0 && arg0) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt8328) {
			if (this.anInt8328 != 0) {
				this.aClass73Array3[this.anInt8328 & Integer.MAX_VALUE].method7562();
			}
			if (arg1 == 0) {
				this.aClass73_3 = null;
			} else {
				this.aClass73_3 = this.aClass73Array3[Integer.MAX_VALUE & arg1];
				this.aClass73_3.method7567(arg0);
				this.aClass73_3.method7561(arg0);
				this.aClass73_3.method7566(arg2, arg3);
			}
			this.anInt8317 = arg2;
			this.anInt8296 = arg3;
			this.anInt8328 = arg1;
		} else if (this.anInt8328 != 0) {
			this.aClass73Array3[Integer.MAX_VALUE & this.anInt8328].method7561(arg0);
			if (arg2 != this.anInt8317 || this.anInt8296 != arg3) {
				this.aClass73Array3[this.anInt8328 & Integer.MAX_VALUE].method7566(arg2, arg3);
				this.anInt8317 = arg2;
				this.anInt8296 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILclient!sc;)V")
	private void method7326(@OriginalArg(1) int arg0, @OriginalArg(2) Class263 arg1) {
		this.method7268(this.aClass310_19);
		this.method7251(this.anInterface16_11, 0);
		this.method7322(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!bda", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public final boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass128_Sub3_16.method6888((float) arg2, (float) arg0, (float) arg1);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass128_Sub3_16.method6888((float) arg5, (float) arg3, (float) arg4);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt8324 > local14 && (float) this.anInt8324 > local31 || !(!((float) this.anInt8291 < local14) || !((float) this.anInt8291 < local31))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt8326 * this.aClass128_Sub3_16.method6897((float) arg2, (float) arg1, (float) arg0) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt8326 * this.aClass128_Sub3_16.method6897((float) arg5, (float) arg4, (float) arg3) / local31);
		if ((float) local81 < this.aFloat181 && (float) local99 < this.aFloat181 || this.bf < (float) local81 && (float) local99 > this.bf) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt8300 * this.aClass128_Sub3_16.method6894((float) arg1, (float) arg0, (float) arg2) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt8300 * this.aClass128_Sub3_16.method6894((float) arg4, (float) arg3, (float) arg5) / local31);
			return (!(this.aFloat168 > (float) local143) || !(this.aFloat168 > (float) local161)) && (!(this.aFloat167 < (float) local143) || !((float) local161 > this.aFloat167));
		}
	}

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "(ZI)V")
	public abstract void method7327(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bda", name = "ra", descriptor = "()F")
	@Override
	public final float ra() {
		return this.aFloat173;
	}

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "(I)V")
	@Override
	public final void method7213(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "([FB)[F")
	public final float[] method7328(@OriginalArg(0) float[] arg0) {
		arg0[8] = this.aFloatArray71[2];
		arg0[0] = this.aFloatArray71[0];
		arg0[4] = this.aFloatArray71[1];
		arg0[12] = this.aFloatArray71[3];
		arg0[13] = this.aFloatArray71[7];
		arg0[5] = this.aFloatArray71[5];
		arg0[9] = this.aFloatArray71[6];
		arg0[1] = this.aFloatArray71[4];
		arg0[2] = this.aFloatArray71[8];
		arg0[3] = this.aFloatArray71[12];
		arg0[14] = this.aFloatArray71[11];
		arg0[6] = this.aFloatArray71[9];
		arg0[10] = this.aFloatArray71[10];
		arg0[7] = this.aFloatArray71[13];
		arg0[11] = this.aFloatArray71[14];
		arg0[15] = this.aFloatArray71[15];
		return arg0;
	}

	@OriginalMember(owner = "client!bda", name = "j", descriptor = "()Lclient!m;")
	@Override
	public final Class128 method7165() {
		return this.aClass128_Sub3_21;
	}

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7152() {
		return false;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method7314();
		this.method7235();
		this.method7275(arg4);
		this.method7277(0, Static319.aClass27_4);
		this.method7330(Static319.aClass27_4, 0);
		this.method7228(arg5);
		this.aClass128_Sub3_15.method6895((float) (arg3 - 1), 1.0F, (float) (arg2 - 1));
		this.aClass128_Sub3_15.method6898((float) arg0 - local7, 0.0F, (float) arg1 - local7);
		this.method7303();
		this.method7327(false);
		this.method7326(4, Static489.aClass263_6);
		this.method7327(true);
		this.method7330(Static360.aClass27_5, 0);
		this.method7277(0, Static360.aClass27_5);
	}

	@OriginalMember(owner = "client!bda", name = "q", descriptor = "(IIII)V")
	@Override
	public final void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8292 = arg3;
		this.anInt8325 = arg0;
		this.aBoolean594 = true;
		this.anInt8312 = arg2;
		this.anInt8294 = arg1;
		this.method7325(false, 3, 0, 0, false);
		if (this.aClass73_3 != null) {
			this.aClass73_3.method7574();
		}
		this.method7350();
		this.method7247();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZI[[IZ)Lclient!lm;")
	public abstract Interface11 method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!cf;I)V")
	@Override
	public final void method7159(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) Class46_Sub1[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method6773(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!bg;II)V")
	public final void method7330(@OriginalArg(0) Class27 arg0, @OriginalArg(2) int arg1) {
		this.method7298(arg0, arg1);
	}

	@OriginalMember(owner = "client!bda", name = "Q", descriptor = "(I)Lclient!sg;")
	public final Class128_Sub3 method7331() {
		return this.aClass128_Sub3Array3[this.anInt8310];
	}

	@OriginalMember(owner = "client!bda", name = "R", descriptor = "(I)V")
	private void method7332() {
		this.anInterface16_12 = this.method7250(true);
		this.anInterface16_12.method7616(24, 12);
		this.aClass310_18 = this.method7266(new Class154[] { new Class154(Static525.aClass313_1) });
	}

	@OriginalMember(owner = "client!bda", name = "m", descriptor = "(Z)V")
	private void method7333() {
		this.anInterface16_11 = this.method7250(false);
		this.anInterface16_11.method7616(140, 28);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface16_11.method7613();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method7263(local28);
				if (Stream.a()) {
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
				if (this.anInterface16_11.method7614()) {
					break;
				}
			}
		}
		this.aClass310_19 = this.method7266(new Class154[] { new Class154(new Class313[] { Static525.aClass313_1, Static525.aClass313_5, Static525.aClass313_5 }) });
	}

	@OriginalMember(owner = "client!bda", name = "S", descriptor = "(I)V")
	protected abstract void method7334();

	@OriginalMember(owner = "client!bda", name = "s", descriptor = "()Lclient!m;")
	@Override
	public final Class128 method7189() {
		return new Class128_Sub3();
	}

	@OriginalMember(owner = "client!bda", name = "n", descriptor = "(Z)I")
	public final int method7335() {
		return this.anInt8292;
	}

	@OriginalMember(owner = "client!bda", name = "T", descriptor = "(I)V")
	protected abstract void method7336();

	@OriginalMember(owner = "client!bda", name = "o", descriptor = "(B)Lclient!sg;")
	public final Class128_Sub3 method7337() {
		return this.aClass128_Sub3_19;
	}

	@OriginalMember(owner = "client!bda", name = "p", descriptor = "(B)Lclient!sg;")
	public final Class128_Sub3 method7338() {
		return this.aClass128_Sub3_15;
	}

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "(ZI)V")
	public final void method7339(@OriginalArg(1) int arg0) {
		if (this.anInt8310 != arg0) {
			this.anInt8310 = arg0;
			this.method7317();
		}
	}

	@OriginalMember(owner = "client!bda", name = "xa", descriptor = "()V")
	@Override
	public final void xa() {
		this.aBoolean594 = false;
		this.method7325(false, 0, 0, 0, false);
		this.method7350();
		this.method7247();
	}

	@OriginalMember(owner = "client!bda", name = "U", descriptor = "(I)V")
	public final void method7340() {
		this.anInterface8Array3 = new Interface8[this.anInt8319];
		this.aClass128_Sub3Array3 = new Class128_Sub3[this.anInt8319];
		this.aClass246Array6 = new Class246[this.anInt8319];
		this.aClass107Array3 = new Class107[this.anInt8319];
		this.aClass246Array5 = new Class246[this.anInt8319];
		for (@Pc(40) int local40 = 0; local40 < this.anInt8319; local40++) {
			this.aClass246Array5[local40] = Static459.aClass246_5;
			this.aClass246Array6[local40] = Static459.aClass246_5;
			this.aClass107Array3[local40] = Static158.aClass107_1;
			this.aClass128_Sub3Array3[local40] = new Class128_Sub3();
		}
		this.aClass1_Sub5Array6 = new Class1_Sub5[this.anInt8321 - 2];
		this.anInterface8_3 = this.method7293(1, 1, Static171.aClass110_13, Static517.aClass308_15);
		this.method7210(new Class1_Sub23_Sub2(262144));
		this.aClass310_17 = this.method7266(new Class154[] { new Class154(new Class313[] { Static525.aClass313_1, Static525.aClass313_5 }) });
		this.aClass310_16 = this.method7266(new Class154[] { new Class154(new Class313[] { Static525.aClass313_1, Static525.aClass313_3 }) });
		this.aClass310_21 = this.method7266(new Class154[] { new Class154(Static525.aClass313_1), new Class154(Static525.aClass313_3), new Class154(Static525.aClass313_5), new Class154(Static525.aClass313_2) });
		this.aClass310_20 = this.method7266(new Class154[] { new Class154(Static525.aClass313_1), new Class154(Static525.aClass313_3), new Class154(Static525.aClass313_5) });
		this.aClass97_Sub2_26 = new Class97_Sub2(this, 0, 0, false, false);
		this.aClass97_Sub2_28 = new Class97_Sub2(this, 0, 0, true, true);
		this.aClass97_Sub2_25 = new Class97_Sub2(this, 0, 0, false, false);
		this.aClass97_Sub2_21 = new Class97_Sub2(this, 0, 0, true, true);
		this.aClass97_Sub2_27 = new Class97_Sub2(this, 0, 0, false, false);
		this.aClass97_Sub2_23 = new Class97_Sub2(this, 0, 0, true, true);
		this.aClass97_Sub2_30 = new Class97_Sub2(this, 0, 0, false, false);
		this.aClass97_Sub2_29 = new Class97_Sub2(this, 0, 0, true, true);
		this.aClass97_Sub2_24 = new Class97_Sub2(this, 0, 0, false, false);
		this.aClass97_Sub2_22 = new Class97_Sub2(this, 0, 0, true, true);
		this.aClass169_3 = new Class169(this);
		this.anInterface9_8 = this.method7227(true);
		this.method7273();
		this.aClass173_6 = new Class173(this);
		this.aClass73Array3[1] = this.method7256(1);
		this.aClass73Array3[2] = this.method7256(2);
		this.aClass73Array3[4] = this.method7256(4);
		this.aClass73Array3[5] = this.method7256(5);
		this.aClass73Array3[6] = this.method7256(6);
		this.aClass73Array3[7] = this.method7256(7);
		this.aClass73Array3[3] = this.method7256(3);
		this.aClass73Array3[8] = this.method7256(8);
		this.aClass73Array3[9] = this.method7256(9);
		if (!this.aClass73Array3[2].method7569()) {
			this.aClass73Array3[2] = this.method7256(0);
		}
		if (!this.aClass73Array3[4].method7569()) {
			this.aClass73Array3[4] = this.aClass73Array3[2];
		}
		if (!this.aClass73Array3[8].method7569()) {
			this.aClass73Array3[8] = this.aClass73Array3[4];
		}
		if (!this.aClass73Array3[9].method7569()) {
			this.aClass73Array3[9] = this.aClass73Array3[8];
		}
		this.method7236();
		this.n();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BF)V")
	public final void method7341(@OriginalArg(1) float arg0) {
		if (this.aFloat177 != arg0) {
			this.aFloat177 = arg0;
			this.method7252();
		}
	}

	@OriginalMember(owner = "client!bda", name = "V", descriptor = "(I)V")
	protected abstract void method7342();

	@OriginalMember(owner = "client!bda", name = "A", descriptor = "(IIIII)V")
	@Override
	protected final void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!bda", name = "W", descriptor = "(I)V")
	private void method7343() {
		this.method7268(this.aClass310_18);
		this.method7251(this.anInterface16_12, 0);
		this.method7322(Static298.aClass263_4, 1, 0);
	}

	@OriginalMember(owner = "client!bda", name = "q", descriptor = "(B)I")
	public final int method7344() {
		return this.anInt8325;
	}

	@OriginalMember(owner = "client!bda", name = "ba", descriptor = "()I")
	@Override
	public final int ba() {
		return this.anInt8329;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7160(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bda", name = "ta", descriptor = "(II)V")
	@Override
	public final void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt8324 && this.anInt8291 == arg1) {
			return;
		}
		this.anInt8291 = arg1;
		this.anInt8324 = arg0;
		this.method7242();
		this.method7252();
		this.method7350();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II[BZILclient!g;II)Lclient!eea;")
	protected abstract Interface5 method7345(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class110 arg4);

	@OriginalMember(owner = "client!bda", name = "JA", descriptor = "(IIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean594) {
			throw new RuntimeException("");
		}
		if (arg0 != this.anInt8325) {
			this.anInt8325 = arg0;
			if (this.aClass73_3 != null) {
				this.aClass73_3.method7574();
			}
		}
		this.anInt8312 = arg2;
		this.anInt8292 = arg3;
		this.anInt8294 = arg1;
		this.method7350();
	}

	@OriginalMember(owner = "client!bda", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt8287 + this.anInt8285 + this.anInt8288;
	}

	@OriginalMember(owner = "client!bda", name = "X", descriptor = "(I)V")
	protected abstract void method7346();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I[BIZLclient!g;I)Lclient!eea;")
	public final Interface5 method7347(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class110 arg3, @OriginalArg(5) int arg4) {
		return this.method7345(arg0, arg1, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIF)Lclient!cba;")
	@Override
	public final Class1_Sub5 method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub5_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(BZ)V")
	public final void method7348(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean612) {
			this.aBoolean612 = arg0;
			this.method7360();
			this.anInt8303 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7158(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas14) {
			local5 = this.anObject14;
		} else if (this.aHashtable6.containsKey(arg0)) {
			local5 = this.aHashtable6.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method7276(local5, arg0);
		if (arg0 == this.aCanvas13) {
			this.method7260();
		}
	}

	@OriginalMember(owner = "client!bda", name = "la", descriptor = "(FF)V")
	@Override
	public final void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat178 == arg0 && arg1 == this.aFloat173) {
			return;
		}
		this.aFloat178 = arg0;
		this.aFloat173 = arg1;
		this.method7288();
		this.method7357();
		this.method7252();
		this.method7242();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
	@Override
	public void method7177(@OriginalArg(0) int arg0) {
		this.aClass94_3.method2337();
		this.anInt8322 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt8324;
	}

	@OriginalMember(owner = "client!bda", name = "r", descriptor = "(B)Lclient!sg;")
	public final Class128_Sub3 method7349() {
		return this.aClass128_Sub3Array3[this.anInt8310];
	}

	@OriginalMember(owner = "client!bda", name = "s", descriptor = "(B)V")
	private void method7350() {
		if (this.aClass73_3 != null) {
			this.aClass73_3.method7565();
		}
		this.method7311();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZZIILclient!bg;)V")
	public abstract void method7351(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class27 arg3);

	@OriginalMember(owner = "client!bda", name = "t", descriptor = "(B)V")
	protected abstract void method7352();

	@OriginalMember(owner = "client!bda", name = "Y", descriptor = "(I)Lclient!lm;")
	public final Interface11 method7353() {
		return this.aClass103_Sub1_3 == null ? null : this.aClass103_Sub1_3.method5799();
	}

	@OriginalMember(owner = "client!bda", name = "ab", descriptor = "(I)V")
	private void method7354() {
		this.method7284();
		if (this.aClass73_3 != null) {
			this.aClass73_3.method7571();
		}
	}

	@OriginalMember(owner = "client!bda", name = "bb", descriptor = "(I)V")
	public final void method7355() {
		if (Static221.aClass137_4 == this.aClass137_7) {
			return;
		}
		@Pc(10) Class137 local10 = this.aClass137_7;
		this.aClass137_7 = Static221.aClass137_4;
		if (local10.method3761()) {
			this.method7229();
		}
		this.anInt8303 &= 0xFFFFFFE0;
		this.aFloatArray71 = this.aFloatArray70;
	}

	@OriginalMember(owner = "client!bda", name = "cb", descriptor = "(I)V")
	protected abstract void method7356();

	@OriginalMember(owner = "client!bda", name = "db", descriptor = "(I)V")
	private void method7357() {
		if (this.aFloat173 == 0.0F) {
			this.aFloatArray72[14] = this.aFloat165;
			this.aFloatArray72[10] = this.aFloat170;
		} else {
			@Pc(37) float local37 = this.aFloat178 / (this.aFloat178 + this.aFloat173);
			@Pc(41) float local41 = local37 * local37;
			@Pc(57) float local57 = (1.0F - local37) * -this.aFloat165 * (1.0F - local37) / this.aFloat173;
			this.aFloatArray72[10] = local57 + this.aFloat170;
			this.aFloatArray72[14] = this.aFloat165 * local41;
		}
		this.aFloat180 = ((float) -this.anInt8291 + this.aFloatArray72[14]) / this.aFloatArray72[10];
	}

	@OriginalMember(owner = "client!bda", name = "eb", descriptor = "(I)V")
	private void method7359() {
		if (this.aClass137_7 == Static348.aClass137_6) {
			return;
		}
		@Pc(6) Class137 local6 = this.aClass137_7;
		this.aClass137_7 = Static348.aClass137_6;
		if (local6.method3761()) {
			this.method7229();
		}
		this.method7241();
		this.aFloatArray71 = this.aFloatArray68;
		this.method7354();
		this.anInt8303 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!bda", name = "u", descriptor = "(B)V")
	protected abstract void method7360();
}
