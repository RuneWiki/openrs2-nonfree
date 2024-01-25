import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class5_Sub1_Sub3 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ar", name = "G", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!ar", name = "J", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
	private int anInt412 = 0;

	@OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
	private int anInt415 = 2048;

	@OriginalMember(owner = "client!ar", name = "O", descriptor = "I")
	private int anInt420 = 10;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt420 = arg1.method5539();
		} else if (arg0 == 1) {
			this.anInt415 = arg1.method5598();
		} else if (arg0 == 2) {
			this.anInt412 = arg1.method5539();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(24) int local24 = Static346.anIntArray401[arg0];
			@Pc(31) int local31;
			if (this.anInt412 == 0) {
				@Pc(29) short local29 = 0;
				for (local31 = 0; local31 < this.anInt420; local31++) {
					if (local24 >= this.anIntArray17[local31] && this.anIntArray17[local31 + 1] > local24) {
						if (local24 < this.anIntArray16[local31]) {
							local29 = 4096;
						}
						break;
					}
				}
				Static468.method3861(local16, 0, Static148.anInt2666, local29);
			} else {
				for (@Pc(83) int local83 = 0; local83 < Static148.anInt2666; local83++) {
					local31 = 0;
					@Pc(89) short local89 = 0;
					@Pc(93) int local93 = Static224.anIntArray234[local83];
					@Pc(96) int local96 = this.anInt412;
					if (local96 == 1) {
						local31 = local93;
					} else if (local96 == 2) {
						local31 = (local93 + local24 - 4096 >> 1) + 2048;
					} else if (local96 == 3) {
						local31 = (local93 - local24 >> 1) + 2048;
					}
					for (local96 = 0; local96 < this.anInt420; local96++) {
						if (local31 >= this.anIntArray17[local96] && this.anIntArray17[local96 + 1] > local31) {
							if (local31 < this.anIntArray16[local96]) {
								local89 = 4096;
							}
							break;
						}
					}
					local16[local83] = local89;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
	@Override
	public void method5762() {
		this.method324();
	}

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)V")
	private void method324() {
		@Pc(7) int local7 = 0;
		this.anIntArray16 = new int[this.anInt420 + 1];
		this.anIntArray17 = new int[this.anInt420 + 1];
		@Pc(26) int local26 = 4096 / this.anInt420;
		@Pc(33) int local33 = local26 * this.anInt415 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt420; local35++) {
			this.anIntArray17[local35] = local7;
			this.anIntArray16[local35] = local33 + local7;
			local7 += local26;
		}
		this.anIntArray17[this.anInt420] = 4096;
		this.anIntArray16[this.anInt420] = this.anIntArray16[0] + 4096;
	}
}
