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

@OriginalClass("client!ln")
public abstract class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable3;

	@OriginalMember(owner = "client!ln", name = "ob", descriptor = "Lclient!wt;")
	protected Class376 aClass376_5;

	@OriginalMember(owner = "client!ln", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!ln", name = "Qb", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!ln", name = "Od", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!ln", name = "Yd", descriptor = "I")
	public int anInt4891;

	@OriginalMember(owner = "client!ln", name = "be", descriptor = "I")
	public int anInt4893;

	@OriginalMember(owner = "client!ln", name = "ce", descriptor = "I")
	protected int anInt4894;

	@OriginalMember(owner = "client!ln", name = "ie", descriptor = "I")
	protected int anInt4895;

	@OriginalMember(owner = "client!ln", name = "ne", descriptor = "F")
	private float aFloat81;

	@OriginalMember(owner = "client!ln", name = "oe", descriptor = "Lclient!fha;")
	private Class40_Sub1 aClass40_Sub1_3;

	@OriginalMember(owner = "client!ln", name = "qe", descriptor = "Z")
	protected boolean aBoolean346;

	@OriginalMember(owner = "client!ln", name = "ye", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!ln", name = "ze", descriptor = "I")
	public int anInt4897;

	@OriginalMember(owner = "client!ln", name = "De", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!ln", name = "Ie", descriptor = "Z")
	public boolean aBoolean352;

	@OriginalMember(owner = "client!ln", name = "Je", descriptor = "I")
	public int anInt4902;

	@OriginalMember(owner = "client!ln", name = "Pe", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!ln", name = "Qe", descriptor = "I")
	private int anInt4904;

	@OriginalMember(owner = "client!ln", name = "Ve", descriptor = "[Lclient!ke;")
	private Interface12[] anInterface12Array3;

	@OriginalMember(owner = "client!ln", name = "We", descriptor = "I")
	protected int anInt4907;

	@OriginalMember(owner = "client!ln", name = "af", descriptor = "[Lclient!mk;")
	protected Class207[] aClass207Array3;

	@OriginalMember(owner = "client!ln", name = "gf", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!ln", name = "hf", descriptor = "Lclient!cw;")
	private Class61 aClass61_3;

	@OriginalMember(owner = "client!ln", name = "of", descriptor = "Z")
	public boolean aBoolean357;

	@OriginalMember(owner = "client!ln", name = "pf", descriptor = "I")
	protected int anInt4913;

	@OriginalMember(owner = "client!ln", name = "xf", descriptor = "[Lclient!ada;")
	protected Class8_Sub1[] aClass8_Sub1Array4;

	@OriginalMember(owner = "client!ln", name = "yf", descriptor = "Z")
	protected boolean aBoolean359;

	@OriginalMember(owner = "client!ln", name = "Cf", descriptor = "[Lclient!bga;")
	protected Class34[] aClass34Array5;

	@OriginalMember(owner = "client!ln", name = "Df", descriptor = "Lclient!ah;")
	private Class11 aClass11_3;

	@OriginalMember(owner = "client!ln", name = "Pf", descriptor = "[Lclient!li;")
	protected Class54_Sub3[] aClass54_Sub3Array3;

	@OriginalMember(owner = "client!ln", name = "Tf", descriptor = "I")
	public int anInt4928;

	@OriginalMember(owner = "client!ln", name = "Uf", descriptor = "Z")
	public boolean aBoolean363;

	@OriginalMember(owner = "client!ln", name = "Vf", descriptor = "F")
	private float aFloat95;

	@OriginalMember(owner = "client!ln", name = "Xf", descriptor = "I")
	protected int anInt4930;

	@OriginalMember(owner = "client!ln", name = "Yf", descriptor = "Lclient!ke;")
	public Interface12 anInterface12_3;

	@OriginalMember(owner = "client!ln", name = "Zf", descriptor = "[Lclient!bga;")
	protected Class34[] aClass34Array6;

	@OriginalMember(owner = "client!ln", name = "bg", descriptor = "I")
	public int anInt4932;

	@OriginalMember(owner = "client!ln", name = "cg", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!ln", name = "eg", descriptor = "I")
	private int anInt4933;

	@OriginalMember(owner = "client!ln", name = "fg", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!ln", name = "gg", descriptor = "Lclient!el;")
	private Interface4 anInterface4_13;

	@OriginalMember(owner = "client!ln", name = "hg", descriptor = "Lclient!eea;")
	public Class83_Sub1 aClass83_Sub1_21;

	@OriginalMember(owner = "client!ln", name = "ig", descriptor = "Lclient!eea;")
	public Class83_Sub1 aClass83_Sub1_22;

	@OriginalMember(owner = "client!ln", name = "jg", descriptor = "Lclient!eea;")
	public Class83_Sub1 aClass83_Sub1_23;

	@OriginalMember(owner = "client!ln", name = "kg", descriptor = "Lclient!f;")
	public Class94 aClass94_16;

	@OriginalMember(owner = "client!ln", name = "lg", descriptor = "Lclient!eea;")
	public Class83_Sub1 aClass83_Sub1_24;

	@OriginalMember(owner = "client!ln", name = "mg", descriptor = "Lclient!f;")
	private Class94 aClass94_17;

	@OriginalMember(owner = "client!ln", name = "ng", descriptor = "Lclient!eea;")
	public Class83_Sub1 aClass83_Sub1_25;

	@OriginalMember(owner = "client!ln", name = "og", descriptor = "Lclient!el;")
	private Interface4 anInterface4_14;

	@OriginalMember(owner = "client!ln", name = "pg", descriptor = "Lclient!eea;")
	public Class83_Sub1 aClass83_Sub1_26;

	@OriginalMember(owner = "client!ln", name = "qg", descriptor = "Lclient!kga;")
	private Interface13 anInterface13_5;

	@OriginalMember(owner = "client!ln", name = "rg", descriptor = "Lclient!f;")
	private Class94 aClass94_18;

	@OriginalMember(owner = "client!ln", name = "sg", descriptor = "Lclient!f;")
	public Class94 aClass94_19;

	@OriginalMember(owner = "client!ln", name = "tg", descriptor = "Lclient!eea;")
	public Class83_Sub1 aClass83_Sub1_27;

	@OriginalMember(owner = "client!ln", name = "ug", descriptor = "Lclient!eea;")
	public Class83_Sub1 aClass83_Sub1_28;

	@OriginalMember(owner = "client!ln", name = "wg", descriptor = "Lclient!f;")
	public Class94 aClass94_20;

	@OriginalMember(owner = "client!ln", name = "xg", descriptor = "Lclient!eea;")
	public Class83_Sub1 aClass83_Sub1_29;

	@OriginalMember(owner = "client!ln", name = "yg", descriptor = "Lclient!el;")
	private Interface4 anInterface4_15;

	@OriginalMember(owner = "client!ln", name = "zg", descriptor = "Lclient!f;")
	private Class94 aClass94_21;

	@OriginalMember(owner = "client!ln", name = "Ag", descriptor = "Lclient!eea;")
	public Class83_Sub1 aClass83_Sub1_30;

	@OriginalMember(owner = "client!ln", name = "Bg", descriptor = "Lclient!f;")
	public Class94 aClass94_22;

	@OriginalMember(owner = "client!ln", name = "Cg", descriptor = "I")
	private int anInt4934;

	@OriginalMember(owner = "client!ln", name = "Dg", descriptor = "Z")
	protected boolean aBoolean364;

	@OriginalMember(owner = "client!ln", name = "lc", descriptor = "Lclient!bq;")
	private final Class43 aClass43_29 = new Class43();

	@OriginalMember(owner = "client!ln", name = "Xd", descriptor = "Z")
	protected boolean aBoolean343 = true;

	@OriginalMember(owner = "client!ln", name = "Zd", descriptor = "Lclient!li;")
	protected final Class54_Sub3 aClass54_Sub3_15 = new Class54_Sub3();

	@OriginalMember(owner = "client!ln", name = "de", descriptor = "Lclient!li;")
	public Class54_Sub3 aClass54_Sub3_16 = new Class54_Sub3();

	@OriginalMember(owner = "client!ln", name = "ee", descriptor = "Lclient!li;")
	public final Class54_Sub3 aClass54_Sub3_17 = new Class54_Sub3();

	@OriginalMember(owner = "client!ln", name = "fe", descriptor = "Lclient!li;")
	protected final Class54_Sub3 aClass54_Sub3_18 = new Class54_Sub3();

	@OriginalMember(owner = "client!ln", name = "ge", descriptor = "Lclient!li;")
	private final Class54_Sub3 aClass54_Sub3_19 = new Class54_Sub3();

	@OriginalMember(owner = "client!ln", name = "he", descriptor = "Lclient!li;")
	private final Class54_Sub3 aClass54_Sub3_20 = new Class54_Sub3();

	@OriginalMember(owner = "client!ln", name = "me", descriptor = "Lclient!mo;")
	protected Class211 aClass211_5 = Static364.aClass211_7;

	@OriginalMember(owner = "client!ln", name = "ke", descriptor = "I")
	private int anInt4896 = -1;

	@OriginalMember(owner = "client!ln", name = "le", descriptor = "[Lclient!ah;")
	private final Class11[] aClass11Array3 = new Class11[10];

	@OriginalMember(owner = "client!ln", name = "te", descriptor = "F")
	public float aFloat82 = 1.0F;

	@OriginalMember(owner = "client!ln", name = "we", descriptor = "Z")
	protected boolean aBoolean350 = true;

	@OriginalMember(owner = "client!ln", name = "xe", descriptor = "Z")
	private boolean aBoolean351 = false;

	@OriginalMember(owner = "client!ln", name = "Ke", descriptor = "F")
	public float aFloat87 = 3584.0F;

	@OriginalMember(owner = "client!ln", name = "Ce", descriptor = "[F")
	public final float[] aFloatArray45 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ln", name = "Me", descriptor = "Z")
	private boolean aBoolean353 = false;

	@OriginalMember(owner = "client!ln", name = "Fe", descriptor = "F")
	public float aFloat86 = 1.0F;

	@OriginalMember(owner = "client!ln", name = "ve", descriptor = "Z")
	private boolean aBoolean349 = false;

	@OriginalMember(owner = "client!ln", name = "je", descriptor = "Z")
	private boolean aBoolean344 = false;

	@OriginalMember(owner = "client!ln", name = "Xe", descriptor = "I")
	private int anInt4908 = 0;

	@OriginalMember(owner = "client!ln", name = "mf", descriptor = "Z")
	protected boolean aBoolean356 = false;

	@OriginalMember(owner = "client!ln", name = "nf", descriptor = "F")
	public float aFloat92 = 3584.0F;

	@OriginalMember(owner = "client!ln", name = "ff", descriptor = "[F")
	private final float[] aFloatArray48 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ln", name = "Ze", descriptor = "[F")
	private final float[] aFloatArray47 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ln", name = "Ne", descriptor = "[F")
	private final float[] aFloatArray46 = new float[16];

	@OriginalMember(owner = "client!ln", name = "vf", descriptor = "[F")
	private final float[] aFloatArray51 = new float[16];

	@OriginalMember(owner = "client!ln", name = "Ue", descriptor = "F")
	public float aFloat90 = -1.0F;

	@OriginalMember(owner = "client!ln", name = "uf", descriptor = "I")
	private int anInt4916 = 0;

	@OriginalMember(owner = "client!ln", name = "zf", descriptor = "I")
	public int anInt4917 = 0;

	@OriginalMember(owner = "client!ln", name = "df", descriptor = "I")
	public int anInt4909 = 3;

	@OriginalMember(owner = "client!ln", name = "Ye", descriptor = "Z")
	protected boolean aBoolean354 = false;

	@OriginalMember(owner = "client!ln", name = "He", descriptor = "I")
	protected int anInt4901 = 0;

	@OriginalMember(owner = "client!ln", name = "Bf", descriptor = "I")
	public int anInt4918 = 512;

	@OriginalMember(owner = "client!ln", name = "jf", descriptor = "[F")
	public final float[] aFloatArray49 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!ln", name = "ue", descriptor = "[F")
	private final float[] aFloatArray44 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ln", name = "Ee", descriptor = "F")
	public float aFloat85 = 1.0F;

	@OriginalMember(owner = "client!ln", name = "rf", descriptor = "F")
	public float aFloat93 = 1.0F;

	@OriginalMember(owner = "client!ln", name = "Re", descriptor = "I")
	protected final int anInt4905 = 0;

	@OriginalMember(owner = "client!ln", name = "ef", descriptor = "I")
	private int anInt4910 = -1;

	@OriginalMember(owner = "client!ln", name = "Mf", descriptor = "Lclient!rb;")
	protected Class283 aClass283_3 = Static493.aClass283_6;

	@OriginalMember(owner = "client!ln", name = "Jf", descriptor = "Z")
	protected boolean aBoolean361 = true;

	@OriginalMember(owner = "client!ln", name = "Gf", descriptor = "I")
	public int anInt4920 = 0;

	@OriginalMember(owner = "client!ln", name = "Kf", descriptor = "I")
	public int anInt4922 = 0;

	@OriginalMember(owner = "client!ln", name = "wf", descriptor = "Z")
	protected boolean aBoolean358 = false;

	@OriginalMember(owner = "client!ln", name = "Ef", descriptor = "F")
	private float aFloat94 = 1.0F;

	@OriginalMember(owner = "client!ln", name = "Sf", descriptor = "I")
	protected int anInt4927 = 0;

	@OriginalMember(owner = "client!ln", name = "kf", descriptor = "I")
	private int anInt4911 = 1;

	@OriginalMember(owner = "client!ln", name = "qf", descriptor = "I")
	public int anInt4914 = 512;

	@OriginalMember(owner = "client!ln", name = "Se", descriptor = "I")
	protected int anInt4906 = 3584;

	@OriginalMember(owner = "client!ln", name = "If", descriptor = "I")
	public int anInt4921 = 128;

	@OriginalMember(owner = "client!ln", name = "sf", descriptor = "I")
	public int anInt4915 = -1;

	@OriginalMember(owner = "client!ln", name = "re", descriptor = "Z")
	private boolean aBoolean347 = false;

	@OriginalMember(owner = "client!ln", name = "Ge", descriptor = "I")
	private int anInt4900 = 0;

	@OriginalMember(owner = "client!ln", name = "bf", descriptor = "I")
	private int bf = -1;

	@OriginalMember(owner = "client!ln", name = "Hf", descriptor = "[F")
	private final float[] aFloatArray52 = new float[16];

	@OriginalMember(owner = "client!ln", name = "tf", descriptor = "[F")
	protected float[] aFloatArray50 = this.aFloatArray48;

	@OriginalMember(owner = "client!ln", name = "lf", descriptor = "I")
	protected int anInt4912 = 0;

	@OriginalMember(owner = "client!ln", name = "Of", descriptor = "I")
	private int anInt4924 = 0;

	@OriginalMember(owner = "client!ln", name = "Lf", descriptor = "Z")
	protected boolean aBoolean362 = true;

	@OriginalMember(owner = "client!ln", name = "se", descriptor = "Z")
	protected boolean aBoolean348 = true;

	@OriginalMember(owner = "client!ln", name = "Be", descriptor = "I")
	protected int anInt4899 = 0;

	@OriginalMember(owner = "client!ln", name = "Af", descriptor = "Z")
	protected boolean aBoolean360 = false;

	@OriginalMember(owner = "client!ln", name = "Te", descriptor = "F")
	public float aFloat89 = -1.0F;

	@OriginalMember(owner = "client!ln", name = "Qf", descriptor = "I")
	private int anInt4925 = 16777215;

	@OriginalMember(owner = "client!ln", name = "pe", descriptor = "Z")
	protected boolean aBoolean345 = true;

	@OriginalMember(owner = "client!ln", name = "Ff", descriptor = "I")
	public int anInt4919 = 8;

	@OriginalMember(owner = "client!ln", name = "cf", descriptor = "Z")
	private boolean aBoolean355 = false;

	@OriginalMember(owner = "client!ln", name = "Oe", descriptor = "I")
	public int anInt4903 = -1;

	@OriginalMember(owner = "client!ln", name = "Rf", descriptor = "I")
	protected int anInt4926 = 0;

	@OriginalMember(owner = "client!ln", name = "Nf", descriptor = "I")
	protected final int anInt4923 = 0;

	@OriginalMember(owner = "client!ln", name = "ag", descriptor = "I")
	public int anInt4931 = 50;

	@OriginalMember(owner = "client!ln", name = "Le", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream5 = new Stream();

	@OriginalMember(owner = "client!ln", name = "vg", descriptor = "Lclient!li;")
	private final Class54_Sub3 aClass54_Sub3_21 = new Class54_Sub3();

	@OriginalMember(owner = "client!ln", name = "zb", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas8;

	@OriginalMember(owner = "client!ln", name = "qb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!ln", name = "Jc", descriptor = "Lclient!oh;")
	protected final Class237 aClass237_58;

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "Ljava/lang/Object;")
	protected final Object anObject13;

	@OriginalMember(owner = "client!ln", name = "V", descriptor = "Ljava/lang/Object;")
	private Object anObject14;

	@OriginalMember(owner = "client!ln", name = "Wf", descriptor = "I")
	protected final int anInt4929;

	@OriginalMember(owner = "client!ln", name = "Ae", descriptor = "I")
	public final int anInt4898;

	@OriginalMember(owner = "client!ln", name = "Ic", descriptor = "I")
	private int anInt4826;

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
	public int anInt4732;

	@OriginalMember(owner = "client!ln", name = "Lb", descriptor = "I")
	private int anInt4781;

	@OriginalMember(owner = "client!ln", name = "ub", descriptor = "I")
	public int anInt4765;

	@OriginalMember(owner = "client!ln", name = "dg", descriptor = "Lclient!kf;")
	private final Class175 aClass175_3;

	@OriginalMember(owner = "client!ln", name = "vc", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!oh;II)V")
	protected Class16_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) Class237 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.aCanvas7 = this.aCanvas8 = arg0;
		this.aClass237_58 = arg3;
		this.anObject14 = this.anObject13 = arg1;
		this.anInt4929 = arg4;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt4898 = arg5;
		this.anInt4732 = this.anInt4826 = local307.height;
		this.anInt4765 = this.anInt4781 = local307.width;
		Static93.method2184(false, true);
		if (super.anInterface2_12 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt4898);
			this.aClass175_3 = null;
		} else {
			this.aClass175_3 = new Class175(this, super.anInterface2_12);
			this.aNativeInterface3 = new NativeInterface(super.anInterface2_12.method4024(), this.anInt4898);
			for (@Pc(352) int local352 = 0; local352 < super.anInterface2_12.method4024(); local352++) {
				@Pc(360) Class218 local360 = super.anInterface2_12.method4027(local352);
				if (local360 != null) {
					this.aNativeInterface3.initTextureMetrics(local352, local360.aByte63, local360.aByte68);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt4901 < arg0) {
			local5 = true;
			this.anInt4901 = arg0;
		}
		if (this.anInt4927 > arg2) {
			this.anInt4927 = arg2;
			local5 = true;
		}
		if (arg1 > this.anInt4926) {
			this.anInt4926 = arg1;
			local5 = true;
		}
		if (this.anInt4912 > arg3) {
			this.anInt4912 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean364) {
			this.aBoolean364 = true;
			this.method3987();
		}
		this.method3973();
		this.method3926();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!wd;Lclient!jm;Z)Z")
	public abstract boolean method3874(@OriginalArg(0) Class366 arg0, @OriginalArg(1) Class160 arg1);

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)V")
	private void method3875() {
		if (this.aClass11_3 != null) {
			this.aClass11_3.method7363();
		}
		this.method3892();
	}

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "()Lclient!dfa;")
	@Override
	public final Class54 method6076() {
		return new Class54_Sub3();
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(B)V")
	private void method3876() {
		this.method3983(this.anInterface4_13, 0);
		this.method3967(this.aClass94_18);
		this.method3891(0, 1, Static449.aClass342_2);
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(Z)V")
	protected abstract void method3877();

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([I)V")
	@Override
	public final void method6087(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4765;
		arg0[1] = this.anInt4732;
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "(II)Lclient!ah;")
	protected Class11 method3878(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class11_Sub4(this);
		} else if (arg0 == 1) {
			return new Class11_Sub3(this);
		} else if (arg0 == 2) {
			return new Class11_Sub9(this, this.aClass376_5);
		} else if (arg0 == 7) {
			return new Class11_Sub5(this);
		} else {
			return new Class11_Sub6(this);
		}
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)V")
	protected abstract void method3879();

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method6057() {
	}

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "()Z")
	@Override
	public final boolean method6123() {
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(B)V")
	protected abstract void method3880();

	@OriginalMember(owner = "client!ln", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean363) {
			throw new RuntimeException("");
		}
		this.anInt4910 = arg2;
		this.anInt4916 = arg3;
		this.anInt4933 = arg0;
		this.anInt4896 = arg1;
		if (this.aBoolean353) {
			this.aClass11Array3[3].method7364();
			this.aClass11Array3[3].method7363();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method3881(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
	protected abstract void method3882();

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIII)Lclient!km;")
	@Override
	public final Class40 method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class40_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		if (local10 == 0.0F && local17 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(38) float local38 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
			local17 *= local38;
			local10 *= local38;
		}
		if (!this.method3982(0.0F, (float) arg0, (float) arg2 + local10, local17 + (float) arg3, 0.0F, (float) arg1)) {
			return;
		}
		this.method3897();
		this.method3939(arg4);
		this.method3946(0, Static190.aClass265_8);
		this.method3950(0, Static190.aClass265_8);
		this.method3956(arg5);
		this.method3976();
		this.method3919(false);
		this.method3876();
		this.method3919(true);
		this.method3950(0, Static625.aClass265_10);
		this.method3946(0, Static625.aClass265_10);
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "(B)V")
	protected abstract void method3883();

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!uk;IIII)Lclient!ka;")
	@Override
	public final Class83 method6094(@OriginalArg(0) Class344 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class83_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "(I)V")
	private void method3884() {
		if (this.aClass283_3 == Static625.aClass283_7) {
			return;
		}
		@Pc(6) Class283 local6 = this.aClass283_3;
		this.aClass283_3 = Static625.aClass283_7;
		if (local6.method7040()) {
			this.method4002();
		}
		this.method3954();
		this.aFloatArray50 = this.aFloatArray52;
		this.method3942();
		this.anInt4904 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "(B)Lclient!li;")
	public final Class54_Sub3 method3885() {
		if (!this.aBoolean349) {
			this.aClass54_Sub3_20.method5163(this.aClass54_Sub3_18, this.aClass54_Sub3_15);
			this.aBoolean349 = true;
		}
		return this.aClass54_Sub3_20;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method6096(@OriginalArg(0) Class8_Sub30 arg0) {
		this.aNativeHeap3 = ((Class8_Sub30_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer5 = this.aNativeHeap3.a(32768, false);
	}

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "(I)V")
	@Override
	public final void method6134(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "()Z")
	@Override
	public final boolean method6091() {
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZIZLclient!wd;[FI)Lclient!oq;")
	public final Interface20 method3886(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class366 arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4) {
		return this.method3978(arg1, arg3, arg2, arg0, arg4);
	}

	@OriginalMember(owner = "client!ln", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt4934;
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(Z)V")
	private void method3887() {
		this.anInterface4_14 = this.method3988(false);
		this.anInterface4_14.method6507(12, 3096);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface4_14.method6506();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method3981(local28);
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
				if (this.anInterface4_14.method6505()) {
					break;
				}
			}
		}
		this.aClass94_17 = this.method3994(new Class325[] { new Class325(Static589.aClass349_1) });
	}

	@OriginalMember(owner = "client!ln", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6093(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "(I)V")
	public final void method3888() {
		this.method3972();
		this.method3942();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLclient!ke;)V")
	public final void method3889(@OriginalArg(1) Interface12 arg0) {
		if (arg0 == this.anInterface12Array3[this.anInt4899]) {
			return;
		}
		this.anInterface12Array3[this.anInt4899] = arg0;
		if (arg0 == null) {
			this.method3880();
		} else {
			arg0.method8281();
		}
		this.anInt4904 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "(B)V")
	private void method3890() {
		if (this.aBoolean347) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray46;
		@Pc(17) float local17 = (float) (-this.anInt4917 * this.anInt4931) / (float) this.anInt4918;
		@Pc(31) float local31 = (float) ((this.anInt4765 - this.anInt4917) * this.anInt4931) / (float) this.anInt4918;
		@Pc(42) float local42 = (float) (this.anInt4920 * this.anInt4931) / (float) this.anInt4914;
		@Pc(56) float local56 = (float) (this.anInt4931 * (this.anInt4920 - this.anInt4732)) / (float) this.anInt4914;
		if (local31 == local17 || local56 == local42) {
			local5[2] = 0.0F;
			local5[4] = 0.0F;
			local5[14] = 0.0F;
			local5[0] = 1.0F;
			local5[3] = 0.0F;
			local5[6] = 0.0F;
			local5[11] = 0.0F;
			local5[10] = 1.0F;
			local5[8] = 0.0F;
			local5[12] = 0.0F;
			local5[9] = 0.0F;
			local5[7] = 0.0F;
			local5[1] = 0.0F;
			local5[13] = 0.0F;
			local5[15] = 1.0F;
			local5[5] = 1.0F;
		} else {
			@Pc(136) float local136 = (float) this.anInt4931 * 2.0F;
			local5[9] = (local56 + local42) / (local42 - local56);
			local5[7] = 0.0F;
			local5[6] = 0.0F;
			local5[11] = -1.0F;
			local5[12] = 0.0F;
			local5[15] = 0.0F;
			local5[1] = 0.0F;
			local5[10] = this.aFloat95 = (float) this.anInt4906 / (float) (this.anInt4931 - this.anInt4906);
			local5[4] = 0.0F;
			local5[14] = this.aFloat81 = (float) (this.anInt4906 * this.anInt4931) / (float) (this.anInt4931 - this.anInt4906);
			local5[3] = 0.0F;
			local5[0] = local136 / (local31 - local17);
			local5[2] = 0.0F;
			local5[5] = local136 / (local42 - local56);
			local5[13] = 0.0F;
			local5[8] = (local31 + local17) / (local31 - local17);
		}
		this.method3991();
		this.aBoolean347 = true;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(II)I")
	@Override
	public final int method6121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "()Z")
	@Override
	public final boolean method6055() {
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean361 = arg0;
		this.method3974();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIILclient!uh;)V")
	public abstract void method3891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class342 arg2);

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "(B)V")
	protected abstract void method3892();

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!ffa;)V")
	public abstract void method3893(@OriginalArg(1) Class100 arg0);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IF)V")
	public final void method3894(@OriginalArg(1) float arg0) {
		if (this.aFloat94 != arg0) {
			this.aFloat94 = arg0;
			this.method4003();
		}
	}

	@OriginalMember(owner = "client!ln", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "(I)V")
	private void method3895() {
		this.method3941();
		this.method3971();
		this.method3911();
		this.method3909();
		this.method3999();
		this.method3968();
		this.method3879();
		this.method3984();
		this.method3974();
		this.method3962();
		this.method3892();
		this.method3959();
		this.method3929();
		this.method4006();
		for (@Pc(54) int local54 = this.anInt4897 - 1; local54 >= 0; local54--) {
			this.method3899(local54);
			this.method3955();
			this.method3907();
			this.method3930();
		}
		this.method3964();
		this.method3882();
		this.method3883();
		this.method3960();
		this.method3932();
	}

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "(I)V")
	protected final void method3896() {
		@Pc(9) Enumeration local9 = this.aHashtable3.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method3881(local15, this.aHashtable3.get(local15));
		}
		this.anInterface4_15.method6496();
		this.anInterface4_13.method6496();
		this.anInterface4_14.method6496();
		this.aClass83_Sub1_30.method2700();
		this.aClass83_Sub1_27.method2700();
		this.aClass83_Sub1_22.method2700();
		this.aClass83_Sub1_29.method2700();
		this.aClass83_Sub1_24.method2700();
		this.aClass61_3.method2093();
		this.anInterface13_5.method6496();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!ur;[Lclient!g;Z)Lclient!da;")
	@Override
	public final Class27 method6088(@OriginalArg(0) Class345 arg0, @OriginalArg(1) Class111[] arg1) {
		return new Class27_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "(B)V")
	private void method3897() {
		if (this.anInt4904 == 1) {
			return;
		}
		this.method3884();
		this.method3903(false);
		this.method3966(false);
		this.method3933(false);
		this.method3916(false);
		this.method3957(false, false, -2);
		this.method3937(1);
		this.method3889(this.anInterface12_3);
		this.anInt4904 = 1;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZB[[I)Lclient!vq;")
	public abstract Interface25 method3898(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[][] arg2);

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "(II)V")
	public final void method3899(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt4899) {
			this.anInt4899 = arg0;
			this.method3877();
		}
	}

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "(B)V")
	public final void method3900() {
		if (this.anInt4904 == 16) {
			return;
		}
		this.method3922();
		this.method3903(true);
		this.method3933(true);
		this.method3916(true);
		this.method3956(1);
		this.anInt4904 = 16;
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method6106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method3998();
		this.method3897();
		this.method3939(arg4);
		this.method3946(0, Static190.aClass265_8);
		this.method3950(0, Static190.aClass265_8);
		this.method3956(arg5);
		this.aClass54_Sub3_15.method5156((float) (arg3 - 1), 1.0F, (float) (arg2 - 1));
		this.aClass54_Sub3_15.method5161(0.0F, (float) arg0 - local7, (float) arg1 - local7);
		this.method3986();
		this.method3919(false);
		this.method3990(Static546.aClass342_4, 4);
		this.method3919(true);
		this.method3950(0, Static625.aClass265_10);
		this.method3946(0, Static625.aClass265_10);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method3901(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "(I)V")
	protected void method3902() {
		this.method3895();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)V")
	public final void method3903(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean359 != arg0) {
			this.aBoolean359 = arg0;
			this.method3962();
			this.anInt4904 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "(I)Lclient!li;")
	public final Class54_Sub3 method3904() {
		return this.aClass54_Sub3_18;
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(Z)I")
	public final int method3905() {
		return this.anInt4910;
	}

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "()Z")
	@Override
	public final boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt4915 && arg1 == this.anInt4903 && arg2 == this.anInt4922) {
			return;
		}
		this.anInt4903 = arg1;
		this.anInt4922 = arg2;
		this.anInt4915 = arg0;
		this.method3875();
		this.method3962();
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)V")
	@Override
	public final void method6111(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "(B)Lclient!li;")
	public final Class54_Sub3 method3906() {
		return this.aClass54_Sub3Array3[this.anInt4899];
	}

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "(I)V")
	protected abstract void method3907();

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!mk;I)V")
	public final void method3908(@OriginalArg(0) Class207 arg0) {
		this.aClass207Array3[this.anInt4899] = arg0;
		this.method3963();
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4931 == arg0 && arg1 == this.anInt4906) {
			return;
		}
		this.anInt4906 = arg1;
		this.anInt4931 = arg0;
		this.method3913();
		this.method4003();
		this.method3875();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class86 method6126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class86_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
	@Override
	public final void method6083() {
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(Z)V")
	protected void method3909() {
		this.anInt4913 = this.anInt4895;
		this.anInt4895 = 0;
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "(Z)V")
	private void method3910() {
		this.anInterface4_15 = this.method3988(false);
		this.anInterface4_15.method6507(28, 140);
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			@Pc(34) Buffer local34 = this.anInterface4_15.method6506();
			if (local34 != null) {
				@Pc(41) Stream local41 = this.method3981(local34);
				if (Stream.c()) {
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
				} else {
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
				}
				local41.b();
				if (this.anInterface4_15.method6505()) {
					break;
				}
			}
		}
		this.aClass94_21 = this.method3994(new Class325[] { new Class325(new Class349[] { Static589.aClass349_1, Static589.aClass349_5, Static589.aClass349_5 }) });
	}

	@OriginalMember(owner = "client!ln", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Interface20 local9 = local6.anInterface20_2;
		this.method3951();
		this.method3889(local9);
		this.method3956(1);
		this.method3924(Static428.aClass34_5, Static428.aClass34_5);
		this.method3946(0, Static190.aClass265_8);
		this.method3939(arg0);
		this.aClass54_Sub3_15.method5156((float) this.anInt4732, 0.0F, (float) this.anInt4765);
		this.method3986();
		this.aClass54_Sub3Array3[0].method5156(local9.method6625((float) this.anInt4732), 1.0F, local9.method6627((float) this.anInt4765));
		this.aClass54_Sub3Array3[0].method5161(0.0F, local9.method6627((float) -arg2), local9.method6625((float) -arg3));
		this.aClass207Array3[0] = Static465.aClass207_6;
		this.method3963();
		this.method3961();
		this.method3930();
		this.method3946(0, Static625.aClass265_10);
	}

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "(B)V")
	protected abstract void method3911();

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)I")
	@Override
	public final int method6109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([BILclient!wd;III)Lclient!ak;")
	public abstract Interface1 method3912(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class366 arg1);

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "(I)V")
	private void method3913() {
		this.aBoolean347 = false;
		this.method3890();
		if (Static290.aClass283_4 == this.aClass283_3) {
			this.method3942();
		}
	}

	@OriginalMember(owner = "client!ln", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3897();
		this.method3939(arg4);
		this.method3946(0, Static190.aClass265_8);
		this.method3950(0, Static190.aClass265_8);
		this.method3956(arg5);
		this.aClass54_Sub3_15.method5156((float) arg3, 1.0F, (float) arg2);
		this.aClass54_Sub3_15.method5142(arg0, arg1, 0);
		this.method3986();
		this.method3919(false);
		this.method3961();
		this.method3919(true);
		this.method3950(0, Static625.aClass265_10);
		this.method3946(0, Static625.aClass265_10);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "()V")
	@Override
	protected void method6053() {
		if (this.aBoolean344) {
			return;
		}
		for (@Pc(9) Class8 local9 = this.aClass43_29.method1422(); local9 != null; local9 = this.aClass43_29.method1426()) {
			((Class8_Sub30_Sub2) local9).method6850();
		}
		@Pc(26) Enumeration local26 = this.aHashtable3.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method3881(local32, this.aHashtable3.get(local32));
		}
		Static266.method4631(false, true);
		this.aNativeInterface3.release();
		this.aBoolean344 = true;
	}

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "()Z")
	@Override
	public final boolean method6115() {
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "A", descriptor = "()Z")
	@Override
	public final boolean method6138() {
		return this.aBoolean346;
	}

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "(I)V")
	protected abstract void method3914();

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "(I)V")
	public final void method3915() {
		if (this.anInt4904 == 4) {
			return;
		}
		this.method3884();
		this.method3903(false);
		this.method3966(false);
		this.method3933(false);
		this.method3916(false);
		this.method3957(false, false, -2);
		this.method3956(1);
		this.method3937(0);
		this.anInt4904 = 4;
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V")
	@Override
	public final void method6099(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)V")
	public final void method3916(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean354 != arg0) {
			this.aBoolean354 = arg0;
			this.method3974();
			this.anInt4904 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(ZI)Lclient!kga;")
	public abstract Interface13 method3917(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "(I)V")
	@Override
	public void method6119(@OriginalArg(0) int arg0) {
		if (this.aClass175_3 != null) {
			this.aClass175_3.method4718();
		}
		this.anInt4932 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "(B)Lclient!li;")
	public final Class54_Sub3 method3918() {
		return this.aClass54_Sub3_19;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(IZ)V")
	public abstract void method3919(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "(I)Lclient!vq;")
	public final Interface25 method3920() {
		return this.aClass40_Sub1_3 == null ? null : this.aClass40_Sub1_3.method1385();
	}

	@OriginalMember(owner = "client!ln", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4918 = arg2;
		this.anInt4917 = arg0;
		this.anInt4920 = arg1;
		this.anInt4914 = arg3;
		this.method4003();
		this.method3913();
		this.method3972();
		this.method3926();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!li;)V")
	public final void method3921(@OriginalArg(1) Class54_Sub3 arg0) {
		this.aClass54_Sub3_15.method5137(arg0);
		this.aBoolean343 = false;
		this.method3992();
	}

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "(B)V")
	private void method3922() {
		if (Static441.aClass283_5 == this.aClass283_3) {
			return;
		}
		@Pc(6) Class283 local6 = this.aClass283_3;
		this.aClass283_3 = Static441.aClass283_5;
		if (!local6.method7040()) {
			this.method4002();
		}
		this.method4001();
		this.aFloatArray50 = this.aFloatArray51;
		this.method3942();
		this.anInt4904 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!jm;Lclient!wd;IBI)Lclient!oq;")
	public abstract Interface20 method3923(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!bga;Lclient!bga;)V")
	public final void method3924(@OriginalArg(1) Class34 arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(5) boolean local5 = false;
		if (this.aClass34Array5[this.anInt4899] != arg1) {
			this.aClass34Array5[this.anInt4899] = arg1;
			local5 = true;
			this.method3955();
		}
		if (arg0 != this.aClass34Array6[this.anInt4899]) {
			this.aClass34Array6[this.anInt4899] = arg0;
			local5 = true;
			this.method3907();
		}
		if (local5) {
			this.anInt4904 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "(Z)I")
	public final int method3925() {
		return this.anInt4933;
	}

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "(I)V")
	private void method3926() {
		this.aFloat83 = this.anInt4926 - this.anInt4920;
		this.aFloat84 = this.anInt4912 - this.anInt4920;
		this.aFloat91 = this.anInt4901 - this.anInt4917;
		this.aFloat97 = this.anInt4927 - this.anInt4917;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(ZI)V")
	public final void method3927(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean362) {
			this.aBoolean362 = arg0;
			this.method3879();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ[IIBII)Lclient!oq;")
	public abstract Interface20 method3928(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "(B)V")
	protected abstract void method3929();

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "()I")
	@Override
	public final int method6074() {
		return this.anInt4907 - 2;
	}

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "(B)V")
	public final void method3930() {
		if (Static42.aClass207_1 != this.aClass207Array3[this.anInt4899]) {
			this.aClass207Array3[this.anInt4899] = Static42.aClass207_1;
			this.aClass54_Sub3Array3[this.anInt4899].method5135();
			this.method3963();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZB)V")
	public final void method3931(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean356) {
			this.aBoolean356 = arg0;
			this.method3911();
		}
	}

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "(B)V")
	protected abstract void method3932();

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6085(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas8) {
			throw new RuntimeException();
		} else if (!this.aHashtable3.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) Object local53 = this.method3993(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable3.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(ZI)V")
	public final void method3933(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean360 != arg0) {
			this.aBoolean360 = arg0;
			this.method3984();
			this.anInt4904 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "(II)V")
	public abstract void method3934(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZII[BILclient!wd;II)Lclient!oq;")
	protected abstract Interface20 method3935(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class366 arg4);

	@OriginalMember(owner = "client!ln", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt4925 != arg0;
		if (local15 || arg1 != this.aFloat89 || arg2 != this.aFloat90) {
			this.aFloat90 = arg2;
			this.aFloat89 = arg1;
			this.anInt4925 = arg0;
			if (local15) {
				this.aFloat86 = (float) (this.anInt4925 & 0xFF) / 255.0F;
				this.aFloat85 = (float) (this.anInt4925 & 0xFF0000) / 1.671168E7F;
				this.aFloat82 = (float) (this.anInt4925 & 0xFF00) / 65280.0F;
				this.method3941();
			}
			this.aNativeInterface3.setSunColour(this.aFloat85, this.aFloat82, this.aFloat86, arg1, arg2);
			this.method3971();
		}
		if (arg3 != this.aFloatArray44[0] || this.aFloatArray44[1] != arg4 || this.aFloatArray44[2] != arg5) {
			this.aFloatArray44[2] = arg5;
			this.aFloatArray44[1] = arg4;
			this.aFloatArray44[0] = arg3;
			this.aFloatArray47[1] = -arg4;
			this.aFloatArray47[0] = -arg3;
			this.aFloatArray47[2] = -arg5;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray45[2] = local153 * arg5;
			this.aFloatArray45[1] = arg4 * local153;
			this.aFloatArray45[0] = arg3 * local153;
			this.aFloatArray49[2] = -this.aFloatArray45[2];
			this.aFloatArray49[1] = -this.aFloatArray45[1];
			this.aFloatArray49[0] = -this.aFloatArray45[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray45[0], this.aFloatArray45[1], this.aFloatArray45[2]);
			this.method3999();
			this.anInt4928 = (int) (arg3 * 256.0F / arg4);
			this.anInt4902 = (int) (arg5 * 256.0F / arg4);
		}
		this.method3968();
	}

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "(I)V")
	protected final void method3936() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable3 != null && !this.aHashtable3.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable3.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method3993(local26));
			}
		}
		this.aHashtable3 = local9;
		this.method3910();
		this.method3965();
		this.method3887();
		this.aClass61_3.method2101(this);
	}

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "(II)V")
	public final void method3937(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method3924(Static428.aClass34_5, Static428.aClass34_5);
		} else if (arg0 == 0) {
			this.method3924(Static402.aClass34_4, Static402.aClass34_4);
		} else if (arg0 == 2) {
			this.method3924(Static428.aClass34_5, Static584.aClass34_6);
		} else if (arg0 == 3) {
			this.method3924(Static402.aClass34_4, Static125.aClass34_3);
			return;
		} else if (arg0 == 4) {
			this.method3924(Static588.aClass34_7, Static588.aClass34_7);
			return;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method6058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "()Z")
	@Override
	public final boolean method6117() {
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "(I)V")
	public final void method3938() {
		if (this.anInt4904 == 8) {
			return;
		}
		this.method4007();
		this.method3903(true);
		this.method3933(true);
		this.method3916(true);
		this.method3956(1);
		this.anInt4904 = 8;
	}

	@OriginalMember(owner = "client!ln", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass54_Sub3_16.method5164((float) arg2, (float) arg0, (float) arg1);
		if ((float) this.anInt4931 > local14 || (float) this.anInt4906 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt4918 * this.aClass54_Sub3_16.method5149((float) arg1, (float) arg2, (float) arg0) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt4914 * this.aClass54_Sub3_16.method5169((float) arg2, (float) arg0, (float) arg1) / (float) arg3);
		arg4[0] = (int) ((float) local58 - this.aFloat91);
		arg4[1] = (int) ((float) local77 - this.aFloat83);
		arg4[2] = (int) local14;
	}

	@OriginalMember(owner = "client!ln", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat93) {
			this.aFloat93 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method3941();
			this.method3968();
		}
	}

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "(II)V")
	public final void method3939(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt4930) {
			this.anInt4930 = arg0;
			this.method3964();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method6113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "(I)Lclient!li;")
	public final Class54_Sub3 method3940() {
		return this.aClass54_Sub3Array3[this.anInt4899];
	}

	@OriginalMember(owner = "client!ln", name = "z", descriptor = "(I)V")
	protected abstract void method3941();

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "(B)V")
	private void method3942() {
		this.method3883();
		if (this.aClass11_3 != null) {
			this.aClass11_3.method7362();
		}
	}

	@OriginalMember(owner = "client!ln", name = "A", descriptor = "(I)V")
	private void method3943() {
		this.aBoolean351 = false;
		if (Static625.aClass283_7 == this.aClass283_3) {
			this.method3954();
			this.method3942();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z[F)[F")
	public final float[] method3944(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloatArray50[0];
		arg0[12] = this.aFloatArray50[3];
		arg0[8] = this.aFloatArray50[2];
		arg0[4] = this.aFloatArray50[1];
		arg0[2] = this.aFloatArray50[8];
		arg0[1] = this.aFloatArray50[4];
		arg0[13] = this.aFloatArray50[7];
		arg0[5] = this.aFloatArray50[5];
		arg0[9] = this.aFloatArray50[6];
		arg0[7] = this.aFloatArray50[13];
		arg0[14] = this.aFloatArray50[11];
		arg0[3] = this.aFloatArray50[12];
		arg0[6] = this.aFloatArray50[9];
		arg0[10] = this.aFloatArray50[10];
		arg0[11] = this.aFloatArray50[14];
		arg0[15] = this.aFloatArray50[15];
		return arg0;
	}

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "(B)Lclient!li;")
	public final Class54_Sub3 method3945() {
		return this.aClass54_Sub3_15;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6090(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas8) {
			throw new RuntimeException();
		} else if (this.aHashtable3.containsKey(arg0)) {
			this.method3881(arg0, this.aHashtable3.get(arg0));
			this.aHashtable3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!pt;B)V")
	public final void method3946(@OriginalArg(0) int arg0, @OriginalArg(1) Class265 arg1) {
		this.method4000(false, false, arg0, arg1);
	}

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "(I)V")
	private void method3947() {
		this.aFloat92 = this.anInt4906;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([IIIIZ)Lclient!oq;")
	public final Interface20 method3948(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		return this.method3928(arg2, arg3, arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(ZB)V")
	public final void method3949(@OriginalArg(1) byte arg0) {
		this.method3939(arg0 << 8 | arg0 << 16 | arg0 << 24 | arg0);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!pt;)V")
	public final void method3950(@OriginalArg(0) int arg0, @OriginalArg(2) Class265 arg1) {
		this.method3953(arg1, arg0);
	}

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "(I)V")
	public final void method3951() {
		if (this.anInt4904 == 2) {
			return;
		}
		this.method3884();
		this.method3903(false);
		this.method3966(false);
		this.method3933(false);
		this.method3916(false);
		this.method3957(false, false, -2);
		this.anInt4904 = 2;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!g;Z)Lclient!hu;")
	@Override
	public final Class21 method6135(@OriginalArg(0) Class111 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(24) Class21 local24;
		if (arg0.anInt4054 == 0 || arg0.anInt4053 == 0) {
			local24 = this.method6132(1, new int[1], 1, 1);
		} else {
			@Pc(33) int[] local33 = new int[arg0.anInt4053 * arg0.anInt4054];
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			@Pc(42) int local42;
			@Pc(46) int local46;
			if (arg0.aByteArray28 == null) {
				for (local42 = 0; local42 < arg0.anInt4053; local42++) {
					for (local46 = 0; local46 < arg0.anInt4054; local46++) {
						@Pc(59) int local59 = arg0.anIntArray216[arg0.aByteArray27[local35++] & 0xFF];
						local33[local37++] = local59 == 0 ? 0 : local59 | 0xFF000000;
					}
				}
			} else {
				for (local42 = 0; local42 < arg0.anInt4053; local42++) {
					for (local46 = 0; local46 < arg0.anInt4054; local46++) {
						local33[local37++] = arg0.aByteArray28[local35] << 24 | arg0.anIntArray216[arg0.aByteArray27[local35] & 0xFF];
						local35++;
					}
				}
			}
			local24 = this.method6132(arg0.anInt4053, local33, arg0.anInt4054, arg0.anInt4054);
		}
		local24.method5778(arg0.anInt4055, arg0.anInt4050, arg0.anInt4051, arg0.anInt4052);
		return local24;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIZ)Lclient!hu;")
	@Override
	public final Class21 method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class21_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!km;)V")
	@Override
	public final void method6072(@OriginalArg(0) Class40 arg0) {
		this.aClass40_Sub1_3 = (Class40_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ln", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3897();
		this.method3939(arg3);
		this.method3946(0, Static190.aClass265_8);
		this.method3950(0, Static190.aClass265_8);
		this.method3956(arg4);
		this.aClass54_Sub3_15.method5156((float) arg2, 1.0F, (float) arg2);
		this.aClass54_Sub3_15.method5142(arg0, arg1, 0);
		this.method3986();
		this.method3919(false);
		this.method3983(this.anInterface4_14, 0);
		this.method3967(this.aClass94_17);
		this.method3891(0, 256, Static573.aClass342_5);
		this.method3919(true);
		this.method3950(0, Static625.aClass265_10);
		this.method3946(0, Static625.aClass265_10);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[Lclient!ada;)V")
	@Override
	public final void method6052(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass8_Sub1Array4[local3] = arg1[local3];
		}
		this.anInt4895 = arg0;
		if (this.aClass283_3.method7040()) {
			this.method3909();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	protected abstract void method3952(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!pt;ZII)V")
	protected abstract void method3953(@OriginalArg(0) Class265 arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "(B)V")
	private void method3954() {
		if (this.aBoolean351) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray52;
		this.aBoolean351 = true;
		if (this.anInt4765 != 0 && this.anInt4732 != 0) {
			local5[10] = 0.5F;
			local5[0] = 2.0F / (float) this.anInt4765;
			local5[1] = 0.0F;
			local5[12] = -1.0F;
			local5[14] = 0.5F;
			local5[13] = 1.0F;
			local5[3] = 0.0F;
			local5[4] = 0.0F;
			local5[15] = 1.0F;
			local5[6] = 0.0F;
			local5[2] = 0.0F;
			local5[7] = 0.0F;
			local5[11] = 0.0F;
			local5[9] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt4732;
			local5[8] = 0.0F;
			return;
		}
		local5[11] = 0.0F;
		local5[1] = 0.0F;
		local5[2] = 0.0F;
		local5[14] = 0.0F;
		local5[6] = 0.0F;
		local5[4] = 0.0F;
		local5[12] = 0.0F;
		local5[8] = 0.0F;
		local5[3] = 0.0F;
		local5[5] = 1.0F;
		local5[13] = 0.0F;
		local5[9] = 0.0F;
		local5[0] = 1.0F;
		local5[7] = 0.0F;
		local5[15] = 1.0F;
		local5[10] = 1.0F;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!pca;I)V")
	@Override
	public final void method6108(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1) {
		this.aClass61_3.method2097(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "(I)Lclient!za;")
	@Override
	public final Class8_Sub30 method6112(@OriginalArg(0) int arg0) {
		@Pc(8) Class8_Sub30_Sub2 local8 = new Class8_Sub30_Sub2(arg0);
		this.aClass43_29.method1424(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "(B)V")
	protected abstract void method3955();

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "(II)V")
	public final void method3956(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt4911) {
			return;
		}
		@Pc(32) Class211 local32;
		@Pc(28) boolean local28;
		@Pc(30) boolean local30;
		if (arg0 == 1) {
			local32 = Static364.aClass211_7;
			local28 = true;
			local30 = true;
		} else if (arg0 == 2) {
			local30 = false;
			local32 = Static74.aClass211_3;
			local28 = true;
		} else if (arg0 == 128) {
			local32 = Static204.aClass211_4;
			local28 = true;
			local30 = true;
		} else {
			local28 = false;
			local30 = false;
			local32 = Static320.aClass211_6;
		}
		if (local30 != this.aBoolean348) {
			this.aBoolean348 = local30;
			this.method4006();
		}
		if (this.aBoolean345 != local28) {
			this.aBoolean345 = local28;
			this.method3959();
		}
		if (local32 != this.aClass211_5) {
			this.aClass211_5 = local32;
			this.method3929();
		}
		this.anInt4911 = arg0;
		this.anInt4904 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZZBI)V")
	public final void method3957(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 != this.bf || this.aBoolean363 != this.aBoolean353) {
			@Pc(16) Interface20 local16 = null;
			@Pc(18) int local18 = 0;
			@Pc(20) byte local20 = 0;
			@Pc(22) int local22 = 0;
			@Pc(29) int local29 = this.aBoolean363 ? 3 : 0;
			if (arg2 < 0) {
				this.method3930();
			} else {
				local16 = this.aClass175_3.method4717(arg2);
				@Pc(45) Class218 local45 = super.anInterface2_12.method4027(arg2);
				if (local45.aByte67 == 0 && local45.aByte64 == 0) {
					this.method3930();
				} else {
					@Pc(64) int local64 = local45.aBoolean476 ? 64 : 128;
					@Pc(68) int local68 = local64 * 50;
					@Pc(72) Class54_Sub3 local72 = this.method3906();
					local72.method5158((float) (this.anInt4932 % local68 * local45.aByte64) / (float) local68, (float) (this.anInt4932 % local68 * local45.aByte67) / (float) local68, 0.0F);
					this.method3908(Static465.aClass207_6);
				}
				if (!this.aBoolean363) {
					local20 = local45.aByte62;
					local29 = local45.aByte66;
					local22 = local45.anInt6845;
				}
				local18 = local45.anInt6843;
			}
			this.method3980(local29, local20, arg0, arg1, local22);
			if (this.aClass11_3 == null) {
				this.method3889(local16);
				this.method3937(local18);
			} else {
				this.aClass11_3.method7354(local16, local18);
			}
			this.bf = arg2;
			this.aBoolean353 = this.aBoolean363;
		}
		this.anInt4904 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ln", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass54_Sub3_16.method5164((float) arg2, (float) arg0, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt4918 * this.aClass54_Sub3_16.method5149((float) arg1, (float) arg2, (float) arg0) / local14);
			local58 = (int) ((float) this.anInt4914 * this.aClass54_Sub3_16.method5169((float) arg2, (float) arg0, (float) arg1) / local14);
		} else {
			local40 = this.anInt4917;
			local58 = this.anInt4920;
		}
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local40 - this.aFloat91);
		arg3[1] = (int) ((float) local58 - this.aFloat83);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([IIIIIZ)Lclient!hu;")
	@Override
	public final Class21 method6054(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class21_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ln", name = "D", descriptor = "(I)I")
	public final int method3958() {
		return this.anInt4899;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIF)Lclient!ada;")
	@Override
	public final Class8_Sub1 method6084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class8_Sub1_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ln", name = "E", descriptor = "(I)V")
	protected abstract void method3959();

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "(Z)V")
	protected abstract void method3960();

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "(I)V")
	public final void method3961() {
		this.method3990(Static573.aClass342_5, 2);
	}

	@OriginalMember(owner = "client!ln", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt4926 = 0;
		this.anInt4927 = this.anInt4765;
		this.anInt4912 = this.anInt4732;
		this.anInt4901 = 0;
		if (this.aBoolean364) {
			this.aBoolean364 = false;
			this.method3987();
		}
		this.method3926();
	}

	@OriginalMember(owner = "client!ln", name = "G", descriptor = "(I)V")
	protected abstract void method3962();

	@OriginalMember(owner = "client!ln", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean363 = false;
	}

	@OriginalMember(owner = "client!ln", name = "H", descriptor = "(I)V")
	private void method3963() {
		this.method3914();
		if (this.aClass11_3 != null) {
			this.aClass11_3.method7365();
		}
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)V")
	@Override
	public final void method6101(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ln", name = "I", descriptor = "(I)V")
	protected abstract void method3964();

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "(B)V")
	private void method3965() {
		this.anInterface4_13 = this.method3988(true);
		this.anInterface4_13.method6507(12, 24);
		this.aClass94_18 = this.method3994(new Class325[] { new Class325(Static589.aClass349_1) });
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(ZI)V")
	public final void method3966(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean358 != arg0) {
			this.aBoolean358 = arg0;
			this.method3911();
			this.anInt4904 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!f;)V")
	public abstract void method3967(@OriginalArg(1) Class94 arg0);

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "(Z)V")
	protected abstract void method3968();

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(ZI)V")
	public final void method3969(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean350) {
			this.aBoolean350 = arg0;
			this.method3962();
		}
	}

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "(II)Lclient!kga;")
	public final Interface13 method3970(@OriginalArg(1) int arg0) {
		if (this.anInterface13_5.method6492() < arg0 * 2) {
			this.anInterface13_5.method6500(arg0);
		}
		return this.anInterface13_5;
	}

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "(Z)V")
	protected abstract void method3971();

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIZ)Lclient!hu;")
	@Override
	public final Class21 method6104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class21_Sub3 local11 = new Class21_Sub3(this, arg2, arg3, arg4);
		local11.method5798(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!ln", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass54_Sub3_16.aFloat118 * (float) arg2 + (float) arg0 * this.aClass54_Sub3_16.aFloat120 + this.aClass54_Sub3_16.aFloat124 * (float) arg1 + this.aClass54_Sub3_16.aFloat121;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass54_Sub3_16.aFloat121 + this.aClass54_Sub3_16.aFloat124 * (float) arg4 + (float) arg3 * this.aClass54_Sub3_16.aFloat120 + this.aClass54_Sub3_16.aFloat118 * (float) arg5;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt4931 > local32 && (float) this.anInt4931 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt4906 < local32 && (float) this.anInt4906 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt4918 * (this.aClass54_Sub3_16.aFloat114 * (float) arg2 + (float) arg0 * this.aClass54_Sub3_16.aFloat117 + this.aClass54_Sub3_16.aFloat115 * (float) arg1 + this.aClass54_Sub3_16.aFloat123) / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt4918 * (this.aClass54_Sub3_16.aFloat123 + this.aClass54_Sub3_16.aFloat115 * (float) arg4 + (float) arg3 * this.aClass54_Sub3_16.aFloat117 + this.aClass54_Sub3_16.aFloat114 * (float) arg5) / local63);
		if (this.aFloat91 > (float) local135 && (float) local167 < this.aFloat91) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat97 && this.aFloat97 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass54_Sub3_16.aFloat122 + this.aClass54_Sub3_16.aFloat119 * (float) arg2 + this.aClass54_Sub3_16.aFloat116 * (float) arg1 + this.aClass54_Sub3_16.aFloat113 * (float) arg0) * (float) this.anInt4914 / local32);
		@Pc(265) int local265 = (int) ((this.aClass54_Sub3_16.aFloat122 + this.aClass54_Sub3_16.aFloat119 * (float) arg5 + this.aClass54_Sub3_16.aFloat116 * (float) arg4 + this.aClass54_Sub3_16.aFloat113 * (float) arg3) * (float) this.anInt4914 / local63);
		if ((float) local233 < this.aFloat83 && this.aFloat83 > (float) local265) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat84 && this.aFloat84 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "(I)V")
	public final void method3972() {
		if (Static493.aClass283_6 == this.aClass283_3) {
			return;
		}
		@Pc(16) Class283 local16 = this.aClass283_3;
		this.aClass283_3 = Static493.aClass283_6;
		if (local16.method7040()) {
			this.method4002();
		}
		this.anInt4904 &= 0xFFFFFFE0;
		this.aFloatArray50 = this.aFloatArray48;
	}

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "(I)V")
	protected abstract void method3973();

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "(Z)V")
	protected abstract void method3974();

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "(B)I")
	public final int method3975() {
		return this.anInt4916;
	}

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "(Z)V")
	public final void method3976() {
		this.aClass54_Sub3_15.method5135();
		this.aBoolean343 = true;
		this.method3992();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!uh;ILclient!kga;IIII)V")
	public abstract void method3977(@OriginalArg(0) Class342 arg0, @OriginalArg(2) Interface13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[FLclient!wd;IBZII)Lclient!oq;")
	protected abstract Interface20 method3978(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Class366 arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6129(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas8 == arg0) {
			local5 = this.anObject14;
		} else if (this.aHashtable3.containsKey(arg0)) {
			local5 = this.aHashtable3.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method3901(arg0, local5);
		if (arg0 == this.aCanvas7) {
			this.method3997();
		}
	}

	@OriginalMember(owner = "client!ln", name = "L", descriptor = "(I)V")
	public final void method3979() {
		this.aClass207Array3 = new Class207[this.anInt4897];
		this.aClass34Array5 = new Class34[this.anInt4897];
		this.anInterface12Array3 = new Interface12[this.anInt4897];
		this.aClass34Array6 = new Class34[this.anInt4897];
		this.aClass54_Sub3Array3 = new Class54_Sub3[this.anInt4897];
		for (@Pc(32) int local32 = 0; local32 < this.anInt4897; local32++) {
			this.aClass34Array6[local32] = Static402.aClass34_4;
			this.aClass34Array5[local32] = Static402.aClass34_4;
			this.aClass207Array3[local32] = Static42.aClass207_1;
			this.aClass54_Sub3Array3[local32] = new Class54_Sub3();
		}
		this.aClass8_Sub1Array4 = new Class8_Sub1[this.anInt4907 - 2];
		this.anInterface12_3 = this.method3923(Static258.aClass160_9, Static456.aClass366_9, 1, 1);
		this.method6096(new Class8_Sub30_Sub2(262144));
		this.aClass94_16 = this.method3994(new Class325[] { new Class325(new Class349[] { Static589.aClass349_1, Static589.aClass349_5 }) });
		this.aClass94_22 = this.method3994(new Class325[] { new Class325(new Class349[] { Static589.aClass349_1, Static589.aClass349_3 }) });
		this.aClass94_20 = this.method3994(new Class325[] { new Class325(Static589.aClass349_1), new Class325(Static589.aClass349_3), new Class325(Static589.aClass349_5), new Class325(Static589.aClass349_2) });
		this.aClass94_19 = this.method3994(new Class325[] { new Class325(Static589.aClass349_1), new Class325(Static589.aClass349_3), new Class325(Static589.aClass349_5) });
		this.aClass83_Sub1_21 = new Class83_Sub1(this, 0, 0, false, false);
		this.aClass83_Sub1_30 = new Class83_Sub1(this, 0, 0, true, true);
		this.aClass83_Sub1_23 = new Class83_Sub1(this, 0, 0, false, false);
		this.aClass83_Sub1_27 = new Class83_Sub1(this, 0, 0, true, true);
		this.aClass83_Sub1_25 = new Class83_Sub1(this, 0, 0, false, false);
		this.aClass83_Sub1_22 = new Class83_Sub1(this, 0, 0, true, true);
		this.aClass83_Sub1_26 = new Class83_Sub1(this, 0, 0, false, false);
		this.aClass83_Sub1_29 = new Class83_Sub1(this, 0, 0, true, true);
		this.aClass83_Sub1_28 = new Class83_Sub1(this, 0, 0, false, false);
		this.aClass83_Sub1_24 = new Class83_Sub1(this, 0, 0, true, true);
		this.aClass61_3 = new Class61(this);
		this.anInterface13_5 = this.method3917(true);
		this.method3936();
		this.aClass376_5 = new Class376(this);
		this.aClass11Array3[1] = this.method3878(1);
		this.aClass11Array3[2] = this.method3878(2);
		this.aClass11Array3[4] = this.method3878(4);
		this.aClass11Array3[5] = this.method3878(5);
		this.aClass11Array3[6] = this.method3878(6);
		this.aClass11Array3[7] = this.method3878(7);
		this.aClass11Array3[3] = this.method3878(3);
		this.aClass11Array3[8] = this.method3878(8);
		this.aClass11Array3[9] = this.method3878(9);
		if (!this.aClass11Array3[2].method7360()) {
			this.aClass11Array3[2] = this.method3878(0);
		}
		if (!this.aClass11Array3[4].method7360()) {
			this.aClass11Array3[4] = this.aClass11Array3[2];
		}
		if (!this.aClass11Array3[8].method7360()) {
			this.aClass11Array3[8] = this.aClass11Array3[4];
		}
		if (!this.aClass11Array3[9].method7360()) {
			this.aClass11Array3[9] = this.aClass11Array3[8];
		}
		this.method3902();
		this.la();
		this.method6081();
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "()Z")
	@Override
	public final boolean method6056() {
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg0 * this.aClass54_Sub3_16.aFloat120 + this.aClass54_Sub3_16.aFloat124 * (float) arg1 + (float) arg2 * this.aClass54_Sub3_16.aFloat118 + this.aClass54_Sub3_16.aFloat121;
		@Pc(57) float local57 = this.aClass54_Sub3_16.aFloat121 + (float) arg4 * this.aClass54_Sub3_16.aFloat124 + (float) arg3 * this.aClass54_Sub3_16.aFloat120 + (float) arg5 * this.aClass54_Sub3_16.aFloat118;
		if ((float) this.anInt4931 > local32 && (float) this.anInt4931 > local57) {
			local7 |= 0x10;
		} else if ((float) this.anInt4906 < local32 && local57 > (float) this.anInt4906) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass54_Sub3_16.aFloat123 + (float) arg2 * this.aClass54_Sub3_16.aFloat114 + (float) arg1 * this.aClass54_Sub3_16.aFloat115 + (float) arg0 * this.aClass54_Sub3_16.aFloat117) * (float) this.anInt4918 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt4918 * ((float) arg4 * this.aClass54_Sub3_16.aFloat115 + this.aClass54_Sub3_16.aFloat117 * (float) arg3 + this.aClass54_Sub3_16.aFloat114 * (float) arg5 + this.aClass54_Sub3_16.aFloat123) / (float) arg6);
		if ((float) local124 < this.aFloat91 && this.aFloat91 > (float) local157) {
			local7 |= 0x1;
		} else if (this.aFloat97 < (float) local124 && (float) local157 > this.aFloat97) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) (((float) arg2 * this.aClass54_Sub3_16.aFloat119 + (float) arg0 * this.aClass54_Sub3_16.aFloat113 + this.aClass54_Sub3_16.aFloat116 * (float) arg1 + this.aClass54_Sub3_16.aFloat122) * (float) this.anInt4914 / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass54_Sub3_16.aFloat113 * (float) arg3 + this.aClass54_Sub3_16.aFloat116 * (float) arg4 + (float) arg5 * this.aClass54_Sub3_16.aFloat119 + this.aClass54_Sub3_16.aFloat122) * (float) this.anInt4914 / (float) arg6);
		if ((float) local224 < this.aFloat83 && this.aFloat83 > (float) local257) {
			local7 |= 0x4;
		} else if ((float) local224 > this.aFloat84 && (float) local257 > this.aFloat84) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIZZI)V")
	private void method3980(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(6) boolean local6 = arg2 & this.method6102();
		if (!local6 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			arg0 = 2;
			arg4 = 1;
			arg1 = 0;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt4900) {
			if (this.anInt4900 != 0) {
				this.aClass11Array3[Integer.MAX_VALUE & this.anInt4900].method7356();
			}
			if (arg0 == 0) {
				this.aClass11_3 = null;
			} else {
				this.aClass11_3 = this.aClass11Array3[arg0 & Integer.MAX_VALUE];
				this.aClass11_3.method7357(arg3);
				this.aClass11_3.method7355(arg3);
				this.aClass11_3.method7359(arg1, arg4);
			}
			this.anInt4900 = arg0;
			this.anInt4908 = arg4;
			this.anInt4924 = arg1;
		} else if (this.anInt4900 != 0) {
			this.aClass11Array3[this.anInt4900 & Integer.MAX_VALUE].method7355(arg3);
			if (arg1 != this.anInt4924 || this.anInt4908 != arg4) {
				this.aClass11Array3[this.anInt4900 & Integer.MAX_VALUE].method7359(arg1, arg4);
				this.anInt4908 = arg4;
				this.anInt4924 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;I)Lclient!jaclib/memory/Stream;")
	public final Stream method3981(@OriginalArg(0) Buffer arg0) {
		this.aStream5.a(arg0);
		return this.aStream5;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IFFFFFF)Z")
	private boolean method3982(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface4_13.method6506();
		if (local9 == null) {
			return false;
		}
		@Pc(18) Stream local18 = this.method3981(local9);
		if (Stream.c()) {
			local18.a(arg1);
			local18.a(arg5);
			local18.a(arg0);
			local18.a(arg2);
			local18.a(arg3);
			local18.a(arg4);
		} else {
			local18.b(arg1);
			local18.b(arg5);
			local18.b(arg0);
			local18.b(arg2);
			local18.b(arg3);
			local18.b(arg4);
		}
		local18.b();
		return this.anInterface4_13.method6505();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZLclient!el;I)V")
	public abstract void method3983(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ln", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt4765 - 1 && arg1 <= 0 && this.anInt4732 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt4926 = arg1 < 0 ? 0 : arg1;
		this.anInt4927 = arg2 > this.anInt4765 ? 0 : arg2;
		this.anInt4912 = arg3 > this.anInt4765 ? 0 : arg3;
		this.anInt4901 = arg0 >= 0 ? arg0 : 0;
		if (!this.aBoolean364) {
			this.aBoolean364 = true;
			this.method3987();
		}
		this.method3973();
		this.method3926();
	}

	@OriginalMember(owner = "client!ln", name = "M", descriptor = "(I)V")
	protected abstract void method3984();

	@OriginalMember(owner = "client!ln", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt4909 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt4909++;
		}
		this.anInt4919 = 0x1 << this.anInt4909;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method6110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) float local12 = (float) -arg0 + (float) arg2;
		@Pc(18) float local18 = (float) arg3 - (float) arg1;
		@Pc(43) float local43;
		if (local12 == 0.0F && local18 == 0.0F) {
			local12 = 1.0F;
		} else {
			local43 = (float) (1.0D / Math.sqrt((double) (local18 * local18 + local12 * local12)));
			local12 *= local43;
			local18 *= local43;
		}
		this.method3897();
		this.method3939(arg4);
		this.method3946(0, Static190.aClass265_8);
		this.method3950(0, Static190.aClass265_8);
		this.method3956(1);
		this.method3976();
		this.method3919(false);
		@Pc(86) int local86 = arg7 % (arg6 + arg5);
		local43 = (float) arg5 * local12;
		@Pc(96) float local96 = (float) arg5 * local18;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = 0.0F;
		@Pc(102) float local102 = local43;
		@Pc(104) float local104 = local96;
		if (local86 <= arg5) {
			local104 = local18 * (float) (arg5 - local86);
			local102 = local12 * (float) (arg5 - local86);
		} else {
			local98 = local12 * (float) (arg6 + arg5 - local86);
			local100 = local18 * (float) (arg6 + arg5 - local86);
		}
		@Pc(153) float local153 = (float) arg0 + local98;
		@Pc(158) float local158 = (float) arg1 + local100;
		@Pc(163) float local163 = local12 * (float) arg6;
		@Pc(168) float local168 = (float) arg6 * local18;
		while (true) {
			if (arg2 > arg0) {
				if (local153 > (float) arg2) {
					break;
				}
				if ((float) arg2 < local153 + local102) {
					local102 = (float) arg2 - local153;
				}
			} else {
				if (local153 < (float) arg2) {
					break;
				}
				if (local153 + local102 < (float) arg2) {
					local102 = (float) arg2 - local153;
				}
			}
			if (arg3 <= arg1) {
				if (local158 < (float) arg3) {
					break;
				}
				if ((float) arg3 > local104 + local158) {
					local104 = (float) arg3 - local158;
				}
			} else {
				if ((float) arg3 < local158) {
					break;
				}
				if (local158 + local104 > (float) arg3) {
					local104 = (float) arg3 - local158;
				}
			}
			if (!this.method3982(0.0F, local153, local153 + local102, local104 + local158, 0.0F, local158)) {
				return;
			}
			local158 += local104 + local168;
			local153 += local163 + local102;
			this.method3876();
			local104 = local96;
			local102 = local43;
		}
		this.method3919(true);
		this.method3950(0, Static625.aClass265_10);
		this.method3946(0, Static625.aClass265_10);
	}

	@OriginalMember(owner = "client!ln", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6093(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "()Lclient!dfa;")
	@Override
	public final Class54 method6118() {
		return this.aClass54_Sub3_16;
	}

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "()Z")
	@Override
	public final boolean method6122() {
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "N", descriptor = "(I)V")
	public final void method3986() {
		this.aBoolean343 = false;
		this.method3992();
	}

	@OriginalMember(owner = "client!ln", name = "z", descriptor = "(B)V")
	protected abstract void method3987();

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "(ZI)Lclient!el;")
	public abstract Interface4 method3988(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt4931;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static281.method4756(this, arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!ln", name = "A", descriptor = "(B)[F")
	public final float[] method3989() {
		return this.aFloatArray48;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!uh;II)V")
	private void method3990(@OriginalArg(0) Class342 arg0, @OriginalArg(1) int arg1) {
		this.method3983(this.anInterface4_15, 0);
		this.method3967(this.aClass94_21);
		this.method3891(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!ln", name = "O", descriptor = "(I)V")
	private void method3991() {
		this.aFloatArray46[14] = this.aFloat81;
		this.aFloatArray46[10] = this.aFloat95;
		this.aFloat87 = ((float) -this.anInt4906 + this.aFloatArray46[14]) / this.aFloatArray46[10];
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	@Override
	public final void method6082(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass175_3 != null) {
			this.aClass175_3.method4719();
		}
		this.anInt4921 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "()Lclient!dfa;")
	@Override
	public final Class54 method6124() {
		return this.aClass54_Sub3_21;
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "()V")
	@Override
	public final void method6059() {
		if (this.aClass175_3 != null) {
			this.aClass175_3.method4719();
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6120(@OriginalArg(0) Canvas arg0) {
		this.anObject14 = null;
		this.aCanvas7 = null;
		if (arg0 == null || this.aCanvas8 == arg0) {
			this.anObject14 = this.anObject13;
			this.aCanvas7 = this.aCanvas8;
		} else if (this.aHashtable3.containsKey(arg0)) {
			this.anObject14 = this.aHashtable3.get(arg0);
			this.aCanvas7 = arg0;
		}
		if (this.aCanvas7 == null || this.anObject14 == null) {
			throw new RuntimeException();
		}
		this.method3952(this.aCanvas7, this.anObject14);
		this.method3997();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!dfa;)V")
	@Override
	public final void method6066(@OriginalArg(0) Class54 arg0) {
		this.aClass54_Sub3_16 = (Class54_Sub3) arg0;
		this.aClass54_Sub3_18.method5137(this.aClass54_Sub3_16);
		this.aClass54_Sub3_18.method5147();
		this.aClass54_Sub3_19.method5160(this.aClass54_Sub3_18);
		this.aClass54_Sub3_17.method5160(this.aClass54_Sub3_16);
		if (this.aClass283_3.method7040()) {
			this.method4002();
		}
	}

	@OriginalMember(owner = "client!ln", name = "P", descriptor = "(I)V")
	private void method3992() {
		if (Static625.aClass283_7 == this.aClass283_3) {
			@Pc(7) float local7 = this.method3998();
			this.aClass54_Sub3_15.method5161(0.0F, local7, local7);
		}
		this.aBoolean349 = false;
		this.method3960();
		if (this.aClass11_3 != null) {
			this.aClass11_3.method7358();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method3993(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([Lclient!tg;I)Lclient!f;")
	public abstract Class94 method3994(@OriginalArg(0) Class325[] arg0);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!wd;ILclient!jm;)Z")
	public abstract boolean method3995(@OriginalArg(0) Class366 arg0, @OriginalArg(2) Class160 arg1);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZIZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method3996(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap3.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!ln", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt4894 + this.anInt4891 + this.anInt4893;
	}

	@OriginalMember(owner = "client!ln", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean363 = true;
		this.anInt4916 = arg3;
		this.anInt4896 = arg1;
		this.anInt4933 = arg0;
		this.anInt4910 = arg2;
	}

	@OriginalMember(owner = "client!ln", name = "Q", descriptor = "(I)V")
	private void method3997() {
		if (this.aCanvas7 == null) {
			this.anInt4781 = this.anInt4826 = 1;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas7.getSize();
			this.anInt4826 = local6.height;
			this.anInt4781 = local6.width;
		}
		this.anInt4732 = this.anInt4826;
		this.anInt4765 = this.anInt4781;
		this.method3943();
		this.method3913();
		this.method4003();
		this.method3882();
		this.method3926();
		this.method3972();
		this.la();
	}

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "()Z")
	@Override
	public final boolean method6080() {
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "(B)F")
	protected abstract float method3998();

	@OriginalMember(owner = "client!ln", name = "R", descriptor = "(I)V")
	public abstract void method3999();

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "()Z")
	@Override
	public final boolean method6102() {
		return this.aClass11Array3[3].method7360();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BZZILclient!pt;)V")
	public abstract void method4000(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class265 arg3);

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "(B)V")
	private void method4001() {
		if (this.aBoolean355) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray51;
		@Pc(17) float local17 = (float) this.anInt4931;
		@Pc(21) float local21 = (float) this.anInt4906;
		@Pc(33) float local33 = (float) -this.anInt4920 * this.aFloat94 / (float) this.anInt4914;
		@Pc(45) float local45 = (float) -this.anInt4917 * this.aFloat94 / (float) this.anInt4918;
		@Pc(59) float local59 = (float) (this.anInt4765 - this.anInt4917) * this.aFloat94 / (float) this.anInt4918;
		@Pc(74) float local74 = (float) (this.anInt4732 - this.anInt4920) * this.aFloat94 / (float) this.anInt4914;
		if (local45 == local59 || local74 == local33) {
			local13[4] = 0.0F;
			local13[0] = 1.0F;
			local13[13] = 0.0F;
			local13[14] = 0.0F;
			local13[7] = 0.0F;
			local13[6] = 0.0F;
			local13[15] = 1.0F;
			local13[10] = 1.0F;
			local13[3] = 0.0F;
			local13[5] = 1.0F;
			local13[2] = 0.0F;
			local13[11] = 0.0F;
			local13[12] = 0.0F;
			local13[1] = 0.0F;
			local13[8] = 0.0F;
			local13[9] = 0.0F;
		} else {
			local13[3] = 0.0F;
			local13[15] = 1.0F;
			local13[11] = 0.0F;
			local13[9] = 0.0F;
			local13[14] = local17 / (local17 - local21);
			local13[6] = 0.0F;
			local13[7] = 0.0F;
			local13[12] = (local59 + local45) / (local45 - local59);
			local13[8] = 0.0F;
			local13[4] = 0.0F;
			local13[2] = 0.0F;
			local13[0] = 2.0F / (local59 - local45);
			local13[5] = 2.0F / (local74 - local33);
			local13[1] = 0.0F;
			local13[10] = 1.0F / (local17 - local21);
			local13[13] = (local74 + local33) / (-local33 + local74);
		}
		this.method3947();
		this.aBoolean355 = true;
	}

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4901;
		arg0[1] = this.anInt4926;
		arg0[3] = this.anInt4912;
		arg0[2] = this.anInt4927;
	}

	@OriginalMember(owner = "client!ln", name = "S", descriptor = "(I)V")
	private void method4002() {
		this.aBoolean349 = false;
		if (this.aClass11_3 != null) {
			this.aClass11_3.method7366();
		}
		this.method3932();
	}

	@OriginalMember(owner = "client!ln", name = "D", descriptor = "(B)V")
	private void method4003() {
		this.aBoolean355 = false;
		this.method4001();
		if (Static441.aClass283_5 == this.aClass283_3) {
			this.method3942();
		}
	}

	@OriginalMember(owner = "client!ln", name = "T", descriptor = "(I)I")
	public final int method4004() {
		return this.anInt4896;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([BLclient!wd;IIIZ)Lclient!oq;")
	public final Interface20 method4005(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method3935(arg4, arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!pca;)V")
	@Override
	public final void method6100(@OriginalArg(0) Class250 arg0) {
		this.aClass61_3.method2097(arg0, -1, this);
	}

	@OriginalMember(owner = "client!ln", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass54_Sub3_16.method5164((float) arg2, (float) arg0, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt4918 * this.aClass54_Sub3_16.method5149((float) arg1, (float) arg2, (float) arg0) / local14);
			local58 = (int) ((float) this.anInt4914 * this.aClass54_Sub3_16.method5169((float) arg2, (float) arg0, (float) arg1) / local14);
		} else {
			local40 = this.anInt4917;
			local58 = this.anInt4920;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat91);
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local58 - this.aFloat83);
	}

	@OriginalMember(owner = "client!ln", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt4917, this.anInt4920, this.anInt4918, this.anInt4914 };
	}

	@OriginalMember(owner = "client!ln", name = "E", descriptor = "(B)V")
	protected abstract void method4006();

	@OriginalMember(owner = "client!ln", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt4906;
	}

	@OriginalMember(owner = "client!ln", name = "U", descriptor = "(I)V")
	private void method4007() {
		if (Static290.aClass283_4 == this.aClass283_3) {
			return;
		}
		@Pc(12) Class283 local12 = this.aClass283_3;
		this.aClass283_3 = Static290.aClass283_4;
		if (!local12.method7040()) {
			this.method4002();
		}
		this.method3890();
		this.aFloatArray50 = this.aFloatArray46;
		this.method3942();
		this.anInt4904 &= 0xFFFFFFF8;
	}
}
