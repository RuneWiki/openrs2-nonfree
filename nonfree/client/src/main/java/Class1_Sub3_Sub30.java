import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class1_Sub3_Sub30 extends Class1_Sub3 {

	@OriginalMember(owner = "client!s", name = "N", descriptor = "[I")
	private int[] anIntArray489;

	@OriginalMember(owner = "client!s", name = "T", descriptor = "[I")
	private int[] anIntArray490;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "I")
	private int anInt6103 = 2048;

	@OriginalMember(owner = "client!s", name = "P", descriptor = "I")
	private int anInt6101 = 0;

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
	private int anInt6108 = 10;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	@Override
	public void method6074() {
		this.method4930();
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
	private void method4930() {
		this.anIntArray490 = new int[this.anInt6108 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray489 = new int[this.anInt6108 + 1];
		@Pc(26) int local26 = 4096 / this.anInt6108;
		@Pc(33) int local33 = local26 * this.anInt6103 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt6108; local35++) {
			this.anIntArray489[local35] = local14;
			this.anIntArray490[local35] = local14 + local33;
			local14 += local26;
		}
		this.anIntArray489[this.anInt6108] = 4096;
		this.anIntArray490[this.anInt6108] = this.anIntArray490[0] + 4096;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6108 = arg0.method4130();
		} else if (arg1 == 1) {
			this.anInt6103 = arg0.method4093();
		} else if (arg1 == 2) {
			this.anInt6101 = arg0.method4130();
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(25) int local25 = Static342.anIntArray469[arg0];
			@Pc(35) int local35;
			if (this.anInt6101 == 0) {
				@Pc(33) short local33 = 0;
				for (local35 = 0; local35 < this.anInt6108; local35++) {
					if (this.anIntArray489[local35] <= local25 && local25 < this.anIntArray489[local35 + 1]) {
						if (this.anIntArray490[local35] > local25) {
							local33 = 4096;
						}
						break;
					}
				}
				Static460.method4215(local17, 0, Static347.anInt5974, local33);
			} else {
				for (@Pc(83) int local83 = 0; local83 < Static347.anInt5974; local83++) {
					local35 = 0;
					@Pc(89) short local89 = 0;
					@Pc(93) int local93 = Static384.anIntArray551[local83];
					@Pc(96) int local96 = this.anInt6101;
					if (local96 == 1) {
						local35 = local93;
					} else if (local96 == 2) {
						local35 = (local25 + local93 - 4096 >> 1) + 2048;
					} else if (local96 == 3) {
						local35 = (local93 - local25 >> 1) + 2048;
					}
					for (local96 = 0; local96 < this.anInt6108; local96++) {
						if (local35 >= this.anIntArray489[local96] && local35 < this.anIntArray489[local96 + 1]) {
							if (local35 < this.anIntArray490[local96]) {
								local89 = 4096;
							}
							break;
						}
					}
					local17[local83] = local89;
				}
			}
		}
		return local17;
	}
}
