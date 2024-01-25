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

@OriginalClass("client!nh")
public abstract class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "Lclient!ob;")
	protected Class242 aClass242_6;

	@OriginalMember(owner = "client!nh", name = "W", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!nh", name = "rc", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7;

	@OriginalMember(owner = "client!nh", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!nh", name = "Ad", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!nh", name = "Rd", descriptor = "I")
	protected int anInt7338;

	@OriginalMember(owner = "client!nh", name = "Sd", descriptor = "I")
	public int anInt7339;

	@OriginalMember(owner = "client!nh", name = "Ud", descriptor = "I")
	public int anInt7341;

	@OriginalMember(owner = "client!nh", name = "be", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!nh", name = "de", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!nh", name = "ge", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!nh", name = "he", descriptor = "[Lclient!el;")
	protected Class95[] aClass95Array5;

	@OriginalMember(owner = "client!nh", name = "ze", descriptor = "[Lclient!tw;")
	protected Class322[] aClass322Array3;

	@OriginalMember(owner = "client!nh", name = "De", descriptor = "F")
	private float aFloat174;

	@OriginalMember(owner = "client!nh", name = "Ee", descriptor = "Lclient!cf;")
	private Class9 aClass9_3;

	@OriginalMember(owner = "client!nh", name = "Ke", descriptor = "I")
	public int anInt7353;

	@OriginalMember(owner = "client!nh", name = "Le", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!nh", name = "Qe", descriptor = "Z")
	protected boolean aBoolean519;

	@OriginalMember(owner = "client!nh", name = "Se", descriptor = "F")
	public float aFloat177;

	@OriginalMember(owner = "client!nh", name = "Te", descriptor = "Z")
	public boolean aBoolean520;

	@OriginalMember(owner = "client!nh", name = "We", descriptor = "[Lclient!ds;")
	protected Class81_Sub1[] aClass81_Sub1Array3;

	@OriginalMember(owner = "client!nh", name = "bf", descriptor = "F")
	private float bf;

	@OriginalMember(owner = "client!nh", name = "df", descriptor = "I")
	public int anInt7363;

	@OriginalMember(owner = "client!nh", name = "gf", descriptor = "Lclient!aj;")
	public Interface1 anInterface1_3;

	@OriginalMember(owner = "client!nh", name = "hf", descriptor = "F")
	public float aFloat179;

	@OriginalMember(owner = "client!nh", name = "jf", descriptor = "I")
	private int anInt7365;

	@OriginalMember(owner = "client!nh", name = "kf", descriptor = "I")
	protected int anInt7366;

	@OriginalMember(owner = "client!nh", name = "of", descriptor = "[Lclient!el;")
	protected Class95[] aClass95Array6;

	@OriginalMember(owner = "client!nh", name = "pf", descriptor = "[Lclient!aj;")
	private Interface1[] anInterface1Array3;

	@OriginalMember(owner = "client!nh", name = "tf", descriptor = "I")
	public int anInt7369;

	@OriginalMember(owner = "client!nh", name = "vf", descriptor = "I")
	private int anInt7370;

	@OriginalMember(owner = "client!nh", name = "xf", descriptor = "Lclient!gb;")
	private Class112_Sub1 aClass112_Sub1_3;

	@OriginalMember(owner = "client!nh", name = "Bf", descriptor = "[Lclient!am;")
	protected Class4_Sub3[] aClass4_Sub3Array5;

	@OriginalMember(owner = "client!nh", name = "Ef", descriptor = "Z")
	public boolean aBoolean528;

	@OriginalMember(owner = "client!nh", name = "Mf", descriptor = "I")
	protected int anInt7376;

	@OriginalMember(owner = "client!nh", name = "Pf", descriptor = "I")
	public int anInt7377;

	@OriginalMember(owner = "client!nh", name = "Qf", descriptor = "Z")
	protected boolean aBoolean530;

	@OriginalMember(owner = "client!nh", name = "Rf", descriptor = "Lclient!aq;")
	private Class18 aClass18_3;

	@OriginalMember(owner = "client!nh", name = "Uf", descriptor = "I")
	protected int anInt7378;

	@OriginalMember(owner = "client!nh", name = "Xf", descriptor = "I")
	protected int anInt7381;

	@OriginalMember(owner = "client!nh", name = "Yf", descriptor = "Z")
	public boolean aBoolean532;

	@OriginalMember(owner = "client!nh", name = "Zf", descriptor = "Lclient!dt;")
	public Class82 aClass82_14;

	@OriginalMember(owner = "client!nh", name = "ag", descriptor = "Lclient!eu;")
	private Interface6 anInterface6_7;

	@OriginalMember(owner = "client!nh", name = "bg", descriptor = "Lclient!dt;")
	private Class82 aClass82_15;

	@OriginalMember(owner = "client!nh", name = "cg", descriptor = "Lclient!wf;")
	private Interface24 anInterface24_9;

	@OriginalMember(owner = "client!nh", name = "dg", descriptor = "Lclient!dt;")
	public Class82 aClass82_16;

	@OriginalMember(owner = "client!nh", name = "eg", descriptor = "Lclient!qh;")
	public Class65_Sub3 aClass65_Sub3_21;

	@OriginalMember(owner = "client!nh", name = "fg", descriptor = "Lclient!dt;")
	private Class82 aClass82_17;

	@OriginalMember(owner = "client!nh", name = "gg", descriptor = "Lclient!qh;")
	public Class65_Sub3 aClass65_Sub3_22;

	@OriginalMember(owner = "client!nh", name = "hg", descriptor = "Lclient!dt;")
	public Class82 aClass82_18;

	@OriginalMember(owner = "client!nh", name = "jg", descriptor = "Lclient!qh;")
	public Class65_Sub3 aClass65_Sub3_23;

	@OriginalMember(owner = "client!nh", name = "kg", descriptor = "Lclient!qh;")
	public Class65_Sub3 aClass65_Sub3_24;

	@OriginalMember(owner = "client!nh", name = "lg", descriptor = "Lclient!qh;")
	public Class65_Sub3 aClass65_Sub3_25;

	@OriginalMember(owner = "client!nh", name = "mg", descriptor = "Lclient!qh;")
	public Class65_Sub3 aClass65_Sub3_26;

	@OriginalMember(owner = "client!nh", name = "ng", descriptor = "Lclient!qh;")
	public Class65_Sub3 aClass65_Sub3_27;

	@OriginalMember(owner = "client!nh", name = "og", descriptor = "Lclient!wf;")
	private Interface24 anInterface24_10;

	@OriginalMember(owner = "client!nh", name = "pg", descriptor = "Lclient!qh;")
	public Class65_Sub3 aClass65_Sub3_28;

	@OriginalMember(owner = "client!nh", name = "qg", descriptor = "Lclient!dt;")
	public Class82 aClass82_19;

	@OriginalMember(owner = "client!nh", name = "rg", descriptor = "Lclient!qh;")
	public Class65_Sub3 aClass65_Sub3_29;

	@OriginalMember(owner = "client!nh", name = "sg", descriptor = "Lclient!qh;")
	public Class65_Sub3 aClass65_Sub3_30;

	@OriginalMember(owner = "client!nh", name = "tg", descriptor = "I")
	private int anInt7382;

	@OriginalMember(owner = "client!nh", name = "ug", descriptor = "Z")
	protected boolean aBoolean533;

	@OriginalMember(owner = "client!nh", name = "oc", descriptor = "Lclient!au;")
	private final Class22 aClass22_48 = new Class22();

	@OriginalMember(owner = "client!nh", name = "Nd", descriptor = "Z")
	protected boolean aBoolean512 = true;

	@OriginalMember(owner = "client!nh", name = "Vd", descriptor = "Lclient!ds;")
	protected final Class81_Sub1 aClass81_Sub1_15 = new Class81_Sub1();

	@OriginalMember(owner = "client!nh", name = "Wd", descriptor = "Lclient!ds;")
	public Class81_Sub1 aClass81_Sub1_16 = new Class81_Sub1();

	@OriginalMember(owner = "client!nh", name = "Xd", descriptor = "Lclient!ds;")
	public final Class81_Sub1 aClass81_Sub1_17 = new Class81_Sub1();

	@OriginalMember(owner = "client!nh", name = "Yd", descriptor = "Lclient!ds;")
	protected final Class81_Sub1 aClass81_Sub1_18 = new Class81_Sub1();

	@OriginalMember(owner = "client!nh", name = "Zd", descriptor = "Lclient!ds;")
	private final Class81_Sub1 aClass81_Sub1_19 = new Class81_Sub1();

	@OriginalMember(owner = "client!nh", name = "ae", descriptor = "Lclient!ds;")
	private final Class81_Sub1 aClass81_Sub1_20 = new Class81_Sub1();

	@OriginalMember(owner = "client!nh", name = "ee", descriptor = "Z")
	protected boolean aBoolean513 = false;

	@OriginalMember(owner = "client!nh", name = "ke", descriptor = "I")
	private int anInt7345 = -1;

	@OriginalMember(owner = "client!nh", name = "oe", descriptor = "[F")
	private final float[] aFloatArray49 = new float[16];

	@OriginalMember(owner = "client!nh", name = "ue", descriptor = "I")
	public int anInt7349 = 0;

	@OriginalMember(owner = "client!nh", name = "Je", descriptor = "Z")
	private boolean aBoolean517 = false;

	@OriginalMember(owner = "client!nh", name = "te", descriptor = "F")
	private float aFloat170 = 1.0F;

	@OriginalMember(owner = "client!nh", name = "Pe", descriptor = "F")
	public float aFloat176 = 1.0F;

	@OriginalMember(owner = "client!nh", name = "ie", descriptor = "I")
	public int anInt7344 = 128;

	@OriginalMember(owner = "client!nh", name = "Be", descriptor = "F")
	public float aFloat173 = 1.0F;

	@OriginalMember(owner = "client!nh", name = "Ve", descriptor = "Z")
	protected boolean aBoolean521 = true;

	@OriginalMember(owner = "client!nh", name = "je", descriptor = "[F")
	private final float[] aFloatArray48 = new float[16];

	@OriginalMember(owner = "client!nh", name = "re", descriptor = "Z")
	protected boolean aBoolean515 = true;

	@OriginalMember(owner = "client!nh", name = "Me", descriptor = "Z")
	private boolean aBoolean518 = false;

	@OriginalMember(owner = "client!nh", name = "ef", descriptor = "F")
	public float aFloat178 = 1.0F;

	@OriginalMember(owner = "client!nh", name = "He", descriptor = "I")
	public int anInt7352 = 512;

	@OriginalMember(owner = "client!nh", name = "cf", descriptor = "I")
	public int anInt7362 = -1;

	@OriginalMember(owner = "client!nh", name = "se", descriptor = "F")
	public float aFloat169 = 3584.0F;

	@OriginalMember(owner = "client!nh", name = "ff", descriptor = "I")
	public int anInt7364 = 3;

	@OriginalMember(owner = "client!nh", name = "Fe", descriptor = "Lclient!eq;")
	protected Class96 aClass96_6 = Static78.aClass96_4;

	@OriginalMember(owner = "client!nh", name = "we", descriptor = "I")
	public int anInt7350 = 0;

	@OriginalMember(owner = "client!nh", name = "Ue", descriptor = "I")
	public int anInt7357 = 8;

	@OriginalMember(owner = "client!nh", name = "ve", descriptor = "Z")
	private boolean aBoolean516 = false;

	@OriginalMember(owner = "client!nh", name = "sf", descriptor = "Z")
	protected boolean aBoolean525 = true;

	@OriginalMember(owner = "client!nh", name = "ce", descriptor = "I")
	private int anInt7342 = 0;

	@OriginalMember(owner = "client!nh", name = "qf", descriptor = "Z")
	protected boolean aBoolean524 = false;

	@OriginalMember(owner = "client!nh", name = "wf", descriptor = "Z")
	protected boolean aBoolean527 = true;

	@OriginalMember(owner = "client!nh", name = "Cf", descriptor = "[F")
	private final float[] aFloatArray53 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!nh", name = "rf", descriptor = "I")
	private int anInt7368 = 1;

	@OriginalMember(owner = "client!nh", name = "Gf", descriptor = "I")
	protected final int anInt7373 = 0;

	@OriginalMember(owner = "client!nh", name = "Ze", descriptor = "I")
	public int anInt7360 = 0;

	@OriginalMember(owner = "client!nh", name = "Ce", descriptor = "[F")
	protected float[] aFloatArray50 = this.aFloatArray53;

	@OriginalMember(owner = "client!nh", name = "nf", descriptor = "Z")
	private boolean aBoolean523 = false;

	@OriginalMember(owner = "client!nh", name = "xe", descriptor = "F")
	public float aFloat171 = 1.0F;

	@OriginalMember(owner = "client!nh", name = "qe", descriptor = "F")
	public float aFloat168 = -1.0F;

	@OriginalMember(owner = "client!nh", name = "Ye", descriptor = "I")
	protected int anInt7359 = 0;

	@OriginalMember(owner = "client!nh", name = "yf", descriptor = "[Lclient!cf;")
	private final Class9[] aClass9Array3 = new Class9[10];

	@OriginalMember(owner = "client!nh", name = "Xe", descriptor = "I")
	private int anInt7358 = 0;

	@OriginalMember(owner = "client!nh", name = "Ff", descriptor = "[F")
	public final float[] aFloatArray54 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!nh", name = "Kf", descriptor = "Z")
	private boolean aBoolean529 = false;

	@OriginalMember(owner = "client!nh", name = "Ne", descriptor = "I")
	public int anInt7354 = -1;

	@OriginalMember(owner = "client!nh", name = "pe", descriptor = "I")
	private int anInt7348 = 0;

	@OriginalMember(owner = "client!nh", name = "zf", descriptor = "I")
	private int anInt7371 = 16777215;

	@OriginalMember(owner = "client!nh", name = "Re", descriptor = "I")
	public int anInt7356 = 50;

	@OriginalMember(owner = "client!nh", name = "Sf", descriptor = "Z")
	protected boolean aBoolean531 = false;

	@OriginalMember(owner = "client!nh", name = "lf", descriptor = "I")
	public int anInt7367 = 512;

	@OriginalMember(owner = "client!nh", name = "uf", descriptor = "Z")
	private boolean aBoolean526 = false;

	@OriginalMember(owner = "client!nh", name = "Af", descriptor = "[F")
	private final float[] aFloatArray52 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!nh", name = "Tf", descriptor = "Lclient!wea;")
	protected Class357 aClass357_6 = Static29.aClass357_4;

	@OriginalMember(owner = "client!nh", name = "ye", descriptor = "F")
	public float aFloat172 = 3584.0F;

	@OriginalMember(owner = "client!nh", name = "If", descriptor = "F")
	public float aFloat180 = -1.0F;

	@OriginalMember(owner = "client!nh", name = "Oe", descriptor = "I")
	protected int anInt7355 = 0;

	@OriginalMember(owner = "client!nh", name = "Wf", descriptor = "I")
	protected int anInt7380 = 0;

	@OriginalMember(owner = "client!nh", name = "Jf", descriptor = "I")
	protected final int anInt7374 = 0;

	@OriginalMember(owner = "client!nh", name = "fe", descriptor = "I")
	protected int anInt7343 = 3584;

	@OriginalMember(owner = "client!nh", name = "Nf", descriptor = "[F")
	private final float[] aFloatArray56 = new float[16];

	@OriginalMember(owner = "client!nh", name = "mf", descriptor = "Z")
	protected boolean aBoolean522 = true;

	@OriginalMember(owner = "client!nh", name = "Ge", descriptor = "[F")
	public final float[] aFloatArray51 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!nh", name = "Vf", descriptor = "I")
	private int anInt7379 = -1;

	@OriginalMember(owner = "client!nh", name = "me", descriptor = "Z")
	protected boolean aBoolean514 = false;

	@OriginalMember(owner = "client!nh", name = "af", descriptor = "I")
	protected int anInt7361 = 0;

	@OriginalMember(owner = "client!nh", name = "ne", descriptor = "I")
	protected int anInt7347 = 0;

	@OriginalMember(owner = "client!nh", name = "Lf", descriptor = "I")
	private int anInt7375 = -1;

	@OriginalMember(owner = "client!nh", name = "Hf", descriptor = "[F")
	private final float[] aFloatArray55 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!nh", name = "Df", descriptor = "I")
	private int anInt7372 = 0;

	@OriginalMember(owner = "client!nh", name = "Of", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream6 = new Stream();

	@OriginalMember(owner = "client!nh", name = "ig", descriptor = "Lclient!ds;")
	private final Class81_Sub1 aClass81_Sub1_21 = new Class81_Sub1();

	@OriginalMember(owner = "client!nh", name = "le", descriptor = "I")
	protected final int anInt7346;

	@OriginalMember(owner = "client!nh", name = "Vc", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas11;

	@OriginalMember(owner = "client!nh", name = "ob", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "Ljava/lang/Object;")
	protected final Object anObject99;

	@OriginalMember(owner = "client!nh", name = "Db", descriptor = "Ljava/lang/Object;")
	private Object anObject100;

	@OriginalMember(owner = "client!nh", name = "Fd", descriptor = "Lclient!vo;")
	protected final Class348 aClass348_80;

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
	private int anInt7183;

	@OriginalMember(owner = "client!nh", name = "Rb", descriptor = "I")
	public int anInt7241;

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
	private int anInt7192;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
	public int anInt7180;

	@OriginalMember(owner = "client!nh", name = "Ae", descriptor = "I")
	public final int anInt7351;

	@OriginalMember(owner = "client!nh", name = "Z", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!nh", name = "Ie", descriptor = "Lclient!um;")
	private final Class331 aClass331_3;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!fa;Lclient!vo;II)V")
	protected Class7_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class348 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anInt7346 = arg4;
		this.aCanvas10 = this.aCanvas11 = arg0;
		this.anObject100 = this.anObject99 = arg1;
		this.aClass348_80 = arg3;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt7241 = this.anInt7183 = local307.height;
		this.anInt7180 = this.anInt7192 = local307.width;
		this.anInt7351 = arg5;
		Static547.method7662(true, false);
		if (super.anInterface7_12 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt7351);
			this.aClass331_3 = null;
		} else {
			this.aClass331_3 = new Class331(this, super.anInterface7_12);
			this.aNativeInterface3 = new NativeInterface(super.anInterface7_12.method4461(), this.anInt7351);
			for (@Pc(364) int local364 = 0; local364 < super.anInterface7_12.method4461(); local364++) {
				@Pc(372) Class69 local372 = super.anInterface7_12.method4460(local364);
				if (local372 != null) {
					this.aNativeInterface3.initTextureMetrics(local364, local372.aByte43, local372.aByte46);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)V")
	public final void method5656(@OriginalArg(0) byte arg0) {
		this.method5712(arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)[F")
	public final float[] method5657() {
		return this.aFloatArray53;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)I")
	public final int method5658() {
		return this.anInt7342;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I")
	@Override
	public final int method7778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "(I)V")
	private void method5659() {
		this.aFloat165 = this.anInt7380 - this.anInt7360;
		this.aFloat166 = this.anInt7347 - this.anInt7349;
		this.aFloat179 = this.anInt7355 - this.anInt7360;
		this.aFloat167 = this.anInt7361 - this.anInt7349;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!jb;ILclient!qda;)Z")
	public abstract boolean method5660(@OriginalArg(0) Class161 arg0, @OriginalArg(2) Class273 arg1);

	@OriginalMember(owner = "client!nh", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public final void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class67_Sub3 local6 = (Class67_Sub3) arg1;
		@Pc(9) Interface4 local9 = local6.anInterface4_5;
		this.method5733();
		this.method5694(local9);
		this.method5716(1);
		this.method5764(Static563.aClass95_5, Static563.aClass95_5);
		this.method5681(0, Static18.aClass61_1);
		this.method5712(arg0);
		this.aClass81_Sub1_15.method1977(0.0F, (float) this.anInt7180, (float) this.anInt7241);
		this.method5786();
		this.aClass81_Sub1Array3[0].method1977(1.0F, local9.method7374((float) this.anInt7180), local9.method7377((float) this.anInt7241));
		this.aClass81_Sub1Array3[0].method1970(local9.method7374((float) -arg2), local9.method7377((float) -arg3), 0.0F);
		this.aClass322Array3[0] = Static85.aClass322_2;
		this.method5687();
		this.method5769();
		this.method5750();
		this.method5681(0, Static411.aClass61_5);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V")
	public final void method5661(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean531) {
			this.aBoolean531 = arg0;
			this.method5729();
			this.anInt7365 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public final Class67 method7787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static233.method3765(arg2, arg1, arg0, arg3, this);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V")
	protected abstract void method5662();

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "(I)I")
	public final int method5663() {
		return this.anInt7345;
	}

	@OriginalMember(owner = "client!nh", name = "va", descriptor = "(I)V")
	@Override
	public final void va(@OriginalArg(0) int arg0) {
		this.anInt7364 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt7364++;
		}
		this.anInt7357 = 0x1 << this.anInt7364;
	}

	@OriginalMember(owner = "client!nh", name = "ZA", descriptor = "(Z)V")
	@Override
	public final void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean525 = arg0;
		this.method5677();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZILclient!ct;Z)V")
	protected abstract void method5664(@OriginalArg(1) int arg0, @OriginalArg(2) Class61 arg1);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([BIILclient!jb;IZ)Lclient!dca;")
	public final Interface4 method5665(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class161 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method5749(arg1, arg3, arg0, arg4, arg2);
	}

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "(I)V")
	protected final void method5666() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable7 != null && !this.aHashtable7.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable7.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method5708(local26));
			}
		}
		this.aHashtable7 = local9;
		this.method5690();
		this.method5718();
		this.aClass18_3.method826(this);
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)V")
	public final void method5667() {
		if (this.anInt7365 == 16) {
			return;
		}
		this.method5787();
		this.method5701(true);
		this.method5661(true);
		this.method5702(true);
		this.method5716(1);
		this.anInt7365 = 16;
	}

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "(I)V")
	private void method5668() {
		if (this.aClass357_6 == Static73.aClass357_5) {
			return;
		}
		@Pc(18) Class357 local18 = this.aClass357_6;
		this.aClass357_6 = Static73.aClass357_5;
		if (!local18.method8118()) {
			this.method5673();
		}
		this.method5669();
		this.aFloatArray50 = this.aFloatArray49;
		this.method5689();
		this.anInt7365 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)V")
	private void method5669() {
		if (this.aBoolean517) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray49;
		@Pc(21) float local21 = (float) (-this.anInt7349 * this.anInt7356) / (float) this.anInt7367;
		@Pc(36) float local36 = (float) ((this.anInt7180 - this.anInt7349) * this.anInt7356) / (float) this.anInt7367;
		@Pc(47) float local47 = (float) (this.anInt7360 * this.anInt7356) / (float) this.anInt7352;
		@Pc(62) float local62 = (float) (this.anInt7356 * (this.anInt7360 - this.anInt7241)) / (float) this.anInt7352;
		if (local21 == local36 || local47 == local62) {
			local9[9] = 0.0F;
			local9[10] = 1.0F;
			local9[2] = 0.0F;
			local9[4] = 0.0F;
			local9[12] = 0.0F;
			local9[14] = 0.0F;
			local9[0] = 1.0F;
			local9[3] = 0.0F;
			local9[7] = 0.0F;
			local9[8] = 0.0F;
			local9[15] = 1.0F;
			local9[11] = 0.0F;
			local9[5] = 1.0F;
			local9[13] = 0.0F;
			local9[1] = 0.0F;
			local9[6] = 0.0F;
		} else {
			@Pc(76) float local76 = (float) this.anInt7356 * 2.0F;
			local9[0] = local76 / (local36 - local21);
			local9[6] = 0.0F;
			local9[11] = -1.0F;
			local9[12] = 0.0F;
			local9[2] = 0.0F;
			local9[13] = 0.0F;
			local9[9] = (local62 + local47) / (local47 - local62);
			local9[14] = this.aFloat174 = (float) (this.anInt7343 * this.anInt7356) / (float) (this.anInt7356 - this.anInt7343);
			local9[10] = this.bf = (float) this.anInt7343 / (float) (this.anInt7356 - this.anInt7343);
			local9[1] = 0.0F;
			local9[7] = 0.0F;
			local9[8] = (local36 + local21) / (local36 - local21);
			local9[3] = 0.0F;
			local9[15] = 0.0F;
			local9[4] = 0.0F;
			local9[5] = local76 / (local47 - local62);
		}
		this.method5686();
		this.aBoolean517 = true;
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(B)I")
	public final int method5670() {
		return this.anInt7359;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZB)V")
	public final void method5671(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean514) {
			this.aBoolean514 = arg0;
			this.method5735();
		}
	}

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "(I)V")
	private void method5672() {
		if (this.anInt7365 == 1) {
			return;
		}
		this.method5763();
		this.method5701(false);
		this.method5717(false);
		this.method5661(false);
		this.method5702(false);
		this.method5692(-2, false, false);
		this.method5757(1);
		this.method5694(this.anInterface1_3);
		this.anInt7365 = 1;
	}

	@OriginalMember(owner = "client!nh", name = "CA", descriptor = "(IIII)V")
	@Override
	public final void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7370 = arg0;
		this.anInt7342 = arg3;
		this.anInt7345 = arg1;
		this.aBoolean528 = true;
		this.anInt7375 = arg2;
	}

	@OriginalMember(owner = "client!nh", name = "la", descriptor = "(IIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7360 = arg1;
		this.anInt7367 = arg2;
		this.anInt7352 = arg3;
		this.anInt7349 = arg0;
		this.method5676();
		this.method5732();
		this.method5778();
		this.method5659();
	}

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "(I)V")
	private void method5673() {
		this.aBoolean516 = false;
		if (this.aClass9_3 != null) {
			this.aClass9_3.method8023();
		}
		this.method5679();
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(B)V")
	private void method5674() {
		this.aBoolean529 = false;
		if (this.aClass357_6 == Static17.aClass357_3) {
			this.method5696();
			this.method5689();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method5675(@OriginalArg(1) Buffer arg0) {
		this.aStream6.a(arg0);
		return this.aStream6;
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(B)V")
	private void method5676() {
		this.aBoolean523 = false;
		this.method5780();
		if (this.aClass357_6 == Static384.aClass357_7) {
			this.method5689();
		}
	}

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "()V")
	@Override
	protected void method7822() {
		if (this.aBoolean526) {
			return;
		}
		for (@Pc(9) Class4 local9 = this.aClass22_48.method895(); local9 != null; local9 = this.aClass22_48.method889()) {
			((Class4_Sub8_Sub2) local9).method7518();
		}
		@Pc(26) Enumeration local26 = this.aHashtable7.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method5761(local32, this.aHashtable7.get(local32));
		}
		Static506.method7293(false, true);
		this.aNativeInterface3.release();
		this.aBoolean526 = true;
	}

	@OriginalMember(owner = "client!nh", name = "JA", descriptor = "()V")
	@Override
	public final void JA() {
		this.anInt7380 = 0;
		this.anInt7361 = 0;
		this.anInt7355 = this.anInt7241;
		this.anInt7347 = this.anInt7180;
		if (this.aBoolean533) {
			this.aBoolean533 = false;
			this.method5752();
		}
		this.method5659();
	}

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "(I)V")
	protected abstract void method5677();

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)V")
	protected abstract void method5678();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!fda;Z)Lclient!f;")
	@Override
	public final Class88 method7808(@OriginalArg(0) Class103 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(26) Class88 local26;
		if (arg0.anInt3039 == 0 || arg0.anInt3041 == 0) {
			local26 = this.method7838(new int[1], 1, 1, 1);
		} else {
			@Pc(35) int[] local35 = new int[arg0.anInt3039 * arg0.anInt3041];
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			@Pc(44) int local44;
			@Pc(48) int local48;
			if (arg0.aByteArray22 == null) {
				for (local44 = 0; local44 < arg0.anInt3041; local44++) {
					for (local48 = 0; local48 < arg0.anInt3039; local48++) {
						@Pc(61) int local61 = arg0.anIntArray142[arg0.aByteArray23[local37++] & 0xFF];
						local35[local39++] = local61 == 0 ? 0 : local61 | 0xFF000000;
					}
				}
			} else {
				for (local44 = 0; local44 < arg0.anInt3041; local44++) {
					for (local48 = 0; local48 < arg0.anInt3039; local48++) {
						local35[local39++] = arg0.aByteArray22[local37] << 24 | arg0.anIntArray142[arg0.aByteArray23[local37] & 0xFF];
						local37++;
					}
				}
			}
			local26 = this.method7838(local35, arg0.anInt3039, arg0.anInt3039, arg0.anInt3041);
		}
		local26.Q(arg0.anInt3037, arg0.anInt3038, arg0.anInt3036, arg0.anInt3040);
		return local26;
	}

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "(I)V")
	protected abstract void method5679();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILclient!eu;Lclient!gca;BI)V")
	public abstract void method5680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface6 arg3, @OriginalArg(4) Class119 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!ct;)V")
	public final void method5681(@OriginalArg(1) int arg0, @OriginalArg(2) Class61 arg1) {
		this.method5741(false, arg1, false, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!cr;IIII)Lclient!da;")
	@Override
	public final Class65 method7828(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class65_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZIIIZ)V")
	private void method5682(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(10) boolean local10 = arg4 & this.method7803();
		if (!local10 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			arg0 = 2;
			arg2 = 1;
			arg3 = 0;
		}
		if (arg0 != 0 && arg1) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt7358) {
			if (this.anInt7358 != 0) {
				this.aClass9Array3[Integer.MAX_VALUE & this.anInt7358].method8021();
			}
			if (arg0 == 0) {
				this.aClass9_3 = null;
			} else {
				this.aClass9_3 = this.aClass9Array3[arg0 & Integer.MAX_VALUE];
				this.aClass9_3.method8022(arg1);
				this.aClass9_3.method8030(arg1);
				this.aClass9_3.method8033(arg2, arg3);
			}
			this.anInt7348 = arg2;
			this.anInt7372 = arg3;
			this.anInt7358 = arg0;
		} else if (this.anInt7358 != 0) {
			this.aClass9Array3[Integer.MAX_VALUE & this.anInt7358].method8030(arg1);
			if (arg3 != this.anInt7372 || arg2 != this.anInt7348) {
				this.aClass9Array3[Integer.MAX_VALUE & this.anInt7358].method8033(arg2, arg3);
				this.anInt7348 = arg2;
				this.anInt7372 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "(IIIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7817(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!nh", name = "oa", descriptor = "([I)V")
	@Override
	public final void oa(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt7347;
		arg0[3] = this.anInt7355;
		arg0[0] = this.anInt7361;
		arg0[1] = this.anInt7380;
	}

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "(B)V")
	protected void method5683() {
		this.method5719();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!hp;I)V")
	public abstract void method5684(@OriginalArg(0) Class143 arg0);

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(Z)I")
	public final int method5685() {
		return this.anInt7370;
	}

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public final boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass81_Sub1_16.method1959((float) arg2, (float) arg1, (float) arg0);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass81_Sub1_16.method1959((float) arg5, (float) arg4, (float) arg3);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt7356 > local14 && (float) this.anInt7356 > local31 || !(!(local14 > (float) this.anInt7343) || !(local31 > (float) this.anInt7343))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt7367 * this.aClass81_Sub1_16.method1975((float) arg0, (float) arg2, (float) arg1) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt7367 * this.aClass81_Sub1_16.method1975((float) arg3, (float) arg5, (float) arg4) / local31);
		if ((float) local81 < this.aFloat167 && (float) local99 < this.aFloat167 || this.aFloat166 < (float) local81 && (float) local99 > this.aFloat166) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt7352 * this.aClass81_Sub1_16.method1965((float) arg1, (float) arg0, (float) arg2) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt7352 * this.aClass81_Sub1_16.method1965((float) arg4, (float) arg3, (float) arg5) / local31);
			return (!((float) local143 < this.aFloat165) || !(this.aFloat165 > (float) local161)) && (!(this.aFloat179 < (float) local143) || !((float) local161 > this.aFloat179));
		}
	}

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "(B)V")
	private void method5686() {
		this.aFloatArray49[14] = this.aFloat174;
		this.aFloatArray49[10] = this.bf;
		this.aFloat172 = ((float) -this.anInt7343 + this.aFloatArray49[14]) / this.aFloatArray49[10];
	}

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "(B)V")
	private void method5687() {
		this.method5706();
		if (this.aClass9_3 != null) {
			this.aClass9_3.method8025();
		}
	}

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "(I)V")
	public final void method5688() {
		this.aClass95Array6 = new Class95[this.anInt7369];
		this.aClass81_Sub1Array3 = new Class81_Sub1[this.anInt7369];
		this.aClass95Array5 = new Class95[this.anInt7369];
		this.anInterface1Array3 = new Interface1[this.anInt7369];
		this.aClass322Array3 = new Class322[this.anInt7369];
		for (@Pc(32) int local32 = 0; local32 < this.anInt7369; local32++) {
			this.aClass95Array5[local32] = Static468.aClass95_3;
			this.aClass95Array6[local32] = Static468.aClass95_3;
			this.aClass322Array3[local32] = Static190.aClass322_4;
			this.aClass81_Sub1Array3[local32] = new Class81_Sub1();
		}
		this.aClass4_Sub3Array5 = new Class4_Sub3[this.anInt7376 - 2];
		this.anInterface1_3 = this.method5705(Static151.aClass161_6, Static424.aClass273_12, 1, 1);
		this.method7851(new Class4_Sub8_Sub2(262144));
		this.aClass82_19 = this.method5736(new Class204[] { new Class204(new Class91[] { Static117.aClass91_1, Static117.aClass91_5 }) });
		this.aClass82_14 = this.method5736(new Class204[] { new Class204(new Class91[] { Static117.aClass91_1, Static117.aClass91_3 }) });
		this.aClass82_18 = this.method5736(new Class204[] { new Class204(Static117.aClass91_1), new Class204(Static117.aClass91_3), new Class204(Static117.aClass91_5), new Class204(Static117.aClass91_2) });
		this.aClass82_16 = this.method5736(new Class204[] { new Class204(Static117.aClass91_1), new Class204(Static117.aClass91_3), new Class204(Static117.aClass91_5) });
		this.aClass65_Sub3_21 = new Class65_Sub3(this, 0, 0, false, false);
		this.aClass65_Sub3_23 = new Class65_Sub3(this, 0, 0, true, true);
		this.aClass65_Sub3_27 = new Class65_Sub3(this, 0, 0, false, false);
		this.aClass65_Sub3_28 = new Class65_Sub3(this, 0, 0, true, true);
		this.aClass65_Sub3_22 = new Class65_Sub3(this, 0, 0, false, false);
		this.aClass65_Sub3_26 = new Class65_Sub3(this, 0, 0, true, true);
		this.aClass65_Sub3_30 = new Class65_Sub3(this, 0, 0, false, false);
		this.aClass65_Sub3_24 = new Class65_Sub3(this, 0, 0, true, true);
		this.aClass65_Sub3_29 = new Class65_Sub3(this, 0, 0, false, false);
		this.aClass65_Sub3_25 = new Class65_Sub3(this, 0, 0, true, true);
		this.aClass18_3 = new Class18(this);
		this.anInterface6_7 = this.method5726(true);
		this.method5666();
		this.aClass242_6 = new Class242(this);
		this.aClass9Array3[1] = this.method5779(1);
		this.aClass9Array3[2] = this.method5779(2);
		this.aClass9Array3[4] = this.method5779(4);
		this.aClass9Array3[5] = this.method5779(5);
		this.aClass9Array3[6] = this.method5779(6);
		this.aClass9Array3[7] = this.method5779(7);
		this.aClass9Array3[3] = this.method5779(3);
		this.aClass9Array3[8] = this.method5779(8);
		this.aClass9Array3[9] = this.method5779(9);
		if (!this.aClass9Array3[2].method8028()) {
			this.aClass9Array3[2] = this.method5779(0);
		}
		if (!this.aClass9Array3[4].method8028()) {
			this.aClass9Array3[4] = this.aClass9Array3[2];
		}
		if (!this.aClass9Array3[8].method8028()) {
			this.aClass9Array3[8] = this.aClass9Array3[4];
		}
		if (!this.aClass9Array3[9].method8028()) {
			this.aClass9Array3[9] = this.aClass9Array3[8];
		}
		this.method5683();
		this.JA();
		this.method7830();
	}

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "(I)V")
	private void method5689() {
		this.method5662();
		if (this.aClass9_3 != null) {
			this.aClass9_3.method8020();
		}
	}

	@OriginalMember(owner = "client!nh", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt7343;
	}

	@OriginalMember(owner = "client!nh", name = "XA", descriptor = "(IIIII)V")
	@Override
	public final void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7817(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!qg;)V")
	@Override
	public final void method7777(@OriginalArg(0) Class276 arg0) {
		this.aClass18_3.method822(-1, this, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "(I)V")
	private void method5690() {
		this.anInterface24_9 = this.method5704(false);
		this.anInterface24_9.method6549(140, 28);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface24_9.method6550();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method5675(local28);
				if (Stream.c()) {
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
				local35.a();
				if (this.anInterface24_9.method6551()) {
					break;
				}
			}
		}
		this.aClass82_15 = this.method5736(new Class204[] { new Class204(new Class91[] { Static117.aClass91_1, Static117.aClass91_5, Static117.aClass91_5 }) });
	}

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "(I)V")
	protected abstract void method5691();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public final Class88 method7855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class88_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZZ)V")
	public final void method5692(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt7379 || this.aBoolean518 != this.aBoolean528) {
			@Pc(20) Interface4 local20 = null;
			@Pc(22) int local22 = 0;
			@Pc(24) byte local24 = 0;
			@Pc(26) int local26 = 0;
			@Pc(33) int local33 = this.aBoolean528 ? 3 : 0;
			if (arg0 < 0) {
				this.method5750();
			} else {
				local20 = this.aClass331_3.method7533(arg0);
				@Pc(52) Class69 local52 = super.anInterface7_12.method4460(arg0);
				if (local52.aByte41 == 0 && local52.aByte42 == 0) {
					this.method5750();
				} else {
					@Pc(68) int local68 = local52.aBoolean179 ? 64 : 128;
					@Pc(72) int local72 = local68 * 50;
					@Pc(76) Class81_Sub1 local76 = this.method5727();
					local76.method1966((float) (local52.aByte41 * (this.anInt7377 % local72)) / (float) local72, 0.0F, (float) (local52.aByte42 * (this.anInt7377 % local72)) / (float) local72);
					this.method5737(Static85.aClass322_2);
				}
				local22 = local52.anInt2293;
				if (!this.aBoolean528) {
					local26 = local52.anInt2292;
					local33 = local52.aByte40;
					local24 = local52.aByte44;
				}
			}
			this.method5682(local33, arg2, local26, local24, arg1);
			if (this.aClass9_3 == null) {
				this.method5694(local20);
				this.method5757(local22);
			} else {
				this.aClass9_3.method8029(local20, local22);
			}
			this.aBoolean518 = this.aBoolean528;
			this.anInt7379 = arg0;
		}
		this.anInt7365 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "(I)Lclient!hba;")
	public final Interface11 method5693() {
		return this.aClass112_Sub1_3 == null ? null : this.aClass112_Sub1_3.method2600();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!aj;)V")
	public final void method5694(@OriginalArg(1) Interface1 arg0) {
		if (arg0 == this.anInterface1Array3[this.anInt7359]) {
			return;
		}
		this.anInterface1Array3[this.anInt7359] = arg0;
		if (arg0 == null) {
			this.method5785();
		} else {
			arg0.method7871();
		}
		this.anInt7365 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "(I)Lclient!ds;")
	public final Class81_Sub1 method5695() {
		return this.aClass81_Sub1_15;
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "()Z")
	@Override
	public final boolean method7802() {
		return true;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(Z)V")
	private void method5696() {
		if (this.aBoolean529) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray56;
		if (this.anInt7180 == 0 || this.anInt7241 == 0) {
			local5[11] = 0.0F;
			local5[14] = 0.0F;
			local5[0] = 1.0F;
			local5[3] = 0.0F;
			local5[4] = 0.0F;
			local5[5] = 1.0F;
			local5[7] = 0.0F;
			local5[6] = 0.0F;
			local5[10] = 1.0F;
			local5[2] = 0.0F;
			local5[15] = 1.0F;
			local5[8] = 0.0F;
			local5[1] = 0.0F;
			local5[13] = 0.0F;
			local5[12] = 0.0F;
			local5[9] = 0.0F;
		} else {
			local5[3] = 0.0F;
			local5[11] = 0.0F;
			local5[14] = 0.5F;
			local5[15] = 1.0F;
			local5[0] = 2.0F / (float) this.anInt7180;
			local5[1] = 0.0F;
			local5[8] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt7241;
			local5[2] = 0.0F;
			local5[6] = 0.0F;
			local5[13] = 1.0F;
			local5[12] = -1.0F;
			local5[10] = 0.5F;
			local5[7] = 0.0F;
			local5[4] = 0.0F;
			local5[9] = 0.0F;
		}
		this.aBoolean529 = true;
	}

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "(B)V")
	private void method5697() {
		if (this.aClass357_6 == Static17.aClass357_3) {
			@Pc(7) float local7 = this.method5715();
			this.aClass81_Sub1_15.method1970(local7, local7, 0.0F);
		}
		this.aBoolean516 = false;
		this.method5762();
		if (this.aClass9_3 != null) {
			this.aClass9_3.method8032();
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7833(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas11) {
			throw new RuntimeException();
		} else if (!this.aHashtable7.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) Object local53 = this.method5708(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method5698(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIZI[I)Lclient!dca;")
	public final Interface4 method5699(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		return this.method5758(arg0, arg2, 0, 0, arg1, arg3);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ds;B)V")
	public final void method5700(@OriginalArg(0) Class81_Sub1 arg0) {
		this.aClass81_Sub1_15.M(arg0);
		this.aBoolean512 = false;
		this.method5697();
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IZ)V")
	public final void method5701(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean530 != arg0) {
			this.aBoolean530 = arg0;
			this.method5751();
			this.anInt7365 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	@Override
	public final void method7791(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass331_3 != null) {
			this.aClass331_3.method7537();
		}
		this.anInt7344 = arg0;
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(IZ)V")
	public final void method5702(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean513) {
			this.aBoolean513 = arg0;
			this.method5677();
			this.anInt7365 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "(I)V")
	public abstract void method5703();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)Lclient!wf;")
	public abstract Interface24 method5704(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!jb;Lclient!qda;IIB)Lclient!dca;")
	public abstract Interface4 method5705(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7820() {
		return true;
	}

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "()Lclient!q;")
	@Override
	public final Class81 method7842() {
		return new Class81_Sub1();
	}

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "(I)V")
	protected abstract void method5706();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!gca;B)V")
	private void method5707(@OriginalArg(0) int arg0, @OriginalArg(1) Class119 arg1) {
		this.method5721(this.anInterface24_9, 0);
		this.method5754(this.aClass82_15);
		this.method5760(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method5708(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7840(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas11) {
			local5 = this.anObject100;
		} else if (this.aHashtable7.containsKey(arg0)) {
			local5 = this.aHashtable7.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method5731(arg0, local5);
		if (arg0 == this.aCanvas10) {
			this.method5770();
		}
	}

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "(I)V")
	public final void method5709() {
		this.method5778();
		this.method5689();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(FFFFFZF)Z")
	private boolean method5710(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface24_10.method6550();
		if (local9 == null) {
			return false;
		}
		@Pc(18) Stream local18 = this.method5675(local9);
		if (Stream.c()) {
			local18.b(arg0);
			local18.b(arg5);
			local18.b(arg3);
			local18.b(arg4);
			local18.b(arg1);
			local18.b(arg2);
		} else {
			local18.a(arg0);
			local18.a(arg5);
			local18.a(arg3);
			local18.a(arg4);
			local18.a(arg1);
			local18.a(arg2);
		}
		local18.a();
		return this.anInterface24_10.method6551();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(FZ)V")
	public final void method5711(@OriginalArg(0) float arg0) {
		if (this.aFloat170 != arg0) {
			this.aFloat170 = arg0;
			this.method5676();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public final Class88 method7788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class88_Sub1 local11 = new Class88_Sub1(this, arg2, arg3, arg4);
		local11.da(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public final void method7851(@OriginalArg(0) Class4_Sub8 arg0) {
		this.aNativeHeap5 = ((Class4_Sub8_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer5 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)V")
	public final void method5712(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt7378) {
			this.anInt7378 = arg0;
			this.method5756();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!ct;I)V")
	public final void method5713(@OriginalArg(1) Class61 arg0, @OriginalArg(2) int arg1) {
		this.method5664(arg1, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method7817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		if (local10 == 0.0F && local17 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(38) float local38 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local10 * local10)));
			local10 *= local38;
			local17 *= local38;
		}
		if (!this.method5710((float) arg0, (float) arg3 + local17, 0.0F, 0.0F, local10 + (float) arg2, (float) arg1)) {
			return;
		}
		this.method5672();
		this.method5712(arg4);
		this.method5681(0, Static18.aClass61_1);
		this.method5713(Static18.aClass61_1, 0);
		this.method5716(arg5);
		this.method5767();
		this.method5742(false);
		this.method5738();
		this.method5742(true);
		this.method5713(Static411.aClass61_5, 0);
		this.method5681(0, Static411.aClass61_5);
	}

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "(B)V")
	protected abstract void method5714();

	@OriginalMember(owner = "client!nh", name = "ra", descriptor = "(F)V")
	@Override
	public final void ra(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat171) {
			this.aFloat171 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method5728();
			this.method5723();
		}
	}

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "(I)F")
	protected abstract float method5715();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
	public final void method5716(@OriginalArg(0) int arg0) {
		if (this.anInt7368 == arg0) {
			return;
		}
		@Pc(30) Class96 local30;
		@Pc(32) boolean local32;
		@Pc(28) boolean local28;
		if (arg0 == 1) {
			local32 = true;
			local28 = true;
			local30 = Static78.aClass96_4;
		} else if (arg0 == 2) {
			local30 = Static18.aClass96_3;
			local32 = true;
			local28 = false;
		} else if (arg0 == 128) {
			local30 = Static361.aClass96_5;
			local28 = true;
			local32 = true;
		} else {
			local28 = false;
			local30 = Static457.aClass96_7;
			local32 = false;
		}
		if (this.aBoolean515 != local28) {
			this.aBoolean515 = local28;
			this.method5745();
		}
		if (local32 != this.aBoolean522) {
			this.aBoolean522 = local32;
			this.method5783();
		}
		if (local30 != this.aClass96_6) {
			this.aClass96_6 = local30;
			this.method5739();
		}
		this.anInt7365 &= 0xFFFFFFE3;
		this.anInt7368 = arg0;
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
	@Override
	public final void method7839(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(IIIII)V")
	@Override
	protected final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "()Z")
	@Override
	public final boolean method7795() {
		return false;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(ZB)V")
	public final void method5717(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean524 != arg0) {
			this.aBoolean524 = arg0;
			this.method5735();
			this.anInt7365 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIF)Lclient!am;")
	@Override
	public final Class4_Sub3 method7819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub3_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public final void method7814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class67 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "()Z")
	@Override
	public final boolean method7803() {
		return this.aClass9Array3[3].method8028();
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt7341 + this.anInt7339 + this.anInt7338;
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(Z)V")
	private void method5718() {
		this.anInterface24_10 = this.method5704(true);
		this.anInterface24_10.method6549(24, 12);
		this.aClass82_17 = this.method5736(new Class204[] { new Class204(Static117.aClass91_1) });
	}

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "()Z")
	@Override
	public final boolean method7813() {
		return true;
	}

	@OriginalMember(owner = "client!nh", name = "BA", descriptor = "()I")
	@Override
	public final int BA() {
		return this.anInt7356;
	}

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "(I)V")
	private void method5719() {
		this.method5728();
		this.method5714();
		this.method5735();
		this.method5773();
		this.method5703();
		this.method5723();
		this.method5748();
		this.method5729();
		this.method5677();
		this.method5751();
		this.method5691();
		this.method5783();
		this.method5739();
		this.method5745();
		for (@Pc(56) int local56 = this.anInt7369 - 1; local56 >= 0; local56--) {
			this.method5746(local56);
			this.method5777();
			this.method5747();
			this.method5750();
		}
		this.method5756();
		this.method5771();
		this.method5662();
		this.method5762();
		this.method5679();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public final Class88 method7838(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class88_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "(I)V")
	public final void method5720() {
		if (this.anInt7365 == 8) {
			return;
		}
		this.method5668();
		this.method5701(true);
		this.method5661(true);
		this.method5702(true);
		this.method5716(1);
		this.anInt7365 = 8;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!wf;I)V")
	public abstract void method5721(@OriginalArg(1) Interface24 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ll;[Lclient!fda;Z)Lclient!la;")
	@Override
	public final Class45 method7837(@OriginalArg(0) Class198 arg0, @OriginalArg(1) Class103[] arg1) {
		return new Class45_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7847() {
		return true;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7782() {
		return true;
	}

	@OriginalMember(owner = "client!nh", name = "pa", descriptor = "(III)V")
	@Override
	public final void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7362 == arg0 && arg1 == this.anInt7354 && this.anInt7350 == arg2) {
			return;
		}
		this.anInt7350 = arg2;
		this.anInt7362 = arg0;
		this.anInt7354 = arg1;
		this.method5743();
		this.method5751();
	}

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "(B)Lclient!ds;")
	public final Class81_Sub1 method5722() {
		return this.aClass81_Sub1_19;
	}

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "(I)V")
	protected abstract void method5723();

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(ZI)V")
	public final void method5724(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean527 != arg0) {
			this.aBoolean527 = arg0;
			this.method5748();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method5725(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap5.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BZ)Lclient!eu;")
	public abstract Interface6 method5726(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7826(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
	@Override
	public final void method7810(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "(B)Lclient!ds;")
	public final Class81_Sub1 method5727() {
		return this.aClass81_Sub1Array3[this.anInt7359];
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!qg;I)V")
	@Override
	public final void method7832(@OriginalArg(0) Class276 arg0, @OriginalArg(1) int arg1) {
		this.aClass18_3.method822(arg1, this, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "(I)V")
	protected abstract void method5728();

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "(B)V")
	protected abstract void method5729();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7796(@OriginalArg(0) Canvas arg0) {
		this.anObject100 = null;
		this.aCanvas10 = null;
		if (arg0 == null || arg0 == this.aCanvas11) {
			this.anObject100 = this.anObject99;
			this.aCanvas10 = this.aCanvas11;
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.anObject100 = this.aHashtable7.get(arg0);
			this.aCanvas10 = arg0;
		}
		if (this.aCanvas10 == null || this.anObject100 == null) {
			throw new RuntimeException();
		}
		this.method5698(this.anObject100, this.aCanvas10);
		this.method5770();
	}

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "()Z")
	@Override
	public final boolean method7821() {
		return false;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(II)V")
	public abstract void method5730(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Z)V")
	protected abstract void method5731(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public final Class115 method7804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class115_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "()Lclient!q;")
	@Override
	public final Class81 method7781() {
		return this.aClass81_Sub1_16;
	}

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "()I")
	@Override
	public final int method7835() {
		return this.anInt7376 - 2;
	}

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "(I)V")
	private void method5732() {
		this.aBoolean517 = false;
		this.method5669();
		if (this.aClass357_6 == Static73.aClass357_5) {
			this.method5689();
		}
	}

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "()Z")
	@Override
	public final boolean method7834() {
		return this.aBoolean519;
	}

	@OriginalMember(owner = "client!nh", name = "G", descriptor = "(I)V")
	public final void method5733() {
		if (this.anInt7365 == 2) {
			return;
		}
		this.method5763();
		this.method5701(false);
		this.method5717(false);
		this.method5661(false);
		this.method5702(false);
		this.method5692(-2, false, false);
		this.anInt7365 = 2;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!jb;Lclient!qda;I)Z")
	public abstract boolean method5734(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class273 arg1);

	@OriginalMember(owner = "client!nh", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public final void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt7371;
		if (local11 || this.aFloat180 != arg1 || this.aFloat168 != arg2) {
			this.aFloat168 = arg2;
			this.aFloat180 = arg1;
			this.anInt7371 = arg0;
			if (local11) {
				this.aFloat176 = (float) (this.anInt7371 & 0xFF) / 255.0F;
				this.aFloat178 = (float) (this.anInt7371 & 0xFF00) / 65280.0F;
				this.aFloat173 = (float) (this.anInt7371 & 0xFF0000) / 1.671168E7F;
				this.method5728();
			}
			this.aNativeInterface3.setSunColour(this.aFloat173, this.aFloat178, this.aFloat176, arg1, arg2);
			this.method5714();
		}
		if (arg3 != this.aFloatArray55[0] || this.aFloatArray55[1] != arg4 || arg5 != this.aFloatArray55[2]) {
			this.aFloatArray55[2] = arg5;
			this.aFloatArray55[0] = arg3;
			this.aFloatArray55[1] = arg4;
			this.aFloatArray52[2] = -arg5;
			this.aFloatArray52[0] = -arg3;
			this.aFloatArray52[1] = -arg4;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray54[2] = arg5 * local149;
			this.aFloatArray54[0] = arg3 * local149;
			this.aFloatArray54[1] = local149 * arg4;
			this.aFloatArray51[2] = -this.aFloatArray54[2];
			this.aFloatArray51[1] = -this.aFloatArray54[1];
			this.aFloatArray51[0] = -this.aFloatArray54[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray54[0], this.aFloatArray54[1], this.aFloatArray54[2]);
			this.method5703();
			this.anInt7363 = (int) (arg5 * 256.0F / arg4);
			this.anInt7353 = (int) (arg3 * 256.0F / arg4);
		}
		this.method5723();
	}

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "()Z")
	@Override
	public final boolean method7845() {
		return true;
	}

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "(B)V")
	protected abstract void method5735();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([Lclient!ls;Z)Lclient!dt;")
	public abstract Class82 method5736(@OriginalArg(0) Class204[] arg0);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!tw;B)V")
	public final void method5737(@OriginalArg(0) Class322 arg0) {
		this.aClass322Array3[this.anInt7359] = arg0;
		this.method5687();
	}

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "(B)V")
	private void method5738() {
		this.method5721(this.anInterface24_10, 0);
		this.method5754(this.aClass82_17);
		this.method5760(1, 0, Static236.aClass119_2);
	}

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "(B)V")
	protected abstract void method5739();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!jb;ZBII[F)Lclient!dca;")
	public final Interface4 method5740(@OriginalArg(0) Class161 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4) {
		return this.method5753(arg1, arg3, arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "(IIII)V")
	@Override
	public final void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt7361 < arg0) {
			local5 = true;
			this.anInt7361 = arg0;
		}
		if (this.anInt7347 > arg2) {
			local5 = true;
			this.anInt7347 = arg2;
		}
		if (this.anInt7380 < arg1) {
			this.anInt7380 = arg1;
			local5 = true;
		}
		if (this.anInt7355 > arg3) {
			this.anInt7355 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean533) {
			this.aBoolean533 = true;
			this.method5752();
		}
		this.method5781();
		this.method5659();
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method5715();
		this.method5672();
		this.method5712(arg4);
		this.method5681(0, Static18.aClass61_1);
		this.method5713(Static18.aClass61_1, 0);
		this.method5716(arg5);
		this.aClass81_Sub1_15.method1977(1.0F, (float) (arg2 - 1), (float) (arg3 - 1));
		this.aClass81_Sub1_15.method1970((float) arg0 - local7, (float) arg1 - local7, 0.0F);
		this.method5786();
		this.method5742(false);
		this.method5707(4, Static324.aClass119_4);
		this.method5742(true);
		this.method5713(Static411.aClass61_5, 0);
		this.method5681(0, Static411.aClass61_5);
	}

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "()V")
	@Override
	public final void method7811() {
		if (this.aClass331_3 != null) {
			this.aClass331_3.method7537();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLclient!ct;IZI)V")
	public abstract void method5741(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZZ)V")
	public abstract void method5742(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "(B)V")
	private void method5743() {
		if (this.aClass9_3 != null) {
			this.aClass9_3.method8031();
		}
		this.method5691();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z[[IIB)Lclient!hba;")
	public abstract Interface11 method5744(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "(B)V")
	protected abstract void method5745();

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(II)V")
	public final void method5746(@OriginalArg(0) int arg0) {
		if (this.anInt7359 != arg0) {
			this.anInt7359 = arg0;
			this.method5678();
		}
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(Z)V")
	protected abstract void method5747();

	@OriginalMember(owner = "client!nh", name = "H", descriptor = "(I)V")
	protected abstract void method5748();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[BZIILclient!jb;I)Lclient!dca;")
	protected abstract Interface4 method5749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(6) Class161 arg4);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "()Z")
	@Override
	public final boolean method7779() {
		return false;
	}

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "(B)V")
	public final void method5750() {
		if (Static190.aClass322_4 != this.aClass322Array3[this.anInt7359]) {
			this.aClass322Array3[this.anInt7359] = Static190.aClass322_4;
			this.aClass81_Sub1Array3[this.anInt7359].Y();
			this.method5687();
		}
	}

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "(I)V")
	protected abstract void method5751();

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "(B)V")
	protected abstract void method5752();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZBILclient!jb;I[FI)Lclient!dca;")
	protected abstract Interface4 method5753(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class161 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float[] arg4);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLclient!dt;)V")
	public abstract void method5754(@OriginalArg(1) Class82 arg0);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[F)[F")
	public final float[] method5755(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloatArray50[0];
		arg0[12] = this.aFloatArray50[3];
		arg0[8] = this.aFloatArray50[2];
		arg0[4] = this.aFloatArray50[1];
		arg0[2] = this.aFloatArray50[8];
		arg0[1] = this.aFloatArray50[4];
		arg0[5] = this.aFloatArray50[5];
		arg0[13] = this.aFloatArray50[7];
		arg0[9] = this.aFloatArray50[6];
		arg0[10] = this.aFloatArray50[10];
		arg0[7] = this.aFloatArray50[13];
		arg0[3] = this.aFloatArray50[12];
		arg0[14] = this.aFloatArray50[11];
		arg0[6] = this.aFloatArray50[9];
		arg0[15] = this.aFloatArray50[15];
		arg0[11] = this.aFloatArray50[14];
		return arg0;
	}

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "(B)V")
	protected abstract void method5756();

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(BI)V")
	public final void method5757(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method5764(Static563.aClass95_5, Static563.aClass95_5);
		} else if (arg0 == 0) {
			this.method5764(Static468.aClass95_3, Static468.aClass95_3);
		} else if (arg0 == 2) {
			this.method5764(Static509.aClass95_4, Static563.aClass95_5);
		} else if (arg0 == 3) {
			this.method5764(Static371.aClass95_1, Static468.aClass95_3);
		} else if (arg0 == 4) {
			this.method5764(Static433.aClass95_2, Static433.aClass95_2);
		}
	}

	@OriginalMember(owner = "client!nh", name = "AA", descriptor = "(III[I)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass81_Sub1_16.method1959((float) arg2, (float) arg1, (float) arg0);
		@Pc(25) int local25;
		@Pc(28) int local28;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local25 = (int) ((float) this.anInt7367 * this.aClass81_Sub1_16.method1975((float) arg0, (float) arg2, (float) arg1) / local14);
			local28 = (int) ((float) this.anInt7352 * this.aClass81_Sub1_16.method1965((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local25 = this.anInt7349;
			local28 = this.anInt7360;
		}
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local28 - this.aFloat165);
		arg3[0] = (int) ((float) local25 - this.aFloat167);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIZB[I)Lclient!dca;")
	public abstract Interface4 method5758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int[] arg5);

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "(IIIIII)V")
	@Override
	public final void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5672();
		this.method5712(arg4);
		this.method5681(0, Static18.aClass61_1);
		this.method5713(Static18.aClass61_1, 0);
		this.method5716(arg5);
		this.aClass81_Sub1_15.method1977(1.0F, (float) arg2, (float) arg3);
		this.aClass81_Sub1_15.U(arg0, arg1, 0);
		this.method5786();
		this.method5742(false);
		this.method5769();
		this.method5742(true);
		this.method5713(Static411.aClass61_5, 0);
		this.method5681(0, Static411.aClass61_5);
	}

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "(I)Lclient!ds;")
	public final Class81_Sub1 method5759() {
		return this.aClass81_Sub1Array3[this.anInt7359];
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIILclient!gca;)V")
	public abstract void method5760(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class119 arg2);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method5761(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "(I)V")
	protected abstract void method5762();

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(Z)V")
	private void method5763() {
		if (Static17.aClass357_3 == this.aClass357_6) {
			return;
		}
		@Pc(16) Class357 local16 = this.aClass357_6;
		this.aClass357_6 = Static17.aClass357_3;
		if (local16.method8118()) {
			this.method5673();
		}
		this.method5696();
		this.aFloatArray50 = this.aFloatArray56;
		this.method5689();
		this.anInt7365 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!el;Lclient!el;B)V")
	public final void method5764(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class95 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg0 != this.aClass95Array6[this.anInt7359]) {
			this.aClass95Array6[this.anInt7359] = arg0;
			this.method5777();
			local5 = true;
		}
		if (arg1 != this.aClass95Array5[this.anInt7359]) {
			this.aClass95Array5[this.anInt7359] = arg1;
			local5 = true;
			this.method5747();
		}
		if (local5) {
			this.anInt7365 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(ZI)V")
	public final void method5765(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean521) {
			this.aBoolean521 = arg0;
			this.method5751();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!pa;)V")
	@Override
	public final void method7784(@OriginalArg(0) Class112 arg0) {
		this.aClass112_Sub1_3 = (Class112_Sub1) arg0;
	}

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "(I)Lclient!ds;")
	public final Class81_Sub1 method5766() {
		return this.aClass81_Sub1_18;
	}

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "(B)V")
	public final void method5767() {
		this.aClass81_Sub1_15.Y();
		this.aBoolean512 = true;
		this.method5697();
	}

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "(B)V")
	protected final void method5768() {
		@Pc(9) Enumeration local9 = this.aHashtable7.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method5761(local15, this.aHashtable7.get(local15));
		}
		this.anInterface24_9.method7925();
		this.anInterface24_10.method7925();
		this.aClass65_Sub3_23.method6427();
		this.aClass65_Sub3_28.method6427();
		this.aClass65_Sub3_26.method6427();
		this.aClass65_Sub3_24.method6427();
		this.aClass65_Sub3_25.method6427();
		this.aClass18_3.method818();
		this.anInterface6_7.method7925();
	}

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "()V")
	@Override
	public final void L() {
		this.aBoolean528 = false;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method7794(@OriginalArg(0) Class81 arg0) {
		this.aClass81_Sub1_16 = (Class81_Sub1) arg0;
		this.aClass81_Sub1_18.M(this.aClass81_Sub1_16);
		this.aClass81_Sub1_18.method1964();
		this.aClass81_Sub1_19.method1971(this.aClass81_Sub1_18);
		this.aClass81_Sub1_17.method1971(this.aClass81_Sub1_16);
		if (this.aClass357_6.method8118()) {
			this.method5673();
		}
	}

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "()[I")
	@Override
	public final int[] v() {
		return new int[] { this.anInt7349, this.anInt7360, this.anInt7367, this.anInt7352 };
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(IIIIII)Lclient!pa;")
	@Override
	public final Class112 method7829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class112_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "(B)V")
	public final void method5769() {
		this.method5707(2, Static162.aClass119_1);
	}

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "(I)V")
	private void method5770() {
		if (this.aCanvas10 == null) {
			this.anInt7192 = this.anInt7183 = 1;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas10.getSize();
			this.anInt7192 = local10.width;
			this.anInt7183 = local10.height;
		}
		this.anInt7180 = this.anInt7192;
		this.anInt7241 = this.anInt7183;
		this.method5674();
		this.method5732();
		this.method5676();
		this.method5771();
		this.method5659();
		this.method5778();
		this.JA();
	}

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "(B)V")
	protected abstract void method5771();

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V")
	@Override
	public void method7853(@OriginalArg(0) int arg0) {
		if (this.aClass331_3 != null) {
			this.aClass331_3.method7536();
		}
		this.anInt7377 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!nh", name = "da", descriptor = "(IIII)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt7180 - 1 && arg1 <= 0 && arg3 >= this.anInt7241 - 1) {
			this.JA();
			return;
		}
		this.anInt7380 = arg1 < 0 ? 0 : arg1;
		this.anInt7347 = arg2 <= this.anInt7180 ? arg2 : 0;
		this.anInt7355 = arg3 > this.anInt7180 ? 0 : arg3;
		this.anInt7361 = arg0 >= 0 ? arg0 : 0;
		if (!this.aBoolean533) {
			this.aBoolean533 = true;
			this.method5752();
		}
		this.method5781();
		this.method5659();
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7836(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas11 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.method5761(arg0, this.aHashtable7.get(arg0));
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!nh", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt7382;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	@Override
	public final void method7790(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)Lclient!e;")
	@Override
	public final Class4_Sub8 method7818(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub8_Sub2 local8 = new Class4_Sub8_Sub2(arg0);
		this.aClass22_48.method894(local8);
		return local8;
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(II)Lclient!eu;")
	public final Interface6 method5772(@OriginalArg(1) int arg0) {
		if (this.anInterface6_7.method7923() < arg0 * 2) {
			this.anInterface6_7.method7932(arg0);
		}
		return this.anInterface6_7;
	}

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "(I)V")
	protected void method5773() {
		this.anInt7381 = this.anInt7366;
		this.anInt7366 = 0;
	}

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "(I)V")
	private void method5774() {
		this.aFloat169 = this.anInt7343;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[Lclient!am;)V")
	@Override
	public final void method7852(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub3[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass4_Sub3Array5[local7] = arg1[local7];
		}
		this.anInt7366 = arg0;
		if (this.aClass357_6.method8118()) {
			this.method5773();
		}
	}

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "(Z)I")
	public final int method5775() {
		return this.anInt7375;
	}

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "(I)Lclient!ds;")
	public final Class81_Sub1 method5776() {
		if (!this.aBoolean516) {
			this.aClass81_Sub1_20.method1967(this.aClass81_Sub1_18, this.aClass81_Sub1_15);
			this.aBoolean516 = true;
		}
		return this.aClass81_Sub1_20;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method7841() {
	}

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "(I)V")
	protected abstract void method5777();

	@OriginalMember(owner = "client!nh", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "(B)V")
	public final void method5778() {
		if (Static29.aClass357_4 == this.aClass357_6) {
			return;
		}
		@Pc(6) Class357 local6 = this.aClass357_6;
		this.aClass357_6 = Static29.aClass357_4;
		if (local6.method8118()) {
			this.method5673();
		}
		this.anInt7365 &= 0xFFFFFFE0;
		this.aFloatArray50 = this.aFloatArray53;
	}

	@OriginalMember(owner = "client!nh", name = "YA", descriptor = "(IIII)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean528) {
			throw new RuntimeException("");
		}
		this.anInt7342 = arg3;
		this.anInt7375 = arg2;
		this.anInt7370 = arg0;
		this.anInt7345 = arg1;
		if (this.aBoolean518) {
			this.aClass9Array3[3].method8027();
			this.aClass9Array3[3].method8031();
		}
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(II)Lclient!cf;")
	protected Class9 method5779(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class9_Sub7(this);
		} else if (arg0 == 1) {
			return new Class9_Sub6(this);
		} else if (arg0 == 2) {
			return new Class9_Sub1(this, this.aClass242_6);
		} else if (arg0 == 7) {
			return new Class9_Sub8(this);
		} else {
			return new Class9_Sub11(this);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)I")
	@Override
	public final int method7793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!nh", name = "GA", descriptor = "(II)V")
	@Override
	public final void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7356 == arg0 && this.anInt7343 == arg1) {
			return;
		}
		this.anInt7343 = arg1;
		this.anInt7356 = arg0;
		this.method5732();
		this.method5676();
		this.method5743();
	}

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "(I)V")
	private void method5780() {
		if (this.aBoolean523) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray48;
		@Pc(13) float local13 = (float) this.anInt7356;
		@Pc(17) float local17 = (float) this.anInt7343;
		@Pc(29) float local29 = (float) -this.anInt7360 * this.aFloat170 / (float) this.anInt7352;
		@Pc(41) float local41 = this.aFloat170 * (float) -this.anInt7349 / (float) this.anInt7367;
		@Pc(56) float local56 = this.aFloat170 * (float) (this.anInt7180 - this.anInt7349) / (float) this.anInt7367;
		@Pc(71) float local71 = this.aFloat170 * (float) (this.anInt7241 - this.anInt7360) / (float) this.anInt7352;
		if (local56 == local41 || local29 == local71) {
			local9[5] = 1.0F;
			local9[3] = 0.0F;
			local9[13] = 0.0F;
			local9[7] = 0.0F;
			local9[11] = 0.0F;
			local9[6] = 0.0F;
			local9[8] = 0.0F;
			local9[9] = 0.0F;
			local9[10] = 1.0F;
			local9[15] = 1.0F;
			local9[12] = 0.0F;
			local9[14] = 0.0F;
			local9[4] = 0.0F;
			local9[1] = 0.0F;
			local9[2] = 0.0F;
			local9[0] = 1.0F;
		} else {
			local9[8] = 0.0F;
			local9[10] = 1.0F / (local13 - local17);
			local9[9] = 0.0F;
			local9[12] = (local56 + local41) / (local41 - local56);
			local9[3] = 0.0F;
			local9[2] = 0.0F;
			local9[7] = 0.0F;
			local9[5] = 2.0F / (local71 - local29);
			local9[4] = 0.0F;
			local9[11] = 0.0F;
			local9[0] = 2.0F / (local56 - local41);
			local9[1] = 0.0F;
			local9[15] = 1.0F;
			local9[14] = local13 / (local13 - local17);
			local9[6] = 0.0F;
			local9[13] = (local71 + local29) / (-local29 + local71);
		}
		this.method5774();
		this.aBoolean523 = true;
	}

	@OriginalMember(owner = "client!nh", name = "MA", descriptor = "(III[I)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass81_Sub1_16.method1959((float) arg2, (float) arg1, (float) arg0);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt7367 * this.aClass81_Sub1_16.method1975((float) arg0, (float) arg2, (float) arg1) / local14);
			local58 = (int) ((float) this.anInt7352 * this.aClass81_Sub1_16.method1965((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local58 = this.anInt7360;
			local40 = this.anInt7349;
		}
		arg3[1] = (int) ((float) local58 - this.aFloat165);
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local40 - this.aFloat167);
	}

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "(B)V")
	protected abstract void method5781();

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "()Z")
	@Override
	public final boolean method7831() {
		return true;
	}

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "(I)V")
	public final void method5782() {
		if (this.anInt7365 == 4) {
			return;
		}
		this.method5763();
		this.method5701(false);
		this.method5717(false);
		this.method5661(false);
		this.method5702(false);
		this.method5692(-2, false, false);
		this.method5716(1);
		this.method5757(0);
		this.anInt7365 = 4;
	}

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "(Z)V")
	protected abstract void method5783();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!jb;I[BZI)Lclient!wca;")
	public abstract Interface23 method5784(@OriginalArg(1) Class161 arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "(B)V")
	protected abstract void method5785();

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "(Z)V")
	public final void method5786() {
		this.aBoolean512 = false;
		this.method5697();
	}

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "(B)V")
	private void method5787() {
		if (this.aClass357_6 == Static384.aClass357_7) {
			return;
		}
		@Pc(6) Class357 local6 = this.aClass357_6;
		this.aClass357_6 = Static384.aClass357_7;
		if (!local6.method8118()) {
			this.method5673();
		}
		this.method5780();
		this.aFloatArray50 = this.aFloatArray48;
		this.method5689();
		this.anInt7365 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([I)V")
	@Override
	public final void method7806(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt7241;
		arg0[0] = this.anInt7180;
	}

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "()Lclient!q;")
	@Override
	public final Class81 method7812() {
		return this.aClass81_Sub1_21;
	}
}
