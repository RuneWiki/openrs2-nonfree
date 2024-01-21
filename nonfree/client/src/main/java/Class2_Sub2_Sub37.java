import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class2_Sub2_Sub37 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vb", name = "U", descriptor = "[I")
	private int[] anIntArray393;

	@OriginalMember(owner = "client!vb", name = "ib", descriptor = "[I")
	private int[] anIntArray394;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
	private int anInt3645;

	@OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
	private int anInt3649;

	@OriginalMember(owner = "client!vb", name = "gb", descriptor = "I")
	private int anInt3658;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
	@Override
	public void method2574() {
		this.method2584();
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
	private void method2584() {
		@Pc(3) int local3 = 0;
		this.anIntArray393 = new int[this.anInt3645 + 1];
		this.anIntArray394 = new int[this.anInt3645 + 1];
		@Pc(35) int local35 = 4096 / this.anInt3645;
		@Pc(42) int local42 = local35 * this.anInt3658 >> 12;
		for (@Pc(44) int local44 = 0; local44 < this.anInt3645; local44++) {
			this.anIntArray394[local44] = local3;
			this.anIntArray393[local44] = local42 + local3;
			local3 += local35;
		}
		this.anIntArray394[this.anInt3645] = 4096;
		this.anIntArray393[this.anInt3645] = this.anIntArray393[0] + 4096;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3645 = arg1.method1461();
		} else if (arg0 == 1) {
			this.anInt3658 = arg1.method1456();
		} else if (arg0 == 2) {
			this.anInt3649 = arg1.method1461();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(24) int local24 = Static86.anIntArray218[arg0];
			@Pc(34) int local34;
			if (this.anInt3649 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt3645; local34++) {
					if (local24 >= this.anIntArray394[local34] && this.anIntArray394[local34 + 1] > local24) {
						if (this.anIntArray393[local34] > local24) {
							local32 = 4096;
						}
						break;
					}
				}
				Static182.method1345(local11, 0, Static149.anInt3233, local32);
			} else {
				for (@Pc(78) int local78 = 0; local78 < Static149.anInt3233; local78++) {
					local34 = 0;
					@Pc(84) short local84 = 0;
					@Pc(88) int local88 = Static154.anIntArray354[local78];
					@Pc(91) int local91 = this.anInt3649;
					if (local91 == 1) {
						local34 = local88;
					} else if (local91 == 2) {
						local34 = (local88 + local24 - 4096 >> 1) + 2048;
					} else if (local91 == 3) {
						local34 = (local88 - local24 >> 1) + 2048;
					}
					for (local91 = 0; local91 < this.anInt3645; local91++) {
						if (local34 >= this.anIntArray394[local91] && this.anIntArray394[local91 + 1] > local34) {
							if (local34 < this.anIntArray393[local91]) {
								local84 = 4096;
							}
							break;
						}
					}
					local11[local78] = local84;
				}
			}
		}
		return local11;
	}
}
