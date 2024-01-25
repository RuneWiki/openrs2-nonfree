import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "[F")
	public static final float[] aFloatArray49 = new float[16384];

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "[F")
	public static final float[] aFloatArray50 = new float[16384];

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
	public final int anInt6483;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
	public final int anInt6482;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "[Z")
	public final boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "[I")
	public final int[] anIntArray450;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "[I")
	public final int[] anIntArray451;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray45;

	static {
		@Pc(41) double local41 = 3.834951969714103E-4D;
		for (@Pc(43) int local43 = 0; local43 < 16384; local43++) {
			aFloatArray49[local43] = (float) Math.sin((double) local43 * local41);
			aFloatArray50[local43] = (float) Math.cos((double) local43 * local41);
		}
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt6483 = arg0;
		@Pc(11) Class2_Sub20 local11 = new Class2_Sub20(arg1);
		this.anInt6482 = local11.method8581(-17416);
		this.aBooleanArray29 = new boolean[this.anInt6482];
		this.anIntArray450 = new int[this.anInt6482];
		this.anIntArray451 = new int[this.anInt6482];
		this.anIntArrayArray45 = new int[this.anInt6482][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt6482; local38++) {
			this.anIntArray451[local38] = local11.method8581(-17416);
			if (this.anIntArray451[local38] == 6) {
				this.anIntArray451[local38] = 2;
			}
		}
		for (@Pc(75) int local75 = 0; local75 < this.anInt6482; local75++) {
			this.aBooleanArray29[local75] = local11.method8581(-17416) == 1;
		}
		for (@Pc(107) int local107 = 0; local107 < this.anInt6482; local107++) {
			this.anIntArray450[local107] = local11.method8575();
		}
		for (@Pc(127) int local127 = 0; local127 < this.anInt6482; local127++) {
			this.anIntArrayArray45[local127] = new int[local11.method8581(-17416)];
		}
		for (@Pc(148) int local148 = 0; local148 < this.anInt6482; local148++) {
			for (@Pc(154) int local154 = 0; local154 < this.anIntArrayArray45[local148].length; local154++) {
				this.anIntArrayArray45[local148][local154] = local11.method8581(-17416);
			}
		}
	}
}
