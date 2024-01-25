import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lga", name = "D", descriptor = "[I")
	private int[] anIntArray396;

	@OriginalMember(owner = "client!lga", name = "F", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!lga", name = "I", descriptor = "I")
	private int anInt5142 = 0;

	@OriginalMember(owner = "client!lga", name = "J", descriptor = "I")
	private int anInt5143 = 10;

	@OriginalMember(owner = "client!lga", name = "H", descriptor = "I")
	private int anInt5141 = 2048;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)V")
	private void method4179() {
		@Pc(7) int local7 = 0;
		this.anIntArray397 = new int[this.anInt5143 + 1];
		this.anIntArray396 = new int[this.anInt5143 + 1];
		@Pc(32) int local32 = 4096 / this.anInt5143;
		@Pc(39) int local39 = this.anInt5141 * local32 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt5143; local41++) {
			this.anIntArray397[local41] = local7;
			this.anIntArray396[local41] = local39 + local7;
			local7 += local32;
		}
		this.anIntArray397[this.anInt5143] = 4096;
		this.anIntArray396[this.anInt5143] = this.anIntArray396[0] + 4096;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)V")
	@Override
	public void method7699() {
		this.method4179();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5143 = arg0.method5750();
		} else if (arg1 == 1) {
			this.anInt5141 = arg0.method5771();
		} else if (arg1 == 2) {
			this.anInt5142 = arg0.method5750();
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(27) int local27 = Static445.anIntArray590[arg0];
			@Pc(37) int local37;
			if (this.anInt5142 == 0) {
				@Pc(35) short local35 = 0;
				for (local37 = 0; local37 < this.anInt5143; local37++) {
					if (this.anIntArray397[local37] <= local27 && this.anIntArray397[local37 + 1] > local27) {
						if (this.anIntArray396[local37] > local27) {
							local35 = 4096;
						}
						break;
					}
				}
				Static598.method1171(local11, 0, Static279.anInt4906, local35);
			} else {
				for (@Pc(85) int local85 = 0; local85 < Static279.anInt4906; local85++) {
					local37 = 0;
					@Pc(91) short local91 = 0;
					@Pc(95) int local95 = Static557.anIntArray708[local85];
					@Pc(98) int local98 = this.anInt5142;
					if (local98 == 1) {
						local37 = local95;
					} else if (local98 == 2) {
						local37 = (local95 + local27 - 4096 >> 1) + 2048;
					} else if (local98 == 3) {
						local37 = (local95 - local27 >> 1) + 2048;
					}
					for (local98 = 0; local98 < this.anInt5143; local98++) {
						if (this.anIntArray397[local98] <= local37 && local37 < this.anIntArray397[local98 + 1]) {
							if (local37 < this.anIntArray396[local98]) {
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
}
