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

@OriginalClass("client!cb")
public abstract class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable10;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!cb", name = "xc", descriptor = "Lclient!jq;")
	protected Class155 aClass155_6;

	@OriginalMember(owner = "client!cb", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!cb", name = "id", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!cb", name = "Cd", descriptor = "I")
	protected int anInt9175;

	@OriginalMember(owner = "client!cb", name = "Hd", descriptor = "I")
	public int anInt9179;

	@OriginalMember(owner = "client!cb", name = "Md", descriptor = "I")
	public int anInt9183;

	@OriginalMember(owner = "client!cb", name = "ae", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!cb", name = "be", descriptor = "[Lclient!pb;")
	private Interface14[] anInterface14Array3;

	@OriginalMember(owner = "client!cb", name = "de", descriptor = "I")
	public int anInt9193;

	@OriginalMember(owner = "client!cb", name = "ge", descriptor = "[Lclient!qn;")
	protected Class22_Sub3[] aClass22_Sub3Array3;

	@OriginalMember(owner = "client!cb", name = "ie", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!cb", name = "me", descriptor = "Lclient!gl;")
	private Class17 aClass17_3;

	@OriginalMember(owner = "client!cb", name = "qe", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!cb", name = "te", descriptor = "Lclient!to;")
	private Class278 aClass278_3;

	@OriginalMember(owner = "client!cb", name = "ue", descriptor = "Z")
	public boolean aBoolean626;

	@OriginalMember(owner = "client!cb", name = "ye", descriptor = "F")
	private float aFloat191;

	@OriginalMember(owner = "client!cb", name = "Be", descriptor = "I")
	public int anInt9200;

	@OriginalMember(owner = "client!cb", name = "Fe", descriptor = "I")
	public int anInt9203;

	@OriginalMember(owner = "client!cb", name = "Ge", descriptor = "I")
	protected int anInt9204;

	@OriginalMember(owner = "client!cb", name = "Oe", descriptor = "[Lclient!kv;")
	protected Class171[] aClass171Array3;

	@OriginalMember(owner = "client!cb", name = "Pe", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!cb", name = "Re", descriptor = "I")
	private int anInt9210;

	@OriginalMember(owner = "client!cb", name = "Se", descriptor = "Z")
	public boolean aBoolean629;

	@OriginalMember(owner = "client!cb", name = "Ue", descriptor = "Z")
	protected boolean aBoolean631;

	@OriginalMember(owner = "client!cb", name = "Ve", descriptor = "Lclient!pda;")
	private Class25_Sub2 aClass25_Sub2_3;

	@OriginalMember(owner = "client!cb", name = "Xe", descriptor = "I")
	public int anInt9211;

	@OriginalMember(owner = "client!cb", name = "af", descriptor = "I")
	protected int anInt9213;

	@OriginalMember(owner = "client!cb", name = "jf", descriptor = "F")
	private float aFloat195;

	@OriginalMember(owner = "client!cb", name = "lf", descriptor = "Z")
	public boolean aBoolean633;

	@OriginalMember(owner = "client!cb", name = "mf", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!cb", name = "qf", descriptor = "F")
	private float aFloat198;

	@OriginalMember(owner = "client!cb", name = "sf", descriptor = "I")
	private int anInt9219;

	@OriginalMember(owner = "client!cb", name = "vf", descriptor = "[Lclient!nm;")
	protected Class1_Sub27[] aClass1_Sub27Array6;

	@OriginalMember(owner = "client!cb", name = "wf", descriptor = "Z")
	protected boolean aBoolean636;

	@OriginalMember(owner = "client!cb", name = "Af", descriptor = "[Lclient!us;")
	protected Class295[] aClass295Array5;

	@OriginalMember(owner = "client!cb", name = "Bf", descriptor = "I")
	protected int anInt9222;

	@OriginalMember(owner = "client!cb", name = "Ff", descriptor = "Lclient!pb;")
	public Interface14 anInterface14_3;

	@OriginalMember(owner = "client!cb", name = "Kf", descriptor = "F")
	public float aFloat201;

	@OriginalMember(owner = "client!cb", name = "Rf", descriptor = "I")
	protected int anInt9228;

	@OriginalMember(owner = "client!cb", name = "Xf", descriptor = "[Lclient!us;")
	protected Class295[] aClass295Array6;

	@OriginalMember(owner = "client!cb", name = "ag", descriptor = "Lclient!sk;")
	private Class265 aClass265_15;

	@OriginalMember(owner = "client!cb", name = "bg", descriptor = "Lclient!ql;")
	private Interface15 anInterface15_13;

	@OriginalMember(owner = "client!cb", name = "cg", descriptor = "Lclient!li;")
	public Class19_Sub2 aClass19_Sub2_21;

	@OriginalMember(owner = "client!cb", name = "dg", descriptor = "Lclient!li;")
	public Class19_Sub2 aClass19_Sub2_22;

	@OriginalMember(owner = "client!cb", name = "eg", descriptor = "Lclient!li;")
	public Class19_Sub2 aClass19_Sub2_23;

	@OriginalMember(owner = "client!cb", name = "fg", descriptor = "Lclient!li;")
	public Class19_Sub2 aClass19_Sub2_24;

	@OriginalMember(owner = "client!cb", name = "gg", descriptor = "Lclient!af;")
	private Interface1 anInterface1_8;

	@OriginalMember(owner = "client!cb", name = "hg", descriptor = "Lclient!sk;")
	public Class265 aClass265_16;

	@OriginalMember(owner = "client!cb", name = "ig", descriptor = "Lclient!ql;")
	private Interface15 anInterface15_14;

	@OriginalMember(owner = "client!cb", name = "jg", descriptor = "Lclient!sk;")
	public Class265 aClass265_17;

	@OriginalMember(owner = "client!cb", name = "kg", descriptor = "Lclient!li;")
	public Class19_Sub2 aClass19_Sub2_25;

	@OriginalMember(owner = "client!cb", name = "lg", descriptor = "Lclient!sk;")
	public Class265 aClass265_18;

	@OriginalMember(owner = "client!cb", name = "mg", descriptor = "Lclient!sk;")
	private Class265 aClass265_19;

	@OriginalMember(owner = "client!cb", name = "ng", descriptor = "Lclient!li;")
	public Class19_Sub2 aClass19_Sub2_26;

	@OriginalMember(owner = "client!cb", name = "og", descriptor = "Lclient!li;")
	public Class19_Sub2 aClass19_Sub2_27;

	@OriginalMember(owner = "client!cb", name = "pg", descriptor = "Lclient!li;")
	public Class19_Sub2 aClass19_Sub2_28;

	@OriginalMember(owner = "client!cb", name = "qg", descriptor = "Lclient!sk;")
	public Class265 aClass265_20;

	@OriginalMember(owner = "client!cb", name = "rg", descriptor = "Lclient!li;")
	public Class19_Sub2 aClass19_Sub2_29;

	@OriginalMember(owner = "client!cb", name = "sg", descriptor = "Lclient!li;")
	public Class19_Sub2 aClass19_Sub2_30;

	@OriginalMember(owner = "client!cb", name = "tg", descriptor = "I")
	private int anInt9231;

	@OriginalMember(owner = "client!cb", name = "ug", descriptor = "Z")
	protected boolean aBoolean643;

	@OriginalMember(owner = "client!cb", name = "sd", descriptor = "Lclient!bu;")
	private final Class38 aClass38_77 = new Class38();

	@OriginalMember(owner = "client!cb", name = "Dd", descriptor = "Z")
	protected boolean aBoolean623 = true;

	@OriginalMember(owner = "client!cb", name = "Ld", descriptor = "Lclient!qn;")
	protected final Class22_Sub3 aClass22_Sub3_15 = new Class22_Sub3();

	@OriginalMember(owner = "client!cb", name = "Vd", descriptor = "Lclient!qn;")
	public Class22_Sub3 aClass22_Sub3_16 = new Class22_Sub3();

	@OriginalMember(owner = "client!cb", name = "Wd", descriptor = "Lclient!qn;")
	public final Class22_Sub3 aClass22_Sub3_17 = new Class22_Sub3();

	@OriginalMember(owner = "client!cb", name = "Xd", descriptor = "Lclient!qn;")
	protected final Class22_Sub3 aClass22_Sub3_18 = new Class22_Sub3();

	@OriginalMember(owner = "client!cb", name = "Yd", descriptor = "Lclient!qn;")
	private final Class22_Sub3 aClass22_Sub3_19 = new Class22_Sub3();

	@OriginalMember(owner = "client!cb", name = "Zd", descriptor = "Lclient!qn;")
	private final Class22_Sub3 aClass22_Sub3_20 = new Class22_Sub3();

	@OriginalMember(owner = "client!cb", name = "ke", descriptor = "F")
	public float aFloat188 = 1.0F;

	@OriginalMember(owner = "client!cb", name = "fe", descriptor = "Z")
	private boolean aBoolean624 = false;

	@OriginalMember(owner = "client!cb", name = "ce", descriptor = "I")
	protected int anInt9192 = 0;

	@OriginalMember(owner = "client!cb", name = "je", descriptor = "F")
	private float aFloat187 = 3000.0F;

	@OriginalMember(owner = "client!cb", name = "le", descriptor = "I")
	private int anInt9195 = 0;

	@OriginalMember(owner = "client!cb", name = "he", descriptor = "I")
	private int anInt9194 = -1;

	@OriginalMember(owner = "client!cb", name = "Ce", descriptor = "I")
	private int anInt9201 = 0;

	@OriginalMember(owner = "client!cb", name = "Me", descriptor = "F")
	private float aFloat193 = 1.0F;

	@OriginalMember(owner = "client!cb", name = "De", descriptor = "F")
	public float aFloat192 = -1.0F;

	@OriginalMember(owner = "client!cb", name = "ze", descriptor = "Z")
	protected boolean aBoolean627 = false;

	@OriginalMember(owner = "client!cb", name = "Ne", descriptor = "I")
	private int anInt9209 = 0;

	@OriginalMember(owner = "client!cb", name = "ve", descriptor = "F")
	public float aFloat190 = 3584.0F;

	@OriginalMember(owner = "client!cb", name = "Je", descriptor = "I")
	protected final int anInt9207 = 0;

	@OriginalMember(owner = "client!cb", name = "we", descriptor = "[Lclient!gl;")
	private final Class17[] aClass17Array3 = new Class17[10];

	@OriginalMember(owner = "client!cb", name = "Qe", descriptor = "Z")
	private boolean aBoolean628 = false;

	@OriginalMember(owner = "client!cb", name = "xe", descriptor = "I")
	private int anInt9199 = 1;

	@OriginalMember(owner = "client!cb", name = "pe", descriptor = "I")
	private int anInt9196 = 0;

	@OriginalMember(owner = "client!cb", name = "Ke", descriptor = "I")
	public int anInt9208 = 0;

	@OriginalMember(owner = "client!cb", name = "Te", descriptor = "Z")
	protected boolean aBoolean630 = true;

	@OriginalMember(owner = "client!cb", name = "kf", descriptor = "[F")
	private final float[] aFloatArray78 = new float[16];

	@OriginalMember(owner = "client!cb", name = "Ae", descriptor = "[F")
	public final float[] aFloatArray74 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!cb", name = "Ze", descriptor = "[F")
	private final float[] aFloatArray76 = new float[16];

	@OriginalMember(owner = "client!cb", name = "hf", descriptor = "I")
	public int anInt9216 = 3;

	@OriginalMember(owner = "client!cb", name = "ef", descriptor = "I")
	public int anInt9215 = -1;

	@OriginalMember(owner = "client!cb", name = "ne", descriptor = "[F")
	private final float[] aFloatArray73 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!cb", name = "Ye", descriptor = "I")
	public int anInt9212 = -1;

	@OriginalMember(owner = "client!cb", name = "pf", descriptor = "F")
	public float aFloat197 = -1.0F;

	@OriginalMember(owner = "client!cb", name = "bf", descriptor = "I")
	protected int bf = 0;

	@OriginalMember(owner = "client!cb", name = "df", descriptor = "I")
	protected int anInt9214 = 0;

	@OriginalMember(owner = "client!cb", name = "of", descriptor = "I")
	protected int anInt9218 = -1;

	@OriginalMember(owner = "client!cb", name = "zf", descriptor = "Z")
	protected boolean aBoolean637 = false;

	@OriginalMember(owner = "client!cb", name = "nf", descriptor = "I")
	public int anInt9217 = 50;

	@OriginalMember(owner = "client!cb", name = "yf", descriptor = "I")
	protected int anInt9221 = 0;

	@OriginalMember(owner = "client!cb", name = "se", descriptor = "I")
	protected int anInt9198 = 3584;

	@OriginalMember(owner = "client!cb", name = "cf", descriptor = "[F")
	private final float[] aFloatArray77 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!cb", name = "ff", descriptor = "Lclient!hn;")
	protected Class123 aClass123_7 = Static62.aClass123_3;

	@OriginalMember(owner = "client!cb", name = "tf", descriptor = "Z")
	protected boolean aBoolean634 = true;

	@OriginalMember(owner = "client!cb", name = "Le", descriptor = "[F")
	public final float[] aFloatArray75 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!cb", name = "gf", descriptor = "Z")
	protected boolean aBoolean632 = true;

	@OriginalMember(owner = "client!cb", name = "uf", descriptor = "Z")
	private boolean aBoolean635 = false;

	@OriginalMember(owner = "client!cb", name = "re", descriptor = "I")
	public int anInt9197 = 0;

	@OriginalMember(owner = "client!cb", name = "xf", descriptor = "I")
	public int anInt9220 = 8;

	@OriginalMember(owner = "client!cb", name = "Of", descriptor = "I")
	public int anInt9226 = 512;

	@OriginalMember(owner = "client!cb", name = "Ee", descriptor = "I")
	private int anInt9202 = -1;

	@OriginalMember(owner = "client!cb", name = "oe", descriptor = "Z")
	protected boolean aBoolean625 = false;

	@OriginalMember(owner = "client!cb", name = "If", descriptor = "Lclient!mo;")
	protected Class196 aClass196_7 = Static166.aClass196_3;

	@OriginalMember(owner = "client!cb", name = "rf", descriptor = "F")
	public float aFloat199 = 1.0F;

	@OriginalMember(owner = "client!cb", name = "Jf", descriptor = "I")
	protected int anInt9225 = 0;

	@OriginalMember(owner = "client!cb", name = "Qf", descriptor = "F")
	public float aFloat202 = 1.0F;

	@OriginalMember(owner = "client!cb", name = "Gf", descriptor = "Z")
	protected boolean aBoolean638 = true;

	@OriginalMember(owner = "client!cb", name = "He", descriptor = "I")
	public int anInt9205 = 0;

	@OriginalMember(owner = "client!cb", name = "Lf", descriptor = "[F")
	private final float[] aFloatArray80 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!cb", name = "ee", descriptor = "F")
	public float aFloat185 = 3584.0F;

	@OriginalMember(owner = "client!cb", name = "Cf", descriptor = "F")
	public float aFloat200 = 1.0F;

	@OriginalMember(owner = "client!cb", name = "Df", descriptor = "[F")
	private final float[] aFloatArray79 = new float[16];

	@OriginalMember(owner = "client!cb", name = "Sf", descriptor = "I")
	protected final int anInt9229 = 0;

	@OriginalMember(owner = "client!cb", name = "Pf", descriptor = "I")
	public int anInt9227 = 128;

	@OriginalMember(owner = "client!cb", name = "Nf", descriptor = "Z")
	protected boolean aBoolean640 = false;

	@OriginalMember(owner = "client!cb", name = "Uf", descriptor = "Z")
	protected boolean aBoolean641 = true;

	@OriginalMember(owner = "client!cb", name = "Mf", descriptor = "Z")
	private boolean aBoolean639 = false;

	@OriginalMember(owner = "client!cb", name = "Tf", descriptor = "I")
	private int anInt9230 = 16777215;

	@OriginalMember(owner = "client!cb", name = "Hf", descriptor = "I")
	public int anInt9224 = 512;

	@OriginalMember(owner = "client!cb", name = "Wf", descriptor = "[F")
	protected float[] aFloatArray81 = this.aFloatArray73;

	@OriginalMember(owner = "client!cb", name = "Yf", descriptor = "Z")
	private boolean aBoolean642 = false;

	@OriginalMember(owner = "client!cb", name = "We", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!cb", name = "Zf", descriptor = "Lclient!qn;")
	private final Class22_Sub3 aClass22_Sub3_21 = new Class22_Sub3();

	@OriginalMember(owner = "client!cb", name = "yb", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas15;

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas14;

	@OriginalMember(owner = "client!cb", name = "vd", descriptor = "Lclient!kda;")
	protected final Class160 aClass160_104;

	@OriginalMember(owner = "client!cb", name = "Ef", descriptor = "I")
	protected final int anInt9223;

	@OriginalMember(owner = "client!cb", name = "Fb", descriptor = "Ljava/lang/Object;")
	protected final Object anObject16;

	@OriginalMember(owner = "client!cb", name = "Mb", descriptor = "Ljava/lang/Object;")
	private Object anObject17;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
	private int anInt9026;

	@OriginalMember(owner = "client!cb", name = "Zc", descriptor = "I")
	public int anInt9150;

	@OriginalMember(owner = "client!cb", name = "Ie", descriptor = "I")
	public final int anInt9206;

	@OriginalMember(owner = "client!cb", name = "Xb", descriptor = "I")
	private int anInt9098;

	@OriginalMember(owner = "client!cb", name = "Ib", descriptor = "I")
	public int anInt9085;

	@OriginalMember(owner = "client!cb", name = "Vf", descriptor = "Lclient!po;")
	private final Class232 aClass232_3;

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!n;Lclient!kda;II)V")
	protected Class9_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) Class160 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.aCanvas14 = this.aCanvas15 = arg0;
		this.aClass160_104 = arg3;
		this.anInt9223 = arg4;
		this.anObject17 = this.anObject16 = arg1;
		@Pc(305) Dimension local305 = arg0.getSize();
		this.anInt9150 = this.anInt9026 = local305.width;
		this.anInt9206 = arg5;
		this.anInt9085 = this.anInt9098 = local305.height;
		Static105.method2288(false, true);
		this.aClass232_3 = new Class232(this, super.anInterface8_13);
		this.aNativeInterface3 = new NativeInterface(super.anInterface8_13.method7087(), this.anInt9206);
		for (@Pc(347) int local347 = 0; local347 < super.anInterface8_13.method7087(); local347++) {
			@Pc(354) Class175 local354 = super.anInterface8_13.method7085(local347);
			if (local354 != null) {
				this.aNativeInterface3.initTextureMetrics(local347, local354.aByte59, local354.aByte58);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZB)V")
	public final void method7646(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean640 != arg0) {
			this.aBoolean640 = arg0;
			this.method7651();
		}
	}

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "()I")
	@Override
	public final int method7582() {
		return this.anInt9204 - 2;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(II)V")
	public abstract void method7647(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method7660();
		this.method7696();
		this.method7768(arg4);
		this.method7678(Static349.aClass122_3, 0);
		this.method7735(0, Static349.aClass122_3);
		this.method7730(arg5);
		this.aClass22_Sub3_15.method5966(1.0F, (float) (arg2 - 1), (float) (arg3 - 1));
		this.aClass22_Sub3_15.method5951((float) arg1 - local7, 0.0F, (float) arg0 - local7);
		this.method7656();
		this.method7653(false);
		this.method7668(Static247.aClass102_2, 4);
		this.method7653(true);
		this.method7735(0, Static197.aClass122_2);
		this.method7678(Static197.aClass122_2, 0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!rd;)V")
	@Override
	public final void method7577(@OriginalArg(0) Class249 arg0) {
		this.aClass278_3.method6824(arg0, this);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!aq;IIII[B)Lclient!vi;")
	public abstract Interface18 method7648(@OriginalArg(0) Class16 arg0, @OriginalArg(5) byte[] arg1);

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "(I)V")
	public final void method7649() {
		if (this.anInt9219 == 8) {
			return;
		}
		this.method7706();
		this.method7747(true);
		this.method7737(true);
		this.method7724(true);
		this.method7730(1);
		this.anInt9219 = 8;
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "()Z")
	@Override
	public final boolean method7575() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(Z)V")
	protected abstract void method7650();

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!fd;IIII)Lclient!r;")
	@Override
	public final Class19 method7635(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class19_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public final Class23 method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static36.method1329(arg0, arg1, arg2, arg3, this);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I")
	@Override
	public final int method7606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "(I)V")
	protected abstract void method7651();

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "(I)V")
	private void method7652() {
		if (this.aClass123_7 == Static389.aClass123_4) {
			return;
		}
		@Pc(16) Class123 local16 = this.aClass123_7;
		this.aClass123_7 = Static389.aClass123_4;
		if (local16.method3505()) {
			this.method7710();
		}
		this.method7670();
		this.aFloatArray81 = this.aFloatArray78;
		this.method7750();
		this.anInt9219 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(ZB)V")
	public abstract void method7653(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BZ)V")
	public final void method7654(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean634 != arg0) {
			this.aBoolean634 = arg0;
			this.method7671();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIB[FIIZLclient!aq;)Lclient!jb;")
	protected abstract Interface5 method7655(@OriginalArg(3) float[] arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) Class16 arg4);

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public final void method7656() {
		this.aBoolean623 = false;
		this.method7719();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	@Override
	public final void method7584(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)I")
	public final int method7657() {
		return this.anInt9201;
	}

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt9175 + this.anInt9183 + this.anInt9179;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!gf;IIIILclient!af;)V")
	public abstract void method7658(@OriginalArg(1) Class102 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface1 arg5);

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "()F")
	@Override
	public final float P() {
		return this.aFloat187;
	}

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "(I)Lclient!qn;")
	public final Class22_Sub3 method7659() {
		if (!this.aBoolean624) {
			this.aClass22_Sub3_20.method5950(this.aClass22_Sub3_18, this.aClass22_Sub3_15);
			this.aBoolean624 = true;
		}
		return this.aClass22_Sub3_20;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)F")
	protected abstract float method7660();

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "()Z")
	@Override
	public final boolean method7579() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZILclient!hm;)V")
	protected abstract void method7661(@OriginalArg(0) int arg0, @OriginalArg(3) Class122 arg1);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!qm;Z)Lclient!ha;")
	@Override
	public final Class12 method7625(@OriginalArg(0) Class242 arg0) {
		@Pc(127) Class12 local127;
		if (arg0.anInt6863 == 0 || arg0.anInt6866 == 0) {
			local127 = this.method7641(new int[1], 1, 1, 1);
		} else {
			@Pc(21) int[] local21 = new int[arg0.anInt6866 * arg0.anInt6863];
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg0.aByteArray82 == null) {
				for (local30 = 0; local30 < arg0.anInt6866; local30++) {
					for (local34 = 0; local34 < arg0.anInt6863; local34++) {
						@Pc(92) int local92 = arg0.anIntArray518[arg0.aByteArray83[local23++] & 0xFF];
						local21[local25++] = local92 == 0 ? 0 : local92 | 0xFF000000;
					}
				}
			} else {
				for (local30 = 0; local30 < arg0.anInt6866; local30++) {
					for (local34 = 0; local34 < arg0.anInt6863; local34++) {
						local21[local25++] = arg0.anIntArray518[arg0.aByteArray83[local23] & 0xFF] | arg0.aByteArray82[local23] << 24;
						local23++;
					}
				}
			}
			local127 = this.method7641(local21, arg0.anInt6863, arg0.anInt6863, arg0.anInt6866);
		}
		local127.KA(arg0.anInt6862, arg0.anInt6865, arg0.anInt6861, arg0.anInt6864);
		return local127;
	}

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7611() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(B)V")
	private void method7662() {
		if (this.aCanvas14 == null) {
			this.anInt9026 = this.anInt9098 = 1;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas14.getSize();
			this.anInt9026 = local10.width;
			this.anInt9098 = local10.height;
		}
		this.anInt9085 = this.anInt9098;
		this.anInt9150 = this.anInt9026;
		this.method7722();
		this.method7740();
		this.method7674();
		this.method7698();
		this.method7694();
		this.method7766();
		this.n();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!aq;Lclient!ui;)Z")
	public abstract boolean method7663(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class289 arg1);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLclient!sk;)V")
	public abstract void method7664(@OriginalArg(1) Class265 arg0);

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "(I)V")
	private void method7665() {
		if (this.aBoolean639) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray79;
		@Pc(17) float local17 = (float) (-this.anInt9208 * this.anInt9217) / (float) this.anInt9226;
		@Pc(32) float local32 = (float) (this.anInt9217 * (this.anInt9150 - this.anInt9208)) / (float) this.anInt9226;
		@Pc(43) float local43 = (float) (this.anInt9205 * this.anInt9217) / (float) this.anInt9224;
		@Pc(58) float local58 = (float) ((this.anInt9205 - this.anInt9085) * this.anInt9217) / (float) this.anInt9224;
		if (local17 == local32 || local43 == local58) {
			local5[12] = 0.0F;
			local5[13] = 0.0F;
			local5[7] = 0.0F;
			local5[14] = 0.0F;
			local5[1] = 0.0F;
			local5[8] = 0.0F;
			local5[6] = 0.0F;
			local5[11] = 0.0F;
			local5[15] = 1.0F;
			local5[4] = 0.0F;
			local5[0] = 1.0F;
			local5[2] = 0.0F;
			local5[9] = 0.0F;
			local5[3] = 0.0F;
			local5[5] = 1.0F;
			local5[10] = 1.0F;
		} else {
			@Pc(138) float local138 = (float) this.anInt9217 * 2.0F;
			local5[10] = this.aFloat198 = (float) this.anInt9198 / (float) (this.anInt9217 - this.anInt9198);
			local5[13] = 0.0F;
			local5[0] = local138 / (local32 - local17);
			local5[11] = -1.0F;
			local5[9] = (local58 + local43) / (local43 - local58);
			local5[5] = local138 / (local43 - local58);
			local5[8] = (local17 + local32) / (-local17 + local32);
			local5[2] = 0.0F;
			local5[1] = 0.0F;
			local5[6] = 0.0F;
			local5[3] = 0.0F;
			local5[12] = 0.0F;
			local5[4] = 0.0F;
			local5[15] = 0.0F;
			local5[7] = 0.0F;
			local5[14] = this.aFloat191 = (float) (this.anInt9198 * this.anInt9217) / (float) (this.anInt9217 - this.anInt9198);
		}
		this.method7774();
		this.aBoolean639 = true;
	}

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "(IIIII)V")
	@Override
	protected final void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZIIZIB)V")
	private void method7666(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(4) boolean local4 = arg3 & this.method7622();
		if (!local4 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			arg4 = 2;
			arg1 = 1;
			arg2 = 0;
		}
		if (arg4 != 0 && arg0) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (arg4 != this.anInt9196) {
			if (this.anInt9196 != 0) {
				this.aClass17Array3[Integer.MAX_VALUE & this.anInt9196].method6800();
			}
			if (arg4 == 0) {
				this.aClass17_3 = null;
			} else {
				this.aClass17_3 = this.aClass17Array3[arg4 & Integer.MAX_VALUE];
				this.aClass17_3.method6802(arg0);
				this.aClass17_3.method6805(arg0);
				this.aClass17_3.method6794(arg2, arg1);
			}
			this.anInt9209 = arg2;
			this.anInt9195 = arg1;
			this.anInt9196 = arg4;
		} else if (this.anInt9196 != 0) {
			this.aClass17Array3[this.anInt9196 & Integer.MAX_VALUE].method6805(arg0);
			if (this.anInt9209 != arg2 || arg1 != this.anInt9195) {
				this.aClass17Array3[this.anInt9196 & Integer.MAX_VALUE].method6794(arg2, arg1);
				this.anInt9209 = arg2;
				this.anInt9195 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "(IIII)V")
	@Override
	public final void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9221 = this.anInt9150 < arg3 ? 0 : arg3;
		this.anInt9214 = arg1 >= 0 ? arg1 : 0;
		this.anInt9225 = this.anInt9150 < arg2 ? 0 : arg2;
		this.bf = arg0 < 0 ? 0 : arg0;
		if (this.bf <= 0 && this.anInt9225 >= this.anInt9150 && this.anInt9214 <= 0 && this.anInt9221 >= this.anInt9085) {
			this.n();
			return;
		}
		if (!this.aBoolean643) {
			this.aBoolean643 = true;
			this.method7742();
		}
		this.method7673();
		this.method7694();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!gf;III)V")
	public abstract void method7667(@OriginalArg(0) Class102 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method7595() {
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V")
	@Override
	public final void method7643(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!gf;II)V")
	private void method7668(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		this.method7664(this.aClass265_19);
		this.method7697(this.anInterface15_13, 0);
		this.method7667(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "(I)V")
	private void method7669() {
		if (this.aClass123_7 == Static504.aClass123_6) {
			return;
		}
		@Pc(16) Class123 local16 = this.aClass123_7;
		this.aClass123_7 = Static504.aClass123_6;
		if (!local16.method3505()) {
			this.method7710();
		}
		this.method7772();
		this.aFloatArray81 = this.aFloatArray76;
		this.method7750();
		this.anInt9219 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(B)V")
	private void method7670() {
		if (this.aBoolean628) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray78;
		if (this.anInt9150 == 0 || this.anInt9085 == 0) {
			local9[10] = 1.0F;
			local9[1] = 0.0F;
			local9[4] = 0.0F;
			local9[13] = 0.0F;
			local9[8] = 0.0F;
			local9[9] = 0.0F;
			local9[14] = 0.0F;
			local9[2] = 0.0F;
			local9[5] = 1.0F;
			local9[6] = 0.0F;
			local9[0] = 1.0F;
			local9[15] = 1.0F;
			local9[11] = 0.0F;
			local9[3] = 0.0F;
			local9[12] = 0.0F;
			local9[7] = 0.0F;
		} else {
			local9[13] = 1.0F;
			local9[5] = -2.0F / (float) this.anInt9085;
			local9[0] = 2.0F / (float) this.anInt9150;
			local9[3] = 0.0F;
			local9[4] = 0.0F;
			local9[2] = 0.0F;
			local9[10] = 0.5F;
			local9[6] = 0.0F;
			local9[11] = 0.0F;
			local9[9] = 0.0F;
			local9[8] = 0.0F;
			local9[7] = 0.0F;
			local9[12] = -1.0F;
			local9[15] = 1.0F;
			local9[1] = 0.0F;
			local9[14] = 0.5F;
		}
		this.aBoolean628 = true;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!qba;)V")
	@Override
	public final void method7580(@OriginalArg(0) Class25 arg0) {
		this.aClass25_Sub2_3 = (Class25_Sub2) arg0;
	}

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "(I)V")
	protected abstract void method7671();

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(B)V")
	protected abstract void method7672();

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(B)V")
	protected abstract void method7673();

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(Z)V")
	private void method7674() {
		this.aBoolean635 = false;
		if (this.aClass123_7 == Static504.aClass123_6) {
			this.method7772();
			this.method7750();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public final void method7594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class23 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(Z)V")
	private void method7675() {
		this.aFloat185 = (float) this.anInt9198 - this.aFloat195;
	}

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "(B)[F")
	public final float[] method7676() {
		return this.aFloatArray73;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;I)Lclient!jaclib/memory/Stream;")
	public final Stream method7677(@OriginalArg(0) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!hm;IB)V")
	public final void method7678(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1) {
		this.method7692(false, arg1, false, arg0);
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
	@Override
	public final void method7596(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIII)V")
	@Override
	public final void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9226 = arg2;
		this.anInt9224 = arg3;
		this.anInt9208 = arg0;
		this.anInt9205 = arg1;
		this.method7674();
		this.method7740();
		this.method7766();
		this.method7694();
	}

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "(I)Lclient!qn;")
	public final Class22_Sub3 method7679() {
		return this.aClass22_Sub3_18;
	}

	@OriginalMember(owner = "client!cb", name = "xa", descriptor = "()V")
	@Override
	public final void xa() {
		this.aBoolean626 = false;
		this.method7666(false, 0, 0, false, 0);
		this.method7704();
		this.method7671();
	}

	@OriginalMember(owner = "client!cb", name = "JA", descriptor = "(IIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean626) {
			throw new RuntimeException("");
		}
		if (arg0 != this.anInt9210) {
			this.anInt9210 = arg0;
			if (this.aClass17_3 != null) {
				this.aClass17_3.method6795();
			}
		}
		this.anInt9202 = arg2;
		this.anInt9218 = arg1;
		this.anInt9201 = arg3;
		this.method7704();
	}

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "(I)Lclient!qn;")
	public final Class22_Sub3 method7680() {
		return this.aClass22_Sub3Array3[this.anInt9192];
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(Z)V")
	public final void method7681() {
		this.method7766();
		this.method7750();
	}

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "(B)V")
	public abstract void method7682();

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "(B)Lclient!wv;")
	public final Interface20 method7683() {
		return this.aClass25_Sub2_3 == null ? null : this.aClass25_Sub2_3.method6076();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIF)Lclient!nm;")
	@Override
	public final Class1_Sub27 method7616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub27_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
	protected abstract void method7684(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "(I)V")
	@Override
	public final void L(@OriginalArg(0) int arg0) {
		this.anInt9216 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt9216++;
		}
		this.anInt9220 = 0x1 << this.anInt9216;
	}

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "(B)V")
	protected abstract void method7685();

	@OriginalMember(owner = "client!cb", name = "UA", descriptor = "(IIIII)V")
	@Override
	public final void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7572(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "(I)V")
	protected abstract void method7687();

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public final void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class23_Sub3 local6 = (Class23_Sub3) arg1;
		@Pc(9) Interface5 local9 = local6.anInterface5_4;
		this.method7762();
		this.method7712(local9);
		this.method7730(1);
		this.method7723(Static453.aClass295_5, Static453.aClass295_5);
		this.method7678(Static349.aClass122_3, 0);
		this.method7768(arg0);
		this.aClass22_Sub3_15.method5966(0.0F, (float) this.anInt9150, (float) this.anInt9085);
		this.method7656();
		this.aClass22_Sub3Array3[0].method5966(1.0F, local9.method7970((float) this.anInt9150), local9.method7972((float) this.anInt9085));
		this.aClass22_Sub3Array3[0].method5951(local9.method7972((float) -arg3), 0.0F, local9.method7970((float) -arg2));
		this.aClass171Array3[0] = Static152.aClass171_3;
		this.method7777();
		this.method7758();
		this.method7744();
		this.method7678(Static197.aClass122_2, 0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IFFFFFF)Z")
	private boolean method7688(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(11) Buffer local11 = this.anInterface15_14.method7519();
		if (local11 == null) {
			return false;
		}
		@Pc(25) Stream local25 = this.method7677(local11);
		if (Stream.c()) {
			local25.a(arg4);
			local25.a(arg3);
			local25.a(arg1);
			local25.a(arg2);
			local25.a(arg5);
			local25.a(arg0);
		} else {
			local25.b(arg4);
			local25.b(arg3);
			local25.b(arg1);
			local25.b(arg2);
			local25.b(arg5);
			local25.b(arg0);
		}
		local25.b();
		return this.anInterface15_14.method7521();
	}

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "(III)V")
	@Override
	public final void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9212 == arg0 && arg1 == this.anInt9215 && arg2 == this.anInt9197) {
			return;
		}
		this.anInt9215 = arg1;
		this.anInt9212 = arg0;
		this.anInt9197 = arg2;
		if (this.aBoolean626) {
			return;
		}
		this.method7704();
		this.method7671();
	}

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "()Lclient!m;")
	@Override
	public final Class22 method7644() {
		return new Class22_Sub3();
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(Z)V")
	protected abstract void method7689();

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(Z)V")
	@Override
	public final void method7615(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "(I)V")
	protected abstract void method7690();

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "(B)I")
	public final int method7691() {
		return this.anInt9192;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZIBZLclient!hm;)V")
	public abstract void method7692(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class122 arg3);

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "(B)V")
	public final void method7693() {
		this.aClass22_Sub3_15.ha();
		this.aBoolean623 = true;
		this.method7719();
	}

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "(I)V")
	private void method7694() {
		this.aFloat186 = this.anInt9214 - this.anInt9205;
		this.aFloat201 = this.anInt9225 - this.anInt9208;
		this.aFloat194 = this.anInt9221 - this.anInt9205;
		this.aFloat196 = this.bf - this.anInt9208;
	}

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "(I)V")
	private void method7695() {
		this.method7727();
		this.method7690();
		this.method7651();
		this.method7741();
		this.method7682();
		this.method7716();
		this.method7699();
		this.method7672();
		this.method7739();
		this.method7671();
		this.method7687();
		this.method7650();
		this.method7767();
		this.method7761();
		for (@Pc(56) int local56 = this.anInt9203 - 1; local56 >= 0; local56--) {
			this.method7726(local56);
			this.method7734();
			this.method7709();
			this.method7744();
		}
		this.method7708();
		this.method7698();
		this.method7701();
		this.method7763();
		this.method7700();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public final Class12 method7641(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class12_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "()Z")
	@Override
	public final boolean method7640() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "(B)V")
	private void method7696() {
		if (this.anInt9219 == 1) {
			return;
		}
		this.method7652();
		this.method7747(false);
		this.method7738(false);
		this.method7737(false);
		this.method7724(false);
		this.method7732(false, -2, false);
		this.method7778(1);
		this.method7712(this.anInterface14_3);
		this.anInt9219 = 1;
	}

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7614() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7592(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas15) {
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
			@Pc(53) Object local53 = this.method7725(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable10.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ql;IB)V")
	public abstract void method7697(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "(I)V")
	protected abstract void method7698();

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "(I)V")
	protected abstract void method7699();

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "(I)V")
	protected abstract void method7700();

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "(I)V")
	protected abstract void method7701();

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZII[BILclient!aq;)Lclient!jb;")
	public final Interface5 method7702(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class16 arg4) {
		return this.method7721(arg2, arg4, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!kv;)V")
	public final void method7703(@OriginalArg(1) Class171 arg0) {
		this.aClass171Array3[this.anInt9192] = arg0;
		this.method7777();
	}

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "(I)V")
	private void method7704() {
		if (this.aClass17_3 != null) {
			this.aClass17_3.method6806();
		}
		this.method7687();
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
	@Override
	public final void method7598(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt9227 = arg0;
		this.aClass232_3.method5722();
	}

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "()Z")
	@Override
	public final boolean method7605() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public final boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass22_Sub3_16.method5959((float) arg0, (float) arg2, (float) arg1);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass22_Sub3_16.method5959((float) arg3, (float) arg5, (float) arg4);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt9217 > local14 && local31 < (float) this.anInt9217 || !(!(local14 > (float) this.anInt9198) || !(local31 > (float) this.anInt9198))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt9226 * this.aClass22_Sub3_16.method5962((float) arg1, (float) arg2, (float) arg0) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt9226 * this.aClass22_Sub3_16.method5962((float) arg4, (float) arg5, (float) arg3) / local31);
		if (this.aFloat196 > (float) local81 && this.aFloat196 > (float) local99 || this.aFloat201 < (float) local81 && (float) local99 > this.aFloat201) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt9224 * this.aClass22_Sub3_16.method5957((float) arg0, (float) arg2, (float) arg1) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt9224 * this.aClass22_Sub3_16.method5957((float) arg3, (float) arg5, (float) arg4) / local31);
			return (!(this.aFloat186 > (float) local143) || !((float) local161 < this.aFloat186)) && (!(this.aFloat194 < (float) local143) || !(this.aFloat194 < (float) local161));
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V")
	public final void method7705(@OriginalArg(0) byte arg0) {
		this.method7768(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "(I)V")
	private void method7706() {
		if (this.aClass123_7 == Static468.aClass123_5) {
			return;
		}
		@Pc(6) Class123 local6 = this.aClass123_7;
		this.aClass123_7 = Static468.aClass123_5;
		if (!local6.method3505()) {
			this.method7710();
		}
		this.method7665();
		this.aFloatArray81 = this.aFloatArray79;
		this.method7750();
		this.anInt9219 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "([I)V")
	@Override
	public final void d(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt9225;
		arg0[1] = this.anInt9214;
		arg0[0] = this.bf;
		arg0[3] = this.anInt9221;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)Lclient!ql;")
	public abstract Interface15 method7707(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "(I)V")
	protected abstract void method7708();

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "(B)V")
	protected abstract void method7709();

	@OriginalMember(owner = "client!cb", name = "la", descriptor = "(FF)V")
	@Override
	public final void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat187 && this.aFloat195 == arg1) {
			return;
		}
		this.aFloat195 = arg1;
		this.aFloat187 = arg0;
		this.method7675();
		this.method7774();
		this.method7674();
		this.method7740();
	}

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "(Z)V")
	private void method7710() {
		this.aBoolean624 = false;
		if (this.aClass17_3 != null) {
			this.aClass17_3.method6801();
		}
		this.method7700();
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "()Z")
	@Override
	public final boolean method7576() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[IZZI)Lclient!jb;")
	public final Interface5 method7711(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		return this.method7771(arg3, 0, arg0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!pb;I)V")
	public final void method7712(@OriginalArg(0) Interface14 arg0) {
		if (arg0 == this.anInterface14Array3[this.anInt9192]) {
			return;
		}
		this.anInterface14Array3[this.anInt9192] = arg0;
		if (arg0 == null) {
			this.method7753();
		} else {
			arg0.method7954();
		}
		this.anInt9219 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "()Z")
	@Override
	public final boolean method7601() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "F", descriptor = "(IIII)V")
	@Override
	public final void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt9221 > arg3) {
			this.anInt9221 = arg3;
		}
		if (this.anInt9214 < arg1) {
			this.anInt9214 = arg1;
		}
		if (this.anInt9225 > arg2) {
			this.anInt9225 = arg2;
		}
		if (this.bf < arg0) {
			this.bf = arg0;
		}
		if (this.bf <= 0 && this.anInt9150 <= this.anInt9225 && this.anInt9214 <= 0 && this.anInt9085 <= this.anInt9221) {
			this.n();
			return;
		}
		if (!this.aBoolean643) {
			this.aBoolean643 = true;
			this.method7742();
		}
		this.method7673();
		this.method7694();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!ui;Lclient!aq;)Z")
	public abstract boolean method7713(@OriginalArg(1) Class289 arg0, @OriginalArg(2) Class16 arg1);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method7714(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap6.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "(I)V")
	public final void method7715() {
		if (this.anInt9219 == 4) {
			return;
		}
		this.method7652();
		this.method7747(false);
		this.method7738(false);
		this.method7737(false);
		this.method7724(false);
		this.method7732(false, -2, false);
		this.method7730(1);
		this.method7778(0);
		this.anInt9219 = 4;
	}

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "(I)V")
	protected abstract void method7716();

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "(Z)V")
	private void method7717() {
		this.anInterface15_13 = this.method7707(false);
		this.anInterface15_13.method6277(140, 28);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(35) Buffer local35 = this.anInterface15_13.method7519();
			if (local35 != null) {
				@Pc(42) Stream local42 = this.method7677(local35);
				if (Stream.c()) {
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
				} else {
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
				}
				local42.b();
				if (this.anInterface15_13.method7521()) {
					break;
				}
			}
		}
		this.aClass265_19 = this.method7729(new Class317[] { new Class317(new Class245[] { Static397.aClass245_1, Static397.aClass245_5, Static397.aClass245_5 }) });
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZZ)Lclient!af;")
	public abstract Interface1 method7718(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!cb", name = "F", descriptor = "(I)V")
	private void method7719() {
		if (this.aClass123_7 == Static389.aClass123_4) {
			@Pc(11) float local11 = this.method7660();
			this.aClass22_Sub3_15.method5951(local11, 0.0F, local11);
		}
		this.aBoolean624 = false;
		this.method7763();
		if (this.aClass17_3 != null) {
			this.aClass17_3.method6798();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!qn;I)V")
	public final void method7720(@OriginalArg(0) Class22_Sub3 arg0) {
		this.aClass22_Sub3_15.EA(arg0);
		this.aBoolean623 = false;
		this.method7719();
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7634(@OriginalArg(0) Canvas arg0) {
		this.anObject17 = null;
		this.aCanvas14 = null;
		if (arg0 == null || this.aCanvas15 == arg0) {
			this.aCanvas14 = this.aCanvas15;
			this.anObject17 = this.anObject16;
		} else if (this.aHashtable10.containsKey(arg0)) {
			this.anObject17 = this.aHashtable10.get(arg0);
			this.aCanvas14 = arg0;
		}
		if (this.aCanvas14 == null || this.anObject17 == null) {
			throw new RuntimeException();
		}
		this.method7748(this.anObject17, this.aCanvas14);
		this.method7662();
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(IIIIII)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7696();
		this.method7768(arg4);
		this.method7678(Static349.aClass122_3, 0);
		this.method7735(0, Static349.aClass122_3);
		this.method7730(arg5);
		this.aClass22_Sub3_15.method5966(1.0F, (float) arg2, (float) arg3);
		this.aClass22_Sub3_15.TA(arg0, arg1, 0);
		this.method7656();
		this.method7653(false);
		this.method7758();
		this.method7653(true);
		this.method7735(0, Static197.aClass122_2);
		this.method7678(Static197.aClass122_2, 0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([BLclient!aq;ZIIIIZ)Lclient!jb;")
	protected abstract Interface5 method7721(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "(I)V")
	private void method7722() {
		this.aBoolean628 = false;
		if (this.aClass123_7 == Static389.aClass123_4) {
			this.method7670();
			this.method7750();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!us;ILclient!us;)V")
	public final void method7723(@OriginalArg(0) Class295 arg0, @OriginalArg(2) Class295 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg1 != this.aClass295Array5[this.anInt9192]) {
			this.aClass295Array5[this.anInt9192] = arg1;
			local5 = true;
			this.method7734();
		}
		if (this.aClass295Array6[this.anInt9192] != arg0) {
			this.aClass295Array6[this.anInt9192] = arg0;
			this.method7709();
			local5 = true;
		}
		if (local5) {
			this.anInt9219 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([Lclient!r;Lclient!rd;Lclient!m;[Lclient!pr;I)V")
	@Override
	public final void method7593(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class2_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method7578(arg0, arg2, arg3, arg4);
		this.method7577(arg1);
	}

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "()Z")
	@Override
	public final boolean method7620() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)V")
	public final void method7724(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean637) {
			this.aBoolean637 = arg0;
			this.method7739();
			this.anInt9219 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method7725(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(II)V")
	public final void method7726(@OriginalArg(0) int arg0) {
		if (this.anInt9192 != arg0) {
			this.anInt9192 = arg0;
			this.method7685();
		}
	}

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "(Z)V")
	protected abstract void method7727();

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(II)Lclient!gl;")
	protected Class17 method7728(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class17_Sub3(this);
		} else if (arg0 == 1) {
			return new Class17_Sub4(this);
		} else if (arg0 == 2) {
			return new Class17_Sub1(this, this.aClass155_6);
		} else if (arg0 == 7) {
			return new Class17_Sub5(this);
		} else {
			return new Class17_Sub7(this);
		}
	}

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "()Lclient!m;")
	@Override
	public final Class22 method7642() {
		return this.aClass22_Sub3_21;
	}

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "()V")
	@Override
	public final void n() {
		if (this.aBoolean643) {
			this.aBoolean643 = false;
			this.method7742();
		}
		this.bf = 0;
		this.anInt9221 = this.anInt9085;
		this.anInt9214 = 0;
		this.anInt9225 = this.anInt9150;
		this.method7694();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[Lclient!wj;)Lclient!sk;")
	public abstract Class265 method7729(@OriginalArg(1) Class317[] arg0);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V")
	public final void method7730(@OriginalArg(0) int arg0) {
		if (this.anInt9199 == arg0) {
			return;
		}
		@Pc(26) Class196 local26;
		@Pc(24) boolean local24;
		@Pc(22) boolean local22;
		if (arg0 == 1) {
			local22 = true;
			local24 = true;
			local26 = Static166.aClass196_3;
		} else if (arg0 == 2) {
			local24 = true;
			local26 = Static224.aClass196_4;
			local22 = false;
		} else if (arg0 == 128) {
			local26 = Static526.aClass196_6;
			local24 = true;
			local22 = true;
		} else {
			local22 = false;
			local24 = false;
			local26 = Static502.aClass196_5;
		}
		if (this.aBoolean630 != local22) {
			this.aBoolean630 = local22;
			this.method7761();
		}
		if (local24 != this.aBoolean632) {
			this.aBoolean632 = local24;
			this.method7650();
		}
		if (local26 != this.aClass196_7) {
			this.aClass196_7 = local26;
			this.method7767();
		}
		this.anInt9199 = arg0;
		this.anInt9219 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!ee;)V")
	public abstract void method7731(@OriginalArg(1) Class74 arg0);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZIIZ)V")
	public final void method7732(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt9194) {
			if (arg1 < 0) {
				this.method7744();
				this.method7712(null);
				this.method7778(0);
				if (!this.aBoolean626) {
					this.method7666(arg2, 0, 0, arg0, 0);
				}
			} else {
				@Pc(39) Interface5 local39 = this.aClass232_3.method5721(arg1);
				@Pc(45) Class175 local45 = super.anInterface8_13.method7085(arg1);
				if (local45.aByte57 == 0 && local45.aByte60 == 0) {
					this.method7744();
				} else {
					@Pc(61) int local61 = local45.aBoolean354 ? 64 : 128;
					@Pc(65) int local65 = local61 * 50;
					@Pc(69) Class22_Sub3 local69 = this.method7733();
					local69.method5954((float) (this.anInt9193 % local65 * local45.aByte60) / (float) local65, 0.0F, (float) (local45.aByte57 * (this.anInt9193 % local65)) / (float) local65);
					this.method7703(Static152.aClass171_3);
				}
				if (!this.aBoolean626) {
					this.method7666(arg2, local45.anInt5194, local45.aByte56, arg0, local45.aByte54);
				}
				if (this.aClass17_3 == null) {
					this.method7712(local39);
					this.method7778(local45.anInt5193);
				} else {
					this.aClass17_3.method6796(local39, local45.anInt5193);
				}
			}
			this.anInt9194 = arg1;
		}
		this.anInt9219 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "(B)Lclient!qn;")
	public final Class22_Sub3 method7733() {
		return this.aClass22_Sub3Array3[this.anInt9192];
	}

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "(B)V")
	protected abstract void method7734();

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!hm;)V")
	public final void method7735(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		this.method7661(arg0, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "(I)Lclient!qn;")
	public final Class22_Sub3 method7736() {
		return this.aClass22_Sub3_19;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(ZI)V")
	public final void method7737(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean627 != arg0) {
			this.aBoolean627 = arg0;
			this.method7672();
			this.anInt9219 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public final Class10 method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class10_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(IIIIII)Lclient!qba;")
	@Override
	public final Class25 method7608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class25_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IZ)V")
	public final void method7738(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean625) {
			this.aBoolean625 = arg0;
			this.method7651();
			this.anInt9219 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public final Class12 method7612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class12_Sub2 local11 = new Class12_Sub2(this, arg2, arg3, arg4);
		local11.P(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "(I)V")
	protected abstract void method7739();

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "(I)V")
	private void method7740() {
		this.aBoolean639 = false;
		this.method7665();
		if (this.aClass123_7 == Static468.aClass123_5) {
			this.method7750();
		}
	}

	@OriginalMember(owner = "client!cb", name = "K", descriptor = "(I)V")
	protected void method7741() {
		this.anInt9213 = this.anInt9222;
		this.anInt9222 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "(Z)V")
	protected abstract void method7742();

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IF)V")
	public final void method7743(@OriginalArg(1) float arg0) {
		if (this.aFloat193 != arg0) {
			this.aFloat193 = arg0;
			this.method7674();
		}
	}

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "(I)V")
	public final void method7744() {
		if (this.aClass171Array3[this.anInt9192] != Static259.aClass171_6) {
			this.aClass171Array3[this.anInt9192] = Static259.aClass171_6;
			this.aClass22_Sub3Array3[this.anInt9192].ha();
			this.method7777();
		}
	}

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "(I)V")
	protected void method7745() {
		this.method7695();
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(ZI)V")
	public final void method7747(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean631) {
			this.aBoolean631 = arg0;
			this.method7671();
			this.anInt9219 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7627(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas15) {
			local5 = this.anObject17;
		} else if (this.aHashtable10.containsKey(arg0)) {
			local5 = this.aHashtable10.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method7684(arg0, local5);
		if (this.aCanvas14 == arg0) {
			this.method7662();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method7748(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "(I)V")
	private void method7749() {
		this.method7664(this.aClass265_15);
		this.method7697(this.anInterface15_14, 0);
		this.method7667(Static335.aClass102_3, 1, 0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public final void method7600(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aNativeHeap6 = ((Class1_Sub16_Sub2) arg0).aNativeHeap4;
		this.aNativeHeapBuffer8 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "(I)V")
	private void method7750() {
		this.method7701();
		if (this.aClass17_3 != null) {
			this.aClass17_3.method6804();
		}
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public final Class1_Sub16 method7629(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub16_Sub2 local8 = new Class1_Sub16_Sub2(arg0);
		this.aClass38_77.method1426(local8);
		return local8;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(IZ)V")
	public final void method7751(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean638) {
			this.aBoolean638 = arg0;
			this.method7699();
		}
	}

	@OriginalMember(owner = "client!cb", name = "Q", descriptor = "(I)I")
	public final int method7752() {
		return this.anInt9210;
	}

	@OriginalMember(owner = "client!cb", name = "R", descriptor = "(I)V")
	protected abstract void method7753();

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!pr;I)V")
	@Override
	public final void method7578(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class2_Sub7[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method7258(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "(B)I")
	public final int method7754() {
		return this.anInt9202;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)I")
	@Override
	public final int method7607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!cb", name = "ba", descriptor = "()I")
	@Override
	public final int ba() {
		return this.anInt9231;
	}

	@OriginalMember(owner = "client!cb", name = "S", descriptor = "(I)V")
	protected final void method7755() {
		@Pc(9) Enumeration local9 = this.aHashtable10.keys();
		while (local9.hasMoreElements()) {
			@Pc(21) Canvas local21 = (Canvas) local9.nextElement();
			this.method7756(local21, this.aHashtable10.get(local21));
		}
		this.anInterface15_13.method7527();
		this.anInterface15_14.method7527();
		this.aClass19_Sub2_26.method4707();
		this.aClass19_Sub2_21.method4707();
		this.aClass19_Sub2_24.method4707();
		this.aClass19_Sub2_29.method4707();
		this.aClass19_Sub2_27.method4707();
		this.aClass278_3.method6820();
		this.anInterface1_8.method7527();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method7756(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "(I)V")
	protected final void method7757() {
		@Pc(15) Hashtable local15 = new Hashtable();
		if (this.aHashtable10 != null && !this.aHashtable10.isEmpty()) {
			@Pc(26) Enumeration local26 = this.aHashtable10.keys();
			while (local26.hasMoreElements()) {
				@Pc(31) Canvas local31 = (Canvas) local26.nextElement();
				local15.put(local31, this.method7725(local31));
			}
		}
		this.aHashtable10 = local15;
		this.method7717();
		this.method7759();
		this.aClass278_3.method6826(this);
	}

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "(I)V")
	public final void method7758() {
		this.method7668(Static531.aClass102_6, 2);
	}

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt9230;
		if (local15 || arg1 != this.aFloat192 || arg2 != this.aFloat197) {
			this.aFloat197 = arg2;
			this.anInt9230 = arg0;
			this.aFloat192 = arg1;
			if (local15) {
				this.aFloat200 = (float) (this.anInt9230 & 0xFF0000) / 1.671168E7F;
				this.aFloat188 = (float) (this.anInt9230 & 0xFF) / 255.0F;
				this.aFloat199 = (float) (this.anInt9230 & 0xFF00) / 65280.0F;
				this.method7727();
			}
			this.aNativeInterface3.setSunColour(this.aFloat200, this.aFloat199, this.aFloat188, arg1, arg2);
			this.method7690();
		}
		if (this.aFloatArray77[0] != arg3 || arg4 != this.aFloatArray77[1] || this.aFloatArray77[2] != arg5) {
			this.aFloatArray77[2] = arg5;
			this.aFloatArray77[1] = arg4;
			this.aFloatArray77[0] = arg3;
			this.aFloatArray80[1] = -arg4;
			this.aFloatArray80[0] = -arg3;
			this.aFloatArray80[2] = -arg5;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray75[0] = local153 * arg3;
			this.aFloatArray75[1] = arg4 * local153;
			this.aFloatArray75[2] = arg5 * local153;
			this.aFloatArray74[0] = -this.aFloatArray75[0];
			this.aFloatArray74[1] = -this.aFloatArray75[1];
			this.aFloatArray74[2] = -this.aFloatArray75[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray75[0], this.aFloatArray75[1], this.aFloatArray75[2]);
			this.method7682();
			this.anInt9211 = (int) (arg3 * 256.0F / arg4);
			this.anInt9200 = (int) (arg5 * 256.0F / arg4);
		}
		this.method7716();
	}

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "(I)V")
	private void method7759() {
		this.anInterface15_14 = this.method7707(true);
		this.anInterface15_14.method6277(24, 12);
		this.aClass265_15 = this.method7729(new Class317[] { new Class317(Static397.aClass245_1) });
	}

	@OriginalMember(owner = "client!cb", name = "W", descriptor = "(I)Lclient!qn;")
	public final Class22_Sub3 method7760() {
		return this.aClass22_Sub3_15;
	}

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7630() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!cb", name = "ta", descriptor = "(II)V")
	@Override
	public final void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt9217 == arg0 && this.anInt9198 == arg1) {
			return;
		}
		this.anInt9217 = arg0;
		this.anInt9198 = arg1;
		this.method7740();
		this.method7674();
		this.method7704();
	}

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "(Z)V")
	protected abstract void method7761();

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "(Z)V")
	public final void method7762() {
		if (this.anInt9219 == 2) {
			return;
		}
		this.method7652();
		this.method7747(false);
		this.method7738(false);
		this.method7737(false);
		this.method7724(false);
		this.method7732(false, -2, false);
		this.anInt9219 = 2;
	}

	@OriginalMember(owner = "client!cb", name = "X", descriptor = "(I)V")
	protected abstract void method7763();

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[F)[F")
	public final float[] method7764(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloatArray81[0];
		arg0[4] = this.aFloatArray81[1];
		arg0[12] = this.aFloatArray81[3];
		arg0[8] = this.aFloatArray81[2];
		arg0[1] = this.aFloatArray81[4];
		arg0[13] = this.aFloatArray81[7];
		arg0[9] = this.aFloatArray81[6];
		arg0[2] = this.aFloatArray81[8];
		arg0[5] = this.aFloatArray81[5];
		arg0[14] = this.aFloatArray81[11];
		arg0[10] = this.aFloatArray81[10];
		arg0[3] = this.aFloatArray81[12];
		arg0[6] = this.aFloatArray81[9];
		arg0[7] = this.aFloatArray81[13];
		arg0[15] = this.aFloatArray81[15];
		arg0[11] = this.aFloatArray81[14];
		return arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!aq;[FIZ)Lclient!jb;")
	public final Interface5 method7765(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method7655(arg2, arg0, arg3, arg4, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
	@Override
	public void method7613(@OriginalArg(0) int arg0) {
		this.aClass232_3.method5718();
		this.anInt9193 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "(B)V")
	public final void method7766() {
		if (Static62.aClass123_3 == this.aClass123_7) {
			return;
		}
		@Pc(14) Class123 local14 = this.aClass123_7;
		this.aClass123_7 = Static62.aClass123_3;
		if (local14.method3505()) {
			this.method7710();
		}
		this.anInt9219 &= 0xFFFFFFE0;
		this.aFloatArray81 = this.aFloatArray73;
	}

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "(I)V")
	protected abstract void method7767();

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7636(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas15 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable10.containsKey(arg0)) {
			this.method7756(arg0, this.aHashtable10.get(arg0));
			this.aHashtable10.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
	@Override
	protected void method7566() {
		if (this.aBoolean642) {
			return;
		}
		for (@Pc(11) Class1 local11 = this.aClass38_77.method1419(); local11 != null; local11 = this.aClass38_77.method1415()) {
			((Class1_Sub16_Sub2) local11).method6230();
		}
		@Pc(27) Enumeration local27 = this.aHashtable10.keys();
		while (local27.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local27.nextElement();
			this.method7756(local32, this.aHashtable10.get(local32));
		}
		Static88.method2132(true, false);
		this.aNativeInterface3.release();
		this.aBoolean642 = true;
	}

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "()V")
	@Override
	public final void method7624() {
		this.aClass232_3.method5722();
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(II)V")
	public final void method7768(@OriginalArg(0) int arg0) {
		if (this.anInt9228 != arg0) {
			this.anInt9228 = arg0;
			this.method7708();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public final void method7597(@OriginalArg(0) Class22 arg0) {
		this.aClass22_Sub3_16 = (Class22_Sub3) arg0;
		this.aClass22_Sub3_18.EA(this.aClass22_Sub3_16);
		this.aClass22_Sub3_18.method5961();
		this.aClass22_Sub3_19.method5965(this.aClass22_Sub3_18);
		this.aClass22_Sub3_17.method5965(this.aClass22_Sub3_16);
		if (this.aClass123_7.method3505()) {
			this.method7710();
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(ZI)Lclient!af;")
	public final Interface1 method7769(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface1_8.method7517()) {
			this.anInterface1_8.method7526(arg0);
		}
		return this.anInterface1_8;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIZ[[I)Lclient!wv;")
	public abstract Interface20 method7770(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[][] arg2);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII[IZI)Lclient!jb;")
	public abstract Interface5 method7771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7589(@OriginalArg(0) boolean arg0) {
		this.aBoolean641 = arg0;
		this.method7739();
	}

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "(I)V")
	private void method7772() {
		if (this.aBoolean635) {
			return;
		}
		@Pc(16) float[] local16 = this.aFloatArray76;
		@Pc(23) float local23 = (float) this.anInt9217 - this.aFloat195;
		@Pc(30) float local30 = (float) this.anInt9198 - this.aFloat195;
		@Pc(42) float local42 = this.aFloat193 * (float) -this.anInt9205 / (float) this.anInt9224;
		@Pc(54) float local54 = (float) -this.anInt9208 * this.aFloat193 / (float) this.anInt9226;
		@Pc(69) float local69 = (float) (this.anInt9150 - this.anInt9208) * this.aFloat193 / (float) this.anInt9226;
		@Pc(84) float local84 = this.aFloat193 * (float) (this.anInt9085 - this.anInt9205) / (float) this.anInt9224;
		if (local54 == local69 || local42 == local84) {
			local16[4] = 0.0F;
			local16[7] = 0.0F;
			local16[3] = 0.0F;
			local16[10] = 1.0F;
			local16[2] = 0.0F;
			local16[5] = 1.0F;
			local16[12] = 0.0F;
			local16[8] = 0.0F;
			local16[9] = 0.0F;
			local16[14] = 0.0F;
			local16[0] = 1.0F;
			local16[11] = 0.0F;
			local16[15] = 1.0F;
			local16[6] = 0.0F;
			local16[1] = 0.0F;
			local16[13] = 0.0F;
		} else {
			local16[4] = 0.0F;
			local16[2] = 0.0F;
			local16[0] = 2.0F / (local69 - local54);
			local16[14] = local23 / (local23 - local30);
			local16[7] = 0.0F;
			local16[15] = 1.0F;
			local16[11] = 0.0F;
			local16[6] = 0.0F;
			local16[10] = 1.0F / (local23 - local30);
			local16[12] = (local54 + local69) / (local54 - local69);
			local16[13] = (local84 + local42) / (-local42 + local84);
			local16[3] = 0.0F;
			local16[8] = 0.0F;
			local16[5] = 2.0F / (local84 - local42);
			local16[9] = 0.0F;
			local16[1] = 0.0F;
		}
		this.method7675();
		this.aBoolean635 = true;
	}

	@OriginalMember(owner = "client!cb", name = "ra", descriptor = "()F")
	@Override
	public final float ra() {
		return this.aFloat195;
	}

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "(F)V")
	@Override
	public final void M(@OriginalArg(0) float arg0) {
		if (this.aFloat202 != arg0) {
			this.aFloat202 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method7727();
			this.method7716();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!lg;[Lclient!qm;Z)Lclient!ra;")
	@Override
	public final Class27 method7603(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class242[] arg1) {
		return new Class27_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!cb", name = "CA", descriptor = "()I")
	@Override
	public final int CA() {
		return this.anInt9198;
	}

	@OriginalMember(owner = "client!cb", name = "IA", descriptor = "(III[I)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass22_Sub3_16.method5959((float) arg0, (float) arg2, (float) arg1);
		if ((float) this.anInt9217 > local14 || (float) this.anInt9198 < local14) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(57) int local57 = (int) ((float) this.anInt9226 * this.aClass22_Sub3_16.method5962((float) arg1, (float) arg2, (float) arg0) / local14);
		@Pc(75) int local75 = (int) ((float) this.anInt9224 * this.aClass22_Sub3_16.method5957((float) arg0, (float) arg2, (float) arg1) / local14);
		if ((float) local57 >= this.aFloat196 && (float) local57 <= this.aFloat201 && (float) local75 >= this.aFloat186 && (float) local75 <= this.aFloat194) {
			arg3[0] = (int) ((float) local57 - this.aFloat196);
			arg3[1] = (int) ((float) local75 - this.aFloat186);
			arg3[2] = (int) local14;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7571() {
		return this.aBoolean636;
	}

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "(IIII)V")
	@Override
	public final void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9201 = arg3;
		this.anInt9202 = arg2;
		this.aBoolean626 = true;
		this.anInt9210 = arg0;
		this.anInt9218 = arg1;
		this.method7666(false, 0, 0, false, 3);
		if (this.aClass17_3 != null) {
			this.aClass17_3.method6795();
		}
		this.method7704();
		this.method7671();
	}

	@OriginalMember(owner = "client!cb", name = "bb", descriptor = "(I)V")
	public final void method7773() {
		this.aClass22_Sub3Array3 = new Class22_Sub3[this.anInt9203];
		this.aClass295Array6 = new Class295[this.anInt9203];
		this.aClass295Array5 = new Class295[this.anInt9203];
		this.aClass171Array3 = new Class171[this.anInt9203];
		this.anInterface14Array3 = new Interface14[this.anInt9203];
		for (@Pc(30) int local30 = 0; local30 < this.anInt9203; local30++) {
			this.aClass295Array6[local30] = Static74.aClass295_2;
			this.aClass295Array5[local30] = Static74.aClass295_2;
			this.aClass171Array3[local30] = Static259.aClass171_6;
			this.aClass22_Sub3Array3[local30] = new Class22_Sub3();
		}
		this.aClass1_Sub27Array6 = new Class1_Sub27[this.anInt9204 - 2];
		this.anInterface14_3 = this.method7775(1, 1, Static489.aClass289_13, Static72.aClass16_3);
		this.method7600(new Class1_Sub16_Sub2(262144));
		this.aClass265_17 = this.method7729(new Class317[] { new Class317(new Class245[] { Static397.aClass245_1, Static397.aClass245_5 }) });
		this.aClass265_18 = this.method7729(new Class317[] { new Class317(new Class245[] { Static397.aClass245_1, Static397.aClass245_3 }) });
		this.aClass265_16 = this.method7729(new Class317[] { new Class317(Static397.aClass245_1), new Class317(Static397.aClass245_3), new Class317(Static397.aClass245_5), new Class317(Static397.aClass245_2) });
		this.aClass265_20 = this.method7729(new Class317[] { new Class317(Static397.aClass245_1), new Class317(Static397.aClass245_3), new Class317(Static397.aClass245_5) });
		this.aClass19_Sub2_25 = new Class19_Sub2(this, 0, 0, false, false);
		this.aClass19_Sub2_26 = new Class19_Sub2(this, 0, 0, true, true);
		this.aClass19_Sub2_30 = new Class19_Sub2(this, 0, 0, false, false);
		this.aClass19_Sub2_21 = new Class19_Sub2(this, 0, 0, true, true);
		this.aClass19_Sub2_28 = new Class19_Sub2(this, 0, 0, false, false);
		this.aClass19_Sub2_24 = new Class19_Sub2(this, 0, 0, true, true);
		this.aClass19_Sub2_23 = new Class19_Sub2(this, 0, 0, false, false);
		this.aClass19_Sub2_29 = new Class19_Sub2(this, 0, 0, true, true);
		this.aClass19_Sub2_22 = new Class19_Sub2(this, 0, 0, false, false);
		this.aClass19_Sub2_27 = new Class19_Sub2(this, 0, 0, true, true);
		this.aClass278_3 = new Class278(this);
		this.anInterface1_8 = this.method7718(true);
		this.method7757();
		this.aClass155_6 = new Class155(this);
		this.aClass17Array3[1] = this.method7728(1);
		this.aClass17Array3[2] = this.method7728(2);
		this.aClass17Array3[4] = this.method7728(4);
		this.aClass17Array3[5] = this.method7728(5);
		this.aClass17Array3[6] = this.method7728(6);
		this.aClass17Array3[7] = this.method7728(7);
		this.aClass17Array3[3] = this.method7728(3);
		this.aClass17Array3[8] = this.method7728(8);
		this.aClass17Array3[9] = this.method7728(9);
		if (!this.aClass17Array3[2].method6799()) {
			this.aClass17Array3[2] = this.method7728(0);
		}
		if (!this.aClass17Array3[4].method6799()) {
			this.aClass17Array3[4] = this.aClass17Array3[2];
		}
		if (!this.aClass17Array3[8].method6799()) {
			this.aClass17Array3[8] = this.aClass17Array3[4];
		}
		if (!this.aClass17Array3[9].method6799()) {
			this.aClass17Array3[9] = this.aClass17Array3[8];
		}
		this.method7745();
		this.n();
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7572(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!r;Lclient!rd;Lclient!m;Lclient!pr;I)V")
	@Override
	public final void method7573(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class2_Sub7 arg3) {
		arg0.method7258(arg2, arg3, 0);
		this.method7577(arg1);
	}

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "(B)V")
	private void method7774() {
		if (this.aFloat195 == 0.0F) {
			this.aFloatArray79[10] = this.aFloat198;
			this.aFloatArray79[14] = this.aFloat191;
		} else {
			@Pc(13) float local13 = this.aFloat187 / (this.aFloat187 + this.aFloat195);
			@Pc(17) float local17 = local13 * local13;
			@Pc(33) float local33 = (1.0F - local13) * (-local13 + 1.0F) * -this.aFloat191 / this.aFloat195;
			this.aFloatArray79[14] = this.aFloat191 * local17;
			this.aFloatArray79[10] = local33 + this.aFloat198;
		}
		this.aFloat190 = (this.aFloatArray79[14] - (float) this.anInt9198) / this.aFloatArray79[10];
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()Z")
	@Override
	public final boolean method7569() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[Lclient!nm;)V")
	@Override
	public final void method7588(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub27[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass1_Sub27Array6[local7] = arg1[local7];
		}
		this.anInt9222 = arg0;
		if (this.aClass123_7.method3505()) {
			this.method7741();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!ui;ILclient!aq;)Lclient!jb;")
	public abstract Interface5 method7775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class289 arg2, @OriginalArg(4) Class16 arg3);

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "(B)V")
	public final void method7776() {
		if (this.anInt9219 == 16) {
			return;
		}
		this.method7669();
		this.method7747(true);
		this.method7737(true);
		this.method7724(true);
		this.method7730(1);
		this.anInt9219 = 16;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		@Pc(30) float local30 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
		@Pc(34) float local34 = local17 * local30;
		@Pc(38) float local38 = local10 * local30;
		if (!this.method7688(0.0F, 0.0F, local38 + (float) arg2, (float) arg1, (float) arg0, local34 + (float) arg3)) {
			return;
		}
		this.method7696();
		this.method7768(arg4);
		this.method7678(Static349.aClass122_3, 0);
		this.method7735(0, Static349.aClass122_3);
		this.method7730(arg5);
		this.method7693();
		this.method7653(false);
		this.method7749();
		this.method7653(true);
		this.method7735(0, Static197.aClass122_2);
		this.method7678(Static197.aClass122_2, 0);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt9217;
	}

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "(I)V")
	private void method7777() {
		this.method7689();
		if (this.aClass17_3 != null) {
			this.aClass17_3.method6807();
		}
	}

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "()Z")
	@Override
	public final boolean method7622() {
		return this.aClass17Array3[3].method6799();
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(II)V")
	public final void method7778(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method7723(Static453.aClass295_5, Static453.aClass295_5);
		} else if (arg0 == 0) {
			this.method7723(Static74.aClass295_2, Static74.aClass295_2);
		} else if (arg0 == 2) {
			this.method7723(Static453.aClass295_5, Static269.aClass295_3);
		} else if (arg0 == 3) {
			this.method7723(Static74.aClass295_2, Static361.aClass295_4);
		} else if (arg0 == 4) {
			this.method7723(Static38.aClass295_1, Static38.aClass295_1);
			return;
		}
	}
}
