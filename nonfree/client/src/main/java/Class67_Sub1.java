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

@OriginalClass("client!nb")
public abstract class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!nb", name = "fd", descriptor = "[I")
	public static final int[] anIntArray361 = new int[32];

	@OriginalMember(owner = "client!nb", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!nb", name = "se", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!nb", name = "Vd", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!nb", name = "lc", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!nb", name = "ve", descriptor = "Lclient!dma;")
	protected Class76 aClass76_5;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
	protected int anInt6635;

	@OriginalMember(owner = "client!nb", name = "vg", descriptor = "I")
	public int anInt6648;

	@OriginalMember(owner = "client!nb", name = "le", descriptor = "I")
	public int anInt6649;

	@OriginalMember(owner = "client!nb", name = "md", descriptor = "Lclient!hg;")
	private Class121 aClass121_3;

	@OriginalMember(owner = "client!nb", name = "de", descriptor = "Lclient!rl;")
	private Class324 aClass324_3;

	@OriginalMember(owner = "client!nb", name = "tg", descriptor = "Z")
	protected boolean aBoolean504;

	@OriginalMember(owner = "client!nb", name = "Id", descriptor = "F")
	private float aFloat111;

	@OriginalMember(owner = "client!nb", name = "Pb", descriptor = "Z")
	public boolean aBoolean505;

	@OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
	public int anInt6654;

	@OriginalMember(owner = "client!nb", name = "vf", descriptor = "I")
	public int anInt6655;

	@OriginalMember(owner = "client!nb", name = "Kc", descriptor = "Z")
	public boolean aBoolean508;

	@OriginalMember(owner = "client!nb", name = "dg", descriptor = "[Lclient!br;")
	protected Class37[] aClass37Array5;

	@OriginalMember(owner = "client!nb", name = "Be", descriptor = "I")
	private int anInt6662;

	@OriginalMember(owner = "client!nb", name = "xf", descriptor = "Z")
	protected boolean aBoolean510;

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
	protected int anInt6666;

	@OriginalMember(owner = "client!nb", name = "ed", descriptor = "F")
	private float aFloat114;

	@OriginalMember(owner = "client!nb", name = "Sc", descriptor = "[Lclient!ela;")
	protected Class96[] aClass96Array3;

	@OriginalMember(owner = "client!nb", name = "Eb", descriptor = "F")
	public float aFloat115;

	@OriginalMember(owner = "client!nb", name = "vc", descriptor = "I")
	private int anInt6672;

	@OriginalMember(owner = "client!nb", name = "Le", descriptor = "F")
	public float aFloat116;

	@OriginalMember(owner = "client!nb", name = "Lb", descriptor = "F")
	public float aFloat118;

	@OriginalMember(owner = "client!nb", name = "Se", descriptor = "[Lclient!vj;")
	protected Class3_Sub16[] aClass3_Sub16Array5;

	@OriginalMember(owner = "client!nb", name = "pf", descriptor = "[Lclient!br;")
	protected Class37[] aClass37Array6;

	@OriginalMember(owner = "client!nb", name = "pc", descriptor = "Z")
	public boolean aBoolean517;

	@OriginalMember(owner = "client!nb", name = "He", descriptor = "I")
	public int anInt6679;

	@OriginalMember(owner = "client!nb", name = "Ye", descriptor = "Lclient!ip;")
	public Interface12 anInterface12_3;

	@OriginalMember(owner = "client!nb", name = "ib", descriptor = "I")
	public int anInt6683;

	@OriginalMember(owner = "client!nb", name = "lf", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
	protected int anInt6684;

	@OriginalMember(owner = "client!nb", name = "ff", descriptor = "I")
	protected int anInt6686;

	@OriginalMember(owner = "client!nb", name = "Y", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!nb", name = "ug", descriptor = "[Lclient!kfa;")
	protected Class181_Sub1[] aClass181_Sub1Array3;

	@OriginalMember(owner = "client!nb", name = "Ed", descriptor = "[Lclient!ip;")
	private Interface12[] anInterface12Array3;

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
	protected int anInt6689;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "Lclient!jt;")
	private Class77_Sub2 aClass77_Sub2_3;

	@OriginalMember(owner = "client!nb", name = "pe", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!nb", name = "ue", descriptor = "Lclient!kn;")
	public Class212 aClass212_15;

	@OriginalMember(owner = "client!nb", name = "Nd", descriptor = "Lclient!kn;")
	private Class212 aClass212_16;

	@OriginalMember(owner = "client!nb", name = "sc", descriptor = "Lclient!lq;")
	private Interface16 anInterface16_8;

	@OriginalMember(owner = "client!nb", name = "Mf", descriptor = "Lclient!kn;")
	private Class212 aClass212_17;

	@OriginalMember(owner = "client!nb", name = "ob", descriptor = "Lclient!kn;")
	public Class212 aClass212_18;

	@OriginalMember(owner = "client!nb", name = "Ic", descriptor = "Lclient!kn;")
	public Class212 aClass212_19;

	@OriginalMember(owner = "client!nb", name = "Pf", descriptor = "Lclient!lq;")
	private Interface16 anInterface16_9;

	@OriginalMember(owner = "client!nb", name = "dc", descriptor = "Lclient!kn;")
	public Class212 aClass212_20;

	@OriginalMember(owner = "client!nb", name = "Dd", descriptor = "Lclient!kn;")
	private Class212 aClass212_21;

	@OriginalMember(owner = "client!nb", name = "yb", descriptor = "Lclient!fh;")
	private Interface5 anInterface5_5;

	@OriginalMember(owner = "client!nb", name = "Rd", descriptor = "Lclient!lq;")
	private Interface16 anInterface16_10;

	@OriginalMember(owner = "client!nb", name = "nf", descriptor = "Z")
	protected boolean aBoolean523;

	@OriginalMember(owner = "client!nb", name = "Re", descriptor = "I")
	private int anInt6690;

	@OriginalMember(owner = "client!nb", name = "Cf", descriptor = "Lclient!tj;")
	private final Class357 aClass357_34 = new Class357();

	@OriginalMember(owner = "client!nb", name = "Bd", descriptor = "Z")
	protected boolean aBoolean502 = true;

	@OriginalMember(owner = "client!nb", name = "yd", descriptor = "Lclient!kfa;")
	protected final Class181_Sub1 aClass181_Sub1_15 = new Class181_Sub1();

	@OriginalMember(owner = "client!nb", name = "fb", descriptor = "Lclient!kfa;")
	public Class181_Sub1 aClass181_Sub1_16 = new Class181_Sub1();

	@OriginalMember(owner = "client!nb", name = "zc", descriptor = "Lclient!kfa;")
	public final Class181_Sub1 aClass181_Sub1_17 = new Class181_Sub1();

	@OriginalMember(owner = "client!nb", name = "Qb", descriptor = "Lclient!kfa;")
	protected final Class181_Sub1 aClass181_Sub1_18 = new Class181_Sub1();

	@OriginalMember(owner = "client!nb", name = "hc", descriptor = "Lclient!kfa;")
	private final Class181_Sub1 aClass181_Sub1_19 = new Class181_Sub1();

	@OriginalMember(owner = "client!nb", name = "nb", descriptor = "Lclient!kfa;")
	private final Class181_Sub1 aClass181_Sub1_20 = new Class181_Sub1();

	@OriginalMember(owner = "client!nb", name = "Hf", descriptor = "[F")
	private final float[] aFloatArray59 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!nb", name = "Xc", descriptor = "I")
	private int anInt6653 = 1;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Z")
	protected boolean aBoolean506 = false;

	@OriginalMember(owner = "client!nb", name = "gb", descriptor = "I")
	private int anInt6664 = 16777215;

	@OriginalMember(owner = "client!nb", name = "Tb", descriptor = "I")
	private int anInt6657 = 0;

	@OriginalMember(owner = "client!nb", name = "Qd", descriptor = "I")
	protected int anInt6651 = 0;

	@OriginalMember(owner = "client!nb", name = "xe", descriptor = "I")
	private int anInt6663 = -1;

	@OriginalMember(owner = "client!nb", name = "rc", descriptor = "I")
	public int anInt6661 = 128;

	@OriginalMember(owner = "client!nb", name = "ce", descriptor = "[Lclient!hg;")
	private final Class121[] aClass121Array3 = new Class121[10];

	@OriginalMember(owner = "client!nb", name = "Db", descriptor = "I")
	private int anInt6652 = 0;

	@OriginalMember(owner = "client!nb", name = "Pd", descriptor = "Z")
	protected boolean aBoolean509 = false;

	@OriginalMember(owner = "client!nb", name = "af", descriptor = "F")
	private float aFloat113 = 1.0F;

	@OriginalMember(owner = "client!nb", name = "td", descriptor = "[F")
	private final float[] aFloatArray58 = new float[16];

	@OriginalMember(owner = "client!nb", name = "jf", descriptor = "I")
	public int anInt6650 = 8;

	@OriginalMember(owner = "client!nb", name = "Xd", descriptor = "I")
	public int anInt6667 = 512;

	@OriginalMember(owner = "client!nb", name = "Me", descriptor = "I")
	public int anInt6668 = 0;

	@OriginalMember(owner = "client!nb", name = "be", descriptor = "Z")
	protected boolean aBoolean513 = true;

	@OriginalMember(owner = "client!nb", name = "we", descriptor = "Z")
	private boolean aBoolean512 = false;

	@OriginalMember(owner = "client!nb", name = "pb", descriptor = "[F")
	public final float[] aFloatArray61 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!nb", name = "cg", descriptor = "I")
	public int anInt6658 = 3;

	@OriginalMember(owner = "client!nb", name = "eg", descriptor = "Z")
	protected boolean aBoolean503 = true;

	@OriginalMember(owner = "client!nb", name = "sb", descriptor = "I")
	private int anInt6674 = -1;

	@OriginalMember(owner = "client!nb", name = "qb", descriptor = "I")
	public int anInt6678 = 512;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
	public int anInt6669 = -1;

	@OriginalMember(owner = "client!nb", name = "mg", descriptor = "F")
	public float aFloat112 = 3584.0F;

	@OriginalMember(owner = "client!nb", name = "nc", descriptor = "Lclient!rj;")
	protected Class320 aClass320_5 = Static580.aClass320_7;

	@OriginalMember(owner = "client!nb", name = "Ne", descriptor = "I")
	protected int anInt6682 = 0;

	@OriginalMember(owner = "client!nb", name = "Ab", descriptor = "Z")
	private boolean aBoolean516 = false;

	@OriginalMember(owner = "client!nb", name = "Te", descriptor = "[F")
	public final float[] aFloatArray57 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!nb", name = "Fe", descriptor = "Lclient!ui;")
	protected Class369 aClass369_4 = Static430.aClass369_5;

	@OriginalMember(owner = "client!nb", name = "rb", descriptor = "Z")
	protected boolean aBoolean514 = true;

	@OriginalMember(owner = "client!nb", name = "Nf", descriptor = "I")
	protected final int anInt6660 = 0;

	@OriginalMember(owner = "client!nb", name = "Yf", descriptor = "F")
	public float aFloat110 = -1.0F;

	@OriginalMember(owner = "client!nb", name = "zf", descriptor = "F")
	public float aFloat117 = 1.0F;

	@OriginalMember(owner = "client!nb", name = "Ke", descriptor = "Z")
	protected boolean aBoolean507 = true;

	@OriginalMember(owner = "client!nb", name = "gc", descriptor = "I")
	public int anInt6671 = 0;

	@OriginalMember(owner = "client!nb", name = "tc", descriptor = "F")
	public float aFloat120 = 3584.0F;

	@OriginalMember(owner = "client!nb", name = "rd", descriptor = "F")
	public float aFloat122 = -1.0F;

	@OriginalMember(owner = "client!nb", name = "ae", descriptor = "I")
	private int anInt6665 = -1;

	@OriginalMember(owner = "client!nb", name = "Ze", descriptor = "I")
	protected int anInt6685 = 0;

	@OriginalMember(owner = "client!nb", name = "Ee", descriptor = "I")
	protected final int anInt6675 = 0;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "Z")
	protected boolean aBoolean515 = false;

	@OriginalMember(owner = "client!nb", name = "pd", descriptor = "[F")
	private final float[] aFloatArray64 = new float[16];

	@OriginalMember(owner = "client!nb", name = "Zd", descriptor = "Z")
	private boolean aBoolean518 = false;

	@OriginalMember(owner = "client!nb", name = "R", descriptor = "Z")
	protected boolean aBoolean511 = false;

	@OriginalMember(owner = "client!nb", name = "je", descriptor = "F")
	public float aFloat119 = 1.0F;

	@OriginalMember(owner = "client!nb", name = "dd", descriptor = "I")
	public int anInt6676 = -1;

	@OriginalMember(owner = "client!nb", name = "ze", descriptor = "I")
	protected int anInt6659 = 0;

	@OriginalMember(owner = "client!nb", name = "Ud", descriptor = "Z")
	private boolean aBoolean519 = false;

	@OriginalMember(owner = "client!nb", name = "De", descriptor = "I")
	private int anInt6673 = 0;

	@OriginalMember(owner = "client!nb", name = "jc", descriptor = "[F")
	private final float[] aFloatArray63 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!nb", name = "uc", descriptor = "F")
	public float aFloat125 = 1.0F;

	@OriginalMember(owner = "client!nb", name = "id", descriptor = "I")
	public int anInt6680 = 50;

	@OriginalMember(owner = "client!nb", name = "Cc", descriptor = "[F")
	private final float[] aFloatArray65 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
	protected int anInt6656 = 3584;

	@OriginalMember(owner = "client!nb", name = "Hc", descriptor = "F")
	public float aFloat121 = 1.0F;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
	protected int anInt6687 = 0;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
	private int anInt6677 = 0;

	@OriginalMember(owner = "client!nb", name = "qg", descriptor = "[F")
	private final float[] aFloatArray62 = new float[16];

	@OriginalMember(owner = "client!nb", name = "Dc", descriptor = "Z")
	private boolean aBoolean521 = false;

	@OriginalMember(owner = "client!nb", name = "Z", descriptor = "[F")
	protected float[] aFloatArray60 = this.aFloatArray65;

	@OriginalMember(owner = "client!nb", name = "Yb", descriptor = "I")
	public int anInt6681 = 0;

	@OriginalMember(owner = "client!nb", name = "U", descriptor = "Z")
	protected boolean aBoolean520 = true;

	@OriginalMember(owner = "client!nb", name = "Bb", descriptor = "Z")
	private boolean aBoolean522 = false;

	@OriginalMember(owner = "client!nb", name = "Yd", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream6 = new Stream();

	@OriginalMember(owner = "client!nb", name = "Wc", descriptor = "[Lclient!iha;")
	public final Class157_Sub2[] aClass157_Sub2Array5 = new Class157_Sub2[7];

	@OriginalMember(owner = "client!nb", name = "Ff", descriptor = "[Lclient!iha;")
	public final Class157_Sub2[] aClass157_Sub2Array6 = new Class157_Sub2[7];

	@OriginalMember(owner = "client!nb", name = "Zc", descriptor = "Lclient!kfa;")
	private final Class181_Sub1 aClass181_Sub1_21 = new Class181_Sub1();

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Ljava/lang/Object;")
	protected final Object anObject18;

	@OriginalMember(owner = "client!nb", name = "Wf", descriptor = "Ljava/lang/Object;")
	private Object anObject17;

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "Lclient!lb;")
	protected final Class221 aClass221_109;

	@OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
	protected final int anInt6688;

	@OriginalMember(owner = "client!nb", name = "Td", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas11;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!nb", name = "Qf", descriptor = "I")
	public final int anInt6670;

	@OriginalMember(owner = "client!nb", name = "Fb", descriptor = "I")
	private int anInt6531;

	@OriginalMember(owner = "client!nb", name = "jd", descriptor = "I")
	public int anInt6626;

	@OriginalMember(owner = "client!nb", name = "yc", descriptor = "I")
	private int anInt6533;

	@OriginalMember(owner = "client!nb", name = "Ue", descriptor = "I")
	public int anInt6608;

	@OriginalMember(owner = "client!nb", name = "eb", descriptor = "Lclient!ie;")
	private final Class167 aClass167_3;

	@OriginalMember(owner = "client!nb", name = "oc", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	static {
		@Pc(1069) int local1069 = 2;
		for (@Pc(1071) int local1071 = 0; local1071 < 32; local1071++) {
			anIntArray361[local1071] = local1069 - 1;
			local1069 += local1069;
		}
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!lb;II)V")
	protected Class67_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) Class221 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anObject17 = this.anObject18 = arg1;
			this.aClass221_109 = arg3;
			this.anInt6688 = arg4;
			this.aCanvas10 = this.aCanvas11 = arg0;
			@Pc(315) Dimension local315 = arg0.getSize();
			this.anInt6670 = arg5;
			this.anInt6626 = this.anInt6531 = local315.height;
			this.anInt6608 = this.anInt6533 = local315.width;
			Static533.method7508(false, true);
			if (super.anInterface2_11 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt6670);
				this.aClass167_3 = null;
			} else {
				this.aClass167_3 = new Class167(this, super.anInterface2_11);
				this.aNativeInterface3 = new NativeInterface(super.anInterface2_11.method1028(), this.anInt6670);
				for (@Pc(360) int local360 = 0; local360 < super.anInterface2_11.method1028(); local360++) {
					@Pc(368) Class32 local368 = super.anInterface2_11.method1027(local360);
					if (local368 != null) {
						this.aNativeInterface3.initTextureMetrics(local360, local368.aByte20, local368.aByte24);
					}
				}
			}
		} catch (@Pc(406) Throwable local406) {
			local406.printStackTrace();
			this.method7681();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7636(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas11) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method5557(arg0, this.aHashtable5.get(arg0));
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method5557(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)Lclient!za;")
	@Override
	public final Class3_Sub17 method7665(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub17_Sub2 local8 = new Class3_Sub17_Sub2(arg0);
		this.aClass357_34.method8401(local8);
		return local8;
	}

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "(I)V")
	public final void method5558() {
		if (this.aClass320_5 == Static580.aClass320_7) {
			return;
		}
		@Pc(11) Class320 local11 = this.aClass320_5;
		this.aClass320_5 = Static580.aClass320_7;
		if (local11.method7780()) {
			this.method5671();
		}
		this.aFloatArray60 = this.aFloatArray65;
		this.anInt6662 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	protected abstract void method5559(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)V")
	public final void method5560(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean506 != arg0) {
			this.aBoolean506 = arg0;
			this.method5574();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local10 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local10 * local10 + local16 * local16));
			local18 = (float) Math.atan2((double) local16, (double) local10);
		}
		this.method5625();
		this.method5588(arg4);
		this.method5590(0, Static472.aClass58_3);
		this.method5674(0, Static472.aClass58_3);
		this.method5617(0);
		this.aClass181_Sub1_15.method4918((float) arg5, 1.0F, local20);
		this.aClass181_Sub1_15.method6354(0, -arg5 / 2, 0);
		this.aClass181_Sub1_15.method6357((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass181_Sub1_15.method6354(arg0, arg1, 0);
		this.method5639();
		this.method5667(false);
		this.method5635();
		this.method5667(true);
		this.method5674(0, Static143.aClass58_1);
		this.method5590(0, Static143.aClass58_1);
	}

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass181_Sub1_16.method4937((float) arg0, (float) arg2, (float) arg1);
		@Pc(30) int local30;
		@Pc(27) int local27;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local30 = (int) ((float) this.anInt6667 * this.aClass181_Sub1_16.method4931((float) arg2, (float) arg1, (float) arg0) / local14);
			local27 = (int) ((float) this.anInt6678 * this.aClass181_Sub1_16.method4922((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local27 = this.anInt6671;
			local30 = this.anInt6668;
		}
		arg3[1] = (int) ((float) local27 - this.aFloat123);
		arg3[0] = (int) ((float) local30 - this.aFloat116);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "(I)V")
	protected abstract void method5561();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!hd;III[B)Lclient!bf;")
	public abstract Interface1 method5562(@OriginalArg(1) Class145 arg0, @OriginalArg(5) byte[] arg1);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ns;Lclient!hd;I)Z")
	public abstract boolean method5563(@OriginalArg(0) Class261 arg0, @OriginalArg(1) Class145 arg1);

	@OriginalMember(owner = "client!nb", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7650(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6685;
		arg0[3] = this.anInt6651;
		arg0[0] = this.anInt6687;
		arg0[2] = this.anInt6682;
	}

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "(Z)V")
	private void method5565() {
		if (this.aBoolean512) {
			return;
		}
		@Pc(14) float[] local14 = this.aFloatArray58;
		@Pc(18) float local18 = (float) this.anInt6680;
		@Pc(22) float local22 = (float) this.anInt6656;
		@Pc(34) float local34 = this.aFloat113 * (float) -this.anInt6671 / (float) this.anInt6678;
		@Pc(46) float local46 = (float) -this.anInt6668 * this.aFloat113 / (float) this.anInt6667;
		@Pc(61) float local61 = (float) (this.anInt6608 - this.anInt6668) * this.aFloat113 / (float) this.anInt6667;
		@Pc(76) float local76 = (float) (this.anInt6626 - this.anInt6671) * this.aFloat113 / (float) this.anInt6678;
		if (local61 == local46 || local76 == local34) {
			local14[8] = 0.0F;
			local14[11] = 0.0F;
			local14[13] = 0.0F;
			local14[15] = 1.0F;
			local14[7] = 0.0F;
			local14[2] = 0.0F;
			local14[3] = 0.0F;
			local14[9] = 0.0F;
			local14[0] = 1.0F;
			local14[14] = 0.0F;
			local14[5] = 1.0F;
			local14[10] = 1.0F;
			local14[4] = 0.0F;
			local14[1] = 0.0F;
			local14[12] = 0.0F;
			local14[6] = 0.0F;
		} else {
			local14[9] = 0.0F;
			local14[13] = (local76 + local34) / (local76 - local34);
			local14[0] = 2.0F / (local61 - local46);
			local14[11] = 0.0F;
			local14[3] = 0.0F;
			local14[12] = (local46 + local61) / (-local61 + local46);
			local14[5] = 2.0F / (local76 - local34);
			local14[7] = 0.0F;
			local14[10] = 1.0F / (local18 - local22);
			local14[2] = 0.0F;
			local14[6] = 0.0F;
			local14[4] = 0.0F;
			local14[15] = 1.0F;
			local14[14] = local18 / (local18 - local22);
			local14[1] = 0.0F;
			local14[8] = 0.0F;
		}
		this.method5656();
		this.aBoolean512 = true;
	}

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "(I)Lclient!kfa;")
	public final Class181_Sub1 method5566() {
		return this.aClass181_Sub1Array3[this.anInt6659];
	}

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "()V")
	@Override
	public final void method7716() {
		if (this.aClass167_3 != null) {
			this.aClass167_3.method4097();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZI[IB)Lclient!gp;")
	public final Interface6 method5567(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		return this.method5644(arg2, arg3, arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V")
	@Override
	public final void method7691(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass167_3 != null) {
			this.aClass167_3.method4097();
		}
		this.anInt6661 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt6635 + this.anInt6649 + this.anInt6648;
	}

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "(I)V")
	protected abstract void method5568();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!kn;)V")
	public abstract void method5569(@OriginalArg(1) Class212 arg0);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([Lclient!he;Z)Lclient!kn;")
	public abstract Class212 method5570(@OriginalArg(0) Class147[] arg0);

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "(II)Lclient!fh;")
	public final Interface5 method5571(@OriginalArg(1) int arg0) {
		if (this.anInterface5_5.method9247() < arg0 * 2) {
			this.anInterface5_5.method9248(arg0);
		}
		return this.anInterface5_5;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)V")
	public final void method5572(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean510) {
			this.aBoolean510 = arg0;
			this.method5691();
			this.anInt6662 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "T", descriptor = "(I)V")
	private void method5573() {
		this.method5613();
		if (this.aClass121_3 != null) {
			this.aClass121_3.method9237();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class313 method7679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class313_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "(Z)V")
	protected abstract void method5574();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZZZI)V")
	public final void method5575(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt6674 != arg2 || this.aBoolean517 != this.aBoolean516) {
			@Pc(27) Interface6 local27 = null;
			@Pc(29) int local29 = 0;
			@Pc(31) byte local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(41) int local41 = this.aBoolean517 ? 3 : 0;
			if (arg2 < 0) {
				this.method5614();
			} else {
				local27 = this.aClass167_3.method4098(arg2);
				@Pc(58) Class32 local58 = super.anInterface2_11.method1027(arg2);
				if (local58.aByte22 == 0 && local58.aByte23 == 0) {
					this.method5614();
				} else {
					@Pc(79) int local79 = local58.aBoolean71 ? 64 : 128;
					@Pc(83) int local83 = local79 * 50;
					@Pc(87) Class181_Sub1 local87 = this.method5601();
					local87.method4916((float) (this.anInt6654 % local83 * local58.aByte23) / (float) local83, (float) (this.anInt6654 % local83 * local58.aByte22) / (float) local83, 0.0F);
					this.method5666(Static32.aClass96_1);
				}
				local29 = local58.anInt865;
				if (!this.aBoolean517) {
					local31 = local58.aByte19;
					local41 = local58.aByte25;
					local33 = local58.anInt862;
				}
			}
			this.method5605(local33, local41, arg1, arg0, local31);
			if (this.aClass121_3 == null) {
				this.method5612(local27);
				this.method5655(local29);
			} else {
				this.aClass121_3.method9244(local27, local29);
			}
			this.anInt6674 = arg2;
			this.aBoolean516 = this.aBoolean517;
		}
		this.anInt6662 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
	@Override
	public final void method7657(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nb", name = "ab", descriptor = "(I)V")
	protected void method5576(@OriginalArg(0) int arg0) {
		this.method5680();
	}

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7658() {
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "(I)V")
	public final void method5577() {
		if (this.anInt6662 == 8) {
			return;
		}
		this.method5630();
		this.method5572(true);
		this.method5591(true);
		this.method5652(true);
		this.method5617(1);
		this.anInt6662 = 8;
	}

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "(B)Lclient!kfa;")
	public final Class181_Sub1 method5578() {
		if (!this.aBoolean521) {
			this.aClass181_Sub1_20.method4923(this.aClass181_Sub1_18, this.aClass181_Sub1_15);
			this.aBoolean521 = true;
		}
		return this.aClass181_Sub1_20;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	protected abstract void method5579(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "(I)V")
	private void method5580() {
		if (this.aClass121_3 != null) {
			this.aClass121_3.method9240();
		}
		this.method5602();
	}

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "(I)V")
	protected void method5581() {
		this.anInt6684 = this.anInt6666;
		this.anInt6666 = 0;
	}

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass181_Sub1_16.aFloat101 * (float) arg1 + this.aClass181_Sub1_16.aFloat105 * (float) arg0 + this.aClass181_Sub1_16.aFloat107 * (float) arg2 + this.aClass181_Sub1_16.aFloat106;
		@Pc(57) float local57 = this.aClass181_Sub1_16.aFloat106 + (float) arg5 * this.aClass181_Sub1_16.aFloat107 + (float) arg4 * this.aClass181_Sub1_16.aFloat101 + (float) arg3 * this.aClass181_Sub1_16.aFloat105;
		if (local32 < (float) this.anInt6680 && local57 < (float) this.anInt6680) {
			local7 |= 0x10;
		} else if ((float) this.anInt6656 < local32 && local57 > (float) this.anInt6656) {
			local7 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((float) this.anInt6667 * (this.aClass181_Sub1_16.aFloat97 + this.aClass181_Sub1_16.aFloat108 * (float) arg2 + (float) arg0 * this.aClass181_Sub1_16.aFloat100 + this.aClass181_Sub1_16.aFloat99 * (float) arg1) / (float) arg6);
		@Pc(163) int local163 = (int) ((this.aClass181_Sub1_16.aFloat108 * (float) arg5 + this.aClass181_Sub1_16.aFloat99 * (float) arg4 + (float) arg3 * this.aClass181_Sub1_16.aFloat100 + this.aClass181_Sub1_16.aFloat97) * (float) this.anInt6667 / (float) arg6);
		if ((float) local130 < this.aFloat116 && (float) local163 < this.aFloat116) {
			local7 |= 0x1;
		} else if (this.aFloat115 < (float) local130 && this.aFloat115 < (float) local163) {
			local7 |= 0x2;
		}
		@Pc(236) int local236 = (int) ((float) this.anInt6678 * (this.aClass181_Sub1_16.aFloat103 + (float) arg0 * this.aClass181_Sub1_16.aFloat104 + (float) arg1 * this.aClass181_Sub1_16.aFloat98 + (float) arg2 * this.aClass181_Sub1_16.aFloat102) / (float) arg6);
		@Pc(269) int local269 = (int) ((this.aClass181_Sub1_16.aFloat103 + (float) arg5 * this.aClass181_Sub1_16.aFloat102 + (float) arg3 * this.aClass181_Sub1_16.aFloat104 + this.aClass181_Sub1_16.aFloat98 * (float) arg4) * (float) this.anInt6678 / (float) arg6);
		if (this.aFloat123 > (float) local236 && (float) local269 < this.aFloat123) {
			local7 |= 0x4;
		} else if ((float) local236 > this.aFloat118 && (float) local269 > this.aFloat118) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt6690;
	}

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "()Z")
	@Override
	public final boolean method7684() {
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLclient!ct;II)V")
	protected abstract void method5582(@OriginalArg(1) Class58 arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "(I)V")
	protected abstract void method5583();

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "(I)V")
	protected abstract void method5584();

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "()Lclient!iu;")
	@Override
	public final Class181 method7683() {
		return this.aClass181_Sub1_16;
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method5645();
		this.method5625();
		this.method5588(arg4);
		this.method5590(0, Static472.aClass58_3);
		this.method5674(0, Static472.aClass58_3);
		this.method5617(arg5);
		this.aClass181_Sub1_15.method4918((float) (arg3 - 1), 1.0F, (float) (arg2 - 1));
		this.aClass181_Sub1_15.method4915((float) arg1 - local7, 0.0F, (float) arg0 - local7);
		this.method5639();
		this.method5667(false);
		this.method5672(4, Static541.aClass281_6);
		this.method5667(true);
		this.method5674(0, Static143.aClass58_1);
		this.method5590(0, Static143.aClass58_1);
	}

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "(B)V")
	protected abstract void method5585();

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(Z)Lclient!kfa;")
	public final Class181_Sub1 method5586() {
		return this.aClass181_Sub1_15;
	}

	@OriginalMember(owner = "client!nb", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt6685 = 0;
		this.anInt6687 = 0;
		this.anInt6682 = this.anInt6608;
		this.anInt6651 = this.anInt6626;
		if (this.aBoolean523) {
			this.aBoolean523 = false;
			this.method5583();
		}
		this.method5648();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!saa;[Lclient!jr;Z)Lclient!da;")
	@Override
	public final Class44 method7641(@OriginalArg(0) Class330 arg0, @OriginalArg(1) Class194[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class44_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nb", name = "Z", descriptor = "(I)V")
	private void method5587() {
		if (this.aClass320_5 == Static403.aClass320_6) {
			@Pc(11) float local11 = this.method5645();
			this.aClass181_Sub1_15.method4915(local11, 0.0F, local11);
		}
		this.aBoolean521 = false;
		this.method5610();
		if (this.aClass121_3 != null) {
			this.aClass121_3.method9235();
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(IB)V")
	public final void method5588(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt6686) {
			this.anInt6686 = arg0;
			this.method5677();
		}
	}

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "(B)Lclient!gr;")
	public final Interface7 method5589() {
		return this.aClass77_Sub2_3 == null ? null : this.aClass77_Sub2_3.method5355();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!ct;Z)V")
	public final void method5590(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1) {
		this.method5641(false, false, arg1, arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[Lclient!vj;)V")
	@Override
	public final void method7694(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub16[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub16Array5[local7] = arg1[local7];
		}
		this.anInt6666 = arg0;
		if (this.aClass320_5.method7780()) {
			this.method5581();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BZ)V")
	public final void method5591(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean515) {
			this.aBoolean515 = arg0;
			this.method5668();
			this.anInt6662 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(BZ)V")
	public final void method5592(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean509 != arg0) {
			this.aBoolean509 = arg0;
			this.method5574();
			this.anInt6662 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "()Z")
	@Override
	public final boolean method7712() {
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method5593(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZ)Lclient!bka;")
	@Override
	public final Class9 method7670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class9_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method5594(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap5.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!nb", name = "bb", descriptor = "(I)V")
	private void method5595() {
		this.anInterface16_9 = this.method5649(true);
		this.anInterface16_9.method7121(12, 24);
		this.aClass212_21 = this.method5570(new Class147[] { new Class147(Static219.aClass134_1) });
	}

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "(I)I")
	public final int method5596() {
		return this.anInt6663;
	}

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "(I)V")
	private void method5597() {
		if (Static146.aClass320_3 == this.aClass320_5) {
			return;
		}
		@Pc(6) Class320 local6 = this.aClass320_5;
		this.aClass320_5 = Static146.aClass320_3;
		if (!local6.method7780()) {
			this.method5671();
		}
		this.method5565();
		this.aFloatArray60 = this.aFloatArray58;
		this.method5631();
		this.anInt6662 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "(I)V")
	protected final void method5598() {
		@Pc(9) Enumeration local9 = this.aHashtable5.keys();
		while (local9.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local9.nextElement();
			this.method5557(local17, this.aHashtable5.get(local17));
		}
		this.anInterface16_8.method9249();
		this.anInterface16_9.method9249();
		this.anInterface16_10.method9249();
		for (@Pc(48) int local48 = 0; local48 < 7; local48++) {
			this.aClass157_Sub2Array6[local48].method4179();
		}
		this.aClass324_3.method7801();
		this.anInterface5_5.method9249();
	}

	@OriginalMember(owner = "client!nb", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean517 = false;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BZI[[I)Lclient!gr;")
	public abstract Interface7 method5599(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2);

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
	private void method5600() {
		this.aBoolean519 = false;
		if (this.aClass320_5 == Static403.aClass320_6) {
			this.method5658();
			this.method5631();
		}
	}

	@OriginalMember(owner = "client!nb", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat121 != arg0) {
			this.aFloat121 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method5685();
			this.method5607();
		}
	}

	@OriginalMember(owner = "client!nb", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5625();
		this.method5588(arg3);
		this.method5590(0, Static472.aClass58_3);
		this.method5674(0, Static472.aClass58_3);
		this.method5617(arg4);
		this.aClass181_Sub1_15.method4918((float) arg2, 1.0F, (float) arg2);
		this.aClass181_Sub1_15.method6354(arg0, arg1, 0);
		this.method5639();
		this.method5667(false);
		this.method5620(this.anInterface16_10, 0);
		this.method5569(this.aClass212_17);
		this.method5640(256, Static63.aClass281_1, 0);
		this.method5667(true);
		this.method5674(0, Static143.aClass58_1);
		this.method5590(0, Static143.aClass58_1);
	}

	@OriginalMember(owner = "client!nb", name = "V", descriptor = "(I)Lclient!kfa;")
	public final Class181_Sub1 method5601() {
		return this.aClass181_Sub1Array3[this.anInt6659];
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!nb", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass181_Sub1_16.method4937((float) arg0, (float) arg2, (float) arg1);
		if ((float) this.anInt6680 > local14 || (float) this.anInt6656 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(61) int local61 = (int) ((float) this.anInt6667 * this.aClass181_Sub1_16.method4931((float) arg2, (float) arg1, (float) arg0) / (float) arg3);
		@Pc(80) int local80 = (int) ((float) this.anInt6678 * this.aClass181_Sub1_16.method4922((float) arg0, (float) arg2, (float) arg1) / (float) arg3);
		arg4[0] = (int) ((float) local61 - this.aFloat116);
		arg4[1] = (int) ((float) local80 - this.aFloat123);
		arg4[2] = (int) local14;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method7706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) float local12 = (float) -arg0 + (float) arg2;
		@Pc(18) float local18 = (float) arg3 - (float) arg1;
		@Pc(45) float local45;
		if (local12 == 0.0F && local18 == 0.0F) {
			local12 = 1.0F;
		} else {
			local45 = (float) (1.0D / Math.sqrt((double) (local18 * local18 + local12 * local12)));
			local18 *= local45;
			local12 *= local45;
		}
		this.method5625();
		this.method5588(arg4);
		this.method5590(0, Static472.aClass58_3);
		this.method5674(0, Static472.aClass58_3);
		this.method5617(1);
		this.method5650();
		@Pc(84) int local84 = arg7 % (arg6 + arg5);
		this.method5667(false);
		local45 = local12 * (float) arg5;
		@Pc(98) float local98 = (float) arg5 * local18;
		@Pc(100) float local100 = 0.0F;
		@Pc(102) float local102 = 0.0F;
		@Pc(104) float local104 = local45;
		@Pc(106) float local106 = local98;
		if (local84 > arg5) {
			local102 = (float) (arg5 + arg6 - local84) * local18;
			local100 = (float) (arg6 + arg5 - local84) * local12;
		} else {
			local104 = local12 * (float) (arg5 - local84);
			local106 = local18 * (float) (arg5 - local84);
		}
		@Pc(152) float local152 = local100 + (float) arg0;
		@Pc(157) float local157 = (float) arg1 + local102;
		@Pc(162) float local162 = local12 * (float) arg6;
		@Pc(167) float local167 = (float) arg6 * local18;
		while (true) {
			if (arg2 > arg0) {
				if (local152 > (float) arg2) {
					break;
				}
				if ((float) arg2 < local152 + local104) {
					local104 = (float) arg2 - local152;
				}
			} else {
				if ((float) arg2 > local152) {
					break;
				}
				if (local152 + local104 < (float) arg2) {
					local104 = (float) arg2 - local152;
				}
			}
			if (arg3 > arg1) {
				if (local157 > (float) arg3) {
					break;
				}
				if (local157 + local106 > (float) arg3) {
					local106 = (float) arg3 - local157;
				}
			} else {
				if ((float) arg3 > local157) {
					break;
				}
				if (local157 + local106 < (float) arg3) {
					local106 = (float) arg3 - local157;
				}
			}
			if (!this.method5646(local157 + local106, 0.0F, local152 + local104, local157, 0.0F, local152)) {
				return;
			}
			local152 += local162 + local104;
			this.method5661();
			local157 += local167 + local106;
			local106 = local98;
			local104 = local45;
		}
		this.method5667(true);
		this.method5674(0, Static143.aClass58_1);
		this.method5590(0, Static143.aClass58_1);
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(Z)V")
	protected abstract void method5602();

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)V")
	private void method5603() {
		this.aFloatArray62[14] = this.aFloat114;
		this.aFloatArray62[10] = this.aFloat111;
		this.aFloat120 = ((float) -this.anInt6656 + this.aFloatArray62[14]) / this.aFloatArray62[10];
	}

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6669 == arg0 && this.anInt6676 == arg1 && this.anInt6681 == arg2) {
			return;
		}
		this.anInt6681 = arg2;
		this.anInt6676 = arg1;
		this.anInt6669 = arg0;
		this.method5580();
		this.method5691();
	}

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "(I)[F")
	public final float[] method5604() {
		return this.aFloatArray65;
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method7650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		if (local9 == 0.0F && local16 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(39) float local39 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local16 * local16)));
			local16 *= local39;
			local9 *= local39;
		}
		if (!this.method5646(local16 + (float) arg3, 0.0F, local9 + (float) arg2, (float) arg1, 0.0F, (float) arg0)) {
			return;
		}
		this.method5625();
		this.method5588(arg4);
		this.method5590(0, Static472.aClass58_3);
		this.method5674(0, Static472.aClass58_3);
		this.method5617(arg5);
		this.method5650();
		this.method5667(false);
		this.method5661();
		this.method5667(true);
		this.method5674(0, Static143.aClass58_1);
		this.method5590(0, Static143.aClass58_1);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZZII)V")
	private void method5605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(13) boolean local13 = arg2 & this.method7651();
		if (!local13 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg0 = 1;
			arg4 = 0;
		}
		if (arg1 != 0 && arg3) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt6652 != arg1) {
			if (this.anInt6652 != 0) {
				this.aClass121Array3[Integer.MAX_VALUE & this.anInt6652].method9232();
			}
			if (arg1 == 0) {
				this.aClass121_3 = null;
			} else {
				this.aClass121_3 = this.aClass121Array3[arg1 & Integer.MAX_VALUE];
				this.aClass121_3.method9231(arg3);
				this.aClass121_3.method9239(arg3);
				this.aClass121_3.method9236(arg0, arg4);
			}
			this.anInt6673 = arg4;
			this.anInt6652 = arg1;
			this.anInt6677 = arg0;
		} else if (this.anInt6652 != 0) {
			this.aClass121Array3[Integer.MAX_VALUE & this.anInt6652].method9239(arg3);
			if (arg4 != this.anInt6673 || arg0 != this.anInt6677) {
				this.aClass121Array3[this.anInt6652 & Integer.MAX_VALUE].method9236(arg0, arg4);
				this.anInt6673 = arg4;
				this.anInt6677 = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nb", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass181_Sub1_16.aFloat106 + (float) arg2 * this.aClass181_Sub1_16.aFloat107 + (float) arg1 * this.aClass181_Sub1_16.aFloat101 + (float) arg0 * this.aClass181_Sub1_16.aFloat105;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass181_Sub1_16.aFloat106 + (float) arg3 * this.aClass181_Sub1_16.aFloat105 + (float) arg4 * this.aClass181_Sub1_16.aFloat101 + this.aClass181_Sub1_16.aFloat107 * (float) arg5;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt6680 > local32 && local63 < (float) this.anInt6680) {
			local7 |= 0x10;
		} else if ((float) this.anInt6656 < local32 && local63 > (float) this.anInt6656) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) ((this.aClass181_Sub1_16.aFloat97 + (float) arg2 * this.aClass181_Sub1_16.aFloat108 + this.aClass181_Sub1_16.aFloat100 * (float) arg0 + this.aClass181_Sub1_16.aFloat99 * (float) arg1) * (float) this.anInt6667 / local32);
		@Pc(173) int local173 = (int) ((float) this.anInt6667 * (this.aClass181_Sub1_16.aFloat108 * (float) arg5 + (float) arg3 * this.aClass181_Sub1_16.aFloat100 + this.aClass181_Sub1_16.aFloat99 * (float) arg4 + this.aClass181_Sub1_16.aFloat97) / local63);
		if ((float) local141 < this.aFloat116 && this.aFloat116 > (float) local173) {
			local7 |= 0x1;
		} else if ((float) local141 > this.aFloat115 && this.aFloat115 < (float) local173) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) (((float) arg0 * this.aClass181_Sub1_16.aFloat104 + (float) arg1 * this.aClass181_Sub1_16.aFloat98 + this.aClass181_Sub1_16.aFloat102 * (float) arg2 + this.aClass181_Sub1_16.aFloat103) * (float) this.anInt6678 / local32);
		@Pc(277) int local277 = (int) (((float) arg5 * this.aClass181_Sub1_16.aFloat102 + (float) arg4 * this.aClass181_Sub1_16.aFloat98 + (float) arg3 * this.aClass181_Sub1_16.aFloat104 + this.aClass181_Sub1_16.aFloat103) * (float) this.anInt6678 / local63);
		if ((float) local245 < this.aFloat123 && this.aFloat123 > (float) local277) {
			local7 |= 0x4;
		} else if (this.aFloat118 < (float) local245 && (float) local277 > this.aFloat118) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "()Z")
	@Override
	public final boolean method7710() {
		return false;
	}

	@OriginalMember(owner = "client!nb", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt6608 - 1 <= arg2 && arg1 <= 0 && arg3 >= this.anInt6626 - 1) {
			this.la();
			return;
		}
		this.anInt6685 = arg1 >= 0 ? arg1 : 0;
		this.anInt6651 = arg3 > this.anInt6608 ? 0 : arg3;
		this.anInt6682 = arg2 > this.anInt6608 ? 0 : arg2;
		this.anInt6687 = arg0 < 0 ? 0 : arg0;
		if (!this.aBoolean523) {
			this.aBoolean523 = true;
			this.method5583();
		}
		this.method5623();
		this.method5648();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!hu;I)V")
	@Override
	public final void method7692(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1) {
		this.aClass324_3.method7809(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "(B)V")
	protected abstract void method5606();

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "(B)V")
	protected abstract void method5607();

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "(B)V")
	protected abstract void method5608();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([IIIIIZ)Lclient!bka;")
	@Override
	public final Class9 method7686(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class9_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(IIIIII)Lclient!dn;")
	@Override
	public final Class77 method7685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class77_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)V")
	@Override
	public final void method7672(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "(B)V")
	private void method5609() {
		this.aBoolean522 = false;
		this.method5665();
		if (this.aClass320_5 == Static155.aClass320_4) {
			this.method5631();
		}
	}

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "(B)V")
	protected abstract void method5610();

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "(I)V")
	public abstract void method5611();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!ip;)V")
	public final void method5612(@OriginalArg(1) Interface12 arg0) {
		if (arg0 == this.anInterface12Array3[this.anInt6659]) {
			return;
		}
		this.anInterface12Array3[this.anInt6659] = arg0;
		if (arg0 == null) {
			this.method5608();
		} else {
			arg0.method9257();
		}
		this.anInt6662 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "(B)V")
	protected abstract void method5613();

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(B)V")
	public final void method5614() {
		if (this.aClass96Array3[this.anInt6659] != Static547.aClass96_5) {
			this.aClass96Array3[this.anInt6659] = Static547.aClass96_5;
			this.aClass181_Sub1Array3[this.anInt6659].method6349();
			this.method5573();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method7715(@OriginalArg(0) Class3_Sub17 arg0) {
		this.aNativeHeap5 = ((Class3_Sub17_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer7 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "()Z")
	@Override
	public final boolean method7651() {
		return this.aClass121Array3[3].method9241();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IF)V")
	public final void method5615(@OriginalArg(1) float arg0) {
		if (this.aFloat113 != arg0) {
			this.aFloat113 = arg0;
			this.method5690();
		}
	}

	@OriginalMember(owner = "client!nb", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt6687 < arg0) {
			this.anInt6687 = arg0;
			local5 = true;
		}
		if (this.anInt6682 > arg2) {
			local5 = true;
			this.anInt6682 = arg2;
		}
		if (this.anInt6685 < arg1) {
			local5 = true;
			this.anInt6685 = arg1;
		}
		if (this.anInt6651 > arg3) {
			this.anInt6651 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean523) {
			this.aBoolean523 = true;
			this.method5583();
		}
		this.method5623();
		this.method5648();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method5616(@OriginalArg(1) Buffer arg0) {
		this.aStream6.a(arg0);
		return this.aStream6;
	}

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "()Lclient!iu;")
	@Override
	public final Class181 method7646() {
		return new Class181_Sub1();
	}

	@OriginalMember(owner = "client!nb", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(16) boolean local16 = arg0 != this.anInt6664;
		if (local16 || arg1 != this.aFloat122 || arg2 != this.aFloat110) {
			this.aFloat122 = arg1;
			this.anInt6664 = arg0;
			this.aFloat110 = arg2;
			if (local16) {
				this.aFloat125 = (float) (this.anInt6664 & 0xFF0000) / 1.671168E7F;
				this.aFloat117 = (float) (this.anInt6664 & 0xFF00) / 65280.0F;
				this.aFloat119 = (float) (this.anInt6664 & 0xFF) / 255.0F;
				this.method5685();
			}
			this.aNativeInterface3.setSunColour(this.aFloat125, this.aFloat117, this.aFloat119, arg1, arg2);
			this.method5585();
		}
		if (this.aFloatArray59[0] != arg3 || arg4 != this.aFloatArray59[1] || this.aFloatArray59[2] != arg5) {
			this.aFloatArray59[2] = arg5;
			this.aFloatArray59[1] = arg4;
			this.aFloatArray59[0] = arg3;
			this.aFloatArray63[2] = -arg5;
			this.aFloatArray63[1] = -arg4;
			this.aFloatArray63[0] = -arg3;
			@Pc(166) float local166 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray57[1] = local166 * arg4;
			this.aFloatArray57[2] = local166 * arg5;
			this.aFloatArray57[0] = local166 * arg3;
			this.aFloatArray61[0] = -this.aFloatArray57[0];
			this.aFloatArray61[2] = -this.aFloatArray57[2];
			this.aFloatArray61[1] = -this.aFloatArray57[1];
			this.aNativeInterface3.setSunDirection(this.aFloatArray57[0], this.aFloatArray57[1], this.aFloatArray57[2]);
			this.method5611();
			this.anInt6679 = (int) (arg3 * 256.0F / arg4);
			this.anInt6655 = (int) (arg5 * 256.0F / arg4);
		}
		this.method5607();
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(IZ)V")
	public final void method5617(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt6653) {
			return;
		}
		@Pc(20) Class369 local20;
		@Pc(16) boolean local16;
		@Pc(18) boolean local18;
		if (arg0 == 1) {
			local16 = true;
			local18 = true;
			local20 = Static430.aClass369_5;
		} else if (arg0 == 2) {
			local18 = false;
			local16 = true;
			local20 = Static645.aClass369_9;
		} else if (arg0 == 128) {
			local16 = true;
			local18 = true;
			local20 = Static584.aClass369_7;
		} else {
			local16 = false;
			local18 = false;
			local20 = Static256.aClass369_8;
		}
		if (local18 != this.aBoolean520) {
			this.aBoolean520 = local18;
			this.method5657();
		}
		if (this.aBoolean503 != local16) {
			this.aBoolean503 = local16;
			this.method5624();
		}
		if (this.aClass369_4 != local20) {
			this.aClass369_4 = local20;
			this.method5568();
		}
		this.anInt6662 &= 0xFFFFFFE3;
		this.anInt6653 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "(B)V")
	private void method5618() {
		if (this.aCanvas10 == null) {
			this.anInt6533 = this.anInt6531 = 1;
		} else {
			@Pc(20) Dimension local20 = this.aCanvas10.getSize();
			this.anInt6531 = local20.height;
			this.anInt6533 = local20.width;
		}
		this.anInt6608 = this.anInt6533;
		this.anInt6626 = this.anInt6531;
		this.method5600();
		this.method5609();
		this.method5690();
		this.method5561();
		this.method5648();
		this.method5558();
		this.la();
	}

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "(B)Lclient!kfa;")
	public final Class181_Sub1 method5619() {
		return this.aClass181_Sub1_18;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!lq;I)V")
	public abstract void method5620(@OriginalArg(1) Interface16 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "(I)V")
	private void method5621() {
		if (Static403.aClass320_6 == this.aClass320_5) {
			return;
		}
		@Pc(6) Class320 local6 = this.aClass320_5;
		this.aClass320_5 = Static403.aClass320_6;
		if (local6.method7780()) {
			this.method5671();
		}
		this.method5658();
		this.aFloatArray60 = this.aFloatArray64;
		this.method5631();
		this.anInt6662 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "(I)V")
	public final void method5622() {
		if (this.anInt6662 == 4) {
			return;
		}
		this.method5621();
		this.method5572(false);
		this.method5592(false);
		this.method5591(false);
		this.method5652(false);
		this.method5575(false, false, -2);
		this.method5617(1);
		this.method5655(0);
		this.anInt6662 = 4;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "()Z")
	@Override
	public final boolean method7661() {
		return false;
	}

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "(B)V")
	protected abstract void method5623();

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "(I)V")
	protected abstract void method5624();

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "(I)V")
	private void method5625() {
		if (this.anInt6662 == 1) {
			return;
		}
		this.method5621();
		this.method5572(false);
		this.method5592(false);
		this.method5591(false);
		this.method5652(false);
		this.method5575(false, false, -2);
		this.method5655(1);
		this.method5612(this.anInterface12_3);
		this.anInt6662 = 1;
	}

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "()Z")
	@Override
	public final boolean method7637() {
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(II)Lclient!hg;")
	protected Class121 method5626(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class121_Sub2(this);
		} else if (arg0 == 1) {
			return new Class121_Sub7(this);
		} else if (arg0 == 2) {
			return new Class121_Sub9(this, this.aClass76_5);
		} else if (arg0 == 7) {
			return new Class121_Sub8(this);
		} else {
			return new Class121_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!kfa;I)V")
	public final void method5627(@OriginalArg(0) Class181_Sub1 arg0) {
		this.aClass181_Sub1_15.method6355(arg0);
		this.aBoolean502 = false;
		this.method5587();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(ZI)V")
	public final void method5628(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean513 != arg0) {
			this.aBoolean513 = arg0;
			this.method5660();
		}
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(II)I")
	@Override
	public final int method7660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIZ)Lclient!bka;")
	@Override
	public final Class9 method7664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class9_Sub3 local11 = new Class9_Sub3(this, arg2, arg3, arg4);
		local11.method8607(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!nb", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6657 = arg3;
		this.anInt6665 = arg1;
		this.aBoolean517 = true;
		this.anInt6672 = arg0;
		this.anInt6663 = arg2;
	}

	@OriginalMember(owner = "client!nb", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass181_Sub1_16.method4937((float) arg0, (float) arg2, (float) arg1);
		@Pc(42) int local42;
		@Pc(60) int local60;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local42 = (int) ((float) this.anInt6667 * this.aClass181_Sub1_16.method4931((float) arg2, (float) arg1, (float) arg0) / local14);
			local60 = (int) ((float) this.anInt6678 * this.aClass181_Sub1_16.method4922((float) arg0, (float) arg2, (float) arg1) / local14);
		} else {
			local42 = this.anInt6668;
			local60 = this.anInt6671;
		}
		arg3[1] = (int) ((float) local60 - this.aFloat123);
		arg3[0] = (int) ((float) local42 - this.aFloat116);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!nb", name = "R", descriptor = "(I)Lclient!kfa;")
	public final Class181_Sub1 method5629() {
		return this.aClass181_Sub1_19;
	}

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "(I)V")
	private void method5630() {
		if (this.aClass320_5 == Static155.aClass320_4) {
			return;
		}
		@Pc(6) Class320 local6 = this.aClass320_5;
		this.aClass320_5 = Static155.aClass320_4;
		if (!local6.method7780()) {
			this.method5671();
		}
		this.method5665();
		this.aFloatArray60 = this.aFloatArray62;
		this.method5631();
		this.anInt6662 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)V")
	@Override
	public final void method7666() {
	}

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7650(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(B)V")
	private void method5631() {
		this.method5636();
		if (this.aClass121_3 != null) {
			this.aClass121_3.method9233();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[F)[F")
	public final float[] method5632(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloatArray60[0];
		arg0[8] = this.aFloatArray60[2];
		arg0[12] = this.aFloatArray60[3];
		arg0[4] = this.aFloatArray60[1];
		arg0[9] = this.aFloatArray60[6];
		arg0[13] = this.aFloatArray60[7];
		arg0[1] = this.aFloatArray60[4];
		arg0[5] = this.aFloatArray60[5];
		arg0[2] = this.aFloatArray60[8];
		arg0[7] = this.aFloatArray60[13];
		arg0[6] = this.aFloatArray60[9];
		arg0[10] = this.aFloatArray60[10];
		arg0[14] = this.aFloatArray60[11];
		arg0[3] = this.aFloatArray60[12];
		arg0[11] = this.aFloatArray60[14];
		arg0[15] = this.aFloatArray60[15];
		return arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ur;B)V")
	public abstract void method5633(@OriginalArg(0) Class377 arg0);

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "(B)I")
	public final int method5634() {
		return this.anInt6657;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)V")
	public final void method5635() {
		this.method5672(2, Static63.aClass281_1);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!dn;)V")
	@Override
	public final void method7639(@OriginalArg(0) Class77 arg0) {
		this.aClass77_Sub2_3 = (Class77_Sub2) arg0;
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)V")
	protected abstract void method5636();

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7699() {
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IB)V")
	public final void method5637(@OriginalArg(1) byte arg0) {
		this.method5588(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(IZ)V")
	public abstract void method5638(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt6680;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7669(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas11 == arg0) {
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
			@Pc(61) Object local61 = this.method5593(arg0);
			if (local61 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local61);
		}
	}

	@OriginalMember(owner = "client!nb", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt6658 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt6658++;
		}
		this.anInt6650 = 0x1 << this.anInt6658;
	}

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "(I)V")
	public final void method5639() {
		this.aBoolean502 = false;
		this.method5587();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!pc;I)V")
	public abstract void method5640(@OriginalArg(0) int arg0, @OriginalArg(2) Class281 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZIZLclient!ct;I)V")
	public abstract void method5641(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class58 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!nb", name = "W", descriptor = "(I)V")
	public final void method5642() {
		if (this.anInt6662 == 2) {
			return;
		}
		this.method5621();
		this.method5572(false);
		this.method5592(false);
		this.method5591(false);
		this.method5652(false);
		this.method5575(false, false, -2);
		this.anInt6662 = 2;
	}

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "()Z")
	@Override
	public final boolean method7711() {
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([I)V")
	@Override
	public final void method7702(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6626;
		arg0[0] = this.anInt6608;
	}

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "(B)I")
	public final int method5643() {
		return this.anInt6659;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[IZIII)Lclient!gp;")
	public abstract Interface6 method5644(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method7708() {
	}

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "(I)F")
	protected abstract float method5645();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!jr;Z)Lclient!bka;")
	@Override
	public final Class9 method7659(@OriginalArg(0) Class194 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(23) Class9 local23;
		if (arg0.anInt5596 == 0 || arg0.anInt5595 == 0) {
			local23 = this.method7688(new int[1], 1, 1, 1);
		} else {
			@Pc(32) int[] local32 = new int[arg0.anInt5596 * arg0.anInt5595];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			@Pc(41) int local41;
			@Pc(45) int local45;
			if (arg0.aByteArray45 == null) {
				for (local41 = 0; local41 < arg0.anInt5595; local41++) {
					for (local45 = 0; local45 < arg0.anInt5596; local45++) {
						@Pc(107) int local107 = arg0.anIntArray319[arg0.aByteArray46[local34++] & 0xFF];
						local32[local36++] = local107 == 0 ? 0 : local107 | 0xFF000000;
					}
				}
			} else {
				for (local41 = 0; local41 < arg0.anInt5595; local41++) {
					for (local45 = 0; local45 < arg0.anInt5596; local45++) {
						local32[local36++] = arg0.aByteArray45[local34] << 24 | arg0.anIntArray319[arg0.aByteArray46[local34] & 0xFF];
						local34++;
					}
				}
			}
			local23 = this.method7688(local32, arg0.anInt5596, arg0.anInt5596, arg0.anInt5595);
		}
		local23.method8608(arg0.anInt5594, arg0.anInt5597, arg0.anInt5593, arg0.anInt5598);
		return local23;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(FFFFFBF)Z")
	private boolean method5646(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface16_9.method7122();
		if (local9 == null) {
			return false;
		}
		@Pc(19) Stream local19 = this.method5616(local9);
		if (Stream.b()) {
			local19.a(arg5);
			local19.a(arg3);
			local19.a(arg4);
			local19.a(arg2);
			local19.a(arg0);
			local19.a(arg1);
		} else {
			local19.b(arg5);
			local19.b(arg3);
			local19.b(arg4);
			local19.b(arg2);
			local19.b(arg0);
			local19.b(arg1);
		}
		local19.a();
		return this.anInterface16_9.method7124();
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(Z)I")
	public final int method5647() {
		return this.anInt6665;
	}

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "()V")
	@Override
	protected void method7632() {
		if (this.aBoolean518) {
			return;
		}
		for (@Pc(13) Class3 local13 = this.aClass357_34.method8391(); local13 != null; local13 = this.aClass357_34.method8392()) {
			((Class3_Sub17_Sub2) local13).method6207();
		}
		@Pc(32) Enumeration local32 = this.aHashtable5.keys();
		while (local32.hasMoreElements()) {
			@Pc(42) Canvas local42 = (Canvas) local32.nextElement();
			this.method5557(local42, this.aHashtable5.get(local42));
		}
		Static246.method3750(false, true);
		this.aNativeInterface3.release();
		this.aBoolean518 = true;
	}

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "(B)V")
	private void method5648() {
		this.aFloat118 = (float) (this.anInt6651 - this.anInt6671);
		this.aFloat123 = (float) (this.anInt6685 - this.anInt6671);
		this.aFloat115 = (float) (this.anInt6682 - this.anInt6668);
		this.aFloat116 = (float) (this.anInt6687 - this.anInt6668);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(ZB)Lclient!lq;")
	public abstract Interface16 method5649(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "(I)V")
	public final void method5650() {
		this.aClass181_Sub1_15.method6349();
		this.aBoolean502 = true;
		this.method5587();
	}

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "(B)V")
	private void method5651() {
		this.anInterface16_8 = this.method5649(false);
		this.anInterface16_8.method7121(28, 140);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(38) Buffer local38 = this.anInterface16_8.method7122();
			if (local38 != null) {
				@Pc(45) Stream local45 = this.method5616(local38);
				if (Stream.b()) {
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
				} else {
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
				}
				local45.a();
				if (this.anInterface16_8.method7124()) {
					break;
				}
			}
		}
		this.aClass212_16 = this.method5570(new Class147[] { new Class147(new Class134[] { Static219.aClass134_1, Static219.aClass134_5, Static219.aClass134_5 }) });
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZB)V")
	public final void method5652(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean511 != arg0) {
			this.aBoolean511 = arg0;
			this.method5584();
			this.anInt6662 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean514 = arg0;
		this.method5584();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7631(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas11) {
			local5 = this.anObject17;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method5559(arg0, local5);
		if (arg0 == this.aCanvas10) {
			this.method5618();
		}
	}

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "(I)V")
	public final void method5653() {
		if (this.anInt6662 == 16) {
			return;
		}
		this.method5597();
		this.method5572(true);
		this.method5591(true);
		this.method5652(true);
		this.method5617(1);
		this.anInt6662 = 16;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)I")
	public final int method5654() {
		return this.anInt6672;
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(ZI)V")
	public final void method5655(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method5686(Static573.aClass37_3, Static573.aClass37_3);
		} else if (arg0 == 0) {
			this.method5686(Static496.aClass37_2, Static496.aClass37_2);
		} else if (arg0 == 2) {
			this.method5686(Static477.aClass37_1, Static573.aClass37_3);
		} else if (arg0 == 3) {
			this.method5686(Static722.aClass37_5, Static496.aClass37_2);
		} else if (arg0 == 4) {
			this.method5686(Static614.aClass37_4, Static614.aClass37_4);
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(II)I")
	@Override
	public final int method7671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "(I)V")
	private void method5656() {
		this.aFloat112 = (float) this.anInt6656;
	}

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "()Lclient!iu;")
	@Override
	public final Class181 method7693() {
		return this.aClass181_Sub1_21;
	}

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "(I)V")
	@Override
	public void method7709(@OriginalArg(0) int arg0) {
		if (this.aClass167_3 != null) {
			this.aClass167_3.method4096();
		}
		this.anInt6654 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "(I)V")
	protected abstract void method5657();

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "(Z)V")
	private void method5658() {
		if (this.aBoolean519) {
			return;
		}
		@Pc(17) float[] local17 = this.aFloatArray64;
		this.aBoolean519 = true;
		if (this.anInt6608 != 0 && this.anInt6626 != 0) {
			local17[2] = 0.0F;
			local17[10] = 0.5F;
			local17[12] = -1.0F;
			local17[0] = 2.0F / (float) this.anInt6608;
			local17[6] = 0.0F;
			local17[8] = 0.0F;
			local17[7] = 0.0F;
			local17[1] = 0.0F;
			local17[14] = 0.5F;
			local17[11] = 0.0F;
			local17[9] = 0.0F;
			local17[3] = 0.0F;
			local17[13] = 1.0F;
			local17[5] = -2.0F / (float) this.anInt6626;
			local17[4] = 0.0F;
			local17[15] = 1.0F;
			return;
		}
		local17[4] = 0.0F;
		local17[11] = 0.0F;
		local17[6] = 0.0F;
		local17[2] = 0.0F;
		local17[8] = 0.0F;
		local17[5] = 1.0F;
		local17[13] = 0.0F;
		local17[9] = 0.0F;
		local17[3] = 0.0F;
		local17[0] = 1.0F;
		local17[10] = 1.0F;
		local17[15] = 1.0F;
		local17[7] = 0.0F;
		local17[12] = 0.0F;
		local17[14] = 0.0F;
		local17[1] = 0.0F;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!fh;IZIIILclient!pc;)V")
	public abstract void method5659(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class281 arg5);

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "(B)V")
	protected abstract void method5660();

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "(I)V")
	private void method5661() {
		this.method5620(this.anInterface16_9, 0);
		this.method5569(this.aClass212_21);
		this.method5640(1, Static626.aClass281_8, 0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	@Override
	public final void method7695(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "(I)V")
	public final void method5662() {
		this.method5558();
		this.method5631();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!iu;)V")
	@Override
	public final void method7642(@OriginalArg(0) Class181 arg0) {
		this.aClass181_Sub1_16 = (Class181_Sub1) arg0;
		this.aClass181_Sub1_18.method6355(this.aClass181_Sub1_16);
		this.aClass181_Sub1_18.method4924();
		this.aClass181_Sub1_19.method4934(this.aClass181_Sub1_18);
		this.aClass181_Sub1_17.method4934(this.aClass181_Sub1_16);
		if (this.aClass320_5.method7780()) {
			this.method5671();
		}
	}

	@OriginalMember(owner = "client!nb", name = "U", descriptor = "(I)V")
	protected final void method5663() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(22) Enumeration local22 = this.aHashtable5.keys();
			while (local22.hasMoreElements()) {
				@Pc(28) Canvas local28 = (Canvas) local22.nextElement();
				local9.put(local28, this.method5593(local28));
			}
		}
		this.aHashtable5 = local9;
		this.method5651();
		this.method5595();
		this.method5675();
		this.aClass324_3.method7808(this);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!hd;Lclient!ns;B)Z")
	public abstract boolean method5664(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class261 arg1);

	@OriginalMember(owner = "client!nb", name = "Y", descriptor = "(I)V")
	private void method5665() {
		if (this.aBoolean522) {
			return;
		}
		@Pc(17) float[] local17 = this.aFloatArray62;
		@Pc(29) float local29 = (float) (-this.anInt6668 * this.anInt6680) / (float) this.anInt6667;
		@Pc(43) float local43 = (float) ((this.anInt6608 - this.anInt6668) * this.anInt6680) / (float) this.anInt6667;
		@Pc(54) float local54 = (float) (this.anInt6671 * this.anInt6680) / (float) this.anInt6678;
		@Pc(68) float local68 = (float) ((this.anInt6671 - this.anInt6626) * this.anInt6680) / (float) this.anInt6678;
		if (local43 == local29 || local68 == local54) {
			local17[15] = 1.0F;
			local17[5] = 1.0F;
			local17[1] = 0.0F;
			local17[4] = 0.0F;
			local17[8] = 0.0F;
			local17[3] = 0.0F;
			local17[12] = 0.0F;
			local17[2] = 0.0F;
			local17[6] = 0.0F;
			local17[13] = 0.0F;
			local17[7] = 0.0F;
			local17[10] = 1.0F;
			local17[9] = 0.0F;
			local17[11] = 0.0F;
			local17[0] = 1.0F;
			local17[14] = 0.0F;
		} else {
			@Pc(84) float local84 = (float) this.anInt6680 * 2.0F;
			local17[6] = 0.0F;
			local17[8] = (local29 + local43) / (local43 - local29);
			local17[11] = -1.0F;
			local17[9] = (local54 + local68) / (-local68 + local54);
			local17[12] = 0.0F;
			local17[2] = 0.0F;
			local17[10] = this.aFloat111 = (float) this.anInt6656 / (float) (this.anInt6680 - this.anInt6656);
			local17[1] = 0.0F;
			local17[4] = 0.0F;
			local17[7] = 0.0F;
			local17[5] = local84 / (local54 - local68);
			local17[15] = 0.0F;
			local17[0] = local84 / (local43 - local29);
			local17[3] = 0.0F;
			local17[13] = 0.0F;
			local17[14] = this.aFloat114 = (float) (this.anInt6680 * this.anInt6656) / (float) (this.anInt6680 - this.anInt6656);
		}
		this.method5603();
		this.aBoolean522 = true;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ela;I)V")
	public final void method5666(@OriginalArg(0) Class96 arg0) {
		this.aClass96Array3[this.anInt6659] = arg0;
		this.method5573();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IZ)V")
	public abstract void method5667(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "(B)V")
	protected abstract void method5668();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()Z")
	@Override
	public final boolean method7654() {
		return false;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(Z)V")
	public final void method5669() {
		this.anInterface12Array3 = new Interface12[this.anInt6683];
		this.aClass37Array6 = new Class37[this.anInt6683];
		this.aClass96Array3 = new Class96[this.anInt6683];
		this.aClass37Array5 = new Class37[this.anInt6683];
		this.aClass181_Sub1Array3 = new Class181_Sub1[this.anInt6683];
		for (@Pc(32) int local32 = 0; local32 < this.anInt6683; local32++) {
			this.aClass37Array5[local32] = Static496.aClass37_2;
			this.aClass37Array6[local32] = Static496.aClass37_2;
			this.aClass96Array3[local32] = Static547.aClass96_5;
			this.aClass181_Sub1Array3[local32] = new Class181_Sub1();
		}
		this.aClass3_Sub16Array5 = new Class3_Sub16[this.anInt6689 - 2];
		this.anInterface12_3 = this.method5682(1, 1, Static438.aClass261_14, Static557.aClass145_14);
		this.method7715(new Class3_Sub17_Sub2(262144));
		this.aClass212_18 = this.method5570(new Class147[] { new Class147(new Class134[] { Static219.aClass134_1, Static219.aClass134_5 }) });
		this.aClass212_19 = this.method5570(new Class147[] { new Class147(new Class134[] { Static219.aClass134_1, Static219.aClass134_3 }) });
		this.aClass212_20 = this.method5570(new Class147[] { new Class147(Static219.aClass134_1), new Class147(Static219.aClass134_3), new Class147(Static219.aClass134_5), new Class147(Static219.aClass134_2) });
		this.aClass212_15 = this.method5570(new Class147[] { new Class147(Static219.aClass134_1), new Class147(Static219.aClass134_3), new Class147(Static219.aClass134_5) });
		for (@Pc(200) int local200 = 0; local200 < 7; local200++) {
			this.aClass157_Sub2Array5[local200] = new Class157_Sub2(this, 0, 0, false, false);
			this.aClass157_Sub2Array6[local200] = new Class157_Sub2(this, 0, 0, true, true);
		}
		this.aClass324_3 = new Class324(this);
		this.anInterface5_5 = this.method5684(true);
		this.method5663();
		this.aClass76_5 = new Class76(this);
		this.aClass121Array3[1] = this.method5626(1);
		this.aClass121Array3[2] = this.method5626(2);
		this.aClass121Array3[4] = this.method5626(4);
		this.aClass121Array3[5] = this.method5626(5);
		this.aClass121Array3[6] = this.method5626(6);
		this.aClass121Array3[7] = this.method5626(7);
		this.aClass121Array3[3] = this.method5626(3);
		this.aClass121Array3[8] = this.method5626(8);
		this.aClass121Array3[9] = this.method5626(9);
		if (!this.aClass121Array3[2].method9241()) {
			this.aClass121Array3[2] = this.method5626(0);
		}
		if (!this.aClass121Array3[4].method9241()) {
			this.aClass121Array3[4] = this.aClass121Array3[2];
		}
		if (!this.aClass121Array3[8].method9241()) {
			this.aClass121Array3[8] = this.aClass121Array3[4];
		}
		if (!this.aClass121Array3[9].method9241()) {
			this.aClass121Array3[9] = this.aClass121Array3[8];
		}
		this.method5576(120);
		this.la();
		this.method7663();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIF)Lclient!vj;")
	@Override
	public final Class3_Sub16 method7703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub16_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([BIZBLclient!hd;I)Lclient!gp;")
	public final Interface6 method5670(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class145 arg3, @OriginalArg(5) int arg4) {
		return this.method5689(arg1, arg0, arg4, arg3, arg2);
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7648() {
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
	private void method5671() {
		this.aBoolean521 = false;
		if (this.aClass121_3 != null) {
			this.aClass121_3.method9243();
		}
		this.method5606();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZLclient!pc;)V")
	private void method5672(@OriginalArg(0) int arg0, @OriginalArg(2) Class281 arg1) {
		this.method5620(this.anInterface16_8, 0);
		this.method5569(this.aClass212_16);
		this.method5640(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "(I)V")
	protected abstract void method5673();

	@OriginalMember(owner = "client!nb", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6678 = arg3;
		this.anInt6671 = arg1;
		this.anInt6668 = arg0;
		this.anInt6667 = arg2;
		this.method5690();
		this.method5609();
		this.method5558();
		this.method5648();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILclient!ct;)V")
	public final void method5674(@OriginalArg(1) int arg0, @OriginalArg(2) Class58 arg1) {
		this.method5582(arg1, arg0);
	}

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "(B)V")
	private void method5675() {
		this.anInterface16_10 = this.method5649(false);
		this.anInterface16_10.method7121(12, 3096);
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			@Pc(35) Buffer local35 = this.anInterface16_10.method7122();
			if (local35 != null) {
				@Pc(42) Stream local42 = this.method5616(local35);
				local42.a(0.0F);
				local42.a(0.0F);
				local42.a(0.0F);
				for (@Pc(53) int local53 = 0; local53 <= 256; local53++) {
					@Pc(64) double local64 = (double) (local53 * 2) * 3.141592653589793D / 256.0D;
					@Pc(68) float local68 = (float) Math.cos(local64);
					@Pc(72) float local72 = (float) Math.sin(local64);
					if (Stream.b()) {
						local42.a(local72);
						local42.a(local68);
						local42.a(0.0F);
					} else {
						local42.b(local72);
						local42.b(local68);
						local42.b(0.0F);
					}
				}
				local42.a();
				if (this.anInterface16_10.method7124()) {
					break;
				}
			}
		}
		this.aClass212_17 = this.method5570(new Class147[] { new Class147(Static219.aClass134_1) });
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!iq;IIII)Lclient!ka;")
	@Override
	public final Class157 method7653(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class157_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "(I)V")
	protected abstract void method5676();

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "(I)V")
	protected abstract void method5677();

	@OriginalMember(owner = "client!nb", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt6656;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZIILclient!hd;[F)Lclient!gp;")
	public final Interface6 method5678(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class145 arg3, @OriginalArg(5) float[] arg4) {
		return this.method5679(arg0, arg4, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z[FLclient!hd;IIIBI)Lclient!gp;")
	protected abstract Interface6 method5679(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "()I")
	@Override
	public final int method7634() {
		return this.anInt6689 - 2;
	}

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "(B)V")
	private void method5680() {
		this.method5685();
		this.method5585();
		this.method5574();
		this.method5581();
		this.method5611();
		this.method5607();
		this.method5660();
		this.method5668();
		this.method5584();
		this.method5691();
		this.method5602();
		this.method5624();
		this.method5568();
		this.method5657();
		for (@Pc(61) int local61 = this.anInt6683 - 1; local61 >= 0; local61--) {
			this.method5687(local61);
			this.method5688();
			this.method5676();
			this.method5614();
		}
		this.method5677();
		this.method5561();
		this.method5636();
		this.method5610();
		this.method5606();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZZ)V")
	public final void method5681(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean507 != arg0) {
			this.aBoolean507 = arg0;
			this.method5691();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!ns;ILclient!hd;)Lclient!gp;")
	public abstract Interface6 method5682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class261 arg2, @OriginalArg(4) Class145 arg3);

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "()Z")
	@Override
	public final boolean method7697() {
		return this.aBoolean504;
	}

	@OriginalMember(owner = "client!nb", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean517) {
			throw new RuntimeException("");
		}
		this.anInt6657 = arg3;
		this.anInt6663 = arg2;
		this.anInt6672 = arg0;
		this.anInt6665 = arg1;
		if (this.aBoolean516) {
			this.aClass121Array3[3].method9242();
			this.aClass121Array3[3].method9240();
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(ZI)Lclient!fh;")
	public abstract Interface5 method5684(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "(I)V")
	protected abstract void method5685();

	@OriginalMember(owner = "client!nb", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt6668, this.anInt6671, this.anInt6667, this.anInt6678 };
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!br;Lclient!br;I)V")
	public final void method5686(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class37 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg0 != this.aClass37Array6[this.anInt6659]) {
			this.aClass37Array6[this.anInt6659] = arg0;
			local5 = true;
			this.method5688();
		}
		if (this.aClass37Array5[this.anInt6659] != arg1) {
			this.aClass37Array5[this.anInt6659] = arg1;
			local5 = true;
			this.method5676();
		}
		if (local5) {
			this.anInt6662 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!hu;)V")
	@Override
	public final void method7656(@OriginalArg(0) Class162 arg0) {
		this.aClass324_3.method7809(arg0, -1, this);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7673(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)V")
	public final void method5687(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt6659) {
			this.anInt6659 = arg0;
			this.method5673();
		}
	}

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "(I)V")
	protected abstract void method5688();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method7675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static580.method7997(arg0, arg1, arg3, this, arg2);
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6680 == arg0 && this.anInt6656 == arg1) {
			return;
		}
		this.anInt6656 = arg1;
		this.anInt6680 = arg0;
		this.method5609();
		this.method5690();
		this.method5580();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III[BIILclient!hd;Z)Lclient!gp;")
	protected abstract Interface6 method5689(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class145 arg3, @OriginalArg(7) boolean arg4);

	@OriginalMember(owner = "client!nb", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5625();
		this.method5588(arg4);
		this.method5590(0, Static472.aClass58_3);
		this.method5674(0, Static472.aClass58_3);
		this.method5617(arg5);
		this.aClass181_Sub1_15.method4918((float) arg3, 1.0F, (float) arg2);
		this.aClass181_Sub1_15.method6354(arg0, arg1, 0);
		this.method5639();
		this.method5667(false);
		this.method5635();
		this.method5667(true);
		this.method5674(0, Static143.aClass58_1);
		this.method5590(0, Static143.aClass58_1);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
	private void method5690() {
		this.aBoolean512 = false;
		this.method5565();
		if (Static146.aClass320_3 == this.aClass320_5) {
			this.method5631();
		}
	}

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Interface6 local9 = local6.anInterface6_2;
		this.method5642();
		this.method5612(local9);
		this.method5617(1);
		this.method5686(Static573.aClass37_3, Static573.aClass37_3);
		this.method5590(0, Static472.aClass58_3);
		this.method5588(arg0);
		this.aClass181_Sub1_15.method4918((float) this.anInt6626, 0.0F, (float) this.anInt6608);
		this.method5639();
		this.aClass181_Sub1Array3[0].method4918(local9.method9269((float) this.anInt6626), 1.0F, local9.method9276((float) this.anInt6608));
		this.aClass181_Sub1Array3[0].method4915(local9.method9269((float) -arg3), 0.0F, local9.method9276((float) -arg2));
		this.aClass96Array3[0] = Static32.aClass96_1;
		this.method5573();
		this.method5635();
		this.method5614();
		this.method5590(0, Static143.aClass58_1);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7668(@OriginalArg(0) Canvas arg0) {
		this.aCanvas10 = null;
		this.anObject17 = null;
		if (arg0 == null || arg0 == this.aCanvas11) {
			this.anObject17 = this.anObject18;
			this.aCanvas10 = this.aCanvas11;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject17 = this.aHashtable5.get(arg0);
			this.aCanvas10 = arg0;
		}
		if (this.aCanvas10 == null || this.anObject17 == null) {
			throw new RuntimeException();
		}
		this.method5579(this.anObject17, this.aCanvas10);
		this.method5618();
	}

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "(I)V")
	protected abstract void method5691();
}
