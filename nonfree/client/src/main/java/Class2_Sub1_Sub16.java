import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jf", name = "R", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
	private int anInt2529 = 10;

	@OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
	private int anInt2530 = 2048;

	@OriginalMember(owner = "client!jf", name = "cb", descriptor = "I")
	private int anInt2537 = 0;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2529 = arg0.method4261();
		} else if (arg1 == 1) {
			this.anInt2530 = arg0.method4242();
		} else if (arg1 == 2) {
			this.anInt2537 = arg0.method4261();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	@Override
	public void method4934() {
		this.method2184();
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(B)V")
	private void method2184() {
		this.anIntArray169 = new int[this.anInt2529 + 1];
		this.anIntArray170 = new int[this.anInt2529 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt2529;
		@Pc(33) int local33 = local26 * this.anInt2530 >> 12;
		for (@Pc(44) int local44 = 0; local44 < this.anInt2529; local44++) {
			this.anIntArray170[local44] = local21;
			this.anIntArray169[local44] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray170[this.anInt2529] = 4096;
		this.anIntArray169[this.anInt2529] = this.anIntArray169[0] + 4096;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(28) int local28 = Static234.anIntArray435[arg0];
			@Pc(35) int local35;
			if (this.anInt2537 == 0) {
				@Pc(33) short local33 = 0;
				for (local35 = 0; local35 < this.anInt2529; local35++) {
					if (local28 >= this.anIntArray170[local35] && local28 < this.anIntArray170[local35 + 1]) {
						if (this.anIntArray169[local35] > local28) {
							local33 = 4096;
						}
						break;
					}
				}
				Static301.method301(local11, 0, Static114.anInt1359, local33);
			} else {
				for (@Pc(92) int local92 = 0; local92 < Static114.anInt1359; local92++) {
					@Pc(101) short local101 = 0;
					@Pc(105) int local105 = Static281.anIntArray506[local92];
					local35 = 0;
					@Pc(110) int local110 = this.anInt2537;
					if (local110 == 1) {
						local35 = local105;
					} else if (local110 == 2) {
						local35 = (local105 + local28 - 4096 >> 1) + 2048;
					} else if (local110 == 3) {
						local35 = (local105 - local28 >> 1) + 2048;
					}
					for (local110 = 0; local110 < this.anInt2529; local110++) {
						if (this.anIntArray170[local110] <= local35 && this.anIntArray170[local110 + 1] > local35) {
							if (local35 < this.anIntArray169[local110]) {
								local101 = 4096;
							}
							break;
						}
					}
					local11[local92] = local101;
				}
			}
		}
		return local11;
	}
}
