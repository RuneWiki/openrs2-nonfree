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

@OriginalClass("client!fc")
public abstract class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!fc", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!fc", name = "yb", descriptor = "Lclient!bl;")
	protected Class31 aClass31_5;

	@OriginalMember(owner = "client!fc", name = "Ub", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!fc", name = "Gd", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!fc", name = "Od", descriptor = "I")
	public int anInt6515;

	@OriginalMember(owner = "client!fc", name = "Qd", descriptor = "I")
	protected int anInt6516;

	@OriginalMember(owner = "client!fc", name = "Rd", descriptor = "I")
	public int anInt6517;

	@OriginalMember(owner = "client!fc", name = "de", descriptor = "I")
	public int anInt6518;

	@OriginalMember(owner = "client!fc", name = "je", descriptor = "I")
	protected int anInt6522;

	@OriginalMember(owner = "client!fc", name = "ke", descriptor = "Z")
	public boolean aBoolean547;

	@OriginalMember(owner = "client!fc", name = "ne", descriptor = "Lclient!wm;")
	private Class356 aClass356_3;

	@OriginalMember(owner = "client!fc", name = "qe", descriptor = "Lclient!nm;")
	public Interface13 anInterface13_3;

	@OriginalMember(owner = "client!fc", name = "se", descriptor = "[Lclient!gga;")
	protected Class120[] aClass120Array5;

	@OriginalMember(owner = "client!fc", name = "ue", descriptor = "Z")
	protected boolean aBoolean548;

	@OriginalMember(owner = "client!fc", name = "ve", descriptor = "[Lclient!vc;")
	protected Class255_Sub3[] aClass255_Sub3Array3;

	@OriginalMember(owner = "client!fc", name = "we", descriptor = "I")
	public int anInt6525;

	@OriginalMember(owner = "client!fc", name = "ze", descriptor = "I")
	public int anInt6527;

	@OriginalMember(owner = "client!fc", name = "Be", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!fc", name = "Ce", descriptor = "I")
	public int anInt6528;

	@OriginalMember(owner = "client!fc", name = "Ee", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!fc", name = "Ie", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!fc", name = "Je", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!fc", name = "Le", descriptor = "F")
	private float aFloat134;

	@OriginalMember(owner = "client!fc", name = "Me", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!fc", name = "Ne", descriptor = "Z")
	protected boolean aBoolean550;

	@OriginalMember(owner = "client!fc", name = "Re", descriptor = "[Lclient!pn;")
	protected Class3_Sub28[] aClass3_Sub28Array5;

	@OriginalMember(owner = "client!fc", name = "Ve", descriptor = "F")
	private float aFloat136;

	@OriginalMember(owner = "client!fc", name = "bf", descriptor = "F")
	private float bf;

	@OriginalMember(owner = "client!fc", name = "df", descriptor = "I")
	protected int anInt6538;

	@OriginalMember(owner = "client!fc", name = "ef", descriptor = "Lclient!wh;")
	private Class19 aClass19_3;

	@OriginalMember(owner = "client!fc", name = "hf", descriptor = "I")
	private int anInt6541;

	@OriginalMember(owner = "client!fc", name = "jf", descriptor = "Lclient!tj;")
	private Class108_Sub2 aClass108_Sub2_3;

	@OriginalMember(owner = "client!fc", name = "rf", descriptor = "Z")
	public boolean aBoolean555;

	@OriginalMember(owner = "client!fc", name = "vf", descriptor = "I")
	protected int anInt6546;

	@OriginalMember(owner = "client!fc", name = "wf", descriptor = "I")
	private int anInt6547;

	@OriginalMember(owner = "client!fc", name = "xf", descriptor = "[Lclient!gga;")
	protected Class120[] aClass120Array6;

	@OriginalMember(owner = "client!fc", name = "yf", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!fc", name = "Ef", descriptor = "Z")
	public boolean aBoolean558;

	@OriginalMember(owner = "client!fc", name = "Hf", descriptor = "[Lclient!wq;")
	protected Class359[] aClass359Array3;

	@OriginalMember(owner = "client!fc", name = "Lf", descriptor = "I")
	protected int anInt6551;

	@OriginalMember(owner = "client!fc", name = "Sf", descriptor = "[Lclient!nm;")
	private Interface13[] anInterface13Array3;

	@OriginalMember(owner = "client!fc", name = "Xf", descriptor = "Lclient!hj;")
	private Class142 aClass142_13;

	@OriginalMember(owner = "client!fc", name = "Yf", descriptor = "Lclient!hj;")
	private Class142 aClass142_14;

	@OriginalMember(owner = "client!fc", name = "Zf", descriptor = "Lclient!kb;")
	public Class21_Sub2 aClass21_Sub2_21;

	@OriginalMember(owner = "client!fc", name = "ag", descriptor = "Lclient!hj;")
	public Class142 aClass142_15;

	@OriginalMember(owner = "client!fc", name = "bg", descriptor = "Lclient!kb;")
	public Class21_Sub2 aClass21_Sub2_22;

	@OriginalMember(owner = "client!fc", name = "dg", descriptor = "Lclient!kb;")
	public Class21_Sub2 aClass21_Sub2_23;

	@OriginalMember(owner = "client!fc", name = "eg", descriptor = "Lclient!cu;")
	private Interface2 anInterface2_7;

	@OriginalMember(owner = "client!fc", name = "fg", descriptor = "Lclient!kb;")
	public Class21_Sub2 aClass21_Sub2_24;

	@OriginalMember(owner = "client!fc", name = "gg", descriptor = "Lclient!kb;")
	public Class21_Sub2 aClass21_Sub2_25;

	@OriginalMember(owner = "client!fc", name = "hg", descriptor = "Lclient!hj;")
	public Class142 aClass142_16;

	@OriginalMember(owner = "client!fc", name = "ig", descriptor = "Lclient!hj;")
	public Class142 aClass142_17;

	@OriginalMember(owner = "client!fc", name = "jg", descriptor = "Lclient!kb;")
	public Class21_Sub2 aClass21_Sub2_26;

	@OriginalMember(owner = "client!fc", name = "kg", descriptor = "Lclient!kb;")
	public Class21_Sub2 aClass21_Sub2_27;

	@OriginalMember(owner = "client!fc", name = "lg", descriptor = "Lclient!kb;")
	public Class21_Sub2 aClass21_Sub2_28;

	@OriginalMember(owner = "client!fc", name = "mg", descriptor = "Lclient!kb;")
	public Class21_Sub2 aClass21_Sub2_29;

	@OriginalMember(owner = "client!fc", name = "ng", descriptor = "Lclient!ui;")
	private Interface20 anInterface20_5;

	@OriginalMember(owner = "client!fc", name = "og", descriptor = "Lclient!hj;")
	public Class142 aClass142_18;

	@OriginalMember(owner = "client!fc", name = "pg", descriptor = "Lclient!cu;")
	private Interface2 anInterface2_8;

	@OriginalMember(owner = "client!fc", name = "qg", descriptor = "Lclient!kb;")
	public Class21_Sub2 aClass21_Sub2_30;

	@OriginalMember(owner = "client!fc", name = "rg", descriptor = "I")
	private int anInt6558;

	@OriginalMember(owner = "client!fc", name = "sg", descriptor = "Z")
	protected boolean aBoolean563;

	@OriginalMember(owner = "client!fc", name = "Dc", descriptor = "Lclient!ki;")
	private final Class183 aClass183_39 = new Class183();

	@OriginalMember(owner = "client!fc", name = "Sd", descriptor = "Z")
	protected boolean aBoolean543 = true;

	@OriginalMember(owner = "client!fc", name = "Pd", descriptor = "Lclient!vc;")
	protected final Class255_Sub3 aClass255_Sub3_15 = new Class255_Sub3();

	@OriginalMember(owner = "client!fc", name = "Td", descriptor = "Lclient!vc;")
	public Class255_Sub3 aClass255_Sub3_16 = new Class255_Sub3();

	@OriginalMember(owner = "client!fc", name = "Ud", descriptor = "Lclient!vc;")
	public final Class255_Sub3 aClass255_Sub3_17 = new Class255_Sub3();

	@OriginalMember(owner = "client!fc", name = "Vd", descriptor = "Lclient!vc;")
	protected final Class255_Sub3 aClass255_Sub3_18 = new Class255_Sub3();

	@OriginalMember(owner = "client!fc", name = "Wd", descriptor = "Lclient!vc;")
	private final Class255_Sub3 aClass255_Sub3_19 = new Class255_Sub3();

	@OriginalMember(owner = "client!fc", name = "Xd", descriptor = "Lclient!vc;")
	private final Class255_Sub3 aClass255_Sub3_20 = new Class255_Sub3();

	@OriginalMember(owner = "client!fc", name = "ie", descriptor = "[F")
	private final float[] aFloatArray49 = new float[16];

	@OriginalMember(owner = "client!fc", name = "pe", descriptor = "I")
	protected int anInt6524 = 0;

	@OriginalMember(owner = "client!fc", name = "ge", descriptor = "I")
	protected int anInt6520 = 0;

	@OriginalMember(owner = "client!fc", name = "De", descriptor = "I")
	public int anInt6529 = 512;

	@OriginalMember(owner = "client!fc", name = "ye", descriptor = "I")
	public int anInt6526 = 3;

	@OriginalMember(owner = "client!fc", name = "ce", descriptor = "Z")
	protected boolean aBoolean546 = true;

	@OriginalMember(owner = "client!fc", name = "le", descriptor = "[F")
	private final float[] aFloatArray50 = new float[16];

	@OriginalMember(owner = "client!fc", name = "Zd", descriptor = "[F")
	public final float[] aFloatArray48 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!fc", name = "he", descriptor = "I")
	protected int anInt6521 = -1;

	@OriginalMember(owner = "client!fc", name = "Yd", descriptor = "F")
	public float aFloat126 = 1.0F;

	@OriginalMember(owner = "client!fc", name = "Ze", descriptor = "F")
	private float aFloat137 = 3000.0F;

	@OriginalMember(owner = "client!fc", name = "Ye", descriptor = "I")
	public int anInt6536 = 0;

	@OriginalMember(owner = "client!fc", name = "xe", descriptor = "F")
	public float aFloat127 = 3584.0F;

	@OriginalMember(owner = "client!fc", name = "af", descriptor = "F")
	public float aFloat138 = 3584.0F;

	@OriginalMember(owner = "client!fc", name = "Qe", descriptor = "I")
	private int anInt6533 = 0;

	@OriginalMember(owner = "client!fc", name = "sf", descriptor = "F")
	public float aFloat140 = -1.0F;

	@OriginalMember(owner = "client!fc", name = "pf", descriptor = "[F")
	private final float[] aFloatArray54 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!fc", name = "Pe", descriptor = "I")
	private int anInt6532 = 0;

	@OriginalMember(owner = "client!fc", name = "te", descriptor = "Lclient!eg;")
	protected Class82 aClass82_5 = Static204.aClass82_3;

	@OriginalMember(owner = "client!fc", name = "of", descriptor = "[F")
	private final float[] aFloatArray53 = new float[16];

	@OriginalMember(owner = "client!fc", name = "Ae", descriptor = "F")
	private float aFloat128 = 1.0F;

	@OriginalMember(owner = "client!fc", name = "Te", descriptor = "Z")
	protected boolean aBoolean552 = true;

	@OriginalMember(owner = "client!fc", name = "lf", descriptor = "F")
	public float aFloat139 = -1.0F;

	@OriginalMember(owner = "client!fc", name = "tf", descriptor = "Z")
	protected boolean aBoolean556 = false;

	@OriginalMember(owner = "client!fc", name = "ff", descriptor = "I")
	public int anInt6539 = 128;

	@OriginalMember(owner = "client!fc", name = "ee", descriptor = "I")
	public int anInt6519 = 8;

	@OriginalMember(owner = "client!fc", name = "He", descriptor = "F")
	public float aFloat131 = 1.0F;

	@OriginalMember(owner = "client!fc", name = "qf", descriptor = "I")
	private int anInt6544 = -1;

	@OriginalMember(owner = "client!fc", name = "kf", descriptor = "Z")
	private boolean aBoolean554 = false;

	@OriginalMember(owner = "client!fc", name = "We", descriptor = "[F")
	private final float[] aFloatArray52 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!fc", name = "mf", descriptor = "I")
	protected int anInt6542 = 3584;

	@OriginalMember(owner = "client!fc", name = "Cf", descriptor = "[Lclient!wh;")
	private final Class19[] aClass19Array3 = new Class19[10];

	@OriginalMember(owner = "client!fc", name = "Oe", descriptor = "Z")
	private boolean aBoolean551 = false;

	@OriginalMember(owner = "client!fc", name = "Ke", descriptor = "I")
	private int anInt6531 = 16777215;

	@OriginalMember(owner = "client!fc", name = "Ff", descriptor = "Lclient!gaa;")
	protected Class112 aClass112_13 = Static116.aClass112_3;

	@OriginalMember(owner = "client!fc", name = "nf", descriptor = "I")
	public int anInt6543 = 0;

	@OriginalMember(owner = "client!fc", name = "Gf", descriptor = "Z")
	private boolean aBoolean559 = false;

	@OriginalMember(owner = "client!fc", name = "Df", descriptor = "F")
	public float aFloat142 = 1.0F;

	@OriginalMember(owner = "client!fc", name = "Xe", descriptor = "I")
	protected final int anInt6535 = 0;

	@OriginalMember(owner = "client!fc", name = "Ue", descriptor = "Z")
	private boolean aBoolean553 = false;

	@OriginalMember(owner = "client!fc", name = "Pf", descriptor = "I")
	protected final int anInt6554 = 0;

	@OriginalMember(owner = "client!fc", name = "ae", descriptor = "Z")
	protected boolean aBoolean544 = true;

	@OriginalMember(owner = "client!fc", name = "Kf", descriptor = "F")
	public float aFloat143 = 1.0F;

	@OriginalMember(owner = "client!fc", name = "Fe", descriptor = "Z")
	protected boolean aBoolean549 = false;

	@OriginalMember(owner = "client!fc", name = "Of", descriptor = "Z")
	private boolean aBoolean561 = false;

	@OriginalMember(owner = "client!fc", name = "be", descriptor = "Z")
	protected boolean aBoolean545 = false;

	@OriginalMember(owner = "client!fc", name = "oe", descriptor = "I")
	protected int anInt6523 = 0;

	@OriginalMember(owner = "client!fc", name = "Tf", descriptor = "I")
	public int anInt6556 = 50;

	@OriginalMember(owner = "client!fc", name = "Jf", descriptor = "Z")
	protected boolean aBoolean560 = false;

	@OriginalMember(owner = "client!fc", name = "Bf", descriptor = "Z")
	protected boolean aBoolean557 = true;

	@OriginalMember(owner = "client!fc", name = "Se", descriptor = "I")
	public int anInt6534 = 0;

	@OriginalMember(owner = "client!fc", name = "Mf", descriptor = "I")
	protected int anInt6552 = 0;

	@OriginalMember(owner = "client!fc", name = "If", descriptor = "I")
	public int anInt6550 = -1;

	@OriginalMember(owner = "client!fc", name = "uf", descriptor = "I")
	public int anInt6545 = 512;

	@OriginalMember(owner = "client!fc", name = "re", descriptor = "[F")
	protected float[] aFloatArray51 = this.aFloatArray54;

	@OriginalMember(owner = "client!fc", name = "Rf", descriptor = "I")
	private int anInt6555 = -1;

	@OriginalMember(owner = "client!fc", name = "Vf", descriptor = "I")
	private int anInt6557 = 0;

	@OriginalMember(owner = "client!fc", name = "Qf", descriptor = "[F")
	private final float[] aFloatArray55 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!fc", name = "Nf", descriptor = "I")
	protected int anInt6553 = 0;

	@OriginalMember(owner = "client!fc", name = "Uf", descriptor = "Z")
	protected boolean aBoolean562 = true;

	@OriginalMember(owner = "client!fc", name = "Af", descriptor = "I")
	private int anInt6549 = 1;

	@OriginalMember(owner = "client!fc", name = "zf", descriptor = "I")
	public int anInt6548 = -1;

	@OriginalMember(owner = "client!fc", name = "Wf", descriptor = "[F")
	public final float[] aFloatArray56 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!fc", name = "cf", descriptor = "I")
	private int anInt6537 = 0;

	@OriginalMember(owner = "client!fc", name = "fe", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream5 = new Stream();

	@OriginalMember(owner = "client!fc", name = "cg", descriptor = "Lclient!vc;")
	private final Class255_Sub3 aClass255_Sub3_21 = new Class255_Sub3();

	@OriginalMember(owner = "client!fc", name = "yc", descriptor = "Ljava/lang/Object;")
	protected final Object anObject12;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "Ljava/lang/Object;")
	private Object anObject11;

	@OriginalMember(owner = "client!fc", name = "Zb", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas12;

	@OriginalMember(owner = "client!fc", name = "ab", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!fc", name = "Ge", descriptor = "I")
	protected final int anInt6530;

	@OriginalMember(owner = "client!fc", name = "Jd", descriptor = "Lclient!pe;")
	protected final Class254 aClass254_89;

	@OriginalMember(owner = "client!fc", name = "gf", descriptor = "I")
	public final int anInt6540;

	@OriginalMember(owner = "client!fc", name = "wc", descriptor = "I")
	private int anInt6450;

	@OriginalMember(owner = "client!fc", name = "qb", descriptor = "I")
	public int anInt6395;

	@OriginalMember(owner = "client!fc", name = "Mb", descriptor = "I")
	private int anInt6416;

	@OriginalMember(owner = "client!fc", name = "ic", descriptor = "I")
	public int anInt6436;

	@OriginalMember(owner = "client!fc", name = "me", descriptor = "Lclient!jl;")
	private final Class172 aClass172_3;

	@OriginalMember(owner = "client!fc", name = "Ld", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!e;Lclient!pe;II)V")
	protected Class15_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class254 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anObject11 = this.anObject12 = arg1;
		this.aCanvas11 = this.aCanvas12 = arg0;
		this.anInt6530 = arg4;
		this.aClass254_89 = arg3;
		@Pc(305) Dimension local305 = arg0.getSize();
		this.anInt6540 = arg5;
		this.anInt6395 = this.anInt6450 = local305.width;
		this.anInt6436 = this.anInt6416 = local305.height;
		Static67.method8226(true, false);
		this.aClass172_3 = new Class172(this, super.anInterface4_11);
		this.aNativeInterface3 = new NativeInterface(super.anInterface4_11.method3087(), this.anInt6540);
		for (@Pc(347) int local347 = 0; local347 < super.anInterface4_11.method3087(); local347++) {
			@Pc(354) Class178 local354 = super.anInterface4_11.method3088(local347);
			if (local354 != null) {
				this.aNativeInterface3.initTextureMetrics(local347, local354.aByte52, local354.aByte57);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	private void method5356() {
		if (this.aClass19_3 != null) {
			this.aClass19_3.method7887();
		}
		this.method5454();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIF)Lclient!pn;")
	@Override
	public final Class3_Sub28 method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub28_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	private void method5357() {
		this.aBoolean561 = false;
		this.method5436();
		if (Static545.aClass82_7 == this.aClass82_5) {
			this.method5395();
		}
	}

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)V")
	protected abstract void method5358();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!kn;)V")
	@Override
	public final void method5344(@OriginalArg(0) Class108 arg0) {
		this.aClass108_Sub2_3 = (Class108_Sub2) arg0;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5311(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas12 == arg0) {
			local5 = this.anObject11;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method5455(local5, arg0);
		if (arg0 == this.aCanvas11) {
			this.method5439();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZII)V")
	public final void method5359(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt6555 != arg2) {
			if (arg2 < 0) {
				this.method5442();
				this.method5414(null);
				this.method5372(0);
				if (!this.aBoolean547) {
					this.method5450(arg0, 0, 0, 0, arg1);
				}
			} else {
				@Pc(41) Interface14 local41 = this.aClass172_3.method4474(arg2);
				@Pc(47) Class178 local47 = super.anInterface4_11.method3088(arg2);
				if (local47.aByte56 == 0 && local47.aByte55 == 0) {
					this.method5442();
				} else {
					@Pc(63) int local63 = local47.aBoolean486 ? 64 : 128;
					@Pc(67) int local67 = local63 * 50;
					@Pc(71) Class255_Sub3 local71 = this.method5465();
					local71.method8035(0.0F, (float) (this.anInt6528 % local67 * local47.aByte56) / (float) local67, (float) (this.anInt6528 % local67 * local47.aByte55) / (float) local67);
					this.method5485(Static317.aClass359_13);
				}
				if (!this.aBoolean547) {
					this.method5450(arg0, local47.aByte58, local47.aByte54, local47.anInt5664, arg1);
				}
				if (this.aClass19_3 == null) {
					this.method5414(local41);
					this.method5372(local47.anInt5666);
				} else {
					this.aClass19_3.method7886(local41, local47.anInt5666);
				}
			}
			this.anInt6555 = arg2;
		}
		this.anInt6541 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "(I)V")
	private void method5360() {
		this.aBoolean551 = false;
		if (this.aClass19_3 != null) {
			this.aClass19_3.method7885();
		}
		this.method5361();
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
	protected abstract void method5361();

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V")
	private void method5362() {
		if (this.anInt6541 == 1) {
			return;
		}
		this.method5475();
		this.method5476(false);
		this.method5403(false);
		this.method5470(false);
		this.method5399(false);
		this.method5359(false, false, -2);
		this.method5372(1);
		this.method5414(this.anInterface13_3);
		this.anInt6541 = 1;
	}

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "(I)I")
	public final int method5363() {
		return this.anInt6523;
	}

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "(IIIIII)V")
	@Override
	public final void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5362();
		this.method5487(arg4);
		this.method5444(0, Static531.aClass85_5);
		this.method5488(Static531.aClass85_5, 0);
		this.method5460(arg5);
		this.aClass255_Sub3_15.method8042(1.0F, (float) arg3, (float) arg2);
		this.aClass255_Sub3_15.G(arg0, arg1, 0);
		this.method5445();
		this.method5393(false);
		this.method5466();
		this.method5393(true);
		this.method5488(Static159.aClass85_1, 0);
		this.method5444(0, Static159.aClass85_1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lclient!ba;Lclient!qu;Lclient!q;[Lclient!ht;I)V")
	@Override
	public final void method5297(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Class55_Sub3[] arg3, @OriginalArg(4) int arg4) {
		this.method5310(arg0, arg2, arg3, arg4);
		this.method5277(arg1);
	}

	@OriginalMember(owner = "client!fc", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public final void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!bm;)V")
	private void method5364(@OriginalArg(0) int arg0, @OriginalArg(2) Class32 arg1) {
		this.method5376(0, this.anInterface2_7);
		this.method5391(this.aClass142_14);
		this.method5420(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5286(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas12) {
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
			@Pc(53) Object local53 = this.method5412(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "(I)V")
	public abstract void method5365();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(FB)V")
	public final void method5366(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat128) {
			this.aFloat128 = arg0;
			this.method5390();
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)Lclient!i;")
	@Override
	public final Class3_Sub19 method5313(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub19_Sub2 local8 = new Class3_Sub19_Sub2(arg0);
		this.aClass183_39.method4792(local8);
		return local8;
	}

	@OriginalMember(owner = "client!fc", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public final boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass255_Sub3_16.method8030((float) arg2, (float) arg0, (float) arg1);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass255_Sub3_16.method8030((float) arg5, (float) arg3, (float) arg4);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt6556 > local14 && local31 < (float) this.anInt6556 || !(!(local14 > (float) this.anInt6542) || !(local31 > (float) this.anInt6542))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt6545 * this.aClass255_Sub3_16.method8036((float) arg0, (float) arg1, (float) arg2) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt6545 * this.aClass255_Sub3_16.method8036((float) arg3, (float) arg4, (float) arg5) / local31);
		if ((float) local81 < this.aFloat133 && (float) local99 < this.aFloat133 || this.aFloat132 < (float) local81 && this.aFloat132 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt6529 * this.aClass255_Sub3_16.method8037((float) arg2, (float) arg1, (float) arg0) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt6529 * this.aClass255_Sub3_16.method8037((float) arg5, (float) arg4, (float) arg3) / local31);
			return (!((float) local143 < this.aFloat135) || !((float) local161 < this.aFloat135)) && (!((float) local143 > this.aFloat129) || !((float) local161 > this.aFloat129));
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(Z)F")
	protected abstract float method5367();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
	protected abstract void method5368(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)I")
	@Override
	public final int method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "()Z")
	@Override
	public final boolean method5333() {
		return this.aClass19Array3[3].method7883();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[BIILclient!pw;I)Lclient!aq;")
	public abstract Interface1 method5369(@OriginalArg(1) byte[] arg0, @OriginalArg(4) Class261 arg1);

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "(I)[F")
	public final float[] method5370() {
		return this.aFloatArray54;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)V")
	protected abstract void method5371();

	@OriginalMember(owner = "client!fc", name = "ka", descriptor = "(FF)V")
	@Override
	public final void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat137 && this.aFloat134 == arg1) {
			return;
		}
		this.aFloat134 = arg1;
		this.aFloat137 = arg0;
		this.method5378();
		this.method5384();
		this.method5390();
		this.method5357();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method5299() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public final void method5351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class93 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)V")
	public final void method5372(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method5430(Static490.aClass120_5, Static490.aClass120_5);
		} else if (arg0 == 0) {
			this.method5430(Static65.aClass120_1, Static65.aClass120_1);
		} else if (arg0 == 2) {
			this.method5430(Static490.aClass120_5, Static162.aClass120_2);
		} else if (arg0 == 3) {
			this.method5430(Static65.aClass120_1, Static220.aClass120_4);
		} else if (arg0 == 4) {
			this.method5430(Static189.aClass120_3, Static189.aClass120_3);
			return;
		}
	}

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "(I)Lclient!tda;")
	public final Interface18 method5373() {
		return this.aClass108_Sub2_3 == null ? null : this.aClass108_Sub2_3.method8001();
	}

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "([I)V")
	@Override
	public final void A(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6520;
		arg0[2] = this.anInt6524;
		arg0[3] = this.anInt6553;
		arg0[0] = this.anInt6552;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method5347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		@Pc(29) float local29 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local9 * local9)));
		@Pc(33) float local33 = local9 * local29;
		@Pc(37) float local37 = local16 * local29;
		if (!this.method5407(0.0F, (float) arg1, 0.0F, (float) arg3 + local37, local33 + (float) arg2, (float) arg0)) {
			return;
		}
		this.method5362();
		this.method5487(arg4);
		this.method5444(0, Static531.aClass85_5);
		this.method5488(Static531.aClass85_5, 0);
		this.method5460(arg5);
		this.method5477();
		this.method5393(false);
		this.method5392();
		this.method5393(true);
		this.method5488(Static159.aClass85_1, 0);
		this.method5444(0, Static159.aClass85_1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!pw;Lclient!lj;)Z")
	public abstract boolean method5374(@OriginalArg(1) Class261 arg0, @OriginalArg(2) Class200 arg1);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!bm;IIIILclient!ui;)V")
	public abstract void method5375(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface20 arg5);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!cu;I)V")
	public abstract void method5376(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1);

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(B)Lclient!vc;")
	public final Class255_Sub3 method5377() {
		if (!this.aBoolean551) {
			this.aClass255_Sub3_20.method8022(this.aClass255_Sub3_18, this.aClass255_Sub3_15);
			this.aBoolean551 = true;
		}
		return this.aClass255_Sub3_20;
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(B)V")
	private void method5378() {
		this.aFloat127 = (float) this.anInt6542 - this.aFloat134;
	}

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "(I)V")
	protected abstract void method5379();

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "(B)V")
	protected abstract void method5380();

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "(I)V")
	protected abstract void method5381();

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "(IIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6536 = arg1;
		this.anInt6545 = arg2;
		this.anInt6529 = arg3;
		this.anInt6543 = arg0;
		this.method5390();
		this.method5357();
		this.method5462();
		this.method5491();
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "()Z")
	@Override
	public final boolean method5280() {
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "()F")
	public final float method5382() {
		return this.aFloat134;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!fca;IIII)Lclient!ba;")
	@Override
	public final Class21 method5352(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class21_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZ)Lclient!cu;")
	public abstract Interface2 method5383(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "(B)V")
	private void method5384() {
		if (this.aFloat134 == 0.0F) {
			this.aFloatArray50[14] = this.aFloat136;
			this.aFloatArray50[10] = this.bf;
		} else {
			@Pc(13) float local13 = this.aFloat137 / (this.aFloat134 + this.aFloat137);
			@Pc(17) float local17 = local13 * local13;
			@Pc(33) float local33 = (1.0F - local13) * -this.aFloat136 * (1.0F - local13) / this.aFloat134;
			this.aFloatArray50[14] = local17 * this.aFloat136;
			this.aFloatArray50[10] = this.bf + local33;
		}
		this.aFloat138 = (this.aFloatArray50[14] - (float) this.anInt6542) / this.aFloatArray50[10];
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([IIIIZ)Lclient!qaa;")
	public final Interface14 method5385(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		return this.method5471(arg2, arg0, 0, 0, arg3, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[Lclient!pn;)V")
	@Override
	public final void method5353(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass3_Sub28Array5[local3] = arg1[local3];
		}
		this.anInt6522 = arg0;
		if (this.aClass82_5.method2320()) {
			this.method5441();
		}
	}

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "(B)V")
	protected void method5386() {
		this.method5447();
	}

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "(B)V")
	protected abstract void method5387();

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "(B)V")
	protected abstract void method5388();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!ol;)V")
	public abstract void method5389(@OriginalArg(1) Class245 arg0);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public final Class37 method5290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class37_Sub1 local11 = new Class37_Sub1(this, arg2, arg3, arg4);
		local11.GA(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5348(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas12) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method5368(arg0, this.aHashtable5.get(arg0));
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "ca", descriptor = "(IIII)V")
	@Override
	public final void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt6395 - 1 && arg1 <= 0 && this.anInt6436 - 1 <= arg3) {
			this.F();
			return;
		}
		this.anInt6520 = arg1 >= 0 ? arg1 : 0;
		this.anInt6553 = arg3 > this.anInt6395 ? 0 : arg3;
		this.anInt6552 = arg0 < 0 ? 0 : arg0;
		this.anInt6524 = this.anInt6395 >= arg2 ? arg2 : 0;
		if (!this.aBoolean563) {
			this.aBoolean563 = true;
			this.method5394();
		}
		this.method5449();
		this.method5491();
	}

	@OriginalMember(owner = "client!fc", name = "X", descriptor = "(III)V")
	@Override
	public final void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt6548 && this.anInt6550 == arg1 && this.anInt6534 == arg2) {
			return;
		}
		this.anInt6548 = arg0;
		this.anInt6534 = arg2;
		this.anInt6550 = arg1;
		if (!this.aBoolean547) {
			this.method5356();
			this.method5358();
		}
	}

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "(B)V")
	private void method5390() {
		this.aBoolean559 = false;
		if (Static330.aClass82_6 == this.aClass82_5) {
			this.method5481();
			this.method5395();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!hj;)V")
	public abstract void method5391(@OriginalArg(1) Class142 arg0);

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	@Override
	public final void method5304(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "()I")
	@Override
	public final int v() {
		return this.anInt6516 + this.anInt6517 + this.anInt6515;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(Z)V")
	private void method5392() {
		this.method5376(0, this.anInterface2_8);
		this.method5391(this.aClass142_13);
		this.method5420(0, 1, Static300.aClass32_10);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BZ)V")
	public abstract void method5393(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class93_Sub3 local6 = (Class93_Sub3) arg1;
		@Pc(9) Interface14 local9 = local6.anInterface14_4;
		this.method5483();
		this.method5414(local9);
		this.method5460(1);
		this.method5430(Static490.aClass120_5, Static490.aClass120_5);
		this.method5444(0, Static531.aClass85_5);
		this.method5487(arg0);
		this.aClass255_Sub3_15.method8042(0.0F, (float) this.anInt6436, (float) this.anInt6395);
		this.method5445();
		this.aClass255_Sub3Array3[0].method8042(1.0F, local9.method8242((float) this.anInt6436), local9.method8239((float) this.anInt6395));
		this.aClass255_Sub3Array3[0].method8029(local9.method8242((float) -arg3), 0.0F, local9.method8239((float) -arg2));
		this.aClass359Array3[0] = Static317.aClass359_13;
		this.method5427();
		this.method5466();
		this.method5442();
		this.method5444(0, Static159.aClass85_1);
	}

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "(I)V")
	protected abstract void method5394();

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "(I)V")
	private void method5395() {
		this.method5406();
		if (this.aClass19_3 != null) {
			this.aClass19_3.method7893();
		}
	}

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "(B)V")
	protected abstract void method5396();

	@OriginalMember(owner = "client!fc", name = "AA", descriptor = "(IIII)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6521 = arg1;
		this.anInt6547 = arg0;
		this.anInt6537 = arg3;
		this.aBoolean547 = true;
		this.anInt6544 = arg2;
		this.method5450(false, 0, 3, 0, false);
		if (this.aClass19_3 != null) {
			this.aClass19_3.method7884();
		}
		this.method5356();
		this.method5358();
	}

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "(B)V")
	public final void method5397() {
		if (this.anInt6541 == 16) {
			return;
		}
		this.method5435();
		this.method5476(true);
		this.method5470(true);
		this.method5399(true);
		this.method5460(1);
		this.anInt6541 = 16;
	}

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "(B)V")
	protected abstract void method5398();

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(ZZ)V")
	public final void method5399(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean556) {
			this.aBoolean556 = arg0;
			this.method5387();
			this.anInt6541 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "(I)V")
	protected abstract void method5400();

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "(I)V")
	protected abstract void method5401();

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "(I)V")
	protected abstract void method5402();

	@OriginalMember(owner = "client!fc", name = "JA", descriptor = "(I)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0) {
		this.anInt6526 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt6526++;
		}
		this.anInt6519 = 0x1 << this.anInt6526;
	}

	@OriginalMember(owner = "client!fc", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt6531 != arg0;
		if (local11 || arg1 != this.aFloat139 || arg2 != this.aFloat140) {
			this.aFloat139 = arg1;
			this.aFloat140 = arg2;
			this.anInt6531 = arg0;
			if (local11) {
				this.aFloat143 = (float) (this.anInt6531 & 0xFF00) / 65280.0F;
				this.aFloat142 = (float) (this.anInt6531 & 0xFF) / 255.0F;
				this.aFloat131 = (float) (this.anInt6531 & 0xFF0000) / 1.671168E7F;
				this.method5401();
			}
			this.aNativeInterface3.setSunColour(this.aFloat131, this.aFloat143, this.aFloat142, arg1, arg2);
			this.method5405();
		}
		if (this.aFloatArray55[0] != arg3 || this.aFloatArray55[1] != arg4 || this.aFloatArray55[2] != arg5) {
			this.aFloatArray55[2] = arg5;
			this.aFloatArray55[1] = arg4;
			this.aFloatArray55[0] = arg3;
			this.aFloatArray52[2] = -arg5;
			this.aFloatArray52[0] = -arg3;
			this.aFloatArray52[1] = -arg4;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray56[1] = local149 * arg4;
			this.aFloatArray56[2] = arg5 * local149;
			this.aFloatArray56[0] = local149 * arg3;
			this.aFloatArray48[2] = -this.aFloatArray56[2];
			this.aFloatArray48[1] = -this.aFloatArray56[1];
			this.aFloatArray48[0] = -this.aFloatArray56[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray56[0], this.aFloatArray56[1], this.aFloatArray56[2]);
			this.method5365();
			this.anInt6527 = (int) (arg5 * 256.0F / arg4);
			this.anInt6525 = (int) (arg3 * 256.0F / arg4);
		}
		this.method5446();
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method5367();
		this.method5362();
		this.method5487(arg4);
		this.method5444(0, Static531.aClass85_5);
		this.method5488(Static531.aClass85_5, 0);
		this.method5460(arg5);
		this.aClass255_Sub3_15.method8042(1.0F, (float) (arg3 - 1), (float) (arg2 - 1));
		this.aClass255_Sub3_15.method8029((float) arg1 - local7, 0.0F, (float) arg0 - local7);
		this.method5445();
		this.method5393(false);
		this.method5364(4, Static358.aClass32_9);
		this.method5393(true);
		this.method5488(Static159.aClass85_1, 0);
		this.method5444(0, Static159.aClass85_1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZB)V")
	public final void method5403(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean545 != arg0) {
			this.aBoolean545 = arg0;
			this.method5459();
			this.anInt6541 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLclient!ej;ZII)V")
	public abstract void method5404(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class85 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(Z)V")
	protected abstract void method5405();

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(Z)V")
	protected abstract void method5406();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(FFFFFFI)Z")
	private boolean method5407(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(14) Buffer local14 = this.anInterface2_8.method6243();
		if (local14 == null) {
			return false;
		}
		@Pc(23) Stream local23 = this.method5409(local14);
		if (Stream.b()) {
			local23.b(arg5);
			local23.b(arg1);
			local23.b(arg2);
			local23.b(arg4);
			local23.b(arg3);
			local23.b(arg0);
		} else {
			local23.a(arg5);
			local23.a(arg1);
			local23.a(arg2);
			local23.a(arg4);
			local23.a(arg3);
			local23.a(arg0);
		}
		local23.a();
		return this.anInterface2_8.method6241();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
	@Override
	public final int method5315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method5291(@OriginalArg(0) Class255 arg0) {
		this.aClass255_Sub3_16 = (Class255_Sub3) arg0;
		this.aClass255_Sub3_18.la(this.aClass255_Sub3_16);
		this.aClass255_Sub3_18.method8040();
		this.aClass255_Sub3_19.method8034(this.aClass255_Sub3_18);
		this.aClass255_Sub3_17.method8034(this.aClass255_Sub3_16);
		if (this.aClass82_5.method2320()) {
			this.method5360();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;I)Lclient!jaclib/memory/Stream;")
	public final Stream method5409(@OriginalArg(0) Buffer arg0) {
		this.aStream5.a(arg0);
		return this.aStream5;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(BI)V")
	public final void method5410(@OriginalArg(1) int arg0) {
		if (this.anInt6523 != arg0) {
			this.anInt6523 = arg0;
			this.method5468();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!vc;)V")
	public final void method5411(@OriginalArg(1) Class255_Sub3 arg0) {
		this.aClass255_Sub3_15.la(arg0);
		this.aBoolean543 = false;
		this.method5417();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method5412(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "(I)I")
	public final int method5413() {
		return this.anInt6547;
	}

	@OriginalMember(owner = "client!fc", name = "aa", descriptor = "()I")
	@Override
	public final int aa() {
		return this.anInt6558;
	}

	@OriginalMember(owner = "client!fc", name = "LA", descriptor = "(IIII)V")
	@Override
	public final void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean547) {
			throw new RuntimeException("");
		}
		if (this.anInt6547 != arg0) {
			this.anInt6547 = arg0;
			if (this.aClass19_3 != null) {
				this.aClass19_3.method7884();
			}
		}
		this.anInt6544 = arg2;
		this.anInt6537 = arg3;
		this.anInt6521 = arg1;
		this.method5356();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!qu;)V")
	@Override
	public final void method5277(@OriginalArg(0) Class274 arg0) {
		this.aClass356_3.method8321(this, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLclient!nm;)V")
	public final void method5414(@OriginalArg(1) Interface13 arg0) {
		if (arg0 == this.anInterface13Array3[this.anInt6523]) {
			return;
		}
		this.anInterface13Array3[this.anInt6523] = arg0;
		if (arg0 == null) {
			this.method5473();
		} else {
			arg0.method8223();
		}
		this.anInt6541 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "(I)Lclient!vc;")
	public final Class255_Sub3 method5415() {
		return this.aClass255_Sub3_19;
	}

	@OriginalMember(owner = "client!fc", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt6556;
	}

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "(B)V")
	protected final void method5416() {
		@Pc(7) Hashtable local7 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(18) Enumeration local18 = this.aHashtable5.keys();
			while (local18.hasMoreElements()) {
				@Pc(23) Canvas local23 = (Canvas) local18.nextElement();
				local7.put(local23, this.method5412(local23));
			}
		}
		this.aHashtable5 = local7;
		this.method5419();
		this.method5429();
		this.aClass356_3.method8320(this);
	}

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "(I)V")
	private void method5417() {
		if (Static123.aClass82_1 == this.aClass82_5) {
			@Pc(7) float local7 = this.method5367();
			this.aClass255_Sub3_15.method8029(local7, 0.0F, local7);
		}
		this.aBoolean551 = false;
		this.method5396();
		if (this.aClass19_3 != null) {
			this.aClass19_3.method7882();
		}
	}

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "(B)V")
	public final void method5418() {
		this.aClass120Array6 = new Class120[this.anInt6518];
		this.anInterface13Array3 = new Interface13[this.anInt6518];
		this.aClass359Array3 = new Class359[this.anInt6518];
		this.aClass255_Sub3Array3 = new Class255_Sub3[this.anInt6518];
		this.aClass120Array5 = new Class120[this.anInt6518];
		for (@Pc(30) int local30 = 0; local30 < this.anInt6518; local30++) {
			this.aClass120Array6[local30] = Static65.aClass120_1;
			this.aClass120Array5[local30] = Static65.aClass120_1;
			this.aClass359Array3[local30] = Static21.aClass359_1;
			this.aClass255_Sub3Array3[local30] = new Class255_Sub3();
		}
		this.aClass3_Sub28Array5 = new Class3_Sub28[this.anInt6538 - 2];
		this.anInterface13_3 = this.method5472(1, 1, Static302.aClass200_11, Static492.aClass261_14);
		this.method5293(new Class3_Sub19_Sub2(262144));
		this.aClass142_16 = this.method5421(new Class78[] { new Class78(new Class164[] { Static231.aClass164_1, Static231.aClass164_5 }) });
		this.aClass142_15 = this.method5421(new Class78[] { new Class78(new Class164[] { Static231.aClass164_1, Static231.aClass164_3 }) });
		this.aClass142_18 = this.method5421(new Class78[] { new Class78(Static231.aClass164_1), new Class78(Static231.aClass164_3), new Class78(Static231.aClass164_5), new Class78(Static231.aClass164_2) });
		this.aClass142_17 = this.method5421(new Class78[] { new Class78(Static231.aClass164_1), new Class78(Static231.aClass164_3), new Class78(Static231.aClass164_5) });
		this.aClass21_Sub2_23 = new Class21_Sub2(this, 0, 0, false, false);
		this.aClass21_Sub2_22 = new Class21_Sub2(this, 0, 0, true, true);
		this.aClass21_Sub2_29 = new Class21_Sub2(this, 0, 0, false, false);
		this.aClass21_Sub2_21 = new Class21_Sub2(this, 0, 0, true, true);
		this.aClass21_Sub2_30 = new Class21_Sub2(this, 0, 0, false, false);
		this.aClass21_Sub2_28 = new Class21_Sub2(this, 0, 0, true, true);
		this.aClass21_Sub2_24 = new Class21_Sub2(this, 0, 0, false, false);
		this.aClass21_Sub2_25 = new Class21_Sub2(this, 0, 0, true, true);
		this.aClass21_Sub2_26 = new Class21_Sub2(this, 0, 0, false, false);
		this.aClass21_Sub2_27 = new Class21_Sub2(this, 0, 0, true, true);
		this.aClass356_3 = new Class356(this);
		this.anInterface20_5 = this.method5489(true);
		this.method5416();
		this.aClass31_5 = new Class31(this);
		this.aClass19Array3[1] = this.method5451(1);
		this.aClass19Array3[2] = this.method5451(2);
		this.aClass19Array3[4] = this.method5451(4);
		this.aClass19Array3[5] = this.method5451(5);
		this.aClass19Array3[6] = this.method5451(6);
		this.aClass19Array3[7] = this.method5451(7);
		this.aClass19Array3[3] = this.method5451(3);
		this.aClass19Array3[8] = this.method5451(8);
		this.aClass19Array3[9] = this.method5451(9);
		if (!this.aClass19Array3[2].method7883()) {
			this.aClass19Array3[2] = this.method5451(0);
		}
		if (!this.aClass19Array3[4].method7883()) {
			this.aClass19Array3[4] = this.aClass19Array3[2];
		}
		if (!this.aClass19Array3[8].method7883()) {
			this.aClass19Array3[8] = this.aClass19Array3[4];
		}
		if (!this.aClass19Array3[9].method7883()) {
			this.aClass19Array3[9] = this.aClass19Array3[8];
		}
		this.method5386();
		this.F();
	}

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "(B)V")
	private void method5419() {
		this.anInterface2_7 = this.method5383(false);
		this.anInterface2_7.method5805(28, 140);
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			@Pc(31) Buffer local31 = this.anInterface2_7.method6243();
			if (local31 != null) {
				@Pc(38) Stream local38 = this.method5409(local31);
				if (Stream.b()) {
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(1.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(1.0F);
					local38.b(0.0F);
					local38.b(1.0F);
					local38.b(1.0F);
					local38.b(1.0F);
					local38.b(0.0F);
					local38.b(1.0F);
					local38.b(1.0F);
					local38.b(1.0F);
					local38.b(1.0F);
					local38.b(1.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(1.0F);
					local38.b(0.0F);
					local38.b(1.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(0.0F);
					local38.b(0.0F);
				} else {
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(1.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(1.0F);
					local38.a(0.0F);
					local38.a(1.0F);
					local38.a(1.0F);
					local38.a(1.0F);
					local38.a(0.0F);
					local38.a(1.0F);
					local38.a(1.0F);
					local38.a(1.0F);
					local38.a(1.0F);
					local38.a(1.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(1.0F);
					local38.a(0.0F);
					local38.a(1.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(0.0F);
					local38.a(0.0F);
				}
				local38.a();
				if (this.anInterface2_7.method6241()) {
					break;
				}
			}
		}
		this.aClass142_14 = this.method5421(new Class78[] { new Class78(new Class164[] { Static231.aClass164_1, Static231.aClass164_5, Static231.aClass164_5 }) });
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILclient!bm;)V")
	public abstract void method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class32 arg2);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B[Lclient!ed;)Lclient!hj;")
	public abstract Class142 method5421(@OriginalArg(1) Class78[] arg0);

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "()Lclient!q;")
	@Override
	public final Class255 method5294() {
		return new Class255_Sub3();
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
	@Override
	public final void method5317(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZB)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method5423(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap5.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "na", descriptor = "(III[I)V")
	@Override
	public final void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass255_Sub3_16.method8030((float) arg2, (float) arg0, (float) arg1);
		if ((float) this.anInt6556 > local14 || (float) this.anInt6542 < local14) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(57) int local57 = (int) ((float) this.anInt6545 * this.aClass255_Sub3_16.method8036((float) arg0, (float) arg1, (float) arg2) / local14);
		@Pc(75) int local75 = (int) ((float) this.anInt6529 * this.aClass255_Sub3_16.method8037((float) arg2, (float) arg1, (float) arg0) / local14);
		if ((float) local57 >= this.aFloat133 && this.aFloat132 >= (float) local57 && this.aFloat135 <= (float) local75 && this.aFloat129 >= (float) local75) {
			arg3[2] = (int) local14;
			arg3[1] = (int) ((float) local75 - this.aFloat135);
			arg3[0] = (int) ((float) local57 - this.aFloat133);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
	public final void method5424(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean562) {
			this.aBoolean562 = arg0;
			this.method5358();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)V")
	public final void method5425(@OriginalArg(1) byte arg0) {
		this.method5487(arg0 << 8 | arg0 << 24 | arg0 << 16 | arg0);
	}

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "(I)V")
	protected final void method5426() {
		@Pc(9) Enumeration local9 = this.aHashtable5.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method5368(local15, this.aHashtable5.get(local15));
		}
		this.anInterface2_7.method6239();
		this.anInterface2_8.method6239();
		this.aClass21_Sub2_22.method4655();
		this.aClass21_Sub2_21.method4655();
		this.aClass21_Sub2_28.method4655();
		this.aClass21_Sub2_25.method4655();
		this.aClass21_Sub2_27.method4655();
		this.aClass356_3.method8324();
		this.anInterface20_5.method6239();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ht;I)V")
	@Override
	public final void method5310(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class55_Sub3[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method7145(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "(B)V")
	private void method5427() {
		this.method5437();
		if (this.aClass19_3 != null) {
			this.aClass19_3.method7891();
		}
	}

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "(B)Lclient!vc;")
	public final Class255_Sub3 method5428() {
		return this.aClass255_Sub3_18;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!sga;[Lclient!aw;Z)Lclient!ta;")
	@Override
	public final Class111 method5346(@OriginalArg(0) Class297 arg0, @OriginalArg(1) Class20[] arg1) {
		return new Class111_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt6552 < arg0) {
			this.anInt6552 = arg0;
			local5 = true;
		}
		if (arg2 < this.anInt6524) {
			this.anInt6524 = arg2;
			local5 = true;
		}
		if (arg1 > this.anInt6520) {
			local5 = true;
			this.anInt6520 = arg1;
		}
		if (arg3 < this.anInt6553) {
			this.anInt6553 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean563) {
			this.aBoolean563 = true;
			this.method5394();
		}
		this.method5449();
		this.method5491();
	}

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "()Z")
	@Override
	public final boolean method5301() {
		return this.aBoolean550;
	}

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "(IIIII)V")
	@Override
	protected final void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!aw;Z)Lclient!xa;")
	@Override
	public final Class37 method5275(@OriginalArg(0) Class20 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(128) Class37 local128;
		if (arg0.anInt707 == 0 || arg0.anInt706 == 0) {
			local128 = this.method5324(new int[1], 1, 1, 1);
		} else {
			@Pc(21) int[] local21 = new int[arg0.anInt706 * arg0.anInt707];
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg0.aByteArray6 == null) {
				for (local30 = 0; local30 < arg0.anInt706; local30++) {
					for (local34 = 0; local34 < arg0.anInt707; local34++) {
						@Pc(88) int local88 = arg0.anIntArray22[arg0.aByteArray5[local23++] & 0xFF];
						local21[local25++] = local88 == 0 ? 0 : local88 | 0xFF000000;
					}
				}
			} else {
				for (local30 = 0; local30 < arg0.anInt706; local30++) {
					for (local34 = 0; local34 < arg0.anInt707; local34++) {
						local21[local25++] = arg0.aByteArray6[local23] << 24 | arg0.anIntArray22[arg0.aByteArray5[local23] & 0xFF];
						local23++;
					}
				}
			}
			local128 = this.method5324(local21, arg0.anInt707, arg0.anInt707, arg0.anInt706);
		}
		local128.EA(arg0.anInt705, arg0.anInt708, arg0.anInt704, arg0.anInt709);
		return local128;
	}

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "(B)V")
	private void method5429() {
		this.anInterface2_8 = this.method5383(true);
		this.anInterface2_8.method5805(12, 24);
		this.aClass142_13 = this.method5421(new Class78[] { new Class78(Static231.aClass164_1) });
	}

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "()V")
	@Override
	public final void method5349() {
		this.aClass172_3.method4478();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!gga;ZLclient!gga;)V")
	public final void method5430(@OriginalArg(0) Class120 arg0, @OriginalArg(2) Class120 arg1) {
		@Pc(11) boolean local11 = false;
		if (this.aClass120Array5[this.anInt6523] != arg1) {
			this.aClass120Array5[this.anInt6523] = arg1;
			local11 = true;
			this.method5453();
		}
		if (arg0 != this.aClass120Array6[this.anInt6523]) {
			this.aClass120Array6[this.anInt6523] = arg0;
			local11 = true;
			this.method5402();
		}
		if (local11) {
			this.anInt6541 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "(I)Lclient!vc;")
	public final Class255_Sub3 method5431() {
		return this.aClass255_Sub3_15;
	}

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "(Z)V")
	private void method5432() {
		this.aBoolean554 = false;
		if (Static123.aClass82_1 == this.aClass82_5) {
			this.method5457();
			this.method5395();
		}
	}

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "(I)V")
	public final void method5433() {
		if (this.anInt6541 == 4) {
			return;
		}
		this.method5475();
		this.method5476(false);
		this.method5403(false);
		this.method5470(false);
		this.method5399(false);
		this.method5359(false, false, -2);
		this.method5460(1);
		this.method5372(0);
		this.anInt6541 = 4;
	}

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "(I)V")
	public final void method5434() {
		this.method5462();
		this.method5395();
	}

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "(I)V")
	private void method5435() {
		if (this.aClass82_5 == Static330.aClass82_6) {
			return;
		}
		@Pc(17) Class82 local17 = this.aClass82_5;
		this.aClass82_5 = Static330.aClass82_6;
		if (!local17.method2320()) {
			this.method5360();
		}
		this.method5481();
		this.aFloatArray51 = this.aFloatArray49;
		this.method5395();
		this.anInt6541 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "(I)V")
	private void method5436() {
		if (this.aBoolean561) {
			return;
		}
		@Pc(11) float[] local11 = this.aFloatArray50;
		@Pc(23) float local23 = (float) (this.anInt6556 * -this.anInt6543) / (float) this.anInt6545;
		@Pc(38) float local38 = (float) (this.anInt6556 * (this.anInt6395 - this.anInt6543)) / (float) this.anInt6545;
		@Pc(49) float local49 = (float) (this.anInt6536 * this.anInt6556) / (float) this.anInt6529;
		@Pc(64) float local64 = (float) (this.anInt6556 * (this.anInt6536 - this.anInt6436)) / (float) this.anInt6529;
		if (local38 == local23 || local49 == local64) {
			local11[15] = 1.0F;
			local11[0] = 1.0F;
			local11[12] = 0.0F;
			local11[5] = 1.0F;
			local11[4] = 0.0F;
			local11[8] = 0.0F;
			local11[14] = 0.0F;
			local11[6] = 0.0F;
			local11[11] = 0.0F;
			local11[1] = 0.0F;
			local11[3] = 0.0F;
			local11[10] = 1.0F;
			local11[13] = 0.0F;
			local11[2] = 0.0F;
			local11[9] = 0.0F;
			local11[7] = 0.0F;
		} else {
			@Pc(78) float local78 = (float) this.anInt6556 * 2.0F;
			local11[4] = 0.0F;
			local11[1] = 0.0F;
			local11[6] = 0.0F;
			local11[0] = local78 / (local38 - local23);
			local11[8] = (local23 + local38) / (-local23 + local38);
			local11[3] = 0.0F;
			local11[10] = this.bf = (float) this.anInt6542 / (float) (this.anInt6556 - this.anInt6542);
			local11[5] = local78 / (local49 - local64);
			local11[12] = 0.0F;
			local11[11] = -1.0F;
			local11[7] = 0.0F;
			local11[13] = 0.0F;
			local11[15] = 0.0F;
			local11[2] = 0.0F;
			local11[9] = (local49 + local64) / (local49 - local64);
			local11[14] = this.aFloat136 = (float) (this.anInt6556 * this.anInt6542) / (float) (this.anInt6556 - this.anInt6542);
		}
		this.method5384();
		this.aBoolean561 = true;
	}

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "(I)V")
	protected abstract void method5437();

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "()F")
	public final float method5438() {
		return this.aFloat137;
	}

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "(I)V")
	private void method5439() {
		if (this.aCanvas11 == null) {
			this.anInt6450 = this.anInt6416 = 1;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas11.getSize();
			this.anInt6450 = local18.width;
			this.anInt6416 = local18.height;
		}
		this.anInt6395 = this.anInt6450;
		this.anInt6436 = this.anInt6416;
		this.method5432();
		this.method5357();
		this.method5390();
		this.method5381();
		this.method5491();
		this.method5462();
		this.F();
	}

	@OriginalMember(owner = "client!fc", name = "IA", descriptor = "()I")
	@Override
	public final int IA() {
		return this.anInt6542;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIZ[BLclient!pw;)Lclient!qaa;")
	protected abstract Interface14 method5440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) boolean arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) Class261 arg4);

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
	@Override
	public void method5318(@OriginalArg(0) int arg0) {
		this.aClass172_3.method4473();
		this.anInt6528 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "(I)V")
	protected void method5441() {
		this.anInt6551 = this.anInt6522;
		this.anInt6522 = 0;
	}

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "()Z")
	@Override
	public final boolean method5289() {
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "(I)V")
	public final void method5442() {
		if (this.aClass359Array3[this.anInt6523] != Static21.aClass359_1) {
			this.aClass359Array3[this.anInt6523] = Static21.aClass359_1;
			this.aClass255_Sub3Array3[this.anInt6523].Y();
			this.method5427();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!pw;BLclient!lj;)Z")
	public abstract boolean method5443(@OriginalArg(0) Class261 arg0, @OriginalArg(2) Class200 arg1);

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "()Z")
	@Override
	public final boolean method5335() {
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public final Class37 method5324(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class37_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!ej;)V")
	public final void method5444(@OriginalArg(0) int arg0, @OriginalArg(2) Class85 arg1) {
		this.method5404(false, arg1, false, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "(I)V")
	public final void method5445() {
		this.aBoolean543 = false;
		this.method5417();
	}

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "(Z)V")
	protected abstract void method5446();

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "(Z)V")
	private void method5447() {
		this.method5401();
		this.method5405();
		this.method5459();
		this.method5441();
		this.method5365();
		this.method5446();
		this.method5379();
		this.method5380();
		this.method5387();
		this.method5358();
		this.method5454();
		this.method5400();
		this.method5388();
		this.method5398();
		for (@Pc(50) int local50 = this.anInt6518 - 1; local50 >= 0; local50--) {
			this.method5410(local50);
			this.method5453();
			this.method5402();
			this.method5442();
		}
		this.method5371();
		this.method5381();
		this.method5406();
		this.method5396();
		this.method5361();
	}

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "()Z")
	@Override
	public final boolean method5327() {
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	@Override
	public final void method5296(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt6539 = arg0;
		this.aClass172_3.method4478();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ[FILclient!pw;I)Lclient!qaa;")
	public final Interface14 method5448(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class261 arg4) {
		return this.method5479(arg3, arg1, arg2, arg4, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "(I)V")
	protected abstract void method5449();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZIIIZI)V")
	private void method5450(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) boolean local4 = arg4 & this.method5333();
		if (!local4 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			arg2 = 2;
			arg3 = 1;
			arg1 = 0;
		}
		if (arg2 != 0 && arg0) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt6533) {
			if (this.anInt6533 != 0) {
				this.aClass19Array3[this.anInt6533 & Integer.MAX_VALUE].method7890();
			}
			if (arg2 == 0) {
				this.aClass19_3 = null;
			} else {
				this.aClass19_3 = this.aClass19Array3[Integer.MAX_VALUE & arg2];
				this.aClass19_3.method7892(arg0);
				this.aClass19_3.method7894(arg0);
				this.aClass19_3.method7889(arg1, arg3);
			}
			this.anInt6532 = arg1;
			this.anInt6533 = arg2;
			this.anInt6557 = arg3;
		} else if (this.anInt6533 != 0) {
			this.aClass19Array3[Integer.MAX_VALUE & this.anInt6533].method7894(arg0);
			if (arg1 != this.anInt6532 || this.anInt6557 != arg3) {
				this.aClass19Array3[Integer.MAX_VALUE & this.anInt6533].method7889(arg1, arg3);
				this.anInt6557 = arg3;
				this.anInt6532 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)Lclient!wh;")
	protected Class19 method5451(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class19_Sub5(this);
		} else if (arg0 == 1) {
			return new Class19_Sub8(this);
		} else if (arg0 == 2) {
			return new Class19_Sub4(this, this.aClass31_5);
		} else if (arg0 == 7) {
			return new Class19_Sub9(this);
		} else {
			return new Class19_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(ZI)V")
	public final void method5452(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean557 != arg0) {
			this.aBoolean557 = arg0;
			this.method5379();
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(IIIIII)Lclient!kn;")
	@Override
	public final Class108 method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class108_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
	@Override
	public final void method5340(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "()Z")
	@Override
	public final boolean method5332() {
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "()Z")
	@Override
	public final boolean method5284() {
		return false;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5347(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "(I)V")
	protected abstract void method5453();

	@OriginalMember(owner = "client!fc", name = "ha", descriptor = "(F)V")
	@Override
	public final void ha(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat126) {
			this.aFloat126 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method5401();
			this.method5446();
		}
	}

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "(Z)V")
	protected abstract void method5454();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method5455(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([FI)[F")
	public final float[] method5456(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray51[0];
		arg0[8] = this.aFloatArray51[2];
		arg0[4] = this.aFloatArray51[1];
		arg0[12] = this.aFloatArray51[3];
		arg0[2] = this.aFloatArray51[8];
		arg0[1] = this.aFloatArray51[4];
		arg0[9] = this.aFloatArray51[6];
		arg0[5] = this.aFloatArray51[5];
		arg0[13] = this.aFloatArray51[7];
		arg0[14] = this.aFloatArray51[11];
		arg0[10] = this.aFloatArray51[10];
		arg0[3] = this.aFloatArray51[12];
		arg0[7] = this.aFloatArray51[13];
		arg0[6] = this.aFloatArray51[9];
		arg0[15] = this.aFloatArray51[15];
		arg0[11] = this.aFloatArray51[14];
		return arg0;
	}

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "(I)V")
	private void method5457() {
		if (this.aBoolean554) {
			return;
		}
		@Pc(8) float[] local8 = this.aFloatArray53;
		if (this.anInt6395 == 0 || this.anInt6436 == 0) {
			local8[4] = 0.0F;
			local8[6] = 0.0F;
			local8[5] = 1.0F;
			local8[10] = 1.0F;
			local8[9] = 0.0F;
			local8[0] = 1.0F;
			local8[15] = 1.0F;
			local8[3] = 0.0F;
			local8[11] = 0.0F;
			local8[2] = 0.0F;
			local8[7] = 0.0F;
			local8[13] = 0.0F;
			local8[1] = 0.0F;
			local8[12] = 0.0F;
			local8[8] = 0.0F;
			local8[14] = 0.0F;
		} else {
			local8[5] = -2.0F / (float) this.anInt6436;
			local8[9] = 0.0F;
			local8[7] = 0.0F;
			local8[0] = 2.0F / (float) this.anInt6395;
			local8[14] = 0.5F;
			local8[15] = 1.0F;
			local8[8] = 0.0F;
			local8[3] = 0.0F;
			local8[4] = 0.0F;
			local8[12] = -1.0F;
			local8[10] = 0.5F;
			local8[6] = 0.0F;
			local8[13] = 1.0F;
			local8[11] = 0.0F;
			local8[2] = 0.0F;
			local8[1] = 0.0F;
		}
		this.aBoolean554 = true;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZILclient!ej;)V")
	protected abstract void method5458(@OriginalArg(2) int arg0, @OriginalArg(3) Class85 arg1);

	@OriginalMember(owner = "client!fc", name = "M", descriptor = "(I)V")
	protected abstract void method5459();

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)V")
	public final void method5460(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt6549) {
			return;
		}
		@Pc(25) Class112 local25;
		@Pc(21) boolean local21;
		@Pc(23) boolean local23;
		if (arg0 == 1) {
			local23 = true;
			local25 = Static116.aClass112_3;
			local21 = true;
		} else if (arg0 == 2) {
			local21 = true;
			local23 = false;
			local25 = Static172.aClass112_19;
		} else if (arg0 == 128) {
			local23 = true;
			local21 = true;
			local25 = Static558.aClass112_17;
		} else {
			local25 = Static156.aClass112_21;
			local23 = false;
			local21 = false;
		}
		if (this.aBoolean552 != local23) {
			this.aBoolean552 = local23;
			this.method5398();
		}
		if (local21 != this.aBoolean544) {
			this.aBoolean544 = local21;
			this.method5400();
		}
		if (local25 != this.aClass112_13) {
			this.aClass112_13 = local25;
			this.method5388();
		}
		this.anInt6541 &= 0xFFFFFFE3;
		this.anInt6549 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(II)V")
	public abstract void method5461(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "(I)V")
	public final void method5462() {
		if (Static204.aClass82_3 == this.aClass82_5) {
			return;
		}
		@Pc(14) Class82 local14 = this.aClass82_5;
		this.aClass82_5 = Static204.aClass82_3;
		if (local14.method2320()) {
			this.method5360();
		}
		this.anInt6541 &= 0xFFFFFFE0;
		this.aFloatArray51 = this.aFloatArray54;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public final Class93 method5307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static372.method6074(this, arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI[[IZ)Lclient!tda;")
	public abstract Interface18 method5463(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method5464(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "(B)Lclient!vc;")
	public final Class255_Sub3 method5465() {
		return this.aClass255_Sub3Array3[this.anInt6523];
	}

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "(B)V")
	public final void method5466() {
		this.method5364(2, Static34.aClass32_3);
	}

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "(I)V")
	protected abstract void method5468();

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "(I)Lclient!vc;")
	public final Class255_Sub3 method5469() {
		return this.aClass255_Sub3Array3[this.anInt6523];
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(BZ)V")
	public final void method5470(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean560) {
			this.aBoolean560 = arg0;
			this.method5380();
			this.anInt6541 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5319(@OriginalArg(0) Canvas arg0) {
		this.anObject11 = null;
		this.aCanvas11 = null;
		if (arg0 == null || arg0 == this.aCanvas12) {
			this.aCanvas11 = this.aCanvas12;
			this.anObject11 = this.anObject12;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject11 = this.aHashtable5.get(arg0);
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.anObject11 == null) {
			throw new RuntimeException();
		}
		this.method5464(this.anObject11, this.aCanvas11);
		this.method5439();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[IIIIZI)Lclient!qaa;")
	public abstract Interface14 method5471(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "()Z")
	@Override
	public final boolean method5279() {
		return false;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILclient!lj;Lclient!pw;)Lclient!qaa;")
	public abstract Interface14 method5472(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class200 arg2, @OriginalArg(4) Class261 arg3);

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "()V")
	@Override
	public final void k() {
		this.aBoolean547 = false;
		this.method5450(false, 0, 0, 0, false);
		this.method5356();
		this.method5358();
	}

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "(Z)V")
	protected abstract void method5473();

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(II)Lclient!ui;")
	public final Interface20 method5474(@OriginalArg(1) int arg0) {
		if (this.anInterface20_5.method6235() < arg0 * 2) {
			this.anInterface20_5.method6240(arg0);
		}
		return this.anInterface20_5;
	}

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "(Z)V")
	private void method5475() {
		if (Static123.aClass82_1 == this.aClass82_5) {
			return;
		}
		@Pc(10) Class82 local10 = this.aClass82_5;
		this.aClass82_5 = Static123.aClass82_1;
		if (local10.method2320()) {
			this.method5360();
		}
		this.method5457();
		this.aFloatArray51 = this.aFloatArray53;
		this.method5395();
		this.anInt6541 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(ZZ)V")
	public final void method5476(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean548 != arg0) {
			this.aBoolean548 = arg0;
			this.method5358();
			this.anInt6541 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
	@Override
	public final void method5336(@OriginalArg(0) boolean arg0) {
		this.aBoolean546 = arg0;
		this.method5387();
	}

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "(B)V")
	public final void method5477() {
		this.aClass255_Sub3_15.Y();
		this.aBoolean543 = true;
		this.method5417();
	}

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "()V")
	@Override
	protected void method5305() {
		if (this.aBoolean553) {
			return;
		}
		for (@Pc(7) Class3 local7 = this.aClass183_39.method4795(); local7 != null; local7 = this.aClass183_39.method4793()) {
			((Class3_Sub19_Sub2) local7).method7211();
		}
		@Pc(23) Enumeration local23 = this.aHashtable5.keys();
		while (local23.hasMoreElements()) {
			@Pc(28) Canvas local28 = (Canvas) local23.nextElement();
			this.method5368(local28, this.aHashtable5.get(local28));
		}
		Static455.method7048(false, true);
		this.aNativeInterface3.release();
		this.aBoolean553 = true;
	}

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "()Lclient!q;")
	@Override
	public final Class255 method5343() {
		return this.aClass255_Sub3_21;
	}

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "(I)I")
	public final int method5478() {
		return this.anInt6544;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ[FILclient!pw;II)Lclient!qaa;")
	protected abstract Interface14 method5479(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) float[] arg2, @OriginalArg(5) Class261 arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "(I)I")
	public final int method5480() {
		return this.anInt6537;
	}

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "()V")
	@Override
	public final void F() {
		this.anInt6520 = 0;
		this.anInt6552 = 0;
		this.anInt6524 = this.anInt6395;
		this.anInt6553 = this.anInt6436;
		if (this.aBoolean563) {
			this.aBoolean563 = false;
			this.method5394();
		}
		this.method5491();
	}

	@OriginalMember(owner = "client!fc", name = "ya", descriptor = "(IIIII)V")
	@Override
	public final void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5347(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "(B)V")
	private void method5481() {
		if (this.aBoolean559) {
			return;
		}
		@Pc(11) float[] local11 = this.aFloatArray49;
		@Pc(19) float local19 = (float) this.anInt6556 - this.aFloat134;
		@Pc(26) float local26 = (float) this.anInt6542 - this.aFloat134;
		@Pc(38) float local38 = this.aFloat128 * (float) -this.anInt6536 / (float) this.anInt6529;
		@Pc(50) float local50 = this.aFloat128 * (float) -this.anInt6543 / (float) this.anInt6545;
		@Pc(65) float local65 = this.aFloat128 * (float) (this.anInt6395 - this.anInt6543) / (float) this.anInt6545;
		@Pc(80) float local80 = this.aFloat128 * (float) (this.anInt6436 - this.anInt6536) / (float) this.anInt6529;
		if (local50 == local65 || local80 == local38) {
			local11[15] = 1.0F;
			local11[6] = 0.0F;
			local11[9] = 0.0F;
			local11[4] = 0.0F;
			local11[12] = 0.0F;
			local11[11] = 0.0F;
			local11[7] = 0.0F;
			local11[13] = 0.0F;
			local11[14] = 0.0F;
			local11[1] = 0.0F;
			local11[10] = 1.0F;
			local11[3] = 0.0F;
			local11[8] = 0.0F;
			local11[0] = 1.0F;
			local11[5] = 1.0F;
			local11[2] = 0.0F;
		} else {
			local11[14] = local19 / (local19 - local26);
			local11[3] = 0.0F;
			local11[13] = (local80 + local38) / (local80 - local38);
			local11[8] = 0.0F;
			local11[0] = 2.0F / (local65 - local50);
			local11[4] = 0.0F;
			local11[2] = 0.0F;
			local11[9] = 0.0F;
			local11[11] = 0.0F;
			local11[7] = 0.0F;
			local11[6] = 0.0F;
			local11[5] = 2.0F / (local80 - local38);
			local11[15] = 1.0F;
			local11[12] = (local50 + local65) / (local50 - local65);
			local11[10] = 1.0F / (local19 - local26);
			local11[1] = 0.0F;
		}
		this.method5378();
		this.aBoolean559 = true;
	}

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "(B)V")
	private void method5482() {
		if (this.aClass82_5 == Static545.aClass82_7) {
			return;
		}
		@Pc(10) Class82 local10 = this.aClass82_5;
		this.aClass82_5 = Static545.aClass82_7;
		if (!local10.method2320()) {
			this.method5360();
		}
		this.method5436();
		this.aFloatArray51 = this.aFloatArray50;
		this.method5395();
		this.anInt6541 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "()I")
	@Override
	public final int method5329() {
		return this.anInt6538 - 2;
	}

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "(I)V")
	public final void method5483() {
		if (this.anInt6541 == 2) {
			return;
		}
		this.method5475();
		this.method5476(false);
		this.method5403(false);
		this.method5470(false);
		this.method5399(false);
		this.method5359(false, false, -2);
		this.anInt6541 = 2;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public final void method5293(@OriginalArg(0) Class3_Sub19 arg0) {
		this.aNativeHeap5 = ((Class3_Sub19_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer7 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public final Class4 method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class4_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "()Z")
	@Override
	public final boolean method5292() {
		return false;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[BBZILclient!pw;)Lclient!qaa;")
	public final Interface14 method5484(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class261 arg4) {
		return this.method5440(arg3, arg0, arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!fc", name = "sa", descriptor = "(II)V")
	@Override
	public final void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt6556 && arg1 == this.anInt6542) {
			return;
		}
		this.anInt6556 = arg0;
		this.anInt6542 = arg1;
		this.method5357();
		this.method5390();
		this.method5356();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!wq;)V")
	public final void method5485(@OriginalArg(1) Class359 arg0) {
		this.aClass359Array3[this.anInt6523] = arg0;
		this.method5427();
	}

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "()Z")
	@Override
	public final boolean method5322() {
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "U", descriptor = "(I)V")
	public final void method5486() {
		if (this.anInt6541 == 8) {
			return;
		}
		this.method5482();
		this.method5476(true);
		this.method5470(true);
		this.method5399(true);
		this.method5460(1);
		this.anInt6541 = 8;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ)Lclient!xa;")
	@Override
	public final Class37 method5308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class37_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(II)V")
	public final void method5487(@OriginalArg(0) int arg0) {
		if (this.anInt6546 != arg0) {
			this.anInt6546 = arg0;
			this.method5371();
		}
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "()Z")
	@Override
	public final boolean method5288() {
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ej;I)V")
	public final void method5488(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1) {
		this.method5458(arg1, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(ZZ)Lclient!ui;")
	public abstract Interface20 method5489(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(ZI)V")
	public final void method5490(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean549) {
			this.aBoolean549 = arg0;
			this.method5459();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ba;Lclient!qu;Lclient!q;Lclient!ht;I)V")
	@Override
	public final void method5309(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Class55_Sub3 arg3, @OriginalArg(4) int arg4) {
		arg0.method7145(arg2, arg3, arg4);
		this.method5277(arg1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
	@Override
	public final void method5282(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "(Z)V")
	private void method5491() {
		this.aFloat132 = this.anInt6524 - this.anInt6543;
		this.aFloat129 = this.anInt6553 - this.anInt6536;
		this.aFloat133 = this.anInt6552 - this.anInt6543;
		this.aFloat135 = this.anInt6520 - this.anInt6536;
	}

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "()Z")
	@Override
	public final boolean method5323() {
		return true;
	}
}
