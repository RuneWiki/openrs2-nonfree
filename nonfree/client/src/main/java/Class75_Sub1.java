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

@OriginalClass("client!jj")
public abstract class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!jj", name = "B", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!jj", name = "Xe", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!jj", name = "Ad", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7;

	@OriginalMember(owner = "client!jj", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!jj", name = "F", descriptor = "Lclient!jd;")
	protected Class184 aClass184_6;

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
	protected int anInt7645;

	@OriginalMember(owner = "client!jj", name = "ge", descriptor = "I")
	public int anInt7648;

	@OriginalMember(owner = "client!jj", name = "tc", descriptor = "I")
	public int anInt7649;

	@OriginalMember(owner = "client!jj", name = "Qe", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!jj", name = "zd", descriptor = "I")
	protected int anInt7650;

	@OriginalMember(owner = "client!jj", name = "vc", descriptor = "[Lclient!ie;")
	protected Class109_Sub3[] aClass109_Sub3Array3;

	@OriginalMember(owner = "client!jj", name = "pg", descriptor = "Z")
	public boolean aBoolean556;

	@OriginalMember(owner = "client!jj", name = "dd", descriptor = "[Lclient!ta;")
	protected Class6_Sub10[] aClass6_Sub10Array5;

	@OriginalMember(owner = "client!jj", name = "Nc", descriptor = "I")
	public int anInt7658;

	@OriginalMember(owner = "client!jj", name = "Cb", descriptor = "I")
	protected int anInt7660;

	@OriginalMember(owner = "client!jj", name = "df", descriptor = "[Lclient!ah;")
	private Interface1[] anInterface1Array3;

	@OriginalMember(owner = "client!jj", name = "Ld", descriptor = "I")
	protected int anInt7661;

	@OriginalMember(owner = "client!jj", name = "vb", descriptor = "I")
	public int anInt7662;

	@OriginalMember(owner = "client!jj", name = "V", descriptor = "Z")
	public boolean aBoolean561;

	@OriginalMember(owner = "client!jj", name = "X", descriptor = "Lclient!ah;")
	public Interface1 anInterface1_3;

	@OriginalMember(owner = "client!jj", name = "yf", descriptor = "I")
	public int anInt7666;

	@OriginalMember(owner = "client!jj", name = "Td", descriptor = "Lclient!oo;")
	private Class23 aClass23_3;

	@OriginalMember(owner = "client!jj", name = "ae", descriptor = "Z")
	protected boolean aBoolean564;

	@OriginalMember(owner = "client!jj", name = "zg", descriptor = "Z")
	protected boolean aBoolean565;

	@OriginalMember(owner = "client!jj", name = "Kc", descriptor = "[Lclient!kl;")
	protected Class211[] aClass211Array3;

	@OriginalMember(owner = "client!jj", name = "U", descriptor = "I")
	public int anInt7673;

	@OriginalMember(owner = "client!jj", name = "Lf", descriptor = "Z")
	public boolean aBoolean569;

	@OriginalMember(owner = "client!jj", name = "kb", descriptor = "I")
	private int anInt7676;

	@OriginalMember(owner = "client!jj", name = "Xb", descriptor = "Lclient!qja;")
	private Class299 aClass299_3;

	@OriginalMember(owner = "client!jj", name = "Bc", descriptor = "F")
	private float aFloat149;

	@OriginalMember(owner = "client!jj", name = "Gd", descriptor = "F")
	private float aFloat150;

	@OriginalMember(owner = "client!jj", name = "Vc", descriptor = "Lclient!ov;")
	private Class81_Sub1 aClass81_Sub1_3;

	@OriginalMember(owner = "client!jj", name = "Zb", descriptor = "[Lclient!tka;")
	protected Class344[] aClass344Array5;

	@OriginalMember(owner = "client!jj", name = "bc", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
	protected int anInt7683;

	@OriginalMember(owner = "client!jj", name = "pd", descriptor = "I")
	private int anInt7685;

	@OriginalMember(owner = "client!jj", name = "Af", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!jj", name = "ff", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!jj", name = "nd", descriptor = "F")
	public float aFloat156;

	@OriginalMember(owner = "client!jj", name = "ib", descriptor = "F")
	public float aFloat157;

	@OriginalMember(owner = "client!jj", name = "ld", descriptor = "[Lclient!tka;")
	protected Class344[] aClass344Array6;

	@OriginalMember(owner = "client!jj", name = "Mb", descriptor = "Lclient!nka;")
	public Class54_Sub2 aClass54_Sub2_21;

	@OriginalMember(owner = "client!jj", name = "Qc", descriptor = "Lclient!ot;")
	private Class207 aClass207_16;

	@OriginalMember(owner = "client!jj", name = "E", descriptor = "Lclient!nka;")
	public Class54_Sub2 aClass54_Sub2_22;

	@OriginalMember(owner = "client!jj", name = "Ke", descriptor = "Lclient!nka;")
	public Class54_Sub2 aClass54_Sub2_23;

	@OriginalMember(owner = "client!jj", name = "N", descriptor = "Lclient!uba;")
	private Interface25 anInterface25_7;

	@OriginalMember(owner = "client!jj", name = "xc", descriptor = "Lclient!nka;")
	public Class54_Sub2 aClass54_Sub2_24;

	@OriginalMember(owner = "client!jj", name = "ec", descriptor = "Lclient!ot;")
	public Class207 aClass207_17;

	@OriginalMember(owner = "client!jj", name = "nf", descriptor = "Lclient!nka;")
	public Class54_Sub2 aClass54_Sub2_25;

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "Lclient!nka;")
	public Class54_Sub2 aClass54_Sub2_26;

	@OriginalMember(owner = "client!jj", name = "sc", descriptor = "Lclient!nka;")
	public Class54_Sub2 aClass54_Sub2_27;

	@OriginalMember(owner = "client!jj", name = "Ic", descriptor = "Lclient!ot;")
	public Class207 aClass207_18;

	@OriginalMember(owner = "client!jj", name = "re", descriptor = "Lclient!ot;")
	public Class207 aClass207_19;

	@OriginalMember(owner = "client!jj", name = "Yd", descriptor = "Lclient!bl;")
	private Interface6 anInterface6_12;

	@OriginalMember(owner = "client!jj", name = "ve", descriptor = "Lclient!bl;")
	private Interface6 anInterface6_13;

	@OriginalMember(owner = "client!jj", name = "mc", descriptor = "Lclient!bl;")
	private Interface6 anInterface6_14;

	@OriginalMember(owner = "client!jj", name = "Lc", descriptor = "Lclient!nka;")
	public Class54_Sub2 aClass54_Sub2_28;

	@OriginalMember(owner = "client!jj", name = "xf", descriptor = "Lclient!ot;")
	public Class207 aClass207_20;

	@OriginalMember(owner = "client!jj", name = "Wd", descriptor = "Lclient!nka;")
	public Class54_Sub2 aClass54_Sub2_29;

	@OriginalMember(owner = "client!jj", name = "af", descriptor = "Lclient!nka;")
	public Class54_Sub2 aClass54_Sub2_30;

	@OriginalMember(owner = "client!jj", name = "Yb", descriptor = "Lclient!ot;")
	private Class207 aClass207_21;

	@OriginalMember(owner = "client!jj", name = "ng", descriptor = "Lclient!ot;")
	private Class207 aClass207_22;

	@OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
	private int anInt7690;

	@OriginalMember(owner = "client!jj", name = "Mc", descriptor = "Z")
	protected boolean aBoolean576;

	@OriginalMember(owner = "client!jj", name = "jc", descriptor = "Lclient!tf;")
	private final Class340 aClass340_59 = new Class340();

	@OriginalMember(owner = "client!jj", name = "Df", descriptor = "Z")
	protected boolean aBoolean555 = true;

	@OriginalMember(owner = "client!jj", name = "uc", descriptor = "Lclient!ie;")
	protected final Class109_Sub3 aClass109_Sub3_15 = new Class109_Sub3();

	@OriginalMember(owner = "client!jj", name = "uf", descriptor = "Lclient!ie;")
	public Class109_Sub3 aClass109_Sub3_16 = new Class109_Sub3();

	@OriginalMember(owner = "client!jj", name = "mf", descriptor = "Lclient!ie;")
	public final Class109_Sub3 aClass109_Sub3_17 = new Class109_Sub3();

	@OriginalMember(owner = "client!jj", name = "Tf", descriptor = "Lclient!ie;")
	protected final Class109_Sub3 aClass109_Sub3_18 = new Class109_Sub3();

	@OriginalMember(owner = "client!jj", name = "Je", descriptor = "Lclient!ie;")
	private final Class109_Sub3 aClass109_Sub3_19 = new Class109_Sub3();

	@OriginalMember(owner = "client!jj", name = "ab", descriptor = "Lclient!ie;")
	private final Class109_Sub3 aClass109_Sub3_20 = new Class109_Sub3();

	@OriginalMember(owner = "client!jj", name = "rf", descriptor = "I")
	public int anInt7655 = 512;

	@OriginalMember(owner = "client!jj", name = "Eb", descriptor = "Z")
	private boolean aBoolean559 = false;

	@OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
	private int anInt7653 = 1;

	@OriginalMember(owner = "client!jj", name = "sf", descriptor = "[F")
	private final float[] aFloatArray61 = new float[16];

	@OriginalMember(owner = "client!jj", name = "Y", descriptor = "I")
	private int anInt7652 = 0;

	@OriginalMember(owner = "client!jj", name = "tf", descriptor = "F")
	public float aFloat146 = 1.0F;

	@OriginalMember(owner = "client!jj", name = "Be", descriptor = "I")
	protected int anInt7656 = 0;

	@OriginalMember(owner = "client!jj", name = "Gb", descriptor = "I")
	public int anInt7657 = -1;

	@OriginalMember(owner = "client!jj", name = "Me", descriptor = "F")
	public float aFloat143 = 3584.0F;

	@OriginalMember(owner = "client!jj", name = "Pc", descriptor = "Z")
	protected boolean aBoolean566 = true;

	@OriginalMember(owner = "client!jj", name = "Yc", descriptor = "I")
	private int anInt7667 = -1;

	@OriginalMember(owner = "client!jj", name = "bd", descriptor = "I")
	public int anInt7654 = 0;

	@OriginalMember(owner = "client!jj", name = "ug", descriptor = "Z")
	private boolean aBoolean563 = false;

	@OriginalMember(owner = "client!jj", name = "Kf", descriptor = "I")
	public int anInt7664 = 0;

	@OriginalMember(owner = "client!jj", name = "qc", descriptor = "I")
	public int anInt7675 = 0;

	@OriginalMember(owner = "client!jj", name = "Gc", descriptor = "I")
	private int anInt7663 = 0;

	@OriginalMember(owner = "client!jj", name = "qf", descriptor = "F")
	public float aFloat145 = -1.0F;

	@OriginalMember(owner = "client!jj", name = "Xd", descriptor = "I")
	public int anInt7672 = 3;

	@OriginalMember(owner = "client!jj", name = "Qd", descriptor = "I")
	public int anInt7671 = 128;

	@OriginalMember(owner = "client!jj", name = "Id", descriptor = "Z")
	protected boolean aBoolean558 = false;

	@OriginalMember(owner = "client!jj", name = "db", descriptor = "I")
	public int anInt7670 = -1;

	@OriginalMember(owner = "client!jj", name = "nc", descriptor = "I")
	protected final int anInt7651 = 0;

	@OriginalMember(owner = "client!jj", name = "hg", descriptor = "[Lclient!oo;")
	private final Class23[] aClass23Array3 = new Class23[10];

	@OriginalMember(owner = "client!jj", name = "C", descriptor = "Z")
	protected boolean aBoolean570 = true;

	@OriginalMember(owner = "client!jj", name = "kd", descriptor = "[F")
	public final float[] aFloatArray62 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!jj", name = "cc", descriptor = "F")
	private float aFloat148 = 1.0F;

	@OriginalMember(owner = "client!jj", name = "Le", descriptor = "I")
	private int anInt7682 = -1;

	@OriginalMember(owner = "client!jj", name = "hc", descriptor = "Lclient!ff;")
	protected Class111 aClass111_5 = Static203.aClass111_6;

	@OriginalMember(owner = "client!jj", name = "ag", descriptor = "[F")
	private final float[] aFloatArray66 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!jj", name = "Tc", descriptor = "I")
	protected int anInt7668 = 0;

	@OriginalMember(owner = "client!jj", name = "ie", descriptor = "F")
	public float aFloat144 = -1.0F;

	@OriginalMember(owner = "client!jj", name = "yg", descriptor = "F")
	public float aFloat147 = 1.0F;

	@OriginalMember(owner = "client!jj", name = "Zd", descriptor = "I")
	private int anInt7677 = 16777215;

	@OriginalMember(owner = "client!jj", name = "Yf", descriptor = "Lclient!iea;")
	protected Class171 aClass171_6 = Static89.aClass171_1;

	@OriginalMember(owner = "client!jj", name = "Uc", descriptor = "F")
	public float aFloat152 = 1.0F;

	@OriginalMember(owner = "client!jj", name = "Ub", descriptor = "Z")
	private boolean aBoolean573 = false;

	@OriginalMember(owner = "client!jj", name = "Zf", descriptor = "I")
	protected int anInt7681 = 0;

	@OriginalMember(owner = "client!jj", name = "fc", descriptor = "[F")
	public final float[] aFloatArray64 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!jj", name = "xd", descriptor = "Z")
	protected boolean aBoolean557 = false;

	@OriginalMember(owner = "client!jj", name = "cb", descriptor = "I")
	public int anInt7684 = 8;

	@OriginalMember(owner = "client!jj", name = "ze", descriptor = "I")
	protected final int anInt7678 = 0;

	@OriginalMember(owner = "client!jj", name = "Fb", descriptor = "Z")
	protected boolean aBoolean567 = true;

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "Z")
	private boolean aBoolean568 = false;

	@OriginalMember(owner = "client!jj", name = "Jc", descriptor = "Z")
	private boolean aBoolean562 = false;

	@OriginalMember(owner = "client!jj", name = "me", descriptor = "[F")
	private final float[] aFloatArray69 = new float[16];

	@OriginalMember(owner = "client!jj", name = "Ee", descriptor = "F")
	public float aFloat153 = 1.0F;

	@OriginalMember(owner = "client!jj", name = "Od", descriptor = "I")
	protected int anInt7659 = 0;

	@OriginalMember(owner = "client!jj", name = "rc", descriptor = "[F")
	private final float[] aFloatArray65 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!jj", name = "Ne", descriptor = "[F")
	private final float[] aFloatArray63 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!jj", name = "Vb", descriptor = "[F")
	protected float[] aFloatArray68 = this.aFloatArray65;

	@OriginalMember(owner = "client!jj", name = "zf", descriptor = "I")
	protected int anInt7686 = 0;

	@OriginalMember(owner = "client!jj", name = "jd", descriptor = "I")
	public int anInt7687 = 50;

	@OriginalMember(owner = "client!jj", name = "je", descriptor = "[F")
	private final float[] aFloatArray67 = new float[16];

	@OriginalMember(owner = "client!jj", name = "Qb", descriptor = "Z")
	protected boolean aBoolean575 = false;

	@OriginalMember(owner = "client!jj", name = "Pb", descriptor = "Z")
	protected boolean aBoolean571 = false;

	@OriginalMember(owner = "client!jj", name = "He", descriptor = "I")
	private int anInt7679 = 0;

	@OriginalMember(owner = "client!jj", name = "Wc", descriptor = "I")
	private int anInt7669 = 0;

	@OriginalMember(owner = "client!jj", name = "Se", descriptor = "Z")
	protected boolean aBoolean572 = true;

	@OriginalMember(owner = "client!jj", name = "mb", descriptor = "I")
	private int anInt7689 = -1;

	@OriginalMember(owner = "client!jj", name = "Dc", descriptor = "Z")
	protected boolean aBoolean574 = true;

	@OriginalMember(owner = "client!jj", name = "Ud", descriptor = "I")
	public int anInt7688 = 512;

	@OriginalMember(owner = "client!jj", name = "vd", descriptor = "I")
	protected int anInt7680 = 3584;

	@OriginalMember(owner = "client!jj", name = "we", descriptor = "Z")
	private boolean aBoolean560 = false;

	@OriginalMember(owner = "client!jj", name = "pf", descriptor = "F")
	public float aFloat158 = 3584.0F;

	@OriginalMember(owner = "client!jj", name = "Kd", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!jj", name = "Sd", descriptor = "Lclient!ie;")
	private final Class109_Sub3 aClass109_Sub3_21 = new Class109_Sub3();

	@OriginalMember(owner = "client!jj", name = "Re", descriptor = "I")
	protected final int anInt7665;

	@OriginalMember(owner = "client!jj", name = "Hf", descriptor = "Lclient!lga;")
	protected final Class223 aClass223_90;

	@OriginalMember(owner = "client!jj", name = "Jf", descriptor = "Ljava/lang/Object;")
	protected final Object anObject20;

	@OriginalMember(owner = "client!jj", name = "ad", descriptor = "Ljava/lang/Object;")
	private Object anObject19;

	@OriginalMember(owner = "client!jj", name = "Lb", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas10;

	@OriginalMember(owner = "client!jj", name = "Nb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!jj", name = "yb", descriptor = "I")
	private int anInt7542;

	@OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
	public int anInt7597;

	@OriginalMember(owner = "client!jj", name = "Kb", descriptor = "I")
	private int anInt7552;

	@OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
	public int anInt7590;

	@OriginalMember(owner = "client!jj", name = "jg", descriptor = "I")
	public final int anInt7674;

	@OriginalMember(owner = "client!jj", name = "Cg", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!jj", name = "wc", descriptor = "Lclient!ju;")
	private final Class198 aClass198_3;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!lga;II)V")
	protected Class75_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) Class223 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anInt7665 = arg4;
			this.aClass223_90 = arg3;
			this.anObject19 = this.anObject20 = arg1;
			this.aCanvas11 = this.aCanvas10 = arg0;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt7597 = this.anInt7542 = local307.width;
			this.anInt7590 = this.anInt7552 = local307.height;
			this.anInt7674 = arg5;
			Static529.method7605(true, false);
			if (super.anInterface11_10 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt7674);
				this.aClass198_3 = null;
			} else {
				this.aClass198_3 = new Class198(this, super.anInterface11_10);
				this.aNativeInterface3 = new NativeInterface(super.anInterface11_10.method6028(), this.anInt7674);
				for (@Pc(365) int local365 = 0; super.anInterface11_10.method6028() > local365; local365++) {
					@Pc(373) Class297 local373 = super.anInterface11_10.method6027(local365);
					if (local373 != null) {
						this.aNativeInterface3.initTextureMetrics(local365, local373.aByte118, local373.aByte123);
					}
				}
			}
		} catch (@Pc(398) Throwable local398) {
			local398.printStackTrace();
			this.method6672();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "(I)V")
	protected final void method6720() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable7 != null && !this.aHashtable7.isEmpty()) {
			@Pc(22) Enumeration local22 = this.aHashtable7.keys();
			while (local22.hasMoreElements()) {
				@Pc(28) Canvas local28 = (Canvas) local22.nextElement();
				local9.put(local28, this.method6783(local28));
			}
		}
		this.aHashtable7 = local9;
		this.method6823();
		this.method6772();
		this.method6794();
		this.aClass299_3.method7303(this);
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V")
	protected abstract void method6721();

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(Z)Lclient!ie;")
	public final Class109_Sub3 method6722() {
		return this.aClass109_Sub3_18;
	}

	@OriginalMember(owner = "client!jj", name = "C", descriptor = "(I)V")
	private void method6723() {
		if (this.aClass111_5 == Static624.aClass111_7) {
			return;
		}
		@Pc(13) Class111 local13 = this.aClass111_5;
		this.aClass111_5 = Static624.aClass111_7;
		if (local13.method3099()) {
			this.method6776();
		}
		this.method6851();
		this.aFloatArray68 = this.aFloatArray61;
		this.method6778();
		this.anInt7676 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method6724(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZ)V")
	public final void method6725(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean570 != arg0) {
			this.aBoolean570 = arg0;
			this.method6721();
		}
	}

	@OriginalMember(owner = "client!jj", name = "gb", descriptor = "(I)V")
	protected abstract void method6726();

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class96 method6697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class96_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "(I)V")
	@Override
	public final void method6655() {
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIZ[II)Lclient!cf;")
	public final Interface7 method6727(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		return this.method6766(0, arg0, arg1, arg2, arg3, 0);
	}

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "(B)V")
	public final void method6728() {
		this.method6850();
		this.method6778();
	}

	@OriginalMember(owner = "client!jj", name = "D", descriptor = "(I)I")
	public final int method6729() {
		return this.anInt7689;
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "(B)V")
	protected abstract void method6730();

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local9 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local16 * local16 + local9 * local9));
			local18 = (float) Math.atan2((double) local16, (double) local9);
		}
		this.method6758();
		this.method6801(arg4);
		this.method6795(0, Static389.aClass261_8);
		this.method6816(0, Static389.aClass261_8);
		this.method6736(0);
		this.aClass109_Sub3_15.method4355((float) arg5, 1.0F, local20);
		this.aClass109_Sub3_15.method4604(0, -arg5 / 2, 0);
		this.aClass109_Sub3_15.method4611((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass109_Sub3_15.method4604(arg0, arg1, 0);
		this.method6820();
		this.method6797(false);
		this.method6808();
		this.method6797(true);
		this.method6816(0, Static24.aClass261_1);
		this.method6795(0, Static24.aClass261_1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)V")
	public final void method6731(@OriginalArg(1) byte arg0) {
		this.method6801(arg0 << 24 | arg0 << 16 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!jj", name = "M", descriptor = "(I)V")
	private void method6732() {
		this.aFloat158 = (float) this.anInt7680;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6652(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas10 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable7.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(32) Class local32 = Class.forName("java.awt.Canvas");
				@Pc(44) Method local44 = local32.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local44.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(56) Exception local56) {
			}
			@Pc(61) Object local61 = this.method6783(arg0);
			if (local61 == null) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, local61);
		}
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)F")
	protected abstract float method6733();

	@OriginalMember(owner = "client!jj", name = "I", descriptor = "(I)Lclient!ie;")
	public final Class109_Sub3 method6734() {
		return this.aClass109_Sub3_15;
	}

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "()I")
	@Override
	public final int method6689() {
		return this.anInt7661 - 2;
	}

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "(I)V")
	protected abstract void method6735();

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "(II)V")
	public final void method6736(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt7653) {
			return;
		}
		@Pc(28) Class171 local28;
		@Pc(26) boolean local26;
		@Pc(24) boolean local24;
		if (arg0 == 1) {
			local24 = true;
			local26 = true;
			local28 = Static89.aClass171_1;
		} else if (arg0 == 2) {
			local24 = false;
			local26 = true;
			local28 = Static329.aClass171_5;
		} else if (arg0 == 128) {
			local24 = true;
			local28 = Static636.aClass171_7;
			local26 = true;
		} else {
			local24 = false;
			local28 = Static308.aClass171_4;
			local26 = false;
		}
		if (local24 != this.aBoolean567) {
			this.aBoolean567 = local24;
			this.method6747();
		}
		if (local26 != this.aBoolean574) {
			this.aBoolean574 = local26;
			this.method6745();
		}
		if (this.aClass171_6 != local28) {
			this.aClass171_6 = local28;
			this.method6799();
		}
		this.anInt7653 = arg0;
		this.anInt7676 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!jj", name = "N", descriptor = "(I)V")
	private void method6737() {
		this.aFloatArray67[14] = this.aFloat150;
		this.aFloatArray67[10] = this.aFloat149;
		this.aFloat143 = ((float) -this.anInt7680 + this.aFloatArray67[14]) / this.aFloatArray67[10];
	}

	@OriginalMember(owner = "client!jj", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6758();
		this.method6801(arg3);
		this.method6795(0, Static389.aClass261_8);
		this.method6816(0, Static389.aClass261_8);
		this.method6736(arg4);
		this.aClass109_Sub3_15.method4355((float) arg2, 1.0F, (float) arg2);
		this.aClass109_Sub3_15.method4604(arg0, arg1, 0);
		this.method6820();
		this.method6797(false);
		this.method6827(this.anInterface6_14, 0);
		this.method6753(this.aClass207_22);
		this.method6853(Static492.aClass51_6, 256, 0);
		this.method6797(true);
		this.method6816(0, Static24.aClass261_1);
		this.method6795(0, Static24.aClass261_1);
	}

	@OriginalMember(owner = "client!jj", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7685 = arg0;
		this.anInt7667 = arg1;
		this.anInt7689 = arg2;
		this.anInt7652 = arg3;
		this.aBoolean556 = true;
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(II)I")
	@Override
	public final int method6712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "()Z")
	@Override
	public final boolean method6644() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "S", descriptor = "(I)V")
	public final void method6738() {
		if (this.anInt7676 == 4) {
			return;
		}
		this.method6723();
		this.method6846(false);
		this.method6780(false);
		this.method6815(false);
		this.method6752(false);
		this.method6809(false, false, -2);
		this.method6736(1);
		this.method6830(0);
		this.anInt7676 = 4;
	}

	@OriginalMember(owner = "client!jj", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt7648 + this.anInt7649 + this.anInt7645;
	}

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "()Z")
	@Override
	public final boolean method6676() {
		return this.aBoolean565;
	}

	@OriginalMember(owner = "client!jj", name = "H", descriptor = "(I)V")
	protected abstract void method6739();

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)V")
	@Override
	public final void method6690(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jj", name = "G", descriptor = "(I)V")
	protected abstract void method6740();

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface7 local9 = local6.anInterface7_5;
		this.method6811();
		this.method6814(local9);
		this.method6736(1);
		this.method6743(Static571.aClass344_5, Static571.aClass344_5);
		this.method6795(0, Static389.aClass261_8);
		this.method6801(arg0);
		this.aClass109_Sub3_15.method4355((float) this.anInt7590, 0.0F, (float) this.anInt7597);
		this.method6820();
		this.aClass109_Sub3Array3[0].method4355(local9.method8720((float) this.anInt7590), 1.0F, local9.method8719((float) this.anInt7597));
		this.aClass109_Sub3Array3[0].method4341(0.0F, local9.method8719((float) -arg2), local9.method8720((float) -arg3));
		this.aClass211Array3[0] = Static82.aClass211_2;
		this.method6807();
		this.method6808();
		this.method6744();
		this.method6795(0, Static24.aClass261_1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(FIFFFFF)Z")
	private boolean method6741(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface6_13.method3658();
		if (local9 == null) {
			return false;
		}
		@Pc(27) Stream local27 = this.method6788(local9);
		if (Stream.b()) {
			local27.a(arg2);
			local27.a(arg5);
			local27.a(arg1);
			local27.a(arg0);
			local27.a(arg4);
			local27.a(arg3);
		} else {
			local27.b(arg2);
			local27.b(arg5);
			local27.b(arg1);
			local27.b(arg0);
			local27.b(arg4);
			local27.b(arg3);
		}
		local27.a();
		return this.anInterface6_13.method3657();
	}

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "(Z)V")
	private void method6742() {
		this.aBoolean559 = false;
		this.method6755();
		if (Static650.aClass111_8 == this.aClass111_5) {
			this.method6778();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!tka;BLclient!tka;)V")
	public final void method6743(@OriginalArg(0) Class344 arg0, @OriginalArg(2) Class344 arg1) {
		@Pc(10) boolean local10 = false;
		if (arg0 != this.aClass344Array5[this.anInt7659]) {
			this.aClass344Array5[this.anInt7659] = arg0;
			local10 = true;
			this.method6806();
		}
		if (arg1 != this.aClass344Array6[this.anInt7659]) {
			this.aClass344Array6[this.anInt7659] = arg1;
			local10 = true;
			this.method6740();
		}
		if (local10) {
			this.anInt7676 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "(I)V")
	public final void method6744() {
		if (this.aClass211Array3[this.anInt7659] != Static486.aClass211_4) {
			this.aClass211Array3[this.anInt7659] = Static486.aClass211_4;
			this.aClass109_Sub3Array3[this.anInt7659].method4612();
			this.method6807();
		}
	}

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "(B)V")
	protected abstract void method6745();

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!cb;IILclient!uba;III)V")
	public abstract void method6746(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface25 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jj", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt7680;
	}

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "(B)V")
	protected abstract void method6747();

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!cu;Z)Lclient!tb;")
	@Override
	public final Class49 method6714(@OriginalArg(0) Class64 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(149) Class49 local149;
		if (arg0.anInt1300 == 0 || arg0.anInt1297 == 0) {
			local149 = this.method6692(1, 1, new int[1], 1);
		} else {
			@Pc(23) int[] local23 = new int[arg0.anInt1297 * arg0.anInt1300];
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			@Pc(32) int local32;
			@Pc(36) int local36;
			if (arg0.aByteArray11 == null) {
				for (local32 = 0; local32 < arg0.anInt1297; local32++) {
					for (local36 = 0; local36 < arg0.anInt1300; local36++) {
						@Pc(106) int local106 = arg0.anIntArray82[arg0.aByteArray12[local25++] & 0xFF];
						local23[local27++] = local106 == 0 ? 0 : local106 | 0xFF000000;
					}
				}
			} else {
				for (local32 = 0; local32 < arg0.anInt1297; local32++) {
					for (local36 = 0; local36 < arg0.anInt1300; local36++) {
						local23[local27++] = arg0.anIntArray82[arg0.aByteArray12[local25] & 0xFF] | arg0.aByteArray11[local25] << 24;
						local25++;
					}
				}
			}
			local149 = this.method6692(arg0.anInt1297, arg0.anInt1300, local23, arg0.anInt1300);
		}
		local149.method8989(arg0.anInt1302, arg0.anInt1301, arg0.anInt1298, arg0.anInt1299);
		return local149;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[FIIIZILclient!hh;)Lclient!cf;")
	protected abstract Interface7 method6748(@OriginalArg(1) float[] arg0, @OriginalArg(3) int arg1, @OriginalArg(5) boolean arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class155 arg4);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZF)V")
	public final void method6749(@OriginalArg(1) float arg0) {
		if (this.aFloat148 != arg0) {
			this.aFloat148 = arg0;
			this.method6782();
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(BI)Lclient!oo;")
	protected Class23 method6750(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class23_Sub3(this);
		} else if (arg0 == 1) {
			return new Class23_Sub5(this);
		} else if (arg0 == 2) {
			return new Class23_Sub9(this, this.aClass184_6);
		} else if (arg0 == 7) {
			return new Class23_Sub10(this);
		} else {
			return new Class23_Sub8(this);
		}
	}

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "()Z")
	@Override
	public final boolean method6633() {
		return this.aClass23Array3[3].method8164();
	}

	@OriginalMember(owner = "client!jj", name = "cb", descriptor = "(I)V")
	protected final void method6751() {
		@Pc(9) Enumeration local9 = this.aHashtable7.keys();
		while (local9.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local9.nextElement();
			this.method6770(this.aHashtable7.get(local17), local17);
		}
		this.anInterface6_12.method8675();
		this.anInterface6_13.method8675();
		this.anInterface6_14.method8675();
		this.aClass54_Sub2_27.method6167();
		this.aClass54_Sub2_23.method6167();
		this.aClass54_Sub2_24.method6167();
		this.aClass54_Sub2_25.method6167();
		this.aClass54_Sub2_29.method6167();
		this.aClass299_3.method7308();
		this.anInterface25_7.method8675();
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(IZ)V")
	public final void method6752(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean558 != arg0) {
			this.aBoolean558 = arg0;
			this.method6844();
			this.anInt7676 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt7664, this.anInt7654, this.anInt7655, this.anInt7688 };
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ot;I)V")
	public abstract void method6753(@OriginalArg(0) Class207 arg0);

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "(Z)V")
	private void method6754() {
		this.method6845();
		this.method6730();
		this.method6841();
		this.method6835();
		this.method6821();
		this.method6847();
		this.method6726();
		this.method6785();
		this.method6844();
		this.method6721();
		this.method6798();
		this.method6745();
		this.method6799();
		this.method6747();
		for (@Pc(52) int local52 = this.anInt7658 - 1; local52 >= 0; local52--) {
			this.method6805(local52);
			this.method6806();
			this.method6740();
			this.method6744();
		}
		this.method6789();
		this.method6781();
		this.method6739();
		this.method6812();
		this.method6774();
	}

	@OriginalMember(owner = "client!jj", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt7681 = 0;
		this.anInt7668 = this.anInt7590;
		this.anInt7686 = this.anInt7597;
		this.anInt7656 = 0;
		if (this.aBoolean576) {
			this.aBoolean576 = false;
			this.method6842();
		}
		this.method6843();
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V")
	private void method6755() {
		if (this.aBoolean559) {
			return;
		}
		@Pc(12) float[] local12 = this.aFloatArray67;
		@Pc(24) float local24 = (float) (-this.anInt7664 * this.anInt7687) / (float) this.anInt7655;
		@Pc(39) float local39 = (float) (this.anInt7687 * (this.anInt7597 - this.anInt7664)) / (float) this.anInt7655;
		@Pc(50) float local50 = (float) (this.anInt7687 * this.anInt7654) / (float) this.anInt7688;
		@Pc(64) float local64 = (float) ((this.anInt7654 - this.anInt7590) * this.anInt7687) / (float) this.anInt7688;
		if (local24 == local39 || local50 == local64) {
			local12[4] = 0.0F;
			local12[6] = 0.0F;
			local12[10] = 1.0F;
			local12[1] = 0.0F;
			local12[8] = 0.0F;
			local12[11] = 0.0F;
			local12[15] = 1.0F;
			local12[5] = 1.0F;
			local12[9] = 0.0F;
			local12[13] = 0.0F;
			local12[14] = 0.0F;
			local12[7] = 0.0F;
			local12[3] = 0.0F;
			local12[2] = 0.0F;
			local12[12] = 0.0F;
			local12[0] = 1.0F;
		} else {
			@Pc(148) float local148 = (float) this.anInt7687 * 2.0F;
			local12[3] = 0.0F;
			local12[13] = 0.0F;
			local12[10] = this.aFloat149 = (float) this.anInt7680 / (float) (this.anInt7687 - this.anInt7680);
			local12[11] = -1.0F;
			local12[1] = 0.0F;
			local12[7] = 0.0F;
			local12[14] = this.aFloat150 = (float) (this.anInt7687 * this.anInt7680) / (float) (this.anInt7687 - this.anInt7680);
			local12[9] = (local64 + local50) / (-local64 + local50);
			local12[5] = local148 / (local50 - local64);
			local12[4] = 0.0F;
			local12[12] = 0.0F;
			local12[2] = 0.0F;
			local12[15] = 0.0F;
			local12[6] = 0.0F;
			local12[8] = (local24 + local39) / (local39 - local24);
			local12[0] = local148 / (local39 - local24);
		}
		this.method6737();
		this.aBoolean559 = true;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
	@Override
	public final void method6696(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(IZ)V")
	public final void method6756(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean572) {
			this.aBoolean572 = arg0;
			this.method6726();
		}
	}

	@OriginalMember(owner = "client!jj", name = "U", descriptor = "(I)V")
	protected abstract void method6757();

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method6707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		if (local9 == 0.0F && local15 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(38) float local38 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local15 * local15)));
			local9 *= local38;
			local15 *= local38;
		}
		if (!this.method6741(local9 + (float) arg2, 0.0F, (float) arg0, 0.0F, local15 + (float) arg3, (float) arg1)) {
			return;
		}
		this.method6758();
		this.method6801(arg4);
		this.method6795(0, Static389.aClass261_8);
		this.method6816(0, Static389.aClass261_8);
		this.method6736(arg5);
		this.method6777();
		this.method6797(false);
		this.method6779();
		this.method6797(true);
		this.method6816(0, Static24.aClass261_1);
		this.method6795(0, Static24.aClass261_1);
	}

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "(Z)V")
	private void method6758() {
		if (this.anInt7676 == 1) {
			return;
		}
		this.method6723();
		this.method6846(false);
		this.method6780(false);
		this.method6815(false);
		this.method6752(false);
		this.method6809(false, false, -2);
		this.method6830(1);
		this.method6814(this.anInterface1_3);
		this.anInt7676 = 1;
	}

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "(I)V")
	private void method6759() {
		if (Static624.aClass111_7 == this.aClass111_5) {
			@Pc(11) float local11 = this.method6733();
			this.aClass109_Sub3_15.method4341(0.0F, local11, local11);
		}
		this.aBoolean573 = false;
		this.method6812();
		if (this.aClass23_3 != null) {
			this.aClass23_3.method8165();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZILclient!oba;Z)V")
	protected abstract void method6760(@OriginalArg(1) int arg0, @OriginalArg(2) Class261 arg1);

	@OriginalMember(owner = "client!jj", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7655 = arg2;
		this.anInt7654 = arg1;
		this.anInt7688 = arg3;
		this.anInt7664 = arg0;
		this.method6782();
		this.method6742();
		this.method6850();
		this.method6843();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIF)Lclient!ta;")
	@Override
	public final Class6_Sub10 method6647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub10_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!jj", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6707(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "(I)V")
	public final void method6761() {
		if (this.anInt7676 == 16) {
			return;
		}
		this.method6828();
		this.method6846(true);
		this.method6815(true);
		this.method6752(true);
		this.method6736(1);
		this.anInt7676 = 16;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!rha;IIII)Lclient!ka;")
	@Override
	public final Class54 method6688(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class54_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "(Z)I")
	public final int method6762() {
		return this.anInt7659;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "()Z")
	@Override
	public final boolean method6666() {
		return false;
	}

	@OriginalMember(owner = "client!jj", name = "W", descriptor = "(I)V")
	private void method6764() {
		this.aBoolean560 = false;
		if (this.aClass111_5 == Static624.aClass111_7) {
			this.method6851();
			this.method6778();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!sn;)V")
	@Override
	public final void method6713(@OriginalArg(0) Class81 arg0) {
		this.aClass81_Sub1_3 = (Class81_Sub1) arg0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[[IZ)Lclient!nm;")
	public abstract Interface19 method6765(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIZ[III)Lclient!cf;")
	public abstract Interface7 method6766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "(Z)V")
	private void method6767() {
		if (this.aClass111_5 == Static650.aClass111_8) {
			return;
		}
		@Pc(15) Class111 local15 = this.aClass111_5;
		this.aClass111_5 = Static650.aClass111_8;
		if (!local15.method3099()) {
			this.method6776();
		}
		this.method6755();
		this.aFloatArray68 = this.aFloatArray67;
		this.method6778();
		this.anInt7676 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(ZI)Lclient!bl;")
	public abstract Interface6 method6768(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!lc;)V")
	public abstract void method6769(@OriginalArg(1) Class219 arg0);

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method6770(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILclient!cb;)V")
	private void method6771(@OriginalArg(1) int arg0, @OriginalArg(2) Class51 arg1) {
		this.method6827(this.anInterface6_12, 0);
		this.method6753(this.aClass207_21);
		this.method6853(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!jj", name = "eb", descriptor = "(I)V")
	private void method6772() {
		this.anInterface6_13 = this.method6768(true);
		this.anInterface6_13.method3659(24, 12);
		this.aClass207_16 = this.method6803(new Class355[] { new Class355(Static93.aClass70_1) });
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)V")
	@Override
	public final void method6637(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jj", name = "ab", descriptor = "(I)Lclient!ie;")
	public final Class109_Sub3 method6773() {
		return this.aClass109_Sub3_19;
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(B)V")
	protected abstract void method6774();

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(Z)Lclient!ie;")
	public final Class109_Sub3 method6775() {
		return this.aClass109_Sub3Array3[this.anInt7659];
	}

	@OriginalMember(owner = "client!jj", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean556 = false;
	}

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "()Z")
	@Override
	public final boolean method6658() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "(I)V")
	private void method6776() {
		this.aBoolean573 = false;
		if (this.aClass23_3 != null) {
			this.aClass23_3.method8169();
		}
		this.method6774();
	}

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "(B)V")
	public final void method6777() {
		this.aClass109_Sub3_15.method4612();
		this.aBoolean555 = true;
		this.method6759();
	}

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "(I)V")
	private void method6778() {
		this.method6739();
		if (this.aClass23_3 != null) {
			this.aClass23_3.method8168();
		}
	}

	@OriginalMember(owner = "client!jj", name = "Q", descriptor = "(I)V")
	private void method6779() {
		this.method6827(this.anInterface6_13, 0);
		this.method6753(this.aClass207_16);
		this.method6853(Static258.aClass51_7, 1, 0);
	}

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "()Lclient!qa;")
	@Override
	public final Class109 method6636() {
		return this.aClass109_Sub3_16;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[Lclient!ta;)V")
	@Override
	public final void method6682(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub10[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass6_Sub10Array5[local3] = arg1[local3];
		}
		this.anInt7660 = arg0;
		if (this.aClass111_5.method3099()) {
			this.method6835();
		}
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(ZI)V")
	public final void method6780(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean571 != arg0) {
			this.aBoolean571 = arg0;
			this.method6841();
			this.anInt7676 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6657(@OriginalArg(0) Canvas arg0) {
		this.anObject19 = null;
		this.aCanvas11 = null;
		if (arg0 == null || this.aCanvas10 == arg0) {
			this.aCanvas11 = this.aCanvas10;
			this.anObject19 = this.anObject20;
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.anObject19 = this.aHashtable7.get(arg0);
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.anObject19 == null) {
			throw new RuntimeException();
		}
		this.method6834(this.anObject19, this.aCanvas11);
		this.method6802();
	}

	@OriginalMember(owner = "client!jj", name = "O", descriptor = "(I)V")
	protected abstract void method6781();

	@OriginalMember(owner = "client!jj", name = "P", descriptor = "(I)V")
	private void method6782() {
		this.aBoolean568 = false;
		this.method6784();
		if (this.aClass111_5 == Static24.aClass111_1) {
			this.method6778();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method6783(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!jj", name = "fb", descriptor = "(I)V")
	private void method6784() {
		if (this.aBoolean568) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray69;
		@Pc(13) float local13 = (float) this.anInt7687;
		@Pc(17) float local17 = (float) this.anInt7680;
		@Pc(29) float local29 = (float) -this.anInt7654 * this.aFloat148 / (float) this.anInt7688;
		@Pc(41) float local41 = (float) -this.anInt7664 * this.aFloat148 / (float) this.anInt7655;
		@Pc(56) float local56 = this.aFloat148 * (float) (this.anInt7597 - this.anInt7664) / (float) this.anInt7655;
		@Pc(71) float local71 = this.aFloat148 * (float) (this.anInt7590 - this.anInt7654) / (float) this.anInt7688;
		if (local41 == local56 || local71 == local29) {
			local9[10] = 1.0F;
			local9[7] = 0.0F;
			local9[5] = 1.0F;
			local9[13] = 0.0F;
			local9[3] = 0.0F;
			local9[4] = 0.0F;
			local9[1] = 0.0F;
			local9[14] = 0.0F;
			local9[15] = 1.0F;
			local9[8] = 0.0F;
			local9[2] = 0.0F;
			local9[6] = 0.0F;
			local9[11] = 0.0F;
			local9[12] = 0.0F;
			local9[9] = 0.0F;
			local9[0] = 1.0F;
		} else {
			local9[5] = 2.0F / (local71 - local29);
			local9[15] = 1.0F;
			local9[6] = 0.0F;
			local9[0] = 2.0F / (local56 - local41);
			local9[12] = (local41 + local56) / (-local56 + local41);
			local9[1] = 0.0F;
			local9[10] = 1.0F / (local13 - local17);
			local9[2] = 0.0F;
			local9[11] = 0.0F;
			local9[9] = 0.0F;
			local9[7] = 0.0F;
			local9[4] = 0.0F;
			local9[14] = local13 / (local13 - local17);
			local9[3] = 0.0F;
			local9[8] = 0.0F;
			local9[13] = (local29 + local71) / (-local29 + local71);
		}
		this.method6732();
		this.aBoolean568 = true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	@Override
	public final void method6694(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "(I)V")
	protected abstract void method6785();

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!on;Lclient!hh;)Z")
	public abstract boolean method6786(@OriginalArg(1) Class274 arg0, @OriginalArg(2) Class155 arg1);

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass109_Sub3_16.aFloat91 + (float) arg1 * this.aClass109_Sub3_16.aFloat96 + (float) arg0 * this.aClass109_Sub3_16.aFloat86 + this.aClass109_Sub3_16.aFloat88 * (float) arg2;
		@Pc(57) float local57 = this.aClass109_Sub3_16.aFloat96 * (float) arg4 + (float) arg3 * this.aClass109_Sub3_16.aFloat86 + (float) arg5 * this.aClass109_Sub3_16.aFloat88 + this.aClass109_Sub3_16.aFloat91;
		if (local32 < (float) this.anInt7687 && (float) this.anInt7687 > local57) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt7680 && (float) this.anInt7680 < local57) {
			local7 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((this.aClass109_Sub3_16.aFloat87 + this.aClass109_Sub3_16.aFloat94 * (float) arg1 + this.aClass109_Sub3_16.aFloat93 * (float) arg0 + (float) arg2 * this.aClass109_Sub3_16.aFloat92) * (float) this.anInt7655 / (float) arg6);
		@Pc(163) int local163 = (int) ((this.aClass109_Sub3_16.aFloat87 + (float) arg5 * this.aClass109_Sub3_16.aFloat92 + (float) arg4 * this.aClass109_Sub3_16.aFloat94 + (float) arg3 * this.aClass109_Sub3_16.aFloat93) * (float) this.anInt7655 / (float) arg6);
		if ((float) local130 < this.aFloat154 && (float) local163 < this.aFloat154) {
			local7 |= 0x1;
		} else if ((float) local130 > this.aFloat156 && (float) local163 > this.aFloat156) {
			local7 |= 0x2;
		}
		@Pc(236) int local236 = (int) ((float) this.anInt7688 * (this.aClass109_Sub3_16.aFloat89 + this.aClass109_Sub3_16.aFloat95 * (float) arg1 + (float) arg0 * this.aClass109_Sub3_16.aFloat90 + (float) arg2 * this.aClass109_Sub3_16.aFloat85) / (float) arg6);
		@Pc(269) int local269 = (int) ((float) this.anInt7688 * (this.aClass109_Sub3_16.aFloat89 + this.aClass109_Sub3_16.aFloat85 * (float) arg5 + this.aClass109_Sub3_16.aFloat95 * (float) arg4 + this.aClass109_Sub3_16.aFloat90 * (float) arg3) / (float) arg6);
		if ((float) local236 < this.aFloat151 && this.aFloat151 > (float) local269) {
			local7 |= 0x4;
		} else if (this.aFloat157 < (float) local236 && (float) local269 > this.aFloat157) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!kl;I)V")
	public final void method6787(@OriginalArg(0) Class211 arg0) {
		this.aClass211Array3[this.anInt7659] = arg0;
		this.method6807();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method6700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(17) float local17 = (float) arg3 - (float) arg1;
		@Pc(40) float local40;
		if (local11 == 0.0F && local17 == 0.0F) {
			local11 = 1.0F;
		} else {
			local40 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local11 * local11)));
			local11 *= local40;
			local17 *= local40;
		}
		this.method6758();
		this.method6801(arg4);
		this.method6795(0, Static389.aClass261_8);
		this.method6816(0, Static389.aClass261_8);
		this.method6736(1);
		this.method6777();
		this.method6797(false);
		@Pc(86) int local86 = arg7 % (arg5 + arg6);
		local40 = local11 * (float) arg5;
		@Pc(96) float local96 = local17 * (float) arg5;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = 0.0F;
		@Pc(102) float local102 = local40;
		@Pc(104) float local104 = local96;
		if (local86 > arg5) {
			local100 = local17 * (float) (arg5 + arg6 - local86);
			local98 = local11 * (float) (arg5 + arg6 - local86);
		} else {
			local104 = local17 * (float) (arg5 - local86);
			local102 = local11 * (float) (arg5 - local86);
		}
		@Pc(155) float local155 = local98 + (float) arg0;
		@Pc(160) float local160 = local100 + (float) arg1;
		@Pc(165) float local165 = local11 * (float) arg6;
		@Pc(170) float local170 = local17 * (float) arg6;
		while (true) {
			if (arg0 >= arg2) {
				if (local155 < (float) arg2) {
					break;
				}
				if ((float) arg2 > local155 + local102) {
					local102 = (float) arg2 - local155;
				}
			} else {
				if (local155 > (float) arg2) {
					break;
				}
				if ((float) arg2 < local102 + local155) {
					local102 = (float) arg2 - local155;
				}
			}
			if (arg1 < arg3) {
				if (local160 > (float) arg3) {
					break;
				}
				if (local104 + local160 > (float) arg3) {
					local104 = (float) arg3 - local160;
				}
			} else {
				if ((float) arg3 > local160) {
					break;
				}
				if (local160 + local104 < (float) arg3) {
					local104 = (float) arg3 - local160;
				}
			}
			if (!this.method6741(local155 + local102, 0.0F, local155, 0.0F, local160 + local104, local160)) {
				return;
			}
			local155 += local165 + local102;
			local160 += local170 + local104;
			this.method6779();
			local102 = local40;
			local104 = local96;
		}
		this.method6797(true);
		this.method6816(0, Static24.aClass261_1);
		this.method6795(0, Static24.aClass261_1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;I)Lclient!jaclib/memory/Stream;")
	public final Stream method6788(@OriginalArg(0) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7687 == arg0 && this.anInt7680 == arg1) {
			return;
		}
		this.anInt7687 = arg0;
		this.anInt7680 = arg1;
		this.method6742();
		this.method6782();
		this.method6804();
	}

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "(I)V")
	protected abstract void method6789();

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!kia;)V")
	@Override
	public final void method6634(@OriginalArg(0) Class209 arg0) {
		this.aClass299_3.method7302(arg0, this, -1);
	}

	@OriginalMember(owner = "client!jj", name = "F", descriptor = "(I)V")
	protected abstract void method6790();

	@OriginalMember(owner = "client!jj", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt7690;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method6716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static145.method2853(this, arg3, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "J", descriptor = "(I)V")
	public final void method6791() {
		if (this.anInt7676 == 8) {
			return;
		}
		this.method6767();
		this.method6846(true);
		this.method6815(true);
		this.method6752(true);
		this.method6736(1);
		this.anInt7676 = 8;
	}

	@OriginalMember(owner = "client!jj", name = "bb", descriptor = "(I)I")
	public final int method6792() {
		return this.anInt7667;
	}

	@OriginalMember(owner = "client!jj", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt7668;
		arg0[0] = this.anInt7656;
		arg0[2] = this.anInt7686;
		arg0[1] = this.anInt7681;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!qa;)V")
	@Override
	public final void method6695(@OriginalArg(0) Class109 arg0) {
		this.aClass109_Sub3_16 = (Class109_Sub3) arg0;
		this.aClass109_Sub3_18.method4595(this.aClass109_Sub3_16);
		this.aClass109_Sub3_18.method4358();
		this.aClass109_Sub3_19.method4350(this.aClass109_Sub3_18);
		this.aClass109_Sub3_17.method4350(this.aClass109_Sub3_16);
		if (this.aClass111_5.method3099()) {
			this.method6776();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6708(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas10) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.method6770(this.aHashtable7.get(arg0), arg0);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method6635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!jj", name = "K", descriptor = "(I)V")
	protected abstract void method6793();

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "(Z)V")
	private void method6794() {
		this.anInterface6_14 = this.method6768(false);
		this.anInterface6_14.method3659(3096, 12);
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			@Pc(35) Buffer local35 = this.anInterface6_14.method3658();
			if (local35 != null) {
				@Pc(42) Stream local42 = this.method6788(local35);
				local42.a(0.0F);
				local42.a(0.0F);
				local42.a(0.0F);
				for (@Pc(53) int local53 = 0; local53 <= 256; local53++) {
					@Pc(66) double local66 = (double) (local53 * 2) * 3.141592653589793D / 256.0D;
					@Pc(70) float local70 = (float) Math.cos(local66);
					@Pc(74) float local74 = (float) Math.sin(local66);
					if (Stream.b()) {
						local42.a(local74);
						local42.a(local70);
						local42.a(0.0F);
					} else {
						local42.b(local74);
						local42.b(local70);
						local42.b(0.0F);
					}
				}
				local42.a();
				if (this.anInterface6_14.method3657()) {
					break;
				}
			}
		}
		this.aClass207_22 = this.method6803(new Class355[] { new Class355(Static93.aClass70_1) });
	}

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "()Z")
	@Override
	public final boolean method6646() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILclient!oba;)V")
	public final void method6795(@OriginalArg(1) int arg0, @OriginalArg(2) Class261 arg1) {
		this.method6831(false, false, arg1, arg0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIZIZZ)V")
	private void method6796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) boolean local4 = arg2 & this.method6633();
		if (!local4 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg3 = 1;
			arg0 = 0;
		}
		if (arg1 != 0 && arg4) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt7679) {
			if (this.anInt7679 != 0) {
				this.aClass23Array3[Integer.MAX_VALUE & this.anInt7679].method8167();
			}
			if (arg1 == 0) {
				this.aClass23_3 = null;
			} else {
				this.aClass23_3 = this.aClass23Array3[arg1 & Integer.MAX_VALUE];
				this.aClass23_3.method8161(arg4);
				this.aClass23_3.method8166(arg4);
				this.aClass23_3.method8160(arg0, arg3);
			}
			this.anInt7679 = arg1;
			this.anInt7663 = arg3;
			this.anInt7669 = arg0;
		} else if (this.anInt7679 != 0) {
			this.aClass23Array3[this.anInt7679 & Integer.MAX_VALUE].method8166(arg4);
			if (arg0 != this.anInt7669 || arg3 != this.anInt7663) {
				this.aClass23Array3[Integer.MAX_VALUE & this.anInt7679].method8160(arg0, arg3);
				this.anInt7669 = arg0;
				this.anInt7663 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "()V")
	@Override
	public final void method6632() {
		if (this.aClass198_3 != null) {
			this.aClass198_3.method4800();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BZ)V")
	public abstract void method6797(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "(B)V")
	protected abstract void method6798();

	@OriginalMember(owner = "client!jj", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt7656) {
			this.anInt7656 = arg0;
			local5 = true;
		}
		if (this.anInt7686 > arg2) {
			local5 = true;
			this.anInt7686 = arg2;
		}
		if (arg1 > this.anInt7681) {
			local5 = true;
			this.anInt7681 = arg1;
		}
		if (arg3 < this.anInt7668) {
			this.anInt7668 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean576) {
			this.aBoolean576 = true;
			this.method6842();
		}
		this.method6790();
		this.method6843();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!kia;I)V")
	@Override
	public final void method6685(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1) {
		this.aClass299_3.method7302(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6758();
		this.method6801(arg4);
		this.method6795(0, Static389.aClass261_8);
		this.method6816(0, Static389.aClass261_8);
		this.method6736(arg5);
		this.aClass109_Sub3_15.method4355((float) arg3, 1.0F, (float) arg2);
		this.aClass109_Sub3_15.method4604(arg0, arg1, 0);
		this.method6820();
		this.method6797(false);
		this.method6808();
		this.method6797(true);
		this.method6816(0, Static24.aClass261_1);
		this.method6795(0, Static24.aClass261_1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([I)V")
	@Override
	public final void method6669(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7597;
		arg0[1] = this.anInt7590;
	}

	@OriginalMember(owner = "client!jj", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass109_Sub3_16.method4353((float) arg2, (float) arg0, (float) arg1);
		if (local14 < (float) this.anInt7687 || local14 > (float) this.anInt7680) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(61) int local61 = (int) ((float) this.anInt7655 * this.aClass109_Sub3_16.method4351((float) arg0, (float) arg1, (float) arg2) / (float) arg3);
		@Pc(80) int local80 = (int) ((float) this.anInt7688 * this.aClass109_Sub3_16.method4352((float) arg1, (float) arg0, (float) arg2) / (float) arg3);
		arg4[2] = (int) local14;
		arg4[1] = (int) ((float) local80 - this.aFloat151);
		arg4[0] = (int) ((float) local61 - this.aFloat154);
	}

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "()V")
	@Override
	protected void method6667() {
		if (this.aBoolean562) {
			return;
		}
		for (@Pc(13) Class6 local13 = this.aClass340_59.method8124(); local13 != null; local13 = this.aClass340_59.method8134()) {
			((Class6_Sub18_Sub1) local13).method2605();
		}
		@Pc(32) Enumeration local32 = this.aHashtable7.keys();
		while (local32.hasMoreElements()) {
			@Pc(42) Canvas local42 = (Canvas) local32.nextElement();
			this.method6770(this.aHashtable7.get(local42), local42);
		}
		Static217.method3969(false, true);
		this.aNativeInterface3.release();
		this.aBoolean562 = true;
	}

	@OriginalMember(owner = "client!jj", name = "V", descriptor = "(I)V")
	protected abstract void method6799();

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method6677() {
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method6701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method6733();
		this.method6758();
		this.method6801(arg4);
		this.method6795(0, Static389.aClass261_8);
		this.method6816(0, Static389.aClass261_8);
		this.method6736(arg5);
		this.aClass109_Sub3_15.method4355((float) (arg3 - 1), 1.0F, (float) (arg2 - 1));
		this.aClass109_Sub3_15.method4341(0.0F, (float) arg0 - local7, (float) arg1 - local7);
		this.method6820();
		this.method6797(false);
		this.method6771(4, Static96.aClass51_3);
		this.method6797(true);
		this.method6816(0, Static24.aClass261_1);
		this.method6795(0, Static24.aClass261_1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([FI)[F")
	public final float[] method6800(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray68[0];
		arg0[4] = this.aFloatArray68[1];
		arg0[8] = this.aFloatArray68[2];
		arg0[12] = this.aFloatArray68[3];
		arg0[5] = this.aFloatArray68[5];
		arg0[2] = this.aFloatArray68[8];
		arg0[13] = this.aFloatArray68[7];
		arg0[9] = this.aFloatArray68[6];
		arg0[1] = this.aFloatArray68[4];
		arg0[6] = this.aFloatArray68[9];
		arg0[14] = this.aFloatArray68[11];
		arg0[7] = this.aFloatArray68[13];
		arg0[10] = this.aFloatArray68[10];
		arg0[3] = this.aFloatArray68[12];
		arg0[15] = this.aFloatArray68[15];
		arg0[11] = this.aFloatArray68[14];
		return arg0;
	}

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "(II)V")
	public final void method6801(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt7650) {
			this.anInt7650 = arg0;
			this.method6789();
		}
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "(Z)V")
	private void method6802() {
		if (this.aCanvas11 == null) {
			this.anInt7542 = this.anInt7552 = 1;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas11.getSize();
			this.anInt7542 = local10.width;
			this.anInt7552 = local10.height;
		}
		this.anInt7590 = this.anInt7552;
		this.anInt7597 = this.anInt7542;
		this.method6764();
		this.method6742();
		this.method6782();
		this.method6781();
		this.method6843();
		this.method6850();
		this.la();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[Lclient!uc;)Lclient!ot;")
	public abstract Class207 method6803(@OriginalArg(1) Class355[] arg0);

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "(I)V")
	private void method6804() {
		if (this.aClass23_3 != null) {
			this.aClass23_3.method8171();
		}
		this.method6798();
	}

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "(II)V")
	public final void method6805(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt7659) {
			this.anInt7659 = arg0;
			this.method6793();
		}
	}

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "()Z")
	@Override
	public final boolean method6693() {
		return false;
	}

	@OriginalMember(owner = "client!jj", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean566 = arg0;
		this.method6844();
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "()Z")
	@Override
	public final boolean method6670() {
		return false;
	}

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "(B)V")
	protected abstract void method6806();

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method6698(@OriginalArg(0) Class6_Sub18 arg0) {
		this.aNativeHeap5 = ((Class6_Sub18_Sub1) arg0).aNativeHeap3;
		this.aNativeHeapBuffer8 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IIIIII)Lclient!sn;")
	@Override
	public final Class81 method6659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class81_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "(I)V")
	private void method6807() {
		this.method6757();
		if (this.aClass23_3 != null) {
			this.aClass23_3.method8170();
		}
	}

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "(I)V")
	public final void method6808() {
		this.method6771(2, Static492.aClass51_6);
	}

	@OriginalMember(owner = "client!jj", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6707(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIZ)Lclient!tb;")
	@Override
	public final Class49 method6710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class49_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZII)V")
	public final void method6809(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 != this.anInt7682 || this.aBoolean556 != this.aBoolean563) {
			@Pc(23) Interface7 local23 = null;
			@Pc(25) int local25 = 0;
			@Pc(27) byte local27 = 0;
			@Pc(29) int local29 = 0;
			@Pc(37) int local37 = this.aBoolean556 ? 3 : 0;
			if (arg2 < 0) {
				this.method6744();
			} else {
				local23 = this.aClass198_3.method4803(arg2);
				@Pc(60) Class297 local60 = super.anInterface11_10.method6027(arg2);
				if (local60.aByte121 == 0 && local60.aByte119 == 0) {
					this.method6744();
				} else {
					@Pc(78) int local78 = local60.aBoolean630 ? 64 : 128;
					@Pc(82) int local82 = local78 * 50;
					@Pc(86) Class109_Sub3 local86 = this.method6775();
					local86.method4342((float) (local60.aByte121 * (this.anInt7673 % local82)) / (float) local82, (float) (local60.aByte119 * (this.anInt7673 % local82)) / (float) local82, 0.0F);
					this.method6787(Static82.aClass211_2);
				}
				if (!this.aBoolean556) {
					local37 = local60.aByte124;
					local29 = local60.anInt8253;
					local27 = local60.aByte122;
				}
				local25 = local60.anInt8254;
			}
			this.method6796(local27, local37, arg0, local29, arg1);
			if (this.aClass23_3 == null) {
				this.method6814(local23);
				this.method6830(local25);
			} else {
				this.aClass23_3.method8162(local25, local23);
			}
			this.anInt7682 = arg2;
			this.aBoolean563 = this.aBoolean556;
		}
		this.anInt7676 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "(B)I")
	public final int method6810() {
		return this.anInt7652;
	}

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "(I)V")
	@Override
	public void method6671(@OriginalArg(0) int arg0) {
		if (this.aClass198_3 != null) {
			this.aClass198_3.method4801();
		}
		this.anInt7673 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!jj", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass109_Sub3_16.method4353((float) arg2, (float) arg0, (float) arg1);
		@Pc(30) int local30;
		@Pc(27) int local27;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local30 = (int) ((float) this.anInt7655 * this.aClass109_Sub3_16.method4351((float) arg0, (float) arg1, (float) arg2) / local14);
			local27 = (int) ((float) this.anInt7688 * this.aClass109_Sub3_16.method4352((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local27 = this.anInt7654;
			local30 = this.anInt7664;
		}
		arg3[1] = (int) ((float) local27 - this.aFloat151);
		arg3[0] = (int) ((float) local30 - this.aFloat154);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6668(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas10 == arg0) {
			local5 = this.anObject19;
		} else if (this.aHashtable7.containsKey(arg0)) {
			local5 = this.aHashtable7.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method6724(local5, arg0);
		if (this.aCanvas11 == arg0) {
			this.method6802();
		}
	}

	@OriginalMember(owner = "client!jj", name = "Y", descriptor = "(I)V")
	public final void method6811() {
		if (this.anInt7676 == 2) {
			return;
		}
		this.method6723();
		this.method6846(false);
		this.method6780(false);
		this.method6815(false);
		this.method6752(false);
		this.method6809(false, false, -2);
		this.anInt7676 = 2;
	}

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "(I)V")
	protected abstract void method6812();

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZB[FLclient!hh;I)Lclient!cf;")
	public final Interface7 method6813(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) Class155 arg3, @OriginalArg(5) int arg4) {
		return this.method6748(arg2, arg4, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!ah;)V")
	public final void method6814(@OriginalArg(1) Interface1 arg0) {
		if (this.anInterface1Array3[this.anInt7659] == arg0) {
			return;
		}
		this.anInterface1Array3[this.anInt7659] = arg0;
		if (arg0 == null) {
			this.method6735();
		} else {
			arg0.method8703();
		}
		this.anInt7676 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!jj", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(ZI)V")
	public final void method6815(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean557) {
			this.aBoolean557 = arg0;
			this.method6785();
			this.anInt7676 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IILclient!oba;)V")
	public final void method6816(@OriginalArg(1) int arg0, @OriginalArg(2) Class261 arg1) {
		this.method6760(arg0, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)Lclient!uba;")
	public abstract Interface25 method6817(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)I")
	@Override
	public final int method6686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!jj", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(12) boolean local12 = arg0 != this.anInt7677;
		if (local12 || this.aFloat145 != arg1 || arg2 != this.aFloat144) {
			this.anInt7677 = arg0;
			this.aFloat145 = arg1;
			this.aFloat144 = arg2;
			if (local12) {
				this.aFloat146 = (float) (this.anInt7677 & 0xFF) / 255.0F;
				this.aFloat147 = (float) (this.anInt7677 & 0xFF00) / 65280.0F;
				this.aFloat153 = (float) (this.anInt7677 & 0xFF0000) / 1.671168E7F;
				this.method6845();
			}
			this.aNativeInterface3.setSunColour(this.aFloat153, this.aFloat147, this.aFloat146, arg1, arg2);
			this.method6730();
		}
		if (this.aFloatArray66[0] != arg3 || this.aFloatArray66[1] != arg4 || arg5 != this.aFloatArray66[2]) {
			this.aFloatArray66[2] = arg5;
			this.aFloatArray66[1] = arg4;
			this.aFloatArray66[0] = arg3;
			this.aFloatArray63[2] = -arg5;
			this.aFloatArray63[0] = -arg3;
			this.aFloatArray63[1] = -arg4;
			@Pc(162) float local162 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray62[1] = local162 * arg4;
			this.aFloatArray62[2] = local162 * arg5;
			this.aFloatArray62[0] = arg3 * local162;
			this.aFloatArray64[2] = -this.aFloatArray62[2];
			this.aFloatArray64[0] = -this.aFloatArray62[0];
			this.aFloatArray64[1] = -this.aFloatArray62[1];
			this.aNativeInterface3.setSunDirection(this.aFloatArray62[0], this.aFloatArray62[1], this.aFloatArray62[2]);
			this.method6821();
			this.anInt7666 = (int) (arg5 * 256.0F / arg4);
			this.anInt7662 = (int) (arg3 * 256.0F / arg4);
		}
		this.method6847();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!hh;IIILclient!on;)Lclient!cf;")
	public abstract Interface7 method6818(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class274 arg3);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!hh;Lclient!on;Z)Z")
	public abstract boolean method6819(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class274 arg1);

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)V")
	public final void method6820() {
		this.aBoolean555 = false;
		this.method6759();
	}

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "()Lclient!qa;")
	@Override
	public final Class109 method6643() {
		return this.aClass109_Sub3_21;
	}

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "(I)V")
	public abstract void method6821();

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZI)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method6822(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap5.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "(I)V")
	private void method6823() {
		this.anInterface6_12 = this.method6768(false);
		this.anInterface6_12.method3659(140, 28);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(38) Buffer local38 = this.anInterface6_12.method3658();
			if (local38 != null) {
				@Pc(45) Stream local45 = this.method6788(local38);
				if (Stream.b()) {
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(1.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(1.0F);
					local45.a(0.0F);
					local45.a(1.0F);
					local45.a(1.0F);
					local45.a(1.0F);
					local45.a(0.0F);
					local45.a(1.0F);
					local45.a(1.0F);
					local45.a(1.0F);
					local45.a(1.0F);
					local45.a(1.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(1.0F);
					local45.a(0.0F);
					local45.a(1.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
				} else {
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(1.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(1.0F);
					local45.b(0.0F);
					local45.b(1.0F);
					local45.b(1.0F);
					local45.b(1.0F);
					local45.b(0.0F);
					local45.b(1.0F);
					local45.b(1.0F);
					local45.b(1.0F);
					local45.b(1.0F);
					local45.b(1.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(1.0F);
					local45.b(0.0F);
					local45.b(1.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
				}
				local45.a();
				if (this.anInterface6_12.method3657()) {
					break;
				}
			}
		}
		this.aClass207_21 = this.method6803(new Class355[] { new Class355(new Class70[] { Static93.aClass70_1, Static93.aClass70_5, Static93.aClass70_5 }) });
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ie;I)V")
	public final void method6824(@OriginalArg(0) Class109_Sub3 arg0) {
		this.aClass109_Sub3_15.method4595(arg0);
		this.aBoolean555 = false;
		this.method6759();
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "()Z")
	@Override
	public final boolean method6680() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ[BLclient!hh;BI)Lclient!cf;")
	public final Interface7 method6825(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) int arg4) {
		return this.method6837(arg1, arg0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public final Class6_Sub18 method6702(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub18_Sub1 local8 = new Class6_Sub18_Sub1(arg0);
		this.aClass340_59.method8131(local8);
		return local8;
	}

	@OriginalMember(owner = "client!jj", name = "T", descriptor = "(I)Lclient!nm;")
	public final Interface19 method6826() {
		return this.aClass81_Sub1_3 == null ? null : this.aClass81_Sub1_3.method2065();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!bl;IZ)V")
	public abstract void method6827(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "(B)V")
	private void method6828() {
		if (this.aClass111_5 == Static24.aClass111_1) {
			return;
		}
		@Pc(10) Class111 local10 = this.aClass111_5;
		this.aClass111_5 = Static24.aClass111_1;
		if (!local10.method3099()) {
			this.method6776();
		}
		this.method6784();
		this.aFloatArray68 = this.aFloatArray69;
		this.method6778();
		this.anInt7676 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!jj", name = "Z", descriptor = "(I)V")
	public final void method6829() {
		this.anInterface1Array3 = new Interface1[this.anInt7658];
		this.aClass109_Sub3Array3 = new Class109_Sub3[this.anInt7658];
		this.aClass211Array3 = new Class211[this.anInt7658];
		this.aClass344Array5 = new Class344[this.anInt7658];
		this.aClass344Array6 = new Class344[this.anInt7658];
		for (@Pc(32) int local32 = 0; local32 < this.anInt7658; local32++) {
			this.aClass344Array6[local32] = Static257.aClass344_2;
			this.aClass344Array5[local32] = Static257.aClass344_2;
			this.aClass211Array3[local32] = Static486.aClass211_4;
			this.aClass109_Sub3Array3[local32] = new Class109_Sub3();
		}
		this.aClass6_Sub10Array5 = new Class6_Sub10[this.anInt7661 - 2];
		this.anInterface1_3 = this.method6818(Static432.aClass155_45, 1, 1, Static435.aClass274_13);
		this.method6698(new Class6_Sub18_Sub1(262144));
		this.aClass207_20 = this.method6803(new Class355[] { new Class355(new Class70[] { Static93.aClass70_1, Static93.aClass70_5 }) });
		this.aClass207_18 = this.method6803(new Class355[] { new Class355(new Class70[] { Static93.aClass70_1, Static93.aClass70_3 }) });
		this.aClass207_19 = this.method6803(new Class355[] { new Class355(Static93.aClass70_1), new Class355(Static93.aClass70_3), new Class355(Static93.aClass70_5), new Class355(Static93.aClass70_2) });
		this.aClass207_17 = this.method6803(new Class355[] { new Class355(Static93.aClass70_1), new Class355(Static93.aClass70_3), new Class355(Static93.aClass70_5) });
		this.aClass54_Sub2_26 = new Class54_Sub2(this, 0, 0, false, false);
		this.aClass54_Sub2_27 = new Class54_Sub2(this, 0, 0, true, true);
		this.aClass54_Sub2_30 = new Class54_Sub2(this, 0, 0, false, false);
		this.aClass54_Sub2_23 = new Class54_Sub2(this, 0, 0, true, true);
		this.aClass54_Sub2_28 = new Class54_Sub2(this, 0, 0, false, false);
		this.aClass54_Sub2_24 = new Class54_Sub2(this, 0, 0, true, true);
		this.aClass54_Sub2_22 = new Class54_Sub2(this, 0, 0, false, false);
		this.aClass54_Sub2_25 = new Class54_Sub2(this, 0, 0, true, true);
		this.aClass54_Sub2_21 = new Class54_Sub2(this, 0, 0, false, false);
		this.aClass54_Sub2_29 = new Class54_Sub2(this, 0, 0, true, true);
		this.aClass299_3 = new Class299(this);
		this.anInterface25_7 = this.method6817(true);
		this.method6720();
		this.aClass184_6 = new Class184(this);
		this.aClass23Array3[1] = this.method6750(1);
		this.aClass23Array3[2] = this.method6750(2);
		this.aClass23Array3[4] = this.method6750(4);
		this.aClass23Array3[5] = this.method6750(5);
		this.aClass23Array3[6] = this.method6750(6);
		this.aClass23Array3[7] = this.method6750(7);
		this.aClass23Array3[3] = this.method6750(3);
		this.aClass23Array3[8] = this.method6750(8);
		this.aClass23Array3[9] = this.method6750(9);
		if (!this.aClass23Array3[2].method8164()) {
			this.aClass23Array3[2] = this.method6750(0);
		}
		if (!this.aClass23Array3[4].method8164()) {
			this.aClass23Array3[4] = this.aClass23Array3[2];
		}
		if (!this.aClass23Array3[8].method8164()) {
			this.aClass23Array3[8] = this.aClass23Array3[4];
		}
		if (!this.aClass23Array3[9].method8164()) {
			this.aClass23Array3[9] = this.aClass23Array3[8];
		}
		this.method6833();
		this.la();
		this.method6717();
	}

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "(II)V")
	public final void method6830(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method6743(Static571.aClass344_5, Static571.aClass344_5);
		} else if (arg0 == 0) {
			this.method6743(Static257.aClass344_2, Static257.aClass344_2);
		} else if (arg0 == 2) {
			this.method6743(Static399.aClass344_3, Static571.aClass344_5);
		} else if (arg0 == 3) {
			this.method6743(Static421.aClass344_4, Static257.aClass344_2);
		} else if (arg0 == 4) {
			this.method6743(Static256.aClass344_1, Static256.aClass344_1);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZBLclient!oba;I)V")
	public abstract void method6831(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class261 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!jj", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass109_Sub3_16.aFloat88 * (float) arg2 + this.aClass109_Sub3_16.aFloat96 * (float) arg1 + (float) arg0 * this.aClass109_Sub3_16.aFloat86 + this.aClass109_Sub3_16.aFloat91;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg5 * this.aClass109_Sub3_16.aFloat88 + (float) arg3 * this.aClass109_Sub3_16.aFloat86 + (float) arg4 * this.aClass109_Sub3_16.aFloat96 + this.aClass109_Sub3_16.aFloat91;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt7687 > local32 && (float) this.anInt7687 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt7680 < local32 && local63 > (float) this.anInt7680) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) ((float) this.anInt7655 * (this.aClass109_Sub3_16.aFloat87 + (float) arg2 * this.aClass109_Sub3_16.aFloat92 + (float) arg1 * this.aClass109_Sub3_16.aFloat94 + this.aClass109_Sub3_16.aFloat93 * (float) arg0) / local32);
		@Pc(173) int local173 = (int) ((float) this.anInt7655 * (this.aClass109_Sub3_16.aFloat87 + (float) arg5 * this.aClass109_Sub3_16.aFloat92 + this.aClass109_Sub3_16.aFloat93 * (float) arg3 + (float) arg4 * this.aClass109_Sub3_16.aFloat94) / local63);
		if ((float) local141 < this.aFloat154 && (float) local173 < this.aFloat154) {
			local7 |= 0x1;
		} else if (this.aFloat156 < (float) local141 && this.aFloat156 < (float) local173) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) ((float) this.anInt7688 * ((float) arg0 * this.aClass109_Sub3_16.aFloat90 + this.aClass109_Sub3_16.aFloat95 * (float) arg1 + (float) arg2 * this.aClass109_Sub3_16.aFloat85 + this.aClass109_Sub3_16.aFloat89) / local32);
		@Pc(277) int local277 = (int) ((this.aClass109_Sub3_16.aFloat85 * (float) arg5 + this.aClass109_Sub3_16.aFloat95 * (float) arg4 + this.aClass109_Sub3_16.aFloat90 * (float) arg3 + this.aClass109_Sub3_16.aFloat89) * (float) this.anInt7688 / local63);
		if (this.aFloat151 > (float) local245 && (float) local277 < this.aFloat151) {
			local7 |= 0x4;
		} else if ((float) local245 > this.aFloat157 && this.aFloat157 < (float) local277) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jj", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass109_Sub3_16.method4353((float) arg2, (float) arg0, (float) arg1);
		@Pc(42) int local42;
		@Pc(60) int local60;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local42 = (int) ((float) this.anInt7655 * this.aClass109_Sub3_16.method4351((float) arg0, (float) arg1, (float) arg2) / local14);
			local60 = (int) ((float) this.anInt7688 * this.aClass109_Sub3_16.method4352((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local42 = this.anInt7664;
			local60 = this.anInt7654;
		}
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local60 - this.aFloat151);
		arg3[0] = (int) ((float) local42 - this.aFloat154);
	}

	@OriginalMember(owner = "client!jj", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt7597 - 1 <= arg2 && arg1 <= 0 && this.anInt7590 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt7681 = arg1 >= 0 ? arg1 : 0;
		this.anInt7656 = arg0 < 0 ? 0 : arg0;
		this.anInt7686 = this.anInt7597 >= arg2 ? arg2 : 0;
		this.anInt7668 = this.anInt7597 >= arg3 ? arg3 : 0;
		if (!this.aBoolean576) {
			this.aBoolean576 = true;
			this.method6842();
		}
		this.method6790();
		this.method6843();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)V")
	public abstract void method6832(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jj", name = "E", descriptor = "(I)V")
	protected void method6833() {
		this.method6754();
	}

	@OriginalMember(owner = "client!jj", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt7670 && this.anInt7657 == arg1 && this.anInt7675 == arg2) {
			return;
		}
		this.anInt7670 = arg0;
		this.anInt7675 = arg2;
		this.anInt7657 = arg1;
		this.method6804();
		this.method6721();
	}

	@OriginalMember(owner = "client!jj", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt7672 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt7672++;
		}
		this.anInt7684 = 0x1 << this.anInt7672;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method6834(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!jj", name = "db", descriptor = "(I)V")
	protected void method6835() {
		this.anInt7683 = this.anInt7660;
		this.anInt7660 = 0;
	}

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "(B)Lclient!ie;")
	public final Class109_Sub3 method6836() {
		return this.aClass109_Sub3Array3[this.anInt7659];
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIB[BILclient!hh;II)Lclient!cf;")
	protected abstract Interface7 method6837(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) Class155 arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)V")
	public final void method6838(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean575) {
			this.aBoolean575 = arg0;
			this.method6841();
		}
	}

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "(I)I")
	public final int method6839() {
		return this.anInt7685;
	}

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "()Z")
	@Override
	public final boolean method6703() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "(B)[F")
	public final float[] method6840() {
		return this.aFloatArray65;
	}

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "(I)V")
	protected abstract void method6841();

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "(B)V")
	protected abstract void method6842();

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
	@Override
	public final void method6706(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass198_3 != null) {
			this.aClass198_3.method4800();
		}
		this.anInt7671 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "(B)V")
	private void method6843() {
		this.aFloat154 = (float) (this.anInt7656 - this.anInt7664);
		this.aFloat151 = (float) (this.anInt7681 - this.anInt7654);
		this.aFloat157 = (float) (this.anInt7668 - this.anInt7654);
		this.aFloat156 = (float) (this.anInt7686 - this.anInt7664);
	}

	@OriginalMember(owner = "client!jj", name = "B", descriptor = "(I)V")
	protected abstract void method6844();

	@OriginalMember(owner = "client!jj", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat152) {
			this.aFloat152 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method6845();
			this.method6847();
		}
	}

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "()Z")
	@Override
	public final boolean method6640() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "L", descriptor = "(I)V")
	protected abstract void method6845();

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(ZI)V")
	public final void method6846(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean564) {
			this.aBoolean564 = arg0;
			this.method6721();
			this.anInt7676 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "()Z")
	@Override
	public final boolean method6704() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIZ)Lclient!tb;")
	@Override
	public final Class49 method6687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class49_Sub3 local11 = new Class49_Sub3(this, arg2, arg3, arg4);
		local11.method8976(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "(Z)V")
	protected abstract void method6847();

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "(I)Lclient!ie;")
	public final Class109_Sub3 method6848() {
		if (!this.aBoolean573) {
			this.aClass109_Sub3_20.method4349(this.aClass109_Sub3_18, this.aClass109_Sub3_15);
			this.aBoolean573 = true;
		}
		return this.aClass109_Sub3_20;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method6679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!cd;[Lclient!cu;Z)Lclient!da;")
	@Override
	public final Class67 method6649(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class64[] arg1) {
		return new Class67_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!hh;III[B)Lclient!jca;")
	public abstract Interface13 method6849(@OriginalArg(1) Class155 arg0, @OriginalArg(5) byte[] arg1);

	@OriginalMember(owner = "client!jj", name = "R", descriptor = "(I)V")
	public final void method6850() {
		if (this.aClass111_5 == Static203.aClass111_6) {
			return;
		}
		@Pc(6) Class111 local6 = this.aClass111_5;
		this.aClass111_5 = Static203.aClass111_6;
		if (local6.method3099()) {
			this.method6776();
		}
		this.aFloatArray68 = this.aFloatArray65;
		this.anInt7676 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(Z)V")
	private void method6851() {
		if (this.aBoolean560) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray61;
		if (this.anInt7597 == 0 || this.anInt7590 == 0) {
			local5[14] = 0.0F;
			local5[12] = 0.0F;
			local5[6] = 0.0F;
			local5[5] = 1.0F;
			local5[7] = 0.0F;
			local5[1] = 0.0F;
			local5[8] = 0.0F;
			local5[13] = 0.0F;
			local5[11] = 0.0F;
			local5[9] = 0.0F;
			local5[15] = 1.0F;
			local5[3] = 0.0F;
			local5[0] = 1.0F;
			local5[4] = 0.0F;
			local5[2] = 0.0F;
			local5[10] = 1.0F;
		} else {
			local5[2] = 0.0F;
			local5[11] = 0.0F;
			local5[9] = 0.0F;
			local5[0] = 2.0F / (float) this.anInt7597;
			local5[12] = -1.0F;
			local5[10] = 0.5F;
			local5[6] = 0.0F;
			local5[7] = 0.0F;
			local5[3] = 0.0F;
			local5[14] = 0.5F;
			local5[1] = 0.0F;
			local5[8] = 0.0F;
			local5[4] = 0.0F;
			local5[13] = 1.0F;
			local5[15] = 1.0F;
			local5[5] = -2.0F / (float) this.anInt7590;
		}
		this.aBoolean560 = true;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IZ)Lclient!uba;")
	public final Interface25 method6852(@OriginalArg(0) int arg0) {
		if (this.anInterface25_7.method8674() < arg0 * 2) {
			this.anInterface25_7.method8679(arg0);
		}
		return this.anInterface25_7;
	}

	@OriginalMember(owner = "client!jj", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean556) {
			throw new RuntimeException("");
		}
		this.anInt7685 = arg0;
		this.anInt7667 = arg1;
		this.anInt7689 = arg2;
		this.anInt7652 = arg3;
		if (this.aBoolean563) {
			this.aClass23Array3[3].method8163();
			this.aClass23Array3[3].method8171();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([IIIIIZ)Lclient!tb;")
	@Override
	public final Class49 method6675(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class49_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!cb;III)V")
	public abstract void method6853(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jj", name = "B", descriptor = "()Lclient!qa;")
	@Override
	public final Class109 method6709() {
		return new Class109_Sub3();
	}

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt7687;
	}
}
