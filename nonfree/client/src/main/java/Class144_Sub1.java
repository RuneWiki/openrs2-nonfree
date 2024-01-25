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

@OriginalClass("client!he")
public abstract class Class144_Sub1 extends Class144 {

	@OriginalMember(owner = "client!he", name = "fb", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!he", name = "le", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!he", name = "Hg", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!he", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!he", name = "Ee", descriptor = "Lclient!lj;")
	protected Class223 aClass223_5;

	@OriginalMember(owner = "client!he", name = "We", descriptor = "I")
	protected int anInt6489;

	@OriginalMember(owner = "client!he", name = "M", descriptor = "I")
	public int anInt6490;

	@OriginalMember(owner = "client!he", name = "Zd", descriptor = "I")
	public int anInt6491;

	@OriginalMember(owner = "client!he", name = "mf", descriptor = "[Lclient!pj;")
	protected Class287[] aClass287Array5;

	@OriginalMember(owner = "client!he", name = "Xe", descriptor = "Z")
	public boolean aBoolean440;

	@OriginalMember(owner = "client!he", name = "Yb", descriptor = "Z")
	public boolean aBoolean441;

	@OriginalMember(owner = "client!he", name = "ad", descriptor = "I")
	public int anInt6497;

	@OriginalMember(owner = "client!he", name = "gf", descriptor = "Lclient!vi;")
	public Interface25 anInterface25_3;

	@OriginalMember(owner = "client!he", name = "Lc", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!he", name = "Fg", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!he", name = "sg", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!he", name = "Pc", descriptor = "I")
	protected int anInt6501;

	@OriginalMember(owner = "client!he", name = "ze", descriptor = "[Lclient!ke;")
	protected Class199[] aClass199Array3;

	@OriginalMember(owner = "client!he", name = "Ld", descriptor = "I")
	public int anInt6502;

	@OriginalMember(owner = "client!he", name = "af", descriptor = "[Lclient!pj;")
	protected Class287[] aClass287Array6;

	@OriginalMember(owner = "client!he", name = "pb", descriptor = "[Lclient!q;")
	protected Class263_Sub2[] aClass263_Sub2Array3;

	@OriginalMember(owner = "client!he", name = "hb", descriptor = "F")
	private float aFloat96;

	@OriginalMember(owner = "client!he", name = "ic", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!he", name = "ng", descriptor = "Z")
	public boolean aBoolean449;

	@OriginalMember(owner = "client!he", name = "Ue", descriptor = "Z")
	protected boolean aBoolean450;

	@OriginalMember(owner = "client!he", name = "Xb", descriptor = "Z")
	protected boolean aBoolean451;

	@OriginalMember(owner = "client!he", name = "db", descriptor = "I")
	protected int anInt6510;

	@OriginalMember(owner = "client!he", name = "sb", descriptor = "I")
	public int anInt6515;

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!he", name = "Cd", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!he", name = "sf", descriptor = "[Lclient!vi;")
	private Interface25[] anInterface25Array3;

	@OriginalMember(owner = "client!he", name = "Uc", descriptor = "Lclient!nd;")
	private Class47_Sub1 aClass47_Sub1_3;

	@OriginalMember(owner = "client!he", name = "Hd", descriptor = "I")
	private int anInt6525;

	@OriginalMember(owner = "client!he", name = "ne", descriptor = "[Lclient!rfa;")
	protected Class14_Sub18[] aClass14_Sub18Array5;

	@OriginalMember(owner = "client!he", name = "Qe", descriptor = "I")
	protected int anInt6527;

	@OriginalMember(owner = "client!he", name = "cb", descriptor = "Lclient!fs;")
	private Class123 aClass123_3;

	@OriginalMember(owner = "client!he", name = "Zc", descriptor = "I")
	public int anInt6529;

	@OriginalMember(owner = "client!he", name = "dg", descriptor = "Lclient!kba;")
	private Class5 aClass5_3;

	@OriginalMember(owner = "client!he", name = "Ve", descriptor = "I")
	protected int anInt6530;

	@OriginalMember(owner = "client!he", name = "E", descriptor = "I")
	private int anInt6531;

	@OriginalMember(owner = "client!he", name = "Nf", descriptor = "F")
	private float aFloat105;

	@OriginalMember(owner = "client!he", name = "lb", descriptor = "Lclient!lia;")
	public Class129_Sub3 lb;

	@OriginalMember(owner = "client!he", name = "G", descriptor = "Lclient!fea;")
	private Interface7 anInterface7_11;

	@OriginalMember(owner = "client!he", name = "Bg", descriptor = "Lclient!lia;")
	public Class129_Sub3 aClass129_Sub3_19;

	@OriginalMember(owner = "client!he", name = "Kb", descriptor = "Lclient!fea;")
	private Interface7 anInterface7_12;

	@OriginalMember(owner = "client!he", name = "Gd", descriptor = "Lclient!lia;")
	public Class129_Sub3 aClass129_Sub3_20;

	@OriginalMember(owner = "client!he", name = "Dd", descriptor = "Lclient!lia;")
	public Class129_Sub3 aClass129_Sub3_21;

	@OriginalMember(owner = "client!he", name = "oe", descriptor = "Lclient!fm;")
	private Interface8 anInterface8_4;

	@OriginalMember(owner = "client!he", name = "Fc", descriptor = "Lclient!fea;")
	private Interface7 anInterface7_13;

	@OriginalMember(owner = "client!he", name = "Vc", descriptor = "Lclient!ok;")
	public Class119 aClass119_17;

	@OriginalMember(owner = "client!he", name = "I", descriptor = "Lclient!lia;")
	public Class129_Sub3 aClass129_Sub3_22;

	@OriginalMember(owner = "client!he", name = "Db", descriptor = "Lclient!lia;")
	public Class129_Sub3 aClass129_Sub3_23;

	@OriginalMember(owner = "client!he", name = "lc", descriptor = "Lclient!lia;")
	public Class129_Sub3 aClass129_Sub3_24;

	@OriginalMember(owner = "client!he", name = "Te", descriptor = "Lclient!lia;")
	public Class129_Sub3 aClass129_Sub3_25;

	@OriginalMember(owner = "client!he", name = "Kf", descriptor = "Lclient!ok;")
	public Class119 aClass119_18;

	@OriginalMember(owner = "client!he", name = "dc", descriptor = "Lclient!ok;")
	public Class119 aClass119_19;

	@OriginalMember(owner = "client!he", name = "P", descriptor = "Lclient!lia;")
	public Class129_Sub3 aClass129_Sub3_26;

	@OriginalMember(owner = "client!he", name = "nc", descriptor = "Lclient!ok;")
	private Class119 aClass119_20;

	@OriginalMember(owner = "client!he", name = "If", descriptor = "Lclient!ok;")
	private Class119 aClass119_21;

	@OriginalMember(owner = "client!he", name = "nd", descriptor = "Lclient!ok;")
	private Class119 aClass119_22;

	@OriginalMember(owner = "client!he", name = "ve", descriptor = "Lclient!ok;")
	public Class119 aClass119_23;

	@OriginalMember(owner = "client!he", name = "Cf", descriptor = "Lclient!lia;")
	public Class129_Sub3 aClass129_Sub3_27;

	@OriginalMember(owner = "client!he", name = "Af", descriptor = "I")
	private int anInt6532;

	@OriginalMember(owner = "client!he", name = "zc", descriptor = "Z")
	protected boolean aBoolean460;

	@OriginalMember(owner = "client!he", name = "xg", descriptor = "Lclient!bd;")
	private final Class32 aClass32_32 = new Class32();

	@OriginalMember(owner = "client!he", name = "Zb", descriptor = "Z")
	protected boolean aBoolean439 = true;

	@OriginalMember(owner = "client!he", name = "Hf", descriptor = "Lclient!q;")
	protected final Class263_Sub2 aClass263_Sub2_15 = new Class263_Sub2();

	@OriginalMember(owner = "client!he", name = "N", descriptor = "Lclient!q;")
	public Class263_Sub2 aClass263_Sub2_16 = new Class263_Sub2();

	@OriginalMember(owner = "client!he", name = "Re", descriptor = "Lclient!q;")
	public final Class263_Sub2 aClass263_Sub2_17 = new Class263_Sub2();

	@OriginalMember(owner = "client!he", name = "zg", descriptor = "Lclient!q;")
	protected final Class263_Sub2 aClass263_Sub2_18 = new Class263_Sub2();

	@OriginalMember(owner = "client!he", name = "Ce", descriptor = "Lclient!q;")
	private final Class263_Sub2 aClass263_Sub2_19 = new Class263_Sub2();

	@OriginalMember(owner = "client!he", name = "Pe", descriptor = "Lclient!q;")
	private final Class263_Sub2 aClass263_Sub2_20 = new Class263_Sub2();

	@OriginalMember(owner = "client!he", name = "yf", descriptor = "Lclient!mda;")
	protected Class231 aClass231_6 = Static282.aClass231_5;

	@OriginalMember(owner = "client!he", name = "df", descriptor = "[F")
	private final float[] aFloatArray49 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!he", name = "Tb", descriptor = "I")
	private int anInt6498 = -1;

	@OriginalMember(owner = "client!he", name = "Eb", descriptor = "[F")
	private final float[] aFloatArray47 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!he", name = "Qb", descriptor = "I")
	public int anInt6492 = 0;

	@OriginalMember(owner = "client!he", name = "Ed", descriptor = "Z")
	protected boolean aBoolean445 = false;

	@OriginalMember(owner = "client!he", name = "Sd", descriptor = "Z")
	protected boolean aBoolean448 = true;

	@OriginalMember(owner = "client!he", name = "qd", descriptor = "I")
	private int anInt6496 = -1;

	@OriginalMember(owner = "client!he", name = "pd", descriptor = "I")
	protected int anInt6503 = 0;

	@OriginalMember(owner = "client!he", name = "wd", descriptor = "I")
	public int anInt6499 = -1;

	@OriginalMember(owner = "client!he", name = "Nb", descriptor = "I")
	public int anInt6507 = -1;

	@OriginalMember(owner = "client!he", name = "zb", descriptor = "[Lclient!kba;")
	private final Class5[] aClass5Array3 = new Class5[10];

	@OriginalMember(owner = "client!he", name = "ge", descriptor = "Lclient!fe;")
	protected Class114 aClass114_6 = Static203.aClass114_2;

	@OriginalMember(owner = "client!he", name = "Be", descriptor = "I")
	public int anInt6493 = 50;

	@OriginalMember(owner = "client!he", name = "fd", descriptor = "Z")
	private boolean aBoolean447 = false;

	@OriginalMember(owner = "client!he", name = "uf", descriptor = "[F")
	public final float[] aFloatArray50 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!he", name = "ud", descriptor = "[F")
	private final float[] aFloatArray52 = new float[16];

	@OriginalMember(owner = "client!he", name = "Mc", descriptor = "I")
	private int anInt6511 = 1;

	@OriginalMember(owner = "client!he", name = "X", descriptor = "F")
	public float aFloat90 = 3584.0F;

	@OriginalMember(owner = "client!he", name = "kc", descriptor = "I")
	public int anInt6512 = 128;

	@OriginalMember(owner = "client!he", name = "Ne", descriptor = "I")
	protected int anInt6519 = 0;

	@OriginalMember(owner = "client!he", name = "qg", descriptor = "I")
	public int anInt6509 = 512;

	@OriginalMember(owner = "client!he", name = "R", descriptor = "I")
	protected final int anInt6513 = 0;

	@OriginalMember(owner = "client!he", name = "Gc", descriptor = "[F")
	private final float[] aFloatArray53 = new float[16];

	@OriginalMember(owner = "client!he", name = "Td", descriptor = "I")
	private int anInt6521 = 0;

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "F")
	public float aFloat98 = 3584.0F;

	@OriginalMember(owner = "client!he", name = "qb", descriptor = "[F")
	public final float[] aFloatArray51 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!he", name = "He", descriptor = "Z")
	private boolean aBoolean455 = false;

	@OriginalMember(owner = "client!he", name = "Ef", descriptor = "Z")
	protected boolean aBoolean442 = true;

	@OriginalMember(owner = "client!he", name = "Lb", descriptor = "[F")
	private final float[] aFloatArray54 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!he", name = "ie", descriptor = "Z")
	protected boolean aBoolean453 = false;

	@OriginalMember(owner = "client!he", name = "Wb", descriptor = "[F")
	protected float[] aFloatArray48 = this.aFloatArray54;

	@OriginalMember(owner = "client!he", name = "Ub", descriptor = "I")
	protected int anInt6522 = 0;

	@OriginalMember(owner = "client!he", name = "kd", descriptor = "I")
	protected int anInt6520 = 3584;

	@OriginalMember(owner = "client!he", name = "Ff", descriptor = "I")
	private int anInt6514 = 0;

	@OriginalMember(owner = "client!he", name = "V", descriptor = "I")
	public int anInt6523 = 3;

	@OriginalMember(owner = "client!he", name = "Df", descriptor = "F")
	public float aFloat103 = 1.0F;

	@OriginalMember(owner = "client!he", name = "zd", descriptor = "I")
	public int anInt6516 = 512;

	@OriginalMember(owner = "client!he", name = "Of", descriptor = "Z")
	protected boolean aBoolean454 = false;

	@OriginalMember(owner = "client!he", name = "md", descriptor = "I")
	protected int anInt6508 = 0;

	@OriginalMember(owner = "client!he", name = "bg", descriptor = "I")
	protected int anInt6495 = 0;

	@OriginalMember(owner = "client!he", name = "ce", descriptor = "I")
	protected final int anInt6528 = 0;

	@OriginalMember(owner = "client!he", name = "Eg", descriptor = "I")
	private int anInt6506 = 0;

	@OriginalMember(owner = "client!he", name = "Wf", descriptor = "F")
	public float aFloat95 = 1.0F;

	@OriginalMember(owner = "client!he", name = "ob", descriptor = "Z")
	protected boolean aBoolean446 = true;

	@OriginalMember(owner = "client!he", name = "ee", descriptor = "I")
	private int anInt6526 = 0;

	@OriginalMember(owner = "client!he", name = "tb", descriptor = "F")
	public float aFloat91 = -1.0F;

	@OriginalMember(owner = "client!he", name = "se", descriptor = "F")
	public float aFloat104 = 1.0F;

	@OriginalMember(owner = "client!he", name = "z", descriptor = "Z")
	private boolean aBoolean443 = false;

	@OriginalMember(owner = "client!he", name = "yc", descriptor = "I")
	private int anInt6494 = -1;

	@OriginalMember(owner = "client!he", name = "rb", descriptor = "I")
	public int anInt6518 = 8;

	@OriginalMember(owner = "client!he", name = "B", descriptor = "Z")
	private boolean aBoolean444 = false;

	@OriginalMember(owner = "client!he", name = "D", descriptor = "Z")
	protected boolean aBoolean458 = true;

	@OriginalMember(owner = "client!he", name = "pg", descriptor = "I")
	public int anInt6517 = 0;

	@OriginalMember(owner = "client!he", name = "Ac", descriptor = "I")
	private int anInt6505 = 16777215;

	@OriginalMember(owner = "client!he", name = "Kc", descriptor = "Z")
	private boolean aBoolean452 = false;

	@OriginalMember(owner = "client!he", name = "xe", descriptor = "I")
	public int anInt6504 = 0;

	@OriginalMember(owner = "client!he", name = "Mf", descriptor = "[F")
	private final float[] aFloatArray55 = new float[16];

	@OriginalMember(owner = "client!he", name = "me", descriptor = "Z")
	protected boolean aBoolean456 = false;

	@OriginalMember(owner = "client!he", name = "ye", descriptor = "F")
	public float aFloat102 = -1.0F;

	@OriginalMember(owner = "client!he", name = "fe", descriptor = "F")
	public float aFloat106 = 1.0F;

	@OriginalMember(owner = "client!he", name = "Ge", descriptor = "Z")
	protected boolean aBoolean457 = true;

	@OriginalMember(owner = "client!he", name = "Yc", descriptor = "Z")
	private boolean aBoolean459 = false;

	@OriginalMember(owner = "client!he", name = "ub", descriptor = "F")
	private float aFloat100 = 1.0F;

	@OriginalMember(owner = "client!he", name = "pe", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream3 = new Stream();

	@OriginalMember(owner = "client!he", name = "vg", descriptor = "Lclient!q;")
	private final Class263_Sub2 aClass263_Sub2_21 = new Class263_Sub2();

	@OriginalMember(owner = "client!he", name = "Ze", descriptor = "Ljava/lang/Object;")
	protected final Object anObject14;

	@OriginalMember(owner = "client!he", name = "gc", descriptor = "Ljava/lang/Object;")
	private Object anObject15;

	@OriginalMember(owner = "client!he", name = "ff", descriptor = "I")
	protected final int anInt6524;

	@OriginalMember(owner = "client!he", name = "Oe", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas6;

	@OriginalMember(owner = "client!he", name = "Zf", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!he", name = "zf", descriptor = "Lclient!rg;")
	protected final Class310 aClass310_76;

	@OriginalMember(owner = "client!he", name = "W", descriptor = "I")
	public final int anInt6500;

	@OriginalMember(owner = "client!he", name = "ld", descriptor = "I")
	private int anInt6453;

	@OriginalMember(owner = "client!he", name = "nf", descriptor = "I")
	public int anInt6409;

	@OriginalMember(owner = "client!he", name = "ke", descriptor = "I")
	private int anInt6430;

	@OriginalMember(owner = "client!he", name = "Ig", descriptor = "I")
	public int anInt6368;

	@OriginalMember(owner = "client!he", name = "gb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!he", name = "Hc", descriptor = "Lclient!ej;")
	private final Class97 aClass97_3;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!rg;II)V")
	protected Class144_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class310 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anObject15 = this.anObject14 = arg1;
			this.anInt6524 = arg4;
			this.aCanvas7 = this.aCanvas6 = arg0;
			this.aClass310_76 = arg3;
			@Pc(305) Dimension local305 = arg0.getSize();
			this.anInt6500 = arg5;
			this.anInt6409 = this.anInt6453 = local305.width;
			this.anInt6368 = this.anInt6430 = local305.height;
			Static302.method4913(true, false);
			if (super.anInterface4_12 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt6500);
				this.aClass97_3 = null;
			} else {
				this.aClass97_3 = new Class97(this, super.anInterface4_12);
				this.aNativeInterface3 = new NativeInterface(super.anInterface4_12.method8976(), this.anInt6500);
				for (@Pc(363) int local363 = 0; super.anInterface4_12.method8976() > local363; local363++) {
					@Pc(370) Class69 local370 = super.anInterface4_12.method8975(local363);
					if (local370 != null) {
						this.aNativeInterface3.initTextureMetrics(local363, local370.aByte22, local370.aByte20);
					}
				}
			}
		} catch (@Pc(395) Throwable local395) {
			local395.printStackTrace();
			this.method6932();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Z)V")
	private void method5642() {
		this.method5696(0, this.anInterface7_12);
		this.method5707(this.aClass119_20);
		this.method5698(0, Static374.aClass213_29, 1);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!vi;I)V")
	public final void method5643(@OriginalArg(0) Interface25 arg0) {
		if (this.anInterface25Array3[this.anInt6503] == arg0) {
			return;
		}
		this.anInterface25Array3[this.anInt6503] = arg0;
		if (arg0 == null) {
			this.method5731();
		} else {
			arg0.method9348();
		}
		this.anInt6525 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method6912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!he", name = "l", descriptor = "(B)V")
	protected abstract void method5644();

	@OriginalMember(owner = "client!he", name = "J", descriptor = "(I)V")
	public final void method5645() {
		this.aBoolean439 = false;
		this.method5686();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBILclient!o;[FZ)Lclient!gka;")
	public final Interface9 method5646(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class260 arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) boolean arg4) {
		return this.method5749(arg0, arg4, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BZI)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method5647(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap5.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class159 method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class159_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!he", name = "t", descriptor = "(B)V")
	protected abstract void method5648();

	@OriginalMember(owner = "client!he", name = "B", descriptor = "()Lclient!rd;")
	@Override
	public final Class263 method6907() {
		return this.aClass263_Sub2_21;
	}

	@OriginalMember(owner = "client!he", name = "t", descriptor = "()Lclient!rd;")
	@Override
	public final Class263 method6914() {
		return new Class263_Sub2();
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
	protected final void method5649() {
		@Pc(7) Hashtable local7 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable5.keys();
			while (local20.hasMoreElements()) {
				@Pc(25) Canvas local25 = (Canvas) local20.nextElement();
				local7.put(local25, this.method5678(local25));
			}
		}
		this.aHashtable5 = local7;
		this.method5754();
		this.method5728();
		this.method5702();
		this.aClass123_3.method2574(this);
	}

	@OriginalMember(owner = "client!he", name = "t", descriptor = "(I)V")
	public final void method5650() {
		if (this.anInt6525 == 8) {
			return;
		}
		this.method5760();
		this.method5764(true);
		this.method5664(true);
		this.method5694(true);
		this.method5685(1);
		this.anInt6525 = 8;
	}

	@OriginalMember(owner = "client!he", name = "p", descriptor = "(I)V")
	private void method5651() {
		this.aBoolean447 = false;
		if (this.aClass5_3 != null) {
			this.aClass5_3.method6875();
		}
		this.method5656();
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(ZI)V")
	public abstract void method5652(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!dea;IIII)Lclient!ka;")
	@Override
	public final Class129 method6908(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class129_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!pj;Lclient!pj;)V")
	public final void method5653(@OriginalArg(1) Class287 arg0, @OriginalArg(2) Class287 arg1) {
		@Pc(10) boolean local10 = false;
		if (arg1 != this.aClass287Array6[this.anInt6503]) {
			this.aClass287Array6[this.anInt6503] = arg1;
			this.method5730();
			local10 = true;
		}
		if (this.aClass287Array5[this.anInt6503] != arg0) {
			this.aClass287Array5[this.anInt6503] = arg0;
			this.method5748();
			local10 = true;
		}
		if (local10) {
			this.anInt6525 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!he", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass263_Sub2_16.method7292((float) arg2, (float) arg1, (float) arg0);
		if ((float) this.anInt6493 > local14 || (float) this.anInt6520 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(61) int local61 = (int) ((float) this.anInt6509 * this.aClass263_Sub2_16.method7296((float) arg0, (float) arg2, (float) arg1) / (float) arg3);
		@Pc(80) int local80 = (int) ((float) this.anInt6516 * this.aClass263_Sub2_16.method7282((float) arg0, (float) arg1, (float) arg2) / (float) arg3);
		arg4[1] = (int) ((float) local80 - this.aFloat93);
		arg4[2] = (int) local14;
		arg4[0] = (int) ((float) local61 - this.aFloat92);
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(B)V")
	protected abstract void method5654();

	@OriginalMember(owner = "client!he", name = "f", descriptor = "()Z")
	@Override
	public final boolean method6944() {
		return true;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method6969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(39) float local39 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local16 * local16)));
			local10 *= local39;
			local16 *= local39;
		}
		if (!this.method5761((float) arg3 + local16, 0.0F, (float) arg1, (float) arg2 + local10, 0.0F, (float) arg0)) {
			return;
		}
		this.method5680();
		this.method5655(arg4);
		this.method5740(Static216.aClass138_5, 0);
		this.method5779(0, Static216.aClass138_5);
		this.method5685(arg5);
		this.method5662();
		this.method5652(false);
		this.method5642();
		this.method5652(true);
		this.method5779(0, Static308.aClass138_4);
		this.method5740(Static308.aClass138_4, 0);
	}

	@OriginalMember(owner = "client!he", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt6522 < arg0) {
			this.anInt6522 = arg0;
			local5 = true;
		}
		if (this.anInt6508 > arg2) {
			local5 = true;
			this.anInt6508 = arg2;
		}
		if (arg1 > this.anInt6519) {
			this.anInt6519 = arg1;
			local5 = true;
		}
		if (this.anInt6495 > arg3) {
			this.anInt6495 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean460) {
			this.aBoolean460 = true;
			this.method5717();
		}
		this.method5708();
		this.method5718();
	}

	@OriginalMember(owner = "client!he", name = "i", descriptor = "(II)V")
	public final void method5655(@OriginalArg(1) int arg0) {
		if (this.anInt6527 != arg0) {
			this.anInt6527 = arg0;
			this.method5688();
		}
	}

	@OriginalMember(owner = "client!he", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt6520;
	}

	@OriginalMember(owner = "client!he", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean441 = false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method6971() {
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!qv;I)V")
	@Override
	public final void method6902(@OriginalArg(0) Class304 arg0, @OriginalArg(1) int arg1) {
		this.aClass123_3.method2579(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!he", name = "S", descriptor = "(I)V")
	protected abstract void method5656();

	@OriginalMember(owner = "client!he", name = "l", descriptor = "()Z")
	@Override
	public final boolean method6920() {
		return true;
	}

	@OriginalMember(owner = "client!he", name = "B", descriptor = "(I)V")
	public final void method5657() {
		if (this.anInt6525 == 16) {
			return;
		}
		this.method5667();
		this.method5764(true);
		this.method5664(true);
		this.method5694(true);
		this.method5685(1);
		this.anInt6525 = 16;
	}

	@OriginalMember(owner = "client!he", name = "C", descriptor = "(I)I")
	public final int method5658() {
		return this.anInt6506;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(B)V")
	protected abstract void method5659();

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V")
	@Override
	public final void method6931() {
	}

	@OriginalMember(owner = "client!he", name = "h", descriptor = "()Z")
	@Override
	public final boolean method6966() {
		return true;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(Z)V")
	protected abstract void method5660();

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(BI)V")
	public final void method5661(@OriginalArg(0) byte arg0) {
		this.method5655(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!he", name = "h", descriptor = "(B)V")
	public final void method5662() {
		this.aClass263_Sub2_15.method8432();
		this.aBoolean439 = true;
		this.method5686();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!q;B)V")
	public final void method5663(@OriginalArg(0) Class263_Sub2 arg0) {
		this.aClass263_Sub2_15.method8437(arg0);
		this.aBoolean439 = false;
		this.method5686();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIF)Lclient!rfa;")
	@Override
	public final Class14_Sub18 method6915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class14_Sub18_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZ)V")
	public final void method5664(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean454) {
			this.aBoolean454 = arg0;
			this.method5660();
			this.anInt6525 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "()Z")
	@Override
	public final boolean method6973() {
		return this.aBoolean450;
	}

	@OriginalMember(owner = "client!he", name = "n", descriptor = "(I)V")
	protected abstract void method5665();

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6493 == arg0 && arg1 == this.anInt6520) {
			return;
		}
		this.anInt6493 = arg0;
		this.anInt6520 = arg1;
		this.method5692();
		this.method5670();
		this.method5693();
	}

	@OriginalMember(owner = "client!he", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt6522 = 0;
		this.anInt6519 = 0;
		this.anInt6508 = this.anInt6409;
		this.anInt6495 = this.anInt6368;
		if (this.aBoolean460) {
			this.aBoolean460 = false;
			this.method5717();
		}
		this.method5718();
	}

	@OriginalMember(owner = "client!he", name = "p", descriptor = "()Z")
	@Override
	public final boolean method6904() {
		return false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method6947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(ZI)V")
	public final void method5666(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean442 != arg0) {
			this.aBoolean442 = arg0;
			this.method5774();
		}
	}

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "(I)V")
	private void method5667() {
		if (Static477.aClass114_7 == this.aClass114_6) {
			return;
		}
		@Pc(18) Class114 local18 = this.aClass114_6;
		this.aClass114_6 = Static477.aClass114_7;
		if (!local18.method2260()) {
			this.method5651();
		}
		this.method5716();
		this.aFloatArray48 = this.aFloatArray52;
		this.method5713();
		this.anInt6525 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([FZ)[F")
	public final float[] method5668(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloatArray48[1];
		arg0[8] = this.aFloatArray48[2];
		arg0[12] = this.aFloatArray48[3];
		arg0[0] = this.aFloatArray48[0];
		arg0[13] = this.aFloatArray48[7];
		arg0[5] = this.aFloatArray48[5];
		arg0[1] = this.aFloatArray48[4];
		arg0[9] = this.aFloatArray48[6];
		arg0[2] = this.aFloatArray48[8];
		arg0[7] = this.aFloatArray48[13];
		arg0[6] = this.aFloatArray48[9];
		arg0[10] = this.aFloatArray48[10];
		arg0[14] = this.aFloatArray48[11];
		arg0[3] = this.aFloatArray48[12];
		arg0[15] = this.aFloatArray48[15];
		arg0[11] = this.aFloatArray48[14];
		return arg0;
	}

	@OriginalMember(owner = "client!he", name = "T", descriptor = "(I)V")
	public final void method5669() {
		this.aClass287Array5 = new Class287[this.anInt6497];
		this.anInterface25Array3 = new Interface25[this.anInt6497];
		this.aClass263_Sub2Array3 = new Class263_Sub2[this.anInt6497];
		this.aClass199Array3 = new Class199[this.anInt6497];
		this.aClass287Array6 = new Class287[this.anInt6497];
		for (@Pc(30) int local30 = 0; local30 < this.anInt6497; local30++) {
			this.aClass287Array5[local30] = Static345.aClass287_2;
			this.aClass287Array6[local30] = Static345.aClass287_2;
			this.aClass199Array3[local30] = Static79.aClass199_1;
			this.aClass263_Sub2Array3[local30] = new Class263_Sub2();
		}
		this.aClass14_Sub18Array5 = new Class14_Sub18[this.anInt6530 - 2];
		this.anInterface25_3 = this.method5753(1, Static641.aClass260_12, 1, Static18.aClass19_4);
		this.method6945(new Class14_Sub16_Sub2(262144));
		this.aClass119_17 = this.method5689(new Class127[] { new Class127(new Class73[] { Static102.aClass73_1, Static102.aClass73_5 }) });
		this.aClass119_19 = this.method5689(new Class127[] { new Class127(new Class73[] { Static102.aClass73_1, Static102.aClass73_3 }) });
		this.aClass119_23 = this.method5689(new Class127[] { new Class127(Static102.aClass73_1), new Class127(Static102.aClass73_3), new Class127(Static102.aClass73_5), new Class127(Static102.aClass73_2) });
		this.aClass119_18 = this.method5689(new Class127[] { new Class127(Static102.aClass73_1), new Class127(Static102.aClass73_3), new Class127(Static102.aClass73_5) });
		this.lb = new Class129_Sub3(this, 0, 0, false, false);
		this.aClass129_Sub3_19 = new Class129_Sub3(this, 0, 0, true, true);
		this.aClass129_Sub3_23 = new Class129_Sub3(this, 0, 0, false, false);
		this.aClass129_Sub3_25 = new Class129_Sub3(this, 0, 0, true, true);
		this.aClass129_Sub3_20 = new Class129_Sub3(this, 0, 0, false, false);
		this.aClass129_Sub3_24 = new Class129_Sub3(this, 0, 0, true, true);
		this.aClass129_Sub3_22 = new Class129_Sub3(this, 0, 0, false, false);
		this.aClass129_Sub3_26 = new Class129_Sub3(this, 0, 0, true, true);
		this.aClass129_Sub3_21 = new Class129_Sub3(this, 0, 0, false, false);
		this.aClass129_Sub3_27 = new Class129_Sub3(this, 0, 0, true, true);
		this.aClass123_3 = new Class123(this);
		this.anInterface8_4 = this.method5736(true);
		this.method5649();
		this.aClass223_5 = new Class223(this);
		this.aClass5Array3[1] = this.method5691(1);
		this.aClass5Array3[2] = this.method5691(2);
		this.aClass5Array3[4] = this.method5691(4);
		this.aClass5Array3[5] = this.method5691(5);
		this.aClass5Array3[6] = this.method5691(6);
		this.aClass5Array3[7] = this.method5691(7);
		this.aClass5Array3[3] = this.method5691(3);
		this.aClass5Array3[8] = this.method5691(8);
		this.aClass5Array3[9] = this.method5691(9);
		if (!this.aClass5Array3[2].method6867()) {
			this.aClass5Array3[2] = this.method5691(0);
		}
		if (!this.aClass5Array3[4].method6867()) {
			this.aClass5Array3[4] = this.aClass5Array3[2];
		}
		if (!this.aClass5Array3[8].method6867()) {
			this.aClass5Array3[8] = this.aClass5Array3[4];
		}
		if (!this.aClass5Array3[9].method6867()) {
			this.aClass5Array3[9] = this.aClass5Array3[8];
		}
		this.method5743();
		this.la();
		this.method6889();
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(II)I")
	@Override
	public final int method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!he", name = "q", descriptor = "(I)V")
	private void method5670() {
		this.aBoolean455 = false;
		this.method5716();
		if (this.aClass114_6 == Static477.aClass114_7) {
			this.method5713();
		}
	}

	@OriginalMember(owner = "client!he", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6969(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!he", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6506 = arg3;
		this.anInt6494 = arg1;
		this.anInt6498 = arg2;
		this.aBoolean441 = true;
		this.anInt6531 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method5672(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	public abstract void method5673();

	@OriginalMember(owner = "client!he", name = "z", descriptor = "(B)Lclient!q;")
	public final Class263_Sub2 method5674() {
		return this.aClass263_Sub2_18;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6893(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method5752(arg0, this.aHashtable5.get(arg0));
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!he", name = "r", descriptor = "(B)V")
	private void method5675() {
		this.method5665();
		this.method5762();
		this.method5700();
		this.method5773();
		this.method5673();
		this.method5725();
		this.method5659();
		this.method5660();
		this.method5777();
		this.method5774();
		this.method5695();
		this.method5742();
		this.method5732();
		this.method5710();
		for (@Pc(60) int local60 = this.anInt6497 - 1; local60 >= 0; local60--) {
			this.method5706(local60);
			this.method5730();
			this.method5748();
			this.method5778();
		}
		this.method5688();
		this.method5644();
		this.method5648();
		this.method5704();
		this.method5656();
	}

	@OriginalMember(owner = "client!he", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean446 = arg0;
		this.method5777();
	}

	@OriginalMember(owner = "client!he", name = "H", descriptor = "(I)I")
	public final int method5676() {
		return this.anInt6531;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method5678(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!he", name = "W", descriptor = "(I)V")
	public final void method5679() {
		this.method5735(Static378.aClass213_30, 2);
	}

	@OriginalMember(owner = "client!he", name = "I", descriptor = "(I)V")
	private void method5680() {
		if (this.anInt6525 == 1) {
			return;
		}
		this.method5771();
		this.method5764(false);
		this.method5745(false);
		this.method5664(false);
		this.method5694(false);
		this.method5769(false, -2, false);
		this.method5723(1);
		this.method5643(this.anInterface25_3);
		this.anInt6525 = 1;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IB)Lclient!fm;")
	public final Interface8 method5681(@OriginalArg(0) int arg0) {
		if (arg0 * 2 > this.anInterface8_4.method5839()) {
			this.anInterface8_4.method5084(arg0);
		}
		return this.anInterface8_4;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!tja;[Lclient!oe;Z)Lclient!da;")
	@Override
	public final Class68 method6958(@OriginalArg(0) Class350 arg0, @OriginalArg(1) Class266[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class68_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method5682(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!he", name = "m", descriptor = "()Z")
	@Override
	public final boolean method6922() {
		return false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIZ)Lclient!fia;")
	@Override
	public final Class45 method6938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class45_Sub2 local11 = new Class45_Sub2(this, arg2, arg3, arg4);
		local11.method7506(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!he", name = "E", descriptor = "(I)V")
	private void method5683() {
		this.method5763();
		if (this.aClass5_3 != null) {
			this.aClass5_3.method6872();
		}
	}

	@OriginalMember(owner = "client!he", name = "j", descriptor = "(Z)I")
	public final int method5684() {
		return this.anInt6494;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(IIIIII)Lclient!lb;")
	@Override
	public final Class47 method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class47_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!he", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat95) {
			this.aFloat95 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method5665();
			this.method5725();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V")
	public final void method5685(@OriginalArg(0) int arg0) {
		if (this.anInt6511 == arg0) {
			return;
		}
		@Pc(21) Class231 local21;
		@Pc(19) boolean local19;
		@Pc(23) boolean local23;
		if (arg0 == 1) {
			local23 = true;
			local19 = true;
			local21 = Static282.aClass231_5;
		} else if (arg0 == 2) {
			local19 = true;
			local21 = Static122.aClass231_2;
			local23 = false;
		} else if (arg0 == 128) {
			local23 = true;
			local21 = Static632.aClass231_7;
			local19 = true;
		} else {
			local23 = false;
			local19 = false;
			local21 = Static18.aClass231_1;
		}
		if (this.aBoolean458 != local23) {
			this.aBoolean458 = local23;
			this.method5710();
		}
		if (this.aBoolean457 != local19) {
			this.aBoolean457 = local19;
			this.method5742();
		}
		if (this.aClass231_6 != local21) {
			this.aClass231_6 = local21;
			this.method5732();
		}
		this.anInt6525 &= 0xFFFFFFE3;
		this.anInt6511 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method6923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method5739();
		this.method5680();
		this.method5655(arg4);
		this.method5740(Static216.aClass138_5, 0);
		this.method5779(0, Static216.aClass138_5);
		this.method5685(arg5);
		this.aClass263_Sub2_15.method7276(1.0F, (float) (arg3 - 1), (float) (arg2 - 1));
		this.aClass263_Sub2_15.method7280(0.0F, (float) arg1 - local7, (float) arg0 - local7);
		this.method5645();
		this.method5652(false);
		this.method5735(Static67.aClass213_6, 4);
		this.method5652(true);
		this.method5779(0, Static308.aClass138_4);
		this.method5740(Static308.aClass138_4, 0);
	}

	@OriginalMember(owner = "client!he", name = "x", descriptor = "(B)V")
	private void method5686() {
		if (this.aClass114_6 == Static183.aClass114_1) {
			@Pc(12) float local12 = this.method5739();
			this.aClass263_Sub2_15.method7280(0.0F, local12, local12);
		}
		this.aBoolean447 = false;
		this.method5704();
		if (this.aClass5_3 != null) {
			this.aClass5_3.method6869();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZI[I)Lclient!gka;")
	public final Interface9 method5687(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		return this.method5703(0, 0, arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!he", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5680();
		this.method5655(arg4);
		this.method5740(Static216.aClass138_5, 0);
		this.method5779(0, Static216.aClass138_5);
		this.method5685(arg5);
		this.aClass263_Sub2_15.method7276(1.0F, (float) arg3, (float) arg2);
		this.aClass263_Sub2_15.method8442(arg0, arg1, 0);
		this.method5645();
		this.method5652(false);
		this.method5679();
		this.method5652(true);
		this.method5779(0, Static308.aClass138_4);
		this.method5740(Static308.aClass138_4, 0);
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
	protected abstract void method5688();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([Lclient!gaa;I)Lclient!ok;")
	public abstract Class119 method5689(@OriginalArg(0) Class127[] arg0);

	@OriginalMember(owner = "client!he", name = "V", descriptor = "(I)[F")
	public final float[] method5690() {
		return this.aFloatArray54;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	@Override
	public final void method6940(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(II)Lclient!kba;")
	protected Class5 method5691(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class5_Sub11(this);
		} else if (arg0 == 1) {
			return new Class5_Sub5(this);
		} else if (arg0 == 2) {
			return new Class5_Sub3(this, this.aClass223_5);
		} else if (arg0 == 7) {
			return new Class5_Sub1(this);
		} else {
			return new Class5_Sub6(this);
		}
	}

	@OriginalMember(owner = "client!he", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt6508;
		arg0[0] = this.anInt6522;
		arg0[3] = this.anInt6495;
		arg0[1] = this.anInt6519;
	}

	@OriginalMember(owner = "client!he", name = "R", descriptor = "(I)V")
	private void method5692() {
		this.aBoolean444 = false;
		this.method5776();
		if (Static244.aClass114_5 == this.aClass114_6) {
			this.method5713();
		}
	}

	@OriginalMember(owner = "client!he", name = "y", descriptor = "(B)V")
	private void method5693() {
		if (this.aClass5_3 != null) {
			this.aClass5_3.method6868();
		}
		this.method5695();
	}

	@OriginalMember(owner = "client!he", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass263_Sub2_16.method7292((float) arg2, (float) arg1, (float) arg0);
		@Pc(27) int local27;
		@Pc(30) int local30;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local27 = (int) ((float) this.anInt6509 * this.aClass263_Sub2_16.method7296((float) arg0, (float) arg2, (float) arg1) / local14);
			local30 = (int) ((float) this.anInt6516 * this.aClass263_Sub2_16.method7282((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local27 = this.anInt6504;
			local30 = this.anInt6492;
		}
		arg3[1] = (int) ((float) local30 - this.aFloat93);
		arg3[0] = (int) ((float) local27 - this.aFloat92);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method6948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(17) float local17 = (float) arg3 - (float) arg1;
		@Pc(44) float local44;
		if (local11 == 0.0F && local17 == 0.0F) {
			local11 = 1.0F;
		} else {
			local44 = (float) (1.0D / Math.sqrt((double) (local11 * local11 + local17 * local17)));
			local11 *= local44;
			local17 *= local44;
		}
		this.method5680();
		this.method5655(arg4);
		this.method5740(Static216.aClass138_5, 0);
		this.method5779(0, Static216.aClass138_5);
		this.method5685(1);
		this.method5662();
		@Pc(82) int local82 = arg7 % (arg5 + arg6);
		this.method5652(false);
		local44 = local11 * (float) arg5;
		@Pc(96) float local96 = (float) arg5 * local17;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = 0.0F;
		@Pc(102) float local102 = local44;
		@Pc(104) float local104 = local96;
		if (local82 <= arg5) {
			local102 = local11 * (float) (arg5 - local82);
			local104 = (float) (arg5 - local82) * local17;
		} else {
			local98 = local11 * (float) (arg6 + arg5 - local82);
			local100 = (float) (arg6 + arg5 - local82) * local17;
		}
		@Pc(152) float local152 = local98 + (float) arg0;
		@Pc(157) float local157 = (float) arg1 + local100;
		@Pc(162) float local162 = (float) arg6 * local11;
		@Pc(167) float local167 = local17 * (float) arg6;
		while (true) {
			if (arg0 < arg2) {
				if ((float) arg2 < local152) {
					break;
				}
				if ((float) arg2 < local102 + local152) {
					local102 = (float) arg2 - local152;
				}
			} else {
				if ((float) arg2 > local152) {
					break;
				}
				if (local102 + local152 < (float) arg2) {
					local102 = (float) arg2 - local152;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 > local157) {
					break;
				}
				if ((float) arg3 > local104 + local157) {
					local104 = (float) arg3 - local157;
				}
			} else {
				if ((float) arg3 < local157) {
					break;
				}
				if ((float) arg3 < local104 + local157) {
					local104 = (float) arg3 - local157;
				}
			}
			if (!this.method5761(local104 + local157, 0.0F, local157, local102 + local152, 0.0F, local152)) {
				return;
			}
			local157 += local104 + local167;
			this.method5642();
			local152 += local162 + local102;
			local102 = local44;
			local104 = local96;
		}
		this.method5652(true);
		this.method5779(0, Static308.aClass138_4);
		this.method5740(Static308.aClass138_4, 0);
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public final Class14_Sub16 method6961(@OriginalArg(0) int arg0) {
		@Pc(8) Class14_Sub16_Sub2 local8 = new Class14_Sub16_Sub2(arg0);
		this.aClass32_32.method582(local8);
		return local8;
	}

	@OriginalMember(owner = "client!he", name = "w", descriptor = "()Z")
	@Override
	public final boolean method6924() {
		return false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BZ)V")
	public final void method5694(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean453 != arg0) {
			this.aBoolean453 = arg0;
			this.method5777();
			this.anInt6525 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!he", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6509 = arg2;
		this.anInt6504 = arg0;
		this.anInt6516 = arg3;
		this.anInt6492 = arg1;
		this.method5670();
		this.method5692();
		this.method5722();
		this.method5718();
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6888(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas6 == arg0) {
			local5 = this.anObject15;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method5672(arg0, local5);
		if (this.aCanvas7 == arg0) {
			this.method5720();
		}
	}

	@OriginalMember(owner = "client!he", name = "U", descriptor = "(I)V")
	protected abstract void method5695();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method6945(@OriginalArg(0) Class14_Sub16 arg0) {
		this.aNativeHeap5 = ((Class14_Sub16_Sub2) arg0).aNativeHeap4;
		this.aNativeHeapBuffer6 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!fea;I)V")
	public abstract void method5696(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1);

	@OriginalMember(owner = "client!he", name = "y", descriptor = "(I)V")
	private void method5697() {
		if (this.aBoolean452) {
			return;
		}
		@Pc(17) float[] local17 = this.aFloatArray55;
		if (this.anInt6409 == 0 || this.anInt6368 == 0) {
			local17[12] = 0.0F;
			local17[3] = 0.0F;
			local17[0] = 1.0F;
			local17[8] = 0.0F;
			local17[14] = 0.0F;
			local17[2] = 0.0F;
			local17[5] = 1.0F;
			local17[9] = 0.0F;
			local17[13] = 0.0F;
			local17[6] = 0.0F;
			local17[7] = 0.0F;
			local17[1] = 0.0F;
			local17[10] = 1.0F;
			local17[15] = 1.0F;
			local17[11] = 0.0F;
			local17[4] = 0.0F;
		} else {
			local17[2] = 0.0F;
			local17[9] = 0.0F;
			local17[7] = 0.0F;
			local17[5] = -2.0F / (float) this.anInt6368;
			local17[13] = 1.0F;
			local17[6] = 0.0F;
			local17[10] = 0.5F;
			local17[12] = -1.0F;
			local17[15] = 1.0F;
			local17[11] = 0.0F;
			local17[8] = 0.0F;
			local17[0] = 2.0F / (float) this.anInt6409;
			local17[3] = 0.0F;
			local17[14] = 0.5F;
			local17[1] = 0.0F;
			local17[4] = 0.0F;
		}
		this.aBoolean452 = true;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6917(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas6 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable5.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(32) Class local32 = Class.forName("java.awt.Canvas");
				@Pc(44) Method local44 = local32.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local44.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(56) Exception local56) {
			}
			@Pc(61) Object local61 = this.method5678(arg0);
			if (local61 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local61);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BILclient!l;I)V")
	public abstract void method5698(@OriginalArg(1) int arg0, @OriginalArg(2) Class213 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!he", name = "A", descriptor = "(B)V")
	protected final void method5699() {
		@Pc(17) Enumeration local17 = this.aHashtable5.keys();
		while (local17.hasMoreElements()) {
			@Pc(25) Canvas local25 = (Canvas) local17.nextElement();
			this.method5752(local25, this.aHashtable5.get(local25));
		}
		this.anInterface7_11.method5842();
		this.anInterface7_12.method5842();
		this.anInterface7_13.method5842();
		this.aClass129_Sub3_19.method5315();
		this.aClass129_Sub3_25.method5315();
		this.aClass129_Sub3_24.method5315();
		this.aClass129_Sub3_26.method5315();
		this.aClass129_Sub3_27.method5315();
		this.aClass123_3.method2576();
		this.anInterface8_4.method5842();
	}

	@OriginalMember(owner = "client!he", name = "n", descriptor = "(B)V")
	protected abstract void method5700();

	@OriginalMember(owner = "client!he", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt6532;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)I")
	@Override
	public final int method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!he", name = "O", descriptor = "(I)I")
	public final int method5701() {
		return this.anInt6498;
	}

	@OriginalMember(owner = "client!he", name = "j", descriptor = "(B)V")
	private void method5702() {
		this.anInterface7_13 = this.method5780(false);
		this.anInterface7_13.method5841(12, 3096);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(35) Buffer local35 = this.anInterface7_13.method5840();
			if (local35 != null) {
				@Pc(42) Stream local42 = this.method5747(local35);
				local42.b(0.0F);
				local42.b(0.0F);
				local42.b(0.0F);
				for (@Pc(53) int local53 = 0; local53 <= 256; local53++) {
					@Pc(63) double local63 = (double) (local53 * 2) * 3.141592653589793D / 256.0D;
					@Pc(67) float local67 = (float) Math.cos(local63);
					@Pc(71) float local71 = (float) Math.sin(local63);
					if (Stream.c()) {
						local42.b(local71);
						local42.b(local67);
						local42.b(0.0F);
					} else {
						local42.a(local71);
						local42.a(local67);
						local42.a(0.0F);
					}
				}
				local42.b();
				if (this.anInterface7_13.method5843()) {
					break;
				}
			}
		}
		this.aClass119_21 = this.method5689(new Class127[] { new Class127(Static102.aClass73_1) });
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII[IIZ)Lclient!gka;")
	public abstract Interface9 method5703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!he", name = "m", descriptor = "(I)V")
	protected abstract void method5704();

	@OriginalMember(owner = "client!he", name = "p", descriptor = "(B)V")
	private void method5705() {
		this.aFloat90 = (float) this.anInt6520;
	}

	@OriginalMember(owner = "client!he", name = "j", descriptor = "(II)V")
	public final void method5706(@OriginalArg(1) int arg0) {
		if (this.anInt6503 != arg0) {
			this.anInt6503 = arg0;
			this.method5654();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ok;I)V")
	public abstract void method5707(@OriginalArg(0) Class119 arg0);

	@OriginalMember(owner = "client!he", name = "o", descriptor = "(I)V")
	protected abstract void method5708();

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
	@Override
	protected void method6905() {
		if (this.aBoolean459) {
			return;
		}
		for (@Pc(13) Class14 local13 = this.aClass32_32.method584(); local13 != null; local13 = this.aClass32_32.method577()) {
			((Class14_Sub16_Sub2) local13).method5094();
		}
		@Pc(32) Enumeration local32 = this.aHashtable5.keys();
		while (local32.hasMoreElements()) {
			@Pc(42) Canvas local42 = (Canvas) local32.nextElement();
			this.method5752(local42, this.aHashtable5.get(local42));
		}
		Static545.method5452(-126, false, true);
		this.aNativeInterface3.release();
		this.aBoolean459 = true;
	}

	@OriginalMember(owner = "client!he", name = "Z", descriptor = "(I)V")
	protected abstract void method5710();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!lb;)V")
	@Override
	public final void method6927(@OriginalArg(0) Class47 arg0) {
		this.aClass47_Sub1_3 = (Class47_Sub1) arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!oe;Z)Lclient!fia;")
	@Override
	public final Class45 method6964(@OriginalArg(0) Class266 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(26) Class45 local26;
		if (arg0.anInt7303 == 0 || arg0.anInt7305 == 0) {
			local26 = this.method6941(1, 1, new int[1], 1);
		} else {
			@Pc(35) int[] local35 = new int[arg0.anInt7305 * arg0.anInt7303];
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			@Pc(44) int local44;
			@Pc(48) int local48;
			if (arg0.aByteArray80 == null) {
				for (local44 = 0; local44 < arg0.anInt7305; local44++) {
					for (local48 = 0; local48 < arg0.anInt7303; local48++) {
						@Pc(61) int local61 = arg0.anIntArray386[arg0.aByteArray79[local37++] & 0xFF];
						local35[local39++] = local61 == 0 ? 0 : local61 | 0xFF000000;
					}
				}
			} else {
				for (local44 = 0; local44 < arg0.anInt7305; local44++) {
					for (local48 = 0; local48 < arg0.anInt7303; local48++) {
						local35[local39++] = arg0.aByteArray80[local37] << 24 | arg0.anIntArray386[arg0.aByteArray79[local37] & 0xFF];
						local37++;
					}
				}
			}
			local26 = this.method6941(arg0.anInt7305, arg0.anInt7303, local35, arg0.anInt7303);
		}
		local26.method7499(arg0.anInt7304, arg0.anInt7308, arg0.anInt7307, arg0.anInt7306);
		return local26;
	}

	@OriginalMember(owner = "client!he", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Interface9 local9 = local6.anInterface9_3;
		this.method5755();
		this.method5643(local9);
		this.method5685(1);
		this.method5653(Static284.aClass287_1, Static284.aClass287_1);
		this.method5740(Static216.aClass138_5, 0);
		this.method5655(arg0);
		this.aClass263_Sub2_15.method7276(0.0F, (float) this.anInt6368, (float) this.anInt6409);
		this.method5645();
		this.aClass263_Sub2Array3[0].method7276(1.0F, local9.method4770((float) this.anInt6368), local9.method4772((float) this.anInt6409));
		this.aClass263_Sub2Array3[0].method7280(0.0F, local9.method4770((float) -arg3), local9.method4772((float) -arg2));
		this.aClass199Array3[0] = Static282.aClass199_6;
		this.method5683();
		this.method5679();
		this.method5778();
		this.method5740(Static308.aClass138_4, 0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V")
	public final void method5712(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean445 != arg0) {
			this.aBoolean445 = arg0;
			this.method5700();
		}
	}

	@OriginalMember(owner = "client!he", name = "N", descriptor = "(I)V")
	private void method5713() {
		this.method5648();
		if (this.aClass5_3 != null) {
			this.aClass5_3.method6876();
		}
	}

	@OriginalMember(owner = "client!he", name = "h", descriptor = "(I)V")
	@Override
	public final void method6913(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([IIIIIZ)Lclient!fia;")
	@Override
	public final Class45 method6935(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class45_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!he", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6969(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt6504, this.anInt6492, this.anInt6509, this.anInt6516 };
	}

	@OriginalMember(owner = "client!he", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean441) {
			throw new RuntimeException("");
		}
		this.anInt6531 = arg0;
		this.anInt6506 = arg3;
		this.anInt6494 = arg1;
		this.anInt6498 = arg2;
		if (this.aBoolean443) {
			this.aClass5Array3[3].method6866();
			this.aClass5Array3[3].method6868();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([BIZIILclient!o;)Lclient!gka;")
	public final Interface9 method5714(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class260 arg4) {
		return this.method5726(arg3, arg1, arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!he", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(16) boolean local16 = this.anInt6505 != arg0;
		if (local16 || arg1 != this.aFloat102 || this.aFloat91 != arg2) {
			this.anInt6505 = arg0;
			this.aFloat102 = arg1;
			this.aFloat91 = arg2;
			if (local16) {
				this.aFloat103 = (float) (this.anInt6505 & 0xFF0000) / 1.671168E7F;
				this.aFloat106 = (float) (this.anInt6505 & 0xFF) / 255.0F;
				this.aFloat104 = (float) (this.anInt6505 & 0xFF00) / 65280.0F;
				this.method5665();
			}
			this.aNativeInterface3.setSunColour(this.aFloat103, this.aFloat104, this.aFloat106, arg1, arg2);
			this.method5762();
		}
		if (this.aFloatArray47[0] != arg3 || arg4 != this.aFloatArray47[1] || this.aFloatArray47[2] != arg5) {
			this.aFloatArray47[1] = arg4;
			this.aFloatArray47[0] = arg3;
			this.aFloatArray47[2] = arg5;
			this.aFloatArray49[0] = -arg3;
			this.aFloatArray49[1] = -arg4;
			this.aFloatArray49[2] = -arg5;
			@Pc(166) float local166 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray51[0] = arg3 * local166;
			this.aFloatArray51[2] = local166 * arg5;
			this.aFloatArray51[1] = local166 * arg4;
			this.aFloatArray50[1] = -this.aFloatArray51[1];
			this.aFloatArray50[2] = -this.aFloatArray51[2];
			this.aFloatArray50[0] = -this.aFloatArray51[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray51[0], this.aFloatArray51[1], this.aFloatArray51[2]);
			this.method5673();
			this.anInt6515 = (int) (arg3 * 256.0F / arg4);
			this.anInt6529 = (int) (arg5 * 256.0F / arg4);
		}
		this.method5725();
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(ZI)V")
	public final void method5715(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean448 != arg0) {
			this.aBoolean448 = arg0;
			this.method5659();
		}
	}

	@OriginalMember(owner = "client!he", name = "G", descriptor = "(I)V")
	private void method5716() {
		if (this.aBoolean455) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray52;
		@Pc(17) float local17 = (float) this.anInt6493;
		@Pc(21) float local21 = (float) this.anInt6520;
		@Pc(33) float local33 = this.aFloat100 * (float) -this.anInt6492 / (float) this.anInt6516;
		@Pc(45) float local45 = this.aFloat100 * (float) -this.anInt6504 / (float) this.anInt6509;
		@Pc(60) float local60 = (float) (this.anInt6409 - this.anInt6504) * this.aFloat100 / (float) this.anInt6509;
		@Pc(75) float local75 = (float) (this.anInt6368 - this.anInt6492) * this.aFloat100 / (float) this.anInt6516;
		if (local45 == local60 || local75 == local33) {
			local13[4] = 0.0F;
			local13[8] = 0.0F;
			local13[5] = 1.0F;
			local13[3] = 0.0F;
			local13[13] = 0.0F;
			local13[6] = 0.0F;
			local13[2] = 0.0F;
			local13[10] = 1.0F;
			local13[7] = 0.0F;
			local13[1] = 0.0F;
			local13[14] = 0.0F;
			local13[11] = 0.0F;
			local13[9] = 0.0F;
			local13[0] = 1.0F;
			local13[15] = 1.0F;
			local13[12] = 0.0F;
		} else {
			local13[0] = 2.0F / (local60 - local45);
			local13[7] = 0.0F;
			local13[12] = (local45 + local60) / (-local60 + local45);
			local13[10] = 1.0F / (local17 - local21);
			local13[1] = 0.0F;
			local13[6] = 0.0F;
			local13[13] = (local33 + local75) / (local75 - local33);
			local13[9] = 0.0F;
			local13[4] = 0.0F;
			local13[15] = 1.0F;
			local13[14] = local17 / (local17 - local21);
			local13[3] = 0.0F;
			local13[5] = 2.0F / (local75 - local33);
			local13[8] = 0.0F;
			local13[11] = 0.0F;
			local13[2] = 0.0F;
		}
		this.method5705();
		this.aBoolean455 = true;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
	@Override
	public final void method6900(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!he", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt6507 && arg1 == this.anInt6499 && arg2 == this.anInt6517) {
			return;
		}
		this.anInt6517 = arg2;
		this.anInt6507 = arg0;
		this.anInt6499 = arg1;
		this.method5693();
		this.method5774();
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "()Lclient!rd;")
	@Override
	public final Class263 method6943() {
		return this.aClass263_Sub2_16;
	}

	@OriginalMember(owner = "client!he", name = "F", descriptor = "(I)V")
	protected abstract void method5717();

	@OriginalMember(owner = "client!he", name = "D", descriptor = "(I)V")
	private void method5718() {
		this.aFloat93 = (float) (this.anInt6519 - this.anInt6492);
		this.aFloat92 = (float) (this.anInt6522 - this.anInt6504);
		this.aFloat97 = (float) (this.anInt6508 - this.anInt6504);
		this.aFloat101 = (float) (this.anInt6495 - this.anInt6492);
	}

	@OriginalMember(owner = "client!he", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt6489 + this.anInt6490 + this.anInt6491;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	private void method5720() {
		if (this.aCanvas7 == null) {
			this.anInt6453 = this.anInt6430 = 1;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas7.getSize();
			this.anInt6430 = local10.height;
			this.anInt6453 = local10.width;
		}
		this.anInt6368 = this.anInt6430;
		this.anInt6409 = this.anInt6453;
		this.method5768();
		this.method5692();
		this.method5670();
		this.method5644();
		this.method5718();
		this.method5722();
		this.la();
	}

	@OriginalMember(owner = "client!he", name = "n", descriptor = "()Z")
	@Override
	public final boolean method6962() {
		return true;
	}

	@OriginalMember(owner = "client!he", name = "u", descriptor = "()Z")
	@Override
	public final boolean method6895() {
		return true;
	}

	@OriginalMember(owner = "client!he", name = "h", descriptor = "(II)V")
	public abstract void method5721(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!he", name = "i", descriptor = "(Z)V")
	public final void method5722() {
		if (Static203.aClass114_2 == this.aClass114_6) {
			return;
		}
		@Pc(18) Class114 local18 = this.aClass114_6;
		this.aClass114_6 = Static203.aClass114_2;
		if (local18.method2260()) {
			this.method5651();
		}
		this.anInt6525 &= 0xFFFFFFE0;
		this.aFloatArray48 = this.aFloatArray54;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)V")
	public final void method5723(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method5653(Static284.aClass287_1, Static284.aClass287_1);
		} else if (arg0 == 0) {
			this.method5653(Static345.aClass287_2, Static345.aClass287_2);
		} else if (arg0 == 2) {
			this.method5653(Static284.aClass287_1, Static448.aClass287_4);
		} else if (arg0 == 3) {
			this.method5653(Static345.aClass287_2, Static408.aClass287_3);
		} else if (arg0 == 4) {
			this.method5653(Static650.aClass287_5, Static650.aClass287_5);
			return;
		}
	}

	@OriginalMember(owner = "client!he", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5680();
		this.method5655(arg3);
		this.method5740(Static216.aClass138_5, 0);
		this.method5779(0, Static216.aClass138_5);
		this.method5685(arg4);
		this.aClass263_Sub2_15.method7276(1.0F, (float) arg2, (float) arg2);
		this.aClass263_Sub2_15.method8442(arg0, arg1, 0);
		this.method5645();
		this.method5652(false);
		this.method5696(0, this.anInterface7_13);
		this.method5707(this.aClass119_21);
		this.method5698(0, Static378.aClass213_30, 256);
		this.method5652(true);
		this.method5779(0, Static308.aClass138_4);
		this.method5740(Static308.aClass138_4, 0);
	}

	@OriginalMember(owner = "client!he", name = "m", descriptor = "(B)Lclient!q;")
	public final Class263_Sub2 method5724() {
		return this.aClass263_Sub2Array3[this.anInt6503];
	}

	@OriginalMember(owner = "client!he", name = "A", descriptor = "(I)V")
	protected abstract void method5725();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIILclient!o;Z[B)Lclient!gka;")
	protected abstract Interface9 method5726(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class260 arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) byte[] arg4);

	@OriginalMember(owner = "client!he", name = "z", descriptor = "(I)Lclient!sba;")
	public final Interface20 method5727() {
		return this.aClass47_Sub1_3 == null ? null : this.aClass47_Sub1_3.method967();
	}

	@OriginalMember(owner = "client!he", name = "u", descriptor = "(B)V")
	private void method5728() {
		this.anInterface7_12 = this.method5780(true);
		this.anInterface7_12.method5841(12, 24);
		this.aClass119_20 = this.method5689(new Class127[] { new Class127(Static102.aClass73_1) });
	}

	@OriginalMember(owner = "client!he", name = "k", descriptor = "(Z)Lclient!q;")
	public final Class263_Sub2 method5729() {
		return this.aClass263_Sub2_15;
	}

	@OriginalMember(owner = "client!he", name = "h", descriptor = "(Z)V")
	protected abstract void method5730();

	@OriginalMember(owner = "client!he", name = "v", descriptor = "(B)V")
	protected abstract void method5731();

	@OriginalMember(owner = "client!he", name = "w", descriptor = "(B)V")
	protected abstract void method5732();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B[BILclient!o;II)Lclient!pw;")
	public abstract Interface18 method5733(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class260 arg1);

	@OriginalMember(owner = "client!he", name = "u", descriptor = "(I)V")
	public final void method5734() {
		this.method5722();
		this.method5713();
	}

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!l;IB)V")
	private void method5735(@OriginalArg(0) Class213 arg0, @OriginalArg(1) int arg1) {
		this.method5696(0, this.anInterface7_11);
		this.method5707(this.aClass119_22);
		this.method5698(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!he", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass263_Sub2_16.method7292((float) arg2, (float) arg1, (float) arg0);
		@Pc(30) int local30;
		@Pc(27) int local27;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local30 = (int) ((float) this.anInt6509 * this.aClass263_Sub2_16.method7296((float) arg0, (float) arg2, (float) arg1) / local14);
			local27 = (int) ((float) this.anInt6516 * this.aClass263_Sub2_16.method7282((float) arg0, (float) arg1, (float) arg2) / local14);
		} else {
			local27 = this.anInt6492;
			local30 = this.anInt6504;
		}
		arg3[1] = (int) ((float) local27 - this.aFloat93);
		arg3[0] = (int) ((float) local30 - this.aFloat92);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()Z")
	@Override
	public final boolean method6955() {
		return true;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(ZZ)Lclient!fm;")
	public abstract Interface8 method5736(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!he", name = "v", descriptor = "(I)Lclient!q;")
	public final Class263_Sub2 method5737() {
		return this.aClass263_Sub2Array3[this.anInt6503];
	}

	@OriginalMember(owner = "client!he", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt6493;
	}

	@OriginalMember(owner = "client!he", name = "A", descriptor = "()I")
	@Override
	public final int method6926() {
		return this.anInt6530 - 2;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZBILclient!gn;)V")
	protected abstract void method5738(@OriginalArg(2) int arg0, @OriginalArg(3) Class138 arg1);

	@OriginalMember(owner = "client!he", name = "w", descriptor = "(I)F")
	protected abstract float method5739();

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6909(@OriginalArg(0) Canvas arg0) {
		this.aCanvas7 = null;
		this.anObject15 = null;
		if (arg0 == null || arg0 == this.aCanvas6) {
			this.anObject15 = this.anObject14;
			this.aCanvas7 = this.aCanvas6;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject15 = this.aHashtable5.get(arg0);
			this.aCanvas7 = arg0;
		}
		if (this.aCanvas7 == null || this.anObject15 == null) {
			throw new RuntimeException();
		}
		this.method5682(this.anObject15, this.aCanvas7);
		this.method5720();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!gn;I)V")
	public final void method5740(@OriginalArg(1) Class138 arg0, @OriginalArg(2) int arg1) {
		this.method5775(arg1, arg0, false, false);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([[IIZI)Lclient!sba;")
	public abstract Interface20 method5741(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!he", name = "l", descriptor = "(I)V")
	protected abstract void method5742();

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(Z)V")
	protected void method5743() {
		this.method5675();
	}

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "(I)V")
	public final void method5744() {
		if (this.anInt6525 == 4) {
			return;
		}
		this.method5771();
		this.method5764(false);
		this.method5745(false);
		this.method5664(false);
		this.method5694(false);
		this.method5769(false, -2, false);
		this.method5685(1);
		this.method5723(0);
		this.anInt6525 = 4;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
	public final void method5745(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean456) {
			this.aBoolean456 = arg0;
			this.method5700();
			this.anInt6525 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!he", name = "k", descriptor = "(I)V")
	@Override
	public final void method6911(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass97_3 != null) {
			this.aClass97_3.method2027();
		}
		this.anInt6512 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILclient!fm;ILclient!l;I)V")
	public abstract void method5746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class213 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;B)Lclient!jaclib/memory/Stream;")
	public final Stream method5747(@OriginalArg(0) Buffer arg0) {
		this.aStream3.a(arg0);
		return this.aStream3;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V")
	@Override
	public final void method6968(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!he", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt6523 = 0;
		while (arg0 > 1) {
			this.anInt6523++;
			arg0 >>= 0x1;
		}
		this.anInt6518 = 0x1 << this.anInt6523;
	}

	@OriginalMember(owner = "client!he", name = "k", descriptor = "(B)V")
	protected abstract void method5748();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZIIILclient!o;I[F)Lclient!gka;")
	protected abstract Interface9 method5749(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class260 arg3, @OriginalArg(7) float[] arg4);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLclient!ke;)V")
	public final void method5750(@OriginalArg(1) Class199 arg0) {
		this.aClass199Array3[this.anInt6503] = arg0;
		this.method5683();
	}

	@OriginalMember(owner = "client!he", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass263_Sub2_16.aFloat174 + this.aClass263_Sub2_16.aFloat168 * (float) arg1 + this.aClass263_Sub2_16.aFloat172 * (float) arg0 + (float) arg2 * this.aClass263_Sub2_16.aFloat167;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass263_Sub2_16.aFloat174 + this.aClass263_Sub2_16.aFloat167 * (float) arg5 + this.aClass263_Sub2_16.aFloat168 * (float) arg4 + this.aClass263_Sub2_16.aFloat172 * (float) arg3;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt6493 && (float) this.anInt6493 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt6520 < local32 && (float) this.anInt6520 < local63) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) ((float) this.anInt6509 * (this.aClass263_Sub2_16.aFloat176 + (float) arg1 * this.aClass263_Sub2_16.aFloat169 + (float) arg0 * this.aClass263_Sub2_16.aFloat173 + this.aClass263_Sub2_16.aFloat175 * (float) arg2) / local32);
		@Pc(173) int local173 = (int) ((float) this.anInt6509 * (this.aClass263_Sub2_16.aFloat173 * (float) arg3 + this.aClass263_Sub2_16.aFloat169 * (float) arg4 + this.aClass263_Sub2_16.aFloat175 * (float) arg5 + this.aClass263_Sub2_16.aFloat176) / local63);
		if ((float) local141 < this.aFloat92 && (float) local173 < this.aFloat92) {
			local7 |= 0x1;
		} else if (this.aFloat97 < (float) local141 && this.aFloat97 < (float) local173) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) ((float) this.anInt6516 * (this.aClass263_Sub2_16.aFloat170 + (float) arg2 * this.aClass263_Sub2_16.aFloat165 + this.aClass263_Sub2_16.aFloat166 * (float) arg1 + (float) arg0 * this.aClass263_Sub2_16.aFloat171) / local32);
		@Pc(277) int local277 = (int) ((float) this.anInt6516 * (this.aClass263_Sub2_16.aFloat170 + (float) arg5 * this.aClass263_Sub2_16.aFloat165 + (float) arg4 * this.aClass263_Sub2_16.aFloat166 + (float) arg3 * this.aClass263_Sub2_16.aFloat171) / local63);
		if ((float) local245 < this.aFloat93 && (float) local277 < this.aFloat93) {
			local7 |= 0x4;
		} else if ((float) local245 > this.aFloat101 && (float) local277 > this.aFloat101) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZIZIZ)V")
	private void method5751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(10) boolean local10 = arg4 & this.method6897();
		if (!local10 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg3 = 1;
			arg0 = 0;
		}
		if (arg1 != 0 && arg2) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt6526 != arg1) {
			if (this.anInt6526 != 0) {
				this.aClass5Array3[this.anInt6526 & Integer.MAX_VALUE].method6865();
			}
			if (arg1 == 0) {
				this.aClass5_3 = null;
			} else {
				this.aClass5_3 = this.aClass5Array3[arg1 & Integer.MAX_VALUE];
				this.aClass5_3.method6873(arg2);
				this.aClass5_3.method6878(arg2);
				this.aClass5_3.method6864(arg0, arg3);
			}
			this.anInt6514 = arg3;
			this.anInt6521 = arg0;
			this.anInt6526 = arg1;
		} else if (this.anInt6526 != 0) {
			this.aClass5Array3[this.anInt6526 & Integer.MAX_VALUE].method6878(arg2);
			if (this.anInt6521 != arg0 || arg3 != this.anInt6514) {
				this.aClass5Array3[this.anInt6526 & Integer.MAX_VALUE].method6864(arg0, arg3);
				this.anInt6521 = arg0;
				this.anInt6514 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	protected abstract void method5752(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!o;BILclient!al;)Lclient!gka;")
	public abstract Interface9 method5753(@OriginalArg(0) int arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19 arg3);

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "(I)V")
	private void method5754() {
		this.anInterface7_11 = this.method5780(false);
		this.anInterface7_11.method5841(28, 140);
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			@Pc(38) Buffer local38 = this.anInterface7_11.method5840();
			if (local38 != null) {
				@Pc(45) Stream local45 = this.method5747(local38);
				if (Stream.c()) {
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(1.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(1.0F);
					local45.b(0.0F);
					local45.b(1.0F);
					local45.b(1.0F);
					local45.b(1.0F);
					local45.b(0.0F);
					local45.b(1.0F);
					local45.b(1.0F);
					local45.b(1.0F);
					local45.b(1.0F);
					local45.b(1.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(1.0F);
					local45.b(0.0F);
					local45.b(1.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
					local45.b(0.0F);
				} else {
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(1.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(1.0F);
					local45.a(0.0F);
					local45.a(1.0F);
					local45.a(1.0F);
					local45.a(1.0F);
					local45.a(0.0F);
					local45.a(1.0F);
					local45.a(1.0F);
					local45.a(1.0F);
					local45.a(1.0F);
					local45.a(1.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(1.0F);
					local45.a(0.0F);
					local45.a(1.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
					local45.a(0.0F);
				}
				local45.b();
				if (this.anInterface7_11.method5843()) {
					break;
				}
			}
		}
		this.aClass119_22 = this.method5689(new Class127[] { new Class127(new Class73[] { Static102.aClass73_1, Static102.aClass73_5, Static102.aClass73_5 }) });
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZ)Lclient!fia;")
	@Override
	public final Class45 method6890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class45_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	@Override
	public void method6946(@OriginalArg(0) int arg0) {
		if (this.aClass97_3 != null) {
			this.aClass97_3.method2030();
		}
		this.anInt6502 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local10 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local16 * local16 + local10 * local10));
			local18 = (float) Math.atan2((double) local16, (double) local10);
		}
		this.method5680();
		this.method5655(arg4);
		this.method5740(Static216.aClass138_5, 0);
		this.method5779(0, Static216.aClass138_5);
		this.method5685(0);
		this.aClass263_Sub2_15.method7276(1.0F, (float) arg5, local20);
		this.aClass263_Sub2_15.method8442(0, -arg5 / 2, 0);
		this.aClass263_Sub2_15.method8441((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass263_Sub2_15.method8442(arg0, arg1, 0);
		this.method5645();
		this.method5652(false);
		this.method5679();
		this.method5652(true);
		this.method5779(0, Static308.aClass138_4);
		this.method5740(Static308.aClass138_4, 0);
	}

	@OriginalMember(owner = "client!he", name = "s", descriptor = "(B)V")
	public final void method5755() {
		if (this.anInt6525 == 2) {
			return;
		}
		this.method5771();
		this.method5764(false);
		this.method5745(false);
		this.method5664(false);
		this.method5694(false);
		this.method5769(false, -2, false);
		this.anInt6525 = 2;
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(B)V")
	private void method5756() {
		this.aFloatArray53[14] = this.aFloat105;
		this.aFloatArray53[10] = this.aFloat96;
		this.aFloat98 = ((float) -this.anInt6520 + this.aFloatArray53[14]) / this.aFloatArray53[10];
	}

	@OriginalMember(owner = "client!he", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt6409 - 1 <= arg2 && arg1 <= 0 && arg3 >= this.anInt6368 - 1) {
			this.la();
			return;
		}
		this.anInt6522 = arg0 >= 0 ? arg0 : 0;
		this.anInt6495 = arg3 <= this.anInt6409 ? arg3 : 0;
		this.anInt6508 = this.anInt6409 < arg2 ? 0 : arg2;
		this.anInt6519 = arg1 < 0 ? 0 : arg1;
		if (!this.aBoolean460) {
			this.aBoolean460 = true;
			this.method5717();
		}
		this.method5708();
		this.method5718();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!al;Lclient!o;I)Z")
	public abstract boolean method5757(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class260 arg1);

	@OriginalMember(owner = "client!he", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass263_Sub2_16.aFloat174 + this.aClass263_Sub2_16.aFloat167 * (float) arg2 + (float) arg0 * this.aClass263_Sub2_16.aFloat172 + (float) arg1 * this.aClass263_Sub2_16.aFloat168;
		@Pc(57) float local57 = this.aClass263_Sub2_16.aFloat174 + (float) arg3 * this.aClass263_Sub2_16.aFloat172 + (float) arg4 * this.aClass263_Sub2_16.aFloat168 + this.aClass263_Sub2_16.aFloat167 * (float) arg5;
		if ((float) this.anInt6493 > local32 && local57 < (float) this.anInt6493) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt6520 && local57 > (float) this.anInt6520) {
			local7 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((this.aClass263_Sub2_16.aFloat175 * (float) arg2 + (float) arg1 * this.aClass263_Sub2_16.aFloat169 + this.aClass263_Sub2_16.aFloat173 * (float) arg0 + this.aClass263_Sub2_16.aFloat176) * (float) this.anInt6509 / (float) arg6);
		@Pc(163) int local163 = (int) ((this.aClass263_Sub2_16.aFloat176 + this.aClass263_Sub2_16.aFloat175 * (float) arg5 + this.aClass263_Sub2_16.aFloat169 * (float) arg4 + this.aClass263_Sub2_16.aFloat173 * (float) arg3) * (float) this.anInt6509 / (float) arg6);
		if (this.aFloat92 > (float) local130 && (float) local163 < this.aFloat92) {
			local7 |= 0x1;
		} else if (this.aFloat97 < (float) local130 && (float) local163 > this.aFloat97) {
			local7 |= 0x2;
		}
		@Pc(236) int local236 = (int) ((float) this.anInt6516 * (this.aClass263_Sub2_16.aFloat166 * (float) arg1 + (float) arg0 * this.aClass263_Sub2_16.aFloat171 + (float) arg2 * this.aClass263_Sub2_16.aFloat165 + this.aClass263_Sub2_16.aFloat170) / (float) arg6);
		@Pc(269) int local269 = (int) ((this.aClass263_Sub2_16.aFloat170 + this.aClass263_Sub2_16.aFloat165 * (float) arg5 + (float) arg4 * this.aClass263_Sub2_16.aFloat166 + (float) arg3 * this.aClass263_Sub2_16.aFloat171) * (float) this.anInt6516 / (float) arg6);
		if (this.aFloat93 > (float) local236 && (float) local269 < this.aFloat93) {
			local7 |= 0x4;
		} else if (this.aFloat101 < (float) local236 && this.aFloat101 < (float) local269) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!he", name = "K", descriptor = "(I)Lclient!q;")
	public final Class263_Sub2 method5758() {
		return this.aClass263_Sub2_19;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!al;BLclient!o;)Z")
	public abstract boolean method5759(@OriginalArg(0) Class19 arg0, @OriginalArg(2) Class260 arg1);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!qv;)V")
	@Override
	public final void method6903(@OriginalArg(0) Class304 arg0) {
		this.aClass123_3.method2579(arg0, this, -1);
	}

	@OriginalMember(owner = "client!he", name = "x", descriptor = "(I)V")
	private void method5760() {
		if (Static244.aClass114_5 == this.aClass114_6) {
			return;
		}
		@Pc(10) Class114 local10 = this.aClass114_6;
		this.aClass114_6 = Static244.aClass114_5;
		if (!local10.method2260()) {
			this.method5651();
		}
		this.method5776();
		this.aFloatArray48 = this.aFloatArray53;
		this.method5713();
		this.anInt6525 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!he", name = "o", descriptor = "()Z")
	@Override
	public final boolean method6897() {
		return this.aClass5Array3[3].method6867();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(FFFIFFF)Z")
	private boolean method5761(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(16) Buffer local16 = this.anInterface7_12.method5840();
		if (local16 == null) {
			return false;
		}
		@Pc(26) Stream local26 = this.method5747(local16);
		if (Stream.c()) {
			local26.b(arg5);
			local26.b(arg2);
			local26.b(arg4);
			local26.b(arg3);
			local26.b(arg0);
			local26.b(arg1);
		} else {
			local26.a(arg5);
			local26.a(arg2);
			local26.a(arg4);
			local26.a(arg3);
			local26.a(arg0);
			local26.a(arg1);
		}
		local26.b();
		return this.anInterface7_12.method5843();
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(Z)V")
	protected abstract void method5762();

	@OriginalMember(owner = "client!he", name = "P", descriptor = "(I)V")
	protected abstract void method5763();

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IZ)V")
	public final void method5764(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean451) {
			this.aBoolean451 = arg0;
			this.method5774();
			this.anInt6525 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!he", name = "r", descriptor = "(I)Lclient!q;")
	public final Class263_Sub2 method5765() {
		if (!this.aBoolean447) {
			this.aClass263_Sub2_20.method7277(this.aClass263_Sub2_18, this.aClass263_Sub2_15);
			this.aBoolean447 = true;
		}
		return this.aClass263_Sub2_20;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(FI)V")
	public final void method5766(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat100) {
			this.aFloat100 = arg0;
			this.method5670();
		}
	}

	@OriginalMember(owner = "client!he", name = "z", descriptor = "()V")
	@Override
	public final void method6950() {
		if (this.aClass97_3 != null) {
			this.aClass97_3.method2027();
		}
	}

	@OriginalMember(owner = "client!he", name = "v", descriptor = "()Z")
	@Override
	public final boolean method6972() {
		return true;
	}

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "(I)V")
	private void method5768() {
		this.aBoolean452 = false;
		if (this.aClass114_6 == Static183.aClass114_1) {
			this.method5697();
			this.method5713();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZIZ)V")
	public final void method5769(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt6496 || this.aBoolean441 != this.aBoolean443) {
			@Pc(27) Interface9 local27 = null;
			@Pc(29) int local29 = 0;
			@Pc(31) byte local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(41) int local41 = this.aBoolean441 ? 3 : 0;
			if (arg1 < 0) {
				this.method5778();
			} else {
				local27 = this.aClass97_3.method2029(arg1);
				@Pc(55) Class69 local55 = super.anInterface4_12.method8975(arg1);
				if (local55.aByte23 == 0 && local55.aByte24 == 0) {
					this.method5778();
				} else {
					@Pc(83) int local83 = local55.aBoolean113 ? 64 : 128;
					@Pc(87) int local87 = local83 * 50;
					@Pc(91) Class263_Sub2 local91 = this.method5724();
					local91.method7285(0.0F, (float) (this.anInt6502 % local87 * local55.aByte23) / (float) local87, (float) (local55.aByte24 * (this.anInt6502 % local87)) / (float) local87);
					this.method5750(Static282.aClass199_6);
				}
				local29 = local55.anInt1680;
				if (!this.aBoolean441) {
					local41 = local55.aByte19;
					local33 = local55.anInt1677;
					local31 = local55.aByte18;
				}
			}
			this.method5751(local31, local41, arg2, local33, arg0);
			if (this.aClass5_3 == null) {
				this.method5643(local27);
				this.method5723(local29);
			} else {
				this.aClass5_3.method6877(local29, local27);
			}
			this.anInt6496 = arg1;
			this.aBoolean443 = this.aBoolean441;
		}
		this.anInt6525 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!he", name = "i", descriptor = "(B)I")
	public final int method5770() {
		return this.anInt6503;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	private void method5771() {
		if (Static183.aClass114_1 == this.aClass114_6) {
			return;
		}
		@Pc(10) Class114 local10 = this.aClass114_6;
		this.aClass114_6 = Static183.aClass114_1;
		if (local10.method2260()) {
			this.method5651();
		}
		this.method5697();
		this.aFloatArray48 = this.aFloatArray55;
		this.method5713();
		this.anInt6525 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!rd;)V")
	@Override
	public final void method6896(@OriginalArg(0) Class263 arg0) {
		this.aClass263_Sub2_16 = (Class263_Sub2) arg0;
		this.aClass263_Sub2_18.method8437(this.aClass263_Sub2_16);
		this.aClass263_Sub2_18.method7283();
		this.aClass263_Sub2_19.method7293(this.aClass263_Sub2_18);
		this.aClass263_Sub2_17.method7293(this.aClass263_Sub2_16);
		if (this.aClass114_6.method2260()) {
			this.method5651();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method6930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static189.method2829(arg0, arg2, arg1, arg3, this);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I[Lclient!rfa;)V")
	@Override
	public final void method6970(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub18[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass14_Sub18Array5[local3] = arg1[local3];
		}
		this.anInt6501 = arg0;
		if (this.aClass114_6.method2260()) {
			this.method5773();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ida;Z)V")
	public abstract void method5772(@OriginalArg(0) Class170 arg0);

	@OriginalMember(owner = "client!he", name = "L", descriptor = "(I)V")
	protected void method5773() {
		this.anInt6510 = this.anInt6501;
		this.anInt6501 = 0;
	}

	@OriginalMember(owner = "client!he", name = "s", descriptor = "(I)V")
	protected abstract void method5774();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!gn;ZZI)V")
	public abstract void method5775(@OriginalArg(0) int arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([I)V")
	@Override
	public final void method6921(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6368;
		arg0[0] = this.anInt6409;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(Z)V")
	private void method5776() {
		if (this.aBoolean444) {
			return;
		}
		@Pc(17) float[] local17 = this.aFloatArray53;
		@Pc(29) float local29 = (float) (this.anInt6493 * -this.anInt6504) / (float) this.anInt6509;
		@Pc(44) float local44 = (float) ((this.anInt6409 - this.anInt6504) * this.anInt6493) / (float) this.anInt6509;
		@Pc(55) float local55 = (float) (this.anInt6493 * this.anInt6492) / (float) this.anInt6516;
		@Pc(70) float local70 = (float) (this.anInt6493 * (this.anInt6492 - this.anInt6368)) / (float) this.anInt6516;
		if (local44 == local29 || local70 == local55) {
			local17[13] = 0.0F;
			local17[4] = 0.0F;
			local17[6] = 0.0F;
			local17[15] = 1.0F;
			local17[12] = 0.0F;
			local17[8] = 0.0F;
			local17[2] = 0.0F;
			local17[11] = 0.0F;
			local17[10] = 1.0F;
			local17[3] = 0.0F;
			local17[0] = 1.0F;
			local17[1] = 0.0F;
			local17[9] = 0.0F;
			local17[14] = 0.0F;
			local17[5] = 1.0F;
			local17[7] = 0.0F;
		} else {
			@Pc(86) float local86 = (float) this.anInt6493 * 2.0F;
			local17[7] = 0.0F;
			local17[9] = (local70 + local55) / (local55 - local70);
			local17[5] = local86 / (local55 - local70);
			local17[10] = this.aFloat96 = (float) this.anInt6520 / (float) (this.anInt6493 - this.anInt6520);
			local17[14] = this.aFloat105 = (float) (this.anInt6520 * this.anInt6493) / (float) (this.anInt6493 - this.anInt6520);
			local17[1] = 0.0F;
			local17[3] = 0.0F;
			local17[13] = 0.0F;
			local17[8] = (local29 + local44) / (local44 - local29);
			local17[11] = -1.0F;
			local17[4] = 0.0F;
			local17[12] = 0.0F;
			local17[2] = 0.0F;
			local17[15] = 0.0F;
			local17[6] = 0.0F;
			local17[0] = local86 / (local44 - local29);
		}
		this.method5756();
		this.aBoolean444 = true;
	}

	@OriginalMember(owner = "client!he", name = "o", descriptor = "(B)V")
	protected abstract void method5777();

	@OriginalMember(owner = "client!he", name = "cb", descriptor = "(I)V")
	public final void method5778() {
		if (this.aClass199Array3[this.anInt6503] != Static79.aClass199_1) {
			this.aClass199Array3[this.anInt6503] = Static79.aClass199_1;
			this.aClass263_Sub2Array3[this.anInt6503].method8432();
			this.method5683();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLclient!gn;)V")
	public final void method5779(@OriginalArg(0) int arg0, @OriginalArg(2) Class138 arg1) {
		this.method5738(arg0, arg1);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(ZI)Lclient!fea;")
	public abstract Interface7 method5780(@OriginalArg(0) boolean arg0);
}
