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

@OriginalClass("client!wg")
public abstract class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!wg", name = "lb", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer lb;

	@OriginalMember(owner = "client!wg", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!wg", name = "Vb", descriptor = "Lclient!rfa;")
	protected Class312 aClass312_8;

	@OriginalMember(owner = "client!wg", name = "lc", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7;

	@OriginalMember(owner = "client!wg", name = "Xd", descriptor = "I")
	public int anInt9634;

	@OriginalMember(owner = "client!wg", name = "Zd", descriptor = "I")
	protected int anInt9636;

	@OriginalMember(owner = "client!wg", name = "de", descriptor = "I")
	public int anInt9640;

	@OriginalMember(owner = "client!wg", name = "oe", descriptor = "Z")
	public boolean aBoolean734;

	@OriginalMember(owner = "client!wg", name = "pe", descriptor = "I")
	public int anInt9643;

	@OriginalMember(owner = "client!wg", name = "qe", descriptor = "I")
	private int anInt9644;

	@OriginalMember(owner = "client!wg", name = "Ae", descriptor = "Z")
	public boolean aBoolean738;

	@OriginalMember(owner = "client!wg", name = "Ge", descriptor = "F")
	public float aFloat211;

	@OriginalMember(owner = "client!wg", name = "He", descriptor = "I")
	protected int anInt9651;

	@OriginalMember(owner = "client!wg", name = "Ie", descriptor = "I")
	public int anInt9652;

	@OriginalMember(owner = "client!wg", name = "Re", descriptor = "Lclient!gaa;")
	public Interface14 anInterface14_3;

	@OriginalMember(owner = "client!wg", name = "Se", descriptor = "F")
	public float aFloat213;

	@OriginalMember(owner = "client!wg", name = "Te", descriptor = "I")
	protected int anInt9657;

	@OriginalMember(owner = "client!wg", name = "We", descriptor = "I")
	protected int anInt9659;

	@OriginalMember(owner = "client!wg", name = "Xe", descriptor = "Lclient!dka;")
	private Class68_Sub1 aClass68_Sub1_3;

	@OriginalMember(owner = "client!wg", name = "Ye", descriptor = "I")
	protected int anInt9660;

	@OriginalMember(owner = "client!wg", name = "ef", descriptor = "Z")
	protected boolean aBoolean744;

	@OriginalMember(owner = "client!wg", name = "gf", descriptor = "I")
	public int anInt9664;

	@OriginalMember(owner = "client!wg", name = "mf", descriptor = "Lclient!sc;")
	private Class325 aClass325_3;

	@OriginalMember(owner = "client!wg", name = "nf", descriptor = "F")
	public float aFloat216;

	@OriginalMember(owner = "client!wg", name = "tf", descriptor = "F")
	public float aFloat219;

	@OriginalMember(owner = "client!wg", name = "vf", descriptor = "F")
	private float aFloat220;

	@OriginalMember(owner = "client!wg", name = "zf", descriptor = "I")
	private int anInt9669;

	@OriginalMember(owner = "client!wg", name = "Cf", descriptor = "Z")
	protected boolean aBoolean746;

	@OriginalMember(owner = "client!wg", name = "Df", descriptor = "[Lclient!eia;")
	protected Class92_Sub1[] aClass92_Sub1Array3;

	@OriginalMember(owner = "client!wg", name = "Hf", descriptor = "[Lclient!ei;")
	protected Class91[] aClass91Array5;

	@OriginalMember(owner = "client!wg", name = "If", descriptor = "[Lclient!kp;")
	protected Class4_Sub29[] aClass4_Sub29Array6;

	@OriginalMember(owner = "client!wg", name = "Kf", descriptor = "F")
	public float aFloat221;

	@OriginalMember(owner = "client!wg", name = "Rf", descriptor = "Z")
	public boolean aBoolean750;

	@OriginalMember(owner = "client!wg", name = "Sf", descriptor = "[Lclient!ei;")
	protected Class91[] aClass91Array6;

	@OriginalMember(owner = "client!wg", name = "Tf", descriptor = "Lclient!bda;")
	private Class20 aClass20_3;

	@OriginalMember(owner = "client!wg", name = "Uf", descriptor = "[Lclient!si;")
	protected Class331[] aClass331Array3;

	@OriginalMember(owner = "client!wg", name = "Xf", descriptor = "[Lclient!gaa;")
	private Interface14[] anInterface14Array3;

	@OriginalMember(owner = "client!wg", name = "eg", descriptor = "F")
	public float aFloat223;

	@OriginalMember(owner = "client!wg", name = "jg", descriptor = "F")
	private float aFloat226;

	@OriginalMember(owner = "client!wg", name = "kg", descriptor = "I")
	public int anInt9680;

	@OriginalMember(owner = "client!wg", name = "lg", descriptor = "Lclient!sk;")
	public Class62_Sub3 aClass62_Sub3_21;

	@OriginalMember(owner = "client!wg", name = "mg", descriptor = "Lclient!nca;")
	public Class247 aClass247_17;

	@OriginalMember(owner = "client!wg", name = "ng", descriptor = "Lclient!sk;")
	public Class62_Sub3 aClass62_Sub3_22;

	@OriginalMember(owner = "client!wg", name = "og", descriptor = "Lclient!nca;")
	private Class247 aClass247_18;

	@OriginalMember(owner = "client!wg", name = "pg", descriptor = "Lclient!nca;")
	private Class247 aClass247_19;

	@OriginalMember(owner = "client!wg", name = "qg", descriptor = "Lclient!nca;")
	public Class247 aClass247_20;

	@OriginalMember(owner = "client!wg", name = "rg", descriptor = "Lclient!sk;")
	public Class62_Sub3 aClass62_Sub3_23;

	@OriginalMember(owner = "client!wg", name = "sg", descriptor = "Lclient!sk;")
	public Class62_Sub3 aClass62_Sub3_24;

	@OriginalMember(owner = "client!wg", name = "tg", descriptor = "Lclient!oda;")
	private Interface19 anInterface19_16;

	@OriginalMember(owner = "client!wg", name = "vg", descriptor = "Lclient!sk;")
	public Class62_Sub3 aClass62_Sub3_25;

	@OriginalMember(owner = "client!wg", name = "wg", descriptor = "Lclient!nca;")
	public Class247 aClass247_21;

	@OriginalMember(owner = "client!wg", name = "xg", descriptor = "Lclient!oda;")
	private Interface19 anInterface19_17;

	@OriginalMember(owner = "client!wg", name = "yg", descriptor = "Lclient!nca;")
	private Class247 aClass247_22;

	@OriginalMember(owner = "client!wg", name = "zg", descriptor = "Lclient!sk;")
	public Class62_Sub3 aClass62_Sub3_26;

	@OriginalMember(owner = "client!wg", name = "Ag", descriptor = "Lclient!sk;")
	public Class62_Sub3 aClass62_Sub3_27;

	@OriginalMember(owner = "client!wg", name = "Bg", descriptor = "Lclient!oda;")
	private Interface19 anInterface19_18;

	@OriginalMember(owner = "client!wg", name = "Cg", descriptor = "Lclient!nca;")
	public Class247 aClass247_23;

	@OriginalMember(owner = "client!wg", name = "Dg", descriptor = "Lclient!sk;")
	public Class62_Sub3 aClass62_Sub3_28;

	@OriginalMember(owner = "client!wg", name = "Eg", descriptor = "Lclient!je;")
	private Interface16 anInterface16_8;

	@OriginalMember(owner = "client!wg", name = "Fg", descriptor = "Lclient!sk;")
	public Class62_Sub3 aClass62_Sub3_29;

	@OriginalMember(owner = "client!wg", name = "Gg", descriptor = "Lclient!sk;")
	public Class62_Sub3 aClass62_Sub3_30;

	@OriginalMember(owner = "client!wg", name = "Hg", descriptor = "I")
	private int anInt9681;

	@OriginalMember(owner = "client!wg", name = "Ig", descriptor = "Z")
	protected boolean aBoolean754;

	@OriginalMember(owner = "client!wg", name = "xd", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_66 = new Class163();

	@OriginalMember(owner = "client!wg", name = "ee", descriptor = "Z")
	protected boolean aBoolean733 = true;

	@OriginalMember(owner = "client!wg", name = "fe", descriptor = "Lclient!eia;")
	protected final Class92_Sub1 aClass92_Sub1_15 = new Class92_Sub1();

	@OriginalMember(owner = "client!wg", name = "ie", descriptor = "Lclient!eia;")
	public Class92_Sub1 aClass92_Sub1_16 = new Class92_Sub1();

	@OriginalMember(owner = "client!wg", name = "je", descriptor = "Lclient!eia;")
	public final Class92_Sub1 aClass92_Sub1_17 = new Class92_Sub1();

	@OriginalMember(owner = "client!wg", name = "ke", descriptor = "Lclient!eia;")
	protected final Class92_Sub1 aClass92_Sub1_18 = new Class92_Sub1();

	@OriginalMember(owner = "client!wg", name = "le", descriptor = "Lclient!eia;")
	private final Class92_Sub1 aClass92_Sub1_19 = new Class92_Sub1();

	@OriginalMember(owner = "client!wg", name = "me", descriptor = "Lclient!eia;")
	private final Class92_Sub1 aClass92_Sub1_20 = new Class92_Sub1();

	@OriginalMember(owner = "client!wg", name = "Oe", descriptor = "I")
	protected int anInt9655 = 0;

	@OriginalMember(owner = "client!wg", name = "te", descriptor = "[F")
	public final float[] aFloatArray66 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!wg", name = "Le", descriptor = "I")
	protected final int anInt9653 = 0;

	@OriginalMember(owner = "client!wg", name = "Ke", descriptor = "Lclient!gp;")
	protected Class137 aClass137_6 = Static618.aClass137_7;

	@OriginalMember(owner = "client!wg", name = "Pe", descriptor = "F")
	public float aFloat212 = 1.0F;

	@OriginalMember(owner = "client!wg", name = "Be", descriptor = "F")
	public float aFloat210 = -1.0F;

	@OriginalMember(owner = "client!wg", name = "Ze", descriptor = "Z")
	private boolean aBoolean743 = false;

	@OriginalMember(owner = "client!wg", name = "ye", descriptor = "Z")
	protected boolean aBoolean736 = false;

	@OriginalMember(owner = "client!wg", name = "ve", descriptor = "I")
	private int anInt9648 = 16777215;

	@OriginalMember(owner = "client!wg", name = "we", descriptor = "Z")
	protected boolean aBoolean735 = true;

	@OriginalMember(owner = "client!wg", name = "Ee", descriptor = "I")
	private int anInt9649 = 1;

	@OriginalMember(owner = "client!wg", name = "lf", descriptor = "F")
	public float aFloat215 = 1.0F;

	@OriginalMember(owner = "client!wg", name = "hf", descriptor = "F")
	private float aFloat214 = 1.0F;

	@OriginalMember(owner = "client!wg", name = "Ne", descriptor = "I")
	public int anInt9654 = 8;

	@OriginalMember(owner = "client!wg", name = "ff", descriptor = "I")
	public int anInt9663 = 512;

	@OriginalMember(owner = "client!wg", name = "re", descriptor = "I")
	public int anInt9645 = -1;

	@OriginalMember(owner = "client!wg", name = "Ce", descriptor = "Z")
	private boolean aBoolean739 = false;

	@OriginalMember(owner = "client!wg", name = "of", descriptor = "Z")
	private boolean aBoolean745 = false;

	@OriginalMember(owner = "client!wg", name = "wf", descriptor = "I")
	private int anInt9667 = 0;

	@OriginalMember(owner = "client!wg", name = "xf", descriptor = "[Lclient!bda;")
	private final Class20[] aClass20Array3 = new Class20[10];

	@OriginalMember(owner = "client!wg", name = "bf", descriptor = "I")
	public int bf = 3;

	@OriginalMember(owner = "client!wg", name = "ne", descriptor = "I")
	protected int anInt9642 = 3584;

	@OriginalMember(owner = "client!wg", name = "se", descriptor = "I")
	protected int anInt9646 = 0;

	@OriginalMember(owner = "client!wg", name = "ue", descriptor = "I")
	public int anInt9647 = 0;

	@OriginalMember(owner = "client!wg", name = "Gf", descriptor = "I")
	private int anInt9671 = -1;

	@OriginalMember(owner = "client!wg", name = "Ff", descriptor = "I")
	protected int anInt9670 = 0;

	@OriginalMember(owner = "client!wg", name = "Ef", descriptor = "[F")
	private final float[] aFloatArray74 = new float[16];

	@OriginalMember(owner = "client!wg", name = "jf", descriptor = "[F")
	private final float[] aFloatArray70 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!wg", name = "ze", descriptor = "Z")
	protected boolean aBoolean737 = false;

	@OriginalMember(owner = "client!wg", name = "sf", descriptor = "[F")
	public final float[] aFloatArray71 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wg", name = "Mf", descriptor = "Z")
	protected boolean aBoolean747 = false;

	@OriginalMember(owner = "client!wg", name = "Vf", descriptor = "Z")
	private boolean aBoolean751 = false;

	@OriginalMember(owner = "client!wg", name = "Pf", descriptor = "Z")
	protected boolean aBoolean749 = true;

	@OriginalMember(owner = "client!wg", name = "cf", descriptor = "[F")
	protected float[] aFloatArray69 = this.aFloatArray70;

	@OriginalMember(owner = "client!wg", name = "Qf", descriptor = "I")
	public int anInt9674 = -1;

	@OriginalMember(owner = "client!wg", name = "uf", descriptor = "[F")
	private final float[] aFloatArray72 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wg", name = "yf", descriptor = "I")
	private int anInt9668 = 0;

	@OriginalMember(owner = "client!wg", name = "Wf", descriptor = "I")
	private int anInt9675 = -1;

	@OriginalMember(owner = "client!wg", name = "pf", descriptor = "F")
	public float aFloat217 = -1.0F;

	@OriginalMember(owner = "client!wg", name = "Zf", descriptor = "Z")
	protected boolean aBoolean752 = true;

	@OriginalMember(owner = "client!wg", name = "De", descriptor = "[F")
	private final float[] aFloatArray68 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wg", name = "ag", descriptor = "I")
	public int anInt9676 = 0;

	@OriginalMember(owner = "client!wg", name = "rf", descriptor = "I")
	public int anInt9666 = 0;

	@OriginalMember(owner = "client!wg", name = "Ve", descriptor = "I")
	protected int anInt9658 = 0;

	@OriginalMember(owner = "client!wg", name = "Jf", descriptor = "I")
	public int anInt9672 = 128;

	@OriginalMember(owner = "client!wg", name = "Me", descriptor = "Z")
	private boolean aBoolean741 = false;

	@OriginalMember(owner = "client!wg", name = "bg", descriptor = "I")
	private int anInt9677 = 0;

	@OriginalMember(owner = "client!wg", name = "fg", descriptor = "I")
	public int anInt9679 = 50;

	@OriginalMember(owner = "client!wg", name = "Je", descriptor = "Z")
	protected boolean aBoolean740 = false;

	@OriginalMember(owner = "client!wg", name = "df", descriptor = "I")
	private int anInt9662 = -1;

	@OriginalMember(owner = "client!wg", name = "cg", descriptor = "I")
	private int anInt9678 = 0;

	@OriginalMember(owner = "client!wg", name = "Af", descriptor = "[F")
	private final float[] aFloatArray73 = new float[16];

	@OriginalMember(owner = "client!wg", name = "Bf", descriptor = "Lclient!sv;")
	protected Class340 aClass340_7 = Static527.aClass340_5;

	@OriginalMember(owner = "client!wg", name = "Yf", descriptor = "F")
	public float aFloat222 = 3584.0F;

	@OriginalMember(owner = "client!wg", name = "gg", descriptor = "F")
	public float aFloat224 = 1.0F;

	@OriginalMember(owner = "client!wg", name = "qf", descriptor = "F")
	public float aFloat218 = 1.0F;

	@OriginalMember(owner = "client!wg", name = "Ue", descriptor = "Z")
	private boolean aBoolean742 = false;

	@OriginalMember(owner = "client!wg", name = "kf", descriptor = "I")
	public int anInt9665 = 512;

	@OriginalMember(owner = "client!wg", name = "Nf", descriptor = "I")
	protected final int anInt9673 = 0;

	@OriginalMember(owner = "client!wg", name = "af", descriptor = "I")
	protected int anInt9661 = 0;

	@OriginalMember(owner = "client!wg", name = "Of", descriptor = "Z")
	protected boolean aBoolean748 = true;

	@OriginalMember(owner = "client!wg", name = "ig", descriptor = "Z")
	protected boolean aBoolean753 = true;

	@OriginalMember(owner = "client!wg", name = "hg", descriptor = "F")
	public float aFloat225 = 3584.0F;

	@OriginalMember(owner = "client!wg", name = "xe", descriptor = "[F")
	private final float[] aFloatArray67 = new float[16];

	@OriginalMember(owner = "client!wg", name = "dg", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream6 = new Stream();

	@OriginalMember(owner = "client!wg", name = "ug", descriptor = "Lclient!eia;")
	private final Class92_Sub1 aClass92_Sub1_21 = new Class92_Sub1();

	@OriginalMember(owner = "client!wg", name = "Nd", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas12;

	@OriginalMember(owner = "client!wg", name = "Fb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!wg", name = "Fc", descriptor = "Lclient!bt;")
	protected final Class34 aClass34_123;

	@OriginalMember(owner = "client!wg", name = "G", descriptor = "Ljava/lang/Object;")
	protected final Object anObject19;

	@OriginalMember(owner = "client!wg", name = "zc", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!wg", name = "Qe", descriptor = "I")
	protected final int anInt9656;

	@OriginalMember(owner = "client!wg", name = "Pc", descriptor = "I")
	private int anInt9576;

	@OriginalMember(owner = "client!wg", name = "Mb", descriptor = "I")
	public int anInt9526;

	@OriginalMember(owner = "client!wg", name = "Fe", descriptor = "I")
	public final int anInt9650;

	@OriginalMember(owner = "client!wg", name = "Vc", descriptor = "I")
	private int anInt9582;

	@OriginalMember(owner = "client!wg", name = "Mc", descriptor = "I")
	public int anInt9573;

	@OriginalMember(owner = "client!wg", name = "Lf", descriptor = "Lclient!hg;")
	private final Class147 aClass147_3;

	@OriginalMember(owner = "client!wg", name = "Kb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!bt;II)V")
	protected Class33_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface9 arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.aCanvas11 = this.aCanvas12 = arg0;
			this.aClass34_123 = arg3;
			this.anObject20 = this.anObject19 = arg1;
			this.anInt9656 = arg4;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt9526 = this.anInt9576 = local307.height;
			this.anInt9650 = arg5;
			this.anInt9573 = this.anInt9582 = local307.width;
			Static650.method8679(false, true);
			if (super.anInterface9_12 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt9650);
				this.aClass147_3 = null;
			} else {
				this.aClass147_3 = new Class147(this, super.anInterface9_12);
				this.aNativeInterface3 = new NativeInterface(super.anInterface9_12.method1554(), this.anInt9650);
				for (@Pc(352) int local352 = 0; super.anInterface9_12.method1554() > local352; local352++) {
					@Pc(360) Class130 local360 = super.anInterface9_12.method1558(local352);
					if (local360 != null) {
						this.aNativeInterface3.initTextureMetrics(local352, local360.aByte40, local360.aByte38);
					}
				}
			}
		} catch (@Pc(395) Throwable local395) {
			local395.printStackTrace();
			this.method8070();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wg", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8096(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)Lclient!oda;")
	public abstract Interface19 method8157(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V")
	private void method8158() {
		this.method8255();
		if (this.aClass20_3 != null) {
			this.aClass20_3.method7964();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!gaa;)V")
	public final void method8159(@OriginalArg(1) Interface14 arg0) {
		if (arg0 == this.anInterface14Array3[this.anInt9658]) {
			return;
		}
		this.anInterface14Array3[this.anInt9658] = arg0;
		if (arg0 == null) {
			this.method8202();
		} else {
			arg0.method8613();
		}
		this.anInt9644 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!wg", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat212 != arg0) {
			this.aFloat212 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method8200();
			this.method8227();
		}
	}

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt9636 + this.anInt9640 + this.anInt9634;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ)Lclient!tf;")
	@Override
	public final Class17 method8145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class17_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(B)V")
	private void method8160() {
		this.aBoolean743 = false;
		if (this.aClass20_3 != null) {
			this.aClass20_3.method7959();
		}
		this.method8210();
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	public final void method8161() {
		if (this.anInt9644 == 2) {
			return;
		}
		this.method8234();
		this.method8197(false);
		this.method8213(false);
		this.method8205(false);
		this.method8194(false);
		this.method8272(false, -2, false);
		this.anInt9644 = 2;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(Z)V")
	private void method8162() {
		this.aBoolean739 = false;
		this.method8184();
		if (Static424.aClass340_4 == this.aClass340_7) {
			this.method8158();
		}
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "(II)Lclient!bda;")
	protected Class20 method8163(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class20_Sub4(this);
		} else if (arg0 == 1) {
			return new Class20_Sub1(this);
		} else if (arg0 == 2) {
			return new Class20_Sub3(this, this.aClass312_8);
		} else if (arg0 == 7) {
			return new Class20_Sub5(this);
		} else {
			return new Class20_Sub11(this);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(FI)V")
	public final void method8164(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat214) {
			this.aFloat214 = arg0;
			this.method8162();
		}
	}

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8096(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!dw;Lclient!pe;I)Z")
	public abstract boolean method8165(@OriginalArg(0) Class79 arg0, @OriginalArg(1) Class276 arg1);

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "(I)V")
	public final void method8166() {
		if (this.anInt9644 == 4) {
			return;
		}
		this.method8234();
		this.method8197(false);
		this.method8213(false);
		this.method8205(false);
		this.method8194(false);
		this.method8272(false, -2, false);
		this.method8250(1);
		this.method8167(0);
		this.anInt9644 = 4;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)V")
	public final void method8167(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method8280(Static489.aClass91_4, Static489.aClass91_4);
		} else if (arg0 == 0) {
			this.method8280(Static435.aClass91_3, Static435.aClass91_3);
		} else if (arg0 == 2) {
			this.method8280(Static489.aClass91_4, Static586.aClass91_5);
		} else if (arg0 == 3) {
			this.method8280(Static435.aClass91_3, Static228.aClass91_2);
		} else if (arg0 == 4) {
			this.method8280(Static214.aClass91_1, Static214.aClass91_1);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method8168(@OriginalArg(1) Buffer arg0) {
		this.aStream6.a(arg0);
		return this.aStream6;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method8083(@OriginalArg(0) Class4_Sub13 arg0) {
		this.aNativeHeap5 = ((Class4_Sub13_Sub2) arg0).aNativeHeap6;
		this.lb = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8110(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas12 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.method8254(arg0, this.aHashtable7.get(arg0));
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "()Z")
	@Override
	public final boolean method8114() {
		return this.aBoolean744;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!dw;ILclient!pe;BI)Lclient!ada;")
	public abstract Interface1 method8169(@OriginalArg(0) Class79 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class276 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "(I)V")
	private void method8170() {
		this.aBoolean745 = false;
		this.method8278();
		if (Static54.aClass340_1 == this.aClass340_7) {
			this.method8158();
		}
	}

	@OriginalMember(owner = "client!wg", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt9642;
	}

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "()Z")
	@Override
	public final boolean method8152() {
		return true;
	}

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "(I)V")
	protected abstract void method8171();

	@OriginalMember(owner = "client!wg", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean734 = false;
	}

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "()V")
	@Override
	public final void method8154() {
		if (this.aClass147_3 != null) {
			this.aClass147_3.method3248();
		}
	}

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "(I)Lclient!eia;")
	public final Class92_Sub1 method8172() {
		return this.aClass92_Sub1_15;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZLclient!mga;)V")
	protected abstract void method8173(@OriginalArg(1) int arg0, @OriginalArg(3) Class230 arg1);

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt9670;
		arg0[0] = this.anInt9655;
		arg0[1] = this.anInt9646;
		arg0[3] = this.anInt9661;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ[BLclient!pe;I)Lclient!ada;")
	public final Interface1 method8174(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class276 arg3, @OriginalArg(5) int arg4) {
		return this.method8209(arg2, arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(II)I")
	@Override
	public final int method8124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!oda;I)V")
	public abstract void method8175(@OriginalArg(1) Interface19 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(B)V")
	protected abstract void method8176();

	@OriginalMember(owner = "client!wg", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass92_Sub1_16.method2295((float) arg2, (float) arg1, (float) arg0);
		if (local14 < (float) this.anInt9679 || (float) this.anInt9642 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt9663 * this.aClass92_Sub1_16.method2299((float) arg1, (float) arg0, (float) arg2) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt9665 * this.aClass92_Sub1_16.method2298((float) arg0, (float) arg1, (float) arg2) / (float) arg3);
		arg4[0] = (int) ((float) local58 - this.aFloat211);
		arg4[2] = (int) local14;
		arg4[1] = (int) ((float) local77 - this.aFloat223);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()Z")
	@Override
	public final boolean method8071() {
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(B)I")
	public final int method8177() {
		return this.anInt9675;
	}

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "(I)I")
	public final int method8178() {
		return this.anInt9658;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLclient!nca;)V")
	public abstract void method8179(@OriginalArg(1) Class247 arg0);

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "(I)V")
	private void method8180() {
		this.aBoolean751 = false;
		if (Static570.aClass340_6 == this.aClass340_7) {
			this.method8276();
			this.method8158();
		}
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
	@Override
	public final void method8121() {
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!so;IIII)Lclient!ka;")
	@Override
	public final Class62 method8072(@OriginalArg(0) Class334 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class62_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(IIIIII)Lclient!jia;")
	@Override
	public final Class68 method8112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class68_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(Z)V")
	private void method8181() {
		this.method8200();
		this.method8277();
		this.method8262();
		this.method8275();
		this.method8263();
		this.method8227();
		this.method8241();
		this.method8176();
		this.method8289();
		this.method8211();
		this.method8206();
		this.method8223();
		this.method8214();
		this.method8203();
		for (@Pc(52) int local52 = this.anInt9664 - 1; local52 >= 0; local52--) {
			this.method8235(local52);
			this.method8171();
			this.method8285();
			this.method8201();
		}
		this.method8217();
		this.method8245();
		this.method8255();
		this.method8207();
		this.method8210();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!mga;ZBZI)V")
	public abstract void method8182(@OriginalArg(0) Class230 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "(B)V")
	protected abstract void method8183();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method8125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "(B)V")
	private void method8184() {
		if (this.aBoolean739) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray74;
		@Pc(17) float local17 = (float) this.anInt9679;
		@Pc(21) float local21 = (float) this.anInt9642;
		@Pc(33) float local33 = this.aFloat214 * (float) -this.anInt9676 / (float) this.anInt9665;
		@Pc(45) float local45 = (float) -this.anInt9666 * this.aFloat214 / (float) this.anInt9663;
		@Pc(60) float local60 = this.aFloat214 * (float) (this.anInt9573 - this.anInt9666) / (float) this.anInt9663;
		@Pc(75) float local75 = this.aFloat214 * (float) (this.anInt9526 - this.anInt9676) / (float) this.anInt9665;
		if (local60 == local45 || local75 == local33) {
			local13[8] = 0.0F;
			local13[5] = 1.0F;
			local13[1] = 0.0F;
			local13[4] = 0.0F;
			local13[14] = 0.0F;
			local13[2] = 0.0F;
			local13[9] = 0.0F;
			local13[13] = 0.0F;
			local13[15] = 1.0F;
			local13[11] = 0.0F;
			local13[6] = 0.0F;
			local13[3] = 0.0F;
			local13[12] = 0.0F;
			local13[10] = 1.0F;
			local13[0] = 1.0F;
			local13[7] = 0.0F;
		} else {
			local13[4] = 0.0F;
			local13[13] = (local33 + local75) / (local75 - local33);
			local13[14] = local17 / (local17 - local21);
			local13[15] = 1.0F;
			local13[12] = (local60 + local45) / (-local60 + local45);
			local13[9] = 0.0F;
			local13[10] = 1.0F / (local17 - local21);
			local13[5] = 2.0F / (local75 - local33);
			local13[11] = 0.0F;
			local13[6] = 0.0F;
			local13[3] = 0.0F;
			local13[0] = 2.0F / (local60 - local45);
			local13[8] = 0.0F;
			local13[7] = 0.0F;
			local13[1] = 0.0F;
			local13[2] = 0.0F;
		}
		this.method8228();
		this.aBoolean739 = true;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)Lclient!za;")
	@Override
	public final Class4_Sub13 method8088(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub13_Sub2 local8 = new Class4_Sub13_Sub2(arg0);
		this.aClass163_66.method3646(local8);
		return local8;
	}

	@OriginalMember(owner = "client!wg", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean734) {
			throw new RuntimeException("");
		}
		this.anInt9669 = arg0;
		this.anInt9667 = arg3;
		this.anInt9675 = arg2;
		this.anInt9662 = arg1;
		if (this.aBoolean742) {
			this.aClass20Array3[3].method7966();
			this.aClass20Array3[3].method7956();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)V")
	public final void method8185(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean740) {
			this.aBoolean740 = arg0;
			this.method8262();
		}
	}

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg1 * this.aClass92_Sub1_16.aFloat41 + this.aClass92_Sub1_16.aFloat48 * (float) arg0 + (float) arg2 * this.aClass92_Sub1_16.aFloat46 + this.aClass92_Sub1_16.aFloat44;
		@Pc(57) float local57 = this.aClass92_Sub1_16.aFloat44 + (float) arg3 * this.aClass92_Sub1_16.aFloat48 + (float) arg4 * this.aClass92_Sub1_16.aFloat41 + (float) arg5 * this.aClass92_Sub1_16.aFloat46;
		if ((float) this.anInt9679 > local32 && local57 < (float) this.anInt9679) {
			local7 |= 0x10;
		} else if ((float) this.anInt9642 < local32 && (float) this.anInt9642 < local57) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass92_Sub1_16.aFloat45 * (float) arg2 + this.aClass92_Sub1_16.aFloat51 * (float) arg1 + this.aClass92_Sub1_16.aFloat49 * (float) arg0 + this.aClass92_Sub1_16.aFloat50) * (float) this.anInt9663 / (float) arg6);
		@Pc(157) int local157 = (int) ((this.aClass92_Sub1_16.aFloat50 + (float) arg5 * this.aClass92_Sub1_16.aFloat45 + this.aClass92_Sub1_16.aFloat49 * (float) arg3 + (float) arg4 * this.aClass92_Sub1_16.aFloat51) * (float) this.anInt9663 / (float) arg6);
		if (this.aFloat211 > (float) local124 && this.aFloat211 > (float) local157) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat219 && this.aFloat219 < (float) local157) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) (((float) arg0 * this.aClass92_Sub1_16.aFloat47 + this.aClass92_Sub1_16.aFloat40 * (float) arg1 + this.aClass92_Sub1_16.aFloat43 * (float) arg2 + this.aClass92_Sub1_16.aFloat42) * (float) this.anInt9665 / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass92_Sub1_16.aFloat42 + this.aClass92_Sub1_16.aFloat43 * (float) arg5 + this.aClass92_Sub1_16.aFloat40 * (float) arg4 + this.aClass92_Sub1_16.aFloat47 * (float) arg3) * (float) this.anInt9665 / (float) arg6);
		if (this.aFloat223 > (float) local224 && this.aFloat223 > (float) local257) {
			local7 |= 0x4;
		} else if (this.aFloat221 < (float) local224 && (float) local257 > this.aFloat221) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wg", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.bf = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.bf++;
		}
		this.anInt9654 = 0x1 << this.bf;
	}

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "(B)I")
	public final int method8186() {
		return this.anInt9667;
	}

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "()Z")
	@Override
	public final boolean method8135() {
		return true;
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "(IIIIII)V")
	@Override
	public final void method8142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method8199();
		this.method8225();
		this.method8208(arg4);
		this.method8239(0, Static228.aClass230_2);
		this.method8258(Static228.aClass230_2, 0);
		this.method8250(arg5);
		this.aClass92_Sub1_15.method2302((float) (arg3 - 1), 1.0F, (float) (arg2 - 1));
		this.aClass92_Sub1_15.method2311((float) arg1 - local7, 0.0F, (float) arg0 - local7);
		this.method8232();
		this.method8283(false);
		this.method8238(4, Static230.aClass194_4);
		this.method8283(true);
		this.method8258(Static41.aClass230_1, 0);
		this.method8239(0, Static41.aClass230_1);
	}

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "(I)Lclient!eia;")
	public final Class92_Sub1 method8187() {
		return this.aClass92_Sub1_19;
	}

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "(B)V")
	public final void method8188() {
		if (this.anInt9644 == 16) {
			return;
		}
		this.method8284();
		this.method8197(true);
		this.method8205(true);
		this.method8194(true);
		this.method8250(1);
		this.anInt9644 = 16;
	}

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "(I)V")
	protected abstract void method8189();

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "(B)V")
	public final void method8190() {
		this.method8240();
		this.method8158();
	}

	@OriginalMember(owner = "client!wg", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt9648 != arg0;
		if (local11 || this.aFloat217 != arg1 || arg2 != this.aFloat210) {
			this.anInt9648 = arg0;
			this.aFloat210 = arg2;
			this.aFloat217 = arg1;
			if (local11) {
				this.aFloat218 = (float) (this.anInt9648 & 0xFF) / 255.0F;
				this.aFloat215 = (float) (this.anInt9648 & 0xFF0000) / 1.671168E7F;
				this.aFloat224 = (float) (this.anInt9648 & 0xFF00) / 65280.0F;
				this.method8200();
			}
			this.aNativeInterface3.setSunColour(this.aFloat215, this.aFloat224, this.aFloat218, arg1, arg2);
			this.method8277();
		}
		if (arg3 != this.aFloatArray72[0] || arg4 != this.aFloatArray72[1] || this.aFloatArray72[2] != arg5) {
			this.aFloatArray72[0] = arg3;
			this.aFloatArray72[2] = arg5;
			this.aFloatArray72[1] = arg4;
			this.aFloatArray68[2] = -arg5;
			this.aFloatArray68[0] = -arg3;
			this.aFloatArray68[1] = -arg4;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray71[1] = arg4 * local149;
			this.aFloatArray71[2] = local149 * arg5;
			this.aFloatArray71[0] = local149 * arg3;
			this.aFloatArray66[2] = -this.aFloatArray71[2];
			this.aFloatArray66[1] = -this.aFloatArray71[1];
			this.aFloatArray66[0] = -this.aFloatArray71[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray71[0], this.aFloatArray71[1], this.aFloatArray71[2]);
			this.method8263();
			this.anInt9680 = (int) (arg5 * 256.0F / arg4);
			this.anInt9652 = (int) (arg3 * 256.0F / arg4);
		}
		this.method8227();
	}

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "(B)V")
	private void method8191() {
		this.method8261();
		if (this.aClass20_3 != null) {
			this.aClass20_3.method7962();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZB)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method8192(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap5.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!bq;[Lclient!cr;Z)Lclient!da;")
	@Override
	public final Class56 method8081(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class51[] arg1) {
		return new Class56_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class42 method8068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class42_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method8123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	protected abstract void method8193(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(IZ)V")
	public final void method8194(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean736) {
			this.aBoolean736 = arg0;
			this.method8289();
			this.anInt9644 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "(I)V")
	private void method8195() {
		this.aFloatArray73[14] = this.aFloat226;
		this.aFloatArray73[10] = this.aFloat220;
		this.aFloat222 = ((float) -this.anInt9642 + this.aFloatArray73[14]) / this.aFloatArray73[10];
	}

	@OriginalMember(owner = "client!wg", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt9670 = this.anInt9573;
		this.anInt9646 = 0;
		this.anInt9655 = 0;
		this.anInt9661 = this.anInt9526;
		if (this.aBoolean754) {
			this.aBoolean754 = false;
			this.method8183();
		}
		this.method8290();
	}

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "(B)I")
	public final int method8196() {
		return this.anInt9669;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method8116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) float local12 = (float) -arg0 + (float) arg2;
		@Pc(18) float local18 = (float) arg3 - (float) arg1;
		@Pc(43) float local43;
		if (local12 == 0.0F && local18 == 0.0F) {
			local12 = 1.0F;
		} else {
			local43 = (float) (1.0D / Math.sqrt((double) (local12 * local12 + local18 * local18)));
			local18 *= local43;
			local12 *= local43;
		}
		this.method8225();
		this.method8208(arg4);
		this.method8239(0, Static228.aClass230_2);
		this.method8258(Static228.aClass230_2, 0);
		this.method8250(1);
		this.method8266();
		this.method8283(false);
		@Pc(85) int local85 = arg7 % (arg5 + arg6);
		local43 = (float) arg5 * local12;
		@Pc(95) float local95 = (float) arg5 * local18;
		@Pc(97) float local97 = 0.0F;
		@Pc(99) float local99 = 0.0F;
		@Pc(101) float local101 = local43;
		@Pc(103) float local103 = local95;
		if (arg5 >= local85) {
			local101 = local12 * (float) (arg5 - local85);
			local103 = (float) (arg5 - local85) * local18;
		} else {
			local97 = (float) (arg5 + arg6 - local85) * local12;
			local99 = local18 * (float) (arg5 + arg6 - local85);
		}
		@Pc(150) float local150 = local97 + (float) arg0;
		@Pc(155) float local155 = local99 + (float) arg1;
		@Pc(160) float local160 = (float) arg6 * local12;
		@Pc(165) float local165 = local18 * (float) arg6;
		while (true) {
			if (arg2 > arg0) {
				if (local150 > (float) arg2) {
					break;
				}
				if ((float) arg2 < local150 + local101) {
					local101 = (float) arg2 - local150;
				}
			} else {
				if ((float) arg2 > local150) {
					break;
				}
				if (local150 + local101 < (float) arg2) {
					local101 = (float) arg2 - local150;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 > local155) {
					break;
				}
				if ((float) arg3 > local155 + local103) {
					local103 = (float) arg3 - local155;
				}
			} else {
				if ((float) arg3 < local155) {
					break;
				}
				if (local155 + local103 > (float) arg3) {
					local103 = (float) arg3 - local155;
				}
			}
			if (!this.method8229(local150, 0.0F, local103 + local155, local155, 0.0F, local150 + local101)) {
				return;
			}
			local155 += local103 + local165;
			local150 += local101 + local160;
			this.method8268();
			local103 = local95;
			local101 = local43;
		}
		this.method8283(true);
		this.method8258(Static41.aClass230_1, 0);
		this.method8239(0, Static41.aClass230_1);
	}

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9674 == arg0 && this.anInt9645 == arg1 && this.anInt9647 == arg2) {
			return;
		}
		this.anInt9645 = arg1;
		this.anInt9674 = arg0;
		this.anInt9647 = arg2;
		this.method8226();
		this.method8211();
	}

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "()Z")
	@Override
	public final boolean method8104() {
		return true;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!cr;Z)Lclient!tf;")
	@Override
	public final Class17 method8147(@OriginalArg(0) Class51 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(24) Class17 local24;
		if (arg0.anInt1661 == 0 || arg0.anInt1657 == 0) {
			local24 = this.method8128(new int[1], 1, 1, 1);
		} else {
			@Pc(33) int[] local33 = new int[arg0.anInt1657 * arg0.anInt1661];
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			@Pc(42) int local42;
			@Pc(46) int local46;
			if (arg0.aByteArray22 == null) {
				for (local42 = 0; local42 < arg0.anInt1657; local42++) {
					for (local46 = 0; local46 < arg0.anInt1661; local46++) {
						@Pc(59) int local59 = arg0.anIntArray107[arg0.aByteArray23[local35++] & 0xFF];
						local33[local37++] = local59 == 0 ? 0 : local59 | 0xFF000000;
					}
				}
			} else {
				for (local42 = 0; local42 < arg0.anInt1657; local42++) {
					for (local46 = 0; local46 < arg0.anInt1661; local46++) {
						local33[local37++] = arg0.anIntArray107[arg0.aByteArray23[local35] & 0xFF] | arg0.aByteArray22[local35] << 24;
						local35++;
					}
				}
			}
			local24 = this.method8128(local33, arg0.anInt1657, arg0.anInt1661, arg0.anInt1661);
		}
		local24.method5250(arg0.anInt1659, arg0.anInt1662, arg0.anInt1660, arg0.anInt1658);
		return local24;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BZ)V")
	public final void method8197(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean746) {
			this.aBoolean746 = arg0;
			this.method8211();
			this.anInt9644 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "(B)V")
	private void method8198() {
		if (Static54.aClass340_1 == this.aClass340_7) {
			return;
		}
		@Pc(6) Class340 local6 = this.aClass340_7;
		this.aClass340_7 = Static54.aClass340_1;
		if (!local6.method7445()) {
			this.method8160();
		}
		this.method8278();
		this.aFloatArray69 = this.aFloatArray73;
		this.method8158();
		this.anInt9644 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt9679;
	}

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "(B)F")
	protected abstract float method8199();

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "(I)V")
	protected abstract void method8200();

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "(I)V")
	public final void method8201() {
		if (Static426.aClass331_4 != this.aClass331Array3[this.anInt9658]) {
			this.aClass331Array3[this.anInt9658] = Static426.aClass331_4;
			this.aClass92_Sub1Array3[this.anInt9658].method3853();
			this.method8191();
		}
	}

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "(I)V")
	protected abstract void method8202();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIF)Lclient!kp;")
	@Override
	public final Class4_Sub29 method8075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub29_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "(I)V")
	protected abstract void method8203();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLclient!kja;II)V")
	public abstract void method8204(@OriginalArg(1) Class194 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(IZ)V")
	public final void method8205(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean747 != arg0) {
			this.aBoolean747 = arg0;
			this.method8176();
			this.anInt9644 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "(I)V")
	protected abstract void method8206();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[Lclient!kp;)V")
	@Override
	public final void method8090(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub29[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass4_Sub29Array6[local7] = arg1[local7];
		}
		this.anInt9659 = arg0;
		if (this.aClass340_7.method7445()) {
			this.method8275();
		}
	}

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "(I)V")
	protected abstract void method8207();

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "(II)V")
	public final void method8208(@OriginalArg(0) int arg0) {
		if (this.anInt9657 != arg0) {
			this.anInt9657 = arg0;
			this.method8217();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[BIIZLclient!pe;II)Lclient!ada;")
	protected abstract Interface1 method8209(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) Class276 arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "(B)V")
	protected abstract void method8210();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!af;)V")
	@Override
	public final void method8085(@OriginalArg(0) Class9 arg0) {
		this.aClass325_3.method7216(arg0, -1, this);
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "()Lclient!nh;")
	@Override
	public final Class92 method8078() {
		return this.aClass92_Sub1_21;
	}

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "(B)V")
	protected abstract void method8211();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method8150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static639.method8545(arg0, arg3, arg2, arg1, this);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZIIZ)V")
	private void method8212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(10) boolean local10 = arg4 & this.method8127();
		if (!local10 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			arg0 = 2;
			arg1 = 1;
			arg3 = 0;
		}
		if (arg0 != 0 && arg2) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt9668) {
			if (this.anInt9668 != 0) {
				this.aClass20Array3[Integer.MAX_VALUE & this.anInt9668].method7960();
			}
			if (arg0 == 0) {
				this.aClass20_3 = null;
			} else {
				this.aClass20_3 = this.aClass20Array3[arg0 & Integer.MAX_VALUE];
				this.aClass20_3.method7967(arg2);
				this.aClass20_3.method7961(arg2);
				this.aClass20_3.method7969(arg3, arg1);
			}
			this.anInt9677 = arg1;
			this.anInt9678 = arg3;
			this.anInt9668 = arg0;
		} else if (this.anInt9668 != 0) {
			this.aClass20Array3[this.anInt9668 & Integer.MAX_VALUE].method7961(arg2);
			if (arg3 != this.anInt9678 || arg1 != this.anInt9677) {
				this.aClass20Array3[this.anInt9668 & Integer.MAX_VALUE].method7969(arg3, arg1);
				this.anInt9678 = arg3;
				this.anInt9677 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(ZI)V")
	public final void method8213(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean737 != arg0) {
			this.aBoolean737 = arg0;
			this.method8262();
			this.anInt9644 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "(B)V")
	protected abstract void method8214();

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "()Z")
	@Override
	public final boolean method8101() {
		return true;
	}

	@OriginalMember(owner = "client!wg", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method8225();
		this.method8208(arg4);
		this.method8239(0, Static228.aClass230_2);
		this.method8258(Static228.aClass230_2, 0);
		this.method8250(arg5);
		this.aClass92_Sub1_15.method2302((float) arg3, 1.0F, (float) arg2);
		this.aClass92_Sub1_15.method3851(arg0, arg1, 0);
		this.method8232();
		this.method8283(false);
		this.method8236();
		this.method8283(true);
		this.method8258(Static41.aClass230_1, 0);
		this.method8239(0, Static41.aClass230_1);
	}

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "(I)Lclient!mia;")
	public final Interface17 method8215() {
		return this.aClass68_Sub1_3 == null ? null : this.aClass68_Sub1_3.method8742();
	}

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "(I)Lclient!eia;")
	public final Class92_Sub1 method8216() {
		if (!this.aBoolean743) {
			this.aClass92_Sub1_20.method2312(this.aClass92_Sub1_18, this.aClass92_Sub1_15);
			this.aBoolean743 = true;
		}
		return this.aClass92_Sub1_20;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	@Override
	public final void method8089(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "(I)V")
	protected abstract void method8217();

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "(B)V")
	private void method8218() {
		if (Static570.aClass340_6 == this.aClass340_7) {
			@Pc(11) float local11 = this.method8199();
			this.aClass92_Sub1_15.method2311(local11, 0.0F, local11);
		}
		this.aBoolean743 = false;
		this.method8207();
		if (this.aClass20_3 != null) {
			this.aClass20_3.method7958();
		}
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(IZ)V")
	public final void method8219(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean753) {
			this.aBoolean753 = arg0;
			this.method8241();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIZ)Lclient!tf;")
	@Override
	public final Class17 method8151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class17_Sub2 local11 = new Class17_Sub2(this, arg2, arg3, arg4);
		local11.method5269(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "(I)I")
	public final int method8220() {
		return this.anInt9662;
	}

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "()Z")
	@Override
	public final boolean method8127() {
		return this.aClass20Array3[3].method7970();
	}

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "(I)V")
	private void method8221() {
		this.anInterface19_17 = this.method8157(true);
		this.anInterface19_17.method6567(24, 12);
		this.aClass247_22 = this.method8237(new Class289[] { new Class289(Static345.aClass214_1) });
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method8096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		if (local10 == 0.0F && local17 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(38) float local38 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
			local10 *= local38;
			local17 *= local38;
		}
		if (!this.method8229((float) arg0, 0.0F, local17 + (float) arg3, (float) arg1, 0.0F, (float) arg2 + local10)) {
			return;
		}
		this.method8225();
		this.method8208(arg4);
		this.method8239(0, Static228.aClass230_2);
		this.method8258(Static228.aClass230_2, 0);
		this.method8250(arg5);
		this.method8266();
		this.method8283(false);
		this.method8268();
		this.method8283(true);
		this.method8258(Static41.aClass230_1, 0);
		this.method8239(0, Static41.aClass230_1);
	}

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "(B)V")
	protected abstract void method8223();

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "(B)[F")
	public final float[] method8224() {
		return this.aFloatArray70;
	}

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "(I)V")
	private void method8225() {
		if (this.anInt9644 == 1) {
			return;
		}
		this.method8234();
		this.method8197(false);
		this.method8213(false);
		this.method8205(false);
		this.method8194(false);
		this.method8272(false, -2, false);
		this.method8167(1);
		this.method8159(this.anInterface14_3);
		this.anInt9644 = 1;
	}

	@OriginalMember(owner = "client!wg", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass92_Sub1_16.aFloat44 + this.aClass92_Sub1_16.aFloat46 * (float) arg2 + this.aClass92_Sub1_16.aFloat41 * (float) arg1 + (float) arg0 * this.aClass92_Sub1_16.aFloat48;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg5 * this.aClass92_Sub1_16.aFloat46 + (float) arg4 * this.aClass92_Sub1_16.aFloat41 + (float) arg3 * this.aClass92_Sub1_16.aFloat48 + this.aClass92_Sub1_16.aFloat44;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt9679 > local32 && (float) this.anInt9679 > local63) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt9642 && local63 > (float) this.anInt9642) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt9663 * (this.aClass92_Sub1_16.aFloat50 + (float) arg0 * this.aClass92_Sub1_16.aFloat49 + this.aClass92_Sub1_16.aFloat51 * (float) arg1 + this.aClass92_Sub1_16.aFloat45 * (float) arg2) / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt9663 * (this.aClass92_Sub1_16.aFloat50 + this.aClass92_Sub1_16.aFloat51 * (float) arg4 + (float) arg3 * this.aClass92_Sub1_16.aFloat49 + (float) arg5 * this.aClass92_Sub1_16.aFloat45) / local63);
		if ((float) local135 < this.aFloat211 && (float) local167 < this.aFloat211) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat219 && (float) local167 > this.aFloat219) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass92_Sub1_16.aFloat42 + this.aClass92_Sub1_16.aFloat47 * (float) arg0 + this.aClass92_Sub1_16.aFloat40 * (float) arg1 + (float) arg2 * this.aClass92_Sub1_16.aFloat43) * (float) this.anInt9665 / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt9665 * (this.aClass92_Sub1_16.aFloat42 + (float) arg3 * this.aClass92_Sub1_16.aFloat47 + this.aClass92_Sub1_16.aFloat40 * (float) arg4 + this.aClass92_Sub1_16.aFloat43 * (float) arg5) / local63);
		if (this.aFloat223 > (float) local233 && this.aFloat223 > (float) local265) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat221 && this.aFloat221 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(Z)V")
	private void method8226() {
		if (this.aClass20_3 != null) {
			this.aClass20_3.method7956();
		}
		this.method8206();
	}

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "(I)V")
	protected abstract void method8227();

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(Z)V")
	private void method8228() {
		this.aFloat225 = (float) this.anInt9642;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!jia;)V")
	@Override
	public final void method8069(@OriginalArg(0) Class68 arg0) {
		this.aClass68_Sub1_3 = (Class68_Sub1) arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(FFFFBFF)Z")
	private boolean method8229(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface19_17.method6566();
		if (local9 == null) {
			return false;
		}
		@Pc(26) Stream local26 = this.method8168(local9);
		if (Stream.b()) {
			local26.a(arg0);
			local26.a(arg3);
			local26.a(arg1);
			local26.a(arg5);
			local26.a(arg2);
			local26.a(arg4);
		} else {
			local26.b(arg0);
			local26.b(arg3);
			local26.b(arg1);
			local26.b(arg5);
			local26.b(arg2);
			local26.b(arg4);
		}
		local26.c();
		return this.anInterface19_17.method6568();
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(BI)V")
	public abstract void method8230(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wg", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8225();
		this.method8208(arg3);
		this.method8239(0, Static228.aClass230_2);
		this.method8258(Static228.aClass230_2, 0);
		this.method8250(arg4);
		this.aClass92_Sub1_15.method2302((float) arg2, 1.0F, (float) arg2);
		this.aClass92_Sub1_15.method3851(arg0, arg1, 0);
		this.method8232();
		this.method8283(false);
		this.method8175(this.anInterface19_16, 0);
		this.method8179(this.aClass247_19);
		this.method8204(Static454.aClass194_9, 0, 256);
		this.method8283(true);
		this.method8258(Static41.aClass230_1, 0);
		this.method8239(0, Static41.aClass230_1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZI[FBLclient!pe;I)Lclient!ada;")
	protected abstract Interface1 method8231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) float[] arg3, @OriginalArg(6) Class276 arg4);

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "(I)V")
	public final void method8232() {
		this.aBoolean733 = false;
		this.method8218();
	}

	@OriginalMember(owner = "client!wg", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "(I)V")
	private void method8234() {
		if (this.aClass340_7 == Static570.aClass340_6) {
			return;
		}
		@Pc(10) Class340 local10 = this.aClass340_7;
		this.aClass340_7 = Static570.aClass340_6;
		if (local10.method7445()) {
			this.method8160();
		}
		this.method8276();
		this.aFloatArray69 = this.aFloatArray67;
		this.method8158();
		this.anInt9644 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(ZI)V")
	public final void method8235(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt9658) {
			this.anInt9658 = arg0;
			this.method8246();
		}
	}

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "(I)V")
	public final void method8236() {
		this.method8238(2, Static454.aClass194_9);
	}

	@OriginalMember(owner = "client!wg", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass92_Sub1_16.method2295((float) arg2, (float) arg1, (float) arg0);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt9663 * this.aClass92_Sub1_16.method2299((float) arg1, (float) arg0, (float) arg2) / local14);
			local58 = (int) ((float) this.anInt9665 * this.aClass92_Sub1_16.method2298((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local40 = this.anInt9666;
			local58 = this.anInt9676;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat211);
		arg3[1] = (int) ((float) local58 - this.aFloat223);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "()Lclient!nh;")
	@Override
	public final Class92 method8118() {
		return new Class92_Sub1();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[Lclient!po;)Lclient!nca;")
	public abstract Class247 method8237(@OriginalArg(1) Class289[] arg0);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILclient!kja;)V")
	private void method8238(@OriginalArg(1) int arg0, @OriginalArg(2) Class194 arg1) {
		this.method8175(this.anInterface19_18, 0);
		this.method8179(this.aClass247_18);
		this.method8204(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILclient!mga;)V")
	public final void method8239(@OriginalArg(1) int arg0, @OriginalArg(2) Class230 arg1) {
		this.method8182(arg1, false, false, arg0);
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "(Z)V")
	public final void method8240() {
		if (this.aClass340_7 == Static527.aClass340_5) {
			return;
		}
		@Pc(12) Class340 local12 = this.aClass340_7;
		this.aClass340_7 = Static527.aClass340_5;
		if (local12.method7445()) {
			this.method8160();
		}
		this.anInt9644 &= 0xFFFFFFE0;
		this.aFloatArray69 = this.aFloatArray70;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local10 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local16 * local16 + local10 * local10));
			local18 = (float) Math.atan2((double) local16, (double) local10);
		}
		this.method8225();
		this.method8208(arg4);
		this.method8239(0, Static228.aClass230_2);
		this.method8258(Static228.aClass230_2, 0);
		this.method8250(0);
		this.aClass92_Sub1_15.method2302((float) arg5, 1.0F, local20);
		this.aClass92_Sub1_15.method3851(0, -arg5 / 2, 0);
		this.aClass92_Sub1_15.method3860((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass92_Sub1_15.method3851(arg0, arg1, 0);
		this.method8232();
		this.method8283(false);
		this.method8236();
		this.method8283(true);
		this.method8258(Static41.aClass230_1, 0);
		this.method8239(0, Static41.aClass230_1);
	}

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass92_Sub1_16.method2295((float) arg2, (float) arg1, (float) arg0);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt9663 * this.aClass92_Sub1_16.method2299((float) arg1, (float) arg0, (float) arg2) / local14);
			local58 = (int) ((float) this.anInt9665 * this.aClass92_Sub1_16.method2298((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local40 = this.anInt9666;
			local58 = this.anInt9676;
		}
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local58 - this.aFloat223);
		arg3[0] = (int) ((float) local40 - this.aFloat211);
	}

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "(Z)V")
	protected abstract void method8241();

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
	@Override
	public final void method8111(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIZZ[I)Lclient!ada;")
	public abstract Interface1 method8242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int[] arg5);

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)V")
	@Override
	public void method8131(@OriginalArg(0) int arg0) {
		if (this.aClass147_3 != null) {
			this.aClass147_3.method3247();
		}
		this.anInt9643 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "(Z)V")
	public final void method8243() {
		if (this.anInt9644 == 8) {
			return;
		}
		this.method8198();
		this.method8197(true);
		this.method8205(true);
		this.method8194(true);
		this.method8250(1);
		this.anInt9644 = 8;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!af;I)V")
	@Override
	public final void method8094(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1) {
		this.aClass325_3.method7216(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZB)V")
	public final void method8244(@OriginalArg(1) byte arg0) {
		this.method8208(arg0 | arg0 << 16 | arg0 << 24 | arg0 << 8);
	}

	@OriginalMember(owner = "client!wg", name = "J", descriptor = "(I)V")
	protected abstract void method8245();

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "(I)V")
	protected abstract void method8246();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([IIIIIZ)Lclient!tf;")
	@Override
	public final Class17 method8156(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class17_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(BI)Lclient!je;")
	public final Interface16 method8247(@OriginalArg(1) int arg0) {
		if (this.anInterface16_8.method8353() < arg0 * 2) {
			this.anInterface16_8.method8360(arg0);
		}
		return this.anInterface16_8;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8132(@OriginalArg(0) Canvas arg0) {
		this.aCanvas11 = null;
		this.anObject20 = null;
		if (arg0 == null || this.aCanvas12 == arg0) {
			this.anObject20 = this.anObject19;
			this.aCanvas11 = this.aCanvas12;
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.anObject20 = this.aHashtable7.get(arg0);
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.anObject20 == null) {
			throw new RuntimeException();
		}
		this.method8193(this.aCanvas11, this.anObject20);
		this.method8253();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([BIIIBLclient!pe;)Lclient!ch;")
	public abstract Interface7 method8248(@OriginalArg(0) byte[] arg0, @OriginalArg(5) Class276 arg1);

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "()Lclient!nh;")
	@Override
	public final Class92 method8076() {
		return this.aClass92_Sub1_16;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!gha;I)V")
	public abstract void method8249(@OriginalArg(0) Class134 arg0);

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(BI)V")
	public final void method8250(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt9649) {
			return;
		}
		@Pc(19) Class137 local19;
		@Pc(17) boolean local17;
		@Pc(21) boolean local21;
		if (arg0 == 1) {
			local19 = Static618.aClass137_7;
			local17 = true;
			local21 = true;
		} else if (arg0 == 2) {
			local17 = true;
			local19 = Static606.aClass137_5;
			local21 = false;
		} else if (arg0 == 128) {
			local17 = true;
			local21 = true;
			local19 = Static282.aClass137_1;
		} else {
			local19 = Static536.aClass137_4;
			local21 = false;
			local17 = false;
		}
		if (this.aBoolean749 != local21) {
			this.aBoolean749 = local21;
			this.method8203();
		}
		if (this.aBoolean748 != local17) {
			this.aBoolean748 = local17;
			this.method8223();
		}
		if (this.aClass137_6 != local19) {
			this.aClass137_6 = local19;
			this.method8214();
		}
		this.anInt9644 &= 0xFFFFFFE3;
		this.anInt9649 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt9666, this.anInt9676, this.anInt9663, this.anInt9665 };
	}

	@OriginalMember(owner = "client!wg", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9663 = arg2;
		this.anInt9666 = arg0;
		this.anInt9676 = arg1;
		this.anInt9665 = arg3;
		this.method8162();
		this.method8170();
		this.method8240();
		this.method8290();
	}

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface1 local9 = local6.anInterface1_4;
		this.method8161();
		this.method8159(local9);
		this.method8250(1);
		this.method8280(Static489.aClass91_4, Static489.aClass91_4);
		this.method8239(0, Static228.aClass230_2);
		this.method8208(arg0);
		this.aClass92_Sub1_15.method2302((float) this.anInt9526, 0.0F, (float) this.anInt9573);
		this.method8232();
		this.aClass92_Sub1Array3[0].method2302(local9.method8631((float) this.anInt9526), 1.0F, local9.method8627((float) this.anInt9573));
		this.aClass92_Sub1Array3[0].method2311(local9.method8631((float) -arg3), 0.0F, local9.method8627((float) -arg2));
		this.aClass331Array3[0] = Static100.aClass331_1;
		this.method8191();
		this.method8236();
		this.method8201();
		this.method8239(0, Static41.aClass230_1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI[[II)Lclient!mia;")
	public abstract Interface17 method8251(@OriginalArg(0) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	protected abstract void method8252(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "(B)V")
	private void method8253() {
		if (this.aCanvas11 == null) {
			this.anInt9582 = this.anInt9576 = 1;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas11.getSize();
			this.anInt9576 = local14.height;
			this.anInt9582 = local14.width;
		}
		this.anInt9573 = this.anInt9582;
		this.anInt9526 = this.anInt9576;
		this.method8180();
		this.method8170();
		this.method8162();
		this.method8245();
		this.method8290();
		this.method8240();
		this.la();
	}

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean735 = arg0;
		this.method8289();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method8254(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "(I)V")
	protected abstract void method8255();

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "(I)Lclient!eia;")
	public final Class92_Sub1 method8256() {
		return this.aClass92_Sub1Array3[this.anInt9658];
	}

	@OriginalMember(owner = "client!wg", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt9573 - 1 <= arg2 && arg1 <= 0 && this.anInt9526 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt9670 = arg2 > this.anInt9573 ? 0 : arg2;
		this.anInt9661 = arg3 <= this.anInt9573 ? arg3 : 0;
		this.anInt9646 = arg1 >= 0 ? arg1 : 0;
		this.anInt9655 = arg0 < 0 ? 0 : arg0;
		if (!this.aBoolean754) {
			this.aBoolean754 = true;
			this.method8183();
		}
		this.method8189();
		this.method8290();
	}

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "(I)V")
	protected final void method8257() {
		@Pc(9) Enumeration local9 = this.aHashtable7.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method8254(local15, this.aHashtable7.get(local15));
		}
		this.anInterface19_18.method8358();
		this.anInterface19_17.method8358();
		this.anInterface19_16.method8358();
		this.aClass62_Sub3_24.method7364();
		this.aClass62_Sub3_27.method7364();
		this.aClass62_Sub3_22.method7364();
		this.aClass62_Sub3_30.method7364();
		this.aClass62_Sub3_29.method7364();
		this.aClass325_3.method7218();
		this.anInterface16_8.method8358();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!mga;BI)V")
	public final void method8258(@OriginalArg(0) Class230 arg0, @OriginalArg(2) int arg1) {
		this.method8173(arg1, arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method8259(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "(I)V")
	protected final void method8260() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable7 != null && !this.aHashtable7.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable7.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method8259(local26));
			}
		}
		this.aHashtable7 = local9;
		this.method8264();
		this.method8221();
		this.method8282();
		this.aClass325_3.method7212(this);
	}

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "(B)V")
	protected abstract void method8261();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8098(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas12 == arg0) {
			local5 = this.anObject20;
		} else if (this.aHashtable7.containsKey(arg0)) {
			local5 = this.aHashtable7.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method8252(arg0, local5);
		if (this.aCanvas11 == arg0) {
			this.method8253();
		}
	}

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "()Z")
	@Override
	public final boolean method8108() {
		return true;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([I)V")
	@Override
	public final void method8155(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9573;
		arg0[1] = this.anInt9526;
	}

	@OriginalMember(owner = "client!wg", name = "P", descriptor = "(I)V")
	protected abstract void method8262();

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "(Z)V")
	public abstract void method8263();

	@OriginalMember(owner = "client!wg", name = "Q", descriptor = "(I)V")
	private void method8264() {
		this.anInterface19_18 = this.method8157(false);
		this.anInterface19_18.method6567(140, 28);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface19_18.method6566();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method8168(local28);
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
				local35.c();
				if (this.anInterface19_18.method6568()) {
					break;
				}
			}
		}
		this.aClass247_18 = this.method8237(new Class289[] { new Class289(new Class214[] { Static345.aClass214_1, Static345.aClass214_5, Static345.aClass214_5 }) });
	}

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "()Z")
	@Override
	public final boolean method8107() {
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(II)I")
	@Override
	public final int method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt9655) {
			this.anInt9655 = arg0;
			local5 = true;
		}
		if (this.anInt9670 > arg2) {
			this.anInt9670 = arg2;
			local5 = true;
		}
		if (this.anInt9646 < arg1) {
			this.anInt9646 = arg1;
			local5 = true;
		}
		if (this.anInt9661 > arg3) {
			this.anInt9661 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean754) {
			this.aBoolean754 = true;
			this.method8183();
		}
		this.method8189();
		this.method8290();
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
	@Override
	public final void method8092(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass147_3 != null) {
			this.aClass147_3.method3248();
		}
		this.anInt9672 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZZ)Lclient!je;")
	public abstract Interface16 method8265(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "(I)V")
	public final void method8266() {
		this.aClass92_Sub1_15.method3853();
		this.aBoolean733 = true;
		this.method8218();
	}

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "(I)V")
	protected void method8267() {
		this.method8181();
	}

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "(I)V")
	private void method8268() {
		this.method8175(this.anInterface19_17, 0);
		this.method8179(this.aClass247_22);
		this.method8204(Static266.aClass194_5, 0, 1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!pe;ZI[FI)Lclient!ada;")
	public final Interface1 method8269(@OriginalArg(0) int arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4) {
		return this.method8231(arg3, arg0, arg2, arg4, arg1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([FB)[F")
	public final float[] method8270(@OriginalArg(0) float[] arg0) {
		arg0[8] = this.aFloatArray69[2];
		arg0[12] = this.aFloatArray69[3];
		arg0[0] = this.aFloatArray69[0];
		arg0[4] = this.aFloatArray69[1];
		arg0[9] = this.aFloatArray69[6];
		arg0[1] = this.aFloatArray69[4];
		arg0[13] = this.aFloatArray69[7];
		arg0[2] = this.aFloatArray69[8];
		arg0[5] = this.aFloatArray69[5];
		arg0[7] = this.aFloatArray69[13];
		arg0[6] = this.aFloatArray69[9];
		arg0[3] = this.aFloatArray69[12];
		arg0[10] = this.aFloatArray69[10];
		arg0[14] = this.aFloatArray69[11];
		arg0[15] = this.aFloatArray69[15];
		arg0[11] = this.aFloatArray69[14];
		return arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!nh;)V")
	@Override
	public final void method8133(@OriginalArg(0) Class92 arg0) {
		this.aClass92_Sub1_16 = (Class92_Sub1) arg0;
		this.aClass92_Sub1_18.method3865(this.aClass92_Sub1_16);
		this.aClass92_Sub1_18.method2316();
		this.aClass92_Sub1_19.method2301(this.aClass92_Sub1_18);
		this.aClass92_Sub1_17.method2301(this.aClass92_Sub1_16);
		if (this.aClass340_7.method7445()) {
			this.method8160();
		}
	}

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "(I)Lclient!eia;")
	public final Class92_Sub1 method8271() {
		return this.aClass92_Sub1Array3[this.anInt9658];
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZIZ)V")
	public final void method8272(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt9671 != arg1 || this.aBoolean742 != this.aBoolean734) {
			@Pc(34) Interface1 local34 = null;
			@Pc(36) int local36 = 0;
			@Pc(38) byte local38 = 0;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = this.aBoolean734 ? 3 : 0;
			if (arg1 < 0) {
				this.method8201();
			} else {
				local34 = this.aClass147_3.method3249(arg1);
				@Pc(66) Class130 local66 = super.anInterface9_12.method1558(arg1);
				if (local66.aByte34 == 0 && local66.aByte36 == 0) {
					this.method8201();
				} else {
					@Pc(82) int local82 = local66.aBoolean236 ? 64 : 128;
					@Pc(86) int local86 = local82 * 50;
					@Pc(92) Class92_Sub1 local92 = this.method8271();
					local92.method2314(0.0F, (float) (this.anInt9643 % local86 * local66.aByte36) / (float) local86, (float) (local66.aByte34 * (this.anInt9643 % local86)) / (float) local86);
					this.method8286(Static100.aClass331_1);
				}
				local36 = local66.anInt3117;
				if (!this.aBoolean734) {
					local38 = local66.aByte35;
					local47 = local66.aByte39;
					local40 = local66.anInt3118;
				}
			}
			this.method8212(local47, local40, arg0, local38, arg2);
			if (this.aClass20_3 == null) {
				this.method8159(local34);
				this.method8167(local36);
			} else {
				this.aClass20_3.method7965(local36, local34);
			}
			this.anInt9671 = arg1;
			this.aBoolean742 = this.aBoolean734;
		}
		this.anInt9644 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIII[I)Lclient!ada;")
	public final Interface1 method8273(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		return this.method8242(arg1, 0, arg2, 0, arg0, arg3);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	@Override
	public final void method8087(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "()V")
	@Override
	protected void method8126() {
		if (this.aBoolean741) {
			return;
		}
		for (@Pc(9) Class4 local9 = this.aClass163_66.method3639(); local9 != null; local9 = this.aClass163_66.method3640()) {
			((Class4_Sub13_Sub2) local9).method8923();
		}
		@Pc(26) Enumeration local26 = this.aHashtable7.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method8254(local32, this.aHashtable7.get(local32));
		}
		Static373.method4918(true, false);
		this.aNativeInterface3.release();
		this.aBoolean741 = true;
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt9679 && this.anInt9642 == arg1) {
			return;
		}
		this.anInt9679 = arg0;
		this.anInt9642 = arg1;
		this.method8170();
		this.method8162();
		this.method8226();
	}

	@OriginalMember(owner = "client!wg", name = "V", descriptor = "(I)Lclient!eia;")
	public final Class92_Sub1 method8274() {
		return this.aClass92_Sub1_18;
	}

	@OriginalMember(owner = "client!wg", name = "W", descriptor = "(I)V")
	protected void method8275() {
		this.anInt9651 = this.anInt9659;
		this.anInt9659 = 0;
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "()I")
	@Override
	public final int method8086() {
		return this.anInt9660 - 2;
	}

	@OriginalMember(owner = "client!wg", name = "Y", descriptor = "(I)V")
	private void method8276() {
		if (this.aBoolean751) {
			return;
		}
		@Pc(11) float[] local11 = this.aFloatArray67;
		this.aBoolean751 = true;
		if (this.anInt9573 != 0 && this.anInt9526 != 0) {
			local11[11] = 0.0F;
			local11[13] = 1.0F;
			local11[2] = 0.0F;
			local11[1] = 0.0F;
			local11[8] = 0.0F;
			local11[7] = 0.0F;
			local11[6] = 0.0F;
			local11[5] = -2.0F / (float) this.anInt9526;
			local11[10] = 0.5F;
			local11[3] = 0.0F;
			local11[0] = 2.0F / (float) this.anInt9573;
			local11[12] = -1.0F;
			local11[4] = 0.0F;
			local11[9] = 0.0F;
			local11[14] = 0.5F;
			local11[15] = 1.0F;
			return;
		}
		local11[7] = 0.0F;
		local11[5] = 1.0F;
		local11[14] = 0.0F;
		local11[3] = 0.0F;
		local11[11] = 0.0F;
		local11[1] = 0.0F;
		local11[9] = 0.0F;
		local11[6] = 0.0F;
		local11[0] = 1.0F;
		local11[8] = 0.0F;
		local11[13] = 0.0F;
		local11[2] = 0.0F;
		local11[10] = 1.0F;
		local11[4] = 0.0F;
		local11[12] = 0.0F;
		local11[15] = 1.0F;
	}

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "(B)V")
	protected abstract void method8277();

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "(B)V")
	private void method8278() {
		if (this.aBoolean745) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray73;
		@Pc(17) float local17 = (float) (-this.anInt9666 * this.anInt9679) / (float) this.anInt9663;
		@Pc(31) float local31 = (float) (this.anInt9679 * (this.anInt9573 - this.anInt9666)) / (float) this.anInt9663;
		@Pc(42) float local42 = (float) (this.anInt9679 * this.anInt9676) / (float) this.anInt9665;
		@Pc(57) float local57 = (float) (this.anInt9679 * (this.anInt9676 - this.anInt9526)) / (float) this.anInt9665;
		if (local31 == local17 || local42 == local57) {
			local5[12] = 0.0F;
			local5[15] = 1.0F;
			local5[11] = 0.0F;
			local5[0] = 1.0F;
			local5[14] = 0.0F;
			local5[7] = 0.0F;
			local5[3] = 0.0F;
			local5[4] = 0.0F;
			local5[1] = 0.0F;
			local5[6] = 0.0F;
			local5[9] = 0.0F;
			local5[2] = 0.0F;
			local5[5] = 1.0F;
			local5[10] = 1.0F;
			local5[8] = 0.0F;
			local5[13] = 0.0F;
		} else {
			@Pc(137) float local137 = (float) this.anInt9679 * 2.0F;
			local5[0] = local137 / (local31 - local17);
			local5[4] = 0.0F;
			local5[3] = 0.0F;
			local5[15] = 0.0F;
			local5[5] = local137 / (local42 - local57);
			local5[13] = 0.0F;
			local5[14] = this.aFloat226 = (float) (this.anInt9679 * this.anInt9642) / (float) (this.anInt9679 - this.anInt9642);
			local5[1] = 0.0F;
			local5[12] = 0.0F;
			local5[11] = -1.0F;
			local5[6] = 0.0F;
			local5[10] = this.aFloat220 = (float) this.anInt9642 / (float) (this.anInt9679 - this.anInt9642);
			local5[7] = 0.0F;
			local5[9] = (local57 + local42) / (-local57 + local42);
			local5[8] = (local17 + local31) / (local31 - local17);
			local5[2] = 0.0F;
		}
		this.method8195();
		this.aBoolean745 = true;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!je;BILclient!kja;III)V")
	public abstract void method8279(@OriginalArg(0) Interface16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class194 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "()Z")
	@Override
	public final boolean method8130() {
		return true;
	}

	@OriginalMember(owner = "client!wg", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean734 = true;
		this.anInt9662 = arg1;
		this.anInt9675 = arg2;
		this.anInt9667 = arg3;
		this.anInt9669 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ei;ILclient!ei;)V")
	public final void method8280(@OriginalArg(0) Class91 arg0, @OriginalArg(2) Class91 arg1) {
		@Pc(5) boolean local5 = false;
		if (this.aClass91Array6[this.anInt9658] != arg1) {
			this.aClass91Array6[this.anInt9658] = arg1;
			this.method8171();
			local5 = true;
		}
		if (arg0 != this.aClass91Array5[this.anInt9658]) {
			this.aClass91Array5[this.anInt9658] = arg0;
			this.method8285();
			local5 = true;
		}
		if (local5) {
			this.anInt9644 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "(B)V")
	public final void method8281() {
		this.aClass92_Sub1Array3 = new Class92_Sub1[this.anInt9664];
		this.aClass91Array6 = new Class91[this.anInt9664];
		this.anInterface14Array3 = new Interface14[this.anInt9664];
		this.aClass91Array5 = new Class91[this.anInt9664];
		this.aClass331Array3 = new Class331[this.anInt9664];
		for (@Pc(32) int local32 = 0; local32 < this.anInt9664; local32++) {
			this.aClass91Array5[local32] = Static435.aClass91_3;
			this.aClass91Array6[local32] = Static435.aClass91_3;
			this.aClass331Array3[local32] = Static426.aClass331_4;
			this.aClass92_Sub1Array3[local32] = new Class92_Sub1();
		}
		this.aClass4_Sub29Array6 = new Class4_Sub29[this.anInt9660 - 2];
		this.anInterface14_3 = this.method8169(Static111.aClass79_7, 1, Static220.aClass276_11, 1);
		this.method8083(new Class4_Sub13_Sub2(262144));
		this.aClass247_17 = this.method8237(new Class289[] { new Class289(new Class214[] { Static345.aClass214_1, Static345.aClass214_5 }) });
		this.aClass247_23 = this.method8237(new Class289[] { new Class289(new Class214[] { Static345.aClass214_1, Static345.aClass214_3 }) });
		this.aClass247_20 = this.method8237(new Class289[] { new Class289(Static345.aClass214_1), new Class289(Static345.aClass214_3), new Class289(Static345.aClass214_5), new Class289(Static345.aClass214_2) });
		this.aClass247_21 = this.method8237(new Class289[] { new Class289(Static345.aClass214_1), new Class289(Static345.aClass214_3), new Class289(Static345.aClass214_5) });
		this.aClass62_Sub3_25 = new Class62_Sub3(this, 0, 0, false, false);
		this.aClass62_Sub3_24 = new Class62_Sub3(this, 0, 0, true, true);
		this.aClass62_Sub3_28 = new Class62_Sub3(this, 0, 0, false, false);
		this.aClass62_Sub3_27 = new Class62_Sub3(this, 0, 0, true, true);
		this.aClass62_Sub3_23 = new Class62_Sub3(this, 0, 0, false, false);
		this.aClass62_Sub3_22 = new Class62_Sub3(this, 0, 0, true, true);
		this.aClass62_Sub3_21 = new Class62_Sub3(this, 0, 0, false, false);
		this.aClass62_Sub3_30 = new Class62_Sub3(this, 0, 0, true, true);
		this.aClass62_Sub3_26 = new Class62_Sub3(this, 0, 0, false, false);
		this.aClass62_Sub3_29 = new Class62_Sub3(this, 0, 0, true, true);
		this.aClass325_3 = new Class325(this);
		this.anInterface16_8 = this.method8265(true);
		this.method8260();
		this.aClass312_8 = new Class312(this);
		this.aClass20Array3[1] = this.method8163(1);
		this.aClass20Array3[2] = this.method8163(2);
		this.aClass20Array3[4] = this.method8163(4);
		this.aClass20Array3[5] = this.method8163(5);
		this.aClass20Array3[6] = this.method8163(6);
		this.aClass20Array3[7] = this.method8163(7);
		this.aClass20Array3[3] = this.method8163(3);
		this.aClass20Array3[8] = this.method8163(8);
		this.aClass20Array3[9] = this.method8163(9);
		if (!this.aClass20Array3[2].method7970()) {
			this.aClass20Array3[2] = this.method8163(0);
		}
		if (!this.aClass20Array3[4].method7970()) {
			this.aClass20Array3[4] = this.aClass20Array3[2];
		}
		if (!this.aClass20Array3[8].method7970()) {
			this.aClass20Array3[8] = this.aClass20Array3[4];
		}
		if (!this.aClass20Array3[9].method7970()) {
			this.aClass20Array3[9] = this.aClass20Array3[8];
		}
		this.method8267();
		this.la();
		this.method8093();
	}

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "(B)V")
	private void method8282() {
		this.anInterface19_16 = this.method8157(false);
		this.anInterface19_16.method6567(3096, 12);
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			@Pc(34) Buffer local34 = this.anInterface19_16.method6566();
			if (local34 != null) {
				@Pc(41) Stream local41 = this.method8168(local34);
				local41.a(0.0F);
				local41.a(0.0F);
				local41.a(0.0F);
				for (@Pc(52) int local52 = 0; local52 <= 256; local52++) {
					@Pc(63) double local63 = (double) (local52 * 2) * 3.141592653589793D / 256.0D;
					@Pc(67) float local67 = (float) Math.cos(local63);
					@Pc(71) float local71 = (float) Math.sin(local63);
					if (Stream.b()) {
						local41.a(local71);
						local41.a(local67);
						local41.a(0.0F);
					} else {
						local41.b(local71);
						local41.b(local67);
						local41.b(0.0F);
					}
				}
				local41.c();
				if (this.anInterface19_16.method6568()) {
					break;
				}
			}
		}
		this.aClass247_19 = this.method8237(new Class289[] { new Class289(Static345.aClass214_1) });
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(IZ)V")
	public abstract void method8283(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "()Z")
	@Override
	public final boolean method8146() {
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "Z", descriptor = "(I)V")
	private void method8284() {
		if (Static424.aClass340_4 == this.aClass340_7) {
			return;
		}
		@Pc(10) Class340 local10 = this.aClass340_7;
		this.aClass340_7 = Static424.aClass340_4;
		if (!local10.method7445()) {
			this.method8160();
		}
		this.method8184();
		this.aFloatArray69 = this.aFloatArray74;
		this.method8158();
		this.anInt9644 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "(B)V")
	protected abstract void method8285();

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8144(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas12 == arg0) {
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
			@Pc(53) Object local53 = this.method8259(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V")
	@Override
	public final void method8109(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!si;B)V")
	public final void method8286(@OriginalArg(0) Class331 arg0) {
		this.aClass331Array3[this.anInt9658] = arg0;
		this.method8191();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!eia;I)V")
	public final void method8287(@OriginalArg(0) Class92_Sub1 arg0) {
		this.aClass92_Sub1_15.method3865(arg0);
		this.aBoolean733 = false;
		this.method8218();
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(IZ)V")
	public final void method8288(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean752) {
			this.aBoolean752 = arg0;
			this.method8211();
		}
	}

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "(B)V")
	protected abstract void method8289();

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt9681;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method8067() {
	}

	@OriginalMember(owner = "client!wg", name = "ab", descriptor = "(I)V")
	private void method8290() {
		this.aFloat219 = (float) (this.anInt9670 - this.anInt9666);
		this.aFloat223 = (float) (this.anInt9646 - this.anInt9676);
		this.aFloat211 = (float) (this.anInt9655 - this.anInt9666);
		this.aFloat221 = (float) (this.anInt9661 - this.anInt9676);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!pe;ILclient!dw;)Z")
	public abstract boolean method8291(@OriginalArg(0) Class276 arg0, @OriginalArg(2) Class79 arg1);
}
