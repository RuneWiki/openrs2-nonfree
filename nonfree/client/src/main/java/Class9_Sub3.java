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

@OriginalClass("client!fo")
public abstract class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!fo", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!fo", name = "jc", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!fo", name = "yc", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable6;

	@OriginalMember(owner = "client!fo", name = "Wc", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!fo", name = "ed", descriptor = "Lclient!ie;")
	protected Class149 aClass149_5;

	@OriginalMember(owner = "client!fo", name = "Od", descriptor = "I")
	public int anInt6523;

	@OriginalMember(owner = "client!fo", name = "Pd", descriptor = "I")
	public int anInt6524;

	@OriginalMember(owner = "client!fo", name = "Rd", descriptor = "I")
	protected int anInt6525;

	@OriginalMember(owner = "client!fo", name = "Xd", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!fo", name = "fe", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!fo", name = "ge", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!fo", name = "je", descriptor = "[Lclient!oh;")
	protected Class238[] aClass238Array5;

	@OriginalMember(owner = "client!fo", name = "ke", descriptor = "I")
	protected int anInt6530;

	@OriginalMember(owner = "client!fo", name = "le", descriptor = "F")
	private float aFloat135;

	@OriginalMember(owner = "client!fo", name = "me", descriptor = "Z")
	public boolean aBoolean478;

	@OriginalMember(owner = "client!fo", name = "oe", descriptor = "[Lclient!od;")
	protected Class6_Sub29[] aClass6_Sub29Array4;

	@OriginalMember(owner = "client!fo", name = "re", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!fo", name = "te", descriptor = "Z")
	public boolean aBoolean479;

	@OriginalMember(owner = "client!fo", name = "ue", descriptor = "I")
	private int anInt6534;

	@OriginalMember(owner = "client!fo", name = "ve", descriptor = "F")
	private float aFloat137;

	@OriginalMember(owner = "client!fo", name = "we", descriptor = "Lclient!or;")
	private Class37 aClass37_3;

	@OriginalMember(owner = "client!fo", name = "Fe", descriptor = "[Lclient!vw;")
	protected Class340[] aClass340Array3;

	@OriginalMember(owner = "client!fo", name = "Ie", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!fo", name = "Le", descriptor = "I")
	public int anInt6541;

	@OriginalMember(owner = "client!fo", name = "Pe", descriptor = "[Lclient!oh;")
	protected Class238[] aClass238Array6;

	@OriginalMember(owner = "client!fo", name = "Ue", descriptor = "Lclient!dba;")
	private Class65_Sub1 aClass65_Sub1_3;

	@OriginalMember(owner = "client!fo", name = "Xe", descriptor = "Z")
	protected boolean aBoolean487;

	@OriginalMember(owner = "client!fo", name = "af", descriptor = "F")
	private float aFloat140;

	@OriginalMember(owner = "client!fo", name = "hf", descriptor = "I")
	private int anInt6550;

	@OriginalMember(owner = "client!fo", name = "zf", descriptor = "Z")
	public boolean aBoolean491;

	@OriginalMember(owner = "client!fo", name = "Df", descriptor = "I")
	public int anInt6558;

	@OriginalMember(owner = "client!fo", name = "Ef", descriptor = "[Lclient!ld;")
	private Interface10[] anInterface10Array3;

	@OriginalMember(owner = "client!fo", name = "Hf", descriptor = "Z")
	protected boolean aBoolean493;

	@OriginalMember(owner = "client!fo", name = "If", descriptor = "Lclient!ld;")
	public Interface10 anInterface10_3;

	@OriginalMember(owner = "client!fo", name = "Lf", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!fo", name = "Mf", descriptor = "I")
	protected int anInt6559;

	@OriginalMember(owner = "client!fo", name = "Pf", descriptor = "Lclient!tt;")
	private Class308 aClass308_3;

	@OriginalMember(owner = "client!fo", name = "Rf", descriptor = "[Lclient!ww;")
	protected Class8_Sub3[] aClass8_Sub3Array3;

	@OriginalMember(owner = "client!fo", name = "Sf", descriptor = "I")
	protected int anInt6561;

	@OriginalMember(owner = "client!fo", name = "Tf", descriptor = "I")
	protected int anInt6562;

	@OriginalMember(owner = "client!fo", name = "Uf", descriptor = "I")
	public int anInt6563;

	@OriginalMember(owner = "client!fo", name = "Vf", descriptor = "I")
	public int anInt6564;

	@OriginalMember(owner = "client!fo", name = "Wf", descriptor = "Lclient!ge;")
	public Class23_Sub1 aClass23_Sub1_21;

	@OriginalMember(owner = "client!fo", name = "Xf", descriptor = "Lclient!ge;")
	public Class23_Sub1 aClass23_Sub1_22;

	@OriginalMember(owner = "client!fo", name = "Yf", descriptor = "Lclient!tj;")
	private Interface21 anInterface21_5;

	@OriginalMember(owner = "client!fo", name = "Zf", descriptor = "Lclient!ge;")
	public Class23_Sub1 aClass23_Sub1_23;

	@OriginalMember(owner = "client!fo", name = "ag", descriptor = "Lclient!tfa;")
	private Interface20 anInterface20_7;

	@OriginalMember(owner = "client!fo", name = "bg", descriptor = "Lclient!ge;")
	public Class23_Sub1 aClass23_Sub1_24;

	@OriginalMember(owner = "client!fo", name = "cg", descriptor = "Lclient!eh;")
	public Class88 aClass88_13;

	@OriginalMember(owner = "client!fo", name = "dg", descriptor = "Lclient!ge;")
	public Class23_Sub1 aClass23_Sub1_25;

	@OriginalMember(owner = "client!fo", name = "eg", descriptor = "Lclient!ge;")
	public Class23_Sub1 aClass23_Sub1_26;

	@OriginalMember(owner = "client!fo", name = "gg", descriptor = "Lclient!ge;")
	public Class23_Sub1 aClass23_Sub1_27;

	@OriginalMember(owner = "client!fo", name = "hg", descriptor = "Lclient!eh;")
	private Class88 aClass88_14;

	@OriginalMember(owner = "client!fo", name = "ig", descriptor = "Lclient!eh;")
	public Class88 aClass88_15;

	@OriginalMember(owner = "client!fo", name = "jg", descriptor = "Lclient!eh;")
	public Class88 aClass88_16;

	@OriginalMember(owner = "client!fo", name = "kg", descriptor = "Lclient!ge;")
	public Class23_Sub1 aClass23_Sub1_28;

	@OriginalMember(owner = "client!fo", name = "lg", descriptor = "Lclient!ge;")
	public Class23_Sub1 aClass23_Sub1_29;

	@OriginalMember(owner = "client!fo", name = "mg", descriptor = "Lclient!eh;")
	public Class88 aClass88_17;

	@OriginalMember(owner = "client!fo", name = "ng", descriptor = "Lclient!ge;")
	public Class23_Sub1 aClass23_Sub1_30;

	@OriginalMember(owner = "client!fo", name = "og", descriptor = "Lclient!eh;")
	private Class88 aClass88_18;

	@OriginalMember(owner = "client!fo", name = "pg", descriptor = "Lclient!tfa;")
	private Interface20 anInterface20_8;

	@OriginalMember(owner = "client!fo", name = "qg", descriptor = "Z")
	protected boolean aBoolean494;

	@OriginalMember(owner = "client!fo", name = "rg", descriptor = "I")
	private int anInt6565;

	@OriginalMember(owner = "client!fo", name = "Ed", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_48 = new Class211();

	@OriginalMember(owner = "client!fo", name = "Qd", descriptor = "Z")
	protected boolean aBoolean474 = true;

	@OriginalMember(owner = "client!fo", name = "Nd", descriptor = "Lclient!ww;")
	protected final Class8_Sub3 aClass8_Sub3_15 = new Class8_Sub3();

	@OriginalMember(owner = "client!fo", name = "Sd", descriptor = "Lclient!ww;")
	public Class8_Sub3 aClass8_Sub3_16 = new Class8_Sub3();

	@OriginalMember(owner = "client!fo", name = "Td", descriptor = "Lclient!ww;")
	public final Class8_Sub3 aClass8_Sub3_17 = new Class8_Sub3();

	@OriginalMember(owner = "client!fo", name = "Ud", descriptor = "Lclient!ww;")
	protected final Class8_Sub3 aClass8_Sub3_18 = new Class8_Sub3();

	@OriginalMember(owner = "client!fo", name = "Vd", descriptor = "Lclient!ww;")
	private final Class8_Sub3 aClass8_Sub3_19 = new Class8_Sub3();

	@OriginalMember(owner = "client!fo", name = "Wd", descriptor = "Lclient!ww;")
	private final Class8_Sub3 aClass8_Sub3_20 = new Class8_Sub3();

	@OriginalMember(owner = "client!fo", name = "ae", descriptor = "I")
	public int anInt6527 = 512;

	@OriginalMember(owner = "client!fo", name = "ce", descriptor = "Z")
	protected boolean aBoolean475 = true;

	@OriginalMember(owner = "client!fo", name = "Yd", descriptor = "I")
	private int anInt6526 = 0;

	@OriginalMember(owner = "client!fo", name = "pe", descriptor = "I")
	public int anInt6531 = -1;

	@OriginalMember(owner = "client!fo", name = "Be", descriptor = "I")
	public int anInt6537 = -1;

	@OriginalMember(owner = "client!fo", name = "qe", descriptor = "I")
	protected int anInt6532 = 0;

	@OriginalMember(owner = "client!fo", name = "Je", descriptor = "Z")
	private boolean aBoolean483 = false;

	@OriginalMember(owner = "client!fo", name = "Ae", descriptor = "Z")
	protected boolean aBoolean480 = true;

	@OriginalMember(owner = "client!fo", name = "Ke", descriptor = "I")
	public int anInt6540 = 50;

	@OriginalMember(owner = "client!fo", name = "Te", descriptor = "Z")
	protected boolean aBoolean485 = true;

	@OriginalMember(owner = "client!fo", name = "Ve", descriptor = "I")
	private int anInt6546 = 1;

	@OriginalMember(owner = "client!fo", name = "Ne", descriptor = "I")
	protected int anInt6543 = 0;

	@OriginalMember(owner = "client!fo", name = "de", descriptor = "Z")
	protected boolean aBoolean476 = false;

	@OriginalMember(owner = "client!fo", name = "Ze", descriptor = "I")
	private int anInt6547 = 0;

	@OriginalMember(owner = "client!fo", name = "Oe", descriptor = "[F")
	public final float[] aFloatArray40 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!fo", name = "ne", descriptor = "[Lclient!or;")
	private final Class37[] aClass37Array3 = new Class37[10];

	@OriginalMember(owner = "client!fo", name = "De", descriptor = "I")
	protected final int anInt6539 = 0;

	@OriginalMember(owner = "client!fo", name = "ef", descriptor = "I")
	private int anInt6548 = -1;

	@OriginalMember(owner = "client!fo", name = "xf", descriptor = "F")
	public float aFloat144 = 1.0F;

	@OriginalMember(owner = "client!fo", name = "Zd", descriptor = "[F")
	private final float[] aFloatArray38 = new float[16];

	@OriginalMember(owner = "client!fo", name = "xe", descriptor = "I")
	public int anInt6535 = 0;

	@OriginalMember(owner = "client!fo", name = "We", descriptor = "Z")
	protected boolean aBoolean486 = false;

	@OriginalMember(owner = "client!fo", name = "cf", descriptor = "[F")
	private final float[] aFloatArray41 = new float[16];

	@OriginalMember(owner = "client!fo", name = "qf", descriptor = "F")
	public float aFloat143 = -1.0F;

	@OriginalMember(owner = "client!fo", name = "pf", descriptor = "I")
	protected int anInt6554 = 0;

	@OriginalMember(owner = "client!fo", name = "He", descriptor = "Z")
	protected boolean aBoolean482 = true;

	@OriginalMember(owner = "client!fo", name = "Ee", descriptor = "F")
	public float aFloat138 = 1.0F;

	@OriginalMember(owner = "client!fo", name = "nf", descriptor = "I")
	protected int anInt6553 = -1;

	@OriginalMember(owner = "client!fo", name = "Qe", descriptor = "I")
	public int anInt6544 = 0;

	@OriginalMember(owner = "client!fo", name = "vf", descriptor = "[F")
	public final float[] aFloatArray44 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!fo", name = "of", descriptor = "F")
	public float aFloat142 = -1.0F;

	@OriginalMember(owner = "client!fo", name = "Se", descriptor = "I")
	private int anInt6545 = 0;

	@OriginalMember(owner = "client!fo", name = "Cf", descriptor = "F")
	public float aFloat146 = 3584.0F;

	@OriginalMember(owner = "client!fo", name = "Gf", descriptor = "F")
	public float aFloat147 = 3584.0F;

	@OriginalMember(owner = "client!fo", name = "ff", descriptor = "Lclient!lu;")
	protected Class207 aClass207_8 = Static201.aClass207_7;

	@OriginalMember(owner = "client!fo", name = "Bf", descriptor = "I")
	private int anInt6557 = 0;

	@OriginalMember(owner = "client!fo", name = "sf", descriptor = "[F")
	private final float[] aFloatArray43 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!fo", name = "gf", descriptor = "I")
	public int anInt6549 = 512;

	@OriginalMember(owner = "client!fo", name = "uf", descriptor = "I")
	protected int anInt6555 = 0;

	@OriginalMember(owner = "client!fo", name = "lf", descriptor = "Z")
	private boolean aBoolean489 = false;

	@OriginalMember(owner = "client!fo", name = "kf", descriptor = "F")
	private float aFloat141 = 3000.0F;

	@OriginalMember(owner = "client!fo", name = "wf", descriptor = "[F")
	private final float[] aFloatArray45 = new float[16];

	@OriginalMember(owner = "client!fo", name = "ye", descriptor = "[F")
	private final float[] aFloatArray39 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!fo", name = "Re", descriptor = "Z")
	protected boolean aBoolean484 = false;

	@OriginalMember(owner = "client!fo", name = "tf", descriptor = "Z")
	private boolean aBoolean490 = false;

	@OriginalMember(owner = "client!fo", name = "bf", descriptor = "I")
	public int bf = 128;

	@OriginalMember(owner = "client!fo", name = "Of", descriptor = "I")
	protected int anInt6560 = 3584;

	@OriginalMember(owner = "client!fo", name = "Kf", descriptor = "Lclient!bd;")
	protected Class27 aClass27_4 = Static464.aClass27_5;

	@OriginalMember(owner = "client!fo", name = "Ye", descriptor = "Z")
	protected boolean aBoolean488 = true;

	@OriginalMember(owner = "client!fo", name = "he", descriptor = "Z")
	private boolean aBoolean477 = false;

	@OriginalMember(owner = "client!fo", name = "mf", descriptor = "I")
	protected final int anInt6552 = 0;

	@OriginalMember(owner = "client!fo", name = "rf", descriptor = "[F")
	private final float[] aFloatArray42 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!fo", name = "yf", descriptor = "I")
	public int anInt6556 = 0;

	@OriginalMember(owner = "client!fo", name = "jf", descriptor = "I")
	private int anInt6551 = -1;

	@OriginalMember(owner = "client!fo", name = "ze", descriptor = "I")
	protected int anInt6536 = 0;

	@OriginalMember(owner = "client!fo", name = "Af", descriptor = "F")
	public float aFloat145 = 1.0F;

	@OriginalMember(owner = "client!fo", name = "ie", descriptor = "I")
	public int anInt6529 = 3;

	@OriginalMember(owner = "client!fo", name = "ee", descriptor = "I")
	public int anInt6528 = 8;

	@OriginalMember(owner = "client!fo", name = "Ge", descriptor = "Z")
	protected boolean aBoolean481 = false;

	@OriginalMember(owner = "client!fo", name = "Jf", descriptor = "F")
	public float aFloat148 = 1.0F;

	@OriginalMember(owner = "client!fo", name = "Ce", descriptor = "I")
	private int anInt6538 = 16777215;

	@OriginalMember(owner = "client!fo", name = "Qf", descriptor = "F")
	private float aFloat150 = 1.0F;

	@OriginalMember(owner = "client!fo", name = "Ff", descriptor = "Z")
	private boolean aBoolean492 = false;

	@OriginalMember(owner = "client!fo", name = "Nf", descriptor = "[F")
	protected float[] aFloatArray46 = this.aFloatArray43;

	@OriginalMember(owner = "client!fo", name = "be", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream6 = new Stream();

	@OriginalMember(owner = "client!fo", name = "fg", descriptor = "Lclient!ww;")
	private final Class8_Sub3 aClass8_Sub3_21 = new Class8_Sub3();

	@OriginalMember(owner = "client!fo", name = "Ad", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas12;

	@OriginalMember(owner = "client!fo", name = "Uc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!fo", name = "ub", descriptor = "Lclient!jo;")
	protected final Class168 aClass168_83;

	@OriginalMember(owner = "client!fo", name = "se", descriptor = "I")
	protected final int anInt6533;

	@OriginalMember(owner = "client!fo", name = "ib", descriptor = "Ljava/lang/Object;")
	protected final Object anObject9;

	@OriginalMember(owner = "client!fo", name = "pc", descriptor = "Ljava/lang/Object;")
	private Object anObject10;

	@OriginalMember(owner = "client!fo", name = "mc", descriptor = "I")
	private int anInt6452;

	@OriginalMember(owner = "client!fo", name = "bc", descriptor = "I")
	public int anInt6442;

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
	private int anInt6356;

	@OriginalMember(owner = "client!fo", name = "P", descriptor = "I")
	public int anInt6381;

	@OriginalMember(owner = "client!fo", name = "Me", descriptor = "I")
	public final int anInt6542;

	@OriginalMember(owner = "client!fo", name = "df", descriptor = "Lclient!ej;")
	private final Class90 aClass90_3;

	@OriginalMember(owner = "client!fo", name = "wd", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!e;Lclient!jo;II)V")
	protected Class9_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) Class168 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.aCanvas11 = this.aCanvas12 = arg0;
		this.aClass168_83 = arg3;
		this.anInt6533 = arg4;
		this.anObject10 = this.anObject9 = arg1;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt6442 = this.anInt6452 = local307.width;
		this.anInt6381 = this.anInt6356 = local307.height;
		this.anInt6542 = arg5;
		Static361.method5811(true, false);
		this.aClass90_3 = new Class90(this, super.anInterface2_11);
		this.aNativeInterface3 = new NativeInterface(super.anInterface2_11.method3584(), this.anInt6542);
		for (@Pc(349) int local349 = 0; local349 < super.anInterface2_11.method3584(); local349++) {
			@Pc(357) Class296 local357 = super.anInterface2_11.method3585(local349);
			if (local357 != null) {
				this.aNativeInterface3.initTextureMetrics(local349, local357.aByte103, local357.aByte101);
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)I")
	public final int method5469() {
		return this.anInt6526;
	}

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "()Z")
	@Override
	public final boolean method5447() {
		return true;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[FZIIZILclient!vj;)Lclient!ae;")
	protected abstract Interface1 method5470(@OriginalArg(1) float[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class333 arg4);

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "(I)V")
	private void method5471() {
		this.aBoolean490 = false;
		this.method5541();
		if (this.aClass207_8 == Static8.aClass207_1) {
			this.method5504();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[Lclient!od;)V")
	@Override
	public final void method5401(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub29[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass6_Sub29Array4[local7] = arg1[local7];
		}
		this.anInt6559 = arg0;
		if (this.aClass207_8.method5012()) {
			this.method5517();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BIZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method5472(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap4.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "()V")
	@Override
	protected void method5418() {
		if (this.aBoolean477) {
			return;
		}
		for (@Pc(9) Class6 local9 = this.aClass211_48.method5183(); local9 != null; local9 = this.aClass211_48.method5177()) {
			((Class6_Sub25_Sub2) local9).method8133();
		}
		@Pc(26) Enumeration local26 = this.aHashtable6.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method5591(this.aHashtable6.get(local32), local32);
		}
		Static30.method995(true, false);
		this.aNativeInterface3.release();
		this.aBoolean477 = true;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!ed;[Lclient!aaa;Z)Lclient!ta;")
	@Override
	public final Class73 method5393(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class1[] arg1) {
		return new Class73_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "(I)V")
	protected final void method5473() {
		@Pc(9) Enumeration local9 = this.aHashtable6.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method5591(this.aHashtable6.get(local15), local15);
		}
		this.anInterface20_8.method6520();
		this.anInterface20_7.method6520();
		this.aClass23_Sub1_28.method3352();
		this.aClass23_Sub1_25.method3352();
		this.aClass23_Sub1_30.method3352();
		this.aClass23_Sub1_24.method3352();
		this.aClass23_Sub1_22.method3352();
		this.aClass308_3.method7466();
		this.anInterface21_5.method6520();
	}

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "(I)V")
	private void method5474() {
		if (Static146.aClass207_10 == this.aClass207_8) {
			return;
		}
		@Pc(17) Class207 local17 = this.aClass207_8;
		this.aClass207_8 = Static146.aClass207_10;
		if (local17.method5012()) {
			this.method5581();
		}
		this.method5525();
		this.aFloatArray46 = this.aFloatArray38;
		this.method5504();
		this.anInt6550 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "()Z")
	@Override
	public final boolean method5449() {
		return true;
	}

	@OriginalMember(owner = "client!fo", name = "F", descriptor = "()V")
	@Override
	public final void F() {
		this.anInt6555 = 0;
		this.anInt6543 = this.anInt6381;
		this.anInt6554 = 0;
		this.anInt6532 = this.anInt6442;
		if (this.aBoolean494) {
			this.aBoolean494 = false;
			this.method5507();
		}
		this.method5544();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!aaa;Z)Lclient!xa;")
	@Override
	public final Class66 method5412(@OriginalArg(0) Class1 arg0) {
		@Pc(23) Class66 local23;
		if (arg0.anInt27 == 0 || arg0.anInt30 == 0) {
			local23 = this.method5423(new int[1], 1, 1, 1);
		} else {
			@Pc(32) int[] local32 = new int[arg0.anInt27 * arg0.anInt30];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			@Pc(41) int local41;
			@Pc(45) int local45;
			if (arg0.aByteArray1 == null) {
				for (local41 = 0; local41 < arg0.anInt30; local41++) {
					for (local45 = 0; local45 < arg0.anInt27; local45++) {
						@Pc(58) int local58 = arg0.anIntArray6[arg0.aByteArray2[local34++] & 0xFF];
						local32[local36++] = local58 == 0 ? 0 : local58 | 0xFF000000;
					}
				}
			} else {
				for (local41 = 0; local41 < arg0.anInt30; local41++) {
					for (local45 = 0; local45 < arg0.anInt27; local45++) {
						local32[local36++] = arg0.aByteArray1[local34] << 24 | arg0.anIntArray6[arg0.aByteArray2[local34] & 0xFF];
						local34++;
					}
				}
			}
			local23 = this.method5423(local32, arg0.anInt27, arg0.anInt27, arg0.anInt30);
		}
		local23.EA(arg0.anInt29, arg0.anInt31, arg0.anInt28, arg0.anInt26);
		return local23;
	}

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "(I)V")
	private void method5475() {
		this.aBoolean492 = false;
		if (Static146.aClass207_10 == this.aClass207_8) {
			this.method5525();
			this.method5504();
		}
	}

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(Z)V")
	@Override
	public final void method5455(@OriginalArg(0) boolean arg0) {
		this.aBoolean482 = arg0;
		this.method5557();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z[[III)Lclient!vfa;")
	public abstract Interface22 method5476(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!fo", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt6538 != arg0;
		if (local15 || arg1 != this.aFloat143 || this.aFloat142 != arg2) {
			this.anInt6538 = arg0;
			this.aFloat143 = arg1;
			this.aFloat142 = arg2;
			if (local15) {
				this.aFloat138 = (float) (this.anInt6538 & 0xFF) / 255.0F;
				this.aFloat145 = (float) (this.anInt6538 & 0xFF0000) / 1.671168E7F;
				this.aFloat144 = (float) (this.anInt6538 & 0xFF00) / 65280.0F;
				this.method5584();
			}
			this.aNativeInterface3.setSunColour(this.aFloat145, this.aFloat144, this.aFloat138, arg1, arg2);
			this.method5582();
		}
		if (arg3 != this.aFloatArray39[0] || this.aFloatArray39[1] != arg4 || arg5 != this.aFloatArray39[2]) {
			this.aFloatArray39[0] = arg3;
			this.aFloatArray39[2] = arg5;
			this.aFloatArray39[1] = arg4;
			this.aFloatArray42[2] = -arg5;
			this.aFloatArray42[1] = -arg4;
			this.aFloatArray42[0] = -arg3;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray40[0] = arg3 * local153;
			this.aFloatArray40[2] = local153 * arg5;
			this.aFloatArray40[1] = local153 * arg4;
			this.aFloatArray44[2] = -this.aFloatArray40[2];
			this.aFloatArray44[0] = -this.aFloatArray40[0];
			this.aFloatArray44[1] = -this.aFloatArray40[1];
			this.aNativeInterface3.setSunDirection(this.aFloatArray40[0], this.aFloatArray40[1], this.aFloatArray40[2]);
			this.method5566();
			this.anInt6558 = (int) (arg5 * 256.0F / arg4);
			this.anInt6564 = (int) (arg3 * 256.0F / arg4);
		}
		this.method5551();
	}

	@OriginalMember(owner = "client!fo", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt6540;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)V")
	protected abstract void method5477();

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "(I)I")
	public final int method5478() {
		return this.anInt6536;
	}

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "(I)V")
	protected abstract void method5479();

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)I")
	@Override
	public final int method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "()Z")
	@Override
	public final boolean method5422() {
		return true;
	}

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "(I)V")
	protected abstract void method5480();

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method5450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		@Pc(29) float local29 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local16 * local16)));
		@Pc(33) float local33 = local10 * local29;
		@Pc(37) float local37 = local16 * local29;
		if (!this.method5546(local33 + (float) arg2, 0.0F, (float) arg1, (float) arg0, local37 + (float) arg3, 0.0F)) {
			return;
		}
		this.method5565();
		this.method5536(arg4);
		this.method5596(Static140.aClass50_2, 0);
		this.method5543(Static140.aClass50_2, 0);
		this.method5587(arg5);
		this.method5522();
		this.method5538(false);
		this.method5486();
		this.method5538(true);
		this.method5543(Static503.aClass50_4, 0);
		this.method5596(Static503.aClass50_4, 0);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method5429(@OriginalArg(0) Class8 arg0) {
		this.aClass8_Sub3_16 = (Class8_Sub3) arg0;
		this.aClass8_Sub3_18.la(this.aClass8_Sub3_16);
		this.aClass8_Sub3_18.method8190();
		this.aClass8_Sub3_19.method8187(this.aClass8_Sub3_18);
		this.aClass8_Sub3_17.method8187(this.aClass8_Sub3_16);
		if (this.aClass207_8.method5012()) {
			this.method5581();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(IIIIII)Lclient!dga;")
	@Override
	public final Class65 method5442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class65_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!fo", name = "sa", descriptor = "(II)V")
	@Override
	public final void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6540 == arg0 && arg1 == this.anInt6560) {
			return;
		}
		this.anInt6540 = arg0;
		this.anInt6560 = arg1;
		this.method5471();
		this.method5595();
		this.method5601();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZLclient!vw;)V")
	public final void method5481(@OriginalArg(1) Class340 arg0) {
		this.aClass340Array3[this.anInt6536] = arg0;
		this.method5492();
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(II)V")
	public final void method5482(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt6536) {
			this.anInt6536 = arg0;
			this.method5518();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!dj;)V")
	public abstract void method5483(@OriginalArg(1) Class71 arg0);

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(Z)V")
	@Override
	public final void method5432(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "(I)Lclient!ww;")
	public final Class8_Sub3 method5484() {
		return this.aClass8_Sub3Array3[this.anInt6536];
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method5485(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!fo", name = "LA", descriptor = "(IIII)V")
	@Override
	public final void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean479) {
			throw new RuntimeException("");
		}
		if (arg0 != this.anInt6534) {
			this.anInt6534 = arg0;
			if (this.aClass37_3 != null) {
				this.aClass37_3.method7556();
			}
		}
		this.anInt6548 = arg2;
		this.anInt6526 = arg3;
		this.anInt6553 = arg1;
		this.method5601();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public final Class62 method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class62_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "()Z")
	@Override
	public final boolean method5431() {
		return true;
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(B)V")
	private void method5486() {
		this.method5513(0, this.anInterface20_7);
		this.method5535(this.aClass88_18);
		this.method5571(0, 1, Static112.aClass328_1);
	}

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "(I)V")
	public final void method5487() {
		this.aBoolean474 = false;
		this.method5578();
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(B)V")
	protected abstract void method5488();

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "()Z")
	@Override
	public final boolean method5458() {
		return true;
	}

	@OriginalMember(owner = "client!fo", name = "v", descriptor = "()I")
	@Override
	public final int v() {
		return this.anInt6523 + this.anInt6524 + this.anInt6525;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5403(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas12) {
			local5 = this.anObject10;
		} else if (this.aHashtable6.containsKey(arg0)) {
			local5 = this.aHashtable6.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method5519(local5, arg0);
		if (arg0 == this.aCanvas11) {
			this.method5501();
		}
	}

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "()Lclient!q;")
	@Override
	public final Class8 method5446() {
		return new Class8_Sub3();
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5465(@OriginalArg(0) Canvas arg0) {
		this.anObject10 = null;
		this.aCanvas11 = null;
		if (arg0 == null || this.aCanvas12 == arg0) {
			this.aCanvas11 = this.aCanvas12;
			this.anObject10 = this.anObject9;
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.anObject10 = this.aHashtable6.get(arg0);
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.anObject10 == null) {
			throw new RuntimeException();
		}
		this.method5485(this.anObject10, this.aCanvas11);
		this.method5501();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI)V")
	public final void method5489(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean484) {
			this.aBoolean484 = arg0;
			this.method5508();
		}
	}

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "(I)V")
	protected abstract void method5490();

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZZLclient!cea;II)V")
	public abstract void method5491(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5450(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!fo", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt6555 < arg0) {
			local5 = true;
			this.anInt6555 = arg0;
		}
		if (this.anInt6532 > arg2) {
			this.anInt6532 = arg2;
			local5 = true;
		}
		if (this.anInt6554 < arg1) {
			this.anInt6554 = arg1;
			local5 = true;
		}
		if (this.anInt6543 > arg3) {
			this.anInt6543 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean494) {
			this.aBoolean494 = true;
			this.method5507();
		}
		this.method5488();
		this.method5544();
	}

	@OriginalMember(owner = "client!fo", name = "ka", descriptor = "(FF)V")
	@Override
	public final void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat141 && arg1 == this.aFloat135) {
			return;
		}
		this.aFloat141 = arg0;
		this.aFloat135 = arg1;
		this.method5569();
		this.method5562();
		this.method5595();
		this.method5471();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method5396() {
	}

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(B)V")
	private void method5492() {
		this.method5514();
		if (this.aClass37_3 != null) {
			this.aClass37_3.method7555();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method5493(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!fo", name = "JA", descriptor = "(I)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0) {
		this.anInt6529 = 0;
		while (arg0 > 1) {
			this.anInt6529++;
			arg0 >>= 0x1;
		}
		this.anInt6528 = 0x1 << this.anInt6529;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!ld;)V")
	public final void method5494(@OriginalArg(1) Interface10 arg0) {
		if (arg0 == this.anInterface10Array3[this.anInt6536]) {
			return;
		}
		this.anInterface10Array3[this.anInt6536] = arg0;
		if (arg0 == null) {
			this.method5531();
		} else {
			arg0.method7736();
		}
		this.anInt6550 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!fo", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public final void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public final void method5451(@OriginalArg(0) Class6_Sub25 arg0) {
		this.aNativeHeap4 = ((Class6_Sub25_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer7 = this.aNativeHeap4.a(32768, false);
	}

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(Z)V")
	public final void method5495() {
		if (this.anInt6550 == 8) {
			return;
		}
		this.method5532();
		this.method5594(true);
		this.method5547(true);
		this.method5526(true);
		this.method5587(1);
		this.anInt6550 = 8;
	}

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(B)V")
	protected abstract void method5496();

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(II)Lclient!tj;")
	public final Interface21 method5497(@OriginalArg(1) int arg0) {
		if (this.anInterface21_5.method6519() < arg0 * 2) {
			this.anInterface21_5.method5022(arg0);
		}
		return this.anInterface21_5;
	}

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "(B)V")
	public final void method5498() {
		if (this.aClass340Array3[this.anInt6536] != Static503.aClass340_13) {
			this.aClass340Array3[this.anInt6536] = Static503.aClass340_13;
			this.aClass8_Sub3Array3[this.anInt6536].Y();
			this.method5492();
		}
	}

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "(I)V")
	@Override
	public final void method5459(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "(I)V")
	public final void method5499() {
		this.method5577();
		this.method5504();
	}

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "(I)V")
	protected abstract void method5500();

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "(I)V")
	private void method5501() {
		if (this.aCanvas11 == null) {
			this.anInt6452 = this.anInt6356 = 1;
		} else {
			@Pc(24) Dimension local24 = this.aCanvas11.getSize();
			this.anInt6356 = local24.height;
			this.anInt6452 = local24.width;
		}
		this.anInt6381 = this.anInt6356;
		this.anInt6442 = this.anInt6452;
		this.method5475();
		this.method5471();
		this.method5595();
		this.method5558();
		this.method5544();
		this.method5577();
		this.F();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "()Z")
	@Override
	public final boolean method5395() {
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZB)V")
	public final void method5502(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean486) {
			this.aBoolean486 = arg0;
			this.method5508();
			this.anInt6550 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZ)V")
	public final void method5503(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean488 != arg0) {
			this.aBoolean488 = arg0;
			this.method5479();
		}
	}

	@OriginalMember(owner = "client!fo", name = "v", descriptor = "(I)V")
	private void method5504() {
		this.method5480();
		if (this.aClass37_3 != null) {
			this.aClass37_3.method7557();
		}
	}

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "(B)V")
	protected abstract void method5505();

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "(I)V")
	public final void method5506() {
		if (this.anInt6550 == 16) {
			return;
		}
		this.method5542();
		this.method5594(true);
		this.method5547(true);
		this.method5526(true);
		this.method5587(1);
		this.anInt6550 = 16;
	}

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "(I)V")
	protected abstract void method5507();

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "(B)V")
	protected abstract void method5508();

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "(B)V")
	public final void method5509() {
		if (this.anInt6550 == 4) {
			return;
		}
		this.method5474();
		this.method5594(false);
		this.method5502(false);
		this.method5547(false);
		this.method5526(false);
		this.method5559(-2, false, false);
		this.method5587(1);
		this.method5545(0);
		this.anInt6550 = 4;
	}

	@OriginalMember(owner = "client!fo", name = "ha", descriptor = "(F)V")
	@Override
	public final void ha(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat148) {
			this.aFloat148 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method5584();
			this.method5551();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B[Lclient!ada;)Lclient!eh;")
	public abstract Class88 method5510(@OriginalArg(1) Class7[] arg0);

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "(I)I")
	public final int method5511() {
		return this.anInt6534;
	}

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "(B)Lclient!ww;")
	public final Class8_Sub3 method5512() {
		return this.aClass8_Sub3_18;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBLclient!tfa;)V")
	public abstract void method5513(@OriginalArg(0) int arg0, @OriginalArg(2) Interface20 arg1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public final Class66 method5454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class66_Sub3 local11 = new Class66_Sub3(this, arg2, arg3, arg4);
		local11.GA(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "()Z")
	@Override
	public final boolean method5452() {
		return true;
	}

	@OriginalMember(owner = "client!fo", name = "z", descriptor = "(I)V")
	protected abstract void method5514();

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!vj;Lclient!nb;I)Z")
	public abstract boolean method5515(@OriginalArg(0) Class333 arg0, @OriginalArg(1) Class220 arg1);

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "()Z")
	@Override
	public final boolean method5437() {
		return true;
	}

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "()Z")
	@Override
	public final boolean method5462() {
		return this.aClass37Array3[3].method7564();
	}

	@OriginalMember(owner = "client!fo", name = "C", descriptor = "(IIIIII)V")
	@Override
	public final void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5565();
		this.method5536(arg4);
		this.method5596(Static140.aClass50_2, 0);
		this.method5543(Static140.aClass50_2, 0);
		this.method5587(arg5);
		this.aClass8_Sub3_15.method8198((float) arg3, (float) arg2, 1.0F);
		this.aClass8_Sub3_15.G(arg0, arg1, 0);
		this.method5487();
		this.method5538(false);
		this.method5552();
		this.method5538(true);
		this.method5543(Static503.aClass50_4, 0);
		this.method5596(Static503.aClass50_4, 0);
	}

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "(I)V")
	private void method5516() {
		if (this.aBoolean489) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray45;
		@Pc(12) float local12 = (float) this.anInt6540 - this.aFloat135;
		@Pc(20) float local20 = (float) this.anInt6560 - this.aFloat135;
		@Pc(32) float local32 = this.aFloat150 * (float) -this.anInt6544 / (float) this.anInt6527;
		@Pc(44) float local44 = (float) -this.anInt6535 * this.aFloat150 / (float) this.anInt6549;
		@Pc(59) float local59 = (float) (this.anInt6442 - this.anInt6535) * this.aFloat150 / (float) this.anInt6549;
		@Pc(74) float local74 = (float) (this.anInt6381 - this.anInt6544) * this.aFloat150 / (float) this.anInt6527;
		if (local59 == local44 || local32 == local74) {
			local5[6] = 0.0F;
			local5[4] = 0.0F;
			local5[0] = 1.0F;
			local5[13] = 0.0F;
			local5[11] = 0.0F;
			local5[9] = 0.0F;
			local5[12] = 0.0F;
			local5[8] = 0.0F;
			local5[3] = 0.0F;
			local5[14] = 0.0F;
			local5[15] = 1.0F;
			local5[2] = 0.0F;
			local5[1] = 0.0F;
			local5[10] = 1.0F;
			local5[7] = 0.0F;
			local5[5] = 1.0F;
		} else {
			local5[0] = 2.0F / (local59 - local44);
			local5[9] = 0.0F;
			local5[2] = 0.0F;
			local5[7] = 0.0F;
			local5[6] = 0.0F;
			local5[15] = 1.0F;
			local5[8] = 0.0F;
			local5[4] = 0.0F;
			local5[1] = 0.0F;
			local5[10] = 1.0F / (local12 - local20);
			local5[14] = local12 / (local12 - local20);
			local5[12] = (local59 + local44) / (-local59 + local44);
			local5[11] = 0.0F;
			local5[5] = 2.0F / (local74 - local32);
			local5[3] = 0.0F;
			local5[13] = (local32 + local74) / (-local32 + local74);
		}
		this.method5569();
		this.aBoolean489 = true;
	}

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "(B)V")
	protected void method5517() {
		this.anInt6561 = this.anInt6559;
		this.anInt6559 = 0;
	}

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "(I)V")
	protected abstract void method5518();

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method5519(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BZ)V")
	public final void method5520(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean475) {
			this.aBoolean475 = arg0;
			this.method5533();
		}
	}

	@OriginalMember(owner = "client!fo", name = "C", descriptor = "(I)V")
	private void method5521() {
		this.method5584();
		this.method5582();
		this.method5508();
		this.method5517();
		this.method5566();
		this.method5551();
		this.method5479();
		this.method5505();
		this.method5557();
		this.method5533();
		this.method5496();
		this.method5490();
		this.method5575();
		this.method5477();
		for (@Pc(60) int local60 = this.anInt6541 - 1; local60 >= 0; local60--) {
			this.method5482(local60);
			this.method5599();
			this.method5549();
			this.method5498();
		}
		this.method5554();
		this.method5558();
		this.method5480();
		this.method5534();
		this.method5500();
	}

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "(I)V")
	public final void method5522() {
		this.aClass8_Sub3_15.Y();
		this.aBoolean474 = true;
		this.method5578();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([FI)[F")
	public final float[] method5523(@OriginalArg(0) float[] arg0) {
		arg0[12] = this.aFloatArray46[3];
		arg0[8] = this.aFloatArray46[2];
		arg0[4] = this.aFloatArray46[1];
		arg0[0] = this.aFloatArray46[0];
		arg0[1] = this.aFloatArray46[4];
		arg0[2] = this.aFloatArray46[8];
		arg0[9] = this.aFloatArray46[6];
		arg0[5] = this.aFloatArray46[5];
		arg0[13] = this.aFloatArray46[7];
		arg0[6] = this.aFloatArray46[9];
		arg0[14] = this.aFloatArray46[11];
		arg0[3] = this.aFloatArray46[12];
		arg0[10] = this.aFloatArray46[10];
		arg0[7] = this.aFloatArray46[13];
		arg0[11] = this.aFloatArray46[14];
		arg0[15] = this.aFloatArray46[15];
		return arg0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;B)Lclient!jaclib/memory/Stream;")
	public final Stream method5524(@OriginalArg(0) Buffer arg0) {
		this.aStream6.a(arg0);
		return this.aStream6;
	}

	@OriginalMember(owner = "client!fo", name = "X", descriptor = "(III)V")
	@Override
	public final void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt6537 && this.anInt6531 == arg1 && this.anInt6556 == arg2) {
			return;
		}
		this.anInt6537 = arg0;
		this.anInt6531 = arg1;
		this.anInt6556 = arg2;
		if (this.aBoolean479) {
			return;
		}
		this.method5601();
		this.method5533();
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5410(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas12 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.method5591(this.aHashtable6.get(arg0), arg0);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fo", name = "F", descriptor = "(I)V")
	private void method5525() {
		if (this.aBoolean492) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray38;
		this.aBoolean492 = true;
		if (this.anInt6442 != 0 && this.anInt6381 != 0) {
			local5[13] = 1.0F;
			local5[5] = -2.0F / (float) this.anInt6381;
			local5[7] = 0.0F;
			local5[12] = -1.0F;
			local5[6] = 0.0F;
			local5[10] = 0.5F;
			local5[4] = 0.0F;
			local5[11] = 0.0F;
			local5[8] = 0.0F;
			local5[15] = 1.0F;
			local5[0] = 2.0F / (float) this.anInt6442;
			local5[9] = 0.0F;
			local5[14] = 0.5F;
			local5[3] = 0.0F;
			local5[2] = 0.0F;
			local5[1] = 0.0F;
			return;
		}
		local5[1] = 0.0F;
		local5[10] = 1.0F;
		local5[15] = 1.0F;
		local5[5] = 1.0F;
		local5[11] = 0.0F;
		local5[12] = 0.0F;
		local5[2] = 0.0F;
		local5[13] = 0.0F;
		local5[8] = 0.0F;
		local5[4] = 0.0F;
		local5[14] = 0.0F;
		local5[3] = 0.0F;
		local5[9] = 0.0F;
		local5[0] = 1.0F;
		local5[6] = 0.0F;
		local5[7] = 0.0F;
	}

	@OriginalMember(owner = "client!fo", name = "na", descriptor = "(III[I)V")
	@Override
	public final void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass8_Sub3_16.method8193((float) arg0, (float) arg1, (float) arg2);
		if (local14 < (float) this.anInt6540 || local14 > (float) this.anInt6560) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(57) int local57 = (int) ((float) this.anInt6549 * this.aClass8_Sub3_16.method8197((float) arg2, (float) arg1, (float) arg0) / local14);
		@Pc(75) int local75 = (int) ((float) this.anInt6527 * this.aClass8_Sub3_16.method8186((float) arg2, (float) arg0, (float) arg1) / local14);
		if ((float) local57 >= this.aFloat133 && this.aFloat132 >= (float) local57 && this.aFloat134 <= (float) local75 && this.aFloat136 >= (float) local75) {
			arg3[1] = (int) ((float) local75 - this.aFloat134);
			arg3[0] = (int) ((float) local57 - this.aFloat133);
			arg3[2] = (int) local14;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZZ)V")
	public final void method5526(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean476 != arg0) {
			this.aBoolean476 = arg0;
			this.method5557();
			this.anInt6550 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "(B)Lclient!vfa;")
	public final Interface22 method5527() {
		return this.aClass65_Sub1_3 == null ? null : this.aClass65_Sub1_3.method1834();
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(ZZ)Lclient!tfa;")
	public abstract Interface20 method5528(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(II)Lclient!or;")
	protected Class37 method5529(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class37_Sub5(this);
		} else if (arg0 == 1) {
			return new Class37_Sub6(this);
		} else if (arg0 == 2) {
			return new Class37_Sub8(this, this.aClass149_5);
		} else if (arg0 == 7) {
			return new Class37_Sub7(this);
		} else {
			return new Class37_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!fo", name = "aa", descriptor = "()I")
	@Override
	public final int aa() {
		return this.anInt6565;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBILclient!vj;Lclient!nb;)Lclient!ae;")
	public abstract Interface1 method5530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class333 arg2, @OriginalArg(4) Class220 arg3);

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "(Z)V")
	protected abstract void method5531();

	@OriginalMember(owner = "client!fo", name = "ya", descriptor = "(IIIII)V")
	@Override
	public final void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5450(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "(B)V")
	private void method5532() {
		if (Static8.aClass207_1 == this.aClass207_8) {
			return;
		}
		@Pc(15) Class207 local15 = this.aClass207_8;
		this.aClass207_8 = Static8.aClass207_1;
		if (!local15.method5012()) {
			this.method5581();
		}
		this.method5541();
		this.aFloatArray46 = this.aFloatArray41;
		this.method5504();
		this.anInt6550 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I")
	@Override
	public final int method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "(B)V")
	protected abstract void method5533();

	@OriginalMember(owner = "client!fo", name = "G", descriptor = "(I)V")
	protected abstract void method5534();

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!eh;)V")
	public abstract void method5535(@OriginalArg(1) Class88 arg0);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)V")
	public final void method5536(@OriginalArg(0) int arg0) {
		if (this.anInt6562 != arg0) {
			this.anInt6562 = arg0;
			this.method5554();
		}
	}

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "()F")
	public final float method5537() {
		return this.aFloat135;
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(ZZ)V")
	public abstract void method5538(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5428(@OriginalArg(0) Canvas arg0) {
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
			@Pc(53) Object local53 = this.method5493(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIBLclient!vd;Lclient!tj;II)V")
	public abstract void method5539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class328 arg2, @OriginalArg(4) Interface21 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)V")
	@Override
	public final void method5426(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!cea;IZ)V")
	protected abstract void method5540(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1);

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "(I)V")
	private void method5541() {
		if (this.aBoolean490) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray41;
		@Pc(17) float local17 = (float) (this.anInt6540 * -this.anInt6535) / (float) this.anInt6549;
		@Pc(32) float local32 = (float) (this.anInt6540 * (this.anInt6442 - this.anInt6535)) / (float) this.anInt6549;
		@Pc(43) float local43 = (float) (this.anInt6544 * this.anInt6540) / (float) this.anInt6527;
		@Pc(58) float local58 = (float) (this.anInt6540 * (this.anInt6544 - this.anInt6381)) / (float) this.anInt6527;
		if (local32 == local17 || local43 == local58) {
			local5[11] = 0.0F;
			local5[10] = 1.0F;
			local5[14] = 0.0F;
			local5[2] = 0.0F;
			local5[12] = 0.0F;
			local5[15] = 1.0F;
			local5[13] = 0.0F;
			local5[0] = 1.0F;
			local5[5] = 1.0F;
			local5[7] = 0.0F;
			local5[1] = 0.0F;
			local5[8] = 0.0F;
			local5[4] = 0.0F;
			local5[9] = 0.0F;
			local5[3] = 0.0F;
			local5[6] = 0.0F;
		} else {
			@Pc(138) float local138 = (float) this.anInt6540 * 2.0F;
			local5[14] = this.aFloat140 = (float) (this.anInt6540 * this.anInt6560) / (float) (this.anInt6540 - this.anInt6560);
			local5[7] = 0.0F;
			local5[0] = local138 / (local32 - local17);
			local5[13] = 0.0F;
			local5[12] = 0.0F;
			local5[2] = 0.0F;
			local5[3] = 0.0F;
			local5[9] = (local43 + local58) / (local43 - local58);
			local5[4] = 0.0F;
			local5[11] = -1.0F;
			local5[5] = local138 / (local43 - local58);
			local5[8] = (local17 + local32) / (-local17 + local32);
			local5[6] = 0.0F;
			local5[15] = 0.0F;
			local5[1] = 0.0F;
			local5[10] = this.aFloat137 = (float) this.anInt6560 / (float) (this.anInt6540 - this.anInt6560);
		}
		this.method5562();
		this.aBoolean490 = true;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lclient!ba;Lclient!tg;Lclient!q;[Lclient!mr;I)V")
	@Override
	public final void method5445(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class5_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method5408(arg0, arg2, arg3, arg4);
		this.method5433(arg1);
	}

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "(Z)V")
	private void method5542() {
		if (this.aClass207_8 == Static114.aClass207_4) {
			return;
		}
		@Pc(16) Class207 local16 = this.aClass207_8;
		this.aClass207_8 = Static114.aClass207_4;
		if (!local16.method5012()) {
			this.method5581();
		}
		this.method5516();
		this.aFloatArray46 = this.aFloatArray45;
		this.method5504();
		this.anInt6550 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "(IIIII)V")
	@Override
	protected final void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!cea;II)V")
	public final void method5543(@OriginalArg(0) Class50 arg0, @OriginalArg(2) int arg1) {
		this.method5540(arg1, arg0);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!mr;I)V")
	@Override
	public final void method5408(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class5_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method7077(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "I", descriptor = "(I)V")
	private void method5544() {
		this.aFloat133 = this.anInt6555 - this.anInt6535;
		this.aFloat136 = this.anInt6543 - this.anInt6544;
		this.aFloat132 = this.anInt6532 - this.anInt6535;
		this.aFloat134 = this.anInt6554 - this.anInt6544;
	}

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(II)V")
	public final void method5545(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method5598(Static410.aClass238_3, Static410.aClass238_3);
		} else if (arg0 == 0) {
			this.method5598(Static477.aClass238_4, Static477.aClass238_4);
		} else if (arg0 == 2) {
			this.method5598(Static410.aClass238_3, Static71.aClass238_1);
		} else if (arg0 == 3) {
			this.method5598(Static477.aClass238_4, Static167.aClass238_2);
		} else if (arg0 == 4) {
			this.method5598(Static551.aClass238_5, Static551.aClass238_5);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(FFFFFFI)Z")
	private boolean method5546(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) Buffer local15 = this.anInterface20_7.method6521();
		if (local15 == null) {
			return false;
		}
		@Pc(24) Stream local24 = this.method5524(local15);
		if (Stream.c()) {
			local24.a(arg3);
			local24.a(arg2);
			local24.a(arg5);
			local24.a(arg0);
			local24.a(arg4);
			local24.a(arg1);
		} else {
			local24.b(arg3);
			local24.b(arg2);
			local24.b(arg5);
			local24.b(arg0);
			local24.b(arg4);
			local24.b(arg1);
		}
		local24.a();
		return this.anInterface20_7.method6524();
	}

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class19_Sub3 local6 = (Class19_Sub3) arg1;
		@Pc(9) Interface1 local9 = local6.anInterface1_4;
		this.method5560();
		this.method5494(local9);
		this.method5587(1);
		this.method5598(Static410.aClass238_3, Static410.aClass238_3);
		this.method5596(Static140.aClass50_2, 0);
		this.method5536(arg0);
		this.aClass8_Sub3_15.method8198((float) this.anInt6381, (float) this.anInt6442, 0.0F);
		this.method5487();
		this.aClass8_Sub3Array3[0].method8198(local9.method7748((float) this.anInt6381), local9.method7754((float) this.anInt6442), 1.0F);
		this.aClass8_Sub3Array3[0].method8195(0.0F, local9.method7748((float) -arg3), local9.method7754((float) -arg2));
		this.aClass340Array3[0] = Static52.aClass340_4;
		this.method5492();
		this.method5552();
		this.method5498();
		this.method5596(Static503.aClass50_4, 0);
	}

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "()Lclient!q;")
	@Override
	public final Class8 method5417() {
		return this.aClass8_Sub3_21;
	}

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "()V")
	@Override
	public final void method5419() {
		this.aClass90_3.method2384();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
	@Override
	public final void method5392(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.bf = arg0;
		this.aClass90_3.method2384();
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "()Z")
	@Override
	public final boolean method5407() {
		return true;
	}

	@OriginalMember(owner = "client!fo", name = "AA", descriptor = "(IIII)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6534 = arg0;
		this.anInt6548 = arg2;
		this.aBoolean479 = true;
		this.anInt6553 = arg1;
		this.anInt6526 = arg3;
		this.method5593(0, false, 0, 3, false);
		if (this.aClass37_3 != null) {
			this.aClass37_3.method7556();
		}
		this.method5601();
		this.method5533();
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(ZI)V")
	public final void method5547(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean481 != arg0) {
			this.aBoolean481 = arg0;
			this.method5505();
			this.anInt6550 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!qda;IIII)Lclient!ba;")
	@Override
	public final Class23 method5404(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class23_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "()Z")
	@Override
	public final boolean method5439() {
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "(B)Lclient!ww;")
	public final Class8_Sub3 method5548() {
		return this.aClass8_Sub3_19;
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)Lclient!i;")
	@Override
	public final Class6_Sub25 method5421(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub25_Sub2 local8 = new Class6_Sub25_Sub2(arg0);
		this.aClass211_48.method5173(local8);
		return local8;
	}

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "()V")
	@Override
	public final void k() {
		this.aBoolean479 = false;
		this.method5593(0, false, 0, 0, false);
		this.method5601();
		this.method5533();
	}

	@OriginalMember(owner = "client!fo", name = "J", descriptor = "(I)V")
	protected abstract void method5549();

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "(IIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6544 = arg1;
		this.anInt6549 = arg2;
		this.anInt6535 = arg0;
		this.anInt6527 = arg3;
		this.method5595();
		this.method5471();
		this.method5577();
		this.method5544();
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(BZ)Lclient!tj;")
	public abstract Interface21 method5550(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!fo", name = "K", descriptor = "(I)V")
	protected abstract void method5551();

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "()Z")
	@Override
	public final boolean method5414() {
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "(B)V")
	public final void method5552() {
		this.method5561(Static287.aClass328_3, 2);
	}

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "(I)Lclient!ww;")
	public final Class8_Sub3 method5553() {
		return this.aClass8_Sub3Array3[this.anInt6536];
	}

	@OriginalMember(owner = "client!fo", name = "M", descriptor = "(I)V")
	protected abstract void method5554();

	@OriginalMember(owner = "client!fo", name = "N", descriptor = "(I)V")
	private void method5555() {
		this.anInterface20_8 = this.method5528(false);
		this.anInterface20_8.method6523(140, 28);
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			@Pc(32) Buffer local32 = this.anInterface20_8.method6521();
			if (local32 != null) {
				@Pc(39) Stream local39 = this.method5524(local32);
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
				if (this.anInterface20_8.method6524()) {
					break;
				}
			}
		}
		this.aClass88_14 = this.method5510(new Class7[] { new Class7(new Class13[] { Static11.aClass13_1, Static11.aClass13_5, Static11.aClass13_5 }) });
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([IIZII)Lclient!ae;")
	public final Interface1 method5556(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		return this.method5564(0, arg3, arg0, arg2, 0, arg1);
	}

	@OriginalMember(owner = "client!fo", name = "O", descriptor = "(I)V")
	protected abstract void method5557();

	@OriginalMember(owner = "client!fo", name = "P", descriptor = "(I)V")
	protected abstract void method5558();

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIF)Lclient!od;")
	@Override
	public final Class6_Sub29 method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub29_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!fo", name = "D", descriptor = "()Z")
	@Override
	public final boolean method5464() {
		return this.aBoolean487;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIZZ)V")
	public final void method5559(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt6551 != arg0) {
			if (arg0 < 0) {
				this.method5498();
				this.method5494(null);
				this.method5545(0);
				if (!this.aBoolean479) {
					this.method5593(0, arg1, 0, 0, arg2);
				}
			} else {
				@Pc(23) Interface1 local23 = this.aClass90_3.method2383(arg0);
				@Pc(29) Class296 local29 = super.anInterface2_11.method3585(arg0);
				if (local29.aByte105 == 0 && local29.aByte107 == 0) {
					this.method5498();
				} else {
					@Pc(53) int local53 = local29.aBoolean661 ? 64 : 128;
					@Pc(57) int local57 = local53 * 50;
					@Pc(61) Class8_Sub3 local61 = this.method5553();
					local61.method8191((float) (this.anInt6563 % local57 * local29.aByte107) / (float) local57, 0.0F, (float) (local29.aByte105 * (this.anInt6563 % local57)) / (float) local57);
					this.method5481(Static52.aClass340_4);
				}
				if (!this.aBoolean479) {
					this.method5593(local29.anInt8778, arg1, local29.aByte102, local29.aByte104, arg2);
				}
				if (this.aClass37_3 == null) {
					this.method5494(local23);
					this.method5545(local29.anInt8779);
				} else {
					this.aClass37_3.method7552(local29.anInt8779, local23);
				}
			}
			this.anInt6551 = arg0;
		}
		this.anInt6550 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!fo", name = "Q", descriptor = "(I)V")
	public final void method5560() {
		if (this.anInt6550 == 2) {
			return;
		}
		this.method5474();
		this.method5594(false);
		this.method5502(false);
		this.method5547(false);
		this.method5526(false);
		this.method5559(-2, false, false);
		this.anInt6550 = 2;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!vd;I)V")
	private void method5561(@OriginalArg(1) Class328 arg0, @OriginalArg(2) int arg1) {
		this.method5513(0, this.anInterface20_8);
		this.method5535(this.aClass88_14);
		this.method5571(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "(B)V")
	private void method5562() {
		if (this.aFloat135 == 0.0F) {
			this.aFloatArray41[14] = this.aFloat140;
			this.aFloatArray41[10] = this.aFloat137;
		} else {
			@Pc(13) float local13 = this.aFloat141 / (this.aFloat135 + this.aFloat141);
			@Pc(17) float local17 = local13 * local13;
			@Pc(34) float local34 = -this.aFloat140 * (1.0F - local13) * (1.0F - local13) / this.aFloat135;
			this.aFloatArray41[10] = local34 + this.aFloat137;
			this.aFloatArray41[14] = local17 * this.aFloat140;
		}
		this.aFloat147 = ((float) -this.anInt6560 + this.aFloatArray41[14]) / this.aFloatArray41[10];
	}

	@OriginalMember(owner = "client!fo", name = "R", descriptor = "(I)Lclient!ww;")
	public final Class8_Sub3 method5563() {
		if (!this.aBoolean483) {
			this.aClass8_Sub3_20.method8185(this.aClass8_Sub3_18, this.aClass8_Sub3_15);
			this.aBoolean483 = true;
		}
		return this.aClass8_Sub3_20;
	}

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "([I)V")
	@Override
	public final void A(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt6532;
		arg0[1] = this.anInt6554;
		arg0[3] = this.anInt6543;
		arg0[0] = this.anInt6555;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZI[IZII)Lclient!ae;")
	public abstract Interface1 method5564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!fo", name = "S", descriptor = "(I)V")
	private void method5565() {
		if (this.anInt6550 == 1) {
			return;
		}
		this.method5474();
		this.method5594(false);
		this.method5502(false);
		this.method5547(false);
		this.method5526(false);
		this.method5559(-2, false, false);
		this.method5545(1);
		this.method5494(this.anInterface10_3);
		this.anInt6550 = 1;
	}

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "(B)V")
	public abstract void method5566();

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!vj;Lclient!nb;B)Z")
	public abstract boolean method5567(@OriginalArg(0) Class333 arg0, @OriginalArg(1) Class220 arg1);

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "(B)I")
	public final int method5568() {
		return this.anInt6548;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public final void method5456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class19 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!fo", name = "T", descriptor = "(I)V")
	private void method5569() {
		this.aFloat146 = (float) this.anInt6560 - this.aFloat135;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[BIZILclient!vj;II)Lclient!ae;")
	protected abstract Interface1 method5570(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(5) Class333 arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!tg;)V")
	@Override
	public final void method5433(@OriginalArg(0) Class299 arg0) {
		this.aClass308_3.method7464(this, arg0);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIILclient!vd;)V")
	public abstract void method5571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class328 arg2);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!vj;Z[BIBI)Lclient!ae;")
	public final Interface1 method5572(@OriginalArg(0) Class333 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		return this.method5570(arg3, arg2, arg1, arg0, arg4);
	}

	@OriginalMember(owner = "client!fo", name = "ca", descriptor = "(IIII)V")
	@Override
	public final void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt6442 - 1 && arg1 <= 0 && arg3 >= this.anInt6381 - 1) {
			this.F();
			return;
		}
		this.anInt6554 = arg1 < 0 ? 0 : arg1;
		this.anInt6532 = this.anInt6442 < arg2 ? 0 : arg2;
		this.anInt6543 = arg3 > this.anInt6442 ? 0 : arg3;
		this.anInt6555 = arg0 >= 0 ? arg0 : 0;
		if (!this.aBoolean494) {
			this.aBoolean494 = true;
			this.method5507();
		}
		this.method5488();
		this.method5544();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([BILclient!vj;BII)Lclient!te;")
	public abstract Interface19 method5573(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class333 arg1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BI)V")
	public final void method5574(@OriginalArg(0) byte arg0) {
		this.method5536(arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16);
	}

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "(B)V")
	protected abstract void method5575();

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "()F")
	public final float method5576() {
		return this.aFloat141;
	}

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "(Z)V")
	public final void method5577() {
		if (this.aClass207_8 == Static201.aClass207_7) {
			return;
		}
		@Pc(12) Class207 local12 = this.aClass207_8;
		this.aClass207_8 = Static201.aClass207_7;
		if (local12.method5012()) {
			this.method5581();
		}
		this.anInt6550 &= 0xFFFFFFE0;
		this.aFloatArray46 = this.aFloatArray43;
	}

	@OriginalMember(owner = "client!fo", name = "v", descriptor = "(B)V")
	private void method5578() {
		if (Static146.aClass207_10 == this.aClass207_8) {
			@Pc(7) float local7 = this.method5585();
			this.aClass8_Sub3_15.method8195(0.0F, local7, local7);
		}
		this.aBoolean483 = false;
		this.method5534();
		if (this.aClass37_3 != null) {
			this.aClass37_3.method7554();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BF)V")
	public final void method5579(@OriginalArg(1) float arg0) {
		if (this.aFloat150 != arg0) {
			this.aFloat150 = arg0;
			this.method5595();
		}
	}

	@OriginalMember(owner = "client!fo", name = "IA", descriptor = "()I")
	@Override
	public final int IA() {
		return this.anInt6560;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public final Class19 method5460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static418.method1814(this, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "(B)[F")
	public final float[] method5580() {
		return this.aFloatArray43;
	}

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "(B)V")
	private void method5581() {
		this.aBoolean483 = false;
		if (this.aClass37_3 != null) {
			this.aClass37_3.method7558();
		}
		this.method5500();
	}

	@OriginalMember(owner = "client!fo", name = "U", descriptor = "(I)V")
	protected abstract void method5582();

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!ww;)V")
	public final void method5583(@OriginalArg(1) Class8_Sub3 arg0) {
		this.aClass8_Sub3_15.la(arg0);
		this.aBoolean474 = false;
		this.method5578();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public final Class66 method5423(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class66_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V")
	@Override
	public final void method5394(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method5436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method5585();
		this.method5565();
		this.method5536(arg4);
		this.method5596(Static140.aClass50_2, 0);
		this.method5543(Static140.aClass50_2, 0);
		this.method5587(arg5);
		this.aClass8_Sub3_15.method8198((float) (arg3 - 1), (float) (arg2 - 1), 1.0F);
		this.aClass8_Sub3_15.method8195(0.0F, (float) arg1 - local7, (float) arg0 - local7);
		this.method5487();
		this.method5538(false);
		this.method5561(Static385.aClass328_5, 4);
		this.method5538(true);
		this.method5543(Static503.aClass50_4, 0);
		this.method5596(Static503.aClass50_4, 0);
	}

	@OriginalMember(owner = "client!fo", name = "V", descriptor = "(I)V")
	protected abstract void method5584();

	@OriginalMember(owner = "client!fo", name = "W", descriptor = "(I)F")
	protected abstract float method5585();

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(I)V")
	@Override
	public void method5438(@OriginalArg(0) int arg0) {
		this.aClass90_3.method2385();
		this.anInt6563 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!fo", name = "X", descriptor = "(I)V")
	protected void method5586() {
		this.method5521();
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(IB)V")
	public final void method5587(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt6546) {
			return;
		}
		@Pc(19) Class27 local19;
		@Pc(21) boolean local21;
		@Pc(17) boolean local17;
		if (arg0 == 1) {
			local21 = true;
			local17 = true;
			local19 = Static464.aClass27_5;
		} else if (arg0 == 2) {
			local17 = false;
			local19 = Static537.aClass27_6;
			local21 = true;
		} else if (arg0 == 128) {
			local17 = true;
			local21 = true;
			local19 = Static553.aClass27_7;
		} else {
			local19 = Static294.aClass27_3;
			local17 = false;
			local21 = false;
		}
		if (this.aBoolean485 != local17) {
			this.aBoolean485 = local17;
			this.method5477();
		}
		if (local21 != this.aBoolean480) {
			this.aBoolean480 = local21;
			this.method5490();
		}
		if (local19 != this.aClass27_4) {
			this.aClass27_4 = local19;
			this.method5575();
		}
		this.anInt6550 &= 0xFFFFFFE3;
		this.anInt6546 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "Y", descriptor = "(I)V")
	public final void method5588() {
		this.aClass340Array3 = new Class340[this.anInt6541];
		this.anInterface10Array3 = new Interface10[this.anInt6541];
		this.aClass8_Sub3Array3 = new Class8_Sub3[this.anInt6541];
		this.aClass238Array6 = new Class238[this.anInt6541];
		this.aClass238Array5 = new Class238[this.anInt6541];
		for (@Pc(32) int local32 = 0; local32 < this.anInt6541; local32++) {
			this.aClass238Array5[local32] = Static477.aClass238_4;
			this.aClass238Array6[local32] = Static477.aClass238_4;
			this.aClass340Array3[local32] = Static503.aClass340_13;
			this.aClass8_Sub3Array3[local32] = new Class8_Sub3();
		}
		this.aClass6_Sub29Array4 = new Class6_Sub29[this.anInt6530 - 2];
		this.anInterface10_3 = this.method5530(1, 1, Static487.aClass333_15, Static336.aClass220_12);
		this.method5451(new Class6_Sub25_Sub2(262144));
		this.aClass88_13 = this.method5510(new Class7[] { new Class7(new Class13[] { Static11.aClass13_1, Static11.aClass13_5 }) });
		this.aClass88_15 = this.method5510(new Class7[] { new Class7(new Class13[] { Static11.aClass13_1, Static11.aClass13_3 }) });
		this.aClass88_16 = this.method5510(new Class7[] { new Class7(Static11.aClass13_1), new Class7(Static11.aClass13_3), new Class7(Static11.aClass13_5), new Class7(Static11.aClass13_2) });
		this.aClass88_17 = this.method5510(new Class7[] { new Class7(Static11.aClass13_1), new Class7(Static11.aClass13_3), new Class7(Static11.aClass13_5) });
		this.aClass23_Sub1_23 = new Class23_Sub1(this, 0, 0, false, false);
		this.aClass23_Sub1_28 = new Class23_Sub1(this, 0, 0, true, true);
		this.aClass23_Sub1_29 = new Class23_Sub1(this, 0, 0, false, false);
		this.aClass23_Sub1_25 = new Class23_Sub1(this, 0, 0, true, true);
		this.aClass23_Sub1_27 = new Class23_Sub1(this, 0, 0, false, false);
		this.aClass23_Sub1_30 = new Class23_Sub1(this, 0, 0, true, true);
		this.aClass23_Sub1_26 = new Class23_Sub1(this, 0, 0, false, false);
		this.aClass23_Sub1_24 = new Class23_Sub1(this, 0, 0, true, true);
		this.aClass23_Sub1_21 = new Class23_Sub1(this, 0, 0, false, false);
		this.aClass23_Sub1_22 = new Class23_Sub1(this, 0, 0, true, true);
		this.aClass308_3 = new Class308(this);
		this.anInterface21_5 = this.method5550(true);
		this.method5600();
		this.aClass149_5 = new Class149(this);
		this.aClass37Array3[1] = this.method5529(1);
		this.aClass37Array3[2] = this.method5529(2);
		this.aClass37Array3[4] = this.method5529(4);
		this.aClass37Array3[5] = this.method5529(5);
		this.aClass37Array3[6] = this.method5529(6);
		this.aClass37Array3[7] = this.method5529(7);
		this.aClass37Array3[3] = this.method5529(3);
		this.aClass37Array3[8] = this.method5529(8);
		this.aClass37Array3[9] = this.method5529(9);
		if (!this.aClass37Array3[2].method7564()) {
			this.aClass37Array3[2] = this.method5529(0);
		}
		if (!this.aClass37Array3[4].method7564()) {
			this.aClass37Array3[4] = this.aClass37Array3[2];
		}
		if (!this.aClass37Array3[8].method7564()) {
			this.aClass37Array3[8] = this.aClass37Array3[4];
		}
		if (!this.aClass37Array3[9].method7564()) {
			this.aClass37Array3[9] = this.aClass37Array3[8];
		}
		this.method5586();
		this.F();
	}

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "(II)V")
	public abstract void method5589(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "(B)Lclient!ww;")
	public final Class8_Sub3 method5590() {
		return this.aClass8_Sub3_15;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method5591(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "()I")
	@Override
	public final int method5427() {
		return this.anInt6530 - 2;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!dga;)V")
	@Override
	public final void method5391(@OriginalArg(0) Class65 arg0) {
		this.aClass65_Sub1_3 = (Class65_Sub1) arg0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIZIIZ)V")
	private void method5593(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) boolean local4 = arg4 & this.method5462();
		if (!local4 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
			arg3 = 2;
			arg0 = 1;
			arg2 = 0;
		}
		if (arg3 != 0 && arg1) {
			arg3 |= Integer.MIN_VALUE;
		}
		if (this.anInt6545 != arg3) {
			if (this.anInt6545 != 0) {
				this.aClass37Array3[this.anInt6545 & Integer.MAX_VALUE].method7561();
			}
			if (arg3 == 0) {
				this.aClass37_3 = null;
			} else {
				this.aClass37_3 = this.aClass37Array3[Integer.MAX_VALUE & arg3];
				this.aClass37_3.method7565(arg1);
				this.aClass37_3.method7559(arg1);
				this.aClass37_3.method7563(arg2, arg0);
			}
			this.anInt6557 = arg2;
			this.anInt6547 = arg0;
			this.anInt6545 = arg3;
		} else if (this.anInt6545 != 0) {
			this.aClass37Array3[Integer.MAX_VALUE & this.anInt6545].method7559(arg1);
			if (this.anInt6557 != arg2 || arg0 != this.anInt6547) {
				this.aClass37Array3[this.anInt6545 & Integer.MAX_VALUE].method7563(arg2, arg0);
				this.anInt6547 = arg0;
				this.anInt6557 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(IZ)V")
	public final void method5594(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean493) {
			this.aBoolean493 = arg0;
			this.method5533();
			this.anInt6550 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!fo", name = "Z", descriptor = "(I)V")
	private void method5595() {
		this.aBoolean489 = false;
		if (this.aClass207_8 == Static114.aClass207_4) {
			this.method5516();
			this.method5504();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!cea;BI)V")
	public final void method5596(@OriginalArg(0) Class50 arg0, @OriginalArg(2) int arg1) {
		this.method5491(false, false, arg0, arg1);
	}

	@OriginalMember(owner = "client!fo", name = "ab", descriptor = "(I)V")
	private void method5597() {
		this.anInterface20_7 = this.method5528(true);
		this.anInterface20_7.method6523(24, 12);
		this.aClass88_18 = this.method5510(new Class7[] { new Class7(Static11.aClass13_1) });
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!oh;BLclient!oh;)V")
	public final void method5598(@OriginalArg(0) Class238 arg0, @OriginalArg(2) Class238 arg1) {
		@Pc(11) boolean local11 = false;
		if (this.aClass238Array6[this.anInt6536] != arg1) {
			this.aClass238Array6[this.anInt6536] = arg1;
			this.method5599();
			local11 = true;
		}
		if (arg0 != this.aClass238Array5[this.anInt6536]) {
			this.aClass238Array5[this.anInt6536] = arg0;
			this.method5549();
			local11 = true;
		}
		if (local11) {
			this.anInt6550 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "(Z)V")
	protected abstract void method5599();

	@OriginalMember(owner = "client!fo", name = "bb", descriptor = "(I)V")
	protected final void method5600() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable6 != null && !this.aHashtable6.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable6.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method5493(local26));
			}
		}
		this.aHashtable6 = local9;
		this.method5555();
		this.method5597();
		this.aClass308_3.method7462(this);
	}

	@OriginalMember(owner = "client!fo", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public final boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass8_Sub3_16.method8193((float) arg0, (float) arg1, (float) arg2);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass8_Sub3_16.method8193((float) arg3, (float) arg4, (float) arg5);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt6540 > local14 && (float) this.anInt6540 > local31 || !(!((float) this.anInt6560 < local14) || !(local31 > (float) this.anInt6560))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt6549 * this.aClass8_Sub3_16.method8197((float) arg2, (float) arg1, (float) arg0) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt6549 * this.aClass8_Sub3_16.method8197((float) arg5, (float) arg4, (float) arg3) / local31);
		if (this.aFloat133 > (float) local81 && (float) local99 < this.aFloat133 || (float) local81 > this.aFloat132 && this.aFloat132 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt6527 * this.aClass8_Sub3_16.method8186((float) arg2, (float) arg0, (float) arg1) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt6527 * this.aClass8_Sub3_16.method8186((float) arg5, (float) arg3, (float) arg4) / local31);
			return (!(this.aFloat134 > (float) local143) || !((float) local161 < this.aFloat134)) && (!((float) local143 > this.aFloat136) || !((float) local161 > this.aFloat136));
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!ba;Lclient!tg;Lclient!q;Lclient!mr;I)V")
	@Override
	public final void method5457(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class5_Sub4 arg3, @OriginalArg(4) int arg4) {
		arg0.method7077(arg2, arg3, arg4);
		this.method5433(arg1);
	}

	@OriginalMember(owner = "client!fo", name = "cb", descriptor = "(I)V")
	private void method5601() {
		if (this.aClass37_3 != null) {
			this.aClass37_3.method7553();
		}
		this.method5496();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!vj;ZB[FI)Lclient!ae;")
	public final Interface1 method5602(@OriginalArg(0) int arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4) {
		return this.method5470(arg3, arg2, arg0, arg4, arg1);
	}
}
