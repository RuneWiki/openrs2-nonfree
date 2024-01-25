import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class6_Sub3_Sub38 extends Class6_Sub3 {

	@OriginalMember(owner = "client!wj", name = "E", descriptor = "[I")
	private int[] anIntArray717;

	@OriginalMember(owner = "client!wj", name = "G", descriptor = "[I")
	private int[] anIntArray718;

	@OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
	private int anInt9504 = 0;

	@OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
	private int anInt9506 = 2048;

	@OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
	private int anInt9505 = 10;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "(I)V")
	private void method7776() {
		this.anIntArray718 = new int[this.anInt9505 + 1];
		this.anIntArray717 = new int[this.anInt9505 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt9505;
		@Pc(33) int local33 = local26 * this.anInt9506 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt9505; local35++) {
			this.anIntArray718[local35] = local21;
			this.anIntArray717[local35] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray718[this.anInt9505] = 4096;
		this.anIntArray717[this.anInt9505] = this.anIntArray717[0] + 4096;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(19) int local19 = Static564.anIntArray703[arg0];
			@Pc(29) int local29;
			if (this.anInt9504 == 0) {
				@Pc(27) short local27 = 0;
				for (local29 = 0; local29 < this.anInt9505; local29++) {
					if (local19 >= this.anIntArray718[local29] && local19 < this.anIntArray718[local29 + 1]) {
						if (local19 < this.anIntArray717[local29]) {
							local27 = 4096;
						}
						break;
					}
				}
				Static585.method3075(local11, 0, Static447.anInt8568, local27);
			} else {
				for (@Pc(77) int local77 = 0; local77 < Static447.anInt8568; local77++) {
					local29 = 0;
					@Pc(83) short local83 = 0;
					@Pc(87) int local87 = Static157.anIntArray321[local77];
					@Pc(90) int local90 = this.anInt9504;
					if (local90 == 1) {
						local29 = local87;
					} else if (local90 == 2) {
						local29 = (local19 + local87 - 4096 >> 1) + 2048;
					} else if (local90 == 3) {
						local29 = (local87 - local19 >> 1) + 2048;
					}
					for (local90 = 0; local90 < this.anInt9505; local90++) {
						if (this.anIntArray718[local90] <= local29 && this.anIntArray718[local90 + 1] > local29) {
							if (local29 < this.anIntArray717[local90]) {
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

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
	@Override
	public void method7832() {
		this.method7776();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt9505 = arg1.method6041();
		} else if (arg0 == 1) {
			this.anInt9506 = arg1.method6006();
		} else if (arg0 == 2) {
			this.anInt9504 = arg1.method6041();
		}
	}
}
