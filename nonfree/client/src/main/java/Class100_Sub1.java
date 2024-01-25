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

@OriginalClass("client!en")
public abstract class Class100_Sub1 extends Class100 {

	@OriginalMember(owner = "client!en", name = "F", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!en", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!en", name = "qb", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!en", name = "Lc", descriptor = "Lclient!bd;")
	protected Class31 aClass31_6;

	@OriginalMember(owner = "client!en", name = "Jd", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!en", name = "Nd", descriptor = "I")
	public int anInt5751;

	@OriginalMember(owner = "client!en", name = "Qd", descriptor = "I")
	public int anInt5753;

	@OriginalMember(owner = "client!en", name = "Sd", descriptor = "I")
	protected int anInt5754;

	@OriginalMember(owner = "client!en", name = "be", descriptor = "Lclient!j;")
	private Class37_Sub2 aClass37_Sub2_3;

	@OriginalMember(owner = "client!en", name = "ce", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!en", name = "fe", descriptor = "Lclient!hfa;")
	public Interface10 anInterface10_3;

	@OriginalMember(owner = "client!en", name = "ge", descriptor = "Z")
	public boolean aBoolean438;

	@OriginalMember(owner = "client!en", name = "ie", descriptor = "Lclient!tfa;")
	private Class318 aClass318_3;

	@OriginalMember(owner = "client!en", name = "le", descriptor = "F")
	public float aFloat153;

	@OriginalMember(owner = "client!en", name = "oe", descriptor = "[Lclient!nw;")
	protected Class236[] aClass236Array5;

	@OriginalMember(owner = "client!en", name = "pe", descriptor = "Z")
	protected boolean aBoolean441;

	@OriginalMember(owner = "client!en", name = "ue", descriptor = "[Lclient!hfa;")
	private Interface10[] anInterface10Array3;

	@OriginalMember(owner = "client!en", name = "we", descriptor = "I")
	protected int anInt5763;

	@OriginalMember(owner = "client!en", name = "xe", descriptor = "[Lclient!nw;")
	protected Class236[] aClass236Array6;

	@OriginalMember(owner = "client!en", name = "Be", descriptor = "I")
	private int anInt5766;

	@OriginalMember(owner = "client!en", name = "Ee", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!en", name = "Fe", descriptor = "Z")
	protected boolean aBoolean443;

	@OriginalMember(owner = "client!en", name = "Ke", descriptor = "Lclient!cl;")
	private Class56 aClass56_3;

	@OriginalMember(owner = "client!en", name = "Me", descriptor = "I")
	public int anInt5768;

	@OriginalMember(owner = "client!en", name = "Ne", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!en", name = "Pe", descriptor = "I")
	public int anInt5769;

	@OriginalMember(owner = "client!en", name = "We", descriptor = "Z")
	public boolean aBoolean449;

	@OriginalMember(owner = "client!en", name = "Ye", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!en", name = "bf", descriptor = "F")
	public float bf;

	@OriginalMember(owner = "client!en", name = "df", descriptor = "I")
	protected int anInt5773;

	@OriginalMember(owner = "client!en", name = "ff", descriptor = "I")
	public int anInt5775;

	@OriginalMember(owner = "client!en", name = "hf", descriptor = "I")
	protected int anInt5776;

	@OriginalMember(owner = "client!en", name = "jf", descriptor = "I")
	public int anInt5777;

	@OriginalMember(owner = "client!en", name = "rf", descriptor = "I")
	private int anInt5783;

	@OriginalMember(owner = "client!en", name = "sf", descriptor = "F")
	private float aFloat163;

	@OriginalMember(owner = "client!en", name = "uf", descriptor = "I")
	protected int anInt5785;

	@OriginalMember(owner = "client!en", name = "xf", descriptor = "[Lclient!mga;")
	protected Class68_Sub2[] aClass68_Sub2Array3;

	@OriginalMember(owner = "client!en", name = "Jf", descriptor = "Z")
	public boolean aBoolean454;

	@OriginalMember(owner = "client!en", name = "Kf", descriptor = "F")
	private float aFloat165;

	@OriginalMember(owner = "client!en", name = "Sf", descriptor = "[Lclient!ki;")
	protected Class190[] aClass190Array3;

	@OriginalMember(owner = "client!en", name = "Tf", descriptor = "[Lclient!gga;")
	protected Class2_Sub14[] aClass2_Sub14Array3;

	@OriginalMember(owner = "client!en", name = "Wf", descriptor = "Lclient!mq;")
	public Class199 aClass199_14;

	@OriginalMember(owner = "client!en", name = "Xf", descriptor = "Lclient!ja;")
	public Class66_Sub1 aClass66_Sub1_21;

	@OriginalMember(owner = "client!en", name = "Yf", descriptor = "Lclient!mq;")
	public Class199 aClass199_15;

	@OriginalMember(owner = "client!en", name = "Zf", descriptor = "Lclient!ja;")
	public Class66_Sub1 aClass66_Sub1_22;

	@OriginalMember(owner = "client!en", name = "ag", descriptor = "Lclient!ja;")
	public Class66_Sub1 aClass66_Sub1_23;

	@OriginalMember(owner = "client!en", name = "bg", descriptor = "Lclient!nba;")
	private Interface16 anInterface16_11;

	@OriginalMember(owner = "client!en", name = "dg", descriptor = "Lclient!ja;")
	public Class66_Sub1 aClass66_Sub1_24;

	@OriginalMember(owner = "client!en", name = "eg", descriptor = "Lclient!nba;")
	private Interface16 anInterface16_12;

	@OriginalMember(owner = "client!en", name = "fg", descriptor = "Lclient!ja;")
	public Class66_Sub1 aClass66_Sub1_25;

	@OriginalMember(owner = "client!en", name = "gg", descriptor = "Lclient!ja;")
	public Class66_Sub1 aClass66_Sub1_26;

	@OriginalMember(owner = "client!en", name = "hg", descriptor = "Lclient!hh;")
	private Interface11 anInterface11_5;

	@OriginalMember(owner = "client!en", name = "ig", descriptor = "Lclient!mq;")
	public Class199 aClass199_16;

	@OriginalMember(owner = "client!en", name = "jg", descriptor = "Lclient!ja;")
	public Class66_Sub1 aClass66_Sub1_27;

	@OriginalMember(owner = "client!en", name = "kg", descriptor = "Lclient!mq;")
	public Class199 aClass199_17;

	@OriginalMember(owner = "client!en", name = "lg", descriptor = "Lclient!ja;")
	public Class66_Sub1 aClass66_Sub1_28;

	@OriginalMember(owner = "client!en", name = "mg", descriptor = "Lclient!mq;")
	private Class199 aClass199_18;

	@OriginalMember(owner = "client!en", name = "ng", descriptor = "Lclient!ja;")
	public Class66_Sub1 aClass66_Sub1_29;

	@OriginalMember(owner = "client!en", name = "og", descriptor = "Lclient!ja;")
	public Class66_Sub1 aClass66_Sub1_30;

	@OriginalMember(owner = "client!en", name = "pg", descriptor = "Lclient!mq;")
	private Class199 aClass199_19;

	@OriginalMember(owner = "client!en", name = "qg", descriptor = "Z")
	protected boolean aBoolean458;

	@OriginalMember(owner = "client!en", name = "rg", descriptor = "I")
	private int anInt5795;

	@OriginalMember(owner = "client!en", name = "mb", descriptor = "Lclient!ae;")
	private final Class8 aClass8_29 = new Class8();

	@OriginalMember(owner = "client!en", name = "Od", descriptor = "Z")
	protected boolean aBoolean437 = true;

	@OriginalMember(owner = "client!en", name = "Rd", descriptor = "Lclient!mga;")
	protected final Class68_Sub2 aClass68_Sub2_15 = new Class68_Sub2();

	@OriginalMember(owner = "client!en", name = "Td", descriptor = "Lclient!mga;")
	public Class68_Sub2 aClass68_Sub2_16 = new Class68_Sub2();

	@OriginalMember(owner = "client!en", name = "Ud", descriptor = "Lclient!mga;")
	public final Class68_Sub2 aClass68_Sub2_17 = new Class68_Sub2();

	@OriginalMember(owner = "client!en", name = "Vd", descriptor = "Lclient!mga;")
	protected final Class68_Sub2 aClass68_Sub2_18 = new Class68_Sub2();

	@OriginalMember(owner = "client!en", name = "Wd", descriptor = "Lclient!mga;")
	private final Class68_Sub2 aClass68_Sub2_19 = new Class68_Sub2();

	@OriginalMember(owner = "client!en", name = "Xd", descriptor = "Lclient!mga;")
	private final Class68_Sub2 aClass68_Sub2_20 = new Class68_Sub2();

	@OriginalMember(owner = "client!en", name = "ne", descriptor = "I")
	private int anInt5759 = 0;

	@OriginalMember(owner = "client!en", name = "Yd", descriptor = "[F")
	private final float[] aFloatArray44 = new float[16];

	@OriginalMember(owner = "client!en", name = "he", descriptor = "I")
	private int anInt5758 = 16777215;

	@OriginalMember(owner = "client!en", name = "ve", descriptor = "I")
	public int anInt5762 = 128;

	@OriginalMember(owner = "client!en", name = "je", descriptor = "Z")
	private boolean aBoolean439 = false;

	@OriginalMember(owner = "client!en", name = "qe", descriptor = "Z")
	protected boolean aBoolean442 = true;

	@OriginalMember(owner = "client!en", name = "De", descriptor = "F")
	public float aFloat154 = 3584.0F;

	@OriginalMember(owner = "client!en", name = "se", descriptor = "[Lclient!cl;")
	private final Class56[] aClass56Array3 = new Class56[10];

	@OriginalMember(owner = "client!en", name = "Le", descriptor = "F")
	private float aFloat157 = 1.0F;

	@OriginalMember(owner = "client!en", name = "Ae", descriptor = "I")
	protected int anInt5765 = 3584;

	@OriginalMember(owner = "client!en", name = "me", descriptor = "Z")
	protected boolean aBoolean440 = false;

	@OriginalMember(owner = "client!en", name = "ae", descriptor = "I")
	public int anInt5756 = 3;

	@OriginalMember(owner = "client!en", name = "re", descriptor = "I")
	private int anInt5760 = 1;

	@OriginalMember(owner = "client!en", name = "Xe", descriptor = "F")
	public float aFloat159 = -1.0F;

	@OriginalMember(owner = "client!en", name = "Je", descriptor = "I")
	private int anInt5767 = -1;

	@OriginalMember(owner = "client!en", name = "Ie", descriptor = "F")
	public float aFloat156 = 1.0F;

	@OriginalMember(owner = "client!en", name = "Ge", descriptor = "Z")
	private boolean aBoolean444 = false;

	@OriginalMember(owner = "client!en", name = "af", descriptor = "Z")
	protected boolean aBoolean450 = false;

	@OriginalMember(owner = "client!en", name = "ef", descriptor = "I")
	public int anInt5774 = 512;

	@OriginalMember(owner = "client!en", name = "mf", descriptor = "F")
	public float aFloat162 = -1.0F;

	@OriginalMember(owner = "client!en", name = "Ce", descriptor = "[F")
	private final float[] aFloatArray46 = new float[16];

	@OriginalMember(owner = "client!en", name = "Te", descriptor = "I")
	protected int anInt5771 = 0;

	@OriginalMember(owner = "client!en", name = "Oe", descriptor = "Z")
	protected boolean aBoolean446 = true;

	@OriginalMember(owner = "client!en", name = "cf", descriptor = "F")
	public float aFloat161 = 1.0F;

	@OriginalMember(owner = "client!en", name = "ee", descriptor = "I")
	private int anInt5757 = -1;

	@OriginalMember(owner = "client!en", name = "Ve", descriptor = "Lclient!lea;")
	protected Class206 aClass206_6 = Static106.aClass206_9;

	@OriginalMember(owner = "client!en", name = "tf", descriptor = "I")
	public int anInt5784 = 8;

	@OriginalMember(owner = "client!en", name = "Ze", descriptor = "[F")
	private final float[] aFloatArray47 = new float[16];

	@OriginalMember(owner = "client!en", name = "Qe", descriptor = "Z")
	private boolean aBoolean447 = false;

	@OriginalMember(owner = "client!en", name = "nf", descriptor = "Z")
	protected boolean aBoolean451 = false;

	@OriginalMember(owner = "client!en", name = "lf", descriptor = "I")
	public int anInt5779 = -1;

	@OriginalMember(owner = "client!en", name = "yf", descriptor = "[F")
	private final float[] aFloatArray50 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!en", name = "ye", descriptor = "[F")
	private final float[] aFloatArray45 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!en", name = "vf", descriptor = "[F")
	private final float[] aFloatArray49 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!en", name = "wf", descriptor = "Z")
	protected boolean aBoolean452 = true;

	@OriginalMember(owner = "client!en", name = "Gf", descriptor = "I")
	public int anInt5789 = -1;

	@OriginalMember(owner = "client!en", name = "pf", descriptor = "I")
	protected final int anInt5781 = 0;

	@OriginalMember(owner = "client!en", name = "Cf", descriptor = "F")
	public float aFloat164 = 3584.0F;

	@OriginalMember(owner = "client!en", name = "He", descriptor = "Z")
	protected boolean aBoolean445 = false;

	@OriginalMember(owner = "client!en", name = "kf", descriptor = "I")
	protected int anInt5778 = 0;

	@OriginalMember(owner = "client!en", name = "gf", descriptor = "[F")
	public final float[] aFloatArray48 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!en", name = "Se", descriptor = "I")
	protected final int anInt5770 = 0;

	@OriginalMember(owner = "client!en", name = "Re", descriptor = "Z")
	private boolean aBoolean448 = false;

	@OriginalMember(owner = "client!en", name = "of", descriptor = "I")
	protected int anInt5780 = 0;

	@OriginalMember(owner = "client!en", name = "Af", descriptor = "I")
	public int anInt5786 = 50;

	@OriginalMember(owner = "client!en", name = "ke", descriptor = "F")
	public float aFloat152 = 1.0F;

	@OriginalMember(owner = "client!en", name = "Df", descriptor = "I")
	private int anInt5787 = -1;

	@OriginalMember(owner = "client!en", name = "Hf", descriptor = "I")
	private int anInt5790 = 0;

	@OriginalMember(owner = "client!en", name = "Ff", descriptor = "I")
	public int anInt5788 = 0;

	@OriginalMember(owner = "client!en", name = "ze", descriptor = "I")
	public int anInt5764 = 0;

	@OriginalMember(owner = "client!en", name = "Lf", descriptor = "I")
	private int anInt5792 = 0;

	@OriginalMember(owner = "client!en", name = "Zd", descriptor = "I")
	public int anInt5755 = 512;

	@OriginalMember(owner = "client!en", name = "Qf", descriptor = "Z")
	private boolean aBoolean455 = false;

	@OriginalMember(owner = "client!en", name = "Nf", descriptor = "F")
	public float aFloat166 = 1.0F;

	@OriginalMember(owner = "client!en", name = "Ef", descriptor = "Z")
	protected boolean aBoolean453 = true;

	@OriginalMember(owner = "client!en", name = "Of", descriptor = "[F")
	public final float[] aFloatArray52 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!en", name = "Mf", descriptor = "Lclient!sfa;")
	protected Class302 aClass302_6 = Static222.aClass302_5;

	@OriginalMember(owner = "client!en", name = "zf", descriptor = "[F")
	protected float[] aFloatArray51 = this.aFloatArray50;

	@OriginalMember(owner = "client!en", name = "Rf", descriptor = "I")
	protected int anInt5794 = 0;

	@OriginalMember(owner = "client!en", name = "Ue", descriptor = "I")
	private int anInt5772 = 0;

	@OriginalMember(owner = "client!en", name = "qf", descriptor = "I")
	public int anInt5782 = 0;

	@OriginalMember(owner = "client!en", name = "Pf", descriptor = "I")
	protected int anInt5793 = 0;

	@OriginalMember(owner = "client!en", name = "Uf", descriptor = "Z")
	protected boolean aBoolean456 = true;

	@OriginalMember(owner = "client!en", name = "Vf", descriptor = "Z")
	private boolean aBoolean457 = false;

	@OriginalMember(owner = "client!en", name = "Bf", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream5 = new Stream();

	@OriginalMember(owner = "client!en", name = "cg", descriptor = "Lclient!mga;")
	private final Class68_Sub2 aClass68_Sub2_21 = new Class68_Sub2();

	@OriginalMember(owner = "client!en", name = "q", descriptor = "Ljava/lang/Object;")
	protected final Object anObject30;

	@OriginalMember(owner = "client!en", name = "N", descriptor = "Ljava/lang/Object;")
	private Object anObject31;

	@OriginalMember(owner = "client!en", name = "nd", descriptor = "Lclient!pl;")
	protected final Class259 aClass259_96;

	@OriginalMember(owner = "client!en", name = "te", descriptor = "I")
	protected final int anInt5761;

	@OriginalMember(owner = "client!en", name = "A", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas7;

	@OriginalMember(owner = "client!en", name = "ab", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!en", name = "If", descriptor = "I")
	public final int anInt5791;

	@OriginalMember(owner = "client!en", name = "pc", descriptor = "I")
	private int anInt5678;

	@OriginalMember(owner = "client!en", name = "R", descriptor = "I")
	public int anInt5608;

	@OriginalMember(owner = "client!en", name = "gd", descriptor = "I")
	private int anInt5720;

	@OriginalMember(owner = "client!en", name = "sb", descriptor = "I")
	public int anInt5630;

	@OriginalMember(owner = "client!en", name = "Rb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!en", name = "de", descriptor = "Lclient!sda;")
	private final Class298 aClass298_3;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!fa;Lclient!pl;II)V")
	protected Class100_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(3) Class259 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anObject31 = this.anObject30 = arg1;
		this.aClass259_96 = arg3;
		this.anInt5761 = arg4;
		this.aCanvas8 = this.aCanvas7 = arg0;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt5791 = arg5;
		this.anInt5608 = this.anInt5678 = local307.width;
		this.anInt5630 = this.anInt5720 = local307.height;
		Static165.method2887(false, true);
		if (super.anInterface5_10 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt5791);
			this.aClass298_3 = null;
		} else {
			this.aClass298_3 = new Class298(this, super.anInterface5_10);
			this.aNativeInterface3 = new NativeInterface(super.anInterface5_10.method912(), this.anInt5791);
			for (@Pc(364) int local364 = 0; super.anInterface5_10.method912() > local364; local364++) {
				@Pc(372) Class343 local372 = super.anInterface5_10.method917(local364);
				if (local372 != null) {
					this.aNativeInterface3.initTextureMetrics(local364, local372.aByte119, local372.aByte115);
				}
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public final Class39 method6226(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class39_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!en", name = "j", descriptor = "(I)V")
	protected abstract void method4751();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([FIIIZIILclient!ec;)Lclient!ls;")
	protected abstract Interface14 method4752(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(7) Class88 arg4);

	@OriginalMember(owner = "client!en", name = "d", descriptor = "()Z")
	@Override
	public final boolean method6186() {
		return this.aBoolean443;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	@Override
	public final void method6229(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass298_3 != null) {
			this.aClass298_3.method6788();
		}
		this.anInt5762 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZILclient!gb;Z)V")
	protected abstract void method4754(@OriginalArg(1) int arg0, @OriginalArg(2) Class119 arg1);

	@OriginalMember(owner = "client!en", name = "k", descriptor = "(I)V")
	protected abstract void method4755();

	@OriginalMember(owner = "client!en", name = "l", descriptor = "(I)V")
	protected abstract void method4756();

	@OriginalMember(owner = "client!en", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public final void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt5758;
		if (local15 || this.aFloat159 != arg1 || arg2 != this.aFloat162) {
			this.aFloat162 = arg2;
			this.anInt5758 = arg0;
			this.aFloat159 = arg1;
			if (local15) {
				this.aFloat152 = (float) (this.anInt5758 & 0xFF0000) / 1.671168E7F;
				this.aFloat156 = (float) (this.anInt5758 & 0xFF) / 255.0F;
				this.aFloat161 = (float) (this.anInt5758 & 0xFF00) / 65280.0F;
				this.method4779();
			}
			this.aNativeInterface3.setSunColour(this.aFloat152, this.aFloat161, this.aFloat156, arg1, arg2);
			this.method4817();
		}
		if (this.aFloatArray49[0] != arg3 || this.aFloatArray49[1] != arg4 || arg5 != this.aFloatArray49[2]) {
			this.aFloatArray49[0] = arg3;
			this.aFloatArray49[1] = arg4;
			this.aFloatArray49[2] = arg5;
			this.aFloatArray45[0] = -arg3;
			this.aFloatArray45[1] = -arg4;
			this.aFloatArray45[2] = -arg5;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray52[1] = arg4 * local153;
			this.aFloatArray52[0] = local153 * arg3;
			this.aFloatArray52[2] = arg5 * local153;
			this.aFloatArray48[0] = -this.aFloatArray52[0];
			this.aFloatArray48[1] = -this.aFloatArray52[1];
			this.aFloatArray48[2] = -this.aFloatArray52[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray52[0], this.aFloatArray52[1], this.aFloatArray52[2]);
			this.method4843();
			this.anInt5777 = (int) (arg3 * 256.0F / arg4);
			this.anInt5769 = (int) (arg5 * 256.0F / arg4);
		}
		this.method4782();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLclient!mq;)V")
	public abstract void method4757(@OriginalArg(1) Class199 arg0);

	@OriginalMember(owner = "client!en", name = "m", descriptor = "()Z")
	@Override
	public final boolean method6208() {
		return false;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!ki;)V")
	public final void method4758(@OriginalArg(1) Class190 arg0) {
		this.aClass190Array3[this.anInt5771] = arg0;
		this.method4780();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZZI[[I)Lclient!oq;")
	public abstract Interface20 method4759(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BB)V")
	public final void method4760(@OriginalArg(1) byte arg0) {
		this.method4877(arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public final void method6223(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aNativeHeap3 = ((Class2_Sub13_Sub2) arg0).aNativeHeap5;
		this.aNativeHeapBuffer8 = this.aNativeHeap3.a(32768, false);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZZ)V")
	public final void method4761(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt5767 || this.aBoolean444 != this.aBoolean449) {
			@Pc(26) Interface14 local26 = null;
			@Pc(28) int local28 = 0;
			@Pc(30) byte local30 = 0;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39 = this.aBoolean449 ? 3 : 0;
			if (arg0 < 0) {
				this.method4804();
			} else {
				local26 = this.aClass298_3.method6786(arg0);
				@Pc(56) Class343 local56 = super.anInterface5_10.method917(arg0);
				if (local56.aByte118 == 0 && local56.aByte114 == 0) {
					this.method4804();
				} else {
					@Pc(80) int local80 = local56.aBoolean700 ? 64 : 128;
					@Pc(84) int local84 = local80 * 50;
					@Pc(88) Class68_Sub2 local88 = this.method4818();
					local88.method5110((float) (local56.aByte114 * (this.anInt5768 % local84)) / (float) local84, 0.0F, (float) (local56.aByte118 * (this.anInt5768 % local84)) / (float) local84);
					this.method4758(Static21.aClass190_1);
				}
				local28 = local56.anInt9124;
				if (!this.aBoolean449) {
					local30 = local56.aByte120;
					local39 = local56.aByte117;
					local32 = local56.anInt9129;
				}
			}
			this.method4827(local32, local30, arg2, arg1, local39);
			if (this.aClass56_3 == null) {
				this.method4876(local26);
				this.method4872(local28);
			} else {
				this.aClass56_3.method7178(local28, local26);
			}
			this.anInt5767 = arg0;
			this.aBoolean444 = this.aBoolean449;
		}
		this.anInt5783 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public final void method4762() {
		if (this.aClass302_6 == Static222.aClass302_5) {
			return;
		}
		@Pc(6) Class302 local6 = this.aClass302_6;
		this.aClass302_6 = Static222.aClass302_5;
		if (local6.method6803()) {
			this.method4870();
		}
		this.anInt5783 &= 0xFFFFFFE0;
		this.aFloatArray51 = this.aFloatArray50;
	}

	@OriginalMember(owner = "client!en", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public final void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class20_Sub1 local6 = (Class20_Sub1) arg1;
		@Pc(9) Interface14 local9 = local6.anInterface14_1;
		this.method4784();
		this.method4876(local9);
		this.method4801(1);
		this.method4797(Static291.aClass236_2, Static291.aClass236_2);
		this.method4883(0, Static224.aClass119_18);
		this.method4877(arg0);
		this.aClass68_Sub2_15.method5108((float) this.anInt5608, (float) this.anInt5630, 0.0F);
		this.method4858();
		this.aClass68_Sub2Array3[0].method5108(local9.method7070((float) this.anInt5608), local9.method7065((float) this.anInt5630), 1.0F);
		this.aClass68_Sub2Array3[0].method5100(local9.method7070((float) -arg2), 0.0F, local9.method7065((float) -arg3));
		this.aClass190Array3[0] = Static21.aClass190_1;
		this.method4780();
		this.method4796();
		this.method4804();
		this.method4883(0, Static325.aClass119_44);
	}

	@OriginalMember(owner = "client!en", name = "m", descriptor = "(I)V")
	private void method4763() {
		if (this.anInt5783 == 1) {
			return;
		}
		this.method4882();
		this.method4857(false);
		this.method4774(false);
		this.method4832(false);
		this.method4871(false);
		this.method4761(-2, false, false);
		this.method4872(1);
		this.method4876(this.anInterface10_3);
		this.anInt5783 = 1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!lt;IIIILclient!hh;)V")
	public abstract void method4764(@OriginalArg(0) int arg0, @OriginalArg(1) Class213 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface11 arg5);

	@OriginalMember(owner = "client!en", name = "XA", descriptor = "(IIIII)V")
	@Override
	public final void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6190(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZB)V")
	public final void method4765(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean442 != arg0) {
			this.aBoolean442 = arg0;
			this.method4802();
		}
	}

	@OriginalMember(owner = "client!en", name = "J", descriptor = "(IIIIII)V")
	@Override
	public final void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4763();
		this.method4877(arg4);
		this.method4883(0, Static224.aClass119_18);
		this.method4816(0, Static224.aClass119_18);
		this.method4801(arg5);
		this.aClass68_Sub2_15.method5108((float) arg2, (float) arg3, 1.0F);
		this.aClass68_Sub2_15.U(arg0, arg1, 0);
		this.method4858();
		this.method4881(false);
		this.method4796();
		this.method4881(true);
		this.method4816(0, Static325.aClass119_44);
		this.method4883(0, Static325.aClass119_44);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method6220() {
	}

	@OriginalMember(owner = "client!en", name = "v", descriptor = "()[I")
	@Override
	public final int[] v() {
		return new int[] { this.anInt5788, this.anInt5764, this.anInt5755, this.anInt5774 };
	}

	@OriginalMember(owner = "client!en", name = "n", descriptor = "(I)V")
	private void method4766() {
		this.aBoolean439 = false;
		if (Static102.aClass302_1 == this.aClass302_6) {
			this.method4793();
			this.method4854();
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
	protected abstract void method4767();

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)I")
	public final int method4768() {
		return this.anInt5766;
	}

	@OriginalMember(owner = "client!en", name = "o", descriptor = "(I)V")
	protected abstract void method4769();

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(B)V")
	protected abstract void method4770();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[FLclient!ec;ZII)Lclient!ls;")
	public final Interface14 method4771(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method4752(arg1, arg4, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!sa;[Lclient!aga;Z)Lclient!la;")
	@Override
	public final Class29 method6225(@OriginalArg(0) Class294 arg0, @OriginalArg(1) Class13[] arg1) {
		return new Class29_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!lt;I)V")
	private void method4772(@OriginalArg(0) int arg0, @OriginalArg(1) Class213 arg1) {
		this.method4863(this.anInterface16_12, 0);
		this.method4757(this.aClass199_18);
		this.method4849(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public final Class67 method6195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class67_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!en", name = "p", descriptor = "(I)V")
	private void method4773() {
		this.aBoolean447 = false;
		this.method4800();
		if (this.aClass302_6 == Static153.aClass302_3) {
			this.method4854();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!en", name = "CA", descriptor = "(IIII)V")
	@Override
	public final void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5790 = arg3;
		this.anInt5757 = arg2;
		this.anInt5787 = arg1;
		this.aBoolean449 = true;
		this.anInt5766 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)V")
	public final void method4774(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean440 != arg0) {
			this.aBoolean440 = arg0;
			this.method4867();
			this.anInt5783 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!en", name = "la", descriptor = "(IIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5774 = arg3;
		this.anInt5764 = arg1;
		this.anInt5788 = arg0;
		this.anInt5755 = arg2;
		this.method4773();
		this.method4785();
		this.method4762();
		this.method4791();
	}

	@OriginalMember(owner = "client!en", name = "q", descriptor = "(I)V")
	private void method4775() {
		this.anInterface16_12 = this.method4837(false);
		this.anInterface16_12.method5776(28, 140);
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(30) Buffer local30 = this.anInterface16_12.method5775();
			if (local30 != null) {
				@Pc(39) Stream local39 = this.method4834(local30);
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
				local39.c();
				if (this.anInterface16_12.method5774()) {
					break;
				}
			}
		}
		this.aClass199_18 = this.method4853(new Class89[] { new Class89(new Class181[] { Static263.aClass181_1, Static263.aClass181_5, Static263.aClass181_5 }) });
	}

	@OriginalMember(owner = "client!en", name = "l", descriptor = "()Z")
	@Override
	public final boolean method6206() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[BIILclient!ec;I)Lclient!fl;")
	public abstract Interface6 method4776(@OriginalArg(1) byte[] arg0, @OriginalArg(4) Class88 arg1);

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(ZI)Lclient!hh;")
	public abstract Interface11 method4777(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!en", name = "r", descriptor = "(I)V")
	private void method4778() {
		if (this.aClass56_3 != null) {
			this.aClass56_3.method7177();
		}
		this.method4803();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)I")
	@Override
	public final int method6215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method6190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		if (local9 == 0.0F && local16 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(37) float local37 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local16 * local16)));
			local9 *= local37;
			local16 *= local37;
		}
		if (!this.method4805(0.0F, (float) arg0, (float) arg1, 0.0F, local9 + (float) arg2, local16 + (float) arg3)) {
			return;
		}
		this.method4763();
		this.method4877(arg4);
		this.method4883(0, Static224.aClass119_18);
		this.method4816(0, Static224.aClass119_18);
		this.method4801(arg5);
		this.method4799();
		this.method4881(false);
		this.method4820();
		this.method4881(true);
		this.method4816(0, Static325.aClass119_44);
		this.method4883(0, Static325.aClass119_44);
	}

	@OriginalMember(owner = "client!en", name = "s", descriptor = "(I)V")
	protected abstract void method4779();

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)Lclient!e;")
	@Override
	public final Class2_Sub13 method6234(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub13_Sub2 local8 = new Class2_Sub13_Sub2(arg0);
		this.aClass8_29.method212(local8);
		return local8;
	}

	@OriginalMember(owner = "client!en", name = "t", descriptor = "(I)V")
	private void method4780() {
		this.method4813();
		if (this.aClass56_3 != null) {
			this.aClass56_3.method7181();
		}
	}

	@OriginalMember(owner = "client!en", name = "u", descriptor = "(I)V")
	protected abstract void method4781();

	@OriginalMember(owner = "client!en", name = "v", descriptor = "(I)V")
	protected abstract void method4782();

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(IIIII)V")
	@Override
	protected final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!en", name = "w", descriptor = "(I)V")
	public final void method4783() {
		this.method4762();
		this.method4854();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!jt;)V")
	@Override
	public final void method6252(@OriginalArg(0) Class37 arg0) {
		this.aClass37_Sub2_3 = (Class37_Sub2) arg0;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(B)V")
	public final void method4784() {
		if (this.anInt5783 == 2) {
			return;
		}
		this.method4882();
		this.method4857(false);
		this.method4774(false);
		this.method4832(false);
		this.method4871(false);
		this.method4761(-2, false, false);
		this.anInt5783 = 2;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "()I")
	@Override
	public final int method6185() {
		return this.anInt5773 - 2;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIF)Lclient!gga;")
	@Override
	public final Class2_Sub14 method6209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub14_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!en", name = "JA", descriptor = "()V")
	@Override
	public final void JA() {
		this.anInt5793 = this.anInt5608;
		this.anInt5794 = 0;
		this.anInt5778 = 0;
		this.anInt5780 = this.anInt5630;
		if (this.aBoolean458) {
			this.aBoolean458 = false;
			this.method4819();
		}
		this.method4791();
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(B)V")
	private void method4785() {
		this.aBoolean455 = false;
		this.method4879();
		if (Static441.aClass302_7 == this.aClass302_6) {
			this.method4854();
		}
	}

	@OriginalMember(owner = "client!en", name = "x", descriptor = "(I)V")
	protected abstract void method4786();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([IIZIIII)Lclient!ls;")
	public abstract Interface14 method4787(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public final void method6259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class20 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method4788(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap3.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public final Class20 method6240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static298.method4511(arg1, arg3, this, arg2, arg0);
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(Z)I")
	public final int method4789() {
		return this.anInt5787;
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(B)V")
	private void method4790() {
		this.aFloatArray46[14] = this.aFloat163;
		this.aFloatArray46[10] = this.aFloat165;
		this.aFloat154 = ((float) -this.anInt5765 + this.aFloatArray46[14]) / this.aFloatArray46[10];
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(Z)V")
	private void method4791() {
		this.aFloat158 = this.anInt5794 - this.anInt5764;
		this.aFloat155 = this.anInt5793 - this.anInt5788;
		this.aFloat160 = this.anInt5778 - this.anInt5788;
		this.aFloat153 = this.anInt5780 - this.anInt5764;
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(Z)Lclient!mga;")
	public final Class68_Sub2 method4792() {
		return this.aClass68_Sub2Array3[this.anInt5771];
	}

	@OriginalMember(owner = "client!en", name = "C", descriptor = "()Lclient!q;")
	@Override
	public final Class68 method6258() {
		return new Class68_Sub2();
	}

	@OriginalMember(owner = "client!en", name = "MA", descriptor = "(III[I)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass68_Sub2_16.method5105((float) arg1, (float) arg2, (float) arg0);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt5755 * this.aClass68_Sub2_16.method5122((float) arg1, (float) arg0, (float) arg2) / local14);
			local25 = (int) ((float) this.anInt5774 * this.aClass68_Sub2_16.method5103((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local25 = this.anInt5764;
			local28 = this.anInt5788;
		}
		arg3[0] = (int) ((float) local28 - this.aFloat160);
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local25 - this.aFloat158);
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(B)V")
	private void method4793() {
		if (this.aBoolean439) {
			return;
		}
		@Pc(11) float[] local11 = this.aFloatArray44;
		this.aBoolean439 = true;
		if (this.anInt5608 != 0 && this.anInt5630 != 0) {
			local11[7] = 0.0F;
			local11[12] = -1.0F;
			local11[3] = 0.0F;
			local11[14] = 0.5F;
			local11[6] = 0.0F;
			local11[13] = 1.0F;
			local11[1] = 0.0F;
			local11[15] = 1.0F;
			local11[11] = 0.0F;
			local11[2] = 0.0F;
			local11[8] = 0.0F;
			local11[5] = -2.0F / (float) this.anInt5630;
			local11[0] = 2.0F / (float) this.anInt5608;
			local11[9] = 0.0F;
			local11[10] = 0.5F;
			local11[4] = 0.0F;
			return;
		}
		local11[9] = 0.0F;
		local11[11] = 0.0F;
		local11[0] = 1.0F;
		local11[12] = 0.0F;
		local11[4] = 0.0F;
		local11[3] = 0.0F;
		local11[1] = 0.0F;
		local11[13] = 0.0F;
		local11[14] = 0.0F;
		local11[10] = 1.0F;
		local11[15] = 1.0F;
		local11[2] = 0.0F;
		local11[8] = 0.0F;
		local11[7] = 0.0F;
		local11[5] = 1.0F;
		local11[6] = 0.0F;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!bt;Lclient!ec;)Z")
	public abstract boolean method4794(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class88 arg1);

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(II)Lclient!hh;")
	public final Interface11 method4795(@OriginalArg(1) int arg0) {
		if (this.anInterface11_5.method5771() < arg0 * 2) {
			this.anInterface11_5.method4117(arg0);
		}
		return this.anInterface11_5;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!eg;IIII)Lclient!da;")
	@Override
	public final Class66 method6191(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class66_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!aga;Z)Lclient!f;")
	@Override
	public final Class39 method6256(@OriginalArg(0) Class13 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(23) Class39 local23;
		if (arg0.anInt427 == 0 || arg0.anInt428 == 0) {
			local23 = this.method6226(new int[1], 1, 1, 1);
		} else {
			@Pc(32) int[] local32 = new int[arg0.anInt427 * arg0.anInt428];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			@Pc(41) int local41;
			@Pc(45) int local45;
			if (arg0.aByteArray4 == null) {
				for (local41 = 0; local41 < arg0.anInt428; local41++) {
					for (local45 = 0; local45 < arg0.anInt427; local45++) {
						@Pc(58) int local58 = arg0.anIntArray32[arg0.aByteArray3[local34++] & 0xFF];
						local32[local36++] = local58 == 0 ? 0 : local58 | 0xFF000000;
					}
				}
			} else {
				for (local41 = 0; local41 < arg0.anInt428; local41++) {
					for (local45 = 0; local45 < arg0.anInt427; local45++) {
						local32[local36++] = arg0.anIntArray32[arg0.aByteArray3[local34] & 0xFF] | arg0.aByteArray4[local34] << 24;
						local34++;
					}
				}
			}
			local23 = this.method6226(local32, arg0.anInt427, arg0.anInt427, arg0.anInt428);
		}
		local23.Q(arg0.anInt429, arg0.anInt430, arg0.anInt426, arg0.anInt431);
		return local23;
	}

	@OriginalMember(owner = "client!en", name = "ZA", descriptor = "(Z)V")
	@Override
	public final void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean452 = arg0;
		this.method4755();
	}

	@OriginalMember(owner = "client!en", name = "n", descriptor = "()Z")
	@Override
	public final boolean method6218() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt5795;
	}

	@OriginalMember(owner = "client!en", name = "y", descriptor = "(I)V")
	public final void method4796() {
		this.method4772(2, Static339.aClass213_3);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!nw;ZLclient!nw;)V")
	public final void method4797(@OriginalArg(0) Class236 arg0, @OriginalArg(2) Class236 arg1) {
		@Pc(11) boolean local11 = false;
		if (this.aClass236Array5[this.anInt5771] != arg0) {
			this.aClass236Array5[this.anInt5771] = arg0;
			local11 = true;
			this.method4786();
		}
		if (this.aClass236Array6[this.anInt5771] != arg1) {
			this.aClass236Array6[this.anInt5771] = arg1;
			this.method4751();
			local11 = true;
		}
		if (local11) {
			this.anInt5783 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!en", name = "YA", descriptor = "(IIII)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean449) {
			throw new RuntimeException("");
		}
		this.anInt5766 = arg0;
		this.anInt5787 = arg1;
		this.anInt5790 = arg3;
		this.anInt5757 = arg2;
		if (this.aBoolean444) {
			this.aClass56Array3[3].method7185();
			this.aClass56Array3[3].method7177();
		}
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "(B)V")
	protected abstract void method4798();

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6227(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas7) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method4808(arg0, this.aHashtable5.get(arg0));
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!en", name = "i", descriptor = "(B)V")
	public final void method4799() {
		this.aClass68_Sub2_15.Y();
		this.aBoolean437 = true;
		this.method4865();
	}

	@OriginalMember(owner = "client!en", name = "z", descriptor = "(I)V")
	private void method4800() {
		if (this.aBoolean447) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray47;
		@Pc(13) float local13 = (float) this.anInt5786;
		@Pc(17) float local17 = (float) this.anInt5765;
		@Pc(29) float local29 = this.aFloat157 * (float) -this.anInt5764 / (float) this.anInt5774;
		@Pc(41) float local41 = this.aFloat157 * (float) -this.anInt5788 / (float) this.anInt5755;
		@Pc(56) float local56 = this.aFloat157 * (float) (this.anInt5608 - this.anInt5788) / (float) this.anInt5755;
		@Pc(70) float local70 = (float) (this.anInt5630 - this.anInt5764) * this.aFloat157 / (float) this.anInt5774;
		if (local56 == local41 || local70 == local29) {
			local9[12] = 0.0F;
			local9[7] = 0.0F;
			local9[8] = 0.0F;
			local9[5] = 1.0F;
			local9[0] = 1.0F;
			local9[2] = 0.0F;
			local9[15] = 1.0F;
			local9[10] = 1.0F;
			local9[3] = 0.0F;
			local9[14] = 0.0F;
			local9[13] = 0.0F;
			local9[4] = 0.0F;
			local9[9] = 0.0F;
			local9[1] = 0.0F;
			local9[6] = 0.0F;
			local9[11] = 0.0F;
		} else {
			local9[7] = 0.0F;
			local9[3] = 0.0F;
			local9[10] = 1.0F / (local13 - local17);
			local9[5] = 2.0F / (local70 - local29);
			local9[11] = 0.0F;
			local9[8] = 0.0F;
			local9[9] = 0.0F;
			local9[4] = 0.0F;
			local9[2] = 0.0F;
			local9[1] = 0.0F;
			local9[6] = 0.0F;
			local9[15] = 1.0F;
			local9[0] = 2.0F / (local56 - local41);
			local9[14] = local13 / (local13 - local17);
			local9[12] = (local41 + local56) / (local41 - local56);
			local9[13] = (local29 + local70) / (local70 - local29);
		}
		this.method4823();
		this.aBoolean447 = true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BI)V")
	public final void method4801(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt5760) {
			return;
		}
		@Pc(22) Class206 local22;
		@Pc(24) boolean local24;
		@Pc(26) boolean local26;
		if (arg0 == 1) {
			local24 = true;
			local22 = Static106.aClass206_9;
			local26 = true;
		} else if (arg0 == 2) {
			local24 = true;
			local22 = Static536.aClass206_10;
			local26 = false;
		} else if (arg0 == 128) {
			local22 = Static12.aClass206_1;
			local24 = true;
			local26 = true;
		} else {
			local22 = Static141.aClass206_4;
			local24 = false;
			local26 = false;
		}
		if (local26 != this.aBoolean453) {
			this.aBoolean453 = local26;
			this.method4868();
		}
		if (this.aBoolean456 != local24) {
			this.aBoolean456 = local24;
			this.method4822();
		}
		if (local22 != this.aClass206_6) {
			this.aClass206_6 = local22;
			this.method4856();
		}
		this.anInt5760 = arg0;
		this.anInt5783 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "()Z")
	@Override
	public final boolean method6187() {
		return this.aClass56Array3[3].method7172();
	}

	@OriginalMember(owner = "client!en", name = "A", descriptor = "(I)V")
	protected abstract void method4802();

	@OriginalMember(owner = "client!en", name = "B", descriptor = "(I)V")
	protected abstract void method4803();

	@OriginalMember(owner = "client!en", name = "j", descriptor = "(B)V")
	public final void method4804() {
		if (this.aClass190Array3[this.anInt5771] != Static248.aClass190_3) {
			this.aClass190Array3[this.anInt5771] = Static248.aClass190_3;
			this.aClass68_Sub2Array3[this.anInt5771].Y();
			this.method4780();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(FFFIFFF)Z")
	private boolean method4805(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(17) Buffer local17 = this.anInterface16_11.method5775();
		if (local17 == null) {
			return false;
		}
		@Pc(28) Stream local28 = this.method4834(local17);
		if (Stream.a()) {
			local28.a(arg1);
			local28.a(arg2);
			local28.a(arg0);
			local28.a(arg4);
			local28.a(arg5);
			local28.a(arg3);
		} else {
			local28.b(arg1);
			local28.b(arg2);
			local28.b(arg0);
			local28.b(arg4);
			local28.b(arg5);
			local28.b(arg3);
		}
		local28.c();
		return this.anInterface16_11.method5774();
	}

	@OriginalMember(owner = "client!en", name = "C", descriptor = "(I)[F")
	public final float[] method4806() {
		return this.aFloatArray50;
	}

	@OriginalMember(owner = "client!en", name = "k", descriptor = "(B)V")
	private void method4807() {
		this.anInterface16_11 = this.method4837(true);
		this.anInterface16_11.method5776(12, 24);
		this.aClass199_19 = this.method4853(new Class89[] { new Class89(Static263.aClass181_1) });
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method4808(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!en", name = "pa", descriptor = "(III)V")
	@Override
	public final void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5779 == arg0 && this.anInt5789 == arg1 && this.anInt5782 == arg2) {
			return;
		}
		this.anInt5779 = arg0;
		this.anInt5789 = arg1;
		this.anInt5782 = arg2;
		this.method4778();
		this.method4802();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[F)[F")
	public final float[] method4809(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloatArray51[1];
		arg0[0] = this.aFloatArray51[0];
		arg0[12] = this.aFloatArray51[3];
		arg0[8] = this.aFloatArray51[2];
		arg0[2] = this.aFloatArray51[8];
		arg0[13] = this.aFloatArray51[7];
		arg0[1] = this.aFloatArray51[4];
		arg0[9] = this.aFloatArray51[6];
		arg0[5] = this.aFloatArray51[5];
		arg0[6] = this.aFloatArray51[9];
		arg0[3] = this.aFloatArray51[12];
		arg0[7] = this.aFloatArray51[13];
		arg0[10] = this.aFloatArray51[10];
		arg0[14] = this.aFloatArray51[11];
		arg0[11] = this.aFloatArray51[14];
		arg0[15] = this.aFloatArray51[15];
		return arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!ec;Lclient!bt;I)Z")
	public abstract boolean method4810(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class42 arg1);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([I)V")
	@Override
	public final void method6211(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt5630;
		arg0[0] = this.anInt5608;
	}

	@OriginalMember(owner = "client!en", name = "l", descriptor = "(B)Lclient!mga;")
	public final Class68_Sub2 method4811() {
		return this.aClass68_Sub2_18;
	}

	@OriginalMember(owner = "client!en", name = "m", descriptor = "(B)V")
	protected final void method4812() {
		@Pc(13) Hashtable local13 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(24) Enumeration local24 = this.aHashtable5.keys();
			while (local24.hasMoreElements()) {
				@Pc(30) Canvas local30 = (Canvas) local24.nextElement();
				local13.put(local30, this.method4862(local30));
			}
		}
		this.aHashtable5 = local13;
		this.method4775();
		this.method4807();
		this.aClass318_3.method7044(this);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt5751 + this.anInt5753 + this.anInt5754;
	}

	@OriginalMember(owner = "client!en", name = "n", descriptor = "(B)V")
	protected abstract void method4813();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([BLclient!ec;IIZZII)Lclient!ls;")
	protected abstract Interface14 method4814(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!ir;)V")
	@Override
	public final void method6193(@OriginalArg(0) Class164 arg0) {
		this.aClass318_3.method7045(-1, this, arg0);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method4815(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!gb;I)V")
	public final void method4816(@OriginalArg(0) int arg0, @OriginalArg(1) Class119 arg1) {
		this.method4754(arg0, arg1);
	}

	@OriginalMember(owner = "client!en", name = "D", descriptor = "(I)V")
	protected abstract void method4817();

	@OriginalMember(owner = "client!en", name = "E", descriptor = "(I)Lclient!mga;")
	public final Class68_Sub2 method4818() {
		return this.aClass68_Sub2Array3[this.anInt5771];
	}

	@OriginalMember(owner = "client!en", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public final boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass68_Sub2_16.method5105((float) arg1, (float) arg2, (float) arg0);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass68_Sub2_16.method5105((float) arg4, (float) arg5, (float) arg3);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt5786 > local14 && local31 < (float) this.anInt5786 || !(!(local14 > (float) this.anInt5765) || !((float) this.anInt5765 < local31))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt5755 * this.aClass68_Sub2_16.method5122((float) arg1, (float) arg0, (float) arg2) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt5755 * this.aClass68_Sub2_16.method5122((float) arg4, (float) arg3, (float) arg5) / local31);
		if ((float) local81 < this.aFloat160 && (float) local99 < this.aFloat160 || (float) local81 > this.aFloat155 && this.aFloat155 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt5774 * this.aClass68_Sub2_16.method5103((float) arg0, (float) arg1, (float) arg2) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt5774 * this.aClass68_Sub2_16.method5103((float) arg3, (float) arg4, (float) arg5) / local31);
			return (!((float) local143 < this.aFloat158) || !(this.aFloat158 > (float) local161)) && (!(this.aFloat153 < (float) local143) || !((float) local161 > this.aFloat153));
		}
	}

	@OriginalMember(owner = "client!en", name = "t", descriptor = "()Lclient!q;")
	@Override
	public final Class68 method6235() {
		return this.aClass68_Sub2_16;
	}

	@OriginalMember(owner = "client!en", name = "F", descriptor = "(I)V")
	protected abstract void method4819();

	@OriginalMember(owner = "client!en", name = "va", descriptor = "(I)V")
	@Override
	public final void va(@OriginalArg(0) int arg0) {
		this.anInt5756 = 0;
		while (arg0 > 1) {
			this.anInt5756++;
			arg0 >>= 0x1;
		}
		this.anInt5784 = 0x1 << this.anInt5756;
	}

	@OriginalMember(owner = "client!en", name = "G", descriptor = "(I)V")
	private void method4820() {
		this.method4863(this.anInterface16_11, 0);
		this.method4757(this.aClass199_19);
		this.method4849(Static380.aClass213_6, 0, 1);
	}

	@OriginalMember(owner = "client!en", name = "o", descriptor = "(B)V")
	private void method4821() {
		this.method4779();
		this.method4817();
		this.method4867();
		this.method4831();
		this.method4843();
		this.method4782();
		this.method4781();
		this.method4825();
		this.method4755();
		this.method4802();
		this.method4803();
		this.method4822();
		this.method4856();
		this.method4868();
		for (@Pc(57) int local57 = this.anInt5775 - 1; local57 >= 0; local57--) {
			this.method4860(local57);
			this.method4786();
			this.method4751();
			this.method4804();
		}
		this.method4756();
		this.method4798();
		this.method4840();
		this.method4767();
		this.method4874();
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(Z)V")
	protected abstract void method4822();

	@OriginalMember(owner = "client!en", name = "da", descriptor = "(IIII)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt5608 - 1 && arg1 <= 0 && this.anInt5630 - 1 <= arg3) {
			this.JA();
			return;
		}
		this.anInt5778 = arg0 >= 0 ? arg0 : 0;
		this.anInt5794 = arg1 >= 0 ? arg1 : 0;
		this.anInt5780 = arg3 > this.anInt5608 ? 0 : arg3;
		this.anInt5793 = this.anInt5608 < arg2 ? 0 : arg2;
		if (!this.aBoolean458) {
			this.aBoolean458 = true;
			this.method4819();
		}
		this.method4769();
		this.method4791();
	}

	@OriginalMember(owner = "client!en", name = "p", descriptor = "(B)V")
	private void method4823() {
		this.aFloat164 = this.anInt5765;
	}

	@OriginalMember(owner = "client!en", name = "BA", descriptor = "()I")
	@Override
	public final int BA() {
		return this.anInt5786;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[Lclient!gga;)V")
	@Override
	public final void method6188(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub14[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub14Array3[local7] = arg1[local7];
		}
		this.anInt5785 = arg0;
		if (this.aClass302_6.method6803()) {
			this.method4831();
		}
	}

	@OriginalMember(owner = "client!en", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!en", name = "H", descriptor = "(I)V")
	protected final void method4824() {
		@Pc(15) Enumeration local15 = this.aHashtable5.keys();
		while (local15.hasMoreElements()) {
			@Pc(21) Canvas local21 = (Canvas) local15.nextElement();
			this.method4808(local21, this.aHashtable5.get(local21));
		}
		this.anInterface16_12.method5772();
		this.anInterface16_11.method5772();
		this.aClass66_Sub1_24.method3691();
		this.aClass66_Sub1_30.method3691();
		this.aClass66_Sub1_28.method3691();
		this.aClass66_Sub1_21.method3691();
		this.aClass66_Sub1_29.method3691();
		this.aClass318_3.method7048();
		this.anInterface11_5.method5772();
	}

	@OriginalMember(owner = "client!en", name = "A", descriptor = "()V")
	@Override
	protected void method6250() {
		if (this.aBoolean448) {
			return;
		}
		for (@Pc(13) Class2 local13 = this.aClass8_29.method210(); local13 != null; local13 = this.aClass8_29.method218()) {
			((Class2_Sub13_Sub2) local13).method5545();
		}
		@Pc(30) Enumeration local30 = this.aHashtable5.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method4808(local36, this.aHashtable5.get(local36));
		}
		Static304.method4555(false, true);
		this.aNativeInterface3.release();
		this.aBoolean448 = true;
	}

	@OriginalMember(owner = "client!en", name = "V", descriptor = "(IIII)V")
	@Override
	public final void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt5778) {
			local5 = true;
			this.anInt5778 = arg0;
		}
		if (this.anInt5793 > arg2) {
			this.anInt5793 = arg2;
			local5 = true;
		}
		if (this.anInt5794 < arg1) {
			local5 = true;
			this.anInt5794 = arg1;
		}
		if (this.anInt5780 > arg3) {
			local5 = true;
			this.anInt5780 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean458) {
			this.aBoolean458 = true;
			this.method4819();
		}
		this.method4769();
		this.method4791();
	}

	@OriginalMember(owner = "client!en", name = "I", descriptor = "(I)V")
	protected abstract void method4825();

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(II)I")
	@Override
	public final int method6216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!en", name = "B", descriptor = "()Z")
	@Override
	public final boolean method6254() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(ZI)V")
	public final void method4826(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean451) {
			this.aBoolean451 = arg0;
			this.method4867();
		}
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "()Z")
	@Override
	public final boolean method6194() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZBZI)V")
	private void method4827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(10) boolean local10 = arg2 & this.method6187();
		if (!local10 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			arg4 = 2;
			arg0 = 1;
			arg1 = 0;
		}
		if (arg4 != 0 && arg3) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (this.anInt5772 != arg4) {
			if (this.anInt5772 != 0) {
				this.aClass56Array3[Integer.MAX_VALUE & this.anInt5772].method7183();
			}
			if (arg4 == 0) {
				this.aClass56_3 = null;
			} else {
				this.aClass56_3 = this.aClass56Array3[arg4 & Integer.MAX_VALUE];
				this.aClass56_3.method7174(arg3);
				this.aClass56_3.method7171(arg3);
				this.aClass56_3.method7182(arg1, arg0);
			}
			this.anInt5759 = arg1;
			this.anInt5772 = arg4;
			this.anInt5792 = arg0;
		} else if (this.anInt5772 != 0) {
			this.aClass56Array3[Integer.MAX_VALUE & this.anInt5772].method7171(arg3);
			if (arg1 != this.anInt5759 || this.anInt5792 != arg0) {
				this.aClass56Array3[Integer.MAX_VALUE & this.anInt5772].method7182(arg1, arg0);
				this.anInt5792 = arg0;
				this.anInt5759 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "J", descriptor = "(I)V")
	public final void method4828() {
		if (this.anInt5783 == 8) {
			return;
		}
		this.method4836();
		this.method4857(true);
		this.method4832(true);
		this.method4871(true);
		this.method4801(1);
		this.anInt5783 = 8;
	}

	@OriginalMember(owner = "client!en", name = "oa", descriptor = "([I)V")
	@Override
	public final void oa(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt5780;
		arg0[2] = this.anInt5793;
		arg0[0] = this.anInt5778;
		arg0[1] = this.anInt5794;
	}

	@OriginalMember(owner = "client!en", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt5765;
	}

	@OriginalMember(owner = "client!en", name = "m", descriptor = "(IIIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6190(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!en", name = "AA", descriptor = "(III[I)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass68_Sub2_16.method5105((float) arg1, (float) arg2, (float) arg0);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt5755 * this.aClass68_Sub2_16.method5122((float) arg1, (float) arg0, (float) arg2) / local14);
			local25 = (int) ((float) this.anInt5774 * this.aClass68_Sub2_16.method5103((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local25 = this.anInt5764;
			local28 = this.anInt5788;
		}
		arg3[0] = (int) ((float) local28 - this.aFloat160);
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local25 - this.aFloat158);
	}

	@OriginalMember(owner = "client!en", name = "L", descriptor = "()V")
	@Override
	public final void L() {
		this.aBoolean449 = false;
	}

	@OriginalMember(owner = "client!en", name = "K", descriptor = "(I)V")
	protected abstract void method4829();

	@OriginalMember(owner = "client!en", name = "L", descriptor = "(I)I")
	public final int method4830() {
		return this.anInt5771;
	}

	@OriginalMember(owner = "client!en", name = "M", descriptor = "(I)V")
	protected void method4831() {
		this.anInt5763 = this.anInt5785;
		this.anInt5785 = 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BZ)V")
	public final void method4832(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean445) {
			this.aBoolean445 = arg0;
			this.method4825();
			this.anInt5783 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!en", name = "N", descriptor = "(I)V")
	public final void method4833() {
		if (this.anInt5783 == 16) {
			return;
		}
		this.method4839();
		this.method4857(true);
		this.method4832(true);
		this.method4871(true);
		this.method4801(1);
		this.anInt5783 = 16;
	}

	@OriginalMember(owner = "client!en", name = "ra", descriptor = "(F)V")
	@Override
	public final void ra(@OriginalArg(0) float arg0) {
		if (this.aFloat166 != arg0) {
			this.aFloat166 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method4779();
			this.method4782();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;I)Lclient!jaclib/memory/Stream;")
	public final Stream method4834(@OriginalArg(0) Buffer arg0) {
		this.aStream5.a(arg0);
		return this.aStream5;
	}

	@OriginalMember(owner = "client!en", name = "r", descriptor = "()Z")
	@Override
	public final boolean method6230() {
		return false;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(ZB)V")
	public final void method4835(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean446) {
			this.aBoolean446 = arg0;
			this.method4781();
		}
	}

	@OriginalMember(owner = "client!en", name = "O", descriptor = "(I)V")
	private void method4836() {
		if (this.aClass302_6 == Static441.aClass302_7) {
			return;
		}
		@Pc(6) Class302 local6 = this.aClass302_6;
		this.aClass302_6 = Static441.aClass302_7;
		if (!local6.method6803()) {
			this.method4870();
		}
		this.method4879();
		this.aFloatArray51 = this.aFloatArray46;
		this.method4854();
		this.anInt5783 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public final Class39 method6236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class39_Sub3 local11 = new Class39_Sub3(this, arg2, arg3, arg4);
		local11.da(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(IIIIII)Lclient!jt;")
	@Override
	public final Class37 method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class37_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZZ)Lclient!nba;")
	public abstract Interface16 method4837(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZI[IB)Lclient!ls;")
	public final Interface14 method4838(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		return this.method4787(arg3, arg1, 0, 0, arg0, arg2);
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V")
	@Override
	public final void method6244(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!en", name = "q", descriptor = "(B)V")
	private void method4839() {
		if (Static153.aClass302_3 == this.aClass302_6) {
			return;
		}
		@Pc(16) Class302 local16 = this.aClass302_6;
		this.aClass302_6 = Static153.aClass302_3;
		if (!local16.method6803()) {
			this.method4870();
		}
		this.method4800();
		this.aFloatArray51 = this.aFloatArray47;
		this.method4854();
		this.anInt5783 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!en", name = "P", descriptor = "(I)V")
	protected abstract void method4840();

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6251(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas7) {
			throw new RuntimeException();
		} else if (!this.aHashtable5.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) Object local53 = this.method4862(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "(Z)V")
	private void method4841() {
		if (this.aCanvas8 == null) {
			this.anInt5678 = this.anInt5720 = 1;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas8.getSize();
			this.anInt5720 = local14.height;
			this.anInt5678 = local14.width;
		}
		this.anInt5630 = this.anInt5720;
		this.anInt5608 = this.anInt5678;
		this.method4766();
		this.method4785();
		this.method4773();
		this.method4798();
		this.method4791();
		this.method4762();
		this.JA();
	}

	@OriginalMember(owner = "client!en", name = "Q", descriptor = "(I)Lclient!mga;")
	public final Class68_Sub2 method4842() {
		if (!this.aBoolean457) {
			this.aClass68_Sub2_20.method5113(this.aClass68_Sub2_18, this.aClass68_Sub2_15);
			this.aBoolean457 = true;
		}
		return this.aClass68_Sub2_20;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V")
	@Override
	public final void method6242(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!en", name = "i", descriptor = "(Z)V")
	public abstract void method4843();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(FB)V")
	public final void method4844(@OriginalArg(0) float arg0) {
		if (this.aFloat157 != arg0) {
			this.aFloat157 = arg0;
			this.method4773();
		}
	}

	@OriginalMember(owner = "client!en", name = "R", descriptor = "(I)Lclient!oq;")
	public final Interface20 method4845() {
		return this.aClass37_Sub2_3 == null ? null : this.aClass37_Sub2_3.method6642();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!ec;IILclient!bt;)Lclient!ls;")
	public abstract Interface14 method4846(@OriginalArg(1) Class88 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42 arg3);

	@OriginalMember(owner = "client!en", name = "p", descriptor = "()Lclient!q;")
	@Override
	public final Class68 method6222() {
		return this.aClass68_Sub2_21;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)V")
	@Override
	public final void method6239(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!en", name = "S", descriptor = "(I)I")
	public final int method4847() {
		return this.anInt5790;
	}

	@OriginalMember(owner = "client!en", name = "j", descriptor = "(Z)V")
	public final void method4848() {
		if (this.anInt5783 == 4) {
			return;
		}
		this.method4882();
		this.method4857(false);
		this.method4774(false);
		this.method4832(false);
		this.method4871(false);
		this.method4761(-2, false, false);
		this.method4801(1);
		this.method4872(0);
		this.anInt5783 = 4;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!lt;III)V")
	public abstract void method4849(@OriginalArg(0) Class213 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	@Override
	public void method6205(@OriginalArg(0) int arg0) {
		if (this.aClass298_3 != null) {
			this.aClass298_3.method6785();
		}
		this.anInt5768 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!mga;)V")
	public final void method4850(@OriginalArg(1) Class68_Sub2 arg0) {
		this.aClass68_Sub2_15.M(arg0);
		this.aBoolean437 = false;
		this.method4865();
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6207(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas7 == arg0) {
			local5 = this.anObject31;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method4815(local5, arg0);
		if (arg0 == this.aCanvas8) {
			this.method4841();
		}
	}

	@OriginalMember(owner = "client!en", name = "r", descriptor = "(B)F")
	protected abstract float method4851();

	@OriginalMember(owner = "client!en", name = "s", descriptor = "(B)V")
	public final void method4852() {
		this.anInterface10Array3 = new Interface10[this.anInt5775];
		this.aClass236Array5 = new Class236[this.anInt5775];
		this.aClass68_Sub2Array3 = new Class68_Sub2[this.anInt5775];
		this.aClass190Array3 = new Class190[this.anInt5775];
		this.aClass236Array6 = new Class236[this.anInt5775];
		for (@Pc(38) int local38 = 0; local38 < this.anInt5775; local38++) {
			this.aClass236Array6[local38] = Static458.aClass236_4;
			this.aClass236Array5[local38] = Static458.aClass236_4;
			this.aClass190Array3[local38] = Static248.aClass190_3;
			this.aClass68_Sub2Array3[local38] = new Class68_Sub2();
		}
		this.aClass2_Sub14Array3 = new Class2_Sub14[this.anInt5773 - 2];
		this.anInterface10_3 = this.method4846(Static356.aClass88_11, 1, 1, Static47.aClass42_4);
		this.method6223(new Class2_Sub13_Sub2(262144));
		this.aClass199_15 = this.method4853(new Class89[] { new Class89(new Class181[] { Static263.aClass181_1, Static263.aClass181_5 }) });
		this.aClass199_17 = this.method4853(new Class89[] { new Class89(new Class181[] { Static263.aClass181_1, Static263.aClass181_3 }) });
		this.aClass199_16 = this.method4853(new Class89[] { new Class89(Static263.aClass181_1), new Class89(Static263.aClass181_3), new Class89(Static263.aClass181_5), new Class89(Static263.aClass181_2) });
		this.aClass199_14 = this.method4853(new Class89[] { new Class89(Static263.aClass181_1), new Class89(Static263.aClass181_3), new Class89(Static263.aClass181_5) });
		this.aClass66_Sub1_26 = new Class66_Sub1(this, 0, 0, false, false);
		this.aClass66_Sub1_24 = new Class66_Sub1(this, 0, 0, true, true);
		this.aClass66_Sub1_25 = new Class66_Sub1(this, 0, 0, false, false);
		this.aClass66_Sub1_30 = new Class66_Sub1(this, 0, 0, true, true);
		this.aClass66_Sub1_27 = new Class66_Sub1(this, 0, 0, false, false);
		this.aClass66_Sub1_28 = new Class66_Sub1(this, 0, 0, true, true);
		this.aClass66_Sub1_23 = new Class66_Sub1(this, 0, 0, false, false);
		this.aClass66_Sub1_21 = new Class66_Sub1(this, 0, 0, true, true);
		this.aClass66_Sub1_22 = new Class66_Sub1(this, 0, 0, false, false);
		this.aClass66_Sub1_29 = new Class66_Sub1(this, 0, 0, true, true);
		this.aClass318_3 = new Class318(this);
		this.anInterface11_5 = this.method4777(true);
		this.method4812();
		this.aClass31_6 = new Class31(this);
		this.aClass56Array3[1] = this.method4866(1);
		this.aClass56Array3[2] = this.method4866(2);
		this.aClass56Array3[4] = this.method4866(4);
		this.aClass56Array3[5] = this.method4866(5);
		this.aClass56Array3[6] = this.method4866(6);
		this.aClass56Array3[7] = this.method4866(7);
		this.aClass56Array3[3] = this.method4866(3);
		this.aClass56Array3[8] = this.method4866(8);
		this.aClass56Array3[9] = this.method4866(9);
		if (!this.aClass56Array3[2].method7172()) {
			this.aClass56Array3[2] = this.method4866(0);
		}
		if (!this.aClass56Array3[4].method7172()) {
			this.aClass56Array3[4] = this.aClass56Array3[2];
		}
		if (!this.aClass56Array3[8].method7172()) {
			this.aClass56Array3[8] = this.aClass56Array3[4];
		}
		if (!this.aClass56Array3[9].method7172()) {
			this.aClass56Array3[9] = this.aClass56Array3[8];
		}
		this.method4873();
		this.JA();
		this.method6231();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public final Class39 method6204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class39_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([Lclient!eda;Z)Lclient!mq;")
	public abstract Class199 method4853(@OriginalArg(0) Class89[] arg0);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method6217(@OriginalArg(0) Class68 arg0) {
		this.aClass68_Sub2_16 = (Class68_Sub2) arg0;
		this.aClass68_Sub2_18.M(this.aClass68_Sub2_16);
		this.aClass68_Sub2_18.method5117();
		this.aClass68_Sub2_19.method5115(this.aClass68_Sub2_18);
		this.aClass68_Sub2_17.method5115(this.aClass68_Sub2_16);
		if (this.aClass302_6.method6803()) {
			this.method4870();
		}
	}

	@OriginalMember(owner = "client!en", name = "t", descriptor = "(B)V")
	private void method4854() {
		this.method4840();
		if (this.aClass56_3 != null) {
			this.aClass56_3.method7179();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!rca;I)V")
	public abstract void method4855(@OriginalArg(0) Class280 arg0);

	@OriginalMember(owner = "client!en", name = "k", descriptor = "(Z)V")
	protected abstract void method4856();

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(ZI)V")
	public final void method4857(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean441) {
			this.aBoolean441 = arg0;
			this.method4802();
			this.anInt5783 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!en", name = "T", descriptor = "(I)V")
	public final void method4858() {
		this.aBoolean437 = false;
		this.method4865();
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "()Z")
	@Override
	public final boolean method6192() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(II)V")
	public abstract void method4859(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(II)V")
	public final void method4860(@OriginalArg(1) int arg0) {
		if (this.anInt5771 != arg0) {
			this.anInt5771 = arg0;
			this.method4770();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	protected abstract void method4861(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method4862(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BLclient!nba;I)V")
	public abstract void method4863(@OriginalArg(1) Interface16 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!en", name = "U", descriptor = "(I)I")
	public final int method4864() {
		return this.anInt5757;
	}

	@OriginalMember(owner = "client!en", name = "V", descriptor = "(I)V")
	private void method4865() {
		if (this.aClass302_6 == Static102.aClass302_1) {
			@Pc(17) float local17 = this.method4851();
			this.aClass68_Sub2_15.method5100(local17, 0.0F, local17);
		}
		this.aBoolean457 = false;
		this.method4767();
		if (this.aClass56_3 != null) {
			this.aClass56_3.method7175();
		}
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V")
	@Override
	public final void method6249(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(BI)Lclient!cl;")
	protected Class56 method4866(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class56_Sub10(this);
		} else if (arg0 == 1) {
			return new Class56_Sub8(this);
		} else if (arg0 == 2) {
			return new Class56_Sub5(this, this.aClass31_6);
		} else if (arg0 == 7) {
			return new Class56_Sub6(this);
		} else {
			return new Class56_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6201(@OriginalArg(0) Canvas arg0) {
		this.anObject31 = null;
		this.aCanvas8 = null;
		if (arg0 == null || arg0 == this.aCanvas7) {
			this.anObject31 = this.anObject30;
			this.aCanvas8 = this.aCanvas7;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject31 = this.aHashtable5.get(arg0);
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.anObject31 == null) {
			throw new RuntimeException();
		}
		this.method4861(this.anObject31, this.aCanvas8);
		this.method4841();
	}

	@OriginalMember(owner = "client!en", name = "W", descriptor = "(I)V")
	protected abstract void method4867();

	@OriginalMember(owner = "client!en", name = "o", descriptor = "()Z")
	@Override
	public final boolean method6219() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method4851();
		this.method4763();
		this.method4877(arg4);
		this.method4883(0, Static224.aClass119_18);
		this.method4816(0, Static224.aClass119_18);
		this.method4801(arg5);
		this.aClass68_Sub2_15.method5108((float) (arg2 - 1), (float) (arg3 - 1), 1.0F);
		this.aClass68_Sub2_15.method5100((float) arg0 - local7, 0.0F, (float) arg1 - local7);
		this.method4858();
		this.method4881(false);
		this.method4772(4, Static275.aClass213_4);
		this.method4881(true);
		this.method4816(0, Static325.aClass119_44);
		this.method4883(0, Static325.aClass119_44);
	}

	@OriginalMember(owner = "client!en", name = "X", descriptor = "(I)V")
	protected abstract void method4868();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([BIILclient!ec;ZB)Lclient!ls;")
	public final Interface14 method4869(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) boolean arg4) {
		return this.method4814(arg0, arg3, arg2, arg4, arg1);
	}

	@OriginalMember(owner = "client!en", name = "l", descriptor = "(Z)V")
	private void method4870() {
		this.aBoolean457 = false;
		if (this.aClass56_3 != null) {
			this.aClass56_3.method7176();
		}
		this.method4874();
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(ZB)V")
	public final void method4871(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean450) {
			this.aBoolean450 = arg0;
			this.method4755();
			this.anInt5783 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(II)V")
	public final void method4872(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4797(Static291.aClass236_2, Static291.aClass236_2);
		} else if (arg0 == 0) {
			this.method4797(Static458.aClass236_4, Static458.aClass236_4);
			return;
		} else if (arg0 == 2) {
			this.method4797(Static583.aClass236_5, Static291.aClass236_2);
			return;
		} else if (arg0 == 3) {
			this.method4797(Static202.aClass236_1, Static458.aClass236_4);
			return;
		} else if (arg0 == 4) {
			this.method4797(Static395.aClass236_3, Static395.aClass236_3);
			return;
		}
	}

	@OriginalMember(owner = "client!en", name = "u", descriptor = "(B)V")
	protected void method4873() {
		this.method4821();
	}

	@OriginalMember(owner = "client!en", name = "v", descriptor = "(B)V")
	protected abstract void method4874();

	@OriginalMember(owner = "client!en", name = "x", descriptor = "()Z")
	@Override
	public final boolean method6246() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLclient!gb;IZB)V")
	public abstract void method4875(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!hfa;I)V")
	public final void method4876(@OriginalArg(0) Interface10 arg0) {
		if (this.anInterface10Array3[this.anInt5771] == arg0) {
			return;
		}
		this.anInterface10Array3[this.anInt5771] = arg0;
		if (arg0 == null) {
			this.method4829();
		} else {
			arg0.method7049();
		}
		this.anInt5783 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(BI)V")
	public final void method4877(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt5776) {
			this.anInt5776 = arg0;
			this.method4756();
		}
	}

	@OriginalMember(owner = "client!en", name = "GA", descriptor = "(II)V")
	@Override
	public final void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5786 == arg0 && this.anInt5765 == arg1) {
			return;
		}
		this.anInt5786 = arg0;
		this.anInt5765 = arg1;
		this.method4785();
		this.method4773();
		this.method4778();
	}

	@OriginalMember(owner = "client!en", name = "Y", descriptor = "(I)Lclient!mga;")
	public final Class68_Sub2 method4878() {
		return this.aClass68_Sub2_15;
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "()Z")
	@Override
	public final boolean method6196() {
		return false;
	}

	@OriginalMember(owner = "client!en", name = "w", descriptor = "(B)V")
	private void method4879() {
		if (this.aBoolean455) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray46;
		@Pc(21) float local21 = (float) (-this.anInt5788 * this.anInt5786) / (float) this.anInt5755;
		@Pc(36) float local36 = (float) ((this.anInt5608 - this.anInt5788) * this.anInt5786) / (float) this.anInt5755;
		@Pc(47) float local47 = (float) (this.anInt5786 * this.anInt5764) / (float) this.anInt5774;
		@Pc(62) float local62 = (float) ((this.anInt5764 - this.anInt5630) * this.anInt5786) / (float) this.anInt5774;
		if (local21 == local36 || local62 == local47) {
			local9[4] = 0.0F;
			local9[13] = 0.0F;
			local9[1] = 0.0F;
			local9[7] = 0.0F;
			local9[15] = 1.0F;
			local9[6] = 0.0F;
			local9[9] = 0.0F;
			local9[14] = 0.0F;
			local9[11] = 0.0F;
			local9[3] = 0.0F;
			local9[12] = 0.0F;
			local9[2] = 0.0F;
			local9[10] = 1.0F;
			local9[5] = 1.0F;
			local9[8] = 0.0F;
			local9[0] = 1.0F;
		} else {
			@Pc(142) float local142 = (float) this.anInt5786 * 2.0F;
			local9[5] = local142 / (local47 - local62);
			local9[12] = 0.0F;
			local9[2] = 0.0F;
			local9[14] = this.aFloat163 = (float) (this.anInt5786 * this.anInt5765) / (float) (this.anInt5786 - this.anInt5765);
			local9[4] = 0.0F;
			local9[13] = 0.0F;
			local9[6] = 0.0F;
			local9[15] = 0.0F;
			local9[11] = -1.0F;
			local9[10] = this.aFloat165 = (float) this.anInt5765 / (float) (this.anInt5786 - this.anInt5765);
			local9[9] = (local47 + local62) / (-local62 + local47);
			local9[3] = 0.0F;
			local9[0] = local142 / (local36 - local21);
			local9[8] = (local36 + local21) / (local36 - local21);
			local9[1] = 0.0F;
			local9[7] = 0.0F;
		}
		this.method4790();
		this.aBoolean455 = true;
	}

	@OriginalMember(owner = "client!en", name = "Z", descriptor = "(I)Lclient!mga;")
	public final Class68_Sub2 method4880() {
		return this.aClass68_Sub2_19;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!ir;I)V")
	@Override
	public final void method6257(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1) {
		this.aClass318_3.method7045(arg1, this, arg0);
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(ZB)V")
	public abstract void method4881(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!en", name = "m", descriptor = "(Z)V")
	private void method4882() {
		if (Static102.aClass302_1 == this.aClass302_6) {
			return;
		}
		@Pc(16) Class302 local16 = this.aClass302_6;
		this.aClass302_6 = Static102.aClass302_1;
		if (local16.method6803()) {
			this.method4870();
		}
		this.method4793();
		this.aFloatArray51 = this.aFloatArray44;
		this.method4854();
		this.anInt5783 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IILclient!gb;)V")
	public final void method4883(@OriginalArg(0) int arg0, @OriginalArg(2) Class119 arg1) {
		this.method4875(false, arg1, arg0, false);
	}

	@OriginalMember(owner = "client!en", name = "w", descriptor = "()V")
	@Override
	public final void method6245() {
		if (this.aClass298_3 != null) {
			this.aClass298_3.method6788();
		}
	}
}
