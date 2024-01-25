import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class2_Sub2_Sub34 extends Class2_Sub2 {

	@OriginalMember(owner = "client!t", name = "W", descriptor = "[I")
	private int[] anIntArray540;

	@OriginalMember(owner = "client!t", name = "X", descriptor = "[I")
	private int[] anIntArray541;

	@OriginalMember(owner = "client!t", name = "I", descriptor = "I")
	private int anInt6675 = 10;

	@OriginalMember(owner = "client!t", name = "O", descriptor = "I")
	private int anInt6679 = 2048;

	@OriginalMember(owner = "client!t", name = "P", descriptor = "I")
	private int anInt6680 = 0;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	private void method5351() {
		this.anIntArray540 = new int[this.anInt6675 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray541 = new int[this.anInt6675 + 1];
		@Pc(34) int local34 = 4096 / this.anInt6675;
		@Pc(41) int local41 = local34 * this.anInt6679 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt6675; local43++) {
			this.anIntArray541[local43] = local14;
			this.anIntArray540[local43] = local41 + local14;
			local14 += local34;
		}
		this.anIntArray541[this.anInt6675] = 4096;
		this.anIntArray540[this.anInt6675] = this.anIntArray540[0] + 4096;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	@Override
	public void method6262() {
		this.method5351();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6675 = arg0.method6138();
		} else if (arg1 == 1) {
			this.anInt6679 = arg0.method6148();
		} else if (arg1 == 2) {
			this.anInt6680 = arg0.method6138();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(25) int local25 = Static168.anIntArray524[arg0];
			@Pc(32) int local32;
			if (this.anInt6680 == 0) {
				@Pc(30) short local30 = 0;
				for (local32 = 0; local32 < this.anInt6675; local32++) {
					if (local25 >= this.anIntArray541[local32] && this.anIntArray541[local32 + 1] > local25) {
						if (this.anIntArray540[local32] > local25) {
							local30 = 4096;
						}
						break;
					}
				}
				Static472.method5023(local17, 0, Static398.anInt6955, local30);
			} else {
				for (@Pc(84) int local84 = 0; local84 < Static398.anInt6955; local84++) {
					local32 = 0;
					@Pc(90) short local90 = 0;
					@Pc(94) int local94 = Static427.anIntArray587[local84];
					@Pc(97) int local97 = this.anInt6680;
					if (local97 == 1) {
						local32 = local94;
					} else if (local97 == 2) {
						local32 = (local94 + local25 - 4096 >> 1) + 2048;
					} else if (local97 == 3) {
						local32 = (local94 - local25 >> 1) + 2048;
					}
					for (local97 = 0; local97 < this.anInt6675; local97++) {
						if (local32 >= this.anIntArray541[local97] && this.anIntArray541[local97 + 1] > local32) {
							if (this.anIntArray540[local97] > local32) {
								local90 = 4096;
							}
							break;
						}
					}
					local17[local84] = local90;
				}
			}
		}
		return local17;
	}
}
