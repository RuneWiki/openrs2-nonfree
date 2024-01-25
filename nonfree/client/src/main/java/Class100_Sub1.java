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

@OriginalClass("client!gca")
public abstract class Class100_Sub1 extends Class100 {

	@OriginalMember(owner = "client!gca", name = "Ae", descriptor = "Lclient!b;")
	protected Class24 aClass24_7;

	@OriginalMember(owner = "client!gca", name = "Ze", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable14;

	@OriginalMember(owner = "client!gca", name = "Od", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!gca", name = "Sb", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!gca", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!gca", name = "tc", descriptor = "I")
	public int anInt9220;

	@OriginalMember(owner = "client!gca", name = "ne", descriptor = "I")
	protected int anInt9223;

	@OriginalMember(owner = "client!gca", name = "qb", descriptor = "I")
	public int anInt9226;

	@OriginalMember(owner = "client!gca", name = "K", descriptor = "Z")
	public boolean aBoolean606;

	@OriginalMember(owner = "client!gca", name = "E", descriptor = "Z")
	public boolean aBoolean608;

	@OriginalMember(owner = "client!gca", name = "vd", descriptor = "I")
	protected int anInt9228;

	@OriginalMember(owner = "client!gca", name = "Ye", descriptor = "Lclient!aea;")
	private Class7 aClass7_3;

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "Lclient!ln;")
	public Interface19 anInterface19_3;

	@OriginalMember(owner = "client!gca", name = "de", descriptor = "F")
	private float aFloat169;

	@OriginalMember(owner = "client!gca", name = "T", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!gca", name = "Df", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!gca", name = "qd", descriptor = "Z")
	protected boolean aBoolean613;

	@OriginalMember(owner = "client!gca", name = "Rb", descriptor = "F")
	private float aFloat174;

	@OriginalMember(owner = "client!gca", name = "M", descriptor = "[Lclient!ak;")
	protected Class16[] aClass16Array3;

	@OriginalMember(owner = "client!gca", name = "id", descriptor = "[Lclient!ih;")
	protected Class5_Sub12[] aClass5_Sub12Array5;

	@OriginalMember(owner = "client!gca", name = "Eb", descriptor = "I")
	public int anInt9238;

	@OriginalMember(owner = "client!gca", name = "xf", descriptor = "I")
	protected int anInt9240;

	@OriginalMember(owner = "client!gca", name = "W", descriptor = "F")
	public float aFloat176;

	@OriginalMember(owner = "client!gca", name = "Dd", descriptor = "Z")
	public boolean aBoolean617;

	@OriginalMember(owner = "client!gca", name = "gg", descriptor = "[Lclient!eh;")
	protected Class94[] aClass94Array5;

	@OriginalMember(owner = "client!gca", name = "Qe", descriptor = "I")
	private int anInt9248;

	@OriginalMember(owner = "client!gca", name = "ag", descriptor = "F")
	public float aFloat180;

	@OriginalMember(owner = "client!gca", name = "Kb", descriptor = "I")
	public int anInt9250;

	@OriginalMember(owner = "client!gca", name = "fg", descriptor = "I")
	public int anInt9254;

	@OriginalMember(owner = "client!gca", name = "rc", descriptor = "[Lclient!eh;")
	protected Class94[] aClass94Array6;

	@OriginalMember(owner = "client!gca", name = "vg", descriptor = "Z")
	protected boolean aBoolean619;

	@OriginalMember(owner = "client!gca", name = "zg", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!gca", name = "xd", descriptor = "F")
	public float aFloat182;

	@OriginalMember(owner = "client!gca", name = "hb", descriptor = "I")
	public int anInt9259;

	@OriginalMember(owner = "client!gca", name = "Td", descriptor = "[Lclient!ln;")
	private Interface19[] anInterface19Array3;

	@OriginalMember(owner = "client!gca", name = "jf", descriptor = "[Lclient!eba;")
	protected Class10_Sub2[] aClass10_Sub2Array3;

	@OriginalMember(owner = "client!gca", name = "cg", descriptor = "I")
	protected int anInt9262;

	@OriginalMember(owner = "client!gca", name = "ve", descriptor = "Lclient!qba;")
	private Class48 aClass48_3;

	@OriginalMember(owner = "client!gca", name = "Jc", descriptor = "Lclient!ul;")
	private Class185_Sub2 aClass185_Sub2_3;

	@OriginalMember(owner = "client!gca", name = "Ee", descriptor = "I")
	private int anInt9265;

	@OriginalMember(owner = "client!gca", name = "C", descriptor = "I")
	protected int anInt9266;

	@OriginalMember(owner = "client!gca", name = "qg", descriptor = "Lclient!gaa;")
	public Class124 aClass124_17;

	@OriginalMember(owner = "client!gca", name = "vb", descriptor = "Lclient!gaa;")
	private Class124 aClass124_18;

	@OriginalMember(owner = "client!gca", name = "gf", descriptor = "Lclient!fk;")
	private Interface15 anInterface15_15;

	@OriginalMember(owner = "client!gca", name = "wd", descriptor = "Lclient!fk;")
	private Interface15 anInterface15_16;

	@OriginalMember(owner = "client!gca", name = "Dc", descriptor = "Lclient!gaa;")
	public Class124 aClass124_19;

	@OriginalMember(owner = "client!gca", name = "kd", descriptor = "Lclient!vm;")
	public Class43_Sub3 aClass43_Sub3_21;

	@OriginalMember(owner = "client!gca", name = "ec", descriptor = "Lclient!gaa;")
	private Class124 aClass124_20;

	@OriginalMember(owner = "client!gca", name = "Vc", descriptor = "Lclient!vm;")
	public Class43_Sub3 aClass43_Sub3_22;

	@OriginalMember(owner = "client!gca", name = "sc", descriptor = "Lclient!gaa;")
	private Class124 aClass124_21;

	@OriginalMember(owner = "client!gca", name = "qe", descriptor = "Lclient!vm;")
	public Class43_Sub3 aClass43_Sub3_23;

	@OriginalMember(owner = "client!gca", name = "Mf", descriptor = "Lclient!fk;")
	private Interface15 anInterface15_17;

	@OriginalMember(owner = "client!gca", name = "Sc", descriptor = "Lclient!lp;")
	private Interface20 anInterface20_8;

	@OriginalMember(owner = "client!gca", name = "pg", descriptor = "Lclient!gaa;")
	public Class124 aClass124_22;

	@OriginalMember(owner = "client!gca", name = "Ed", descriptor = "Lclient!vm;")
	public Class43_Sub3 aClass43_Sub3_24;

	@OriginalMember(owner = "client!gca", name = "dc", descriptor = "Lclient!gaa;")
	public Class124 aClass124_23;

	@OriginalMember(owner = "client!gca", name = "tf", descriptor = "Lclient!vm;")
	public Class43_Sub3 aClass43_Sub3_25;

	@OriginalMember(owner = "client!gca", name = "ed", descriptor = "Lclient!vm;")
	public Class43_Sub3 aClass43_Sub3_26;

	@OriginalMember(owner = "client!gca", name = "U", descriptor = "Lclient!vm;")
	public Class43_Sub3 aClass43_Sub3_27;

	@OriginalMember(owner = "client!gca", name = "te", descriptor = "Lclient!vm;")
	public Class43_Sub3 aClass43_Sub3_28;

	@OriginalMember(owner = "client!gca", name = "ye", descriptor = "Lclient!vm;")
	public Class43_Sub3 aClass43_Sub3_29;

	@OriginalMember(owner = "client!gca", name = "Fc", descriptor = "Lclient!vm;")
	public Class43_Sub3 aClass43_Sub3_30;

	@OriginalMember(owner = "client!gca", name = "Xc", descriptor = "I")
	private int anInt9267;

	@OriginalMember(owner = "client!gca", name = "pc", descriptor = "Z")
	protected boolean aBoolean626;

	@OriginalMember(owner = "client!gca", name = "wb", descriptor = "Lclient!at;")
	private final Class20 aClass20_52 = new Class20();

	@OriginalMember(owner = "client!gca", name = "pb", descriptor = "Z")
	protected boolean aBoolean605 = true;

	@OriginalMember(owner = "client!gca", name = "Uf", descriptor = "Lclient!eba;")
	protected final Class10_Sub2 aClass10_Sub2_15 = new Class10_Sub2();

	@OriginalMember(owner = "client!gca", name = "Vf", descriptor = "Lclient!eba;")
	public Class10_Sub2 aClass10_Sub2_16 = new Class10_Sub2();

	@OriginalMember(owner = "client!gca", name = "Q", descriptor = "Lclient!eba;")
	public final Class10_Sub2 aClass10_Sub2_17 = new Class10_Sub2();

	@OriginalMember(owner = "client!gca", name = "rf", descriptor = "Lclient!eba;")
	protected final Class10_Sub2 aClass10_Sub2_18 = new Class10_Sub2();

	@OriginalMember(owner = "client!gca", name = "lf", descriptor = "Lclient!eba;")
	private final Class10_Sub2 aClass10_Sub2_19 = new Class10_Sub2();

	@OriginalMember(owner = "client!gca", name = "gb", descriptor = "Lclient!eba;")
	private final Class10_Sub2 aClass10_Sub2_20 = new Class10_Sub2();

	@OriginalMember(owner = "client!gca", name = "wg", descriptor = "F")
	public float aFloat168 = -1.0F;

	@OriginalMember(owner = "client!gca", name = "Wd", descriptor = "I")
	protected int anInt9229 = 3584;

	@OriginalMember(owner = "client!gca", name = "hf", descriptor = "I")
	public int anInt9231 = 50;

	@OriginalMember(owner = "client!gca", name = "ab", descriptor = "Z")
	protected boolean aBoolean607 = true;

	@OriginalMember(owner = "client!gca", name = "Ke", descriptor = "Z")
	private boolean aBoolean609 = false;

	@OriginalMember(owner = "client!gca", name = "Qf", descriptor = "Z")
	protected boolean aBoolean610 = false;

	@OriginalMember(owner = "client!gca", name = "Jf", descriptor = "I")
	public int anInt9236 = -1;

	@OriginalMember(owner = "client!gca", name = "Kd", descriptor = "I")
	private int anInt9230 = 0;

	@OriginalMember(owner = "client!gca", name = "Me", descriptor = "Z")
	private boolean aBoolean616 = false;

	@OriginalMember(owner = "client!gca", name = "xc", descriptor = "I")
	private int anInt9234 = 0;

	@OriginalMember(owner = "client!gca", name = "Fb", descriptor = "I")
	private int anInt9237 = 0;

	@OriginalMember(owner = "client!gca", name = "Af", descriptor = "Lclient!hd;")
	protected Class146 aClass146_8 = Static375.aClass146_5;

	@OriginalMember(owner = "client!gca", name = "jc", descriptor = "[F")
	public final float[] aFloatArray65 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!gca", name = "De", descriptor = "I")
	private int anInt9243 = -1;

	@OriginalMember(owner = "client!gca", name = "ge", descriptor = "[F")
	private final float[] aFloatArray62 = new float[16];

	@OriginalMember(owner = "client!gca", name = "Te", descriptor = "I")
	protected final int anInt9244 = 0;

	@OriginalMember(owner = "client!gca", name = "td", descriptor = "F")
	public float aFloat179 = 1.0F;

	@OriginalMember(owner = "client!gca", name = "B", descriptor = "I")
	private int anInt9242 = -1;

	@OriginalMember(owner = "client!gca", name = "Ud", descriptor = "[F")
	private final float[] aFloatArray63 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!gca", name = "eb", descriptor = "F")
	public float aFloat171 = 3584.0F;

	@OriginalMember(owner = "client!gca", name = "S", descriptor = "I")
	protected final int anInt9247 = 0;

	@OriginalMember(owner = "client!gca", name = "kc", descriptor = "F")
	public float aFloat175 = 1.0F;

	@OriginalMember(owner = "client!gca", name = "Hc", descriptor = "[F")
	private final float[] aFloatArray66 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!gca", name = "re", descriptor = "I")
	public int anInt9233 = 0;

	@OriginalMember(owner = "client!gca", name = "we", descriptor = "F")
	public float aFloat173 = -1.0F;

	@OriginalMember(owner = "client!gca", name = "Be", descriptor = "I")
	public int anInt9232 = 8;

	@OriginalMember(owner = "client!gca", name = "Ld", descriptor = "I")
	protected int anInt9241 = 0;

	@OriginalMember(owner = "client!gca", name = "Ce", descriptor = "F")
	public float aFloat178 = 1.0F;

	@OriginalMember(owner = "client!gca", name = "Pe", descriptor = "Z")
	protected boolean aBoolean615 = false;

	@OriginalMember(owner = "client!gca", name = "vf", descriptor = "I")
	public int anInt9257 = 3;

	@OriginalMember(owner = "client!gca", name = "ze", descriptor = "I")
	protected int anInt9253 = 0;

	@OriginalMember(owner = "client!gca", name = "Hf", descriptor = "I")
	protected int anInt9251 = 0;

	@OriginalMember(owner = "client!gca", name = "sf", descriptor = "F")
	public float aFloat177 = 1.0F;

	@OriginalMember(owner = "client!gca", name = "ue", descriptor = "[F")
	public final float[] aFloatArray67 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!gca", name = "lc", descriptor = "I")
	private int anInt9261 = 0;

	@OriginalMember(owner = "client!gca", name = "ob", descriptor = "I")
	public int anInt9246 = 0;

	@OriginalMember(owner = "client!gca", name = "lg", descriptor = "I")
	private int anInt9252 = 16777215;

	@OriginalMember(owner = "client!gca", name = "O", descriptor = "Z")
	protected boolean aBoolean614 = true;

	@OriginalMember(owner = "client!gca", name = "md", descriptor = "[F")
	private final float[] aFloatArray69 = new float[16];

	@OriginalMember(owner = "client!gca", name = "P", descriptor = "Z")
	protected boolean aBoolean618 = true;

	@OriginalMember(owner = "client!gca", name = "zf", descriptor = "[Lclient!qba;")
	private final Class48[] aClass48Array3 = new Class48[10];

	@OriginalMember(owner = "client!gca", name = "bd", descriptor = "Z")
	protected boolean aBoolean621 = false;

	@OriginalMember(owner = "client!gca", name = "Ge", descriptor = "[F")
	protected float[] aFloatArray64 = this.aFloatArray63;

	@OriginalMember(owner = "client!gca", name = "jb", descriptor = "Z")
	protected boolean aBoolean611 = false;

	@OriginalMember(owner = "client!gca", name = "X", descriptor = "[F")
	private final float[] aFloatArray68 = new float[16];

	@OriginalMember(owner = "client!gca", name = "rd", descriptor = "[F")
	private final float[] aFloatArray70 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!gca", name = "xe", descriptor = "Z")
	private boolean aBoolean612 = false;

	@OriginalMember(owner = "client!gca", name = "N", descriptor = "Z")
	private boolean aBoolean620 = false;

	@OriginalMember(owner = "client!gca", name = "Cb", descriptor = "I")
	public int anInt9258 = 512;

	@OriginalMember(owner = "client!gca", name = "Rf", descriptor = "I")
	private int anInt9263 = 1;

	@OriginalMember(owner = "client!gca", name = "kg", descriptor = "I")
	public int anInt9264 = 0;

	@OriginalMember(owner = "client!gca", name = "Db", descriptor = "I")
	public int anInt9235 = 128;

	@OriginalMember(owner = "client!gca", name = "qf", descriptor = "I")
	protected int anInt9245 = 0;

	@OriginalMember(owner = "client!gca", name = "Jd", descriptor = "F")
	private float aFloat183 = 1.0F;

	@OriginalMember(owner = "client!gca", name = "eg", descriptor = "I")
	public int anInt9255 = -1;

	@OriginalMember(owner = "client!gca", name = "Cc", descriptor = "Z")
	private boolean aBoolean622 = false;

	@OriginalMember(owner = "client!gca", name = "zd", descriptor = "I")
	public int anInt9249 = 512;

	@OriginalMember(owner = "client!gca", name = "Vb", descriptor = "F")
	public float aFloat184 = 3584.0F;

	@OriginalMember(owner = "client!gca", name = "J", descriptor = "I")
	protected int anInt9260 = 0;

	@OriginalMember(owner = "client!gca", name = "of", descriptor = "I")
	private int anInt9256 = -1;

	@OriginalMember(owner = "client!gca", name = "Sf", descriptor = "Z")
	protected boolean aBoolean625 = true;

	@OriginalMember(owner = "client!gca", name = "Fd", descriptor = "Z")
	private boolean aBoolean623 = false;

	@OriginalMember(owner = "client!gca", name = "yg", descriptor = "Lclient!eu;")
	protected Class102 aClass102_7 = Static381.aClass102_6;

	@OriginalMember(owner = "client!gca", name = "nf", descriptor = "Z")
	protected boolean aBoolean624 = true;

	@OriginalMember(owner = "client!gca", name = "uf", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!gca", name = "Kc", descriptor = "Lclient!eba;")
	private final Class10_Sub2 aClass10_Sub2_21 = new Class10_Sub2();

	@OriginalMember(owner = "client!gca", name = "Gd", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas11;

	@OriginalMember(owner = "client!gca", name = "ke", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!gca", name = "hc", descriptor = "Lclient!gda;")
	protected final Class126 aClass126_262;

	@OriginalMember(owner = "client!gca", name = "Kf", descriptor = "Ljava/lang/Object;")
	protected final Object anObject17;

	@OriginalMember(owner = "client!gca", name = "Ff", descriptor = "Ljava/lang/Object;")
	private Object anObject16;

	@OriginalMember(owner = "client!gca", name = "Xd", descriptor = "I")
	protected final int anInt9239;

	@OriginalMember(owner = "client!gca", name = "We", descriptor = "I")
	private int anInt9144;

	@OriginalMember(owner = "client!gca", name = "w", descriptor = "I")
	public int anInt9118;

	@OriginalMember(owner = "client!gca", name = "sg", descriptor = "I")
	public final int anInt9227;

	@OriginalMember(owner = "client!gca", name = "x", descriptor = "I")
	private int anInt9156;

	@OriginalMember(owner = "client!gca", name = "Ne", descriptor = "I")
	public int anInt9057;

	@OriginalMember(owner = "client!gca", name = "Z", descriptor = "Lclient!gs;")
	private final Class138 aClass138_3;

	@OriginalMember(owner = "client!gca", name = "H", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!gda;II)V")
	protected Class100_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class126 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.aCanvas10 = this.aCanvas11 = arg0;
			this.aClass126_262 = arg3;
			this.anObject16 = this.anObject17 = arg1;
			this.anInt9239 = arg4;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt9118 = this.anInt9144 = local307.width;
			this.anInt9227 = arg5;
			this.anInt9057 = this.anInt9156 = local307.height;
			Static207.method3389(true, false);
			if (super.anInterface7_12 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt9227);
				this.aClass138_3 = null;
			} else {
				this.aClass138_3 = new Class138(this, super.anInterface7_12);
				this.aNativeInterface3 = new NativeInterface(super.anInterface7_12.method7420(), this.anInt9227);
				for (@Pc(352) int local352 = 0; super.anInterface7_12.method7420() > local352; local352++) {
					@Pc(360) Class44 local360 = super.anInterface7_12.method7423(local352);
					if (local360 != null) {
						this.aNativeInterface3.initTextureMetrics(local352, local360.aByte17, local360.aByte22);
					}
				}
			}
		} catch (@Pc(394) Throwable local394) {
			local394.printStackTrace();
			this.method8666();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!gca", name = "O", descriptor = "(I)Lclient!eba;")
	public final Class10_Sub2 method7861() {
		return this.aClass10_Sub2_18;
	}

	@OriginalMember(owner = "client!gca", name = "C", descriptor = "(I)Lclient!eba;")
	public final Class10_Sub2 method7862() {
		return this.aClass10_Sub2Array3[this.anInt9241];
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!jj;BI)V")
	private void method7863(@OriginalArg(0) Class187 arg0, @OriginalArg(2) int arg1) {
		this.method7868(this.anInterface15_15, 0);
		this.method7921(this.aClass124_18);
		this.method7986(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "()V")
	@Override
	protected void method8653() {
		if (this.aBoolean616) {
			return;
		}
		for (@Pc(9) Class5 local9 = this.aClass20_52.method378(); local9 != null; local9 = this.aClass20_52.method366()) {
			((Class5_Sub42_Sub2) local9).method6375();
		}
		@Pc(28) Enumeration local28 = this.aHashtable14.keys();
		while (local28.hasMoreElements()) {
			@Pc(38) Canvas local38 = (Canvas) local28.nextElement();
			this.method7899(local38, this.aHashtable14.get(local38));
		}
		Static616.method8461(false, true);
		this.aNativeInterface3.release();
		this.aBoolean616 = true;
	}

	@OriginalMember(owner = "client!gca", name = "v", descriptor = "(B)V")
	protected abstract void method7864();

	@OriginalMember(owner = "client!gca", name = "y", descriptor = "(I)V")
	protected abstract void method7865();

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "(Z)V")
	private void method7866() {
		this.aFloat182 = (float) (this.anInt9253 - this.anInt9246);
		this.aFloat181 = (float) (this.anInt9251 - this.anInt9233);
		this.aFloat172 = (float) (this.anInt9245 - this.anInt9246);
		this.aFloat180 = (float) (this.anInt9260 - this.anInt9233);
	}

	@OriginalMember(owner = "client!gca", name = "n", descriptor = "(Z)V")
	protected abstract void method7867();

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!sn;I)V")
	@Override
	public final void method8618(@OriginalArg(0) Class336 arg0, @OriginalArg(1) int arg1) {
		this.aClass7_3.method146(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!fk;II)V")
	public abstract void method7868(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "(I)V")
	private void method7869() {
		if (this.aBoolean609) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray68;
		if (this.anInt9118 == 0 || this.anInt9057 == 0) {
			local5[3] = 0.0F;
			local5[14] = 0.0F;
			local5[7] = 0.0F;
			local5[2] = 0.0F;
			local5[1] = 0.0F;
			local5[15] = 1.0F;
			local5[9] = 0.0F;
			local5[13] = 0.0F;
			local5[11] = 0.0F;
			local5[5] = 1.0F;
			local5[0] = 1.0F;
			local5[4] = 0.0F;
			local5[12] = 0.0F;
			local5[10] = 1.0F;
			local5[6] = 0.0F;
			local5[8] = 0.0F;
		} else {
			local5[13] = 1.0F;
			local5[7] = 0.0F;
			local5[1] = 0.0F;
			local5[12] = -1.0F;
			local5[15] = 1.0F;
			local5[14] = 0.5F;
			local5[8] = 0.0F;
			local5[11] = 0.0F;
			local5[6] = 0.0F;
			local5[4] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt9057;
			local5[0] = 2.0F / (float) this.anInt9118;
			local5[2] = 0.0F;
			local5[3] = 0.0F;
			local5[10] = 0.5F;
			local5[9] = 0.0F;
		}
		this.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!gca", name = "V", descriptor = "(I)V")
	protected abstract void method7870();

	@OriginalMember(owner = "client!gca", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(12) boolean local12 = this.anInt9252 != arg0;
		if (local12 || arg1 != this.aFloat168 || this.aFloat173 != arg2) {
			this.aFloat173 = arg2;
			this.aFloat168 = arg1;
			this.anInt9252 = arg0;
			if (local12) {
				this.aFloat175 = (float) (this.anInt9252 & 0xFF0000) / 1.671168E7F;
				this.aFloat179 = (float) (this.anInt9252 & 0xFF00) / 65280.0F;
				this.aFloat177 = (float) (this.anInt9252 & 0xFF) / 255.0F;
				this.method7865();
			}
			this.aNativeInterface3.setSunColour(this.aFloat175, this.aFloat179, this.aFloat177, arg1, arg2);
			this.method7989();
		}
		if (this.aFloatArray70[0] != arg3 || this.aFloatArray70[1] != arg4 || this.aFloatArray70[2] != arg5) {
			this.aFloatArray70[0] = arg3;
			this.aFloatArray70[1] = arg4;
			this.aFloatArray70[2] = arg5;
			this.aFloatArray66[2] = -arg5;
			this.aFloatArray66[1] = -arg4;
			this.aFloatArray66[0] = -arg3;
			@Pc(162) float local162 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray67[1] = arg4 * local162;
			this.aFloatArray67[2] = arg5 * local162;
			this.aFloatArray67[0] = arg3 * local162;
			this.aFloatArray65[2] = -this.aFloatArray67[2];
			this.aFloatArray65[0] = -this.aFloatArray67[0];
			this.aFloatArray65[1] = -this.aFloatArray67[1];
			this.aNativeInterface3.setSunDirection(this.aFloatArray67[0], this.aFloatArray67[1], this.aFloatArray67[2]);
			this.method7896();
			this.anInt9238 = (int) (arg5 * 256.0F / arg4);
			this.anInt9254 = (int) (arg3 * 256.0F / arg4);
		}
		this.method7943();
	}

	@OriginalMember(owner = "client!gca", name = "bb", descriptor = "(I)V")
	private void method7871() {
		if (this.aClass48_3 != null) {
			this.aClass48_3.method8937();
		}
		this.method7924();
	}

	@OriginalMember(owner = "client!gca", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat178) {
			this.aFloat178 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method7865();
			this.method7943();
		}
	}

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "()Z")
	@Override
	public final boolean method8661() {
		return false;
	}

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "(I)V")
	@Override
	public final void method8580() {
	}

	@OriginalMember(owner = "client!gca", name = "I", descriptor = "(I)V")
	protected void method7872() {
		this.method7900();
	}

	@OriginalMember(owner = "client!gca", name = "k", descriptor = "(II)V")
	public final void method7873(@OriginalArg(1) int arg0) {
		if (this.anInt9266 != arg0) {
			this.anInt9266 = arg0;
			this.method7906();
		}
	}

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "(B)I")
	public final int method7874() {
		return this.anInt9241;
	}

	@OriginalMember(owner = "client!gca", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass10_Sub2_16.method1689((float) arg2, (float) arg0, (float) arg1);
		@Pc(27) int local27;
		@Pc(30) int local30;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local27 = (int) ((float) this.anInt9249 * this.aClass10_Sub2_16.method1702((float) arg2, (float) arg1, (float) arg0) / local14);
			local30 = (int) ((float) this.anInt9258 * this.aClass10_Sub2_16.method1712((float) arg1, (float) arg2, (float) arg0) / local14);
		} else {
			local27 = this.anInt9233;
			local30 = this.anInt9246;
		}
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local30 - this.aFloat172);
		arg3[0] = (int) ((float) local27 - this.aFloat180);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IZI[II)Lclient!ah;")
	public final Interface2 method7875(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		return this.method7991(0, arg3, arg0, 0, arg2, arg1);
	}

	@OriginalMember(owner = "client!gca", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Interface2 local9 = local6.anInterface2_5;
		this.method7983();
		this.method7923(local9);
		this.method7957(1);
		this.method7904(Static164.aClass94_1, Static164.aClass94_1);
		this.method7970(Static520.aClass93_4, 0);
		this.method7873(arg0);
		this.aClass10_Sub2_15.method1706((float) this.anInt9057, (float) this.anInt9118, 0.0F);
		this.method7992();
		this.aClass10_Sub2Array3[0].method1706(local9.method3685((float) this.anInt9057), local9.method3681((float) this.anInt9118), 1.0F);
		this.aClass10_Sub2Array3[0].method1695(0.0F, local9.method3685((float) -arg3), local9.method3681((float) -arg2));
		this.aClass16Array3[0] = Static475.aClass16_46;
		this.method7978();
		this.method7972();
		this.method7930();
		this.method7970(Static94.aClass93_2, 0);
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "()Lclient!sj;")
	@Override
	public final Class10 method8595() {
		return this.aClass10_Sub2_16;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)Lclient!eba;")
	public final Class10_Sub2 method7877() {
		return this.aClass10_Sub2Array3[this.anInt9241];
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(ZI)V")
	public final void method7878(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean613) {
			this.aBoolean613 = arg0;
			this.method7917();
			this.anInt9248 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public final Class5_Sub42 method8659(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub42_Sub2 local8 = new Class5_Sub42_Sub2(arg0);
		this.aClass20_52.method370(local8);
		return local8;
	}

	@OriginalMember(owner = "client!gca", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9233 = arg0;
		this.anInt9258 = arg3;
		this.anInt9246 = arg1;
		this.anInt9249 = arg2;
		this.method7916();
		this.method7973();
		this.method7903();
		this.method7866();
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method8607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method7932();
		this.method7922();
		this.method7873(arg4);
		this.method7970(Static520.aClass93_4, 0);
		this.method7947(Static520.aClass93_4, 0);
		this.method7957(arg5);
		this.aClass10_Sub2_15.method1706((float) (arg3 - 1), (float) (arg2 - 1), 1.0F);
		this.aClass10_Sub2_15.method1695(0.0F, (float) arg1 - local7, -local7 + (float) arg0);
		this.method7992();
		this.method7967(false);
		this.method7863(Static262.aClass187_3, 4);
		this.method7967(true);
		this.method7947(Static94.aClass93_2, 0);
		this.method7970(Static94.aClass93_2, 0);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B[[IZI)Lclient!oda;")
	public abstract Interface22 method7879(@OriginalArg(1) int[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I[Lclient!ih;)V")
	@Override
	public final void method8609(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub12[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass5_Sub12Array5[local3] = arg1[local3];
		}
		this.anInt9262 = arg0;
		if (this.aClass146_8.method3395()) {
			this.method7931();
		}
	}

	@OriginalMember(owner = "client!gca", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt9267;
	}

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "(B)V")
	protected abstract void method7880();

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IZLclient!ega;B)V")
	protected abstract void method7881(@OriginalArg(0) int arg0, @OriginalArg(2) Class93 arg1);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!kc;IIII)Lclient!ka;")
	@Override
	public final Class43 method8588(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class43_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!gca", name = "i", descriptor = "(I)V")
	@Override
	public final void method8626(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "(II)I")
	@Override
	public final int method8628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IZ)Lclient!lp;")
	public abstract Interface20 method7882(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZLclient!ega;ZII)V")
	public abstract void method7883(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "()Z")
	@Override
	public final boolean method8631() {
		return this.aClass48Array3[3].method8940();
	}

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass10_Sub2_16.aFloat53 + (float) arg0 * this.aClass10_Sub2_16.aFloat48 + this.aClass10_Sub2_16.aFloat44 * (float) arg1 + (float) arg2 * this.aClass10_Sub2_16.aFloat52;
		@Pc(57) float local57 = (float) arg5 * this.aClass10_Sub2_16.aFloat52 + this.aClass10_Sub2_16.aFloat48 * (float) arg3 + (float) arg4 * this.aClass10_Sub2_16.aFloat44 + this.aClass10_Sub2_16.aFloat53;
		if ((float) this.anInt9231 > local32 && (float) this.anInt9231 > local57) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt9229 && local57 > (float) this.anInt9229) {
			local7 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((this.aClass10_Sub2_16.aFloat49 + this.aClass10_Sub2_16.aFloat45 * (float) arg1 + this.aClass10_Sub2_16.aFloat54 * (float) arg0 + this.aClass10_Sub2_16.aFloat50 * (float) arg2) * (float) this.anInt9249 / (float) arg6);
		@Pc(163) int local163 = (int) ((float) this.anInt9249 * (this.aClass10_Sub2_16.aFloat49 + (float) arg3 * this.aClass10_Sub2_16.aFloat54 + this.aClass10_Sub2_16.aFloat45 * (float) arg4 + (float) arg5 * this.aClass10_Sub2_16.aFloat50) / (float) arg6);
		if ((float) local130 < this.aFloat180 && (float) local163 < this.aFloat180) {
			local7 |= 0x1;
		} else if (this.aFloat181 < (float) local130 && (float) local163 > this.aFloat181) {
			local7 |= 0x2;
		}
		@Pc(236) int local236 = (int) ((this.aClass10_Sub2_16.aFloat51 * (float) arg0 + this.aClass10_Sub2_16.aFloat47 * (float) arg1 + (float) arg2 * this.aClass10_Sub2_16.aFloat46 + this.aClass10_Sub2_16.aFloat55) * (float) this.anInt9258 / (float) arg6);
		@Pc(269) int local269 = (int) ((float) this.anInt9258 * (this.aClass10_Sub2_16.aFloat46 * (float) arg5 + (float) arg3 * this.aClass10_Sub2_16.aFloat51 + this.aClass10_Sub2_16.aFloat47 * (float) arg4 + this.aClass10_Sub2_16.aFloat55) / (float) arg6);
		if (this.aFloat172 > (float) local236 && (float) local269 < this.aFloat172) {
			local7 |= 0x4;
		} else if ((float) local236 > this.aFloat182 && this.aFloat182 < (float) local269) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "(Z)V")
	protected abstract void method7884();

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!dn;Lclient!ua;)Z")
	public abstract boolean method7885(@OriginalArg(1) Class86 arg0, @OriginalArg(2) Class358 arg1);

	@OriginalMember(owner = "client!gca", name = "M", descriptor = "(I)I")
	public final int method7886() {
		return this.anInt9230;
	}

	@OriginalMember(owner = "client!gca", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean617 = false;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
	@Override
	public final void method8662(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(ZI)V")
	public final void method7887(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean607) {
			this.aBoolean607 = arg0;
			this.method7917();
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZIZIIB)V")
	private void method7888(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) boolean local8 = arg0 & this.method8631();
		if (!local8 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg4 = 1;
			arg3 = 0;
		}
		if (arg1 != 0 && arg2) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt9234 != arg1) {
			if (this.anInt9234 != 0) {
				this.aClass48Array3[Integer.MAX_VALUE & this.anInt9234].method8934();
			}
			if (arg1 == 0) {
				this.aClass48_3 = null;
			} else {
				this.aClass48_3 = this.aClass48Array3[arg1 & Integer.MAX_VALUE];
				this.aClass48_3.method8938(arg2);
				this.aClass48_3.method8941(arg2);
				this.aClass48_3.method8935(arg3, arg4);
			}
			this.anInt9237 = arg4;
			this.anInt9261 = arg3;
			this.anInt9234 = arg1;
		} else if (this.anInt9234 != 0) {
			this.aClass48Array3[this.anInt9234 & Integer.MAX_VALUE].method8941(arg2);
			if (arg3 != this.anInt9261 || this.anInt9237 != arg4) {
				this.aClass48Array3[Integer.MAX_VALUE & this.anInt9234].method8935(arg3, arg4);
				this.anInt9261 = arg3;
				this.anInt9237 = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "G", descriptor = "(I)V")
	private void method7889() {
		if (this.aBoolean622) {
			return;
		}
		@Pc(16) float[] local16 = this.aFloatArray62;
		@Pc(28) float local28 = (float) (-this.anInt9233 * this.anInt9231) / (float) this.anInt9249;
		@Pc(43) float local43 = (float) ((this.anInt9118 - this.anInt9233) * this.anInt9231) / (float) this.anInt9249;
		@Pc(54) float local54 = (float) (this.anInt9231 * this.anInt9246) / (float) this.anInt9258;
		@Pc(69) float local69 = (float) ((this.anInt9246 - this.anInt9057) * this.anInt9231) / (float) this.anInt9258;
		if (local28 == local43 || local69 == local54) {
			local16[15] = 1.0F;
			local16[5] = 1.0F;
			local16[8] = 0.0F;
			local16[14] = 0.0F;
			local16[3] = 0.0F;
			local16[0] = 1.0F;
			local16[2] = 0.0F;
			local16[13] = 0.0F;
			local16[10] = 1.0F;
			local16[4] = 0.0F;
			local16[11] = 0.0F;
			local16[1] = 0.0F;
			local16[9] = 0.0F;
			local16[12] = 0.0F;
			local16[7] = 0.0F;
			local16[6] = 0.0F;
		} else {
			@Pc(85) float local85 = (float) this.anInt9231 * 2.0F;
			local16[0] = local85 / (local43 - local28);
			local16[6] = 0.0F;
			local16[2] = 0.0F;
			local16[1] = 0.0F;
			local16[15] = 0.0F;
			local16[3] = 0.0F;
			local16[11] = -1.0F;
			local16[10] = this.aFloat174 = (float) this.anInt9229 / (float) (this.anInt9231 - this.anInt9229);
			local16[14] = this.aFloat169 = (float) (this.anInt9231 * this.anInt9229) / (float) (this.anInt9231 - this.anInt9229);
			local16[7] = 0.0F;
			local16[9] = (local54 + local69) / (-local69 + local54);
			local16[13] = 0.0F;
			local16[8] = (local28 + local43) / (-local28 + local43);
			local16[12] = 0.0F;
			local16[4] = 0.0F;
			local16[5] = local85 / (local54 - local69);
		}
		this.method7940();
		this.aBoolean622 = true;
	}

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "(B)V")
	private void method7890() {
		this.anInterface15_16 = this.method7920(true);
		this.anInterface15_16.method5733(24, 12);
		this.aClass124_20 = this.method7981(new Class139[] { new Class139(Static24.aClass21_1) });
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8614(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas11) {
			local5 = this.anObject16;
		} else if (this.aHashtable14.containsKey(arg0)) {
			local5 = this.aHashtable14.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method7977(arg0, local5);
		if (arg0 == this.aCanvas10) {
			this.method7976();
		}
	}

	@OriginalMember(owner = "client!gca", name = "J", descriptor = "(I)V")
	public final void method7891() {
		this.aClass94Array5 = new Class94[this.anInt9250];
		this.aClass16Array3 = new Class16[this.anInt9250];
		this.aClass94Array6 = new Class94[this.anInt9250];
		this.aClass10_Sub2Array3 = new Class10_Sub2[this.anInt9250];
		this.anInterface19Array3 = new Interface19[this.anInt9250];
		for (@Pc(32) int local32 = 0; local32 < this.anInt9250; local32++) {
			this.aClass94Array6[local32] = Static653.aClass94_5;
			this.aClass94Array5[local32] = Static653.aClass94_5;
			this.aClass16Array3[local32] = Static240.aClass16_19;
			this.aClass10_Sub2Array3[local32] = new Class10_Sub2();
		}
		this.aClass5_Sub12Array5 = new Class5_Sub12[this.anInt9240 - 2];
		this.anInterface19_3 = this.method7946(1, Static104.aClass86_8, 1, Static171.aClass358_12);
		this.method8604(new Class5_Sub42_Sub2(262144));
		this.aClass124_17 = this.method7981(new Class139[] { new Class139(new Class21[] { Static24.aClass21_1, Static24.aClass21_5 }) });
		this.aClass124_22 = this.method7981(new Class139[] { new Class139(new Class21[] { Static24.aClass21_1, Static24.aClass21_3 }) });
		this.aClass124_19 = this.method7981(new Class139[] { new Class139(Static24.aClass21_1), new Class139(Static24.aClass21_3), new Class139(Static24.aClass21_5), new Class139(Static24.aClass21_2) });
		this.aClass124_23 = this.method7981(new Class139[] { new Class139(Static24.aClass21_1), new Class139(Static24.aClass21_3), new Class139(Static24.aClass21_5) });
		this.aClass43_Sub3_29 = new Class43_Sub3(this, 0, 0, false, false);
		this.aClass43_Sub3_27 = new Class43_Sub3(this, 0, 0, true, true);
		this.aClass43_Sub3_24 = new Class43_Sub3(this, 0, 0, false, false);
		this.aClass43_Sub3_21 = new Class43_Sub3(this, 0, 0, true, true);
		this.aClass43_Sub3_30 = new Class43_Sub3(this, 0, 0, false, false);
		this.aClass43_Sub3_28 = new Class43_Sub3(this, 0, 0, true, true);
		this.aClass43_Sub3_22 = new Class43_Sub3(this, 0, 0, false, false);
		this.aClass43_Sub3_23 = new Class43_Sub3(this, 0, 0, true, true);
		this.aClass43_Sub3_26 = new Class43_Sub3(this, 0, 0, false, false);
		this.aClass43_Sub3_25 = new Class43_Sub3(this, 0, 0, true, true);
		this.aClass7_3 = new Class7(this);
		this.anInterface20_8 = this.method7882(true);
		this.method7938();
		this.aClass24_7 = new Class24(this);
		this.aClass48Array3[1] = this.method7966(1);
		this.aClass48Array3[2] = this.method7966(2);
		this.aClass48Array3[4] = this.method7966(4);
		this.aClass48Array3[5] = this.method7966(5);
		this.aClass48Array3[6] = this.method7966(6);
		this.aClass48Array3[7] = this.method7966(7);
		this.aClass48Array3[3] = this.method7966(3);
		this.aClass48Array3[8] = this.method7966(8);
		this.aClass48Array3[9] = this.method7966(9);
		if (!this.aClass48Array3[2].method8940()) {
			this.aClass48Array3[2] = this.method7966(0);
		}
		if (!this.aClass48Array3[4].method8940()) {
			this.aClass48Array3[4] = this.aClass48Array3[2];
		}
		if (!this.aClass48Array3[8].method8940()) {
			this.aClass48Array3[8] = this.aClass48Array3[4];
		}
		if (!this.aClass48Array3[9].method8940()) {
			this.aClass48Array3[9] = this.aClass48Array3[8];
		}
		this.method7872();
		this.la();
		this.method8663();
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZIB)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method7892(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap5.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!gca", name = "v", descriptor = "(I)V")
	private void method7893() {
		this.aFloat184 = (float) this.anInt9229;
	}

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "()Z")
	@Override
	public final boolean method8632() {
		return true;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "([BIILclient!ua;BI)Lclient!fd;")
	public abstract Interface14 method7894(@OriginalArg(0) byte[] arg0, @OriginalArg(3) Class358 arg1);

	@OriginalMember(owner = "client!gca", name = "u", descriptor = "(B)V")
	protected abstract void method7895();

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "(B)V")
	public abstract void method7896();

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II[BIZLclient!ua;II)Lclient!ah;")
	protected abstract Interface2 method7897(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) Class358 arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!gca", name = "B", descriptor = "(I)V")
	public final void method7898() {
		if (this.anInt9248 == 4) {
			return;
		}
		this.method7980();
		this.method7878(false);
		this.method7935(false);
		this.method7951(false);
		this.method7914(false);
		this.method7971(false, -2, false);
		this.method7957(1);
		this.method7962(0);
		this.anInt9248 = 4;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method7899(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!gca", name = "P", descriptor = "(I)V")
	private void method7900() {
		this.method7865();
		this.method7989();
		this.method7880();
		this.method7931();
		this.method7896();
		this.method7943();
		this.method7918();
		this.method7993();
		this.method7949();
		this.method7917();
		this.method7924();
		this.method7867();
		this.method7895();
		this.method7870();
		for (@Pc(60) int local60 = this.anInt9250 - 1; local60 >= 0; local60--) {
			this.method7941(local60);
			this.method7919();
			this.method7937();
			this.method7930();
		}
		this.method7906();
		this.method7942();
		this.method7974();
		this.method7912();
		this.method7990();
	}

	@OriginalMember(owner = "client!gca", name = "g", descriptor = "(B)V")
	public final void method7901() {
		if (this.anInt9248 == 8) {
			return;
		}
		this.method7961();
		this.method7878(true);
		this.method7951(true);
		this.method7914(true);
		this.method7957(1);
		this.anInt9248 = 8;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class84 method8587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class84_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!gca", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt9257 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt9257++;
		}
		this.anInt9232 = 0x1 << this.anInt9257;
	}

	@OriginalMember(owner = "client!gca", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8638(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "(I)V")
	public final void method7902() {
		this.method7903();
		this.method7975();
	}

	@OriginalMember(owner = "client!gca", name = "i", descriptor = "(Z)V")
	public final void method7903() {
		if (this.aClass146_8 == Static375.aClass146_5) {
			return;
		}
		@Pc(10) Class146 local10 = this.aClass146_8;
		this.aClass146_8 = Static375.aClass146_5;
		if (local10.method3395()) {
			this.method7929();
		}
		this.aFloatArray64 = this.aFloatArray63;
		this.anInt9248 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method8637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local9 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local16 * local16 + local9 * local9));
			local18 = (float) Math.atan2((double) local16, (double) local9);
		}
		this.method7922();
		this.method7873(arg4);
		this.method7970(Static520.aClass93_4, 0);
		this.method7947(Static520.aClass93_4, 0);
		this.method7957(0);
		this.aClass10_Sub2_15.method1706((float) arg5, local20, 1.0F);
		this.aClass10_Sub2_15.method4225(0, -arg5 / 2, 0);
		this.aClass10_Sub2_15.method4210((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass10_Sub2_15.method4225(arg0, arg1, 0);
		this.method7992();
		this.method7967(false);
		this.method7972();
		this.method7967(true);
		this.method7947(Static94.aClass93_2, 0);
		this.method7970(Static94.aClass93_2, 0);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!sj;)V")
	@Override
	public final void method8590(@OriginalArg(0) Class10 arg0) {
		this.aClass10_Sub2_16 = (Class10_Sub2) arg0;
		this.aClass10_Sub2_18.method4212(this.aClass10_Sub2_16);
		this.aClass10_Sub2_18.method1698();
		this.aClass10_Sub2_19.method1704(this.aClass10_Sub2_18);
		this.aClass10_Sub2_17.method1704(this.aClass10_Sub2_16);
		if (this.aClass146_8.method3395()) {
			this.method7929();
		}
	}

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "()V")
	@Override
	public final void method8630() {
		if (this.aClass138_3 != null) {
			this.aClass138_3.method3298();
		}
	}

	@OriginalMember(owner = "client!gca", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass10_Sub2_16.method1689((float) arg2, (float) arg0, (float) arg1);
		if (local14 < (float) this.anInt9231 || local14 > (float) this.anInt9229) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(61) int local61 = (int) ((float) this.anInt9249 * this.aClass10_Sub2_16.method1702((float) arg2, (float) arg1, (float) arg0) / (float) arg3);
		@Pc(80) int local80 = (int) ((float) this.anInt9258 * this.aClass10_Sub2_16.method1712((float) arg1, (float) arg2, (float) arg0) / (float) arg3);
		arg4[2] = (int) local14;
		arg4[0] = (int) ((float) local61 - this.aFloat180);
		arg4[1] = (int) ((float) local80 - this.aFloat172);
	}

	@OriginalMember(owner = "client!gca", name = "y", descriptor = "()I")
	@Override
	public final int method8635() {
		return this.anInt9240 - 2;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!eh;Lclient!eh;B)V")
	public final void method7904(@OriginalArg(0) Class94 arg0, @OriginalArg(1) Class94 arg1) {
		@Pc(21) boolean local21 = false;
		if (arg1 != this.aClass94Array5[this.anInt9241]) {
			this.aClass94Array5[this.anInt9241] = arg1;
			this.method7919();
			local21 = true;
		}
		if (arg0 != this.aClass94Array6[this.anInt9241]) {
			this.aClass94Array6[this.anInt9241] = arg0;
			this.method7937();
			local21 = true;
		}
		if (local21) {
			this.anInt9248 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!gca", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "(B)V")
	private void method7905() {
		this.anInterface15_17 = this.method7920(false);
		this.anInterface15_17.method5733(3096, 12);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(38) Buffer local38 = this.anInterface15_17.method5735();
			if (local38 != null) {
				@Pc(45) Stream local45 = this.method7910(local38);
				local45.b(0.0F);
				local45.b(0.0F);
				local45.b(0.0F);
				for (@Pc(56) int local56 = 0; local56 <= 256; local56++) {
					@Pc(69) double local69 = (double) (local56 * 2) * 3.141592653589793D / 256.0D;
					@Pc(73) float local73 = (float) Math.cos(local69);
					@Pc(77) float local77 = (float) Math.sin(local69);
					if (Stream.c()) {
						local45.b(local77);
						local45.b(local73);
						local45.b(0.0F);
					} else {
						local45.a(local77);
						local45.a(local73);
						local45.a(0.0F);
					}
				}
				local45.b();
				if (this.anInterface15_17.method5734()) {
					break;
				}
			}
		}
		this.aClass124_21 = this.method7981(new Class139[] { new Class139(Static24.aClass21_1) });
	}

	@OriginalMember(owner = "client!gca", name = "n", descriptor = "(B)V")
	protected abstract void method7906();

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(ZZ)V")
	public final void method7907(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean614 != arg0) {
			this.aBoolean614 = arg0;
			this.method7918();
		}
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)V")
	@Override
	public final void method8608(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "(B)V")
	private void method7908() {
		this.method7868(this.anInterface15_16, 0);
		this.method7921(this.aClass124_20);
		this.method7986(Static664.aClass187_7, 0, 1);
	}

	@OriginalMember(owner = "client!gca", name = "o", descriptor = "(I)V")
	protected abstract void method7909();

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;B)Lclient!jaclib/memory/Stream;")
	public final Stream method7910(@OriginalArg(0) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!gca", name = "E", descriptor = "(I)I")
	public final int method7911() {
		return this.anInt9243;
	}

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "(B)V")
	protected abstract void method7912();

	@OriginalMember(owner = "client!gca", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9265 = arg0;
		this.anInt9243 = arg1;
		this.anInt9242 = arg2;
		this.aBoolean617 = true;
		this.anInt9230 = arg3;
	}

	@OriginalMember(owner = "client!gca", name = "k", descriptor = "(B)V")
	private void method7913() {
		if (this.aClass146_8 == Static509.aClass146_6) {
			@Pc(7) float local7 = this.method7932();
			this.aClass10_Sub2_15.method1695(0.0F, local7, local7);
		}
		this.aBoolean620 = false;
		this.method7912();
		if (this.aClass48_3 != null) {
			this.aClass48_3.method8939();
		}
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(BZ)V")
	public final void method7914(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean621) {
			this.aBoolean621 = arg0;
			this.method7949();
			this.anInt9248 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
	protected abstract void method7915(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!gca", name = "n", descriptor = "(I)V")
	private void method7916() {
		this.aBoolean612 = false;
		this.method7982();
		if (Static571.aClass146_7 == this.aClass146_8) {
			this.method7975();
		}
	}

	@OriginalMember(owner = "client!gca", name = "n", descriptor = "()Z")
	@Override
	public final boolean method8641() {
		return this.aBoolean619;
	}

	@OriginalMember(owner = "client!gca", name = "H", descriptor = "(I)V")
	protected abstract void method7917();

	@OriginalMember(owner = "client!gca", name = "l", descriptor = "(B)V")
	protected abstract void method7918();

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "(B)V")
	protected abstract void method7919();

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZZ)Lclient!fk;")
	public abstract Interface15 method7920(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLclient!gaa;)V")
	public abstract void method7921(@OriginalArg(1) Class124 arg0);

	@OriginalMember(owner = "client!gca", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7922();
		this.method7873(arg4);
		this.method7970(Static520.aClass93_4, 0);
		this.method7947(Static520.aClass93_4, 0);
		this.method7957(arg5);
		this.aClass10_Sub2_15.method1706((float) arg3, (float) arg2, 1.0F);
		this.aClass10_Sub2_15.method4225(arg0, arg1, 0);
		this.method7992();
		this.method7967(false);
		this.method7972();
		this.method7967(true);
		this.method7947(Static94.aClass93_2, 0);
		this.method7970(Static94.aClass93_2, 0);
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(B)V")
	private void method7922() {
		if (this.anInt9248 == 1) {
			return;
		}
		this.method7980();
		this.method7878(false);
		this.method7935(false);
		this.method7951(false);
		this.method7914(false);
		this.method7971(false, -2, false);
		this.method7962(1);
		this.method7923(this.anInterface19_3);
		this.anInt9248 = 1;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLclient!ln;)V")
	public final void method7923(@OriginalArg(1) Interface19 arg0) {
		if (this.anInterface19Array3[this.anInt9241] == arg0) {
			return;
		}
		this.anInterface19Array3[this.anInt9241] = arg0;
		if (arg0 == null) {
			this.method7864();
		} else {
			arg0.method8895();
		}
		this.anInt9248 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "(I)V")
	protected abstract void method7924();

	@OriginalMember(owner = "client!gca", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt9245 = 0;
		this.anInt9260 = 0;
		this.anInt9251 = this.anInt9118;
		this.anInt9253 = this.anInt9057;
		if (this.aBoolean626) {
			this.aBoolean626 = false;
			this.method7884();
		}
		this.method7866();
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIZ)Lclient!hk;")
	@Override
	public final Class155 method8647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class155_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!gca", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt9226 + this.anInt9220 + this.anInt9223;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZI)V")
	public final void method7925(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean611) {
			this.aBoolean611 = arg0;
			this.method7880();
		}
	}

	@OriginalMember(owner = "client!gca", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass10_Sub2_16.aFloat53 + this.aClass10_Sub2_16.aFloat52 * (float) arg2 + (float) arg0 * this.aClass10_Sub2_16.aFloat48 + this.aClass10_Sub2_16.aFloat44 * (float) arg1;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass10_Sub2_16.aFloat53 + (float) arg3 * this.aClass10_Sub2_16.aFloat48 + this.aClass10_Sub2_16.aFloat44 * (float) arg4 + this.aClass10_Sub2_16.aFloat52 * (float) arg5;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt9231 && local63 < (float) this.anInt9231) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt9229 && local63 > (float) this.anInt9229) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) (((float) arg1 * this.aClass10_Sub2_16.aFloat45 + (float) arg0 * this.aClass10_Sub2_16.aFloat54 + this.aClass10_Sub2_16.aFloat50 * (float) arg2 + this.aClass10_Sub2_16.aFloat49) * (float) this.anInt9249 / local32);
		@Pc(173) int local173 = (int) ((this.aClass10_Sub2_16.aFloat50 * (float) arg5 + this.aClass10_Sub2_16.aFloat54 * (float) arg3 + (float) arg4 * this.aClass10_Sub2_16.aFloat45 + this.aClass10_Sub2_16.aFloat49) * (float) this.anInt9249 / local63);
		if (this.aFloat180 > (float) local141 && (float) local173 < this.aFloat180) {
			local7 |= 0x1;
		} else if (this.aFloat181 < (float) local141 && (float) local173 > this.aFloat181) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) (((float) arg0 * this.aClass10_Sub2_16.aFloat51 + this.aClass10_Sub2_16.aFloat47 * (float) arg1 + (float) arg2 * this.aClass10_Sub2_16.aFloat46 + this.aClass10_Sub2_16.aFloat55) * (float) this.anInt9258 / local32);
		@Pc(277) int local277 = (int) (((float) arg4 * this.aClass10_Sub2_16.aFloat47 + (float) arg3 * this.aClass10_Sub2_16.aFloat51 + (float) arg5 * this.aClass10_Sub2_16.aFloat46 + this.aClass10_Sub2_16.aFloat55) * (float) this.anInt9258 / local63);
		if (this.aFloat172 > (float) local245 && (float) local277 < this.aFloat172) {
			local7 |= 0x4;
		} else if ((float) local245 > this.aFloat182 && (float) local277 > this.aFloat182) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gca", name = "F", descriptor = "(I)V")
	private void method7926() {
		if (this.aClass146_8 == Static571.aClass146_7) {
			return;
		}
		@Pc(18) Class146 local18 = this.aClass146_8;
		this.aClass146_8 = Static571.aClass146_7;
		if (!local18.method3395()) {
			this.method7929();
		}
		this.method7982();
		this.aFloatArray64 = this.aFloatArray69;
		this.method7975();
		this.anInt9248 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8613(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas11 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable14.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(32) Class local32 = Class.forName("java.awt.Canvas");
				@Pc(44) Method local44 = local32.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local44.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(56) Exception local56) {
			}
			@Pc(61) Object local61 = this.method7960(arg0);
			if (local61 == null) {
				throw new RuntimeException();
			}
			this.aHashtable14.put(arg0, local61);
		}
	}

	@OriginalMember(owner = "client!gca", name = "g", descriptor = "(Z)Lclient!eba;")
	public final Class10_Sub2 method7927() {
		if (!this.aBoolean620) {
			this.aClass10_Sub2_20.method1716(this.aClass10_Sub2_18, this.aClass10_Sub2_15);
			this.aBoolean620 = true;
		}
		return this.aClass10_Sub2_20;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method8604(@OriginalArg(0) Class5_Sub42 arg0) {
		this.aNativeHeap5 = ((Class5_Sub42_Sub2) arg0).aNativeHeap4;
		this.aNativeHeapBuffer8 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(BI)V")
	public abstract void method7928(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(Z)V")
	@Override
	public final void method8651(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gca", name = "x", descriptor = "(B)V")
	private void method7929() {
		this.aBoolean620 = false;
		if (this.aClass48_3 != null) {
			this.aClass48_3.method8943();
		}
		this.method7990();
	}

	@OriginalMember(owner = "client!gca", name = "k", descriptor = "(I)V")
	public final void method7930() {
		if (Static240.aClass16_19 != this.aClass16Array3[this.anInt9241]) {
			this.aClass16Array3[this.anInt9241] = Static240.aClass16_19;
			this.aClass10_Sub2Array3[this.anInt9241].method4224();
			this.method7978();
		}
	}

	@OriginalMember(owner = "client!gca", name = "U", descriptor = "(I)V")
	protected void method7931() {
		this.anInt9228 = this.anInt9262;
		this.anInt9262 = 0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "()Z")
	@Override
	public final boolean method8600() {
		return true;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIF)Lclient!ih;")
	@Override
	public final Class5_Sub12 method8625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub12_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gca", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean624 = arg0;
		this.method7949();
	}

	@OriginalMember(owner = "client!gca", name = "s", descriptor = "(B)F")
	protected abstract float method7932();

	@OriginalMember(owner = "client!gca", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt9229;
	}

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "(I)V")
	public final void method7933() {
		this.aClass10_Sub2_15.method4224();
		this.aBoolean605 = true;
		this.method7913();
	}

	@OriginalMember(owner = "client!gca", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8638(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!gca", name = "Y", descriptor = "(I)V")
	private void method7934() {
		this.aBoolean609 = false;
		if (Static509.aClass146_6 == this.aClass146_8) {
			this.method7869();
			this.method7975();
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BZ)V")
	public final void method7935(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean610) {
			this.aBoolean610 = arg0;
			this.method7880();
			this.anInt9248 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!gca", name = "i", descriptor = "(B)V")
	private void method7936() {
		this.anInterface15_15 = this.method7920(false);
		this.anInterface15_15.method5733(140, 28);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(38) Buffer local38 = this.anInterface15_15.method5735();
			if (local38 != null) {
				@Pc(45) Stream local45 = this.method7910(local38);
				if (Stream.c()) {
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
				} else {
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
				}
				local45.b();
				if (this.anInterface15_15.method5734()) {
					break;
				}
			}
		}
		this.aClass124_18 = this.method7981(new Class139[] { new Class139(new Class21[] { Static24.aClass21_1, Static24.aClass21_5, Static24.aClass21_5 }) });
	}

	@OriginalMember(owner = "client!gca", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt9260) {
			this.anInt9260 = arg0;
			local5 = true;
		}
		if (arg2 < this.anInt9251) {
			local5 = true;
			this.anInt9251 = arg2;
		}
		if (arg1 > this.anInt9245) {
			this.anInt9245 = arg1;
			local5 = true;
		}
		if (this.anInt9253 > arg3) {
			this.anInt9253 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean626) {
			this.aBoolean626 = true;
			this.method7884();
		}
		this.method7955();
		this.method7866();
	}

	@OriginalMember(owner = "client!gca", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt9233, this.anInt9246, this.anInt9249, this.anInt9258 };
	}

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "(I)V")
	protected abstract void method7937();

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method8592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "(Z)V")
	protected final void method7938() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable14 != null && !this.aHashtable14.isEmpty()) {
			@Pc(22) Enumeration local22 = this.aHashtable14.keys();
			while (local22.hasMoreElements()) {
				@Pc(28) Canvas local28 = (Canvas) local22.nextElement();
				local9.put(local28, this.method7960(local28));
			}
		}
		this.aHashtable14 = local9;
		this.method7936();
		this.method7890();
		this.method7905();
		this.aClass7_3.method138(this);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIILclient!ua;[FIZ)Lclient!ah;")
	protected abstract Interface2 method7939(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class358 arg2, @OriginalArg(5) float[] arg3, @OriginalArg(7) boolean arg4);

	@OriginalMember(owner = "client!gca", name = "l", descriptor = "(Z)V")
	private void method7940() {
		this.aFloatArray62[10] = this.aFloat174;
		this.aFloatArray62[14] = this.aFloat169;
		this.aFloat171 = (this.aFloatArray62[14] - (float) this.anInt9229) / this.aFloatArray62[10];
	}

	@OriginalMember(owner = "client!gca", name = "i", descriptor = "(II)V")
	public final void method7941(@OriginalArg(1) int arg0) {
		if (this.anInt9241 != arg0) {
			this.anInt9241 = arg0;
			this.method7909();
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!sn;)V")
	@Override
	public final void method8586(@OriginalArg(0) Class336 arg0) {
		this.aClass7_3.method146(this, -1, arg0);
	}

	@OriginalMember(owner = "client!gca", name = "L", descriptor = "(I)V")
	protected abstract void method7942();

	@OriginalMember(owner = "client!gca", name = "s", descriptor = "(I)V")
	protected abstract void method7943();

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "([BILclient!ua;IIZ)Lclient!ah;")
	public final Interface2 method7944(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class358 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method7897(arg1, arg0, arg4, arg2, arg3);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!kaa;[Lclient!uh;Z)Lclient!da;")
	@Override
	public final Class70 method8612(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class362[] arg1) {
		return new Class70_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!gca", name = "T", descriptor = "(I)Lclient!eba;")
	public final Class10_Sub2 method7945() {
		return this.aClass10_Sub2_19;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!dn;IILclient!ua;)Lclient!ah;")
	public abstract Interface2 method7946(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class358 arg3);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLclient!ega;I)V")
	public final void method7947(@OriginalArg(1) Class93 arg0, @OriginalArg(2) int arg1) {
		this.method7881(arg1, arg0);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIBILclient!jj;Lclient!lp;I)V")
	public abstract void method7948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class187 arg3, @OriginalArg(5) Interface20 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!gca", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7922();
		this.method7873(arg3);
		this.method7970(Static520.aClass93_4, 0);
		this.method7947(Static520.aClass93_4, 0);
		this.method7957(arg4);
		this.aClass10_Sub2_15.method1706((float) arg2, (float) arg2, 1.0F);
		this.aClass10_Sub2_15.method4225(arg0, arg1, 0);
		this.method7992();
		this.method7967(false);
		this.method7868(this.anInterface15_17, 0);
		this.method7921(this.aClass124_21);
		this.method7986(Static37.aClass187_5, 0, 256);
		this.method7967(true);
		this.method7947(Static94.aClass93_2, 0);
		this.method7970(Static94.aClass93_2, 0);
	}

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "()Z")
	@Override
	public final boolean method8622() {
		return true;
	}

	@OriginalMember(owner = "client!gca", name = "K", descriptor = "(I)V")
	protected abstract void method7949();

	@OriginalMember(owner = "client!gca", name = "l", descriptor = "(I)I")
	public final int method7950() {
		return this.anInt9265;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZB)V")
	public final void method7951(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean615 != arg0) {
			this.aBoolean615 = arg0;
			this.method7993();
			this.anInt9248 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gca", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt9236 && arg1 == this.anInt9255 && arg2 == this.anInt9264) {
			return;
		}
		this.anInt9264 = arg2;
		this.anInt9236 = arg0;
		this.anInt9255 = arg1;
		this.method7871();
		this.method7917();
	}

	@OriginalMember(owner = "client!gca", name = "Q", descriptor = "(I)V")
	protected abstract void method7952();

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "(I)V")
	@Override
	public final void method8598(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass138_3 != null) {
			this.aClass138_3.method3298();
		}
		this.anInt9235 = arg0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIZ)Lclient!hk;")
	@Override
	public final Class155 method8643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class155_Sub2 local11 = new Class155_Sub2(this, arg2, arg3, arg4);
		local11.method7214(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "()Lclient!sj;")
	@Override
	public final Class10 method8610() {
		return this.aClass10_Sub2_21;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8646(@OriginalArg(0) Canvas arg0) {
		this.anObject16 = null;
		this.aCanvas10 = null;
		if (arg0 == null || arg0 == this.aCanvas11) {
			this.aCanvas10 = this.aCanvas11;
			this.anObject16 = this.anObject17;
		} else if (this.aHashtable14.containsKey(arg0)) {
			this.anObject16 = this.aHashtable14.get(arg0);
			this.aCanvas10 = arg0;
		}
		if (this.aCanvas10 == null || this.anObject16 == null) {
			throw new RuntimeException();
		}
		this.method7915(this.aCanvas10, this.anObject16);
		this.method7976();
	}

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "(I)V")
	public final void method7953() {
		if (this.anInt9248 == 16) {
			return;
		}
		this.method7926();
		this.method7878(true);
		this.method7951(true);
		this.method7914(true);
		this.method7957(1);
		this.anInt9248 = 16;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!ak;Z)V")
	public final void method7954(@OriginalArg(0) Class16 arg0) {
		this.aClass16Array3[this.anInt9241] = arg0;
		this.method7978();
	}

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "(Z)V")
	protected abstract void method7955();

	@OriginalMember(owner = "client!gca", name = "A", descriptor = "(I)Lclient!eba;")
	public final Class10_Sub2 method7956() {
		return this.aClass10_Sub2_15;
	}

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "(II)V")
	public final void method7957(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt9263) {
			return;
		}
		@Pc(25) Class102 local25;
		@Pc(29) boolean local29;
		@Pc(27) boolean local27;
		if (arg0 == 1) {
			local25 = Static381.aClass102_6;
			local27 = true;
			local29 = true;
		} else if (arg0 == 2) {
			local27 = false;
			local25 = Static33.aClass102_1;
			local29 = true;
		} else if (arg0 == 128) {
			local27 = true;
			local29 = true;
			local25 = Static306.aClass102_5;
		} else {
			local25 = Static163.aClass102_4;
			local29 = false;
			local27 = false;
		}
		if (local27 != this.aBoolean618) {
			this.aBoolean618 = local27;
			this.method7870();
		}
		if (local29 != this.aBoolean625) {
			this.aBoolean625 = local29;
			this.method7867();
		}
		if (local25 != this.aClass102_7) {
			this.aClass102_7 = local25;
			this.method7895();
		}
		this.anInt9263 = arg0;
		this.anInt9248 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!gca", name = "Z", descriptor = "(I)V")
	protected final void method7958() {
		@Pc(9) Enumeration local9 = this.aHashtable14.keys();
		while (local9.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local9.nextElement();
			this.method7899(local17, this.aHashtable14.get(local17));
		}
		this.anInterface15_15.method7351();
		this.anInterface15_16.method7351();
		this.anInterface15_17.method7351();
		this.aClass43_Sub3_27.method8867();
		this.aClass43_Sub3_21.method8867();
		this.aClass43_Sub3_28.method8867();
		this.aClass43_Sub3_23.method8867();
		this.aClass43_Sub3_25.method8867();
		this.aClass7_3.method144();
		this.anInterface20_8.method7351();
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!eba;)V")
	public final void method7959(@OriginalArg(1) Class10_Sub2 arg0) {
		this.aClass10_Sub2_15.method4212(arg0);
		this.aBoolean605 = false;
		this.method7913();
	}

	@OriginalMember(owner = "client!gca", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass10_Sub2_16.method1689((float) arg2, (float) arg0, (float) arg1);
		@Pc(30) int local30;
		@Pc(27) int local27;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local30 = (int) ((float) this.anInt9249 * this.aClass10_Sub2_16.method1702((float) arg2, (float) arg1, (float) arg0) / local14);
			local27 = (int) ((float) this.anInt9258 * this.aClass10_Sub2_16.method1712((float) arg1, (float) arg2, (float) arg0) / local14);
		} else {
			local27 = this.anInt9246;
			local30 = this.anInt9233;
		}
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local27 - this.aFloat172);
		arg3[0] = (int) ((float) local30 - this.aFloat180);
	}

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "()Z")
	@Override
	public final boolean method8657() {
		return false;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method7960(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt9231 && arg1 == this.anInt9229) {
			return;
		}
		this.anInt9229 = arg1;
		this.anInt9231 = arg0;
		this.method7973();
		this.method7916();
		this.method7871();
	}

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "()Z")
	@Override
	public final boolean method8611() {
		return false;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(II)I")
	@Override
	public final int method8665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "([I)V")
	@Override
	public final void method8649(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt9057;
		arg0[0] = this.anInt9118;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!lia;)V")
	@Override
	public final void method8639(@OriginalArg(0) Class185 arg0) {
		this.aClass185_Sub2_3 = (Class185_Sub2) arg0;
	}

	@OriginalMember(owner = "client!gca", name = "y", descriptor = "(B)V")
	private void method7961() {
		if (Static130.aClass146_1 == this.aClass146_8) {
			return;
		}
		@Pc(14) Class146 local14 = this.aClass146_8;
		this.aClass146_8 = Static130.aClass146_1;
		if (!local14.method3395()) {
			this.method7929();
		}
		this.method7889();
		this.aFloatArray64 = this.aFloatArray62;
		this.method7975();
		this.anInt9248 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IB)V")
	public final void method7962(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method7904(Static164.aClass94_1, Static164.aClass94_1);
		} else if (arg0 == 0) {
			this.method7904(Static653.aClass94_5, Static653.aClass94_5);
		} else if (arg0 == 2) {
			this.method7904(Static164.aClass94_1, Static280.aClass94_2);
		} else if (arg0 == 3) {
			this.method7904(Static653.aClass94_5, Static618.aClass94_4);
		} else if (arg0 == 4) {
			this.method7904(Static461.aClass94_3, Static461.aClass94_3);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLclient!ua;Lclient!dn;)Z")
	public abstract boolean method7963(@OriginalArg(1) Class358 arg0, @OriginalArg(2) Class86 arg1);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BF)V")
	public final void method7964(@OriginalArg(1) float arg0) {
		if (this.aFloat183 != arg0) {
			this.aFloat183 = arg0;
			this.method7916();
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "([FB)[F")
	public final float[] method7965(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloatArray64[1];
		arg0[0] = this.aFloatArray64[0];
		arg0[8] = this.aFloatArray64[2];
		arg0[12] = this.aFloatArray64[3];
		arg0[9] = this.aFloatArray64[6];
		arg0[2] = this.aFloatArray64[8];
		arg0[5] = this.aFloatArray64[5];
		arg0[1] = this.aFloatArray64[4];
		arg0[13] = this.aFloatArray64[7];
		arg0[6] = this.aFloatArray64[9];
		arg0[7] = this.aFloatArray64[13];
		arg0[10] = this.aFloatArray64[10];
		arg0[3] = this.aFloatArray64[12];
		arg0[14] = this.aFloatArray64[11];
		arg0[15] = this.aFloatArray64[15];
		arg0[11] = this.aFloatArray64[14];
		return arg0;
	}

	@OriginalMember(owner = "client!gca", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt9253;
		arg0[1] = this.anInt9245;
		arg0[2] = this.anInt9251;
		arg0[0] = this.anInt9260;
	}

	@OriginalMember(owner = "client!gca", name = "g", descriptor = "(II)Lclient!qba;")
	protected Class48 method7966(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class48_Sub10(this);
		} else if (arg0 == 1) {
			return new Class48_Sub5(this);
		} else if (arg0 == 2) {
			return new Class48_Sub11(this, this.aClass24_7);
		} else if (arg0 == 7) {
			return new Class48_Sub2(this);
		} else {
			return new Class48_Sub3(this);
		}
	}

	@OriginalMember(owner = "client!gca", name = "A", descriptor = "()Z")
	@Override
	public final boolean method8624() {
		return true;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8627(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas11) {
			throw new RuntimeException();
		} else if (this.aHashtable14.containsKey(arg0)) {
			this.method7899(arg0, this.aHashtable14.get(arg0));
			this.aHashtable14.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(ZB)V")
	public abstract void method7967(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method8606() {
	}

	@OriginalMember(owner = "client!gca", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean617) {
			throw new RuntimeException("");
		}
		this.anInt9265 = arg0;
		this.anInt9242 = arg2;
		this.anInt9243 = arg1;
		this.anInt9230 = arg3;
		if (this.aBoolean623) {
			this.aClass48Array3[3].method8931();
			this.aClass48Array3[3].method8937();
		}
	}

	@OriginalMember(owner = "client!gca", name = "N", descriptor = "(I)I")
	public final int method7968() {
		return this.anInt9242;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!fg;I)V")
	public abstract void method7969(@OriginalArg(0) Class112 arg0);

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(BLclient!ega;I)V")
	public final void method7970(@OriginalArg(1) Class93 arg0, @OriginalArg(2) int arg1) {
		this.method7883(false, arg0, false, arg1);
	}

	@OriginalMember(owner = "client!gca", name = "w", descriptor = "()Z")
	@Override
	public final boolean method8655() {
		return true;
	}

	@OriginalMember(owner = "client!gca", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt9118 - 1 <= arg2 && arg1 <= 0 && arg3 >= this.anInt9057 - 1) {
			this.la();
			return;
		}
		this.anInt9253 = arg3 <= this.anInt9118 ? arg3 : 0;
		this.anInt9260 = arg0 < 0 ? 0 : arg0;
		this.anInt9245 = arg1 >= 0 ? arg1 : 0;
		this.anInt9251 = this.anInt9118 < arg2 ? 0 : arg2;
		if (!this.aBoolean626) {
			this.aBoolean626 = true;
			this.method7884();
		}
		this.method7955();
		this.method7866();
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZIBZ)V")
	public final void method7971(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt9256 || this.aBoolean617 != this.aBoolean623) {
			@Pc(22) Interface2 local22 = null;
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(36) int local36 = this.aBoolean617 ? 3 : 0;
			if (arg1 < 0) {
				this.method7930();
			} else {
				local22 = this.aClass138_3.method3297(arg1);
				@Pc(59) Class44 local59 = super.anInterface7_12.method7423(arg1);
				if (local59.aByte18 == 0 && local59.aByte20 == 0) {
					this.method7930();
				} else {
					@Pc(80) int local80 = local59.aBoolean62 ? 64 : 128;
					@Pc(84) int local84 = local80 * 50;
					@Pc(88) Class10_Sub2 local88 = this.method7877();
					local88.method1691(0.0F, (float) (this.anInt9259 % local84 * local59.aByte20) / (float) local84, (float) (local59.aByte18 * (this.anInt9259 % local84)) / (float) local84);
					this.method7954(Static475.aClass16_46);
				}
				if (!this.aBoolean617) {
					local28 = local59.anInt814;
					local26 = local59.aByte19;
					local36 = local59.aByte23;
				}
				local24 = local59.anInt811;
			}
			this.method7888(arg0, local36, arg2, local26, local28);
			if (this.aClass48_3 == null) {
				this.method7923(local22);
				this.method7962(local24);
			} else {
				this.aClass48_3.method8933(local22, local24);
			}
			this.aBoolean623 = this.aBoolean617;
			this.anInt9256 = arg1;
		}
		this.anInt9248 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!uh;Z)Lclient!hk;")
	@Override
	public final Class155 method8640(@OriginalArg(0) Class362 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(141) Class155 local141;
		if (arg0.anInt9727 == 0 || arg0.anInt9728 == 0) {
			local141 = this.method8645(1, 1, new int[1], 1);
		} else {
			@Pc(23) int[] local23 = new int[arg0.anInt9727 * arg0.anInt9728];
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			@Pc(32) int local32;
			@Pc(36) int local36;
			if (arg0.aByteArray99 == null) {
				for (local32 = 0; local32 < arg0.anInt9728; local32++) {
					for (local36 = 0; local36 < arg0.anInt9727; local36++) {
						@Pc(49) int local49 = arg0.anIntArray541[arg0.aByteArray98[local25++] & 0xFF];
						local23[local27++] = local49 == 0 ? 0 : local49 | 0xFF000000;
					}
				}
			} else {
				for (local32 = 0; local32 < arg0.anInt9728; local32++) {
					for (local36 = 0; local36 < arg0.anInt9727; local36++) {
						local23[local27++] = arg0.anIntArray541[arg0.aByteArray98[local25] & 0xFF] | arg0.aByteArray99[local25] << 24;
						local25++;
					}
				}
			}
			local141 = this.method8645(arg0.anInt9727, arg0.anInt9727, local23, arg0.anInt9728);
		}
		local141.method7190(arg0.anInt9723, arg0.anInt9725, arg0.anInt9724, arg0.anInt9726);
		return local141;
	}

	@OriginalMember(owner = "client!gca", name = "W", descriptor = "(I)V")
	public final void method7972() {
		this.method7863(Static37.aClass187_5, 2);
	}

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "(B)V")
	private void method7973() {
		this.aBoolean622 = false;
		this.method7889();
		if (Static130.aClass146_1 == this.aClass146_8) {
			this.method7975();
		}
	}

	@OriginalMember(owner = "client!gca", name = "w", descriptor = "(I)V")
	protected abstract void method7974();

	@OriginalMember(owner = "client!gca", name = "ab", descriptor = "(I)V")
	private void method7975() {
		this.method7974();
		if (this.aClass48_3 != null) {
			this.aClass48_3.method8936();
		}
	}

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "(B)V")
	private void method7976() {
		if (this.aCanvas10 == null) {
			this.anInt9144 = this.anInt9156 = 1;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas10.getSize();
			this.anInt9156 = local10.height;
			this.anInt9144 = local10.width;
		}
		this.anInt9118 = this.anInt9144;
		this.anInt9057 = this.anInt9156;
		this.method7934();
		this.method7973();
		this.method7916();
		this.method7942();
		this.method7866();
		this.method7903();
		this.la();
	}

	@OriginalMember(owner = "client!gca", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt9231;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method7977(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "([IIIIIZ)Lclient!hk;")
	@Override
	public final Class155 method8636(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class155_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method8581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static464.method6556(arg3, this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!gca", name = "S", descriptor = "(I)V")
	private void method7978() {
		this.method7952();
		if (this.aClass48_3 != null) {
			this.aClass48_3.method8944();
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BI)V")
	public final void method7979(@OriginalArg(0) byte arg0) {
		this.method7873(arg0 | arg0 << 8 | arg0 << 16 | arg0 << 24);
	}

	@OriginalMember(owner = "client!gca", name = "x", descriptor = "(I)V")
	private void method7980() {
		if (Static509.aClass146_6 == this.aClass146_8) {
			return;
		}
		@Pc(11) Class146 local11 = this.aClass146_8;
		this.aClass146_8 = Static509.aClass146_6;
		if (local11.method3395()) {
			this.method7929();
		}
		this.method7869();
		this.aFloatArray64 = this.aFloatArray68;
		this.method7975();
		this.anInt9248 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I[Lclient!gt;)Lclient!gaa;")
	public abstract Class124 method7981(@OriginalArg(1) Class139[] arg0);

	@OriginalMember(owner = "client!gca", name = "z", descriptor = "(I)V")
	private void method7982() {
		if (this.aBoolean612) {
			return;
		}
		@Pc(17) float[] local17 = this.aFloatArray69;
		@Pc(21) float local21 = (float) this.anInt9231;
		@Pc(25) float local25 = (float) this.anInt9229;
		@Pc(37) float local37 = this.aFloat183 * (float) -this.anInt9246 / (float) this.anInt9258;
		@Pc(49) float local49 = this.aFloat183 * (float) -this.anInt9233 / (float) this.anInt9249;
		@Pc(63) float local63 = this.aFloat183 * (float) (this.anInt9118 - this.anInt9233) / (float) this.anInt9249;
		@Pc(78) float local78 = (float) (this.anInt9057 - this.anInt9246) * this.aFloat183 / (float) this.anInt9258;
		if (local49 == local63 || local78 == local37) {
			local17[4] = 0.0F;
			local17[7] = 0.0F;
			local17[12] = 0.0F;
			local17[9] = 0.0F;
			local17[14] = 0.0F;
			local17[6] = 0.0F;
			local17[3] = 0.0F;
			local17[15] = 1.0F;
			local17[13] = 0.0F;
			local17[2] = 0.0F;
			local17[10] = 1.0F;
			local17[8] = 0.0F;
			local17[0] = 1.0F;
			local17[5] = 1.0F;
			local17[11] = 0.0F;
			local17[1] = 0.0F;
		} else {
			local17[15] = 1.0F;
			local17[0] = 2.0F / (local63 - local49);
			local17[10] = 1.0F / (local21 - local25);
			local17[9] = 0.0F;
			local17[12] = (local63 + local49) / (local49 - local63);
			local17[3] = 0.0F;
			local17[4] = 0.0F;
			local17[14] = local21 / (local21 - local25);
			local17[2] = 0.0F;
			local17[13] = (local78 + local37) / (local78 - local37);
			local17[7] = 0.0F;
			local17[5] = 2.0F / (local78 - local37);
			local17[6] = 0.0F;
			local17[8] = 0.0F;
			local17[11] = 0.0F;
			local17[1] = 0.0F;
		}
		this.method7893();
		this.aBoolean612 = true;
	}

	@OriginalMember(owner = "client!gca", name = "R", descriptor = "(I)V")
	public final void method7983() {
		if (this.anInt9248 == 2) {
			return;
		}
		this.method7980();
		this.method7878(false);
		this.method7935(false);
		this.method7951(false);
		this.method7914(false);
		this.method7971(false, -2, false);
		this.anInt9248 = 2;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!ua;IB[FIZ)Lclient!ah;")
	public final Interface2 method7984(@OriginalArg(0) Class358 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method7939(arg1, arg3, arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method8605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!gca", name = "D", descriptor = "(I)Lclient!oda;")
	public final Interface22 method7985() {
		return this.aClass185_Sub2_3 == null ? null : this.aClass185_Sub2_3.method6157();
	}

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "(IIIIII)Lclient!lia;")
	@Override
	public final Class185 method8658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class185_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!jj;III)V")
	public abstract void method7986(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method8638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		if (local9 == 0.0F && local16 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(43) float local43 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local16 * local16)));
			local16 *= local43;
			local9 *= local43;
		}
		if (!this.method7987((float) arg1, local9 + (float) arg2, 0.0F, (float) arg0, 0.0F, (float) arg3 + local16)) {
			return;
		}
		this.method7922();
		this.method7873(arg4);
		this.method7970(Static520.aClass93_4, 0);
		this.method7947(Static520.aClass93_4, 0);
		this.method7957(arg5);
		this.method7933();
		this.method7967(false);
		this.method7908();
		this.method7967(true);
		this.method7947(Static94.aClass93_2, 0);
		this.method7970(Static94.aClass93_2, 0);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(FFFFFIF)Z")
	private boolean method7987(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface15_16.method5735();
		if (local9 == null) {
			return false;
		}
		@Pc(19) Stream local19 = this.method7910(local9);
		if (Stream.c()) {
			local19.b(arg3);
			local19.b(arg0);
			local19.b(arg4);
			local19.b(arg1);
			local19.b(arg5);
			local19.b(arg2);
		} else {
			local19.a(arg3);
			local19.a(arg0);
			local19.a(arg4);
			local19.a(arg1);
			local19.a(arg5);
			local19.a(arg2);
		}
		local19.b();
		return this.anInterface15_16.method5734();
	}

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "(II)Lclient!lp;")
	public final Interface20 method7988(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface20_8.method7346()) {
			this.anInterface20_8.method7350(arg0);
		}
		return this.anInterface20_8;
	}

	@OriginalMember(owner = "client!gca", name = "k", descriptor = "(Z)V")
	protected abstract void method7989();

	@OriginalMember(owner = "client!gca", name = "u", descriptor = "(I)V")
	protected abstract void method7990();

	@OriginalMember(owner = "client!gca", name = "g", descriptor = "(I)V")
	@Override
	public void method8634(@OriginalArg(0) int arg0) {
		if (this.aClass138_3 != null) {
			this.aClass138_3.method3295();
		}
		this.anInt9259 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!gca", name = "k", descriptor = "()Lclient!sj;")
	@Override
	public final Class10 method8623() {
		return new Class10_Sub2();
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "()Z")
	@Override
	public final boolean method8596() {
		return true;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIZI[III)Lclient!ah;")
	public abstract Interface2 method7991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method8593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(17) float local17 = (float) arg3 - (float) arg1;
		@Pc(44) float local44;
		if (local11 == 0.0F && local17 == 0.0F) {
			local11 = 1.0F;
		} else {
			local44 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local11 * local11)));
			local11 *= local44;
			local17 *= local44;
		}
		this.method7922();
		this.method7873(arg4);
		this.method7970(Static520.aClass93_4, 0);
		this.method7947(Static520.aClass93_4, 0);
		this.method7957(1);
		this.method7933();
		this.method7967(false);
		@Pc(86) int local86 = arg7 % (arg5 + arg6);
		local44 = (float) arg5 * local11;
		@Pc(96) float local96 = local17 * (float) arg5;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = 0.0F;
		@Pc(102) float local102 = local44;
		@Pc(104) float local104 = local96;
		if (arg5 >= local86) {
			local102 = local11 * (float) (arg5 - local86);
			local104 = local17 * (float) (arg5 - local86);
		} else {
			local100 = (float) (arg6 + arg5 - local86) * local17;
			local98 = (float) (arg5 + arg6 - local86) * local11;
		}
		@Pc(148) float local148 = local98 + (float) arg0;
		@Pc(153) float local153 = (float) arg1 + local100;
		@Pc(158) float local158 = local11 * (float) arg6;
		@Pc(163) float local163 = local17 * (float) arg6;
		while (true) {
			if (arg0 < arg2) {
				if (local148 > (float) arg2) {
					break;
				}
				if ((float) arg2 < local148 + local102) {
					local102 = (float) arg2 - local148;
				}
			} else {
				if ((float) arg2 > local148) {
					break;
				}
				if (local148 + local102 < (float) arg2) {
					local102 = (float) arg2 - local148;
				}
			}
			if (arg3 <= arg1) {
				if (local153 < (float) arg3) {
					break;
				}
				if (local104 + local153 < (float) arg3) {
					local104 = (float) arg3 - local153;
				}
			} else {
				if ((float) arg3 < local153) {
					break;
				}
				if (local153 + local104 > (float) arg3) {
					local104 = (float) arg3 - local153;
				}
			}
			if (!this.method7987(local153, local102 + local148, 0.0F, local148, 0.0F, local104 + local153)) {
				return;
			}
			local153 += local104 + local163;
			local148 += local102 + local158;
			this.method7908();
			local104 = local96;
			local102 = local44;
		}
		this.method7967(true);
		this.method7947(Static94.aClass93_2, 0);
		this.method7970(Static94.aClass93_2, 0);
	}

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "(I)V")
	public final void method7992() {
		this.aBoolean605 = false;
		this.method7913();
	}

	@OriginalMember(owner = "client!gca", name = "w", descriptor = "(B)V")
	protected abstract void method7993();

	@OriginalMember(owner = "client!gca", name = "o", descriptor = "(B)[F")
	public final float[] method7994() {
		return this.aFloatArray63;
	}
}
