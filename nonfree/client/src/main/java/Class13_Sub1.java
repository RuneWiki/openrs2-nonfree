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

@OriginalClass("client!ai")
public abstract class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ai", name = "ob", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!ai", name = "Eb", descriptor = "Lclient!lja;")
	protected Class202 aClass202_6;

	@OriginalMember(owner = "client!ai", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!ai", name = "Dd", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!ai", name = "Qd", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!ai", name = "Sd", descriptor = "I")
	protected int anInt8587;

	@OriginalMember(owner = "client!ai", name = "Td", descriptor = "I")
	public int anInt8588;

	@OriginalMember(owner = "client!ai", name = "Wd", descriptor = "I")
	public int anInt8591;

	@OriginalMember(owner = "client!ai", name = "je", descriptor = "Z")
	public boolean aBoolean648;

	@OriginalMember(owner = "client!ai", name = "ke", descriptor = "I")
	public int anInt8596;

	@OriginalMember(owner = "client!ai", name = "le", descriptor = "I")
	public int anInt8597;

	@OriginalMember(owner = "client!ai", name = "oe", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!ai", name = "re", descriptor = "[Lclient!wn;")
	protected Class239_Sub3[] aClass239_Sub3Array3;

	@OriginalMember(owner = "client!ai", name = "te", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!ai", name = "ue", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!ai", name = "ye", descriptor = "F")
	public float aFloat177;

	@OriginalMember(owner = "client!ai", name = "De", descriptor = "Lclient!no;")
	private Class242 aClass242_3;

	@OriginalMember(owner = "client!ai", name = "Ge", descriptor = "Z")
	public boolean aBoolean654;

	@OriginalMember(owner = "client!ai", name = "Ie", descriptor = "Z")
	protected boolean aBoolean655;

	@OriginalMember(owner = "client!ai", name = "Ne", descriptor = "F")
	private float aFloat180;

	@OriginalMember(owner = "client!ai", name = "Qe", descriptor = "Lclient!fe;")
	private Class35_Sub1 aClass35_Sub1_3;

	@OriginalMember(owner = "client!ai", name = "Ve", descriptor = "Lclient!bm;")
	public Interface3 anInterface3_3;

	@OriginalMember(owner = "client!ai", name = "Ye", descriptor = "[Lclient!eo;")
	protected Class94[] aClass94Array3;

	@OriginalMember(owner = "client!ai", name = "cf", descriptor = "I")
	private int anInt8607;

	@OriginalMember(owner = "client!ai", name = "gf", descriptor = "[Lclient!ln;")
	protected Class203[] aClass203Array5;

	@OriginalMember(owner = "client!ai", name = "lf", descriptor = "I")
	protected int anInt8612;

	@OriginalMember(owner = "client!ai", name = "mf", descriptor = "I")
	public int anInt8613;

	@OriginalMember(owner = "client!ai", name = "qf", descriptor = "I")
	protected int anInt8615;

	@OriginalMember(owner = "client!ai", name = "rf", descriptor = "I")
	protected int anInt8616;

	@OriginalMember(owner = "client!ai", name = "wf", descriptor = "Z")
	public boolean aBoolean660;

	@OriginalMember(owner = "client!ai", name = "yf", descriptor = "I")
	public int anInt8620;

	@OriginalMember(owner = "client!ai", name = "zf", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!ai", name = "Af", descriptor = "[Lclient!bm;")
	private Interface3[] anInterface3Array3;

	@OriginalMember(owner = "client!ai", name = "Ef", descriptor = "Lclient!aba;")
	private Class4 aClass4_3;

	@OriginalMember(owner = "client!ai", name = "Kf", descriptor = "[Lclient!uca;")
	protected Class3_Sub15[] aClass3_Sub15Array5;

	@OriginalMember(owner = "client!ai", name = "Of", descriptor = "I")
	private int anInt8630;

	@OriginalMember(owner = "client!ai", name = "Qf", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!ai", name = "Rf", descriptor = "[Lclient!ln;")
	protected Class203[] aClass203Array6;

	@OriginalMember(owner = "client!ai", name = "Tf", descriptor = "F")
	private float aFloat186;

	@OriginalMember(owner = "client!ai", name = "Yf", descriptor = "Z")
	protected boolean aBoolean666;

	@OriginalMember(owner = "client!ai", name = "ag", descriptor = "I")
	protected int anInt8633;

	@OriginalMember(owner = "client!ai", name = "fg", descriptor = "Lclient!id;")
	private Interface15 anInterface15_16;

	@OriginalMember(owner = "client!ai", name = "gg", descriptor = "Lclient!id;")
	private Interface15 anInterface15_17;

	@OriginalMember(owner = "client!ai", name = "hg", descriptor = "Lclient!kj;")
	public Class95_Sub2 aClass95_Sub2_21;

	@OriginalMember(owner = "client!ai", name = "ig", descriptor = "Lclient!kj;")
	public Class95_Sub2 aClass95_Sub2_22;

	@OriginalMember(owner = "client!ai", name = "jg", descriptor = "Lclient!kj;")
	public Class95_Sub2 aClass95_Sub2_23;

	@OriginalMember(owner = "client!ai", name = "kg", descriptor = "Lclient!nc;")
	public Class233 aClass233_17;

	@OriginalMember(owner = "client!ai", name = "lg", descriptor = "Lclient!nc;")
	private Class233 aClass233_18;

	@OriginalMember(owner = "client!ai", name = "mg", descriptor = "Lclient!nc;")
	public Class233 aClass233_19;

	@OriginalMember(owner = "client!ai", name = "ng", descriptor = "Lclient!kj;")
	public Class95_Sub2 aClass95_Sub2_24;

	@OriginalMember(owner = "client!ai", name = "og", descriptor = "Lclient!kj;")
	public Class95_Sub2 aClass95_Sub2_25;

	@OriginalMember(owner = "client!ai", name = "pg", descriptor = "Lclient!nc;")
	public Class233 aClass233_20;

	@OriginalMember(owner = "client!ai", name = "qg", descriptor = "Lclient!oh;")
	private Interface20 anInterface20_8;

	@OriginalMember(owner = "client!ai", name = "rg", descriptor = "Lclient!kj;")
	public Class95_Sub2 aClass95_Sub2_26;

	@OriginalMember(owner = "client!ai", name = "sg", descriptor = "Lclient!kj;")
	public Class95_Sub2 aClass95_Sub2_27;

	@OriginalMember(owner = "client!ai", name = "tg", descriptor = "Lclient!nc;")
	private Class233 aClass233_21;

	@OriginalMember(owner = "client!ai", name = "ug", descriptor = "Lclient!kj;")
	public Class95_Sub2 aClass95_Sub2_28;

	@OriginalMember(owner = "client!ai", name = "vg", descriptor = "Lclient!kj;")
	public Class95_Sub2 aClass95_Sub2_29;

	@OriginalMember(owner = "client!ai", name = "wg", descriptor = "Lclient!kj;")
	public Class95_Sub2 aClass95_Sub2_30;

	@OriginalMember(owner = "client!ai", name = "yg", descriptor = "Lclient!nc;")
	public Class233 aClass233_22;

	@OriginalMember(owner = "client!ai", name = "zg", descriptor = "Lclient!id;")
	private Interface15 anInterface15_18;

	@OriginalMember(owner = "client!ai", name = "Ag", descriptor = "Lclient!nc;")
	private Class233 aClass233_23;

	@OriginalMember(owner = "client!ai", name = "Bg", descriptor = "I")
	private int anInt8635;

	@OriginalMember(owner = "client!ai", name = "Cg", descriptor = "Z")
	protected boolean aBoolean668;

	@OriginalMember(owner = "client!ai", name = "D", descriptor = "Lclient!tm;")
	private final Class338 aClass338_198 = new Class338();

	@OriginalMember(owner = "client!ai", name = "Xd", descriptor = "Z")
	protected boolean aBoolean647 = true;

	@OriginalMember(owner = "client!ai", name = "ae", descriptor = "Lclient!wn;")
	protected final Class239_Sub3 aClass239_Sub3_15 = new Class239_Sub3();

	@OriginalMember(owner = "client!ai", name = "ce", descriptor = "Lclient!wn;")
	public Class239_Sub3 aClass239_Sub3_16 = new Class239_Sub3();

	@OriginalMember(owner = "client!ai", name = "de", descriptor = "Lclient!wn;")
	public final Class239_Sub3 aClass239_Sub3_17 = new Class239_Sub3();

	@OriginalMember(owner = "client!ai", name = "ee", descriptor = "Lclient!wn;")
	protected final Class239_Sub3 aClass239_Sub3_18 = new Class239_Sub3();

	@OriginalMember(owner = "client!ai", name = "fe", descriptor = "Lclient!wn;")
	private final Class239_Sub3 aClass239_Sub3_19 = new Class239_Sub3();

	@OriginalMember(owner = "client!ai", name = "ge", descriptor = "Lclient!wn;")
	private final Class239_Sub3 aClass239_Sub3_20 = new Class239_Sub3();

	@OriginalMember(owner = "client!ai", name = "me", descriptor = "Z")
	protected boolean aBoolean649 = true;

	@OriginalMember(owner = "client!ai", name = "ve", descriptor = "Z")
	protected boolean aBoolean650 = false;

	@OriginalMember(owner = "client!ai", name = "qe", descriptor = "I")
	protected int anInt8599 = 0;

	@OriginalMember(owner = "client!ai", name = "pe", descriptor = "I")
	public int anInt8598 = -1;

	@OriginalMember(owner = "client!ai", name = "we", descriptor = "F")
	public float aFloat176 = 1.0F;

	@OriginalMember(owner = "client!ai", name = "Te", descriptor = "Z")
	private boolean aBoolean656 = false;

	@OriginalMember(owner = "client!ai", name = "Ee", descriptor = "[F")
	private final float[] aFloatArray65 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ai", name = "Le", descriptor = "F")
	public float aFloat179 = -1.0F;

	@OriginalMember(owner = "client!ai", name = "Ae", descriptor = "I")
	protected int anInt8601 = 0;

	@OriginalMember(owner = "client!ai", name = "Ke", descriptor = "[F")
	private final float[] aFloatArray66 = new float[16];

	@OriginalMember(owner = "client!ai", name = "He", descriptor = "I")
	private int anInt8602 = -1;

	@OriginalMember(owner = "client!ai", name = "ie", descriptor = "F")
	public float aFloat172 = 1.0F;

	@OriginalMember(owner = "client!ai", name = "nf", descriptor = "[F")
	public final float[] aFloatArray72 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ai", name = "Xe", descriptor = "[F")
	private final float[] aFloatArray69 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ai", name = "af", descriptor = "F")
	public float aFloat182 = 3584.0F;

	@OriginalMember(owner = "client!ai", name = "Ze", descriptor = "F")
	public float aFloat181 = 1.0F;

	@OriginalMember(owner = "client!ai", name = "Ce", descriptor = "F")
	private float aFloat178 = 1.0F;

	@OriginalMember(owner = "client!ai", name = "ef", descriptor = "I")
	public int anInt8609 = 512;

	@OriginalMember(owner = "client!ai", name = "Pe", descriptor = "I")
	protected int anInt8605 = 0;

	@OriginalMember(owner = "client!ai", name = "se", descriptor = "[Lclient!aba;")
	private final Class4[] aClass4Array3 = new Class4[10];

	@OriginalMember(owner = "client!ai", name = "sf", descriptor = "F")
	public float aFloat183 = -1.0F;

	@OriginalMember(owner = "client!ai", name = "Me", descriptor = "[F")
	private final float[] aFloatArray67 = new float[16];

	@OriginalMember(owner = "client!ai", name = "Re", descriptor = "I")
	public int anInt8606 = 0;

	@OriginalMember(owner = "client!ai", name = "We", descriptor = "Z")
	private boolean aBoolean658 = false;

	@OriginalMember(owner = "client!ai", name = "hf", descriptor = "I")
	private int anInt8610 = 0;

	@OriginalMember(owner = "client!ai", name = "Ue", descriptor = "Z")
	private boolean aBoolean657 = false;

	@OriginalMember(owner = "client!ai", name = "ze", descriptor = "Z")
	protected boolean aBoolean651 = true;

	@OriginalMember(owner = "client!ai", name = "xe", descriptor = "I")
	protected int anInt8600 = 3584;

	@OriginalMember(owner = "client!ai", name = "Bf", descriptor = "I")
	public int anInt8621 = 0;

	@OriginalMember(owner = "client!ai", name = "df", descriptor = "I")
	public int anInt8608 = 50;

	@OriginalMember(owner = "client!ai", name = "Cf", descriptor = "I")
	protected int anInt8622 = 0;

	@OriginalMember(owner = "client!ai", name = "kf", descriptor = "[F")
	protected float[] aFloatArray71 = this.aFloatArray69;

	@OriginalMember(owner = "client!ai", name = "ff", descriptor = "[F")
	public final float[] aFloatArray70 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!ai", name = "Mf", descriptor = "Z")
	protected boolean aBoolean661 = true;

	@OriginalMember(owner = "client!ai", name = "Gf", descriptor = "I")
	private int anInt8625 = -1;

	@OriginalMember(owner = "client!ai", name = "ne", descriptor = "Lclient!fb;")
	protected Class99 aClass99_8 = Static581.aClass99_7;

	@OriginalMember(owner = "client!ai", name = "he", descriptor = "I")
	public int anInt8595 = 3;

	@OriginalMember(owner = "client!ai", name = "Lf", descriptor = "I")
	private int anInt8629 = 0;

	@OriginalMember(owner = "client!ai", name = "tf", descriptor = "I")
	private int anInt8617 = -1;

	@OriginalMember(owner = "client!ai", name = "Be", descriptor = "Z")
	protected boolean aBoolean652 = false;

	@OriginalMember(owner = "client!ai", name = "Ff", descriptor = "I")
	private int anInt8624 = 0;

	@OriginalMember(owner = "client!ai", name = "If", descriptor = "I")
	public int anInt8627 = -1;

	@OriginalMember(owner = "client!ai", name = "bf", descriptor = "F")
	public float bf = 3584.0F;

	@OriginalMember(owner = "client!ai", name = "Fe", descriptor = "Z")
	protected boolean aBoolean653 = true;

	@OriginalMember(owner = "client!ai", name = "xf", descriptor = "I")
	private int anInt8619 = 1;

	@OriginalMember(owner = "client!ai", name = "pf", descriptor = "Z")
	private boolean aBoolean659 = false;

	@OriginalMember(owner = "client!ai", name = "Jf", descriptor = "I")
	protected final int anInt8628 = 0;

	@OriginalMember(owner = "client!ai", name = "Pf", descriptor = "Z")
	protected boolean aBoolean663 = true;

	@OriginalMember(owner = "client!ai", name = "Hf", descriptor = "I")
	public int anInt8626 = 8;

	@OriginalMember(owner = "client!ai", name = "jf", descriptor = "I")
	public int anInt8611 = 0;

	@OriginalMember(owner = "client!ai", name = "Oe", descriptor = "I")
	public int anInt8604 = 128;

	@OriginalMember(owner = "client!ai", name = "Xf", descriptor = "I")
	public int anInt8632 = 512;

	@OriginalMember(owner = "client!ai", name = "Nf", descriptor = "Z")
	protected boolean aBoolean662 = false;

	@OriginalMember(owner = "client!ai", name = "Vf", descriptor = "Z")
	private boolean aBoolean665 = false;

	@OriginalMember(owner = "client!ai", name = "Je", descriptor = "I")
	protected int anInt8603 = 0;

	@OriginalMember(owner = "client!ai", name = "Wf", descriptor = "[F")
	private final float[] aFloatArray73 = new float[16];

	@OriginalMember(owner = "client!ai", name = "of", descriptor = "I")
	private int anInt8614 = 0;

	@OriginalMember(owner = "client!ai", name = "Zf", descriptor = "Z")
	private boolean aBoolean667 = false;

	@OriginalMember(owner = "client!ai", name = "Se", descriptor = "[F")
	private final float[] aFloatArray68 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ai", name = "Sf", descriptor = "Z")
	protected boolean aBoolean664 = false;

	@OriginalMember(owner = "client!ai", name = "Uf", descriptor = "I")
	protected final int anInt8631 = 0;

	@OriginalMember(owner = "client!ai", name = "bg", descriptor = "F")
	public float aFloat187 = 1.0F;

	@OriginalMember(owner = "client!ai", name = "eg", descriptor = "Lclient!naa;")
	protected Class232 aClass232_6 = Static535.aClass232_7;

	@OriginalMember(owner = "client!ai", name = "cg", descriptor = "I")
	private int anInt8634 = 16777215;

	@OriginalMember(owner = "client!ai", name = "dg", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!ai", name = "xg", descriptor = "Lclient!wn;")
	private final Class239_Sub3 aClass239_Sub3_21 = new Class239_Sub3();

	@OriginalMember(owner = "client!ai", name = "uf", descriptor = "I")
	protected final int anInt8618;

	@OriginalMember(owner = "client!ai", name = "G", descriptor = "Lclient!aj;")
	protected final Class15 aClass15_132;

	@OriginalMember(owner = "client!ai", name = "Ub", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas11;

	@OriginalMember(owner = "client!ai", name = "ac", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!ai", name = "Gd", descriptor = "Ljava/lang/Object;")
	protected final Object anObject18;

	@OriginalMember(owner = "client!ai", name = "Id", descriptor = "Ljava/lang/Object;")
	private Object anObject19;

	@OriginalMember(owner = "client!ai", name = "Df", descriptor = "I")
	public final int anInt8623;

	@OriginalMember(owner = "client!ai", name = "Hb", descriptor = "I")
	private int anInt8479;

	@OriginalMember(owner = "client!ai", name = "jd", descriptor = "I")
	public int anInt8556;

	@OriginalMember(owner = "client!ai", name = "mc", descriptor = "I")
	private int anInt8508;

	@OriginalMember(owner = "client!ai", name = "vc", descriptor = "I")
	public int anInt8516;

	@OriginalMember(owner = "client!ai", name = "vf", descriptor = "Lclient!iha;")
	private final Class155 aClass155_3;

	@OriginalMember(owner = "client!ai", name = "sb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!aj;II)V")
	protected Class13_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class15 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anInt8618 = arg4;
			this.aClass15_132 = arg3;
			this.aCanvas12 = this.aCanvas11 = arg0;
			this.anObject19 = this.anObject18 = arg1;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt8623 = arg5;
			this.anInt8556 = this.anInt8479 = local307.height;
			this.anInt8516 = this.anInt8508 = local307.width;
			Static164.method2975(true, false);
			if (super.anInterface4_14 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt8623);
				this.aClass155_3 = null;
			} else {
				this.aClass155_3 = new Class155(this, super.anInterface4_14);
				this.aNativeInterface3 = new NativeInterface(super.anInterface4_14.method4674(), this.anInt8623);
				for (@Pc(352) int local352 = 0; super.anInterface4_14.method4674() > local352; local352++) {
					@Pc(360) Class119 local360 = super.anInterface4_14.method4673(local352);
					if (local360 != null) {
						this.aNativeInterface3.initTextureMetrics(local352, local360.aByte55, local360.aByte53);
					}
				}
			}
		} catch (@Pc(395) Throwable local395) {
			local395.printStackTrace();
			this.method8459();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!aga;)V")
	public abstract void method7408(@OriginalArg(1) Class10 arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method7409(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
	private void method7410() {
		if (this.aClass232_6 == Static361.aClass232_2) {
			return;
		}
		@Pc(14) Class232 local14 = this.aClass232_6;
		this.aClass232_6 = Static361.aClass232_2;
		if (!local14.method5542()) {
			this.method7523();
		}
		this.method7495();
		this.aFloatArray71 = this.aFloatArray73;
		this.method7507();
		this.anInt8630 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!eu;Z)Lclient!vr;")
	@Override
	public final Class33 method8465(@OriginalArg(0) Class97 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(135) Class33 local135;
		if (arg0.anInt2963 == 0 || arg0.anInt2960 == 0) {
			local135 = this.method8479(1, new int[1], 1, 1);
		} else {
			@Pc(24) int[] local24 = new int[arg0.anInt2960 * arg0.anInt2963];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(33) int local33;
			@Pc(37) int local37;
			if (arg0.aByteArray24 == null) {
				for (local33 = 0; local33 < arg0.anInt2960; local33++) {
					for (local37 = 0; local37 < arg0.anInt2963; local37++) {
						@Pc(95) int local95 = arg0.anIntArray260[arg0.aByteArray23[local26++] & 0xFF];
						local24[local28++] = local95 == 0 ? 0 : local95 | 0xFF000000;
					}
				}
			} else {
				for (local33 = 0; local33 < arg0.anInt2960; local33++) {
					for (local37 = 0; local37 < arg0.anInt2963; local37++) {
						local24[local28++] = arg0.aByteArray24[local26] << 24 | arg0.anIntArray260[arg0.aByteArray23[local26] & 0xFF];
						local26++;
					}
				}
			}
			local135 = this.method8479(arg0.anInt2963, local24, arg0.anInt2960, arg0.anInt2963);
		}
		local135.method7664(arg0.anInt2964, arg0.anInt2962, arg0.anInt2961, arg0.anInt2965);
		return local135;
	}

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "()Z")
	@Override
	public final boolean method8513() {
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[F)[F")
	public final float[] method7411(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloatArray71[0];
		arg0[8] = this.aFloatArray71[2];
		arg0[4] = this.aFloatArray71[1];
		arg0[12] = this.aFloatArray71[3];
		arg0[2] = this.aFloatArray71[8];
		arg0[1] = this.aFloatArray71[4];
		arg0[13] = this.aFloatArray71[7];
		arg0[5] = this.aFloatArray71[5];
		arg0[9] = this.aFloatArray71[6];
		arg0[3] = this.aFloatArray71[12];
		arg0[7] = this.aFloatArray71[13];
		arg0[10] = this.aFloatArray71[10];
		arg0[6] = this.aFloatArray71[9];
		arg0[14] = this.aFloatArray71[11];
		arg0[11] = this.aFloatArray71[14];
		arg0[15] = this.aFloatArray71[15];
		return arg0;
	}

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "(I)Lclient!wn;")
	public final Class239_Sub3 method7412() {
		return this.aClass239_Sub3_18;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!wn;)V")
	public final void method7413(@OriginalArg(1) Class239_Sub3 arg0) {
		this.aClass239_Sub3_15.method9247(arg0);
		this.aBoolean647 = false;
		this.method7533();
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)I")
	public final int method7414() {
		return this.anInt8617;
	}

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "(I)V")
	protected abstract void method7415();

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "()I")
	@Override
	public final int method8448() {
		return this.anInt8612 - 2;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method8463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!ai", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt8587 + this.anInt8588 + this.anInt8591;
	}

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "(I)V")
	protected abstract void method7416();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(FB)V")
	public final void method7417(@OriginalArg(0) float arg0) {
		if (this.aFloat178 != arg0) {
			this.aFloat178 = arg0;
			this.method7518();
		}
	}

	@OriginalMember(owner = "client!ai", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8523(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLclient!sw;II[BIII)Lclient!ec;")
	protected abstract Interface7 method7418(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)V")
	protected abstract void method7419();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
	@Override
	public final int method8478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(B)Lclient!wn;")
	public final Class239_Sub3 method7420() {
		return this.aClass239_Sub3Array3[this.anInt8601];
	}

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "(I)V")
	public final void method7421() {
		this.anInterface3Array3 = new Interface3[this.anInt8620];
		this.aClass94Array3 = new Class94[this.anInt8620];
		this.aClass203Array6 = new Class203[this.anInt8620];
		this.aClass203Array5 = new Class203[this.anInt8620];
		this.aClass239_Sub3Array3 = new Class239_Sub3[this.anInt8620];
		for (@Pc(32) int local32 = 0; local32 < this.anInt8620; local32++) {
			this.aClass203Array5[local32] = Static580.aClass203_4;
			this.aClass203Array6[local32] = Static580.aClass203_4;
			this.aClass94Array3[local32] = Static111.aClass94_3;
			this.aClass239_Sub3Array3[local32] = new Class239_Sub3();
		}
		this.aClass3_Sub15Array5 = new Class3_Sub15[this.anInt8612 - 2];
		this.anInterface3_3 = this.method7535(1, 1, Static246.aClass152_10, Static419.aClass327_2);
		this.method8446(new Class3_Sub5_Sub2(262144));
		this.aClass233_17 = this.method7427(new Class298[] { new Class298(new Class124[] { Static205.aClass124_1, Static205.aClass124_5 }) });
		this.aClass233_22 = this.method7427(new Class298[] { new Class298(new Class124[] { Static205.aClass124_1, Static205.aClass124_3 }) });
		this.aClass233_20 = this.method7427(new Class298[] { new Class298(Static205.aClass124_1), new Class298(Static205.aClass124_3), new Class298(Static205.aClass124_5), new Class298(Static205.aClass124_2) });
		this.aClass233_19 = this.method7427(new Class298[] { new Class298(Static205.aClass124_1), new Class298(Static205.aClass124_3), new Class298(Static205.aClass124_5) });
		this.aClass95_Sub2_28 = new Class95_Sub2(this, 0, 0, false, false);
		this.aClass95_Sub2_27 = new Class95_Sub2(this, 0, 0, true, true);
		this.aClass95_Sub2_26 = new Class95_Sub2(this, 0, 0, false, false);
		this.aClass95_Sub2_29 = new Class95_Sub2(this, 0, 0, true, true);
		this.aClass95_Sub2_21 = new Class95_Sub2(this, 0, 0, false, false);
		this.aClass95_Sub2_23 = new Class95_Sub2(this, 0, 0, true, true);
		this.aClass95_Sub2_24 = new Class95_Sub2(this, 0, 0, false, false);
		this.aClass95_Sub2_30 = new Class95_Sub2(this, 0, 0, true, true);
		this.aClass95_Sub2_25 = new Class95_Sub2(this, 0, 0, false, false);
		this.aClass95_Sub2_22 = new Class95_Sub2(this, 0, 0, true, true);
		this.aClass242_3 = new Class242(this);
		this.anInterface20_8 = this.method7435(true);
		this.method7528();
		this.aClass202_6 = new Class202(this);
		this.aClass4Array3[1] = this.method7540(1);
		this.aClass4Array3[2] = this.method7540(2);
		this.aClass4Array3[4] = this.method7540(4);
		this.aClass4Array3[5] = this.method7540(5);
		this.aClass4Array3[6] = this.method7540(6);
		this.aClass4Array3[7] = this.method7540(7);
		this.aClass4Array3[3] = this.method7540(3);
		this.aClass4Array3[8] = this.method7540(8);
		this.aClass4Array3[9] = this.method7540(9);
		if (!this.aClass4Array3[2].method7848()) {
			this.aClass4Array3[2] = this.method7540(0);
		}
		if (!this.aClass4Array3[4].method7848()) {
			this.aClass4Array3[4] = this.aClass4Array3[2];
		}
		if (!this.aClass4Array3[8].method7848()) {
			this.aClass4Array3[8] = this.aClass4Array3[4];
		}
		if (!this.aClass4Array3[9].method7848()) {
			this.aClass4Array3[9] = this.aClass4Array3[8];
		}
		this.method7442();
		this.la();
		this.method8480();
	}

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt8605;
		arg0[3] = this.anInt8622;
		arg0[1] = this.anInt8603;
		arg0[0] = this.anInt8599;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method8527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local9 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt((double) (local16 * local16 + local9 * local9));
			local18 = (float) Math.atan2((double) local16, (double) local9);
		}
		this.method7491();
		this.method7539(arg4);
		this.method7522(Static125.aClass326_1, 0);
		this.method7517(0, Static125.aClass326_1);
		this.method7440(0);
		this.aClass239_Sub3_15.method9260(local20, 1.0F, (float) arg5);
		this.aClass239_Sub3_15.method9244(0, -arg5 / 2, 0);
		this.aClass239_Sub3_15.method9246((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass239_Sub3_15.method9244(arg0, arg1, 0);
		this.method7515();
		this.method7531(false);
		this.method7481();
		this.method7531(true);
		this.method7517(0, Static523.aClass326_5);
		this.method7522(Static523.aClass326_5, 0);
	}

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "(I)V")
	protected abstract void method7422();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!id;II)V")
	public abstract void method7423(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!oh;IIZLclient!wt;)V")
	public abstract void method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class393 arg5);

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8468(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas11 == arg0) {
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
			@Pc(53) Object local53 = this.method7538(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!sw;ILclient!ig;)Z")
	public abstract boolean method7425(@OriginalArg(0) Class327 arg0, @OriginalArg(2) Class152 arg1);

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "(I)V")
	private void method7426() {
		this.method7423(this.anInterface15_18, 0);
		this.method7472(this.aClass233_18);
		this.method7449(Static318.aClass393_2, 1, 0);
	}

	@OriginalMember(owner = "client!ai", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean648) {
			throw new RuntimeException("");
		}
		this.anInt8617 = arg2;
		this.anInt8602 = arg1;
		this.anInt8624 = arg3;
		this.anInt8607 = arg0;
		if (this.aBoolean656) {
			this.aClass4Array3[3].method7854();
			this.aClass4Array3[3].method7853();
		}
	}

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "()Z")
	@Override
	public final boolean method8474() {
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
	@Override
	public final void method8505(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([Lclient!rd;B)Lclient!nc;")
	public abstract Class233 method7427(@OriginalArg(0) Class298[] arg0);

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)Lclient!za;")
	@Override
	public final Class3_Sub5 method8469(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub5_Sub2 local8 = new Class3_Sub5_Sub2(arg0);
		this.aClass338_198.method8171(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "(I)V")
	protected abstract void method7428();

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(B)I")
	public final int method7429() {
		return this.anInt8624;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method7430(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt8608;
	}

	@OriginalMember(owner = "client!ai", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass239_Sub3_16.method9257((float) arg1, (float) arg0, (float) arg2);
		@Pc(25) int local25;
		@Pc(28) int local28;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local25 = (int) ((float) this.anInt8609 * this.aClass239_Sub3_16.method9253((float) arg0, (float) arg1, (float) arg2) / local14);
			local28 = (int) ((float) this.anInt8632 * this.aClass239_Sub3_16.method9272((float) arg2, (float) arg1, (float) arg0) / local14);
		} else {
			local25 = this.anInt8606;
			local28 = this.anInt8611;
		}
		arg3[1] = (int) ((float) local28 - this.aFloat184);
		arg3[0] = (int) ((float) local25 - this.aFloat173);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIF)Lclient!uca;")
	@Override
	public final Class3_Sub15 method8504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub15_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "(I)Lclient!wn;")
	public final Class239_Sub3 method7431() {
		if (!this.aBoolean665) {
			this.aClass239_Sub3_20.method9261(this.aClass239_Sub3_18, this.aClass239_Sub3_15);
			this.aBoolean665 = true;
		}
		return this.aClass239_Sub3_20;
	}

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "(I)V")
	protected abstract void method7432();

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(Z)V")
	protected void method7433() {
		this.anInt8615 = this.anInt8633;
		this.anInt8633 = 0;
	}

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "(I)V")
	private void method7434() {
		this.aBoolean659 = false;
		this.method7477();
		if (this.aClass232_6 == Static394.aClass232_3) {
			this.method7507();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method8446(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aNativeHeap5 = ((Class3_Sub5_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer7 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)Lclient!oh;")
	public abstract Interface20 method7435(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ai", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt8634 != arg0;
		if (local11 || this.aFloat183 != arg1 || this.aFloat179 != arg2) {
			this.anInt8634 = arg0;
			this.aFloat179 = arg2;
			this.aFloat183 = arg1;
			if (local11) {
				this.aFloat176 = (float) (this.anInt8634 & 0xFF0000) / 1.671168E7F;
				this.aFloat181 = (float) (this.anInt8634 & 0xFF) / 255.0F;
				this.aFloat187 = (float) (this.anInt8634 & 0xFF00) / 65280.0F;
				this.method7503();
			}
			this.aNativeInterface3.setSunColour(this.aFloat176, this.aFloat187, this.aFloat181, arg1, arg2);
			this.method7494();
		}
		if (arg3 != this.aFloatArray65[0] || arg4 != this.aFloatArray65[1] || this.aFloatArray65[2] != arg5) {
			this.aFloatArray65[1] = arg4;
			this.aFloatArray65[0] = arg3;
			this.aFloatArray65[2] = arg5;
			this.aFloatArray68[0] = -arg3;
			this.aFloatArray68[2] = -arg5;
			this.aFloatArray68[1] = -arg4;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray72[2] = arg5 * local149;
			this.aFloatArray72[1] = arg4 * local149;
			this.aFloatArray72[0] = arg3 * local149;
			this.aFloatArray70[1] = -this.aFloatArray72[1];
			this.aFloatArray70[2] = -this.aFloatArray72[2];
			this.aFloatArray70[0] = -this.aFloatArray72[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray72[0], this.aFloatArray72[1], this.aFloatArray72[2]);
			this.method7490();
			this.anInt8596 = (int) (arg5 * 256.0F / arg4);
			this.anInt8597 = (int) (arg3 * 256.0F / arg4);
		}
		this.method7428();
	}

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "(I)V")
	protected abstract void method7436();

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "(I)Lclient!wn;")
	public final Class239_Sub3 method7437() {
		return this.aClass239_Sub3_19;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8450(@OriginalArg(0) Canvas arg0) {
		this.anObject19 = null;
		this.aCanvas12 = null;
		if (arg0 == null || this.aCanvas11 == arg0) {
			this.aCanvas12 = this.aCanvas11;
			this.anObject19 = this.anObject18;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject19 = this.aHashtable5.get(arg0);
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.anObject19 == null) {
			throw new RuntimeException();
		}
		this.method7463(this.aCanvas12, this.anObject19);
		this.method7454();
	}

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "(I)V")
	protected abstract void method7438();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ef;I)V")
	@Override
	public final void method8506(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass242_3.method5814(arg1, arg0, this);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZZII)V")
	private void method7439(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) boolean local8 = arg1 & this.method8507();
		if (!local8 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			arg4 = 2;
			arg3 = 1;
			arg0 = 0;
		}
		if (arg4 != 0 && arg2) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (this.anInt8629 != arg4) {
			if (this.anInt8629 != 0) {
				this.aClass4Array3[Integer.MAX_VALUE & this.anInt8629].method7858();
			}
			if (arg4 == 0) {
				this.aClass4_3 = null;
			} else {
				this.aClass4_3 = this.aClass4Array3[arg4 & Integer.MAX_VALUE];
				this.aClass4_3.method7856(arg2);
				this.aClass4_3.method7852(arg2);
				this.aClass4_3.method7849(arg0, arg3);
			}
			this.anInt8610 = arg3;
			this.anInt8614 = arg0;
			this.anInt8629 = arg4;
		} else if (this.anInt8629 != 0) {
			this.aClass4Array3[Integer.MAX_VALUE & this.anInt8629].method7852(arg2);
			if (arg0 != this.anInt8614 || this.anInt8610 != arg3) {
				this.aClass4Array3[this.anInt8629 & Integer.MAX_VALUE].method7849(arg0, arg3);
				this.anInt8614 = arg0;
				this.anInt8610 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "()Z")
	@Override
	public final boolean method8497() {
		return false;
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(II)V")
	public final void method7440(@OriginalArg(1) int arg0) {
		if (this.anInt8619 == arg0) {
			return;
		}
		@Pc(17) Class99 local17;
		@Pc(15) boolean local15;
		@Pc(19) boolean local19;
		if (arg0 == 1) {
			local17 = Static581.aClass99_7;
			local19 = true;
			local15 = true;
		} else if (arg0 == 2) {
			local15 = true;
			local17 = Static583.aClass99_9;
			local19 = false;
		} else if (arg0 == 128) {
			local17 = Static356.aClass99_2;
			local15 = true;
			local19 = true;
		} else {
			local19 = false;
			local15 = false;
			local17 = Static474.aClass99_6;
		}
		if (local19 != this.aBoolean653) {
			this.aBoolean653 = local19;
			this.method7436();
		}
		if (this.aBoolean661 != local15) {
			this.aBoolean661 = local15;
			this.method7432();
		}
		if (this.aClass99_8 != local17) {
			this.aClass99_8 = local17;
			this.method7468();
		}
		this.anInt8619 = arg0;
		this.anInt8630 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "(I)V")
	protected abstract void method7441();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method8486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(18) float local18 = (float) -arg1 + (float) arg3;
		@Pc(43) float local43;
		if (local11 == 0.0F && local18 == 0.0F) {
			local11 = 1.0F;
		} else {
			local43 = (float) (1.0D / Math.sqrt((double) (local11 * local11 + local18 * local18)));
			local11 *= local43;
			local18 *= local43;
		}
		this.method7491();
		this.method7539(arg4);
		this.method7522(Static125.aClass326_1, 0);
		this.method7517(0, Static125.aClass326_1);
		this.method7440(1);
		this.method7459();
		@Pc(81) int local81 = arg7 % (arg5 + arg6);
		this.method7531(false);
		local43 = (float) arg5 * local11;
		@Pc(95) float local95 = (float) arg5 * local18;
		@Pc(97) float local97 = 0.0F;
		@Pc(99) float local99 = 0.0F;
		@Pc(101) float local101 = local43;
		@Pc(103) float local103 = local95;
		if (local81 > arg5) {
			local99 = (float) (arg5 + arg6 - local81) * local18;
			local97 = local11 * (float) (arg6 + arg5 - local81);
		} else {
			local103 = (float) (arg5 - local81) * local18;
			local101 = (float) (arg5 - local81) * local11;
		}
		@Pc(148) float local148 = local97 + (float) arg0;
		@Pc(153) float local153 = (float) arg1 + local99;
		@Pc(158) float local158 = local11 * (float) arg6;
		@Pc(163) float local163 = local18 * (float) arg6;
		while (true) {
			if (arg2 <= arg0) {
				if (local148 < (float) arg2) {
					break;
				}
				if ((float) arg2 > local101 + local148) {
					local101 = (float) arg2 - local148;
				}
			} else {
				if (local148 > (float) arg2) {
					break;
				}
				if (local148 + local101 > (float) arg2) {
					local101 = (float) arg2 - local148;
				}
			}
			if (arg1 >= arg3) {
				if (local153 < (float) arg3) {
					break;
				}
				if (local153 + local103 < (float) arg3) {
					local103 = (float) arg3 - local153;
				}
			} else {
				if (local153 > (float) arg3) {
					break;
				}
				if (local153 + local103 > (float) arg3) {
					local103 = (float) arg3 - local153;
				}
			}
			if (!this.method7486(local148, local153, 0.0F, local148 + local101, local103 + local153, 0.0F)) {
				return;
			}
			local153 += local103 + local163;
			local148 += local158 + local101;
			this.method7426();
			local103 = local95;
			local101 = local43;
		}
		this.method7531(true);
		this.method7517(0, Static523.aClass326_5);
		this.method7522(Static523.aClass326_5, 0);
	}

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "(I)V")
	protected void method7442() {
		this.method7542();
	}

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "()Z")
	@Override
	public final boolean method8507() {
		return this.aClass4Array3[3].method7848();
	}

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "(B)V")
	protected abstract void method7443();

	@OriginalMember(owner = "client!ai", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt8595 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt8595++;
		}
		this.anInt8626 = 0x1 << this.anInt8595;
	}

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "(I)V")
	public final void method7444() {
		this.method7500();
		this.method7507();
	}

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "(I)V")
	protected abstract void method7445();

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V")
	@Override
	public final void method8485(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass155_3 != null) {
			this.aClass155_3.method4119();
		}
		this.anInt8604 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)V")
	@Override
	public void method8516(@OriginalArg(0) int arg0) {
		if (this.aClass155_3 != null) {
			this.aClass155_3.method4116();
		}
		this.anInt8613 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([BIIBZLclient!sw;)Lclient!ec;")
	public final Interface7 method7446(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class327 arg4) {
		return this.method7418(arg3, arg4, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ai", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass239_Sub3_16.method9257((float) arg1, (float) arg0, (float) arg2);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt8609 * this.aClass239_Sub3_16.method9253((float) arg0, (float) arg1, (float) arg2) / local14);
			local25 = (int) ((float) this.anInt8632 * this.aClass239_Sub3_16.method9272((float) arg2, (float) arg1, (float) arg0) / local14);
		} else {
			local25 = this.anInt8611;
			local28 = this.anInt8606;
		}
		arg3[1] = (int) ((float) local25 - this.aFloat184);
		arg3[0] = (int) ((float) local28 - this.aFloat173);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!sw;III[BI)Lclient!oo;")
	public abstract Interface21 method7447(@OriginalArg(0) Class327 arg0, @OriginalArg(4) byte[] arg1);

	@OriginalMember(owner = "client!ai", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7491();
		this.method7539(arg4);
		this.method7522(Static125.aClass326_1, 0);
		this.method7517(0, Static125.aClass326_1);
		this.method7440(arg5);
		this.aClass239_Sub3_15.method9260((float) arg2, 1.0F, (float) arg3);
		this.aClass239_Sub3_15.method9244(arg0, arg1, 0);
		this.method7515();
		this.method7531(false);
		this.method7481();
		this.method7531(true);
		this.method7517(0, Static523.aClass326_5);
		this.method7522(Static523.aClass326_5, 0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!sw;Lclient!ig;Z)Z")
	public abstract boolean method7448(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class152 arg1);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!wt;IIB)V")
	public abstract void method7449(@OriginalArg(0) Class393 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "(I)V")
	protected abstract void method7450();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!wt;)V")
	private void method7451(@OriginalArg(1) int arg0, @OriginalArg(2) Class393 arg1) {
		this.method7423(this.anInterface15_17, 0);
		this.method7472(this.aClass233_23);
		this.method7449(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(Z)V")
	private void method7452() {
		if (Static403.aClass232_4 == this.aClass232_6) {
			return;
		}
		@Pc(6) Class232 local6 = this.aClass232_6;
		this.aClass232_6 = Static403.aClass232_4;
		if (local6.method5542()) {
			this.method7523();
		}
		this.method7501();
		this.aFloatArray71 = this.aFloatArray66;
		this.method7507();
		this.anInt8630 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "(B)V")
	protected final void method7453() {
		@Pc(9) Enumeration local9 = this.aHashtable5.keys();
		while (local9.hasMoreElements()) {
			@Pc(23) Canvas local23 = (Canvas) local9.nextElement();
			this.method7430(local23, this.aHashtable5.get(local23));
		}
		this.anInterface15_17.method8737();
		this.anInterface15_18.method8737();
		this.anInterface15_16.method8737();
		this.aClass95_Sub2_27.method4767();
		this.aClass95_Sub2_29.method4767();
		this.aClass95_Sub2_23.method4767();
		this.aClass95_Sub2_30.method4767();
		this.aClass95_Sub2_22.method4767();
		this.aClass242_3.method5811();
		this.anInterface20_8.method8737();
	}

	@OriginalMember(owner = "client!ai", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8602 = arg1;
		this.anInt8607 = arg0;
		this.anInt8617 = arg2;
		this.aBoolean648 = true;
		this.anInt8624 = arg3;
	}

	@OriginalMember(owner = "client!ai", name = "A", descriptor = "(I)V")
	private void method7454() {
		if (this.aCanvas12 == null) {
			this.anInt8508 = this.anInt8479 = 1;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas12.getSize();
			this.anInt8508 = local10.width;
			this.anInt8479 = local10.height;
		}
		this.anInt8556 = this.anInt8479;
		this.anInt8516 = this.anInt8508;
		this.method7520();
		this.method7434();
		this.method7518();
		this.method7502();
		this.method7514();
		this.method7500();
		this.la();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class21 method8517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class21_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ai", name = "B", descriptor = "(I)V")
	private void method7455() {
		this.anInterface15_17 = this.method7541(false);
		this.anInterface15_17.method8746(140, 28);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface15_17.method8744();
			if (local28 != null) {
				@Pc(37) Stream local37 = this.method7409(local28);
				if (Stream.c()) {
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(1.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
					local37.b(0.0F);
				} else {
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(1.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
					local37.a(0.0F);
				}
				local37.a();
				if (this.anInterface15_17.method8747()) {
					break;
				}
			}
		}
		this.aClass233_23 = this.method7427(new Class298[] { new Class298(new Class124[] { Static205.aClass124_1, Static205.aClass124_5, Static205.aClass124_5 }) });
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8464(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas11) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method7430(arg0, this.aHashtable5.get(arg0));
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[FLclient!sw;IIIIZ)Lclient!ec;")
	protected abstract Interface7 method7456(@OriginalArg(1) float[] arg0, @OriginalArg(2) Class327 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) boolean arg4);

	@OriginalMember(owner = "client!ai", name = "C", descriptor = "(I)F")
	protected abstract float method7458();

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "(B)V")
	public final void method7459() {
		this.aClass239_Sub3_15.method9249();
		this.aBoolean647 = true;
		this.method7533();
	}

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "(B)V")
	protected abstract void method7460();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)V")
	public final void method7461(@OriginalArg(1) int arg0) {
		if (this.anInt8601 != arg0) {
			this.anInt8601 = arg0;
			this.method7460();
		}
	}

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "(B)V")
	protected abstract void method7462();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	protected abstract void method7463(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!eo;)V")
	public final void method7464(@OriginalArg(1) Class94 arg0) {
		this.aClass94Array3[this.anInt8601] = arg0;
		this.method7479();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ef;)V")
	@Override
	public final void method8499(@OriginalArg(0) Class84 arg0) {
		this.aClass242_3.method5814(-1, arg0, this);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BZ)V")
	public final void method7465(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean664 != arg0) {
			this.aBoolean664 = arg0;
			this.method7524();
			this.anInt8630 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method7466(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap5.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(Z)I")
	public final int method7467() {
		return this.anInt8602;
	}

	@OriginalMember(owner = "client!ai", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean648 = false;
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "()Lclient!uu;")
	@Override
	public final Class239 method8461() {
		return new Class239_Sub3();
	}

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "(B)V")
	protected abstract void method7468();

	@OriginalMember(owner = "client!ai", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7491();
		this.method7539(arg3);
		this.method7522(Static125.aClass326_1, 0);
		this.method7517(0, Static125.aClass326_1);
		this.method7440(arg4);
		this.aClass239_Sub3_15.method9260((float) arg2, 1.0F, (float) arg2);
		this.aClass239_Sub3_15.method9244(arg0, arg1, 0);
		this.method7515();
		this.method7531(false);
		this.method7423(this.anInterface15_16, 0);
		this.method7472(this.aClass233_21);
		this.method7449(Static668.aClass393_6, 256, 0);
		this.method7531(true);
		this.method7517(0, Static523.aClass326_5);
		this.method7522(Static523.aClass326_5, 0);
	}

	@OriginalMember(owner = "client!ai", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat172 != arg0) {
			this.aFloat172 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method7503();
			this.method7428();
		}
	}

	@OriginalMember(owner = "client!ai", name = "D", descriptor = "(I)[F")
	public final float[] method7469() {
		return this.aFloatArray69;
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(Z)V")
	protected abstract void method7470();

	@OriginalMember(owner = "client!ai", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt8600;
	}

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "()Z")
	@Override
	public final boolean method8508() {
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "(B)V")
	protected abstract void method7471();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!nc;B)V")
	public abstract void method7472(@OriginalArg(0) Class233 arg0);

	@OriginalMember(owner = "client!ai", name = "E", descriptor = "(I)I")
	public final int method7473() {
		return this.anInt8601;
	}

	@OriginalMember(owner = "client!ai", name = "F", descriptor = "(I)V")
	private void method7474() {
		this.anInterface15_16 = this.method7541(false);
		this.anInterface15_16.method8746(3096, 12);
		for (@Pc(30) int local30 = 0; local30 < 4; local30++) {
			@Pc(38) Buffer local38 = this.anInterface15_16.method8744();
			if (local38 != null) {
				@Pc(47) Stream local47 = this.method7409(local38);
				local47.b(0.0F);
				local47.b(0.0F);
				local47.b(0.0F);
				for (@Pc(58) int local58 = 0; local58 <= 256; local58++) {
					@Pc(69) double local69 = (double) (local58 * 2) * 3.141592653589793D / 256.0D;
					@Pc(73) float local73 = (float) Math.cos(local69);
					@Pc(77) float local77 = (float) Math.sin(local69);
					if (Stream.c()) {
						local47.b(local77);
						local47.b(local73);
						local47.b(0.0F);
					} else {
						local47.a(local77);
						local47.a(local73);
						local47.a(0.0F);
					}
				}
				local47.a();
				if (this.anInterface15_16.method8747()) {
					break;
				}
			}
		}
		this.aClass233_21 = this.method7427(new Class298[] { new Class298(Static205.aClass124_1) });
	}

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8523(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ss;ZZI)V")
	protected abstract void method7475(@OriginalArg(0) Class326 arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!ai", name = "G", descriptor = "(I)V")
	public final void method7476() {
		if (this.anInt8630 == 2) {
			return;
		}
		this.method7452();
		this.method7536(false);
		this.method7465(false);
		this.method7482(false);
		this.method7505(false);
		this.method7508(false, -2, false);
		this.anInt8630 = 2;
	}

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)V")
	@Override
	public final void method8521(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method8523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		if (local10 == 0.0F && local17 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(42) float local42 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
			local17 *= local42;
			local10 *= local42;
		}
		if (!this.method7486((float) arg0, (float) arg1, 0.0F, local10 + (float) arg2, (float) arg3 + local17, 0.0F)) {
			return;
		}
		this.method7491();
		this.method7539(arg4);
		this.method7522(Static125.aClass326_1, 0);
		this.method7517(0, Static125.aClass326_1);
		this.method7440(arg5);
		this.method7459();
		this.method7531(false);
		this.method7426();
		this.method7531(true);
		this.method7517(0, Static523.aClass326_5);
		this.method7522(Static523.aClass326_5, 0);
	}

	@OriginalMember(owner = "client!ai", name = "H", descriptor = "(I)V")
	private void method7477() {
		if (this.aBoolean659) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray67;
		@Pc(17) float local17 = (float) (-this.anInt8606 * this.anInt8608) / (float) this.anInt8609;
		@Pc(31) float local31 = (float) ((this.anInt8516 - this.anInt8606) * this.anInt8608) / (float) this.anInt8609;
		@Pc(42) float local42 = (float) (this.anInt8608 * this.anInt8611) / (float) this.anInt8632;
		@Pc(57) float local57 = (float) (this.anInt8608 * (this.anInt8611 - this.anInt8556)) / (float) this.anInt8632;
		if (local31 == local17 || local57 == local42) {
			local5[8] = 0.0F;
			local5[11] = 0.0F;
			local5[6] = 0.0F;
			local5[3] = 0.0F;
			local5[5] = 1.0F;
			local5[10] = 1.0F;
			local5[2] = 0.0F;
			local5[0] = 1.0F;
			local5[1] = 0.0F;
			local5[12] = 0.0F;
			local5[14] = 0.0F;
			local5[15] = 1.0F;
			local5[9] = 0.0F;
			local5[13] = 0.0F;
			local5[4] = 0.0F;
			local5[7] = 0.0F;
		} else {
			@Pc(71) float local71 = (float) this.anInt8608 * 2.0F;
			local5[9] = (local42 + local57) / (-local57 + local42);
			local5[0] = local71 / (local31 - local17);
			local5[4] = 0.0F;
			local5[8] = (local17 + local31) / (-local17 + local31);
			local5[7] = 0.0F;
			local5[6] = 0.0F;
			local5[10] = this.aFloat180 = (float) this.anInt8600 / (float) (this.anInt8608 - this.anInt8600);
			local5[5] = local71 / (local42 - local57);
			local5[15] = 0.0F;
			local5[1] = 0.0F;
			local5[11] = -1.0F;
			local5[12] = 0.0F;
			local5[2] = 0.0F;
			local5[14] = this.aFloat186 = (float) (this.anInt8600 * this.anInt8608) / (float) (this.anInt8608 - this.anInt8600);
			local5[3] = 0.0F;
			local5[13] = 0.0F;
		}
		this.method7504();
		this.aBoolean659 = true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([IIIIIZ)Lclient!vr;")
	@Override
	public final Class33 method8514(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class33_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method8511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method7458();
		this.method7491();
		this.method7539(arg4);
		this.method7522(Static125.aClass326_1, 0);
		this.method7517(0, Static125.aClass326_1);
		this.method7440(arg5);
		this.aClass239_Sub3_15.method9260((float) (arg2 - 1), 1.0F, (float) (arg3 - 1));
		this.aClass239_Sub3_15.method9271(0.0F, (float) arg1 - local7, -local7 + (float) arg0);
		this.method7515();
		this.method7531(false);
		this.method7451(4, Static406.aClass393_3);
		this.method7531(true);
		this.method7517(0, Static523.aClass326_5);
		this.method7522(Static523.aClass326_5, 0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIILclient!sw;[FZ)Lclient!ec;")
	public final Interface7 method7478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class327 arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) boolean arg4) {
		return this.method7456(arg3, arg2, arg1, arg0, arg4);
	}

	@OriginalMember(owner = "client!ai", name = "I", descriptor = "(I)V")
	private void method7479() {
		this.method7419();
		if (this.aClass4_3 != null) {
			this.aClass4_3.method7851();
		}
	}

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "(B)Lclient!wn;")
	public final Class239_Sub3 method7480() {
		return this.aClass239_Sub3_15;
	}

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "()Lclient!uu;")
	@Override
	public final Class239 method8528() {
		return this.aClass239_Sub3_16;
	}

	@OriginalMember(owner = "client!ai", name = "J", descriptor = "(I)V")
	public final void method7481() {
		this.method7451(2, Static668.aClass393_6);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!dn;)V")
	@Override
	public final void method8462(@OriginalArg(0) Class35 arg0) {
		this.aClass35_Sub1_3 = (Class35_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V")
	@Override
	public final void method8475(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IZ)V")
	public final void method7482(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean652) {
			this.aBoolean652 = arg0;
			this.method7470();
			this.anInt8630 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!eia;[Lclient!eu;Z)Lclient!da;")
	@Override
	public final Class69 method8515(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class97[] arg1) {
		return new Class69_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BB)V")
	public final void method7483(@OriginalArg(0) byte arg0) {
		this.method7539(arg0 << 8 | arg0 << 24 | arg0 << 16 | arg0);
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(IZ)V")
	public final void method7484(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean649) {
			this.aBoolean649 = arg0;
			this.method7471();
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(BZ)V")
	public final void method7485(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean662) {
			this.aBoolean662 = arg0;
			this.method7524();
		}
	}

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "()Z")
	@Override
	public final boolean method8481() {
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(FFIFFFF)Z")
	private boolean method7486(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface15_18.method8744();
		if (local9 == null) {
			return false;
		}
		@Pc(25) Stream local25 = this.method7409(local9);
		if (Stream.c()) {
			local25.b(arg0);
			local25.b(arg1);
			local25.b(arg2);
			local25.b(arg3);
			local25.b(arg4);
			local25.b(arg5);
		} else {
			local25.a(arg0);
			local25.a(arg1);
			local25.a(arg2);
			local25.a(arg3);
			local25.a(arg4);
			local25.a(arg5);
		}
		local25.a();
		return this.anInterface15_18.method8747();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method8510() {
	}

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "()Z")
	@Override
	public final boolean method8492() {
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)V")
	public final void method7487(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean651 != arg0) {
			this.aBoolean651 = arg0;
			this.method7415();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method7488(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8445(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas11) {
			local5 = this.anObject19;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method7488(arg0, local5);
		if (this.aCanvas12 == arg0) {
			this.method7454();
		}
	}

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "(I)V")
	public final void method7489() {
		if (this.anInt8630 == 4) {
			return;
		}
		this.method7452();
		this.method7536(false);
		this.method7465(false);
		this.method7482(false);
		this.method7505(false);
		this.method7508(false, -2, false);
		this.method7440(1);
		this.method7509(0);
		this.anInt8630 = 4;
	}

	@OriginalMember(owner = "client!ai", name = "L", descriptor = "(I)V")
	public abstract void method7490();

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "(I)V")
	private void method7491() {
		if (this.anInt8630 == 1) {
			return;
		}
		this.method7452();
		this.method7536(false);
		this.method7465(false);
		this.method7482(false);
		this.method7505(false);
		this.method7508(false, -2, false);
		this.method7509(1);
		this.method7530(this.anInterface3_3);
		this.anInt8630 = 1;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)Lclient!oh;")
	public final Interface20 method7492(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface20_8.method8734()) {
			this.anInterface20_8.method8740(arg0);
		}
		return this.anInterface20_8;
	}

	@OriginalMember(owner = "client!ai", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass239_Sub3_16.method9257((float) arg1, (float) arg0, (float) arg2);
		if (local14 < (float) this.anInt8608 || (float) this.anInt8600 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt8609 * this.aClass239_Sub3_16.method9253((float) arg0, (float) arg1, (float) arg2) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt8632 * this.aClass239_Sub3_16.method9272((float) arg2, (float) arg1, (float) arg0) / (float) arg3);
		arg4[2] = (int) local14;
		arg4[0] = (int) ((float) local58 - this.aFloat173);
		arg4[1] = (int) ((float) local77 - this.aFloat184);
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(Z)V")
	public final void method7493() {
		if (this.anInt8630 == 8) {
			return;
		}
		this.method7511();
		this.method7536(true);
		this.method7482(true);
		this.method7505(true);
		this.method7440(1);
		this.anInt8630 = 8;
	}

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "(B)V")
	protected abstract void method7494();

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "(Z)V")
	private void method7495() {
		if (this.aBoolean657) {
			return;
		}
		@Pc(16) float[] local16 = this.aFloatArray73;
		@Pc(20) float local20 = (float) this.anInt8608;
		@Pc(24) float local24 = (float) this.anInt8600;
		@Pc(36) float local36 = this.aFloat178 * (float) -this.anInt8611 / (float) this.anInt8632;
		@Pc(48) float local48 = (float) -this.anInt8606 * this.aFloat178 / (float) this.anInt8609;
		@Pc(63) float local63 = this.aFloat178 * (float) (this.anInt8516 - this.anInt8606) / (float) this.anInt8609;
		@Pc(78) float local78 = this.aFloat178 * (float) (this.anInt8556 - this.anInt8611) / (float) this.anInt8632;
		if (local48 == local63 || local78 == local36) {
			local16[15] = 1.0F;
			local16[1] = 0.0F;
			local16[0] = 1.0F;
			local16[13] = 0.0F;
			local16[11] = 0.0F;
			local16[5] = 1.0F;
			local16[10] = 1.0F;
			local16[2] = 0.0F;
			local16[7] = 0.0F;
			local16[3] = 0.0F;
			local16[6] = 0.0F;
			local16[8] = 0.0F;
			local16[9] = 0.0F;
			local16[4] = 0.0F;
			local16[12] = 0.0F;
			local16[14] = 0.0F;
		} else {
			local16[12] = (local48 + local63) / (local48 - local63);
			local16[14] = local20 / (local20 - local24);
			local16[5] = 2.0F / (local78 - local36);
			local16[15] = 1.0F;
			local16[10] = 1.0F / (local20 - local24);
			local16[6] = 0.0F;
			local16[8] = 0.0F;
			local16[7] = 0.0F;
			local16[2] = 0.0F;
			local16[1] = 0.0F;
			local16[4] = 0.0F;
			local16[9] = 0.0F;
			local16[0] = 2.0F / (local63 - local48);
			local16[13] = (local78 + local36) / (local78 - local36);
			local16[3] = 0.0F;
			local16[11] = 0.0F;
		}
		this.method7534();
		this.aBoolean657 = true;
	}

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "(I)V")
	private void method7496() {
		this.anInterface15_18 = this.method7541(true);
		this.anInterface15_18.method8746(24, 12);
		this.aClass233_18 = this.method7427(new Class298[] { new Class298(Static205.aClass124_1) });
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZZBILclient!ss;)V")
	public abstract void method7498(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class326 arg3);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[IIIZII)Lclient!ec;")
	public abstract Interface7 method7499(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "(Z)V")
	public final void method7500() {
		if (this.aClass232_6 == Static535.aClass232_7) {
			return;
		}
		@Pc(14) Class232 local14 = this.aClass232_6;
		this.aClass232_6 = Static535.aClass232_7;
		if (local14.method5542()) {
			this.method7523();
		}
		this.aFloatArray71 = this.aFloatArray69;
		this.anInt8630 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ai", name = "O", descriptor = "(I)V")
	private void method7501() {
		if (this.aBoolean667) {
			return;
		}
		@Pc(15) float[] local15 = this.aFloatArray66;
		this.aBoolean667 = true;
		if (this.anInt8516 != 0 && this.anInt8556 != 0) {
			local15[12] = -1.0F;
			local15[13] = 1.0F;
			local15[4] = 0.0F;
			local15[8] = 0.0F;
			local15[10] = 0.5F;
			local15[6] = 0.0F;
			local15[15] = 1.0F;
			local15[7] = 0.0F;
			local15[5] = -2.0F / (float) this.anInt8556;
			local15[14] = 0.5F;
			local15[1] = 0.0F;
			local15[11] = 0.0F;
			local15[0] = 2.0F / (float) this.anInt8516;
			local15[2] = 0.0F;
			local15[9] = 0.0F;
			local15[3] = 0.0F;
			return;
		}
		local15[5] = 1.0F;
		local15[1] = 0.0F;
		local15[4] = 0.0F;
		local15[10] = 1.0F;
		local15[15] = 1.0F;
		local15[13] = 0.0F;
		local15[6] = 0.0F;
		local15[3] = 0.0F;
		local15[12] = 0.0F;
		local15[14] = 0.0F;
		local15[0] = 1.0F;
		local15[9] = 0.0F;
		local15[7] = 0.0F;
		local15[2] = 0.0F;
		local15[8] = 0.0F;
		local15[11] = 0.0F;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([I)V")
	@Override
	public final void method8525(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt8556;
		arg0[0] = this.anInt8516;
	}

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "(B)V")
	protected abstract void method7502();

	@OriginalMember(owner = "client!ai", name = "P", descriptor = "(I)V")
	protected abstract void method7503();

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "(I)V")
	private void method7504() {
		this.aFloatArray67[14] = this.aFloat186;
		this.aFloatArray67[10] = this.aFloat180;
		this.aFloat182 = (this.aFloatArray67[14] - (float) this.anInt8600) / this.aFloatArray67[10];
	}

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass239_Sub3_16.aFloat224 * (float) arg1 + (float) arg0 * this.aClass239_Sub3_16.aFloat222 + (float) arg2 * this.aClass239_Sub3_16.aFloat221 + this.aClass239_Sub3_16.aFloat220;
		@Pc(57) float local57 = this.aClass239_Sub3_16.aFloat220 + (float) arg4 * this.aClass239_Sub3_16.aFloat224 + (float) arg3 * this.aClass239_Sub3_16.aFloat222 + (float) arg5 * this.aClass239_Sub3_16.aFloat221;
		if (local32 < (float) this.anInt8608 && (float) this.anInt8608 > local57) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt8600 && local57 > (float) this.anInt8600) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass239_Sub3_16.aFloat218 + this.aClass239_Sub3_16.aFloat225 * (float) arg2 + this.aClass239_Sub3_16.aFloat219 * (float) arg0 + this.aClass239_Sub3_16.aFloat216 * (float) arg1) * (float) this.anInt8609 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt8609 * (this.aClass239_Sub3_16.aFloat218 + (float) arg5 * this.aClass239_Sub3_16.aFloat225 + (float) arg4 * this.aClass239_Sub3_16.aFloat216 + this.aClass239_Sub3_16.aFloat219 * (float) arg3) / (float) arg6);
		if ((float) local124 < this.aFloat173 && (float) local157 < this.aFloat173) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat177 && this.aFloat177 < (float) local157) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass239_Sub3_16.aFloat223 * (float) arg0 + this.aClass239_Sub3_16.aFloat214 * (float) arg1 + (float) arg2 * this.aClass239_Sub3_16.aFloat215 + this.aClass239_Sub3_16.aFloat217) * (float) this.anInt8632 / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt8632 * (this.aClass239_Sub3_16.aFloat217 + this.aClass239_Sub3_16.aFloat223 * (float) arg3 + (float) arg4 * this.aClass239_Sub3_16.aFloat214 + (float) arg5 * this.aClass239_Sub3_16.aFloat215) / (float) arg6);
		if ((float) local224 < this.aFloat184 && (float) local257 < this.aFloat184) {
			local7 |= 0x4;
		} else if (this.aFloat185 < (float) local224 && (float) local257 > this.aFloat185) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(BZ)V")
	public final void method7505(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean650) {
			this.aBoolean650 = arg0;
			this.method7445();
			this.anInt8630 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ai", name = "R", descriptor = "(I)V")
	protected abstract void method7506();

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "(B)V")
	private void method7507() {
		this.method7506();
		if (this.aClass4_3 != null) {
			this.aClass4_3.method7857();
		}
	}

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "()Z")
	@Override
	public final boolean method8470() {
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZIZB)V")
	public final void method7508(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 != this.anInt8625 || this.aBoolean648 != this.aBoolean656) {
			@Pc(24) Interface7 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean648 ? 3 : 0;
			if (arg1 < 0) {
				this.method7510();
			} else {
				local24 = this.aClass155_3.method4117(arg1);
				@Pc(56) Class119 local56 = super.anInterface4_14.method4673(arg1);
				if (local56.aByte57 == 0 && local56.aByte59 == 0) {
					this.method7510();
				} else {
					@Pc(77) int local77 = local56.aBoolean292 ? 64 : 128;
					@Pc(81) int local81 = local77 * 50;
					@Pc(85) Class239_Sub3 local85 = this.method7512();
					local85.method9273(0.0F, (float) (local56.aByte57 * (this.anInt8613 % local81)) / (float) local81, (float) (this.anInt8613 % local81 * local56.aByte59) / (float) local81);
					this.method7464(Static178.aClass94_4);
				}
				local26 = local56.anInt3896;
				if (!this.aBoolean648) {
					local28 = local56.aByte56;
					local30 = local56.anInt3899;
					local37 = local56.aByte54;
				}
			}
			this.method7439(local28, arg0, arg2, local30, local37);
			if (this.aClass4_3 == null) {
				this.method7530(local24);
				this.method7509(local26);
			} else {
				this.aClass4_3.method7859(local26, local24);
			}
			this.aBoolean656 = this.aBoolean648;
			this.anInt8625 = arg1;
		}
		this.anInt8630 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(BI)V")
	public final void method7509(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method7521(Static265.aClass203_3, Static265.aClass203_3);
		} else if (arg0 == 0) {
			this.method7521(Static580.aClass203_4, Static580.aClass203_4);
		} else if (arg0 == 2) {
			this.method7521(Static265.aClass203_3, Static582.aClass203_5);
		} else if (arg0 == 3) {
			this.method7521(Static580.aClass203_4, Static191.aClass203_2);
		} else if (arg0 == 4) {
			this.method7521(Static152.aClass203_1, Static152.aClass203_1);
		}
	}

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "(B)V")
	public final void method7510() {
		if (this.aClass94Array3[this.anInt8601] != Static111.aClass94_3) {
			this.aClass94Array3[this.anInt8601] = Static111.aClass94_3;
			this.aClass239_Sub3Array3[this.anInt8601].method9249();
			this.method7479();
		}
	}

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "(B)V")
	private void method7511() {
		if (this.aClass232_6 == Static394.aClass232_3) {
			return;
		}
		@Pc(6) Class232 local6 = this.aClass232_6;
		this.aClass232_6 = Static394.aClass232_3;
		if (!local6.method5542()) {
			this.method7523();
		}
		this.method7477();
		this.aFloatArray71 = this.aFloatArray67;
		this.method7507();
		this.anInt8630 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "(B)Lclient!wn;")
	public final Class239_Sub3 method7512() {
		return this.aClass239_Sub3Array3[this.anInt8601];
	}

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt8599 < arg0) {
			this.anInt8599 = arg0;
			local5 = true;
		}
		if (arg2 < this.anInt8605) {
			local5 = true;
			this.anInt8605 = arg2;
		}
		if (arg1 > this.anInt8603) {
			local5 = true;
			this.anInt8603 = arg1;
		}
		if (arg3 < this.anInt8622) {
			local5 = true;
			this.anInt8622 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean668) {
			this.aBoolean668 = true;
			this.method7450();
		}
		this.method7438();
		this.method7514();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BZI[[I)Lclient!fn;")
	public abstract Interface10 method7513(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2);

	@OriginalMember(owner = "client!ai", name = "S", descriptor = "(I)V")
	private void method7514() {
		this.aFloat173 = (float) (this.anInt8599 - this.anInt8606);
		this.aFloat177 = (float) (this.anInt8605 - this.anInt8606);
		this.aFloat185 = (float) (this.anInt8622 - this.anInt8611);
		this.aFloat184 = (float) (this.anInt8603 - this.anInt8611);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIIIII)Lclient!dn;")
	@Override
	public final Class35 method8456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class35_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "(I)V")
	public final void method7515() {
		this.aBoolean647 = false;
		this.method7533();
	}

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "(I)V")
	protected abstract void method7516();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!ss;I)V")
	public final void method7517(@OriginalArg(0) int arg0, @OriginalArg(1) Class326 arg1) {
		this.method7475(arg1, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt8516 - 1 && arg1 <= 0 && this.anInt8556 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt8605 = this.anInt8516 < arg2 ? 0 : arg2;
		this.anInt8622 = arg3 <= this.anInt8516 ? arg3 : 0;
		this.anInt8603 = arg1 >= 0 ? arg1 : 0;
		this.anInt8599 = arg0 < 0 ? 0 : arg0;
		if (!this.aBoolean668) {
			this.aBoolean668 = true;
			this.method7450();
		}
		this.method7438();
		this.method7514();
	}

	@OriginalMember(owner = "client!ai", name = "V", descriptor = "(I)V")
	private void method7518() {
		this.aBoolean657 = false;
		this.method7495();
		if (this.aClass232_6 == Static361.aClass232_2) {
			this.method7507();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!gfa;IIII)Lclient!ka;")
	@Override
	public final Class95 method8489(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class95_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ai", name = "W", descriptor = "(I)V")
	public final void method7519() {
		if (this.anInt8630 == 16) {
			return;
		}
		this.method7410();
		this.method7536(true);
		this.method7482(true);
		this.method7505(true);
		this.method7440(1);
		this.anInt8630 = 16;
	}

	@OriginalMember(owner = "client!ai", name = "Y", descriptor = "(I)V")
	private void method7520() {
		this.aBoolean667 = false;
		if (this.aClass232_6 == Static403.aClass232_4) {
			this.method7501();
			this.method7507();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ln;Lclient!ln;I)V")
	public final void method7521(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class203 arg1) {
		@Pc(13) boolean local13 = false;
		if (arg1 != this.aClass203Array6[this.anInt8601]) {
			this.aClass203Array6[this.anInt8601] = arg1;
			local13 = true;
			this.method7516();
		}
		if (arg0 != this.aClass203Array5[this.anInt8601]) {
			this.aClass203Array5[this.anInt8601] = arg0;
			this.method7416();
			local13 = true;
		}
		if (local13) {
			this.anInt8630 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLclient!ss;I)V")
	public final void method7522(@OriginalArg(1) Class326 arg0, @OriginalArg(2) int arg1) {
		this.method7498(false, false, arg1, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "Z", descriptor = "(I)V")
	private void method7523() {
		this.aBoolean665 = false;
		if (this.aClass4_3 != null) {
			this.aClass4_3.method7847();
		}
		this.method7441();
	}

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "(Z)V")
	protected abstract void method7524();

	@OriginalMember(owner = "client!ai", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass239_Sub3_16.aFloat220 + (float) arg2 * this.aClass239_Sub3_16.aFloat221 + this.aClass239_Sub3_16.aFloat224 * (float) arg1 + (float) arg0 * this.aClass239_Sub3_16.aFloat222;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass239_Sub3_16.aFloat220 + this.aClass239_Sub3_16.aFloat221 * (float) arg5 + this.aClass239_Sub3_16.aFloat222 * (float) arg3 + this.aClass239_Sub3_16.aFloat224 * (float) arg4;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt8608 && (float) this.anInt8608 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt8600 < local32 && (float) this.anInt8600 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass239_Sub3_16.aFloat218 + (float) arg2 * this.aClass239_Sub3_16.aFloat225 + (float) arg0 * this.aClass239_Sub3_16.aFloat219 + (float) arg1 * this.aClass239_Sub3_16.aFloat216) * (float) this.anInt8609 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt8609 * ((float) arg5 * this.aClass239_Sub3_16.aFloat225 + (float) arg4 * this.aClass239_Sub3_16.aFloat216 + (float) arg3 * this.aClass239_Sub3_16.aFloat219 + this.aClass239_Sub3_16.aFloat218) / local63);
		if ((float) local135 < this.aFloat173 && this.aFloat173 > (float) local167) {
			local7 |= 0x1;
		} else if (this.aFloat177 < (float) local135 && (float) local167 > this.aFloat177) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt8632 * (this.aClass239_Sub3_16.aFloat217 + this.aClass239_Sub3_16.aFloat214 * (float) arg1 + this.aClass239_Sub3_16.aFloat223 * (float) arg0 + this.aClass239_Sub3_16.aFloat215 * (float) arg2) / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt8632 * (this.aClass239_Sub3_16.aFloat217 + (float) arg3 * this.aClass239_Sub3_16.aFloat223 + this.aClass239_Sub3_16.aFloat214 * (float) arg4 + (float) arg5 * this.aClass239_Sub3_16.aFloat215) / local63);
		if ((float) local233 < this.aFloat184 && this.aFloat184 > (float) local265) {
			local7 |= 0x4;
		} else if (this.aFloat185 < (float) local233 && (float) local265 > this.aFloat185) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ai", name = "ab", descriptor = "(I)V")
	private void method7525() {
		if (this.aClass4_3 != null) {
			this.aClass4_3.method7853();
		}
		this.method7443();
	}

	@OriginalMember(owner = "client!ai", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean663 = arg0;
		this.method7445();
	}

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "()Z")
	@Override
	public final boolean method8466() {
		return false;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method8500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "()V")
	@Override
	protected void method8455() {
		if (this.aBoolean658) {
			return;
		}
		for (@Pc(9) Class3 local9 = this.aClass338_198.method8177(); local9 != null; local9 = this.aClass338_198.method8168()) {
			((Class3_Sub5_Sub2) local9).method7967();
		}
		@Pc(26) Enumeration local26 = this.aHashtable5.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method7430(local32, this.aHashtable5.get(local32));
		}
		Static211.method7571(true, false);
		this.aNativeInterface3.release();
		this.aBoolean658 = true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BIIZ[I)Lclient!ec;")
	public final Interface7 method7526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		return this.method7499(0, arg3, arg0, 0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "(II)V")
	public abstract void method7527(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIZ)Lclient!vr;")
	@Override
	public final Class33 method8526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class33_Sub2 local11 = new Class33_Sub2(this, arg2, arg3, arg4);
		local11.method7653(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	@Override
	public final void method8449() {
	}

	@OriginalMember(owner = "client!ai", name = "bb", descriptor = "(I)V")
	protected final void method7528() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable5.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method7538(local26));
			}
		}
		this.aHashtable5 = local9;
		this.method7455();
		this.method7496();
		this.method7474();
		this.aClass242_3.method5815(this);
	}

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt8635;
	}

	@OriginalMember(owner = "client!ai", name = "cb", descriptor = "(I)Lclient!fn;")
	public final Interface10 method7529() {
		return this.aClass35_Sub1_3 == null ? null : this.aClass35_Sub1_3.method1042();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLclient!bm;)V")
	public final void method7530(@OriginalArg(1) Interface3 arg0) {
		if (arg0 == this.anInterface3Array3[this.anInt8601]) {
			return;
		}
		this.anInterface3Array3[this.anInt8601] = arg0;
		if (arg0 == null) {
			this.method7462();
		} else {
			arg0.method8138();
		}
		this.anInt8630 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!uu;)V")
	@Override
	public final void method8501(@OriginalArg(0) Class239 arg0) {
		this.aClass239_Sub3_16 = (Class239_Sub3) arg0;
		this.aClass239_Sub3_18.method9247(this.aClass239_Sub3_16);
		this.aClass239_Sub3_18.method9269();
		this.aClass239_Sub3_19.method9254(this.aClass239_Sub3_18);
		this.aClass239_Sub3_17.method9254(this.aClass239_Sub3_16);
		if (this.aClass232_6.method5542()) {
			this.method7523();
		}
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(IZ)V")
	public abstract void method7531(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ai", name = "db", descriptor = "(I)I")
	public final int method7532() {
		return this.anInt8607;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "()Lclient!uu;")
	@Override
	public final Class239 method8447() {
		return this.aClass239_Sub3_21;
	}

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "(Z)V")
	private void method7533() {
		if (Static403.aClass232_4 == this.aClass232_6) {
			@Pc(17) float local17 = this.method7458();
			this.aClass239_Sub3_15.method9271(0.0F, local17, local17);
		}
		this.aBoolean665 = false;
		this.method7537();
		if (this.aClass4_3 != null) {
			this.aClass4_3.method7855();
		}
	}

	@OriginalMember(owner = "client!ai", name = "eb", descriptor = "(I)V")
	private void method7534() {
		this.bf = (float) this.anInt8600;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!ig;Lclient!sw;I)Lclient!ec;")
	public abstract Interface7 method7535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) Class327 arg3);

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "()Z")
	@Override
	public final boolean method8471() {
		return this.aBoolean666;
	}

	@OriginalMember(owner = "client!ai", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8609 = arg2;
		this.anInt8611 = arg1;
		this.anInt8606 = arg0;
		this.anInt8632 = arg3;
		this.method7518();
		this.method7434();
		this.method7500();
		this.method7514();
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)I")
	@Override
	public final int method8495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(IZ)V")
	public final void method7536(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean655) {
			this.aBoolean655 = arg0;
			this.method7471();
			this.anInt8630 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method8498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static215.method3743(arg3, arg2, this, arg1, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt8599 = 0;
		this.anInt8622 = this.anInt8556;
		this.anInt8605 = this.anInt8516;
		this.anInt8603 = 0;
		if (this.aBoolean668) {
			this.aBoolean668 = false;
			this.method7450();
		}
		this.method7514();
	}

	@OriginalMember(owner = "client!ai", name = "fb", descriptor = "(I)V")
	protected abstract void method7537();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method7538(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt8608 && arg1 == this.anInt8600) {
			return;
		}
		this.anInt8608 = arg0;
		this.anInt8600 = arg1;
		this.method7434();
		this.method7518();
		this.method7525();
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
	@Override
	public final void method8458(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ai", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface7 local9 = local6.anInterface7_3;
		this.method7476();
		this.method7530(local9);
		this.method7440(1);
		this.method7521(Static265.aClass203_3, Static265.aClass203_3);
		this.method7522(Static125.aClass326_1, 0);
		this.method7539(arg0);
		this.aClass239_Sub3_15.method9260((float) this.anInt8516, 0.0F, (float) this.anInt8556);
		this.method7515();
		this.aClass239_Sub3Array3[0].method9260(local9.method5804((float) this.anInt8516), 1.0F, local9.method5808((float) this.anInt8556));
		this.aClass239_Sub3Array3[0].method9271(0.0F, local9.method5808((float) -arg3), local9.method5804((float) -arg2));
		this.aClass94Array3[0] = Static178.aClass94_4;
		this.method7479();
		this.method7481();
		this.method7510();
		this.method7522(Static523.aClass326_5, 0);
	}

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "(II)V")
	public final void method7539(@OriginalArg(0) int arg0) {
		if (this.anInt8616 != arg0) {
			this.anInt8616 = arg0;
			this.method7422();
		}
	}

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "(II)Lclient!aba;")
	protected Class4 method7540(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class4_Sub8(this);
		} else if (arg0 == 1) {
			return new Class4_Sub1(this);
		} else if (arg0 == 2) {
			return new Class4_Sub11(this, this.aClass202_6);
		} else if (arg0 == 7) {
			return new Class4_Sub3(this);
		} else {
			return new Class4_Sub4(this);
		}
	}

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "()Z")
	@Override
	public final boolean method8496() {
		return false;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[Lclient!uca;)V")
	@Override
	public final void method8472(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass3_Sub15Array5[local3] = arg1[local3];
		}
		this.anInt8633 = arg0;
		if (this.aClass232_6.method5542()) {
			this.method7433();
		}
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(IZ)Lclient!id;")
	public abstract Interface15 method7541(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "()V")
	@Override
	public final void method8503() {
		if (this.aClass155_3 != null) {
			this.aClass155_3.method4119();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZ)Lclient!vr;")
	@Override
	public final Class33 method8487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class33_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ai", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt8598 && this.anInt8627 == arg1 && this.anInt8621 == arg2) {
			return;
		}
		this.anInt8621 = arg2;
		this.anInt8598 = arg0;
		this.anInt8627 = arg1;
		this.method7525();
		this.method7471();
	}

	@OriginalMember(owner = "client!ai", name = "gb", descriptor = "(I)V")
	private void method7542() {
		this.method7503();
		this.method7494();
		this.method7524();
		this.method7433();
		this.method7490();
		this.method7428();
		this.method7415();
		this.method7470();
		this.method7445();
		this.method7471();
		this.method7443();
		this.method7432();
		this.method7468();
		this.method7436();
		for (@Pc(56) int local56 = this.anInt8620 - 1; local56 >= 0; local56--) {
			this.method7461(local56);
			this.method7516();
			this.method7416();
			this.method7510();
		}
		this.method7422();
		this.method7502();
		this.method7506();
		this.method7537();
		this.method7441();
	}

	@OriginalMember(owner = "client!ai", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt8606, this.anInt8611, this.anInt8609, this.anInt8632 };
	}
}
