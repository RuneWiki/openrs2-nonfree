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

@OriginalClass("client!gd")
public abstract class Class65_Sub2 extends Class65 {

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Lclient!jga;")
	protected Class179 aClass179_5;

	@OriginalMember(owner = "client!gd", name = "tb", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!gd", name = "Ab", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable6;

	@OriginalMember(owner = "client!gd", name = "vc", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!gd", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!gd", name = "Zd", descriptor = "I")
	public int anInt5229;

	@OriginalMember(owner = "client!gd", name = "ce", descriptor = "I")
	public int anInt5231;

	@OriginalMember(owner = "client!gd", name = "ge", descriptor = "I")
	protected int anInt5234;

	@OriginalMember(owner = "client!gd", name = "oe", descriptor = "[Lclient!oga;")
	protected Class254_Sub2[] aClass254_Sub2Array3;

	@OriginalMember(owner = "client!gd", name = "pe", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!gd", name = "qe", descriptor = "I")
	protected int anInt5235;

	@OriginalMember(owner = "client!gd", name = "ue", descriptor = "Z")
	public boolean aBoolean429;

	@OriginalMember(owner = "client!gd", name = "ve", descriptor = "I")
	public int anInt5237;

	@OriginalMember(owner = "client!gd", name = "xe", descriptor = "Lclient!sfa;")
	public Interface25 anInterface25_3;

	@OriginalMember(owner = "client!gd", name = "Ae", descriptor = "I")
	private int anInt5240;

	@OriginalMember(owner = "client!gd", name = "Be", descriptor = "I")
	protected int anInt5241;

	@OriginalMember(owner = "client!gd", name = "Ce", descriptor = "[Lclient!kka;")
	protected Class198[] aClass198Array3;

	@OriginalMember(owner = "client!gd", name = "Je", descriptor = "Lclient!gl;")
	private Class57_Sub1 aClass57_Sub1_3;

	@OriginalMember(owner = "client!gd", name = "Ue", descriptor = "[Lclient!jf;")
	protected Class178[] aClass178Array5;

	@OriginalMember(owner = "client!gd", name = "bf", descriptor = "F")
	public float bf;

	@OriginalMember(owner = "client!gd", name = "cf", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!gd", name = "ff", descriptor = "I")
	private int anInt5255;

	@OriginalMember(owner = "client!gd", name = "lf", descriptor = "I")
	public int anInt5257;

	@OriginalMember(owner = "client!gd", name = "uf", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!gd", name = "wf", descriptor = "Z")
	protected boolean aBoolean441;

	@OriginalMember(owner = "client!gd", name = "Ef", descriptor = "[Lclient!sfa;")
	private Interface25[] anInterface25Array3;

	@OriginalMember(owner = "client!gd", name = "Ff", descriptor = "I")
	public int anInt5265;

	@OriginalMember(owner = "client!gd", name = "Hf", descriptor = "F")
	private float aFloat108;

	@OriginalMember(owner = "client!gd", name = "If", descriptor = "Z")
	public boolean aBoolean443;

	@OriginalMember(owner = "client!gd", name = "Kf", descriptor = "I")
	public int anInt5266;

	@OriginalMember(owner = "client!gd", name = "Nf", descriptor = "Lclient!tu;")
	private Class18 aClass18_3;

	@OriginalMember(owner = "client!gd", name = "Pf", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!gd", name = "Qf", descriptor = "F")
	public float aFloat110;

	@OriginalMember(owner = "client!gd", name = "Sf", descriptor = "F")
	private float aFloat111;

	@OriginalMember(owner = "client!gd", name = "Uf", descriptor = "Lclient!rt;")
	private Class308 aClass308_3;

	@OriginalMember(owner = "client!gd", name = "Wf", descriptor = "Z")
	public boolean aBoolean445;

	@OriginalMember(owner = "client!gd", name = "Zf", descriptor = "Z")
	protected boolean aBoolean447;

	@OriginalMember(owner = "client!gd", name = "bg", descriptor = "I")
	protected int anInt5272;

	@OriginalMember(owner = "client!gd", name = "cg", descriptor = "[Lclient!jf;")
	protected Class178[] aClass178Array6;

	@OriginalMember(owner = "client!gd", name = "eg", descriptor = "I")
	protected int anInt5273;

	@OriginalMember(owner = "client!gd", name = "hg", descriptor = "[Lclient!gu;")
	protected Class5_Sub18[] aClass5_Sub18Array4;

	@OriginalMember(owner = "client!gd", name = "kg", descriptor = "Lclient!co;")
	public Class69 aClass69_15;

	@OriginalMember(owner = "client!gd", name = "lg", descriptor = "Lclient!hq;")
	public Class153_Sub1 aClass153_Sub1_21;

	@OriginalMember(owner = "client!gd", name = "mg", descriptor = "Lclient!hq;")
	public Class153_Sub1 aClass153_Sub1_22;

	@OriginalMember(owner = "client!gd", name = "ng", descriptor = "Lclient!cq;")
	private Interface3 anInterface3_11;

	@OriginalMember(owner = "client!gd", name = "og", descriptor = "Lclient!hq;")
	public Class153_Sub1 aClass153_Sub1_23;

	@OriginalMember(owner = "client!gd", name = "qg", descriptor = "Lclient!co;")
	public Class69 aClass69_16;

	@OriginalMember(owner = "client!gd", name = "rg", descriptor = "Lclient!cq;")
	private Interface3 anInterface3_12;

	@OriginalMember(owner = "client!gd", name = "sg", descriptor = "Lclient!hq;")
	public Class153_Sub1 aClass153_Sub1_24;

	@OriginalMember(owner = "client!gd", name = "tg", descriptor = "Lclient!co;")
	private Class69 aClass69_17;

	@OriginalMember(owner = "client!gd", name = "ug", descriptor = "Lclient!hq;")
	public Class153_Sub1 aClass153_Sub1_25;

	@OriginalMember(owner = "client!gd", name = "vg", descriptor = "Lclient!hq;")
	public Class153_Sub1 aClass153_Sub1_26;

	@OriginalMember(owner = "client!gd", name = "wg", descriptor = "Lclient!hq;")
	public Class153_Sub1 aClass153_Sub1_27;

	@OriginalMember(owner = "client!gd", name = "xg", descriptor = "Lclient!jj;")
	private Interface12 anInterface12_3;

	@OriginalMember(owner = "client!gd", name = "yg", descriptor = "Lclient!hq;")
	public Class153_Sub1 aClass153_Sub1_28;

	@OriginalMember(owner = "client!gd", name = "zg", descriptor = "Lclient!co;")
	private Class69 aClass69_18;

	@OriginalMember(owner = "client!gd", name = "Ag", descriptor = "Lclient!hq;")
	public Class153_Sub1 aClass153_Sub1_29;

	@OriginalMember(owner = "client!gd", name = "Bg", descriptor = "Lclient!co;")
	public Class69 aClass69_19;

	@OriginalMember(owner = "client!gd", name = "Cg", descriptor = "Lclient!co;")
	private Class69 aClass69_20;

	@OriginalMember(owner = "client!gd", name = "Dg", descriptor = "Lclient!hq;")
	public Class153_Sub1 aClass153_Sub1_30;

	@OriginalMember(owner = "client!gd", name = "Eg", descriptor = "Lclient!cq;")
	private Interface3 anInterface3_13;

	@OriginalMember(owner = "client!gd", name = "Fg", descriptor = "Lclient!co;")
	public Class69 aClass69_21;

	@OriginalMember(owner = "client!gd", name = "Gg", descriptor = "Z")
	protected boolean aBoolean448;

	@OriginalMember(owner = "client!gd", name = "Hg", descriptor = "I")
	private int anInt5275;

	@OriginalMember(owner = "client!gd", name = "Sb", descriptor = "Lclient!fca;")
	private final Class114 aClass114_29 = new Class114();

	@OriginalMember(owner = "client!gd", name = "ae", descriptor = "Z")
	protected boolean aBoolean427 = true;

	@OriginalMember(owner = "client!gd", name = "de", descriptor = "Lclient!oga;")
	protected final Class254_Sub2 aClass254_Sub2_15 = new Class254_Sub2();

	@OriginalMember(owner = "client!gd", name = "he", descriptor = "Lclient!oga;")
	public Class254_Sub2 aClass254_Sub2_16 = new Class254_Sub2();

	@OriginalMember(owner = "client!gd", name = "ie", descriptor = "Lclient!oga;")
	public final Class254_Sub2 aClass254_Sub2_17 = new Class254_Sub2();

	@OriginalMember(owner = "client!gd", name = "je", descriptor = "Lclient!oga;")
	protected final Class254_Sub2 aClass254_Sub2_18 = new Class254_Sub2();

	@OriginalMember(owner = "client!gd", name = "ke", descriptor = "Lclient!oga;")
	private final Class254_Sub2 aClass254_Sub2_19 = new Class254_Sub2();

	@OriginalMember(owner = "client!gd", name = "le", descriptor = "Lclient!oga;")
	private final Class254_Sub2 aClass254_Sub2_20 = new Class254_Sub2();

	@OriginalMember(owner = "client!gd", name = "me", descriptor = "[F")
	private final float[] aFloatArray44 = new float[16];

	@OriginalMember(owner = "client!gd", name = "Ke", descriptor = "I")
	public int anInt5246 = -1;

	@OriginalMember(owner = "client!gd", name = "Re", descriptor = "I")
	private int anInt5251 = -1;

	@OriginalMember(owner = "client!gd", name = "Ve", descriptor = "Z")
	protected boolean aBoolean433 = true;

	@OriginalMember(owner = "client!gd", name = "We", descriptor = "F")
	private float aFloat100 = 1.0F;

	@OriginalMember(owner = "client!gd", name = "Pe", descriptor = "I")
	protected final int anInt5249 = 0;

	@OriginalMember(owner = "client!gd", name = "ne", descriptor = "Z")
	private boolean aBoolean428 = false;

	@OriginalMember(owner = "client!gd", name = "Le", descriptor = "Z")
	private boolean aBoolean432 = false;

	@OriginalMember(owner = "client!gd", name = "De", descriptor = "Z")
	protected boolean aBoolean431 = false;

	@OriginalMember(owner = "client!gd", name = "Oe", descriptor = "I")
	private int anInt5248 = -1;

	@OriginalMember(owner = "client!gd", name = "se", descriptor = "I")
	protected int anInt5236 = 0;

	@OriginalMember(owner = "client!gd", name = "te", descriptor = "[F")
	private final float[] aFloatArray45 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!gd", name = "Qe", descriptor = "I")
	public int anInt5250 = 0;

	@OriginalMember(owner = "client!gd", name = "Xe", descriptor = "F")
	public float aFloat101 = -1.0F;

	@OriginalMember(owner = "client!gd", name = "Ie", descriptor = "I")
	public int anInt5245 = 8;

	@OriginalMember(owner = "client!gd", name = "we", descriptor = "I")
	public int anInt5238 = 0;

	@OriginalMember(owner = "client!gd", name = "ze", descriptor = "Z")
	protected boolean aBoolean430 = true;

	@OriginalMember(owner = "client!gd", name = "He", descriptor = "I")
	public int anInt5244 = 128;

	@OriginalMember(owner = "client!gd", name = "ef", descriptor = "Z")
	private boolean aBoolean435 = false;

	@OriginalMember(owner = "client!gd", name = "gf", descriptor = "Z")
	protected boolean aBoolean436 = false;

	@OriginalMember(owner = "client!gd", name = "hf", descriptor = "I")
	private int anInt5256 = -1;

	@OriginalMember(owner = "client!gd", name = "ye", descriptor = "I")
	protected int anInt5239 = 0;

	@OriginalMember(owner = "client!gd", name = "Se", descriptor = "I")
	private int anInt5252 = 0;

	@OriginalMember(owner = "client!gd", name = "jf", descriptor = "Z")
	private boolean aBoolean437 = false;

	@OriginalMember(owner = "client!gd", name = "Me", descriptor = "F")
	public float aFloat99 = 1.0F;

	@OriginalMember(owner = "client!gd", name = "kf", descriptor = "F")
	public float aFloat103 = 3584.0F;

	@OriginalMember(owner = "client!gd", name = "Ne", descriptor = "I")
	protected int anInt5247 = 0;

	@OriginalMember(owner = "client!gd", name = "yf", descriptor = "Z")
	protected boolean aBoolean442 = true;

	@OriginalMember(owner = "client!gd", name = "af", descriptor = "I")
	private int anInt5254 = 0;

	@OriginalMember(owner = "client!gd", name = "pf", descriptor = "Z")
	private boolean aBoolean438 = false;

	@OriginalMember(owner = "client!gd", name = "tf", descriptor = "[F")
	public final float[] aFloatArray48 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!gd", name = "re", descriptor = "F")
	public float aFloat98 = 3584.0F;

	@OriginalMember(owner = "client!gd", name = "Ee", descriptor = "I")
	public int anInt5242 = 50;

	@OriginalMember(owner = "client!gd", name = "zf", descriptor = "I")
	public int anInt5262 = 0;

	@OriginalMember(owner = "client!gd", name = "Gf", descriptor = "F")
	public float aFloat107 = 1.0F;

	@OriginalMember(owner = "client!gd", name = "xf", descriptor = "F")
	public float aFloat106 = 1.0F;

	@OriginalMember(owner = "client!gd", name = "Bf", descriptor = "I")
	public int anInt5263 = -1;

	@OriginalMember(owner = "client!gd", name = "df", descriptor = "[F")
	private final float[] aFloatArray47 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!gd", name = "vf", descriptor = "I")
	protected int anInt5261 = 0;

	@OriginalMember(owner = "client!gd", name = "mf", descriptor = "I")
	public int anInt5258 = 512;

	@OriginalMember(owner = "client!gd", name = "of", descriptor = "I")
	protected int anInt5260 = 3584;

	@OriginalMember(owner = "client!gd", name = "sf", descriptor = "Z")
	protected boolean aBoolean440 = false;

	@OriginalMember(owner = "client!gd", name = "Mf", descriptor = "I")
	private int anInt5267 = 16777215;

	@OriginalMember(owner = "client!gd", name = "qf", descriptor = "Z")
	protected boolean aBoolean439 = false;

	@OriginalMember(owner = "client!gd", name = "Rf", descriptor = "I")
	private int anInt5269 = 0;

	@OriginalMember(owner = "client!gd", name = "Af", descriptor = "[F")
	private final float[] aFloatArray49 = new float[16];

	@OriginalMember(owner = "client!gd", name = "Tf", descriptor = "I")
	public int anInt5270 = 3;

	@OriginalMember(owner = "client!gd", name = "nf", descriptor = "I")
	public int anInt5259 = 512;

	@OriginalMember(owner = "client!gd", name = "Ze", descriptor = "Z")
	protected boolean aBoolean434 = true;

	@OriginalMember(owner = "client!gd", name = "rf", descriptor = "F")
	public float aFloat104 = -1.0F;

	@OriginalMember(owner = "client!gd", name = "Of", descriptor = "I")
	private int anInt5268 = 0;

	@OriginalMember(owner = "client!gd", name = "Lf", descriptor = "[Lclient!tu;")
	private final Class18[] aClass18Array3 = new Class18[10];

	@OriginalMember(owner = "client!gd", name = "Cf", descriptor = "I")
	protected int anInt5264 = 0;

	@OriginalMember(owner = "client!gd", name = "ag", descriptor = "Lclient!mw;")
	protected Class239 aClass239_6 = Static49.aClass239_1;

	@OriginalMember(owner = "client!gd", name = "Yf", descriptor = "I")
	private int anInt5271 = 1;

	@OriginalMember(owner = "client!gd", name = "Jf", descriptor = "Z")
	private boolean aBoolean444 = false;

	@OriginalMember(owner = "client!gd", name = "Vf", descriptor = "[F")
	public final float[] aFloatArray50 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!gd", name = "Xf", descriptor = "Z")
	protected boolean aBoolean446 = true;

	@OriginalMember(owner = "client!gd", name = "dg", descriptor = "Lclient!jaa;")
	protected Class173 aClass173_4 = Static386.aClass173_5;

	@OriginalMember(owner = "client!gd", name = "ig", descriptor = "[F")
	private final float[] aFloatArray52 = new float[16];

	@OriginalMember(owner = "client!gd", name = "fg", descriptor = "F")
	public float aFloat112 = 1.0F;

	@OriginalMember(owner = "client!gd", name = "jg", descriptor = "I")
	protected final int anInt5274 = 0;

	@OriginalMember(owner = "client!gd", name = "gg", descriptor = "[F")
	private final float[] aFloatArray51 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!gd", name = "Ge", descriptor = "[F")
	protected float[] aFloatArray46 = this.aFloatArray51;

	@OriginalMember(owner = "client!gd", name = "Te", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream4 = new Stream();

	@OriginalMember(owner = "client!gd", name = "pg", descriptor = "Lclient!oga;")
	private final Class254_Sub2 aClass254_Sub2_21 = new Class254_Sub2();

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas10;

	@OriginalMember(owner = "client!gd", name = "ed", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!gd", name = "Fe", descriptor = "I")
	protected final int anInt5243;

	@OriginalMember(owner = "client!gd", name = "Eb", descriptor = "Ljava/lang/Object;")
	protected final Object anObject8;

	@OriginalMember(owner = "client!gd", name = "fc", descriptor = "Ljava/lang/Object;")
	private Object anObject9;

	@OriginalMember(owner = "client!gd", name = "Fb", descriptor = "Lclient!wm;")
	protected final Class390 aClass390_68;

	@OriginalMember(owner = "client!gd", name = "Qc", descriptor = "I")
	private int anInt5169;

	@OriginalMember(owner = "client!gd", name = "Sd", descriptor = "I")
	public int anInt5222;

	@OriginalMember(owner = "client!gd", name = "qd", descriptor = "I")
	private int anInt5194;

	@OriginalMember(owner = "client!gd", name = "Xb", descriptor = "I")
	public int anInt5126;

	@OriginalMember(owner = "client!gd", name = "Ye", descriptor = "I")
	public final int anInt5253;

	@OriginalMember(owner = "client!gd", name = "Df", descriptor = "Lclient!wf;")
	private final Class385 aClass385_3;

	@OriginalMember(owner = "client!gd", name = "Kb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!wm;II)V")
	protected Class65_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class390 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.aCanvas11 = this.aCanvas10 = arg0;
			this.anInt5243 = arg4;
			this.anObject9 = this.anObject8 = arg1;
			this.aClass390_68 = arg3;
			@Pc(305) Dimension local305 = arg0.getSize();
			this.anInt5222 = this.anInt5169 = local305.width;
			this.anInt5126 = this.anInt5194 = local305.height;
			this.anInt5253 = arg5;
			Static238.method3722(true, false);
			if (super.anInterface4_11 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt5253);
				this.aClass385_3 = null;
			} else {
				this.aClass385_3 = new Class385(this, super.anInterface4_11);
				this.aNativeInterface3 = new NativeInterface(super.anInterface4_11.method362(), this.anInt5253);
				for (@Pc(350) int local350 = 0; super.anInterface4_11.method362() > local350; local350++) {
					@Pc(357) Class136 local357 = super.anInterface4_11.method358(local350);
					if (local357 != null) {
						this.aNativeInterface3.initTextureMetrics(local350, local357.aByte55, local357.aByte51);
					}
				}
			}
		} catch (@Pc(392) Throwable local392) {
			local392.printStackTrace();
			this.method6923();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	private void method4346() {
		this.aFloat109 = (float) (this.anInt5264 - this.anInt5238);
		this.aFloat110 = (float) (this.anInt5261 - this.anInt5262);
		this.aFloat105 = (float) (this.anInt5247 - this.anInt5238);
		this.bf = (float) (this.anInt5236 - this.anInt5262);
	}

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Interface27 local9 = local6.anInterface27_3;
		this.method4413();
		this.method4426(local9);
		this.method4419(1);
		this.method4432(Static138.aClass178_2, Static138.aClass178_2);
		this.method4400(Static413.aClass64_3, 0);
		this.method4455(arg0);
		this.aClass254_Sub2_15.method6237((float) this.anInt5126, 0.0F, (float) this.anInt5222);
		this.method4434();
		this.aClass254_Sub2Array3[0].method6237(local9.method5617((float) this.anInt5126), 1.0F, local9.method5622((float) this.anInt5222));
		this.aClass254_Sub2Array3[0].method6243(0.0F, local9.method5622((float) -arg2), local9.method5617((float) -arg3));
		this.aClass198Array3[0] = Static102.aClass198_1;
		this.method4482();
		this.method4394();
		this.method4423();
		this.method4400(Static536.aClass64_4, 0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!iea;I)V")
	public abstract void method4347(@OriginalArg(0) Class162 arg0);

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean442 = arg0;
		this.method4355();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!ds;IILclient!tn;)Lclient!w;")
	public abstract Interface27 method4348(@OriginalArg(0) int arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class339 arg3);

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "()Lclient!oha;")
	@Override
	public final Class254 method6890() {
		return this.aClass254_Sub2_16;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!wq;)V")
	@Override
	public final void method6899(@OriginalArg(0) Class392 arg0) {
		this.aClass308_3.method7421(-1, arg0, this);
	}

	@OriginalMember(owner = "client!gd", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt5264 = this.anInt5222;
		this.anInt5261 = 0;
		this.anInt5236 = this.anInt5126;
		this.anInt5247 = 0;
		if (this.aBoolean448) {
			this.aBoolean448 = false;
			this.method4403();
		}
		this.method4346();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static653.method8767(arg0, this, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "(I)V")
	protected abstract void method4349();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method6922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) float local12 = (float) -arg0 + (float) arg2;
		@Pc(19) float local19 = (float) -arg1 + (float) arg3;
		@Pc(40) float local40;
		if (local12 == 0.0F && local19 == 0.0F) {
			local12 = 1.0F;
		} else {
			local40 = (float) (1.0D / Math.sqrt((double) (local19 * local19 + local12 * local12)));
			local19 *= local40;
			local12 *= local40;
		}
		this.method4402();
		this.method4455(arg4);
		this.method4400(Static413.aClass64_3, 0);
		this.method4369(0, Static413.aClass64_3);
		this.method4419(1);
		this.method4443();
		this.method4436(false);
		@Pc(86) int local86 = arg7 % (arg6 + arg5);
		local40 = local12 * (float) arg5;
		@Pc(96) float local96 = local19 * (float) arg5;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = 0.0F;
		@Pc(102) float local102 = local40;
		@Pc(104) float local104 = local96;
		if (local86 > arg5) {
			local98 = local12 * (float) (arg6 + arg5 - local86);
			local100 = (float) (arg5 + arg6 - local86) * local19;
		} else {
			local102 = (float) (arg5 - local86) * local12;
			local104 = local19 * (float) (arg5 - local86);
		}
		@Pc(155) float local155 = (float) arg0 + local98;
		@Pc(160) float local160 = (float) arg1 + local100;
		@Pc(165) float local165 = local12 * (float) arg6;
		@Pc(170) float local170 = (float) arg6 * local19;
		while (true) {
			if (arg2 <= arg0) {
				if (local155 < (float) arg2) {
					break;
				}
				if ((float) arg2 > local102 + local155) {
					local102 = (float) arg2 - local155;
				}
			} else {
				if ((float) arg2 < local155) {
					break;
				}
				if ((float) arg2 < local155 + local102) {
					local102 = (float) arg2 - local155;
				}
			}
			if (arg3 <= arg1) {
				if ((float) arg3 > local160) {
					break;
				}
				if ((float) arg3 > local160 + local104) {
					local104 = (float) arg3 - local160;
				}
			} else {
				if ((float) arg3 < local160) {
					break;
				}
				if ((float) arg3 < local104 + local160) {
					local104 = (float) arg3 - local160;
				}
			}
			if (!this.method4391(0.0F, local155 + local102, local160 + local104, 0.0F, local160, local155)) {
				return;
			}
			this.method4392();
			local155 += local165 + local102;
			local160 += local170 + local104;
			local102 = local40;
			local104 = local96;
		}
		this.method4436(true);
		this.method4369(0, Static536.aClass64_4);
		this.method4400(Static536.aClass64_4, 0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ne;[Lclient!vi;Z)Lclient!da;")
	@Override
	public final Class73 method6886(@OriginalArg(0) Class247 arg0, @OriginalArg(1) Class369[] arg1) {
		return new Class73_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!tn;I[BI)Lclient!ii;")
	public abstract Interface10 method4350(@OriginalArg(2) Class339 arg0, @OriginalArg(4) byte[] arg1);

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "(I)V")
	protected abstract void method4351();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IF)V")
	public final void method4352(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat100) {
			this.aFloat100 = arg0;
			this.method4478();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method6921(@OriginalArg(0) Class5_Sub14 arg0) {
		this.aNativeHeap5 = ((Class5_Sub14_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer6 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "(I)I")
	public final int method4353() {
		return this.anInt5248;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Lclient!tu;")
	protected Class18 method4354(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class18_Sub11(this);
		} else if (arg0 == 1) {
			return new Class18_Sub7(this);
		} else if (arg0 == 2) {
			return new Class18_Sub3(this, this.aClass179_5);
		} else if (arg0 == 7) {
			return new Class18_Sub2(this);
		} else {
			return new Class18_Sub9(this);
		}
	}

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "(I)V")
	protected abstract void method4355();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!hu;)V")
	private void method4356(@OriginalArg(0) int arg0, @OriginalArg(2) Class155 arg1) {
		this.method4427(0, this.anInterface3_11);
		this.method4447(this.aClass69_17);
		this.method4450(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "(I)V")
	protected abstract void method4357();

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(II)V")
	public final void method4358(@OriginalArg(1) int arg0) {
		if (this.anInt5239 != arg0) {
			this.anInt5239 = arg0;
			this.method4357();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!tn;BLclient!ds;)Z")
	public abstract boolean method4359(@OriginalArg(0) Class339 arg0, @OriginalArg(2) Class89 arg1);

	@OriginalMember(owner = "client!gd", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4402();
		this.method4455(arg4);
		this.method4400(Static413.aClass64_3, 0);
		this.method4369(0, Static413.aClass64_3);
		this.method4419(arg5);
		this.aClass254_Sub2_15.method6237((float) arg3, 1.0F, (float) arg2);
		this.aClass254_Sub2_15.method7358(arg0, arg1, 0);
		this.method4434();
		this.method4436(false);
		this.method4394();
		this.method4436(true);
		this.method4369(0, Static536.aClass64_4);
		this.method4400(Static536.aClass64_4, 0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!tn;[FZIIZ)Lclient!w;")
	public final Interface27 method4360(@OriginalArg(0) Class339 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method4474(arg4, arg1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public final void method4361() {
		this.aClass198Array3 = new Class198[this.anInt5257];
		this.aClass254_Sub2Array3 = new Class254_Sub2[this.anInt5257];
		this.aClass178Array6 = new Class178[this.anInt5257];
		this.anInterface25Array3 = new Interface25[this.anInt5257];
		this.aClass178Array5 = new Class178[this.anInt5257];
		for (@Pc(30) int local30 = 0; local30 < this.anInt5257; local30++) {
			this.aClass178Array6[local30] = Static606.aClass178_4;
			this.aClass178Array5[local30] = Static606.aClass178_4;
			this.aClass198Array3[local30] = Static378.aClass198_2;
			this.aClass254_Sub2Array3[local30] = new Class254_Sub2();
		}
		this.aClass5_Sub18Array4 = new Class5_Sub18[this.anInt5241 - 2];
		this.anInterface25_3 = this.method4348(1, Static120.aClass89_7, 1, Static435.aClass339_15);
		this.method6921(new Class5_Sub14_Sub2(262144));
		this.aClass69_21 = this.method4463(new Class219[] { new Class219(new Class281[] { Static456.aClass281_1, Static456.aClass281_5 }) });
		this.aClass69_19 = this.method4463(new Class219[] { new Class219(new Class281[] { Static456.aClass281_1, Static456.aClass281_3 }) });
		this.aClass69_15 = this.method4463(new Class219[] { new Class219(Static456.aClass281_1), new Class219(Static456.aClass281_3), new Class219(Static456.aClass281_5), new Class219(Static456.aClass281_2) });
		this.aClass69_16 = this.method4463(new Class219[] { new Class219(Static456.aClass281_1), new Class219(Static456.aClass281_3), new Class219(Static456.aClass281_5) });
		this.aClass153_Sub1_22 = new Class153_Sub1(this, 0, 0, false, false);
		this.aClass153_Sub1_29 = new Class153_Sub1(this, 0, 0, true, true);
		this.aClass153_Sub1_24 = new Class153_Sub1(this, 0, 0, false, false);
		this.aClass153_Sub1_23 = new Class153_Sub1(this, 0, 0, true, true);
		this.aClass153_Sub1_26 = new Class153_Sub1(this, 0, 0, false, false);
		this.aClass153_Sub1_27 = new Class153_Sub1(this, 0, 0, true, true);
		this.aClass153_Sub1_30 = new Class153_Sub1(this, 0, 0, false, false);
		this.aClass153_Sub1_25 = new Class153_Sub1(this, 0, 0, true, true);
		this.aClass153_Sub1_28 = new Class153_Sub1(this, 0, 0, false, false);
		this.aClass153_Sub1_21 = new Class153_Sub1(this, 0, 0, true, true);
		this.aClass308_3 = new Class308(this);
		this.anInterface12_3 = this.method4364(true);
		this.method4420();
		this.aClass179_5 = new Class179(this);
		this.aClass18Array3[1] = this.method4354(1);
		this.aClass18Array3[2] = this.method4354(2);
		this.aClass18Array3[4] = this.method4354(4);
		this.aClass18Array3[5] = this.method4354(5);
		this.aClass18Array3[6] = this.method4354(6);
		this.aClass18Array3[7] = this.method4354(7);
		this.aClass18Array3[3] = this.method4354(3);
		this.aClass18Array3[8] = this.method4354(8);
		this.aClass18Array3[9] = this.method4354(9);
		if (!this.aClass18Array3[2].method9000()) {
			this.aClass18Array3[2] = this.method4354(0);
		}
		if (!this.aClass18Array3[4].method9000()) {
			this.aClass18Array3[4] = this.aClass18Array3[2];
		}
		if (!this.aClass18Array3[8].method9000()) {
			this.aClass18Array3[8] = this.aClass18Array3[4];
		}
		if (!this.aClass18Array3[9].method9000()) {
			this.aClass18Array3[9] = this.aClass18Array3[8];
		}
		this.method4430();
		this.la();
		this.method6909();
	}

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "()Z")
	@Override
	public final boolean method6917() {
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZLclient!cja;I)V")
	protected abstract void method4362(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1);

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "(I)V")
	private void method4363() {
		if (this.aBoolean428) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray49;
		@Pc(9) float local9 = (float) this.anInt5242;
		@Pc(13) float local13 = (float) this.anInt5260;
		@Pc(25) float local25 = this.aFloat100 * (float) -this.anInt5262 / (float) this.anInt5259;
		@Pc(37) float local37 = this.aFloat100 * (float) -this.anInt5238 / (float) this.anInt5258;
		@Pc(52) float local52 = (float) (this.anInt5222 - this.anInt5238) * this.aFloat100 / (float) this.anInt5258;
		@Pc(67) float local67 = (float) (this.anInt5126 - this.anInt5262) * this.aFloat100 / (float) this.anInt5259;
		if (local37 == local52 || local25 == local67) {
			local5[2] = 0.0F;
			local5[7] = 0.0F;
			local5[13] = 0.0F;
			local5[1] = 0.0F;
			local5[3] = 0.0F;
			local5[0] = 1.0F;
			local5[12] = 0.0F;
			local5[10] = 1.0F;
			local5[9] = 0.0F;
			local5[6] = 0.0F;
			local5[14] = 0.0F;
			local5[15] = 1.0F;
			local5[11] = 0.0F;
			local5[4] = 0.0F;
			local5[5] = 1.0F;
			local5[8] = 0.0F;
		} else {
			local5[14] = local9 / (local9 - local13);
			local5[3] = 0.0F;
			local5[11] = 0.0F;
			local5[8] = 0.0F;
			local5[1] = 0.0F;
			local5[0] = 2.0F / (local52 - local37);
			local5[13] = (local67 + local25) / (local67 - local25);
			local5[2] = 0.0F;
			local5[9] = 0.0F;
			local5[7] = 0.0F;
			local5[6] = 0.0F;
			local5[15] = 1.0F;
			local5[12] = (local37 + local52) / (local37 - local52);
			local5[4] = 0.0F;
			local5[10] = 1.0F / (local9 - local13);
			local5[5] = 2.0F / (local67 - local25);
		}
		this.method4421();
		this.aBoolean428 = true;
	}

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass254_Sub2_16.aFloat147 + (float) arg2 * this.aClass254_Sub2_16.aFloat148 + (float) arg1 * this.aClass254_Sub2_16.aFloat154 + (float) arg0 * this.aClass254_Sub2_16.aFloat155;
		@Pc(57) float local57 = this.aClass254_Sub2_16.aFloat147 + this.aClass254_Sub2_16.aFloat148 * (float) arg5 + (float) arg3 * this.aClass254_Sub2_16.aFloat155 + (float) arg4 * this.aClass254_Sub2_16.aFloat154;
		if (local32 < (float) this.anInt5242 && local57 < (float) this.anInt5242) {
			local7 |= 0x10;
		} else if ((float) this.anInt5260 < local32 && (float) this.anInt5260 < local57) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass254_Sub2_16.aFloat151 * (float) arg2 + this.aClass254_Sub2_16.aFloat144 * (float) arg1 + this.aClass254_Sub2_16.aFloat153 * (float) arg0 + this.aClass254_Sub2_16.aFloat146) * (float) this.anInt5258 / (float) arg6);
		@Pc(157) int local157 = (int) ((this.aClass254_Sub2_16.aFloat146 + (float) arg5 * this.aClass254_Sub2_16.aFloat151 + (float) arg3 * this.aClass254_Sub2_16.aFloat153 + (float) arg4 * this.aClass254_Sub2_16.aFloat144) * (float) this.anInt5258 / (float) arg6);
		if (this.aFloat105 > (float) local124 && (float) local157 < this.aFloat105) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat109 && (float) local157 > this.aFloat109) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt5259 * (this.aClass254_Sub2_16.aFloat152 + this.aClass254_Sub2_16.aFloat145 * (float) arg1 + (float) arg0 * this.aClass254_Sub2_16.aFloat149 + (float) arg2 * this.aClass254_Sub2_16.aFloat150) / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt5259 * ((float) arg5 * this.aClass254_Sub2_16.aFloat150 + (float) arg4 * this.aClass254_Sub2_16.aFloat145 + this.aClass254_Sub2_16.aFloat149 * (float) arg3 + this.aClass254_Sub2_16.aFloat152) / (float) arg6);
		if (this.aFloat110 > (float) local224 && this.aFloat110 > (float) local257) {
			local7 |= 0x4;
		} else if ((float) local224 > this.bf && (float) local257 > this.bf) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)Lclient!jj;")
	public abstract Interface12 method4364(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!vi;Z)Lclient!pu;")
	@Override
	public final Class50 method6898(@OriginalArg(0) Class369 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(119) Class50 local119;
		if (arg0.anInt10309 == 0 || arg0.anInt10307 == 0) {
			local119 = this.method6952(1, 1, new int[1], 1);
		} else {
			@Pc(16) int[] local16 = new int[arg0.anInt10309 * arg0.anInt10307];
			@Pc(18) int local18 = 0;
			@Pc(20) int local20 = 0;
			@Pc(25) int local25;
			@Pc(28) int local28;
			if (arg0.aByteArray103 == null) {
				for (local25 = 0; local25 < arg0.anInt10307; local25++) {
					for (local28 = 0; local28 < arg0.anInt10309; local28++) {
						@Pc(86) int local86 = arg0.anIntArray561[arg0.aByteArray104[local18++] & 0xFF];
						local16[local20++] = local86 == 0 ? 0 : local86 | 0xFF000000;
					}
				}
			} else {
				for (local25 = 0; local25 < arg0.anInt10307; local25++) {
					for (local28 = 0; local28 < arg0.anInt10309; local28++) {
						local16[local20++] = arg0.anIntArray561[arg0.aByteArray104[local18] & 0xFF] | arg0.aByteArray103[local18] << 24;
						local18++;
					}
				}
			}
			local119 = this.method6952(arg0.anInt10307, arg0.anInt10309, local16, arg0.anInt10309);
		}
		local119.method5986(arg0.anInt10308, arg0.anInt10306, arg0.anInt10311, arg0.anInt10310);
		return local119;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZ)Lclient!pu;")
	@Override
	public final Class50 method6907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class50_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6946(@OriginalArg(0) Canvas arg0) {
		this.aCanvas11 = null;
		this.anObject9 = null;
		if (arg0 == null || this.aCanvas10 == arg0) {
			this.anObject9 = this.anObject8;
			this.aCanvas11 = this.aCanvas10;
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.anObject9 = this.aHashtable6.get(arg0);
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.anObject9 == null) {
			throw new RuntimeException();
		}
		this.method4415(this.anObject9, this.aCanvas11);
		this.method4401();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BILclient!tn;ZIIIB)Lclient!w;")
	protected abstract Interface27 method4365(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class339 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "()Z")
	@Override
	public final boolean method6887() {
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt5238, this.anInt5262, this.anInt5258, this.anInt5259 };
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(ZI)V")
	public final void method4366(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean441) {
			this.aBoolean441 = arg0;
			this.method4440();
			this.anInt5255 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "(I)V")
	public final void method4367() {
		if (this.anInt5255 == 16) {
			return;
		}
		this.method4456();
		this.method4366(true);
		this.method4433(true);
		this.method4445(true);
		this.method4419(1);
		this.anInt5255 = 16;
	}

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "(I)V")
	protected abstract void method4368();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!cja;I)V")
	public final void method4369(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1) {
		this.method4362(arg0, arg1);
	}

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "(I)V")
	protected abstract void method4370();

	@OriginalMember(owner = "client!gd", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean443 = false;
	}

	@OriginalMember(owner = "client!gd", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt5247 < arg0) {
			local5 = true;
			this.anInt5247 = arg0;
		}
		if (arg2 < this.anInt5264) {
			local5 = true;
			this.anInt5264 = arg2;
		}
		if (arg1 > this.anInt5261) {
			this.anInt5261 = arg1;
			local5 = true;
		}
		if (this.anInt5236 > arg3) {
			local5 = true;
			this.anInt5236 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean448) {
			this.aBoolean448 = true;
			this.method4403();
		}
		this.method4409();
		this.method4346();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIZ)Lclient!pu;")
	@Override
	public final Class50 method6936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class50_Sub3 local11 = new Class50_Sub3(this, arg2, arg3, arg4);
		local11.method5998(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[IBIZ)Lclient!w;")
	public final Interface27 method4371(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		return this.method4464(arg3, 0, arg0, arg1, arg2, 0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
	public final void method4372(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean436) {
			this.aBoolean436 = arg0;
			this.method4437();
			this.anInt5255 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		if (local9 == 0.0F && local15 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(40) float local40 = (float) (1.0D / Math.sqrt((double) (local15 * local15 + local9 * local9)));
			local15 *= local40;
			local9 *= local40;
		}
		if (!this.method4391(0.0F, local9 + (float) arg2, local15 + (float) arg3, 0.0F, (float) arg1, (float) arg0)) {
			return;
		}
		this.method4402();
		this.method4455(arg4);
		this.method4400(Static413.aClass64_3, 0);
		this.method4369(0, Static413.aClass64_3);
		this.method4419(arg5);
		this.method4443();
		this.method4436(false);
		this.method4392();
		this.method4436(true);
		this.method4369(0, Static536.aClass64_4);
		this.method4400(Static536.aClass64_4, 0);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "()Z")
	@Override
	public final boolean method6883() {
		return false;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method4373(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BZ)Lclient!cq;")
	public abstract Interface3 method4374(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	protected abstract void method4375();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B[F)[F")
	public final float[] method4376(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloatArray46[1];
		arg0[12] = this.aFloatArray46[3];
		arg0[8] = this.aFloatArray46[2];
		arg0[0] = this.aFloatArray46[0];
		arg0[1] = this.aFloatArray46[4];
		arg0[2] = this.aFloatArray46[8];
		arg0[5] = this.aFloatArray46[5];
		arg0[9] = this.aFloatArray46[6];
		arg0[13] = this.aFloatArray46[7];
		arg0[7] = this.aFloatArray46[13];
		arg0[6] = this.aFloatArray46[9];
		arg0[3] = this.aFloatArray46[12];
		arg0[10] = this.aFloatArray46[10];
		arg0[14] = this.aFloatArray46[11];
		arg0[15] = this.aFloatArray46[15];
		arg0[11] = this.aFloatArray46[14];
		return arg0;
	}

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "()Z")
	@Override
	public final boolean method6908() {
		return false;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(IZ)V")
	public final void method4377(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean433) {
			this.aBoolean433 = arg0;
			this.method4407();
		}
	}

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "(I)V")
	private void method4378() {
		if (this.aClass173_4 == Static531.aClass173_6) {
			@Pc(7) float local7 = this.method4441();
			this.aClass254_Sub2_15.method6243(0.0F, local7, local7);
		}
		this.aBoolean438 = false;
		this.method4428();
		if (this.aClass18_3 != null) {
			this.aClass18_3.method8997();
		}
	}

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "(I)[F")
	public final float[] method4379() {
		return this.aFloatArray51;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
	private void method4380() {
		this.anInterface3_12 = this.method4374(true);
		this.anInterface3_12.method8244(24, 12);
		this.aClass69_18 = this.method4463(new Class219[] { new Class219(Static456.aClass281_1) });
	}

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "(I)V")
	protected abstract void method4381();

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(ZI)V")
	public abstract void method4382(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "(I)V")
	@Override
	public final void method6956(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
	protected abstract void method4383();

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt5229 + this.anInt5231 + this.anInt5234;
	}

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "(I)V")
	private void method4385() {
		this.anInterface3_11 = this.method4374(false);
		this.anInterface3_11.method8244(140, 28);
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			@Pc(32) Buffer local32 = this.anInterface3_11.method8245();
			if (local32 != null) {
				@Pc(39) Stream local39 = this.method4457(local32);
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
				if (this.anInterface3_11.method8243()) {
					break;
				}
			}
		}
		this.aClass69_17 = this.method4463(new Class219[] { new Class219(new Class281[] { Static456.aClass281_1, Static456.aClass281_5, Static456.aClass281_5 }) });
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	protected abstract void method4386(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([[IIZI)Lclient!lha;")
	public abstract Interface14 method4387(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!gd", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6932(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)V")
	@Override
	public final void method6931(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!cja;ZZ)V")
	public abstract void method4388(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "(I)V")
	public abstract void method4389();

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Z)Lclient!lha;")
	public final Interface14 method4390() {
		return this.aClass57_Sub1_3 == null ? null : this.aClass57_Sub1_3.method971();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(FFFFFFB)Z")
	private boolean method4391(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface3_12.method8245();
		if (local9 == null) {
			return false;
		}
		@Pc(23) Stream local23 = this.method4457(local9);
		if (Stream.c()) {
			local23.a(arg5);
			local23.a(arg4);
			local23.a(arg0);
			local23.a(arg1);
			local23.a(arg2);
			local23.a(arg3);
		} else {
			local23.b(arg5);
			local23.b(arg4);
			local23.b(arg0);
			local23.b(arg1);
			local23.b(arg2);
			local23.b(arg3);
		}
		local23.a();
		return this.anInterface3_12.method8243();
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(Z)V")
	private void method4392() {
		this.method4427(0, this.anInterface3_12);
		this.method4447(this.aClass69_18);
		this.method4450(Static493.aClass155_5, 0, 1);
	}

	@OriginalMember(owner = "client!gd", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6932(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "(I)V")
	protected abstract void method4393();

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(B)V")
	public final void method4394() {
		this.method4356(2, Static504.aClass155_6);
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(Z)V")
	private void method4395() {
		this.aFloatArray52[14] = this.aFloat111;
		this.aFloatArray52[10] = this.aFloat108;
		this.aFloat103 = ((float) -this.anInt5260 + this.aFloatArray52[14]) / this.aFloatArray52[10];
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6950(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas10 == arg0) {
			local5 = this.anObject9;
		} else if (this.aHashtable6.containsKey(arg0)) {
			local5 = this.aHashtable6.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method4373(local5, arg0);
		if (this.aCanvas11 == arg0) {
			this.method4401();
		}
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(B)I")
	public final int method4396() {
		return this.anInt5239;
	}

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "()Lclient!oha;")
	@Override
	public final Class254 method6955() {
		return new Class254_Sub2();
	}

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "()Lclient!oha;")
	@Override
	public final Class254 method6903() {
		return this.aClass254_Sub2_21;
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	@Override
	public void method6918(@OriginalArg(0) int arg0) {
		if (this.aClass385_3 != null) {
			this.aClass385_3.method8805();
		}
		this.anInt5266 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "(I)V")
	private void method4397() {
		if (this.aClass173_4 == Static531.aClass173_6) {
			return;
		}
		@Pc(14) Class173 local14 = this.aClass173_4;
		this.aClass173_4 = Static531.aClass173_6;
		if (local14.method4244()) {
			this.method4442();
		}
		this.method4459();
		this.aFloatArray46 = this.aFloatArray44;
		this.method4466();
		this.anInt5255 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I")
	@Override
	public final int method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIILclient!hu;ZLclient!jj;I)V")
	public abstract void method4398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) Interface12 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(BI)Lclient!jj;")
	public final Interface12 method4399(@OriginalArg(1) int arg0) {
		if (this.anInterface12_3.method8232() < arg0 * 2) {
			this.anInterface12_3.method8239(arg0);
		}
		return this.anInterface12_3;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!cja;IB)V")
	public final void method4400(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		this.method4388(arg1, arg0, false, false);
	}

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "(I)V")
	private void method4401() {
		if (this.aCanvas11 == null) {
			this.anInt5169 = this.anInt5194 = 1;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas11.getSize();
			this.anInt5169 = local10.width;
			this.anInt5194 = local10.height;
		}
		this.anInt5126 = this.anInt5194;
		this.anInt5222 = this.anInt5169;
		this.method4477();
		this.method4461();
		this.method4478();
		this.method4368();
		this.method4346();
		this.method4408();
		this.la();
	}

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "(I)V")
	private void method4402() {
		if (this.anInt5255 == 1) {
			return;
		}
		this.method4397();
		this.method4366(false);
		this.method4372(false);
		this.method4433(false);
		this.method4445(false);
		this.method4446(false, -2, false);
		this.method4405(1);
		this.method4426(this.anInterface25_3);
		this.anInt5255 = 1;
	}

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "(I)V")
	protected abstract void method4403();

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "(I)V")
	public final void method4404() {
		if (this.anInt5255 == 4) {
			return;
		}
		this.method4397();
		this.method4366(false);
		this.method4372(false);
		this.method4433(false);
		this.method4445(false);
		this.method4446(false, -2, false);
		this.method4419(1);
		this.method4405(0);
		this.anInt5255 = 4;
	}

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "(II)V")
	public final void method4405(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4432(Static138.aClass178_2, Static138.aClass178_2);
		} else if (arg0 == 0) {
			this.method4432(Static606.aClass178_4, Static606.aClass178_4);
		} else if (arg0 == 2) {
			this.method4432(Static512.aClass178_3, Static138.aClass178_2);
		} else if (arg0 == 3) {
			this.method4432(Static654.aClass178_5, Static606.aClass178_4);
		} else if (arg0 == 4) {
			this.method4432(Static11.aClass178_1, Static11.aClass178_1);
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "()Z")
	@Override
	public final boolean method6884() {
		return false;
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(Z)I")
	public final int method4406() {
		return this.anInt5251;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method6915() {
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	@Override
	public final void method6911(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass385_3 != null) {
			this.aClass385_3.method8807();
		}
		this.anInt5244 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!su;IIII)Lclient!ka;")
	@Override
	public final Class153 method6964(@OriginalArg(0) Class329 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class153_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!gd", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt5246 && this.anInt5263 == arg1 && arg2 == this.anInt5250) {
			return;
		}
		this.anInt5263 = arg1;
		this.anInt5246 = arg0;
		this.anInt5250 = arg2;
		this.method4480();
		this.method4440();
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(B)V")
	protected abstract void method4407();

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "()Z")
	@Override
	public final boolean method6889() {
		return this.aClass18Array3[3].method9000();
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(Z)V")
	public final void method4408() {
		if (this.aClass173_4 == Static386.aClass173_5) {
			return;
		}
		@Pc(6) Class173 local6 = this.aClass173_4;
		this.aClass173_4 = Static386.aClass173_5;
		if (local6.method4244()) {
			this.method4442();
		}
		this.aFloatArray46 = this.aFloatArray51;
		this.anInt5255 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!gd", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass254_Sub2_16.method6224((float) arg0, (float) arg2, (float) arg1);
		@Pc(25) int local25;
		@Pc(28) int local28;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local25 = (int) ((float) this.anInt5258 * this.aClass254_Sub2_16.method6225((float) arg2, (float) arg0, (float) arg1) / local14);
			local28 = (int) ((float) this.anInt5259 * this.aClass254_Sub2_16.method6238((float) arg2, (float) arg0, (float) arg1) / local14);
		} else {
			local25 = this.anInt5238;
			local28 = this.anInt5262;
		}
		arg3[0] = (int) ((float) local25 - this.aFloat105);
		arg3[1] = (int) ((float) local28 - this.aFloat110);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!gd", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt5267;
		if (local15 || this.aFloat101 != arg1 || this.aFloat104 != arg2) {
			this.aFloat104 = arg2;
			this.anInt5267 = arg0;
			this.aFloat101 = arg1;
			if (local15) {
				this.aFloat112 = (float) (this.anInt5267 & 0xFF) / 255.0F;
				this.aFloat107 = (float) (this.anInt5267 & 0xFF00) / 65280.0F;
				this.aFloat106 = (float) (this.anInt5267 & 0xFF0000) / 1.671168E7F;
				this.method4393();
			}
			this.aNativeInterface3.setSunColour(this.aFloat106, this.aFloat107, this.aFloat112, arg1, arg2);
			this.method4448();
		}
		if (this.aFloatArray47[0] != arg3 || arg4 != this.aFloatArray47[1] || this.aFloatArray47[2] != arg5) {
			this.aFloatArray47[1] = arg4;
			this.aFloatArray47[2] = arg5;
			this.aFloatArray47[0] = arg3;
			this.aFloatArray45[1] = -arg4;
			this.aFloatArray45[0] = -arg3;
			this.aFloatArray45[2] = -arg5;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray50[0] = local153 * arg3;
			this.aFloatArray50[2] = arg5 * local153;
			this.aFloatArray50[1] = arg4 * local153;
			this.aFloatArray48[0] = -this.aFloatArray50[0];
			this.aFloatArray48[1] = -this.aFloatArray50[1];
			this.aFloatArray48[2] = -this.aFloatArray50[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray50[0], this.aFloatArray50[1], this.aFloatArray50[2]);
			this.method4389();
			this.anInt5237 = (int) (arg5 * 256.0F / arg4);
			this.anInt5265 = (int) (arg3 * 256.0F / arg4);
		}
		this.method4383();
	}

	@OriginalMember(owner = "client!gd", name = "F", descriptor = "(I)V")
	protected abstract void method4409();

	@OriginalMember(owner = "client!gd", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass254_Sub2_16.aFloat147 + this.aClass254_Sub2_16.aFloat148 * (float) arg2 + (float) arg1 * this.aClass254_Sub2_16.aFloat154 + this.aClass254_Sub2_16.aFloat155 * (float) arg0;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg5 * this.aClass254_Sub2_16.aFloat148 + (float) arg3 * this.aClass254_Sub2_16.aFloat155 + this.aClass254_Sub2_16.aFloat154 * (float) arg4 + this.aClass254_Sub2_16.aFloat147;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt5242 > local32 && (float) this.anInt5242 > local63) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt5260 && (float) this.anInt5260 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass254_Sub2_16.aFloat146 + this.aClass254_Sub2_16.aFloat153 * (float) arg0 + (float) arg1 * this.aClass254_Sub2_16.aFloat144 + this.aClass254_Sub2_16.aFloat151 * (float) arg2) * (float) this.anInt5258 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt5258 * (this.aClass254_Sub2_16.aFloat146 + (float) arg3 * this.aClass254_Sub2_16.aFloat153 + this.aClass254_Sub2_16.aFloat144 * (float) arg4 + (float) arg5 * this.aClass254_Sub2_16.aFloat151) / local63);
		if ((float) local135 < this.aFloat105 && this.aFloat105 > (float) local167) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat109 && this.aFloat109 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass254_Sub2_16.aFloat152 + this.aClass254_Sub2_16.aFloat149 * (float) arg0 + (float) arg1 * this.aClass254_Sub2_16.aFloat145 + (float) arg2 * this.aClass254_Sub2_16.aFloat150) * (float) this.anInt5259 / local32);
		@Pc(265) int local265 = (int) ((this.aClass254_Sub2_16.aFloat152 + (float) arg5 * this.aClass254_Sub2_16.aFloat150 + (float) arg4 * this.aClass254_Sub2_16.aFloat145 + (float) arg3 * this.aClass254_Sub2_16.aFloat149) * (float) this.anInt5259 / local63);
		if (this.aFloat110 > (float) local233 && this.aFloat110 > (float) local265) {
			local7 |= 0x4;
		} else if (this.bf < (float) local233 && this.bf < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "(I)Lclient!oga;")
	public final Class254_Sub2 method4410() {
		if (!this.aBoolean438) {
			this.aClass254_Sub2_20.method6239(this.aClass254_Sub2_18, this.aClass254_Sub2_15);
			this.aBoolean438 = true;
		}
		return this.aClass254_Sub2_20;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!kka;)V")
	public final void method4411(@OriginalArg(1) Class198 arg0) {
		this.aClass198Array3[this.anInt5239] = arg0;
		this.method4482();
	}

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "()Z")
	@Override
	public final boolean method6930() {
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "(I)V")
	public final void method4412() {
		if (this.anInt5255 == 8) {
			return;
		}
		this.method4418();
		this.method4366(true);
		this.method4433(true);
		this.method4445(true);
		this.method4419(1);
		this.anInt5255 = 8;
	}

	@OriginalMember(owner = "client!gd", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5251 = arg2;
		this.anInt5268 = arg3;
		this.anInt5248 = arg1;
		this.aBoolean443 = true;
		this.anInt5240 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "(Z)V")
	public final void method4413() {
		if (this.anInt5255 == 2) {
			return;
		}
		this.method4397();
		this.method4366(false);
		this.method4372(false);
		this.method4433(false);
		this.method4445(false);
		this.method4446(false, -2, false);
		this.anInt5255 = 2;
	}

	@OriginalMember(owner = "client!gd", name = "I", descriptor = "(I)I")
	public final int method4414() {
		return this.anInt5268;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method6960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	protected abstract void method4415(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!gd", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass254_Sub2_16.method6224((float) arg0, (float) arg2, (float) arg1);
		if ((float) this.anInt5242 > local14 || local14 > (float) this.anInt5260) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt5258 * this.aClass254_Sub2_16.method6225((float) arg2, (float) arg0, (float) arg1) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt5259 * this.aClass254_Sub2_16.method6238((float) arg2, (float) arg0, (float) arg1) / (float) arg3);
		arg4[2] = (int) local14;
		arg4[0] = (int) ((float) local58 - this.aFloat105);
		arg4[1] = (int) ((float) local77 - this.aFloat110);
	}

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "(B)V")
	protected abstract void method4416();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([IIIIIZ)Lclient!pu;")
	@Override
	public final Class50 method6933(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class50_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "(I)V")
	public final void method4417() {
		this.method4408();
		this.method4466();
	}

	@OriginalMember(owner = "client!gd", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat99 != arg0) {
			this.aFloat99 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method4393();
			this.method4383();
		}
	}

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt5275;
	}

	@OriginalMember(owner = "client!gd", name = "K", descriptor = "(I)V")
	private void method4418() {
		if (this.aClass173_4 == Static666.aClass173_7) {
			return;
		}
		@Pc(6) Class173 local6 = this.aClass173_4;
		this.aClass173_4 = Static666.aClass173_7;
		if (!local6.method4244()) {
			this.method4442();
		}
		this.method4453();
		this.aFloatArray46 = this.aFloatArray52;
		this.method4466();
		this.anInt5255 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6928(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas10) {
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
			@Pc(53) Object local53 = this.method4473(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt5242;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(ZI)V")
	public final void method4419(@OriginalArg(1) int arg0) {
		if (this.anInt5271 == arg0) {
			return;
		}
		@Pc(29) Class239 local29;
		@Pc(27) boolean local27;
		@Pc(31) boolean local31;
		if (arg0 == 1) {
			local29 = Static49.aClass239_1;
			local31 = true;
			local27 = true;
		} else if (arg0 == 2) {
			local27 = true;
			local29 = Static625.aClass239_7;
			local31 = false;
		} else if (arg0 == 128) {
			local29 = Static204.aClass239_4;
			local31 = true;
			local27 = true;
		} else {
			local29 = Static239.aClass239_5;
			local27 = false;
			local31 = false;
		}
		if (local31 != this.aBoolean446) {
			this.aBoolean446 = local31;
			this.method4370();
		}
		if (this.aBoolean434 != local27) {
			this.aBoolean434 = local27;
			this.method4416();
		}
		if (this.aClass239_6 != local29) {
			this.aClass239_6 = local29;
			this.method4444();
		}
		this.anInt5255 &= 0xFFFFFFE3;
		this.anInt5271 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([I)V")
	@Override
	public final void method6945(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt5126;
		arg0[0] = this.anInt5222;
	}

	@OriginalMember(owner = "client!gd", name = "L", descriptor = "(I)V")
	protected final void method4420() {
		@Pc(7) Hashtable local7 = new Hashtable();
		if (this.aHashtable6 != null && !this.aHashtable6.isEmpty()) {
			@Pc(18) Enumeration local18 = this.aHashtable6.keys();
			while (local18.hasMoreElements()) {
				@Pc(23) Canvas local23 = (Canvas) local18.nextElement();
				local7.put(local23, this.method4473(local23));
			}
		}
		this.aHashtable6 = local7;
		this.method4385();
		this.method4380();
		this.method4470();
		this.aClass308_3.method7420(this);
	}

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "(B)V")
	private void method4421() {
		this.aFloat98 = (float) this.anInt5260;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!tea;)V")
	@Override
	public final void method6905(@OriginalArg(0) Class57 arg0) {
		this.aClass57_Sub1_3 = (Class57_Sub1) arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[BILclient!tn;Z)Lclient!w;")
	public final Interface27 method4422(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class339 arg3, @OriginalArg(5) boolean arg4) {
		return this.method4365(arg1, arg3, arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "(Z)V")
	public final void method4423() {
		if (this.aClass198Array3[this.anInt5239] != Static378.aClass198_2) {
			this.aClass198Array3[this.anInt5239] = Static378.aClass198_2;
			this.aClass254_Sub2Array3[this.anInt5239].method7357();
			this.method4482();
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)I")
	@Override
	public final int method6885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!oha;)V")
	@Override
	public final void method6891(@OriginalArg(0) Class254 arg0) {
		this.aClass254_Sub2_16 = (Class254_Sub2) arg0;
		this.aClass254_Sub2_18.method7356(this.aClass254_Sub2_16);
		this.aClass254_Sub2_18.method6230();
		this.aClass254_Sub2_19.method6227(this.aClass254_Sub2_18);
		this.aClass254_Sub2_17.method6227(this.aClass254_Sub2_16);
		if (this.aClass173_4.method4244()) {
			this.method4442();
		}
	}

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "()Z")
	@Override
	public final boolean method6927() {
		return this.aBoolean447;
	}

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "()Z")
	@Override
	public final boolean method6953() {
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public final Class5_Sub14 method6954(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub14_Sub2 local8 = new Class5_Sub14_Sub2(arg0);
		this.aClass114_29.method2807(local8);
		return local8;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIF)Lclient!gu;")
	@Override
	public final Class5_Sub18 method6919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub18_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ds;ILclient!tn;)Z")
	public abstract boolean method4424(@OriginalArg(0) Class89 arg0, @OriginalArg(2) Class339 arg1);

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "()Z")
	@Override
	public final boolean method6947() {
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!wq;I)V")
	@Override
	public final void method6897(@OriginalArg(0) Class392 arg0, @OriginalArg(1) int arg1) {
		this.aClass308_3.method7421(arg1, arg0, this);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!sfa;)V")
	public final void method4426(@OriginalArg(1) Interface25 arg0) {
		if (arg0 == this.anInterface25Array3[this.anInt5239]) {
			return;
		}
		this.anInterface25Array3[this.anInt5239] = arg0;
		if (arg0 == null) {
			this.method4465();
		} else {
			arg0.method7703();
		}
		this.anInt5255 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII)Lclient!tea;")
	@Override
	public final Class57 method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class57_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BILclient!cq;)V")
	public abstract void method4427(@OriginalArg(1) int arg0, @OriginalArg(2) Interface3 arg1);

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "(B)V")
	protected abstract void method4428();

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "(I)Lclient!oga;")
	public final Class254_Sub2 method4429() {
		return this.aClass254_Sub2Array3[this.anInt5239];
	}

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "(B)V")
	protected void method4430() {
		this.method4449();
	}

	@OriginalMember(owner = "client!gd", name = "O", descriptor = "(I)V")
	protected final void method4431() {
		@Pc(9) Enumeration local9 = this.aHashtable6.keys();
		while (local9.hasMoreElements()) {
			@Pc(20) Canvas local20 = (Canvas) local9.nextElement();
			this.method4386(this.aHashtable6.get(local20), local20);
		}
		this.anInterface3_11.method8235();
		this.anInterface3_12.method8235();
		this.anInterface3_13.method8235();
		this.aClass153_Sub1_29.method3720();
		this.aClass153_Sub1_23.method3720();
		this.aClass153_Sub1_27.method3720();
		this.aClass153_Sub1_25.method3720();
		this.aClass153_Sub1_21.method3720();
		this.aClass308_3.method7424();
		this.anInterface12_3.method8235();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLclient!jf;Lclient!jf;)V")
	public final void method4432(@OriginalArg(1) Class178 arg0, @OriginalArg(2) Class178 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg0 != this.aClass178Array5[this.anInt5239]) {
			this.aClass178Array5[this.anInt5239] = arg0;
			this.method4452();
			local5 = true;
		}
		if (this.aClass178Array6[this.anInt5239] != arg1) {
			this.aClass178Array6[this.anInt5239] = arg1;
			this.method4349();
			local5 = true;
		}
		if (local5) {
			this.anInt5255 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(ZI)V")
	public final void method4433(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean440 != arg0) {
			this.aBoolean440 = arg0;
			this.method4454();
			this.anInt5255 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gd", name = "P", descriptor = "(I)V")
	public final void method4434() {
		this.aBoolean427 = false;
		this.method4378();
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(ZI)V")
	public abstract void method4436(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "(I)V")
	protected abstract void method4437();

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "(B)V")
	protected void method4438() {
		this.anInt5272 = this.anInt5235;
		this.anInt5235 = 0;
	}

	@OriginalMember(owner = "client!gd", name = "R", descriptor = "(I)Lclient!oga;")
	public final Class254_Sub2 method4439() {
		return this.aClass254_Sub2Array3[this.anInt5239];
	}

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "(I)V")
	protected abstract void method4440();

	@OriginalMember(owner = "client!gd", name = "T", descriptor = "(I)F")
	protected abstract float method4441();

	@OriginalMember(owner = "client!gd", name = "U", descriptor = "(I)V")
	private void method4442() {
		this.aBoolean438 = false;
		if (this.aClass18_3 != null) {
			this.aClass18_3.method8999();
		}
		this.method4351();
	}

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "(B)V")
	public final void method4443() {
		this.aClass254_Sub2_15.method7357();
		this.aBoolean427 = true;
		this.method4378();
	}

	@OriginalMember(owner = "client!gd", name = "V", descriptor = "(I)V")
	protected abstract void method4444();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6941(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas10) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.method4386(this.aHashtable6.get(arg0), arg0);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "()I")
	@Override
	public final int method6892() {
		return this.anInt5241 - 2;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(BZ)V")
	public final void method4445(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean439) {
			this.aBoolean439 = arg0;
			this.method4355();
			this.anInt5255 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIZB)V")
	public final void method4446(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 != this.anInt5256 || this.aBoolean437 != this.aBoolean443) {
			@Pc(24) Interface27 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean443 ? 3 : 0;
			if (arg1 < 0) {
				this.method4423();
			} else {
				local24 = this.aClass385_3.method8804(arg1);
				@Pc(54) Class136 local54 = super.anInterface4_11.method358(arg1);
				if (local54.aByte52 == 0 && local54.aByte53 == 0) {
					this.method4423();
				} else {
					@Pc(70) int local70 = local54.aBoolean312 ? 64 : 128;
					@Pc(74) int local74 = local70 * 50;
					@Pc(80) Class254_Sub2 local80 = this.method4439();
					local80.method6244((float) (this.anInt5266 % local74 * local54.aByte52) / (float) local74, 0.0F, (float) (this.anInt5266 % local74 * local54.aByte53) / (float) local74);
					this.method4411(Static102.aClass198_1);
				}
				if (!this.aBoolean443) {
					local28 = local54.aByte57;
					local30 = local54.anInt3864;
					local37 = local54.aByte56;
				}
				local26 = local54.anInt3868;
			}
			this.method4479(local30, local28, arg0, local37, arg2);
			if (this.aClass18_3 == null) {
				this.method4426(local24);
				this.method4405(local26);
			} else {
				this.aClass18_3.method9006(local26, local24);
			}
			this.anInt5256 = arg1;
			this.aBoolean437 = this.aBoolean443;
		}
		this.anInt5255 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!co;I)V")
	public abstract void method4447(@OriginalArg(0) Class69 arg0);

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "(B)V")
	protected abstract void method4448();

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method6895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method4441();
		this.method4402();
		this.method4455(arg4);
		this.method4400(Static413.aClass64_3, 0);
		this.method4369(0, Static413.aClass64_3);
		this.method4419(arg5);
		this.aClass254_Sub2_15.method6237((float) (arg3 - 1), 1.0F, (float) (arg2 - 1));
		this.aClass254_Sub2_15.method6243(0.0F, (float) arg0 - local7, -local7 + (float) arg1);
		this.method4434();
		this.method4436(false);
		this.method4356(4, Static106.aClass155_2);
		this.method4436(true);
		this.method4369(0, Static536.aClass64_4);
		this.method4400(Static536.aClass64_4, 0);
	}

	@OriginalMember(owner = "client!gd", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5247;
		arg0[3] = this.anInt5236;
		arg0[1] = this.anInt5261;
		arg0[2] = this.anInt5264;
	}

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "()V")
	@Override
	protected void method6904() {
		if (this.aBoolean432) {
			return;
		}
		for (@Pc(9) Class5 local9 = this.aClass114_29.method2805(); local9 != null; local9 = this.aClass114_29.method2814()) {
			((Class5_Sub14_Sub2) local9).method6439();
		}
		@Pc(26) Enumeration local26 = this.aHashtable6.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method4386(this.aHashtable6.get(local32), local32);
		}
		Static358.method5409(true, false);
		this.aNativeInterface3.release();
		this.aBoolean432 = true;
	}

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass254_Sub2_16.method6224((float) arg0, (float) arg2, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt5258 * this.aClass254_Sub2_16.method6225((float) arg2, (float) arg0, (float) arg1) / local14);
			local58 = (int) ((float) this.anInt5259 * this.aClass254_Sub2_16.method6238((float) arg2, (float) arg0, (float) arg1) / local14);
		} else {
			local58 = this.anInt5262;
			local40 = this.anInt5238;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat105);
		arg3[1] = (int) ((float) local58 - this.aFloat110);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "(B)V")
	private void method4449() {
		this.method4393();
		this.method4448();
		this.method4437();
		this.method4438();
		this.method4389();
		this.method4383();
		this.method4407();
		this.method4454();
		this.method4355();
		this.method4440();
		this.method4375();
		this.method4416();
		this.method4444();
		this.method4370();
		for (@Pc(66) int local66 = this.anInt5257 - 1; local66 >= 0; local66--) {
			this.method4358(local66);
			this.method4452();
			this.method4349();
			this.method4423();
		}
		this.method4467();
		this.method4368();
		this.method4475();
		this.method4428();
		this.method4351();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[Lclient!gu;)V")
	@Override
	public final void method6926(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub18[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass5_Sub18Array4[local3] = arg1[local3];
		}
		this.anInt5235 = arg0;
		if (this.aClass173_4.method4244()) {
			this.method4438();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!hu;ZII)V")
	public abstract void method4450(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)V")
	public final void method4451(@OriginalArg(1) byte arg0) {
		this.method4455(arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16);
	}

	@OriginalMember(owner = "client!gd", name = "W", descriptor = "(I)V")
	protected abstract void method4452();

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "(B)V")
	private void method4453() {
		if (this.aBoolean435) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray52;
		@Pc(21) float local21 = (float) (-this.anInt5238 * this.anInt5242) / (float) this.anInt5258;
		@Pc(35) float local35 = (float) (this.anInt5242 * (this.anInt5222 - this.anInt5238)) / (float) this.anInt5258;
		@Pc(46) float local46 = (float) (this.anInt5262 * this.anInt5242) / (float) this.anInt5259;
		@Pc(61) float local61 = (float) ((this.anInt5262 - this.anInt5126) * this.anInt5242) / (float) this.anInt5259;
		if (local35 == local21 || local61 == local46) {
			local9[9] = 0.0F;
			local9[2] = 0.0F;
			local9[5] = 1.0F;
			local9[7] = 0.0F;
			local9[12] = 0.0F;
			local9[10] = 1.0F;
			local9[1] = 0.0F;
			local9[14] = 0.0F;
			local9[13] = 0.0F;
			local9[15] = 1.0F;
			local9[4] = 0.0F;
			local9[8] = 0.0F;
			local9[3] = 0.0F;
			local9[11] = 0.0F;
			local9[6] = 0.0F;
			local9[0] = 1.0F;
		} else {
			@Pc(141) float local141 = (float) this.anInt5242 * 2.0F;
			local9[9] = (local61 + local46) / (-local61 + local46);
			local9[12] = 0.0F;
			local9[4] = 0.0F;
			local9[13] = 0.0F;
			local9[14] = this.aFloat111 = (float) (this.anInt5260 * this.anInt5242) / (float) (this.anInt5242 - this.anInt5260);
			local9[7] = 0.0F;
			local9[3] = 0.0F;
			local9[11] = -1.0F;
			local9[10] = this.aFloat108 = (float) this.anInt5260 / (float) (this.anInt5242 - this.anInt5260);
			local9[15] = 0.0F;
			local9[1] = 0.0F;
			local9[5] = local141 / (local46 - local61);
			local9[0] = local141 / (local35 - local21);
			local9[8] = (local21 + local35) / (-local21 + local35);
			local9[2] = 0.0F;
			local9[6] = 0.0F;
		}
		this.method4395();
		this.aBoolean435 = true;
	}

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "(B)V")
	protected abstract void method4454();

	@OriginalMember(owner = "client!gd", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean443) {
			throw new RuntimeException("");
		}
		this.anInt5248 = arg1;
		this.anInt5268 = arg3;
		this.anInt5240 = arg0;
		this.anInt5251 = arg2;
		if (this.aBoolean437) {
			this.aClass18Array3[3].method9001();
			this.aClass18Array3[3].method9010();
		}
	}

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "(II)V")
	public final void method4455(@OriginalArg(0) int arg0) {
		if (this.anInt5273 != arg0) {
			this.anInt5273 = arg0;
			this.method4467();
		}
	}

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "(I)V")
	private void method4456() {
		if (Static91.aClass173_3 == this.aClass173_4) {
			return;
		}
		@Pc(6) Class173 local6 = this.aClass173_4;
		this.aClass173_4 = Static91.aClass173_3;
		if (!local6.method4244()) {
			this.method4442();
		}
		this.method4363();
		this.aFloatArray46 = this.aFloatArray49;
		this.method4466();
		this.anInt5255 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;B)Lclient!jaclib/memory/Stream;")
	public final Stream method4457(@OriginalArg(0) Buffer arg0) {
		this.aStream4.a(arg0);
		return this.aStream4;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(BZ)V")
	public final void method4458(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean431 != arg0) {
			this.aBoolean431 = arg0;
			this.method4437();
		}
	}

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "(Z)V")
	private void method4459() {
		if (this.aBoolean444) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray44;
		if (this.anInt5222 == 0 || this.anInt5126 == 0) {
			local5[4] = 0.0F;
			local5[12] = 0.0F;
			local5[15] = 1.0F;
			local5[0] = 1.0F;
			local5[5] = 1.0F;
			local5[14] = 0.0F;
			local5[13] = 0.0F;
			local5[7] = 0.0F;
			local5[10] = 1.0F;
			local5[1] = 0.0F;
			local5[11] = 0.0F;
			local5[8] = 0.0F;
			local5[3] = 0.0F;
			local5[2] = 0.0F;
			local5[9] = 0.0F;
			local5[6] = 0.0F;
		} else {
			local5[10] = 0.5F;
			local5[13] = 1.0F;
			local5[9] = 0.0F;
			local5[15] = 1.0F;
			local5[2] = 0.0F;
			local5[14] = 0.5F;
			local5[12] = -1.0F;
			local5[1] = 0.0F;
			local5[0] = 2.0F / (float) this.anInt5222;
			local5[6] = 0.0F;
			local5[11] = 0.0F;
			local5[3] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt5126;
			local5[4] = 0.0F;
			local5[7] = 0.0F;
			local5[8] = 0.0F;
		}
		this.aBoolean444 = true;
	}

	@OriginalMember(owner = "client!gd", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4402();
		this.method4455(arg3);
		this.method4400(Static413.aClass64_3, 0);
		this.method4369(0, Static413.aClass64_3);
		this.method4419(arg4);
		this.aClass254_Sub2_15.method6237((float) arg2, 1.0F, (float) arg2);
		this.aClass254_Sub2_15.method7358(arg0, arg1, 0);
		this.method4434();
		this.method4436(false);
		this.method4427(0, this.anInterface3_13);
		this.method4447(this.aClass69_20);
		this.method4450(Static504.aClass155_6, 0, 256);
		this.method4436(true);
		this.method4369(0, Static536.aClass64_4);
		this.method4400(Static536.aClass64_4, 0);
	}

	@OriginalMember(owner = "client!gd", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt5270 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt5270++;
		}
		this.anInt5245 = 0x1 << this.anInt5270;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!oga;I)V")
	public final void method4460(@OriginalArg(0) Class254_Sub2 arg0) {
		this.aClass254_Sub2_15.method7356(arg0);
		this.aBoolean427 = false;
		this.method4378();
	}

	@OriginalMember(owner = "client!gd", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5238 = arg0;
		this.anInt5259 = arg3;
		this.anInt5262 = arg1;
		this.anInt5258 = arg2;
		this.method4478();
		this.method4461();
		this.method4408();
		this.method4346();
	}

	@OriginalMember(owner = "client!gd", name = "Z", descriptor = "(I)V")
	private void method4461() {
		this.aBoolean435 = false;
		this.method4453();
		if (this.aClass173_4 == Static666.aClass173_7) {
			this.method4466();
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(IZ)V")
	public final void method4462(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean430) {
			this.aBoolean430 = arg0;
			this.method4440();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[Lclient!ls;)Lclient!co;")
	public abstract Class69 method4463(@OriginalArg(1) Class219[] arg0);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIIB[III)Lclient!w;")
	public abstract Interface27 method4464(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "(Z)V")
	protected abstract void method4465();

	@OriginalMember(owner = "client!gd", name = "ab", descriptor = "(I)V")
	private void method4466() {
		this.method4475();
		if (this.aClass18_3 != null) {
			this.aClass18_3.method8998();
		}
	}

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "(I)V")
	@Override
	public final void method6958(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "(Z)V")
	protected abstract void method4467();

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	@Override
	public final void method6913() {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method6935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "(I)Lclient!oga;")
	public final Class254_Sub2 method4468() {
		return this.aClass254_Sub2_18;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class109 method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class109_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6914(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "cb", descriptor = "(I)V")
	private void method4470() {
		this.anInterface3_13 = this.method4374(false);
		this.anInterface3_13.method8244(3096, 12);
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			@Pc(25) Buffer local25 = this.anInterface3_13.method8245();
			if (local25 != null) {
				@Pc(32) Stream local32 = this.method4457(local25);
				local32.a(0.0F);
				local32.a(0.0F);
				local32.a(0.0F);
				for (@Pc(43) int local43 = 0; local43 <= 256; local43++) {
					@Pc(53) double local53 = (double) (local43 * 2) * 3.141592653589793D / 256.0D;
					@Pc(57) float local57 = (float) Math.cos(local53);
					@Pc(61) float local61 = (float) Math.sin(local53);
					if (Stream.c()) {
						local32.a(local61);
						local32.a(local57);
						local32.a(0.0F);
					} else {
						local32.b(local61);
						local32.b(local57);
						local32.b(0.0F);
					}
				}
				local32.a();
				if (this.anInterface3_13.method8243()) {
					break;
				}
			}
		}
		this.aClass69_20 = this.method4463(new Class219[] { new Class219(Static456.aClass281_1) });
	}

	@OriginalMember(owner = "client!gd", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt5222 - 1 && arg1 <= 0 && this.anInt5126 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt5236 = arg3 > this.anInt5222 ? 0 : arg3;
		this.anInt5264 = this.anInt5222 >= arg2 ? arg2 : 0;
		this.anInt5261 = arg1 < 0 ? 0 : arg1;
		this.anInt5247 = arg0 >= 0 ? arg0 : 0;
		if (!this.aBoolean448) {
			this.aBoolean448 = true;
			this.method4403();
		}
		this.method4409();
		this.method4346();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		@Pc(17) float local17 = 0.0F;
		@Pc(19) float local19 = 1.0F;
		if (local9 != 0.0F || local15 != 0.0F) {
			local19 = (float) Math.sqrt((double) (local9 * local9 + local15 * local15));
			local17 = (float) Math.atan2((double) local15, (double) local9);
		}
		this.method4402();
		this.method4455(arg4);
		this.method4400(Static413.aClass64_3, 0);
		this.method4369(0, Static413.aClass64_3);
		this.method4419(0);
		this.aClass254_Sub2_15.method6237((float) arg5, 1.0F, local19);
		this.aClass254_Sub2_15.method7358(0, -arg5 / 2, 0);
		this.aClass254_Sub2_15.method7347((int) ((double) local17 * 2607.5945876176133D) & 0x3FFF);
		this.aClass254_Sub2_15.method7358(arg0, arg1, 0);
		this.method4434();
		this.method4436(false);
		this.method4394();
		this.method4436(true);
		this.method4369(0, Static536.aClass64_4);
		this.method4400(Static536.aClass64_4, 0);
	}

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "(I)Lclient!oga;")
	public final Class254_Sub2 method4471() {
		return this.aClass254_Sub2_15;
	}

	@OriginalMember(owner = "client!gd", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt5260;
	}

	@OriginalMember(owner = "client!gd", name = "eb", descriptor = "(I)Lclient!oga;")
	public final Class254_Sub2 method4472() {
		return this.aClass254_Sub2_19;
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5242 == arg0 && arg1 == this.anInt5260) {
			return;
		}
		this.anInt5260 = arg1;
		this.anInt5242 = arg0;
		this.method4461();
		this.method4478();
		this.method4480();
	}

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method4473(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZI[FIILclient!tn;I)Lclient!w;")
	protected abstract Interface27 method4474(@OriginalArg(1) boolean arg0, @OriginalArg(3) float[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class339 arg4);

	@OriginalMember(owner = "client!gd", name = "fb", descriptor = "(I)V")
	protected abstract void method4475();

	@OriginalMember(owner = "client!gd", name = "gb", descriptor = "(I)I")
	public final int method4476() {
		return this.anInt5240;
	}

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "()V")
	@Override
	public final void method6963() {
		if (this.aClass385_3 != null) {
			this.aClass385_3.method8807();
		}
	}

	@OriginalMember(owner = "client!gd", name = "hb", descriptor = "(I)V")
	private void method4477() {
		this.aBoolean444 = false;
		if (this.aClass173_4 == Static531.aClass173_6) {
			this.method4459();
			this.method4466();
		}
	}

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "(B)V")
	private void method4478() {
		this.aBoolean428 = false;
		this.method4363();
		if (this.aClass173_4 == Static91.aClass173_3) {
			this.method4466();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZBIZ)V")
	private void method4479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(8) boolean local8 = arg2 & this.method6889();
		if (!local8 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
			arg3 = 2;
			arg0 = 1;
			arg1 = 0;
		}
		if (arg3 != 0 && arg4) {
			arg3 |= Integer.MIN_VALUE;
		}
		if (arg3 != this.anInt5252) {
			if (this.anInt5252 != 0) {
				this.aClass18Array3[this.anInt5252 & Integer.MAX_VALUE].method9003();
			}
			if (arg3 == 0) {
				this.aClass18_3 = null;
			} else {
				this.aClass18_3 = this.aClass18Array3[Integer.MAX_VALUE & arg3];
				this.aClass18_3.method9011(arg4);
				this.aClass18_3.method9009(arg4);
				this.aClass18_3.method9012(arg0, arg1);
			}
			this.anInt5252 = arg3;
			this.anInt5269 = arg1;
			this.anInt5254 = arg0;
		} else if (this.anInt5252 != 0) {
			this.aClass18Array3[this.anInt5252 & Integer.MAX_VALUE].method9009(arg4);
			if (arg1 != this.anInt5269 || this.anInt5254 != arg0) {
				this.aClass18Array3[this.anInt5252 & Integer.MAX_VALUE].method9012(arg0, arg1);
				this.anInt5254 = arg0;
				this.anInt5269 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "()Z")
	@Override
	public final boolean method6896() {
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "(Z)V")
	private void method4480() {
		if (this.aClass18_3 != null) {
			this.aClass18_3.method9010();
		}
		this.method4375();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZBI)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method4481(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap5.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!gd", name = "ib", descriptor = "(I)V")
	private void method4482() {
		this.method4381();
		if (this.aClass18_3 != null) {
			this.aClass18_3.method9002();
		}
	}
}
