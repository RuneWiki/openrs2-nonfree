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

@OriginalClass("client!ij")
public abstract class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!ij", name = "P", descriptor = "Lclient!tn;")
	protected Class334 aClass334_8;

	@OriginalMember(owner = "client!ij", name = "Eb", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!ij", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!ij", name = "Gc", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable6;

	@OriginalMember(owner = "client!ij", name = "Gd", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!ij", name = "Ud", descriptor = "I")
	protected int anInt9712;

	@OriginalMember(owner = "client!ij", name = "Yd", descriptor = "I")
	public int anInt9715;

	@OriginalMember(owner = "client!ij", name = "ce", descriptor = "I")
	public int anInt9719;

	@OriginalMember(owner = "client!ij", name = "me", descriptor = "I")
	public int anInt9722;

	@OriginalMember(owner = "client!ij", name = "oe", descriptor = "Z")
	protected boolean aBoolean685;

	@OriginalMember(owner = "client!ij", name = "re", descriptor = "Z")
	public boolean aBoolean686;

	@OriginalMember(owner = "client!ij", name = "te", descriptor = "F")
	private float aFloat189;

	@OriginalMember(owner = "client!ij", name = "ve", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!ij", name = "ye", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!ij", name = "Ce", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!ij", name = "Ge", descriptor = "Lclient!rk;")
	private Class49_Sub2 aClass49_Sub2_3;

	@OriginalMember(owner = "client!ij", name = "He", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!ij", name = "Ie", descriptor = "Z")
	protected boolean aBoolean689;

	@OriginalMember(owner = "client!ij", name = "Oe", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!ij", name = "We", descriptor = "I")
	protected int anInt9731;

	@OriginalMember(owner = "client!ij", name = "ff", descriptor = "Z")
	public boolean aBoolean693;

	@OriginalMember(owner = "client!ij", name = "hf", descriptor = "I")
	public int anInt9736;

	@OriginalMember(owner = "client!ij", name = "jf", descriptor = "[Lclient!en;")
	protected Class100[] aClass100Array3;

	@OriginalMember(owner = "client!ij", name = "lf", descriptor = "I")
	protected int anInt9737;

	@OriginalMember(owner = "client!ij", name = "of", descriptor = "I")
	private int anInt9739;

	@OriginalMember(owner = "client!ij", name = "qf", descriptor = "F")
	private float aFloat200;

	@OriginalMember(owner = "client!ij", name = "rf", descriptor = "I")
	public int anInt9741;

	@OriginalMember(owner = "client!ij", name = "vf", descriptor = "Z")
	public boolean aBoolean695;

	@OriginalMember(owner = "client!ij", name = "wf", descriptor = "F")
	public float aFloat201;

	@OriginalMember(owner = "client!ij", name = "xf", descriptor = "Lclient!fe;")
	public Interface6 anInterface6_3;

	@OriginalMember(owner = "client!ij", name = "yf", descriptor = "[Lclient!pfa;")
	protected Class269[] aClass269Array5;

	@OriginalMember(owner = "client!ij", name = "Af", descriptor = "Lclient!gda;")
	private Class18 aClass18_3;

	@OriginalMember(owner = "client!ij", name = "Df", descriptor = "[Lclient!pfa;")
	protected Class269[] aClass269Array6;

	@OriginalMember(owner = "client!ij", name = "Ef", descriptor = "[Lclient!laa;")
	protected Class2_Sub12[] aClass2_Sub12Array5;

	@OriginalMember(owner = "client!ij", name = "Nf", descriptor = "[Lclient!fe;")
	private Interface6[] anInterface6Array3;

	@OriginalMember(owner = "client!ij", name = "Tf", descriptor = "I")
	public int anInt9753;

	@OriginalMember(owner = "client!ij", name = "Vf", descriptor = "Lclient!faa;")
	private Class107 aClass107_3;

	@OriginalMember(owner = "client!ij", name = "Wf", descriptor = "[Lclient!gk;")
	protected Class51_Sub2[] aClass51_Sub2Array3;

	@OriginalMember(owner = "client!ij", name = "Zf", descriptor = "I")
	protected int anInt9756;

	@OriginalMember(owner = "client!ij", name = "cg", descriptor = "I")
	protected int anInt9757;

	@OriginalMember(owner = "client!ij", name = "gg", descriptor = "I")
	private int anInt9760;

	@OriginalMember(owner = "client!ij", name = "ig", descriptor = "Lclient!ri;")
	public Class258 aClass258_17;

	@OriginalMember(owner = "client!ij", name = "jg", descriptor = "Lclient!ri;")
	private Class258 aClass258_18;

	@OriginalMember(owner = "client!ij", name = "kg", descriptor = "Lclient!ri;")
	private Class258 aClass258_19;

	@OriginalMember(owner = "client!ij", name = "lg", descriptor = "Lclient!ia;")
	private Interface10 anInterface10_15;

	@OriginalMember(owner = "client!ij", name = "mg", descriptor = "Lclient!nda;")
	public Class193_Sub2 aClass193_Sub2_21;

	@OriginalMember(owner = "client!ij", name = "ng", descriptor = "Lclient!nda;")
	public Class193_Sub2 aClass193_Sub2_22;

	@OriginalMember(owner = "client!ij", name = "og", descriptor = "Lclient!ri;")
	public Class258 aClass258_20;

	@OriginalMember(owner = "client!ij", name = "pg", descriptor = "Lclient!ri;")
	public Class258 aClass258_21;

	@OriginalMember(owner = "client!ij", name = "qg", descriptor = "Lclient!nda;")
	public Class193_Sub2 aClass193_Sub2_23;

	@OriginalMember(owner = "client!ij", name = "rg", descriptor = "Lclient!ia;")
	private Interface10 anInterface10_16;

	@OriginalMember(owner = "client!ij", name = "sg", descriptor = "Lclient!nda;")
	public Class193_Sub2 aClass193_Sub2_24;

	@OriginalMember(owner = "client!ij", name = "tg", descriptor = "Lclient!nda;")
	public Class193_Sub2 aClass193_Sub2_25;

	@OriginalMember(owner = "client!ij", name = "ug", descriptor = "Lclient!nda;")
	public Class193_Sub2 aClass193_Sub2_26;

	@OriginalMember(owner = "client!ij", name = "vg", descriptor = "Lclient!nda;")
	public Class193_Sub2 aClass193_Sub2_27;

	@OriginalMember(owner = "client!ij", name = "wg", descriptor = "Lclient!ia;")
	private Interface10 anInterface10_17;

	@OriginalMember(owner = "client!ij", name = "xg", descriptor = "Lclient!nda;")
	public Class193_Sub2 aClass193_Sub2_28;

	@OriginalMember(owner = "client!ij", name = "yg", descriptor = "Lclient!nda;")
	public Class193_Sub2 aClass193_Sub2_29;

	@OriginalMember(owner = "client!ij", name = "zg", descriptor = "Lclient!ri;")
	private Class258 aClass258_22;

	@OriginalMember(owner = "client!ij", name = "Ag", descriptor = "Lclient!nda;")
	public Class193_Sub2 aClass193_Sub2_30;

	@OriginalMember(owner = "client!ij", name = "Cg", descriptor = "Lclient!iaa;")
	private Interface11 anInterface11_7;

	@OriginalMember(owner = "client!ij", name = "Dg", descriptor = "Lclient!ri;")
	public Class258 aClass258_23;

	@OriginalMember(owner = "client!ij", name = "Eg", descriptor = "I")
	private int anInt9762;

	@OriginalMember(owner = "client!ij", name = "Fg", descriptor = "Z")
	protected boolean aBoolean702;

	@OriginalMember(owner = "client!ij", name = "nd", descriptor = "Lclient!fh;")
	private final Class114 aClass114_58 = new Class114();

	@OriginalMember(owner = "client!ij", name = "Vd", descriptor = "Z")
	protected boolean aBoolean682 = true;

	@OriginalMember(owner = "client!ij", name = "Md", descriptor = "Lclient!gk;")
	protected final Class51_Sub2 aClass51_Sub2_15 = new Class51_Sub2();

	@OriginalMember(owner = "client!ij", name = "ee", descriptor = "Lclient!gk;")
	public Class51_Sub2 aClass51_Sub2_16 = new Class51_Sub2();

	@OriginalMember(owner = "client!ij", name = "ge", descriptor = "Lclient!gk;")
	public final Class51_Sub2 aClass51_Sub2_17 = new Class51_Sub2();

	@OriginalMember(owner = "client!ij", name = "he", descriptor = "Lclient!gk;")
	protected final Class51_Sub2 aClass51_Sub2_18 = new Class51_Sub2();

	@OriginalMember(owner = "client!ij", name = "ie", descriptor = "Lclient!gk;")
	private final Class51_Sub2 aClass51_Sub2_19 = new Class51_Sub2();

	@OriginalMember(owner = "client!ij", name = "je", descriptor = "Lclient!gk;")
	private final Class51_Sub2 aClass51_Sub2_20 = new Class51_Sub2();

	@OriginalMember(owner = "client!ij", name = "qe", descriptor = "[F")
	public final float[] aFloatArray90 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!ij", name = "Ke", descriptor = "F")
	public float aFloat197 = -1.0F;

	@OriginalMember(owner = "client!ij", name = "Ee", descriptor = "F")
	private float aFloat195 = 1.0F;

	@OriginalMember(owner = "client!ij", name = "we", descriptor = "[F")
	public final float[] aFloatArray91 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ij", name = "Ue", descriptor = "F")
	public float aFloat199 = 1.0F;

	@OriginalMember(owner = "client!ij", name = "Xe", descriptor = "I")
	protected final int anInt9732 = 0;

	@OriginalMember(owner = "client!ij", name = "Be", descriptor = "Lclient!eo;")
	protected Class101 aClass101_10 = Static415.aClass101_7;

	@OriginalMember(owner = "client!ij", name = "Ze", descriptor = "I")
	protected int anInt9733 = 0;

	@OriginalMember(owner = "client!ij", name = "De", descriptor = "Z")
	protected boolean aBoolean687 = false;

	@OriginalMember(owner = "client!ij", name = "bf", descriptor = "Z")
	protected boolean bf = true;

	@OriginalMember(owner = "client!ij", name = "Qe", descriptor = "Z")
	protected boolean aBoolean690 = false;

	@OriginalMember(owner = "client!ij", name = "nf", descriptor = "Z")
	protected boolean aBoolean694 = false;

	@OriginalMember(owner = "client!ij", name = "ue", descriptor = "I")
	private int anInt9725 = 16777215;

	@OriginalMember(owner = "client!ij", name = "cf", descriptor = "I")
	protected int anInt9734 = 0;

	@OriginalMember(owner = "client!ij", name = "xe", descriptor = "F")
	public float aFloat191 = 3584.0F;

	@OriginalMember(owner = "client!ij", name = "kf", descriptor = "[Lclient!gda;")
	private final Class18[] aClass18Array3 = new Class18[10];

	@OriginalMember(owner = "client!ij", name = "Ae", descriptor = "F")
	public float aFloat193 = 1.0F;

	@OriginalMember(owner = "client!ij", name = "ke", descriptor = "F")
	public float aFloat188 = 3584.0F;

	@OriginalMember(owner = "client!ij", name = "df", descriptor = "[F")
	private final float[] aFloatArray95 = new float[16];

	@OriginalMember(owner = "client!ij", name = "mf", descriptor = "I")
	public int anInt9738 = 3;

	@OriginalMember(owner = "client!ij", name = "Te", descriptor = "I")
	private int anInt9730 = -1;

	@OriginalMember(owner = "client!ij", name = "Ne", descriptor = "[F")
	private final float[] aFloatArray93 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ij", name = "Se", descriptor = "I")
	private int anInt9729 = -1;

	@OriginalMember(owner = "client!ij", name = "pf", descriptor = "I")
	private int anInt9740 = -1;

	@OriginalMember(owner = "client!ij", name = "Kf", descriptor = "I")
	protected int anInt9749 = 3584;

	@OriginalMember(owner = "client!ij", name = "pe", descriptor = "I")
	public int anInt9723 = 50;

	@OriginalMember(owner = "client!ij", name = "Bf", descriptor = "I")
	private int anInt9745 = 0;

	@OriginalMember(owner = "client!ij", name = "If", descriptor = "I")
	public int anInt9747 = 0;

	@OriginalMember(owner = "client!ij", name = "sf", descriptor = "I")
	public int anInt9742 = 512;

	@OriginalMember(owner = "client!ij", name = "Pe", descriptor = "I")
	private int anInt9728 = 0;

	@OriginalMember(owner = "client!ij", name = "Fe", descriptor = "Z")
	private boolean aBoolean688 = false;

	@OriginalMember(owner = "client!ij", name = "gf", descriptor = "I")
	public int anInt9735 = 0;

	@OriginalMember(owner = "client!ij", name = "Me", descriptor = "I")
	protected int anInt9727 = 0;

	@OriginalMember(owner = "client!ij", name = "Hf", descriptor = "Z")
	private boolean aBoolean697 = false;

	@OriginalMember(owner = "client!ij", name = "Lf", descriptor = "[F")
	private final float[] aFloatArray96 = new float[16];

	@OriginalMember(owner = "client!ij", name = "Gf", descriptor = "Z")
	protected boolean aBoolean696 = true;

	@OriginalMember(owner = "client!ij", name = "Cf", descriptor = "I")
	protected int anInt9746 = 0;

	@OriginalMember(owner = "client!ij", name = "Of", descriptor = "Z")
	private boolean aBoolean698 = false;

	@OriginalMember(owner = "client!ij", name = "ze", descriptor = "I")
	public int anInt9726 = -1;

	@OriginalMember(owner = "client!ij", name = "Ff", descriptor = "F")
	public float aFloat203 = 1.0F;

	@OriginalMember(owner = "client!ij", name = "tf", descriptor = "I")
	public int anInt9743 = -1;

	@OriginalMember(owner = "client!ij", name = "ne", descriptor = "Z")
	protected boolean aBoolean684 = true;

	@OriginalMember(owner = "client!ij", name = "Yf", descriptor = "Z")
	protected boolean aBoolean699 = true;

	@OriginalMember(owner = "client!ij", name = "ag", descriptor = "Z")
	protected boolean aBoolean700 = true;

	@OriginalMember(owner = "client!ij", name = "Re", descriptor = "Z")
	private boolean aBoolean691 = false;

	@OriginalMember(owner = "client!ij", name = "Ve", descriptor = "[F")
	private final float[] aFloatArray94 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ij", name = "bg", descriptor = "[F")
	private final float[] aFloatArray98 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ij", name = "zf", descriptor = "F")
	public float aFloat202 = 1.0F;

	@OriginalMember(owner = "client!ij", name = "Rf", descriptor = "I")
	private int anInt9752 = 1;

	@OriginalMember(owner = "client!ij", name = "ef", descriptor = "Lclient!bda;")
	protected Class32 aClass32_7 = Static275.aClass32_4;

	@OriginalMember(owner = "client!ij", name = "Pf", descriptor = "I")
	public int anInt9751 = 512;

	@OriginalMember(owner = "client!ij", name = "Uf", descriptor = "I")
	private int anInt9754 = 0;

	@OriginalMember(owner = "client!ij", name = "Sf", descriptor = "F")
	public float aFloat204 = -1.0F;

	@OriginalMember(owner = "client!ij", name = "Jf", descriptor = "I")
	protected final int anInt9748 = 0;

	@OriginalMember(owner = "client!ij", name = "Xf", descriptor = "I")
	protected int anInt9755 = 0;

	@OriginalMember(owner = "client!ij", name = "eg", descriptor = "Z")
	private boolean aBoolean701 = false;

	@OriginalMember(owner = "client!ij", name = "Mf", descriptor = "I")
	public int anInt9750 = 8;

	@OriginalMember(owner = "client!ij", name = "af", descriptor = "Z")
	private boolean aBoolean692 = false;

	@OriginalMember(owner = "client!ij", name = "uf", descriptor = "I")
	public int anInt9744 = 128;

	@OriginalMember(owner = "client!ij", name = "Je", descriptor = "[F")
	protected float[] aFloatArray92 = this.aFloatArray94;

	@OriginalMember(owner = "client!ij", name = "se", descriptor = "I")
	private int anInt9724 = 0;

	@OriginalMember(owner = "client!ij", name = "Qf", descriptor = "[F")
	private final float[] aFloatArray97 = new float[16];

	@OriginalMember(owner = "client!ij", name = "le", descriptor = "Z")
	protected boolean aBoolean683 = false;

	@OriginalMember(owner = "client!ij", name = "hg", descriptor = "I")
	public int anInt9761 = 0;

	@OriginalMember(owner = "client!ij", name = "Ye", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream5 = new Stream();

	@OriginalMember(owner = "client!ij", name = "Bg", descriptor = "Lclient!gk;")
	private final Class51_Sub2 aClass51_Sub2_21 = new Class51_Sub2();

	@OriginalMember(owner = "client!ij", name = "zd", descriptor = "Ljava/lang/Object;")
	protected final Object anObject25;

	@OriginalMember(owner = "client!ij", name = "J", descriptor = "Ljava/lang/Object;")
	private Object anObject24;

	@OriginalMember(owner = "client!ij", name = "Hb", descriptor = "Lclient!nd;")
	protected final Class238 aClass238_272;

	@OriginalMember(owner = "client!ij", name = "Sc", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas12;

	@OriginalMember(owner = "client!ij", name = "jc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!ij", name = "dg", descriptor = "I")
	protected final int anInt9758;

	@OriginalMember(owner = "client!ij", name = "fg", descriptor = "I")
	public final int anInt9759;

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
	private int anInt9544;

	@OriginalMember(owner = "client!ij", name = "Bb", descriptor = "I")
	public int anInt9598;

	@OriginalMember(owner = "client!ij", name = "wb", descriptor = "I")
	private int anInt9593;

	@OriginalMember(owner = "client!ij", name = "yc", descriptor = "I")
	public int anInt9644;

	@OriginalMember(owner = "client!ij", name = "Le", descriptor = "Lclient!aba;")
	private final Class4 aClass4_3;

	@OriginalMember(owner = "client!ij", name = "bb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!nd;II)V")
	protected Class13_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) Class238 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anObject24 = this.anObject25 = arg1;
			this.aClass238_272 = arg3;
			this.aCanvas11 = this.aCanvas12 = arg0;
			this.anInt9758 = arg4;
			@Pc(305) Dimension local305 = arg0.getSize();
			this.anInt9759 = arg5;
			this.anInt9598 = this.anInt9544 = local305.width;
			this.anInt9644 = this.anInt9593 = local305.height;
			Static187.method3201(true, false);
			if (super.anInterface2_12 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt9759);
				this.aClass4_3 = null;
			} else {
				this.aClass4_3 = new Class4(this, super.anInterface2_12);
				this.aNativeInterface3 = new NativeInterface(super.anInterface2_12.method6025(), this.anInt9759);
				for (@Pc(350) int local350 = 0; local350 < super.anInterface2_12.method6025(); local350++) {
					@Pc(357) Class271 local357 = super.anInterface2_12.method6027(local350);
					if (local357 != null) {
						this.aNativeInterface3.initTextureMetrics(local350, local357.aByte92, local357.aByte91);
					}
				}
			}
		} catch (@Pc(388) Throwable local388) {
			local388.printStackTrace();
			this.method8117();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIZLclient!et;[B)Lclient!wk;")
	protected abstract Interface27 method8171(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) boolean arg2, @OriginalArg(6) Class104 arg3, @OriginalArg(7) byte[] arg4);

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
	protected abstract void method8172();

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "(I)Lclient!gk;")
	public final Class51_Sub2 method8173() {
		return this.aClass51_Sub2_19;
	}

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "(I)V")
	private void method8174() {
		if (this.aBoolean698) {
			return;
		}
		@Pc(11) float[] local11 = this.aFloatArray95;
		@Pc(15) float local15 = (float) this.anInt9723;
		@Pc(19) float local19 = (float) this.anInt9749;
		@Pc(31) float local31 = (float) -this.anInt9735 * this.aFloat195 / (float) this.anInt9742;
		@Pc(43) float local43 = (float) -this.anInt9761 * this.aFloat195 / (float) this.anInt9751;
		@Pc(58) float local58 = this.aFloat195 * (float) (this.anInt9598 - this.anInt9761) / (float) this.anInt9751;
		@Pc(73) float local73 = this.aFloat195 * (float) (this.anInt9644 - this.anInt9735) / (float) this.anInt9742;
		if (local58 == local43 || local31 == local73) {
			local11[6] = 0.0F;
			local11[15] = 1.0F;
			local11[12] = 0.0F;
			local11[14] = 0.0F;
			local11[11] = 0.0F;
			local11[13] = 0.0F;
			local11[2] = 0.0F;
			local11[1] = 0.0F;
			local11[5] = 1.0F;
			local11[9] = 0.0F;
			local11[10] = 1.0F;
			local11[3] = 0.0F;
			local11[8] = 0.0F;
			local11[4] = 0.0F;
			local11[0] = 1.0F;
			local11[7] = 0.0F;
		} else {
			local11[5] = 2.0F / (local73 - local31);
			local11[3] = 0.0F;
			local11[8] = 0.0F;
			local11[4] = 0.0F;
			local11[14] = local15 / (local15 - local19);
			local11[7] = 0.0F;
			local11[9] = 0.0F;
			local11[0] = 2.0F / (local58 - local43);
			local11[15] = 1.0F;
			local11[13] = (local31 + local73) / (-local31 + local73);
			local11[1] = 0.0F;
			local11[2] = 0.0F;
			local11[10] = 1.0F / (local15 - local19);
			local11[6] = 0.0F;
			local11[12] = (local43 + local58) / (-local58 + local43);
			local11[11] = 0.0F;
		}
		this.method8296();
		this.aBoolean698 = true;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZI)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method8175(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap5.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "(I)V")
	private void method8176() {
		if (this.aBoolean692) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray96;
		this.aBoolean692 = true;
		if (this.anInt9598 != 0 && this.anInt9644 != 0) {
			local9[14] = 0.5F;
			local9[1] = 0.0F;
			local9[9] = 0.0F;
			local9[4] = 0.0F;
			local9[15] = 1.0F;
			local9[7] = 0.0F;
			local9[11] = 0.0F;
			local9[12] = -1.0F;
			local9[0] = 2.0F / (float) this.anInt9598;
			local9[6] = 0.0F;
			local9[3] = 0.0F;
			local9[5] = -2.0F / (float) this.anInt9644;
			local9[13] = 1.0F;
			local9[2] = 0.0F;
			local9[8] = 0.0F;
			local9[10] = 0.5F;
			return;
		}
		local9[4] = 0.0F;
		local9[10] = 1.0F;
		local9[2] = 0.0F;
		local9[7] = 0.0F;
		local9[1] = 0.0F;
		local9[8] = 0.0F;
		local9[11] = 0.0F;
		local9[3] = 0.0F;
		local9[15] = 1.0F;
		local9[0] = 1.0F;
		local9[5] = 1.0F;
		local9[9] = 0.0F;
		local9[12] = 0.0F;
		local9[13] = 0.0F;
		local9[6] = 0.0F;
		local9[14] = 0.0F;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	protected abstract void method8177(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8131(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas12 == arg0) {
			local5 = this.anObject24;
		} else if (this.aHashtable6.containsKey(arg0)) {
			local5 = this.aHashtable6.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method8248(arg0, local5);
		if (arg0 == this.aCanvas11) {
			this.method8268();
		}
	}

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass51_Sub2_16.aFloat73 * (float) arg1 + this.aClass51_Sub2_16.aFloat74 * (float) arg0 + this.aClass51_Sub2_16.aFloat78 * (float) arg2 + this.aClass51_Sub2_16.aFloat79;
		@Pc(57) float local57 = (float) arg5 * this.aClass51_Sub2_16.aFloat78 + (float) arg4 * this.aClass51_Sub2_16.aFloat73 + (float) arg3 * this.aClass51_Sub2_16.aFloat74 + this.aClass51_Sub2_16.aFloat79;
		if (local32 < (float) this.anInt9723 && local57 < (float) this.anInt9723) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt9749 && (float) this.anInt9749 < local57) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt9751 * ((float) arg0 * this.aClass51_Sub2_16.aFloat68 + (float) arg1 * this.aClass51_Sub2_16.aFloat76 + (float) arg2 * this.aClass51_Sub2_16.aFloat70 + this.aClass51_Sub2_16.aFloat75) / (float) arg6);
		@Pc(157) int local157 = (int) (((float) arg4 * this.aClass51_Sub2_16.aFloat76 + (float) arg3 * this.aClass51_Sub2_16.aFloat68 + this.aClass51_Sub2_16.aFloat70 * (float) arg5 + this.aClass51_Sub2_16.aFloat75) * (float) this.anInt9751 / (float) arg6);
		if (this.aFloat190 > (float) local124 && (float) local157 < this.aFloat190) {
			local7 |= 0x1;
		} else if (this.aFloat198 < (float) local124 && this.aFloat198 < (float) local157) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt9742 * (this.aClass51_Sub2_16.aFloat71 * (float) arg2 + this.aClass51_Sub2_16.aFloat77 * (float) arg1 + (float) arg0 * this.aClass51_Sub2_16.aFloat72 + this.aClass51_Sub2_16.aFloat69) / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass51_Sub2_16.aFloat69 + (float) arg5 * this.aClass51_Sub2_16.aFloat71 + this.aClass51_Sub2_16.aFloat77 * (float) arg4 + this.aClass51_Sub2_16.aFloat72 * (float) arg3) * (float) this.anInt9742 / (float) arg6);
		if ((float) local224 < this.aFloat201 && (float) local257 < this.aFloat201) {
			local7 |= 0x4;
		} else if ((float) local224 > this.aFloat194 && (float) local257 > this.aFloat194) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "(I)V")
	private void method8178() {
		this.method8192(0, this.anInterface10_15);
		this.method8243(this.aClass258_19);
		this.method8211(Static184.aClass191_1, 1, 0);
	}

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "()Z")
	@Override
	public final boolean method8142() {
		return true;
	}

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "(I)V")
	private void method8179() {
		if (this.aClass18_3 != null) {
			this.aClass18_3.method8635();
		}
		this.method8274();
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)Lclient!gk;")
	public final Class51_Sub2 method8181() {
		return this.aClass51_Sub2Array3[this.anInt9746];
	}

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "(I)V")
	private void method8182() {
		this.aFloat198 = (float) (this.anInt9755 - this.anInt9761);
		this.aFloat190 = (float) (this.anInt9733 - this.anInt9761);
		this.aFloat194 = (float) (this.anInt9734 - this.anInt9735);
		this.aFloat201 = (float) (this.anInt9727 - this.anInt9735);
	}

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "(I)V")
	private void method8183() {
		if (this.aClass101_10 == Static328.aClass101_5) {
			return;
		}
		@Pc(10) Class101 local10 = this.aClass101_10;
		this.aClass101_10 = Static328.aClass101_5;
		if (local10.method2511()) {
			this.method8304();
		}
		this.method8176();
		this.aFloatArray92 = this.aFloatArray96;
		this.method8245();
		this.anInt9739 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ij", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat202) {
			this.aFloat202 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method8242();
			this.method8276();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)V")
	public final void method8184(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean685) {
			this.aBoolean685 = arg0;
			this.method8215();
			this.anInt9739 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ij", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9733;
		arg0[3] = this.anInt9734;
		arg0[2] = this.anInt9755;
		arg0[1] = this.anInt9727;
	}

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "()Z")
	@Override
	public final boolean method8147() {
		return this.aBoolean689;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V")
	protected void method8186() {
		this.anInt9756 = this.anInt9731;
		this.anInt9731 = 0;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(Z)[F")
	public final float[] method8187() {
		return this.aFloatArray94;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!jv;Lclient!iaa;ZII)V")
	public abstract void method8188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class191 arg2, @OriginalArg(3) Interface11 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!bp;Z)V")
	protected abstract void method8189(@OriginalArg(1) int arg0, @OriginalArg(2) Class43 arg1);

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)Lclient!nn;")
	public final Interface19 method8190() {
		return this.aClass49_Sub2_3 == null ? null : this.aClass49_Sub2_3.method8441();
	}

	@OriginalMember(owner = "client!ij", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8090(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(B)V")
	private void method8191() {
		this.aFloatArray97[10] = this.aFloat200;
		this.aFloatArray97[14] = this.aFloat189;
		this.aFloat191 = ((float) -this.anInt9749 + this.aFloatArray97[14]) / this.aFloatArray97[10];
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!ia;B)V")
	public abstract void method8192(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method8125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static298.method4712(arg3, arg1, this, arg0, arg2);
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(Z)Lclient!gk;")
	public final Class51_Sub2 method8193() {
		return this.aClass51_Sub2_15;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V")
	public final void method8194(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean683 != arg0) {
			this.aBoolean683 = arg0;
			this.method8254();
			this.anInt9739 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ij", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg2 * this.aClass51_Sub2_16.aFloat78 + (float) arg1 * this.aClass51_Sub2_16.aFloat73 + (float) arg0 * this.aClass51_Sub2_16.aFloat74 + this.aClass51_Sub2_16.aFloat79;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass51_Sub2_16.aFloat78 * (float) arg5 + (float) arg3 * this.aClass51_Sub2_16.aFloat74 + this.aClass51_Sub2_16.aFloat73 * (float) arg4 + this.aClass51_Sub2_16.aFloat79;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt9723 > local32 && local63 < (float) this.anInt9723) {
			local7 |= 0x10;
		} else if ((float) this.anInt9749 < local32 && local63 > (float) this.anInt9749) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt9751 * (this.aClass51_Sub2_16.aFloat75 + this.aClass51_Sub2_16.aFloat68 * (float) arg0 + this.aClass51_Sub2_16.aFloat76 * (float) arg1 + this.aClass51_Sub2_16.aFloat70 * (float) arg2) / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt9751 * (this.aClass51_Sub2_16.aFloat75 + (float) arg5 * this.aClass51_Sub2_16.aFloat70 + (float) arg4 * this.aClass51_Sub2_16.aFloat76 + (float) arg3 * this.aClass51_Sub2_16.aFloat68) / local63);
		if ((float) local135 < this.aFloat190 && this.aFloat190 > (float) local167) {
			local7 |= 0x1;
		} else if (this.aFloat198 < (float) local135 && this.aFloat198 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt9742 * (this.aClass51_Sub2_16.aFloat69 + this.aClass51_Sub2_16.aFloat72 * (float) arg0 + (float) arg1 * this.aClass51_Sub2_16.aFloat77 + (float) arg2 * this.aClass51_Sub2_16.aFloat71) / local32);
		@Pc(265) int local265 = (int) (((float) arg3 * this.aClass51_Sub2_16.aFloat72 + this.aClass51_Sub2_16.aFloat77 * (float) arg4 + this.aClass51_Sub2_16.aFloat71 * (float) arg5 + this.aClass51_Sub2_16.aFloat69) * (float) this.anInt9742 / local63);
		if (this.aFloat201 > (float) local233 && (float) local265 < this.aFloat201) {
			local7 |= 0x4;
		} else if (this.aFloat194 < (float) local233 && this.aFloat194 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method8158(@OriginalArg(0) Class2_Sub40 arg0) {
		this.aNativeHeap5 = ((Class2_Sub40_Sub1) arg0).aNativeHeap3;
		this.aNativeHeapBuffer8 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(B)V")
	private void method8195() {
		this.aBoolean692 = false;
		if (this.aClass101_10 == Static328.aClass101_5) {
			this.method8176();
			this.method8245();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!et;Lclient!wha;Z)Z")
	public abstract boolean method8196(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class381 arg1);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZIIZ)V")
	private void method8197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) boolean local4 = arg4 & this.method8121();
		if (!local4 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg0 = 1;
			arg3 = 0;
		}
		if (arg1 != 0 && arg2) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt9754 != arg1) {
			if (this.anInt9754 != 0) {
				this.aClass18Array3[this.anInt9754 & Integer.MAX_VALUE].method8642();
			}
			if (arg1 == 0) {
				this.aClass18_3 = null;
			} else {
				this.aClass18_3 = this.aClass18Array3[arg1 & Integer.MAX_VALUE];
				this.aClass18_3.method8632(arg2);
				this.aClass18_3.method8637(arg2);
				this.aClass18_3.method8641(arg3, arg0);
			}
			this.anInt9724 = arg3;
			this.anInt9745 = arg0;
			this.anInt9754 = arg1;
		} else if (this.anInt9754 != 0) {
			this.aClass18Array3[Integer.MAX_VALUE & this.anInt9754].method8637(arg2);
			if (arg3 != this.anInt9724 || this.anInt9745 != arg0) {
				this.aClass18Array3[this.anInt9754 & Integer.MAX_VALUE].method8641(arg3, arg0);
				this.anInt9724 = arg3;
				this.anInt9745 = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([BLclient!et;IIZI)Lclient!wk;")
	public final Interface27 method8198(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return this.method8171(arg3, arg2, arg4, arg1, arg0);
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt9723 && arg1 == this.anInt9749) {
			return;
		}
		this.anInt9723 = arg0;
		this.anInt9749 = arg1;
		this.method8266();
		this.method8250();
		this.method8179();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z[IIBIII)Lclient!wk;")
	public abstract Interface27 method8199(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZZ)Lclient!ia;")
	public abstract Interface10 method8200(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "(B)V")
	protected abstract void method8201();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class91 method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class91_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "(I)V")
	public final void method8202() {
		this.aClass51_Sub2Array3 = new Class51_Sub2[this.anInt9722];
		this.aClass269Array5 = new Class269[this.anInt9722];
		this.aClass269Array6 = new Class269[this.anInt9722];
		this.aClass100Array3 = new Class100[this.anInt9722];
		this.anInterface6Array3 = new Interface6[this.anInt9722];
		for (@Pc(30) int local30 = 0; local30 < this.anInt9722; local30++) {
			this.aClass269Array6[local30] = Static259.aClass269_4;
			this.aClass269Array5[local30] = Static259.aClass269_4;
			this.aClass100Array3[local30] = Static461.aClass100_4;
			this.aClass51_Sub2Array3[local30] = new Class51_Sub2();
		}
		this.aClass2_Sub12Array5 = new Class2_Sub12[this.anInt9737 - 2];
		this.anInterface6_3 = this.method8264(Static638.aClass381_15, 1, 1, Static78.aClass104_3);
		this.method8158(new Class2_Sub40_Sub1(262144));
		this.aClass258_17 = this.method8292(new Class118[] { new Class118(new Class371[] { Static622.aClass371_1, Static622.aClass371_5 }) });
		this.aClass258_23 = this.method8292(new Class118[] { new Class118(new Class371[] { Static622.aClass371_1, Static622.aClass371_3 }) });
		this.aClass258_20 = this.method8292(new Class118[] { new Class118(Static622.aClass371_1), new Class118(Static622.aClass371_3), new Class118(Static622.aClass371_5), new Class118(Static622.aClass371_2) });
		this.aClass258_21 = this.method8292(new Class118[] { new Class118(Static622.aClass371_1), new Class118(Static622.aClass371_3), new Class118(Static622.aClass371_5) });
		this.aClass193_Sub2_26 = new Class193_Sub2(this, 0, 0, false, false);
		this.aClass193_Sub2_22 = new Class193_Sub2(this, 0, 0, true, true);
		this.aClass193_Sub2_21 = new Class193_Sub2(this, 0, 0, false, false);
		this.aClass193_Sub2_23 = new Class193_Sub2(this, 0, 0, true, true);
		this.aClass193_Sub2_30 = new Class193_Sub2(this, 0, 0, false, false);
		this.aClass193_Sub2_25 = new Class193_Sub2(this, 0, 0, true, true);
		this.aClass193_Sub2_27 = new Class193_Sub2(this, 0, 0, false, false);
		this.aClass193_Sub2_29 = new Class193_Sub2(this, 0, 0, true, true);
		this.aClass193_Sub2_24 = new Class193_Sub2(this, 0, 0, false, false);
		this.aClass193_Sub2_28 = new Class193_Sub2(this, 0, 0, true, true);
		this.aClass107_3 = new Class107(this);
		this.anInterface11_7 = this.method8288(true);
		this.method8236();
		this.aClass334_8 = new Class334(this);
		this.aClass18Array3[1] = this.method8278(1);
		this.aClass18Array3[2] = this.method8278(2);
		this.aClass18Array3[4] = this.method8278(4);
		this.aClass18Array3[5] = this.method8278(5);
		this.aClass18Array3[6] = this.method8278(6);
		this.aClass18Array3[7] = this.method8278(7);
		this.aClass18Array3[3] = this.method8278(3);
		this.aClass18Array3[8] = this.method8278(8);
		this.aClass18Array3[9] = this.method8278(9);
		if (!this.aClass18Array3[2].method8643()) {
			this.aClass18Array3[2] = this.method8278(0);
		}
		if (!this.aClass18Array3[4].method8643()) {
			this.aClass18Array3[4] = this.aClass18Array3[2];
		}
		if (!this.aClass18Array3[8].method8643()) {
			this.aClass18Array3[8] = this.aClass18Array3[4];
		}
		if (!this.aClass18Array3[9].method8643()) {
			this.aClass18Array3[9] = this.aClass18Array3[8];
		}
		this.method8227();
		this.la();
		this.method8118();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!jv;I)V")
	private void method8203(@OriginalArg(1) Class191 arg0, @OriginalArg(2) int arg1) {
		this.method8192(0, this.anInterface10_16);
		this.method8243(this.aClass258_18);
		this.method8211(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "(II)V")
	public final void method8204(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method8235(Static408.aClass269_3, Static408.aClass269_3);
		} else if (arg0 == 0) {
			this.method8235(Static259.aClass269_4, Static259.aClass269_4);
		} else if (arg0 == 2) {
			this.method8235(Static398.aClass269_5, Static408.aClass269_3);
		} else if (arg0 == 3) {
			this.method8235(Static26.aClass269_1, Static259.aClass269_4);
		} else if (arg0 == 4) {
			this.method8235(Static414.aClass269_6, Static414.aClass269_6);
			return;
		}
	}

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "(I)V")
	private void method8205() {
		this.method8249();
		if (this.aClass18_3 != null) {
			this.aClass18_3.method8639();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!mg;I)V")
	public abstract void method8206(@OriginalArg(0) Class222 arg0);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BZ)V")
	public final void method8207(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean699 != arg0) {
			this.aBoolean699 = arg0;
			this.method8215();
		}
	}

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "(I)V")
	protected abstract void method8208();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!et;ZI[FIZ)Lclient!wk;")
	protected abstract Interface27 method8209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) float[] arg4);

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "(I)V")
	protected abstract void method8210();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!jv;III)V")
	public abstract void method8211(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean700 = arg0;
		this.method8240();
	}

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "(II)V")
	public final void method8212(@OriginalArg(0) int arg0) {
		if (this.anInt9757 != arg0) {
			this.anInt9757 = arg0;
			this.method8259();
		}
	}

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "(B)Lclient!gk;")
	public final Class51_Sub2 method8213() {
		return this.aClass51_Sub2_18;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8146(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas12) {
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
			@Pc(53) Object local53 = this.method8303(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "(B)V")
	protected abstract void method8214();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[Lclient!laa;)V")
	@Override
	public final void method8102(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass2_Sub12Array5[local3] = arg1[local3];
		}
		this.anInt9731 = arg0;
		if (this.aClass101_10.method2511()) {
			this.method8186();
		}
	}

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "(B)V")
	protected abstract void method8215();

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "(I)V")
	protected abstract void method8216();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!en;)V")
	public final void method8217(@OriginalArg(1) Class100 arg0) {
		this.aClass100Array3[this.anInt9746] = arg0;
		this.method8205();
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(IZ)V")
	public final void method8218(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean687 != arg0) {
			this.aBoolean687 = arg0;
			this.method8240();
			this.anInt9739 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "(I)I")
	public final int method8219() {
		return this.anInt9746;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(FIFFFFF)Z")
	private boolean method8220(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(19) Buffer local19 = this.anInterface10_15.method8449();
		if (local19 == null) {
			return false;
		}
		@Pc(28) Stream local28 = this.method8260(local19);
		if (Stream.c()) {
			local28.b(arg1);
			local28.b(arg4);
			local28.b(arg0);
			local28.b(arg5);
			local28.b(arg2);
			local28.b(arg3);
		} else {
			local28.a(arg1);
			local28.a(arg4);
			local28.a(arg0);
			local28.a(arg5);
			local28.a(arg2);
			local28.a(arg3);
		}
		local28.b();
		return this.anInterface10_15.method8448();
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(BZ)V")
	public final void method8221(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean696 != arg0) {
			this.aBoolean696 = arg0;
			this.method8246();
		}
	}

	@OriginalMember(owner = "client!ij", name = "x", descriptor = "(I)I")
	public final int method8222() {
		return this.anInt9760;
	}

	@OriginalMember(owner = "client!ij", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9729 = arg2;
		this.aBoolean693 = true;
		this.anInt9760 = arg0;
		this.anInt9730 = arg1;
		this.anInt9728 = arg3;
	}

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "(I)V")
	public final void method8223() {
		if (this.anInt9739 == 8) {
			return;
		}
		this.method8265();
		this.method8184(true);
		this.method8194(true);
		this.method8218(true);
		this.method8306(1);
		this.anInt9739 = 8;
	}

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "(I)V")
	private void method8224() {
		if (Static328.aClass101_5 == this.aClass101_10) {
			@Pc(11) float local11 = this.method8299();
			this.aClass51_Sub2_15.method3232(0.0F, local11, local11);
		}
		this.aBoolean701 = false;
		this.method8226();
		if (this.aClass18_3 != null) {
			this.aClass18_3.method8634();
		}
	}

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "(I)V")
	protected abstract void method8225();

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "(B)V")
	protected abstract void method8226();

	@OriginalMember(owner = "client!ij", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass51_Sub2_16.method3242((float) arg2, (float) arg1, (float) arg0);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt9751 * this.aClass51_Sub2_16.method3249((float) arg1, (float) arg0, (float) arg2) / local14);
			local58 = (int) ((float) this.anInt9742 * this.aClass51_Sub2_16.method3237((float) arg2, (float) arg1, (float) arg0) / local14);
		} else {
			local58 = this.anInt9735;
			local40 = this.anInt9761;
		}
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local40 - this.aFloat190);
		arg3[1] = (int) ((float) local58 - this.aFloat201);
	}

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "()Z")
	@Override
	public final boolean method8145() {
		return true;
	}

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "()Z")
	@Override
	public final boolean method8134() {
		return false;
	}

	@OriginalMember(owner = "client!ij", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean693) {
			throw new RuntimeException("");
		}
		this.anInt9728 = arg3;
		this.anInt9729 = arg2;
		this.anInt9730 = arg1;
		this.anInt9760 = arg0;
		if (this.aBoolean691) {
			this.aClass18Array3[3].method8638();
			this.aClass18Array3[3].method8635();
		}
	}

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "(I)V")
	protected void method8227() {
		this.method8258();
	}

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "(I)V")
	public final void method8228() {
		if (this.anInt9739 == 2) {
			return;
		}
		this.method8183();
		this.method8184(false);
		this.method8302(false);
		this.method8194(false);
		this.method8218(false);
		this.method8261(false, false, -2);
		this.anInt9739 = 2;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[BIILclient!et;I)Lclient!aga;")
	public abstract Interface1 method8229(@OriginalArg(1) byte[] arg0, @OriginalArg(4) Class104 arg1);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method8090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		if (local10 == 0.0F && local17 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(38) float local38 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local10 * local10)));
			local10 *= local38;
			local17 *= local38;
		}
		if (!this.method8220(0.0F, (float) arg0, (float) arg3 + local17, 0.0F, (float) arg1, (float) arg2 + local10)) {
			return;
		}
		this.method8297();
		this.method8212(arg4);
		this.method8231(Static470.aClass43_5, 0);
		this.method8279(Static470.aClass43_5, 0);
		this.method8306(arg5);
		this.method8241();
		this.method8247(false);
		this.method8178();
		this.method8247(true);
		this.method8279(Static338.aClass43_3, 0);
		this.method8231(Static338.aClass43_3, 0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
	public final void method8230(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt9746) {
			this.anInt9746 = arg0;
			this.method8172();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!fl;I)V")
	@Override
	public final void method8165(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1) {
		this.aClass107_3.method2616(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "()Lclient!pda;")
	@Override
	public final Class51 method8137() {
		return new Class51_Sub2();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!bp;BI)V")
	public final void method8231(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1) {
		this.method8277(false, false, arg0, arg1);
	}

	@OriginalMember(owner = "client!ij", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt9743 && arg1 == this.anInt9726 && this.anInt9747 == arg2) {
			return;
		}
		this.anInt9747 = arg2;
		this.anInt9743 = arg0;
		this.anInt9726 = arg1;
		this.method8179();
		this.method8215();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!fl;)V")
	@Override
	public final void method8101(@OriginalArg(0) Class119 arg0) {
		this.aClass107_3.method2616(this, -1, arg0);
	}

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "(I)V")
	protected abstract void method8233();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!fe;)V")
	public final void method8234(@OriginalArg(1) Interface6 arg0) {
		if (this.anInterface6Array3[this.anInt9746] == arg0) {
			return;
		}
		this.anInterface6Array3[this.anInt9746] = arg0;
		if (arg0 == null) {
			this.method8271();
		} else {
			arg0.method8817();
		}
		this.anInt9739 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!pfa;Lclient!pfa;B)V")
	public final void method8235(@OriginalArg(0) Class269 arg0, @OriginalArg(1) Class269 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg0 != this.aClass269Array5[this.anInt9746]) {
			this.aClass269Array5[this.anInt9746] = arg0;
			this.method8237();
			local5 = true;
		}
		if (arg1 != this.aClass269Array6[this.anInt9746]) {
			this.aClass269Array6[this.anInt9746] = arg1;
			this.method8225();
			local5 = true;
		}
		if (local5) {
			this.anInt9739 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "(B)V")
	protected final void method8236() {
		@Pc(7) Hashtable local7 = new Hashtable();
		if (this.aHashtable6 != null && !this.aHashtable6.isEmpty()) {
			@Pc(18) Enumeration local18 = this.aHashtable6.keys();
			while (local18.hasMoreElements()) {
				@Pc(23) Canvas local23 = (Canvas) local18.nextElement();
				local7.put(local23, this.method8303(local23));
			}
		}
		this.aHashtable6 = local7;
		this.method8282();
		this.method8267();
		this.method8252();
		this.aClass107_3.method2615(this);
	}

	@OriginalMember(owner = "client!ij", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method8297();
		this.method8212(arg4);
		this.method8231(Static470.aClass43_5, 0);
		this.method8279(Static470.aClass43_5, 0);
		this.method8306(arg5);
		this.aClass51_Sub2_15.method3247((float) arg2, (float) arg3, 1.0F);
		this.aClass51_Sub2_15.method6711(arg0, arg1, 0);
		this.method8290();
		this.method8247(false);
		this.method8301();
		this.method8247(true);
		this.method8279(Static338.aClass43_3, 0);
		this.method8231(Static338.aClass43_3, 0);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "()I")
	@Override
	public final int method8089() {
		return this.anInt9737 - 2;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!hb;Z)Lclient!iea;")
	@Override
	public final Class31 method8141(@OriginalArg(0) Class139 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(24) Class31 local24;
		if (arg0.anInt3984 == 0 || arg0.anInt3983 == 0) {
			local24 = this.method8088(1, 1, new int[1], 1);
		} else {
			@Pc(33) int[] local33 = new int[arg0.anInt3983 * arg0.anInt3984];
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			@Pc(42) int local42;
			@Pc(46) int local46;
			if (arg0.aByteArray31 == null) {
				for (local42 = 0; local42 < arg0.anInt3983; local42++) {
					for (local46 = 0; local46 < arg0.anInt3984; local46++) {
						@Pc(59) int local59 = arg0.anIntArray261[arg0.aByteArray32[local35++] & 0xFF];
						local33[local37++] = local59 == 0 ? 0 : local59 | 0xFF000000;
					}
				}
			} else {
				for (local42 = 0; local42 < arg0.anInt3983; local42++) {
					for (local46 = 0; local46 < arg0.anInt3984; local46++) {
						local33[local37++] = arg0.aByteArray31[local35] << 24 | arg0.anIntArray261[arg0.aByteArray32[local35] & 0xFF];
						local35++;
					}
				}
			}
			local24 = this.method8088(arg0.anInt3984, arg0.anInt3983, local33, arg0.anInt3984);
		}
		local24.method8792(arg0.anInt3981, arg0.anInt3980, arg0.anInt3985, arg0.anInt3982);
		return local24;
	}

	@OriginalMember(owner = "client!ij", name = "E", descriptor = "(I)V")
	protected abstract void method8237();

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "(B)V")
	protected abstract void method8238();

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface27 local9 = local6.anInterface27_5;
		this.method8228();
		this.method8234(local9);
		this.method8306(1);
		this.method8235(Static408.aClass269_3, Static408.aClass269_3);
		this.method8231(Static470.aClass43_5, 0);
		this.method8212(arg0);
		this.aClass51_Sub2_15.method3247((float) this.anInt9598, (float) this.anInt9644, 0.0F);
		this.method8290();
		this.aClass51_Sub2Array3[0].method3247(local9.method7127((float) this.anInt9598), local9.method7133((float) this.anInt9644), 1.0F);
		this.aClass51_Sub2Array3[0].method3232(0.0F, local9.method7127((float) -arg2), local9.method7133((float) -arg3));
		this.aClass100Array3[0] = Static593.aClass100_6;
		this.method8205();
		this.method8301();
		this.method8270();
		this.method8231(Static338.aClass43_3, 0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([FIIILclient!et;Z)Lclient!wk;")
	public final Interface27 method8239(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class104 arg3, @OriginalArg(5) boolean arg4) {
		return this.method8209(arg1, arg2, arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!ij", name = "F", descriptor = "(I)V")
	protected abstract void method8240();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([IIIIIZ)Lclient!iea;")
	@Override
	public final Class31 method8157(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class31_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method8126() {
	}

	@OriginalMember(owner = "client!ij", name = "G", descriptor = "(I)V")
	public final void method8241() {
		this.aClass51_Sub2_15.method6714();
		this.aBoolean682 = true;
		this.method8224();
	}

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "(B)V")
	protected abstract void method8242();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!ri;)V")
	public abstract void method8243(@OriginalArg(1) Class258 arg0);

	@OriginalMember(owner = "client!ij", name = "H", descriptor = "(I)I")
	public final int method8244() {
		return this.anInt9728;
	}

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "(B)V")
	private void method8245() {
		this.method8238();
		if (this.aClass18_3 != null) {
			this.aClass18_3.method8636();
		}
	}

	@OriginalMember(owner = "client!ij", name = "I", descriptor = "(I)V")
	protected abstract void method8246();

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(ZI)V")
	public abstract void method8247(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method8248(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8156(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas12 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.method8177(this.aHashtable6.get(arg0), arg0);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ij", name = "J", descriptor = "(I)V")
	protected abstract void method8249();

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "(B)V")
	private void method8250() {
		this.aBoolean698 = false;
		this.method8174();
		if (this.aClass101_10 == Static540.aClass101_8) {
			this.method8245();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	protected abstract void method8251(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "(B)V")
	private void method8252() {
		this.anInterface10_17 = this.method8200(false);
		this.anInterface10_17.method8450(12, 3096);
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			@Pc(33) Buffer local33 = this.anInterface10_17.method8449();
			if (local33 != null) {
				@Pc(40) Stream local40 = this.method8260(local33);
				local40.b(0.0F);
				local40.b(0.0F);
				local40.b(0.0F);
				for (@Pc(51) int local51 = 0; local51 <= 256; local51++) {
					@Pc(61) double local61 = (double) (local51 * 2) * 3.141592653589793D / 256.0D;
					@Pc(65) float local65 = (float) Math.cos(local61);
					@Pc(69) float local69 = (float) Math.sin(local61);
					if (Stream.c()) {
						local40.b(local69);
						local40.b(local65);
						local40.b(0.0F);
					} else {
						local40.a(local69);
						local40.a(local65);
						local40.a(0.0F);
					}
				}
				local40.b();
				if (this.anInterface10_17.method8448()) {
					break;
				}
			}
		}
		this.aClass258_22 = this.method8292(new Class118[] { new Class118(Static622.aClass371_1) });
	}

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "(B)V")
	protected abstract void method8253();

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(Z)V")
	protected abstract void method8254();

	@OriginalMember(owner = "client!ij", name = "K", descriptor = "(I)V")
	private void method8255() {
		if (this.aBoolean688) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray97;
		@Pc(21) float local21 = (float) (this.anInt9723 * -this.anInt9761) / (float) this.anInt9751;
		@Pc(36) float local36 = (float) ((this.anInt9598 - this.anInt9761) * this.anInt9723) / (float) this.anInt9751;
		@Pc(47) float local47 = (float) (this.anInt9723 * this.anInt9735) / (float) this.anInt9742;
		@Pc(61) float local61 = (float) ((this.anInt9735 - this.anInt9644) * this.anInt9723) / (float) this.anInt9742;
		if (local36 == local21 || local61 == local47) {
			local9[15] = 1.0F;
			local9[1] = 0.0F;
			local9[3] = 0.0F;
			local9[7] = 0.0F;
			local9[12] = 0.0F;
			local9[9] = 0.0F;
			local9[4] = 0.0F;
			local9[10] = 1.0F;
			local9[6] = 0.0F;
			local9[11] = 0.0F;
			local9[8] = 0.0F;
			local9[2] = 0.0F;
			local9[0] = 1.0F;
			local9[14] = 0.0F;
			local9[13] = 0.0F;
			local9[5] = 1.0F;
		} else {
			@Pc(75) float local75 = (float) this.anInt9723 * 2.0F;
			local9[2] = 0.0F;
			local9[0] = local75 / (local36 - local21);
			local9[6] = 0.0F;
			local9[12] = 0.0F;
			local9[14] = this.aFloat189 = (float) (this.anInt9723 * this.anInt9749) / (float) (this.anInt9723 - this.anInt9749);
			local9[13] = 0.0F;
			local9[1] = 0.0F;
			local9[5] = local75 / (local47 - local61);
			local9[8] = (local21 + local36) / (-local21 + local36);
			local9[9] = (local47 + local61) / (-local61 + local47);
			local9[10] = this.aFloat200 = (float) this.anInt9749 / (float) (this.anInt9723 - this.anInt9749);
			local9[7] = 0.0F;
			local9[4] = 0.0F;
			local9[3] = 0.0F;
			local9[11] = -1.0F;
			local9[15] = 0.0F;
		}
		this.method8191();
		this.aBoolean688 = true;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
	@Override
	public final void method8099(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(Z)Lclient!gk;")
	public final Class51_Sub2 method8256() {
		return this.aClass51_Sub2Array3[this.anInt9746];
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ[III)Lclient!wk;")
	public final Interface27 method8257(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method8199(arg0, arg1, 0, arg3, arg2, 0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!pda;)V")
	@Override
	public final void method8138(@OriginalArg(0) Class51 arg0) {
		this.aClass51_Sub2_16 = (Class51_Sub2) arg0;
		this.aClass51_Sub2_18.method6704(this.aClass51_Sub2_16);
		this.aClass51_Sub2_18.method3236();
		this.aClass51_Sub2_19.method3241(this.aClass51_Sub2_18);
		this.aClass51_Sub2_17.method3241(this.aClass51_Sub2_16);
		if (this.aClass101_10.method2511()) {
			this.method8304();
		}
	}

	@OriginalMember(owner = "client!ij", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt9712 + this.anInt9715 + this.anInt9719;
	}

	@OriginalMember(owner = "client!ij", name = "L", descriptor = "(I)V")
	private void method8258() {
		this.method8242();
		this.method8253();
		this.method8216();
		this.method8186();
		this.method8280();
		this.method8276();
		this.method8246();
		this.method8254();
		this.method8240();
		this.method8215();
		this.method8274();
		this.method8210();
		this.method8233();
		this.method8214();
		for (@Pc(50) int local50 = this.anInt9722 - 1; local50 >= 0; local50--) {
			this.method8230(local50);
			this.method8237();
			this.method8225();
			this.method8270();
		}
		this.method8259();
		this.method8285();
		this.method8238();
		this.method8226();
		this.method8308();
	}

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "(Z)V")
	protected abstract void method8259();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method8260(@OriginalArg(1) Buffer arg0) {
		this.aStream5.a(arg0);
		return this.aStream5;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!lga;IIII)Lclient!ka;")
	@Override
	public final Class193 method8161(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class193_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ij", name = "x", descriptor = "()Z")
	@Override
	public final boolean method8152() {
		return true;
	}

	@OriginalMember(owner = "client!ij", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8090(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZZBI)V")
	public final void method8261(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt9740 != arg2 || this.aBoolean691 != this.aBoolean693) {
			@Pc(24) Interface27 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean693 ? 3 : 0;
			if (arg2 < 0) {
				this.method8270();
			} else {
				local24 = this.aClass4_3.method70(arg2);
				@Pc(51) Class271 local51 = super.anInterface2_12.method6027(arg2);
				if (local51.aByte93 == 0 && local51.aByte95 == 0) {
					this.method8270();
				} else {
					@Pc(72) int local72 = local51.aBoolean516 ? 64 : 128;
					@Pc(76) int local76 = local72 * 50;
					@Pc(80) Class51_Sub2 local80 = this.method8181();
					local80.method3250((float) (local51.aByte93 * (this.anInt9736 % local76)) / (float) local76, (float) (this.anInt9736 % local76 * local51.aByte95) / (float) local76, 0.0F);
					this.method8217(Static593.aClass100_6);
				}
				if (!this.aBoolean693) {
					local37 = local51.aByte94;
					local30 = local51.anInt7159;
					local28 = local51.aByte97;
				}
				local26 = local51.anInt7163;
			}
			this.method8197(local30, local37, arg1, local28, arg0);
			if (this.aClass18_3 == null) {
				this.method8234(local24);
				this.method8204(local26);
			} else {
				this.aClass18_3.method8645(local26, local24);
			}
			this.aBoolean691 = this.aBoolean693;
			this.anInt9740 = arg2;
		}
		this.anInt9739 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ij", name = "M", descriptor = "(I)I")
	public final int method8262() {
		return this.anInt9729;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(FB)V")
	public final void method8263(@OriginalArg(0) float arg0) {
		if (this.aFloat195 != arg0) {
			this.aFloat195 = arg0;
			this.method8250();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!wha;IIBLclient!et;)Lclient!wk;")
	public abstract Interface27 method8264(@OriginalArg(0) Class381 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class104 arg3);

	@OriginalMember(owner = "client!ij", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt9738 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt9738++;
		}
		this.anInt9750 = 0x1 << this.anInt9738;
	}

	@OriginalMember(owner = "client!ij", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt9761, this.anInt9735, this.anInt9751, this.anInt9742 };
	}

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "()Z")
	@Override
	public final boolean method8121() {
		return this.aClass18Array3[3].method8643();
	}

	@OriginalMember(owner = "client!ij", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt9725;
		if (local11 || arg1 != this.aFloat197 || this.aFloat204 != arg2) {
			this.anInt9725 = arg0;
			this.aFloat197 = arg1;
			this.aFloat204 = arg2;
			if (local11) {
				this.aFloat203 = (float) (this.anInt9725 & 0xFF00) / 65280.0F;
				this.aFloat193 = (float) (this.anInt9725 & 0xFF) / 255.0F;
				this.aFloat199 = (float) (this.anInt9725 & 0xFF0000) / 1.671168E7F;
				this.method8242();
			}
			this.aNativeInterface3.setSunColour(this.aFloat199, this.aFloat203, this.aFloat193, arg1, arg2);
			this.method8253();
		}
		if (arg3 != this.aFloatArray98[0] || this.aFloatArray98[1] != arg4 || arg5 != this.aFloatArray98[2]) {
			this.aFloatArray98[2] = arg5;
			this.aFloatArray98[1] = arg4;
			this.aFloatArray98[0] = arg3;
			this.aFloatArray93[0] = -arg3;
			this.aFloatArray93[2] = -arg5;
			this.aFloatArray93[1] = -arg4;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray91[1] = local149 * arg4;
			this.aFloatArray91[2] = arg5 * local149;
			this.aFloatArray91[0] = arg3 * local149;
			this.aFloatArray90[2] = -this.aFloatArray91[2];
			this.aFloatArray90[0] = -this.aFloatArray91[0];
			this.aFloatArray90[1] = -this.aFloatArray91[1];
			this.aNativeInterface3.setSunDirection(this.aFloatArray91[0], this.aFloatArray91[1], this.aFloatArray91[2]);
			this.method8280();
			this.anInt9753 = (int) (arg3 * 256.0F / arg4);
			this.anInt9741 = (int) (arg5 * 256.0F / arg4);
		}
		this.method8276();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIZ)Lclient!iea;")
	@Override
	public final Class31 method8153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class31_Sub2 local11 = new Class31_Sub2(this, arg2, arg3, arg4);
		local11.method8802(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!ij", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt9598 - 1 && arg1 <= 0 && arg3 >= this.anInt9644 - 1) {
			this.la();
			return;
		}
		this.anInt9755 = arg2 > this.anInt9598 ? 0 : arg2;
		this.anInt9727 = arg1 < 0 ? 0 : arg1;
		this.anInt9734 = this.anInt9598 >= arg3 ? arg3 : 0;
		this.anInt9733 = arg0 < 0 ? 0 : arg0;
		if (!this.aBoolean702) {
			this.aBoolean702 = true;
			this.method8208();
		}
		this.method8201();
		this.method8182();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method8096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!ij", name = "N", descriptor = "(I)V")
	private void method8265() {
		if (Static528.aClass101_3 == this.aClass101_10) {
			return;
		}
		@Pc(16) Class101 local16 = this.aClass101_10;
		this.aClass101_10 = Static528.aClass101_3;
		if (!local16.method2511()) {
			this.method8304();
		}
		this.method8255();
		this.aFloatArray92 = this.aFloatArray97;
		this.method8245();
		this.anInt9739 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "()Z")
	@Override
	public final boolean method8167() {
		return false;
	}

	@OriginalMember(owner = "client!ij", name = "O", descriptor = "(I)V")
	private void method8266() {
		this.aBoolean688 = false;
		this.method8255();
		if (Static528.aClass101_3 == this.aClass101_10) {
			this.method8245();
		}
	}

	@OriginalMember(owner = "client!ij", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass51_Sub2_16.method3242((float) arg2, (float) arg1, (float) arg0);
		if (local14 < (float) this.anInt9723 || (float) this.anInt9749 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt9751 * this.aClass51_Sub2_16.method3249((float) arg1, (float) arg0, (float) arg2) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt9742 * this.aClass51_Sub2_16.method3237((float) arg2, (float) arg1, (float) arg0) / (float) arg3);
		arg4[0] = (int) ((float) local58 - this.aFloat190);
		arg4[2] = (int) local14;
		arg4[1] = (int) ((float) local77 - this.aFloat201);
	}

	@OriginalMember(owner = "client!ij", name = "P", descriptor = "(I)V")
	private void method8267() {
		this.anInterface10_15 = this.method8200(true);
		this.anInterface10_15.method8450(12, 24);
		this.aClass258_19 = this.method8292(new Class118[] { new Class118(Static622.aClass371_1) });
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIF)Lclient!laa;")
	@Override
	public final Class2_Sub12 method8111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub12_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "(I)V")
	@Override
	public final void method8139(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "(Z)V")
	private void method8268() {
		if (this.aCanvas11 == null) {
			this.anInt9544 = this.anInt9593 = 1;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas11.getSize();
			this.anInt9544 = local10.width;
			this.anInt9593 = local10.height;
		}
		this.anInt9598 = this.anInt9544;
		this.anInt9644 = this.anInt9593;
		this.method8195();
		this.method8266();
		this.method8250();
		this.method8285();
		this.method8182();
		this.method8307();
		this.la();
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(IB)V")
	public final void method8269(@OriginalArg(1) byte arg0) {
		this.method8212(arg0 | arg0 << 8 | arg0 << 16 | arg0 << 24);
	}

	@OriginalMember(owner = "client!ij", name = "Q", descriptor = "(I)V")
	public final void method8270() {
		if (this.aClass100Array3[this.anInt9746] != Static461.aClass100_4) {
			this.aClass100Array3[this.anInt9746] = Static461.aClass100_4;
			this.aClass51_Sub2Array3[this.anInt9746].method6714();
			this.method8205();
		}
	}

	@OriginalMember(owner = "client!ij", name = "R", descriptor = "(I)V")
	protected abstract void method8271();

	@OriginalMember(owner = "client!ij", name = "S", descriptor = "(I)V")
	private void method8272() {
		if (this.aClass101_10 == Static540.aClass101_8) {
			return;
		}
		@Pc(16) Class101 local16 = this.aClass101_10;
		this.aClass101_10 = Static540.aClass101_8;
		if (!local16.method2511()) {
			this.method8304();
		}
		this.method8174();
		this.aFloatArray92 = this.aFloatArray95;
		this.method8245();
		this.anInt9739 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!jl;[Lclient!hb;Z)Lclient!da;")
	@Override
	public final Class37 method8136(@OriginalArg(0) Class183 arg0, @OriginalArg(1) Class139[] arg1) {
		return new Class37_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!gk;B)V")
	public final void method8273(@OriginalArg(0) Class51_Sub2 arg0) {
		this.aClass51_Sub2_15.method6704(arg0);
		this.aBoolean682 = false;
		this.method8224();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	@Override
	public final void method8086(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "(B)V")
	protected abstract void method8274();

	@OriginalMember(owner = "client!ij", name = "T", descriptor = "(I)V")
	public final void method8275() {
		if (this.anInt9739 == 4) {
			return;
		}
		this.method8183();
		this.method8184(false);
		this.method8302(false);
		this.method8194(false);
		this.method8218(false);
		this.method8261(false, false, -2);
		this.method8306(1);
		this.method8204(0);
		this.anInt9739 = 4;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(17) float local17 = (float) arg3 - (float) arg1;
		@Pc(38) float local38;
		if (local11 == 0.0F && local17 == 0.0F) {
			local11 = 1.0F;
		} else {
			local38 = (float) (1.0D / Math.sqrt((double) (local11 * local11 + local17 * local17)));
			local17 *= local38;
			local11 *= local38;
		}
		this.method8297();
		this.method8212(arg4);
		this.method8231(Static470.aClass43_5, 0);
		this.method8279(Static470.aClass43_5, 0);
		this.method8306(1);
		this.method8241();
		this.method8247(false);
		@Pc(84) int local84 = arg7 % (arg5 + arg6);
		local38 = local11 * (float) arg5;
		@Pc(94) float local94 = (float) arg5 * local17;
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = local38;
		@Pc(102) float local102 = local94;
		if (arg5 >= local84) {
			local102 = (float) (arg5 - local84) * local17;
			local100 = (float) (arg5 - local84) * local11;
		} else {
			local96 = (float) (arg6 + arg5 - local84) * local11;
			local98 = local17 * (float) (arg5 + arg6 - local84);
		}
		@Pc(147) float local147 = local96 + (float) arg0;
		@Pc(152) float local152 = local98 + (float) arg1;
		@Pc(157) float local157 = (float) arg6 * local11;
		@Pc(162) float local162 = local17 * (float) arg6;
		while (true) {
			if (arg0 >= arg2) {
				if (local147 < (float) arg2) {
					break;
				}
				if ((float) arg2 > local100 + local147) {
					local100 = (float) arg2 - local147;
				}
			} else {
				if (local147 > (float) arg2) {
					break;
				}
				if ((float) arg2 < local100 + local147) {
					local100 = (float) arg2 - local147;
				}
			}
			if (arg1 < arg3) {
				if ((float) arg3 < local152) {
					break;
				}
				if ((float) arg3 < local102 + local152) {
					local102 = (float) arg3 - local152;
				}
			} else {
				if (local152 < (float) arg3) {
					break;
				}
				if ((float) arg3 > local102 + local152) {
					local102 = (float) arg3 - local152;
				}
			}
			if (!this.method8220(0.0F, local147, local152 + local102, 0.0F, local152, local100 + local147)) {
				return;
			}
			local147 += local100 + local157;
			this.method8178();
			local152 += local102 + local162;
			local102 = local94;
			local100 = local38;
		}
		this.method8247(true);
		this.method8279(Static338.aClass43_3, 0);
		this.method8231(Static338.aClass43_3, 0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method8115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local9 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local9 * local9 + local16 * local16));
			local18 = (float) Math.atan2((double) local16, (double) local9);
		}
		this.method8297();
		this.method8212(arg4);
		this.method8231(Static470.aClass43_5, 0);
		this.method8279(Static470.aClass43_5, 0);
		this.method8306(0);
		this.aClass51_Sub2_15.method3247(local20, (float) arg5, 1.0F);
		this.aClass51_Sub2_15.method6711(0, -arg5 / 2, 0);
		this.aClass51_Sub2_15.method6720((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass51_Sub2_15.method6711(arg0, arg1, 0);
		this.method8290();
		this.method8247(false);
		this.method8301();
		this.method8247(true);
		this.method8279(Static338.aClass43_3, 0);
		this.method8231(Static338.aClass43_3, 0);
	}

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "(B)V")
	protected abstract void method8276();

	@OriginalMember(owner = "client!ij", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt9762;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BZZLclient!bp;I)V")
	public abstract void method8277(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class43 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)Lclient!gda;")
	protected Class18 method8278(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class18_Sub7(this);
		} else if (arg0 == 1) {
			return new Class18_Sub4(this);
		} else if (arg0 == 2) {
			return new Class18_Sub1(this, this.aClass334_8);
		} else if (arg0 == 7) {
			return new Class18_Sub5(this);
		} else {
			return new Class18_Sub10(this);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!bp;IB)V")
	public final void method8279(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1) {
		this.method8189(arg1, arg0);
	}

	@OriginalMember(owner = "client!ij", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9742 = arg3;
		this.anInt9761 = arg0;
		this.anInt9735 = arg1;
		this.anInt9751 = arg2;
		this.method8250();
		this.method8266();
		this.method8307();
		this.method8182();
	}

	@OriginalMember(owner = "client!ij", name = "U", descriptor = "(I)V")
	public abstract void method8280();

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(ZI)V")
	public final void method8281(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean694) {
			this.aBoolean694 = arg0;
			this.method8216();
		}
	}

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "(Z)V")
	private void method8282() {
		this.anInterface10_16 = this.method8200(false);
		this.anInterface10_16.method8450(28, 140);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(35) Buffer local35 = this.anInterface10_16.method8449();
			if (local35 != null) {
				@Pc(42) Stream local42 = this.method8260(local35);
				if (Stream.c()) {
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
				local42.b();
				if (this.anInterface10_16.method8448()) {
					break;
				}
			}
		}
		this.aClass258_18 = this.method8292(new Class118[] { new Class118(new Class371[] { Static622.aClass371_1, Static622.aClass371_5, Static622.aClass371_5 }) });
	}

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "(B)I")
	public final int method8283() {
		return this.anInt9730;
	}

	@OriginalMember(owner = "client!ij", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!ij", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass51_Sub2_16.method3242((float) arg2, (float) arg1, (float) arg0);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt9751 * this.aClass51_Sub2_16.method3249((float) arg1, (float) arg0, (float) arg2) / local14);
			local25 = (int) ((float) this.anInt9742 * this.aClass51_Sub2_16.method3237((float) arg2, (float) arg1, (float) arg0) / local14);
		} else {
			local25 = this.anInt9735;
			local28 = this.anInt9761;
		}
		arg3[0] = (int) ((float) local28 - this.aFloat190);
		arg3[1] = (int) ((float) local25 - this.aFloat201);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "()Z")
	@Override
	public final boolean method8109() {
		return true;
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "()V")
	@Override
	protected void method8103() {
		if (this.aBoolean697) {
			return;
		}
		for (@Pc(13) Class2 local13 = this.aClass114_58.method2772(); local13 != null; local13 = this.aClass114_58.method2762()) {
			((Class2_Sub40_Sub1) local13).method7227();
		}
		@Pc(30) Enumeration local30 = this.aHashtable6.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method8177(this.aHashtable6.get(local36), local36);
		}
		Static21.method563(false, true);
		this.aNativeInterface3.release();
		this.aBoolean697 = true;
	}

	@OriginalMember(owner = "client!ij", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt9727 = 0;
		this.anInt9755 = this.anInt9598;
		this.anInt9734 = this.anInt9644;
		this.anInt9733 = 0;
		if (this.aBoolean702) {
			this.aBoolean702 = false;
			this.method8208();
		}
		this.method8182();
	}

	@OriginalMember(owner = "client!ij", name = "V", descriptor = "(I)V")
	public final void method8284() {
		this.method8307();
		this.method8245();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZ)Lclient!iea;")
	@Override
	public final Class31 method8169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class31_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ij", name = "W", descriptor = "(I)V")
	protected abstract void method8285();

	@OriginalMember(owner = "client!ij", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean693 = false;
	}

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "()V")
	@Override
	public final void method8166() {
		if (this.aClass4_3 != null) {
			this.aClass4_3.method72();
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method8104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method8299();
		this.method8297();
		this.method8212(arg4);
		this.method8231(Static470.aClass43_5, 0);
		this.method8279(Static470.aClass43_5, 0);
		this.method8306(arg5);
		this.aClass51_Sub2_15.method3247((float) (arg2 - 1), (float) (arg3 - 1), 1.0F);
		this.aClass51_Sub2_15.method3232(0.0F, (float) arg0 - local7, (float) arg1 - local7);
		this.method8290();
		this.method8247(false);
		this.method8203(Static582.aClass191_6, 4);
		this.method8247(true);
		this.method8279(Static338.aClass43_3, 0);
		this.method8231(Static338.aClass43_3, 0);
	}

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "(II)Lclient!iaa;")
	public final Interface11 method8287(@OriginalArg(1) int arg0) {
		if (this.anInterface11_7.method8445() < arg0 * 2) {
			this.anInterface11_7.method7407(arg0);
		}
		return this.anInterface11_7;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZB)Lclient!iaa;")
	public abstract Interface11 method8288(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ij", name = "Y", descriptor = "(I)Lclient!gk;")
	public final Class51_Sub2 method8289() {
		if (!this.aBoolean701) {
			this.aClass51_Sub2_20.method3244(this.aClass51_Sub2_18, this.aClass51_Sub2_15);
			this.aBoolean701 = true;
		}
		return this.aClass51_Sub2_20;
	}

	@OriginalMember(owner = "client!ij", name = "Z", descriptor = "(I)V")
	public final void method8290() {
		this.aBoolean682 = false;
		this.method8224();
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(IIIIII)Lclient!mda;")
	@Override
	public final Class49 method8148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class49_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
	@Override
	public final void method8098(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method8144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)I")
	@Override
	public final int method8122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "(I)Lclient!za;")
	@Override
	public final Class2_Sub40 method8162(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub40_Sub1 local8 = new Class2_Sub40_Sub1(arg0);
		this.aClass114_58.method2771(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "()Z")
	@Override
	public final boolean method8084() {
		return true;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
	@Override
	public void method8097(@OriginalArg(0) int arg0) {
		if (this.aClass4_3 != null) {
			this.aClass4_3.method73();
		}
		this.anInt9736 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ij", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8297();
		this.method8212(arg3);
		this.method8231(Static470.aClass43_5, 0);
		this.method8279(Static470.aClass43_5, 0);
		this.method8306(arg4);
		this.aClass51_Sub2_15.method3247((float) arg2, (float) arg2, 1.0F);
		this.aClass51_Sub2_15.method6711(arg0, arg1, 0);
		this.method8290();
		this.method8247(false);
		this.method8192(0, this.anInterface10_17);
		this.method8243(this.aClass258_22);
		this.method8211(Static206.aClass191_2, 256, 0);
		this.method8247(true);
		this.method8279(Static338.aClass43_3, 0);
		this.method8231(Static338.aClass43_3, 0);
	}

	@OriginalMember(owner = "client!ij", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt9733) {
			local5 = true;
			this.anInt9733 = arg0;
		}
		if (arg2 < this.anInt9755) {
			local5 = true;
			this.anInt9755 = arg2;
		}
		if (this.anInt9727 < arg1) {
			local5 = true;
			this.anInt9727 = arg1;
		}
		if (this.anInt9734 > arg3) {
			local5 = true;
			this.anInt9734 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean702) {
			this.aBoolean702 = true;
			this.method8208();
		}
		this.method8201();
		this.method8182();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[Lclient!fk;)Lclient!ri;")
	public abstract Class258 method8292(@OriginalArg(1) Class118[] arg0);

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
	@Override
	public final void method8105() {
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!et;BLclient!wha;)Z")
	public abstract boolean method8293(@OriginalArg(0) Class104 arg0, @OriginalArg(2) Class381 arg1);

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "()Z")
	@Override
	public final boolean method8114() {
		return true;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[F)[F")
	public final float[] method8294(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloatArray92[0];
		arg0[4] = this.aFloatArray92[1];
		arg0[12] = this.aFloatArray92[3];
		arg0[8] = this.aFloatArray92[2];
		arg0[9] = this.aFloatArray92[6];
		arg0[1] = this.aFloatArray92[4];
		arg0[5] = this.aFloatArray92[5];
		arg0[2] = this.aFloatArray92[8];
		arg0[13] = this.aFloatArray92[7];
		arg0[7] = this.aFloatArray92[13];
		arg0[6] = this.aFloatArray92[9];
		arg0[10] = this.aFloatArray92[10];
		arg0[14] = this.aFloatArray92[11];
		arg0[3] = this.aFloatArray92[12];
		arg0[15] = this.aFloatArray92[15];
		arg0[11] = this.aFloatArray92[14];
		return arg0;
	}

	@OriginalMember(owner = "client!ij", name = "ab", descriptor = "(I)V")
	public final void method8295() {
		if (this.anInt9739 == 16) {
			return;
		}
		this.method8272();
		this.method8184(true);
		this.method8194(true);
		this.method8218(true);
		this.method8306(1);
		this.anInt9739 = 16;
	}

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "()Lclient!pda;")
	@Override
	public final Class51 method8154() {
		return this.aClass51_Sub2_21;
	}

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "(Z)V")
	private void method8296() {
		this.aFloat188 = (float) this.anInt9749;
	}

	@OriginalMember(owner = "client!ij", name = "bb", descriptor = "(I)V")
	private void method8297() {
		if (this.anInt9739 == 1) {
			return;
		}
		this.method8183();
		this.method8184(false);
		this.method8302(false);
		this.method8194(false);
		this.method8218(false);
		this.method8261(false, false, -2);
		this.method8204(1);
		this.method8234(this.anInterface6_3);
		this.anInt9739 = 1;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(BI)V")
	public abstract void method8298(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "(B)F")
	protected abstract float method8299();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!mda;)V")
	@Override
	public final void method8132(@OriginalArg(0) Class49 arg0) {
		this.aClass49_Sub2_3 = (Class49_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt9723;
	}

	@OriginalMember(owner = "client!ij", name = "x", descriptor = "(B)V")
	protected final void method8300() {
		@Pc(9) Enumeration local9 = this.aHashtable6.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method8177(this.aHashtable6.get(local15), local15);
		}
		this.anInterface10_16.method8446();
		this.anInterface10_15.method8446();
		this.anInterface10_17.method8446();
		this.aClass193_Sub2_22.method5631();
		this.aClass193_Sub2_23.method5631();
		this.aClass193_Sub2_25.method5631();
		this.aClass193_Sub2_29.method5631();
		this.aClass193_Sub2_28.method5631();
		this.aClass107_3.method2609();
		this.anInterface11_7.method8446();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8124(@OriginalArg(0) Canvas arg0) {
		this.aCanvas11 = null;
		this.anObject24 = null;
		if (arg0 == null || this.aCanvas12 == arg0) {
			this.aCanvas11 = this.aCanvas12;
			this.anObject24 = this.anObject25;
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.anObject24 = this.aHashtable6.get(arg0);
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.anObject24 == null) {
			throw new RuntimeException();
		}
		this.method8251(this.aCanvas11, this.anObject24);
		this.method8268();
	}

	@OriginalMember(owner = "client!ij", name = "cb", descriptor = "(I)V")
	public final void method8301() {
		this.method8203(Static206.aClass191_2, 2);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(ZZ)V")
	public final void method8302(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean690 != arg0) {
			this.aBoolean690 = arg0;
			this.method8216();
			this.anInt9739 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "()Lclient!pda;")
	@Override
	public final Class51 method8119() {
		return this.aClass51_Sub2_16;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method8303(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "()Z")
	@Override
	public final boolean method8128() {
		return false;
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(II)I")
	@Override
	public final int method8163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!ij", name = "db", descriptor = "(I)V")
	private void method8304() {
		this.aBoolean701 = false;
		if (this.aClass18_3 != null) {
			this.aClass18_3.method8640();
		}
		this.method8308();
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V")
	@Override
	public final void method8113(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass4_3 != null) {
			this.aClass4_3.method72();
		}
		this.anInt9744 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZI[[I)Lclient!nn;")
	public abstract Interface19 method8305(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[][] arg2);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([I)V")
	@Override
	public final void method8100(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9598;
		arg0[1] = this.anInt9644;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(IB)V")
	public final void method8306(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt9752) {
			return;
		}
		@Pc(29) Class32 local29;
		@Pc(31) boolean local31;
		@Pc(27) boolean local27;
		if (arg0 == 1) {
			local29 = Static275.aClass32_4;
			local27 = true;
			local31 = true;
		} else if (arg0 == 2) {
			local27 = false;
			local29 = Static174.aClass32_1;
			local31 = true;
		} else if (arg0 == 128) {
			local29 = Static230.aClass32_2;
			local27 = true;
			local31 = true;
		} else {
			local31 = false;
			local29 = Static553.aClass32_6;
			local27 = false;
		}
		if (local27 != this.bf) {
			this.bf = local27;
			this.method8214();
		}
		if (local31 != this.aBoolean684) {
			this.aBoolean684 = local31;
			this.method8210();
		}
		if (this.aClass32_7 != local29) {
			this.aClass32_7 = local29;
			this.method8233();
		}
		this.anInt9739 &= 0xFFFFFFE3;
		this.anInt9752 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "(B)V")
	public final void method8307() {
		if (this.aClass101_10 == Static415.aClass101_7) {
			return;
		}
		@Pc(6) Class101 local6 = this.aClass101_10;
		this.aClass101_10 = Static415.aClass101_7;
		if (local6.method2511()) {
			this.method8304();
		}
		this.aFloatArray92 = this.aFloatArray94;
		this.anInt9739 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ij", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt9749;
	}

	@OriginalMember(owner = "client!ij", name = "eb", descriptor = "(I)V")
	protected abstract void method8308();
}
