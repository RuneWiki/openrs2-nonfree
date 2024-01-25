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

@OriginalClass("client!ifa")
public abstract class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!ifa", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!ifa", name = "X", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!ifa", name = "gb", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!ifa", name = "Ob", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!ifa", name = "cc", descriptor = "Lclient!vt;")
	protected Class348 aClass348_4;

	@OriginalMember(owner = "client!ifa", name = "Od", descriptor = "I")
	public int anInt4931;

	@OriginalMember(owner = "client!ifa", name = "Pd", descriptor = "I")
	public int anInt4932;

	@OriginalMember(owner = "client!ifa", name = "Rd", descriptor = "I")
	protected int anInt4934;

	@OriginalMember(owner = "client!ifa", name = "fe", descriptor = "Lclient!jba;")
	private Class168 aClass168_3;

	@OriginalMember(owner = "client!ifa", name = "he", descriptor = "I")
	public int anInt4941;

	@OriginalMember(owner = "client!ifa", name = "ke", descriptor = "[Lclient!vg;")
	protected Class340[] aClass340Array3;

	@OriginalMember(owner = "client!ifa", name = "ne", descriptor = "[Lclient!dd;")
	protected Class8_Sub3[] aClass8_Sub3Array3;

	@OriginalMember(owner = "client!ifa", name = "oe", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!ifa", name = "qe", descriptor = "Z")
	protected boolean aBoolean338;

	@OriginalMember(owner = "client!ifa", name = "re", descriptor = "F")
	private float aFloat144;

	@OriginalMember(owner = "client!ifa", name = "te", descriptor = "[Lclient!gga;")
	protected Class117[] aClass117Array5;

	@OriginalMember(owner = "client!ifa", name = "ve", descriptor = "I")
	public int anInt4945;

	@OriginalMember(owner = "client!ifa", name = "we", descriptor = "F")
	private float aFloat145;

	@OriginalMember(owner = "client!ifa", name = "Be", descriptor = "F")
	public float aFloat147;

	@OriginalMember(owner = "client!ifa", name = "Fe", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!ifa", name = "Ge", descriptor = "I")
	protected int anInt4948;

	@OriginalMember(owner = "client!ifa", name = "Ne", descriptor = "Lclient!ge;")
	private Class36_Sub1 aClass36_Sub1_3;

	@OriginalMember(owner = "client!ifa", name = "Xe", descriptor = "Z")
	public boolean aBoolean345;

	@OriginalMember(owner = "client!ifa", name = "Ye", descriptor = "I")
	public int anInt4957;

	@OriginalMember(owner = "client!ifa", name = "Ze", descriptor = "F")
	public float aFloat152;

	@OriginalMember(owner = "client!ifa", name = "af", descriptor = "I")
	protected int anInt4958;

	@OriginalMember(owner = "client!ifa", name = "df", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!ifa", name = "ff", descriptor = "I")
	protected int anInt4959;

	@OriginalMember(owner = "client!ifa", name = "hf", descriptor = "Z")
	public boolean aBoolean348;

	@OriginalMember(owner = "client!ifa", name = "lf", descriptor = "I")
	public int anInt4961;

	@OriginalMember(owner = "client!ifa", name = "nf", descriptor = "I")
	private int anInt4962;

	@OriginalMember(owner = "client!ifa", name = "of", descriptor = "Lclient!oa;")
	public Interface16 anInterface16_3;

	@OriginalMember(owner = "client!ifa", name = "uf", descriptor = "[Lclient!gga;")
	protected Class117[] aClass117Array6;

	@OriginalMember(owner = "client!ifa", name = "vf", descriptor = "Z")
	protected boolean aBoolean351;

	@OriginalMember(owner = "client!ifa", name = "Af", descriptor = "F")
	public float aFloat157;

	@OriginalMember(owner = "client!ifa", name = "Bf", descriptor = "I")
	private int anInt4967;

	@OriginalMember(owner = "client!ifa", name = "Cf", descriptor = "I")
	protected int anInt4968;

	@OriginalMember(owner = "client!ifa", name = "Ff", descriptor = "[Lclient!oa;")
	private Interface16[] anInterface16Array3;

	@OriginalMember(owner = "client!ifa", name = "Kf", descriptor = "Lclient!jfa;")
	private Class38 aClass38_3;

	@OriginalMember(owner = "client!ifa", name = "Mf", descriptor = "Z")
	public boolean aBoolean354;

	@OriginalMember(owner = "client!ifa", name = "Qf", descriptor = "[Lclient!ul;")
	protected Class4_Sub24[] aClass4_Sub24Array4;

	@OriginalMember(owner = "client!ifa", name = "Yf", descriptor = "Lclient!nk;")
	public Class57_Sub3 aClass57_Sub3_21;

	@OriginalMember(owner = "client!ifa", name = "Zf", descriptor = "Lclient!nk;")
	public Class57_Sub3 aClass57_Sub3_22;

	@OriginalMember(owner = "client!ifa", name = "ag", descriptor = "Lclient!fj;")
	private Class3 aClass3_15;

	@OriginalMember(owner = "client!ifa", name = "bg", descriptor = "Lclient!nk;")
	public Class57_Sub3 aClass57_Sub3_23;

	@OriginalMember(owner = "client!ifa", name = "cg", descriptor = "Lclient!nk;")
	public Class57_Sub3 aClass57_Sub3_24;

	@OriginalMember(owner = "client!ifa", name = "dg", descriptor = "Lclient!el;")
	private Interface9 anInterface9_10;

	@OriginalMember(owner = "client!ifa", name = "eg", descriptor = "Lclient!nk;")
	public Class57_Sub3 aClass57_Sub3_25;

	@OriginalMember(owner = "client!ifa", name = "fg", descriptor = "Lclient!el;")
	private Interface9 anInterface9_11;

	@OriginalMember(owner = "client!ifa", name = "gg", descriptor = "Lclient!fj;")
	public Class3 aClass3_16;

	@OriginalMember(owner = "client!ifa", name = "hg", descriptor = "Lclient!nk;")
	public Class57_Sub3 aClass57_Sub3_26;

	@OriginalMember(owner = "client!ifa", name = "ig", descriptor = "Lclient!fj;")
	public Class3 aClass3_17;

	@OriginalMember(owner = "client!ifa", name = "jg", descriptor = "Lclient!fj;")
	public Class3 aClass3_18;

	@OriginalMember(owner = "client!ifa", name = "kg", descriptor = "Lclient!fj;")
	public Class3 aClass3_19;

	@OriginalMember(owner = "client!ifa", name = "lg", descriptor = "Lclient!nk;")
	public Class57_Sub3 aClass57_Sub3_27;

	@OriginalMember(owner = "client!ifa", name = "ng", descriptor = "Lclient!cda;")
	private Interface3 anInterface3_4;

	@OriginalMember(owner = "client!ifa", name = "og", descriptor = "Lclient!nk;")
	public Class57_Sub3 aClass57_Sub3_28;

	@OriginalMember(owner = "client!ifa", name = "pg", descriptor = "Lclient!fj;")
	private Class3 aClass3_20;

	@OriginalMember(owner = "client!ifa", name = "qg", descriptor = "Lclient!nk;")
	public Class57_Sub3 aClass57_Sub3_29;

	@OriginalMember(owner = "client!ifa", name = "rg", descriptor = "Lclient!nk;")
	public Class57_Sub3 aClass57_Sub3_30;

	@OriginalMember(owner = "client!ifa", name = "sg", descriptor = "I")
	private int anInt4976;

	@OriginalMember(owner = "client!ifa", name = "tg", descriptor = "Z")
	protected boolean aBoolean357;

	@OriginalMember(owner = "client!ifa", name = "Pb", descriptor = "Lclient!oe;")
	private final Class244 aClass244_37 = new Class244();

	@OriginalMember(owner = "client!ifa", name = "Td", descriptor = "Z")
	protected boolean aBoolean336 = true;

	@OriginalMember(owner = "client!ifa", name = "Ld", descriptor = "Lclient!dd;")
	protected final Class8_Sub3 aClass8_Sub3_15 = new Class8_Sub3();

	@OriginalMember(owner = "client!ifa", name = "Vd", descriptor = "Lclient!dd;")
	public Class8_Sub3 aClass8_Sub3_16 = new Class8_Sub3();

	@OriginalMember(owner = "client!ifa", name = "Wd", descriptor = "Lclient!dd;")
	public final Class8_Sub3 aClass8_Sub3_17 = new Class8_Sub3();

	@OriginalMember(owner = "client!ifa", name = "Xd", descriptor = "Lclient!dd;")
	protected final Class8_Sub3 aClass8_Sub3_18 = new Class8_Sub3();

	@OriginalMember(owner = "client!ifa", name = "Yd", descriptor = "Lclient!dd;")
	private final Class8_Sub3 aClass8_Sub3_19 = new Class8_Sub3();

	@OriginalMember(owner = "client!ifa", name = "Zd", descriptor = "Lclient!dd;")
	private final Class8_Sub3 aClass8_Sub3_20 = new Class8_Sub3();

	@OriginalMember(owner = "client!ifa", name = "de", descriptor = "[F")
	public final float[] aFloatArray30 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!ifa", name = "ae", descriptor = "I")
	private int anInt4937 = 0;

	@OriginalMember(owner = "client!ifa", name = "me", descriptor = "I")
	public int anInt4943 = -1;

	@OriginalMember(owner = "client!ifa", name = "ee", descriptor = "I")
	public int anInt4939 = 3;

	@OriginalMember(owner = "client!ifa", name = "He", descriptor = "I")
	public int anInt4949 = 512;

	@OriginalMember(owner = "client!ifa", name = "je", descriptor = "F")
	public float aFloat142 = 1.0F;

	@OriginalMember(owner = "client!ifa", name = "ye", descriptor = "Z")
	protected boolean aBoolean340 = true;

	@OriginalMember(owner = "client!ifa", name = "ce", descriptor = "I")
	protected int anInt4938 = 0;

	@OriginalMember(owner = "client!ifa", name = "Ke", descriptor = "Z")
	protected boolean aBoolean342 = true;

	@OriginalMember(owner = "client!ifa", name = "Te", descriptor = "I")
	public int anInt4954 = 0;

	@OriginalMember(owner = "client!ifa", name = "ze", descriptor = "F")
	public float aFloat146 = -1.0F;

	@OriginalMember(owner = "client!ifa", name = "le", descriptor = "I")
	private int anInt4942 = 0;

	@OriginalMember(owner = "client!ifa", name = "We", descriptor = "I")
	private int anInt4956 = 16777215;

	@OriginalMember(owner = "client!ifa", name = "Le", descriptor = "[F")
	private final float[] aFloatArray33 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ifa", name = "xe", descriptor = "Z")
	protected boolean aBoolean339 = true;

	@OriginalMember(owner = "client!ifa", name = "Je", descriptor = "I")
	protected final int anInt4951 = 0;

	@OriginalMember(owner = "client!ifa", name = "se", descriptor = "I")
	protected final int anInt4944 = 0;

	@OriginalMember(owner = "client!ifa", name = "Ce", descriptor = "I")
	private int anInt4946 = -1;

	@OriginalMember(owner = "client!ifa", name = "Ie", descriptor = "I")
	public int anInt4950 = -1;

	@OriginalMember(owner = "client!ifa", name = "bf", descriptor = "I")
	public int bf = 512;

	@OriginalMember(owner = "client!ifa", name = "Ae", descriptor = "Z")
	private boolean aBoolean341 = false;

	@OriginalMember(owner = "client!ifa", name = "mf", descriptor = "Z")
	protected boolean aBoolean350 = false;

	@OriginalMember(owner = "client!ifa", name = "De", descriptor = "I")
	private int anInt4947 = 1;

	@OriginalMember(owner = "client!ifa", name = "rf", descriptor = "I")
	public int anInt4964 = 8;

	@OriginalMember(owner = "client!ifa", name = "Qe", descriptor = "Z")
	private boolean aBoolean344 = false;

	@OriginalMember(owner = "client!ifa", name = "yf", descriptor = "F")
	public float aFloat156 = 1.0F;

	@OriginalMember(owner = "client!ifa", name = "tf", descriptor = "F")
	public float aFloat155 = -1.0F;

	@OriginalMember(owner = "client!ifa", name = "Ue", descriptor = "F")
	private float aFloat151 = 1.0F;

	@OriginalMember(owner = "client!ifa", name = "ef", descriptor = "Z")
	private boolean aBoolean346 = false;

	@OriginalMember(owner = "client!ifa", name = "Ve", descriptor = "I")
	protected int anInt4955 = 0;

	@OriginalMember(owner = "client!ifa", name = "sf", descriptor = "I")
	public int anInt4965 = 50;

	@OriginalMember(owner = "client!ifa", name = "kf", descriptor = "I")
	private int anInt4960 = -1;

	@OriginalMember(owner = "client!ifa", name = "be", descriptor = "Z")
	protected boolean aBoolean337 = false;

	@OriginalMember(owner = "client!ifa", name = "Ee", descriptor = "F")
	public float aFloat148 = 3584.0F;

	@OriginalMember(owner = "client!ifa", name = "Pe", descriptor = "[F")
	private final float[] aFloatArray34 = new float[16];

	@OriginalMember(owner = "client!ifa", name = "Oe", descriptor = "I")
	private int anInt4952 = 0;

	@OriginalMember(owner = "client!ifa", name = "wf", descriptor = "I")
	protected int anInt4966 = 0;

	@OriginalMember(owner = "client!ifa", name = "Se", descriptor = "F")
	public float aFloat150 = 1.0F;

	@OriginalMember(owner = "client!ifa", name = "jf", descriptor = "Z")
	private boolean aBoolean349 = false;

	@OriginalMember(owner = "client!ifa", name = "Jf", descriptor = "Z")
	protected boolean aBoolean353 = true;

	@OriginalMember(owner = "client!ifa", name = "Hf", descriptor = "[F")
	private final float[] aFloatArray36 = new float[16];

	@OriginalMember(owner = "client!ifa", name = "ie", descriptor = "[Lclient!jfa;")
	private final Class38[] aClass38Array3 = new Class38[10];

	@OriginalMember(owner = "client!ifa", name = "Me", descriptor = "Z")
	protected boolean aBoolean343 = false;

	@OriginalMember(owner = "client!ifa", name = "Nf", descriptor = "I")
	protected int anInt4971 = 0;

	@OriginalMember(owner = "client!ifa", name = "Gf", descriptor = "[F")
	public final float[] aFloatArray35 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ifa", name = "Of", descriptor = "Z")
	private boolean aBoolean355 = false;

	@OriginalMember(owner = "client!ifa", name = "cf", descriptor = "F")
	public float aFloat153 = 1.0F;

	@OriginalMember(owner = "client!ifa", name = "xf", descriptor = "Lclient!rf;")
	protected Class288 aClass288_5 = Static591.aClass288_7;

	@OriginalMember(owner = "client!ifa", name = "Pf", descriptor = "F")
	public float aFloat158 = 3584.0F;

	@OriginalMember(owner = "client!ifa", name = "Rf", descriptor = "I")
	public int anInt4972 = 0;

	@OriginalMember(owner = "client!ifa", name = "Lf", descriptor = "[F")
	private final float[] aFloatArray37 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ifa", name = "pf", descriptor = "Lclient!gv;")
	protected Class128 aClass128_5 = Static136.aClass128_3;

	@OriginalMember(owner = "client!ifa", name = "Df", descriptor = "I")
	protected int anInt4969 = 0;

	@OriginalMember(owner = "client!ifa", name = "If", descriptor = "Z")
	protected boolean aBoolean352 = false;

	@OriginalMember(owner = "client!ifa", name = "ue", descriptor = "[F")
	private final float[] aFloatArray32 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ifa", name = "Re", descriptor = "I")
	public int anInt4953 = 0;

	@OriginalMember(owner = "client!ifa", name = "Uf", descriptor = "[F")
	private final float[] aFloatArray38 = new float[16];

	@OriginalMember(owner = "client!ifa", name = "gf", descriptor = "Z")
	private boolean aBoolean347 = false;

	@OriginalMember(owner = "client!ifa", name = "Vf", descriptor = "I")
	protected int anInt4974 = 3584;

	@OriginalMember(owner = "client!ifa", name = "pe", descriptor = "[F")
	protected float[] aFloatArray31 = this.aFloatArray37;

	@OriginalMember(owner = "client!ifa", name = "qf", descriptor = "I")
	private int anInt4963 = -1;

	@OriginalMember(owner = "client!ifa", name = "Sf", descriptor = "I")
	private int anInt4973 = 0;

	@OriginalMember(owner = "client!ifa", name = "Wf", descriptor = "I")
	public int anInt4975 = 128;

	@OriginalMember(owner = "client!ifa", name = "Xf", descriptor = "Z")
	protected boolean aBoolean356 = true;

	@OriginalMember(owner = "client!ifa", name = "Tf", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream3 = new Stream();

	@OriginalMember(owner = "client!ifa", name = "mg", descriptor = "Lclient!dd;")
	private final Class8_Sub3 aClass8_Sub3_21 = new Class8_Sub3();

	@OriginalMember(owner = "client!ifa", name = "Nb", descriptor = "Lclient!jn;")
	protected final Class176 aClass176_68;

	@OriginalMember(owner = "client!ifa", name = "J", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas7;

	@OriginalMember(owner = "client!ifa", name = "Eb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!ifa", name = "Ef", descriptor = "I")
	protected final int anInt4970;

	@OriginalMember(owner = "client!ifa", name = "vb", descriptor = "Ljava/lang/Object;")
	protected final Object anObject13;

	@OriginalMember(owner = "client!ifa", name = "Vc", descriptor = "Ljava/lang/Object;")
	private Object anObject14;

	@OriginalMember(owner = "client!ifa", name = "vd", descriptor = "I")
	private int anInt4913;

	@OriginalMember(owner = "client!ifa", name = "kb", descriptor = "I")
	public int anInt4807;

	@OriginalMember(owner = "client!ifa", name = "Ac", descriptor = "I")
	private int anInt4867;

	@OriginalMember(owner = "client!ifa", name = "wd", descriptor = "I")
	public int anInt4914;

	@OriginalMember(owner = "client!ifa", name = "ge", descriptor = "I")
	public final int anInt4940;

	@OriginalMember(owner = "client!ifa", name = "Q", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!ifa", name = "zf", descriptor = "Lclient!bj;")
	private final Class35 aClass35_3;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!fa;Lclient!jn;II)V")
	protected Class44_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) Class176 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.aClass176_68 = arg3;
		this.aCanvas8 = this.aCanvas7 = arg0;
		this.anInt4970 = arg4;
		this.anObject14 = this.anObject13 = arg1;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt4807 = this.anInt4913 = local307.height;
		this.anInt4914 = this.anInt4867 = local307.width;
		this.anInt4940 = arg5;
		Static512.method7483(false, true);
		if (super.anInterface11_11 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt4940);
			this.aClass35_3 = null;
		} else {
			this.aClass35_3 = new Class35(this, super.anInterface11_11);
			this.aNativeInterface3 = new NativeInterface(super.anInterface11_11.method7410(), this.anInt4940);
			for (@Pc(364) int local364 = 0; local364 < super.anInterface11_11.method7410(); local364++) {
				@Pc(372) Class14 local372 = super.anInterface11_11.method7405(local364);
				if (local372 != null) {
					this.aNativeInterface3.initTextureMetrics(local364, local372.aByte7, local372.aByte8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(B)V")
	private void method4239() {
		this.method4249();
		if (this.aClass38_3 != null) {
			this.aClass38_3.method7438();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(B)V")
	public abstract void method4240();

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!uf;I)V")
	public final void method4241(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		this.method4258(false, arg0, arg1, false);
	}

	@OriginalMember(owner = "client!ifa", name = "h", descriptor = "(I)V")
	public final void method4242() {
		if (this.aClass128_5 == Static136.aClass128_3) {
			return;
		}
		@Pc(12) Class128 local12 = this.aClass128_5;
		this.aClass128_5 = Static136.aClass128_3;
		if (local12.method3186()) {
			this.method4305();
		}
		this.aFloatArray31 = this.aFloatArray37;
		this.anInt4967 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ifa", name = "XA", descriptor = "(IIIII)V")
	@Override
	public final void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5001(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BLclient!gga;Lclient!gga;)V")
	public final void method4243(@OriginalArg(1) Class117 arg0, @OriginalArg(2) Class117 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg1 != this.aClass117Array5[this.anInt4955]) {
			this.aClass117Array5[this.anInt4955] = arg1;
			this.method4317();
			local5 = true;
		}
		if (this.aClass117Array6[this.anInt4955] != arg0) {
			this.aClass117Array6[this.anInt4955] = arg0;
			local5 = true;
			this.method4308();
		}
		if (local5) {
			this.anInt4967 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BZ)V")
	public final void method4244(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean352 != arg0) {
			this.aBoolean352 = arg0;
			this.method4282();
			this.anInt4967 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZI)Lclient!cda;")
	public abstract Interface3 method4245(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(Z)V")
	protected abstract void method4246();

	@OriginalMember(owner = "client!ifa", name = "i", descriptor = "(I)V")
	public final void method4247() {
		if (Static60.aClass340_1 != this.aClass340Array3[this.anInt4955]) {
			this.aClass340Array3[this.anInt4955] = Static60.aClass340_1;
			this.aClass8_Sub3Array3[this.anInt4955].Y();
			this.method4303();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "L", descriptor = "()V")
	@Override
	public final void L() {
		this.aBoolean348 = false;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ)V")
	public final void method4248(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean343 != arg0) {
			this.aBoolean343 = arg0;
			this.method4306();
			this.anInt4967 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "(B)V")
	protected abstract void method4249();

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ[III)Lclient!co;")
	public final Interface6 method4250(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		return this.method4259(arg2, 0, arg0, 0, arg1, arg3);
	}

	@OriginalMember(owner = "client!ifa", name = "va", descriptor = "(I)V")
	@Override
	public final void va(@OriginalArg(0) int arg0) {
		this.anInt4939 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt4939++;
		}
		this.anInt4964 = 0x1 << this.anInt4939;
	}

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "(Z)V")
	public final void method4251() {
		if (this.anInt4967 == 16) {
			return;
		}
		this.method4300();
		this.method4270(true);
		this.method4269(true);
		this.method4248(true);
		this.method4321(1);
		this.anInt4967 = 16;
	}

	@OriginalMember(owner = "client!ifa", name = "j", descriptor = "(I)V")
	private void method4252() {
		if (this.aClass38_3 != null) {
			this.aClass38_3.method7429();
		}
		this.method4325();
	}

	@OriginalMember(owner = "client!ifa", name = "V", descriptor = "(IIII)V")
	@Override
	public final void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt4971 < arg0) {
			local5 = true;
			this.anInt4971 = arg0;
		}
		if (this.anInt4938 > arg2) {
			this.anInt4938 = arg2;
			local5 = true;
		}
		if (this.anInt4969 < arg1) {
			local5 = true;
			this.anInt4969 = arg1;
		}
		if (this.anInt4966 > arg3) {
			this.anInt4966 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean357) {
			this.aBoolean357 = true;
			this.method4357();
		}
		this.method4246();
		this.method4302();
	}

	@OriginalMember(owner = "client!ifa", name = "u", descriptor = "()Lclient!q;")
	@Override
	public final Class8 method5025() {
		return new Class8_Sub3();
	}

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "(Z)V")
	private void method4253() {
		this.method4320();
		this.method4301();
		this.method4282();
		this.method4354();
		this.method4240();
		this.method4349();
		this.method4283();
		this.method4351();
		this.method4306();
		this.method4263();
		this.method4325();
		this.method4318();
		this.method4336();
		this.method4271();
		for (@Pc(52) int local52 = this.anInt4961 - 1; local52 >= 0; local52--) {
			this.method4267(local52);
			this.method4317();
			this.method4308();
			this.method4247();
		}
		this.method4297();
		this.method4299();
		this.method4249();
		this.method4261();
		this.method4340();
	}

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "(I)V")
	@Override
	public final void method5031(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass35_3 != null) {
			this.aClass35_3.method500();
		}
		this.anInt4975 = arg0;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!gda;[Lclient!pga;Z)Lclient!la;")
	@Override
	public final Class58 method4983(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class261[] arg1) {
		return new Class58_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public final void method4988(@OriginalArg(0) Class4_Sub8 arg0) {
		this.aNativeHeap5 = ((Class4_Sub8_Sub2) arg0).aNativeHeap4;
		this.aNativeHeapBuffer5 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method4978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!ifa", name = "g", descriptor = "(I)V")
	@Override
	public final void method5038(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ifa", name = "da", descriptor = "(IIII)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt4914 - 1 && arg1 <= 0 && arg3 >= this.anInt4807 - 1) {
			this.JA();
			return;
		}
		this.anInt4969 = arg1 < 0 ? 0 : arg1;
		this.anInt4966 = arg3 > this.anInt4914 ? 0 : arg3;
		this.anInt4971 = arg0 >= 0 ? arg0 : 0;
		this.anInt4938 = this.anInt4914 >= arg2 ? arg2 : 0;
		if (!this.aBoolean357) {
			this.aBoolean357 = true;
			this.method4357();
		}
		this.method4246();
		this.method4302();
	}

	@OriginalMember(owner = "client!ifa", name = "z", descriptor = "()Z")
	@Override
	public final boolean method5034() {
		return this.aBoolean351;
	}

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "(B)Lclient!dd;")
	public final Class8_Sub3 method4254() {
		return this.aClass8_Sub3Array3[this.anInt4955];
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(IZ)V")
	public final void method4255(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean356) {
			this.aBoolean356 = arg0;
			this.method4283();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!qf;Z)V")
	private void method4256(@OriginalArg(0) int arg0, @OriginalArg(1) Class271 arg1) {
		this.method4358(0, this.anInterface9_10);
		this.method4374(this.aClass3_20);
		this.method4262(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public final Class78 method5035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class78_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(I)V")
	@Override
	public final void method4991(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ifa", name = "k", descriptor = "(I)V")
	private void method4257() {
		if (this.aClass128_5 == Static464.aClass128_6) {
			return;
		}
		@Pc(13) Class128 local13 = this.aClass128_5;
		this.aClass128_5 = Static464.aClass128_6;
		if (!local13.method3186()) {
			this.method4305();
		}
		this.method4343();
		this.aFloatArray31 = this.aFloatArray34;
		this.method4239();
		this.anInt4967 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZIILclient!uf;Z)V")
	public abstract void method4258(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class328 arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "()Z")
	@Override
	public final boolean method4975() {
		return true;
	}

	@OriginalMember(owner = "client!ifa", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt4974;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "([IIIIIZI)Lclient!co;")
	public abstract Interface6 method4259(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "(B)V")
	public final void method4260() {
		this.method4256(2, Static344.aClass271_6);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public final Class78 method4964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class78_Sub1 local11 = new Class78_Sub1(this, arg2, arg3, arg4);
		local11.da(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!ifa", name = "g", descriptor = "(B)V")
	protected abstract void method4261();

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V")
	@Override
	public void method4973(@OriginalArg(0) int arg0) {
		if (this.aClass35_3 != null) {
			this.aClass35_3.method501();
		}
		this.anInt4957 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "()Z")
	@Override
	public final boolean method4976() {
		return false;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIILclient!qf;)V")
	public abstract void method4262(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class271 arg2);

	@OriginalMember(owner = "client!ifa", name = "JA", descriptor = "()V")
	@Override
	public final void JA() {
		this.anInt4971 = 0;
		this.anInt4966 = this.anInt4807;
		this.anInt4938 = this.anInt4914;
		this.anInt4969 = 0;
		if (this.aBoolean357) {
			this.aBoolean357 = false;
			this.method4357();
		}
		this.method4302();
	}

	@OriginalMember(owner = "client!ifa", name = "h", descriptor = "(B)V")
	protected abstract void method4263();

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method4264(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BLclient!oa;)V")
	public final void method4265(@OriginalArg(1) Interface16 arg0) {
		if (arg0 == this.anInterface16Array3[this.anInt4955]) {
			return;
		}
		this.anInterface16Array3[this.anInt4955] = arg0;
		if (arg0 == null) {
			this.method4363();
		} else {
			arg0.method8267();
		}
		this.anInt4967 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public final void method4995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class6 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!ifa", name = "i", descriptor = "(B)V")
	private void method4266() {
		this.aBoolean341 = false;
		if (this.aClass128_5 == Static498.aClass128_7) {
			this.method4293();
			this.method4239();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "(II)V")
	public final void method4267(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt4955) {
			this.anInt4955 = arg0;
			this.method4373();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "BA", descriptor = "()I")
	@Override
	public final int BA() {
		return this.anInt4965;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BLclient!vg;)V")
	public final void method4268(@OriginalArg(1) Class340 arg0) {
		this.aClass340Array3[this.anInt4955] = arg0;
		this.method4303();
	}

	@OriginalMember(owner = "client!ifa", name = "MA", descriptor = "(III[I)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass8_Sub3_16.method1570((float) arg2, (float) arg0, (float) arg1);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.bf * this.aClass8_Sub3_16.method1583((float) arg1, (float) arg2, (float) arg0) / local14);
			local25 = (int) ((float) this.anInt4949 * this.aClass8_Sub3_16.method1572((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local25 = this.anInt4954;
			local28 = this.anInt4972;
		}
		arg3[1] = (int) ((float) local25 - this.aFloat143);
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local28 - this.aFloat154);
	}

	@OriginalMember(owner = "client!ifa", name = "GA", descriptor = "(II)V")
	@Override
	public final void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4965 == arg0 && arg1 == this.anInt4974) {
			return;
		}
		this.anInt4965 = arg0;
		this.anInt4974 = arg1;
		this.method4309();
		this.method4310();
		this.method4252();
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(ZI)V")
	public final void method4269(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean350 != arg0) {
			this.aBoolean350 = arg0;
			this.method4351();
			this.anInt4967 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public final Class83 method4967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class83_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(IZ)V")
	public final void method4270(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean338 != arg0) {
			this.aBoolean338 = arg0;
			this.method4263();
			this.anInt4967 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public final Class78 method4969(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class78_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ifa", name = "j", descriptor = "(B)V")
	protected abstract void method4271();

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIZZ)V")
	public final void method4272(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt4963 || this.aBoolean349 != this.aBoolean348) {
			@Pc(28) Interface6 local28 = null;
			@Pc(30) int local30 = 0;
			@Pc(32) byte local32 = 0;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41 = this.aBoolean348 ? 3 : 0;
			if (arg0 < 0) {
				this.method4247();
			} else {
				local28 = this.aClass35_3.method504(arg0);
				@Pc(58) Class14 local58 = super.anInterface11_11.method7405(arg0);
				if (local58.aByte4 == 0 && local58.aByte6 == 0) {
					this.method4247();
				} else {
					@Pc(74) int local74 = local58.aBoolean12 ? 64 : 128;
					@Pc(78) int local78 = local74 * 50;
					@Pc(82) Class8_Sub3 local82 = this.method4353();
					local82.method1566((float) (this.anInt4957 % local78 * local58.aByte4) / (float) local78, 0.0F, (float) (this.anInt4957 % local78 * local58.aByte6) / (float) local78);
					this.method4268(Static88.aClass340_2);
				}
				local30 = local58.anInt239;
				if (!this.aBoolean348) {
					local34 = local58.anInt238;
					local41 = local58.aByte9;
					local32 = local58.aByte5;
				}
			}
			this.method4371(arg2, local41, arg1, local32, local34);
			if (this.aClass38_3 == null) {
				this.method4265(local28);
				this.method4335(local30);
			} else {
				this.aClass38_3.method7440(local30, local28);
			}
			this.anInt4963 = arg0;
			this.aBoolean349 = this.aBoolean348;
		}
		this.anInt4967 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ifa", name = "l", descriptor = "(I)V")
	public final void method4273() {
		this.aClass8_Sub3_15.Y();
		this.aBoolean336 = true;
		this.method4284();
	}

	@OriginalMember(owner = "client!ifa", name = "k", descriptor = "(B)V")
	public final void method4274() {
		if (this.anInt4967 == 4) {
			return;
		}
		this.method4298();
		this.method4270(false);
		this.method4244(false);
		this.method4269(false);
		this.method4248(false);
		this.method4272(-2, false, false);
		this.method4321(1);
		this.method4335(0);
		this.anInt4967 = 4;
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)V")
	@Override
	public final void method4980(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "(Z)V")
	public final void method4275() {
		this.aBoolean336 = false;
		this.method4284();
	}

	@OriginalMember(owner = "client!ifa", name = "l", descriptor = "(B)[F")
	public final float[] method4276() {
		return this.aFloatArray37;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZLclient!uf;Z)V")
	protected abstract void method4277(@OriginalArg(0) int arg0, @OriginalArg(2) Class328 arg1);

	@OriginalMember(owner = "client!ifa", name = "m", descriptor = "(B)V")
	public final void method4278() {
		if (this.anInt4967 == 8) {
			return;
		}
		this.method4257();
		this.method4270(true);
		this.method4269(true);
		this.method4248(true);
		this.method4321(1);
		this.anInt4967 = 8;
	}

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "(IZ)V")
	public final void method4279(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean339 != arg0) {
			this.aBoolean339 = arg0;
			this.method4263();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt4976;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!fca;ILclient!bv;)Z")
	public abstract boolean method4280(@OriginalArg(0) Class97 arg0, @OriginalArg(2) Class42 arg1);

	@OriginalMember(owner = "client!ifa", name = "s", descriptor = "()Lclient!q;")
	@Override
	public final Class8 method5020() {
		return this.aClass8_Sub3_16;
	}

	@OriginalMember(owner = "client!ifa", name = "m", descriptor = "(I)Lclient!dd;")
	public final Class8_Sub3 method4281() {
		return this.aClass8_Sub3_15;
	}

	@OriginalMember(owner = "client!ifa", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public final void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt4956 != arg0;
		if (local11 || this.aFloat155 != arg1 || arg2 != this.aFloat146) {
			this.anInt4956 = arg0;
			this.aFloat146 = arg2;
			this.aFloat155 = arg1;
			if (local11) {
				this.aFloat156 = (float) (this.anInt4956 & 0xFF00) / 65280.0F;
				this.aFloat150 = (float) (this.anInt4956 & 0xFF) / 255.0F;
				this.aFloat142 = (float) (this.anInt4956 & 0xFF0000) / 1.671168E7F;
				this.method4320();
			}
			this.aNativeInterface3.setSunColour(this.aFloat142, this.aFloat156, this.aFloat150, arg1, arg2);
			this.method4301();
		}
		if (this.aFloatArray32[0] != arg3 || this.aFloatArray32[1] != arg4 || arg5 != this.aFloatArray32[2]) {
			this.aFloatArray32[2] = arg5;
			this.aFloatArray32[1] = arg4;
			this.aFloatArray32[0] = arg3;
			this.aFloatArray33[1] = -arg4;
			this.aFloatArray33[0] = -arg3;
			this.aFloatArray33[2] = -arg5;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray35[2] = local149 * arg5;
			this.aFloatArray35[1] = arg4 * local149;
			this.aFloatArray35[0] = local149 * arg3;
			this.aFloatArray30[0] = -this.aFloatArray35[0];
			this.aFloatArray30[1] = -this.aFloatArray35[1];
			this.aFloatArray30[2] = -this.aFloatArray35[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray35[0], this.aFloatArray35[1], this.aFloatArray35[2]);
			this.method4240();
			this.anInt4941 = (int) (arg5 * 256.0F / arg4);
			this.anInt4945 = (int) (arg3 * 256.0F / arg4);
		}
		this.method4349();
	}

	@OriginalMember(owner = "client!ifa", name = "g", descriptor = "(Z)V")
	protected abstract void method4282();

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!caa;)V")
	@Override
	public final void method4982(@OriginalArg(0) Class36 arg0) {
		this.aClass36_Sub1_3 = (Class36_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ifa", name = "n", descriptor = "(B)V")
	protected abstract void method4283();

	@OriginalMember(owner = "client!ifa", name = "n", descriptor = "(I)V")
	private void method4284() {
		if (Static498.aClass128_7 == this.aClass128_5) {
			@Pc(11) float local11 = this.method4332();
			this.aClass8_Sub3_15.method1576(0.0F, local11, local11);
		}
		this.aBoolean346 = false;
		this.method4261();
		if (this.aClass38_3 != null) {
			this.aClass38_3.method7442();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(II)I")
	@Override
	public final int method5023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!ifa", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public final boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass8_Sub3_16.method1570((float) arg2, (float) arg0, (float) arg1);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass8_Sub3_16.method1570((float) arg5, (float) arg3, (float) arg4);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if (local14 < (float) this.anInt4965 && (float) this.anInt4965 > local31 || !(!((float) this.anInt4974 < local14) || !((float) this.anInt4974 < local31))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.bf * this.aClass8_Sub3_16.method1583((float) arg1, (float) arg2, (float) arg0) / local14);
		@Pc(99) int local99 = (int) ((float) this.bf * this.aClass8_Sub3_16.method1583((float) arg4, (float) arg5, (float) arg3) / local31);
		if (this.aFloat154 > (float) local81 && this.aFloat154 > (float) local99 || this.aFloat157 < (float) local81 && this.aFloat157 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt4949 * this.aClass8_Sub3_16.method1572((float) arg0, (float) arg2, (float) arg1) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt4949 * this.aClass8_Sub3_16.method1572((float) arg3, (float) arg5, (float) arg4) / local31);
			return (!(this.aFloat143 > (float) local143) || !(this.aFloat143 > (float) local161)) && (!((float) local143 > this.aFloat147) || !((float) local161 > this.aFloat147));
		}
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(ZI)V")
	public final void method4285(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt4948) {
			this.anInt4948 = arg0;
			this.method4297();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(BZ)Lclient!el;")
	public abstract Interface9 method4286(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method4287(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!ifa", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!ifa", name = "m", descriptor = "(IIIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5001(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ifa", name = "o", descriptor = "(I)I")
	public final int method4288() {
		return this.anInt4960;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public final Class6 method4997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static546.method7905(this, arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5012(@OriginalArg(0) Canvas arg0) {
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
			@Pc(53) Object local53 = this.method4287(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!ifa", name = "o", descriptor = "(B)V")
	private void method4289() {
		this.method4358(0, this.anInterface9_11);
		this.method4374(this.aClass3_15);
		this.method4262(1, 0, Static501.aClass271_7);
	}

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "(IZ)V")
	public abstract void method4290(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "(II)Lclient!jfa;")
	protected Class38 method4291(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class38_Sub6(this);
		} else if (arg0 == 1) {
			return new Class38_Sub10(this);
		} else if (arg0 == 2) {
			return new Class38_Sub4(this, this.aClass348_4);
		} else if (arg0 == 7) {
			return new Class38_Sub2(this);
		} else {
			return new Class38_Sub9(this);
		}
	}

	@OriginalMember(owner = "client!ifa", name = "p", descriptor = "(B)V")
	protected final void method4292() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable5.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method4287(local26));
			}
		}
		this.aHashtable5 = local9;
		this.method4347();
		this.method4324();
		this.aClass168_3.method3744(this);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!pga;Z)Lclient!f;")
	@Override
	public final Class78 method5018(@OriginalArg(0) Class261 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(128) Class78 local128;
		if (arg0.anInt7655 == 0 || arg0.anInt7660 == 0) {
			local128 = this.method4969(new int[1], 1, 1, 1);
		} else {
			@Pc(21) int[] local21 = new int[arg0.anInt7655 * arg0.anInt7660];
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg0.aByteArray89 == null) {
				for (local30 = 0; local30 < arg0.anInt7660; local30++) {
					for (local34 = 0; local34 < arg0.anInt7655; local34++) {
						@Pc(47) int local47 = arg0.anIntArray389[arg0.aByteArray90[local23++] & 0xFF];
						local21[local25++] = local47 == 0 ? 0 : local47 | 0xFF000000;
					}
				}
			} else {
				for (local30 = 0; local30 < arg0.anInt7660; local30++) {
					for (local34 = 0; local34 < arg0.anInt7655; local34++) {
						local21[local25++] = arg0.anIntArray389[arg0.aByteArray90[local23] & 0xFF] | arg0.aByteArray89[local23] << 24;
						local23++;
					}
				}
			}
			local128 = this.method4969(local21, arg0.anInt7655, arg0.anInt7655, arg0.anInt7660);
		}
		local128.Q(arg0.anInt7657, arg0.anInt7656, arg0.anInt7658, arg0.anInt7659);
		return local128;
	}

	@OriginalMember(owner = "client!ifa", name = "p", descriptor = "(I)V")
	private void method4293() {
		if (this.aBoolean341) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray38;
		this.aBoolean341 = true;
		if (this.anInt4914 != 0 && this.anInt4807 != 0) {
			local5[14] = 0.5F;
			local5[10] = 0.5F;
			local5[1] = 0.0F;
			local5[9] = 0.0F;
			local5[3] = 0.0F;
			local5[0] = 2.0F / (float) this.anInt4914;
			local5[6] = 0.0F;
			local5[13] = 1.0F;
			local5[11] = 0.0F;
			local5[4] = 0.0F;
			local5[2] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt4807;
			local5[15] = 1.0F;
			local5[7] = 0.0F;
			local5[12] = -1.0F;
			local5[8] = 0.0F;
			return;
		}
		local5[15] = 1.0F;
		local5[6] = 0.0F;
		local5[2] = 0.0F;
		local5[10] = 1.0F;
		local5[3] = 0.0F;
		local5[14] = 0.0F;
		local5[11] = 0.0F;
		local5[13] = 0.0F;
		local5[7] = 0.0F;
		local5[5] = 1.0F;
		local5[9] = 0.0F;
		local5[1] = 0.0F;
		local5[0] = 1.0F;
		local5[4] = 0.0F;
		local5[12] = 0.0F;
		local5[8] = 0.0F;
	}

	@OriginalMember(owner = "client!ifa", name = "q", descriptor = "(I)V")
	public final void method4294() {
		this.aClass117Array5 = new Class117[this.anInt4961];
		this.aClass340Array3 = new Class340[this.anInt4961];
		this.aClass8_Sub3Array3 = new Class8_Sub3[this.anInt4961];
		this.aClass117Array6 = new Class117[this.anInt4961];
		this.anInterface16Array3 = new Interface16[this.anInt4961];
		for (@Pc(32) int local32 = 0; local32 < this.anInt4961; local32++) {
			this.aClass117Array6[local32] = Static573.aClass117_9;
			this.aClass117Array5[local32] = Static573.aClass117_9;
			this.aClass340Array3[local32] = Static60.aClass340_1;
			this.aClass8_Sub3Array3[local32] = new Class8_Sub3();
		}
		this.aClass4_Sub24Array4 = new Class4_Sub24[this.anInt4968 - 2];
		this.anInterface16_3 = this.method4369(1, Static7.aClass97_5, 1, Static53.aClass42_4);
		this.method4988(new Class4_Sub8_Sub2(262144));
		this.aClass3_17 = this.method4314(new Class220[] { new Class220(new Class326[] { Static525.aClass326_1, Static525.aClass326_5 }) });
		this.aClass3_18 = this.method4314(new Class220[] { new Class220(new Class326[] { Static525.aClass326_1, Static525.aClass326_3 }) });
		this.aClass3_19 = this.method4314(new Class220[] { new Class220(Static525.aClass326_1), new Class220(Static525.aClass326_3), new Class220(Static525.aClass326_5), new Class220(Static525.aClass326_2) });
		this.aClass3_16 = this.method4314(new Class220[] { new Class220(Static525.aClass326_1), new Class220(Static525.aClass326_3), new Class220(Static525.aClass326_5) });
		this.aClass57_Sub3_26 = new Class57_Sub3(this, 0, 0, false, false);
		this.aClass57_Sub3_23 = new Class57_Sub3(this, 0, 0, true, true);
		this.aClass57_Sub3_22 = new Class57_Sub3(this, 0, 0, false, false);
		this.aClass57_Sub3_28 = new Class57_Sub3(this, 0, 0, true, true);
		this.aClass57_Sub3_24 = new Class57_Sub3(this, 0, 0, false, false);
		this.aClass57_Sub3_30 = new Class57_Sub3(this, 0, 0, true, true);
		this.aClass57_Sub3_29 = new Class57_Sub3(this, 0, 0, false, false);
		this.aClass57_Sub3_25 = new Class57_Sub3(this, 0, 0, true, true);
		this.aClass57_Sub3_21 = new Class57_Sub3(this, 0, 0, false, false);
		this.aClass57_Sub3_27 = new Class57_Sub3(this, 0, 0, true, true);
		this.aClass168_3 = new Class168(this);
		this.anInterface3_4 = this.method4245(true);
		this.method4292();
		this.aClass348_4 = new Class348(this);
		this.aClass38Array3[1] = this.method4291(1);
		this.aClass38Array3[2] = this.method4291(2);
		this.aClass38Array3[4] = this.method4291(4);
		this.aClass38Array3[5] = this.method4291(5);
		this.aClass38Array3[6] = this.method4291(6);
		this.aClass38Array3[7] = this.method4291(7);
		this.aClass38Array3[3] = this.method4291(3);
		this.aClass38Array3[8] = this.method4291(8);
		this.aClass38Array3[9] = this.method4291(9);
		if (!this.aClass38Array3[2].method7427()) {
			this.aClass38Array3[2] = this.method4291(0);
		}
		if (!this.aClass38Array3[4].method7427()) {
			this.aClass38Array3[4] = this.aClass38Array3[2];
		}
		if (!this.aClass38Array3[8].method7427()) {
			this.aClass38Array3[8] = this.aClass38Array3[4];
		}
		if (!this.aClass38Array3[9].method7427()) {
			this.aClass38Array3[9] = this.aClass38Array3[8];
		}
		this.method4339();
		this.JA();
		this.method4990();
	}

	@OriginalMember(owner = "client!ifa", name = "YA", descriptor = "(IIII)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean348) {
			throw new RuntimeException("");
		}
		this.anInt4962 = arg0;
		this.anInt4946 = arg1;
		this.anInt4952 = arg3;
		this.anInt4960 = arg2;
		if (this.aBoolean349) {
			this.aClass38Array3[3].method7437();
			this.aClass38Array3[3].method7429();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "h", descriptor = "(Z)V")
	public final void method4295() {
		if (this.anInt4967 == 2) {
			return;
		}
		this.method4298();
		this.method4270(false);
		this.method4244(false);
		this.method4269(false);
		this.method4248(false);
		this.method4272(-2, false, false);
		this.anInt4967 = 2;
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt4934 + this.anInt4931 + this.anInt4932;
	}

	@OriginalMember(owner = "client!ifa", name = "r", descriptor = "(I)V")
	private void method4296() {
		if (this.aBoolean344) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray36;
		@Pc(17) float local17 = (float) this.anInt4965;
		@Pc(21) float local21 = (float) this.anInt4974;
		@Pc(33) float local33 = (float) -this.anInt4954 * this.aFloat151 / (float) this.anInt4949;
		@Pc(45) float local45 = this.aFloat151 * (float) -this.anInt4972 / (float) this.bf;
		@Pc(60) float local60 = this.aFloat151 * (float) (this.anInt4914 - this.anInt4972) / (float) this.bf;
		@Pc(75) float local75 = this.aFloat151 * (float) (this.anInt4807 - this.anInt4954) / (float) this.anInt4949;
		if (local60 == local45 || local75 == local33) {
			local13[15] = 1.0F;
			local13[4] = 0.0F;
			local13[7] = 0.0F;
			local13[6] = 0.0F;
			local13[14] = 0.0F;
			local13[8] = 0.0F;
			local13[12] = 0.0F;
			local13[1] = 0.0F;
			local13[3] = 0.0F;
			local13[5] = 1.0F;
			local13[2] = 0.0F;
			local13[0] = 1.0F;
			local13[13] = 0.0F;
			local13[10] = 1.0F;
			local13[11] = 0.0F;
			local13[9] = 0.0F;
		} else {
			local13[6] = 0.0F;
			local13[13] = (local75 + local33) / (-local33 + local75);
			local13[7] = 0.0F;
			local13[3] = 0.0F;
			local13[0] = 2.0F / (local60 - local45);
			local13[14] = local17 / (local17 - local21);
			local13[15] = 1.0F;
			local13[12] = (local60 + local45) / (local45 - local60);
			local13[4] = 0.0F;
			local13[11] = 0.0F;
			local13[2] = 0.0F;
			local13[1] = 0.0F;
			local13[9] = 0.0F;
			local13[5] = 2.0F / (local75 - local33);
			local13[10] = 1.0F / (local17 - local21);
			local13[8] = 0.0F;
		}
		this.method4350();
		this.aBoolean344 = true;
	}

	@OriginalMember(owner = "client!ifa", name = "i", descriptor = "(Z)V")
	protected abstract void method4297();

	@OriginalMember(owner = "client!ifa", name = "q", descriptor = "(B)V")
	private void method4298() {
		if (this.aClass128_5 == Static498.aClass128_7) {
			return;
		}
		@Pc(10) Class128 local10 = this.aClass128_5;
		this.aClass128_5 = Static498.aClass128_7;
		if (local10.method3186()) {
			this.method4305();
		}
		this.method4293();
		this.aFloatArray31 = this.aFloatArray38;
		this.method4239();
		this.anInt4967 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ifa", name = "s", descriptor = "(I)V")
	protected abstract void method4299();

	@OriginalMember(owner = "client!ifa", name = "AA", descriptor = "(III[I)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass8_Sub3_16.method1570((float) arg2, (float) arg0, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.bf * this.aClass8_Sub3_16.method1583((float) arg1, (float) arg2, (float) arg0) / local14);
			local58 = (int) ((float) this.anInt4949 * this.aClass8_Sub3_16.method1572((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local40 = this.anInt4972;
			local58 = this.anInt4954;
		}
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local58 - this.aFloat143);
		arg3[0] = (int) ((float) local40 - this.aFloat154);
	}

	@OriginalMember(owner = "client!ifa", name = "x", descriptor = "()V")
	@Override
	protected void method5029() {
		if (this.aBoolean347) {
			return;
		}
		for (@Pc(13) Class4 local13 = this.aClass244_37.method5963(); local13 != null; local13 = this.aClass244_37.method5965()) {
			((Class4_Sub8_Sub2) local13).method2966();
		}
		@Pc(30) Enumeration local30 = this.aHashtable5.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method4327(this.aHashtable5.get(local36), local36);
		}
		Static177.method7477(false, true);
		this.aNativeInterface3.release();
		this.aBoolean347 = true;
	}

	@OriginalMember(owner = "client!ifa", name = "t", descriptor = "(I)V")
	private void method4300() {
		if (this.aClass128_5 == Static251.aClass128_4) {
			return;
		}
		@Pc(10) Class128 local10 = this.aClass128_5;
		this.aClass128_5 = Static251.aClass128_4;
		if (!local10.method3186()) {
			this.method4305();
		}
		this.method4296();
		this.aFloatArray31 = this.aFloatArray36;
		this.method4239();
		this.anInt4967 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ifa", name = "J", descriptor = "(IIIIII)V")
	@Override
	public final void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4307();
		this.method4285(arg4);
		this.method4241(0, Static447.aClass328_3);
		this.method4312(0, Static447.aClass328_3);
		this.method4321(arg5);
		this.aClass8_Sub3_15.method1564((float) arg3, 1.0F, (float) arg2);
		this.aClass8_Sub3_15.U(arg0, arg1, 0);
		this.method4275();
		this.method4290(false);
		this.method4260();
		this.method4290(true);
		this.method4312(0, Static519.aClass328_4);
		this.method4241(0, Static519.aClass328_4);
	}

	@OriginalMember(owner = "client!ifa", name = "u", descriptor = "(I)V")
	protected abstract void method4301();

	@OriginalMember(owner = "client!ifa", name = "v", descriptor = "(I)V")
	private void method4302() {
		this.aFloat157 = this.anInt4938 - this.anInt4972;
		this.aFloat154 = this.anInt4971 - this.anInt4972;
		this.aFloat147 = this.anInt4966 - this.anInt4954;
		this.aFloat143 = this.anInt4969 - this.anInt4954;
	}

	@OriginalMember(owner = "client!ifa", name = "la", descriptor = "(IIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4972 = arg0;
		this.anInt4949 = arg3;
		this.bf = arg2;
		this.anInt4954 = arg1;
		this.method4310();
		this.method4309();
		this.method4242();
		this.method4302();
	}

	@OriginalMember(owner = "client!ifa", name = "r", descriptor = "(B)V")
	private void method4303() {
		this.method4355();
		if (this.aClass38_3 != null) {
			this.aClass38_3.method7441();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "n", descriptor = "()Lclient!q;")
	@Override
	public final Class8 method5007() {
		return this.aClass8_Sub3_21;
	}

	@OriginalMember(owner = "client!ifa", name = "w", descriptor = "(I)Lclient!dd;")
	public final Class8_Sub3 method4304() {
		return this.aClass8_Sub3_18;
	}

	@OriginalMember(owner = "client!ifa", name = "x", descriptor = "(I)V")
	private void method4305() {
		this.aBoolean346 = false;
		if (this.aClass38_3 != null) {
			this.aClass38_3.method7443();
		}
		this.method4340();
	}

	@OriginalMember(owner = "client!ifa", name = "y", descriptor = "(I)V")
	protected abstract void method4306();

	@OriginalMember(owner = "client!ifa", name = "j", descriptor = "(Z)V")
	private void method4307() {
		if (this.anInt4967 == 1) {
			return;
		}
		this.method4298();
		this.method4270(false);
		this.method4244(false);
		this.method4269(false);
		this.method4248(false);
		this.method4272(-2, false, false);
		this.method4335(1);
		this.method4265(this.anInterface16_3);
		this.anInt4967 = 1;
	}

	@OriginalMember(owner = "client!ifa", name = "z", descriptor = "(I)V")
	protected abstract void method4308();

	@OriginalMember(owner = "client!ifa", name = "s", descriptor = "(B)V")
	private void method4309() {
		this.aBoolean355 = false;
		this.method4343();
		if (this.aClass128_5 == Static464.aClass128_6) {
			this.method4239();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "A", descriptor = "(I)V")
	private void method4310() {
		this.aBoolean344 = false;
		this.method4296();
		if (this.aClass128_5 == Static251.aClass128_4) {
			this.method4239();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!fca;ZLclient!bv;)Z")
	public abstract boolean method4311(@OriginalArg(0) Class97 arg0, @OriginalArg(2) Class42 arg1);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IILclient!uf;)V")
	public final void method4312(@OriginalArg(0) int arg0, @OriginalArg(2) Class328 arg1) {
		this.method4277(arg0, arg1);
	}

	@OriginalMember(owner = "client!ifa", name = "t", descriptor = "(B)Lclient!dd;")
	public final Class8_Sub3 method4313() {
		return this.aClass8_Sub3_19;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)V")
	@Override
	public final void method5036(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B[Lclient!mm;)Lclient!fj;")
	public abstract Class3 method4314(@OriginalArg(1) Class220[] arg0);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;Z)Lclient!jaclib/memory/Stream;")
	public final Stream method4315(@OriginalArg(0) Buffer arg0) {
		this.aStream3.a(arg0);
		return this.aStream3;
	}

	@OriginalMember(owner = "client!ifa", name = "B", descriptor = "(I)V")
	public final void method4316() {
		this.method4242();
		this.method4239();
	}

	@OriginalMember(owner = "client!ifa", name = "u", descriptor = "(B)V")
	protected abstract void method4317();

	@OriginalMember(owner = "client!ifa", name = "C", descriptor = "(I)V")
	protected abstract void method4318();

	@OriginalMember(owner = "client!ifa", name = "D", descriptor = "(I)V")
	protected abstract void method4320();

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method4999(@OriginalArg(0) Class8 arg0) {
		this.aClass8_Sub3_16 = (Class8_Sub3) arg0;
		this.aClass8_Sub3_18.M(this.aClass8_Sub3_16);
		this.aClass8_Sub3_18.method1563();
		this.aClass8_Sub3_19.method1577(this.aClass8_Sub3_18);
		this.aClass8_Sub3_17.method1577(this.aClass8_Sub3_16);
		if (this.aClass128_5.method3186()) {
			this.method4305();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "o", descriptor = "()Z")
	@Override
	public final boolean method5008() {
		return this.aClass38Array3[3].method7427();
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IB)V")
	public final void method4321(@OriginalArg(0) int arg0) {
		if (this.anInt4947 == arg0) {
			return;
		}
		@Pc(27) Class288 local27;
		@Pc(25) boolean local25;
		@Pc(23) boolean local23;
		if (arg0 == 1) {
			local23 = true;
			local25 = true;
			local27 = Static591.aClass288_7;
		} else if (arg0 == 2) {
			local23 = false;
			local25 = true;
			local27 = Static33.aClass288_1;
		} else if (arg0 == 128) {
			local23 = true;
			local25 = true;
			local27 = Static201.aClass288_4;
		} else {
			local25 = false;
			local27 = Static565.aClass288_6;
			local23 = false;
		}
		if (this.aBoolean342 != local23) {
			this.aBoolean342 = local23;
			this.method4271();
		}
		if (this.aBoolean353 != local25) {
			this.aBoolean353 = local25;
			this.method4318();
		}
		if (this.aClass288_5 != local27) {
			this.aClass288_5 = local27;
			this.method4336();
		}
		this.anInt4947 = arg0;
		this.anInt4967 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ifa", name = "v", descriptor = "(B)Lclient!dd;")
	public final Class8_Sub3 method4322() {
		if (!this.aBoolean346) {
			this.aClass8_Sub3_20.method1565(this.aClass8_Sub3_18, this.aClass8_Sub3_15);
			this.aBoolean346 = true;
		}
		return this.aClass8_Sub3_20;
	}

	@OriginalMember(owner = "client!ifa", name = "E", descriptor = "(I)V")
	private void method4323() {
		this.aFloatArray34[10] = this.aFloat145;
		this.aFloatArray34[14] = this.aFloat144;
		this.aFloat148 = (this.aFloatArray34[14] - (float) this.anInt4974) / this.aFloatArray34[10];
	}

	@OriginalMember(owner = "client!ifa", name = "oa", descriptor = "([I)V")
	@Override
	public final void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4971;
		arg0[3] = this.anInt4966;
		arg0[2] = this.anInt4938;
		arg0[1] = this.anInt4969;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method4998() {
	}

	@OriginalMember(owner = "client!ifa", name = "F", descriptor = "(I)V")
	private void method4324() {
		this.anInterface9_11 = this.method4286(true);
		this.anInterface9_11.method5102(12, 24);
		this.aClass3_15 = this.method4314(new Class220[] { new Class220(Static525.aClass326_1) });
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIF)Lclient!ul;")
	@Override
	public final Class4_Sub24 method4979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub24_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ifa", name = "w", descriptor = "(B)V")
	protected abstract void method4325();

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "(II)Lclient!cda;")
	public final Interface3 method4326(@OriginalArg(0) int arg0) {
		if (this.anInterface3_4.method5223() < arg0 * 2) {
			this.anInterface3_4.method5228(arg0);
		}
		return this.anInterface3_4;
	}

	@OriginalMember(owner = "client!ifa", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public final void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class6_Sub2 local6 = (Class6_Sub2) arg1;
		@Pc(9) Interface6 local9 = local6.anInterface6_3;
		this.method4295();
		this.method4265(local9);
		this.method4321(1);
		this.method4243(Static379.aClass117_7, Static379.aClass117_7);
		this.method4241(0, Static447.aClass328_3);
		this.method4285(arg0);
		this.aClass8_Sub3_15.method1564((float) this.anInt4807, 0.0F, (float) this.anInt4914);
		this.method4275();
		this.aClass8_Sub3Array3[0].method1564(local9.method8285((float) this.anInt4807), 1.0F, local9.method8282((float) this.anInt4914));
		this.aClass8_Sub3Array3[0].method1576(0.0F, local9.method8282((float) -arg2), local9.method8285((float) -arg3));
		this.aClass340Array3[0] = Static88.aClass340_2;
		this.method4303();
		this.method4260();
		this.method4247();
		this.method4241(0, Static519.aClass328_4);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method4327(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!ifa", name = "G", descriptor = "(I)I")
	public final int method4328() {
		return this.anInt4962;
	}

	@OriginalMember(owner = "client!ifa", name = "C", descriptor = "()Z")
	@Override
	public final boolean method5041() {
		return true;
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method4329(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ifa", name = "g", descriptor = "(II)V")
	public abstract void method4330(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ifa", name = "H", descriptor = "(I)F")
	protected abstract float method4332();

	@OriginalMember(owner = "client!ifa", name = "x", descriptor = "(B)V")
	protected final void method4334() {
		@Pc(17) Enumeration local17 = this.aHashtable5.keys();
		while (local17.hasMoreElements()) {
			@Pc(23) Canvas local23 = (Canvas) local17.nextElement();
			this.method4327(this.aHashtable5.get(local23), local23);
		}
		this.anInterface9_10.method5230();
		this.anInterface9_11.method5230();
		this.aClass57_Sub3_23.method5697();
		this.aClass57_Sub3_28.method5697();
		this.aClass57_Sub3_30.method5697();
		this.aClass57_Sub3_25.method5697();
		this.aClass57_Sub3_27.method5697();
		this.aClass168_3.method3746();
		this.anInterface3_4.method5230();
	}

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "(IZ)V")
	public final void method4335(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4243(Static379.aClass117_7, Static379.aClass117_7);
		} else if (arg0 == 0) {
			this.method4243(Static573.aClass117_9, Static573.aClass117_9);
		} else if (arg0 == 2) {
			this.method4243(Static379.aClass117_7, Static435.aClass117_8);
		} else if (arg0 == 3) {
			this.method4243(Static573.aClass117_9, Static341.aClass117_4);
		} else if (arg0 == 4) {
			this.method4243(Static463.aClass117_6, Static463.aClass117_6);
			return;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "t", descriptor = "()Z")
	@Override
	public final boolean method5022() {
		return true;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "([I)V")
	@Override
	public final void method5011(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4914;
		arg0[1] = this.anInt4807;
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method4332();
		this.method4307();
		this.method4285(arg4);
		this.method4241(0, Static447.aClass328_3);
		this.method4312(0, Static447.aClass328_3);
		this.method4321(arg5);
		this.aClass8_Sub3_15.method1564((float) (arg3 - 1), 1.0F, (float) (arg2 - 1));
		this.aClass8_Sub3_15.method1576(0.0F, (float) arg0 - local7, -local7 + (float) arg1);
		this.method4275();
		this.method4290(false);
		this.method4256(4, Static535.aClass271_9);
		this.method4290(true);
		this.method4312(0, Static519.aClass328_4);
		this.method4241(0, Static519.aClass328_4);
	}

	@OriginalMember(owner = "client!ifa", name = "I", descriptor = "(I)V")
	protected abstract void method4336();

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ[BILclient!fca;B)Lclient!co;")
	public final Interface6 method4337(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class97 arg4) {
		return this.method4370(arg1, arg0, arg4, arg2, arg3);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!kk;IIII)Lclient!da;")
	@Override
	public final Class57 method5016(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class57_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ifa", name = "J", descriptor = "(I)V")
	protected void method4339() {
		this.method4253();
	}

	@OriginalMember(owner = "client!ifa", name = "k", descriptor = "(Z)V")
	protected abstract void method4340();

	@OriginalMember(owner = "client!ifa", name = "ZA", descriptor = "(Z)V")
	@Override
	public final void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean340 = arg0;
		this.method4306();
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!dd;B)V")
	public final void method4341(@OriginalArg(0) Class8_Sub3 arg0) {
		this.aClass8_Sub3_15.M(arg0);
		this.aBoolean336 = false;
		this.method4284();
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "([FZ)[F")
	public final float[] method4342(@OriginalArg(0) float[] arg0) {
		arg0[12] = this.aFloatArray31[3];
		arg0[0] = this.aFloatArray31[0];
		arg0[8] = this.aFloatArray31[2];
		arg0[4] = this.aFloatArray31[1];
		arg0[9] = this.aFloatArray31[6];
		arg0[5] = this.aFloatArray31[5];
		arg0[1] = this.aFloatArray31[4];
		arg0[2] = this.aFloatArray31[8];
		arg0[13] = this.aFloatArray31[7];
		arg0[3] = this.aFloatArray31[12];
		arg0[7] = this.aFloatArray31[13];
		arg0[10] = this.aFloatArray31[10];
		arg0[6] = this.aFloatArray31[9];
		arg0[14] = this.aFloatArray31[11];
		arg0[11] = this.aFloatArray31[14];
		arg0[15] = this.aFloatArray31[15];
		return arg0;
	}

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "(I)Lclient!e;")
	@Override
	public final Class4_Sub8 method5027(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub8_Sub2 local8 = new Class4_Sub8_Sub2(arg0);
		this.aClass244_37.method5960(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ifa", name = "l", descriptor = "(Z)V")
	private void method4343() {
		if (this.aBoolean355) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray34;
		@Pc(21) float local21 = (float) (this.anInt4965 * -this.anInt4972) / (float) this.bf;
		@Pc(36) float local36 = (float) (this.anInt4965 * (this.anInt4914 - this.anInt4972)) / (float) this.bf;
		@Pc(47) float local47 = (float) (this.anInt4954 * this.anInt4965) / (float) this.anInt4949;
		@Pc(62) float local62 = (float) ((this.anInt4954 - this.anInt4807) * this.anInt4965) / (float) this.anInt4949;
		if (local36 == local21 || local62 == local47) {
			local9[5] = 1.0F;
			local9[0] = 1.0F;
			local9[10] = 1.0F;
			local9[11] = 0.0F;
			local9[6] = 0.0F;
			local9[12] = 0.0F;
			local9[14] = 0.0F;
			local9[2] = 0.0F;
			local9[13] = 0.0F;
			local9[15] = 1.0F;
			local9[9] = 0.0F;
			local9[1] = 0.0F;
			local9[4] = 0.0F;
			local9[7] = 0.0F;
			local9[8] = 0.0F;
			local9[3] = 0.0F;
		} else {
			@Pc(142) float local142 = (float) this.anInt4965 * 2.0F;
			local9[11] = -1.0F;
			local9[13] = 0.0F;
			local9[12] = 0.0F;
			local9[10] = this.aFloat145 = (float) this.anInt4974 / (float) (this.anInt4965 - this.anInt4974);
			local9[4] = 0.0F;
			local9[1] = 0.0F;
			local9[9] = (local47 + local62) / (local47 - local62);
			local9[8] = (local21 + local36) / (-local21 + local36);
			local9[5] = local142 / (local47 - local62);
			local9[3] = 0.0F;
			local9[7] = 0.0F;
			local9[15] = 0.0F;
			local9[14] = this.aFloat144 = (float) (this.anInt4965 * this.anInt4974) / (float) (this.anInt4965 - this.anInt4974);
			local9[6] = 0.0F;
			local9[2] = 0.0F;
			local9[0] = local142 / (local36 - local21);
		}
		this.method4323();
		this.aBoolean355 = true;
	}

	@OriginalMember(owner = "client!ifa", name = "K", descriptor = "(I)V")
	private void method4344() {
		if (this.aCanvas8 == null) {
			this.anInt4867 = this.anInt4913 = 1;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas8.getSize();
			this.anInt4867 = local6.width;
			this.anInt4913 = local6.height;
		}
		this.anInt4807 = this.anInt4913;
		this.anInt4914 = this.anInt4867;
		this.method4266();
		this.method4309();
		this.method4310();
		this.method4299();
		this.method4302();
		this.method4242();
		this.JA();
	}

	@OriginalMember(owner = "client!ifa", name = "ra", descriptor = "(F)V")
	@Override
	public final void ra(@OriginalArg(0) float arg0) {
		if (this.aFloat153 != arg0) {
			this.aFloat153 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method4320();
			this.method4349();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(II)I")
	@Override
	public final int method5010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "()Z")
	@Override
	public final boolean method4965() {
		return false;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!fca;III[FIIZ)Lclient!co;")
	protected abstract Interface6 method4345(@OriginalArg(0) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(7) boolean arg4);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!cr;I)V")
	public abstract void method4346(@OriginalArg(0) Class54 arg0);

	@OriginalMember(owner = "client!ifa", name = "L", descriptor = "(I)V")
	private void method4347() {
		this.anInterface9_10 = this.method4286(false);
		this.anInterface9_10.method5102(28, 140);
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			@Pc(34) Buffer local34 = this.anInterface9_10.method5100();
			if (local34 != null) {
				@Pc(41) Stream local41 = this.method4315(local34);
				if (Stream.b()) {
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
				} else {
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
				}
				local41.a();
				if (this.anInterface9_10.method5101()) {
					break;
				}
			}
		}
		this.aClass3_20 = this.method4314(new Class220[] { new Class220(new Class326[] { Static525.aClass326_1, Static525.aClass326_5, Static525.aClass326_5 }) });
	}

	@OriginalMember(owner = "client!ifa", name = "g", descriptor = "()V")
	@Override
	public final void method4984() {
		if (this.aClass35_3 != null) {
			this.aClass35_3.method500();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "pa", descriptor = "(III)V")
	@Override
	public final void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt4950 && this.anInt4943 == arg1 && arg2 == this.anInt4953) {
			return;
		}
		this.anInt4950 = arg0;
		this.anInt4943 = arg1;
		this.anInt4953 = arg2;
		this.method4252();
		this.method4263();
	}

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "(ZI)V")
	public final void method4348(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean337 != arg0) {
			this.aBoolean337 = arg0;
			this.method4282();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "M", descriptor = "(I)V")
	protected abstract void method4349();

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "()Z")
	@Override
	public final boolean method4977() {
		return false;
	}

	@OriginalMember(owner = "client!ifa", name = "y", descriptor = "(B)V")
	private void method4350() {
		this.aFloat158 = this.anInt4974;
	}

	@OriginalMember(owner = "client!ifa", name = "N", descriptor = "(I)V")
	protected abstract void method4351();

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!so;)V")
	@Override
	public final void method5017(@OriginalArg(0) Class305 arg0) {
		this.aClass168_3.method3742(-1, this, arg0);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!so;I)V")
	@Override
	public final void method5026(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		this.aClass168_3.method3742(arg1, this, arg0);
	}

	@OriginalMember(owner = "client!ifa", name = "z", descriptor = "(B)Lclient!gi;")
	public final Interface13 method4352() {
		return this.aClass36_Sub1_3 == null ? null : this.aClass36_Sub1_3.method523();
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method4968(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas7) {
			local5 = this.anObject14;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method4329(arg0, local5);
		if (arg0 == this.aCanvas8) {
			this.method4344();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "A", descriptor = "(B)Lclient!dd;")
	public final Class8_Sub3 method4353() {
		return this.aClass8_Sub3Array3[this.anInt4955];
	}

	@OriginalMember(owner = "client!ifa", name = "B", descriptor = "(B)V")
	protected void method4354() {
		this.anInt4959 = this.anInt4958;
		this.anInt4958 = 0;
	}

	@OriginalMember(owner = "client!ifa", name = "C", descriptor = "(B)V")
	protected abstract void method4355();

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(FFZFFFF)Z")
	private boolean method4356(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(14) Buffer local14 = this.anInterface9_11.method5100();
		if (local14 == null) {
			return false;
		}
		@Pc(23) Stream local23 = this.method4315(local14);
		if (Stream.b()) {
			local23.b(arg4);
			local23.b(arg3);
			local23.b(arg5);
			local23.b(arg0);
			local23.b(arg2);
			local23.b(arg1);
		} else {
			local23.a(arg4);
			local23.a(arg3);
			local23.a(arg5);
			local23.a(arg0);
			local23.a(arg2);
			local23.a(arg1);
		}
		local23.a();
		return this.anInterface9_11.method5101();
	}

	@OriginalMember(owner = "client!ifa", name = "m", descriptor = "(Z)V")
	protected abstract void method4357();

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "(IIIII)V")
	@Override
	protected final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!ifa", name = "m", descriptor = "()Z")
	@Override
	public final boolean method5004() {
		return true;
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method4994(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas7 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method4327(this.aHashtable5.get(arg0), arg0);
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IILclient!el;)V")
	public abstract void method4358(@OriginalArg(1) int arg0, @OriginalArg(2) Interface9 arg1);

	@OriginalMember(owner = "client!ifa", name = "O", descriptor = "(I)I")
	public final int method4359() {
		return this.anInt4952;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method4360(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap5.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method5001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		if (local9 == 0.0F && local15 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(40) float local40 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local15 * local15)));
			local9 *= local40;
			local15 *= local40;
		}
		if (!this.method4356(local9 + (float) arg2, 0.0F, local15 + (float) arg3, (float) arg1, (float) arg0, 0.0F)) {
			return;
		}
		this.method4307();
		this.method4285(arg4);
		this.method4241(0, Static447.aClass328_3);
		this.method4312(0, Static447.aClass328_3);
		this.method4321(arg5);
		this.method4273();
		this.method4290(false);
		this.method4289();
		this.method4290(true);
		this.method4312(0, Static519.aClass328_4);
		this.method4241(0, Static519.aClass328_4);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method4966(@OriginalArg(0) Canvas arg0) {
		this.aCanvas8 = null;
		this.anObject14 = null;
		if (arg0 == null || this.aCanvas7 == arg0) {
			this.aCanvas8 = this.aCanvas7;
			this.anObject14 = this.anObject13;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject14 = this.aHashtable5.get(arg0);
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.anObject14 == null) {
			throw new RuntimeException();
		}
		this.method4264(this.aCanvas8, this.anObject14);
		this.method4344();
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!qf;IIILclient!cda;B)V")
	public abstract void method4361(@OriginalArg(0) int arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface3 arg5);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I[FZZLclient!fca;I)Lclient!co;")
	public final Interface6 method4362(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class97 arg3, @OriginalArg(5) int arg4) {
		return this.method4345(arg3, arg0, arg4, arg1, arg2);
	}

	@OriginalMember(owner = "client!ifa", name = "k", descriptor = "()Z")
	@Override
	public final boolean method4993() {
		return true;
	}

	@OriginalMember(owner = "client!ifa", name = "w", descriptor = "()Z")
	@Override
	public final boolean method5028() {
		return true;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIII)Lclient!caa;")
	@Override
	public final Class36 method4970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class36_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I[Lclient!ul;)V")
	@Override
	public final void method5000(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub24[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass4_Sub24Array4[local7] = arg1[local7];
		}
		this.anInt4958 = arg0;
		if (this.aClass128_5.method3186()) {
			this.method4354();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "P", descriptor = "(I)V")
	protected abstract void method4363();

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ[[II)Lclient!gi;")
	public abstract Interface13 method4364(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BB)V")
	public final void method4365(@OriginalArg(0) byte arg0) {
		this.method4285(arg0 | arg0 << 8 | arg0 << 16 | arg0 << 24);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "([BILclient!fca;III)Lclient!ck;")
	public abstract Interface4 method4366(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class97 arg1);

	@OriginalMember(owner = "client!ifa", name = "CA", descriptor = "(IIII)V")
	@Override
	public final void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean348 = true;
		this.anInt4962 = arg0;
		this.anInt4946 = arg1;
		this.anInt4960 = arg2;
		this.anInt4952 = arg3;
	}

	@OriginalMember(owner = "client!ifa", name = "Q", descriptor = "(I)I")
	public final int method4367() {
		return this.anInt4955;
	}

	@OriginalMember(owner = "client!ifa", name = "R", descriptor = "(I)I")
	public final int method4368() {
		return this.anInt4946;
	}

	@OriginalMember(owner = "client!ifa", name = "v", descriptor = "()[I")
	@Override
	public final int[] v() {
		return new int[] { this.anInt4972, this.anInt4954, this.bf, this.anInt4949 };
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!fca;BILclient!bv;)Lclient!co;")
	public abstract Interface6 method4369(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42 arg3);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZIILclient!fca;[BIZI)Lclient!co;")
	protected abstract Interface6 method4370(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class97 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ifa", name = "A", descriptor = "()Z")
	@Override
	public final boolean method5037() {
		return true;
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "()I")
	@Override
	public final int method4972() {
		return this.anInt4968 - 2;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZBIZII)V")
	private void method4371(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) boolean local8 = arg2 & this.method5008();
		if (!local8 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg4 = 1;
			arg3 = 0;
		}
		if (arg1 != 0 && arg0) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt4937 != arg1) {
			if (this.anInt4937 != 0) {
				this.aClass38Array3[this.anInt4937 & Integer.MAX_VALUE].method7434();
			}
			if (arg1 == 0) {
				this.aClass38_3 = null;
			} else {
				this.aClass38_3 = this.aClass38Array3[Integer.MAX_VALUE & arg1];
				this.aClass38_3.method7439(arg0);
				this.aClass38_3.method7431(arg0);
				this.aClass38_3.method7433(arg3, arg4);
			}
			this.anInt4937 = arg1;
			this.anInt4973 = arg4;
			this.anInt4942 = arg3;
		} else if (this.anInt4937 != 0) {
			this.aClass38Array3[Integer.MAX_VALUE & this.anInt4937].method7431(arg0);
			if (arg3 != this.anInt4942 || arg4 != this.anInt4973) {
				this.aClass38Array3[this.anInt4937 & Integer.MAX_VALUE].method7433(arg3, arg4);
				this.anInt4973 = arg4;
				this.anInt4942 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IF)V")
	public final void method4372(@OriginalArg(1) float arg0) {
		if (this.aFloat151 != arg0) {
			this.aFloat151 = arg0;
			this.method4310();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "n", descriptor = "(Z)V")
	protected abstract void method4373();

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!fj;I)V")
	public abstract void method4374(@OriginalArg(0) Class3 arg0);
}
