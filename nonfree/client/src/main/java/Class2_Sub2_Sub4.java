import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!bf", name = "kb", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!bf", name = "Y", descriptor = "I")
	private int anInt550 = 2048;

	@OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
	private int anInt554 = 0;

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
	private int anInt557 = 10;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)V")
	private void method427() {
		this.anIntArray49 = new int[this.anInt557 + 1];
		this.anIntArray47 = new int[this.anInt557 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt557;
		@Pc(33) int local33 = this.anInt550 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt557; local35++) {
			this.anIntArray49[local35] = local21;
			this.anIntArray47[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray49[this.anInt557] = 4096;
		this.anIntArray47[this.anInt557] = this.anIntArray47[0] + 4096;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt557 = arg1.method218();
		} else if (arg0 == 1) {
			this.anInt550 = arg1.method234();
		} else if (arg0 == 2) {
			this.anInt554 = arg1.method218();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(22) int local22 = Static160.anIntArray187[arg0];
			@Pc(31) int local31;
			if (this.anInt554 == 0) {
				@Pc(128) short local128 = 0;
				for (local31 = 0; local31 < this.anInt557; local31++) {
					if (local22 >= this.anIntArray49[local31] && local22 < this.anIntArray49[local31 + 1]) {
						if (local22 < this.anIntArray47[local31]) {
							local128 = 4096;
						}
						break;
					}
				}
				Static203.method2768(local14, 0, Static106.anInt3045, local128);
			} else {
				for (@Pc(27) int local27 = 0; local27 < Static106.anInt3045; local27++) {
					local31 = 0;
					@Pc(35) int local35 = Static15.anIntArray41[local27];
					@Pc(38) int local38 = this.anInt554;
					if (local38 == 1) {
						local31 = local35;
					} else if (local38 == 2) {
						local31 = (local22 + local35 - 4096 >> 1) + 2048;
					} else if (local38 == 3) {
						local31 = (local35 - local22 >> 1) + 2048;
					}
					@Pc(79) short local79 = 0;
					for (local38 = 0; local38 < this.anInt557; local38++) {
						if (local31 >= this.anIntArray49[local38] && local31 < this.anIntArray49[local38 + 1]) {
							if (this.anIntArray47[local38] > local31) {
								local79 = 4096;
							}
							break;
						}
					}
					local14[local27] = local79;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
	@Override
	public void method3563() {
		this.method427();
	}
}
