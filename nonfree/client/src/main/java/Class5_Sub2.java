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

@OriginalClass("client!uv")
public abstract class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!uv", name = "y", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!uv", name = "D", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!uv", name = "M", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!uv", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!uv", name = "tc", descriptor = "Lclient!mt;")
	protected Class211 aClass211_6;

	@OriginalMember(owner = "client!uv", name = "Zd", descriptor = "I")
	public int anInt4852;

	@OriginalMember(owner = "client!uv", name = "ae", descriptor = "I")
	protected int anInt4853;

	@OriginalMember(owner = "client!uv", name = "ce", descriptor = "I")
	public int anInt4854;

	@OriginalMember(owner = "client!uv", name = "oe", descriptor = "I")
	public int anInt4857;

	@OriginalMember(owner = "client!uv", name = "qe", descriptor = "F")
	private float aFloat90;

	@OriginalMember(owner = "client!uv", name = "se", descriptor = "I")
	public int anInt4859;

	@OriginalMember(owner = "client!uv", name = "ve", descriptor = "Z")
	protected boolean aBoolean376;

	@OriginalMember(owner = "client!uv", name = "ye", descriptor = "Z")
	protected boolean aBoolean378;

	@OriginalMember(owner = "client!uv", name = "ze", descriptor = "Z")
	public boolean aBoolean379;

	@OriginalMember(owner = "client!uv", name = "Ae", descriptor = "I")
	public int anInt4862;

	@OriginalMember(owner = "client!uv", name = "Be", descriptor = "I")
	protected int anInt4863;

	@OriginalMember(owner = "client!uv", name = "Fe", descriptor = "Z")
	public boolean aBoolean381;

	@OriginalMember(owner = "client!uv", name = "Ue", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!uv", name = "Ve", descriptor = "[Lclient!il;")
	protected Class144[] aClass144Array5;

	@OriginalMember(owner = "client!uv", name = "We", descriptor = "Lclient!bl;")
	public Interface4 anInterface4_3;

	@OriginalMember(owner = "client!uv", name = "Ye", descriptor = "Z")
	public boolean aBoolean386;

	@OriginalMember(owner = "client!uv", name = "cf", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!uv", name = "hf", descriptor = "[Lclient!cba;")
	protected Class6_Sub10[] aClass6_Sub10Array5;

	@OriginalMember(owner = "client!uv", name = "jf", descriptor = "Lclient!ew;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!uv", name = "lf", descriptor = "I")
	private int anInt4875;

	@OriginalMember(owner = "client!uv", name = "tf", descriptor = "I")
	public int anInt4880;

	@OriginalMember(owner = "client!uv", name = "uf", descriptor = "[Lclient!og;")
	protected Class115_Sub3[] aClass115_Sub3Array3;

	@OriginalMember(owner = "client!uv", name = "vf", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!uv", name = "zf", descriptor = "Lclient!jv;")
	private Class31_Sub2 aClass31_Sub2_3;

	@OriginalMember(owner = "client!uv", name = "Af", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!uv", name = "Cf", descriptor = "[Lclient!bl;")
	private Interface4[] anInterface4Array3;

	@OriginalMember(owner = "client!uv", name = "Ef", descriptor = "I")
	protected int anInt4884;

	@OriginalMember(owner = "client!uv", name = "Lf", descriptor = "F")
	private float aFloat100;

	@OriginalMember(owner = "client!uv", name = "Nf", descriptor = "I")
	protected int anInt4887;

	@OriginalMember(owner = "client!uv", name = "Sf", descriptor = "I")
	private int anInt4889;

	@OriginalMember(owner = "client!uv", name = "Tf", descriptor = "Lclient!fea;")
	private Class97 aClass97_3;

	@OriginalMember(owner = "client!uv", name = "Yf", descriptor = "[Lclient!il;")
	protected Class144[] aClass144Array6;

	@OriginalMember(owner = "client!uv", name = "ag", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!uv", name = "dg", descriptor = "[Lclient!qc;")
	protected Class272[] aClass272Array3;

	@OriginalMember(owner = "client!uv", name = "gg", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!uv", name = "hg", descriptor = "I")
	protected int anInt4895;

	@OriginalMember(owner = "client!uv", name = "ig", descriptor = "Lclient!qw;")
	public Class92_Sub3 aClass92_Sub3_21;

	@OriginalMember(owner = "client!uv", name = "jg", descriptor = "Lclient!qw;")
	public Class92_Sub3 aClass92_Sub3_22;

	@OriginalMember(owner = "client!uv", name = "kg", descriptor = "Lclient!qw;")
	public Class92_Sub3 aClass92_Sub3_23;

	@OriginalMember(owner = "client!uv", name = "lg", descriptor = "Lclient!tea;")
	private Interface26 anInterface26_10;

	@OriginalMember(owner = "client!uv", name = "mg", descriptor = "Lclient!qa;")
	private Class270 aClass270_16;

	@OriginalMember(owner = "client!uv", name = "ng", descriptor = "Lclient!qa;")
	public Class270 aClass270_17;

	@OriginalMember(owner = "client!uv", name = "og", descriptor = "Lclient!qa;")
	private Class270 aClass270_18;

	@OriginalMember(owner = "client!uv", name = "pg", descriptor = "Lclient!qw;")
	public Class92_Sub3 aClass92_Sub3_24;

	@OriginalMember(owner = "client!uv", name = "qg", descriptor = "Lclient!qw;")
	public Class92_Sub3 aClass92_Sub3_25;

	@OriginalMember(owner = "client!uv", name = "rg", descriptor = "Lclient!qw;")
	public Class92_Sub3 aClass92_Sub3_26;

	@OriginalMember(owner = "client!uv", name = "sg", descriptor = "Lclient!qa;")
	public Class270 aClass270_19;

	@OriginalMember(owner = "client!uv", name = "tg", descriptor = "Lclient!tea;")
	private Interface26 anInterface26_11;

	@OriginalMember(owner = "client!uv", name = "ug", descriptor = "Lclient!qw;")
	public Class92_Sub3 aClass92_Sub3_27;

	@OriginalMember(owner = "client!uv", name = "vg", descriptor = "Lclient!qw;")
	public Class92_Sub3 aClass92_Sub3_28;

	@OriginalMember(owner = "client!uv", name = "xg", descriptor = "Lclient!qa;")
	public Class270 aClass270_20;

	@OriginalMember(owner = "client!uv", name = "yg", descriptor = "Lclient!qw;")
	public Class92_Sub3 aClass92_Sub3_29;

	@OriginalMember(owner = "client!uv", name = "zg", descriptor = "Lclient!ug;")
	private Interface27 anInterface27_6;

	@OriginalMember(owner = "client!uv", name = "Ag", descriptor = "Lclient!tea;")
	private Interface26 anInterface26_12;

	@OriginalMember(owner = "client!uv", name = "Bg", descriptor = "Lclient!qa;")
	public Class270 aClass270_21;

	@OriginalMember(owner = "client!uv", name = "Cg", descriptor = "Lclient!qa;")
	private Class270 aClass270_22;

	@OriginalMember(owner = "client!uv", name = "Dg", descriptor = "Lclient!qw;")
	public Class92_Sub3 aClass92_Sub3_30;

	@OriginalMember(owner = "client!uv", name = "Eg", descriptor = "I")
	private int anInt4896;

	@OriginalMember(owner = "client!uv", name = "Fg", descriptor = "Z")
	protected boolean aBoolean394;

	@OriginalMember(owner = "client!uv", name = "Mc", descriptor = "Lclient!kba;")
	private final Class163 aClass163_23 = new Class163();

	@OriginalMember(owner = "client!uv", name = "be", descriptor = "Z")
	protected boolean aBoolean373 = true;

	@OriginalMember(owner = "client!uv", name = "ee", descriptor = "Lclient!og;")
	protected final Class115_Sub3 aClass115_Sub3_15 = new Class115_Sub3();

	@OriginalMember(owner = "client!uv", name = "fe", descriptor = "Lclient!og;")
	public Class115_Sub3 aClass115_Sub3_16 = new Class115_Sub3();

	@OriginalMember(owner = "client!uv", name = "ge", descriptor = "Lclient!og;")
	public final Class115_Sub3 aClass115_Sub3_17 = new Class115_Sub3();

	@OriginalMember(owner = "client!uv", name = "he", descriptor = "Lclient!og;")
	protected final Class115_Sub3 aClass115_Sub3_18 = new Class115_Sub3();

	@OriginalMember(owner = "client!uv", name = "ie", descriptor = "Lclient!og;")
	private final Class115_Sub3 aClass115_Sub3_19 = new Class115_Sub3();

	@OriginalMember(owner = "client!uv", name = "je", descriptor = "Lclient!og;")
	private final Class115_Sub3 aClass115_Sub3_20 = new Class115_Sub3();

	@OriginalMember(owner = "client!uv", name = "le", descriptor = "F")
	public float aFloat89 = 1.0F;

	@OriginalMember(owner = "client!uv", name = "re", descriptor = "Z")
	protected boolean aBoolean375 = true;

	@OriginalMember(owner = "client!uv", name = "xe", descriptor = "F")
	private float aFloat91 = 1.0F;

	@OriginalMember(owner = "client!uv", name = "Ge", descriptor = "Z")
	private boolean aBoolean382 = false;

	@OriginalMember(owner = "client!uv", name = "me", descriptor = "Z")
	private boolean aBoolean374 = false;

	@OriginalMember(owner = "client!uv", name = "Oe", descriptor = "I")
	protected final int anInt4866 = 0;

	@OriginalMember(owner = "client!uv", name = "Te", descriptor = "I")
	private int anInt4870 = -1;

	@OriginalMember(owner = "client!uv", name = "Me", descriptor = "F")
	public float aFloat93 = 1.0F;

	@OriginalMember(owner = "client!uv", name = "ke", descriptor = "I")
	private int anInt4856 = -1;

	@OriginalMember(owner = "client!uv", name = "De", descriptor = "Z")
	private boolean aBoolean380 = false;

	@OriginalMember(owner = "client!uv", name = "ne", descriptor = "Lclient!nga;")
	protected Class220 aClass220_4 = Static445.aClass220_7;

	@OriginalMember(owner = "client!uv", name = "Re", descriptor = "I")
	public int anInt4869 = -1;

	@OriginalMember(owner = "client!uv", name = "gf", descriptor = "[F")
	public final float[] aFloatArray49 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!uv", name = "ue", descriptor = "I")
	protected int anInt4861 = 0;

	@OriginalMember(owner = "client!uv", name = "xf", descriptor = "I")
	private int anInt4881 = 0;

	@OriginalMember(owner = "client!uv", name = "we", descriptor = "Z")
	protected boolean aBoolean377 = true;

	@OriginalMember(owner = "client!uv", name = "Ke", descriptor = "Z")
	private boolean aBoolean384 = false;

	@OriginalMember(owner = "client!uv", name = "wf", descriptor = "F")
	public float aFloat98 = 1.0F;

	@OriginalMember(owner = "client!uv", name = "Je", descriptor = "I")
	public int anInt4864 = 3;

	@OriginalMember(owner = "client!uv", name = "Ie", descriptor = "[F")
	public final float[] aFloatArray46 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!uv", name = "Ze", descriptor = "I")
	public int anInt4872 = 512;

	@OriginalMember(owner = "client!uv", name = "Hf", descriptor = "I")
	protected final int anInt4885 = 0;

	@OriginalMember(owner = "client!uv", name = "Ff", descriptor = "Z")
	protected boolean aBoolean389 = false;

	@OriginalMember(owner = "client!uv", name = "mf", descriptor = "I")
	public int anInt4876 = 0;

	@OriginalMember(owner = "client!uv", name = "pf", descriptor = "[F")
	private final float[] aFloatArray50 = new float[16];

	@OriginalMember(owner = "client!uv", name = "Le", descriptor = "I")
	protected int anInt4865 = 0;

	@OriginalMember(owner = "client!uv", name = "nf", descriptor = "I")
	protected int anInt4877 = 0;

	@OriginalMember(owner = "client!uv", name = "yf", descriptor = "[Lclient!ew;")
	private final Class57[] aClass57Array3 = new Class57[10];

	@OriginalMember(owner = "client!uv", name = "bf", descriptor = "F")
	public float bf = 1.0F;

	@OriginalMember(owner = "client!uv", name = "rf", descriptor = "Z")
	protected boolean aBoolean388 = true;

	@OriginalMember(owner = "client!uv", name = "He", descriptor = "Z")
	protected boolean aBoolean383 = true;

	@OriginalMember(owner = "client!uv", name = "Gf", descriptor = "Z")
	private boolean aBoolean390 = false;

	@OriginalMember(owner = "client!uv", name = "af", descriptor = "[F")
	private final float[] aFloatArray48 = new float[16];

	@OriginalMember(owner = "client!uv", name = "Qf", descriptor = "Z")
	private boolean aBoolean391 = false;

	@OriginalMember(owner = "client!uv", name = "sf", descriptor = "I")
	public int anInt4879 = 128;

	@OriginalMember(owner = "client!uv", name = "Rf", descriptor = "I")
	private int anInt4888 = 1;

	@OriginalMember(owner = "client!uv", name = "pe", descriptor = "I")
	public int anInt4858 = 8;

	@OriginalMember(owner = "client!uv", name = "df", descriptor = "I")
	public int anInt4873 = 512;

	@OriginalMember(owner = "client!uv", name = "qf", descriptor = "I")
	protected int anInt4878 = 3584;

	@OriginalMember(owner = "client!uv", name = "Of", descriptor = "[F")
	private final float[] aFloatArray52 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!uv", name = "Pf", descriptor = "F")
	public float aFloat101 = -1.0F;

	@OriginalMember(owner = "client!uv", name = "Kf", descriptor = "Lclient!iia;")
	protected Class142 aClass142_6 = Static181.aClass142_5;

	@OriginalMember(owner = "client!uv", name = "ef", descriptor = "F")
	public float aFloat96 = -1.0F;

	@OriginalMember(owner = "client!uv", name = "Zf", descriptor = "I")
	public int anInt4893 = 50;

	@OriginalMember(owner = "client!uv", name = "ff", descriptor = "I")
	private int anInt4874 = 0;

	@OriginalMember(owner = "client!uv", name = "Pe", descriptor = "I")
	protected int anInt4867 = 0;

	@OriginalMember(owner = "client!uv", name = "Xe", descriptor = "I")
	public int anInt4871 = 0;

	@OriginalMember(owner = "client!uv", name = "Mf", descriptor = "[F")
	private final float[] aFloatArray51 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!uv", name = "Wf", descriptor = "Z")
	protected boolean aBoolean392 = false;

	@OriginalMember(owner = "client!uv", name = "If", descriptor = "I")
	private int anInt4886 = 16777215;

	@OriginalMember(owner = "client!uv", name = "Vf", descriptor = "I")
	public int anInt4891 = -1;

	@OriginalMember(owner = "client!uv", name = "Df", descriptor = "I")
	private int anInt4883 = 0;

	@OriginalMember(owner = "client!uv", name = "kf", descriptor = "Z")
	protected boolean aBoolean387 = true;

	@OriginalMember(owner = "client!uv", name = "Xf", descriptor = "I")
	protected int anInt4892 = 0;

	@OriginalMember(owner = "client!uv", name = "bg", descriptor = "F")
	public float aFloat103 = 3584.0F;

	@OriginalMember(owner = "client!uv", name = "Ee", descriptor = "F")
	public float aFloat92 = 3584.0F;

	@OriginalMember(owner = "client!uv", name = "Uf", descriptor = "I")
	private int anInt4890 = 0;

	@OriginalMember(owner = "client!uv", name = "fg", descriptor = "[F")
	private final float[] aFloatArray53 = new float[16];

	@OriginalMember(owner = "client!uv", name = "Ne", descriptor = "Z")
	protected boolean aBoolean385 = false;

	@OriginalMember(owner = "client!uv", name = "te", descriptor = "I")
	private int anInt4860 = -1;

	@OriginalMember(owner = "client!uv", name = "Se", descriptor = "[F")
	private final float[] aFloatArray47 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!uv", name = "Ce", descriptor = "[F")
	protected float[] aFloatArray45 = this.aFloatArray47;

	@OriginalMember(owner = "client!uv", name = "cg", descriptor = "Z")
	protected boolean aBoolean393 = false;

	@OriginalMember(owner = "client!uv", name = "eg", descriptor = "I")
	public int anInt4894 = 0;

	@OriginalMember(owner = "client!uv", name = "of", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream3 = new Stream();

	@OriginalMember(owner = "client!uv", name = "wg", descriptor = "Lclient!og;")
	private final Class115_Sub3 aClass115_Sub3_21 = new Class115_Sub3();

	@OriginalMember(owner = "client!uv", name = "Fc", descriptor = "Ljava/lang/Object;")
	protected final Object anObject9;

	@OriginalMember(owner = "client!uv", name = "Wd", descriptor = "Ljava/lang/Object;")
	private Object anObject10;

	@OriginalMember(owner = "client!uv", name = "Md", descriptor = "Lclient!ni;")
	protected final Class223 aClass223_53;

	@OriginalMember(owner = "client!uv", name = "Tc", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas9;

	@OriginalMember(owner = "client!uv", name = "bb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!uv", name = "Bf", descriptor = "I")
	protected final int anInt4882;

	@OriginalMember(owner = "client!uv", name = "md", descriptor = "I")
	private int anInt4815;

	@OriginalMember(owner = "client!uv", name = "Hc", descriptor = "I")
	public int anInt4786;

	@OriginalMember(owner = "client!uv", name = "Qe", descriptor = "I")
	public final int anInt4868;

	@OriginalMember(owner = "client!uv", name = "Td", descriptor = "I")
	private int anInt4847;

	@OriginalMember(owner = "client!uv", name = "Nb", descriptor = "I")
	public int anInt4743;

	@OriginalMember(owner = "client!uv", name = "Jf", descriptor = "Lclient!tl;")
	private final Class326 aClass326_3;

	@OriginalMember(owner = "client!uv", name = "Ib", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!ni;II)V")
	protected Class5_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class223 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anObject10 = this.anObject9 = arg1;
			this.aClass223_53 = arg3;
			this.aCanvas8 = this.aCanvas9 = arg0;
			this.anInt4882 = arg4;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt4786 = this.anInt4815 = local307.height;
			this.anInt4868 = arg5;
			this.anInt4743 = this.anInt4847 = local307.width;
			Static181.method3397(false, true);
			if (super.anInterface7_10 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt4868);
				this.aClass326_3 = null;
			} else {
				this.aClass326_3 = new Class326(this, super.anInterface7_10);
				this.aNativeInterface3 = new NativeInterface(super.anInterface7_10.method6932(), this.anInt4868);
				for (@Pc(352) int local352 = 0; local352 < super.anInterface7_10.method6932(); local352++) {
					@Pc(360) Class254 local360 = super.anInterface7_10.method6931(local352);
					if (local360 != null) {
						this.aNativeInterface3.initTextureMetrics(local352, local360.aByte98, local360.aByte97);
					}
				}
			}
		} catch (@Pc(391) Throwable local391) {
			local391.printStackTrace();
			this.method6106();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	private void method3936() {
		if (this.aBoolean391) {
			return;
		}
		@Pc(15) float[] local15 = this.aFloatArray53;
		@Pc(27) float local27 = (float) (this.anInt4893 * -this.anInt4894) / (float) this.anInt4873;
		@Pc(42) float local42 = (float) ((this.anInt4743 - this.anInt4894) * this.anInt4893) / (float) this.anInt4873;
		@Pc(53) float local53 = (float) (this.anInt4871 * this.anInt4893) / (float) this.anInt4872;
		@Pc(68) float local68 = (float) ((this.anInt4871 - this.anInt4786) * this.anInt4893) / (float) this.anInt4872;
		if (local27 == local42 || local68 == local53) {
			local15[13] = 0.0F;
			local15[8] = 0.0F;
			local15[2] = 0.0F;
			local15[7] = 0.0F;
			local15[3] = 0.0F;
			local15[11] = 0.0F;
			local15[5] = 1.0F;
			local15[1] = 0.0F;
			local15[0] = 1.0F;
			local15[12] = 0.0F;
			local15[9] = 0.0F;
			local15[14] = 0.0F;
			local15[6] = 0.0F;
			local15[4] = 0.0F;
			local15[10] = 1.0F;
			local15[15] = 1.0F;
		} else {
			@Pc(82) float local82 = (float) this.anInt4893 * 2.0F;
			local15[1] = 0.0F;
			local15[13] = 0.0F;
			local15[11] = -1.0F;
			local15[6] = 0.0F;
			local15[5] = local82 / (local53 - local68);
			local15[8] = (local27 + local42) / (-local27 + local42);
			local15[0] = local82 / (local42 - local27);
			local15[2] = 0.0F;
			local15[4] = 0.0F;
			local15[9] = (local68 + local53) / (-local68 + local53);
			local15[7] = 0.0F;
			local15[14] = this.aFloat90 = (float) (this.anInt4893 * this.anInt4878) / (float) (this.anInt4893 - this.anInt4878);
			local15[3] = 0.0F;
			local15[12] = 0.0F;
			local15[10] = this.aFloat100 = (float) this.anInt4878 / (float) (this.anInt4893 - this.anInt4878);
			local15[15] = 0.0F;
		}
		this.method3973();
		this.aBoolean391 = true;
	}

	@OriginalMember(owner = "client!uv", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean388 = arg0;
		this.method3975();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZ[[II)Lclient!td;")
	public abstract Interface24 method3937(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)V")
	public final void method3938() {
		this.aBoolean373 = false;
		this.method4058();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method3939(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!uv", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt4877) {
			local5 = true;
			this.anInt4877 = arg0;
		}
		if (this.anInt4865 > arg2) {
			this.anInt4865 = arg2;
			local5 = true;
		}
		if (this.anInt4861 < arg1) {
			this.anInt4861 = arg1;
			local5 = true;
		}
		if (arg3 < this.anInt4892) {
			local5 = true;
			this.anInt4892 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean394) {
			this.aBoolean394 = true;
			this.method4033();
		}
		this.method4012();
		this.method4051();
	}

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "(I)V")
	public final void method3940() {
		if (this.anInt4889 == 16) {
			return;
		}
		this.method3955();
		this.method4031(true);
		this.method4016(true);
		this.method4000(true);
		this.method4004(1);
		this.anInt4889 = 16;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V")
	private void method3941() {
		if (Static332.aClass220_6 == this.aClass220_4) {
			return;
		}
		@Pc(10) Class220 local10 = this.aClass220_4;
		this.aClass220_4 = Static332.aClass220_6;
		if (!local10.method5917()) {
			this.method3964();
		}
		this.method3936();
		this.aFloatArray45 = this.aFloatArray53;
		this.method3965();
		this.anInt4889 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "(I)Lclient!td;")
	public final Interface24 method3942() {
		return this.aClass31_Sub2_3 == null ? null : this.aClass31_Sub2_3.method2624();
	}

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "(I)V")
	@Override
	public final void method6170(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(B)V")
	public final void method3943() {
		this.method3995();
		this.method3965();
	}

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "(I)V")
	protected void method3944() {
		this.method3978();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!kt;Lclient!kq;)Z")
	public abstract boolean method3945(@OriginalArg(1) Class178 arg0, @OriginalArg(2) Class176 arg1);

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "(I)V")
	private void method3946() {
		this.aBoolean391 = false;
		this.method3936();
		if (Static332.aClass220_6 == this.aClass220_4) {
			this.method3965();
		}
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)V")
	@Override
	public final void method6137(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uv", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6158(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	protected abstract void method3947(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BZ)V")
	public final void method3948(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean383) {
			this.aBoolean383 = arg0;
			this.method4002();
		}
	}

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "(I)V")
	private void method3949() {
		if (this.anInt4889 == 1) {
			return;
		}
		this.method3996();
		this.method4031(false);
		this.method3982(false);
		this.method4016(false);
		this.method4000(false);
		this.method4042(false, -2, false);
		this.method4018(1);
		this.method4008(this.anInterface4_3);
		this.anInt4889 = 1;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZI)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method3950(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap5.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!uv", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3949();
		this.method3987(arg3);
		this.method4054(0, Static347.aClass80_2);
		this.method3956(Static347.aClass80_2, 0);
		this.method4004(arg4);
		this.aClass115_Sub3_15.method6318((float) arg2, (float) arg2, 1.0F);
		this.aClass115_Sub3_15.method6296(arg0, arg1, 0);
		this.method3938();
		this.method4062(false);
		this.method3974(0, this.anInterface26_10);
		this.method4045(this.aClass270_22);
		this.method4040(Static258.aClass248_6, 0, 256);
		this.method4062(true);
		this.method3956(Static522.aClass80_4, 0);
		this.method4054(0, Static522.aClass80_4);
	}

	@OriginalMember(owner = "client!uv", name = "p", descriptor = "(I)I")
	public final int method3951() {
		return this.anInt4856;
	}

	@OriginalMember(owner = "client!uv", name = "q", descriptor = "(I)V")
	public final void method3952() {
		if (this.anInt4889 == 4) {
			return;
		}
		this.method3996();
		this.method4031(false);
		this.method3982(false);
		this.method4016(false);
		this.method4000(false);
		this.method4042(false, -2, false);
		this.method4004(1);
		this.method4018(0);
		this.anInt4889 = 4;
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(B)V")
	protected abstract void method3953();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)V")
	public final void method3954(@OriginalArg(1) int arg0) {
		if (this.anInt4867 != arg0) {
			this.anInt4867 = arg0;
			this.method3953();
		}
	}

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "(I)V")
	private void method3955() {
		if (this.aClass220_4 == Static287.aClass220_5) {
			return;
		}
		@Pc(6) Class220 local6 = this.aClass220_4;
		this.aClass220_4 = Static287.aClass220_5;
		if (!local6.method5917()) {
			this.method3964();
		}
		this.method4003();
		this.aFloatArray45 = this.aFloatArray50;
		this.method3965();
		this.anInt4889 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!ef;I)V")
	public final void method3956(@OriginalArg(1) Class80 arg0, @OriginalArg(2) int arg1) {
		this.method4050(arg1, arg0);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)V")
	public final void method3957(@OriginalArg(1) byte arg0) {
		this.method3987(arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16);
	}

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "()Z")
	@Override
	public final boolean method6151() {
		return true;
	}

	@OriginalMember(owner = "client!uv", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4883 = arg3;
		this.aBoolean379 = true;
		this.anInt4856 = arg2;
		this.anInt4860 = arg1;
		this.anInt4875 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "(I)V")
	protected abstract void method3958();

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(B)Lclient!og;")
	public final Class115_Sub3 method3959() {
		return this.aClass115_Sub3_18;
	}

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "(B)Lclient!og;")
	public final Class115_Sub3 method3960() {
		return this.aClass115_Sub3Array3[this.anInt4867];
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIZ)Lclient!ufa;")
	@Override
	public final Class4 method6102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class4_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt4893 && this.anInt4878 == arg1) {
			return;
		}
		this.anInt4893 = arg0;
		this.anInt4878 = arg1;
		this.method3946();
		this.method4041();
		this.method4023();
	}

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "(B)V")
	protected abstract void method3961();

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "(I)V")
	protected abstract void method3962();

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6145(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas9) {
			local5 = this.anObject10;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method3991(arg0, local5);
		if (arg0 == this.aCanvas8) {
			this.method4006();
		}
	}

	@OriginalMember(owner = "client!uv", name = "u", descriptor = "(I)V")
	public final void method3963() {
		this.aClass115_Sub3_15.method6281();
		this.aBoolean373 = true;
		this.method4058();
	}

	@OriginalMember(owner = "client!uv", name = "v", descriptor = "(I)V")
	private void method3964() {
		this.aBoolean390 = false;
		if (this.aClass57_3 != null) {
			this.aClass57_3.method8701();
		}
		this.method4024();
	}

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "(I)V")
	private void method3965() {
		this.method3969();
		if (this.aClass57_3 != null) {
			this.aClass57_3.method8704();
		}
	}

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "(II)Lclient!ug;")
	public final Interface27 method3966(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface27_6.method8094()) {
			this.anInterface27_6.method8101(arg0);
		}
		return this.anInterface27_6;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method6171(@OriginalArg(0) Class6_Sub16 arg0) {
		this.aNativeHeap5 = ((Class6_Sub16_Sub1) arg0).aNativeHeap4;
		this.aNativeHeapBuffer4 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!cm;B)V")
	public abstract void method3967(@OriginalArg(0) Class52 arg0);

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(Z)V")
	public final void method3968() {
		this.aClass144Array5 = new Class144[this.anInt4880];
		this.aClass115_Sub3Array3 = new Class115_Sub3[this.anInt4880];
		this.anInterface4Array3 = new Interface4[this.anInt4880];
		this.aClass144Array6 = new Class144[this.anInt4880];
		this.aClass272Array3 = new Class272[this.anInt4880];
		for (@Pc(32) int local32 = 0; local32 < this.anInt4880; local32++) {
			this.aClass144Array6[local32] = Static438.aClass144_3;
			this.aClass144Array5[local32] = Static438.aClass144_3;
			this.aClass272Array3[local32] = Static356.aClass272_5;
			this.aClass115_Sub3Array3[local32] = new Class115_Sub3();
		}
		this.aClass6_Sub10Array5 = new Class6_Sub10[this.anInt4863 - 2];
		this.anInterface4_3 = this.method4009(1, 1, Static120.aClass178_4, Static302.aClass176_8);
		this.method6171(new Class6_Sub16_Sub1(262144));
		this.aClass270_20 = this.method3985(new Class63[] { new Class63(new Class183[] { Static315.aClass183_1, Static315.aClass183_5 }) });
		this.aClass270_19 = this.method3985(new Class63[] { new Class63(new Class183[] { Static315.aClass183_1, Static315.aClass183_3 }) });
		this.aClass270_17 = this.method3985(new Class63[] { new Class63(Static315.aClass183_1), new Class63(Static315.aClass183_3), new Class63(Static315.aClass183_5), new Class63(Static315.aClass183_2) });
		this.aClass270_21 = this.method3985(new Class63[] { new Class63(Static315.aClass183_1), new Class63(Static315.aClass183_3), new Class63(Static315.aClass183_5) });
		this.aClass92_Sub3_24 = new Class92_Sub3(this, 0, 0, false, false);
		this.aClass92_Sub3_29 = new Class92_Sub3(this, 0, 0, true, true);
		this.aClass92_Sub3_26 = new Class92_Sub3(this, 0, 0, false, false);
		this.aClass92_Sub3_23 = new Class92_Sub3(this, 0, 0, true, true);
		this.aClass92_Sub3_27 = new Class92_Sub3(this, 0, 0, false, false);
		this.aClass92_Sub3_25 = new Class92_Sub3(this, 0, 0, true, true);
		this.aClass92_Sub3_21 = new Class92_Sub3(this, 0, 0, false, false);
		this.aClass92_Sub3_22 = new Class92_Sub3(this, 0, 0, true, true);
		this.aClass92_Sub3_30 = new Class92_Sub3(this, 0, 0, false, false);
		this.aClass92_Sub3_28 = new Class92_Sub3(this, 0, 0, true, true);
		this.aClass97_3 = new Class97(this);
		this.anInterface27_6 = this.method3993(true);
		this.method4067();
		this.aClass211_6 = new Class211(this);
		this.aClass57Array3[1] = this.method4070(1);
		this.aClass57Array3[2] = this.method4070(2);
		this.aClass57Array3[4] = this.method4070(4);
		this.aClass57Array3[5] = this.method4070(5);
		this.aClass57Array3[6] = this.method4070(6);
		this.aClass57Array3[7] = this.method4070(7);
		this.aClass57Array3[3] = this.method4070(3);
		this.aClass57Array3[8] = this.method4070(8);
		this.aClass57Array3[9] = this.method4070(9);
		if (!this.aClass57Array3[2].method8709()) {
			this.aClass57Array3[2] = this.method4070(0);
		}
		if (!this.aClass57Array3[4].method8709()) {
			this.aClass57Array3[4] = this.aClass57Array3[2];
		}
		if (!this.aClass57Array3[8].method8709()) {
			this.aClass57Array3[8] = this.aClass57Array3[4];
		}
		if (!this.aClass57Array3[9].method8709()) {
			this.aClass57Array3[9] = this.aClass57Array3[8];
		}
		this.method3944();
		this.la();
		this.method6180();
	}

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "(B)V")
	protected abstract void method3969();

	@OriginalMember(owner = "client!uv", name = "x", descriptor = "(I)I")
	public final int method3970() {
		return this.anInt4867;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIZLclient!kt;III[F)Lclient!js;")
	protected abstract Interface15 method3971(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class178 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) float[] arg4);

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "()Z")
	@Override
	public final boolean method6143() {
		return true;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!tw;Z)Lclient!ufa;")
	@Override
	public final Class4 method6121(@OriginalArg(0) Class331 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class4 local21;
		if (arg0.anInt9650 == 0 || arg0.anInt9648 == 0) {
			local21 = this.method6111(1, 1, new int[1], 1);
		} else {
			@Pc(30) int[] local30 = new int[arg0.anInt9648 * arg0.anInt9650];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			@Pc(39) int local39;
			@Pc(43) int local43;
			if (arg0.aByteArray94 == null) {
				for (local39 = 0; local39 < arg0.anInt9648; local39++) {
					for (local43 = 0; local43 < arg0.anInt9650; local43++) {
						@Pc(101) int local101 = arg0.anIntArray507[arg0.aByteArray93[local32++] & 0xFF];
						local30[local34++] = local101 == 0 ? 0 : local101 | 0xFF000000;
					}
				}
			} else {
				for (local39 = 0; local39 < arg0.anInt9648; local39++) {
					for (local43 = 0; local43 < arg0.anInt9650; local43++) {
						local30[local34++] = arg0.aByteArray94[local32] << 24 | arg0.anIntArray507[arg0.aByteArray93[local32] & 0xFF];
						local32++;
					}
				}
			}
			local21 = this.method6111(arg0.anInt9650, arg0.anInt9648, local30, arg0.anInt9650);
		}
		local21.method7703(arg0.anInt9652, arg0.anInt9649, arg0.anInt9647, arg0.anInt9651);
		return local21;
	}

	@OriginalMember(owner = "client!uv", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3949();
		this.method3987(arg4);
		this.method4054(0, Static347.aClass80_2);
		this.method3956(Static347.aClass80_2, 0);
		this.method4004(arg5);
		this.aClass115_Sub3_15.method6318((float) arg3, (float) arg2, 1.0F);
		this.aClass115_Sub3_15.method6296(arg0, arg1, 0);
		this.method3938();
		this.method4062(false);
		this.method4005();
		this.method4062(true);
		this.method3956(Static522.aClass80_4, 0);
		this.method4054(0, Static522.aClass80_4);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(FFFFFFI)Z")
	private boolean method3972(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface26_12.method8110();
		if (local9 == null) {
			return false;
		}
		@Pc(23) Stream local23 = this.method4046(local9);
		if (Stream.a()) {
			local23.b(arg2);
			local23.b(arg1);
			local23.b(arg5);
			local23.b(arg4);
			local23.b(arg3);
			local23.b(arg0);
		} else {
			local23.a(arg2);
			local23.a(arg1);
			local23.a(arg5);
			local23.a(arg4);
			local23.a(arg3);
			local23.a(arg0);
		}
		local23.c();
		return this.anInterface26_12.method8107();
	}

	@OriginalMember(owner = "client!uv", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt4864 = 0;
		while (arg0 > 1) {
			this.anInt4864++;
			arg0 >>= 0x1;
		}
		this.anInt4858 = 0x1 << this.anInt4864;
	}

	@OriginalMember(owner = "client!uv", name = "y", descriptor = "(I)V")
	private void method3973() {
		this.aFloatArray53[14] = this.aFloat90;
		this.aFloatArray53[10] = this.aFloat100;
		this.aFloat92 = ((float) -this.anInt4878 + this.aFloatArray53[14]) / this.aFloatArray53[10];
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZLclient!tea;)V")
	public abstract void method3974(@OriginalArg(0) int arg0, @OriginalArg(2) Interface26 arg1);

	@OriginalMember(owner = "client!uv", name = "z", descriptor = "(I)V")
	protected abstract void method3975();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!oq;IIILclient!ug;II)V")
	public abstract void method3976(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface27 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt4893;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6113(@OriginalArg(0) Canvas arg0) {
		this.anObject10 = null;
		this.aCanvas8 = null;
		if (arg0 == null || arg0 == this.aCanvas9) {
			this.anObject10 = this.anObject9;
			this.aCanvas8 = this.aCanvas9;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject10 = this.aHashtable5.get(arg0);
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.anObject10 == null) {
			throw new RuntimeException();
		}
		this.method3947(this.anObject10, this.aCanvas8);
		this.method4006();
	}

	@OriginalMember(owner = "client!uv", name = "A", descriptor = "(I)V")
	protected abstract void method3977();

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)Lclient!za;")
	@Override
	public final Class6_Sub16 method6125(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub16_Sub1 local8 = new Class6_Sub16_Sub1(arg0);
		this.aClass163_23.method4967(local8);
		return local8;
	}

	@OriginalMember(owner = "client!uv", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean379 = false;
	}

	@OriginalMember(owner = "client!uv", name = "B", descriptor = "(I)V")
	private void method3978() {
		this.method3994();
		this.method4007();
		this.method3958();
		this.method4038();
		this.method4068();
		this.method3992();
		this.method4028();
		this.method3977();
		this.method3975();
		this.method4002();
		this.method4010();
		this.method4036();
		this.method4019();
		this.method4049();
		for (@Pc(56) int local56 = this.anInt4880 - 1; local56 >= 0; local56--) {
			this.method3954(local56);
			this.method4014();
			this.method3961();
			this.method3988();
		}
		this.method4060();
		this.method4039();
		this.method3969();
		this.method3986();
		this.method4024();
	}

	@OriginalMember(owner = "client!uv", name = "C", descriptor = "(I)V")
	public final void method3979() {
		if (this.anInt4889 == 8) {
			return;
		}
		this.method3941();
		this.method4031(true);
		this.method4016(true);
		this.method4000(true);
		this.method4004(1);
		this.anInt4889 = 8;
	}

	@OriginalMember(owner = "client!uv", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean379) {
			throw new RuntimeException("");
		}
		this.anInt4883 = arg3;
		this.anInt4856 = arg2;
		this.anInt4860 = arg1;
		this.anInt4875 = arg0;
		if (this.aBoolean380) {
			this.aClass57Array3[3].method8711();
			this.aClass57Array3[3].method8702();
		}
	}

	@OriginalMember(owner = "client!uv", name = "v", descriptor = "()Z")
	@Override
	public final boolean method6182() {
		return true;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!kq;ZLclient!kt;)Z")
	public abstract boolean method3980(@OriginalArg(0) Class176 arg0, @OriginalArg(2) Class178 arg1);

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "()Z")
	@Override
	public final boolean method6173() {
		return false;
	}

	@OriginalMember(owner = "client!uv", name = "z", descriptor = "()Z")
	@Override
	public final boolean method6187() {
		return true;
	}

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "(B)Lclient!og;")
	public final Class115_Sub3 method3981() {
		return this.aClass115_Sub3_15;
	}

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "(I)V")
	@Override
	public void method6169(@OriginalArg(0) int arg0) {
		if (this.aClass326_3 != null) {
			this.aClass326_3.method7737();
		}
		this.anInt4859 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZI)V")
	public final void method3982(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean393) {
			this.aBoolean393 = arg0;
			this.method3958();
			this.anInt4889 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "()Lclient!hba;")
	@Override
	public final Class115 method6156() {
		return this.aClass115_Sub3_21;
	}

	@OriginalMember(owner = "client!uv", name = "D", descriptor = "(I)V")
	private void method3983() {
		this.aFloat103 = (float) this.anInt4878;
	}

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "(B)V")
	protected final void method3984() {
		@Pc(9) Enumeration local9 = this.aHashtable5.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method3939(this.aHashtable5.get(local15), local15);
		}
		this.anInterface26_11.method8104();
		this.anInterface26_12.method8104();
		this.anInterface26_10.method8104();
		this.aClass92_Sub3_29.method7083();
		this.aClass92_Sub3_23.method7083();
		this.aClass92_Sub3_25.method7083();
		this.aClass92_Sub3_22.method7083();
		this.aClass92_Sub3_28.method7083();
		this.aClass97_3.method3039();
		this.anInterface27_6.method8104();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "([Lclient!dia;I)Lclient!qa;")
	public abstract Class270 method3985(@OriginalArg(0) Class63[] arg0);

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6112(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "(B)V")
	protected abstract void method3986();

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "(II)V")
	public final void method3987(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt4895) {
			this.anInt4895 = arg0;
			this.method4060();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIIF)Lclient!cba;")
	@Override
	public final Class6_Sub10 method6128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub10_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!uv", name = "E", descriptor = "(I)V")
	public final void method3988() {
		if (this.aClass272Array3[this.anInt4867] != Static356.aClass272_5) {
			this.aClass272Array3[this.anInt4867] = Static356.aClass272_5;
			this.aClass115_Sub3Array3[this.anInt4867].method6281();
			this.method4017();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZB)V")
	public final void method3989(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean375 != arg0) {
			this.aBoolean375 = arg0;
			this.method4028();
		}
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(Z)V")
	private void method3990() {
		this.method3974(0, this.anInterface26_12);
		this.method4045(this.aClass270_16);
		this.method4040(Static572.aClass248_10, 0, 1);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	protected abstract void method3991(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!uv", name = "F", descriptor = "(I)V")
	protected abstract void method3992();

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(BZ)Lclient!ug;")
	public abstract Interface27 method3993(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!uv", name = "G", descriptor = "(I)V")
	protected abstract void method3994();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!hba;)V")
	@Override
	public final void method6122(@OriginalArg(0) Class115 arg0) {
		this.aClass115_Sub3_16 = (Class115_Sub3) arg0;
		this.aClass115_Sub3_18.method6282(this.aClass115_Sub3_16);
		this.aClass115_Sub3_18.method6317();
		this.aClass115_Sub3_19.method6313(this.aClass115_Sub3_18);
		this.aClass115_Sub3_17.method6313(this.aClass115_Sub3_16);
		if (this.aClass220_4.method5917()) {
			this.method3964();
		}
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		if (local9 == 0.0F && local15 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local15 * local15 + local9 * local9)));
			local9 *= local36;
			local15 *= local36;
		}
		if (!this.method3972(0.0F, (float) arg1, (float) arg0, local15 + (float) arg3, local9 + (float) arg2, 0.0F)) {
			return;
		}
		this.method3949();
		this.method3987(arg4);
		this.method4054(0, Static347.aClass80_2);
		this.method3956(Static347.aClass80_2, 0);
		this.method4004(arg5);
		this.method3963();
		this.method4062(false);
		this.method3990();
		this.method4062(true);
		this.method3956(Static522.aClass80_4, 0);
		this.method4054(0, Static522.aClass80_4);
	}

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "(B)V")
	public final void method3995() {
		if (Static445.aClass220_7 == this.aClass220_4) {
			return;
		}
		@Pc(6) Class220 local6 = this.aClass220_4;
		this.aClass220_4 = Static445.aClass220_7;
		if (local6.method5917()) {
			this.method3964();
		}
		this.aFloatArray45 = this.aFloatArray47;
		this.anInt4889 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method6155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "(B)V")
	private void method3996() {
		if (this.aClass220_4 == Static79.aClass220_3) {
			return;
		}
		@Pc(16) Class220 local16 = this.aClass220_4;
		this.aClass220_4 = Static79.aClass220_3;
		if (local16.method5917()) {
			this.method3964();
		}
		this.method3999();
		this.aFloatArray45 = this.aFloatArray48;
		this.method3965();
		this.anInt4889 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!lv;IIII)Lclient!ka;")
	@Override
	public final Class92 method6153(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class92_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(BI)V")
	public abstract void method3997(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uv", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat93 != arg0) {
			this.aFloat93 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method3994();
			this.method3992();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method6174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(17) float local17 = (float) arg3 - (float) arg1;
		@Pc(38) float local38;
		if (local11 == 0.0F && local17 == 0.0F) {
			local11 = 1.0F;
		} else {
			local38 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local11 * local11)));
			local17 *= local38;
			local11 *= local38;
		}
		this.method3949();
		this.method3987(arg4);
		this.method4054(0, Static347.aClass80_2);
		this.method3956(Static347.aClass80_2, 0);
		this.method4004(1);
		this.method3963();
		@Pc(80) int local80 = arg7 % (arg6 + arg5);
		this.method4062(false);
		local38 = (float) arg5 * local11;
		@Pc(94) float local94 = (float) arg5 * local17;
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = local38;
		@Pc(102) float local102 = local94;
		if (local80 <= arg5) {
			local100 = (float) (arg5 - local80) * local11;
			local102 = (float) (arg5 - local80) * local17;
		} else {
			local98 = local17 * (float) (arg6 + arg5 - local80);
			local96 = (float) (arg5 + arg6 - local80) * local11;
		}
		@Pc(149) float local149 = (float) arg0 + local96;
		@Pc(154) float local154 = (float) arg1 + local98;
		@Pc(159) float local159 = local11 * (float) arg6;
		@Pc(164) float local164 = (float) arg6 * local17;
		while (true) {
			if (arg2 <= arg0) {
				if ((float) arg2 > local149) {
					break;
				}
				if ((float) arg2 > local100 + local149) {
					local100 = (float) arg2 - local149;
				}
			} else {
				if (local149 > (float) arg2) {
					break;
				}
				if (local149 + local100 > (float) arg2) {
					local100 = (float) arg2 - local149;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 > local154) {
					break;
				}
				if (local154 + local102 < (float) arg3) {
					local102 = (float) arg3 - local154;
				}
			} else {
				if ((float) arg3 < local154) {
					break;
				}
				if ((float) arg3 < local102 + local154) {
					local102 = (float) arg3 - local154;
				}
			}
			if (!this.method3972(0.0F, local154, local149, local154 + local102, local100 + local149, 0.0F)) {
				return;
			}
			local149 += local159 + local100;
			this.method3990();
			local154 += local164 + local102;
			local100 = local38;
			local102 = local94;
		}
		this.method4062(true);
		this.method3956(Static522.aClass80_4, 0);
		this.method4054(0, Static522.aClass80_4);
	}

	@OriginalMember(owner = "client!uv", name = "H", descriptor = "(I)V")
	private void method3998() {
		this.anInterface26_11 = this.method4063(false);
		this.anInterface26_11.method8109(28, 140);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(34) Buffer local34 = this.anInterface26_11.method8110();
			if (local34 != null) {
				@Pc(43) Stream local43 = this.method4046(local34);
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
				if (this.anInterface26_11.method8107()) {
					break;
				}
			}
		}
		this.aClass270_18 = this.method3985(new Class63[] { new Class63(new Class183[] { Static315.aClass183_1, Static315.aClass183_5, Static315.aClass183_5 }) });
	}

	@OriginalMember(owner = "client!uv", name = "I", descriptor = "(I)V")
	private void method3999() {
		if (this.aBoolean384) {
			return;
		}
		@Pc(20) float[] local20 = this.aFloatArray48;
		this.aBoolean384 = true;
		if (this.anInt4743 != 0 && this.anInt4786 != 0) {
			local20[1] = 0.0F;
			local20[3] = 0.0F;
			local20[0] = 2.0F / (float) this.anInt4743;
			local20[4] = 0.0F;
			local20[15] = 1.0F;
			local20[13] = 1.0F;
			local20[11] = 0.0F;
			local20[10] = 0.5F;
			local20[8] = 0.0F;
			local20[6] = 0.0F;
			local20[9] = 0.0F;
			local20[7] = 0.0F;
			local20[2] = 0.0F;
			local20[14] = 0.5F;
			local20[12] = -1.0F;
			local20[5] = -2.0F / (float) this.anInt4786;
			return;
		}
		local20[0] = 1.0F;
		local20[7] = 0.0F;
		local20[8] = 0.0F;
		local20[4] = 0.0F;
		local20[5] = 1.0F;
		local20[1] = 0.0F;
		local20[3] = 0.0F;
		local20[15] = 1.0F;
		local20[6] = 0.0F;
		local20[9] = 0.0F;
		local20[10] = 1.0F;
		local20[2] = 0.0F;
		local20[13] = 0.0F;
		local20[11] = 0.0F;
		local20[14] = 0.0F;
		local20[12] = 0.0F;
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "()Z")
	@Override
	public final boolean method6130() {
		return false;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZ)V")
	public final void method4000(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean389) {
			this.aBoolean389 = arg0;
			this.method3975();
			this.anInt4889 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!uv", name = "p", descriptor = "()Z")
	@Override
	public final boolean method6163() {
		return true;
	}

	@OriginalMember(owner = "client!uv", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt4743 - 1 <= arg2 && arg1 <= 0 && this.anInt4786 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt4877 = arg0 >= 0 ? arg0 : 0;
		this.anInt4865 = arg2 > this.anInt4743 ? 0 : arg2;
		this.anInt4861 = arg1 < 0 ? 0 : arg1;
		this.anInt4892 = this.anInt4743 < arg3 ? 0 : arg3;
		if (!this.aBoolean394) {
			this.aBoolean394 = true;
			this.method4033();
		}
		this.method4012();
		this.method4051();
	}

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "(B)I")
	public final int method4001() {
		return this.anInt4860;
	}

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "(B)V")
	protected abstract void method4002();

	@OriginalMember(owner = "client!uv", name = "p", descriptor = "(B)V")
	private void method4003() {
		if (this.aBoolean382) {
			return;
		}
		@Pc(11) float[] local11 = this.aFloatArray50;
		@Pc(15) float local15 = (float) this.anInt4893;
		@Pc(19) float local19 = (float) this.anInt4878;
		@Pc(31) float local31 = (float) -this.anInt4871 * this.aFloat91 / (float) this.anInt4872;
		@Pc(43) float local43 = this.aFloat91 * (float) -this.anInt4894 / (float) this.anInt4873;
		@Pc(58) float local58 = this.aFloat91 * (float) (this.anInt4743 - this.anInt4894) / (float) this.anInt4873;
		@Pc(72) float local72 = this.aFloat91 * (float) (this.anInt4786 - this.anInt4871) / (float) this.anInt4872;
		if (local58 == local43 || local31 == local72) {
			local11[9] = 0.0F;
			local11[15] = 1.0F;
			local11[0] = 1.0F;
			local11[7] = 0.0F;
			local11[3] = 0.0F;
			local11[13] = 0.0F;
			local11[2] = 0.0F;
			local11[12] = 0.0F;
			local11[10] = 1.0F;
			local11[11] = 0.0F;
			local11[4] = 0.0F;
			local11[8] = 0.0F;
			local11[1] = 0.0F;
			local11[5] = 1.0F;
			local11[6] = 0.0F;
			local11[14] = 0.0F;
		} else {
			local11[5] = 2.0F / (local72 - local31);
			local11[0] = 2.0F / (local58 - local43);
			local11[10] = 1.0F / (local15 - local19);
			local11[11] = 0.0F;
			local11[2] = 0.0F;
			local11[9] = 0.0F;
			local11[4] = 0.0F;
			local11[8] = 0.0F;
			local11[7] = 0.0F;
			local11[6] = 0.0F;
			local11[3] = 0.0F;
			local11[12] = (local58 + local43) / (-local58 + local43);
			local11[14] = local15 / (local15 - local19);
			local11[15] = 1.0F;
			local11[1] = 0.0F;
			local11[13] = (local31 + local72) / (-local31 + local72);
		}
		this.method3983();
		this.aBoolean382 = true;
	}

	@OriginalMember(owner = "client!uv", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt4886 != arg0;
		if (local11 || this.aFloat101 != arg1 || arg2 != this.aFloat96) {
			this.aFloat96 = arg2;
			this.anInt4886 = arg0;
			this.aFloat101 = arg1;
			if (local11) {
				this.aFloat98 = (float) (this.anInt4886 & 0xFF0000) / 1.671168E7F;
				this.aFloat89 = (float) (this.anInt4886 & 0xFF00) / 65280.0F;
				this.bf = (float) (this.anInt4886 & 0xFF) / 255.0F;
				this.method3994();
			}
			this.aNativeInterface3.setSunColour(this.aFloat98, this.aFloat89, this.bf, arg1, arg2);
			this.method4007();
		}
		if (this.aFloatArray51[0] != arg3 || this.aFloatArray51[1] != arg4 || this.aFloatArray51[2] != arg5) {
			this.aFloatArray51[2] = arg5;
			this.aFloatArray51[0] = arg3;
			this.aFloatArray51[1] = arg4;
			this.aFloatArray52[1] = -arg4;
			this.aFloatArray52[0] = -arg3;
			this.aFloatArray52[2] = -arg5;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray49[1] = arg4 * local149;
			this.aFloatArray49[2] = local149 * arg5;
			this.aFloatArray49[0] = arg3 * local149;
			this.aFloatArray46[2] = -this.aFloatArray49[2];
			this.aFloatArray46[1] = -this.aFloatArray49[1];
			this.aFloatArray46[0] = -this.aFloatArray49[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray49[0], this.aFloatArray49[1], this.aFloatArray49[2]);
			this.method4068();
			this.anInt4862 = (int) (arg3 * 256.0F / arg4);
			this.anInt4857 = (int) (arg5 * 256.0F / arg4);
		}
		this.method3992();
	}

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "(II)V")
	public final void method4004(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt4888) {
			return;
		}
		@Pc(16) Class142 local16;
		@Pc(18) boolean local18;
		@Pc(14) boolean local14;
		if (arg0 == 1) {
			local14 = true;
			local16 = Static181.aClass142_5;
			local18 = true;
		} else if (arg0 == 2) {
			local14 = false;
			local16 = Static460.aClass142_8;
			local18 = true;
		} else if (arg0 == 128) {
			local16 = Static154.aClass142_4;
			local18 = true;
			local14 = true;
		} else {
			local16 = Static77.aClass142_7;
			local14 = false;
			local18 = false;
		}
		if (local14 != this.aBoolean387) {
			this.aBoolean387 = local14;
			this.method4049();
		}
		if (this.aBoolean377 != local18) {
			this.aBoolean377 = local18;
			this.method4036();
		}
		if (this.aClass142_6 != local16) {
			this.aClass142_6 = local16;
			this.method4019();
		}
		this.anInt4889 &= 0xFFFFFFE3;
		this.anInt4888 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!pf;I)V")
	@Override
	public final void method6148(@OriginalArg(0) Class257 arg0, @OriginalArg(1) int arg1) {
		this.aClass97_3.method3043(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!uv", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt4896;
	}

	@OriginalMember(owner = "client!uv", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4873 = arg2;
		this.anInt4871 = arg1;
		this.anInt4894 = arg0;
		this.anInt4872 = arg3;
		this.method4041();
		this.method3946();
		this.method3995();
		this.method4051();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!di;)V")
	@Override
	public final void method6138(@OriginalArg(0) Class31 arg0) {
		this.aClass31_Sub2_3 = (Class31_Sub2) arg0;
	}

	@OriginalMember(owner = "client!uv", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt4861 = 0;
		this.anInt4877 = 0;
		this.anInt4865 = this.anInt4743;
		this.anInt4892 = this.anInt4786;
		if (this.aBoolean394) {
			this.aBoolean394 = false;
			this.method4033();
		}
		this.method4051();
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(IIIIII)Lclient!di;")
	@Override
	public final Class31 method6166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class31_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!uv", name = "q", descriptor = "(B)V")
	public final void method4005() {
		this.method4057(2, Static258.aClass248_6);
	}

	@OriginalMember(owner = "client!uv", name = "J", descriptor = "(I)V")
	private void method4006() {
		if (this.aCanvas8 == null) {
			this.anInt4847 = this.anInt4815 = 1;
		} else {
			@Pc(20) Dimension local20 = this.aCanvas8.getSize();
			this.anInt4847 = local20.width;
			this.anInt4815 = local20.height;
		}
		this.anInt4743 = this.anInt4847;
		this.anInt4786 = this.anInt4815;
		this.method4034();
		this.method3946();
		this.method4041();
		this.method4039();
		this.method4051();
		this.method3995();
		this.la();
	}

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "(I)V")
	@Override
	public final void method6146(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "(B)V")
	protected abstract void method4007();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!bl;I)V")
	public final void method4008(@OriginalArg(0) Interface4 arg0) {
		if (arg0 == this.anInterface4Array3[this.anInt4867]) {
			return;
		}
		this.anInterface4Array3[this.anInt4867] = arg0;
		if (arg0 == null) {
			this.method3962();
		} else {
			arg0.method8611();
		}
		this.anInt4889 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILclient!kt;BLclient!kq;)Lclient!js;")
	public abstract Interface15 method4009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(4) Class176 arg3);

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "(Z)V")
	protected abstract void method4010();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!qc;B)V")
	public final void method4011(@OriginalArg(0) Class272 arg0) {
		this.aClass272Array3[this.anInt4867] = arg0;
		this.method4017();
	}

	@OriginalMember(owner = "client!uv", name = "K", descriptor = "(I)V")
	protected abstract void method4012();

	@OriginalMember(owner = "client!uv", name = "L", descriptor = "(I)V")
	protected abstract void method4013();

	@OriginalMember(owner = "client!uv", name = "M", descriptor = "(I)V")
	protected abstract void method4014();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class245 method6108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class245_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIB[IZ)Lclient!js;")
	public final Interface15 method4015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		return this.method4066(0, arg2, arg3, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!uv", name = "y", descriptor = "()Z")
	@Override
	public final boolean method6186() {
		return this.aBoolean376;
	}

	@OriginalMember(owner = "client!uv", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4891 == arg0 && this.anInt4869 == arg1 && this.anInt4876 == arg2) {
			return;
		}
		this.anInt4891 = arg0;
		this.anInt4876 = arg2;
		this.anInt4869 = arg1;
		this.method4023();
		this.method4002();
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(ZI)V")
	public final void method4016(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean385) {
			this.aBoolean385 = arg0;
			this.method3977();
			this.anInt4889 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!uv", name = "N", descriptor = "(I)V")
	private void method4017() {
		this.method4013();
		if (this.aClass57_3 != null) {
			this.aClass57_3.method8713();
		}
	}

	@OriginalMember(owner = "client!uv", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass115_Sub3_16.method6316((float) arg1, (float) arg2, (float) arg0);
		if ((float) this.anInt4893 > local14 || local14 > (float) this.anInt4878) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt4873 * this.aClass115_Sub3_16.method6307((float) arg2, (float) arg0, (float) arg1) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt4872 * this.aClass115_Sub3_16.method6320((float) arg1, (float) arg0, (float) arg2) / (float) arg3);
		arg4[0] = (int) ((float) local58 - this.aFloat102);
		arg4[1] = (int) ((float) local77 - this.aFloat97);
		arg4[2] = (int) local14;
	}

	@OriginalMember(owner = "client!uv", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt4894, this.anInt4871, this.anInt4873, this.anInt4872 };
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(IB)V")
	public final void method4018(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4022(Static503.aClass144_4, Static503.aClass144_4);
		} else if (arg0 == 0) {
			this.method4022(Static438.aClass144_3, Static438.aClass144_3);
		} else if (arg0 == 2) {
			this.method4022(Static503.aClass144_4, Static558.aClass144_5);
		} else if (arg0 == 3) {
			this.method4022(Static438.aClass144_3, Static3.aClass144_1);
		} else if (arg0 == 4) {
			this.method4022(Static58.aClass144_2, Static58.aClass144_2);
			return;
		}
	}

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "(B)V")
	protected abstract void method4019();

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "(B)I")
	public final int method4020() {
		return this.anInt4875;
	}

	@OriginalMember(owner = "client!uv", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass115_Sub3_16.aFloat148 * (float) arg0 + this.aClass115_Sub3_16.aFloat153 * (float) arg1 + (float) arg2 * this.aClass115_Sub3_16.aFloat145 + this.aClass115_Sub3_16.aFloat144;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg3 * this.aClass115_Sub3_16.aFloat148 + this.aClass115_Sub3_16.aFloat153 * (float) arg4 + (float) arg5 * this.aClass115_Sub3_16.aFloat145 + this.aClass115_Sub3_16.aFloat144;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt4893 && local63 < (float) this.anInt4893) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt4878 && local63 > (float) this.anInt4878) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) (((float) arg2 * this.aClass115_Sub3_16.aFloat146 + this.aClass115_Sub3_16.aFloat151 * (float) arg1 + this.aClass115_Sub3_16.aFloat152 * (float) arg0 + this.aClass115_Sub3_16.aFloat143) * (float) this.anInt4873 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt4873 * ((float) arg5 * this.aClass115_Sub3_16.aFloat146 + this.aClass115_Sub3_16.aFloat152 * (float) arg3 + (float) arg4 * this.aClass115_Sub3_16.aFloat151 + this.aClass115_Sub3_16.aFloat143) / local63);
		if ((float) local135 < this.aFloat102 && (float) local167 < this.aFloat102) {
			local7 |= 0x1;
		} else if (this.aFloat104 < (float) local135 && (float) local167 > this.aFloat104) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) (((float) arg1 * this.aClass115_Sub3_16.aFloat147 + this.aClass115_Sub3_16.aFloat154 * (float) arg0 + this.aClass115_Sub3_16.aFloat150 * (float) arg2 + this.aClass115_Sub3_16.aFloat149) * (float) this.anInt4872 / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt4872 * (this.aClass115_Sub3_16.aFloat149 + this.aClass115_Sub3_16.aFloat150 * (float) arg5 + this.aClass115_Sub3_16.aFloat147 * (float) arg4 + (float) arg3 * this.aClass115_Sub3_16.aFloat154) / local63);
		if (this.aFloat97 > (float) local233 && this.aFloat97 > (float) local265) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat94 && this.aFloat94 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!uv", name = "u", descriptor = "(B)I")
	public final int method4021() {
		return this.anInt4883;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!il;Lclient!il;I)V")
	public final void method4022(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class144 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg1 != this.aClass144Array5[this.anInt4867]) {
			this.aClass144Array5[this.anInt4867] = arg1;
			this.method4014();
			local5 = true;
		}
		if (this.aClass144Array6[this.anInt4867] != arg0) {
			this.aClass144Array6[this.anInt4867] = arg0;
			this.method3961();
			local5 = true;
		}
		if (local5) {
			this.anInt4889 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!uv", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Interface15 local9 = local6.anInterface15_2;
		this.method4055();
		this.method4008(local9);
		this.method4004(1);
		this.method4022(Static503.aClass144_4, Static503.aClass144_4);
		this.method4054(0, Static347.aClass80_2);
		this.method3987(arg0);
		this.aClass115_Sub3_15.method6318((float) this.anInt4786, (float) this.anInt4743, 0.0F);
		this.method3938();
		this.aClass115_Sub3Array3[0].method6318(local9.method8451((float) this.anInt4786), local9.method8448((float) this.anInt4743), 1.0F);
		this.aClass115_Sub3Array3[0].method6322(local9.method8451((float) -arg3), 0.0F, local9.method8448((float) -arg2));
		this.aClass272Array3[0] = Static557.aClass272_6;
		this.method4017();
		this.method4005();
		this.method3988();
		this.method4054(0, Static522.aClass80_4);
	}

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "()V")
	@Override
	protected void method6136() {
		if (this.aBoolean374) {
			return;
		}
		for (@Pc(9) Class6 local9 = this.aClass163_23.method4966(); local9 != null; local9 = this.aClass163_23.method4965()) {
			((Class6_Sub16_Sub1) local9).method2549();
		}
		@Pc(26) Enumeration local26 = this.aHashtable5.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method3939(this.aHashtable5.get(local32), local32);
		}
		Static40.method1346(true, false);
		this.aNativeInterface3.release();
		this.aBoolean374 = true;
	}

	@OriginalMember(owner = "client!uv", name = "O", descriptor = "(I)V")
	private void method4023() {
		if (this.aClass57_3 != null) {
			this.aClass57_3.method8702();
		}
		this.method4010();
	}

	@OriginalMember(owner = "client!uv", name = "x", descriptor = "()I")
	@Override
	public final int method6185() {
		return this.anInt4863 - 2;
	}

	@OriginalMember(owner = "client!uv", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass115_Sub3_16.method6316((float) arg1, (float) arg2, (float) arg0);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt4873 * this.aClass115_Sub3_16.method6307((float) arg2, (float) arg0, (float) arg1) / local14);
			local25 = (int) ((float) this.anInt4872 * this.aClass115_Sub3_16.method6320((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local25 = this.anInt4871;
			local28 = this.anInt4894;
		}
		arg3[1] = (int) ((float) local25 - this.aFloat97);
		arg3[0] = (int) ((float) local28 - this.aFloat102);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!uv", name = "P", descriptor = "(I)V")
	protected abstract void method4024();

	@OriginalMember(owner = "client!uv", name = "v", descriptor = "(B)V")
	private void method4025() {
		this.anInterface26_10 = this.method4063(false);
		this.anInterface26_10.method8109(12, 3096);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(36) Buffer local36 = this.anInterface26_10.method8110();
			if (local36 != null) {
				@Pc(43) Stream local43 = this.method4046(local36);
				local43.b(0.0F);
				local43.b(0.0F);
				local43.b(0.0F);
				for (@Pc(54) int local54 = 0; local54 <= 256; local54++) {
					@Pc(65) double local65 = (double) (local54 * 2) * 3.141592653589793D / 256.0D;
					@Pc(69) float local69 = (float) Math.cos(local65);
					@Pc(73) float local73 = (float) Math.sin(local65);
					if (Stream.a()) {
						local43.b(local73);
						local43.b(local69);
						local43.b(0.0F);
					} else {
						local43.a(local73);
						local43.a(local69);
						local43.a(0.0F);
					}
				}
				local43.c();
				if (this.anInterface26_10.method8107()) {
					break;
				}
			}
		}
		this.aClass270_22 = this.method3985(new Class63[] { new Class63(Static315.aClass183_1) });
	}

	@OriginalMember(owner = "client!uv", name = "Q", descriptor = "(I)Lclient!og;")
	public final Class115_Sub3 method4026() {
		return this.aClass115_Sub3_19;
	}

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "()Lclient!hba;")
	@Override
	public final Class115 method6184() {
		return new Class115_Sub3();
	}

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "(B)V")
	protected abstract void method4028();

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "(I)V")
	@Override
	public final void method6161() {
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZBLclient!ef;Z)V")
	public abstract void method4029(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class80 arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!uv", name = "R", descriptor = "(I)Lclient!og;")
	public final Class115_Sub3 method4030() {
		if (!this.aBoolean390) {
			this.aClass115_Sub3_20.method6311(this.aClass115_Sub3_18, this.aClass115_Sub3_15);
			this.aBoolean390 = true;
		}
		return this.aClass115_Sub3_20;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(ZB)V")
	public final void method4031(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean378 != arg0) {
			this.aBoolean378 = arg0;
			this.method4002();
			this.anInt4889 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(BZ)V")
	public final void method4032(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean392 != arg0) {
			this.aBoolean392 = arg0;
			this.method3958();
		}
	}

	@OriginalMember(owner = "client!uv", name = "x", descriptor = "(B)V")
	protected abstract void method4033();

	@OriginalMember(owner = "client!uv", name = "S", descriptor = "(I)V")
	private void method4034() {
		this.aBoolean384 = false;
		if (Static79.aClass220_3 == this.aClass220_4) {
			this.method3999();
			this.method3965();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "([BZLclient!kt;IIZII)Lclient!js;")
	protected abstract Interface15 method4035(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class178 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(II)I")
	@Override
	public final int method6140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "(I)V")
	@Override
	public final void method6141(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass326_3 != null) {
			this.aClass326_3.method7734();
		}
		this.anInt4879 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I[Lclient!cba;)V")
	@Override
	public final void method6181(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub10[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass6_Sub10Array5[local7] = arg1[local7];
		}
		this.anInt4884 = arg0;
		if (this.aClass220_4.method5917()) {
			this.method4038();
		}
	}

	@OriginalMember(owner = "client!uv", name = "T", descriptor = "(I)V")
	protected abstract void method4036();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "([IIIIIZ)Lclient!ufa;")
	@Override
	public final Class4 method6133(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class4_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIZ)Lclient!ufa;")
	@Override
	public final Class4 method6160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class4_Sub3 local11 = new Class4_Sub3(this, arg2, arg3, arg4);
		local11.method7699(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!uv", name = "U", descriptor = "(I)[F")
	public final float[] method4037() {
		return this.aFloatArray47;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "()Lclient!hba;")
	@Override
	public final Class115 method6115() {
		return this.aClass115_Sub3_16;
	}

	@OriginalMember(owner = "client!uv", name = "V", descriptor = "(I)V")
	protected void method4038() {
		this.anInt4887 = this.anInt4884;
		this.anInt4884 = 0;
	}

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "()Z")
	@Override
	public final boolean method6134() {
		return true;
	}

	@OriginalMember(owner = "client!uv", name = "W", descriptor = "(I)V")
	protected abstract void method4039();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!oq;IBI)V")
	public abstract void method4040(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!uv", name = "y", descriptor = "(B)V")
	private void method4041() {
		this.aBoolean382 = false;
		this.method4003();
		if (Static287.aClass220_5 == this.aClass220_4) {
			this.method3965();
		}
	}

	@OriginalMember(owner = "client!uv", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZIIZ)V")
	public final void method4042(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt4870 || this.aBoolean380 != this.aBoolean379) {
			@Pc(29) Interface15 local29 = null;
			@Pc(31) int local31 = 0;
			@Pc(33) byte local33 = 0;
			@Pc(35) int local35 = 0;
			@Pc(42) int local42 = this.aBoolean379 ? 3 : 0;
			if (arg1 < 0) {
				this.method3988();
			} else {
				local29 = this.aClass326_3.method7736(arg1);
				@Pc(58) Class254 local58 = super.anInterface7_10.method6931(arg1);
				if (local58.aByte96 == 0 && local58.aByte100 == 0) {
					this.method3988();
				} else {
					@Pc(74) int local74 = local58.aBoolean616 ? 64 : 128;
					@Pc(78) int local78 = local74 * 50;
					@Pc(82) Class115_Sub3 local82 = this.method3960();
					local82.method6300(0.0F, (float) (this.anInt4859 % local78 * local58.aByte100) / (float) local78, (float) (local58.aByte96 * (this.anInt4859 % local78)) / (float) local78);
					this.method4011(Static557.aClass272_6);
				}
				local31 = local58.anInt7797;
				if (!this.aBoolean379) {
					local33 = local58.aByte94;
					local42 = local58.aByte95;
					local35 = local58.anInt7800;
				}
			}
			this.method4048(local35, local42, arg0, arg2, local33);
			if (this.aClass57_3 == null) {
				this.method4008(local29);
				this.method4018(local31);
			} else {
				this.aClass57_3.method8706(local31, local29);
			}
			this.anInt4870 = arg1;
			this.aBoolean380 = this.aBoolean379;
		}
		this.anInt4889 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "([FI)[F")
	public final float[] method4043(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloatArray45[1];
		arg0[8] = this.aFloatArray45[2];
		arg0[0] = this.aFloatArray45[0];
		arg0[12] = this.aFloatArray45[3];
		arg0[5] = this.aFloatArray45[5];
		arg0[13] = this.aFloatArray45[7];
		arg0[9] = this.aFloatArray45[6];
		arg0[2] = this.aFloatArray45[8];
		arg0[1] = this.aFloatArray45[4];
		arg0[3] = this.aFloatArray45[12];
		arg0[10] = this.aFloatArray45[10];
		arg0[14] = this.aFloatArray45[11];
		arg0[6] = this.aFloatArray45[9];
		arg0[7] = this.aFloatArray45[13];
		arg0[15] = this.aFloatArray45[15];
		arg0[11] = this.aFloatArray45[14];
		return arg0;
	}

	@OriginalMember(owner = "client!uv", name = "Y", descriptor = "(I)V")
	private void method4044() {
		this.anInterface26_12 = this.method4063(true);
		this.anInterface26_12.method8109(12, 24);
		this.aClass270_16 = this.method3985(new Class63[] { new Class63(Static315.aClass183_1) });
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6149(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas9) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method3939(this.aHashtable5.get(arg0), arg0);
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!uv", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt4878;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!qa;B)V")
	public abstract void method4045(@OriginalArg(0) Class270 arg0);

	@OriginalMember(owner = "client!uv", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4877;
		arg0[2] = this.anInt4865;
		arg0[1] = this.anInt4861;
		arg0[3] = this.anInt4892;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "()Z")
	@Override
	public final boolean method6110() {
		return this.aClass57Array3[3].method8709();
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "()Z")
	@Override
	public final boolean method6129() {
		return false;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method4046(@OriginalArg(1) Buffer arg0) {
		this.aStream3.a(arg0);
		return this.aStream3;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!kt;[BIII)Lclient!ff;")
	public abstract Interface11 method4047(@OriginalArg(1) Class178 arg0, @OriginalArg(2) byte[] arg1);

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BIIZZI)V")
	private void method4048(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) boolean local8 = arg2 & this.method6110();
		if (!local8 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg0 = 1;
			arg4 = 0;
		}
		if (arg1 != 0 && arg3) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt4881 != arg1) {
			if (this.anInt4881 != 0) {
				this.aClass57Array3[Integer.MAX_VALUE & this.anInt4881].method8703();
			}
			if (arg1 == 0) {
				this.aClass57_3 = null;
			} else {
				this.aClass57_3 = this.aClass57Array3[Integer.MAX_VALUE & arg1];
				this.aClass57_3.method8712(arg3);
				this.aClass57_3.method8707(arg3);
				this.aClass57_3.method8710(arg4, arg0);
			}
			this.anInt4890 = arg4;
			this.anInt4874 = arg0;
			this.anInt4881 = arg1;
		} else if (this.anInt4881 != 0) {
			this.aClass57Array3[this.anInt4881 & Integer.MAX_VALUE].method8707(arg3);
			if (arg4 != this.anInt4890 || arg0 != this.anInt4874) {
				this.aClass57Array3[Integer.MAX_VALUE & this.anInt4881].method8710(arg4, arg0);
				this.anInt4890 = arg4;
				this.anInt4874 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "Z", descriptor = "(I)V")
	protected abstract void method4049();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZBLclient!ef;)V")
	protected abstract void method4050(@OriginalArg(0) int arg0, @OriginalArg(3) Class80 arg1);

	@OriginalMember(owner = "client!uv", name = "z", descriptor = "(B)V")
	private void method4051() {
		this.aFloat104 = (float) (this.anInt4865 - this.anInt4894);
		this.aFloat97 = (float) (this.anInt4861 - this.anInt4871);
		this.aFloat102 = (float) (this.anInt4877 - this.anInt4894);
		this.aFloat94 = (float) (this.anInt4892 - this.anInt4871);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!og;)V")
	public final void method4052(@OriginalArg(1) Class115_Sub3 arg0) {
		this.aClass115_Sub3_15.method6282(arg0);
		this.aBoolean373 = false;
		this.method4058();
	}

	@OriginalMember(owner = "client!uv", name = "A", descriptor = "(B)F")
	protected abstract float method4053();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6104(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas9) {
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
			@Pc(53) Object local53 = this.method4061(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method6114() {
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "([I)V")
	@Override
	public final void method6164(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt4786;
		arg0[0] = this.anInt4743;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!mv;[Lclient!tw;Z)Lclient!da;")
	@Override
	public final Class34 method6167(@OriginalArg(0) Class213 arg0, @OriginalArg(1) Class331[] arg1) {
		return new Class34_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILclient!ef;)V")
	public final void method4054(@OriginalArg(0) int arg0, @OriginalArg(2) Class80 arg1) {
		this.method4029(arg0, false, arg1, false);
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(II)I")
	@Override
	public final int method6147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "(Z)V")
	public final void method4055() {
		if (this.anInt4889 == 2) {
			return;
		}
		this.method3996();
		this.method4031(false);
		this.method3982(false);
		this.method4016(false);
		this.method4000(false);
		this.method4042(false, -2, false);
		this.anInt4889 = 2;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!kt;B[BZI)Lclient!js;")
	public final Interface15 method4056(@OriginalArg(0) int arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method4035(arg2, arg1, arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method6135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static49.method1565(arg1, this, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!pf;)V")
	@Override
	public final void method6183(@OriginalArg(0) Class257 arg0) {
		this.aClass97_3.method3043(arg0, -1, this);
	}

	@OriginalMember(owner = "client!uv", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt4852 + this.anInt4854 + this.anInt4853;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZILclient!oq;)V")
	private void method4057(@OriginalArg(1) int arg0, @OriginalArg(2) Class248 arg1) {
		this.method3974(0, this.anInterface26_11);
		this.method4045(this.aClass270_18);
		this.method4040(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "()V")
	@Override
	public final void method6175() {
		if (this.aClass326_3 != null) {
			this.aClass326_3.method7734();
		}
	}

	@OriginalMember(owner = "client!uv", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6158(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method6142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method4053();
		this.method3949();
		this.method3987(arg4);
		this.method4054(0, Static347.aClass80_2);
		this.method3956(Static347.aClass80_2, 0);
		this.method4004(arg5);
		this.aClass115_Sub3_15.method6318((float) (arg3 - 1), (float) (arg2 - 1), 1.0F);
		this.aClass115_Sub3_15.method6322((float) arg1 - local7, 0.0F, (float) arg0 - local7);
		this.method3938();
		this.method4062(false);
		this.method4057(4, Static255.aClass248_5);
		this.method4062(true);
		this.method3956(Static522.aClass80_4, 0);
		this.method4054(0, Static522.aClass80_4);
	}

	@OriginalMember(owner = "client!uv", name = "ab", descriptor = "(I)V")
	private void method4058() {
		if (Static79.aClass220_3 == this.aClass220_4) {
			@Pc(7) float local7 = this.method4053();
			this.aClass115_Sub3_15.method6322(local7, 0.0F, local7);
		}
		this.aBoolean390 = false;
		this.method3986();
		if (this.aClass57_3 != null) {
			this.aClass57_3.method8705();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IF)V")
	public final void method4059(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat91) {
			this.aFloat91 = arg0;
			this.method4041();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method6172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!uv", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass115_Sub3_16.method6316((float) arg1, (float) arg2, (float) arg0);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt4873 * this.aClass115_Sub3_16.method6307((float) arg2, (float) arg0, (float) arg1) / local14);
			local58 = (int) ((float) this.anInt4872 * this.aClass115_Sub3_16.method6320((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local40 = this.anInt4894;
			local58 = this.anInt4871;
		}
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local40 - this.aFloat102);
		arg3[1] = (int) ((float) local58 - this.aFloat97);
	}

	@OriginalMember(owner = "client!uv", name = "bb", descriptor = "(I)V")
	protected abstract void method4060();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method4061(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZZ)V")
	public abstract void method4062(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(ZI)Lclient!tea;")
	public abstract Interface26 method4063(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!uv", name = "cb", descriptor = "(I)Lclient!og;")
	public final Class115_Sub3 method4064() {
		return this.aClass115_Sub3Array3[this.anInt4867];
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB[IZIII)Lclient!js;")
	public abstract Interface15 method4066(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg2 * this.aClass115_Sub3_16.aFloat145 + (float) arg0 * this.aClass115_Sub3_16.aFloat148 + (float) arg1 * this.aClass115_Sub3_16.aFloat153 + this.aClass115_Sub3_16.aFloat144;
		@Pc(57) float local57 = (float) arg3 * this.aClass115_Sub3_16.aFloat148 + (float) arg4 * this.aClass115_Sub3_16.aFloat153 + (float) arg5 * this.aClass115_Sub3_16.aFloat145 + this.aClass115_Sub3_16.aFloat144;
		if ((float) this.anInt4893 > local32 && local57 < (float) this.anInt4893) {
			local7 |= 0x10;
		} else if ((float) this.anInt4878 < local32 && local57 > (float) this.anInt4878) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass115_Sub3_16.aFloat146 * (float) arg2 + (float) arg1 * this.aClass115_Sub3_16.aFloat151 + (float) arg0 * this.aClass115_Sub3_16.aFloat152 + this.aClass115_Sub3_16.aFloat143) * (float) this.anInt4873 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt4873 * (this.aClass115_Sub3_16.aFloat152 * (float) arg3 + (float) arg4 * this.aClass115_Sub3_16.aFloat151 + (float) arg5 * this.aClass115_Sub3_16.aFloat146 + this.aClass115_Sub3_16.aFloat143) / (float) arg6);
		if ((float) local124 < this.aFloat102 && this.aFloat102 > (float) local157) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat104 && this.aFloat104 < (float) local157) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt4872 * (this.aClass115_Sub3_16.aFloat150 * (float) arg2 + this.aClass115_Sub3_16.aFloat154 * (float) arg0 + this.aClass115_Sub3_16.aFloat147 * (float) arg1 + this.aClass115_Sub3_16.aFloat149) / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt4872 * (this.aClass115_Sub3_16.aFloat150 * (float) arg5 + (float) arg3 * this.aClass115_Sub3_16.aFloat154 + (float) arg4 * this.aClass115_Sub3_16.aFloat147 + this.aClass115_Sub3_16.aFloat149) / (float) arg6);
		if ((float) local224 < this.aFloat97 && this.aFloat97 > (float) local257) {
			local7 |= 0x4;
		} else if (this.aFloat94 < (float) local224 && this.aFloat94 < (float) local257) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!uv", name = "B", descriptor = "(B)V")
	protected final void method4067() {
		@Pc(15) Hashtable local15 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(26) Enumeration local26 = this.aHashtable5.keys();
			while (local26.hasMoreElements()) {
				@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
				local15.put(local32, this.method4061(local32));
			}
		}
		this.aHashtable5 = local15;
		this.method3998();
		this.method4044();
		this.method4025();
		this.aClass97_3.method3037(this);
	}

	@OriginalMember(owner = "client!uv", name = "C", descriptor = "(B)V")
	public abstract void method4068();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!kt;Z[FZII)Lclient!js;")
	public final Interface15 method4069(@OriginalArg(0) Class178 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method3971(arg3, arg1, arg0, arg4, arg2);
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(IB)Lclient!ew;")
	protected Class57 method4070(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class57_Sub10(this);
		} else if (arg0 == 1) {
			return new Class57_Sub4(this);
		} else if (arg0 == 2) {
			return new Class57_Sub7(this, this.aClass211_6);
		} else if (arg0 == 7) {
			return new Class57_Sub5(this);
		} else {
			return new Class57_Sub11(this);
		}
	}
}
