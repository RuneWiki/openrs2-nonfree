import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub2_Sub35 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
	private int anInt4150;

	@OriginalMember(owner = "client!tb", name = "lb", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
	private int anInt4153;

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "I")
	private int anInt4156;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(B)V")
	private void method3170() {
		@Pc(10) double local10 = Math.cos((double) (this.anInt4150 / 4096));
		this.anIntArray397[0] = (int) (local10 * Math.sin((double) (this.anInt4156 / 4096)) * 4096.0D);
		this.anIntArray397[1] = (int) (Math.cos((double) (this.anInt4156 / 4096)) * 4096.0D * local10);
		this.anIntArray397[2] = (int) (Math.sin((double) (this.anInt4150 / 4096)) * 4096.0D);
		@Pc(72) int local72 = this.anIntArray397[0] * this.anIntArray397[0] >> 12;
		@Pc(84) int local84 = this.anIntArray397[1] * this.anIntArray397[1] >> 12;
		@Pc(96) int local96 = this.anIntArray397[2] * this.anIntArray397[2] >> 12;
		@Pc(109) int local109 = (int) (Math.sqrt((double) (local72 + local84 + local96 >> 12)) * 4096.0D);
		if (local109 != 0) {
			this.anIntArray397[0] = (this.anIntArray397[0] << 12) / local109;
			this.anIntArray397[1] = (this.anIntArray397[1] << 12) / local109;
			this.anIntArray397[2] = (this.anIntArray397[2] << 12) / local109;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4153 = arg1.method1280();
		} else if (arg0 == 1) {
			this.anInt4156 = arg1.method1280();
		} else if (arg0 == 2) {
			this.anInt4150 = arg1.method1280();
		}
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	@Override
	public void method3389() {
		this.method3170();
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(32) int[] local32 = this.method3401(arg0 - 1 & Static14.anInt436, 0);
			@Pc(38) int[] local38 = this.method3401(arg0, 0);
			@Pc(48) int[] local48 = this.method3401(arg0 + 1 & Static14.anInt436, 0);
			for (@Pc(50) int local50 = 0; local50 < Static22.anInt596; local50++) {
				@Pc(64) int local64 = this.anInt4153 * (local48[local50] - local32[local50]);
				@Pc(84) int local84 = this.anInt4153 * (local38[local50 + 1 & Static28.anInt833] - local38[local50 - 1 & Static28.anInt833]);
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local64 >> 12;
				@Pc(98) int local98 = local92 * local92 >> 12;
				@Pc(104) int local104 = local88 * local88 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((local104 + local98 + 4096) / 4096)) * 4096.0D);
				@Pc(123) int local123;
				@Pc(131) int local131;
				@Pc(127) int local127;
				if (local117 == 0) {
					local131 = 0;
					local127 = 0;
					local123 = 0;
				} else {
					local123 = local84 / local117;
					local127 = 16777216 / local117;
					local131 = local64 / local117;
				}
				local123 = local123 * this.anIntArray397[0] >> 12;
				local127 = this.anIntArray397[2] * local127 >> 12;
				local131 = local131 * this.anIntArray397[1] >> 12;
				local18[local50] = local131 + local123 + local127;
			}
		}
		return local18;
	}
}
