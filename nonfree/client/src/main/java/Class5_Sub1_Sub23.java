import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class5_Sub1_Sub23 extends Class5_Sub1 {

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "[I")
	private int[] anIntArray465;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "[I")
	private int[] anIntArray466;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
	private int anInt6201 = 0;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
	private int anInt6203 = 2048;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
	private int anInt6206 = 10;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
	private void method5170() {
		@Pc(7) int local7 = 0;
		this.anIntArray466 = new int[this.anInt6206 + 1];
		this.anIntArray465 = new int[this.anInt6206 + 1];
		@Pc(30) int local30 = 4096 / this.anInt6206;
		@Pc(37) int local37 = this.anInt6203 * local30 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt6206; local39++) {
			this.anIntArray466[local39] = local7;
			this.anIntArray465[local39] = local7 + local37;
			local7 += local30;
		}
		this.anIntArray466[this.anInt6206] = 4096;
		this.anIntArray465[this.anInt6206] = this.anIntArray465[0] + 4096;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(19) int local19 = Static295.anIntArray403[arg0];
			@Pc(29) int local29;
			if (this.anInt6201 == 0) {
				@Pc(27) short local27 = 0;
				for (local29 = 0; local29 < this.anInt6206; local29++) {
					if (local19 >= this.anIntArray466[local29] && local19 < this.anIntArray466[local29 + 1]) {
						if (this.anIntArray465[local29] > local19) {
							local27 = 4096;
						}
						break;
					}
				}
				Static553.method2532(local11, 0, Static147.anInt3075, local27);
			} else {
				for (@Pc(85) int local85 = 0; local85 < Static147.anInt3075; local85++) {
					local29 = 0;
					@Pc(91) short local91 = 0;
					@Pc(95) int local95 = Static315.anIntArray425[local85];
					@Pc(98) int local98 = this.anInt6201;
					if (local98 == 1) {
						local29 = local95;
					} else if (local98 == 2) {
						local29 = (local95 + local19 - 4096 >> 1) + 2048;
					} else if (local98 == 3) {
						local29 = (local95 - local19 >> 1) + 2048;
					}
					for (local98 = 0; local98 < this.anInt6206; local98++) {
						if (this.anIntArray466[local98] <= local29 && this.anIntArray466[local98 + 1] > local29) {
							if (local29 < this.anIntArray465[local98]) {
								local91 = 4096;
							}
							break;
						}
					}
					local11[local85] = local91;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt6206 = arg1.method4220();
		} else if (arg0 == 1) {
			this.anInt6203 = arg1.method4227();
		} else if (arg0 == 2) {
			this.anInt6201 = arg1.method4220();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
		this.method5170();
	}
}
