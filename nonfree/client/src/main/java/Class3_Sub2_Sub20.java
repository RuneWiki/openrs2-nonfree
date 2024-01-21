import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class3_Sub2_Sub20 extends Class3_Sub2 {

	@OriginalMember(owner = "client!me", name = "db", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!me", name = "mb", descriptor = "[I")
	private int[] anIntArray178;

	@OriginalMember(owner = "client!me", name = "eb", descriptor = "I")
	private int anInt2535 = 0;

	@OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
	private int anInt2539 = 10;

	@OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
	private int anInt2532 = 2048;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2539 = arg0.method1278();
		} else if (arg1 == 1) {
			this.anInt2532 = arg0.method1270();
		} else if (arg1 == 2) {
			this.anInt2535 = arg0.method1278();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(27) int local27 = Static34.anIntArray37[arg0];
			@Pc(37) int local37;
			if (this.anInt2535 == 0) {
				@Pc(35) short local35 = 0;
				for (local37 = 0; local37 < this.anInt2539; local37++) {
					if (this.anIntArray178[local37] <= local27 && this.anIntArray178[local37 + 1] > local27) {
						if (local27 < this.anIntArray177[local37]) {
							local35 = 4096;
						}
						break;
					}
				}
				Static218.method2015(local11, 0, Static190.anInt3865, local35);
			} else {
				for (@Pc(85) int local85 = 0; local85 < Static190.anInt3865; local85++) {
					@Pc(89) short local89 = 0;
					local37 = 0;
					@Pc(95) int local95 = Static133.anIntArray187[local85];
					@Pc(98) int local98 = this.anInt2535;
					if (local98 == 1) {
						local37 = local95;
					} else if (local98 == 2) {
						local37 = (local27 + local95 - 4096 >> 1) + 2048;
					} else if (local98 == 3) {
						local37 = (local95 - local27 >> 1) + 2048;
					}
					for (local98 = 0; local98 < this.anInt2539; local98++) {
						if (local37 >= this.anIntArray178[local98] && this.anIntArray178[local98 + 1] > local37) {
							if (this.anIntArray177[local98] > local37) {
								local89 = 4096;
							}
							break;
						}
					}
					local11[local85] = local89;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	@Override
	public void method3329() {
		this.method1825();
	}

	@OriginalMember(owner = "client!me", name = "h", descriptor = "(B)V")
	private void method1825() {
		this.anIntArray178 = new int[this.anInt2539 + 1];
		this.anIntArray177 = new int[this.anInt2539 + 1];
		@Pc(24) int local24 = 4096 / this.anInt2539;
		@Pc(26) int local26 = 0;
		@Pc(33) int local33 = local24 * this.anInt2532 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt2539; local43++) {
			this.anIntArray178[local43] = local26;
			this.anIntArray177[local43] = local26 + local33;
			local26 += local24;
		}
		this.anIntArray178[this.anInt2539] = 4096;
		this.anIntArray177[this.anInt2539] = this.anIntArray177[0] + 4096;
	}
}
