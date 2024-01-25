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

@OriginalClass("client!pj")
public abstract class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!pj", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!pj", name = "Ib", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!pj", name = "kc", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7;

	@OriginalMember(owner = "client!pj", name = "cd", descriptor = "Lclient!ui;")
	protected Class353 aClass353_6;

	@OriginalMember(owner = "client!pj", name = "wd", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!pj", name = "be", descriptor = "I")
	public int anInt9702;

	@OriginalMember(owner = "client!pj", name = "ce", descriptor = "I")
	protected int anInt9703;

	@OriginalMember(owner = "client!pj", name = "fe", descriptor = "I")
	public int anInt9705;

	@OriginalMember(owner = "client!pj", name = "le", descriptor = "Lclient!hj;")
	private Class144_Sub1 aClass144_Sub1_3;

	@OriginalMember(owner = "client!pj", name = "me", descriptor = "[Lclient!ef;")
	protected Class87[] aClass87Array5;

	@OriginalMember(owner = "client!pj", name = "ne", descriptor = "Lclient!iea;")
	private Class159 aClass159_3;

	@OriginalMember(owner = "client!pj", name = "qe", descriptor = "F")
	private float aFloat236;

	@OriginalMember(owner = "client!pj", name = "re", descriptor = "[Lclient!bc;")
	protected Class26_Sub1[] aClass26_Sub1Array3;

	@OriginalMember(owner = "client!pj", name = "te", descriptor = "[Lclient!ef;")
	protected Class87[] aClass87Array6;

	@OriginalMember(owner = "client!pj", name = "ue", descriptor = "F")
	public float aFloat237;

	@OriginalMember(owner = "client!pj", name = "ze", descriptor = "Z")
	public boolean aBoolean669;

	@OriginalMember(owner = "client!pj", name = "Ie", descriptor = "Lclient!nm;")
	private Class31 aClass31_3;

	@OriginalMember(owner = "client!pj", name = "Le", descriptor = "F")
	public float aFloat239;

	@OriginalMember(owner = "client!pj", name = "Re", descriptor = "F")
	public float aFloat241;

	@OriginalMember(owner = "client!pj", name = "Te", descriptor = "I")
	private int anInt9716;

	@OriginalMember(owner = "client!pj", name = "Ue", descriptor = "I")
	public int anInt9717;

	@OriginalMember(owner = "client!pj", name = "Ye", descriptor = "I")
	public int anInt9719;

	@OriginalMember(owner = "client!pj", name = "af", descriptor = "I")
	public int anInt9721;

	@OriginalMember(owner = "client!pj", name = "cf", descriptor = "I")
	protected int anInt9722;

	@OriginalMember(owner = "client!pj", name = "df", descriptor = "[Lclient!qm;")
	protected Class14_Sub37[] aClass14_Sub37Array6;

	@OriginalMember(owner = "client!pj", name = "ef", descriptor = "Z")
	public boolean aBoolean673;

	@OriginalMember(owner = "client!pj", name = "kf", descriptor = "F")
	private float aFloat242;

	@OriginalMember(owner = "client!pj", name = "mf", descriptor = "Z")
	protected boolean aBoolean676;

	@OriginalMember(owner = "client!pj", name = "rf", descriptor = "F")
	public float aFloat243;

	@OriginalMember(owner = "client!pj", name = "sf", descriptor = "F")
	public float aFloat244;

	@OriginalMember(owner = "client!pj", name = "uf", descriptor = "I")
	protected int anInt9729;

	@OriginalMember(owner = "client!pj", name = "vf", descriptor = "[Lclient!de;")
	protected Class70[] aClass70Array3;

	@OriginalMember(owner = "client!pj", name = "zf", descriptor = "F")
	public float aFloat248;

	@OriginalMember(owner = "client!pj", name = "Df", descriptor = "I")
	protected int anInt9730;

	@OriginalMember(owner = "client!pj", name = "Ef", descriptor = "Lclient!kja;")
	public Interface15 anInterface15_3;

	@OriginalMember(owner = "client!pj", name = "Hf", descriptor = "I")
	private int anInt9732;

	@OriginalMember(owner = "client!pj", name = "Pf", descriptor = "Z")
	protected boolean aBoolean680;

	@OriginalMember(owner = "client!pj", name = "Uf", descriptor = "Z")
	public boolean aBoolean682;

	@OriginalMember(owner = "client!pj", name = "Xf", descriptor = "I")
	public int anInt9740;

	@OriginalMember(owner = "client!pj", name = "eg", descriptor = "[Lclient!kja;")
	private Interface15[] anInterface15Array3;

	@OriginalMember(owner = "client!pj", name = "gg", descriptor = "I")
	protected int anInt9744;

	@OriginalMember(owner = "client!pj", name = "jg", descriptor = "Lclient!kq;")
	public Class201 aClass201_17;

	@OriginalMember(owner = "client!pj", name = "kg", descriptor = "Lclient!eaa;")
	public Class80_Sub1 aClass80_Sub1_21;

	@OriginalMember(owner = "client!pj", name = "lg", descriptor = "Lclient!eaa;")
	public Class80_Sub1 aClass80_Sub1_22;

	@OriginalMember(owner = "client!pj", name = "mg", descriptor = "Lclient!kq;")
	private Class201 aClass201_18;

	@OriginalMember(owner = "client!pj", name = "ng", descriptor = "Lclient!dk;")
	private Interface4 anInterface4_6;

	@OriginalMember(owner = "client!pj", name = "og", descriptor = "Lclient!hl;")
	private Interface10 anInterface10_13;

	@OriginalMember(owner = "client!pj", name = "pg", descriptor = "Lclient!eaa;")
	public Class80_Sub1 aClass80_Sub1_23;

	@OriginalMember(owner = "client!pj", name = "qg", descriptor = "Lclient!eaa;")
	public Class80_Sub1 aClass80_Sub1_24;

	@OriginalMember(owner = "client!pj", name = "rg", descriptor = "Lclient!kq;")
	public Class201 aClass201_19;

	@OriginalMember(owner = "client!pj", name = "sg", descriptor = "Lclient!eaa;")
	public Class80_Sub1 aClass80_Sub1_25;

	@OriginalMember(owner = "client!pj", name = "tg", descriptor = "Lclient!eaa;")
	public Class80_Sub1 aClass80_Sub1_26;

	@OriginalMember(owner = "client!pj", name = "ug", descriptor = "Lclient!hl;")
	private Interface10 anInterface10_14;

	@OriginalMember(owner = "client!pj", name = "vg", descriptor = "Lclient!eaa;")
	public Class80_Sub1 aClass80_Sub1_27;

	@OriginalMember(owner = "client!pj", name = "wg", descriptor = "Lclient!kq;")
	private Class201 aClass201_20;

	@OriginalMember(owner = "client!pj", name = "xg", descriptor = "Lclient!kq;")
	public Class201 aClass201_21;

	@OriginalMember(owner = "client!pj", name = "yg", descriptor = "Lclient!kq;")
	private Class201 aClass201_22;

	@OriginalMember(owner = "client!pj", name = "zg", descriptor = "Lclient!eaa;")
	public Class80_Sub1 aClass80_Sub1_28;

	@OriginalMember(owner = "client!pj", name = "Bg", descriptor = "Lclient!kq;")
	public Class201 aClass201_23;

	@OriginalMember(owner = "client!pj", name = "Cg", descriptor = "Lclient!hl;")
	private Interface10 anInterface10_15;

	@OriginalMember(owner = "client!pj", name = "Dg", descriptor = "Lclient!eaa;")
	public Class80_Sub1 aClass80_Sub1_29;

	@OriginalMember(owner = "client!pj", name = "Eg", descriptor = "Lclient!eaa;")
	public Class80_Sub1 aClass80_Sub1_30;

	@OriginalMember(owner = "client!pj", name = "Fg", descriptor = "I")
	private int anInt9745;

	@OriginalMember(owner = "client!pj", name = "Gg", descriptor = "Z")
	protected boolean aBoolean687;

	@OriginalMember(owner = "client!pj", name = "Ad", descriptor = "Lclient!ok;")
	private final Class262 aClass262_65 = new Class262();

	@OriginalMember(owner = "client!pj", name = "ae", descriptor = "Z")
	protected boolean aBoolean666 = true;

	@OriginalMember(owner = "client!pj", name = "de", descriptor = "Lclient!bc;")
	protected final Class26_Sub1 aClass26_Sub1_15 = new Class26_Sub1();

	@OriginalMember(owner = "client!pj", name = "ge", descriptor = "Lclient!bc;")
	public Class26_Sub1 aClass26_Sub1_16 = new Class26_Sub1();

	@OriginalMember(owner = "client!pj", name = "he", descriptor = "Lclient!bc;")
	public final Class26_Sub1 aClass26_Sub1_17 = new Class26_Sub1();

	@OriginalMember(owner = "client!pj", name = "ie", descriptor = "Lclient!bc;")
	protected final Class26_Sub1 aClass26_Sub1_18 = new Class26_Sub1();

	@OriginalMember(owner = "client!pj", name = "je", descriptor = "Lclient!bc;")
	private final Class26_Sub1 aClass26_Sub1_19 = new Class26_Sub1();

	@OriginalMember(owner = "client!pj", name = "ke", descriptor = "Lclient!bc;")
	private final Class26_Sub1 aClass26_Sub1_20 = new Class26_Sub1();

	@OriginalMember(owner = "client!pj", name = "Qe", descriptor = "Z")
	protected boolean aBoolean671 = true;

	@OriginalMember(owner = "client!pj", name = "De", descriptor = "[Lclient!nm;")
	private final Class31[] aClass31Array3 = new Class31[10];

	@OriginalMember(owner = "client!pj", name = "bf", descriptor = "I")
	protected int bf = 0;

	@OriginalMember(owner = "client!pj", name = "We", descriptor = "Z")
	private boolean aBoolean672 = false;

	@OriginalMember(owner = "client!pj", name = "ff", descriptor = "I")
	public int anInt9723 = -1;

	@OriginalMember(owner = "client!pj", name = "Xe", descriptor = "[F")
	private final float[] aFloatArray75 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!pj", name = "we", descriptor = "Lclient!fga;")
	protected Class105 aClass105_6 = Static175.aClass105_1;

	@OriginalMember(owner = "client!pj", name = "Ge", descriptor = "[F")
	public final float[] aFloatArray72 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!pj", name = "pe", descriptor = "F")
	public float aFloat235 = 1.0F;

	@OriginalMember(owner = "client!pj", name = "Ze", descriptor = "I")
	protected final int anInt9720 = 0;

	@OriginalMember(owner = "client!pj", name = "xe", descriptor = "[F")
	private final float[] aFloatArray71 = new float[16];

	@OriginalMember(owner = "client!pj", name = "Ce", descriptor = "I")
	public int anInt9708 = 8;

	@OriginalMember(owner = "client!pj", name = "se", descriptor = "I")
	protected int anInt9707 = 0;

	@OriginalMember(owner = "client!pj", name = "jf", descriptor = "Z")
	protected boolean aBoolean675 = false;

	@OriginalMember(owner = "client!pj", name = "lf", descriptor = "I")
	protected int anInt9725 = 0;

	@OriginalMember(owner = "client!pj", name = "Ve", descriptor = "I")
	private int anInt9718 = 16777215;

	@OriginalMember(owner = "client!pj", name = "of", descriptor = "I")
	protected int anInt9726 = 0;

	@OriginalMember(owner = "client!pj", name = "ve", descriptor = "Z")
	protected boolean aBoolean667 = false;

	@OriginalMember(owner = "client!pj", name = "Be", descriptor = "Z")
	protected boolean aBoolean670 = true;

	@OriginalMember(owner = "client!pj", name = "Ae", descriptor = "F")
	public float aFloat238 = -1.0F;

	@OriginalMember(owner = "client!pj", name = "Se", descriptor = "I")
	public int anInt9715 = 0;

	@OriginalMember(owner = "client!pj", name = "qf", descriptor = "I")
	public int anInt9727 = -1;

	@OriginalMember(owner = "client!pj", name = "Oe", descriptor = "I")
	private int anInt9714 = 1;

	@OriginalMember(owner = "client!pj", name = "Je", descriptor = "[F")
	public final float[] aFloatArray73 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!pj", name = "tf", descriptor = "I")
	private int anInt9728 = -1;

	@OriginalMember(owner = "client!pj", name = "pf", descriptor = "[F")
	private final float[] aFloatArray76 = new float[16];

	@OriginalMember(owner = "client!pj", name = "Af", descriptor = "Z")
	protected boolean aBoolean677 = false;

	@OriginalMember(owner = "client!pj", name = "He", descriptor = "I")
	private int anInt9711 = 0;

	@OriginalMember(owner = "client!pj", name = "yf", descriptor = "F")
	public float aFloat247 = 3584.0F;

	@OriginalMember(owner = "client!pj", name = "Jf", descriptor = "[F")
	private final float[] aFloatArray78 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!pj", name = "Nf", descriptor = "[F")
	private final float[] aFloatArray79 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!pj", name = "If", descriptor = "I")
	protected final int anInt9733 = 0;

	@OriginalMember(owner = "client!pj", name = "Gf", descriptor = "Lclient!hfa;")
	protected Class141 aClass141_8 = Static145.aClass141_4;

	@OriginalMember(owner = "client!pj", name = "Ee", descriptor = "I")
	private int anInt9709 = -1;

	@OriginalMember(owner = "client!pj", name = "Ke", descriptor = "I")
	public int anInt9712 = 0;

	@OriginalMember(owner = "client!pj", name = "Bf", descriptor = "[F")
	private final float[] aFloatArray77 = new float[16];

	@OriginalMember(owner = "client!pj", name = "xf", descriptor = "F")
	public float aFloat246 = 1.0F;

	@OriginalMember(owner = "client!pj", name = "Lf", descriptor = "I")
	public int anInt9734 = 0;

	@OriginalMember(owner = "client!pj", name = "Mf", descriptor = "I")
	public int anInt9735 = 512;

	@OriginalMember(owner = "client!pj", name = "Tf", descriptor = "I")
	protected int anInt9738 = 3584;

	@OriginalMember(owner = "client!pj", name = "Sf", descriptor = "I")
	public int anInt9737 = 50;

	@OriginalMember(owner = "client!pj", name = "Cf", descriptor = "Z")
	private boolean aBoolean678 = false;

	@OriginalMember(owner = "client!pj", name = "ag", descriptor = "Z")
	private boolean aBoolean683 = false;

	@OriginalMember(owner = "client!pj", name = "Me", descriptor = "I")
	private int anInt9713 = 0;

	@OriginalMember(owner = "client!pj", name = "Rf", descriptor = "I")
	public int anInt9736 = 128;

	@OriginalMember(owner = "client!pj", name = "Qf", descriptor = "Z")
	private boolean aBoolean681 = false;

	@OriginalMember(owner = "client!pj", name = "Yf", descriptor = "I")
	private int anInt9741 = 0;

	@OriginalMember(owner = "client!pj", name = "Of", descriptor = "Z")
	protected boolean aBoolean679 = false;

	@OriginalMember(owner = "client!pj", name = "gf", descriptor = "Z")
	protected boolean aBoolean674 = true;

	@OriginalMember(owner = "client!pj", name = "ye", descriptor = "Z")
	protected boolean aBoolean668 = true;

	@OriginalMember(owner = "client!pj", name = "cg", descriptor = "F")
	public float aFloat250 = 1.0F;

	@OriginalMember(owner = "client!pj", name = "Pe", descriptor = "F")
	private float aFloat240 = 1.0F;

	@OriginalMember(owner = "client!pj", name = "wf", descriptor = "F")
	public float aFloat245 = 1.0F;

	@OriginalMember(owner = "client!pj", name = "Ff", descriptor = "I")
	public int anInt9731 = 3;

	@OriginalMember(owner = "client!pj", name = "Vf", descriptor = "I")
	protected int anInt9739 = 0;

	@OriginalMember(owner = "client!pj", name = "dg", descriptor = "Z")
	private boolean aBoolean684 = false;

	@OriginalMember(owner = "client!pj", name = "Wf", descriptor = "F")
	public float aFloat249 = 3584.0F;

	@OriginalMember(owner = "client!pj", name = "Zf", descriptor = "I")
	public int anInt9742 = 512;

	@OriginalMember(owner = "client!pj", name = "bg", descriptor = "I")
	private int anInt9743 = 0;

	@OriginalMember(owner = "client!pj", name = "Fe", descriptor = "I")
	private int anInt9710 = -1;

	@OriginalMember(owner = "client!pj", name = "fg", descriptor = "Z")
	private boolean aBoolean685 = false;

	@OriginalMember(owner = "client!pj", name = "Ne", descriptor = "[F")
	protected float[] aFloatArray74 = this.aFloatArray75;

	@OriginalMember(owner = "client!pj", name = "hg", descriptor = "Z")
	protected boolean aBoolean686 = true;

	@OriginalMember(owner = "client!pj", name = "ig", descriptor = "F")
	public float aFloat251 = -1.0F;

	@OriginalMember(owner = "client!pj", name = "nf", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!pj", name = "Ag", descriptor = "Lclient!bc;")
	private final Class26_Sub1 aClass26_Sub1_21 = new Class26_Sub1();

	@OriginalMember(owner = "client!pj", name = "yc", descriptor = "Lclient!wia;")
	protected final Class386 aClass386_119;

	@OriginalMember(owner = "client!pj", name = "Qc", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas13;

	@OriginalMember(owner = "client!pj", name = "ab", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "Ljava/lang/Object;")
	protected final Object anObject19;

	@OriginalMember(owner = "client!pj", name = "Kb", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!pj", name = "oe", descriptor = "I")
	protected final int anInt9706;

	@OriginalMember(owner = "client!pj", name = "hf", descriptor = "I")
	public final int anInt9724;

	@OriginalMember(owner = "client!pj", name = "pc", descriptor = "I")
	private int anInt9619;

	@OriginalMember(owner = "client!pj", name = "Hd", descriptor = "I")
	public int anInt9683;

	@OriginalMember(owner = "client!pj", name = "yb", descriptor = "I")
	private int anInt9579;

	@OriginalMember(owner = "client!pj", name = "Lb", descriptor = "I")
	public int anInt9590;

	@OriginalMember(owner = "client!pj", name = "Kf", descriptor = "Lclient!ir;")
	private final Class171 aClass171_3;

	@OriginalMember(owner = "client!pj", name = "vb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!wia;II)V")
	protected Class137_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) Class386 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.aClass386_119 = arg3;
			this.aCanvas12 = this.aCanvas13 = arg0;
			this.anObject20 = this.anObject19 = arg1;
			this.anInt9706 = arg4;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt9724 = arg5;
			this.anInt9683 = this.anInt9619 = local307.width;
			this.anInt9590 = this.anInt9579 = local307.height;
			Static479.method7114(true, false);
			if (super.anInterface3_11 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt9724);
				this.aClass171_3 = null;
			} else {
				this.aClass171_3 = new Class171(this, super.anInterface3_11);
				this.aNativeInterface3 = new NativeInterface(super.anInterface3_11.method6178(), this.anInt9724);
				for (@Pc(352) int local352 = 0; local352 < super.anInterface3_11.method6178(); local352++) {
					@Pc(360) Class224 local360 = super.anInterface3_11.method6177(local352);
					if (local360 != null) {
						this.aNativeInterface3.initTextureMetrics(local352, local360.aByte100, local360.aByte99);
					}
				}
			}
		} catch (@Pc(395) Throwable local395) {
			local395.printStackTrace();
			this.method7935();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
	public final void method7955() {
		if (this.anInt9716 == 8) {
			return;
		}
		this.method7979();
		this.method7989(true);
		this.method8065(true);
		this.method8022(true);
		this.method7990(1);
		this.anInt9716 = 8;
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
	@Override
	public final void method7895(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)V")
	private void method7956() {
		this.method7975();
		if (this.aClass31_3 != null) {
			this.aClass31_3.method8596();
		}
	}

	@OriginalMember(owner = "client!pj", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9741 = arg3;
		this.aBoolean669 = true;
		this.anInt9728 = arg1;
		this.anInt9710 = arg2;
		this.anInt9732 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
	protected abstract void method7957();

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
	protected abstract void method7958();

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "()Z")
	@Override
	public final boolean method7924() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(II)I")
	@Override
	public final int method7943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "(I)V")
	private void method7959() {
		this.aFloat247 = (float) this.anInt9738;
	}

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7909() {
		return this.aBoolean676;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!bc;)V")
	public final void method7960(@OriginalArg(1) Class26_Sub1 arg0) {
		this.aClass26_Sub1_15.method6447(arg0);
		this.aBoolean666 = false;
		this.method8053();
	}

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "()Lclient!qja;")
	@Override
	public final Class26 method7923() {
		return this.aClass26_Sub1_21;
	}

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "(I)V")
	private void method7961() {
		this.method8067(0, this.anInterface10_13);
		this.method8000(this.aClass201_18);
		this.method8072(0, Static41.aClass54_1, 1);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIZI)V")
	public final void method7962(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anInt9709 != arg1 || this.aBoolean669 != this.aBoolean683) {
			@Pc(20) Interface21 local20 = null;
			@Pc(22) int local22 = 0;
			@Pc(24) byte local24 = 0;
			@Pc(26) int local26 = 0;
			@Pc(33) int local33 = this.aBoolean669 ? 3 : 0;
			if (arg1 < 0) {
				this.method8071();
			} else {
				local20 = this.aClass171_3.method3750(arg1);
				@Pc(55) Class224 local55 = super.anInterface3_11.method6177(arg1);
				if (local55.aByte98 == 0 && local55.aByte97 == 0) {
					this.method8071();
				} else {
					@Pc(71) int local71 = local55.aBoolean455 ? 64 : 128;
					@Pc(75) int local75 = local71 * 50;
					@Pc(79) Class26_Sub1 local79 = this.method8050();
					local79.method793((float) (local55.aByte98 * (this.anInt9719 % local75)) / (float) local75, 0.0F, (float) (this.anInt9719 % local75 * local55.aByte97) / (float) local75);
					this.method8041(Static658.aClass70_6);
				}
				if (!this.aBoolean669) {
					local26 = local55.anInt6488;
					local24 = local55.aByte94;
					local33 = local55.aByte96;
				}
				local22 = local55.anInt6486;
			}
			this.method8034(local33, arg0, arg2, local26, local24);
			if (this.aClass31_3 == null) {
				this.method8007(local20);
				this.method8078(local22);
			} else {
				this.aClass31_3.method8588(local22, local20);
			}
			this.anInt9709 = arg1;
			this.aBoolean683 = this.aBoolean669;
		}
		this.anInt9716 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BZ)Lclient!hl;")
	public abstract Interface10 method7963(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7898(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas13) {
			local5 = this.anObject20;
		} else if (this.aHashtable7.containsKey(arg0)) {
			local5 = this.aHashtable7.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method7964(local5, arg0);
		if (this.aCanvas12 == arg0) {
			this.method8021();
		}
	}

	@OriginalMember(owner = "client!pj", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Interface21 local9 = local6.anInterface21_2;
		this.method7978();
		this.method8007(local9);
		this.method7990(1);
		this.method7969(Static461.aClass87_5, Static461.aClass87_5);
		this.method8069(0, Static490.aClass169_6);
		this.method8048(arg0);
		this.aClass26_Sub1_15.method790((float) this.anInt9683, (float) this.anInt9590, 0.0F);
		this.method8036();
		this.aClass26_Sub1Array3[0].method790(local9.method9037((float) this.anInt9683), local9.method9032((float) this.anInt9590), 1.0F);
		this.aClass26_Sub1Array3[0].method797(local9.method9037((float) -arg2), 0.0F, local9.method9032((float) -arg3));
		this.aClass70Array3[0] = Static658.aClass70_6;
		this.method7956();
		this.method7968();
		this.method8071();
		this.method8069(0, Static201.aClass169_3);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method7964(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!pj", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat235 != arg0) {
			this.aFloat235 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method8063();
			this.method8015();
		}
	}

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "(I)V")
	private void method7965() {
		if (Static120.aClass141_7 == this.aClass141_8) {
			return;
		}
		@Pc(17) Class141 local17 = this.aClass141_8;
		this.aClass141_8 = Static120.aClass141_7;
		if (local17.method3375()) {
			this.method8017();
		}
		this.method7994();
		this.aFloatArray74 = this.aFloatArray77;
		this.method7974();
		this.anInt9716 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "(I)V")
	public final void method7966() {
		if (this.anInt9716 == 16) {
			return;
		}
		this.method7996();
		this.method7989(true);
		this.method8065(true);
		this.method8022(true);
		this.method7990(1);
		this.anInt9716 = 16;
	}

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "(I)V")
	protected abstract void method7967();

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method7927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method8013();
		this.method7981();
		this.method8048(arg4);
		this.method8069(0, Static490.aClass169_6);
		this.method7971(0, Static490.aClass169_6);
		this.method7990(arg5);
		this.aClass26_Sub1_15.method790((float) (arg2 - 1), (float) (arg3 - 1), 1.0F);
		this.aClass26_Sub1_15.method797((float) arg0 - local7, 0.0F, (float) arg1 - local7);
		this.method8036();
		this.method8008(false);
		this.method7997(4, Static360.aClass54_5);
		this.method8008(true);
		this.method7971(0, Static201.aClass169_3);
		this.method8069(0, Static201.aClass169_3);
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
	public final void method7968() {
		this.method7997(2, Static337.aClass54_4);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!dba;IIII)Lclient!ka;")
	@Override
	public final Class80 method7901(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class80_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "()Z")
	@Override
	public final boolean method7888() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ef;Lclient!ef;I)V")
	public final void method7969(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class87 arg1) {
		@Pc(12) boolean local12 = false;
		if (this.aClass87Array5[this.anInt9739] != arg0) {
			this.aClass87Array5[this.anInt9739] = arg0;
			this.method8012();
			local12 = true;
		}
		if (arg1 != this.aClass87Array6[this.anInt9739]) {
			this.aClass87Array6[this.anInt9739] = arg1;
			this.method8014();
			local12 = true;
		}
		if (local12) {
			this.anInt9716 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!ad;)V")
	public abstract void method7970(@OriginalArg(1) Class7 arg0);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!ip;B)V")
	public final void method7971(@OriginalArg(0) int arg0, @OriginalArg(1) Class169 arg1) {
		this.method7987(arg1, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt9726;
		arg0[1] = this.anInt9725;
		arg0[3] = this.anInt9707;
		arg0[0] = this.bf;
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(B)V")
	protected abstract void method7972();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method7940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(B)V")
	public final void method7973() {
		if (Static145.aClass141_4 == this.aClass141_8) {
			return;
		}
		@Pc(18) Class141 local18 = this.aClass141_8;
		this.aClass141_8 = Static145.aClass141_4;
		if (local18.method3375()) {
			this.method8017();
		}
		this.anInt9716 &= 0xFFFFFFE0;
		this.aFloatArray74 = this.aFloatArray75;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)Lclient!za;")
	@Override
	public final Class14_Sub7 method7875(@OriginalArg(0) int arg0) {
		@Pc(8) Class14_Sub7_Sub2 local8 = new Class14_Sub7_Sub2(arg0);
		this.aClass262_65.method6314(local8);
		return local8;
	}

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "()Lclient!qja;")
	@Override
	public final Class26 method7918() {
		return new Class26_Sub1();
	}

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "(I)V")
	private void method7974() {
		this.method8032();
		if (this.aClass31_3 != null) {
			this.aClass31_3.method8598();
		}
	}

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "(I)V")
	protected abstract void method7975();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!kd;)V")
	@Override
	public final void method7917(@OriginalArg(0) Class196 arg0) {
		this.aClass159_3.method3615(arg0, -1, this);
	}

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "(I)V")
	public abstract void method7976();

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
	@Override
	public final void method7913(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "()V")
	@Override
	protected void method7905() {
		if (this.aBoolean681) {
			return;
		}
		for (@Pc(13) Class14 local13 = this.aClass262_65.method6318(); local13 != null; local13 = this.aClass262_65.method6311()) {
			((Class14_Sub7_Sub2) local13).method1550();
		}
		@Pc(30) Enumeration local30 = this.aHashtable7.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method8085(this.aHashtable7.get(local36), local36);
		}
		Static349.method5327(true, false);
		this.aNativeInterface3.release();
		this.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "(I)V")
	public final void method7977() {
		this.aClass26_Sub1_15.method6459();
		this.aBoolean666 = true;
		this.method8053();
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7873() {
		return false;
	}

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "(I)V")
	public final void method7978() {
		if (this.anInt9716 == 2) {
			return;
		}
		this.method7965();
		this.method7989(false);
		this.method8077(false);
		this.method8065(false);
		this.method8022(false);
		this.method7962(false, -2, false);
		this.anInt9716 = 2;
	}

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "(I)V")
	private void method7979() {
		if (Static585.aClass141_9 == this.aClass141_8) {
			return;
		}
		@Pc(14) Class141 local14 = this.aClass141_8;
		this.aClass141_8 = Static585.aClass141_9;
		if (!local14.method3375()) {
			this.method8017();
		}
		this.method8057();
		this.aFloatArray74 = this.aFloatArray76;
		this.method7974();
		this.anInt9716 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!dk;IIILclient!cfa;B)V")
	public abstract void method7980(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class54 arg5);

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(B)V")
	private void method7981() {
		if (this.anInt9716 == 1) {
			return;
		}
		this.method7965();
		this.method7989(false);
		this.method8077(false);
		this.method8065(false);
		this.method8022(false);
		this.method7962(false, -2, false);
		this.method8078(1);
		this.method8007(this.anInterface15_3);
		this.anInt9716 = 1;
	}

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "()I")
	@Override
	public final int method7937() {
		return this.anInt9722 - 2;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BZI[II)Lclient!oga;")
	public final Interface21 method7982(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		return this.method8075(0, arg2, 0, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZB)V")
	public final void method7983(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean671 != arg0) {
			this.aBoolean671 = arg0;
			this.method8054();
		}
	}

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "(B)V")
	protected abstract void method7984();

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "(I)I")
	public final int method7985() {
		return this.anInt9732;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!us;Z)Lclient!jd;")
	@Override
	public final Class20 method7951(@OriginalArg(0) Class356 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(132) Class20 local132;
		if (arg0.anInt10341 == 0 || arg0.anInt10343 == 0) {
			local132 = this.method7885(1, 1, new int[1], 1);
		} else {
			@Pc(24) int[] local24 = new int[arg0.anInt10341 * arg0.anInt10343];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(33) int local33;
			@Pc(37) int local37;
			if (arg0.aByteArray126 == null) {
				for (local33 = 0; local33 < arg0.anInt10343; local33++) {
					for (local37 = 0; local37 < arg0.anInt10341; local37++) {
						@Pc(95) int local95 = arg0.anIntArray755[arg0.aByteArray127[local26++] & 0xFF];
						local24[local28++] = local95 == 0 ? 0 : local95 | 0xFF000000;
					}
				}
			} else {
				for (local33 = 0; local33 < arg0.anInt10343; local33++) {
					for (local37 = 0; local37 < arg0.anInt10341; local37++) {
						local24[local28++] = arg0.anIntArray755[arg0.aByteArray127[local26] & 0xFF] | arg0.aByteArray126[local26] << 24;
						local26++;
					}
				}
			}
			local132 = this.method7885(arg0.anInt10343, arg0.anInt10341, local24, arg0.anInt10341);
		}
		local132.method7409(arg0.anInt10340, arg0.anInt10342, arg0.anInt10344, arg0.anInt10345);
		return local132;
	}

	@OriginalMember(owner = "client!pj", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9712 = arg0;
		this.anInt9715 = arg1;
		this.anInt9742 = arg2;
		this.anInt9735 = arg3;
		this.method8061();
		this.method8080();
		this.method7973();
		this.method8044();
	}

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "(I)V")
	protected final void method7986() {
		@Pc(17) Enumeration local17 = this.aHashtable7.keys();
		while (local17.hasMoreElements()) {
			@Pc(23) Canvas local23 = (Canvas) local17.nextElement();
			this.method8085(this.aHashtable7.get(local23), local23);
		}
		this.anInterface10_14.method5675();
		this.anInterface10_13.method5675();
		this.anInterface10_15.method5675();
		this.aClass80_Sub1_25.method2053();
		this.aClass80_Sub1_27.method2053();
		this.aClass80_Sub1_23.method2053();
		this.aClass80_Sub1_26.method2053();
		this.aClass80_Sub1_30.method2053();
		this.aClass159_3.method3612();
		this.anInterface4_6.method5675();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ip;ZII)V")
	protected abstract void method7987(@OriginalArg(0) Class169 arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "()Z")
	@Override
	public final boolean method7868() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		@Pc(17) float local17 = 0.0F;
		@Pc(19) float local19 = 1.0F;
		if (local9 != 0.0F || local15 != 0.0F) {
			local19 = (float) Math.sqrt((double) (local9 * local9 + local15 * local15));
			local17 = (float) Math.atan2((double) local15, (double) local9);
		}
		this.method7981();
		this.method8048(arg4);
		this.method8069(0, Static490.aClass169_6);
		this.method7971(0, Static490.aClass169_6);
		this.method7990(0);
		this.aClass26_Sub1_15.method790(local19, (float) arg5, 1.0F);
		this.aClass26_Sub1_15.method6443(0, -arg5 / 2, 0);
		this.aClass26_Sub1_15.method6446((int) ((double) local17 * 2607.5945876176133D) & 0x3FFF);
		this.aClass26_Sub1_15.method6443(arg0, arg1, 0);
		this.method8036();
		this.method8008(false);
		this.method7968();
		this.method8008(true);
		this.method7971(0, Static201.aClass169_3);
		this.method8069(0, Static201.aClass169_3);
	}

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
	@Override
	public final void method7926(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "(I)I")
	public final int method7988() {
		return this.anInt9728;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZZ)V")
	public final void method7989(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean680) {
			this.aBoolean680 = arg0;
			this.method7972();
			this.anInt9716 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean669 = false;
	}

	@OriginalMember(owner = "client!pj", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt9712, this.anInt9715, this.anInt9742, this.anInt9735 };
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(IIIIII)Lclient!qaa;")
	@Override
	public final Class144 method7928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class144_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V")
	public final void method7990(@OriginalArg(1) int arg0) {
		if (this.anInt9714 == arg0) {
			return;
		}
		@Pc(24) Class105 local24;
		@Pc(20) boolean local20;
		@Pc(22) boolean local22;
		if (arg0 == 1) {
			local20 = true;
			local22 = true;
			local24 = Static175.aClass105_1;
		} else if (arg0 == 2) {
			local24 = Static237.aClass105_3;
			local22 = false;
			local20 = true;
		} else if (arg0 == 128) {
			local20 = true;
			local22 = true;
			local24 = Static585.aClass105_7;
		} else {
			local22 = false;
			local20 = false;
			local24 = Static232.aClass105_2;
		}
		if (local22 != this.aBoolean674) {
			this.aBoolean674 = local22;
			this.method8024();
		}
		if (this.aBoolean670 != local20) {
			this.aBoolean670 = local20;
			this.method8074();
		}
		if (local24 != this.aClass105_6) {
			this.aClass105_6 = local24;
			this.method8038();
		}
		this.anInt9716 &= 0xFFFFFFE3;
		this.anInt9714 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method7932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) float local12 = (float) -arg0 + (float) arg2;
		@Pc(18) float local18 = (float) arg3 - (float) arg1;
		@Pc(39) float local39;
		if (local12 == 0.0F && local18 == 0.0F) {
			local12 = 1.0F;
		} else {
			local39 = (float) (1.0D / Math.sqrt((double) (local12 * local12 + local18 * local18)));
			local18 *= local39;
			local12 *= local39;
		}
		this.method7981();
		this.method8048(arg4);
		this.method8069(0, Static490.aClass169_6);
		this.method7971(0, Static490.aClass169_6);
		this.method7990(1);
		this.method7977();
		@Pc(81) int local81 = arg7 % (arg5 + arg6);
		this.method8008(false);
		local39 = (float) arg5 * local12;
		@Pc(95) float local95 = (float) arg5 * local18;
		@Pc(97) float local97 = 0.0F;
		@Pc(99) float local99 = 0.0F;
		@Pc(101) float local101 = local39;
		@Pc(103) float local103 = local95;
		if (arg5 >= local81) {
			local103 = local18 * (float) (arg5 - local81);
			local101 = (float) (arg5 - local81) * local12;
		} else {
			local97 = (float) (arg5 + arg6 - local81) * local12;
			local99 = local18 * (float) (arg5 + arg6 - local81);
		}
		@Pc(153) float local153 = (float) arg0 + local97;
		@Pc(158) float local158 = (float) arg1 + local99;
		@Pc(163) float local163 = (float) arg6 * local12;
		@Pc(168) float local168 = local18 * (float) arg6;
		while (true) {
			if (arg2 > arg0) {
				if ((float) arg2 < local153) {
					break;
				}
				if (local153 + local101 > (float) arg2) {
					local101 = (float) arg2 - local153;
				}
			} else {
				if (local153 < (float) arg2) {
					break;
				}
				if ((float) arg2 > local101 + local153) {
					local101 = (float) arg2 - local153;
				}
			}
			if (arg1 < arg3) {
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
				if ((float) arg3 > local103 + local158) {
					local103 = (float) arg3 - local158;
				}
			}
			if (!this.method8056(local158, 0.0F, local158 + local103, local153, local101 + local153, 0.0F)) {
				return;
			}
			local158 += local103 + local168;
			local153 += local163 + local101;
			this.method7961();
			local101 = local39;
			local103 = local95;
		}
		this.method8008(true);
		this.method7971(0, Static201.aClass169_3);
		this.method8069(0, Static201.aClass169_3);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([I)V")
	@Override
	public final void method7949(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt9590;
		arg0[0] = this.anInt9683;
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(Z)V")
	private void method7991() {
		if (this.aClass31_3 != null) {
			this.aClass31_3.method8597();
		}
		this.method7958();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!vea;Lclient!bja;III)Lclient!oga;")
	public abstract Interface21 method7992(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(FB)V")
	public final void method7993(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat240) {
			this.aFloat240 = arg0;
			this.method8061();
		}
	}

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "(I)V")
	private void method7994() {
		if (this.aBoolean685) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray77;
		if (this.anInt9683 == 0 || this.anInt9590 == 0) {
			local5[2] = 0.0F;
			local5[7] = 0.0F;
			local5[12] = 0.0F;
			local5[11] = 0.0F;
			local5[0] = 1.0F;
			local5[5] = 1.0F;
			local5[4] = 0.0F;
			local5[8] = 0.0F;
			local5[1] = 0.0F;
			local5[15] = 1.0F;
			local5[10] = 1.0F;
			local5[9] = 0.0F;
			local5[6] = 0.0F;
			local5[3] = 0.0F;
			local5[13] = 0.0F;
			local5[14] = 0.0F;
		} else {
			local5[9] = 0.0F;
			local5[11] = 0.0F;
			local5[15] = 1.0F;
			local5[5] = -2.0F / (float) this.anInt9590;
			local5[7] = 0.0F;
			local5[13] = 1.0F;
			local5[2] = 0.0F;
			local5[3] = 0.0F;
			local5[4] = 0.0F;
			local5[8] = 0.0F;
			local5[12] = -1.0F;
			local5[14] = 0.5F;
			local5[6] = 0.0F;
			local5[10] = 0.5F;
			local5[0] = 2.0F / (float) this.anInt9683;
			local5[1] = 0.0F;
		}
		this.aBoolean685 = true;
	}

	@OriginalMember(owner = "client!pj", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass26_Sub1_16.method794((float) arg0, (float) arg2, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt9742 * this.aClass26_Sub1_16.method792((float) arg0, (float) arg1, (float) arg2) / local14);
			local58 = (int) ((float) this.anInt9735 * this.aClass26_Sub1_16.method788((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local40 = this.anInt9712;
			local58 = this.anInt9715;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat241);
		arg3[1] = (int) ((float) local58 - this.aFloat243);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "(B)I")
	public final int method7995() {
		return this.anInt9741;
	}

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "(I)V")
	private void method7996() {
		if (Static84.aClass141_3 == this.aClass141_8) {
			return;
		}
		@Pc(14) Class141 local14 = this.aClass141_8;
		this.aClass141_8 = Static84.aClass141_3;
		if (!local14.method3375()) {
			this.method8017();
		}
		this.method8052();
		this.aFloatArray74 = this.aFloatArray71;
		this.method7974();
		this.anInt9716 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILclient!cfa;)V")
	private void method7997(@OriginalArg(1) int arg0, @OriginalArg(2) Class54 arg1) {
		this.method8067(0, this.anInterface10_14);
		this.method8000(this.aClass201_20);
		this.method8072(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[Lclient!qm;)V")
	@Override
	public final void method7887(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub37[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass14_Sub37Array6[local7] = arg1[local7];
		}
		this.anInt9730 = arg0;
		if (this.aClass141_8.method3375()) {
			this.method8018();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	protected abstract void method7998(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V")
	@Override
	public final void method7930() {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIF)Lclient!qm;")
	@Override
	public final Class14_Sub37 method7871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class14_Sub37_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pj", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt9683 - 1 && arg1 <= 0 && this.anInt9590 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt9726 = arg2 <= this.anInt9683 ? arg2 : 0;
		this.bf = arg0 >= 0 ? arg0 : 0;
		this.anInt9725 = arg1 >= 0 ? arg1 : 0;
		this.anInt9707 = this.anInt9683 >= arg3 ? arg3 : 0;
		if (!this.aBoolean687) {
			this.aBoolean687 = true;
			this.method8045();
		}
		this.method8039();
		this.method8044();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)V")
	public abstract void method7999(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pj", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7981();
		this.method8048(arg3);
		this.method8069(0, Static490.aClass169_6);
		this.method7971(0, Static490.aClass169_6);
		this.method7990(arg4);
		this.aClass26_Sub1_15.method790((float) arg2, (float) arg2, 1.0F);
		this.aClass26_Sub1_15.method6443(arg0, arg1, 0);
		this.method8036();
		this.method8008(false);
		this.method8067(0, this.anInterface10_15);
		this.method8000(this.aClass201_22);
		this.method8072(0, Static337.aClass54_4, 256);
		this.method8008(true);
		this.method7971(0, Static201.aClass169_3);
		this.method8069(0, Static201.aClass169_3);
	}

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "()Z")
	@Override
	public final boolean method7936() {
		return false;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!kq;)V")
	public abstract void method8000(@OriginalArg(1) Class201 arg0);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([FB)[F")
	public final float[] method8001(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray74[0];
		arg0[4] = this.aFloatArray74[1];
		arg0[12] = this.aFloatArray74[3];
		arg0[8] = this.aFloatArray74[2];
		arg0[5] = this.aFloatArray74[5];
		arg0[1] = this.aFloatArray74[4];
		arg0[2] = this.aFloatArray74[8];
		arg0[9] = this.aFloatArray74[6];
		arg0[13] = this.aFloatArray74[7];
		arg0[10] = this.aFloatArray74[10];
		arg0[14] = this.aFloatArray74[11];
		arg0[7] = this.aFloatArray74[13];
		arg0[6] = this.aFloatArray74[9];
		arg0[3] = this.aFloatArray74[12];
		arg0[11] = this.aFloatArray74[14];
		arg0[15] = this.aFloatArray74[15];
		return arg0;
	}

	@OriginalMember(owner = "client!pj", name = "A", descriptor = "(I)Lclient!bc;")
	public final Class26_Sub1 method8002() {
		return this.aClass26_Sub1_19;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIBI[BZLclient!vea;)Lclient!oga;")
	protected abstract Interface21 method8003(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) Class363 arg4);

	@OriginalMember(owner = "client!pj", name = "B", descriptor = "(I)V")
	public final void method8004() {
		if (this.anInt9716 == 4) {
			return;
		}
		this.method7965();
		this.method7989(false);
		this.method8077(false);
		this.method8065(false);
		this.method8022(false);
		this.method7962(false, -2, false);
		this.method7990(1);
		this.method8078(0);
		this.anInt9716 = 4;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)Lclient!dk;")
	public final Interface4 method8005(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface4_6.method5669()) {
			this.anInterface4_6.method5678(arg0);
		}
		return this.anInterface4_6;
	}

	@OriginalMember(owner = "client!pj", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7981();
		this.method8048(arg4);
		this.method8069(0, Static490.aClass169_6);
		this.method7971(0, Static490.aClass169_6);
		this.method7990(arg5);
		this.aClass26_Sub1_15.method790((float) arg2, (float) arg3, 1.0F);
		this.aClass26_Sub1_15.method6443(arg0, arg1, 0);
		this.method8036();
		this.method8008(false);
		this.method7968();
		this.method8008(true);
		this.method7971(0, Static201.aClass169_3);
		this.method8069(0, Static201.aClass169_3);
	}

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "(B)Lclient!bc;")
	public final Class26_Sub1 method8006() {
		return this.aClass26_Sub1_15;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!kja;)V")
	public final void method8007(@OriginalArg(1) Interface15 arg0) {
		if (this.anInterface15Array3[this.anInt9739] == arg0) {
			return;
		}
		this.anInterface15Array3[this.anInt9739] = arg0;
		if (arg0 == null) {
			this.method7967();
		} else {
			arg0.method9088();
		}
		this.anInt9716 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(ZZ)V")
	public abstract void method8008(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!pj", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt9731 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt9731++;
		}
		this.anInt9708 = 0x1 << this.anInt9731;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7910(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas13) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.method8085(this.aHashtable7.get(arg0), arg0);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!pj", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass26_Sub1_16.method794((float) arg0, (float) arg2, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt9742 * this.aClass26_Sub1_16.method792((float) arg0, (float) arg1, (float) arg2) / local14);
			local58 = (int) ((float) this.anInt9735 * this.aClass26_Sub1_16.method788((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local58 = this.anInt9715;
			local40 = this.anInt9712;
		}
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local40 - this.aFloat241);
		arg3[1] = (int) ((float) local58 - this.aFloat243);
	}

	@OriginalMember(owner = "client!pj", name = "D", descriptor = "(I)V")
	protected abstract void method8010();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!bja;Lclient!vea;I)Z")
	public abstract boolean method8011(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class363 arg1);

	@OriginalMember(owner = "client!pj", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7907(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "(I)V")
	@Override
	public final void method7931(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass171_3 != null) {
			this.aClass171_3.method3749();
		}
		this.anInt9736 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt9738;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!qaa;)V")
	@Override
	public final void method7890(@OriginalArg(0) Class144 arg0) {
		this.aClass144_Sub1_3 = (Class144_Sub1) arg0;
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(Z)V")
	protected abstract void method8012();

	@OriginalMember(owner = "client!pj", name = "E", descriptor = "(I)F")
	protected abstract float method8013();

	@OriginalMember(owner = "client!pj", name = "F", descriptor = "(I)V")
	protected abstract void method8014();

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "(B)V")
	protected abstract void method8015();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ie;[Lclient!us;Z)Lclient!da;")
	@Override
	public final Class38 method7870(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class356[] arg1) {
		return new Class38_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!pj", name = "G", descriptor = "(I)Lclient!bc;")
	public final Class26_Sub1 method8016() {
		if (!this.aBoolean684) {
			this.aClass26_Sub1_20.method782(this.aClass26_Sub1_18, this.aClass26_Sub1_15);
			this.aBoolean684 = true;
		}
		return this.aClass26_Sub1_20;
	}

	@OriginalMember(owner = "client!pj", name = "H", descriptor = "(I)V")
	private void method8017() {
		this.aBoolean684 = false;
		if (this.aClass31_3 != null) {
			this.aClass31_3.method8586();
		}
		this.method8027();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7897(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "(I)V")
	protected void method8018() {
		this.anInt9729 = this.anInt9730;
		this.anInt9730 = 0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZ)Lclient!jd;")
	@Override
	public final Class20 method7925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class20_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(Z)V")
	protected void method8019() {
		this.method8037();
	}

	@OriginalMember(owner = "client!pj", name = "J", descriptor = "(I)I")
	public final int method8020() {
		return this.anInt9739;
	}

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "(B)V")
	private void method8021() {
		if (this.aCanvas12 == null) {
			this.anInt9619 = this.anInt9579 = 1;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas12.getSize();
			this.anInt9619 = local14.width;
			this.anInt9579 = local14.height;
		}
		this.anInt9683 = this.anInt9619;
		this.anInt9590 = this.anInt9579;
		this.method8070();
		this.method8080();
		this.method8061();
		this.method8010();
		this.method8044();
		this.method7973();
		this.la();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
	public final void method8022(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean677) {
			this.aBoolean677 = arg0;
			this.method8064();
			this.anInt9716 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([IIIIIZ)Lclient!jd;")
	@Override
	public final Class20 method7938(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class20_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII[[I)Lclient!ks;")
	public abstract Interface16 method8023(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2);

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "(B)V")
	protected abstract void method8024();

	@OriginalMember(owner = "client!pj", name = "K", descriptor = "(I)[F")
	public final float[] method8025() {
		return this.aFloatArray75;
	}

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(Z)V")
	private void method8026() {
		this.aFloatArray76[14] = this.aFloat236;
		this.aFloatArray76[10] = this.aFloat242;
		this.aFloat249 = (this.aFloatArray76[14] - (float) this.anInt9738) / this.aFloatArray76[10];
	}

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "(B)V")
	protected abstract void method8027();

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "(Z)V")
	protected abstract void method8028();

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "(B)V")
	private void method8029() {
		this.anInterface10_15 = this.method7963(false);
		this.anInterface10_15.method3994(3096, 12);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface10_15.method3996();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method8079(local28);
				local35.b(0.0F);
				local35.b(0.0F);
				local35.b(0.0F);
				for (@Pc(46) int local46 = 0; local46 <= 256; local46++) {
					@Pc(57) double local57 = (double) (local46 * 2) * 3.141592653589793D / 256.0D;
					@Pc(61) float local61 = (float) Math.cos(local57);
					@Pc(65) float local65 = (float) Math.sin(local57);
					if (Stream.c()) {
						local35.b(local65);
						local35.b(local61);
						local35.b(0.0F);
					} else {
						local35.a(local65);
						local35.a(local61);
						local35.a(0.0F);
					}
				}
				local35.b();
				if (this.anInterface10_15.method3995()) {
					break;
				}
			}
		}
		this.aClass201_22 = this.method8040(new Class388[] { new Class388(Static256.aClass170_1) });
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[BZZLclient!vea;)Lclient!oga;")
	public final Interface21 method8030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class363 arg4) {
		return this.method8003(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!pj", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass26_Sub1_16.aFloat25 + (float) arg2 * this.aClass26_Sub1_16.aFloat21 + this.aClass26_Sub1_16.aFloat28 * (float) arg1 + (float) arg0 * this.aClass26_Sub1_16.aFloat20;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg4 * this.aClass26_Sub1_16.aFloat28 + this.aClass26_Sub1_16.aFloat20 * (float) arg3 + (float) arg5 * this.aClass26_Sub1_16.aFloat21 + this.aClass26_Sub1_16.aFloat25;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt9737 > local32 && local63 < (float) this.anInt9737) {
			local7 |= 0x10;
		} else if ((float) this.anInt9738 < local32 && local63 > (float) this.anInt9738) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass26_Sub1_16.aFloat23 + (float) arg2 * this.aClass26_Sub1_16.aFloat19 + this.aClass26_Sub1_16.aFloat26 * (float) arg1 + (float) arg0 * this.aClass26_Sub1_16.aFloat29) * (float) this.anInt9742 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt9742 * (this.aClass26_Sub1_16.aFloat23 + this.aClass26_Sub1_16.aFloat19 * (float) arg5 + (float) arg3 * this.aClass26_Sub1_16.aFloat29 + (float) arg4 * this.aClass26_Sub1_16.aFloat26) / local63);
		if (this.aFloat241 > (float) local135 && this.aFloat241 > (float) local167) {
			local7 |= 0x1;
		} else if (this.aFloat239 < (float) local135 && (float) local167 > this.aFloat239) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt9735 * (this.aClass26_Sub1_16.aFloat18 + this.aClass26_Sub1_16.aFloat27 * (float) arg2 + (float) arg1 * this.aClass26_Sub1_16.aFloat24 + (float) arg0 * this.aClass26_Sub1_16.aFloat22) / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt9735 * (this.aClass26_Sub1_16.aFloat18 + this.aClass26_Sub1_16.aFloat27 * (float) arg5 + this.aClass26_Sub1_16.aFloat22 * (float) arg3 + this.aClass26_Sub1_16.aFloat24 * (float) arg4) / local63);
		if (this.aFloat243 > (float) local233 && (float) local265 < this.aFloat243) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat237 && (float) local265 > this.aFloat237) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)Lclient!nm;")
	protected Class31 method8031(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class31_Sub4(this);
		} else if (arg0 == 1) {
			return new Class31_Sub3(this);
		} else if (arg0 == 2) {
			return new Class31_Sub7(this, this.aClass353_6);
		} else if (arg0 == 7) {
			return new Class31_Sub9(this);
		} else {
			return new Class31_Sub10(this);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!kd;I)V")
	@Override
	public final void method7942(@OriginalArg(0) Class196 arg0, @OriginalArg(1) int arg1) {
		this.aClass159_3.method3615(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	@Override
	public void method7882(@OriginalArg(0) int arg0) {
		if (this.aClass171_3 != null) {
			this.aClass171_3.method3748();
		}
		this.anInt9719 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "(B)V")
	protected abstract void method8032();

	@OriginalMember(owner = "client!pj", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.bf < arg0) {
			local5 = true;
			this.bf = arg0;
		}
		if (arg2 < this.anInt9726) {
			this.anInt9726 = arg2;
			local5 = true;
		}
		if (arg1 > this.anInt9725) {
			this.anInt9725 = arg1;
			local5 = true;
		}
		if (arg3 < this.anInt9707) {
			local5 = true;
			this.anInt9707 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean687) {
			this.aBoolean687 = true;
			this.method8045();
		}
		this.method8039();
		this.method8044();
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(37) float local37 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local16 * local16)));
			local16 *= local37;
			local10 *= local37;
		}
		if (!this.method8056((float) arg1, 0.0F, (float) arg3 + local16, (float) arg0, (float) arg2 + local10, 0.0F)) {
			return;
		}
		this.method7981();
		this.method8048(arg4);
		this.method8069(0, Static490.aClass169_6);
		this.method7971(0, Static490.aClass169_6);
		this.method7990(arg5);
		this.method7977();
		this.method8008(false);
		this.method7961();
		this.method8008(true);
		this.method7971(0, Static201.aClass169_3);
		this.method8069(0, Static201.aClass169_3);
	}

	@OriginalMember(owner = "client!pj", name = "L", descriptor = "(I)V")
	protected abstract void method8033();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZIZII)V")
	private void method8034(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) boolean local12 = arg2 & this.method7883();
		if (!local12 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			arg0 = 2;
			arg3 = 1;
			arg4 = 0;
		}
		if (arg0 != 0 && arg1) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt9713 != arg0) {
			if (this.anInt9713 != 0) {
				this.aClass31Array3[this.anInt9713 & Integer.MAX_VALUE].method8591();
			}
			if (arg0 == 0) {
				this.aClass31_3 = null;
			} else {
				this.aClass31_3 = this.aClass31Array3[arg0 & Integer.MAX_VALUE];
				this.aClass31_3.method8595(arg1);
				this.aClass31_3.method8592(arg1);
				this.aClass31_3.method8587(arg4, arg3);
			}
			this.anInt9713 = arg0;
			this.anInt9743 = arg3;
			this.anInt9711 = arg4;
		} else if (this.anInt9713 != 0) {
			this.aClass31Array3[Integer.MAX_VALUE & this.anInt9713].method8592(arg1);
			if (arg4 != this.anInt9711 || this.anInt9743 != arg3) {
				this.aClass31Array3[this.anInt9713 & Integer.MAX_VALUE].method8587(arg4, arg3);
				this.anInt9711 = arg4;
				this.anInt9743 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "(Z)I")
	public final int method8035() {
		return this.anInt9710;
	}

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "(Z)V")
	public final void method8036() {
		this.aBoolean666 = false;
		this.method8053();
	}

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "()Z")
	@Override
	public final boolean method7881() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt9737;
	}

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "(B)V")
	private void method8037() {
		this.method8063();
		this.method8033();
		this.method8062();
		this.method8018();
		this.method7976();
		this.method8015();
		this.method8054();
		this.method7984();
		this.method8064();
		this.method7972();
		this.method7958();
		this.method8074();
		this.method8038();
		this.method8024();
		for (@Pc(58) int local58 = this.anInt9721 - 1; local58 >= 0; local58--) {
			this.method8081(local58);
			this.method8012();
			this.method8014();
			this.method8071();
		}
		this.method7957();
		this.method8010();
		this.method8032();
		this.method8084();
		this.method8027();
	}

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7883() {
		return this.aClass31Array3[3].method8593();
	}

	@OriginalMember(owner = "client!pj", name = "M", descriptor = "(I)V")
	protected abstract void method8038();

	@OriginalMember(owner = "client!pj", name = "N", descriptor = "(I)V")
	protected abstract void method8039();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[Lclient!wk;)Lclient!kq;")
	public abstract Class201 method8040(@OriginalArg(1) Class388[] arg0);

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7904() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!de;)V")
	public final void method8041(@OriginalArg(1) Class70 arg0) {
		this.aClass70Array3[this.anInt9739] = arg0;
		this.method7956();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BB)V")
	public final void method8042(@OriginalArg(0) byte arg0) {
		this.method8048(arg0 << 24 | arg0 << 16 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method8043(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap6.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "O", descriptor = "(I)V")
	private void method8044() {
		this.aFloat243 = (float) (this.anInt9725 - this.anInt9715);
		this.aFloat241 = (float) (this.bf - this.anInt9712);
		this.aFloat237 = (float) (this.anInt9707 - this.anInt9715);
		this.aFloat239 = (float) (this.anInt9726 - this.anInt9712);
	}

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "(B)V")
	protected abstract void method8045();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!qja;)V")
	@Override
	public final void method7950(@OriginalArg(0) Class26 arg0) {
		this.aClass26_Sub1_16 = (Class26_Sub1) arg0;
		this.aClass26_Sub1_18.method6447(this.aClass26_Sub1_16);
		this.aClass26_Sub1_18.method791();
		this.aClass26_Sub1_19.method786(this.aClass26_Sub1_18);
		this.aClass26_Sub1_17.method786(this.aClass26_Sub1_16);
		if (this.aClass141_8.method3375()) {
			this.method8017();
		}
	}

	@OriginalMember(owner = "client!pj", name = "P", descriptor = "(I)Lclient!ks;")
	public final Interface16 method8046() {
		return this.aClass144_Sub1_3 == null ? null : this.aClass144_Sub1_3.method6303();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZZBLclient!ip;I)V")
	public abstract void method8047(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class169 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(BI)V")
	public final void method8048(@OriginalArg(1) int arg0) {
		if (this.anInt9744 != arg0) {
			this.anInt9744 = arg0;
			this.method7957();
		}
	}

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "(Z)V")
	protected final void method8049() {
		@Pc(15) Hashtable local15 = new Hashtable();
		if (this.aHashtable7 != null && !this.aHashtable7.isEmpty()) {
			@Pc(26) Enumeration local26 = this.aHashtable7.keys();
			while (local26.hasMoreElements()) {
				@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
				local15.put(local32, this.method8058(local32));
			}
		}
		this.aHashtable7 = local15;
		this.method8086();
		this.method8083();
		this.method8029();
		this.aClass159_3.method3613(this);
	}

	@OriginalMember(owner = "client!pj", name = "Q", descriptor = "(I)Lclient!bc;")
	public final Class26_Sub1 method8050() {
		return this.aClass26_Sub1Array3[this.anInt9739];
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILclient!vea;ZI[FZI)Lclient!oga;")
	protected abstract Interface21 method8051(@OriginalArg(0) int arg0, @OriginalArg(2) Class363 arg1, @OriginalArg(5) float[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!pj", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass26_Sub1_16.method794((float) arg0, (float) arg2, (float) arg1);
		if ((float) this.anInt9737 > local14 || (float) this.anInt9738 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt9742 * this.aClass26_Sub1_16.method792((float) arg0, (float) arg1, (float) arg2) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt9735 * this.aClass26_Sub1_16.method788((float) arg0, (float) arg1, (float) arg2) / (float) arg3);
		arg4[0] = (int) ((float) local58 - this.aFloat241);
		arg4[1] = (int) ((float) local77 - this.aFloat243);
		arg4[2] = (int) local14;
	}

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "(I)V")
	private void method8052() {
		if (this.aBoolean678) {
			return;
		}
		@Pc(15) float[] local15 = this.aFloatArray71;
		@Pc(19) float local19 = (float) this.anInt9737;
		@Pc(23) float local23 = (float) this.anInt9738;
		@Pc(35) float local35 = (float) -this.anInt9715 * this.aFloat240 / (float) this.anInt9735;
		@Pc(47) float local47 = this.aFloat240 * (float) -this.anInt9712 / (float) this.anInt9742;
		@Pc(61) float local61 = (float) (this.anInt9683 - this.anInt9712) * this.aFloat240 / (float) this.anInt9742;
		@Pc(75) float local75 = (float) (this.anInt9590 - this.anInt9715) * this.aFloat240 / (float) this.anInt9735;
		if (local47 == local61 || local35 == local75) {
			local15[2] = 0.0F;
			local15[9] = 0.0F;
			local15[12] = 0.0F;
			local15[3] = 0.0F;
			local15[6] = 0.0F;
			local15[11] = 0.0F;
			local15[1] = 0.0F;
			local15[15] = 1.0F;
			local15[5] = 1.0F;
			local15[14] = 0.0F;
			local15[7] = 0.0F;
			local15[4] = 0.0F;
			local15[13] = 0.0F;
			local15[10] = 1.0F;
			local15[8] = 0.0F;
			local15[0] = 1.0F;
		} else {
			local15[2] = 0.0F;
			local15[0] = 2.0F / (local61 - local47);
			local15[13] = (local35 + local75) / (-local35 + local75);
			local15[10] = 1.0F / (local19 - local23);
			local15[7] = 0.0F;
			local15[3] = 0.0F;
			local15[1] = 0.0F;
			local15[8] = 0.0F;
			local15[12] = (local61 + local47) / (-local61 + local47);
			local15[6] = 0.0F;
			local15[15] = 1.0F;
			local15[5] = 2.0F / (local75 - local35);
			local15[9] = 0.0F;
			local15[14] = local19 / (local19 - local23);
			local15[11] = 0.0F;
			local15[4] = 0.0F;
		}
		this.method7959();
		this.aBoolean678 = true;
	}

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "(B)V")
	private void method8053() {
		if (this.aClass141_8 == Static120.aClass141_7) {
			@Pc(7) float local7 = this.method8013();
			this.aClass26_Sub1_15.method797(local7, 0.0F, local7);
		}
		this.aBoolean684 = false;
		this.method8084();
		if (this.aClass31_3 != null) {
			this.aClass31_3.method8589();
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7939(@OriginalArg(0) Canvas arg0) {
		this.aCanvas12 = null;
		this.anObject20 = null;
		if (arg0 == null || arg0 == this.aCanvas13) {
			this.anObject20 = this.anObject19;
			this.aCanvas12 = this.aCanvas13;
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.anObject20 = this.aHashtable7.get(arg0);
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.anObject20 == null) {
			throw new RuntimeException();
		}
		this.method7998(this.anObject20, this.aCanvas12);
		this.method8021();
	}

	@OriginalMember(owner = "client!pj", name = "S", descriptor = "(I)V")
	protected abstract void method8054();

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt9737 == arg0 && arg1 == this.anInt9738) {
			return;
		}
		this.anInt9737 = arg0;
		this.anInt9738 = arg1;
		this.method8080();
		this.method8061();
		this.method7991();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILclient!vea;[FZ)Lclient!oga;")
	public final Interface21 method8055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class363 arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) boolean arg4) {
		return this.method8051(arg0, arg2, arg3, arg4, arg1);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(FFFFFBF)Z")
	private boolean method8056(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface10_13.method3996();
		if (local9 == null) {
			return false;
		}
		@Pc(23) Stream local23 = this.method8079(local9);
		if (Stream.c()) {
			local23.b(arg3);
			local23.b(arg0);
			local23.b(arg5);
			local23.b(arg4);
			local23.b(arg2);
			local23.b(arg1);
		} else {
			local23.a(arg3);
			local23.a(arg0);
			local23.a(arg5);
			local23.a(arg4);
			local23.a(arg2);
			local23.a(arg1);
		}
		local23.b();
		return this.anInterface10_13.method3995();
	}

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "()Z")
	@Override
	public final boolean method7899() {
		return false;
	}

	@OriginalMember(owner = "client!pj", name = "T", descriptor = "(I)V")
	private void method8057() {
		if (this.aBoolean672) {
			return;
		}
		@Pc(8) float[] local8 = this.aFloatArray76;
		@Pc(20) float local20 = (float) (this.anInt9737 * -this.anInt9712) / (float) this.anInt9742;
		@Pc(34) float local34 = (float) ((this.anInt9683 - this.anInt9712) * this.anInt9737) / (float) this.anInt9742;
		@Pc(45) float local45 = (float) (this.anInt9737 * this.anInt9715) / (float) this.anInt9735;
		@Pc(60) float local60 = (float) ((this.anInt9715 - this.anInt9590) * this.anInt9737) / (float) this.anInt9735;
		if (local20 == local34 || local45 == local60) {
			local8[3] = 0.0F;
			local8[8] = 0.0F;
			local8[12] = 0.0F;
			local8[6] = 0.0F;
			local8[5] = 1.0F;
			local8[15] = 1.0F;
			local8[4] = 0.0F;
			local8[13] = 0.0F;
			local8[7] = 0.0F;
			local8[2] = 0.0F;
			local8[9] = 0.0F;
			local8[10] = 1.0F;
			local8[14] = 0.0F;
			local8[0] = 1.0F;
			local8[1] = 0.0F;
			local8[11] = 0.0F;
		} else {
			@Pc(140) float local140 = (float) this.anInt9737 * 2.0F;
			local8[10] = this.aFloat242 = (float) this.anInt9738 / (float) (this.anInt9737 - this.anInt9738);
			local8[8] = (local34 + local20) / (local34 - local20);
			local8[15] = 0.0F;
			local8[6] = 0.0F;
			local8[12] = 0.0F;
			local8[0] = local140 / (local34 - local20);
			local8[11] = -1.0F;
			local8[1] = 0.0F;
			local8[5] = local140 / (local45 - local60);
			local8[13] = 0.0F;
			local8[9] = (local60 + local45) / (local45 - local60);
			local8[3] = 0.0F;
			local8[4] = 0.0F;
			local8[2] = 0.0F;
			local8[7] = 0.0F;
			local8[14] = this.aFloat236 = (float) (this.anInt9738 * this.anInt9737) / (float) (this.anInt9737 - this.anInt9738);
		}
		this.method8026();
		this.aBoolean672 = true;
	}

	@OriginalMember(owner = "client!pj", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt9745;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method8058(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IZ)V")
	public final void method8059(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean679) {
			this.aBoolean679 = arg0;
			this.method8062();
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(BZ)V")
	public final void method8060(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean668 != arg0) {
			this.aBoolean668 = arg0;
			this.method7972();
		}
	}

	@OriginalMember(owner = "client!pj", name = "U", descriptor = "(I)V")
	private void method8061() {
		this.aBoolean678 = false;
		this.method8052();
		if (this.aClass141_8 == Static84.aClass141_3) {
			this.method7974();
		}
	}

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "(B)V")
	protected abstract void method8062();

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "(B)V")
	protected abstract void method8063();

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean686 = arg0;
		this.method8064();
	}

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "(B)V")
	protected abstract void method8064();

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(IZ)V")
	public final void method8065(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean675) {
			this.aBoolean675 = arg0;
			this.method7984();
			this.anInt9716 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "(B)V")
	public final void method8066() {
		this.aClass26_Sub1Array3 = new Class26_Sub1[this.anInt9721];
		this.aClass70Array3 = new Class70[this.anInt9721];
		this.anInterface15Array3 = new Interface15[this.anInt9721];
		this.aClass87Array5 = new Class87[this.anInt9721];
		this.aClass87Array6 = new Class87[this.anInt9721];
		for (@Pc(36) int local36 = 0; local36 < this.anInt9721; local36++) {
			this.aClass87Array6[local36] = Static575.aClass87_7;
			this.aClass87Array5[local36] = Static575.aClass87_7;
			this.aClass70Array3[local36] = Static453.aClass70_3;
			this.aClass26_Sub1Array3[local36] = new Class26_Sub1();
		}
		this.aClass14_Sub37Array6 = new Class14_Sub37[this.anInt9722 - 2];
		this.anInterface15_3 = this.method7992(Static238.aClass363_4, Static47.aClass36_5, 1, 1);
		this.method7916(new Class14_Sub7_Sub2(262144));
		this.aClass201_23 = this.method8040(new Class388[] { new Class388(new Class170[] { Static256.aClass170_1, Static256.aClass170_5 }) });
		this.aClass201_19 = this.method8040(new Class388[] { new Class388(new Class170[] { Static256.aClass170_1, Static256.aClass170_3 }) });
		this.aClass201_21 = this.method8040(new Class388[] { new Class388(Static256.aClass170_1), new Class388(Static256.aClass170_3), new Class388(Static256.aClass170_5), new Class388(Static256.aClass170_2) });
		this.aClass201_17 = this.method8040(new Class388[] { new Class388(Static256.aClass170_1), new Class388(Static256.aClass170_3), new Class388(Static256.aClass170_5) });
		this.aClass80_Sub1_22 = new Class80_Sub1(this, 0, 0, false, false);
		this.aClass80_Sub1_25 = new Class80_Sub1(this, 0, 0, true, true);
		this.aClass80_Sub1_21 = new Class80_Sub1(this, 0, 0, false, false);
		this.aClass80_Sub1_27 = new Class80_Sub1(this, 0, 0, true, true);
		this.aClass80_Sub1_29 = new Class80_Sub1(this, 0, 0, false, false);
		this.aClass80_Sub1_23 = new Class80_Sub1(this, 0, 0, true, true);
		this.aClass80_Sub1_24 = new Class80_Sub1(this, 0, 0, false, false);
		this.aClass80_Sub1_26 = new Class80_Sub1(this, 0, 0, true, true);
		this.aClass80_Sub1_28 = new Class80_Sub1(this, 0, 0, false, false);
		this.aClass80_Sub1_30 = new Class80_Sub1(this, 0, 0, true, true);
		this.aClass159_3 = new Class159(this);
		this.anInterface4_6 = this.method8073(true);
		this.method8049();
		this.aClass353_6 = new Class353(this);
		this.aClass31Array3[1] = this.method8031(1);
		this.aClass31Array3[2] = this.method8031(2);
		this.aClass31Array3[4] = this.method8031(4);
		this.aClass31Array3[5] = this.method8031(5);
		this.aClass31Array3[6] = this.method8031(6);
		this.aClass31Array3[7] = this.method8031(7);
		this.aClass31Array3[3] = this.method8031(3);
		this.aClass31Array3[8] = this.method8031(8);
		this.aClass31Array3[9] = this.method8031(9);
		if (!this.aClass31Array3[2].method8593()) {
			this.aClass31Array3[2] = this.method8031(0);
		}
		if (!this.aClass31Array3[4].method8593()) {
			this.aClass31Array3[4] = this.aClass31Array3[2];
		}
		if (!this.aClass31Array3[8].method8593()) {
			this.aClass31Array3[8] = this.aClass31Array3[4];
		}
		if (!this.aClass31Array3[9].method8593()) {
			this.aClass31Array3[9] = this.aClass31Array3[8];
		}
		this.method8019();
		this.la();
		this.method7948();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBLclient!hl;)V")
	public abstract void method8067(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1);

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(II)I")
	@Override
	public final int method7922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!pj", name = "V", descriptor = "(I)V")
	public final void method8068() {
		this.method7973();
		this.method7974();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBLclient!ip;)V")
	public final void method8069(@OriginalArg(0) int arg0, @OriginalArg(2) Class169 arg1) {
		this.method8047(false, false, arg1, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method7929() {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static618.method8668(arg2, arg3, this, arg1, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "(B)V")
	private void method8070() {
		this.aBoolean685 = false;
		if (Static120.aClass141_7 == this.aClass141_8) {
			this.method7994();
			this.method7974();
		}
	}

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "(B)V")
	public final void method8071() {
		if (Static453.aClass70_3 != this.aClass70Array3[this.anInt9739]) {
			this.aClass70Array3[this.anInt9739] = Static453.aClass70_3;
			this.aClass26_Sub1Array3[this.anInt9739].method6459();
			this.method7956();
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "()Lclient!qja;")
	@Override
	public final Class26 method7872() {
		return this.aClass26_Sub1_16;
	}

	@OriginalMember(owner = "client!pj", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean669) {
			throw new RuntimeException("");
		}
		this.anInt9728 = arg1;
		this.anInt9732 = arg0;
		this.anInt9741 = arg3;
		this.anInt9710 = arg2;
		if (this.aBoolean683) {
			this.aClass31Array3[3].method8599();
			this.aClass31Array3[3].method8597();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZILclient!cfa;I)V")
	public abstract void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Class54 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(IZ)Lclient!dk;")
	public abstract Interface4 method8073(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "(Z)V")
	protected abstract void method8074();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[IIIIBZ)Lclient!oga;")
	public abstract Interface21 method8075(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!pj", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7907(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "()V")
	@Override
	public final void method7906() {
		if (this.aClass171_3 != null) {
			this.aClass171_3.method3749();
		}
	}

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "(Z)Lclient!bc;")
	public final Class26_Sub1 method8076() {
		return this.aClass26_Sub1_18;
	}

	@OriginalMember(owner = "client!pj", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIZ)Lclient!jd;")
	@Override
	public final Class20 method7900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class20_Sub2 local11 = new Class20_Sub2(this, arg2, arg3, arg4);
		local11.method7395(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(ZI)V")
	public final void method8077(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean667 != arg0) {
			this.aBoolean667 = arg0;
			this.method8062();
			this.anInt9716 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pj", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9723 == arg0 && this.anInt9727 == arg1 && this.anInt9734 == arg2) {
			return;
		}
		this.anInt9723 = arg0;
		this.anInt9727 = arg1;
		this.anInt9734 = arg2;
		this.method7991();
		this.method7972();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method7916(@OriginalArg(0) Class14_Sub7 arg0) {
		this.aNativeHeap6 = ((Class14_Sub7_Sub2) arg0).aNativeHeap2;
		this.aNativeHeapBuffer8 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(II)V")
	public final void method8078(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method7969(Static461.aClass87_5, Static461.aClass87_5);
		} else if (arg0 == 0) {
			this.method7969(Static575.aClass87_7, Static575.aClass87_7);
		} else if (arg0 == 2) {
			this.method7969(Static129.aClass87_4, Static461.aClass87_5);
		} else if (arg0 == 3) {
			this.method7969(Static15.aClass87_1, Static575.aClass87_7);
		} else if (arg0 == 4) {
			this.method7969(Static543.aClass87_6, Static543.aClass87_6);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method8079(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "(B)V")
	private void method8080() {
		this.aBoolean672 = false;
		this.method8057();
		if (this.aClass141_8 == Static585.aClass141_9) {
			this.method7974();
		}
	}

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass26_Sub1_16.aFloat25 + (float) arg2 * this.aClass26_Sub1_16.aFloat21 + (float) arg1 * this.aClass26_Sub1_16.aFloat28 + this.aClass26_Sub1_16.aFloat20 * (float) arg0;
		@Pc(57) float local57 = this.aClass26_Sub1_16.aFloat25 + this.aClass26_Sub1_16.aFloat21 * (float) arg5 + (float) arg3 * this.aClass26_Sub1_16.aFloat20 + this.aClass26_Sub1_16.aFloat28 * (float) arg4;
		if ((float) this.anInt9737 > local32 && (float) this.anInt9737 > local57) {
			local7 |= 0x10;
		} else if ((float) this.anInt9738 < local32 && local57 > (float) this.anInt9738) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass26_Sub1_16.aFloat23 + (float) arg2 * this.aClass26_Sub1_16.aFloat19 + this.aClass26_Sub1_16.aFloat29 * (float) arg0 + this.aClass26_Sub1_16.aFloat26 * (float) arg1) * (float) this.anInt9742 / (float) arg6);
		@Pc(157) int local157 = (int) ((this.aClass26_Sub1_16.aFloat23 + (float) arg5 * this.aClass26_Sub1_16.aFloat19 + this.aClass26_Sub1_16.aFloat26 * (float) arg4 + (float) arg3 * this.aClass26_Sub1_16.aFloat29) * (float) this.anInt9742 / (float) arg6);
		if ((float) local124 < this.aFloat241 && (float) local157 < this.aFloat241) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat239 && (float) local157 > this.aFloat239) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass26_Sub1_16.aFloat22 * (float) arg0 + (float) arg1 * this.aClass26_Sub1_16.aFloat24 + (float) arg2 * this.aClass26_Sub1_16.aFloat27 + this.aClass26_Sub1_16.aFloat18) * (float) this.anInt9735 / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt9735 * (this.aClass26_Sub1_16.aFloat18 + (float) arg4 * this.aClass26_Sub1_16.aFloat24 + this.aClass26_Sub1_16.aFloat22 * (float) arg3 + this.aClass26_Sub1_16.aFloat27 * (float) arg5) / (float) arg6);
		if ((float) local224 < this.aFloat243 && this.aFloat243 > (float) local257) {
			local7 |= 0x4;
		} else if ((float) local224 > this.aFloat237 && (float) local257 > this.aFloat237) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "(II)V")
	public final void method8081(@OriginalArg(1) int arg0) {
		if (this.anInt9739 != arg0) {
			this.anInt9739 = arg0;
			this.method8028();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!vea;[BIZII)Lclient!gga;")
	public abstract Interface9 method8082(@OriginalArg(0) Class363 arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!pj", name = "W", descriptor = "(I)V")
	private void method8083() {
		this.anInterface10_13 = this.method7963(true);
		this.anInterface10_13.method3994(24, 12);
		this.aClass201_18 = this.method8040(new Class388[] { new Class388(Static256.aClass170_1) });
	}

	@OriginalMember(owner = "client!pj", name = "Y", descriptor = "(I)V")
	protected abstract void method8084();

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7920(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
			@Pc(53) Object local53 = this.method8058(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!pj", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt9703 + this.anInt9702 + this.anInt9705;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class51 method7908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class51_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method7886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method8085(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7911() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "Z", descriptor = "(I)V")
	private void method8086() {
		this.anInterface10_14 = this.method7963(false);
		this.anInterface10_14.method3994(140, 28);
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			@Pc(34) Buffer local34 = this.anInterface10_14.method3996();
			if (local34 != null) {
				@Pc(41) Stream local41 = this.method8079(local34);
				if (Stream.c()) {
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
				} else {
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
				}
				local41.b();
				if (this.anInterface10_14.method3995()) {
					break;
				}
			}
		}
		this.aClass201_20 = this.method8040(new Class388[] { new Class388(new Class170[] { Static256.aClass170_1, Static256.aClass170_5, Static256.aClass170_5 }) });
	}

	@OriginalMember(owner = "client!pj", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt9718 != arg0;
		if (local15 || arg1 != this.aFloat238 || arg2 != this.aFloat251) {
			this.anInt9718 = arg0;
			this.aFloat238 = arg1;
			this.aFloat251 = arg2;
			if (local15) {
				this.aFloat246 = (float) (this.anInt9718 & 0xFF) / 255.0F;
				this.aFloat250 = (float) (this.anInt9718 & 0xFF0000) / 1.671168E7F;
				this.aFloat245 = (float) (this.anInt9718 & 0xFF00) / 65280.0F;
				this.method8063();
			}
			this.aNativeInterface3.setSunColour(this.aFloat250, this.aFloat245, this.aFloat246, arg1, arg2);
			this.method8033();
		}
		if (arg3 != this.aFloatArray78[0] || this.aFloatArray78[1] != arg4 || arg5 != this.aFloatArray78[2]) {
			this.aFloatArray78[1] = arg4;
			this.aFloatArray78[2] = arg5;
			this.aFloatArray78[0] = arg3;
			this.aFloatArray79[0] = -arg3;
			this.aFloatArray79[2] = -arg5;
			this.aFloatArray79[1] = -arg4;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray72[2] = local153 * arg5;
			this.aFloatArray72[0] = arg3 * local153;
			this.aFloatArray72[1] = arg4 * local153;
			this.aFloatArray73[2] = -this.aFloatArray72[2];
			this.aFloatArray73[1] = -this.aFloatArray72[1];
			this.aFloatArray73[0] = -this.aFloatArray72[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray72[0], this.aFloatArray72[1], this.aFloatArray72[2]);
			this.method7976();
			this.anInt9717 = (int) (arg5 * 256.0F / arg4);
			this.anInt9740 = (int) (arg3 * 256.0F / arg4);
		}
		this.method8015();
	}

	@OriginalMember(owner = "client!pj", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt9725 = 0;
		this.anInt9726 = this.anInt9683;
		this.anInt9707 = this.anInt9590;
		this.bf = 0;
		if (this.aBoolean687) {
			this.aBoolean687 = false;
			this.method8045();
		}
		this.method8044();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!vea;Lclient!bja;)Z")
	public abstract boolean method8087(@OriginalArg(1) Class363 arg0, @OriginalArg(2) Class36 arg1);

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "(Z)Lclient!bc;")
	public final Class26_Sub1 method8088() {
		return this.aClass26_Sub1Array3[this.anInt9739];
	}
}
