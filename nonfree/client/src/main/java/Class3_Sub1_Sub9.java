import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!gda", name = "L", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!gda", name = "M", descriptor = "[I")
	private int[] anIntArray281;

	@OriginalMember(owner = "client!gda", name = "N", descriptor = "I")
	private int anInt3282 = 10;

	@OriginalMember(owner = "client!gda", name = "Q", descriptor = "I")
	private int anInt3285 = 2048;

	@OriginalMember(owner = "client!gda", name = "R", descriptor = "I")
	private int anInt3286 = 0;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
	@Override
	public void method7763() {
		this.method2913();
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3282 = arg0.method3118();
		} else if (arg1 == 1) {
			this.anInt3285 = arg0.method3109();
		} else if (arg1 == 2) {
			this.anInt3286 = arg0.method3118();
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(25) int local25 = Static9.anIntArray15[arg0];
			@Pc(32) int local32;
			if (this.anInt3286 == 0) {
				@Pc(30) short local30 = 0;
				for (local32 = 0; local32 < this.anInt3282; local32++) {
					if (this.anIntArray281[local32] <= local25 && local25 < this.anIntArray281[local32 + 1]) {
						if (local25 < this.anIntArray280[local32]) {
							local30 = 4096;
						}
						break;
					}
				}
				Static604.method5915(local17, 0, Static206.anInt4182, local30);
			} else {
				for (@Pc(88) int local88 = 0; local88 < Static206.anInt4182; local88++) {
					local32 = 0;
					@Pc(94) short local94 = 0;
					@Pc(98) int local98 = Static329.anIntArray456[local88];
					@Pc(101) int local101 = this.anInt3286;
					if (local101 == 1) {
						local32 = local98;
					} else if (local101 == 2) {
						local32 = (local25 + local98 - 4096 >> 1) + 2048;
					} else if (local101 == 3) {
						local32 = (local98 - local25 >> 1) + 2048;
					}
					for (local101 = 0; local101 < this.anInt3282; local101++) {
						if (local32 >= this.anIntArray281[local101] && local32 < this.anIntArray281[local101 + 1]) {
							if (this.anIntArray280[local101] > local32) {
								local94 = 4096;
							}
							break;
						}
					}
					local17[local88] = local94;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(B)V")
	private void method2913() {
		this.anIntArray280 = new int[this.anInt3282 + 1];
		this.anIntArray281 = new int[this.anInt3282 + 1];
		@Pc(21) int local21 = 0;
		@Pc(31) int local31 = 4096 / this.anInt3282;
		@Pc(38) int local38 = this.anInt3285 * local31 >> 12;
		for (@Pc(40) int local40 = 0; local40 < this.anInt3282; local40++) {
			this.anIntArray281[local40] = local21;
			this.anIntArray280[local40] = local21 + local38;
			local21 += local31;
		}
		this.anIntArray281[this.anInt3282] = 4096;
		this.anIntArray280[this.anInt3282] = this.anIntArray280[0] + 4096;
	}
}
