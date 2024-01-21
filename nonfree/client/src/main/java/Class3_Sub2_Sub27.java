import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class3_Sub2_Sub27 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
	private int anInt2890;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2890 = arg0.method1359();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(19) int local19 = Static123.anIntArray308[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static86.anInt1942; local21++) {
				@Pc(27) int local27 = Static165.anIntArray17[local21];
				@Pc(60) int local60;
				if (local27 > this.anInt2890 && 4096 - this.anInt2890 > local27 && 2048 - this.anInt2890 < local19 && local19 < this.anInt2890 + 2048) {
					local60 = 2048 - local27;
					local60 = local60 < 0 ? -local60 : local60;
					local60 <<= 0xC;
					local60 /= 2048 - this.anInt2890;
					local11[local21] = 4096 - local60;
				} else if (local27 > 2048 - this.anInt2890 && this.anInt2890 + 2048 > local27) {
					local60 = local19 - 2048;
					local60 = local60 < 0 ? -local60 : local60;
					local60 -= this.anInt2890;
					local60 <<= 0xC;
					local11[local21] = local60 / (2048 - this.anInt2890);
				} else if (local19 < this.anInt2890 || 4096 - this.anInt2890 < local19) {
					local60 = local27 - 2048;
					@Pc(166) int local166 = local60 < 0 ? -local60 : local60;
					@Pc(171) int local171 = local166 - this.anInt2890;
					@Pc(175) int local175 = local171 << 12;
					local11[local21] = local175 / (2048 - this.anInt2890);
				} else if (local27 >= this.anInt2890 && local27 <= 4096 - this.anInt2890) {
					local11[local21] = 0;
				} else {
					local60 = 2048 - local19;
					local60 = local60 < 0 ? -local60 : local60;
					local60 <<= 0xC;
					local60 /= 2048 - this.anInt2890;
					local11[local21] = 4096 - local60;
				}
			}
		}
		return local11;
	}
}
