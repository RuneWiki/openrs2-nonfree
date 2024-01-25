import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class5_Sub2_Sub11 extends Class5_Sub2 {

	@OriginalMember(owner = "client!fj", name = "D", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!fj", name = "M", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
	private int anInt2787 = 0;

	@OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
	private int anInt2788 = 10;

	@OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
	private int anInt2785 = 2048;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2788 = arg0.method8645();
		} else if (arg1 == 1) {
			this.anInt2785 = arg0.method8631();
		} else if (arg1 == 2) {
			this.anInt2787 = arg0.method8645();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	@Override
	public void method8819() {
		this.method2406();
	}

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V")
	private void method2406() {
		this.anIntArray230 = new int[this.anInt2788 + 1];
		this.anIntArray231 = new int[this.anInt2788 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt2788;
		@Pc(33) int local33 = local26 * this.anInt2785 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt2788; local35++) {
			this.anIntArray230[local35] = local21;
			this.anIntArray231[local35] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray230[this.anInt2788] = 4096;
		this.anIntArray231[this.anInt2788] = this.anIntArray231[0] + 4096;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(25) int local25 = Static61.anIntArray80[arg0];
			@Pc(32) int local32;
			if (this.anInt2787 == 0) {
				@Pc(30) short local30 = 0;
				for (local32 = 0; local32 < this.anInt2788; local32++) {
					if (local25 >= this.anIntArray230[local32] && this.anIntArray230[local32 + 1] > local25) {
						if (this.anIntArray231[local32] > local25) {
							local30 = 4096;
						}
						break;
					}
				}
				Static655.method4110(local17, 0, Static314.anInt6320, local30);
			} else {
				for (@Pc(80) int local80 = 0; local80 < Static314.anInt6320; local80++) {
					local32 = 0;
					@Pc(86) short local86 = 0;
					@Pc(90) int local90 = Static68.anIntArray94[local80];
					@Pc(93) int local93 = this.anInt2787;
					if (local93 == 1) {
						local32 = local90;
					} else if (local93 == 2) {
						local32 = (local90 + local25 - 4096 >> 1) + 2048;
					} else if (local93 == 3) {
						local32 = (local90 - local25 >> 1) + 2048;
					}
					for (local93 = 0; local93 < this.anInt2788; local93++) {
						if (local32 >= this.anIntArray230[local93] && this.anIntArray230[local93 + 1] > local32) {
							if (local32 < this.anIntArray231[local93]) {
								local86 = 4096;
							}
							break;
						}
					}
					local17[local80] = local86;
				}
			}
		}
		return local17;
	}
}
