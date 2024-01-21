import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class2_Sub3_Sub5 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
	private int anInt541;

	@OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
	private int anInt545;

	@OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
	private int anInt542;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt545 = arg1.method2933();
		} else if (arg0 == 1) {
			this.anInt542 = arg1.method2933();
		} else if (arg0 == 2) {
			this.anInt541 = arg1.method2933();
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(22) int[][] local22 = this.method3017(arg0, 0);
			@Pc(26) int[] local26 = local22[1];
			@Pc(30) int[] local30 = local22[0];
			@Pc(34) int[] local34 = local22[2];
			@Pc(38) int[] local38 = local7[0];
			@Pc(42) int[] local42 = local7[2];
			@Pc(46) int[] local46 = local7[1];
			for (@Pc(48) int local48 = 0; local48 < Static53.anInt1184; local48++) {
				@Pc(54) int local54 = local30[local48];
				@Pc(58) int local58 = local34[local48];
				@Pc(62) int local62 = local26[local48];
				if (local54 == local58 && local62 == local58) {
					local38[local48] = local54 * this.anInt545 >> 12;
					local46[local48] = this.anInt542 * local58 >> 12;
					local42[local48] = this.anInt541 * local62 >> 12;
				} else {
					local38[local48] = this.anInt545;
					local46[local48] = this.anInt542;
					local42[local48] = this.anInt541;
				}
			}
		}
		return local7;
	}
}
