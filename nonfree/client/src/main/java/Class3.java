import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Ljava/lang/Runnable;")
	public Runnable aRunnable2;

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "Z")
	public boolean aBoolean6;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
	public int anInt31;

	@OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
	public int anInt32;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	public int anInt33;

	@OriginalMember(owner = "client!ab", name = "F", descriptor = "Z")
	public boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
	public int anInt27 = 0;

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
	public int anInt24 = 0;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public int anInt26 = 0;

	@OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
	public int anInt28 = 0;

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "Z")
	public boolean aBoolean4 = true;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!pja;")
	public final Class86_Sub3 aClass86_Sub3_1 = new Class86_Sub3();

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "[I")
	public final int[] anIntArray4 = new int[Static386.anInt6431];

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "[I")
	public final int[] anIntArray7 = new int[10];

	@OriginalMember(owner = "client!ab", name = "R", descriptor = "[Lclient!mc;")
	public final Class45_Sub3[] aClass45_Sub3Array1 = new Class45_Sub3[7];

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "[I")
	public final int[] anIntArray11 = new int[8];

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "[I")
	public final int[] anIntArray5 = new int[8];

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "[Lclient!mc;")
	public final Class45_Sub3[] aClass45_Sub3Array2 = new Class45_Sub3[7];

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "[I")
	public final int[] anIntArray6 = new int[8];

	@OriginalMember(owner = "client!ab", name = "J", descriptor = "[I")
	public final int[] anIntArray12 = new int[64];

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "[I")
	public final int[] anIntArray16 = new int[Static386.anInt6431];

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "[I")
	public final int[] anIntArray15 = new int[10];

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "[I")
	public final int[] anIntArray9 = new int[10];

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "[I")
	public final int[] anIntArray17 = new int[Static386.anInt6431];

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "[I")
	public final int[] anIntArray20 = new int[Static386.anInt6431];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "[I")
	public final int[] anIntArray10 = new int[Static386.anInt6431];

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "[I")
	public final int[] anIntArray18 = new int[64];

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "[I")
	public final int[] anIntArray22 = new int[10];

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "[F")
	public final float[] aFloatArray1 = new float[2];

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "[I")
	public final int[] anIntArray14 = new int[10000];

	@OriginalMember(owner = "client!ab", name = "K", descriptor = "[I")
	public final int[] anIntArray8 = new int[10000];

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "[I")
	public final int[] anIntArray24 = new int[64];

	@OriginalMember(owner = "client!ab", name = "H", descriptor = "[I")
	public final int[] anIntArray21 = new int[Static386.anInt6431];

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "[I")
	public final int[] anIntArray19 = new int[Static386.anInt6431];

	@OriginalMember(owner = "client!ab", name = "M", descriptor = "[I")
	public final int[] anIntArray23 = new int[64];

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!lq;")
	private final Class145_Sub2 aClass145_Sub2_1;

	@OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
	public int anInt23;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!sfa;")
	public Class335 aClass335_1;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "[I")
	public final int[] anIntArray13;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!lq;)V")
	public Class3(@OriginalArg(0) Class145_Sub2 arg0) {
		this.aClass145_Sub2_1 = arg0;
		this.anInt23 = this.aClass145_Sub2_1.anInt5990 - 255;
		this.aClass335_1 = new Class335(arg0, this);
		for (@Pc(137) int local137 = 0; local137 < 7; local137++) {
			this.aClass45_Sub3Array2[local137] = new Class45_Sub3(this.aClass145_Sub2_1);
			this.aClass45_Sub3Array1[local137] = new Class45_Sub3(this.aClass145_Sub2_1);
		}
		this.anIntArray13 = new int[Static386.anInt6434];
		for (@Pc(171) int local171 = 0; local171 < Static386.anInt6434; local171++) {
			this.anIntArray13[local171] = -1;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/Runnable;)V")
	public void method45(@OriginalArg(1) Runnable arg0) {
		this.aRunnable2 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public void method46() {
		this.aClass335_1 = new Class335(this.aClass145_Sub2_1, this);
	}
}
