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

@OriginalClass("client!rv")
public abstract class Class126_Sub2 extends Class126 {

	@OriginalMember(owner = "client!rv", name = "ob", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!rv", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!rv", name = "vc", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!rv", name = "yc", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!rv", name = "Ld", descriptor = "Lclient!wda;")
	protected Class373 aClass373_5;

	@OriginalMember(owner = "client!rv", name = "Xd", descriptor = "I")
	protected int anInt6244;

	@OriginalMember(owner = "client!rv", name = "Yd", descriptor = "I")
	public int anInt6245;

	@OriginalMember(owner = "client!rv", name = "be", descriptor = "I")
	public int anInt6247;

	@OriginalMember(owner = "client!rv", name = "se", descriptor = "F")
	public float aFloat117;

	@OriginalMember(owner = "client!rv", name = "xe", descriptor = "[Lclient!tn;")
	protected Class5_Sub27[] aClass5_Sub27Array4;

	@OriginalMember(owner = "client!rv", name = "Ae", descriptor = "F")
	public float aFloat118;

	@OriginalMember(owner = "client!rv", name = "Be", descriptor = "[Lclient!jaa;")
	protected Class117_Sub2[] aClass117_Sub2Array3;

	@OriginalMember(owner = "client!rv", name = "De", descriptor = "F")
	public float aFloat120;

	@OriginalMember(owner = "client!rv", name = "Ee", descriptor = "Lclient!ul;")
	private Class108 aClass108_3;

	@OriginalMember(owner = "client!rv", name = "Ge", descriptor = "I")
	private int anInt6260;

	@OriginalMember(owner = "client!rv", name = "He", descriptor = "F")
	private float aFloat121;

	@OriginalMember(owner = "client!rv", name = "Ie", descriptor = "I")
	public int anInt6261;

	@OriginalMember(owner = "client!rv", name = "Je", descriptor = "Z")
	protected boolean aBoolean507;

	@OriginalMember(owner = "client!rv", name = "Le", descriptor = "[Lclient!aea;")
	protected Class10[] aClass10Array5;

	@OriginalMember(owner = "client!rv", name = "Ne", descriptor = "Z")
	public boolean aBoolean509;

	@OriginalMember(owner = "client!rv", name = "Te", descriptor = "I")
	public int anInt6264;

	@OriginalMember(owner = "client!rv", name = "Ve", descriptor = "I")
	protected int anInt6265;

	@OriginalMember(owner = "client!rv", name = "We", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!rv", name = "Xe", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!rv", name = "Ye", descriptor = "I")
	protected int anInt6266;

	@OriginalMember(owner = "client!rv", name = "lf", descriptor = "I")
	protected int anInt6272;

	@OriginalMember(owner = "client!rv", name = "rf", descriptor = "I")
	public int anInt6276;

	@OriginalMember(owner = "client!rv", name = "tf", descriptor = "Lclient!dj;")
	private Class75 aClass75_3;

	@OriginalMember(owner = "client!rv", name = "uf", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!rv", name = "wf", descriptor = "Lclient!rr;")
	private Class91_Sub2 aClass91_Sub2_3;

	@OriginalMember(owner = "client!rv", name = "xf", descriptor = "[Lclient!cga;")
	protected Class52[] aClass52Array3;

	@OriginalMember(owner = "client!rv", name = "If", descriptor = "I")
	protected int anInt6282;

	@OriginalMember(owner = "client!rv", name = "Jf", descriptor = "I")
	private int anInt6283;

	@OriginalMember(owner = "client!rv", name = "Nf", descriptor = "[Lclient!wc;")
	private Interface27[] anInterface27Array3;

	@OriginalMember(owner = "client!rv", name = "Of", descriptor = "Z")
	public boolean aBoolean520;

	@OriginalMember(owner = "client!rv", name = "Qf", descriptor = "Z")
	protected boolean aBoolean521;

	@OriginalMember(owner = "client!rv", name = "Rf", descriptor = "I")
	public int anInt6284;

	@OriginalMember(owner = "client!rv", name = "Sf", descriptor = "Lclient!wc;")
	public Interface27 anInterface27_3;

	@OriginalMember(owner = "client!rv", name = "Uf", descriptor = "Z")
	public boolean aBoolean522;

	@OriginalMember(owner = "client!rv", name = "Xf", descriptor = "F")
	private float aFloat130;

	@OriginalMember(owner = "client!rv", name = "dg", descriptor = "[Lclient!aea;")
	protected Class10[] aClass10Array6;

	@OriginalMember(owner = "client!rv", name = "ig", descriptor = "Lclient!am;")
	private Interface1 anInterface1_12;

	@OriginalMember(owner = "client!rv", name = "jg", descriptor = "Lclient!lj;")
	public Class180_Sub1 aClass180_Sub1_21;

	@OriginalMember(owner = "client!rv", name = "kg", descriptor = "Lclient!lj;")
	public Class180_Sub1 aClass180_Sub1_22;

	@OriginalMember(owner = "client!rv", name = "lg", descriptor = "Lclient!am;")
	private Interface1 anInterface1_13;

	@OriginalMember(owner = "client!rv", name = "mg", descriptor = "Lclient!lj;")
	public Class180_Sub1 aClass180_Sub1_23;

	@OriginalMember(owner = "client!rv", name = "ng", descriptor = "Lclient!lj;")
	public Class180_Sub1 aClass180_Sub1_24;

	@OriginalMember(owner = "client!rv", name = "pg", descriptor = "Lclient!lj;")
	public Class180_Sub1 aClass180_Sub1_25;

	@OriginalMember(owner = "client!rv", name = "qg", descriptor = "Lclient!lj;")
	public Class180_Sub1 aClass180_Sub1_26;

	@OriginalMember(owner = "client!rv", name = "rg", descriptor = "Lclient!ld;")
	private Class203 aClass203_16;

	@OriginalMember(owner = "client!rv", name = "sg", descriptor = "Lclient!ld;")
	public Class203 aClass203_17;

	@OriginalMember(owner = "client!rv", name = "tg", descriptor = "Lclient!lj;")
	public Class180_Sub1 aClass180_Sub1_27;

	@OriginalMember(owner = "client!rv", name = "ug", descriptor = "Lclient!ld;")
	public Class203 aClass203_18;

	@OriginalMember(owner = "client!rv", name = "vg", descriptor = "Lclient!lj;")
	public Class180_Sub1 aClass180_Sub1_28;

	@OriginalMember(owner = "client!rv", name = "wg", descriptor = "Lclient!ld;")
	public Class203 aClass203_19;

	@OriginalMember(owner = "client!rv", name = "xg", descriptor = "Lclient!ld;")
	public Class203 aClass203_20;

	@OriginalMember(owner = "client!rv", name = "yg", descriptor = "Lclient!ld;")
	private Class203 aClass203_21;

	@OriginalMember(owner = "client!rv", name = "zg", descriptor = "Lclient!ld;")
	private Class203 aClass203_22;

	@OriginalMember(owner = "client!rv", name = "Ag", descriptor = "Lclient!am;")
	private Interface1 anInterface1_14;

	@OriginalMember(owner = "client!rv", name = "Bg", descriptor = "Lclient!rh;")
	private Interface21 anInterface21_8;

	@OriginalMember(owner = "client!rv", name = "Cg", descriptor = "Lclient!lj;")
	public Class180_Sub1 aClass180_Sub1_29;

	@OriginalMember(owner = "client!rv", name = "Dg", descriptor = "Lclient!lj;")
	public Class180_Sub1 aClass180_Sub1_30;

	@OriginalMember(owner = "client!rv", name = "Eg", descriptor = "I")
	private int anInt6291;

	@OriginalMember(owner = "client!rv", name = "Fg", descriptor = "Z")
	protected boolean aBoolean524;

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "Lclient!ro;")
	private final Class306 aClass306_30 = new Class306();

	@OriginalMember(owner = "client!rv", name = "Wd", descriptor = "Z")
	protected boolean aBoolean503 = true;

	@OriginalMember(owner = "client!rv", name = "Zd", descriptor = "Lclient!jaa;")
	protected final Class117_Sub2 aClass117_Sub2_15 = new Class117_Sub2();

	@OriginalMember(owner = "client!rv", name = "fe", descriptor = "Lclient!jaa;")
	public Class117_Sub2 aClass117_Sub2_16 = new Class117_Sub2();

	@OriginalMember(owner = "client!rv", name = "ge", descriptor = "Lclient!jaa;")
	public final Class117_Sub2 aClass117_Sub2_17 = new Class117_Sub2();

	@OriginalMember(owner = "client!rv", name = "he", descriptor = "Lclient!jaa;")
	protected final Class117_Sub2 aClass117_Sub2_18 = new Class117_Sub2();

	@OriginalMember(owner = "client!rv", name = "ie", descriptor = "Lclient!jaa;")
	private final Class117_Sub2 aClass117_Sub2_19 = new Class117_Sub2();

	@OriginalMember(owner = "client!rv", name = "je", descriptor = "Lclient!jaa;")
	private final Class117_Sub2 aClass117_Sub2_20 = new Class117_Sub2();

	@OriginalMember(owner = "client!rv", name = "ke", descriptor = "I")
	private int anInt6251 = 0;

	@OriginalMember(owner = "client!rv", name = "pe", descriptor = "Z")
	private boolean aBoolean504 = false;

	@OriginalMember(owner = "client!rv", name = "qe", descriptor = "I")
	public int anInt6255 = -1;

	@OriginalMember(owner = "client!rv", name = "we", descriptor = "I")
	protected int anInt6256 = 3584;

	@OriginalMember(owner = "client!rv", name = "Fe", descriptor = "I")
	public int anInt6259 = 50;

	@OriginalMember(owner = "client!rv", name = "ze", descriptor = "I")
	protected int anInt6258 = 0;

	@OriginalMember(owner = "client!rv", name = "me", descriptor = "I")
	protected int anInt6253 = 0;

	@OriginalMember(owner = "client!rv", name = "ef", descriptor = "Z")
	protected boolean aBoolean512 = true;

	@OriginalMember(owner = "client!rv", name = "ve", descriptor = "[F")
	private final float[] aFloatArray36 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!rv", name = "Ue", descriptor = "Z")
	protected boolean aBoolean511 = true;

	@OriginalMember(owner = "client!rv", name = "df", descriptor = "F")
	public float aFloat125 = 3584.0F;

	@OriginalMember(owner = "client!rv", name = "ne", descriptor = "[F")
	private final float[] aFloatArray35 = new float[16];

	@OriginalMember(owner = "client!rv", name = "ue", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "client!rv", name = "te", descriptor = "Z")
	private boolean aBoolean505 = false;

	@OriginalMember(owner = "client!rv", name = "Me", descriptor = "I")
	private int anInt6262 = 1;

	@OriginalMember(owner = "client!rv", name = "Qe", descriptor = "I")
	private int anInt6263 = -1;

	@OriginalMember(owner = "client!rv", name = "Ce", descriptor = "F")
	public float aFloat119 = 1.0F;

	@OriginalMember(owner = "client!rv", name = "Se", descriptor = "Z")
	protected boolean aBoolean510 = true;

	@OriginalMember(owner = "client!rv", name = "vf", descriptor = "I")
	public int anInt6277 = -1;

	@OriginalMember(owner = "client!rv", name = "ff", descriptor = "I")
	private int anInt6269 = 0;

	@OriginalMember(owner = "client!rv", name = "Ke", descriptor = "Z")
	private boolean aBoolean508 = false;

	@OriginalMember(owner = "client!rv", name = "Oe", descriptor = "[F")
	public final float[] aFloatArray37 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!rv", name = "le", descriptor = "I")
	public int anInt6252 = 128;

	@OriginalMember(owner = "client!rv", name = "zf", descriptor = "[F")
	private final float[] aFloatArray39 = new float[16];

	@OriginalMember(owner = "client!rv", name = "Re", descriptor = "F")
	public float aFloat122 = 1.0F;

	@OriginalMember(owner = "client!rv", name = "kf", descriptor = "[Lclient!ul;")
	private final Class108[] aClass108Array3 = new Class108[10];

	@OriginalMember(owner = "client!rv", name = "pf", descriptor = "I")
	protected int anInt6275 = 0;

	@OriginalMember(owner = "client!rv", name = "gf", descriptor = "I")
	private int anInt6270 = 0;

	@OriginalMember(owner = "client!rv", name = "Hf", descriptor = "Z")
	protected boolean aBoolean518 = true;

	@OriginalMember(owner = "client!rv", name = "Cf", descriptor = "Z")
	private boolean aBoolean516 = false;

	@OriginalMember(owner = "client!rv", name = "Ef", descriptor = "I")
	public int anInt6280 = 0;

	@OriginalMember(owner = "client!rv", name = "Df", descriptor = "Z")
	protected boolean aBoolean517 = false;

	@OriginalMember(owner = "client!rv", name = "of", descriptor = "I")
	protected int anInt6274 = 0;

	@OriginalMember(owner = "client!rv", name = "bf", descriptor = "[F")
	public final float[] bf = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!rv", name = "sf", descriptor = "Z")
	protected boolean aBoolean514 = false;

	@OriginalMember(owner = "client!rv", name = "af", descriptor = "Lclient!bca;")
	protected Class27 aClass27_4 = Static577.aClass27_8;

	@OriginalMember(owner = "client!rv", name = "Gf", descriptor = "I")
	protected final int anInt6281 = 0;

	@OriginalMember(owner = "client!rv", name = "Pe", descriptor = "[F")
	private final float[] aFloatArray38 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!rv", name = "Bf", descriptor = "I")
	private int anInt6279 = 0;

	@OriginalMember(owner = "client!rv", name = "oe", descriptor = "I")
	public int anInt6254 = 3;

	@OriginalMember(owner = "client!rv", name = "Pf", descriptor = "Lclient!cda;")
	protected Class49 aClass49_3 = Static574.aClass49_6;

	@OriginalMember(owner = "client!rv", name = "ye", descriptor = "I")
	public int anInt6257 = 0;

	@OriginalMember(owner = "client!rv", name = "yf", descriptor = "I")
	protected int anInt6278 = 0;

	@OriginalMember(owner = "client!rv", name = "qf", descriptor = "Z")
	protected boolean aBoolean513 = true;

	@OriginalMember(owner = "client!rv", name = "re", descriptor = "F")
	public float aFloat116 = 3584.0F;

	@OriginalMember(owner = "client!rv", name = "Ze", descriptor = "I")
	public int anInt6267 = 8;

	@OriginalMember(owner = "client!rv", name = "cf", descriptor = "I")
	public int anInt6268 = 512;

	@OriginalMember(owner = "client!rv", name = "Wf", descriptor = "I")
	private int anInt6286 = 16777215;

	@OriginalMember(owner = "client!rv", name = "Mf", descriptor = "Z")
	private boolean aBoolean519 = false;

	@OriginalMember(owner = "client!rv", name = "Vf", descriptor = "[F")
	private final float[] aFloatArray42 = new float[16];

	@OriginalMember(owner = "client!rv", name = "Af", descriptor = "Z")
	protected boolean aBoolean515 = false;

	@OriginalMember(owner = "client!rv", name = "Yf", descriptor = "I")
	public int anInt6287 = 512;

	@OriginalMember(owner = "client!rv", name = "Zf", descriptor = "F")
	public float aFloat131 = -1.0F;

	@OriginalMember(owner = "client!rv", name = "mf", descriptor = "F")
	private float aFloat127 = 1.0F;

	@OriginalMember(owner = "client!rv", name = "Lf", descriptor = "[F")
	private final float[] aFloatArray41 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!rv", name = "Tf", descriptor = "I")
	private int anInt6285 = -1;

	@OriginalMember(owner = "client!rv", name = "Kf", descriptor = "[F")
	protected float[] aFloatArray40 = this.aFloatArray41;

	@OriginalMember(owner = "client!rv", name = "hf", descriptor = "I")
	private int anInt6271 = -1;

	@OriginalMember(owner = "client!rv", name = "jf", descriptor = "F")
	public float aFloat126 = 1.0F;

	@OriginalMember(owner = "client!rv", name = "eg", descriptor = "F")
	public float aFloat132 = -1.0F;

	@OriginalMember(owner = "client!rv", name = "fg", descriptor = "I")
	protected final int anInt6289 = 0;

	@OriginalMember(owner = "client!rv", name = "hg", descriptor = "Z")
	protected boolean aBoolean523 = false;

	@OriginalMember(owner = "client!rv", name = "bg", descriptor = "I")
	public int anInt6288 = 0;

	@OriginalMember(owner = "client!rv", name = "Ff", descriptor = "F")
	public float aFloat129 = 1.0F;

	@OriginalMember(owner = "client!rv", name = "ag", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!rv", name = "og", descriptor = "Lclient!jaa;")
	private final Class117_Sub2 aClass117_Sub2_21 = new Class117_Sub2();

	@OriginalMember(owner = "client!rv", name = "tb", descriptor = "Ljava/lang/Object;")
	protected final Object anObject12;

	@OriginalMember(owner = "client!rv", name = "xb", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!rv", name = "sd", descriptor = "Lclient!wu;")
	protected final Class384 aClass384_91;

	@OriginalMember(owner = "client!rv", name = "ib", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas7;

	@OriginalMember(owner = "client!rv", name = "lb", descriptor = "Ljava/awt/Canvas;")
	private Canvas lb;

	@OriginalMember(owner = "client!rv", name = "nf", descriptor = "I")
	protected final int anInt6273;

	@OriginalMember(owner = "client!rv", name = "tc", descriptor = "I")
	private int anInt6168;

	@OriginalMember(owner = "client!rv", name = "bb", descriptor = "I")
	public int anInt6105;

	@OriginalMember(owner = "client!rv", name = "Vc", descriptor = "I")
	private int anInt6193;

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "I")
	public int anInt6075;

	@OriginalMember(owner = "client!rv", name = "gg", descriptor = "I")
	public final int anInt6290;

	@OriginalMember(owner = "client!rv", name = "mb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!rv", name = "cg", descriptor = "Lclient!sb;")
	private final Class310 aClass310_3;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!wu;II)V")
	protected Class126_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) Class384 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anObject13 = this.anObject12 = arg1;
			this.aClass384_91 = arg3;
			this.lb = this.aCanvas7 = arg0;
			this.anInt6273 = arg4;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt6105 = this.anInt6168 = local307.width;
			this.anInt6075 = this.anInt6193 = local307.height;
			this.anInt6290 = arg5;
			Static83.method7206(false, true);
			if (super.anInterface8_10 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt6290);
				this.aClass310_3 = null;
			} else {
				this.aClass310_3 = new Class310(this, super.anInterface8_10);
				this.aNativeInterface3 = new NativeInterface(super.anInterface8_10.method7814(), this.anInt6290);
				for (@Pc(364) int local364 = 0; super.anInterface8_10.method7814() > local364; local364++) {
					@Pc(372) Class321 local372 = super.anInterface8_10.method7813(local364);
					if (local372 != null) {
						this.aNativeInterface3.initTextureMetrics(local364, local372.aByte117, local372.aByte116);
					}
				}
			}
		} catch (@Pc(395) Throwable local395) {
			local395.printStackTrace();
			this.method7044();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZ)V")
	public final void method5440(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean517) {
			this.aBoolean517 = arg0;
			this.method5491();
		}
	}

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "()Z")
	@Override
	public final boolean method7034() {
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(Z)V")
	protected abstract void method5441();

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)V")
	private void method5442() {
		this.aFloat117 = (float) (this.anInt6278 - this.anInt6257);
		this.aFloat118 = (float) (this.anInt6253 - this.anInt6257);
		this.aFloat128 = (float) (this.anInt6275 - this.anInt6288);
		this.aFloat124 = (float) (this.anInt6258 - this.anInt6288);
	}

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "()Z")
	@Override
	public final boolean method7043() {
		return false;
	}

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "()V")
	@Override
	protected void method7024() {
		if (this.aBoolean519) {
			return;
		}
		for (@Pc(9) Class5 local9 = this.aClass306_30.method7313(); local9 != null; local9 = this.aClass306_30.method7301()) {
			((Class5_Sub23_Sub1) local9).method4103();
		}
		@Pc(26) Enumeration local26 = this.aHashtable5.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method5521(local32, this.aHashtable5.get(local32));
		}
		Static83.method7217(false, true);
		this.aNativeInterface3.release();
		this.aBoolean519 = true;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZI)V")
	public final void method5443(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean523) {
			this.aBoolean523 = arg0;
			this.method5491();
			this.anInt6260 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(IZ)Lclient!rh;")
	public abstract Interface21 method5444(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "(I)V")
	public final void method5445() {
		if (this.aClass52Array3[this.anInt6274] != Static583.aClass52_6) {
			this.aClass52Array3[this.anInt6274] = Static583.aClass52_6;
			this.aClass117_Sub2Array3[this.anInt6274].method7251();
			this.method5473();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method5446(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z[F)[F")
	public final float[] method5447(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloatArray40[1];
		arg0[12] = this.aFloatArray40[3];
		arg0[8] = this.aFloatArray40[2];
		arg0[0] = this.aFloatArray40[0];
		arg0[1] = this.aFloatArray40[4];
		arg0[13] = this.aFloatArray40[7];
		arg0[5] = this.aFloatArray40[5];
		arg0[2] = this.aFloatArray40[8];
		arg0[9] = this.aFloatArray40[6];
		arg0[10] = this.aFloatArray40[10];
		arg0[7] = this.aFloatArray40[13];
		arg0[3] = this.aFloatArray40[12];
		arg0[6] = this.aFloatArray40[9];
		arg0[14] = this.aFloatArray40[11];
		arg0[15] = this.aFloatArray40[15];
		arg0[11] = this.aFloatArray40[14];
		return arg0;
	}

	@OriginalMember(owner = "client!rv", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt6286 != arg0;
		if (local15 || arg1 != this.aFloat131 || this.aFloat132 != arg2) {
			this.anInt6286 = arg0;
			this.aFloat132 = arg2;
			this.aFloat131 = arg1;
			if (local15) {
				this.aFloat126 = (float) (this.anInt6286 & 0xFF) / 255.0F;
				this.aFloat129 = (float) (this.anInt6286 & 0xFF00) / 65280.0F;
				this.aFloat122 = (float) (this.anInt6286 & 0xFF0000) / 1.671168E7F;
				this.method5480();
			}
			this.aNativeInterface3.setSunColour(this.aFloat122, this.aFloat129, this.aFloat126, arg1, arg2);
			this.method5517();
		}
		if (this.aFloatArray38[0] != arg3 || this.aFloatArray38[1] != arg4 || arg5 != this.aFloatArray38[2]) {
			this.aFloatArray38[2] = arg5;
			this.aFloatArray38[1] = arg4;
			this.aFloatArray38[0] = arg3;
			this.aFloatArray36[2] = -arg5;
			this.aFloatArray36[1] = -arg4;
			this.aFloatArray36[0] = -arg3;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray37[0] = arg3 * local153;
			this.aFloatArray37[1] = local153 * arg4;
			this.aFloatArray37[2] = local153 * arg5;
			this.bf[1] = -this.aFloatArray37[1];
			this.bf[0] = -this.aFloatArray37[0];
			this.bf[2] = -this.aFloatArray37[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray37[0], this.aFloatArray37[1], this.aFloatArray37[2]);
			this.method5485();
			this.anInt6276 = (int) (arg3 * 256.0F / arg4);
			this.anInt6261 = (int) (arg5 * 256.0F / arg4);
		}
		this.method5565();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class40 method7019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class40_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	protected abstract void method5448(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!wc;I)V")
	public final void method5449(@OriginalArg(0) Interface27 arg0) {
		if (arg0 == this.anInterface27Array3[this.anInt6274]) {
			return;
		}
		this.anInterface27Array3[this.anInt6274] = arg0;
		if (arg0 == null) {
			this.method5552();
		} else {
			arg0.method7610();
		}
		this.anInt6260 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZIILclient!qt;)V")
	protected abstract void method5450(@OriginalArg(1) int arg0, @OriginalArg(3) Class294 arg1);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ur;IIII)Lclient!ka;")
	@Override
	public final Class180 method6982(@OriginalArg(0) Class349 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class180_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIZ)Lclient!hu;")
	@Override
	public final Class44 method6988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class44_Sub3 local11 = new Class44_Sub3(this, arg2, arg3, arg4);
		local11.method5328(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILclient!am;)V")
	public abstract void method5451(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([FIZLclient!qda;II)Lclient!tr;")
	public final Interface25 method5452(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class281 arg3, @OriginalArg(5) int arg4) {
		return this.method5464(arg4, arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!ns;Lclient!qda;)Z")
	public abstract boolean method5453(@OriginalArg(1) Class247 arg0, @OriginalArg(2) Class281 arg1);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!aw;III)V")
	public abstract void method5454(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZB)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method5455(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap4.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!tea;)V")
	@Override
	public final void method7009(@OriginalArg(0) Class91 arg0) {
		this.aClass91_Sub2_3 = (Class91_Sub2) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt6258 = this.anInt6105;
		this.anInt6253 = this.anInt6075;
		this.anInt6278 = 0;
		this.anInt6275 = 0;
		if (this.aBoolean524) {
			this.aBoolean524 = false;
			this.method5546();
		}
		this.method5442();
	}

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "(I)V")
	private void method5456() {
		this.aBoolean506 = false;
		if (this.aClass108_3 != null) {
			this.aClass108_3.method8705();
		}
		this.method5535();
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V")
	protected abstract void method5457();

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BZ[[II)Lclient!np;")
	public abstract Interface18 method5458(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!rv", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat119 != arg0) {
			this.aFloat119 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method5480();
			this.method5565();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method7015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7036(@OriginalArg(0) Canvas arg0) {
		this.lb = null;
		this.anObject13 = null;
		if (arg0 == null || arg0 == this.aCanvas7) {
			this.lb = this.aCanvas7;
			this.anObject13 = this.anObject12;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject13 = this.aHashtable5.get(arg0);
			this.lb = arg0;
		}
		if (this.lb == null || this.anObject13 == null) {
			throw new RuntimeException();
		}
		this.method5448(this.lb, this.anObject13);
		this.method5500();
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)V")
	@Override
	public final void method7007(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "(I)V")
	protected void method5459() {
		this.anInt6282 = this.anInt6265;
		this.anInt6265 = 0;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)V")
	protected abstract void method5460();

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt6259 && this.anInt6256 == arg1) {
			return;
		}
		this.anInt6259 = arg0;
		this.anInt6256 = arg1;
		this.method5562();
		this.method5501();
		this.method5566();
	}

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "(II)Lclient!ul;")
	protected Class108 method5461(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class108_Sub10(this);
		} else if (arg0 == 1) {
			return new Class108_Sub6(this);
		} else if (arg0 == 2) {
			return new Class108_Sub5(this, this.aClass373_5);
		} else if (arg0 == 7) {
			return new Class108_Sub2(this);
		} else {
			return new Class108_Sub3(this);
		}
	}

	@OriginalMember(owner = "client!rv", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt6275) {
			this.anInt6275 = arg0;
			local5 = true;
		}
		if (arg2 < this.anInt6258) {
			this.anInt6258 = arg2;
			local5 = true;
		}
		if (this.anInt6278 < arg1) {
			this.anInt6278 = arg1;
			local5 = true;
		}
		if (this.anInt6253 > arg3) {
			this.anInt6253 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean524) {
			this.aBoolean524 = true;
			this.method5546();
		}
		this.method5568();
		this.method5442();
	}

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "(II)V")
	public final void method5462(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt6262) {
			return;
		}
		@Pc(23) Class27 local23;
		@Pc(21) boolean local21;
		@Pc(19) boolean local19;
		if (arg0 == 1) {
			local19 = true;
			local23 = Static577.aClass27_8;
			local21 = true;
		} else if (arg0 == 2) {
			local19 = false;
			local21 = true;
			local23 = Static569.aClass27_6;
		} else if (arg0 == 128) {
			local21 = true;
			local19 = true;
			local23 = Static572.aClass27_7;
		} else {
			local23 = Static53.aClass27_1;
			local19 = false;
			local21 = false;
		}
		if (local19 != this.aBoolean518) {
			this.aBoolean518 = local19;
			this.method5550();
		}
		if (this.aBoolean512 != local21) {
			this.aBoolean512 = local21;
			this.method5467();
		}
		if (local23 != this.aClass27_4) {
			this.aClass27_4 = local23;
			this.method5558();
		}
		this.anInt6262 = arg0;
		this.anInt6260 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7006() {
		return false;
	}

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "(I)V")
	protected abstract void method5463();

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7057(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas7 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method5521(arg0, this.aHashtable5.get(arg0));
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!rv", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt6247 + this.anInt6245 + this.anInt6244;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)I")
	@Override
	public final int method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!rv", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6991(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!rv", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean511 = arg0;
		this.method5495();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method7023(@OriginalArg(0) Class5_Sub23 arg0) {
		this.aNativeHeap4 = ((Class5_Sub23_Sub1) arg0).aNativeHeap1;
		this.aNativeHeapBuffer8 = this.aNativeHeap4.a(32768, false);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZLclient!qda;IIB[F)Lclient!tr;")
	protected abstract Interface25 method5464(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class281 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) float[] arg4);

	@OriginalMember(owner = "client!rv", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5511();
		this.method5496(arg3);
		this.method5466(0, Static645.aClass294_5);
		this.method5471(Static645.aClass294_5, 0);
		this.method5462(arg4);
		this.aClass117_Sub2_15.method3878((float) arg2, (float) arg2, 1.0F);
		this.aClass117_Sub2_15.method7247(arg0, arg1, 0);
		this.method5468();
		this.method5520(false);
		this.method5451(0, this.anInterface1_12);
		this.method5524(this.aClass203_16);
		this.method5454(Static28.aClass23_1, 256, 0);
		this.method5520(true);
		this.method5471(Static256.aClass294_4, 0);
		this.method5466(0, Static256.aClass294_4);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!jaa;I)V")
	public final void method5465(@OriginalArg(0) Class117_Sub2 arg0) {
		this.aClass117_Sub2_15.method7253(arg0);
		this.aBoolean503 = false;
		this.method5509();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILclient!qt;)V")
	public final void method5466(@OriginalArg(0) int arg0, @OriginalArg(2) Class294 arg1) {
		this.method5537(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(Z)V")
	protected abstract void method5467();

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7048(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "(I)V")
	public final void method5468() {
		this.aBoolean503 = false;
		this.method5509();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([I)V")
	@Override
	public final void method7060(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6105;
		arg0[1] = this.anInt6075;
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(Z)V")
	private void method5469() {
		if (this.aBoolean508) {
			return;
		}
		@Pc(16) float[] local16 = this.aFloatArray42;
		this.aBoolean508 = true;
		if (this.anInt6105 != 0 && this.anInt6075 != 0) {
			local16[11] = 0.0F;
			local16[15] = 1.0F;
			local16[4] = 0.0F;
			local16[14] = 0.5F;
			local16[1] = 0.0F;
			local16[9] = 0.0F;
			local16[13] = 1.0F;
			local16[8] = 0.0F;
			local16[12] = -1.0F;
			local16[2] = 0.0F;
			local16[7] = 0.0F;
			local16[6] = 0.0F;
			local16[0] = 2.0F / (float) this.anInt6105;
			local16[3] = 0.0F;
			local16[5] = -2.0F / (float) this.anInt6075;
			local16[10] = 0.5F;
			return;
		}
		local16[0] = 1.0F;
		local16[2] = 0.0F;
		local16[7] = 0.0F;
		local16[13] = 0.0F;
		local16[1] = 0.0F;
		local16[5] = 1.0F;
		local16[6] = 0.0F;
		local16[9] = 0.0F;
		local16[10] = 1.0F;
		local16[15] = 1.0F;
		local16[14] = 0.0F;
		local16[8] = 0.0F;
		local16[12] = 0.0F;
		local16[3] = 0.0F;
		local16[4] = 0.0F;
		local16[11] = 0.0F;
	}

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "()Z")
	@Override
	public final boolean method7011() {
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BZ)V")
	public final void method5470(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean515 != arg0) {
			this.aBoolean515 = arg0;
			this.method5495();
			this.anInt6260 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!qt;BI)V")
	public final void method5471(@OriginalArg(0) Class294 arg0, @OriginalArg(2) int arg1) {
		this.method5450(arg1, arg0);
	}

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "(I)Lclient!jaa;")
	public final Class117_Sub2 method5472() {
		return this.aClass117_Sub2_15;
	}

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "(I)V")
	private void method5473() {
		this.method5502();
		if (this.aClass108_3 != null) {
			this.aClass108_3.method8698();
		}
	}

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "()I")
	@Override
	public final int method7032() {
		return this.anInt6266 - 2;
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(B)V")
	protected abstract void method5474();

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local10 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local10 * local10 + local16 * local16));
			local18 = (float) Math.atan2((double) local16, (double) local10);
		}
		this.method5511();
		this.method5496(arg4);
		this.method5466(0, Static645.aClass294_5);
		this.method5471(Static645.aClass294_5, 0);
		this.method5462(0);
		this.aClass117_Sub2_15.method3878((float) arg5, local20, 1.0F);
		this.aClass117_Sub2_15.method7247(0, -arg5 / 2, 0);
		this.aClass117_Sub2_15.method7257((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass117_Sub2_15.method7247(arg0, arg1, 0);
		this.method5468();
		this.method5520(false);
		this.method5506();
		this.method5520(true);
		this.method5471(Static256.aClass294_4, 0);
		this.method5466(0, Static256.aClass294_4);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLclient!aea;Lclient!aea;)V")
	public final void method5475(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class10 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg1 != this.aClass10Array5[this.anInt6274]) {
			this.aClass10Array5[this.anInt6274] = arg1;
			this.method5557();
			local5 = true;
		}
		if (this.aClass10Array6[this.anInt6274] != arg0) {
			this.aClass10Array6[this.anInt6274] = arg0;
			this.method5571();
			local5 = true;
		}
		if (local5) {
			this.anInt6260 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[IIZIII)Lclient!tr;")
	public abstract Interface25 method5476(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(B)V")
	private void method5477() {
		this.aFloat116 = (float) this.anInt6256;
	}

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "(I)Lclient!jaa;")
	public final Class117_Sub2 method5478() {
		return this.aClass117_Sub2_19;
	}

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "(I)F")
	protected abstract float method5479();

	@OriginalMember(owner = "client!rv", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt6291;
	}

	@OriginalMember(owner = "client!rv", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass117_Sub2_16.method3864((float) arg0, (float) arg1, (float) arg2);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt6268 * this.aClass117_Sub2_16.method3875((float) arg2, (float) arg1, (float) arg0) / local14);
			local25 = (int) ((float) this.anInt6287 * this.aClass117_Sub2_16.method3858((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local25 = this.anInt6257;
			local28 = this.anInt6288;
		}
		arg3[1] = (int) ((float) local25 - this.aFloat117);
		arg3[0] = (int) ((float) local28 - this.aFloat128);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "(Z)V")
	protected abstract void method5480();

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method6991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		if (local9 == 0.0F && local15 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(40) float local40 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local15 * local15)));
			local9 *= local40;
			local15 *= local40;
		}
		if (!this.method5528((float) arg1, (float) arg0, local15 + (float) arg3, local9 + (float) arg2, 0.0F, 0.0F)) {
			return;
		}
		this.method5511();
		this.method5496(arg4);
		this.method5466(0, Static645.aClass294_5);
		this.method5471(Static645.aClass294_5, 0);
		this.method5462(arg5);
		this.method5523();
		this.method5520(false);
		this.method5507();
		this.method5520(true);
		this.method5471(Static256.aClass294_4, 0);
		this.method5466(0, Static256.aClass294_4);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!jn;Z)Lclient!hu;")
	@Override
	public final Class44 method6994(@OriginalArg(0) Class176 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(135) Class44 local135;
		if (arg0.anInt4437 == 0 || arg0.anInt4438 == 0) {
			local135 = this.method7017(1, 1, new int[1], 1);
		} else {
			@Pc(24) int[] local24 = new int[arg0.anInt4438 * arg0.anInt4437];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(33) int local33;
			@Pc(37) int local37;
			if (arg0.aByteArray41 == null) {
				for (local33 = 0; local33 < arg0.anInt4438; local33++) {
					for (local37 = 0; local37 < arg0.anInt4437; local37++) {
						@Pc(99) int local99 = arg0.anIntArray360[arg0.aByteArray40[local26++] & 0xFF];
						local24[local28++] = local99 == 0 ? 0 : local99 | 0xFF000000;
					}
				}
			} else {
				for (local33 = 0; local33 < arg0.anInt4438; local33++) {
					for (local37 = 0; local37 < arg0.anInt4437; local37++) {
						local24[local28++] = arg0.aByteArray41[local26] << 24 | arg0.anIntArray360[arg0.aByteArray40[local26] & 0xFF];
						local26++;
					}
				}
			}
			local135 = this.method7017(arg0.anInt4438, arg0.anInt4437, local24, arg0.anInt4437);
		}
		local135.method5309(arg0.anInt4434, arg0.anInt4439, arg0.anInt4436, arg0.anInt4435);
		return local135;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)Lclient!rh;")
	public final Interface21 method5481(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface21_8.method7713()) {
			this.anInterface21_8.method5732(arg0);
		}
		return this.anInterface21_8;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZ)Lclient!hu;")
	@Override
	public final Class44 method6996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class44_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "()Z")
	@Override
	public final boolean method7012() {
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZZ)V")
	public final void method5482(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt6271 || this.aBoolean509 != this.aBoolean505) {
			@Pc(12) Interface25 local12 = null;
			@Pc(14) int local14 = 0;
			@Pc(16) byte local16 = 0;
			@Pc(18) int local18 = 0;
			@Pc(25) int local25 = this.aBoolean509 ? 3 : 0;
			if (arg0 < 0) {
				this.method5445();
			} else {
				local12 = this.aClass310_3.method7370(arg0);
				@Pc(47) Class321 local47 = super.anInterface8_10.method7813(arg0);
				if (local47.aByte119 == 0 && local47.aByte118 == 0) {
					this.method5445();
				} else {
					@Pc(68) int local68 = local47.aBoolean729 ? 64 : 128;
					@Pc(72) int local72 = local68 * 50;
					@Pc(76) Class117_Sub2 local76 = this.method5542();
					local76.method3859(0.0F, (float) (this.anInt6264 % local72 * local47.aByte119) / (float) local72, (float) (this.anInt6264 % local72 * local47.aByte118) / (float) local72);
					this.method5504(Static242.aClass52_2);
				}
				local14 = local47.anInt8902;
				if (!this.aBoolean509) {
					local18 = local47.anInt8904;
					local25 = local47.aByte115;
					local16 = local47.aByte120;
				}
			}
			this.method5505(local16, local25, local18, arg2, arg1);
			if (this.aClass108_3 == null) {
				this.method5449(local12);
				this.method5513(local14);
			} else {
				this.aClass108_3.method8709(local12, local14);
			}
			this.aBoolean505 = this.aBoolean509;
			this.anInt6271 = arg0;
		}
		this.anInt6260 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!uj;I)V")
	@Override
	public final void method6986(@OriginalArg(0) Class345 arg0, @OriginalArg(1) int arg1) {
		this.aClass75_3.method1465(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "(I)I")
	public final int method5483() {
		return this.anInt6274;
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(I)V")
	@Override
	public final void method7010(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!aw;I)V")
	private void method5484(@OriginalArg(1) Class23 arg0, @OriginalArg(2) int arg1) {
		this.method5451(0, this.anInterface1_14);
		this.method5524(this.aClass203_22);
		this.method5454(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7016() {
		return this.aClass108Array3[3].method8699();
	}

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "(I)V")
	@Override
	public final void method7049(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "(B)V")
	public abstract void method5485();

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "(I)V")
	private void method5486() {
		if (Static384.aClass49_5 == this.aClass49_3) {
			return;
		}
		@Pc(16) Class49 local16 = this.aClass49_3;
		this.aClass49_3 = Static384.aClass49_5;
		if (local16.method1074()) {
			this.method5456();
		}
		this.method5469();
		this.aFloatArray40 = this.aFloatArray42;
		this.method5554();
		this.anInt6260 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!qda;IILclient!ns;)Lclient!tr;")
	public abstract Interface25 method5487(@OriginalArg(0) int arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class247 arg3);

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "(I)V")
	private void method5488() {
		this.anInterface1_13 = this.method5530(true);
		this.anInterface1_13.method7715(12, 24);
		this.aClass203_21 = this.method5525(new Class212[] { new Class212(Static150.aClass106_1) });
	}

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "(I)V")
	protected abstract void method5489();

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "(Z)V")
	private void method5490() {
		this.aFloatArray35[14] = this.aFloat130;
		this.aFloatArray35[10] = this.aFloat121;
		this.aFloat125 = (this.aFloatArray35[14] - (float) this.anInt6256) / this.aFloatArray35[10];
	}

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "(B)V")
	protected abstract void method5491();

	@OriginalMember(owner = "client!rv", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt6105 - 1 <= arg2 && arg1 <= 0 && arg3 >= this.anInt6075 - 1) {
			this.la();
			return;
		}
		this.anInt6278 = arg1 < 0 ? 0 : arg1;
		this.anInt6275 = arg0 < 0 ? 0 : arg0;
		this.anInt6253 = arg3 > this.anInt6105 ? 0 : arg3;
		this.anInt6258 = this.anInt6105 >= arg2 ? arg2 : 0;
		if (!this.aBoolean524) {
			this.aBoolean524 = true;
			this.method5546();
		}
		this.method5568();
		this.method5442();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([BIILclient!qda;IZ)Lclient!tr;")
	public final Interface25 method5492(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class281 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method5516(arg4, arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt6259;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method7051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) float local12 = (float) -arg0 + (float) arg2;
		@Pc(18) float local18 = (float) arg3 - (float) arg1;
		@Pc(43) float local43;
		if (local12 == 0.0F && local18 == 0.0F) {
			local12 = 1.0F;
		} else {
			local43 = (float) (1.0D / Math.sqrt((double) (local12 * local12 + local18 * local18)));
			local18 *= local43;
			local12 *= local43;
		}
		this.method5511();
		this.method5496(arg4);
		this.method5466(0, Static645.aClass294_5);
		this.method5471(Static645.aClass294_5, 0);
		this.method5462(1);
		this.method5523();
		@Pc(81) int local81 = arg7 % (arg5 + arg6);
		this.method5520(false);
		local43 = local12 * (float) arg5;
		@Pc(95) float local95 = local18 * (float) arg5;
		@Pc(97) float local97 = 0.0F;
		@Pc(99) float local99 = 0.0F;
		@Pc(101) float local101 = local43;
		@Pc(103) float local103 = local95;
		if (arg5 < local81) {
			local99 = (float) (arg5 + arg6 - local81) * local18;
			local97 = (float) (arg5 + arg6 - local81) * local12;
		} else {
			local103 = local18 * (float) (arg5 - local81);
			local101 = (float) (arg5 - local81) * local12;
		}
		@Pc(153) float local153 = (float) arg0 + local97;
		@Pc(158) float local158 = local99 + (float) arg1;
		@Pc(163) float local163 = local12 * (float) arg6;
		@Pc(168) float local168 = (float) arg6 * local18;
		while (true) {
			if (arg0 >= arg2) {
				if (local153 < (float) arg2) {
					break;
				}
				if (local153 + local101 < (float) arg2) {
					local101 = (float) arg2 - local153;
				}
			} else {
				if (local153 > (float) arg2) {
					break;
				}
				if ((float) arg2 < local153 + local101) {
					local101 = (float) arg2 - local153;
				}
			}
			if (arg3 > arg1) {
				if ((float) arg3 < local158) {
					break;
				}
				if ((float) arg3 < local158 + local103) {
					local103 = (float) arg3 - local158;
				}
			} else {
				if (local158 < (float) arg3) {
					break;
				}
				if ((float) arg3 > local158 + local103) {
					local103 = (float) arg3 - local158;
				}
			}
			if (!this.method5528(local158, local153, local103 + local158, local101 + local153, 0.0F, 0.0F)) {
				return;
			}
			local153 += local101 + local163;
			this.method5507();
			local158 += local168 + local103;
			local103 = local95;
			local101 = local43;
		}
		this.method5520(true);
		this.method5471(Static256.aClass294_4, 0);
		this.method5466(0, Static256.aClass294_4);
	}

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "(Z)Lclient!jaa;")
	public final Class117_Sub2 method5493() {
		return this.aClass117_Sub2_18;
	}

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "(I)Lclient!np;")
	public final Interface18 method5494() {
		return this.aClass91_Sub2_3 == null ? null : this.aClass91_Sub2_3.method8163();
	}

	@OriginalMember(owner = "client!rv", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass117_Sub2_16.method3864((float) arg0, (float) arg1, (float) arg2);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt6268 * this.aClass117_Sub2_16.method3875((float) arg2, (float) arg1, (float) arg0) / local14);
			local58 = (int) ((float) this.anInt6287 * this.aClass117_Sub2_16.method3858((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local58 = this.anInt6257;
			local40 = this.anInt6288;
		}
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local58 - this.aFloat117);
		arg3[0] = (int) ((float) local40 - this.aFloat128);
	}

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "(I)V")
	protected abstract void method5495();

	@OriginalMember(owner = "client!rv", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean509 = false;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method7021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method5479();
		this.method5511();
		this.method5496(arg4);
		this.method5466(0, Static645.aClass294_5);
		this.method5471(Static645.aClass294_5, 0);
		this.method5462(arg5);
		this.aClass117_Sub2_15.method3878((float) (arg3 - 1), (float) (arg2 - 1), 1.0F);
		this.aClass117_Sub2_15.method3865((float) arg0 - local7, 0.0F, (float) arg1 - local7);
		this.method5468();
		this.method5520(false);
		this.method5484(Static360.aClass23_6, 4);
		this.method5520(true);
		this.method5471(Static256.aClass294_4, 0);
		this.method5466(0, Static256.aClass294_4);
	}

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "()V")
	@Override
	public final void method7054() {
		if (this.aClass310_3 != null) {
			this.aClass310_3.method7372();
		}
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(IZ)V")
	public final void method5496(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt6272) {
			this.anInt6272 = arg0;
			this.method5474();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(FI)V")
	public final void method5497(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat127) {
			this.aFloat127 = arg0;
			this.method5501();
		}
	}

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "(I)I")
	public final int method5498() {
		return this.anInt6279;
	}

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "(B)Lclient!jaa;")
	public final Class117_Sub2 method5499() {
		return this.aClass117_Sub2Array3[this.anInt6274];
	}

	@OriginalMember(owner = "client!rv", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass117_Sub2_16.aFloat60 * (float) arg2 + (float) arg0 * this.aClass117_Sub2_16.aFloat55 + (float) arg1 * this.aClass117_Sub2_16.aFloat58 + this.aClass117_Sub2_16.aFloat49;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass117_Sub2_16.aFloat60 * (float) arg5 + (float) arg4 * this.aClass117_Sub2_16.aFloat58 + (float) arg3 * this.aClass117_Sub2_16.aFloat55 + this.aClass117_Sub2_16.aFloat49;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt6259 && (float) this.anInt6259 > local63) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt6256 && local63 > (float) this.anInt6256) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt6268 * (this.aClass117_Sub2_16.aFloat56 + this.aClass117_Sub2_16.aFloat50 * (float) arg0 + this.aClass117_Sub2_16.aFloat59 * (float) arg1 + (float) arg2 * this.aClass117_Sub2_16.aFloat54) / local32);
		@Pc(167) int local167 = (int) (((float) arg5 * this.aClass117_Sub2_16.aFloat54 + (float) arg4 * this.aClass117_Sub2_16.aFloat59 + (float) arg3 * this.aClass117_Sub2_16.aFloat50 + this.aClass117_Sub2_16.aFloat56) * (float) this.anInt6268 / local63);
		if ((float) local135 < this.aFloat128 && (float) local167 < this.aFloat128) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat124 && (float) local167 > this.aFloat124) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass117_Sub2_16.aFloat52 + (float) arg1 * this.aClass117_Sub2_16.aFloat57 + (float) arg0 * this.aClass117_Sub2_16.aFloat51 + this.aClass117_Sub2_16.aFloat53 * (float) arg2) * (float) this.anInt6287 / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt6287 * (this.aClass117_Sub2_16.aFloat53 * (float) arg5 + (float) arg4 * this.aClass117_Sub2_16.aFloat57 + this.aClass117_Sub2_16.aFloat51 * (float) arg3 + this.aClass117_Sub2_16.aFloat52) / local63);
		if (this.aFloat117 > (float) local233 && (float) local265 < this.aFloat117) {
			local7 |= 0x4;
		} else if (this.aFloat118 < (float) local233 && (float) local265 > this.aFloat118) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "(I)V")
	private void method5500() {
		if (this.lb == null) {
			this.anInt6168 = this.anInt6193 = 1;
		} else {
			@Pc(14) Dimension local14 = this.lb.getSize();
			this.anInt6168 = local14.width;
			this.anInt6193 = local14.height;
		}
		this.anInt6105 = this.anInt6168;
		this.anInt6075 = this.anInt6193;
		this.method5532();
		this.method5562();
		this.method5501();
		this.method5489();
		this.method5442();
		this.method5518();
		this.la();
	}

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "(Z)V")
	private void method5501() {
		this.aBoolean516 = false;
		this.method5503();
		if (this.aClass49_3 == Static354.aClass49_4) {
			this.method5554();
		}
	}

	@OriginalMember(owner = "client!rv", name = "C", descriptor = "(I)V")
	protected abstract void method5502();

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method7028() {
	}

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "(Z)V")
	private void method5503() {
		if (this.aBoolean516) {
			return;
		}
		@Pc(15) float[] local15 = this.aFloatArray39;
		@Pc(19) float local19 = (float) this.anInt6259;
		@Pc(23) float local23 = (float) this.anInt6256;
		@Pc(35) float local35 = (float) -this.anInt6257 * this.aFloat127 / (float) this.anInt6287;
		@Pc(47) float local47 = this.aFloat127 * (float) -this.anInt6288 / (float) this.anInt6268;
		@Pc(62) float local62 = this.aFloat127 * (float) (this.anInt6105 - this.anInt6288) / (float) this.anInt6268;
		@Pc(76) float local76 = this.aFloat127 * (float) (this.anInt6075 - this.anInt6257) / (float) this.anInt6287;
		if (local62 == local47 || local76 == local35) {
			local15[13] = 0.0F;
			local15[5] = 1.0F;
			local15[11] = 0.0F;
			local15[7] = 0.0F;
			local15[15] = 1.0F;
			local15[1] = 0.0F;
			local15[6] = 0.0F;
			local15[14] = 0.0F;
			local15[2] = 0.0F;
			local15[9] = 0.0F;
			local15[3] = 0.0F;
			local15[10] = 1.0F;
			local15[12] = 0.0F;
			local15[0] = 1.0F;
			local15[4] = 0.0F;
			local15[8] = 0.0F;
		} else {
			local15[14] = local19 / (local19 - local23);
			local15[11] = 0.0F;
			local15[7] = 0.0F;
			local15[2] = 0.0F;
			local15[12] = (local62 + local47) / (local47 - local62);
			local15[4] = 0.0F;
			local15[5] = 2.0F / (local76 - local35);
			local15[13] = (local35 + local76) / (local76 - local35);
			local15[10] = 1.0F / (local19 - local23);
			local15[3] = 0.0F;
			local15[8] = 0.0F;
			local15[15] = 1.0F;
			local15[6] = 0.0F;
			local15[0] = 2.0F / (local62 - local47);
			local15[1] = 0.0F;
			local15[9] = 0.0F;
		}
		this.method5477();
		this.aBoolean516 = true;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(II)I")
	@Override
	public final int method6989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!cga;)V")
	public final void method5504(@OriginalArg(1) Class52 arg0) {
		this.aClass52Array3[this.anInt6274] = arg0;
		this.method5473();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "()Z")
	@Override
	public final boolean method6976() {
		return false;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIZZ)V")
	private void method5505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		@Pc(8) boolean local8 = arg4 & this.method7016();
		if (!local8 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg2 = 1;
			arg0 = 0;
		}
		if (arg1 != 0 && arg3) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt6251 != arg1) {
			if (this.anInt6251 != 0) {
				this.aClass108Array3[Integer.MAX_VALUE & this.anInt6251].method8708();
			}
			if (arg1 == 0) {
				this.aClass108_3 = null;
			} else {
				this.aClass108_3 = this.aClass108Array3[Integer.MAX_VALUE & arg1];
				this.aClass108_3.method8710(arg3);
				this.aClass108_3.method8702(arg3);
				this.aClass108_3.method8700(arg0, arg2);
			}
			this.anInt6251 = arg1;
			this.anInt6270 = arg0;
			this.anInt6269 = arg2;
		} else if (this.anInt6251 != 0) {
			this.aClass108Array3[Integer.MAX_VALUE & this.anInt6251].method8702(arg3);
			if (arg0 != this.anInt6270 || arg2 != this.anInt6269) {
				this.aClass108Array3[this.anInt6251 & Integer.MAX_VALUE].method8700(arg0, arg2);
				this.anInt6269 = arg2;
				this.anInt6270 = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rv", name = "D", descriptor = "(I)V")
	public final void method5506() {
		this.method5484(Static28.aClass23_1, 2);
	}

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "(B)V")
	private void method5507() {
		this.method5451(0, this.anInterface1_13);
		this.method5524(this.aClass203_21);
		this.method5454(Static179.aClass23_5, 1, 0);
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "()Lclient!ofa;")
	@Override
	public final Class117 method6998() {
		return new Class117_Sub2();
	}

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "(Z)V")
	public final void method5508() {
		this.aClass117_Sub2Array3 = new Class117_Sub2[this.anInt6284];
		this.aClass10Array5 = new Class10[this.anInt6284];
		this.anInterface27Array3 = new Interface27[this.anInt6284];
		this.aClass10Array6 = new Class10[this.anInt6284];
		this.aClass52Array3 = new Class52[this.anInt6284];
		for (@Pc(32) int local32 = 0; local32 < this.anInt6284; local32++) {
			this.aClass10Array6[local32] = Static101.aClass10_2;
			this.aClass10Array5[local32] = Static101.aClass10_2;
			this.aClass52Array3[local32] = Static583.aClass52_6;
			this.aClass117_Sub2Array3[local32] = new Class117_Sub2();
		}
		this.aClass5_Sub27Array4 = new Class5_Sub27[this.anInt6266 - 2];
		this.anInterface27_3 = this.method5487(1, Static208.aClass281_10, 1, Static385.aClass247_14);
		this.method7023(new Class5_Sub23_Sub1(262144));
		this.aClass203_20 = this.method5525(new Class212[] { new Class212(new Class106[] { Static150.aClass106_1, Static150.aClass106_5 }) });
		this.aClass203_17 = this.method5525(new Class212[] { new Class212(new Class106[] { Static150.aClass106_1, Static150.aClass106_3 }) });
		this.aClass203_18 = this.method5525(new Class212[] { new Class212(Static150.aClass106_1), new Class212(Static150.aClass106_3), new Class212(Static150.aClass106_5), new Class212(Static150.aClass106_2) });
		this.aClass203_19 = this.method5525(new Class212[] { new Class212(Static150.aClass106_1), new Class212(Static150.aClass106_3), new Class212(Static150.aClass106_5) });
		this.aClass180_Sub1_25 = new Class180_Sub1(this, 0, 0, false, false);
		this.aClass180_Sub1_28 = new Class180_Sub1(this, 0, 0, true, true);
		this.aClass180_Sub1_24 = new Class180_Sub1(this, 0, 0, false, false);
		this.aClass180_Sub1_27 = new Class180_Sub1(this, 0, 0, true, true);
		this.aClass180_Sub1_30 = new Class180_Sub1(this, 0, 0, false, false);
		this.aClass180_Sub1_22 = new Class180_Sub1(this, 0, 0, true, true);
		this.aClass180_Sub1_26 = new Class180_Sub1(this, 0, 0, false, false);
		this.aClass180_Sub1_21 = new Class180_Sub1(this, 0, 0, true, true);
		this.aClass180_Sub1_23 = new Class180_Sub1(this, 0, 0, false, false);
		this.aClass180_Sub1_29 = new Class180_Sub1(this, 0, 0, true, true);
		this.aClass75_3 = new Class75(this);
		this.anInterface21_8 = this.method5444(true);
		this.method5574();
		this.aClass373_5 = new Class373(this);
		this.aClass108Array3[1] = this.method5461(1);
		this.aClass108Array3[2] = this.method5461(2);
		this.aClass108Array3[4] = this.method5461(4);
		this.aClass108Array3[5] = this.method5461(5);
		this.aClass108Array3[6] = this.method5461(6);
		this.aClass108Array3[7] = this.method5461(7);
		this.aClass108Array3[3] = this.method5461(3);
		this.aClass108Array3[8] = this.method5461(8);
		this.aClass108Array3[9] = this.method5461(9);
		if (!this.aClass108Array3[2].method8699()) {
			this.aClass108Array3[2] = this.method5461(0);
		}
		if (!this.aClass108Array3[4].method8699()) {
			this.aClass108Array3[4] = this.aClass108Array3[2];
		}
		if (!this.aClass108Array3[8].method8699()) {
			this.aClass108Array3[8] = this.aClass108Array3[4];
		}
		if (!this.aClass108Array3[9].method8699()) {
			this.aClass108Array3[9] = this.aClass108Array3[8];
		}
		this.method5533();
		this.la();
		this.method7004();
	}

	@OriginalMember(owner = "client!rv", name = "E", descriptor = "(I)V")
	private void method5509() {
		if (this.aClass49_3 == Static384.aClass49_5) {
			@Pc(11) float local11 = this.method5479();
			this.aClass117_Sub2_15.method3865(local11, 0.0F, local11);
		}
		this.aBoolean506 = false;
		this.method5569();
		if (this.aClass108_3 != null) {
			this.aClass108_3.method8703();
		}
	}

	@OriginalMember(owner = "client!rv", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass117_Sub2_16.method3864((float) arg0, (float) arg1, (float) arg2);
		if ((float) this.anInt6259 > local14 || local14 > (float) this.anInt6256) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt6268 * this.aClass117_Sub2_16.method3875((float) arg2, (float) arg1, (float) arg0) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt6287 * this.aClass117_Sub2_16.method3858((float) arg0, (float) arg1, (float) arg2) / (float) arg3);
		arg4[1] = (int) ((float) local77 - this.aFloat117);
		arg4[2] = (int) local14;
		arg4[0] = (int) ((float) local58 - this.aFloat128);
	}

	@OriginalMember(owner = "client!rv", name = "F", descriptor = "(I)V")
	public final void method5510() {
		if (this.anInt6260 == 4) {
			return;
		}
		this.method5486();
		this.method5514(false);
		this.method5443(false);
		this.method5549(false);
		this.method5470(false);
		this.method5482(-2, false, false);
		this.method5462(1);
		this.method5513(0);
		this.anInt6260 = 4;
	}

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "()Z")
	@Override
	public final boolean method7062() {
		return this.aBoolean507;
	}

	@OriginalMember(owner = "client!rv", name = "G", descriptor = "(I)V")
	private void method5511() {
		if (this.anInt6260 == 1) {
			return;
		}
		this.method5486();
		this.method5514(false);
		this.method5443(false);
		this.method5549(false);
		this.method5470(false);
		this.method5482(-2, false, false);
		this.method5513(1);
		this.method5449(this.anInterface27_3);
		this.anInt6260 = 1;
	}

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "(I)V")
	@Override
	public void method7053(@OriginalArg(0) int arg0) {
		if (this.aClass310_3 != null) {
			this.aClass310_3.method7371();
		}
		this.anInt6264 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!rv", name = "H", descriptor = "(I)V")
	private void method5512() {
		if (this.aBoolean504) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray35;
		@Pc(17) float local17 = (float) (-this.anInt6288 * this.anInt6259) / (float) this.anInt6268;
		@Pc(32) float local32 = (float) (this.anInt6259 * (this.anInt6105 - this.anInt6288)) / (float) this.anInt6268;
		@Pc(43) float local43 = (float) (this.anInt6259 * this.anInt6257) / (float) this.anInt6287;
		@Pc(58) float local58 = (float) (this.anInt6259 * (this.anInt6257 - this.anInt6075)) / (float) this.anInt6287;
		if (local17 == local32 || local58 == local43) {
			local5[4] = 0.0F;
			local5[8] = 0.0F;
			local5[5] = 1.0F;
			local5[7] = 0.0F;
			local5[9] = 0.0F;
			local5[11] = 0.0F;
			local5[12] = 0.0F;
			local5[15] = 1.0F;
			local5[1] = 0.0F;
			local5[6] = 0.0F;
			local5[14] = 0.0F;
			local5[0] = 1.0F;
			local5[10] = 1.0F;
			local5[13] = 0.0F;
			local5[2] = 0.0F;
			local5[3] = 0.0F;
		} else {
			@Pc(72) float local72 = (float) this.anInt6259 * 2.0F;
			local5[15] = 0.0F;
			local5[3] = 0.0F;
			local5[0] = local72 / (local32 - local17);
			local5[5] = local72 / (local43 - local58);
			local5[1] = 0.0F;
			local5[10] = this.aFloat121 = (float) this.anInt6256 / (float) (this.anInt6259 - this.anInt6256);
			local5[2] = 0.0F;
			local5[4] = 0.0F;
			local5[6] = 0.0F;
			local5[13] = 0.0F;
			local5[11] = -1.0F;
			local5[14] = this.aFloat130 = (float) (this.anInt6256 * this.anInt6259) / (float) (this.anInt6259 - this.anInt6256);
			local5[7] = 0.0F;
			local5[8] = (local32 + local17) / (local32 - local17);
			local5[9] = (local58 + local43) / (local43 - local58);
			local5[12] = 0.0F;
		}
		this.method5490();
		this.aBoolean504 = true;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(BI)V")
	public final void method5513(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method5475(Static247.aClass10_4, Static247.aClass10_4);
		} else if (arg0 == 0) {
			this.method5475(Static101.aClass10_2, Static101.aClass10_2);
		} else if (arg0 == 2) {
			this.method5475(Static247.aClass10_4, Static646.aClass10_5);
		} else if (arg0 == 3) {
			this.method5475(Static101.aClass10_2, Static140.aClass10_3);
		} else if (arg0 == 4) {
			this.method5475(Static81.aClass10_1, Static81.aClass10_1);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([IIIIIZ)Lclient!hu;")
	@Override
	public final Class44 method7047(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class44_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(IZ)V")
	public final void method5514(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean521) {
			this.aBoolean521 = arg0;
			this.method5441();
			this.anInt6260 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BB)V")
	public final void method5515(@OriginalArg(1) byte arg0) {
		this.method5496(arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZII[BLclient!qda;II)Lclient!tr;")
	protected abstract Interface25 method5516(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) Class281 arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "(B)V")
	protected abstract void method5517();

	@OriginalMember(owner = "client!rv", name = "I", descriptor = "(I)V")
	public final void method5518() {
		if (Static574.aClass49_6 == this.aClass49_3) {
			return;
		}
		@Pc(14) Class49 local14 = this.aClass49_3;
		this.aClass49_3 = Static574.aClass49_6;
		if (local14.method1074()) {
			this.method5456();
		}
		this.aFloatArray40 = this.aFloatArray41;
		this.anInt6260 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!ku;)V")
	public abstract void method5519(@OriginalArg(1) Class199 arg0);

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(ZI)V")
	public abstract void method5520(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	protected abstract void method5521(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[Lclient!tn;)V")
	@Override
	public final void method7026(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub27[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass5_Sub27Array4[local3] = arg1[local3];
		}
		this.anInt6265 = arg0;
		if (this.aClass49_3.method1074()) {
			this.method5459();
		}
	}

	@OriginalMember(owner = "client!rv", name = "J", descriptor = "(I)I")
	public final int method5522() {
		return this.anInt6285;
	}

	@OriginalMember(owner = "client!rv", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean509) {
			throw new RuntimeException("");
		}
		this.anInt6285 = arg1;
		this.anInt6283 = arg0;
		this.anInt6279 = arg3;
		this.anInt6263 = arg2;
		if (this.aBoolean505) {
			this.aClass108Array3[3].method8706();
			this.aClass108Array3[3].method8704();
		}
	}

	@OriginalMember(owner = "client!rv", name = "K", descriptor = "(I)V")
	public final void method5523() {
		this.aClass117_Sub2_15.method7251();
		this.aBoolean503 = true;
		this.method5509();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ld;B)V")
	public abstract void method5524(@OriginalArg(0) Class203 arg0);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B[Lclient!lm;)Lclient!ld;")
	public abstract Class203 method5525(@OriginalArg(1) Class212[] arg0);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!rh;Lclient!aw;IIIII)V")
	public abstract void method5526(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method5527(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(FFFIFFF)Z")
	private boolean method5528(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(14) Buffer local14 = this.anInterface1_13.method7714();
		if (local14 == null) {
			return false;
		}
		@Pc(23) Stream local23 = this.method5446(local14);
		if (Stream.b()) {
			local23.a(arg1);
			local23.a(arg0);
			local23.a(arg4);
			local23.a(arg3);
			local23.a(arg2);
			local23.a(arg5);
		} else {
			local23.b(arg1);
			local23.b(arg0);
			local23.b(arg4);
			local23.b(arg3);
			local23.b(arg2);
			local23.b(arg5);
		}
		local23.a();
		return this.anInterface1_13.method7717();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ofa;)V")
	@Override
	public final void method7040(@OriginalArg(0) Class117 arg0) {
		this.aClass117_Sub2_16 = (Class117_Sub2) arg0;
		this.aClass117_Sub2_18.method7253(this.aClass117_Sub2_16);
		this.aClass117_Sub2_18.method3869();
		this.aClass117_Sub2_19.method3876(this.aClass117_Sub2_18);
		this.aClass117_Sub2_17.method3876(this.aClass117_Sub2_16);
		if (this.aClass49_3.method1074()) {
			this.method5456();
		}
	}

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "(I)V")
	@Override
	public final void method7046() {
	}

	@OriginalMember(owner = "client!rv", name = "L", descriptor = "(I)[F")
	public final float[] method5529() {
		return this.aFloatArray41;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!uj;)V")
	@Override
	public final void method7058(@OriginalArg(0) Class345 arg0) {
		this.aClass75_3.method1465(this, arg0, -1);
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(IZ)Lclient!am;")
	public abstract Interface1 method5530(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "()Lclient!ofa;")
	@Override
	public final Class117 method7037() {
		return this.aClass117_Sub2_16;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II[BLclient!qda;II)Lclient!op;")
	public abstract Interface19 method5531(@OriginalArg(2) byte[] arg0, @OriginalArg(3) Class281 arg1);

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "(B)V")
	private void method5532() {
		this.aBoolean508 = false;
		if (Static384.aClass49_5 == this.aClass49_3) {
			this.method5469();
			this.method5554();
		}
	}

	@OriginalMember(owner = "client!rv", name = "M", descriptor = "(I)V")
	protected void method5533() {
		this.method5548();
	}

	@OriginalMember(owner = "client!rv", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt6288, this.anInt6257, this.anInt6268, this.anInt6287 };
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(BZ)V")
	public final void method5534(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean513 != arg0) {
			this.aBoolean513 = arg0;
			this.method5441();
		}
	}

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "(B)V")
	protected abstract void method5535();

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILclient!qt;ZZ)V")
	public abstract void method5537(@OriginalArg(1) int arg0, @OriginalArg(2) Class294 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "()Z")
	@Override
	public final boolean method6993() {
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "()Z")
	@Override
	public final boolean method7001() {
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "(B)Lclient!jaa;")
	public final Class117_Sub2 method5539() {
		if (!this.aBoolean506) {
			this.aClass117_Sub2_20.method3880(this.aClass117_Sub2_18, this.aClass117_Sub2_15);
			this.aBoolean506 = true;
		}
		return this.aClass117_Sub2_20;
	}

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "(B)V")
	private void method5540() {
		this.anInterface1_12 = this.method5530(false);
		this.anInterface1_12.method7715(12, 3096);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(36) Buffer local36 = this.anInterface1_12.method7714();
			if (local36 != null) {
				@Pc(43) Stream local43 = this.method5446(local36);
				local43.a(0.0F);
				local43.a(0.0F);
				local43.a(0.0F);
				for (@Pc(54) int local54 = 0; local54 <= 256; local54++) {
					@Pc(65) double local65 = (double) (local54 * 2) * 3.141592653589793D / 256.0D;
					@Pc(69) float local69 = (float) Math.cos(local65);
					@Pc(73) float local73 = (float) Math.sin(local65);
					if (Stream.b()) {
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
				if (this.anInterface1_12.method7717()) {
					break;
				}
			}
		}
		this.aClass203_16 = this.method5525(new Class212[] { new Class212(Static150.aClass106_1) });
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(BI)V")
	public abstract void method5541(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7042(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas7 == arg0) {
			local5 = this.anObject13;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method5527(local5, arg0);
		if (this.lb == arg0) {
			this.method5500();
		}
	}

	@OriginalMember(owner = "client!rv", name = "O", descriptor = "(I)Lclient!jaa;")
	public final Class117_Sub2 method5542() {
		return this.aClass117_Sub2Array3[this.anInt6274];
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method5543(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(BZ)V")
	public final void method5544(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean510) {
			this.aBoolean510 = arg0;
			this.method5460();
		}
	}

	@OriginalMember(owner = "client!rv", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt6254 = 0;
		while (arg0 > 1) {
			this.anInt6254++;
			arg0 >>= 0x1;
		}
		this.anInt6267 = 0x1 << this.anInt6254;
	}

	@OriginalMember(owner = "client!rv", name = "P", descriptor = "(I)V")
	public final void method5545() {
		this.method5518();
		this.method5554();
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(IIIIII)Lclient!tea;")
	@Override
	public final Class91 method7039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class91_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rv", name = "Q", descriptor = "(I)V")
	protected abstract void method5546();

	@OriginalMember(owner = "client!rv", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5511();
		this.method5496(arg4);
		this.method5466(0, Static645.aClass294_5);
		this.method5471(Static645.aClass294_5, 0);
		this.method5462(arg5);
		this.aClass117_Sub2_15.method3878((float) arg3, (float) arg2, 1.0F);
		this.aClass117_Sub2_15.method7247(arg0, arg1, 0);
		this.method5468();
		this.method5520(false);
		this.method5506();
		this.method5520(true);
		this.method5471(Static256.aClass294_4, 0);
		this.method5466(0, Static256.aClass294_4);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIF)Lclient!tn;")
	@Override
	public final Class5_Sub27 method6992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub27_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)Lclient!za;")
	@Override
	public final Class5_Sub23 method6987(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub23_Sub1 local8 = new Class5_Sub23_Sub1(arg0);
		this.aClass306_30.method7303(local8);
		return local8;
	}

	@OriginalMember(owner = "client!rv", name = "R", descriptor = "(I)V")
	protected final void method5547() {
		@Pc(9) Enumeration local9 = this.aHashtable5.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method5521(local15, this.aHashtable5.get(local15));
		}
		this.anInterface1_14.method7716();
		this.anInterface1_13.method7716();
		this.anInterface1_12.method7716();
		this.aClass180_Sub1_28.method5073();
		this.aClass180_Sub1_27.method5073();
		this.aClass180_Sub1_22.method5073();
		this.aClass180_Sub1_21.method5073();
		this.aClass180_Sub1_29.method5073();
		this.aClass75_3.method1472();
		this.anInterface21_8.method7716();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6979(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas7 == arg0) {
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
			@Pc(53) Object local53 = this.method5543(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!rv", name = "S", descriptor = "(I)V")
	private void method5548() {
		this.method5480();
		this.method5517();
		this.method5491();
		this.method5459();
		this.method5485();
		this.method5565();
		this.method5460();
		this.method5463();
		this.method5495();
		this.method5441();
		this.method5561();
		this.method5467();
		this.method5558();
		this.method5550();
		for (@Pc(64) int local64 = this.anInt6284 - 1; local64 >= 0; local64--) {
			this.method5560(local64);
			this.method5557();
			this.method5571();
			this.method5445();
		}
		this.method5474();
		this.method5489();
		this.method5457();
		this.method5569();
		this.method5535();
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(ZI)V")
	public final void method5549(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean514) {
			this.aBoolean514 = arg0;
			this.method5463();
			this.anInt6260 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rv", name = "T", descriptor = "(I)V")
	protected abstract void method5550();

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "(Z)V")
	public final void method5551() {
		if (this.anInt6260 == 2) {
			return;
		}
		this.method5486();
		this.method5514(false);
		this.method5443(false);
		this.method5549(false);
		this.method5470(false);
		this.method5482(-2, false, false);
		this.anInt6260 = 2;
	}

	@OriginalMember(owner = "client!rv", name = "U", descriptor = "(I)V")
	protected abstract void method5552();

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "()Z")
	@Override
	public final boolean method6977() {
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[IBZI)Lclient!tr;")
	public final Interface25 method5553(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		return this.method5476(0, arg1, arg0, arg2, 0, arg3);
	}

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "(B)V")
	private void method5554() {
		this.method5457();
		if (this.aClass108_3 != null) {
			this.aClass108_3.method8711();
		}
	}

	@OriginalMember(owner = "client!rv", name = "V", descriptor = "(I)I")
	public final int method5555() {
		return this.anInt6263;
	}

	@OriginalMember(owner = "client!rv", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6275;
		arg0[3] = this.anInt6253;
		arg0[2] = this.anInt6258;
		arg0[1] = this.anInt6278;
	}

	@OriginalMember(owner = "client!rv", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6991(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!rv", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!rv", name = "W", descriptor = "(I)V")
	private void method5556() {
		if (this.aClass49_3 == Static643.aClass49_7) {
			return;
		}
		@Pc(6) Class49 local6 = this.aClass49_3;
		this.aClass49_3 = Static643.aClass49_7;
		if (!local6.method1074()) {
			this.method5456();
		}
		this.method5512();
		this.aFloatArray40 = this.aFloatArray35;
		this.method5554();
		this.anInt6260 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "(Z)V")
	protected abstract void method5557();

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "(Z)V")
	protected abstract void method5558();

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "(B)V")
	protected abstract void method5559();

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)V")
	public final void method5560(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt6274) {
			this.anInt6274 = arg0;
			this.method5559();
		}
	}

	@OriginalMember(owner = "client!rv", name = "Y", descriptor = "(I)V")
	protected abstract void method5561();

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "(B)V")
	private void method5562() {
		this.aBoolean504 = false;
		this.method5512();
		if (this.aClass49_3 == Static643.aClass49_7) {
			this.method5554();
		}
	}

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "(B)V")
	private void method5563() {
		if (this.aClass49_3 == Static354.aClass49_4) {
			return;
		}
		@Pc(6) Class49 local6 = this.aClass49_3;
		this.aClass49_3 = Static354.aClass49_4;
		if (!local6.method1074()) {
			this.method5456();
		}
		this.method5503();
		this.aFloatArray40 = this.aFloatArray39;
		this.method5554();
		this.anInt6260 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ns;Lclient!qda;I)Z")
	public abstract boolean method5564(@OriginalArg(0) Class247 arg0, @OriginalArg(1) Class281 arg1);

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "(B)V")
	protected abstract void method5565();

	@OriginalMember(owner = "client!rv", name = "Z", descriptor = "(I)V")
	private void method5566() {
		if (this.aClass108_3 != null) {
			this.aClass108_3.method8704();
		}
		this.method5561();
	}

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "(B)V")
	private void method5567() {
		this.anInterface1_14 = this.method5530(false);
		this.anInterface1_14.method7715(28, 140);
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			@Pc(34) Buffer local34 = this.anInterface1_14.method7714();
			if (local34 != null) {
				@Pc(41) Stream local41 = this.method5446(local34);
				if (Stream.b()) {
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
				} else {
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
				}
				local41.a();
				if (this.anInterface1_14.method7717()) {
					break;
				}
			}
		}
		this.aClass203_22 = this.method5525(new Class212[] { new Class212(new Class106[] { Static150.aClass106_1, Static150.aClass106_5, Static150.aClass106_5 }) });
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method7056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static101.method1474(arg2, this, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "(Z)V")
	protected abstract void method5568();

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method6990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "(Z)V")
	protected abstract void method5569();

	@OriginalMember(owner = "client!rv", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6288 = arg0;
		this.anInt6257 = arg1;
		this.anInt6287 = arg3;
		this.anInt6268 = arg2;
		this.method5501();
		this.method5562();
		this.method5518();
		this.method5442();
	}

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "(B)V")
	public final void method5570() {
		if (this.anInt6260 == 8) {
			return;
		}
		this.method5556();
		this.method5514(true);
		this.method5549(true);
		this.method5470(true);
		this.method5462(1);
		this.anInt6260 = 8;
	}

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "(B)V")
	protected abstract void method5571();

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "(B)V")
	public final void method5572() {
		if (this.anInt6260 == 16) {
			return;
		}
		this.method5563();
		this.method5514(true);
		this.method5549(true);
		this.method5470(true);
		this.method5462(1);
		this.anInt6260 = 16;
	}

	@OriginalMember(owner = "client!rv", name = "ab", descriptor = "(I)I")
	public final int method5573() {
		return this.anInt6283;
	}

	@OriginalMember(owner = "client!rv", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean509 = true;
		this.anInt6279 = arg3;
		this.anInt6263 = arg2;
		this.anInt6283 = arg0;
		this.anInt6285 = arg1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!rc;[Lclient!jn;Z)Lclient!da;")
	@Override
	public final Class6 method7000(@OriginalArg(0) Class298 arg0, @OriginalArg(1) Class176[] arg1) {
		return new Class6_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
	@Override
	public final void method6997(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass310_3 != null) {
			this.aClass310_3.method7372();
		}
		this.anInt6252 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "()Lclient!ofa;")
	@Override
	public final Class117 method7018() {
		return this.aClass117_Sub2_21;
	}

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface25 local9 = local6.anInterface25_3;
		this.method5551();
		this.method5449(local9);
		this.method5462(1);
		this.method5475(Static247.aClass10_4, Static247.aClass10_4);
		this.method5466(0, Static645.aClass294_5);
		this.method5496(arg0);
		this.aClass117_Sub2_15.method3878((float) this.anInt6075, (float) this.anInt6105, 0.0F);
		this.method5468();
		this.aClass117_Sub2Array3[0].method3878(local9.method7631((float) this.anInt6075), local9.method7624((float) this.anInt6105), 1.0F);
		this.aClass117_Sub2Array3[0].method3865(local9.method7624((float) -arg2), 0.0F, local9.method7631((float) -arg3));
		this.aClass52Array3[0] = Static242.aClass52_2;
		this.method5473();
		this.method5506();
		this.method5445();
		this.method5466(0, Static256.aClass294_4);
	}

	@OriginalMember(owner = "client!rv", name = "bb", descriptor = "(I)V")
	protected final void method5574() {
		@Pc(15) Hashtable local15 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(26) Enumeration local26 = this.aHashtable5.keys();
			while (local26.hasMoreElements()) {
				@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
				local15.put(local32, this.method5543(local32));
			}
		}
		this.aHashtable5 = local15;
		this.method5567();
		this.method5488();
		this.method5540();
		this.aClass75_3.method1466(this);
	}

	@OriginalMember(owner = "client!rv", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt6277 && this.anInt6255 == arg1 && arg2 == this.anInt6280) {
			return;
		}
		this.anInt6280 = arg2;
		this.anInt6255 = arg1;
		this.anInt6277 = arg0;
		this.method5566();
		this.method5441();
	}

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass117_Sub2_16.aFloat49 + this.aClass117_Sub2_16.aFloat60 * (float) arg2 + this.aClass117_Sub2_16.aFloat58 * (float) arg1 + (float) arg0 * this.aClass117_Sub2_16.aFloat55;
		@Pc(57) float local57 = this.aClass117_Sub2_16.aFloat49 + (float) arg5 * this.aClass117_Sub2_16.aFloat60 + (float) arg4 * this.aClass117_Sub2_16.aFloat58 + (float) arg3 * this.aClass117_Sub2_16.aFloat55;
		if ((float) this.anInt6259 > local32 && (float) this.anInt6259 > local57) {
			local7 |= 0x10;
		} else if ((float) this.anInt6256 < local32 && local57 > (float) this.anInt6256) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass117_Sub2_16.aFloat56 + (float) arg2 * this.aClass117_Sub2_16.aFloat54 + this.aClass117_Sub2_16.aFloat50 * (float) arg0 + this.aClass117_Sub2_16.aFloat59 * (float) arg1) * (float) this.anInt6268 / (float) arg6);
		@Pc(157) int local157 = (int) ((this.aClass117_Sub2_16.aFloat56 + (float) arg5 * this.aClass117_Sub2_16.aFloat54 + this.aClass117_Sub2_16.aFloat50 * (float) arg3 + (float) arg4 * this.aClass117_Sub2_16.aFloat59) * (float) this.anInt6268 / (float) arg6);
		if (this.aFloat128 > (float) local124 && this.aFloat128 > (float) local157) {
			local7 |= 0x1;
		} else if (this.aFloat124 < (float) local124 && this.aFloat124 < (float) local157) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt6287 * ((float) arg2 * this.aClass117_Sub2_16.aFloat53 + this.aClass117_Sub2_16.aFloat57 * (float) arg1 + this.aClass117_Sub2_16.aFloat51 * (float) arg0 + this.aClass117_Sub2_16.aFloat52) / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass117_Sub2_16.aFloat52 + (float) arg5 * this.aClass117_Sub2_16.aFloat53 + (float) arg4 * this.aClass117_Sub2_16.aFloat57 + this.aClass117_Sub2_16.aFloat51 * (float) arg3) * (float) this.anInt6287 / (float) arg6);
		if (this.aFloat117 > (float) local224 && this.aFloat117 > (float) local257) {
			local7 |= 0x4;
		} else if (this.aFloat118 < (float) local224 && (float) local257 > this.aFloat118) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rv", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt6256;
	}
}
