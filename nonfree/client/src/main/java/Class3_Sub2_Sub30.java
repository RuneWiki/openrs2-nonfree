import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class3_Sub2_Sub30 extends Class3_Sub2 {

	@OriginalMember(owner = "client!te", name = "S", descriptor = "I")
	private int anInt3445;

	@OriginalMember(owner = "client!te", name = "T", descriptor = "I")
	private int anInt3446;

	@OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
	private int anInt3453;

	@OriginalMember(owner = "client!te", name = "X", descriptor = "I")
	private int anInt3450;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3453 = arg0.method1359();
		} else if (arg1 == 1) {
			this.anInt3450 = arg0.method1359();
		} else if (arg1 == 2) {
			this.anInt3445 = arg0.method1359();
		} else if (arg1 == 3) {
			this.anInt3446 = arg0.method1359();
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			for (@Pc(22) int local22 = 0; local22 < Static86.anInt1942; local22++) {
				@Pc(36) int local36 = (Static123.anIntArray308[arg0] << 12) / this.anInt3453 + this.anInt3446;
				@Pc(49) int local49 = (Static165.anIntArray17[local22] << 12) / this.anInt3453 + this.anInt3445;
				@Pc(55) int local55 = local49;
				@Pc(61) int local61 = local49 * local49 >> 12;
				@Pc(63) int local63 = local36;
				@Pc(69) int local69 = local36 * local36 >> 12;
				@Pc(71) int local71 = 0;
				while (local69 + local61 < 16384 && local71 < this.anInt3450) {
					local71++;
					local63 = local36 + (local63 * local55 >> 12) * 2;
					local55 = local49 + local61 - local69;
					local69 = local63 * local63 >> 12;
					local61 = local55 * local55 >> 12;
				}
				local16[local22] = this.anInt3450 - 1 > local71 ? (local71 << 12) / this.anInt3450 : 0;
			}
		}
		return local16;
	}
}
