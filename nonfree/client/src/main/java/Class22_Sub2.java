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

@OriginalClass("client!jca")
public abstract class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!jca", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!jca", name = "mb", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable6;

	@OriginalMember(owner = "client!jca", name = "Rd", descriptor = "Lclient!ic;")
	protected Class172 aClass172_7;

	@OriginalMember(owner = "client!jca", name = "ec", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!jca", name = "rb", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!jca", name = "zf", descriptor = "I")
	protected int anInt10450;

	@OriginalMember(owner = "client!jca", name = "Ke", descriptor = "I")
	public int anInt10451;

	@OriginalMember(owner = "client!jca", name = "wf", descriptor = "I")
	public int anInt10452;

	@OriginalMember(owner = "client!jca", name = "T", descriptor = "F")
	private float aFloat177;

	@OriginalMember(owner = "client!jca", name = "Rc", descriptor = "Z")
	protected boolean aBoolean686;

	@OriginalMember(owner = "client!jca", name = "Tc", descriptor = "[Lclient!ug;")
	protected Class372[] aClass372Array5;

	@OriginalMember(owner = "client!jca", name = "Lc", descriptor = "I")
	public int anInt10459;

	@OriginalMember(owner = "client!jca", name = "Nd", descriptor = "Lclient!sc;")
	public Interface21 anInterface21_3;

	@OriginalMember(owner = "client!jca", name = "Wd", descriptor = "[Lclient!nw;")
	protected Class58_Sub2[] aClass58_Sub2Array3;

	@OriginalMember(owner = "client!jca", name = "zc", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!jca", name = "jc", descriptor = "I")
	public int anInt10466;

	@OriginalMember(owner = "client!jca", name = "Vd", descriptor = "I")
	protected int anInt10467;

	@OriginalMember(owner = "client!jca", name = "yc", descriptor = "Lclient!ag;")
	private Class10 aClass10_3;

	@OriginalMember(owner = "client!jca", name = "Ub", descriptor = "F")
	public float aFloat183;

	@OriginalMember(owner = "client!jca", name = "Bc", descriptor = "I")
	protected int anInt10468;

	@OriginalMember(owner = "client!jca", name = "ad", descriptor = "Lclient!qia;")
	private Class310 aClass310_3;

	@OriginalMember(owner = "client!jca", name = "Pb", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!jca", name = "Wf", descriptor = "[Lclient!sc;")
	private Interface21[] anInterface21Array3;

	@OriginalMember(owner = "client!jca", name = "y", descriptor = "I")
	private int anInt10473;

	@OriginalMember(owner = "client!jca", name = "bc", descriptor = "[Lclient!le;")
	protected Class222[] aClass222Array3;

	@OriginalMember(owner = "client!jca", name = "Hb", descriptor = "I")
	protected int anInt10477;

	@OriginalMember(owner = "client!jca", name = "Bf", descriptor = "Z")
	public boolean aBoolean693;

	@OriginalMember(owner = "client!jca", name = "Id", descriptor = "Z")
	protected boolean aBoolean696;

	@OriginalMember(owner = "client!jca", name = "Qe", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!jca", name = "ic", descriptor = "Z")
	public boolean aBoolean697;

	@OriginalMember(owner = "client!jca", name = "Bb", descriptor = "[Lclient!ug;")
	protected Class372[] aClass372Array6;

	@OriginalMember(owner = "client!jca", name = "rd", descriptor = "Lclient!nb;")
	private Class113_Sub1 aClass113_Sub1_3;

	@OriginalMember(owner = "client!jca", name = "ue", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!jca", name = "Z", descriptor = "Z")
	public boolean aBoolean700;

	@OriginalMember(owner = "client!jca", name = "Xb", descriptor = "I")
	public int anInt10486;

	@OriginalMember(owner = "client!jca", name = "Ic", descriptor = "[Lclient!jw;")
	protected Class3_Sub5[] aClass3_Sub5Array5;

	@OriginalMember(owner = "client!jca", name = "Lb", descriptor = "F")
	private float aFloat192;

	@OriginalMember(owner = "client!jca", name = "lf", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!jca", name = "Md", descriptor = "I")
	public int anInt10490;

	@OriginalMember(owner = "client!jca", name = "L", descriptor = "I")
	protected int anInt10491;

	@OriginalMember(owner = "client!jca", name = "Zd", descriptor = "I")
	private int anInt10492;

	@OriginalMember(owner = "client!jca", name = "Kc", descriptor = "Lclient!lq;")
	private Interface14 anInterface14_16;

	@OriginalMember(owner = "client!jca", name = "Ac", descriptor = "Lclient!wh;")
	private Class36 aClass36_17;

	@OriginalMember(owner = "client!jca", name = "hb", descriptor = "Lclient!kl;")
	private Interface11 anInterface11_8;

	@OriginalMember(owner = "client!jca", name = "ag", descriptor = "Lclient!lq;")
	private Interface14 anInterface14_17;

	@OriginalMember(owner = "client!jca", name = "Xe", descriptor = "Lclient!wh;")
	public Class36 aClass36_18;

	@OriginalMember(owner = "client!jca", name = "cc", descriptor = "Lclient!wh;")
	public Class36 aClass36_19;

	@OriginalMember(owner = "client!jca", name = "fg", descriptor = "Lclient!wh;")
	private Class36 aClass36_20;

	@OriginalMember(owner = "client!jca", name = "Ld", descriptor = "Lclient!wh;")
	private Class36 aClass36_21;

	@OriginalMember(owner = "client!jca", name = "Tf", descriptor = "Lclient!wh;")
	public Class36 aClass36_22;

	@OriginalMember(owner = "client!jca", name = "X", descriptor = "Lclient!lq;")
	private Interface14 anInterface14_18;

	@OriginalMember(owner = "client!jca", name = "od", descriptor = "Lclient!wh;")
	public Class36 aClass36_23;

	@OriginalMember(owner = "client!jca", name = "tb", descriptor = "Z")
	protected boolean aBoolean705;

	@OriginalMember(owner = "client!jca", name = "lc", descriptor = "I")
	private int anInt10493;

	@OriginalMember(owner = "client!jca", name = "Y", descriptor = "Lclient!sja;")
	private final Class342 aClass342_84 = new Class342();

	@OriginalMember(owner = "client!jca", name = "Vb", descriptor = "Z")
	protected boolean aBoolean684 = true;

	@OriginalMember(owner = "client!jca", name = "of", descriptor = "Lclient!nw;")
	protected final Class58_Sub2 aClass58_Sub2_15 = new Class58_Sub2();

	@OriginalMember(owner = "client!jca", name = "fd", descriptor = "Lclient!nw;")
	public Class58_Sub2 aClass58_Sub2_16 = new Class58_Sub2();

	@OriginalMember(owner = "client!jca", name = "hf", descriptor = "Lclient!nw;")
	public final Class58_Sub2 aClass58_Sub2_17 = new Class58_Sub2();

	@OriginalMember(owner = "client!jca", name = "qf", descriptor = "Lclient!nw;")
	protected final Class58_Sub2 aClass58_Sub2_18 = new Class58_Sub2();

	@OriginalMember(owner = "client!jca", name = "vc", descriptor = "Lclient!nw;")
	private final Class58_Sub2 aClass58_Sub2_19 = new Class58_Sub2();

	@OriginalMember(owner = "client!jca", name = "Wc", descriptor = "Lclient!nw;")
	private final Class58_Sub2 aClass58_Sub2_20 = new Class58_Sub2();

	@OriginalMember(owner = "client!jca", name = "Je", descriptor = "I")
	protected int anInt10460 = 0;

	@OriginalMember(owner = "client!jca", name = "Cc", descriptor = "I")
	protected int anInt10465 = 0;

	@OriginalMember(owner = "client!jca", name = "Ne", descriptor = "F")
	public float aFloat182 = 1.0F;

	@OriginalMember(owner = "client!jca", name = "Ib", descriptor = "I")
	public int anInt10455 = 512;

	@OriginalMember(owner = "client!jca", name = "Uc", descriptor = "F")
	public float aFloat179 = 3584.0F;

	@OriginalMember(owner = "client!jca", name = "kb", descriptor = "I")
	private int anInt10454 = 0;

	@OriginalMember(owner = "client!jca", name = "rf", descriptor = "I")
	protected int anInt10469 = 0;

	@OriginalMember(owner = "client!jca", name = "Dc", descriptor = "[F")
	private final float[] aFloatArray70 = new float[16];

	@OriginalMember(owner = "client!jca", name = "M", descriptor = "I")
	protected int anInt10472 = 0;

	@OriginalMember(owner = "client!jca", name = "Jf", descriptor = "Z")
	private boolean aBoolean692 = false;

	@OriginalMember(owner = "client!jca", name = "we", descriptor = "[F")
	private final float[] aFloatArray69 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!jca", name = "le", descriptor = "I")
	public int anInt10474 = 0;

	@OriginalMember(owner = "client!jca", name = "mc", descriptor = "F")
	public float aFloat185 = 1.0F;

	@OriginalMember(owner = "client!jca", name = "kc", descriptor = "I")
	protected final int anInt10456 = 0;

	@OriginalMember(owner = "client!jca", name = "bb", descriptor = "I")
	private int anInt10457 = -1;

	@OriginalMember(owner = "client!jca", name = "re", descriptor = "[Lclient!ag;")
	private final Class10[] aClass10Array3 = new Class10[10];

	@OriginalMember(owner = "client!jca", name = "s", descriptor = "I")
	public int anInt10461 = 0;

	@OriginalMember(owner = "client!jca", name = "oc", descriptor = "I")
	public int anInt10458 = 0;

	@OriginalMember(owner = "client!jca", name = "z", descriptor = "I")
	public int anInt10464 = 50;

	@OriginalMember(owner = "client!jca", name = "Ef", descriptor = "F")
	public float aFloat180 = 3584.0F;

	@OriginalMember(owner = "client!jca", name = "Vc", descriptor = "I")
	public int anInt10480 = -1;

	@OriginalMember(owner = "client!jca", name = "Ob", descriptor = "I")
	private int anInt10470 = 1;

	@OriginalMember(owner = "client!jca", name = "Re", descriptor = "I")
	private int anInt10475 = 0;

	@OriginalMember(owner = "client!jca", name = "Gf", descriptor = "Z")
	private boolean aBoolean687 = false;

	@OriginalMember(owner = "client!jca", name = "xc", descriptor = "[F")
	public final float[] aFloatArray76 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!jca", name = "rc", descriptor = "Z")
	private boolean aBoolean690 = false;

	@OriginalMember(owner = "client!jca", name = "Q", descriptor = "[F")
	protected float[] aFloatArray71 = this.aFloatArray69;

	@OriginalMember(owner = "client!jca", name = "Zb", descriptor = "I")
	public int anInt10462 = 3;

	@OriginalMember(owner = "client!jca", name = "af", descriptor = "I")
	public int anInt10463 = 512;

	@OriginalMember(owner = "client!jca", name = "zd", descriptor = "[F")
	private final float[] aFloatArray74 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!jca", name = "v", descriptor = "[F")
	private final float[] aFloatArray73 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!jca", name = "hc", descriptor = "Z")
	protected boolean aBoolean694 = true;

	@OriginalMember(owner = "client!jca", name = "Mc", descriptor = "I")
	protected int anInt10478 = 3584;

	@OriginalMember(owner = "client!jca", name = "tc", descriptor = "I")
	private int anInt10481 = -1;

	@OriginalMember(owner = "client!jca", name = "vb", descriptor = "F")
	public float aFloat188 = -1.0F;

	@OriginalMember(owner = "client!jca", name = "Se", descriptor = "I")
	private int anInt10471 = 16777215;

	@OriginalMember(owner = "client!jca", name = "id", descriptor = "F")
	public float aFloat178 = 1.0F;

	@OriginalMember(owner = "client!jca", name = "zb", descriptor = "Z")
	private boolean aBoolean695 = false;

	@OriginalMember(owner = "client!jca", name = "nf", descriptor = "[F")
	public final float[] aFloatArray72 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!jca", name = "me", descriptor = "Z")
	protected boolean aBoolean701 = true;

	@OriginalMember(owner = "client!jca", name = "Be", descriptor = "Z")
	private boolean aBoolean702 = false;

	@OriginalMember(owner = "client!jca", name = "ae", descriptor = "F")
	public float aFloat186 = 1.0F;

	@OriginalMember(owner = "client!jca", name = "Ab", descriptor = "I")
	public int anInt10479 = 8;

	@OriginalMember(owner = "client!jca", name = "Ed", descriptor = "I")
	private int anInt10476 = -1;

	@OriginalMember(owner = "client!jca", name = "gb", descriptor = "Z")
	protected boolean aBoolean688 = false;

	@OriginalMember(owner = "client!jca", name = "Rf", descriptor = "Z")
	protected boolean aBoolean689 = false;

	@OriginalMember(owner = "client!jca", name = "ef", descriptor = "I")
	public int anInt10487 = -1;

	@OriginalMember(owner = "client!jca", name = "ud", descriptor = "I")
	protected int anInt10484 = 0;

	@OriginalMember(owner = "client!jca", name = "Sc", descriptor = "F")
	public float aFloat190 = -1.0F;

	@OriginalMember(owner = "client!jca", name = "x", descriptor = "F")
	private float aFloat191 = 1.0F;

	@OriginalMember(owner = "client!jca", name = "Ud", descriptor = "Z")
	private boolean aBoolean685 = false;

	@OriginalMember(owner = "client!jca", name = "be", descriptor = "I")
	protected final int anInt10488 = 0;

	@OriginalMember(owner = "client!jca", name = "dc", descriptor = "Z")
	protected boolean aBoolean691 = true;

	@OriginalMember(owner = "client!jca", name = "qe", descriptor = "Z")
	protected boolean aBoolean703 = false;

	@OriginalMember(owner = "client!jca", name = "hd", descriptor = "Z")
	protected boolean aBoolean704 = true;

	@OriginalMember(owner = "client!jca", name = "H", descriptor = "Z")
	protected boolean aBoolean699 = false;

	@OriginalMember(owner = "client!jca", name = "Vf", descriptor = "Lclient!dc;")
	protected Class72 aClass72_27 = Static637.aClass72_24;

	@OriginalMember(owner = "client!jca", name = "Af", descriptor = "[F")
	private final float[] aFloatArray75 = new float[16];

	@OriginalMember(owner = "client!jca", name = "Xf", descriptor = "I")
	public int anInt10485 = 128;

	@OriginalMember(owner = "client!jca", name = "yf", descriptor = "I")
	private int anInt10489 = 0;

	@OriginalMember(owner = "client!jca", name = "dd", descriptor = "Z")
	protected boolean aBoolean698 = true;

	@OriginalMember(owner = "client!jca", name = "vd", descriptor = "Lclient!gfa;")
	protected Class135 aClass135_8 = Static302.aClass135_5;

	@OriginalMember(owner = "client!jca", name = "uf", descriptor = "[F")
	private final float[] aFloatArray77 = new float[16];

	@OriginalMember(owner = "client!jca", name = "pf", descriptor = "I")
	private int anInt10483 = 0;

	@OriginalMember(owner = "client!jca", name = "uc", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!jca", name = "gd", descriptor = "[Lclient!pea;")
	public final Class170_Sub2[] aClass170_Sub2Array6 = new Class170_Sub2[7];

	@OriginalMember(owner = "client!jca", name = "Yf", descriptor = "[Lclient!pea;")
	public final Class170_Sub2[] aClass170_Sub2Array5 = new Class170_Sub2[7];

	@OriginalMember(owner = "client!jca", name = "jd", descriptor = "Lclient!nw;")
	private final Class58_Sub2 aClass58_Sub2_21 = new Class58_Sub2();

	@OriginalMember(owner = "client!jca", name = "mg", descriptor = "Lclient!ik;")
	protected final Class182 aClass182_122;

	@OriginalMember(owner = "client!jca", name = "Zc", descriptor = "Ljava/lang/Object;")
	protected final Object anObject19;

	@OriginalMember(owner = "client!jca", name = "bf", descriptor = "Ljava/lang/Object;")
	private Object bf;

	@OriginalMember(owner = "client!jca", name = "nb", descriptor = "I")
	protected final int anInt10453;

	@OriginalMember(owner = "client!jca", name = "gg", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas11;

	@OriginalMember(owner = "client!jca", name = "kd", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!jca", name = "cd", descriptor = "I")
	private int anInt10289;

	@OriginalMember(owner = "client!jca", name = "Ie", descriptor = "I")
	public int anInt10377;

	@OriginalMember(owner = "client!jca", name = "je", descriptor = "I")
	public final int anInt10482;

	@OriginalMember(owner = "client!jca", name = "A", descriptor = "I")
	private int anInt10382;

	@OriginalMember(owner = "client!jca", name = "nd", descriptor = "I")
	public int anInt10347;

	@OriginalMember(owner = "client!jca", name = "Qf", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!jca", name = "Rb", descriptor = "Lclient!hfa;")
	private final Class156 aClass156_3;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!ik;II)V")
	protected Class22_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class182 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.aClass182_122 = arg3;
			this.bf = this.anObject19 = arg1;
			this.anInt10453 = arg4;
			this.aCanvas12 = this.aCanvas11 = arg0;
			@Pc(315) Dimension local315 = arg0.getSize();
			this.anInt10377 = this.anInt10289 = local315.height;
			this.anInt10482 = arg5;
			this.anInt10347 = this.anInt10382 = local315.width;
			Static633.method8323(true, false);
			if (super.anInterface4_14 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt10482);
				this.aClass156_3 = null;
			} else {
				this.aClass156_3 = new Class156(this, super.anInterface4_14);
				this.aNativeInterface3 = new NativeInterface(super.anInterface4_14.method5759(), this.anInt10482);
				for (@Pc(373) int local373 = 0; super.anInterface4_14.method5759() > local373; local373++) {
					@Pc(381) Class406 local381 = super.anInterface4_14.method5761(local373);
					if (local381 != null) {
						this.aNativeInterface3.initTextureMetrics(local373, local381.aByte144, local381.aByte146);
					}
				}
			}
		} catch (@Pc(402) Throwable local402) {
			local402.printStackTrace();
			this.method9397();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!jca", name = "x", descriptor = "()Lclient!cl;")
	@Override
	public final Class58 method9369() {
		return this.aClass58_Sub2_16;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method9331(@OriginalArg(0) Class3_Sub16 arg0) {
		this.aNativeHeap6 = ((Class3_Sub16_Sub2) arg0).aNativeHeap4;
		this.aNativeHeapBuffer8 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZBIIZ)V")
	private void method8849(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(8) boolean local8 = arg4 & this.method9342();
		if (!local8 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			arg2 = 2;
			arg3 = 1;
			arg0 = 0;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt10483 != arg2) {
			if (this.anInt10483 != 0) {
				this.aClass10Array3[this.anInt10483 & Integer.MAX_VALUE].method9549();
			}
			if (arg2 == 0) {
				this.aClass10_3 = null;
			} else {
				this.aClass10_3 = this.aClass10Array3[arg2 & Integer.MAX_VALUE];
				this.aClass10_3.method9551(arg1);
				this.aClass10_3.method9558(arg1);
				this.aClass10_3.method9552(arg0, arg3);
			}
			this.anInt10489 = arg0;
			this.anInt10454 = arg3;
			this.anInt10483 = arg2;
		} else if (this.anInt10483 != 0) {
			this.aClass10Array3[Integer.MAX_VALUE & this.anInt10483].method9558(arg1);
			if (arg0 != this.anInt10489 || arg3 != this.anInt10454) {
				this.aClass10Array3[Integer.MAX_VALUE & this.anInt10483].method9552(arg0, arg3);
				this.anInt10489 = arg0;
				this.anInt10454 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([BLclient!sca;IBII)Lclient!rm;")
	public abstract Interface19 method8850(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class335 arg1);

	@OriginalMember(owner = "client!jca", name = "w", descriptor = "(B)V")
	private void method8851() {
		this.aBoolean692 = false;
		this.method8884();
		if (Static460.aClass72_20 == this.aClass72_27) {
			this.method8938();
		}
	}

	@OriginalMember(owner = "client!jca", name = "L", descriptor = "(I)V")
	private void method8852() {
		if (this.anInt10492 == 1) {
			return;
		}
		this.method8863();
		this.method8898(false);
		this.method8927(false);
		this.method8862(false);
		this.method8902(false);
		this.method8979(false, false, -2);
		this.method8853(1);
		this.method8976(this.anInterface21_3);
		this.anInt10492 = 1;
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "()Z")
	@Override
	public final boolean method9335() {
		return true;
	}

	@OriginalMember(owner = "client!jca", name = "s", descriptor = "()Z")
	@Override
	public final boolean method9346() {
		return true;
	}

	@OriginalMember(owner = "client!jca", name = "i", descriptor = "(II)V")
	public final void method8853(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method8914(Static468.aClass372_3, Static468.aClass372_3);
		} else if (arg0 == 0) {
			this.method8914(Static503.aClass372_4, Static503.aClass372_4);
		} else if (arg0 == 2) {
			this.method8914(Static468.aClass372_3, Static240.aClass372_6);
		} else if (arg0 == 3) {
			this.method8914(Static503.aClass372_4, Static666.aClass372_7);
		} else if (arg0 == 4) {
			this.method8914(Static503.aClass372_5, Static503.aClass372_5);
		}
	}

	@OriginalMember(owner = "client!jca", name = "m", descriptor = "(I)V")
	private void method8854() {
		this.aBoolean695 = false;
		if (this.aClass10_3 != null) {
			this.aClass10_3.method9547();
		}
		this.method8955();
	}

	@OriginalMember(owner = "client!jca", name = "r", descriptor = "()Z")
	@Override
	public final boolean method9406() {
		return false;
	}

	@OriginalMember(owner = "client!jca", name = "u", descriptor = "(I)V")
	private void method8855() {
		this.anInterface14_17 = this.method8937(false);
		this.anInterface14_17.method6767(12, 3096);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(38) Buffer local38 = this.anInterface14_17.method6764();
			if (local38 != null) {
				@Pc(45) Stream local45 = this.method8918(local38);
				local45.a(0.0F);
				local45.a(0.0F);
				local45.a(0.0F);
				for (@Pc(56) int local56 = 0; local56 <= 256; local56++) {
					@Pc(67) double local67 = (double) (local56 * 2) * 3.141592653589793D / 256.0D;
					@Pc(71) float local71 = (float) Math.cos(local67);
					@Pc(75) float local75 = (float) Math.sin(local67);
					if (Stream.c()) {
						local45.a(local75);
						local45.a(local71);
						local45.a(0.0F);
					} else {
						local45.b(local75);
						local45.b(local71);
						local45.b(0.0F);
					}
				}
				local45.b();
				if (this.anInterface14_17.method6766()) {
					break;
				}
			}
		}
		this.aClass36_20 = this.method8944(new Class95[] { new Class95(Static469.aClass278_1) });
	}

	@OriginalMember(owner = "client!jca", name = "s", descriptor = "(I)V")
	protected abstract void method8856();

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!hu;IILclient!sca;I)Lclient!pt;")
	public abstract Interface16 method8857(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class335 arg3);

	@OriginalMember(owner = "client!jca", name = "B", descriptor = "(I)V")
	protected abstract void method8858();

	@OriginalMember(owner = "client!jca", name = "p", descriptor = "()Z")
	@Override
	public final boolean method9408() {
		return true;
	}

	@OriginalMember(owner = "client!jca", name = "db", descriptor = "(I)V")
	protected abstract void method8859();

	@OriginalMember(owner = "client!jca", name = "P", descriptor = "(I)V")
	protected abstract void method8860();

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method9355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static324.method4711(arg0, this, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!lma;IIIILclient!kl;I)V")
	public abstract void method8861(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface11 arg5);

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(ZI)V")
	public final void method8862(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean689) {
			this.aBoolean689 = arg0;
			this.method8856();
			this.anInt10492 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!jca", name = "l", descriptor = "(I)V")
	private void method8863() {
		if (this.aClass72_27 == Static590.aClass72_25) {
			return;
		}
		@Pc(18) Class72 local18 = this.aClass72_27;
		this.aClass72_27 = Static590.aClass72_25;
		if (local18.method1981()) {
			this.method8854();
		}
		this.method8973();
		this.aFloatArray71 = this.aFloatArray75;
		this.method8938();
		this.anInt10492 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!jca", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean697 = false;
	}

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "()Z")
	@Override
	public final boolean method9340() {
		return true;
	}

	@OriginalMember(owner = "client!jca", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass58_Sub2_16.aFloat111 + this.aClass58_Sub2_16.aFloat113 * (float) arg1 + (float) arg0 * this.aClass58_Sub2_16.aFloat115 + (float) arg2 * this.aClass58_Sub2_16.aFloat114;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass58_Sub2_16.aFloat114 * (float) arg5 + (float) arg3 * this.aClass58_Sub2_16.aFloat115 + this.aClass58_Sub2_16.aFloat113 * (float) arg4 + this.aClass58_Sub2_16.aFloat111;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt10464 > local32 && (float) this.anInt10464 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt10478 < local32 && (float) this.anInt10478 < local63) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) ((float) this.anInt10455 * (this.aClass58_Sub2_16.aFloat108 + this.aClass58_Sub2_16.aFloat110 * (float) arg2 + this.aClass58_Sub2_16.aFloat112 * (float) arg1 + this.aClass58_Sub2_16.aFloat120 * (float) arg0) / local32);
		@Pc(173) int local173 = (int) ((this.aClass58_Sub2_16.aFloat120 * (float) arg3 + this.aClass58_Sub2_16.aFloat112 * (float) arg4 + this.aClass58_Sub2_16.aFloat110 * (float) arg5 + this.aClass58_Sub2_16.aFloat108) * (float) this.anInt10455 / local63);
		if ((float) local141 < this.aFloat189 && this.aFloat189 > (float) local173) {
			local7 |= 0x1;
		} else if (this.aFloat184 < (float) local141 && (float) local173 > this.aFloat184) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) ((float) this.anInt10463 * (this.aClass58_Sub2_16.aFloat116 + (float) arg1 * this.aClass58_Sub2_16.aFloat109 + (float) arg0 * this.aClass58_Sub2_16.aFloat117 + this.aClass58_Sub2_16.aFloat119 * (float) arg2) / local32);
		@Pc(277) int local277 = (int) (((float) arg3 * this.aClass58_Sub2_16.aFloat117 + (float) arg4 * this.aClass58_Sub2_16.aFloat109 + (float) arg5 * this.aClass58_Sub2_16.aFloat119 + this.aClass58_Sub2_16.aFloat116) * (float) this.anInt10463 / local63);
		if (this.aFloat183 > (float) local245 && (float) local277 < this.aFloat183) {
			local7 |= 0x4;
		} else if (this.aFloat193 < (float) local245 && (float) local277 > this.aFloat193) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!cl;)V")
	@Override
	public final void method9405(@OriginalArg(0) Class58 arg0) {
		this.aClass58_Sub2_16 = (Class58_Sub2) arg0;
		this.aClass58_Sub2_18.method9516(this.aClass58_Sub2_16);
		this.aClass58_Sub2_18.method6096();
		this.aClass58_Sub2_19.method6106(this.aClass58_Sub2_18);
		this.aClass58_Sub2_17.method6106(this.aClass58_Sub2_16);
		if (this.aClass72_27.method1981()) {
			this.method8854();
		}
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(IIIIII)Lclient!ih;")
	@Override
	public final Class113 method9366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class113_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method9326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) float local12 = (float) -arg0 + (float) arg2;
		@Pc(19) float local19 = (float) -arg1 + (float) arg3;
		@Pc(46) float local46;
		if (local12 == 0.0F && local19 == 0.0F) {
			local12 = 1.0F;
		} else {
			local46 = (float) (1.0D / Math.sqrt((double) (local12 * local12 + local19 * local19)));
			local19 *= local46;
			local12 *= local46;
		}
		this.method8852();
		this.method8930(arg4);
		this.method8962(Static547.aClass392_3, 0);
		this.method8897(Static547.aClass392_3, 0);
		this.method8978(1);
		this.method8905();
		@Pc(84) int local84 = arg7 % (arg6 + arg5);
		this.method8933(false);
		local46 = (float) arg5 * local12;
		@Pc(98) float local98 = (float) arg5 * local19;
		@Pc(100) float local100 = 0.0F;
		@Pc(102) float local102 = 0.0F;
		@Pc(104) float local104 = local46;
		@Pc(106) float local106 = local98;
		if (local84 <= arg5) {
			local104 = (float) (arg5 - local84) * local12;
			local106 = (float) (arg5 - local84) * local19;
		} else {
			local102 = local19 * (float) (arg5 + arg6 - local84);
			local100 = (float) (arg6 + arg5 - local84) * local12;
		}
		@Pc(157) float local157 = local100 + (float) arg0;
		@Pc(162) float local162 = (float) arg1 + local102;
		@Pc(167) float local167 = (float) arg6 * local12;
		@Pc(172) float local172 = local19 * (float) arg6;
		while (true) {
			if (arg2 <= arg0) {
				if (local157 < (float) arg2) {
					break;
				}
				if (local157 + local104 < (float) arg2) {
					local104 = (float) arg2 - local157;
				}
			} else {
				if ((float) arg2 < local157) {
					break;
				}
				if (local157 + local104 > (float) arg2) {
					local104 = (float) arg2 - local157;
				}
			}
			if (arg1 >= arg3) {
				if (local162 < (float) arg3) {
					break;
				}
				if (local162 + local106 < (float) arg3) {
					local106 = (float) arg3 - local162;
				}
			} else {
				if (local162 > (float) arg3) {
					break;
				}
				if ((float) arg3 < local106 + local162) {
					local106 = (float) arg3 - local162;
				}
			}
			if (!this.method8899(0.0F, local104 + local157, local162 + local106, 0.0F, local157, local162)) {
				return;
			}
			this.method8872();
			local157 += local104 + local167;
			local162 += local172 + local106;
			local104 = local46;
			local106 = local98;
		}
		this.method8933(true);
		this.method8897(Static358.aClass392_1, 0);
		this.method8962(Static358.aClass392_1, 0);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IILclient!lma;)V")
	private void method8864(@OriginalArg(0) int arg0, @OriginalArg(2) Class234 arg1) {
		this.method8912(this.anInterface14_16, 0);
		this.method8894(this.aClass36_21);
		this.method8904(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!jca", name = "gb", descriptor = "(I)I")
	public final int method8865() {
		return this.anInt10475;
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "()Z")
	@Override
	public final boolean method9323() {
		return this.aBoolean696;
	}

	@OriginalMember(owner = "client!jca", name = "i", descriptor = "(B)V")
	private void method8866() {
		if (this.aClass72_27 == Static135.aClass72_28) {
			return;
		}
		@Pc(6) Class72 local6 = this.aClass72_27;
		this.aClass72_27 = Static135.aClass72_28;
		if (!local6.method1981()) {
			this.method8854();
		}
		this.method8939();
		this.aFloatArray71 = this.aFloatArray77;
		this.method8938();
		this.anInt10492 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!jca", name = "n", descriptor = "(B)V")
	private void method8867() {
		this.method8860();
		this.method8876();
		this.method8920();
		this.method8977();
		this.method8928();
		this.method8888();
		this.method8858();
		this.method8856();
		this.method8880();
		this.method8941();
		this.method8915();
		this.method8906();
		this.method8957();
		this.method8967();
		for (@Pc(60) int local60 = this.anInt10459 - 1; local60 >= 0; local60--) {
			this.method8896(local60);
			this.method8974();
			this.method8859();
			this.method8873();
		}
		this.method8929();
		this.method8891();
		this.method8889();
		this.method8936();
		this.method8955();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZILclient!vga;I)V")
	protected abstract void method8868(@OriginalArg(1) int arg0, @OriginalArg(2) Class392 arg1);

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method9403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method8959();
		this.method8852();
		this.method8930(arg4);
		this.method8962(Static547.aClass392_3, 0);
		this.method8897(Static547.aClass392_3, 0);
		this.method8978(arg5);
		this.aClass58_Sub2_15.method6099((float) (arg3 - 1), (float) (arg2 - 1), 1.0F);
		this.aClass58_Sub2_15.method6094((float) arg0 - local7, -local7 + (float) arg1, 0.0F);
		this.method8926();
		this.method8933(false);
		this.method8864(4, Static346.aClass234_4);
		this.method8933(true);
		this.method8897(Static358.aClass392_1, 0);
		this.method8962(Static358.aClass392_1, 0);
	}

	@OriginalMember(owner = "client!jca", name = "s", descriptor = "(B)V")
	private void method8869() {
		if (this.aClass72_27 == Static460.aClass72_20) {
			return;
		}
		@Pc(6) Class72 local6 = this.aClass72_27;
		this.aClass72_27 = Static460.aClass72_20;
		if (!local6.method1981()) {
			this.method8854();
		}
		this.method8884();
		this.aFloatArray71 = this.aFloatArray70;
		this.method8938();
		this.anInt10492 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!jca", name = "W", descriptor = "(I)I")
	public final int method8870() {
		return this.anInt10476;
	}

	@OriginalMember(owner = "client!jca", name = "n", descriptor = "(I)V")
	protected final void method8871() {
		@Pc(9) Enumeration local9 = this.aHashtable6.keys();
		while (local9.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local9.nextElement();
			this.method8982(this.aHashtable6.get(local17), local17);
		}
		this.anInterface14_16.method6754();
		this.anInterface14_18.method6754();
		this.anInterface14_17.method6754();
		for (@Pc(46) int local46 = 0; local46 < 7; local46++) {
			this.aClass170_Sub2Array6[local46].method6698();
		}
		this.aClass310_3.method7047();
		this.anInterface11_8.method6754();
	}

	@OriginalMember(owner = "client!jca", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method8852();
		this.method8930(arg4);
		this.method8962(Static547.aClass392_3, 0);
		this.method8897(Static547.aClass392_3, 0);
		this.method8978(arg5);
		this.aClass58_Sub2_15.method6099((float) arg3, (float) arg2, 1.0F);
		this.aClass58_Sub2_15.method9509(arg0, arg1, 0);
		this.method8926();
		this.method8933(false);
		this.method8951();
		this.method8933(true);
		this.method8897(Static358.aClass392_1, 0);
		this.method8962(Static358.aClass392_1, 0);
	}

	@OriginalMember(owner = "client!jca", name = "G", descriptor = "(I)V")
	private void method8872() {
		this.method8912(this.anInterface14_18, 0);
		this.method8894(this.aClass36_17);
		this.method8904(0, Static35.aClass234_2, 1);
	}

	@OriginalMember(owner = "client!jca", name = "x", descriptor = "(B)V")
	public final void method8873() {
		if (Static184.aClass222_1 != this.aClass222Array3[this.anInt10465]) {
			this.aClass222Array3[this.anInt10465] = Static184.aClass222_1;
			this.aClass58_Sub2Array3[this.anInt10465].method9508();
			this.method8966();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!tm;Z)Lclient!kw;")
	@Override
	public final Class178 method9363(@OriginalArg(0) Class361 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(26) Class178 local26;
		if (arg0.anInt9706 == 0 || arg0.anInt9707 == 0) {
			local26 = this.method9367(new int[1], 1, 1, 1);
		} else {
			@Pc(35) int[] local35 = new int[arg0.anInt9706 * arg0.anInt9707];
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			@Pc(44) int local44;
			@Pc(48) int local48;
			if (arg0.aByteArray91 == null) {
				for (local44 = 0; local44 < arg0.anInt9707; local44++) {
					for (local48 = 0; local48 < arg0.anInt9706; local48++) {
						@Pc(61) int local61 = arg0.anIntArray701[arg0.aByteArray90[local37++] & 0xFF];
						local35[local39++] = local61 == 0 ? 0 : local61 | 0xFF000000;
					}
				}
			} else {
				for (local44 = 0; local44 < arg0.anInt9707; local44++) {
					for (local48 = 0; local48 < arg0.anInt9706; local48++) {
						local35[local39++] = arg0.anIntArray701[arg0.aByteArray90[local37] & 0xFF] | arg0.aByteArray91[local37] << 24;
						local37++;
					}
				}
			}
			local26 = this.method9367(local35, arg0.anInt9706, arg0.anInt9707, arg0.anInt9706);
		}
		local26.method7631(arg0.anInt9703, arg0.anInt9704, arg0.anInt9708, arg0.anInt9705);
		return local26;
	}

	@OriginalMember(owner = "client!jca", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt10478;
	}

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "(B)V")
	protected abstract void method8874();

	@OriginalMember(owner = "client!jca", name = "A", descriptor = "(I)V")
	protected abstract void method8875();

	@OriginalMember(owner = "client!jca", name = "q", descriptor = "()Z")
	@Override
	public final boolean method9380() {
		return false;
	}

	@OriginalMember(owner = "client!jca", name = "y", descriptor = "()V")
	@Override
	protected void method9339() {
		if (this.aBoolean690) {
			return;
		}
		for (@Pc(13) Class3 local13 = this.aClass342_84.method7644(); local13 != null; local13 = this.aClass342_84.method7650()) {
			((Class3_Sub16_Sub2) local13).method7941();
		}
		@Pc(32) Enumeration local32 = this.aHashtable6.keys();
		while (local32.hasMoreElements()) {
			@Pc(42) Canvas local42 = (Canvas) local32.nextElement();
			this.method8982(this.aHashtable6.get(local42), local42);
		}
		Static134.method2374(false, true);
		this.aNativeInterface3.release();
		this.aBoolean690 = true;
	}

	@OriginalMember(owner = "client!jca", name = "y", descriptor = "(B)V")
	protected abstract void method8876();

	@OriginalMember(owner = "client!jca", name = "O", descriptor = "(I)I")
	public final int method8877() {
		return this.anInt10473;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(BLclient!nw;)V")
	public final void method8878(@OriginalArg(1) Class58_Sub2 arg0) {
		this.aClass58_Sub2_15.method9516(arg0);
		this.aBoolean684 = false;
		this.method8935();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I[IIIZII)Lclient!pt;")
	public abstract Interface16 method8879(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jca", name = "u", descriptor = "(B)V")
	protected abstract void method8880();

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([[IIBZ)Lclient!c;")
	public abstract Interface1 method8881(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!jca", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean691 = arg0;
		this.method8880();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method8882(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILclient!bj;)V")
	public abstract void method8883(@OriginalArg(1) Class37 arg0);

	@OriginalMember(owner = "client!jca", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt10347 - 1 <= arg2 && arg1 <= 0 && arg3 >= this.anInt10377 - 1) {
			this.la();
			return;
		}
		this.anInt10472 = this.anInt10347 >= arg3 ? arg3 : 0;
		this.anInt10484 = arg1 < 0 ? 0 : arg1;
		this.anInt10460 = this.anInt10347 < arg2 ? 0 : arg2;
		this.anInt10469 = arg0 < 0 ? 0 : arg0;
		if (!this.aBoolean705) {
			this.aBoolean705 = true;
			this.method8961();
		}
		this.method8975();
		this.method8900();
	}

	@OriginalMember(owner = "client!jca", name = "J", descriptor = "(I)V")
	private void method8884() {
		if (this.aBoolean692) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray70;
		@Pc(9) float local9 = (float) this.anInt10464;
		@Pc(13) float local13 = (float) this.anInt10478;
		@Pc(25) float local25 = this.aFloat191 * (float) -this.anInt10474 / (float) this.anInt10463;
		@Pc(37) float local37 = this.aFloat191 * (float) -this.anInt10461 / (float) this.anInt10455;
		@Pc(52) float local52 = (float) (this.anInt10347 - this.anInt10461) * this.aFloat191 / (float) this.anInt10455;
		@Pc(67) float local67 = this.aFloat191 * (float) (this.anInt10377 - this.anInt10474) / (float) this.anInt10463;
		if (local37 == local52 || local25 == local67) {
			local5[1] = 0.0F;
			local5[13] = 0.0F;
			local5[3] = 0.0F;
			local5[11] = 0.0F;
			local5[9] = 0.0F;
			local5[4] = 0.0F;
			local5[15] = 1.0F;
			local5[7] = 0.0F;
			local5[6] = 0.0F;
			local5[12] = 0.0F;
			local5[0] = 1.0F;
			local5[8] = 0.0F;
			local5[2] = 0.0F;
			local5[10] = 1.0F;
			local5[5] = 1.0F;
			local5[14] = 0.0F;
		} else {
			local5[8] = 0.0F;
			local5[3] = 0.0F;
			local5[5] = 2.0F / (local67 - local25);
			local5[15] = 1.0F;
			local5[13] = (local25 + local67) / (-local25 + local67);
			local5[12] = (local52 + local37) / (-local52 + local37);
			local5[0] = 2.0F / (local52 - local37);
			local5[1] = 0.0F;
			local5[14] = local9 / (local9 - local13);
			local5[9] = 0.0F;
			local5[2] = 0.0F;
			local5[11] = 0.0F;
			local5[6] = 0.0F;
			local5[7] = 0.0F;
			local5[4] = 0.0F;
			local5[10] = 1.0F / (local9 - local13);
		}
		this.method8885();
		this.aBoolean692 = true;
	}

	@OriginalMember(owner = "client!jca", name = "A", descriptor = "()Lclient!cl;")
	@Override
	public final Class58 method9376() {
		return new Class58_Sub2();
	}

	@OriginalMember(owner = "client!jca", name = "M", descriptor = "(I)V")
	private void method8885() {
		this.aFloat180 = (float) this.anInt10478;
	}

	@OriginalMember(owner = "client!jca", name = "q", descriptor = "(I)Lclient!c;")
	public final Interface1 method8886() {
		return this.aClass113_Sub1_3 == null ? null : this.aClass113_Sub1_3.method2783();
	}

	@OriginalMember(owner = "client!jca", name = "v", descriptor = "(B)V")
	public final void method8887() {
		if (this.anInt10492 == 16) {
			return;
		}
		this.method8869();
		this.method8898(true);
		this.method8862(true);
		this.method8902(true);
		this.method8978(1);
		this.anInt10492 = 16;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method9390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!jca", name = "w", descriptor = "(I)V")
	protected abstract void method8888();

	@OriginalMember(owner = "client!jca", name = "t", descriptor = "(B)V")
	protected abstract void method8889();

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Ljava/lang/Object;")
	protected abstract Object method8890(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!jca", name = "C", descriptor = "(I)V")
	protected abstract void method8891();

	@OriginalMember(owner = "client!jca", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass58_Sub2_16.method6103((float) arg0, (float) arg2, (float) arg1);
		if ((float) this.anInt10464 > local14 || (float) this.anInt10478 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(61) int local61 = (int) ((float) this.anInt10455 * this.aClass58_Sub2_16.method6112((float) arg0, (float) arg2, (float) arg1) / (float) arg3);
		@Pc(80) int local80 = (int) ((float) this.anInt10463 * this.aClass58_Sub2_16.method6098((float) arg1, (float) arg0, (float) arg2) / (float) arg3);
		arg4[0] = (int) ((float) local61 - this.aFloat189);
		arg4[1] = (int) ((float) local80 - this.aFloat183);
		arg4[2] = (int) local14;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method9347(@OriginalArg(0) Canvas arg0) {
		this.aCanvas12 = null;
		this.bf = null;
		if (arg0 == null || this.aCanvas11 == arg0) {
			this.bf = this.anObject19;
			this.aCanvas12 = this.aCanvas11;
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.bf = this.aHashtable6.get(arg0);
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.bf == null) {
			throw new RuntimeException();
		}
		this.method8882(this.bf, this.aCanvas12);
		this.method8940();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method9377() {
	}

	@OriginalMember(owner = "client!jca", name = "Q", descriptor = "(I)V")
	public final void method8892() {
		if (Static637.aClass72_24 == this.aClass72_27) {
			return;
		}
		@Pc(18) Class72 local18 = this.aClass72_27;
		this.aClass72_27 = Static637.aClass72_24;
		if (local18.method1981()) {
			this.method8854();
		}
		this.aFloatArray71 = this.aFloatArray69;
		this.anInt10492 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!jca", name = "N", descriptor = "(I)V")
	private void method8893() {
		if (this.aClass10_3 != null) {
			this.aClass10_3.method9550();
		}
		this.method8915();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILclient!wh;)V")
	public abstract void method8894(@OriginalArg(1) Class36 arg0);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILclient!sca;Lclient!hu;)Z")
	public abstract boolean method8895(@OriginalArg(1) Class335 arg0, @OriginalArg(2) Class167 arg1);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IB)V")
	public final void method8896(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt10465) {
			this.anInt10465 = arg0;
			this.method8983();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!vga;IB)V")
	public final void method8897(@OriginalArg(0) Class392 arg0, @OriginalArg(1) int arg1) {
		this.method8868(arg1, arg0);
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(ZB)V")
	public final void method8898(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean686 != arg0) {
			this.aBoolean686 = arg0;
			this.method8941();
			this.anInt10492 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(FIFFFFF)Z")
	private boolean method8899(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(15) Buffer local15 = this.anInterface14_18.method6764();
		if (local15 == null) {
			return false;
		}
		@Pc(25) Stream local25 = this.method8918(local15);
		if (Stream.c()) {
			local25.a(arg4);
			local25.a(arg5);
			local25.a(arg3);
			local25.a(arg1);
			local25.a(arg2);
			local25.a(arg0);
		} else {
			local25.b(arg4);
			local25.b(arg5);
			local25.b(arg3);
			local25.b(arg1);
			local25.b(arg2);
			local25.b(arg0);
		}
		local25.b();
		return this.anInterface14_18.method6766();
	}

	@OriginalMember(owner = "client!jca", name = "k", descriptor = "(I)V")
	private void method8900() {
		this.aFloat189 = (float) (this.anInt10469 - this.anInt10461);
		this.aFloat184 = (float) (this.anInt10460 - this.anInt10461);
		this.aFloat193 = (float) (this.anInt10472 - this.anInt10474);
		this.aFloat183 = (float) (this.anInt10484 - this.anInt10474);
	}

	@OriginalMember(owner = "client!jca", name = "v", descriptor = "()Z")
	@Override
	public final boolean method9342() {
		return this.aClass10Array3[3].method9557();
	}

	@OriginalMember(owner = "client!jca", name = "T", descriptor = "(I)V")
	protected void method8901() {
		this.method8867();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZB)V")
	public final void method8902(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean699 != arg0) {
			this.aBoolean699 = arg0;
			this.method8880();
			this.anInt10492 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!jca", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt10493;
	}

	@OriginalMember(owner = "client!jca", name = "bb", descriptor = "(I)V")
	public final void method8903() {
		this.anInterface21Array3 = new Interface21[this.anInt10459];
		this.aClass372Array6 = new Class372[this.anInt10459];
		this.aClass58_Sub2Array3 = new Class58_Sub2[this.anInt10459];
		this.aClass222Array3 = new Class222[this.anInt10459];
		this.aClass372Array5 = new Class372[this.anInt10459];
		for (@Pc(32) int local32 = 0; local32 < this.anInt10459; local32++) {
			this.aClass372Array5[local32] = Static503.aClass372_4;
			this.aClass372Array6[local32] = Static503.aClass372_4;
			this.aClass222Array3[local32] = Static184.aClass222_1;
			this.aClass58_Sub2Array3[local32] = new Class58_Sub2();
		}
		this.aClass3_Sub5Array5 = new Class3_Sub5[this.anInt10491 - 2];
		this.anInterface21_3 = this.method8857(Static259.aClass167_7, 1, 1, Static646.aClass335_14);
		this.method9331(new Class3_Sub16_Sub2(262144));
		this.aClass36_22 = this.method8944(new Class95[] { new Class95(new Class278[] { Static469.aClass278_1, Static469.aClass278_5 }) });
		this.aClass36_23 = this.method8944(new Class95[] { new Class95(new Class278[] { Static469.aClass278_1, Static469.aClass278_3 }) });
		this.aClass36_18 = this.method8944(new Class95[] { new Class95(Static469.aClass278_1), new Class95(Static469.aClass278_3), new Class95(Static469.aClass278_5), new Class95(Static469.aClass278_2) });
		this.aClass36_19 = this.method8944(new Class95[] { new Class95(Static469.aClass278_1), new Class95(Static469.aClass278_3), new Class95(Static469.aClass278_5) });
		for (@Pc(196) int local196 = 0; local196 < 7; local196++) {
			this.aClass170_Sub2Array5[local196] = new Class170_Sub2(this, 0, 0, false, false);
			this.aClass170_Sub2Array6[local196] = new Class170_Sub2(this, 0, 0, true, true);
		}
		this.aClass310_3 = new Class310(this);
		this.anInterface11_8 = this.method8916(true);
		this.method8948();
		this.aClass172_7 = new Class172(this);
		this.aClass10Array3[1] = this.method8960(1);
		this.aClass10Array3[2] = this.method8960(2);
		this.aClass10Array3[4] = this.method8960(4);
		this.aClass10Array3[5] = this.method8960(5);
		this.aClass10Array3[6] = this.method8960(6);
		this.aClass10Array3[7] = this.method8960(7);
		this.aClass10Array3[3] = this.method8960(3);
		this.aClass10Array3[8] = this.method8960(8);
		this.aClass10Array3[9] = this.method8960(9);
		if (!this.aClass10Array3[2].method9557()) {
			this.aClass10Array3[2] = this.method8960(0);
		}
		if (!this.aClass10Array3[4].method9557()) {
			this.aClass10Array3[4] = this.aClass10Array3[2];
		}
		if (!this.aClass10Array3[8].method9557()) {
			this.aClass10Array3[8] = this.aClass10Array3[4];
		}
		if (!this.aClass10Array3[9].method9557()) {
			this.aClass10Array3[9] = this.aClass10Array3[8];
		}
		this.method8901();
		this.la();
		this.method9389();
	}

	@OriginalMember(owner = "client!jca", name = "n", descriptor = "()Lclient!cl;")
	@Override
	public final Class58 method9354() {
		return this.aClass58_Sub2_21;
	}

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt10464 == arg0 && arg1 == this.anInt10478) {
			return;
		}
		this.anInt10478 = arg1;
		this.anInt10464 = arg0;
		this.method8958();
		this.method8851();
		this.method8893();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILclient!lma;ZI)V")
	public abstract void method8904(@OriginalArg(0) int arg0, @OriginalArg(1) Class234 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method9395(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas11) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.method8982(this.aHashtable6.get(arg0), arg0);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!jca", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt10469) {
			local5 = true;
			this.anInt10469 = arg0;
		}
		if (arg2 < this.anInt10460) {
			local5 = true;
			this.anInt10460 = arg2;
		}
		if (arg1 > this.anInt10484) {
			this.anInt10484 = arg1;
			local5 = true;
		}
		if (arg3 < this.anInt10472) {
			this.anInt10472 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean705) {
			this.aBoolean705 = true;
			this.method8961();
		}
		this.method8975();
		this.method8900();
	}

	@OriginalMember(owner = "client!jca", name = "z", descriptor = "(I)V")
	public final void method8905() {
		this.aClass58_Sub2_15.method9508();
		this.aBoolean684 = true;
		this.method8935();
	}

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "(B)V")
	protected abstract void method8906();

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!ih;)V")
	@Override
	public final void method9333(@OriginalArg(0) Class113 arg0) {
		this.aClass113_Sub1_3 = (Class113_Sub1) arg0;
	}

	@OriginalMember(owner = "client!jca", name = "Y", descriptor = "(I)Lclient!nw;")
	public final Class58_Sub2 method8907() {
		return this.aClass58_Sub2_19;
	}

	@OriginalMember(owner = "client!jca", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt10487 && arg1 == this.anInt10480 && this.anInt10458 == arg2) {
			return;
		}
		this.anInt10458 = arg2;
		this.anInt10487 = arg0;
		this.anInt10480 = arg1;
		this.method8893();
		this.method8941();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZ)V")
	public final void method8908(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean704 != arg0) {
			this.aBoolean704 = arg0;
			this.method8858();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(FI)V")
	public final void method8909(@OriginalArg(0) float arg0) {
		if (this.aFloat191 != arg0) {
			this.aFloat191 = arg0;
			this.method8851();
		}
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V")
	@Override
	public final void method9373(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	protected abstract void method8910(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIF)Lclient!jw;")
	@Override
	public final Class3_Sub5 method9337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub5_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "(I)V")
	@Override
	public final void method9338(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass156_3 != null) {
			this.aClass156_3.method3431();
		}
		this.anInt10485 = arg0;
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)V")
	@Override
	public void method9394(@OriginalArg(0) int arg0) {
		if (this.aClass156_3 != null) {
			this.aClass156_3.method3432();
		}
		this.anInt10466 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method9341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "(ZI)V")
	public final void method8911(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean698 != arg0) {
			this.aBoolean698 = arg0;
			this.method8941();
		}
	}

	@OriginalMember(owner = "client!jca", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass58_Sub2_16.method6103((float) arg0, (float) arg2, (float) arg1);
		@Pc(27) int local27;
		@Pc(30) int local30;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local27 = (int) ((float) this.anInt10455 * this.aClass58_Sub2_16.method6112((float) arg0, (float) arg2, (float) arg1) / local14);
			local30 = (int) ((float) this.anInt10463 * this.aClass58_Sub2_16.method6098((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local27 = this.anInt10461;
			local30 = this.anInt10474;
		}
		arg3[0] = (int) ((float) local27 - this.aFloat189);
		arg3[1] = (int) ((float) local30 - this.aFloat183);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!lq;II)V")
	public abstract void method8912(@OriginalArg(0) Interface14 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jca", name = "I", descriptor = "(I)Lclient!nw;")
	public final Class58_Sub2 method8913() {
		return this.aClass58_Sub2_18;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!ug;Lclient!ug;B)V")
	public final void method8914(@OriginalArg(0) Class372 arg0, @OriginalArg(1) Class372 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg1 != this.aClass372Array6[this.anInt10465]) {
			this.aClass372Array6[this.anInt10465] = arg1;
			local5 = true;
			this.method8974();
		}
		if (arg0 != this.aClass372Array5[this.anInt10465]) {
			this.aClass372Array5[this.anInt10465] = arg0;
			local5 = true;
			this.method8859();
		}
		if (local5) {
			this.anInt10492 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "(I)Lclient!za;")
	@Override
	public final Class3_Sub16 method9329(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub16_Sub2 local8 = new Class3_Sub16_Sub2(arg0);
		this.aClass342_84.method7654(local8);
		return local8;
	}

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "(Z)V")
	protected abstract void method8915();

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(ZI)Lclient!kl;")
	public abstract Interface11 method8916(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jca", name = "E", descriptor = "(I)V")
	private void method8917() {
		this.aFloatArray77[14] = this.aFloat192;
		this.aFloatArray77[10] = this.aFloat177;
		this.aFloat179 = ((float) -this.anInt10478 + this.aFloatArray77[14]) / this.aFloatArray77[10];
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(Z)V")
	@Override
	public final void method9374(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!so;)V")
	@Override
	public final void method9384(@OriginalArg(0) Class346 arg0) {
		this.aClass310_3.method7044(-1, this, arg0);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method8918(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZLclient!sca;I[FII)Lclient!pt;")
	public final Interface16 method8919(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method8931(arg0, arg2, arg4, arg3, arg1);
	}

	@OriginalMember(owner = "client!jca", name = "H", descriptor = "(I)V")
	protected abstract void method8920();

	@OriginalMember(owner = "client!jca", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass58_Sub2_16.aFloat111 + this.aClass58_Sub2_16.aFloat115 * (float) arg0 + this.aClass58_Sub2_16.aFloat113 * (float) arg1 + this.aClass58_Sub2_16.aFloat114 * (float) arg2;
		@Pc(57) float local57 = this.aClass58_Sub2_16.aFloat111 + (float) arg5 * this.aClass58_Sub2_16.aFloat114 + this.aClass58_Sub2_16.aFloat113 * (float) arg4 + this.aClass58_Sub2_16.aFloat115 * (float) arg3;
		if ((float) this.anInt10464 > local32 && (float) this.anInt10464 > local57) {
			local7 |= 0x10;
		} else if ((float) this.anInt10478 < local32 && (float) this.anInt10478 < local57) {
			local7 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((float) this.anInt10455 * (this.aClass58_Sub2_16.aFloat108 + (float) arg2 * this.aClass58_Sub2_16.aFloat110 + (float) arg0 * this.aClass58_Sub2_16.aFloat120 + this.aClass58_Sub2_16.aFloat112 * (float) arg1) / (float) arg6);
		@Pc(163) int local163 = (int) ((this.aClass58_Sub2_16.aFloat108 + this.aClass58_Sub2_16.aFloat120 * (float) arg3 + (float) arg4 * this.aClass58_Sub2_16.aFloat112 + (float) arg5 * this.aClass58_Sub2_16.aFloat110) * (float) this.anInt10455 / (float) arg6);
		if ((float) local130 < this.aFloat189 && this.aFloat189 > (float) local163) {
			local7 |= 0x1;
		} else if (this.aFloat184 < (float) local130 && this.aFloat184 < (float) local163) {
			local7 |= 0x2;
		}
		@Pc(236) int local236 = (int) ((float) this.anInt10463 * (this.aClass58_Sub2_16.aFloat116 + (float) arg1 * this.aClass58_Sub2_16.aFloat109 + (float) arg0 * this.aClass58_Sub2_16.aFloat117 + (float) arg2 * this.aClass58_Sub2_16.aFloat119) / (float) arg6);
		@Pc(269) int local269 = (int) ((this.aClass58_Sub2_16.aFloat117 * (float) arg3 + (float) arg4 * this.aClass58_Sub2_16.aFloat109 + (float) arg5 * this.aClass58_Sub2_16.aFloat119 + this.aClass58_Sub2_16.aFloat116) * (float) this.anInt10463 / (float) arg6);
		if (this.aFloat183 > (float) local236 && (float) local269 < this.aFloat183) {
			local7 |= 0x4;
		} else if (this.aFloat193 < (float) local236 && (float) local269 > this.aFloat193) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jca", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat182 != arg0) {
			this.aFloat182 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method8860();
			this.method8888();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIZ)Lclient!kw;")
	@Override
	public final Class178 method9356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class178_Sub3 local11 = new Class178_Sub3(this, arg2, arg3, arg4);
		local11.method7624(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!jca", name = "k", descriptor = "(B)Lclient!nw;")
	public final Class58_Sub2 method8921() {
		return this.aClass58_Sub2Array3[this.anInt10465];
	}

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "(Z)Lclient!nw;")
	public final Class58_Sub2 method8922() {
		return this.aClass58_Sub2Array3[this.anInt10465];
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "(II)I")
	@Override
	public final int method9375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!jca", name = "p", descriptor = "(I)V")
	public final void method8923() {
		if (this.anInt10492 == 8) {
			return;
		}
		this.method8866();
		this.method8898(true);
		this.method8862(true);
		this.method8902(true);
		this.method8978(1);
		this.anInt10492 = 8;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!le;B)V")
	public final void method8924(@OriginalArg(0) Class222 arg0) {
		this.aClass222Array3[this.anInt10465] = arg0;
		this.method8966();
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "(Z)I")
	public final int method8925() {
		return this.anInt10465;
	}

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "(B)V")
	public final void method8926() {
		this.aBoolean684 = false;
		this.method8935();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([I)V")
	@Override
	public final void method9371(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt10347;
		arg0[1] = this.anInt10377;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(BZ)V")
	public final void method8927(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean703 != arg0) {
			this.aBoolean703 = arg0;
			this.method8920();
			this.anInt10492 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "()Z")
	@Override
	public final boolean method9379() {
		return true;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!hw;[Lclient!tm;Z)Lclient!da;")
	@Override
	public final Class57 method9353(@OriginalArg(0) Class169 arg0, @OriginalArg(1) Class361[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class57_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jca", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt10450 + this.anInt10452 + this.anInt10451;
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(II)I")
	@Override
	public final int method9324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!jca", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "(B)V")
	public abstract void method8928();

	@OriginalMember(owner = "client!jca", name = "y", descriptor = "(I)V")
	protected abstract void method8929();

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(IB)V")
	public final void method8930(@OriginalArg(0) int arg0) {
		if (this.anInt10468 != arg0) {
			this.anInt10468 = arg0;
			this.method8929();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIBZ[FIILclient!sca;)Lclient!pt;")
	protected abstract Interface16 method8931(@OriginalArg(3) boolean arg0, @OriginalArg(4) float[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class335 arg4);

	@OriginalMember(owner = "client!jca", name = "R", descriptor = "(I)I")
	public final int method8932() {
		return this.anInt10457;
	}

	@OriginalMember(owner = "client!jca", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean697) {
			throw new RuntimeException("");
		}
		this.anInt10457 = arg1;
		this.anInt10473 = arg0;
		this.anInt10475 = arg3;
		this.anInt10476 = arg2;
		if (this.aBoolean687) {
			this.aClass10Array3[3].method9554();
			this.aClass10Array3[3].method9550();
		}
	}

	@OriginalMember(owner = "client!jca", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10476 = arg2;
		this.anInt10473 = arg0;
		this.anInt10457 = arg1;
		this.anInt10475 = arg3;
		this.aBoolean697 = true;
	}

	@OriginalMember(owner = "client!jca", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface16 local9 = local6.anInterface16_5;
		this.method8943();
		this.method8976(local9);
		this.method8978(1);
		this.method8914(Static468.aClass372_3, Static468.aClass372_3);
		this.method8962(Static547.aClass392_3, 0);
		this.method8930(arg0);
		this.aClass58_Sub2_15.method6099((float) this.anInt10377, (float) this.anInt10347, 0.0F);
		this.method8926();
		this.aClass58_Sub2Array3[0].method6099(local9.method8250((float) this.anInt10377), local9.method8247((float) this.anInt10347), 1.0F);
		this.aClass58_Sub2Array3[0].method6094(local9.method8247((float) -arg2), local9.method8250((float) -arg3), 0.0F);
		this.aClass222Array3[0] = Static606.aClass222_6;
		this.method8966();
		this.method8951();
		this.method8873();
		this.method8962(Static358.aClass392_1, 0);
	}

	@OriginalMember(owner = "client!jca", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass58_Sub2_16.method6103((float) arg0, (float) arg2, (float) arg1);
		@Pc(42) int local42;
		@Pc(60) int local60;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local42 = (int) ((float) this.anInt10455 * this.aClass58_Sub2_16.method6112((float) arg0, (float) arg2, (float) arg1) / local14);
			local60 = (int) ((float) this.anInt10463 * this.aClass58_Sub2_16.method6098((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local42 = this.anInt10461;
			local60 = this.anInt10474;
		}
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local42 - this.aFloat189);
		arg3[1] = (int) ((float) local60 - this.aFloat183);
	}

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "(I)V")
	@Override
	public final void method9343() {
	}

	@OriginalMember(owner = "client!jca", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt10461, this.anInt10474, this.anInt10455, this.anInt10463 };
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(ZB)V")
	public abstract void method8933(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IILclient!sca;B[BZ)Lclient!pt;")
	public final Interface16 method8934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) boolean arg4) {
		return this.method8980(arg3, arg1, arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)V")
	private void method8935() {
		if (this.aClass72_27 == Static590.aClass72_25) {
			@Pc(7) float local7 = this.method8959();
			this.aClass58_Sub2_15.method6094(local7, local7, 0.0F);
		}
		this.aBoolean695 = false;
		this.method8936();
		if (this.aClass10_3 != null) {
			this.aClass10_3.method9556();
		}
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(Z)V")
	protected abstract void method8936();

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(BZ)Lclient!lq;")
	public abstract Interface14 method8937(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!jca", name = "F", descriptor = "(I)V")
	private void method8938() {
		this.method8889();
		if (this.aClass10_3 != null) {
			this.aClass10_3.method9553();
		}
	}

	@OriginalMember(owner = "client!jca", name = "q", descriptor = "(B)V")
	private void method8939() {
		if (this.aBoolean702) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray77;
		@Pc(17) float local17 = (float) (this.anInt10464 * -this.anInt10461) / (float) this.anInt10455;
		@Pc(32) float local32 = (float) (this.anInt10464 * (this.anInt10347 - this.anInt10461)) / (float) this.anInt10455;
		@Pc(43) float local43 = (float) (this.anInt10464 * this.anInt10474) / (float) this.anInt10463;
		@Pc(57) float local57 = (float) (this.anInt10464 * (this.anInt10474 - this.anInt10377)) / (float) this.anInt10463;
		if (local32 == local17 || local43 == local57) {
			local5[12] = 0.0F;
			local5[15] = 1.0F;
			local5[8] = 0.0F;
			local5[6] = 0.0F;
			local5[5] = 1.0F;
			local5[3] = 0.0F;
			local5[13] = 0.0F;
			local5[14] = 0.0F;
			local5[9] = 0.0F;
			local5[1] = 0.0F;
			local5[10] = 1.0F;
			local5[11] = 0.0F;
			local5[7] = 0.0F;
			local5[2] = 0.0F;
			local5[0] = 1.0F;
			local5[4] = 0.0F;
		} else {
			@Pc(73) float local73 = (float) this.anInt10464 * 2.0F;
			local5[2] = 0.0F;
			local5[7] = 0.0F;
			local5[3] = 0.0F;
			local5[8] = (local32 + local17) / (-local17 + local32);
			local5[1] = 0.0F;
			local5[10] = this.aFloat177 = (float) this.anInt10478 / (float) (this.anInt10464 - this.anInt10478);
			local5[9] = (local57 + local43) / (local43 - local57);
			local5[5] = local73 / (local43 - local57);
			local5[6] = 0.0F;
			local5[12] = 0.0F;
			local5[0] = local73 / (local32 - local17);
			local5[14] = this.aFloat192 = (float) (this.anInt10464 * this.anInt10478) / (float) (this.anInt10464 - this.anInt10478);
			local5[15] = 0.0F;
			local5[4] = 0.0F;
			local5[13] = 0.0F;
			local5[11] = -1.0F;
		}
		this.method8917();
		this.aBoolean702 = true;
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "(I)V")
	private void method8940() {
		if (this.aCanvas12 == null) {
			this.anInt10382 = this.anInt10289 = 1;
		} else {
			@Pc(19) Dimension local19 = this.aCanvas12.getSize();
			this.anInt10289 = local19.height;
			this.anInt10382 = local19.width;
		}
		this.anInt10377 = this.anInt10289;
		this.anInt10347 = this.anInt10382;
		this.method8968();
		this.method8958();
		this.method8851();
		this.method8891();
		this.method8900();
		this.method8892();
		this.la();
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "(B)V")
	protected abstract void method8941();

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!gt;IIII)Lclient!ka;")
	@Override
	public final Class170 method9382(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class170_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "(Z)Lclient!nw;")
	public final Class58_Sub2 method8942() {
		if (!this.aBoolean695) {
			this.aClass58_Sub2_20.method6101(this.aClass58_Sub2_18, this.aClass58_Sub2_15);
			this.aBoolean695 = true;
		}
		return this.aClass58_Sub2_20;
	}

	@OriginalMember(owner = "client!jca", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8852();
		this.method8930(arg3);
		this.method8962(Static547.aClass392_3, 0);
		this.method8897(Static547.aClass392_3, 0);
		this.method8978(arg4);
		this.aClass58_Sub2_15.method6099((float) arg2, (float) arg2, 1.0F);
		this.aClass58_Sub2_15.method9509(arg0, arg1, 0);
		this.method8926();
		this.method8933(false);
		this.method8912(this.anInterface14_17, 0);
		this.method8894(this.aClass36_20);
		this.method8904(0, Static339.aClass234_3, 256);
		this.method8933(true);
		this.method8897(Static358.aClass392_1, 0);
		this.method8962(Static358.aClass392_1, 0);
	}

	@OriginalMember(owner = "client!jca", name = "Z", descriptor = "(I)V")
	public final void method8943() {
		if (this.anInt10492 == 2) {
			return;
		}
		this.method8863();
		this.method8898(false);
		this.method8927(false);
		this.method8862(false);
		this.method8902(false);
		this.method8979(false, false, -2);
		this.anInt10492 = 2;
	}

	@OriginalMember(owner = "client!jca", name = "t", descriptor = "()I")
	@Override
	public final int method9362() {
		return this.anInt10491 - 2;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B[Lclient!ega;)Lclient!wh;")
	public abstract Class36 method8944(@OriginalArg(1) Class95[] arg0);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method9349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local9 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local9 * local9 + local16 * local16));
			local18 = (float) Math.atan2((double) local16, (double) local9);
		}
		this.method8852();
		this.method8930(arg4);
		this.method8962(Static547.aClass392_3, 0);
		this.method8897(Static547.aClass392_3, 0);
		this.method8978(0);
		this.aClass58_Sub2_15.method6099((float) arg5, local20, 1.0F);
		this.aClass58_Sub2_15.method9509(0, -arg5 / 2, 0);
		this.aClass58_Sub2_15.method9517((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass58_Sub2_15.method9509(arg0, arg1, 0);
		this.method8926();
		this.method8933(false);
		this.method8951();
		this.method8933(true);
		this.method8897(Static358.aClass392_1, 0);
		this.method8962(Static358.aClass392_1, 0);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([IIIIIZ)Lclient!kw;")
	@Override
	public final Class178 method9322(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class178_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!jca", name = "o", descriptor = "(B)V")
	private void method8945() {
		this.anInterface14_16 = this.method8937(false);
		this.anInterface14_16.method6767(28, 140);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface14_16.method6764();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method8918(local28);
				if (Stream.c()) {
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
				local35.b();
				if (this.anInterface14_16.method6766()) {
					break;
				}
			}
		}
		this.aClass36_21 = this.method8944(new Class95[] { new Class95(new Class278[] { Static469.aClass278_1, Static469.aClass278_5, Static469.aClass278_5 }) });
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([FI)[F")
	public final float[] method8946(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray71[0];
		arg0[8] = this.aFloatArray71[2];
		arg0[12] = this.aFloatArray71[3];
		arg0[4] = this.aFloatArray71[1];
		arg0[1] = this.aFloatArray71[4];
		arg0[9] = this.aFloatArray71[6];
		arg0[13] = this.aFloatArray71[7];
		arg0[5] = this.aFloatArray71[5];
		arg0[2] = this.aFloatArray71[8];
		arg0[6] = this.aFloatArray71[9];
		arg0[7] = this.aFloatArray71[13];
		arg0[3] = this.aFloatArray71[12];
		arg0[14] = this.aFloatArray71[11];
		arg0[10] = this.aFloatArray71[10];
		arg0[11] = this.aFloatArray71[14];
		arg0[15] = this.aFloatArray71[15];
		return arg0;
	}

	@OriginalMember(owner = "client!jca", name = "o", descriptor = "(I)V")
	protected final void method8948() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable6 != null && !this.aHashtable6.isEmpty()) {
			@Pc(22) Enumeration local22 = this.aHashtable6.keys();
			while (local22.hasMoreElements()) {
				@Pc(28) Canvas local28 = (Canvas) local22.nextElement();
				local9.put(local28, this.method8890(local28));
			}
		}
		this.aHashtable6 = local9;
		this.method8945();
		this.method8970();
		this.method8855();
		this.aClass310_3.method7049(this);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method9370(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas11 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable6.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(32) Class local32 = Class.forName("java.awt.Canvas");
				@Pc(44) Method local44 = local32.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local44.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(56) Exception local56) {
			}
			@Pc(61) Object local61 = this.method8890(arg0);
			if (local61 == null) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, local61);
		}
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)V")
	public final void method8949() {
		this.method8892();
		this.method8938();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I[IIIZ)Lclient!pt;")
	public final Interface16 method8950(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		return this.method8879(0, arg0, 0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!jca", name = "ab", descriptor = "(I)V")
	public final void method8951() {
		this.method8864(2, Static339.aClass234_3);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!so;I)V")
	@Override
	public final void method9360(@OriginalArg(0) Class346 arg0, @OriginalArg(1) int arg1) {
		this.aClass310_3.method7044(arg1, this, arg0);
	}

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "()Z")
	@Override
	public final boolean method9388() {
		return true;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIZ)Lclient!kw;")
	@Override
	public final Class178 method9361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class178_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jca", name = "r", descriptor = "(B)[F")
	public final float[] method8952() {
		return this.aFloatArray69;
	}

	@OriginalMember(owner = "client!jca", name = "w", descriptor = "()V")
	@Override
	public final void method9328() {
		if (this.aClass156_3 != null) {
			this.aClass156_3.method3431();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!hu;ILclient!sca;)Z")
	public abstract boolean method8953(@OriginalArg(0) Class167 arg0, @OriginalArg(2) Class335 arg1);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class259 method9407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class259_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!jca", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10463 = arg3;
		this.anInt10455 = arg2;
		this.anInt10461 = arg0;
		this.anInt10474 = arg1;
		this.method8851();
		this.method8958();
		this.method8892();
		this.method8900();
	}

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "()Z")
	@Override
	public final boolean method9392() {
		return true;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZZILclient!vga;)V")
	public abstract void method8954(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class392 arg3);

	@OriginalMember(owner = "client!jca", name = "u", descriptor = "()Z")
	@Override
	public final boolean method9386() {
		return false;
	}

	@OriginalMember(owner = "client!jca", name = "t", descriptor = "(I)V")
	protected abstract void method8955();

	@OriginalMember(owner = "client!jca", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method9404(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!jca", name = "fb", descriptor = "(I)V")
	public final void method8956() {
		if (this.anInt10492 == 4) {
			return;
		}
		this.method8863();
		this.method8898(false);
		this.method8927(false);
		this.method8862(false);
		this.method8902(false);
		this.method8979(false, false, -2);
		this.method8978(1);
		this.method8853(0);
		this.anInt10492 = 4;
	}

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "(B)V")
	protected abstract void method8957();

	@OriginalMember(owner = "client!jca", name = "D", descriptor = "(I)V")
	private void method8958() {
		this.aBoolean702 = false;
		this.method8939();
		if (this.aClass72_27 == Static135.aClass72_28) {
			this.method8938();
		}
	}

	@OriginalMember(owner = "client!jca", name = "l", descriptor = "(B)F")
	protected abstract float method8959();

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "(II)Lclient!ag;")
	protected Class10 method8960(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class10_Sub10(this);
		} else if (arg0 == 1) {
			return new Class10_Sub6(this);
		} else if (arg0 == 2) {
			return new Class10_Sub7(this, this.aClass172_7);
		} else if (arg0 == 7) {
			return new Class10_Sub4(this);
		} else {
			return new Class10_Sub3(this);
		}
	}

	@OriginalMember(owner = "client!jca", name = "cb", descriptor = "(I)V")
	protected abstract void method8961();

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "(I)V")
	@Override
	public final void method9357(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!vga;II)V")
	public final void method8962(@OriginalArg(0) Class392 arg0, @OriginalArg(2) int arg1) {
		this.method8954(arg1, false, false, arg0);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZBI)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method8963(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap6.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!jca", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt10469 = 0;
		this.anInt10460 = this.anInt10347;
		this.anInt10472 = this.anInt10377;
		this.anInt10484 = 0;
		if (this.aBoolean705) {
			this.aBoolean705 = false;
			this.method8961();
		}
		this.method8900();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method9404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		if (local9 == 0.0F && local16 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(43) float local43 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local16 * local16)));
			local9 *= local43;
			local16 *= local43;
		}
		if (!this.method8899(0.0F, (float) arg2 + local9, (float) arg3 + local16, 0.0F, (float) arg0, (float) arg1)) {
			return;
		}
		this.method8852();
		this.method8930(arg4);
		this.method8962(Static547.aClass392_3, 0);
		this.method8897(Static547.aClass392_3, 0);
		this.method8978(arg5);
		this.method8905();
		this.method8933(false);
		this.method8872();
		this.method8933(true);
		this.method8897(Static358.aClass392_1, 0);
		this.method8962(Static358.aClass392_1, 0);
	}

	@OriginalMember(owner = "client!jca", name = "U", descriptor = "(I)Lclient!nw;")
	public final Class58_Sub2 method8965() {
		return this.aClass58_Sub2_15;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I[Lclient!jw;)V")
	@Override
	public final void method9350(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub5[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub5Array5[local7] = arg1[local7];
		}
		this.anInt10477 = arg0;
		if (this.aClass72_27.method1981()) {
			this.method8977();
		}
	}

	@OriginalMember(owner = "client!jca", name = "p", descriptor = "(B)V")
	private void method8966() {
		this.method8875();
		if (this.aClass10_3 != null) {
			this.aClass10_3.method9548();
		}
	}

	@OriginalMember(owner = "client!jca", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(12) boolean local12 = arg0 != this.anInt10471;
		if (local12 || arg1 != this.aFloat188 || this.aFloat190 != arg2) {
			this.aFloat190 = arg2;
			this.aFloat188 = arg1;
			this.anInt10471 = arg0;
			if (local12) {
				this.aFloat186 = (float) (this.anInt10471 & 0xFF0000) / 1.671168E7F;
				this.aFloat185 = (float) (this.anInt10471 & 0xFF) / 255.0F;
				this.aFloat178 = (float) (this.anInt10471 & 0xFF00) / 65280.0F;
				this.method8860();
			}
			this.aNativeInterface3.setSunColour(this.aFloat186, this.aFloat178, this.aFloat185, arg1, arg2);
			this.method8876();
		}
		if (this.aFloatArray74[0] != arg3 || this.aFloatArray74[1] != arg4 || this.aFloatArray74[2] != arg5) {
			this.aFloatArray74[2] = arg5;
			this.aFloatArray74[0] = arg3;
			this.aFloatArray74[1] = arg4;
			this.aFloatArray73[0] = -arg3;
			this.aFloatArray73[2] = -arg5;
			this.aFloatArray73[1] = -arg4;
			@Pc(162) float local162 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray72[1] = local162 * arg4;
			this.aFloatArray72[2] = local162 * arg5;
			this.aFloatArray72[0] = arg3 * local162;
			this.aFloatArray76[1] = -this.aFloatArray72[1];
			this.aFloatArray76[2] = -this.aFloatArray72[2];
			this.aFloatArray76[0] = -this.aFloatArray72[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray72[0], this.aFloatArray72[1], this.aFloatArray72[2]);
			this.method8928();
			this.anInt10486 = (int) (arg5 * 256.0F / arg4);
			this.anInt10490 = (int) (arg3 * 256.0F / arg4);
		}
		this.method8888();
	}

	@OriginalMember(owner = "client!jca", name = "r", descriptor = "(I)V")
	protected abstract void method8967();

	@OriginalMember(owner = "client!jca", name = "eb", descriptor = "(I)V")
	private void method8968() {
		this.aBoolean685 = false;
		if (this.aClass72_27 == Static590.aClass72_25) {
			this.method8973();
			this.method8938();
		}
	}

	@OriginalMember(owner = "client!jca", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method9404(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(IZ)V")
	public final void method8969(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean688) {
			this.aBoolean688 = arg0;
			this.method8920();
		}
	}

	@OriginalMember(owner = "client!jca", name = "m", descriptor = "(B)V")
	private void method8970() {
		this.anInterface14_18 = this.method8937(true);
		this.anInterface14_18.method6767(12, 24);
		this.aClass36_17 = this.method8944(new Class95[] { new Class95(Static469.aClass278_1) });
	}

	@OriginalMember(owner = "client!jca", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt10462 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt10462++;
		}
		this.anInt10479 = 0x1 << this.anInt10462;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZI)Lclient!kl;")
	public final Interface11 method8971(@OriginalArg(1) int arg0) {
		if (this.anInterface11_8.method6752() < arg0 * 2) {
			this.anInterface11_8.method6757(arg0);
		}
		return this.anInterface11_8;
	}

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "(II)V")
	public abstract void method8972(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jca", name = "S", descriptor = "(I)V")
	private void method8973() {
		if (this.aBoolean685) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray75;
		if (this.anInt10347 == 0 || this.anInt10377 == 0) {
			local5[2] = 0.0F;
			local5[1] = 0.0F;
			local5[13] = 0.0F;
			local5[4] = 0.0F;
			local5[3] = 0.0F;
			local5[15] = 1.0F;
			local5[6] = 0.0F;
			local5[5] = 1.0F;
			local5[8] = 0.0F;
			local5[12] = 0.0F;
			local5[0] = 1.0F;
			local5[11] = 0.0F;
			local5[10] = 1.0F;
			local5[7] = 0.0F;
			local5[14] = 0.0F;
			local5[9] = 0.0F;
		} else {
			local5[0] = 2.0F / (float) this.anInt10347;
			local5[10] = 0.5F;
			local5[2] = 0.0F;
			local5[13] = 1.0F;
			local5[12] = -1.0F;
			local5[7] = 0.0F;
			local5[1] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt10377;
			local5[15] = 1.0F;
			local5[8] = 0.0F;
			local5[9] = 0.0F;
			local5[11] = 0.0F;
			local5[14] = 0.5F;
			local5[4] = 0.0F;
			local5[6] = 0.0F;
			local5[3] = 0.0F;
		}
		this.aBoolean685 = true;
	}

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "(Z)V")
	protected abstract void method8974();

	@OriginalMember(owner = "client!jca", name = "v", descriptor = "(I)V")
	protected abstract void method8975();

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!sc;I)V")
	public final void method8976(@OriginalArg(0) Interface21 arg0) {
		if (arg0 == this.anInterface21Array3[this.anInt10465]) {
			return;
		}
		this.anInterface21Array3[this.anInt10465] = arg0;
		if (arg0 == null) {
			this.method8874();
		} else {
			arg0.method9230();
		}
		this.anInt10492 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!jca", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt10464;
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method9401(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas11 == arg0) {
			local5 = this.bf;
		} else if (this.aHashtable6.containsKey(arg0)) {
			local5 = this.aHashtable6.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method8910(arg0, local5);
		if (this.aCanvas12 == arg0) {
			this.method8940();
		}
	}

	@OriginalMember(owner = "client!jca", name = "x", descriptor = "(I)V")
	protected void method8977() {
		this.anInt10467 = this.anInt10477;
		this.anInt10477 = 0;
	}

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "(II)V")
	public final void method8978(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt10470) {
			return;
		}
		@Pc(24) Class135 local24;
		@Pc(22) boolean local22;
		@Pc(26) boolean local26;
		if (arg0 == 1) {
			local22 = true;
			local24 = Static302.aClass135_5;
			local26 = true;
		} else if (arg0 == 2) {
			local26 = false;
			local24 = Static197.aClass135_6;
			local22 = true;
		} else if (arg0 == 128) {
			local22 = true;
			local24 = Static77.aClass135_2;
			local26 = true;
		} else {
			local24 = Static35.aClass135_1;
			local22 = false;
			local26 = false;
		}
		if (local26 != this.aBoolean701) {
			this.aBoolean701 = local26;
			this.method8967();
		}
		if (local22 != this.aBoolean694) {
			this.aBoolean694 = local22;
			this.method8906();
		}
		if (local24 != this.aClass135_8) {
			this.aClass135_8 = local24;
			this.method8957();
		}
		this.anInt10492 &= 0xFFFFFFE3;
		this.anInt10470 = arg0;
	}

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "(I)V")
	@Override
	public final void method9387(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZZII)V")
	public final void method8979(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt10481 != arg2 || this.aBoolean697 != this.aBoolean687) {
			@Pc(35) Interface16 local35 = null;
			@Pc(37) int local37 = 0;
			@Pc(39) byte local39 = 0;
			@Pc(41) int local41 = 0;
			@Pc(49) int local49 = this.aBoolean697 ? 3 : 0;
			if (arg2 < 0) {
				this.method8873();
			} else {
				local35 = this.aClass156_3.method3434(arg2);
				@Pc(65) Class406 local65 = super.anInterface4_14.method5761(arg2);
				if (local65.aByte145 == 0 && local65.aByte150 == 0) {
					this.method8873();
				} else {
					@Pc(83) int local83 = local65.aBoolean762 ? 64 : 128;
					@Pc(87) int local87 = local83 * 50;
					@Pc(91) Class58_Sub2 local91 = this.method8922();
					local91.method6110((float) (local65.aByte150 * (this.anInt10466 % local87)) / (float) local87, (float) (this.anInt10466 % local87 * local65.aByte145) / (float) local87, 0.0F);
					this.method8924(Static606.aClass222_6);
				}
				if (!this.aBoolean697) {
					local39 = local65.aByte147;
					local49 = local65.aByte149;
					local41 = local65.anInt11146;
				}
				local37 = local65.anInt11144;
			}
			this.method8849(local39, arg1, local49, local41, arg0);
			if (this.aClass10_3 == null) {
				this.method8976(local35);
				this.method8853(local37);
			} else {
				this.aClass10_3.method9546(local35, local37);
			}
			this.aBoolean687 = this.aBoolean697;
			this.anInt10481 = arg2;
		}
		this.anInt10492 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([BIZIIBILclient!sca;)Lclient!pt;")
	protected abstract Interface16 method8980(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(7) Class335 arg4);

	@OriginalMember(owner = "client!jca", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt10484;
		arg0[2] = this.anInt10460;
		arg0[0] = this.anInt10469;
		arg0[3] = this.anInt10472;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(BI)V")
	public final void method8981(@OriginalArg(0) byte arg0) {
		this.method8930(arg0 | arg0 << 8 | arg0 << 16 | arg0 << 24);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method8982(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!jca", name = "K", descriptor = "(I)V")
	protected abstract void method8983();
}
