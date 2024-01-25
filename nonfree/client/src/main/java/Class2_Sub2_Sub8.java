import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ffa", name = "H", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!ffa", name = "Q", descriptor = "[I")
	private int[] anIntArray178;

	@OriginalMember(owner = "client!ffa", name = "M", descriptor = "I")
	private int anInt2964 = 0;

	@OriginalMember(owner = "client!ffa", name = "O", descriptor = "I")
	private int anInt2966 = 10;

	@OriginalMember(owner = "client!ffa", name = "S", descriptor = "I")
	private int anInt2969 = 2048;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(27) int local27 = Static211.anIntArray576[arg0];
			@Pc(37) int local37;
			if (this.anInt2964 == 0) {
				@Pc(35) short local35 = 0;
				for (local37 = 0; local37 < this.anInt2966; local37++) {
					if (local27 >= this.anIntArray177[local37] && this.anIntArray177[local37 + 1] > local27) {
						if (this.anIntArray178[local37] > local27) {
							local35 = 4096;
						}
						break;
					}
				}
				Static598.method1134(local11, 0, Static153.anInt3070, local35);
			} else {
				for (@Pc(85) int local85 = 0; local85 < Static153.anInt3070; local85++) {
					local37 = 0;
					@Pc(91) short local91 = 0;
					@Pc(95) int local95 = Static260.anIntArray327[local85];
					@Pc(98) int local98 = this.anInt2964;
					if (local98 == 1) {
						local37 = local95;
					} else if (local98 == 2) {
						local37 = (local95 + local27 - 4096 >> 1) + 2048;
					} else if (local98 == 3) {
						local37 = (local95 - local27 >> 1) + 2048;
					}
					for (local98 = 0; local98 < this.anInt2966; local98++) {
						if (this.anIntArray177[local98] <= local37 && this.anIntArray177[local98 + 1] > local37) {
							if (local37 < this.anIntArray178[local98]) {
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

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2966 = arg0.method4325();
		} else if (arg1 == 1) {
			this.anInt2969 = arg0.method4294();
		} else if (arg1 == 2) {
			this.anInt2964 = arg0.method4325();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
	@Override
	public void method7948() {
		this.method2404();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V")
	private void method2404() {
		this.anIntArray178 = new int[this.anInt2966 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray177 = new int[this.anInt2966 + 1];
		@Pc(26) int local26 = 4096 / this.anInt2966;
		@Pc(33) int local33 = local26 * this.anInt2969 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt2966; local41++) {
			this.anIntArray177[local41] = local14;
			this.anIntArray178[local41] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray177[this.anInt2966] = 4096;
		this.anIntArray178[this.anInt2966] = this.anIntArray178[0] + 4096;
	}
}
