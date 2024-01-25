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

@OriginalClass("client!rl")
public abstract class Class82_Sub3 extends Class82 {

	@OriginalMember(owner = "client!rl", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!rl", name = "lb", descriptor = "Lclient!ep;")
	protected Class96 lb;

	@OriginalMember(owner = "client!rl", name = "Bb", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!rl", name = "tc", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!rl", name = "Ad", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!rl", name = "be", descriptor = "I")
	public int anInt5818;

	@OriginalMember(owner = "client!rl", name = "de", descriptor = "I")
	public int anInt5820;

	@OriginalMember(owner = "client!rl", name = "ee", descriptor = "I")
	protected int anInt5821;

	@OriginalMember(owner = "client!rl", name = "oe", descriptor = "I")
	private int anInt5823;

	@OriginalMember(owner = "client!rl", name = "pe", descriptor = "F")
	public float aFloat122;

	@OriginalMember(owner = "client!rl", name = "qe", descriptor = "[Lclient!tj;")
	protected Class3_Sub22[] aClass3_Sub22Array4;

	@OriginalMember(owner = "client!rl", name = "re", descriptor = "[Lclient!sp;")
	protected Class31_Sub2[] aClass31_Sub2Array3;

	@OriginalMember(owner = "client!rl", name = "De", descriptor = "Z")
	public boolean aBoolean406;

	@OriginalMember(owner = "client!rl", name = "Ke", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!rl", name = "Le", descriptor = "[Lclient!hba;")
	private Interface10[] anInterface10Array3;

	@OriginalMember(owner = "client!rl", name = "Pe", descriptor = "I")
	private int anInt5836;

	@OriginalMember(owner = "client!rl", name = "Qe", descriptor = "Z")
	protected boolean aBoolean408;

	@OriginalMember(owner = "client!rl", name = "Re", descriptor = "Lclient!kl;")
	private Class19 aClass19_3;

	@OriginalMember(owner = "client!rl", name = "Se", descriptor = "Z")
	public boolean aBoolean409;

	@OriginalMember(owner = "client!rl", name = "Te", descriptor = "Lclient!ko;")
	private Class141_Sub1 aClass141_Sub1_3;

	@OriginalMember(owner = "client!rl", name = "We", descriptor = "I")
	protected int anInt5837;

	@OriginalMember(owner = "client!rl", name = "Xe", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!rl", name = "Ye", descriptor = "I")
	public int anInt5838;

	@OriginalMember(owner = "client!rl", name = "af", descriptor = "Lclient!hl;")
	private Class147 aClass147_3;

	@OriginalMember(owner = "client!rl", name = "ef", descriptor = "[Lclient!ef;")
	protected Class88[] aClass88Array5;

	@OriginalMember(owner = "client!rl", name = "gf", descriptor = "I")
	public int anInt5840;

	@OriginalMember(owner = "client!rl", name = "lf", descriptor = "[Lclient!kq;")
	protected Class193[] aClass193Array3;

	@OriginalMember(owner = "client!rl", name = "nf", descriptor = "Z")
	public boolean aBoolean412;

	@OriginalMember(owner = "client!rl", name = "pf", descriptor = "F")
	private float aFloat130;

	@OriginalMember(owner = "client!rl", name = "qf", descriptor = "F")
	private float aFloat131;

	@OriginalMember(owner = "client!rl", name = "sf", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!rl", name = "tf", descriptor = "I")
	public int anInt5841;

	@OriginalMember(owner = "client!rl", name = "wf", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!rl", name = "Bf", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!rl", name = "Jf", descriptor = "I")
	public int anInt5850;

	@OriginalMember(owner = "client!rl", name = "Sf", descriptor = "Z")
	protected boolean aBoolean421;

	@OriginalMember(owner = "client!rl", name = "Uf", descriptor = "Lclient!hba;")
	public Interface10 anInterface10_3;

	@OriginalMember(owner = "client!rl", name = "Xf", descriptor = "I")
	protected int anInt5855;

	@OriginalMember(owner = "client!rl", name = "Yf", descriptor = "I")
	protected int anInt5856;

	@OriginalMember(owner = "client!rl", name = "gg", descriptor = "[Lclient!ef;")
	protected Class88[] aClass88Array6;

	@OriginalMember(owner = "client!rl", name = "hg", descriptor = "I")
	protected int anInt5860;

	@OriginalMember(owner = "client!rl", name = "lg", descriptor = "Lclient!qfa;")
	public Class75_Sub3 aClass75_Sub3_21;

	@OriginalMember(owner = "client!rl", name = "ng", descriptor = "Lclient!qfa;")
	public Class75_Sub3 aClass75_Sub3_22;

	@OriginalMember(owner = "client!rl", name = "og", descriptor = "Lclient!rv;")
	private Interface22 anInterface22_12;

	@OriginalMember(owner = "client!rl", name = "pg", descriptor = "Lclient!cc;")
	public Class43 aClass43_17;

	@OriginalMember(owner = "client!rl", name = "qg", descriptor = "Lclient!cc;")
	public Class43 aClass43_18;

	@OriginalMember(owner = "client!rl", name = "rg", descriptor = "Lclient!qfa;")
	public Class75_Sub3 aClass75_Sub3_23;

	@OriginalMember(owner = "client!rl", name = "sg", descriptor = "Lclient!rv;")
	private Interface22 anInterface22_13;

	@OriginalMember(owner = "client!rl", name = "tg", descriptor = "Lclient!cc;")
	private Class43 aClass43_19;

	@OriginalMember(owner = "client!rl", name = "ug", descriptor = "Lclient!qfa;")
	public Class75_Sub3 aClass75_Sub3_24;

	@OriginalMember(owner = "client!rl", name = "vg", descriptor = "Lclient!qfa;")
	public Class75_Sub3 aClass75_Sub3_25;

	@OriginalMember(owner = "client!rl", name = "wg", descriptor = "Lclient!js;")
	private Interface12 anInterface12_6;

	@OriginalMember(owner = "client!rl", name = "xg", descriptor = "Lclient!qfa;")
	public Class75_Sub3 aClass75_Sub3_26;

	@OriginalMember(owner = "client!rl", name = "yg", descriptor = "Lclient!qfa;")
	public Class75_Sub3 aClass75_Sub3_27;

	@OriginalMember(owner = "client!rl", name = "zg", descriptor = "Lclient!cc;")
	private Class43 aClass43_20;

	@OriginalMember(owner = "client!rl", name = "Ag", descriptor = "Lclient!qfa;")
	public Class75_Sub3 aClass75_Sub3_28;

	@OriginalMember(owner = "client!rl", name = "Bg", descriptor = "Lclient!qfa;")
	public Class75_Sub3 aClass75_Sub3_29;

	@OriginalMember(owner = "client!rl", name = "Cg", descriptor = "Lclient!rv;")
	private Interface22 anInterface22_14;

	@OriginalMember(owner = "client!rl", name = "Dg", descriptor = "Lclient!cc;")
	public Class43 aClass43_21;

	@OriginalMember(owner = "client!rl", name = "Eg", descriptor = "Lclient!cc;")
	public Class43 aClass43_22;

	@OriginalMember(owner = "client!rl", name = "Fg", descriptor = "Lclient!cc;")
	private Class43 aClass43_23;

	@OriginalMember(owner = "client!rl", name = "Gg", descriptor = "Lclient!qfa;")
	public Class75_Sub3 aClass75_Sub3_30;

	@OriginalMember(owner = "client!rl", name = "Hg", descriptor = "Z")
	protected boolean aBoolean423;

	@OriginalMember(owner = "client!rl", name = "Ig", descriptor = "I")
	private int anInt5862;

	@OriginalMember(owner = "client!rl", name = "U", descriptor = "Lclient!mba;")
	private final Class216 aClass216_45 = new Class216();

	@OriginalMember(owner = "client!rl", name = "fe", descriptor = "Z")
	protected boolean aBoolean402 = true;

	@OriginalMember(owner = "client!rl", name = "he", descriptor = "Lclient!sp;")
	protected final Class31_Sub2 aClass31_Sub2_15 = new Class31_Sub2();

	@OriginalMember(owner = "client!rl", name = "ie", descriptor = "Lclient!sp;")
	public Class31_Sub2 aClass31_Sub2_16 = new Class31_Sub2();

	@OriginalMember(owner = "client!rl", name = "je", descriptor = "Lclient!sp;")
	public final Class31_Sub2 aClass31_Sub2_17 = new Class31_Sub2();

	@OriginalMember(owner = "client!rl", name = "ke", descriptor = "Lclient!sp;")
	protected final Class31_Sub2 aClass31_Sub2_18 = new Class31_Sub2();

	@OriginalMember(owner = "client!rl", name = "le", descriptor = "Lclient!sp;")
	private final Class31_Sub2 aClass31_Sub2_19 = new Class31_Sub2();

	@OriginalMember(owner = "client!rl", name = "me", descriptor = "Lclient!sp;")
	private final Class31_Sub2 aClass31_Sub2_20 = new Class31_Sub2();

	@OriginalMember(owner = "client!rl", name = "ne", descriptor = "Z")
	protected boolean aBoolean403 = true;

	@OriginalMember(owner = "client!rl", name = "ye", descriptor = "F")
	public float aFloat123 = 1.0F;

	@OriginalMember(owner = "client!rl", name = "se", descriptor = "I")
	private int anInt5824 = 0;

	@OriginalMember(owner = "client!rl", name = "Je", descriptor = "F")
	public float aFloat124 = 1.0F;

	@OriginalMember(owner = "client!rl", name = "Ce", descriptor = "Z")
	protected boolean aBoolean405 = true;

	@OriginalMember(owner = "client!rl", name = "ve", descriptor = "I")
	private int anInt5826 = 16777215;

	@OriginalMember(owner = "client!rl", name = "Ge", descriptor = "I")
	private int anInt5832 = 1;

	@OriginalMember(owner = "client!rl", name = "Fe", descriptor = "I")
	private int anInt5831 = -1;

	@OriginalMember(owner = "client!rl", name = "ue", descriptor = "I")
	protected int anInt5825 = 0;

	@OriginalMember(owner = "client!rl", name = "Ze", descriptor = "[F")
	public final float[] aFloatArray55 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!rl", name = "Be", descriptor = "I")
	public int anInt5830 = 0;

	@OriginalMember(owner = "client!rl", name = "xe", descriptor = "I")
	public int anInt5828 = 50;

	@OriginalMember(owner = "client!rl", name = "Ae", descriptor = "I")
	private int anInt5829 = 0;

	@OriginalMember(owner = "client!rl", name = "hf", descriptor = "[F")
	private final float[] aFloatArray56 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!rl", name = "Ne", descriptor = "F")
	public float aFloat126 = 3584.0F;

	@OriginalMember(owner = "client!rl", name = "He", descriptor = "I")
	protected int anInt5833 = 0;

	@OriginalMember(owner = "client!rl", name = "ff", descriptor = "I")
	public int anInt5839 = 0;

	@OriginalMember(owner = "client!rl", name = "uf", descriptor = "Z")
	protected boolean aBoolean414 = false;

	@OriginalMember(owner = "client!rl", name = "kf", descriptor = "[F")
	private final float[] aFloatArray57 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!rl", name = "Me", descriptor = "Z")
	protected boolean aBoolean407 = false;

	@OriginalMember(owner = "client!rl", name = "of", descriptor = "Z")
	private boolean aBoolean413 = false;

	@OriginalMember(owner = "client!rl", name = "xf", descriptor = "Z")
	private boolean aBoolean415 = false;

	@OriginalMember(owner = "client!rl", name = "Oe", descriptor = "I")
	public int anInt5835 = 512;

	@OriginalMember(owner = "client!rl", name = "jf", descriptor = "Z")
	protected boolean aBoolean411 = true;

	@OriginalMember(owner = "client!rl", name = "Ff", descriptor = "Z")
	protected boolean aBoolean417 = false;

	@OriginalMember(owner = "client!rl", name = "Qf", descriptor = "Z")
	protected boolean aBoolean419 = true;

	@OriginalMember(owner = "client!rl", name = "Lf", descriptor = "F")
	public float aFloat136 = -1.0F;

	@OriginalMember(owner = "client!rl", name = "If", descriptor = "I")
	protected int anInt5849 = 0;

	@OriginalMember(owner = "client!rl", name = "rf", descriptor = "Lclient!fv;")
	protected Class117 aClass117_7 = Static460.aClass117_8;

	@OriginalMember(owner = "client!rl", name = "Kf", descriptor = "I")
	protected final int anInt5851 = 0;

	@OriginalMember(owner = "client!rl", name = "Ie", descriptor = "I")
	private int anInt5834 = -1;

	@OriginalMember(owner = "client!rl", name = "Ef", descriptor = "I")
	public int anInt5847 = 512;

	@OriginalMember(owner = "client!rl", name = "bf", descriptor = "I")
	public int bf = 128;

	@OriginalMember(owner = "client!rl", name = "yf", descriptor = "I")
	public int anInt5843 = -1;

	@OriginalMember(owner = "client!rl", name = "Df", descriptor = "I")
	private int anInt5846 = 0;

	@OriginalMember(owner = "client!rl", name = "Pf", descriptor = "I")
	protected int anInt5852 = 0;

	@OriginalMember(owner = "client!rl", name = "Of", descriptor = "[F")
	protected float[] aFloatArray59 = this.aFloatArray56;

	@OriginalMember(owner = "client!rl", name = "zf", descriptor = "I")
	public int anInt5844 = -1;

	@OriginalMember(owner = "client!rl", name = "vf", descriptor = "I")
	public int anInt5842 = 0;

	@OriginalMember(owner = "client!rl", name = "Zf", descriptor = "Lclient!cj;")
	protected Class54 aClass54_6 = Static170.aClass54_1;

	@OriginalMember(owner = "client!rl", name = "Rf", descriptor = "Z")
	private boolean aBoolean420 = false;

	@OriginalMember(owner = "client!rl", name = "Ue", descriptor = "F")
	public float aFloat127 = 3584.0F;

	@OriginalMember(owner = "client!rl", name = "Cf", descriptor = "Z")
	private boolean aBoolean416 = false;

	@OriginalMember(owner = "client!rl", name = "Nf", descriptor = "F")
	public float aFloat137 = 1.0F;

	@OriginalMember(owner = "client!rl", name = "Hf", descriptor = "I")
	protected int anInt5848 = 0;

	@OriginalMember(owner = "client!rl", name = "bg", descriptor = "[F")
	private final float[] aFloatArray60 = new float[16];

	@OriginalMember(owner = "client!rl", name = "te", descriptor = "Z")
	protected boolean aBoolean404 = false;

	@OriginalMember(owner = "client!rl", name = "Gf", descriptor = "F")
	public float aFloat135 = 1.0F;

	@OriginalMember(owner = "client!rl", name = "we", descriptor = "I")
	protected int anInt5827 = 3584;

	@OriginalMember(owner = "client!rl", name = "fg", descriptor = "[F")
	private final float[] aFloatArray61 = new float[16];

	@OriginalMember(owner = "client!rl", name = "Tf", descriptor = "F")
	public float aFloat138 = -1.0F;

	@OriginalMember(owner = "client!rl", name = "Vf", descriptor = "I")
	public int anInt5853 = 8;

	@OriginalMember(owner = "client!rl", name = "cf", descriptor = "Z")
	private boolean aBoolean410 = false;

	@OriginalMember(owner = "client!rl", name = "mf", descriptor = "[F")
	private final float[] aFloatArray58 = new float[16];

	@OriginalMember(owner = "client!rl", name = "Mf", descriptor = "Z")
	protected boolean aBoolean418 = true;

	@OriginalMember(owner = "client!rl", name = "eg", descriptor = "I")
	private int anInt5859 = -1;

	@OriginalMember(owner = "client!rl", name = "ag", descriptor = "I")
	public int anInt5857 = 3;

	@OriginalMember(owner = "client!rl", name = "dg", descriptor = "Z")
	private boolean aBoolean422 = false;

	@OriginalMember(owner = "client!rl", name = "kg", descriptor = "[F")
	private final float[] aFloatArray62 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!rl", name = "jg", descriptor = "I")
	private int anInt5861 = 0;

	@OriginalMember(owner = "client!rl", name = "Wf", descriptor = "I")
	protected final int anInt5854 = 0;

	@OriginalMember(owner = "client!rl", name = "ze", descriptor = "[F")
	public final float[] aFloatArray54 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!rl", name = "df", descriptor = "F")
	private float aFloat129 = 1.0F;

	@OriginalMember(owner = "client!rl", name = "ig", descriptor = "[Lclient!kl;")
	private final Class19[] aClass19Array3 = new Class19[10];

	@OriginalMember(owner = "client!rl", name = "Ee", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream6 = new Stream();

	@OriginalMember(owner = "client!rl", name = "mg", descriptor = "Lclient!sp;")
	private final Class31_Sub2 aClass31_Sub2_21 = new Class31_Sub2();

	@OriginalMember(owner = "client!rl", name = "Af", descriptor = "I")
	protected final int anInt5845;

	@OriginalMember(owner = "client!rl", name = "B", descriptor = "Ljava/lang/Object;")
	protected final Object anObject15;

	@OriginalMember(owner = "client!rl", name = "Kd", descriptor = "Ljava/lang/Object;")
	private Object anObject16;

	@OriginalMember(owner = "client!rl", name = "M", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas9;

	@OriginalMember(owner = "client!rl", name = "Ic", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!rl", name = "ec", descriptor = "Lclient!uu;")
	protected final Class343 aClass343_148;

	@OriginalMember(owner = "client!rl", name = "Ld", descriptor = "I")
	private int anInt5802;

	@OriginalMember(owner = "client!rl", name = "pd", descriptor = "I")
	public int anInt5782;

	@OriginalMember(owner = "client!rl", name = "cg", descriptor = "I")
	public final int anInt5858;

	@OriginalMember(owner = "client!rl", name = "Lc", descriptor = "I")
	private int anInt5752;

	@OriginalMember(owner = "client!rl", name = "vb", descriptor = "I")
	public int anInt5688;

	@OriginalMember(owner = "client!rl", name = "ib", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!rl", name = "Ve", descriptor = "Lclient!fja;")
	private final Class109 aClass109_3;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!uu;II)V")
	protected Class82_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(3) Class343 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anInt5845 = arg4;
			this.anObject16 = this.anObject15 = arg1;
			this.aCanvas10 = this.aCanvas9 = arg0;
			this.aClass343_148 = arg3;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt5782 = this.anInt5802 = local307.height;
			this.anInt5858 = arg5;
			this.anInt5688 = this.anInt5752 = local307.width;
			Static56.method1015(true, false);
			if (super.anInterface5_9 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt5858);
				this.aClass109_3 = null;
			} else {
				this.aClass109_3 = new Class109(this, super.anInterface5_9);
				this.aNativeInterface3 = new NativeInterface(super.anInterface5_9.method4128(), this.anInt5858);
				for (@Pc(364) int local364 = 0; super.anInterface5_9.method4128() > local364; local364++) {
					@Pc(372) Class355 local372 = super.anInterface5_9.method4129(local364);
					if (local372 != null) {
						this.aNativeInterface3.initTextureMetrics(local364, local372.aByte121, local372.aByte124);
					}
				}
			}
		} catch (@Pc(391) Throwable local391) {
			local391.printStackTrace();
			this.method6133();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([FI)[F")
	public final float[] method4905(@OriginalArg(0) float[] arg0) {
		arg0[12] = this.aFloatArray59[3];
		arg0[8] = this.aFloatArray59[2];
		arg0[0] = this.aFloatArray59[0];
		arg0[4] = this.aFloatArray59[1];
		arg0[5] = this.aFloatArray59[5];
		arg0[1] = this.aFloatArray59[4];
		arg0[9] = this.aFloatArray59[6];
		arg0[2] = this.aFloatArray59[8];
		arg0[13] = this.aFloatArray59[7];
		arg0[3] = this.aFloatArray59[12];
		arg0[6] = this.aFloatArray59[9];
		arg0[10] = this.aFloatArray59[10];
		arg0[14] = this.aFloatArray59[11];
		arg0[7] = this.aFloatArray59[13];
		arg0[15] = this.aFloatArray59[15];
		arg0[11] = this.aFloatArray59[14];
		return arg0;
	}

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "()Lclient!ih;")
	@Override
	public final Class31 method6174() {
		return this.aClass31_Sub2_16;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
	protected abstract void method4906();

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "(I)V")
	private void method4907() {
		if (this.anInt5823 == 1) {
			return;
		}
		this.method4998();
		this.method4982(false);
		this.method5029(false);
		this.method4997(false);
		this.method4968(false);
		this.method4988(false, false, -2);
		this.method5010(1);
		this.method4972(this.anInterface10_3);
		this.anInt5823 = 1;
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "()Z")
	@Override
	public final boolean method6113() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ef;BLclient!ef;)V")
	public final void method4908(@OriginalArg(0) Class88 arg0, @OriginalArg(2) Class88 arg1) {
		@Pc(11) boolean local11 = false;
		if (this.aClass88Array5[this.anInt5825] != arg1) {
			this.aClass88Array5[this.anInt5825] = arg1;
			this.method4923();
			local11 = true;
		}
		if (this.aClass88Array6[this.anInt5825] != arg0) {
			this.aClass88Array6[this.anInt5825] = arg0;
			local11 = true;
			this.method4912();
		}
		if (local11) {
			this.anInt5823 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "()Z")
	@Override
	public final boolean method6158() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "(I)V")
	protected abstract void method4909();

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(II)I")
	@Override
	public final int method6169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!he;)V")
	@Override
	public final void method6145(@OriginalArg(0) Class141 arg0) {
		this.aClass141_Sub1_3 = (Class141_Sub1) arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ej;[Lclient!oia;Z)Lclient!da;")
	@Override
	public final Class63 method6127(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class251[] arg1) {
		return new Class63_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "()V")
	@Override
	protected void method6121() {
		if (this.aBoolean422) {
			return;
		}
		for (@Pc(9) Class3 local9 = this.aClass216_45.method5457(); local9 != null; local9 = this.aClass216_45.method5458()) {
			((Class3_Sub45_Sub2) local9).method7879();
		}
		@Pc(26) Enumeration local26 = this.aHashtable5.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method4992(this.aHashtable5.get(local32), local32);
		}
		Static92.method1552(false, true);
		this.aNativeInterface3.release();
		this.aBoolean422 = true;
	}

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "(I)V")
	protected abstract void method4910();

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "(I)V")
	protected abstract void method4911();

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V")
	protected abstract void method4912();

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!iv;[FIZIB)Lclient!dg;")
	public final Interface6 method4913(@OriginalArg(0) Class168 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method4984(arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "(I)V")
	protected abstract void method4914();

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "(I)V")
	private void method4915() {
		if (this.aBoolean413) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray58;
		@Pc(17) float local17 = (float) (this.anInt5828 * -this.anInt5839) / (float) this.anInt5835;
		@Pc(32) float local32 = (float) ((this.anInt5688 - this.anInt5839) * this.anInt5828) / (float) this.anInt5835;
		@Pc(43) float local43 = (float) (this.anInt5828 * this.anInt5842) / (float) this.anInt5847;
		@Pc(58) float local58 = (float) (this.anInt5828 * (this.anInt5842 - this.anInt5782)) / (float) this.anInt5847;
		if (local17 == local32 || local58 == local43) {
			local5[6] = 0.0F;
			local5[12] = 0.0F;
			local5[9] = 0.0F;
			local5[0] = 1.0F;
			local5[15] = 1.0F;
			local5[5] = 1.0F;
			local5[7] = 0.0F;
			local5[10] = 1.0F;
			local5[8] = 0.0F;
			local5[2] = 0.0F;
			local5[1] = 0.0F;
			local5[3] = 0.0F;
			local5[13] = 0.0F;
			local5[14] = 0.0F;
			local5[11] = 0.0F;
			local5[4] = 0.0F;
		} else {
			@Pc(138) float local138 = (float) this.anInt5828 * 2.0F;
			local5[2] = 0.0F;
			local5[5] = local138 / (local43 - local58);
			local5[14] = this.aFloat131 = (float) (this.anInt5828 * this.anInt5827) / (float) (this.anInt5828 - this.anInt5827);
			local5[3] = 0.0F;
			local5[11] = -1.0F;
			local5[0] = local138 / (local32 - local17);
			local5[10] = this.aFloat130 = (float) this.anInt5827 / (float) (this.anInt5828 - this.anInt5827);
			local5[8] = (local17 + local32) / (local32 - local17);
			local5[12] = 0.0F;
			local5[4] = 0.0F;
			local5[1] = 0.0F;
			local5[13] = 0.0F;
			local5[15] = 0.0F;
			local5[9] = (local58 + local43) / (local43 - local58);
			local5[7] = 0.0F;
			local5[6] = 0.0F;
		}
		this.method4967();
		this.aBoolean413 = true;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "()Z")
	@Override
	public final boolean method6101() {
		return false;
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(B)V")
	private void method4916() {
		if (this.aBoolean416) {
			return;
		}
		@Pc(11) float[] local11 = this.aFloatArray61;
		@Pc(15) float local15 = (float) this.anInt5828;
		@Pc(19) float local19 = (float) this.anInt5827;
		@Pc(31) float local31 = (float) -this.anInt5842 * this.aFloat129 / (float) this.anInt5847;
		@Pc(43) float local43 = (float) -this.anInt5839 * this.aFloat129 / (float) this.anInt5835;
		@Pc(57) float local57 = (float) (this.anInt5688 - this.anInt5839) * this.aFloat129 / (float) this.anInt5835;
		@Pc(72) float local72 = this.aFloat129 * (float) (this.anInt5782 - this.anInt5842) / (float) this.anInt5847;
		if (local43 == local57 || local72 == local31) {
			local11[0] = 1.0F;
			local11[14] = 0.0F;
			local11[13] = 0.0F;
			local11[3] = 0.0F;
			local11[2] = 0.0F;
			local11[7] = 0.0F;
			local11[8] = 0.0F;
			local11[1] = 0.0F;
			local11[4] = 0.0F;
			local11[12] = 0.0F;
			local11[5] = 1.0F;
			local11[10] = 1.0F;
			local11[11] = 0.0F;
			local11[6] = 0.0F;
			local11[15] = 1.0F;
			local11[9] = 0.0F;
		} else {
			local11[7] = 0.0F;
			local11[9] = 0.0F;
			local11[6] = 0.0F;
			local11[15] = 1.0F;
			local11[5] = 2.0F / (local72 - local31);
			local11[13] = (local31 + local72) / (-local31 + local72);
			local11[14] = local15 / (local15 - local19);
			local11[0] = 2.0F / (local57 - local43);
			local11[8] = 0.0F;
			local11[12] = (local43 + local57) / (local43 - local57);
			local11[10] = 1.0F / (local15 - local19);
			local11[4] = 0.0F;
			local11[1] = 0.0F;
			local11[3] = 0.0F;
			local11[2] = 0.0F;
			local11[11] = 0.0F;
		}
		this.method4996();
		this.aBoolean416 = true;
	}

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "(I)V")
	private void method4917() {
		this.anInterface22_13 = this.method4925(true);
		this.anInterface22_13.method1387(12, 24);
		this.aClass43_19 = this.method4976(new Class268[] { new Class268(Static458.aClass279_1) });
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)V")
	@Override
	public final void method6155(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass109_3 != null) {
			this.aClass109_3.method2755();
		}
		this.bf = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt5857 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt5857++;
		}
		this.anInt5853 = 0x1 << this.anInt5857;
	}

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "(I)V")
	public final void method4918() {
		if (this.aClass117_7 == Static460.aClass117_8) {
			return;
		}
		@Pc(18) Class117 local18 = this.aClass117_7;
		this.aClass117_7 = Static460.aClass117_8;
		if (local18.method2812()) {
			this.method4969();
		}
		this.anInt5823 &= 0xFFFFFFE0;
		this.aFloatArray59 = this.aFloatArray56;
	}

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "(I)I")
	public final int method4919() {
		return this.anInt5861;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BZ)V")
	public abstract void method4920(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "(I)V")
	protected abstract void method4921();

	@OriginalMember(owner = "client!rl", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Interface6 local9 = local6.anInterface6_5;
		this.method5039();
		this.method4972(local9);
		this.method4939(1);
		this.method4908(Static443.aClass88_3, Static443.aClass88_3);
		this.method4928(0, Static302.aClass165_1);
		this.method4933(arg0);
		this.aClass31_Sub2_15.method7672(0.0F, (float) this.anInt5782, (float) this.anInt5688);
		this.method4961();
		this.aClass31_Sub2Array3[0].method7672(1.0F, local9.method8503((float) this.anInt5782), local9.method8502((float) this.anInt5688));
		this.aClass31_Sub2Array3[0].method7661(0.0F, local9.method8502((float) -arg2), local9.method8503((float) -arg3));
		this.aClass193Array3[0] = Static230.aClass193_3;
		this.method4947();
		this.method4958();
		this.method4973();
		this.method4928(0, Static527.aClass165_4);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIZ[III)Lclient!dg;")
	public abstract Interface6 method4922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(Z)V")
	protected abstract void method4923();

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "(I)Lclient!sp;")
	public final Class31_Sub2 method4924() {
		if (!this.aBoolean410) {
			this.aClass31_Sub2_20.method7678(this.aClass31_Sub2_18, this.aClass31_Sub2_15);
			this.aBoolean410 = true;
		}
		return this.aClass31_Sub2_20;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(BZ)Lclient!rv;")
	public abstract Interface22 method4925(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	@Override
	public void method6132(@OriginalArg(0) int arg0) {
		if (this.aClass109_3 != null) {
			this.aClass109_3.method2756();
		}
		this.anInt5838 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "()Lclient!ih;")
	@Override
	public final Class31 method6125() {
		return this.aClass31_Sub2_21;
	}

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "(I)V")
	protected final void method4926() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable5.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method4942(local26));
			}
		}
		this.aHashtable5 = local9;
		this.method5014();
		this.method4917();
		this.method5011();
		this.aClass147_3.method3774(this);
	}

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "(I)V")
	private void method4927() {
		this.method4949();
		this.method4932();
		this.method5030();
		this.method4954();
		this.method4950();
		this.method5007();
		this.method4975();
		this.method4910();
		this.method4979();
		this.method4914();
		this.method4911();
		this.method4909();
		this.method4987();
		this.method4978();
		for (@Pc(52) int local52 = this.anInt5850 - 1; local52 >= 0; local52--) {
			this.method4946(local52);
			this.method4923();
			this.method4912();
			this.method4973();
		}
		this.method5040();
		this.method4959();
		this.method4940();
		this.method4906();
		this.method4955();
	}

	@OriginalMember(owner = "client!rl", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt5839, this.anInt5842, this.anInt5835, this.anInt5847 };
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!ip;)V")
	public final void method4928(@OriginalArg(0) int arg0, @OriginalArg(2) Class165 arg1) {
		this.method5034(arg0, false, arg1, false);
	}

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "(I)V")
	protected abstract void method4929();

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V")
	public final void method4930(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean411 != arg0) {
			this.aBoolean411 = arg0;
			this.method4914();
		}
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(B)Lclient!sp;")
	public final Class31_Sub2 method4931() {
		return this.aClass31_Sub2Array3[this.anInt5825];
	}

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "(I)V")
	protected abstract void method4932();

	@OriginalMember(owner = "client!rl", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5859 = arg1;
		this.anInt5861 = arg3;
		this.anInt5836 = arg0;
		this.aBoolean409 = true;
		this.anInt5834 = arg2;
	}

	@OriginalMember(owner = "client!rl", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4907();
		this.method4933(arg4);
		this.method4928(0, Static302.aClass165_1);
		this.method5028(Static302.aClass165_1, 0);
		this.method4939(arg5);
		this.aClass31_Sub2_15.method7672(1.0F, (float) arg3, (float) arg2);
		this.aClass31_Sub2_15.method7930(arg0, arg1, 0);
		this.method4961();
		this.method4920(false);
		this.method4958();
		this.method4920(true);
		this.method5028(Static527.aClass165_4, 0);
		this.method4928(0, Static527.aClass165_4);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ik;)V")
	@Override
	public final void method6161(@OriginalArg(0) Class162 arg0) {
		this.aClass147_3.method3778(arg0, -1, this);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)V")
	public final void method4933(@OriginalArg(0) int arg0) {
		if (this.anInt5855 != arg0) {
			this.anInt5855 = arg0;
			this.method5040();
		}
	}

	@OriginalMember(owner = "client!rl", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt5848) {
			local5 = true;
			this.anInt5848 = arg0;
		}
		if (arg2 < this.anInt5833) {
			local5 = true;
			this.anInt5833 = arg2;
		}
		if (arg1 > this.anInt5852) {
			this.anInt5852 = arg1;
			local5 = true;
		}
		if (this.anInt5849 > arg3) {
			local5 = true;
			this.anInt5849 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean423) {
			this.aBoolean423 = true;
			this.method4943();
		}
		this.method4929();
		this.method4964();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!iv;IZZ[BI)Lclient!dg;")
	public final Interface6 method4934(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		return this.method5006(arg4, arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZZIII)V")
	private void method4935(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) boolean local4 = arg0 & this.method6183();
		if (!local4 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			arg4 = 2;
			arg2 = 1;
			arg3 = 0;
		}
		if (arg4 != 0 && arg1) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (this.anInt5846 != arg4) {
			if (this.anInt5846 != 0) {
				this.aClass19Array3[this.anInt5846 & Integer.MAX_VALUE].method8277();
			}
			if (arg4 == 0) {
				this.aClass19_3 = null;
			} else {
				this.aClass19_3 = this.aClass19Array3[Integer.MAX_VALUE & arg4];
				this.aClass19_3.method8286(arg1);
				this.aClass19_3.method8274(arg1);
				this.aClass19_3.method8281(arg2, arg3);
			}
			this.anInt5824 = arg3;
			this.anInt5846 = arg4;
			this.anInt5829 = arg2;
		} else if (this.anInt5846 != 0) {
			this.aClass19Array3[Integer.MAX_VALUE & this.anInt5846].method8274(arg1);
			if (arg3 != this.anInt5824 || arg2 != this.anInt5829) {
				this.aClass19Array3[Integer.MAX_VALUE & this.anInt5846].method8281(arg2, arg3);
				this.anInt5829 = arg2;
				this.anInt5824 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "(I)V")
	private void method4936() {
		if (this.aClass19_3 != null) {
			this.aClass19_3.method8284();
		}
		this.method4911();
	}

	@OriginalMember(owner = "client!rl", name = "A", descriptor = "()Z")
	@Override
	public final boolean method6183() {
		return this.aClass19Array3[3].method8282();
	}

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "(I)V")
	private void method4937() {
		this.aBoolean413 = false;
		this.method4915();
		if (Static119.aClass117_3 == this.aClass117_7) {
			this.method4977();
		}
	}

	@OriginalMember(owner = "client!rl", name = "z", descriptor = "(I)V")
	protected abstract void method4938();

	@OriginalMember(owner = "client!rl", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5842 = arg1;
		this.anInt5835 = arg2;
		this.anInt5847 = arg3;
		this.anInt5839 = arg0;
		this.method5017();
		this.method4937();
		this.method4918();
		this.method4964();
	}

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "(II)V")
	public final void method4939(@OriginalArg(1) int arg0) {
		if (this.anInt5832 == arg0) {
			return;
		}
		@Pc(26) Class54 local26;
		@Pc(28) boolean local28;
		@Pc(24) boolean local24;
		if (arg0 == 1) {
			local28 = true;
			local24 = true;
			local26 = Static170.aClass54_1;
		} else if (arg0 == 2) {
			local24 = false;
			local26 = Static436.aClass54_7;
			local28 = true;
		} else if (arg0 == 128) {
			local24 = true;
			local26 = Static222.aClass54_4;
			local28 = true;
		} else {
			local24 = false;
			local26 = Static241.aClass54_5;
			local28 = false;
		}
		if (local24 != this.aBoolean403) {
			this.aBoolean403 = local24;
			this.method4978();
		}
		if (local28 != this.aBoolean418) {
			this.aBoolean418 = local28;
			this.method4909();
		}
		if (this.aClass54_6 != local26) {
			this.aClass54_6 = local26;
			this.method4987();
		}
		this.anInt5832 = arg0;
		this.anInt5823 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method6122() {
	}

	@OriginalMember(owner = "client!rl", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass31_Sub2_16.method7671((float) arg2, (float) arg0, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt5835 * this.aClass31_Sub2_16.method7667((float) arg0, (float) arg1, (float) arg2) / local14);
			local58 = (int) ((float) this.anInt5847 * this.aClass31_Sub2_16.method7663((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local58 = this.anInt5842;
			local40 = this.anInt5839;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat133);
		arg3[1] = (int) ((float) local58 - this.aFloat134);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!rl", name = "A", descriptor = "(I)V")
	protected abstract void method4940();

	@OriginalMember(owner = "client!rl", name = "B", descriptor = "(I)V")
	public final void method4941() {
		this.aClass31_Sub2_15.method7926();
		this.aBoolean402 = true;
		this.method5032();
	}

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt5828;
	}

	@OriginalMember(owner = "client!rl", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6164(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Ljava/lang/Object;")
	protected abstract Object method4942(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!rl", name = "C", descriptor = "(I)V")
	protected abstract void method4943();

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "(B)Lclient!sp;")
	public final Class31_Sub2 method4944() {
		return this.aClass31_Sub2_15;
	}

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "()Z")
	@Override
	public final boolean method6175() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "(II)V")
	public final void method4946(@OriginalArg(1) int arg0) {
		if (this.anInt5825 != arg0) {
			this.anInt5825 = arg0;
			this.method5000();
		}
	}

	@OriginalMember(owner = "client!rl", name = "D", descriptor = "(I)V")
	private void method4947() {
		this.method4921();
		if (this.aClass19_3 != null) {
			this.aClass19_3.method8288();
		}
	}

	@OriginalMember(owner = "client!rl", name = "E", descriptor = "(I)Lclient!sp;")
	public final Class31_Sub2 method4948() {
		return this.aClass31_Sub2_19;
	}

	@OriginalMember(owner = "client!rl", name = "F", descriptor = "(I)V")
	protected abstract void method4949();

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(41) float local41 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local16 * local16)));
			local16 *= local41;
			local10 *= local41;
		}
		if (!this.method5035((float) arg2 + local10, 0.0F, local16 + (float) arg3, (float) arg0, 0.0F, (float) arg1)) {
			return;
		}
		this.method4907();
		this.method4933(arg4);
		this.method4928(0, Static302.aClass165_1);
		this.method5028(Static302.aClass165_1, 0);
		this.method4939(arg5);
		this.method4941();
		this.method4920(false);
		this.method4980();
		this.method4920(true);
		this.method5028(Static527.aClass165_4, 0);
		this.method4928(0, Static527.aClass165_4);
	}

	@OriginalMember(owner = "client!rl", name = "G", descriptor = "(I)V")
	public abstract void method4950();

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V")
	public final void method4951(@OriginalArg(0) byte arg0) {
		this.method4933(arg0 | arg0 << 16 | arg0 << 24 | arg0 << 8);
	}

	@OriginalMember(owner = "client!rl", name = "H", descriptor = "(I)Lclient!pda;")
	public final Interface18 method4952() {
		return this.aClass141_Sub1_3 == null ? null : this.aClass141_Sub1_3.method7245();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZLclient!ip;)V")
	protected abstract void method4953(@OriginalArg(1) int arg0, @OriginalArg(3) Class165 arg1);

	@OriginalMember(owner = "client!rl", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt5852 = 0;
		this.anInt5833 = this.anInt5688;
		this.anInt5849 = this.anInt5782;
		this.anInt5848 = 0;
		if (this.aBoolean423) {
			this.aBoolean423 = false;
			this.method4943();
		}
		this.method4964();
	}

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "(B)V")
	protected void method4954() {
		this.anInt5837 = this.anInt5860;
		this.anInt5860 = 0;
	}

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "(B)V")
	protected abstract void method4955();

	@OriginalMember(owner = "client!rl", name = "I", descriptor = "(I)[F")
	public final float[] method4956() {
		return this.aFloatArray56;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method4957(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!rl", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4907();
		this.method4933(arg3);
		this.method4928(0, Static302.aClass165_1);
		this.method5028(Static302.aClass165_1, 0);
		this.method4939(arg4);
		this.aClass31_Sub2_15.method7672(1.0F, (float) arg2, (float) arg2);
		this.aClass31_Sub2_15.method7930(arg0, arg1, 0);
		this.method4961();
		this.method4920(false);
		this.method4995(0, this.anInterface22_12);
		this.method4960(this.aClass43_20);
		this.method5023(Static52.aClass376_1, 256, 0);
		this.method4920(true);
		this.method5028(Static527.aClass165_4, 0);
		this.method4928(0, Static527.aClass165_4);
	}

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "(B)V")
	public final void method4958() {
		this.method5009(2, Static52.aClass376_1);
	}

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "()Z")
	@Override
	public final boolean method6171() {
		return this.aBoolean408;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local9 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local9 * local9 + local16 * local16));
			local18 = (float) Math.atan2((double) local16, (double) local9);
		}
		this.method4907();
		this.method4933(arg4);
		this.method4928(0, Static302.aClass165_1);
		this.method5028(Static302.aClass165_1, 0);
		this.method4939(0);
		this.aClass31_Sub2_15.method7672(1.0F, (float) arg5, local20);
		this.aClass31_Sub2_15.method7930(0, -arg5 / 2, 0);
		this.aClass31_Sub2_15.method7927((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass31_Sub2_15.method7930(arg0, arg1, 0);
		this.method4961();
		this.method4920(false);
		this.method4958();
		this.method4920(true);
		this.method5028(Static527.aClass165_4, 0);
		this.method4928(0, Static527.aClass165_4);
	}

	@OriginalMember(owner = "client!rl", name = "J", descriptor = "(I)V")
	protected abstract void method4959();

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!cc;)V")
	public abstract void method4960(@OriginalArg(1) Class43 arg0);

	@OriginalMember(owner = "client!rl", name = "K", descriptor = "(I)V")
	public final void method4961() {
		this.aBoolean402 = false;
		this.method5032();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ih;)V")
	@Override
	public final void method6160(@OriginalArg(0) Class31 arg0) {
		this.aClass31_Sub2_16 = (Class31_Sub2) arg0;
		this.aClass31_Sub2_18.method7934(this.aClass31_Sub2_16);
		this.aClass31_Sub2_18.method7669();
		this.aClass31_Sub2_19.method7666(this.aClass31_Sub2_18);
		this.aClass31_Sub2_17.method7666(this.aClass31_Sub2_16);
		if (this.aClass117_7.method2812()) {
			this.method4969();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	protected abstract void method4962(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
	@Override
	public final void method6135() {
	}

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "()Z")
	@Override
	public final boolean method6136() {
		return false;
	}

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "()Z")
	@Override
	public final boolean method6120() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!sga;I)V")
	public abstract void method4963(@OriginalArg(0) Class306 arg0);

	@OriginalMember(owner = "client!rl", name = "L", descriptor = "(I)V")
	private void method4964() {
		this.aFloat133 = (float) (this.anInt5848 - this.anInt5839);
		this.aFloat125 = (float) (this.anInt5833 - this.anInt5839);
		this.aFloat128 = (float) (this.anInt5849 - this.anInt5842);
		this.aFloat134 = (float) (this.anInt5852 - this.anInt5842);
	}

	@OriginalMember(owner = "client!rl", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLclient!sp;)V")
	public final void method4965(@OriginalArg(1) Class31_Sub2 arg0) {
		this.aClass31_Sub2_15.method7934(arg0);
		this.aBoolean402 = false;
		this.method5032();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6099(@OriginalArg(0) Canvas arg0) {
		this.aCanvas10 = null;
		this.anObject16 = null;
		if (arg0 == null || arg0 == this.aCanvas9) {
			this.aCanvas10 = this.aCanvas9;
			this.anObject16 = this.anObject15;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject16 = this.aHashtable5.get(arg0);
			this.aCanvas10 = arg0;
		}
		if (this.aCanvas10 == null || this.anObject16 == null) {
			throw new RuntimeException();
		}
		this.method4957(this.aCanvas10, this.anObject16);
		this.method5016();
	}

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "(II)Lclient!kl;")
	protected Class19 method4966(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class19_Sub2(this);
		} else if (arg0 == 1) {
			return new Class19_Sub1(this);
		} else if (arg0 == 2) {
			return new Class19_Sub7(this, this.lb);
		} else if (arg0 == 7) {
			return new Class19_Sub9(this);
		} else {
			return new Class19_Sub3(this);
		}
	}

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "(B)V")
	private void method4967() {
		this.aFloatArray58[10] = this.aFloat130;
		this.aFloatArray58[14] = this.aFloat131;
		this.aFloat126 = (this.aFloatArray58[14] - (float) this.anInt5827) / this.aFloatArray58[10];
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(ZI)V")
	public final void method4968(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean404) {
			this.aBoolean404 = arg0;
			this.method4979();
			this.anInt5823 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rl", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5848;
		arg0[2] = this.anInt5833;
		arg0[3] = this.anInt5849;
		arg0[1] = this.anInt5852;
	}

	@OriginalMember(owner = "client!rl", name = "M", descriptor = "(I)V")
	private void method4969() {
		this.aBoolean410 = false;
		if (this.aClass19_3 != null) {
			this.aClass19_3.method8278();
		}
		this.method4955();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III[BILclient!iv;)Lclient!rj;")
	public abstract Interface20 method4970(@OriginalArg(3) byte[] arg0, @OriginalArg(5) Class168 arg1);

	@OriginalMember(owner = "client!rl", name = "N", descriptor = "(I)Lclient!sp;")
	public final Class31_Sub2 method4971() {
		return this.aClass31_Sub2_18;
	}

	@OriginalMember(owner = "client!rl", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat123) {
			this.aFloat123 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method4949();
			this.method5007();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!hba;)V")
	public final void method4972(@OriginalArg(1) Interface10 arg0) {
		if (this.anInterface10Array3[this.anInt5825] == arg0) {
			return;
		}
		this.anInterface10Array3[this.anInt5825] = arg0;
		if (arg0 == null) {
			this.method4938();
		} else {
			arg0.method8488();
		}
		this.anInt5823 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!rl", name = "O", descriptor = "(I)V")
	public final void method4973() {
		if (this.aClass193Array3[this.anInt5825] != Static466.aClass193_6) {
			this.aClass193Array3[this.anInt5825] = Static466.aClass193_6;
			this.aClass31_Sub2Array3[this.anInt5825].method7926();
			this.method4947();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!kq;I)V")
	public final void method4974(@OriginalArg(0) Class193 arg0) {
		this.aClass193Array3[this.anInt5825] = arg0;
		this.method4947();
	}

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "(B)V")
	protected abstract void method4975();

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method6147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static577.method8079(arg0, this, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method6181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(17) float local17 = (float) arg3 - (float) arg1;
		@Pc(38) float local38;
		if (local11 == 0.0F && local17 == 0.0F) {
			local11 = 1.0F;
		} else {
			local38 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local11 * local11)));
			local11 *= local38;
			local17 *= local38;
		}
		this.method4907();
		this.method4933(arg4);
		this.method4928(0, Static302.aClass165_1);
		this.method5028(Static302.aClass165_1, 0);
		this.method4939(1);
		this.method4941();
		this.method4920(false);
		@Pc(84) int local84 = arg7 % (arg5 + arg6);
		local38 = (float) arg5 * local11;
		@Pc(94) float local94 = local17 * (float) arg5;
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = local38;
		@Pc(102) float local102 = local94;
		if (arg5 < local84) {
			local96 = local11 * (float) (arg5 + arg6 - local84);
			local98 = local17 * (float) (arg6 + arg5 - local84);
		} else {
			local102 = (float) (arg5 - local84) * local17;
			local100 = (float) (arg5 - local84) * local11;
		}
		@Pc(151) float local151 = (float) arg0 + local96;
		@Pc(156) float local156 = (float) arg1 + local98;
		@Pc(161) float local161 = local11 * (float) arg6;
		@Pc(166) float local166 = local17 * (float) arg6;
		while (true) {
			if (arg0 >= arg2) {
				if (local151 < (float) arg2) {
					break;
				}
				if (local151 + local100 < (float) arg2) {
					local100 = (float) arg2 - local151;
				}
			} else {
				if (local151 > (float) arg2) {
					break;
				}
				if (local151 + local100 > (float) arg2) {
					local100 = (float) arg2 - local151;
				}
			}
			if (arg1 >= arg3) {
				if (local156 < (float) arg3) {
					break;
				}
				if ((float) arg3 > local102 + local156) {
					local102 = (float) arg3 - local156;
				}
			} else {
				if ((float) arg3 < local156) {
					break;
				}
				if ((float) arg3 < local156 + local102) {
					local102 = (float) arg3 - local156;
				}
			}
			if (!this.method5035(local100 + local151, 0.0F, local102 + local156, local151, 0.0F, local156)) {
				return;
			}
			local156 += local166 + local102;
			this.method4980();
			local151 += local161 + local100;
			local100 = local38;
			local102 = local94;
		}
		this.method4920(true);
		this.method5028(Static527.aClass165_4, 0);
		this.method4928(0, Static527.aClass165_4);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!vo;IIII)Lclient!ka;")
	@Override
	public final Class75 method6176(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class75_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([Lclient!pj;I)Lclient!cc;")
	public abstract Class43 method4976(@OriginalArg(0) Class268[] arg0);

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "(B)V")
	private void method4977() {
		this.method4940();
		if (this.aClass19_3 != null) {
			this.aClass19_3.method8272();
		}
	}

	@OriginalMember(owner = "client!rl", name = "P", descriptor = "(I)V")
	protected abstract void method4978();

	@OriginalMember(owner = "client!rl", name = "Q", descriptor = "(I)V")
	protected abstract void method4979();

	@OriginalMember(owner = "client!rl", name = "R", descriptor = "(I)V")
	private void method4980() {
		this.method4995(0, this.anInterface22_13);
		this.method4960(this.aClass43_19);
		this.method5023(Static310.aClass376_4, 1, 0);
	}

	@OriginalMember(owner = "client!rl", name = "S", descriptor = "(I)Lclient!sp;")
	public final Class31_Sub2 method4981() {
		return this.aClass31_Sub2Array3[this.anInt5825];
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(ZI)V")
	public final void method4982(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean421 != arg0) {
			this.aBoolean421 = arg0;
			this.method4914();
			this.anInt5823 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "(B)I")
	public final int method4983() {
		return this.anInt5836;
	}

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "()Z")
	@Override
	public final boolean method6129() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method6146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZIBLclient!iv;[FI)Lclient!dg;")
	protected abstract Interface6 method4984(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(5) Class168 arg2, @OriginalArg(6) float[] arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZ)Lclient!fd;")
	@Override
	public final Class103 method6110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class103_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "()Z")
	@Override
	public final boolean method6104() {
		return false;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZB)Lclient!js;")
	public abstract Interface12 method4985(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method4986(@OriginalArg(1) Buffer arg0) {
		this.aStream6.a(arg0);
		return this.aStream6;
	}

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "(B)V")
	protected abstract void method4987();

	@OriginalMember(owner = "client!rl", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5843 == arg0 && this.anInt5844 == arg1 && this.anInt5830 == arg2) {
			return;
		}
		this.anInt5843 = arg0;
		this.anInt5844 = arg1;
		this.anInt5830 = arg2;
		this.method4936();
		this.method4914();
	}

	@OriginalMember(owner = "client!rl", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass31_Sub2_16.method7671((float) arg2, (float) arg0, (float) arg1);
		if ((float) this.anInt5828 > local14 || (float) this.anInt5827 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt5835 * this.aClass31_Sub2_16.method7667((float) arg0, (float) arg1, (float) arg2) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt5847 * this.aClass31_Sub2_16.method7663((float) arg1, (float) arg0, (float) arg2) / (float) arg3);
		arg4[2] = (int) local14;
		arg4[1] = (int) ((float) local77 - this.aFloat134);
		arg4[0] = (int) ((float) local58 - this.aFloat133);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIF)Lclient!tj;")
	@Override
	public final Class3_Sub22 method6126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub22_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZZII)V")
	public final void method4988(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt5831 != arg2 || this.aBoolean420 != this.aBoolean409) {
			@Pc(24) Interface6 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean409 ? 3 : 0;
			if (arg2 < 0) {
				this.method4973();
			} else {
				local24 = this.aClass109_3.method2757(arg2);
				@Pc(51) Class355 local51 = super.anInterface5_9.method4129(arg2);
				if (local51.aByte125 == 0 && local51.aByte122 == 0) {
					this.method4973();
				} else {
					@Pc(70) int local70 = local51.aBoolean741 ? 64 : 128;
					@Pc(74) int local74 = local70 * 50;
					@Pc(78) Class31_Sub2 local78 = this.method4931();
					local78.method7659((float) (local51.aByte122 * (this.anInt5838 % local74)) / (float) local74, (float) (this.anInt5838 % local74 * local51.aByte125) / (float) local74, 0.0F);
					this.method4974(Static230.aClass193_3);
				}
				if (!this.aBoolean409) {
					local30 = local51.anInt9795;
					local28 = local51.aByte120;
					local37 = local51.aByte119;
				}
				local26 = local51.anInt9794;
			}
			this.method4935(arg1, arg0, local30, local28, local37);
			if (this.aClass19_3 == null) {
				this.method4972(local24);
				this.method5010(local26);
			} else {
				this.aClass19_3.method8273(local26, local24);
			}
			this.anInt5831 = arg2;
			this.aBoolean420 = this.aBoolean409;
		}
		this.anInt5823 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!rl", name = "T", descriptor = "(I)V")
	public final void method4989() {
		if (this.anInt5823 == 4) {
			return;
		}
		this.method4998();
		this.method4982(false);
		this.method5029(false);
		this.method4997(false);
		this.method4968(false);
		this.method4988(false, false, -2);
		this.method4939(1);
		this.method5010(0);
		this.anInt5823 = 4;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ik;I)V")
	@Override
	public final void method6107(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1) {
		this.aClass147_3.method3778(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!rl", name = "U", descriptor = "(I)V")
	private void method4990() {
		if (this.aClass117_7 == Static119.aClass117_3) {
			return;
		}
		@Pc(18) Class117 local18 = this.aClass117_7;
		this.aClass117_7 = Static119.aClass117_3;
		if (!local18.method2812()) {
			this.method4969();
		}
		this.method4915();
		this.aFloatArray59 = this.aFloatArray58;
		this.method4977();
		this.anInt5823 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "()I")
	@Override
	public final int method6131() {
		return this.anInt5856 - 2;
	}

	@OriginalMember(owner = "client!rl", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt5862;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([I)V")
	@Override
	public final void method6156(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5688;
		arg0[1] = this.anInt5782;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)I")
	@Override
	public final int method6105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)V")
	public final void method4991(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean419 != arg0) {
			this.aBoolean419 = arg0;
			this.method4975();
		}
	}

	@OriginalMember(owner = "client!rl", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass31_Sub2_16.method7671((float) arg2, (float) arg0, (float) arg1);
		@Pc(25) int local25;
		@Pc(28) int local28;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local25 = (int) ((float) this.anInt5835 * this.aClass31_Sub2_16.method7667((float) arg0, (float) arg1, (float) arg2) / local14);
			local28 = (int) ((float) this.anInt5847 * this.aClass31_Sub2_16.method7663((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local25 = this.anInt5839;
			local28 = this.anInt5842;
		}
		arg3[0] = (int) ((float) local25 - this.aFloat133);
		arg3[1] = (int) ((float) local28 - this.aFloat134);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!rl", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6164(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass31_Sub2_16.aFloat168 * (float) arg2 + (float) arg0 * this.aClass31_Sub2_16.aFloat173 + (float) arg1 * this.aClass31_Sub2_16.aFloat176 + this.aClass31_Sub2_16.aFloat172;
		@Pc(57) float local57 = this.aClass31_Sub2_16.aFloat172 + (float) arg4 * this.aClass31_Sub2_16.aFloat176 + this.aClass31_Sub2_16.aFloat173 * (float) arg3 + (float) arg5 * this.aClass31_Sub2_16.aFloat168;
		if (local32 < (float) this.anInt5828 && (float) this.anInt5828 > local57) {
			local7 |= 0x10;
		} else if ((float) this.anInt5827 < local32 && (float) this.anInt5827 < local57) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt5835 * (this.aClass31_Sub2_16.aFloat174 * (float) arg0 + this.aClass31_Sub2_16.aFloat171 * (float) arg1 + this.aClass31_Sub2_16.aFloat175 * (float) arg2 + this.aClass31_Sub2_16.aFloat177) / (float) arg6);
		@Pc(157) int local157 = (int) ((this.aClass31_Sub2_16.aFloat177 + (float) arg5 * this.aClass31_Sub2_16.aFloat175 + this.aClass31_Sub2_16.aFloat171 * (float) arg4 + (float) arg3 * this.aClass31_Sub2_16.aFloat174) * (float) this.anInt5835 / (float) arg6);
		if (this.aFloat133 > (float) local124 && this.aFloat133 > (float) local157) {
			local7 |= 0x1;
		} else if (this.aFloat125 < (float) local124 && this.aFloat125 < (float) local157) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass31_Sub2_16.aFloat170 + (float) arg2 * this.aClass31_Sub2_16.aFloat178 + (float) arg0 * this.aClass31_Sub2_16.aFloat169 + this.aClass31_Sub2_16.aFloat167 * (float) arg1) * (float) this.anInt5847 / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass31_Sub2_16.aFloat170 + this.aClass31_Sub2_16.aFloat169 * (float) arg3 + (float) arg4 * this.aClass31_Sub2_16.aFloat167 + (float) arg5 * this.aClass31_Sub2_16.aFloat178) * (float) this.anInt5847 / (float) arg6);
		if ((float) local224 < this.aFloat134 && this.aFloat134 > (float) local257) {
			local7 |= 0x4;
		} else if (this.aFloat128 < (float) local224 && this.aFloat128 < (float) local257) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method4992(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!js;Lclient!wi;III)V")
	public abstract void method4993(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1, @OriginalArg(3) Class376 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!iv;Lclient!jt;I)Z")
	public abstract boolean method4994(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class182 arg1);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!rv;)V")
	public abstract void method4995(@OriginalArg(1) int arg0, @OriginalArg(2) Interface22 arg1);

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "(B)V")
	private void method4996() {
		this.aFloat127 = (float) this.anInt5827;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "()Z")
	@Override
	public final boolean method6111() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(IZ)V")
	public final void method4997(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean414 != arg0) {
			this.aBoolean414 = arg0;
			this.method4910();
			this.anInt5823 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "(I)V")
	@Override
	public final void method6159(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rl", name = "V", descriptor = "(I)V")
	private void method4998() {
		if (this.aClass117_7 == Static254.aClass117_2) {
			return;
		}
		@Pc(17) Class117 local17 = this.aClass117_7;
		this.aClass117_7 = Static254.aClass117_2;
		if (local17.method2812()) {
			this.method4969();
		}
		this.method5013();
		this.aFloatArray59 = this.aFloatArray60;
		this.method4977();
		this.anInt5823 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "(B)I")
	public final int method4999() {
		return this.anInt5825;
	}

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "()Lclient!ih;")
	@Override
	public final Class31 method6170() {
		return new Class31_Sub2();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!oia;Z)Lclient!fd;")
	@Override
	public final Class103 method6106(@OriginalArg(0) Class251 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class103 local21;
		if (arg0.anInt7185 == 0 || arg0.anInt7184 == 0) {
			local21 = this.method6112(1, new int[1], 1, 1);
		} else {
			@Pc(30) int[] local30 = new int[arg0.anInt7185 * arg0.anInt7184];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			@Pc(39) int local39;
			@Pc(43) int local43;
			if (arg0.aByteArray64 == null) {
				for (local39 = 0; local39 < arg0.anInt7184; local39++) {
					for (local43 = 0; local43 < arg0.anInt7185; local43++) {
						@Pc(56) int local56 = arg0.anIntArray430[arg0.aByteArray65[local32++] & 0xFF];
						local30[local34++] = local56 == 0 ? 0 : local56 | 0xFF000000;
					}
				}
			} else {
				for (local39 = 0; local39 < arg0.anInt7184; local39++) {
					for (local43 = 0; local43 < arg0.anInt7185; local43++) {
						local30[local34++] = arg0.anIntArray430[arg0.aByteArray65[local32] & 0xFF] | arg0.aByteArray64[local32] << 24;
						local32++;
					}
				}
			}
			local21 = this.method6112(arg0.anInt7184, local30, arg0.anInt7185, arg0.anInt7185);
		}
		local21.method7441(arg0.anInt7183, arg0.anInt7180, arg0.anInt7181, arg0.anInt7182);
		return local21;
	}

	@OriginalMember(owner = "client!rl", name = "W", descriptor = "(I)V")
	protected abstract void method5000();

	@OriginalMember(owner = "client!rl", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt5826 != arg0;
		if (local11 || arg1 != this.aFloat138 || arg2 != this.aFloat136) {
			this.anInt5826 = arg0;
			this.aFloat138 = arg1;
			this.aFloat136 = arg2;
			if (local11) {
				this.aFloat135 = (float) (this.anInt5826 & 0xFF00) / 65280.0F;
				this.aFloat137 = (float) (this.anInt5826 & 0xFF0000) / 1.671168E7F;
				this.aFloat124 = (float) (this.anInt5826 & 0xFF) / 255.0F;
				this.method4949();
			}
			this.aNativeInterface3.setSunColour(this.aFloat137, this.aFloat135, this.aFloat124, arg1, arg2);
			this.method4932();
		}
		if (arg3 != this.aFloatArray62[0] || this.aFloatArray62[1] != arg4 || this.aFloatArray62[2] != arg5) {
			this.aFloatArray62[0] = arg3;
			this.aFloatArray62[2] = arg5;
			this.aFloatArray62[1] = arg4;
			this.aFloatArray57[1] = -arg4;
			this.aFloatArray57[0] = -arg3;
			this.aFloatArray57[2] = -arg5;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray54[1] = local149 * arg4;
			this.aFloatArray54[2] = arg5 * local149;
			this.aFloatArray54[0] = local149 * arg3;
			this.aFloatArray55[1] = -this.aFloatArray54[1];
			this.aFloatArray55[2] = -this.aFloatArray54[2];
			this.aFloatArray55[0] = -this.aFloatArray54[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray54[0], this.aFloatArray54[1], this.aFloatArray54[2]);
			this.method4950();
			this.anInt5841 = (int) (arg3 * 256.0F / arg4);
			this.anInt5840 = (int) (arg5 * 256.0F / arg4);
		}
		this.method5007();
	}

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "(B)V")
	public final void method5002() {
		if (this.anInt5823 == 8) {
			return;
		}
		this.method4990();
		this.method4982(true);
		this.method4997(true);
		this.method4968(true);
		this.method4939(1);
		this.anInt5823 = 8;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB[[IZ)Lclient!pda;")
	public abstract Interface18 method5003(@OriginalArg(0) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZIZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method5004(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap4.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!jt;Lclient!iv;B)Z")
	public abstract boolean method5005(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class168 arg1);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[BIILclient!iv;IBZ)Lclient!dg;")
	protected abstract Interface6 method5006(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) Class168 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) boolean arg4);

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "(B)V")
	protected abstract void method5007();

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!jt;Lclient!iv;I)Lclient!dg;")
	public abstract Interface6 method5008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class168 arg3);

	@OriginalMember(owner = "client!rl", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean409) {
			throw new RuntimeException("");
		}
		this.anInt5836 = arg0;
		this.anInt5859 = arg1;
		this.anInt5834 = arg2;
		this.anInt5861 = arg3;
		if (this.aBoolean420) {
			this.aClass19Array3[3].method8275();
			this.aClass19Array3[3].method8284();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BILclient!wi;)V")
	private void method5009(@OriginalArg(1) int arg0, @OriginalArg(2) Class376 arg1) {
		this.method4995(0, this.anInterface22_14);
		this.method4960(this.aClass43_23);
		this.method5023(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(IB)V")
	public final void method5010(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4908(Static443.aClass88_3, Static443.aClass88_3);
		} else if (arg0 == 0) {
			this.method4908(Static131.aClass88_1, Static131.aClass88_1);
		} else if (arg0 == 2) {
			this.method4908(Static443.aClass88_3, Static603.aClass88_5);
		} else if (arg0 == 3) {
			this.method4908(Static131.aClass88_1, Static418.aClass88_2);
		} else if (arg0 == 4) {
			this.method4908(Static457.aClass88_4, Static457.aClass88_4);
		}
	}

	@OriginalMember(owner = "client!rl", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt5827;
	}

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "(B)V")
	private void method5011() {
		this.anInterface22_12 = this.method4925(false);
		this.anInterface22_12.method1387(12, 3096);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface22_12.method1389();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method4986(local28);
				local35.a(0.0F);
				local35.a(0.0F);
				local35.a(0.0F);
				for (@Pc(46) int local46 = 0; local46 <= 256; local46++) {
					@Pc(57) double local57 = (double) (local46 * 2) * 3.141592653589793D / 256.0D;
					@Pc(61) float local61 = (float) Math.cos(local57);
					@Pc(65) float local65 = (float) Math.sin(local57);
					if (Stream.c()) {
						local35.a(local65);
						local35.a(local61);
						local35.a(0.0F);
					} else {
						local35.b(local65);
						local35.b(local61);
						local35.b(0.0F);
					}
				}
				local35.b();
				if (this.anInterface22_12.method1390()) {
					break;
				}
			}
		}
		this.aClass43_20 = this.method4976(new Class268[] { new Class268(Static458.aClass279_1) });
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(IZ)V")
	public final void method5012(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean407 != arg0) {
			this.aBoolean407 = arg0;
			this.method5030();
		}
	}

	@OriginalMember(owner = "client!rl", name = "Y", descriptor = "(I)V")
	private void method5013() {
		if (this.aBoolean415) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray60;
		this.aBoolean415 = true;
		if (this.anInt5688 != 0 && this.anInt5782 != 0) {
			local5[4] = 0.0F;
			local5[9] = 0.0F;
			local5[7] = 0.0F;
			local5[1] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt5782;
			local5[12] = -1.0F;
			local5[15] = 1.0F;
			local5[8] = 0.0F;
			local5[10] = 0.5F;
			local5[0] = 2.0F / (float) this.anInt5688;
			local5[11] = 0.0F;
			local5[2] = 0.0F;
			local5[14] = 0.5F;
			local5[6] = 0.0F;
			local5[3] = 0.0F;
			local5[13] = 1.0F;
			return;
		}
		local5[8] = 0.0F;
		local5[5] = 1.0F;
		local5[7] = 0.0F;
		local5[1] = 0.0F;
		local5[6] = 0.0F;
		local5[4] = 0.0F;
		local5[12] = 0.0F;
		local5[3] = 0.0F;
		local5[9] = 0.0F;
		local5[15] = 1.0F;
		local5[10] = 1.0F;
		local5[2] = 0.0F;
		local5[0] = 1.0F;
		local5[14] = 0.0F;
		local5[11] = 0.0F;
		local5[13] = 0.0F;
	}

	@OriginalMember(owner = "client!rl", name = "Z", descriptor = "(I)V")
	private void method5014() {
		this.anInterface22_14 = this.method4925(false);
		this.anInterface22_14.method1387(28, 140);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface22_14.method1389();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method4986(local28);
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
				local35.b();
				if (this.anInterface22_14.method1390()) {
					break;
				}
			}
		}
		this.aClass43_23 = this.method4976(new Class268[] { new Class268(new Class279[] { Static458.aClass279_1, Static458.aClass279_5, Static458.aClass279_5 }) });
	}

	@OriginalMember(owner = "client!rl", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt5821 + this.anInt5818 + this.anInt5820;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6140(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas9 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method4992(this.aHashtable5.get(arg0), arg0);
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!rl", name = "ab", descriptor = "(I)F")
	protected abstract float method5015();

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5828 == arg0 && this.anInt5827 == arg1) {
			return;
		}
		this.anInt5828 = arg0;
		this.anInt5827 = arg1;
		this.method4937();
		this.method5017();
		this.method4936();
	}

	@OriginalMember(owner = "client!rl", name = "bb", descriptor = "(I)V")
	private void method5016() {
		if (this.aCanvas10 == null) {
			this.anInt5752 = this.anInt5802 = 1;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas10.getSize();
			this.anInt5802 = local14.height;
			this.anInt5752 = local14.width;
		}
		this.anInt5688 = this.anInt5752;
		this.anInt5782 = this.anInt5802;
		this.method5027();
		this.method4937();
		this.method5017();
		this.method4959();
		this.method4964();
		this.method4918();
		this.la();
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "()V")
	@Override
	public final void method6118() {
		if (this.aClass109_3 != null) {
			this.aClass109_3.method2755();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIZ)Lclient!fd;")
	@Override
	public final Class103 method6144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class103_Sub3 local11 = new Class103_Sub3(this, arg2, arg3, arg4);
		local11.method7443(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "(B)V")
	private void method5017() {
		this.aBoolean416 = false;
		this.method4916();
		if (Static204.aClass117_4 == this.aClass117_7) {
			this.method4977();
		}
	}

	@OriginalMember(owner = "client!rl", name = "cb", descriptor = "(I)V")
	private void method5018() {
		if (this.aClass117_7 == Static204.aClass117_4) {
			return;
		}
		@Pc(6) Class117 local6 = this.aClass117_7;
		this.aClass117_7 = Static204.aClass117_4;
		if (!local6.method2812()) {
			this.method4969();
		}
		this.method4916();
		this.aFloatArray59 = this.aFloatArray61;
		this.method4977();
		this.anInt5823 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IF)V")
	public final void method5019(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat129) {
			this.aFloat129 = arg0;
			this.method5017();
		}
	}

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "(B)V")
	public final void method5020() {
		if (this.anInt5823 == 16) {
			return;
		}
		this.method5018();
		this.method4982(true);
		this.method4997(true);
		this.method4968(true);
		this.method4939(1);
		this.anInt5823 = 16;
	}

	@OriginalMember(owner = "client!rl", name = "db", descriptor = "(I)I")
	public final int method5021() {
		return this.anInt5834;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([IIZIB)Lclient!dg;")
	public final Interface6 method5022(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		return this.method4922(0, 0, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "(I)V")
	@Override
	public final void method6165(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method6114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method6173(@OriginalArg(0) Class3_Sub45 arg0) {
		this.aNativeHeap4 = ((Class3_Sub45_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer6 = this.aNativeHeap4.a(32768, false);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!wi;II)V")
	public abstract void method5023(@OriginalArg(1) Class376 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!rl", name = "eb", descriptor = "(I)I")
	public final int method5025() {
		return this.anInt5859;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(IB)Lclient!js;")
	public final Interface12 method5026(@OriginalArg(0) int arg0) {
		if (this.anInterface12_6.method7561() < arg0 * 2) {
			this.anInterface12_6.method7563(arg0);
		}
		return this.anInterface12_6;
	}

	@OriginalMember(owner = "client!rl", name = "fb", descriptor = "(I)V")
	private void method5027() {
		this.aBoolean415 = false;
		if (Static254.aClass117_2 == this.aClass117_7) {
			this.method5013();
			this.method4977();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ip;ZI)V")
	public final void method5028(@OriginalArg(0) Class165 arg0, @OriginalArg(2) int arg1) {
		this.method4953(arg1, arg0);
	}

	@OriginalMember(owner = "client!rl", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean405 = arg0;
		this.method4979();
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(BZ)V")
	public final void method5029(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean417 != arg0) {
			this.aBoolean417 = arg0;
			this.method5030();
			this.anInt5823 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!rl", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean409 = false;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[Lclient!tj;)V")
	@Override
	public final void method6100(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub22Array4[local7] = arg1[local7];
		}
		this.anInt5860 = arg0;
		if (this.aClass117_7.method2812()) {
			this.method4954();
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6149(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas9) {
			local5 = this.anObject16;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method4962(local5, arg0);
		if (arg0 == this.aCanvas10) {
			this.method5016();
		}
	}

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "(B)V")
	protected abstract void method5030();

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method6179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method5015();
		this.method4907();
		this.method4933(arg4);
		this.method4928(0, Static302.aClass165_1);
		this.method5028(Static302.aClass165_1, 0);
		this.method4939(arg5);
		this.aClass31_Sub2_15.method7672(1.0F, (float) (arg3 - 1), (float) (arg2 - 1));
		this.aClass31_Sub2_15.method7661(0.0F, (float) arg0 - local7, (float) arg1 - local7);
		this.method4961();
		this.method4920(false);
		this.method5009(4, Static525.aClass376_7);
		this.method4920(true);
		this.method5028(Static527.aClass165_4, 0);
		this.method4928(0, Static527.aClass165_4);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6123(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
			@Pc(53) Object local53 = this.method4942(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(Z)V")
	private void method5032() {
		if (Static254.aClass117_2 == this.aClass117_7) {
			@Pc(7) float local7 = this.method5015();
			this.aClass31_Sub2_15.method7661(0.0F, local7, local7);
		}
		this.aBoolean410 = false;
		this.method4906();
		if (this.aClass19_3 != null) {
			this.aClass19_3.method8279();
		}
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(Z)V")
	public final void method5033() {
		this.aClass88Array5 = new Class88[this.anInt5850];
		this.aClass193Array3 = new Class193[this.anInt5850];
		this.aClass88Array6 = new Class88[this.anInt5850];
		this.aClass31_Sub2Array3 = new Class31_Sub2[this.anInt5850];
		this.anInterface10Array3 = new Interface10[this.anInt5850];
		for (@Pc(32) int local32 = 0; local32 < this.anInt5850; local32++) {
			this.aClass88Array6[local32] = Static131.aClass88_1;
			this.aClass88Array5[local32] = Static131.aClass88_1;
			this.aClass193Array3[local32] = Static466.aClass193_6;
			this.aClass31_Sub2Array3[local32] = new Class31_Sub2();
		}
		this.aClass3_Sub22Array4 = new Class3_Sub22[this.anInt5856 - 2];
		this.anInterface10_3 = this.method5008(1, 1, Static280.aClass182_8, Static95.aClass168_2);
		this.method6173(new Class3_Sub45_Sub2(262144));
		this.aClass43_22 = this.method4976(new Class268[] { new Class268(new Class279[] { Static458.aClass279_1, Static458.aClass279_5 }) });
		this.aClass43_17 = this.method4976(new Class268[] { new Class268(new Class279[] { Static458.aClass279_1, Static458.aClass279_3 }) });
		this.aClass43_21 = this.method4976(new Class268[] { new Class268(Static458.aClass279_1), new Class268(Static458.aClass279_3), new Class268(Static458.aClass279_5), new Class268(Static458.aClass279_2) });
		this.aClass43_18 = this.method4976(new Class268[] { new Class268(Static458.aClass279_1), new Class268(Static458.aClass279_3), new Class268(Static458.aClass279_5) });
		this.aClass75_Sub3_27 = new Class75_Sub3(this, 0, 0, false, false);
		this.aClass75_Sub3_30 = new Class75_Sub3(this, 0, 0, true, true);
		this.aClass75_Sub3_22 = new Class75_Sub3(this, 0, 0, false, false);
		this.aClass75_Sub3_28 = new Class75_Sub3(this, 0, 0, true, true);
		this.aClass75_Sub3_21 = new Class75_Sub3(this, 0, 0, false, false);
		this.aClass75_Sub3_26 = new Class75_Sub3(this, 0, 0, true, true);
		this.aClass75_Sub3_25 = new Class75_Sub3(this, 0, 0, false, false);
		this.aClass75_Sub3_23 = new Class75_Sub3(this, 0, 0, true, true);
		this.aClass75_Sub3_24 = new Class75_Sub3(this, 0, 0, false, false);
		this.aClass75_Sub3_29 = new Class75_Sub3(this, 0, 0, true, true);
		this.aClass147_3 = new Class147(this);
		this.anInterface12_6 = this.method4985(true);
		this.method4926();
		this.lb = new Class96(this);
		this.aClass19Array3[1] = this.method4966(1);
		this.aClass19Array3[2] = this.method4966(2);
		this.aClass19Array3[4] = this.method4966(4);
		this.aClass19Array3[5] = this.method4966(5);
		this.aClass19Array3[6] = this.method4966(6);
		this.aClass19Array3[7] = this.method4966(7);
		this.aClass19Array3[3] = this.method4966(3);
		this.aClass19Array3[8] = this.method4966(8);
		this.aClass19Array3[9] = this.method4966(9);
		if (!this.aClass19Array3[2].method8282()) {
			this.aClass19Array3[2] = this.method4966(0);
		}
		if (!this.aClass19Array3[4].method8282()) {
			this.aClass19Array3[4] = this.aClass19Array3[2];
		}
		if (!this.aClass19Array3[8].method8282()) {
			this.aClass19Array3[8] = this.aClass19Array3[4];
		}
		if (!this.aClass19Array3[9].method8282()) {
			this.aClass19Array3[9] = this.aClass19Array3[8];
		}
		this.method5037();
		this.la();
		this.method6153();
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)Lclient!za;")
	@Override
	public final Class3_Sub45 method6138(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub45_Sub2 local8 = new Class3_Sub45_Sub2(arg0);
		this.aClass216_45.method5449(local8);
		return local8;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZILclient!ip;Z)V")
	public abstract void method5034(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class165 arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	@Override
	public final void method6098(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFFFBFF)Z")
	private boolean method5035(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface22_13.method1389();
		if (local9 == null) {
			return false;
		}
		@Pc(24) Stream local24 = this.method4986(local9);
		if (Stream.c()) {
			local24.a(arg3);
			local24.a(arg5);
			local24.a(arg4);
			local24.a(arg0);
			local24.a(arg2);
			local24.a(arg1);
		} else {
			local24.b(arg3);
			local24.b(arg5);
			local24.b(arg4);
			local24.b(arg0);
			local24.b(arg2);
			local24.b(arg1);
		}
		local24.b();
		return this.anInterface22_13.method1390();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class91 method6139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class91_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!rl", name = "gb", descriptor = "(I)V")
	protected final void method5036() {
		@Pc(9) Enumeration local9 = this.aHashtable5.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method4992(this.aHashtable5.get(local15), local15);
		}
		this.anInterface22_14.method7572();
		this.anInterface22_13.method7572();
		this.anInterface22_12.method7572();
		this.aClass75_Sub3_30.method6817();
		this.aClass75_Sub3_28.method6817();
		this.aClass75_Sub3_26.method6817();
		this.aClass75_Sub3_23.method6817();
		this.aClass75_Sub3_29.method6817();
		this.aClass147_3.method3777();
		this.anInterface12_6.method7572();
	}

	@OriginalMember(owner = "client!rl", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt5688 - 1 <= arg2 && arg1 <= 0 && arg3 >= this.anInt5782 - 1) {
			this.la();
			return;
		}
		this.anInt5848 = arg0 < 0 ? 0 : arg0;
		this.anInt5849 = arg3 <= this.anInt5688 ? arg3 : 0;
		this.anInt5852 = arg1 < 0 ? 0 : arg1;
		this.anInt5833 = this.anInt5688 < arg2 ? 0 : arg2;
		if (!this.aBoolean423) {
			this.aBoolean423 = true;
			this.method4943();
		}
		this.method4929();
		this.method4964();
	}

	@OriginalMember(owner = "client!rl", name = "hb", descriptor = "(I)V")
	protected void method5037() {
		this.method4927();
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V")
	@Override
	public final void method6128(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "(II)V")
	public abstract void method5038(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "(B)V")
	public final void method5039() {
		if (this.anInt5823 == 2) {
			return;
		}
		this.method4998();
		this.method4982(false);
		this.method5029(false);
		this.method4997(false);
		this.method4968(false);
		this.method4988(false, false, -2);
		this.anInt5823 = 2;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(IIIIII)Lclient!he;")
	@Override
	public final Class141 method6168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class141_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rl", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass31_Sub2_16.aFloat172 + (float) arg2 * this.aClass31_Sub2_16.aFloat168 + this.aClass31_Sub2_16.aFloat173 * (float) arg0 + (float) arg1 * this.aClass31_Sub2_16.aFloat176;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass31_Sub2_16.aFloat172 + (float) arg4 * this.aClass31_Sub2_16.aFloat176 + (float) arg3 * this.aClass31_Sub2_16.aFloat173 + this.aClass31_Sub2_16.aFloat168 * (float) arg5;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt5828 > local32 && local63 < (float) this.anInt5828) {
			local7 |= 0x10;
		} else if ((float) this.anInt5827 < local32 && local63 > (float) this.anInt5827) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt5835 * (this.aClass31_Sub2_16.aFloat175 * (float) arg2 + this.aClass31_Sub2_16.aFloat171 * (float) arg1 + (float) arg0 * this.aClass31_Sub2_16.aFloat174 + this.aClass31_Sub2_16.aFloat177) / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt5835 * (this.aClass31_Sub2_16.aFloat177 + (float) arg5 * this.aClass31_Sub2_16.aFloat175 + this.aClass31_Sub2_16.aFloat174 * (float) arg3 + this.aClass31_Sub2_16.aFloat171 * (float) arg4) / local63);
		if ((float) local135 < this.aFloat133 && (float) local167 < this.aFloat133) {
			local7 |= 0x1;
		} else if (this.aFloat125 < (float) local135 && this.aFloat125 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) (((float) arg0 * this.aClass31_Sub2_16.aFloat169 + (float) arg1 * this.aClass31_Sub2_16.aFloat167 + (float) arg2 * this.aClass31_Sub2_16.aFloat178 + this.aClass31_Sub2_16.aFloat170) * (float) this.anInt5847 / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt5847 * (this.aClass31_Sub2_16.aFloat170 + this.aClass31_Sub2_16.aFloat169 * (float) arg3 + this.aClass31_Sub2_16.aFloat167 * (float) arg4 + this.aClass31_Sub2_16.aFloat178 * (float) arg5) / local63);
		if (this.aFloat134 > (float) local233 && this.aFloat134 > (float) local265) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat128 && this.aFloat128 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([IIIIIZ)Lclient!fd;")
	@Override
	public final Class103 method6180(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class103_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "(Z)V")
	protected abstract void method5040();

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "(B)V")
	public final void method5041() {
		this.method4918();
		this.method4977();
	}
}
