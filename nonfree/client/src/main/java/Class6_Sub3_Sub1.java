import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class6_Sub3_Sub1 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ag", name = "J", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
	private int anInt182 = 2048;

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
	private int anInt185 = 10;

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
	private int anInt188 = 0;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "(I)V")
	private void method172() {
		this.anIntArray9 = new int[this.anInt185 + 1];
		this.anIntArray10 = new int[this.anInt185 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt185;
		@Pc(39) int local39 = local26 * this.anInt182 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt185; local41++) {
			this.anIntArray9[local41] = local21;
			this.anIntArray10[local41] = local39 + local21;
			local21 += local26;
		}
		this.anIntArray9[this.anInt185] = 4096;
		this.anIntArray10[this.anInt185] = this.anIntArray10[0] + 4096;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(19) int local19 = Static77.anIntArray116[arg0];
			@Pc(29) int local29;
			if (this.anInt188 == 0) {
				@Pc(27) short local27 = 0;
				for (local29 = 0; local29 < this.anInt185; local29++) {
					if (local19 >= this.anIntArray9[local29] && local19 < this.anIntArray9[local29 + 1]) {
						if (this.anIntArray10[local29] > local19) {
							local27 = 4096;
						}
						break;
					}
				}
				Static596.method7718(local11, 0, Static35.anInt670, local27);
			} else {
				for (@Pc(77) int local77 = 0; local77 < Static35.anInt670; local77++) {
					local29 = 0;
					@Pc(83) short local83 = 0;
					@Pc(87) int local87 = Static372.anIntArray481[local77];
					@Pc(90) int local90 = this.anInt188;
					if (local90 == 1) {
						local29 = local87;
					} else if (local90 == 2) {
						local29 = (local19 + local87 - 4096 >> 1) + 2048;
					} else if (local90 == 3) {
						local29 = (local87 - local19 >> 1) + 2048;
					}
					for (local90 = 0; local90 < this.anInt185; local90++) {
						if (local29 >= this.anIntArray9[local90] && this.anIntArray9[local90 + 1] > local29) {
							if (local29 < this.anIntArray10[local90]) {
								local83 = 4096;
							}
							break;
						}
					}
					local11[local77] = local83;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt185 = arg1.method6019();
		} else if (arg0 == 1) {
			this.anInt182 = arg1.method6044();
		} else if (arg0 == 2) {
			this.anInt188 = arg1.method6019();
		}
	}

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V")
	@Override
	public void method7957() {
		this.method172();
	}
}
