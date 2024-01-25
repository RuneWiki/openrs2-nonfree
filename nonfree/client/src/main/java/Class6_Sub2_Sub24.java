import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class6_Sub2_Sub24 extends Class6_Sub2 {

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "[I")
	private int[] anIntArray402;

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "[I")
	private int[] anIntArray403;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
	private int anInt4571 = 10;

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
	private int anInt4576 = 0;

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
	private int anInt4573 = 2048;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
	@Override
	public void method5862() {
		this.method4084();
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V")
	private void method4084() {
		@Pc(7) int local7 = 0;
		this.anIntArray402 = new int[this.anInt4571 + 1];
		this.anIntArray403 = new int[this.anInt4571 + 1];
		@Pc(26) int local26 = 4096 / this.anInt4571;
		@Pc(33) int local33 = this.anInt4573 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt4571; local35++) {
			this.anIntArray402[local35] = local7;
			this.anIntArray403[local35] = local7 + local33;
			local7 += local26;
		}
		this.anIntArray402[this.anInt4571] = 4096;
		this.anIntArray403[this.anInt4571] = this.anIntArray403[0] + 4096;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(24) int local24 = Static168.anIntArray278[arg0];
			@Pc(34) int local34;
			if (this.anInt4576 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt4571; local34++) {
					if (local24 >= this.anIntArray402[local34] && local24 < this.anIntArray402[local34 + 1]) {
						if (local24 < this.anIntArray403[local34]) {
							local32 = 4096;
						}
						break;
					}
				}
				Static459.method5349(local16, 0, Static185.anInt4925, local32);
			} else {
				for (@Pc(82) int local82 = 0; local82 < Static185.anInt4925; local82++) {
					local34 = 0;
					@Pc(88) short local88 = 0;
					@Pc(92) int local92 = Static53.anIntArray95[local82];
					@Pc(95) int local95 = this.anInt4576;
					if (local95 == 1) {
						local34 = local92;
					} else if (local95 == 2) {
						local34 = (local24 + local92 - 4096 >> 1) + 2048;
					} else if (local95 == 3) {
						local34 = (local92 - local24 >> 1) + 2048;
					}
					for (local95 = 0; local95 < this.anInt4571; local95++) {
						if (this.anIntArray402[local95] <= local34 && this.anIntArray402[local95 + 1] > local34) {
							if (this.anIntArray403[local95] > local34) {
								local88 = 4096;
							}
							break;
						}
					}
					local16[local82] = local88;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4571 = arg0.method3111();
		} else if (arg1 == 1) {
			this.anInt4573 = arg0.method3108();
		} else if (arg1 == 2) {
			this.anInt4576 = arg0.method3111();
		}
	}
}
