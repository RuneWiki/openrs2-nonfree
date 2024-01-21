import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class1_Sub4_Sub26 extends Class1_Sub4 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(21) int[][] local21 = this.method3217(0, arg0);
			@Pc(25) int[] local25 = local21[1];
			@Pc(29) int[] local29 = local21[0];
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local21[2];
			@Pc(41) int[] local41 = local11[2];
			@Pc(45) int[] local45 = local11[1];
			for (@Pc(47) int local47 = 0; local47 < Static73.anInt1888; local47++) {
				local33[local47] = 4096 - local29[local47];
				local45[local47] = 4096 - local25[local47];
				local41[local47] = 4096 - local37[local47];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(26) int[] local26 = this.method3215(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static73.anInt1888; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean210 = arg0.method544() == 1;
		}
	}
}
