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

@OriginalClass("client!tu")
public abstract class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!tu", name = "ab", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!tu", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!tu", name = "Ic", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable4;

	@OriginalMember(owner = "client!tu", name = "pd", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!tu", name = "Dd", descriptor = "Lclient!ki;")
	protected Class164 aClass164_5;

	@OriginalMember(owner = "client!tu", name = "Nd", descriptor = "I")
	protected int anInt7741;

	@OriginalMember(owner = "client!tu", name = "Pd", descriptor = "I")
	public int anInt7743;

	@OriginalMember(owner = "client!tu", name = "Sd", descriptor = "I")
	public int anInt7745;

	@OriginalMember(owner = "client!tu", name = "ce", descriptor = "I")
	protected int anInt7749;

	@OriginalMember(owner = "client!tu", name = "fe", descriptor = "Lclient!ic;")
	private Class120 aClass120_3;

	@OriginalMember(owner = "client!tu", name = "je", descriptor = "F")
	public float aFloat217;

	@OriginalMember(owner = "client!tu", name = "qe", descriptor = "Lclient!wd;")
	private Class66_Sub2 aClass66_Sub2_3;

	@OriginalMember(owner = "client!tu", name = "re", descriptor = "[Lclient!ua;")
	protected Class289[] aClass289Array5;

	@OriginalMember(owner = "client!tu", name = "se", descriptor = "F")
	public float aFloat221;

	@OriginalMember(owner = "client!tu", name = "ue", descriptor = "[Lclient!qda;")
	protected Class243[] aClass243Array3;

	@OriginalMember(owner = "client!tu", name = "we", descriptor = "I")
	public int anInt7756;

	@OriginalMember(owner = "client!tu", name = "Be", descriptor = "Lclient!iu;")
	public Interface12 anInterface12_3;

	@OriginalMember(owner = "client!tu", name = "Ge", descriptor = "Z")
	public boolean aBoolean531;

	@OriginalMember(owner = "client!tu", name = "Ie", descriptor = "[Lclient!nh;")
	protected Class205_Sub1[] aClass205_Sub1Array3;

	@OriginalMember(owner = "client!tu", name = "Je", descriptor = "Z")
	protected boolean aBoolean532;

	@OriginalMember(owner = "client!tu", name = "Ke", descriptor = "F")
	private float aFloat224;

	@OriginalMember(owner = "client!tu", name = "Ne", descriptor = "I")
	protected int anInt7759;

	@OriginalMember(owner = "client!tu", name = "Pe", descriptor = "I")
	public int anInt7760;

	@OriginalMember(owner = "client!tu", name = "Re", descriptor = "I")
	public int anInt7762;

	@OriginalMember(owner = "client!tu", name = "Se", descriptor = "Lclient!vu;")
	private Class311 aClass311_3;

	@OriginalMember(owner = "client!tu", name = "Ue", descriptor = "I")
	protected int anInt7763;

	@OriginalMember(owner = "client!tu", name = "bf", descriptor = "F")
	public float bf;

	@OriginalMember(owner = "client!tu", name = "cf", descriptor = "F")
	private float aFloat227;

	@OriginalMember(owner = "client!tu", name = "ef", descriptor = "I")
	public int anInt7766;

	@OriginalMember(owner = "client!tu", name = "hf", descriptor = "I")
	private int anInt7768;

	@OriginalMember(owner = "client!tu", name = "tf", descriptor = "[Lclient!oj;")
	protected Class3_Sub30[] aClass3_Sub30Array6;

	@OriginalMember(owner = "client!tu", name = "uf", descriptor = "F")
	private float aFloat229;

	@OriginalMember(owner = "client!tu", name = "wf", descriptor = "Z")
	public boolean aBoolean541;

	@OriginalMember(owner = "client!tu", name = "xf", descriptor = "[Lclient!iu;")
	private Interface12[] anInterface12Array3;

	@OriginalMember(owner = "client!tu", name = "Ef", descriptor = "F")
	public float aFloat230;

	@OriginalMember(owner = "client!tu", name = "If", descriptor = "Z")
	public boolean aBoolean543;

	@OriginalMember(owner = "client!tu", name = "Kf", descriptor = "Z")
	protected boolean aBoolean544;

	@OriginalMember(owner = "client!tu", name = "Lf", descriptor = "I")
	private int anInt7780;

	@OriginalMember(owner = "client!tu", name = "Of", descriptor = "I")
	protected int anInt7783;

	@OriginalMember(owner = "client!tu", name = "Rf", descriptor = "F")
	public float aFloat231;

	@OriginalMember(owner = "client!tu", name = "Sf", descriptor = "[Lclient!ua;")
	protected Class289[] aClass289Array6;

	@OriginalMember(owner = "client!tu", name = "Uf", descriptor = "F")
	public float aFloat233;

	@OriginalMember(owner = "client!tu", name = "Xf", descriptor = "Lclient!ep;")
	public Class76 aClass76_14;

	@OriginalMember(owner = "client!tu", name = "Yf", descriptor = "Lclient!oba;")
	public Class2_Sub3 aClass2_Sub3_21;

	@OriginalMember(owner = "client!tu", name = "Zf", descriptor = "Lclient!ep;")
	public Class76 aClass76_15;

	@OriginalMember(owner = "client!tu", name = "ag", descriptor = "Lclient!oba;")
	public Class2_Sub3 aClass2_Sub3_22;

	@OriginalMember(owner = "client!tu", name = "bg", descriptor = "Lclient!ep;")
	private Class76 aClass76_16;

	@OriginalMember(owner = "client!tu", name = "cg", descriptor = "Lclient!ep;")
	public Class76 aClass76_17;

	@OriginalMember(owner = "client!tu", name = "dg", descriptor = "Lclient!oba;")
	public Class2_Sub3 aClass2_Sub3_23;

	@OriginalMember(owner = "client!tu", name = "eg", descriptor = "Lclient!oba;")
	public Class2_Sub3 aClass2_Sub3_24;

	@OriginalMember(owner = "client!tu", name = "fg", descriptor = "Lclient!oba;")
	public Class2_Sub3 aClass2_Sub3_25;

	@OriginalMember(owner = "client!tu", name = "gg", descriptor = "Lclient!cca;")
	private Interface3 anInterface3_12;

	@OriginalMember(owner = "client!tu", name = "hg", descriptor = "Lclient!cca;")
	private Interface3 anInterface3_13;

	@OriginalMember(owner = "client!tu", name = "ig", descriptor = "Lclient!nq;")
	private Interface14 anInterface14_7;

	@OriginalMember(owner = "client!tu", name = "jg", descriptor = "Lclient!oba;")
	public Class2_Sub3 aClass2_Sub3_26;

	@OriginalMember(owner = "client!tu", name = "kg", descriptor = "Lclient!oba;")
	public Class2_Sub3 aClass2_Sub3_27;

	@OriginalMember(owner = "client!tu", name = "lg", descriptor = "Lclient!ep;")
	public Class76 aClass76_18;

	@OriginalMember(owner = "client!tu", name = "mg", descriptor = "Lclient!ep;")
	private Class76 aClass76_19;

	@OriginalMember(owner = "client!tu", name = "ng", descriptor = "Lclient!oba;")
	public Class2_Sub3 aClass2_Sub3_28;

	@OriginalMember(owner = "client!tu", name = "pg", descriptor = "Lclient!oba;")
	public Class2_Sub3 aClass2_Sub3_29;

	@OriginalMember(owner = "client!tu", name = "qg", descriptor = "Lclient!oba;")
	public Class2_Sub3 aClass2_Sub3_30;

	@OriginalMember(owner = "client!tu", name = "rg", descriptor = "Z")
	protected boolean aBoolean545;

	@OriginalMember(owner = "client!tu", name = "sg", descriptor = "I")
	private int anInt7786;

	@OriginalMember(owner = "client!tu", name = "Wb", descriptor = "Lclient!eea;")
	private final Class71 aClass71_59 = new Class71();

	@OriginalMember(owner = "client!tu", name = "Id", descriptor = "Z")
	protected boolean aBoolean525 = true;

	@OriginalMember(owner = "client!tu", name = "Jd", descriptor = "Lclient!nh;")
	protected final Class205_Sub1 aClass205_Sub1_15 = new Class205_Sub1();

	@OriginalMember(owner = "client!tu", name = "Td", descriptor = "Lclient!nh;")
	public Class205_Sub1 aClass205_Sub1_16 = new Class205_Sub1();

	@OriginalMember(owner = "client!tu", name = "Ud", descriptor = "Lclient!nh;")
	public final Class205_Sub1 aClass205_Sub1_17 = new Class205_Sub1();

	@OriginalMember(owner = "client!tu", name = "Vd", descriptor = "Lclient!nh;")
	protected final Class205_Sub1 aClass205_Sub1_18 = new Class205_Sub1();

	@OriginalMember(owner = "client!tu", name = "Wd", descriptor = "Lclient!nh;")
	private final Class205_Sub1 aClass205_Sub1_19 = new Class205_Sub1();

	@OriginalMember(owner = "client!tu", name = "Xd", descriptor = "Lclient!nh;")
	private final Class205_Sub1 aClass205_Sub1_20 = new Class205_Sub1();

	@OriginalMember(owner = "client!tu", name = "he", descriptor = "I")
	protected int anInt7751 = 0;

	@OriginalMember(owner = "client!tu", name = "ke", descriptor = "Z")
	private boolean aBoolean528 = false;

	@OriginalMember(owner = "client!tu", name = "Yd", descriptor = "I")
	protected int anInt7746 = 0;

	@OriginalMember(owner = "client!tu", name = "Ee", descriptor = "[F")
	private final float[] aFloatArray48 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!tu", name = "oe", descriptor = "F")
	public float aFloat220 = 1.0F;

	@OriginalMember(owner = "client!tu", name = "ze", descriptor = "[Lclient!ic;")
	private final Class120[] aClass120Array3 = new Class120[10];

	@OriginalMember(owner = "client!tu", name = "xe", descriptor = "F")
	private float aFloat222 = 3000.0F;

	@OriginalMember(owner = "client!tu", name = "me", descriptor = "F")
	public float aFloat218 = 3584.0F;

	@OriginalMember(owner = "client!tu", name = "te", descriptor = "I")
	private int anInt7754 = 0;

	@OriginalMember(owner = "client!tu", name = "pe", descriptor = "Z")
	private boolean aBoolean529 = false;

	@OriginalMember(owner = "client!tu", name = "ee", descriptor = "I")
	protected int anInt7750 = 0;

	@OriginalMember(owner = "client!tu", name = "Xe", descriptor = "I")
	public int anInt7764 = -1;

	@OriginalMember(owner = "client!tu", name = "Ye", descriptor = "Z")
	protected boolean aBoolean535 = false;

	@OriginalMember(owner = "client!tu", name = "ve", descriptor = "I")
	public int anInt7755 = 512;

	@OriginalMember(owner = "client!tu", name = "Ve", descriptor = "F")
	public float aFloat226 = 1.0F;

	@OriginalMember(owner = "client!tu", name = "Ae", descriptor = "[F")
	private final float[] aFloatArray47 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!tu", name = "ff", descriptor = "I")
	private int anInt7767 = 0;

	@OriginalMember(owner = "client!tu", name = "Te", descriptor = "Z")
	private boolean aBoolean533 = false;

	@OriginalMember(owner = "client!tu", name = "Zd", descriptor = "F")
	private float aFloat216 = 1.0F;

	@OriginalMember(owner = "client!tu", name = "ie", descriptor = "I")
	public int anInt7752 = 128;

	@OriginalMember(owner = "client!tu", name = "jf", descriptor = "I")
	protected int anInt7769 = 0;

	@OriginalMember(owner = "client!tu", name = "Fe", descriptor = "Z")
	protected boolean aBoolean530 = true;

	@OriginalMember(owner = "client!tu", name = "Le", descriptor = "I")
	public int anInt7758 = 512;

	@OriginalMember(owner = "client!tu", name = "Me", descriptor = "[F")
	private final float[] aFloatArray49 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!tu", name = "pf", descriptor = "I")
	private int anInt7771 = -1;

	@OriginalMember(owner = "client!tu", name = "yf", descriptor = "[F")
	private final float[] aFloatArray52 = new float[16];

	@OriginalMember(owner = "client!tu", name = "Qe", descriptor = "I")
	public int anInt7761 = 3;

	@OriginalMember(owner = "client!tu", name = "mf", descriptor = "[F")
	public final float[] aFloatArray51 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!tu", name = "qf", descriptor = "Z")
	private boolean aBoolean540 = false;

	@OriginalMember(owner = "client!tu", name = "Af", descriptor = "[F")
	private final float[] aFloatArray54 = new float[16];

	@OriginalMember(owner = "client!tu", name = "Cf", descriptor = "I")
	protected final int anInt7775 = 0;

	@OriginalMember(owner = "client!tu", name = "nf", descriptor = "Z")
	protected boolean aBoolean539 = false;

	@OriginalMember(owner = "client!tu", name = "ge", descriptor = "Z")
	protected boolean aBoolean527 = true;

	@OriginalMember(owner = "client!tu", name = "of", descriptor = "F")
	public float aFloat228 = 1.0F;

	@OriginalMember(owner = "client!tu", name = "ne", descriptor = "F")
	public float aFloat219 = -1.0F;

	@OriginalMember(owner = "client!tu", name = "We", descriptor = "Z")
	protected boolean aBoolean534 = false;

	@OriginalMember(owner = "client!tu", name = "kf", descriptor = "Z")
	protected boolean aBoolean538 = true;

	@OriginalMember(owner = "client!tu", name = "ye", descriptor = "I")
	protected int anInt7757 = 3584;

	@OriginalMember(owner = "client!tu", name = "Hf", descriptor = "I")
	public int anInt7778 = 50;

	@OriginalMember(owner = "client!tu", name = "Ze", descriptor = "[F")
	protected float[] aFloatArray50 = this.aFloatArray47;

	@OriginalMember(owner = "client!tu", name = "de", descriptor = "Z")
	protected boolean aBoolean526 = false;

	@OriginalMember(owner = "client!tu", name = "af", descriptor = "I")
	private int anInt7765 = 1;

	@OriginalMember(owner = "client!tu", name = "lf", descriptor = "I")
	public int anInt7770 = 8;

	@OriginalMember(owner = "client!tu", name = "sf", descriptor = "I")
	public int anInt7773 = 0;

	@OriginalMember(owner = "client!tu", name = "Df", descriptor = "I")
	public int anInt7776 = 0;

	@OriginalMember(owner = "client!tu", name = "vf", descriptor = "I")
	protected final int anInt7774 = 0;

	@OriginalMember(owner = "client!tu", name = "rf", descriptor = "I")
	protected int anInt7772 = -1;

	@OriginalMember(owner = "client!tu", name = "Ff", descriptor = "I")
	private int anInt7777 = 16777215;

	@OriginalMember(owner = "client!tu", name = "De", descriptor = "F")
	public float aFloat223 = 3584.0F;

	@OriginalMember(owner = "client!tu", name = "zf", descriptor = "[F")
	public final float[] aFloatArray53 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!tu", name = "Qf", descriptor = "Lclient!os;")
	protected Class223 aClass223_5 = Static146.aClass223_1;

	@OriginalMember(owner = "client!tu", name = "Gf", descriptor = "Lclient!qg;")
	protected Class246 aClass246_9 = Static260.aClass246_7;

	@OriginalMember(owner = "client!tu", name = "be", descriptor = "I")
	private int anInt7748 = 0;

	@OriginalMember(owner = "client!tu", name = "Jf", descriptor = "I")
	private int anInt7779 = -1;

	@OriginalMember(owner = "client!tu", name = "Nf", descriptor = "I")
	protected int anInt7782 = 0;

	@OriginalMember(owner = "client!tu", name = "Vf", descriptor = "I")
	public int anInt7785 = -1;

	@OriginalMember(owner = "client!tu", name = "Bf", descriptor = "Z")
	protected boolean aBoolean542 = true;

	@OriginalMember(owner = "client!tu", name = "Wf", descriptor = "[F")
	private final float[] aFloatArray55 = new float[16];

	@OriginalMember(owner = "client!tu", name = "gf", descriptor = "Z")
	protected boolean aBoolean537 = true;

	@OriginalMember(owner = "client!tu", name = "Pf", descriptor = "I")
	private int anInt7784 = 0;

	@OriginalMember(owner = "client!tu", name = "df", descriptor = "Z")
	private boolean aBoolean536 = false;

	@OriginalMember(owner = "client!tu", name = "Tf", descriptor = "F")
	public float aFloat232 = -1.0F;

	@OriginalMember(owner = "client!tu", name = "Mf", descriptor = "I")
	public int anInt7781 = 0;

	@OriginalMember(owner = "client!tu", name = "Oe", descriptor = "F")
	public float aFloat225 = 1.0F;

	@OriginalMember(owner = "client!tu", name = "He", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!tu", name = "og", descriptor = "Lclient!nh;")
	private final Class205_Sub1 aClass205_Sub1_21 = new Class205_Sub1();

	@OriginalMember(owner = "client!tu", name = "yc", descriptor = "Ljava/lang/Object;")
	protected final Object anObject15;

	@OriginalMember(owner = "client!tu", name = "xb", descriptor = "Ljava/lang/Object;")
	private Object anObject14;

	@OriginalMember(owner = "client!tu", name = "le", descriptor = "I")
	protected final int anInt7753;

	@OriginalMember(owner = "client!tu", name = "uc", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas11;

	@OriginalMember(owner = "client!tu", name = "Lc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!tu", name = "ed", descriptor = "Lclient!kea;")
	protected final Class161 aClass161_93;

	@OriginalMember(owner = "client!tu", name = "ae", descriptor = "I")
	public final int anInt7747;

	@OriginalMember(owner = "client!tu", name = "W", descriptor = "I")
	private int anInt7609;

	@OriginalMember(owner = "client!tu", name = "nc", descriptor = "I")
	public int anInt7674;

	@OriginalMember(owner = "client!tu", name = "D", descriptor = "I")
	private int anInt7590;

	@OriginalMember(owner = "client!tu", name = "Eb", descriptor = "I")
	public int anInt7640;

	@OriginalMember(owner = "client!tu", name = "Ce", descriptor = "Lclient!baa;")
	private final Class22 aClass22_3;

	@OriginalMember(owner = "client!tu", name = "Hd", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!e;Lclient!kea;II)V")
	protected Class5_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class161 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anObject14 = this.anObject15 = arg1;
		this.anInt7753 = arg4;
		this.aCanvas12 = this.aCanvas11 = arg0;
		this.aClass161_93 = arg3;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt7747 = arg5;
		this.anInt7674 = this.anInt7609 = local307.width;
		this.anInt7640 = this.anInt7590 = local307.height;
		Static340.method5406(true, false);
		this.aClass22_3 = new Class22(this, super.anInterface4_14);
		this.aNativeInterface3 = new NativeInterface(super.anInterface4_14.method6710(), this.anInt7747);
		for (@Pc(349) int local349 = 0; super.anInterface4_14.method6710() > local349; local349++) {
			@Pc(357) Class238 local357 = super.anInterface4_14.method6712(local349);
			if (local357 != null) {
				this.aNativeInterface3.initTextureMetrics(local349, local357.aByte67, local357.aByte71);
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7423() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7446(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIILclient!fea;Lclient!nq;)V")
	public abstract void method6295(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class87 arg4, @OriginalArg(6) Interface14 arg5);

	@OriginalMember(owner = "client!tu", name = "IA", descriptor = "()I")
	@Override
	public final int IA() {
		return this.anInt7757;
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)I")
	public final int method6296() {
		return this.anInt7771;
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(Z)Lclient!nh;")
	public final Class205_Sub1 method6297() {
		return this.aClass205_Sub1_15;
	}

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "()Z")
	@Override
	public final boolean method7466() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public final Class52 method7432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class52_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "(Z)V")
	protected abstract void method6298();

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZIZI)V")
	public final void method6299(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anInt7779 != arg1) {
			if (arg1 < 0) {
				this.method6376();
				this.method6416(null);
				this.method6309(0);
				if (!this.aBoolean531) {
					this.method6412(0, 0, 0, arg0, arg2);
				}
			} else {
				@Pc(20) Interface9 local20 = this.aClass22_3.method780(arg1);
				@Pc(26) Class238 local26 = super.anInterface4_14.method6712(arg1);
				if (local26.aByte68 == 0 && local26.aByte69 == 0) {
					this.method6376();
				} else {
					@Pc(42) int local42 = local26.aBoolean466 ? 64 : 128;
					@Pc(46) int local46 = local42 * 50;
					@Pc(50) Class205_Sub1 local50 = this.method6348();
					local50.method5225((float) (local26.aByte69 * (this.anInt7766 % local46)) / (float) local46, (float) (local26.aByte68 * (this.anInt7766 % local46)) / (float) local46, 0.0F);
					this.method6355(Static124.aClass243_13);
				}
				if (!this.aBoolean531) {
					this.method6412(local26.aByte70, local26.aByte66, local26.anInt7126, arg0, arg2);
				}
				if (this.aClass120_3 == null) {
					this.method6416(local20);
					this.method6309(local26.anInt7127);
				} else {
					this.aClass120_3.method7328(local26.anInt7127, local20);
				}
			}
			this.anInt7779 = arg1;
		}
		this.anInt7768 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIII)Lclient!dw;")
	@Override
	public final Class66 method7415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class66_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "(I)V")
	protected abstract void method6300();

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "(Z)V")
	protected abstract void method6301();

	@OriginalMember(owner = "client!tu", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt7778;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	protected final void method6302() {
		@Pc(17) Enumeration local17 = this.aHashtable4.keys();
		while (local17.hasMoreElements()) {
			@Pc(23) Canvas local23 = (Canvas) local17.nextElement();
			this.method6350(local23, this.aHashtable4.get(local23));
		}
		this.anInterface3_12.method3138();
		this.anInterface3_13.method3138();
		this.aClass2_Sub3_27.method5461();
		this.aClass2_Sub3_23.method5461();
		this.aClass2_Sub3_29.method5461();
		this.aClass2_Sub3_22.method5461();
		this.aClass2_Sub3_26.method5461();
		this.aClass311_3.method7523();
		this.anInterface14_7.method3138();
	}

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "(I)V")
	private void method6303() {
		this.aBoolean529 = false;
		if (Static204.aClass246_8 == this.aClass246_9) {
			this.method6326();
			this.method6306();
		}
	}

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "(I)F")
	protected abstract float method6304();

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "(I)V")
	private void method6306() {
		this.method6420();
		if (this.aClass120_3 != null) {
			this.aClass120_3.method7319();
		}
	}

	@OriginalMember(owner = "client!tu", name = "ka", descriptor = "(FF)V")
	@Override
	public final void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat222 == arg0 && this.aFloat229 == arg1) {
			return;
		}
		this.aFloat222 = arg0;
		this.aFloat229 = arg1;
		this.method6378();
		this.method6312();
		this.method6303();
		this.method6336();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!kp;Lclient!vt;)Z")
	public abstract boolean method6307(@OriginalArg(1) Class167 arg0, @OriginalArg(2) Class310 arg1);

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "(I)V")
	protected abstract void method6308();

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(II)V")
	public final void method6309(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6320(Static526.aClass289_5, Static526.aClass289_5);
		} else if (arg0 == 0) {
			this.method6320(Static130.aClass289_1, Static130.aClass289_1);
		} else if (arg0 == 2) {
			this.method6320(Static526.aClass289_5, Static306.aClass289_2);
		} else if (arg0 == 3) {
			this.method6320(Static130.aClass289_1, Static500.aClass289_4);
		} else if (arg0 == 4) {
			this.method6320(Static355.aClass289_3, Static355.aClass289_3);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!kp;BLclient!vt;)Z")
	public abstract boolean method6310(@OriginalArg(0) Class167 arg0, @OriginalArg(2) Class310 arg1);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7422(@OriginalArg(0) Canvas arg0) {
		this.aCanvas12 = null;
		this.anObject14 = null;
		if (arg0 == null || arg0 == this.aCanvas11) {
			this.anObject14 = this.anObject15;
			this.aCanvas12 = this.aCanvas11;
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.anObject14 = this.aHashtable4.get(arg0);
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.anObject14 == null) {
			throw new RuntimeException();
		}
		this.method6324(this.anObject14, this.aCanvas12);
		this.method6322();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BZ)V")
	public final void method6311(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean539) {
			this.aBoolean539 = arg0;
			this.method6308();
			this.anInt7768 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "(Z)V")
	private void method6312() {
		if (this.aFloat229 == 0.0F) {
			this.aFloatArray54[10] = this.aFloat227;
			this.aFloatArray54[14] = this.aFloat224;
		} else {
			@Pc(27) float local27 = this.aFloat222 / (this.aFloat222 + this.aFloat229);
			@Pc(31) float local31 = local27 * local27;
			@Pc(46) float local46 = (1.0F - local27) * (1.0F - local27) * -this.aFloat224 / this.aFloat229;
			this.aFloatArray54[14] = local31 * this.aFloat224;
			this.aFloatArray54[10] = this.aFloat227 + local46;
		}
		this.aFloat218 = ((float) -this.anInt7757 + this.aFloatArray54[14]) / this.aFloatArray54[10];
	}

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "(I)V")
	protected abstract void method6313();

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7424(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas11 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			this.method6350(arg0, this.aHashtable4.get(arg0));
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!km;ZI)V")
	public final void method6314(@OriginalArg(0) Class166 arg0, @OriginalArg(2) int arg1) {
		this.method6413(arg0, arg1);
	}

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7419(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!fea;I)V")
	private void method6315(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1) {
		this.method6382(this.anInterface3_12, 0);
		this.method6333(this.aClass76_16);
		this.method6329(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)I")
	@Override
	public final int method7418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(II)V")
	public abstract void method6316(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7412(@OriginalArg(0) boolean arg0) {
		this.aBoolean530 = arg0;
		this.method6308();
	}

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "(I)V")
	@Override
	public final void method7474(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!ba;Lclient!be;Lclient!q;Lclient!sda;I)V")
	@Override
	public final void method7464(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class4_Sub7 arg3, @OriginalArg(4) int arg4) {
		arg0.method5774(arg2, arg3, arg4);
		this.method7429(arg1);
	}

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "(Z)V")
	private void method6317() {
		if (this.aClass120_3 != null) {
			this.aClass120_3.method7321();
		}
		this.method6429();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public final Class119 method7457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class119_Sub2 local11 = new Class119_Sub2(this, arg2, arg3, arg4);
		local11.GA(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(FB)V")
	public final void method6318(@OriginalArg(0) float arg0) {
		if (this.aFloat216 != arg0) {
			this.aFloat216 = arg0;
			this.method6303();
		}
	}

	@OriginalMember(owner = "client!tu", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt7751 < arg0) {
			local5 = true;
			this.anInt7751 = arg0;
		}
		if (this.anInt7769 > arg2) {
			local5 = true;
			this.anInt7769 = arg2;
		}
		if (this.anInt7750 < arg1) {
			local5 = true;
			this.anInt7750 = arg1;
		}
		if (this.anInt7782 > arg3) {
			local5 = true;
			this.anInt7782 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean545) {
			this.aBoolean545 = true;
			this.method6418();
		}
		this.method6407();
		this.method6411();
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
	public final void method6319() {
		if (this.anInt7768 == 16) {
			return;
		}
		this.method6424();
		this.method6428(true);
		this.method6414(true);
		this.method6311(true);
		this.method6398(1);
		this.anInt7768 = 16;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!sda;I)V")
	@Override
	public final void method7468(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) Class4_Sub7[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method5774(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!ua;Lclient!ua;I)V")
	public final void method6320(@OriginalArg(0) Class289 arg0, @OriginalArg(1) Class289 arg1) {
		@Pc(13) boolean local13 = false;
		if (this.aClass289Array6[this.anInt7746] != arg1) {
			this.aClass289Array6[this.anInt7746] = arg1;
			this.method6383();
			local13 = true;
		}
		if (this.aClass289Array5[this.anInt7746] != arg0) {
			this.aClass289Array5[this.anInt7746] = arg0;
			this.method6338();
			local13 = true;
		}
		if (local13) {
			this.anInt7768 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public final void method7456(@OriginalArg(0) Class3_Sub22 arg0) {
		this.aNativeHeap5 = ((Class3_Sub22_Sub1) arg0).aNativeHeap4;
		this.aNativeHeapBuffer8 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZIII[II)Lclient!ica;")
	public abstract Interface9 method6321(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!tu", name = "q", descriptor = "(I)V")
	private void method6322() {
		if (this.aCanvas12 == null) {
			this.anInt7609 = this.anInt7590 = 1;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas12.getSize();
			this.anInt7590 = local14.height;
			this.anInt7609 = local14.width;
		}
		this.anInt7640 = this.anInt7590;
		this.anInt7674 = this.anInt7609;
		this.method6419();
		this.method6336();
		this.method6303();
		this.method6346();
		this.method6411();
		this.method6423();
		this.F();
	}

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "(I)I")
	public final int method6323() {
		return this.anInt7784;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method6324(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(BZ)Lclient!nq;")
	public abstract Interface14 method6325(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)V")
	private void method6326() {
		if (this.aBoolean529) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray52;
		@Pc(21) float local21 = (float) this.anInt7778 - this.aFloat229;
		@Pc(28) float local28 = (float) this.anInt7757 - this.aFloat229;
		@Pc(40) float local40 = this.aFloat216 * (float) -this.anInt7776 / (float) this.anInt7758;
		@Pc(52) float local52 = this.aFloat216 * (float) -this.anInt7781 / (float) this.anInt7755;
		@Pc(67) float local67 = (float) (this.anInt7674 - this.anInt7781) * this.aFloat216 / (float) this.anInt7755;
		@Pc(82) float local82 = (float) (this.anInt7640 - this.anInt7776) * this.aFloat216 / (float) this.anInt7758;
		if (local67 == local52 || local82 == local40) {
			local13[2] = 0.0F;
			local13[15] = 1.0F;
			local13[6] = 0.0F;
			local13[8] = 0.0F;
			local13[14] = 0.0F;
			local13[3] = 0.0F;
			local13[5] = 1.0F;
			local13[1] = 0.0F;
			local13[4] = 0.0F;
			local13[9] = 0.0F;
			local13[11] = 0.0F;
			local13[0] = 1.0F;
			local13[10] = 1.0F;
			local13[12] = 0.0F;
			local13[13] = 0.0F;
			local13[7] = 0.0F;
		} else {
			local13[4] = 0.0F;
			local13[0] = 2.0F / (local67 - local52);
			local13[14] = local21 / (local21 - local28);
			local13[1] = 0.0F;
			local13[15] = 1.0F;
			local13[3] = 0.0F;
			local13[6] = 0.0F;
			local13[2] = 0.0F;
			local13[9] = 0.0F;
			local13[11] = 0.0F;
			local13[5] = 2.0F / (local82 - local40);
			local13[12] = (local52 + local67) / (local52 - local67);
			local13[13] = (local40 + local82) / (local82 - local40);
			local13[10] = 1.0F / (local21 - local28);
			local13[7] = 0.0F;
			local13[8] = 0.0F;
		}
		this.method6378();
		this.aBoolean529 = true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	@Override
	public void method7427(@OriginalArg(0) int arg0) {
		this.aClass22_3.method778();
		this.anInt7766 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(B)V")
	protected abstract void method6327();

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "(Z)V")
	protected abstract void method6328();

	@OriginalMember(owner = "client!tu", name = "C", descriptor = "()I")
	@Override
	public final int method7479() {
		return this.anInt7783 - 2;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIILclient!fea;)V")
	public abstract void method6329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class87 arg2);

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "(I)V")
	private void method6330() {
		if (this.aBoolean533) {
			return;
		}
		@Pc(14) float[] local14 = this.aFloatArray55;
		this.aBoolean533 = true;
		if (this.anInt7674 != 0 && this.anInt7640 != 0) {
			local14[0] = 2.0F / (float) this.anInt7674;
			local14[7] = 0.0F;
			local14[2] = 0.0F;
			local14[1] = 0.0F;
			local14[12] = -1.0F;
			local14[6] = 0.0F;
			local14[4] = 0.0F;
			local14[5] = -2.0F / (float) this.anInt7640;
			local14[3] = 0.0F;
			local14[8] = 0.0F;
			local14[11] = 0.0F;
			local14[15] = 1.0F;
			local14[9] = 0.0F;
			local14[14] = 0.5F;
			local14[13] = 1.0F;
			local14[10] = 0.5F;
			return;
		}
		local14[13] = 0.0F;
		local14[7] = 0.0F;
		local14[8] = 0.0F;
		local14[3] = 0.0F;
		local14[15] = 1.0F;
		local14[1] = 0.0F;
		local14[10] = 1.0F;
		local14[9] = 0.0F;
		local14[11] = 0.0F;
		local14[0] = 1.0F;
		local14[2] = 0.0F;
		local14[6] = 0.0F;
		local14[5] = 1.0F;
		local14[4] = 0.0F;
		local14[14] = 0.0F;
		local14[12] = 0.0F;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZZ)V")
	public final void method6331(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean535) {
			this.aBoolean535 = arg0;
			this.method6391();
		}
	}

	@OriginalMember(owner = "client!tu", name = "t", descriptor = "(I)V")
	private void method6332() {
		if (this.anInt7768 == 1) {
			return;
		}
		this.method6344();
		this.method6428(false);
		this.method6349(false);
		this.method6414(false);
		this.method6311(false);
		this.method6299(false, -2, false);
		this.method6309(1);
		this.method6416(this.anInterface12_3);
		this.anInt7768 = 1;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!ep;)V")
	public abstract void method6333(@OriginalArg(1) Class76 arg0);

	@OriginalMember(owner = "client!tu", name = "X", descriptor = "(III)V")
	@Override
	public final void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt7785 && arg1 == this.anInt7764 && this.anInt7773 == arg2) {
			return;
		}
		this.anInt7785 = arg0;
		this.anInt7773 = arg2;
		this.anInt7764 = arg1;
		if (!this.aBoolean531) {
			this.method6317();
			this.method6408();
		}
	}

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "()Lclient!q;")
	@Override
	public final Class205 method7448() {
		return this.aClass205_Sub1_21;
	}

	@OriginalMember(owner = "client!tu", name = "AA", descriptor = "(IIII)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean531 = true;
		this.anInt7772 = arg1;
		this.anInt7780 = arg0;
		this.anInt7784 = arg3;
		this.anInt7771 = arg2;
		this.method6412(3, 0, 0, false, false);
		if (this.aClass120_3 != null) {
			this.aClass120_3.method7330();
		}
		this.method6317();
		this.method6408();
	}

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "(B)Lclient!wn;")
	public final Interface20 method6334() {
		return this.aClass66_Sub2_3 == null ? null : this.aClass66_Sub2_3.method5629();
	}

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7439() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V")
	public final void method6335(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean542) {
			this.aBoolean542 = arg0;
			this.method6408();
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!or;IIII)Lclient!ba;")
	@Override
	public final Class2 method7443(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class2_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!tu", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class10_Sub2 local6 = (Class10_Sub2) arg1;
		@Pc(9) Interface9 local9 = local6.anInterface9_3;
		this.method6401();
		this.method6416(local9);
		this.method6398(1);
		this.method6320(Static526.aClass289_5, Static526.aClass289_5);
		this.method6415(Static144.aClass166_2, 0);
		this.method6363(arg0);
		this.aClass205_Sub1_15.method5240(0.0F, (float) this.anInt7674, (float) this.anInt7640);
		this.method6392();
		this.aClass205_Sub1Array3[0].method5240(1.0F, local9.method3275((float) this.anInt7674), local9.method3277((float) this.anInt7640));
		this.aClass205_Sub1Array3[0].method5227(local9.method3275((float) -arg2), local9.method3277((float) -arg3), 0.0F);
		this.aClass243Array3[0] = Static124.aClass243_13;
		this.method6354();
		this.method6342();
		this.method6376();
		this.method6415(Static213.aClass166_3, 0);
	}

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "()V")
	@Override
	public final void k() {
		this.aBoolean531 = false;
		this.method6412(0, 0, 0, false, false);
		this.method6317();
		this.method6408();
	}

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "(Z)V")
	private void method6336() {
		this.aBoolean528 = false;
		this.method6371();
		if (this.aClass246_9 == Static486.aClass246_11) {
			this.method6306();
		}
	}

	@OriginalMember(owner = "client!tu", name = "D", descriptor = "()Z")
	@Override
	public final boolean method7480() {
		return false;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public final Class119 method7483(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class119_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V")
	@Override
	public final void method7438(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "(B)V")
	protected abstract void method6338();

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(BZ)V")
	public final void method6339(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean527) {
			this.aBoolean527 = arg0;
			this.method6393();
		}
	}

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "(IIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7755 = arg2;
		this.anInt7758 = arg3;
		this.anInt7776 = arg1;
		this.anInt7781 = arg0;
		this.method6303();
		this.method6336();
		this.method6423();
		this.method6411();
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7442(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas11) {
			local5 = this.anObject14;
		} else if (this.aHashtable4.containsKey(arg0)) {
			local5 = this.aHashtable4.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method6380(local5, arg0);
		if (arg0 == this.aCanvas12) {
			this.method6322();
		}
	}

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "(B)V")
	protected abstract void method6340();

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "(II)Lclient!nq;")
	public final Interface14 method6341(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface14_7.method3133()) {
			this.anInterface14_7.method3137(arg0);
		}
		return this.anInterface14_7;
	}

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "(B)V")
	public final void method6342() {
		this.method6315(2, Static328.aClass87_5);
	}

	@OriginalMember(owner = "client!tu", name = "B", descriptor = "()Z")
	@Override
	public final boolean method7473() {
		return false;
	}

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "(I)V")
	private void method6343() {
		this.anInterface3_12 = this.method6422(false);
		this.anInterface3_12.method2580(28, 140);
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(30) Buffer local30 = this.anInterface3_12.method3136();
			if (local30 != null) {
				@Pc(37) Stream local37 = this.method6352(local30);
				if (Stream.c()) {
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
				} else {
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
				}
				local37.a();
				if (this.anInterface3_12.method3135()) {
					break;
				}
			}
		}
		this.aClass76_16 = this.method6361(new Class50[] { new Class50(new Class144[] { Static218.aClass144_1, Static218.aClass144_5, Static218.aClass144_5 }) });
	}

	@OriginalMember(owner = "client!tu", name = "v", descriptor = "(I)V")
	private void method6344() {
		if (this.aClass246_9 == Static232.aClass246_4) {
			return;
		}
		@Pc(12) Class246 local12 = this.aClass246_9;
		this.aClass246_9 = Static232.aClass246_4;
		if (local12.method6019()) {
			this.method6364();
		}
		this.method6330();
		this.aFloatArray50 = this.aFloatArray55;
		this.method6306();
		this.anInt7768 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "(I)Lclient!i;")
	@Override
	public final Class3_Sub22 method7470(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub22_Sub1 local8 = new Class3_Sub22_Sub1(arg0);
		this.aClass71_59.method2076(local8);
		return local8;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!cq;[Lclient!af;Z)Lclient!ta;")
	@Override
	public final Class59 method7414(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class9[] arg1) {
		return new Class59_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "(B)V")
	public final void method6345() {
		this.method6423();
		this.method6306();
	}

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "(B)V")
	protected abstract void method6346();

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!kp;Z[FIII)Lclient!ica;")
	public final Interface9 method6347(@OriginalArg(0) Class167 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		return this.method6403(arg1, arg2, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!tu", name = "w", descriptor = "(I)Lclient!nh;")
	public final Class205_Sub1 method6348() {
		return this.aClass205_Sub1Array3[this.anInt7746];
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI)V")
	public final void method6349(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean534) {
			this.aBoolean534 = arg0;
			this.method6391();
			this.anInt7768 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7445() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public final void method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class10 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
	protected abstract void method6350(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!tu", name = "x", descriptor = "(I)V")
	public abstract void method6351();

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;B)Lclient!jaclib/memory/Stream;")
	public final Stream method6352(@OriginalArg(0) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!dw;)V")
	@Override
	public final void method7485(@OriginalArg(0) Class66 arg0) {
		this.aClass66_Sub2_3 = (Class66_Sub2) arg0;
	}

	@OriginalMember(owner = "client!tu", name = "z", descriptor = "()V")
	@Override
	public final void method7471() {
		this.aClass22_3.method781();
	}

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "(I)V")
	protected final void method6353() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable4 != null && !this.aHashtable4.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable4.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method6406(local26));
			}
		}
		this.aHashtable4 = local9;
		this.method6343();
		this.method6395();
		this.aClass311_3.method7525(this);
	}

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "(I)V")
	@Override
	public final void method7454(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tu", name = "z", descriptor = "(I)V")
	private void method6354() {
		this.method6340();
		if (this.aClass120_3 != null) {
			this.aClass120_3.method7325();
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(II)I")
	@Override
	public final int method7435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!qda;Z)V")
	public final void method6355(@OriginalArg(0) Class243 arg0) {
		this.aClass243Array3[this.anInt7746] = arg0;
		this.method6354();
	}

	@OriginalMember(owner = "client!tu", name = "A", descriptor = "(I)Lclient!nh;")
	public final Class205_Sub1 method6356() {
		return this.aClass205_Sub1_19;
	}

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "(B)Lclient!nh;")
	public final Class205_Sub1 method6357() {
		if (!this.aBoolean540) {
			this.aClass205_Sub1_20.method5217(this.aClass205_Sub1_18, this.aClass205_Sub1_15);
			this.aBoolean540 = true;
		}
		return this.aClass205_Sub1_20;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZIZLclient!km;Z)V")
	public abstract void method6358(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class166 arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!tu", name = "sa", descriptor = "(II)V")
	@Override
	public final void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7778 == arg0 && this.anInt7757 == arg1) {
			return;
		}
		this.anInt7778 = arg0;
		this.anInt7757 = arg1;
		this.method6336();
		this.method6303();
		this.method6317();
	}

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "(B)Lclient!nh;")
	public final Class205_Sub1 method6359() {
		return this.aClass205_Sub1Array3[this.anInt7746];
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IILclient!kp;I[BZBI)Lclient!ica;")
	protected abstract Interface9 method6360(@OriginalArg(1) int arg0, @OriginalArg(2) Class167 arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) boolean arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "([Lclient!ck;Z)Lclient!ep;")
	public abstract Class76 method6361(@OriginalArg(0) Class50[] arg0);

	@OriginalMember(owner = "client!tu", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public final void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!be;)V")
	@Override
	public final void method7429(@OriginalArg(0) Class26 arg0) {
		this.aClass311_3.method7524(arg0, this);
	}

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "(Z)V")
	protected void method6362() {
		this.method6410();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V")
	public final void method6363(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt7749) {
			this.anInt7749 = arg0;
			this.method6327();
		}
	}

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "(Z)V")
	private void method6364() {
		this.aBoolean540 = false;
		if (this.aClass120_3 != null) {
			this.aClass120_3.method7323();
		}
		this.method6313();
	}

	@OriginalMember(owner = "client!tu", name = "B", descriptor = "(I)V")
	private void method6365() {
		if (Static232.aClass246_4 == this.aClass246_9) {
			@Pc(11) float local11 = this.method6304();
			this.aClass205_Sub1_15.method5227(local11, local11, 0.0F);
		}
		this.aBoolean540 = false;
		this.method6397();
		if (this.aClass120_3 != null) {
			this.aClass120_3.method7327();
		}
	}

	@OriginalMember(owner = "client!tu", name = "C", descriptor = "(I)V")
	private void method6366() {
		if (this.aClass246_9 == Static486.aClass246_11) {
			return;
		}
		@Pc(21) Class246 local21 = this.aClass246_9;
		this.aClass246_9 = Static486.aClass246_11;
		if (!local21.method6019()) {
			this.method6364();
		}
		this.method6371();
		this.aFloatArray50 = this.aFloatArray54;
		this.method6306();
		this.anInt7768 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!tu", name = "E", descriptor = "(I)V")
	private void method6367() {
		this.method6382(this.anInterface3_13, 0);
		this.method6333(this.aClass76_19);
		this.method6329(0, 1, Static94.aClass87_4);
	}

	@OriginalMember(owner = "client!tu", name = "F", descriptor = "(I)V")
	protected void method6368() {
		this.anInt7763 = this.anInt7759;
		this.anInt7759 = 0;
	}

	@OriginalMember(owner = "client!tu", name = "G", descriptor = "(I)V")
	public final void method6369() {
		if (this.anInt7768 == 4) {
			return;
		}
		this.method6344();
		this.method6428(false);
		this.method6349(false);
		this.method6414(false);
		this.method6311(false);
		this.method6299(false, -2, false);
		this.method6398(1);
		this.method6309(0);
		this.anInt7768 = 4;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		@Pc(29) float local29 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local16 * local16)));
		@Pc(33) float local33 = local9 * local29;
		@Pc(37) float local37 = local16 * local29;
		if (!this.method6387((float) arg3 + local37, 0.0F, (float) arg0, 0.0F, (float) arg2 + local33, (float) arg1)) {
			return;
		}
		this.method6332();
		this.method6363(arg4);
		this.method6415(Static144.aClass166_2, 0);
		this.method6314(Static144.aClass166_2, 0);
		this.method6398(arg5);
		this.method6370();
		this.method6372(false);
		this.method6367();
		this.method6372(true);
		this.method6314(Static213.aClass166_3, 0);
		this.method6415(Static213.aClass166_3, 0);
	}

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "(B)V")
	public final void method6370() {
		this.aClass205_Sub1_15.Y();
		this.aBoolean525 = true;
		this.method6365();
	}

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "(Z)V")
	private void method6371() {
		if (this.aBoolean528) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray54;
		@Pc(17) float local17 = (float) (this.anInt7778 * -this.anInt7781) / (float) this.anInt7755;
		@Pc(32) float local32 = (float) ((this.anInt7674 - this.anInt7781) * this.anInt7778) / (float) this.anInt7755;
		@Pc(43) float local43 = (float) (this.anInt7778 * this.anInt7776) / (float) this.anInt7758;
		@Pc(57) float local57 = (float) (this.anInt7778 * (this.anInt7776 - this.anInt7640)) / (float) this.anInt7758;
		if (local32 == local17 || local57 == local43) {
			local5[5] = 1.0F;
			local5[3] = 0.0F;
			local5[0] = 1.0F;
			local5[1] = 0.0F;
			local5[12] = 0.0F;
			local5[8] = 0.0F;
			local5[9] = 0.0F;
			local5[14] = 0.0F;
			local5[6] = 0.0F;
			local5[13] = 0.0F;
			local5[11] = 0.0F;
			local5[15] = 1.0F;
			local5[7] = 0.0F;
			local5[10] = 1.0F;
			local5[2] = 0.0F;
			local5[4] = 0.0F;
		} else {
			@Pc(71) float local71 = (float) this.anInt7778 * 2.0F;
			local5[11] = -1.0F;
			local5[5] = local71 / (local43 - local57);
			local5[8] = (local17 + local32) / (-local17 + local32);
			local5[1] = 0.0F;
			local5[7] = 0.0F;
			local5[12] = 0.0F;
			local5[0] = local71 / (local32 - local17);
			local5[4] = 0.0F;
			local5[13] = 0.0F;
			local5[10] = this.aFloat227 = (float) this.anInt7757 / (float) (this.anInt7778 - this.anInt7757);
			local5[6] = 0.0F;
			local5[14] = this.aFloat224 = (float) (this.anInt7757 * this.anInt7778) / (float) (this.anInt7778 - this.anInt7757);
			local5[3] = 0.0F;
			local5[9] = (local57 + local43) / (local43 - local57);
			local5[15] = 0.0F;
			local5[2] = 0.0F;
		}
		this.method6312();
		this.aBoolean528 = true;
	}

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "()Z")
	@Override
	public final boolean method7426() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "()V")
	@Override
	protected void method7447() {
		if (this.aBoolean536) {
			return;
		}
		for (@Pc(13) Class3 local13 = this.aClass71_59.method2089(); local13 != null; local13 = this.aClass71_59.method2086()) {
			((Class3_Sub22_Sub1) local13).method3829();
		}
		@Pc(30) Enumeration local30 = this.aHashtable4.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method6350(local36, this.aHashtable4.get(local36));
		}
		Static390.method5973(true, false);
		this.aNativeInterface3.release();
		this.aBoolean536 = true;
	}

	@OriginalMember(owner = "client!tu", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt7777;
		if (local11 || arg1 != this.aFloat219 || arg2 != this.aFloat232) {
			this.aFloat219 = arg1;
			this.aFloat232 = arg2;
			this.anInt7777 = arg0;
			if (local11) {
				this.aFloat226 = (float) (this.anInt7777 & 0xFF0000) / 1.671168E7F;
				this.aFloat225 = (float) (this.anInt7777 & 0xFF) / 255.0F;
				this.aFloat220 = (float) (this.anInt7777 & 0xFF00) / 65280.0F;
				this.method6328();
			}
			this.aNativeInterface3.setSunColour(this.aFloat226, this.aFloat220, this.aFloat225, arg1, arg2);
			this.method6390();
		}
		if (this.aFloatArray48[0] != arg3 || this.aFloatArray48[1] != arg4 || arg5 != this.aFloatArray48[2]) {
			this.aFloatArray48[2] = arg5;
			this.aFloatArray48[0] = arg3;
			this.aFloatArray48[1] = arg4;
			this.aFloatArray49[2] = -arg5;
			this.aFloatArray49[0] = -arg3;
			this.aFloatArray49[1] = -arg4;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
			this.aFloatArray53[0] = local149 * arg3;
			this.aFloatArray53[2] = arg5 * local149;
			this.aFloatArray53[1] = arg4 * local149;
			this.aFloatArray51[2] = -this.aFloatArray53[2];
			this.aFloatArray51[1] = -this.aFloatArray53[1];
			this.aFloatArray51[0] = -this.aFloatArray53[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray53[0], this.aFloatArray53[1], this.aFloatArray53[2]);
			this.method6351();
			this.anInt7762 = (int) (arg3 * 256.0F / arg4);
			this.anInt7756 = (int) (arg5 * 256.0F / arg4);
		}
		this.method6300();
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(IZ)V")
	public abstract void method6372(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[IZII)Lclient!ica;")
	public final Interface9 method6373(@OriginalArg(1) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method6321(arg1, 0, arg3, 0, arg0, arg2);
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7421() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "ya", descriptor = "(IIIII)V")
	@Override
	public final void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7419(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!kp;[BIIZZ)Lclient!ica;")
	public final Interface9 method6374(@OriginalArg(0) Class167 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return this.method6360(arg3, arg0, arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!tu", name = "F", descriptor = "()V")
	@Override
	public final void F() {
		this.anInt7751 = 0;
		this.anInt7750 = 0;
		this.anInt7769 = this.anInt7674;
		this.anInt7782 = this.anInt7640;
		if (this.aBoolean545) {
			this.aBoolean545 = false;
			this.method6418();
		}
		this.method6411();
	}

	@OriginalMember(owner = "client!tu", name = "H", descriptor = "(I)V")
	public final void method6375() {
		if (this.anInt7768 == 8) {
			return;
		}
		this.method6366();
		this.method6428(true);
		this.method6414(true);
		this.method6311(true);
		this.method6398(1);
		this.anInt7768 = 8;
	}

	@OriginalMember(owner = "client!tu", name = "I", descriptor = "(I)V")
	public final void method6376() {
		if (this.aClass243Array3[this.anInt7746] != Static95.aClass243_6) {
			this.aClass243Array3[this.anInt7746] = Static95.aClass243_6;
			this.aClass205_Sub1Array3[this.anInt7746].Y();
			this.method6354();
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BB)V")
	public final void method6377(@OriginalArg(1) byte arg0) {
		this.method6363(arg0 << 24 | arg0 << 16 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!tu", name = "J", descriptor = "(I)V")
	private void method6378() {
		this.aFloat223 = (float) this.anInt7757 - this.aFloat229;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI[[IZ)Lclient!wn;")
	public abstract Interface20 method6379(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method6380(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLclient!nh;)V")
	public final void method6381(@OriginalArg(1) Class205_Sub1 arg0) {
		this.aClass205_Sub1_15.la(arg0);
		this.aBoolean525 = false;
		this.method6365();
	}

	@OriginalMember(owner = "client!tu", name = "C", descriptor = "(IIIIII)V")
	@Override
	public final void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6332();
		this.method6363(arg4);
		this.method6415(Static144.aClass166_2, 0);
		this.method6314(Static144.aClass166_2, 0);
		this.method6398(arg5);
		this.aClass205_Sub1_15.method5240(1.0F, (float) arg2, (float) arg3);
		this.aClass205_Sub1_15.G(arg0, arg1, 0);
		this.method6392();
		this.method6372(false);
		this.method6342();
		this.method6372(true);
		this.method6314(Static213.aClass166_3, 0);
		this.method6415(Static213.aClass166_3, 0);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!cca;II)V")
	public abstract void method6382(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "(Z)V")
	protected abstract void method6383();

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method7484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method6304();
		this.method6332();
		this.method6363(arg4);
		this.method6415(Static144.aClass166_2, 0);
		this.method6314(Static144.aClass166_2, 0);
		this.method6398(arg5);
		this.aClass205_Sub1_15.method5240(1.0F, (float) (arg2 - 1), (float) (arg3 - 1));
		this.aClass205_Sub1_15.method5227((float) arg0 - local7, (float) arg1 - local7, 0.0F);
		this.method6392();
		this.method6372(false);
		this.method6315(4, Static478.aClass87_6);
		this.method6372(true);
		this.method6314(Static213.aClass166_3, 0);
		this.method6415(Static213.aClass166_3, 0);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "()Lclient!q;")
	@Override
	public final Class205 method7409() {
		return new Class205_Sub1();
	}

	@OriginalMember(owner = "client!tu", name = "aa", descriptor = "()I")
	@Override
	public final int aa() {
		return this.anInt7786;
	}

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "()F")
	public final float method6384() {
		return this.aFloat222;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "([FI)[F")
	public final float[] method6385(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloatArray50[1];
		arg0[0] = this.aFloatArray50[0];
		arg0[8] = this.aFloatArray50[2];
		arg0[12] = this.aFloatArray50[3];
		arg0[2] = this.aFloatArray50[8];
		arg0[9] = this.aFloatArray50[6];
		arg0[13] = this.aFloatArray50[7];
		arg0[1] = this.aFloatArray50[4];
		arg0[5] = this.aFloatArray50[5];
		arg0[3] = this.aFloatArray50[12];
		arg0[10] = this.aFloatArray50[10];
		arg0[7] = this.aFloatArray50[13];
		arg0[6] = this.aFloatArray50[9];
		arg0[14] = this.aFloatArray50[11];
		arg0[11] = this.aFloatArray50[14];
		arg0[15] = this.aFloatArray50[15];
		return arg0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method7436() {
	}

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "(B)V")
	protected abstract void method6386();

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "(I)V")
	@Override
	public final void method7463(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt7752 = arg0;
		this.aClass22_3.method781();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(FFFFIFF)Z")
	private boolean method6387(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface3_13.method3136();
		if (local9 == null) {
			return false;
		}
		@Pc(23) Stream local23 = this.method6352(local9);
		if (Stream.c()) {
			local23.a(arg2);
			local23.a(arg5);
			local23.a(arg1);
			local23.a(arg4);
			local23.a(arg0);
			local23.a(arg3);
		} else {
			local23.b(arg2);
			local23.b(arg5);
			local23.b(arg1);
			local23.b(arg4);
			local23.b(arg0);
			local23.b(arg3);
		}
		local23.a();
		return this.anInterface3_13.method3135();
	}

	@OriginalMember(owner = "client!tu", name = "v", descriptor = "()I")
	@Override
	public final int v() {
		return this.anInt7741 + this.anInt7745 + this.anInt7743;
	}

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "(II)V")
	public final void method6388(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt7746) {
			this.anInt7746 = arg0;
			this.method6426();
		}
	}

	@OriginalMember(owner = "client!tu", name = "A", descriptor = "([I)V")
	@Override
	public final void A(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7751;
		arg0[1] = this.anInt7750;
		arg0[2] = this.anInt7769;
		arg0[3] = this.anInt7782;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method7469(@OriginalArg(0) Class205 arg0) {
		this.aClass205_Sub1_16 = (Class205_Sub1) arg0;
		this.aClass205_Sub1_18.la(this.aClass205_Sub1_16);
		this.aClass205_Sub1_18.method5230();
		this.aClass205_Sub1_19.method5220(this.aClass205_Sub1_18);
		this.aClass205_Sub1_17.method5220(this.aClass205_Sub1_16);
		if (this.aClass246_9.method6019()) {
			this.method6364();
		}
	}

	@OriginalMember(owner = "client!tu", name = "K", descriptor = "(I)I")
	public final int method6389() {
		return this.anInt7780;
	}

	@OriginalMember(owner = "client!tu", name = "L", descriptor = "(I)V")
	protected abstract void method6390();

	@OriginalMember(owner = "client!tu", name = "M", descriptor = "(I)V")
	protected abstract void method6391();

	@OriginalMember(owner = "client!tu", name = "N", descriptor = "(I)V")
	public final void method6392() {
		this.aBoolean525 = false;
		this.method6365();
	}

	@OriginalMember(owner = "client!tu", name = "O", descriptor = "(I)V")
	protected abstract void method6393();

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!lk;I)V")
	public abstract void method6394(@OriginalArg(0) Class177 arg0);

	@OriginalMember(owner = "client!tu", name = "P", descriptor = "(I)V")
	private void method6395() {
		this.anInterface3_13 = this.method6422(true);
		this.anInterface3_13.method2580(12, 24);
		this.aClass76_19 = this.method6361(new Class50[] { new Class50(Static218.aClass144_1) });
	}

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "(B)V")
	protected abstract void method6396();

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "(B)V")
	protected abstract void method6397();

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "(II)V")
	public final void method6398(@OriginalArg(0) int arg0) {
		if (this.anInt7765 == arg0) {
			return;
		}
		@Pc(27) Class223 local27;
		@Pc(31) boolean local31;
		@Pc(29) boolean local29;
		if (arg0 == 1) {
			local27 = Static146.aClass223_1;
			local29 = true;
			local31 = true;
		} else if (arg0 == 2) {
			local27 = Static459.aClass223_6;
			local31 = true;
			local29 = false;
		} else if (arg0 == 128) {
			local27 = Static508.aClass223_7;
			local31 = true;
			local29 = true;
		} else {
			local29 = false;
			local27 = Static289.aClass223_4;
			local31 = false;
		}
		if (local29 != this.aBoolean538) {
			this.aBoolean538 = local29;
			this.method6298();
		}
		if (local31 != this.aBoolean537) {
			this.aBoolean537 = local31;
			this.method6301();
		}
		if (local27 != this.aClass223_5) {
			this.aClass223_5 = local27;
			this.method6404();
		}
		this.anInt7768 &= 0xFFFFFFE3;
		this.anInt7765 = arg0;
	}

	@OriginalMember(owner = "client!tu", name = "E", descriptor = "()F")
	public final float method6399() {
		return this.aFloat229;
	}

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "(IIIII)V")
	@Override
	protected final void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!kp;Lclient!vt;III)Lclient!ica;")
	public abstract Interface9 method6400(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tu", name = "q", descriptor = "(B)V")
	public final void method6401() {
		if (this.anInt7768 == 2) {
			return;
		}
		this.method6344();
		this.method6428(false);
		this.method6349(false);
		this.method6414(false);
		this.method6311(false);
		this.method6299(false, -2, false);
		this.anInt7768 = 2;
	}

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "()Z")
	@Override
	public final boolean method7431() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "x", descriptor = "()Z")
	@Override
	public final boolean method7465() {
		return this.aClass120Array3[3].method7322();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!kp;IIB[B)Lclient!kc;")
	public abstract Interface13 method6402(@OriginalArg(1) Class167 arg0, @OriginalArg(5) byte[] arg1);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z[FIILclient!kp;IIZ)Lclient!ica;")
	protected abstract Interface9 method6403(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class167 arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "(B)V")
	protected abstract void method6404();

	@OriginalMember(owner = "client!tu", name = "Q", descriptor = "(I)V")
	public final void method6405() {
		this.aClass289Array6 = new Class289[this.anInt7760];
		this.aClass205_Sub1Array3 = new Class205_Sub1[this.anInt7760];
		this.anInterface12Array3 = new Interface12[this.anInt7760];
		this.aClass243Array3 = new Class243[this.anInt7760];
		this.aClass289Array5 = new Class289[this.anInt7760];
		for (@Pc(32) int local32 = 0; local32 < this.anInt7760; local32++) {
			this.aClass289Array5[local32] = Static130.aClass289_1;
			this.aClass289Array6[local32] = Static130.aClass289_1;
			this.aClass243Array3[local32] = Static95.aClass243_6;
			this.aClass205_Sub1Array3[local32] = new Class205_Sub1();
		}
		this.aClass3_Sub30Array6 = new Class3_Sub30[this.anInt7783 - 2];
		this.anInterface12_3 = this.method6400(Static468.aClass167_14, Static524.aClass310_16, 1, 1);
		this.method7456(new Class3_Sub22_Sub1(262144));
		this.aClass76_15 = this.method6361(new Class50[] { new Class50(new Class144[] { Static218.aClass144_1, Static218.aClass144_5 }) });
		this.aClass76_17 = this.method6361(new Class50[] { new Class50(new Class144[] { Static218.aClass144_1, Static218.aClass144_3 }) });
		this.aClass76_18 = this.method6361(new Class50[] { new Class50(Static218.aClass144_1), new Class50(Static218.aClass144_3), new Class50(Static218.aClass144_5), new Class50(Static218.aClass144_2) });
		this.aClass76_14 = this.method6361(new Class50[] { new Class50(Static218.aClass144_1), new Class50(Static218.aClass144_3), new Class50(Static218.aClass144_5) });
		this.aClass2_Sub3_25 = new Class2_Sub3(this, 0, 0, false, false);
		this.aClass2_Sub3_27 = new Class2_Sub3(this, 0, 0, true, true);
		this.aClass2_Sub3_30 = new Class2_Sub3(this, 0, 0, false, false);
		this.aClass2_Sub3_23 = new Class2_Sub3(this, 0, 0, true, true);
		this.aClass2_Sub3_24 = new Class2_Sub3(this, 0, 0, false, false);
		this.aClass2_Sub3_29 = new Class2_Sub3(this, 0, 0, true, true);
		this.aClass2_Sub3_21 = new Class2_Sub3(this, 0, 0, false, false);
		this.aClass2_Sub3_22 = new Class2_Sub3(this, 0, 0, true, true);
		this.aClass2_Sub3_28 = new Class2_Sub3(this, 0, 0, false, false);
		this.aClass2_Sub3_26 = new Class2_Sub3(this, 0, 0, true, true);
		this.aClass311_3 = new Class311(this);
		this.anInterface14_7 = this.method6325(true);
		this.method6353();
		this.aClass164_5 = new Class164(this);
		this.aClass120Array3[1] = this.method6425(1);
		this.aClass120Array3[2] = this.method6425(2);
		this.aClass120Array3[4] = this.method6425(4);
		this.aClass120Array3[5] = this.method6425(5);
		this.aClass120Array3[6] = this.method6425(6);
		this.aClass120Array3[7] = this.method6425(7);
		this.aClass120Array3[3] = this.method6425(3);
		this.aClass120Array3[8] = this.method6425(8);
		this.aClass120Array3[9] = this.method6425(9);
		if (!this.aClass120Array3[2].method7322()) {
			this.aClass120Array3[2] = this.method6425(0);
		}
		if (!this.aClass120Array3[4].method7322()) {
			this.aClass120Array3[4] = this.aClass120Array3[2];
		}
		if (!this.aClass120Array3[8].method7322()) {
			this.aClass120Array3[8] = this.aClass120Array3[4];
		}
		if (!this.aClass120Array3[9].method7322()) {
			this.aClass120Array3[9] = this.aClass120Array3[8];
		}
		this.method6362();
		this.F();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method6406(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!tu", name = "R", descriptor = "(I)V")
	protected abstract void method6407();

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "(B)V")
	protected abstract void method6408();

	@OriginalMember(owner = "client!tu", name = "LA", descriptor = "(IIII)V")
	@Override
	public final void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean531) {
			throw new RuntimeException("");
		}
		if (this.anInt7780 != arg0) {
			this.anInt7780 = arg0;
			if (this.aClass120_3 != null) {
				this.aClass120_3.method7330();
			}
		}
		this.anInt7772 = arg1;
		this.anInt7784 = arg3;
		this.anInt7771 = arg2;
		this.method6317();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[Lclient!oj;)V")
	@Override
	public final void method7460(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub30[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub30Array6[local7] = arg1[local7];
		}
		this.anInt7759 = arg0;
		if (this.aClass246_9.method6019()) {
			this.method6368();
		}
	}

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7452() {
		return false;
	}

	@OriginalMember(owner = "client!tu", name = "na", descriptor = "(III[I)V")
	@Override
	public final void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass205_Sub1_16.method5224((float) arg2, (float) arg0, (float) arg1);
		if (local14 < (float) this.anInt7778 || local14 > (float) this.anInt7757) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(57) int local57 = (int) ((float) this.anInt7755 * this.aClass205_Sub1_16.method5218((float) arg0, (float) arg1, (float) arg2) / local14);
		@Pc(75) int local75 = (int) ((float) this.anInt7758 * this.aClass205_Sub1_16.method5237((float) arg1, (float) arg2, (float) arg0) / local14);
		if ((float) local57 >= this.aFloat231 && (float) local57 <= this.aFloat221 && (float) local75 >= this.bf && this.aFloat233 >= (float) local75) {
			arg3[0] = (int) ((float) local57 - this.aFloat231);
			arg3[1] = (int) ((float) local75 - this.bf);
			arg3[2] = (int) local14;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!tu", name = "w", descriptor = "()Z")
	@Override
	public final boolean method7462() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "ha", descriptor = "(F)V")
	@Override
	public final void ha(@OriginalArg(0) float arg0) {
		if (this.aFloat228 != arg0) {
			this.aFloat228 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method6328();
			this.method6300();
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "([Lclient!ba;Lclient!be;Lclient!q;[Lclient!sda;I)V")
	@Override
	public final void method7478(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class4_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method7468(arg0, arg2, arg3, arg4);
		this.method7429(arg1);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public final Class10 method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static26.method785(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!tu", name = "S", descriptor = "(I)[F")
	public final float[] method6409() {
		return this.aFloatArray47;
	}

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "(Z)V")
	private void method6410() {
		this.method6328();
		this.method6390();
		this.method6391();
		this.method6368();
		this.method6351();
		this.method6300();
		this.method6393();
		this.method6386();
		this.method6308();
		this.method6408();
		this.method6429();
		this.method6301();
		this.method6404();
		this.method6298();
		for (@Pc(56) int local56 = this.anInt7760 - 1; local56 >= 0; local56--) {
			this.method6388(local56);
			this.method6383();
			this.method6338();
			this.method6376();
		}
		this.method6327();
		this.method6346();
		this.method6420();
		this.method6397();
		this.method6313();
	}

	@OriginalMember(owner = "client!tu", name = "T", descriptor = "(I)V")
	private void method6411() {
		this.aFloat231 = this.anInt7751 - this.anInt7781;
		this.bf = this.anInt7750 - this.anInt7776;
		this.aFloat233 = this.anInt7782 - this.anInt7776;
		this.aFloat221 = this.anInt7769 - this.anInt7781;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIZZB)V")
	private void method6412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) boolean local8 = arg4 & this.method7465();
		if (!local8 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			arg0 = 2;
			arg2 = 1;
			arg1 = 0;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt7767 != arg0) {
			if (this.anInt7767 != 0) {
				this.aClass120Array3[Integer.MAX_VALUE & this.anInt7767].method7324();
			}
			if (arg0 == 0) {
				this.aClass120_3 = null;
			} else {
				this.aClass120_3 = this.aClass120Array3[arg0 & Integer.MAX_VALUE];
				this.aClass120_3.method7326(arg3);
				this.aClass120_3.method7331(arg3);
				this.aClass120_3.method7329(arg1, arg2);
			}
			this.anInt7748 = arg2;
			this.anInt7754 = arg1;
			this.anInt7767 = arg0;
		} else if (this.anInt7767 != 0) {
			this.aClass120Array3[Integer.MAX_VALUE & this.anInt7767].method7331(arg3);
			if (this.anInt7754 != arg1 || arg2 != this.anInt7748) {
				this.aClass120Array3[this.anInt7767 & Integer.MAX_VALUE].method7329(arg1, arg2);
				this.anInt7754 = arg1;
				this.anInt7748 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!km;ZIB)V")
	protected abstract void method6413(@OriginalArg(0) Class166 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(ZZ)V")
	public final void method6414(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean526 != arg0) {
			this.aBoolean526 = arg0;
			this.method6386();
			this.anInt7768 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!km;I)V")
	public final void method6415(@OriginalArg(1) Class166 arg0, @OriginalArg(2) int arg1) {
		this.method6358(false, arg1, arg0, false);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLclient!iu;)V")
	public final void method6416(@OriginalArg(1) Interface12 arg0) {
		if (this.anInterface12Array3[this.anInt7746] == arg0) {
			return;
		}
		this.anInterface12Array3[this.anInt7746] = arg0;
		if (arg0 == null) {
			this.method6396();
		} else {
			arg0.method6469();
		}
		this.anInt7768 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!tu", name = "U", descriptor = "(I)I")
	public final int method6417() {
		return this.anInt7746;
	}

	@OriginalMember(owner = "client!tu", name = "t", descriptor = "(B)V")
	protected abstract void method6418();

	@OriginalMember(owner = "client!tu", name = "JA", descriptor = "(I)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0) {
		this.anInt7761 = 0;
		while (arg0 > 1) {
			this.anInt7761++;
			arg0 >>= 0x1;
		}
		this.anInt7770 = 0x1 << this.anInt7761;
	}

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "(B)V")
	private void method6419() {
		this.aBoolean533 = false;
		if (this.aClass246_9 == Static232.aClass246_4) {
			this.method6330();
			this.method6306();
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIIF)Lclient!oj;")
	@Override
	public final Class3_Sub30 method7475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub30_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!tu", name = "V", descriptor = "(I)V")
	protected abstract void method6420();

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!af;Z)Lclient!xa;")
	@Override
	public final Class119 method7425(@OriginalArg(0) Class9 arg0) {
		@Pc(138) Class119 local138;
		if (arg0.anInt478 == 0 || arg0.anInt481 == 0) {
			local138 = this.method7483(new int[1], 1, 1, 1);
		} else {
			@Pc(24) int[] local24 = new int[arg0.anInt478 * arg0.anInt481];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(33) int local33;
			@Pc(37) int local37;
			if (arg0.aByteArray12 == null) {
				for (local33 = 0; local33 < arg0.anInt481; local33++) {
					for (local37 = 0; local37 < arg0.anInt478; local37++) {
						@Pc(50) int local50 = arg0.anIntArray90[arg0.aByteArray13[local26++] & 0xFF];
						local24[local28++] = local50 == 0 ? 0 : local50 | 0xFF000000;
					}
				}
			} else {
				for (local33 = 0; local33 < arg0.anInt481; local33++) {
					for (local37 = 0; local37 < arg0.anInt478; local37++) {
						local24[local28++] = arg0.aByteArray12[local26] << 24 | arg0.anIntArray90[arg0.aByteArray13[local26] & 0xFF];
						local26++;
					}
				}
			}
			local138 = this.method7483(local24, arg0.anInt478, arg0.anInt478, arg0.anInt481);
		}
		local138.EA(arg0.anInt476, arg0.anInt477, arg0.anInt480, arg0.anInt479);
		return local138;
	}

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "()Z")
	@Override
	public final boolean method7461() {
		return this.aBoolean532;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BZI)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method6421(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap5.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(BZ)Lclient!cca;")
	public abstract Interface3 method6422(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!tu", name = "W", descriptor = "(I)V")
	public final void method6423() {
		if (this.aClass246_9 == Static260.aClass246_7) {
			return;
		}
		@Pc(16) Class246 local16 = this.aClass246_9;
		this.aClass246_9 = Static260.aClass246_7;
		if (local16.method6019()) {
			this.method6364();
		}
		this.anInt7768 &= 0xFFFFFFE0;
		this.aFloatArray50 = this.aFloatArray47;
	}

	@OriginalMember(owner = "client!tu", name = "ca", descriptor = "(IIII)V")
	@Override
	public final void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt7674 - 1 && arg1 <= 0 && arg3 >= this.anInt7640 - 1) {
			this.F();
			return;
		}
		this.anInt7769 = arg2 > this.anInt7674 ? 0 : arg2;
		this.anInt7782 = arg3 > this.anInt7674 ? 0 : arg3;
		this.anInt7750 = arg1 >= 0 ? arg1 : 0;
		this.anInt7751 = arg0 >= 0 ? arg0 : 0;
		if (!this.aBoolean545) {
			this.aBoolean545 = true;
			this.method6418();
		}
		this.method6407();
		this.method6411();
	}

	@OriginalMember(owner = "client!tu", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public final boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass205_Sub1_16.method5224((float) arg2, (float) arg0, (float) arg1);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass205_Sub1_16.method5224((float) arg5, (float) arg3, (float) arg4);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if (local14 < (float) this.anInt7778 && local31 < (float) this.anInt7778 || !(!(local14 > (float) this.anInt7757) || !((float) this.anInt7757 < local31))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt7755 * this.aClass205_Sub1_16.method5218((float) arg0, (float) arg1, (float) arg2) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt7755 * this.aClass205_Sub1_16.method5218((float) arg3, (float) arg4, (float) arg5) / local31);
		if (this.aFloat231 > (float) local81 && (float) local99 < this.aFloat231 || (float) local81 > this.aFloat221 && (float) local99 > this.aFloat221) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt7758 * this.aClass205_Sub1_16.method5237((float) arg1, (float) arg2, (float) arg0) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt7758 * this.aClass205_Sub1_16.method5237((float) arg4, (float) arg5, (float) arg3) / local31);
			return (!((float) local143 < this.bf) || !(this.bf > (float) local161)) && (!((float) local143 > this.aFloat233) || !((float) local161 > this.aFloat233));
		}
	}

	@OriginalMember(owner = "client!tu", name = "X", descriptor = "(I)V")
	private void method6424() {
		if (Static204.aClass246_8 == this.aClass246_9) {
			return;
		}
		@Pc(14) Class246 local14 = this.aClass246_9;
		this.aClass246_9 = Static204.aClass246_8;
		if (!local14.method6019()) {
			this.method6364();
		}
		this.method6326();
		this.aFloatArray50 = this.aFloatArray52;
		this.method6306();
		this.anInt7768 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "(II)Lclient!ic;")
	protected Class120 method6425(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class120_Sub6(this);
		} else if (arg0 == 1) {
			return new Class120_Sub7(this);
		} else if (arg0 == 2) {
			return new Class120_Sub1(this, this.aClass164_5);
		} else if (arg0 == 7) {
			return new Class120_Sub4(this);
		} else {
			return new Class120_Sub9(this);
		}
	}

	@OriginalMember(owner = "client!tu", name = "Y", descriptor = "(I)V")
	protected abstract void method6426();

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "(Z)Lclient!nh;")
	public final Class205_Sub1 method6427() {
		return this.aClass205_Sub1_18;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(ZI)V")
	public final void method6428(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean544) {
			this.aBoolean544 = arg0;
			this.method6408();
			this.anInt7768 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!tu", name = "v", descriptor = "(B)V")
	protected abstract void method6429();

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7451(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas11) {
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
			@Pc(53) Object local53 = this.method6406(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable4.put(arg0, local53);
		}
	}
}
