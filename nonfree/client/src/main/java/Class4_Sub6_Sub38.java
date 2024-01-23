import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class4_Sub6_Sub38 extends Class4_Sub6 {

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
	private int anInt5470 = 585;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(25) int local25 = Static273.anIntArray127[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static2.anInt19; local27++) {
				@Pc(38) int local38 = Static192.anIntArray318[local27];
				@Pc(69) int local69;
				if (local38 > this.anInt5470 && local38 < 4096 - this.anInt5470 && 2048 - this.anInt5470 < local25 && local25 < this.anInt5470 + 2048) {
					local69 = 2048 - local38;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt5470;
					local17[local27] = 4096 - local69;
				} else if (2048 - this.anInt5470 < local38 && local38 < this.anInt5470 + 2048) {
					local69 = local25 - 2048;
					local69 = local69 < 0 ? -local69 : local69;
					local69 -= this.anInt5470;
					local69 <<= 0xC;
					local17[local27] = local69 / (2048 - this.anInt5470);
				} else if (this.anInt5470 > local25 || 4096 - this.anInt5470 < local25) {
					local69 = local38 - 2048;
					@Pc(175) int local175 = local69 < 0 ? -local69 : local69;
					@Pc(180) int local180 = local175 - this.anInt5470;
					@Pc(184) int local184 = local180 << 12;
					local17[local27] = local184 / (2048 - this.anInt5470);
				} else if (this.anInt5470 <= local38 && 4096 - this.anInt5470 >= local38) {
					local17[local27] = 0;
				} else {
					local69 = 2048 - local25;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt5470;
					local17[local27] = 4096 - local69;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5470 = arg0.method1837();
		}
	}
}
