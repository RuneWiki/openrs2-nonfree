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

@OriginalClass("client!wk")
public abstract class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!wk", name = "J", descriptor = "Lclient!lo;")
	protected Class224 aClass224_5;

	@OriginalMember(owner = "client!wk", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!wk", name = "gc", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable27;

	@OriginalMember(owner = "client!wk", name = "wc", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!wk", name = "Jd", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!wk", name = "Md", descriptor = "I")
	public int anInt7363;

	@OriginalMember(owner = "client!wk", name = "Td", descriptor = "I")
	public int anInt7368;

	@OriginalMember(owner = "client!wk", name = "Vd", descriptor = "I")
	protected int anInt7370;

	@OriginalMember(owner = "client!wk", name = "ge", descriptor = "[Lclient!ada;")
	protected Class6[] aClass6Array5;

	@OriginalMember(owner = "client!wk", name = "he", descriptor = "Z")
	protected boolean aBoolean516;

	@OriginalMember(owner = "client!wk", name = "je", descriptor = "Z")
	protected boolean aBoolean518;

	@OriginalMember(owner = "client!wk", name = "ne", descriptor = "I")
	private int anInt7377;

	@OriginalMember(owner = "client!wk", name = "se", descriptor = "I")
	public int anInt7380;

	@OriginalMember(owner = "client!wk", name = "te", descriptor = "F")
	private float aFloat128;

	@OriginalMember(owner = "client!wk", name = "De", descriptor = "I")
	public int anInt7387;

	@OriginalMember(owner = "client!wk", name = "Ee", descriptor = "I")
	private int anInt7388;

	@OriginalMember(owner = "client!wk", name = "Ge", descriptor = "Z")
	public boolean aBoolean523;

	@OriginalMember(owner = "client!wk", name = "He", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!wk", name = "Me", descriptor = "I")
	protected int anInt7391;

	@OriginalMember(owner = "client!wk", name = "Pe", descriptor = "[Lclient!pd;")
	protected Class270[] aClass270Array3;

	@OriginalMember(owner = "client!wk", name = "Qe", descriptor = "[Lclient!pr;")
	protected Class56_Sub2[] aClass56_Sub2Array3;

	@OriginalMember(owner = "client!wk", name = "Te", descriptor = "Lclient!ku;")
	private Class11_Sub2 aClass11_Sub2_3;

	@OriginalMember(owner = "client!wk", name = "Ze", descriptor = "Lclient!ii;")
	private Class166 aClass166_3;

	@OriginalMember(owner = "client!wk", name = "cf", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!wk", name = "ff", descriptor = "Lclient!bea;")
	private Class14 aClass14_3;

	@OriginalMember(owner = "client!wk", name = "kf", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!wk", name = "lf", descriptor = "Z")
	public boolean aBoolean530;

	@OriginalMember(owner = "client!wk", name = "nf", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!wk", name = "rf", descriptor = "I")
	protected int anInt7402;

	@OriginalMember(owner = "client!wk", name = "vf", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!wk", name = "yf", descriptor = "I")
	public int anInt7405;

	@OriginalMember(owner = "client!wk", name = "zf", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!wk", name = "Bf", descriptor = "Lclient!dr;")
	public Interface4 anInterface4_3;

	@OriginalMember(owner = "client!wk", name = "Hf", descriptor = "F")
	private float aFloat140;

	@OriginalMember(owner = "client!wk", name = "Kf", descriptor = "I")
	public int anInt7410;

	@OriginalMember(owner = "client!wk", name = "Lf", descriptor = "Z")
	public boolean aBoolean534;

	@OriginalMember(owner = "client!wk", name = "Qf", descriptor = "[Lclient!jw;")
	protected Class5_Sub3[] aClass5_Sub3Array4;

	@OriginalMember(owner = "client!wk", name = "Tf", descriptor = "[Lclient!dr;")
	private Interface4[] anInterface4Array3;

	@OriginalMember(owner = "client!wk", name = "Yf", descriptor = "I")
	protected int anInt7414;

	@OriginalMember(owner = "client!wk", name = "ag", descriptor = "I")
	protected int anInt7415;

	@OriginalMember(owner = "client!wk", name = "bg", descriptor = "[Lclient!ada;")
	protected Class6[] aClass6Array6;

	@OriginalMember(owner = "client!wk", name = "eg", descriptor = "Lclient!bw;")
	public Class48 aClass48_17;

	@OriginalMember(owner = "client!wk", name = "fg", descriptor = "Lclient!bw;")
	public Class48 aClass48_18;

	@OriginalMember(owner = "client!wk", name = "gg", descriptor = "Lclient!bw;")
	private Class48 aClass48_19;

	@OriginalMember(owner = "client!wk", name = "hg", descriptor = "Lclient!ff;")
	public Class114_Sub1 aClass114_Sub1_21;

	@OriginalMember(owner = "client!wk", name = "ig", descriptor = "Lclient!ff;")
	public Class114_Sub1 aClass114_Sub1_22;

	@OriginalMember(owner = "client!wk", name = "jg", descriptor = "Lclient!fka;")
	private Interface6 anInterface6_15;

	@OriginalMember(owner = "client!wk", name = "kg", descriptor = "Lclient!ff;")
	public Class114_Sub1 aClass114_Sub1_23;

	@OriginalMember(owner = "client!wk", name = "lg", descriptor = "Lclient!ff;")
	public Class114_Sub1 aClass114_Sub1_24;

	@OriginalMember(owner = "client!wk", name = "mg", descriptor = "Lclient!bw;")
	private Class48 aClass48_20;

	@OriginalMember(owner = "client!wk", name = "ng", descriptor = "Lclient!ff;")
	public Class114_Sub1 aClass114_Sub1_25;

	@OriginalMember(owner = "client!wk", name = "og", descriptor = "Lclient!ff;")
	public Class114_Sub1 aClass114_Sub1_26;

	@OriginalMember(owner = "client!wk", name = "pg", descriptor = "Lclient!fka;")
	private Interface6 anInterface6_16;

	@OriginalMember(owner = "client!wk", name = "qg", descriptor = "Lclient!ff;")
	public Class114_Sub1 aClass114_Sub1_27;

	@OriginalMember(owner = "client!wk", name = "sg", descriptor = "Lclient!ff;")
	public Class114_Sub1 aClass114_Sub1_28;

	@OriginalMember(owner = "client!wk", name = "tg", descriptor = "Lclient!fka;")
	private Interface6 anInterface6_17;

	@OriginalMember(owner = "client!wk", name = "ug", descriptor = "Lclient!bw;")
	public Class48 aClass48_21;

	@OriginalMember(owner = "client!wk", name = "vg", descriptor = "Lclient!bw;")
	private Class48 aClass48_22;

	@OriginalMember(owner = "client!wk", name = "wg", descriptor = "Lclient!ff;")
	public Class114_Sub1 aClass114_Sub1_29;

	@OriginalMember(owner = "client!wk", name = "xg", descriptor = "Lclient!mq;")
	private Interface16 anInterface16_6;

	@OriginalMember(owner = "client!wk", name = "yg", descriptor = "Lclient!bw;")
	public Class48 aClass48_23;

	@OriginalMember(owner = "client!wk", name = "zg", descriptor = "Lclient!ff;")
	public Class114_Sub1 aClass114_Sub1_30;

	@OriginalMember(owner = "client!wk", name = "Ag", descriptor = "Z")
	protected boolean aBoolean536;

	@OriginalMember(owner = "client!wk", name = "Bg", descriptor = "I")
	private int anInt7416;

	@OriginalMember(owner = "client!wk", name = "K", descriptor = "Lclient!ga;")
	private final Class124 aClass124_73 = new Class124();

	@OriginalMember(owner = "client!wk", name = "Od", descriptor = "Z")
	protected boolean aBoolean515 = true;

	@OriginalMember(owner = "client!wk", name = "Nd", descriptor = "Lclient!pr;")
	protected final Class56_Sub2 aClass56_Sub2_15 = new Class56_Sub2();

	@OriginalMember(owner = "client!wk", name = "be", descriptor = "Lclient!pr;")
	public Class56_Sub2 aClass56_Sub2_16 = new Class56_Sub2();

	@OriginalMember(owner = "client!wk", name = "ce", descriptor = "Lclient!pr;")
	public final Class56_Sub2 aClass56_Sub2_17 = new Class56_Sub2();

	@OriginalMember(owner = "client!wk", name = "de", descriptor = "Lclient!pr;")
	protected final Class56_Sub2 aClass56_Sub2_18 = new Class56_Sub2();

	@OriginalMember(owner = "client!wk", name = "ee", descriptor = "Lclient!pr;")
	private final Class56_Sub2 aClass56_Sub2_19 = new Class56_Sub2();

	@OriginalMember(owner = "client!wk", name = "fe", descriptor = "Lclient!pr;")
	private final Class56_Sub2 aClass56_Sub2_20 = new Class56_Sub2();

	@OriginalMember(owner = "client!wk", name = "pe", descriptor = "I")
	public int anInt7378 = 128;

	@OriginalMember(owner = "client!wk", name = "oe", descriptor = "[F")
	private final float[] aFloatArray52 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wk", name = "re", descriptor = "I")
	private int anInt7379 = 1;

	@OriginalMember(owner = "client!wk", name = "Fe", descriptor = "Lclient!rm;")
	protected Class310 aClass310_7 = Static205.aClass310_4;

	@OriginalMember(owner = "client!wk", name = "ve", descriptor = "I")
	protected int anInt7381 = 0;

	@OriginalMember(owner = "client!wk", name = "Ce", descriptor = "I")
	private int anInt7386 = -1;

	@OriginalMember(owner = "client!wk", name = "Se", descriptor = "I")
	protected int anInt7393 = 0;

	@OriginalMember(owner = "client!wk", name = "Be", descriptor = "I")
	protected int anInt7385 = 3584;

	@OriginalMember(owner = "client!wk", name = "ie", descriptor = "Z")
	protected boolean aBoolean517 = true;

	@OriginalMember(owner = "client!wk", name = "Ae", descriptor = "Z")
	protected boolean aBoolean522 = true;

	@OriginalMember(owner = "client!wk", name = "Ie", descriptor = "I")
	public int anInt7389 = 512;

	@OriginalMember(owner = "client!wk", name = "Ye", descriptor = "[F")
	public final float[] aFloatArray55 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wk", name = "gf", descriptor = "I")
	public int anInt7399 = -1;

	@OriginalMember(owner = "client!wk", name = "jf", descriptor = "Z")
	private boolean aBoolean529 = false;

	@OriginalMember(owner = "client!wk", name = "Re", descriptor = "Z")
	protected boolean aBoolean526 = true;

	@OriginalMember(owner = "client!wk", name = "ze", descriptor = "I")
	private int anInt7384 = 0;

	@OriginalMember(owner = "client!wk", name = "We", descriptor = "Z")
	protected boolean aBoolean528 = false;

	@OriginalMember(owner = "client!wk", name = "Ke", descriptor = "[F")
	private final float[] aFloatArray54 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!wk", name = "pf", descriptor = "F")
	public float aFloat135 = -1.0F;

	@OriginalMember(owner = "client!wk", name = "sf", descriptor = "F")
	public float aFloat136 = 1.0F;

	@OriginalMember(owner = "client!wk", name = "hf", descriptor = "F")
	private float aFloat132 = 1.0F;

	@OriginalMember(owner = "client!wk", name = "Le", descriptor = "Z")
	protected boolean aBoolean524 = false;

	@OriginalMember(owner = "client!wk", name = "Oe", descriptor = "I")
	public int anInt7392 = 3;

	@OriginalMember(owner = "client!wk", name = "bf", descriptor = "F")
	public float bf = 3584.0F;

	@OriginalMember(owner = "client!wk", name = "we", descriptor = "F")
	public float aFloat129 = 1.0F;

	@OriginalMember(owner = "client!wk", name = "ue", descriptor = "[F")
	private final float[] aFloatArray53 = new float[16];

	@OriginalMember(owner = "client!wk", name = "Ve", descriptor = "Z")
	private boolean aBoolean527 = false;

	@OriginalMember(owner = "client!wk", name = "ef", descriptor = "I")
	private int anInt7398 = 0;

	@OriginalMember(owner = "client!wk", name = "tf", descriptor = "I")
	public int anInt7403 = 512;

	@OriginalMember(owner = "client!wk", name = "Ue", descriptor = "I")
	private int anInt7394 = -1;

	@OriginalMember(owner = "client!wk", name = "af", descriptor = "I")
	private int anInt7396 = 0;

	@OriginalMember(owner = "client!wk", name = "df", descriptor = "I")
	private int anInt7397 = -1;

	@OriginalMember(owner = "client!wk", name = "Ef", descriptor = "Z")
	private boolean aBoolean533 = false;

	@OriginalMember(owner = "client!wk", name = "uf", descriptor = "F")
	public float aFloat137 = 3584.0F;

	@OriginalMember(owner = "client!wk", name = "Gf", descriptor = "I")
	public int anInt7408 = 0;

	@OriginalMember(owner = "client!wk", name = "Pf", descriptor = "[F")
	private final float[] aFloatArray58 = new float[16];

	@OriginalMember(owner = "client!wk", name = "Cf", descriptor = "I")
	public int anInt7407 = -1;

	@OriginalMember(owner = "client!wk", name = "Df", descriptor = "Z")
	private boolean aBoolean532 = false;

	@OriginalMember(owner = "client!wk", name = "Xe", descriptor = "I")
	protected int anInt7395 = 0;

	@OriginalMember(owner = "client!wk", name = "xf", descriptor = "Z")
	protected boolean aBoolean531 = false;

	@OriginalMember(owner = "client!wk", name = "ye", descriptor = "I")
	protected final int anInt7383 = 0;

	@OriginalMember(owner = "client!wk", name = "xe", descriptor = "I")
	private int anInt7382 = 0;

	@OriginalMember(owner = "client!wk", name = "Sf", descriptor = "F")
	public float aFloat142 = -1.0F;

	@OriginalMember(owner = "client!wk", name = "Mf", descriptor = "I")
	public int anInt7411 = 0;

	@OriginalMember(owner = "client!wk", name = "Vf", descriptor = "I")
	public int anInt7413 = 50;

	@OriginalMember(owner = "client!wk", name = "Af", descriptor = "I")
	protected int anInt7406 = 0;

	@OriginalMember(owner = "client!wk", name = "Rf", descriptor = "[F")
	private final float[] aFloatArray59 = new float[16];

	@OriginalMember(owner = "client!wk", name = "ke", descriptor = "Z")
	private boolean aBoolean519 = false;

	@OriginalMember(owner = "client!wk", name = "Ne", descriptor = "Z")
	protected boolean aBoolean525 = false;

	@OriginalMember(owner = "client!wk", name = "Jf", descriptor = "[F")
	protected float[] aFloatArray57 = this.aFloatArray54;

	@OriginalMember(owner = "client!wk", name = "Uf", descriptor = "I")
	protected int anInt7412 = 0;

	@OriginalMember(owner = "client!wk", name = "le", descriptor = "Z")
	protected boolean aBoolean520 = true;

	@OriginalMember(owner = "client!wk", name = "mf", descriptor = "I")
	public int anInt7400 = 8;

	@OriginalMember(owner = "client!wk", name = "qf", descriptor = "[F")
	public final float[] aFloatArray56 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!wk", name = "Wf", descriptor = "F")
	public float aFloat143 = 1.0F;

	@OriginalMember(owner = "client!wk", name = "Nf", descriptor = "F")
	public float aFloat141 = 1.0F;

	@OriginalMember(owner = "client!wk", name = "Of", descriptor = "Lclient!be;")
	protected Class31 aClass31_8 = Static414.aClass31_7;

	@OriginalMember(owner = "client!wk", name = "wf", descriptor = "I")
	protected final int anInt7404 = 0;

	@OriginalMember(owner = "client!wk", name = "of", descriptor = "I")
	private int anInt7401 = 16777215;

	@OriginalMember(owner = "client!wk", name = "Xf", descriptor = "[F")
	private final float[] aFloatArray60 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wk", name = "Zf", descriptor = "Z")
	protected boolean aBoolean535 = true;

	@OriginalMember(owner = "client!wk", name = "qe", descriptor = "Z")
	private boolean aBoolean521 = false;

	@OriginalMember(owner = "client!wk", name = "Je", descriptor = "I")
	public int anInt7390 = 0;

	@OriginalMember(owner = "client!wk", name = "Ff", descriptor = "[Lclient!bea;")
	private final Class14[] aClass14Array3 = new Class14[10];

	@OriginalMember(owner = "client!wk", name = "dg", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!wk", name = "rg", descriptor = "Lclient!pr;")
	private final Class56_Sub2 aClass56_Sub2_21 = new Class56_Sub2();

	@OriginalMember(owner = "client!wk", name = "nb", descriptor = "Ljava/lang/Object;")
	protected final Object anObject14;

	@OriginalMember(owner = "client!wk", name = "A", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!wk", name = "uc", descriptor = "Lclient!cb;")
	protected final Class50 aClass50_120;

	@OriginalMember(owner = "client!wk", name = "V", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas10;

	@OriginalMember(owner = "client!wk", name = "Xb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!wk", name = "If", descriptor = "I")
	protected final int anInt7409;

	@OriginalMember(owner = "client!wk", name = "Id", descriptor = "I")
	private int anInt7360;

	@OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
	public int anInt7221;

	@OriginalMember(owner = "client!wk", name = "Wb", descriptor = "I")
	private int anInt7276;

	@OriginalMember(owner = "client!wk", name = "Db", descriptor = "I")
	public int anInt7257;

	@OriginalMember(owner = "client!wk", name = "me", descriptor = "I")
	public final int anInt7376;

	@OriginalMember(owner = "client!wk", name = "cg", descriptor = "Lclient!lr;")
	private final Class226 aClass226_3;

	@OriginalMember(owner = "client!wk", name = "tc", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!cb;II)V")
	protected Class143_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) Class50 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anObject13 = this.anObject14 = arg1;
			this.aClass50_120 = arg3;
			this.aCanvas11 = this.aCanvas10 = arg0;
			this.anInt7409 = arg4;
			@Pc(305) Dimension local305 = arg0.getSize();
			this.anInt7221 = this.anInt7360 = local305.width;
			this.anInt7257 = this.anInt7276 = local305.height;
			this.anInt7376 = arg5;
			Static168.method2468(false, true);
			if (super.anInterface3_11 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt7376);
				this.aClass226_3 = null;
			} else {
				this.aClass226_3 = new Class226(this, super.anInterface3_11);
				this.aNativeInterface3 = new NativeInterface(super.anInterface3_11.method8502(), this.anInt7376);
				for (@Pc(350) int local350 = 0; local350 < super.anInterface3_11.method8502(); local350++) {
					@Pc(357) Class331 local357 = super.anInterface3_11.method8501(local350);
					if (local357 != null) {
						this.aNativeInterface3.initTextureMetrics(local350, local357.aByte118, local357.aByte115);
					}
				}
			}
		} catch (@Pc(392) Throwable local392) {
			local392.printStackTrace();
			this.method6225();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(Z)V")
	protected final void method6271() {
		@Pc(9) Enumeration local9 = this.aHashtable27.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method6366(this.aHashtable27.get(local15), local15);
		}
		this.anInterface6_15.method7866();
		this.anInterface6_17.method7866();
		this.anInterface6_16.method7866();
		this.aClass114_Sub1_22.method2357();
		this.aClass114_Sub1_28.method2357();
		this.aClass114_Sub1_27.method2357();
		this.aClass114_Sub1_25.method2357();
		this.aClass114_Sub1_26.method2357();
		this.aClass166_3.method3516();
		this.anInterface16_6.method7866();
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)Lclient!pr;")
	public final Class56_Sub2 method6272() {
		return this.aClass56_Sub2_19;
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
	protected abstract void method6273();

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method6216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		if (local10 == 0.0F && local17 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(42) float local42 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
			local17 *= local42;
			local10 *= local42;
		}
		if (!this.method6345((float) arg1, 0.0F, (float) arg2 + local10, (float) arg0, local17 + (float) arg3, 0.0F)) {
			return;
		}
		this.method6341();
		this.method6293(arg4);
		this.method6290(Static85.aClass90_1, 0);
		this.method6391(0, Static85.aClass90_1);
		this.method6321(arg5);
		this.method6313();
		this.method6323(false);
		this.method6395();
		this.method6323(true);
		this.method6391(0, Static663.aClass90_4);
		this.method6290(Static663.aClass90_4, 0);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BIZIZI)V")
	private void method6274(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) boolean local8 = arg1 & this.method6208();
		if (!local8 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			arg0 = 2;
			arg2 = 1;
			arg4 = 0;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt7396) {
			if (this.anInt7396 != 0) {
				this.aClass14Array3[this.anInt7396 & Integer.MAX_VALUE].method8619();
			}
			if (arg0 == 0) {
				this.aClass14_3 = null;
			} else {
				this.aClass14_3 = this.aClass14Array3[arg0 & Integer.MAX_VALUE];
				this.aClass14_3.method8625(arg3);
				this.aClass14_3.method8617(arg3);
				this.aClass14_3.method8615(arg2, arg4);
			}
			this.anInt7382 = arg2;
			this.anInt7384 = arg4;
			this.anInt7396 = arg0;
		} else if (this.anInt7396 != 0) {
			this.aClass14Array3[this.anInt7396 & Integer.MAX_VALUE].method8617(arg3);
			if (this.anInt7384 != arg4 || this.anInt7382 != arg2) {
				this.aClass14Array3[this.anInt7396 & Integer.MAX_VALUE].method8615(arg2, arg4);
				this.anInt7382 = arg2;
				this.anInt7384 = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method6199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZI[IIII)Lclient!kt;")
	public abstract Interface12 method6275(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "(I)V")
	private void method6276() {
		this.aBoolean532 = false;
		this.method6328();
		if (Static62.aClass310_1 == this.aClass310_7) {
			this.method6377();
		}
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(Z)Lclient!pr;")
	public final Class56_Sub2 method6277() {
		return this.aClass56_Sub2Array3[this.anInt7412];
	}

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "(I)V")
	private void method6278() {
		this.aBoolean519 = false;
		this.method6310();
		if (this.aClass310_7 == Static138.aClass310_2) {
			this.method6377();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZB)Lclient!mq;")
	public abstract Interface16 method6279(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "(I)Lclient!bv;")
	public final Interface1 method6280() {
		return this.aClass11_Sub2_3 == null ? null : this.aClass11_Sub2_3.method8638();
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(B)Lclient!pr;")
	public final Class56_Sub2 method6281() {
		return this.aClass56_Sub2_18;
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(Z)V")
	public final void method6282() {
		if (this.aClass270Array3[this.anInt7412] != Static76.aClass270_2) {
			this.aClass270Array3[this.anInt7412] = Static76.aClass270_2;
			this.aClass56_Sub2Array3[this.anInt7412].method8400();
			this.method6336();
		}
	}

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "(I)V")
	protected abstract void method6283();

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "(I)V")
	private void method6284() {
		if (Static142.aClass310_3 == this.aClass310_7) {
			return;
		}
		@Pc(6) Class310 local6 = this.aClass310_7;
		this.aClass310_7 = Static142.aClass310_3;
		if (local6.method7319()) {
			this.method6401();
		}
		this.method6331();
		this.aFloatArray57 = this.aFloatArray58;
		this.method6377();
		this.anInt7377 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!wk", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6341();
		this.method6293(arg3);
		this.method6290(Static85.aClass90_1, 0);
		this.method6391(0, Static85.aClass90_1);
		this.method6321(arg4);
		this.aClass56_Sub2_15.method6820(1.0F, (float) arg2, (float) arg2);
		this.aClass56_Sub2_15.method8390(arg0, arg1, 0);
		this.method6356();
		this.method6323(false);
		this.method6325(0, this.anInterface6_16);
		this.method6333(this.aClass48_22);
		this.method6381(Static672.aClass323_6, 256, 0);
		this.method6323(true);
		this.method6391(0, Static663.aClass90_4);
		this.method6290(Static663.aClass90_4, 0);
	}

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "(Z)V")
	protected abstract void method6285();

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "(I)V")
	protected abstract void method6286();

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg2 * this.aClass56_Sub2_16.aFloat155 + (float) arg0 * this.aClass56_Sub2_16.aFloat150 + (float) arg1 * this.aClass56_Sub2_16.aFloat154 + this.aClass56_Sub2_16.aFloat153;
		@Pc(57) float local57 = this.aClass56_Sub2_16.aFloat155 * (float) arg5 + (float) arg3 * this.aClass56_Sub2_16.aFloat150 + this.aClass56_Sub2_16.aFloat154 * (float) arg4 + this.aClass56_Sub2_16.aFloat153;
		if (local32 < (float) this.anInt7413 && local57 < (float) this.anInt7413) {
			local7 |= 0x10;
		} else if ((float) this.anInt7385 < local32 && (float) this.anInt7385 < local57) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass56_Sub2_16.aFloat159 + (float) arg2 * this.aClass56_Sub2_16.aFloat151 + this.aClass56_Sub2_16.aFloat158 * (float) arg1 + this.aClass56_Sub2_16.aFloat148 * (float) arg0) * (float) this.anInt7403 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt7403 * (this.aClass56_Sub2_16.aFloat159 + this.aClass56_Sub2_16.aFloat151 * (float) arg5 + this.aClass56_Sub2_16.aFloat148 * (float) arg3 + (float) arg4 * this.aClass56_Sub2_16.aFloat158) / (float) arg6);
		if ((float) local124 < this.aFloat139 && this.aFloat139 > (float) local157) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat138 && (float) local157 > this.aFloat138) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt7389 * (this.aClass56_Sub2_16.aFloat152 + (float) arg2 * this.aClass56_Sub2_16.aFloat157 + this.aClass56_Sub2_16.aFloat149 * (float) arg1 + (float) arg0 * this.aClass56_Sub2_16.aFloat156) / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass56_Sub2_16.aFloat157 * (float) arg5 + (float) arg3 * this.aClass56_Sub2_16.aFloat156 + (float) arg4 * this.aClass56_Sub2_16.aFloat149 + this.aClass56_Sub2_16.aFloat152) * (float) this.anInt7389 / (float) arg6);
		if (this.aFloat131 > (float) local224 && (float) local257 < this.aFloat131) {
			local7 |= 0x4;
		} else if (this.aFloat133 < (float) local224 && (float) local257 > this.aFloat133) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "(I)V")
	public final void method6287() {
		this.aClass6Array6 = new Class6[this.anInt7405];
		this.aClass56_Sub2Array3 = new Class56_Sub2[this.anInt7405];
		this.anInterface4Array3 = new Interface4[this.anInt7405];
		this.aClass6Array5 = new Class6[this.anInt7405];
		this.aClass270Array3 = new Class270[this.anInt7405];
		for (@Pc(30) int local30 = 0; local30 < this.anInt7405; local30++) {
			this.aClass6Array6[local30] = Static600.aClass6_4;
			this.aClass6Array5[local30] = Static600.aClass6_4;
			this.aClass270Array3[local30] = Static76.aClass270_2;
			this.aClass56_Sub2Array3[local30] = new Class56_Sub2();
		}
		this.aClass5_Sub3Array4 = new Class5_Sub3[this.anInt7391 - 2];
		this.anInterface4_3 = this.method6360(Static92.aClass255_3, Static314.aClass206_12, 1, 1);
		this.method6217(new Class5_Sub26_Sub1(262144));
		this.aClass48_17 = this.method6320(new Class284[] { new Class284(new Class137[] { Static199.aClass137_1, Static199.aClass137_5 }) });
		this.aClass48_18 = this.method6320(new Class284[] { new Class284(new Class137[] { Static199.aClass137_1, Static199.aClass137_3 }) });
		this.aClass48_21 = this.method6320(new Class284[] { new Class284(Static199.aClass137_1), new Class284(Static199.aClass137_3), new Class284(Static199.aClass137_5), new Class284(Static199.aClass137_2) });
		this.aClass48_23 = this.method6320(new Class284[] { new Class284(Static199.aClass137_1), new Class284(Static199.aClass137_3), new Class284(Static199.aClass137_5) });
		this.aClass114_Sub1_30 = new Class114_Sub1(this, 0, 0, false, false);
		this.aClass114_Sub1_22 = new Class114_Sub1(this, 0, 0, true, true);
		this.aClass114_Sub1_23 = new Class114_Sub1(this, 0, 0, false, false);
		this.aClass114_Sub1_28 = new Class114_Sub1(this, 0, 0, true, true);
		this.aClass114_Sub1_24 = new Class114_Sub1(this, 0, 0, false, false);
		this.aClass114_Sub1_27 = new Class114_Sub1(this, 0, 0, true, true);
		this.aClass114_Sub1_21 = new Class114_Sub1(this, 0, 0, false, false);
		this.aClass114_Sub1_25 = new Class114_Sub1(this, 0, 0, true, true);
		this.aClass114_Sub1_29 = new Class114_Sub1(this, 0, 0, false, false);
		this.aClass114_Sub1_26 = new Class114_Sub1(this, 0, 0, true, true);
		this.aClass166_3 = new Class166(this);
		this.anInterface16_6 = this.method6279(true);
		this.method6308();
		this.aClass224_5 = new Class224(this);
		this.aClass14Array3[1] = this.method6289(1);
		this.aClass14Array3[2] = this.method6289(2);
		this.aClass14Array3[4] = this.method6289(4);
		this.aClass14Array3[5] = this.method6289(5);
		this.aClass14Array3[6] = this.method6289(6);
		this.aClass14Array3[7] = this.method6289(7);
		this.aClass14Array3[3] = this.method6289(3);
		this.aClass14Array3[8] = this.method6289(8);
		this.aClass14Array3[9] = this.method6289(9);
		if (!this.aClass14Array3[2].method8624()) {
			this.aClass14Array3[2] = this.method6289(0);
		}
		if (!this.aClass14Array3[4].method8624()) {
			this.aClass14Array3[4] = this.aClass14Array3[2];
		}
		if (!this.aClass14Array3[8].method8624()) {
			this.aClass14Array3[8] = this.aClass14Array3[4];
		}
		if (!this.aClass14Array3[9].method8624()) {
			this.aClass14Array3[9] = this.aClass14Array3[8];
		}
		this.method6346();
		this.la();
		this.method6221();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V")
	public final void method6288(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean531 != arg0) {
			this.aBoolean531 = arg0;
			this.method6358();
			this.anInt7377 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "(II)Lclient!bea;")
	protected Class14 method6289(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class14_Sub5(this);
		} else if (arg0 == 1) {
			return new Class14_Sub4(this);
		} else if (arg0 == 2) {
			return new Class14_Sub2(this, this.aClass224_5);
		} else if (arg0 == 7) {
			return new Class14_Sub7(this);
		} else {
			return new Class14_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!wk", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass56_Sub2_16.method6813((float) arg0, (float) arg2, (float) arg1);
		@Pc(25) int local25;
		@Pc(28) int local28;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local25 = (int) ((float) this.anInt7403 * this.aClass56_Sub2_16.method6823((float) arg1, (float) arg0, (float) arg2) / local14);
			local28 = (int) ((float) this.anInt7389 * this.aClass56_Sub2_16.method6817((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local25 = this.anInt7411;
			local28 = this.anInt7408;
		}
		arg3[0] = (int) ((float) local25 - this.aFloat139);
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local28 - this.aFloat131);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!eca;I)V")
	public final void method6290(@OriginalArg(1) Class90 arg0, @OriginalArg(2) int arg1) {
		this.method6291(arg1, false, arg0, false);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZLclient!eca;ZB)V")
	public abstract void method6291(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z[IIBI)Lclient!kt;")
	public final Interface12 method6292(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return this.method6275(arg2, arg0, arg1, 0, arg3, 0);
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method6319();
		this.method6341();
		this.method6293(arg4);
		this.method6290(Static85.aClass90_1, 0);
		this.method6391(0, Static85.aClass90_1);
		this.method6321(arg5);
		this.aClass56_Sub2_15.method6820(1.0F, (float) (arg3 - 1), (float) (arg2 - 1));
		this.aClass56_Sub2_15.method6811(0.0F, (float) arg0 - local7, -local7 + (float) arg1);
		this.method6356();
		this.method6323(false);
		this.method6342(Static149.aClass323_1, 4);
		this.method6323(true);
		this.method6391(0, Static663.aClass90_4);
		this.method6290(Static663.aClass90_4, 0);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)I")
	@Override
	public final int method6204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method6211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static101.method1669(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(ZI)V")
	public final void method6293(@OriginalArg(1) int arg0) {
		if (this.anInt7402 != arg0) {
			this.anInt7402 = arg0;
			this.method6286();
		}
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(B)I")
	public final int method6294() {
		return this.anInt7397;
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(B)V")
	protected abstract void method6295();

	@OriginalMember(owner = "client!wk", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt7393 = 0;
		this.anInt7406 = 0;
		this.anInt7395 = this.anInt7257;
		this.anInt7381 = this.anInt7221;
		if (this.aBoolean536) {
			this.aBoolean536 = false;
			this.method6337();
		}
		this.method6330();
	}

	@OriginalMember(owner = "client!wk", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass56_Sub2_16.aFloat155 * (float) arg2 + (float) arg0 * this.aClass56_Sub2_16.aFloat150 + this.aClass56_Sub2_16.aFloat154 * (float) arg1 + this.aClass56_Sub2_16.aFloat153;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass56_Sub2_16.aFloat154 * (float) arg4 + (float) arg3 * this.aClass56_Sub2_16.aFloat150 + (float) arg5 * this.aClass56_Sub2_16.aFloat155 + this.aClass56_Sub2_16.aFloat153;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt7413 > local32 && local63 < (float) this.anInt7413) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt7385 && local63 > (float) this.anInt7385) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass56_Sub2_16.aFloat159 + (float) arg1 * this.aClass56_Sub2_16.aFloat158 + (float) arg0 * this.aClass56_Sub2_16.aFloat148 + (float) arg2 * this.aClass56_Sub2_16.aFloat151) * (float) this.anInt7403 / local32);
		@Pc(167) int local167 = (int) ((this.aClass56_Sub2_16.aFloat159 + (float) arg3 * this.aClass56_Sub2_16.aFloat148 + (float) arg4 * this.aClass56_Sub2_16.aFloat158 + this.aClass56_Sub2_16.aFloat151 * (float) arg5) * (float) this.anInt7403 / local63);
		if ((float) local135 < this.aFloat139 && (float) local167 < this.aFloat139) {
			local7 |= 0x1;
		} else if (this.aFloat138 < (float) local135 && (float) local167 > this.aFloat138) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt7389 * (this.aClass56_Sub2_16.aFloat152 + this.aClass56_Sub2_16.aFloat149 * (float) arg1 + (float) arg0 * this.aClass56_Sub2_16.aFloat156 + (float) arg2 * this.aClass56_Sub2_16.aFloat157) / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt7389 * (this.aClass56_Sub2_16.aFloat152 + (float) arg4 * this.aClass56_Sub2_16.aFloat149 + this.aClass56_Sub2_16.aFloat156 * (float) arg3 + (float) arg5 * this.aClass56_Sub2_16.aFloat157) / local63);
		if ((float) local233 < this.aFloat131 && (float) local265 < this.aFloat131) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat133 && (float) local265 > this.aFloat133) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "(I)V")
	protected abstract void method6296();

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "(B)V")
	private void method6297() {
		if (this.aClass310_7 == Static138.aClass310_2) {
			return;
		}
		@Pc(10) Class310 local10 = this.aClass310_7;
		this.aClass310_7 = Static138.aClass310_2;
		if (!local10.method7319()) {
			this.method6401();
		}
		this.method6310();
		this.aFloatArray57 = this.aFloatArray53;
		this.method6377();
		this.anInt7377 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "(B)I")
	public final int method6298() {
		return this.anInt7412;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!pg;)V")
	public abstract void method6299(@OriginalArg(1) Class271 arg0);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([[IZII)Lclient!bv;")
	public abstract Interface1 method6300(@OriginalArg(0) int[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!eh;)V")
	@Override
	public final void method6222(@OriginalArg(0) Class56 arg0) {
		this.aClass56_Sub2_16 = (Class56_Sub2) arg0;
		this.aClass56_Sub2_18.method8393(this.aClass56_Sub2_16);
		this.aClass56_Sub2_18.method6816();
		this.aClass56_Sub2_19.method6827(this.aClass56_Sub2_18);
		this.aClass56_Sub2_17.method6827(this.aClass56_Sub2_16);
		if (this.aClass310_7.method7319()) {
			this.method6401();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method6209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) float local12 = (float) -arg0 + (float) arg2;
		@Pc(18) float local18 = (float) arg3 - (float) arg1;
		@Pc(43) float local43;
		if (local12 == 0.0F && local18 == 0.0F) {
			local12 = 1.0F;
		} else {
			local43 = (float) (1.0D / Math.sqrt((double) (local12 * local12 + local18 * local18)));
			local18 *= local43;
			local12 *= local43;
		}
		this.method6341();
		this.method6293(arg4);
		this.method6290(Static85.aClass90_1, 0);
		this.method6391(0, Static85.aClass90_1);
		this.method6321(1);
		this.method6313();
		@Pc(81) int local81 = arg7 % (arg6 + arg5);
		this.method6323(false);
		local43 = local12 * (float) arg5;
		@Pc(95) float local95 = (float) arg5 * local18;
		@Pc(97) float local97 = 0.0F;
		@Pc(99) float local99 = 0.0F;
		@Pc(101) float local101 = local43;
		@Pc(103) float local103 = local95;
		if (local81 <= arg5) {
			local103 = (float) (arg5 - local81) * local18;
			local101 = (float) (arg5 - local81) * local12;
		} else {
			local99 = (float) (arg5 + arg6 - local81) * local18;
			local97 = (float) (arg6 + arg5 - local81) * local12;
		}
		@Pc(153) float local153 = local97 + (float) arg0;
		@Pc(158) float local158 = local99 + (float) arg1;
		@Pc(163) float local163 = local12 * (float) arg6;
		@Pc(168) float local168 = local18 * (float) arg6;
		while (true) {
			if (arg2 > arg0) {
				if ((float) arg2 < local153) {
					break;
				}
				if ((float) arg2 < local153 + local101) {
					local101 = (float) arg2 - local153;
				}
			} else {
				if ((float) arg2 > local153) {
					break;
				}
				if ((float) arg2 > local153 + local101) {
					local101 = (float) arg2 - local153;
				}
			}
			if (arg1 < arg3) {
				if ((float) arg3 < local158) {
					break;
				}
				if (local158 + local103 > (float) arg3) {
					local103 = (float) arg3 - local158;
				}
			} else {
				if (local158 < (float) arg3) {
					break;
				}
				if (local158 + local103 < (float) arg3) {
					local103 = (float) arg3 - local158;
				}
			}
			if (!this.method6345(local158, 0.0F, local153 + local101, local153, local103 + local158, 0.0F)) {
				return;
			}
			local153 += local101 + local163;
			this.method6395();
			local158 += local103 + local168;
			local103 = local95;
			local101 = local43;
		}
		this.method6323(true);
		this.method6391(0, Static663.aClass90_4);
		this.method6290(Static663.aClass90_4, 0);
	}

	@OriginalMember(owner = "client!wk", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt7221 - 1 && arg1 <= 0 && arg3 >= this.anInt7257 - 1) {
			this.la();
			return;
		}
		this.anInt7393 = arg1 >= 0 ? arg1 : 0;
		this.anInt7381 = arg2 > this.anInt7221 ? 0 : arg2;
		this.anInt7406 = arg0 < 0 ? 0 : arg0;
		this.anInt7395 = arg3 <= this.anInt7221 ? arg3 : 0;
		if (!this.aBoolean536) {
			this.aBoolean536 = true;
			this.method6337();
		}
		this.method6390();
		this.method6330();
	}

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "(B)V")
	private void method6302() {
		this.anInterface6_16 = this.method6373(false);
		this.anInterface6_16.method3123(3096, 12);
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			@Pc(33) Buffer local33 = this.anInterface6_16.method3120();
			if (local33 != null) {
				@Pc(40) Stream local40 = this.method6361(local33);
				local40.b(0.0F);
				local40.b(0.0F);
				local40.b(0.0F);
				for (@Pc(51) int local51 = 0; local51 <= 256; local51++) {
					@Pc(61) double local61 = (double) (local51 * 2) * 3.141592653589793D / 256.0D;
					@Pc(65) float local65 = (float) Math.cos(local61);
					@Pc(69) float local69 = (float) Math.sin(local61);
					if (Stream.a()) {
						local40.b(local69);
						local40.b(local65);
						local40.b(0.0F);
					} else {
						local40.a(local69);
						local40.a(local65);
						local40.a(0.0F);
					}
				}
				local40.c();
				if (this.anInterface6_16.method3121()) {
					break;
				}
			}
		}
		this.aClass48_22 = this.method6320(new Class284[] { new Class284(Static199.aClass137_1) });
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)V")
	public abstract void method6303(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!ofa;Lclient!kn;)Z")
	public abstract boolean method6304(@OriginalArg(1) Class255 arg0, @OriginalArg(2) Class206 arg1);

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "(I)V")
	protected abstract void method6305();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BZ)V")
	public final void method6306(@OriginalArg(0) byte arg0) {
		this.method6293(arg0 << 8 | arg0 << 16 | arg0 << 24 | arg0);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!pd;I)V")
	public final void method6307(@OriginalArg(0) Class270 arg0) {
		this.aClass270Array3[this.anInt7412] = arg0;
		this.method6336();
	}

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "(I)V")
	protected final void method6308() {
		@Pc(13) Hashtable local13 = new Hashtable();
		if (this.aHashtable27 != null && !this.aHashtable27.isEmpty()) {
			@Pc(24) Enumeration local24 = this.aHashtable27.keys();
			while (local24.hasMoreElements()) {
				@Pc(29) Canvas local29 = (Canvas) local24.nextElement();
				local13.put(local29, this.method6403(local29));
			}
		}
		this.aHashtable27 = local13;
		this.method6398();
		this.method6372();
		this.method6302();
		this.aClass166_3.method3512(this);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILclient!ofa;ZII[FI)Lclient!kt;")
	protected abstract Interface12 method6309(@OriginalArg(2) Class255 arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float[] arg4);

	@OriginalMember(owner = "client!wk", name = "A", descriptor = "()Z")
	@Override
	public final boolean method6269() {
		return false;
	}

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "(I)V")
	private void method6310() {
		if (this.aBoolean519) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray53;
		@Pc(9) float local9 = (float) this.anInt7413;
		@Pc(13) float local13 = (float) this.anInt7385;
		@Pc(25) float local25 = (float) -this.anInt7408 * this.aFloat132 / (float) this.anInt7389;
		@Pc(37) float local37 = (float) -this.anInt7411 * this.aFloat132 / (float) this.anInt7403;
		@Pc(52) float local52 = this.aFloat132 * (float) (this.anInt7221 - this.anInt7411) / (float) this.anInt7403;
		@Pc(66) float local66 = this.aFloat132 * (float) (this.anInt7257 - this.anInt7408) / (float) this.anInt7389;
		if (local37 == local52 || local25 == local66) {
			local5[12] = 0.0F;
			local5[6] = 0.0F;
			local5[15] = 1.0F;
			local5[14] = 0.0F;
			local5[10] = 1.0F;
			local5[3] = 0.0F;
			local5[1] = 0.0F;
			local5[4] = 0.0F;
			local5[2] = 0.0F;
			local5[5] = 1.0F;
			local5[0] = 1.0F;
			local5[9] = 0.0F;
			local5[8] = 0.0F;
			local5[11] = 0.0F;
			local5[7] = 0.0F;
			local5[13] = 0.0F;
		} else {
			local5[1] = 0.0F;
			local5[3] = 0.0F;
			local5[11] = 0.0F;
			local5[14] = local9 / (local9 - local13);
			local5[0] = 2.0F / (local52 - local37);
			local5[15] = 1.0F;
			local5[2] = 0.0F;
			local5[9] = 0.0F;
			local5[10] = 1.0F / (local9 - local13);
			local5[6] = 0.0F;
			local5[4] = 0.0F;
			local5[7] = 0.0F;
			local5[12] = (local52 + local37) / (-local52 + local37);
			local5[8] = 0.0F;
			local5[13] = (local66 + local25) / (-local25 + local66);
			local5[5] = 2.0F / (local66 - local25);
		}
		this.method6316();
		this.aBoolean519 = true;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZZZI)V")
	public final void method6312(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt7394 != arg2 || this.aBoolean523 != this.aBoolean521) {
			@Pc(24) Interface12 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean523 ? 3 : 0;
			if (arg2 < 0) {
				this.method6282();
			} else {
				local24 = this.aClass226_3.method5215(arg2);
				@Pc(51) Class331 local51 = super.anInterface3_11.method8501(arg2);
				if (local51.aByte116 == 0 && local51.aByte113 == 0) {
					this.method6282();
				} else {
					@Pc(70) int local70 = local51.aBoolean659 ? 64 : 128;
					@Pc(74) int local74 = local70 * 50;
					@Pc(78) Class56_Sub2 local78 = this.method6277();
					local78.method6824(0.0F, (float) (this.anInt7410 % local74 * local51.aByte113) / (float) local74, (float) (this.anInt7410 % local74 * local51.aByte116) / (float) local74);
					this.method6307(Static73.aClass270_1);
				}
				local26 = local51.anInt9138;
				if (!this.aBoolean523) {
					local28 = local51.aByte114;
					local30 = local51.anInt9139;
					local37 = local51.aByte117;
				}
			}
			this.method6274(local37, arg0, local30, arg1, local28);
			if (this.aClass14_3 == null) {
				this.method6338(local24);
				this.method6322(local26);
			} else {
				this.aClass14_3.method8620(local24, local26);
			}
			this.anInt7394 = arg2;
			this.aBoolean521 = this.aBoolean523;
		}
		this.anInt7377 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "(I)V")
	public final void method6313() {
		this.aClass56_Sub2_15.method8400();
		this.aBoolean515 = true;
		this.method6384();
	}

	@OriginalMember(owner = "client!wk", name = "y", descriptor = "()Lclient!eh;")
	@Override
	public final Class56 method6257() {
		return this.aClass56_Sub2_16;
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(ZI)V")
	public final void method6314(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean535) {
			this.aBoolean535 = arg0;
			this.method6368();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIZ)Lclient!qda;")
	@Override
	public final Class59 method6263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class59_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "(I)V")
	protected abstract void method6315();

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "(B)V")
	private void method6316() {
		this.aFloat137 = (float) this.anInt7385;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILclient!ofa;[BIIZI)Lclient!kt;")
	protected abstract Interface12 method6317(@OriginalArg(0) int arg0, @OriginalArg(2) Class255 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "(B)V")
	public final void method6318() {
		if (this.anInt7377 == 4) {
			return;
		}
		this.method6284();
		this.method6380(false);
		this.method6288(false);
		this.method6362(false);
		this.method6405(false);
		this.method6312(false, false, -2);
		this.method6321(1);
		this.method6322(0);
		this.anInt7377 = 4;
	}

	@OriginalMember(owner = "client!wk", name = "x", descriptor = "(I)F")
	protected abstract float method6319();

	@OriginalMember(owner = "client!wk", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6216(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[Lclient!qe;)Lclient!bw;")
	public abstract Class48 method6320(@OriginalArg(1) Class284[] arg0);

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "()Z")
	@Override
	public final boolean method6234() {
		return false;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)V")
	public final void method6321(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt7379) {
			return;
		}
		@Pc(27) Class31 local27;
		@Pc(23) boolean local23;
		@Pc(25) boolean local25;
		if (arg0 == 1) {
			local23 = true;
			local25 = true;
			local27 = Static414.aClass31_7;
		} else if (arg0 == 2) {
			local23 = true;
			local25 = false;
			local27 = Static566.aClass31_9;
		} else if (arg0 == 128) {
			local27 = Static336.aClass31_6;
			local23 = true;
			local25 = true;
		} else {
			local25 = false;
			local23 = false;
			local27 = Static53.aClass31_3;
		}
		if (local25 != this.aBoolean520) {
			this.aBoolean520 = local25;
			this.method6375();
		}
		if (this.aBoolean522 != local23) {
			this.aBoolean522 = local23;
			this.method6379();
		}
		if (local27 != this.aClass31_8) {
			this.aClass31_8 = local27;
			this.method6404();
		}
		this.anInt7377 &= 0xFFFFFFE3;
		this.anInt7379 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[Lclient!jw;)V")
	@Override
	public final void method6210(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub3[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass5_Sub3Array4[local3] = arg1[local3];
		}
		this.anInt7414 = arg0;
		if (this.aClass310_7.method7319()) {
			this.method6388();
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(BI)V")
	public final void method6322(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method6370(Static371.aClass6_2, Static371.aClass6_2);
		} else if (arg0 == 0) {
			this.method6370(Static600.aClass6_4, Static600.aClass6_4);
		} else if (arg0 == 2) {
			this.method6370(Static460.aClass6_3, Static371.aClass6_2);
		} else if (arg0 == 3) {
			this.method6370(Static346.aClass6_1, Static600.aClass6_4);
		} else if (arg0 == 4) {
			this.method6370(Static646.aClass6_5, Static646.aClass6_5);
			return;
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(BZ)V")
	public abstract void method6323(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!wk", name = "y", descriptor = "(I)V")
	protected abstract void method6324();

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt7413;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([I)V")
	@Override
	public final void method6236(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7221;
		arg0[1] = this.anInt7257;
	}

	@OriginalMember(owner = "client!wk", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Interface12 local9 = local6.anInterface12_2;
		this.method6400();
		this.method6338(local9);
		this.method6321(1);
		this.method6370(Static371.aClass6_2, Static371.aClass6_2);
		this.method6290(Static85.aClass90_1, 0);
		this.method6293(arg0);
		this.aClass56_Sub2_15.method6820(0.0F, (float) this.anInt7257, (float) this.anInt7221);
		this.method6356();
		this.aClass56_Sub2Array3[0].method6820(1.0F, local9.method7455((float) this.anInt7257), local9.method7450((float) this.anInt7221));
		this.aClass56_Sub2Array3[0].method6811(0.0F, local9.method7450((float) -arg2), local9.method7455((float) -arg3));
		this.aClass270Array3[0] = Static73.aClass270_1;
		this.method6336();
		this.method6352();
		this.method6282();
		this.method6290(Static663.aClass90_4, 0);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BILclient!fka;)V")
	public abstract void method6325(@OriginalArg(1) int arg0, @OriginalArg(2) Interface6 arg1);

	@OriginalMember(owner = "client!wk", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt7370 + this.anInt7368 + this.anInt7363;
	}

	@OriginalMember(owner = "client!wk", name = "z", descriptor = "(I)V")
	public abstract void method6326();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V")
	public final void method6327(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean525 != arg0) {
			this.aBoolean525 = arg0;
			this.method6358();
		}
	}

	@OriginalMember(owner = "client!wk", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt7411, this.anInt7408, this.anInt7403, this.anInt7389 };
	}

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "(B)V")
	private void method6328() {
		if (this.aBoolean532) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray59;
		@Pc(21) float local21 = (float) (-this.anInt7411 * this.anInt7413) / (float) this.anInt7403;
		@Pc(35) float local35 = (float) ((this.anInt7221 - this.anInt7411) * this.anInt7413) / (float) this.anInt7403;
		@Pc(46) float local46 = (float) (this.anInt7413 * this.anInt7408) / (float) this.anInt7389;
		@Pc(61) float local61 = (float) ((this.anInt7408 - this.anInt7257) * this.anInt7413) / (float) this.anInt7389;
		if (local21 == local35 || local61 == local46) {
			local9[0] = 1.0F;
			local9[11] = 0.0F;
			local9[1] = 0.0F;
			local9[13] = 0.0F;
			local9[7] = 0.0F;
			local9[12] = 0.0F;
			local9[8] = 0.0F;
			local9[3] = 0.0F;
			local9[15] = 1.0F;
			local9[5] = 1.0F;
			local9[14] = 0.0F;
			local9[6] = 0.0F;
			local9[9] = 0.0F;
			local9[4] = 0.0F;
			local9[2] = 0.0F;
			local9[10] = 1.0F;
		} else {
			@Pc(140) float local140 = (float) this.anInt7413 * 2.0F;
			local9[14] = this.aFloat128 = (float) (this.anInt7413 * this.anInt7385) / (float) (this.anInt7413 - this.anInt7385);
			local9[11] = -1.0F;
			local9[15] = 0.0F;
			local9[8] = (local21 + local35) / (local35 - local21);
			local9[13] = 0.0F;
			local9[5] = local140 / (local46 - local61);
			local9[9] = (local61 + local46) / (-local61 + local46);
			local9[7] = 0.0F;
			local9[6] = 0.0F;
			local9[10] = this.aFloat140 = (float) this.anInt7385 / (float) (this.anInt7413 - this.anInt7385);
			local9[1] = 0.0F;
			local9[12] = 0.0F;
			local9[0] = local140 / (local35 - local21);
			local9[2] = 0.0F;
			local9[3] = 0.0F;
			local9[4] = 0.0F;
		}
		this.method6386();
		this.aBoolean532 = true;
	}

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "()Lclient!eh;")
	@Override
	public final Class56 method6232() {
		return new Class56_Sub2();
	}

	@OriginalMember(owner = "client!wk", name = "A", descriptor = "(I)V")
	protected abstract void method6329();

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "()V")
	@Override
	public final void method6187() {
		if (this.aClass226_3 != null) {
			this.aClass226_3.method5211();
		}
	}

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "(B)V")
	private void method6330() {
		this.aFloat138 = (float) (this.anInt7381 - this.anInt7411);
		this.aFloat133 = (float) (this.anInt7395 - this.anInt7408);
		this.aFloat131 = (float) (this.anInt7393 - this.anInt7408);
		this.aFloat139 = (float) (this.anInt7406 - this.anInt7411);
	}

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "(Z)V")
	private void method6331() {
		if (this.aBoolean527) {
			return;
		}
		@Pc(20) float[] local20 = this.aFloatArray58;
		if (this.anInt7221 == 0 || this.anInt7257 == 0) {
			local20[7] = 0.0F;
			local20[4] = 0.0F;
			local20[15] = 1.0F;
			local20[0] = 1.0F;
			local20[2] = 0.0F;
			local20[5] = 1.0F;
			local20[11] = 0.0F;
			local20[13] = 0.0F;
			local20[9] = 0.0F;
			local20[8] = 0.0F;
			local20[12] = 0.0F;
			local20[10] = 1.0F;
			local20[1] = 0.0F;
			local20[3] = 0.0F;
			local20[6] = 0.0F;
			local20[14] = 0.0F;
		} else {
			local20[0] = 2.0F / (float) this.anInt7221;
			local20[8] = 0.0F;
			local20[14] = 0.5F;
			local20[10] = 0.5F;
			local20[13] = 1.0F;
			local20[1] = 0.0F;
			local20[2] = 0.0F;
			local20[7] = 0.0F;
			local20[5] = -2.0F / (float) this.anInt7257;
			local20[12] = -1.0F;
			local20[9] = 0.0F;
			local20[3] = 0.0F;
			local20[15] = 1.0F;
			local20[6] = 0.0F;
			local20[4] = 0.0F;
			local20[11] = 0.0F;
		}
		this.aBoolean527 = true;
	}

	@OriginalMember(owner = "client!wk", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean523) {
			throw new RuntimeException("");
		}
		this.anInt7397 = arg1;
		this.anInt7388 = arg0;
		this.anInt7398 = arg3;
		this.anInt7386 = arg2;
		if (this.aBoolean521) {
			this.aClass14Array3[3].method8623();
			this.aClass14Array3[3].method8618();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIZLclient!eca;)V")
	protected abstract void method6332(@OriginalArg(1) int arg0, @OriginalArg(3) Class90 arg1);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!bw;)V")
	public abstract void method6333(@OriginalArg(1) Class48 arg0);

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "(B)V")
	protected abstract void method6334();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!kf;[Lclient!re;Z)Lclient!da;")
	@Override
	public final Class72 method6194(@OriginalArg(0) Class198 arg0, @OriginalArg(1) Class301[] arg1) {
		return new Class72_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "()Z")
	@Override
	public final boolean method6207() {
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "(I)V")
	@Override
	public final void method6258() {
	}

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "(B)[F")
	public final float[] method6335() {
		return this.aFloatArray54;
	}

	@OriginalMember(owner = "client!wk", name = "B", descriptor = "(I)V")
	private void method6336() {
		this.method6389();
		if (this.aClass14_3 != null) {
			this.aClass14_3.method8616();
		}
	}

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "(B)V")
	protected abstract void method6337();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZLclient!dr;)V")
	public final void method6338(@OriginalArg(1) Interface4 arg0) {
		if (arg0 == this.anInterface4Array3[this.anInt7412]) {
			return;
		}
		this.anInterface4Array3[this.anInt7412] = arg0;
		if (arg0 == null) {
			this.method6305();
		} else {
			arg0.method7436();
		}
		this.anInt7377 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z[BIILclient!ofa;Z)Lclient!kt;")
	public final Interface12 method6339(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class255 arg3, @OriginalArg(5) boolean arg4) {
		return this.method6317(arg2, arg3, arg0, arg4, arg1);
	}

	@OriginalMember(owner = "client!wk", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt7406) {
			local5 = true;
			this.anInt7406 = arg0;
		}
		if (this.anInt7381 > arg2) {
			local5 = true;
			this.anInt7381 = arg2;
		}
		if (arg1 > this.anInt7393) {
			local5 = true;
			this.anInt7393 = arg1;
		}
		if (this.anInt7395 > arg3) {
			local5 = true;
			this.anInt7395 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean536) {
			this.aBoolean536 = true;
			this.method6337();
		}
		this.method6390();
		this.method6330();
	}

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "(B)I")
	public final int method6340() {
		return this.anInt7398;
	}

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "(B)V")
	private void method6341() {
		if (this.anInt7377 == 1) {
			return;
		}
		this.method6284();
		this.method6380(false);
		this.method6288(false);
		this.method6362(false);
		this.method6405(false);
		this.method6312(false, false, -2);
		this.method6322(1);
		this.method6338(this.anInterface4_3);
		this.anInt7377 = 1;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!si;II)V")
	private void method6342(@OriginalArg(0) Class323 arg0, @OriginalArg(2) int arg1) {
		this.method6325(0, this.anInterface6_15);
		this.method6333(this.aClass48_19);
		this.method6381(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIIIZ)Lclient!qda;")
	@Override
	public final Class59 method6265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class59_Sub3 local11 = new Class59_Sub3(this, arg2, arg3, arg4);
		local11.method8054(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!wk", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt7401 != arg0;
		if (local11 || this.aFloat142 != arg1 || this.aFloat135 != arg2) {
			this.aFloat135 = arg2;
			this.anInt7401 = arg0;
			this.aFloat142 = arg1;
			if (local11) {
				this.aFloat129 = (float) (this.anInt7401 & 0xFF00) / 65280.0F;
				this.aFloat143 = (float) (this.anInt7401 & 0xFF) / 255.0F;
				this.aFloat141 = (float) (this.anInt7401 & 0xFF0000) / 1.671168E7F;
				this.method6283();
			}
			this.aNativeInterface3.setSunColour(this.aFloat141, this.aFloat129, this.aFloat143, arg1, arg2);
			this.method6296();
		}
		if (arg3 != this.aFloatArray52[0] || arg4 != this.aFloatArray52[1] || this.aFloatArray52[2] != arg5) {
			this.aFloatArray52[0] = arg3;
			this.aFloatArray52[1] = arg4;
			this.aFloatArray52[2] = arg5;
			this.aFloatArray60[2] = -arg5;
			this.aFloatArray60[0] = -arg3;
			this.aFloatArray60[1] = -arg4;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray55[2] = arg5 * local149;
			this.aFloatArray55[1] = local149 * arg4;
			this.aFloatArray55[0] = arg3 * local149;
			this.aFloatArray56[2] = -this.aFloatArray55[2];
			this.aFloatArray56[0] = -this.aFloatArray55[0];
			this.aFloatArray56[1] = -this.aFloatArray55[1];
			this.aNativeInterface3.setSunDirection(this.aFloatArray55[0], this.aFloatArray55[1], this.aFloatArray55[2]);
			this.method6326();
			this.anInt7380 = (int) (arg3 * 256.0F / arg4);
			this.anInt7387 = (int) (arg5 * 256.0F / arg4);
		}
		this.method6324();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6195(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable27.containsKey(arg0)) {
			this.method6366(this.aHashtable27.get(arg0), arg0);
			this.aHashtable27.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZI)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method6343(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap6.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!wk", name = "C", descriptor = "(I)V")
	private void method6344() {
		this.method6283();
		this.method6296();
		this.method6358();
		this.method6388();
		this.method6326();
		this.method6324();
		this.method6368();
		this.method6295();
		this.method6315();
		this.method6382();
		this.method6285();
		this.method6379();
		this.method6404();
		this.method6375();
		for (@Pc(58) int local58 = this.anInt7405 - 1; local58 >= 0; local58--) {
			this.method6374(local58);
			this.method6329();
			this.method6273();
			this.method6282();
		}
		this.method6286();
		this.method6385();
		this.method6334();
		this.method6378();
		this.method6351();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(FFFFIFF)Z")
	private boolean method6345(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface6_17.method3120();
		if (local9 == null) {
			return false;
		}
		@Pc(23) Stream local23 = this.method6361(local9);
		if (Stream.a()) {
			local23.b(arg3);
			local23.b(arg0);
			local23.b(arg1);
			local23.b(arg2);
			local23.b(arg4);
			local23.b(arg5);
		} else {
			local23.a(arg3);
			local23.a(arg0);
			local23.a(arg1);
			local23.a(arg2);
			local23.a(arg4);
			local23.a(arg5);
		}
		local23.c();
		return this.anInterface6_17.method3121();
	}

	@OriginalMember(owner = "client!wk", name = "D", descriptor = "(I)V")
	protected void method6346() {
		this.method6344();
	}

	@OriginalMember(owner = "client!wk", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6216(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIF)Lclient!jw;")
	@Override
	public final Class5_Sub3 method6256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub3_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wk", name = "E", descriptor = "(I)V")
	public final void method6347() {
		if (this.anInt7377 == 16) {
			return;
		}
		this.method6297();
		this.method6380(true);
		this.method6362(true);
		this.method6405(true);
		this.method6321(1);
		this.anInt7377 = 16;
	}

	@OriginalMember(owner = "client!wk", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6341();
		this.method6293(arg4);
		this.method6290(Static85.aClass90_1, 0);
		this.method6391(0, Static85.aClass90_1);
		this.method6321(arg5);
		this.aClass56_Sub2_15.method6820(1.0F, (float) arg3, (float) arg2);
		this.aClass56_Sub2_15.method8390(arg0, arg1, 0);
		this.method6356();
		this.method6323(false);
		this.method6352();
		this.method6323(true);
		this.method6391(0, Static663.aClass90_4);
		this.method6290(Static663.aClass90_4, 0);
	}

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "(B)V")
	private void method6348() {
		if (this.aCanvas11 == null) {
			this.anInt7360 = this.anInt7276 = 1;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas11.getSize();
			this.anInt7360 = local18.width;
			this.anInt7276 = local18.height;
		}
		this.anInt7221 = this.anInt7360;
		this.anInt7257 = this.anInt7276;
		this.method6371();
		this.method6276();
		this.method6278();
		this.method6385();
		this.method6330();
		this.method6355();
		this.la();
	}

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "()Z")
	@Override
	public final boolean method6240() {
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "(B)Lclient!pr;")
	public final Class56_Sub2 method6349() {
		return this.aClass56_Sub2_15;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!pr;I)V")
	public final void method6350(@OriginalArg(0) Class56_Sub2 arg0) {
		this.aClass56_Sub2_15.method8393(arg0);
		this.aBoolean515 = false;
		this.method6384();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6261(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas10 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable27.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) Object local53 = this.method6403(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable27.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method6217(@OriginalArg(0) Class5_Sub26 arg0) {
		this.aNativeHeap6 = ((Class5_Sub26_Sub1) arg0).aNativeHeap1;
		this.aNativeHeapBuffer7 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(II)I")
	@Override
	public final int method6226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class88 method6242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class88_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V")
	@Override
	public final void method6230(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass226_3 != null) {
			this.aClass226_3.method5211();
		}
		this.anInt7378 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "F", descriptor = "(I)V")
	protected abstract void method6351();

	@OriginalMember(owner = "client!wk", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat136) {
			this.aFloat136 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method6283();
			this.method6324();
		}
	}

	@OriginalMember(owner = "client!wk", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7399 == arg0 && arg1 == this.anInt7407 && this.anInt7390 == arg2) {
			return;
		}
		this.anInt7407 = arg1;
		this.anInt7399 = arg0;
		this.anInt7390 = arg2;
		this.method6353();
		this.method6382();
	}

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "(B)V")
	public final void method6352() {
		this.method6342(Static672.aClass323_6, 2);
	}

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "()V")
	@Override
	protected void method6223() {
		if (this.aBoolean529) {
			return;
		}
		for (@Pc(9) Class5 local9 = this.aClass124_73.method2572(); local9 != null; local9 = this.aClass124_73.method2569()) {
			((Class5_Sub26_Sub1) local9).method2871();
		}
		@Pc(26) Enumeration local26 = this.aHashtable27.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method6366(this.aHashtable27.get(local32), local32);
		}
		Static501.method7248(false, true);
		this.aNativeInterface3.release();
		this.aBoolean529 = true;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([IIIIIZ)Lclient!qda;")
	@Override
	public final Class59 method6246(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class59_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local10 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local16 * local16 + local10 * local10));
			local18 = (float) Math.atan2((double) local16, (double) local10);
		}
		this.method6341();
		this.method6293(arg4);
		this.method6290(Static85.aClass90_1, 0);
		this.method6391(0, Static85.aClass90_1);
		this.method6321(0);
		this.aClass56_Sub2_15.method6820(1.0F, (float) arg5, local20);
		this.aClass56_Sub2_15.method8390(0, -arg5 / 2, 0);
		this.aClass56_Sub2_15.method8385((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass56_Sub2_15.method8390(arg0, arg1, 0);
		this.method6356();
		this.method6323(false);
		this.method6352();
		this.method6323(true);
		this.method6391(0, Static663.aClass90_4);
		this.method6290(Static663.aClass90_4, 0);
	}

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "(B)V")
	private void method6353() {
		if (this.aClass14_3 != null) {
			this.aClass14_3.method8618();
		}
		this.method6285();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IF)V")
	public final void method6354(@OriginalArg(1) float arg0) {
		if (this.aFloat132 != arg0) {
			this.aFloat132 = arg0;
			this.method6278();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ag;)V")
	@Override
	public final void method6249(@OriginalArg(0) Class11 arg0) {
		this.aClass11_Sub2_3 = (Class11_Sub2) arg0;
	}

	@OriginalMember(owner = "client!wk", name = "G", descriptor = "(I)V")
	public final void method6355() {
		if (Static205.aClass310_4 == this.aClass310_7) {
			return;
		}
		@Pc(14) Class310 local14 = this.aClass310_7;
		this.aClass310_7 = Static205.aClass310_4;
		if (local14.method7319()) {
			this.method6401();
		}
		this.anInt7377 &= 0xFFFFFFE0;
		this.aFloatArray57 = this.aFloatArray54;
	}

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "(B)V")
	public final void method6356() {
		this.aBoolean515 = false;
		this.method6384();
	}

	@OriginalMember(owner = "client!wk", name = "H", descriptor = "(I)V")
	public final void method6357() {
		this.method6355();
		this.method6377();
	}

	@OriginalMember(owner = "client!wk", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7388 = arg0;
		this.anInt7398 = arg3;
		this.aBoolean523 = true;
		this.anInt7386 = arg2;
		this.anInt7397 = arg1;
	}

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "()Z")
	@Override
	public final boolean method6214() {
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!hea;I)V")
	@Override
	public final void method6233(@OriginalArg(0) Class149 arg0, @OriginalArg(1) int arg1) {
		this.aClass166_3.method3509(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	@Override
	public final void method6218(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "(Z)V")
	protected abstract void method6358();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([BILclient!ofa;III)Lclient!po;")
	public abstract Interface21 method6359(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class255 arg1);

	@OriginalMember(owner = "client!wk", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt7416;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ofa;ILclient!kn;II)Lclient!kt;")
	public abstract Interface12 method6360(@OriginalArg(0) Class255 arg0, @OriginalArg(2) Class206 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method6361(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZZ)V")
	public final void method6362(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean528) {
			this.aBoolean528 = arg0;
			this.method6295();
			this.anInt7377 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wk", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt7385;
	}

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7413 == arg0 && this.anInt7385 == arg1) {
			return;
		}
		this.anInt7385 = arg1;
		this.anInt7413 = arg0;
		this.method6276();
		this.method6278();
		this.method6353();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!kn;Lclient!ofa;I)Z")
	public abstract boolean method6363(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class255 arg1);

	@OriginalMember(owner = "client!wk", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt7381;
		arg0[1] = this.anInt7393;
		arg0[3] = this.anInt7395;
		arg0[0] = this.anInt7406;
	}

	@OriginalMember(owner = "client!wk", name = "I", descriptor = "(I)I")
	public final int method6364() {
		return this.anInt7388;
	}

	@OriginalMember(owner = "client!wk", name = "x", descriptor = "(B)V")
	public final void method6365() {
		if (this.anInt7377 == 8) {
			return;
		}
		this.method6383();
		this.method6380(true);
		this.method6362(true);
		this.method6405(true);
		this.method6321(1);
		this.anInt7377 = 8;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method6254() {
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method6366(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!si;ILclient!mq;IIII)V")
	public abstract void method6367(@OriginalArg(0) Class323 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wk", name = "J", descriptor = "(I)V")
	protected abstract void method6368();

	@OriginalMember(owner = "client!wk", name = "y", descriptor = "(B)I")
	public final int method6369() {
		return this.anInt7386;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLclient!ada;Lclient!ada;)V")
	public final void method6370(@OriginalArg(1) Class6 arg0, @OriginalArg(2) Class6 arg1) {
		@Pc(5) boolean local5 = false;
		if (this.aClass6Array5[this.anInt7412] != arg0) {
			this.aClass6Array5[this.anInt7412] = arg0;
			this.method6329();
			local5 = true;
		}
		if (arg1 != this.aClass6Array6[this.anInt7412]) {
			this.aClass6Array6[this.anInt7412] = arg1;
			local5 = true;
			this.method6273();
		}
		if (local5) {
			this.anInt7377 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!wk", name = "z", descriptor = "(B)V")
	private void method6371() {
		this.aBoolean527 = false;
		if (this.aClass310_7 == Static142.aClass310_3) {
			this.method6331();
			this.method6377();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!hea;)V")
	@Override
	public final void method6215(@OriginalArg(0) Class149 arg0) {
		this.aClass166_3.method3509(this, arg0, -1);
	}

	@OriginalMember(owner = "client!wk", name = "K", descriptor = "(I)V")
	private void method6372() {
		this.anInterface6_17 = this.method6373(true);
		this.anInterface6_17.method3123(24, 12);
		this.aClass48_20 = this.method6320(new Class284[] { new Class284(Static199.aClass137_1) });
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(IZ)Lclient!fka;")
	public abstract Interface6 method6373(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(BI)V")
	public final void method6374(@OriginalArg(1) int arg0) {
		if (this.anInt7412 != arg0) {
			this.anInt7412 = arg0;
			this.method6392();
		}
	}

	@OriginalMember(owner = "client!wk", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7411 = arg0;
		this.anInt7408 = arg1;
		this.anInt7403 = arg2;
		this.anInt7389 = arg3;
		this.method6278();
		this.method6276();
		this.method6355();
		this.method6330();
	}

	@OriginalMember(owner = "client!wk", name = "L", descriptor = "(I)V")
	protected abstract void method6375();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
	protected abstract void method6376(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!wk", name = "M", descriptor = "(I)V")
	private void method6377() {
		this.method6334();
		if (this.aClass14_3 != null) {
			this.aClass14_3.method8621();
		}
	}

	@OriginalMember(owner = "client!wk", name = "A", descriptor = "(B)V")
	protected abstract void method6378();

	@OriginalMember(owner = "client!wk", name = "N", descriptor = "(I)V")
	protected abstract void method6379();

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(ZI)V")
	public final void method6380(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean516) {
			this.aBoolean516 = arg0;
			this.method6382();
			this.anInt7377 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public final Class5_Sub26 method6268(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub26_Sub1 local8 = new Class5_Sub26_Sub1(arg0);
		this.aClass124_73.method2574(local8);
		return local8;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!si;II)V")
	public abstract void method6381(@OriginalArg(1) Class323 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wk", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt7392 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt7392++;
		}
		this.anInt7400 = 0x1 << this.anInt7392;
	}

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "(Z)V")
	protected abstract void method6382();

	@OriginalMember(owner = "client!wk", name = "O", descriptor = "(I)V")
	private void method6383() {
		if (Static62.aClass310_1 == this.aClass310_7) {
			return;
		}
		@Pc(22) Class310 local22 = this.aClass310_7;
		this.aClass310_7 = Static62.aClass310_1;
		if (!local22.method7319()) {
			this.method6401();
		}
		this.method6328();
		this.aFloatArray57 = this.aFloatArray59;
		this.method6377();
		this.anInt7377 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "()Z")
	@Override
	public final boolean method6205() {
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "(Z)V")
	private void method6384() {
		if (Static142.aClass310_3 == this.aClass310_7) {
			@Pc(11) float local11 = this.method6319();
			this.aClass56_Sub2_15.method6811(0.0F, local11, local11);
		}
		this.aBoolean533 = false;
		this.method6378();
		if (this.aClass14_3 != null) {
			this.aClass14_3.method8614();
		}
	}

	@OriginalMember(owner = "client!wk", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean523 = false;
	}

	@OriginalMember(owner = "client!wk", name = "B", descriptor = "(B)V")
	protected abstract void method6385();

	@OriginalMember(owner = "client!wk", name = "C", descriptor = "(B)V")
	private void method6386() {
		this.aFloatArray59[14] = this.aFloat128;
		this.aFloatArray59[10] = this.aFloat140;
		this.bf = (this.aFloatArray59[14] - (float) this.anInt7385) / this.aFloatArray59[10];
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6266(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas10 == arg0) {
			local5 = this.anObject13;
		} else if (this.aHashtable27.containsKey(arg0)) {
			local5 = this.aHashtable27.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method6376(arg0, local5);
		if (this.aCanvas11 == arg0) {
			this.method6348();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6186(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "(II)Lclient!mq;")
	public final Interface16 method6387(@OriginalArg(0) int arg0) {
		if (arg0 * 2 > this.anInterface16_6.method7861()) {
			this.anInterface16_6.method7863(arg0);
		}
		return this.anInterface16_6;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII)Lclient!ag;")
	@Override
	public final Class11 method6191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class11_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "(Z)V")
	protected void method6388() {
		this.anInt7415 = this.anInt7414;
		this.anInt7414 = 0;
	}

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "()Z")
	@Override
	public final boolean method6208() {
		return this.aClass14Array3[3].method8624();
	}

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "()Z")
	@Override
	public final boolean method6213() {
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "D", descriptor = "(B)V")
	protected abstract void method6389();

	@OriginalMember(owner = "client!wk", name = "P", descriptor = "(I)V")
	protected abstract void method6390();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILclient!eca;)V")
	public final void method6391(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		this.method6332(arg0, arg1);
	}

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "()Z")
	@Override
	public final boolean method6206() {
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "E", descriptor = "(B)V")
	protected abstract void method6392();

	@OriginalMember(owner = "client!wk", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean517 = arg0;
		this.method6315();
	}

	@OriginalMember(owner = "client!wk", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass56_Sub2_16.method6813((float) arg0, (float) arg2, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt7403 * this.aClass56_Sub2_16.method6823((float) arg1, (float) arg0, (float) arg2) / local14);
			local58 = (int) ((float) this.anInt7389 * this.aClass56_Sub2_16.method6817((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local58 = this.anInt7408;
			local40 = this.anInt7411;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat139);
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local58 - this.aFloat131);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([FIILclient!ofa;IZ)Lclient!kt;")
	public final Interface12 method6393(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class255 arg3, @OriginalArg(5) boolean arg4) {
		return this.method6309(arg3, arg4, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "(I)V")
	@Override
	public void method6239(@OriginalArg(0) int arg0) {
		if (this.aClass226_3 != null) {
			this.aClass226_3.method5214();
		}
		this.anInt7410 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z[F)[F")
	public final float[] method6394(@OriginalArg(1) float[] arg0) {
		arg0[12] = this.aFloatArray57[3];
		arg0[4] = this.aFloatArray57[1];
		arg0[0] = this.aFloatArray57[0];
		arg0[8] = this.aFloatArray57[2];
		arg0[13] = this.aFloatArray57[7];
		arg0[2] = this.aFloatArray57[8];
		arg0[5] = this.aFloatArray57[5];
		arg0[9] = this.aFloatArray57[6];
		arg0[1] = this.aFloatArray57[4];
		arg0[7] = this.aFloatArray57[13];
		arg0[10] = this.aFloatArray57[10];
		arg0[6] = this.aFloatArray57[9];
		arg0[14] = this.aFloatArray57[11];
		arg0[3] = this.aFloatArray57[12];
		arg0[11] = this.aFloatArray57[14];
		arg0[15] = this.aFloatArray57[15];
		return arg0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method6244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!wk", name = "Q", descriptor = "(I)V")
	private void method6395() {
		this.method6325(0, this.anInterface6_17);
		this.method6333(this.aClass48_20);
		this.method6381(Static409.aClass323_3, 1, 0);
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(IZ)V")
	public final void method6396(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean526 != arg0) {
			this.aBoolean526 = arg0;
			this.method6382();
		}
	}

	@OriginalMember(owner = "client!wk", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass56_Sub2_16.method6813((float) arg0, (float) arg2, (float) arg1);
		if ((float) this.anInt7413 > local14 || local14 > (float) this.anInt7385) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt7403 * this.aClass56_Sub2_16.method6823((float) arg1, (float) arg0, (float) arg2) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt7389 * this.aClass56_Sub2_16.method6817((float) arg0, (float) arg2, (float) arg1) / (float) arg3);
		arg4[1] = (int) ((float) local77 - this.aFloat131);
		arg4[2] = (int) local14;
		arg4[0] = (int) ((float) local58 - this.aFloat139);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method6397(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!wk", name = "R", descriptor = "(I)V")
	private void method6398() {
		this.anInterface6_15 = this.method6373(false);
		this.anInterface6_15.method3123(140, 28);
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(29) Buffer local29 = this.anInterface6_15.method3120();
			if (local29 != null) {
				@Pc(36) Stream local36 = this.method6361(local29);
				if (Stream.a()) {
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(1.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(1.0F);
					local36.b(0.0F);
					local36.b(1.0F);
					local36.b(1.0F);
					local36.b(1.0F);
					local36.b(0.0F);
					local36.b(1.0F);
					local36.b(1.0F);
					local36.b(1.0F);
					local36.b(1.0F);
					local36.b(1.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(1.0F);
					local36.b(0.0F);
					local36.b(1.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(0.0F);
					local36.b(0.0F);
				} else {
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(1.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(1.0F);
					local36.a(0.0F);
					local36.a(1.0F);
					local36.a(1.0F);
					local36.a(1.0F);
					local36.a(0.0F);
					local36.a(1.0F);
					local36.a(1.0F);
					local36.a(1.0F);
					local36.a(1.0F);
					local36.a(1.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(1.0F);
					local36.a(0.0F);
					local36.a(1.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(0.0F);
					local36.a(0.0F);
				}
				local36.c();
				if (this.anInterface6_15.method3121()) {
					break;
				}
			}
		}
		this.aClass48_19 = this.method6320(new Class284[] { new Class284(new Class137[] { Static199.aClass137_1, Static199.aClass137_5, Static199.aClass137_5 }) });
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	@Override
	public final void method6190(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wk", name = "z", descriptor = "()Z")
	@Override
	public final boolean method6260() {
		return false;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!re;Z)Lclient!qda;")
	@Override
	public final Class59 method6247(@OriginalArg(0) Class301 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(24) Class59 local24;
		if (arg0.anInt8501 == 0 || arg0.anInt8497 == 0) {
			local24 = this.method6241(1, 1, 1, new int[1]);
		} else {
			@Pc(33) int[] local33 = new int[arg0.anInt8501 * arg0.anInt8497];
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			@Pc(42) int local42;
			@Pc(46) int local46;
			if (arg0.aByteArray81 == null) {
				for (local42 = 0; local42 < arg0.anInt8497; local42++) {
					for (local46 = 0; local46 < arg0.anInt8501; local46++) {
						@Pc(104) int local104 = arg0.anIntArray462[arg0.aByteArray82[local35++] & 0xFF];
						local33[local37++] = local104 == 0 ? 0 : local104 | 0xFF000000;
					}
				}
			} else {
				for (local42 = 0; local42 < arg0.anInt8497; local42++) {
					for (local46 = 0; local46 < arg0.anInt8501; local46++) {
						local33[local37++] = arg0.anIntArray462[arg0.aByteArray82[local35] & 0xFF] | arg0.aByteArray81[local35] << 24;
						local35++;
					}
				}
			}
			local24 = this.method6241(arg0.anInt8497, arg0.anInt8501, arg0.anInt8501, local33);
		}
		local24.method8062(arg0.anInt8500, arg0.anInt8499, arg0.anInt8498, arg0.anInt8496);
		return local24;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!hm;IIII)Lclient!ka;")
	@Override
	public final Class114 method6203(@OriginalArg(0) Class156 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class114_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "()Z")
	@Override
	public final boolean method6231() {
		return this.aBoolean518;
	}

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "(Z)Lclient!pr;")
	public final Class56_Sub2 method6399() {
		return this.aClass56_Sub2Array3[this.anInt7412];
	}

	@OriginalMember(owner = "client!wk", name = "S", descriptor = "(I)V")
	public final void method6400() {
		if (this.anInt7377 == 2) {
			return;
		}
		this.method6284();
		this.method6380(false);
		this.method6288(false);
		this.method6362(false);
		this.method6405(false);
		this.method6312(false, false, -2);
		this.anInt7377 = 2;
	}

	@OriginalMember(owner = "client!wk", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!wk", name = "T", descriptor = "(I)V")
	private void method6401() {
		this.aBoolean533 = false;
		if (this.aClass14_3 != null) {
			this.aClass14_3.method8622();
		}
		this.method6351();
	}

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "()I")
	@Override
	public final int method6237() {
		return this.anInt7391 - 2;
	}

	@OriginalMember(owner = "client!wk", name = "U", descriptor = "(I)Lclient!pr;")
	public final Class56_Sub2 method6402() {
		if (!this.aBoolean533) {
			this.aClass56_Sub2_20.method6826(this.aClass56_Sub2_18, this.aClass56_Sub2_15);
			this.aBoolean533 = true;
		}
		return this.aClass56_Sub2_20;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6270(@OriginalArg(0) Canvas arg0) {
		this.aCanvas11 = null;
		this.anObject13 = null;
		if (arg0 == null || this.aCanvas10 == arg0) {
			this.aCanvas11 = this.aCanvas10;
			this.anObject13 = this.anObject14;
		} else if (this.aHashtable27.containsKey(arg0)) {
			this.anObject13 = this.aHashtable27.get(arg0);
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.anObject13 == null) {
			throw new RuntimeException();
		}
		this.method6397(this.anObject13, this.aCanvas11);
		this.method6348();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	protected abstract Object method6403(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "()Lclient!eh;")
	@Override
	public final Class56 method6212() {
		return this.aClass56_Sub2_21;
	}

	@OriginalMember(owner = "client!wk", name = "F", descriptor = "(B)V")
	protected abstract void method6404();

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)V")
	@Override
	public final void method6253(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(BZ)V")
	public final void method6405(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean524) {
			this.aBoolean524 = arg0;
			this.method6315();
			this.anInt7377 &= 0xFFFFFFE0;
		}
	}
}
