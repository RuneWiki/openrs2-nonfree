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

@OriginalClass("client!kd")
public abstract class Class57_Sub3 extends Class57 {

	@OriginalMember(owner = "client!kd", name = "Mf", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lclient!cda;")
	protected Class61 aClass61_6;

	@OriginalMember(owner = "client!kd", name = "de", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable13;

	@OriginalMember(owner = "client!kd", name = "Zc", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!kd", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!kd", name = "Ae", descriptor = "I")
	public int anInt9140;

	@OriginalMember(owner = "client!kd", name = "Fc", descriptor = "I")
	public int anInt9142;

	@OriginalMember(owner = "client!kd", name = "Ed", descriptor = "I")
	protected int anInt9143;

	@OriginalMember(owner = "client!kd", name = "og", descriptor = "Lclient!rca;")
	public Interface22 anInterface22_3;

	@OriginalMember(owner = "client!kd", name = "Fb", descriptor = "[Lclient!bda;")
	protected Class34[] aClass34Array5;

	@OriginalMember(owner = "client!kd", name = "Rc", descriptor = "Lclient!sea;")
	private Class29_Sub1 aClass29_Sub1_3;

	@OriginalMember(owner = "client!kd", name = "nd", descriptor = "F")
	private float aFloat166;

	@OriginalMember(owner = "client!kd", name = "od", descriptor = "[Lclient!uf;")
	protected Class5_Sub43[] aClass5_Sub43Array5;

	@OriginalMember(owner = "client!kd", name = "Ld", descriptor = "Z")
	protected boolean aBoolean682;

	@OriginalMember(owner = "client!kd", name = "Eb", descriptor = "I")
	private int anInt9147;

	@OriginalMember(owner = "client!kd", name = "tb", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!kd", name = "Qf", descriptor = "[Lclient!kn;")
	protected Class203_Sub1[] aClass203_Sub1Array3;

	@OriginalMember(owner = "client!kd", name = "oc", descriptor = "[Lclient!rca;")
	private Interface22[] anInterface22Array3;

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
	public int anInt9154;

	@OriginalMember(owner = "client!kd", name = "ag", descriptor = "I")
	protected int anInt9155;

	@OriginalMember(owner = "client!kd", name = "ub", descriptor = "I")
	protected int anInt9159;

	@OriginalMember(owner = "client!kd", name = "pc", descriptor = "Z")
	public boolean aBoolean687;

	@OriginalMember(owner = "client!kd", name = "Ic", descriptor = "I")
	public int anInt9163;

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!kd", name = "Df", descriptor = "I")
	public int anInt9168;

	@OriginalMember(owner = "client!kd", name = "vc", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!kd", name = "Fg", descriptor = "I")
	private int anInt9171;

	@OriginalMember(owner = "client!kd", name = "wg", descriptor = "I")
	protected int anInt9173;

	@OriginalMember(owner = "client!kd", name = "ac", descriptor = "Lclient!oda;")
	private Class13 aClass13_3;

	@OriginalMember(owner = "client!kd", name = "zf", descriptor = "F")
	public float aFloat176;

	@OriginalMember(owner = "client!kd", name = "zg", descriptor = "[Lclient!bda;")
	protected Class34[] aClass34Array6;

	@OriginalMember(owner = "client!kd", name = "Ne", descriptor = "F")
	private float aFloat178;

	@OriginalMember(owner = "client!kd", name = "cd", descriptor = "I")
	protected int anInt9177;

	@OriginalMember(owner = "client!kd", name = "sd", descriptor = "Z")
	protected boolean aBoolean694;

	@OriginalMember(owner = "client!kd", name = "Dc", descriptor = "F")
	public float aFloat180;

	@OriginalMember(owner = "client!kd", name = "Cd", descriptor = "Z")
	public boolean aBoolean695;

	@OriginalMember(owner = "client!kd", name = "cf", descriptor = "Z")
	public boolean aBoolean696;

	@OriginalMember(owner = "client!kd", name = "Rf", descriptor = "[Lclient!up;")
	protected Class357[] aClass357Array3;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "Lclient!os;")
	private Class268 aClass268_3;

	@OriginalMember(owner = "client!kd", name = "Kf", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!kd", name = "rg", descriptor = "I")
	public int anInt9182;

	@OriginalMember(owner = "client!kd", name = "ke", descriptor = "Lclient!gn;")
	private Class147 aClass147_17;

	@OriginalMember(owner = "client!kd", name = "Re", descriptor = "Lclient!ho;")
	public Class164_Sub1 aClass164_Sub1_21;

	@OriginalMember(owner = "client!kd", name = "gf", descriptor = "Lclient!gn;")
	public Class147 aClass147_18;

	@OriginalMember(owner = "client!kd", name = "Td", descriptor = "Lclient!je;")
	private Interface9 anInterface9_8;

	@OriginalMember(owner = "client!kd", name = "be", descriptor = "Lclient!ho;")
	public Class164_Sub1 aClass164_Sub1_22;

	@OriginalMember(owner = "client!kd", name = "ed", descriptor = "Lclient!ho;")
	public Class164_Sub1 aClass164_Sub1_23;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "Lclient!ho;")
	public Class164_Sub1 aClass164_Sub1_24;

	@OriginalMember(owner = "client!kd", name = "Se", descriptor = "Lclient!ho;")
	public Class164_Sub1 aClass164_Sub1_25;

	@OriginalMember(owner = "client!kd", name = "rd", descriptor = "Lclient!ho;")
	public Class164_Sub1 aClass164_Sub1_26;

	@OriginalMember(owner = "client!kd", name = "rb", descriptor = "Lclient!ho;")
	public Class164_Sub1 aClass164_Sub1_27;

	@OriginalMember(owner = "client!kd", name = "Qe", descriptor = "Lclient!sfa;")
	private Interface25 anInterface25_16;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "Lclient!gn;")
	public Class147 aClass147_19;

	@OriginalMember(owner = "client!kd", name = "fc", descriptor = "Lclient!gn;")
	public Class147 aClass147_20;

	@OriginalMember(owner = "client!kd", name = "df", descriptor = "Lclient!ho;")
	public Class164_Sub1 aClass164_Sub1_28;

	@OriginalMember(owner = "client!kd", name = "ie", descriptor = "Lclient!ho;")
	public Class164_Sub1 aClass164_Sub1_29;

	@OriginalMember(owner = "client!kd", name = "De", descriptor = "Lclient!ho;")
	public Class164_Sub1 aClass164_Sub1_30;

	@OriginalMember(owner = "client!kd", name = "we", descriptor = "Lclient!sfa;")
	private Interface25 anInterface25_17;

	@OriginalMember(owner = "client!kd", name = "Db", descriptor = "Lclient!gn;")
	public Class147 aClass147_21;

	@OriginalMember(owner = "client!kd", name = "se", descriptor = "Lclient!sfa;")
	private Interface25 anInterface25_18;

	@OriginalMember(owner = "client!kd", name = "wd", descriptor = "Lclient!gn;")
	private Class147 aClass147_22;

	@OriginalMember(owner = "client!kd", name = "Kc", descriptor = "Lclient!gn;")
	private Class147 aClass147_23;

	@OriginalMember(owner = "client!kd", name = "Bd", descriptor = "Z")
	protected boolean aBoolean701;

	@OriginalMember(owner = "client!kd", name = "sc", descriptor = "I")
	private int anInt9183;

	@OriginalMember(owner = "client!kd", name = "Wf", descriptor = "Lclient!ef;")
	private final Class102 aClass102_62 = new Class102();

	@OriginalMember(owner = "client!kd", name = "ef", descriptor = "Z")
	protected boolean aBoolean680 = true;

	@OriginalMember(owner = "client!kd", name = "rf", descriptor = "Lclient!kn;")
	protected final Class203_Sub1 aClass203_Sub1_15 = new Class203_Sub1();

	@OriginalMember(owner = "client!kd", name = "ue", descriptor = "Lclient!kn;")
	public Class203_Sub1 aClass203_Sub1_16 = new Class203_Sub1();

	@OriginalMember(owner = "client!kd", name = "he", descriptor = "Lclient!kn;")
	public final Class203_Sub1 aClass203_Sub1_17 = new Class203_Sub1();

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "Lclient!kn;")
	protected final Class203_Sub1 aClass203_Sub1_18 = new Class203_Sub1();

	@OriginalMember(owner = "client!kd", name = "sb", descriptor = "Lclient!kn;")
	private final Class203_Sub1 aClass203_Sub1_19 = new Class203_Sub1();

	@OriginalMember(owner = "client!kd", name = "Uf", descriptor = "Lclient!kn;")
	private final Class203_Sub1 aClass203_Sub1_20 = new Class203_Sub1();

	@OriginalMember(owner = "client!kd", name = "Yb", descriptor = "I")
	private int anInt9144 = -1;

	@OriginalMember(owner = "client!kd", name = "bc", descriptor = "Lclient!qea;")
	protected Class288 aClass288_6 = Static33.aClass288_1;

	@OriginalMember(owner = "client!kd", name = "Gc", descriptor = "I")
	private int anInt9151 = -1;

	@OriginalMember(owner = "client!kd", name = "nf", descriptor = "Z")
	protected boolean aBoolean681 = true;

	@OriginalMember(owner = "client!kd", name = "Kd", descriptor = "[F")
	public final float[] aFloatArray92 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!kd", name = "Gd", descriptor = "[F")
	private final float[] aFloatArray93 = new float[16];

	@OriginalMember(owner = "client!kd", name = "Ab", descriptor = "I")
	public int anInt9148 = 0;

	@OriginalMember(owner = "client!kd", name = "R", descriptor = "F")
	public float aFloat165 = 1.0F;

	@OriginalMember(owner = "client!kd", name = "Bg", descriptor = "Z")
	protected boolean aBoolean685 = false;

	@OriginalMember(owner = "client!kd", name = "Rb", descriptor = "I")
	public int anInt9170 = -1;

	@OriginalMember(owner = "client!kd", name = "Zb", descriptor = "Z")
	private boolean aBoolean688 = false;

	@OriginalMember(owner = "client!kd", name = "Pd", descriptor = "I")
	private int anInt9161 = 1;

	@OriginalMember(owner = "client!kd", name = "bf", descriptor = "I")
	protected int bf = 3584;

	@OriginalMember(owner = "client!kd", name = "Vb", descriptor = "F")
	public float aFloat175 = 3584.0F;

	@OriginalMember(owner = "client!kd", name = "Xb", descriptor = "[Lclient!oda;")
	private final Class13[] aClass13Array3 = new Class13[10];

	@OriginalMember(owner = "client!kd", name = "Xe", descriptor = "F")
	private float aFloat173 = 1.0F;

	@OriginalMember(owner = "client!kd", name = "Hd", descriptor = "I")
	public int anInt9158 = 0;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
	private int anInt9152 = -1;

	@OriginalMember(owner = "client!kd", name = "Le", descriptor = "I")
	protected int anInt9160 = 0;

	@OriginalMember(owner = "client!kd", name = "Be", descriptor = "Z")
	private boolean aBoolean686 = false;

	@OriginalMember(owner = "client!kd", name = "Nb", descriptor = "I")
	private int anInt9172 = 16777215;

	@OriginalMember(owner = "client!kd", name = "ng", descriptor = "Z")
	protected boolean aBoolean690 = true;

	@OriginalMember(owner = "client!kd", name = "xf", descriptor = "Z")
	protected boolean aBoolean684 = true;

	@OriginalMember(owner = "client!kd", name = "wb", descriptor = "[F")
	public final float[] aFloatArray94 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!kd", name = "Sf", descriptor = "I")
	public int anInt9169 = 3;

	@OriginalMember(owner = "client!kd", name = "xd", descriptor = "I")
	public int anInt9162 = -1;

	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "[F")
	private final float[] aFloatArray95 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!kd", name = "wf", descriptor = "I")
	protected int anInt9174 = 0;

	@OriginalMember(owner = "client!kd", name = "pg", descriptor = "[F")
	private final float[] aFloatArray98 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!kd", name = "eg", descriptor = "I")
	protected final int anInt9166 = 0;

	@OriginalMember(owner = "client!kd", name = "Ac", descriptor = "I")
	public int anInt9150 = 512;

	@OriginalMember(owner = "client!kd", name = "hc", descriptor = "I")
	private int anInt9156 = 0;

	@OriginalMember(owner = "client!kd", name = "Zf", descriptor = "F")
	public float aFloat174 = -1.0F;

	@OriginalMember(owner = "client!kd", name = "Jc", descriptor = "F")
	public float aFloat167 = -1.0F;

	@OriginalMember(owner = "client!kd", name = "dc", descriptor = "I")
	private int anInt9146 = 0;

	@OriginalMember(owner = "client!kd", name = "Hc", descriptor = "[F")
	private final float[] aFloatArray97 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!kd", name = "dd", descriptor = "Z")
	private boolean aBoolean689 = false;

	@OriginalMember(owner = "client!kd", name = "of", descriptor = "I")
	public int anInt9164 = 0;

	@OriginalMember(owner = "client!kd", name = "yf", descriptor = "I")
	protected int anInt9153 = 0;

	@OriginalMember(owner = "client!kd", name = "Sc", descriptor = "I")
	public int anInt9179 = 8;

	@OriginalMember(owner = "client!kd", name = "mc", descriptor = "[F")
	protected float[] aFloatArray96 = this.aFloatArray95;

	@OriginalMember(owner = "client!kd", name = "Nf", descriptor = "Z")
	protected boolean aBoolean691 = false;

	@OriginalMember(owner = "client!kd", name = "Gb", descriptor = "Z")
	private boolean aBoolean697 = false;

	@OriginalMember(owner = "client!kd", name = "nc", descriptor = "I")
	protected int anInt9176 = 0;

	@OriginalMember(owner = "client!kd", name = "yd", descriptor = "[F")
	private final float[] aFloatArray99 = new float[16];

	@OriginalMember(owner = "client!kd", name = "yg", descriptor = "[F")
	private final float[] aFloatArray100 = new float[16];

	@OriginalMember(owner = "client!kd", name = "He", descriptor = "I")
	public int anInt9167 = 128;

	@OriginalMember(owner = "client!kd", name = "qd", descriptor = "I")
	public int anInt9178 = 50;

	@OriginalMember(owner = "client!kd", name = "af", descriptor = "Z")
	protected boolean aBoolean693 = false;

	@OriginalMember(owner = "client!kd", name = "Kb", descriptor = "I")
	private int anInt9149 = 0;

	@OriginalMember(owner = "client!kd", name = "lg", descriptor = "Z")
	protected boolean aBoolean683 = true;

	@OriginalMember(owner = "client!kd", name = "ff", descriptor = "F")
	public float aFloat179 = 1.0F;

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "F")
	public float aFloat169 = 3584.0F;

	@OriginalMember(owner = "client!kd", name = "vf", descriptor = "F")
	public float aFloat177 = 1.0F;

	@OriginalMember(owner = "client!kd", name = "Lb", descriptor = "I")
	protected final int anInt9181 = 0;

	@OriginalMember(owner = "client!kd", name = "Ee", descriptor = "I")
	protected int anInt9145 = 0;

	@OriginalMember(owner = "client!kd", name = "Xc", descriptor = "Lclient!uu;")
	protected Class359 aClass359_7 = Static342.aClass359_4;

	@OriginalMember(owner = "client!kd", name = "yb", descriptor = "F")
	public float aFloat171 = 1.0F;

	@OriginalMember(owner = "client!kd", name = "Yc", descriptor = "Z")
	protected boolean aBoolean699 = true;

	@OriginalMember(owner = "client!kd", name = "Ub", descriptor = "I")
	private int anInt9175 = 0;

	@OriginalMember(owner = "client!kd", name = "zd", descriptor = "I")
	public int anInt9180 = 512;

	@OriginalMember(owner = "client!kd", name = "Ve", descriptor = "Z")
	private boolean aBoolean698 = false;

	@OriginalMember(owner = "client!kd", name = "pd", descriptor = "Z")
	private boolean aBoolean692 = false;

	@OriginalMember(owner = "client!kd", name = "Bf", descriptor = "Z")
	protected boolean aBoolean700 = false;

	@OriginalMember(owner = "client!kd", name = "lf", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!kd", name = "Qd", descriptor = "Lclient!kn;")
	private final Class203_Sub1 aClass203_Sub1_21 = new Class203_Sub1();

	@OriginalMember(owner = "client!kd", name = "jg", descriptor = "Lclient!la;")
	protected final Class208 aClass208_118;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas12;

	@OriginalMember(owner = "client!kd", name = "Ag", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!kd", name = "ig", descriptor = "Ljava/lang/Object;")
	protected final Object anObject15;

	@OriginalMember(owner = "client!kd", name = "kd", descriptor = "Ljava/lang/Object;")
	private Object anObject16;

	@OriginalMember(owner = "client!kd", name = "Mc", descriptor = "I")
	protected final int anInt9157;

	@OriginalMember(owner = "client!kd", name = "Jf", descriptor = "I")
	private int anInt9059;

	@OriginalMember(owner = "client!kd", name = "td", descriptor = "I")
	public int anInt9025;

	@OriginalMember(owner = "client!kd", name = "qc", descriptor = "I")
	public final int anInt9165;

	@OriginalMember(owner = "client!kd", name = "Bb", descriptor = "I")
	private int anInt9045;

	@OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
	public int anInt9094;

	@OriginalMember(owner = "client!kd", name = "le", descriptor = "Lclient!ia;")
	private final Class167 aClass167_3;

	@OriginalMember(owner = "client!kd", name = "Z", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!la;II)V")
	protected Class57_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface1 arg2, @OriginalArg(3) Class208 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.aClass208_118 = arg3;
			this.aCanvas13 = this.aCanvas12 = arg0;
			this.anObject16 = this.anObject15 = arg1;
			this.anInt9157 = arg4;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt9025 = this.anInt9059 = local307.height;
			this.anInt9165 = arg5;
			this.anInt9094 = this.anInt9045 = local307.width;
			Static303.method4654(false, true);
			if (super.anInterface1_11 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt9165);
				this.aClass167_3 = null;
			} else {
				this.aClass167_3 = new Class167(this, super.anInterface1_11);
				this.aNativeInterface3 = new NativeInterface(super.anInterface1_11.method2864(), this.anInt9165);
				for (@Pc(352) int local352 = 0; super.anInterface1_11.method2864() > local352; local352++) {
					@Pc(360) Class233 local360 = super.anInterface1_11.method2863(local352);
					if (local360 != null) {
						this.aNativeInterface3.initTextureMetrics(local352, local360.aByte97, local360.aByte98);
					}
				}
			}
		} catch (@Pc(398) Throwable local398) {
			local398.printStackTrace();
			this.method7722();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface26 local9 = local6.anInterface26_5;
		this.method7843();
		this.method7813(local9);
		this.method7800(1);
		this.method7733(Static362.aClass34_172, Static362.aClass34_172);
		this.method7866(0, Static291.aClass312_3);
		this.method7806(arg0);
		this.aClass203_Sub1_15.method4834((float) this.anInt9025, 0.0F, (float) this.anInt9094);
		this.method7735();
		this.aClass203_Sub1Array3[0].method4834(local9.method4346((float) this.anInt9025), 1.0F, local9.method4353((float) this.anInt9094));
		this.aClass203_Sub1Array3[0].method4846(local9.method4346((float) -arg3), 0.0F, local9.method4353((float) -arg2));
		this.aClass357Array3[0] = Static169.aClass357_3;
		this.method7858();
		this.method7775();
		this.method7850();
		this.method7866(0, Static57.aClass312_1);
	}

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "(I)V")
	private void method7732() {
		this.aFloat181 = (float) (this.anInt9145 - this.anInt9164);
		this.aFloat176 = (float) (this.anInt9153 - this.anInt9164);
		this.aFloat168 = (float) (this.anInt9176 - this.anInt9158);
		this.aFloat180 = (float) (this.anInt9174 - this.anInt9158);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!bda;Lclient!bda;)V")
	public final void method7733(@OriginalArg(1) Class34 arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(24) boolean local24 = false;
		if (this.aClass34Array6[this.anInt9160] != arg1) {
			this.aClass34Array6[this.anInt9160] = arg1;
			this.method7736();
			local24 = true;
		}
		if (arg0 != this.aClass34Array5[this.anInt9160]) {
			this.aClass34Array5[this.anInt9160] = arg0;
			this.method7846();
			local24 = true;
		}
		if (local24) {
			this.anInt9147 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "()Lclient!qq;")
	@Override
	public final Class203 method7676() {
		return new Class203_Sub1();
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(Z)V")
	protected abstract void method7734();

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(I)V")
	@Override
	public final void method7689(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "()I")
	@Override
	public final int method7721() {
		return this.anInt9159 - 2;
	}

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "(I)V")
	public final void method7735() {
		this.aBoolean680 = false;
		this.method7783();
	}

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt9183;
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "(B)V")
	protected abstract void method7736();

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt9142 + this.anInt9140 + this.anInt9143;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZ)V")
	public final void method7737(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean683 != arg0) {
			this.aBoolean683 = arg0;
			this.method7779();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method7675(@OriginalArg(0) Class5_Sub10 arg0) {
		this.aNativeHeap6 = ((Class5_Sub10_Sub1) arg0).aNativeHeap1;
		this.aNativeHeapBuffer8 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass203_Sub1_16.aFloat89 + this.aClass203_Sub1_16.aFloat98 * (float) arg1 + (float) arg0 * this.aClass203_Sub1_16.aFloat90 + this.aClass203_Sub1_16.aFloat91 * (float) arg2;
		@Pc(57) float local57 = this.aClass203_Sub1_16.aFloat89 + (float) arg5 * this.aClass203_Sub1_16.aFloat91 + this.aClass203_Sub1_16.aFloat90 * (float) arg3 + this.aClass203_Sub1_16.aFloat98 * (float) arg4;
		if ((float) this.anInt9178 > local32 && (float) this.anInt9178 > local57) {
			local7 |= 0x10;
		} else if (local32 > (float) this.bf && (float) this.bf < local57) {
			local7 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((this.aClass203_Sub1_16.aFloat94 * (float) arg1 + this.aClass203_Sub1_16.aFloat92 * (float) arg0 + (float) arg2 * this.aClass203_Sub1_16.aFloat95 + this.aClass203_Sub1_16.aFloat88) * (float) this.anInt9150 / (float) arg6);
		@Pc(163) int local163 = (int) ((this.aClass203_Sub1_16.aFloat88 + this.aClass203_Sub1_16.aFloat92 * (float) arg3 + this.aClass203_Sub1_16.aFloat94 * (float) arg4 + this.aClass203_Sub1_16.aFloat95 * (float) arg5) * (float) this.anInt9150 / (float) arg6);
		if (this.aFloat180 > (float) local130 && (float) local163 < this.aFloat180) {
			local7 |= 0x1;
		} else if (this.aFloat168 < (float) local130 && (float) local163 > this.aFloat168) {
			local7 |= 0x2;
		}
		@Pc(236) int local236 = (int) ((this.aClass203_Sub1_16.aFloat97 + (float) arg2 * this.aClass203_Sub1_16.aFloat87 + (float) arg1 * this.aClass203_Sub1_16.aFloat93 + this.aClass203_Sub1_16.aFloat96 * (float) arg0) * (float) this.anInt9180 / (float) arg6);
		@Pc(269) int local269 = (int) ((this.aClass203_Sub1_16.aFloat87 * (float) arg5 + this.aClass203_Sub1_16.aFloat93 * (float) arg4 + (float) arg3 * this.aClass203_Sub1_16.aFloat96 + this.aClass203_Sub1_16.aFloat97) * (float) this.anInt9180 / (float) arg6);
		if (this.aFloat176 > (float) local236 && (float) local269 < this.aFloat176) {
			local7 |= 0x4;
		} else if (this.aFloat181 < (float) local236 && this.aFloat181 < (float) local269) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7642() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(B)V")
	private void method7738() {
		this.anInterface25_17 = this.method7784(true);
		this.anInterface25_17.method2907(12, 24);
		this.aClass147_17 = this.method7825(new Class14[] { new Class14(Static662.aClass384_1) });
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!jw;I)V")
	@Override
	public final void method7662(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1) {
		this.aClass268_3.method6359(arg1, arg0, this);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZB)V")
	public abstract void method7739(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method7740(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap6.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7767();
		this.method7806(arg4);
		this.method7866(0, Static291.aClass312_3);
		this.method7781(0, Static291.aClass312_3);
		this.method7800(arg5);
		this.aClass203_Sub1_15.method4834((float) arg3, 1.0F, (float) arg2);
		this.aClass203_Sub1_15.method8335(arg0, arg1, 0);
		this.method7735();
		this.method7739(false);
		this.method7775();
		this.method7739(true);
		this.method7781(0, Static57.aClass312_1);
		this.method7866(0, Static57.aClass312_1);
	}

	@OriginalMember(owner = "client!kd", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.bf;
	}

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt9162 && this.anInt9170 == arg1 && this.anInt9148 == arg2) {
			return;
		}
		this.anInt9162 = arg0;
		this.anInt9148 = arg2;
		this.anInt9170 = arg1;
		this.method7763();
		this.method7779();
	}

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7686(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ju;IIII)Lclient!ka;")
	@Override
	public final Class164 method7700(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class164_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
	public final void method7742(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean684) {
			this.aBoolean684 = arg0;
			this.method7849();
		}
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "()Z")
	@Override
	public final boolean method7694() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(18) float local18 = (float) -arg1 + (float) arg3;
		@Pc(45) float local45;
		if (local11 == 0.0F && local18 == 0.0F) {
			local11 = 1.0F;
		} else {
			local45 = (float) (1.0D / Math.sqrt((double) (local11 * local11 + local18 * local18)));
			local11 *= local45;
			local18 *= local45;
		}
		this.method7767();
		this.method7806(arg4);
		this.method7866(0, Static291.aClass312_3);
		this.method7781(0, Static291.aClass312_3);
		this.method7800(1);
		this.method7861();
		@Pc(83) int local83 = arg7 % (arg5 + arg6);
		this.method7739(false);
		local45 = local11 * (float) arg5;
		@Pc(97) float local97 = (float) arg5 * local18;
		@Pc(99) float local99 = 0.0F;
		@Pc(101) float local101 = 0.0F;
		@Pc(103) float local103 = local45;
		@Pc(105) float local105 = local97;
		if (arg5 >= local83) {
			local103 = local11 * (float) (arg5 - local83);
			local105 = local18 * (float) (arg5 - local83);
		} else {
			local101 = (float) (arg6 + arg5 - local83) * local18;
			local99 = (float) (arg6 + arg5 - local83) * local11;
		}
		@Pc(151) float local151 = local99 + (float) arg0;
		@Pc(156) float local156 = local101 + (float) arg1;
		@Pc(161) float local161 = (float) arg6 * local11;
		@Pc(166) float local166 = local18 * (float) arg6;
		while (true) {
			if (arg2 <= arg0) {
				if (local151 < (float) arg2) {
					break;
				}
				if ((float) arg2 > local151 + local103) {
					local103 = (float) arg2 - local151;
				}
			} else {
				if ((float) arg2 < local151) {
					break;
				}
				if (local103 + local151 > (float) arg2) {
					local103 = (float) arg2 - local151;
				}
			}
			if (arg1 < arg3) {
				if (local156 > (float) arg3) {
					break;
				}
				if (local105 + local156 > (float) arg3) {
					local105 = (float) arg3 - local156;
				}
			} else {
				if (local156 < (float) arg3) {
					break;
				}
				if (local105 + local156 < (float) arg3) {
					local105 = (float) arg3 - local156;
				}
			}
			if (!this.method7837(0.0F, 0.0F, local103 + local151, local105 + local156, local151, local156)) {
				return;
			}
			this.method7796();
			local156 += local105 + local166;
			local151 += local103 + local161;
			local103 = local45;
			local105 = local97;
		}
		this.method7739(true);
		this.method7781(0, Static57.aClass312_1);
		this.method7866(0, Static57.aClass312_1);
	}

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "(B)V")
	private void method7743() {
		if (Static269.aClass288_2 == this.aClass288_6) {
			return;
		}
		@Pc(14) Class288 local14 = this.aClass288_6;
		this.aClass288_6 = Static269.aClass288_2;
		if (!local14.method6914()) {
			this.method7751();
		}
		this.method7841();
		this.aFloatArray96 = this.aFloatArray100;
		this.method7759();
		this.anInt9147 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!eu;BLclient!pj;)Z")
	public abstract boolean method7744(@OriginalArg(0) Class114 arg0, @OriginalArg(2) Class278 arg1);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[Lclient!uf;)V")
	@Override
	public final void method7716(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub43[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass5_Sub43Array5[local7] = arg1[local7];
		}
		this.anInt9177 = arg0;
		if (this.aClass288_6.method6914()) {
			this.method7790();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLclient!gn;)V")
	public abstract void method7745(@OriginalArg(1) Class147 arg0);

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt9169 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt9169++;
		}
		this.anInt9179 = 0x1 << this.anInt9169;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V")
	protected abstract void method7746();

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7703(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas12) {
			throw new RuntimeException();
		} else if (this.aHashtable13.containsKey(arg0)) {
			this.method7833(this.aHashtable13.get(arg0), arg0);
			this.aHashtable13.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method7747(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIII[III)Lclient!wp;")
	public abstract Interface26 method7748(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass203_Sub1_16.method4847((float) arg1, (float) arg2, (float) arg0);
		@Pc(30) int local30;
		@Pc(27) int local27;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local30 = (int) ((float) this.anInt9150 * this.aClass203_Sub1_16.method4836((float) arg1, (float) arg0, (float) arg2) / local14);
			local27 = (int) ((float) this.anInt9180 * this.aClass203_Sub1_16.method4854((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local27 = this.anInt9164;
			local30 = this.anInt9158;
		}
		arg3[1] = (int) ((float) local27 - this.aFloat176);
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local30 - this.aFloat180);
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(Z)V")
	protected abstract void method7749();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method7681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method7859();
		this.method7767();
		this.method7806(arg4);
		this.method7866(0, Static291.aClass312_3);
		this.method7781(0, Static291.aClass312_3);
		this.method7800(arg5);
		this.aClass203_Sub1_15.method4834((float) (arg3 - 1), 1.0F, (float) (arg2 - 1));
		this.aClass203_Sub1_15.method4846((float) arg1 - local7, 0.0F, (float) arg0 - local7);
		this.method7735();
		this.method7739(false);
		this.method7774(4, Static230.aClass85_3);
		this.method7739(true);
		this.method7781(0, Static57.aClass312_1);
		this.method7866(0, Static57.aClass312_1);
	}

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt9176;
		arg0[3] = this.anInt9145;
		arg0[1] = this.anInt9153;
		arg0[0] = this.anInt9174;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIZILclient!rt;)V")
	public abstract void method7750(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class312 arg3);

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "()Z")
	@Override
	public final boolean method7665() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		if (local9 == 0.0F && local15 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(42) float local42 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local15 * local15)));
			local15 *= local42;
			local9 *= local42;
		}
		if (!this.method7837(0.0F, 0.0F, local9 + (float) arg2, local15 + (float) arg3, (float) arg0, (float) arg1)) {
			return;
		}
		this.method7767();
		this.method7806(arg4);
		this.method7866(0, Static291.aClass312_3);
		this.method7781(0, Static291.aClass312_3);
		this.method7800(arg5);
		this.method7861();
		this.method7739(false);
		this.method7796();
		this.method7739(true);
		this.method7781(0, Static57.aClass312_1);
		this.method7866(0, Static57.aClass312_1);
	}

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "(Z)V")
	private void method7751() {
		this.aBoolean686 = false;
		if (this.aClass13_3 != null) {
			this.aClass13_3.method8266();
		}
		this.method7766();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!rt;IIZ)V")
	protected abstract void method7752(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	protected abstract void method7753(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
	@Override
	public final void method7724() {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method7754(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "(I)V")
	public final void method7755() {
		this.aClass34Array5 = new Class34[this.anInt9163];
		this.aClass203_Sub1Array3 = new Class203_Sub1[this.anInt9163];
		this.aClass34Array6 = new Class34[this.anInt9163];
		this.aClass357Array3 = new Class357[this.anInt9163];
		this.anInterface22Array3 = new Interface22[this.anInt9163];
		for (@Pc(32) int local32 = 0; local32 < this.anInt9163; local32++) {
			this.aClass34Array5[local32] = Static313.aClass34_88;
			this.aClass34Array6[local32] = Static313.aClass34_88;
			this.aClass357Array3[local32] = Static95.aClass357_1;
			this.aClass203_Sub1Array3[local32] = new Class203_Sub1();
		}
		this.aClass5_Sub43Array5 = new Class5_Sub43[this.anInt9159 - 2];
		this.anInterface22_3 = this.method7834(1, Static412.aClass114_17, 1, Static453.aClass278_13);
		this.method7675(new Class5_Sub10_Sub1(262144));
		this.aClass147_18 = this.method7825(new Class14[] { new Class14(new Class384[] { Static662.aClass384_1, Static662.aClass384_5 }) });
		this.aClass147_19 = this.method7825(new Class14[] { new Class14(new Class384[] { Static662.aClass384_1, Static662.aClass384_3 }) });
		if (29449 != 29449) {
			this.method7690(-50);
		}
		this.aClass147_20 = this.method7825(new Class14[] { new Class14(Static662.aClass384_1), new Class14(Static662.aClass384_3), new Class14(Static662.aClass384_5), new Class14(Static662.aClass384_2) });
		this.aClass147_21 = this.method7825(new Class14[] { new Class14(Static662.aClass384_1), new Class14(Static662.aClass384_3), new Class14(Static662.aClass384_5) });
		this.aClass164_Sub1_25 = new Class164_Sub1(this, 0, 0, false, false);
		this.aClass164_Sub1_30 = new Class164_Sub1(this, 0, 0, true, true);
		this.aClass164_Sub1_24 = new Class164_Sub1(this, 0, 0, false, false);
		this.aClass164_Sub1_23 = new Class164_Sub1(this, 0, 0, true, true);
		this.aClass164_Sub1_27 = new Class164_Sub1(this, 0, 0, false, false);
		this.aClass164_Sub1_29 = new Class164_Sub1(this, 0, 0, true, true);
		this.aClass164_Sub1_22 = new Class164_Sub1(this, 0, 0, false, false);
		this.aClass164_Sub1_21 = new Class164_Sub1(this, 0, 0, true, true);
		this.aClass164_Sub1_28 = new Class164_Sub1(this, 0, 0, false, false);
		this.aClass164_Sub1_26 = new Class164_Sub1(this, 0, 0, true, true);
		this.aClass268_3 = new Class268(this);
		this.anInterface9_8 = this.method7762(true);
		this.method7860();
		this.aClass61_6 = new Class61(this);
		this.aClass13Array3[1] = this.method7864(1);
		this.aClass13Array3[2] = this.method7864(2);
		this.aClass13Array3[4] = this.method7864(4);
		this.aClass13Array3[5] = this.method7864(5);
		this.aClass13Array3[6] = this.method7864(6);
		this.aClass13Array3[7] = this.method7864(7);
		this.aClass13Array3[3] = this.method7864(3);
		this.aClass13Array3[8] = this.method7864(8);
		this.aClass13Array3[9] = this.method7864(9);
		if (!this.aClass13Array3[2].method8270()) {
			this.aClass13Array3[2] = this.method7864(0);
		}
		if (!this.aClass13Array3[4].method8270()) {
			this.aClass13Array3[4] = this.aClass13Array3[2];
		}
		if (!this.aClass13Array3[8].method8270()) {
			this.aClass13Array3[8] = this.aClass13Array3[4];
		}
		if (!this.aClass13Array3[9].method8270()) {
			this.aClass13Array3[9] = this.aClass13Array3[8];
		}
		this.method7824();
		this.la();
		this.method7718();
	}

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "(I)I")
	public final int method7756() {
		return this.anInt9171;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "()Z")
	@Override
	public final boolean method7664() {
		return this.aClass13Array3[3].method8270();
	}

	@OriginalMember(owner = "client!kd", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass203_Sub1_16.aFloat89 + this.aClass203_Sub1_16.aFloat91 * (float) arg2 + this.aClass203_Sub1_16.aFloat90 * (float) arg0 + (float) arg1 * this.aClass203_Sub1_16.aFloat98;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass203_Sub1_16.aFloat91 * (float) arg5 + (float) arg3 * this.aClass203_Sub1_16.aFloat90 + (float) arg4 * this.aClass203_Sub1_16.aFloat98 + this.aClass203_Sub1_16.aFloat89;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt9178 && (float) this.anInt9178 > local63) {
			local7 |= 0x10;
		} else if ((float) this.bf < local32 && (float) this.bf < local63) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) ((float) this.anInt9150 * ((float) arg2 * this.aClass203_Sub1_16.aFloat95 + (float) arg1 * this.aClass203_Sub1_16.aFloat94 + this.aClass203_Sub1_16.aFloat92 * (float) arg0 + this.aClass203_Sub1_16.aFloat88) / local32);
		@Pc(173) int local173 = (int) ((this.aClass203_Sub1_16.aFloat95 * (float) arg5 + (float) arg3 * this.aClass203_Sub1_16.aFloat92 + (float) arg4 * this.aClass203_Sub1_16.aFloat94 + this.aClass203_Sub1_16.aFloat88) * (float) this.anInt9150 / local63);
		if (this.aFloat180 > (float) local141 && this.aFloat180 > (float) local173) {
			local7 |= 0x1;
		} else if ((float) local141 > this.aFloat168 && (float) local173 > this.aFloat168) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) ((this.aClass203_Sub1_16.aFloat93 * (float) arg1 + this.aClass203_Sub1_16.aFloat96 * (float) arg0 + this.aClass203_Sub1_16.aFloat87 * (float) arg2 + this.aClass203_Sub1_16.aFloat97) * (float) this.anInt9180 / local32);
		@Pc(277) int local277 = (int) ((float) this.anInt9180 * ((float) arg4 * this.aClass203_Sub1_16.aFloat93 + this.aClass203_Sub1_16.aFloat96 * (float) arg3 + (float) arg5 * this.aClass203_Sub1_16.aFloat87 + this.aClass203_Sub1_16.aFloat97) / local63);
		if (this.aFloat176 > (float) local245 && this.aFloat176 > (float) local277) {
			local7 |= 0x4;
		} else if (this.aFloat181 < (float) local245 && this.aFloat181 < (float) local277) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "(Z)V")
	protected abstract void method7757();

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "(B)I")
	public final int method7758() {
		return this.anInt9146;
	}

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "(I)V")
	private void method7759() {
		this.method7810();
		if (this.aClass13_3 != null) {
			this.aClass13_3.method8260();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIIIZ)V")
	private void method7760(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(16) boolean local16 = arg4 & this.method7664();
		if (!local16 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			arg2 = 2;
			arg0 = 1;
			arg3 = 0;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt9149 != arg2) {
			if (this.anInt9149 != 0) {
				this.aClass13Array3[this.anInt9149 & Integer.MAX_VALUE].method8261();
			}
			if (arg2 == 0) {
				this.aClass13_3 = null;
			} else {
				this.aClass13_3 = this.aClass13Array3[arg2 & Integer.MAX_VALUE];
				this.aClass13_3.method8273(arg1);
				this.aClass13_3.method8262(arg1);
				this.aClass13_3.method8263(arg0, arg3);
			}
			this.anInt9175 = arg0;
			this.anInt9149 = arg2;
			this.anInt9156 = arg3;
		} else if (this.anInt9149 != 0) {
			this.aClass13Array3[this.anInt9149 & Integer.MAX_VALUE].method8262(arg1);
			if (arg3 != this.anInt9156 || arg0 != this.anInt9175) {
				this.aClass13Array3[this.anInt9149 & Integer.MAX_VALUE].method8263(arg0, arg3);
				this.anInt9175 = arg0;
				this.anInt9156 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(B)Lclient!kn;")
	public final Class203_Sub1 method7761() {
		return this.aClass203_Sub1Array3[this.anInt9160];
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IZ)Lclient!je;")
	public abstract Interface9 method7762(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()V")
	@Override
	protected void method7643() {
		if (this.aBoolean692) {
			return;
		}
		for (@Pc(9) Class5 local9 = this.aClass102_62.method1916(); local9 != null; local9 = this.aClass102_62.method1915()) {
			((Class5_Sub10_Sub1) local9).method1726();
		}
		@Pc(28) Enumeration local28 = this.aHashtable13.keys();
		while (local28.hasMoreElements()) {
			@Pc(38) Canvas local38 = (Canvas) local28.nextElement();
			this.method7833(this.aHashtable13.get(local38), local38);
		}
		Static147.method2073(true, false);
		this.aNativeInterface3.release();
		this.aBoolean692 = true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ol;)V")
	@Override
	public final void method7702(@OriginalArg(0) Class29 arg0) {
		this.aClass29_Sub1_3 = (Class29_Sub1) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "(I)V")
	private void method7763() {
		if (this.aClass13_3 != null) {
			this.aClass13_3.method8272();
		}
		this.method7793();
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(II)V")
	public final void method7764(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method7733(Static362.aClass34_172, Static362.aClass34_172);
		} else if (arg0 == 0) {
			this.method7733(Static313.aClass34_88, Static313.aClass34_88);
		} else if (arg0 == 2) {
			this.method7733(Static362.aClass34_172, Static141.aClass34_77);
		} else if (arg0 == 3) {
			this.method7733(Static313.aClass34_88, Static11.aClass34_6);
		} else if (arg0 == 4) {
			this.method7733(Static414.aClass34_113, Static414.aClass34_113);
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
	protected abstract void method7765();

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "(B)V")
	protected abstract void method7766();

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "(I)V")
	private void method7767() {
		if (this.anInt9147 == 1) {
			return;
		}
		this.method7808();
		this.method7785(false);
		this.method7820(false);
		this.method7789(false);
		this.method7821(false);
		this.method7827(false, -2, false);
		this.method7764(1);
		this.method7813(this.anInterface22_3);
		this.anInt9147 = 1;
	}

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "(B)V")
	protected abstract void method7768();

	@OriginalMember(owner = "client!kd", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass203_Sub1_16.method4847((float) arg1, (float) arg2, (float) arg0);
		if ((float) this.anInt9178 > local14 || local14 > (float) this.bf) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(61) int local61 = (int) ((float) this.anInt9150 * this.aClass203_Sub1_16.method4836((float) arg1, (float) arg0, (float) arg2) / (float) arg3);
		@Pc(80) int local80 = (int) ((float) this.anInt9180 * this.aClass203_Sub1_16.method4854((float) arg0, (float) arg2, (float) arg1) / (float) arg3);
		arg4[1] = (int) ((float) local80 - this.aFloat176);
		arg4[2] = (int) local14;
		arg4[0] = (int) ((float) local61 - this.aFloat180);
	}

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "(B)I")
	public final int method7769() {
		return this.anInt9160;
	}

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "()Lclient!qq;")
	@Override
	public final Class203 method7720() {
		return this.aClass203_Sub1_16;
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(B)V")
	private void method7770() {
		this.aBoolean698 = false;
		this.method7819();
		if (this.aClass288_6 == Static380.aClass288_4) {
			this.method7759();
		}
	}

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "(I)V")
	private void method7771() {
		this.aFloatArray100[10] = this.aFloat166;
		this.aFloatArray100[14] = this.aFloat178;
		this.aFloat169 = (this.aFloatArray100[14] - (float) this.bf) / this.aFloatArray100[10];
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
	public final void method7772() {
		if (this.aClass288_6 == Static33.aClass288_1) {
			return;
		}
		@Pc(17) Class288 local17 = this.aClass288_6;
		this.aClass288_6 = Static33.aClass288_1;
		if (local17.method6914()) {
			this.method7751();
		}
		this.aFloatArray96 = this.aFloatArray95;
		this.anInt9147 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(ZI)Lclient!je;")
	public final Interface9 method7773(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface9_8.method2915()) {
			this.anInterface9_8.method2925(arg0);
		}
		return this.anInterface9_8;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILclient!dea;)V")
	private void method7774(@OriginalArg(1) int arg0, @OriginalArg(2) Class85 arg1) {
		this.method7807(0, this.anInterface25_16);
		this.method7745(this.aClass147_22);
		this.method7854(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt9178 == arg0 && arg1 == this.bf) {
			return;
		}
		this.bf = arg1;
		this.anInt9178 = arg0;
		this.method7809();
		this.method7770();
		this.method7763();
	}

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "(I)V")
	public final void method7775() {
		this.method7774(2, Static271.aClass85_4);
	}

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "(I)V")
	protected abstract void method7776();

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "()Z")
	@Override
	public final boolean method7726() {
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "(I)V")
	protected abstract void method7777();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIIIZ)Lclient!fs;")
	@Override
	public final Class134 method7705(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class134_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!jh;I)V")
	public abstract void method7778(@OriginalArg(0) Class188 arg0);

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "(Z)V")
	protected abstract void method7779();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method7691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "(I)V")
	private void method7780() {
		this.anInterface25_16 = this.method7784(false);
		this.anInterface25_16.method2907(28, 140);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface25_16.method2909();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method7826(local28);
				if (Stream.b()) {
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
				} else {
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
				}
				local35.c();
				if (this.anInterface25_16.method2908()) {
					break;
				}
			}
		}
		this.aClass147_22 = this.method7825(new Class14[] { new Class14(new Class384[] { Static662.aClass384_1, Static662.aClass384_5, Static662.aClass384_5 }) });
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!rt;Z)V")
	public final void method7781(@OriginalArg(0) int arg0, @OriginalArg(1) Class312 arg1) {
		this.method7752(arg1, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9171 = arg0;
		this.anInt9144 = arg2;
		this.aBoolean695 = true;
		this.anInt9146 = arg3;
		this.anInt9152 = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7669(@OriginalArg(0) Canvas arg0) {
		this.anObject16 = null;
		this.aCanvas13 = null;
		if (arg0 == null || arg0 == this.aCanvas12) {
			this.anObject16 = this.anObject15;
			this.aCanvas13 = this.aCanvas12;
		} else if (this.aHashtable13.containsKey(arg0)) {
			this.anObject16 = this.aHashtable13.get(arg0);
			this.aCanvas13 = arg0;
		}
		if (this.aCanvas13 == null || this.anObject16 == null) {
			throw new RuntimeException();
		}
		this.method7753(this.aCanvas13, this.anObject16);
		this.method7857();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class22 method7648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class22_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIIIILclient!eu;[BI)Lclient!wp;")
	protected abstract Interface26 method7782(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(5) Class114 arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZ)Lclient!fs;")
	@Override
	public final Class134 method7688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class134_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "(I)V")
	private void method7783() {
		if (this.aClass288_6 == Static674.aClass288_7) {
			@Pc(19) float local19 = this.method7859();
			this.aClass203_Sub1_15.method4846(local19, 0.0F, local19);
		}
		this.aBoolean686 = false;
		this.method7749();
		if (this.aClass13_3 != null) {
			this.aClass13_3.method8267();
		}
	}

	@OriginalMember(owner = "client!kd", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9164 = arg1;
		this.anInt9180 = arg3;
		this.anInt9150 = arg2;
		this.anInt9158 = arg0;
		this.method7770();
		this.method7809();
		this.method7772();
		this.method7732();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZI)Lclient!sfa;")
	public abstract Interface25 method7784(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)V")
	public final void method7785(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean682 != arg0) {
			this.aBoolean682 = arg0;
			this.method7779();
			this.anInt9147 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt9158, this.anInt9164, this.anInt9150, this.anInt9180 };
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIF)Lclient!uf;")
	@Override
	public final Class5_Sub43 method7680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub43_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BB)V")
	public final void method7786(@OriginalArg(0) byte arg0) {
		this.method7806(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIZI)Lclient!wp;")
	public final Interface26 method7787(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return this.method7748(arg3, 0, 0, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZLclient!eu;I[BI)Lclient!wp;")
	public final Interface26 method7788(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class114 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		return this.method7782(arg0, arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZZ)V")
	public final void method7789(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean685 != arg0) {
			this.aBoolean685 = arg0;
			this.method7757();
			this.anInt9147 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "(B)V")
	protected void method7790() {
		this.anInt9173 = this.anInt9177;
		this.anInt9177 = 0;
	}

	@OriginalMember(owner = "client!kd", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat171) {
			this.aFloat171 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method7746();
			this.method7777();
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(IZ)V")
	public final void method7791(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean691) {
			this.aBoolean691 = arg0;
			this.method7839();
		}
	}

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "(B)I")
	public final int method7792() {
		return this.anInt9152;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	@Override
	public void method7660(@OriginalArg(0) int arg0) {
		if (this.aClass167_3 != null) {
			this.aClass167_3.method3452();
		}
		this.anInt9168 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "(I)V")
	protected abstract void method7793();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!jw;)V")
	@Override
	public final void method7728(@OriginalArg(0) Class193 arg0) {
		this.aClass268_3.method6359(-1, arg0, this);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7699(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas12) {
			local5 = this.anObject16;
		} else if (this.aHashtable13.containsKey(arg0)) {
			local5 = this.aHashtable13.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method7747(arg0, local5);
		if (arg0 == this.aCanvas13) {
			this.method7857();
		}
	}

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "(Z)I")
	public final int method7794() {
		return this.anInt9144;
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(II)V")
	public final void method7795(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt9160) {
			this.anInt9160 = arg0;
			this.method7862();
		}
	}

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "(Z)V")
	private void method7796() {
		this.method7807(0, this.anInterface25_17);
		this.method7745(this.aClass147_17);
		this.method7854(Static184.aClass85_2, 0, 1);
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(IIIIII)Lclient!ol;")
	@Override
	public final Class29 method7667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class29_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7727(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas12) {
			throw new RuntimeException();
		} else if (!this.aHashtable13.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(32) Class local32 = Class.forName("java.awt.Canvas");
				@Pc(44) Method local44 = local32.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local44.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(56) Exception local56) {
			}
			@Pc(61) Object local61 = this.method7754(arg0);
			if (local61 == null) {
				throw new RuntimeException();
			}
			this.aHashtable13.put(arg0, local61);
		}
	}

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7686(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		@Pc(19) float local19 = 0.0F;
		@Pc(21) float local21 = 1.0F;
		if (local10 != 0.0F || local17 != 0.0F) {
			local21 = (float) Math.sqrt((double) (local17 * local17 + local10 * local10));
			local19 = (float) Math.atan2((double) local17, (double) local10);
		}
		this.method7767();
		this.method7806(arg4);
		this.method7866(0, Static291.aClass312_3);
		this.method7781(0, Static291.aClass312_3);
		this.method7800(0);
		this.aClass203_Sub1_15.method4834((float) arg5, 1.0F, local21);
		this.aClass203_Sub1_15.method8335(0, -arg5 / 2, 0);
		this.aClass203_Sub1_15.method8329((int) ((double) local19 * 2607.5945876176133D) & 0x3FFF);
		this.aClass203_Sub1_15.method8335(arg0, arg1, 0);
		this.method7735();
		this.method7739(false);
		this.method7775();
		this.method7739(true);
		this.method7781(0, Static57.aClass312_1);
		this.method7866(0, Static57.aClass312_1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([[IIZI)Lclient!rr;")
	public abstract Interface24 method7797(@OriginalArg(0) int[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "(B)V")
	private void method7799() {
		this.method7746();
		this.method7856();
		this.method7839();
		this.method7790();
		this.method7847();
		this.method7777();
		this.method7849();
		this.method7757();
		this.method7851();
		this.method7779();
		this.method7793();
		this.method7804();
		this.method7816();
		this.method7734();
		for (@Pc(59) int local59 = this.anInt9163 - 1; local59 >= 0; local59--) {
			this.method7795(local59);
			this.method7736();
			this.method7846();
			this.method7850();
		}
		this.method7830();
		this.method7848();
		this.method7810();
		this.method7749();
		this.method7766();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
	public final void method7800(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt9161) {
			return;
		}
		@Pc(30) Class359 local30;
		@Pc(28) boolean local28;
		@Pc(26) boolean local26;
		if (arg0 == 1) {
			local28 = true;
			local30 = Static342.aClass359_4;
			local26 = true;
		} else if (arg0 == 2) {
			local28 = true;
			local26 = false;
			local30 = Static227.aClass359_2;
		} else if (arg0 == 128) {
			local26 = true;
			local30 = Static354.aClass359_5;
			local28 = true;
		} else {
			local26 = false;
			local28 = false;
			local30 = Static60.aClass359_1;
		}
		if (this.aBoolean681 != local26) {
			this.aBoolean681 = local26;
			this.method7734();
		}
		if (this.aBoolean690 != local28) {
			this.aBoolean690 = local28;
			this.method7804();
		}
		if (this.aClass359_7 != local30) {
			this.aClass359_7 = local30;
			this.method7816();
		}
		this.anInt9147 &= 0xFFFFFFE3;
		this.anInt9161 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "(B)V")
	public final void method7801() {
		if (this.anInt9147 == 16) {
			return;
		}
		this.method7835();
		this.method7785(true);
		this.method7789(true);
		this.method7821(true);
		this.method7800(1);
		this.anInt9147 = 16;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method7696() {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!lq;[Lclient!iga;Z)Lclient!da;")
	@Override
	public final Class80 method7708(@OriginalArg(0) Class224 arg0, @OriginalArg(1) Class173[] arg1) {
		return new Class80_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!kn;Z)V")
	public final void method7802(@OriginalArg(0) Class203_Sub1 arg0) {
		this.aClass203_Sub1_15.method8336(arg0);
		this.aBoolean680 = false;
		this.method7783();
	}

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "(I)V")
	private void method7803() {
		this.aBoolean697 = false;
		if (this.aClass288_6 == Static674.aClass288_7) {
			this.method7852();
			this.method7759();
		}
	}

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "(Z)V")
	protected abstract void method7804();

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(Z)V")
	public final void method7805() {
		if (this.anInt9147 == 4) {
			return;
		}
		this.method7808();
		this.method7785(false);
		this.method7820(false);
		this.method7789(false);
		this.method7821(false);
		this.method7827(false, -2, false);
		this.method7800(1);
		this.method7764(0);
		this.anInt9147 = 4;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!iga;Z)Lclient!fs;")
	@Override
	public final Class134 method7654(@OriginalArg(0) Class173 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(149) Class134 local149;
		if (arg0.anInt4282 == 0 || arg0.anInt4287 == 0) {
			local149 = this.method7679(1, new int[1], 1, 1);
		} else {
			@Pc(23) int[] local23 = new int[arg0.anInt4282 * arg0.anInt4287];
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			@Pc(32) int local32;
			@Pc(36) int local36;
			if (arg0.aByteArray27 == null) {
				for (local32 = 0; local32 < arg0.anInt4287; local32++) {
					for (local36 = 0; local36 < arg0.anInt4282; local36++) {
						@Pc(102) int local102 = arg0.anIntArray244[arg0.aByteArray28[local25++] & 0xFF];
						local23[local27++] = local102 == 0 ? 0 : local102 | 0xFF000000;
					}
				}
			} else {
				for (local32 = 0; local32 < arg0.anInt4287; local32++) {
					for (local36 = 0; local36 < arg0.anInt4282; local36++) {
						local23[local27++] = arg0.anIntArray244[arg0.aByteArray28[local25] & 0xFF] | arg0.aByteArray27[local25] << 24;
						local25++;
					}
				}
			}
			local149 = this.method7679(arg0.anInt4282, local23, arg0.anInt4282, arg0.anInt4287);
		}
		local149.method9229(arg0.anInt4283, arg0.anInt4286, arg0.anInt4285, arg0.anInt4284);
		return local149;
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(II)V")
	public final void method7806(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt9155) {
			this.anInt9155 = arg0;
			this.method7830();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!sfa;Z)V")
	public abstract void method7807(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1);

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "(B)V")
	private void method7808() {
		if (this.aClass288_6 == Static674.aClass288_7) {
			return;
		}
		@Pc(11) Class288 local11 = this.aClass288_6;
		this.aClass288_6 = Static674.aClass288_7;
		if (local11.method6914()) {
			this.method7751();
		}
		this.method7852();
		this.aFloatArray96 = this.aFloatArray93;
		this.method7759();
		this.anInt9147 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "(I)V")
	private void method7809() {
		this.aBoolean688 = false;
		this.method7841();
		if (this.aClass288_6 == Static269.aClass288_2) {
			this.method7759();
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
	protected abstract void method7810();

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(Z)Lclient!rr;")
	public final Interface24 method7811() {
		return this.aClass29_Sub1_3 == null ? null : this.aClass29_Sub1_3.method548();
	}

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "(B)Lclient!kn;")
	public final Class203_Sub1 method7812() {
		return this.aClass203_Sub1_19;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!rca;)V")
	public final void method7813(@OriginalArg(1) Interface22 arg0) {
		if (arg0 == this.anInterface22Array3[this.anInt9160]) {
			return;
		}
		this.anInterface22Array3[this.anInt9160] = arg0;
		if (arg0 == null) {
			this.method7776();
		} else {
			arg0.method8305();
		}
		this.anInt9147 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!je;IILclient!dea;IB)V")
	public abstract void method7814(@OriginalArg(0) int arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class85 arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)Lclient!kn;")
	public final Class203_Sub1 method7815() {
		return this.aClass203_Sub1_15;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	@Override
	public final void method7650(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass167_3 != null) {
			this.aClass167_3.method3454();
		}
		this.anInt9167 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "()Z")
	@Override
	public final boolean method7706() {
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)V")
	protected abstract void method7816();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(FB)V")
	public final void method7817(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat173) {
			this.aFloat173 = arg0;
			this.method7770();
		}
	}

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "(B)V")
	public final void method7818() {
		this.method7772();
		this.method7759();
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt9178;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(II)I")
	@Override
	public final int method7670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "(I)V")
	private void method7819() {
		if (this.aBoolean698) {
			return;
		}
		@Pc(17) float[] local17 = this.aFloatArray99;
		@Pc(21) float local21 = (float) this.anInt9178;
		@Pc(25) float local25 = (float) this.bf;
		@Pc(37) float local37 = this.aFloat173 * (float) -this.anInt9164 / (float) this.anInt9180;
		@Pc(49) float local49 = (float) -this.anInt9158 * this.aFloat173 / (float) this.anInt9150;
		@Pc(63) float local63 = (float) (this.anInt9094 - this.anInt9158) * this.aFloat173 / (float) this.anInt9150;
		@Pc(78) float local78 = (float) (this.anInt9025 - this.anInt9164) * this.aFloat173 / (float) this.anInt9180;
		if (local63 == local49 || local37 == local78) {
			local17[0] = 1.0F;
			local17[10] = 1.0F;
			local17[15] = 1.0F;
			local17[5] = 1.0F;
			local17[9] = 0.0F;
			local17[13] = 0.0F;
			local17[1] = 0.0F;
			local17[14] = 0.0F;
			local17[3] = 0.0F;
			local17[4] = 0.0F;
			local17[11] = 0.0F;
			local17[12] = 0.0F;
			local17[6] = 0.0F;
			local17[2] = 0.0F;
			local17[7] = 0.0F;
			local17[8] = 0.0F;
		} else {
			local17[4] = 0.0F;
			local17[3] = 0.0F;
			local17[7] = 0.0F;
			local17[14] = local21 / (local21 - local25);
			local17[10] = 1.0F / (local21 - local25);
			local17[11] = 0.0F;
			local17[8] = 0.0F;
			local17[12] = (local63 + local49) / (-local63 + local49);
			local17[1] = 0.0F;
			local17[2] = 0.0F;
			local17[0] = 2.0F / (local63 - local49);
			local17[9] = 0.0F;
			local17[15] = 1.0F;
			local17[6] = 0.0F;
			local17[5] = 2.0F / (local78 - local37);
			local17[13] = (local37 + local78) / (-local37 + local78);
		}
		this.method7836();
		this.aBoolean698 = true;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(BZ)V")
	public final void method7820(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean693 != arg0) {
			this.aBoolean693 = arg0;
			this.method7839();
			this.anInt9147 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([I)V")
	@Override
	public final void method7692(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt9025;
		arg0[0] = this.anInt9094;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BZ)V")
	public final void method7821(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean700 != arg0) {
			this.aBoolean700 = arg0;
			this.method7851();
			this.anInt9147 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!up;)V")
	public final void method7822(@OriginalArg(1) Class357 arg0) {
		this.aClass357Array3[this.anInt9160] = arg0;
		this.method7858();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([FI)[F")
	public final float[] method7823(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray96[0];
		arg0[8] = this.aFloatArray96[2];
		arg0[4] = this.aFloatArray96[1];
		arg0[12] = this.aFloatArray96[3];
		arg0[5] = this.aFloatArray96[5];
		arg0[2] = this.aFloatArray96[8];
		arg0[9] = this.aFloatArray96[6];
		arg0[13] = this.aFloatArray96[7];
		arg0[1] = this.aFloatArray96[4];
		arg0[7] = this.aFloatArray96[13];
		arg0[14] = this.aFloatArray96[11];
		arg0[6] = this.aFloatArray96[9];
		arg0[10] = this.aFloatArray96[10];
		arg0[3] = this.aFloatArray96[12];
		arg0[11] = this.aFloatArray96[14];
		arg0[15] = this.aFloatArray96[15];
		return arg0;
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(Z)V")
	protected void method7824() {
		this.method7799();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lclient!aia;B)Lclient!gn;")
	public abstract Class147 method7825(@OriginalArg(0) Class14[] arg0);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;B)Lclient!jaclib/memory/Stream;")
	public final Stream method7826(@OriginalArg(0) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIZ)V")
	public final void method7827(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt9151 || this.aBoolean695 != this.aBoolean689) {
			@Pc(19) Interface26 local19 = null;
			@Pc(21) int local21 = 0;
			@Pc(23) byte local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(33) int local33 = this.aBoolean695 ? 3 : 0;
			if (arg1 < 0) {
				this.method7850();
			} else {
				local19 = this.aClass167_3.method3451(arg1);
				@Pc(50) Class233 local50 = super.anInterface1_11.method2863(arg1);
				if (local50.aByte96 == 0 && local50.aByte93 == 0) {
					this.method7850();
				} else {
					@Pc(74) int local74 = local50.aBoolean485 ? 64 : 128;
					@Pc(78) int local78 = local74 * 50;
					@Pc(84) Class203_Sub1 local84 = this.method7829();
					local84.method4852((float) (local50.aByte96 * (this.anInt9168 % local78)) / (float) local78, (float) (local50.aByte93 * (this.anInt9168 % local78)) / (float) local78, 0.0F);
					this.method7822(Static169.aClass357_3);
				}
				local21 = local50.anInt6310;
				if (!this.aBoolean695) {
					local23 = local50.aByte92;
					local25 = local50.anInt6309;
					local33 = local50.aByte94;
				}
			}
			this.method7760(local25, arg2, local33, local23, arg0);
			if (this.aClass13_3 == null) {
				this.method7813(local19);
				this.method7764(local21);
			} else {
				this.aClass13_3.method8274(local21, local19);
			}
			this.anInt9151 = arg1;
			this.aBoolean689 = this.aBoolean695;
		}
		this.anInt9147 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kd", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt9176 = this.anInt9094;
		this.anInt9153 = 0;
		this.anInt9174 = 0;
		this.anInt9145 = this.anInt9025;
		if (this.aBoolean701) {
			this.aBoolean701 = false;
			this.method7831();
		}
		this.method7732();
	}

	@OriginalMember(owner = "client!kd", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean695 = false;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)I")
	@Override
	public final int method7661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7704() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
	@Override
	public final void method7671(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "(I)Lclient!kn;")
	public final Class203_Sub1 method7829() {
		return this.aClass203_Sub1Array3[this.anInt9160];
	}

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "(I)V")
	protected abstract void method7830();

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(Z)V")
	protected abstract void method7831();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	protected abstract void method7833(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "()Z")
	@Override
	public final boolean method7674() {
		return this.aBoolean694;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!eu;ILclient!pj;I)Lclient!wp;")
	public abstract Interface26 method7834(@OriginalArg(0) int arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class278 arg3);

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "()Z")
	@Override
	public final boolean method7707() {
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7767();
		this.method7806(arg3);
		this.method7866(0, Static291.aClass312_3);
		this.method7781(0, Static291.aClass312_3);
		this.method7800(arg4);
		this.aClass203_Sub1_15.method4834((float) arg2, 1.0F, (float) arg2);
		this.aClass203_Sub1_15.method8335(arg0, arg1, 0);
		this.method7735();
		this.method7739(false);
		this.method7807(0, this.anInterface25_18);
		this.method7745(this.aClass147_23);
		this.method7854(Static271.aClass85_4, 0, 256);
		this.method7739(true);
		this.method7781(0, Static57.aClass312_1);
		this.method7866(0, Static57.aClass312_1);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(Z)V")
	private void method7835() {
		if (Static380.aClass288_4 == this.aClass288_6) {
			return;
		}
		@Pc(10) Class288 local10 = this.aClass288_6;
		this.aClass288_6 = Static380.aClass288_4;
		if (!local10.method6914()) {
			this.method7751();
		}
		this.method7819();
		this.aFloatArray96 = this.aFloatArray99;
		this.method7759();
		this.anInt9147 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kd", name = "R", descriptor = "(I)V")
	private void method7836() {
		this.aFloat175 = (float) this.bf;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7678(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(FIFFFFF)Z")
	private boolean method7837(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface25_17.method2909();
		if (local9 == null) {
			return false;
		}
		@Pc(19) Stream local19 = this.method7826(local9);
		if (Stream.b()) {
			local19.b(arg4);
			local19.b(arg5);
			local19.b(arg1);
			local19.b(arg2);
			local19.b(arg3);
			local19.b(arg0);
		} else {
			local19.a(arg4);
			local19.a(arg5);
			local19.a(arg1);
			local19.a(arg2);
			local19.a(arg3);
			local19.a(arg0);
		}
		local19.c();
		return this.anInterface25_17.method2908();
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(II)V")
	public abstract void method7838(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt9174) {
			local5 = true;
			this.anInt9174 = arg0;
		}
		if (arg2 < this.anInt9176) {
			this.anInt9176 = arg2;
			local5 = true;
		}
		if (this.anInt9153 < arg1) {
			local5 = true;
			this.anInt9153 = arg1;
		}
		if (arg3 < this.anInt9145) {
			local5 = true;
			this.anInt9145 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean701) {
			this.aBoolean701 = true;
			this.method7831();
		}
		this.method7768();
		this.method7732();
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	@Override
	public final void method7690(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "(B)V")
	protected abstract void method7839();

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)Lclient!za;")
	@Override
	public final Class5_Sub10 method7646(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub10_Sub1 local8 = new Class5_Sub10_Sub1(arg0);
		this.aClass102_62.method1921(local8);
		return local8;
	}

	@OriginalMember(owner = "client!kd", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt9094 - 1 <= arg2 && arg1 <= 0 && arg3 >= this.anInt9025 - 1) {
			this.la();
			return;
		}
		this.anInt9176 = arg2 > this.anInt9094 ? 0 : arg2;
		this.anInt9174 = arg0 < 0 ? 0 : arg0;
		this.anInt9145 = this.anInt9094 >= arg3 ? arg3 : 0;
		this.anInt9153 = arg1 >= 0 ? arg1 : 0;
		if (!this.aBoolean701) {
			this.aBoolean701 = true;
			this.method7831();
		}
		this.method7768();
		this.method7732();
	}

	@OriginalMember(owner = "client!kd", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(12) boolean local12 = this.anInt9172 != arg0;
		if (local12 || this.aFloat174 != arg1 || arg2 != this.aFloat167) {
			this.aFloat167 = arg2;
			this.aFloat174 = arg1;
			this.anInt9172 = arg0;
			if (local12) {
				this.aFloat179 = (float) (this.anInt9172 & 0xFF) / 255.0F;
				this.aFloat165 = (float) (this.anInt9172 & 0xFF0000) / 1.671168E7F;
				this.aFloat177 = (float) (this.anInt9172 & 0xFF00) / 65280.0F;
				this.method7746();
			}
			this.aNativeInterface3.setSunColour(this.aFloat165, this.aFloat177, this.aFloat179, arg1, arg2);
			this.method7856();
		}
		if (arg3 != this.aFloatArray98[0] || arg4 != this.aFloatArray98[1] || this.aFloatArray98[2] != arg5) {
			this.aFloatArray98[0] = arg3;
			this.aFloatArray98[2] = arg5;
			this.aFloatArray98[1] = arg4;
			this.aFloatArray97[0] = -arg3;
			this.aFloatArray97[1] = -arg4;
			this.aFloatArray97[2] = -arg5;
			@Pc(162) float local162 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray92[0] = arg3 * local162;
			this.aFloatArray92[2] = local162 * arg5;
			this.aFloatArray92[1] = arg4 * local162;
			this.aFloatArray94[1] = -this.aFloatArray92[1];
			this.aFloatArray94[2] = -this.aFloatArray92[2];
			this.aFloatArray94[0] = -this.aFloatArray92[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray92[0], this.aFloatArray92[1], this.aFloatArray92[2]);
			this.method7847();
			this.anInt9182 = (int) (arg3 * 256.0F / arg4);
			this.anInt9154 = (int) (arg5 * 256.0F / arg4);
		}
		this.method7777();
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "(I)[F")
	public final float[] method7840() {
		return this.aFloatArray95;
	}

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "()V")
	@Override
	public final void method7717() {
		if (this.aClass167_3 != null) {
			this.aClass167_3.method3454();
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	private void method7841() {
		if (this.aBoolean688) {
			return;
		}
		@Pc(17) float[] local17 = this.aFloatArray100;
		@Pc(29) float local29 = (float) (-this.anInt9158 * this.anInt9178) / (float) this.anInt9150;
		@Pc(44) float local44 = (float) (this.anInt9178 * (this.anInt9094 - this.anInt9158)) / (float) this.anInt9150;
		@Pc(55) float local55 = (float) (this.anInt9164 * this.anInt9178) / (float) this.anInt9180;
		@Pc(70) float local70 = (float) ((this.anInt9164 - this.anInt9025) * this.anInt9178) / (float) this.anInt9180;
		if (local29 == local44 || local70 == local55) {
			local17[5] = 1.0F;
			local17[12] = 0.0F;
			local17[6] = 0.0F;
			local17[1] = 0.0F;
			local17[0] = 1.0F;
			local17[3] = 0.0F;
			local17[11] = 0.0F;
			local17[15] = 1.0F;
			local17[7] = 0.0F;
			local17[9] = 0.0F;
			local17[8] = 0.0F;
			local17[4] = 0.0F;
			local17[13] = 0.0F;
			local17[14] = 0.0F;
			local17[10] = 1.0F;
			local17[2] = 0.0F;
		} else {
			@Pc(154) float local154 = (float) this.anInt9178 * 2.0F;
			local17[11] = -1.0F;
			local17[7] = 0.0F;
			local17[3] = 0.0F;
			local17[12] = 0.0F;
			local17[2] = 0.0F;
			local17[4] = 0.0F;
			local17[0] = local154 / (local44 - local29);
			local17[10] = this.aFloat166 = (float) this.bf / (float) (this.anInt9178 - this.bf);
			local17[8] = (local44 + local29) / (-local29 + local44);
			local17[14] = this.aFloat178 = (float) (this.anInt9178 * this.bf) / (float) (this.anInt9178 - this.bf);
			local17[13] = 0.0F;
			local17[6] = 0.0F;
			local17[15] = 0.0F;
			local17[5] = local154 / (local55 - local70);
			local17[1] = 0.0F;
			local17[9] = (local70 + local55) / (-local70 + local55);
		}
		this.method7771();
		this.aBoolean688 = true;
	}

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "(I)V")
	public final void method7842() {
		if (this.anInt9147 == 8) {
			return;
		}
		this.method7743();
		this.method7785(true);
		this.method7789(true);
		this.method7821(true);
		this.method7800(1);
		this.anInt9147 = 8;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7644() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "(I)V")
	public final void method7843() {
		if (this.anInt9147 == 2) {
			return;
		}
		this.method7808();
		this.method7785(false);
		this.method7820(false);
		this.method7789(false);
		this.method7821(false);
		this.method7827(false, -2, false);
		this.anInt9147 = 2;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!pj;Lclient!eu;I)Z")
	public abstract boolean method7844(@OriginalArg(0) Class278 arg0, @OriginalArg(1) Class114 arg1);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method7658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static362.method9328(arg3, arg1, arg2, arg0, this);
	}

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "(I)V")
	private void method7845() {
		this.anInterface25_18 = this.method7784(false);
		this.anInterface25_18.method2907(12, 3096);
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(32) Buffer local32 = this.anInterface25_18.method2909();
			if (local32 != null) {
				@Pc(39) Stream local39 = this.method7826(local32);
				local39.b(0.0F);
				local39.b(0.0F);
				local39.b(0.0F);
				for (@Pc(50) int local50 = 0; local50 <= 256; local50++) {
					@Pc(63) double local63 = (double) (local50 * 2) * 3.141592653589793D / 256.0D;
					@Pc(67) float local67 = (float) Math.cos(local63);
					@Pc(71) float local71 = (float) Math.sin(local63);
					if (Stream.b()) {
						local39.b(local71);
						local39.b(local67);
						local39.b(0.0F);
					} else {
						local39.a(local71);
						local39.a(local67);
						local39.a(0.0F);
					}
				}
				local39.c();
				if (this.anInterface25_18.method2908()) {
					break;
				}
			}
		}
		this.aClass147_23 = this.method7825(new Class14[] { new Class14(Static662.aClass384_1) });
	}

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "(I)V")
	protected abstract void method7846();

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "(B)V")
	public abstract void method7847();

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "()Lclient!qq;")
	@Override
	public final Class203 method7672() {
		return this.aClass203_Sub1_21;
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(B)V")
	protected abstract void method7848();

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "(I)V")
	protected abstract void method7849();

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "(I)V")
	public final void method7850() {
		if (this.aClass357Array3[this.anInt9160] != Static95.aClass357_1) {
			this.aClass357Array3[this.anInt9160] = Static95.aClass357_1;
			this.aClass203_Sub1Array3[this.anInt9160].method8337();
			this.method7858();
		}
	}

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "(B)V")
	protected abstract void method7851();

	@OriginalMember(owner = "client!kd", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean695) {
			throw new RuntimeException("");
		}
		this.anInt9152 = arg1;
		this.anInt9146 = arg3;
		this.anInt9171 = arg0;
		this.anInt9144 = arg2;
		if (this.aBoolean689) {
			this.aClass13Array3[3].method8269();
			this.aClass13Array3[3].method8272();
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(Z)V")
	private void method7852() {
		if (this.aBoolean697) {
			return;
		}
		@Pc(16) float[] local16 = this.aFloatArray93;
		if (this.anInt9094 == 0 || this.anInt9025 == 0) {
			local16[8] = 0.0F;
			local16[6] = 0.0F;
			local16[0] = 1.0F;
			local16[1] = 0.0F;
			local16[12] = 0.0F;
			local16[3] = 0.0F;
			local16[11] = 0.0F;
			local16[7] = 0.0F;
			local16[14] = 0.0F;
			local16[2] = 0.0F;
			local16[5] = 1.0F;
			local16[4] = 0.0F;
			local16[13] = 0.0F;
			local16[15] = 1.0F;
			local16[10] = 1.0F;
			local16[9] = 0.0F;
		} else {
			local16[5] = -2.0F / (float) this.anInt9025;
			local16[4] = 0.0F;
			local16[15] = 1.0F;
			local16[9] = 0.0F;
			local16[6] = 0.0F;
			local16[0] = 2.0F / (float) this.anInt9094;
			local16[1] = 0.0F;
			local16[13] = 1.0F;
			local16[12] = -1.0F;
			local16[14] = 0.5F;
			local16[7] = 0.0F;
			local16[2] = 0.0F;
			local16[10] = 0.5F;
			local16[8] = 0.0F;
			local16[3] = 0.0F;
			local16[11] = 0.0F;
		}
		this.aBoolean697 = true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZII[FLclient!eu;III)Lclient!wp;")
	protected abstract Interface26 method7853(@OriginalArg(0) boolean arg0, @OriginalArg(3) float[] arg1, @OriginalArg(4) Class114 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!dea;II)V")
	public abstract void method7854(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method7684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!kd", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass203_Sub1_16.method4847((float) arg1, (float) arg2, (float) arg0);
		@Pc(30) int local30;
		@Pc(27) int local27;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local30 = (int) ((float) this.anInt9150 * this.aClass203_Sub1_16.method4836((float) arg1, (float) arg0, (float) arg2) / local14);
			local27 = (int) ((float) this.anInt9180 * this.aClass203_Sub1_16.method4854((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local27 = this.anInt9164;
			local30 = this.anInt9158;
		}
		arg3[0] = (int) ((float) local30 - this.aFloat180);
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local27 - this.aFloat176);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[FZLclient!eu;II)Lclient!wp;")
	public final Interface26 method7855(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class114 arg3, @OriginalArg(5) int arg4) {
		return this.method7853(arg2, arg1, arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "(I)V")
	protected abstract void method7856();

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "(B)V")
	private void method7857() {
		if (this.aCanvas13 == null) {
			this.anInt9045 = this.anInt9059 = 1;
		} else {
			@Pc(20) Dimension local20 = this.aCanvas13.getSize();
			this.anInt9059 = local20.height;
			this.anInt9045 = local20.width;
		}
		this.anInt9025 = this.anInt9059;
		this.anInt9094 = this.anInt9045;
		this.method7803();
		this.method7809();
		this.method7770();
		this.method7848();
		this.method7732();
		this.method7772();
		this.la();
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "()Z")
	@Override
	public final boolean method7719() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!qq;)V")
	@Override
	public final void method7657(@OriginalArg(0) Class203 arg0) {
		this.aClass203_Sub1_16 = (Class203_Sub1) arg0;
		this.aClass203_Sub1_18.method8336(this.aClass203_Sub1_16);
		this.aClass203_Sub1_18.method4850();
		this.aClass203_Sub1_19.method4838(this.aClass203_Sub1_18);
		this.aClass203_Sub1_17.method4838(this.aClass203_Sub1_16);
		if (this.aClass288_6.method6914()) {
			this.method7751();
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(Z)V")
	private void method7858() {
		this.method7765();
		if (this.aClass13_3 != null) {
			this.aClass13_3.method8268();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIZ)Lclient!fs;")
	@Override
	public final Class134 method7712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class134_Sub3 local11 = new Class134_Sub3(this, arg2, arg3, arg4);
		local11.method9225(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "(B)F")
	protected abstract float method7859();

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "(B)V")
	protected final void method7860() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable13 != null && !this.aHashtable13.isEmpty()) {
			@Pc(22) Enumeration local22 = this.aHashtable13.keys();
			while (local22.hasMoreElements()) {
				@Pc(28) Canvas local28 = (Canvas) local22.nextElement();
				local9.put(local28, this.method7754(local28));
			}
		}
		this.aHashtable13 = local9;
		this.method7780();
		this.method7738();
		this.method7845();
		this.aClass268_3.method6363(this);
	}

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean699 = arg0;
		this.method7851();
	}

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "(I)V")
	public final void method7861() {
		this.aClass203_Sub1_15.method8337();
		this.aBoolean680 = true;
		this.method7783();
	}

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "(B)V")
	protected abstract void method7862();

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "(I)V")
	protected final void method7863() {
		@Pc(17) Enumeration local17 = this.aHashtable13.keys();
		while (local17.hasMoreElements()) {
			@Pc(25) Canvas local25 = (Canvas) local17.nextElement();
			this.method7833(this.aHashtable13.get(local25), local25);
		}
		this.anInterface25_16.method2921();
		this.anInterface25_17.method2921();
		this.anInterface25_18.method2921();
		this.aClass164_Sub1_30.method3355();
		this.aClass164_Sub1_23.method3355();
		this.aClass164_Sub1_29.method3355();
		this.aClass164_Sub1_21.method3355();
		this.aClass164_Sub1_26.method3355();
		this.aClass268_3.method6355();
		this.anInterface9_8.method2921();
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(II)Lclient!oda;")
	protected Class13 method7864(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class13_Sub2(this);
		} else if (arg0 == 1) {
			return new Class13_Sub1(this);
		} else if (arg0 == 2) {
			return new Class13_Sub10(this, this.aClass61_6);
		} else if (arg0 == 7) {
			return new Class13_Sub3(this);
		} else {
			return new Class13_Sub9(this);
		}
	}

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "(B)Lclient!kn;")
	public final Class203_Sub1 method7865() {
		if (!this.aBoolean686) {
			this.aClass203_Sub1_20.method4839(this.aClass203_Sub1_18, this.aClass203_Sub1_15);
			this.aBoolean686 = true;
		}
		return this.aClass203_Sub1_20;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!rt;B)V")
	public final void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) Class312 arg1) {
		this.method7750(false, arg0, false, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "(I)Lclient!kn;")
	public final Class203_Sub1 method7867() {
		return this.aClass203_Sub1_18;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[BIILclient!eu;)Lclient!oea;")
	public abstract Interface19 method7868(@OriginalArg(2) byte[] arg0, @OriginalArg(5) Class114 arg1);
}
