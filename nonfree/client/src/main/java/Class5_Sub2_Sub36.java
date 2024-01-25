import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class5_Sub2_Sub36 extends Class5_Sub2 {

	@OriginalMember(owner = "client!w", name = "H", descriptor = "[I")
	private int[] anIntArray586;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "[I")
	private int[] anIntArray587;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "I")
	private int anInt10304 = 0;

	@OriginalMember(owner = "client!w", name = "N", descriptor = "I")
	private int anInt10309 = 10;

	@OriginalMember(owner = "client!w", name = "P", descriptor = "I")
	private int anInt10311 = 2048;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(24) int local24 = Static493.anIntArray476[arg0];
			@Pc(31) int local31;
			if (this.anInt10304 == 0) {
				@Pc(29) short local29 = 0;
				for (local31 = 0; local31 < this.anInt10309; local31++) {
					if (local24 >= this.anIntArray587[local31] && this.anIntArray587[local31 + 1] > local24) {
						if (local24 < this.anIntArray586[local31]) {
							local29 = 4096;
						}
						break;
					}
				}
				Static652.method4544(local11, 0, Static597.anInt10025, local29);
			} else {
				for (@Pc(83) int local83 = 0; local83 < Static597.anInt10025; local83++) {
					local31 = 0;
					@Pc(89) short local89 = 0;
					@Pc(93) int local93 = Static352.anIntArray331[local83];
					@Pc(96) int local96 = this.anInt10304;
					if (local96 == 1) {
						local31 = local93;
					} else if (local96 == 2) {
						local31 = (local24 + local93 - 4096 >> 1) + 2048;
					} else if (local96 == 3) {
						local31 = (local93 - local24 >> 1) + 2048;
					}
					for (local96 = 0; local96 < this.anInt10309; local96++) {
						if (local31 >= this.anIntArray587[local96] && this.anIntArray587[local96 + 1] > local31) {
							if (local31 < this.anIntArray586[local96]) {
								local89 = 4096;
							}
							break;
						}
					}
					local11[local83] = local89;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	@Override
	public void method9044() {
		this.method8781();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10309 = arg0.method5966();
		} else if (arg1 == 1) {
			this.anInt10311 = arg0.method5968();
		} else if (arg1 == 2) {
			this.anInt10304 = arg0.method5966();
		}
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V")
	private void method8781() {
		this.anIntArray587 = new int[this.anInt10309 + 1];
		this.anIntArray586 = new int[this.anInt10309 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt10309;
		@Pc(33) int local33 = this.anInt10311 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt10309; local35++) {
			this.anIntArray587[local35] = local21;
			this.anIntArray586[local35] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray587[this.anInt10309] = 4096;
		this.anIntArray586[this.anInt10309] = this.anIntArray586[0] + 4096;
	}
}
