import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class1_Sub3_Sub25 extends Class1_Sub3 {

	@OriginalMember(owner = "client!of", name = "T", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!of", name = "W", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!of", name = "P", descriptor = "I")
	private int anInt3955 = 0;

	@OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
	private int anInt3962 = 2048;

	@OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
	private int anInt3964 = 10;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(I)V")
	private void method2945() {
		this.anIntArray297 = new int[this.anInt3964 + 1];
		this.anIntArray296 = new int[this.anInt3964 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt3964;
		@Pc(33) int local33 = local26 * this.anInt3962 >> 12;
		for (@Pc(40) int local40 = 0; local40 < this.anInt3964; local40++) {
			this.anIntArray297[local40] = local21;
			this.anIntArray296[local40] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray297[this.anInt3964] = 4096;
		this.anIntArray296[this.anInt3964] = this.anIntArray296[0] + 4096;
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V")
	@Override
	public void method4118() {
		this.method2945();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(12) int[] local12 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(24) int local24 = Static94.anIntArray321[arg0];
			@Pc(31) int local31;
			if (this.anInt3955 == 0) {
				@Pc(29) short local29 = 0;
				for (local31 = 0; local31 < this.anInt3964; local31++) {
					if (local24 >= this.anIntArray297[local31] && this.anIntArray297[local31 + 1] > local24) {
						if (local24 < this.anIntArray296[local31]) {
							local29 = 4096;
						}
						break;
					}
				}
				Static274.method2689(local12, 0, Static110.anInt2934, local29);
			} else {
				for (@Pc(75) int local75 = 0; local75 < Static110.anInt2934; local75++) {
					local31 = 0;
					@Pc(83) int local83 = Static175.anIntArray302[local75];
					@Pc(85) short local85 = 0;
					@Pc(88) int local88 = this.anInt3955;
					if (local88 == 1) {
						local31 = local83;
					} else if (local88 == 2) {
						local31 = (local83 + local24 - 4096 >> 1) + 2048;
					} else if (local88 == 3) {
						local31 = (local83 - local24 >> 1) + 2048;
					}
					for (local88 = 0; local88 < this.anInt3964; local88++) {
						if (this.anIntArray297[local88] <= local31 && this.anIntArray297[local88 + 1] > local31) {
							if (local31 < this.anIntArray296[local88]) {
								local85 = 4096;
							}
							break;
						}
					}
					local12[local75] = local85;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3964 = arg0.method1772();
		} else if (arg1 == 1) {
			this.anInt3962 = arg0.method1764();
		} else if (arg1 == 2) {
			this.anInt3955 = arg0.method1772();
		}
	}
}
