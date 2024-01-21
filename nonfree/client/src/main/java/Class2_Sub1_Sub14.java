import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hd", name = "kb", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!hd", name = "lb", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!hd", name = "sb", descriptor = "I")
	private int anInt1659;

	@OriginalMember(owner = "client!hd", name = "cb", descriptor = "I")
	private int anInt1651;

	@OriginalMember(owner = "client!hd", name = "rb", descriptor = "I")
	private int anInt1658;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V")
	@Override
	public void method2992() {
		this.method1150();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(19) int local19 = Static166.anIntArray619[arg0];
			@Pc(29) int local29;
			if (this.anInt1659 == 0) {
				@Pc(27) short local27 = 0;
				for (local29 = 0; local29 < this.anInt1658; local29++) {
					if (local19 >= this.anIntArray255[local29] && local19 < this.anIntArray255[local29 + 1]) {
						if (local19 < this.anIntArray254[local29]) {
							local27 = 4096;
						}
						break;
					}
				}
				Static186.method1562(local11, 0, Static129.anInt3118, local27);
			} else {
				for (@Pc(81) int local81 = 0; local81 < Static129.anInt3118; local81++) {
					@Pc(87) int local87 = Static163.anIntArray577[local81];
					local29 = 0;
					@Pc(92) int local92 = this.anInt1659;
					if (local92 == 1) {
						local29 = local87;
					} else if (local92 == 2) {
						local29 = (local19 + local87 - 4096 >> 1) + 2048;
					} else if (local92 == 3) {
						local29 = (local87 - local19 >> 1) + 2048;
					}
					@Pc(132) short local132 = 0;
					for (local92 = 0; local92 < this.anInt1658; local92++) {
						if (this.anIntArray255[local92] <= local29 && this.anIntArray255[local92 + 1] > local29) {
							if (this.anIntArray254[local92] > local29) {
								local132 = 4096;
							}
							break;
						}
					}
					local11[local81] = local132;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "(I)V")
	private void method1150() {
		this.anIntArray254 = new int[this.anInt1658 + 1];
		this.anIntArray255 = new int[this.anInt1658 + 1];
		@Pc(24) int local24 = 4096 / this.anInt1658;
		@Pc(31) int local31 = local24 * this.anInt1651 >> 12;
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 0; local35 < this.anInt1658; local35++) {
			this.anIntArray255[local35] = local33;
			this.anIntArray254[local35] = local31 + local33;
			local33 += local24;
		}
		this.anIntArray255[this.anInt1658] = 4096;
		this.anIntArray254[this.anInt1658] = this.anIntArray254[0] + 4096;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1658 = arg0.method2387();
		} else if (arg1 == 1) {
			this.anInt1651 = arg0.method2353();
		} else if (arg1 == 2) {
			this.anInt1659 = arg0.method2387();
		}
	}
}
