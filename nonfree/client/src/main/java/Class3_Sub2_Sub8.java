import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class3_Sub2_Sub8 extends Class3_Sub2 {

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
	private int anInt1435;

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
	private int anInt1438;

	@OriginalMember(owner = "client!hd", name = "hb", descriptor = "I")
	private int anInt1448;

	@OriginalMember(owner = "client!hd", name = "ib", descriptor = "I")
	private int anInt1449;

	@OriginalMember(owner = "client!hd", name = "gb", descriptor = "I")
	private int anInt1447;

	@OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
	private int anInt1439;

	@OriginalMember(owner = "client!hd", name = "kb", descriptor = "I")
	private int anInt1450;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)Z")
	private boolean method1105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = this.anInt1448 * (arg1 - arg0) >> 12;
		@Pc(31) int local31 = Static82.anIntArray188[local21 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt1448;
		@Pc(45) int local45 = (local38 << 12) / this.anInt1435;
		@Pc(52) int local52 = this.anInt1447 * local45 >> 12;
		return arg0 + arg1 < local52 && -local52 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBI)Z")
	private boolean method1106(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt1448 * (arg1 + arg0) >> 12;
		@Pc(22) int local22 = Static82.anIntArray188[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt1448;
		@Pc(36) int local36 = (local29 << 12) / this.anInt1435;
		@Pc(43) int local43 = this.anInt1447 * local36 >> 12;
		return arg1 - arg0 < local43 && arg1 - arg0 > -local43;
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
	@Override
	public void method2786() {
		Static82.method1413();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1450 = arg0.method1359();
		} else if (arg1 == 1) {
			this.anInt1449 = arg0.method1359();
		} else if (arg1 == 2) {
			this.anInt1439 = arg0.method1359();
		} else if (arg1 == 3) {
			this.anInt1438 = arg0.method1359();
		} else if (arg1 == 4) {
			this.anInt1448 = arg0.method1359();
		} else if (arg1 == 5) {
			this.anInt1447 = arg0.method1359();
		} else if (arg1 == 6) {
			this.anInt1435 = arg0.method1359();
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(21) int local21 = Static123.anIntArray308[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static86.anInt1942; local23++) {
				@Pc(30) int local30 = this.anInt1449 + local21;
				@Pc(41) int local41 = local30 >= -2048 ? local30 : local30 + 4096;
				@Pc(52) int local52 = local41 > 2048 ? local41 - 4096 : local41;
				@Pc(58) int local58 = local21 + this.anInt1438;
				@Pc(64) int local64 = Static165.anIntArray17[local23] - 2048;
				@Pc(75) int local75 = local58 >= -2048 ? local58 : local58 + 4096;
				@Pc(81) int local81 = local64 + this.anInt1439;
				@Pc(90) int local90 = local75 <= 2048 ? local75 : local75 - 4096;
				@Pc(101) int local101 = local81 >= -2048 ? local81 : local81 + 4096;
				@Pc(110) int local110 = local101 > 2048 ? local101 - 4096 : local101;
				@Pc(115) int local115 = this.anInt1450 + local64;
				@Pc(126) int local126 = local115 >= -2048 ? local115 : local115 + 4096;
				@Pc(137) int local137 = local126 > 2048 ? local126 - 4096 : local126;
				local11[local23] = this.method1105(local137, local52) || this.method1106(local110, local90) ? 4096 : 0;
			}
		}
		return local11;
	}
}
