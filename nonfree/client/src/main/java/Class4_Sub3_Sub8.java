import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class4_Sub3_Sub8 extends Class4_Sub3 {

	@OriginalMember(owner = "client!di", name = "W", descriptor = "Z")
	private boolean aBoolean50;

	@OriginalMember(owner = "client!di", name = "S", descriptor = "Z")
	private boolean aBoolean49;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean49 = arg1.method1253() == 1;
		} else if (arg0 == 1) {
			this.aBoolean50 = arg1.method1253() == 1;
		} else if (arg0 == 2) {
			super.aBoolean170 = arg1.method1253() == 1;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(29) int[] local29 = this.method3149(this.aBoolean50 ? Static5.anInt216 - arg0 : arg0, 0);
			if (this.aBoolean49) {
				for (@Pc(34) int local34 = 0; local34 < Static134.anInt3188; local34++) {
					local11[local34] = local29[Static2.anInt80 - local34];
				}
			} else {
				Static189.method188(local29, 0, local11, 0, Static134.anInt3188);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(37) int[][] local37 = this.method3150(0, this.aBoolean50 ? Static5.anInt216 - arg0 : arg0);
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local37[0];
			@Pc(49) int[] local49 = local11[2];
			@Pc(53) int[] local53 = local37[2];
			@Pc(57) int[] local57 = local37[1];
			@Pc(61) int[] local61 = local11[1];
			@Pc(66) int local66;
			if (this.aBoolean49) {
				for (local66 = 0; local66 < Static134.anInt3188; local66++) {
					local41[local66] = local45[Static2.anInt80 - local66];
					local61[local66] = local57[Static2.anInt80 - local66];
					local49[local66] = local53[Static2.anInt80 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static134.anInt3188; local66++) {
					local41[local66] = local45[local66];
					local61[local66] = local57[local66];
					local49[local66] = local53[local66];
				}
			}
		}
		return local11;
	}
}
