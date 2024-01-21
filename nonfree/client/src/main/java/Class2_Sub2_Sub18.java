import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
	private int anInt2131;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2131 = arg1.method1456();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(32) int[] local32 = this.method2573(arg0 - 1 & Static75.anInt1778, 0);
			@Pc(40) int[] local40 = this.method2573(arg0, 0);
			@Pc(50) int[] local50 = this.method2573(arg0 + 1 & Static75.anInt1778, 0);
			for (@Pc(52) int local52 = 0; local52 < Static149.anInt3233; local52++) {
				@Pc(65) int local65 = this.anInt2131 * (local50[local52] - local32[local52]);
				@Pc(69) int local69 = local65 >> 12;
				@Pc(89) int local89 = this.anInt2131 * (local40[Static145.anInt2636 & local52 + 1] - local40[local52 - 1 & Static145.anInt2636]);
				@Pc(93) int local93 = local89 >> 12;
				@Pc(99) int local99 = local69 * local69 >> 12;
				@Pc(105) int local105 = local93 * local93 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((local105 + local99 + 4096) / 4096)) * 4096.0D);
				@Pc(126) int local126 = local118 == 0 ? 0 : 16777216 / local118;
				local14[local52] = 4096 - local126;
			}
		}
		return local14;
	}
}
