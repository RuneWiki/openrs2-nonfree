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

@OriginalClass("client!cf")
public abstract class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!cf", name = "lb", descriptor = "Lclient!j;")
	protected Class157 lb;

	@OriginalMember(owner = "client!cf", name = "bc", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable4;

	@OriginalMember(owner = "client!cf", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!cf", name = "ad", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!cf", name = "Od", descriptor = "I")
	public int anInt4791;

	@OriginalMember(owner = "client!cf", name = "Ud", descriptor = "I")
	public int anInt4795;

	@OriginalMember(owner = "client!cf", name = "Wd", descriptor = "I")
	protected int anInt4797;

	@OriginalMember(owner = "client!cf", name = "me", descriptor = "I")
	private int anInt4803;

	@OriginalMember(owner = "client!cf", name = "pe", descriptor = "[Lclient!hw;")
	private Interface11[] anInterface11Array3;

	@OriginalMember(owner = "client!cf", name = "re", descriptor = "[Lclient!cb;")
	protected Class37[] aClass37Array3;

	@OriginalMember(owner = "client!cf", name = "we", descriptor = "Z")
	public boolean aBoolean356;

	@OriginalMember(owner = "client!cf", name = "xe", descriptor = "I")
	public int anInt4808;

	@OriginalMember(owner = "client!cf", name = "Ae", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!cf", name = "Be", descriptor = "I")
	public int anInt4810;

	@OriginalMember(owner = "client!cf", name = "Ce", descriptor = "I")
	public int anInt4811;

	@OriginalMember(owner = "client!cf", name = "Fe", descriptor = "Z")
	protected boolean aBoolean358;

	@OriginalMember(owner = "client!cf", name = "Ke", descriptor = "[Lclient!jv;")
	protected Class174[] aClass174Array3;

	@OriginalMember(owner = "client!cf", name = "Le", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!cf", name = "Me", descriptor = "Lclient!ne;")
	private Class12 aClass12_3;

	@OriginalMember(owner = "client!cf", name = "Ne", descriptor = "Lclient!cw;")
	private Class55_Sub1 aClass55_Sub1_3;

	@OriginalMember(owner = "client!cf", name = "Pe", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!cf", name = "Qe", descriptor = "[Lclient!ff;")
	protected Class3_Sub22[] aClass3_Sub22Array3;

	@OriginalMember(owner = "client!cf", name = "Ve", descriptor = "F")
	private float aFloat96;

	@OriginalMember(owner = "client!cf", name = "Ye", descriptor = "Z")
	protected boolean aBoolean362;

	@OriginalMember(owner = "client!cf", name = "bf", descriptor = "[Lclient!cb;")
	protected Class37[] bf;

	@OriginalMember(owner = "client!cf", name = "gf", descriptor = "I")
	protected int anInt4822;

	@OriginalMember(owner = "client!cf", name = "mf", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!cf", name = "uf", descriptor = "Z")
	public boolean aBoolean366;

	@OriginalMember(owner = "client!cf", name = "wf", descriptor = "I")
	private int anInt4824;

	@OriginalMember(owner = "client!cf", name = "xf", descriptor = "Lclient!hw;")
	public Interface11 anInterface11_3;

	@OriginalMember(owner = "client!cf", name = "Cf", descriptor = "I")
	protected int anInt4828;

	@OriginalMember(owner = "client!cf", name = "Df", descriptor = "F")
	private float aFloat103;

	@OriginalMember(owner = "client!cf", name = "If", descriptor = "I")
	protected int anInt4831;

	@OriginalMember(owner = "client!cf", name = "Mf", descriptor = "I")
	public int anInt4834;

	@OriginalMember(owner = "client!cf", name = "Of", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!cf", name = "Pf", descriptor = "Z")
	public boolean aBoolean370;

	@OriginalMember(owner = "client!cf", name = "Qf", descriptor = "[Lclient!un;")
	protected Class109_Sub3[] aClass109_Sub3Array3;

	@OriginalMember(owner = "client!cf", name = "Tf", descriptor = "Lclient!hp;")
	private Class134 aClass134_3;

	@OriginalMember(owner = "client!cf", name = "Uf", descriptor = "I")
	protected int anInt4836;

	@OriginalMember(owner = "client!cf", name = "bg", descriptor = "F")
	public float aFloat106;

	@OriginalMember(owner = "client!cf", name = "dg", descriptor = "Lclient!vl;")
	public Class57_Sub3 aClass57_Sub3_21;

	@OriginalMember(owner = "client!cf", name = "eg", descriptor = "Lclient!kr;")
	private Class48 aClass48_14;

	@OriginalMember(owner = "client!cf", name = "fg", descriptor = "Lclient!vl;")
	public Class57_Sub3 aClass57_Sub3_22;

	@OriginalMember(owner = "client!cf", name = "gg", descriptor = "Lclient!vl;")
	public Class57_Sub3 aClass57_Sub3_23;

	@OriginalMember(owner = "client!cf", name = "hg", descriptor = "Lclient!vl;")
	public Class57_Sub3 aClass57_Sub3_24;

	@OriginalMember(owner = "client!cf", name = "ig", descriptor = "Lclient!kr;")
	public Class48 aClass48_15;

	@OriginalMember(owner = "client!cf", name = "jg", descriptor = "Lclient!kr;")
	public Class48 aClass48_16;

	@OriginalMember(owner = "client!cf", name = "kg", descriptor = "Lclient!kr;")
	public Class48 aClass48_17;

	@OriginalMember(owner = "client!cf", name = "lg", descriptor = "Lclient!vl;")
	public Class57_Sub3 aClass57_Sub3_25;

	@OriginalMember(owner = "client!cf", name = "mg", descriptor = "Lclient!wl;")
	private Interface24 anInterface24_10;

	@OriginalMember(owner = "client!cf", name = "ng", descriptor = "Lclient!vl;")
	public Class57_Sub3 aClass57_Sub3_26;

	@OriginalMember(owner = "client!cf", name = "og", descriptor = "Lclient!wl;")
	private Interface24 anInterface24_11;

	@OriginalMember(owner = "client!cf", name = "qg", descriptor = "Lclient!vl;")
	public Class57_Sub3 aClass57_Sub3_27;

	@OriginalMember(owner = "client!cf", name = "rg", descriptor = "Lclient!kr;")
	public Class48 aClass48_18;

	@OriginalMember(owner = "client!cf", name = "sg", descriptor = "Lclient!vl;")
	public Class57_Sub3 aClass57_Sub3_28;

	@OriginalMember(owner = "client!cf", name = "tg", descriptor = "Lclient!vl;")
	public Class57_Sub3 aClass57_Sub3_29;

	@OriginalMember(owner = "client!cf", name = "ug", descriptor = "Lclient!or;")
	private Interface17 anInterface17_7;

	@OriginalMember(owner = "client!cf", name = "vg", descriptor = "Lclient!kr;")
	private Class48 aClass48_19;

	@OriginalMember(owner = "client!cf", name = "wg", descriptor = "Lclient!vl;")
	public Class57_Sub3 aClass57_Sub3_30;

	@OriginalMember(owner = "client!cf", name = "xg", descriptor = "I")
	private int anInt4841;

	@OriginalMember(owner = "client!cf", name = "yg", descriptor = "Z")
	protected boolean aBoolean374;

	@OriginalMember(owner = "client!cf", name = "Md", descriptor = "Lclient!hga;")
	private final Class130 aClass130_26 = new Class130();

	@OriginalMember(owner = "client!cf", name = "Sd", descriptor = "Z")
	protected boolean aBoolean353 = true;

	@OriginalMember(owner = "client!cf", name = "Rd", descriptor = "Lclient!un;")
	protected final Class109_Sub3 aClass109_Sub3_15 = new Class109_Sub3();

	@OriginalMember(owner = "client!cf", name = "ae", descriptor = "Lclient!un;")
	public Class109_Sub3 aClass109_Sub3_16 = new Class109_Sub3();

	@OriginalMember(owner = "client!cf", name = "be", descriptor = "Lclient!un;")
	public final Class109_Sub3 aClass109_Sub3_17 = new Class109_Sub3();

	@OriginalMember(owner = "client!cf", name = "ce", descriptor = "Lclient!un;")
	protected final Class109_Sub3 aClass109_Sub3_18 = new Class109_Sub3();

	@OriginalMember(owner = "client!cf", name = "de", descriptor = "Lclient!un;")
	private final Class109_Sub3 aClass109_Sub3_19 = new Class109_Sub3();

	@OriginalMember(owner = "client!cf", name = "ee", descriptor = "Lclient!un;")
	private final Class109_Sub3 aClass109_Sub3_20 = new Class109_Sub3();

	@OriginalMember(owner = "client!cf", name = "ie", descriptor = "Lclient!rg;")
	protected Class285 aClass285_5 = Static246.aClass285_4;

	@OriginalMember(owner = "client!cf", name = "He", descriptor = "F")
	public float aFloat93 = 1.0F;

	@OriginalMember(owner = "client!cf", name = "se", descriptor = "F")
	private float aFloat90 = 1.0F;

	@OriginalMember(owner = "client!cf", name = "ue", descriptor = "I")
	protected int anInt4807 = 3584;

	@OriginalMember(owner = "client!cf", name = "je", descriptor = "I")
	private int anInt4801 = 0;

	@OriginalMember(owner = "client!cf", name = "Se", descriptor = "I")
	public int anInt4816 = 3;

	@OriginalMember(owner = "client!cf", name = "Ee", descriptor = "Z")
	private boolean aBoolean357 = false;

	@OriginalMember(owner = "client!cf", name = "cf", descriptor = "I")
	public int anInt4820 = -1;

	@OriginalMember(owner = "client!cf", name = "We", descriptor = "I")
	private int anInt4817 = 0;

	@OriginalMember(owner = "client!cf", name = "qe", descriptor = "I")
	public int anInt4806 = 8;

	@OriginalMember(owner = "client!cf", name = "Ue", descriptor = "Z")
	protected boolean aBoolean360 = true;

	@OriginalMember(owner = "client!cf", name = "ne", descriptor = "I")
	protected final int anInt4804 = 0;

	@OriginalMember(owner = "client!cf", name = "ke", descriptor = "[Lclient!ne;")
	private final Class12[] aClass12Array3 = new Class12[10];

	@OriginalMember(owner = "client!cf", name = "Ge", descriptor = "I")
	protected int anInt4812 = 0;

	@OriginalMember(owner = "client!cf", name = "ve", descriptor = "[F")
	private final float[] aFloatArray29 = new float[16];

	@OriginalMember(owner = "client!cf", name = "df", descriptor = "Z")
	protected boolean aBoolean363 = false;

	@OriginalMember(owner = "client!cf", name = "Xe", descriptor = "Z")
	private boolean aBoolean361 = false;

	@OriginalMember(owner = "client!cf", name = "ff", descriptor = "F")
	public float aFloat97 = 1.0F;

	@OriginalMember(owner = "client!cf", name = "pf", descriptor = "[F")
	private final float[] aFloatArray31 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!cf", name = "ge", descriptor = "Lclient!oda;")
	protected Class240 aClass240_4 = Static545.aClass240_7;

	@OriginalMember(owner = "client!cf", name = "ze", descriptor = "I")
	private int anInt4809 = -1;

	@OriginalMember(owner = "client!cf", name = "tf", descriptor = "Z")
	protected boolean aBoolean365 = true;

	@OriginalMember(owner = "client!cf", name = "ef", descriptor = "I")
	private int anInt4821 = 0;

	@OriginalMember(owner = "client!cf", name = "lf", descriptor = "F")
	public float aFloat100 = 1.0F;

	@OriginalMember(owner = "client!cf", name = "fe", descriptor = "[F")
	public final float[] aFloatArray28 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!cf", name = "oe", descriptor = "I")
	public int anInt4805 = 128;

	@OriginalMember(owner = "client!cf", name = "hf", descriptor = "F")
	public float aFloat98 = 1.0F;

	@OriginalMember(owner = "client!cf", name = "he", descriptor = "Z")
	private boolean aBoolean354 = false;

	@OriginalMember(owner = "client!cf", name = "vf", descriptor = "Z")
	protected boolean aBoolean367 = false;

	@OriginalMember(owner = "client!cf", name = "Ie", descriptor = "I")
	protected int anInt4813 = 0;

	@OriginalMember(owner = "client!cf", name = "af", descriptor = "I")
	protected int anInt4819 = 0;

	@OriginalMember(owner = "client!cf", name = "Te", descriptor = "Z")
	private boolean aBoolean359 = false;

	@OriginalMember(owner = "client!cf", name = "sf", descriptor = "Z")
	protected boolean aBoolean364 = true;

	@OriginalMember(owner = "client!cf", name = "Ef", descriptor = "I")
	protected int anInt4829 = 0;

	@OriginalMember(owner = "client!cf", name = "le", descriptor = "I")
	public int anInt4802 = 0;

	@OriginalMember(owner = "client!cf", name = "Lf", descriptor = "I")
	protected final int anInt4833 = 0;

	@OriginalMember(owner = "client!cf", name = "Ff", descriptor = "Z")
	protected boolean aBoolean368 = false;

	@OriginalMember(owner = "client!cf", name = "zf", descriptor = "I")
	private int anInt4826 = 16777215;

	@OriginalMember(owner = "client!cf", name = "ye", descriptor = "F")
	public float aFloat91 = 3584.0F;

	@OriginalMember(owner = "client!cf", name = "Re", descriptor = "[F")
	public final float[] aFloatArray30 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!cf", name = "Jf", descriptor = "Z")
	protected boolean aBoolean369 = false;

	@OriginalMember(owner = "client!cf", name = "Je", descriptor = "I")
	public int anInt4814 = 50;

	@OriginalMember(owner = "client!cf", name = "nf", descriptor = "F")
	public float aFloat102 = -1.0F;

	@OriginalMember(owner = "client!cf", name = "Kf", descriptor = "I")
	public int anInt4832 = -1;

	@OriginalMember(owner = "client!cf", name = "Ze", descriptor = "I")
	public int anInt4818 = 0;

	@OriginalMember(owner = "client!cf", name = "jf", descriptor = "F")
	public float aFloat99 = 3584.0F;

	@OriginalMember(owner = "client!cf", name = "te", descriptor = "Z")
	protected boolean aBoolean355 = true;

	@OriginalMember(owner = "client!cf", name = "Wf", descriptor = "I")
	private int anInt4837 = -1;

	@OriginalMember(owner = "client!cf", name = "yf", descriptor = "I")
	protected int anInt4825 = 0;

	@OriginalMember(owner = "client!cf", name = "Bf", descriptor = "[F")
	private final float[] aFloatArray34 = new float[16];

	@OriginalMember(owner = "client!cf", name = "Hf", descriptor = "[F")
	private final float[] aFloatArray35 = new float[16];

	@OriginalMember(owner = "client!cf", name = "rf", descriptor = "[F")
	protected float[] aFloatArray33 = this.aFloatArray31;

	@OriginalMember(owner = "client!cf", name = "Vf", descriptor = "F")
	public float aFloat105 = -1.0F;

	@OriginalMember(owner = "client!cf", name = "Af", descriptor = "I")
	private int anInt4827 = 0;

	@OriginalMember(owner = "client!cf", name = "ag", descriptor = "Z")
	private boolean aBoolean373 = false;

	@OriginalMember(owner = "client!cf", name = "Sf", descriptor = "[F")
	private final float[] aFloatArray36 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!cf", name = "Yf", descriptor = "Z")
	protected boolean aBoolean372 = true;

	@OriginalMember(owner = "client!cf", name = "Xf", descriptor = "I")
	public int anInt4838 = 512;

	@OriginalMember(owner = "client!cf", name = "qf", descriptor = "[F")
	private final float[] aFloatArray32 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!cf", name = "Rf", descriptor = "Z")
	private boolean aBoolean371 = false;

	@OriginalMember(owner = "client!cf", name = "Zf", descriptor = "I")
	public int anInt4839 = 0;

	@OriginalMember(owner = "client!cf", name = "Oe", descriptor = "I")
	public int anInt4815 = 512;

	@OriginalMember(owner = "client!cf", name = "Gf", descriptor = "I")
	private int anInt4830 = 1;

	@OriginalMember(owner = "client!cf", name = "cg", descriptor = "I")
	private int anInt4840 = -1;

	@OriginalMember(owner = "client!cf", name = "De", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream6 = new Stream();

	@OriginalMember(owner = "client!cf", name = "pg", descriptor = "Lclient!un;")
	private final Class109_Sub3 aClass109_Sub3_21 = new Class109_Sub3();

	@OriginalMember(owner = "client!cf", name = "Nf", descriptor = "I")
	protected final int anInt4835;

	@OriginalMember(owner = "client!cf", name = "S", descriptor = "Lclient!om;")
	protected final Class246 aClass246_123;

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "Ljava/lang/Object;")
	protected final Object anObject25;

	@OriginalMember(owner = "client!cf", name = "E", descriptor = "Ljava/lang/Object;")
	private Object anObject26;

	@OriginalMember(owner = "client!cf", name = "Gb", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas7;

	@OriginalMember(owner = "client!cf", name = "sc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
	private int anInt4629;

	@OriginalMember(owner = "client!cf", name = "Bc", descriptor = "I")
	public int anInt4728;

	@OriginalMember(owner = "client!cf", name = "xd", descriptor = "I")
	private int anInt4775;

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
	public int anInt4635;

	@OriginalMember(owner = "client!cf", name = "kf", descriptor = "I")
	public final int anInt4823;

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!cf", name = "of", descriptor = "Lclient!ep;")
	private final Class82 aClass82_3;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!fa;Lclient!om;II)V")
	protected Class43_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) Class246 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anInt4835 = arg4;
		this.aClass246_123 = arg3;
		this.anObject26 = this.anObject25 = arg1;
		this.aCanvas8 = this.aCanvas7 = arg0;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt4728 = this.anInt4629 = local307.width;
		this.anInt4635 = this.anInt4775 = local307.height;
		this.anInt4823 = arg5;
		Static497.method6706(false, true);
		if (super.anInterface8_12 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt4823);
			this.aClass82_3 = null;
		} else {
			this.aClass82_3 = new Class82(this, super.anInterface8_12);
			this.aNativeInterface3 = new NativeInterface(super.anInterface8_12.method6557(), this.anInt4823);
			for (@Pc(364) int local364 = 0; super.anInterface8_12.method6557() > local364; local364++) {
				@Pc(372) Class224 local372 = super.anInterface8_12.method6560(local364);
				if (local372 != null) {
					this.aNativeInterface3.initTextureMetrics(local364, local372.aByte73, local372.aByte71);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)V")
	protected abstract void method4167();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V")
	public final void method4168(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean364) {
			this.aBoolean364 = arg0;
			this.method4201();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIILclient!fda;Z[BBI)Lclient!hi;")
	protected abstract Interface10 method4169(@OriginalArg(1) int arg0, @OriginalArg(3) Class93 arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)Lclient!e;")
	@Override
	public final Class3_Sub16 method7193(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub16_Sub2 local8 = new Class3_Sub16_Sub2(arg0);
		this.aClass130_26.method3548(local8);
		return local8;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZZ)V")
	public final void method4170(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean363 != arg0) {
			this.aBoolean363 = arg0;
			this.method4234();
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)Lclient!un;")
	public final Class109_Sub3 method4172() {
		return this.aClass109_Sub3_15;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)Lclient!un;")
	public final Class109_Sub3 method4173() {
		if (!this.aBoolean354) {
			this.aClass109_Sub3_20.method7119(this.aClass109_Sub3_18, this.aClass109_Sub3_15);
			this.aBoolean354 = true;
		}
		return this.aClass109_Sub3_20;
	}

	@OriginalMember(owner = "client!cf", name = "V", descriptor = "(IIII)V")
	@Override
	public final void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt4813 < arg0) {
			local5 = true;
			this.anInt4813 = arg0;
		}
		if (this.anInt4812 > arg2) {
			this.anInt4812 = arg2;
			local5 = true;
		}
		if (arg1 > this.anInt4825) {
			this.anInt4825 = arg1;
			local5 = true;
		}
		if (arg3 < this.anInt4819) {
			local5 = true;
			this.anInt4819 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean374) {
			this.aBoolean374 = true;
			this.method4224();
		}
		this.method4167();
		this.method4176();
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)I")
	public final int method4174() {
		return this.anInt4829;
	}

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "(I)V")
	protected abstract void method4175();

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "()Lclient!q;")
	@Override
	public final Class109 method7142() {
		return this.aClass109_Sub3_21;
	}

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "(I)V")
	private void method4176() {
		this.aFloat95 = this.anInt4819 - this.anInt4818;
		this.aFloat101 = this.anInt4813 - this.anInt4839;
		this.aFloat92 = this.anInt4812 - this.anInt4839;
		this.aFloat104 = this.anInt4825 - this.anInt4818;
	}

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7173() {
		return true;
	}

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "(I)V")
	protected abstract void method4177();

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(B)V")
	protected abstract void method4178();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method7137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		if (local10 == 0.0F && local17 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(42) float local42 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
			local17 *= local42;
			local10 *= local42;
		}
		if (!this.method4185(0.0F, local17 + (float) arg3, local10 + (float) arg2, (float) arg1, (float) arg0, 0.0F)) {
			return;
		}
		this.method4250();
		this.method4266(arg4);
		this.method4251(0, Static88.aClass252_2);
		this.method4241(0, Static88.aClass252_2);
		this.method4273(arg5);
		this.method4263();
		this.method4209(false);
		this.method4226();
		this.method4209(true);
		this.method4241(0, Static74.aClass252_1);
		this.method4251(0, Static74.aClass252_1);
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(B)V")
	private void method4179() {
		if (this.aClass240_4 == Static63.aClass240_2) {
			return;
		}
		@Pc(6) Class240 local6 = this.aClass240_4;
		this.aClass240_4 = Static63.aClass240_2;
		if (!local6.method5517()) {
			this.method4262();
		}
		this.method4225();
		this.aFloatArray33 = this.aFloatArray29;
		this.method4282();
		this.anInt4803 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ro;Lclient!fda;B)Z")
	public abstract boolean method4180(@OriginalArg(0) Class292 arg0, @OriginalArg(1) Class93 arg1);

	@OriginalMember(owner = "client!cf", name = "XA", descriptor = "(IIIII)V")
	@Override
	public final void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7137(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!wl;)V")
	public abstract void method4181(@OriginalArg(1) int arg0, @OriginalArg(2) Interface24 arg1);

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(IIIIII)Lclient!js;")
	@Override
	public final Class55 method7208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class55_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "(B)V")
	protected abstract void method4182();

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(II)V")
	public final void method4183(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method4253(Static587.aClass37_5, Static587.aClass37_5);
		} else if (arg0 == 0) {
			this.method4253(Static106.aClass37_2, Static106.aClass37_2);
		} else if (arg0 == 2) {
			this.method4253(Static474.aClass37_3, Static587.aClass37_5);
		} else if (arg0 == 3) {
			this.method4253(Static581.aClass37_4, Static106.aClass37_2);
		} else if (arg0 == 4) {
			this.method4253(Static36.aClass37_1, Static36.aClass37_1);
		}
	}

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "(I)V")
	private void method4184() {
		this.method4186();
		this.method4223();
		this.method4234();
		this.method4300();
		this.method4218();
		this.method4177();
		this.method4182();
		this.method4230();
		this.method4291();
		this.method4201();
		this.method4243();
		this.method4219();
		this.method4189();
		this.method4246();
		for (@Pc(56) int local56 = this.anInt4834 - 1; local56 >= 0; local56--) {
			this.method4238(local56);
			this.method4240();
			this.method4194();
			this.method4235();
		}
		this.method4200();
		this.method4213();
		this.method4199();
		this.method4217();
		this.method4175();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(FFFFIFF)Z")
	private boolean method4185(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface24_10.method4803();
		if (local9 == null) {
			return false;
		}
		@Pc(23) Stream local23 = this.method4233(local9);
		if (Stream.c()) {
			local23.a(arg4);
			local23.a(arg3);
			local23.a(arg5);
			local23.a(arg2);
			local23.a(arg1);
			local23.a(arg0);
		} else {
			local23.b(arg4);
			local23.b(arg3);
			local23.b(arg5);
			local23.b(arg2);
			local23.b(arg1);
			local23.b(arg0);
		}
		local23.a();
		return this.anInterface24_10.method4801();
	}

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "(I)V")
	protected abstract void method4186();

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "(I)I")
	public final int method4187() {
		return this.anInt4840;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(ZZ)Lclient!wl;")
	public abstract Interface24 method4188(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(Z)V")
	protected abstract void method4189();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!tf;IZ)V")
	private void method4190(@OriginalArg(0) Class319 arg0, @OriginalArg(1) int arg1) {
		this.method4181(0, this.anInterface24_11);
		this.method4196(this.aClass48_14);
		this.method4294(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "(I)V")
	private void method4191() {
		this.aFloat91 = this.anInt4807;
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
	@Override
	public final void method7191(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass82_3 != null) {
			this.aClass82_3.method2537();
		}
		this.anInt4805 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
	@Override
	public final int method7169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!fda;[BIIII)Lclient!gv;")
	public abstract Interface9 method4192(@OriginalArg(0) Class93 arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIF)Lclient!ff;")
	@Override
	public final Class3_Sub22 method7164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub22_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "()I")
	@Override
	public final int method7159() {
		return this.anInt4831 - 2;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method4212();
		this.method4250();
		this.method4266(arg4);
		this.method4251(0, Static88.aClass252_2);
		this.method4241(0, Static88.aClass252_2);
		this.method4273(arg5);
		this.aClass109_Sub3_15.method7121(1.0F, (float) (arg2 - 1), (float) (arg3 - 1));
		this.aClass109_Sub3_15.method7113((float) arg1 - local7, 0.0F, (float) arg0 - local7);
		this.method4287();
		this.method4209(false);
		this.method4190(Static380.aClass319_6, 4);
		this.method4209(true);
		this.method4241(0, Static74.aClass252_1);
		this.method4251(0, Static74.aClass252_1);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BZ)V")
	public final void method4193(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean362 != arg0) {
			this.aBoolean362 = arg0;
			this.method4201();
			this.anInt4803 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "(B)V")
	protected abstract void method4194();

	@OriginalMember(owner = "client!cf", name = "oa", descriptor = "([I)V")
	@Override
	public final void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4813;
		arg0[1] = this.anInt4825;
		arg0[2] = this.anInt4812;
		arg0[3] = this.anInt4819;
	}

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "(I)Lclient!un;")
	public final Class109_Sub3 method4195() {
		return this.aClass109_Sub3_18;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!kr;)V")
	public abstract void method4196(@OriginalArg(1) Class48 arg0);

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "(B)V")
	private void method4197() {
		this.aFloatArray35[10] = this.aFloat96;
		this.aFloatArray35[14] = this.aFloat103;
		this.aFloat99 = ((float) -this.anInt4807 + this.aFloatArray35[14]) / this.aFloatArray35[10];
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method4198(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(Z)V")
	protected abstract void method4199();

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "(I)V")
	protected abstract void method4200();

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "(B)V")
	protected abstract void method4201();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	protected abstract void method4202(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public final Class46 method7184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class46_Sub2 local11 = new Class46_Sub2(this, arg2, arg3, arg4);
		local11.da(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!cf", name = "ra", descriptor = "(F)V")
	@Override
	public final void ra(@OriginalArg(0) float arg0) {
		if (this.aFloat97 != arg0) {
			this.aFloat97 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method4186();
			this.method4177();
		}
	}

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "(I)V")
	public final void method4203() {
		if (this.anInt4803 == 8) {
			return;
		}
		this.method4267();
		this.method4193(true);
		this.method4261(true);
		this.method4278(true);
		this.method4273(1);
		this.anInt4803 = 8;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	protected abstract void method4204(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!cf", name = "ZA", descriptor = "(Z)V")
	@Override
	public final void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean372 = arg0;
		this.method4291();
	}

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "(I)V")
	private void method4205() {
		this.aBoolean371 = false;
		this.method4256();
		if (Static501.aClass240_6 == this.aClass240_4) {
			this.method4282();
		}
	}

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "(B)I")
	public final int method4206() {
		return this.anInt4824;
	}

	@OriginalMember(owner = "client!cf", name = "YA", descriptor = "(IIII)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean370) {
			throw new RuntimeException("");
		}
		this.anInt4840 = arg1;
		this.anInt4824 = arg0;
		this.anInt4837 = arg2;
		this.anInt4821 = arg3;
		if (this.aBoolean373) {
			this.aClass12Array3[3].method6837();
			this.aClass12Array3[3].method6841();
		}
	}

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "(I)V")
	private void method4207() {
		this.anInterface24_11 = this.method4188(false);
		this.anInterface24_11.method4802(28, 140);
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			@Pc(34) Buffer local34 = this.anInterface24_11.method4803();
			if (local34 != null) {
				@Pc(43) Stream local43 = this.method4233(local34);
				if (Stream.c()) {
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
				} else {
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
				}
				local43.a();
				if (this.anInterface24_11.method4801()) {
					break;
				}
			}
		}
		this.aClass48_14 = this.method4290(new Class289[] { new Class289(new Class68[] { Static100.aClass68_1, Static100.aClass68_5, Static100.aClass68_5 }) });
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7147() {
		return true;
	}

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "(I)V")
	public final void method4208() {
		if (this.anInt4803 == 4) {
			return;
		}
		this.method4259();
		this.method4193(false);
		this.method4301(false);
		this.method4261(false);
		this.method4278(false);
		this.method4237(-2, false, false);
		this.method4273(1);
		this.method4183(0);
		this.anInt4803 = 4;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(ZZ)V")
	public abstract void method4209(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "(I)V")
	private void method4210() {
		this.method4283();
		if (this.aClass12_3 != null) {
			this.aClass12_3.method6844();
		}
	}

	@OriginalMember(owner = "client!cf", name = "CA", descriptor = "(IIII)V")
	@Override
	public final void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4821 = arg3;
		this.aBoolean370 = true;
		this.anInt4840 = arg1;
		this.anInt4837 = arg2;
		this.anInt4824 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "(I)F")
	protected abstract float method4212();

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "(I)V")
	protected abstract void method4213();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[Lclient!ff;)V")
	@Override
	public final void method7149(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub22Array3[local7] = arg1[local7];
		}
		this.anInt4836 = arg0;
		if (this.aClass240_4.method5517()) {
			this.method4300();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!fda;Lclient!ro;II)Lclient!hi;")
	public abstract Interface10 method4214(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Class292 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "(B)V")
	private void method4215() {
		this.anInterface24_10 = this.method4188(true);
		this.anInterface24_10.method4802(12, 24);
		this.aClass48_19 = this.method4290(new Class289[] { new Class289(Static100.aClass68_1) });
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!un;I)V")
	public final void method4216(@OriginalArg(0) Class109_Sub3 arg0) {
		this.aClass109_Sub3_15.M(arg0);
		this.aBoolean353 = false;
		this.method4279();
	}

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "(B)V")
	protected abstract void method4217();

	@OriginalMember(owner = "client!cf", name = "MA", descriptor = "(III[I)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass109_Sub3_16.method7118((float) arg1, (float) arg0, (float) arg2);
		@Pc(25) int local25;
		@Pc(28) int local28;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local25 = (int) ((float) this.anInt4838 * this.aClass109_Sub3_16.method7107((float) arg0, (float) arg1, (float) arg2) / local14);
			local28 = (int) ((float) this.anInt4815 * this.aClass109_Sub3_16.method7120((float) arg1, (float) arg2, (float) arg0) / local14);
		} else {
			local25 = this.anInt4839;
			local28 = this.anInt4818;
		}
		arg3[0] = (int) ((float) local25 - this.aFloat101);
		arg3[1] = (int) ((float) local28 - this.aFloat104);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "(B)V")
	public abstract void method4218();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public final Class139 method7210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class139_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(Z)V")
	protected abstract void method4219();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z[[III)Lclient!pu;")
	public abstract Interface20 method4220(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7163(@OriginalArg(0) Canvas arg0) {
		this.anObject26 = null;
		this.aCanvas8 = null;
		if (arg0 == null || this.aCanvas7 == arg0) {
			this.anObject26 = this.anObject25;
			this.aCanvas8 = this.aCanvas7;
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.anObject26 = this.aHashtable4.get(arg0);
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.anObject26 == null) {
			throw new RuntimeException();
		}
		this.method4255(this.anObject26, this.aCanvas8);
		this.method4292();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(FI)V")
	public final void method4221(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat90) {
			this.aFloat90 = arg0;
			this.method4275();
		}
	}

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7172() {
		return this.aBoolean358;
	}

	@OriginalMember(owner = "client!cf", name = "pa", descriptor = "(III)V")
	@Override
	public final void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4820 == arg0 && this.anInt4832 == arg1 && this.anInt4802 == arg2) {
			return;
		}
		this.anInt4832 = arg1;
		this.anInt4802 = arg2;
		this.anInt4820 = arg0;
		this.method4247();
		this.method4201();
	}

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "(B)[F")
	public final float[] method4222() {
		return this.aFloatArray31;
	}

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "(B)V")
	protected abstract void method4223();

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "(B)V")
	protected abstract void method4224();

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "(I)V")
	private void method4225() {
		if (this.aBoolean357) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray29;
		@Pc(9) float local9 = (float) this.anInt4814;
		@Pc(13) float local13 = (float) this.anInt4807;
		@Pc(25) float local25 = (float) -this.anInt4818 * this.aFloat90 / (float) this.anInt4815;
		@Pc(37) float local37 = this.aFloat90 * (float) -this.anInt4839 / (float) this.anInt4838;
		@Pc(52) float local52 = (float) (this.anInt4728 - this.anInt4839) * this.aFloat90 / (float) this.anInt4838;
		@Pc(67) float local67 = (float) (this.anInt4635 - this.anInt4818) * this.aFloat90 / (float) this.anInt4815;
		if (local37 == local52 || local67 == local25) {
			local5[13] = 0.0F;
			local5[8] = 0.0F;
			local5[6] = 0.0F;
			local5[11] = 0.0F;
			local5[2] = 0.0F;
			local5[1] = 0.0F;
			local5[12] = 0.0F;
			local5[4] = 0.0F;
			local5[10] = 1.0F;
			local5[5] = 1.0F;
			local5[9] = 0.0F;
			local5[14] = 0.0F;
			local5[15] = 1.0F;
			local5[7] = 0.0F;
			local5[0] = 1.0F;
			local5[3] = 0.0F;
		} else {
			local5[11] = 0.0F;
			local5[0] = 2.0F / (local52 - local37);
			local5[9] = 0.0F;
			local5[12] = (local52 + local37) / (local37 - local52);
			local5[6] = 0.0F;
			local5[7] = 0.0F;
			local5[13] = (local67 + local25) / (-local25 + local67);
			local5[10] = 1.0F / (local9 - local13);
			local5[3] = 0.0F;
			local5[5] = 2.0F / (local67 - local25);
			local5[2] = 0.0F;
			local5[14] = local9 / (local9 - local13);
			local5[4] = 0.0F;
			local5[15] = 1.0F;
			local5[8] = 0.0F;
			local5[1] = 0.0F;
		}
		this.method4191();
		this.aBoolean357 = true;
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(Z)V")
	private void method4226() {
		this.method4181(0, this.anInterface24_10);
		this.method4196(this.aClass48_19);
		this.method4294(Static305.aClass319_5, 0, 1);
	}

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "(I)V")
	protected void method4227() {
		this.method4184();
	}

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "(I)V")
	public final void method4228() {
		if (Static545.aClass240_7 == this.aClass240_4) {
			return;
		}
		@Pc(6) Class240 local6 = this.aClass240_4;
		this.aClass240_4 = Static545.aClass240_7;
		if (local6.method5517()) {
			this.method4262();
		}
		this.aFloatArray33 = this.aFloatArray31;
		this.anInt4803 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "()Z")
	@Override
	public final boolean method7153() {
		return false;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[FZIIILclient!fda;I)Lclient!hi;")
	protected abstract Interface10 method4229(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(6) Class93 arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "(I)V")
	protected abstract void method4230();

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "(B)V")
	public final void method4231() {
		this.method4190(Static129.aClass319_2, 2);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!tf;IIIIILclient!or;)V")
	public abstract void method4232(@OriginalArg(0) Class319 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface17 arg5);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method7194() {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;I)Lclient!jaclib/memory/Stream;")
	public final Stream method4233(@OriginalArg(0) Buffer arg0) {
		this.aStream6.a(arg0);
		return this.aStream6;
	}

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "(I)V")
	protected abstract void method4234();

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "(B)V")
	public final void method4235() {
		if (Static515.aClass174_18 != this.aClass174Array3[this.anInt4829]) {
			this.aClass174Array3[this.anInt4829] = Static515.aClass174_18;
			this.aClass109_Sub3Array3[this.anInt4829].Y();
			this.method4210();
		}
	}

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "()Z")
	@Override
	public final boolean method7217() {
		return this.aClass12Array3[3].method6846();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "()Lclient!q;")
	@Override
	public final Class109 method7140() {
		return this.aClass109_Sub3_16;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ[FBILclient!fda;)Lclient!hi;")
	public final Interface10 method4236(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class93 arg4) {
		return this.method4229(arg3, arg2, arg1, arg4, arg0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBZZ)V")
	public final void method4237(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt4809 || this.aBoolean373 != this.aBoolean370) {
			@Pc(25) Interface10 local25 = null;
			@Pc(27) int local27 = 0;
			@Pc(29) byte local29 = 0;
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = this.aBoolean370 ? 3 : 0;
			if (arg0 < 0) {
				this.method4235();
			} else {
				local25 = this.aClass82_3.method2534(arg0);
				@Pc(52) Class224 local52 = super.anInterface8_12.method6560(arg0);
				if (local52.aByte75 == 0 && local52.aByte70 == 0) {
					this.method4235();
				} else {
					@Pc(76) int local76 = local52.aBoolean490 ? 64 : 128;
					@Pc(80) int local80 = local76 * 50;
					@Pc(84) Class109_Sub3 local84 = this.method4264();
					local84.method7115((float) (local52.aByte70 * (this.anInt4808 % local80)) / (float) local80, (float) (this.anInt4808 % local80 * local52.aByte75) / (float) local80, 0.0F);
					this.method4296(Static325.aClass174_26);
				}
				local27 = local52.anInt6094;
				if (!this.aBoolean370) {
					local31 = local52.anInt6091;
					local29 = local52.aByte74;
					local38 = local52.aByte69;
				}
			}
			this.method4254(local29, arg2, local38, arg1, local31);
			if (this.aClass12_3 == null) {
				this.method4298(local25);
				this.method4183(local27);
			} else {
				this.aClass12_3.method6840(local27, local25);
			}
			this.aBoolean373 = this.aBoolean370;
			this.anInt4809 = arg0;
		}
		this.anInt4803 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public final void method7156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class146 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(II)V")
	public final void method4238(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt4829) {
			this.anInt4829 = arg0;
			this.method4245();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIZ[II)Lclient!hi;")
	public abstract Interface10 method4239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!cf", name = "D", descriptor = "(I)V")
	protected abstract void method4240();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBLclient!ow;)V")
	public final void method4241(@OriginalArg(0) int arg0, @OriginalArg(2) Class252 arg1) {
		this.method4260(arg0, arg1);
	}

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "()V")
	@Override
	public final void method7202() {
		if (this.aClass82_3 != null) {
			this.aClass82_3.method2537();
		}
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7146() {
		return false;
	}

	@OriginalMember(owner = "client!cf", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "()Lclient!q;")
	@Override
	public final Class109 method7160() {
		return new Class109_Sub3();
	}

	@OriginalMember(owner = "client!cf", name = "AA", descriptor = "(III[I)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass109_Sub3_16.method7118((float) arg1, (float) arg0, (float) arg2);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt4838 * this.aClass109_Sub3_16.method7107((float) arg0, (float) arg1, (float) arg2) / local14);
			local58 = (int) ((float) this.anInt4815 * this.aClass109_Sub3_16.method7120((float) arg1, (float) arg2, (float) arg0) / local14);
		} else {
			local40 = this.anInt4839;
			local58 = this.anInt4818;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat101);
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local58 - this.aFloat104);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt4797 + this.anInt4791 + this.anInt4795;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public final Class146 method7168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static519.method6917(arg2, arg0, arg1, arg3, this);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!fi;I)V")
	@Override
	public final void method7176(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1) {
		this.aClass134_3.method3653(arg1, this, arg0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!daa;[Lclient!vw;Z)Lclient!la;")
	@Override
	public final Class117 method7139(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class355[] arg1) {
		return new Class117_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V")
	public final void method4242(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean355 != arg0) {
			this.aBoolean355 = arg0;
			this.method4182();
		}
	}

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "(Z)V")
	protected abstract void method4243();

	@OriginalMember(owner = "client!cf", name = "da", descriptor = "(IIII)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt4728 - 1 <= arg2 && arg1 <= 0 && this.anInt4635 - 1 <= arg3) {
			this.JA();
			return;
		}
		this.anInt4813 = arg0 >= 0 ? arg0 : 0;
		this.anInt4825 = arg1 < 0 ? 0 : arg1;
		this.anInt4819 = arg3 <= this.anInt4728 ? arg3 : 0;
		this.anInt4812 = this.anInt4728 < arg2 ? 0 : arg2;
		if (!this.aBoolean374) {
			this.aBoolean374 = true;
			this.method4224();
		}
		this.method4167();
		this.method4176();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method7187(@OriginalArg(0) Class109 arg0) {
		this.aClass109_Sub3_16 = (Class109_Sub3) arg0;
		this.aClass109_Sub3_18.M(this.aClass109_Sub3_16);
		this.aClass109_Sub3_18.method7110();
		this.aClass109_Sub3_19.method7124(this.aClass109_Sub3_18);
		this.aClass109_Sub3_17.method7124(this.aClass109_Sub3_16);
		if (this.aClass240_4.method5517()) {
			this.method4262();
		}
	}

	@OriginalMember(owner = "client!cf", name = "JA", descriptor = "()V")
	@Override
	public final void JA() {
		this.anInt4813 = 0;
		this.anInt4825 = 0;
		this.anInt4812 = this.anInt4728;
		this.anInt4819 = this.anInt4635;
		if (this.aBoolean374) {
			this.aBoolean374 = false;
			this.method4224();
		}
		this.method4176();
	}

	@OriginalMember(owner = "client!cf", name = "E", descriptor = "(I)I")
	public final int method4244() {
		return this.anInt4837;
	}

	@OriginalMember(owner = "client!cf", name = "F", descriptor = "(I)V")
	protected abstract void method4245();

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "(B)V")
	protected abstract void method4246();

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "(Z)V")
	private void method4247() {
		if (this.aClass12_3 != null) {
			this.aClass12_3.method6841();
		}
		this.method4243();
	}

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "(I)V")
	private void method4248() {
		if (this.aBoolean361) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray34;
		if (this.anInt4728 == 0 || this.anInt4635 == 0) {
			local5[1] = 0.0F;
			local5[6] = 0.0F;
			local5[9] = 0.0F;
			local5[8] = 0.0F;
			local5[13] = 0.0F;
			local5[7] = 0.0F;
			local5[0] = 1.0F;
			local5[15] = 1.0F;
			local5[14] = 0.0F;
			local5[2] = 0.0F;
			local5[11] = 0.0F;
			local5[3] = 0.0F;
			local5[4] = 0.0F;
			local5[10] = 1.0F;
			local5[12] = 0.0F;
			local5[5] = 1.0F;
		} else {
			local5[6] = 0.0F;
			local5[12] = -1.0F;
			local5[3] = 0.0F;
			local5[8] = 0.0F;
			local5[15] = 1.0F;
			local5[9] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt4635;
			local5[10] = 0.5F;
			local5[11] = 0.0F;
			local5[0] = 2.0F / (float) this.anInt4728;
			local5[13] = 1.0F;
			local5[7] = 0.0F;
			local5[4] = 0.0F;
			local5[1] = 0.0F;
			local5[2] = 0.0F;
			local5[14] = 0.5F;
		}
		this.aBoolean361 = true;
	}

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "(B)V")
	public final void method4249() {
		if (this.anInt4803 == 16) {
			return;
		}
		this.method4179();
		this.method4193(true);
		this.method4261(true);
		this.method4278(true);
		this.method4273(1);
		this.anInt4803 = 16;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!js;)V")
	@Override
	public final void method7148(@OriginalArg(0) Class55 arg0) {
		this.aClass55_Sub1_3 = (Class55_Sub1) arg0;
	}

	@OriginalMember(owner = "client!cf", name = "H", descriptor = "(I)V")
	private void method4250() {
		if (this.anInt4803 == 1) {
			return;
		}
		this.method4259();
		this.method4193(false);
		this.method4301(false);
		this.method4261(false);
		this.method4278(false);
		this.method4237(-2, false, false);
		this.method4183(1);
		this.method4298(this.anInterface11_3);
		this.anInt4803 = 1;
	}

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)V")
	@Override
	public void method7215(@OriginalArg(0) int arg0) {
		if (this.aClass82_3 != null) {
			this.aClass82_3.method2536();
		}
		this.anInt4808 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7209(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas7) {
			local5 = this.anObject26;
		} else if (this.aHashtable4.containsKey(arg0)) {
			local5 = this.aHashtable4.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method4204(arg0, local5);
		if (arg0 == this.aCanvas8) {
			this.method4292();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!ow;B)V")
	public final void method4251(@OriginalArg(0) int arg0, @OriginalArg(1) Class252 arg1) {
		this.method4268(arg1, false, false, arg0);
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(II)Lclient!ne;")
	protected Class12 method4252(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class12_Sub3(this);
		} else if (arg0 == 1) {
			return new Class12_Sub11(this);
		} else if (arg0 == 2) {
			return new Class12_Sub10(this, this.lb);
		} else if (arg0 == 7) {
			return new Class12_Sub2(this);
		} else {
			return new Class12_Sub9(this);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!cb;Lclient!cb;B)V")
	public final void method4253(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class37 arg1) {
		@Pc(11) boolean local11 = false;
		if (arg0 != this.aClass37Array3[this.anInt4829]) {
			this.aClass37Array3[this.anInt4829] = arg0;
			local11 = true;
			this.method4240();
		}
		if (this.bf[this.anInt4829] != arg1) {
			this.bf[this.anInt4829] = arg1;
			local11 = true;
			this.method4194();
		}
		if (local11) {
			this.anInt4803 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!vw;Z)Lclient!f;")
	@Override
	public final Class46 method7205(@OriginalArg(0) Class355 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(26) Class46 local26;
		if (arg0.anInt9165 == 0 || arg0.anInt9162 == 0) {
			local26 = this.method7198(new int[1], 1, 1, 1);
		} else {
			@Pc(35) int[] local35 = new int[arg0.anInt9162 * arg0.anInt9165];
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			@Pc(44) int local44;
			@Pc(48) int local48;
			if (arg0.aByteArray105 == null) {
				for (local44 = 0; local44 < arg0.anInt9162; local44++) {
					for (local48 = 0; local48 < arg0.anInt9165; local48++) {
						@Pc(106) int local106 = arg0.anIntArray677[arg0.aByteArray104[local37++] & 0xFF];
						local35[local39++] = local106 == 0 ? 0 : local106 | 0xFF000000;
					}
				}
			} else {
				for (local44 = 0; local44 < arg0.anInt9162; local44++) {
					for (local48 = 0; local48 < arg0.anInt9165; local48++) {
						local35[local39++] = arg0.aByteArray105[local37] << 24 | arg0.anIntArray677[arg0.aByteArray104[local37] & 0xFF];
						local37++;
					}
				}
			}
			local26 = this.method7198(local35, arg0.anInt9165, arg0.anInt9165, arg0.anInt9162);
		}
		local26.Q(arg0.anInt9161, arg0.anInt9163, arg0.anInt9164, arg0.anInt9166);
		return local26;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZIIZI)V")
	private void method4254(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(10) boolean local10 = arg3 & this.method7217();
		if (!local10 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			arg2 = 2;
			arg4 = 1;
			arg0 = 0;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt4817) {
			if (this.anInt4817 != 0) {
				this.aClass12Array3[Integer.MAX_VALUE & this.anInt4817].method6842();
			}
			if (arg2 == 0) {
				this.aClass12_3 = null;
			} else {
				this.aClass12_3 = this.aClass12Array3[arg2 & Integer.MAX_VALUE];
				this.aClass12_3.method6838(arg1);
				this.aClass12_3.method6836(arg1);
				this.aClass12_3.method6845(arg0, arg4);
			}
			this.anInt4817 = arg2;
			this.anInt4801 = arg0;
			this.anInt4827 = arg4;
		} else if (this.anInt4817 != 0) {
			this.aClass12Array3[Integer.MAX_VALUE & this.anInt4817].method6836(arg1);
			if (this.anInt4801 != arg0 || this.anInt4827 != arg4) {
				this.aClass12Array3[this.anInt4817 & Integer.MAX_VALUE].method6845(arg0, arg4);
				this.anInt4801 = arg0;
				this.anInt4827 = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public final Class46 method7198(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class46_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method4255(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "()Z")
	@Override
	public final boolean method7150() {
		return true;
	}

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "(I)V")
	private void method4256() {
		if (this.aBoolean371) {
			return;
		}
		@Pc(17) float[] local17 = this.aFloatArray35;
		@Pc(29) float local29 = (float) (this.anInt4814 * -this.anInt4839) / (float) this.anInt4838;
		@Pc(44) float local44 = (float) (this.anInt4814 * (this.anInt4728 - this.anInt4839)) / (float) this.anInt4838;
		@Pc(55) float local55 = (float) (this.anInt4814 * this.anInt4818) / (float) this.anInt4815;
		@Pc(70) float local70 = (float) (this.anInt4814 * (this.anInt4818 - this.anInt4635)) / (float) this.anInt4815;
		if (local44 == local29 || local70 == local55) {
			local17[12] = 0.0F;
			local17[5] = 1.0F;
			local17[9] = 0.0F;
			local17[13] = 0.0F;
			local17[0] = 1.0F;
			local17[8] = 0.0F;
			local17[10] = 1.0F;
			local17[2] = 0.0F;
			local17[3] = 0.0F;
			local17[14] = 0.0F;
			local17[7] = 0.0F;
			local17[4] = 0.0F;
			local17[11] = 0.0F;
			local17[6] = 0.0F;
			local17[15] = 1.0F;
			local17[1] = 0.0F;
		} else {
			@Pc(150) float local150 = (float) this.anInt4814 * 2.0F;
			local17[2] = 0.0F;
			local17[10] = this.aFloat96 = (float) this.anInt4807 / (float) (this.anInt4814 - this.anInt4807);
			local17[4] = 0.0F;
			local17[6] = 0.0F;
			local17[14] = this.aFloat103 = (float) (this.anInt4814 * this.anInt4807) / (float) (this.anInt4814 - this.anInt4807);
			local17[8] = (local44 + local29) / (-local29 + local44);
			local17[3] = 0.0F;
			local17[7] = 0.0F;
			local17[13] = 0.0F;
			local17[1] = 0.0F;
			local17[0] = local150 / (local44 - local29);
			local17[15] = 0.0F;
			local17[5] = local150 / (local55 - local70);
			local17[9] = (local70 + local55) / (local55 - local70);
			local17[12] = 0.0F;
			local17[11] = -1.0F;
		}
		this.method4197();
		this.aBoolean371 = true;
	}

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "(I)I")
	public final int method4257() {
		return this.anInt4821;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(ZI)Lclient!or;")
	public abstract Interface17 method4258(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!cf", name = "K", descriptor = "(I)V")
	private void method4259() {
		if (Static468.aClass240_5 == this.aClass240_4) {
			return;
		}
		@Pc(6) Class240 local6 = this.aClass240_4;
		this.aClass240_4 = Static468.aClass240_5;
		if (local6.method5517()) {
			this.method4262();
		}
		this.method4248();
		this.aFloatArray33 = this.aFloatArray34;
		this.method4282();
		this.anInt4803 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBZLclient!ow;)V")
	protected abstract void method4260(@OriginalArg(0) int arg0, @OriginalArg(3) Class252 arg1);

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "()Z")
	@Override
	public final boolean method7166() {
		return true;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(BZ)V")
	public final void method4261(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean367) {
			this.aBoolean367 = arg0;
			this.method4230();
			this.anInt4803 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "(B)V")
	private void method4262() {
		this.aBoolean354 = false;
		if (this.aClass12_3 != null) {
			this.aClass12_3.method6847();
		}
		this.method4175();
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	@Override
	public final void method7157(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!cf", name = "L", descriptor = "(I)V")
	public final void method4263() {
		this.aClass109_Sub3_15.Y();
		this.aBoolean353 = true;
		this.method4279();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7195(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "(Z)Lclient!un;")
	public final Class109_Sub3 method4264() {
		return this.aClass109_Sub3Array3[this.anInt4829];
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!nda;IIII)Lclient!da;")
	@Override
	public final Class57 method7178(@OriginalArg(0) Class226 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class57_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)V")
	public final void method4266(@OriginalArg(1) int arg0) {
		if (this.anInt4822 != arg0) {
			this.anInt4822 = arg0;
			this.method4200();
		}
	}

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "()V")
	@Override
	protected void method7165() {
		if (this.aBoolean359) {
			return;
		}
		for (@Pc(13) Class3 local13 = this.aClass130_26.method3543(); local13 != null; local13 = this.aClass130_26.method3551()) {
			((Class3_Sub16_Sub2) local13).method7817();
		}
		@Pc(30) Enumeration local30 = this.aHashtable4.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method4202(this.aHashtable4.get(local36), local36);
		}
		Static216.method3777(true, false);
		this.aNativeInterface3.release();
		this.aBoolean359 = true;
	}

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "(B)V")
	private void method4267() {
		if (Static501.aClass240_6 == this.aClass240_4) {
			return;
		}
		@Pc(12) Class240 local12 = this.aClass240_4;
		this.aClass240_4 = Static501.aClass240_6;
		if (!local12.method5517()) {
			this.method4262();
		}
		this.method4256();
		this.aFloatArray33 = this.aFloatArray35;
		this.method4282();
		this.anInt4803 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ow;IZZI)V")
	public abstract void method4268(@OriginalArg(0) Class252 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
	public final void method4269(@OriginalArg(1) byte arg0) {
		this.method4266(arg0 << 8 | arg0 << 24 | arg0 << 16 | arg0);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)I")
	@Override
	public final int method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!cf", name = "M", descriptor = "(I)V")
	protected final void method4270() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable4 != null && !this.aHashtable4.isEmpty()) {
			@Pc(24) Enumeration local24 = this.aHashtable4.keys();
			while (local24.hasMoreElements()) {
				@Pc(30) Canvas local30 = (Canvas) local24.nextElement();
				local9.put(local30, this.method4198(local30));
			}
		}
		this.aHashtable4 = local9;
		this.method4207();
		this.method4215();
		this.aClass134_3.method3650(this);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIB)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method4271(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap3.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "(B)V")
	public final void method4272() {
		this.method4228();
		this.method4282();
	}

	@OriginalMember(owner = "client!cf", name = "L", descriptor = "()V")
	@Override
	public final void L() {
		this.aBoolean370 = false;
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(II)V")
	public final void method4273(@OriginalArg(1) int arg0) {
		if (this.anInt4830 == arg0) {
			return;
		}
		@Pc(18) Class285 local18;
		@Pc(16) boolean local16;
		@Pc(14) boolean local14;
		if (arg0 == 1) {
			local14 = true;
			local16 = true;
			local18 = Static246.aClass285_4;
		} else if (arg0 == 2) {
			local14 = false;
			local16 = true;
			local18 = Static488.aClass285_7;
		} else if (arg0 == 128) {
			local18 = Static474.aClass285_6;
			local14 = true;
			local16 = true;
		} else {
			local18 = Static73.aClass285_2;
			local16 = false;
			local14 = false;
		}
		if (this.aBoolean365 != local14) {
			this.aBoolean365 = local14;
			this.method4246();
		}
		if (local16 != this.aBoolean360) {
			this.aBoolean360 = local16;
			this.method4219();
		}
		if (this.aClass285_5 != local18) {
			this.aClass285_5 = local18;
			this.method4189();
		}
		this.anInt4830 = arg0;
		this.anInt4803 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!cf", name = "N", descriptor = "(I)V")
	private void method4274() {
		this.aBoolean361 = false;
		if (Static468.aClass240_5 == this.aClass240_4) {
			this.method4248();
			this.method4282();
		}
	}

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "(Z)V")
	private void method4275() {
		this.aBoolean357 = false;
		this.method4225();
		if (Static63.aClass240_2 == this.aClass240_4) {
			this.method4282();
		}
	}

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "()[I")
	@Override
	public final int[] v() {
		return new int[] { this.anInt4839, this.anInt4818, this.anInt4838, this.anInt4815 };
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([I)V")
	@Override
	public final void method7158(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt4635;
		arg0[0] = this.anInt4728;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!cf", name = "O", descriptor = "(I)V")
	public final void method4276() {
		if (this.anInt4803 == 2) {
			return;
		}
		this.method4259();
		this.method4193(false);
		this.method4301(false);
		this.method4261(false);
		this.method4278(false);
		this.method4237(-2, false, false);
		this.anInt4803 = 2;
	}

	@OriginalMember(owner = "client!cf", name = "GA", descriptor = "(II)V")
	@Override
	public final void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt4814 && arg1 == this.anInt4807) {
			return;
		}
		this.anInt4807 = arg1;
		this.anInt4814 = arg0;
		this.method4205();
		this.method4275();
		this.method4247();
	}

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "(B)Lclient!un;")
	public final Class109_Sub3 method4277() {
		return this.aClass109_Sub3_19;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IZ)V")
	public final void method4278(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean369 != arg0) {
			this.aBoolean369 = arg0;
			this.method4291();
			this.anInt4803 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "(Z)V")
	private void method4279() {
		if (Static468.aClass240_5 == this.aClass240_4) {
			@Pc(11) float local11 = this.method4212();
			this.aClass109_Sub3_15.method7113(local11, 0.0F, local11);
		}
		this.aBoolean354 = false;
		this.method4217();
		if (this.aClass12_3 != null) {
			this.aClass12_3.method6852();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	@Override
	public final void method7141(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "(B)V")
	public final void method4280() {
		this.bf = new Class37[this.anInt4834];
		this.aClass109_Sub3Array3 = new Class109_Sub3[this.anInt4834];
		this.aClass174Array3 = new Class174[this.anInt4834];
		this.aClass37Array3 = new Class37[this.anInt4834];
		this.anInterface11Array3 = new Interface11[this.anInt4834];
		for (@Pc(32) int local32 = 0; local32 < this.anInt4834; local32++) {
			this.bf[local32] = Static106.aClass37_2;
			this.aClass37Array3[local32] = Static106.aClass37_2;
			this.aClass174Array3[local32] = Static515.aClass174_18;
			this.aClass109_Sub3Array3[local32] = new Class109_Sub3();
		}
		this.aClass3_Sub22Array3 = new Class3_Sub22[this.anInt4831 - 2];
		this.anInterface11_3 = this.method4214(Static581.aClass93_14, Static461.aClass292_14, 1, 1);
		this.method7201(new Class3_Sub16_Sub2(262144));
		this.aClass48_16 = this.method4290(new Class289[] { new Class289(new Class68[] { Static100.aClass68_1, Static100.aClass68_5 }) });
		this.aClass48_15 = this.method4290(new Class289[] { new Class289(new Class68[] { Static100.aClass68_1, Static100.aClass68_3 }) });
		this.aClass48_18 = this.method4290(new Class289[] { new Class289(Static100.aClass68_1), new Class289(Static100.aClass68_3), new Class289(Static100.aClass68_5), new Class289(Static100.aClass68_2) });
		this.aClass48_17 = this.method4290(new Class289[] { new Class289(Static100.aClass68_1), new Class289(Static100.aClass68_3), new Class289(Static100.aClass68_5) });
		this.aClass57_Sub3_26 = new Class57_Sub3(this, 0, 0, false, false);
		this.aClass57_Sub3_30 = new Class57_Sub3(this, 0, 0, true, true);
		this.aClass57_Sub3_21 = new Class57_Sub3(this, 0, 0, false, false);
		this.aClass57_Sub3_23 = new Class57_Sub3(this, 0, 0, true, true);
		this.aClass57_Sub3_29 = new Class57_Sub3(this, 0, 0, false, false);
		this.aClass57_Sub3_25 = new Class57_Sub3(this, 0, 0, true, true);
		this.aClass57_Sub3_27 = new Class57_Sub3(this, 0, 0, false, false);
		this.aClass57_Sub3_24 = new Class57_Sub3(this, 0, 0, true, true);
		this.aClass57_Sub3_22 = new Class57_Sub3(this, 0, 0, false, false);
		this.aClass57_Sub3_28 = new Class57_Sub3(this, 0, 0, true, true);
		this.aClass134_3 = new Class134(this);
		this.anInterface17_7 = this.method4258(true);
		this.method4270();
		this.lb = new Class157(this);
		this.aClass12Array3[1] = this.method4252(1);
		this.aClass12Array3[2] = this.method4252(2);
		this.aClass12Array3[4] = this.method4252(4);
		this.aClass12Array3[5] = this.method4252(5);
		this.aClass12Array3[6] = this.method4252(6);
		this.aClass12Array3[7] = this.method4252(7);
		this.aClass12Array3[3] = this.method4252(3);
		this.aClass12Array3[8] = this.method4252(8);
		this.aClass12Array3[9] = this.method4252(9);
		if (!this.aClass12Array3[2].method6846()) {
			this.aClass12Array3[2] = this.method4252(0);
		}
		if (!this.aClass12Array3[4].method6846()) {
			this.aClass12Array3[4] = this.aClass12Array3[2];
		}
		if (!this.aClass12Array3[8].method6846()) {
			this.aClass12Array3[8] = this.aClass12Array3[4];
		}
		if (!this.aClass12Array3[9].method6846()) {
			this.aClass12Array3[9] = this.aClass12Array3[8];
		}
		this.method4227();
		this.JA();
		this.method7177();
	}

	@OriginalMember(owner = "client!cf", name = "BA", descriptor = "()I")
	@Override
	public final int BA() {
		return this.anInt4814;
	}

	@OriginalMember(owner = "client!cf", name = "va", descriptor = "(I)V")
	@Override
	public final void va(@OriginalArg(0) int arg0) {
		this.anInt4816 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt4816++;
		}
		this.anInt4806 = 0x1 << this.anInt4816;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(BI)Lclient!or;")
	public final Interface17 method4281(@OriginalArg(1) int arg0) {
		if (this.anInterface17_7.method6937() < arg0 * 2) {
			this.anInterface17_7.method6942(arg0);
		}
		return this.anInterface17_7;
	}

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "(IIIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7137(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!cf", name = "P", descriptor = "(I)V")
	private void method4282() {
		this.method4199();
		if (this.aClass12_3 != null) {
			this.aClass12_3.method6851();
		}
	}

	@OriginalMember(owner = "client!cf", name = "Q", descriptor = "(I)V")
	protected abstract void method4283();

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "()Z")
	@Override
	public final boolean method7211() {
		return true;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[BIZLclient!fda;I)Lclient!hi;")
	public final Interface10 method4285(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class93 arg4) {
		return this.method4169(arg2, arg4, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(Lclient!ro;Lclient!fda;B)Z")
	public abstract boolean method4286(@OriginalArg(0) Class292 arg0, @OriginalArg(1) Class93 arg1);

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(IIIII)V")
	@Override
	protected final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "(B)V")
	public final void method4287() {
		this.aBoolean353 = false;
		this.method4279();
	}

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "()Z")
	@Override
	public final boolean method7162() {
		return true;
	}

	@OriginalMember(owner = "client!cf", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt4841;
	}

	@OriginalMember(owner = "client!cf", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public final void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class146_Sub2 local6 = (Class146_Sub2) arg1;
		@Pc(9) Interface10 local9 = local6.anInterface10_4;
		this.method4276();
		this.method4298(local9);
		this.method4273(1);
		this.method4253(Static587.aClass37_5, Static587.aClass37_5);
		this.method4251(0, Static88.aClass252_2);
		this.method4266(arg0);
		this.aClass109_Sub3_15.method7121(0.0F, (float) this.anInt4728, (float) this.anInt4635);
		this.method4287();
		this.aClass109_Sub3Array3[0].method7121(1.0F, local9.method6175((float) this.anInt4728), local9.method6170((float) this.anInt4635));
		this.aClass109_Sub3Array3[0].method7113(local9.method6170((float) -arg3), 0.0F, local9.method6175((float) -arg2));
		this.aClass174Array3[0] = Static325.aClass174_26;
		this.method4210();
		this.method4231();
		this.method4235();
		this.method4251(0, Static74.aClass252_1);
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(BI)V")
	public abstract void method4289(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[Lclient!rk;)Lclient!kr;")
	public abstract Class48 method4290(@OriginalArg(1) Class289[] arg0);

	@OriginalMember(owner = "client!cf", name = "R", descriptor = "(I)V")
	protected abstract void method4291();

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7183(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas7) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.method4202(this.aHashtable4.get(arg0), arg0);
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!cf", name = "S", descriptor = "(I)V")
	private void method4292() {
		if (this.aCanvas8 == null) {
			this.anInt4629 = this.anInt4775 = 1;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas8.getSize();
			this.anInt4775 = local10.height;
			this.anInt4629 = local10.width;
		}
		this.anInt4635 = this.anInt4775;
		this.anInt4728 = this.anInt4629;
		this.method4274();
		this.method4205();
		this.method4275();
		this.method4213();
		this.method4176();
		this.method4228();
		this.JA();
	}

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "(B)Lclient!un;")
	public final Class109_Sub3 method4293() {
		return this.aClass109_Sub3Array3[this.anInt4829];
	}

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "()Z")
	@Override
	public final boolean method7192() {
		return true;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!tf;III)V")
	public abstract void method4294(@OriginalArg(0) Class319 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!fi;)V")
	@Override
	public final void method7189(@OriginalArg(0) Class96 arg0) {
		this.aClass134_3.method3653(-1, this, arg0);
	}

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "(IIIIII)V")
	@Override
	public final void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4250();
		this.method4266(arg4);
		this.method4251(0, Static88.aClass252_2);
		this.method4241(0, Static88.aClass252_2);
		this.method4273(arg5);
		this.aClass109_Sub3_15.method7121(1.0F, (float) arg2, (float) arg3);
		this.aClass109_Sub3_15.U(arg0, arg1, 0);
		this.method4287();
		this.method4209(false);
		this.method4231();
		this.method4209(true);
		this.method4241(0, Static74.aClass252_1);
		this.method4251(0, Static74.aClass252_1);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([FB)[F")
	public final float[] method4295(@OriginalArg(0) float[] arg0) {
		arg0[12] = this.aFloatArray33[3];
		arg0[4] = this.aFloatArray33[1];
		arg0[8] = this.aFloatArray33[2];
		arg0[0] = this.aFloatArray33[0];
		arg0[13] = this.aFloatArray33[7];
		arg0[2] = this.aFloatArray33[8];
		arg0[5] = this.aFloatArray33[5];
		arg0[9] = this.aFloatArray33[6];
		arg0[1] = this.aFloatArray33[4];
		arg0[10] = this.aFloatArray33[10];
		arg0[6] = this.aFloatArray33[9];
		arg0[14] = this.aFloatArray33[11];
		arg0[3] = this.aFloatArray33[12];
		arg0[7] = this.aFloatArray33[13];
		arg0[15] = this.aFloatArray33[15];
		arg0[11] = this.aFloatArray33[14];
		return arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!jv;)V")
	public final void method4296(@OriginalArg(1) Class174 arg0) {
		this.aClass174Array3[this.anInt4829] = arg0;
		this.method4210();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public final void method7201(@OriginalArg(0) Class3_Sub16 arg0) {
		this.aNativeHeap3 = ((Class3_Sub16_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer6 = this.aNativeHeap3.a(32768, false);
	}

	@OriginalMember(owner = "client!cf", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt4807;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public final Class46 method7143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class46_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!sh;)V")
	public abstract void method4297(@OriginalArg(1) Class307 arg0);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!hw;)V")
	public final void method4298(@OriginalArg(1) Interface11 arg0) {
		if (this.anInterface11Array3[this.anInt4829] == arg0) {
			return;
		}
		this.anInterface11Array3[this.anInt4829] = arg0;
		if (arg0 == null) {
			this.method4178();
		} else {
			arg0.method7423();
		}
		this.anInt4803 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "(Z)V")
	protected final void method4299() {
		@Pc(9) Enumeration local9 = this.aHashtable4.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method4202(this.aHashtable4.get(local15), local15);
		}
		this.anInterface24_11.method6939();
		this.anInterface24_10.method6939();
		this.aClass57_Sub3_30.method7542();
		this.aClass57_Sub3_23.method7542();
		this.aClass57_Sub3_25.method7542();
		this.aClass57_Sub3_24.method7542();
		this.aClass57_Sub3_28.method7542();
		this.aClass134_3.method3658();
		this.anInterface17_7.method6939();
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
	@Override
	public final void method7182(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7199(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas7) {
			throw new RuntimeException();
		} else if (!this.aHashtable4.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) Object local53 = this.method4198(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable4.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "(Z)V")
	protected void method4300() {
		this.anInt4828 = this.anInt4836;
		this.anInt4836 = 0;
	}

	@OriginalMember(owner = "client!cf", name = "la", descriptor = "(IIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4839 = arg0;
		this.anInt4815 = arg3;
		this.anInt4818 = arg1;
		this.anInt4838 = arg2;
		this.method4275();
		this.method4205();
		this.method4228();
		this.method4176();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZB)V")
	public final void method4301(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean368 != arg0) {
			this.aBoolean368 = arg0;
			this.method4234();
			this.anInt4803 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "(Z)Lclient!pu;")
	public final Interface20 method4302() {
		return this.aClass55_Sub1_3 == null ? null : this.aClass55_Sub1_3.method2720();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[IBZI)Lclient!hi;")
	public final Interface10 method4303(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		return this.method4239(0, arg0, arg3, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!cf", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public final boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass109_Sub3_16.method7118((float) arg1, (float) arg0, (float) arg2);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass109_Sub3_16.method7118((float) arg4, (float) arg3, (float) arg5);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt4814 > local14 && local31 < (float) this.anInt4814 || !(!((float) this.anInt4807 < local14) || !((float) this.anInt4807 < local31))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt4838 * this.aClass109_Sub3_16.method7107((float) arg0, (float) arg1, (float) arg2) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt4838 * this.aClass109_Sub3_16.method7107((float) arg3, (float) arg4, (float) arg5) / local31);
		if (this.aFloat101 > (float) local81 && (float) local99 < this.aFloat101 || this.aFloat92 < (float) local81 && this.aFloat92 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt4815 * this.aClass109_Sub3_16.method7120((float) arg1, (float) arg2, (float) arg0) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt4815 * this.aClass109_Sub3_16.method7120((float) arg4, (float) arg5, (float) arg3) / local31);
			return (!((float) local143 < this.aFloat104) || !((float) local161 < this.aFloat104)) && (!((float) local143 > this.aFloat95) || !(this.aFloat95 < (float) local161));
		}
	}

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "()Z")
	@Override
	public final boolean method7161() {
		return false;
	}

	@OriginalMember(owner = "client!cf", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public final void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt4826;
		if (local11 || arg1 != this.aFloat105 || this.aFloat102 != arg2) {
			this.aFloat102 = arg2;
			this.anInt4826 = arg0;
			this.aFloat105 = arg1;
			if (local11) {
				this.aFloat100 = (float) (this.anInt4826 & 0xFF0000) / 1.671168E7F;
				this.aFloat93 = (float) (this.anInt4826 & 0xFF) / 255.0F;
				this.aFloat98 = (float) (this.anInt4826 & 0xFF00) / 65280.0F;
				this.method4186();
			}
			this.aNativeInterface3.setSunColour(this.aFloat100, this.aFloat98, this.aFloat93, arg1, arg2);
			this.method4223();
		}
		if (this.aFloatArray36[0] != arg3 || arg4 != this.aFloatArray36[1] || arg5 != this.aFloatArray36[2]) {
			this.aFloatArray36[1] = arg4;
			this.aFloatArray36[0] = arg3;
			this.aFloatArray36[2] = arg5;
			this.aFloatArray32[0] = -arg3;
			this.aFloatArray32[1] = -arg4;
			this.aFloatArray32[2] = -arg5;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
			this.aFloatArray28[0] = arg3 * local149;
			this.aFloatArray28[2] = local149 * arg5;
			this.aFloatArray28[1] = arg4 * local149;
			this.aFloatArray30[2] = -this.aFloatArray28[2];
			this.aFloatArray30[0] = -this.aFloatArray28[0];
			this.aFloatArray30[1] = -this.aFloatArray28[1];
			this.aNativeInterface3.setSunDirection(this.aFloatArray28[0], this.aFloatArray28[1], this.aFloatArray28[2]);
			this.method4218();
			this.anInt4810 = (int) (arg5 * 256.0F / arg4);
			this.anInt4811 = (int) (arg3 * 256.0F / arg4);
		}
		this.method4177();
	}
}
