import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class3_Sub1_Sub30 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(17) int[] local17 = this.method3120(0, arg0);
			for (@Pc(19) int local19 = 0; local19 < Static129.anInt3285; local19++) {
				local7[local19] = 4096 - local17[local19];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(22) int[][] local22 = this.method3124(0, arg0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[2];
			@Pc(34) int[] local34 = local22[1];
			@Pc(38) int[] local38 = local12[0];
			@Pc(42) int[] local42 = local12[1];
			@Pc(46) int[] local46 = local12[2];
			for (@Pc(48) int local48 = 0; local48 < Static129.anInt3285; local48++) {
				local38[local48] = 4096 - local26[local48];
				local42[local48] = 4096 - local34[local48];
				local46[local48] = 4096 - local30[local48];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean191 = arg1.method1545() == 1;
		}
	}
}
