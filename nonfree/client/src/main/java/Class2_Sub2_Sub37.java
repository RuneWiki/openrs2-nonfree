import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class2_Sub2_Sub37 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vg", name = "S", descriptor = "Z")
	private boolean aBoolean179 = true;

	@OriginalMember(owner = "client!vg", name = "Z", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(37) int[][] local37 = this.method3557(this.aBoolean180 ? Static53.anInt1668 - arg0 : arg0, 0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean179) {
				for (local66 = 0; local66 < Static106.anInt3045; local66++) {
					local53[local66] = local41[Static96.anInt3099 - local66];
					local57[local66] = local45[Static96.anInt3099 - local66];
					local61[local66] = local49[Static96.anInt3099 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static106.anInt3045; local66++) {
					local53[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.aBoolean179 = arg1.method218() == 1;
		} else if (arg0 == 1) {
			this.aBoolean180 = arg1.method218() == 1;
		} else if (arg0 == 2) {
			super.aBoolean183 = arg1.method218() == 1;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(29) int[] local29 = this.method3569(this.aBoolean180 ? Static53.anInt1668 - arg0 : arg0, 0);
			if (this.aBoolean179) {
				for (@Pc(34) int local34 = 0; local34 < Static106.anInt3045; local34++) {
					local11[local34] = local29[Static96.anInt3099 - local34];
				}
			} else {
				Static203.method2770(local29, 0, local11, 0, Static106.anInt3045);
			}
		}
		return local11;
	}
}
