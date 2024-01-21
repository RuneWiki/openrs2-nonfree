import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class3_Sub2_Sub16 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!lf", name = "fb", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
	private int anInt2065;

	@OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
	private int anInt2061;

	@OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
	private int anInt2067;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(26) int local26 = Static123.anIntArray308[arg0];
			@Pc(36) int local36;
			if (this.anInt2067 == 0) {
				@Pc(34) short local34 = 0;
				for (local36 = 0; local36 < this.anInt2061; local36++) {
					if (this.anIntArray218[local36] <= local26 && this.anIntArray218[local36 + 1] > local26) {
						if (local26 < this.anIntArray219[local36]) {
							local34 = 4096;
						}
						break;
					}
				}
				Static184.method1122(local7, 0, Static86.anInt1942, local34);
			} else {
				for (@Pc(84) int local84 = 0; local84 < Static86.anInt1942; local84++) {
					local36 = 0;
					@Pc(92) int local92 = Static165.anIntArray17[local84];
					@Pc(94) short local94 = 0;
					@Pc(97) int local97 = this.anInt2067;
					if (local97 == 1) {
						local36 = local92;
					} else if (local97 == 2) {
						local36 = (local92 + local26 - 4096 >> 1) + 2048;
					} else if (local97 == 3) {
						local36 = (local92 - local26 >> 1) + 2048;
					}
					for (local97 = 0; local97 < this.anInt2061; local97++) {
						if (local36 >= this.anIntArray218[local97] && local36 < this.anIntArray218[local97 + 1]) {
							if (this.anIntArray219[local97] > local36) {
								local94 = 4096;
							}
							break;
						}
					}
					local7[local84] = local94;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
	private void method1620() {
		this.anIntArray218 = new int[this.anInt2061 + 1];
		this.anIntArray219 = new int[this.anInt2061 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt2061;
		@Pc(33) int local33 = this.anInt2065 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt2061; local35++) {
			this.anIntArray218[local35] = local21;
			this.anIntArray219[local35] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray218[this.anInt2061] = 4096;
		this.anIntArray219[this.anInt2061] = this.anIntArray219[0] + 4096;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	@Override
	public void method2786() {
		this.method1620();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2061 = arg0.method1354();
		} else if (arg1 == 1) {
			this.anInt2065 = arg0.method1359();
		} else if (arg1 == 2) {
			this.anInt2067 = arg0.method1354();
		}
	}
}
