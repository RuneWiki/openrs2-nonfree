import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class14_Sub7_Sub7 extends Class14_Sub7 {

	@OriginalMember(owner = "client!daa", name = "N", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!daa", name = "R", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!daa", name = "O", descriptor = "I")
	private int anInt1642 = 0;

	@OriginalMember(owner = "client!daa", name = "T", descriptor = "I")
	private int anInt1640 = 2048;

	@OriginalMember(owner = "client!daa", name = "W", descriptor = "I")
	private int anInt1643 = 10;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(26) int local26 = Static655.anIntArray573[arg0];
			@Pc(35) int local35;
			if (this.anInt1642 == 0) {
				@Pc(157) short local157 = 0;
				for (local35 = 0; local35 < this.anInt1643; local35++) {
					if (this.anIntArray86[local35] <= local26 && local26 < this.anIntArray86[local35 + 1]) {
						if (local26 < this.anIntArray87[local35]) {
							local157 = 4096;
						}
						break;
					}
				}
				Static691.method81(local18, 0, Static613.anInt10114, local157);
			} else {
				for (@Pc(31) int local31 = 0; local31 < Static613.anInt10114; local31++) {
					local35 = 0;
					@Pc(37) short local37 = 0;
					@Pc(41) int local41 = Static588.anIntArray506[local31];
					@Pc(44) int local44 = this.anInt1642;
					if (local44 == 1) {
						local35 = local41;
					} else if (local44 == 2) {
						local35 = (local26 + local41 - 4096 >> 1) + 2048;
					} else if (local44 == 3) {
						local35 = (local41 - local26 >> 1) + 2048;
					}
					for (local44 = 0; local44 < this.anInt1643; local44++) {
						if (this.anIntArray86[local44] <= local35 && local35 < this.anIntArray86[local44 + 1]) {
							if (local35 < this.anIntArray87[local44]) {
								local37 = 4096;
							}
							break;
						}
					}
					local18[local31] = local37;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "(I)V")
	@Override
	public void method9386() {
		this.method1578();
	}

	@OriginalMember(owner = "client!daa", name = "h", descriptor = "(I)V")
	private void method1578() {
		@Pc(7) int local7 = 0;
		this.anIntArray87 = new int[this.anInt1643 + 1];
		this.anIntArray86 = new int[this.anInt1643 + 1];
		@Pc(31) int local31 = 4096 / this.anInt1643;
		@Pc(38) int local38 = this.anInt1640 * local31 >> 12;
		for (@Pc(40) int local40 = 0; local40 < this.anInt1643; local40++) {
			this.anIntArray86[local40] = local7;
			this.anIntArray87[local40] = local7 + local38;
			local7 += local31;
		}
		this.anIntArray86[this.anInt1643] = 4096;
		this.anIntArray87[this.anInt1643] = this.anIntArray87[0] + 4096;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt1643 = arg1.method7695(110);
		} else if (arg0 == 1) {
			this.anInt1640 = arg1.method7717(-1978450544);
		} else if (arg0 == 2) {
			this.anInt1642 = arg1.method7695(119);
		}
	}
}
