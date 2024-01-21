import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class2_Sub2_Sub35 extends Class2_Sub2 {

	@OriginalMember(owner = "client!th", name = "R", descriptor = "I")
	private int anInt3376;

	@OriginalMember(owner = "client!th", name = "S", descriptor = "I")
	private int anInt3377;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(25) int local25 = Static2.anInt36 / this.anInt3376;
			@Pc(29) int local29 = arg0 % local25;
			@Pc(39) int[][] local39 = this.method2582(0, local29 * Static2.anInt36 / local25);
			@Pc(43) int[] local43 = local39[0];
			@Pc(47) int[] local47 = local39[1];
			@Pc(51) int[] local51 = local16[0];
			@Pc(55) int[] local55 = local39[2];
			@Pc(59) int[] local59 = local16[2];
			@Pc(63) int[] local63 = local16[1];
			for (@Pc(65) int local65 = 0; local65 < Static149.anInt3233; local65++) {
				@Pc(72) int local72 = Static149.anInt3233 / this.anInt3377;
				@Pc(76) int local76 = local65 % local72;
				@Pc(82) int local82 = Static149.anInt3233 * local76 / local72;
				local51[local65] = local43[local82];
				local63[local65] = local47[local82];
				local59[local65] = local55[local82];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(25) int local25 = Static2.anInt36 / this.anInt3376;
			@Pc(29) int local29 = arg0 % local25;
			@Pc(39) int[] local39 = this.method2573(local29 * Static2.anInt36 / local25, 0);
			for (@Pc(41) int local41 = 0; local41 < Static149.anInt3233; local41++) {
				@Pc(48) int local48 = Static149.anInt3233 / this.anInt3377;
				@Pc(52) int local52 = local41 % local48;
				local16[local41] = local39[local52 * Static149.anInt3233 / local48];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3377 = arg1.method1461();
		} else if (arg0 == 1) {
			this.anInt3376 = arg1.method1461();
		}
	}
}
