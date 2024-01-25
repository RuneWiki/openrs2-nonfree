import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class5_Sub3_Sub10 extends Class5_Sub3 {

	@OriginalMember(owner = "client!eq", name = "N", descriptor = "[I")
	private int[] anIntArray125;

	@OriginalMember(owner = "client!eq", name = "J", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!eq", name = "H", descriptor = "I")
	private int anInt2235 = 2048;

	@OriginalMember(owner = "client!eq", name = "K", descriptor = "I")
	private int anInt2239 = 10;

	@OriginalMember(owner = "client!eq", name = "R", descriptor = "I")
	private int anInt2242 = 0;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "(I)V")
	private void method1996() {
		@Pc(7) int local7 = 0;
		this.anIntArray126 = new int[this.anInt2239 + 1];
		this.anIntArray125 = new int[this.anInt2239 + 1];
		@Pc(26) int local26 = 4096 / this.anInt2239;
		@Pc(33) int local33 = this.anInt2235 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt2239; local35++) {
			this.anIntArray126[local35] = local7;
			this.anIntArray125[local35] = local33 + local7;
			local7 += local26;
		}
		if (10 != 10) {
			this.anInt2239 = -16;
		}
		this.anIntArray126[this.anInt2239] = 4096;
		this.anIntArray125[this.anInt2239] = this.anIntArray125[0] + 4096;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
	@Override
	public void method9210() {
		this.method1996();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2239 = arg0.method7291();
		} else if (arg1 == 1) {
			this.anInt2235 = arg0.method7333();
		} else if (arg1 == 2) {
			this.anInt2242 = arg0.method7291();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(30) int local30 = Static458.anIntArray438[arg0];
			@Pc(42) int local42;
			if (this.anInt2242 == 0) {
				@Pc(174) short local174 = 0;
				for (local42 = 0; local42 < this.anInt2239; local42++) {
					if (this.anIntArray126[local42] <= local30 && local30 < this.anIntArray126[local42 + 1]) {
						if (local30 < this.anIntArray125[local42]) {
							local174 = 4096;
						}
						break;
					}
				}
				Static693.method8318(local11, 0, Static7.anInt102, local174);
			} else {
				for (@Pc(38) int local38 = 0; local38 < Static7.anInt102; local38++) {
					local42 = 0;
					@Pc(44) short local44 = 0;
					@Pc(48) int local48 = Static382.anIntArray368[local38];
					@Pc(51) int local51 = this.anInt2242;
					if (local51 == 1) {
						local42 = local48;
					} else if (local51 == 2) {
						local42 = (local48 + local30 - 4096 >> 1) + 2048;
					} else if (local51 == 3) {
						local42 = (local48 - local30 >> 1) + 2048;
					}
					for (local51 = 0; local51 < this.anInt2239; local51++) {
						if (local42 >= this.anIntArray126[local51] && this.anIntArray126[local51 + 1] > local42) {
							if (this.anIntArray125[local51] > local42) {
								local44 = 4096;
							}
							break;
						}
					}
					local11[local38] = local44;
				}
			}
		}
		return local11;
	}
}
