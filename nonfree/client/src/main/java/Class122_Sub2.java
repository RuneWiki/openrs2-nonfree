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

@OriginalClass("client!re")
public abstract class Class122_Sub2 extends Class122 {

	@OriginalMember(owner = "client!re", name = "x", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!re", name = "db", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!re", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!re", name = "ob", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable6;

	@OriginalMember(owner = "client!re", name = "sc", descriptor = "Lclient!pv;")
	protected Class241 aClass241_6;

	@OriginalMember(owner = "client!re", name = "Rd", descriptor = "I")
	public int anInt6686;

	@OriginalMember(owner = "client!re", name = "Vd", descriptor = "I")
	public int anInt6689;

	@OriginalMember(owner = "client!re", name = "Wd", descriptor = "I")
	protected int anInt6690;

	@OriginalMember(owner = "client!re", name = "ee", descriptor = "F")
	private float aFloat122;

	@OriginalMember(owner = "client!re", name = "ie", descriptor = "I")
	protected int anInt6694;

	@OriginalMember(owner = "client!re", name = "je", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!re", name = "le", descriptor = "Z")
	protected boolean aBoolean471;

	@OriginalMember(owner = "client!re", name = "ne", descriptor = "[Lclient!sm;")
	protected Class271[] aClass271Array5;

	@OriginalMember(owner = "client!re", name = "qe", descriptor = "Z")
	public boolean aBoolean472;

	@OriginalMember(owner = "client!re", name = "se", descriptor = "I")
	public int anInt6697;

	@OriginalMember(owner = "client!re", name = "te", descriptor = "I")
	private int anInt6698;

	@OriginalMember(owner = "client!re", name = "ue", descriptor = "I")
	public int anInt6699;

	@OriginalMember(owner = "client!re", name = "Ae", descriptor = "Lclient!sf;")
	private Class42 aClass42_3;

	@OriginalMember(owner = "client!re", name = "Ce", descriptor = "F")
	private float aFloat127;

	@OriginalMember(owner = "client!re", name = "Ee", descriptor = "Z")
	public boolean aBoolean474;

	@OriginalMember(owner = "client!re", name = "Ie", descriptor = "I")
	protected int anInt6707;

	@OriginalMember(owner = "client!re", name = "Le", descriptor = "F")
	private float aFloat129;

	@OriginalMember(owner = "client!re", name = "Me", descriptor = "Z")
	protected boolean aBoolean476;

	@OriginalMember(owner = "client!re", name = "Re", descriptor = "[Lclient!sw;")
	private Interface15[] anInterface15Array3;

	@OriginalMember(owner = "client!re", name = "Ue", descriptor = "I")
	public int anInt6710;

	@OriginalMember(owner = "client!re", name = "Ve", descriptor = "[Lclient!ww;")
	protected Class1_Sub2[] aClass1_Sub2Array5;

	@OriginalMember(owner = "client!re", name = "Xe", descriptor = "Lclient!en;")
	private Class83 aClass83_3;

	@OriginalMember(owner = "client!re", name = "af", descriptor = "I")
	protected int anInt6712;

	@OriginalMember(owner = "client!re", name = "df", descriptor = "Lclient!jl;")
	private Class45_Sub1 aClass45_Sub1_3;

	@OriginalMember(owner = "client!re", name = "ff", descriptor = "Lclient!sw;")
	public Interface15 anInterface15_3;

	@OriginalMember(owner = "client!re", name = "tf", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!re", name = "wf", descriptor = "Z")
	public boolean aBoolean486;

	@OriginalMember(owner = "client!re", name = "Cf", descriptor = "I")
	public int anInt6721;

	@OriginalMember(owner = "client!re", name = "Df", descriptor = "I")
	private int anInt6722;

	@OriginalMember(owner = "client!re", name = "Ef", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!re", name = "Gf", descriptor = "[Lclient!uw;")
	protected Class118_Sub3[] aClass118_Sub3Array3;

	@OriginalMember(owner = "client!re", name = "Hf", descriptor = "I")
	protected int anInt6724;

	@OriginalMember(owner = "client!re", name = "If", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!re", name = "Kf", descriptor = "[Lclient!gn;")
	protected Class110[] aClass110Array3;

	@OriginalMember(owner = "client!re", name = "Mf", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!re", name = "Qf", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!re", name = "Zf", descriptor = "[Lclient!sm;")
	protected Class271[] aClass271Array6;

	@OriginalMember(owner = "client!re", name = "bg", descriptor = "Lclient!uf;")
	public Class145_Sub3 aClass145_Sub3_21;

	@OriginalMember(owner = "client!re", name = "cg", descriptor = "Lclient!kq;")
	public Class170 aClass170_14;

	@OriginalMember(owner = "client!re", name = "dg", descriptor = "Lclient!uf;")
	public Class145_Sub3 aClass145_Sub3_22;

	@OriginalMember(owner = "client!re", name = "eg", descriptor = "Lclient!uf;")
	public Class145_Sub3 aClass145_Sub3_23;

	@OriginalMember(owner = "client!re", name = "fg", descriptor = "Lclient!kq;")
	public Class170 aClass170_15;

	@OriginalMember(owner = "client!re", name = "gg", descriptor = "Lclient!lca;")
	private Interface5 anInterface5_11;

	@OriginalMember(owner = "client!re", name = "ig", descriptor = "Lclient!bd;")
	private Interface1 anInterface1_5;

	@OriginalMember(owner = "client!re", name = "jg", descriptor = "Lclient!kq;")
	public Class170 aClass170_16;

	@OriginalMember(owner = "client!re", name = "kg", descriptor = "Lclient!lca;")
	private Interface5 anInterface5_12;

	@OriginalMember(owner = "client!re", name = "lg", descriptor = "Lclient!uf;")
	public Class145_Sub3 aClass145_Sub3_24;

	@OriginalMember(owner = "client!re", name = "mg", descriptor = "Lclient!kq;")
	private Class170 aClass170_17;

	@OriginalMember(owner = "client!re", name = "ng", descriptor = "Lclient!uf;")
	public Class145_Sub3 aClass145_Sub3_25;

	@OriginalMember(owner = "client!re", name = "og", descriptor = "Lclient!uf;")
	public Class145_Sub3 aClass145_Sub3_26;

	@OriginalMember(owner = "client!re", name = "pg", descriptor = "Lclient!kq;")
	private Class170 aClass170_18;

	@OriginalMember(owner = "client!re", name = "qg", descriptor = "Lclient!kq;")
	public Class170 aClass170_19;

	@OriginalMember(owner = "client!re", name = "rg", descriptor = "Lclient!uf;")
	public Class145_Sub3 aClass145_Sub3_27;

	@OriginalMember(owner = "client!re", name = "sg", descriptor = "Lclient!uf;")
	public Class145_Sub3 aClass145_Sub3_28;

	@OriginalMember(owner = "client!re", name = "tg", descriptor = "Lclient!uf;")
	public Class145_Sub3 aClass145_Sub3_29;

	@OriginalMember(owner = "client!re", name = "ug", descriptor = "Lclient!uf;")
	public Class145_Sub3 aClass145_Sub3_30;

	@OriginalMember(owner = "client!re", name = "vg", descriptor = "I")
	private int anInt6731;

	@OriginalMember(owner = "client!re", name = "wg", descriptor = "Z")
	protected boolean aBoolean490;

	@OriginalMember(owner = "client!re", name = "ad", descriptor = "Lclient!bv;")
	private final Class37 aClass37_65 = new Class37();

	@OriginalMember(owner = "client!re", name = "Qd", descriptor = "Z")
	protected boolean aBoolean470 = true;

	@OriginalMember(owner = "client!re", name = "Td", descriptor = "Lclient!uw;")
	protected final Class118_Sub3 aClass118_Sub3_15 = new Class118_Sub3();

	@OriginalMember(owner = "client!re", name = "Xd", descriptor = "Lclient!uw;")
	public Class118_Sub3 aClass118_Sub3_16 = new Class118_Sub3();

	@OriginalMember(owner = "client!re", name = "Yd", descriptor = "Lclient!uw;")
	public final Class118_Sub3 aClass118_Sub3_17 = new Class118_Sub3();

	@OriginalMember(owner = "client!re", name = "Zd", descriptor = "Lclient!uw;")
	protected final Class118_Sub3 aClass118_Sub3_18 = new Class118_Sub3();

	@OriginalMember(owner = "client!re", name = "ae", descriptor = "Lclient!uw;")
	private final Class118_Sub3 aClass118_Sub3_19 = new Class118_Sub3();

	@OriginalMember(owner = "client!re", name = "be", descriptor = "Lclient!uw;")
	private final Class118_Sub3 aClass118_Sub3_20 = new Class118_Sub3();

	@OriginalMember(owner = "client!re", name = "de", descriptor = "I")
	public int anInt6691 = 0;

	@OriginalMember(owner = "client!re", name = "fe", descriptor = "F")
	private float aFloat123 = 3000.0F;

	@OriginalMember(owner = "client!re", name = "pe", descriptor = "[Lclient!sf;")
	private final Class42[] aClass42Array3 = new Class42[10];

	@OriginalMember(owner = "client!re", name = "ge", descriptor = "I")
	public int anInt6692 = -1;

	@OriginalMember(owner = "client!re", name = "oe", descriptor = "F")
	private float aFloat126 = 1.0F;

	@OriginalMember(owner = "client!re", name = "De", descriptor = "I")
	protected int anInt6705 = 0;

	@OriginalMember(owner = "client!re", name = "re", descriptor = "I")
	private int anInt6696 = 0;

	@OriginalMember(owner = "client!re", name = "ze", descriptor = "I")
	protected int anInt6703 = 0;

	@OriginalMember(owner = "client!re", name = "Te", descriptor = "I")
	protected int anInt6709 = 0;

	@OriginalMember(owner = "client!re", name = "Fe", descriptor = "I")
	public int anInt6706 = 512;

	@OriginalMember(owner = "client!re", name = "we", descriptor = "I")
	private int anInt6701 = 1;

	@OriginalMember(owner = "client!re", name = "Ne", descriptor = "Z")
	private boolean aBoolean477 = false;

	@OriginalMember(owner = "client!re", name = "ce", descriptor = "Lclient!jn;")
	protected Class155 aClass155_5 = Static119.aClass155_1;

	@OriginalMember(owner = "client!re", name = "Pe", descriptor = "Z")
	private boolean aBoolean479 = false;

	@OriginalMember(owner = "client!re", name = "me", descriptor = "F")
	public float aFloat125 = 3584.0F;

	@OriginalMember(owner = "client!re", name = "Be", descriptor = "I")
	private int anInt6704 = -1;

	@OriginalMember(owner = "client!re", name = "ke", descriptor = "I")
	private int anInt6695 = 0;

	@OriginalMember(owner = "client!re", name = "Se", descriptor = "F")
	public float aFloat130 = -1.0F;

	@OriginalMember(owner = "client!re", name = "ef", descriptor = "F")
	public float aFloat131 = 1.0F;

	@OriginalMember(owner = "client!re", name = "Ze", descriptor = "I")
	public int anInt6711 = 512;

	@OriginalMember(owner = "client!re", name = "hf", descriptor = "[F")
	private final float[] aFloatArray45 = new float[16];

	@OriginalMember(owner = "client!re", name = "Ye", descriptor = "Z")
	protected boolean aBoolean480 = true;

	@OriginalMember(owner = "client!re", name = "Oe", descriptor = "Z")
	protected boolean aBoolean478 = false;

	@OriginalMember(owner = "client!re", name = "he", descriptor = "I")
	protected int anInt6693 = -1;

	@OriginalMember(owner = "client!re", name = "Qe", descriptor = "I")
	private int anInt6708 = -1;

	@OriginalMember(owner = "client!re", name = "cf", descriptor = "I")
	public int anInt6713 = 0;

	@OriginalMember(owner = "client!re", name = "kf", descriptor = "I")
	private int anInt6715 = 0;

	@OriginalMember(owner = "client!re", name = "gf", descriptor = "I")
	public int anInt6714 = 3;

	@OriginalMember(owner = "client!re", name = "ye", descriptor = "I")
	public int anInt6702 = -1;

	@OriginalMember(owner = "client!re", name = "zf", descriptor = "Z")
	private boolean aBoolean487 = false;

	@OriginalMember(owner = "client!re", name = "Ff", descriptor = "I")
	protected final int anInt6723 = 0;

	@OriginalMember(owner = "client!re", name = "pf", descriptor = "[F")
	private final float[] aFloatArray47 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!re", name = "mf", descriptor = "Z")
	protected boolean aBoolean482 = true;

	@OriginalMember(owner = "client!re", name = "sf", descriptor = "[F")
	private final float[] aFloatArray48 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!re", name = "of", descriptor = "[F")
	private final float[] aFloatArray46 = new float[16];

	@OriginalMember(owner = "client!re", name = "nf", descriptor = "F")
	public float aFloat132 = 1.0F;

	@OriginalMember(owner = "client!re", name = "bf", descriptor = "F")
	public float bf = 1.0F;

	@OriginalMember(owner = "client!re", name = "qf", descriptor = "Z")
	protected boolean aBoolean483 = false;

	@OriginalMember(owner = "client!re", name = "Lf", descriptor = "I")
	protected final int anInt6725 = 0;

	@OriginalMember(owner = "client!re", name = "Ge", descriptor = "F")
	public float aFloat128 = 3584.0F;

	@OriginalMember(owner = "client!re", name = "xe", descriptor = "Z")
	private boolean aBoolean473 = false;

	@OriginalMember(owner = "client!re", name = "Ke", descriptor = "Z")
	protected boolean aBoolean475 = true;

	@OriginalMember(owner = "client!re", name = "jf", descriptor = "Z")
	protected boolean aBoolean481 = true;

	@OriginalMember(owner = "client!re", name = "He", descriptor = "[F")
	protected float[] aFloatArray44 = this.aFloatArray47;

	@OriginalMember(owner = "client!re", name = "vf", descriptor = "Z")
	private boolean aBoolean485 = false;

	@OriginalMember(owner = "client!re", name = "ve", descriptor = "I")
	public int anInt6700 = 8;

	@OriginalMember(owner = "client!re", name = "Bf", descriptor = "[F")
	public final float[] aFloatArray49 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!re", name = "Tf", descriptor = "Z")
	protected boolean aBoolean488 = false;

	@OriginalMember(owner = "client!re", name = "We", descriptor = "Lclient!dm;")
	protected Class68 aClass68_5 = Static505.aClass68_7;

	@OriginalMember(owner = "client!re", name = "lf", descriptor = "I")
	private int anInt6716 = 16777215;

	@OriginalMember(owner = "client!re", name = "Jf", descriptor = "F")
	public float aFloat136 = -1.0F;

	@OriginalMember(owner = "client!re", name = "Sf", descriptor = "I")
	public int anInt6729 = 128;

	@OriginalMember(owner = "client!re", name = "xf", descriptor = "I")
	public int anInt6718 = 0;

	@OriginalMember(owner = "client!re", name = "rf", descriptor = "Z")
	protected boolean aBoolean484 = true;

	@OriginalMember(owner = "client!re", name = "Nf", descriptor = "[F")
	private final float[] aFloatArray50 = new float[16];

	@OriginalMember(owner = "client!re", name = "Xf", descriptor = "I")
	protected int anInt6730 = 0;

	@OriginalMember(owner = "client!re", name = "Uf", descriptor = "[F")
	private final float[] aFloatArray51 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!re", name = "yf", descriptor = "I")
	protected int anInt6719 = 3584;

	@OriginalMember(owner = "client!re", name = "Rf", descriptor = "I")
	public int anInt6728 = 50;

	@OriginalMember(owner = "client!re", name = "Vf", descriptor = "Z")
	protected boolean aBoolean489 = false;

	@OriginalMember(owner = "client!re", name = "Pf", descriptor = "I")
	protected int anInt6727 = 0;

	@OriginalMember(owner = "client!re", name = "ag", descriptor = "F")
	public float aFloat139 = 1.0F;

	@OriginalMember(owner = "client!re", name = "Yf", descriptor = "[F")
	public final float[] aFloatArray52 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!re", name = "Of", descriptor = "I")
	private int anInt6726 = 0;

	@OriginalMember(owner = "client!re", name = "Je", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream5 = new Stream();

	@OriginalMember(owner = "client!re", name = "hg", descriptor = "Lclient!uw;")
	private final Class118_Sub3 aClass118_Sub3_21 = new Class118_Sub3();

	@OriginalMember(owner = "client!re", name = "uf", descriptor = "I")
	protected final int anInt6717;

	@OriginalMember(owner = "client!re", name = "K", descriptor = "Ljava/lang/Object;")
	protected final Object anObject14;

	@OriginalMember(owner = "client!re", name = "Ad", descriptor = "Ljava/lang/Object;")
	private Object anObject15;

	@OriginalMember(owner = "client!re", name = "Ib", descriptor = "Lclient!kr;")
	protected final Class171 aClass171_110;

	@OriginalMember(owner = "client!re", name = "xd", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas11;

	@OriginalMember(owner = "client!re", name = "Ld", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!re", name = "sb", descriptor = "I")
	private int anInt6565;

	@OriginalMember(owner = "client!re", name = "cd", descriptor = "I")
	public int anInt6649;

	@OriginalMember(owner = "client!re", name = "Af", descriptor = "I")
	public final int anInt6720;

	@OriginalMember(owner = "client!re", name = "gb", descriptor = "I")
	private int anInt6555;

	@OriginalMember(owner = "client!re", name = "yc", descriptor = "I")
	public int anInt6621;

	@OriginalMember(owner = "client!re", name = "Wf", descriptor = "Lclient!ag;")
	private final Class9 aClass9_3;

	@OriginalMember(owner = "client!re", name = "Qc", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!n;Lclient!kr;II)V")
	protected Class122_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) Class171 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.anInt6717 = arg4;
		this.anObject15 = this.anObject14 = arg1;
		this.aClass171_110 = arg3;
		this.aCanvas12 = this.aCanvas11 = arg0;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt6649 = this.anInt6565 = local307.height;
		this.anInt6720 = arg5;
		this.anInt6621 = this.anInt6555 = local307.width;
		Static20.method500(true, false);
		this.aClass9_3 = new Class9(this, super.anInterface8_14);
		this.aNativeInterface3 = new NativeInterface(super.anInterface8_14.method881(), this.anInt6720);
		for (@Pc(349) int local349 = 0; super.anInterface8_14.method881() > local349; local349++) {
			@Pc(357) Class220 local357 = super.anInterface8_14.method878(local349);
			if (local357 != null) {
				this.aNativeInterface3.initTextureMetrics(local349, local357.aByte81, local357.aByte84);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(I)V")
	private void method5549() {
		this.anInterface5_11 = this.method5671(true);
		this.anInterface5_11.method5727(24, 12);
		this.aClass170_18 = this.method5674(new Class293[] { new Class293(Static160.aClass107_1) });
	}

	@OriginalMember(owner = "client!re", name = "i", descriptor = "(I)V")
	private void method5550() {
		this.aBoolean473 = false;
		if (this.aClass68_5 == Static227.aClass68_4) {
			this.method5554();
			this.method5560();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V")
	public final void method5551(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean478) {
			this.aBoolean478 = arg0;
			this.method5600();
			this.anInt6722 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!re", name = "j", descriptor = "(I)V")
	protected abstract void method5552();

	@OriginalMember(owner = "client!re", name = "E", descriptor = "(III)V")
	@Override
	public final void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6692 == arg0 && arg1 == this.anInt6702 && this.anInt6691 == arg2) {
			return;
		}
		this.anInt6702 = arg1;
		this.anInt6691 = arg2;
		this.anInt6692 = arg0;
		if (this.aBoolean474) {
			return;
		}
		this.method5632();
		this.method5615();
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
	@Override
	public void method7234(@OriginalArg(0) int arg0) {
		this.aClass9_3.method387();
		this.anInt6721 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!pe;[Lclient!ig;Z)Lclient!ra;")
	@Override
	public final Class67 method7270(@OriginalArg(0) Class232 arg0, @OriginalArg(1) Class136[] arg1) {
		return new Class67_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!re", name = "k", descriptor = "(I)Lclient!uw;")
	public final Class118_Sub3 method5553() {
		return this.aClass118_Sub3Array3[this.anInt6727];
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(Z)V")
	private void method5554() {
		if (this.aBoolean473) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray45;
		this.aBoolean473 = true;
		if (this.anInt6621 != 0 && this.anInt6649 != 0) {
			local5[4] = 0.0F;
			local5[14] = 0.5F;
			local5[9] = 0.0F;
			local5[3] = 0.0F;
			local5[8] = 0.0F;
			local5[1] = 0.0F;
			local5[7] = 0.0F;
			local5[15] = 1.0F;
			local5[2] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt6649;
			local5[13] = 1.0F;
			local5[12] = -1.0F;
			local5[11] = 0.0F;
			local5[0] = 2.0F / (float) this.anInt6621;
			local5[6] = 0.0F;
			local5[10] = 0.5F;
			return;
		}
		local5[10] = 1.0F;
		local5[0] = 1.0F;
		local5[13] = 0.0F;
		local5[9] = 0.0F;
		local5[8] = 0.0F;
		local5[12] = 0.0F;
		local5[5] = 1.0F;
		local5[4] = 0.0F;
		local5[14] = 0.0F;
		local5[7] = 0.0F;
		local5[11] = 0.0F;
		local5[3] = 0.0F;
		local5[15] = 1.0F;
		local5[2] = 0.0F;
		local5[6] = 0.0F;
		local5[1] = 0.0F;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method5555(@OriginalArg(1) Buffer arg0) {
		this.aStream5.a(arg0);
		return this.aStream5;
	}

	@OriginalMember(owner = "client!re", name = "l", descriptor = "(I)V")
	protected abstract void method5556();

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
	private void method5557() {
		if (Static182.aClass68_1 == this.aClass68_5) {
			return;
		}
		@Pc(6) Class68 local6 = this.aClass68_5;
		this.aClass68_5 = Static182.aClass68_1;
		if (!local6.method1636()) {
			this.method5653();
		}
		this.method5635();
		this.aFloatArray44 = this.aFloatArray46;
		this.method5560();
		this.anInt6722 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!re", name = "m", descriptor = "(I)V")
	protected abstract void method5558();

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)Lclient!uw;")
	public final Class118_Sub3 method5559() {
		return this.aClass118_Sub3_19;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "()I")
	@Override
	public final int method7217() {
		return this.anInt6712 - 2;
	}

	@OriginalMember(owner = "client!re", name = "n", descriptor = "(I)V")
	private void method5560() {
		this.method5636();
		if (this.aClass42_3 != null) {
			this.aClass42_3.method6436();
		}
	}

	@OriginalMember(owner = "client!re", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public final boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass118_Sub3_16.method6986((float) arg1, (float) arg0, (float) arg2);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass118_Sub3_16.method6986((float) arg4, (float) arg3, (float) arg5);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if ((float) this.anInt6728 > local14 && (float) this.anInt6728 > local31 || !(!((float) this.anInt6719 < local14) || !(local31 > (float) this.anInt6719))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt6711 * this.aClass118_Sub3_16.method6983((float) arg2, (float) arg0, (float) arg1) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt6711 * this.aClass118_Sub3_16.method6983((float) arg5, (float) arg3, (float) arg4) / local31);
		if (this.aFloat124 > (float) local81 && this.aFloat124 > (float) local99 || this.aFloat133 < (float) local81 && (float) local99 > this.aFloat133) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt6706 * this.aClass118_Sub3_16.method6968((float) arg0, (float) arg2, (float) arg1) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt6706 * this.aClass118_Sub3_16.method6968((float) arg3, (float) arg5, (float) arg4) / local31);
			return (!((float) local143 < this.aFloat134) || !((float) local161 < this.aFloat134)) && (!((float) local143 > this.aFloat138) || !(this.aFloat138 < (float) local161));
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7226(@OriginalArg(0) Canvas arg0) {
		this.aCanvas12 = null;
		this.anObject15 = null;
		if (arg0 == null || arg0 == this.aCanvas11) {
			this.aCanvas12 = this.aCanvas11;
			this.anObject15 = this.anObject14;
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.anObject15 = this.aHashtable6.get(arg0);
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.anObject15 == null) {
			throw new RuntimeException();
		}
		this.method5566(this.aCanvas12, this.anObject15);
		this.method5582();
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V")
	public final void method5561(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method5605(Static486.aClass271_5, Static486.aClass271_5);
		} else if (arg0 == 0) {
			this.method5605(Static449.aClass271_4, Static449.aClass271_4);
		} else if (arg0 == 2) {
			this.method5605(Static343.aClass271_2, Static486.aClass271_5);
		} else if (arg0 == 3) {
			this.method5605(Static39.aClass271_1, Static449.aClass271_4);
		} else if (arg0 == 4) {
			this.method5605(Static433.aClass271_3, Static433.aClass271_3);
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7274(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas11 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.method5589(this.aHashtable6.get(arg0), arg0);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IIII)V")
	@Override
	public final void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6713 = arg0;
		this.anInt6711 = arg2;
		this.anInt6706 = arg3;
		this.anInt6718 = arg1;
		this.method5646();
		this.method5664();
		this.method5568();
		this.method5609();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!uw;)V")
	public final void method5562(@OriginalArg(1) Class118_Sub3 arg0) {
		this.aClass118_Sub3_15.EA(arg0);
		this.aBoolean470 = false;
		this.method5667();
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	@Override
	public final void method7211(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!re", name = "F", descriptor = "(IIII)V")
	@Override
	public final void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6705 > arg2) {
			this.anInt6705 = arg2;
		}
		if (this.anInt6730 > arg3) {
			this.anInt6730 = arg3;
		}
		if (arg0 > this.anInt6709) {
			this.anInt6709 = arg0;
		}
		if (arg1 > this.anInt6703) {
			this.anInt6703 = arg1;
		}
		if (this.anInt6709 <= 0 && this.anInt6621 <= this.anInt6705 && this.anInt6703 <= 0 && this.anInt6730 >= this.anInt6649) {
			this.n();
			return;
		}
		if (!this.aBoolean490) {
			this.aBoolean490 = true;
			this.method5682();
		}
		this.method5564();
		this.method5609();
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
	protected abstract void method5564();

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(B)I")
	public final int method5565() {
		return this.anInt6698;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
	protected abstract void method5566(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!re", name = "M", descriptor = "(F)V")
	@Override
	public final void M(@OriginalArg(0) float arg0) {
		if (this.aFloat131 != arg0) {
			this.aFloat131 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method5596();
			this.method5640();
		}
	}

	@OriginalMember(owner = "client!re", name = "n", descriptor = "()V")
	@Override
	public final void n() {
		if (this.aBoolean490) {
			this.aBoolean490 = false;
			this.method5682();
		}
		this.anInt6705 = this.anInt6621;
		this.anInt6730 = this.anInt6649;
		this.anInt6703 = 0;
		this.anInt6709 = 0;
		this.method5609();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[FZLclient!uda;II)Lclient!gq;")
	public final Interface3 method5567(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class292 arg3, @OriginalArg(5) int arg4) {
		return this.method5673(arg2, arg1, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!r;Lclient!kw;Lclient!m;Lclient!eca;I)V")
	@Override
	public final void method7246(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class72_Sub2 arg3) {
		arg0.method6686(arg2, arg3, 0);
		this.method7251(arg1);
	}

	@OriginalMember(owner = "client!re", name = "o", descriptor = "(I)V")
	public final void method5568() {
		if (Static505.aClass68_7 == this.aClass68_5) {
			return;
		}
		@Pc(6) Class68 local6 = this.aClass68_5;
		this.aClass68_5 = Static505.aClass68_7;
		if (local6.method1636()) {
			this.method5653();
		}
		this.aFloatArray44 = this.aFloatArray47;
		this.anInt6722 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!re", name = "ta", descriptor = "(II)V")
	@Override
	public final void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6728 == arg0 && arg1 == this.anInt6719) {
			return;
		}
		this.anInt6728 = arg0;
		this.anInt6719 = arg1;
		this.method5664();
		this.method5646();
		this.method5632();
	}

	@OriginalMember(owner = "client!re", name = "p", descriptor = "(I)V")
	protected abstract void method5569();

	@OriginalMember(owner = "client!re", name = "g", descriptor = "()Z")
	@Override
	public final boolean method7228() {
		return true;
	}

	@OriginalMember(owner = "client!re", name = "w", descriptor = "()F")
	public final float method5570() {
		return this.aFloat123;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIZIIB)V")
	private void method5571(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) boolean local4 = arg2 & this.method7221();
		if (!local4 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			arg4 = 2;
			arg1 = 1;
			arg3 = 0;
		}
		if (arg4 != 0 && arg0) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (arg4 != this.anInt6696) {
			if (this.anInt6696 != 0) {
				this.aClass42Array3[Integer.MAX_VALUE & this.anInt6696].method6424();
			}
			if (arg4 == 0) {
				this.aClass42_3 = null;
			} else {
				this.aClass42_3 = this.aClass42Array3[arg4 & Integer.MAX_VALUE];
				this.aClass42_3.method6429(arg0);
				this.aClass42_3.method6432(arg0);
				this.aClass42_3.method6431(arg1, arg3);
			}
			this.anInt6696 = arg4;
			this.anInt6695 = arg1;
			this.anInt6715 = arg3;
		} else if (this.anInt6696 != 0) {
			this.aClass42Array3[this.anInt6696 & Integer.MAX_VALUE].method6432(arg0);
			if (arg3 != this.anInt6715 || this.anInt6695 != arg1) {
				this.aClass42Array3[this.anInt6696 & Integer.MAX_VALUE].method6431(arg1, arg3);
				this.anInt6715 = arg3;
				this.anInt6695 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(ZI)V")
	public abstract void method5572(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!re", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt6716 != arg0;
		if (local15 || this.aFloat136 != arg1 || this.aFloat130 != arg2) {
			this.aFloat130 = arg2;
			this.aFloat136 = arg1;
			this.anInt6716 = arg0;
			if (local15) {
				this.aFloat132 = (float) (this.anInt6716 & 0xFF) / 255.0F;
				this.bf = (float) (this.anInt6716 & 0xFF0000) / 1.671168E7F;
				this.aFloat139 = (float) (this.anInt6716 & 0xFF00) / 65280.0F;
				this.method5596();
			}
			this.aNativeInterface3.setSunColour(this.bf, this.aFloat139, this.aFloat132, arg1, arg2);
			this.method5599();
		}
		if (arg3 != this.aFloatArray51[0] || this.aFloatArray51[1] != arg4 || arg5 != this.aFloatArray51[2]) {
			this.aFloatArray51[1] = arg4;
			this.aFloatArray51[0] = arg3;
			this.aFloatArray51[2] = arg5;
			this.aFloatArray48[1] = -arg4;
			this.aFloatArray48[2] = -arg5;
			this.aFloatArray48[0] = -arg3;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray49[0] = arg3 * local153;
			this.aFloatArray49[1] = local153 * arg4;
			this.aFloatArray49[2] = local153 * arg5;
			this.aFloatArray52[2] = -this.aFloatArray49[2];
			this.aFloatArray52[1] = -this.aFloatArray49[1];
			this.aFloatArray52[0] = -this.aFloatArray49[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray49[0], this.aFloatArray49[1], this.aFloatArray49[2]);
			this.method5647();
			this.anInt6697 = (int) (arg3 * 256.0F / arg4);
			this.anInt6710 = (int) (arg5 * 256.0F / arg4);
		}
		this.method5640();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!kq;I)V")
	public abstract void method5573(@OriginalArg(0) Class170 arg0);

	@OriginalMember(owner = "client!re", name = "q", descriptor = "(IIII)V")
	@Override
	public final void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6704 = arg2;
		this.anInt6726 = arg3;
		this.anInt6693 = arg1;
		this.aBoolean474 = true;
		this.anInt6698 = arg0;
		this.method5571(false, 0, false, 0, 3);
		if (this.aClass42_3 != null) {
			this.aClass42_3.method6434();
		}
		this.method5632();
		this.method5615();
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method5672();
		this.method5591();
		this.method5634(arg4);
		this.method5575(0, Static312.aClass181_4);
		this.method5585(Static312.aClass181_4, 0);
		this.method5650(arg5);
		this.aClass118_Sub3_15.method6977((float) (arg3 - 1), (float) (arg2 - 1), 1.0F);
		this.aClass118_Sub3_15.method6985((float) arg1 - local7, (float) arg0 - local7, 0.0F);
		this.method5638();
		this.method5572(false);
		this.method5620(Static287.aClass22_3, 4);
		this.method5572(true);
		this.method5585(Static162.aClass181_2, 0);
		this.method5575(0, Static162.aClass181_2);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IIIIII)Lclient!rn;")
	@Override
	public final Class45 method7227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class45_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!re", name = "q", descriptor = "(I)Lclient!uw;")
	public final Class118_Sub3 method5574() {
		return this.aClass118_Sub3Array3[this.anInt6727];
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZILclient!lg;)V")
	public final void method5575(@OriginalArg(1) int arg0, @OriginalArg(2) Class181 arg1) {
		this.method5678(arg1, false, false, arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ig;Z)Lclient!ha;")
	@Override
	public final Class2 method7220(@OriginalArg(0) Class136 arg0) {
		@Pc(128) Class2 local128;
		if (arg0.anInt4055 == 0 || arg0.anInt4054 == 0) {
			local128 = this.method7268(new int[1], 1, 1, 1);
		} else {
			@Pc(21) int[] local21 = new int[arg0.anInt4054 * arg0.anInt4055];
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg0.aByteArray53 == null) {
				for (local30 = 0; local30 < arg0.anInt4054; local30++) {
					for (local34 = 0; local34 < arg0.anInt4055; local34++) {
						@Pc(92) int local92 = arg0.anIntArray344[arg0.aByteArray52[local23++] & 0xFF];
						local21[local25++] = local92 == 0 ? 0 : local92 | 0xFF000000;
					}
				}
			} else {
				for (local30 = 0; local30 < arg0.anInt4054; local30++) {
					for (local34 = 0; local34 < arg0.anInt4055; local34++) {
						local21[local25++] = arg0.anIntArray344[arg0.aByteArray52[local23] & 0xFF] | arg0.aByteArray53[local23] << 24;
						local23++;
					}
				}
			}
			local128 = this.method7268(local21, arg0.anInt4055, arg0.anInt4055, arg0.anInt4054);
		}
		local128.KA(arg0.anInt4052, arg0.anInt4053, arg0.anInt4051, arg0.anInt4050);
		return local128;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(II)Lclient!bd;")
	public final Interface1 method5576(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface1_5.method5726()) {
			this.anInterface1_5.method5227(arg0);
		}
		return this.anInterface1_5;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(II)Lclient!sf;")
	protected Class42 method5577(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class42_Sub1(this);
		} else if (arg0 == 1) {
			return new Class42_Sub6(this);
		} else if (arg0 == 2) {
			return new Class42_Sub3(this, this.aClass241_6);
		} else if (arg0 == 7) {
			return new Class42_Sub9(this);
		} else {
			return new Class42_Sub8(this);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method5578(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(B)V")
	private void method5579() {
		if (this.aBoolean479) {
			return;
		}
		@Pc(11) float[] local11 = this.aFloatArray50;
		@Pc(23) float local23 = (float) (this.anInt6728 * -this.anInt6713) / (float) this.anInt6711;
		@Pc(38) float local38 = (float) ((this.anInt6621 - this.anInt6713) * this.anInt6728) / (float) this.anInt6711;
		@Pc(49) float local49 = (float) (this.anInt6728 * this.anInt6718) / (float) this.anInt6706;
		@Pc(64) float local64 = (float) ((this.anInt6718 - this.anInt6649) * this.anInt6728) / (float) this.anInt6706;
		if (local38 == local23 || local49 == local64) {
			local11[6] = 0.0F;
			local11[5] = 1.0F;
			local11[14] = 0.0F;
			local11[13] = 0.0F;
			local11[1] = 0.0F;
			local11[15] = 1.0F;
			local11[2] = 0.0F;
			local11[9] = 0.0F;
			local11[11] = 0.0F;
			local11[4] = 0.0F;
			local11[8] = 0.0F;
			local11[12] = 0.0F;
			local11[0] = 1.0F;
			local11[7] = 0.0F;
			local11[10] = 1.0F;
			local11[3] = 0.0F;
		} else {
			@Pc(78) float local78 = (float) this.anInt6728 * 2.0F;
			local11[11] = -1.0F;
			local11[1] = 0.0F;
			local11[7] = 0.0F;
			local11[5] = local78 / (local49 - local64);
			local11[12] = 0.0F;
			local11[15] = 0.0F;
			local11[9] = (local64 + local49) / (-local64 + local49);
			local11[14] = this.aFloat122 = (float) (this.anInt6728 * this.anInt6719) / (float) (this.anInt6728 - this.anInt6719);
			local11[4] = 0.0F;
			local11[10] = this.aFloat129 = (float) this.anInt6719 / (float) (this.anInt6728 - this.anInt6719);
			local11[6] = 0.0F;
			local11[8] = (local23 + local38) / (local38 - local23);
			local11[3] = 0.0F;
			local11[2] = 0.0F;
			local11[13] = 0.0F;
			local11[0] = local78 / (local38 - local23);
		}
		this.method5681();
		this.aBoolean479 = true;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!eca;I)V")
	@Override
	public final void method7257(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) Class72_Sub2[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method6686(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(Z)V")
	private void method5580() {
		this.method5637();
		if (this.aClass42_3 != null) {
			this.aClass42_3.method6435();
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IZ)V")
	public final void method5581(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean482) {
			this.aBoolean482 = arg0;
			this.method5615();
		}
	}

	@OriginalMember(owner = "client!re", name = "r", descriptor = "(I)V")
	private void method5582() {
		if (this.aCanvas12 == null) {
			this.anInt6555 = this.anInt6565 = 1;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas12.getSize();
			this.anInt6555 = local10.width;
			this.anInt6565 = local10.height;
		}
		this.anInt6621 = this.anInt6555;
		this.anInt6649 = this.anInt6565;
		this.method5550();
		this.method5664();
		this.method5646();
		this.method5623();
		this.method5609();
		this.method5568();
		this.n();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!kw;)V")
	@Override
	public final void method7251(@OriginalArg(0) Class175 arg0) {
		this.aClass83_3.method1973(this, arg0);
	}

	@OriginalMember(owner = "client!re", name = "s", descriptor = "(I)V")
	public final void method5583() {
		this.method5568();
		this.method5560();
	}

	@OriginalMember(owner = "client!re", name = "t", descriptor = "(I)V")
	protected abstract void method5584();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!lg;II)V")
	public final void method5585(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1) {
		this.method5659(arg1, arg0);
	}

	@OriginalMember(owner = "client!re", name = "s", descriptor = "()Lclient!m;")
	@Override
	public final Class118 method7256() {
		return this.aClass118_Sub3_21;
	}

	@OriginalMember(owner = "client!re", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7254() {
		return true;
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(B)V")
	protected void method5586() {
		this.anInt6724 = this.anInt6694;
		this.anInt6694 = 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public final void method7229(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aNativeHeap4 = ((Class1_Sub8_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer8 = this.aNativeHeap4.a(32768, false);
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "([I)V")
	@Override
	public final void d(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6703;
		arg0[2] = this.anInt6705;
		arg0[3] = this.anInt6730;
		arg0[0] = this.anInt6709;
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(B)V")
	protected abstract void method5587();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([BBIIILclient!uda;)Lclient!nf;")
	public abstract Interface9 method5588(@OriginalArg(0) byte[] arg0, @OriginalArg(5) Class292 arg1);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method5589(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!re", name = "i", descriptor = "(B)V")
	protected final void method5590() {
		@Pc(15) Hashtable local15 = new Hashtable();
		if (this.aHashtable6 != null && !this.aHashtable6.isEmpty()) {
			@Pc(26) Enumeration local26 = this.aHashtable6.keys();
			while (local26.hasMoreElements()) {
				@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
				local15.put(local32, this.method5578(local32));
			}
		}
		this.aHashtable6 = local15;
		this.method5676();
		this.method5549();
		this.aClass83_3.method1972(this);
	}

	@OriginalMember(owner = "client!re", name = "u", descriptor = "(I)V")
	private void method5591() {
		if (this.anInt6722 == 1) {
			return;
		}
		this.method5668();
		this.method5611(false);
		this.method5633(false);
		this.method5624(false);
		this.method5551(false);
		this.method5622(false, false, -2);
		this.method5561(1);
		this.method5651(this.anInterface15_3);
		this.anInt6722 = 1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method7252() {
	}

	@OriginalMember(owner = "client!re", name = "j", descriptor = "(B)I")
	public final int method5592() {
		return this.anInt6704;
	}

	@OriginalMember(owner = "client!re", name = "v", descriptor = "(I)V")
	protected abstract void method5593();

	@OriginalMember(owner = "client!re", name = "l", descriptor = "()Z")
	@Override
	public final boolean method7244() {
		return false;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method5594(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap4.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!re", name = "w", descriptor = "(I)V")
	private void method5595() {
		this.method5573(this.aClass170_18);
		this.method5665(this.anInterface5_11, 0);
		this.method5642(Static389.aClass22_5, 0, 1);
	}

	@OriginalMember(owner = "client!re", name = "ba", descriptor = "()I")
	@Override
	public final int ba() {
		return this.anInt6731;
	}

	@OriginalMember(owner = "client!re", name = "x", descriptor = "(I)V")
	protected abstract void method5596();

	@OriginalMember(owner = "client!re", name = "k", descriptor = "(B)Lclient!uw;")
	public final Class118_Sub3 method5597() {
		if (!this.aBoolean487) {
			this.aClass118_Sub3_20.method6974(this.aClass118_Sub3_18, this.aClass118_Sub3_15);
			this.aBoolean487 = true;
		}
		return this.aClass118_Sub3_20;
	}

	@OriginalMember(owner = "client!re", name = "y", descriptor = "(I)V")
	public final void method5598() {
		if (this.anInt6722 == 16) {
			return;
		}
		this.method5557();
		this.method5611(true);
		this.method5624(true);
		this.method5551(true);
		this.method5650(1);
		this.anInt6722 = 16;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public final Class205 method7219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class205_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!re", name = "z", descriptor = "(I)V")
	protected abstract void method5599();

	@OriginalMember(owner = "client!re", name = "A", descriptor = "(I)V")
	protected abstract void method5600();

	@OriginalMember(owner = "client!re", name = "B", descriptor = "(I)V")
	protected abstract void method5601();

	@OriginalMember(owner = "client!re", name = "C", descriptor = "(I)V")
	private void method5602() {
		this.aFloat125 = (float) this.anInt6719 - this.aFloat127;
	}

	@OriginalMember(owner = "client!re", name = "D", descriptor = "(I)V")
	protected abstract void method5603();

	@OriginalMember(owner = "client!re", name = "E", descriptor = "(I)V")
	protected abstract void method5604();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!sm;ILclient!sm;)V")
	public final void method5605(@OriginalArg(0) Class271 arg0, @OriginalArg(2) Class271 arg1) {
		@Pc(13) boolean local13 = false;
		if (arg0 != this.aClass271Array5[this.anInt6727]) {
			this.aClass271Array5[this.anInt6727] = arg0;
			local13 = true;
			this.method5601();
		}
		if (this.aClass271Array6[this.anInt6727] != arg1) {
			this.aClass271Array6[this.anInt6727] = arg1;
			local13 = true;
			this.method5627();
		}
		if (local13) {
			this.anInt6722 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!re", name = "F", descriptor = "(I)V")
	public final void method5606() {
		this.method5620(Static137.aClass22_1, 2);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method7237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		@Pc(30) float local30 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local10 * local10)));
		@Pc(34) float local34 = local17 * local30;
		@Pc(38) float local38 = local10 * local30;
		if (!this.method5643((float) arg3 + local34, (float) arg2 + local38, (float) arg1, 0.0F, (float) arg0, 0.0F)) {
			return;
		}
		this.method5591();
		this.method5634(arg4);
		this.method5575(0, Static312.aClass181_4);
		this.method5585(Static312.aClass181_4, 0);
		this.method5650(arg5);
		this.method5629();
		this.method5572(false);
		this.method5595();
		this.method5572(true);
		this.method5585(Static162.aClass181_2, 0);
		this.method5575(0, Static162.aClass181_2);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!sb;Lclient!uda;III)Lclient!gq;")
	public abstract Interface3 method5607(@OriginalArg(0) Class264 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!re", name = "G", descriptor = "(I)V")
	protected abstract void method5608();

	@OriginalMember(owner = "client!re", name = "H", descriptor = "(I)V")
	private void method5609() {
		this.aFloat138 = this.anInt6730 - this.anInt6718;
		this.aFloat133 = this.anInt6705 - this.anInt6713;
		this.aFloat124 = this.anInt6709 - this.anInt6713;
		this.aFloat134 = this.anInt6703 - this.anInt6718;
	}

	@OriginalMember(owner = "client!re", name = "N", descriptor = "(IIII)V")
	@Override
	public final void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6703 = arg1 >= 0 ? arg1 : 0;
		this.anInt6705 = arg2 > this.anInt6621 ? 0 : arg2;
		this.anInt6730 = this.anInt6621 < arg3 ? 0 : arg3;
		this.anInt6709 = arg0 >= 0 ? arg0 : 0;
		if (this.anInt6709 <= 0 && this.anInt6621 <= this.anInt6705 && this.anInt6703 <= 0 && this.anInt6730 >= this.anInt6649) {
			this.n();
			return;
		}
		if (!this.aBoolean490) {
			this.aBoolean490 = true;
			this.method5682();
		}
		this.method5564();
		this.method5609();
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7237(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!re", name = "E", descriptor = "()F")
	public final float method5610() {
		return this.aFloat127;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(IZ)V")
	public final void method5611(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean471) {
			this.aBoolean471 = arg0;
			this.method5615();
			this.anInt6722 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!gn;)V")
	public final void method5612(@OriginalArg(1) Class110 arg0) {
		this.aClass110Array3[this.anInt6727] = arg0;
		this.method5580();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IF)V")
	public final void method5613(@OriginalArg(1) float arg0) {
		if (this.aFloat126 != arg0) {
			this.aFloat126 = arg0;
			this.method5646();
		}
	}

	@OriginalMember(owner = "client!re", name = "I", descriptor = "(I)V")
	public final void method5614() {
		if (this.aClass110Array3[this.anInt6727] != Static275.aClass110_5) {
			this.aClass110Array3[this.anInt6727] = Static275.aClass110_5;
			this.aClass118_Sub3Array3[this.anInt6727].ha();
			this.method5580();
		}
	}

	@OriginalMember(owner = "client!re", name = "p", descriptor = "()Z")
	@Override
	public final boolean method7248() {
		return true;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!rn;)V")
	@Override
	public final void method7230(@OriginalArg(0) Class45 arg0) {
		this.aClass45_Sub1_3 = (Class45_Sub1) arg0;
	}

	@OriginalMember(owner = "client!re", name = "J", descriptor = "(I)V")
	protected abstract void method5615();

	@OriginalMember(owner = "client!re", name = "K", descriptor = "(I)V")
	public final void method5616() {
		if (this.anInt6722 == 4) {
			return;
		}
		this.method5668();
		this.method5611(false);
		this.method5633(false);
		this.method5624(false);
		this.method5551(false);
		this.method5622(false, false, -2);
		this.method5650(1);
		this.method5561(0);
		this.anInt6722 = 4;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!sb;Lclient!uda;I)Z")
	public abstract boolean method5618(@OriginalArg(0) Class264 arg0, @OriginalArg(1) Class292 arg1);

	@OriginalMember(owner = "client!re", name = "M", descriptor = "(I)V")
	public final void method5619() {
		this.anInterface15Array3 = new Interface15[this.anInt6699];
		this.aClass271Array6 = new Class271[this.anInt6699];
		this.aClass271Array5 = new Class271[this.anInt6699];
		this.aClass110Array3 = new Class110[this.anInt6699];
		this.aClass118_Sub3Array3 = new Class118_Sub3[this.anInt6699];
		for (@Pc(32) int local32 = 0; local32 < this.anInt6699; local32++) {
			this.aClass271Array6[local32] = Static449.aClass271_4;
			this.aClass271Array5[local32] = Static449.aClass271_4;
			this.aClass110Array3[local32] = Static275.aClass110_5;
			this.aClass118_Sub3Array3[local32] = new Class118_Sub3();
		}
		this.aClass1_Sub2Array5 = new Class1_Sub2[this.anInt6712 - 2];
		this.anInterface15_3 = this.method5607(Static431.aClass264_15, Static542.aClass292_17, 1, 1);
		this.method7229(new Class1_Sub8_Sub2(262144));
		this.aClass170_14 = this.method5674(new Class293[] { new Class293(new Class107[] { Static160.aClass107_1, Static160.aClass107_5 }) });
		this.aClass170_16 = this.method5674(new Class293[] { new Class293(new Class107[] { Static160.aClass107_1, Static160.aClass107_3 }) });
		this.aClass170_15 = this.method5674(new Class293[] { new Class293(Static160.aClass107_1), new Class293(Static160.aClass107_3), new Class293(Static160.aClass107_5), new Class293(Static160.aClass107_2) });
		this.aClass170_19 = this.method5674(new Class293[] { new Class293(Static160.aClass107_1), new Class293(Static160.aClass107_3), new Class293(Static160.aClass107_5) });
		this.aClass145_Sub3_24 = new Class145_Sub3(this, 0, 0, false, false);
		this.aClass145_Sub3_27 = new Class145_Sub3(this, 0, 0, true, true);
		this.aClass145_Sub3_30 = new Class145_Sub3(this, 0, 0, false, false);
		this.aClass145_Sub3_26 = new Class145_Sub3(this, 0, 0, true, true);
		this.aClass145_Sub3_22 = new Class145_Sub3(this, 0, 0, false, false);
		this.aClass145_Sub3_28 = new Class145_Sub3(this, 0, 0, true, true);
		this.aClass145_Sub3_25 = new Class145_Sub3(this, 0, 0, false, false);
		this.aClass145_Sub3_29 = new Class145_Sub3(this, 0, 0, true, true);
		this.aClass145_Sub3_21 = new Class145_Sub3(this, 0, 0, false, false);
		this.aClass145_Sub3_23 = new Class145_Sub3(this, 0, 0, true, true);
		this.aClass83_3 = new Class83(this);
		this.anInterface1_5 = this.method5660(true);
		this.method5590();
		this.aClass241_6 = new Class241(this);
		this.aClass42Array3[1] = this.method5577(1);
		this.aClass42Array3[2] = this.method5577(2);
		this.aClass42Array3[4] = this.method5577(4);
		this.aClass42Array3[5] = this.method5577(5);
		this.aClass42Array3[6] = this.method5577(6);
		this.aClass42Array3[7] = this.method5577(7);
		this.aClass42Array3[3] = this.method5577(3);
		this.aClass42Array3[8] = this.method5577(8);
		this.aClass42Array3[9] = this.method5577(9);
		if (!this.aClass42Array3[2].method6433()) {
			this.aClass42Array3[2] = this.method5577(0);
		}
		if (!this.aClass42Array3[4].method6433()) {
			this.aClass42Array3[4] = this.aClass42Array3[2];
		}
		if (!this.aClass42Array3[8].method6433()) {
			this.aClass42Array3[8] = this.aClass42Array3[4];
		}
		if (!this.aClass42Array3[9].method6433()) {
			this.aClass42Array3[9] = this.aClass42Array3[8];
		}
		this.method5641();
		this.n();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!be;IZ)V")
	private void method5620(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		this.method5573(this.aClass170_17);
		this.method5665(this.anInterface5_12, 0);
		this.method5642(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!re", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt6690 + this.anInt6689 + this.anInt6686;
	}

	@OriginalMember(owner = "client!re", name = "x", descriptor = "()Z")
	@Override
	public final boolean method7267() {
		return true;
	}

	@OriginalMember(owner = "client!re", name = "N", descriptor = "(I)V")
	protected final void method5621() {
		@Pc(9) Enumeration local9 = this.aHashtable6.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method5589(this.aHashtable6.get(local15), local15);
		}
		this.anInterface5_12.method5728();
		this.anInterface5_11.method5728();
		this.aClass145_Sub3_27.method6690();
		this.aClass145_Sub3_26.method6690();
		this.aClass145_Sub3_28.method6690();
		this.aClass145_Sub3_29.method6690();
		this.aClass145_Sub3_23.method6690();
		this.aClass83_3.method1968();
		this.anInterface1_5.method5728();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZZI)V")
	public final void method5622(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt6708 != arg2) {
			if (arg2 < 0) {
				this.method5614();
				this.method5651(null);
				this.method5561(0);
				if (!this.aBoolean474) {
					this.method5571(arg1, 0, arg0, 0, 0);
				}
			} else {
				@Pc(41) Interface3 local41 = this.aClass9_3.method385(arg2);
				@Pc(47) Class220 local47 = super.anInterface8_14.method878(arg2);
				if (local47.aByte82 == 0 && local47.aByte85 == 0) {
					this.method5614();
				} else {
					@Pc(70) int local70 = local47.aBoolean451 ? 64 : 128;
					@Pc(74) int local74 = local70 * 50;
					@Pc(78) Class118_Sub3 local78 = this.method5574();
					local78.method6975(0.0F, (float) (local47.aByte85 * (this.anInt6721 % local74)) / (float) local74, (float) (local47.aByte82 * (this.anInt6721 % local74)) / (float) local74);
					this.method5612(Static272.aClass110_4);
				}
				if (!this.aBoolean474) {
					this.method5571(arg1, local47.anInt6249, arg0, local47.aByte86, local47.aByte87);
				}
				if (this.aClass42_3 == null) {
					this.method5651(local41);
					this.method5561(local47.anInt6250);
				} else {
					this.aClass42_3.method6425(local47.anInt6250, local41);
				}
			}
			this.anInt6708 = arg2;
		}
		this.anInt6722 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public final void method7250(@OriginalArg(0) Class118 arg0) {
		this.aClass118_Sub3_16 = (Class118_Sub3) arg0;
		this.aClass118_Sub3_18.EA(this.aClass118_Sub3_16);
		this.aClass118_Sub3_18.method6978();
		this.aClass118_Sub3_19.method6982(this.aClass118_Sub3_18);
		this.aClass118_Sub3_17.method6982(this.aClass118_Sub3_16);
		if (this.aClass68_5.method1636()) {
			this.method5653();
		}
	}

	@OriginalMember(owner = "client!re", name = "O", descriptor = "(I)V")
	protected abstract void method5623();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZB)V")
	public final void method5624(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean489 != arg0) {
			this.aBoolean489 = arg0;
			this.method5558();
			this.anInt6722 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!re", name = "l", descriptor = "(B)V")
	protected abstract void method5625();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public final Class2 method7261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class2_Sub3 local11 = new Class2_Sub3(this, arg2, arg3, arg4);
		local11.P(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public final Class40 method7273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static115.method1974(arg3, this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(II)V")
	public abstract void method5626(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!re", name = "m", descriptor = "(B)V")
	protected abstract void method5627();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method5628(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!re", name = "n", descriptor = "(B)V")
	public final void method5629() {
		this.aClass118_Sub3_15.ha();
		this.aBoolean470 = true;
		this.method5667();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIIIIB[I)Lclient!gq;")
	public abstract Interface3 method5630(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5);

	@OriginalMember(owner = "client!re", name = "t", descriptor = "()Z")
	@Override
	public final boolean method7258() {
		return true;
	}

	@OriginalMember(owner = "client!re", name = "B", descriptor = "()Z")
	@Override
	public final boolean method7279() {
		return this.aBoolean476;
	}

	@OriginalMember(owner = "client!re", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7240() {
		return false;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[[IIZ)Lclient!mca;")
	public abstract Interface7 method5631(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!re", name = "P", descriptor = "(I)V")
	private void method5632() {
		if (this.aClass42_3 != null) {
			this.aClass42_3.method6422();
		}
		this.method5625();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I")
	@Override
	public final int method7225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(ZB)V")
	public final void method5633(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean488) {
			this.aBoolean488 = arg0;
			this.method5604();
			this.anInt6722 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(II)V")
	public final void method5634(@OriginalArg(1) int arg0) {
		if (this.anInt6707 != arg0) {
			this.anInt6707 = arg0;
			this.method5593();
		}
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(Z)V")
	private void method5635() {
		if (this.aBoolean477) {
			return;
		}
		@Pc(11) float[] local11 = this.aFloatArray46;
		@Pc(19) float local19 = (float) this.anInt6728 - this.aFloat127;
		@Pc(26) float local26 = (float) this.anInt6719 - this.aFloat127;
		@Pc(38) float local38 = this.aFloat126 * (float) -this.anInt6718 / (float) this.anInt6706;
		@Pc(50) float local50 = this.aFloat126 * (float) -this.anInt6713 / (float) this.anInt6711;
		@Pc(65) float local65 = this.aFloat126 * (float) (this.anInt6621 - this.anInt6713) / (float) this.anInt6711;
		@Pc(80) float local80 = (float) (this.anInt6649 - this.anInt6718) * this.aFloat126 / (float) this.anInt6706;
		if (local50 == local65 || local80 == local38) {
			local11[12] = 0.0F;
			local11[6] = 0.0F;
			local11[15] = 1.0F;
			local11[5] = 1.0F;
			local11[11] = 0.0F;
			local11[0] = 1.0F;
			local11[8] = 0.0F;
			local11[2] = 0.0F;
			local11[13] = 0.0F;
			local11[9] = 0.0F;
			local11[3] = 0.0F;
			local11[7] = 0.0F;
			local11[10] = 1.0F;
			local11[4] = 0.0F;
			local11[1] = 0.0F;
			local11[14] = 0.0F;
		} else {
			local11[8] = 0.0F;
			local11[12] = (local65 + local50) / (local50 - local65);
			local11[4] = 0.0F;
			local11[7] = 0.0F;
			local11[6] = 0.0F;
			local11[3] = 0.0F;
			local11[2] = 0.0F;
			local11[15] = 1.0F;
			local11[5] = 2.0F / (local80 - local38);
			local11[14] = local19 / (local19 - local26);
			local11[0] = 2.0F / (local65 - local50);
			local11[1] = 0.0F;
			local11[11] = 0.0F;
			local11[9] = 0.0F;
			local11[10] = 1.0F / (local19 - local26);
			local11[13] = (local80 + local38) / (-local38 + local80);
		}
		this.method5602();
		this.aBoolean477 = true;
	}

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "(I)V")
	protected abstract void method5636();

	@OriginalMember(owner = "client!re", name = "R", descriptor = "(I)V")
	protected abstract void method5637();

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(IIIIII)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5591();
		this.method5634(arg4);
		this.method5575(0, Static312.aClass181_4);
		this.method5585(Static312.aClass181_4, 0);
		this.method5650(arg5);
		this.aClass118_Sub3_15.method6977((float) arg3, (float) arg2, 1.0F);
		this.aClass118_Sub3_15.TA(arg0, arg1, 0);
		this.method5638();
		this.method5572(false);
		this.method5606();
		this.method5572(true);
		this.method5585(Static162.aClass181_2, 0);
		this.method5575(0, Static162.aClass181_2);
	}

	@OriginalMember(owner = "client!re", name = "o", descriptor = "(B)V")
	public final void method5638() {
		this.aBoolean470 = false;
		this.method5667();
	}

	@OriginalMember(owner = "client!re", name = "p", descriptor = "(B)V")
	public final void method5639() {
		if (this.anInt6722 == 8) {
			return;
		}
		this.method5663();
		this.method5611(true);
		this.method5624(true);
		this.method5551(true);
		this.method5650(1);
		this.anInt6722 = 8;
	}

	@OriginalMember(owner = "client!re", name = "S", descriptor = "(I)V")
	protected abstract void method5640();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7222(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas11 == arg0) {
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
			@Pc(53) Object local53 = this.method5578(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!re", name = "u", descriptor = "()Z")
	@Override
	public final boolean method7262() {
		return true;
	}

	@OriginalMember(owner = "client!re", name = "T", descriptor = "(I)V")
	protected void method5641() {
		this.method5666();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!be;III)V")
	public abstract void method5642(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!re", name = "v", descriptor = "()Z")
	@Override
	public final boolean method7266() {
		return true;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IFFFFFF)Z")
	private boolean method5643(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(17) Buffer local17 = this.anInterface5_11.method5729();
		if (local17 == null) {
			return false;
		}
		@Pc(26) Stream local26 = this.method5555(local17);
		if (Stream.c()) {
			local26.a(arg4);
			local26.a(arg2);
			local26.a(arg5);
			local26.a(arg1);
			local26.a(arg0);
			local26.a(arg3);
		} else {
			local26.b(arg4);
			local26.b(arg2);
			local26.b(arg5);
			local26.b(arg1);
			local26.b(arg0);
			local26.b(arg3);
		}
		local26.b();
		return this.anInterface5_11.method5730();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)V")
	public final void method5644(@OriginalArg(1) int arg0) {
		if (this.anInt6727 != arg0) {
			this.anInt6727 = arg0;
			this.method5556();
		}
	}

	@OriginalMember(owner = "client!re", name = "z", descriptor = "()Lclient!m;")
	@Override
	public final Class118 method7275() {
		return new Class118_Sub3();
	}

	@OriginalMember(owner = "client!re", name = "U", descriptor = "(I)[F")
	public final float[] method5645() {
		return this.aFloatArray47;
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(Z)V")
	private void method5646() {
		this.aBoolean477 = false;
		if (Static182.aClass68_1 == this.aClass68_5) {
			this.method5635();
			this.method5560();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[Lclient!ww;)V")
	@Override
	public final void method7264(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass1_Sub2Array5[local3] = arg1[local3];
		}
		this.anInt6694 = arg0;
		if (this.aClass68_5.method1636()) {
			this.method5586();
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7271(@OriginalArg(0) boolean arg0) {
		this.aBoolean475 = arg0;
		this.method5600();
	}

	@OriginalMember(owner = "client!re", name = "V", descriptor = "(I)V")
	public abstract void method5647();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZ)V")
	public final void method5648(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean483) {
			this.aBoolean483 = arg0;
			this.method5604();
		}
	}

	@OriginalMember(owner = "client!re", name = "q", descriptor = "(B)V")
	protected abstract void method5649();

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(II)V")
	public final void method5650(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt6701) {
			return;
		}
		@Pc(14) Class155 local14;
		@Pc(16) boolean local16;
		@Pc(12) boolean local12;
		if (arg0 == 1) {
			local12 = true;
			local14 = Static119.aClass155_1;
			local16 = true;
		} else if (arg0 == 2) {
			local16 = true;
			local12 = false;
			local14 = Static437.aClass155_7;
		} else if (arg0 == 128) {
			local12 = true;
			local16 = true;
			local14 = Static391.aClass155_6;
		} else {
			local16 = false;
			local14 = Static138.aClass155_2;
			local12 = false;
		}
		if (this.aBoolean484 != local12) {
			this.aBoolean484 = local12;
			this.method5584();
		}
		if (local16 != this.aBoolean480) {
			this.aBoolean480 = local16;
			this.method5587();
		}
		if (local14 != this.aClass155_5) {
			this.aClass155_5 = local14;
			this.method5552();
		}
		this.anInt6701 = arg0;
		this.anInt6722 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!sw;)V")
	public final void method5651(@OriginalArg(1) Interface15 arg0) {
		if (this.anInterface15Array3[this.anInt6727] == arg0) {
			return;
		}
		this.anInterface15Array3[this.anInt6727] = arg0;
		if (arg0 == null) {
			this.method5649();
		} else {
			arg0.method7303();
		}
		this.anInt6722 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[BILclient!uda;BIZI)Lclient!gq;")
	protected abstract Interface3 method5652(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class292 arg3, @OriginalArg(6) boolean arg4);

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
	@Override
	public final void method7232(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!re", name = "W", descriptor = "(I)V")
	private void method5653() {
		this.aBoolean487 = false;
		if (this.aClass42_3 != null) {
			this.aClass42_3.method6427();
		}
		this.method5608();
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)V")
	@Override
	public final void method7272(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!re", name = "r", descriptor = "(B)Lclient!uw;")
	public final Class118_Sub3 method5654() {
		return this.aClass118_Sub3_15;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!ei;)V")
	public abstract void method5655(@OriginalArg(1) Class79 arg0);

	@OriginalMember(owner = "client!re", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!sb;Lclient!uda;)Z")
	public abstract boolean method5656(@OriginalArg(1) Class264 arg0, @OriginalArg(2) Class292 arg1);

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	@Override
	public final void method7239(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([FI)[F")
	public final float[] method5657(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloatArray44[1];
		arg0[12] = this.aFloatArray44[3];
		arg0[0] = this.aFloatArray44[0];
		arg0[8] = this.aFloatArray44[2];
		arg0[5] = this.aFloatArray44[5];
		arg0[13] = this.aFloatArray44[7];
		arg0[9] = this.aFloatArray44[6];
		arg0[2] = this.aFloatArray44[8];
		arg0[1] = this.aFloatArray44[4];
		arg0[14] = this.aFloatArray44[11];
		arg0[6] = this.aFloatArray44[9];
		arg0[10] = this.aFloatArray44[10];
		arg0[3] = this.aFloatArray44[12];
		arg0[7] = this.aFloatArray44[13];
		arg0[11] = this.aFloatArray44[14];
		arg0[15] = this.aFloatArray44[15];
		return arg0;
	}

	@OriginalMember(owner = "client!re", name = "la", descriptor = "(FF)V")
	@Override
	public final void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat123 && this.aFloat127 == arg1) {
			return;
		}
		this.aFloat123 = arg0;
		this.aFloat127 = arg1;
		this.method5602();
		this.method5681();
		this.method5646();
		this.method5664();
	}

	@OriginalMember(owner = "client!re", name = "X", descriptor = "(I)V")
	public final void method5658() {
		if (this.anInt6722 == 2) {
			return;
		}
		this.method5668();
		this.method5611(false);
		this.method5633(false);
		this.method5624(false);
		this.method5551(false);
		this.method5622(false, false, -2);
		this.anInt6722 = 2;
	}

	@OriginalMember(owner = "client!re", name = "m", descriptor = "()V")
	@Override
	protected void method7245() {
		if (this.aBoolean485) {
			return;
		}
		for (@Pc(13) Class1 local13 = this.aClass37_65.method977(); local13 != null; local13 = this.aClass37_65.method971()) {
			((Class1_Sub8_Sub2) local13).method7107();
		}
		@Pc(30) Enumeration local30 = this.aHashtable6.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method5589(this.aHashtable6.get(local36), local36);
		}
		Static328.method5044(false, true);
		this.aNativeInterface3.release();
		this.aBoolean485 = true;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZLclient!lg;)V")
	protected abstract void method5659(@OriginalArg(1) int arg0, @OriginalArg(3) Class181 arg1);

	@OriginalMember(owner = "client!re", name = "IA", descriptor = "(III[I)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass118_Sub3_16.method6986((float) arg1, (float) arg0, (float) arg2);
		if (local14 < (float) this.anInt6728 || (float) this.anInt6719 < local14) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(57) int local57 = (int) ((float) this.anInt6711 * this.aClass118_Sub3_16.method6983((float) arg2, (float) arg0, (float) arg1) / local14);
		@Pc(75) int local75 = (int) ((float) this.anInt6706 * this.aClass118_Sub3_16.method6968((float) arg0, (float) arg2, (float) arg1) / local14);
		if ((float) local57 >= this.aFloat124 && (float) local57 <= this.aFloat133 && (float) local75 >= this.aFloat134 && (float) local75 <= this.aFloat138) {
			arg3[1] = (int) ((float) local75 - this.aFloat134);
			arg3[2] = (int) local14;
			arg3[0] = (int) ((float) local57 - this.aFloat124);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "()Z")
	@Override
	public final boolean method7221() {
		return this.aClass42Array3[3].method6433();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BZ)Lclient!bd;")
	public abstract Interface1 method5660(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZI[I)Lclient!gq;")
	public final Interface3 method5661(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		return this.method5630(arg1, arg0, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!uda;B[BZII)Lclient!gq;")
	public final Interface3 method5662(@OriginalArg(0) Class292 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method5652(arg3, arg1, arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([Lclient!r;Lclient!kw;Lclient!m;[Lclient!eca;I)V")
	@Override
	public final void method7283(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class72_Sub2[] arg3, @OriginalArg(4) int arg4) {
		this.method7257(arg0, arg2, arg3, arg4);
		this.method7251(arg1);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)I")
	@Override
	public final int method7241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public final Class1_Sub8 method7263(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub8_Sub2 local8 = new Class1_Sub8_Sub2(arg0);
		this.aClass37_65.method970(local8);
		return local8;
	}

	@OriginalMember(owner = "client!re", name = "Y", descriptor = "(I)V")
	private void method5663() {
		if (Static488.aClass68_6 == this.aClass68_5) {
			return;
		}
		@Pc(16) Class68 local16 = this.aClass68_5;
		this.aClass68_5 = Static488.aClass68_6;
		if (!local16.method1636()) {
			this.method5653();
		}
		this.method5579();
		this.aFloatArray44 = this.aFloatArray50;
		this.method5560();
		this.anInt6722 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!re", name = "y", descriptor = "()V")
	@Override
	public final void method7269() {
		this.aClass9_3.method388();
	}

	@OriginalMember(owner = "client!re", name = "L", descriptor = "(I)V")
	@Override
	public final void L(@OriginalArg(0) int arg0) {
		this.anInt6714 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt6714++;
		}
		this.anInt6700 = 0x1 << this.anInt6714;
	}

	@OriginalMember(owner = "client!re", name = "ab", descriptor = "(I)V")
	private void method5664() {
		this.aBoolean479 = false;
		this.method5579();
		if (this.aClass68_5 == Static488.aClass68_6) {
			this.method5560();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!lca;IB)V")
	public abstract void method5665(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!re", name = "s", descriptor = "(B)V")
	private void method5666() {
		this.method5596();
		this.method5599();
		this.method5604();
		this.method5586();
		this.method5647();
		this.method5640();
		this.method5569();
		this.method5558();
		this.method5600();
		this.method5615();
		this.method5625();
		this.method5587();
		this.method5552();
		this.method5584();
		for (@Pc(60) int local60 = this.anInt6699 - 1; local60 >= 0; local60--) {
			this.method5644(local60);
			this.method5601();
			this.method5627();
			this.method5614();
		}
		this.method5593();
		this.method5623();
		this.method5636();
		this.method5603();
		this.method5608();
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7278(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas11) {
			local5 = this.anObject15;
		} else if (this.aHashtable6.containsKey(arg0)) {
			local5 = this.aHashtable6.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method5628(arg0, local5);
		if (this.aCanvas12 == arg0) {
			this.method5582();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	@Override
	public final void method7210(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt6729 = arg0;
		this.aClass9_3.method388();
	}

	@OriginalMember(owner = "client!re", name = "bb", descriptor = "(I)V")
	private void method5667() {
		if (this.aClass68_5 == Static227.aClass68_4) {
			@Pc(16) float local16 = this.method5672();
			this.aClass118_Sub3_15.method6985(local16, local16, 0.0F);
		}
		this.aBoolean487 = false;
		this.method5603();
		if (this.aClass42_3 != null) {
			this.aClass42_3.method6428();
		}
	}

	@OriginalMember(owner = "client!re", name = "t", descriptor = "(B)V")
	private void method5668() {
		if (Static227.aClass68_4 == this.aClass68_5) {
			return;
		}
		@Pc(18) Class68 local18 = this.aClass68_5;
		this.aClass68_5 = Static227.aClass68_4;
		if (local18.method1636()) {
			this.method5653();
		}
		this.method5554();
		this.aFloatArray44 = this.aFloatArray45;
		this.method5560();
		this.anInt6722 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!be;Lclient!bd;IIIII)V")
	public abstract void method5669(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIF)Lclient!ww;")
	@Override
	public final Class1_Sub2 method7249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub2_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BB)V")
	public final void method5670(@OriginalArg(0) byte arg0) {
		this.method5634(arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!fp;IIII)Lclient!r;")
	@Override
	public final Class145 method7280(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class145_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(IZ)Lclient!lca;")
	public abstract Interface5 method5671(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(Z)F")
	protected abstract float method5672();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z[FILclient!uda;IIII)Lclient!gq;")
	protected abstract Interface3 method5673(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) Class292 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!re", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public final void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class40_Sub1 local6 = (Class40_Sub1) arg1;
		@Pc(9) Interface3 local9 = local6.anInterface3_1;
		this.method5658();
		this.method5651(local9);
		this.method5650(1);
		this.method5605(Static486.aClass271_5, Static486.aClass271_5);
		this.method5575(0, Static312.aClass181_4);
		this.method5634(arg0);
		this.aClass118_Sub3_15.method6977((float) this.anInt6649, (float) this.anInt6621, 0.0F);
		this.method5638();
		this.aClass118_Sub3Array3[0].method6977(local9.method7317((float) this.anInt6649), local9.method7320((float) this.anInt6621), 1.0F);
		this.aClass118_Sub3Array3[0].method6985(local9.method7317((float) -arg3), local9.method7320((float) -arg2), 0.0F);
		this.aClass110Array3[0] = Static272.aClass110_4;
		this.method5580();
		this.method5606();
		this.method5614();
		this.method5575(0, Static162.aClass181_2);
	}

	@OriginalMember(owner = "client!re", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7255() {
		return false;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([Lclient!ug;B)Lclient!kq;")
	public abstract Class170 method5674(@OriginalArg(0) Class293[] arg0);

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(BZ)V")
	public final void method5675(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean481) {
			this.aBoolean481 = arg0;
			this.method5569();
		}
	}

	@OriginalMember(owner = "client!re", name = "u", descriptor = "(B)V")
	private void method5676() {
		this.anInterface5_12 = this.method5671(false);
		this.anInterface5_12.method5727(140, 28);
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			@Pc(35) Buffer local35 = this.anInterface5_12.method5729();
			if (local35 != null) {
				@Pc(42) Stream local42 = this.method5555(local35);
				if (Stream.c()) {
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
				} else {
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
				}
				local42.b();
				if (this.anInterface5_12.method5730()) {
					break;
				}
			}
		}
		this.aClass170_17 = this.method5674(new Class293[] { new Class293(new Class107[] { Static160.aClass107_1, Static160.aClass107_5, Static160.aClass107_5 }) });
	}

	@OriginalMember(owner = "client!re", name = "k", descriptor = "()Z")
	@Override
	public final boolean method7242() {
		return true;
	}

	@OriginalMember(owner = "client!re", name = "A", descriptor = "(IIIII)V")
	@Override
	protected final void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!re", name = "cb", descriptor = "(I)Lclient!mca;")
	public final Interface7 method5677() {
		return this.aClass45_Sub1_3 == null ? null : this.aClass45_Sub1_3.method1107();
	}

	@OriginalMember(owner = "client!re", name = "CA", descriptor = "()I")
	@Override
	public final int CA() {
		return this.anInt6719;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt6728;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!lg;ZZZI)V")
	public abstract void method5678(@OriginalArg(0) Class181 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public final void method7231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class40 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!re", name = "JA", descriptor = "(IIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean474) {
			throw new RuntimeException("");
		}
		if (this.anInt6698 != arg0) {
			this.anInt6698 = arg0;
			if (this.aClass42_3 != null) {
				this.aClass42_3.method6434();
			}
		}
		this.anInt6704 = arg2;
		this.anInt6693 = arg1;
		this.anInt6726 = arg3;
		this.method5632();
	}

	@OriginalMember(owner = "client!re", name = "db", descriptor = "(I)Lclient!uw;")
	public final Class118_Sub3 method5679() {
		return this.aClass118_Sub3_18;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public final Class2 method7268(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class2_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!re", name = "eb", descriptor = "(I)I")
	public final int method5680() {
		return this.anInt6727;
	}

	@OriginalMember(owner = "client!re", name = "xa", descriptor = "()V")
	@Override
	public final void xa() {
		this.aBoolean474 = false;
		this.method5571(false, 0, false, 0, 0);
		this.method5632();
		this.method5615();
	}

	@OriginalMember(owner = "client!re", name = "fb", descriptor = "(I)V")
	private void method5681() {
		if (this.aFloat127 == 0.0F) {
			this.aFloatArray50[10] = this.aFloat129;
			this.aFloatArray50[14] = this.aFloat122;
		} else {
			@Pc(35) float local35 = this.aFloat123 / (this.aFloat127 + this.aFloat123);
			@Pc(39) float local39 = local35 * local35;
			@Pc(54) float local54 = (1.0F - local35) * -this.aFloat122 * (1.0F - local35) / this.aFloat127;
			this.aFloatArray50[14] = local39 * this.aFloat122;
			this.aFloatArray50[10] = this.aFloat129 + local54;
		}
		this.aFloat128 = ((float) -this.anInt6719 + this.aFloatArray50[14]) / this.aFloatArray50[10];
	}

	@OriginalMember(owner = "client!re", name = "v", descriptor = "(B)V")
	protected abstract void method5682();

	@OriginalMember(owner = "client!re", name = "UA", descriptor = "(IIIII)V")
	@Override
	public final void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7237(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!re", name = "w", descriptor = "(B)I")
	public final int method5683() {
		return this.anInt6726;
	}
}
