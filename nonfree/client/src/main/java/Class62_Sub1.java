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

@OriginalClass("client!nd")
public abstract class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!nd", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!nd", name = "kb", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!nd", name = "Rb", descriptor = "Lclient!om;")
	protected Class222 aClass222_5;

	@OriginalMember(owner = "client!nd", name = "lc", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!nd", name = "sd", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable6;

	@OriginalMember(owner = "client!nd", name = "Bd", descriptor = "I")
	public int anInt5640;

	@OriginalMember(owner = "client!nd", name = "Rd", descriptor = "I")
	protected int anInt5654;

	@OriginalMember(owner = "client!nd", name = "Vd", descriptor = "I")
	public int anInt5658;

	@OriginalMember(owner = "client!nd", name = "ee", descriptor = "F")
	public float aFloat226;

	@OriginalMember(owner = "client!nd", name = "ke", descriptor = "I")
	protected int anInt5663;

	@OriginalMember(owner = "client!nd", name = "le", descriptor = "Z")
	public boolean aBoolean379;

	@OriginalMember(owner = "client!nd", name = "oe", descriptor = "I")
	public int anInt5664;

	@OriginalMember(owner = "client!nd", name = "pe", descriptor = "I")
	protected int anInt5665;

	@OriginalMember(owner = "client!nd", name = "qe", descriptor = "F")
	public float aFloat228;

	@OriginalMember(owner = "client!nd", name = "ye", descriptor = "F")
	private float aFloat230;

	@OriginalMember(owner = "client!nd", name = "Ae", descriptor = "[Lclient!eda;")
	protected Class78_Sub1[] aClass78_Sub1Array3;

	@OriginalMember(owner = "client!nd", name = "Ee", descriptor = "[Lclient!fd;")
	protected Class98[] aClass98Array5;

	@OriginalMember(owner = "client!nd", name = "Le", descriptor = "Z")
	protected boolean aBoolean384;

	@OriginalMember(owner = "client!nd", name = "Me", descriptor = "F")
	public float aFloat231;

	@OriginalMember(owner = "client!nd", name = "Re", descriptor = "I")
	private int anInt5674;

	@OriginalMember(owner = "client!nd", name = "Se", descriptor = "Lclient!no;")
	private Class92_Sub2 aClass92_Sub2_3;

	@OriginalMember(owner = "client!nd", name = "Te", descriptor = "I")
	protected int anInt5675;

	@OriginalMember(owner = "client!nd", name = "Ve", descriptor = "[Lclient!fd;")
	protected Class98[] aClass98Array6;

	@OriginalMember(owner = "client!nd", name = "We", descriptor = "I")
	public int anInt5677;

	@OriginalMember(owner = "client!nd", name = "Xe", descriptor = "[Lclient!sq;")
	protected Class273[] aClass273Array3;

	@OriginalMember(owner = "client!nd", name = "af", descriptor = "Z")
	protected boolean aBoolean387;

	@OriginalMember(owner = "client!nd", name = "bf", descriptor = "Lclient!dl;")
	private Class66 bf;

	@OriginalMember(owner = "client!nd", name = "gf", descriptor = "Lclient!qv;")
	public Interface12 anInterface12_3;

	@OriginalMember(owner = "client!nd", name = "hf", descriptor = "Z")
	public boolean aBoolean388;

	@OriginalMember(owner = "client!nd", name = "lf", descriptor = "F")
	private float aFloat237;

	@OriginalMember(owner = "client!nd", name = "mf", descriptor = "[Lclient!qv;")
	private Interface12[] anInterface12Array3;

	@OriginalMember(owner = "client!nd", name = "rf", descriptor = "[Lclient!uca;")
	protected Class5_Sub10[] aClass5_Sub10Array6;

	@OriginalMember(owner = "client!nd", name = "xf", descriptor = "F")
	private float aFloat240;

	@OriginalMember(owner = "client!nd", name = "yf", descriptor = "I")
	private int anInt5683;

	@OriginalMember(owner = "client!nd", name = "If", descriptor = "Z")
	public boolean aBoolean394;

	@OriginalMember(owner = "client!nd", name = "Mf", descriptor = "I")
	public int anInt5691;

	@OriginalMember(owner = "client!nd", name = "Qf", descriptor = "Lclient!rda;")
	private Class70 aClass70_3;

	@OriginalMember(owner = "client!nd", name = "Rf", descriptor = "F")
	public float aFloat242;

	@OriginalMember(owner = "client!nd", name = "Wf", descriptor = "F")
	public float aFloat243;

	@OriginalMember(owner = "client!nd", name = "Yf", descriptor = "I")
	public int anInt5698;

	@OriginalMember(owner = "client!nd", name = "Zf", descriptor = "I")
	protected int anInt5699;

	@OriginalMember(owner = "client!nd", name = "ag", descriptor = "F")
	public float aFloat244;

	@OriginalMember(owner = "client!nd", name = "bg", descriptor = "Lclient!ws;")
	public Class318 aClass318_15;

	@OriginalMember(owner = "client!nd", name = "cg", descriptor = "Lclient!oa;")
	public Class36_Sub3 aClass36_Sub3_21;

	@OriginalMember(owner = "client!nd", name = "eg", descriptor = "Lclient!sp;")
	private Interface13 anInterface13_8;

	@OriginalMember(owner = "client!nd", name = "fg", descriptor = "Lclient!up;")
	private Interface16 anInterface16_11;

	@OriginalMember(owner = "client!nd", name = "gg", descriptor = "Lclient!oa;")
	public Class36_Sub3 aClass36_Sub3_22;

	@OriginalMember(owner = "client!nd", name = "hg", descriptor = "Lclient!up;")
	private Interface16 anInterface16_12;

	@OriginalMember(owner = "client!nd", name = "ig", descriptor = "Lclient!ws;")
	private Class318 aClass318_16;

	@OriginalMember(owner = "client!nd", name = "jg", descriptor = "Lclient!oa;")
	public Class36_Sub3 aClass36_Sub3_23;

	@OriginalMember(owner = "client!nd", name = "kg", descriptor = "Lclient!oa;")
	public Class36_Sub3 aClass36_Sub3_24;

	@OriginalMember(owner = "client!nd", name = "lg", descriptor = "Lclient!ws;")
	public Class318 aClass318_17;

	@OriginalMember(owner = "client!nd", name = "mg", descriptor = "Lclient!oa;")
	public Class36_Sub3 aClass36_Sub3_25;

	@OriginalMember(owner = "client!nd", name = "ng", descriptor = "Lclient!oa;")
	public Class36_Sub3 aClass36_Sub3_26;

	@OriginalMember(owner = "client!nd", name = "og", descriptor = "Lclient!oa;")
	public Class36_Sub3 aClass36_Sub3_27;

	@OriginalMember(owner = "client!nd", name = "pg", descriptor = "Lclient!oa;")
	public Class36_Sub3 aClass36_Sub3_28;

	@OriginalMember(owner = "client!nd", name = "qg", descriptor = "Lclient!ws;")
	public Class318 aClass318_18;

	@OriginalMember(owner = "client!nd", name = "rg", descriptor = "Lclient!oa;")
	public Class36_Sub3 aClass36_Sub3_29;

	@OriginalMember(owner = "client!nd", name = "sg", descriptor = "Lclient!ws;")
	public Class318 aClass318_19;

	@OriginalMember(owner = "client!nd", name = "tg", descriptor = "Lclient!oa;")
	public Class36_Sub3 aClass36_Sub3_30;

	@OriginalMember(owner = "client!nd", name = "ug", descriptor = "Lclient!ws;")
	private Class318 aClass318_20;

	@OriginalMember(owner = "client!nd", name = "vg", descriptor = "Z")
	protected boolean aBoolean397;

	@OriginalMember(owner = "client!nd", name = "wg", descriptor = "I")
	private int anInt5700;

	@OriginalMember(owner = "client!nd", name = "od", descriptor = "Lclient!fea;")
	private final Class99 aClass99_41 = new Class99();

	@OriginalMember(owner = "client!nd", name = "Fd", descriptor = "Z")
	protected boolean aBoolean377 = true;

	@OriginalMember(owner = "client!nd", name = "xd", descriptor = "Lclient!eda;")
	protected final Class78_Sub1 aClass78_Sub1_15 = new Class78_Sub1();

	@OriginalMember(owner = "client!nd", name = "Xd", descriptor = "Lclient!eda;")
	public Class78_Sub1 aClass78_Sub1_16 = new Class78_Sub1();

	@OriginalMember(owner = "client!nd", name = "Yd", descriptor = "Lclient!eda;")
	public final Class78_Sub1 aClass78_Sub1_17 = new Class78_Sub1();

	@OriginalMember(owner = "client!nd", name = "Zd", descriptor = "Lclient!eda;")
	protected final Class78_Sub1 aClass78_Sub1_18 = new Class78_Sub1();

	@OriginalMember(owner = "client!nd", name = "ae", descriptor = "Lclient!eda;")
	private final Class78_Sub1 aClass78_Sub1_19 = new Class78_Sub1();

	@OriginalMember(owner = "client!nd", name = "be", descriptor = "Lclient!eda;")
	private final Class78_Sub1 aClass78_Sub1_20 = new Class78_Sub1();

	@OriginalMember(owner = "client!nd", name = "he", descriptor = "F")
	public float aFloat227 = 3584.0F;

	@OriginalMember(owner = "client!nd", name = "fe", descriptor = "Lclient!bg;")
	protected Class28 aClass28_9 = Static318.aClass28_10;

	@OriginalMember(owner = "client!nd", name = "je", descriptor = "I")
	public int anInt5662 = 0;

	@OriginalMember(owner = "client!nd", name = "ne", descriptor = "[F")
	private final float[] aFloatArray42 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!nd", name = "re", descriptor = "[F")
	private final float[] aFloatArray43 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!nd", name = "xe", descriptor = "Lclient!faa;")
	protected Class95 aClass95_3 = Static486.aClass95_7;

	@OriginalMember(owner = "client!nd", name = "me", descriptor = "Z")
	protected boolean aBoolean380 = false;

	@OriginalMember(owner = "client!nd", name = "ce", descriptor = "I")
	public int anInt5660 = 8;

	@OriginalMember(owner = "client!nd", name = "ge", descriptor = "I")
	protected int anInt5661 = 0;

	@OriginalMember(owner = "client!nd", name = "Be", descriptor = "I")
	private int anInt5669 = 1;

	@OriginalMember(owner = "client!nd", name = "ie", descriptor = "[F")
	public final float[] aFloatArray41 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!nd", name = "ue", descriptor = "I")
	protected int anInt5666 = 0;

	@OriginalMember(owner = "client!nd", name = "De", descriptor = "[F")
	public final float[] aFloatArray44 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!nd", name = "te", descriptor = "F")
	public float aFloat229 = 1.0F;

	@OriginalMember(owner = "client!nd", name = "Qe", descriptor = "F")
	private float aFloat233 = 3000.0F;

	@OriginalMember(owner = "client!nd", name = "Oe", descriptor = "Z")
	protected boolean aBoolean385 = true;

	@OriginalMember(owner = "client!nd", name = "Ke", descriptor = "I")
	public int anInt5672 = 0;

	@OriginalMember(owner = "client!nd", name = "kf", descriptor = "Z")
	private boolean aBoolean389 = false;

	@OriginalMember(owner = "client!nd", name = "de", descriptor = "Z")
	private boolean aBoolean378 = false;

	@OriginalMember(owner = "client!nd", name = "ve", descriptor = "I")
	protected int anInt5667 = 0;

	@OriginalMember(owner = "client!nd", name = "Je", descriptor = "I")
	private int anInt5671 = -1;

	@OriginalMember(owner = "client!nd", name = "jf", descriptor = "F")
	public float aFloat236 = -1.0F;

	@OriginalMember(owner = "client!nd", name = "Ge", descriptor = "I")
	protected int anInt5670 = 0;

	@OriginalMember(owner = "client!nd", name = "Ce", descriptor = "Z")
	protected boolean aBoolean382 = true;

	@OriginalMember(owner = "client!nd", name = "Ze", descriptor = "Z")
	protected boolean aBoolean386 = false;

	@OriginalMember(owner = "client!nd", name = "we", descriptor = "Z")
	protected boolean aBoolean381 = true;

	@OriginalMember(owner = "client!nd", name = "cf", descriptor = "F")
	public float aFloat234 = 1.0F;

	@OriginalMember(owner = "client!nd", name = "Fe", descriptor = "[Lclient!rda;")
	private final Class70[] aClass70Array3 = new Class70[10];

	@OriginalMember(owner = "client!nd", name = "vf", descriptor = "Z")
	private boolean aBoolean391 = false;

	@OriginalMember(owner = "client!nd", name = "Ue", descriptor = "I")
	public int anInt5676 = 50;

	@OriginalMember(owner = "client!nd", name = "df", descriptor = "I")
	private int anInt5679 = 0;

	@OriginalMember(owner = "client!nd", name = "Ne", descriptor = "F")
	private float aFloat232 = 1.0F;

	@OriginalMember(owner = "client!nd", name = "ff", descriptor = "I")
	private int anInt5680 = -1;

	@OriginalMember(owner = "client!nd", name = "tf", descriptor = "[F")
	protected float[] aFloatArray46 = this.aFloatArray43;

	@OriginalMember(owner = "client!nd", name = "uf", descriptor = "F")
	public float aFloat239 = 1.0F;

	@OriginalMember(owner = "client!nd", name = "Gf", descriptor = "Z")
	protected boolean aBoolean393 = true;

	@OriginalMember(owner = "client!nd", name = "pf", descriptor = "I")
	public int anInt5681 = 128;

	@OriginalMember(owner = "client!nd", name = "zf", descriptor = "[F")
	private final float[] aFloatArray48 = new float[16];

	@OriginalMember(owner = "client!nd", name = "sf", descriptor = "F")
	public float aFloat238 = 3584.0F;

	@OriginalMember(owner = "client!nd", name = "Ef", descriptor = "Z")
	protected boolean aBoolean392 = false;

	@OriginalMember(owner = "client!nd", name = "Bf", descriptor = "I")
	protected int anInt5685 = 3584;

	@OriginalMember(owner = "client!nd", name = "Df", descriptor = "F")
	public float aFloat241 = 1.0F;

	@OriginalMember(owner = "client!nd", name = "Cf", descriptor = "I")
	public int anInt5686 = 3;

	@OriginalMember(owner = "client!nd", name = "Ie", descriptor = "Z")
	protected boolean aBoolean383 = true;

	@OriginalMember(owner = "client!nd", name = "Jf", descriptor = "I")
	public int anInt5689 = -1;

	@OriginalMember(owner = "client!nd", name = "nf", descriptor = "[F")
	private final float[] aFloatArray45 = new float[16];

	@OriginalMember(owner = "client!nd", name = "qf", descriptor = "I")
	protected final int anInt5682 = 0;

	@OriginalMember(owner = "client!nd", name = "ze", descriptor = "I")
	protected int anInt5668 = 0;

	@OriginalMember(owner = "client!nd", name = "Kf", descriptor = "Z")
	private boolean aBoolean395 = false;

	@OriginalMember(owner = "client!nd", name = "Sf", descriptor = "I")
	private int anInt5694 = 0;

	@OriginalMember(owner = "client!nd", name = "Lf", descriptor = "I")
	public int anInt5690 = 0;

	@OriginalMember(owner = "client!nd", name = "wf", descriptor = "[F")
	private final float[] aFloatArray47 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!nd", name = "Pf", descriptor = "Z")
	private boolean aBoolean396 = false;

	@OriginalMember(owner = "client!nd", name = "ef", descriptor = "F")
	public float aFloat235 = -1.0F;

	@OriginalMember(owner = "client!nd", name = "of", descriptor = "Z")
	protected boolean aBoolean390 = false;

	@OriginalMember(owner = "client!nd", name = "Ff", descriptor = "I")
	protected int anInt5687 = -1;

	@OriginalMember(owner = "client!nd", name = "Of", descriptor = "I")
	private int anInt5693 = 16777215;

	@OriginalMember(owner = "client!nd", name = "Hf", descriptor = "I")
	private int anInt5688 = 0;

	@OriginalMember(owner = "client!nd", name = "Tf", descriptor = "I")
	private int anInt5695 = 0;

	@OriginalMember(owner = "client!nd", name = "Pe", descriptor = "I")
	public int anInt5673 = -1;

	@OriginalMember(owner = "client!nd", name = "Vf", descriptor = "I")
	public int anInt5697 = 512;

	@OriginalMember(owner = "client!nd", name = "Xf", descriptor = "[F")
	private final float[] aFloatArray49 = new float[16];

	@OriginalMember(owner = "client!nd", name = "Uf", descriptor = "I")
	public int anInt5696 = 512;

	@OriginalMember(owner = "client!nd", name = "Nf", descriptor = "I")
	protected final int anInt5692 = 0;

	@OriginalMember(owner = "client!nd", name = "se", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!nd", name = "dg", descriptor = "Lclient!eda;")
	private final Class78_Sub1 aClass78_Sub1_21 = new Class78_Sub1();

	@OriginalMember(owner = "client!nd", name = "cb", descriptor = "Ljava/lang/Object;")
	protected final Object anObject13;

	@OriginalMember(owner = "client!nd", name = "yc", descriptor = "Ljava/lang/Object;")
	private Object anObject14;

	@OriginalMember(owner = "client!nd", name = "Ye", descriptor = "I")
	protected final int anInt5678;

	@OriginalMember(owner = "client!nd", name = "Pc", descriptor = "Lclient!gp;")
	protected final Class117 aClass117_127;

	@OriginalMember(owner = "client!nd", name = "Oc", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas12;

	@OriginalMember(owner = "client!nd", name = "Bc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!nd", name = "Af", descriptor = "I")
	public final int anInt5684;

	@OriginalMember(owner = "client!nd", name = "Jb", descriptor = "I")
	private int anInt5554;

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
	public int anInt5509;

	@OriginalMember(owner = "client!nd", name = "Bb", descriptor = "I")
	private int anInt5546;

	@OriginalMember(owner = "client!nd", name = "pc", descriptor = "I")
	public int anInt5584;

	@OriginalMember(owner = "client!nd", name = "He", descriptor = "Lclient!li;")
	private final Class186 aClass186_3;

	@OriginalMember(owner = "client!nd", name = "qc", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!n;Lclient!gp;II)V")
	protected Class62_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) Class117 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anObject14 = this.anObject13 = arg1;
		this.anInt5678 = arg4;
		this.aClass117_127 = arg3;
		this.aCanvas11 = this.aCanvas12 = arg0;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt5684 = arg5;
		this.anInt5509 = this.anInt5554 = local307.height;
		this.anInt5584 = this.anInt5546 = local307.width;
		Static265.method4417(true, false);
		this.aClass186_3 = new Class186(this, super.anInterface8_145);
		this.aNativeInterface3 = new NativeInterface(super.anInterface8_145.method7235(), this.anInt5684);
		for (@Pc(349) int local349 = 0; local349 < super.anInterface8_145.method7235(); local349++) {
			@Pc(357) Class271 local357 = super.anInterface8_145.method7237(local349);
			if (local357 != null) {
				this.aNativeInterface3.initTextureMetrics(local349, local357.aByte80, local357.aByte83);
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7014(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas12 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.method4689(this.aHashtable6.get(arg0), arg0);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "()Z")
	@Override
	public final boolean method7028() {
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZZ)V")
	public final void method4656(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt5671) {
			if (arg0 < 0) {
				this.method4757();
				this.method4676(null);
				this.method4714(0);
				if (!this.aBoolean388) {
					this.method4710(arg1, arg2, 0, 0, 0);
				}
			} else {
				@Pc(47) Interface3 local47 = this.aClass186_3.method4800(arg0);
				@Pc(53) Class271 local53 = super.anInterface8_145.method7237(arg0);
				if (local53.aByte82 == 0 && local53.aByte81 == 0) {
					this.method4757();
				} else {
					@Pc(77) int local77 = local53.aBoolean558 ? 64 : 128;
					@Pc(81) int local81 = local77 * 50;
					@Pc(85) Class78_Sub1 local85 = this.method4705();
					local85.method2198(0.0F, (float) (local53.aByte81 * (this.anInt5698 % local81)) / (float) local81, (float) (this.anInt5698 % local81 * local53.aByte82) / (float) local81);
					this.method4741(Static272.aClass273_4);
				}
				if (!this.aBoolean388) {
					this.method4710(arg1, arg2, local53.aByte78, local53.aByte79, local53.anInt7866);
				}
				if (this.aClass70_3 == null) {
					this.method4676(local47);
					this.method4714(local53.anInt7867);
				} else {
					this.aClass70_3.method7313(local53.anInt7867, local47);
				}
			}
			this.anInt5671 = arg0;
		}
		this.anInt5674 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZB)Lclient!sp;")
	public abstract Interface13 method4657(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7050() {
		return false;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	protected abstract void method4658();

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "(I)V")
	private void method4659() {
		if (this.aClass70_3 != null) {
			this.aClass70_3.method7299();
		}
		this.method4669();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!kl;Lclient!vt;)Z")
	public abstract boolean method4660(@OriginalArg(1) Class174 arg0, @OriginalArg(2) Class306 arg1);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!dg;IB)V")
	public final void method4661(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		this.method4662(arg1, arg0);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZLclient!dg;Z)V")
	protected abstract void method4662(@OriginalArg(0) int arg0, @OriginalArg(2) Class63 arg1);

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	private void method4663() {
		if (this.aBoolean395) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray49;
		@Pc(17) float local17 = (float) this.anInt5676 - this.aFloat240;
		@Pc(25) float local25 = (float) this.anInt5685 - this.aFloat240;
		@Pc(37) float local37 = this.aFloat232 * (float) -this.anInt5672 / (float) this.anInt5697;
		@Pc(49) float local49 = this.aFloat232 * (float) -this.anInt5690 / (float) this.anInt5696;
		@Pc(64) float local64 = (float) (this.anInt5584 - this.anInt5690) * this.aFloat232 / (float) this.anInt5696;
		@Pc(79) float local79 = (float) (this.anInt5509 - this.anInt5672) * this.aFloat232 / (float) this.anInt5697;
		if (local64 == local49 || local79 == local37) {
			local9[10] = 1.0F;
			local9[14] = 0.0F;
			local9[6] = 0.0F;
			local9[13] = 0.0F;
			local9[3] = 0.0F;
			local9[1] = 0.0F;
			local9[8] = 0.0F;
			local9[7] = 0.0F;
			local9[9] = 0.0F;
			local9[2] = 0.0F;
			local9[0] = 1.0F;
			local9[15] = 1.0F;
			local9[12] = 0.0F;
			local9[5] = 1.0F;
			local9[11] = 0.0F;
			local9[4] = 0.0F;
		} else {
			local9[1] = 0.0F;
			local9[6] = 0.0F;
			local9[8] = 0.0F;
			local9[4] = 0.0F;
			local9[10] = 1.0F / (local17 - local25);
			local9[9] = 0.0F;
			local9[14] = local17 / (local17 - local25);
			local9[0] = 2.0F / (local64 - local49);
			local9[3] = 0.0F;
			local9[5] = 2.0F / (local79 - local37);
			local9[2] = 0.0F;
			local9[11] = 0.0F;
			local9[7] = 0.0F;
			local9[12] = (local49 + local64) / (-local64 + local49);
			local9[15] = 1.0F;
			local9[13] = (local79 + local37) / (local79 - local37);
		}
		this.method4772();
		this.aBoolean395 = true;
	}

	@OriginalMember(owner = "client!nd", name = "ra", descriptor = "()F")
	@Override
	public final float ra() {
		return this.aFloat240;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(Z)V")
	protected abstract void method4664();

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(Z)V")
	public final void method4665() {
		if (this.anInt5674 == 4) {
			return;
		}
		this.method4724();
		this.method4721(false);
		this.method4760(false);
		this.method4751(false);
		this.method4752(false);
		this.method4656(-2, false, false);
		this.method4754(1);
		this.method4714(0);
		this.anInt5674 = 4;
	}

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "(I)V")
	protected abstract void method4666();

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "(I)V")
	protected abstract void method4667();

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(Z)V")
	private void method4668() {
		if (Static335.aClass95_6 == this.aClass95_3) {
			return;
		}
		@Pc(12) Class95 local12 = this.aClass95_3;
		this.aClass95_3 = Static335.aClass95_6;
		if (!local12.method2412()) {
			this.method4755();
		}
		this.method4663();
		this.aFloatArray46 = this.aFloatArray49;
		this.method4768();
		this.anInt5674 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "(I)V")
	protected abstract void method4669();

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "(I)V")
	protected abstract void method4670();

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "()V")
	@Override
	public final void n() {
		if (this.aBoolean397) {
			this.aBoolean397 = false;
			this.method4788();
		}
		this.anInt5670 = 0;
		this.anInt5661 = this.anInt5584;
		this.anInt5666 = 0;
		this.anInt5668 = this.anInt5509;
		this.method4778();
	}

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "()Z")
	@Override
	public final boolean method7049() {
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method6995() {
	}

	@OriginalMember(owner = "client!nd", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V")
	public final void method4671(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt5665) {
			this.anInt5665 = arg0;
			this.method4780();
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(ZI)V")
	public final void method4672(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean385) {
			this.aBoolean385 = arg0;
			this.method4697();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!up;I)V")
	public abstract void method4673(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7022(@OriginalArg(0) boolean arg0) {
		this.aBoolean383 = arg0;
		this.method4686();
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(Z)V")
	public final void method4674() {
		if (this.anInt5674 == 16) {
			return;
		}
		this.method4668();
		this.method4721(true);
		this.method4751(true);
		this.method4752(true);
		this.method4754(1);
		this.anInt5674 = 16;
	}

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "(I)V")
	protected abstract void method4675();

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!qv;Z)V")
	public final void method4676(@OriginalArg(0) Interface12 arg0) {
		if (arg0 == this.anInterface12Array3[this.anInt5667]) {
			return;
		}
		this.anInterface12Array3[this.anInt5667] = arg0;
		if (arg0 == null) {
			this.method4675();
		} else {
			arg0.method7439();
		}
		this.anInt5674 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "(I)V")
	private void method4677() {
		if (this.aBoolean378) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray48;
		@Pc(17) float local17 = (float) (-this.anInt5690 * this.anInt5676) / (float) this.anInt5696;
		@Pc(32) float local32 = (float) (this.anInt5676 * (this.anInt5584 - this.anInt5690)) / (float) this.anInt5696;
		@Pc(43) float local43 = (float) (this.anInt5672 * this.anInt5676) / (float) this.anInt5697;
		@Pc(57) float local57 = (float) (this.anInt5676 * (this.anInt5672 - this.anInt5509)) / (float) this.anInt5697;
		if (local32 == local17 || local43 == local57) {
			local5[8] = 0.0F;
			local5[5] = 1.0F;
			local5[13] = 0.0F;
			local5[15] = 1.0F;
			local5[6] = 0.0F;
			local5[0] = 1.0F;
			local5[4] = 0.0F;
			local5[7] = 0.0F;
			local5[1] = 0.0F;
			local5[14] = 0.0F;
			local5[3] = 0.0F;
			local5[10] = 1.0F;
			local5[9] = 0.0F;
			local5[11] = 0.0F;
			local5[12] = 0.0F;
			local5[2] = 0.0F;
		} else {
			@Pc(137) float local137 = (float) this.anInt5676 * 2.0F;
			local5[8] = (local17 + local32) / (local32 - local17);
			local5[15] = 0.0F;
			local5[10] = this.aFloat230 = (float) this.anInt5685 / (float) (this.anInt5676 - this.anInt5685);
			local5[2] = 0.0F;
			local5[9] = (local57 + local43) / (-local57 + local43);
			local5[7] = 0.0F;
			local5[1] = 0.0F;
			local5[6] = 0.0F;
			local5[14] = this.aFloat237 = (float) (this.anInt5685 * this.anInt5676) / (float) (this.anInt5676 - this.anInt5685);
			local5[13] = 0.0F;
			local5[5] = local137 / (local43 - local57);
			local5[4] = 0.0F;
			local5[0] = local137 / (local32 - local17);
			local5[12] = 0.0F;
			local5[3] = 0.0F;
			local5[11] = -1.0F;
		}
		this.method4680();
		this.aBoolean378 = true;
	}

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "(I)V")
	protected abstract void method4678();

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "(I)V")
	public final void method4679() {
		this.aBoolean377 = false;
		this.method4690();
	}

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "(I)V")
	private void method4680() {
		if (this.aFloat240 == 0.0F) {
			this.aFloatArray48[14] = this.aFloat237;
			this.aFloatArray48[10] = this.aFloat230;
		} else {
			@Pc(33) float local33 = this.aFloat233 / (this.aFloat233 + this.aFloat240);
			@Pc(37) float local37 = local33 * local33;
			@Pc(52) float local52 = -this.aFloat237 * (1.0F - local33) * (1.0F - local33) / this.aFloat240;
			this.aFloatArray48[14] = local37 * this.aFloat237;
			this.aFloatArray48[10] = this.aFloat230 + local52;
		}
		this.aFloat227 = (this.aFloatArray48[14] - (float) this.anInt5685) / this.aFloatArray48[10];
	}

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "()Z")
	@Override
	public final boolean method7063() {
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt5693 != arg0;
		if (local15 || arg1 != this.aFloat236 || arg2 != this.aFloat235) {
			this.aFloat235 = arg2;
			this.anInt5693 = arg0;
			this.aFloat236 = arg1;
			if (local15) {
				this.aFloat234 = (float) (this.anInt5693 & 0xFF0000) / 1.671168E7F;
				this.aFloat239 = (float) (this.anInt5693 & 0xFF00) / 65280.0F;
				this.aFloat229 = (float) (this.anInt5693 & 0xFF) / 255.0F;
				this.method4776();
			}
			this.aNativeInterface3.setSunColour(this.aFloat234, this.aFloat239, this.aFloat229, arg1, arg2);
			this.method4658();
		}
		if (arg3 != this.aFloatArray47[0] || arg4 != this.aFloatArray47[1] || this.aFloatArray47[2] != arg5) {
			this.aFloatArray47[2] = arg5;
			this.aFloatArray47[0] = arg3;
			this.aFloatArray47[1] = arg4;
			this.aFloatArray42[2] = -arg5;
			this.aFloatArray42[1] = -arg4;
			this.aFloatArray42[0] = -arg3;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
			this.aFloatArray41[0] = arg3 * local153;
			this.aFloatArray41[1] = arg4 * local153;
			this.aFloatArray41[2] = local153 * arg5;
			this.aFloatArray44[0] = -this.aFloatArray41[0];
			this.aFloatArray44[2] = -this.aFloatArray41[2];
			this.aFloatArray44[1] = -this.aFloatArray41[1];
			this.aNativeInterface3.setSunDirection(this.aFloatArray41[0], this.aFloatArray41[1], this.aFloatArray41[2]);
			this.method4779();
			this.anInt5664 = (int) (arg3 * 256.0F / arg4);
			this.anInt5691 = (int) (arg5 * 256.0F / arg4);
		}
		this.method4717();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!pca;)V")
	private void method4681(@OriginalArg(1) int arg0, @OriginalArg(2) Class228 arg1) {
		this.method4713(this.aClass318_20);
		this.method4673(0, this.anInterface16_12);
		this.method4706(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	@Override
	public final void method6997(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([BIIIILclient!kl;)Lclient!ve;")
	public abstract Interface17 method4682(@OriginalArg(0) byte[] arg0, @OriginalArg(5) Class174 arg1);

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
	protected abstract void method4683();

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		@Pc(28) float local28 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local15 * local15)));
		@Pc(32) float local32 = local15 * local28;
		@Pc(36) float local36 = local9 * local28;
		if (!this.method4758((float) arg2 + local36, (float) arg3 + local32, 0.0F, (float) arg1, 0.0F, (float) arg0)) {
			return;
		}
		this.method4766();
		this.method4671(arg4);
		this.method4715(Static429.aClass63_6, 0);
		this.method4661(Static429.aClass63_6, 0);
		this.method4754(arg5);
		this.method4750();
		this.method4784(false);
		this.method4703();
		this.method4784(true);
		this.method4661(Static24.aClass63_4, 0);
		this.method4715(Static24.aClass63_4, 0);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public final Class131 method7051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class131_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "(I)V")
	protected final void method4684() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable6 != null && !this.aHashtable6.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable6.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method4687(local26));
			}
		}
		this.aHashtable6 = local9;
		this.method4749();
		this.method4756();
		this.bf.method1986(this);
	}

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "(IIII)V")
	@Override
	public final void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5694 = arg3;
		this.aBoolean388 = true;
		this.anInt5680 = arg2;
		this.anInt5687 = arg1;
		this.anInt5683 = arg0;
		this.method4710(false, false, 3, 0, 0);
		if (this.aClass70_3 != null) {
			this.aClass70_3.method7314();
		}
		this.method4659();
		this.method4747();
	}

	@OriginalMember(owner = "client!nd", name = "CA", descriptor = "()I")
	@Override
	public final int CA() {
		return this.anInt5685;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLclient!fd;Lclient!fd;)V")
	public final void method4685(@OriginalArg(1) Class98 arg0, @OriginalArg(2) Class98 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg0 != this.aClass98Array5[this.anInt5667]) {
			this.aClass98Array5[this.anInt5667] = arg0;
			this.method4748();
			local5 = true;
		}
		if (arg1 != this.aClass98Array6[this.anInt5667]) {
			this.aClass98Array6[this.anInt5667] = arg1;
			this.method4683();
			local5 = true;
		}
		if (local5) {
			this.anInt5674 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "(I)V")
	protected abstract void method4686();

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method4687(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "()F")
	@Override
	public final float P() {
		return this.aFloat233;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZZI)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method4688(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap5.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "()V")
	@Override
	protected void method7037() {
		if (this.aBoolean389) {
			return;
		}
		for (@Pc(13) Class5 local13 = this.aClass99_41.method2526(); local13 != null; local13 = this.aClass99_41.method2519()) {
			((Class5_Sub29_Sub1) local13).method4543();
		}
		@Pc(30) Enumeration local30 = this.aHashtable6.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method4689(this.aHashtable6.get(local36), local36);
		}
		Static135.method2550(false, true);
		this.aNativeInterface3.release();
		this.aBoolean389 = true;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method4689(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "(I)V")
	private void method4690() {
		if (this.aClass95_3 == Static296.aClass95_4) {
			@Pc(11) float local11 = this.method4774();
			this.aClass78_Sub1_15.method2192(local11, local11, 0.0F);
		}
		this.aBoolean396 = false;
		this.method4664();
		if (this.aClass70_3 != null) {
			this.aClass70_3.method7312();
		}
	}

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "(I)V")
	public final void method4691() {
		this.aClass98Array6 = new Class98[this.anInt5677];
		this.aClass273Array3 = new Class273[this.anInt5677];
		this.anInterface12Array3 = new Interface12[this.anInt5677];
		this.aClass78_Sub1Array3 = new Class78_Sub1[this.anInt5677];
		this.aClass98Array5 = new Class98[this.anInt5677];
		for (@Pc(32) int local32 = 0; local32 < this.anInt5677; local32++) {
			this.aClass98Array6[local32] = Static165.aClass98_2;
			this.aClass98Array5[local32] = Static165.aClass98_2;
			this.aClass273Array3[local32] = Static288.aClass273_6;
			this.aClass78_Sub1Array3[local32] = new Class78_Sub1();
		}
		this.aClass5_Sub10Array6 = new Class5_Sub10[this.anInt5699 - 2];
		this.anInterface12_3 = this.method4742(1, 1, Static523.aClass306_15, Static189.aClass174_6);
		this.method6991(new Class5_Sub29_Sub1(262144));
		this.aClass318_15 = this.method4782(new Class313[] { new Class313(new Class253[] { Static422.aClass253_1, Static422.aClass253_5 }) });
		this.aClass318_17 = this.method4782(new Class313[] { new Class313(new Class253[] { Static422.aClass253_1, Static422.aClass253_3 }) });
		this.aClass318_18 = this.method4782(new Class313[] { new Class313(Static422.aClass253_1), new Class313(Static422.aClass253_3), new Class313(Static422.aClass253_5), new Class313(Static422.aClass253_2) });
		this.aClass318_19 = this.method4782(new Class313[] { new Class313(Static422.aClass253_1), new Class313(Static422.aClass253_3), new Class313(Static422.aClass253_5) });
		this.aClass36_Sub3_28 = new Class36_Sub3(this, 0, 0, false, false);
		this.aClass36_Sub3_29 = new Class36_Sub3(this, 0, 0, true, true);
		this.aClass36_Sub3_23 = new Class36_Sub3(this, 0, 0, false, false);
		this.aClass36_Sub3_27 = new Class36_Sub3(this, 0, 0, true, true);
		this.aClass36_Sub3_21 = new Class36_Sub3(this, 0, 0, false, false);
		this.aClass36_Sub3_22 = new Class36_Sub3(this, 0, 0, true, true);
		this.aClass36_Sub3_24 = new Class36_Sub3(this, 0, 0, false, false);
		this.aClass36_Sub3_26 = new Class36_Sub3(this, 0, 0, true, true);
		this.aClass36_Sub3_25 = new Class36_Sub3(this, 0, 0, false, false);
		this.aClass36_Sub3_30 = new Class36_Sub3(this, 0, 0, true, true);
		this.bf = new Class66(this);
		this.anInterface13_8 = this.method4657(true);
		this.method4684();
		this.aClass222_5 = new Class222(this);
		this.aClass70Array3[1] = this.method4725(1);
		this.aClass70Array3[2] = this.method4725(2);
		this.aClass70Array3[4] = this.method4725(4);
		this.aClass70Array3[5] = this.method4725(5);
		this.aClass70Array3[6] = this.method4725(6);
		this.aClass70Array3[7] = this.method4725(7);
		this.aClass70Array3[3] = this.method4725(3);
		this.aClass70Array3[8] = this.method4725(8);
		this.aClass70Array3[9] = this.method4725(9);
		if (!this.aClass70Array3[2].method7301()) {
			this.aClass70Array3[2] = this.method4725(0);
		}
		if (!this.aClass70Array3[4].method7301()) {
			this.aClass70Array3[4] = this.aClass70Array3[2];
		}
		if (!this.aClass70Array3[8].method7301()) {
			this.aClass70Array3[8] = this.aClass70Array3[4];
		}
		if (!this.aClass70Array3[9].method7301()) {
			this.aClass70Array3[9] = this.aClass70Array3[8];
		}
		this.method4726();
		this.n();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI[IIB)Lclient!dea;")
	public final Interface3 method4692(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		return this.method4743(0, arg1, 0, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;B)Lclient!jaclib/memory/Stream;")
	public final Stream method4693(@OriginalArg(0) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ne;B)V")
	public abstract void method4694(@OriginalArg(0) Class206 arg0);

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(B)V")
	private void method4695() {
		this.aBoolean378 = false;
		this.method4677();
		if (Static310.aClass95_5 == this.aClass95_3) {
			this.method4768();
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)I")
	@Override
	public final int method7024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "()Z")
	@Override
	public final boolean method7062() {
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "(I)V")
	protected abstract void method4697();

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "(F)V")
	@Override
	public final void M(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat241) {
			this.aFloat241 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method4776();
			this.method4717();
		}
	}

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "(I)V")
	protected abstract void method4698();

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZILclient!kl;BI[F)Lclient!dea;")
	public final Interface3 method4699(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class174 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4) {
		return this.method4736(arg1, arg0, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method7009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method4774();
		this.method4766();
		this.method4671(arg4);
		this.method4715(Static429.aClass63_6, 0);
		this.method4661(Static429.aClass63_6, 0);
		this.method4754(arg5);
		this.aClass78_Sub1_15.method2189((float) (arg2 - 1), (float) (arg3 - 1), 1.0F);
		this.aClass78_Sub1_15.method2192((float) arg0 - local7, (float) arg1 - local7, 0.0F);
		this.method4679();
		this.method4784(false);
		this.method4681(4, Static41.aClass228_3);
		this.method4784(true);
		this.method4661(Static24.aClass63_4, 0);
		this.method4715(Static24.aClass63_4, 0);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V")
	public abstract void method4700(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([Lclient!r;Lclient!sh;Lclient!m;[Lclient!paa;I)V")
	@Override
	public final void method7008(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class30_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method7019(arg0, arg2, arg3, arg4);
		this.method7002(arg1);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B[F)[F")
	public final float[] method4701(@OriginalArg(1) float[] arg0) {
		arg0[12] = this.aFloatArray46[3];
		arg0[8] = this.aFloatArray46[2];
		arg0[0] = this.aFloatArray46[0];
		arg0[4] = this.aFloatArray46[1];
		arg0[13] = this.aFloatArray46[7];
		arg0[9] = this.aFloatArray46[6];
		arg0[1] = this.aFloatArray46[4];
		arg0[2] = this.aFloatArray46[8];
		arg0[5] = this.aFloatArray46[5];
		arg0[10] = this.aFloatArray46[10];
		arg0[7] = this.aFloatArray46[13];
		arg0[6] = this.aFloatArray46[9];
		arg0[14] = this.aFloatArray46[11];
		arg0[3] = this.aFloatArray46[12];
		arg0[15] = this.aFloatArray46[15];
		arg0[11] = this.aFloatArray46[14];
		return arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)Lclient!up;")
	public abstract Interface16 method4702(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "(I)V")
	private void method4703() {
		this.method4713(this.aClass318_16);
		this.method4673(0, this.anInterface16_11);
		this.method4706(0, Static357.aClass228_6, 1);
	}

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "(I)V")
	public final void method4704() {
		if (this.anInt5674 == 8) {
			return;
		}
		this.method4738();
		this.method4721(true);
		this.method4751(true);
		this.method4752(true);
		this.method4754(1);
		this.anInt5674 = 8;
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(B)Lclient!eda;")
	public final Class78_Sub1 method4705() {
		return this.aClass78_Sub1Array3[this.anInt5667];
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!pca;II)V")
	public abstract void method4706(@OriginalArg(0) int arg0, @OriginalArg(1) Class228 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "()Z")
	@Override
	public final boolean method7047() {
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "()Z")
	@Override
	public final boolean method7007() {
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7026(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas12 == arg0) {
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
			@Pc(53) Object local53 = this.method4687(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!nd", name = "la", descriptor = "(FF)V")
	@Override
	public final void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat233 && arg1 == this.aFloat240) {
			return;
		}
		this.aFloat233 = arg0;
		this.aFloat240 = arg1;
		this.method4772();
		this.method4680();
		this.method4728();
		this.method4695();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZI[BLclient!kl;)Lclient!dea;")
	public final Interface3 method4707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class174 arg4) {
		return this.method4762(arg2, arg1, arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "(I)V")
	protected abstract void method4708();

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "(Z)V")
	public final void method4709() {
		if (this.aClass95_3 == Static486.aClass95_7) {
			return;
		}
		@Pc(6) Class95 local6 = this.aClass95_3;
		this.aClass95_3 = Static486.aClass95_7;
		if (local6.method2412()) {
			this.method4755();
		}
		this.aFloatArray46 = this.aFloatArray43;
		this.anInt5674 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!nd", name = "JA", descriptor = "(IIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean388) {
			throw new RuntimeException("");
		}
		if (arg0 != this.anInt5683) {
			this.anInt5683 = arg0;
			if (this.aClass70_3 != null) {
				this.aClass70_3.method7314();
			}
		}
		this.anInt5680 = arg2;
		this.anInt5694 = arg3;
		this.anInt5687 = arg1;
		this.method4659();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZZIIIB)V")
	private void method4710(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) boolean local8 = arg1 & this.method7044();
		if (!local8 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			arg2 = 2;
			arg4 = 1;
			arg3 = 0;
		}
		if (arg2 != 0 && arg0) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt5695 != arg2) {
			if (this.anInt5695 != 0) {
				this.aClass70Array3[Integer.MAX_VALUE & this.anInt5695].method7306();
			}
			if (arg2 == 0) {
				this.aClass70_3 = null;
			} else {
				this.aClass70_3 = this.aClass70Array3[arg2 & Integer.MAX_VALUE];
				this.aClass70_3.method7311(arg0);
				this.aClass70_3.method7303(arg0);
				this.aClass70_3.method7300(arg4, arg3);
			}
			this.anInt5688 = arg4;
			this.anInt5695 = arg2;
			this.anInt5679 = arg3;
		} else if (this.anInt5695 != 0) {
			this.aClass70Array3[Integer.MAX_VALUE & this.anInt5695].method7303(arg0);
			if (this.anInt5679 != arg3 || arg4 != this.anInt5688) {
				this.aClass70Array3[this.anInt5695 & Integer.MAX_VALUE].method7300(arg4, arg3);
				this.anInt5679 = arg3;
				this.anInt5688 = arg4;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
	@Override
	public void method7048(@OriginalArg(0) int arg0) {
		this.aClass186_3.method4798();
		this.anInt5698 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(B)I")
	public final int method4711() {
		return this.anInt5683;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
	@Override
	public final int method7017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(B)V")
	protected abstract void method4712();

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)V")
	@Override
	public final void method7058(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public final void method6991(@OriginalArg(0) Class5_Sub29 arg0) {
		this.aNativeHeap5 = ((Class5_Sub29_Sub1) arg0).aNativeHeap4;
		this.aNativeHeapBuffer8 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ws;B)V")
	public abstract void method4713(@OriginalArg(0) Class318 arg0);

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(II)V")
	public final void method4714(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method4685(Static148.aClass98_1, Static148.aClass98_1);
		} else if (arg0 == 0) {
			this.method4685(Static165.aClass98_2, Static165.aClass98_2);
		} else if (arg0 == 2) {
			this.method4685(Static395.aClass98_5, Static148.aClass98_1);
		} else if (arg0 == 3) {
			this.method4685(Static344.aClass98_4, Static165.aClass98_2);
		} else if (arg0 == 4) {
			this.method4685(Static283.aClass98_3, Static283.aClass98_3);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!dg;I)V")
	public final void method4715(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1) {
		this.method4732(false, false, arg0, arg1);
	}

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "(I)V")
	protected abstract void method4716();

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!paa;I)V")
	@Override
	public final void method7019(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) Class30_Sub6[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method7360(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7000() {
		return false;
	}

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "(I)V")
	protected abstract void method4717();

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "(I)V")
	public final void method4718() {
		this.method4709();
		this.method4768();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public final void method7057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class87 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "(B)V")
	private void method4719() {
		this.method4729();
		if (this.aClass70_3 != null) {
			this.aClass70_3.method7307();
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt5676;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()Lclient!m;")
	@Override
	public final Class78 method6994() {
		return this.aClass78_Sub1_21;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIII)V")
	@Override
	public final void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5690 = arg0;
		this.anInt5672 = arg1;
		this.anInt5696 = arg2;
		this.anInt5697 = arg3;
		this.method4728();
		this.method4695();
		this.method4709();
		this.method4778();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method4720(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(ZI)V")
	public final void method4721(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean387 != arg0) {
			this.aBoolean387 = arg0;
			this.method4747();
			this.anInt5674 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(FB)V")
	public final void method4722(@OriginalArg(0) float arg0) {
		if (this.aFloat232 != arg0) {
			this.aFloat232 = arg0;
			this.method4728();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)V")
	public final void method4723(@OriginalArg(1) byte arg0) {
		this.method4671(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "(IIIII)V")
	@Override
	protected final void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "(I)V")
	private void method4724() {
		if (Static296.aClass95_4 == this.aClass95_3) {
			return;
		}
		@Pc(6) Class95 local6 = this.aClass95_3;
		this.aClass95_3 = Static296.aClass95_4;
		if (local6.method2412()) {
			this.method4755();
		}
		this.method4763();
		this.aFloatArray46 = this.aFloatArray45;
		this.method4768();
		this.anInt5674 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(IIIIII)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4766();
		this.method4671(arg4);
		this.method4715(Static429.aClass63_6, 0);
		this.method4661(Static429.aClass63_6, 0);
		this.method4754(arg5);
		this.aClass78_Sub1_15.method2189((float) arg2, (float) arg3, 1.0F);
		this.aClass78_Sub1_15.TA(arg0, arg1, 0);
		this.method4679();
		this.method4784(false);
		this.method4740();
		this.method4784(true);
		this.method4661(Static24.aClass63_4, 0);
		this.method4715(Static24.aClass63_4, 0);
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(II)Lclient!rda;")
	protected Class70 method4725(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class70_Sub6(this);
		} else if (arg0 == 1) {
			return new Class70_Sub5(this);
		} else if (arg0 == 2) {
			return new Class70_Sub2(this, this.aClass222_5);
		} else if (arg0 == 7) {
			return new Class70_Sub9(this);
		} else {
			return new Class70_Sub7(this);
		}
	}

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "(B)V")
	protected void method4726() {
		this.method4775();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!pca;IIILclient!sp;II)V")
	public abstract void method4727(@OriginalArg(0) Class228 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface13 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "(B)V")
	private void method4728() {
		this.aBoolean395 = false;
		if (Static335.aClass95_6 == this.aClass95_3) {
			this.method4663();
			this.method4768();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ld;IIII)Lclient!r;")
	@Override
	public final Class36 method7012(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class36_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!kk;)V")
	@Override
	public final void method7067(@OriginalArg(0) Class92 arg0) {
		this.aClass92_Sub2_3 = (Class92_Sub2) arg0;
	}

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "(IIII)V")
	@Override
	public final void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 > this.anInt5666) {
			this.anInt5666 = arg1;
		}
		if (this.anInt5668 > arg3) {
			this.anInt5668 = arg3;
		}
		if (this.anInt5661 > arg2) {
			this.anInt5661 = arg2;
		}
		if (arg0 > this.anInt5670) {
			this.anInt5670 = arg0;
		}
		if (this.anInt5670 <= 0 && this.anInt5584 <= this.anInt5661 && this.anInt5666 <= 0 && this.anInt5509 <= this.anInt5668) {
			this.n();
			return;
		}
		if (!this.aBoolean397) {
			this.aBoolean397 = true;
			this.method4788();
		}
		this.method4712();
		this.method4778();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!r;Lclient!sh;Lclient!m;Lclient!paa;I)V")
	@Override
	public final void method7066(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class30_Sub6 arg3) {
		arg0.method7360(arg2, arg3, 0);
		this.method7002(arg1);
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7038(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas12 == arg0) {
			local5 = this.anObject14;
		} else if (this.aHashtable6.containsKey(arg0)) {
			local5 = this.aHashtable6.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method4720(local5, arg0);
		if (this.aCanvas11 == arg0) {
			this.method4771();
		}
	}

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "(I)V")
	protected abstract void method4729();

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "(I)Lclient!eda;")
	public final Class78_Sub1 method4730() {
		return this.aClass78_Sub1_18;
	}

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public final void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class87_Sub2 local6 = (Class87_Sub2) arg1;
		@Pc(9) Interface3 local9 = local6.anInterface3_2;
		this.method4745();
		this.method4676(local9);
		this.method4754(1);
		this.method4685(Static148.aClass98_1, Static148.aClass98_1);
		this.method4715(Static429.aClass63_6, 0);
		this.method4671(arg0);
		this.aClass78_Sub1_15.method2189((float) this.anInt5584, (float) this.anInt5509, 0.0F);
		this.method4679();
		this.aClass78_Sub1Array3[0].method2189(local9.method7449((float) this.anInt5584), local9.method7456((float) this.anInt5509), 1.0F);
		this.aClass78_Sub1Array3[0].method2192(local9.method7449((float) -arg2), local9.method7456((float) -arg3), 0.0F);
		this.aClass273Array3[0] = Static272.aClass273_4;
		this.method4719();
		this.method4740();
		this.method4757();
		this.method4715(Static24.aClass63_4, 0);
	}

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "(I)I")
	public final int method4731() {
		return this.anInt5694;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZZILclient!dg;I)V")
	public abstract void method4732(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class63 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "(I)I")
	public final int method4733() {
		return this.anInt5680;
	}

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "(I)V")
	protected final void method4734() {
		@Pc(9) Enumeration local9 = this.aHashtable6.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method4689(this.aHashtable6.get(local15), local15);
		}
		this.anInterface16_12.method3493();
		this.anInterface16_11.method3493();
		this.aClass36_Sub3_29.method5356();
		this.aClass36_Sub3_27.method5356();
		this.aClass36_Sub3_22.method5356();
		this.aClass36_Sub3_26.method5356();
		this.aClass36_Sub3_30.method5356();
		this.bf.method1987();
		this.anInterface13_8.method3493();
	}

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "(I)V")
	protected void method4735() {
		this.anInt5675 = this.anInt5663;
		this.anInt5663 = 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIZLclient!kl;[FII)Lclient!dea;")
	protected abstract Interface3 method4736(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) Class174 arg2, @OriginalArg(5) float[] arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIF)Lclient!uca;")
	@Override
	public final Class5_Sub10 method6993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub10_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nd", name = "O", descriptor = "(I)Lclient!uba;")
	public final Interface15 method4737() {
		return this.aClass92_Sub2_3 == null ? null : this.aClass92_Sub2_3.method5138();
	}

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "(I)V")
	private void method4738() {
		if (Static310.aClass95_5 == this.aClass95_3) {
			return;
		}
		@Pc(6) Class95 local6 = this.aClass95_3;
		this.aClass95_3 = Static310.aClass95_5;
		if (!local6.method2412()) {
			this.method4755();
		}
		this.method4677();
		this.aFloatArray46 = this.aFloatArray48;
		this.method4768();
		this.anInt5674 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!rl;[Lclient!fba;Z)Lclient!ra;")
	@Override
	public final Class13 method7054(@OriginalArg(0) Class256 arg0, @OriginalArg(1) Class96[] arg1) {
		return new Class13_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "()Z")
	@Override
	public final boolean method7005() {
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	@Override
	public final void method7001(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!vt;Lclient!kl;)Z")
	public abstract boolean method4739(@OriginalArg(1) Class306 arg0, @OriginalArg(2) Class174 arg1);

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "(B)V")
	public final void method4740() {
		this.method4681(2, Static147.aClass228_4);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!sq;B)V")
	public final void method4741(@OriginalArg(0) Class273 arg0) {
		this.aClass273Array3[this.anInt5667] = arg0;
		this.method4719();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZIILclient!vt;Lclient!kl;)Lclient!dea;")
	public abstract Interface3 method4742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class306 arg2, @OriginalArg(4) Class174 arg3);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III[IIIZ)Lclient!dea;")
	public abstract Interface3 method4743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "()Lclient!m;")
	@Override
	public final Class78 method7011() {
		return new Class78_Sub1();
	}

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "(I)Lclient!eda;")
	public final Class78_Sub1 method4744() {
		return this.aClass78_Sub1_15;
	}

	@OriginalMember(owner = "client!nd", name = "R", descriptor = "(I)V")
	public final void method4745() {
		if (this.anInt5674 == 2) {
			return;
		}
		this.method4724();
		this.method4721(false);
		this.method4760(false);
		this.method4751(false);
		this.method4752(false);
		this.method4656(-2, false, false);
		this.anInt5674 = 2;
	}

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "(III)V")
	@Override
	public final void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5673 == arg0 && this.anInt5689 == arg1 && arg2 == this.anInt5662) {
			return;
		}
		this.anInt5673 = arg0;
		this.anInt5662 = arg2;
		this.anInt5689 = arg1;
		if (this.aBoolean388) {
			return;
		}
		this.method4659();
		this.method4747();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!eda;I)V")
	public final void method4746(@OriginalArg(0) Class78_Sub1 arg0) {
		this.aClass78_Sub1_15.EA(arg0);
		this.aBoolean377 = false;
		this.method4690();
	}

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "(B)V")
	protected abstract void method4747();

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "(B)V")
	protected abstract void method4748();

	@OriginalMember(owner = "client!nd", name = "S", descriptor = "(I)V")
	private void method4749() {
		this.anInterface16_12 = this.method4702(false);
		this.anInterface16_12.method3464(28, 140);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(36) Buffer local36 = this.anInterface16_12.method3487();
			if (local36 != null) {
				@Pc(43) Stream local43 = this.method4693(local36);
				if (Stream.c()) {
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
				} else {
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
				}
				local43.b();
				if (this.anInterface16_12.method3492()) {
					break;
				}
			}
		}
		this.aClass318_20 = this.method4782(new Class313[] { new Class313(new Class253[] { Static422.aClass253_1, Static422.aClass253_5, Static422.aClass253_5 }) });
	}

	@OriginalMember(owner = "client!nd", name = "T", descriptor = "(I)V")
	public final void method4750() {
		this.aClass78_Sub1_15.ha();
		this.aBoolean377 = true;
		this.method4690();
	}

	@OriginalMember(owner = "client!nd", name = "UA", descriptor = "(IIIII)V")
	@Override
	public final void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7036(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(ZB)V")
	public final void method4751(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean390) {
			this.aBoolean390 = arg0;
			this.method4698();
			this.anInt5674 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public final boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass78_Sub1_16.method2200((float) arg0, (float) arg2, (float) arg1);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass78_Sub1_16.method2200((float) arg3, (float) arg5, (float) arg4);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if (local14 < (float) this.anInt5676 && (float) this.anInt5676 > local31 || !(!((float) this.anInt5685 < local14) || !(local31 > (float) this.anInt5685))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt5696 * this.aClass78_Sub1_16.method2184((float) arg0, (float) arg1, (float) arg2) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt5696 * this.aClass78_Sub1_16.method2184((float) arg3, (float) arg4, (float) arg5) / local31);
		if (this.aFloat228 > (float) local81 && this.aFloat228 > (float) local99 || this.aFloat244 < (float) local81 && this.aFloat244 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt5697 * this.aClass78_Sub1_16.method2180((float) arg2, (float) arg0, (float) arg1) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt5697 * this.aClass78_Sub1_16.method2180((float) arg5, (float) arg3, (float) arg4) / local31);
			return (!((float) local143 < this.aFloat242) || !(this.aFloat242 > (float) local161)) && (!(this.aFloat243 < (float) local143) || !((float) local161 > this.aFloat243));
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public final void method7068(@OriginalArg(0) Class78 arg0) {
		this.aClass78_Sub1_16 = (Class78_Sub1) arg0;
		this.aClass78_Sub1_18.EA(this.aClass78_Sub1_16);
		this.aClass78_Sub1_18.method2186();
		this.aClass78_Sub1_19.method2190(this.aClass78_Sub1_18);
		this.aClass78_Sub1_17.method2190(this.aClass78_Sub1_16);
		if (this.aClass95_3.method2412()) {
			this.method4755();
		}
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(ZI)V")
	public final void method4752(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean380) {
			this.aBoolean380 = arg0;
			this.method4686();
			this.anInt5674 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V")
	@Override
	public final void method7060(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method4753(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(II)V")
	public final void method4754(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt5669) {
			return;
		}
		@Pc(28) Class28 local28;
		@Pc(32) boolean local32;
		@Pc(30) boolean local30;
		if (arg0 == 1) {
			local30 = true;
			local28 = Static318.aClass28_10;
			local32 = true;
		} else if (arg0 == 2) {
			local28 = Static193.aClass28_7;
			local30 = false;
			local32 = true;
		} else if (arg0 == 128) {
			local30 = true;
			local28 = Static4.aClass28_12;
			local32 = true;
		} else {
			local28 = Static75.aClass28_2;
			local30 = false;
			local32 = false;
		}
		if (this.aBoolean382 != local30) {
			this.aBoolean382 = local30;
			this.method4708();
		}
		if (this.aBoolean381 != local32) {
			this.aBoolean381 = local32;
			this.method4716();
		}
		if (this.aClass28_9 != local28) {
			this.aClass28_9 = local28;
			this.method4670();
		}
		this.anInt5669 = arg0;
		this.anInt5674 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "(Z)V")
	private void method4755() {
		this.aBoolean396 = false;
		if (this.aClass70_3 != null) {
			this.aClass70_3.method7308();
		}
		this.method4666();
	}

	@OriginalMember(owner = "client!nd", name = "U", descriptor = "(I)V")
	private void method4756() {
		this.anInterface16_11 = this.method4702(true);
		this.anInterface16_11.method3464(12, 24);
		this.aClass318_16 = this.method4782(new Class313[] { new Class313(Static422.aClass253_1) });
	}

	@OriginalMember(owner = "client!nd", name = "V", descriptor = "(I)V")
	public final void method4757() {
		if (Static288.aClass273_6 != this.aClass273Array3[this.anInt5667]) {
			this.aClass273Array3[this.anInt5667] = Static288.aClass273_6;
			this.aClass78_Sub1Array3[this.anInt5667].ha();
			this.method4719();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public final Class25 method7003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class25_Sub3 local11 = new Class25_Sub3(this, arg2, arg3, arg4);
		local11.P(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(FFFIFFF)Z")
	private boolean method4758(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface16_11.method3487();
		if (local9 == null) {
			return false;
		}
		@Pc(29) Stream local29 = this.method4693(local9);
		if (Stream.c()) {
			local29.b(arg5);
			local29.b(arg3);
			local29.b(arg4);
			local29.b(arg0);
			local29.b(arg1);
			local29.b(arg2);
		} else {
			local29.a(arg5);
			local29.a(arg3);
			local29.a(arg4);
			local29.a(arg0);
			local29.a(arg1);
			local29.a(arg2);
		}
		local29.b();
		return this.anInterface16_11.method3492();
	}

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "()Z")
	@Override
	public final boolean method7044() {
		return this.aClass70Array3[3].method7301();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BZ)V")
	public final void method4759(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean392 != arg0) {
			this.aBoolean392 = arg0;
			this.method4667();
		}
	}

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "()Z")
	@Override
	public final boolean method7023() {
		return this.aBoolean384;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(BZ)V")
	public final void method4760(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean386 != arg0) {
			this.aBoolean386 = arg0;
			this.method4667();
			this.anInt5674 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "()I")
	@Override
	public final int method7034() {
		return this.anInt5699 - 2;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[[IBZ)Lclient!uba;")
	public abstract Interface15 method4761(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "([I)V")
	@Override
	public final void d(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5670;
		arg0[2] = this.anInt5661;
		arg0[3] = this.anInt5668;
		arg0[1] = this.anInt5666;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(IIIIII)Lclient!kk;")
	@Override
	public final Class92 method7046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class92_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZIIILclient!kl;[BI)Lclient!dea;")
	protected abstract Interface3 method4762(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class174 arg3, @OriginalArg(6) byte[] arg4);

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "(I)V")
	private void method4763() {
		if (this.aBoolean391) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray45;
		this.aBoolean391 = true;
		if (this.anInt5584 != 0 && this.anInt5509 != 0) {
			local5[0] = 2.0F / (float) this.anInt5584;
			local5[3] = 0.0F;
			local5[2] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt5509;
			local5[12] = -1.0F;
			local5[9] = 0.0F;
			local5[8] = 0.0F;
			local5[1] = 0.0F;
			local5[6] = 0.0F;
			local5[10] = 0.5F;
			local5[15] = 1.0F;
			local5[14] = 0.5F;
			local5[7] = 0.0F;
			local5[4] = 0.0F;
			local5[11] = 0.0F;
			local5[13] = 1.0F;
			return;
		}
		local5[11] = 0.0F;
		local5[10] = 1.0F;
		local5[1] = 0.0F;
		local5[3] = 0.0F;
		local5[15] = 1.0F;
		local5[5] = 1.0F;
		local5[4] = 0.0F;
		local5[14] = 0.0F;
		local5[12] = 0.0F;
		local5[13] = 0.0F;
		local5[2] = 0.0F;
		local5[7] = 0.0F;
		local5[9] = 0.0F;
		local5[8] = 0.0F;
		local5[0] = 1.0F;
		local5[6] = 0.0F;
	}

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "(I)Lclient!eda;")
	public final Class78_Sub1 method4764() {
		return this.aClass78_Sub1Array3[this.anInt5667];
	}

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "()V")
	@Override
	public final void method7025() {
		this.aClass186_3.method4799();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	@Override
	public final void method6996(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt5681 = arg0;
		this.aClass186_3.method4799();
	}

	@OriginalMember(owner = "client!nd", name = "Y", descriptor = "(I)Lclient!eda;")
	public final Class78_Sub1 method4765() {
		return this.aClass78_Sub1_19;
	}

	@OriginalMember(owner = "client!nd", name = "xa", descriptor = "()V")
	@Override
	public final void xa() {
		this.aBoolean388 = false;
		this.method4710(false, false, 0, 0, 0);
		this.method4659();
		this.method4747();
	}

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7020() {
		return false;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public final Class87 method7006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static131.method2419(arg1, arg0, this, arg2, arg3);
	}

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "(B)V")
	private void method4766() {
		if (this.anInt5674 == 1) {
			return;
		}
		this.method4724();
		this.method4721(false);
		this.method4760(false);
		this.method4751(false);
		this.method4752(false);
		this.method4656(-2, false, false);
		this.method4714(1);
		this.method4676(this.anInterface12_3);
		this.anInt5674 = 1;
	}

	@OriginalMember(owner = "client!nd", name = "bb", descriptor = "(I)V")
	private void method4768() {
		this.method4777();
		if (this.aClass70_3 != null) {
			this.aClass70_3.method7304();
		}
	}

	@OriginalMember(owner = "client!nd", name = "cb", descriptor = "(I)V")
	protected abstract void method4769();

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(II)Lclient!sp;")
	public final Interface13 method4770(@OriginalArg(0) int arg0) {
		if (this.anInterface13_8.method3485() < arg0 * 2) {
			this.anInterface13_8.method3488(arg0);
		}
		return this.anInterface13_8;
	}

	@OriginalMember(owner = "client!nd", name = "db", descriptor = "(I)V")
	private void method4771() {
		if (this.aCanvas11 == null) {
			this.anInt5546 = this.anInt5554 = 1;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas11.getSize();
			this.anInt5546 = local6.width;
			this.anInt5554 = local6.height;
		}
		this.anInt5509 = this.anInt5554;
		this.anInt5584 = this.anInt5546;
		this.method4786();
		this.method4695();
		this.method4728();
		this.method4769();
		this.method4778();
		this.method4709();
		this.n();
	}

	@OriginalMember(owner = "client!nd", name = "eb", descriptor = "(I)V")
	private void method4772() {
		this.aFloat238 = (float) this.anInt5685 - this.aFloat240;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(BZ)V")
	public final void method4773(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean393 != arg0) {
			this.aBoolean393 = arg0;
			this.method4747();
		}
	}

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "(IIII)V")
	@Override
	public final void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5661 = this.anInt5584 >= arg2 ? arg2 : 0;
		this.anInt5668 = arg3 <= this.anInt5584 ? arg3 : 0;
		this.anInt5666 = arg1 >= 0 ? arg1 : 0;
		this.anInt5670 = arg0 < 0 ? 0 : arg0;
		if (this.anInt5670 <= 0 && this.anInt5661 >= this.anInt5584 && this.anInt5666 <= 0 && this.anInt5509 <= this.anInt5668) {
			this.n();
			return;
		}
		if (!this.aBoolean397) {
			this.aBoolean397 = true;
			this.method4788();
		}
		this.method4712();
		this.method4778();
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7036(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!nd", name = "fb", descriptor = "(I)F")
	protected abstract float method4774();

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public final Class25 method7021(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class25_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7015(@OriginalArg(0) Canvas arg0) {
		this.aCanvas11 = null;
		this.anObject14 = null;
		if (arg0 == null || this.aCanvas12 == arg0) {
			this.aCanvas11 = this.aCanvas12;
			this.anObject14 = this.anObject13;
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.anObject14 = this.aHashtable6.get(arg0);
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.anObject14 == null) {
			throw new RuntimeException();
		}
		this.method4753(this.aCanvas11, this.anObject14);
		this.method4771();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!sh;)V")
	@Override
	public final void method7002(@OriginalArg(0) Class267 arg0) {
		this.bf.method1984(arg0, this);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!fba;Z)Lclient!ha;")
	@Override
	public final Class25 method6998(@OriginalArg(0) Class96 arg0) {
		@Pc(23) Class25 local23;
		if (arg0.anInt2722 == 0 || arg0.anInt2718 == 0) {
			local23 = this.method7021(new int[1], 1, 1, 1);
		} else {
			@Pc(32) int[] local32 = new int[arg0.anInt2718 * arg0.anInt2722];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			@Pc(41) int local41;
			@Pc(45) int local45;
			if (arg0.aByteArray41 == null) {
				for (local41 = 0; local41 < arg0.anInt2718; local41++) {
					for (local45 = 0; local45 < arg0.anInt2722; local45++) {
						@Pc(107) int local107 = arg0.anIntArray229[arg0.aByteArray42[local34++] & 0xFF];
						local32[local36++] = local107 == 0 ? 0 : local107 | 0xFF000000;
					}
				}
			} else {
				for (local41 = 0; local41 < arg0.anInt2718; local41++) {
					for (local45 = 0; local45 < arg0.anInt2722; local45++) {
						local32[local36++] = arg0.anIntArray229[arg0.aByteArray42[local34] & 0xFF] | arg0.aByteArray41[local34] << 24;
						local34++;
					}
				}
			}
			local23 = this.method7021(local32, arg0.anInt2722, arg0.anInt2722, arg0.anInt2718);
		}
		local23.KA(arg0.anInt2719, arg0.anInt2720, arg0.anInt2723, arg0.anInt2721);
		return local23;
	}

	@OriginalMember(owner = "client!nd", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt5658 + this.anInt5640 + this.anInt5654;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[Lclient!uca;)V")
	@Override
	public final void method7059(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub10[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass5_Sub10Array6[local3] = arg1[local3];
		}
		this.anInt5663 = arg0;
		if (this.aClass95_3.method2412()) {
			this.method4735();
		}
	}

	@OriginalMember(owner = "client!nd", name = "gb", descriptor = "(I)V")
	private void method4775() {
		this.method4776();
		this.method4658();
		this.method4667();
		this.method4735();
		this.method4779();
		this.method4717();
		this.method4697();
		this.method4698();
		this.method4686();
		this.method4747();
		this.method4669();
		this.method4716();
		this.method4670();
		this.method4708();
		for (@Pc(56) int local56 = this.anInt5677 - 1; local56 >= 0; local56--) {
			this.method4785(local56);
			this.method4748();
			this.method4683();
			this.method4757();
		}
		this.method4780();
		this.method4769();
		this.method4777();
		this.method4664();
		this.method4666();
	}

	@OriginalMember(owner = "client!nd", name = "hb", descriptor = "(I)V")
	protected abstract void method4776();

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "(Z)V")
	protected abstract void method4777();

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "(Z)V")
	private void method4778() {
		this.aFloat243 = this.anInt5668 - this.anInt5672;
		this.aFloat228 = this.anInt5670 - this.anInt5690;
		this.aFloat242 = this.anInt5666 - this.anInt5672;
		this.aFloat244 = this.anInt5661 - this.anInt5690;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)Lclient!u;")
	@Override
	public final Class5_Sub29 method7010(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub29_Sub1 local8 = new Class5_Sub29_Sub1(arg0);
		this.aClass99_41.method2513(local8);
		return local8;
	}

	@OriginalMember(owner = "client!nd", name = "ib", descriptor = "(I)V")
	public abstract void method4779();

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "(B)V")
	protected abstract void method4780();

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "(B)I")
	public final int method4781() {
		return this.anInt5667;
	}

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "()Z")
	@Override
	public final boolean method7053() {
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "IA", descriptor = "(III[I)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass78_Sub1_16.method2200((float) arg0, (float) arg2, (float) arg1);
		if ((float) this.anInt5676 > local14 || local14 > (float) this.anInt5685) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(57) int local57 = (int) ((float) this.anInt5696 * this.aClass78_Sub1_16.method2184((float) arg0, (float) arg1, (float) arg2) / local14);
		@Pc(75) int local75 = (int) ((float) this.anInt5697 * this.aClass78_Sub1_16.method2180((float) arg2, (float) arg0, (float) arg1) / local14);
		if (this.aFloat228 <= (float) local57 && (float) local57 <= this.aFloat244 && (float) local75 >= this.aFloat242 && this.aFloat243 >= (float) local75) {
			arg3[1] = (int) ((float) local75 - this.aFloat242);
			arg3[0] = (int) ((float) local57 - this.aFloat228);
			arg3[2] = (int) local14;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z[Lclient!wg;)Lclient!ws;")
	public abstract Class318 method4782(@OriginalArg(1) Class313[] arg0);

	@OriginalMember(owner = "client!nd", name = "jb", descriptor = "(I)Lclient!eda;")
	public final Class78_Sub1 method4783() {
		if (!this.aBoolean396) {
			this.aClass78_Sub1_20.method2197(this.aClass78_Sub1_18, this.aClass78_Sub1_15);
			this.aBoolean396 = true;
		}
		return this.aClass78_Sub1_20;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IZ)V")
	public abstract void method4784(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IB)V")
	public final void method4785(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt5667) {
			this.anInt5667 = arg0;
			this.method4678();
		}
	}

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "(I)V")
	@Override
	public final void L(@OriginalArg(0) int arg0) {
		this.anInt5686 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt5686++;
		}
		this.anInt5660 = 0x1 << this.anInt5686;
	}

	@OriginalMember(owner = "client!nd", name = "kb", descriptor = "(I)V")
	private void method4786() {
		this.aBoolean391 = false;
		if (Static296.aClass95_4 == this.aClass95_3) {
			this.method4763();
			this.method4768();
		}
	}

	@OriginalMember(owner = "client!nd", name = "lb", descriptor = "(I)[F")
	public final float[] method4787() {
		return this.aFloatArray43;
	}

	@OriginalMember(owner = "client!nd", name = "ba", descriptor = "()I")
	@Override
	public final int ba() {
		return this.anInt5700;
	}

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "(B)V")
	protected abstract void method4788();

	@OriginalMember(owner = "client!nd", name = "ta", descriptor = "(II)V")
	@Override
	public final void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt5676 && this.anInt5685 == arg1) {
			return;
		}
		this.anInt5685 = arg1;
		this.anInt5676 = arg0;
		this.method4695();
		this.method4728();
		this.method4659();
	}
}
