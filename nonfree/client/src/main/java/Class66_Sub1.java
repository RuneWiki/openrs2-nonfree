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

@OriginalClass("client!ej")
public abstract class Class66_Sub1 extends Class66 {

	@OriginalMember(owner = "client!ej", name = "yb", descriptor = "Lclient!mca;")
	protected Class217 aClass217_5;

	@OriginalMember(owner = "client!ej", name = "Eb", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!ej", name = "bc", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable6;

	@OriginalMember(owner = "client!ej", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!ej", name = "Rd", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!ej", name = "Vd", descriptor = "I")
	protected int anInt8405;

	@OriginalMember(owner = "client!ej", name = "Xd", descriptor = "I")
	public int anInt8407;

	@OriginalMember(owner = "client!ej", name = "ae", descriptor = "I")
	public int anInt8408;

	@OriginalMember(owner = "client!ej", name = "le", descriptor = "Z")
	protected boolean aBoolean568;

	@OriginalMember(owner = "client!ej", name = "re", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!ej", name = "ye", descriptor = "Z")
	public boolean aBoolean570;

	@OriginalMember(owner = "client!ej", name = "Ae", descriptor = "I")
	public int anInt8419;

	@OriginalMember(owner = "client!ej", name = "Ce", descriptor = "Lclient!nq;")
	public Interface15 anInterface15_3;

	@OriginalMember(owner = "client!ej", name = "De", descriptor = "Lclient!ac;")
	private Class3 aClass3_3;

	@OriginalMember(owner = "client!ej", name = "Ee", descriptor = "Lclient!va;")
	private Class75_Sub2 aClass75_Sub2_3;

	@OriginalMember(owner = "client!ej", name = "Fe", descriptor = "[Lclient!eb;")
	protected Class81[] aClass81Array3;

	@OriginalMember(owner = "client!ej", name = "Ge", descriptor = "I")
	public int anInt8420;

	@OriginalMember(owner = "client!ej", name = "Je", descriptor = "[Lclient!nq;")
	private Interface15[] anInterface15Array3;

	@OriginalMember(owner = "client!ej", name = "Le", descriptor = "I")
	private int anInt8423;

	@OriginalMember(owner = "client!ej", name = "Ne", descriptor = "[Lclient!nea;")
	protected Class240[] aClass240Array5;

	@OriginalMember(owner = "client!ej", name = "Pe", descriptor = "I")
	protected int anInt8425;

	@OriginalMember(owner = "client!ej", name = "Qe", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!ej", name = "Re", descriptor = "I")
	public int anInt8426;

	@OriginalMember(owner = "client!ej", name = "Se", descriptor = "I")
	protected int anInt8427;

	@OriginalMember(owner = "client!ej", name = "Ze", descriptor = "Z")
	public boolean aBoolean576;

	@OriginalMember(owner = "client!ej", name = "lf", descriptor = "I")
	protected int anInt8431;

	@OriginalMember(owner = "client!ej", name = "of", descriptor = "[Lclient!haa;")
	protected Class134_Sub1[] aClass134_Sub1Array3;

	@OriginalMember(owner = "client!ej", name = "pf", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!ej", name = "qf", descriptor = "Lclient!lu;")
	private Class93 aClass93_3;

	@OriginalMember(owner = "client!ej", name = "uf", descriptor = "Z")
	public boolean aBoolean578;

	@OriginalMember(owner = "client!ej", name = "vf", descriptor = "F")
	private float aFloat176;

	@OriginalMember(owner = "client!ej", name = "Cf", descriptor = "I")
	protected int anInt8436;

	@OriginalMember(owner = "client!ej", name = "Gf", descriptor = "F")
	public float aFloat178;

	@OriginalMember(owner = "client!ej", name = "Jf", descriptor = "F")
	public float aFloat179;

	@OriginalMember(owner = "client!ej", name = "Kf", descriptor = "I")
	public int anInt8440;

	@OriginalMember(owner = "client!ej", name = "Tf", descriptor = "[Lclient!nea;")
	protected Class240[] aClass240Array6;

	@OriginalMember(owner = "client!ej", name = "Wf", descriptor = "F")
	private float aFloat180;

	@OriginalMember(owner = "client!ej", name = "Yf", descriptor = "Z")
	protected boolean aBoolean584;

	@OriginalMember(owner = "client!ej", name = "Zf", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!ej", name = "ag", descriptor = "[Lclient!pv;")
	protected Class4_Sub32[] aClass4_Sub32Array6;

	@OriginalMember(owner = "client!ej", name = "dg", descriptor = "F")
	private float aFloat184;

	@OriginalMember(owner = "client!ej", name = "eg", descriptor = "I")
	private int anInt8448;

	@OriginalMember(owner = "client!ej", name = "fg", descriptor = "Lclient!cn;")
	public Class9_Sub2 aClass9_Sub2_21;

	@OriginalMember(owner = "client!ej", name = "gg", descriptor = "Lclient!ts;")
	public Class321 aClass321_15;

	@OriginalMember(owner = "client!ej", name = "hg", descriptor = "Lclient!ts;")
	private Class321 aClass321_16;

	@OriginalMember(owner = "client!ej", name = "ig", descriptor = "Lclient!cn;")
	public Class9_Sub2 aClass9_Sub2_22;

	@OriginalMember(owner = "client!ej", name = "jg", descriptor = "Lclient!cn;")
	public Class9_Sub2 aClass9_Sub2_23;

	@OriginalMember(owner = "client!ej", name = "lg", descriptor = "Lclient!ts;")
	public Class321 aClass321_17;

	@OriginalMember(owner = "client!ej", name = "mg", descriptor = "Lclient!cn;")
	public Class9_Sub2 aClass9_Sub2_24;

	@OriginalMember(owner = "client!ej", name = "ng", descriptor = "Lclient!cn;")
	public Class9_Sub2 aClass9_Sub2_25;

	@OriginalMember(owner = "client!ej", name = "og", descriptor = "Lclient!cn;")
	public Class9_Sub2 aClass9_Sub2_26;

	@OriginalMember(owner = "client!ej", name = "pg", descriptor = "Lclient!ts;")
	private Class321 aClass321_18;

	@OriginalMember(owner = "client!ej", name = "qg", descriptor = "Lclient!ts;")
	public Class321 aClass321_19;

	@OriginalMember(owner = "client!ej", name = "rg", descriptor = "Lclient!cn;")
	public Class9_Sub2 aClass9_Sub2_27;

	@OriginalMember(owner = "client!ej", name = "sg", descriptor = "Lclient!cn;")
	public Class9_Sub2 aClass9_Sub2_28;

	@OriginalMember(owner = "client!ej", name = "tg", descriptor = "Lclient!cn;")
	public Class9_Sub2 aClass9_Sub2_29;

	@OriginalMember(owner = "client!ej", name = "ug", descriptor = "Lclient!ft;")
	private Interface8 anInterface8_8;

	@OriginalMember(owner = "client!ej", name = "vg", descriptor = "Lclient!ts;")
	public Class321 aClass321_20;

	@OriginalMember(owner = "client!ej", name = "wg", descriptor = "Lclient!cn;")
	public Class9_Sub2 aClass9_Sub2_30;

	@OriginalMember(owner = "client!ej", name = "xg", descriptor = "Lclient!eu;")
	private Interface4 anInterface4_13;

	@OriginalMember(owner = "client!ej", name = "yg", descriptor = "Lclient!eu;")
	private Interface4 anInterface4_14;

	@OriginalMember(owner = "client!ej", name = "zg", descriptor = "Z")
	protected boolean aBoolean585;

	@OriginalMember(owner = "client!ej", name = "Ag", descriptor = "I")
	private int anInt8449;

	@OriginalMember(owner = "client!ej", name = "L", descriptor = "Lclient!gj;")
	private final Class124 aClass124_55 = new Class124();

	@OriginalMember(owner = "client!ej", name = "Zd", descriptor = "Z")
	protected boolean aBoolean565 = true;

	@OriginalMember(owner = "client!ej", name = "Yd", descriptor = "Lclient!haa;")
	protected final Class134_Sub1 aClass134_Sub1_15 = new Class134_Sub1();

	@OriginalMember(owner = "client!ej", name = "be", descriptor = "Lclient!haa;")
	public Class134_Sub1 aClass134_Sub1_16 = new Class134_Sub1();

	@OriginalMember(owner = "client!ej", name = "ce", descriptor = "Lclient!haa;")
	public final Class134_Sub1 aClass134_Sub1_17 = new Class134_Sub1();

	@OriginalMember(owner = "client!ej", name = "de", descriptor = "Lclient!haa;")
	protected final Class134_Sub1 aClass134_Sub1_18 = new Class134_Sub1();

	@OriginalMember(owner = "client!ej", name = "ee", descriptor = "Lclient!haa;")
	private final Class134_Sub1 aClass134_Sub1_19 = new Class134_Sub1();

	@OriginalMember(owner = "client!ej", name = "fe", descriptor = "Lclient!haa;")
	private final Class134_Sub1 aClass134_Sub1_20 = new Class134_Sub1();

	@OriginalMember(owner = "client!ej", name = "qe", descriptor = "I")
	private int anInt8415 = 1;

	@OriginalMember(owner = "client!ej", name = "oe", descriptor = "Z")
	protected boolean aBoolean569 = false;

	@OriginalMember(owner = "client!ej", name = "ue", descriptor = "[Lclient!lu;")
	private final Class93[] aClass93Array3 = new Class93[10];

	@OriginalMember(owner = "client!ej", name = "ge", descriptor = "Z")
	protected boolean aBoolean566 = false;

	@OriginalMember(owner = "client!ej", name = "he", descriptor = "I")
	public int anInt8409 = 8;

	@OriginalMember(owner = "client!ej", name = "ve", descriptor = "F")
	public float aFloat168 = 1.0F;

	@OriginalMember(owner = "client!ej", name = "pe", descriptor = "I")
	public int anInt8414 = -1;

	@OriginalMember(owner = "client!ej", name = "Oe", descriptor = "Z")
	protected boolean aBoolean574 = false;

	@OriginalMember(owner = "client!ej", name = "af", descriptor = "[F")
	private final float[] aFloatArray51 = new float[16];

	@OriginalMember(owner = "client!ej", name = "He", descriptor = "I")
	private int anInt8421 = 0;

	@OriginalMember(owner = "client!ej", name = "ef", descriptor = "Lclient!gt;")
	protected Class129 aClass129_4 = Static213.aClass129_3;

	@OriginalMember(owner = "client!ej", name = "Me", descriptor = "I")
	public int anInt8424 = 0;

	@OriginalMember(owner = "client!ej", name = "bf", descriptor = "F")
	public float bf = -1.0F;

	@OriginalMember(owner = "client!ej", name = "ff", descriptor = "[F")
	private final float[] aFloatArray52 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ej", name = "ne", descriptor = "I")
	public int anInt8413 = 0;

	@OriginalMember(owner = "client!ej", name = "Ke", descriptor = "Z")
	protected boolean aBoolean573 = true;

	@OriginalMember(owner = "client!ej", name = "je", descriptor = "Z")
	protected boolean aBoolean567 = false;

	@OriginalMember(owner = "client!ej", name = "Af", descriptor = "Z")
	private boolean aBoolean581 = false;

	@OriginalMember(owner = "client!ej", name = "Ie", descriptor = "I")
	public int anInt8422 = 128;

	@OriginalMember(owner = "client!ej", name = "ke", descriptor = "I")
	private int anInt8411 = -1;

	@OriginalMember(owner = "client!ej", name = "rf", descriptor = "I")
	protected int anInt8432 = 0;

	@OriginalMember(owner = "client!ej", name = "Ue", descriptor = "F")
	private float aFloat171 = 1.0F;

	@OriginalMember(owner = "client!ej", name = "kf", descriptor = "[F")
	private final float[] aFloatArray54 = new float[16];

	@OriginalMember(owner = "client!ej", name = "gf", descriptor = "F")
	public float aFloat174 = 1.0F;

	@OriginalMember(owner = "client!ej", name = "ie", descriptor = "I")
	public int anInt8410 = 50;

	@OriginalMember(owner = "client!ej", name = "Df", descriptor = "I")
	public int anInt8437 = 3;

	@OriginalMember(owner = "client!ej", name = "mf", descriptor = "[F")
	protected float[] aFloatArray55 = this.aFloatArray52;

	@OriginalMember(owner = "client!ej", name = "Ye", descriptor = "I")
	protected int anInt8429 = 0;

	@OriginalMember(owner = "client!ej", name = "Ve", descriptor = "I")
	protected int anInt8428 = 0;

	@OriginalMember(owner = "client!ej", name = "Lf", descriptor = "I")
	protected int anInt8441 = 3584;

	@OriginalMember(owner = "client!ej", name = "wf", descriptor = "[F")
	private final float[] aFloatArray56 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ej", name = "Xe", descriptor = "F")
	public float aFloat173 = 1.0F;

	@OriginalMember(owner = "client!ej", name = "Bf", descriptor = "[F")
	public final float[] aFloatArray57 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!ej", name = "se", descriptor = "I")
	public int anInt8416 = -1;

	@OriginalMember(owner = "client!ej", name = "me", descriptor = "I")
	protected int anInt8412 = 0;

	@OriginalMember(owner = "client!ej", name = "Nf", descriptor = "Z")
	protected boolean aBoolean582 = true;

	@OriginalMember(owner = "client!ej", name = "we", descriptor = "F")
	private float aFloat169 = 3000.0F;

	@OriginalMember(owner = "client!ej", name = "jf", descriptor = "[F")
	private final float[] aFloatArray53 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ej", name = "Qf", descriptor = "I")
	protected int anInt8443 = 0;

	@OriginalMember(owner = "client!ej", name = "We", descriptor = "F")
	public float aFloat172 = 1.0F;

	@OriginalMember(owner = "client!ej", name = "Ff", descriptor = "F")
	public float aFloat177 = 3584.0F;

	@OriginalMember(owner = "client!ej", name = "Pf", descriptor = "Z")
	private boolean aBoolean583 = false;

	@OriginalMember(owner = "client!ej", name = "Of", descriptor = "I")
	protected int anInt8442 = -1;

	@OriginalMember(owner = "client!ej", name = "te", descriptor = "I")
	private int anInt8417 = 0;

	@OriginalMember(owner = "client!ej", name = "zf", descriptor = "Z")
	private boolean aBoolean580 = false;

	@OriginalMember(owner = "client!ej", name = "Mf", descriptor = "[F")
	public final float[] aFloatArray58 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ej", name = "yf", descriptor = "I")
	private int anInt8435 = 0;

	@OriginalMember(owner = "client!ej", name = "Be", descriptor = "Z")
	protected boolean aBoolean572 = true;

	@OriginalMember(owner = "client!ej", name = "Ef", descriptor = "I")
	public int anInt8438 = 512;

	@OriginalMember(owner = "client!ej", name = "Xf", descriptor = "I")
	private int anInt8447 = -1;

	@OriginalMember(owner = "client!ej", name = "If", descriptor = "I")
	public int anInt8439 = 0;

	@OriginalMember(owner = "client!ej", name = "cf", descriptor = "I")
	private int anInt8430 = 0;

	@OriginalMember(owner = "client!ej", name = "Te", descriptor = "Z")
	private boolean aBoolean575 = false;

	@OriginalMember(owner = "client!ej", name = "sf", descriptor = "I")
	protected final int anInt8433 = 0;

	@OriginalMember(owner = "client!ej", name = "xf", descriptor = "Z")
	private boolean aBoolean579 = false;

	@OriginalMember(owner = "client!ej", name = "Vf", descriptor = "I")
	protected final int anInt8446 = 0;

	@OriginalMember(owner = "client!ej", name = "ze", descriptor = "Z")
	protected boolean aBoolean571 = true;

	@OriginalMember(owner = "client!ej", name = "bg", descriptor = "F")
	public float aFloat182 = 3584.0F;

	@OriginalMember(owner = "client!ej", name = "Sf", descriptor = "I")
	public int anInt8445 = 512;

	@OriginalMember(owner = "client!ej", name = "cg", descriptor = "F")
	public float aFloat183 = -1.0F;

	@OriginalMember(owner = "client!ej", name = "nf", descriptor = "Lclient!kf;")
	protected Class194 aClass194_7 = Static272.aClass194_6;

	@OriginalMember(owner = "client!ej", name = "Rf", descriptor = "I")
	private int anInt8444 = 16777215;

	@OriginalMember(owner = "client!ej", name = "df", descriptor = "Z")
	protected boolean aBoolean577 = true;

	@OriginalMember(owner = "client!ej", name = "Uf", descriptor = "[F")
	private final float[] aFloatArray59 = new float[16];

	@OriginalMember(owner = "client!ej", name = "Hf", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!ej", name = "kg", descriptor = "Lclient!haa;")
	private final Class134_Sub1 aClass134_Sub1_21 = new Class134_Sub1();

	@OriginalMember(owner = "client!ej", name = "Db", descriptor = "Lclient!bi;")
	protected final Class31 aClass31_106;

	@OriginalMember(owner = "client!ej", name = "tf", descriptor = "I")
	protected final int anInt8434;

	@OriginalMember(owner = "client!ej", name = "Id", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas15;

	@OriginalMember(owner = "client!ej", name = "Ub", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas14;

	@OriginalMember(owner = "client!ej", name = "W", descriptor = "Ljava/lang/Object;")
	protected final Object anObject42;

	@OriginalMember(owner = "client!ej", name = "pd", descriptor = "Ljava/lang/Object;")
	private Object anObject43;

	@OriginalMember(owner = "client!ej", name = "td", descriptor = "I")
	private int anInt8380;

	@OriginalMember(owner = "client!ej", name = "nb", descriptor = "I")
	public int anInt8277;

	@OriginalMember(owner = "client!ej", name = "xe", descriptor = "I")
	public final int anInt8418;

	@OriginalMember(owner = "client!ej", name = "id", descriptor = "I")
	private int anInt8370;

	@OriginalMember(owner = "client!ej", name = "Ac", descriptor = "I")
	public int anInt8336;

	@OriginalMember(owner = "client!ej", name = "hf", descriptor = "Lclient!uda;")
	private final Class329 aClass329_3;

	@OriginalMember(owner = "client!ej", name = "Cb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!e;Lclient!bi;II)V")
	protected Class66_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.aClass31_106 = arg3;
		this.anInt8434 = arg4;
		this.aCanvas14 = this.aCanvas15 = arg0;
		this.anObject43 = this.anObject42 = arg1;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt8277 = this.anInt8380 = local307.width;
		this.anInt8418 = arg5;
		this.anInt8336 = this.anInt8370 = local307.height;
		Static452.method6402(false, true);
		this.aClass329_3 = new Class329(this, super.anInterface3_15);
		this.aNativeInterface3 = new NativeInterface(super.anInterface3_15.method7252(), this.anInt8418);
		for (@Pc(349) int local349 = 0; super.anInterface3_15.method7252() > local349; local349++) {
			@Pc(357) Class271 local357 = super.anInterface3_15.method7249(local349);
			if (local357 != null) {
				this.aNativeInterface3.initTextureMetrics(local349, local357.aByte82, local357.aByte80);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
	private void method6858() {
		if (this.anInt8423 == 1) {
			return;
		}
		this.method6915();
		this.method6862(false);
		this.method6985(false);
		this.method6946(false);
		this.method6864(false);
		this.method6899(false, -2, false);
		this.method6920(1);
		this.method6979(this.anInterface15_3);
		this.anInt8423 = 1;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)I")
	@Override
	public final int method6831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!ej", name = "sa", descriptor = "(II)V")
	@Override
	public final void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt8410 && arg1 == this.anInt8441) {
			return;
		}
		this.anInt8410 = arg0;
		this.anInt8441 = arg1;
		this.method6916();
		this.method6968();
		this.method6929();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!kga;[Lclient!pga;Z)Lclient!ta;")
	@Override
	public final Class91 method6829(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class268[] arg1) {
		return new Class91_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)Lclient!ft;")
	public abstract Interface8 method6859(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ej", name = "JA", descriptor = "(I)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0) {
		this.anInt8437 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt8437++;
		}
		this.anInt8409 = 0x1 << this.anInt8437;
	}

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "(I)V")
	protected void method6860() {
		this.anInt8427 = this.anInt8431;
		this.anInt8431 = 0;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
	public final void method6861() {
		this.method6935();
		this.method6955();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)V")
	public final void method6862(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean568) {
			this.aBoolean568 = arg0;
			this.method6987();
			this.anInt8423 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(B)V")
	protected abstract void method6863();

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "()Z")
	@Override
	public final boolean method6820() {
		return true;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(ZI)V")
	public final void method6864(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean566) {
			this.aBoolean566 = arg0;
			this.method6926();
			this.anInt8423 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "(IIIII)V")
	@Override
	protected final void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!ej", name = "ka", descriptor = "(FF)V")
	@Override
	public final void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat169 && arg1 == this.aFloat180) {
			return;
		}
		this.aFloat180 = arg1;
		this.aFloat169 = arg0;
		this.method6981();
		this.method6944();
		this.method6968();
		this.method6916();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method6823(@OriginalArg(0) Class134 arg0) {
		this.aClass134_Sub1_16 = (Class134_Sub1) arg0;
		this.aClass134_Sub1_18.la(this.aClass134_Sub1_16);
		this.aClass134_Sub1_18.method3403();
		this.aClass134_Sub1_19.method3405(this.aClass134_Sub1_18);
		this.aClass134_Sub1_17.method3405(this.aClass134_Sub1_16);
		if (this.aClass129_4.method3348()) {
			this.method6880();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)I")
	@Override
	public final int method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(Z)V")
	private void method6865() {
		if (this.aCanvas14 == null) {
			this.anInt8380 = this.anInt8370 = 1;
		} else {
			@Pc(16) Dimension local16 = this.aCanvas14.getSize();
			this.anInt8370 = local16.height;
			this.anInt8380 = local16.width;
		}
		this.anInt8336 = this.anInt8370;
		this.anInt8277 = this.anInt8380;
		this.method6925();
		this.method6916();
		this.method6968();
		this.method6949();
		this.method6884();
		this.method6935();
		this.F();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!gf;I)V")
	public final void method6866(@OriginalArg(1) Class120 arg0, @OriginalArg(2) int arg1) {
		this.method6988(arg0, arg1);
	}

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "(I)V")
	@Override
	public final void method6840(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt8422 = arg0;
		this.aClass329_3.method7360();
	}

	@OriginalMember(owner = "client!ej", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt8410;
	}

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "()Z")
	@Override
	public final boolean method6850() {
		return true;
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6853(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas15) {
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
			@Pc(53) Object local53 = this.method6873(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "(I)V")
	private void method6867() {
		this.anInterface4_14 = this.method6931(true);
		this.anInterface4_14.method3559(12, 24);
		this.aClass321_18 = this.method6903(new Class43[] { new Class43(Static108.aClass79_1) });
	}

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "(I)V")
	protected abstract void method6868();

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(B)Lclient!haa;")
	public final Class134_Sub1 method6869() {
		return this.aClass134_Sub1Array3[this.anInt8432];
	}

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(B)V")
	private void method6870() {
		this.anInterface4_13 = this.method6931(false);
		this.anInterface4_13.method3559(28, 140);
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			@Pc(32) Buffer local32 = this.anInterface4_13.method7149();
			if (local32 != null) {
				@Pc(39) Stream local39 = this.method6978(local32);
				if (Stream.b()) {
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(1.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(1.0F);
					local39.b(0.0F);
					local39.b(1.0F);
					local39.b(1.0F);
					local39.b(1.0F);
					local39.b(0.0F);
					local39.b(1.0F);
					local39.b(1.0F);
					local39.b(1.0F);
					local39.b(1.0F);
					local39.b(1.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(1.0F);
					local39.b(0.0F);
					local39.b(1.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
					local39.b(0.0F);
				} else {
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(1.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(1.0F);
					local39.a(0.0F);
					local39.a(1.0F);
					local39.a(1.0F);
					local39.a(1.0F);
					local39.a(0.0F);
					local39.a(1.0F);
					local39.a(1.0F);
					local39.a(1.0F);
					local39.a(1.0F);
					local39.a(1.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(1.0F);
					local39.a(0.0F);
					local39.a(1.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
					local39.a(0.0F);
				}
				local39.c();
				if (this.anInterface4_13.method7150()) {
					break;
				}
			}
		}
		this.aClass321_16 = this.method6903(new Class43[] { new Class43(new Class79[] { Static108.aClass79_1, Static108.aClass79_5, Static108.aClass79_5 }) });
	}

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "(B)I")
	public final int method6871() {
		return this.anInt8448;
	}

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)Lclient!i;")
	@Override
	public final Class4_Sub6 method6833(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub6_Sub1 local8 = new Class4_Sub6_Sub1(arg0);
		this.aClass124_55.method3275(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method6873(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "()F")
	public final float method6874() {
		return this.aFloat180;
	}

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "(I)V")
	private void method6875() {
		this.method6877();
		if (this.aClass93_3 != null) {
			this.aClass93_3.method7994();
		}
	}

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "(I)V")
	protected abstract void method6876();

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6815(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas15) {
			local5 = this.anObject43;
		} else if (this.aHashtable6.containsKey(arg0)) {
			local5 = this.aHashtable6.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method6908(local5, arg0);
		if (arg0 == this.aCanvas14) {
			this.method6865();
		}
	}

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "(I)V")
	protected abstract void method6877();

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "(I)V")
	protected final void method6878() {
		@Pc(9) Enumeration local9 = this.aHashtable6.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method6936(this.aHashtable6.get(local15), local15);
		}
		this.anInterface4_13.method7146();
		this.anInterface4_14.method7146();
		this.aClass9_Sub2_23.method1280();
		this.aClass9_Sub2_26.method1280();
		this.aClass9_Sub2_25.method1280();
		this.aClass9_Sub2_24.method1280();
		this.aClass9_Sub2_29.method1280();
		this.aClass3_3.method59();
		this.anInterface8_8.method7146();
	}

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "(I)V")
	protected abstract void method6879();

	@OriginalMember(owner = "client!ej", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class98_Sub2 local6 = (Class98_Sub2) arg1;
		@Pc(9) Interface2 local9 = local6.anInterface2_2;
		this.method6913();
		this.method6979(local9);
		this.method6984(1);
		this.method6997(Static174.aClass240_2, Static174.aClass240_2);
		this.method6923(Static19.aClass120_1, 0);
		this.method6932(arg0);
		this.aClass134_Sub1_15.method3417(0.0F, (float) this.anInt8336, (float) this.anInt8277);
		this.method6902();
		this.aClass134_Sub1Array3[0].method3417(1.0F, local9.method6724((float) this.anInt8336), local9.method6725((float) this.anInt8277));
		this.aClass134_Sub1Array3[0].method3408(0.0F, local9.method6725((float) -arg2), local9.method6724((float) -arg3));
		this.aClass81Array3[0] = Static49.aClass81_4;
		this.method6875();
		this.method6930();
		this.method6888();
		this.method6923(Static22.aClass120_2, 0);
	}

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "()Z")
	@Override
	public final boolean method6837() {
		return true;
	}

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "()V")
	@Override
	public final void k() {
		this.aBoolean578 = false;
		this.method6957(0, 0, false, 0, false);
		this.method6929();
		this.method6987();
	}

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(Z)V")
	private void method6880() {
		this.aBoolean580 = false;
		if (this.aClass93_3 != null) {
			this.aClass93_3.method8005();
		}
		this.method6898();
	}

	@OriginalMember(owner = "client!ej", name = "IA", descriptor = "()I")
	@Override
	public final int IA() {
		return this.anInt8441;
	}

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "(I)V")
	protected abstract void method6881();

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "(B)Lclient!ul;")
	public final Interface22 method6882() {
		return this.aClass75_Sub2_3 == null ? null : this.aClass75_Sub2_3.method5791();
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)Lclient!ft;")
	public final Interface8 method6883(@OriginalArg(0) int arg0) {
		if (arg0 * 2 > this.anInterface8_8.method7145()) {
			this.anInterface8_8.method7148(arg0);
		}
		return this.anInterface8_8;
	}

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "(I)V")
	private void method6884() {
		this.aFloat175 = this.anInt8443 - this.anInt8413;
		this.aFloat179 = this.anInt8412 - this.anInt8413;
		this.aFloat181 = this.anInt8428 - this.anInt8424;
		this.aFloat167 = this.anInt8429 - this.anInt8424;
	}

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(II)V")
	public abstract void method6885(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIZI[III)Lclient!ak;")
	public abstract Interface2 method6886(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "()V")
	@Override
	protected void method6805() {
		if (this.aBoolean579) {
			return;
		}
		for (@Pc(13) Class4 local13 = this.aClass124_55.method3267(); local13 != null; local13 = this.aClass124_55.method3273()) {
			((Class4_Sub6_Sub1) local13).method530();
		}
		@Pc(30) Enumeration local30 = this.aHashtable6.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method6936(this.aHashtable6.get(local36), local36);
		}
		Static333.method5017(false, true);
		this.aNativeInterface3.release();
		this.aBoolean579 = true;
	}

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "(I)V")
	private void method6887() {
		this.method6947();
		this.method6992();
		this.method6896();
		this.method6860();
		this.method6961();
		this.method6921();
		this.method6879();
		this.method6901();
		this.method6926();
		this.method6987();
		this.method6863();
		this.method6975();
		this.method6876();
		this.method6977();
		for (@Pc(56) int local56 = this.anInt8426 - 1; local56 >= 0; local56--) {
			this.method6895(local56);
			this.method6868();
			this.method6892();
			this.method6888();
		}
		this.method6910();
		this.method6949();
		this.method6905();
		this.method6881();
		this.method6898();
	}

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "(I)V")
	public final void method6888() {
		if (this.aClass81Array3[this.anInt8432] != Static114.aClass81_5) {
			this.aClass81Array3[this.anInt8432] = Static114.aClass81_5;
			this.aClass134_Sub1Array3[this.anInt8432].Y();
			this.method6875();
		}
	}

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "(B)V")
	public final void method6889() {
		if (this.anInt8423 == 16) {
			return;
		}
		this.method6924();
		this.method6862(true);
		this.method6946(true);
		this.method6864(true);
		this.method6984(1);
		this.anInt8423 = 16;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLclient!ts;)V")
	public abstract void method6890(@OriginalArg(1) Class321 arg0);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZ)Lclient!xa;")
	@Override
	public final Class13 method6856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class13_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([FIZIIILclient!hi;B)Lclient!ak;")
	protected abstract Interface2 method6891(@OriginalArg(0) float[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class141 arg4);

	@OriginalMember(owner = "client!ej", name = "ha", descriptor = "(F)V")
	@Override
	public final void ha(@OriginalArg(0) float arg0) {
		if (this.aFloat168 != arg0) {
			this.aFloat168 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method6947();
			this.method6921();
		}
	}

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "(I)V")
	protected abstract void method6892();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(FFFFFFI)Z")
	private boolean method6893(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) Buffer local15 = this.anInterface4_14.method7149();
		if (local15 == null) {
			return false;
		}
		@Pc(24) Stream local24 = this.method6978(local15);
		if (Stream.b()) {
			local24.b(arg2);
			local24.b(arg1);
			local24.b(arg3);
			local24.b(arg0);
			local24.b(arg5);
			local24.b(arg4);
		} else {
			local24.a(arg2);
			local24.a(arg1);
			local24.a(arg3);
			local24.a(arg0);
			local24.a(arg5);
			local24.a(arg4);
		}
		local24.c();
		return this.anInterface4_14.method7150();
	}

	@OriginalMember(owner = "client!ej", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt8444;
		if (local15 || arg1 != this.aFloat183 || this.bf != arg2) {
			this.aFloat183 = arg1;
			this.anInt8444 = arg0;
			this.bf = arg2;
			if (local15) {
				this.aFloat174 = (float) (this.anInt8444 & 0xFF0000) / 1.671168E7F;
				this.aFloat173 = (float) (this.anInt8444 & 0xFF) / 255.0F;
				this.aFloat172 = (float) (this.anInt8444 & 0xFF00) / 65280.0F;
				this.method6947();
			}
			this.aNativeInterface3.setSunColour(this.aFloat174, this.aFloat172, this.aFloat173, arg1, arg2);
			this.method6992();
		}
		if (arg3 != this.aFloatArray53[0] || arg4 != this.aFloatArray53[1] || arg5 != this.aFloatArray53[2]) {
			this.aFloatArray53[2] = arg5;
			this.aFloatArray53[0] = arg3;
			this.aFloatArray53[1] = arg4;
			this.aFloatArray56[0] = -arg3;
			this.aFloatArray56[2] = -arg5;
			this.aFloatArray56[1] = -arg4;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray58[2] = arg5 * local153;
			this.aFloatArray58[0] = arg3 * local153;
			this.aFloatArray58[1] = arg4 * local153;
			this.aFloatArray57[1] = -this.aFloatArray58[1];
			this.aFloatArray57[0] = -this.aFloatArray58[0];
			this.aFloatArray57[2] = -this.aFloatArray58[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray58[0], this.aFloatArray58[1], this.aFloatArray58[2]);
			this.method6961();
			this.anInt8440 = (int) (arg5 * 256.0F / arg4);
			this.anInt8420 = (int) (arg3 * 256.0F / arg4);
		}
		this.method6921();
	}

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "(B)V")
	protected abstract void method6894();

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(II)V")
	public final void method6895(@OriginalArg(0) int arg0) {
		if (this.anInt8432 != arg0) {
			this.anInt8432 = arg0;
			this.method6971();
		}
	}

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "(I)V")
	protected abstract void method6896();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)Lclient!lu;")
	protected Class93 method6897(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class93_Sub3(this);
		} else if (arg0 == 1) {
			return new Class93_Sub4(this);
		} else if (arg0 == 2) {
			return new Class93_Sub7(this, this.aClass217_5);
		} else if (arg0 == 7) {
			return new Class93_Sub8(this);
		} else {
			return new Class93_Sub5(this);
		}
	}

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "()Z")
	@Override
	public final boolean method6821() {
		return true;
	}

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "(B)V")
	protected abstract void method6898();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIZB)V")
	public final void method6899(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anInt8411 != arg1) {
			if (arg1 < 0) {
				this.method6888();
				this.method6979(null);
				this.method6920(0);
				if (!this.aBoolean578) {
					this.method6957(0, 0, arg0, 0, arg2);
				}
			} else {
				@Pc(24) Interface2 local24 = this.aClass329_3.method7357(arg1);
				@Pc(30) Class271 local30 = super.anInterface3_15.method7249(arg1);
				if (local30.aByte79 == 0 && local30.aByte83 == 0) {
					this.method6888();
				} else {
					@Pc(46) int local46 = local30.aBoolean516 ? 64 : 128;
					@Pc(50) int local50 = local46 * 50;
					@Pc(56) Class134_Sub1 local56 = this.method6953();
					local56.method3410(0.0F, (float) (local30.aByte83 * (this.anInt8419 % local50)) / (float) local50, (float) (this.anInt8419 % local50 * local30.aByte79) / (float) local50);
					this.method6933(Static49.aClass81_4);
				}
				if (!this.aBoolean578) {
					this.method6957(local30.anInt7171, local30.aByte84, arg0, local30.aByte81, arg2);
				}
				if (this.aClass93_3 == null) {
					this.method6979(local24);
					this.method6920(local30.anInt7177);
				} else {
					this.aClass93_3.method7995(local30.anInt7177, local24);
				}
			}
			this.anInt8411 = arg1;
		}
		this.anInt8423 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method6900(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap5.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "(I)V")
	protected abstract void method6901();

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "(I)V")
	public final void method6902() {
		this.aBoolean565 = false;
		this.method6945();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[Lclient!ca;)Lclient!ts;")
	public abstract Class321 method6903(@OriginalArg(1) Class43[] arg0);

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "(B)V")
	protected abstract void method6904();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "()Z")
	@Override
	public final boolean method6778() {
		return this.aClass93Array3[3].method7998();
	}

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "()Z")
	@Override
	public final boolean method6834() {
		return true;
	}

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "(I)V")
	protected abstract void method6905();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method6907(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method6908(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!ej", name = "X", descriptor = "(III)V")
	@Override
	public final void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt8416 && this.anInt8414 == arg1 && this.anInt8439 == arg2) {
			return;
		}
		this.anInt8416 = arg0;
		this.anInt8414 = arg1;
		this.anInt8439 = arg2;
		if (this.aBoolean578) {
			return;
		}
		this.method6929();
		this.method6987();
	}

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "(Z)V")
	protected abstract void method6910();

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "(B)[F")
	public final float[] method6911() {
		return this.aFloatArray52;
	}

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "(Z)V")
	protected abstract void method6912();

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "()Lclient!q;")
	@Override
	public final Class134 method6842() {
		return this.aClass134_Sub1_21;
	}

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "(B)V")
	public final void method6913() {
		if (this.anInt8423 == 2) {
			return;
		}
		this.method6915();
		this.method6862(false);
		this.method6985(false);
		this.method6946(false);
		this.method6864(false);
		this.method6899(false, -2, false);
		this.anInt8423 = 2;
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(ZI)V")
	public final void method6914(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean574 != arg0) {
			this.aBoolean574 = arg0;
			this.method6896();
		}
	}

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "(B)V")
	private void method6915() {
		if (Static506.aClass129_5 == this.aClass129_4) {
			return;
		}
		@Pc(6) Class129 local6 = this.aClass129_4;
		this.aClass129_4 = Static506.aClass129_5;
		if (local6.method3348()) {
			this.method6880();
		}
		this.method6938();
		this.aFloatArray55 = this.aFloatArray59;
		this.method6955();
		this.anInt8423 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6839(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6792(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas15 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.method6936(this.aHashtable6.get(arg0), arg0);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!dn;)V")
	@Override
	public final void method6803(@OriginalArg(0) Class75 arg0) {
		this.aClass75_Sub2_3 = (Class75_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "(B)V")
	private void method6916() {
		this.aBoolean583 = false;
		this.method6970();
		if (Static521.aClass129_6 == this.aClass129_4) {
			this.method6955();
		}
	}

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "(I)V")
	@Override
	public final void method6835(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIF)Lclient!pv;")
	@Override
	public final Class4_Sub32 method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub32_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILclient!ob;Lclient!ft;III)V")
	public abstract void method6917(@OriginalArg(1) int arg0, @OriginalArg(2) Class247 arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)V")
	@Override
	public void method6824(@OriginalArg(0) int arg0) {
		this.aClass329_3.method7359();
		this.anInt8419 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!ej", name = "na", descriptor = "(III[I)V")
	@Override
	public final void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass134_Sub1_16.method3401((float) arg2, (float) arg0, (float) arg1);
		if ((float) this.anInt8410 > local14 || local14 > (float) this.anInt8441) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(57) int local57 = (int) ((float) this.anInt8445 * this.aClass134_Sub1_16.method3416((float) arg2, (float) arg0, (float) arg1) / local14);
		@Pc(75) int local75 = (int) ((float) this.anInt8438 * this.aClass134_Sub1_16.method3418((float) arg1, (float) arg2, (float) arg0) / local14);
		if ((float) local57 >= this.aFloat181 && (float) local57 <= this.aFloat167 && this.aFloat179 <= (float) local75 && (float) local75 <= this.aFloat175) {
			arg3[2] = (int) local14;
			arg3[0] = (int) ((float) local57 - this.aFloat181);
			arg3[1] = (int) ((float) local75 - this.aFloat179);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BB)V")
	public final void method6918(@OriginalArg(1) byte arg0) {
		this.method6932(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([Lclient!ba;Lclient!c;Lclient!q;[Lclient!ot;I)V")
	@Override
	public final void method6798(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class26_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method6845(arg0, arg2, arg3, arg4);
		this.method6846(arg1);
	}

	@OriginalMember(owner = "client!ej", name = "aa", descriptor = "()I")
	@Override
	public final int aa() {
		return this.anInt8449;
	}

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "(I)Lclient!haa;")
	public final Class134_Sub1 method6919() {
		return this.aClass134_Sub1_15;
	}

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "(II)V")
	public final void method6920(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6997(Static174.aClass240_2, Static174.aClass240_2);
		} else if (arg0 == 0) {
			this.method6997(Static152.aClass240_1, Static152.aClass240_1);
		} else if (arg0 == 2) {
			this.method6997(Static440.aClass240_3, Static174.aClass240_2);
		} else if (arg0 == 3) {
			this.method6997(Static598.aClass240_5, Static152.aClass240_1);
		} else if (arg0 == 4) {
			this.method6997(Static494.aClass240_4, Static494.aClass240_4);
		}
	}

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "(I)V")
	protected abstract void method6921();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!pga;Z)Lclient!xa;")
	@Override
	public final Class13 method6799(@OriginalArg(0) Class268 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(26) Class13 local26;
		if (arg0.anInt7058 == 0 || arg0.anInt7060 == 0) {
			local26 = this.method6843(new int[1], 1, 1, 1);
		} else {
			@Pc(35) int[] local35 = new int[arg0.anInt7058 * arg0.anInt7060];
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			@Pc(44) int local44;
			@Pc(48) int local48;
			if (arg0.aByteArray92 == null) {
				for (local44 = 0; local44 < arg0.anInt7060; local44++) {
					for (local48 = 0; local48 < arg0.anInt7058; local48++) {
						@Pc(102) int local102 = arg0.anIntArray590[arg0.aByteArray93[local37++] & 0xFF];
						local35[local39++] = local102 == 0 ? 0 : local102 | 0xFF000000;
					}
				}
			} else {
				for (local44 = 0; local44 < arg0.anInt7060; local44++) {
					for (local48 = 0; local48 < arg0.anInt7058; local48++) {
						local35[local39++] = arg0.anIntArray590[arg0.aByteArray93[local37] & 0xFF] | arg0.aByteArray92[local37] << 24;
						local37++;
					}
				}
			}
			local26 = this.method6843(local35, arg0.anInt7058, arg0.anInt7058, arg0.anInt7060);
		}
		local26.EA(arg0.anInt7057, arg0.anInt7059, arg0.anInt7056, arg0.anInt7061);
		return local26;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI[[II)Lclient!ul;")
	public abstract Interface22 method6922(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "()I")
	@Override
	public final int v() {
		return this.anInt8407 + this.anInt8408 + this.anInt8405;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLclient!gf;I)V")
	public final void method6923(@OriginalArg(1) Class120 arg0, @OriginalArg(2) int arg1) {
		this.method6959(arg1, false, false, arg0);
	}

	@OriginalMember(owner = "client!ej", name = "E", descriptor = "(I)V")
	private void method6924() {
		if (this.aClass129_4 == Static550.aClass129_7) {
			return;
		}
		@Pc(14) Class129 local14 = this.aClass129_4;
		this.aClass129_4 = Static550.aClass129_7;
		if (!local14.method3348()) {
			this.method6880();
		}
		this.method6991();
		this.aFloatArray55 = this.aFloatArray54;
		this.method6955();
		this.anInt8423 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ej", name = "F", descriptor = "(I)V")
	private void method6925() {
		this.aBoolean575 = false;
		if (Static506.aClass129_5 == this.aClass129_4) {
			this.method6938();
			this.method6955();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "(Z)V")
	protected abstract void method6926();

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public final void method6800(@OriginalArg(0) Class4_Sub6 arg0) {
		this.aNativeHeap5 = ((Class4_Sub6_Sub1) arg0).aNativeHeap1;
		this.aNativeHeapBuffer8 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B[BIILclient!hi;I)Lclient!js;")
	public abstract Interface12 method6928(@OriginalArg(1) byte[] arg0, @OriginalArg(4) Class141 arg1);

	@OriginalMember(owner = "client!ej", name = "H", descriptor = "(I)V")
	private void method6929() {
		if (this.aClass93_3 != null) {
			this.aClass93_3.method7999();
		}
		this.method6863();
	}

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "()Z")
	@Override
	public final boolean method6849() {
		return false;
	}

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "(Z)V")
	public final void method6930() {
		this.method6973(2, Static130.aClass247_2);
	}

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(ZI)Lclient!eu;")
	public abstract Interface4 method6931(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "()Z")
	@Override
	public final boolean method6781() {
		return this.aBoolean584;
	}

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "(II)V")
	public final void method6932(@OriginalArg(0) int arg0) {
		if (this.anInt8425 != arg0) {
			this.anInt8425 = arg0;
			this.method6910();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!eb;)V")
	public final void method6933(@OriginalArg(1) Class81 arg0) {
		this.aClass81Array3[this.anInt8432] = arg0;
		this.method6875();
	}

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "(I)I")
	public final int method6934() {
		return this.anInt8447;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public final Class98 method6841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static590.method7940(this, arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!ej", name = "J", descriptor = "(I)V")
	public final void method6935() {
		if (this.aClass129_4 == Static213.aClass129_3) {
			return;
		}
		@Pc(19) Class129 local19 = this.aClass129_4;
		this.aClass129_4 = Static213.aClass129_3;
		if (local19.method3348()) {
			this.method6880();
		}
		this.anInt8423 &= 0xFFFFFFE0;
		this.aFloatArray55 = this.aFloatArray52;
	}

	@OriginalMember(owner = "client!ej", name = "LA", descriptor = "(IIII)V")
	@Override
	public final void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean578) {
			throw new RuntimeException("");
		}
		if (this.anInt8448 != arg0) {
			this.anInt8448 = arg0;
			if (this.aClass93_3 != null) {
				this.aClass93_3.method8006();
			}
		}
		this.anInt8430 = arg3;
		this.anInt8447 = arg2;
		this.anInt8442 = arg1;
		this.method6929();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method6936(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!hi;Lclient!ne;I)Z")
	public abstract boolean method6937(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class239 arg1);

	@OriginalMember(owner = "client!ej", name = "K", descriptor = "(I)V")
	private void method6938() {
		if (this.aBoolean575) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray59;
		this.aBoolean575 = true;
		if (this.anInt8277 != 0 && this.anInt8336 != 0) {
			local9[8] = 0.0F;
			local9[6] = 0.0F;
			local9[14] = 0.5F;
			local9[0] = 2.0F / (float) this.anInt8277;
			local9[13] = 1.0F;
			local9[5] = -2.0F / (float) this.anInt8336;
			local9[15] = 1.0F;
			local9[10] = 0.5F;
			local9[3] = 0.0F;
			local9[11] = 0.0F;
			local9[9] = 0.0F;
			local9[2] = 0.0F;
			local9[7] = 0.0F;
			local9[4] = 0.0F;
			local9[12] = -1.0F;
			local9[1] = 0.0F;
			return;
		}
		local9[4] = 0.0F;
		local9[0] = 1.0F;
		local9[3] = 0.0F;
		local9[12] = 0.0F;
		local9[15] = 1.0F;
		local9[14] = 0.0F;
		local9[1] = 0.0F;
		local9[11] = 0.0F;
		local9[5] = 1.0F;
		local9[8] = 0.0F;
		local9[10] = 1.0F;
		local9[2] = 0.0F;
		local9[13] = 0.0F;
		local9[9] = 0.0F;
		local9[6] = 0.0F;
		local9[7] = 0.0F;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public final Class16 method6797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class16_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ej", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public final void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "()Z")
	@Override
	public final boolean method6793() {
		return true;
	}

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "(B)Lclient!haa;")
	public final Class134_Sub1 method6939() {
		return this.aClass134_Sub1_18;
	}

	@OriginalMember(owner = "client!ej", name = "L", descriptor = "(I)Lclient!haa;")
	public final Class134_Sub1 method6940() {
		if (!this.aBoolean580) {
			this.aClass134_Sub1_20.method3412(this.aClass134_Sub1_18, this.aClass134_Sub1_15);
			this.aBoolean580 = true;
		}
		return this.aClass134_Sub1_20;
	}

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "()V")
	@Override
	public final void method6783() {
		this.aClass329_3.method7360();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLclient!eu;I)V")
	public abstract void method6941(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ej", name = "M", descriptor = "(I)V")
	protected void method6942() {
		this.method6887();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method6786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method6952();
		this.method6858();
		this.method6932(arg4);
		this.method6923(Static19.aClass120_1, 0);
		this.method6866(Static19.aClass120_1, 0);
		this.method6984(arg5);
		this.aClass134_Sub1_15.method3417(1.0F, (float) (arg3 - 1), (float) (arg2 - 1));
		this.aClass134_Sub1_15.method3408(0.0F, (float) arg0 - local7, (float) arg1 - local7);
		this.method6902();
		this.method6972(false);
		this.method6973(4, Static318.aClass247_4);
		this.method6972(true);
		this.method6866(Static22.aClass120_2, 0);
		this.method6923(Static22.aClass120_2, 0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BZ)V")
	public final void method6943(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean572 != arg0) {
			this.aBoolean572 = arg0;
			this.method6879();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public final Class13 method6843(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class13_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ej", name = "N", descriptor = "(I)V")
	private void method6944() {
		if (this.aFloat180 == 0.0F) {
			this.aFloatArray51[14] = this.aFloat176;
			this.aFloatArray51[10] = this.aFloat184;
		} else {
			@Pc(13) float local13 = this.aFloat169 / (this.aFloat169 + this.aFloat180);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat176 * (1.0F - local13) * (1.0F - local13) / this.aFloat180;
			this.aFloatArray51[10] = local32 + this.aFloat184;
			this.aFloatArray51[14] = local17 * this.aFloat176;
		}
		this.aFloat182 = (this.aFloatArray51[14] - (float) this.anInt8441) / this.aFloatArray51[10];
	}

	@OriginalMember(owner = "client!ej", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt8428 < arg0) {
			this.anInt8428 = arg0;
			local5 = true;
		}
		if (this.anInt8429 > arg2) {
			this.anInt8429 = arg2;
			local5 = true;
		}
		if (arg1 > this.anInt8412) {
			this.anInt8412 = arg1;
			local5 = true;
		}
		if (this.anInt8443 > arg3) {
			local5 = true;
			this.anInt8443 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean585) {
			this.aBoolean585 = true;
			this.method6894();
		}
		this.method6912();
		this.method6884();
	}

	@OriginalMember(owner = "client!ej", name = "O", descriptor = "(I)V")
	private void method6945() {
		if (Static506.aClass129_5 == this.aClass129_4) {
			@Pc(17) float local17 = this.method6952();
			this.aClass134_Sub1_15.method3408(0.0F, local17, local17);
		}
		this.aBoolean580 = false;
		this.method6881();
		if (this.aClass93_3 != null) {
			this.aClass93_3.method8003();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZB)V")
	public final void method6946(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean569) {
			this.aBoolean569 = arg0;
			this.method6901();
			this.anInt8423 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "(Z)V")
	protected abstract void method6947();

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "(B)V")
	protected abstract void method6949();

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(ZB)V")
	public final void method6950(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean577 != arg0) {
			this.aBoolean577 = arg0;
			this.method6987();
		}
	}

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "()Z")
	@Override
	public final boolean method6804() {
		return false;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZII[IB)Lclient!ak;")
	public final Interface2 method6951(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		return this.method6886(arg1, arg0, 0, arg3, 0, arg2);
	}

	@OriginalMember(owner = "client!ej", name = "P", descriptor = "(I)F")
	protected abstract float method6952();

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "(IIIIII)V")
	@Override
	public final void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6858();
		this.method6932(arg4);
		this.method6923(Static19.aClass120_1, 0);
		this.method6866(Static19.aClass120_1, 0);
		this.method6984(arg5);
		this.aClass134_Sub1_15.method3417(1.0F, (float) arg3, (float) arg2);
		this.aClass134_Sub1_15.G(arg0, arg1, 0);
		this.method6902();
		this.method6972(false);
		this.method6930();
		this.method6972(true);
		this.method6866(Static22.aClass120_2, 0);
		this.method6923(Static22.aClass120_2, 0);
	}

	@OriginalMember(owner = "client!ej", name = "Q", descriptor = "(I)Lclient!haa;")
	public final Class134_Sub1 method6953() {
		return this.aClass134_Sub1Array3[this.anInt8432];
	}

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "(B)I")
	public final int method6954() {
		return this.anInt8430;
	}

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "(Z)V")
	private void method6955() {
		this.method6905();
		if (this.aClass93_3 != null) {
			this.aClass93_3.method8004();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ot;I)V")
	@Override
	public final void method6845(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class26_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method4023(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "R", descriptor = "(I)V")
	private void method6956() {
		if (this.aClass129_4 == Static521.aClass129_6) {
			return;
		}
		@Pc(6) Class129 local6 = this.aClass129_4;
		this.aClass129_4 = Static521.aClass129_6;
		if (!local6.method3348()) {
			this.method6880();
		}
		this.method6970();
		this.aFloatArray55 = this.aFloatArray51;
		this.method6955();
		this.anInt8423 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZIZB)V")
	private void method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) boolean local8 = arg2 & this.method6778();
		if (!local8 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg0 = 1;
			arg3 = 0;
		}
		if (arg1 != 0 && arg4) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt8435) {
			if (this.anInt8435 != 0) {
				this.aClass93Array3[Integer.MAX_VALUE & this.anInt8435].method8002();
			}
			if (arg1 == 0) {
				this.aClass93_3 = null;
			} else {
				this.aClass93_3 = this.aClass93Array3[arg1 & Integer.MAX_VALUE];
				this.aClass93_3.method8000(arg4);
				this.aClass93_3.method7997(arg4);
				this.aClass93_3.method7996(arg0, arg3);
			}
			this.anInt8417 = arg0;
			this.anInt8435 = arg1;
			this.anInt8421 = arg3;
		} else if (this.anInt8435 != 0) {
			this.aClass93Array3[this.anInt8435 & Integer.MAX_VALUE].method7997(arg4);
			if (this.anInt8421 != arg3 || this.anInt8417 != arg0) {
				this.aClass93Array3[Integer.MAX_VALUE & this.anInt8435].method7996(arg0, arg3);
				this.anInt8417 = arg0;
				this.anInt8421 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public final boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass134_Sub1_16.method3401((float) arg2, (float) arg0, (float) arg1);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass134_Sub1_16.method3401((float) arg5, (float) arg3, (float) arg4);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt8410 > local14 && (float) this.anInt8410 > local31 || !(!(local14 > (float) this.anInt8441) || !((float) this.anInt8441 < local31))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt8445 * this.aClass134_Sub1_16.method3416((float) arg2, (float) arg0, (float) arg1) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt8445 * this.aClass134_Sub1_16.method3416((float) arg5, (float) arg3, (float) arg4) / local31);
		if (this.aFloat181 > (float) local81 && this.aFloat181 > (float) local99 || this.aFloat167 < (float) local81 && this.aFloat167 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt8438 * this.aClass134_Sub1_16.method3418((float) arg1, (float) arg2, (float) arg0) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt8438 * this.aClass134_Sub1_16.method3418((float) arg4, (float) arg5, (float) arg3) / local31);
			return (!((float) local143 < this.aFloat179) || !(this.aFloat179 > (float) local161)) && (!(this.aFloat175 < (float) local143) || !((float) local161 > this.aFloat175));
		}
	}

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6826(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public final void method6844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class98 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BZI[BLclient!hi;I)Lclient!ak;")
	public final Interface2 method6958(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class141 arg3, @OriginalArg(5) int arg4) {
		return this.method6994(arg1, arg4, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZZLclient!gf;)V")
	public abstract void method6959(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class120 arg3);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IF)V")
	public final void method6960(@OriginalArg(1) float arg0) {
		if (this.aFloat171 != arg0) {
			this.aFloat171 = arg0;
			this.method6968();
		}
	}

	@OriginalMember(owner = "client!ej", name = "ca", descriptor = "(IIII)V")
	@Override
	public final void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt8277 - 1 <= arg2 && arg1 <= 0 && arg3 >= this.anInt8336 - 1) {
			this.F();
			return;
		}
		this.anInt8428 = arg0 < 0 ? 0 : arg0;
		this.anInt8429 = this.anInt8277 < arg2 ? 0 : arg2;
		this.anInt8412 = arg1 >= 0 ? arg1 : 0;
		this.anInt8443 = arg3 > this.anInt8277 ? 0 : arg3;
		if (!this.aBoolean585) {
			this.aBoolean585 = true;
			this.method6894();
		}
		this.method6912();
		this.method6884();
	}

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "(B)V")
	public abstract void method6961();

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6854(@OriginalArg(0) Canvas arg0) {
		this.aCanvas14 = null;
		this.anObject43 = null;
		if (arg0 == null || this.aCanvas15 == arg0) {
			this.anObject43 = this.anObject42;
			this.aCanvas14 = this.aCanvas15;
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.anObject43 = this.aHashtable6.get(arg0);
			this.aCanvas14 = arg0;
		}
		if (this.aCanvas14 == null || this.anObject43 == null) {
			throw new RuntimeException();
		}
		this.method6907(this.anObject43, this.aCanvas14);
		this.method6865();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!hi;ZI[FII)Lclient!ak;")
	public final Interface2 method6963(@OriginalArg(0) Class141 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) int arg4) {
		return this.method6891(arg3, arg1, arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ba;Lclient!c;Lclient!q;Lclient!ot;I)V")
	@Override
	public final void method6807(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class26_Sub5 arg3, @OriginalArg(4) int arg4) {
		arg0.method4023(arg2, arg3, arg4);
		this.method6846(arg1);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIILclient!ob;)V")
	public abstract void method6964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class247 arg2);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([FB)[F")
	public final float[] method6965(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray55[0];
		arg0[8] = this.aFloatArray55[2];
		arg0[12] = this.aFloatArray55[3];
		arg0[4] = this.aFloatArray55[1];
		arg0[9] = this.aFloatArray55[6];
		arg0[5] = this.aFloatArray55[5];
		arg0[2] = this.aFloatArray55[8];
		arg0[1] = this.aFloatArray55[4];
		arg0[13] = this.aFloatArray55[7];
		arg0[10] = this.aFloatArray55[10];
		arg0[3] = this.aFloatArray55[12];
		arg0[14] = this.aFloatArray55[11];
		arg0[6] = this.aFloatArray55[9];
		arg0[7] = this.aFloatArray55[13];
		arg0[11] = this.aFloatArray55[14];
		arg0[15] = this.aFloatArray55[15];
		return arg0;
	}

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "()Lclient!q;")
	@Override
	public final Class134 method6788() {
		return new Class134_Sub1();
	}

	@OriginalMember(owner = "client!ej", name = "S", descriptor = "(I)I")
	public final int method6966() {
		return this.anInt8432;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!haa;B)V")
	public final void method6967(@OriginalArg(0) Class134_Sub1 arg0) {
		this.aClass134_Sub1_15.la(arg0);
		this.aBoolean565 = false;
		this.method6945();
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		@Pc(30) float local30 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local10 * local10)));
		@Pc(34) float local34 = local17 * local30;
		@Pc(38) float local38 = local10 * local30;
		if (!this.method6893((float) arg2 + local38, (float) arg1, (float) arg0, 0.0F, 0.0F, local34 + (float) arg3)) {
			return;
		}
		this.method6858();
		this.method6932(arg4);
		this.method6923(Static19.aClass120_1, 0);
		this.method6866(Static19.aClass120_1, 0);
		this.method6984(arg5);
		this.method6976();
		this.method6972(false);
		this.method6983();
		this.method6972(true);
		this.method6866(Static22.aClass120_2, 0);
		this.method6923(Static22.aClass120_2, 0);
	}

	@OriginalMember(owner = "client!ej", name = "T", descriptor = "(I)V")
	private void method6968() {
		this.aBoolean581 = false;
		if (Static550.aClass129_7 == this.aClass129_4) {
			this.method6991();
			this.method6955();
		}
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(Z)V")
	@Override
	public final void method6857(@OriginalArg(0) boolean arg0) {
		this.aBoolean573 = arg0;
		this.method6926();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!hi;ZLclient!ne;)Z")
	public abstract boolean method6969(@OriginalArg(0) Class141 arg0, @OriginalArg(2) Class239 arg1);

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V")
	@Override
	public final void method6813(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	@Override
	public final void method6787(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ej", name = "U", descriptor = "(I)V")
	private void method6970() {
		if (this.aBoolean583) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray51;
		@Pc(17) float local17 = (float) (this.anInt8410 * -this.anInt8424) / (float) this.anInt8445;
		@Pc(31) float local31 = (float) (this.anInt8410 * (this.anInt8277 - this.anInt8424)) / (float) this.anInt8445;
		@Pc(42) float local42 = (float) (this.anInt8413 * this.anInt8410) / (float) this.anInt8438;
		@Pc(56) float local56 = (float) ((this.anInt8413 - this.anInt8336) * this.anInt8410) / (float) this.anInt8438;
		if (local31 == local17 || local56 == local42) {
			local5[12] = 0.0F;
			local5[13] = 0.0F;
			local5[4] = 0.0F;
			local5[2] = 0.0F;
			local5[8] = 0.0F;
			local5[1] = 0.0F;
			local5[7] = 0.0F;
			local5[5] = 1.0F;
			local5[0] = 1.0F;
			local5[3] = 0.0F;
			local5[10] = 1.0F;
			local5[11] = 0.0F;
			local5[9] = 0.0F;
			local5[15] = 1.0F;
			local5[6] = 0.0F;
			local5[14] = 0.0F;
		} else {
			@Pc(70) float local70 = (float) this.anInt8410 * 2.0F;
			local5[3] = 0.0F;
			local5[14] = this.aFloat176 = (float) (this.anInt8410 * this.anInt8441) / (float) (this.anInt8410 - this.anInt8441);
			local5[0] = local70 / (local31 - local17);
			local5[8] = (local17 + local31) / (local31 - local17);
			local5[2] = 0.0F;
			local5[5] = local70 / (local42 - local56);
			local5[13] = 0.0F;
			local5[6] = 0.0F;
			local5[7] = 0.0F;
			local5[12] = 0.0F;
			local5[15] = 0.0F;
			local5[1] = 0.0F;
			local5[11] = -1.0F;
			local5[4] = 0.0F;
			local5[10] = this.aFloat184 = (float) this.anInt8441 / (float) (this.anInt8410 - this.anInt8441);
			local5[9] = (local42 + local56) / (local42 - local56);
		}
		this.method6944();
		this.aBoolean583 = true;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method6816() {
	}

	@OriginalMember(owner = "client!ej", name = "V", descriptor = "(I)V")
	protected abstract void method6971();

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(IZ)V")
	public abstract void method6972(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ej", name = "A", descriptor = "([I)V")
	@Override
	public final void A(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt8443;
		arg0[1] = this.anInt8412;
		arg0[0] = this.anInt8428;
		arg0[2] = this.anInt8429;
	}

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "()Z")
	@Override
	public final boolean method6848() {
		return false;
	}

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "()Z")
	@Override
	public final boolean method6789() {
		return true;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!ob;I)V")
	private void method6973(@OriginalArg(0) int arg0, @OriginalArg(1) Class247 arg1) {
		this.method6941(this.anInterface4_13, 0);
		this.method6890(this.aClass321_16);
		this.method6964(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!pf;IIII)Lclient!ba;")
	@Override
	public final Class9 method6779(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class9_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ej", name = "G", descriptor = "()F")
	public final float method6974() {
		return this.aFloat169;
	}

	@OriginalMember(owner = "client!ej", name = "AA", descriptor = "(IIII)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8442 = arg1;
		this.anInt8430 = arg3;
		this.anInt8448 = arg0;
		this.anInt8447 = arg2;
		this.aBoolean578 = true;
		this.method6957(0, 3, false, 0, false);
		if (this.aClass93_3 != null) {
			this.aClass93_3.method8006();
		}
		this.method6929();
		this.method6987();
	}

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "(B)V")
	protected abstract void method6975();

	@OriginalMember(owner = "client!ej", name = "W", descriptor = "(I)V")
	public final void method6976() {
		this.aClass134_Sub1_15.Y();
		this.aBoolean565 = true;
		this.method6945();
	}

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "(IIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8424 = arg0;
		this.anInt8445 = arg2;
		this.anInt8413 = arg1;
		this.anInt8438 = arg3;
		this.method6968();
		this.method6916();
		this.method6935();
		this.method6884();
	}

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "()Z")
	@Override
	public final boolean method6828() {
		return true;
	}

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "(B)V")
	protected abstract void method6977();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!c;)V")
	@Override
	public final void method6846(@OriginalArg(0) Class42 arg0) {
		this.aClass3_3.method56(arg0, this);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;B)Lclient!jaclib/memory/Stream;")
	public final Stream method6978(@OriginalArg(0) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!ej", name = "F", descriptor = "()V")
	@Override
	public final void F() {
		this.anInt8429 = this.anInt8277;
		this.anInt8443 = this.anInt8336;
		this.anInt8412 = 0;
		this.anInt8428 = 0;
		if (this.aBoolean585) {
			this.aBoolean585 = false;
			this.method6894();
		}
		this.method6884();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!nq;Z)V")
	public final void method6979(@OriginalArg(0) Interface15 arg0) {
		if (this.anInterface15Array3[this.anInt8432] == arg0) {
			return;
		}
		this.anInterface15Array3[this.anInt8432] = arg0;
		if (arg0 == null) {
			this.method6904();
		} else {
			arg0.method6761();
		}
		this.anInt8423 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ej", name = "X", descriptor = "(I)V")
	public final void method6980() {
		if (this.anInt8423 == 8) {
			return;
		}
		this.method6956();
		this.method6862(true);
		this.method6946(true);
		this.method6864(true);
		this.method6984(1);
		this.anInt8423 = 8;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public final Class13 method6802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class13_Sub3 local11 = new Class13_Sub3(this, arg2, arg3, arg4);
		local11.GA(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!ej", name = "Y", descriptor = "(I)V")
	private void method6981() {
		this.aFloat177 = (float) this.anInt8441 - this.aFloat180;
	}

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "(B)Lclient!haa;")
	public final Class134_Sub1 method6982() {
		return this.aClass134_Sub1_19;
	}

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "(B)V")
	private void method6983() {
		this.method6941(this.anInterface4_14, 0);
		this.method6890(this.aClass321_18);
		this.method6964(1, 0, Static238.aClass247_6);
	}

	@OriginalMember(owner = "client!ej", name = "ya", descriptor = "(IIIII)V")
	@Override
	public final void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6826(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(ZI)V")
	public final void method6984(@OriginalArg(1) int arg0) {
		if (this.anInt8415 == arg0) {
			return;
		}
		@Pc(29) Class194 local29;
		@Pc(33) boolean local33;
		@Pc(31) boolean local31;
		if (arg0 == 1) {
			local33 = true;
			local29 = Static272.aClass194_6;
			local31 = true;
		} else if (arg0 == 2) {
			local29 = Static79.aClass194_1;
			local31 = false;
			local33 = true;
		} else if (arg0 == 128) {
			local29 = Static226.aClass194_5;
			local31 = true;
			local33 = true;
		} else {
			local31 = false;
			local29 = Static194.aClass194_4;
			local33 = false;
		}
		if (local31 != this.aBoolean582) {
			this.aBoolean582 = local31;
			this.method6977();
		}
		if (this.aBoolean571 != local33) {
			this.aBoolean571 = local33;
			this.method6975();
		}
		if (local29 != this.aClass194_7) {
			this.aClass194_7 = local29;
			this.method6876();
		}
		this.anInt8423 &= 0xFFFFFFE3;
		this.anInt8415 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZZ)V")
	public final void method6985(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean567) {
			this.aBoolean567 = arg0;
			this.method6896();
			this.anInt8423 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ej", name = "Z", descriptor = "(I)V")
	protected final void method6986() {
		@Pc(15) Hashtable local15 = new Hashtable();
		if (this.aHashtable6 != null && !this.aHashtable6.isEmpty()) {
			@Pc(26) Enumeration local26 = this.aHashtable6.keys();
			while (local26.hasMoreElements()) {
				@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
				local15.put(local32, this.method6873(local32));
			}
		}
		this.aHashtable6 = local15;
		this.method6870();
		this.method6867();
		this.aClass3_3.method62(this);
	}

	@OriginalMember(owner = "client!ej", name = "ab", descriptor = "(I)V")
	protected abstract void method6987();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[Lclient!pv;)V")
	@Override
	public final void method6785(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub32[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass4_Sub32Array6[local7] = arg1[local7];
		}
		this.anInt8431 = arg0;
		if (this.aClass129_4.method3348()) {
			this.method6860();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!gf;ZBI)V")
	protected abstract void method6988(@OriginalArg(0) Class120 arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!ej", name = "bb", descriptor = "(I)V")
	public final void method6989() {
		this.aClass240Array5 = new Class240[this.anInt8426];
		this.aClass134_Sub1Array3 = new Class134_Sub1[this.anInt8426];
		this.aClass240Array6 = new Class240[this.anInt8426];
		this.aClass81Array3 = new Class81[this.anInt8426];
		this.anInterface15Array3 = new Interface15[this.anInt8426];
		for (@Pc(32) int local32 = 0; local32 < this.anInt8426; local32++) {
			this.aClass240Array6[local32] = Static152.aClass240_1;
			this.aClass240Array5[local32] = Static152.aClass240_1;
			this.aClass81Array3[local32] = Static114.aClass81_5;
			this.aClass134_Sub1Array3[local32] = new Class134_Sub1();
		}
		this.aClass4_Sub32Array6 = new Class4_Sub32[this.anInt8436 - 2];
		this.anInterface15_3 = this.method6995(Static349.aClass239_12, 1, Static85.aClass141_2, 1);
		this.method6800(new Class4_Sub6_Sub1(262144));
		this.aClass321_17 = this.method6903(new Class43[] { new Class43(new Class79[] { Static108.aClass79_1, Static108.aClass79_5 }) });
		this.aClass321_19 = this.method6903(new Class43[] { new Class43(new Class79[] { Static108.aClass79_1, Static108.aClass79_3 }) });
		this.aClass321_15 = this.method6903(new Class43[] { new Class43(Static108.aClass79_1), new Class43(Static108.aClass79_3), new Class43(Static108.aClass79_5), new Class43(Static108.aClass79_2) });
		this.aClass321_20 = this.method6903(new Class43[] { new Class43(Static108.aClass79_1), new Class43(Static108.aClass79_3), new Class43(Static108.aClass79_5) });
		this.aClass9_Sub2_27 = new Class9_Sub2(this, 0, 0, false, false);
		this.aClass9_Sub2_23 = new Class9_Sub2(this, 0, 0, true, true);
		this.aClass9_Sub2_21 = new Class9_Sub2(this, 0, 0, false, false);
		this.aClass9_Sub2_26 = new Class9_Sub2(this, 0, 0, true, true);
		this.aClass9_Sub2_22 = new Class9_Sub2(this, 0, 0, false, false);
		this.aClass9_Sub2_25 = new Class9_Sub2(this, 0, 0, true, true);
		this.aClass9_Sub2_30 = new Class9_Sub2(this, 0, 0, false, false);
		this.aClass9_Sub2_24 = new Class9_Sub2(this, 0, 0, true, true);
		this.aClass9_Sub2_28 = new Class9_Sub2(this, 0, 0, false, false);
		this.aClass9_Sub2_29 = new Class9_Sub2(this, 0, 0, true, true);
		this.aClass3_3 = new Class3(this);
		this.anInterface8_8 = this.method6859(true);
		this.method6986();
		this.aClass217_5 = new Class217(this);
		this.aClass93Array3[1] = this.method6897(1);
		this.aClass93Array3[2] = this.method6897(2);
		this.aClass93Array3[4] = this.method6897(4);
		this.aClass93Array3[5] = this.method6897(5);
		this.aClass93Array3[6] = this.method6897(6);
		this.aClass93Array3[7] = this.method6897(7);
		this.aClass93Array3[3] = this.method6897(3);
		this.aClass93Array3[8] = this.method6897(8);
		this.aClass93Array3[9] = this.method6897(9);
		if (!this.aClass93Array3[2].method7998()) {
			this.aClass93Array3[2] = this.method6897(0);
		}
		if (!this.aClass93Array3[4].method7998()) {
			this.aClass93Array3[4] = this.aClass93Array3[2];
		}
		if (!this.aClass93Array3[8].method7998()) {
			this.aClass93Array3[8] = this.aClass93Array3[4];
		}
		if (!this.aClass93Array3[9].method7998()) {
			this.aClass93Array3[9] = this.aClass93Array3[8];
		}
		this.method6942();
		this.F();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!mf;Z)V")
	public abstract void method6990(@OriginalArg(0) Class221 arg0);

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(IIIIII)Lclient!dn;")
	@Override
	public final Class75 method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class75_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "(B)V")
	private void method6991() {
		if (this.aBoolean581) {
			return;
		}
		@Pc(15) float[] local15 = this.aFloatArray54;
		@Pc(22) float local22 = (float) this.anInt8410 - this.aFloat180;
		@Pc(30) float local30 = (float) this.anInt8441 - this.aFloat180;
		@Pc(42) float local42 = this.aFloat171 * (float) -this.anInt8413 / (float) this.anInt8438;
		@Pc(54) float local54 = (float) -this.anInt8424 * this.aFloat171 / (float) this.anInt8445;
		@Pc(69) float local69 = (float) (this.anInt8277 - this.anInt8424) * this.aFloat171 / (float) this.anInt8445;
		@Pc(83) float local83 = (float) (this.anInt8336 - this.anInt8413) * this.aFloat171 / (float) this.anInt8438;
		if (local69 == local54 || local83 == local42) {
			local15[5] = 1.0F;
			local15[14] = 0.0F;
			local15[3] = 0.0F;
			local15[11] = 0.0F;
			local15[8] = 0.0F;
			local15[0] = 1.0F;
			local15[15] = 1.0F;
			local15[6] = 0.0F;
			local15[9] = 0.0F;
			local15[7] = 0.0F;
			local15[2] = 0.0F;
			local15[1] = 0.0F;
			local15[4] = 0.0F;
			local15[10] = 1.0F;
			local15[13] = 0.0F;
			local15[12] = 0.0F;
		} else {
			local15[8] = 0.0F;
			local15[7] = 0.0F;
			local15[9] = 0.0F;
			local15[3] = 0.0F;
			local15[6] = 0.0F;
			local15[12] = (local54 + local69) / (-local69 + local54);
			local15[15] = 1.0F;
			local15[14] = local22 / (local22 - local30);
			local15[4] = 0.0F;
			local15[11] = 0.0F;
			local15[2] = 0.0F;
			local15[1] = 0.0F;
			local15[10] = 1.0F / (local22 - local30);
			local15[5] = 2.0F / (local83 - local42);
			local15[0] = 2.0F / (local69 - local54);
			local15[13] = (local83 + local42) / (-local42 + local83);
		}
		this.method6981();
		this.aBoolean581 = true;
	}

	@OriginalMember(owner = "client!ej", name = "cb", descriptor = "(I)V")
	protected abstract void method6992();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIILclient!hi;[BZ)Lclient!ak;")
	protected abstract Interface2 method6994(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class141 arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) boolean arg4);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ne;IILclient!hi;I)Lclient!ak;")
	public abstract Interface2 method6995(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class141 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ej", name = "db", descriptor = "(I)V")
	public final void method6996() {
		if (this.anInt8423 == 4) {
			return;
		}
		this.method6915();
		this.method6862(false);
		this.method6985(false);
		this.method6946(false);
		this.method6864(false);
		this.method6899(false, -2, false);
		this.method6984(1);
		this.method6920(0);
		this.anInt8423 = 4;
	}

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "()I")
	@Override
	public final int method6832() {
		return this.anInt8436 - 2;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!nea;ILclient!nea;)V")
	public final void method6997(@OriginalArg(0) Class240 arg0, @OriginalArg(2) Class240 arg1) {
		@Pc(13) boolean local13 = false;
		if (this.aClass240Array5[this.anInt8432] != arg0) {
			this.aClass240Array5[this.anInt8432] = arg0;
			this.method6868();
			local13 = true;
		}
		if (arg1 != this.aClass240Array6[this.anInt8432]) {
			this.aClass240Array6[this.anInt8432] = arg1;
			this.method6892();
			local13 = true;
		}
		if (local13) {
			this.anInt8423 &= 0xFFFFFFE2;
		}
	}
}
