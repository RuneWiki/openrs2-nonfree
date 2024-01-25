import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class4_Sub2_Sub18 extends Class4_Sub2 {

	@OriginalMember(owner = "client!iq", name = "K", descriptor = "I")
	private int anInt3288 = 4096;

	@OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
	private int anInt3286 = 4096;

	@OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
	private int anInt3290 = 409;

	@OriginalMember(owner = "client!iq", name = "Q", descriptor = "[I")
	private final int[] anIntArray273 = new int[3];

	@OriginalMember(owner = "client!iq", name = "O", descriptor = "I")
	private int anInt3291 = 4096;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt3290 = arg1.method4877();
		} else if (arg0 == 1) {
			this.anInt3286 = arg1.method4877();
		} else if (arg0 == 2) {
			this.anInt3288 = arg1.method4877();
		} else if (arg0 == 3) {
			this.anInt3291 = arg1.method4877();
		} else if (arg0 == 4) {
			@Pc(58) int local58 = arg1.method4887();
			this.anIntArray273[1] = local58 >> 4 & 0xFF0;
			this.anIntArray273[0] = (local58 & 0xFF0000) << 4;
			this.anIntArray273[2] = local58 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(21) int[][] local21 = this.method5848(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static350.anInt6330; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(61) int local61 = local53 - this.anIntArray273[0];
				if (local61 < 0) {
					local61 = -local61;
				}
				if (this.anInt3290 < local61) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(92) int local92 = local29[local47];
					local61 = local92 - this.anIntArray273[1];
					if (local61 < 0) {
						local61 = -local61;
					}
					if (local61 > this.anInt3290) {
						local37[local47] = local53;
						local41[local47] = local92;
						local45[local47] = local33[local47];
					} else {
						@Pc(131) int local131 = local33[local47];
						local61 = local131 - this.anIntArray273[2];
						if (local61 < 0) {
							local61 = -local61;
						}
						if (this.anInt3290 < local61) {
							local37[local47] = local53;
							local41[local47] = local92;
							local45[local47] = local131;
						} else {
							local37[local47] = this.anInt3291 * local53 >> 12;
							local41[local47] = local92 * this.anInt3288 >> 12;
							local45[local47] = local131 * this.anInt3286 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
