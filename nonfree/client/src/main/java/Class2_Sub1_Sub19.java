import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class2_Sub1_Sub19 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ib", name = "Y", descriptor = "[I")
	private int[] anIntArray105;

	@OriginalMember(owner = "client!ib", name = "db", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
	private int anInt1654;

	@OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
	private int anInt1652;

	@OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
	private int anInt1662;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1654 = arg0.method1402();
		} else if (arg1 == 1) {
			this.anInt1662 = arg0.method1397();
		} else if (arg1 == 2) {
			this.anInt1652 = arg0.method1402();
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	@Override
	public void method2789() {
		this.method1060();
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
	private void method1060() {
		this.anIntArray105 = new int[this.anInt1654 + 1];
		@Pc(10) int local10 = 0;
		this.anIntArray106 = new int[this.anInt1654 + 1];
		@Pc(22) int local22 = 4096 / this.anInt1654;
		@Pc(39) int local39 = local22 * this.anInt1662 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt1654; local41++) {
			this.anIntArray106[local41] = local10;
			this.anIntArray105[local41] = local10 + local39;
			local10 += local22;
		}
		this.anIntArray106[this.anInt1654] = 4096;
		this.anIntArray105[this.anInt1654] = this.anIntArray105[0] + 4096;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(19) int local19 = Static11.anIntArray8[arg0];
			@Pc(28) int local28;
			if (this.anInt1652 == 0) {
				@Pc(134) short local134 = 0;
				for (local28 = 0; local28 < this.anInt1654; local28++) {
					if (this.anIntArray106[local28] <= local19 && local19 < this.anIntArray106[local28 + 1]) {
						if (this.anIntArray105[local28] > local19) {
							local134 = 4096;
						}
						break;
					}
				}
				Static184.method166(local11, 0, Static120.anInt2812, local134);
			} else {
				for (@Pc(24) int local24 = 0; local24 < Static120.anInt2812; local24++) {
					local28 = 0;
					@Pc(30) short local30 = 0;
					@Pc(34) int local34 = Static69.anIntArray117[local24];
					@Pc(37) int local37 = this.anInt1652;
					if (local37 == 1) {
						local28 = local34;
					} else if (local37 == 2) {
						local28 = (local34 + local19 - 4096 >> 1) + 2048;
					} else if (local37 == 3) {
						local28 = (local34 - local19 >> 1) + 2048;
					}
					for (local37 = 0; local37 < this.anInt1654; local37++) {
						if (this.anIntArray106[local37] <= local28 && local28 < this.anIntArray106[local37 + 1]) {
							if (this.anIntArray105[local37] > local28) {
								local30 = 4096;
							}
							break;
						}
					}
					local11[local24] = local30;
				}
			}
		}
		return local11;
	}
}
