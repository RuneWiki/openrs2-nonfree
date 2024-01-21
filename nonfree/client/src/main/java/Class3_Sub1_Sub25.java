import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class3_Sub1_Sub25 extends Class3_Sub1 {

	@OriginalMember(owner = "client!q", name = "Y", descriptor = "[I")
	private int[] anIntArray549;

	@OriginalMember(owner = "client!q", name = "cb", descriptor = "[I")
	private int[] anIntArray550;

	@OriginalMember(owner = "client!q", name = "lb", descriptor = "I")
	private int anInt3223;

	@OriginalMember(owner = "client!q", name = "kb", descriptor = "I")
	private int anInt3222;

	@OriginalMember(owner = "client!q", name = "pb", descriptor = "I")
	private int anInt3225;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3225 = arg1.method1545();
		} else if (arg0 == 1) {
			this.anInt3223 = arg1.method1510();
		} else if (arg0 == 2) {
			this.anInt3222 = arg1.method1545();
		}
	}

	@OriginalMember(owner = "client!q", name = "f", descriptor = "(I)V")
	private void method2486() {
		this.anIntArray550 = new int[this.anInt3225 + 1];
		this.anIntArray549 = new int[this.anInt3225 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt3225;
		@Pc(33) int local33 = local26 * this.anInt3223 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt3225; local39++) {
			this.anIntArray550[local39] = local21;
			this.anIntArray549[local39] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray550[this.anInt3225] = 4096;
		this.anIntArray549[this.anInt3225] = this.anIntArray549[0] + 4096;
	}

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(I)V")
	@Override
	public void method3131() {
		this.method2486();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(24) int local24 = Static22.anIntArray152[arg0];
			@Pc(31) int local31;
			if (this.anInt3222 == 0) {
				@Pc(29) short local29 = 0;
				for (local31 = 0; local31 < this.anInt3225; local31++) {
					if (local24 >= this.anIntArray550[local31] && local24 < this.anIntArray550[local31 + 1]) {
						if (this.anIntArray549[local31] > local24) {
							local29 = 4096;
						}
						break;
					}
				}
				Static188.method2241(local11, 0, Static129.anInt3285, local29);
			} else {
				for (@Pc(75) int local75 = 0; local75 < Static129.anInt3285; local75++) {
					local31 = 0;
					@Pc(81) short local81 = 0;
					@Pc(85) int local85 = Static146.anIntArray618[local75];
					@Pc(88) int local88 = this.anInt3222;
					if (local88 == 1) {
						local31 = local85;
					} else if (local88 == 2) {
						local31 = (local24 + local85 - 4096 >> 1) + 2048;
					} else if (local88 == 3) {
						local31 = (local85 - local24 >> 1) + 2048;
					}
					for (local88 = 0; local88 < this.anInt3225; local88++) {
						if (local31 >= this.anIntArray550[local88] && local31 < this.anIntArray550[local88 + 1]) {
							if (local31 < this.anIntArray549[local88]) {
								local81 = 4096;
							}
							break;
						}
					}
					local11[local75] = local81;
				}
			}
		}
		return local11;
	}
}
