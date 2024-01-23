import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class2_Sub2_Sub34 extends Class2_Sub2 {

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "[I")
	private int[] anIntArray699;

	@OriginalMember(owner = "client!se", name = "eb", descriptor = "[I")
	private int[] anIntArray700;

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
	private int anInt4327 = 10;

	@OriginalMember(owner = "client!se", name = "kb", descriptor = "I")
	private int anInt4332 = 2048;

	@OriginalMember(owner = "client!se", name = "lb", descriptor = "I")
	private int anInt4333 = 0;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
	private void method3422() {
		this.anIntArray699 = new int[this.anInt4327 + 1];
		this.anIntArray700 = new int[this.anInt4327 + 1];
		@Pc(17) int local17 = 0;
		@Pc(26) int local26 = 4096 / this.anInt4327;
		@Pc(33) int local33 = this.anInt4332 * local26 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt4327; local43++) {
			this.anIntArray699[local43] = local17;
			this.anIntArray700[local43] = local33 + local17;
			local17 += local26;
		}
		this.anIntArray699[this.anInt4327] = 4096;
		this.anIntArray700[this.anInt4327] = this.anIntArray700[0] + 4096;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4327 = arg0.method2122();
		} else if (arg1 == 1) {
			this.anInt4332 = arg0.method2095();
		} else if (arg1 == 2) {
			this.anInt4333 = arg0.method2122();
		}
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
	@Override
	public void method3958() {
		this.method3422();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(22) int[] local22 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(30) int local30 = Static157.anIntArray604[arg0];
			@Pc(40) int local40;
			if (this.anInt4333 == 0) {
				@Pc(38) short local38 = 0;
				for (local40 = 0; local40 < this.anInt4327; local40++) {
					if (local30 >= this.anIntArray699[local40] && local30 < this.anIntArray699[local40 + 1]) {
						if (this.anIntArray700[local40] > local30) {
							local38 = 4096;
						}
						break;
					}
				}
				Static231.method2215(local22, 0, Static54.anInt953, local38);
			} else {
				for (@Pc(88) int local88 = 0; local88 < Static54.anInt953; local88++) {
					local40 = 0;
					@Pc(96) int local96 = Static179.anIntArray682[local88];
					@Pc(98) short local98 = 0;
					@Pc(101) int local101 = this.anInt4333;
					if (local101 == 1) {
						local40 = local96;
					} else if (local101 == 2) {
						local40 = (local96 + local30 - 4096 >> 1) + 2048;
					} else if (local101 == 3) {
						local40 = (local96 - local30 >> 1) + 2048;
					}
					for (local101 = 0; local101 < this.anInt4327; local101++) {
						if (this.anIntArray699[local101] <= local40 && this.anIntArray699[local101 + 1] > local40) {
							if (this.anIntArray700[local101] > local40) {
								local98 = 4096;
							}
							break;
						}
					}
					local22[local88] = local98;
				}
			}
		}
		return local22;
	}
}
