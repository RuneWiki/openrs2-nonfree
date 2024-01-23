import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class1_Sub3_Sub30 extends Class1_Sub3 {

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
	private int anInt4478 = 585;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(19) int local19 = Static132.anIntArray265[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static227.anInt4511; local21++) {
				@Pc(28) int local28 = Static209.anIntArray377[local21];
				@Pc(62) int local62;
				if (local28 > this.anInt4478 && 4096 - this.anInt4478 > local28 && 2048 - this.anInt4478 < local19 && local19 < this.anInt4478 + 2048) {
					local62 = 2048 - local28;
					local62 = local62 >= 0 ? local62 : -local62;
					local62 <<= 0xC;
					local62 /= 2048 - this.anInt4478;
					local7[local21] = 4096 - local62;
				} else if (2048 - this.anInt4478 < local28 && this.anInt4478 + 2048 > local28) {
					local62 = local19 - 2048;
					local62 = local62 >= 0 ? local62 : -local62;
					local62 -= this.anInt4478;
					local62 <<= 0xC;
					local7[local21] = local62 / (2048 - this.anInt4478);
				} else if (this.anInt4478 > local19 || local19 > 4096 - this.anInt4478) {
					local62 = local28 - 2048;
					@Pc(172) int local172 = local62 >= 0 ? local62 : -local62;
					@Pc(177) int local177 = local172 - this.anInt4478;
					@Pc(181) int local181 = local177 << 12;
					local7[local21] = local181 / (2048 - this.anInt4478);
				} else if (local28 >= this.anInt4478 && 4096 - this.anInt4478 >= local28) {
					local7[local21] = 0;
				} else {
					local62 = 2048 - local19;
					local62 = local62 < 0 ? -local62 : local62;
					local62 <<= 0xC;
					local62 /= 2048 - this.anInt4478;
					local7[local21] = 4096 - local62;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4478 = arg0.method2691();
		}
	}
}
