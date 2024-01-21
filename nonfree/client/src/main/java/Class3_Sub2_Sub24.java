import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class3_Sub2_Sub24 extends Class3_Sub2 {

	@OriginalMember(owner = "client!nd", name = "ab", descriptor = "I")
	private int anInt2514;

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "[I")
	private int[] anIntArray282;

	@OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
	private int anInt2510;

	@OriginalMember(owner = "client!nd", name = "pb", descriptor = "I")
	private int anInt2520;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2510 = arg0.method1359();
		} else if (arg1 == 1) {
			this.anInt2520 = arg0.method1359();
		} else if (arg1 == 2) {
			this.anInt2514 = arg0.method1359();
		}
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
	private void method1955() {
		@Pc(6) double local6 = Math.cos((double) (this.anInt2514 / 4096));
		this.anIntArray282[0] = (int) (local6 * Math.sin((double) (this.anInt2520 / 4096)) * 4096.0D);
		this.anIntArray282[1] = (int) (local6 * Math.cos((double) (this.anInt2520 / 4096)) * 4096.0D);
		this.anIntArray282[2] = (int) (Math.sin((double) (this.anInt2514 / 4096)) * 4096.0D);
		@Pc(65) int local65 = this.anIntArray282[0] * this.anIntArray282[0] >> 12;
		@Pc(77) int local77 = this.anIntArray282[1] * this.anIntArray282[1] >> 12;
		@Pc(89) int local89 = this.anIntArray282[2] * this.anIntArray282[2] >> 12;
		@Pc(103) int local103 = (int) (Math.sqrt((double) (local89 + local65 + local77 >> 12)) * 4096.0D);
		if (local103 != 0) {
			this.anIntArray282[0] = (this.anIntArray282[0] << 12) / local103;
			this.anIntArray282[2] = (this.anIntArray282[2] << 12) / local103;
			this.anIntArray282[1] = (this.anIntArray282[1] << 12) / local103;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(30) int[] local30 = this.method2787(arg0 - 1 & Static124.anInt2869, 0);
			@Pc(36) int[] local36 = this.method2787(arg0, 0);
			@Pc(46) int[] local46 = this.method2787(arg0 + 1 & Static124.anInt2869, 0);
			for (@Pc(48) int local48 = 0; local48 < Static86.anInt1942; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt2510;
				@Pc(82) int local82 = (local36[Static165.anInt321 & local48 + 1] - local36[local48 - 1 & Static165.anInt321]) * this.anInt2510;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((local96 + local102 + 4096) / 4096)) * 4096.0D);
				@Pc(123) int local123;
				@Pc(127) int local127;
				@Pc(125) int local125;
				if (local116 == 0) {
					local123 = 0;
					local125 = 0;
					local127 = 0;
				} else {
					local123 = local82 / local116;
					local125 = 16777216 / local116;
					local127 = local62 / local116;
				}
				local123 = local123 * this.anIntArray282[0] >> 12;
				local127 = this.anIntArray282[1] * local127 >> 12;
				local125 = this.anIntArray282[2] * local125 >> 12;
				local16[local48] = local125 + local123 + local127;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
	@Override
	public void method2786() {
		this.method1955();
	}
}
