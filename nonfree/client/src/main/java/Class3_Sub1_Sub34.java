import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class3_Sub1_Sub34 extends Class3_Sub1 {

	@OriginalMember(owner = "client!u", name = "jb", descriptor = "I")
	private int anInt3863;

	@OriginalMember(owner = "client!u", name = "mb", descriptor = "I")
	private int anInt3865;

	@OriginalMember(owner = "client!u", name = "lb", descriptor = "I")
	private int anInt3864;

	@OriginalMember(owner = "client!u", name = "qb", descriptor = "[I")
	private int[] anIntArray647;

	@OriginalMember(owner = "client!u", name = "nb", descriptor = "I")
	private int anInt3866;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(21) int[][] local21 = this.method3124(0, arg0);
			@Pc(25) int[] local25 = local21[1];
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local21[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static129.anInt3285; local47++) {
				@Pc(53) int local53 = local37[local47];
				@Pc(61) int local61 = local53 - this.anIntArray647[0];
				if (local61 < 0) {
					local61 = -local61;
				}
				if (this.anInt3863 < local61) {
					local29[local47] = local53;
					local41[local47] = local25[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(92) int local92 = local25[local47];
					local61 = local92 - this.anIntArray647[1];
					if (local61 < 0) {
						local61 = -local61;
					}
					if (local61 > this.anInt3863) {
						local29[local47] = local53;
						local41[local47] = local92;
						local45[local47] = local33[local47];
					} else {
						@Pc(129) int local129 = local33[local47];
						local61 = local129 - this.anIntArray647[2];
						if (local61 < 0) {
							local61 = -local61;
						}
						if (this.anInt3863 < local61) {
							local29[local47] = local53;
							local41[local47] = local92;
							local45[local47] = local129;
						} else {
							local29[local47] = this.anInt3865 * local53 >> 12;
							local41[local47] = this.anInt3866 * local92 >> 12;
							local45[local47] = local129 * this.anInt3864 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3863 = arg1.method1510();
		} else if (arg0 == 1) {
			this.anInt3864 = arg1.method1510();
		} else if (arg0 == 2) {
			this.anInt3866 = arg1.method1510();
		} else if (arg0 == 3) {
			this.anInt3865 = arg1.method1510();
		} else if (arg0 == 4) {
			@Pc(59) int local59 = arg1.method1554();
			this.anIntArray647[2] = local59 >> 12 & 0x0;
			this.anIntArray647[0] = (local59 & 0xFF0000) << 4;
			this.anIntArray647[1] = local59 >> 4 & 0xFF0;
		}
	}
}
