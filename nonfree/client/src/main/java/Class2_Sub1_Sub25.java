import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class2_Sub1_Sub25 extends Class2_Sub1 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(22) int[][] local22 = this.method2991(arg0, 0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[2];
			@Pc(34) int[] local34 = local12[0];
			@Pc(38) int[] local38 = local22[1];
			@Pc(42) int[] local42 = local12[1];
			@Pc(46) int[] local46 = local12[2];
			for (@Pc(48) int local48 = 0; local48 < Static129.anInt3118; local48++) {
				local34[local48] = 4096 - local26[local48];
				local42[local48] = 4096 - local38[local48];
				local46[local48] = 4096 - local30[local48];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(26) int[] local26 = this.method2980(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static129.anInt3118; local28++) {
				local11[local28] = 4096 - local26[local28];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean183 = arg0.method2387() == 1;
		}
	}
}
