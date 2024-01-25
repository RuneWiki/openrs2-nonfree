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

@OriginalClass("client!lba")
public abstract class Class132_Sub1 extends Class132 {

	@OriginalMember(owner = "client!lba", name = "N", descriptor = "Lclient!oca;")
	protected Class247 aClass247_8;

	@OriginalMember(owner = "client!lba", name = "sb", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7;

	@OriginalMember(owner = "client!lba", name = "ub", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!lba", name = "Bb", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!lba", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!lba", name = "ee", descriptor = "I")
	protected int anInt8963;

	@OriginalMember(owner = "client!lba", name = "he", descriptor = "I")
	public int anInt8965;

	@OriginalMember(owner = "client!lba", name = "ie", descriptor = "I")
	public int anInt8966;

	@OriginalMember(owner = "client!lba", name = "oe", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!lba", name = "re", descriptor = "I")
	public int anInt8968;

	@OriginalMember(owner = "client!lba", name = "te", descriptor = "Lclient!ar;")
	private Class25_Sub1 aClass25_Sub1_3;

	@OriginalMember(owner = "client!lba", name = "we", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!lba", name = "Be", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!lba", name = "Ce", descriptor = "Lclient!sl;")
	private Class323 aClass323_3;

	@OriginalMember(owner = "client!lba", name = "He", descriptor = "[Lclient!si;")
	protected Class322[] aClass322Array5;

	@OriginalMember(owner = "client!lba", name = "Je", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!lba", name = "Ne", descriptor = "Lclient!qs;")
	private Class32 aClass32_3;

	@OriginalMember(owner = "client!lba", name = "Pe", descriptor = "F")
	private float aFloat170;

	@OriginalMember(owner = "client!lba", name = "Se", descriptor = "Z")
	protected boolean aBoolean628;

	@OriginalMember(owner = "client!lba", name = "Ve", descriptor = "Z")
	public boolean aBoolean629;

	@OriginalMember(owner = "client!lba", name = "df", descriptor = "I")
	public int anInt8979;

	@OriginalMember(owner = "client!lba", name = "ef", descriptor = "I")
	private int anInt8980;

	@OriginalMember(owner = "client!lba", name = "kf", descriptor = "[Lclient!uf;")
	protected Class207_Sub3[] aClass207_Sub3Array3;

	@OriginalMember(owner = "client!lba", name = "mf", descriptor = "[Lclient!oja;")
	protected Class257[] aClass257Array3;

	@OriginalMember(owner = "client!lba", name = "pf", descriptor = "F")
	private float aFloat172;

	@OriginalMember(owner = "client!lba", name = "vf", descriptor = "I")
	protected int anInt8986;

	@OriginalMember(owner = "client!lba", name = "xf", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!lba", name = "yf", descriptor = "I")
	protected int anInt8988;

	@OriginalMember(owner = "client!lba", name = "Af", descriptor = "Lclient!ml;")
	public Interface17 anInterface17_3;

	@OriginalMember(owner = "client!lba", name = "Ff", descriptor = "Z")
	protected boolean aBoolean637;

	@OriginalMember(owner = "client!lba", name = "Gf", descriptor = "[Lclient!sca;")
	protected Class6_Sub17[] aClass6_Sub17Array5;

	@OriginalMember(owner = "client!lba", name = "Kf", descriptor = "Z")
	public boolean aBoolean638;

	@OriginalMember(owner = "client!lba", name = "Lf", descriptor = "I")
	protected int anInt8994;

	@OriginalMember(owner = "client!lba", name = "Of", descriptor = "I")
	private int anInt8995;

	@OriginalMember(owner = "client!lba", name = "Pf", descriptor = "I")
	public int anInt8996;

	@OriginalMember(owner = "client!lba", name = "Rf", descriptor = "Z")
	public boolean aBoolean640;

	@OriginalMember(owner = "client!lba", name = "Uf", descriptor = "[Lclient!si;")
	protected Class322[] aClass322Array6;

	@OriginalMember(owner = "client!lba", name = "Vf", descriptor = "F")
	public float aFloat178;

	@OriginalMember(owner = "client!lba", name = "bg", descriptor = "I")
	public int anInt9000;

	@OriginalMember(owner = "client!lba", name = "jg", descriptor = "[Lclient!ml;")
	private Interface17[] anInterface17Array3;

	@OriginalMember(owner = "client!lba", name = "lg", descriptor = "I")
	protected int anInt9005;

	@OriginalMember(owner = "client!lba", name = "mg", descriptor = "Lclient!vea;")
	public Class184_Sub3 aClass184_Sub3_21;

	@OriginalMember(owner = "client!lba", name = "ng", descriptor = "Lclient!vea;")
	public Class184_Sub3 aClass184_Sub3_22;

	@OriginalMember(owner = "client!lba", name = "og", descriptor = "Lclient!fw;")
	private Interface12 anInterface12_14;

	@OriginalMember(owner = "client!lba", name = "pg", descriptor = "Lclient!fw;")
	private Interface12 anInterface12_15;

	@OriginalMember(owner = "client!lba", name = "qg", descriptor = "Lclient!bfa;")
	public Class34 aClass34_16;

	@OriginalMember(owner = "client!lba", name = "rg", descriptor = "Lclient!vea;")
	public Class184_Sub3 aClass184_Sub3_23;

	@OriginalMember(owner = "client!lba", name = "sg", descriptor = "Lclient!bfa;")
	private Class34 aClass34_17;

	@OriginalMember(owner = "client!lba", name = "tg", descriptor = "Lclient!vea;")
	public Class184_Sub3 aClass184_Sub3_24;

	@OriginalMember(owner = "client!lba", name = "ug", descriptor = "Lclient!bfa;")
	private Class34 aClass34_18;

	@OriginalMember(owner = "client!lba", name = "vg", descriptor = "Lclient!vea;")
	public Class184_Sub3 aClass184_Sub3_25;

	@OriginalMember(owner = "client!lba", name = "wg", descriptor = "Lclient!pm;")
	private Interface21 anInterface21_7;

	@OriginalMember(owner = "client!lba", name = "xg", descriptor = "Lclient!bfa;")
	public Class34 aClass34_19;

	@OriginalMember(owner = "client!lba", name = "yg", descriptor = "Lclient!bfa;")
	public Class34 aClass34_20;

	@OriginalMember(owner = "client!lba", name = "zg", descriptor = "Lclient!vea;")
	public Class184_Sub3 aClass184_Sub3_26;

	@OriginalMember(owner = "client!lba", name = "Ag", descriptor = "Lclient!vea;")
	public Class184_Sub3 aClass184_Sub3_27;

	@OriginalMember(owner = "client!lba", name = "Bg", descriptor = "Lclient!vea;")
	public Class184_Sub3 aClass184_Sub3_28;

	@OriginalMember(owner = "client!lba", name = "Cg", descriptor = "Lclient!bfa;")
	public Class34 aClass34_21;

	@OriginalMember(owner = "client!lba", name = "Dg", descriptor = "Lclient!vea;")
	public Class184_Sub3 aClass184_Sub3_29;

	@OriginalMember(owner = "client!lba", name = "Eg", descriptor = "Lclient!fw;")
	private Interface12 anInterface12_16;

	@OriginalMember(owner = "client!lba", name = "Fg", descriptor = "Lclient!vea;")
	public Class184_Sub3 aClass184_Sub3_30;

	@OriginalMember(owner = "client!lba", name = "Gg", descriptor = "Lclient!bfa;")
	private Class34 aClass34_22;

	@OriginalMember(owner = "client!lba", name = "Ig", descriptor = "Z")
	protected boolean aBoolean644;

	@OriginalMember(owner = "client!lba", name = "Jg", descriptor = "I")
	private int anInt9006;

	@OriginalMember(owner = "client!lba", name = "Fb", descriptor = "Lclient!v;")
	private final Class362 aClass362_59 = new Class362();

	@OriginalMember(owner = "client!lba", name = "ge", descriptor = "Z")
	protected boolean aBoolean623 = true;

	@OriginalMember(owner = "client!lba", name = "ce", descriptor = "Lclient!uf;")
	protected final Class207_Sub3 aClass207_Sub3_15 = new Class207_Sub3();

	@OriginalMember(owner = "client!lba", name = "je", descriptor = "Lclient!uf;")
	public Class207_Sub3 aClass207_Sub3_16 = new Class207_Sub3();

	@OriginalMember(owner = "client!lba", name = "ke", descriptor = "Lclient!uf;")
	public final Class207_Sub3 aClass207_Sub3_17 = new Class207_Sub3();

	@OriginalMember(owner = "client!lba", name = "le", descriptor = "Lclient!uf;")
	protected final Class207_Sub3 aClass207_Sub3_18 = new Class207_Sub3();

	@OriginalMember(owner = "client!lba", name = "me", descriptor = "Lclient!uf;")
	private final Class207_Sub3 aClass207_Sub3_19 = new Class207_Sub3();

	@OriginalMember(owner = "client!lba", name = "ne", descriptor = "Lclient!uf;")
	private final Class207_Sub3 aClass207_Sub3_20 = new Class207_Sub3();

	@OriginalMember(owner = "client!lba", name = "ze", descriptor = "Z")
	private boolean aBoolean624 = false;

	@OriginalMember(owner = "client!lba", name = "ye", descriptor = "[F")
	private final float[] aFloatArray61 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!lba", name = "se", descriptor = "I")
	private int anInt8969 = 16777215;

	@OriginalMember(owner = "client!lba", name = "qe", descriptor = "[F")
	private final float[] aFloatArray60 = new float[16];

	@OriginalMember(owner = "client!lba", name = "Qe", descriptor = "Z")
	protected boolean aBoolean627 = false;

	@OriginalMember(owner = "client!lba", name = "Ge", descriptor = "Z")
	protected boolean aBoolean626 = true;

	@OriginalMember(owner = "client!lba", name = "Me", descriptor = "I")
	public int anInt8975 = 0;

	@OriginalMember(owner = "client!lba", name = "qf", descriptor = "F")
	public float aFloat173 = 3584.0F;

	@OriginalMember(owner = "client!lba", name = "of", descriptor = "I")
	public int anInt8984 = -1;

	@OriginalMember(owner = "client!lba", name = "uf", descriptor = "Z")
	protected boolean aBoolean635 = true;

	@OriginalMember(owner = "client!lba", name = "xe", descriptor = "I")
	private int anInt8971 = 0;

	@OriginalMember(owner = "client!lba", name = "Fe", descriptor = "Z")
	protected boolean aBoolean625 = false;

	@OriginalMember(owner = "client!lba", name = "Te", descriptor = "[F")
	public final float[] aFloatArray63 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!lba", name = "cf", descriptor = "F")
	public float aFloat171 = 1.0F;

	@OriginalMember(owner = "client!lba", name = "tf", descriptor = "I")
	protected int anInt8985 = 0;

	@OriginalMember(owner = "client!lba", name = "af", descriptor = "I")
	public int anInt8978 = 512;

	@OriginalMember(owner = "client!lba", name = "ve", descriptor = "F")
	private float aFloat164 = 1.0F;

	@OriginalMember(owner = "client!lba", name = "If", descriptor = "Lclient!tq;")
	protected Class342 aClass342_7 = Static48.aClass342_1;

	@OriginalMember(owner = "client!lba", name = "zf", descriptor = "Z")
	protected boolean aBoolean636 = false;

	@OriginalMember(owner = "client!lba", name = "We", descriptor = "Z")
	private boolean aBoolean630 = false;

	@OriginalMember(owner = "client!lba", name = "bf", descriptor = "I")
	public int bf = 50;

	@OriginalMember(owner = "client!lba", name = "Ee", descriptor = "I")
	private int anInt8973 = -1;

	@OriginalMember(owner = "client!lba", name = "Ze", descriptor = "I")
	protected final int anInt8977 = 0;

	@OriginalMember(owner = "client!lba", name = "Mf", descriptor = "F")
	public float aFloat176 = -1.0F;

	@OriginalMember(owner = "client!lba", name = "hf", descriptor = "I")
	public int anInt8982 = 0;

	@OriginalMember(owner = "client!lba", name = "Df", descriptor = "I")
	private int anInt8990 = 1;

	@OriginalMember(owner = "client!lba", name = "Ie", descriptor = "I")
	private int anInt8974 = 0;

	@OriginalMember(owner = "client!lba", name = "gf", descriptor = "Z")
	protected boolean aBoolean631 = false;

	@OriginalMember(owner = "client!lba", name = "Bf", descriptor = "F")
	public float aFloat175 = 3584.0F;

	@OriginalMember(owner = "client!lba", name = "Le", descriptor = "Lclient!hba;")
	protected Class134 aClass134_9 = Static457.aClass134_8;

	@OriginalMember(owner = "client!lba", name = "rf", descriptor = "Z")
	protected boolean aBoolean633 = true;

	@OriginalMember(owner = "client!lba", name = "Nf", descriptor = "F")
	public float aFloat177 = 1.0F;

	@OriginalMember(owner = "client!lba", name = "Xe", descriptor = "[F")
	private final float[] aFloatArray64 = new float[16];

	@OriginalMember(owner = "client!lba", name = "Ke", descriptor = "F")
	public float aFloat168 = 1.0F;

	@OriginalMember(owner = "client!lba", name = "Zf", descriptor = "I")
	protected int anInt8999 = 0;

	@OriginalMember(owner = "client!lba", name = "Ae", descriptor = "I")
	protected final int anInt8972 = 0;

	@OriginalMember(owner = "client!lba", name = "Cf", descriptor = "I")
	private int anInt8989 = -1;

	@OriginalMember(owner = "client!lba", name = "Ue", descriptor = "I")
	protected int anInt8976 = 0;

	@OriginalMember(owner = "client!lba", name = "Jf", descriptor = "I")
	private int anInt8993 = 0;

	@OriginalMember(owner = "client!lba", name = "sf", descriptor = "Z")
	private boolean aBoolean634 = false;

	@OriginalMember(owner = "client!lba", name = "Xf", descriptor = "I")
	private int anInt8998 = 0;

	@OriginalMember(owner = "client!lba", name = "nf", descriptor = "I")
	private int anInt8983 = -1;

	@OriginalMember(owner = "client!lba", name = "Tf", descriptor = "I")
	public int anInt8997 = 128;

	@OriginalMember(owner = "client!lba", name = "Oe", descriptor = "F")
	public float aFloat169 = -1.0F;

	@OriginalMember(owner = "client!lba", name = "Qf", descriptor = "Z")
	protected boolean aBoolean639 = true;

	@OriginalMember(owner = "client!lba", name = "eg", descriptor = "[F")
	private final float[] aFloatArray67 = new float[16];

	@OriginalMember(owner = "client!lba", name = "Wf", descriptor = "Z")
	protected boolean aBoolean641 = true;

	@OriginalMember(owner = "client!lba", name = "fg", descriptor = "I")
	public int anInt9002 = -1;

	@OriginalMember(owner = "client!lba", name = "Yf", descriptor = "[F")
	private final float[] aFloatArray66 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!lba", name = "Hf", descriptor = "I")
	public int anInt8992 = 8;

	@OriginalMember(owner = "client!lba", name = "dg", descriptor = "F")
	public float aFloat179 = 1.0F;

	@OriginalMember(owner = "client!lba", name = "gg", descriptor = "Z")
	private boolean aBoolean643 = false;

	@OriginalMember(owner = "client!lba", name = "Ye", descriptor = "[F")
	protected float[] aFloatArray65 = this.aFloatArray66;

	@OriginalMember(owner = "client!lba", name = "Ef", descriptor = "I")
	public int anInt8991 = 512;

	@OriginalMember(owner = "client!lba", name = "cg", descriptor = "I")
	protected int anInt9001 = 0;

	@OriginalMember(owner = "client!lba", name = "ue", descriptor = "I")
	protected int anInt8970 = 0;

	@OriginalMember(owner = "client!lba", name = "ig", descriptor = "I")
	protected int anInt9004 = 3584;

	@OriginalMember(owner = "client!lba", name = "kg", descriptor = "[F")
	public final float[] aFloatArray68 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!lba", name = "hg", descriptor = "I")
	public int anInt9003 = 0;

	@OriginalMember(owner = "client!lba", name = "De", descriptor = "[F")
	private final float[] aFloatArray62 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!lba", name = "pe", descriptor = "I")
	public int anInt8967 = 3;

	@OriginalMember(owner = "client!lba", name = "ag", descriptor = "Z")
	private boolean aBoolean642 = false;

	@OriginalMember(owner = "client!lba", name = "jf", descriptor = "Z")
	private boolean aBoolean632 = false;

	@OriginalMember(owner = "client!lba", name = "Sf", descriptor = "[Lclient!qs;")
	private final Class32[] aClass32Array3 = new Class32[10];

	@OriginalMember(owner = "client!lba", name = "Re", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!lba", name = "Hg", descriptor = "Lclient!uf;")
	private final Class207_Sub3 aClass207_Sub3_21 = new Class207_Sub3();

	@OriginalMember(owner = "client!lba", name = "wf", descriptor = "I")
	protected final int anInt8987;

	@OriginalMember(owner = "client!lba", name = "Z", descriptor = "Lclient!ae;")
	protected final Class8 aClass8_124;

	@OriginalMember(owner = "client!lba", name = "db", descriptor = "Ljava/lang/Object;")
	protected final Object anObject23;

	@OriginalMember(owner = "client!lba", name = "Jd", descriptor = "Ljava/lang/Object;")
	private Object anObject24;

	@OriginalMember(owner = "client!lba", name = "Wb", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas13;

	@OriginalMember(owner = "client!lba", name = "zb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!lba", name = "rb", descriptor = "I")
	private int anInt8832;

	@OriginalMember(owner = "client!lba", name = "pd", descriptor = "I")
	public int anInt8924;

	@OriginalMember(owner = "client!lba", name = "ff", descriptor = "I")
	public final int anInt8981;

	@OriginalMember(owner = "client!lba", name = "qc", descriptor = "I")
	private int anInt8875;

	@OriginalMember(owner = "client!lba", name = "Kc", descriptor = "I")
	public int anInt8893;

	@OriginalMember(owner = "client!lba", name = "lf", descriptor = "Lclient!cm;")
	private final Class56 aClass56_3;

	@OriginalMember(owner = "client!lba", name = "Fc", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!ae;II)V")
	protected Class132_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface6 arg2, @OriginalArg(3) Class8 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anInt8987 = arg4;
			this.aClass8_124 = arg3;
			this.anObject24 = this.anObject23 = arg1;
			this.aCanvas12 = this.aCanvas13 = arg0;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt8924 = this.anInt8832 = local307.width;
			this.anInt8981 = arg5;
			this.anInt8893 = this.anInt8875 = local307.height;
			Static144.method2110(true, false);
			if (super.anInterface6_11 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt8981);
				this.aClass56_3 = null;
			} else {
				this.aClass56_3 = new Class56(this, super.anInterface6_11);
				this.aNativeInterface3 = new NativeInterface(super.anInterface6_11.method7087(), this.anInt8981);
				for (@Pc(352) int local352 = 0; local352 < super.anInterface6_11.method7087(); local352++) {
					@Pc(360) Class294 local360 = super.anInterface6_11.method7088(local352);
					if (local360 != null) {
						this.aNativeInterface3.initTextureMetrics(local352, local360.aByte118, local360.aByte116);
					}
				}
			}
		} catch (@Pc(391) Throwable local391) {
			local391.printStackTrace();
			this.method7491();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "(Z)V")
	public final void method7520() {
		if (Static379.aClass257_6 != this.aClass257Array3[this.anInt8970]) {
			this.aClass257Array3[this.anInt8970] = Static379.aClass257_6;
			this.aClass207_Sub3Array3[this.anInt8970].method8204();
			this.method7548();
		}
	}

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "()V")
	@Override
	public final void method7454() {
		if (this.aClass56_3 != null) {
			this.aClass56_3.method1467();
		}
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(IB)Lclient!qs;")
	protected Class32 method7521(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class32_Sub8(this);
		} else if (arg0 == 1) {
			return new Class32_Sub5(this);
		} else if (arg0 == 2) {
			return new Class32_Sub4(this, this.aClass247_8);
		} else if (arg0 == 7) {
			return new Class32_Sub11(this);
		} else {
			return new Class32_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.bf && arg1 == this.anInt9004) {
			return;
		}
		this.anInt9004 = arg1;
		this.bf = arg0;
		this.method7649();
		this.method7525();
		this.method7544();
	}

	@OriginalMember(owner = "client!lba", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt8967 = 0;
		while (arg0 > 1) {
			this.anInt8967++;
			arg0 >>= 0x1;
		}
		this.anInt8992 = 0x1 << this.anInt8967;
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(B)V")
	public final void method7522() {
		if (this.anInt8980 == 4) {
			return;
		}
		this.method7589();
		this.method7642(false);
		this.method7536(false);
		this.method7623(false);
		this.method7622(false);
		this.method7610(false, false, -2);
		this.method7547(1);
		this.method7652(0);
		this.anInt8980 = 4;
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)V")
	@Override
	public void method7458(@OriginalArg(0) int arg0) {
		if (this.aClass56_3 != null) {
			this.aClass56_3.method1468();
		}
		this.anInt9000 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7474() {
		return this.aBoolean628;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method7492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!lba", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9003 = arg1;
		this.anInt8975 = arg0;
		this.anInt8978 = arg3;
		this.anInt8991 = arg2;
		this.method7525();
		this.method7649();
		this.method7540();
		this.method7636();
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "(I)V")
	private void method7523() {
		if (this.aClass342_7 == Static363.aClass342_4) {
			return;
		}
		@Pc(16) Class342 local16 = this.aClass342_7;
		this.aClass342_7 = Static363.aClass342_4;
		if (!local16.method8053()) {
			this.method7633();
		}
		this.method7583();
		this.aFloatArray65 = this.aFloatArray67;
		this.method7639();
		this.anInt8980 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!ok;)V")
	@Override
	public final void method7452(@OriginalArg(0) Class25 arg0) {
		this.aClass25_Sub1_3 = (Class25_Sub1) arg0;
	}

	@OriginalMember(owner = "client!lba", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7608();
		this.method7611(arg3);
		this.method7552(Static583.aClass378_3, 0);
		this.method7598(0, Static583.aClass378_3);
		this.method7547(arg4);
		this.aClass207_Sub3_15.method8239((float) arg2, (float) arg2, 1.0F);
		this.aClass207_Sub3_15.method8209(arg0, arg1, 0);
		this.method7571();
		this.method7584(false);
		this.method7529(this.anInterface12_15, 0);
		this.method7628(this.aClass34_18);
		this.method7546(Static648.aClass60_6, 0, 256);
		this.method7584(true);
		this.method7598(0, Static368.aClass378_1);
		this.method7552(Static368.aClass378_1, 0);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZI)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method7524(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap5.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "(I)V")
	private void method7525() {
		this.aBoolean642 = false;
		this.method7599();
		if (Static168.aClass342_2 == this.aClass342_7) {
			this.method7639();
		}
	}

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "(I)V")
	public final void method7526() {
		this.aClass322Array6 = new Class322[this.anInt8996];
		this.aClass257Array3 = new Class257[this.anInt8996];
		this.anInterface17Array3 = new Interface17[this.anInt8996];
		this.aClass322Array5 = new Class322[this.anInt8996];
		this.aClass207_Sub3Array3 = new Class207_Sub3[this.anInt8996];
		for (@Pc(32) int local32 = 0; local32 < this.anInt8996; local32++) {
			this.aClass322Array6[local32] = Static131.aClass322_3;
			this.aClass322Array5[local32] = Static131.aClass322_3;
			this.aClass257Array3[local32] = Static379.aClass257_6;
			this.aClass207_Sub3Array3[local32] = new Class207_Sub3();
		}
		this.aClass6_Sub17Array5 = new Class6_Sub17[this.anInt8986 - 2];
		this.anInterface17_3 = this.method7638(Static169.aClass265_9, 1, Static417.aClass250_14, 1);
		this.method7483(new Class6_Sub20_Sub1(262144));
		this.aClass34_21 = this.method7549(new Class168[] { new Class168(new Class116[] { Static174.aClass116_1, Static174.aClass116_5 }) });
		this.aClass34_20 = this.method7549(new Class168[] { new Class168(new Class116[] { Static174.aClass116_1, Static174.aClass116_3 }) });
		this.aClass34_19 = this.method7549(new Class168[] { new Class168(Static174.aClass116_1), new Class168(Static174.aClass116_3), new Class168(Static174.aClass116_5), new Class168(Static174.aClass116_2) });
		this.aClass34_16 = this.method7549(new Class168[] { new Class168(Static174.aClass116_1), new Class168(Static174.aClass116_3), new Class168(Static174.aClass116_5) });
		this.aClass184_Sub3_22 = new Class184_Sub3(this, 0, 0, false, false);
		this.aClass184_Sub3_30 = new Class184_Sub3(this, 0, 0, true, true);
		this.aClass184_Sub3_27 = new Class184_Sub3(this, 0, 0, false, false);
		this.aClass184_Sub3_23 = new Class184_Sub3(this, 0, 0, true, true);
		this.aClass184_Sub3_26 = new Class184_Sub3(this, 0, 0, false, false);
		this.aClass184_Sub3_21 = new Class184_Sub3(this, 0, 0, true, true);
		this.aClass184_Sub3_28 = new Class184_Sub3(this, 0, 0, false, false);
		this.aClass184_Sub3_24 = new Class184_Sub3(this, 0, 0, true, true);
		this.aClass184_Sub3_25 = new Class184_Sub3(this, 0, 0, false, false);
		this.aClass184_Sub3_29 = new Class184_Sub3(this, 0, 0, true, true);
		this.aClass323_3 = new Class323(this);
		this.anInterface21_7 = this.method7532(true);
		this.method7586();
		this.aClass247_8 = new Class247(this);
		this.aClass32Array3[1] = this.method7521(1);
		this.aClass32Array3[2] = this.method7521(2);
		this.aClass32Array3[4] = this.method7521(4);
		this.aClass32Array3[5] = this.method7521(5);
		this.aClass32Array3[6] = this.method7521(6);
		this.aClass32Array3[7] = this.method7521(7);
		this.aClass32Array3[3] = this.method7521(3);
		this.aClass32Array3[8] = this.method7521(8);
		this.aClass32Array3[9] = this.method7521(9);
		if (!this.aClass32Array3[2].method8324()) {
			this.aClass32Array3[2] = this.method7521(0);
		}
		if (!this.aClass32Array3[4].method8324()) {
			this.aClass32Array3[4] = this.aClass32Array3[2];
		}
		if (!this.aClass32Array3[8].method8324()) {
			this.aClass32Array3[8] = this.aClass32Array3[4];
		}
		if (!this.aClass32Array3[9].method8324()) {
			this.aClass32Array3[9] = this.aClass32Array3[8];
		}
		this.method7619();
		this.la();
		this.method7477();
	}

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "(Z)V")
	protected abstract void method7527();

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZIB[[I)Lclient!fp;")
	public abstract Interface9 method7528(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2);

	@OriginalMember(owner = "client!lba", name = "y", descriptor = "()Z")
	@Override
	public final boolean method7506() {
		return true;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLclient!fw;I)V")
	public abstract void method7529(@OriginalArg(1) Interface12 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lba", name = "t", descriptor = "()Lclient!oo;")
	@Override
	public final Class207 method7496() {
		return this.aClass207_Sub3_16;
	}

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "(I)I")
	public final int method7530() {
		return this.anInt8974;
	}

	@OriginalMember(owner = "client!lba", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt9004;
	}

	@OriginalMember(owner = "client!lba", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt8924 - 1 <= arg2 && arg1 <= 0 && this.anInt8893 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt9001 = arg0 >= 0 ? arg0 : 0;
		this.anInt8985 = this.anInt8924 < arg2 ? 0 : arg2;
		this.anInt8976 = arg1 < 0 ? 0 : arg1;
		this.anInt8999 = arg3 <= this.anInt8924 ? arg3 : 0;
		if (!this.aBoolean644) {
			this.aBoolean644 = true;
			this.method7527();
		}
		this.method7555();
		this.method7636();
	}

	@OriginalMember(owner = "client!lba", name = "m", descriptor = "(I)V")
	public final void method7531() {
		if (this.anInt8980 == 8) {
			return;
		}
		this.method7523();
		this.method7642(true);
		this.method7623(true);
		this.method7622(true);
		this.method7547(1);
		this.anInt8980 = 8;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZ)Lclient!pm;")
	public abstract Interface21 method7532(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(B)Lclient!uf;")
	public final Class207_Sub3 method7533() {
		return this.aClass207_Sub3_19;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(FFFFFFI)Z")
	private boolean method7534(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(14) Buffer local14 = this.anInterface12_14.method8888();
		if (local14 == null) {
			return false;
		}
		@Pc(25) Stream local25 = this.method7592(local14);
		if (Stream.b()) {
			local25.a(arg2);
			local25.a(arg3);
			local25.a(arg5);
			local25.a(arg1);
			local25.a(arg0);
			local25.a(arg4);
		} else {
			local25.b(arg2);
			local25.b(arg3);
			local25.b(arg5);
			local25.b(arg1);
			local25.b(arg0);
			local25.b(arg4);
		}
		local25.c();
		return this.anInterface12_14.method8891();
	}

	@OriginalMember(owner = "client!lba", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt8985 = this.anInt8924;
		this.anInt9001 = 0;
		this.anInt8976 = 0;
		this.anInt8999 = this.anInt8893;
		if (this.aBoolean644) {
			this.aBoolean644 = false;
			this.method7527();
		}
		this.method7636();
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!oo;)V")
	@Override
	public final void method7517(@OriginalArg(0) Class207 arg0) {
		this.aClass207_Sub3_16 = (Class207_Sub3) arg0;
		this.aClass207_Sub3_18.method8211(this.aClass207_Sub3_16);
		this.aClass207_Sub3_18.method8225();
		this.aClass207_Sub3_19.method8228(this.aClass207_Sub3_18);
		this.aClass207_Sub3_17.method8228(this.aClass207_Sub3_16);
		if (this.aClass342_7.method8053()) {
			this.method7633();
		}
	}

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "()Lclient!oo;")
	@Override
	public final Class207 method7456() {
		return this.aClass207_Sub3_21;
	}

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "(I)V")
	protected abstract void method7535();

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZI)V")
	public final void method7536(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean627 != arg0) {
			this.aBoolean627 = arg0;
			this.method7558();
			this.anInt8980 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIZ)Lclient!ho;")
	@Override
	public final Class9 method7482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class9_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "(I)V")
	protected abstract void method7537();

	@OriginalMember(owner = "client!lba", name = "p", descriptor = "(I)V")
	private void method7538() {
		if (this.aBoolean624) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray64;
		this.aBoolean624 = true;
		if (this.anInt8924 != 0 && this.anInt8893 != 0) {
			local9[11] = 0.0F;
			local9[5] = -2.0F / (float) this.anInt8893;
			local9[13] = 1.0F;
			local9[1] = 0.0F;
			local9[7] = 0.0F;
			local9[3] = 0.0F;
			local9[8] = 0.0F;
			local9[14] = 0.5F;
			local9[2] = 0.0F;
			local9[10] = 0.5F;
			local9[12] = -1.0F;
			local9[9] = 0.0F;
			local9[15] = 1.0F;
			local9[6] = 0.0F;
			local9[4] = 0.0F;
			local9[0] = 2.0F / (float) this.anInt8924;
			return;
		}
		local9[13] = 0.0F;
		local9[0] = 1.0F;
		local9[14] = 0.0F;
		local9[7] = 0.0F;
		local9[8] = 0.0F;
		local9[5] = 1.0F;
		local9[9] = 0.0F;
		local9[6] = 0.0F;
		local9[2] = 0.0F;
		local9[15] = 1.0F;
		local9[11] = 0.0F;
		local9[10] = 1.0F;
		local9[4] = 0.0F;
		local9[3] = 0.0F;
		local9[12] = 0.0F;
		local9[1] = 0.0F;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static14.method456(arg3, this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lba", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass207_Sub3_16.method8226((float) arg1, (float) arg2, (float) arg0);
		@Pc(25) int local25;
		@Pc(28) int local28;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local25 = (int) ((float) this.anInt8991 * this.aClass207_Sub3_16.method8218((float) arg2, (float) arg1, (float) arg0) / local14);
			local28 = (int) ((float) this.anInt8978 * this.aClass207_Sub3_16.method8232((float) arg1, (float) arg2, (float) arg0) / local14);
		} else {
			local25 = this.anInt8975;
			local28 = this.anInt9003;
		}
		arg3[0] = (int) ((float) local25 - this.aFloat167);
		arg3[1] = (int) ((float) local28 - this.aFloat174);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7445() {
		return false;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLclient!uf;)V")
	public final void method7539(@OriginalArg(1) Class207_Sub3 arg0) {
		this.aClass207_Sub3_15.method8211(arg0);
		this.aBoolean623 = false;
		this.method7593();
	}

	@OriginalMember(owner = "client!lba", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass207_Sub3_16.method8226((float) arg1, (float) arg2, (float) arg0);
		if (local14 < (float) this.bf || local14 > (float) this.anInt9004) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt8991 * this.aClass207_Sub3_16.method8218((float) arg2, (float) arg1, (float) arg0) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt8978 * this.aClass207_Sub3_16.method8232((float) arg1, (float) arg2, (float) arg0) / (float) arg3);
		arg4[0] = (int) ((float) local58 - this.aFloat167);
		arg4[1] = (int) ((float) local77 - this.aFloat174);
		arg4[2] = (int) local14;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIZ)Lclient!ho;")
	@Override
	public final Class9 method7476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class9_Sub3 local11 = new Class9_Sub3(this, arg2, arg3, arg4);
		local11.method8932(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!lba", name = "q", descriptor = "(I)V")
	public final void method7540() {
		if (this.aClass342_7 == Static48.aClass342_1) {
			return;
		}
		@Pc(6) Class342 local6 = this.aClass342_7;
		this.aClass342_7 = Static48.aClass342_1;
		if (local6.method8053()) {
			this.method7633();
		}
		this.anInt8980 &= 0xFFFFFFE0;
		this.aFloatArray65 = this.aFloatArray66;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!hw;[Lclient!fm;Z)Lclient!da;")
	@Override
	public final Class19 method7518(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class112[] arg1) {
		return new Class19_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!lba", name = "r", descriptor = "(I)V")
	public final void method7541() {
		if (this.anInt8980 == 2) {
			return;
		}
		this.method7589();
		this.method7642(false);
		this.method7536(false);
		this.method7623(false);
		this.method7622(false);
		this.method7610(false, false, -2);
		this.anInt8980 = 2;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method7483(@OriginalArg(0) Class6_Sub20 arg0) {
		this.aNativeHeap5 = ((Class6_Sub20_Sub1) arg0).aNativeHeap1;
		this.aNativeHeapBuffer8 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!lba", name = "s", descriptor = "(I)Lclient!uf;")
	public final Class207_Sub3 method7542() {
		return this.aClass207_Sub3_18;
	}

	@OriginalMember(owner = "client!lba", name = "t", descriptor = "(I)V")
	public final void method7543() {
		this.method7614(2, Static648.aClass60_6);
	}

	@OriginalMember(owner = "client!lba", name = "u", descriptor = "(I)V")
	private void method7544() {
		if (this.aClass32_3 != null) {
			this.aClass32_3.method8323();
		}
		this.method7563();
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "([FIIZLclient!pb;Z)Lclient!bw;")
	public final Interface2 method7545(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class265 arg4) {
		return this.method7591(arg2, arg3, arg1, arg0, arg4);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!daa;II)V")
	public abstract void method7546(@OriginalArg(1) Class60 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BI)V")
	public final void method7547(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt8990) {
			return;
		}
		@Pc(32) Class134 local32;
		@Pc(34) boolean local34;
		@Pc(36) boolean local36;
		if (arg0 == 1) {
			local34 = true;
			local36 = true;
			local32 = Static457.aClass134_8;
		} else if (arg0 == 2) {
			local34 = true;
			local36 = false;
			local32 = Static164.aClass134_11;
		} else if (arg0 == 128) {
			local32 = Static379.aClass134_6;
			local34 = true;
			local36 = true;
		} else {
			local34 = false;
			local32 = Static41.aClass134_1;
			local36 = false;
		}
		if (local36 != this.aBoolean641) {
			this.aBoolean641 = local36;
			this.method7537();
		}
		if (local34 != this.aBoolean639) {
			this.aBoolean639 = local34;
			this.method7594();
		}
		if (local32 != this.aClass134_9) {
			this.aClass134_9 = local32;
			this.method7604();
		}
		this.anInt8980 &= 0xFFFFFFE3;
		this.anInt8990 = arg0;
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "(B)V")
	private void method7548() {
		this.method7554();
		if (this.aClass32_3 != null) {
			this.aClass32_3.method8321();
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(B[Lclient!im;)Lclient!bfa;")
	public abstract Class34 method7549(@OriginalArg(1) Class168[] arg0);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(II[BBZLclient!pb;)Lclient!bw;")
	public final Interface2 method7550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class265 arg4) {
		return this.method7626(arg2, arg4, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!fm;Z)Lclient!ho;")
	@Override
	public final Class9 method7488(@OriginalArg(0) Class112 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(128) Class9 local128;
		if (arg0.anInt2743 == 0 || arg0.anInt2740 == 0) {
			local128 = this.method7444(new int[1], 1, 1, 1);
		} else {
			@Pc(24) int[] local24 = new int[arg0.anInt2743 * arg0.anInt2740];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(33) int local33;
			@Pc(37) int local37;
			if (arg0.aByteArray30 == null) {
				for (local33 = 0; local33 < arg0.anInt2740; local33++) {
					for (local37 = 0; local37 < arg0.anInt2743; local37++) {
						@Pc(50) int local50 = arg0.anIntArray152[arg0.aByteArray31[local26++] & 0xFF];
						local24[local28++] = local50 == 0 ? 0 : local50 | 0xFF000000;
					}
				}
			} else {
				for (local33 = 0; local33 < arg0.anInt2740; local33++) {
					for (local37 = 0; local37 < arg0.anInt2743; local37++) {
						local24[local28++] = arg0.aByteArray30[local26] << 24 | arg0.anIntArray152[arg0.aByteArray31[local26] & 0xFF];
						local26++;
					}
				}
			}
			local128 = this.method7444(local24, arg0.anInt2743, arg0.anInt2740, arg0.anInt2743);
		}
		local128.method8931(arg0.anInt2745, arg0.anInt2741, arg0.anInt2742, arg0.anInt2744);
		return local128;
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(IZ)V")
	public final void method7551(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean626) {
			this.aBoolean626 = arg0;
			this.method7651();
		}
	}

	@OriginalMember(owner = "client!lba", name = "x", descriptor = "()Z")
	@Override
	public final boolean method7503() {
		return this.aClass32Array3[3].method8324();
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!vq;II)V")
	public final void method7552(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		this.method7612(false, arg1, arg0, false);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local10 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local10 * local10 + local16 * local16));
			local18 = (float) Math.atan2((double) local16, (double) local10);
		}
		this.method7608();
		this.method7611(arg4);
		this.method7552(Static583.aClass378_3, 0);
		this.method7598(0, Static583.aClass378_3);
		this.method7547(0);
		this.aClass207_Sub3_15.method8239(local20, (float) arg5, 1.0F);
		this.aClass207_Sub3_15.method8209(0, -arg5 / 2, 0);
		this.aClass207_Sub3_15.method8207((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass207_Sub3_15.method8209(arg0, arg1, 0);
		this.method7571();
		this.method7584(false);
		this.method7543();
		this.method7584(true);
		this.method7598(0, Static368.aClass378_1);
		this.method7552(Static368.aClass378_1, 0);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!ao;IIII)Lclient!ka;")
	@Override
	public final Class184 method7475(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class184_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "(B)V")
	private void method7553() {
		if (Static168.aClass342_2 == this.aClass342_7) {
			return;
		}
		@Pc(6) Class342 local6 = this.aClass342_7;
		this.aClass342_7 = Static168.aClass342_2;
		if (!local6.method8053()) {
			this.method7633();
		}
		this.method7599();
		this.aFloatArray65 = this.aFloatArray60;
		this.method7639();
		this.anInt8980 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!lba", name = "v", descriptor = "(I)V")
	protected abstract void method7554();

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "(Z)V")
	protected abstract void method7555();

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7494(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas13 == arg0) {
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
			@Pc(53) Object local53 = this.method7579(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "(Z)V")
	protected abstract void method7556();

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "(I)V")
	@Override
	public final void method7486(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZF)V")
	public final void method7557(@OriginalArg(1) float arg0) {
		if (this.aFloat164 != arg0) {
			this.aFloat164 = arg0;
			this.method7525();
		}
	}

	@OriginalMember(owner = "client!lba", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7608();
		this.method7611(arg4);
		this.method7552(Static583.aClass378_3, 0);
		this.method7598(0, Static583.aClass378_3);
		this.method7547(arg5);
		this.aClass207_Sub3_15.method8239((float) arg2, (float) arg3, 1.0F);
		this.aClass207_Sub3_15.method8209(arg0, arg1, 0);
		this.method7571();
		this.method7584(false);
		this.method7543();
		this.method7584(true);
		this.method7598(0, Static368.aClass378_1);
		this.method7552(Static368.aClass378_1, 0);
	}

	@OriginalMember(owner = "client!lba", name = "w", descriptor = "(I)V")
	protected abstract void method7558();

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "(Z)V")
	protected final void method7559() {
		@Pc(9) Enumeration local9 = this.aHashtable7.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method7640(this.aHashtable7.get(local15), local15);
		}
		this.anInterface12_16.method8887();
		this.anInterface12_14.method8887();
		this.anInterface12_15.method8887();
		this.aClass184_Sub3_30.method8683();
		this.aClass184_Sub3_23.method8683();
		this.aClass184_Sub3_21.method8683();
		this.aClass184_Sub3_24.method8683();
		this.aClass184_Sub3_29.method8683();
		this.aClass323_3.method7724();
		this.anInterface21_7.method8887();
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(BI)V")
	public abstract void method7560(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZIIIZI)V")
	private void method7561(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) boolean local8 = arg3 & this.method7503();
		if (!local8 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			arg2 = 2;
			arg1 = 1;
			arg4 = 0;
		}
		if (arg2 != 0 && arg0) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt8998) {
			if (this.anInt8998 != 0) {
				this.aClass32Array3[this.anInt8998 & Integer.MAX_VALUE].method8328();
			}
			if (arg2 == 0) {
				this.aClass32_3 = null;
			} else {
				this.aClass32_3 = this.aClass32Array3[arg2 & Integer.MAX_VALUE];
				this.aClass32_3.method8316(arg0);
				this.aClass32_3.method8315(arg0);
				this.aClass32_3.method8322(arg4, arg1);
			}
			this.anInt8971 = arg1;
			this.anInt8993 = arg4;
			this.anInt8998 = arg2;
		} else if (this.anInt8998 != 0) {
			this.aClass32Array3[this.anInt8998 & Integer.MAX_VALUE].method8315(arg0);
			if (this.anInt8993 != arg4 || this.anInt8971 != arg1) {
				this.aClass32Array3[this.anInt8998 & Integer.MAX_VALUE].method8322(arg4, arg1);
				this.anInt8993 = arg4;
				this.anInt8971 = arg1;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7510(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas13 == arg0) {
			local5 = this.anObject24;
		} else if (this.aHashtable7.containsKey(arg0)) {
			local5 = this.aHashtable7.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method7578(local5, arg0);
		if (arg0 == this.aCanvas12) {
			this.method7646();
		}
	}

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "(Z)V")
	protected abstract void method7562();

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "(B)V")
	protected abstract void method7563();

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZZ)Lclient!fw;")
	public abstract Interface12 method7564(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!lba", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt8975, this.anInt9003, this.anInt8991, this.anInt8978 };
	}

	@OriginalMember(owner = "client!lba", name = "x", descriptor = "(I)V")
	private void method7565() {
		this.aFloat175 = (float) this.anInt9004;
	}

	@OriginalMember(owner = "client!lba", name = "y", descriptor = "(I)Lclient!uf;")
	public final Class207_Sub3 method7566() {
		if (!this.aBoolean643) {
			this.aClass207_Sub3_20.method8223(this.aClass207_Sub3_18, this.aClass207_Sub3_15);
			this.aBoolean643 = true;
		}
		return this.aClass207_Sub3_20;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class12 method7437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class12_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "(II)I")
	@Override
	public final int method7509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!lba", name = "z", descriptor = "(I)V")
	protected abstract void method7567();

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZLclient!vq;IZ)V")
	protected abstract void method7568(@OriginalArg(1) Class378 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!hda;)V")
	@Override
	public final void method7455(@OriginalArg(0) Class137 arg0) {
		this.aClass323_3.method7720(arg0, -1, this);
	}

	@OriginalMember(owner = "client!lba", name = "A", descriptor = "(I)V")
	protected abstract void method7569();

	@OriginalMember(owner = "client!lba", name = "B", descriptor = "(I)V")
	protected void method7570() {
		this.anInt9005 = this.anInt8988;
		this.anInt8988 = 0;
	}

	@OriginalMember(owner = "client!lba", name = "C", descriptor = "(I)V")
	public final void method7571() {
		this.aBoolean623 = false;
		this.method7593();
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "()Z")
	@Override
	public final boolean method7433() {
		return true;
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(BI)V")
	public final void method7572(@OriginalArg(0) byte arg0) {
		this.method7611(arg0 | arg0 << 16 | arg0 << 24 | arg0 << 8);
	}

	@OriginalMember(owner = "client!lba", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt9001 < arg0) {
			local5 = true;
			this.anInt9001 = arg0;
		}
		if (arg2 < this.anInt8985) {
			local5 = true;
			this.anInt8985 = arg2;
		}
		if (arg1 > this.anInt8976) {
			local5 = true;
			this.anInt8976 = arg1;
		}
		if (this.anInt8999 > arg3) {
			local5 = true;
			this.anInt8999 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean644) {
			this.aBoolean644 = true;
			this.method7527();
		}
		this.method7555();
		this.method7636();
	}

	@OriginalMember(owner = "client!lba", name = "s", descriptor = "()Z")
	@Override
	public final boolean method7495() {
		return true;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BILclient!daa;Lclient!pm;III)V")
	public abstract void method7573(@OriginalArg(1) int arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Interface21 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIII)Lclient!ok;")
	@Override
	public final Class25 method7443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class25_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	protected abstract void method7574(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!pb;[BIII)Lclient!at;")
	public abstract Interface1 method7575(@OriginalArg(1) Class265 arg0, @OriginalArg(2) byte[] arg1);

	@OriginalMember(owner = "client!lba", name = "A", descriptor = "()I")
	@Override
	public final int method7511() {
		return this.anInt8986 - 2;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!rh;B)V")
	public abstract void method7577(@OriginalArg(0) Class305 arg0);

	@OriginalMember(owner = "client!lba", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7473(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method7578(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method7579(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!lba", name = "E", descriptor = "(I)V")
	public abstract void method7580();

	@OriginalMember(owner = "client!lba", name = "p", descriptor = "()Z")
	@Override
	public final boolean method7480() {
		return true;
	}

	@OriginalMember(owner = "client!lba", name = "F", descriptor = "(I)V")
	private void method7581() {
		this.anInterface12_14 = this.method7564(true);
		this.anInterface12_14.method8889(24, 12);
		this.aClass34_17 = this.method7549(new Class168[] { new Class168(Static174.aClass116_1) });
	}

	@OriginalMember(owner = "client!lba", name = "G", descriptor = "(I)I")
	public final int method7582() {
		return this.anInt8989;
	}

	@OriginalMember(owner = "client!lba", name = "H", descriptor = "(I)V")
	private void method7583() {
		if (this.aBoolean630) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray67;
		@Pc(17) float local17 = (float) (-this.anInt8975 * this.bf) / (float) this.anInt8991;
		@Pc(32) float local32 = (float) ((this.anInt8924 - this.anInt8975) * this.bf) / (float) this.anInt8991;
		@Pc(43) float local43 = (float) (this.anInt9003 * this.bf) / (float) this.anInt8978;
		@Pc(58) float local58 = (float) ((this.anInt9003 - this.anInt8893) * this.bf) / (float) this.anInt8978;
		if (local17 == local32 || local43 == local58) {
			local5[3] = 0.0F;
			local5[4] = 0.0F;
			local5[9] = 0.0F;
			local5[10] = 1.0F;
			local5[11] = 0.0F;
			local5[15] = 1.0F;
			local5[2] = 0.0F;
			local5[5] = 1.0F;
			local5[14] = 0.0F;
			local5[8] = 0.0F;
			local5[0] = 1.0F;
			local5[13] = 0.0F;
			local5[12] = 0.0F;
			local5[1] = 0.0F;
			local5[6] = 0.0F;
			local5[7] = 0.0F;
		} else {
			@Pc(138) float local138 = (float) this.bf * 2.0F;
			local5[3] = 0.0F;
			local5[9] = (local58 + local43) / (local43 - local58);
			local5[15] = 0.0F;
			local5[4] = 0.0F;
			local5[12] = 0.0F;
			local5[13] = 0.0F;
			local5[1] = 0.0F;
			local5[5] = local138 / (local43 - local58);
			local5[6] = 0.0F;
			local5[7] = 0.0F;
			local5[10] = this.aFloat172 = (float) this.anInt9004 / (float) (this.bf - this.anInt9004);
			local5[0] = local138 / (local32 - local17);
			local5[2] = 0.0F;
			local5[11] = -1.0F;
			local5[8] = (local32 + local17) / (-local17 + local32);
			local5[14] = this.aFloat170 = (float) (this.anInt9004 * this.bf) / (float) (this.bf - this.anInt9004);
		}
		this.method7644();
		this.aBoolean630 = true;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BZ)V")
	public abstract void method7584(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!oea;Lclient!pb;B)Z")
	public abstract boolean method7585(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class265 arg1);

	@OriginalMember(owner = "client!lba", name = "I", descriptor = "(I)V")
	protected final void method7586() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable7 != null && !this.aHashtable7.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable7.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method7579(local26));
			}
		}
		this.aHashtable7 = local9;
		this.method7603();
		this.method7581();
		this.method7653();
		this.aClass323_3.method7726(this);
	}

	@OriginalMember(owner = "client!lba", name = "J", descriptor = "(I)[F")
	public final float[] method7587() {
		return this.aFloatArray66;
	}

	@OriginalMember(owner = "client!lba", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt8984 && this.anInt9002 == arg1 && this.anInt8982 == arg2) {
			return;
		}
		this.anInt8982 = arg2;
		this.anInt8984 = arg0;
		this.anInt9002 = arg1;
		this.method7544();
		this.method7562();
	}

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "(B)V")
	protected abstract void method7588();

	@OriginalMember(owner = "client!lba", name = "K", descriptor = "(I)V")
	private void method7589() {
		if (Static390.aClass342_5 == this.aClass342_7) {
			return;
		}
		@Pc(14) Class342 local14 = this.aClass342_7;
		this.aClass342_7 = Static390.aClass342_5;
		if (local14.method8053()) {
			this.method7633();
		}
		this.method7538();
		this.aFloatArray65 = this.aFloatArray64;
		this.method7639();
		this.anInt8980 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!lba", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7487() {
		return false;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BIIZ[I)Lclient!bw;")
	public final Interface2 method7590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		return this.method7650(arg1, arg0, arg2, 0, 0, arg3);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIZIII[FLclient!pb;)Lclient!bw;")
	protected abstract Interface2 method7591(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(5) int arg2, @OriginalArg(6) float[] arg3, @OriginalArg(7) Class265 arg4);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method7592(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!lba", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean629) {
			throw new RuntimeException("");
		}
		this.anInt8974 = arg3;
		this.anInt8983 = arg2;
		this.anInt8989 = arg1;
		this.anInt8995 = arg0;
		if (this.aBoolean632) {
			this.aClass32Array3[3].method8325();
			this.aClass32Array3[3].method8323();
		}
	}

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "(B)V")
	private void method7593() {
		if (Static390.aClass342_5 == this.aClass342_7) {
			@Pc(7) float local7 = this.method7617();
			this.aClass207_Sub3_15.method8215(0.0F, local7, local7);
		}
		this.aBoolean643 = false;
		this.method7632();
		if (this.aClass32_3 != null) {
			this.aClass32_3.method8320();
		}
	}

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "(B)V")
	protected abstract void method7594();

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(IZ)V")
	public final void method7595(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean635) {
			this.aBoolean635 = arg0;
			this.method7562();
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(B[F)[F")
	public final float[] method7596(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloatArray65[0];
		arg0[4] = this.aFloatArray65[1];
		arg0[12] = this.aFloatArray65[3];
		arg0[8] = this.aFloatArray65[2];
		arg0[13] = this.aFloatArray65[7];
		arg0[5] = this.aFloatArray65[5];
		arg0[2] = this.aFloatArray65[8];
		arg0[1] = this.aFloatArray65[4];
		arg0[9] = this.aFloatArray65[6];
		arg0[3] = this.aFloatArray65[12];
		arg0[7] = this.aFloatArray65[13];
		arg0[10] = this.aFloatArray65[10];
		arg0[14] = this.aFloatArray65[11];
		arg0[6] = this.aFloatArray65[9];
		arg0[15] = this.aFloatArray65[15];
		arg0[11] = this.aFloatArray65[14];
		return arg0;
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)Lclient!za;")
	@Override
	public final Class6_Sub20 method7453(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub20_Sub1 local8 = new Class6_Sub20_Sub1(arg0);
		this.aClass362_59.method8536(local8);
		return local8;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "([IIIIIZ)Lclient!ho;")
	@Override
	public final Class9 method7507(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class9_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!lba", name = "L", descriptor = "(I)I")
	public final int method7597() {
		return this.anInt8983;
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(II)I")
	@Override
	public final int method7448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!lba", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg2 * this.aClass207_Sub3_16.aFloat183 + (float) arg0 * this.aClass207_Sub3_16.aFloat191 + (float) arg1 * this.aClass207_Sub3_16.aFloat192 + this.aClass207_Sub3_16.aFloat188;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg5 * this.aClass207_Sub3_16.aFloat183 + (float) arg3 * this.aClass207_Sub3_16.aFloat191 + (float) arg4 * this.aClass207_Sub3_16.aFloat192 + this.aClass207_Sub3_16.aFloat188;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.bf > local32 && (float) this.bf > local63) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt9004 && (float) this.anInt9004 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt8991 * (this.aClass207_Sub3_16.aFloat184 * (float) arg1 + (float) arg0 * this.aClass207_Sub3_16.aFloat194 + (float) arg2 * this.aClass207_Sub3_16.aFloat186 + this.aClass207_Sub3_16.aFloat193) / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt8991 * (this.aClass207_Sub3_16.aFloat193 + this.aClass207_Sub3_16.aFloat194 * (float) arg3 + (float) arg4 * this.aClass207_Sub3_16.aFloat184 + (float) arg5 * this.aClass207_Sub3_16.aFloat186) / local63);
		if (this.aFloat167 > (float) local135 && this.aFloat167 > (float) local167) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat178 && (float) local167 > this.aFloat178) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt8978 * (this.aClass207_Sub3_16.aFloat189 + (float) arg0 * this.aClass207_Sub3_16.aFloat190 + (float) arg1 * this.aClass207_Sub3_16.aFloat187 + this.aClass207_Sub3_16.aFloat185 * (float) arg2) / local32);
		@Pc(265) int local265 = (int) (((float) arg4 * this.aClass207_Sub3_16.aFloat187 + this.aClass207_Sub3_16.aFloat190 * (float) arg3 + (float) arg5 * this.aClass207_Sub3_16.aFloat185 + this.aClass207_Sub3_16.aFloat189) * (float) this.anInt8978 / local63);
		if (this.aFloat174 > (float) local233 && this.aFloat174 > (float) local265) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat163 && this.aFloat163 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IILclient!vq;)V")
	public final void method7598(@OriginalArg(0) int arg0, @OriginalArg(2) Class378 arg1) {
		this.method7568(arg1, arg0);
	}

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "(B)V")
	private void method7599() {
		if (this.aBoolean642) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray60;
		@Pc(17) float local17 = (float) this.bf;
		@Pc(21) float local21 = (float) this.anInt9004;
		@Pc(33) float local33 = (float) -this.anInt9003 * this.aFloat164 / (float) this.anInt8978;
		@Pc(45) float local45 = this.aFloat164 * (float) -this.anInt8975 / (float) this.anInt8991;
		@Pc(60) float local60 = (float) (this.anInt8924 - this.anInt8975) * this.aFloat164 / (float) this.anInt8991;
		@Pc(75) float local75 = (float) (this.anInt8893 - this.anInt9003) * this.aFloat164 / (float) this.anInt8978;
		if (local60 == local45 || local75 == local33) {
			local13[8] = 0.0F;
			local13[2] = 0.0F;
			local13[10] = 1.0F;
			local13[13] = 0.0F;
			local13[6] = 0.0F;
			local13[9] = 0.0F;
			local13[3] = 0.0F;
			local13[12] = 0.0F;
			local13[7] = 0.0F;
			local13[11] = 0.0F;
			local13[4] = 0.0F;
			local13[14] = 0.0F;
			local13[0] = 1.0F;
			local13[15] = 1.0F;
			local13[1] = 0.0F;
			local13[5] = 1.0F;
		} else {
			local13[2] = 0.0F;
			local13[7] = 0.0F;
			local13[6] = 0.0F;
			local13[1] = 0.0F;
			local13[14] = local17 / (local17 - local21);
			local13[3] = 0.0F;
			local13[15] = 1.0F;
			local13[13] = (local75 + local33) / (-local33 + local75);
			local13[4] = 0.0F;
			local13[8] = 0.0F;
			local13[10] = 1.0F / (local17 - local21);
			local13[5] = 2.0F / (local75 - local33);
			local13[0] = 2.0F / (local60 - local45);
			local13[9] = 0.0F;
			local13[12] = (local45 + local60) / (-local60 + local45);
			local13[11] = 0.0F;
		}
		this.method7565();
		this.aBoolean642 = true;
	}

	@OriginalMember(owner = "client!lba", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!lba", name = "M", descriptor = "(I)I")
	public final int method7600() {
		return this.anInt8995;
	}

	@OriginalMember(owner = "client!lba", name = "N", descriptor = "(I)V")
	public final void method7601() {
		if (this.anInt8980 == 16) {
			return;
		}
		this.method7553();
		this.method7642(true);
		this.method7623(true);
		this.method7622(true);
		this.method7547(1);
		this.anInt8980 = 16;
	}

	@OriginalMember(owner = "client!lba", name = "O", descriptor = "(I)V")
	protected abstract void method7602();

	@OriginalMember(owner = "client!lba", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg1 * this.aClass207_Sub3_16.aFloat192 + this.aClass207_Sub3_16.aFloat191 * (float) arg0 + this.aClass207_Sub3_16.aFloat183 * (float) arg2 + this.aClass207_Sub3_16.aFloat188;
		@Pc(57) float local57 = this.aClass207_Sub3_16.aFloat188 + (float) arg4 * this.aClass207_Sub3_16.aFloat192 + (float) arg3 * this.aClass207_Sub3_16.aFloat191 + (float) arg5 * this.aClass207_Sub3_16.aFloat183;
		if (local32 < (float) this.bf && local57 < (float) this.bf) {
			local7 |= 0x10;
		} else if ((float) this.anInt9004 < local32 && (float) this.anInt9004 < local57) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt8991 * ((float) arg0 * this.aClass207_Sub3_16.aFloat194 + (float) arg1 * this.aClass207_Sub3_16.aFloat184 + (float) arg2 * this.aClass207_Sub3_16.aFloat186 + this.aClass207_Sub3_16.aFloat193) / (float) arg6);
		@Pc(157) int local157 = (int) ((this.aClass207_Sub3_16.aFloat193 + (float) arg5 * this.aClass207_Sub3_16.aFloat186 + this.aClass207_Sub3_16.aFloat194 * (float) arg3 + this.aClass207_Sub3_16.aFloat184 * (float) arg4) * (float) this.anInt8991 / (float) arg6);
		if ((float) local124 < this.aFloat167 && this.aFloat167 > (float) local157) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat178 && this.aFloat178 < (float) local157) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt8978 * ((float) arg1 * this.aClass207_Sub3_16.aFloat187 + this.aClass207_Sub3_16.aFloat190 * (float) arg0 + (float) arg2 * this.aClass207_Sub3_16.aFloat185 + this.aClass207_Sub3_16.aFloat189) / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt8978 * (this.aClass207_Sub3_16.aFloat189 + this.aClass207_Sub3_16.aFloat185 * (float) arg5 + (float) arg4 * this.aClass207_Sub3_16.aFloat187 + this.aClass207_Sub3_16.aFloat190 * (float) arg3) / (float) arg6);
		if ((float) local224 < this.aFloat174 && (float) local257 < this.aFloat174) {
			local7 |= 0x4;
		} else if ((float) local224 > this.aFloat163 && this.aFloat163 < (float) local257) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!lba", name = "P", descriptor = "(I)V")
	private void method7603() {
		this.anInterface12_16 = this.method7564(false);
		this.anInterface12_16.method8889(140, 28);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface12_16.method8888();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method7592(local28);
				if (Stream.b()) {
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
				local35.c();
				if (this.anInterface12_16.method8891()) {
					break;
				}
			}
		}
		this.aClass34_22 = this.method7549(new Class168[] { new Class168(new Class116[] { Static174.aClass116_1, Static174.aClass116_5, Static174.aClass116_5 }) });
	}

	@OriginalMember(owner = "client!lba", name = "Q", descriptor = "(I)V")
	protected abstract void method7604();

	@OriginalMember(owner = "client!lba", name = "R", descriptor = "(I)V")
	protected abstract void method7605();

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "(II)Lclient!pm;")
	public final Interface21 method7606(@OriginalArg(0) int arg0) {
		if (this.anInterface21_7.method8886() < arg0 * 2) {
			this.anInterface21_7.method5800(arg0);
		}
		return this.anInterface21_7;
	}

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "(Z)V")
	protected abstract void method7607();

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "(Z)V")
	private void method7608() {
		if (this.anInt8980 == 1) {
			return;
		}
		this.method7589();
		this.method7642(false);
		this.method7536(false);
		this.method7623(false);
		this.method7622(false);
		this.method7610(false, false, -2);
		this.method7652(1);
		this.method7635(this.anInterface17_3);
		this.anInt8980 = 1;
	}

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "(Z)Lclient!uf;")
	public final Class207_Sub3 method7609() {
		return this.aClass207_Sub3_15;
	}

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "(I)V")
	@Override
	public final void method7485(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass56_3 != null) {
			this.aClass56_3.method1467();
		}
		this.anInt8997 = arg0;
	}

	@OriginalMember(owner = "client!lba", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8995 = arg0;
		this.anInt8989 = arg1;
		this.anInt8983 = arg2;
		this.anInt8974 = arg3;
		this.aBoolean629 = true;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZZIB)V")
	public final void method7610(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 != this.anInt8973 || this.aBoolean629 != this.aBoolean632) {
			@Pc(20) Interface2 local20 = null;
			@Pc(22) int local22 = 0;
			@Pc(24) byte local24 = 0;
			@Pc(26) int local26 = 0;
			@Pc(33) int local33 = this.aBoolean629 ? 3 : 0;
			if (arg2 < 0) {
				this.method7520();
			} else {
				local20 = this.aClass56_3.method1471(arg2);
				@Pc(52) Class294 local52 = super.anInterface6_11.method7088(arg2);
				if (local52.aByte115 == 0 && local52.aByte117 == 0) {
					this.method7520();
				} else {
					@Pc(70) int local70 = local52.aBoolean574 ? 64 : 128;
					@Pc(74) int local74 = local70 * 50;
					@Pc(78) Class207_Sub3 local78 = this.method7613();
					local78.method8235(0.0F, (float) (local52.aByte117 * (this.anInt9000 % local74)) / (float) local74, (float) (this.anInt9000 % local74 * local52.aByte115) / (float) local74);
					this.method7618(Static87.aClass257_2);
				}
				if (!this.aBoolean629) {
					local26 = local52.anInt8334;
					local24 = local52.aByte114;
					local33 = local52.aByte120;
				}
				local22 = local52.anInt8332;
			}
			this.method7561(arg1, local26, local33, arg0, local24);
			if (this.aClass32_3 == null) {
				this.method7635(local20);
				this.method7652(local22);
			} else {
				this.aClass32_3.method8318(local22, local20);
			}
			this.anInt8973 = arg2;
			this.aBoolean632 = this.aBoolean629;
		}
		this.anInt8980 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "(BI)V")
	public final void method7611(@OriginalArg(1) int arg0) {
		if (this.anInt8994 != arg0) {
			this.anInt8994 = arg0;
			this.method7556();
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZIZLclient!vq;Z)V")
	public abstract void method7612(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class378 arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!lba", name = "S", descriptor = "(I)Lclient!uf;")
	public final Class207_Sub3 method7613() {
		return this.aClass207_Sub3Array3[this.anInt8970];
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "([I)V")
	@Override
	public final void method7451(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8924;
		arg0[1] = this.anInt8893;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!daa;Z)V")
	private void method7614(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1) {
		this.method7529(this.anInterface12_16, 0);
		this.method7628(this.aClass34_22);
		this.method7546(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!lba", name = "T", descriptor = "(I)V")
	public final void method7615() {
		this.method7540();
		this.method7639();
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(IB)V")
	public final void method7616(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt8970) {
			this.anInt8970 = arg0;
			this.method7602();
		}
	}

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "()Z")
	@Override
	public final boolean method7470() {
		return false;
	}

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "()Lclient!oo;")
	@Override
	public final Class207 method7467() {
		return new Class207_Sub3();
	}

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "(B)F")
	protected abstract float method7617();

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!oja;)V")
	public final void method7618(@OriginalArg(1) Class257 arg0) {
		this.aClass257Array3[this.anInt8970] = arg0;
		this.method7548();
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(Z)V")
	@Override
	public final void method7502(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "(B)V")
	protected void method7619() {
		this.method7648();
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIF)Lclient!sca;")
	@Override
	public final Class6_Sub17 method7501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub17_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lba", name = "u", descriptor = "()V")
	@Override
	protected void method7498() {
		if (this.aBoolean634) {
			return;
		}
		for (@Pc(13) Class6 local13 = this.aClass362_59.method8538(); local13 != null; local13 = this.aClass362_59.method8530()) {
			((Class6_Sub20_Sub1) local13).method2213();
		}
		@Pc(30) Enumeration local30 = this.aHashtable7.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method7640(this.aHashtable7.get(local36), local36);
		}
		Static557.method7881(false, true);
		this.aNativeInterface3.release();
		this.aBoolean634 = true;
	}

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "(I)V")
	@Override
	public final void method7497(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lba", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt8969;
		if (local15 || this.aFloat176 != arg1 || this.aFloat169 != arg2) {
			this.aFloat176 = arg1;
			this.aFloat169 = arg2;
			this.anInt8969 = arg0;
			if (local15) {
				this.aFloat171 = (float) (this.anInt8969 & 0xFF00) / 65280.0F;
				this.aFloat168 = (float) (this.anInt8969 & 0xFF0000) / 1.671168E7F;
				this.aFloat179 = (float) (this.anInt8969 & 0xFF) / 255.0F;
				this.method7647();
			}
			this.aNativeInterface3.setSunColour(this.aFloat168, this.aFloat171, this.aFloat179, arg1, arg2);
			this.method7627();
		}
		if (this.aFloatArray62[0] != arg3 || arg4 != this.aFloatArray62[1] || this.aFloatArray62[2] != arg5) {
			this.aFloatArray62[2] = arg5;
			this.aFloatArray62[1] = arg4;
			this.aFloatArray62[0] = arg3;
			this.aFloatArray61[2] = -arg5;
			this.aFloatArray61[0] = -arg3;
			this.aFloatArray61[1] = -arg4;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[1] = arg4 * local153;
			this.aFloatArray63[0] = arg3 * local153;
			this.aFloatArray63[2] = arg5 * local153;
			this.aFloatArray68[1] = -this.aFloatArray63[1];
			this.aFloatArray68[2] = -this.aFloatArray63[2];
			this.aFloatArray68[0] = -this.aFloatArray63[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray63[0], this.aFloatArray63[1], this.aFloatArray63[2]);
			this.method7580();
			this.anInt8968 = (int) (arg3 * 256.0F / arg4);
			this.anInt8979 = (int) (arg5 * 256.0F / arg4);
		}
		this.method7605();
	}

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.bf;
	}

	@OriginalMember(owner = "client!lba", name = "U", descriptor = "(I)V")
	private void method7620() {
		this.method7529(this.anInterface12_14, 0);
		this.method7628(this.aClass34_17);
		this.method7546(Static550.aClass60_5, 0, 1);
	}

	@OriginalMember(owner = "client!lba", name = "V", descriptor = "(I)V")
	protected abstract void method7621();

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(ZI)V")
	public final void method7622(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean631 != arg0) {
			this.aBoolean631 = arg0;
			this.method7535();
			this.anInt8980 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "(I)V")
	@Override
	public final void method7484(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "(IZ)V")
	public final void method7623(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean636) {
			this.aBoolean636 = arg0;
			this.method7567();
			this.anInt8980 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!lba", name = "m", descriptor = "(Z)V")
	protected abstract void method7624();

	@OriginalMember(owner = "client!lba", name = "W", descriptor = "(I)V")
	protected abstract void method7625();

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(41) float local41 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local10 * local10)));
			local16 *= local41;
			local10 *= local41;
		}
		if (!this.method7534(local16 + (float) arg3, (float) arg2 + local10, (float) arg0, (float) arg1, 0.0F, 0.0F)) {
			return;
		}
		this.method7608();
		this.method7611(arg4);
		this.method7552(Static583.aClass378_3, 0);
		this.method7598(0, Static583.aClass378_3);
		this.method7547(arg5);
		this.method7641();
		this.method7584(false);
		this.method7620();
		this.method7584(true);
		this.method7598(0, Static368.aClass378_1);
		this.method7552(Static368.aClass378_1, 0);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "([BLclient!pb;ZIIIZI)Lclient!bw;")
	protected abstract Interface2 method7626(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7447() {
		return true;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I[Lclient!sca;)V")
	@Override
	public final void method7504(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub17[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass6_Sub17Array5[local7] = arg1[local7];
		}
		this.anInt8988 = arg0;
		if (this.aClass342_7.method8053()) {
			this.method7570();
		}
	}

	@OriginalMember(owner = "client!lba", name = "Y", descriptor = "(I)V")
	protected abstract void method7627();

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!bfa;I)V")
	public abstract void method7628(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!lba", name = "m", descriptor = "(B)I")
	public final int method7629() {
		return this.anInt8970;
	}

	@OriginalMember(owner = "client!lba", name = "Z", descriptor = "(I)Lclient!fp;")
	public final Interface9 method7630() {
		return this.aClass25_Sub1_3 == null ? null : this.aClass25_Sub1_3.method2637();
	}

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "(B)V")
	private void method7631() {
		this.aBoolean624 = false;
		if (Static390.aClass342_5 == this.aClass342_7) {
			this.method7538();
			this.method7639();
		}
	}

	@OriginalMember(owner = "client!lba", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface2 local9 = local6.anInterface2_5;
		this.method7541();
		this.method7635(local9);
		this.method7547(1);
		this.method7637(Static320.aClass322_5, Static320.aClass322_5);
		this.method7552(Static583.aClass378_3, 0);
		this.method7611(arg0);
		this.aClass207_Sub3_15.method8239((float) this.anInt8924, (float) this.anInt8893, 0.0F);
		this.method7571();
		this.aClass207_Sub3Array3[0].method8239(local9.method8898((float) this.anInt8924), local9.method8900((float) this.anInt8893), 1.0F);
		this.aClass207_Sub3Array3[0].method8215(0.0F, local9.method8898((float) -arg2), local9.method8900((float) -arg3));
		this.aClass257Array3[0] = Static87.aClass257_2;
		this.method7548();
		this.method7543();
		this.method7520();
		this.method7552(Static368.aClass378_1, 0);
	}

	@OriginalMember(owner = "client!lba", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass207_Sub3_16.method8226((float) arg1, (float) arg2, (float) arg0);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt8991 * this.aClass207_Sub3_16.method8218((float) arg2, (float) arg1, (float) arg0) / local14);
			local58 = (int) ((float) this.anInt8978 * this.aClass207_Sub3_16.method8232((float) arg1, (float) arg2, (float) arg0) / local14);
		} else {
			local40 = this.anInt8975;
			local58 = this.anInt9003;
		}
		arg3[1] = (int) ((float) local58 - this.aFloat174);
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local40 - this.aFloat167);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method7441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "(Z)V")
	protected abstract void method7632();

	@OriginalMember(owner = "client!lba", name = "ab", descriptor = "(I)V")
	private void method7633() {
		this.aBoolean643 = false;
		if (this.aClass32_3 != null) {
			this.aClass32_3.method8317();
		}
		this.method7625();
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!oea;ILclient!pb;)Z")
	public abstract boolean method7634(@OriginalArg(0) Class250 arg0, @OriginalArg(2) Class265 arg1);

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method7617();
		this.method7608();
		this.method7611(arg4);
		this.method7552(Static583.aClass378_3, 0);
		this.method7598(0, Static583.aClass378_3);
		this.method7547(arg5);
		this.aClass207_Sub3_15.method8239((float) (arg2 - 1), (float) (arg3 - 1), 1.0F);
		this.aClass207_Sub3_15.method8215(0.0F, (float) arg0 - local7, -local7 + (float) arg1);
		this.method7571();
		this.method7584(false);
		this.method7614(4, Static252.aClass60_2);
		this.method7584(true);
		this.method7598(0, Static368.aClass378_1);
		this.method7552(Static368.aClass378_1, 0);
	}

	@OriginalMember(owner = "client!lba", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt8966 + this.anInt8965 + this.anInt8963;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!ml;I)V")
	public final void method7635(@OriginalArg(0) Interface17 arg0) {
		if (arg0 == this.anInterface17Array3[this.anInt8970]) {
			return;
		}
		this.anInterface17Array3[this.anInt8970] = arg0;
		if (arg0 == null) {
			this.method7624();
		} else {
			arg0.method8895();
		}
		this.anInt8980 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!lba", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7508() {
		return true;
	}

	@OriginalMember(owner = "client!lba", name = "bb", descriptor = "(I)V")
	private void method7636() {
		this.aFloat174 = (float) (this.anInt8976 - this.anInt9003);
		this.aFloat167 = (float) (this.anInt9001 - this.anInt8975);
		this.aFloat178 = (float) (this.anInt8985 - this.anInt8975);
		this.aFloat163 = (float) (this.anInt8999 - this.anInt9003);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method7479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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
		this.method7608();
		this.method7611(arg4);
		this.method7552(Static583.aClass378_3, 0);
		this.method7598(0, Static583.aClass378_3);
		this.method7547(1);
		this.method7641();
		@Pc(81) int local81 = arg7 % (arg6 + arg5);
		this.method7584(false);
		local42 = (float) arg5 * local11;
		@Pc(95) float local95 = local17 * (float) arg5;
		@Pc(97) float local97 = 0.0F;
		@Pc(99) float local99 = 0.0F;
		@Pc(101) float local101 = local42;
		@Pc(103) float local103 = local95;
		if (local81 <= arg5) {
			local103 = (float) (arg5 - local81) * local17;
			local101 = (float) (arg5 - local81) * local11;
		} else {
			local99 = local17 * (float) (arg5 + arg6 - local81);
			local97 = (float) (arg6 + arg5 - local81) * local11;
		}
		@Pc(148) float local148 = (float) arg0 + local97;
		@Pc(153) float local153 = local99 + (float) arg1;
		@Pc(158) float local158 = (float) arg6 * local11;
		@Pc(163) float local163 = (float) arg6 * local17;
		while (true) {
			if (arg2 <= arg0) {
				if ((float) arg2 > local148) {
					break;
				}
				if ((float) arg2 > local148 + local101) {
					local101 = (float) arg2 - local148;
				}
			} else {
				if (local148 > (float) arg2) {
					break;
				}
				if ((float) arg2 < local101 + local148) {
					local101 = (float) arg2 - local148;
				}
			}
			if (arg1 >= arg3) {
				if (local153 < (float) arg3) {
					break;
				}
				if ((float) arg3 > local103 + local153) {
					local103 = (float) arg3 - local153;
				}
			} else {
				if ((float) arg3 < local153) {
					break;
				}
				if ((float) arg3 < local153 + local103) {
					local103 = (float) arg3 - local153;
				}
			}
			if (!this.method7534(local103 + local153, local148 + local101, local148, local153, 0.0F, 0.0F)) {
				return;
			}
			local148 += local101 + local158;
			this.method7620();
			local153 += local103 + local163;
			local101 = local42;
			local103 = local95;
		}
		this.method7584(true);
		this.method7598(0, Static368.aClass378_1);
		this.method7552(Static368.aClass378_1, 0);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!si;ILclient!si;)V")
	public final void method7637(@OriginalArg(0) Class322 arg0, @OriginalArg(2) Class322 arg1) {
		@Pc(10) boolean local10 = false;
		if (arg0 != this.aClass322Array5[this.anInt8970]) {
			this.aClass322Array5[this.anInt8970] = arg0;
			this.method7588();
			local10 = true;
		}
		if (this.aClass322Array6[this.anInt8970] != arg1) {
			this.aClass322Array6[this.anInt8970] = arg1;
			this.method7569();
			local10 = true;
		}
		if (local10) {
			this.anInt8980 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!pb;ILclient!oea;BI)Lclient!bw;")
	public abstract Interface2 method7638(@OriginalArg(0) Class265 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "(Z)V")
	private void method7639() {
		this.method7607();
		if (this.aClass32_3 != null) {
			this.aClass32_3.method8319();
		}
	}

	@OriginalMember(owner = "client!lba", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7473(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7460(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.method7640(this.aHashtable7.get(arg0), arg0);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	protected abstract void method7640(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!lba", name = "p", descriptor = "(Z)V")
	public final void method7641() {
		this.aClass207_Sub3_15.method8204();
		this.aBoolean623 = true;
		this.method7593();
	}

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "(I)V")
	@Override
	public final void method7519() {
	}

	@OriginalMember(owner = "client!lba", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt9006;
	}

	@OriginalMember(owner = "client!lba", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat177 != arg0) {
			this.aFloat177 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method7647();
			this.method7605();
		}
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(ZI)V")
	public final void method7642(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean637) {
			this.aBoolean637 = arg0;
			this.method7562();
			this.anInt8980 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!lba", name = "cb", descriptor = "(I)Lclient!uf;")
	public final Class207_Sub3 method7643() {
		return this.aClass207_Sub3Array3[this.anInt8970];
	}

	@OriginalMember(owner = "client!lba", name = "db", descriptor = "(I)V")
	private void method7644() {
		this.aFloatArray67[14] = this.aFloat170;
		this.aFloatArray67[10] = this.aFloat172;
		this.aFloat173 = ((float) -this.anInt9004 + this.aFloatArray67[14]) / this.aFloatArray67[10];
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7505(@OriginalArg(0) Canvas arg0) {
		this.aCanvas12 = null;
		this.anObject24 = null;
		if (arg0 == null || arg0 == this.aCanvas13) {
			this.anObject24 = this.anObject23;
			this.aCanvas12 = this.aCanvas13;
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.anObject24 = this.aHashtable7.get(arg0);
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.anObject24 == null) {
			throw new RuntimeException();
		}
		this.method7574(this.anObject24, this.aCanvas12);
		this.method7646();
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(BZ)V")
	public final void method7645(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean625 != arg0) {
			this.aBoolean625 = arg0;
			this.method7558();
		}
	}

	@OriginalMember(owner = "client!lba", name = "eb", descriptor = "(I)V")
	private void method7646() {
		if (this.aCanvas12 == null) {
			this.anInt8832 = this.anInt8875 = 1;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas12.getSize();
			this.anInt8832 = local6.width;
			this.anInt8875 = local6.height;
		}
		this.anInt8893 = this.anInt8875;
		this.anInt8924 = this.anInt8832;
		this.method7631();
		this.method7649();
		this.method7525();
		this.method7621();
		this.method7636();
		this.method7540();
		this.la();
	}

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "(B)V")
	protected abstract void method7647();

	@OriginalMember(owner = "client!lba", name = "q", descriptor = "(Z)V")
	private void method7648() {
		this.method7647();
		this.method7627();
		this.method7558();
		this.method7570();
		this.method7580();
		this.method7605();
		this.method7651();
		this.method7567();
		this.method7535();
		this.method7562();
		this.method7563();
		this.method7594();
		this.method7604();
		this.method7537();
		for (@Pc(52) int local52 = this.anInt8996 - 1; local52 >= 0; local52--) {
			this.method7616(local52);
			this.method7588();
			this.method7569();
			this.method7520();
		}
		this.method7556();
		this.method7621();
		this.method7607();
		this.method7632();
		this.method7625();
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!hda;I)V")
	@Override
	public final void method7469(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1) {
		this.aClass323_3.method7720(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!lba", name = "fb", descriptor = "(I)V")
	private void method7649() {
		this.aBoolean630 = false;
		this.method7583();
		if (this.aClass342_7 == Static363.aClass342_4) {
			this.method7639();
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIZIII[I)Lclient!bw;")
	public abstract Interface2 method7650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5);

	@OriginalMember(owner = "client!lba", name = "gb", descriptor = "(I)V")
	protected abstract void method7651();

	@OriginalMember(owner = "client!lba", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt8976;
		arg0[0] = this.anInt9001;
		arg0[2] = this.anInt8985;
		arg0[3] = this.anInt8999;
	}

	@OriginalMember(owner = "client!lba", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean633 = arg0;
		this.method7535();
	}

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "(II)V")
	public final void method7652(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method7637(Static320.aClass322_5, Static320.aClass322_5);
		} else if (arg0 == 0) {
			this.method7637(Static131.aClass322_3, Static131.aClass322_3);
		} else if (arg0 == 2) {
			this.method7637(Static296.aClass322_4, Static320.aClass322_5);
		} else if (arg0 == 3) {
			this.method7637(Static116.aClass322_2, Static131.aClass322_3);
		} else if (arg0 == 4) {
			this.method7637(Static30.aClass322_1, Static30.aClass322_1);
		}
	}

	@OriginalMember(owner = "client!lba", name = "p", descriptor = "(B)V")
	private void method7653() {
		this.anInterface12_15 = this.method7564(false);
		this.anInterface12_15.method8889(3096, 12);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface12_15.method8888();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method7592(local28);
				local35.a(0.0F);
				local35.a(0.0F);
				local35.a(0.0F);
				for (@Pc(46) int local46 = 0; local46 <= 256; local46++) {
					@Pc(57) double local57 = (double) (local46 * 2) * 3.141592653589793D / 256.0D;
					@Pc(61) float local61 = (float) Math.cos(local57);
					@Pc(65) float local65 = (float) Math.sin(local57);
					if (Stream.b()) {
						local35.a(local65);
						local35.a(local61);
						local35.a(0.0F);
					} else {
						local35.b(local65);
						local35.b(local61);
						local35.b(0.0F);
					}
				}
				local35.c();
				if (this.anInterface12_15.method8891()) {
					break;
				}
			}
		}
		this.aClass34_18 = this.method7549(new Class168[] { new Class168(Static174.aClass116_1) });
	}

	@OriginalMember(owner = "client!lba", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean629 = false;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method7515() {
	}
}
