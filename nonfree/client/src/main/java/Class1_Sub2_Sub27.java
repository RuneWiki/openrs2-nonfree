import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class1_Sub2_Sub27 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pg", name = "U", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!pg", name = "gb", descriptor = "[I")
	private int[] anIntArray441;

	@OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
	private int anInt3393 = 2048;

	@OriginalMember(owner = "client!pg", name = "bb", descriptor = "I")
	private int anInt3395 = 10;

	@OriginalMember(owner = "client!pg", name = "db", descriptor = "I")
	private int anInt3396 = 0;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	private void method2588() {
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = 4096 / this.anInt3395;
		this.anIntArray439 = new int[this.anInt3395 + 1];
		@Pc(29) int local29 = this.anInt3393 * local15 >> 12;
		this.anIntArray441 = new int[this.anInt3395 + 1];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3395; local42++) {
			this.anIntArray441[local42] = local10;
			this.anIntArray439[local42] = local10 + local29;
			local10 += local15;
		}
		this.anIntArray441[this.anInt3395] = 4096;
		this.anIntArray439[this.anInt3395] = this.anIntArray439[0] + 4096;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(20) int local20 = Static128.anIntArray362[arg0];
			@Pc(32) int local32;
			if (this.anInt3396 == 0) {
				@Pc(128) short local128 = 0;
				for (local32 = 0; local32 < this.anInt3395; local32++) {
					if (this.anIntArray441[local32] <= local20 && this.anIntArray441[local32 + 1] > local20) {
						if (this.anIntArray439[local32] > local20) {
							local128 = 4096;
						}
						break;
					}
				}
				Static221.method34(local12, 0, Static105.anInt2391, local128);
			} else {
				for (@Pc(28) int local28 = 0; local28 < Static105.anInt2391; local28++) {
					local32 = 0;
					@Pc(34) short local34 = 0;
					@Pc(38) int local38 = Static63.anIntArray182[local28];
					@Pc(41) int local41 = this.anInt3396;
					if (local41 == 1) {
						local32 = local38;
					} else if (local41 == 2) {
						local32 = (local38 + local20 - 4096 >> 1) + 2048;
					} else if (local41 == 3) {
						local32 = (local38 - local20 >> 1) + 2048;
					}
					for (local41 = 0; local41 < this.anInt3395; local41++) {
						if (this.anIntArray441[local41] <= local32 && this.anIntArray441[local41 + 1] > local32) {
							if (local32 < this.anIntArray439[local41]) {
								local34 = 4096;
							}
							break;
						}
					}
					local12[local28] = local34;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3395 = arg0.method895();
		} else if (arg1 == 1) {
			this.anInt3393 = arg0.method946();
		} else if (arg1 == 2) {
			this.anInt3396 = arg0.method895();
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	@Override
	public void method3503() {
		this.method2588();
	}
}
