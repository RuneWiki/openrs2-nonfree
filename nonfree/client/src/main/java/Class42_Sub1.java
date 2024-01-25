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

@OriginalClass("client!wr")
public abstract class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!wr", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!wr", name = "gd", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!wr", name = "qd", descriptor = "Lclient!paa;")
	protected Class236 aClass236_5;

	@OriginalMember(owner = "client!wr", name = "Gd", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!wr", name = "Ld", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable10;

	@OriginalMember(owner = "client!wr", name = "Rd", descriptor = "I")
	public int anInt7093;

	@OriginalMember(owner = "client!wr", name = "Sd", descriptor = "I")
	protected int anInt7094;

	@OriginalMember(owner = "client!wr", name = "Ud", descriptor = "I")
	public int anInt7096;

	@OriginalMember(owner = "client!wr", name = "fe", descriptor = "I")
	public int anInt7100;

	@OriginalMember(owner = "client!wr", name = "he", descriptor = "I")
	protected int anInt7101;

	@OriginalMember(owner = "client!wr", name = "ie", descriptor = "I")
	private int anInt7102;

	@OriginalMember(owner = "client!wr", name = "ke", descriptor = "Z")
	protected boolean aBoolean500;

	@OriginalMember(owner = "client!wr", name = "me", descriptor = "Z")
	public boolean aBoolean501;

	@OriginalMember(owner = "client!wr", name = "oe", descriptor = "Lclient!iq;")
	private Class124_Sub2 aClass124_Sub2_3;

	@OriginalMember(owner = "client!wr", name = "pe", descriptor = "[Lclient!rh;")
	protected Class12_Sub7[] aClass12_Sub7Array4;

	@OriginalMember(owner = "client!wr", name = "qe", descriptor = "I")
	public int anInt7105;

	@OriginalMember(owner = "client!wr", name = "te", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!wr", name = "we", descriptor = "Lclient!baa;")
	public Interface3 anInterface3_3;

	@OriginalMember(owner = "client!wr", name = "ye", descriptor = "I")
	private int anInt7110;

	@OriginalMember(owner = "client!wr", name = "Ae", descriptor = "Z")
	public boolean aBoolean502;

	@OriginalMember(owner = "client!wr", name = "Be", descriptor = "[Lclient!hf;")
	protected Class129[] aClass129Array5;

	@OriginalMember(owner = "client!wr", name = "Je", descriptor = "I")
	public int anInt7117;

	@OriginalMember(owner = "client!wr", name = "Qe", descriptor = "F")
	private float aFloat155;

	@OriginalMember(owner = "client!wr", name = "Te", descriptor = "F")
	private float aFloat156;

	@OriginalMember(owner = "client!wr", name = "Ze", descriptor = "[Lclient!hf;")
	protected Class129[] aClass129Array6;

	@OriginalMember(owner = "client!wr", name = "hf", descriptor = "Lclient!qo;")
	private Class255 aClass255_3;

	@OriginalMember(owner = "client!wr", name = "jf", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!wr", name = "kf", descriptor = "Z")
	public boolean aBoolean508;

	@OriginalMember(owner = "client!wr", name = "mf", descriptor = "F")
	private float aFloat160;

	@OriginalMember(owner = "client!wr", name = "of", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!wr", name = "pf", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!wr", name = "vf", descriptor = "I")
	public int anInt7129;

	@OriginalMember(owner = "client!wr", name = "Af", descriptor = "[Lclient!baa;")
	private Interface3[] anInterface3Array3;

	@OriginalMember(owner = "client!wr", name = "Bf", descriptor = "Z")
	protected boolean aBoolean511;

	@OriginalMember(owner = "client!wr", name = "Ff", descriptor = "I")
	protected int anInt7134;

	@OriginalMember(owner = "client!wr", name = "Kf", descriptor = "I")
	protected int anInt7135;

	@OriginalMember(owner = "client!wr", name = "Mf", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!wr", name = "Of", descriptor = "Lclient!cj;")
	private Class21 aClass21_3;

	@OriginalMember(owner = "client!wr", name = "Pf", descriptor = "[Lclient!og;")
	protected Class91_Sub2[] aClass91_Sub2Array3;

	@OriginalMember(owner = "client!wr", name = "Zf", descriptor = "[Lclient!vaa;")
	protected Class299[] aClass299Array3;

	@OriginalMember(owner = "client!wr", name = "ag", descriptor = "I")
	protected int anInt7139;

	@OriginalMember(owner = "client!wr", name = "bg", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!wr", name = "cg", descriptor = "Lclient!i;")
	public Class26_Sub2 aClass26_Sub2_21;

	@OriginalMember(owner = "client!wr", name = "dg", descriptor = "Lclient!uj;")
	private Interface18 anInterface18_7;

	@OriginalMember(owner = "client!wr", name = "eg", descriptor = "Lclient!i;")
	public Class26_Sub2 aClass26_Sub2_22;

	@OriginalMember(owner = "client!wr", name = "fg", descriptor = "Lclient!i;")
	public Class26_Sub2 aClass26_Sub2_23;

	@OriginalMember(owner = "client!wr", name = "gg", descriptor = "Lclient!tq;")
	public Class287 aClass287_13;

	@OriginalMember(owner = "client!wr", name = "hg", descriptor = "Lclient!i;")
	public Class26_Sub2 aClass26_Sub2_24;

	@OriginalMember(owner = "client!wr", name = "ig", descriptor = "Lclient!i;")
	public Class26_Sub2 aClass26_Sub2_25;

	@OriginalMember(owner = "client!wr", name = "kg", descriptor = "Lclient!i;")
	public Class26_Sub2 aClass26_Sub2_26;

	@OriginalMember(owner = "client!wr", name = "lg", descriptor = "Lclient!i;")
	public Class26_Sub2 aClass26_Sub2_27;

	@OriginalMember(owner = "client!wr", name = "mg", descriptor = "Lclient!tq;")
	public Class287 aClass287_14;

	@OriginalMember(owner = "client!wr", name = "ng", descriptor = "Lclient!i;")
	public Class26_Sub2 aClass26_Sub2_28;

	@OriginalMember(owner = "client!wr", name = "og", descriptor = "Lclient!lu;")
	private Interface10 anInterface10_7;

	@OriginalMember(owner = "client!wr", name = "pg", descriptor = "Lclient!i;")
	public Class26_Sub2 aClass26_Sub2_29;

	@OriginalMember(owner = "client!wr", name = "qg", descriptor = "Lclient!tq;")
	public Class287 aClass287_15;

	@OriginalMember(owner = "client!wr", name = "rg", descriptor = "Lclient!lu;")
	private Interface10 anInterface10_8;

	@OriginalMember(owner = "client!wr", name = "sg", descriptor = "Lclient!tq;")
	private Class287 aClass287_16;

	@OriginalMember(owner = "client!wr", name = "tg", descriptor = "Lclient!i;")
	public Class26_Sub2 aClass26_Sub2_30;

	@OriginalMember(owner = "client!wr", name = "ug", descriptor = "Lclient!tq;")
	public Class287 aClass287_17;

	@OriginalMember(owner = "client!wr", name = "vg", descriptor = "Lclient!tq;")
	private Class287 aClass287_18;

	@OriginalMember(owner = "client!wr", name = "wg", descriptor = "I")
	private int anInt7140;

	@OriginalMember(owner = "client!wr", name = "xg", descriptor = "Z")
	protected boolean aBoolean516;

	@OriginalMember(owner = "client!wr", name = "cb", descriptor = "Lclient!dm;")
	private final Class73 aClass73_56 = new Class73();

	@OriginalMember(owner = "client!wr", name = "Pd", descriptor = "Z")
	protected boolean aBoolean497 = true;

	@OriginalMember(owner = "client!wr", name = "Qd", descriptor = "Lclient!og;")
	protected final Class91_Sub2 aClass91_Sub2_15 = new Class91_Sub2();

	@OriginalMember(owner = "client!wr", name = "Yd", descriptor = "Lclient!og;")
	public Class91_Sub2 aClass91_Sub2_16 = new Class91_Sub2();

	@OriginalMember(owner = "client!wr", name = "Zd", descriptor = "Lclient!og;")
	public final Class91_Sub2 aClass91_Sub2_17 = new Class91_Sub2();

	@OriginalMember(owner = "client!wr", name = "ae", descriptor = "Lclient!og;")
	protected final Class91_Sub2 aClass91_Sub2_18 = new Class91_Sub2();

	@OriginalMember(owner = "client!wr", name = "be", descriptor = "Lclient!og;")
	private final Class91_Sub2 aClass91_Sub2_19 = new Class91_Sub2();

	@OriginalMember(owner = "client!wr", name = "ce", descriptor = "Lclient!og;")
	private final Class91_Sub2 aClass91_Sub2_20 = new Class91_Sub2();

	@OriginalMember(owner = "client!wr", name = "de", descriptor = "Z")
	private boolean aBoolean498 = false;

	@OriginalMember(owner = "client!wr", name = "se", descriptor = "I")
	protected final int anInt7106 = 0;

	@OriginalMember(owner = "client!wr", name = "ve", descriptor = "I")
	public int anInt7108 = 0;

	@OriginalMember(owner = "client!wr", name = "De", descriptor = "[F")
	private final float[] aFloatArray59 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wr", name = "Ee", descriptor = "[F")
	private final float[] aFloatArray60 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!wr", name = "le", descriptor = "F")
	public float aFloat153 = 3584.0F;

	@OriginalMember(owner = "client!wr", name = "Ce", descriptor = "I")
	private int anInt7112 = 0;

	@OriginalMember(owner = "client!wr", name = "Pe", descriptor = "I")
	private int anInt7122 = 0;

	@OriginalMember(owner = "client!wr", name = "Ie", descriptor = "I")
	protected int anInt7116 = 0;

	@OriginalMember(owner = "client!wr", name = "cf", descriptor = "F")
	public float aFloat157 = 3584.0F;

	@OriginalMember(owner = "client!wr", name = "Ye", descriptor = "Z")
	private boolean aBoolean505 = false;

	@OriginalMember(owner = "client!wr", name = "Ke", descriptor = "I")
	private int anInt7118 = -1;

	@OriginalMember(owner = "client!wr", name = "ff", descriptor = "Z")
	protected boolean aBoolean507 = false;

	@OriginalMember(owner = "client!wr", name = "Ve", descriptor = "I")
	protected int anInt7124 = 0;

	@OriginalMember(owner = "client!wr", name = "Me", descriptor = "I")
	public int anInt7120 = 0;

	@OriginalMember(owner = "client!wr", name = "re", descriptor = "[F")
	public final float[] aFloatArray58 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!wr", name = "ge", descriptor = "[F")
	private final float[] aFloatArray57 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wr", name = "ne", descriptor = "I")
	public int anInt7104 = -1;

	@OriginalMember(owner = "client!wr", name = "nf", descriptor = "I")
	protected int anInt7127 = -1;

	@OriginalMember(owner = "client!wr", name = "Se", descriptor = "I")
	public int anInt7123 = 512;

	@OriginalMember(owner = "client!wr", name = "xe", descriptor = "I")
	private int anInt7109 = 0;

	@OriginalMember(owner = "client!wr", name = "He", descriptor = "I")
	public int anInt7115 = 8;

	@OriginalMember(owner = "client!wr", name = "Ne", descriptor = "Z")
	private boolean aBoolean503 = false;

	@OriginalMember(owner = "client!wr", name = "Xe", descriptor = "I")
	public int anInt7126 = 50;

	@OriginalMember(owner = "client!wr", name = "We", descriptor = "I")
	private int anInt7125 = 0;

	@OriginalMember(owner = "client!wr", name = "je", descriptor = "I")
	public int anInt7103 = 3;

	@OriginalMember(owner = "client!wr", name = "ue", descriptor = "I")
	protected int anInt7107 = 0;

	@OriginalMember(owner = "client!wr", name = "df", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "client!wr", name = "Fe", descriptor = "I")
	public int anInt7113 = 128;

	@OriginalMember(owner = "client!wr", name = "qf", descriptor = "Z")
	protected boolean aBoolean509 = false;

	@OriginalMember(owner = "client!wr", name = "Cf", descriptor = "I")
	private int anInt7133 = -1;

	@OriginalMember(owner = "client!wr", name = "Ue", descriptor = "Lclient!aba;")
	protected Class4 aClass4_6 = Static514.aClass4_4;

	@OriginalMember(owner = "client!wr", name = "bf", descriptor = "Z")
	protected boolean bf = false;

	@OriginalMember(owner = "client!wr", name = "zf", descriptor = "Z")
	private boolean aBoolean510 = false;

	@OriginalMember(owner = "client!wr", name = "ee", descriptor = "Z")
	protected boolean aBoolean499 = true;

	@OriginalMember(owner = "client!wr", name = "Le", descriptor = "I")
	protected final int anInt7119 = 0;

	@OriginalMember(owner = "client!wr", name = "af", descriptor = "Lclient!lf;")
	protected Class187 aClass187_26 = Static220.aClass187_18;

	@OriginalMember(owner = "client!wr", name = "Nf", descriptor = "F")
	public float aFloat167 = -1.0F;

	@OriginalMember(owner = "client!wr", name = "Hf", descriptor = "F")
	public float aFloat165 = 1.0F;

	@OriginalMember(owner = "client!wr", name = "Lf", descriptor = "I")
	public int anInt7136 = 0;

	@OriginalMember(owner = "client!wr", name = "yf", descriptor = "I")
	public int anInt7132 = -1;

	@OriginalMember(owner = "client!wr", name = "gf", descriptor = "F")
	public float aFloat158 = 1.0F;

	@OriginalMember(owner = "client!wr", name = "sf", descriptor = "I")
	protected int anInt7128 = 3584;

	@OriginalMember(owner = "client!wr", name = "ze", descriptor = "I")
	protected int anInt7111 = 0;

	@OriginalMember(owner = "client!wr", name = "tf", descriptor = "[Lclient!cj;")
	private final Class21[] aClass21Array3 = new Class21[10];

	@OriginalMember(owner = "client!wr", name = "ef", descriptor = "[F")
	protected float[] aFloatArray61 = this.aFloatArray60;

	@OriginalMember(owner = "client!wr", name = "Sf", descriptor = "I")
	private int anInt7137 = 1;

	@OriginalMember(owner = "client!wr", name = "Df", descriptor = "[F")
	private final float[] aFloatArray62 = new float[16];

	@OriginalMember(owner = "client!wr", name = "If", descriptor = "[F")
	public final float[] aFloatArray63 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wr", name = "Gf", descriptor = "Z")
	protected boolean aBoolean512 = true;

	@OriginalMember(owner = "client!wr", name = "Qf", descriptor = "Z")
	protected boolean aBoolean514 = true;

	@OriginalMember(owner = "client!wr", name = "xf", descriptor = "I")
	public int anInt7131 = 512;

	@OriginalMember(owner = "client!wr", name = "Wf", descriptor = "[F")
	private final float[] aFloatArray65 = new float[16];

	@OriginalMember(owner = "client!wr", name = "Tf", descriptor = "Z")
	protected boolean aBoolean515 = true;

	@OriginalMember(owner = "client!wr", name = "wf", descriptor = "I")
	protected int anInt7130 = 0;

	@OriginalMember(owner = "client!wr", name = "Re", descriptor = "Z")
	protected boolean aBoolean504 = true;

	@OriginalMember(owner = "client!wr", name = "Vf", descriptor = "[F")
	private final float[] aFloatArray64 = new float[16];

	@OriginalMember(owner = "client!wr", name = "uf", descriptor = "F")
	public float aFloat163 = -1.0F;

	@OriginalMember(owner = "client!wr", name = "Jf", descriptor = "Z")
	protected boolean aBoolean513 = false;

	@OriginalMember(owner = "client!wr", name = "Yf", descriptor = "I")
	private int anInt7138 = 16777215;

	@OriginalMember(owner = "client!wr", name = "Xf", descriptor = "F")
	private float aFloat170 = 1.0F;

	@OriginalMember(owner = "client!wr", name = "Ef", descriptor = "F")
	private float aFloat164 = 3000.0F;

	@OriginalMember(owner = "client!wr", name = "Uf", descriptor = "F")
	public float aFloat169 = 1.0F;

	@OriginalMember(owner = "client!wr", name = "Rf", descriptor = "F")
	public float aFloat168 = 1.0F;

	@OriginalMember(owner = "client!wr", name = "rf", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream6 = new Stream();

	@OriginalMember(owner = "client!wr", name = "jg", descriptor = "Lclient!og;")
	private final Class91_Sub2 aClass91_Sub2_21 = new Class91_Sub2();

	@OriginalMember(owner = "client!wr", name = "V", descriptor = "Ljava/lang/Object;")
	protected final Object anObject11;

	@OriginalMember(owner = "client!wr", name = "gc", descriptor = "Ljava/lang/Object;")
	private Object anObject12;

	@OriginalMember(owner = "client!wr", name = "M", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas13;

	@OriginalMember(owner = "client!wr", name = "cc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas14;

	@OriginalMember(owner = "client!wr", name = "Oe", descriptor = "I")
	protected final int anInt7121;

	@OriginalMember(owner = "client!wr", name = "Ic", descriptor = "Lclient!an;")
	protected final Class16 aClass16_91;

	@OriginalMember(owner = "client!wr", name = "Bb", descriptor = "I")
	private int anInt6983;

	@OriginalMember(owner = "client!wr", name = "vc", descriptor = "I")
	public int anInt7027;

	@OriginalMember(owner = "client!wr", name = "U", descriptor = "I")
	private int anInt6954;

	@OriginalMember(owner = "client!wr", name = "Yc", descriptor = "I")
	public int anInt7054;

	@OriginalMember(owner = "client!wr", name = "Ge", descriptor = "I")
	public final int anInt7114;

	@OriginalMember(owner = "client!wr", name = "lf", descriptor = "Lclient!bq;")
	private final Class39 aClass39_3;

	@OriginalMember(owner = "client!wr", name = "Pc", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!n;Lclient!an;II)V")
	protected Class42_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anObject12 = this.anObject11 = arg1;
		this.aCanvas14 = this.aCanvas13 = arg0;
		this.anInt7121 = arg4;
		this.aClass16_91 = arg3;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt7027 = this.anInt6983 = local307.width;
		this.anInt7054 = this.anInt6954 = local307.height;
		this.anInt7114 = arg5;
		Static292.method4744(true, false);
		this.aClass39_3 = new Class39(this, super.anInterface11_11);
		this.aNativeInterface3 = new NativeInterface(super.anInterface11_11.method6214(), this.anInt7114);
		for (@Pc(349) int local349 = 0; super.anInterface11_11.method6214() > local349; local349++) {
			@Pc(357) Class278 local357 = super.anInterface11_11.method6215(local349);
			if (local357 != null) {
				this.aNativeInterface3.initTextureMetrics(local349, local357.aByte84, local357.aByte85);
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!baa;)V")
	public final void method5868(@OriginalArg(1) Interface3 arg0) {
		if (arg0 == this.anInterface3Array3[this.anInt7107]) {
			return;
		}
		this.anInterface3Array3[this.anInt7107] = arg0;
		if (arg0 == null) {
			this.method5944();
		} else {
			arg0.method6969();
		}
		this.anInt7102 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BILclient!vf;Z)V")
	protected abstract void method5869(@OriginalArg(1) int arg0, @OriginalArg(2) Class302 arg1);

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)V")
	private void method5870() {
		this.anInterface10_7 = this.method5930(true);
		this.anInterface10_7.method7897(12, 24);
		this.aClass287_16 = this.method5940(new Class75[] { new Class75(Static427.aClass262_1) });
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method5871(@OriginalArg(1) Buffer arg0) {
		this.aStream6.a(arg0);
		return this.aStream6;
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(B)V")
	protected abstract void method5872();

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIZBZI)V")
	private void method5873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) boolean local4 = arg3 & this.method5813();
		if (!local4 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			arg4 = 2;
			arg0 = 1;
			arg1 = 0;
		}
		if (arg4 != 0 && arg2) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (this.anInt7122 != arg4) {
			if (this.anInt7122 != 0) {
				this.aClass21Array3[this.anInt7122 & Integer.MAX_VALUE].method7556();
			}
			if (arg4 == 0) {
				this.aClass21_3 = null;
			} else {
				this.aClass21_3 = this.aClass21Array3[arg4 & Integer.MAX_VALUE];
				this.aClass21_3.method7549(arg2);
				this.aClass21_3.method7552(arg2);
				this.aClass21_3.method7557(arg0, arg1);
			}
			this.anInt7122 = arg4;
			this.anInt7109 = arg0;
			this.anInt7125 = arg1;
		} else if (this.anInt7122 != 0) {
			this.aClass21Array3[Integer.MAX_VALUE & this.anInt7122].method7552(arg2);
			if (this.anInt7125 != arg1 || arg0 != this.anInt7109) {
				this.aClass21Array3[this.anInt7122 & Integer.MAX_VALUE].method7557(arg0, arg1);
				this.anInt7125 = arg1;
				this.anInt7109 = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "(I)V")
	public abstract void method5874();

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "(I)V")
	public final void method5875() {
		if (this.anInt7102 == 2) {
			return;
		}
		this.method5893();
		this.method5928(false);
		this.method5886(false);
		this.method5927(false);
		this.method5885(false);
		this.method5997(-2, false, false);
		this.anInt7102 = 2;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public final Class145 method5832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static21.method6670(arg3, arg0, arg1, arg2, this);
	}

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt7138;
		if (local11 || arg1 != this.aFloat167 || this.aFloat163 != arg2) {
			this.aFloat163 = arg2;
			this.anInt7138 = arg0;
			this.aFloat167 = arg1;
			if (local11) {
				this.aFloat169 = (float) (this.anInt7138 & 0xFF00) / 65280.0F;
				this.aFloat158 = (float) (this.anInt7138 & 0xFF0000) / 1.671168E7F;
				this.aFloat168 = (float) (this.anInt7138 & 0xFF) / 255.0F;
				this.method5892();
			}
			this.aNativeInterface3.setSunColour(this.aFloat158, this.aFloat169, this.aFloat168, arg1, arg2);
			this.method5963();
		}
		if (arg3 != this.aFloatArray59[0] || this.aFloatArray59[1] != arg4 || this.aFloatArray59[2] != arg5) {
			this.aFloatArray59[1] = arg4;
			this.aFloatArray59[0] = arg3;
			this.aFloatArray59[2] = arg5;
			this.aFloatArray57[1] = -arg4;
			this.aFloatArray57[2] = -arg5;
			this.aFloatArray57[0] = -arg3;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[1] = arg4 * local149;
			this.aFloatArray63[2] = local149 * arg5;
			this.aFloatArray63[0] = local149 * arg3;
			this.aFloatArray58[2] = -this.aFloatArray63[2];
			this.aFloatArray58[0] = -this.aFloatArray63[0];
			this.aFloatArray58[1] = -this.aFloatArray63[1];
			this.aNativeInterface3.setSunDirection(this.aFloatArray63[0], this.aFloatArray63[1], this.aFloatArray63[2]);
			this.method5874();
			this.anInt7117 = (int) (arg5 * 256.0F / arg4);
			this.anInt7100 = (int) (arg3 * 256.0F / arg4);
		}
		this.method5954();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIIZI[II)Lclient!wn;")
	public abstract Interface20 method5876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!lu;IZ)V")
	public abstract void method5877(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "(I)V")
	protected abstract void method5878();

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "(Z)I")
	public final int method5879() {
		return this.anInt7112;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!dk;I[FIIIZ)Lclient!wn;")
	protected abstract Interface20 method5880(@OriginalArg(1) Class72 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean arg4);

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "(Z)I")
	public final int method5881() {
		return this.anInt7110;
	}

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "(B)V")
	protected abstract void method5882();

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "(I)V")
	private void method5883() {
		this.aBoolean503 = false;
		if (this.aClass21_3 != null) {
			this.aClass21_3.method7545();
		}
		this.method5965();
	}

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "(I)V")
	@Override
	public void method5861(@OriginalArg(0) int arg0) {
		this.aClass39_3.method861();
		this.anInt7105 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "(I)V")
	protected abstract void method5884();

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZ)V")
	public final void method5885(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean513) {
			this.aBoolean513 = arg0;
			this.method5932();
			this.anInt7102 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZI)V")
	public final void method5886(@OriginalArg(0) boolean arg0) {
		if (this.bf != arg0) {
			this.bf = arg0;
			this.method5939();
			this.anInt7102 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		@Pc(30) float local30 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
		@Pc(34) float local34 = local10 * local30;
		@Pc(38) float local38 = local17 * local30;
		if (!this.method5905(0.0F, local34 + (float) arg2, local38 + (float) arg3, (float) arg1, 0.0F, (float) arg0)) {
			return;
		}
		this.method5957();
		this.method5935(arg4);
		this.method5951(Static371.aClass302_2, 0);
		this.method5967(0, Static371.aClass302_2);
		this.method5955(arg5);
		this.method5990();
		this.method5985(false);
		this.method5959();
		this.method5985(true);
		this.method5967(0, Static159.aClass302_1);
		this.method5951(Static159.aClass302_1, 0);
	}

	@OriginalMember(owner = "client!wr", name = "ta", descriptor = "(II)V")
	@Override
	public final void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt7126 && arg1 == this.anInt7128) {
			return;
		}
		this.anInt7128 = arg1;
		this.anInt7126 = arg0;
		this.method5980();
		this.method5949();
		this.method5991();
	}

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5851(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!wr", name = "JA", descriptor = "(IIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean508) {
			throw new RuntimeException("");
		}
		if (this.anInt7110 != arg0) {
			this.anInt7110 = arg0;
			if (this.aClass21_3 != null) {
				this.aClass21_3.method7547();
			}
		}
		this.anInt7112 = arg3;
		this.anInt7127 = arg1;
		this.anInt7118 = arg2;
		this.method5991();
	}

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "(I)V")
	public final void method5887() {
		this.anInterface3Array3 = new Interface3[this.anInt7129];
		this.aClass129Array5 = new Class129[this.anInt7129];
		this.aClass91_Sub2Array3 = new Class91_Sub2[this.anInt7129];
		this.aClass299Array3 = new Class299[this.anInt7129];
		this.aClass129Array6 = new Class129[this.anInt7129];
		for (@Pc(32) int local32 = 0; local32 < this.anInt7129; local32++) {
			this.aClass129Array5[local32] = Static506.aClass129_5;
			this.aClass129Array6[local32] = Static506.aClass129_5;
			this.aClass299Array3[local32] = Static339.aClass299_3;
			this.aClass91_Sub2Array3[local32] = new Class91_Sub2();
		}
		this.aClass12_Sub7Array4 = new Class12_Sub7[this.anInt7101 - 2];
		this.anInterface3_3 = this.method5952(Static155.aClass114_6, Static306.aClass72_5, 1, 1);
		this.method5814(new Class12_Sub36_Sub1(262144));
		this.aClass287_14 = this.method5940(new Class75[] { new Class75(new Class262[] { Static427.aClass262_1, Static427.aClass262_5 }) });
		this.aClass287_13 = this.method5940(new Class75[] { new Class75(new Class262[] { Static427.aClass262_1, Static427.aClass262_3 }) });
		this.aClass287_17 = this.method5940(new Class75[] { new Class75(Static427.aClass262_1), new Class75(Static427.aClass262_3), new Class75(Static427.aClass262_5), new Class75(Static427.aClass262_2) });
		this.aClass287_15 = this.method5940(new Class75[] { new Class75(Static427.aClass262_1), new Class75(Static427.aClass262_3), new Class75(Static427.aClass262_5) });
		this.aClass26_Sub2_28 = new Class26_Sub2(this, 0, 0, false, false);
		this.aClass26_Sub2_27 = new Class26_Sub2(this, 0, 0, true, true);
		this.aClass26_Sub2_24 = new Class26_Sub2(this, 0, 0, false, false);
		this.aClass26_Sub2_25 = new Class26_Sub2(this, 0, 0, true, true);
		this.aClass26_Sub2_21 = new Class26_Sub2(this, 0, 0, false, false);
		this.aClass26_Sub2_22 = new Class26_Sub2(this, 0, 0, true, true);
		this.aClass26_Sub2_26 = new Class26_Sub2(this, 0, 0, false, false);
		this.aClass26_Sub2_30 = new Class26_Sub2(this, 0, 0, true, true);
		this.aClass26_Sub2_29 = new Class26_Sub2(this, 0, 0, false, false);
		this.aClass26_Sub2_23 = new Class26_Sub2(this, 0, 0, true, true);
		this.aClass255_3 = new Class255(this);
		this.anInterface18_7 = this.method5906(true);
		this.method5904();
		this.aClass236_5 = new Class236(this);
		this.aClass21Array3[1] = this.method5978(1);
		this.aClass21Array3[2] = this.method5978(2);
		this.aClass21Array3[4] = this.method5978(4);
		this.aClass21Array3[5] = this.method5978(5);
		this.aClass21Array3[6] = this.method5978(6);
		this.aClass21Array3[7] = this.method5978(7);
		this.aClass21Array3[3] = this.method5978(3);
		this.aClass21Array3[8] = this.method5978(8);
		this.aClass21Array3[9] = this.method5978(9);
		if (!this.aClass21Array3[2].method7550()) {
			this.aClass21Array3[2] = this.method5978(0);
		}
		if (!this.aClass21Array3[4].method7550()) {
			this.aClass21Array3[4] = this.aClass21Array3[2];
		}
		if (!this.aClass21Array3[8].method7550()) {
			this.aClass21Array3[8] = this.aClass21Array3[4];
		}
		if (!this.aClass21Array3[9].method7550()) {
			this.aClass21Array3[9] = this.aClass21Array3[8];
		}
		this.method5895();
		this.n();
	}

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "(Z)V")
	public final void method5888() {
		if (this.anInt7102 == 4) {
			return;
		}
		this.method5893();
		this.method5928(false);
		this.method5886(false);
		this.method5927(false);
		this.method5885(false);
		this.method5997(-2, false, false);
		this.method5955(1);
		this.method5979(0);
		this.anInt7102 = 4;
	}

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "(I)V")
	public final void method5889() {
		if (this.anInt7102 == 8) {
			return;
		}
		this.method5973();
		this.method5928(true);
		this.method5927(true);
		this.method5885(true);
		this.method5955(1);
		this.anInt7102 = 8;
	}

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "(Z)V")
	private void method5890() {
		this.aFloat159 = this.anInt7124 - this.anInt7108;
		this.aFloat171 = this.anInt7111 - this.anInt7136;
		this.aFloat154 = this.anInt7130 - this.anInt7136;
		this.aFloat161 = this.anInt7116 - this.anInt7108;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public final Class84 method5862(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class84_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5799(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas13) {
			local5 = this.anObject12;
		} else if (this.aHashtable10.containsKey(arg0)) {
			local5 = this.aHashtable10.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method5946(arg0, local5);
		if (arg0 == this.aCanvas14) {
			this.method5912();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[F)[F")
	public final float[] method5891(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloatArray61[1];
		arg0[8] = this.aFloatArray61[2];
		arg0[12] = this.aFloatArray61[3];
		arg0[0] = this.aFloatArray61[0];
		arg0[2] = this.aFloatArray61[8];
		arg0[9] = this.aFloatArray61[6];
		arg0[13] = this.aFloatArray61[7];
		arg0[1] = this.aFloatArray61[4];
		arg0[5] = this.aFloatArray61[5];
		arg0[7] = this.aFloatArray61[13];
		arg0[6] = this.aFloatArray61[9];
		arg0[3] = this.aFloatArray61[12];
		arg0[14] = this.aFloatArray61[11];
		arg0[10] = this.aFloatArray61[10];
		arg0[15] = this.aFloatArray61[15];
		arg0[11] = this.aFloatArray61[14];
		return arg0;
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "(B)V")
	protected abstract void method5892();

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "(IIII)V")
	@Override
	public final void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7112 = arg3;
		this.anInt7118 = arg2;
		this.aBoolean508 = true;
		this.anInt7110 = arg0;
		this.anInt7127 = arg1;
		this.method5873(0, 0, false, false, 3);
		if (this.aClass21_3 != null) {
			this.aClass21_3.method7547();
		}
		this.method5991();
		this.method5882();
	}

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "(Z)V")
	private void method5893() {
		if (Static86.aClass4_5 == this.aClass4_6) {
			return;
		}
		@Pc(16) Class4 local16 = this.aClass4_6;
		this.aClass4_6 = Static86.aClass4_5;
		if (local16.method202()) {
			this.method5883();
		}
		this.method5995();
		this.aFloatArray61 = this.aFloatArray64;
		this.method5943();
		this.anInt7102 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(FB)V")
	public final void method5894(@OriginalArg(0) float arg0) {
		if (this.aFloat170 != arg0) {
			this.aFloat170 = arg0;
			this.method5949();
		}
	}

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "(Z)V")
	protected void method5895() {
		this.method5936();
	}

	@OriginalMember(owner = "client!wr", name = "ba", descriptor = "()I")
	@Override
	public final int ba() {
		return this.anInt7140;
	}

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "(IIII)V")
	@Override
	public final void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < this.anInt7130) {
			this.anInt7130 = arg3;
		}
		if (this.anInt7111 < arg1) {
			this.anInt7111 = arg1;
		}
		if (this.anInt7116 > arg2) {
			this.anInt7116 = arg2;
		}
		if (this.anInt7124 < arg0) {
			this.anInt7124 = arg0;
		}
		if (this.anInt7124 <= 0 && this.anInt7116 >= this.anInt7027 && this.anInt7111 <= 0 && this.anInt7054 <= this.anInt7130) {
			this.n();
			return;
		}
		if (!this.aBoolean516) {
			this.aBoolean516 = true;
			this.method5925();
		}
		this.method5924();
		this.method5890();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method5896(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "(B)V")
	private void method5897() {
		if (Static503.aClass4_8 == this.aClass4_6) {
			return;
		}
		@Pc(6) Class4 local6 = this.aClass4_6;
		this.aClass4_6 = Static503.aClass4_8;
		if (!local6.method202()) {
			this.method5883();
		}
		this.method5934();
		this.aFloatArray61 = this.aFloatArray65;
		this.method5943();
		this.anInt7102 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wr", name = "ra", descriptor = "()F")
	@Override
	public final float ra() {
		return this.aFloat156;
	}

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "(I)Lclient!og;")
	public final Class91_Sub2 method5898() {
		return this.aClass91_Sub2_18;
	}

	@OriginalMember(owner = "client!wr", name = "P", descriptor = "()F")
	@Override
	public final float P() {
		return this.aFloat164;
	}

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "(I)V")
	public final void method5899() {
		this.aBoolean497 = false;
		this.method5964();
	}

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "()Z")
	@Override
	public final boolean method5819() {
		return true;
	}

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "(I)V")
	private void method5900() {
		this.anInterface10_8 = this.method5930(false);
		this.anInterface10_8.method7897(28, 140);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface10_8.method7895();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method5871(local28);
				if (Stream.c()) {
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
				local35.a();
				if (this.anInterface10_8.method7899()) {
					break;
				}
			}
		}
		this.aClass287_18 = this.method5940(new Class75[] { new Class75(new Class262[] { Static427.aClass262_1, Static427.aClass262_5, Static427.aClass262_5 }) });
	}

	@OriginalMember(owner = "client!wr", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(IZ)Lclient!uj;")
	public final Interface18 method5901(@OriginalArg(0) int arg0) {
		if (arg0 * 2 > this.anInterface18_7.method7894()) {
			this.anInterface18_7.method7529(arg0);
		}
		return this.anInterface18_7;
	}

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "(B)V")
	protected abstract void method5902();

	@OriginalMember(owner = "client!wr", name = "la", descriptor = "(FF)V")
	@Override
	public final void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat164 && this.aFloat156 == arg1) {
			return;
		}
		this.aFloat164 = arg0;
		this.aFloat156 = arg1;
		this.method5921();
		this.method5942();
		this.method5949();
		this.method5980();
	}

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "()Z")
	@Override
	public final boolean method5818() {
		return true;
	}

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "(I)Lclient!og;")
	public final Class91_Sub2 method5903() {
		return this.aClass91_Sub2Array3[this.anInt7107];
	}

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "(Z)V")
	protected final void method5904() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable10 != null && !this.aHashtable10.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable10.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method5910(local26));
			}
		}
		this.aHashtable10 = local9;
		this.method5900();
		this.method5870();
		this.aClass255_3.method6379(this);
	}

	@OriginalMember(owner = "client!wr", name = "IA", descriptor = "(III[I)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass91_Sub2_16.method5507((float) arg2, (float) arg0, (float) arg1);
		if ((float) this.anInt7126 > local14 || local14 > (float) this.anInt7128) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(57) int local57 = (int) ((float) this.anInt7123 * this.aClass91_Sub2_16.method5490((float) arg0, (float) arg1, (float) arg2) / local14);
		@Pc(75) int local75 = (int) ((float) this.anInt7131 * this.aClass91_Sub2_16.method5505((float) arg1, (float) arg0, (float) arg2) / local14);
		if (this.aFloat159 <= (float) local57 && this.aFloat161 >= (float) local57 && (float) local75 >= this.aFloat171 && this.aFloat154 >= (float) local75) {
			arg3[1] = (int) ((float) local75 - this.aFloat171);
			arg3[2] = (int) local14;
			arg3[0] = (int) ((float) local57 - this.aFloat159);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(FFFFBFF)Z")
	private boolean method5905(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface10_7.method7895();
		if (local9 == null) {
			return false;
		}
		@Pc(25) Stream local25 = this.method5871(local9);
		if (Stream.c()) {
			local25.a(arg5);
			local25.a(arg3);
			local25.a(arg0);
			local25.a(arg1);
			local25.a(arg2);
			local25.a(arg4);
		} else {
			local25.b(arg5);
			local25.b(arg3);
			local25.b(arg0);
			local25.b(arg1);
			local25.b(arg2);
			local25.b(arg4);
		}
		local25.a();
		return this.anInterface10_7.method7899();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZB)Lclient!uj;")
	public abstract Interface18 method5906(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "(I)V")
	private void method5907() {
		this.method5902();
		if (this.aClass21_3 != null) {
			this.aClass21_3.method7554();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method5908(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap5.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(ZB)V")
	public final void method5909(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean507) {
			this.aBoolean507 = arg0;
			this.method5939();
		}
	}

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "()Z")
	@Override
	public final boolean method5867() {
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "(IIIIII)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5957();
		this.method5935(arg4);
		this.method5951(Static371.aClass302_2, 0);
		this.method5967(0, Static371.aClass302_2);
		this.method5955(arg5);
		this.aClass91_Sub2_15.method5504(1.0F, (float) arg2, (float) arg3);
		this.aClass91_Sub2_15.TA(arg0, arg1, 0);
		this.method5964();
		this.method5985(false);
		this.method5974();
		this.method5985(true);
		this.method5967(0, Static159.aClass302_1);
		this.method5951(Static159.aClass302_1, 0);
	}

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "()Z")
	@Override
	public final boolean method5848() {
		return true;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method5910(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V")
	@Override
	public final void method5804(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!dk;Lclient!ge;)Z")
	public abstract boolean method5911(@OriginalArg(1) Class72 arg0, @OriginalArg(2) Class114 arg1);

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "(I)V")
	private void method5912() {
		if (this.aCanvas14 == null) {
			this.anInt6983 = this.anInt6954 = 1;
		} else {
			@Pc(26) Dimension local26 = this.aCanvas14.getSize();
			this.anInt6983 = local26.width;
			this.anInt6954 = local26.height;
		}
		this.anInt7027 = this.anInt6983;
		this.anInt7054 = this.anInt6954;
		this.method6000();
		this.method5980();
		this.method5949();
		this.method5926();
		this.method5890();
		this.method5970();
		this.n();
	}

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "(I)V")
	protected abstract void method5913();

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZIILclient!dk;II[BI)Lclient!wn;")
	protected abstract Interface20 method5914(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class72 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4);

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)V")
	@Override
	public final void method5837(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(II)V")
	public final void method5915(@OriginalArg(1) int arg0) {
		if (this.anInt7107 != arg0) {
			this.anInt7107 = arg0;
			this.method5938();
		}
	}

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "(B)Lclient!og;")
	public final Class91_Sub2 method5916() {
		if (!this.aBoolean503) {
			this.aClass91_Sub2_20.method5506(this.aClass91_Sub2_18, this.aClass91_Sub2_15);
			this.aBoolean503 = true;
		}
		return this.aClass91_Sub2_20;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!vaa;)V")
	public final void method5918(@OriginalArg(1) Class299 arg0) {
		this.aClass299Array3[this.anInt7107] = arg0;
		this.method5907();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!io;BI)V")
	private void method5919(@OriginalArg(0) Class147 arg0, @OriginalArg(2) int arg1) {
		this.method5999(this.aClass287_18);
		this.method5877(this.anInterface10_8, 0);
		this.method5937(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public final boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass91_Sub2_16.method5507((float) arg2, (float) arg0, (float) arg1);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass91_Sub2_16.method5507((float) arg5, (float) arg3, (float) arg4);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt7126 > local14 && (float) this.anInt7126 > local31 || !(!(local14 > (float) this.anInt7128) || !((float) this.anInt7128 < local31))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt7123 * this.aClass91_Sub2_16.method5490((float) arg0, (float) arg1, (float) arg2) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt7123 * this.aClass91_Sub2_16.method5490((float) arg3, (float) arg4, (float) arg5) / local31);
		if ((float) local81 < this.aFloat159 && this.aFloat159 > (float) local99 || this.aFloat161 < (float) local81 && this.aFloat161 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt7131 * this.aClass91_Sub2_16.method5505((float) arg1, (float) arg0, (float) arg2) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt7131 * this.aClass91_Sub2_16.method5505((float) arg4, (float) arg3, (float) arg5) / local31);
			return (!((float) local143 < this.aFloat171) || !((float) local161 < this.aFloat171)) && (!(this.aFloat154 < (float) local143) || !(this.aFloat154 < (float) local161));
		}
	}

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "()Z")
	@Override
	public final boolean method5813() {
		return this.aClass21Array3[3].method7550();
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(Z)V")
	@Override
	public final void method5822(@OriginalArg(0) boolean arg0) {
		this.aBoolean499 = arg0;
		this.method5932();
	}

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "(Z)F")
	protected abstract float method5920();

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "(Z)V")
	private void method5921() {
		this.aFloat153 = (float) this.anInt7128 - this.aFloat156;
	}

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "(B)I")
	public final int method5922() {
		return this.anInt7107;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLclient!dk;Lclient!ge;)Z")
	public abstract boolean method5923(@OriginalArg(1) Class72 arg0, @OriginalArg(2) Class114 arg1);

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "()Z")
	@Override
	public final boolean method5833() {
		return this.aBoolean511;
	}

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "()Z")
	@Override
	public final boolean method5853() {
		return true;
	}

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "(B)V")
	protected abstract void method5924();

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "(Z)V")
	protected abstract void method5925();

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "(I)V")
	protected abstract void method5926();

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(ZI)V")
	public final void method5927(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean509) {
			this.aBoolean509 = arg0;
			this.method5872();
			this.anInt7102 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(IZ)V")
	public final void method5928(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean500) {
			this.aBoolean500 = arg0;
			this.method5882();
			this.anInt7102 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "(I)V")
	private void method5929() {
		if (this.aBoolean510) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray62;
		@Pc(25) float local25 = (float) (this.anInt7126 * -this.anInt7108) / (float) this.anInt7123;
		@Pc(40) float local40 = (float) (this.anInt7126 * (this.anInt7027 - this.anInt7108)) / (float) this.anInt7123;
		@Pc(51) float local51 = (float) (this.anInt7126 * this.anInt7136) / (float) this.anInt7131;
		@Pc(66) float local66 = (float) ((this.anInt7136 - this.anInt7054) * this.anInt7126) / (float) this.anInt7131;
		if (local25 == local40 || local66 == local51) {
			local13[11] = 0.0F;
			local13[3] = 0.0F;
			local13[5] = 1.0F;
			local13[2] = 0.0F;
			local13[7] = 0.0F;
			local13[10] = 1.0F;
			local13[9] = 0.0F;
			local13[15] = 1.0F;
			local13[0] = 1.0F;
			local13[14] = 0.0F;
			local13[4] = 0.0F;
			local13[8] = 0.0F;
			local13[12] = 0.0F;
			local13[13] = 0.0F;
			local13[6] = 0.0F;
			local13[1] = 0.0F;
		} else {
			@Pc(80) float local80 = (float) this.anInt7126 * 2.0F;
			local13[13] = 0.0F;
			local13[7] = 0.0F;
			local13[15] = 0.0F;
			local13[11] = -1.0F;
			local13[3] = 0.0F;
			local13[0] = local80 / (local40 - local25);
			local13[14] = this.aFloat155 = (float) (this.anInt7128 * this.anInt7126) / (float) (this.anInt7126 - this.anInt7128);
			local13[1] = 0.0F;
			local13[9] = (local51 + local66) / (local51 - local66);
			local13[6] = 0.0F;
			local13[4] = 0.0F;
			local13[2] = 0.0F;
			local13[10] = this.aFloat160 = (float) this.anInt7128 / (float) (this.anInt7126 - this.anInt7128);
			local13[8] = (local25 + local40) / (local40 - local25);
			local13[5] = local80 / (local51 - local66);
			local13[12] = 0.0F;
		}
		this.method5942();
		this.aBoolean510 = true;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BZ)Lclient!lu;")
	public abstract Interface10 method5930(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(ZB)V")
	public final void method5931(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean512) {
			this.aBoolean512 = arg0;
			this.method5882();
		}
	}

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "(B)V")
	protected abstract void method5932();

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "()V")
	@Override
	public final void n() {
		if (this.aBoolean516) {
			this.aBoolean516 = false;
			this.method5925();
			this.method5890();
		}
		this.anInt7111 = 0;
		this.anInt7130 = this.anInt7054;
		this.anInt7124 = 0;
		this.anInt7116 = this.anInt7027;
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(IZ)V")
	public final void method5933(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean514) {
			this.aBoolean514 = arg0;
			this.method5954();
		}
	}

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "(I)V")
	private void method5934() {
		if (this.aBoolean506) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray64;
		@Pc(17) float local17 = (float) this.anInt7126 - this.aFloat156;
		@Pc(24) float local24 = (float) this.anInt7128 - this.aFloat156;
		@Pc(36) float local36 = (float) -this.anInt7136 * this.aFloat170 / (float) this.anInt7131;
		@Pc(48) float local48 = this.aFloat170 * (float) -this.anInt7108 / (float) this.anInt7123;
		@Pc(63) float local63 = this.aFloat170 * (float) (this.anInt7027 - this.anInt7108) / (float) this.anInt7123;
		@Pc(78) float local78 = this.aFloat170 * (float) (this.anInt7054 - this.anInt7136) / (float) this.anInt7131;
		if (local63 == local48 || local78 == local36) {
			local9[7] = 0.0F;
			local9[10] = 1.0F;
			local9[3] = 0.0F;
			local9[15] = 1.0F;
			local9[0] = 1.0F;
			local9[9] = 0.0F;
			local9[14] = 0.0F;
			local9[6] = 0.0F;
			local9[12] = 0.0F;
			local9[8] = 0.0F;
			local9[11] = 0.0F;
			local9[13] = 0.0F;
			local9[4] = 0.0F;
			local9[1] = 0.0F;
			local9[2] = 0.0F;
			local9[5] = 1.0F;
		} else {
			local9[11] = 0.0F;
			local9[4] = 0.0F;
			local9[5] = 2.0F / (local36 - local78);
			local9[15] = 1.0F;
			local9[1] = 0.0F;
			local9[9] = 0.0F;
			local9[3] = 0.0F;
			local9[12] = -(local48 + local63) / (local63 - local48);
			local9[10] = -2.0F / (local24 - local17);
			local9[14] = -(local24 + local17) / (local24 - local17);
			local9[2] = 0.0F;
			local9[13] = -(local36 + local78) / (local36 - local78);
			local9[0] = 2.0F / (local63 - local48);
			local9[6] = 0.0F;
			local9[8] = 0.0F;
			local9[7] = 0.0F;
		}
		this.method5921();
		this.aBoolean506 = true;
	}

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "(II)V")
	public final void method5935(@OriginalArg(0) int arg0) {
		if (this.anInt7134 != arg0) {
			this.anInt7134 = arg0;
			this.method5941();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!pu;[Lclient!bt;Z)Lclient!ra;")
	@Override
	public final Class80 method5850(@OriginalArg(0) Class244 arg0, @OriginalArg(1) Class40[] arg1) {
		return new Class80_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "(I)V")
	private void method5936() {
		this.method5892();
		this.method5963();
		this.method5939();
		this.method5981();
		this.method5874();
		this.method5954();
		this.method5948();
		this.method5872();
		this.method5932();
		this.method5882();
		this.method5878();
		this.method5884();
		this.method5992();
		this.method5913();
		for (@Pc(60) int local60 = this.anInt7129 - 1; local60 >= 0; local60--) {
			this.method5915(local60);
			this.method5968();
			this.method5971();
			this.method5966();
		}
		this.method5941();
		this.method5926();
		this.method5950();
		this.method5989();
		this.method5965();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method5844() {
	}

	@OriginalMember(owner = "client!wr", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public final void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class145_Sub3 local6 = (Class145_Sub3) arg1;
		@Pc(9) Interface20 local9 = local6.anInterface20_4;
		this.method5875();
		this.method5868(local9);
		this.method5955(1);
		this.method5945(Static191.aClass129_3, Static191.aClass129_3);
		this.method5951(Static371.aClass302_2, 0);
		this.method5935(arg0);
		this.aClass91_Sub2_15.method5504(0.0F, (float) this.anInt7027, (float) this.anInt7054);
		this.method5964();
		this.aClass91_Sub2Array3[0].method5504(1.0F, local9.method6987((float) this.anInt7027), local9.method6984((float) this.anInt7054));
		this.aClass91_Sub2Array3[0].method5510(local9.method6987((float) -arg2), 0.0F, local9.method6984((float) -arg3));
		this.aClass299Array3[0] = Static261.aClass299_2;
		this.method5907();
		this.method5974();
		this.method5966();
		this.method5951(Static159.aClass302_1, 0);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIILclient!io;)V")
	public abstract void method5937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class147 arg2);

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "(Z)V")
	protected abstract void method5938();

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "(B)V")
	protected abstract void method5939();

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lclient!ds;Z)Lclient!tq;")
	public abstract Class287 method5940(@OriginalArg(0) Class75[] arg0);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lclient!r;Lclient!hp;Lclient!m;[Lclient!kn;I)V")
	@Override
	public final void method5809(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class7_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method5860(arg0, arg2, arg3, arg4);
		this.method5856(arg1);
	}

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "(B)V")
	protected abstract void method5941();

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "(B)V")
	private void method5942() {
		if (this.aFloat156 == 0.0F) {
			this.aFloatArray62[14] = this.aFloat155;
			this.aFloatArray62[10] = this.aFloat160;
		} else {
			@Pc(21) float local21 = this.aFloat164 / (this.aFloat164 + this.aFloat156);
			@Pc(25) float local25 = local21 * local21;
			@Pc(42) float local42 = (1.0F - local21) * -this.aFloat155 * (1.0F - local21) / this.aFloat156;
			this.aFloatArray62[14] = this.aFloat155 * local25;
			this.aFloatArray62[10] = this.aFloat160 + local42;
		}
		this.aFloat157 = (this.aFloatArray62[14] - (float) this.anInt7128) / this.aFloatArray62[10];
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!sv;)V")
	@Override
	public final void method5801(@OriginalArg(0) Class124 arg0) {
		this.aClass124_Sub2_3 = (Class124_Sub2) arg0;
	}

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "()Z")
	@Override
	public final boolean method5823() {
		return true;
	}

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "(I)V")
	private void method5943() {
		this.method5950();
		if (this.aClass21_3 != null) {
			this.aClass21_3.method7555();
		}
	}

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "(I)V")
	protected abstract void method5944();

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!hf;ILclient!hf;)V")
	public final void method5945(@OriginalArg(0) Class129 arg0, @OriginalArg(2) Class129 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg1 != this.aClass129Array6[this.anInt7107]) {
			this.aClass129Array6[this.anInt7107] = arg1;
			this.method5968();
			local5 = true;
		}
		if (arg0 != this.aClass129Array5[this.anInt7107]) {
			this.aClass129Array5[this.anInt7107] = arg0;
			this.method5971();
			local5 = true;
		}
		if (local5) {
			this.anInt7102 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "()V")
	@Override
	protected void method5800() {
		if (this.aBoolean505) {
			return;
		}
		for (@Pc(9) Class12 local9 = this.aClass73_56.method2005(); local9 != null; local9 = this.aClass73_56.method2009()) {
			((Class12_Sub36_Sub1) local9).method5049();
		}
		@Pc(26) Enumeration local26 = this.aHashtable10.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method5984(this.aHashtable10.get(local32), local32);
		}
		Static29.method558(true, false);
		this.aNativeInterface3.release();
		this.aBoolean505 = true;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
	protected abstract void method5946(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!bt;Z)Lclient!ha;")
	@Override
	public final Class84 method5839(@OriginalArg(0) Class40 arg0) {
		@Pc(23) Class84 local23;
		if (arg0.anInt895 == 0 || arg0.anInt894 == 0) {
			local23 = this.method5862(new int[1], 1, 1, 1);
		} else {
			@Pc(32) int[] local32 = new int[arg0.anInt894 * arg0.anInt895];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			@Pc(41) int local41;
			@Pc(45) int local45;
			if (arg0.aByteArray22 == null) {
				for (local41 = 0; local41 < arg0.anInt894; local41++) {
					for (local45 = 0; local45 < arg0.anInt895; local45++) {
						@Pc(58) int local58 = arg0.anIntArray124[arg0.aByteArray21[local34++] & 0xFF];
						local32[local36++] = local58 == 0 ? 0 : local58 | 0xFF000000;
					}
				}
			} else {
				for (local41 = 0; local41 < arg0.anInt894; local41++) {
					for (local45 = 0; local45 < arg0.anInt895; local45++) {
						local32[local36++] = arg0.aByteArray22[local34] << 24 | arg0.anIntArray124[arg0.aByteArray21[local34] & 0xFF];
						local34++;
					}
				}
			}
			local23 = this.method5862(local32, arg0.anInt895, arg0.anInt895, arg0.anInt894);
		}
		local23.KA(arg0.anInt897, arg0.anInt896, arg0.anInt899, arg0.anInt898);
		return local23;
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt7126;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([[IIZZ)Lclient!jg;")
	public abstract Interface8 method5947(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(IIII)V")
	@Override
	public final void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7123 = arg2;
		this.anInt7108 = arg0;
		this.anInt7131 = arg3;
		this.anInt7136 = arg1;
		this.method5949();
		this.method5980();
		this.method5970();
		this.method5890();
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5791(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable10.containsKey(arg0)) {
			this.method5984(this.aHashtable10.get(arg0), arg0);
			this.aHashtable10.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "()Z")
	@Override
	public final boolean method5798() {
		return true;
	}

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "(I)V")
	protected abstract void method5948();

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method5802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "(Z)V")
	private void method5949() {
		this.aBoolean498 = false;
		if (Static503.aClass4_8 == this.aClass4_6) {
			this.method5934();
			this.method5943();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I")
	@Override
	public final int method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "(I)V")
	protected abstract void method5950();

	@OriginalMember(owner = "client!wr", name = "xa", descriptor = "()V")
	@Override
	public final void xa() {
		this.aBoolean508 = false;
		this.method5873(0, 0, false, false, 0);
		this.method5991();
		this.method5882();
	}

	@OriginalMember(owner = "client!wr", name = "UA", descriptor = "(IIIII)V")
	@Override
	public final void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5851(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!vf;II)V")
	public final void method5951(@OriginalArg(0) Class302 arg0, @OriginalArg(1) int arg1) {
		this.method5983(false, false, arg1, arg0);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!ge;Lclient!dk;BII)Lclient!wn;")
	public abstract Interface20 method5952(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!dk;IB[FIZ)Lclient!wn;")
	public final Interface20 method5953(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method5880(arg0, arg3, arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "(I)V")
	protected abstract void method5954();

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public final void method5793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "(II)V")
	public final void method5955(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt7137) {
			return;
		}
		@Pc(18) Class187 local18;
		@Pc(16) boolean local16;
		@Pc(20) boolean local20;
		if (arg0 == 1) {
			local16 = true;
			local18 = Static220.aClass187_18;
			local20 = true;
		} else if (arg0 == 2) {
			local20 = false;
			local18 = Static301.aClass187_21;
			local16 = true;
		} else if (arg0 == 128) {
			local18 = Static22.aClass187_34;
			local16 = true;
			local20 = true;
		} else {
			local20 = false;
			local16 = false;
			local18 = Static531.aClass187_33;
		}
		if (local20 != this.aBoolean504) {
			this.aBoolean504 = local20;
			this.method5913();
		}
		if (this.aBoolean515 != local16) {
			this.aBoolean515 = local16;
			this.method5884();
		}
		if (local18 != this.aClass187_26) {
			this.aClass187_26 = local18;
			this.method5992();
		}
		this.anInt7102 &= 0xFFFFFFE3;
		this.anInt7137 = arg0;
	}

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "(III)V")
	@Override
	public final void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7132 == arg0 && this.anInt7104 == arg1 && arg2 == this.anInt7120) {
			return;
		}
		this.anInt7104 = arg1;
		this.anInt7132 = arg0;
		this.anInt7120 = arg2;
		if (this.aBoolean508) {
			return;
		}
		this.method5991();
		this.method5882();
	}

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "(I)V")
	protected final void method5956() {
		@Pc(15) Enumeration local15 = this.aHashtable10.keys();
		while (local15.hasMoreElements()) {
			@Pc(21) Canvas local21 = (Canvas) local15.nextElement();
			this.method5984(this.aHashtable10.get(local21), local21);
		}
		this.anInterface10_8.method7898();
		this.anInterface10_7.method7898();
		this.aClass26_Sub2_27.method3734();
		this.aClass26_Sub2_25.method3734();
		this.aClass26_Sub2_22.method3734();
		this.aClass26_Sub2_30.method3734();
		this.aClass26_Sub2_23.method3734();
		this.aClass255_3.method6380();
		this.anInterface18_7.method7898();
	}

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "()Lclient!m;")
	@Override
	public final Class91 method5829() {
		return new Class91_Sub2();
	}

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "(I)V")
	private void method5957() {
		if (this.anInt7102 == 1) {
			return;
		}
		this.method5893();
		this.method5928(false);
		this.method5886(false);
		this.method5927(false);
		this.method5885(false);
		this.method5997(-2, false, false);
		this.method5979(1);
		this.method5868(this.anInterface3_3);
		this.anInt7102 = 1;
	}

	@OriginalMember(owner = "client!wr", name = "L", descriptor = "(I)V")
	@Override
	public final void L(@OriginalArg(0) int arg0) {
		this.anInt7103 = 0;
		while (arg0 > 1) {
			this.anInt7103++;
			arg0 >>= 0x1;
		}
		this.anInt7115 = 0x1 << this.anInt7103;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)V")
	public final void method5958(@OriginalArg(1) byte arg0) {
		this.method5935(arg0 | arg0 << 16 | arg0 << 24 | arg0 << 8);
	}

	@OriginalMember(owner = "client!wr", name = "M", descriptor = "(F)V")
	@Override
	public final void M(@OriginalArg(0) float arg0) {
		if (this.aFloat165 != arg0) {
			this.aFloat165 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method5892();
			this.method5954();
		}
	}

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "(B)V")
	private void method5959() {
		this.method5999(this.aClass287_16);
		this.method5877(this.anInterface10_7, 0);
		this.method5937(0, 1, Static325.aClass147_7);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[IIIZ)Lclient!wn;")
	public final Interface20 method5960(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		return this.method5876(0, arg0, arg3, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "([I)V")
	@Override
	public final void d(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt7130;
		arg0[0] = this.anInt7124;
		arg0[2] = this.anInt7116;
		arg0[1] = this.anInt7111;
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)Lclient!u;")
	@Override
	public final Class12_Sub36 method5859(@OriginalArg(0) int arg0) {
		@Pc(8) Class12_Sub36_Sub1 local8 = new Class12_Sub36_Sub1(arg0);
		this.aClass73_56.method2012(local8);
		return local8;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public final Class215 method5796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class215_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "(B)[F")
	public final float[] method5961() {
		return this.aFloatArray60;
	}

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "()Lclient!m;")
	@Override
	public final Class91 method5847() {
		return this.aClass91_Sub2_21;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIILclient!dk;I[B)Lclient!uda;")
	public abstract Interface17 method5962(@OriginalArg(3) Class72 arg0, @OriginalArg(5) byte[] arg1);

	@OriginalMember(owner = "client!wr", name = "G", descriptor = "(I)V")
	protected abstract void method5963();

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "()I")
	@Override
	public final int method5825() {
		return this.anInt7101 - 2;
	}

	@OriginalMember(owner = "client!wr", name = "H", descriptor = "(I)V")
	private void method5964() {
		if (this.aClass4_6 == Static86.aClass4_5) {
			@Pc(11) float local11 = this.method5920();
			this.aClass91_Sub2_15.method5510(local11, 0.0F, local11);
		}
		this.aBoolean503 = false;
		this.method5989();
		if (this.aClass21_3 != null) {
			this.aClass21_3.method7546();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIF)Lclient!rh;")
	@Override
	public final Class12_Sub7 method5831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class12_Sub7_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wr", name = "I", descriptor = "(I)V")
	protected abstract void method5965();

	@OriginalMember(owner = "client!wr", name = "J", descriptor = "(I)V")
	public final void method5966() {
		if (this.aClass299Array3[this.anInt7107] != Static339.aClass299_3) {
			this.aClass299Array3[this.anInt7107] = Static339.aClass299_3;
			this.aClass91_Sub2Array3[this.anInt7107].ha();
			this.method5907();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!r;Lclient!hp;Lclient!m;Lclient!kn;I)V")
	@Override
	public final void method5864(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class7_Sub4 arg3) {
		arg0.method8003(arg2, arg3, 0);
		this.method5856(arg1);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILclient!vf;)V")
	public final void method5967(@OriginalArg(1) int arg0, @OriginalArg(2) Class302 arg1) {
		this.method5869(arg0, arg1);
	}

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "(Z)V")
	protected abstract void method5968();

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5789(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas13) {
			throw new RuntimeException();
		} else if (!this.aHashtable10.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) Object local53 = this.method5910(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable10.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "()Z")
	@Override
	public final boolean method5830() {
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "(IIIII)V")
	@Override
	protected final void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILclient!dk;ZI[B)Lclient!wn;")
	public final Interface20 method5969(@OriginalArg(1) int arg0, @OriginalArg(2) Class72 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		return this.method5914(arg2, arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!wr", name = "K", descriptor = "(I)V")
	public final void method5970() {
		if (this.aClass4_6 == Static514.aClass4_4) {
			return;
		}
		@Pc(16) Class4 local16 = this.aClass4_6;
		this.aClass4_6 = Static514.aClass4_4;
		if (local16.method202()) {
			this.method5883();
		}
		this.aFloatArray61 = this.aFloatArray60;
		this.anInt7102 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!wr", name = "M", descriptor = "(I)V")
	protected abstract void method5971();

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!vc;I)V")
	public abstract void method5972(@OriginalArg(0) Class301 arg0);

	@OriginalMember(owner = "client!wr", name = "N", descriptor = "(I)V")
	private void method5973() {
		if (Static478.aClass4_7 == this.aClass4_6) {
			return;
		}
		@Pc(10) Class4 local10 = this.aClass4_6;
		this.aClass4_6 = Static478.aClass4_7;
		if (!local10.method202()) {
			this.method5883();
		}
		this.method5929();
		this.aFloatArray61 = this.aFloatArray62;
		this.method5943();
		this.anInt7102 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "(B)V")
	public final void method5974() {
		this.method5919(Static338.aClass147_3, 2);
	}

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "(B)Lclient!og;")
	public final Class91_Sub2 method5975() {
		return this.aClass91_Sub2Array3[this.anInt7107];
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!kn;I)V")
	@Override
	public final void method5860(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class7_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method8003(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "(B)I")
	public final int method5976() {
		return this.anInt7118;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	@Override
	public final void method5797(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5846(@OriginalArg(0) Canvas arg0) {
		this.aCanvas14 = null;
		this.anObject12 = null;
		if (arg0 == null || this.aCanvas13 == arg0) {
			this.anObject12 = this.anObject11;
			this.aCanvas14 = this.aCanvas13;
		} else if (this.aHashtable10.containsKey(arg0)) {
			this.anObject12 = this.aHashtable10.get(arg0);
			this.aCanvas14 = arg0;
		}
		if (this.aCanvas14 == null || this.anObject12 == null) {
			throw new RuntimeException();
		}
		this.method5896(this.aCanvas14, this.anObject12);
		this.method5912();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!og;)V")
	public final void method5977(@OriginalArg(1) Class91_Sub2 arg0) {
		this.aClass91_Sub2_15.EA(arg0);
		this.aBoolean497 = false;
		this.method5964();
	}

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "()Z")
	@Override
	public final boolean method5849() {
		return true;
	}

	@OriginalMember(owner = "client!wr", name = "CA", descriptor = "()I")
	@Override
	public final int CA() {
		return this.anInt7128;
	}

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "(II)Lclient!cj;")
	protected Class21 method5978(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class21_Sub9(this);
		} else if (arg0 == 1) {
			return new Class21_Sub3(this);
		} else if (arg0 == 2) {
			return new Class21_Sub2(this, this.aClass236_5);
		} else if (arg0 == 7) {
			return new Class21_Sub8(this);
		} else {
			return new Class21_Sub6(this);
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(IB)V")
	public final void method5979(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method5945(Static191.aClass129_3, Static191.aClass129_3);
		} else if (arg0 == 0) {
			this.method5945(Static506.aClass129_5, Static506.aClass129_5);
		} else if (arg0 == 2) {
			this.method5945(Static191.aClass129_3, Static159.aClass129_2);
		} else if (arg0 == 3) {
			this.method5945(Static506.aClass129_5, Static88.aClass129_1);
		} else if (arg0 == 4) {
			this.method5945(Static463.aClass129_4, Static463.aClass129_4);
			return;
		}
	}

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "(B)V")
	private void method5980() {
		this.aBoolean510 = false;
		this.method5929();
		if (Static478.aClass4_7 == this.aClass4_6) {
			this.method5943();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!ln;IIII)Lclient!r;")
	@Override
	public final Class26 method5812(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class26_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public final void method5855(@OriginalArg(0) Class91 arg0) {
		this.aClass91_Sub2_16 = (Class91_Sub2) arg0;
		this.aClass91_Sub2_18.EA(this.aClass91_Sub2_16);
		this.aClass91_Sub2_18.method5499();
		this.aClass91_Sub2_19.method5489(this.aClass91_Sub2_18);
		this.aClass91_Sub2_17.method5489(this.aClass91_Sub2_16);
		if (this.aClass4_6.method202()) {
			this.method5883();
		}
	}

	@OriginalMember(owner = "client!wr", name = "O", descriptor = "(I)V")
	protected void method5981() {
		this.anInt7135 = this.anInt7139;
		this.anInt7139 = 0;
	}

	@OriginalMember(owner = "client!wr", name = "P", descriptor = "(I)Lclient!jg;")
	public final Interface8 method5982() {
		return this.aClass124_Sub2_3 == null ? null : this.aClass124_Sub2_3.method4974();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZZILclient!vf;I)V")
	public abstract void method5983(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class302 arg3);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!hp;)V")
	@Override
	public final void method5856(@OriginalArg(0) Class136 arg0) {
		this.aClass255_3.method6385(this, arg0);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method5984(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(ZI)V")
	public abstract void method5985(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "()Z")
	@Override
	public final boolean method5843() {
		return true;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZILclient!uj;IIILclient!io;)V")
	public abstract void method5986(@OriginalArg(1) int arg0, @OriginalArg(2) Interface18 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class147 arg5);

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method5920();
		this.method5957();
		this.method5935(arg4);
		this.method5951(Static371.aClass302_2, 0);
		this.method5967(0, Static371.aClass302_2);
		this.method5955(arg5);
		this.aClass91_Sub2_15.method5504(1.0F, (float) (arg2 - 1), (float) (arg3 - 1));
		this.aClass91_Sub2_15.method5510((float) arg0 - local7, 0.0F, (float) arg1 - local7);
		this.method5964();
		this.method5985(false);
		this.method5919(Static194.aClass147_4, 4);
		this.method5985(true);
		this.method5967(0, Static159.aClass302_1);
		this.method5951(Static159.aClass302_1, 0);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public final Class84 method5817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class84_Sub2 local11 = new Class84_Sub2(this, arg2, arg3, arg4);
		local11.P(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!wr", name = "Q", descriptor = "(I)Lclient!og;")
	public final Class91_Sub2 method5987() {
		return this.aClass91_Sub2_19;
	}

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "()V")
	@Override
	public final void method5841() {
		this.aClass39_3.method866();
	}

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "(B)V")
	public final void method5988() {
		if (this.anInt7102 == 16) {
			return;
		}
		this.method5897();
		this.method5928(true);
		this.method5927(true);
		this.method5885(true);
		this.method5955(1);
		this.anInt7102 = 16;
	}

	@OriginalMember(owner = "client!wr", name = "R", descriptor = "(I)V")
	protected abstract void method5989();

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(Z)V")
	@Override
	public final void method5863(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wr", name = "S", descriptor = "(I)V")
	public final void method5990() {
		this.aClass91_Sub2_15.ha();
		this.aBoolean497 = true;
		this.method5964();
	}

	@OriginalMember(owner = "client!wr", name = "T", descriptor = "(I)V")
	private void method5991() {
		if (this.aClass21_3 != null) {
			this.aClass21_3.method7551();
		}
		this.method5878();
	}

	@OriginalMember(owner = "client!wr", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt7096 + this.anInt7093 + this.anInt7094;
	}

	@OriginalMember(owner = "client!wr", name = "U", descriptor = "(I)V")
	protected abstract void method5992();

	@OriginalMember(owner = "client!wr", name = "N", descriptor = "(IIII)V")
	@Override
	public final void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7116 = arg2 <= this.anInt7027 ? arg2 : 0;
		this.anInt7130 = arg3 > this.anInt7027 ? 0 : arg3;
		this.anInt7124 = arg0 < 0 ? 0 : arg0;
		this.anInt7111 = arg1 >= 0 ? arg1 : 0;
		if (this.anInt7124 <= 0 && this.anInt7027 <= this.anInt7116 && this.anInt7111 <= 0 && this.anInt7130 >= this.anInt7054) {
			this.n();
			return;
		}
		if (!this.aBoolean516) {
			this.aBoolean516 = true;
			this.method5925();
		}
		this.method5924();
		this.method5890();
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)V")
	@Override
	public final void method5815(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt7113 = arg0;
		this.aClass39_3.method866();
	}

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "(B)Lclient!og;")
	public final Class91_Sub2 method5994() {
		return this.aClass91_Sub2_15;
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "()Z")
	@Override
	public final boolean method5808() {
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "W", descriptor = "(I)V")
	private void method5995() {
		if (this.aBoolean498) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray64;
		this.aBoolean498 = true;
		if (this.anInt7027 != 0 && this.anInt7054 != 0) {
			local5[2] = 0.0F;
			local5[3] = 0.0F;
			local5[14] = 0.5F;
			local5[13] = 1.0F;
			local5[8] = 0.0F;
			local5[11] = 0.0F;
			local5[0] = 2.0F / (float) this.anInt7027;
			local5[1] = 0.0F;
			local5[9] = 0.0F;
			local5[7] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt7054;
			local5[15] = 1.0F;
			local5[6] = 0.0F;
			local5[4] = 0.0F;
			local5[10] = 0.5F;
			local5[12] = -1.0F;
			return;
		}
		local5[10] = 1.0F;
		local5[6] = 0.0F;
		local5[2] = 0.0F;
		local5[12] = 0.0F;
		local5[1] = 0.0F;
		local5[14] = 0.0F;
		local5[3] = 0.0F;
		local5[13] = 0.0F;
		local5[5] = 1.0F;
		local5[0] = 1.0F;
		local5[8] = 0.0F;
		local5[7] = 0.0F;
		local5[15] = 1.0F;
		local5[4] = 0.0F;
		local5[11] = 0.0F;
		local5[9] = 0.0F;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[Lclient!rh;)V")
	@Override
	public final void method5824(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub7[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass12_Sub7Array4[local3] = arg1[local3];
		}
		this.anInt7139 = arg0;
		if (this.aClass4_6.method202()) {
			this.method5981();
		}
	}

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "(II)V")
	public abstract void method5996(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(II)I")
	@Override
	public final int method5857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public final void method5814(@OriginalArg(0) Class12_Sub36 arg0) {
		this.aNativeHeap5 = ((Class12_Sub36_Sub1) arg0).aNativeHeap4;
		this.aNativeHeapBuffer5 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIII)Lclient!sv;")
	@Override
	public final Class124 method5790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class124_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIZZ)V")
	public final void method5997(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt7133 != arg0) {
			if (arg0 < 0) {
				this.method5966();
				this.method5868(null);
				this.method5979(0);
				if (!this.aBoolean508) {
					this.method5873(0, 0, arg2, arg1, 0);
				}
			} else {
				@Pc(48) Interface20 local48 = this.aClass39_3.method862(arg0);
				@Pc(54) Class278 local54 = super.anInterface11_11.method6215(arg0);
				if (local54.aByte82 == 0 && local54.aByte88 == 0) {
					this.method5966();
				} else {
					@Pc(78) int local78 = local54.aBoolean567 ? 64 : 128;
					@Pc(82) int local82 = local78 * 50;
					@Pc(86) Class91_Sub2 local86 = this.method5903();
					local86.method5500(0.0F, (float) (this.anInt7105 % local82 * local54.aByte82) / (float) local82, (float) (this.anInt7105 % local82 * local54.aByte88) / (float) local82);
					this.method5918(Static261.aClass299_2);
				}
				if (!this.aBoolean508) {
					this.method5873(local54.anInt8271, local54.aByte83, arg2, arg1, local54.aByte87);
				}
				if (this.aClass21_3 == null) {
					this.method5868(local48);
					this.method5979(local54.anInt8273);
				} else {
					this.aClass21_3.method7544(local48, local54.anInt8273);
				}
			}
			this.anInt7133 = arg0;
		}
		this.anInt7102 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wr", name = "X", descriptor = "(I)V")
	public final void method5998() {
		this.method5970();
		this.method5943();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!tq;I)V")
	public abstract void method5999(@OriginalArg(0) Class287 arg0);

	@OriginalMember(owner = "client!wr", name = "Y", descriptor = "(I)V")
	private void method6000() {
		this.aBoolean498 = false;
		if (Static86.aClass4_5 == this.aClass4_6) {
			this.method5995();
			this.method5943();
		}
	}
}
