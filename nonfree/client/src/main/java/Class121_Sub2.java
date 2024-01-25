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

@OriginalClass("client!sv")
public abstract class Class121_Sub2 extends Class121 {

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!sv", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!sv", name = "cd", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!sv", name = "kd", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7;

	@OriginalMember(owner = "client!sv", name = "Dd", descriptor = "Lclient!rba;")
	protected Class269 aClass269_5;

	@OriginalMember(owner = "client!sv", name = "Wd", descriptor = "I")
	protected int anInt8889;

	@OriginalMember(owner = "client!sv", name = "Zd", descriptor = "I")
	public int anInt8890;

	@OriginalMember(owner = "client!sv", name = "ce", descriptor = "I")
	public int anInt8891;

	@OriginalMember(owner = "client!sv", name = "ne", descriptor = "I")
	protected int anInt8894;

	@OriginalMember(owner = "client!sv", name = "oe", descriptor = "F")
	private float aFloat183;

	@OriginalMember(owner = "client!sv", name = "qe", descriptor = "Z")
	public boolean aBoolean610;

	@OriginalMember(owner = "client!sv", name = "re", descriptor = "Lclient!ij;")
	private Class17_Sub1 aClass17_Sub1_3;

	@OriginalMember(owner = "client!sv", name = "te", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!sv", name = "Ae", descriptor = "I")
	private int anInt8900;

	@OriginalMember(owner = "client!sv", name = "Ee", descriptor = "I")
	private int anInt8902;

	@OriginalMember(owner = "client!sv", name = "Ie", descriptor = "Lclient!aw;")
	public Interface3 anInterface3_3;

	@OriginalMember(owner = "client!sv", name = "Je", descriptor = "Z")
	protected boolean aBoolean615;

	@OriginalMember(owner = "client!sv", name = "Le", descriptor = "[Lclient!cv;")
	protected Class59[] aClass59Array5;

	@OriginalMember(owner = "client!sv", name = "Pe", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!sv", name = "Qe", descriptor = "[Lclient!km;")
	protected Class34_Sub3[] aClass34_Sub3Array3;

	@OriginalMember(owner = "client!sv", name = "Ve", descriptor = "Lclient!qr;")
	private Class92 aClass92_3;

	@OriginalMember(owner = "client!sv", name = "Xe", descriptor = "Z")
	public boolean aBoolean617;

	@OriginalMember(owner = "client!sv", name = "af", descriptor = "[Lclient!aw;")
	private Interface3[] anInterface3Array3;

	@OriginalMember(owner = "client!sv", name = "ff", descriptor = "Z")
	public boolean aBoolean618;

	@OriginalMember(owner = "client!sv", name = "mf", descriptor = "I")
	public int anInt8911;

	@OriginalMember(owner = "client!sv", name = "tf", descriptor = "[Lclient!cv;")
	protected Class59[] aClass59Array6;

	@OriginalMember(owner = "client!sv", name = "Af", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!sv", name = "Cf", descriptor = "I")
	public int anInt8920;

	@OriginalMember(owner = "client!sv", name = "Df", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!sv", name = "Ef", descriptor = "[Lclient!kca;")
	protected Class168[] aClass168Array3;

	@OriginalMember(owner = "client!sv", name = "Ff", descriptor = "I")
	public int anInt8921;

	@OriginalMember(owner = "client!sv", name = "Jf", descriptor = "I")
	public int anInt8922;

	@OriginalMember(owner = "client!sv", name = "Mf", descriptor = "F")
	private float aFloat195;

	@OriginalMember(owner = "client!sv", name = "Of", descriptor = "[Lclient!hj;")
	protected Class6_Sub7[] aClass6_Sub7Array6;

	@OriginalMember(owner = "client!sv", name = "Pf", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!sv", name = "Rf", descriptor = "Z")
	protected boolean aBoolean626;

	@OriginalMember(owner = "client!sv", name = "Sf", descriptor = "I")
	protected int anInt8925;

	@OriginalMember(owner = "client!sv", name = "Wf", descriptor = "F")
	private float aFloat198;

	@OriginalMember(owner = "client!sv", name = "ag", descriptor = "I")
	protected int anInt8928;

	@OriginalMember(owner = "client!sv", name = "bg", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!sv", name = "cg", descriptor = "I")
	protected int anInt8929;

	@OriginalMember(owner = "client!sv", name = "eg", descriptor = "Lclient!ep;")
	private Class90 aClass90_3;

	@OriginalMember(owner = "client!sv", name = "hg", descriptor = "Lclient!qca;")
	private Class258 aClass258_15;

	@OriginalMember(owner = "client!sv", name = "ig", descriptor = "Lclient!vp;")
	private Interface23 anInterface23_14;

	@OriginalMember(owner = "client!sv", name = "jg", descriptor = "Lclient!id;")
	public Class22_Sub3 aClass22_Sub3_21;

	@OriginalMember(owner = "client!sv", name = "kg", descriptor = "Lclient!id;")
	public Class22_Sub3 aClass22_Sub3_22;

	@OriginalMember(owner = "client!sv", name = "lg", descriptor = "Lclient!qca;")
	public Class258 aClass258_16;

	@OriginalMember(owner = "client!sv", name = "mg", descriptor = "Lclient!qca;")
	public Class258 aClass258_17;

	@OriginalMember(owner = "client!sv", name = "ng", descriptor = "Lclient!vp;")
	private Interface23 anInterface23_15;

	@OriginalMember(owner = "client!sv", name = "og", descriptor = "Lclient!id;")
	public Class22_Sub3 aClass22_Sub3_23;

	@OriginalMember(owner = "client!sv", name = "pg", descriptor = "Lclient!id;")
	public Class22_Sub3 aClass22_Sub3_24;

	@OriginalMember(owner = "client!sv", name = "qg", descriptor = "Lclient!id;")
	public Class22_Sub3 aClass22_Sub3_25;

	@OriginalMember(owner = "client!sv", name = "rg", descriptor = "Lclient!id;")
	public Class22_Sub3 aClass22_Sub3_26;

	@OriginalMember(owner = "client!sv", name = "sg", descriptor = "Lclient!id;")
	public Class22_Sub3 aClass22_Sub3_27;

	@OriginalMember(owner = "client!sv", name = "tg", descriptor = "Lclient!id;")
	public Class22_Sub3 aClass22_Sub3_28;

	@OriginalMember(owner = "client!sv", name = "ug", descriptor = "Lclient!id;")
	public Class22_Sub3 aClass22_Sub3_29;

	@OriginalMember(owner = "client!sv", name = "vg", descriptor = "Lclient!qca;")
	public Class258 aClass258_18;

	@OriginalMember(owner = "client!sv", name = "wg", descriptor = "Lclient!qca;")
	private Class258 aClass258_19;

	@OriginalMember(owner = "client!sv", name = "xg", descriptor = "Lclient!id;")
	public Class22_Sub3 aClass22_Sub3_30;

	@OriginalMember(owner = "client!sv", name = "zg", descriptor = "Lclient!qca;")
	public Class258 aClass258_20;

	@OriginalMember(owner = "client!sv", name = "Ag", descriptor = "Lclient!go;")
	private Interface11 anInterface11_8;

	@OriginalMember(owner = "client!sv", name = "Bg", descriptor = "Z")
	protected boolean aBoolean628;

	@OriginalMember(owner = "client!sv", name = "Cg", descriptor = "I")
	private int anInt8931;

	@OriginalMember(owner = "client!sv", name = "hd", descriptor = "Lclient!rh;")
	private final Class275 aClass275_182 = new Class275();

	@OriginalMember(owner = "client!sv", name = "Xd", descriptor = "Z")
	protected boolean aBoolean608 = true;

	@OriginalMember(owner = "client!sv", name = "ae", descriptor = "Lclient!km;")
	protected final Class34_Sub3 aClass34_Sub3_15 = new Class34_Sub3();

	@OriginalMember(owner = "client!sv", name = "de", descriptor = "Lclient!km;")
	public Class34_Sub3 aClass34_Sub3_16 = new Class34_Sub3();

	@OriginalMember(owner = "client!sv", name = "ee", descriptor = "Lclient!km;")
	public final Class34_Sub3 aClass34_Sub3_17 = new Class34_Sub3();

	@OriginalMember(owner = "client!sv", name = "fe", descriptor = "Lclient!km;")
	protected final Class34_Sub3 aClass34_Sub3_18 = new Class34_Sub3();

	@OriginalMember(owner = "client!sv", name = "ge", descriptor = "Lclient!km;")
	private final Class34_Sub3 aClass34_Sub3_19 = new Class34_Sub3();

	@OriginalMember(owner = "client!sv", name = "he", descriptor = "Lclient!km;")
	private final Class34_Sub3 aClass34_Sub3_20 = new Class34_Sub3();

	@OriginalMember(owner = "client!sv", name = "me", descriptor = "Z")
	protected boolean aBoolean609 = true;

	@OriginalMember(owner = "client!sv", name = "ke", descriptor = "I")
	public int anInt8893 = 50;

	@OriginalMember(owner = "client!sv", name = "se", descriptor = "I")
	private int anInt8896 = -1;

	@OriginalMember(owner = "client!sv", name = "pe", descriptor = "I")
	private int anInt8895 = 16777215;

	@OriginalMember(owner = "client!sv", name = "De", descriptor = "I")
	protected int anInt8901 = 0;

	@OriginalMember(owner = "client!sv", name = "ze", descriptor = "F")
	public float aFloat185 = -1.0F;

	@OriginalMember(owner = "client!sv", name = "Be", descriptor = "Z")
	private boolean aBoolean613 = false;

	@OriginalMember(owner = "client!sv", name = "ue", descriptor = "I")
	private int anInt8897 = 0;

	@OriginalMember(owner = "client!sv", name = "je", descriptor = "Lclient!dk;")
	protected Class68 aClass68_6 = Static50.aClass68_1;

	@OriginalMember(owner = "client!sv", name = "ie", descriptor = "I")
	public int anInt8892 = 512;

	@OriginalMember(owner = "client!sv", name = "He", descriptor = "I")
	private int anInt8903 = 0;

	@OriginalMember(owner = "client!sv", name = "xe", descriptor = "Z")
	protected boolean aBoolean611 = true;

	@OriginalMember(owner = "client!sv", name = "df", descriptor = "F")
	private float aFloat190 = 3000.0F;

	@OriginalMember(owner = "client!sv", name = "sf", descriptor = "[F")
	public final float[] aFloatArray59 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!sv", name = "ef", descriptor = "I")
	public int anInt8908 = 0;

	@OriginalMember(owner = "client!sv", name = "We", descriptor = "I")
	protected int anInt8905 = 0;

	@OriginalMember(owner = "client!sv", name = "xf", descriptor = "Z")
	private boolean aBoolean623 = false;

	@OriginalMember(owner = "client!sv", name = "bf", descriptor = "I")
	private int bf = -1;

	@OriginalMember(owner = "client!sv", name = "qf", descriptor = "I")
	public int anInt8914 = -1;

	@OriginalMember(owner = "client!sv", name = "jf", descriptor = "Z")
	private boolean aBoolean620 = false;

	@OriginalMember(owner = "client!sv", name = "Me", descriptor = "[F")
	private final float[] aFloatArray55 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!sv", name = "Ke", descriptor = "I")
	public int anInt8904 = 512;

	@OriginalMember(owner = "client!sv", name = "pf", descriptor = "[F")
	private final float[] aFloatArray58 = new float[16];

	@OriginalMember(owner = "client!sv", name = "lf", descriptor = "I")
	public int anInt8910 = 8;

	@OriginalMember(owner = "client!sv", name = "Ze", descriptor = "I")
	protected int anInt8907 = 0;

	@OriginalMember(owner = "client!sv", name = "Oe", descriptor = "F")
	public float aFloat186 = 1.0F;

	@OriginalMember(owner = "client!sv", name = "ve", descriptor = "I")
	public int anInt8898 = 0;

	@OriginalMember(owner = "client!sv", name = "wf", descriptor = "Z")
	protected boolean aBoolean622 = true;

	@OriginalMember(owner = "client!sv", name = "Gf", descriptor = "Z")
	protected boolean aBoolean624 = false;

	@OriginalMember(owner = "client!sv", name = "gf", descriptor = "F")
	public float aFloat191 = -1.0F;

	@OriginalMember(owner = "client!sv", name = "Nf", descriptor = "I")
	protected final int anInt8924 = 0;

	@OriginalMember(owner = "client!sv", name = "uf", descriptor = "I")
	public int anInt8915 = 0;

	@OriginalMember(owner = "client!sv", name = "Ne", descriptor = "Z")
	protected boolean aBoolean616 = true;

	@OriginalMember(owner = "client!sv", name = "If", descriptor = "[Lclient!qr;")
	private final Class92[] aClass92Array3 = new Class92[10];

	@OriginalMember(owner = "client!sv", name = "Ye", descriptor = "I")
	protected int anInt8906 = 3584;

	@OriginalMember(owner = "client!sv", name = "Tf", descriptor = "[F")
	public final float[] aFloatArray61 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!sv", name = "yf", descriptor = "I")
	private int anInt8917 = 0;

	@OriginalMember(owner = "client!sv", name = "of", descriptor = "I")
	public int anInt8913 = -1;

	@OriginalMember(owner = "client!sv", name = "le", descriptor = "F")
	private float aFloat182 = 1.0F;

	@OriginalMember(owner = "client!sv", name = "kf", descriptor = "I")
	protected int anInt8909 = 0;

	@OriginalMember(owner = "client!sv", name = "Kf", descriptor = "[F")
	private final float[] aFloatArray60 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!sv", name = "Qf", descriptor = "Z")
	protected boolean aBoolean625 = false;

	@OriginalMember(owner = "client!sv", name = "cf", descriptor = "F")
	public float aFloat189 = 3584.0F;

	@OriginalMember(owner = "client!sv", name = "hf", descriptor = "Z")
	protected boolean aBoolean619 = true;

	@OriginalMember(owner = "client!sv", name = "Ge", descriptor = "Z")
	private boolean aBoolean614 = false;

	@OriginalMember(owner = "client!sv", name = "Hf", descriptor = "F")
	public float aFloat194 = 1.0F;

	@OriginalMember(owner = "client!sv", name = "nf", descriptor = "I")
	public int anInt8912 = 3;

	@OriginalMember(owner = "client!sv", name = "we", descriptor = "I")
	protected int anInt8899 = 0;

	@OriginalMember(owner = "client!sv", name = "Re", descriptor = "[F")
	private final float[] aFloatArray56 = new float[16];

	@OriginalMember(owner = "client!sv", name = "Yf", descriptor = "F")
	public float aFloat199 = 1.0F;

	@OriginalMember(owner = "client!sv", name = "Te", descriptor = "F")
	public float aFloat188 = 1.0F;

	@OriginalMember(owner = "client!sv", name = "Uf", descriptor = "I")
	protected int anInt8926 = -1;

	@OriginalMember(owner = "client!sv", name = "ye", descriptor = "Z")
	private boolean aBoolean612 = false;

	@OriginalMember(owner = "client!sv", name = "vf", descriptor = "I")
	private int anInt8916 = 0;

	@OriginalMember(owner = "client!sv", name = "zf", descriptor = "I")
	protected final int anInt8918 = 0;

	@OriginalMember(owner = "client!sv", name = "Ce", descriptor = "[F")
	private final float[] aFloatArray54 = new float[16];

	@OriginalMember(owner = "client!sv", name = "fg", descriptor = "[F")
	private final float[] aFloatArray62 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!sv", name = "rf", descriptor = "Z")
	protected boolean aBoolean621 = false;

	@OriginalMember(owner = "client!sv", name = "Ue", descriptor = "[F")
	protected float[] aFloatArray57 = this.aFloatArray62;

	@OriginalMember(owner = "client!sv", name = "gg", descriptor = "Z")
	protected boolean aBoolean627 = false;

	@OriginalMember(owner = "client!sv", name = "Xf", descriptor = "Lclient!nc;")
	protected Class208 aClass208_12 = Static479.aClass208_16;

	@OriginalMember(owner = "client!sv", name = "dg", descriptor = "I")
	private int anInt8930 = 1;

	@OriginalMember(owner = "client!sv", name = "Vf", descriptor = "F")
	public float aFloat197 = 3584.0F;

	@OriginalMember(owner = "client!sv", name = "Zf", descriptor = "I")
	public int anInt8927 = 128;

	@OriginalMember(owner = "client!sv", name = "Se", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!sv", name = "yg", descriptor = "Lclient!km;")
	private final Class34_Sub3 aClass34_Sub3_21 = new Class34_Sub3();

	@OriginalMember(owner = "client!sv", name = "yd", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas17;

	@OriginalMember(owner = "client!sv", name = "A", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas16;

	@OriginalMember(owner = "client!sv", name = "Od", descriptor = "Ljava/lang/Object;")
	protected final Object anObject29;

	@OriginalMember(owner = "client!sv", name = "E", descriptor = "Ljava/lang/Object;")
	private Object anObject28;

	@OriginalMember(owner = "client!sv", name = "nb", descriptor = "Lclient!pq;")
	protected final Class251 aClass251_145;

	@OriginalMember(owner = "client!sv", name = "Bf", descriptor = "I")
	protected final int anInt8919;

	@OriginalMember(owner = "client!sv", name = "dc", descriptor = "I")
	private int anInt8800;

	@OriginalMember(owner = "client!sv", name = "xd", descriptor = "I")
	public int anInt8869;

	@OriginalMember(owner = "client!sv", name = "qb", descriptor = "I")
	private int anInt8762;

	@OriginalMember(owner = "client!sv", name = "sd", descriptor = "I")
	public int anInt8864;

	@OriginalMember(owner = "client!sv", name = "Lf", descriptor = "I")
	public final int anInt8923;

	@OriginalMember(owner = "client!sv", name = "Fe", descriptor = "Lclient!fk;")
	private final Class105 aClass105_3;

	@OriginalMember(owner = "client!sv", name = "rb", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!e;Lclient!pq;II)V")
	protected Class121_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class251 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.aCanvas16 = this.aCanvas17 = arg0;
		this.anObject28 = this.anObject29 = arg1;
		this.aClass251_145 = arg3;
		this.anInt8919 = arg4;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt8869 = this.anInt8800 = local307.width;
		this.anInt8864 = this.anInt8762 = local307.height;
		this.anInt8923 = arg5;
		Static285.method4044(true, false);
		this.aClass105_3 = new Class105(this, super.anInterface7_14);
		this.aNativeInterface3 = new NativeInterface(super.anInterface7_14.method5210(), this.anInt8923);
		for (@Pc(349) int local349 = 0; super.anInterface7_14.method5210() > local349; local349++) {
			@Pc(357) Class76 local357 = super.anInterface7_14.method5209(local349);
			if (local357 != null) {
				this.aNativeInterface3.initTextureMetrics(local349, local357.aByte23, local357.aByte21);
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)V")
	protected abstract void method7161();

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "(IIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8908 = arg1;
		this.anInt8904 = arg2;
		this.anInt8915 = arg0;
		this.anInt8892 = arg3;
		this.method7193();
		this.method7190();
		this.method7252();
		this.method7192();
	}

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "(I)V")
	protected abstract void method7162();

	@OriginalMember(owner = "client!sv", name = "ya", descriptor = "(IIIII)V")
	@Override
	public final void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7094(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!rf;IIII)Lclient!ba;")
	@Override
	public final Class22 method7088(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class22_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public final void method7117(@OriginalArg(0) Class6_Sub24 arg0) {
		this.aNativeHeap6 = ((Class6_Sub24_Sub2) arg0).aNativeHeap2;
		this.aNativeHeapBuffer7 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!sv", name = "AA", descriptor = "(IIII)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8902 = arg0;
		this.anInt8926 = arg1;
		this.anInt8896 = arg2;
		this.anInt8897 = arg3;
		this.aBoolean618 = true;
		this.method7187(0, 0, false, false, 3);
		if (this.aClass92_3 != null) {
			this.aClass92_3.method7747();
		}
		this.method7272();
		this.method7293();
	}

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7094(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "()F")
	public final float method7163() {
		return this.aFloat183;
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(II)V")
	public final void method7164(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt8930) {
			return;
		}
		@Pc(33) Class208 local33;
		@Pc(29) boolean local29;
		@Pc(31) boolean local31;
		if (arg0 == 1) {
			local29 = true;
			local33 = Static479.aClass208_16;
			local31 = true;
		} else if (arg0 == 2) {
			local29 = true;
			local31 = false;
			local33 = Static296.aClass208_15;
		} else if (arg0 == 128) {
			local29 = true;
			local33 = Static520.aClass208_13;
			local31 = true;
		} else {
			local31 = false;
			local29 = false;
			local33 = Static374.aClass208_9;
		}
		if (local31 != this.aBoolean609) {
			this.aBoolean609 = local31;
			this.method7177();
		}
		if (local29 != this.aBoolean622) {
			this.aBoolean622 = local29;
			this.method7162();
		}
		if (local33 != this.aClass208_12) {
			this.aClass208_12 = local33;
			this.method7279();
		}
		this.anInt8930 = arg0;
		this.anInt8900 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "(I)V")
	private void method7165() {
		if (this.aBoolean620) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray58;
		if (this.anInt8869 == 0 || this.anInt8864 == 0) {
			local5[14] = 0.0F;
			local5[5] = 1.0F;
			local5[8] = 0.0F;
			local5[11] = 0.0F;
			local5[4] = 0.0F;
			local5[9] = 0.0F;
			local5[1] = 0.0F;
			local5[2] = 0.0F;
			local5[13] = 0.0F;
			local5[3] = 0.0F;
			local5[7] = 0.0F;
			local5[12] = 0.0F;
			local5[0] = 1.0F;
			local5[6] = 0.0F;
			local5[10] = 1.0F;
			local5[15] = 1.0F;
		} else {
			local5[1] = 0.0F;
			local5[15] = 1.0F;
			local5[13] = 1.0F;
			local5[5] = -2.0F / (float) this.anInt8864;
			local5[2] = 0.0F;
			local5[12] = -1.0F;
			local5[14] = 0.5F;
			local5[0] = 2.0F / (float) this.anInt8869;
			local5[4] = 0.0F;
			local5[10] = 0.5F;
			local5[8] = 0.0F;
			local5[7] = 0.0F;
			local5[3] = 0.0F;
			local5[11] = 0.0F;
			local5[9] = 0.0F;
			local5[6] = 0.0F;
		}
		this.aBoolean620 = true;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IB)V")
	public final void method7166(@OriginalArg(0) int arg0) {
		if (this.anInt8928 != arg0) {
			this.anInt8928 = arg0;
			this.method7182();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!aw;I)V")
	public final void method7167(@OriginalArg(0) Interface3 arg0) {
		if (arg0 == this.anInterface3Array3[this.anInt8907]) {
			return;
		}
		this.anInterface3Array3[this.anInt8907] = arg0;
		if (arg0 == null) {
			this.method7207();
		} else {
			arg0.method7528();
		}
		this.anInt8900 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "(I)V")
	protected void method7168() {
		this.anInt8929 = this.anInt8925;
		this.anInt8925 = 0;
	}

	@OriginalMember(owner = "client!sv", name = "sa", descriptor = "(II)V")
	@Override
	public final void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt8893 == arg0 && this.anInt8906 == arg1) {
			return;
		}
		this.anInt8906 = arg1;
		this.anInt8893 = arg0;
		this.method7190();
		this.method7193();
		this.method7272();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!nl;Lclient!eea;Z)Z")
	public abstract boolean method7169(@OriginalArg(0) Class214 arg0, @OriginalArg(1) Class82 arg1);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZI)V")
	public final void method7170(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean627 != arg0) {
			this.aBoolean627 = arg0;
			this.method7191();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method7112(@OriginalArg(0) Class34 arg0) {
		this.aClass34_Sub3_16 = (Class34_Sub3) arg0;
		this.aClass34_Sub3_18.la(this.aClass34_Sub3_16);
		this.aClass34_Sub3_18.method3753();
		this.aClass34_Sub3_19.method3757(this.aClass34_Sub3_18);
		this.aClass34_Sub3_17.method3757(this.aClass34_Sub3_16);
		if (this.aClass68_6.method1433()) {
			this.method7254();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method7171(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!sv", name = "LA", descriptor = "(IIII)V")
	@Override
	public final void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean618) {
			throw new RuntimeException("");
		}
		if (this.anInt8902 != arg0) {
			this.anInt8902 = arg0;
			if (this.aClass92_3 != null) {
				this.aClass92_3.method7747();
			}
		}
		this.anInt8897 = arg3;
		this.anInt8926 = arg1;
		this.anInt8896 = arg2;
		this.method7272();
	}

	@OriginalMember(owner = "client!sv", name = "aa", descriptor = "()I")
	@Override
	public final int aa() {
		return this.anInt8931;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
	private void method7172() {
		this.aFloat189 = (float) this.anInt8906 - this.aFloat183;
	}

	@OriginalMember(owner = "client!sv", name = "na", descriptor = "(III[I)V")
	@Override
	public final void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass34_Sub3_16.method3775((float) arg2, (float) arg0, (float) arg1);
		if ((float) this.anInt8893 > local14 || local14 > (float) this.anInt8906) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(57) int local57 = (int) ((float) this.anInt8904 * this.aClass34_Sub3_16.method3774((float) arg0, (float) arg2, (float) arg1) / local14);
		@Pc(75) int local75 = (int) ((float) this.anInt8892 * this.aClass34_Sub3_16.method3754((float) arg0, (float) arg2, (float) arg1) / local14);
		if (this.aFloat184 <= (float) local57 && this.aFloat196 >= (float) local57 && this.aFloat193 <= (float) local75 && this.aFloat187 >= (float) local75) {
			arg3[2] = (int) local14;
			arg3[0] = (int) ((float) local57 - this.aFloat184);
			arg3[1] = (int) ((float) local75 - this.aFloat193);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZ)Lclient!qr;")
	protected Class92 method7173(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class92_Sub2(this);
		} else if (arg0 == 1) {
			return new Class92_Sub1(this);
		} else if (arg0 == 2) {
			return new Class92_Sub8(this, this.aClass269_5);
		} else if (arg0 == 7) {
			return new Class92_Sub6(this);
		} else {
			return new Class92_Sub3(this);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	protected abstract void method7174(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "(I)V")
	protected abstract void method7175();

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "(I)V")
	protected abstract void method7176();

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!ba;Lclient!ob;Lclient!q;Lclient!qn;I)V")
	@Override
	public final void method7118(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class102_Sub5 arg3, @OriginalArg(4) int arg4) {
		arg0.method4689(arg2, arg3, arg4);
		this.method7087(arg1);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)V")
	protected abstract void method7177();

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(ZI)V")
	public final void method7178(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean616) {
			this.aBoolean616 = arg0;
			this.method7293();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public final Class4 method7110(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class4_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)V")
	protected abstract void method7179();

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!kca;B)V")
	public final void method7181(@OriginalArg(0) Class168 arg0) {
		this.aClass168Array3[this.anInt8907] = arg0;
		this.method7257();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7101(@OriginalArg(0) Canvas arg0) {
		this.anObject28 = null;
		this.aCanvas16 = null;
		if (arg0 == null || this.aCanvas17 == arg0) {
			this.anObject28 = this.anObject29;
			this.aCanvas16 = this.aCanvas17;
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.anObject28 = this.aHashtable7.get(arg0);
			this.aCanvas16 = arg0;
		}
		if (this.aCanvas16 == null || this.anObject28 == null) {
			throw new RuntimeException();
		}
		this.method7184(this.aCanvas16, this.anObject28);
		this.method7188();
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7102(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "(I)V")
	protected abstract void method7182();

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(B)V")
	private void method7183() {
		this.anInterface23_14 = this.method7201(false);
		this.anInterface23_14.method7571(28, 140);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(36) Buffer local36 = this.anInterface23_14.method7569();
			if (local36 != null) {
				@Pc(43) Stream local43 = this.method7200(local36);
				if (Stream.a()) {
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(1.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
					local43.b(0.0F);
				} else {
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(1.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
					local43.a(0.0F);
				}
				local43.c();
				if (this.anInterface23_14.method7563()) {
					break;
				}
			}
		}
		this.aClass258_19 = this.method7285(new Class228[] { new Class228(new Class248[] { Static389.aClass248_1, Static389.aClass248_5, Static389.aClass248_5 }) });
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method7184(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILclient!eea;IILclient!nl;)Lclient!sd;")
	public abstract Interface20 method7185(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class214 arg3);

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "()Z")
	@Override
	public final boolean method7097() {
		return true;
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "(Z)V")
	private void method7186() {
		this.aBoolean620 = false;
		if (Static557.aClass68_7 == this.aClass68_6) {
			this.method7165();
			this.method7280();
		}
	}

	@OriginalMember(owner = "client!sv", name = "D", descriptor = "()Z")
	@Override
	public final boolean method7159() {
		return this.aClass92Array3[3].method7758();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIZZZI)V")
	private void method7187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) boolean local14 = arg2 & this.method7159();
		if (!local14 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			arg4 = 2;
			arg0 = 1;
			arg1 = 0;
		}
		if (arg4 != 0 && arg3) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (arg4 != this.anInt8903) {
			if (this.anInt8903 != 0) {
				this.aClass92Array3[Integer.MAX_VALUE & this.anInt8903].method7748();
			}
			if (arg4 == 0) {
				this.aClass92_3 = null;
			} else {
				this.aClass92_3 = this.aClass92Array3[Integer.MAX_VALUE & arg4];
				this.aClass92_3.method7749(arg3);
				this.aClass92_3.method7756(arg3);
				this.aClass92_3.method7751(arg1, arg0);
			}
			this.anInt8917 = arg1;
			this.anInt8903 = arg4;
			this.anInt8916 = arg0;
		} else if (this.anInt8903 != 0) {
			this.aClass92Array3[this.anInt8903 & Integer.MAX_VALUE].method7756(arg3);
			if (arg1 != this.anInt8917 || this.anInt8916 != arg0) {
				this.aClass92Array3[Integer.MAX_VALUE & this.anInt8903].method7751(arg1, arg0);
				this.anInt8917 = arg1;
				this.anInt8916 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7131() {
		return true;
	}

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "(B)V")
	private void method7188() {
		if (this.aCanvas16 == null) {
			this.anInt8800 = this.anInt8762 = 1;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas16.getSize();
			this.anInt8762 = local6.height;
			this.anInt8800 = local6.width;
		}
		this.anInt8864 = this.anInt8762;
		this.anInt8869 = this.anInt8800;
		this.method7186();
		this.method7190();
		this.method7193();
		this.method7234();
		this.method7192();
		this.method7252();
		this.F();
	}

	@OriginalMember(owner = "client!sv", name = "JA", descriptor = "(I)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0) {
		this.anInt8912 = 0;
		while (arg0 > 1) {
			this.anInt8912++;
			arg0 >>= 0x1;
		}
		this.anInt8910 = 0x1 << this.anInt8912;
	}

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "(I)Lclient!km;")
	public final Class34_Sub3 method7189() {
		if (!this.aBoolean613) {
			this.aClass34_Sub3_20.method3761(this.aClass34_Sub3_18, this.aClass34_Sub3_15);
			this.aBoolean613 = true;
		}
		return this.aClass34_Sub3_20;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7120(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas17 == arg0) {
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
			@Pc(53) Object local53 = this.method7171(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!sv", name = "ca", descriptor = "(IIII)V")
	@Override
	public final void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt8869 - 1 <= arg2 && arg1 <= 0 && this.anInt8864 - 1 <= arg3) {
			this.F();
			return;
		}
		this.anInt8901 = this.anInt8869 >= arg2 ? arg2 : 0;
		this.anInt8905 = arg1 >= 0 ? arg1 : 0;
		this.anInt8899 = arg0 < 0 ? 0 : arg0;
		this.anInt8909 = arg3 > this.anInt8869 ? 0 : arg3;
		if (!this.aBoolean628) {
			this.aBoolean628 = true;
			this.method7250();
		}
		this.method7231();
		this.method7192();
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "(B)V")
	private void method7190() {
		this.aBoolean614 = false;
		this.method7294();
		if (this.aClass68_6 == Static194.aClass68_2) {
			this.method7280();
		}
	}

	@OriginalMember(owner = "client!sv", name = "A", descriptor = "([I)V")
	@Override
	public final void A(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt8901;
		arg0[0] = this.anInt8899;
		arg0[3] = this.anInt8909;
		arg0[1] = this.anInt8905;
	}

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "(I)V")
	protected abstract void method7191();

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "(I)V")
	private void method7192() {
		this.aFloat193 = this.anInt8905 - this.anInt8908;
		this.aFloat187 = this.anInt8909 - this.anInt8908;
		this.aFloat184 = this.anInt8899 - this.anInt8915;
		this.aFloat196 = this.anInt8901 - this.anInt8915;
	}

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "(B)V")
	private void method7193() {
		this.aBoolean623 = false;
		if (this.aClass68_6 == Static326.aClass68_5) {
			this.method7289();
			this.method7280();
		}
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7156(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas17) {
			local5 = this.anObject28;
		} else if (this.aHashtable7.containsKey(arg0)) {
			local5 = this.aHashtable7.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method7174(local5, arg0);
		if (this.aCanvas16 == arg0) {
			this.method7188();
		}
	}

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "(I)V")
	protected final void method7194() {
		@Pc(17) Enumeration local17 = this.aHashtable7.keys();
		while (local17.hasMoreElements()) {
			@Pc(23) Canvas local23 = (Canvas) local17.nextElement();
			this.method7262(this.aHashtable7.get(local23), local23);
		}
		this.anInterface23_14.method7567();
		this.anInterface23_15.method7567();
		this.aClass22_Sub3_22.method3061();
		this.aClass22_Sub3_28.method3061();
		this.aClass22_Sub3_29.method3061();
		this.aClass22_Sub3_25.method3061();
		this.aClass22_Sub3_27.method3061();
		this.aClass90_3.method1826();
		this.anInterface11_8.method7567();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!tk;IB)V")
	public final void method7195(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		this.method7211(arg1, arg0);
	}

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "(Z)V")
	public final void method7196() {
		this.aClass34_Sub3Array3 = new Class34_Sub3[this.anInt8922];
		this.anInterface3Array3 = new Interface3[this.anInt8922];
		this.aClass59Array5 = new Class59[this.anInt8922];
		this.aClass59Array6 = new Class59[this.anInt8922];
		this.aClass168Array3 = new Class168[this.anInt8922];
		for (@Pc(32) int local32 = 0; local32 < this.anInt8922; local32++) {
			this.aClass59Array5[local32] = Static241.aClass59_1;
			this.aClass59Array6[local32] = Static241.aClass59_1;
			this.aClass168Array3[local32] = Static359.aClass168_4;
			this.aClass34_Sub3Array3[local32] = new Class34_Sub3();
		}
		this.aClass6_Sub7Array6 = new Class6_Sub7[this.anInt8894 - 2];
		this.anInterface3_3 = this.method7185(1, Static108.aClass82_8, 1, Static255.aClass214_8);
		this.method7117(new Class6_Sub24_Sub2(262144));
		this.aClass258_16 = this.method7285(new Class228[] { new Class228(new Class248[] { Static389.aClass248_1, Static389.aClass248_5 }) });
		this.aClass258_18 = this.method7285(new Class228[] { new Class228(new Class248[] { Static389.aClass248_1, Static389.aClass248_3 }) });
		this.aClass258_17 = this.method7285(new Class228[] { new Class228(Static389.aClass248_1), new Class228(Static389.aClass248_3), new Class228(Static389.aClass248_5), new Class228(Static389.aClass248_2) });
		this.aClass258_20 = this.method7285(new Class228[] { new Class228(Static389.aClass248_1), new Class228(Static389.aClass248_3), new Class228(Static389.aClass248_5) });
		this.aClass22_Sub3_26 = new Class22_Sub3(this, 0, 0, false, false);
		this.aClass22_Sub3_22 = new Class22_Sub3(this, 0, 0, true, true);
		this.aClass22_Sub3_30 = new Class22_Sub3(this, 0, 0, false, false);
		this.aClass22_Sub3_28 = new Class22_Sub3(this, 0, 0, true, true);
		this.aClass22_Sub3_23 = new Class22_Sub3(this, 0, 0, false, false);
		this.aClass22_Sub3_29 = new Class22_Sub3(this, 0, 0, true, true);
		this.aClass22_Sub3_24 = new Class22_Sub3(this, 0, 0, false, false);
		this.aClass22_Sub3_25 = new Class22_Sub3(this, 0, 0, true, true);
		this.aClass22_Sub3_21 = new Class22_Sub3(this, 0, 0, false, false);
		this.aClass22_Sub3_27 = new Class22_Sub3(this, 0, 0, true, true);
		this.aClass90_3 = new Class90(this);
		this.anInterface11_8 = this.method7204(true);
		this.method7227();
		this.aClass269_5 = new Class269(this);
		this.aClass92Array3[1] = this.method7173(1);
		this.aClass92Array3[2] = this.method7173(2);
		this.aClass92Array3[4] = this.method7173(4);
		this.aClass92Array3[5] = this.method7173(5);
		this.aClass92Array3[6] = this.method7173(6);
		this.aClass92Array3[7] = this.method7173(7);
		this.aClass92Array3[3] = this.method7173(3);
		this.aClass92Array3[8] = this.method7173(8);
		this.aClass92Array3[9] = this.method7173(9);
		if (!this.aClass92Array3[2].method7758()) {
			this.aClass92Array3[2] = this.method7173(0);
		}
		if (!this.aClass92Array3[4].method7758()) {
			this.aClass92Array3[4] = this.aClass92Array3[2];
		}
		if (!this.aClass92Array3[8].method7758()) {
			this.aClass92Array3[8] = this.aClass92Array3[4];
		}
		if (!this.aClass92Array3[9].method7758()) {
			this.aClass92Array3[9] = this.aClass92Array3[8];
		}
		this.method7237();
		this.F();
	}

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "(I)V")
	public final void method7197() {
		this.aClass34_Sub3_15.Y();
		this.aBoolean608 = true;
		this.method7216();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZLclient!cv;Lclient!cv;)V")
	public final void method7198(@OriginalArg(1) Class59 arg0, @OriginalArg(2) Class59 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg1 != this.aClass59Array6[this.anInt8907]) {
			this.aClass59Array6[this.anInt8907] = arg1;
			this.method7212();
			local5 = true;
		}
		if (arg0 != this.aClass59Array5[this.anInt8907]) {
			this.aClass59Array5[this.anInt8907] = arg0;
			this.method7222();
			local5 = true;
		}
		if (local5) {
			this.anInt8900 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "(I)Lclient!i;")
	@Override
	public final Class6_Sub24 method7107(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub24_Sub2 local8 = new Class6_Sub24_Sub2(arg0);
		this.aClass275_182.method6370(local8);
		return local8;
	}

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "(I)V")
	private void method7199() {
		this.method7297(0, this.anInterface23_15);
		this.method7263(this.aClass258_15);
		this.method7298(0, Static379.aClass107_8, 1);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method7200(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZB)Lclient!vp;")
	public abstract Interface23 method7201(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "()Lclient!q;")
	@Override
	public final Class34 method7146() {
		return new Class34_Sub3();
	}

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "(I)V")
	protected abstract void method7203();

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public final Class60 method7121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class60_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZZ)Lclient!go;")
	public abstract Interface11 method7204(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method7205(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return this.aNativeHeap6.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!sv", name = "IA", descriptor = "()I")
	@Override
	public final int IA() {
		return this.anInt8906;
	}

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "(I)V")
	public final void method7206() {
		if (this.anInt8900 == 2) {
			return;
		}
		this.method7224();
		this.method7296(false);
		this.method7240(false);
		this.method7264(false);
		this.method7228(false);
		this.method7290(-2, false, false);
		this.anInt8900 = 2;
	}

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "(I)V")
	protected abstract void method7207();

	@OriginalMember(owner = "client!sv", name = "C", descriptor = "(IIIIII)V")
	@Override
	public final void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7274();
		this.method7166(arg4);
		this.method7270(Static257.aClass305_4, 0);
		this.method7195(Static257.aClass305_4, 0);
		this.method7164(arg5);
		this.aClass34_Sub3_15.method3760((float) arg3, 1.0F, (float) arg2);
		this.aClass34_Sub3_15.G(arg0, arg1, 0);
		this.method7233();
		this.method7221(false);
		this.method7292();
		this.method7221(true);
		this.method7195(Static67.aClass305_1, 0);
		this.method7270(Static67.aClass305_1, 0);
	}

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "(I)V")
	public final void method7209() {
		if (this.aClass168Array3[this.anInt8907] != Static359.aClass168_4) {
			this.aClass168Array3[this.anInt8907] = Static359.aClass168_4;
			this.aClass34_Sub3Array3[this.anInt8907].Y();
			this.method7257();
		}
	}

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "(Z)V")
	protected abstract void method7210();

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZIILclient!tk;)V")
	protected abstract void method7211(@OriginalArg(2) int arg0, @OriginalArg(3) Class305 arg1);

	@OriginalMember(owner = "client!sv", name = "C", descriptor = "()V")
	@Override
	public final void method7155() {
		this.aClass105_3.method2150();
	}

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "()Z")
	@Override
	public final boolean method7103() {
		return true;
	}

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "(Z)V")
	protected abstract void method7212();

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "(I)V")
	public final void method7213() {
		this.method7252();
		this.method7280();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[BILclient!nl;ZZII)Lclient!sd;")
	protected abstract Interface20 method7214(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class214 arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!sv", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public final boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass34_Sub3_16.method3775((float) arg2, (float) arg0, (float) arg1);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass34_Sub3_16.method3775((float) arg5, (float) arg3, (float) arg4);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if (local14 < (float) this.anInt8893 && (float) this.anInt8893 > local31 || !(!((float) this.anInt8906 < local14) || !((float) this.anInt8906 < local31))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt8904 * this.aClass34_Sub3_16.method3774((float) arg0, (float) arg2, (float) arg1) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt8904 * this.aClass34_Sub3_16.method3774((float) arg3, (float) arg5, (float) arg4) / local31);
		if (this.aFloat184 > (float) local81 && this.aFloat184 > (float) local99 || this.aFloat196 < (float) local81 && this.aFloat196 < (float) local99) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt8892 * this.aClass34_Sub3_16.method3754((float) arg0, (float) arg2, (float) arg1) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt8892 * this.aClass34_Sub3_16.method3754((float) arg3, (float) arg5, (float) arg4) / local31);
			return (!(this.aFloat193 > (float) local143) || !((float) local161 < this.aFloat193)) && (!(this.aFloat187 < (float) local143) || !(this.aFloat187 < (float) local161));
		}
	}

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7134() {
		return this.aBoolean626;
	}

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "(I)I")
	public final int method7215() {
		return this.anInt8902;
	}

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "(I)V")
	private void method7216() {
		if (Static557.aClass68_7 == this.aClass68_6) {
			@Pc(7) float local7 = this.method7255();
			this.aClass34_Sub3_15.method3764(local7, local7, 0.0F);
		}
		this.aBoolean613 = false;
		this.method7203();
		if (this.aClass92_3 != null) {
			this.aClass92_3.method7752();
		}
	}

	@OriginalMember(owner = "client!sv", name = "A", descriptor = "(I)V")
	public final void method7217() {
		if (this.anInt8900 == 4) {
			return;
		}
		this.method7224();
		this.method7296(false);
		this.method7240(false);
		this.method7264(false);
		this.method7228(false);
		this.method7290(-2, false, false);
		this.method7164(1);
		this.method7266(0);
		this.anInt8900 = 4;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILclient!fo;)V")
	private void method7218(@OriginalArg(1) int arg0, @OriginalArg(2) Class107 arg1) {
		this.method7297(0, this.anInterface23_14);
		this.method7263(this.aClass258_19);
		this.method7298(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7132(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas17) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.method7262(this.aHashtable7.get(arg0), arg0);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public final Class4 method7091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class4_Sub3 local11 = new Class4_Sub3(this, arg2, arg3, arg4);
		local11.GA(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([IIIIZII)Lclient!sd;")
	public abstract Interface20 method7219(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIF)Lclient!hj;")
	@Override
	public final Class6_Sub7 method7082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub7_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BZ)V")
	public abstract void method7221(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "()Z")
	@Override
	public final boolean method7081() {
		return false;
	}

	@OriginalMember(owner = "client!sv", name = "C", descriptor = "(I)V")
	protected abstract void method7222();

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "(B)V")
	public final void method7223() {
		if (this.anInt8900 == 16) {
			return;
		}
		this.method7226();
		this.method7296(true);
		this.method7264(true);
		this.method7228(true);
		this.method7164(1);
		this.anInt8900 = 16;
	}

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "(Z)V")
	private void method7224() {
		if (this.aClass68_6 == Static557.aClass68_7) {
			return;
		}
		@Pc(17) Class68 local17 = this.aClass68_6;
		this.aClass68_6 = Static557.aClass68_7;
		if (local17.method1433()) {
			this.method7254();
		}
		this.method7165();
		this.aFloatArray57 = this.aFloatArray58;
		this.method7280();
		this.anInt8900 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "()Z")
	@Override
	public final boolean method7143() {
		return true;
	}

	@OriginalMember(owner = "client!sv", name = "E", descriptor = "(I)V")
	private void method7226() {
		if (this.aClass68_6 == Static326.aClass68_5) {
			return;
		}
		@Pc(6) Class68 local6 = this.aClass68_6;
		this.aClass68_6 = Static326.aClass68_5;
		if (!local6.method1433()) {
			this.method7254();
		}
		this.method7289();
		this.aFloatArray57 = this.aFloatArray54;
		this.method7280();
		this.anInt8900 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "(B)V")
	protected final void method7227() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable7 != null && !this.aHashtable7.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable7.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method7171(local26));
			}
		}
		this.aHashtable7 = local9;
		this.method7183();
		this.method7235();
		this.aClass90_3.method1822(this);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(IZ)V")
	public final void method7228(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean621 != arg0) {
			this.aBoolean621 = arg0;
			this.method7229();
			this.anInt8900 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "()I")
	@Override
	public final int v() {
		return this.anInt8891 + this.anInt8890 + this.anInt8889;
	}

	@OriginalMember(owner = "client!sv", name = "F", descriptor = "(I)V")
	protected abstract void method7229();

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!me;Z)Lclient!xa;")
	@Override
	public final Class4 method7157(@OriginalArg(0) Class196 arg0) {
		@Pc(20) Class4 local20;
		if (arg0.anInt5516 == 0 || arg0.anInt5517 == 0) {
			local20 = this.method7110(new int[1], 1, 1, 1);
		} else {
			@Pc(29) int[] local29 = new int[arg0.anInt5516 * arg0.anInt5517];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(38) int local38;
			@Pc(42) int local42;
			if (arg0.aByteArray67 == null) {
				for (local38 = 0; local38 < arg0.anInt5517; local38++) {
					for (local42 = 0; local42 < arg0.anInt5516; local42++) {
						@Pc(55) int local55 = arg0.anIntArray509[arg0.aByteArray68[local31++] & 0xFF];
						local29[local33++] = local55 == 0 ? 0 : local55 | 0xFF000000;
					}
				}
			} else {
				for (local38 = 0; local38 < arg0.anInt5517; local38++) {
					for (local42 = 0; local42 < arg0.anInt5516; local42++) {
						local29[local33++] = arg0.aByteArray67[local31] << 24 | arg0.anIntArray509[arg0.aByteArray68[local31] & 0xFF];
						local31++;
					}
				}
			}
			local20 = this.method7110(local29, arg0.anInt5516, arg0.anInt5516, arg0.anInt5517);
		}
		local20.EA(arg0.anInt5514, arg0.anInt5515, arg0.anInt5518, arg0.anInt5513);
		return local20;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([Lclient!ba;Lclient!ob;Lclient!q;[Lclient!qn;I)V")
	@Override
	public final void method7151(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class102_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method7136(arg0, arg2, arg3, arg4);
		this.method7087(arg1);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!aq;)V")
	@Override
	public final void method7108(@OriginalArg(0) Class17 arg0) {
		this.aClass17_Sub1_3 = (Class17_Sub1) arg0;
	}

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "()V")
	@Override
	public final void k() {
		this.aBoolean618 = false;
		this.method7187(0, 0, false, false, 0);
		this.method7272();
		this.method7293();
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(IIIIII)Lclient!aq;")
	@Override
	public final Class17 method7113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class17_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BF)V")
	public final void method7230(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat182) {
			this.aFloat182 = arg0;
			this.method7193();
		}
	}

	@OriginalMember(owner = "client!sv", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class16_Sub1 local6 = (Class16_Sub1) arg1;
		@Pc(9) Interface20 local9 = local6.anInterface20_2;
		this.method7206();
		this.method7167(local9);
		this.method7164(1);
		this.method7198(Static526.aClass59_4, Static526.aClass59_4);
		this.method7270(Static257.aClass305_4, 0);
		this.method7166(arg0);
		this.aClass34_Sub3_15.method3760((float) this.anInt8864, 0.0F, (float) this.anInt8869);
		this.method7233();
		this.aClass34_Sub3Array3[0].method3760(local9.method7533((float) this.anInt8864), 1.0F, local9.method7534((float) this.anInt8869));
		this.aClass34_Sub3Array3[0].method3764(local9.method7534((float) -arg2), local9.method7533((float) -arg3), 0.0F);
		this.aClass168Array3[0] = Static478.aClass168_6;
		this.method7257();
		this.method7292();
		this.method7209();
		this.method7270(Static67.aClass305_1, 0);
	}

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "(B)V")
	protected abstract void method7231();

	@OriginalMember(owner = "client!sv", name = "ka", descriptor = "(FF)V")
	@Override
	public final void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat190 == arg0 && arg1 == this.aFloat183) {
			return;
		}
		this.aFloat183 = arg1;
		this.aFloat190 = arg0;
		this.method7172();
		this.method7236();
		this.method7193();
		this.method7190();
	}

	@OriginalMember(owner = "client!sv", name = "G", descriptor = "(I)V")
	public final void method7232() {
		if (this.anInt8900 == 8) {
			return;
		}
		this.method7243();
		this.method7296(true);
		this.method7264(true);
		this.method7228(true);
		this.method7164(1);
		this.anInt8900 = 8;
	}

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "(Z)V")
	public final void method7233() {
		this.aBoolean608 = false;
		this.method7216();
	}

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "(B)V")
	protected abstract void method7234();

	@OriginalMember(owner = "client!sv", name = "H", descriptor = "(I)V")
	private void method7235() {
		this.anInterface23_15 = this.method7201(true);
		this.anInterface23_15.method7571(12, 24);
		this.aClass258_15 = this.method7285(new Class228[] { new Class228(Static389.aClass248_1) });
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!ob;)V")
	@Override
	public final void method7087(@OriginalArg(0) Class222 arg0) {
		this.aClass90_3.method1824(this, arg0);
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "()I")
	@Override
	public final int method7085() {
		return this.anInt8894 - 2;
	}

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "(B)V")
	private void method7236() {
		if (this.aFloat183 == 0.0F) {
			this.aFloatArray56[14] = this.aFloat198;
			this.aFloatArray56[10] = this.aFloat195;
		} else {
			@Pc(27) float local27 = this.aFloat190 / (this.aFloat190 + this.aFloat183);
			@Pc(31) float local31 = local27 * local27;
			@Pc(48) float local48 = (1.0F - local27) * -this.aFloat198 * (1.0F - local27) / this.aFloat183;
			this.aFloatArray56[10] = local48 + this.aFloat195;
			this.aFloatArray56[14] = this.aFloat198 * local31;
		}
		this.aFloat197 = (this.aFloatArray56[14] - (float) this.anInt8906) / this.aFloatArray56[10];
	}

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "(Z)V")
	protected void method7237() {
		this.method7291();
	}

	@OriginalMember(owner = "client!sv", name = "I", descriptor = "(I)Lclient!vea;")
	public final Interface22 method7238() {
		return this.aClass17_Sub1_3 == null ? null : this.aClass17_Sub1_3.method395();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILclient!go;IILclient!fo;I)V")
	public abstract void method7239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class107 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(ZI)V")
	public final void method7240(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean625) {
			this.aBoolean625 = arg0;
			this.method7191();
			this.anInt8900 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILclient!ll;)V")
	public abstract void method7241(@OriginalArg(1) Class186 arg0);

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "(Z)Lclient!km;")
	public final Class34_Sub3 method7242() {
		return this.aClass34_Sub3_18;
	}

	@OriginalMember(owner = "client!sv", name = "J", descriptor = "(I)V")
	private void method7243() {
		if (Static194.aClass68_2 == this.aClass68_6) {
			return;
		}
		@Pc(6) Class68 local6 = this.aClass68_6;
		this.aClass68_6 = Static194.aClass68_2;
		if (!local6.method1433()) {
			this.method7254();
		}
		this.method7294();
		this.aFloatArray57 = this.aFloatArray56;
		this.method7280();
		this.anInt8900 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(ZB)V")
	public final void method7244(@OriginalArg(1) byte arg0) {
		this.method7166(arg0 << 8 | arg0 << 24 | arg0 << 16 | arg0);
	}

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "(II)V")
	public final void method7245(@OriginalArg(0) int arg0) {
		if (this.anInt8907 != arg0) {
			this.anInt8907 = arg0;
			this.method7210();
		}
	}

	@OriginalMember(owner = "client!sv", name = "K", descriptor = "(I)V")
	public abstract void method7246();

	@OriginalMember(owner = "client!sv", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt8899 < arg0) {
			this.anInt8899 = arg0;
			local5 = true;
		}
		if (this.anInt8901 > arg2) {
			this.anInt8901 = arg2;
			local5 = true;
		}
		if (arg1 > this.anInt8905) {
			local5 = true;
			this.anInt8905 = arg1;
		}
		if (this.anInt8909 > arg3) {
			local5 = true;
			this.anInt8909 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean628) {
			this.aBoolean628 = true;
			this.method7250();
		}
		this.method7231();
		this.method7192();
	}

	@OriginalMember(owner = "client!sv", name = "L", descriptor = "(I)I")
	public final int method7247() {
		return this.anInt8896;
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "()Lclient!q;")
	@Override
	public final Class34 method7096() {
		return this.aClass34_Sub3_21;
	}

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "()Z")
	@Override
	public final boolean method7145() {
		return false;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIZ[IZ)Lclient!sd;")
	public final Interface20 method7248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		return this.method7219(arg2, arg1, 0, arg0, arg3, 0);
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method7127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method7255();
		this.method7274();
		this.method7166(arg4);
		this.method7270(Static257.aClass305_4, 0);
		this.method7195(Static257.aClass305_4, 0);
		this.method7164(arg5);
		this.aClass34_Sub3_15.method3760((float) (arg3 - 1), 1.0F, (float) (arg2 - 1));
		this.aClass34_Sub3_15.method3764((float) arg0 - local7, -local7 + (float) arg1, 0.0F);
		this.method7233();
		this.method7221(false);
		this.method7218(4, Static159.aClass107_3);
		this.method7221(true);
		this.method7195(Static67.aClass305_1, 0);
		this.method7270(Static67.aClass305_1, 0);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method7115() {
	}

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7126() {
		return true;
	}

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "(I)V")
	@Override
	public final void method7105(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(FFFBFFF)Z")
	private boolean method7249(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface23_15.method7569();
		if (local9 == null) {
			return false;
		}
		@Pc(18) Stream local18 = this.method7200(local9);
		if (Stream.a()) {
			local18.b(arg4);
			local18.b(arg5);
			local18.b(arg1);
			local18.b(arg2);
			local18.b(arg0);
			local18.b(arg3);
		} else {
			local18.a(arg4);
			local18.a(arg5);
			local18.a(arg1);
			local18.a(arg2);
			local18.a(arg0);
			local18.a(arg3);
		}
		local18.c();
		return this.anInterface23_15.method7563();
	}

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "(B)V")
	protected abstract void method7250();

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BI[BIZLclient!nl;)Lclient!sd;")
	public final Interface20 method7251(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class214 arg4) {
		return this.method7214(arg2, arg1, arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!sv", name = "M", descriptor = "(I)V")
	public final void method7252() {
		if (this.aClass68_6 == Static50.aClass68_1) {
			return;
		}
		@Pc(16) Class68 local16 = this.aClass68_6;
		this.aClass68_6 = Static50.aClass68_1;
		if (local16.method1433()) {
			this.method7254();
		}
		this.anInt8900 &= 0xFFFFFFE0;
		this.aFloatArray57 = this.aFloatArray62;
	}

	@OriginalMember(owner = "client!sv", name = "N", descriptor = "(I)I")
	public final int method7253() {
		return this.anInt8907;
	}

	@OriginalMember(owner = "client!sv", name = "O", descriptor = "(I)V")
	private void method7254() {
		this.aBoolean613 = false;
		if (this.aClass92_3 != null) {
			this.aClass92_3.method7757();
		}
		this.method7267();
	}

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "(Z)F")
	protected abstract float method7255();

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public final Class16 method7083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static294.method4108(arg0, arg1, arg3, arg2, this);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
	@Override
	public final void method7086(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt8927 = arg0;
		this.aClass105_3.method2150();
	}

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "(B)V")
	protected abstract void method7256();

	@OriginalMember(owner = "client!sv", name = "F", descriptor = "()V")
	@Override
	public final void F() {
		this.anInt8909 = this.anInt8864;
		this.anInt8901 = this.anInt8869;
		this.anInt8899 = 0;
		this.anInt8905 = 0;
		if (this.aBoolean628) {
			this.aBoolean628 = false;
			this.method7250();
		}
		this.method7192();
	}

	@OriginalMember(owner = "client!sv", name = "P", descriptor = "(I)V")
	private void method7257() {
		this.method7260();
		if (this.aClass92_3 != null) {
			this.aClass92_3.method7746();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!qn;I)V")
	@Override
	public final void method7136(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class102_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method4689(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "ha", descriptor = "(F)V")
	@Override
	public final void ha(@OriginalArg(0) float arg0) {
		if (this.aFloat199 != arg0) {
			this.aFloat199 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method7278();
			this.method7258();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)I")
	@Override
	public final int method7099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(I)V")
	@Override
	public void method7100(@OriginalArg(0) int arg0) {
		this.aClass105_3.method2146();
		this.anInt8920 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "(I)V")
	@Override
	public final void method7119(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!sv", name = "Q", descriptor = "(I)V")
	protected abstract void method7258();

	@OriginalMember(owner = "client!sv", name = "B", descriptor = "()Z")
	@Override
	public final boolean method7148() {
		return true;
	}

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7093() {
		return false;
	}

	@OriginalMember(owner = "client!sv", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt8893;
	}

	@OriginalMember(owner = "client!sv", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt8895 != arg0;
		if (local11 || arg1 != this.aFloat185 || arg2 != this.aFloat191) {
			this.aFloat185 = arg1;
			this.aFloat191 = arg2;
			this.anInt8895 = arg0;
			if (local11) {
				this.aFloat194 = (float) (this.anInt8895 & 0xFF0000) / 1.671168E7F;
				this.aFloat188 = (float) (this.anInt8895 & 0xFF) / 255.0F;
				this.aFloat186 = (float) (this.anInt8895 & 0xFF00) / 65280.0F;
				this.method7278();
			}
			this.aNativeInterface3.setSunColour(this.aFloat194, this.aFloat186, this.aFloat188, arg1, arg2);
			this.method7179();
		}
		if (arg3 != this.aFloatArray55[0] || arg4 != this.aFloatArray55[1] || this.aFloatArray55[2] != arg5) {
			this.aFloatArray55[0] = arg3;
			this.aFloatArray55[2] = arg5;
			this.aFloatArray55[1] = arg4;
			this.aFloatArray60[2] = -arg5;
			this.aFloatArray60[1] = -arg4;
			this.aFloatArray60[0] = -arg3;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray59[1] = arg4 * local149;
			this.aFloatArray59[2] = local149 * arg5;
			this.aFloatArray59[0] = local149 * arg3;
			this.aFloatArray61[0] = -this.aFloatArray59[0];
			this.aFloatArray61[1] = -this.aFloatArray59[1];
			this.aFloatArray61[2] = -this.aFloatArray59[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray59[0], this.aFloatArray59[1], this.aFloatArray59[2]);
			this.method7246();
			this.anInt8921 = (int) (arg5 * 256.0F / arg4);
			this.anInt8911 = (int) (arg3 * 256.0F / arg4);
		}
		this.method7258();
	}

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7122() {
		return true;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!nl;ILclient!eea;)Z")
	public abstract boolean method7259(@OriginalArg(0) Class214 arg0, @OriginalArg(2) Class82 arg1);

	@OriginalMember(owner = "client!sv", name = "R", descriptor = "(I)V")
	protected abstract void method7260();

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "(B)Lclient!km;")
	public final Class34_Sub3 method7261() {
		return this.aClass34_Sub3Array3[this.anInt8907];
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V")
	protected abstract void method7262(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLclient!qca;)V")
	public abstract void method7263(@OriginalArg(1) Class258 arg0);

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(ZZ)V")
	public final void method7264(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean624 != arg0) {
			this.aBoolean624 = arg0;
			this.method7176();
			this.anInt8900 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "(II)V")
	public abstract void method7265(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "(II)V")
	public final void method7266(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method7198(Static526.aClass59_4, Static526.aClass59_4);
		} else if (arg0 == 0) {
			this.method7198(Static241.aClass59_1, Static241.aClass59_1);
		} else if (arg0 == 2) {
			this.method7198(Static526.aClass59_4, Static351.aClass59_3);
		} else if (arg0 == 3) {
			this.method7198(Static241.aClass59_1, Static570.aClass59_5);
		} else if (arg0 == 4) {
			this.method7198(Static281.aClass59_2, Static281.aClass59_2);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!sv", name = "S", descriptor = "(I)V")
	protected abstract void method7267();

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "()Z")
	@Override
	public final boolean method7142() {
		return true;
	}

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "(B)[F")
	public final float[] method7268() {
		return this.aFloatArray62;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZIILclient!nl;BII[F)Lclient!sd;")
	protected abstract Interface20 method7269(@OriginalArg(0) boolean arg0, @OriginalArg(3) Class214 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) float[] arg4);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!tk;II)V")
	public final void method7270(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		this.method7282(false, arg1, false, arg0);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!nl;IZI[FI)Lclient!sd;")
	public final Interface20 method7271(@OriginalArg(0) Class214 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4) {
		return this.method7269(arg2, arg0, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!sv", name = "T", descriptor = "(I)V")
	private void method7272() {
		if (this.aClass92_3 != null) {
			this.aClass92_3.method7750();
		}
		this.method7256();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public final void method7098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class16 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!sv", name = "X", descriptor = "(III)V")
	@Override
	public final void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8914 == arg0 && this.anInt8913 == arg1 && arg2 == this.anInt8898) {
			return;
		}
		this.anInt8898 = arg2;
		this.anInt8913 = arg1;
		this.anInt8914 = arg0;
		if (this.aBoolean618) {
			return;
		}
		this.method7272();
		this.method7293();
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(IZ)V")
	public final void method7273(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean611 != arg0) {
			this.aBoolean611 = arg0;
			this.method7161();
		}
	}

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "(B)V")
	private void method7274() {
		if (this.anInt8900 == 1) {
			return;
		}
		this.method7224();
		this.method7296(false);
		this.method7240(false);
		this.method7264(false);
		this.method7228(false);
		this.method7290(-2, false, false);
		this.method7266(1);
		this.method7167(this.anInterface3_3);
		this.anInt8900 = 1;
	}

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "(B)Lclient!km;")
	public final Class34_Sub3 method7275() {
		return this.aClass34_Sub3_15;
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(Z)V")
	@Override
	public final void method7129(@OriginalArg(0) boolean arg0) {
		this.aBoolean619 = arg0;
		this.method7229();
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
	@Override
	public final void method7089(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIILclient!nl;[BI)Lclient!gp;")
	public abstract Interface12 method7276(@OriginalArg(3) Class214 arg0, @OriginalArg(4) byte[] arg1);

	@OriginalMember(owner = "client!sv", name = "E", descriptor = "()F")
	public final float method7277() {
		return this.aFloat190;
	}

	@OriginalMember(owner = "client!sv", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public final void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "()V")
	@Override
	protected void method7125() {
		if (this.aBoolean612) {
			return;
		}
		for (@Pc(13) Class6 local13 = this.aClass275_182.method6366(); local13 != null; local13 = this.aClass275_182.method6364()) {
			((Class6_Sub24_Sub2) local13).method3800();
		}
		@Pc(30) Enumeration local30 = this.aHashtable7.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method7262(this.aHashtable7.get(local36), local36);
		}
		Static441.method6330(false, true);
		this.aNativeInterface3.release();
		this.aBoolean612 = true;
	}

	@OriginalMember(owner = "client!sv", name = "U", descriptor = "(I)V")
	protected abstract void method7278();

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)I")
	@Override
	public final int method7150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "(Z)V")
	protected abstract void method7279();

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "(IIIII)V")
	@Override
	protected final void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!sv", name = "V", descriptor = "(I)V")
	private void method7280() {
		this.method7175();
		if (this.aClass92_3 != null) {
			this.aClass92_3.method7755();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method7094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		@Pc(30) float local30 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local17 * local17)));
		@Pc(34) float local34 = local17 * local30;
		@Pc(38) float local38 = local10 * local30;
		if (!this.method7249((float) arg3 + local34, 0.0F, (float) arg2 + local38, 0.0F, (float) arg0, (float) arg1)) {
			return;
		}
		this.method7274();
		this.method7166(arg4);
		this.method7270(Static257.aClass305_4, 0);
		this.method7195(Static257.aClass305_4, 0);
		this.method7164(arg5);
		this.method7197();
		this.method7221(false);
		this.method7199();
		this.method7221(true);
		this.method7195(Static67.aClass305_1, 0);
		this.method7270(Static67.aClass305_1, 0);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(IB)Lclient!go;")
	public final Interface11 method7281(@OriginalArg(0) int arg0) {
		if (arg0 * 2 > this.anInterface11_8.method7559()) {
			this.anInterface11_8.method7560(arg0);
		}
		return this.anInterface11_8;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZIZILclient!tk;)V")
	public abstract void method7282(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class305 arg3);

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "(Z)I")
	public final int method7283() {
		return this.anInt8897;
	}

	@OriginalMember(owner = "client!sv", name = "W", descriptor = "(I)Lclient!km;")
	public final Class34_Sub3 method7284() {
		return this.aClass34_Sub3Array3[this.anInt8907];
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([Lclient!oh;I)Lclient!qca;")
	public abstract Class258 method7285(@OriginalArg(0) Class228[] arg0);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!km;Z)V")
	public final void method7286(@OriginalArg(0) Class34_Sub3 arg0) {
		this.aClass34_Sub3_15.la(arg0);
		this.aBoolean608 = false;
		this.method7216();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z[F)[F")
	public final float[] method7287(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloatArray57[1];
		arg0[0] = this.aFloatArray57[0];
		arg0[8] = this.aFloatArray57[2];
		arg0[12] = this.aFloatArray57[3];
		arg0[2] = this.aFloatArray57[8];
		arg0[1] = this.aFloatArray57[4];
		arg0[13] = this.aFloatArray57[7];
		arg0[9] = this.aFloatArray57[6];
		arg0[5] = this.aFloatArray57[5];
		arg0[7] = this.aFloatArray57[13];
		arg0[3] = this.aFloatArray57[12];
		arg0[10] = this.aFloatArray57[10];
		arg0[14] = this.aFloatArray57[11];
		arg0[6] = this.aFloatArray57[9];
		arg0[11] = this.aFloatArray57[14];
		arg0[15] = this.aFloatArray57[15];
		return arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BZI[[I)Lclient!vea;")
	public abstract Interface22 method7288(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[Lclient!hj;)V")
	@Override
	public final void method7158(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub7[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass6_Sub7Array6[local7] = arg1[local7];
		}
		this.anInt8925 = arg0;
		if (this.aClass68_6.method1433()) {
			this.method7168();
		}
	}

	@OriginalMember(owner = "client!sv", name = "X", descriptor = "(I)V")
	private void method7289() {
		if (this.aBoolean623) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray54;
		@Pc(12) float local12 = (float) this.anInt8893 - this.aFloat183;
		@Pc(19) float local19 = (float) this.anInt8906 - this.aFloat183;
		@Pc(31) float local31 = (float) -this.anInt8908 * this.aFloat182 / (float) this.anInt8892;
		@Pc(43) float local43 = (float) -this.anInt8915 * this.aFloat182 / (float) this.anInt8904;
		@Pc(58) float local58 = (float) (this.anInt8869 - this.anInt8915) * this.aFloat182 / (float) this.anInt8904;
		@Pc(73) float local73 = this.aFloat182 * (float) (this.anInt8864 - this.anInt8908) / (float) this.anInt8892;
		if (local43 == local58 || local73 == local31) {
			local5[12] = 0.0F;
			local5[15] = 1.0F;
			local5[14] = 0.0F;
			local5[1] = 0.0F;
			local5[8] = 0.0F;
			local5[9] = 0.0F;
			local5[11] = 0.0F;
			local5[3] = 0.0F;
			local5[13] = 0.0F;
			local5[7] = 0.0F;
			local5[4] = 0.0F;
			local5[0] = 1.0F;
			local5[5] = 1.0F;
			local5[10] = 1.0F;
			local5[6] = 0.0F;
			local5[2] = 0.0F;
		} else {
			local5[5] = 2.0F / (local73 - local31);
			local5[14] = local12 / (local12 - local19);
			local5[8] = 0.0F;
			local5[9] = 0.0F;
			local5[12] = (local58 + local43) / (local43 - local58);
			local5[13] = (local73 + local31) / (-local31 + local73);
			local5[6] = 0.0F;
			local5[7] = 0.0F;
			local5[3] = 0.0F;
			local5[10] = 1.0F / (local12 - local19);
			local5[0] = 2.0F / (local58 - local43);
			local5[1] = 0.0F;
			local5[4] = 0.0F;
			local5[15] = 1.0F;
			local5[11] = 0.0F;
			local5[2] = 0.0F;
		}
		this.method7172();
		this.aBoolean623 = true;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BIZZ)V")
	public final void method7290(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.bf != arg0) {
			if (arg0 < 0) {
				this.method7209();
				this.method7167(null);
				this.method7266(0);
				if (!this.aBoolean618) {
					this.method7187(0, 0, arg2, arg1, 0);
				}
			} else {
				@Pc(13) Interface20 local13 = this.aClass105_3.method2151(arg0);
				@Pc(19) Class76 local19 = super.anInterface7_14.method5209(arg0);
				if (local19.aByte19 == 0 && local19.aByte20 == 0) {
					this.method7209();
				} else {
					@Pc(32) int local32 = local19.aBoolean105 ? 64 : 128;
					@Pc(36) int local36 = local32 * 50;
					@Pc(40) Class34_Sub3 local40 = this.method7261();
					local40.method3763((float) (local19.aByte19 * (this.anInt8920 % local36)) / (float) local36, (float) (local19.aByte20 * (this.anInt8920 % local36)) / (float) local36, 0.0F);
					this.method7181(Static478.aClass168_6);
				}
				if (!this.aBoolean618) {
					this.method7187(local19.anInt1601, local19.aByte22, arg2, arg1, local19.aByte24);
				}
				if (this.aClass92_3 == null) {
					this.method7167(local13);
					this.method7266(local19.anInt1602);
				} else {
					this.aClass92_3.method7754(local19.anInt1602, local13);
				}
			}
			this.bf = arg0;
		}
		this.anInt8900 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "(Z)V")
	private void method7291() {
		this.method7278();
		this.method7179();
		this.method7191();
		this.method7168();
		this.method7246();
		this.method7258();
		this.method7161();
		this.method7176();
		this.method7229();
		this.method7293();
		this.method7256();
		this.method7162();
		this.method7279();
		this.method7177();
		for (@Pc(52) int local52 = this.anInt8922 - 1; local52 >= 0; local52--) {
			this.method7245(local52);
			this.method7212();
			this.method7222();
			this.method7209();
		}
		this.method7182();
		this.method7234();
		this.method7175();
		this.method7203();
		this.method7267();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!il;[Lclient!me;Z)Lclient!ta;")
	@Override
	public final Class56 method7123(@OriginalArg(0) Class146 arg0, @OriginalArg(1) Class196[] arg1) {
		return new Class56_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!sv", name = "Y", descriptor = "(I)V")
	public final void method7292() {
		this.method7218(2, Static221.aClass107_6);
	}

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "(B)V")
	protected abstract void method7293();

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "(B)V")
	private void method7294() {
		if (this.aBoolean614) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray56;
		@Pc(17) float local17 = (float) (-this.anInt8915 * this.anInt8893) / (float) this.anInt8904;
		@Pc(32) float local32 = (float) ((this.anInt8869 - this.anInt8915) * this.anInt8893) / (float) this.anInt8904;
		@Pc(43) float local43 = (float) (this.anInt8893 * this.anInt8908) / (float) this.anInt8892;
		@Pc(58) float local58 = (float) (this.anInt8893 * (this.anInt8908 - this.anInt8864)) / (float) this.anInt8892;
		if (local32 == local17 || local43 == local58) {
			local5[1] = 0.0F;
			local5[7] = 0.0F;
			local5[11] = 0.0F;
			local5[13] = 0.0F;
			local5[3] = 0.0F;
			local5[10] = 1.0F;
			local5[6] = 0.0F;
			local5[9] = 0.0F;
			local5[15] = 1.0F;
			local5[5] = 1.0F;
			local5[0] = 1.0F;
			local5[12] = 0.0F;
			local5[8] = 0.0F;
			local5[2] = 0.0F;
			local5[14] = 0.0F;
			local5[4] = 0.0F;
		} else {
			@Pc(72) float local72 = (float) this.anInt8893 * 2.0F;
			local5[15] = 0.0F;
			local5[3] = 0.0F;
			local5[0] = local72 / (local32 - local17);
			local5[10] = this.aFloat195 = (float) this.anInt8906 / (float) (this.anInt8893 - this.anInt8906);
			local5[5] = local72 / (local43 - local58);
			local5[7] = 0.0F;
			local5[8] = (local32 + local17) / (-local17 + local32);
			local5[6] = 0.0F;
			local5[4] = 0.0F;
			local5[12] = 0.0F;
			local5[13] = 0.0F;
			local5[14] = this.aFloat198 = (float) (this.anInt8906 * this.anInt8893) / (float) (this.anInt8893 - this.anInt8906);
			local5[2] = 0.0F;
			local5[9] = (local58 + local43) / (-local58 + local43);
			local5[1] = 0.0F;
			local5[11] = -1.0F;
		}
		this.method7236();
		this.aBoolean614 = true;
	}

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "(Z)Lclient!km;")
	public final Class34_Sub3 method7295() {
		return this.aClass34_Sub3_19;
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(ZZ)V")
	public final void method7296(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean615 != arg0) {
			this.aBoolean615 = arg0;
			this.method7293();
			this.anInt8900 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILclient!vp;)V")
	public abstract void method7297(@OriginalArg(1) int arg0, @OriginalArg(2) Interface23 arg1);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILclient!fo;I)V")
	public abstract void method7298(@OriginalArg(1) int arg0, @OriginalArg(2) Class107 arg1, @OriginalArg(3) int arg2);
}
