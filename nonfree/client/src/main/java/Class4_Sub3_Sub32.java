import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class4_Sub3_Sub32 extends Class4_Sub3 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(29) int[] local29 = this.method3149(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static134.anInt3188; local31++) {
				local11[local31] = 4096 - local29[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(22) int[][] local22 = this.method3150(0, arg0);
			@Pc(26) int[] local26 = local22[1];
			@Pc(30) int[] local30 = local22[2];
			@Pc(34) int[] local34 = local22[0];
			@Pc(38) int[] local38 = local12[0];
			@Pc(42) int[] local42 = local12[1];
			@Pc(46) int[] local46 = local12[2];
			for (@Pc(48) int local48 = 0; local48 < Static134.anInt3188; local48++) {
				local38[local48] = 4096 - local34[local48];
				local42[local48] = 4096 - local26[local48];
				local46[local48] = 4096 - local30[local48];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean170 = arg1.method1253() == 1;
		}
	}
}
