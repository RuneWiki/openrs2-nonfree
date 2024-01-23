import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "Z")
	private boolean aBoolean49 = true;

	@OriginalMember(owner = "client!ga", name = "R", descriptor = "Z")
	private boolean aBoolean50 = true;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(35) int[][] local35 = this.method3952(0, this.aBoolean50 ? Static156.anInt3604 - arg0 : arg0);
			@Pc(39) int[] local39 = local35[0];
			@Pc(43) int[] local43 = local35[1];
			@Pc(47) int[] local47 = local35[2];
			@Pc(51) int[] local51 = local7[0];
			@Pc(55) int[] local55 = local7[2];
			@Pc(59) int[] local59 = local7[1];
			@Pc(64) int local64;
			if (this.aBoolean49) {
				for (local64 = 0; local64 < Static54.anInt953; local64++) {
					local51[local64] = local39[Static74.anInt1601 - local64];
					local59[local64] = local43[Static74.anInt1601 - local64];
					local55[local64] = local47[Static74.anInt1601 - local64];
				}
			} else {
				for (local64 = 0; local64 < Static54.anInt953; local64++) {
					local51[local64] = local39[local64];
					local59[local64] = local43[local64];
					local55[local64] = local47[local64];
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean49 = arg0.method2122() == 1;
		} else if (arg1 == 1) {
			this.aBoolean50 = arg0.method2122() == 1;
		} else if (arg1 == 2) {
			super.aBoolean212 = arg0.method2122() == 1;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(34) int[] local34 = this.method3955(0, this.aBoolean50 ? Static156.anInt3604 - arg0 : arg0);
			if (this.aBoolean49) {
				for (@Pc(47) int local47 = 0; local47 < Static54.anInt953; local47++) {
					local11[local47] = local34[Static74.anInt1601 - local47];
				}
			} else {
				Static231.method2216(local34, 0, local11, 0, Static54.anInt953);
			}
		}
		return local11;
	}
}
