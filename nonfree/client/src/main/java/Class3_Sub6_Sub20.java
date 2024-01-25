import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class3_Sub6_Sub20 extends Class3_Sub6 {

	@OriginalMember(owner = "client!le", name = "L", descriptor = "I")
	private int anInt5082 = 585;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(25) int local25 = Static525.anIntArray553[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static521.anInt8383; local27++) {
				@Pc(33) int local33 = Static73.anIntArray76[local27];
				@Pc(66) int local66;
				if (local33 > this.anInt5082 && local33 < 4096 - this.anInt5082 && 2048 - this.anInt5082 < local25 && this.anInt5082 + 2048 > local25) {
					local66 = 2048 - local33;
					local66 = local66 < 0 ? -local66 : local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt5082;
					local17[local27] = 4096 - local66;
				} else if (2048 - this.anInt5082 < local33 && local33 < this.anInt5082 + 2048) {
					local66 = local25 - 2048;
					local66 = local66 < 0 ? -local66 : local66;
					local66 -= this.anInt5082;
					local66 <<= 0xC;
					local17[local27] = local66 / (2048 - this.anInt5082);
				} else if (local25 < this.anInt5082 || local25 > 4096 - this.anInt5082) {
					local66 = local33 - 2048;
					@Pc(174) int local174 = local66 >= 0 ? local66 : -local66;
					@Pc(179) int local179 = local174 - this.anInt5082;
					@Pc(183) int local183 = local179 << 12;
					local17[local27] = local183 / (2048 - this.anInt5082);
				} else if (local33 >= this.anInt5082 && local33 <= 4096 - this.anInt5082) {
					local17[local27] = 0;
				} else {
					local66 = 2048 - local25;
					local66 = local66 < 0 ? -local66 : local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt5082;
					local17[local27] = 4096 - local66;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5082 = arg0.method5198();
		}
	}
}
