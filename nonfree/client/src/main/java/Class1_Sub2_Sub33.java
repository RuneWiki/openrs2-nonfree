import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class1_Sub2_Sub33 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
	private int anInt4065;

	@OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
	private int anInt4072;

	@OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
	private int anInt4066;

	@OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
	private int anInt4074;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4072 = arg1.method1280();
		} else if (arg0 == 1) {
			this.anInt4065 = arg1.method1280();
		} else if (arg0 == 2) {
			this.anInt4074 = arg1.method1280();
		} else if (arg0 == 3) {
			this.anInt4066 = arg1.method1280();
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			for (@Pc(22) int local22 = 0; local22 < Static22.anInt596; local22++) {
				@Pc(36) int local36 = this.anInt4066 + (Static160.anIntArray399[arg0] << 12) / this.anInt4072;
				@Pc(48) int local48 = this.anInt4074 + (Static167.anIntArray417[local22] << 12) / this.anInt4072;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local48 * local48 >> 12;
				@Pc(68) int local68 = local36 * local36 >> 12;
				@Pc(70) int local70 = 0;
				while (local62 + local68 < 16384 && this.anInt4065 > local70) {
					local70++;
					local54 = (local54 * local56 >> 12) * 2 + local36;
					local56 = local62 + local48 - local68;
					local62 = local56 * local56 >> 12;
					local68 = local54 * local54 >> 12;
				}
				local16[local22] = local70 >= this.anInt4065 - 1 ? 0 : (local70 << 12) / this.anInt4065;
			}
		}
		return local16;
	}
}
