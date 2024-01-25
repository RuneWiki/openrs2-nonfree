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

@OriginalClass("client!bm")
public abstract class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!bm", name = "Pb", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!bm", name = "Ub", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!bm", name = "dc", descriptor = "Lclient!eb;")
	protected Class73 aClass73_3;

	@OriginalMember(owner = "client!bm", name = "Qc", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!bm", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!bm", name = "Xd", descriptor = "I")
	public int anInt2154;

	@OriginalMember(owner = "client!bm", name = "ae", descriptor = "I")
	public int anInt2156;

	@OriginalMember(owner = "client!bm", name = "be", descriptor = "I")
	protected int anInt2157;

	@OriginalMember(owner = "client!bm", name = "ie", descriptor = "Z")
	public boolean aBoolean166;

	@OriginalMember(owner = "client!bm", name = "je", descriptor = "I")
	public int anInt2158;

	@OriginalMember(owner = "client!bm", name = "pe", descriptor = "I")
	private int anInt2162;

	@OriginalMember(owner = "client!bm", name = "se", descriptor = "F")
	private float aFloat70;

	@OriginalMember(owner = "client!bm", name = "ue", descriptor = "I")
	protected int anInt2163;

	@OriginalMember(owner = "client!bm", name = "Be", descriptor = "I")
	protected int anInt2167;

	@OriginalMember(owner = "client!bm", name = "Ee", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!bm", name = "He", descriptor = "[Lclient!tv;")
	protected Class47_Sub3[] aClass47_Sub3Array3;

	@OriginalMember(owner = "client!bm", name = "Ke", descriptor = "Z")
	protected boolean aBoolean172;

	@OriginalMember(owner = "client!bm", name = "Le", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!bm", name = "Pe", descriptor = "[Lclient!bia;")
	private Interface3[] anInterface3Array3;

	@OriginalMember(owner = "client!bm", name = "Te", descriptor = "I")
	public int anInt2173;

	@OriginalMember(owner = "client!bm", name = "Ue", descriptor = "Lclient!bia;")
	public Interface3 anInterface3_3;

	@OriginalMember(owner = "client!bm", name = "bf", descriptor = "Z")
	protected boolean bf;

	@OriginalMember(owner = "client!bm", name = "cf", descriptor = "I")
	public int anInt2176;

	@OriginalMember(owner = "client!bm", name = "ff", descriptor = "Z")
	public boolean aBoolean176;

	@OriginalMember(owner = "client!bm", name = "gf", descriptor = "Lclient!fha;")
	private Class99 aClass99_3;

	@OriginalMember(owner = "client!bm", name = "jf", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!bm", name = "mf", descriptor = "I")
	public int anInt2179;

	@OriginalMember(owner = "client!bm", name = "of", descriptor = "Z")
	public boolean aBoolean179;

	@OriginalMember(owner = "client!bm", name = "pf", descriptor = "[Lclient!pk;")
	protected Class3_Sub27[] aClass3_Sub27Array3;

	@OriginalMember(owner = "client!bm", name = "zf", descriptor = "I")
	protected int anInt2186;

	@OriginalMember(owner = "client!bm", name = "Bf", descriptor = "Lclient!vfa;")
	private Class4_Sub2 aClass4_Sub2_3;

	@OriginalMember(owner = "client!bm", name = "Ff", descriptor = "F")
	private float aFloat80;

	@OriginalMember(owner = "client!bm", name = "Gf", descriptor = "[Lclient!vv;")
	protected Class363[] aClass363Array5;

	@OriginalMember(owner = "client!bm", name = "If", descriptor = "[Lclient!kh;")
	protected Class180[] aClass180Array3;

	@OriginalMember(owner = "client!bm", name = "Mf", descriptor = "I")
	private int anInt2190;

	@OriginalMember(owner = "client!bm", name = "Nf", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!bm", name = "Rf", descriptor = "I")
	protected int anInt2193;

	@OriginalMember(owner = "client!bm", name = "Sf", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!bm", name = "Tf", descriptor = "Lclient!aia;")
	private Class16 aClass16_3;

	@OriginalMember(owner = "client!bm", name = "Vf", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!bm", name = "eg", descriptor = "[Lclient!vv;")
	protected Class363[] aClass363Array6;

	@OriginalMember(owner = "client!bm", name = "fg", descriptor = "Lclient!ru;")
	private Interface23 anInterface23_3;

	@OriginalMember(owner = "client!bm", name = "gg", descriptor = "Lclient!mia;")
	private Class34 aClass34_15;

	@OriginalMember(owner = "client!bm", name = "hg", descriptor = "Lclient!oca;")
	public Class128_Sub3 aClass128_Sub3_21;

	@OriginalMember(owner = "client!bm", name = "ig", descriptor = "Lclient!oca;")
	public Class128_Sub3 aClass128_Sub3_22;

	@OriginalMember(owner = "client!bm", name = "jg", descriptor = "Lclient!oca;")
	public Class128_Sub3 aClass128_Sub3_23;

	@OriginalMember(owner = "client!bm", name = "kg", descriptor = "Lclient!oca;")
	public Class128_Sub3 aClass128_Sub3_24;

	@OriginalMember(owner = "client!bm", name = "lg", descriptor = "Lclient!oca;")
	public Class128_Sub3 aClass128_Sub3_25;

	@OriginalMember(owner = "client!bm", name = "mg", descriptor = "Lclient!mia;")
	public Class34 aClass34_16;

	@OriginalMember(owner = "client!bm", name = "ng", descriptor = "Lclient!oca;")
	public Class128_Sub3 aClass128_Sub3_26;

	@OriginalMember(owner = "client!bm", name = "og", descriptor = "Lclient!u;")
	private Interface26 anInterface26_8;

	@OriginalMember(owner = "client!bm", name = "pg", descriptor = "Lclient!mia;")
	public Class34 aClass34_17;

	@OriginalMember(owner = "client!bm", name = "qg", descriptor = "Lclient!u;")
	private Interface26 anInterface26_9;

	@OriginalMember(owner = "client!bm", name = "rg", descriptor = "Lclient!oca;")
	public Class128_Sub3 aClass128_Sub3_27;

	@OriginalMember(owner = "client!bm", name = "sg", descriptor = "Lclient!oca;")
	public Class128_Sub3 aClass128_Sub3_28;

	@OriginalMember(owner = "client!bm", name = "tg", descriptor = "Lclient!mia;")
	public Class34 aClass34_18;

	@OriginalMember(owner = "client!bm", name = "vg", descriptor = "Lclient!oca;")
	public Class128_Sub3 aClass128_Sub3_29;

	@OriginalMember(owner = "client!bm", name = "wg", descriptor = "Lclient!oca;")
	public Class128_Sub3 aClass128_Sub3_30;

	@OriginalMember(owner = "client!bm", name = "xg", descriptor = "Lclient!mia;")
	public Class34 aClass34_19;

	@OriginalMember(owner = "client!bm", name = "yg", descriptor = "Lclient!u;")
	private Interface26 anInterface26_10;

	@OriginalMember(owner = "client!bm", name = "zg", descriptor = "Lclient!mia;")
	private Class34 aClass34_20;

	@OriginalMember(owner = "client!bm", name = "Ag", descriptor = "Lclient!mia;")
	private Class34 aClass34_21;

	@OriginalMember(owner = "client!bm", name = "Bg", descriptor = "Z")
	protected boolean aBoolean185;

	@OriginalMember(owner = "client!bm", name = "Cg", descriptor = "I")
	private int anInt2198;

	@OriginalMember(owner = "client!bm", name = "Hb", descriptor = "Lclient!qia;")
	private final Class276 aClass276_12 = new Class276();

	@OriginalMember(owner = "client!bm", name = "Yd", descriptor = "Z")
	protected boolean aBoolean165 = true;

	@OriginalMember(owner = "client!bm", name = "Wd", descriptor = "Lclient!tv;")
	protected final Class47_Sub3 aClass47_Sub3_15 = new Class47_Sub3();

	@OriginalMember(owner = "client!bm", name = "ce", descriptor = "Lclient!tv;")
	public Class47_Sub3 aClass47_Sub3_16 = new Class47_Sub3();

	@OriginalMember(owner = "client!bm", name = "de", descriptor = "Lclient!tv;")
	public final Class47_Sub3 aClass47_Sub3_17 = new Class47_Sub3();

	@OriginalMember(owner = "client!bm", name = "ee", descriptor = "Lclient!tv;")
	protected final Class47_Sub3 aClass47_Sub3_18 = new Class47_Sub3();

	@OriginalMember(owner = "client!bm", name = "fe", descriptor = "Lclient!tv;")
	private final Class47_Sub3 aClass47_Sub3_19 = new Class47_Sub3();

	@OriginalMember(owner = "client!bm", name = "ge", descriptor = "Lclient!tv;")
	private final Class47_Sub3 aClass47_Sub3_20 = new Class47_Sub3();

	@OriginalMember(owner = "client!bm", name = "re", descriptor = "F")
	public float aFloat69 = 1.0F;

	@OriginalMember(owner = "client!bm", name = "te", descriptor = "[F")
	public final float[] aFloatArray27 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!bm", name = "oe", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!bm", name = "ye", descriptor = "F")
	public float aFloat71 = 1.0F;

	@OriginalMember(owner = "client!bm", name = "De", descriptor = "F")
	private float aFloat72 = 1.0F;

	@OriginalMember(owner = "client!bm", name = "Ve", descriptor = "F")
	public float aFloat75 = 3584.0F;

	@OriginalMember(owner = "client!bm", name = "Ce", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!bm", name = "he", descriptor = "[Lclient!aia;")
	private final Class16[] aClass16Array3 = new Class16[10];

	@OriginalMember(owner = "client!bm", name = "Re", descriptor = "I")
	protected int anInt2172 = 0;

	@OriginalMember(owner = "client!bm", name = "Me", descriptor = "[F")
	public final float[] aFloatArray29 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!bm", name = "Ye", descriptor = "Z")
	protected boolean aBoolean174 = false;

	@OriginalMember(owner = "client!bm", name = "Ne", descriptor = "I")
	public int anInt2170 = -1;

	@OriginalMember(owner = "client!bm", name = "Ge", descriptor = "Z")
	protected boolean aBoolean171 = false;

	@OriginalMember(owner = "client!bm", name = "Ze", descriptor = "I")
	private int anInt2175 = 0;

	@OriginalMember(owner = "client!bm", name = "Xe", descriptor = "I")
	public int anInt2174 = 0;

	@OriginalMember(owner = "client!bm", name = "ve", descriptor = "I")
	protected int anInt2164 = 0;

	@OriginalMember(owner = "client!bm", name = "ke", descriptor = "I")
	private int anInt2159 = 0;

	@OriginalMember(owner = "client!bm", name = "df", descriptor = "F")
	public float aFloat76 = 3584.0F;

	@OriginalMember(owner = "client!bm", name = "ne", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!bm", name = "xe", descriptor = "I")
	public int anInt2165 = 3;

	@OriginalMember(owner = "client!bm", name = "Je", descriptor = "I")
	protected int anInt2169 = 0;

	@OriginalMember(owner = "client!bm", name = "xf", descriptor = "I")
	private int anInt2184 = 0;

	@OriginalMember(owner = "client!bm", name = "Ae", descriptor = "I")
	public int anInt2166 = -1;

	@OriginalMember(owner = "client!bm", name = "Fe", descriptor = "Z")
	protected boolean aBoolean170 = false;

	@OriginalMember(owner = "client!bm", name = "We", descriptor = "[F")
	private final float[] aFloatArray31 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!bm", name = "qe", descriptor = "[F")
	private final float[] aFloatArray26 = new float[16];

	@OriginalMember(owner = "client!bm", name = "vf", descriptor = "I")
	protected int anInt2183 = 3584;

	@OriginalMember(owner = "client!bm", name = "sf", descriptor = "I")
	protected int anInt2182 = 0;

	@OriginalMember(owner = "client!bm", name = "hf", descriptor = "F")
	public float aFloat77 = 1.0F;

	@OriginalMember(owner = "client!bm", name = "uf", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!bm", name = "Cf", descriptor = "Lclient!k;")
	protected Class171 aClass171_4 = Static393.aClass171_6;

	@OriginalMember(owner = "client!bm", name = "ef", descriptor = "I")
	public int anInt2177 = 0;

	@OriginalMember(owner = "client!bm", name = "Jf", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!bm", name = "Oe", descriptor = "[F")
	private final float[] aFloatArray30 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!bm", name = "tf", descriptor = "Z")
	protected boolean aBoolean180 = true;

	@OriginalMember(owner = "client!bm", name = "le", descriptor = "I")
	public int anInt2160 = 8;

	@OriginalMember(owner = "client!bm", name = "af", descriptor = "Z")
	protected boolean aBoolean175 = true;

	@OriginalMember(owner = "client!bm", name = "Ie", descriptor = "I")
	protected int anInt2168 = 0;

	@OriginalMember(owner = "client!bm", name = "Ef", descriptor = "F")
	public float aFloat79 = -1.0F;

	@OriginalMember(owner = "client!bm", name = "Lf", descriptor = "[F")
	private final float[] aFloatArray33 = new float[16];

	@OriginalMember(owner = "client!bm", name = "yf", descriptor = "I")
	public int anInt2185 = 512;

	@OriginalMember(owner = "client!bm", name = "lf", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!bm", name = "Df", descriptor = "I")
	private int anInt2187 = -1;

	@OriginalMember(owner = "client!bm", name = "Pf", descriptor = "Z")
	protected boolean aBoolean183 = true;

	@OriginalMember(owner = "client!bm", name = "wf", descriptor = "[F")
	private final float[] aFloatArray32 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!bm", name = "me", descriptor = "I")
	public int anInt2161 = 50;

	@OriginalMember(owner = "client!bm", name = "Qf", descriptor = "I")
	protected final int anInt2192 = 0;

	@OriginalMember(owner = "client!bm", name = "Kf", descriptor = "I")
	private int anInt2189 = 0;

	@OriginalMember(owner = "client!bm", name = "Se", descriptor = "Z")
	protected boolean aBoolean173 = false;

	@OriginalMember(owner = "client!bm", name = "Af", descriptor = "Lclient!er;")
	protected Class86 aClass86_4 = Static281.aClass86_10;

	@OriginalMember(owner = "client!bm", name = "Of", descriptor = "I")
	private int anInt2191 = 16777215;

	@OriginalMember(owner = "client!bm", name = "ag", descriptor = "F")
	public float aFloat84 = -1.0F;

	@OriginalMember(owner = "client!bm", name = "Hf", descriptor = "I")
	public int anInt2188 = 128;

	@OriginalMember(owner = "client!bm", name = "nf", descriptor = "Z")
	protected boolean aBoolean178 = true;

	@OriginalMember(owner = "client!bm", name = "Yf", descriptor = "[F")
	private final float[] aFloatArray34 = new float[16];

	@OriginalMember(owner = "client!bm", name = "dg", descriptor = "I")
	public int anInt2197 = 0;

	@OriginalMember(owner = "client!bm", name = "Uf", descriptor = "I")
	protected final int anInt2194 = 0;

	@OriginalMember(owner = "client!bm", name = "rf", descriptor = "I")
	private int anInt2181 = 1;

	@OriginalMember(owner = "client!bm", name = "qf", descriptor = "I")
	public int anInt2180 = 512;

	@OriginalMember(owner = "client!bm", name = "cg", descriptor = "I")
	private int anInt2196 = -1;

	@OriginalMember(owner = "client!bm", name = "ze", descriptor = "[F")
	protected float[] aFloatArray28 = this.aFloatArray32;

	@OriginalMember(owner = "client!bm", name = "Zf", descriptor = "Z")
	protected boolean aBoolean184 = true;

	@OriginalMember(owner = "client!bm", name = "bg", descriptor = "F")
	public float aFloat85 = 1.0F;

	@OriginalMember(owner = "client!bm", name = "Wf", descriptor = "I")
	private int anInt2195 = -1;

	@OriginalMember(owner = "client!bm", name = "Xf", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream3 = new Stream();

	@OriginalMember(owner = "client!bm", name = "ug", descriptor = "Lclient!tv;")
	private final Class47_Sub3 aClass47_Sub3_21 = new Class47_Sub3();

	@OriginalMember(owner = "client!bm", name = "Db", descriptor = "Lclient!kha;")
	protected final Class181 aClass181_14;

	@OriginalMember(owner = "client!bm", name = "Ac", descriptor = "Ljava/lang/Object;")
	protected final Object anObject7;

	@OriginalMember(owner = "client!bm", name = "Y", descriptor = "Ljava/lang/Object;")
	private Object anObject6;

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas6;

	@OriginalMember(owner = "client!bm", name = "V", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!bm", name = "Qe", descriptor = "I")
	protected final int anInt2171;

	@OriginalMember(owner = "client!bm", name = "kf", descriptor = "I")
	public final int anInt2178;

	@OriginalMember(owner = "client!bm", name = "Ed", descriptor = "I")
	private int anInt2136;

	@OriginalMember(owner = "client!bm", name = "hd", descriptor = "I")
	public int anInt2113;

	@OriginalMember(owner = "client!bm", name = "Uc", descriptor = "I")
	private int anInt2100;

	@OriginalMember(owner = "client!bm", name = "ld", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "client!bm", name = "we", descriptor = "Lclient!fl;")
	private final Class101 aClass101_3;

	@OriginalMember(owner = "client!bm", name = "pb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!kha;II)V")
	protected Class33_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(3) Class181 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.aClass181_14 = arg3;
			this.anObject6 = this.anObject7 = arg1;
			this.aCanvas7 = this.aCanvas6 = arg0;
			this.anInt2171 = arg4;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt2178 = arg5;
			this.anInt2113 = this.anInt2136 = local307.width;
			this.anInt2117 = this.anInt2100 = local307.height;
			Static146.method3249(false, true);
			if (super.anInterface5_11 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt2178);
				this.aClass101_3 = null;
			} else {
				this.aClass101_3 = new Class101(this, super.anInterface5_11);
				this.aNativeInterface3 = new NativeInterface(super.anInterface5_11.method6872(), this.anInt2178);
				for (@Pc(352) int local352 = 0; local352 < super.anInterface5_11.method6872(); local352++) {
					@Pc(360) Class156 local360 = super.anInterface5_11.method6869(local352);
					if (local360 != null) {
						this.aNativeInterface3.initTextureMetrics(local352, local360.aByte71, local360.aByte74);
					}
				}
			}
		} catch (@Pc(391) Throwable local391) {
			local391.printStackTrace();
			this.method6151();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)Lclient!sq;")
	public final Interface24 method1982() {
		return this.aClass4_Sub2_3 == null ? null : this.aClass4_Sub2_3.method6710();
	}

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "()Lclient!wc;")
	@Override
	public final Class47 method6200() {
		return this.aClass47_Sub3_16;
	}

	@OriginalMember(owner = "client!bm", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6168(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!bm", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass47_Sub3_16.aFloat263 + (float) arg1 * this.aClass47_Sub3_16.aFloat260 + this.aClass47_Sub3_16.aFloat259 * (float) arg0 + (float) arg2 * this.aClass47_Sub3_16.aFloat258;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass47_Sub3_16.aFloat258 * (float) arg5 + (float) arg4 * this.aClass47_Sub3_16.aFloat260 + this.aClass47_Sub3_16.aFloat259 * (float) arg3 + this.aClass47_Sub3_16.aFloat263;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt2161 > local32 && local63 < (float) this.anInt2161) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt2183 && (float) this.anInt2183 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt2185 * (this.aClass47_Sub3_16.aFloat254 + (float) arg0 * this.aClass47_Sub3_16.aFloat257 + (float) arg1 * this.aClass47_Sub3_16.aFloat261 + this.aClass47_Sub3_16.aFloat253 * (float) arg2) / local32);
		@Pc(167) int local167 = (int) ((this.aClass47_Sub3_16.aFloat254 + this.aClass47_Sub3_16.aFloat253 * (float) arg5 + (float) arg4 * this.aClass47_Sub3_16.aFloat261 + (float) arg3 * this.aClass47_Sub3_16.aFloat257) * (float) this.anInt2185 / local63);
		if (this.aFloat82 > (float) local135 && this.aFloat82 > (float) local167) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat83 && (float) local167 > this.aFloat83) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass47_Sub3_16.aFloat256 + (float) arg2 * this.aClass47_Sub3_16.aFloat262 + (float) arg0 * this.aClass47_Sub3_16.aFloat264 + (float) arg1 * this.aClass47_Sub3_16.aFloat255) * (float) this.anInt2180 / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt2180 * ((float) arg3 * this.aClass47_Sub3_16.aFloat264 + (float) arg4 * this.aClass47_Sub3_16.aFloat255 + (float) arg5 * this.aClass47_Sub3_16.aFloat262 + this.aClass47_Sub3_16.aFloat256) / local63);
		if (this.aFloat78 > (float) local233 && (float) local265 < this.aFloat78) {
			local7 |= 0x4;
		} else if (this.aFloat74 < (float) local233 && (float) local265 > this.aFloat74) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!vv;Lclient!vv;)V")
	public final void method1983(@OriginalArg(1) Class363 arg0, @OriginalArg(2) Class363 arg1) {
		@Pc(5) boolean local5 = false;
		if (this.aClass363Array6[this.anInt2164] != arg1) {
			this.aClass363Array6[this.anInt2164] = arg1;
			this.method2059();
			local5 = true;
		}
		if (arg0 != this.aClass363Array5[this.anInt2164]) {
			this.aClass363Array5[this.anInt2164] = arg0;
			this.method2067();
			local5 = true;
		}
		if (local5) {
			this.anInt2162 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt2161;
	}

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "(I)I")
	public final int method1984() {
		return this.anInt2184;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V")
	protected abstract void method1985(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!em;I[FIZ)Lclient!baa;")
	public final Interface2 method1986(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) boolean arg4) {
		return this.method1994(arg2, arg4, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZLclient!bia;)V")
	public final void method1987(@OriginalArg(1) Interface3 arg0) {
		if (arg0 == this.anInterface3Array3[this.anInt2164]) {
			return;
		}
		this.anInterface3Array3[this.anInt2164] = arg0;
		if (arg0 == null) {
			this.method2037();
		} else {
			arg0.method7293();
		}
		this.anInt2162 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!bm", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt2165 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt2165++;
		}
		this.anInt2160 = 0x1 << this.anInt2165;
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)V")
	@Override
	public final void method6184(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZIZILclient!wga;)V")
	public abstract void method1988(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class371 arg3);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!tj;)V")
	@Override
	public final void method6219(@OriginalArg(0) Class4 arg0) {
		this.aClass4_Sub2_3 = (Class4_Sub2) arg0;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V")
	protected abstract void method1989();

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)Lclient!za;")
	@Override
	public final Class3_Sub5 method6158(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub5_Sub2 local8 = new Class3_Sub5_Sub2(arg0);
		this.aClass276_12.method6906(local8);
		return local8;
	}

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "()V")
	@Override
	protected void method6224() {
		if (this.aBoolean167) {
			return;
		}
		for (@Pc(13) Class3 local13 = this.aClass276_12.method6907(); local13 != null; local13 = this.aClass276_12.method6912()) {
			((Class3_Sub5_Sub2) local13).method3544();
		}
		@Pc(30) Enumeration local30 = this.aHashtable5.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method1985(this.aHashtable5.get(local36), local36);
		}
		Static577.method6361(false, true);
		this.aNativeInterface3.release();
		this.aBoolean167 = true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)Lclient!ru;")
	public final Interface23 method1990(@OriginalArg(0) int arg0) {
		if (arg0 * 2 > this.anInterface23_3.method7621()) {
			this.anInterface23_3.method7624(arg0);
		}
		return this.anInterface23_3;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!wga;IB)V")
	public final void method1991(@OriginalArg(0) Class371 arg0, @OriginalArg(1) int arg1) {
		this.method2049(arg0, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Interface2 local9 = local6.anInterface2_2;
		this.method2101();
		this.method1987(local9);
		this.method2032(1);
		this.method1983(Static64.aClass363_7, Static64.aClass363_7);
		this.method2098(0, Static139.aClass371_3);
		this.method1996(arg0);
		this.aClass47_Sub3_15.method7901((float) this.anInt2117, 0.0F, (float) this.anInt2113);
		this.method2042();
		this.aClass47_Sub3Array3[0].method7901(local9.method6504((float) this.anInt2117), 1.0F, local9.method6503((float) this.anInt2113));
		this.aClass47_Sub3Array3[0].method7882(local9.method6503((float) -arg2), local9.method6504((float) -arg3), 0.0F);
		this.aClass180Array3[0] = Static235.aClass180_4;
		this.method2019();
		this.method2065();
		this.method2029();
		this.method2098(0, Static419.aClass371_4);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III[BZLclient!em;)Lclient!baa;")
	public final Interface2 method1992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class82 arg4) {
		return this.method2063(arg1, arg3, arg2, arg0, arg4);
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(B)V")
	private void method1993() {
		if (Static443.aClass171_8 == this.aClass171_4) {
			return;
		}
		@Pc(6) Class171 local6 = this.aClass171_4;
		this.aClass171_4 = Static443.aClass171_8;
		if (!local6.method4947()) {
			this.method2000();
		}
		this.method2050();
		this.aFloatArray28 = this.aFloatArray26;
		this.method2107();
		this.anInt2162 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BIIZ[FILclient!em;I)Lclient!baa;")
	protected abstract Interface2 method1994(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) float[] arg2, @OriginalArg(6) Class82 arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method6171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(18) float local18 = (float) -arg1 + (float) arg3;
		@Pc(43) float local43;
		if (local11 == 0.0F && local18 == 0.0F) {
			local11 = 1.0F;
		} else {
			local43 = (float) (1.0D / Math.sqrt((double) (local11 * local11 + local18 * local18)));
			local18 *= local43;
			local11 *= local43;
		}
		this.method2058();
		this.method1996(arg4);
		this.method2098(0, Static139.aClass371_3);
		this.method1991(Static139.aClass371_3, 0);
		this.method2032(1);
		this.method2014();
		this.method2102(false);
		@Pc(85) int local85 = arg7 % (arg6 + arg5);
		local43 = local11 * (float) arg5;
		@Pc(95) float local95 = local18 * (float) arg5;
		@Pc(97) float local97 = 0.0F;
		@Pc(99) float local99 = 0.0F;
		@Pc(101) float local101 = local43;
		@Pc(103) float local103 = local95;
		if (arg5 < local85) {
			local97 = (float) (arg5 + arg6 - local85) * local11;
			local99 = (float) (arg5 + arg6 - local85) * local18;
		} else {
			local103 = local18 * (float) (arg5 - local85);
			local101 = (float) (arg5 - local85) * local11;
		}
		@Pc(148) float local148 = (float) arg0 + local97;
		@Pc(153) float local153 = local99 + (float) arg1;
		@Pc(158) float local158 = (float) arg6 * local11;
		@Pc(163) float local163 = (float) arg6 * local18;
		while (true) {
			if (arg0 >= arg2) {
				if (local148 < (float) arg2) {
					break;
				}
				if ((float) arg2 > local101 + local148) {
					local101 = (float) arg2 - local148;
				}
			} else {
				if ((float) arg2 < local148) {
					break;
				}
				if (local148 + local101 > (float) arg2) {
					local101 = (float) arg2 - local148;
				}
			}
			if (arg3 <= arg1) {
				if (local153 < (float) arg3) {
					break;
				}
				if (local103 + local153 < (float) arg3) {
					local103 = (float) arg3 - local153;
				}
			} else {
				if ((float) arg3 < local153) {
					break;
				}
				if (local153 + local103 > (float) arg3) {
					local103 = (float) arg3 - local153;
				}
			}
			if (!this.method2038(local148, 0.0F, local153, local103 + local153, local101 + local148, 0.0F)) {
				return;
			}
			local153 += local103 + local163;
			this.method2070();
			local148 += local158 + local101;
			local101 = local43;
			local103 = local95;
		}
		this.method2102(true);
		this.method1991(Static419.aClass371_4, 0);
		this.method2098(0, Static419.aClass371_4);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZI)V")
	public final void method1995(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean178 != arg0) {
			this.aBoolean178 = arg0;
			this.method2018();
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(IB)V")
	public final void method1996(@OriginalArg(0) int arg0) {
		if (this.anInt2167 != arg0) {
			this.anInt2167 = arg0;
			this.method2099();
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "()Z")
	@Override
	public final boolean method6166() {
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "(I)Lclient!tv;")
	public final Class47_Sub3 method1997() {
		return this.aClass47_Sub3_18;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZZ)Lclient!ru;")
	public abstract Interface23 method1998(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(B)V")
	protected void method1999() {
		this.method2081();
	}

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "(I)V")
	private void method2000() {
		this.aBoolean177 = false;
		if (this.aClass16_3 != null) {
			this.aClass16_3.method8600();
		}
		this.method2066();
	}

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "(I)V")
	@Override
	public final void method6232(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass101_3 != null) {
			this.aClass101_3.method3355();
		}
		this.anInt2188 = arg0;
	}

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "(I)V")
	protected abstract void method2001();

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6227(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas6 == arg0) {
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
			@Pc(53) Object local53 = this.method2064(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!bm", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean166) {
			throw new RuntimeException("");
		}
		this.anInt2184 = arg3;
		this.anInt2190 = arg0;
		this.anInt2187 = arg1;
		this.anInt2196 = arg2;
		if (this.aBoolean182) {
			this.aClass16Array3[3].method8606();
			this.aClass16Array3[3].method8599();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!be;Z)Lclient!ac;")
	@Override
	public final Class5 method6161(@OriginalArg(0) Class28 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class5 local21;
		if (arg0.anInt618 == 0 || arg0.anInt616 == 0) {
			local21 = this.method6204(1, 1, new int[1], 1);
		} else {
			@Pc(30) int[] local30 = new int[arg0.anInt616 * arg0.anInt618];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			@Pc(39) int local39;
			@Pc(43) int local43;
			if (arg0.aByteArray3 == null) {
				for (local39 = 0; local39 < arg0.anInt616; local39++) {
					for (local43 = 0; local43 < arg0.anInt618; local43++) {
						@Pc(97) int local97 = arg0.anIntArray36[arg0.aByteArray2[local32++] & 0xFF];
						local30[local34++] = local97 == 0 ? 0 : local97 | 0xFF000000;
					}
				}
			} else {
				for (local39 = 0; local39 < arg0.anInt616; local39++) {
					for (local43 = 0; local43 < arg0.anInt618; local43++) {
						local30[local34++] = arg0.anIntArray36[arg0.aByteArray2[local32] & 0xFF] | arg0.aByteArray3[local32] << 24;
						local32++;
					}
				}
			}
			local21 = this.method6204(arg0.anInt616, arg0.anInt618, local30, arg0.anInt618);
		}
		local21.method7586(arg0.anInt617, arg0.anInt614, arg0.anInt619, arg0.anInt615);
		return local21;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ)V")
	public final void method2002(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean173) {
			this.aBoolean173 = arg0;
			this.method2022();
			this.anInt2162 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "(I)V")
	@Override
	public final void method6212() {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!mia;)V")
	public abstract void method2003(@OriginalArg(1) Class34 arg0);

	@OriginalMember(owner = "client!bm", name = "w", descriptor = "()Lclient!wc;")
	@Override
	public final Class47 method6225() {
		return this.aClass47_Sub3_21;
	}

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "(I)V")
	@Override
	public void method6201(@OriginalArg(0) int arg0) {
		if (this.aClass101_3 != null) {
			this.aClass101_3.method3354();
		}
		this.anInt2179 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class274 method6206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class274_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "(I)V")
	public final void method2004() {
		if (this.anInt2162 == 16) {
			return;
		}
		this.method1993();
		this.method2021(true);
		this.method2002(true);
		this.method2080(true);
		this.method2032(1);
		this.anInt2162 = 16;
	}

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "(I)V")
	public final void method2005() {
		if (this.anInt2162 == 4) {
			return;
		}
		this.method2115();
		this.method2021(false);
		this.method2044(false);
		this.method2002(false);
		this.method2080(false);
		this.method2012(false, -2, false);
		this.method2032(1);
		this.method2105(0);
		this.anInt2162 = 4;
	}

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "(B)V")
	protected abstract void method2006();

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!ew;BLclient!em;)Z")
	public abstract boolean method2007(@OriginalArg(0) Class89 arg0, @OriginalArg(2) Class82 arg1);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!cd;I)V")
	@Override
	public final void method6214(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		this.aClass99_3.method3293(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(IZ)Lclient!u;")
	public abstract Interface26 method2008(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!bm", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt2169 = 0;
		this.anInt2182 = 0;
		this.anInt2168 = this.anInt2113;
		this.anInt2172 = this.anInt2117;
		if (this.aBoolean185) {
			this.aBoolean185 = false;
			this.method2110();
		}
		this.method2057();
	}

	@OriginalMember(owner = "client!bm", name = "A", descriptor = "()Z")
	@Override
	public final boolean method6237() {
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6159(@OriginalArg(0) Canvas arg0) {
		this.aCanvas7 = null;
		this.anObject6 = null;
		if (arg0 == null || this.aCanvas6 == arg0) {
			this.anObject6 = this.anObject7;
			this.aCanvas7 = this.aCanvas6;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject6 = this.aHashtable5.get(arg0);
			this.aCanvas7 = arg0;
		}
		if (this.aCanvas7 == null || this.anObject6 == null) {
			throw new RuntimeException();
		}
		this.method2113(this.anObject6, this.aCanvas7);
		this.method2097();
	}

	@OriginalMember(owner = "client!bm", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "()Lclient!wc;")
	@Override
	public final Class47 method6223() {
		return new Class47_Sub3();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBLclient!em;[BI)Lclient!ob;")
	public abstract Interface17 method2009(@OriginalArg(3) Class82 arg0, @OriginalArg(4) byte[] arg1);

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(ZI)V")
	public final void method2010(@OriginalArg(1) int arg0) {
		if (this.anInt2164 != arg0) {
			this.anInt2164 = arg0;
			this.method2068();
		}
	}

	@OriginalMember(owner = "client!bm", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass47_Sub3_16.aFloat260 * (float) arg1 + (float) arg0 * this.aClass47_Sub3_16.aFloat259 + this.aClass47_Sub3_16.aFloat258 * (float) arg2 + this.aClass47_Sub3_16.aFloat263;
		@Pc(57) float local57 = this.aClass47_Sub3_16.aFloat258 * (float) arg5 + this.aClass47_Sub3_16.aFloat260 * (float) arg4 + this.aClass47_Sub3_16.aFloat259 * (float) arg3 + this.aClass47_Sub3_16.aFloat263;
		if (local32 < (float) this.anInt2161 && (float) this.anInt2161 > local57) {
			local7 |= 0x10;
		} else if ((float) this.anInt2183 < local32 && (float) this.anInt2183 < local57) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass47_Sub3_16.aFloat253 * (float) arg2 + (float) arg1 * this.aClass47_Sub3_16.aFloat261 + this.aClass47_Sub3_16.aFloat257 * (float) arg0 + this.aClass47_Sub3_16.aFloat254) * (float) this.anInt2185 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt2185 * ((float) arg3 * this.aClass47_Sub3_16.aFloat257 + (float) arg4 * this.aClass47_Sub3_16.aFloat261 + (float) arg5 * this.aClass47_Sub3_16.aFloat253 + this.aClass47_Sub3_16.aFloat254) / (float) arg6);
		if (this.aFloat82 > (float) local124 && (float) local157 < this.aFloat82) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat83 && this.aFloat83 < (float) local157) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) (((float) arg1 * this.aClass47_Sub3_16.aFloat255 + (float) arg0 * this.aClass47_Sub3_16.aFloat264 + (float) arg2 * this.aClass47_Sub3_16.aFloat262 + this.aClass47_Sub3_16.aFloat256) * (float) this.anInt2180 / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt2180 * ((float) arg5 * this.aClass47_Sub3_16.aFloat262 + this.aClass47_Sub3_16.aFloat255 * (float) arg4 + (float) arg3 * this.aClass47_Sub3_16.aFloat264 + this.aClass47_Sub3_16.aFloat256) / (float) arg6);
		if (this.aFloat78 > (float) local224 && (float) local257 < this.aFloat78) {
			local7 |= 0x4;
		} else if ((float) local224 > this.aFloat74 && this.aFloat74 < (float) local257) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(FI)V")
	public final void method2011(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat72) {
			this.aFloat72 = arg0;
			this.method2034();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZIIZ)V")
	public final void method2012(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt2195 || this.aBoolean166 != this.aBoolean182) {
			@Pc(30) Interface2 local30 = null;
			@Pc(32) int local32 = 0;
			@Pc(34) byte local34 = 0;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = this.aBoolean166 ? 3 : 0;
			if (arg1 < 0) {
				this.method2029();
			} else {
				local30 = this.aClass101_3.method3356(arg1);
				@Pc(60) Class156 local60 = super.anInterface5_11.method6869(arg1);
				if (local60.aByte68 == 0 && local60.aByte73 == 0) {
					this.method2029();
				} else {
					@Pc(73) int local73 = local60.aBoolean494 ? 64 : 128;
					@Pc(77) int local77 = local73 * 50;
					@Pc(81) Class47_Sub3 local81 = this.method2020();
					local81.method7886((float) (this.anInt2179 % local77 * local60.aByte73) / (float) local77, (float) (this.anInt2179 % local77 * local60.aByte68) / (float) local77, 0.0F);
					this.method2088(Static235.aClass180_4);
				}
				local32 = local60.anInt5676;
				if (!this.aBoolean166) {
					local43 = local60.aByte69;
					local34 = local60.aByte72;
					local36 = local60.anInt5678;
				}
			}
			this.method2045(arg0, local43, local34, arg2, local36);
			if (this.aClass16_3 == null) {
				this.method1987(local30);
				this.method2105(local32);
			} else {
				this.aClass16_3.method8611(local30, local32);
			}
			this.anInt2195 = arg1;
			this.aBoolean182 = this.aBoolean166;
		}
		this.anInt2162 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III[IZII)Lclient!baa;")
	public abstract Interface2 method2013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "(B)V")
	public final void method2014() {
		this.aClass47_Sub3_15.method7878();
		this.aBoolean165 = true;
		this.method2054();
	}

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "(I)V")
	protected void method2015() {
		this.anInt2186 = this.anInt2193;
		this.anInt2193 = 0;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!tba;[Lclient!be;Z)Lclient!da;")
	@Override
	public final Class25 method6202(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class28[] arg1) {
		return new Class25_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "(I)Lclient!tv;")
	public final Class47_Sub3 method2016() {
		return this.aClass47_Sub3_19;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLclient!em;Lclient!ew;)Z")
	public abstract boolean method2017(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class89 arg1);

	@OriginalMember(owner = "client!bm", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt2198;
	}

	@OriginalMember(owner = "client!bm", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt2174, this.anInt2177, this.anInt2185, this.anInt2180 };
	}

	@OriginalMember(owner = "client!bm", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat85) {
			this.aFloat85 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method2047();
			this.method2043();
		}
	}

	@OriginalMember(owner = "client!bm", name = "r", descriptor = "(I)V")
	protected abstract void method2018();

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "(B)V")
	private void method2019() {
		this.method2027();
		if (this.aClass16_3 != null) {
			this.aClass16_3.method8610();
		}
	}

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "()Z")
	@Override
	public final boolean method6192() {
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!bm", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass47_Sub3_16.method7883((float) arg2, (float) arg0, (float) arg1);
		if ((float) this.anInt2161 > local14 || local14 > (float) this.anInt2183) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt2185 * this.aClass47_Sub3_16.method7889((float) arg1, (float) arg0, (float) arg2) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt2180 * this.aClass47_Sub3_16.method7887((float) arg0, (float) arg2, (float) arg1) / (float) arg3);
		arg4[2] = (int) local14;
		arg4[1] = (int) ((float) local77 - this.aFloat78);
		arg4[0] = (int) ((float) local58 - this.aFloat82);
	}

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "(I)Lclient!tv;")
	public final Class47_Sub3 method2020() {
		return this.aClass47_Sub3Array3[this.anInt2164];
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BZ)V")
	public final void method2021(@OriginalArg(1) boolean arg0) {
		if (this.bf != arg0) {
			this.bf = arg0;
			this.method2006();
			this.anInt2162 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bm", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean184 = arg0;
		this.method2073();
	}

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "(B)V")
	protected abstract void method2022();

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([IZBII)Lclient!baa;")
	public final Interface2 method2023(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method2013(arg3, arg2, arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "(B)[F")
	public final float[] method2024() {
		return this.aFloatArray32;
	}

	@OriginalMember(owner = "client!bm", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2196 = arg2;
		this.anInt2184 = arg3;
		this.anInt2187 = arg1;
		this.anInt2190 = arg0;
		this.aBoolean166 = true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6189(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas6) {
			local5 = this.anObject6;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method2060(arg0, local5);
		if (arg0 == this.aCanvas7) {
			this.method2097();
		}
	}

	@OriginalMember(owner = "client!bm", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2177 = arg1;
		this.anInt2185 = arg2;
		this.anInt2180 = arg3;
		this.anInt2174 = arg0;
		this.method2034();
		this.method2051();
		this.method2069();
		this.method2057();
	}

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "(B)V")
	private void method2025() {
		this.anInterface26_9 = this.method2008(true);
		this.anInterface26_9.method7633(12, 24);
		this.aClass34_20 = this.method2090(new Class151[] { new Class151(Static570.aClass333_1) });
	}

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "(B)V")
	protected abstract void method2026();

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "(B)V")
	protected abstract void method2027();

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "(I)V")
	protected abstract void method2028();

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "(B)V")
	public final void method2029() {
		if (this.aClass180Array3[this.anInt2164] != Static259.aClass180_5) {
			this.aClass180Array3[this.anInt2164] = Static259.aClass180_5;
			this.aClass47_Sub3Array3[this.anInt2164].method7878();
			this.method2019();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!tv;I)V")
	public final void method2030(@OriginalArg(0) Class47_Sub3 arg0) {
		this.aClass47_Sub3_15.method7877(arg0);
		this.aBoolean165 = false;
		this.method2054();
	}

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "(B)V")
	public final void method2031() {
		if (this.anInt2162 == 8) {
			return;
		}
		this.method2104();
		this.method2021(true);
		this.method2002(true);
		this.method2080(true);
		this.method2032(1);
		this.anInt2162 = 8;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method6163() {
	}

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "()Z")
	@Override
	public final boolean method6221() {
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "(II)V")
	public final void method2032(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt2181) {
			return;
		}
		@Pc(20) Class86 local20;
		@Pc(16) boolean local16;
		@Pc(18) boolean local18;
		if (arg0 == 1) {
			local16 = true;
			local18 = true;
			local20 = Static281.aClass86_10;
		} else if (arg0 == 2) {
			local20 = Static62.aClass86_2;
			local18 = false;
			local16 = true;
		} else if (arg0 == 128) {
			local20 = Static478.aClass86_11;
			local16 = true;
			local18 = true;
		} else {
			local18 = false;
			local16 = false;
			local20 = Static271.aClass86_7;
		}
		if (local18 != this.aBoolean183) {
			this.aBoolean183 = local18;
			this.method2072();
		}
		if (this.aBoolean180 != local16) {
			this.aBoolean180 = local16;
			this.method2001();
		}
		if (this.aClass86_4 != local20) {
			this.aClass86_4 = local20;
			this.method2026();
		}
		this.anInt2181 = arg0;
		this.anInt2162 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "(I)V")
	private void method2033() {
		if (this.aClass16_3 != null) {
			this.aClass16_3.method8599();
		}
		this.method2074();
	}

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "(I)V")
	private void method2034() {
		this.aBoolean181 = false;
		this.method2050();
		if (Static443.aClass171_8 == this.aClass171_4) {
			this.method2107();
		}
	}

	@OriginalMember(owner = "client!bm", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2058();
		this.method1996(arg3);
		this.method2098(0, Static139.aClass371_3);
		this.method1991(Static139.aClass371_3, 0);
		this.method2032(arg4);
		this.aClass47_Sub3_15.method7901((float) arg2, 1.0F, (float) arg2);
		this.aClass47_Sub3_15.method7876(arg0, arg1, 0);
		this.method2042();
		this.method2102(false);
		this.method2046(this.anInterface26_8, 0);
		this.method2003(this.aClass34_15);
		this.method2039(256, Static88.aClass304_2, 0);
		this.method2102(true);
		this.method1991(Static419.aClass371_4, 0);
		this.method2098(0, Static419.aClass371_4);
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method2114();
		this.method2058();
		this.method1996(arg4);
		this.method2098(0, Static139.aClass371_3);
		this.method1991(Static139.aClass371_3, 0);
		this.method2032(arg5);
		this.aClass47_Sub3_15.method7901((float) (arg3 - 1), 1.0F, (float) (arg2 - 1));
		this.aClass47_Sub3_15.method7882((float) arg0 - local7, -local7 + (float) arg1, 0.0F);
		this.method2042();
		this.method2102(false);
		this.method2040(Static499.aClass304_6, 4);
		this.method2102(true);
		this.method1991(Static419.aClass371_4, 0);
		this.method2098(0, Static419.aClass371_4);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ[[IZ)Lclient!sq;")
	public abstract Interface24 method2035(@OriginalArg(0) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(IIZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method2036(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap4.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
	@Override
	public final void method6154(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIZ)Lclient!ac;")
	@Override
	public final Class5 method6153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class5_Sub3 local11 = new Class5_Sub3(this, arg2, arg3, arg4);
		local11.method7578(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!bm", name = "w", descriptor = "(I)V")
	protected abstract void method2037();

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(FFFFFFB)Z")
	private boolean method2038(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface26_9.method7632();
		if (local9 == null) {
			return false;
		}
		@Pc(24) Stream local24 = this.method2092(local9);
		if (Stream.b()) {
			local24.a(arg0);
			local24.a(arg2);
			local24.a(arg5);
			local24.a(arg4);
			local24.a(arg3);
			local24.a(arg1);
		} else {
			local24.b(arg0);
			local24.b(arg2);
			local24.b(arg5);
			local24.b(arg4);
			local24.b(arg3);
			local24.b(arg1);
		}
		local24.a();
		return this.anInterface26_9.method7635();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!sea;IB)V")
	public abstract void method2039(@OriginalArg(0) int arg0, @OriginalArg(1) Class304 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!wc;)V")
	@Override
	public final void method6233(@OriginalArg(0) Class47 arg0) {
		this.aClass47_Sub3_16 = (Class47_Sub3) arg0;
		this.aClass47_Sub3_18.method7877(this.aClass47_Sub3_16);
		this.aClass47_Sub3_18.method7884();
		this.aClass47_Sub3_19.method7881(this.aClass47_Sub3_18);
		this.aClass47_Sub3_17.method7881(this.aClass47_Sub3_16);
		if (this.aClass171_4.method4947()) {
			this.method2000();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!sea;II)V")
	private void method2040(@OriginalArg(0) Class304 arg0, @OriginalArg(2) int arg1) {
		this.method2046(this.anInterface26_10, 0);
		this.method2003(this.aClass34_21);
		this.method2039(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "(I)Lclient!tv;")
	public final Class47_Sub3 method2041() {
		return this.aClass47_Sub3Array3[this.anInt2164];
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(Z)V")
	public final void method2042() {
		this.aBoolean165 = false;
		this.method2054();
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6187(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas6) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method1985(this.aHashtable5.get(arg0), arg0);
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "(I)V")
	protected abstract void method2043();

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(ZI)V")
	public final void method2044(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean174) {
			this.aBoolean174 = arg0;
			this.method2079();
			this.anInt2162 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZIIZII)V")
	private void method2045(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(4) boolean local4 = arg0 & this.method6235();
		if (!local4 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg4 = 1;
			arg2 = 0;
		}
		if (arg1 != 0 && arg3) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt2189 != arg1) {
			if (this.anInt2189 != 0) {
				this.aClass16Array3[Integer.MAX_VALUE & this.anInt2189].method8604();
			}
			if (arg1 == 0) {
				this.aClass16_3 = null;
			} else {
				this.aClass16_3 = this.aClass16Array3[Integer.MAX_VALUE & arg1];
				this.aClass16_3.method8601(arg3);
				this.aClass16_3.method8596(arg3);
				this.aClass16_3.method8605(arg2, arg4);
			}
			this.anInt2175 = arg4;
			this.anInt2159 = arg2;
			this.anInt2189 = arg1;
		} else if (this.anInt2189 != 0) {
			this.aClass16Array3[Integer.MAX_VALUE & this.anInt2189].method8596(arg3);
			if (this.anInt2159 != arg2 || arg4 != this.anInt2175) {
				this.aClass16Array3[Integer.MAX_VALUE & this.anInt2189].method8605(arg2, arg4);
				this.anInt2175 = arg4;
				this.anInt2159 = arg2;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)I")
	@Override
	public final int method6176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!bm", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt2182) {
			local5 = true;
			this.anInt2182 = arg0;
		}
		if (this.anInt2168 > arg2) {
			local5 = true;
			this.anInt2168 = arg2;
		}
		if (arg1 > this.anInt2169) {
			this.anInt2169 = arg1;
			local5 = true;
		}
		if (arg3 < this.anInt2172) {
			this.anInt2172 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean185) {
			this.aBoolean185 = true;
			this.method2110();
		}
		this.method2100();
		this.method2057();
	}

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "(I)V")
	@Override
	public final void method6195(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!u;BI)V")
	public abstract void method2046(@OriginalArg(0) Interface26 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "(I)V")
	protected abstract void method2047();

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([FZ)[F")
	public final float[] method2048(@OriginalArg(0) float[] arg0) {
		arg0[8] = this.aFloatArray28[2];
		arg0[12] = this.aFloatArray28[3];
		arg0[4] = this.aFloatArray28[1];
		arg0[0] = this.aFloatArray28[0];
		arg0[5] = this.aFloatArray28[5];
		arg0[13] = this.aFloatArray28[7];
		arg0[1] = this.aFloatArray28[4];
		arg0[2] = this.aFloatArray28[8];
		arg0[9] = this.aFloatArray28[6];
		arg0[6] = this.aFloatArray28[9];
		arg0[10] = this.aFloatArray28[10];
		arg0[7] = this.aFloatArray28[13];
		arg0[14] = this.aFloatArray28[11];
		arg0[3] = this.aFloatArray28[12];
		arg0[15] = this.aFloatArray28[15];
		arg0[11] = this.aFloatArray28[14];
		return arg0;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([IIIIIZ)Lclient!ac;")
	@Override
	public final Class5 method6193(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class5_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!wga;ZBI)V")
	protected abstract void method2049(@OriginalArg(0) Class371 arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!bm", name = "A", descriptor = "(I)V")
	private void method2050() {
		if (this.aBoolean181) {
			return;
		}
		@Pc(15) float[] local15 = this.aFloatArray26;
		@Pc(19) float local19 = (float) this.anInt2161;
		@Pc(23) float local23 = (float) this.anInt2183;
		@Pc(35) float local35 = this.aFloat72 * (float) -this.anInt2177 / (float) this.anInt2180;
		@Pc(47) float local47 = (float) -this.anInt2174 * this.aFloat72 / (float) this.anInt2185;
		@Pc(61) float local61 = this.aFloat72 * (float) (this.anInt2113 - this.anInt2174) / (float) this.anInt2185;
		@Pc(76) float local76 = (float) (this.anInt2117 - this.anInt2177) * this.aFloat72 / (float) this.anInt2180;
		if (local61 == local47 || local35 == local76) {
			local15[10] = 1.0F;
			local15[1] = 0.0F;
			local15[7] = 0.0F;
			local15[12] = 0.0F;
			local15[0] = 1.0F;
			local15[4] = 0.0F;
			local15[9] = 0.0F;
			local15[6] = 0.0F;
			local15[8] = 0.0F;
			local15[13] = 0.0F;
			local15[3] = 0.0F;
			local15[5] = 1.0F;
			local15[11] = 0.0F;
			local15[14] = 0.0F;
			local15[15] = 1.0F;
			local15[2] = 0.0F;
		} else {
			local15[2] = 0.0F;
			local15[15] = 1.0F;
			local15[10] = 1.0F / (local19 - local23);
			local15[3] = 0.0F;
			local15[12] = (local47 + local61) / (-local61 + local47);
			local15[9] = 0.0F;
			local15[11] = 0.0F;
			local15[0] = 2.0F / (local61 - local47);
			local15[6] = 0.0F;
			local15[7] = 0.0F;
			local15[1] = 0.0F;
			local15[4] = 0.0F;
			local15[13] = (local35 + local76) / (local76 - local35);
			local15[14] = local19 / (local19 - local23);
			local15[5] = 2.0F / (local76 - local35);
			local15[8] = 0.0F;
		}
		this.method2112();
		this.aBoolean181 = true;
	}

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "(B)V")
	private void method2051() {
		this.aBoolean169 = false;
		this.method2108();
		if (Static66.aClass171_2 == this.aClass171_4) {
			this.method2107();
		}
	}

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "(B)Lclient!tv;")
	public final Class47_Sub3 method2052() {
		return this.aClass47_Sub3_15;
	}

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass47_Sub3_16.method7883((float) arg2, (float) arg0, (float) arg1);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt2185 * this.aClass47_Sub3_16.method7889((float) arg1, (float) arg0, (float) arg2) / local14);
			local25 = (int) ((float) this.anInt2180 * this.aClass47_Sub3_16.method7887((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local25 = this.anInt2177;
			local28 = this.anInt2174;
		}
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local28 - this.aFloat82);
		arg3[1] = (int) ((float) local25 - this.aFloat78);
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(Z)V")
	private void method2053() {
		this.anInterface26_10 = this.method2008(false);
		this.anInterface26_10.method7633(28, 140);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface26_10.method7632();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method2092(local28);
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
				local35.a();
				if (this.anInterface26_10.method7635()) {
					break;
				}
			}
		}
		this.aClass34_21 = this.method2090(new Class151[] { new Class151(new Class333[] { Static570.aClass333_1, Static570.aClass333_5, Static570.aClass333_5 }) });
	}

	@OriginalMember(owner = "client!bm", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt2157 + this.anInt2154 + this.anInt2156;
	}

	@OriginalMember(owner = "client!bm", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt2113 - 1 <= arg2 && arg1 <= 0 && arg3 >= this.anInt2117 - 1) {
			this.la();
			return;
		}
		this.anInt2182 = arg0 >= 0 ? arg0 : 0;
		this.anInt2168 = this.anInt2113 >= arg2 ? arg2 : 0;
		this.anInt2169 = arg1 >= 0 ? arg1 : 0;
		this.anInt2172 = this.anInt2113 < arg3 ? 0 : arg3;
		if (!this.aBoolean185) {
			this.aBoolean185 = true;
			this.method2110();
		}
		this.method2100();
		this.method2057();
	}

	@OriginalMember(owner = "client!bm", name = "B", descriptor = "(I)V")
	private void method2054() {
		if (Static387.aClass171_7 == this.aClass171_4) {
			@Pc(11) float local11 = this.method2114();
			this.aClass47_Sub3_15.method7882(local11, local11, 0.0F);
		}
		this.aBoolean177 = false;
		this.method2109();
		if (this.aClass16_3 != null) {
			this.aClass16_3.method8609();
		}
	}

	@OriginalMember(owner = "client!bm", name = "C", descriptor = "(I)V")
	protected abstract void method2055();

	@OriginalMember(owner = "client!bm", name = "D", descriptor = "(I)V")
	private void method2056() {
		this.anInterface26_8 = this.method2008(false);
		this.anInterface26_8.method7633(12, 3096);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface26_8.method7632();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method2092(local28);
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
				local35.a();
				if (this.anInterface26_8.method7635()) {
					break;
				}
			}
		}
		this.aClass34_15 = this.method2090(new Class151[] { new Class151(Static570.aClass333_1) });
	}

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "(Z)V")
	private void method2057() {
		this.aFloat78 = this.anInt2169 - this.anInt2177;
		this.aFloat82 = this.anInt2182 - this.anInt2174;
		this.aFloat83 = this.anInt2168 - this.anInt2174;
		this.aFloat74 = this.anInt2172 - this.anInt2177;
	}

	@OriginalMember(owner = "client!bm", name = "r", descriptor = "(B)V")
	private void method2058() {
		if (this.anInt2162 == 1) {
			return;
		}
		this.method2115();
		this.method2021(false);
		this.method2044(false);
		this.method2002(false);
		this.method2080(false);
		this.method2012(false, -2, false);
		this.method2105(1);
		this.method1987(this.anInterface3_3);
		this.anInt2162 = 1;
	}

	@OriginalMember(owner = "client!bm", name = "E", descriptor = "(I)V")
	protected abstract void method2059();

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt2161 && arg1 == this.anInt2183) {
			return;
		}
		this.anInt2183 = arg1;
		this.anInt2161 = arg0;
		this.method2051();
		this.method2034();
		this.method2033();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	protected abstract void method2060(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "()Z")
	@Override
	public final boolean method6186() {
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "(B)Lclient!tv;")
	public final Class47_Sub3 method2061() {
		if (!this.aBoolean177) {
			this.aClass47_Sub3_20.method7891(this.aClass47_Sub3_18, this.aClass47_Sub3_15);
			this.aBoolean177 = true;
		}
		return this.aClass47_Sub3_20;
	}

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "(Z)V")
	public final void method2062() {
		this.method2069();
		this.method2107();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method6164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ[BILclient!em;III)Lclient!baa;")
	protected abstract Interface2 method2063(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class82 arg4);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method2064(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "()V")
	@Override
	public final void method6199() {
		if (this.aClass101_3 != null) {
			this.aClass101_3.method3355();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!id;IIII)Lclient!ka;")
	@Override
	public final Class128 method6157(@OriginalArg(0) Class142 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class128_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method6196(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aNativeHeap4 = ((Class3_Sub5_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer3 = this.aNativeHeap4.a(32768, false);
	}

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "(B)V")
	public final void method2065() {
		this.method2040(Static88.aClass304_2, 2);
	}

	@OriginalMember(owner = "client!bm", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt2169;
		arg0[0] = this.anInt2182;
		arg0[3] = this.anInt2172;
		arg0[2] = this.anInt2168;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)V")
	@Override
	public final void method6197(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "(B)V")
	protected abstract void method2066();

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "(B)V")
	protected abstract void method2067();

	@OriginalMember(owner = "client!bm", name = "w", descriptor = "(B)V")
	protected abstract void method2068();

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "(B)V")
	public final void method2069() {
		if (this.aClass171_4 == Static393.aClass171_6) {
			return;
		}
		@Pc(10) Class171 local10 = this.aClass171_4;
		this.aClass171_4 = Static393.aClass171_6;
		if (local10.method4947()) {
			this.method2000();
		}
		this.aFloatArray28 = this.aFloatArray32;
		this.anInt2162 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "(I)V")
	private void method2070() {
		this.method2046(this.anInterface26_9, 0);
		this.method2003(this.aClass34_20);
		this.method2039(1, Static39.aClass304_1, 0);
	}

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "()Z")
	@Override
	public final boolean method6205() {
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "(B)I")
	public final int method2071() {
		return this.anInt2187;
	}

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "()Z")
	@Override
	public final boolean method6218() {
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([I)V")
	@Override
	public final void method6215(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2113;
		arg0[1] = this.anInt2117;
	}

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "(B)V")
	protected abstract void method2072();

	@OriginalMember(owner = "client!bm", name = "A", descriptor = "(B)V")
	protected abstract void method2073();

	@OriginalMember(owner = "client!bm", name = "B", descriptor = "(B)V")
	protected abstract void method2074();

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIF)Lclient!pk;")
	@Override
	public final Class3_Sub27 method6152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub27_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "(II)V")
	public abstract void method2075(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "(I)V")
	private void method2077() {
		this.aBoolean168 = false;
		if (this.aClass171_4 == Static387.aClass171_7) {
			this.method2106();
			this.method2107();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I[Lclient!pk;)V")
	@Override
	public final void method6203(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub27Array3[local7] = arg1[local7];
		}
		this.anInt2193 = arg0;
		if (this.aClass171_4.method4947()) {
			this.method2015();
		}
	}

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "(Z)V")
	protected abstract void method2079();

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "()Z")
	@Override
	public final boolean method6172() {
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(ZI)V")
	public final void method2080(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean170) {
			this.aBoolean170 = arg0;
			this.method2073();
			this.anInt2162 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "(I)V")
	private void method2081() {
		this.method2047();
		this.method1989();
		this.method2079();
		this.method2015();
		this.method2089();
		this.method2043();
		this.method2018();
		this.method2022();
		this.method2073();
		this.method2006();
		this.method2074();
		this.method2001();
		this.method2026();
		this.method2072();
		for (@Pc(56) int local56 = this.anInt2173 - 1; local56 >= 0; local56--) {
			this.method2010(local56);
			this.method2059();
			this.method2067();
			this.method2029();
		}
		this.method2099();
		this.method2055();
		this.method2028();
		this.method2109();
		this.method2066();
	}

	@OriginalMember(owner = "client!bm", name = "I", descriptor = "(I)I")
	public final int method2082() {
		return this.anInt2190;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!em;ILclient!ew;ZI)Lclient!baa;")
	public abstract Interface2 method2083(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!cd;)V")
	@Override
	public final void method6160(@OriginalArg(0) Class40 arg0) {
		this.aClass99_3.method3293(this, arg0, -1);
	}

	@OriginalMember(owner = "client!bm", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt2166 && this.anInt2170 == arg1 && arg2 == this.anInt2197) {
			return;
		}
		this.anInt2166 = arg0;
		this.anInt2197 = arg2;
		this.anInt2170 = arg1;
		this.method2033();
		this.method2006();
	}

	@OriginalMember(owner = "client!bm", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6168(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!bm", name = "E", descriptor = "(B)V")
	private void method2085() {
		this.aFloatArray33[10] = this.aFloat70;
		this.aFloatArray33[14] = this.aFloat80;
		this.aFloat75 = (this.aFloatArray33[14] - (float) this.anInt2183) / this.aFloatArray33[10];
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BB)V")
	public final void method2086(@OriginalArg(0) byte arg0) {
		this.method1996(arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16);
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(IIIIII)Lclient!tj;")
	@Override
	public final Class4 method6183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class4_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!aca;B)V")
	public abstract void method2087(@OriginalArg(0) Class6 arg0);

	@OriginalMember(owner = "client!bm", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt2191 != arg0;
		if (local11 || arg1 != this.aFloat84 || arg2 != this.aFloat79) {
			this.anInt2191 = arg0;
			this.aFloat84 = arg1;
			this.aFloat79 = arg2;
			if (local11) {
				this.aFloat71 = (float) (this.anInt2191 & 0xFF00) / 65280.0F;
				this.aFloat69 = (float) (this.anInt2191 & 0xFF0000) / 1.671168E7F;
				this.aFloat77 = (float) (this.anInt2191 & 0xFF) / 255.0F;
				this.method2047();
			}
			this.aNativeInterface3.setSunColour(this.aFloat69, this.aFloat71, this.aFloat77, arg1, arg2);
			this.method1989();
		}
		if (arg3 != this.aFloatArray31[0] || this.aFloatArray31[1] != arg4 || arg5 != this.aFloatArray31[2]) {
			this.aFloatArray31[0] = arg3;
			this.aFloatArray31[1] = arg4;
			this.aFloatArray31[2] = arg5;
			this.aFloatArray30[2] = -arg5;
			this.aFloatArray30[0] = -arg3;
			this.aFloatArray30[1] = -arg4;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray29[0] = local149 * arg3;
			this.aFloatArray29[2] = local149 * arg5;
			this.aFloatArray29[1] = local149 * arg4;
			this.aFloatArray27[1] = -this.aFloatArray29[1];
			this.aFloatArray27[2] = -this.aFloatArray29[2];
			this.aFloatArray27[0] = -this.aFloatArray29[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray29[0], this.aFloatArray29[1], this.aFloatArray29[2]);
			this.method2089();
			this.anInt2176 = (int) (arg3 * 256.0F / arg4);
			this.anInt2158 = (int) (arg5 * 256.0F / arg4);
		}
		this.method2043();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!kh;)V")
	public final void method2088(@OriginalArg(1) Class180 arg0) {
		this.aClass180Array3[this.anInt2164] = arg0;
		this.method2019();
	}

	@OriginalMember(owner = "client!bm", name = "J", descriptor = "(I)V")
	public abstract void method2089();

	@OriginalMember(owner = "client!bm", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2058();
		this.method1996(arg4);
		this.method2098(0, Static139.aClass371_3);
		this.method1991(Static139.aClass371_3, 0);
		this.method2032(arg5);
		this.aClass47_Sub3_15.method7901((float) arg3, 1.0F, (float) arg2);
		this.aClass47_Sub3_15.method7876(arg0, arg1, 0);
		this.method2042();
		this.method2102(false);
		this.method2065();
		this.method2102(true);
		this.method1991(Static419.aClass371_4, 0);
		this.method2098(0, Static419.aClass371_4);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z[Lclient!it;)Lclient!mia;")
	public abstract Class34 method2090(@OriginalArg(1) Class151[] arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!sea;BIILclient!ru;I)V")
	public abstract void method2091(@OriginalArg(0) int arg0, @OriginalArg(1) Class304 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface23 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;I)Lclient!jaclib/memory/Stream;")
	public final Stream method2092(@OriginalArg(0) Buffer arg0) {
		this.aStream3.a(arg0);
		return this.aStream3;
	}

	@OriginalMember(owner = "client!bm", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt2183;
	}

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "()Z")
	@Override
	public final boolean method6198() {
		return this.aBoolean172;
	}

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "(B)I")
	public final int method2093() {
		return this.anInt2164;
	}

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "(Z)V")
	protected final void method2094() {
		@Pc(13) Hashtable local13 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(24) Enumeration local24 = this.aHashtable5.keys();
			while (local24.hasMoreElements()) {
				@Pc(30) Canvas local30 = (Canvas) local24.nextElement();
				local13.put(local30, this.method2064(local30));
			}
		}
		this.aHashtable5 = local13;
		this.method2053();
		this.method2025();
		this.method2056();
		this.aClass99_3.method3292(this);
	}

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "()I")
	@Override
	public final int method6226() {
		return this.anInt2163 - 2;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method6191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static403.method3681(arg3, arg2, arg1, this, arg0);
	}

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "()Z")
	@Override
	public final boolean method6235() {
		return this.aClass16Array3[3].method8608();
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method6168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		if (local10 == 0.0F && local17 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(42) float local42 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
			local10 *= local42;
			local17 *= local42;
		}
		if (!this.method2038((float) arg0, 0.0F, (float) arg1, (float) arg3 + local17, (float) arg2 + local10, 0.0F)) {
			return;
		}
		this.method2058();
		this.method1996(arg4);
		this.method2098(0, Static139.aClass371_3);
		this.method1991(Static139.aClass371_3, 0);
		this.method2032(arg5);
		this.method2014();
		this.method2102(false);
		this.method2070();
		this.method2102(true);
		this.method1991(Static419.aClass371_4, 0);
		this.method2098(0, Static419.aClass371_4);
	}

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "(II)Lclient!aia;")
	protected Class16 method2095(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class16_Sub8(this);
		} else if (arg0 == 1) {
			return new Class16_Sub2(this);
		} else if (arg0 == 2) {
			return new Class16_Sub10(this, this.aClass73_3);
		} else if (arg0 == 7) {
			return new Class16_Sub7(this);
		} else {
			return new Class16_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(ZI)V")
	public final void method2096(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean175 != arg0) {
			this.aBoolean175 = arg0;
			this.method2006();
		}
	}

	@OriginalMember(owner = "client!bm", name = "K", descriptor = "(I)V")
	private void method2097() {
		if (this.aCanvas7 == null) {
			this.anInt2136 = this.anInt2100 = 1;
		} else {
			@Pc(23) Dimension local23 = this.aCanvas7.getSize();
			this.anInt2100 = local23.height;
			this.anInt2136 = local23.width;
		}
		this.anInt2117 = this.anInt2100;
		this.anInt2113 = this.anInt2136;
		this.method2077();
		this.method2051();
		this.method2034();
		this.method2055();
		this.method2057();
		this.method2069();
		this.la();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZILclient!wga;)V")
	public final void method2098(@OriginalArg(1) int arg0, @OriginalArg(2) Class371 arg1) {
		this.method1988(false, arg0, false, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "L", descriptor = "(I)V")
	protected abstract void method2099();

	@OriginalMember(owner = "client!bm", name = "M", descriptor = "(I)V")
	protected abstract void method2100();

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIZ)Lclient!ac;")
	@Override
	public final Class5 method6188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class5_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "(Z)V")
	public final void method2101() {
		if (this.anInt2162 == 2) {
			return;
		}
		this.method2115();
		this.method2021(false);
		this.method2044(false);
		this.method2002(false);
		this.method2080(false);
		this.method2012(false, -2, false);
		this.anInt2162 = 2;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(BZ)V")
	public abstract void method2102(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!bm", name = "N", descriptor = "(I)I")
	public final int method2103() {
		return this.anInt2196;
	}

	@OriginalMember(owner = "client!bm", name = "O", descriptor = "(I)V")
	private void method2104() {
		if (this.aClass171_4 == Static66.aClass171_2) {
			return;
		}
		@Pc(14) Class171 local14 = this.aClass171_4;
		this.aClass171_4 = Static66.aClass171_2;
		if (!local14.method4947()) {
			this.method2000();
		}
		this.method2108();
		this.aFloatArray28 = this.aFloatArray33;
		this.method2107();
		this.anInt2162 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "(II)V")
	public final void method2105(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method1983(Static64.aClass363_7, Static64.aClass363_7);
		} else if (arg0 == 0) {
			this.method1983(Static25.aClass363_1, Static25.aClass363_1);
		} else if (arg0 == 2) {
			this.method1983(Static64.aClass363_7, Static95.aClass363_3);
		} else if (arg0 == 3) {
			this.method1983(Static25.aClass363_1, Static428.aClass363_4);
		} else if (arg0 == 4) {
			this.method1983(Static537.aClass363_6, Static537.aClass363_6);
		}
	}

	@OriginalMember(owner = "client!bm", name = "P", descriptor = "(I)V")
	private void method2106() {
		if (this.aBoolean168) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray34;
		if (this.anInt2113 == 0 || this.anInt2117 == 0) {
			local5[8] = 0.0F;
			local5[4] = 0.0F;
			local5[2] = 0.0F;
			local5[0] = 1.0F;
			local5[9] = 0.0F;
			local5[1] = 0.0F;
			local5[3] = 0.0F;
			local5[6] = 0.0F;
			local5[13] = 0.0F;
			local5[5] = 1.0F;
			local5[12] = 0.0F;
			local5[11] = 0.0F;
			local5[7] = 0.0F;
			local5[15] = 1.0F;
			local5[10] = 1.0F;
			local5[14] = 0.0F;
		} else {
			local5[9] = 0.0F;
			local5[12] = -1.0F;
			local5[0] = 2.0F / (float) this.anInt2113;
			local5[5] = -2.0F / (float) this.anInt2117;
			local5[13] = 1.0F;
			local5[15] = 1.0F;
			local5[8] = 0.0F;
			local5[1] = 0.0F;
			local5[11] = 0.0F;
			local5[14] = 0.5F;
			local5[3] = 0.0F;
			local5[6] = 0.0F;
			local5[7] = 0.0F;
			local5[4] = 0.0F;
			local5[10] = 0.5F;
			local5[2] = 0.0F;
		}
		this.aBoolean168 = true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "()Z")
	@Override
	public final boolean method6155() {
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "(B)V")
	private void method2107() {
		this.method2028();
		if (this.aClass16_3 != null) {
			this.aClass16_3.method8607();
		}
	}

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "(B)V")
	private void method2108() {
		if (this.aBoolean169) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray33;
		@Pc(21) float local21 = (float) (-this.anInt2174 * this.anInt2161) / (float) this.anInt2185;
		@Pc(35) float local35 = (float) (this.anInt2161 * (this.anInt2113 - this.anInt2174)) / (float) this.anInt2185;
		@Pc(46) float local46 = (float) (this.anInt2161 * this.anInt2177) / (float) this.anInt2180;
		@Pc(60) float local60 = (float) ((this.anInt2177 - this.anInt2117) * this.anInt2161) / (float) this.anInt2180;
		if (local35 == local21 || local46 == local60) {
			local9[6] = 0.0F;
			local9[13] = 0.0F;
			local9[3] = 0.0F;
			local9[9] = 0.0F;
			local9[5] = 1.0F;
			local9[14] = 0.0F;
			local9[4] = 0.0F;
			local9[10] = 1.0F;
			local9[0] = 1.0F;
			local9[12] = 0.0F;
			local9[15] = 1.0F;
			local9[11] = 0.0F;
			local9[1] = 0.0F;
			local9[2] = 0.0F;
			local9[7] = 0.0F;
			local9[8] = 0.0F;
		} else {
			@Pc(74) float local74 = (float) this.anInt2161 * 2.0F;
			local9[5] = local74 / (local46 - local60);
			local9[11] = -1.0F;
			local9[2] = 0.0F;
			local9[15] = 0.0F;
			local9[12] = 0.0F;
			local9[9] = (local46 + local60) / (local46 - local60);
			local9[0] = local74 / (local35 - local21);
			local9[10] = this.aFloat70 = (float) this.anInt2183 / (float) (this.anInt2161 - this.anInt2183);
			local9[6] = 0.0F;
			local9[14] = this.aFloat80 = (float) (this.anInt2183 * this.anInt2161) / (float) (this.anInt2161 - this.anInt2183);
			local9[7] = 0.0F;
			local9[3] = 0.0F;
			local9[13] = 0.0F;
			local9[8] = (local21 + local35) / (-local21 + local35);
			local9[4] = 0.0F;
			local9[1] = 0.0F;
		}
		this.method2085();
		this.aBoolean169 = true;
	}

	@OriginalMember(owner = "client!bm", name = "Q", descriptor = "(I)V")
	protected abstract void method2109();

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "(Z)V")
	protected abstract void method2110();

	@OriginalMember(owner = "client!bm", name = "R", descriptor = "(I)V")
	protected final void method2111() {
		@Pc(9) Enumeration local9 = this.aHashtable5.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method1985(this.aHashtable5.get(local15), local15);
		}
		this.anInterface26_10.method7627();
		this.anInterface26_9.method7627();
		this.anInterface26_8.method7627();
		this.aClass128_Sub3_28.method6303();
		this.aClass128_Sub3_27.method6303();
		this.aClass128_Sub3_21.method6303();
		this.aClass128_Sub3_23.method6303();
		this.aClass128_Sub3_22.method6303();
		this.aClass99_3.method3298();
		this.anInterface23_3.method7627();
	}

	@OriginalMember(owner = "client!bm", name = "S", descriptor = "(I)V")
	private void method2112() {
		this.aFloat76 = this.anInt2183;
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(II)I")
	@Override
	public final int method6220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method2113(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!bm", name = "T", descriptor = "(I)F")
	protected abstract float method2114();

	@OriginalMember(owner = "client!bm", name = "U", descriptor = "(I)V")
	private void method2115() {
		if (this.aClass171_4 == Static387.aClass171_7) {
			return;
		}
		@Pc(10) Class171 local10 = this.aClass171_4;
		this.aClass171_4 = Static387.aClass171_7;
		if (local10.method4947()) {
			this.method2000();
		}
		this.method2106();
		this.aFloatArray28 = this.aFloatArray34;
		this.method2107();
		this.anInt2162 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!bm", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass47_Sub3_16.method7883((float) arg2, (float) arg0, (float) arg1);
		@Pc(25) int local25;
		@Pc(28) int local28;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local25 = (int) ((float) this.anInt2185 * this.aClass47_Sub3_16.method7889((float) arg1, (float) arg0, (float) arg2) / local14);
			local28 = (int) ((float) this.anInt2180 * this.aClass47_Sub3_16.method7887((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local25 = this.anInt2174;
			local28 = this.anInt2177;
		}
		arg3[1] = (int) ((float) local28 - this.aFloat78);
		arg3[0] = (int) ((float) local25 - this.aFloat82);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!bm", name = "V", descriptor = "(I)V")
	public final void method2116() {
		this.anInterface3Array3 = new Interface3[this.anInt2173];
		this.aClass180Array3 = new Class180[this.anInt2173];
		this.aClass47_Sub3Array3 = new Class47_Sub3[this.anInt2173];
		this.aClass363Array6 = new Class363[this.anInt2173];
		this.aClass363Array5 = new Class363[this.anInt2173];
		for (@Pc(32) int local32 = 0; local32 < this.anInt2173; local32++) {
			this.aClass363Array5[local32] = Static25.aClass363_1;
			this.aClass363Array6[local32] = Static25.aClass363_1;
			this.aClass180Array3[local32] = Static259.aClass180_5;
			this.aClass47_Sub3Array3[local32] = new Class47_Sub3();
		}
		this.aClass3_Sub27Array3 = new Class3_Sub27[this.anInt2163 - 2];
		this.anInterface3_3 = this.method2083(Static333.aClass82_9, 1, Static137.aClass89_8, 1);
		this.method6196(new Class3_Sub5_Sub2(262144));
		this.aClass34_19 = this.method2090(new Class151[] { new Class151(new Class333[] { Static570.aClass333_1, Static570.aClass333_5 }) });
		this.aClass34_16 = this.method2090(new Class151[] { new Class151(new Class333[] { Static570.aClass333_1, Static570.aClass333_3 }) });
		this.aClass34_18 = this.method2090(new Class151[] { new Class151(Static570.aClass333_1), new Class151(Static570.aClass333_3), new Class151(Static570.aClass333_5), new Class151(Static570.aClass333_2) });
		this.aClass34_17 = this.method2090(new Class151[] { new Class151(Static570.aClass333_1), new Class151(Static570.aClass333_3), new Class151(Static570.aClass333_5) });
		this.aClass128_Sub3_30 = new Class128_Sub3(this, 0, 0, false, false);
		this.aClass128_Sub3_28 = new Class128_Sub3(this, 0, 0, true, true);
		this.aClass128_Sub3_29 = new Class128_Sub3(this, 0, 0, false, false);
		this.aClass128_Sub3_27 = new Class128_Sub3(this, 0, 0, true, true);
		this.aClass128_Sub3_25 = new Class128_Sub3(this, 0, 0, false, false);
		this.aClass128_Sub3_21 = new Class128_Sub3(this, 0, 0, true, true);
		this.aClass128_Sub3_26 = new Class128_Sub3(this, 0, 0, false, false);
		this.aClass128_Sub3_23 = new Class128_Sub3(this, 0, 0, true, true);
		this.aClass128_Sub3_24 = new Class128_Sub3(this, 0, 0, false, false);
		this.aClass128_Sub3_22 = new Class128_Sub3(this, 0, 0, true, true);
		this.aClass99_3 = new Class99(this);
		this.anInterface23_3 = this.method1998(true);
		this.method2094();
		this.aClass73_3 = new Class73(this);
		this.aClass16Array3[1] = this.method2095(1);
		this.aClass16Array3[2] = this.method2095(2);
		this.aClass16Array3[4] = this.method2095(4);
		this.aClass16Array3[5] = this.method2095(5);
		this.aClass16Array3[6] = this.method2095(6);
		this.aClass16Array3[7] = this.method2095(7);
		this.aClass16Array3[3] = this.method2095(3);
		this.aClass16Array3[8] = this.method2095(8);
		this.aClass16Array3[9] = this.method2095(9);
		if (!this.aClass16Array3[2].method8608()) {
			this.aClass16Array3[2] = this.method2095(0);
		}
		if (!this.aClass16Array3[4].method8608()) {
			this.aClass16Array3[4] = this.aClass16Array3[2];
		}
		if (!this.aClass16Array3[8].method8608()) {
			this.aClass16Array3[8] = this.aClass16Array3[4];
		}
		if (!this.aClass16Array3[9].method8608()) {
			this.aClass16Array3[9] = this.aClass16Array3[8];
		}
		this.method1999();
		this.la();
		this.method6181();
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(IZ)V")
	public final void method2117(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean171 != arg0) {
			this.aBoolean171 = arg0;
			this.method2079();
		}
	}
}
