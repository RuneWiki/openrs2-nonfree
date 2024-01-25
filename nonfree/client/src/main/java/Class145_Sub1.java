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

@OriginalClass("client!lb")
public abstract class Class145_Sub1 extends Class145 {

	@OriginalMember(owner = "client!lb", name = "Yb", descriptor = "[I")
	public static final int[] anIntArray760 = new int[16384];

	@OriginalMember(owner = "client!lb", name = "hg", descriptor = "[I")
	public static final int[] anIntArray761 = new int[16384];

	@OriginalMember(owner = "client!lb", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!lb", name = "Zd", descriptor = "Lclient!oc;")
	protected Class270 aClass270_8;

	@OriginalMember(owner = "client!lb", name = "cf", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!lb", name = "vg", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7;

	@OriginalMember(owner = "client!lb", name = "Bd", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!lb", name = "Ve", descriptor = "I")
	public int anInt11238;

	@OriginalMember(owner = "client!lb", name = "Tf", descriptor = "I")
	public int anInt11239;

	@OriginalMember(owner = "client!lb", name = "ce", descriptor = "I")
	protected int anInt11240;

	@OriginalMember(owner = "client!lb", name = "ef", descriptor = "F")
	private float aFloat179;

	@OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lclient!iba;")
	public Interface9 anInterface9_3;

	@OriginalMember(owner = "client!lb", name = "mf", descriptor = "[Lclient!fv;")
	protected Class86_Sub2[] aClass86_Sub2Array3;

	@OriginalMember(owner = "client!lb", name = "hd", descriptor = "[Lclient!iba;")
	private Interface9[] anInterface9Array3;

	@OriginalMember(owner = "client!lb", name = "uf", descriptor = "[Lclient!hb;")
	protected Class146[] aClass146Array3;

	@OriginalMember(owner = "client!lb", name = "eb", descriptor = "I")
	protected int anInt11249;

	@OriginalMember(owner = "client!lb", name = "Of", descriptor = "Lclient!ic;")
	private Class74_Sub1 aClass74_Sub1_3;

	@OriginalMember(owner = "client!lb", name = "Kf", descriptor = "I")
	public int anInt11251;

	@OriginalMember(owner = "client!lb", name = "Bb", descriptor = "I")
	protected int anInt11252;

	@OriginalMember(owner = "client!lb", name = "Je", descriptor = "F")
	public float aFloat182;

	@OriginalMember(owner = "client!lb", name = "zd", descriptor = "[Lclient!pk;")
	protected Class293[] aClass293Array5;

	@OriginalMember(owner = "client!lb", name = "Qb", descriptor = "[Lclient!pk;")
	protected Class293[] aClass293Array6;

	@OriginalMember(owner = "client!lb", name = "he", descriptor = "Z")
	public boolean aBoolean949;

	@OriginalMember(owner = "client!lb", name = "mg", descriptor = "F")
	public float aFloat183;

	@OriginalMember(owner = "client!lb", name = "Gb", descriptor = "I")
	private int anInt11255;

	@OriginalMember(owner = "client!lb", name = "pd", descriptor = "F")
	private float aFloat185;

	@OriginalMember(owner = "client!lb", name = "Be", descriptor = "Lclient!au;")
	private Class26 aClass26_3;

	@OriginalMember(owner = "client!lb", name = "xd", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!lb", name = "Ze", descriptor = "Z")
	public boolean aBoolean952;

	@OriginalMember(owner = "client!lb", name = "Ab", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
	public int anInt11263;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	protected int anInt11264;

	@OriginalMember(owner = "client!lb", name = "Xe", descriptor = "[Lclient!bba;")
	protected Class2_Sub7[] aClass2_Sub7Array8;

	@OriginalMember(owner = "client!lb", name = "wc", descriptor = "Lclient!qaa;")
	private Class303 aClass303_3;

	@OriginalMember(owner = "client!lb", name = "lc", descriptor = "Z")
	protected boolean aBoolean957;

	@OriginalMember(owner = "client!lb", name = "Hb", descriptor = "Z")
	public boolean aBoolean958;

	@OriginalMember(owner = "client!lb", name = "cb", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!lb", name = "Jb", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!lb", name = "Xf", descriptor = "I")
	private int anInt11272;

	@OriginalMember(owner = "client!lb", name = "qd", descriptor = "I")
	public int anInt11275;

	@OriginalMember(owner = "client!lb", name = "vb", descriptor = "Z")
	protected boolean aBoolean961;

	@OriginalMember(owner = "client!lb", name = "pc", descriptor = "I")
	protected int anInt11278;

	@OriginalMember(owner = "client!lb", name = "Vc", descriptor = "I")
	public int anInt11280;

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "Lclient!oka;")
	private Class277 aClass277_17;

	@OriginalMember(owner = "client!lb", name = "Qe", descriptor = "Lclient!oka;")
	private Class277 aClass277_18;

	@OriginalMember(owner = "client!lb", name = "V", descriptor = "Lclient!oka;")
	public Class277 aClass277_19;

	@OriginalMember(owner = "client!lb", name = "ud", descriptor = "Lclient!uh;")
	private Interface24 anInterface24_16;

	@OriginalMember(owner = "client!lb", name = "Pd", descriptor = "Lclient!oka;")
	public Class277 aClass277_20;

	@OriginalMember(owner = "client!lb", name = "dg", descriptor = "Lclient!oka;")
	private Class277 aClass277_21;

	@OriginalMember(owner = "client!lb", name = "Od", descriptor = "Lclient!uh;")
	private Interface24 anInterface24_17;

	@OriginalMember(owner = "client!lb", name = "kg", descriptor = "Lclient!lg;")
	private Interface15 anInterface15_8;

	@OriginalMember(owner = "client!lb", name = "Ac", descriptor = "Lclient!uh;")
	private Interface24 anInterface24_18;

	@OriginalMember(owner = "client!lb", name = "Yf", descriptor = "Lclient!oka;")
	public Class277 aClass277_22;

	@OriginalMember(owner = "client!lb", name = "rg", descriptor = "Lclient!oka;")
	public Class277 aClass277_23;

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "Z")
	protected boolean aBoolean963;

	@OriginalMember(owner = "client!lb", name = "Ae", descriptor = "I")
	private int anInt11281;

	@OriginalMember(owner = "client!lb", name = "Cb", descriptor = "Lclient!cga;")
	private final Class60 aClass60_234 = new Class60();

	@OriginalMember(owner = "client!lb", name = "we", descriptor = "Z")
	protected boolean aBoolean942 = true;

	@OriginalMember(owner = "client!lb", name = "fe", descriptor = "Lclient!fv;")
	protected final Class86_Sub2 aClass86_Sub2_15 = new Class86_Sub2();

	@OriginalMember(owner = "client!lb", name = "sc", descriptor = "Lclient!fv;")
	public Class86_Sub2 aClass86_Sub2_16 = new Class86_Sub2();

	@OriginalMember(owner = "client!lb", name = "be", descriptor = "Lclient!fv;")
	public final Class86_Sub2 aClass86_Sub2_17 = new Class86_Sub2();

	@OriginalMember(owner = "client!lb", name = "vf", descriptor = "Lclient!fv;")
	protected final Class86_Sub2 aClass86_Sub2_18 = new Class86_Sub2();

	@OriginalMember(owner = "client!lb", name = "Fc", descriptor = "Lclient!fv;")
	private final Class86_Sub2 aClass86_Sub2_19 = new Class86_Sub2();

	@OriginalMember(owner = "client!lb", name = "Fd", descriptor = "Lclient!fv;")
	private final Class86_Sub2 aClass86_Sub2_20 = new Class86_Sub2();

	@OriginalMember(owner = "client!lb", name = "Oe", descriptor = "I")
	protected int anInt11243 = 0;

	@OriginalMember(owner = "client!lb", name = "Uc", descriptor = "Z")
	private boolean aBoolean943 = false;

	@OriginalMember(owner = "client!lb", name = "Wf", descriptor = "[F")
	private final float[] aFloatArray70 = new float[16];

	@OriginalMember(owner = "client!lb", name = "vd", descriptor = "Z")
	protected boolean aBoolean944 = true;

	@OriginalMember(owner = "client!lb", name = "Dc", descriptor = "I")
	public int anInt11245 = 512;

	@OriginalMember(owner = "client!lb", name = "fg", descriptor = "I")
	private int anInt11244 = 0;

	@OriginalMember(owner = "client!lb", name = "ve", descriptor = "F")
	public float aFloat180 = 3584.0F;

	@OriginalMember(owner = "client!lb", name = "jc", descriptor = "I")
	protected int anInt11253 = 0;

	@OriginalMember(owner = "client!lb", name = "Eb", descriptor = "[F")
	public final float[] aFloatArray68 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!lb", name = "re", descriptor = "F")
	public float aFloat181 = 1.0F;

	@OriginalMember(owner = "client!lb", name = "nd", descriptor = "Z")
	protected boolean aBoolean951 = true;

	@OriginalMember(owner = "client!lb", name = "Kc", descriptor = "Z")
	private boolean aBoolean950 = false;

	@OriginalMember(owner = "client!lb", name = "Qf", descriptor = "I")
	public int anInt11250 = 50;

	@OriginalMember(owner = "client!lb", name = "Ef", descriptor = "I")
	protected final int anInt11254 = 0;

	@OriginalMember(owner = "client!lb", name = "nc", descriptor = "[F")
	private final float[] aFloatArray72 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!lb", name = "pg", descriptor = "Z")
	protected boolean aBoolean954 = false;

	@OriginalMember(owner = "client!lb", name = "tf", descriptor = "[F")
	protected float[] aFloatArray73 = this.aFloatArray72;

	@OriginalMember(owner = "client!lb", name = "Tb", descriptor = "I")
	private int anInt11262 = 1;

	@OriginalMember(owner = "client!lb", name = "Wc", descriptor = "I")
	public int anInt11241 = 512;

	@OriginalMember(owner = "client!lb", name = "ke", descriptor = "Z")
	protected boolean aBoolean947 = false;

	@OriginalMember(owner = "client!lb", name = "hf", descriptor = "I")
	protected final int anInt11248 = 0;

	@OriginalMember(owner = "client!lb", name = "Ff", descriptor = "Z")
	private boolean aBoolean948 = false;

	@OriginalMember(owner = "client!lb", name = "qf", descriptor = "I")
	public int anInt11246 = 0;

	@OriginalMember(owner = "client!lb", name = "Sd", descriptor = "[F")
	public final float[] aFloatArray74 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!lb", name = "Zf", descriptor = "F")
	public float aFloat188 = 1.0F;

	@OriginalMember(owner = "client!lb", name = "Rf", descriptor = "I")
	protected int anInt11258 = 3584;

	@OriginalMember(owner = "client!lb", name = "sb", descriptor = "I")
	public int anInt11257 = -1;

	@OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
	public int anInt11266 = 128;

	@OriginalMember(owner = "client!lb", name = "oe", descriptor = "I")
	public int anInt11265 = 3;

	@OriginalMember(owner = "client!lb", name = "nf", descriptor = "F")
	public float aFloat189 = 3584.0F;

	@OriginalMember(owner = "client!lb", name = "Gd", descriptor = "I")
	private int anInt11247 = -1;

	@OriginalMember(owner = "client!lb", name = "Ke", descriptor = "I")
	public int anInt11261 = -1;

	@OriginalMember(owner = "client!lb", name = "Ld", descriptor = "I")
	protected int anInt11242 = 0;

	@OriginalMember(owner = "client!lb", name = "Yc", descriptor = "Z")
	protected boolean aBoolean955 = false;

	@OriginalMember(owner = "client!lb", name = "Uf", descriptor = "F")
	public float aFloat191 = -1.0F;

	@OriginalMember(owner = "client!lb", name = "Td", descriptor = "Lclient!rh;")
	protected Class323 aClass323_8 = Static396.aClass323_3;

	@OriginalMember(owner = "client!lb", name = "ob", descriptor = "Z")
	protected boolean aBoolean959 = false;

	@OriginalMember(owner = "client!lb", name = "ig", descriptor = "Z")
	private boolean aBoolean945 = false;

	@OriginalMember(owner = "client!lb", name = "Mf", descriptor = "I")
	private int anInt11267 = -1;

	@OriginalMember(owner = "client!lb", name = "Bc", descriptor = "I")
	private int anInt11269 = 0;

	@OriginalMember(owner = "client!lb", name = "If", descriptor = "[F")
	private final float[] aFloatArray71 = new float[16];

	@OriginalMember(owner = "client!lb", name = "xg", descriptor = "[F")
	private final float[] aFloatArray69 = new float[16];

	@OriginalMember(owner = "client!lb", name = "Cd", descriptor = "I")
	public int anInt11259 = 0;

	@OriginalMember(owner = "client!lb", name = "ie", descriptor = "Z")
	protected boolean aBoolean946 = true;

	@OriginalMember(owner = "client!lb", name = "Ee", descriptor = "Lclient!pia;")
	protected Class291 aClass291_9 = Static460.aClass291_8;

	@OriginalMember(owner = "client!lb", name = "hb", descriptor = "F")
	private float aFloat190 = 1.0F;

	@OriginalMember(owner = "client!lb", name = "gc", descriptor = "Z")
	protected boolean aBoolean960 = true;

	@OriginalMember(owner = "client!lb", name = "lf", descriptor = "[F")
	private final float[] aFloatArray76 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!lb", name = "P", descriptor = "Z")
	private boolean aBoolean956 = false;

	@OriginalMember(owner = "client!lb", name = "Qd", descriptor = "F")
	public float aFloat194 = 1.0F;

	@OriginalMember(owner = "client!lb", name = "ac", descriptor = "I")
	private int anInt11256 = 16777215;

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
	private int anInt11271 = -1;

	@OriginalMember(owner = "client!lb", name = "ad", descriptor = "F")
	public float aFloat184 = 1.0F;

	@OriginalMember(owner = "client!lb", name = "xe", descriptor = "I")
	protected int anInt11277 = 0;

	@OriginalMember(owner = "client!lb", name = "Pc", descriptor = "Z")
	protected boolean aBoolean953 = true;

	@OriginalMember(owner = "client!lb", name = "Jc", descriptor = "F")
	public float aFloat195 = -1.0F;

	@OriginalMember(owner = "client!lb", name = "nb", descriptor = "[F")
	private final float[] aFloatArray75 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!lb", name = "Xb", descriptor = "I")
	public int anInt11270 = 8;

	@OriginalMember(owner = "client!lb", name = "ne", descriptor = "I")
	private int anInt11276 = 0;

	@OriginalMember(owner = "client!lb", name = "ed", descriptor = "[Lclient!au;")
	private final Class26[] aClass26Array3 = new Class26[10];

	@OriginalMember(owner = "client!lb", name = "yd", descriptor = "I")
	private int anInt11274 = 0;

	@OriginalMember(owner = "client!lb", name = "dc", descriptor = "I")
	protected int anInt11279 = 0;

	@OriginalMember(owner = "client!lb", name = "zb", descriptor = "I")
	public int anInt11273 = 0;

	@OriginalMember(owner = "client!lb", name = "Bf", descriptor = "Z")
	private boolean aBoolean962 = false;

	@OriginalMember(owner = "client!lb", name = "md", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!lb", name = "fc", descriptor = "[Lclient!fca;")
	public final Class45_Sub2[] aClass45_Sub2Array5 = new Class45_Sub2[7];

	@OriginalMember(owner = "client!lb", name = "Lb", descriptor = "[Lclient!fca;")
	public final Class45_Sub2[] aClass45_Sub2Array6 = new Class45_Sub2[7];

	@OriginalMember(owner = "client!lb", name = "Rb", descriptor = "Lclient!fv;")
	private final Class86_Sub2 aClass86_Sub2_21 = new Class86_Sub2();

	@OriginalMember(owner = "client!lb", name = "Ec", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas13;

	@OriginalMember(owner = "client!lb", name = "gd", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!lb", name = "Zc", descriptor = "Ljava/lang/Object;")
	protected final Object anObject21;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!lb", name = "ag", descriptor = "Lclient!nca;")
	protected final Class254 aClass254_173;

	@OriginalMember(owner = "client!lb", name = "Se", descriptor = "I")
	protected final int anInt11260;

	@OriginalMember(owner = "client!lb", name = "Id", descriptor = "I")
	private int anInt11097;

	@OriginalMember(owner = "client!lb", name = "Lf", descriptor = "I")
	public int anInt11144;

	@OriginalMember(owner = "client!lb", name = "Md", descriptor = "I")
	public final int anInt11268;

	@OriginalMember(owner = "client!lb", name = "Dd", descriptor = "I")
	private int anInt11117;

	@OriginalMember(owner = "client!lb", name = "ub", descriptor = "I")
	public int anInt11157;

	@OriginalMember(owner = "client!lb", name = "wb", descriptor = "Lclient!hr;")
	private final Class166 aClass166_3;

	@OriginalMember(owner = "client!lb", name = "cd", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	static {
		@Pc(1066) double local1066 = 3.834951969714103E-4D;
		for (@Pc(1068) int local1068 = 0; local1068 < 16384; local1068++) {
			anIntArray761[local1068] = (int) (Math.sin((double) local1068 * local1066) * 16384.0D);
			anIntArray760[local1068] = (int) (Math.cos(local1066 * (double) local1068) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!nca;II)V")
	protected Class145_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) Class254 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.aCanvas12 = this.aCanvas13 = arg0;
			this.anObject20 = this.anObject21 = arg1;
			this.aClass254_173 = arg3;
			this.anInt11260 = arg4;
			@Pc(315) Dimension local315 = arg0.getSize();
			this.anInt11144 = this.anInt11097 = local315.height;
			this.anInt11268 = arg5;
			this.anInt11157 = this.anInt11117 = local315.width;
			Static669.method9116(false, true);
			if (super.anInterface3_12 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt11268);
				this.aClass166_3 = null;
			} else {
				this.aClass166_3 = new Class166(this, super.anInterface3_12);
				this.aNativeInterface3 = new NativeInterface(super.anInterface3_12.method2856(), this.anInt11268);
				for (@Pc(360) int local360 = 0; local360 < super.anInterface3_12.method2856(); local360++) {
					@Pc(368) Class8 local368 = super.anInterface3_12.method2857(local360);
					if (local368 != null) {
						this.aNativeInterface3.initTextureMetrics(local360, local368.aByte13, local368.aByte12);
					}
				}
			}
		} catch (@Pc(406) Throwable local406) {
			local406.printStackTrace();
			this.method9661();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt11257 == arg0 && arg1 == this.anInt11261 && this.anInt11259 == arg2) {
			return;
		}
		this.anInt11261 = arg1;
		this.anInt11257 = arg0;
		this.anInt11259 = arg2;
		this.method9770();
		this.method9810();
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt11250;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class133 method9679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class133_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)I")
	@Override
	public final int method9695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "(I)V")
	@Override
	public final void method9672(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass166_3 != null) {
			this.aClass166_3.method3568();
		}
		this.anInt11266 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIIIZ)V")
	private void method9719(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) boolean local4 = arg4 & this.method9710();
		if (!local4 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg2 = 1;
			arg3 = 0;
		}
		if (arg1 != 0 && arg0) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt11244) {
			if (this.anInt11244 != 0) {
				this.aClass26Array3[Integer.MAX_VALUE & this.anInt11244].method8009();
			}
			if (arg1 == 0) {
				this.aClass26_3 = null;
			} else {
				this.aClass26_3 = this.aClass26Array3[arg1 & Integer.MAX_VALUE];
				this.aClass26_3.method8006(arg0);
				this.aClass26_3.method7998(arg0);
				this.aClass26_3.method8007(arg2, arg3);
			}
			this.anInt11244 = arg1;
			this.anInt11276 = arg2;
			this.anInt11269 = arg3;
		} else if (this.anInt11244 != 0) {
			this.aClass26Array3[Integer.MAX_VALUE & this.anInt11244].method7998(arg0);
			if (this.anInt11269 != arg3 || this.anInt11276 != arg2) {
				this.aClass26Array3[this.anInt11244 & Integer.MAX_VALUE].method8007(arg2, arg3);
				this.anInt11276 = arg2;
				this.anInt11269 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIZ)Lclient!ug;")
	@Override
	public final Class43 method9654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class43_Sub1 local11 = new Class43_Sub1(this, arg2, arg3, arg4);
		local11.method9597(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()Z")
	@Override
	public final boolean method9698() {
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(B)V")
	protected abstract void method9720();

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
	@Override
	public final void method9669(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass86_Sub2_16.method2715((float) arg2, (float) arg1, (float) arg0);
		@Pc(42) int local42;
		@Pc(60) int local60;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local42 = (int) ((float) this.anInt11241 * this.aClass86_Sub2_16.method2736((float) arg1, (float) arg0, (float) arg2) / local14);
			local60 = (int) ((float) this.anInt11245 * this.aClass86_Sub2_16.method2728((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local42 = this.anInt11246;
			local60 = this.anInt11273;
		}
		arg3[1] = (int) ((float) local60 - this.aFloat187);
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local42 - this.aFloat186);
	}

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "(I)Lclient!fv;")
	public final Class86_Sub2 method9721() {
		return this.aClass86_Sub2_18;
	}

	@OriginalMember(owner = "client!lb", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt11258;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!gw;)V")
	@Override
	public final void method9656(@OriginalArg(0) Class86 arg0) {
		this.aClass86_Sub2_16 = (Class86_Sub2) arg0;
		this.aClass86_Sub2_18.method7032(this.aClass86_Sub2_16);
		this.aClass86_Sub2_18.method2727();
		this.aClass86_Sub2_19.method2732(this.aClass86_Sub2_18);
		this.aClass86_Sub2_17.method2732(this.aClass86_Sub2_16);
		if (this.aClass291_9.method7016()) {
			this.method9751();
		}
	}

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "(B)V")
	private void method9722() {
		if (Static288.aClass291_3 == this.aClass291_9) {
			return;
		}
		@Pc(6) Class291 local6 = this.aClass291_9;
		this.aClass291_9 = Static288.aClass291_3;
		if (!local6.method7016()) {
			this.method9751();
		}
		this.method9735();
		this.aFloatArray73 = this.aFloatArray71;
		this.method9819();
		this.anInt11272 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method9663(@OriginalArg(0) Class2_Sub28 arg0) {
		this.aNativeHeap6 = ((Class2_Sub28_Sub2) arg0).aNativeHeap3;
		this.aNativeHeapBuffer8 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZ[FILclient!pm;I)Lclient!de;")
	public final Interface4 method9723(@OriginalArg(0) boolean arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class295 arg3, @OriginalArg(5) int arg4) {
		return this.method9805(arg4, arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBZZ)V")
	public final void method9724(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt11267 != arg0 || this.aBoolean952 != this.aBoolean950) {
			@Pc(35) Interface4 local35 = null;
			@Pc(37) int local37 = 0;
			@Pc(39) byte local39 = 0;
			@Pc(41) int local41 = 0;
			@Pc(49) int local49 = this.aBoolean952 ? 3 : 0;
			if (arg0 < 0) {
				this.method9837();
			} else {
				local35 = this.aClass166_3.method3570(arg0);
				@Pc(70) Class8 local70 = super.anInterface3_12.method2857(arg0);
				if (local70.aByte16 == 0 && local70.aByte14 == 0) {
					this.method9837();
				} else {
					@Pc(88) int local88 = local70.aBoolean28 ? 64 : 128;
					@Pc(92) int local92 = local88 * 50;
					@Pc(96) Class86_Sub2 local96 = this.method9821();
					local96.method2724(0.0F, (float) (this.anInt11263 % local92 * local70.aByte16) / (float) local92, (float) (local70.aByte14 * (this.anInt11263 % local92)) / (float) local92);
					this.method9750(Static145.aClass146_2);
				}
				if (!this.aBoolean952) {
					local39 = local70.aByte11;
					local41 = local70.anInt189;
					local49 = local70.aByte15;
				}
				local37 = local70.anInt188;
			}
			this.method9719(arg1, local49, local41, local39, arg2);
			if (this.aClass26_3 == null) {
				this.method9754(local35);
				this.method9797(local37);
			} else {
				this.aClass26_3.method8004(local35, local37);
			}
			this.anInt11267 = arg0;
			this.aBoolean950 = this.aBoolean952;
		}
		this.anInt11272 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!pk;Lclient!pk;I)V")
	public final void method9725(@OriginalArg(0) Class293 arg0, @OriginalArg(1) Class293 arg1) {
		@Pc(5) boolean local5 = false;
		if (this.aClass293Array6[this.anInt11277] != arg0) {
			this.aClass293Array6[this.anInt11277] = arg0;
			local5 = true;
			this.method9788();
		}
		if (this.aClass293Array5[this.anInt11277] != arg1) {
			this.aClass293Array5[this.anInt11277] = arg1;
			this.method9809();
			local5 = true;
		}
		if (local5) {
			this.anInt11272 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "(B)I")
	public final int method9726() {
		return this.anInt11247;
	}

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "(B)V")
	protected final void method9727() {
		@Pc(17) Hashtable local17 = new Hashtable();
		if (this.aHashtable7 != null && !this.aHashtable7.isEmpty()) {
			@Pc(30) Enumeration local30 = this.aHashtable7.keys();
			while (local30.hasMoreElements()) {
				@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
				local17.put(local36, this.method9836(local36));
			}
		}
		this.aHashtable7 = local17;
		this.method9834();
		this.method9808();
		this.method9815();
		this.aClass303_3.method7139(this);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IZ)V")
	public final void method9728(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean951) {
			this.aBoolean951 = arg0;
			this.method9810();
		}
	}

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean953 = arg0;
		this.method9787();
	}

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "(I)V")
	protected abstract void method9729();

	@OriginalMember(owner = "client!lb", name = "Z", descriptor = "(I)V")
	public final void method9730() {
		this.aClass86_Sub2_15.method7024();
		this.aBoolean942 = true;
		this.method9757();
	}

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "(I)V")
	protected final void method9731() {
		@Pc(9) Enumeration local9 = this.aHashtable7.keys();
		while (local9.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local9.nextElement();
			this.method9748(local17, this.aHashtable7.get(local17));
		}
		this.anInterface24_16.method9218();
		this.anInterface24_17.method9218();
		this.anInterface24_18.method9218();
		for (@Pc(46) int local46 = 0; local46 < 7; local46++) {
			this.aClass45_Sub2Array6[local46].method2500();
		}
		if (7 != 7) {
			this.method9640((Canvas) null);
		}
		this.aClass303_3.method7141();
		this.anInterface15_8.method9218();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BILclient!pm;III)Lclient!fi;")
	public abstract Interface7 method9732(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class295 arg1);

	@OriginalMember(owner = "client!lb", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean952) {
			throw new RuntimeException("");
		}
		this.anInt11271 = arg2;
		this.anInt11247 = arg1;
		this.anInt11255 = arg0;
		this.anInt11274 = arg3;
		if (this.aBoolean950) {
			this.aClass26Array3[3].method7996();
			this.aClass26Array3[3].method8000();
		}
	}

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "()Z")
	@Override
	public final boolean method9675() {
		return this.aBoolean957;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IIZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method9733(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap6.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "(I)V")
	private void method9734() {
		this.aBoolean948 = false;
		if (Static389.aClass291_6 == this.aClass291_9) {
			this.method9817();
			this.method9819();
		}
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "(Z)V")
	private void method9735() {
		if (this.aBoolean962) {
			return;
		}
		@Pc(16) float[] local16 = this.aFloatArray71;
		@Pc(20) float local20 = (float) this.anInt11250;
		@Pc(24) float local24 = (float) this.anInt11258;
		@Pc(36) float local36 = (float) -this.anInt11273 * this.aFloat190 / (float) this.anInt11245;
		@Pc(48) float local48 = this.aFloat190 * (float) -this.anInt11246 / (float) this.anInt11241;
		@Pc(62) float local62 = this.aFloat190 * (float) (this.anInt11157 - this.anInt11246) / (float) this.anInt11241;
		@Pc(77) float local77 = this.aFloat190 * (float) (this.anInt11144 - this.anInt11273) / (float) this.anInt11245;
		if (local62 == local48 || local36 == local77) {
			local16[0] = 1.0F;
			local16[14] = 0.0F;
			local16[11] = 0.0F;
			local16[3] = 0.0F;
			local16[2] = 0.0F;
			local16[1] = 0.0F;
			local16[9] = 0.0F;
			local16[12] = 0.0F;
			local16[10] = 1.0F;
			local16[15] = 1.0F;
			local16[6] = 0.0F;
			local16[4] = 0.0F;
			local16[13] = 0.0F;
			local16[5] = 1.0F;
			local16[7] = 0.0F;
			local16[8] = 0.0F;
		} else {
			local16[10] = 1.0F / (local20 - local24);
			local16[14] = local20 / (local20 - local24);
			local16[4] = 0.0F;
			local16[5] = 2.0F / (local77 - local36);
			local16[12] = (local62 + local48) / (-local62 + local48);
			local16[7] = 0.0F;
			local16[1] = 0.0F;
			local16[13] = (local36 + local77) / (local77 - local36);
			local16[2] = 0.0F;
			local16[11] = 0.0F;
			local16[8] = 0.0F;
			local16[3] = 0.0F;
			local16[9] = 0.0F;
			local16[6] = 0.0F;
			local16[0] = 2.0F / (local62 - local48);
			local16[15] = 1.0F;
		}
		this.method9758();
		this.aBoolean962 = true;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ifa;B)V")
	public abstract void method9736(@OriginalArg(0) Class175 arg0);

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "(I)V")
	protected abstract void method9737();

	@OriginalMember(owner = "client!lb", name = "S", descriptor = "(I)V")
	public final void method9738() {
		this.method9784(2, Static289.aClass317_4);
	}

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "(I)V")
	protected abstract void method9739();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ[[II)Lclient!on;")
	public abstract Interface18 method9740(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!lb", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass86_Sub2_16.method2715((float) arg2, (float) arg1, (float) arg0);
		@Pc(27) int local27;
		@Pc(30) int local30;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local27 = (int) ((float) this.anInt11241 * this.aClass86_Sub2_16.method2736((float) arg1, (float) arg0, (float) arg2) / local14);
			local30 = (int) ((float) this.anInt11245 * this.aClass86_Sub2_16.method2728((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local27 = this.anInt11246;
			local30 = this.anInt11273;
		}
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local27 - this.aFloat186);
		arg3[1] = (int) ((float) local30 - this.aFloat187);
	}

	@OriginalMember(owner = "client!lb", name = "N", descriptor = "(I)Lclient!fv;")
	public final Class86_Sub2 method9741() {
		if (!this.aBoolean945) {
			this.aClass86_Sub2_20.method2731(this.aClass86_Sub2_18, this.aClass86_Sub2_15);
			this.aBoolean945 = true;
		}
		return this.aClass86_Sub2_20;
	}

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "(I)V")
	private void method9742() {
		if (this.aClass291_9 == Static645.aClass291_7) {
			return;
		}
		@Pc(6) Class291 local6 = this.aClass291_9;
		this.aClass291_9 = Static645.aClass291_7;
		if (!local6.method7016()) {
			this.method9751();
		}
		this.method9820();
		this.aFloatArray73 = this.aFloatArray69;
		this.method9819();
		this.anInt11272 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method9704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!fv;I)V")
	public final void method9743(@OriginalArg(0) Class86_Sub2 arg0) {
		this.aClass86_Sub2_15.method7032(arg0);
		this.aBoolean942 = false;
		this.method9757();
	}

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt11281;
	}

	@OriginalMember(owner = "client!lb", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt11279 = this.anInt11157;
		this.anInt11242 = this.anInt11144;
		this.anInt11243 = 0;
		this.anInt11253 = 0;
		if (this.aBoolean963) {
			this.aBoolean963 = false;
			this.method9789();
		}
		this.method9818();
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "(I)[F")
	public final float[] method9744() {
		return this.aFloatArray72;
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "(II)V")
	public final void method9745(@OriginalArg(0) int arg0) {
		if (this.anInt11277 != arg0) {
			this.anInt11277 = arg0;
			this.method9794();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method9631(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas13) {
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
			@Pc(61) Object local61 = this.method9836(arg0);
			if (local61 == null) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, local61);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZ)Lclient!ug;")
	@Override
	public final Class43 method9687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class43_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method9713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method9823();
		this.method9811();
		this.method9769(arg4);
		this.method9813(Static45.aClass352_1, 0);
		this.method9795(0, Static45.aClass352_1);
		this.method9832(arg5);
		this.aClass86_Sub2_15.method2718((float) (arg3 - 1), (float) (arg2 - 1), 1.0F);
		this.aClass86_Sub2_15.method2720(0.0F, (float) arg1 - local7, -local7 + (float) arg0);
		this.method9786();
		this.method9767(false);
		this.method9784(4, Static296.aClass317_5);
		this.method9767(true);
		this.method9795(0, Static231.aClass352_5);
		this.method9813(Static231.aClass352_5, 0);
	}

	@OriginalMember(owner = "client!lb", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt11265 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt11265++;
		}
		this.anInt11270 = 0x1 << this.anInt11265;
	}

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "(I)I")
	public final int method9746() {
		return this.anInt11274;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(ZB)V")
	public final void method9747(@OriginalArg(1) byte arg0) {
		this.method9769(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!lb", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat194) {
			this.aFloat194 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method9780();
			this.method9849();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method9748(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!lb", name = "W", descriptor = "(I)V")
	protected abstract void method9749();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!hb;)V")
	public final void method9750(@OriginalArg(1) Class146 arg0) {
		this.aClass146Array3[this.anInt11277] = arg0;
		this.method9793();
	}

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "(B)V")
	private void method9751() {
		this.aBoolean945 = false;
		if (this.aClass26_3 != null) {
			this.aClass26_3.method8005();
		}
		this.method9781();
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(Z)V")
	protected abstract void method9752();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([IZBII)Lclient!de;")
	public final Interface4 method9753(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method9802(arg2, arg3, 0, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLclient!iba;)V")
	public final void method9754(@OriginalArg(1) Interface9 arg0) {
		if (arg0 == this.anInterface9Array3[this.anInt11277]) {
			return;
		}
		this.anInterface9Array3[this.anInt11277] = arg0;
		if (arg0 == null) {
			this.method9779();
		} else {
			arg0.method8449();
		}
		this.anInt11272 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "(I)V")
	private void method9755() {
		this.aBoolean956 = false;
		this.method9820();
		if (Static645.aClass291_7 == this.aClass291_9) {
			this.method9819();
		}
	}

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "()Z")
	@Override
	public final boolean method9693() {
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
	@Override
	public final void method9633(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lb", name = "P", descriptor = "(I)Lclient!fv;")
	public final Class86_Sub2 method9756() {
		return this.aClass86_Sub2Array3[this.anInt11277];
	}

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "(B)V")
	private void method9757() {
		if (this.aClass291_9 == Static389.aClass291_6) {
			@Pc(19) float local19 = this.method9823();
			this.aClass86_Sub2_15.method2720(0.0F, local19, local19);
		}
		this.aBoolean945 = false;
		this.method9737();
		if (this.aClass26_3 != null) {
			this.aClass26_3.method8002();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!pga;[Lclient!tia;Z)Lclient!da;")
	@Override
	public final Class68 method9707(@OriginalArg(0) Class289 arg0, @OriginalArg(1) Class355[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class68_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "(B)V")
	private void method9758() {
		this.aFloat189 = (float) this.anInt11258;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method9640(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.method9748(arg0, this.aHashtable7.get(arg0));
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "(I)Lclient!fv;")
	public final Class86_Sub2 method9759() {
		return this.aClass86_Sub2_19;
	}

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "(B)V")
	protected abstract void method9760();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([I)V")
	@Override
	public final void method9668(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt11144;
		arg0[0] = this.anInt11157;
	}

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass86_Sub2_16.aFloat38 + this.aClass86_Sub2_16.aFloat37 * (float) arg2 + (float) arg0 * this.aClass86_Sub2_16.aFloat30 + this.aClass86_Sub2_16.aFloat39 * (float) arg1;
		@Pc(57) float local57 = this.aClass86_Sub2_16.aFloat38 + (float) arg5 * this.aClass86_Sub2_16.aFloat37 + this.aClass86_Sub2_16.aFloat30 * (float) arg3 + this.aClass86_Sub2_16.aFloat39 * (float) arg4;
		if (local32 < (float) this.anInt11250 && (float) this.anInt11250 > local57) {
			local7 |= 0x10;
		} else if ((float) this.anInt11258 < local32 && (float) this.anInt11258 < local57) {
			local7 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((float) this.anInt11241 * (this.aClass86_Sub2_16.aFloat33 * (float) arg0 + (float) arg1 * this.aClass86_Sub2_16.aFloat36 + (float) arg2 * this.aClass86_Sub2_16.aFloat32 + this.aClass86_Sub2_16.aFloat31) / (float) arg6);
		@Pc(163) int local163 = (int) (((float) arg3 * this.aClass86_Sub2_16.aFloat33 + (float) arg4 * this.aClass86_Sub2_16.aFloat36 + this.aClass86_Sub2_16.aFloat32 * (float) arg5 + this.aClass86_Sub2_16.aFloat31) * (float) this.anInt11241 / (float) arg6);
		if (this.aFloat186 > (float) local130 && (float) local163 < this.aFloat186) {
			local7 |= 0x1;
		} else if (this.aFloat193 < (float) local130 && (float) local163 > this.aFloat193) {
			local7 |= 0x2;
		}
		@Pc(236) int local236 = (int) ((this.aClass86_Sub2_16.aFloat35 * (float) arg2 + (float) arg1 * this.aClass86_Sub2_16.aFloat34 + (float) arg0 * this.aClass86_Sub2_16.aFloat40 + this.aClass86_Sub2_16.aFloat41) * (float) this.anInt11245 / (float) arg6);
		@Pc(269) int local269 = (int) ((float) this.anInt11245 * (this.aClass86_Sub2_16.aFloat41 + this.aClass86_Sub2_16.aFloat35 * (float) arg5 + (float) arg3 * this.aClass86_Sub2_16.aFloat40 + (float) arg4 * this.aClass86_Sub2_16.aFloat34) / (float) arg6);
		if (this.aFloat187 > (float) local236 && (float) local269 < this.aFloat187) {
			local7 |= 0x4;
		} else if ((float) local236 > this.aFloat182 && this.aFloat182 < (float) local269) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!mb;)V")
	@Override
	public final void method9666(@OriginalArg(0) Class236 arg0) {
		this.aClass303_3.method7138(this, arg0, -1);
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)V")
	private void method9761() {
		this.aBoolean962 = false;
		this.method9735();
		if (Static288.aClass291_3 == this.aClass291_9) {
			this.method9819();
		}
	}

	@OriginalMember(owner = "client!lb", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method9811();
		this.method9769(arg3);
		this.method9813(Static45.aClass352_1, 0);
		this.method9795(0, Static45.aClass352_1);
		this.method9832(arg4);
		this.aClass86_Sub2_15.method2718((float) arg2, (float) arg2, 1.0F);
		this.aClass86_Sub2_15.method7020(arg0, arg1, 0);
		this.method9786();
		this.method9767(false);
		this.method9800(0, this.anInterface24_18);
		this.method9766(this.aClass277_17);
		this.method9772(0, 256, Static289.aClass317_4);
		this.method9767(true);
		this.method9795(0, Static231.aClass352_5);
		this.method9813(Static231.aClass352_5, 0);
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "()Z")
	@Override
	public final boolean method9681() {
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	protected abstract void method9762(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(II)I")
	@Override
	public final int method9686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "(B)V")
	public final void method9763() {
		if (Static460.aClass291_8 == this.aClass291_9) {
			return;
		}
		@Pc(10) Class291 local10 = this.aClass291_9;
		this.aClass291_9 = Static460.aClass291_8;
		if (local10.method7016()) {
			this.method9751();
		}
		this.anInt11272 &= 0xFFFFFFE0;
		this.aFloatArray73 = this.aFloatArray72;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIF)Lclient!bba;")
	@Override
	public final Class2_Sub7 method9664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub7_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!mb;I)V")
	@Override
	public final void method9690(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1) {
		this.aClass303_3.method7138(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!hk;Lclient!pm;)Z")
	public abstract boolean method9764(@OriginalArg(1) Class158 arg0, @OriginalArg(2) Class295 arg1);

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "(B)V")
	public final void method9765() {
		this.anInterface9Array3 = new Interface9[this.anInt11280];
		this.aClass146Array3 = new Class146[this.anInt11280];
		this.aClass293Array6 = new Class293[this.anInt11280];
		this.aClass293Array5 = new Class293[this.anInt11280];
		this.aClass86_Sub2Array3 = new Class86_Sub2[this.anInt11280];
		for (@Pc(32) int local32 = 0; local32 < this.anInt11280; local32++) {
			this.aClass293Array5[local32] = Static105.aClass293_3;
			this.aClass293Array6[local32] = Static105.aClass293_3;
			this.aClass146Array3[local32] = Static540.aClass146_8;
			this.aClass86_Sub2Array3[local32] = new Class86_Sub2();
		}
		this.aClass2_Sub7Array8 = new Class2_Sub7[this.anInt11252 - 2];
		this.anInterface9_3 = this.method9782(Static165.aClass295_6, 1, Static243.aClass158_10, 1);
		this.method9663(new Class2_Sub28_Sub2(262144));
		this.aClass277_22 = this.method9830(new Class243[] { new Class243(new Class115[] { Static169.aClass115_1, Static169.aClass115_5 }) });
		this.aClass277_19 = this.method9830(new Class243[] { new Class243(new Class115[] { Static169.aClass115_1, Static169.aClass115_3 }) });
		this.aClass277_23 = this.method9830(new Class243[] { new Class243(Static169.aClass115_1), new Class243(Static169.aClass115_3), new Class243(Static169.aClass115_5), new Class243(Static169.aClass115_2) });
		this.aClass277_20 = this.method9830(new Class243[] { new Class243(Static169.aClass115_1), new Class243(Static169.aClass115_3), new Class243(Static169.aClass115_5) });
		for (@Pc(196) int local196 = 0; local196 < 7; local196++) {
			this.aClass45_Sub2Array5[local196] = new Class45_Sub2(this, 0, 0, false, false);
			this.aClass45_Sub2Array6[local196] = new Class45_Sub2(this, 0, 0, true, true);
		}
		this.aClass303_3 = new Class303(this);
		this.anInterface15_8 = this.method9776(true);
		this.method9727();
		this.aClass270_8 = new Class270(this);
		this.aClass26Array3[1] = this.method9814(1);
		this.aClass26Array3[2] = this.method9814(2);
		this.aClass26Array3[4] = this.method9814(4);
		this.aClass26Array3[5] = this.method9814(5);
		this.aClass26Array3[6] = this.method9814(6);
		this.aClass26Array3[7] = this.method9814(7);
		this.aClass26Array3[3] = this.method9814(3);
		if (76 != 76) {
			return;
		}
		this.aClass26Array3[8] = this.method9814(8);
		this.aClass26Array3[9] = this.method9814(9);
		if (!this.aClass26Array3[2].method8001()) {
			this.aClass26Array3[2] = this.method9814(0);
		}
		if (!this.aClass26Array3[4].method8001()) {
			this.aClass26Array3[4] = this.aClass26Array3[2];
		}
		if (!this.aClass26Array3[8].method8001()) {
			this.aClass26Array3[8] = this.aClass26Array3[4];
		}
		if (!this.aClass26Array3[9].method8001()) {
			this.aClass26Array3[9] = this.aClass26Array3[8];
		}
		this.method9840((byte) -39);
		this.la();
		this.method9636();
	}

	@OriginalMember(owner = "client!lb", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass86_Sub2_16.method2715((float) arg2, (float) arg1, (float) arg0);
		if ((float) this.anInt11250 > local14 || (float) this.anInt11258 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(61) int local61 = (int) ((float) this.anInt11241 * this.aClass86_Sub2_16.method2736((float) arg1, (float) arg0, (float) arg2) / (float) arg3);
		@Pc(80) int local80 = (int) ((float) this.anInt11245 * this.aClass86_Sub2_16.method2728((float) arg1, (float) arg0, (float) arg2) / (float) arg3);
		arg4[2] = (int) local14;
		arg4[0] = (int) ((float) local61 - this.aFloat186);
		arg4[1] = (int) ((float) local80 - this.aFloat187);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!oka;)V")
	public abstract void method9766(@OriginalArg(1) Class277 arg0);

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(ZI)V")
	public abstract void method9767(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(ZB)V")
	public final void method9768(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean961) {
			this.aBoolean961 = arg0;
			this.method9810();
			this.anInt11272 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "()Z")
	@Override
	public final boolean method9715() {
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "()Lclient!gw;")
	@Override
	public final Class86 method9691() {
		return new Class86_Sub2();
	}

	@OriginalMember(owner = "client!lb", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean952 = false;
	}

	@OriginalMember(owner = "client!lb", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method9714(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "(II)V")
	public final void method9769(@OriginalArg(1) int arg0) {
		if (this.anInt11249 != arg0) {
			this.anInt11249 = arg0;
			this.method9850();
		}
	}

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "(I)V")
	private void method9770() {
		if (this.aClass26_3 != null) {
			this.aClass26_3.method8000();
		}
		this.method9845();
	}

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "(B)V")
	protected void method9771(@OriginalArg(0) byte arg0) {
		this.anInt11278 = this.anInt11264;
		this.anInt11264 = 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILclient!ra;)V")
	public abstract void method9772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class317 arg2);

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(B)V")
	private void method9773() {
		if (this.aClass291_9 == Static389.aClass291_6) {
			return;
		}
		@Pc(18) Class291 local18 = this.aClass291_9;
		this.aClass291_9 = Static389.aClass291_6;
		if (local18.method7016()) {
			this.method9751();
		}
		this.method9817();
		this.aFloatArray73 = this.aFloatArray70;
		this.method9819();
		this.anInt11272 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!lb", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[BIIZLclient!pm;I)Lclient!de;")
	protected abstract Interface4 method9775(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) Class295 arg4);

	@OriginalMember(owner = "client!lb", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass86_Sub2_16.aFloat38 + this.aClass86_Sub2_16.aFloat37 * (float) arg2 + (float) arg0 * this.aClass86_Sub2_16.aFloat30 + (float) arg1 * this.aClass86_Sub2_16.aFloat39;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass86_Sub2_16.aFloat37 * (float) arg5 + this.aClass86_Sub2_16.aFloat30 * (float) arg3 + this.aClass86_Sub2_16.aFloat39 * (float) arg4 + this.aClass86_Sub2_16.aFloat38;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt11250 && (float) this.anInt11250 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt11258 < local32 && local63 > (float) this.anInt11258) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) (((float) arg2 * this.aClass86_Sub2_16.aFloat32 + (float) arg1 * this.aClass86_Sub2_16.aFloat36 + this.aClass86_Sub2_16.aFloat33 * (float) arg0 + this.aClass86_Sub2_16.aFloat31) * (float) this.anInt11241 / local32);
		@Pc(173) int local173 = (int) ((float) this.anInt11241 * (this.aClass86_Sub2_16.aFloat31 + (float) arg5 * this.aClass86_Sub2_16.aFloat32 + this.aClass86_Sub2_16.aFloat33 * (float) arg3 + (float) arg4 * this.aClass86_Sub2_16.aFloat36) / local63);
		if ((float) local141 < this.aFloat186 && (float) local173 < this.aFloat186) {
			local7 |= 0x1;
		} else if ((float) local141 > this.aFloat193 && (float) local173 > this.aFloat193) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) ((float) this.anInt11245 * (this.aClass86_Sub2_16.aFloat34 * (float) arg1 + this.aClass86_Sub2_16.aFloat40 * (float) arg0 + this.aClass86_Sub2_16.aFloat35 * (float) arg2 + this.aClass86_Sub2_16.aFloat41) / local32);
		@Pc(277) int local277 = (int) ((this.aClass86_Sub2_16.aFloat40 * (float) arg3 + this.aClass86_Sub2_16.aFloat34 * (float) arg4 + this.aClass86_Sub2_16.aFloat35 * (float) arg5 + this.aClass86_Sub2_16.aFloat41) * (float) this.anInt11245 / local63);
		if (this.aFloat187 > (float) local245 && this.aFloat187 > (float) local277) {
			local7 |= 0x4;
		} else if (this.aFloat182 < (float) local245 && this.aFloat182 < (float) local277) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!lb", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt11157 - 1 && arg1 <= 0 && this.anInt11144 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt11242 = this.anInt11157 < arg3 ? 0 : arg3;
		this.anInt11243 = arg0 < 0 ? 0 : arg0;
		this.anInt11253 = arg1 >= 0 ? arg1 : 0;
		this.anInt11279 = this.anInt11157 < arg2 ? 0 : arg2;
		if (!this.aBoolean963) {
			this.aBoolean963 = true;
			this.method9789();
		}
		this.method9826();
		this.method9818();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)Lclient!lg;")
	public abstract Interface15 method9776(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(FI)V")
	public final void method9777(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat190) {
			this.aFloat190 = arg0;
			this.method9761();
		}
	}

	@OriginalMember(owner = "client!lb", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt11246, this.anInt11273, this.anInt11241, this.anInt11245 };
	}

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "()Z")
	@Override
	public final boolean method9710() {
		return this.aClass26Array3[3].method8001();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!ra;IIIILclient!lg;)V")
	public abstract void method9778(@OriginalArg(0) int arg0, @OriginalArg(1) Class317 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface15 arg5);

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "(B)V")
	protected abstract void method9779();

	@OriginalMember(owner = "client!lb", name = "ab", descriptor = "(I)V")
	protected abstract void method9780();

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "(I)V")
	protected abstract void method9781();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!pm;ILclient!hk;II)Lclient!de;")
	public abstract Interface4 method9782(@OriginalArg(0) Class295 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "(I)V")
	protected abstract void method9783();

	@OriginalMember(owner = "client!lb", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(16) boolean local16 = arg0 != this.anInt11256;
		if (local16 || this.aFloat191 != arg1 || arg2 != this.aFloat195) {
			this.aFloat195 = arg2;
			this.anInt11256 = arg0;
			this.aFloat191 = arg1;
			if (local16) {
				this.aFloat181 = (float) (this.anInt11256 & 0xFF0000) / 1.671168E7F;
				this.aFloat184 = (float) (this.anInt11256 & 0xFF) / 255.0F;
				this.aFloat188 = (float) (this.anInt11256 & 0xFF00) / 65280.0F;
				this.method9780();
			}
			this.aNativeInterface3.setSunColour(this.aFloat181, this.aFloat188, this.aFloat184, arg1, arg2);
			this.method9739();
		}
		if (this.aFloatArray75[0] != arg3 || this.aFloatArray75[1] != arg4 || this.aFloatArray75[2] != arg5) {
			this.aFloatArray75[0] = arg3;
			this.aFloatArray75[1] = arg4;
			this.aFloatArray75[2] = arg5;
			this.aFloatArray76[0] = -arg3;
			this.aFloatArray76[1] = -arg4;
			this.aFloatArray76[2] = -arg5;
			@Pc(166) float local166 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray74[1] = arg4 * local166;
			this.aFloatArray74[0] = local166 * arg3;
			this.aFloatArray74[2] = arg5 * local166;
			this.aFloatArray68[2] = -this.aFloatArray74[2];
			this.aFloatArray68[0] = -this.aFloatArray74[0];
			this.aFloatArray68[1] = -this.aFloatArray74[1];
			this.aNativeInterface3.setSunDirection(this.aFloatArray74[0], this.aFloatArray74[1], this.aFloatArray74[2]);
			this.method9854(true);
			this.anInt11251 = (int) (arg3 * 256.0F / arg4);
			this.anInt11275 = (int) (arg5 * 256.0F / arg4);
		}
		this.method9849();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!ra;)V")
	private void method9784(@OriginalArg(1) int arg0, @OriginalArg(2) Class317 arg1) {
		this.method9800(0, this.anInterface24_16);
		this.method9766(this.aClass277_18);
		this.method9772(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "(I)Lclient!on;")
	public final Interface18 method9785() {
		return this.aClass74_Sub1_3 == null ? null : this.aClass74_Sub1_3.method9373();
	}

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "(B)V")
	public final void method9786() {
		this.aBoolean942 = false;
		this.method9757();
	}

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "(B)V")
	protected abstract void method9787();

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "(I)V")
	protected abstract void method9788();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method9677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static13.method210(this, arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)V")
	protected abstract void method9789();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(FFFFFFB)Z")
	private boolean method9790(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface24_17.method9228();
		if (local9 == null) {
			return false;
		}
		@Pc(21) Stream local21 = this.method9844(local9);
		if (Stream.b()) {
			local21.b(arg2);
			local21.b(arg3);
			local21.b(arg0);
			local21.b(arg4);
			local21.b(arg1);
			local21.b(arg5);
		} else {
			local21.a(arg2);
			local21.a(arg3);
			local21.a(arg0);
			local21.a(arg4);
			local21.a(arg1);
			local21.a(arg5);
		}
		local21.a();
		return this.anInterface24_17.method9230();
	}

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "(I)I")
	public final int method9791() {
		return this.anInt11255;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIIIIZ)Lclient!ug;")
	@Override
	public final Class43 method9638(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class43_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "(Z)V")
	public final void method9792() {
		if (this.anInt11272 == 16) {
			return;
		}
		this.method9722();
		this.method9768(true);
		this.method9839(true);
		this.method9822(true);
		this.method9832(1);
		this.anInt11272 = 16;
	}

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "(I)V")
	private void method9793() {
		this.method9846();
		if (this.aClass26_3 != null) {
			this.aClass26_3.method8008();
		}
	}

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "(Z)V")
	protected abstract void method9794();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!tfa;I)V")
	public final void method9795(@OriginalArg(0) int arg0, @OriginalArg(1) Class352 arg1) {
		this.method9842(arg0, arg1);
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(ZI)V")
	public final void method9796(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean954) {
			this.aBoolean954 = arg0;
			this.method9760();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!db;)V")
	@Override
	public final void method9701(@OriginalArg(0) Class74 arg0) {
		this.aClass74_Sub1_3 = (Class74_Sub1) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method9682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)V")
	public final void method9797(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method9725(Static162.aClass293_4, Static162.aClass293_4);
		} else if (arg0 == 0) {
			this.method9725(Static105.aClass293_3, Static105.aClass293_3);
			return;
		} else if (arg0 == 2) {
			this.method9725(Static62.aClass293_1, Static162.aClass293_4);
			return;
		} else if (arg0 == 3) {
			this.method9725(Static679.aClass293_5, Static105.aClass293_3);
			return;
		} else if (arg0 == 4) {
			this.method9725(Static64.aClass293_2, Static64.aClass293_2);
			return;
		}
	}

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "(I)V")
	public final void method9798() {
		this.method9763();
		this.method9819();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lclient!za;")
	@Override
	public final Class2_Sub28 method9649(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub28_Sub2 local8 = new Class2_Sub28_Sub2(arg0);
		this.aClass60_234.method1233(local8);
		return local8;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BILclient!uh;)V")
	public abstract void method9800(@OriginalArg(1) int arg0, @OriginalArg(2) Interface24 arg1);

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()Lclient!gw;")
	@Override
	public final Class86 method9716() {
		return this.aClass86_Sub2_16;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V")
	public final void method9801(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean955 != arg0) {
			this.aBoolean955 = arg0;
			this.method9760();
			this.anInt11272 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII[IIZ)Lclient!de;")
	public abstract Interface4 method9802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(Z)V")
	private void method9803() {
		this.method9800(0, this.anInterface24_17);
		this.method9766(this.aClass277_21);
		this.method9772(0, 1, Static708.aClass317_9);
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()Z")
	@Override
	public final boolean method9646() {
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(IIIIII)Lclient!db;")
	@Override
	public final Class74 method9692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class74_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "(II)V")
	public abstract void method9804(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Interface4 local9 = local6.anInterface4_4;
		this.method9816();
		this.method9754(local9);
		this.method9832(1);
		this.method9725(Static162.aClass293_4, Static162.aClass293_4);
		this.method9813(Static45.aClass352_1, 0);
		this.method9769(arg0);
		this.aClass86_Sub2_15.method2718((float) this.anInt11144, (float) this.anInt11157, 0.0F);
		this.method9786();
		this.aClass86_Sub2Array3[0].method2718(local9.method6857((float) this.anInt11144), local9.method6856((float) this.anInt11157), 1.0F);
		this.aClass86_Sub2Array3[0].method2720(0.0F, local9.method6857((float) -arg3), local9.method6856((float) -arg2));
		this.aClass146Array3[0] = Static145.aClass146_2;
		this.method9793();
		this.method9738();
		this.method9837();
		this.method9813(Static231.aClass352_5, 0);
	}

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "()I")
	@Override
	public final int method9694() {
		return this.anInt11252 - 2;
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "(I)V")
	@Override
	public final void method9718() {
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()Lclient!gw;")
	@Override
	public final Class86 method9699() {
		return this.aClass86_Sub2_21;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[FILclient!pm;IZ)Lclient!de;")
	protected abstract Interface4 method9805(@OriginalArg(2) int arg0, @OriginalArg(3) float[] arg1, @OriginalArg(5) Class295 arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean arg4);

	@OriginalMember(owner = "client!lb", name = "R", descriptor = "(I)V")
	protected abstract void method9806();

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "()Z")
	@Override
	public final boolean method9674() {
		return false;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([FB)[F")
	public final float[] method9807(@OriginalArg(0) float[] arg0) {
		arg0[8] = this.aFloatArray73[2];
		arg0[0] = this.aFloatArray73[0];
		arg0[4] = this.aFloatArray73[1];
		arg0[12] = this.aFloatArray73[3];
		arg0[1] = this.aFloatArray73[4];
		arg0[2] = this.aFloatArray73[8];
		arg0[13] = this.aFloatArray73[7];
		arg0[9] = this.aFloatArray73[6];
		arg0[5] = this.aFloatArray73[5];
		arg0[6] = this.aFloatArray73[9];
		arg0[7] = this.aFloatArray73[13];
		arg0[3] = this.aFloatArray73[12];
		arg0[14] = this.aFloatArray73[11];
		arg0[10] = this.aFloatArray73[10];
		arg0[15] = this.aFloatArray73[15];
		arg0[11] = this.aFloatArray73[14];
		return arg0;
	}

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "(B)V")
	private void method9808() {
		this.anInterface24_17 = this.method9825(true);
		this.anInterface24_17.method9227(12, 24);
		this.aClass277_21 = this.method9830(new Class243[] { new Class243(Static169.aClass115_1) });
	}

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "(I)V")
	protected abstract void method9809();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method9662(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas13 == arg0) {
			local5 = this.anObject20;
		} else if (this.aHashtable7.containsKey(arg0)) {
			local5 = this.aHashtable7.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method9847(arg0, local5);
		if (arg0 == this.aCanvas12) {
			this.method9853();
		}
	}

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt11240 + this.anInt11239 + this.anInt11238;
	}

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "(I)V")
	protected abstract void method9810();

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "(I)V")
	private void method9811() {
		if (this.anInt11272 == 1) {
			return;
		}
		this.method9773();
		this.method9768(false);
		this.method9801(false);
		this.method9839(false);
		this.method9822(false);
		this.method9724(-2, false, false);
		this.method9797(1);
		this.method9754(this.anInterface9_3);
		this.anInt11272 = 1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method9670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		@Pc(17) float local17 = 0.0F;
		@Pc(19) float local19 = 1.0F;
		if (local9 != 0.0F || local15 != 0.0F) {
			local19 = (float) Math.sqrt((double) (local15 * local15 + local9 * local9));
			local17 = (float) Math.atan2((double) local15, (double) local9);
		}
		this.method9811();
		this.method9769(arg4);
		this.method9813(Static45.aClass352_1, 0);
		this.method9795(0, Static45.aClass352_1);
		this.method9832(0);
		this.aClass86_Sub2_15.method2718((float) arg5, local19, 1.0F);
		this.aClass86_Sub2_15.method7020(0, -arg5 / 2, 0);
		this.aClass86_Sub2_15.method7022((int) ((double) local17 * 2607.5945876176133D) & 0x3FFF);
		this.aClass86_Sub2_15.method7020(arg0, arg1, 0);
		this.method9786();
		this.method9767(false);
		this.method9738();
		this.method9767(true);
		this.method9795(0, Static231.aClass352_5);
		this.method9813(Static231.aClass352_5, 0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!tia;Z)Lclient!ug;")
	@Override
	public final Class43 method9683(@OriginalArg(0) Class355 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(26) Class43 local26;
		if (arg0.anInt9469 == 0 || arg0.anInt9470 == 0) {
			local26 = this.method9711(1, 1, 1, new int[1]);
		} else {
			@Pc(35) int[] local35 = new int[arg0.anInt9469 * arg0.anInt9470];
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			@Pc(44) int local44;
			@Pc(48) int local48;
			if (arg0.aByteArray106 == null) {
				for (local44 = 0; local44 < arg0.anInt9470; local44++) {
					for (local48 = 0; local48 < arg0.anInt9469; local48++) {
						@Pc(61) int local61 = arg0.anIntArray689[arg0.aByteArray107[local37++] & 0xFF];
						local35[local39++] = local61 == 0 ? 0 : local61 | 0xFF000000;
					}
				}
			} else {
				for (local44 = 0; local44 < arg0.anInt9470; local44++) {
					for (local48 = 0; local48 < arg0.anInt9469; local48++) {
						local35[local39++] = arg0.anIntArray689[arg0.aByteArray107[local37] & 0xFF] | arg0.aByteArray106[local37] << 24;
						local37++;
					}
				}
			}
			local26 = this.method9711(arg0.anInt9469, arg0.anInt9469, arg0.anInt9470, local35);
		}
		local26.method9586(arg0.anInt9468, arg0.anInt9472, arg0.anInt9471, arg0.anInt9473);
		return local26;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method9708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) float local12 = (float) -arg0 + (float) arg2;
		@Pc(18) float local18 = (float) arg3 - (float) arg1;
		@Pc(45) float local45;
		if (local12 == 0.0F && local18 == 0.0F) {
			local12 = 1.0F;
		} else {
			local45 = (float) (1.0D / Math.sqrt((double) (local12 * local12 + local18 * local18)));
			local18 *= local45;
			local12 *= local45;
		}
		this.method9811();
		this.method9769(arg4);
		this.method9813(Static45.aClass352_1, 0);
		this.method9795(0, Static45.aClass352_1);
		this.method9832(1);
		this.method9730();
		@Pc(84) int local84 = arg7 % (arg6 + arg5);
		this.method9767(false);
		local45 = local12 * (float) arg5;
		@Pc(98) float local98 = local18 * (float) arg5;
		@Pc(100) float local100 = 0.0F;
		@Pc(102) float local102 = 0.0F;
		@Pc(104) float local104 = local45;
		@Pc(106) float local106 = local98;
		if (local84 <= arg5) {
			local106 = local18 * (float) (arg5 - local84);
			local104 = local12 * (float) (arg5 - local84);
		} else {
			local102 = local18 * (float) (arg5 + arg6 - local84);
			local100 = local12 * (float) (arg5 + arg6 - local84);
		}
		@Pc(153) float local153 = (float) arg0 + local100;
		@Pc(158) float local158 = (float) arg1 + local102;
		@Pc(163) float local163 = local12 * (float) arg6;
		@Pc(168) float local168 = local18 * (float) arg6;
		while (true) {
			if (arg2 > arg0) {
				if ((float) arg2 < local153) {
					break;
				}
				if (local104 + local153 > (float) arg2) {
					local104 = (float) arg2 - local153;
				}
			} else {
				if ((float) arg2 > local153) {
					break;
				}
				if (local104 + local153 < (float) arg2) {
					local104 = (float) arg2 - local153;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 > local158) {
					break;
				}
				if ((float) arg3 > local158 + local106) {
					local106 = (float) arg3 - local158;
				}
			} else {
				if ((float) arg3 < local158) {
					break;
				}
				if (local158 + local106 > (float) arg3) {
					local106 = (float) arg3 - local158;
				}
			}
			if (!this.method9790(0.0F, local158 + local106, local153, local158, local104 + local153, 0.0F)) {
				return;
			}
			local158 += local168 + local106;
			this.method9803();
			local153 += local163 + local104;
			local104 = local45;
			local106 = local98;
		}
		this.method9767(true);
		this.method9795(0, Static231.aClass352_5);
		this.method9813(Static231.aClass352_5, 0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ln;IIII)Lclient!ka;")
	@Override
	public final Class45 method9700(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class45_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	@Override
	public final void method9705(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "(B)I")
	public final int method9812() {
		return this.anInt11277;
	}

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "()V")
	@Override
	public final void method9712() {
		if (this.aClass166_3 != null) {
			this.aClass166_3.method3568();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!tfa;II)V")
	public final void method9813(@OriginalArg(0) Class352 arg0, @OriginalArg(2) int arg1) {
		this.method9829(arg1, false, arg0, false);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IB)Lclient!au;")
	protected Class26 method9814(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class26_Sub4(this);
		} else if (arg0 == 1) {
			return new Class26_Sub10(this);
		} else if (arg0 == 2) {
			return new Class26_Sub8(this, this.aClass270_8);
		} else if (arg0 == 7) {
			return new Class26_Sub7(this);
		} else {
			return new Class26_Sub11(this);
		}
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(Z)V")
	private void method9815() {
		this.anInterface24_18 = this.method9825(false);
		this.anInterface24_18.method9227(12, 3096);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(38) Buffer local38 = this.anInterface24_18.method9228();
			if (local38 != null) {
				@Pc(45) Stream local45 = this.method9844(local38);
				local45.b(0.0F);
				local45.b(0.0F);
				local45.b(0.0F);
				for (@Pc(56) int local56 = 0; local56 <= 256; local56++) {
					@Pc(67) double local67 = (double) (local56 * 2) * 3.141592653589793D / 256.0D;
					@Pc(71) float local71 = (float) Math.cos(local67);
					@Pc(75) float local75 = (float) Math.sin(local67);
					if (Stream.b()) {
						local45.b(local75);
						local45.b(local71);
						local45.b(0.0F);
					} else {
						local45.a(local75);
						local45.a(local71);
						local45.a(0.0F);
					}
				}
				local45.a();
				if (this.anInterface24_18.method9230()) {
					break;
				}
			}
		}
		this.aClass277_17 = this.method9830(new Class243[] { new Class243(Static169.aClass115_1) });
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method9714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(39) float local39 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local16 * local16)));
			local16 *= local39;
			local10 *= local39;
		}
		if (!this.method9790(0.0F, (float) arg3 + local16, (float) arg0, (float) arg1, local10 + (float) arg2, 0.0F)) {
			return;
		}
		this.method9811();
		this.method9769(arg4);
		this.method9813(Static45.aClass352_1, 0);
		this.method9795(0, Static45.aClass352_1);
		this.method9832(arg5);
		this.method9730();
		this.method9767(false);
		this.method9803();
		this.method9767(true);
		this.method9795(0, Static231.aClass352_5);
		this.method9813(Static231.aClass352_5, 0);
	}

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt11279;
		arg0[0] = this.anInt11243;
		arg0[3] = this.anInt11242;
		arg0[1] = this.anInt11253;
	}

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "()Z")
	@Override
	public final boolean method9665() {
		return false;
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "(B)V")
	public final void method9816() {
		if (this.anInt11272 == 2) {
			return;
		}
		this.method9773();
		this.method9768(false);
		this.method9801(false);
		this.method9839(false);
		this.method9822(false);
		this.method9724(-2, false, false);
		this.anInt11272 = 2;
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "(I)V")
	@Override
	public final void method9709(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "(I)V")
	private void method9817() {
		if (this.aBoolean948) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray70;
		this.aBoolean948 = true;
		if (this.anInt11157 != 0 && this.anInt11144 != 0) {
			local5[6] = 0.0F;
			local5[1] = 0.0F;
			local5[4] = 0.0F;
			local5[11] = 0.0F;
			local5[13] = 1.0F;
			local5[15] = 1.0F;
			local5[14] = 0.5F;
			local5[0] = 2.0F / (float) this.anInt11157;
			local5[12] = -1.0F;
			local5[10] = 0.5F;
			local5[7] = 0.0F;
			local5[2] = 0.0F;
			local5[3] = 0.0F;
			local5[8] = 0.0F;
			local5[9] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt11144;
			return;
		}
		local5[2] = 0.0F;
		local5[10] = 1.0F;
		local5[6] = 0.0F;
		local5[8] = 0.0F;
		local5[14] = 0.0F;
		local5[5] = 1.0F;
		local5[9] = 0.0F;
		local5[0] = 1.0F;
		local5[13] = 0.0F;
		local5[4] = 0.0F;
		local5[11] = 0.0F;
		local5[1] = 0.0F;
		local5[12] = 0.0F;
		local5[7] = 0.0F;
		local5[15] = 1.0F;
		local5[3] = 0.0F;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(Z)V")
	private void method9818() {
		this.aFloat182 = (float) (this.anInt11242 - this.anInt11273);
		this.aFloat186 = (float) (this.anInt11243 - this.anInt11246);
		this.aFloat193 = (float) (this.anInt11279 - this.anInt11246);
		this.aFloat187 = (float) (this.anInt11253 - this.anInt11273);
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "(B)V")
	private void method9819() {
		this.method9729();
		if (this.aClass26_3 != null) {
			this.aClass26_3.method7999();
		}
	}

	@OriginalMember(owner = "client!lb", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method9714(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()Z")
	@Override
	public final boolean method9648() {
		return false;
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "(B)V")
	private void method9820() {
		if (this.aBoolean956) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray69;
		@Pc(25) float local25 = (float) (this.anInt11250 * -this.anInt11246) / (float) this.anInt11241;
		@Pc(39) float local39 = (float) (this.anInt11250 * (this.anInt11157 - this.anInt11246)) / (float) this.anInt11241;
		@Pc(50) float local50 = (float) (this.anInt11273 * this.anInt11250) / (float) this.anInt11245;
		@Pc(65) float local65 = (float) (this.anInt11250 * (this.anInt11273 - this.anInt11144)) / (float) this.anInt11245;
		if (local25 == local39 || local50 == local65) {
			local13[9] = 0.0F;
			local13[14] = 0.0F;
			local13[2] = 0.0F;
			local13[12] = 0.0F;
			local13[10] = 1.0F;
			local13[6] = 0.0F;
			local13[11] = 0.0F;
			local13[13] = 0.0F;
			local13[8] = 0.0F;
			local13[0] = 1.0F;
			local13[15] = 1.0F;
			local13[7] = 0.0F;
			local13[5] = 1.0F;
			local13[1] = 0.0F;
			local13[4] = 0.0F;
			local13[3] = 0.0F;
		} else {
			@Pc(149) float local149 = (float) this.anInt11250 * 2.0F;
			local13[2] = 0.0F;
			local13[15] = 0.0F;
			local13[12] = 0.0F;
			local13[6] = 0.0F;
			local13[13] = 0.0F;
			local13[14] = this.aFloat179 = (float) (this.anInt11258 * this.anInt11250) / (float) (this.anInt11250 - this.anInt11258);
			local13[5] = local149 / (local50 - local65);
			local13[10] = this.aFloat185 = (float) this.anInt11258 / (float) (this.anInt11250 - this.anInt11258);
			local13[4] = 0.0F;
			local13[9] = (local65 + local50) / (local50 - local65);
			local13[7] = 0.0F;
			local13[1] = 0.0F;
			local13[3] = 0.0F;
			local13[8] = (local39 + local25) / (local39 - local25);
			local13[11] = -1.0F;
			local13[0] = local149 / (local39 - local25);
		}
		this.method9852();
		this.aBoolean956 = true;
	}

	@OriginalMember(owner = "client!lb", name = "Y", descriptor = "(I)Lclient!fv;")
	public final Class86_Sub2 method9821() {
		return this.aClass86_Sub2Array3[this.anInt11277];
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(IZ)V")
	public final void method9822(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean959 != arg0) {
			this.aBoolean959 = arg0;
			this.method9787();
			this.anInt11272 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "(B)F")
	protected abstract float method9823();

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(II)Lclient!lg;")
	public final Interface15 method9824(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface15_8.method9217()) {
			this.anInterface15_8.method9224(arg0);
		}
		return this.anInterface15_8;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZ)Lclient!uh;")
	public abstract Interface24 method9825(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "(Z)V")
	protected abstract void method9826();

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)I")
	public final int method9827() {
		return this.anInt11271;
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt11250 == arg0 && this.anInt11258 == arg1) {
			return;
		}
		this.anInt11258 = arg1;
		this.anInt11250 = arg0;
		this.method9755();
		this.method9761();
		this.method9770();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZB)V")
	public final void method9828(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean946) {
			this.aBoolean946 = arg0;
			this.method9749();
		}
	}

	@OriginalMember(owner = "client!lb", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt11255 = arg0;
		this.anInt11271 = arg2;
		this.anInt11274 = arg3;
		this.anInt11247 = arg1;
		this.aBoolean952 = true;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZLclient!tfa;IZ)V")
	public abstract void method9829(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class352 arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([Lclient!mj;I)Lclient!oka;")
	public abstract Class277 method9830(@OriginalArg(0) Class243[] arg0);

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public final void method9831() {
		if (this.anInt11272 == 8) {
			return;
		}
		this.method9742();
		this.method9768(true);
		this.method9839(true);
		this.method9822(true);
		this.method9832(1);
		this.anInt11272 = 8;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V")
	public final void method9832(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt11262) {
			return;
		}
		@Pc(33) Class323 local33;
		@Pc(35) boolean local35;
		@Pc(31) boolean local31;
		if (arg0 == 1) {
			local35 = true;
			local31 = true;
			local33 = Static396.aClass323_3;
		} else if (arg0 == 2) {
			local31 = false;
			local33 = Static589.aClass323_7;
			local35 = true;
		} else if (arg0 == 128) {
			local31 = true;
			local35 = true;
			local33 = Static572.aClass323_5;
		} else {
			local35 = false;
			local33 = Static432.aClass323_4;
			local31 = false;
		}
		if (local31 != this.aBoolean944) {
			this.aBoolean944 = local31;
			this.method9720();
		}
		if (local35 != this.aBoolean960) {
			this.aBoolean960 = local35;
			this.method9833();
		}
		if (this.aClass323_8 != local33) {
			this.aClass323_8 = local33;
			this.method9806();
		}
		this.anInt11272 &= 0xFFFFFFE3;
		this.anInt11262 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
	@Override
	public void method9643(@OriginalArg(0) int arg0) {
		if (this.aClass166_3 != null) {
			this.aClass166_3.method3566();
		}
		this.anInt11263 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!lb", name = "T", descriptor = "(I)V")
	protected abstract void method9833();

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "(I)V")
	private void method9834() {
		this.anInterface24_16 = this.method9825(false);
		this.anInterface24_16.method9227(28, 140);
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			@Pc(35) Buffer local35 = this.anInterface24_16.method9228();
			if (local35 != null) {
				@Pc(42) Stream local42 = this.method9844(local35);
				if (Stream.b()) {
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(1.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(1.0F);
					local42.b(0.0F);
					local42.b(1.0F);
					local42.b(1.0F);
					local42.b(1.0F);
					local42.b(0.0F);
					local42.b(1.0F);
					local42.b(1.0F);
					local42.b(1.0F);
					local42.b(1.0F);
					local42.b(1.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(1.0F);
					local42.b(0.0F);
					local42.b(1.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(0.0F);
					local42.b(0.0F);
				} else {
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(1.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(1.0F);
					local42.a(0.0F);
					local42.a(1.0F);
					local42.a(1.0F);
					local42.a(1.0F);
					local42.a(0.0F);
					local42.a(1.0F);
					local42.a(1.0F);
					local42.a(1.0F);
					local42.a(1.0F);
					local42.a(1.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(1.0F);
					local42.a(0.0F);
					local42.a(1.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(0.0F);
					local42.a(0.0F);
				}
				local42.a();
				if (this.anInterface24_16.method9230()) {
					break;
				}
			}
		}
		this.aClass277_18 = this.method9830(new Class243[] { new Class243(new Class115[] { Static169.aClass115_1, Static169.aClass115_5, Static169.aClass115_5 }) });
	}

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "()V")
	@Override
	protected void method9642() {
		if (this.aBoolean943) {
			return;
		}
		for (@Pc(9) Class2 local9 = this.aClass60_234.method1226(7); local9 != null; local9 = this.aClass60_234.method1228()) {
			((Class2_Sub28_Sub2) local9).method5297();
		}
		@Pc(28) Enumeration local28 = this.aHashtable7.keys();
		while (local28.hasMoreElements()) {
			@Pc(38) Canvas local38 = (Canvas) local28.nextElement();
			this.method9748(local38, this.aHashtable7.get(local38));
		}
		Static503.method2433(false, true);
		this.aNativeInterface3.release();
		this.aBoolean943 = true;
	}

	@OriginalMember(owner = "client!lb", name = "O", descriptor = "(I)Lclient!fv;")
	public final Class86_Sub2 method9835() {
		return this.aClass86_Sub2_15;
	}

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "()Z")
	@Override
	public final boolean method9703() {
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt11243 < arg0) {
			this.anInt11243 = arg0;
			local5 = true;
		}
		if (this.anInt11279 > arg2) {
			this.anInt11279 = arg2;
			local5 = true;
		}
		if (this.anInt11253 < arg1) {
			local5 = true;
			this.anInt11253 = arg1;
		}
		if (arg3 < this.anInt11242) {
			local5 = true;
			this.anInt11242 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean963) {
			this.aBoolean963 = true;
			this.method9789();
		}
		this.method9826();
		this.method9818();
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method9689(@OriginalArg(0) Canvas arg0) {
		this.anObject20 = null;
		this.aCanvas12 = null;
		if (arg0 == null || arg0 == this.aCanvas13) {
			this.anObject20 = this.anObject21;
			this.aCanvas12 = this.aCanvas13;
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.anObject20 = this.aHashtable7.get(arg0);
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.anObject20 == null) {
			throw new RuntimeException();
		}
		this.method9762(this.aCanvas12, this.anObject20);
		this.method9853();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Ljava/lang/Object;")
	protected abstract Object method9836(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "(I)V")
	public final void method9837() {
		if (this.aClass146Array3[this.anInt11277] != Static540.aClass146_8) {
			this.aClass146Array3[this.anInt11277] = Static540.aClass146_8;
			this.aClass86_Sub2Array3[this.anInt11277].method7024();
			this.method9793();
		}
	}

	@OriginalMember(owner = "client!lb", name = "bb", descriptor = "(I)V")
	public final void method9838() {
		if (this.anInt11272 == 4) {
			return;
		}
		this.method9773();
		this.method9768(false);
		this.method9801(false);
		this.method9839(false);
		this.method9822(false);
		this.method9724(-2, false, false);
		this.method9832(1);
		this.method9797(0);
		this.anInt11272 = 4;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(ZI)V")
	public final void method9839(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean947 != arg0) {
			this.aBoolean947 = arg0;
			this.method9783();
			this.anInt11272 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "(B)V")
	protected void method9840(@OriginalArg(0) byte arg0) {
		this.method9851();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BZZIILclient!pm;)Lclient!de;")
	public final Interface4 method9841(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class295 arg4) {
		return this.method9775(arg3, arg0, arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIZLclient!tfa;)V")
	protected abstract void method9842(@OriginalArg(1) int arg0, @OriginalArg(3) Class352 arg1);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!pm;ZLclient!hk;)Z")
	public abstract boolean method9843(@OriginalArg(0) Class295 arg0, @OriginalArg(2) Class158 arg1);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method9844(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!lb", name = "Q", descriptor = "(I)V")
	protected abstract void method9845();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method9696() {
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(B)V")
	protected abstract void method9846();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method9847(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "(I)V")
	protected abstract void method9849();

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "(I)V")
	protected abstract void method9850();

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
	private void method9851() {
		this.method9780();
		this.method9739();
		this.method9760();
		this.method9771((byte) -127);
		this.method9854(true);
		this.method9849();
		this.method9749();
		this.method9783();
		this.method9787();
		this.method9810();
		this.method9845();
		this.method9833();
		this.method9806();
		this.method9720();
		for (@Pc(60) int local60 = this.anInt11280 - 1; local60 >= 0; local60--) {
			this.method9745(local60);
			this.method9788();
			this.method9809();
			this.method9837();
		}
		this.method9850();
		this.method9752();
		this.method9729();
		this.method9737();
		this.method9781();
	}

	@OriginalMember(owner = "client!lb", name = "U", descriptor = "(I)V")
	private void method9852() {
		this.aFloatArray69[10] = this.aFloat185;
		this.aFloatArray69[14] = this.aFloat179;
		this.aFloat180 = (this.aFloatArray69[14] - (float) this.anInt11258) / this.aFloatArray69[10];
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "()Z")
	@Override
	public final boolean method9671() {
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[Lclient!bba;)V")
	@Override
	public final void method9655(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass2_Sub7Array8[local3] = arg1[local3];
		}
		this.anInt11264 = arg0;
		if (this.aClass291_9.method7016()) {
			this.method9771((byte) -127);
		}
	}

	@OriginalMember(owner = "client!lb", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method9811();
		this.method9769(arg4);
		this.method9813(Static45.aClass352_1, 0);
		this.method9795(0, Static45.aClass352_1);
		this.method9832(arg5);
		this.aClass86_Sub2_15.method2718((float) arg3, (float) arg2, 1.0F);
		this.aClass86_Sub2_15.method7020(arg0, arg1, 0);
		this.method9786();
		this.method9767(false);
		this.method9738();
		this.method9767(true);
		this.method9795(0, Static231.aClass352_5);
		this.method9813(Static231.aClass352_5, 0);
	}

	@OriginalMember(owner = "client!lb", name = "V", descriptor = "(I)V")
	private void method9853() {
		if (this.aCanvas12 == null) {
			this.anInt11117 = this.anInt11097 = 1;
		} else {
			@Pc(20) Dimension local20 = this.aCanvas12.getSize();
			this.anInt11097 = local20.height;
			this.anInt11117 = local20.width;
		}
		this.anInt11144 = this.anInt11097;
		this.anInt11157 = this.anInt11117;
		this.method9734();
		this.method9755();
		this.method9761();
		this.method9752();
		this.method9818();
		this.method9763();
		this.la();
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "(Z)V")
	public abstract void method9854(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!lb", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt11245 = arg3;
		this.anInt11241 = arg2;
		this.anInt11246 = arg0;
		this.anInt11273 = arg1;
		this.method9761();
		this.method9755();
		this.method9763();
		this.method9818();
	}
}
