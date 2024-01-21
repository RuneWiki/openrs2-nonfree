import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class2_Sub3_Sub30 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ub", name = "tb", descriptor = "I")
	private int anInt3648;

	@OriginalMember(owner = "client!ub", name = "kb", descriptor = "I")
	private int anInt3643;

	@OriginalMember(owner = "client!ub", name = "ub", descriptor = "I")
	private int anInt3649;

	@OriginalMember(owner = "client!ub", name = "xb", descriptor = "I")
	private int anInt3651;

	@OriginalMember(owner = "client!ub", name = "mb", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3643 = arg1.method1680();
		} else if (arg0 == 1) {
			this.anInt3649 = arg1.method1680();
		} else if (arg0 == 2) {
			this.anInt3648 = arg1.method1680();
		} else if (arg0 == 3) {
			this.anInt3651 = arg1.method1680();
		} else if (arg0 == 4) {
			@Pc(64) int local64 = arg1.method1654();
			this.anIntArray336[2] = local64 >> 12 & 0x0;
			this.anIntArray336[0] = (local64 & 0xFF0000) << 4;
			this.anIntArray336[1] = local64 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(21) int[][] local21 = this.method2900(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static54.anInt1423; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(60) int local60 = local53 - this.anIntArray336[0];
				if (local60 < 0) {
					local60 = -local60;
				}
				if (local60 > this.anInt3643) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(94) int local94 = local29[local47];
					local60 = local94 - this.anIntArray336[1];
					if (local60 < 0) {
						local60 = -local60;
					}
					if (this.anInt3643 < local60) {
						local37[local47] = local53;
						local41[local47] = local94;
						local45[local47] = local33[local47];
					} else {
						@Pc(133) int local133 = local33[local47];
						local60 = local133 - this.anIntArray336[2];
						if (local60 < 0) {
							local60 = -local60;
						}
						if (this.anInt3643 < local60) {
							local37[local47] = local53;
							local41[local47] = local94;
							local45[local47] = local133;
						} else {
							local37[local47] = this.anInt3651 * local53 >> 12;
							local41[local47] = this.anInt3648 * local94 >> 12;
							local45[local47] = local133 * this.anInt3649 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
