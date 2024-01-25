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

@OriginalClass("client!wga")
public abstract class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!wga", name = "E", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!wga", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!wga", name = "xb", descriptor = "Lclient!ur;")
	protected Class347 aClass347_3;

	@OriginalMember(owner = "client!wga", name = "ic", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!wga", name = "Wc", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable3;

	@OriginalMember(owner = "client!wga", name = "Sd", descriptor = "I")
	public int anInt1523;

	@OriginalMember(owner = "client!wga", name = "Td", descriptor = "I")
	public int anInt1524;

	@OriginalMember(owner = "client!wga", name = "je", descriptor = "I")
	protected int anInt1538;

	@OriginalMember(owner = "client!wga", name = "qe", descriptor = "[Lclient!sia;")
	protected Class315[] aClass315Array5;

	@OriginalMember(owner = "client!wga", name = "ue", descriptor = "I")
	public int anInt1540;

	@OriginalMember(owner = "client!wga", name = "we", descriptor = "[Lclient!sia;")
	protected Class315[] aClass315Array6;

	@OriginalMember(owner = "client!wga", name = "Ce", descriptor = "[Lclient!du;")
	private Interface7[] anInterface7Array3;

	@OriginalMember(owner = "client!wga", name = "Ee", descriptor = "I")
	private int anInt1546;

	@OriginalMember(owner = "client!wga", name = "Fe", descriptor = "Z")
	public boolean aBoolean115;

	@OriginalMember(owner = "client!wga", name = "He", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!wga", name = "Re", descriptor = "[Lclient!tr;")
	protected Class332[] aClass332Array3;

	@OriginalMember(owner = "client!wga", name = "Se", descriptor = "I")
	public int anInt1553;

	@OriginalMember(owner = "client!wga", name = "Te", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!wga", name = "Xe", descriptor = "I")
	protected int anInt1555;

	@OriginalMember(owner = "client!wga", name = "af", descriptor = "I")
	protected int anInt1556;

	@OriginalMember(owner = "client!wga", name = "bf", descriptor = "Z")
	protected boolean bf;

	@OriginalMember(owner = "client!wga", name = "ef", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!wga", name = "gf", descriptor = "F")
	private float aFloat55;

	@OriginalMember(owner = "client!wga", name = "kf", descriptor = "[Lclient!haa;")
	protected Class30_Sub2[] aClass30_Sub2Array3;

	@OriginalMember(owner = "client!wga", name = "lf", descriptor = "[Lclient!ab;")
	protected Class2_Sub1[] aClass2_Sub1Array3;

	@OriginalMember(owner = "client!wga", name = "mf", descriptor = "I")
	public int anInt1560;

	@OriginalMember(owner = "client!wga", name = "pf", descriptor = "Lclient!ve;")
	private Class356 aClass356_3;

	@OriginalMember(owner = "client!wga", name = "rf", descriptor = "I")
	protected int anInt1562;

	@OriginalMember(owner = "client!wga", name = "wf", descriptor = "Lclient!fj;")
	private Class17 aClass17_3;

	@OriginalMember(owner = "client!wga", name = "zf", descriptor = "I")
	public int anInt1564;

	@OriginalMember(owner = "client!wga", name = "Af", descriptor = "Lclient!du;")
	public Interface7 anInterface7_3;

	@OriginalMember(owner = "client!wga", name = "Ef", descriptor = "I")
	protected int anInt1566;

	@OriginalMember(owner = "client!wga", name = "Lf", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!wga", name = "Mf", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!wga", name = "Nf", descriptor = "Z")
	public boolean aBoolean129;

	@OriginalMember(owner = "client!wga", name = "Pf", descriptor = "I")
	private int anInt1570;

	@OriginalMember(owner = "client!wga", name = "Tf", descriptor = "F")
	private float aFloat58;

	@OriginalMember(owner = "client!wga", name = "Yf", descriptor = "Lclient!vc;")
	private Class78_Sub2 aClass78_Sub2_3;

	@OriginalMember(owner = "client!wga", name = "ag", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!wga", name = "jg", descriptor = "Z")
	protected boolean aBoolean132;

	@OriginalMember(owner = "client!wga", name = "mg", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!wga", name = "og", descriptor = "Lclient!nca;")
	public Class166_Sub2 aClass166_Sub2_21;

	@OriginalMember(owner = "client!wga", name = "pg", descriptor = "Lclient!nca;")
	public Class166_Sub2 aClass166_Sub2_22;

	@OriginalMember(owner = "client!wga", name = "qg", descriptor = "Lclient!nca;")
	public Class166_Sub2 aClass166_Sub2_23;

	@OriginalMember(owner = "client!wga", name = "rg", descriptor = "Lclient!np;")
	private Class22 aClass22_15;

	@OriginalMember(owner = "client!wga", name = "sg", descriptor = "Lclient!np;")
	public Class22 aClass22_16;

	@OriginalMember(owner = "client!wga", name = "tg", descriptor = "Lclient!nca;")
	public Class166_Sub2 aClass166_Sub2_24;

	@OriginalMember(owner = "client!wga", name = "ug", descriptor = "Lclient!tc;")
	private Interface22 anInterface22_7;

	@OriginalMember(owner = "client!wga", name = "vg", descriptor = "Lclient!nca;")
	public Class166_Sub2 aClass166_Sub2_25;

	@OriginalMember(owner = "client!wga", name = "wg", descriptor = "Lclient!uq;")
	private Interface24 anInterface24_3;

	@OriginalMember(owner = "client!wga", name = "yg", descriptor = "Lclient!np;")
	private Class22 aClass22_17;

	@OriginalMember(owner = "client!wga", name = "zg", descriptor = "Lclient!nca;")
	public Class166_Sub2 aClass166_Sub2_26;

	@OriginalMember(owner = "client!wga", name = "Ag", descriptor = "Lclient!nca;")
	public Class166_Sub2 aClass166_Sub2_27;

	@OriginalMember(owner = "client!wga", name = "Bg", descriptor = "Lclient!nca;")
	public Class166_Sub2 aClass166_Sub2_28;

	@OriginalMember(owner = "client!wga", name = "Cg", descriptor = "Lclient!tc;")
	private Interface22 anInterface22_8;

	@OriginalMember(owner = "client!wga", name = "Dg", descriptor = "Lclient!np;")
	public Class22 aClass22_18;

	@OriginalMember(owner = "client!wga", name = "Eg", descriptor = "Lclient!tc;")
	private Interface22 anInterface22_9;

	@OriginalMember(owner = "client!wga", name = "Fg", descriptor = "Lclient!np;")
	public Class22 aClass22_19;

	@OriginalMember(owner = "client!wga", name = "Gg", descriptor = "Lclient!np;")
	private Class22 aClass22_20;

	@OriginalMember(owner = "client!wga", name = "Hg", descriptor = "Lclient!nca;")
	public Class166_Sub2 aClass166_Sub2_29;

	@OriginalMember(owner = "client!wga", name = "Ig", descriptor = "Lclient!nca;")
	public Class166_Sub2 aClass166_Sub2_30;

	@OriginalMember(owner = "client!wga", name = "Jg", descriptor = "Lclient!np;")
	public Class22 aClass22_21;

	@OriginalMember(owner = "client!wga", name = "Kg", descriptor = "Z")
	protected boolean aBoolean133;

	@OriginalMember(owner = "client!wga", name = "Lg", descriptor = "I")
	private int anInt1580;

	@OriginalMember(owner = "client!wga", name = "nb", descriptor = "Lclient!uh;")
	private final Class341 aClass341_11 = new Class341();

	@OriginalMember(owner = "client!wga", name = "Zd", descriptor = "Z")
	protected boolean aBoolean113 = true;

	@OriginalMember(owner = "client!wga", name = "ee", descriptor = "Lclient!haa;")
	protected final Class30_Sub2 aClass30_Sub2_15 = new Class30_Sub2();

	@OriginalMember(owner = "client!wga", name = "ke", descriptor = "Lclient!haa;")
	public Class30_Sub2 aClass30_Sub2_16 = new Class30_Sub2();

	@OriginalMember(owner = "client!wga", name = "me", descriptor = "Lclient!haa;")
	public final Class30_Sub2 aClass30_Sub2_17 = new Class30_Sub2();

	@OriginalMember(owner = "client!wga", name = "ne", descriptor = "Lclient!haa;")
	protected final Class30_Sub2 aClass30_Sub2_18 = new Class30_Sub2();

	@OriginalMember(owner = "client!wga", name = "oe", descriptor = "Lclient!haa;")
	private final Class30_Sub2 aClass30_Sub2_19 = new Class30_Sub2();

	@OriginalMember(owner = "client!wga", name = "pe", descriptor = "Lclient!haa;")
	private final Class30_Sub2 aClass30_Sub2_20 = new Class30_Sub2();

	@OriginalMember(owner = "client!wga", name = "xe", descriptor = "F")
	public float aFloat51 = 1.0F;

	@OriginalMember(owner = "client!wga", name = "De", descriptor = "I")
	private int anInt1545 = -1;

	@OriginalMember(owner = "client!wga", name = "te", descriptor = "F")
	public float aFloat50 = 3584.0F;

	@OriginalMember(owner = "client!wga", name = "ze", descriptor = "I")
	public int anInt1543 = 50;

	@OriginalMember(owner = "client!wga", name = "ye", descriptor = "I")
	public int anInt1542 = 0;

	@OriginalMember(owner = "client!wga", name = "re", descriptor = "F")
	public float aFloat49 = 1.0F;

	@OriginalMember(owner = "client!wga", name = "Qe", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!wga", name = "Ae", descriptor = "I")
	protected int anInt1544 = 0;

	@OriginalMember(owner = "client!wga", name = "Je", descriptor = "I")
	public int anInt1548 = 0;

	@OriginalMember(owner = "client!wga", name = "hf", descriptor = "I")
	public int anInt1558 = 512;

	@OriginalMember(owner = "client!wga", name = "We", descriptor = "Z")
	protected boolean aBoolean119 = false;

	@OriginalMember(owner = "client!wga", name = "Me", descriptor = "I")
	private int anInt1551 = 0;

	@OriginalMember(owner = "client!wga", name = "ve", descriptor = "I")
	public int anInt1541 = -1;

	@OriginalMember(owner = "client!wga", name = "Ze", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!wga", name = "Ue", descriptor = "Z")
	protected boolean aBoolean118 = true;

	@OriginalMember(owner = "client!wga", name = "df", descriptor = "I")
	public int anInt1557 = 8;

	@OriginalMember(owner = "client!wga", name = "Ge", descriptor = "[F")
	public final float[] aFloatArray25 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!wga", name = "vf", descriptor = "[F")
	private final float[] aFloatArray30 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wga", name = "Pe", descriptor = "[F")
	private final float[] aFloatArray26 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!wga", name = "jf", descriptor = "I")
	public int anInt1559 = 0;

	@OriginalMember(owner = "client!wga", name = "Kf", descriptor = "[F")
	private final float[] aFloatArray32 = new float[16];

	@OriginalMember(owner = "client!wga", name = "Oe", descriptor = "Z")
	protected boolean aBoolean116 = true;

	@OriginalMember(owner = "client!wga", name = "Ne", descriptor = "I")
	protected final int anInt1552 = 0;

	@OriginalMember(owner = "client!wga", name = "Ye", descriptor = "[F")
	private final float[] aFloatArray27 = new float[16];

	@OriginalMember(owner = "client!wga", name = "Ie", descriptor = "I")
	private int anInt1547 = -1;

	@OriginalMember(owner = "client!wga", name = "cf", descriptor = "Z")
	protected boolean aBoolean121 = true;

	@OriginalMember(owner = "client!wga", name = "ff", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!wga", name = "Jf", descriptor = "I")
	private int anInt1568 = 0;

	@OriginalMember(owner = "client!wga", name = "Gf", descriptor = "Z")
	private boolean aBoolean127 = false;

	@OriginalMember(owner = "client!wga", name = "xf", descriptor = "I")
	public int anInt1563 = -1;

	@OriginalMember(owner = "client!wga", name = "Hf", descriptor = "I")
	protected int anInt1567 = 3584;

	@OriginalMember(owner = "client!wga", name = "Le", descriptor = "I")
	public int anInt1550 = 3;

	@OriginalMember(owner = "client!wga", name = "sf", descriptor = "[Lclient!fj;")
	private final Class17[] aClass17Array3 = new Class17[10];

	@OriginalMember(owner = "client!wga", name = "Df", descriptor = "I")
	public int anInt1565 = 128;

	@OriginalMember(owner = "client!wga", name = "nf", descriptor = "I")
	public int anInt1561 = 512;

	@OriginalMember(owner = "client!wga", name = "Rf", descriptor = "Z")
	protected boolean aBoolean130 = false;

	@OriginalMember(owner = "client!wga", name = "tf", descriptor = "[F")
	private final float[] aFloatArray29 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wga", name = "Wf", descriptor = "F")
	public float aFloat60 = 3584.0F;

	@OriginalMember(owner = "client!wga", name = "uf", descriptor = "Z")
	protected boolean aBoolean123 = true;

	@OriginalMember(owner = "client!wga", name = "Qf", descriptor = "Lclient!pn;")
	protected Class266 aClass266_3 = Static142.aClass266_4;

	@OriginalMember(owner = "client!wga", name = "Bf", descriptor = "Z")
	protected boolean aBoolean125 = true;

	@OriginalMember(owner = "client!wga", name = "Be", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!wga", name = "Sf", descriptor = "I")
	protected int anInt1571 = 0;

	@OriginalMember(owner = "client!wga", name = "yf", descriptor = "Z")
	protected boolean aBoolean124 = false;

	@OriginalMember(owner = "client!wga", name = "Ff", descriptor = "[F")
	private final float[] aFloatArray31 = new float[16];

	@OriginalMember(owner = "client!wga", name = "dg", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!wga", name = "Of", descriptor = "I")
	private int anInt1569 = 0;

	@OriginalMember(owner = "client!wga", name = "Ke", descriptor = "I")
	protected int anInt1549 = 0;

	@OriginalMember(owner = "client!wga", name = "Cf", descriptor = "Z")
	protected boolean aBoolean126 = false;

	@OriginalMember(owner = "client!wga", name = "If", descriptor = "F")
	private float aFloat56 = 1.0F;

	@OriginalMember(owner = "client!wga", name = "of", descriptor = "[F")
	protected float[] aFloatArray28 = this.aFloatArray26;

	@OriginalMember(owner = "client!wga", name = "Uf", descriptor = "I")
	private int anInt1572 = 1;

	@OriginalMember(owner = "client!wga", name = "gg", descriptor = "I")
	private int anInt1577 = -1;

	@OriginalMember(owner = "client!wga", name = "cg", descriptor = "I")
	protected int anInt1574 = 0;

	@OriginalMember(owner = "client!wga", name = "eg", descriptor = "I")
	private int anInt1575 = 0;

	@OriginalMember(owner = "client!wga", name = "Vf", descriptor = "F")
	public float aFloat59 = 1.0F;

	@OriginalMember(owner = "client!wga", name = "bg", descriptor = "F")
	public float aFloat62 = -1.0F;

	@OriginalMember(owner = "client!wga", name = "Xf", descriptor = "[F")
	public final float[] aFloatArray33 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wga", name = "ig", descriptor = "I")
	protected final int anInt1578 = 0;

	@OriginalMember(owner = "client!wga", name = "lg", descriptor = "Lclient!qv;")
	protected Class286 aClass286_4 = Static505.aClass286_7;

	@OriginalMember(owner = "client!wga", name = "hg", descriptor = "F")
	public float aFloat63 = 1.0F;

	@OriginalMember(owner = "client!wga", name = "ng", descriptor = "F")
	public float aFloat65 = -1.0F;

	@OriginalMember(owner = "client!wga", name = "Zf", descriptor = "I")
	private int anInt1573 = 16777215;

	@OriginalMember(owner = "client!wga", name = "kg", descriptor = "I")
	protected int anInt1579 = 0;

	@OriginalMember(owner = "client!wga", name = "se", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream3 = new Stream();

	@OriginalMember(owner = "client!wga", name = "xg", descriptor = "Lclient!haa;")
	private final Class30_Sub2 aClass30_Sub2_21 = new Class30_Sub2();

	@OriginalMember(owner = "client!wga", name = "Ve", descriptor = "I")
	protected final int anInt1554;

	@OriginalMember(owner = "client!wga", name = "vd", descriptor = "Lclient!in;")
	protected final Class157 aClass157_32;

	@OriginalMember(owner = "client!wga", name = "lb", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas lb;

	@OriginalMember(owner = "client!wga", name = "W", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!wga", name = "fb", descriptor = "Ljava/lang/Object;")
	protected final Object anObject6;

	@OriginalMember(owner = "client!wga", name = "cd", descriptor = "Ljava/lang/Object;")
	private Object anObject7;

	@OriginalMember(owner = "client!wga", name = "vc", descriptor = "I")
	private int anInt1452;

	@OriginalMember(owner = "client!wga", name = "Wb", descriptor = "I")
	public int anInt1428;

	@OriginalMember(owner = "client!wga", name = "Sb", descriptor = "I")
	private int anInt1424;

	@OriginalMember(owner = "client!wga", name = "rb", descriptor = "I")
	public int anInt1398;

	@OriginalMember(owner = "client!wga", name = "fg", descriptor = "I")
	public final int anInt1576;

	@OriginalMember(owner = "client!wga", name = "kb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!wga", name = "qf", descriptor = "Lclient!fw;")
	private final Class113 aClass113_3;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!in;II)V")
	protected Class20_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class157 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anInt1554 = arg4;
			this.aClass157_32 = arg3;
			this.aCanvas4 = this.lb = arg0;
			this.anObject7 = this.anObject6 = arg1;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt1428 = this.anInt1452 = local307.height;
			this.anInt1398 = this.anInt1424 = local307.width;
			this.anInt1576 = arg5;
			Static100.method2647(false, true);
			if (super.anInterface4_12 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt1576);
				this.aClass113_3 = null;
			} else {
				this.aClass113_3 = new Class113(this, super.anInterface4_12);
				this.aNativeInterface3 = new NativeInterface(super.anInterface4_12.method8047(), this.anInt1576);
				for (@Pc(364) int local364 = 0; super.anInterface4_12.method8047() > local364; local364++) {
					@Pc(372) Class127 local372 = super.anInterface4_12.method8048(local364);
					if (local372 != null) {
						this.aNativeInterface3.initTextureMetrics(local364, local372.aByte74, local372.aByte79);
					}
				}
			}
		} catch (@Pc(391) Throwable local391) {
			local391.printStackTrace();
			this.method7238();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wga", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass30_Sub2_16.method4053((float) arg0, (float) arg2, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt1558 * this.aClass30_Sub2_16.method4049((float) arg2, (float) arg1, (float) arg0) / local14);
			local58 = (int) ((float) this.anInt1561 * this.aClass30_Sub2_16.method4042((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local58 = this.anInt1559;
			local40 = this.anInt1542;
		}
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local40 - this.aFloat54);
		arg3[1] = (int) ((float) local58 - this.aFloat52);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method7254(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aNativeHeap4 = ((Class2_Sub2_Sub2) arg0).aNativeHeap5;
		this.aNativeHeapBuffer5 = this.aNativeHeap4.a(32768, false);
	}

	@OriginalMember(owner = "client!wga", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg1 * this.aClass30_Sub2_16.aFloat119 + this.aClass30_Sub2_16.aFloat130 * (float) arg0 + (float) arg2 * this.aClass30_Sub2_16.aFloat125 + this.aClass30_Sub2_16.aFloat127;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass30_Sub2_16.aFloat127 + this.aClass30_Sub2_16.aFloat119 * (float) arg4 + this.aClass30_Sub2_16.aFloat130 * (float) arg3 + (float) arg5 * this.aClass30_Sub2_16.aFloat125;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt1543 > local32 && (float) this.anInt1543 > local63) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt1567 && (float) this.anInt1567 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass30_Sub2_16.aFloat128 + (float) arg2 * this.aClass30_Sub2_16.aFloat121 + (float) arg0 * this.aClass30_Sub2_16.aFloat124 + this.aClass30_Sub2_16.aFloat120 * (float) arg1) * (float) this.anInt1558 / local32);
		@Pc(167) int local167 = (int) ((this.aClass30_Sub2_16.aFloat128 + this.aClass30_Sub2_16.aFloat120 * (float) arg4 + (float) arg3 * this.aClass30_Sub2_16.aFloat124 + (float) arg5 * this.aClass30_Sub2_16.aFloat121) * (float) this.anInt1558 / local63);
		if ((float) local135 < this.aFloat54 && (float) local167 < this.aFloat54) {
			local7 |= 0x1;
		} else if (this.aFloat57 < (float) local135 && (float) local167 > this.aFloat57) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt1561 * (this.aClass30_Sub2_16.aFloat129 * (float) arg2 + this.aClass30_Sub2_16.aFloat126 * (float) arg1 + (float) arg0 * this.aClass30_Sub2_16.aFloat122 + this.aClass30_Sub2_16.aFloat123) / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt1561 * ((float) arg5 * this.aClass30_Sub2_16.aFloat129 + (float) arg4 * this.aClass30_Sub2_16.aFloat126 + (float) arg3 * this.aClass30_Sub2_16.aFloat122 + this.aClass30_Sub2_16.aFloat123) / local63);
		if (this.aFloat52 > (float) local233 && (float) local265 < this.aFloat52) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat64 && (float) local265 > this.aFloat64) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I[Lclient!jl;)Lclient!np;")
	public abstract Class22 method1446(@OriginalArg(1) Class168[] arg0);

	@OriginalMember(owner = "client!wga", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt1573 != arg0;
		if (local15 || arg1 != this.aFloat62 || arg2 != this.aFloat65) {
			this.anInt1573 = arg0;
			this.aFloat62 = arg1;
			this.aFloat65 = arg2;
			if (local15) {
				this.aFloat49 = (float) (this.anInt1573 & 0xFF00) / 65280.0F;
				this.aFloat63 = (float) (this.anInt1573 & 0xFF0000) / 1.671168E7F;
				this.aFloat59 = (float) (this.anInt1573 & 0xFF) / 255.0F;
				this.method1562();
			}
			this.aNativeInterface3.setSunColour(this.aFloat63, this.aFloat49, this.aFloat59, arg1, arg2);
			this.method1476();
		}
		if (this.aFloatArray30[0] != arg3 || this.aFloatArray30[1] != arg4 || this.aFloatArray30[2] != arg5) {
			this.aFloatArray30[2] = arg5;
			this.aFloatArray30[1] = arg4;
			this.aFloatArray30[0] = arg3;
			this.aFloatArray29[2] = -arg5;
			this.aFloatArray29[0] = -arg3;
			this.aFloatArray29[1] = -arg4;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray33[1] = local153 * arg4;
			this.aFloatArray33[2] = local153 * arg5;
			this.aFloatArray33[0] = arg3 * local153;
			this.aFloatArray25[1] = -this.aFloatArray33[1];
			this.aFloatArray25[2] = -this.aFloatArray33[2];
			this.aFloatArray25[0] = -this.aFloatArray33[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray33[0], this.aFloatArray33[1], this.aFloatArray33[2]);
			this.method1526();
			this.anInt1560 = (int) (arg3 * 256.0F / arg4);
			this.anInt1553 = (int) (arg5 * 256.0F / arg4);
		}
		this.method1518();
	}

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "(Z)V")
	protected abstract void method1447();

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZZIB)V")
	public final void method1448(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 != this.anInt1547 || this.aBoolean127 != this.aBoolean129) {
			@Pc(28) Interface27 local28 = null;
			@Pc(30) int local30 = 0;
			@Pc(32) byte local32 = 0;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41 = this.aBoolean129 ? 3 : 0;
			if (arg2 < 0) {
				this.method1513();
			} else {
				local28 = this.aClass113_3.method3603(arg2);
				@Pc(55) Class127 local55 = super.anInterface4_12.method8048(arg2);
				if (local55.aByte73 == 0 && local55.aByte77 == 0) {
					this.method1513();
				} else {
					@Pc(73) int local73 = local55.aBoolean335 ? 64 : 128;
					@Pc(77) int local77 = local73 * 50;
					@Pc(81) Class30_Sub2 local81 = this.method1454();
					local81.method4036((float) (this.anInt1564 % local77 * local55.aByte77) / (float) local77, 0.0F, (float) (local55.aByte73 * (this.anInt1564 % local77)) / (float) local77);
					this.method1487(Static547.aClass332_6);
				}
				local30 = local55.anInt4660;
				if (!this.aBoolean129) {
					local32 = local55.aByte75;
					local41 = local55.aByte78;
					local34 = local55.anInt4661;
				}
			}
			this.method1509(local32, arg1, arg0, local41, local34);
			if (this.aClass17_3 == null) {
				this.method1484(local28);
				this.method1557(local30);
			} else {
				this.aClass17_3.method8064(local30, local28);
			}
			this.aBoolean127 = this.aBoolean129;
			this.anInt1547 = arg2;
		}
		this.anInt1546 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILclient!haa;)V")
	public final void method1449(@OriginalArg(1) Class30_Sub2 arg0) {
		this.aClass30_Sub2_15.method4653(arg0);
		this.aBoolean113 = false;
		this.method1470();
	}

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "(B)V")
	private void method1450() {
		this.anInterface22_9 = this.method1523(true);
		this.anInterface22_9.method764(24, 12);
		this.aClass22_20 = this.method1446(new Class168[] { new Class168(Static88.aClass69_1) });
	}

	@OriginalMember(owner = "client!wga", name = "h", descriptor = "(II)V")
	public final void method1451(@OriginalArg(1) int arg0) {
		if (this.anInt1572 == arg0) {
			return;
		}
		@Pc(25) Class266 local25;
		@Pc(27) boolean local27;
		@Pc(23) boolean local23;
		if (arg0 == 1) {
			local23 = true;
			local25 = Static142.aClass266_4;
			local27 = true;
		} else if (arg0 == 2) {
			local25 = Static288.aClass266_5;
			local27 = true;
			local23 = false;
		} else if (arg0 == 128) {
			local23 = true;
			local25 = Static586.aClass266_7;
			local27 = true;
		} else {
			local27 = false;
			local25 = Static513.aClass266_6;
			local23 = false;
		}
		if (local23 != this.aBoolean123) {
			this.aBoolean123 = local23;
			this.method1573();
		}
		if (local27 != this.aBoolean118) {
			this.aBoolean118 = local27;
			this.method1581();
		}
		if (local25 != this.aClass266_3) {
			this.aClass266_3 = local25;
			this.method1584();
		}
		this.anInt1546 &= 0xFFFFFFE3;
		this.anInt1572 = arg0;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method7264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static257.method4729(arg1, this, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "(Z)V")
	protected abstract void method1452();

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "(B)V")
	protected abstract void method1453();

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "(Z)Lclient!haa;")
	public final Class30_Sub2 method1454() {
		return this.aClass30_Sub2Array3[this.anInt1574];
	}

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "(I)V")
	public final void method1455() {
		this.method1566();
		this.method1563();
	}

	@OriginalMember(owner = "client!wga", name = "i", descriptor = "(II)Lclient!uq;")
	public final Interface24 method1456(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface24_3.method6473()) {
			this.anInterface24_3.method6476(arg0);
		}
		return this.anInterface24_3;
	}

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "(B)V")
	protected void method1457() {
		this.anInt1556 = this.anInt1566;
		this.anInt1566 = 0;
	}

	@OriginalMember(owner = "client!wga", name = "w", descriptor = "()Z")
	@Override
	public final boolean method7302() {
		return this.aBoolean132;
	}

	@OriginalMember(owner = "client!wga", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7311() {
		return false;
	}

	@OriginalMember(owner = "client!wga", name = "j", descriptor = "(I)V")
	public final void method1459() {
		if (this.anInt1546 == 8) {
			return;
		}
		this.method1529();
		this.method1472(true);
		this.method1524(true);
		this.method1580(true);
		this.method1451(1);
		this.anInt1546 = 8;
	}

	@OriginalMember(owner = "client!wga", name = "h", descriptor = "()V")
	@Override
	protected void method7255() {
		if (this.aBoolean131) {
			return;
		}
		for (@Pc(13) Class2 local13 = this.aClass341_11.method8524(); local13 != null; local13 = this.aClass341_11.method8519()) {
			((Class2_Sub2_Sub2) local13).method2414();
		}
		@Pc(30) Enumeration local30 = this.aHashtable3.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method1545(local36, this.aHashtable3.get(local36));
		}
		Static585.method8659(true, false);
		this.aNativeInterface3.release();
		this.aBoolean131 = true;
	}

	@OriginalMember(owner = "client!wga", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass30_Sub2_16.method4053((float) arg0, (float) arg2, (float) arg1);
		if ((float) this.anInt1543 > local14 || (float) this.anInt1567 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt1558 * this.aClass30_Sub2_16.method4049((float) arg2, (float) arg1, (float) arg0) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt1561 * this.aClass30_Sub2_16.method4042((float) arg0, (float) arg2, (float) arg1) / (float) arg3);
		arg4[2] = (int) local14;
		arg4[1] = (int) ((float) local77 - this.aFloat52);
		arg4[0] = (int) ((float) local58 - this.aFloat54);
	}

	@OriginalMember(owner = "client!wga", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7273() {
		return true;
	}

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "(B)I")
	public final int method1460() {
		return this.anInt1575;
	}

	@OriginalMember(owner = "client!wga", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!bca;)V")
	@Override
	public final void method7241(@OriginalArg(0) Class30 arg0) {
		this.aClass30_Sub2_16 = (Class30_Sub2) arg0;
		this.aClass30_Sub2_18.method4653(this.aClass30_Sub2_16);
		this.aClass30_Sub2_18.method4054();
		this.aClass30_Sub2_19.method4051(this.aClass30_Sub2_18);
		this.aClass30_Sub2_17.method4051(this.aClass30_Sub2_16);
		if (this.aClass286_4.method7446()) {
			this.method1547();
		}
	}

	@OriginalMember(owner = "client!wga", name = "g", descriptor = "(B)V")
	protected abstract void method1461();

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "(Z)V")
	private void method1462() {
		this.anInterface22_7 = this.method1523(false);
		this.anInterface22_7.method764(140, 28);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface22_7.method763();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method1527(local28);
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
				local35.a();
				if (this.anInterface22_7.method762()) {
					break;
				}
			}
		}
		this.aClass22_17 = this.method1446(new Class168[] { new Class168(new Class69[] { Static88.aClass69_1, Static88.aClass69_5, Static88.aClass69_5 }) });
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!kf;IBZ)V")
	protected abstract void method1463(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I[IZBIII)Lclient!wfa;")
	public abstract Interface27 method1464(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
	@Override
	public final void method7234(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wga", name = "h", descriptor = "(B)V")
	private void method1465() {
		this.aBoolean114 = false;
		this.method1540();
		if (Static445.aClass286_6 == this.aClass286_4) {
			this.method1563();
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IB)Lclient!fj;")
	protected Class17 method1466(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class17_Sub11(this);
		} else if (arg0 == 1) {
			return new Class17_Sub2(this);
		} else if (arg0 == 2) {
			return new Class17_Sub6(this, this.aClass347_3);
		} else if (arg0 == 7) {
			return new Class17_Sub8(this);
		} else {
			return new Class17_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!wga", name = "i", descriptor = "(B)I")
	public final int method1467() {
		return this.anInt1577;
	}

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "(I)Lclient!nj;")
	public final Interface19 method1468() {
		return this.aClass78_Sub2_3 == null ? null : this.aClass78_Sub2_3.method5432();
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "([FI)[F")
	public final float[] method1469(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray28[0];
		arg0[4] = this.aFloatArray28[1];
		arg0[12] = this.aFloatArray28[3];
		arg0[8] = this.aFloatArray28[2];
		arg0[9] = this.aFloatArray28[6];
		arg0[13] = this.aFloatArray28[7];
		arg0[2] = this.aFloatArray28[8];
		arg0[1] = this.aFloatArray28[4];
		arg0[5] = this.aFloatArray28[5];
		arg0[10] = this.aFloatArray28[10];
		arg0[14] = this.aFloatArray28[11];
		arg0[3] = this.aFloatArray28[12];
		arg0[6] = this.aFloatArray28[9];
		arg0[7] = this.aFloatArray28[13];
		arg0[15] = this.aFloatArray28[15];
		arg0[11] = this.aFloatArray28[14];
		return arg0;
	}

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "(I)V")
	private void method1470() {
		if (Static396.aClass286_5 == this.aClass286_4) {
			@Pc(7) float local7 = this.method1492();
			this.aClass30_Sub2_15.method4040(local7, 0.0F, local7);
		}
		this.aBoolean120 = false;
		this.method1535();
		if (this.aClass17_3 != null) {
			this.aClass17_3.method8060();
		}
	}

	@OriginalMember(owner = "client!wga", name = "g", descriptor = "(Z)[F")
	public final float[] method1471() {
		return this.aFloatArray26;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZZ)V")
	public final void method1472(@OriginalArg(1) boolean arg0) {
		if (this.bf != arg0) {
			this.bf = arg0;
			this.method1461();
			this.anInt1546 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIZ[I)Lclient!wfa;")
	public final Interface27 method1473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		return this.method1464(arg1, arg3, arg2, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IZ)Lclient!uq;")
	public abstract Interface24 method1474(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!wga", name = "j", descriptor = "(B)V")
	protected abstract void method1475();

	@OriginalMember(owner = "client!wga", name = "h", descriptor = "(Z)V")
	protected abstract void method1476();

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIII[BLclient!wq;IZ)Lclient!wfa;")
	protected abstract Interface27 method1477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) Class375 arg3, @OriginalArg(7) boolean arg4);

	@OriginalMember(owner = "client!wga", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt1550 = 0;
		while (arg0 > 1) {
			this.anInt1550++;
			arg0 >>= 0x1;
		}
		this.anInt1557 = 0x1 << this.anInt1550;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method1478(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!wga", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1537();
		this.method1528(arg4);
		this.method1483(0, Static165.aClass177_3);
		this.method1519(0, Static165.aClass177_3);
		this.method1451(arg5);
		this.aClass30_Sub2_15.method4052(1.0F, (float) arg3, (float) arg2);
		this.aClass30_Sub2_15.method4646(arg0, arg1, 0);
		this.method1549();
		this.method1560(false);
		this.method1567();
		this.method1560(true);
		this.method1519(0, Static118.aClass177_1);
		this.method1483(0, Static118.aClass177_1);
	}

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "(B)V")
	private void method1479() {
		if (Static396.aClass286_5 == this.aClass286_4) {
			return;
		}
		@Pc(6) Class286 local6 = this.aClass286_4;
		this.aClass286_4 = Static396.aClass286_5;
		if (local6.method7446()) {
			this.method1547();
		}
		this.method1553();
		this.aFloatArray28 = this.aFloatArray27;
		this.method1563();
		this.anInt1546 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "(B)V")
	private void method1480() {
		this.aBoolean117 = false;
		this.method1583();
		if (Static24.aClass286_1 == this.aClass286_4) {
			this.method1563();
		}
	}

	@OriginalMember(owner = "client!wga", name = "m", descriptor = "(I)V")
	private void method1481() {
		if (Static24.aClass286_1 == this.aClass286_4) {
			return;
		}
		@Pc(11) Class286 local11 = this.aClass286_4;
		this.aClass286_4 = Static24.aClass286_1;
		if (!local11.method7446()) {
			this.method1547();
		}
		this.method1583();
		this.aFloatArray28 = this.aFloatArray32;
		this.method1563();
		this.anInt1546 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wga", name = "n", descriptor = "(I)Lclient!haa;")
	public final Class30_Sub2 method1482() {
		return this.aClass30_Sub2Array3[this.anInt1574];
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(BILclient!kf;)V")
	public final void method1483(@OriginalArg(1) int arg0, @OriginalArg(2) Class177 arg1) {
		this.method1558(false, arg0, arg1, false);
	}

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method7312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(37) float local37 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local10 * local10)));
			local16 *= local37;
			local10 *= local37;
		}
		if (!this.method1512((float) arg1, (float) arg2 + local10, 0.0F, local16 + (float) arg3, 0.0F, (float) arg0)) {
			return;
		}
		this.method1537();
		this.method1528(arg4);
		this.method1483(0, Static165.aClass177_3);
		this.method1519(0, Static165.aClass177_3);
		this.method1451(arg5);
		this.method1576();
		this.method1560(false);
		this.method1541();
		this.method1560(true);
		this.method1519(0, Static118.aClass177_1);
		this.method1483(0, Static118.aClass177_1);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(BLclient!du;)V")
	public final void method1484(@OriginalArg(1) Interface7 arg0) {
		if (this.anInterface7Array3[this.anInt1574] == arg0) {
			return;
		}
		this.anInterface7Array3[this.anInt1574] = arg0;
		if (arg0 == null) {
			this.method1453();
		} else {
			arg0.method8286();
		}
		this.anInt1546 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "()Lclient!bca;")
	@Override
	public final Class30 method7243() {
		return this.aClass30_Sub2_16;
	}

	@OriginalMember(owner = "client!wga", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Interface27 local9 = local6.anInterface27_4;
		this.method1498();
		this.method1484(local9);
		this.method1451(1);
		this.method1508(Static492.aClass315_4, Static492.aClass315_4);
		this.method1483(0, Static165.aClass177_3);
		this.method1528(arg0);
		this.aClass30_Sub2_15.method4052(0.0F, (float) this.anInt1428, (float) this.anInt1398);
		this.method1549();
		this.aClass30_Sub2Array3[0].method4052(1.0F, local9.method8305((float) this.anInt1428), local9.method8301((float) this.anInt1398));
		this.aClass30_Sub2Array3[0].method4040(local9.method8305((float) -arg3), 0.0F, local9.method8301((float) -arg2));
		this.aClass332Array3[0] = Static547.aClass332_6;
		this.method1539();
		this.method1567();
		this.method1513();
		this.method1483(0, Static118.aClass177_1);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!bh;IIII)Lclient!ka;")
	@Override
	public final Class166 method7228(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class166_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7272(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.lb) {
			local5 = this.anObject7;
		} else if (this.aHashtable3.containsKey(arg0)) {
			local5 = this.aHashtable3.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method1478(arg0, local5);
		if (arg0 == this.aCanvas4) {
			this.method1551();
		}
	}

	@OriginalMember(owner = "client!wga", name = "o", descriptor = "(I)V")
	protected abstract void method1485();

	@OriginalMember(owner = "client!wga", name = "t", descriptor = "()Z")
	@Override
	public final boolean method7297() {
		return false;
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(IZ)V")
	public final void method1486(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean125) {
			this.aBoolean125 = arg0;
			this.method1461();
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILclient!tr;)V")
	public final void method1487(@OriginalArg(1) Class332 arg0) {
		this.aClass332Array3[this.anInt1574] = arg0;
		this.method1539();
	}

	@OriginalMember(owner = "client!wga", name = "u", descriptor = "()Z")
	@Override
	public final boolean method7298() {
		return true;
	}

	@OriginalMember(owner = "client!wga", name = "m", descriptor = "(B)Lclient!haa;")
	public final Class30_Sub2 method1488() {
		return this.aClass30_Sub2_19;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!wq;II[FZIII)Lclient!wfa;")
	protected abstract Interface27 method1489(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!wga", name = "n", descriptor = "(B)V")
	private void method1490() {
		if (this.aClass17_3 != null) {
			this.aClass17_3.method8059();
		}
		this.method1485();
	}

	@OriginalMember(owner = "client!wga", name = "o", descriptor = "(B)V")
	public final void method1491() {
		if (this.anInt1546 == 16) {
			return;
		}
		this.method1481();
		this.method1472(true);
		this.method1524(true);
		this.method1580(true);
		this.method1451(1);
		this.anInt1546 = 16;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIZ)Lclient!mi;")
	@Override
	public final Class46 method7232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class46_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wga", name = "i", descriptor = "(Z)F")
	protected abstract float method1492();

	@OriginalMember(owner = "client!wga", name = "p", descriptor = "(I)V")
	protected abstract void method1493();

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!hj;II)V")
	private void method1494(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1) {
		this.method1559(this.anInterface22_7, 0);
		this.method1496(this.aClass22_17);
		this.method1533(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IBILclient!baa;Lclient!wq;)Lclient!wfa;")
	public abstract Interface27 method1495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) Class375 arg3);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILclient!np;)V")
	public abstract void method1496(@OriginalArg(1) Class22 arg0);

	@OriginalMember(owner = "client!wga", name = "q", descriptor = "(I)I")
	public final int method1497() {
		return this.anInt1545;
	}

	@OriginalMember(owner = "client!wga", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1549;
		arg0[3] = this.anInt1544;
		arg0[2] = this.anInt1579;
		arg0[1] = this.anInt1571;
	}

	@OriginalMember(owner = "client!wga", name = "r", descriptor = "(I)V")
	public final void method1498() {
		if (this.anInt1546 == 2) {
			return;
		}
		this.method1479();
		this.method1472(false);
		this.method1500(false);
		this.method1524(false);
		this.method1580(false);
		this.method1448(false, false, -2);
		this.anInt1546 = 2;
	}

	@OriginalMember(owner = "client!wga", name = "y", descriptor = "()Lclient!bca;")
	@Override
	public final Class30 method7308() {
		return this.aClass30_Sub2_21;
	}

	@OriginalMember(owner = "client!wga", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean121 = arg0;
		this.method1475();
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZI)V")
	public final void method1499(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean116) {
			this.aBoolean116 = arg0;
			this.method1452();
		}
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(ZZ)V")
	public final void method1500(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean124 != arg0) {
			this.aBoolean124 = arg0;
			this.method1517();
			this.anInt1546 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method7306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7242() {
		return this.aClass17Array3[3].method8067();
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(FI)V")
	public final void method1501(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat56) {
			this.aFloat56 = arg0;
			this.method1480();
		}
	}

	@OriginalMember(owner = "client!wga", name = "j", descriptor = "(Z)V")
	protected abstract void method1502();

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(BZI)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method1503(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap4.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!wga", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt1538 + this.anInt1523 + this.anInt1524;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!bf;I)V")
	public abstract void method1505(@OriginalArg(0) Class31 arg0);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IILclient!wq;ZI[B)Lclient!ir;")
	public abstract Interface13 method1506(@OriginalArg(2) Class375 arg0, @OriginalArg(5) byte[] arg1);

	@OriginalMember(owner = "client!wga", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt1398 - 1 <= arg2 && arg1 <= 0 && this.anInt1428 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt1571 = arg1 >= 0 ? arg1 : 0;
		this.anInt1549 = arg0 < 0 ? 0 : arg0;
		this.anInt1544 = arg3 <= this.anInt1398 ? arg3 : 0;
		this.anInt1579 = arg2 > this.anInt1398 ? 0 : arg2;
		if (!this.aBoolean133) {
			this.aBoolean133 = true;
			this.method1555();
		}
		this.method1522();
		this.method1538();
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class65 method7251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class65_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "(I)V")
	@Override
	public final void method7253() {
	}

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "(I)V")
	@Override
	public final void method7281(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!sia;ILclient!sia;)V")
	public final void method1508(@OriginalArg(0) Class315 arg0, @OriginalArg(2) Class315 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg1 != this.aClass315Array5[this.anInt1574]) {
			this.aClass315Array5[this.anInt1574] = arg1;
			this.method1554();
			local5 = true;
		}
		if (this.aClass315Array6[this.anInt1574] != arg0) {
			this.aClass315Array6[this.anInt1574] = arg0;
			local5 = true;
			this.method1569();
		}
		if (local5) {
			this.anInt1546 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!wga", name = "h", descriptor = "(I)V")
	@Override
	public final void method7299(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass113_3 != null) {
			this.aClass113_3.method3601();
		}
		this.anInt1565 = arg0;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IZZIII)V")
	private void method1509(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) boolean local14 = arg2 & this.method7242();
		if (!local14 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
			arg3 = 2;
			arg4 = 1;
			arg0 = 0;
		}
		if (arg3 != 0 && arg1) {
			arg3 |= Integer.MIN_VALUE;
		}
		if (this.anInt1568 != arg3) {
			if (this.anInt1568 != 0) {
				this.aClass17Array3[Integer.MAX_VALUE & this.anInt1568].method8057();
			}
			if (arg3 == 0) {
				this.aClass17_3 = null;
			} else {
				this.aClass17_3 = this.aClass17Array3[Integer.MAX_VALUE & arg3];
				this.aClass17_3.method8062(arg1);
				this.aClass17_3.method8058(arg1);
				this.aClass17_3.method8063(arg0, arg4);
			}
			this.anInt1568 = arg3;
			this.anInt1569 = arg0;
			this.anInt1551 = arg4;
		} else if (this.anInt1568 != 0) {
			this.aClass17Array3[Integer.MAX_VALUE & this.anInt1568].method8058(arg1);
			if (this.anInt1569 != arg0 || this.anInt1551 != arg4) {
				this.aClass17Array3[this.anInt1568 & Integer.MAX_VALUE].method8063(arg0, arg4);
				this.anInt1551 = arg4;
				this.anInt1569 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!wga", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1537();
		this.method1528(arg3);
		this.method1483(0, Static165.aClass177_3);
		this.method1519(0, Static165.aClass177_3);
		this.method1451(arg4);
		this.aClass30_Sub2_15.method4052(1.0F, (float) arg2, (float) arg2);
		this.aClass30_Sub2_15.method4646(arg0, arg1, 0);
		this.method1549();
		this.method1560(false);
		this.method1559(this.anInterface22_8, 0);
		this.method1496(this.aClass22_15);
		this.method1533(256, 0, Static150.aClass134_3);
		this.method1560(true);
		this.method1519(0, Static118.aClass177_1);
		this.method1483(0, Static118.aClass177_1);
	}

	@OriginalMember(owner = "client!wga", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt1543;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method1510(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!wga", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt1579 = this.anInt1398;
		this.anInt1544 = this.anInt1428;
		this.anInt1571 = 0;
		this.anInt1549 = 0;
		if (this.aBoolean133) {
			this.aBoolean133 = false;
			this.method1555();
		}
		this.method1538();
	}

	@OriginalMember(owner = "client!wga", name = "p", descriptor = "(B)I")
	public final int method1511() {
		return this.anInt1574;
	}

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1543 == arg0 && arg1 == this.anInt1567) {
			return;
		}
		this.anInt1567 = arg1;
		this.anInt1543 = arg0;
		this.method1465();
		this.method1480();
		this.method1490();
	}

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "(IIIIII)Lclient!wh;")
	@Override
	public final Class78 method7300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class78_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(FIFFFFF)Z")
	private boolean method1512(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(13) Buffer local13 = this.anInterface22_9.method763();
		if (local13 == null) {
			return false;
		}
		@Pc(22) Stream local22 = this.method1527(local13);
		if (Stream.c()) {
			local22.a(arg5);
			local22.a(arg0);
			local22.a(arg2);
			local22.a(arg1);
			local22.a(arg3);
			local22.a(arg4);
		} else {
			local22.b(arg5);
			local22.b(arg0);
			local22.b(arg2);
			local22.b(arg1);
			local22.b(arg3);
			local22.b(arg4);
		}
		local22.a();
		return this.anInterface22_9.method762();
	}

	@OriginalMember(owner = "client!wga", name = "t", descriptor = "(I)V")
	public final void method1513() {
		if (this.aClass332Array3[this.anInt1574] != Static263.aClass332_3) {
			this.aClass332Array3[this.anInt1574] = Static263.aClass332_3;
			this.aClass30_Sub2Array3[this.anInt1574].method4665();
			this.method1539();
		}
	}

	@OriginalMember(owner = "client!wga", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1577 = arg2;
		this.anInt1575 = arg3;
		this.anInt1545 = arg1;
		this.aBoolean129 = true;
		this.anInt1570 = arg0;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!baa;Lclient!wq;B)Z")
	public abstract boolean method1514(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class375 arg1);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	protected abstract void method1515(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!wga", name = "q", descriptor = "(B)V")
	protected void method1516() {
		this.method1550();
	}

	@OriginalMember(owner = "client!wga", name = "u", descriptor = "(I)V")
	protected abstract void method1517();

	@OriginalMember(owner = "client!wga", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat51 != arg0) {
			this.aFloat51 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method1562();
			this.method1518();
		}
	}

	@OriginalMember(owner = "client!wga", name = "r", descriptor = "(B)V")
	protected abstract void method1518();

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "()Z")
	@Override
	public final boolean method7258() {
		return true;
	}

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "(I)V")
	@Override
	public final void method7262(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "()Z")
	@Override
	public final boolean method7247() {
		return true;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method7279() {
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IZLclient!kf;)V")
	public final void method1519(@OriginalArg(0) int arg0, @OriginalArg(2) Class177 arg1) {
		this.method1463(arg1, arg0);
	}

	@OriginalMember(owner = "client!wga", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt1549 < arg0) {
			local5 = true;
			this.anInt1549 = arg0;
		}
		if (arg2 < this.anInt1579) {
			this.anInt1579 = arg2;
			local5 = true;
		}
		if (arg1 > this.anInt1571) {
			local5 = true;
			this.anInt1571 = arg1;
		}
		if (arg3 < this.anInt1544) {
			this.anInt1544 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean133) {
			this.aBoolean133 = true;
			this.method1555();
		}
		this.method1522();
		this.method1538();
	}

	@OriginalMember(owner = "client!wga", name = "s", descriptor = "(B)Lclient!haa;")
	public final Class30_Sub2 method1521() {
		return this.aClass30_Sub2_18;
	}

	@OriginalMember(owner = "client!wga", name = "w", descriptor = "(I)V")
	protected abstract void method1522();

	@OriginalMember(owner = "client!wga", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7285() {
		return true;
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(ZI)Lclient!tc;")
	public abstract Interface22 method1523(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZB)V")
	public final void method1524(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean130) {
			this.aBoolean130 = arg0;
			this.method1493();
			this.anInt1546 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "([FIILclient!wq;IZ)Lclient!wfa;")
	public final Interface27 method1525(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class375 arg3, @OriginalArg(5) boolean arg4) {
		return this.method1489(arg3, arg1, arg0, arg4, arg2);
	}

	@OriginalMember(owner = "client!wga", name = "x", descriptor = "(I)V")
	public abstract void method1526();

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;I)Lclient!jaclib/memory/Stream;")
	public final Stream method1527(@OriginalArg(0) Buffer arg0) {
		this.aStream3.a(arg0);
		return this.aStream3;
	}

	@OriginalMember(owner = "client!wga", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean129) {
			throw new RuntimeException("");
		}
		this.anInt1577 = arg2;
		this.anInt1570 = arg0;
		this.anInt1575 = arg3;
		this.anInt1545 = arg1;
		if (this.aBoolean127) {
			this.aClass17Array3[3].method8065();
			this.aClass17Array3[3].method8059();
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "([I)V")
	@Override
	public final void method7235(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt1428;
		arg0[0] = this.anInt1398;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!wh;)V")
	@Override
	public final void method7256(@OriginalArg(0) Class78 arg0) {
		this.aClass78_Sub2_3 = (Class78_Sub2) arg0;
	}

	@OriginalMember(owner = "client!wga", name = "j", descriptor = "(II)V")
	public final void method1528(@OriginalArg(1) int arg0) {
		if (this.anInt1555 != arg0) {
			this.anInt1555 = arg0;
			this.method1579();
		}
	}

	@OriginalMember(owner = "client!wga", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1563 == arg0 && this.anInt1541 == arg1 && this.anInt1548 == arg2) {
			return;
		}
		this.anInt1563 = arg0;
		this.anInt1548 = arg2;
		this.anInt1541 = arg1;
		this.method1490();
		this.method1461();
	}

	@OriginalMember(owner = "client!wga", name = "y", descriptor = "(I)V")
	private void method1529() {
		if (Static445.aClass286_6 == this.aClass286_4) {
			return;
		}
		@Pc(16) Class286 local16 = this.aClass286_4;
		this.aClass286_4 = Static445.aClass286_6;
		if (!local16.method7446()) {
			this.method1547();
		}
		this.method1540();
		this.aFloatArray28 = this.aFloatArray31;
		this.method1563();
		this.anInt1546 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "(II)V")
	public final void method1531(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt1574) {
			this.anInt1574 = arg0;
			this.method1502();
		}
	}

	@OriginalMember(owner = "client!wga", name = "z", descriptor = "(I)V")
	protected abstract void method1532();

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7233(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IILclient!hj;Z)V")
	public abstract void method1533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class134 arg2);

	@OriginalMember(owner = "client!wga", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1559 = arg1;
		this.anInt1561 = arg3;
		this.anInt1542 = arg0;
		this.anInt1558 = arg2;
		this.method1480();
		this.method1465();
		this.method1566();
		this.method1538();
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "([[IZII)Lclient!nj;")
	public abstract Interface19 method1534(@OriginalArg(0) int[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wga", name = "t", descriptor = "(B)V")
	protected abstract void method1535();

	@OriginalMember(owner = "client!wga", name = "u", descriptor = "(B)V")
	protected final void method1536() {
		@Pc(21) Hashtable local21 = new Hashtable();
		if (this.aHashtable3 != null && !this.aHashtable3.isEmpty()) {
			@Pc(32) Enumeration local32 = this.aHashtable3.keys();
			while (local32.hasMoreElements()) {
				@Pc(38) Canvas local38 = (Canvas) local32.nextElement();
				local21.put(local38, this.method1510(local38));
			}
		}
		this.aHashtable3 = local21;
		this.method1462();
		this.method1450();
		this.method1548();
		this.aClass356_3.method8748(this);
	}

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "(Z)V")
	private void method1537() {
		if (this.anInt1546 == 1) {
			return;
		}
		this.method1479();
		this.method1472(false);
		this.method1500(false);
		this.method1524(false);
		this.method1580(false);
		this.method1448(false, false, -2);
		this.method1557(1);
		this.method1484(this.anInterface7_3);
		this.anInt1546 = 1;
	}

	@OriginalMember(owner = "client!wga", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass30_Sub2_16.aFloat127 + this.aClass30_Sub2_16.aFloat119 * (float) arg1 + (float) arg0 * this.aClass30_Sub2_16.aFloat130 + (float) arg2 * this.aClass30_Sub2_16.aFloat125;
		@Pc(57) float local57 = this.aClass30_Sub2_16.aFloat130 * (float) arg3 + this.aClass30_Sub2_16.aFloat119 * (float) arg4 + this.aClass30_Sub2_16.aFloat125 * (float) arg5 + this.aClass30_Sub2_16.aFloat127;
		if ((float) this.anInt1543 > local32 && local57 < (float) this.anInt1543) {
			local7 |= 0x10;
		} else if ((float) this.anInt1567 < local32 && (float) this.anInt1567 < local57) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) (((float) arg1 * this.aClass30_Sub2_16.aFloat120 + (float) arg0 * this.aClass30_Sub2_16.aFloat124 + (float) arg2 * this.aClass30_Sub2_16.aFloat121 + this.aClass30_Sub2_16.aFloat128) * (float) this.anInt1558 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt1558 * (this.aClass30_Sub2_16.aFloat128 + (float) arg3 * this.aClass30_Sub2_16.aFloat124 + (float) arg4 * this.aClass30_Sub2_16.aFloat120 + (float) arg5 * this.aClass30_Sub2_16.aFloat121) / (float) arg6);
		if (this.aFloat54 > (float) local124 && (float) local157 < this.aFloat54) {
			local7 |= 0x1;
		} else if (this.aFloat57 < (float) local124 && (float) local157 > this.aFloat57) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt1561 * (this.aClass30_Sub2_16.aFloat123 + this.aClass30_Sub2_16.aFloat129 * (float) arg2 + this.aClass30_Sub2_16.aFloat122 * (float) arg0 + this.aClass30_Sub2_16.aFloat126 * (float) arg1) / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt1561 * (this.aClass30_Sub2_16.aFloat129 * (float) arg5 + (float) arg3 * this.aClass30_Sub2_16.aFloat122 + (float) arg4 * this.aClass30_Sub2_16.aFloat126 + this.aClass30_Sub2_16.aFloat123) / (float) arg6);
		if ((float) local224 < this.aFloat52 && this.aFloat52 > (float) local257) {
			local7 |= 0x4;
		} else if (this.aFloat64 < (float) local224 && this.aFloat64 < (float) local257) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wga", name = "A", descriptor = "(I)V")
	private void method1538() {
		this.aFloat52 = this.anInt1571 - this.anInt1559;
		this.aFloat54 = this.anInt1549 - this.anInt1542;
		this.aFloat64 = this.anInt1544 - this.anInt1559;
		this.aFloat57 = this.anInt1579 - this.anInt1542;
	}

	@OriginalMember(owner = "client!wga", name = "v", descriptor = "(B)V")
	private void method1539() {
		this.method1574();
		if (this.aClass17_3 != null) {
			this.aClass17_3.method8069();
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7246(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.lb) {
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
			@Pc(53) Object local53 = this.method1510(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable3.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!wga", name = "x", descriptor = "()I")
	@Override
	public final int method7307() {
		return this.anInt1562 - 2;
	}

	@OriginalMember(owner = "client!wga", name = "w", descriptor = "(B)V")
	private void method1540() {
		if (this.aBoolean114) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray31;
		@Pc(25) float local25 = (float) (this.anInt1543 * -this.anInt1542) / (float) this.anInt1558;
		@Pc(40) float local40 = (float) (this.anInt1543 * (this.anInt1398 - this.anInt1542)) / (float) this.anInt1558;
		@Pc(51) float local51 = (float) (this.anInt1543 * this.anInt1559) / (float) this.anInt1561;
		@Pc(66) float local66 = (float) (this.anInt1543 * (this.anInt1559 - this.anInt1428)) / (float) this.anInt1561;
		if (local25 == local40 || local51 == local66) {
			local13[12] = 0.0F;
			local13[0] = 1.0F;
			local13[13] = 0.0F;
			local13[4] = 0.0F;
			local13[3] = 0.0F;
			local13[10] = 1.0F;
			local13[15] = 1.0F;
			local13[9] = 0.0F;
			local13[14] = 0.0F;
			local13[1] = 0.0F;
			local13[2] = 0.0F;
			local13[11] = 0.0F;
			local13[6] = 0.0F;
			local13[7] = 0.0F;
			local13[8] = 0.0F;
			local13[5] = 1.0F;
		} else {
			@Pc(146) float local146 = (float) this.anInt1543 * 2.0F;
			local13[13] = 0.0F;
			local13[3] = 0.0F;
			local13[2] = 0.0F;
			local13[11] = -1.0F;
			local13[7] = 0.0F;
			local13[5] = local146 / (local51 - local66);
			local13[1] = 0.0F;
			local13[12] = 0.0F;
			local13[14] = this.aFloat55 = (float) (this.anInt1567 * this.anInt1543) / (float) (this.anInt1543 - this.anInt1567);
			local13[0] = local146 / (local40 - local25);
			local13[15] = 0.0F;
			local13[8] = (local40 + local25) / (-local25 + local40);
			local13[9] = (local51 + local66) / (local51 - local66);
			local13[10] = this.aFloat58 = (float) this.anInt1567 / (float) (this.anInt1543 - this.anInt1567);
			local13[4] = 0.0F;
			local13[6] = 0.0F;
		}
		this.method1546();
		this.aBoolean114 = true;
	}

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "(Z)V")
	private void method1541() {
		this.method1559(this.anInterface22_9, 0);
		this.method1496(this.aClass22_20);
		this.method1533(1, 0, Static545.aClass134_7);
	}

	@OriginalMember(owner = "client!wga", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt1542, this.anInt1559, this.anInt1558, this.anInt1561 };
	}

	@OriginalMember(owner = "client!wga", name = "x", descriptor = "(B)V")
	private void method1542() {
		this.aFloat50 = this.anInt1567;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(IIIIZ)Lclient!mi;")
	@Override
	public final Class46 method7286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class46_Sub2 local11 = new Class46_Sub2(this, arg2, arg3, arg4);
		local11.method6218(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(BI)V")
	public final void method1543(@OriginalArg(0) byte arg0) {
		this.method1528(arg0 | arg0 << 8 | arg0 << 16 | arg0 << 24);
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(BI)V")
	public abstract void method1544(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!mda;I)V")
	@Override
	public final void method7288(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1) {
		this.aClass356_3.method8749(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!rh;Z)Lclient!mi;")
	@Override
	public final Class46 method7294(@OriginalArg(0) Class296 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(24) Class46 local24;
		if (arg0.anInt9028 == 0 || arg0.anInt9024 == 0) {
			local24 = this.method7265(1, new int[1], 1, 1);
		} else {
			@Pc(33) int[] local33 = new int[arg0.anInt9028 * arg0.anInt9024];
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			@Pc(42) int local42;
			@Pc(46) int local46;
			if (arg0.aByteArray116 == null) {
				for (local42 = 0; local42 < arg0.anInt9024; local42++) {
					for (local46 = 0; local46 < arg0.anInt9028; local46++) {
						@Pc(59) int local59 = arg0.anIntArray582[arg0.aByteArray117[local35++] & 0xFF];
						local33[local37++] = local59 == 0 ? 0 : local59 | 0xFF000000;
					}
				}
			} else {
				for (local42 = 0; local42 < arg0.anInt9024; local42++) {
					for (local46 = 0; local46 < arg0.anInt9028; local46++) {
						local33[local37++] = arg0.anIntArray582[arg0.aByteArray117[local35] & 0xFF] | arg0.aByteArray116[local35] << 24;
						local35++;
					}
				}
			}
			local24 = this.method7265(arg0.anInt9028, local33, arg0.anInt9028, arg0.anInt9024);
		}
		local24.method6224(arg0.anInt9029, arg0.anInt9026, arg0.anInt9025, arg0.anInt9027);
		return local24;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method7239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "()V")
	@Override
	public final void method7266() {
		if (this.aClass113_3 != null) {
			this.aClass113_3.method3601();
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	protected abstract void method1545(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!wga", name = "j", descriptor = "()Lclient!bca;")
	@Override
	public final Class30 method7257() {
		return new Class30_Sub2();
	}

	@OriginalMember(owner = "client!wga", name = "B", descriptor = "(I)V")
	private void method1546() {
		this.aFloatArray31[14] = this.aFloat55;
		this.aFloatArray31[10] = this.aFloat58;
		this.aFloat60 = (this.aFloatArray31[14] - (float) this.anInt1567) / this.aFloatArray31[10];
	}

	@OriginalMember(owner = "client!wga", name = "y", descriptor = "(B)V")
	private void method1547() {
		this.aBoolean120 = false;
		if (this.aClass17_3 != null) {
			this.aClass17_3.method8068();
		}
		this.method1532();
	}

	@OriginalMember(owner = "client!wga", name = "z", descriptor = "(B)V")
	private void method1548() {
		this.anInterface22_8 = this.method1523(false);
		this.anInterface22_8.method764(3096, 12);
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			@Pc(32) Buffer local32 = this.anInterface22_8.method763();
			if (local32 != null) {
				@Pc(39) Stream local39 = this.method1527(local32);
				local39.a(0.0F);
				local39.a(0.0F);
				local39.a(0.0F);
				for (@Pc(50) int local50 = 0; local50 <= 256; local50++) {
					@Pc(61) double local61 = (double) (local50 * 2) * 3.141592653589793D / 256.0D;
					@Pc(65) float local65 = (float) Math.cos(local61);
					@Pc(69) float local69 = (float) Math.sin(local61);
					if (Stream.c()) {
						local39.a(local69);
						local39.a(local65);
						local39.a(0.0F);
					} else {
						local39.b(local69);
						local39.b(local65);
						local39.b(0.0F);
					}
				}
				local39.a();
				if (this.anInterface22_8.method762()) {
					break;
				}
			}
		}
		this.aClass22_15 = this.method1446(new Class168[] { new Class168(Static88.aClass69_1) });
	}

	@OriginalMember(owner = "client!wga", name = "C", descriptor = "(I)V")
	public final void method1549() {
		this.aBoolean113 = false;
		this.method1470();
	}

	@OriginalMember(owner = "client!wga", name = "A", descriptor = "(B)V")
	private void method1550() {
		this.method1562();
		this.method1476();
		this.method1517();
		this.method1457();
		this.method1526();
		this.method1518();
		this.method1452();
		this.method1493();
		this.method1475();
		this.method1461();
		this.method1485();
		this.method1581();
		this.method1584();
		this.method1573();
		for (@Pc(62) int local62 = this.anInt1540 - 1; local62 >= 0; local62--) {
			this.method1531(local62);
			this.method1554();
			this.method1569();
			this.method1513();
		}
		this.method1579();
		this.method1571();
		this.method1447();
		this.method1535();
		this.method1532();
	}

	@OriginalMember(owner = "client!wga", name = "m", descriptor = "(Z)V")
	private void method1551() {
		if (this.aCanvas4 == null) {
			this.anInt1424 = this.anInt1452 = 1;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas4.getSize();
			this.anInt1452 = local14.height;
			this.anInt1424 = local14.width;
		}
		this.anInt1428 = this.anInt1452;
		this.anInt1398 = this.anInt1424;
		this.method1552();
		this.method1465();
		this.method1480();
		this.method1571();
		this.method1538();
		this.method1566();
		this.la();
	}

	@OriginalMember(owner = "client!wga", name = "D", descriptor = "(I)V")
	private void method1552() {
		this.aBoolean122 = false;
		if (Static396.aClass286_5 == this.aClass286_4) {
			this.method1553();
			this.method1563();
		}
	}

	@OriginalMember(owner = "client!wga", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7312(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!wga", name = "E", descriptor = "(I)V")
	private void method1553() {
		if (this.aBoolean122) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray27;
		if (this.anInt1398 == 0 || this.anInt1428 == 0) {
			local9[3] = 0.0F;
			local9[12] = 0.0F;
			local9[6] = 0.0F;
			local9[9] = 0.0F;
			local9[11] = 0.0F;
			local9[15] = 1.0F;
			local9[1] = 0.0F;
			local9[8] = 0.0F;
			local9[2] = 0.0F;
			local9[14] = 0.0F;
			local9[5] = 1.0F;
			local9[13] = 0.0F;
			local9[7] = 0.0F;
			local9[10] = 1.0F;
			local9[4] = 0.0F;
			local9[0] = 1.0F;
		} else {
			local9[9] = 0.0F;
			local9[12] = -1.0F;
			local9[2] = 0.0F;
			local9[0] = 2.0F / (float) this.anInt1398;
			local9[4] = 0.0F;
			local9[15] = 1.0F;
			local9[13] = 1.0F;
			local9[6] = 0.0F;
			local9[3] = 0.0F;
			local9[10] = 0.5F;
			local9[8] = 0.0F;
			local9[1] = 0.0F;
			local9[14] = 0.5F;
			local9[7] = 0.0F;
			local9[5] = -2.0F / (float) this.anInt1428;
			local9[11] = 0.0F;
		}
		this.aBoolean122 = true;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7280(@OriginalArg(0) Canvas arg0) {
		this.anObject7 = null;
		this.aCanvas4 = null;
		if (arg0 == null || arg0 == this.lb) {
			this.anObject7 = this.anObject6;
			this.aCanvas4 = this.lb;
		} else if (this.aHashtable3.containsKey(arg0)) {
			this.anObject7 = this.aHashtable3.get(arg0);
			this.aCanvas4 = arg0;
		}
		if (this.aCanvas4 == null || this.anObject7 == null) {
			throw new RuntimeException();
		}
		this.method1515(this.anObject7, this.aCanvas4);
		this.method1551();
	}

	@OriginalMember(owner = "client!wga", name = "F", descriptor = "(I)V")
	protected abstract void method1554();

	@OriginalMember(owner = "client!wga", name = "G", descriptor = "(I)V")
	protected abstract void method1555();

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)V")
	@Override
	public void method7249(@OriginalArg(0) int arg0) {
		if (this.aClass113_3 != null) {
			this.aClass113_3.method3602();
		}
		this.anInt1564 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method7277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(17) float local17 = (float) arg3 - (float) arg1;
		@Pc(38) float local38;
		if (local11 == 0.0F && local17 == 0.0F) {
			local11 = 1.0F;
		} else {
			local38 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local11 * local11)));
			local11 *= local38;
			local17 *= local38;
		}
		this.method1537();
		this.method1528(arg4);
		this.method1483(0, Static165.aClass177_3);
		this.method1519(0, Static165.aClass177_3);
		this.method1451(1);
		this.method1576();
		this.method1560(false);
		@Pc(84) int local84 = arg7 % (arg5 + arg6);
		local38 = (float) arg5 * local11;
		@Pc(94) float local94 = (float) arg5 * local17;
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = local38;
		@Pc(102) float local102 = local94;
		if (arg5 >= local84) {
			local102 = (float) (arg5 - local84) * local17;
			local100 = local11 * (float) (arg5 - local84);
		} else {
			local98 = (float) (arg5 + arg6 - local84) * local17;
			local96 = local11 * (float) (arg5 + arg6 - local84);
		}
		@Pc(148) float local148 = (float) arg0 + local96;
		@Pc(153) float local153 = local98 + (float) arg1;
		@Pc(158) float local158 = (float) arg6 * local11;
		@Pc(163) float local163 = local17 * (float) arg6;
		while (true) {
			if (arg0 < arg2) {
				if (local148 > (float) arg2) {
					break;
				}
				if ((float) arg2 < local148 + local100) {
					local100 = (float) arg2 - local148;
				}
			} else {
				if (local148 < (float) arg2) {
					break;
				}
				if ((float) arg2 > local148 + local100) {
					local100 = (float) arg2 - local148;
				}
			}
			if (arg1 < arg3) {
				if ((float) arg3 < local153) {
					break;
				}
				if (local102 + local153 > (float) arg3) {
					local102 = (float) arg3 - local153;
				}
			} else {
				if (local153 < (float) arg3) {
					break;
				}
				if (local102 + local153 < (float) arg3) {
					local102 = (float) arg3 - local153;
				}
			}
			if (!this.method1512(local153, local148 + local100, 0.0F, local153 + local102, 0.0F, local148)) {
				return;
			}
			this.method1541();
			local153 += local163 + local102;
			local148 += local158 + local100;
			local100 = local38;
			local102 = local94;
		}
		this.method1560(true);
		this.method1519(0, Static118.aClass177_1);
		this.method1483(0, Static118.aClass177_1);
	}

	@OriginalMember(owner = "client!wga", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean129 = false;
	}

	@OriginalMember(owner = "client!wga", name = "n", descriptor = "(Z)V")
	protected final void method1556() {
		@Pc(15) Enumeration local15 = this.aHashtable3.keys();
		while (local15.hasMoreElements()) {
			@Pc(21) Canvas local21 = (Canvas) local15.nextElement();
			this.method1545(local21, this.aHashtable3.get(local21));
		}
		this.anInterface22_7.method6475();
		this.anInterface22_9.method6475();
		this.anInterface22_8.method6475();
		this.aClass166_Sub2_26.method6176();
		this.aClass166_Sub2_25.method6176();
		this.aClass166_Sub2_21.method6176();
		this.aClass166_Sub2_27.method6176();
		this.aClass166_Sub2_23.method6176();
		this.aClass356_3.method8753();
		this.anInterface24_3.method6475();
	}

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "(ZI)V")
	public final void method1557(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method1508(Static492.aClass315_4, Static492.aClass315_4);
		} else if (arg0 == 0) {
			this.method1508(Static425.aClass315_3, Static425.aClass315_3);
		} else if (arg0 == 2) {
			this.method1508(Static492.aClass315_4, Static542.aClass315_5);
		} else if (arg0 == 3) {
			this.method1508(Static425.aClass315_3, Static361.aClass315_2);
		} else if (arg0 == 4) {
			this.method1508(Static176.aClass315_1, Static176.aClass315_1);
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZZILclient!kf;Z)V")
	public abstract void method1558(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class177 arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILclient!tc;I)V")
	public abstract void method1559(@OriginalArg(1) Interface22 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(BZ)V")
	public abstract void method1560(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!wga", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7312(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!wga", name = "o", descriptor = "(Z)V")
	public final void method1561() {
		if (this.anInt1546 == 4) {
			return;
		}
		this.method1479();
		this.method1472(false);
		this.method1500(false);
		this.method1524(false);
		this.method1580(false);
		this.method1448(false, false, -2);
		this.method1451(1);
		this.method1557(0);
		this.anInt1546 = 4;
	}

	@OriginalMember(owner = "client!wga", name = "H", descriptor = "(I)V")
	protected abstract void method1562();

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7304(@OriginalArg(0) Canvas arg0) {
		if (this.lb == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable3.containsKey(arg0)) {
			this.method1545(arg0, this.aHashtable3.get(arg0));
			this.aHashtable3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "([IIIIIZ)Lclient!mi;")
	@Override
	public final Class46 method7314(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class46_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!wga", name = "p", descriptor = "(Z)V")
	private void method1563() {
		this.method1447();
		if (this.aClass17_3 != null) {
			this.aClass17_3.method8061();
		}
	}

	@OriginalMember(owner = "client!wga", name = "B", descriptor = "(B)V")
	public final void method1564() {
		this.aClass30_Sub2Array3 = new Class30_Sub2[this.anInt1540];
		this.anInterface7Array3 = new Interface7[this.anInt1540];
		this.aClass315Array5 = new Class315[this.anInt1540];
		this.aClass315Array6 = new Class315[this.anInt1540];
		this.aClass332Array3 = new Class332[this.anInt1540];
		for (@Pc(32) int local32 = 0; local32 < this.anInt1540; local32++) {
			this.aClass315Array6[local32] = Static425.aClass315_3;
			this.aClass315Array5[local32] = Static425.aClass315_3;
			this.aClass332Array3[local32] = Static263.aClass332_3;
			this.aClass30_Sub2Array3[local32] = new Class30_Sub2();
		}
		this.aClass2_Sub1Array3 = new Class2_Sub1[this.anInt1562 - 2];
		this.anInterface7_3 = this.method1495(1, 1, Static29.aClass26_4, Static354.aClass375_31);
		this.method7254(new Class2_Sub2_Sub2(262144));
		this.aClass22_19 = this.method1446(new Class168[] { new Class168(new Class69[] { Static88.aClass69_1, Static88.aClass69_5 }) });
		this.aClass22_18 = this.method1446(new Class168[] { new Class168(new Class69[] { Static88.aClass69_1, Static88.aClass69_3 }) });
		this.aClass22_21 = this.method1446(new Class168[] { new Class168(Static88.aClass69_1), new Class168(Static88.aClass69_3), new Class168(Static88.aClass69_5), new Class168(Static88.aClass69_2) });
		this.aClass22_16 = this.method1446(new Class168[] { new Class168(Static88.aClass69_1), new Class168(Static88.aClass69_3), new Class168(Static88.aClass69_5) });
		this.aClass166_Sub2_29 = new Class166_Sub2(this, 0, 0, false, false);
		this.aClass166_Sub2_26 = new Class166_Sub2(this, 0, 0, true, true);
		this.aClass166_Sub2_24 = new Class166_Sub2(this, 0, 0, false, false);
		this.aClass166_Sub2_25 = new Class166_Sub2(this, 0, 0, true, true);
		this.aClass166_Sub2_28 = new Class166_Sub2(this, 0, 0, false, false);
		this.aClass166_Sub2_21 = new Class166_Sub2(this, 0, 0, true, true);
		this.aClass166_Sub2_22 = new Class166_Sub2(this, 0, 0, false, false);
		this.aClass166_Sub2_27 = new Class166_Sub2(this, 0, 0, true, true);
		this.aClass166_Sub2_30 = new Class166_Sub2(this, 0, 0, false, false);
		this.aClass166_Sub2_23 = new Class166_Sub2(this, 0, 0, true, true);
		this.aClass356_3 = new Class356(this);
		this.anInterface24_3 = this.method1474(true);
		this.method1536();
		this.aClass347_3 = new Class347(this);
		this.aClass17Array3[1] = this.method1466(1);
		this.aClass17Array3[2] = this.method1466(2);
		this.aClass17Array3[4] = this.method1466(4);
		this.aClass17Array3[5] = this.method1466(5);
		this.aClass17Array3[6] = this.method1466(6);
		this.aClass17Array3[7] = this.method1466(7);
		this.aClass17Array3[3] = this.method1466(3);
		this.aClass17Array3[8] = this.method1466(8);
		this.aClass17Array3[9] = this.method1466(9);
		if (!this.aClass17Array3[2].method8067()) {
			this.aClass17Array3[2] = this.method1466(0);
		}
		if (!this.aClass17Array3[4].method8067()) {
			this.aClass17Array3[4] = this.aClass17Array3[2];
		}
		if (!this.aClass17Array3[8].method8067()) {
			this.aClass17Array3[8] = this.aClass17Array3[4];
		}
		if (!this.aClass17Array3[9].method8067()) {
			this.aClass17Array3[9] = this.aClass17Array3[8];
		}
		this.method1516();
		this.la();
		this.method7276();
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZLclient!wq;Lclient!baa;)Z")
	public abstract boolean method1565(@OriginalArg(1) Class375 arg0, @OriginalArg(2) Class26 arg1);

	@OriginalMember(owner = "client!wga", name = "C", descriptor = "(B)V")
	public final void method1566() {
		if (this.aClass286_4 == Static505.aClass286_7) {
			return;
		}
		@Pc(6) Class286 local6 = this.aClass286_4;
		this.aClass286_4 = Static505.aClass286_7;
		if (local6.method7446()) {
			this.method1547();
		}
		this.anInt1546 &= 0xFFFFFFE0;
		this.aFloatArray28 = this.aFloatArray26;
	}

	@OriginalMember(owner = "client!wga", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass30_Sub2_16.method4053((float) arg0, (float) arg2, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt1558 * this.aClass30_Sub2_16.method4049((float) arg2, (float) arg1, (float) arg0) / local14);
			local58 = (int) ((float) this.anInt1561 * this.aClass30_Sub2_16.method4042((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local58 = this.anInt1559;
			local40 = this.anInt1542;
		}
		arg3[1] = (int) ((float) local58 - this.aFloat52);
		arg3[0] = (int) ((float) local40 - this.aFloat54);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!wga", name = "I", descriptor = "(I)V")
	public final void method1567() {
		this.method1494(Static150.aClass134_3, 2);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method7231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method1492();
		this.method1537();
		this.method1528(arg4);
		this.method1483(0, Static165.aClass177_3);
		this.method1519(0, Static165.aClass177_3);
		this.method1451(arg5);
		this.aClass30_Sub2_15.method4052(1.0F, (float) (arg3 - 1), (float) (arg2 - 1));
		this.aClass30_Sub2_15.method4040((float) arg1 - local7, 0.0F, (float) arg0 - local7);
		this.method1549();
		this.method1560(false);
		this.method1494(Static481.aClass134_5, 4);
		this.method1560(true);
		this.method1519(0, Static118.aClass177_1);
		this.method1483(0, Static118.aClass177_1);
	}

	@OriginalMember(owner = "client!wga", name = "J", descriptor = "(I)Lclient!haa;")
	public final Class30_Sub2 method1568() {
		return this.aClass30_Sub2_15;
	}

	@OriginalMember(owner = "client!wga", name = "K", descriptor = "(I)V")
	protected abstract void method1569();

	@OriginalMember(owner = "client!wga", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt1567;
	}

	@OriginalMember(owner = "client!wga", name = "g", descriptor = "(II)I")
	@Override
	public final int method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!wga", name = "D", descriptor = "(B)V")
	protected abstract void method1571();

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!hj;ILclient!uq;IIII)V")
	public abstract void method1572(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "(II)I")
	@Override
	public final int method7270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!wga", name = "E", descriptor = "(B)V")
	protected abstract void method1573();

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!oea;[Lclient!rh;Z)Lclient!da;")
	@Override
	public final Class68 method7289(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class296[] arg1) {
		return new Class68_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I[Lclient!ab;)V")
	@Override
	public final void method7245(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass2_Sub1Array3[local3] = arg1[local3];
		}
		this.anInt1566 = arg0;
		if (this.aClass286_4.method7446()) {
			this.method1457();
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "()Z")
	@Override
	public final boolean method7230() {
		return false;
	}

	@OriginalMember(owner = "client!wga", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public final Class2_Sub2 method7305(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub2 local8 = new Class2_Sub2_Sub2(arg0);
		this.aClass341_11.method8528(local8);
		return local8;
	}

	@OriginalMember(owner = "client!wga", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt1580;
	}

	@OriginalMember(owner = "client!wga", name = "M", descriptor = "(I)V")
	protected abstract void method1574();

	@OriginalMember(owner = "client!wga", name = "N", descriptor = "(I)I")
	public final int method1575() {
		return this.anInt1570;
	}

	@OriginalMember(owner = "client!wga", name = "O", descriptor = "(I)V")
	public final void method1576() {
		this.aClass30_Sub2_15.method4665();
		this.aBoolean113 = true;
		this.method1470();
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIF)Lclient!ab;")
	@Override
	public final Class2_Sub1 method7293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub1_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "(ZI)V")
	public final void method1577(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean126) {
			this.aBoolean126 = arg0;
			this.method1517();
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "([BILclient!wq;IZI)Lclient!wfa;")
	public final Interface27 method1578(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class375 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method1477(arg4, arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!wga", name = "P", descriptor = "(I)V")
	protected abstract void method1579();

	@OriginalMember(owner = "client!wga", name = "s", descriptor = "()Z")
	@Override
	public final boolean method7296() {
		return true;
	}

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "(IZ)V")
	public final void method1580(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean119) {
			this.aBoolean119 = arg0;
			this.method1475();
			this.anInt1546 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wga", name = "Q", descriptor = "(I)V")
	protected abstract void method1581();

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!mda;)V")
	@Override
	public final void method7287(@OriginalArg(0) Class203 arg0) {
		this.aClass356_3.method8749(this, arg0, -1);
	}

	@OriginalMember(owner = "client!wga", name = "R", descriptor = "(I)Lclient!haa;")
	public final Class30_Sub2 method1582() {
		if (!this.aBoolean120) {
			this.aClass30_Sub2_20.method4047(this.aClass30_Sub2_18, this.aClass30_Sub2_15);
			this.aBoolean120 = true;
		}
		return this.aClass30_Sub2_20;
	}

	@OriginalMember(owner = "client!wga", name = "F", descriptor = "(B)V")
	private void method1583() {
		if (this.aBoolean117) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray32;
		@Pc(13) float local13 = (float) this.anInt1543;
		@Pc(17) float local17 = (float) this.anInt1567;
		@Pc(29) float local29 = this.aFloat56 * (float) -this.anInt1559 / (float) this.anInt1561;
		@Pc(41) float local41 = (float) -this.anInt1542 * this.aFloat56 / (float) this.anInt1558;
		@Pc(56) float local56 = this.aFloat56 * (float) (this.anInt1398 - this.anInt1542) / (float) this.anInt1558;
		@Pc(71) float local71 = (float) (this.anInt1428 - this.anInt1559) * this.aFloat56 / (float) this.anInt1561;
		if (local56 == local41 || local29 == local71) {
			local9[11] = 0.0F;
			local9[8] = 0.0F;
			local9[7] = 0.0F;
			local9[10] = 1.0F;
			local9[15] = 1.0F;
			local9[9] = 0.0F;
			local9[0] = 1.0F;
			local9[1] = 0.0F;
			local9[13] = 0.0F;
			local9[4] = 0.0F;
			local9[6] = 0.0F;
			local9[12] = 0.0F;
			local9[5] = 1.0F;
			local9[2] = 0.0F;
			local9[14] = 0.0F;
			local9[3] = 0.0F;
		} else {
			local9[0] = 2.0F / (local56 - local41);
			local9[12] = (local56 + local41) / (local41 - local56);
			local9[6] = 0.0F;
			local9[3] = 0.0F;
			local9[11] = 0.0F;
			local9[8] = 0.0F;
			local9[14] = local13 / (local13 - local17);
			local9[1] = 0.0F;
			local9[4] = 0.0F;
			local9[2] = 0.0F;
			local9[9] = 0.0F;
			local9[13] = (local29 + local71) / (local71 - local29);
			local9[10] = 1.0F / (local13 - local17);
			local9[5] = 2.0F / (local71 - local29);
			local9[7] = 0.0F;
			local9[15] = 1.0F;
		}
		this.method1542();
		this.aBoolean117 = true;
	}

	@OriginalMember(owner = "client!wga", name = "S", descriptor = "(I)V")
	protected abstract void method1584();
}
