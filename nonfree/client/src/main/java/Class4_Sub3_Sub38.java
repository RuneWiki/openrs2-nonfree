import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class4_Sub3_Sub38 extends Class4_Sub3 {

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
	private int anInt4065;

	@OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
	private int anInt4070;

	@OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
	private int anInt4069;

	@OriginalMember(owner = "client!wa", name = "hb", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(30) int local30 = Static92.anInt2362 * this.anInt4070 >> 12;
			@Pc(40) int[] local40 = this.method3149(arg0 - 1 & Static5.anInt216, 0);
			@Pc(46) int[] local46 = this.method3149(arg0, 0);
			@Pc(56) int[] local56 = this.method3149(arg0 + 1 & Static5.anInt216, 0);
			for (@Pc(58) int local58 = 0; local58 < Static134.anInt3188; local58++) {
				@Pc(79) int local79 = local30 * (local46[Static2.anInt80 & local58 + 1] - local46[local58 - 1 & Static2.anInt80]);
				@Pc(90) int local90 = (local56[local58] - local40[local58]) * local30;
				@Pc(94) int local94 = local79 >> 12;
				@Pc(98) int local98 = local90 >> 12;
				@Pc(104) int local104 = local98 * local98 >> 12;
				@Pc(110) int local110 = local94 * local94 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((local104 + local110 + 4096) / 4096)) * 4096.0D);
				@Pc(132) int local132;
				@Pc(140) int local140;
				@Pc(136) int local136;
				if (local123 == 0) {
					local140 = 0;
					local132 = 0;
					local136 = 0;
				} else {
					local132 = local79 / local123;
					local136 = 16777216 / local123;
					local140 = local90 / local123;
				}
				local136 = this.anIntArray435[2] * local136 >> 12;
				local132 = local132 * this.anIntArray435[0] >> 12;
				local140 = this.anIntArray435[1] * local140 >> 12;
				local19[local58] = local132 + local140 + local136;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(B)V")
	private void method3117() {
		@Pc(6) double local6 = Math.cos((double) (this.anInt4069 / 4096));
		this.anIntArray435[0] = (int) (local6 * 4096.0D * Math.sin((double) (this.anInt4065 / 4096)));
		this.anIntArray435[1] = (int) (Math.cos((double) (this.anInt4065 / 4096)) * local6 * 4096.0D);
		this.anIntArray435[2] = (int) (Math.sin((double) (this.anInt4069 / 4096)) * 4096.0D);
		@Pc(65) int local65 = this.anIntArray435[0] * this.anIntArray435[0] >> 12;
		@Pc(77) int local77 = this.anIntArray435[2] * this.anIntArray435[2] >> 12;
		@Pc(89) int local89 = this.anIntArray435[1] * this.anIntArray435[1] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local77 + local65 + local89 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray435[1] = (this.anIntArray435[1] << 12) / local107;
			this.anIntArray435[0] = (this.anIntArray435[0] << 12) / local107;
			this.anIntArray435[2] = (this.anIntArray435[2] << 12) / local107;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4070 = arg1.method1252();
		} else if (arg0 == 1) {
			this.anInt4065 = arg1.method1252();
		} else if (arg0 == 2) {
			this.anInt4069 = arg1.method1252();
		}
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V")
	@Override
	public void method3148() {
		this.method3117();
	}
}
