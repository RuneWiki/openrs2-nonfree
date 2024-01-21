import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class2_Sub3_Sub37 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vd", name = "T", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!vd", name = "fb", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!vd", name = "ab", descriptor = "I")
	private int anInt3781;

	@OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
	private int anInt3778;

	@OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
	private int anInt3779;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	@Override
	public void method3019() {
		this.method2873();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(24) int local24 = Static50.anIntArray106[arg0];
			@Pc(33) int local33;
			if (this.anInt3781 == 0) {
				@Pc(133) short local133 = 0;
				for (local33 = 0; local33 < this.anInt3778; local33++) {
					if (local24 >= this.anIntArray346[local33] && this.anIntArray346[local33 + 1] > local24) {
						if (local24 < this.anIntArray345[local33]) {
							local133 = 4096;
						}
						break;
					}
				}
				Static191.method1825(local11, 0, Static53.anInt1184, local133);
			} else {
				for (@Pc(29) int local29 = 0; local29 < Static53.anInt1184; local29++) {
					local33 = 0;
					@Pc(35) short local35 = 0;
					@Pc(39) int local39 = Static43.anIntArray102[local29];
					@Pc(42) int local42 = this.anInt3781;
					if (local42 == 1) {
						local33 = local39;
					} else if (local42 == 2) {
						local33 = (local39 + local24 - 4096 >> 1) + 2048;
					} else if (local42 == 3) {
						local33 = (local39 - local24 >> 1) + 2048;
					}
					for (local42 = 0; local42 < this.anInt3778; local42++) {
						if (local33 >= this.anIntArray346[local42] && local33 < this.anIntArray346[local42 + 1]) {
							if (this.anIntArray345[local42] > local33) {
								local35 = 4096;
							}
							break;
						}
					}
					local11[local29] = local35;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt3778 = arg1.method2962();
		} else if (arg0 == 1) {
			this.anInt3779 = arg1.method2933();
		} else if (arg0 == 2) {
			this.anInt3781 = arg1.method2962();
		}
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
	private void method2873() {
		this.anIntArray345 = new int[this.anInt3778 + 1];
		this.anIntArray346 = new int[this.anInt3778 + 1];
		@Pc(27) int local27 = 0;
		@Pc(32) int local32 = 4096 / this.anInt3778;
		@Pc(39) int local39 = local32 * this.anInt3779 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt3778; local41++) {
			this.anIntArray346[local41] = local27;
			this.anIntArray345[local41] = local27 + local39;
			local27 += local32;
		}
		this.anIntArray346[this.anInt3778] = 4096;
		this.anIntArray345[this.anInt3778] = this.anIntArray345[0] + 4096;
	}
}
