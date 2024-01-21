import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class1_Sub5_Sub28 extends Class1_Sub5 {

	@OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
	private int anInt2949;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(25) int local25 = Static34.anIntArray75[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static177.anInt4018; local27++) {
				@Pc(33) int local33 = Static116.anIntArray275[local27];
				@Pc(65) int local65;
				if (this.anInt2949 < local33 && local33 < 4096 - this.anInt2949 && 2048 - this.anInt2949 < local25 && this.anInt2949 + 2048 > local25) {
					local65 = 2048 - local33;
					local65 = local65 < 0 ? -local65 : local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt2949;
					local11[local27] = 4096 - local65;
				} else if (local33 > 2048 - this.anInt2949 && this.anInt2949 + 2048 > local33) {
					local65 = local25 - 2048;
					local65 = local65 < 0 ? -local65 : local65;
					local65 -= this.anInt2949;
					local65 <<= 0xC;
					local11[local27] = local65 / (2048 - this.anInt2949);
				} else if (this.anInt2949 > local25 || 4096 - this.anInt2949 < local25) {
					local65 = local33 - 2048;
					@Pc(183) int local183 = local65 < 0 ? -local65 : local65;
					@Pc(188) int local188 = local183 - this.anInt2949;
					@Pc(192) int local192 = local188 << 12;
					local11[local27] = local192 / (2048 - this.anInt2949);
				} else if (local33 >= this.anInt2949 && local33 <= 4096 - this.anInt2949) {
					local11[local27] = 0;
				} else {
					local65 = 2048 - local25;
					local65 = local65 >= 0 ? local65 : -local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt2949;
					local11[local27] = 4096 - local65;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2949 = arg0.method359();
		}
	}
}
