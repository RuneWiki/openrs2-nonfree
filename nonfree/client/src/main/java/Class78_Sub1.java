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

@OriginalClass("client!nv")
public abstract class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!nv", name = "Bb", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!nv", name = "Db", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!nv", name = "Ub", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7;

	@OriginalMember(owner = "client!nv", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!nv", name = "Ed", descriptor = "Lclient!st;")
	protected Class315 aClass315_7;

	@OriginalMember(owner = "client!nv", name = "Pd", descriptor = "I")
	protected int anInt8555;

	@OriginalMember(owner = "client!nv", name = "Rd", descriptor = "I")
	public int anInt8556;

	@OriginalMember(owner = "client!nv", name = "Td", descriptor = "I")
	public int anInt8557;

	@OriginalMember(owner = "client!nv", name = "Zd", descriptor = "[Lclient!tw;")
	protected Class1_Sub24[] aClass1_Sub24Array5;

	@OriginalMember(owner = "client!nv", name = "ae", descriptor = "[Lclient!caa;")
	protected Class34_Sub1[] aClass34_Sub1Array3;

	@OriginalMember(owner = "client!nv", name = "be", descriptor = "I")
	private int anInt8558;

	@OriginalMember(owner = "client!nv", name = "ce", descriptor = "I")
	protected int anInt8559;

	@OriginalMember(owner = "client!nv", name = "de", descriptor = "Z")
	protected boolean aBoolean624;

	@OriginalMember(owner = "client!nv", name = "je", descriptor = "F")
	public float aFloat210;

	@OriginalMember(owner = "client!nv", name = "le", descriptor = "[Lclient!rga;")
	private Interface20[] anInterface20Array3;

	@OriginalMember(owner = "client!nv", name = "oe", descriptor = "Z")
	protected boolean aBoolean628;

	@OriginalMember(owner = "client!nv", name = "pe", descriptor = "F")
	public float aFloat211;

	@OriginalMember(owner = "client!nv", name = "re", descriptor = "Lclient!rga;")
	public Interface20 anInterface20_3;

	@OriginalMember(owner = "client!nv", name = "te", descriptor = "I")
	public int anInt8564;

	@OriginalMember(owner = "client!nv", name = "De", descriptor = "F")
	public float aFloat212;

	@OriginalMember(owner = "client!nv", name = "Je", descriptor = "[Lclient!gi;")
	protected Class118[] aClass118Array5;

	@OriginalMember(owner = "client!nv", name = "Oe", descriptor = "I")
	public int anInt8574;

	@OriginalMember(owner = "client!nv", name = "We", descriptor = "F")
	public float aFloat217;

	@OriginalMember(owner = "client!nv", name = "Ye", descriptor = "I")
	protected int anInt8578;

	@OriginalMember(owner = "client!nv", name = "Ze", descriptor = "I")
	public int anInt8579;

	@OriginalMember(owner = "client!nv", name = "af", descriptor = "Z")
	public boolean aBoolean635;

	@OriginalMember(owner = "client!nv", name = "bf", descriptor = "F")
	private float bf;

	@OriginalMember(owner = "client!nv", name = "ef", descriptor = "Lclient!sb;")
	private Class305 aClass305_3;

	@OriginalMember(owner = "client!nv", name = "ff", descriptor = "I")
	protected int anInt8582;

	@OriginalMember(owner = "client!nv", name = "jf", descriptor = "F")
	private float aFloat218;

	@OriginalMember(owner = "client!nv", name = "mf", descriptor = "Lclient!tc;")
	private Class209_Sub1 aClass209_Sub1_3;

	@OriginalMember(owner = "client!nv", name = "nf", descriptor = "I")
	public int anInt8584;

	@OriginalMember(owner = "client!nv", name = "sf", descriptor = "Lclient!cc;")
	private Class2 aClass2_3;

	@OriginalMember(owner = "client!nv", name = "xf", descriptor = "I")
	protected int anInt8587;

	@OriginalMember(owner = "client!nv", name = "Df", descriptor = "[Lclient!tb;")
	protected Class316[] aClass316Array3;

	@OriginalMember(owner = "client!nv", name = "Hf", descriptor = "Z")
	public boolean aBoolean639;

	@OriginalMember(owner = "client!nv", name = "If", descriptor = "I")
	private int anInt8593;

	@OriginalMember(owner = "client!nv", name = "Mf", descriptor = "F")
	public float aFloat223;

	@OriginalMember(owner = "client!nv", name = "Pf", descriptor = "Z")
	public boolean aBoolean641;

	@OriginalMember(owner = "client!nv", name = "Rf", descriptor = "F")
	public float aFloat224;

	@OriginalMember(owner = "client!nv", name = "Sf", descriptor = "[Lclient!gi;")
	protected Class118[] aClass118Array6;

	@OriginalMember(owner = "client!nv", name = "Xf", descriptor = "Lclient!si;")
	public Class185 aClass185_15;

	@OriginalMember(owner = "client!nv", name = "Yf", descriptor = "Lclient!vc;")
	private Interface23 anInterface23_14;

	@OriginalMember(owner = "client!nv", name = "Zf", descriptor = "Lclient!si;")
	private Class185 aClass185_16;

	@OriginalMember(owner = "client!nv", name = "ag", descriptor = "Lclient!si;")
	public Class185 aClass185_17;

	@OriginalMember(owner = "client!nv", name = "bg", descriptor = "Lclient!jea;")
	private Interface13 anInterface13_8;

	@OriginalMember(owner = "client!nv", name = "cg", descriptor = "Lclient!pea;")
	public Class52_Sub2 aClass52_Sub2_21;

	@OriginalMember(owner = "client!nv", name = "dg", descriptor = "Lclient!pea;")
	public Class52_Sub2 aClass52_Sub2_22;

	@OriginalMember(owner = "client!nv", name = "eg", descriptor = "Lclient!pea;")
	public Class52_Sub2 aClass52_Sub2_23;

	@OriginalMember(owner = "client!nv", name = "fg", descriptor = "Lclient!si;")
	private Class185 aClass185_18;

	@OriginalMember(owner = "client!nv", name = "gg", descriptor = "Lclient!pea;")
	public Class52_Sub2 aClass52_Sub2_24;

	@OriginalMember(owner = "client!nv", name = "hg", descriptor = "Lclient!vc;")
	private Interface23 anInterface23_15;

	@OriginalMember(owner = "client!nv", name = "ig", descriptor = "Lclient!pea;")
	public Class52_Sub2 aClass52_Sub2_25;

	@OriginalMember(owner = "client!nv", name = "jg", descriptor = "Lclient!pea;")
	public Class52_Sub2 aClass52_Sub2_26;

	@OriginalMember(owner = "client!nv", name = "kg", descriptor = "Lclient!pea;")
	public Class52_Sub2 aClass52_Sub2_27;

	@OriginalMember(owner = "client!nv", name = "lg", descriptor = "Lclient!pea;")
	public Class52_Sub2 aClass52_Sub2_28;

	@OriginalMember(owner = "client!nv", name = "mg", descriptor = "Lclient!si;")
	public Class185 aClass185_19;

	@OriginalMember(owner = "client!nv", name = "ng", descriptor = "Lclient!si;")
	public Class185 aClass185_20;

	@OriginalMember(owner = "client!nv", name = "og", descriptor = "Lclient!pea;")
	public Class52_Sub2 aClass52_Sub2_29;

	@OriginalMember(owner = "client!nv", name = "qg", descriptor = "Lclient!pea;")
	public Class52_Sub2 aClass52_Sub2_30;

	@OriginalMember(owner = "client!nv", name = "rg", descriptor = "I")
	private int anInt8598;

	@OriginalMember(owner = "client!nv", name = "sg", descriptor = "Z")
	protected boolean aBoolean644;

	@OriginalMember(owner = "client!nv", name = "I", descriptor = "Lclient!gca;")
	private final Class111 aClass111_56 = new Class111();

	@OriginalMember(owner = "client!nv", name = "Qd", descriptor = "Z")
	protected boolean aBoolean623 = true;

	@OriginalMember(owner = "client!nv", name = "Sd", descriptor = "Lclient!caa;")
	protected final Class34_Sub1 aClass34_Sub1_15 = new Class34_Sub1();

	@OriginalMember(owner = "client!nv", name = "Ud", descriptor = "Lclient!caa;")
	public Class34_Sub1 aClass34_Sub1_16 = new Class34_Sub1();

	@OriginalMember(owner = "client!nv", name = "Vd", descriptor = "Lclient!caa;")
	public final Class34_Sub1 aClass34_Sub1_17 = new Class34_Sub1();

	@OriginalMember(owner = "client!nv", name = "Wd", descriptor = "Lclient!caa;")
	protected final Class34_Sub1 aClass34_Sub1_18 = new Class34_Sub1();

	@OriginalMember(owner = "client!nv", name = "Xd", descriptor = "Lclient!caa;")
	private final Class34_Sub1 aClass34_Sub1_19 = new Class34_Sub1();

	@OriginalMember(owner = "client!nv", name = "Yd", descriptor = "Lclient!caa;")
	private final Class34_Sub1 aClass34_Sub1_20 = new Class34_Sub1();

	@OriginalMember(owner = "client!nv", name = "ie", descriptor = "I")
	private int anInt8561 = 0;

	@OriginalMember(owner = "client!nv", name = "ge", descriptor = "Z")
	private boolean aBoolean625 = false;

	@OriginalMember(owner = "client!nv", name = "ue", descriptor = "I")
	public int anInt8565 = -1;

	@OriginalMember(owner = "client!nv", name = "Ee", descriptor = "I")
	protected int anInt8570 = 0;

	@OriginalMember(owner = "client!nv", name = "ee", descriptor = "[F")
	private final float[] aFloatArray67 = new float[16];

	@OriginalMember(owner = "client!nv", name = "qe", descriptor = "Z")
	protected boolean aBoolean629 = false;

	@OriginalMember(owner = "client!nv", name = "Ce", descriptor = "I")
	private int anInt8569 = -1;

	@OriginalMember(owner = "client!nv", name = "fe", descriptor = "I")
	private int anInt8560 = 0;

	@OriginalMember(owner = "client!nv", name = "se", descriptor = "I")
	private int anInt8563 = 1;

	@OriginalMember(owner = "client!nv", name = "we", descriptor = "Z")
	protected boolean aBoolean630 = false;

	@OriginalMember(owner = "client!nv", name = "Ge", descriptor = "F")
	public float aFloat213 = 1.0F;

	@OriginalMember(owner = "client!nv", name = "Be", descriptor = "Z")
	protected boolean aBoolean632 = false;

	@OriginalMember(owner = "client!nv", name = "he", descriptor = "Z")
	protected boolean aBoolean626 = false;

	@OriginalMember(owner = "client!nv", name = "ne", descriptor = "[F")
	private final float[] aFloatArray68 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!nv", name = "ke", descriptor = "Z")
	private boolean aBoolean627 = false;

	@OriginalMember(owner = "client!nv", name = "Se", descriptor = "F")
	public float aFloat215 = 1.0F;

	@OriginalMember(owner = "client!nv", name = "kf", descriptor = "[F")
	public final float[] aFloatArray72 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!nv", name = "Ie", descriptor = "I")
	protected int anInt8572 = 0;

	@OriginalMember(owner = "client!nv", name = "Te", descriptor = "F")
	public float aFloat216 = 3584.0F;

	@OriginalMember(owner = "client!nv", name = "Qe", descriptor = "I")
	private int anInt8575 = -1;

	@OriginalMember(owner = "client!nv", name = "hf", descriptor = "I")
	protected int anInt8583 = 3584;

	@OriginalMember(owner = "client!nv", name = "tf", descriptor = "F")
	public float aFloat220 = 1.0F;

	@OriginalMember(owner = "client!nv", name = "Fe", descriptor = "Z")
	private boolean aBoolean633 = false;

	@OriginalMember(owner = "client!nv", name = "vf", descriptor = "I")
	public int anInt8585 = 0;

	@OriginalMember(owner = "client!nv", name = "Ae", descriptor = "[F")
	protected float[] aFloatArray69 = this.aFloatArray68;

	@OriginalMember(owner = "client!nv", name = "Re", descriptor = "I")
	protected int anInt8576 = 0;

	@OriginalMember(owner = "client!nv", name = "of", descriptor = "F")
	public float aFloat219 = -1.0F;

	@OriginalMember(owner = "client!nv", name = "ve", descriptor = "I")
	public int anInt8566 = -1;

	@OriginalMember(owner = "client!nv", name = "qf", descriptor = "Z")
	protected boolean aBoolean637 = true;

	@OriginalMember(owner = "client!nv", name = "Le", descriptor = "I")
	protected int anInt8573 = 0;

	@OriginalMember(owner = "client!nv", name = "Ne", descriptor = "Lclient!tp;")
	protected Class322 aClass322_5 = Static534.aClass322_6;

	@OriginalMember(owner = "client!nv", name = "uf", descriptor = "F")
	private float aFloat221 = 1.0F;

	@OriginalMember(owner = "client!nv", name = "lf", descriptor = "Lclient!aba;")
	protected Class4 aClass4_6 = Static235.aClass4_4;

	@OriginalMember(owner = "client!nv", name = "Pe", descriptor = "Z")
	private boolean aBoolean634 = false;

	@OriginalMember(owner = "client!nv", name = "Ef", descriptor = "[F")
	public final float[] aFloatArray74 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!nv", name = "Ff", descriptor = "[Lclient!cc;")
	private final Class2[] aClass2Array3 = new Class2[10];

	@OriginalMember(owner = "client!nv", name = "rf", descriptor = "Z")
	protected boolean aBoolean638 = true;

	@OriginalMember(owner = "client!nv", name = "pf", descriptor = "Z")
	protected boolean aBoolean636 = true;

	@OriginalMember(owner = "client!nv", name = "Af", descriptor = "I")
	public int anInt8589 = 0;

	@OriginalMember(owner = "client!nv", name = "Gf", descriptor = "I")
	private int anInt8592 = 0;

	@OriginalMember(owner = "client!nv", name = "me", descriptor = "I")
	public int anInt8562 = 3;

	@OriginalMember(owner = "client!nv", name = "zf", descriptor = "I")
	public int anInt8588 = 0;

	@OriginalMember(owner = "client!nv", name = "cf", descriptor = "I")
	private int anInt8580 = 0;

	@OriginalMember(owner = "client!nv", name = "Me", descriptor = "[F")
	private final float[] aFloatArray70 = new float[16];

	@OriginalMember(owner = "client!nv", name = "Lf", descriptor = "I")
	protected final int anInt8594 = 0;

	@OriginalMember(owner = "client!nv", name = "Ke", descriptor = "F")
	public float aFloat214 = 1.0F;

	@OriginalMember(owner = "client!nv", name = "Kf", descriptor = "F")
	public float aFloat222 = 3584.0F;

	@OriginalMember(owner = "client!nv", name = "wf", descriptor = "I")
	protected final int anInt8586 = 0;

	@OriginalMember(owner = "client!nv", name = "Of", descriptor = "I")
	public int anInt8595 = 128;

	@OriginalMember(owner = "client!nv", name = "df", descriptor = "I")
	public int anInt8581 = 8;

	@OriginalMember(owner = "client!nv", name = "He", descriptor = "I")
	private int anInt8571 = -1;

	@OriginalMember(owner = "client!nv", name = "yf", descriptor = "[F")
	private final float[] aFloatArray73 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!nv", name = "ye", descriptor = "Z")
	protected boolean aBoolean631 = true;

	@OriginalMember(owner = "client!nv", name = "Cf", descriptor = "I")
	public int anInt8591 = 50;

	@OriginalMember(owner = "client!nv", name = "Qf", descriptor = "I")
	protected int anInt8596 = 0;

	@OriginalMember(owner = "client!nv", name = "Bf", descriptor = "I")
	public int anInt8590 = 512;

	@OriginalMember(owner = "client!nv", name = "xe", descriptor = "I")
	public int anInt8567 = 512;

	@OriginalMember(owner = "client!nv", name = "Nf", descriptor = "[F")
	private final float[] aFloatArray75 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!nv", name = "gf", descriptor = "[F")
	private final float[] aFloatArray71 = new float[16];

	@OriginalMember(owner = "client!nv", name = "Tf", descriptor = "I")
	private int anInt8597 = 16777215;

	@OriginalMember(owner = "client!nv", name = "Uf", descriptor = "F")
	public float aFloat225 = -1.0F;

	@OriginalMember(owner = "client!nv", name = "Vf", descriptor = "Z")
	private boolean aBoolean642 = false;

	@OriginalMember(owner = "client!nv", name = "Jf", descriptor = "Z")
	protected boolean aBoolean640 = true;

	@OriginalMember(owner = "client!nv", name = "Wf", descriptor = "Z")
	private boolean aBoolean643 = false;

	@OriginalMember(owner = "client!nv", name = "Xe", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!nv", name = "pg", descriptor = "Lclient!caa;")
	private final Class34_Sub1 aClass34_Sub1_21 = new Class34_Sub1();

	@OriginalMember(owner = "client!nv", name = "Ue", descriptor = "I")
	protected final int anInt8577;

	@OriginalMember(owner = "client!nv", name = "tc", descriptor = "Lclient!sea;")
	protected final Class308 aClass308_167;

	@OriginalMember(owner = "client!nv", name = "hd", descriptor = "Ljava/lang/Object;")
	protected final Object anObject24;

	@OriginalMember(owner = "client!nv", name = "Hc", descriptor = "Ljava/lang/Object;")
	private Object anObject23;

	@OriginalMember(owner = "client!nv", name = "Fb", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas12;

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!nv", name = "Od", descriptor = "I")
	private int anInt8554;

	@OriginalMember(owner = "client!nv", name = "yc", descriptor = "I")
	public int anInt8491;

	@OriginalMember(owner = "client!nv", name = "yd", descriptor = "I")
	private int anInt8539;

	@OriginalMember(owner = "client!nv", name = "Hb", descriptor = "I")
	public int anInt8451;

	@OriginalMember(owner = "client!nv", name = "ze", descriptor = "I")
	public final int anInt8568;

	@OriginalMember(owner = "client!nv", name = "Ve", descriptor = "Lclient!tr;")
	private final Class324 aClass324_3;

	@OriginalMember(owner = "client!nv", name = "bc", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!fa;Lclient!sea;II)V")
	protected Class78_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface9 arg2, @OriginalArg(3) Class308 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anInt8577 = arg4;
		this.aClass308_167 = arg3;
		this.anObject23 = this.anObject24 = arg1;
		this.aCanvas11 = this.aCanvas12 = arg0;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt8491 = this.anInt8554 = local307.width;
		this.anInt8451 = this.anInt8539 = local307.height;
		this.anInt8568 = arg5;
		Static171.method2748(true, false);
		if (super.anInterface9_13 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt8568);
			this.aClass324_3 = null;
		} else {
			this.aClass324_3 = new Class324(this, super.anInterface9_13);
			this.aNativeInterface3 = new NativeInterface(super.anInterface9_13.method950(), this.anInt8568);
			for (@Pc(352) int local352 = 0; local352 < super.anInterface9_13.method950(); local352++) {
				@Pc(360) Class17 local360 = super.anInterface9_13.method947(local352);
				if (local360 != null) {
					this.aNativeInterface3.initTextureMetrics(local352, local360.aByte21, local360.aByte17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "(I)V")
	private void method6855() {
		if (this.aBoolean642) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray67;
		@Pc(13) float local13 = (float) this.anInt8591;
		@Pc(17) float local17 = (float) this.anInt8583;
		@Pc(29) float local29 = (float) -this.anInt8588 * this.aFloat221 / (float) this.anInt8567;
		@Pc(41) float local41 = (float) -this.anInt8589 * this.aFloat221 / (float) this.anInt8590;
		@Pc(56) float local56 = this.aFloat221 * (float) (this.anInt8491 - this.anInt8589) / (float) this.anInt8590;
		@Pc(71) float local71 = this.aFloat221 * (float) (this.anInt8451 - this.anInt8588) / (float) this.anInt8567;
		if (local56 == local41 || local29 == local71) {
			local9[15] = 1.0F;
			local9[13] = 0.0F;
			local9[5] = 1.0F;
			local9[11] = 0.0F;
			local9[7] = 0.0F;
			local9[8] = 0.0F;
			local9[1] = 0.0F;
			local9[2] = 0.0F;
			local9[10] = 1.0F;
			local9[12] = 0.0F;
			local9[0] = 1.0F;
			local9[4] = 0.0F;
			local9[9] = 0.0F;
			local9[6] = 0.0F;
			local9[3] = 0.0F;
			local9[14] = 0.0F;
		} else {
			local9[1] = 0.0F;
			local9[2] = 0.0F;
			local9[9] = 0.0F;
			local9[6] = 0.0F;
			local9[12] = (local56 + local41) / (-local56 + local41);
			local9[10] = 1.0F / (local13 - local17);
			local9[7] = 0.0F;
			local9[4] = 0.0F;
			local9[5] = 2.0F / (local71 - local29);
			local9[8] = 0.0F;
			local9[3] = 0.0F;
			local9[14] = local13 / (local13 - local17);
			local9[13] = (local71 + local29) / (-local29 + local71);
			local9[15] = 1.0F;
			local9[11] = 0.0F;
			local9[0] = 2.0F / (local56 - local41);
		}
		this.method6912();
		this.aBoolean642 = true;
	}

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "(I)V")
	protected abstract void method6856();

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "(I)V")
	private void method6857() {
		this.method6906();
		if (this.aClass2_3 != null) {
			this.aClass2_3.method7896();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BB)V")
	public final void method6858(@OriginalArg(1) byte arg0) {
		this.method6917(arg0 | arg0 << 16 | arg0 << 24 | arg0 << 8);
	}

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "(I)V")
	protected abstract void method6859();

	@OriginalMember(owner = "client!nv", name = "pa", descriptor = "(III)V")
	@Override
	public final void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8566 == arg0 && this.anInt8565 == arg1 && arg2 == this.anInt8585) {
			return;
		}
		this.anInt8585 = arg2;
		this.anInt8566 = arg0;
		this.anInt8565 = arg1;
		this.method6964();
		this.method6942();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public final Class5 method6842(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class5_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
	protected abstract void method6860();

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(IIIII)V")
	@Override
	protected final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)Lclient!hea;")
	public final Interface11 method6861() {
		return this.aClass209_Sub1_3 == null ? null : this.aClass209_Sub1_3.method4589();
	}

	@OriginalMember(owner = "client!nv", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public final boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass34_Sub1_16.method891((float) arg1, (float) arg2, (float) arg0);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass34_Sub1_16.method891((float) arg4, (float) arg5, (float) arg3);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt8591 > local14 && (float) this.anInt8591 > local31 || !(!(local14 > (float) this.anInt8583) || !((float) this.anInt8583 < local31))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt8590 * this.aClass34_Sub1_16.method904((float) arg0, (float) arg1, (float) arg2) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt8590 * this.aClass34_Sub1_16.method904((float) arg3, (float) arg4, (float) arg5) / local31);
		if ((float) local81 < this.aFloat210 && this.aFloat210 > (float) local99 || this.aFloat211 < (float) local81 && this.aFloat211 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt8567 * this.aClass34_Sub1_16.method898((float) arg0, (float) arg1, (float) arg2) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt8567 * this.aClass34_Sub1_16.method898((float) arg3, (float) arg4, (float) arg5) / local31);
			return (!(this.aFloat224 > (float) local143) || !(this.aFloat224 > (float) local161)) && (!(this.aFloat212 < (float) local143) || !(this.aFloat212 < (float) local161));
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	protected abstract void method6862(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!pn;IZIZ[F)Lclient!cm;")
	public final Interface5 method6863(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float[] arg4) {
		return this.method6918(arg1, arg2, arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I[Lclient!tw;)V")
	@Override
	public final void method6825(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub24[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass1_Sub24Array5[local7] = arg1[local7];
		}
		this.anInt8582 = arg0;
		if (this.aClass322_5.method7149()) {
			this.method6985();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!gi;ILclient!gi;)V")
	public final void method6864(@OriginalArg(0) Class118 arg0, @OriginalArg(2) Class118 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg0 != this.aClass118Array5[this.anInt8573]) {
			this.aClass118Array5[this.anInt8573] = arg0;
			this.method6868();
			local5 = true;
		}
		if (this.aClass118Array6[this.anInt8573] != arg1) {
			this.aClass118Array6[this.anInt8573] = arg1;
			local5 = true;
			this.method6859();
		}
		if (local5) {
			this.anInt8558 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!nv", name = "B", descriptor = "()Z")
	@Override
	public final boolean method6851() {
		return this.aClass2Array3[3].method7902();
	}

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "(I)V")
	private void method6865() {
		this.aBoolean643 = false;
		if (Static352.aClass322_4 == this.aClass322_5) {
			this.method6879();
			this.method6857();
		}
	}

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "(I)V")
	protected abstract void method6866();

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI)V")
	public final void method6867(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt8573) {
			this.anInt8573 = arg0;
			this.method6856();
		}
	}

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "(I)V")
	protected abstract void method6868();

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!jg;Lclient!pn;I)Z")
	public abstract boolean method6869(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class271 arg1);

	@OriginalMember(owner = "client!nv", name = "da", descriptor = "(IIII)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt8491 - 1 <= arg2 && arg1 <= 0 && this.anInt8451 - 1 <= arg3) {
			this.JA();
			return;
		}
		this.anInt8576 = arg2 > this.anInt8491 ? 0 : arg2;
		this.anInt8572 = arg1 >= 0 ? arg1 : 0;
		this.anInt8570 = this.anInt8491 < arg3 ? 0 : arg3;
		this.anInt8596 = arg0 < 0 ? 0 : arg0;
		if (!this.aBoolean644) {
			this.aBoolean644 = true;
			this.method6898();
		}
		this.method6886();
		this.method6967();
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(I)V")
	@Override
	public void method6799(@OriginalArg(0) int arg0) {
		if (this.aClass324_3 != null) {
			this.aClass324_3.method7160();
		}
		this.anInt8564 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "()V")
	@Override
	protected void method6789() {
		if (this.aBoolean634) {
			return;
		}
		for (@Pc(9) Class1 local9 = this.aClass111_56.method2547(); local9 != null; local9 = this.aClass111_56.method2554()) {
			((Class1_Sub16_Sub2) local9).method6471();
		}
		@Pc(26) Enumeration local26 = this.aHashtable7.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method6862(this.aHashtable7.get(local32), local32);
		}
		Static81.method1350(false, true);
		this.aNativeInterface3.release();
		this.aBoolean634 = true;
	}

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "(I)V")
	@Override
	public final void method6849(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(Z)V")
	public final void method6870() {
		this.method6977(Static528.aClass77_6, 2);
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V")
	private void method6871() {
		if (this.aCanvas11 == null) {
			this.anInt8554 = this.anInt8539 = 1;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas11.getSize();
			this.anInt8539 = local18.height;
			this.anInt8554 = local18.width;
		}
		this.anInt8491 = this.anInt8554;
		this.anInt8451 = this.anInt8539;
		this.method6865();
		this.method6884();
		this.method6936();
		this.method6962();
		this.method6967();
		this.method6911();
		this.JA();
	}

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "(I)V")
	public final void method6872() {
		this.anInterface20Array3 = new Interface20[this.anInt8584];
		this.aClass118Array6 = new Class118[this.anInt8584];
		this.aClass118Array5 = new Class118[this.anInt8584];
		this.aClass34_Sub1Array3 = new Class34_Sub1[this.anInt8584];
		this.aClass316Array3 = new Class316[this.anInt8584];
		for (@Pc(38) int local38 = 0; local38 < this.anInt8584; local38++) {
			this.aClass118Array6[local38] = Static31.aClass118_1;
			this.aClass118Array5[local38] = Static31.aClass118_1;
			this.aClass316Array3[local38] = Static21.aClass316_1;
			this.aClass34_Sub1Array3[local38] = new Class34_Sub1();
		}
		this.aClass1_Sub24Array5 = new Class1_Sub24[this.anInt8578 - 2];
		this.anInterface20_3 = this.method6885(Static429.aClass271_12, 1, Static243.aClass172_9, 1);
		this.method6798(new Class1_Sub16_Sub2(262144));
		this.aClass185_19 = this.method6938(new Class318[] { new Class318(new Class174[] { Static246.aClass174_1, Static246.aClass174_5 }) });
		this.aClass185_15 = this.method6938(new Class318[] { new Class318(new Class174[] { Static246.aClass174_1, Static246.aClass174_3 }) });
		this.aClass185_20 = this.method6938(new Class318[] { new Class318(Static246.aClass174_1), new Class318(Static246.aClass174_3), new Class318(Static246.aClass174_5), new Class318(Static246.aClass174_2) });
		this.aClass185_17 = this.method6938(new Class318[] { new Class318(Static246.aClass174_1), new Class318(Static246.aClass174_3), new Class318(Static246.aClass174_5) });
		this.aClass52_Sub2_21 = new Class52_Sub2(this, 0, 0, false, false);
		this.aClass52_Sub2_28 = new Class52_Sub2(this, 0, 0, true, true);
		this.aClass52_Sub2_22 = new Class52_Sub2(this, 0, 0, false, false);
		this.aClass52_Sub2_27 = new Class52_Sub2(this, 0, 0, true, true);
		this.aClass52_Sub2_25 = new Class52_Sub2(this, 0, 0, false, false);
		this.aClass52_Sub2_29 = new Class52_Sub2(this, 0, 0, true, true);
		this.aClass52_Sub2_24 = new Class52_Sub2(this, 0, 0, false, false);
		this.aClass52_Sub2_30 = new Class52_Sub2(this, 0, 0, true, true);
		this.aClass52_Sub2_26 = new Class52_Sub2(this, 0, 0, false, false);
		this.aClass52_Sub2_23 = new Class52_Sub2(this, 0, 0, true, true);
		this.aClass305_3 = new Class305(this);
		this.anInterface13_8 = this.method6980(true);
		this.method6881();
		this.aClass315_7 = new Class315(this);
		this.aClass2Array3[1] = this.method6926(1);
		this.aClass2Array3[2] = this.method6926(2);
		this.aClass2Array3[4] = this.method6926(4);
		this.aClass2Array3[5] = this.method6926(5);
		this.aClass2Array3[6] = this.method6926(6);
		this.aClass2Array3[7] = this.method6926(7);
		this.aClass2Array3[3] = this.method6926(3);
		this.aClass2Array3[8] = this.method6926(8);
		this.aClass2Array3[9] = this.method6926(9);
		if (!this.aClass2Array3[2].method7902()) {
			this.aClass2Array3[2] = this.method6926(0);
		}
		if (!this.aClass2Array3[4].method7902()) {
			this.aClass2Array3[4] = this.aClass2Array3[2];
		}
		if (!this.aClass2Array3[8].method7902()) {
			this.aClass2Array3[8] = this.aClass2Array3[4];
		}
		if (!this.aClass2Array3[9].method7902()) {
			this.aClass2Array3[9] = this.aClass2Array3[8];
		}
		this.method6890();
		this.JA();
		this.method6809();
	}

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "(I)V")
	private void method6873() {
		if (this.aBoolean625) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray71;
		@Pc(21) float local21 = (float) (this.anInt8591 * -this.anInt8589) / (float) this.anInt8590;
		@Pc(36) float local36 = (float) ((this.anInt8491 - this.anInt8589) * this.anInt8591) / (float) this.anInt8590;
		@Pc(47) float local47 = (float) (this.anInt8591 * this.anInt8588) / (float) this.anInt8567;
		@Pc(62) float local62 = (float) ((this.anInt8588 - this.anInt8451) * this.anInt8591) / (float) this.anInt8567;
		if (local21 == local36 || local47 == local62) {
			local9[6] = 0.0F;
			local9[7] = 0.0F;
			local9[1] = 0.0F;
			local9[3] = 0.0F;
			local9[4] = 0.0F;
			local9[10] = 1.0F;
			local9[8] = 0.0F;
			local9[5] = 1.0F;
			local9[15] = 1.0F;
			local9[9] = 0.0F;
			local9[13] = 0.0F;
			local9[11] = 0.0F;
			local9[14] = 0.0F;
			local9[12] = 0.0F;
			local9[0] = 1.0F;
			local9[2] = 0.0F;
		} else {
			@Pc(142) float local142 = (float) this.anInt8591 * 2.0F;
			local9[1] = 0.0F;
			local9[9] = (local62 + local47) / (-local62 + local47);
			local9[14] = this.aFloat218 = (float) (this.anInt8591 * this.anInt8583) / (float) (this.anInt8591 - this.anInt8583);
			local9[5] = local142 / (local47 - local62);
			local9[13] = 0.0F;
			local9[4] = 0.0F;
			local9[3] = 0.0F;
			local9[2] = 0.0F;
			local9[12] = 0.0F;
			local9[8] = (local21 + local36) / (-local21 + local36);
			local9[15] = 0.0F;
			local9[7] = 0.0F;
			local9[0] = local142 / (local36 - local21);
			local9[10] = this.bf = (float) this.anInt8583 / (float) (this.anInt8591 - this.anInt8583);
			local9[6] = 0.0F;
			local9[11] = -1.0F;
		}
		this.method6979();
		this.aBoolean625 = true;
	}

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "()Z")
	@Override
	public final boolean method6808() {
		return this.aBoolean628;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!dk;I)V")
	@Override
	public final void method6850(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		this.aClass305_3.method6489(arg1, arg0, this);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z[IIII)Lclient!cm;")
	public final Interface5 method6874(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method6986(arg0, arg1, arg3, 0, 0, arg2);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(Lclient!jg;Lclient!pn;I)Z")
	public abstract boolean method6875(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class271 arg1);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!caa;)V")
	public final void method6876(@OriginalArg(1) Class34_Sub1 arg0) {
		this.aClass34_Sub1_15.M(arg0);
		this.aBoolean623 = false;
		this.method6970();
	}

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "(I)V")
	private void method6877() {
		this.method6963();
		if (this.aClass2_3 != null) {
			this.aClass2_3.method7890();
		}
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(B)V")
	public final void method6878() {
		if (this.anInt8558 == 4) {
			return;
		}
		this.method6907();
		this.method6978(false);
		this.method6949(false);
		this.method6944(false);
		this.method6953(false);
		this.method6948(false, false, -2);
		this.method6913(1);
		this.method6943(0);
		this.anInt8558 = 4;
	}

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "(I)V")
	private void method6879() {
		if (this.aBoolean643) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray70;
		this.aBoolean643 = true;
		if (this.anInt8491 != 0 && this.anInt8451 != 0) {
			local9[8] = 0.0F;
			local9[12] = -1.0F;
			local9[1] = 0.0F;
			local9[3] = 0.0F;
			local9[0] = 2.0F / (float) this.anInt8491;
			local9[15] = 1.0F;
			local9[9] = 0.0F;
			local9[4] = 0.0F;
			local9[13] = 1.0F;
			local9[5] = -2.0F / (float) this.anInt8451;
			local9[14] = 0.5F;
			local9[10] = 0.5F;
			local9[11] = 0.0F;
			local9[6] = 0.0F;
			local9[7] = 0.0F;
			local9[2] = 0.0F;
			return;
		}
		local9[10] = 1.0F;
		local9[2] = 0.0F;
		local9[14] = 0.0F;
		local9[8] = 0.0F;
		local9[9] = 0.0F;
		local9[3] = 0.0F;
		local9[12] = 0.0F;
		local9[6] = 0.0F;
		local9[11] = 0.0F;
		local9[4] = 0.0F;
		local9[5] = 1.0F;
		local9[1] = 0.0F;
		local9[0] = 1.0F;
		local9[13] = 0.0F;
		local9[7] = 0.0F;
		local9[15] = 1.0F;
	}

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "(I)V")
	protected abstract void method6880();

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(Z)V")
	protected final void method6881() {
		@Pc(18) Hashtable local18 = new Hashtable();
		if (this.aHashtable7 != null && !this.aHashtable7.isEmpty()) {
			@Pc(29) Enumeration local29 = this.aHashtable7.keys();
			while (local29.hasMoreElements()) {
				@Pc(35) Canvas local35 = (Canvas) local29.nextElement();
				local18.put(local35, this.method6889(local35));
			}
		}
		this.aHashtable7 = local18;
		this.method6961();
		this.method6950();
		this.aClass305_3.method6485(this);
	}

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "(I)V")
	protected abstract void method6882();

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZB)V")
	public final void method6883(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean640 != arg0) {
			this.aBoolean640 = arg0;
			this.method6915();
		}
	}

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "(I)V")
	private void method6884() {
		this.aBoolean625 = false;
		this.method6873();
		if (this.aClass322_5 == Static197.aClass322_3) {
			this.method6857();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLclient!pn;ILclient!jg;I)Lclient!cm;")
	public abstract Interface5 method6885(@OriginalArg(1) Class271 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class172 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!nv", name = "XA", descriptor = "(IIIII)V")
	@Override
	public final void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6815(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(B)V")
	protected abstract void method6886();

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public final void method6798(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aNativeHeap6 = ((Class1_Sub16_Sub2) arg0).aNativeHeap5;
		this.aNativeHeapBuffer8 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!nv", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLclient!ou;)V")
	public abstract void method6887(@OriginalArg(1) Class260 arg0);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public final Class129 method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class129_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!nv", name = "w", descriptor = "(I)Lclient!caa;")
	public final Class34_Sub1 method6888() {
		return this.aClass34_Sub1_18;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method6889(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "(I)V")
	protected void method6890() {
		this.method6952();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method6891(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap6.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(I)Lclient!e;")
	@Override
	public final Class1_Sub16 method6829(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub16_Sub2 local8 = new Class1_Sub16_Sub2(arg0);
		this.aClass111_56.method2552(local8);
		return local8;
	}

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "(I)I")
	public final int method6892() {
		return this.anInt8573;
	}

	@OriginalMember(owner = "client!nv", name = "z", descriptor = "(I)Lclient!caa;")
	public final Class34_Sub1 method6893() {
		return this.aClass34_Sub1Array3[this.anInt8573];
	}

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(B)I")
	public final int method6894() {
		return this.anInt8593;
	}

	@OriginalMember(owner = "client!nv", name = "va", descriptor = "(I)V")
	@Override
	public final void va(@OriginalArg(0) int arg0) {
		this.anInt8562 = 0;
		while (arg0 > 1) {
			this.anInt8562++;
			arg0 >>= 0x1;
		}
		this.anInt8581 = 0x1 << this.anInt8562;
	}

	@OriginalMember(owner = "client!nv", name = "A", descriptor = "(I)V")
	public final void method6895() {
		this.aBoolean623 = false;
		this.method6970();
	}

	@OriginalMember(owner = "client!nv", name = "B", descriptor = "(I)V")
	protected abstract void method6896();

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method6897(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "(B)V")
	protected abstract void method6898();

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZ)V")
	public final void method6899(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean626 != arg0) {
			this.aBoolean626 = arg0;
			this.method6910();
		}
	}

	@OriginalMember(owner = "client!nv", name = "V", descriptor = "(IIII)V")
	@Override
	public final void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt8596 < arg0) {
			local5 = true;
			this.anInt8596 = arg0;
		}
		if (arg2 < this.anInt8576) {
			this.anInt8576 = arg2;
			local5 = true;
		}
		if (this.anInt8572 < arg1) {
			this.anInt8572 = arg1;
			local5 = true;
		}
		if (arg3 < this.anInt8570) {
			this.anInt8570 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean644) {
			this.aBoolean644 = true;
			this.method6898();
		}
		this.method6886();
		this.method6967();
	}

	@OriginalMember(owner = "client!nv", name = "GA", descriptor = "(II)V")
	@Override
	public final void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt8591 && this.anInt8583 == arg1) {
			return;
		}
		this.anInt8583 = arg1;
		this.anInt8591 = arg0;
		this.method6884();
		this.method6936();
		this.method6964();
	}

	@OriginalMember(owner = "client!nv", name = "ra", descriptor = "(F)V")
	@Override
	public final void ra(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat213) {
			this.aFloat213 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method6956();
			this.method6933();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public final Class5 method6823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class5_Sub2 local11 = new Class5_Sub2(this, arg2, arg3, arg4);
		local11.da(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!nv", name = "C", descriptor = "(I)V")
	private void method6900() {
		if (this.anInt8558 == 1) {
			return;
		}
		this.method6907();
		this.method6978(false);
		this.method6949(false);
		this.method6944(false);
		this.method6953(false);
		this.method6948(false, false, -2);
		this.method6943(1);
		this.method6931(this.anInterface20_3);
		this.anInt8558 = 1;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZI)V")
	public abstract void method6901(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(FFFFFFI)Z")
	private boolean method6902(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface23_15.method5570();
		if (local9 == null) {
			return false;
		}
		@Pc(22) Stream local22 = this.method6925(local9);
		if (Stream.b()) {
			local22.b(arg1);
			local22.b(arg0);
			local22.b(arg3);
			local22.b(arg2);
			local22.b(arg5);
			local22.b(arg4);
		} else {
			local22.a(arg1);
			local22.a(arg0);
			local22.a(arg3);
			local22.a(arg2);
			local22.a(arg5);
			local22.a(arg4);
		}
		local22.a();
		return this.anInterface23_15.method5572();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!hw;B)V")
	public final void method6903(@OriginalArg(0) int arg0, @OriginalArg(1) Class148 arg1) {
		this.method6934(arg1, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt8555 + this.anInt8556 + this.anInt8557;
	}

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "(B)Lclient!caa;")
	public final Class34_Sub1 method6904() {
		return this.aClass34_Sub1_15;
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(Z)I")
	public final int method6905() {
		return this.anInt8575;
	}

	@OriginalMember(owner = "client!nv", name = "D", descriptor = "(I)V")
	protected abstract void method6906();

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)I")
	@Override
	public final int method6782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "()Z")
	@Override
	public final boolean method6810() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "E", descriptor = "(I)V")
	private void method6907() {
		if (Static352.aClass322_4 == this.aClass322_5) {
			return;
		}
		@Pc(14) Class322 local14 = this.aClass322_5;
		this.aClass322_5 = Static352.aClass322_4;
		if (local14.method7149()) {
			this.method6981();
		}
		this.method6879();
		this.aFloatArray69 = this.aFloatArray70;
		this.method6857();
		this.anInt8558 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLclient!pn;IZII[BI)Lclient!cm;")
	protected abstract Interface5 method6908(@OriginalArg(1) Class271 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) byte[] arg4);

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "()Z")
	@Override
	public final boolean method6831() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!tb;B)V")
	public final void method6909(@OriginalArg(0) Class316 arg0) {
		this.aClass316Array3[this.anInt8573] = arg0;
		this.method6877();
	}

	@OriginalMember(owner = "client!nv", name = "BA", descriptor = "()I")
	@Override
	public final int BA() {
		return this.anInt8591;
	}

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "(B)V")
	protected abstract void method6910();

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(Z)V")
	public final void method6911() {
		if (this.aClass322_5 == Static534.aClass322_6) {
			return;
		}
		@Pc(14) Class322 local14 = this.aClass322_5;
		this.aClass322_5 = Static534.aClass322_6;
		if (local14.method7149()) {
			this.method6981();
		}
		this.aFloatArray69 = this.aFloatArray68;
		this.anInt8558 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "(B)V")
	private void method6912() {
		this.aFloat222 = this.anInt8583;
	}

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "()V")
	@Override
	public final void method6816() {
		if (this.aClass324_3 != null) {
			this.aClass324_3.method7161();
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(II)V")
	public final void method6913(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt8563) {
			return;
		}
		@Pc(26) Class4 local26;
		@Pc(24) boolean local24;
		@Pc(28) boolean local28;
		if (arg0 == 1) {
			local24 = true;
			local26 = Static235.aClass4_4;
			local28 = true;
		} else if (arg0 == 2) {
			local24 = true;
			local26 = Static526.aClass4_7;
			local28 = false;
		} else if (arg0 == 128) {
			local24 = true;
			local26 = Static148.aClass4_3;
			local28 = true;
		} else {
			local26 = Static260.aClass4_5;
			local24 = false;
			local28 = false;
		}
		if (local28 != this.aBoolean636) {
			this.aBoolean636 = local28;
			this.method6866();
		}
		if (local24 != this.aBoolean638) {
			this.aBoolean638 = local24;
			this.method6954();
		}
		if (local26 != this.aClass4_6) {
			this.aClass4_6 = local26;
			this.method6945();
		}
		this.anInt8563 = arg0;
		this.anInt8558 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!nv", name = "G", descriptor = "(I)V")
	protected abstract void method6915();

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "(B)V")
	private void method6916() {
		this.method6965(this.anInterface23_15, 0);
		this.method6941(this.aClass185_18);
		this.method6966(0, Static578.aClass77_8, 1);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(ZI)V")
	public final void method6917(@OriginalArg(1) int arg0) {
		if (this.anInt8587 != arg0) {
			this.anInt8587 = arg0;
			this.method6860();
		}
	}

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "()Z")
	@Override
	public final boolean method6845() {
		return false;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!qga;Z)Lclient!f;")
	@Override
	public final Class5 method6838(@OriginalArg(0) Class282 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(128) Class5 local128;
		if (arg0.anInt7490 == 0 || arg0.anInt7493 == 0) {
			local128 = this.method6842(new int[1], 1, 1, 1);
		} else {
			@Pc(21) int[] local21 = new int[arg0.anInt7493 * arg0.anInt7490];
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg0.aByteArray73 == null) {
				for (local30 = 0; local30 < arg0.anInt7493; local30++) {
					for (local34 = 0; local34 < arg0.anInt7490; local34++) {
						@Pc(92) int local92 = arg0.anIntArray445[arg0.aByteArray74[local23++] & 0xFF];
						local21[local25++] = local92 == 0 ? 0 : local92 | 0xFF000000;
					}
				}
			} else {
				for (local30 = 0; local30 < arg0.anInt7493; local30++) {
					for (local34 = 0; local34 < arg0.anInt7490; local34++) {
						local21[local25++] = arg0.aByteArray73[local23] << 24 | arg0.anIntArray445[arg0.aByteArray74[local23] & 0xFF];
						local23++;
					}
				}
			}
			local128 = this.method6842(local21, arg0.anInt7490, arg0.anInt7490, arg0.anInt7493);
		}
		local128.Q(arg0.anInt7491, arg0.anInt7492, arg0.anInt7488, arg0.anInt7489);
		return local128;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!vn;[Lclient!qga;Z)Lclient!la;")
	@Override
	public final Class96 method6837(@OriginalArg(0) Class352 arg0, @OriginalArg(1) Class282[] arg1) {
		return new Class96_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!dk;)V")
	@Override
	public final void method6796(@OriginalArg(0) Class64 arg0) {
		this.aClass305_3.method6489(-1, arg0, this);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZI[FIIILclient!pn;)Lclient!cm;")
	protected abstract Interface5 method6918(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(7) Class271 arg4);

	@OriginalMember(owner = "client!nv", name = "YA", descriptor = "(IIII)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean641) {
			throw new RuntimeException("");
		}
		this.anInt8571 = arg1;
		this.anInt8593 = arg0;
		this.anInt8580 = arg3;
		this.anInt8575 = arg2;
		if (this.aBoolean627) {
			this.aClass2Array3[3].method7903();
			this.aClass2Array3[3].method7891();
		}
	}

	@OriginalMember(owner = "client!nv", name = "H", descriptor = "(I)V")
	protected abstract void method6919();

	@OriginalMember(owner = "client!nv", name = "la", descriptor = "(IIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8589 = arg0;
		this.anInt8590 = arg2;
		this.anInt8588 = arg1;
		this.anInt8567 = arg3;
		this.method6936();
		this.method6884();
		this.method6911();
		this.method6967();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method6836() {
	}

	@OriginalMember(owner = "client!nv", name = "I", descriptor = "(I)V")
	public final void method6920() {
		if (Static21.aClass316_1 != this.aClass316Array3[this.anInt8573]) {
			this.aClass316Array3[this.anInt8573] = Static21.aClass316_1;
			this.aClass34_Sub1Array3[this.anInt8573].Y();
			this.method6877();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	protected abstract void method6921(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!nv", name = "J", descriptor = "(I)Lclient!caa;")
	public final Class34_Sub1 method6922() {
		return this.aClass34_Sub1Array3[this.anInt8573];
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!pn;[BBIZI)Lclient!cm;")
	public final Interface5 method6923(@OriginalArg(0) Class271 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method6908(arg0, arg4, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!nv", name = "MA", descriptor = "(III[I)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass34_Sub1_16.method891((float) arg1, (float) arg2, (float) arg0);
		@Pc(25) int local25;
		@Pc(28) int local28;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local25 = (int) ((float) this.anInt8590 * this.aClass34_Sub1_16.method904((float) arg0, (float) arg1, (float) arg2) / local14);
			local28 = (int) ((float) this.anInt8567 * this.aClass34_Sub1_16.method898((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local25 = this.anInt8589;
			local28 = this.anInt8588;
		}
		arg3[1] = (int) ((float) local28 - this.aFloat224);
		arg3[0] = (int) ((float) local25 - this.aFloat210);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!nv", name = "AA", descriptor = "(III[I)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass34_Sub1_16.method891((float) arg1, (float) arg2, (float) arg0);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt8590 * this.aClass34_Sub1_16.method904((float) arg0, (float) arg1, (float) arg2) / local14);
			local58 = (int) ((float) this.anInt8567 * this.aClass34_Sub1_16.method898((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local40 = this.anInt8589;
			local58 = this.anInt8588;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat210);
		arg3[1] = (int) ((float) local58 - this.aFloat224);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!nv", name = "K", descriptor = "(I)I")
	public final int method6924() {
		return this.anInt8580;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;I)Lclient!jaclib/memory/Stream;")
	public final Stream method6925(@OriginalArg(0) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!nv", name = "L", descriptor = "()V")
	@Override
	public final void L() {
		this.aBoolean641 = false;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(II)Lclient!cc;")
	protected Class2 method6926(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class2_Sub7(this);
		} else if (arg0 == 1) {
			return new Class2_Sub3(this);
		} else if (arg0 == 2) {
			return new Class2_Sub10(this, this.aClass315_7);
		} else if (arg0 == 7) {
			return new Class2_Sub11(this);
		} else {
			return new Class2_Sub9(this);
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(ZI)Lclient!vc;")
	public abstract Interface23 method6927(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nv", name = "L", descriptor = "(I)I")
	public final int method6928() {
		return this.anInt8571;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method6815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		if (local9 == 0.0F && local15 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local15 * local15 + local9 * local9)));
			local9 *= local36;
			local15 *= local36;
		}
		if (!this.method6902((float) arg1, (float) arg0, local9 + (float) arg2, 0.0F, 0.0F, (float) arg3 + local15)) {
			return;
		}
		this.method6900();
		this.method6917(arg4);
		this.method6975(Static276.aClass148_4, 0);
		this.method6903(0, Static276.aClass148_4);
		this.method6913(arg5);
		this.method6957();
		this.method6940(false);
		this.method6916();
		this.method6940(true);
		this.method6903(0, Static47.aClass148_1);
		this.method6975(Static47.aClass148_1, 0);
	}

	@OriginalMember(owner = "client!nv", name = "A", descriptor = "()Lclient!q;")
	@Override
	public final Class34 method6848() {
		return this.aClass34_Sub1_21;
	}

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "(Z)V")
	protected abstract void method6929();

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "()Z")
	@Override
	public final boolean method6794() {
		return false;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method6812(@OriginalArg(0) Class34 arg0) {
		this.aClass34_Sub1_16 = (Class34_Sub1) arg0;
		this.aClass34_Sub1_18.M(this.aClass34_Sub1_16);
		this.aClass34_Sub1_18.method897();
		this.aClass34_Sub1_19.method906(this.aClass34_Sub1_18);
		this.aClass34_Sub1_17.method906(this.aClass34_Sub1_16);
		if (this.aClass322_5.method7149()) {
			this.method6981();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([FI)[F")
	public final float[] method6930(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloatArray69[1];
		arg0[12] = this.aFloatArray69[3];
		arg0[0] = this.aFloatArray69[0];
		arg0[8] = this.aFloatArray69[2];
		arg0[9] = this.aFloatArray69[6];
		arg0[2] = this.aFloatArray69[8];
		arg0[5] = this.aFloatArray69[5];
		arg0[1] = this.aFloatArray69[4];
		arg0[13] = this.aFloatArray69[7];
		arg0[3] = this.aFloatArray69[12];
		arg0[14] = this.aFloatArray69[11];
		arg0[6] = this.aFloatArray69[9];
		arg0[10] = this.aFloatArray69[10];
		arg0[7] = this.aFloatArray69[13];
		arg0[11] = this.aFloatArray69[14];
		arg0[15] = this.aFloatArray69[15];
		return arg0;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!rga;B)V")
	public final void method6931(@OriginalArg(0) Interface20 arg0) {
		if (this.anInterface20Array3[this.anInt8573] == arg0) {
			return;
		}
		this.anInterface20Array3[this.anInt8573] = arg0;
		if (arg0 == null) {
			this.method6919();
		} else {
			arg0.method7299();
		}
		this.anInt8558 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!nv", name = "M", descriptor = "(I)V")
	protected final void method6932() {
		@Pc(15) Enumeration local15 = this.aHashtable7.keys();
		while (local15.hasMoreElements()) {
			@Pc(21) Canvas local21 = (Canvas) local15.nextElement();
			this.method6862(this.aHashtable7.get(local21), local21);
		}
		this.anInterface23_14.method5601();
		this.anInterface23_15.method5601();
		this.aClass52_Sub2_28.method5704();
		this.aClass52_Sub2_27.method5704();
		this.aClass52_Sub2_29.method5704();
		this.aClass52_Sub2_30.method5704();
		this.aClass52_Sub2_23.method5704();
		this.aClass305_3.method6486();
		this.anInterface13_8.method5601();
	}

	@OriginalMember(owner = "client!nv", name = "J", descriptor = "(IIIIII)V")
	@Override
	public final void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6900();
		this.method6917(arg4);
		this.method6975(Static276.aClass148_4, 0);
		this.method6903(0, Static276.aClass148_4);
		this.method6913(arg5);
		this.aClass34_Sub1_15.method894((float) arg2, (float) arg3, 1.0F);
		this.aClass34_Sub1_15.U(arg0, arg1, 0);
		this.method6895();
		this.method6940(false);
		this.method6870();
		this.method6940(true);
		this.method6903(0, Static47.aClass148_1);
		this.method6975(Static47.aClass148_1, 0);
	}

	@OriginalMember(owner = "client!nv", name = "N", descriptor = "(I)V")
	protected abstract void method6933();

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!hw;IIZ)V")
	protected abstract void method6934(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z[[III)Lclient!hea;")
	public abstract Interface11 method6935(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nv", name = "O", descriptor = "(I)V")
	private void method6936() {
		this.aBoolean642 = false;
		this.method6855();
		if (this.aClass322_5 == Static555.aClass322_7) {
			this.method6857();
		}
	}

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "(B)V")
	public final void method6937() {
		this.method6911();
		this.method6857();
	}

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "()Z")
	@Override
	public final boolean method6804() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([Lclient!th;B)Lclient!si;")
	public abstract Class185 method6938(@OriginalArg(0) Class318[] arg0);

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "()Z")
	@Override
	public final boolean method6801() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "P", descriptor = "(I)V")
	public final void method6939() {
		if (this.anInt8558 == 8) {
			return;
		}
		this.method6951();
		this.method6978(true);
		this.method6944(true);
		this.method6953(true);
		this.method6913(1);
		this.anInt8558 = 8;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(ZB)V")
	public abstract void method6940(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!wn;)V")
	@Override
	public final void method6781(@OriginalArg(0) Class209 arg0) {
		this.aClass209_Sub1_3 = (Class209_Sub1) arg0;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)V")
	@Override
	public final void method6793(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!si;)V")
	public abstract void method6941(@OriginalArg(1) Class185 arg0);

	@OriginalMember(owner = "client!nv", name = "Q", descriptor = "(I)V")
	protected abstract void method6942();

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(II)V")
	public final void method6943(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6864(Static569.aClass118_4, Static569.aClass118_4);
		} else if (arg0 == 0) {
			this.method6864(Static31.aClass118_1, Static31.aClass118_1);
		} else if (arg0 == 2) {
			this.method6864(Static585.aClass118_5, Static569.aClass118_4);
		} else if (arg0 == 3) {
			this.method6864(Static327.aClass118_2, Static31.aClass118_1);
		} else if (arg0 == 4) {
			this.method6864(Static528.aClass118_3, Static528.aClass118_3);
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(ZB)V")
	public final void method6944(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean630 != arg0) {
			this.aBoolean630 = arg0;
			this.method6880();
			this.anInt8558 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "(B)V")
	protected abstract void method6945();

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)I")
	@Override
	public final int method6819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!nv", name = "R", descriptor = "(I)[F")
	public final float[] method6946() {
		return this.aFloatArray68;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!eg;IIIILclient!jea;B)V")
	public abstract void method6947(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface13 arg5);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZZII)V")
	public final void method6948(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 != this.anInt8569 || this.aBoolean627 != this.aBoolean641) {
			@Pc(16) Interface5 local16 = null;
			@Pc(18) int local18 = 0;
			@Pc(20) byte local20 = 0;
			@Pc(22) int local22 = 0;
			@Pc(29) int local29 = this.aBoolean641 ? 3 : 0;
			if (arg2 < 0) {
				this.method6920();
			} else {
				local16 = this.aClass324_3.method7159(arg2);
				@Pc(52) Class17 local52 = super.anInterface9_13.method947(arg2);
				if (local52.aByte18 == 0 && local52.aByte19 == 0) {
					this.method6920();
				} else {
					@Pc(73) int local73 = local52.aBoolean33 ? 64 : 128;
					@Pc(77) int local77 = local73 * 50;
					@Pc(81) Class34_Sub1 local81 = this.method6922();
					local81.method901((float) (local52.aByte19 * (this.anInt8564 % local77)) / (float) local77, 0.0F, (float) (this.anInt8564 % local77 * local52.aByte18) / (float) local77);
					this.method6909(Static175.aClass316_4);
				}
				local18 = local52.anInt577;
				if (!this.aBoolean641) {
					local29 = local52.aByte22;
					local22 = local52.anInt576;
					local20 = local52.aByte20;
				}
			}
			this.method6983(arg0, local20, local29, local22, arg1);
			if (this.aClass2_3 == null) {
				this.method6931(local16);
				this.method6943(local18);
			} else {
				this.aClass2_3.method7892(local18, local16);
			}
			this.aBoolean627 = this.aBoolean641;
			this.anInt8569 = arg2;
		}
		this.anInt8558 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6824(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "()Z")
	@Override
	public final boolean method6840() {
		return false;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "()I")
	@Override
	public final int method6777() {
		return this.anInt8578 - 2;
	}

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "()Z")
	@Override
	public final boolean method6828() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(IZ)V")
	public final void method6949(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean632) {
			this.aBoolean632 = arg0;
			this.method6910();
			this.anInt8558 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nv", name = "S", descriptor = "(I)V")
	private void method6950() {
		this.anInterface23_15 = this.method6927(true);
		this.anInterface23_15.method5569(24, 12);
		this.aClass185_18 = this.method6938(new Class318[] { new Class318(Static246.aClass174_1) });
	}

	@OriginalMember(owner = "client!nv", name = "T", descriptor = "(I)V")
	private void method6951() {
		if (Static197.aClass322_3 == this.aClass322_5) {
			return;
		}
		@Pc(10) Class322 local10 = this.aClass322_5;
		this.aClass322_5 = Static197.aClass322_3;
		if (!local10.method7149()) {
			this.method6981();
		}
		this.method6873();
		this.aFloatArray69 = this.aFloatArray71;
		this.method6857();
		this.anInt8558 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "(B)V")
	private void method6952() {
		this.method6956();
		this.method6958();
		this.method6910();
		this.method6985();
		this.method6955();
		this.method6933();
		this.method6915();
		this.method6880();
		this.method6929();
		this.method6942();
		this.method6882();
		this.method6954();
		this.method6945();
		this.method6866();
		for (@Pc(62) int local62 = this.anInt8584 - 1; local62 >= 0; local62--) {
			this.method6867(local62);
			this.method6868();
			this.method6859();
			this.method6920();
		}
		this.method6860();
		this.method6962();
		this.method6906();
		this.method6896();
		this.method6968();
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(ZB)V")
	public final void method6953(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean629) {
			this.aBoolean629 = arg0;
			this.method6929();
			this.anInt8558 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nv", name = "ZA", descriptor = "(Z)V")
	@Override
	public final void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean631 = arg0;
		this.method6929();
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "()Z")
	@Override
	public final boolean method6792() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "(B)V")
	protected abstract void method6954();

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6847(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas12 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.method6862(this.aHashtable7.get(arg0), arg0);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!nv", name = "U", descriptor = "(I)V")
	public abstract void method6955();

	@OriginalMember(owner = "client!nv", name = "V", descriptor = "(I)V")
	protected abstract void method6956();

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "(Z)V")
	public final void method6957() {
		this.aClass34_Sub1_15.Y();
		this.aBoolean623 = true;
		this.method6970();
	}

	@OriginalMember(owner = "client!nv", name = "W", descriptor = "(I)V")
	protected abstract void method6958();

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "()Z")
	@Override
	public final boolean method6787() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZIZLclient!hw;I)V")
	public abstract void method6959(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class148 arg3);

	@OriginalMember(owner = "client!nv", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public final void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt8597 != arg0;
		if (local15 || this.aFloat219 != arg1 || this.aFloat225 != arg2) {
			this.aFloat219 = arg1;
			this.anInt8597 = arg0;
			this.aFloat225 = arg2;
			if (local15) {
				this.aFloat215 = (float) (this.anInt8597 & 0xFF0000) / 1.671168E7F;
				this.aFloat214 = (float) (this.anInt8597 & 0xFF) / 255.0F;
				this.aFloat220 = (float) (this.anInt8597 & 0xFF00) / 65280.0F;
				this.method6956();
			}
			this.aNativeInterface3.setSunColour(this.aFloat215, this.aFloat220, this.aFloat214, arg1, arg2);
			this.method6958();
		}
		if (arg3 != this.aFloatArray73[0] || arg4 != this.aFloatArray73[1] || this.aFloatArray73[2] != arg5) {
			this.aFloatArray73[0] = arg3;
			this.aFloatArray73[1] = arg4;
			this.aFloatArray73[2] = arg5;
			this.aFloatArray75[1] = -arg4;
			this.aFloatArray75[0] = -arg3;
			this.aFloatArray75[2] = -arg5;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray72[0] = arg3 * local153;
			this.aFloatArray72[1] = local153 * arg4;
			this.aFloatArray72[2] = arg5 * local153;
			this.aFloatArray74[1] = -this.aFloatArray72[1];
			this.aFloatArray74[0] = -this.aFloatArray72[0];
			this.aFloatArray74[2] = -this.aFloatArray72[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray72[0], this.aFloatArray72[1], this.aFloatArray72[2]);
			this.method6955();
			this.anInt8574 = (int) (arg3 * 256.0F / arg4);
			this.anInt8579 = (int) (arg5 * 256.0F / arg4);
		}
		this.method6933();
	}

	@OriginalMember(owner = "client!nv", name = "X", descriptor = "(I)F")
	protected abstract float method6960();

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(IIIIII)Lclient!wn;")
	@Override
	public final Class209 method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class209_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nv", name = "Y", descriptor = "(I)V")
	private void method6961() {
		this.anInterface23_14 = this.method6927(false);
		this.anInterface23_14.method5569(140, 28);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(36) Buffer local36 = this.anInterface23_14.method5570();
			if (local36 != null) {
				@Pc(43) Stream local43 = this.method6925(local36);
				if (Stream.b()) {
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
				} else {
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
				}
				local43.a();
				if (this.anInterface23_14.method5572()) {
					break;
				}
			}
		}
		this.aClass185_16 = this.method6938(new Class318[] { new Class318(new Class174[] { Static246.aClass174_1, Static246.aClass174_5, Static246.aClass174_5 }) });
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIF)Lclient!tw;")
	@Override
	public final Class1_Sub24 method6790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub24_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public final Class181 method6797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static359.method5306(arg2, this, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!nv", name = "CA", descriptor = "(IIII)V")
	@Override
	public final void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean641 = true;
		this.anInt8571 = arg1;
		this.anInt8593 = arg0;
		this.anInt8575 = arg2;
		this.anInt8580 = arg3;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6853(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas12 == arg0) {
			local5 = this.anObject23;
		} else if (this.aHashtable7.containsKey(arg0)) {
			local5 = this.aHashtable7.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method6897(local5, arg0);
		if (arg0 == this.aCanvas11) {
			this.method6871();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public final void method6807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class181 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "(B)V")
	protected abstract void method6962();

	@OriginalMember(owner = "client!nv", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt8583;
	}

	@OriginalMember(owner = "client!nv", name = "Z", descriptor = "(I)V")
	protected abstract void method6963();

	@OriginalMember(owner = "client!nv", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt8598;
	}

	@OriginalMember(owner = "client!nv", name = "ab", descriptor = "(I)V")
	private void method6964() {
		if (this.aClass2_3 != null) {
			this.aClass2_3.method7891();
		}
		this.method6882();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!vc;BI)V")
	public abstract void method6965(@OriginalArg(0) Interface23 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public final Class5 method6832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class5_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!eg;II)V")
	public abstract void method6966(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6795(@OriginalArg(0) Canvas arg0) {
		this.anObject23 = null;
		this.aCanvas11 = null;
		if (arg0 == null || arg0 == this.aCanvas12) {
			this.aCanvas11 = this.aCanvas12;
			this.anObject23 = this.anObject24;
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.anObject23 = this.aHashtable7.get(arg0);
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.anObject23 == null) {
			throw new RuntimeException();
		}
		this.method6921(this.aCanvas11, this.anObject23);
		this.method6871();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6780(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas12) {
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
			@Pc(53) Object local53 = this.method6889(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!nv", name = "bb", descriptor = "(I)V")
	private void method6967() {
		this.aFloat224 = this.anInt8572 - this.anInt8588;
		this.aFloat211 = this.anInt8576 - this.anInt8589;
		this.aFloat212 = this.anInt8570 - this.anInt8588;
		this.aFloat210 = this.anInt8596 - this.anInt8589;
	}

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "(B)V")
	protected abstract void method6968();

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "(I)V")
	@Override
	public final void method6839(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass324_3 != null) {
			this.aClass324_3.method7161();
		}
		this.anInt8595 = arg0;
	}

	@OriginalMember(owner = "client!nv", name = "cb", descriptor = "(I)V")
	public final void method6969() {
		if (this.anInt8558 == 16) {
			return;
		}
		this.method6973();
		this.method6978(true);
		this.method6944(true);
		this.method6953(true);
		this.method6913(1);
		this.anInt8558 = 16;
	}

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "(Z)V")
	private void method6970() {
		if (this.aClass322_5 == Static352.aClass322_4) {
			@Pc(11) float local11 = this.method6960();
			this.aClass34_Sub1_15.method907(local11, 0.0F, local11);
		}
		this.aBoolean633 = false;
		this.method6896();
		if (this.aClass2_3 != null) {
			this.aClass2_3.method7898();
		}
	}

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "()Lclient!q;")
	@Override
	public final Class34 method6833() {
		return new Class34_Sub1();
	}

	@OriginalMember(owner = "client!nv", name = "db", descriptor = "(I)Lclient!caa;")
	public final Class34_Sub1 method6971() {
		return this.aClass34_Sub1_19;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!nba;IIII)Lclient!da;")
	@Override
	public final Class52 method6817(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class52_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!nv", name = "oa", descriptor = "([I)V")
	@Override
	public final void oa(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt8570;
		arg0[0] = this.anInt8596;
		arg0[1] = this.anInt8572;
		arg0[2] = this.anInt8576;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[BILclient!pn;I)Lclient!tea;")
	public abstract Interface21 method6972(@OriginalArg(2) byte[] arg0, @OriginalArg(4) Class271 arg1);

	@OriginalMember(owner = "client!nv", name = "eb", descriptor = "(I)V")
	private void method6973() {
		if (Static555.aClass322_7 == this.aClass322_5) {
			return;
		}
		@Pc(17) Class322 local17 = this.aClass322_5;
		this.aClass322_5 = Static555.aClass322_7;
		if (!local17.method7149()) {
			this.method6981();
		}
		this.method6855();
		this.aFloatArray69 = this.aFloatArray67;
		this.method6857();
		this.anInt8558 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(II)Lclient!jea;")
	public final Interface13 method6974(@OriginalArg(0) int arg0) {
		if (arg0 * 2 > this.anInterface13_8.method5598()) {
			this.anInterface13_8.method5600(arg0);
		}
		return this.anInterface13_8;
	}

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "()[I")
	@Override
	public final int[] v() {
		return new int[] { this.anInt8589, this.anInt8588, this.anInt8590, this.anInt8567 };
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!hw;I)V")
	public final void method6975(@OriginalArg(1) Class148 arg0, @OriginalArg(2) int arg1) {
		this.method6959(false, arg1, false, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(FI)V")
	public final void method6976(@OriginalArg(0) float arg0) {
		if (this.aFloat221 != arg0) {
			this.aFloat221 = arg0;
			this.method6936();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!eg;II)V")
	private void method6977(@OriginalArg(0) Class77 arg0, @OriginalArg(2) int arg1) {
		this.method6965(this.anInterface23_14, 0);
		this.method6941(this.aClass185_16);
		this.method6966(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!nv", name = "JA", descriptor = "()V")
	@Override
	public final void JA() {
		this.anInt8572 = 0;
		this.anInt8596 = 0;
		this.anInt8570 = this.anInt8451;
		this.anInt8576 = this.anInt8491;
		if (this.aBoolean644) {
			this.aBoolean644 = false;
			this.method6898();
		}
		this.method6967();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([I)V")
	@Override
	public final void method6822(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8491;
		arg0[1] = this.anInt8451;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method6778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method6960();
		this.method6900();
		this.method6917(arg4);
		this.method6975(Static276.aClass148_4, 0);
		this.method6903(0, Static276.aClass148_4);
		this.method6913(arg5);
		this.aClass34_Sub1_15.method894((float) (arg2 - 1), (float) (arg3 - 1), 1.0F);
		this.aClass34_Sub1_15.method907((float) arg1 - local7, 0.0F, (float) arg0 - local7);
		this.method6895();
		this.method6940(false);
		this.method6977(Static308.aClass77_2, 4);
		this.method6940(true);
		this.method6903(0, Static47.aClass148_1);
		this.method6975(Static47.aClass148_1, 0);
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(ZI)V")
	public final void method6978(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean624) {
			this.aBoolean624 = arg0;
			this.method6942();
			this.anInt8558 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "(Z)V")
	private void method6979() {
		this.aFloatArray71[10] = this.bf;
		this.aFloatArray71[14] = this.aFloat218;
		this.aFloat216 = ((float) -this.anInt8583 + this.aFloatArray71[14]) / this.aFloatArray71[10];
	}

	@OriginalMember(owner = "client!nv", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public final void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class181_Sub1 local6 = (Class181_Sub1) arg1;
		@Pc(9) Interface5 local9 = local6.anInterface5_2;
		this.method6984();
		this.method6931(local9);
		this.method6913(1);
		this.method6864(Static569.aClass118_4, Static569.aClass118_4);
		this.method6975(Static276.aClass148_4, 0);
		this.method6917(arg0);
		this.aClass34_Sub1_15.method894((float) this.anInt8491, (float) this.anInt8451, 0.0F);
		this.method6895();
		this.aClass34_Sub1Array3[0].method894(local9.method7315((float) this.anInt8491), local9.method7316((float) this.anInt8451), 1.0F);
		this.aClass34_Sub1Array3[0].method907(local9.method7316((float) -arg3), 0.0F, local9.method7315((float) -arg2));
		this.aClass316Array3[0] = Static175.aClass316_4;
		this.method6877();
		this.method6870();
		this.method6920();
		this.method6975(Static47.aClass148_1, 0);
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(ZI)Lclient!jea;")
	public abstract Interface13 method6980(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)V")
	@Override
	public final void method6785(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "fb", descriptor = "(I)V")
	private void method6981() {
		this.aBoolean633 = false;
		if (this.aClass2_3 != null) {
			this.aClass2_3.method7900();
		}
		this.method6968();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZZ)V")
	public final void method6982(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean637) {
			this.aBoolean637 = arg0;
			this.method6942();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZIIIIZ)V")
	private void method6983(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) boolean local4 = arg4 & this.method6851();
		if (!local4 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			arg2 = 2;
			arg3 = 1;
			arg1 = 0;
		}
		if (arg2 != 0 && arg0) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt8560 != arg2) {
			if (this.anInt8560 != 0) {
				this.aClass2Array3[this.anInt8560 & Integer.MAX_VALUE].method7899();
			}
			if (arg2 == 0) {
				this.aClass2_3 = null;
			} else {
				this.aClass2_3 = this.aClass2Array3[arg2 & Integer.MAX_VALUE];
				this.aClass2_3.method7901(arg0);
				this.aClass2_3.method7894(arg0);
				this.aClass2_3.method7897(arg3, arg1);
			}
			this.anInt8561 = arg3;
			this.anInt8592 = arg1;
			this.anInt8560 = arg2;
		} else if (this.anInt8560 != 0) {
			this.aClass2Array3[this.anInt8560 & Integer.MAX_VALUE].method7894(arg0);
			if (this.anInt8592 != arg1 || this.anInt8561 != arg3) {
				this.aClass2Array3[Integer.MAX_VALUE & this.anInt8560].method7897(arg3, arg1);
				this.anInt8592 = arg1;
				this.anInt8561 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nv", name = "gb", descriptor = "(I)V")
	public final void method6984() {
		if (this.anInt8558 == 2) {
			return;
		}
		this.method6907();
		this.method6978(false);
		this.method6949(false);
		this.method6944(false);
		this.method6953(false);
		this.method6948(false, false, -2);
		this.anInt8558 = 2;
	}

	@OriginalMember(owner = "client!nv", name = "hb", descriptor = "(I)V")
	protected void method6985() {
		this.anInt8559 = this.anInt8582;
		this.anInt8582 = 0;
	}

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "(IIIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6815(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z[IIIIII)Lclient!cm;")
	public abstract Interface5 method6986(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!nv", name = "ib", descriptor = "(I)Lclient!caa;")
	public final Class34_Sub1 method6987() {
		if (!this.aBoolean633) {
			this.aClass34_Sub1_20.method896(this.aClass34_Sub1_18, this.aClass34_Sub1_15);
			this.aBoolean633 = true;
		}
		return this.aClass34_Sub1_20;
	}

	@OriginalMember(owner = "client!nv", name = "w", descriptor = "()Lclient!q;")
	@Override
	public final Class34 method6843() {
		return this.aClass34_Sub1_16;
	}
}
