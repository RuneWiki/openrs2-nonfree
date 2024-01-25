import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class3_Sub6_Sub8 extends Class3_Sub6 {

	@OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
	private int anInt2068 = 0;

	@OriginalMember(owner = "client!dq", name = "E", descriptor = "I")
	private int anInt2070 = 1365;

	@OriginalMember(owner = "client!dq", name = "G", descriptor = "I")
	private int anInt2072 = 0;

	@OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
	private int anInt2076 = 20;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2070 = arg0.method5198();
		} else if (arg1 == 1) {
			this.anInt2076 = arg0.method5198();
		} else if (arg1 == 2) {
			this.anInt2068 = arg0.method5198();
		} else if (arg1 == 3) {
			this.anInt2072 = arg0.method5198();
		}
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			for (@Pc(22) int local22 = 0; local22 < Static521.anInt8383; local22++) {
				@Pc(36) int local36 = this.anInt2068 + (Static73.anIntArray76[local22] << 12) / this.anInt2070;
				@Pc(48) int local48 = (Static525.anIntArray553[arg0] << 12) / this.anInt2070 + this.anInt2072;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local62 + local68 < 16384 && this.anInt2076 > local70) {
					local56 = local48 + (local56 * local54 >> 12) * 2;
					local54 = local62 + local36 - local68;
					local62 = local54 * local54 >> 12;
					local70++;
					local68 = local56 * local56 >> 12;
				}
				local16[local22] = local70 < this.anInt2076 - 1 ? (local70 << 12) / this.anInt2076 : 0;
			}
		}
		return local16;
	}
}
