import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub3_Sub35 extends Class1_Sub3 {

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
	private int anInt4934 = 10;

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
	private int anInt4938 = 0;

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
	private int anInt4937 = 2048;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4934 = arg0.method2690();
		} else if (arg1 == 1) {
			this.anInt4937 = arg0.method2691();
		} else if (arg1 == 2) {
			this.anInt4938 = arg0.method2690();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(26) int local26 = Static132.anIntArray265[arg0];
			@Pc(33) int local33;
			if (this.anInt4938 == 0) {
				@Pc(31) short local31 = 0;
				for (local33 = 0; local33 < this.anInt4934; local33++) {
					if (local26 >= this.anIntArray436[local33] && local26 < this.anIntArray436[local33 + 1]) {
						if (local26 < this.anIntArray437[local33]) {
							local31 = 4096;
						}
						break;
					}
				}
				Static304.method2610(local17, 0, Static227.anInt4511, local31);
			} else {
				for (@Pc(89) int local89 = 0; local89 < Static227.anInt4511; local89++) {
					@Pc(98) short local98 = 0;
					@Pc(102) int local102 = Static209.anIntArray377[local89];
					local33 = 0;
					@Pc(107) int local107 = this.anInt4938;
					if (local107 == 1) {
						local33 = local102;
					} else if (local107 == 2) {
						local33 = (local26 + local102 - 4096 >> 1) + 2048;
					} else if (local107 == 3) {
						local33 = (local102 - local26 >> 1) + 2048;
					}
					for (local107 = 0; local107 < this.anInt4934; local107++) {
						if (this.anIntArray436[local107] <= local33 && this.anIntArray436[local107 + 1] > local33) {
							if (local33 < this.anIntArray437[local107]) {
								local98 = 4096;
							}
							break;
						}
					}
					local17[local89] = local98;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V")
	private void method3853() {
		this.anIntArray437 = new int[this.anInt4934 + 1];
		this.anIntArray436 = new int[this.anInt4934 + 1];
		@Pc(24) int local24 = 4096 / this.anInt4934;
		@Pc(31) int local31 = local24 * this.anInt4937 >> 12;
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 0; local35 < this.anInt4934; local35++) {
			this.anIntArray436[local35] = local33;
			this.anIntArray437[local35] = local33 + local31;
			local33 += local24;
		}
		this.anIntArray436[this.anInt4934] = 4096;
		this.anIntArray437[this.anInt4934] = this.anIntArray437[0] + 4096;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	@Override
	public void method4447() {
		this.method3853();
	}
}
