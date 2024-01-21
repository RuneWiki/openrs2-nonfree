import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class2_Sub2_Sub19 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lc", name = "cb", descriptor = "[I")
	public static int[] anIntArray224 = new int[99];

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
	private int anInt2158;

	@OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
	private int anInt2162;

	static {
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 99; local24++) {
			@Pc(29) int local29 = local24 + 1;
			@Pc(42) int local42 = (int) ((double) local29 + Math.pow(2.0D, (double) local29 / 7.0D) * 300.0D);
			local22 += local42;
			anIntArray224[local24] = local22 / 4;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(28) int[] local28 = this.method2573(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static149.anInt3233; local30++) {
				@Pc(36) int local36 = local28[local30];
				local13[local30] = this.anInt2158 <= local36 && local36 <= this.anInt2162 ? 4096 : 0;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2158 = arg1.method1456();
		} else if (arg0 == 1) {
			this.anInt2162 = arg1.method1456();
		}
	}
}
