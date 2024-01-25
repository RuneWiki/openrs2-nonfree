import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class4_Sub2_Sub3 extends Class4_Sub2 {

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
	private int anInt687 = 0;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
	private int anInt685 = 10;

	@OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
	private int anInt693 = 2048;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	@Override
	public void method8769() {
		this.method664();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt685 = arg1.method8865();
		} else if (arg0 == 1) {
			this.anInt693 = arg1.method8859();
		} else if (arg0 == 2) {
			this.anInt687 = arg1.method8865();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(23) int local23 = Static429.anIntArray465[arg0];
			@Pc(30) int local30;
			if (this.anInt687 == 0) {
				@Pc(28) short local28 = 0;
				for (local30 = 0; local30 < this.anInt685; local30++) {
					if (local23 >= this.anIntArray59[local30] && this.anIntArray59[local30 + 1] > local23) {
						if (this.anIntArray60[local30] > local23) {
							local28 = 4096;
						}
						break;
					}
				}
				Static685.method6467(local15, 0, Static269.anInt4330, local28);
			} else {
				for (@Pc(78) int local78 = 0; local78 < Static269.anInt4330; local78++) {
					local30 = 0;
					@Pc(84) short local84 = 0;
					@Pc(88) int local88 = Static312.anIntArray370[local78];
					@Pc(91) int local91 = this.anInt687;
					if (local91 == 1) {
						local30 = local88;
					} else if (local91 == 2) {
						local30 = (local23 + local88 - 4096 >> 1) + 2048;
					} else if (local91 == 3) {
						local30 = (local88 - local23 >> 1) + 2048;
					}
					for (local91 = 0; local91 < this.anInt685; local91++) {
						if (local30 >= this.anIntArray59[local91] && local30 < this.anIntArray59[local91 + 1]) {
							if (this.anIntArray60[local91] > local30) {
								local84 = 4096;
							}
							break;
						}
					}
					local15[local78] = local84;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	private void method664() {
		this.anIntArray60 = new int[this.anInt685 + 1];
		this.anIntArray59 = new int[this.anInt685 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt685;
		@Pc(33) int local33 = this.anInt693 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt685; local35++) {
			this.anIntArray59[local35] = local21;
			this.anIntArray60[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray59[this.anInt685] = 4096;
		this.anIntArray60[this.anInt685] = this.anIntArray60[0] + 4096;
	}
}
