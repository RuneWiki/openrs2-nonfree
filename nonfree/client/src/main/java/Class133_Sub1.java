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

@OriginalClass("client!pj")
public abstract class Class133_Sub1 extends Class133 {

	@OriginalMember(owner = "client!pj", name = "Hb", descriptor = "Lclient!no;")
	protected Class250 aClass250_5;

	@OriginalMember(owner = "client!pj", name = "hc", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!pj", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!pj", name = "sd", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable4;

	@OriginalMember(owner = "client!pj", name = "yd", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!pj", name = "Sd", descriptor = "I")
	public int anInt6964;

	@OriginalMember(owner = "client!pj", name = "Yd", descriptor = "I")
	public int anInt6969;

	@OriginalMember(owner = "client!pj", name = "ce", descriptor = "I")
	protected int anInt6972;

	@OriginalMember(owner = "client!pj", name = "qe", descriptor = "Z")
	public boolean aBoolean477;

	@OriginalMember(owner = "client!pj", name = "se", descriptor = "I")
	public int anInt6981;

	@OriginalMember(owner = "client!pj", name = "ue", descriptor = "I")
	protected int anInt6983;

	@OriginalMember(owner = "client!pj", name = "ve", descriptor = "I")
	protected int anInt6984;

	@OriginalMember(owner = "client!pj", name = "ze", descriptor = "Z")
	public boolean aBoolean478;

	@OriginalMember(owner = "client!pj", name = "Be", descriptor = "Lclient!gq;")
	private Class130_Sub1 aClass130_Sub1_3;

	@OriginalMember(owner = "client!pj", name = "De", descriptor = "F")
	public float aFloat117;

	@OriginalMember(owner = "client!pj", name = "Ee", descriptor = "[Lclient!vt;")
	protected Class5_Sub11[] aClass5_Sub11Array7;

	@OriginalMember(owner = "client!pj", name = "Fe", descriptor = "F")
	public float aFloat118;

	@OriginalMember(owner = "client!pj", name = "Le", descriptor = "Z")
	public boolean aBoolean481;

	@OriginalMember(owner = "client!pj", name = "Ne", descriptor = "I")
	public int anInt6988;

	@OriginalMember(owner = "client!pj", name = "Qe", descriptor = "I")
	protected int anInt6990;

	@OriginalMember(owner = "client!pj", name = "Re", descriptor = "Lclient!oca;")
	private Class27 aClass27_3;

	@OriginalMember(owner = "client!pj", name = "Te", descriptor = "F")
	public float aFloat121;

	@OriginalMember(owner = "client!pj", name = "Ye", descriptor = "I")
	protected int anInt6992;

	@OriginalMember(owner = "client!pj", name = "df", descriptor = "[Lclient!we;")
	protected Class373[] aClass373Array3;

	@OriginalMember(owner = "client!pj", name = "gf", descriptor = "[Lclient!ga;")
	protected Class113_Sub1[] aClass113_Sub1Array3;

	@OriginalMember(owner = "client!pj", name = "kf", descriptor = "Z")
	protected boolean aBoolean484;

	@OriginalMember(owner = "client!pj", name = "mf", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!pj", name = "nf", descriptor = "Lclient!iu;")
	public Interface8 anInterface8_3;

	@OriginalMember(owner = "client!pj", name = "qf", descriptor = "[Lclient!ht;")
	protected Class151[] aClass151Array5;

	@OriginalMember(owner = "client!pj", name = "wf", descriptor = "Lclient!tu;")
	private Class341 aClass341_3;

	@OriginalMember(owner = "client!pj", name = "Df", descriptor = "[Lclient!iu;")
	private Interface8[] anInterface8Array3;

	@OriginalMember(owner = "client!pj", name = "Ff", descriptor = "F")
	private float aFloat128;

	@OriginalMember(owner = "client!pj", name = "Of", descriptor = "I")
	public int anInt7009;

	@OriginalMember(owner = "client!pj", name = "Sf", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!pj", name = "Vf", descriptor = "F")
	private float aFloat131;

	@OriginalMember(owner = "client!pj", name = "Zf", descriptor = "I")
	private int anInt7014;

	@OriginalMember(owner = "client!pj", name = "eg", descriptor = "Z")
	protected boolean aBoolean493;

	@OriginalMember(owner = "client!pj", name = "fg", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!pj", name = "jg", descriptor = "I")
	public int anInt7017;

	@OriginalMember(owner = "client!pj", name = "lg", descriptor = "I")
	private int anInt7018;

	@OriginalMember(owner = "client!pj", name = "mg", descriptor = "[Lclient!ht;")
	protected Class151[] aClass151Array6;

	@OriginalMember(owner = "client!pj", name = "og", descriptor = "Lclient!lu;")
	public Class187_Sub2 aClass187_Sub2_21;

	@OriginalMember(owner = "client!pj", name = "pg", descriptor = "Lclient!fk;")
	public Class90 aClass90_15;

	@OriginalMember(owner = "client!pj", name = "qg", descriptor = "Lclient!fk;")
	public Class90 aClass90_16;

	@OriginalMember(owner = "client!pj", name = "rg", descriptor = "Lclient!fb;")
	private Interface6 anInterface6_10;

	@OriginalMember(owner = "client!pj", name = "sg", descriptor = "Lclient!lu;")
	public Class187_Sub2 aClass187_Sub2_22;

	@OriginalMember(owner = "client!pj", name = "tg", descriptor = "Lclient!fk;")
	private Class90 aClass90_17;

	@OriginalMember(owner = "client!pj", name = "ug", descriptor = "Lclient!fb;")
	private Interface6 anInterface6_11;

	@OriginalMember(owner = "client!pj", name = "vg", descriptor = "Lclient!fk;")
	public Class90 aClass90_18;

	@OriginalMember(owner = "client!pj", name = "wg", descriptor = "Lclient!lu;")
	public Class187_Sub2 aClass187_Sub2_23;

	@OriginalMember(owner = "client!pj", name = "xg", descriptor = "Lclient!lu;")
	public Class187_Sub2 aClass187_Sub2_24;

	@OriginalMember(owner = "client!pj", name = "yg", descriptor = "Lclient!lu;")
	public Class187_Sub2 aClass187_Sub2_25;

	@OriginalMember(owner = "client!pj", name = "zg", descriptor = "Lclient!lu;")
	public Class187_Sub2 aClass187_Sub2_26;

	@OriginalMember(owner = "client!pj", name = "Ag", descriptor = "Lclient!fk;")
	private Class90 aClass90_19;

	@OriginalMember(owner = "client!pj", name = "Bg", descriptor = "Lclient!lu;")
	public Class187_Sub2 aClass187_Sub2_27;

	@OriginalMember(owner = "client!pj", name = "Cg", descriptor = "Lclient!lu;")
	public Class187_Sub2 aClass187_Sub2_28;

	@OriginalMember(owner = "client!pj", name = "Dg", descriptor = "Lclient!fk;")
	private Class90 aClass90_20;

	@OriginalMember(owner = "client!pj", name = "Eg", descriptor = "Lclient!lu;")
	public Class187_Sub2 aClass187_Sub2_29;

	@OriginalMember(owner = "client!pj", name = "Fg", descriptor = "Lclient!fk;")
	public Class90 aClass90_21;

	@OriginalMember(owner = "client!pj", name = "Gg", descriptor = "Lclient!fb;")
	private Interface6 anInterface6_12;

	@OriginalMember(owner = "client!pj", name = "Hg", descriptor = "Lclient!oq;")
	private Interface14 anInterface14_6;

	@OriginalMember(owner = "client!pj", name = "Ig", descriptor = "Lclient!lu;")
	public Class187_Sub2 aClass187_Sub2_30;

	@OriginalMember(owner = "client!pj", name = "Jg", descriptor = "Z")
	protected boolean aBoolean497;

	@OriginalMember(owner = "client!pj", name = "Kg", descriptor = "I")
	private int anInt7019;

	@OriginalMember(owner = "client!pj", name = "fc", descriptor = "Lclient!tg;")
	private final Class330 aClass330_35 = new Class330();

	@OriginalMember(owner = "client!pj", name = "Td", descriptor = "Z")
	protected boolean aBoolean475 = true;

	@OriginalMember(owner = "client!pj", name = "Pd", descriptor = "Lclient!ga;")
	protected final Class113_Sub1 aClass113_Sub1_15 = new Class113_Sub1();

	@OriginalMember(owner = "client!pj", name = "ke", descriptor = "Lclient!ga;")
	public Class113_Sub1 aClass113_Sub1_16 = new Class113_Sub1();

	@OriginalMember(owner = "client!pj", name = "le", descriptor = "Lclient!ga;")
	public final Class113_Sub1 aClass113_Sub1_17 = new Class113_Sub1();

	@OriginalMember(owner = "client!pj", name = "me", descriptor = "Lclient!ga;")
	protected final Class113_Sub1 aClass113_Sub1_18 = new Class113_Sub1();

	@OriginalMember(owner = "client!pj", name = "ne", descriptor = "Lclient!ga;")
	private final Class113_Sub1 aClass113_Sub1_19 = new Class113_Sub1();

	@OriginalMember(owner = "client!pj", name = "oe", descriptor = "Lclient!ga;")
	private final Class113_Sub1 aClass113_Sub1_20 = new Class113_Sub1();

	@OriginalMember(owner = "client!pj", name = "re", descriptor = "I")
	public int anInt6980 = 0;

	@OriginalMember(owner = "client!pj", name = "Ae", descriptor = "Z")
	protected boolean aBoolean479 = false;

	@OriginalMember(owner = "client!pj", name = "Je", descriptor = "F")
	public float aFloat119 = 1.0F;

	@OriginalMember(owner = "client!pj", name = "Ze", descriptor = "I")
	private int anInt6993 = 0;

	@OriginalMember(owner = "client!pj", name = "Ue", descriptor = "Z")
	protected boolean aBoolean483 = false;

	@OriginalMember(owner = "client!pj", name = "Ie", descriptor = "Z")
	private boolean aBoolean480 = false;

	@OriginalMember(owner = "client!pj", name = "Ve", descriptor = "Lclient!nf;")
	protected Class242 aClass242_5 = Static630.aClass242_7;

	@OriginalMember(owner = "client!pj", name = "cf", descriptor = "F")
	public float aFloat123 = 3584.0F;

	@OriginalMember(owner = "client!pj", name = "He", descriptor = "I")
	protected int anInt6987 = 0;

	@OriginalMember(owner = "client!pj", name = "ye", descriptor = "I")
	private int anInt6986 = 1;

	@OriginalMember(owner = "client!pj", name = "Pe", descriptor = "I")
	private int anInt6989 = -1;

	@OriginalMember(owner = "client!pj", name = "Oe", descriptor = "Z")
	protected boolean aBoolean482 = true;

	@OriginalMember(owner = "client!pj", name = "we", descriptor = "[F")
	private final float[] aFloatArray51 = new float[16];

	@OriginalMember(owner = "client!pj", name = "Me", descriptor = "F")
	private float aFloat120 = 1.0F;

	@OriginalMember(owner = "client!pj", name = "af", descriptor = "F")
	public float aFloat122 = 3584.0F;

	@OriginalMember(owner = "client!pj", name = "xf", descriptor = "F")
	public float aFloat127 = -1.0F;

	@OriginalMember(owner = "client!pj", name = "ff", descriptor = "I")
	public int anInt6995 = 128;

	@OriginalMember(owner = "client!pj", name = "sf", descriptor = "I")
	private int anInt6999 = 0;

	@OriginalMember(owner = "client!pj", name = "hf", descriptor = "I")
	protected int anInt6996 = 0;

	@OriginalMember(owner = "client!pj", name = "Ke", descriptor = "[F")
	private final float[] aFloatArray53 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!pj", name = "pf", descriptor = "I")
	protected final int anInt6998 = 0;

	@OriginalMember(owner = "client!pj", name = "uf", descriptor = "[F")
	private final float[] aFloatArray55 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!pj", name = "If", descriptor = "Z")
	private boolean aBoolean488 = false;

	@OriginalMember(owner = "client!pj", name = "Gf", descriptor = "Z")
	private boolean aBoolean487 = false;

	@OriginalMember(owner = "client!pj", name = "Jf", descriptor = "I")
	private int anInt7005 = 0;

	@OriginalMember(owner = "client!pj", name = "lf", descriptor = "F")
	public float aFloat124 = -1.0F;

	@OriginalMember(owner = "client!pj", name = "We", descriptor = "[Lclient!oca;")
	private final Class27[] aClass27Array3 = new Class27[10];

	@OriginalMember(owner = "client!pj", name = "zf", descriptor = "I")
	public int anInt7002 = 50;

	@OriginalMember(owner = "client!pj", name = "Se", descriptor = "[F")
	private final float[] aFloatArray54 = new float[16];

	@OriginalMember(owner = "client!pj", name = "Qf", descriptor = "F")
	public float aFloat129 = 1.0F;

	@OriginalMember(owner = "client!pj", name = "Af", descriptor = "[F")
	private final float[] aFloatArray56 = new float[16];

	@OriginalMember(owner = "client!pj", name = "jf", descriptor = "I")
	public int anInt6997 = -1;

	@OriginalMember(owner = "client!pj", name = "Wf", descriptor = "Z")
	protected boolean aBoolean491 = true;

	@OriginalMember(owner = "client!pj", name = "rf", descriptor = "F")
	public float aFloat126 = 1.0F;

	@OriginalMember(owner = "client!pj", name = "Ef", descriptor = "Z")
	protected boolean aBoolean486 = false;

	@OriginalMember(owner = "client!pj", name = "Cf", descriptor = "I")
	private int anInt7004 = 0;

	@OriginalMember(owner = "client!pj", name = "Lf", descriptor = "I")
	public int anInt7006 = 0;

	@OriginalMember(owner = "client!pj", name = "Bf", descriptor = "I")
	public int anInt7003 = -1;

	@OriginalMember(owner = "client!pj", name = "Nf", descriptor = "I")
	public int anInt7008 = 512;

	@OriginalMember(owner = "client!pj", name = "cg", descriptor = "Z")
	protected boolean aBoolean492 = false;

	@OriginalMember(owner = "client!pj", name = "Xf", descriptor = "I")
	public int anInt7012 = 3;

	@OriginalMember(owner = "client!pj", name = "dg", descriptor = "I")
	private int anInt7016 = -1;

	@OriginalMember(owner = "client!pj", name = "Uf", descriptor = "I")
	protected final int anInt7011 = 0;

	@OriginalMember(owner = "client!pj", name = "ag", descriptor = "F")
	public float aFloat132 = 1.0F;

	@OriginalMember(owner = "client!pj", name = "Pf", descriptor = "Z")
	protected boolean aBoolean489 = true;

	@OriginalMember(owner = "client!pj", name = "xe", descriptor = "I")
	protected int anInt6985 = 3584;

	@OriginalMember(owner = "client!pj", name = "Mf", descriptor = "I")
	public int anInt7007 = 0;

	@OriginalMember(owner = "client!pj", name = "bg", descriptor = "I")
	private int anInt7015 = 16777215;

	@OriginalMember(owner = "client!pj", name = "Rf", descriptor = "Z")
	protected boolean aBoolean490 = true;

	@OriginalMember(owner = "client!pj", name = "Xe", descriptor = "I")
	protected int anInt6991 = 0;

	@OriginalMember(owner = "client!pj", name = "Kf", descriptor = "Lclient!bea;")
	protected Class32 aClass32_7 = Static212.aClass32_3;

	@OriginalMember(owner = "client!pj", name = "hg", descriptor = "Z")
	private boolean aBoolean494 = false;

	@OriginalMember(owner = "client!pj", name = "pe", descriptor = "[F")
	public final float[] aFloatArray50 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!pj", name = "ig", descriptor = "Z")
	private boolean aBoolean495 = false;

	@OriginalMember(owner = "client!pj", name = "Yf", descriptor = "I")
	public int anInt7013 = 512;

	@OriginalMember(owner = "client!pj", name = "ef", descriptor = "I")
	protected int anInt6994 = 0;

	@OriginalMember(owner = "client!pj", name = "Tf", descriptor = "I")
	private int anInt7010 = -1;

	@OriginalMember(owner = "client!pj", name = "Hf", descriptor = "[F")
	public final float[] aFloatArray57 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!pj", name = "kg", descriptor = "Z")
	protected boolean aBoolean496 = true;

	@OriginalMember(owner = "client!pj", name = "vf", descriptor = "I")
	public int anInt7001 = 8;

	@OriginalMember(owner = "client!pj", name = "gg", descriptor = "[F")
	private final float[] aFloatArray58 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!pj", name = "Ce", descriptor = "[F")
	protected float[] aFloatArray52 = this.aFloatArray58;

	@OriginalMember(owner = "client!pj", name = "bf", descriptor = "I")
	protected int bf = 0;

	@OriginalMember(owner = "client!pj", name = "yf", descriptor = "Z")
	private boolean aBoolean485 = false;

	@OriginalMember(owner = "client!pj", name = "of", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!pj", name = "ng", descriptor = "Lclient!ga;")
	private final Class113_Sub1 aClass113_Sub1_21 = new Class113_Sub1();

	@OriginalMember(owner = "client!pj", name = "od", descriptor = "Ljava/lang/Object;")
	protected final Object anObject17;

	@OriginalMember(owner = "client!pj", name = "Ob", descriptor = "Ljava/lang/Object;")
	private Object anObject16;

	@OriginalMember(owner = "client!pj", name = "te", descriptor = "I")
	protected final int anInt6982;

	@OriginalMember(owner = "client!pj", name = "qb", descriptor = "Lclient!la;")
	protected final Class207 aClass207_81;

	@OriginalMember(owner = "client!pj", name = "P", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas15;

	@OriginalMember(owner = "client!pj", name = "U", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas16;

	@OriginalMember(owner = "client!pj", name = "Qc", descriptor = "I")
	private int anInt6914;

	@OriginalMember(owner = "client!pj", name = "ic", descriptor = "I")
	public int anInt6881;

	@OriginalMember(owner = "client!pj", name = "Mb", descriptor = "I")
	private int anInt6862;

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
	public int anInt6805;

	@OriginalMember(owner = "client!pj", name = "tf", descriptor = "I")
	public final int anInt7000;

	@OriginalMember(owner = "client!pj", name = "sc", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!pj", name = "Ge", descriptor = "Lclient!tia;")
	private final Class334 aClass334_3;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!la;II)V")
	protected Class133_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) Class207 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anObject16 = this.anObject17 = arg1;
			this.anInt6982 = arg4;
			this.aClass207_81 = arg3;
			this.aCanvas16 = this.aCanvas15 = arg0;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt6881 = this.anInt6914 = local307.height;
			this.anInt6805 = this.anInt6862 = local307.width;
			this.anInt7000 = arg5;
			Static627.method8869(true, false);
			if (super.anInterface3_12 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt7000);
				this.aClass334_3 = null;
			} else {
				this.aClass334_3 = new Class334(this, super.anInterface3_12);
				this.aNativeInterface3 = new NativeInterface(super.anInterface3_12.method4655(), this.anInt7000);
				for (@Pc(364) int local364 = 0; super.anInterface3_12.method4655() > local364; local364++) {
					@Pc(372) Class145 local372 = super.anInterface3_12.method4656(local364);
					if (local372 != null) {
						this.aNativeInterface3.initTextureMetrics(local364, local372.aByte66, local372.aByte67);
					}
				}
			}
		} catch (@Pc(391) Throwable local391) {
			local391.printStackTrace();
			this.method7295();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
	protected abstract void method6152();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!iu;)V")
	public final void method6153(@OriginalArg(1) Interface8 arg0) {
		if (arg0 == this.anInterface8Array3[this.anInt6996]) {
			return;
		}
		this.anInterface8Array3[this.anInt6996] = arg0;
		if (arg0 == null) {
			this.method6201();
		} else {
			arg0.method7907();
		}
		this.anInt7018 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V")
	@Override
	public final void method7309(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass334_3 != null) {
			this.aClass334_3.method7941();
		}
		this.anInt6995 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt6980, this.anInt7007, this.anInt7008, this.anInt7013 };
	}

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7249() {
		return this.aBoolean484;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[Lclient!bl;)Lclient!fk;")
	public abstract Class90 method6154(@OriginalArg(1) Class40[] arg0);

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "()Z")
	@Override
	public final boolean method7270() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "(II)Lclient!oq;")
	public final Interface14 method6155(@OriginalArg(0) int arg0) {
		if (arg0 * 2 > this.anInterface14_6.method6758()) {
			this.anInterface14_6.method6764(arg0);
		}
		return this.anInterface14_6;
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(Z)V")
	private void method6156() {
		if (this.aBoolean488) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray56;
		@Pc(9) float local9 = (float) this.anInt7002;
		@Pc(13) float local13 = (float) this.anInt6985;
		@Pc(25) float local25 = this.aFloat120 * (float) -this.anInt7007 / (float) this.anInt7013;
		@Pc(37) float local37 = (float) -this.anInt6980 * this.aFloat120 / (float) this.anInt7008;
		@Pc(52) float local52 = (float) (this.anInt6805 - this.anInt6980) * this.aFloat120 / (float) this.anInt7008;
		@Pc(66) float local66 = (float) (this.anInt6881 - this.anInt7007) * this.aFloat120 / (float) this.anInt7013;
		if (local52 == local37 || local25 == local66) {
			local5[7] = 0.0F;
			local5[1] = 0.0F;
			local5[6] = 0.0F;
			local5[0] = 1.0F;
			local5[13] = 0.0F;
			local5[9] = 0.0F;
			local5[14] = 0.0F;
			local5[4] = 0.0F;
			local5[11] = 0.0F;
			local5[5] = 1.0F;
			local5[15] = 1.0F;
			local5[10] = 1.0F;
			local5[2] = 0.0F;
			local5[12] = 0.0F;
			local5[8] = 0.0F;
			local5[3] = 0.0F;
		} else {
			local5[1] = 0.0F;
			local5[2] = 0.0F;
			local5[6] = 0.0F;
			local5[0] = 2.0F / (local52 - local37);
			local5[7] = 0.0F;
			local5[5] = 2.0F / (local66 - local25);
			local5[8] = 0.0F;
			local5[13] = (local66 + local25) / (-local25 + local66);
			local5[15] = 1.0F;
			local5[3] = 0.0F;
			local5[14] = local9 / (local9 - local13);
			local5[12] = (local52 + local37) / (-local52 + local37);
			local5[4] = 0.0F;
			local5[11] = 0.0F;
			local5[10] = 1.0F / (local9 - local13);
			local5[9] = 0.0F;
		}
		this.method6198();
		this.aBoolean488 = true;
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7002 == arg0 && arg1 == this.anInt6985) {
			return;
		}
		this.anInt6985 = arg1;
		this.anInt7002 = arg0;
		this.method6241();
		this.method6186();
		this.method6164();
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method6214();
		this.method6212();
		this.method6160(arg4);
		this.method6211(Static105.aClass236_1, 0);
		this.method6159(0, Static105.aClass236_1);
		this.method6208(arg5);
		this.aClass113_Sub1_15.method2456((float) (arg3 - 1), 1.0F, (float) (arg2 - 1));
		this.aClass113_Sub1_15.method2467((float) arg1 - local7, 0.0F, (float) arg0 - local7);
		this.method6204();
		this.method6260(false);
		this.method6173(Static48.aClass303_1, 4);
		this.method6260(true);
		this.method6159(0, Static626.aClass236_6);
		this.method6211(Static626.aClass236_6, 0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(FFFZFFF)Z")
	private boolean method6157(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface6_12.method4126();
		if (local9 == null) {
			return false;
		}
		@Pc(18) Stream local18 = this.method6242(local9);
		if (Stream.a()) {
			local18.a(arg1);
			local18.a(arg2);
			local18.a(arg3);
			local18.a(arg0);
			local18.a(arg4);
			local18.a(arg5);
		} else {
			local18.b(arg1);
			local18.b(arg2);
			local18.b(arg3);
			local18.b(arg0);
			local18.b(arg4);
			local18.b(arg5);
		}
		local18.b();
		return this.anInterface6_12.method4123();
	}

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "(I)V")
	private void method6158() {
		if (this.aBoolean495) {
			return;
		}
		@Pc(15) float[] local15 = this.aFloatArray51;
		this.aBoolean495 = true;
		if (this.anInt6805 != 0 && this.anInt6881 != 0) {
			local15[2] = 0.0F;
			local15[10] = 0.5F;
			local15[13] = 1.0F;
			local15[7] = 0.0F;
			local15[15] = 1.0F;
			local15[1] = 0.0F;
			local15[5] = -2.0F / (float) this.anInt6881;
			local15[14] = 0.5F;
			local15[11] = 0.0F;
			local15[9] = 0.0F;
			local15[8] = 0.0F;
			local15[6] = 0.0F;
			local15[12] = -1.0F;
			local15[4] = 0.0F;
			local15[3] = 0.0F;
			local15[0] = 2.0F / (float) this.anInt6805;
			return;
		}
		local15[4] = 0.0F;
		local15[5] = 1.0F;
		local15[0] = 1.0F;
		local15[13] = 0.0F;
		local15[15] = 1.0F;
		local15[2] = 0.0F;
		local15[7] = 0.0F;
		local15[9] = 0.0F;
		local15[11] = 0.0F;
		local15[10] = 1.0F;
		local15[3] = 0.0F;
		local15[6] = 0.0F;
		local15[8] = 0.0F;
		local15[14] = 0.0F;
		local15[12] = 0.0F;
		local15[1] = 0.0F;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!mq;I)V")
	public final void method6159(@OriginalArg(0) int arg0, @OriginalArg(1) Class236 arg1) {
		this.method6243(arg1, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "(II)V")
	public final void method6160(@OriginalArg(1) int arg0) {
		if (this.anInt6990 != arg0) {
			this.anInt6990 = arg0;
			this.method6209();
		}
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V")
	@Override
	public final void method7278(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(Z)V")
	private void method6161() {
		this.method6203();
		if (this.aClass27_3 != null) {
			this.aClass27_3.method8900();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([IIIIIZ)Lclient!it;")
	@Override
	public final Class28 method7312(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class28_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZB)V")
	public final void method6162(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean493) {
			this.aBoolean493 = arg0;
			this.method6210();
			this.anInt7018 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(Z)V")
	public final void method6163() {
		this.method6173(Static538.aClass303_6, 2);
	}

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "(I)V")
	private void method6164() {
		if (this.aClass27_3 != null) {
			this.aClass27_3.method8893();
		}
		this.method6205();
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)[F")
	public final float[] method6165() {
		return this.aFloatArray58;
	}

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "()Lclient!tc;")
	@Override
	public final Class113 method7299() {
		return this.aClass113_Sub1_16;
	}

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "(I)V")
	public final void method6166() {
		if (this.anInt7018 == 4) {
			return;
		}
		this.method6197();
		this.method6162(false);
		this.method6252(false);
		this.method6178(false);
		this.method6259(false);
		this.method6277(false, -2, false);
		this.method6208(1);
		this.method6268(0);
		this.anInt7018 = 4;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!vm;)V")
	@Override
	public final void method7257(@OriginalArg(0) Class130 arg0) {
		this.aClass130_Sub1_3 = (Class130_Sub1) arg0;
	}

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "()Z")
	@Override
	public final boolean method7314() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt6805 - 1 && arg1 <= 0 && arg3 >= this.anInt6881 - 1) {
			this.la();
			return;
		}
		this.anInt6991 = this.anInt6805 >= arg2 ? arg2 : 0;
		this.bf = this.anInt6805 < arg3 ? 0 : arg3;
		this.anInt6994 = arg1 < 0 ? 0 : arg1;
		this.anInt6987 = arg0 >= 0 ? arg0 : 0;
		if (!this.aBoolean497) {
			this.aBoolean497 = true;
			this.method6261();
		}
		this.method6234();
		this.method6246();
	}

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "(II)V")
	public abstract void method6167(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
	private void method6168() {
		this.aBoolean480 = false;
		if (this.aClass27_3 != null) {
			this.aClass27_3.method8899();
		}
		this.method6193();
	}

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "(I)V")
	private void method6169() {
		this.anInterface6_11 = this.method6196(false);
		this.anInterface6_11.method4124(3096, 12);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(30) Buffer local30 = this.anInterface6_11.method4126();
			if (local30 != null) {
				@Pc(37) Stream local37 = this.method6242(local30);
				local37.a(0.0F);
				local37.a(0.0F);
				local37.a(0.0F);
				for (@Pc(48) int local48 = 0; local48 <= 256; local48++) {
					@Pc(59) double local59 = (double) (local48 * 2) * 3.141592653589793D / 256.0D;
					@Pc(63) float local63 = (float) Math.cos(local59);
					@Pc(67) float local67 = (float) Math.sin(local59);
					if (Stream.a()) {
						local37.a(local67);
						local37.a(local63);
						local37.a(0.0F);
					} else {
						local37.b(local67);
						local37.b(local63);
						local37.b(0.0F);
					}
				}
				local37.b();
				if (this.anInterface6_11.method4123()) {
					break;
				}
			}
		}
		this.aClass90_17 = this.method6154(new Class40[] { new Class40(Static420.aClass266_1) });
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!tc;)V")
	@Override
	public final void method7269(@OriginalArg(0) Class113 arg0) {
		this.aClass113_Sub1_16 = (Class113_Sub1) arg0;
		this.aClass113_Sub1_18.method8456(this.aClass113_Sub1_16);
		this.aClass113_Sub1_18.method2464();
		this.aClass113_Sub1_19.method2463(this.aClass113_Sub1_18);
		this.aClass113_Sub1_17.method2463(this.aClass113_Sub1_16);
		if (this.aClass242_5.method5447()) {
			this.method6168();
		}
	}

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "(I)V")
	private void method6170() {
		this.anInterface6_10 = this.method6196(false);
		this.anInterface6_10.method4124(140, 28);
		for (@Pc(32) int local32 = 0; local32 < 4; local32++) {
			@Pc(42) Buffer local42 = this.anInterface6_10.method4126();
			if (local42 != null) {
				@Pc(49) Stream local49 = this.method6242(local42);
				if (Stream.a()) {
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(1.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(1.0F);
					local49.a(0.0F);
					local49.a(1.0F);
					local49.a(1.0F);
					local49.a(1.0F);
					local49.a(0.0F);
					local49.a(1.0F);
					local49.a(1.0F);
					local49.a(1.0F);
					local49.a(1.0F);
					local49.a(1.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(1.0F);
					local49.a(0.0F);
					local49.a(1.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(0.0F);
					local49.a(0.0F);
				} else {
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(1.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(1.0F);
					local49.b(0.0F);
					local49.b(1.0F);
					local49.b(1.0F);
					local49.b(1.0F);
					local49.b(0.0F);
					local49.b(1.0F);
					local49.b(1.0F);
					local49.b(1.0F);
					local49.b(1.0F);
					local49.b(1.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(1.0F);
					local49.b(0.0F);
					local49.b(1.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(0.0F);
					local49.b(0.0F);
				}
				local49.b();
				if (this.anInterface6_10.method4123()) {
					break;
				}
			}
		}
		this.aClass90_19 = this.method6154(new Class40[] { new Class40(new Class266[] { Static420.aClass266_1, Static420.aClass266_5, Static420.aClass266_5 }) });
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)V")
	@Override
	public final void method7289(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "(I)Lclient!ga;")
	public final Class113_Sub1 method6171() {
		return this.aClass113_Sub1_19;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "()V")
	@Override
	protected void method7236() {
		if (this.aBoolean487) {
			return;
		}
		for (@Pc(13) Class5 local13 = this.aClass330_35.method7908(); local13 != null; local13 = this.aClass330_35.method7914()) {
			((Class5_Sub6_Sub2) local13).method8757();
		}
		@Pc(30) Enumeration local30 = this.aHashtable4.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method6278(local36, this.aHashtable4.get(local36));
		}
		Static487.method7200(true, false);
		this.aNativeInterface3.release();
		this.aBoolean487 = true;
	}

	@OriginalMember(owner = "client!pj", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass113_Sub1_16.method2469((float) arg1, (float) arg2, (float) arg0);
		@Pc(25) int local25;
		@Pc(28) int local28;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local25 = (int) ((float) this.anInt7008 * this.aClass113_Sub1_16.method2459((float) arg2, (float) arg1, (float) arg0) / local14);
			local28 = (int) ((float) this.anInt7013 * this.aClass113_Sub1_16.method2462((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local25 = this.anInt6980;
			local28 = this.anInt7007;
		}
		arg3[1] = (int) ((float) local28 - this.aFloat117);
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local25 - this.aFloat121);
	}

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "(I)V")
	public final void method6172() {
		if (Static255.aClass373_3 != this.aClass373Array3[this.anInt6996]) {
			this.aClass373Array3[this.anInt6996] = Static255.aClass373_3;
			this.aClass113_Sub1Array3[this.anInt6996].method8460();
			this.method6276();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ri;II)V")
	private void method6173(@OriginalArg(0) Class303 arg0, @OriginalArg(2) int arg1) {
		this.method6215(this.anInterface6_10, 0);
		this.method6217(this.aClass90_19);
		this.method6266(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "(I)V")
	private void method6174() {
		this.anInterface6_12 = this.method6196(true);
		this.anInterface6_12.method4124(24, 12);
		this.aClass90_20 = this.method6154(new Class40[] { new Class40(Static420.aClass266_1) });
	}

	@OriginalMember(owner = "client!pj", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6997 == arg0 && this.anInt7003 == arg1 && this.anInt7006 == arg2) {
			return;
		}
		this.anInt7003 = arg1;
		this.anInt7006 = arg2;
		this.anInt6997 = arg0;
		this.method6164();
		this.method6210();
	}

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "()Z")
	@Override
	public final boolean method7311() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "(I)V")
	protected abstract void method6175();

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(Z)V")
	public final void method6176() {
		if (this.anInt7018 == 2) {
			return;
		}
		this.method6197();
		this.method6162(false);
		this.method6252(false);
		this.method6178(false);
		this.method6259(false);
		this.method6277(false, -2, false);
		this.anInt7018 = 2;
	}

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "(I)V")
	private void method6177() {
		this.aFloatArray54[14] = this.aFloat128;
		this.aFloatArray54[10] = this.aFloat131;
		this.aFloat122 = (this.aFloatArray54[14] - (float) this.anInt6985) / this.aFloatArray54[10];
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V")
	public final void method6178(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean492 != arg0) {
			this.aBoolean492 = arg0;
			this.method6249();
			this.anInt7018 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt7015;
		if (local11 || arg1 != this.aFloat127 || this.aFloat124 != arg2) {
			this.aFloat127 = arg1;
			this.aFloat124 = arg2;
			this.anInt7015 = arg0;
			if (local11) {
				this.aFloat119 = (float) (this.anInt7015 & 0xFF00) / 65280.0F;
				this.aFloat126 = (float) (this.anInt7015 & 0xFF0000) / 1.671168E7F;
				this.aFloat132 = (float) (this.anInt7015 & 0xFF) / 255.0F;
				this.method6228();
			}
			this.aNativeInterface3.setSunColour(this.aFloat126, this.aFloat119, this.aFloat132, arg1, arg2);
			this.method6245();
		}
		if (arg3 != this.aFloatArray55[0] || this.aFloatArray55[1] != arg4 || arg5 != this.aFloatArray55[2]) {
			this.aFloatArray55[1] = arg4;
			this.aFloatArray55[2] = arg5;
			this.aFloatArray55[0] = arg3;
			this.aFloatArray53[2] = -arg5;
			this.aFloatArray53[1] = -arg4;
			this.aFloatArray53[0] = -arg3;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray57[1] = arg4 * local149;
			this.aFloatArray57[2] = arg5 * local149;
			this.aFloatArray57[0] = arg3 * local149;
			this.aFloatArray50[1] = -this.aFloatArray57[1];
			this.aFloatArray50[0] = -this.aFloatArray57[0];
			this.aFloatArray50[2] = -this.aFloatArray57[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray57[0], this.aFloatArray57[1], this.aFloatArray57[2]);
			this.method6224();
			this.anInt6981 = (int) (arg3 * 256.0F / arg4);
			this.anInt7017 = (int) (arg5 * 256.0F / arg4);
		}
		this.method6219();
	}

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)Lclient!za;")
	@Override
	public final Class5_Sub6 method7300(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub6_Sub2 local8 = new Class5_Sub6_Sub2(arg0);
		this.aClass330_35.method7917(local8);
		return local8;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	@Override
	public void method7252(@OriginalArg(0) int arg0) {
		if (this.aClass334_3 != null) {
			this.aClass334_3.method7939();
		}
		this.anInt7009 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "(I)V")
	public final void method6179() {
		if (this.aClass242_5 == Static630.aClass242_7) {
			return;
		}
		@Pc(10) Class242 local10 = this.aClass242_5;
		this.aClass242_5 = Static630.aClass242_7;
		if (local10.method5447()) {
			this.method6168();
		}
		this.anInt7018 &= 0xFFFFFFE0;
		this.aFloatArray52 = this.aFloatArray58;
	}

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "(Z)Lclient!ga;")
	public final Class113_Sub1 method6180() {
		return this.aClass113_Sub1Array3[this.anInt6996];
	}

	@OriginalMember(owner = "client!pj", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7304(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZI[II)Lclient!rm;")
	public final Interface20 method6181(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		return this.method6269(0, arg0, 0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(IIIIII)Lclient!vm;")
	@Override
	public final Class130 method7318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class130_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "(Z)V")
	private void method6182() {
		if (this.aCanvas16 == null) {
			this.anInt6862 = this.anInt6914 = 1;
		} else {
			@Pc(20) Dimension local20 = this.aCanvas16.getSize();
			this.anInt6914 = local20.height;
			this.anInt6862 = local20.width;
		}
		this.anInt6881 = this.anInt6914;
		this.anInt6805 = this.anInt6862;
		this.method6240();
		this.method6241();
		this.method6186();
		this.method6152();
		this.method6246();
		this.method6179();
		this.la();
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "()Z")
	@Override
	public final boolean method7237() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "(I)Lclient!ga;")
	public final Class113_Sub1 method6183() {
		return this.aClass113_Sub1Array3[this.anInt6996];
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIZ)Lclient!it;")
	@Override
	public final Class28 method7258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class28_Sub3 local11 = new Class28_Sub3(this, arg2, arg3, arg4);
		local11.method4052(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
	protected abstract void method6184();

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(ZI)V")
	public final void method6185(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean496) {
			this.aBoolean496 = arg0;
			this.method6236();
		}
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(II)I")
	@Override
	public final int method7292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "(I)V")
	private void method6186() {
		this.aBoolean488 = false;
		this.method6156();
		if (this.aClass242_5 == Static384.aClass242_4) {
			this.method6161();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method7263() {
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(B)V")
	protected abstract void method6187();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)Lclient!oca;")
	protected Class27 method6188(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class27_Sub8(this);
		} else if (arg0 == 1) {
			return new Class27_Sub7(this);
		} else if (arg0 == 2) {
			return new Class27_Sub9(this, this.aClass250_5);
		} else if (arg0 == 7) {
			return new Class27_Sub1(this);
		} else {
			return new Class27_Sub3(this);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	protected abstract void method6189(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III[FZLclient!lw;)Lclient!rm;")
	public final Interface20 method6190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class223 arg4) {
		return this.method6274(arg2, arg0, arg3, arg4, arg1);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([I)V")
	@Override
	public final void method7248(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6881;
		arg0[0] = this.anInt6805;
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(B)V")
	protected void method6191() {
		this.method6226();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method7264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static600.method8611(this, arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(B)V")
	protected abstract void method6192();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method7235(@OriginalArg(0) Class5_Sub6 arg0) {
		this.aNativeHeap4 = ((Class5_Sub6_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer7 = this.aNativeHeap4.a(32768, false);
	}

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "(I)V")
	protected abstract void method6193();

	@OriginalMember(owner = "client!pj", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface20 local9 = local6.anInterface20_6;
		this.method6176();
		this.method6153(local9);
		this.method6208(1);
		this.method6239(Static481.aClass151_8, Static481.aClass151_8);
		this.method6211(Static105.aClass236_1, 0);
		this.method6160(arg0);
		this.aClass113_Sub1_15.method2456((float) this.anInt6881, 0.0F, (float) this.anInt6805);
		this.method6204();
		this.aClass113_Sub1Array3[0].method2456(local9.method4641((float) this.anInt6881), 1.0F, local9.method4640((float) this.anInt6805));
		this.aClass113_Sub1Array3[0].method2467(local9.method4641((float) -arg3), 0.0F, local9.method4640((float) -arg2));
		this.aClass373Array3[0] = Static337.aClass373_6;
		this.method6276();
		this.method6163();
		this.method6172();
		this.method6211(Static626.aClass236_6, 0);
	}

	@OriginalMember(owner = "client!pj", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7007 = arg1;
		this.anInt7008 = arg2;
		this.anInt7013 = arg3;
		this.anInt6980 = arg0;
		this.method6186();
		this.method6241();
		this.method6179();
		this.method6246();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILclient!oq;ILclient!ri;I)V")
	public abstract void method6194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class303 arg5);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method7307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BB)V")
	public final void method6195(@OriginalArg(0) byte arg0) {
		this.method6160(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!pj", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7304(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(ZI)Lclient!fb;")
	public abstract Interface6 method6196(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt7002;
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
	@Override
	public final void method7266() {
	}

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "(I)V")
	private void method6197() {
		if (this.aClass242_5 == Static146.aClass242_1) {
			return;
		}
		@Pc(18) Class242 local18 = this.aClass242_5;
		this.aClass242_5 = Static146.aClass242_1;
		if (local18.method5447()) {
			this.method6168();
		}
		this.method6158();
		this.aFloatArray52 = this.aFloatArray51;
		this.method6161();
		this.anInt7018 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!pj", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass113_Sub1_16.aFloat42 * (float) arg1 + this.aClass113_Sub1_16.aFloat43 * (float) arg0 + (float) arg2 * this.aClass113_Sub1_16.aFloat45 + this.aClass113_Sub1_16.aFloat47;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass113_Sub1_16.aFloat47 + this.aClass113_Sub1_16.aFloat45 * (float) arg5 + this.aClass113_Sub1_16.aFloat42 * (float) arg4 + (float) arg3 * this.aClass113_Sub1_16.aFloat43;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt7002 > local32 && local63 < (float) this.anInt7002) {
			local7 |= 0x10;
		} else if ((float) this.anInt6985 < local32 && local63 > (float) this.anInt6985) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass113_Sub1_16.aFloat39 * (float) arg0 + (float) arg1 * this.aClass113_Sub1_16.aFloat46 + this.aClass113_Sub1_16.aFloat38 * (float) arg2 + this.aClass113_Sub1_16.aFloat37) * (float) this.anInt7008 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt7008 * ((float) arg5 * this.aClass113_Sub1_16.aFloat38 + (float) arg4 * this.aClass113_Sub1_16.aFloat46 + (float) arg3 * this.aClass113_Sub1_16.aFloat39 + this.aClass113_Sub1_16.aFloat37) / local63);
		if (this.aFloat121 > (float) local135 && (float) local167 < this.aFloat121) {
			local7 |= 0x1;
		} else if (this.aFloat133 < (float) local135 && this.aFloat133 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass113_Sub1_16.aFloat36 + (float) arg2 * this.aClass113_Sub1_16.aFloat41 + (float) arg1 * this.aClass113_Sub1_16.aFloat44 + (float) arg0 * this.aClass113_Sub1_16.aFloat40) * (float) this.anInt7013 / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt7013 * (this.aClass113_Sub1_16.aFloat36 + this.aClass113_Sub1_16.aFloat40 * (float) arg3 + this.aClass113_Sub1_16.aFloat44 * (float) arg4 + (float) arg5 * this.aClass113_Sub1_16.aFloat41) / local63);
		if ((float) local233 < this.aFloat117 && this.aFloat117 > (float) local265) {
			local7 |= 0x4;
		} else if (this.aFloat118 < (float) local233 && this.aFloat118 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pj", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt6987 < arg0) {
			local5 = true;
			this.anInt6987 = arg0;
		}
		if (this.anInt6991 > arg2) {
			this.anInt6991 = arg2;
			local5 = true;
		}
		if (arg1 > this.anInt6994) {
			local5 = true;
			this.anInt6994 = arg1;
		}
		if (this.bf > arg3) {
			this.bf = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean497) {
			this.aBoolean497 = true;
			this.method6261();
		}
		this.method6234();
		this.method6246();
	}

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "(I)V")
	private void method6198() {
		this.aFloat123 = this.anInt6985;
	}

	@OriginalMember(owner = "client!pj", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt7019;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!b;IIII)Lclient!ka;")
	@Override
	public final Class187 method7256(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class187_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "(I)V")
	public final void method6199() {
		if (this.anInt7018 == 16) {
			return;
		}
		this.method6253();
		this.method6162(true);
		this.method6178(true);
		this.method6259(true);
		this.method6208(1);
		this.anInt7018 = 16;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ga;B)V")
	public final void method6200(@OriginalArg(0) Class113_Sub1 arg0) {
		this.aClass113_Sub1_15.method8456(arg0);
		this.aBoolean475 = false;
		this.method6264();
	}

	@OriginalMember(owner = "client!pj", name = "A", descriptor = "(I)V")
	protected abstract void method6201();

	@OriginalMember(owner = "client!pj", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean481 = false;
	}

	@OriginalMember(owner = "client!pj", name = "B", descriptor = "(I)I")
	public final int method6202() {
		return this.anInt6996;
	}

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "(I)V")
	protected abstract void method6203();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7273(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas15 == arg0) {
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
			@Pc(53) Object local53 = this.method6213(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable4.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "(B)V")
	public final void method6204() {
		this.aBoolean475 = false;
		this.method6264();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!gu;Z)Lclient!it;")
	@Override
	public final Class28 method7297(@OriginalArg(0) Class131 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(132) Class28 local132;
		if (arg0.anInt3344 == 0 || arg0.anInt3345 == 0) {
			local132 = this.method7261(new int[1], 1, 1, 1);
		} else {
			@Pc(21) int[] local21 = new int[arg0.anInt3345 * arg0.anInt3344];
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg0.aByteArray30 == null) {
				for (local30 = 0; local30 < arg0.anInt3345; local30++) {
					for (local34 = 0; local34 < arg0.anInt3344; local34++) {
						@Pc(92) int local92 = arg0.anIntArray186[arg0.aByteArray29[local23++] & 0xFF];
						local21[local25++] = local92 == 0 ? 0 : local92 | 0xFF000000;
					}
				}
			} else {
				for (local30 = 0; local30 < arg0.anInt3345; local30++) {
					for (local34 = 0; local34 < arg0.anInt3344; local34++) {
						local21[local25++] = arg0.anIntArray186[arg0.aByteArray29[local23] & 0xFF] | arg0.aByteArray30[local23] << 24;
						local23++;
					}
				}
			}
			local132 = this.method7261(local21, arg0.anInt3345, arg0.anInt3344, arg0.anInt3344);
		}
		local132.method4043(arg0.anInt3341, arg0.anInt3343, arg0.anInt3346, arg0.anInt3342);
		return local132;
	}

	@OriginalMember(owner = "client!pj", name = "D", descriptor = "(I)V")
	protected abstract void method6205();

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "(Z)V")
	private void method6206() {
		this.method6215(this.anInterface6_12, 0);
		this.method6217(this.aClass90_20);
		this.method6266(1, Static533.aClass303_5, 0);
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)V")
	public final void method6208(@OriginalArg(0) int arg0) {
		if (this.anInt6986 == arg0) {
			return;
		}
		@Pc(24) Class32 local24;
		@Pc(26) boolean local26;
		@Pc(22) boolean local22;
		if (arg0 == 1) {
			local22 = true;
			local24 = Static212.aClass32_3;
			local26 = true;
		} else if (arg0 == 2) {
			local24 = Static401.aClass32_6;
			local22 = false;
			local26 = true;
		} else if (arg0 == 128) {
			local22 = true;
			local26 = true;
			local24 = Static262.aClass32_4;
		} else {
			local26 = false;
			local24 = Static399.aClass32_5;
			local22 = false;
		}
		if (local22 != this.aBoolean490) {
			this.aBoolean490 = local22;
			this.method6238();
		}
		if (this.aBoolean489 != local26) {
			this.aBoolean489 = local26;
			this.method6232();
		}
		if (local24 != this.aClass32_7) {
			this.aClass32_7 = local24;
			this.method6229();
		}
		this.anInt6986 = arg0;
		this.anInt7018 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method7304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(37) float local37 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local10 * local10)));
			local10 *= local37;
			local16 *= local37;
		}
		if (!this.method6157((float) arg2 + local10, (float) arg0, (float) arg1, 0.0F, (float) arg3 + local16, 0.0F)) {
			return;
		}
		this.method6212();
		this.method6160(arg4);
		this.method6211(Static105.aClass236_1, 0);
		this.method6159(0, Static105.aClass236_1);
		this.method6208(arg5);
		this.method6285();
		this.method6260(false);
		this.method6206();
		this.method6260(true);
		this.method6159(0, Static626.aClass236_6);
		this.method6211(Static626.aClass236_6, 0);
	}

	@OriginalMember(owner = "client!pj", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6212();
		this.method6160(arg3);
		this.method6211(Static105.aClass236_1, 0);
		this.method6159(0, Static105.aClass236_1);
		this.method6208(arg4);
		this.aClass113_Sub1_15.method2456((float) arg2, 1.0F, (float) arg2);
		this.aClass113_Sub1_15.method8454(arg0, arg1, 0);
		this.method6204();
		this.method6260(false);
		this.method6215(this.anInterface6_11, 0);
		this.method6217(this.aClass90_17);
		this.method6266(256, Static538.aClass303_6, 0);
		this.method6260(true);
		this.method6159(0, Static626.aClass236_6);
		this.method6211(Static626.aClass236_6, 0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7291(@OriginalArg(0) Canvas arg0) {
		this.aCanvas16 = null;
		this.anObject16 = null;
		if (arg0 == null || arg0 == this.aCanvas15) {
			this.anObject16 = this.anObject17;
			this.aCanvas16 = this.aCanvas15;
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.anObject16 = this.aHashtable4.get(arg0);
			this.aCanvas16 = arg0;
		}
		if (this.aCanvas16 == null || this.anObject16 == null) {
			throw new RuntimeException();
		}
		this.method6189(this.anObject16, this.aCanvas16);
		this.method6182();
	}

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "(Z)V")
	protected abstract void method6209();

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "(Z)V")
	protected abstract void method6210();

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7283() {
		return false;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!mq;IB)V")
	public final void method6211(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1) {
		this.method6222(arg1, arg0, false, false);
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
	@Override
	public final void method7265(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pj", name = "E", descriptor = "(I)V")
	private void method6212() {
		if (this.anInt7018 == 1) {
			return;
		}
		this.method6197();
		this.method6162(false);
		this.method6252(false);
		this.method6178(false);
		this.method6259(false);
		this.method6277(false, -2, false);
		this.method6268(1);
		this.method6153(this.anInterface8_3);
		this.anInt7018 = 1;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	protected abstract Object method6213(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!pj", name = "F", descriptor = "(I)F")
	protected abstract float method6214();

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean482 = arg0;
		this.method6187();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!fb;II)V")
	public abstract void method6215(@OriginalArg(0) Interface6 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pj", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat129 != arg0) {
			this.aFloat129 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method6228();
			this.method6219();
		}
	}

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "(B)V")
	protected abstract void method6216();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!fk;)V")
	public abstract void method6217(@OriginalArg(1) Class90 arg0);

	@OriginalMember(owner = "client!pj", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6987;
		arg0[3] = this.bf;
		arg0[1] = this.anInt6994;
		arg0[2] = this.anInt6991;
	}

	@OriginalMember(owner = "client!pj", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt6969 + this.anInt6964 + this.anInt6972;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZLclient!qg;)V")
	public abstract void method6218(@OriginalArg(1) Class286 arg0);

	@OriginalMember(owner = "client!pj", name = "G", descriptor = "(I)V")
	protected abstract void method6219();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B[F)[F")
	public final float[] method6220(@OriginalArg(1) float[] arg0) {
		arg0[8] = this.aFloatArray52[2];
		arg0[12] = this.aFloatArray52[3];
		arg0[0] = this.aFloatArray52[0];
		arg0[4] = this.aFloatArray52[1];
		arg0[13] = this.aFloatArray52[7];
		arg0[5] = this.aFloatArray52[5];
		arg0[1] = this.aFloatArray52[4];
		arg0[9] = this.aFloatArray52[6];
		arg0[2] = this.aFloatArray52[8];
		arg0[6] = this.aFloatArray52[9];
		arg0[3] = this.aFloatArray52[12];
		arg0[10] = this.aFloatArray52[10];
		arg0[7] = this.aFloatArray52[13];
		arg0[14] = this.aFloatArray52[11];
		arg0[15] = this.aFloatArray52[15];
		arg0[11] = this.aFloatArray52[14];
		return arg0;
	}

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "(Z)V")
	public final void method6221() {
		if (this.anInt7018 == 8) {
			return;
		}
		this.method6227();
		this.method6162(true);
		this.method6178(true);
		this.method6259(true);
		this.method6208(1);
		this.anInt7018 = 8;
	}

	@OriginalMember(owner = "client!pj", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass113_Sub1_16.method2469((float) arg1, (float) arg2, (float) arg0);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt7008 * this.aClass113_Sub1_16.method2459((float) arg2, (float) arg1, (float) arg0) / local14);
			local25 = (int) ((float) this.anInt7013 * this.aClass113_Sub1_16.method2462((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local25 = this.anInt7007;
			local28 = this.anInt6980;
		}
		arg3[1] = (int) ((float) local25 - this.aFloat117);
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local28 - this.aFloat121);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!mq;ZZI)V")
	public abstract void method6222(@OriginalArg(0) int arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[Lclient!vt;)V")
	@Override
	public final void method7286(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub11[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass5_Sub11Array7[local3] = arg1[local3];
		}
		this.anInt6983 = arg0;
		if (this.aClass242_5.method5447()) {
			this.method6272();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method6223(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!pj", name = "H", descriptor = "(I)V")
	public abstract void method6224();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!we;)V")
	public final void method6225(@OriginalArg(1) Class373 arg0) {
		this.aClass373Array3[this.anInt6996] = arg0;
		this.method6276();
	}

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "()Lclient!tc;")
	@Override
	public final Class113 method7262() {
		return this.aClass113_Sub1_21;
	}

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "(B)V")
	private void method6226() {
		this.method6228();
		this.method6245();
		this.method6233();
		this.method6272();
		this.method6224();
		this.method6219();
		this.method6236();
		this.method6249();
		this.method6187();
		this.method6210();
		this.method6205();
		this.method6232();
		this.method6229();
		this.method6238();
		for (@Pc(52) int local52 = this.anInt6988 - 1; local52 >= 0; local52--) {
			this.method6271(local52);
			this.method6279();
			this.method6175();
			this.method6172();
		}
		this.method6209();
		this.method6152();
		this.method6203();
		this.method6184();
		this.method6193();
	}

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "(Z)V")
	private void method6227() {
		if (this.aClass242_5 == Static484.aClass242_6) {
			return;
		}
		@Pc(22) Class242 local22 = this.aClass242_5;
		this.aClass242_5 = Static484.aClass242_6;
		if (!local22.method5447()) {
			this.method6168();
		}
		this.method6247();
		this.aFloatArray52 = this.aFloatArray54;
		this.method6161();
		this.anInt7018 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "(B)V")
	protected abstract void method6228();

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "(I)V")
	protected abstract void method6229();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method7238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILclient!lw;I[BIIZ)Lclient!rm;")
	protected abstract Interface20 method6230(@OriginalArg(2) Class223 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean arg4);

	@OriginalMember(owner = "client!pj", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7004 = arg3;
		this.anInt7014 = arg0;
		this.aBoolean481 = true;
		this.anInt6989 = arg2;
		this.anInt7010 = arg1;
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(II)I")
	@Override
	public final int method7296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!pj", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass113_Sub1_16.method2469((float) arg1, (float) arg2, (float) arg0);
		if (local14 < (float) this.anInt7002 || local14 > (float) this.anInt6985) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt7008 * this.aClass113_Sub1_16.method2459((float) arg2, (float) arg1, (float) arg0) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt7013 * this.aClass113_Sub1_16.method2462((float) arg1, (float) arg0, (float) arg2) / (float) arg3);
		arg4[0] = (int) ((float) local58 - this.aFloat121);
		arg4[2] = (int) local14;
		arg4[1] = (int) ((float) local77 - this.aFloat117);
	}

	@OriginalMember(owner = "client!pj", name = "J", descriptor = "(I)V")
	public final void method6231() {
		this.aClass151Array5 = new Class151[this.anInt6988];
		this.anInterface8Array3 = new Interface8[this.anInt6988];
		this.aClass373Array3 = new Class373[this.anInt6988];
		this.aClass113_Sub1Array3 = new Class113_Sub1[this.anInt6988];
		this.aClass151Array6 = new Class151[this.anInt6988];
		for (@Pc(30) int local30 = 0; local30 < this.anInt6988; local30++) {
			this.aClass151Array5[local30] = Static524.aClass151_11;
			this.aClass151Array6[local30] = Static524.aClass151_11;
			this.aClass373Array3[local30] = Static255.aClass373_3;
			this.aClass113_Sub1Array3[local30] = new Class113_Sub1();
		}
		this.aClass5_Sub11Array7 = new Class5_Sub11[this.anInt6984 - 2];
		this.anInterface8_3 = this.method6275(Static576.aClass223_16, 1, Static20.aClass19_4, 1);
		this.method7235(new Class5_Sub6_Sub2(262144));
		this.aClass90_21 = this.method6154(new Class40[] { new Class40(new Class266[] { Static420.aClass266_1, Static420.aClass266_5 }) });
		this.aClass90_15 = this.method6154(new Class40[] { new Class40(new Class266[] { Static420.aClass266_1, Static420.aClass266_3 }) });
		this.aClass90_16 = this.method6154(new Class40[] { new Class40(Static420.aClass266_1), new Class40(Static420.aClass266_3), new Class40(Static420.aClass266_5), new Class40(Static420.aClass266_2) });
		this.aClass90_18 = this.method6154(new Class40[] { new Class40(Static420.aClass266_1), new Class40(Static420.aClass266_3), new Class40(Static420.aClass266_5) });
		this.aClass187_Sub2_28 = new Class187_Sub2(this, 0, 0, false, false);
		this.aClass187_Sub2_29 = new Class187_Sub2(this, 0, 0, true, true);
		this.aClass187_Sub2_23 = new Class187_Sub2(this, 0, 0, false, false);
		this.aClass187_Sub2_21 = new Class187_Sub2(this, 0, 0, true, true);
		this.aClass187_Sub2_27 = new Class187_Sub2(this, 0, 0, false, false);
		this.aClass187_Sub2_22 = new Class187_Sub2(this, 0, 0, true, true);
		this.aClass187_Sub2_30 = new Class187_Sub2(this, 0, 0, false, false);
		this.aClass187_Sub2_26 = new Class187_Sub2(this, 0, 0, true, true);
		this.aClass187_Sub2_25 = new Class187_Sub2(this, 0, 0, false, false);
		this.aClass187_Sub2_24 = new Class187_Sub2(this, 0, 0, true, true);
		this.aClass341_3 = new Class341(this);
		this.anInterface14_6 = this.method6281(true);
		this.method6250();
		this.aClass250_5 = new Class250(this);
		this.aClass27Array3[1] = this.method6188(1);
		this.aClass27Array3[2] = this.method6188(2);
		this.aClass27Array3[4] = this.method6188(4);
		this.aClass27Array3[5] = this.method6188(5);
		this.aClass27Array3[6] = this.method6188(6);
		this.aClass27Array3[7] = this.method6188(7);
		this.aClass27Array3[3] = this.method6188(3);
		this.aClass27Array3[8] = this.method6188(8);
		this.aClass27Array3[9] = this.method6188(9);
		if (!this.aClass27Array3[2].method8891()) {
			this.aClass27Array3[2] = this.method6188(0);
		}
		if (!this.aClass27Array3[4].method8891()) {
			this.aClass27Array3[4] = this.aClass27Array3[2];
		}
		if (!this.aClass27Array3[8].method8891()) {
			this.aClass27Array3[8] = this.aClass27Array3[4];
		}
		if (!this.aClass27Array3[9].method8891()) {
			this.aClass27Array3[9] = this.aClass27Array3[8];
		}
		this.method6191();
		this.la();
		this.method7247();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method7260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(17) float local17 = (float) arg3 - (float) arg1;
		@Pc(42) float local42;
		if (local11 == 0.0F && local17 == 0.0F) {
			local11 = 1.0F;
		} else {
			local42 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local11 * local11)));
			local11 *= local42;
			local17 *= local42;
		}
		this.method6212();
		this.method6160(arg4);
		this.method6211(Static105.aClass236_1, 0);
		this.method6159(0, Static105.aClass236_1);
		this.method6208(1);
		this.method6285();
		this.method6260(false);
		@Pc(84) int local84 = arg7 % (arg5 + arg6);
		local42 = local11 * (float) arg5;
		@Pc(94) float local94 = local17 * (float) arg5;
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = local42;
		@Pc(102) float local102 = local94;
		if (local84 > arg5) {
			local98 = (float) (arg5 + arg6 - local84) * local17;
			local96 = (float) (arg5 + arg6 - local84) * local11;
		} else {
			local100 = (float) (arg5 - local84) * local11;
			local102 = (float) (arg5 - local84) * local17;
		}
		@Pc(153) float local153 = local96 + (float) arg0;
		@Pc(158) float local158 = local98 + (float) arg1;
		@Pc(163) float local163 = local11 * (float) arg6;
		@Pc(168) float local168 = (float) arg6 * local17;
		while (true) {
			if (arg2 <= arg0) {
				if (local153 < (float) arg2) {
					break;
				}
				if ((float) arg2 > local153 + local100) {
					local100 = (float) arg2 - local153;
				}
			} else {
				if ((float) arg2 < local153) {
					break;
				}
				if (local153 + local100 > (float) arg2) {
					local100 = (float) arg2 - local153;
				}
			}
			if (arg3 > arg1) {
				if (local158 > (float) arg3) {
					break;
				}
				if (local102 + local158 > (float) arg3) {
					local102 = (float) arg3 - local158;
				}
			} else {
				if ((float) arg3 > local158) {
					break;
				}
				if ((float) arg3 > local102 + local158) {
					local102 = (float) arg3 - local158;
				}
			}
			if (!this.method6157(local153 + local100, local153, local158, 0.0F, local102 + local158, 0.0F)) {
				return;
			}
			this.method6206();
			local153 += local163 + local100;
			local158 += local168 + local102;
			local100 = local42;
			local102 = local94;
		}
		this.method6260(true);
		this.method6159(0, Static626.aClass236_6);
		this.method6211(Static626.aClass236_6, 0);
	}

	@OriginalMember(owner = "client!pj", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean481) {
			throw new RuntimeException("");
		}
		this.anInt7004 = arg3;
		this.anInt7010 = arg1;
		this.anInt6989 = arg2;
		this.anInt7014 = arg0;
		if (this.aBoolean485) {
			this.aClass27Array3[3].method8892();
			this.aClass27Array3[3].method8893();
		}
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "()I")
	@Override
	public final int method7245() {
		return this.anInt6984 - 2;
	}

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "(B)V")
	protected abstract void method6232();

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "(B)V")
	protected abstract void method6233();

	@OriginalMember(owner = "client!pj", name = "K", descriptor = "(I)V")
	protected abstract void method6234();

	@OriginalMember(owner = "client!pj", name = "L", descriptor = "(I)I")
	public final int method6235() {
		return this.anInt7014;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7276(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas15 == arg0) {
			local5 = this.anObject16;
		} else if (this.aHashtable4.containsKey(arg0)) {
			local5 = this.aHashtable4.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method6223(local5, arg0);
		if (this.aCanvas16 == arg0) {
			this.method6182();
		}
	}

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "(B)V")
	protected abstract void method6236();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([[IBIZ)Lclient!qn;")
	public abstract Interface18 method6237(@OriginalArg(0) int[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!pj", name = "M", descriptor = "(I)V")
	protected abstract void method6238();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ht;Lclient!ht;B)V")
	public final void method6239(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class151 arg1) {
		@Pc(5) boolean local5 = false;
		if (this.aClass151Array6[this.anInt6996] != arg0) {
			this.aClass151Array6[this.anInt6996] = arg0;
			this.method6279();
			local5 = true;
		}
		if (arg1 != this.aClass151Array5[this.anInt6996]) {
			this.aClass151Array5[this.anInt6996] = arg1;
			this.method6175();
			local5 = true;
		}
		if (local5) {
			this.anInt7018 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!pj", name = "N", descriptor = "(I)V")
	private void method6240() {
		this.aBoolean495 = false;
		if (Static146.aClass242_1 == this.aClass242_5) {
			this.method6158();
			this.method6161();
		}
	}

	@OriginalMember(owner = "client!pj", name = "O", descriptor = "(I)V")
	private void method6241() {
		this.aBoolean494 = false;
		this.method6247();
		if (this.aClass242_5 == Static484.aClass242_6) {
			this.method6161();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method6242(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!mq;ZII)V")
	protected abstract void method6243(@OriginalArg(0) Class236 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7240() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(ZB)V")
	public final void method6244(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean491 != arg0) {
			this.aBoolean491 = arg0;
			this.method6210();
		}
	}

	@OriginalMember(owner = "client!pj", name = "P", descriptor = "(I)V")
	protected abstract void method6245();

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "(B)V")
	private void method6246() {
		this.aFloat121 = this.anInt6987 - this.anInt6980;
		this.aFloat118 = this.bf - this.anInt7007;
		this.aFloat117 = this.anInt6994 - this.anInt7007;
		this.aFloat133 = this.anInt6991 - this.anInt6980;
	}

	@OriginalMember(owner = "client!pj", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.bf = this.anInt6881;
		this.anInt6994 = 0;
		this.anInt6991 = this.anInt6805;
		this.anInt6987 = 0;
		if (this.aBoolean497) {
			this.aBoolean497 = false;
			this.method6261();
		}
		this.method6246();
	}

	@OriginalMember(owner = "client!pj", name = "Q", descriptor = "(I)V")
	private void method6247() {
		if (this.aBoolean494) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray54;
		@Pc(17) float local17 = (float) (this.anInt7002 * -this.anInt6980) / (float) this.anInt7008;
		@Pc(31) float local31 = (float) (this.anInt7002 * (this.anInt6805 - this.anInt6980)) / (float) this.anInt7008;
		@Pc(42) float local42 = (float) (this.anInt7007 * this.anInt7002) / (float) this.anInt7013;
		@Pc(57) float local57 = (float) ((this.anInt7007 - this.anInt6881) * this.anInt7002) / (float) this.anInt7013;
		if (local17 == local31 || local57 == local42) {
			local5[8] = 0.0F;
			local5[12] = 0.0F;
			local5[9] = 0.0F;
			local5[6] = 0.0F;
			local5[3] = 0.0F;
			local5[11] = 0.0F;
			local5[7] = 0.0F;
			local5[4] = 0.0F;
			local5[5] = 1.0F;
			local5[10] = 1.0F;
			local5[15] = 1.0F;
			local5[14] = 0.0F;
			local5[0] = 1.0F;
			local5[1] = 0.0F;
			local5[2] = 0.0F;
			local5[13] = 0.0F;
		} else {
			@Pc(71) float local71 = (float) this.anInt7002 * 2.0F;
			local5[10] = this.aFloat131 = (float) this.anInt6985 / (float) (this.anInt7002 - this.anInt6985);
			local5[2] = 0.0F;
			local5[15] = 0.0F;
			local5[14] = this.aFloat128 = (float) (this.anInt7002 * this.anInt6985) / (float) (this.anInt7002 - this.anInt6985);
			local5[11] = -1.0F;
			local5[1] = 0.0F;
			local5[3] = 0.0F;
			local5[12] = 0.0F;
			local5[7] = 0.0F;
			local5[5] = local71 / (local42 - local57);
			local5[4] = 0.0F;
			local5[8] = (local17 + local31) / (local31 - local17);
			local5[0] = local71 / (local31 - local17);
			local5[9] = (local42 + local57) / (local42 - local57);
			local5[6] = 0.0F;
			local5[13] = 0.0F;
		}
		this.method6177();
		this.aBoolean494 = true;
	}

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "(I)I")
	public final int method6248() {
		return this.anInt7010;
	}

	@OriginalMember(owner = "client!pj", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt6985;
	}

	@OriginalMember(owner = "client!pj", name = "S", descriptor = "(I)V")
	protected abstract void method6249();

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7241() {
		return false;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!mp;I)V")
	@Override
	public final void method7302(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1) {
		this.aClass341_3.method8063(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "()Z")
	@Override
	public final boolean method7315() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "(B)V")
	protected final void method6250() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable4 != null && !this.aHashtable4.isEmpty()) {
			@Pc(28) Enumeration local28 = this.aHashtable4.keys();
			while (local28.hasMoreElements()) {
				@Pc(34) Canvas local34 = (Canvas) local28.nextElement();
				local9.put(local34, this.method6213(local34));
			}
		}
		this.aHashtable4 = local9;
		this.method6170();
		this.method6174();
		this.method6169();
		this.aClass341_3.method8064(this);
	}

	@OriginalMember(owner = "client!pj", name = "T", descriptor = "(I)I")
	public final int method6251() {
		return this.anInt6989;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
	public final void method6252(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean479) {
			this.aBoolean479 = arg0;
			this.method6233();
			this.anInt7018 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pj", name = "U", descriptor = "(I)V")
	private void method6253() {
		if (Static384.aClass242_4 == this.aClass242_5) {
			return;
		}
		@Pc(14) Class242 local14 = this.aClass242_5;
		this.aClass242_5 = Static384.aClass242_4;
		if (!local14.method5447()) {
			this.method6168();
		}
		this.method6156();
		this.aFloatArray52 = this.aFloatArray56;
		this.method6161();
		this.anInt7018 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(FB)V")
	public final void method6254(@OriginalArg(0) float arg0) {
		if (this.aFloat120 != arg0) {
			this.aFloat120 = arg0;
			this.method6186();
		}
	}

	@OriginalMember(owner = "client!pj", name = "V", descriptor = "(I)V")
	public final void method6255() {
		this.method6179();
		this.method6161();
	}

	@OriginalMember(owner = "client!pj", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!pj", name = "W", descriptor = "(I)Lclient!qn;")
	public final Interface18 method6256() {
		return this.aClass130_Sub1_3 == null ? null : this.aClass130_Sub1_3.method8679();
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7303(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas15) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.method6278(arg0, this.aHashtable4.get(arg0));
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([BIZLclient!lw;II)Lclient!rm;")
	public final Interface20 method6257(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class223 arg3, @OriginalArg(4) int arg4) {
		return this.method6230(arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7317() {
		return false;
	}

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "(B)V")
	protected final void method6258() {
		@Pc(9) Enumeration local9 = this.aHashtable4.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method6278(local15, this.aHashtable4.get(local15));
		}
		this.anInterface6_10.method6765();
		this.anInterface6_12.method6765();
		this.anInterface6_11.method6765();
		this.aClass187_Sub2_29.method4960();
		this.aClass187_Sub2_21.method4960();
		this.aClass187_Sub2_22.method4960();
		this.aClass187_Sub2_26.method4960();
		this.aClass187_Sub2_24.method4960();
		this.aClass341_3.method8058();
		this.anInterface14_6.method6765();
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IZ)V")
	public final void method6259(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean483) {
			this.aBoolean483 = arg0;
			this.method6187();
			this.anInt7018 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt7012 = 0;
		while (arg0 > 1) {
			this.anInt7012++;
			arg0 >>= 0x1;
		}
		this.anInt7001 = 0x1 << this.anInt7012;
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(IZ)V")
	public abstract void method6260(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!pj", name = "Y", descriptor = "(I)V")
	protected abstract void method6261();

	@OriginalMember(owner = "client!pj", name = "Z", descriptor = "(I)Lclient!ga;")
	public final Class113_Sub1 method6262() {
		if (!this.aBoolean480) {
			this.aClass113_Sub1_20.method2472(this.aClass113_Sub1_18, this.aClass113_Sub1_15);
			this.aBoolean480 = true;
		}
		return this.aClass113_Sub1_20;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!al;Lclient!lw;)Z")
	public abstract boolean method6263(@OriginalArg(1) Class19 arg0, @OriginalArg(2) Class223 arg1);

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "()Z")
	@Override
	public final boolean method7254() {
		return this.aClass27Array3[3].method8891();
	}

	@OriginalMember(owner = "client!pj", name = "ab", descriptor = "(I)V")
	private void method6264() {
		if (Static146.aClass242_1 == this.aClass242_5) {
			@Pc(7) float local7 = this.method6214();
			this.aClass113_Sub1_15.method2467(local7, 0.0F, local7);
		}
		this.aBoolean480 = false;
		this.method6184();
		if (this.aClass27_3 != null) {
			this.aClass27_3.method8903();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZZBII)V")
	private void method6265(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) boolean local14 = arg2 & this.method7254();
		if (!local14 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			arg0 = 2;
			arg4 = 1;
			arg3 = 0;
		}
		if (arg0 != 0 && arg1) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt7005 != arg0) {
			if (this.anInt7005 != 0) {
				this.aClass27Array3[Integer.MAX_VALUE & this.anInt7005].method8895();
			}
			if (arg0 == 0) {
				this.aClass27_3 = null;
			} else {
				this.aClass27_3 = this.aClass27Array3[Integer.MAX_VALUE & arg0];
				this.aClass27_3.method8894(arg1);
				this.aClass27_3.method8898(arg1);
				this.aClass27_3.method8890(arg3, arg4);
			}
			this.anInt6993 = arg3;
			this.anInt6999 = arg4;
			this.anInt7005 = arg0;
		} else if (this.anInt7005 != 0) {
			this.aClass27Array3[this.anInt7005 & Integer.MAX_VALUE].method8898(arg1);
			if (arg3 != this.anInt6993 || arg4 != this.anInt6999) {
				this.aClass27Array3[Integer.MAX_VALUE & this.anInt7005].method8890(arg3, arg4);
				this.anInt6999 = arg4;
				this.anInt6993 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!ri;ZI)V")
	public abstract void method6266(@OriginalArg(0) int arg0, @OriginalArg(1) Class303 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!pj", name = "bb", descriptor = "(I)Lclient!ga;")
	public final Class113_Sub1 method6267() {
		return this.aClass113_Sub1_18;
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(IB)V")
	public final void method6268(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6239(Static481.aClass151_8, Static481.aClass151_8);
		} else if (arg0 == 0) {
			this.method6239(Static524.aClass151_11, Static524.aClass151_11);
		} else if (arg0 == 2) {
			this.method6239(Static132.aClass151_7, Static481.aClass151_8);
		} else if (arg0 == 3) {
			this.method6239(Static81.aClass151_2, Static524.aClass151_11);
		} else if (arg0 == 4) {
			this.method6239(Static1.aClass151_10, Static1.aClass151_10);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZ)Lclient!it;")
	@Override
	public final Class28 method7290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class28_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III[IIIZ)Lclient!rm;")
	public abstract Interface20 method6269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([BBLclient!lw;III)Lclient!uc;")
	public abstract Interface23 method6270(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class223 arg1);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIF)Lclient!vt;")
	@Override
	public final Class5_Sub11 method7293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub11_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pj", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6212();
		this.method6160(arg4);
		this.method6211(Static105.aClass236_1, 0);
		this.method6159(0, Static105.aClass236_1);
		this.method6208(arg5);
		this.aClass113_Sub1_15.method2456((float) arg3, 1.0F, (float) arg2);
		this.aClass113_Sub1_15.method8454(arg0, arg1, 0);
		this.method6204();
		this.method6260(false);
		this.method6163();
		this.method6260(true);
		this.method6159(0, Static626.aClass236_6);
		this.method6211(Static626.aClass236_6, 0);
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(IB)V")
	public final void method6271(@OriginalArg(0) int arg0) {
		if (this.anInt6996 != arg0) {
			this.anInt6996 = arg0;
			this.method6216();
		}
	}

	@OriginalMember(owner = "client!pj", name = "cb", descriptor = "(I)V")
	protected void method6272() {
		this.anInt6992 = this.anInt6983;
		this.anInt6983 = 0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZZ)V")
	public final void method6273(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean486) {
			this.aBoolean486 = arg0;
			this.method6233();
		}
	}

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "()Lclient!tc;")
	@Override
	public final Class113 method7275() {
		return new Class113_Sub1();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([FIZILclient!lw;III)Lclient!rm;")
	protected abstract Interface20 method6274(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class223 arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass113_Sub1_16.aFloat47 + this.aClass113_Sub1_16.aFloat43 * (float) arg0 + (float) arg1 * this.aClass113_Sub1_16.aFloat42 + (float) arg2 * this.aClass113_Sub1_16.aFloat45;
		@Pc(57) float local57 = (float) arg5 * this.aClass113_Sub1_16.aFloat45 + this.aClass113_Sub1_16.aFloat42 * (float) arg4 + (float) arg3 * this.aClass113_Sub1_16.aFloat43 + this.aClass113_Sub1_16.aFloat47;
		if ((float) this.anInt7002 > local32 && (float) this.anInt7002 > local57) {
			local7 |= 0x10;
		} else if ((float) this.anInt6985 < local32 && (float) this.anInt6985 < local57) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass113_Sub1_16.aFloat37 + (float) arg1 * this.aClass113_Sub1_16.aFloat46 + (float) arg0 * this.aClass113_Sub1_16.aFloat39 + this.aClass113_Sub1_16.aFloat38 * (float) arg2) * (float) this.anInt7008 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt7008 * (this.aClass113_Sub1_16.aFloat37 + (float) arg5 * this.aClass113_Sub1_16.aFloat38 + (float) arg4 * this.aClass113_Sub1_16.aFloat46 + (float) arg3 * this.aClass113_Sub1_16.aFloat39) / (float) arg6);
		if (this.aFloat121 > (float) local124 && (float) local157 < this.aFloat121) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat133 && (float) local157 > this.aFloat133) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt7013 * ((float) arg0 * this.aClass113_Sub1_16.aFloat40 + (float) arg1 * this.aClass113_Sub1_16.aFloat44 + (float) arg2 * this.aClass113_Sub1_16.aFloat41 + this.aClass113_Sub1_16.aFloat36) / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt7013 * (this.aClass113_Sub1_16.aFloat44 * (float) arg4 + this.aClass113_Sub1_16.aFloat40 * (float) arg3 + this.aClass113_Sub1_16.aFloat41 * (float) arg5 + this.aClass113_Sub1_16.aFloat36) / (float) arg6);
		if ((float) local224 < this.aFloat117 && (float) local257 < this.aFloat117) {
			local7 |= 0x4;
		} else if ((float) local224 > this.aFloat118 && this.aFloat118 < (float) local257) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!lw;IILclient!al;I)Lclient!rm;")
	public abstract Interface20 method6275(@OriginalArg(0) Class223 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "(B)V")
	private void method6276() {
		this.method6192();
		if (this.aClass27_3 != null) {
			this.aClass27_3.method8902();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class61 method7277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class61_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!mp;)V")
	@Override
	public final void method7308(@OriginalArg(0) Class235 arg0) {
		this.aClass341_3.method8063(this, -1, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIIZ)V")
	public final void method6277(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt7016 || this.aBoolean481 != this.aBoolean485) {
			@Pc(24) Interface20 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean481 ? 3 : 0;
			if (arg1 < 0) {
				this.method6172();
			} else {
				local24 = this.aClass334_3.method7944(arg1);
				@Pc(59) Class145 local59 = super.anInterface3_12.method4656(arg1);
				if (local59.aByte62 == 0 && local59.aByte65 == 0) {
					this.method6172();
				} else {
					@Pc(80) int local80 = local59.aBoolean293 ? 64 : 128;
					@Pc(84) int local84 = local80 * 50;
					@Pc(90) Class113_Sub1 local90 = this.method6183();
					local90.method2458((float) (local59.aByte62 * (this.anInt7009 % local84)) / (float) local84, (float) (this.anInt7009 % local84 * local59.aByte65) / (float) local84, 0.0F);
					this.method6225(Static337.aClass373_6);
				}
				if (!this.aBoolean481) {
					local28 = local59.aByte64;
					local30 = local59.anInt3991;
					local37 = local59.aByte68;
				}
				local26 = local59.anInt3990;
			}
			this.method6265(local37, arg2, arg0, local28, local30);
			if (this.aClass27_3 == null) {
				this.method6153(local24);
				this.method6268(local26);
			} else {
				this.aClass27_3.method8901(local26, local24);
			}
			this.aBoolean485 = this.aBoolean481;
			this.anInt7016 = arg1;
		}
		this.anInt7018 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method6278(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	@Override
	public final void method7242(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!pia;[Lclient!gu;Z)Lclient!da;")
	@Override
	public final Class55 method7255(@OriginalArg(0) Class272 arg0, @OriginalArg(1) Class131[] arg1) {
		return new Class55_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!pj", name = "db", descriptor = "(I)V")
	protected abstract void method6279();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method6280(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap4.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "()V")
	@Override
	public final void method7298() {
		if (this.aClass334_3 != null) {
			this.aClass334_3.method7941();
		}
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(IZ)Lclient!oq;")
	public abstract Interface14 method6281(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "(B)I")
	public final int method6282() {
		return this.anInt7004;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!lw;Lclient!al;)Z")
	public abstract boolean method6283(@OriginalArg(1) Class223 arg0, @OriginalArg(2) Class19 arg1);

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "(B)Lclient!ga;")
	public final Class113_Sub1 method6284() {
		return this.aClass113_Sub1_15;
	}

	@OriginalMember(owner = "client!pj", name = "eb", descriptor = "(I)V")
	public final void method6285() {
		this.aClass113_Sub1_15.method8460();
		this.aBoolean475 = true;
		this.method6264();
	}
}
