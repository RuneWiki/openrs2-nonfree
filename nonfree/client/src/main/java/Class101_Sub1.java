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
public abstract class Class101_Sub1 extends Class101 {

	@OriginalMember(owner = "client!mj", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!mj", name = "K", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!mj", name = "Sc", descriptor = "Lclient!nc;")
	protected Class242 aClass242_7;

	@OriginalMember(owner = "client!mj", name = "Tc", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!mj", name = "sd", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!mj", name = "Wd", descriptor = "I")
	public int anInt6611;

	@OriginalMember(owner = "client!mj", name = "Xd", descriptor = "I")
	protected int anInt6612;

	@OriginalMember(owner = "client!mj", name = "ae", descriptor = "I")
	public int anInt6614;

	@OriginalMember(owner = "client!mj", name = "he", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!mj", name = "ie", descriptor = "F")
	private float aFloat145;

	@OriginalMember(owner = "client!mj", name = "oe", descriptor = "I")
	public int anInt6616;

	@OriginalMember(owner = "client!mj", name = "pe", descriptor = "Lclient!sja;")
	private Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!mj", name = "se", descriptor = "F")
	public float aFloat147;

	@OriginalMember(owner = "client!mj", name = "te", descriptor = "I")
	public int anInt6618;

	@OriginalMember(owner = "client!mj", name = "ve", descriptor = "F")
	private float aFloat148;

	@OriginalMember(owner = "client!mj", name = "ye", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!mj", name = "Be", descriptor = "I")
	private int anInt6621;

	@OriginalMember(owner = "client!mj", name = "Ce", descriptor = "[Lclient!mfa;")
	protected Class2_Sub13[] aClass2_Sub13Array5;

	@OriginalMember(owner = "client!mj", name = "Ge", descriptor = "I")
	private int anInt6624;

	@OriginalMember(owner = "client!mj", name = "Ke", descriptor = "[Lclient!vt;")
	protected Class381[] aClass381Array5;

	@OriginalMember(owner = "client!mj", name = "Le", descriptor = "I")
	public int anInt6626;

	@OriginalMember(owner = "client!mj", name = "Ve", descriptor = "I")
	protected int anInt6631;

	@OriginalMember(owner = "client!mj", name = "We", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!mj", name = "Xe", descriptor = "Z")
	public boolean aBoolean486;

	@OriginalMember(owner = "client!mj", name = "af", descriptor = "Z")
	public boolean aBoolean487;

	@OriginalMember(owner = "client!mj", name = "cf", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!mj", name = "df", descriptor = "[Lclient!en;")
	private Interface5[] anInterface5Array3;

	@OriginalMember(owner = "client!mj", name = "gf", descriptor = "Lclient!en;")
	public Interface5 anInterface5_3;

	@OriginalMember(owner = "client!mj", name = "uf", descriptor = "[Lclient!vt;")
	protected Class381[] aClass381Array6;

	@OriginalMember(owner = "client!mj", name = "Af", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!mj", name = "Ef", descriptor = "Z")
	protected boolean aBoolean495;

	@OriginalMember(owner = "client!mj", name = "Ff", descriptor = "I")
	protected int anInt6643;

	@OriginalMember(owner = "client!mj", name = "Jf", descriptor = "I")
	public int anInt6645;

	@OriginalMember(owner = "client!mj", name = "Mf", descriptor = "Z")
	protected boolean aBoolean497;

	@OriginalMember(owner = "client!mj", name = "Nf", descriptor = "Lclient!kca;")
	private Class192 aClass192_3;

	@OriginalMember(owner = "client!mj", name = "Tf", descriptor = "[Lclient!pg;")
	protected Class76_Sub2[] aClass76_Sub2Array3;

	@OriginalMember(owner = "client!mj", name = "Uf", descriptor = "Z")
	public boolean aBoolean498;

	@OriginalMember(owner = "client!mj", name = "Yf", descriptor = "I")
	protected int anInt6651;

	@OriginalMember(owner = "client!mj", name = "ag", descriptor = "I")
	protected int anInt6653;

	@OriginalMember(owner = "client!mj", name = "bg", descriptor = "[Lclient!saa;")
	protected Class327[] aClass327Array3;

	@OriginalMember(owner = "client!mj", name = "dg", descriptor = "Lclient!sba;")
	private Class13 aClass13_3;

	@OriginalMember(owner = "client!mj", name = "eg", descriptor = "Lclient!wba;")
	private Interface25 anInterface25_12;

	@OriginalMember(owner = "client!mj", name = "fg", descriptor = "Lclient!te;")
	public Class14_Sub3 aClass14_Sub3_21;

	@OriginalMember(owner = "client!mj", name = "gg", descriptor = "Lclient!te;")
	public Class14_Sub3 aClass14_Sub3_22;

	@OriginalMember(owner = "client!mj", name = "hg", descriptor = "Lclient!ija;")
	public Class167 aClass167_16;

	@OriginalMember(owner = "client!mj", name = "ig", descriptor = "Lclient!wba;")
	private Interface25 anInterface25_13;

	@OriginalMember(owner = "client!mj", name = "kg", descriptor = "Lclient!te;")
	public Class14_Sub3 aClass14_Sub3_23;

	@OriginalMember(owner = "client!mj", name = "lg", descriptor = "Lclient!te;")
	public Class14_Sub3 aClass14_Sub3_24;

	@OriginalMember(owner = "client!mj", name = "mg", descriptor = "Lclient!te;")
	public Class14_Sub3 aClass14_Sub3_25;

	@OriginalMember(owner = "client!mj", name = "ng", descriptor = "Lclient!te;")
	public Class14_Sub3 aClass14_Sub3_26;

	@OriginalMember(owner = "client!mj", name = "og", descriptor = "Lclient!ija;")
	private Class167 aClass167_17;

	@OriginalMember(owner = "client!mj", name = "pg", descriptor = "Lclient!ija;")
	public Class167 aClass167_18;

	@OriginalMember(owner = "client!mj", name = "qg", descriptor = "Lclient!te;")
	public Class14_Sub3 aClass14_Sub3_27;

	@OriginalMember(owner = "client!mj", name = "rg", descriptor = "Lclient!te;")
	public Class14_Sub3 aClass14_Sub3_28;

	@OriginalMember(owner = "client!mj", name = "sg", descriptor = "Lclient!ija;")
	public Class167 aClass167_19;

	@OriginalMember(owner = "client!mj", name = "tg", descriptor = "Lclient!te;")
	public Class14_Sub3 aClass14_Sub3_29;

	@OriginalMember(owner = "client!mj", name = "ug", descriptor = "Lclient!ija;")
	private Class167 aClass167_20;

	@OriginalMember(owner = "client!mj", name = "vg", descriptor = "Lclient!wba;")
	private Interface25 anInterface25_14;

	@OriginalMember(owner = "client!mj", name = "wg", descriptor = "Lclient!te;")
	public Class14_Sub3 aClass14_Sub3_30;

	@OriginalMember(owner = "client!mj", name = "xg", descriptor = "Lclient!ija;")
	public Class167 aClass167_21;

	@OriginalMember(owner = "client!mj", name = "yg", descriptor = "Lclient!vv;")
	private Interface24 anInterface24_8;

	@OriginalMember(owner = "client!mj", name = "zg", descriptor = "Lclient!ija;")
	private Class167 aClass167_22;

	@OriginalMember(owner = "client!mj", name = "Ag", descriptor = "Z")
	protected boolean aBoolean499;

	@OriginalMember(owner = "client!mj", name = "Bg", descriptor = "I")
	private int anInt6655;

	@OriginalMember(owner = "client!mj", name = "Lc", descriptor = "Lclient!ow;")
	private final Class271 aClass271_40 = new Class271();

	@OriginalMember(owner = "client!mj", name = "Yd", descriptor = "Z")
	protected boolean aBoolean479 = true;

	@OriginalMember(owner = "client!mj", name = "Vd", descriptor = "Lclient!pg;")
	protected final Class76_Sub2 aClass76_Sub2_15 = new Class76_Sub2();

	@OriginalMember(owner = "client!mj", name = "be", descriptor = "Lclient!pg;")
	public Class76_Sub2 aClass76_Sub2_16 = new Class76_Sub2();

	@OriginalMember(owner = "client!mj", name = "ce", descriptor = "Lclient!pg;")
	public final Class76_Sub2 aClass76_Sub2_17 = new Class76_Sub2();

	@OriginalMember(owner = "client!mj", name = "de", descriptor = "Lclient!pg;")
	protected final Class76_Sub2 aClass76_Sub2_18 = new Class76_Sub2();

	@OriginalMember(owner = "client!mj", name = "ee", descriptor = "Lclient!pg;")
	private final Class76_Sub2 aClass76_Sub2_19 = new Class76_Sub2();

	@OriginalMember(owner = "client!mj", name = "fe", descriptor = "Lclient!pg;")
	private final Class76_Sub2 aClass76_Sub2_20 = new Class76_Sub2();

	@OriginalMember(owner = "client!mj", name = "le", descriptor = "Z")
	private boolean aBoolean482 = false;

	@OriginalMember(owner = "client!mj", name = "qe", descriptor = "I")
	public int anInt6617 = 0;

	@OriginalMember(owner = "client!mj", name = "ze", descriptor = "F")
	public float aFloat150 = 1.0F;

	@OriginalMember(owner = "client!mj", name = "Oe", descriptor = "F")
	public float aFloat152 = 1.0F;

	@OriginalMember(owner = "client!mj", name = "Re", descriptor = "Z")
	private boolean aBoolean485 = false;

	@OriginalMember(owner = "client!mj", name = "Ue", descriptor = "I")
	private int anInt6630 = -1;

	@OriginalMember(owner = "client!mj", name = "Pe", descriptor = "F")
	public float aFloat153 = 1.0F;

	@OriginalMember(owner = "client!mj", name = "ke", descriptor = "Z")
	protected boolean aBoolean481 = false;

	@OriginalMember(owner = "client!mj", name = "je", descriptor = "Z")
	protected boolean aBoolean480 = true;

	@OriginalMember(owner = "client!mj", name = "Ie", descriptor = "I")
	protected int anInt6625 = 0;

	@OriginalMember(owner = "client!mj", name = "Ee", descriptor = "I")
	public int anInt6622 = 8;

	@OriginalMember(owner = "client!mj", name = "ge", descriptor = "I")
	public int anInt6615 = 512;

	@OriginalMember(owner = "client!mj", name = "De", descriptor = "Z")
	private boolean aBoolean483 = false;

	@OriginalMember(owner = "client!mj", name = "Fe", descriptor = "I")
	public int anInt6623 = 128;

	@OriginalMember(owner = "client!mj", name = "Ae", descriptor = "[F")
	private final float[] aFloatArray41 = new float[16];

	@OriginalMember(owner = "client!mj", name = "hf", descriptor = "Z")
	private boolean aBoolean489 = false;

	@OriginalMember(owner = "client!mj", name = "re", descriptor = "[F")
	private final float[] aFloatArray40 = new float[16];

	@OriginalMember(owner = "client!mj", name = "ne", descriptor = "F")
	private float aFloat146 = 1.0F;

	@OriginalMember(owner = "client!mj", name = "Se", descriptor = "[F")
	public final float[] aFloatArray43 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!mj", name = "Ye", descriptor = "I")
	public int anInt6632 = 3;

	@OriginalMember(owner = "client!mj", name = "qf", descriptor = "Z")
	protected boolean aBoolean493 = false;

	@OriginalMember(owner = "client!mj", name = "mf", descriptor = "Z")
	protected boolean aBoolean491 = true;

	@OriginalMember(owner = "client!mj", name = "xf", descriptor = "I")
	private int anInt6640 = 0;

	@OriginalMember(owner = "client!mj", name = "Je", descriptor = "F")
	public float aFloat151 = -1.0F;

	@OriginalMember(owner = "client!mj", name = "vf", descriptor = "I")
	public int anInt6638 = 0;

	@OriginalMember(owner = "client!mj", name = "ff", descriptor = "Z")
	protected boolean aBoolean488 = true;

	@OriginalMember(owner = "client!mj", name = "sf", descriptor = "I")
	public int anInt6637 = 50;

	@OriginalMember(owner = "client!mj", name = "lf", descriptor = "I")
	public int anInt6635 = 0;

	@OriginalMember(owner = "client!mj", name = "pf", descriptor = "Z")
	protected boolean aBoolean492 = true;

	@OriginalMember(owner = "client!mj", name = "Ze", descriptor = "I")
	private int anInt6633 = 1;

	@OriginalMember(owner = "client!mj", name = "kf", descriptor = "[F")
	private final float[] aFloatArray44 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!mj", name = "xe", descriptor = "Lclient!lo;")
	protected Class220 aClass220_7 = Static537.aClass220_9;

	@OriginalMember(owner = "client!mj", name = "Te", descriptor = "I")
	protected int anInt6629 = 0;

	@OriginalMember(owner = "client!mj", name = "ef", descriptor = "I")
	private int anInt6634 = 0;

	@OriginalMember(owner = "client!mj", name = "me", descriptor = "[F")
	private final float[] aFloatArray39 = new float[16];

	@OriginalMember(owner = "client!mj", name = "bf", descriptor = "Z")
	protected boolean bf = false;

	@OriginalMember(owner = "client!mj", name = "yf", descriptor = "Z")
	private boolean aBoolean494 = false;

	@OriginalMember(owner = "client!mj", name = "ue", descriptor = "I")
	private int anInt6619 = -1;

	@OriginalMember(owner = "client!mj", name = "zf", descriptor = "Lclient!maa;")
	protected Class227 aClass227_7 = Static348.aClass227_8;

	@OriginalMember(owner = "client!mj", name = "of", descriptor = "F")
	public float aFloat156 = -1.0F;

	@OriginalMember(owner = "client!mj", name = "Of", descriptor = "I")
	protected final int anInt6647 = 0;

	@OriginalMember(owner = "client!mj", name = "Cf", descriptor = "I")
	private int anInt6642 = -1;

	@OriginalMember(owner = "client!mj", name = "Me", descriptor = "Z")
	protected boolean aBoolean484 = true;

	@OriginalMember(owner = "client!mj", name = "Hf", descriptor = "Z")
	private boolean aBoolean496 = false;

	@OriginalMember(owner = "client!mj", name = "rf", descriptor = "I")
	protected final int anInt6636 = 0;

	@OriginalMember(owner = "client!mj", name = "He", descriptor = "[F")
	private final float[] aFloatArray42 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!mj", name = "tf", descriptor = "F")
	public float aFloat157 = 1.0F;

	@OriginalMember(owner = "client!mj", name = "Qe", descriptor = "I")
	private int anInt6628 = 16777215;

	@OriginalMember(owner = "client!mj", name = "jf", descriptor = "Z")
	protected boolean aBoolean490 = false;

	@OriginalMember(owner = "client!mj", name = "Df", descriptor = "[F")
	protected float[] aFloatArray46 = this.aFloatArray42;

	@OriginalMember(owner = "client!mj", name = "nf", descriptor = "[F")
	private final float[] aFloatArray45 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!mj", name = "Vf", descriptor = "[F")
	public final float[] aFloatArray47 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!mj", name = "Xf", descriptor = "I")
	public int anInt6650 = -1;

	@OriginalMember(owner = "client!mj", name = "Lf", descriptor = "[Lclient!sba;")
	private final Class13[] aClass13Array3 = new Class13[10];

	@OriginalMember(owner = "client!mj", name = "Rf", descriptor = "I")
	public int anInt6649 = -1;

	@OriginalMember(owner = "client!mj", name = "Wf", descriptor = "F")
	public float aFloat160 = 3584.0F;

	@OriginalMember(owner = "client!mj", name = "wf", descriptor = "I")
	public int anInt6639 = 512;

	@OriginalMember(owner = "client!mj", name = "Pf", descriptor = "I")
	protected int anInt6648 = 3584;

	@OriginalMember(owner = "client!mj", name = "cg", descriptor = "I")
	private int anInt6654 = 0;

	@OriginalMember(owner = "client!mj", name = "Gf", descriptor = "I")
	protected int anInt6644 = 0;

	@OriginalMember(owner = "client!mj", name = "we", descriptor = "I")
	private int anInt6620 = 0;

	@OriginalMember(owner = "client!mj", name = "Sf", descriptor = "F")
	public float aFloat159 = 3584.0F;

	@OriginalMember(owner = "client!mj", name = "Kf", descriptor = "I")
	protected int anInt6646 = 0;

	@OriginalMember(owner = "client!mj", name = "Zf", descriptor = "I")
	protected int anInt6652 = 0;

	@OriginalMember(owner = "client!mj", name = "If", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!mj", name = "jg", descriptor = "Lclient!pg;")
	private final Class76_Sub2 aClass76_Sub2_21 = new Class76_Sub2();

	@OriginalMember(owner = "client!mj", name = "Ob", descriptor = "Lclient!gga;")
	protected final Class124 aClass124_74;

	@OriginalMember(owner = "client!mj", name = "Ne", descriptor = "I")
	protected final int anInt6627;

	@OriginalMember(owner = "client!mj", name = "cd", descriptor = "Ljava/lang/Object;")
	protected final Object anObject14;

	@OriginalMember(owner = "client!mj", name = "Kb", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!mj", name = "Bc", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas9;

	@OriginalMember(owner = "client!mj", name = "Yb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!mj", name = "Od", descriptor = "I")
	private int anInt6605;

	@OriginalMember(owner = "client!mj", name = "Sd", descriptor = "I")
	public int anInt6608;

	@OriginalMember(owner = "client!mj", name = "Bf", descriptor = "I")
	public final int anInt6641;

	@OriginalMember(owner = "client!mj", name = "Mc", descriptor = "I")
	private int anInt6556;

	@OriginalMember(owner = "client!mj", name = "Id", descriptor = "I")
	public int anInt6599;

	@OriginalMember(owner = "client!mj", name = "Qf", descriptor = "Lclient!mv;")
	private final Class239 aClass239_3;

	@OriginalMember(owner = "client!mj", name = "bb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!gga;II)V")
	protected Class101_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) Class124 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.aClass124_74 = arg3;
			this.anInt6627 = arg4;
			this.anObject13 = this.anObject14 = arg1;
			this.aCanvas8 = this.aCanvas9 = arg0;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt6608 = this.anInt6605 = local307.width;
			this.anInt6641 = arg5;
			this.anInt6599 = this.anInt6556 = local307.height;
			Static28.method489(false, true);
			if (super.anInterface3_12 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt6641);
				this.aClass239_3 = null;
			} else {
				this.aClass239_3 = new Class239(this, super.anInterface3_12);
				this.aNativeInterface3 = new NativeInterface(super.anInterface3_12.method1943(), this.anInt6641);
				for (@Pc(352) int local352 = 0; local352 < super.anInterface3_12.method1943(); local352++) {
					@Pc(360) Class136 local360 = super.anInterface3_12.method1941(local352);
					if (local360 != null) {
						this.aNativeInterface3.initTextureMetrics(local352, local360.aByte67, local360.aByte66);
					}
				}
			}
		} catch (@Pc(395) Throwable local395) {
			local395.printStackTrace();
			this.method8148();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	@Override
	public final void method8080(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)Lclient!pg;")
	public final Class76_Sub2 method5829() {
		return this.aClass76_Sub2_15;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)Lclient!vv;")
	public final Interface24 method5830(@OriginalArg(0) int arg0) {
		if (this.anInterface24_8.method9028() < arg0 * 2) {
			this.anInterface24_8.method9031(arg0);
		}
		return this.anInterface24_8;
	}

	@OriginalMember(owner = "client!mj", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass76_Sub2_16.method7336((float) arg2, (float) arg0, (float) arg1);
		if (local14 < (float) this.anInt6637 || (float) this.anInt6648 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt6615 * this.aClass76_Sub2_16.method7333((float) arg1, (float) arg2, (float) arg0) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt6639 * this.aClass76_Sub2_16.method7341((float) arg0, (float) arg2, (float) arg1) / (float) arg3);
		arg4[2] = (int) local14;
		arg4[0] = (int) ((float) local58 - this.aFloat144);
		arg4[1] = (int) ((float) local77 - this.aFloat154);
	}

	@OriginalMember(owner = "client!mj", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt6617, this.anInt6635, this.anInt6615, this.anInt6639 };
	}

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(II)Lclient!sba;")
	protected Class13 method5831(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class13_Sub8(this);
		} else if (arg0 == 1) {
			return new Class13_Sub3(this);
		} else if (arg0 == 2) {
			return new Class13_Sub5(this, this.aClass242_7);
		} else if (arg0 == 7) {
			return new Class13_Sub10(this);
		} else {
			return new Class13_Sub9(this);
		}
	}

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "(I)Lclient!pg;")
	public final Class76_Sub2 method5832() {
		return this.aClass76_Sub2Array3[this.anInt6625];
	}

	@OriginalMember(owner = "client!mj", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt6628;
		if (local11 || this.aFloat151 != arg1 || this.aFloat156 != arg2) {
			this.anInt6628 = arg0;
			this.aFloat151 = arg1;
			this.aFloat156 = arg2;
			if (local11) {
				this.aFloat152 = (float) (this.anInt6628 & 0xFF) / 255.0F;
				this.aFloat153 = (float) (this.anInt6628 & 0xFF00) / 65280.0F;
				this.aFloat157 = (float) (this.anInt6628 & 0xFF0000) / 1.671168E7F;
				this.method5863();
			}
			this.aNativeInterface3.setSunColour(this.aFloat157, this.aFloat153, this.aFloat152, arg1, arg2);
			this.method5865();
		}
		if (this.aFloatArray44[0] != arg3 || arg4 != this.aFloatArray44[1] || this.aFloatArray44[2] != arg5) {
			this.aFloatArray44[2] = arg5;
			this.aFloatArray44[0] = arg3;
			this.aFloatArray44[1] = arg4;
			this.aFloatArray45[1] = -arg4;
			this.aFloatArray45[2] = -arg5;
			this.aFloatArray45[0] = -arg3;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray47[0] = arg3 * local149;
			this.aFloatArray47[2] = arg5 * local149;
			this.aFloatArray47[1] = arg4 * local149;
			this.aFloatArray43[2] = -this.aFloatArray47[2];
			this.aFloatArray43[1] = -this.aFloatArray47[1];
			this.aFloatArray43[0] = -this.aFloatArray47[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray47[0], this.aFloatArray47[1], this.aFloatArray47[2]);
			this.method5843();
			this.anInt6616 = (int) (arg3 * 256.0F / arg4);
			this.anInt6626 = (int) (arg5 * 256.0F / arg4);
		}
		this.method5838();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III[IZ)Lclient!lba;")
	public final Interface10 method5833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		return this.method5916(arg2, 0, arg0, arg1, 0, arg3);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!nea;I[BI)Lclient!oq;")
	public abstract Interface13 method5834(@OriginalArg(2) Class244 arg0, @OriginalArg(4) byte[] arg1);

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "(I)Lclient!pg;")
	public final Class76_Sub2 method5835() {
		return this.aClass76_Sub2_18;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ)V")
	public final void method5836(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean481) {
			this.aBoolean481 = arg0;
			this.method5892();
			this.anInt6621 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!mj", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt6652 = 0;
		this.anInt6644 = 0;
		this.anInt6629 = this.anInt6608;
		this.anInt6646 = this.anInt6599;
		if (this.aBoolean499) {
			this.aBoolean499 = false;
			this.method5869();
		}
		this.method5940();
	}

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "()Z")
	@Override
	public final boolean method8128() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BZ)V")
	public final void method5837(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean490 != arg0) {
			this.aBoolean490 = arg0;
			this.method5929();
			this.anInt6621 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public final Class2_Sub5 method8100(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub5_Sub2 local8 = new Class2_Sub5_Sub2(arg0);
		this.aClass271_40.method7174(local8);
		return local8;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
	protected abstract void method5838();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)V")
	public final void method5839(@OriginalArg(0) byte arg0) {
		this.method5933(arg0 << 8 | arg0 << 24 | arg0 << 16 | arg0);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(IB)V")
	public final void method5840(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method5891(Static512.aClass381_5, Static512.aClass381_5);
		} else if (arg0 == 0) {
			this.method5891(Static175.aClass381_3, Static175.aClass381_3);
		} else if (arg0 == 2) {
			this.method5891(Static98.aClass381_1, Static512.aClass381_5);
		} else if (arg0 == 3) {
			this.method5891(Static238.aClass381_4, Static175.aClass381_3);
		} else if (arg0 == 4) {
			this.method5891(Static136.aClass381_2, Static136.aClass381_2);
		}
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
	protected abstract void method5841();

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "(I)V")
	public final void method5842() {
		if (Static348.aClass227_8 == this.aClass227_7) {
			return;
		}
		@Pc(10) Class227 local10 = this.aClass227_7;
		this.aClass227_7 = Static348.aClass227_8;
		if (local10.method6167()) {
			this.method5923();
		}
		this.anInt6621 &= 0xFFFFFFE0;
		this.aFloatArray46 = this.aFloatArray42;
	}

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "(I)V")
	public abstract void method5843();

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "()Z")
	@Override
	public final boolean method8117() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(Z)V")
	protected abstract void method5844();

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "(I)V")
	private void method5846() {
		this.anInterface25_13 = this.method5856(false);
		this.anInterface25_13.method9040(140, 28);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(36) Buffer local36 = this.anInterface25_13.method9043();
			if (local36 != null) {
				@Pc(43) Stream local43 = this.method5942(local36);
				if (Stream.c()) {
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
				} else {
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
				}
				local43.a();
				if (this.anInterface25_13.method9041()) {
					break;
				}
			}
		}
		this.aClass167_22 = this.method5871(new Class280[] { new Class280(new Class354[] { Static591.aClass354_1, Static591.aClass354_5, Static591.aClass354_5 }) });
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class18 method8087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class18_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8144(@OriginalArg(0) Canvas arg0) {
		this.aCanvas8 = null;
		this.anObject13 = null;
		if (arg0 == null || arg0 == this.aCanvas9) {
			this.aCanvas8 = this.aCanvas9;
			this.anObject13 = this.anObject14;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject13 = this.aHashtable5.get(arg0);
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.anObject13 == null) {
			throw new RuntimeException();
		}
		this.method5915(this.anObject13, this.aCanvas8);
		this.method5885();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZ[BIILclient!nea;I)Lclient!lba;")
	protected abstract Interface10 method5847(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class244 arg4);

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
	@Override
	public final void method8088(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "()Lclient!dm;")
	@Override
	public final Class76 method8141() {
		return new Class76_Sub2();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBLclient!nea;Lclient!dr;I)Lclient!lba;")
	public abstract Interface10 method5848(@OriginalArg(0) int arg0, @OriginalArg(2) Class244 arg1, @OriginalArg(3) Class79 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "(I)V")
	protected abstract void method5849();

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method8129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method5913();
		this.method5861();
		this.method5933(arg4);
		this.method5954(0, Static660.aClass118_5);
		this.method5890(0, Static660.aClass118_5);
		this.method5963(arg5);
		this.aClass76_Sub2_15.method7334((float) (arg2 - 1), 1.0F, (float) (arg3 - 1));
		this.aClass76_Sub2_15.method7332((float) arg1 - local7, 0.0F, (float) arg0 - local7);
		this.method5944();
		this.method5907(false);
		this.method5924(Static310.aClass320_4, 4);
		this.method5907(true);
		this.method5890(0, Static44.aClass118_1);
		this.method5954(0, Static44.aClass118_1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLclient!nea;Lclient!dr;)Z")
	public abstract boolean method5850(@OriginalArg(1) Class244 arg0, @OriginalArg(2) Class79 arg1);

	@OriginalMember(owner = "client!mj", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6649 == arg0 && this.anInt6650 == arg1 && arg2 == this.anInt6638) {
			return;
		}
		this.anInt6649 = arg0;
		this.anInt6638 = arg2;
		this.anInt6650 = arg1;
		this.method5925();
		this.method5945();
	}

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "(I)V")
	protected final void method5851() {
		@Pc(9) Enumeration local9 = this.aHashtable5.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method5888(this.aHashtable5.get(local15), local15);
		}
		this.anInterface25_13.method9037();
		this.anInterface25_14.method9037();
		this.anInterface25_12.method9037();
		this.aClass14_Sub3_25.method8657();
		this.aClass14_Sub3_21.method8657();
		this.aClass14_Sub3_23.method8657();
		this.aClass14_Sub3_26.method8657();
		this.aClass14_Sub3_30.method8657();
		this.aClass192_3.method5016();
		this.anInterface24_8.method9037();
	}

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "(I)V")
	public final void method5852() {
		if (this.anInt6621 == 16) {
			return;
		}
		this.method5919();
		this.method5921(true);
		this.method5837(true);
		this.method5864(true);
		this.method5963(1);
		this.anInt6621 = 16;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!rl;II)V")
	public abstract void method5853(@OriginalArg(0) int arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mj", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6624 = arg0;
		this.anInt6654 = arg3;
		this.aBoolean498 = true;
		this.anInt6619 = arg2;
		this.anInt6642 = arg1;
	}

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "()I")
	@Override
	public final int method8109() {
		return this.anInt6651 - 2;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(Z)V")
	protected abstract void method5854();

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "(I)V")
	public final void method5855() {
		if (this.anInt6621 == 2) {
			return;
		}
		this.method5946();
		this.method5921(false);
		this.method5836(false);
		this.method5837(false);
		this.method5864(false);
		this.method5873(-2, false, false);
		this.anInt6621 = 2;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)Lclient!wba;")
	public abstract Interface25 method5856(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "(I)V")
	protected abstract void method5857();

	@OriginalMember(owner = "client!mj", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean498 = false;
	}

	@OriginalMember(owner = "client!mj", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt6612 + this.anInt6611 + this.anInt6614;
	}

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "(I)V")
	private void method5858() {
		if (this.aBoolean483) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray40;
		@Pc(21) float local21 = (float) (-this.anInt6617 * this.anInt6637) / (float) this.anInt6615;
		@Pc(36) float local36 = (float) ((this.anInt6608 - this.anInt6617) * this.anInt6637) / (float) this.anInt6615;
		@Pc(47) float local47 = (float) (this.anInt6637 * this.anInt6635) / (float) this.anInt6639;
		@Pc(62) float local62 = (float) ((this.anInt6635 - this.anInt6599) * this.anInt6637) / (float) this.anInt6639;
		if (local36 == local21 || local62 == local47) {
			local9[6] = 0.0F;
			local9[7] = 0.0F;
			local9[9] = 0.0F;
			local9[10] = 1.0F;
			local9[2] = 0.0F;
			local9[13] = 0.0F;
			local9[12] = 0.0F;
			local9[3] = 0.0F;
			local9[4] = 0.0F;
			local9[14] = 0.0F;
			local9[15] = 1.0F;
			local9[5] = 1.0F;
			local9[8] = 0.0F;
			local9[11] = 0.0F;
			local9[1] = 0.0F;
			local9[0] = 1.0F;
		} else {
			@Pc(76) float local76 = (float) this.anInt6637 * 2.0F;
			local9[13] = 0.0F;
			local9[2] = 0.0F;
			local9[10] = this.aFloat145 = (float) this.anInt6648 / (float) (this.anInt6637 - this.anInt6648);
			local9[1] = 0.0F;
			local9[7] = 0.0F;
			local9[8] = (local21 + local36) / (-local21 + local36);
			local9[6] = 0.0F;
			local9[15] = 0.0F;
			local9[3] = 0.0F;
			local9[0] = local76 / (local36 - local21);
			local9[14] = this.aFloat148 = (float) (this.anInt6648 * this.anInt6637) / (float) (this.anInt6637 - this.anInt6648);
			local9[11] = -1.0F;
			local9[12] = 0.0F;
			local9[9] = (local47 + local62) / (-local62 + local47);
			local9[4] = 0.0F;
			local9[5] = local76 / (local47 - local62);
		}
		this.method5906();
		this.aBoolean483 = true;
	}

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "(I)V")
	private void method5859() {
		this.aFloat160 = (float) this.anInt6648;
	}

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "(I)V")
	protected abstract void method5860();

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "(I)V")
	private void method5861() {
		if (this.anInt6621 == 1) {
			return;
		}
		this.method5946();
		this.method5921(false);
		this.method5836(false);
		this.method5837(false);
		this.method5864(false);
		this.method5873(-2, false, false);
		this.method5840(1);
		this.method5909(this.anInterface5_3);
		this.anInt6621 = 1;
	}

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "(II)V")
	public final void method5862(@OriginalArg(0) int arg0) {
		if (this.anInt6625 != arg0) {
			this.anInt6625 = arg0;
			this.method5948();
		}
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
	protected abstract void method5863();

	@OriginalMember(owner = "client!mj", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8091(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(ZI)V")
	public final void method5864(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean493) {
			this.aBoolean493 = arg0;
			this.method5857();
			this.anInt6621 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "()Z")
	@Override
	public final boolean method8136() {
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method8132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local9 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local16 * local16 + local9 * local9));
			local18 = (float) Math.atan2((double) local16, (double) local9);
		}
		this.method5861();
		this.method5933(arg4);
		this.method5954(0, Static660.aClass118_5);
		this.method5890(0, Static660.aClass118_5);
		this.method5963(0);
		this.aClass76_Sub2_15.method7334(local20, 1.0F, (float) arg5);
		this.aClass76_Sub2_15.method9640(0, -arg5 / 2, 0);
		this.aClass76_Sub2_15.method9627((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass76_Sub2_15.method9640(arg0, arg1, 0);
		this.method5944();
		this.method5907(false);
		this.method5918();
		this.method5907(true);
		this.method5890(0, Static44.aClass118_1);
		this.method5954(0, Static44.aClass118_1);
	}

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "(I)V")
	protected abstract void method5865();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!vr;)V")
	@Override
	public final void method8068(@OriginalArg(0) Class3 arg0) {
		this.aClass3_Sub2_3 = (Class3_Sub2) arg0;
	}

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "(I)V")
	protected final void method5866() {
		@Pc(17) Hashtable local17 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(28) Enumeration local28 = this.aHashtable5.keys();
			while (local28.hasMoreElements()) {
				@Pc(34) Canvas local34 = (Canvas) local28.nextElement();
				local17.put(local34, this.method5875(local34));
			}
		}
		this.aHashtable5 = local17;
		this.method5846();
		this.method5900();
		this.method5882();
		this.aClass192_3.method5015(this);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(IB)V")
	public abstract void method5867(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	@Override
	public final void method8062(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mj", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat150) {
			this.aFloat150 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method5863();
			this.method5838();
		}
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "()Z")
	@Override
	public final boolean method8086() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method8138() {
	}

	@OriginalMember(owner = "client!mj", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!mj", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt6632 = 0;
		while (arg0 > 1) {
			this.anInt6632++;
			arg0 >>= 0x1;
		}
		this.anInt6622 = 0x1 << this.anInt6632;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)V")
	private void method5868() {
		this.method5863();
		this.method5865();
		this.method5892();
		this.method5926();
		this.method5843();
		this.method5838();
		this.method5860();
		this.method5929();
		this.method5857();
		this.method5945();
		this.method5849();
		this.method5841();
		this.method5912();
		this.method5961();
		for (@Pc(54) int local54 = this.anInt6618 - 1; local54 >= 0; local54--) {
			this.method5862(local54);
			this.method5896();
			this.method5883();
			this.method5952();
		}
		this.method5910();
		this.method5914();
		this.method5930();
		this.method5943();
		this.method5854();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!gka;)V")
	@Override
	public final void method8065(@OriginalArg(0) Class127 arg0) {
		this.aClass192_3.method5013(-1, this, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "A", descriptor = "(I)V")
	protected abstract void method5869();

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "()Z")
	@Override
	public final boolean method8123() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean498) {
			throw new RuntimeException("");
		}
		this.anInt6654 = arg3;
		this.anInt6624 = arg0;
		this.anInt6642 = arg1;
		this.anInt6619 = arg2;
		if (this.aBoolean496) {
			this.aClass13Array3[3].method8497();
			this.aClass13Array3[3].method8499();
		}
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(B)V")
	protected abstract void method5870();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Lclient!pfa;)Lclient!ija;")
	public abstract Class167 method5871(@OriginalArg(1) Class280[] arg0);

	@OriginalMember(owner = "client!mj", name = "B", descriptor = "(I)V")
	protected void method5872() {
		this.method5868();
	}

	@OriginalMember(owner = "client!mj", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt6644) {
			local5 = true;
			this.anInt6644 = arg0;
		}
		if (arg2 < this.anInt6629) {
			this.anInt6629 = arg2;
			local5 = true;
		}
		if (this.anInt6652 < arg1) {
			local5 = true;
			this.anInt6652 = arg1;
		}
		if (arg3 < this.anInt6646) {
			local5 = true;
			this.anInt6646 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean499) {
			this.aBoolean499 = true;
			this.method5869();
		}
		this.method5844();
		this.method5940();
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		if (local10 == 0.0F && local17 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(38) float local38 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
			local10 *= local38;
			local17 *= local38;
		}
		if (!this.method5955(0.0F, local17 + (float) arg3, (float) arg1, 0.0F, (float) arg0, (float) arg2 + local10)) {
			return;
		}
		this.method5861();
		this.method5933(arg4);
		this.method5954(0, Static660.aClass118_5);
		this.method5890(0, Static660.aClass118_5);
		this.method5963(arg5);
		this.method5895();
		this.method5907(false);
		this.method5951();
		this.method5907(true);
		this.method5890(0, Static44.aClass118_1);
		this.method5954(0, Static44.aClass118_1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZBZ)V")
	public final void method5873(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt6630 || this.aBoolean498 != this.aBoolean496) {
			@Pc(20) Interface10 local20 = null;
			@Pc(22) int local22 = 0;
			@Pc(24) byte local24 = 0;
			@Pc(26) int local26 = 0;
			@Pc(33) int local33 = this.aBoolean498 ? 3 : 0;
			if (arg0 < 0) {
				this.method5952();
			} else {
				local20 = this.aClass239_3.method6483(arg0);
				@Pc(57) Class136 local57 = super.anInterface3_12.method1941(arg0);
				if (local57.aByte61 == 0 && local57.aByte65 == 0) {
					this.method5952();
				} else {
					@Pc(73) int local73 = local57.aBoolean333 ? 64 : 128;
					@Pc(77) int local77 = local73 * 50;
					@Pc(81) Class76_Sub2 local81 = this.method5832();
					local81.method7343((float) (this.anInt6645 % local77 * local57.aByte61) / (float) local77, 0.0F, (float) (local57.aByte65 * (this.anInt6645 % local77)) / (float) local77);
					this.method5902(Static174.aClass327_1);
				}
				local22 = local57.anInt4368;
				if (!this.aBoolean498) {
					local26 = local57.anInt4369;
					local33 = local57.aByte62;
					local24 = local57.aByte64;
				}
			}
			this.method5920(local24, arg2, arg1, local26, local33);
			if (this.aClass13_3 == null) {
				this.method5909(local20);
				this.method5840(local22);
			} else {
				this.aClass13_3.method8494(local20, local22);
			}
			this.aBoolean496 = this.aBoolean498;
			this.anInt6630 = arg0;
		}
		this.anInt6621 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(Z)I")
	public final int method5874() {
		return this.anInt6625;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	protected abstract Object method5875(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIF)Lclient!mfa;")
	@Override
	public final Class2_Sub13 method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub13_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!nea;Lclient!dr;I)Z")
	public abstract boolean method5876(@OriginalArg(0) Class244 arg0, @OriginalArg(1) Class79 arg1);

	@OriginalMember(owner = "client!mj", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8091(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!mj", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass76_Sub2_16.aFloat169 + this.aClass76_Sub2_16.aFloat175 * (float) arg2 + (float) arg0 * this.aClass76_Sub2_16.aFloat174 + (float) arg1 * this.aClass76_Sub2_16.aFloat166;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg3 * this.aClass76_Sub2_16.aFloat174 + this.aClass76_Sub2_16.aFloat166 * (float) arg4 + (float) arg5 * this.aClass76_Sub2_16.aFloat175 + this.aClass76_Sub2_16.aFloat169;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt6637 && local63 < (float) this.anInt6637) {
			local7 |= 0x10;
		} else if ((float) this.anInt6648 < local32 && (float) this.anInt6648 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) (((float) arg2 * this.aClass76_Sub2_16.aFloat171 + this.aClass76_Sub2_16.aFloat173 * (float) arg1 + this.aClass76_Sub2_16.aFloat167 * (float) arg0 + this.aClass76_Sub2_16.aFloat176) * (float) this.anInt6615 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt6615 * (this.aClass76_Sub2_16.aFloat176 + this.aClass76_Sub2_16.aFloat171 * (float) arg5 + (float) arg4 * this.aClass76_Sub2_16.aFloat173 + this.aClass76_Sub2_16.aFloat167 * (float) arg3) / local63);
		if ((float) local135 < this.aFloat144 && this.aFloat144 > (float) local167) {
			local7 |= 0x1;
		} else if (this.aFloat155 < (float) local135 && (float) local167 > this.aFloat155) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass76_Sub2_16.aFloat170 + (float) arg1 * this.aClass76_Sub2_16.aFloat165 + (float) arg0 * this.aClass76_Sub2_16.aFloat168 + (float) arg2 * this.aClass76_Sub2_16.aFloat172) * (float) this.anInt6639 / local32);
		@Pc(265) int local265 = (int) ((this.aClass76_Sub2_16.aFloat170 + this.aClass76_Sub2_16.aFloat168 * (float) arg3 + this.aClass76_Sub2_16.aFloat165 * (float) arg4 + this.aClass76_Sub2_16.aFloat172 * (float) arg5) * (float) this.anInt6639 / local63);
		if ((float) local233 < this.aFloat154 && this.aFloat154 > (float) local265) {
			local7 |= 0x4;
		} else if (this.aFloat147 < (float) local233 && (float) local265 > this.aFloat147) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!nea;[FIZIB)Lclient!lba;")
	protected abstract Interface10 method5877(@OriginalArg(1) int arg0, @OriginalArg(2) Class244 arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(B)V")
	private void method5878() {
		this.aBoolean494 = false;
		this.method5959();
		if (Static269.aClass227_9 == this.aClass227_7) {
			this.method5962();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(FB)V")
	public final void method5879(@OriginalArg(0) float arg0) {
		if (this.aFloat146 != arg0) {
			this.aFloat146 = arg0;
			this.method5878();
		}
	}

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "()Z")
	@Override
	public final boolean method8114() {
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5861();
		this.method5933(arg4);
		this.method5954(0, Static660.aClass118_5);
		this.method5890(0, Static660.aClass118_5);
		this.method5963(arg5);
		this.aClass76_Sub2_15.method7334((float) arg2, 1.0F, (float) arg3);
		this.aClass76_Sub2_15.method9640(arg0, arg1, 0);
		this.method5944();
		this.method5907(false);
		this.method5918();
		this.method5907(true);
		this.method5890(0, Static44.aClass118_1);
		this.method5954(0, Static44.aClass118_1);
	}

	@OriginalMember(owner = "client!mj", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass76_Sub2_16.method7336((float) arg2, (float) arg0, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt6615 * this.aClass76_Sub2_16.method7333((float) arg1, (float) arg2, (float) arg0) / local14);
			local58 = (int) ((float) this.anInt6639 * this.aClass76_Sub2_16.method7341((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local40 = this.anInt6617;
			local58 = this.anInt6635;
		}
		arg3[1] = (int) ((float) local58 - this.aFloat154);
		arg3[0] = (int) ((float) local40 - this.aFloat144);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z[[IIZ)Lclient!wf;")
	public abstract Interface26 method5880(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "(I)Lclient!pg;")
	public final Class76_Sub2 method5881() {
		return this.aClass76_Sub2_19;
	}

	@OriginalMember(owner = "client!mj", name = "D", descriptor = "(I)V")
	private void method5882() {
		this.anInterface25_12 = this.method5856(false);
		this.anInterface25_12.method9040(3096, 12);
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			@Pc(36) Buffer local36 = this.anInterface25_12.method9043();
			if (local36 != null) {
				@Pc(43) Stream local43 = this.method5942(local36);
				local43.a(0.0F);
				local43.a(0.0F);
				local43.a(0.0F);
				for (@Pc(54) int local54 = 0; local54 <= 256; local54++) {
					@Pc(65) double local65 = (double) (local54 * 2) * 3.141592653589793D / 256.0D;
					@Pc(69) float local69 = (float) Math.cos(local65);
					@Pc(73) float local73 = (float) Math.sin(local65);
					if (Stream.c()) {
						local43.a(local73);
						local43.a(local69);
						local43.a(0.0F);
					} else {
						local43.b(local73);
						local43.b(local69);
						local43.b(0.0F);
					}
				}
				local43.a();
				if (this.anInterface25_12.method9041()) {
					break;
				}
			}
		}
		this.aClass167_17 = this.method5871(new Class280[] { new Class280(Static591.aClass354_1) });
	}

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "()Z")
	@Override
	public final boolean method8135() {
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method8073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!mj", name = "E", descriptor = "(I)V")
	protected abstract void method5883();

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(Z)V")
	private void method5884() {
		if (Static304.aClass227_10 == this.aClass227_7) {
			@Pc(11) float local11 = this.method5913();
			this.aClass76_Sub2_15.method7332(local11, 0.0F, local11);
		}
		this.aBoolean485 = false;
		this.method5943();
		if (this.aClass13_3 != null) {
			this.aClass13_3.method8492();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ida;IIII)Lclient!ka;")
	@Override
	public final Class14 method8064(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class14_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "(Z)V")
	private void method5885() {
		if (this.aCanvas8 == null) {
			this.anInt6605 = this.anInt6556 = 1;
		} else {
			@Pc(24) Dimension local24 = this.aCanvas8.getSize();
			this.anInt6605 = local24.width;
			this.anInt6556 = local24.height;
		}
		this.anInt6608 = this.anInt6605;
		this.anInt6599 = this.anInt6556;
		this.method5886();
		this.method5903();
		this.method5878();
		this.method5914();
		this.method5940();
		this.method5842();
		this.la();
	}

	@OriginalMember(owner = "client!mj", name = "F", descriptor = "(I)V")
	private void method5886() {
		this.aBoolean489 = false;
		if (this.aClass227_7 == Static304.aClass227_10) {
			this.method5935();
			this.method5962();
		}
	}

	@OriginalMember(owner = "client!mj", name = "G", descriptor = "(I)[F")
	public final float[] method5887() {
		return this.aFloatArray42;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	protected abstract void method5888(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!mj", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt6648;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
	@Override
	public final void method8098() {
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!up;B)V")
	public abstract void method5889(@OriginalArg(0) Class362 arg0);

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass76_Sub2_16.aFloat169 + (float) arg2 * this.aClass76_Sub2_16.aFloat175 + this.aClass76_Sub2_16.aFloat174 * (float) arg0 + this.aClass76_Sub2_16.aFloat166 * (float) arg1;
		@Pc(57) float local57 = (float) arg5 * this.aClass76_Sub2_16.aFloat175 + this.aClass76_Sub2_16.aFloat166 * (float) arg4 + this.aClass76_Sub2_16.aFloat174 * (float) arg3 + this.aClass76_Sub2_16.aFloat169;
		if ((float) this.anInt6637 > local32 && (float) this.anInt6637 > local57) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt6648 && local57 > (float) this.anInt6648) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass76_Sub2_16.aFloat176 + (float) arg1 * this.aClass76_Sub2_16.aFloat173 + this.aClass76_Sub2_16.aFloat167 * (float) arg0 + this.aClass76_Sub2_16.aFloat171 * (float) arg2) * (float) this.anInt6615 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt6615 * (this.aClass76_Sub2_16.aFloat176 + this.aClass76_Sub2_16.aFloat173 * (float) arg4 + this.aClass76_Sub2_16.aFloat167 * (float) arg3 + this.aClass76_Sub2_16.aFloat171 * (float) arg5) / (float) arg6);
		if ((float) local124 < this.aFloat144 && this.aFloat144 > (float) local157) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat155 && this.aFloat155 < (float) local157) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass76_Sub2_16.aFloat172 * (float) arg2 + (float) arg0 * this.aClass76_Sub2_16.aFloat168 + this.aClass76_Sub2_16.aFloat165 * (float) arg1 + this.aClass76_Sub2_16.aFloat170) * (float) this.anInt6639 / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt6639 * ((float) arg5 * this.aClass76_Sub2_16.aFloat172 + (float) arg3 * this.aClass76_Sub2_16.aFloat168 + this.aClass76_Sub2_16.aFloat165 * (float) arg4 + this.aClass76_Sub2_16.aFloat170) / (float) arg6);
		if (this.aFloat154 > (float) local224 && (float) local257 < this.aFloat154) {
			local7 |= 0x4;
		} else if (this.aFloat147 < (float) local224 && (float) local257 > this.aFloat147) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!gca;B)V")
	public final void method5890(@OriginalArg(0) int arg0, @OriginalArg(1) Class118 arg1) {
		this.method5908(arg0, arg1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!vt;Lclient!vt;B)V")
	public final void method5891(@OriginalArg(0) Class381 arg0, @OriginalArg(1) Class381 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg0 != this.aClass381Array5[this.anInt6625]) {
			this.aClass381Array5[this.anInt6625] = arg0;
			local5 = true;
			this.method5896();
		}
		if (this.aClass381Array6[this.anInt6625] != arg1) {
			this.aClass381Array6[this.anInt6625] = arg1;
			this.method5883();
			local5 = true;
		}
		if (local5) {
			this.anInt6621 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "(B)V")
	protected abstract void method5892();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([I)V")
	@Override
	public final void method8106(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6599;
		arg0[0] = this.anInt6608;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLclient!pg;)V")
	public final void method5893(@OriginalArg(1) Class76_Sub2 arg0) {
		this.aClass76_Sub2_15.method9629(arg0);
		this.aBoolean479 = false;
		this.method5884();
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(BZ)V")
	public final void method5894(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean492 != arg0) {
			this.aBoolean492 = arg0;
			this.method5945();
		}
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "()Lclient!dm;")
	@Override
	public final Class76 method8085() {
		return this.aClass76_Sub2_21;
	}

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "(B)V")
	public final void method5895() {
		this.aClass76_Sub2_15.method9631();
		this.aBoolean479 = true;
		this.method5884();
	}

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)V")
	@Override
	public final void method8122(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass239_3 != null) {
			this.aClass239_3.method6482();
		}
		this.anInt6623 = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "H", descriptor = "(I)V")
	protected abstract void method5896();

	@OriginalMember(owner = "client!mj", name = "I", descriptor = "(I)V")
	public final void method5897() {
		this.method5842();
		this.method5962();
	}

	@OriginalMember(owner = "client!mj", name = "J", descriptor = "(I)V")
	private void method5898() {
		this.method5870();
		if (this.aClass13_3 != null) {
			this.aClass13_3.method8493();
		}
	}

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "(B)V")
	public final void method5899() {
		this.aClass381Array5 = new Class381[this.anInt6618];
		this.aClass327Array3 = new Class327[this.anInt6618];
		this.anInterface5Array3 = new Interface5[this.anInt6618];
		this.aClass76_Sub2Array3 = new Class76_Sub2[this.anInt6618];
		this.aClass381Array6 = new Class381[this.anInt6618];
		for (@Pc(32) int local32 = 0; local32 < this.anInt6618; local32++) {
			this.aClass381Array6[local32] = Static175.aClass381_3;
			this.aClass381Array5[local32] = Static175.aClass381_3;
			this.aClass327Array3[local32] = Static401.aClass327_3;
			this.aClass76_Sub2Array3[local32] = new Class76_Sub2();
		}
		this.aClass2_Sub13Array5 = new Class2_Sub13[this.anInt6651 - 2];
		this.anInterface5_3 = this.method5848(1, Static584.aClass244_9, Static114.aClass79_7, 1);
		this.method8082(new Class2_Sub5_Sub2(262144));
		this.aClass167_19 = this.method5871(new Class280[] { new Class280(new Class354[] { Static591.aClass354_1, Static591.aClass354_5 }) });
		this.aClass167_18 = this.method5871(new Class280[] { new Class280(new Class354[] { Static591.aClass354_1, Static591.aClass354_3 }) });
		this.aClass167_21 = this.method5871(new Class280[] { new Class280(Static591.aClass354_1), new Class280(Static591.aClass354_3), new Class280(Static591.aClass354_5), new Class280(Static591.aClass354_2) });
		this.aClass167_16 = this.method5871(new Class280[] { new Class280(Static591.aClass354_1), new Class280(Static591.aClass354_3), new Class280(Static591.aClass354_5) });
		this.aClass14_Sub3_24 = new Class14_Sub3(this, 0, 0, false, false);
		this.aClass14_Sub3_25 = new Class14_Sub3(this, 0, 0, true, true);
		this.aClass14_Sub3_28 = new Class14_Sub3(this, 0, 0, false, false);
		this.aClass14_Sub3_21 = new Class14_Sub3(this, 0, 0, true, true);
		this.aClass14_Sub3_29 = new Class14_Sub3(this, 0, 0, false, false);
		this.aClass14_Sub3_23 = new Class14_Sub3(this, 0, 0, true, true);
		this.aClass14_Sub3_27 = new Class14_Sub3(this, 0, 0, false, false);
		this.aClass14_Sub3_26 = new Class14_Sub3(this, 0, 0, true, true);
		this.aClass14_Sub3_22 = new Class14_Sub3(this, 0, 0, false, false);
		this.aClass14_Sub3_30 = new Class14_Sub3(this, 0, 0, true, true);
		this.aClass192_3 = new Class192(this);
		this.anInterface24_8 = this.method5941(true);
		this.method5866();
		this.aClass242_7 = new Class242(this);
		this.aClass13Array3[1] = this.method5831(1);
		this.aClass13Array3[2] = this.method5831(2);
		this.aClass13Array3[4] = this.method5831(4);
		this.aClass13Array3[5] = this.method5831(5);
		this.aClass13Array3[6] = this.method5831(6);
		this.aClass13Array3[7] = this.method5831(7);
		this.aClass13Array3[3] = this.method5831(3);
		this.aClass13Array3[8] = this.method5831(8);
		this.aClass13Array3[9] = this.method5831(9);
		if (!this.aClass13Array3[2].method8489()) {
			this.aClass13Array3[2] = this.method5831(0);
		}
		if (!this.aClass13Array3[4].method8489()) {
			this.aClass13Array3[4] = this.aClass13Array3[2];
		}
		if (!this.aClass13Array3[8].method8489()) {
			this.aClass13Array3[8] = this.aClass13Array3[4];
		}
		if (!this.aClass13Array3[9].method8489()) {
			this.aClass13Array3[9] = this.aClass13Array3[8];
		}
		this.method5872();
		this.la();
		this.method8147();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZ)Lclient!mq;")
	@Override
	public final Class71 method8079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class71_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(Z)V")
	@Override
	public final void method8121(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean484 = arg0;
		this.method5857();
	}

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
	@Override
	public void method8118(@OriginalArg(0) int arg0) {
		if (this.aClass239_3 != null) {
			this.aClass239_3.method6485();
		}
		this.anInt6645 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "(B)V")
	private void method5900() {
		this.anInterface25_14 = this.method5856(true);
		this.anInterface25_14.method9040(24, 12);
		this.aClass167_20 = this.method5871(new Class280[] { new Class280(Static591.aClass354_1) });
	}

	@OriginalMember(owner = "client!mj", name = "K", descriptor = "(I)I")
	public final int method5901() {
		return this.anInt6624;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8092(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas9) {
			local5 = this.anObject13;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method5934(local5, arg0);
		if (this.aCanvas8 == arg0) {
			this.method5885();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!saa;)V")
	public final void method5902(@OriginalArg(1) Class327 arg0) {
		this.aClass327Array3[this.anInt6625] = arg0;
		this.method5898();
	}

	@OriginalMember(owner = "client!mj", name = "L", descriptor = "(I)V")
	private void method5903() {
		this.aBoolean483 = false;
		this.method5858();
		if (this.aClass227_7 == Static332.aClass227_6) {
			this.method5962();
		}
	}

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "()Z")
	@Override
	public final boolean method8110() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "M", descriptor = "(I)V")
	public final void method5904() {
		if (this.anInt6621 == 4) {
			return;
		}
		this.method5946();
		this.method5921(false);
		this.method5836(false);
		this.method5837(false);
		this.method5864(false);
		this.method5873(-2, false, false);
		this.method5963(1);
		this.method5840(0);
		this.anInt6621 = 4;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!de;Z)Lclient!mq;")
	@Override
	public final Class71 method8063(@OriginalArg(0) Class67 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class71 local21;
		if (arg0.anInt1761 == 0 || arg0.anInt1759 == 0) {
			local21 = this.method8111(1, new int[1], 1, 1);
		} else {
			@Pc(30) int[] local30 = new int[arg0.anInt1761 * arg0.anInt1759];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			@Pc(39) int local39;
			@Pc(43) int local43;
			if (arg0.aByteArray20 == null) {
				for (local39 = 0; local39 < arg0.anInt1759; local39++) {
					for (local43 = 0; local43 < arg0.anInt1761; local43++) {
						@Pc(97) int local97 = arg0.anIntArray91[arg0.aByteArray19[local32++] & 0xFF];
						local30[local34++] = local97 == 0 ? 0 : local97 | 0xFF000000;
					}
				}
			} else {
				for (local39 = 0; local39 < arg0.anInt1759; local39++) {
					for (local43 = 0; local43 < arg0.anInt1761; local43++) {
						local30[local34++] = arg0.anIntArray91[arg0.aByteArray19[local32] & 0xFF] | arg0.aByteArray20[local32] << 24;
						local32++;
					}
				}
			}
			local21 = this.method8111(arg0.anInt1761, local30, arg0.anInt1759, arg0.anInt1761);
		}
		local21.method7690(arg0.anInt1760, arg0.anInt1763, arg0.anInt1762, arg0.anInt1764);
		return local21;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(IZ)V")
	public final void method5905(@OriginalArg(1) boolean arg0) {
		if (this.bf != arg0) {
			this.bf = arg0;
			this.method5892();
		}
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt6637 && arg1 == this.anInt6648) {
			return;
		}
		this.anInt6648 = arg1;
		this.anInt6637 = arg0;
		this.method5903();
		this.method5878();
		this.method5925();
	}

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "(B)V")
	private void method5906() {
		this.aFloatArray40[10] = this.aFloat145;
		this.aFloatArray40[14] = this.aFloat148;
		this.aFloat159 = (this.aFloatArray40[14] - (float) this.anInt6648) / this.aFloatArray40[10];
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(IZ)V")
	public abstract void method5907(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZLclient!gca;B)V")
	protected abstract void method5908(@OriginalArg(0) int arg0, @OriginalArg(2) Class118 arg1);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!en;)V")
	public final void method5909(@OriginalArg(1) Interface5 arg0) {
		if (this.anInterface5Array3[this.anInt6625] == arg0) {
			return;
		}
		this.anInterface5Array3[this.anInt6625] = arg0;
		if (arg0 == null) {
			this.method5931();
		} else {
			arg0.method9326();
		}
		this.anInt6621 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()V")
	@Override
	public final void method8066() {
		if (this.aClass239_3 != null) {
			this.aClass239_3.method6482();
		}
	}

	@OriginalMember(owner = "client!mj", name = "N", descriptor = "(I)V")
	protected abstract void method5910();

	@OriginalMember(owner = "client!mj", name = "O", descriptor = "(I)V")
	public final void method5911() {
		if (this.anInt6621 == 8) {
			return;
		}
		this.method5937();
		this.method5921(true);
		this.method5837(true);
		this.method5864(true);
		this.method5963(1);
		this.anInt6621 = 8;
	}

	@OriginalMember(owner = "client!mj", name = "P", descriptor = "(I)V")
	protected abstract void method5912();

	@OriginalMember(owner = "client!mj", name = "Q", descriptor = "(I)F")
	protected abstract float method5913();

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)I")
	@Override
	public final int method8083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!mj", name = "R", descriptor = "(I)V")
	protected abstract void method5914();

	@OriginalMember(owner = "client!mj", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt6629;
		arg0[1] = this.anInt6652;
		arg0[3] = this.anInt6646;
		arg0[0] = this.anInt6644;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method8126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!mj", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt6608 - 1 && arg1 <= 0 && this.anInt6599 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt6629 = arg2 > this.anInt6608 ? 0 : arg2;
		this.anInt6652 = arg1 < 0 ? 0 : arg1;
		this.anInt6644 = arg0 < 0 ? 0 : arg0;
		this.anInt6646 = this.anInt6608 < arg3 ? 0 : arg3;
		if (!this.aBoolean499) {
			this.aBoolean499 = true;
			this.method5869();
		}
		this.method5844();
		this.method5940();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method5915(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(II)I")
	@Override
	public final int method8095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "()V")
	@Override
	protected void method8124() {
		if (this.aBoolean482) {
			return;
		}
		for (@Pc(9) Class2 local9 = this.aClass271_40.method7177(); local9 != null; local9 = this.aClass271_40.method7175()) {
			((Class2_Sub5_Sub2) local9).method3778();
		}
		@Pc(26) Enumeration local26 = this.aHashtable5.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method5888(this.aHashtable5.get(local32), local32);
		}
		Static508.method7933(true, false);
		this.aNativeInterface3.release();
		this.aBoolean482 = true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([IIIIIIZ)Lclient!lba;")
	public abstract Interface10 method5916(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!nea;ZI[BIB)Lclient!lba;")
	public final Interface10 method5917(@OriginalArg(0) Class244 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		return this.method5847(arg2, arg1, arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "S", descriptor = "(I)V")
	public final void method5918() {
		this.method5924(Static70.aClass320_1, 2);
	}

	@OriginalMember(owner = "client!mj", name = "T", descriptor = "(I)V")
	private void method5919() {
		if (Static269.aClass227_9 == this.aClass227_7) {
			return;
		}
		@Pc(6) Class227 local6 = this.aClass227_7;
		this.aClass227_7 = Static269.aClass227_9;
		if (!local6.method6167()) {
			this.method5923();
		}
		this.method5959();
		this.aFloatArray46 = this.aFloatArray41;
		this.method5962();
		this.anInt6621 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBZZII)V")
	private void method5920(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) boolean local6 = arg1 & this.method8102();
		if (!local6 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			arg4 = 2;
			arg3 = 1;
			arg0 = 0;
		}
		if (arg4 != 0 && arg2) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (this.anInt6640 != arg4) {
			if (this.anInt6640 != 0) {
				this.aClass13Array3[this.anInt6640 & Integer.MAX_VALUE].method8498();
			}
			if (arg4 == 0) {
				this.aClass13_3 = null;
			} else {
				this.aClass13_3 = this.aClass13Array3[arg4 & Integer.MAX_VALUE];
				this.aClass13_3.method8490(arg2);
				this.aClass13_3.method8495(arg2);
				this.aClass13_3.method8488(arg3, arg0);
			}
			this.anInt6640 = arg4;
			this.anInt6634 = arg0;
			this.anInt6620 = arg3;
		} else if (this.anInt6640 != 0) {
			this.aClass13Array3[Integer.MAX_VALUE & this.anInt6640].method8495(arg2);
			if (this.anInt6634 != arg0 || this.anInt6620 != arg3) {
				this.aClass13Array3[this.anInt6640 & Integer.MAX_VALUE].method8488(arg3, arg0);
				this.anInt6634 = arg0;
				this.anInt6620 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface10 local9 = local6.anInterface10_6;
		this.method5855();
		this.method5909(local9);
		this.method5963(1);
		this.method5891(Static512.aClass381_5, Static512.aClass381_5);
		this.method5954(0, Static660.aClass118_5);
		this.method5933(arg0);
		this.aClass76_Sub2_15.method7334((float) this.anInt6608, 0.0F, (float) this.anInt6599);
		this.method5944();
		this.aClass76_Sub2Array3[0].method7334(local9.method9102((float) this.anInt6608), 1.0F, local9.method9104((float) this.anInt6599));
		this.aClass76_Sub2Array3[0].method7332(local9.method9104((float) -arg3), 0.0F, local9.method9102((float) -arg2));
		this.aClass327Array3[0] = Static174.aClass327_1;
		this.method5898();
		this.method5918();
		this.method5952();
		this.method5954(0, Static44.aClass118_1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!gka;I)V")
	@Override
	public final void method8115(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1) {
		this.aClass192_3.method5013(arg1, this, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(BZ)V")
	public final void method5921(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean497) {
			this.aBoolean497 = arg0;
			this.method5945();
			this.anInt6621 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZZLclient!gca;I)V")
	public abstract void method5922(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class118 arg3);

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "(B)V")
	private void method5923() {
		this.aBoolean485 = false;
		if (this.aClass13_3 != null) {
			this.aClass13_3.method8487();
		}
		this.method5854();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!rl;IB)V")
	private void method5924(@OriginalArg(0) Class320 arg0, @OriginalArg(1) int arg1) {
		this.method5953(0, this.anInterface25_13);
		this.method5938(this.aClass167_22);
		this.method5853(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!mj", name = "U", descriptor = "(I)V")
	private void method5925() {
		if (this.aClass13_3 != null) {
			this.aClass13_3.method8499();
		}
		this.method5849();
	}

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "(B)V")
	protected void method5926() {
		this.anInt6631 = this.anInt6643;
		this.anInt6643 = 0;
	}

	@OriginalMember(owner = "client!mj", name = "V", descriptor = "(I)I")
	public final int method5927() {
		return this.anInt6619;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method5928(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap6.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "(Z)V")
	protected abstract void method5929();

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "(B)V")
	protected abstract void method5930();

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "(Z)V")
	protected abstract void method5931();

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(ZI)V")
	public final void method5932(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean488 != arg0) {
			this.aBoolean488 = arg0;
			this.method5860();
		}
	}

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "()Z")
	@Override
	public final boolean method8134() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(IB)V")
	public final void method5933(@OriginalArg(0) int arg0) {
		if (this.anInt6653 != arg0) {
			this.anInt6653 = arg0;
			this.method5910();
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method5934(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "(Z)V")
	private void method5935() {
		if (this.aBoolean489) {
			return;
		}
		@Pc(15) float[] local15 = this.aFloatArray39;
		if (this.anInt6608 == 0 || this.anInt6599 == 0) {
			local15[8] = 0.0F;
			local15[10] = 1.0F;
			local15[14] = 0.0F;
			local15[3] = 0.0F;
			local15[15] = 1.0F;
			local15[0] = 1.0F;
			local15[11] = 0.0F;
			local15[9] = 0.0F;
			local15[12] = 0.0F;
			local15[1] = 0.0F;
			local15[13] = 0.0F;
			local15[2] = 0.0F;
			local15[5] = 1.0F;
			local15[4] = 0.0F;
			local15[7] = 0.0F;
			local15[6] = 0.0F;
		} else {
			local15[1] = 0.0F;
			local15[5] = -2.0F / (float) this.anInt6599;
			local15[9] = 0.0F;
			local15[2] = 0.0F;
			local15[7] = 0.0F;
			local15[14] = 0.5F;
			local15[6] = 0.0F;
			local15[11] = 0.0F;
			local15[0] = 2.0F / (float) this.anInt6608;
			local15[15] = 1.0F;
			local15[10] = 0.5F;
			local15[3] = 0.0F;
			local15[4] = 0.0F;
			local15[8] = 0.0F;
			local15[12] = -1.0F;
			local15[13] = 1.0F;
		}
		this.aBoolean489 = true;
	}

	@OriginalMember(owner = "client!mj", name = "W", descriptor = "(I)Lclient!pg;")
	public final Class76_Sub2 method5936() {
		return this.aClass76_Sub2Array3[this.anInt6625];
	}

	@OriginalMember(owner = "client!mj", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass76_Sub2_16.method7336((float) arg2, (float) arg0, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt6615 * this.aClass76_Sub2_16.method7333((float) arg1, (float) arg2, (float) arg0) / local14);
			local58 = (int) ((float) this.anInt6639 * this.aClass76_Sub2_16.method7341((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local40 = this.anInt6617;
			local58 = this.anInt6635;
		}
		arg3[1] = (int) ((float) local58 - this.aFloat154);
		arg3[0] = (int) ((float) local40 - this.aFloat144);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!mj", name = "Y", descriptor = "(I)V")
	private void method5937() {
		if (Static332.aClass227_6 == this.aClass227_7) {
			return;
		}
		@Pc(6) Class227 local6 = this.aClass227_7;
		this.aClass227_7 = Static332.aClass227_6;
		if (!local6.method6167()) {
			this.method5923();
		}
		this.method5858();
		this.aFloatArray46 = this.aFloatArray40;
		this.method5962();
		this.anInt6621 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method8097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static38.method787(arg1, arg3, arg2, arg0, this);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8119(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas9 == arg0) {
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
			@Pc(53) Object local53 = this.method5875(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!dm;)V")
	@Override
	public final void method8067(@OriginalArg(0) Class76 arg0) {
		this.aClass76_Sub2_16 = (Class76_Sub2) arg0;
		this.aClass76_Sub2_18.method9629(this.aClass76_Sub2_16);
		this.aClass76_Sub2_18.method7340();
		this.aClass76_Sub2_19.method7339(this.aClass76_Sub2_18);
		this.aClass76_Sub2_17.method7339(this.aClass76_Sub2_16);
		if (this.aClass227_7.method6167()) {
			this.method5923();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method8137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) float local12 = (float) -arg0 + (float) arg2;
		@Pc(18) float local18 = (float) arg3 - (float) arg1;
		@Pc(39) float local39;
		if (local12 == 0.0F && local18 == 0.0F) {
			local12 = 1.0F;
		} else {
			local39 = (float) (1.0D / Math.sqrt((double) (local18 * local18 + local12 * local12)));
			local12 *= local39;
			local18 *= local39;
		}
		this.method5861();
		this.method5933(arg4);
		this.method5954(0, Static660.aClass118_5);
		this.method5890(0, Static660.aClass118_5);
		this.method5963(1);
		this.method5895();
		this.method5907(false);
		@Pc(86) int local86 = arg7 % (arg6 + arg5);
		local39 = local12 * (float) arg5;
		@Pc(96) float local96 = (float) arg5 * local18;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = 0.0F;
		@Pc(102) float local102 = local39;
		@Pc(104) float local104 = local96;
		if (arg5 < local86) {
			local100 = (float) (arg6 + arg5 - local86) * local18;
			local98 = local12 * (float) (arg6 + arg5 - local86);
		} else {
			local102 = (float) (arg5 - local86) * local12;
			local104 = (float) (arg5 - local86) * local18;
		}
		@Pc(149) float local149 = (float) arg0 + local98;
		@Pc(154) float local154 = local100 + (float) arg1;
		@Pc(159) float local159 = (float) arg6 * local12;
		@Pc(164) float local164 = (float) arg6 * local18;
		while (true) {
			if (arg0 < arg2) {
				if ((float) arg2 < local149) {
					break;
				}
				if ((float) arg2 < local102 + local149) {
					local102 = (float) arg2 - local149;
				}
			} else {
				if (local149 < (float) arg2) {
					break;
				}
				if (local149 + local102 < (float) arg2) {
					local102 = (float) arg2 - local149;
				}
			}
			if (arg3 > arg1) {
				if ((float) arg3 < local154) {
					break;
				}
				if ((float) arg3 < local104 + local154) {
					local104 = (float) arg3 - local154;
				}
			} else {
				if ((float) arg3 > local154) {
					break;
				}
				if (local154 + local104 < (float) arg3) {
					local104 = (float) arg3 - local154;
				}
			}
			if (!this.method5955(0.0F, local154 + local104, local154, 0.0F, local149, local149 + local102)) {
				return;
			}
			this.method5951();
			local149 += local159 + local102;
			local154 += local164 + local104;
			local104 = local96;
			local102 = local39;
		}
		this.method5907(true);
		this.method5890(0, Static44.aClass118_1);
		this.method5954(0, Static44.aClass118_1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ija;I)V")
	public abstract void method5938(@OriginalArg(0) Class167 arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z[FLclient!nea;III)Lclient!lba;")
	public final Interface10 method5939(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Class244 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		return this.method5877(arg3, arg2, arg1, arg4, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "Z", descriptor = "(I)V")
	private void method5940() {
		this.aFloat155 = (float) (this.anInt6629 - this.anInt6617);
		this.aFloat147 = (float) (this.anInt6646 - this.anInt6635);
		this.aFloat154 = (float) (this.anInt6652 - this.anInt6635);
		this.aFloat144 = (float) (this.anInt6644 - this.anInt6617);
	}

	@OriginalMember(owner = "client!mj", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5861();
		this.method5933(arg3);
		this.method5954(0, Static660.aClass118_5);
		this.method5890(0, Static660.aClass118_5);
		this.method5963(arg4);
		this.aClass76_Sub2_15.method7334((float) arg2, 1.0F, (float) arg2);
		this.aClass76_Sub2_15.method9640(arg0, arg1, 0);
		this.method5944();
		this.method5907(false);
		this.method5953(0, this.anInterface25_12);
		this.method5938(this.aClass167_17);
		this.method5853(0, Static70.aClass320_1, 256);
		this.method5907(true);
		this.method5890(0, Static44.aClass118_1);
		this.method5954(0, Static44.aClass118_1);
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(IZ)Lclient!vv;")
	public abstract Interface24 method5941(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method5942(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!mj", name = "ab", descriptor = "(I)V")
	protected abstract void method5943();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Lclient!mfa;)V")
	@Override
	public final void method8094(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass2_Sub13Array5[local3] = arg1[local3];
		}
		this.anInt6643 = arg0;
		if (this.aClass227_7.method6167()) {
			this.method5926();
		}
	}

	@OriginalMember(owner = "client!mj", name = "bb", descriptor = "(I)V")
	public final void method5944() {
		this.aBoolean479 = false;
		this.method5884();
	}

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt6637;
	}

	@OriginalMember(owner = "client!mj", name = "cb", descriptor = "(I)V")
	protected abstract void method5945();

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "(B)V")
	private void method5946() {
		if (this.aClass227_7 == Static304.aClass227_10) {
			return;
		}
		@Pc(6) Class227 local6 = this.aClass227_7;
		this.aClass227_7 = Static304.aClass227_10;
		if (local6.method6167()) {
			this.method5923();
		}
		this.method5935();
		this.aFloatArray46 = this.aFloatArray39;
		this.method5962();
		this.anInt6621 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!vv;Lclient!rl;III)V")
	public abstract void method5947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIZ)Lclient!mq;")
	@Override
	public final Class71 method8077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class71_Sub2 local11 = new Class71_Sub2(this, arg2, arg3, arg4);
		local11.method7706(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "(B)V")
	protected abstract void method5948();

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "(B)I")
	public final int method5949() {
		return this.anInt6642;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[F)[F")
	public final float[] method5950(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloatArray46[1];
		arg0[0] = this.aFloatArray46[0];
		arg0[12] = this.aFloatArray46[3];
		arg0[8] = this.aFloatArray46[2];
		arg0[2] = this.aFloatArray46[8];
		arg0[13] = this.aFloatArray46[7];
		arg0[5] = this.aFloatArray46[5];
		arg0[1] = this.aFloatArray46[4];
		arg0[9] = this.aFloatArray46[6];
		arg0[3] = this.aFloatArray46[12];
		arg0[10] = this.aFloatArray46[10];
		arg0[6] = this.aFloatArray46[9];
		arg0[14] = this.aFloatArray46[11];
		arg0[7] = this.aFloatArray46[13];
		arg0[11] = this.aFloatArray46[14];
		arg0[15] = this.aFloatArray46[15];
		return arg0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8074(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas9) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method5888(this.aHashtable5.get(arg0), arg0);
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "db", descriptor = "(I)V")
	private void method5951() {
		this.method5953(0, this.anInterface25_14);
		this.method5938(this.aClass167_20);
		this.method5853(0, Static605.aClass320_5, 1);
	}

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "()Lclient!dm;")
	@Override
	public final Class76 method8112() {
		return this.aClass76_Sub2_16;
	}

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "(Z)V")
	public final void method5952() {
		if (Static401.aClass327_3 != this.aClass327Array3[this.anInt6625]) {
			this.aClass327Array3[this.anInt6625] = Static401.aClass327_3;
			this.aClass76_Sub2Array3[this.anInt6625].method9631();
			this.method5898();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!rt;[Lclient!de;Z)Lclient!da;")
	@Override
	public final Class59 method8146(@OriginalArg(0) Class324 arg0, @OriginalArg(1) Class67[] arg1) {
		return new Class59_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!mj", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6635 = arg1;
		this.anInt6617 = arg0;
		this.anInt6615 = arg2;
		this.anInt6639 = arg3;
		this.method5878();
		this.method5903();
		this.method5842();
		this.method5940();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BILclient!wba;)V")
	public abstract void method5953(@OriginalArg(1) int arg0, @OriginalArg(2) Interface25 arg1);

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(IIIIII)Lclient!vr;")
	@Override
	public final Class3 method8130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class3_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!gca;)V")
	public final void method5954(@OriginalArg(0) int arg0, @OriginalArg(2) Class118 arg1) {
		this.method5922(arg0, false, false, arg1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(FFFIFFF)Z")
	private boolean method5955(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface25_14.method9043();
		if (local9 == null) {
			return false;
		}
		@Pc(18) Stream local18 = this.method5942(local9);
		if (Stream.c()) {
			local18.a(arg4);
			local18.a(arg2);
			local18.a(arg0);
			local18.a(arg5);
			local18.a(arg1);
			local18.a(arg3);
		} else {
			local18.b(arg4);
			local18.b(arg2);
			local18.b(arg0);
			local18.b(arg5);
			local18.b(arg1);
			local18.b(arg3);
		}
		local18.a();
		return this.anInterface25_14.method9041();
	}

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "(Z)I")
	public final int method5956() {
		return this.anInt6654;
	}

	@OriginalMember(owner = "client!mj", name = "fb", descriptor = "(I)Lclient!pg;")
	public final Class76_Sub2 method5958() {
		if (!this.aBoolean485) {
			this.aClass76_Sub2_20.method7335(this.aClass76_Sub2_18, this.aClass76_Sub2_15);
			this.aBoolean485 = true;
		}
		return this.aClass76_Sub2_20;
	}

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "(B)V")
	private void method5959() {
		if (this.aBoolean494) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray41;
		@Pc(9) float local9 = (float) this.anInt6637;
		@Pc(13) float local13 = (float) this.anInt6648;
		@Pc(25) float local25 = (float) -this.anInt6635 * this.aFloat146 / (float) this.anInt6639;
		@Pc(37) float local37 = this.aFloat146 * (float) -this.anInt6617 / (float) this.anInt6615;
		@Pc(51) float local51 = (float) (this.anInt6608 - this.anInt6617) * this.aFloat146 / (float) this.anInt6615;
		@Pc(66) float local66 = this.aFloat146 * (float) (this.anInt6599 - this.anInt6635) / (float) this.anInt6639;
		if (local37 == local51 || local66 == local25) {
			local5[1] = 0.0F;
			local5[15] = 1.0F;
			local5[12] = 0.0F;
			local5[4] = 0.0F;
			local5[8] = 0.0F;
			local5[5] = 1.0F;
			local5[7] = 0.0F;
			local5[3] = 0.0F;
			local5[11] = 0.0F;
			local5[10] = 1.0F;
			local5[6] = 0.0F;
			local5[14] = 0.0F;
			local5[13] = 0.0F;
			local5[0] = 1.0F;
			local5[2] = 0.0F;
			local5[9] = 0.0F;
		} else {
			local5[9] = 0.0F;
			local5[13] = (local25 + local66) / (-local25 + local66);
			local5[4] = 0.0F;
			local5[7] = 0.0F;
			local5[8] = 0.0F;
			local5[10] = 1.0F / (local9 - local13);
			local5[1] = 0.0F;
			local5[3] = 0.0F;
			local5[14] = local9 / (local9 - local13);
			local5[15] = 1.0F;
			local5[2] = 0.0F;
			local5[5] = 2.0F / (local66 - local25);
			local5[12] = (local51 + local37) / (local37 - local51);
			local5[11] = 0.0F;
			local5[6] = 0.0F;
			local5[0] = 2.0F / (local51 - local37);
		}
		this.method5859();
		this.aBoolean494 = true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method8082(@OriginalArg(0) Class2_Sub5 arg0) {
		this.aNativeHeap6 = ((Class2_Sub5_Sub2) arg0).aNativeHeap4;
		this.aNativeHeapBuffer5 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!mj", name = "gb", descriptor = "(I)Lclient!wf;")
	public final Interface26 method5960() {
		return this.aClass3_Sub2_3 == null ? null : this.aClass3_Sub2_3.method3428();
	}

	@OriginalMember(owner = "client!mj", name = "hb", descriptor = "(I)V")
	protected abstract void method5961();

	@OriginalMember(owner = "client!mj", name = "ib", descriptor = "(I)V")
	private void method5962() {
		this.method5930();
		if (this.aClass13_3 != null) {
			this.aClass13_3.method8496();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([IIIIIZ)Lclient!mq;")
	@Override
	public final Class71 method8105(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class71_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "()Z")
	@Override
	public final boolean method8133() {
		return this.aBoolean495;
	}

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "()Z")
	@Override
	public final boolean method8102() {
		return this.aClass13Array3[3].method8489();
	}

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "(II)V")
	public final void method5963(@OriginalArg(1) int arg0) {
		if (this.anInt6633 == arg0) {
			return;
		}
		@Pc(14) Class220 local14;
		@Pc(12) boolean local12;
		@Pc(16) boolean local16;
		if (arg0 == 1) {
			local12 = true;
			local14 = Static537.aClass220_9;
			local16 = true;
		} else if (arg0 == 2) {
			local14 = Static470.aClass220_6;
			local12 = true;
			local16 = false;
		} else if (arg0 == 128) {
			local16 = true;
			local14 = Static497.aClass220_8;
			local12 = true;
		} else {
			local16 = false;
			local12 = false;
			local14 = Static156.aClass220_3;
		}
		if (this.aBoolean480 != local16) {
			this.aBoolean480 = local16;
			this.method5961();
		}
		if (this.aBoolean491 != local12) {
			this.aBoolean491 = local12;
			this.method5841();
		}
		if (local14 != this.aClass220_7) {
			this.aClass220_7 = local14;
			this.method5912();
		}
		this.anInt6633 = arg0;
		this.anInt6621 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!mj", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt6655;
	}
}
