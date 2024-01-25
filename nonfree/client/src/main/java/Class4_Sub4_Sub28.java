import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class4_Sub4_Sub28 extends Class4_Sub4 {

	@OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
	private int anInt6088 = 585;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(21) int local21 = Static334.anIntArray437[arg0];
			for (@Pc(23) int local23 = 0; local23 < Static419.anInt6404; local23++) {
				@Pc(29) int local29 = Static226.anIntArray284[local23];
				@Pc(65) int local65;
				if (local29 > this.anInt6088 && 4096 - this.anInt6088 > local29 && 2048 - this.anInt6088 < local21 && local21 < this.anInt6088 + 2048) {
					local65 = 2048 - local29;
					local65 = local65 >= 0 ? local65 : -local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt6088;
					local13[local23] = 4096 - local65;
				} else if (2048 - this.anInt6088 < local29 && this.anInt6088 + 2048 > local29) {
					local65 = local21 - 2048;
					local65 = local65 < 0 ? -local65 : local65;
					local65 -= this.anInt6088;
					local65 <<= 0xC;
					local13[local23] = local65 / (2048 - this.anInt6088);
				} else if (local21 < this.anInt6088 || local21 > 4096 - this.anInt6088) {
					local65 = local29 - 2048;
					@Pc(174) int local174 = local65 >= 0 ? local65 : -local65;
					@Pc(179) int local179 = local174 - this.anInt6088;
					@Pc(183) int local183 = local179 << 12;
					local13[local23] = local183 / (2048 - this.anInt6088);
				} else if (this.anInt6088 <= local29 && 4096 - this.anInt6088 >= local29) {
					local13[local23] = 0;
				} else {
					local65 = 2048 - local21;
					local65 = local65 < 0 ? -local65 : local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt6088;
					local13[local23] = 4096 - local65;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt6088 = arg1.method5028();
		}
	}
}
