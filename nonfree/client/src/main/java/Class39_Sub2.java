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

@OriginalClass("client!kw")
public abstract class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!kw", name = "E", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!kw", name = "kb", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!kw", name = "Gb", descriptor = "Lclient!ui;")
	protected Class284 aClass284_6;

	@OriginalMember(owner = "client!kw", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!kw", name = "Sd", descriptor = "I")
	public int anInt7272;

	@OriginalMember(owner = "client!kw", name = "Td", descriptor = "I")
	protected int anInt7273;

	@OriginalMember(owner = "client!kw", name = "Vd", descriptor = "I")
	public int anInt7274;

	@OriginalMember(owner = "client!kw", name = "de", descriptor = "F")
	private float aFloat186;

	@OriginalMember(owner = "client!kw", name = "le", descriptor = "Z")
	protected boolean aBoolean532;

	@OriginalMember(owner = "client!kw", name = "me", descriptor = "I")
	protected int anInt7279;

	@OriginalMember(owner = "client!kw", name = "pe", descriptor = "[Lclient!kp;")
	protected Class165[] aClass165Array5;

	@OriginalMember(owner = "client!kw", name = "re", descriptor = "I")
	protected int anInt7281;

	@OriginalMember(owner = "client!kw", name = "ve", descriptor = "F")
	private float aFloat190;

	@OriginalMember(owner = "client!kw", name = "we", descriptor = "I")
	private int anInt7283;

	@OriginalMember(owner = "client!kw", name = "Ae", descriptor = "Z")
	public boolean aBoolean533;

	@OriginalMember(owner = "client!kw", name = "De", descriptor = "Lclient!mn;")
	public Interface11 anInterface11_3;

	@OriginalMember(owner = "client!kw", name = "Ge", descriptor = "I")
	private int anInt7285;

	@OriginalMember(owner = "client!kw", name = "Ne", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!kw", name = "Qe", descriptor = "Z")
	public boolean aBoolean540;

	@OriginalMember(owner = "client!kw", name = "Te", descriptor = "Z")
	protected boolean aBoolean541;

	@OriginalMember(owner = "client!kw", name = "Ue", descriptor = "F")
	public float aFloat195;

	@OriginalMember(owner = "client!kw", name = "Ve", descriptor = "I")
	protected int anInt7290;

	@OriginalMember(owner = "client!kw", name = "We", descriptor = "I")
	public int anInt7291;

	@OriginalMember(owner = "client!kw", name = "cf", descriptor = "[Lclient!pn;")
	protected Class224[] aClass224Array3;

	@OriginalMember(owner = "client!kw", name = "ef", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!kw", name = "jf", descriptor = "I")
	public int anInt7295;

	@OriginalMember(owner = "client!kw", name = "lf", descriptor = "I")
	public int anInt7297;

	@OriginalMember(owner = "client!kw", name = "mf", descriptor = "[Lclient!mn;")
	private Interface11[] anInterface11Array3;

	@OriginalMember(owner = "client!kw", name = "rf", descriptor = "Z")
	public boolean aBoolean546;

	@OriginalMember(owner = "client!kw", name = "uf", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!kw", name = "xf", descriptor = "I")
	protected int anInt7303;

	@OriginalMember(owner = "client!kw", name = "zf", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!kw", name = "Bf", descriptor = "Lclient!eba;")
	private Class5 aClass5_3;

	@OriginalMember(owner = "client!kw", name = "Df", descriptor = "[Lclient!at;")
	protected Class2_Sub5[] aClass2_Sub5Array6;

	@OriginalMember(owner = "client!kw", name = "Ef", descriptor = "Lclient!ia;")
	private Class58_Sub2 aClass58_Sub2_3;

	@OriginalMember(owner = "client!kw", name = "Ff", descriptor = "[Lclient!oe;")
	protected Class181_Sub2[] aClass181_Sub2Array3;

	@OriginalMember(owner = "client!kw", name = "Kf", descriptor = "I")
	public int anInt7306;

	@OriginalMember(owner = "client!kw", name = "Lf", descriptor = "[Lclient!kp;")
	protected Class165[] aClass165Array6;

	@OriginalMember(owner = "client!kw", name = "Rf", descriptor = "F")
	public float aFloat202;

	@OriginalMember(owner = "client!kw", name = "Vf", descriptor = "F")
	private float aFloat203;

	@OriginalMember(owner = "client!kw", name = "Yf", descriptor = "Lclient!et;")
	private Class79 aClass79_3;

	@OriginalMember(owner = "client!kw", name = "bg", descriptor = "Lclient!qi;")
	public Class63_Sub3 aClass63_Sub3_21;

	@OriginalMember(owner = "client!kw", name = "cg", descriptor = "Lclient!vs;")
	public Class304 aClass304_16;

	@OriginalMember(owner = "client!kw", name = "dg", descriptor = "Lclient!g;")
	private Interface7 anInterface7_8;

	@OriginalMember(owner = "client!kw", name = "eg", descriptor = "Lclient!tq;")
	private Interface19 anInterface19_12;

	@OriginalMember(owner = "client!kw", name = "fg", descriptor = "Lclient!qi;")
	public Class63_Sub3 aClass63_Sub3_22;

	@OriginalMember(owner = "client!kw", name = "gg", descriptor = "Lclient!qi;")
	public Class63_Sub3 aClass63_Sub3_23;

	@OriginalMember(owner = "client!kw", name = "hg", descriptor = "Lclient!vs;")
	private Class304 aClass304_17;

	@OriginalMember(owner = "client!kw", name = "ig", descriptor = "Lclient!qi;")
	public Class63_Sub3 aClass63_Sub3_24;

	@OriginalMember(owner = "client!kw", name = "jg", descriptor = "Lclient!qi;")
	public Class63_Sub3 aClass63_Sub3_25;

	@OriginalMember(owner = "client!kw", name = "kg", descriptor = "Lclient!qi;")
	public Class63_Sub3 aClass63_Sub3_26;

	@OriginalMember(owner = "client!kw", name = "lg", descriptor = "Lclient!qi;")
	public Class63_Sub3 aClass63_Sub3_27;

	@OriginalMember(owner = "client!kw", name = "mg", descriptor = "Lclient!tq;")
	private Interface19 anInterface19_13;

	@OriginalMember(owner = "client!kw", name = "ng", descriptor = "Lclient!vs;")
	public Class304 aClass304_18;

	@OriginalMember(owner = "client!kw", name = "og", descriptor = "Lclient!qi;")
	public Class63_Sub3 aClass63_Sub3_28;

	@OriginalMember(owner = "client!kw", name = "pg", descriptor = "Lclient!qi;")
	public Class63_Sub3 aClass63_Sub3_29;

	@OriginalMember(owner = "client!kw", name = "qg", descriptor = "Lclient!vs;")
	public Class304 aClass304_19;

	@OriginalMember(owner = "client!kw", name = "rg", descriptor = "Lclient!qi;")
	public Class63_Sub3 aClass63_Sub3_30;

	@OriginalMember(owner = "client!kw", name = "sg", descriptor = "Lclient!vs;")
	private Class304 aClass304_20;

	@OriginalMember(owner = "client!kw", name = "tg", descriptor = "Lclient!vs;")
	public Class304 aClass304_21;

	@OriginalMember(owner = "client!kw", name = "ug", descriptor = "Z")
	protected boolean aBoolean550;

	@OriginalMember(owner = "client!kw", name = "vg", descriptor = "I")
	private int anInt7314;

	@OriginalMember(owner = "client!kw", name = "wd", descriptor = "Lclient!rk;")
	private final Class249 aClass249_49 = new Class249();

	@OriginalMember(owner = "client!kw", name = "Rd", descriptor = "Z")
	protected boolean aBoolean530 = true;

	@OriginalMember(owner = "client!kw", name = "Ud", descriptor = "Lclient!oe;")
	protected final Class181_Sub2 aClass181_Sub2_15 = new Class181_Sub2();

	@OriginalMember(owner = "client!kw", name = "Wd", descriptor = "Lclient!oe;")
	public Class181_Sub2 aClass181_Sub2_16 = new Class181_Sub2();

	@OriginalMember(owner = "client!kw", name = "Xd", descriptor = "Lclient!oe;")
	public final Class181_Sub2 aClass181_Sub2_17 = new Class181_Sub2();

	@OriginalMember(owner = "client!kw", name = "Yd", descriptor = "Lclient!oe;")
	protected final Class181_Sub2 aClass181_Sub2_18 = new Class181_Sub2();

	@OriginalMember(owner = "client!kw", name = "Zd", descriptor = "Lclient!oe;")
	private final Class181_Sub2 aClass181_Sub2_19 = new Class181_Sub2();

	@OriginalMember(owner = "client!kw", name = "ae", descriptor = "Lclient!oe;")
	private final Class181_Sub2 aClass181_Sub2_20 = new Class181_Sub2();

	@OriginalMember(owner = "client!kw", name = "ke", descriptor = "I")
	protected int anInt7278 = 0;

	@OriginalMember(owner = "client!kw", name = "oe", descriptor = "I")
	private int anInt7280 = -1;

	@OriginalMember(owner = "client!kw", name = "ne", descriptor = "F")
	public float aFloat188 = 1.0F;

	@OriginalMember(owner = "client!kw", name = "Be", descriptor = "Z")
	private boolean aBoolean534 = false;

	@OriginalMember(owner = "client!kw", name = "Ee", descriptor = "Z")
	protected boolean aBoolean535 = false;

	@OriginalMember(owner = "client!kw", name = "qe", descriptor = "[F")
	private final float[] aFloatArray58 = new float[16];

	@OriginalMember(owner = "client!kw", name = "he", descriptor = "F")
	public float aFloat187 = 3584.0F;

	@OriginalMember(owner = "client!kw", name = "Re", descriptor = "I")
	public int anInt7289 = 3;

	@OriginalMember(owner = "client!kw", name = "be", descriptor = "[F")
	public final float[] aFloatArray57 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!kw", name = "Ze", descriptor = "Z")
	protected boolean aBoolean543 = true;

	@OriginalMember(owner = "client!kw", name = "He", descriptor = "Z")
	protected boolean aBoolean536 = false;

	@OriginalMember(owner = "client!kw", name = "ue", descriptor = "I")
	protected final int anInt7282 = 0;

	@OriginalMember(owner = "client!kw", name = "je", descriptor = "I")
	public int anInt7277 = -1;

	@OriginalMember(owner = "client!kw", name = "Ke", descriptor = "I")
	public int anInt7287 = 512;

	@OriginalMember(owner = "client!kw", name = "ie", descriptor = "Z")
	protected boolean aBoolean531 = true;

	@OriginalMember(owner = "client!kw", name = "se", descriptor = "F")
	public float aFloat189 = 1.0F;

	@OriginalMember(owner = "client!kw", name = "xe", descriptor = "I")
	private int anInt7284 = 0;

	@OriginalMember(owner = "client!kw", name = "ye", descriptor = "Lclient!pm;")
	protected Class223 aClass223_7 = Static146.aClass223_2;

	@OriginalMember(owner = "client!kw", name = "bf", descriptor = "I")
	private int bf = 0;

	@OriginalMember(owner = "client!kw", name = "Fe", descriptor = "F")
	public float aFloat192 = -1.0F;

	@OriginalMember(owner = "client!kw", name = "pf", descriptor = "[F")
	public final float[] aFloatArray61 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!kw", name = "gf", descriptor = "Lclient!mba;")
	protected Class184 aClass184_10 = Static519.aClass184_12;

	@OriginalMember(owner = "client!kw", name = "kf", descriptor = "I")
	protected final int anInt7296 = 0;

	@OriginalMember(owner = "client!kw", name = "Le", descriptor = "I")
	public int anInt7288 = 50;

	@OriginalMember(owner = "client!kw", name = "Se", descriptor = "F")
	public float aFloat194 = 1.0F;

	@OriginalMember(owner = "client!kw", name = "ff", descriptor = "Z")
	protected boolean aBoolean545 = false;

	@OriginalMember(owner = "client!kw", name = "of", descriptor = "[F")
	private final float[] aFloatArray60 = new float[16];

	@OriginalMember(owner = "client!kw", name = "Oe", descriptor = "Z")
	protected boolean aBoolean538 = false;

	@OriginalMember(owner = "client!kw", name = "Ye", descriptor = "I")
	protected int anInt7292 = 0;

	@OriginalMember(owner = "client!kw", name = "Je", descriptor = "I")
	protected int anInt7286 = 0;

	@OriginalMember(owner = "client!kw", name = "Gf", descriptor = "Z")
	private boolean aBoolean547 = false;

	@OriginalMember(owner = "client!kw", name = "fe", descriptor = "[Lclient!eba;")
	private final Class5[] aClass5Array3 = new Class5[10];

	@OriginalMember(owner = "client!kw", name = "ge", descriptor = "I")
	private int anInt7276 = 1;

	@OriginalMember(owner = "client!kw", name = "ce", descriptor = "F")
	private float aFloat185 = 3000.0F;

	@OriginalMember(owner = "client!kw", name = "Cf", descriptor = "F")
	public float aFloat200 = -1.0F;

	@OriginalMember(owner = "client!kw", name = "af", descriptor = "Z")
	private boolean aBoolean544 = false;

	@OriginalMember(owner = "client!kw", name = "Jf", descriptor = "I")
	public int anInt7305 = 0;

	@OriginalMember(owner = "client!kw", name = "nf", descriptor = "I")
	protected int anInt7298 = 3584;

	@OriginalMember(owner = "client!kw", name = "Pe", descriptor = "Z")
	private boolean aBoolean539 = false;

	@OriginalMember(owner = "client!kw", name = "Ie", descriptor = "Z")
	protected boolean aBoolean537 = true;

	@OriginalMember(owner = "client!kw", name = "df", descriptor = "I")
	protected int anInt7293 = 0;

	@OriginalMember(owner = "client!kw", name = "ze", descriptor = "[F")
	private final float[] aFloatArray59 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!kw", name = "Hf", descriptor = "I")
	private int anInt7304 = -1;

	@OriginalMember(owner = "client!kw", name = "sf", descriptor = "I")
	protected int anInt7300 = 0;

	@OriginalMember(owner = "client!kw", name = "Of", descriptor = "I")
	public int anInt7309 = 128;

	@OriginalMember(owner = "client!kw", name = "vf", descriptor = "I")
	public int anInt7301 = -1;

	@OriginalMember(owner = "client!kw", name = "Nf", descriptor = "I")
	public int anInt7308 = 0;

	@OriginalMember(owner = "client!kw", name = "Tf", descriptor = "I")
	public int anInt7311 = 8;

	@OriginalMember(owner = "client!kw", name = "Sf", descriptor = "I")
	private int anInt7310 = 0;

	@OriginalMember(owner = "client!kw", name = "Pf", descriptor = "F")
	public float aFloat201 = 3584.0F;

	@OriginalMember(owner = "client!kw", name = "tf", descriptor = "F")
	private float aFloat197 = 1.0F;

	@OriginalMember(owner = "client!kw", name = "Mf", descriptor = "I")
	public int anInt7307 = 0;

	@OriginalMember(owner = "client!kw", name = "yf", descriptor = "[F")
	private final float[] aFloatArray62 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!kw", name = "hf", descriptor = "I")
	private int anInt7294 = 16777215;

	@OriginalMember(owner = "client!kw", name = "Ce", descriptor = "F")
	public float aFloat191 = 1.0F;

	@OriginalMember(owner = "client!kw", name = "wf", descriptor = "I")
	protected int anInt7302 = -1;

	@OriginalMember(owner = "client!kw", name = "Xe", descriptor = "Z")
	private boolean aBoolean542 = false;

	@OriginalMember(owner = "client!kw", name = "If", descriptor = "[F")
	private final float[] aFloatArray64 = new float[16];

	@OriginalMember(owner = "client!kw", name = "Uf", descriptor = "[F")
	private final float[] aFloatArray65 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!kw", name = "Af", descriptor = "[F")
	protected float[] aFloatArray63 = this.aFloatArray65;

	@OriginalMember(owner = "client!kw", name = "Wf", descriptor = "I")
	public int anInt7312 = 512;

	@OriginalMember(owner = "client!kw", name = "qf", descriptor = "I")
	private int anInt7299 = 0;

	@OriginalMember(owner = "client!kw", name = "Qf", descriptor = "Z")
	protected boolean aBoolean548 = true;

	@OriginalMember(owner = "client!kw", name = "Xf", descriptor = "Z")
	protected boolean aBoolean549 = true;

	@OriginalMember(owner = "client!kw", name = "Me", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!kw", name = "ag", descriptor = "Lclient!oe;")
	private final Class181_Sub2 aClass181_Sub2_21 = new Class181_Sub2();

	@OriginalMember(owner = "client!kw", name = "ee", descriptor = "I")
	protected final int anInt7275;

	@OriginalMember(owner = "client!kw", name = "Xb", descriptor = "Lclient!dda;")
	protected final Class53 aClass53_111;

	@OriginalMember(owner = "client!kw", name = "cd", descriptor = "Ljava/lang/Object;")
	protected final Object anObject16;

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "Ljava/lang/Object;")
	private Object anObject15;

	@OriginalMember(owner = "client!kw", name = "id", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas13;

	@OriginalMember(owner = "client!kw", name = "W", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!kw", name = "Zf", descriptor = "I")
	public final int anInt7313;

	@OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
	private int anInt7115;

	@OriginalMember(owner = "client!kw", name = "R", descriptor = "I")
	public int anInt7126;

	@OriginalMember(owner = "client!kw", name = "H", descriptor = "I")
	private int anInt7116;

	@OriginalMember(owner = "client!kw", name = "ob", descriptor = "I")
	public int anInt7145;

	@OriginalMember(owner = "client!kw", name = "te", descriptor = "Lclient!du;")
	private final Class62 aClass62_3;

	@OriginalMember(owner = "client!kw", name = "od", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!n;Lclient!dda;II)V")
	protected Class39_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface12 arg2, @OriginalArg(3) Class53 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anInt7275 = arg4;
		this.aClass53_111 = arg3;
		this.anObject15 = this.anObject16 = arg1;
		this.aCanvas12 = this.aCanvas13 = arg0;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt7313 = arg5;
		this.anInt7126 = this.anInt7115 = local307.height;
		this.anInt7145 = this.anInt7116 = local307.width;
		Static368.method5873(false, true);
		this.aClass62_3 = new Class62(this, super.anInterface12_15);
		this.aNativeInterface3 = new NativeInterface(super.anInterface12_15.method2570(), this.anInt7313);
		for (@Pc(349) int local349 = 0; local349 < super.anInterface12_15.method2570(); local349++) {
			@Pc(357) Class204 local357 = super.anInterface12_15.method2573(local349);
			if (local357 != null) {
				this.aNativeInterface3.initTextureMetrics(local349, local357.aByte83, local357.aByte82);
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(II)Lclient!eba;")
	protected Class5 method6084(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class5_Sub9(this);
		} else if (arg0 == 1) {
			return new Class5_Sub1(this);
		} else if (arg0 == 2) {
			return new Class5_Sub5(this, this.aClass284_6);
		} else if (arg0 == 7) {
			return new Class5_Sub4(this);
		} else {
			return new Class5_Sub8(this);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!hba;I)V")
	public final void method6085(@OriginalArg(1) Class111 arg0, @OriginalArg(2) int arg1) {
		this.method6097(arg1, arg0);
	}

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "()Z")
	@Override
	public final boolean method6037() {
		return false;
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "()Lclient!m;")
	@Override
	public final Class181 method6022() {
		return this.aClass181_Sub2_21;
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "()Z")
	@Override
	public final boolean method6014() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)V")
	protected abstract void method6086();

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!ud;II)V")
	public abstract void method6087(@OriginalArg(0) int arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(IIII)V")
	@Override
	public final void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7312 = arg3;
		this.anInt7287 = arg2;
		this.anInt7307 = arg1;
		this.anInt7305 = arg0;
		this.method6202();
		this.method6214();
		this.method6107();
		this.method6142();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZ)V")
	public final void method6088(@OriginalArg(0) int arg0) {
		if (this.anInt7276 == arg0) {
			return;
		}
		@Pc(24) Class223 local24;
		@Pc(28) boolean local28;
		@Pc(26) boolean local26;
		if (arg0 == 1) {
			local24 = Static146.aClass223_2;
			local26 = true;
			local28 = true;
		} else if (arg0 == 2) {
			local24 = Static8.aClass223_1;
			local26 = false;
			local28 = true;
		} else if (arg0 == 128) {
			local28 = true;
			local26 = true;
			local24 = Static251.aClass223_3;
		} else {
			local24 = Static323.aClass223_6;
			local26 = false;
			local28 = false;
		}
		if (local26 != this.aBoolean548) {
			this.aBoolean548 = local26;
			this.method6207();
		}
		if (local28 != this.aBoolean537) {
			this.aBoolean537 = local28;
			this.method6172();
		}
		if (local24 != this.aClass223_7) {
			this.aClass223_7 = local24;
			this.method6098();
		}
		this.anInt7276 = arg0;
		this.anInt7285 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "(I)V")
	public final void method6089() {
		this.aBoolean530 = false;
		this.method6156();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([Lclient!uq;B)Lclient!vs;")
	public abstract Class304 method6090(@OriginalArg(0) Class287[] arg0);

	@OriginalMember(owner = "client!kw", name = "JA", descriptor = "(IIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean533) {
			throw new RuntimeException("");
		}
		if (arg0 != this.anInt7283) {
			this.anInt7283 = arg0;
			if (this.aClass5_3 != null) {
				this.aClass5_3.method7089();
			}
		}
		this.anInt7299 = arg3;
		this.anInt7304 = arg2;
		this.anInt7302 = arg1;
		this.method6094();
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "()Z")
	@Override
	public final boolean method6013() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "(I)V")
	@Override
	public final void method6047(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!pn;I)V")
	public final void method6091(@OriginalArg(0) Class224 arg0) {
		this.aClass224Array3[this.anInt7278] = arg0;
		this.method6162();
	}

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "(I)V")
	private void method6092() {
		if (this.aFloat190 == 0.0F) {
			this.aFloatArray58[14] = this.aFloat203;
			this.aFloatArray58[10] = this.aFloat186;
		} else {
			@Pc(17) float local17 = this.aFloat185 / (this.aFloat185 + this.aFloat190);
			@Pc(21) float local21 = local17 * local17;
			@Pc(37) float local37 = (1.0F - local17) * -this.aFloat203 * (1.0F - local17) / this.aFloat190;
			this.aFloatArray58[10] = this.aFloat186 + local37;
			this.aFloatArray58[14] = this.aFloat203 * local21;
		}
		this.aFloat201 = ((float) -this.anInt7298 + this.aFloatArray58[14]) / this.aFloatArray58[10];
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6007(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method6154(this.aHashtable5.get(arg0), arg0);
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!kp;Lclient!kp;I)V")
	public final void method6093(@OriginalArg(0) Class165 arg0, @OriginalArg(1) Class165 arg1) {
		@Pc(5) boolean local5 = false;
		if (this.aClass165Array6[this.anInt7278] != arg0) {
			this.aClass165Array6[this.anInt7278] = arg0;
			this.method6120();
			local5 = true;
		}
		if (this.aClass165Array5[this.anInt7278] != arg1) {
			this.aClass165Array5[this.anInt7278] = arg1;
			this.method6086();
			local5 = true;
		}
		if (local5) {
			this.anInt7285 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "(I)V")
	private void method6094() {
		if (this.aClass5_3 != null) {
			this.aClass5_3.method7082();
		}
		this.method6197();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!tq;I)V")
	public abstract void method6095(@OriginalArg(0) int arg0, @OriginalArg(1) Interface19 arg1);

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(B)V")
	protected abstract void method6096();

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIZLclient!hba;)V")
	protected abstract void method6097(@OriginalArg(1) int arg0, @OriginalArg(3) Class111 arg1);

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "(I)V")
	protected abstract void method6098();

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(B)V")
	protected abstract void method6099();

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZZ)Lclient!tq;")
	public abstract Interface19 method6100(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "(I)V")
	protected abstract void method6101();

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BZ)V")
	public final void method6102(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean541) {
			this.aBoolean541 = arg0;
			this.method6188();
			this.anInt7285 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public final boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass181_Sub2_16.method5392((float) arg1, (float) arg0, (float) arg2);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass181_Sub2_16.method5392((float) arg4, (float) arg3, (float) arg5);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if (local14 < (float) this.anInt7288 && (float) this.anInt7288 > local31 || !(!((float) this.anInt7298 < local14) || !(local31 > (float) this.anInt7298))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt7287 * this.aClass181_Sub2_16.method5406((float) arg1, (float) arg2, (float) arg0) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt7287 * this.aClass181_Sub2_16.method5406((float) arg4, (float) arg5, (float) arg3) / local31);
		if ((float) local81 < this.aFloat199 && this.aFloat199 > (float) local99 || (float) local81 > this.aFloat193 && (float) local99 > this.aFloat193) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt7312 * this.aClass181_Sub2_16.method5396((float) arg1, (float) arg0, (float) arg2) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt7312 * this.aClass181_Sub2_16.method5396((float) arg4, (float) arg3, (float) arg5) / local31);
			return (!((float) local143 < this.aFloat198) || !(this.aFloat198 > (float) local161)) && (!((float) local143 > this.aFloat195) || !((float) local161 > this.aFloat195));
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method6006() {
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLclient!lc;Lclient!jt;)Z")
	public abstract boolean method6103(@OriginalArg(1) Class171 arg0, @OriginalArg(2) Class150 arg1);

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(IZ)V")
	public abstract void method6104(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public final void method6050(@OriginalArg(0) Class2_Sub4 arg0) {
		this.aNativeHeap5 = ((Class2_Sub4_Sub1) arg0).aNativeHeap1;
		this.aNativeHeapBuffer7 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIZLclient!jt;I[BZ)Lclient!hc;")
	protected abstract Interface8 method6105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class150 arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) boolean arg4);

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!r;Lclient!oaa;Lclient!m;Lclient!gr;I)V")
	@Override
	public final void method6020(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class6_Sub4 arg3) {
		arg0.method7700(arg2, arg3, 0);
		this.method6019(arg1);
	}

	@OriginalMember(owner = "client!kw", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([IZIII)Lclient!hc;")
	public final Interface8 method6106(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return this.method6180(0, arg0, arg3, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "(I)V")
	public final void method6107() {
		if (Static519.aClass184_12 == this.aClass184_10) {
			return;
		}
		@Pc(6) Class184 local6 = this.aClass184_10;
		this.aClass184_10 = Static519.aClass184_12;
		if (local6.method4615()) {
			this.method6157();
		}
		this.aFloatArray63 = this.aFloatArray65;
		this.anInt7285 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!jt;II[FIZ)Lclient!hc;")
	public final Interface8 method6108(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) boolean arg4) {
		return this.method6199(arg4, arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(FFFFIFF)Z")
	private boolean method6109(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface19_13.method6952();
		if (local9 == null) {
			return false;
		}
		@Pc(26) Stream local26 = this.method6195(local9);
		if (Stream.a()) {
			local26.a(arg4);
			local26.a(arg1);
			local26.a(arg5);
			local26.a(arg2);
			local26.a(arg3);
			local26.a(arg0);
		} else {
			local26.b(arg4);
			local26.b(arg1);
			local26.b(arg5);
			local26.b(arg2);
			local26.b(arg3);
			local26.b(arg0);
		}
		local26.c();
		return this.anInterface19_13.method6954();
	}

	@OriginalMember(owner = "client!kw", name = "L", descriptor = "(I)V")
	@Override
	public final void L(@OriginalArg(0) int arg0) {
		this.anInt7289 = 0;
		while (arg0 > 1) {
			this.anInt7289++;
			arg0 >>= 0x1;
		}
		this.anInt7311 = 0x1 << this.anInt7289;
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method6130();
		this.method6127();
		this.method6203(arg4);
		this.method6192(0, Static254.aClass111_2);
		this.method6085(Static254.aClass111_2, 0);
		this.method6088(arg5);
		this.aClass181_Sub2_15.method5401((float) (arg2 - 1), 1.0F, (float) (arg3 - 1));
		this.aClass181_Sub2_15.method5402((float) arg1 - local7, (float) arg0 - local7, 0.0F);
		this.method6156();
		this.method6124(false);
		this.method6145(Static290.aClass281_4, 4);
		this.method6124(true);
		this.method6085(Static132.aClass111_1, 0);
		this.method6192(0, Static132.aClass111_1);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public final Class35 method6072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class35_Sub1 local11 = new Class35_Sub1(this, arg2, arg3, arg4);
		local11.P(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method6110(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!kw", name = "z", descriptor = "()Z")
	@Override
	public final boolean method6073() {
		return this.aClass5Array3[3].method7085();
	}

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "(I)V")
	public final void method6111() {
		if (Static376.aClass224_4 != this.aClass224Array3[this.anInt7278]) {
			this.aClass224Array3[this.anInt7278] = Static376.aClass224_4;
			this.aClass181_Sub2Array3[this.anInt7278].ha();
			this.method6162();
		}
	}

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "(I)V")
	protected abstract void method6112();

	@OriginalMember(owner = "client!kw", name = "E", descriptor = "(III)V")
	@Override
	public final void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt7301 && arg1 == this.anInt7277 && arg2 == this.anInt7308) {
			return;
		}
		this.anInt7308 = arg2;
		this.anInt7277 = arg1;
		this.anInt7301 = arg0;
		if (!this.aBoolean533) {
			this.method6094();
			this.method6188();
		}
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(B)[F")
	public final float[] method6113() {
		return this.aFloatArray65;
	}

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "(I)V")
	private void method6114() {
		this.aFloat187 = (float) this.anInt7298 - this.aFloat190;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6038(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
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
			@Pc(53) Object local53 = this.method6132(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "()Z")
	@Override
	public final boolean method6054() {
		return this.aBoolean532;
	}

	@OriginalMember(owner = "client!kw", name = "A", descriptor = "()Z")
	@Override
	public final boolean method6075() {
		return false;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZB)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method6115(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap5.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "(I)Lclient!oe;")
	public final Class181_Sub2 method6116() {
		return this.aClass181_Sub2Array3[this.anInt7278];
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt7288;
	}

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "(I)V")
	protected abstract void method6117();

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "(B)V")
	private void method6118() {
		if (this.aBoolean534) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray60;
		@Pc(21) float local21 = (float) this.anInt7288 - this.aFloat190;
		@Pc(29) float local29 = (float) this.anInt7298 - this.aFloat190;
		@Pc(41) float local41 = (float) -this.anInt7307 * this.aFloat197 / (float) this.anInt7312;
		@Pc(53) float local53 = (float) -this.anInt7305 * this.aFloat197 / (float) this.anInt7287;
		@Pc(67) float local67 = (float) (this.anInt7145 - this.anInt7305) * this.aFloat197 / (float) this.anInt7287;
		@Pc(82) float local82 = this.aFloat197 * (float) (this.anInt7126 - this.anInt7307) / (float) this.anInt7312;
		if (local67 == local53 || local82 == local41) {
			local13[1] = 0.0F;
			local13[6] = 0.0F;
			local13[2] = 0.0F;
			local13[14] = 0.0F;
			local13[13] = 0.0F;
			local13[4] = 0.0F;
			local13[5] = 1.0F;
			local13[12] = 0.0F;
			local13[9] = 0.0F;
			local13[7] = 0.0F;
			local13[10] = 1.0F;
			local13[11] = 0.0F;
			local13[15] = 1.0F;
			local13[8] = 0.0F;
			local13[3] = 0.0F;
			local13[0] = 1.0F;
		} else {
			local13[5] = 2.0F / (local82 - local41);
			local13[10] = 1.0F / (local21 - local29);
			local13[7] = 0.0F;
			local13[13] = (local82 + local41) / (-local82 + local41);
			local13[4] = 0.0F;
			local13[0] = 2.0F / (local67 - local53);
			local13[15] = 1.0F;
			local13[8] = 0.0F;
			local13[3] = 0.0F;
			local13[6] = 0.0F;
			local13[9] = 0.0F;
			local13[1] = 0.0F;
			local13[14] = local21 / (local21 - local29);
			local13[2] = 0.0F;
			local13[11] = 0.0F;
			local13[12] = (local67 + local53) / (-local67 + local53);
		}
		this.method6114();
		this.aBoolean534 = true;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!hba;IZIZ)V")
	public abstract void method6119(@OriginalArg(0) Class111 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "(I)V")
	protected abstract void method6120();

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "(I)V")
	protected abstract void method6121();

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!lc;Lclient!jt;II)Lclient!hc;")
	public abstract Interface8 method6122(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class150 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!kw", name = "u", descriptor = "(I)V")
	private void method6123() {
		if (this.aBoolean542) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray64;
		if (this.anInt7145 == 0 || this.anInt7126 == 0) {
			local5[4] = 0.0F;
			local5[11] = 0.0F;
			local5[7] = 0.0F;
			local5[3] = 0.0F;
			local5[6] = 0.0F;
			local5[0] = 1.0F;
			local5[13] = 0.0F;
			local5[14] = 0.0F;
			local5[10] = 1.0F;
			local5[1] = 0.0F;
			local5[12] = 0.0F;
			local5[2] = 0.0F;
			local5[15] = 1.0F;
			local5[8] = 0.0F;
			local5[9] = 0.0F;
			local5[5] = 1.0F;
		} else {
			local5[1] = 0.0F;
			local5[4] = 0.0F;
			local5[11] = 0.0F;
			local5[15] = 1.0F;
			local5[8] = 0.0F;
			local5[3] = 0.0F;
			local5[13] = 1.0F;
			local5[12] = -1.0F;
			local5[0] = 2.0F / (float) this.anInt7145;
			local5[10] = 0.5F;
			local5[5] = -2.0F / (float) this.anInt7126;
			local5[6] = 0.0F;
			local5[14] = 0.5F;
			local5[2] = 0.0F;
			local5[7] = 0.0F;
			local5[9] = 0.0F;
		}
		this.aBoolean542 = true;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(BZ)V")
	public abstract void method6124(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "(B)I")
	public final int method6125() {
		return this.anInt7299;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BB)V")
	public final void method6126(@OriginalArg(1) byte arg0) {
		this.method6203(arg0 << 8 | arg0 << 16 | arg0 << 24 | arg0);
	}

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "(I)V")
	private void method6127() {
		if (this.anInt7285 == 1) {
			return;
		}
		this.method6178();
		this.method6102(false);
		this.method6139(false);
		this.method6187(false);
		this.method6171(false);
		this.method6208(false, -2, false);
		this.method6164(1);
		this.method6179(this.anInterface11_3);
		this.anInt7285 = 1;
	}

	@OriginalMember(owner = "client!kw", name = "UA", descriptor = "(IIIII)V")
	@Override
	public final void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6083(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!kw", name = "la", descriptor = "(FF)V")
	@Override
	public final void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat185 && this.aFloat190 == arg1) {
			return;
		}
		this.aFloat190 = arg1;
		this.aFloat185 = arg0;
		this.method6114();
		this.method6092();
		this.method6202();
		this.method6214();
	}

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "(B)V")
	private void method6128() {
		this.method6185();
		if (this.aClass5_3 != null) {
			this.aClass5_3.method7097();
		}
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6057(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas13 == arg0) {
			local5 = this.anObject15;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method6144(local5, arg0);
		if (arg0 == this.aCanvas12) {
			this.method6182();
		}
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(II)Lclient!g;")
	public final Interface7 method6129(@OriginalArg(0) int arg0) {
		if (arg0 * 2 > this.anInterface7_8.method6941()) {
			this.anInterface7_8.method6949(arg0);
		}
		return this.anInterface7_8;
	}

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "(B)F")
	protected abstract float method6130();

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "(I)V")
	public final void method6131() {
		if (this.anInt7285 == 4) {
			return;
		}
		this.method6178();
		this.method6102(false);
		this.method6139(false);
		this.method6187(false);
		this.method6171(false);
		this.method6208(false, -2, false);
		this.method6088(1);
		this.method6164(0);
		this.anInt7285 = 4;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)I")
	@Override
	public final int method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method6132(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "(I)V")
	@Override
	public final void method6074(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "(B)Lclient!oe;")
	public final Class181_Sub2 method6133() {
		return this.aClass181_Sub2Array3[this.anInt7278];
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(Z)V")
	protected final void method6134() {
		@Pc(15) Hashtable local15 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(26) Enumeration local26 = this.aHashtable5.keys();
			while (local26.hasMoreElements()) {
				@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
				local15.put(local32, this.method6132(local32));
			}
		}
		this.aHashtable5 = local15;
		this.method6174();
		this.method6152();
		this.aClass79_3.method2245(this);
	}

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "(I)V")
	protected abstract void method6135();

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "(I)V")
	protected abstract void method6136();

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!jt;[BIIB)Lclient!pl;")
	public abstract Interface15 method6137(@OriginalArg(1) Class150 arg0, @OriginalArg(2) byte[] arg1);

	@OriginalMember(owner = "client!kw", name = "z", descriptor = "(I)V")
	protected abstract void method6138();

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZB)V")
	public final void method6139(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean538 != arg0) {
			this.aBoolean538 = arg0;
			this.method6096();
			this.anInt7285 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kw", name = "xa", descriptor = "()V")
	@Override
	public final void xa() {
		this.aBoolean533 = false;
		this.method6205(0, false, 0, 0, false);
		this.method6094();
		this.method6188();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!qr;Z)Lclient!ha;")
	@Override
	public final Class35 method6018(@OriginalArg(0) Class241 arg0) {
		@Pc(20) Class35 local20;
		if (arg0.anInt7606 == 0 || arg0.anInt7604 == 0) {
			local20 = this.method6049(new int[1], 1, 1, 1);
		} else {
			@Pc(29) int[] local29 = new int[arg0.anInt7604 * arg0.anInt7606];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(38) int local38;
			@Pc(42) int local42;
			if (arg0.aByteArray101 == null) {
				for (local38 = 0; local38 < arg0.anInt7604; local38++) {
					for (local42 = 0; local42 < arg0.anInt7606; local42++) {
						@Pc(104) int local104 = arg0.anIntArray589[arg0.aByteArray102[local31++] & 0xFF];
						local29[local33++] = local104 == 0 ? 0 : local104 | 0xFF000000;
					}
				}
			} else {
				for (local38 = 0; local38 < arg0.anInt7604; local38++) {
					for (local42 = 0; local42 < arg0.anInt7606; local42++) {
						local29[local33++] = arg0.anIntArray589[arg0.aByteArray102[local31] & 0xFF] | arg0.aByteArray101[local31] << 24;
						local31++;
					}
				}
			}
			local20 = this.method6049(local29, arg0.anInt7606, arg0.anInt7606, arg0.anInt7604);
		}
		local20.KA(arg0.anInt7603, arg0.anInt7605, arg0.anInt7601, arg0.anInt7602);
		return local20;
	}

	@OriginalMember(owner = "client!kw", name = "A", descriptor = "(I)V")
	public final void method6140() {
		if (this.anInt7285 == 2) {
			return;
		}
		this.method6178();
		this.method6102(false);
		this.method6139(false);
		this.method6187(false);
		this.method6171(false);
		this.method6208(false, -2, false);
		this.anInt7285 = 2;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!bt;IIII)Lclient!r;")
	@Override
	public final Class63 method6011(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class63_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "(B)V")
	private void method6142() {
		this.aFloat199 = this.anInt7292 - this.anInt7305;
		this.aFloat198 = this.anInt7286 - this.anInt7307;
		this.aFloat195 = this.anInt7293 - this.anInt7307;
		this.aFloat193 = this.anInt7300 - this.anInt7305;
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(Z)V")
	protected abstract void method6143();

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)Lclient!u;")
	@Override
	public final Class2_Sub4 method6033(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub4_Sub1 local8 = new Class2_Sub4_Sub1(arg0);
		this.aClass249_49.method6523(local8);
		return local8;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIII)Lclient!lh;")
	@Override
	public final Class58 method6040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class58_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method6144(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!ud;ZI)V")
	private void method6145(@OriginalArg(0) Class281 arg0, @OriginalArg(2) int arg1) {
		this.method6200(this.aClass304_17);
		this.method6095(0, this.anInterface19_12);
		this.method6087(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "(Z)V")
	public final void method6146() {
		if (this.anInt7285 == 8) {
			return;
		}
		this.method6193();
		this.method6102(true);
		this.method6187(true);
		this.method6171(true);
		this.method6088(1);
		this.anInt7285 = 8;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZ[[II)Lclient!df;")
	public abstract Interface4 method6147(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!kw", name = "P", descriptor = "()F")
	@Override
	public final float P() {
		return this.aFloat185;
	}

	@OriginalMember(owner = "client!kw", name = "B", descriptor = "(I)V")
	protected abstract void method6149();

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([Lclient!r;Lclient!oaa;Lclient!m;[Lclient!gr;I)V")
	@Override
	public final void method6030(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class6_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method6046(arg0, arg2, arg3, arg4);
		this.method6019(arg1);
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(Z)V")
	@Override
	public final void method6044(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "()I")
	@Override
	public final int method6053() {
		return this.anInt7279 - 2;
	}

	@OriginalMember(owner = "client!kw", name = "C", descriptor = "(I)I")
	public final int method6150() {
		return this.anInt7283;
	}

	@OriginalMember(owner = "client!kw", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public final void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class209_Sub2 local6 = (Class209_Sub2) arg1;
		@Pc(9) Interface8 local9 = local6.anInterface8_4;
		this.method6140();
		this.method6179(local9);
		this.method6088(1);
		this.method6093(Static99.aClass165_2, Static99.aClass165_2);
		this.method6192(0, Static254.aClass111_2);
		this.method6203(arg0);
		this.aClass181_Sub2_15.method5401((float) this.anInt7145, 0.0F, (float) this.anInt7126);
		this.method6156();
		this.aClass181_Sub2Array3[0].method5401(local9.method5781((float) this.anInt7145), 1.0F, local9.method5777((float) this.anInt7126));
		this.aClass181_Sub2Array3[0].method5402(local9.method5777((float) -arg3), local9.method5781((float) -arg2), 0.0F);
		this.aClass224Array3[0] = Static532.aClass224_6;
		this.method6162();
		this.method6166();
		this.method6111();
		this.method6192(0, Static132.aClass111_1);
	}

	@OriginalMember(owner = "client!kw", name = "D", descriptor = "(I)Lclient!oe;")
	public final Class181_Sub2 method6151() {
		return this.aClass181_Sub2_18;
	}

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "()Z")
	@Override
	public final boolean method6036() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "(B)V")
	private void method6152() {
		this.anInterface19_13 = this.method6100(true);
		this.anInterface19_13.method6493(24, 12);
		this.aClass304_20 = this.method6090(new Class287[] { new Class287(Static241.aClass154_1) });
	}

	@OriginalMember(owner = "client!kw", name = "N", descriptor = "(IIII)V")
	@Override
	public final void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7300 = this.anInt7145 < arg2 ? 0 : arg2;
		this.anInt7292 = arg0 >= 0 ? arg0 : 0;
		this.anInt7293 = arg3 <= this.anInt7145 ? arg3 : 0;
		this.anInt7286 = arg1 < 0 ? 0 : arg1;
		if (this.anInt7292 <= 0 && this.anInt7145 <= this.anInt7300 && this.anInt7286 <= 0 && this.anInt7293 >= this.anInt7126) {
			this.n();
			return;
		}
		if (!this.aBoolean550) {
			this.aBoolean550 = true;
			this.method6163();
		}
		this.method6138();
		this.method6142();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I[F)[F")
	public final float[] method6153(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloatArray63[0];
		arg0[8] = this.aFloatArray63[2];
		arg0[4] = this.aFloatArray63[1];
		arg0[12] = this.aFloatArray63[3];
		arg0[13] = this.aFloatArray63[7];
		arg0[5] = this.aFloatArray63[5];
		arg0[9] = this.aFloatArray63[6];
		arg0[2] = this.aFloatArray63[8];
		arg0[1] = this.aFloatArray63[4];
		arg0[14] = this.aFloatArray63[11];
		arg0[10] = this.aFloatArray63[10];
		arg0[6] = this.aFloatArray63[9];
		arg0[3] = this.aFloatArray63[12];
		arg0[7] = this.aFloatArray63[13];
		arg0[11] = this.aFloatArray63[14];
		arg0[15] = this.aFloatArray63[15];
		return arg0;
	}

	@OriginalMember(owner = "client!kw", name = "IA", descriptor = "(III[I)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass181_Sub2_16.method5392((float) arg1, (float) arg0, (float) arg2);
		if ((float) this.anInt7288 > local14 || local14 > (float) this.anInt7298) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(57) int local57 = (int) ((float) this.anInt7287 * this.aClass181_Sub2_16.method5406((float) arg1, (float) arg2, (float) arg0) / local14);
		@Pc(75) int local75 = (int) ((float) this.anInt7312 * this.aClass181_Sub2_16.method5396((float) arg1, (float) arg0, (float) arg2) / local14);
		if ((float) local57 >= this.aFloat199 && (float) local57 <= this.aFloat193 && this.aFloat198 <= (float) local75 && (float) local75 <= this.aFloat195) {
			arg3[0] = (int) ((float) local57 - this.aFloat199);
			arg3[2] = (int) local14;
			arg3[1] = (int) ((float) local75 - this.aFloat198);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method6154(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!kw", name = "E", descriptor = "(I)V")
	public abstract void method6155();

	@OriginalMember(owner = "client!kw", name = "F", descriptor = "(I)V")
	private void method6156() {
		if (Static269.aClass184_8 == this.aClass184_10) {
			@Pc(7) float local7 = this.method6130();
			this.aClass181_Sub2_15.method5402(local7, local7, 0.0F);
		}
		this.aBoolean547 = false;
		this.method6112();
		if (this.aClass5_3 != null) {
			this.aClass5_3.method7095();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!gr;I)V")
	@Override
	public final void method6046(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class6_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method7700(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)V")
	@Override
	public final void method6027(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "(B)V")
	private void method6157() {
		this.aBoolean547 = false;
		if (this.aClass5_3 != null) {
			this.aClass5_3.method7088();
		}
		this.method6121();
	}

	@OriginalMember(owner = "client!kw", name = "G", descriptor = "(I)Lclient!oe;")
	public final Class181_Sub2 method6158() {
		return this.aClass181_Sub2_15;
	}

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "(B)V")
	public final void method6159() {
		this.aClass181_Sub2_15.ha();
		this.aBoolean530 = true;
		this.method6156();
	}

	@OriginalMember(owner = "client!kw", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt7274 + this.anInt7272 + this.anInt7273;
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6051(@OriginalArg(0) Canvas arg0) {
		this.anObject15 = null;
		this.aCanvas12 = null;
		if (arg0 == null || arg0 == this.aCanvas13) {
			this.anObject15 = this.anObject16;
			this.aCanvas12 = this.aCanvas13;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject15 = this.aHashtable5.get(arg0);
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.anObject15 == null) {
			throw new RuntimeException();
		}
		this.method6110(this.anObject15, this.aCanvas12);
		this.method6182();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZI)V")
	public final void method6160(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean535 != arg0) {
			this.aBoolean535 = arg0;
			this.method6096();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public final Class209 method6017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static103.method1932(arg1, arg0, arg3, arg2, this);
	}

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "(B)Lclient!oe;")
	public final Class181_Sub2 method6161() {
		if (!this.aBoolean547) {
			this.aClass181_Sub2_20.method5397(this.aClass181_Sub2_18, this.aClass181_Sub2_15);
			this.aBoolean547 = true;
		}
		return this.aClass181_Sub2_20;
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "([I)V")
	@Override
	public final void d(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7292;
		arg0[3] = this.anInt7293;
		arg0[1] = this.anInt7286;
		arg0[2] = this.anInt7300;
	}

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "(B)V")
	private void method6162() {
		this.method6101();
		if (this.aClass5_3 != null) {
			this.aClass5_3.method7086();
		}
	}

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "(B)V")
	protected abstract void method6163();

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(II)V")
	public final void method6164(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method6093(Static99.aClass165_2, Static99.aClass165_2);
		} else if (arg0 == 0) {
			this.method6093(Static389.aClass165_3, Static389.aClass165_3);
		} else if (arg0 == 2) {
			this.method6093(Static72.aClass165_1, Static99.aClass165_2);
		} else if (arg0 == 3) {
			this.method6093(Static420.aClass165_4, Static389.aClass165_3);
		} else if (arg0 == 4) {
			this.method6093(Static512.aClass165_5, Static512.aClass165_5);
			return;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public final void method6015(@OriginalArg(0) Class181 arg0) {
		this.aClass181_Sub2_16 = (Class181_Sub2) arg0;
		this.aClass181_Sub2_18.EA(this.aClass181_Sub2_16);
		this.aClass181_Sub2_18.method5403();
		this.aClass181_Sub2_19.method5399(this.aClass181_Sub2_18);
		this.aClass181_Sub2_17.method5399(this.aClass181_Sub2_16);
		if (this.aClass184_10.method4615()) {
			this.method6157();
		}
	}

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "(B)V")
	protected abstract void method6165();

	@OriginalMember(owner = "client!kw", name = "A", descriptor = "(IIIII)V")
	@Override
	protected final void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public final Class75 method6081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class75_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!kw", name = "H", descriptor = "(I)V")
	public final void method6166() {
		this.method6145(Static24.aClass281_1, 2);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!lh;)V")
	@Override
	public final void method6059(@OriginalArg(0) Class58 arg0) {
		this.aClass58_Sub2_3 = (Class58_Sub2) arg0;
	}

	@OriginalMember(owner = "client!kw", name = "I", descriptor = "(I)V")
	protected void method6167() {
		this.method6183();
	}

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "(B)V")
	private void method6168() {
		if (this.aBoolean539) {
			return;
		}
		@Pc(15) float[] local15 = this.aFloatArray58;
		@Pc(27) float local27 = (float) (-this.anInt7305 * this.anInt7288) / (float) this.anInt7287;
		@Pc(41) float local41 = (float) ((this.anInt7145 - this.anInt7305) * this.anInt7288) / (float) this.anInt7287;
		@Pc(52) float local52 = (float) (this.anInt7307 * this.anInt7288) / (float) this.anInt7312;
		@Pc(67) float local67 = (float) (this.anInt7288 * (this.anInt7307 - this.anInt7126)) / (float) this.anInt7312;
		if (local41 == local27 || local52 == local67) {
			local15[6] = 0.0F;
			local15[4] = 0.0F;
			local15[12] = 0.0F;
			local15[3] = 0.0F;
			local15[1] = 0.0F;
			local15[13] = 0.0F;
			local15[15] = 1.0F;
			local15[2] = 0.0F;
			local15[5] = 1.0F;
			local15[11] = 0.0F;
			local15[10] = 1.0F;
			local15[8] = 0.0F;
			local15[9] = 0.0F;
			local15[7] = 0.0F;
			local15[0] = 1.0F;
			local15[14] = 0.0F;
		} else {
			@Pc(81) float local81 = (float) this.anInt7288 * 2.0F;
			local15[6] = 0.0F;
			local15[11] = -1.0F;
			local15[8] = (local41 + local27) / (local41 - local27);
			local15[13] = 0.0F;
			local15[1] = 0.0F;
			local15[2] = 0.0F;
			local15[0] = local81 / (local41 - local27);
			local15[10] = this.aFloat186 = (float) this.anInt7298 / (float) (this.anInt7288 - this.anInt7298);
			local15[7] = 0.0F;
			local15[3] = 0.0F;
			local15[4] = 0.0F;
			local15[15] = 0.0F;
			local15[9] = (local67 + local52) / (-local67 + local52);
			local15[12] = 0.0F;
			local15[5] = local81 / (local52 - local67);
			local15[14] = this.aFloat203 = (float) (this.anInt7298 * this.anInt7288) / (float) (this.anInt7288 - this.anInt7298);
		}
		this.method6092();
		this.aBoolean539 = true;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public final void method6032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class209 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "()Z")
	@Override
	public final boolean method6024() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(BZ)V")
	public final void method6169(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean531 != arg0) {
			this.aBoolean531 = arg0;
			this.method6188();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIF)Lclient!at;")
	@Override
	public final Class2_Sub5 method6077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub5_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kw", name = "J", descriptor = "(I)V")
	protected void method6170() {
		this.anInt7290 = this.anInt7303;
		this.anInt7303 = 0;
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(BZ)V")
	public final void method6171(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean545 != arg0) {
			this.aBoolean545 = arg0;
			this.method6117();
			this.anInt7285 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "K", descriptor = "(I)V")
	protected abstract void method6172();

	@OriginalMember(owner = "client!kw", name = "M", descriptor = "(I)V")
	private void method6173() {
		this.aBoolean542 = false;
		if (Static269.aClass184_8 == this.aClass184_10) {
			this.method6123();
			this.method6128();
		}
	}

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "(B)V")
	private void method6174() {
		this.anInterface19_12 = this.method6100(false);
		this.anInterface19_12.method6493(140, 28);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface19_12.method6952();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method6195(local28);
				if (Stream.a()) {
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
				if (this.anInterface19_12.method6954()) {
					break;
				}
			}
		}
		this.aClass304_17 = this.method6090(new Class287[] { new Class287(new Class154[] { Static241.aClass154_1, Static241.aClass154_5, Static241.aClass154_5 }) });
	}

	@OriginalMember(owner = "client!kw", name = "N", descriptor = "(I)I")
	public final int method6175() {
		return this.anInt7278;
	}

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "()V")
	@Override
	public final void n() {
		if (this.aBoolean550) {
			this.aBoolean550 = false;
			this.method6163();
		}
		this.anInt7292 = 0;
		this.anInt7293 = this.anInt7126;
		this.anInt7286 = 0;
		this.anInt7300 = this.anInt7145;
		this.method6142();
	}

	@OriginalMember(owner = "client!kw", name = "O", descriptor = "(I)V")
	public final void method6176() {
		this.aClass165Array5 = new Class165[this.anInt7291];
		this.aClass165Array6 = new Class165[this.anInt7291];
		this.aClass224Array3 = new Class224[this.anInt7291];
		this.aClass181_Sub2Array3 = new Class181_Sub2[this.anInt7291];
		this.anInterface11Array3 = new Interface11[this.anInt7291];
		for (@Pc(32) int local32 = 0; local32 < this.anInt7291; local32++) {
			this.aClass165Array5[local32] = Static389.aClass165_3;
			this.aClass165Array6[local32] = Static389.aClass165_3;
			this.aClass224Array3[local32] = Static376.aClass224_4;
			this.aClass181_Sub2Array3[local32] = new Class181_Sub2();
		}
		this.aClass2_Sub5Array6 = new Class2_Sub5[this.anInt7279 - 2];
		this.anInterface11_3 = this.method6122(1, Static268.aClass171_10, Static51.aClass150_1, 1);
		this.method6050(new Class2_Sub4_Sub1(262144));
		this.aClass304_16 = this.method6090(new Class287[] { new Class287(new Class154[] { Static241.aClass154_1, Static241.aClass154_5 }) });
		this.aClass304_18 = this.method6090(new Class287[] { new Class287(new Class154[] { Static241.aClass154_1, Static241.aClass154_3 }) });
		this.aClass304_21 = this.method6090(new Class287[] { new Class287(Static241.aClass154_1), new Class287(Static241.aClass154_3), new Class287(Static241.aClass154_5), new Class287(Static241.aClass154_2) });
		this.aClass304_19 = this.method6090(new Class287[] { new Class287(Static241.aClass154_1), new Class287(Static241.aClass154_3), new Class287(Static241.aClass154_5) });
		this.aClass63_Sub3_29 = new Class63_Sub3(this, 0, 0, false, false);
		this.aClass63_Sub3_26 = new Class63_Sub3(this, 0, 0, true, true);
		this.aClass63_Sub3_27 = new Class63_Sub3(this, 0, 0, false, false);
		this.aClass63_Sub3_25 = new Class63_Sub3(this, 0, 0, true, true);
		this.aClass63_Sub3_30 = new Class63_Sub3(this, 0, 0, false, false);
		this.aClass63_Sub3_23 = new Class63_Sub3(this, 0, 0, true, true);
		this.aClass63_Sub3_21 = new Class63_Sub3(this, 0, 0, false, false);
		this.aClass63_Sub3_28 = new Class63_Sub3(this, 0, 0, true, true);
		this.aClass63_Sub3_24 = new Class63_Sub3(this, 0, 0, false, false);
		this.aClass63_Sub3_22 = new Class63_Sub3(this, 0, 0, true, true);
		this.aClass79_3 = new Class79(this);
		this.anInterface7_8 = this.method6204(true);
		this.method6134();
		this.aClass284_6 = new Class284(this);
		this.aClass5Array3[1] = this.method6084(1);
		this.aClass5Array3[2] = this.method6084(2);
		this.aClass5Array3[4] = this.method6084(4);
		this.aClass5Array3[5] = this.method6084(5);
		this.aClass5Array3[6] = this.method6084(6);
		this.aClass5Array3[7] = this.method6084(7);
		this.aClass5Array3[3] = this.method6084(3);
		this.aClass5Array3[8] = this.method6084(8);
		this.aClass5Array3[9] = this.method6084(9);
		if (!this.aClass5Array3[2].method7085()) {
			this.aClass5Array3[2] = this.method6084(0);
		}
		if (!this.aClass5Array3[4].method7085()) {
			this.aClass5Array3[4] = this.aClass5Array3[2];
		}
		if (!this.aClass5Array3[8].method7085()) {
			this.aClass5Array3[8] = this.aClass5Array3[4];
		}
		if (!this.aClass5Array3[9].method7085()) {
			this.aClass5Array3[9] = this.aClass5Array3[8];
		}
		this.method6167();
		this.n();
	}

	@OriginalMember(owner = "client!kw", name = "P", descriptor = "(I)V")
	protected abstract void method6177();

	@OriginalMember(owner = "client!kw", name = "u", descriptor = "(B)V")
	private void method6178() {
		if (Static269.aClass184_8 == this.aClass184_10) {
			return;
		}
		@Pc(14) Class184 local14 = this.aClass184_10;
		this.aClass184_10 = Static269.aClass184_8;
		if (local14.method4615()) {
			this.method6157();
		}
		this.method6123();
		this.aFloatArray63 = this.aFloatArray64;
		this.method6128();
		this.anInt7285 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!mn;Z)V")
	public final void method6179(@OriginalArg(0) Interface11 arg0) {
		if (this.anInterface11Array3[this.anInt7278] == arg0) {
			return;
		}
		this.anInterface11Array3[this.anInt7278] = arg0;
		if (arg0 == null) {
			this.method6149();
		} else {
			arg0.method7131();
		}
		this.anInt7285 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I[IIIZBI)Lclient!hc;")
	public abstract Interface8 method6180(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!dd;[Lclient!qr;Z)Lclient!ra;")
	@Override
	public final Class47 method6078(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class241[] arg1) {
		return new Class47_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "()Z")
	@Override
	public final boolean method6066() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "Q", descriptor = "(I)V")
	public final void method6181() {
		this.method6107();
		this.method6128();
	}

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "(B)V")
	private void method6182() {
		if (this.aCanvas12 == null) {
			this.anInt7116 = this.anInt7115 = 1;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas12.getSize();
			this.anInt7115 = local10.height;
			this.anInt7116 = local10.width;
		}
		this.anInt7145 = this.anInt7116;
		this.anInt7126 = this.anInt7115;
		this.method6173();
		this.method6214();
		this.method6202();
		this.method6165();
		this.method6142();
		this.method6107();
		this.n();
	}

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "(Z)V")
	private void method6183() {
		this.method6216();
		this.method6143();
		this.method6096();
		this.method6170();
		this.method6155();
		this.method6135();
		this.method6099();
		this.method6218();
		this.method6117();
		this.method6188();
		this.method6197();
		this.method6172();
		this.method6098();
		this.method6207();
		for (@Pc(56) int local56 = this.anInt7291 - 1; local56 >= 0; local56--) {
			this.method6191(local56);
			this.method6120();
			this.method6086();
			this.method6111();
		}
		this.method6177();
		this.method6165();
		this.method6185();
		this.method6112();
		this.method6121();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I[Lclient!at;)V")
	@Override
	public final void method6063(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass2_Sub5Array6[local3] = arg1[local3];
		}
		this.anInt7303 = arg0;
		if (this.aClass184_10.method4615()) {
			this.method6170();
		}
	}

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "(B)I")
	public final int method6184() {
		return this.anInt7304;
	}

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "(Z)V")
	protected abstract void method6185();

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6083(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!lc;BLclient!jt;)Z")
	public abstract boolean method6186(@OriginalArg(0) Class171 arg0, @OriginalArg(2) Class150 arg1);

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(ZI)V")
	public final void method6187(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean536 != arg0) {
			this.aBoolean536 = arg0;
			this.method6218();
			this.anInt7285 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "C", descriptor = "()Z")
	@Override
	public final boolean method6080() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "(Z)V")
	protected abstract void method6188();

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!wo;I)V")
	public abstract void method6189(@OriginalArg(0) Class316 arg0);

	@OriginalMember(owner = "client!kw", name = "ba", descriptor = "()I")
	@Override
	public final int ba() {
		return this.anInt7314;
	}

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "(B)V")
	private void method6190() {
		if (Static275.aClass184_11 == this.aClass184_10) {
			return;
		}
		@Pc(6) Class184 local6 = this.aClass184_10;
		this.aClass184_10 = Static275.aClass184_11;
		if (!local6.method4615()) {
			this.method6157();
		}
		this.method6118();
		this.aFloatArray63 = this.aFloatArray60;
		this.method6128();
		this.anInt7285 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!oaa;)V")
	@Override
	public final void method6019(@OriginalArg(0) Class208 arg0) {
		this.aClass79_3.method2242(arg0, this);
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "()V")
	@Override
	public final void method6023() {
		this.aClass62_3.method1769();
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(IZ)V")
	public final void method6191(@OriginalArg(0) int arg0) {
		if (this.anInt7278 != arg0) {
			this.anInt7278 = arg0;
			this.method6136();
		}
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method6083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		@Pc(29) float local29 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local9 * local9)));
		@Pc(33) float local33 = local9 * local29;
		@Pc(37) float local37 = local16 * local29;
		if (!this.method6109(0.0F, (float) arg1, (float) arg2 + local33, (float) arg3 + local37, (float) arg0, 0.0F)) {
			return;
		}
		this.method6127();
		this.method6203(arg4);
		this.method6192(0, Static254.aClass111_2);
		this.method6085(Static254.aClass111_2, 0);
		this.method6088(arg5);
		this.method6159();
		this.method6124(false);
		this.method6213();
		this.method6124(true);
		this.method6085(Static132.aClass111_1, 0);
		this.method6192(0, Static132.aClass111_1);
	}

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "()Z")
	@Override
	public final boolean method6026() {
		return false;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IBLclient!hba;)V")
	public final void method6192(@OriginalArg(0) int arg0, @OriginalArg(2) Class111 arg1) {
		this.method6119(arg1, false, arg0, false);
	}

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "(Z)V")
	private void method6193() {
		if (Static252.aClass184_6 == this.aClass184_10) {
			return;
		}
		@Pc(10) Class184 local10 = this.aClass184_10;
		this.aClass184_10 = Static252.aClass184_6;
		if (!local10.method4615()) {
			this.method6157();
		}
		this.method6168();
		this.aFloatArray63 = this.aFloatArray58;
		this.method6128();
		this.anInt7285 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(ZB)V")
	public final void method6194(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean549) {
			this.aBoolean549 = arg0;
			this.method6099();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;I)Lclient!jaclib/memory/Stream;")
	public final Stream method6195(@OriginalArg(0) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(FI)V")
	public final void method6196(@OriginalArg(0) float arg0) {
		if (this.aFloat197 != arg0) {
			this.aFloat197 = arg0;
			this.method6202();
		}
	}

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "(B)V")
	protected abstract void method6197();

	@OriginalMember(owner = "client!kw", name = "M", descriptor = "(F)V")
	@Override
	public final void M(@OriginalArg(0) float arg0) {
		if (this.aFloat189 != arg0) {
			this.aFloat189 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method6216();
			this.method6135();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Z[BIIILclient!jt;)Lclient!hc;")
	public final Interface8 method6198(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class150 arg4) {
		return this.method6105(arg3, arg2, arg4, arg1, arg0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public final Class35 method6049(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class35_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "(IIII)V")
	@Override
	public final void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7304 = arg2;
		this.anInt7299 = arg3;
		this.anInt7302 = arg1;
		this.anInt7283 = arg0;
		this.aBoolean533 = true;
		this.method6205(3, false, 0, 0, false);
		if (this.aClass5_3 != null) {
			this.aClass5_3.method7089();
		}
		this.method6094();
		this.method6188();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIZI[FILclient!jt;)Lclient!hc;")
	protected abstract Interface8 method6199(@OriginalArg(3) boolean arg0, @OriginalArg(4) int arg1, @OriginalArg(5) float[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class150 arg4);

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!vs;)V")
	public abstract void method6200(@OriginalArg(1) Class304 arg0);

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt7294;
		if (local11 || this.aFloat200 != arg1 || this.aFloat192 != arg2) {
			this.aFloat200 = arg1;
			this.anInt7294 = arg0;
			this.aFloat192 = arg2;
			if (local11) {
				this.aFloat188 = (float) (this.anInt7294 & 0xFF0000) / 1.671168E7F;
				this.aFloat191 = (float) (this.anInt7294 & 0xFF00) / 65280.0F;
				this.aFloat194 = (float) (this.anInt7294 & 0xFF) / 255.0F;
				this.method6216();
			}
			this.aNativeInterface3.setSunColour(this.aFloat188, this.aFloat191, this.aFloat194, arg1, arg2);
			this.method6143();
		}
		if (this.aFloatArray59[0] != arg3 || arg4 != this.aFloatArray59[1] || arg5 != this.aFloatArray59[2]) {
			this.aFloatArray59[0] = arg3;
			this.aFloatArray59[1] = arg4;
			this.aFloatArray59[2] = arg5;
			this.aFloatArray62[1] = -arg4;
			this.aFloatArray62[0] = -arg3;
			this.aFloatArray62[2] = -arg5;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray61[1] = arg4 * local149;
			this.aFloatArray61[2] = arg5 * local149;
			this.aFloatArray61[0] = arg3 * local149;
			this.aFloatArray57[0] = -this.aFloatArray61[0];
			this.aFloatArray57[1] = -this.aFloatArray61[1];
			this.aFloatArray57[2] = -this.aFloatArray61[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray61[0], this.aFloatArray61[1], this.aFloatArray61[2]);
			this.method6155();
			this.anInt7295 = (int) (arg5 * 256.0F / arg4);
			this.anInt7306 = (int) (arg3 * 256.0F / arg4);
		}
		this.method6135();
	}

	@OriginalMember(owner = "client!kw", name = "R", descriptor = "(I)V")
	private void method6202() {
		this.aBoolean542 = false;
		if (this.aClass184_10 == Static275.aClass184_11) {
			this.method6118();
			this.method6128();
		}
	}

	@OriginalMember(owner = "client!kw", name = "F", descriptor = "(IIII)V")
	@Override
	public final void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 > this.anInt7286) {
			this.anInt7286 = arg1;
		}
		if (arg0 > this.anInt7292) {
			this.anInt7292 = arg0;
		}
		if (this.anInt7293 > arg3) {
			this.anInt7293 = arg3;
		}
		if (arg2 < this.anInt7300) {
			this.anInt7300 = arg2;
		}
		if (this.anInt7292 <= 0 && this.anInt7300 >= this.anInt7145 && this.anInt7286 <= 0 && this.anInt7126 <= this.anInt7293) {
			this.n();
			return;
		}
		if (!this.aBoolean550) {
			this.aBoolean550 = true;
			this.method6163();
		}
		this.method6138();
		this.method6142();
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
	@Override
	public final void method6012(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt7309 = arg0;
		this.aClass62_3.method1769();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IB)V")
	public final void method6203(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt7281) {
			this.anInt7281 = arg0;
			this.method6177();
		}
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(ZI)Lclient!g;")
	public abstract Interface7 method6204(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZIIZB)V")
	private void method6205(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) boolean local4 = arg1 & this.method6073();
		if (!local4 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			arg0 = 2;
			arg2 = 1;
			arg3 = 0;
		}
		if (arg0 != 0 && arg4) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt7310 != arg0) {
			if (this.anInt7310 != 0) {
				this.aClass5Array3[this.anInt7310 & Integer.MAX_VALUE].method7087();
			}
			if (arg0 == 0) {
				this.aClass5_3 = null;
			} else {
				this.aClass5_3 = this.aClass5Array3[arg0 & Integer.MAX_VALUE];
				this.aClass5_3.method7081(arg4);
				this.aClass5_3.method7092(arg4);
				this.aClass5_3.method7091(arg2, arg3);
			}
			this.anInt7284 = arg3;
			this.anInt7310 = arg0;
			this.bf = arg2;
		} else if (this.anInt7310 != 0) {
			this.aClass5Array3[Integer.MAX_VALUE & this.anInt7310].method7092(arg4);
			if (arg3 != this.anInt7284 || arg2 != this.bf) {
				this.aClass5Array3[Integer.MAX_VALUE & this.anInt7310].method7091(arg2, arg3);
				this.anInt7284 = arg3;
				this.bf = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "S", descriptor = "(I)V")
	public final void method6206() {
		if (this.anInt7285 == 16) {
			return;
		}
		this.method6190();
		this.method6102(true);
		this.method6187(true);
		this.method6171(true);
		this.method6088(1);
		this.anInt7285 = 16;
	}

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "()V")
	@Override
	protected void method6055() {
		if (this.aBoolean544) {
			return;
		}
		for (@Pc(13) Class2 local13 = this.aClass249_49.method6527(); local13 != null; local13 = this.aClass249_49.method6525()) {
			((Class2_Sub4_Sub1) local13).method551();
		}
		@Pc(30) Enumeration local30 = this.aHashtable5.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method6154(this.aHashtable5.get(local36), local36);
		}
		Static456.method6972(false, true);
		this.aNativeInterface3.release();
		this.aBoolean544 = true;
	}

	@OriginalMember(owner = "client!kw", name = "T", descriptor = "(I)V")
	protected abstract void method6207();

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)I")
	@Override
	public final int method6028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!kw", name = "D", descriptor = "()Z")
	@Override
	public final boolean method6082() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZIIZ)V")
	public final void method6208(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt7280 != arg1) {
			if (arg1 < 0) {
				this.method6111();
				this.method6179(null);
				this.method6164(0);
				if (!this.aBoolean533) {
					this.method6205(0, arg2, 0, 0, arg0);
				}
			} else {
				@Pc(42) Interface8 local42 = this.aClass62_3.method1770(arg1);
				@Pc(48) Class204 local48 = super.anInterface12_15.method2573(arg1);
				if (local48.aByte87 == 0 && local48.aByte84 == 0) {
					this.method6111();
				} else {
					@Pc(67) int local67 = local48.aBoolean454 ? 64 : 128;
					@Pc(71) int local71 = local67 * 50;
					@Pc(75) Class181_Sub2 local75 = this.method6133();
					local75.method5409((float) (this.anInt7297 % local71 * local48.aByte84) / (float) local71, (float) (local48.aByte87 * (this.anInt7297 % local71)) / (float) local71, 0.0F);
					this.method6091(Static532.aClass224_6);
				}
				if (!this.aBoolean533) {
					this.method6205(local48.aByte85, arg2, local48.anInt6222, local48.aByte86, arg0);
				}
				if (this.aClass5_3 == null) {
					this.method6179(local42);
					this.method6164(local48.anInt6219);
				} else {
					this.aClass5_3.method7083(local48.anInt6219, local42);
				}
			}
			this.anInt7280 = arg1;
		}
		this.anInt7285 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "()Lclient!m;")
	@Override
	public final Class181 method6035() {
		return new Class181_Sub2();
	}

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "()Z")
	@Override
	public final boolean method6065() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
	@Override
	public void method6008(@OriginalArg(0) int arg0) {
		this.aClass62_3.method1765();
		this.anInt7297 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!kw", name = "U", descriptor = "(I)Lclient!df;")
	public final Interface4 method6210() {
		return this.aClass58_Sub2_3 == null ? null : this.aClass58_Sub2_3.method1912();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!oe;)V")
	public final void method6211(@OriginalArg(1) Class181_Sub2 arg0) {
		this.aClass181_Sub2_15.EA(arg0);
		this.aBoolean530 = false;
		this.method6156();
	}

	@OriginalMember(owner = "client!kw", name = "V", descriptor = "(I)Lclient!oe;")
	public final Class181_Sub2 method6212() {
		return this.aClass181_Sub2_19;
	}

	@OriginalMember(owner = "client!kw", name = "z", descriptor = "(B)V")
	private void method6213() {
		this.method6200(this.aClass304_20);
		this.method6095(0, this.anInterface19_13);
		this.method6087(0, Static160.aClass281_2, 1);
	}

	@OriginalMember(owner = "client!kw", name = "W", descriptor = "(I)V")
	private void method6214() {
		this.aBoolean539 = false;
		this.method6168();
		if (this.aClass184_10 == Static252.aClass184_6) {
			this.method6128();
		}
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(Z)V")
	@Override
	public final void method6058(@OriginalArg(0) boolean arg0) {
		this.aBoolean543 = arg0;
		this.method6117();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLclient!g;ILclient!ud;III)V")
	public abstract void method6215(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class281 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!kw", name = "A", descriptor = "(B)V")
	protected abstract void method6216();

	@OriginalMember(owner = "client!kw", name = "ra", descriptor = "()F")
	@Override
	public final float ra() {
		return this.aFloat190;
	}

	@OriginalMember(owner = "client!kw", name = "CA", descriptor = "()I")
	@Override
	public final int CA() {
		return this.anInt7298;
	}

	@OriginalMember(owner = "client!kw", name = "B", descriptor = "(B)V")
	protected final void method6217() {
		@Pc(17) Enumeration local17 = this.aHashtable5.keys();
		while (local17.hasMoreElements()) {
			@Pc(23) Canvas local23 = (Canvas) local17.nextElement();
			this.method6154(this.aHashtable5.get(local23), local23);
		}
		this.anInterface19_12.method6953();
		this.anInterface19_13.method6953();
		this.aClass63_Sub3_26.method6334();
		this.aClass63_Sub3_25.method6334();
		this.aClass63_Sub3_23.method6334();
		this.aClass63_Sub3_28.method6334();
		this.aClass63_Sub3_22.method6334();
		this.aClass79_3.method2241();
		this.anInterface7_8.method6953();
	}

	@OriginalMember(owner = "client!kw", name = "X", descriptor = "(I)V")
	protected abstract void method6218();

	@OriginalMember(owner = "client!kw", name = "ta", descriptor = "(II)V")
	@Override
	public final void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7288 == arg0 && arg1 == this.anInt7298) {
			return;
		}
		this.anInt7298 = arg1;
		this.anInt7288 = arg0;
		this.method6214();
		this.method6202();
		this.method6094();
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "(IIIIII)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6127();
		this.method6203(arg4);
		this.method6192(0, Static254.aClass111_2);
		this.method6085(Static254.aClass111_2, 0);
		this.method6088(arg5);
		this.aClass181_Sub2_15.method5401((float) arg2, 1.0F, (float) arg3);
		this.aClass181_Sub2_15.TA(arg0, arg1, 0);
		this.method6156();
		this.method6124(false);
		this.method6166();
		this.method6124(true);
		this.method6085(Static132.aClass111_1, 0);
		this.method6192(0, Static132.aClass111_1);
	}
}
