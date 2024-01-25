import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class2_Sub6_Sub12 extends Class2_Sub6 {

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
	private int anInt2440 = 585;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2440 = arg0.method4245();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(24) int local24 = Static138.anIntArray291[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static151.anInt2711; local26++) {
				@Pc(32) int local32 = Static160.anIntArray329[local26];
				@Pc(65) int local65;
				if (local32 > this.anInt2440 && local32 < 4096 - this.anInt2440 && 2048 - this.anInt2440 < local24 && this.anInt2440 + 2048 > local24) {
					local65 = 2048 - local32;
					local65 = local65 < 0 ? -local65 : local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt2440;
					local16[local26] = 4096 - local65;
				} else if (2048 - this.anInt2440 < local32 && local32 < this.anInt2440 + 2048) {
					local65 = local24 - 2048;
					local65 = local65 < 0 ? -local65 : local65;
					local65 -= this.anInt2440;
					local65 <<= 0xC;
					local16[local26] = local65 / (2048 - this.anInt2440);
				} else if (local24 < this.anInt2440 || 4096 - this.anInt2440 < local24) {
					local65 = local32 - 2048;
					@Pc(168) int local168 = local65 < 0 ? -local65 : local65;
					@Pc(173) int local173 = local168 - this.anInt2440;
					@Pc(177) int local177 = local173 << 12;
					local16[local26] = local177 / (2048 - this.anInt2440);
				} else if (this.anInt2440 <= local32 && local32 <= 4096 - this.anInt2440) {
					local16[local26] = 0;
				} else {
					local65 = 2048 - local24;
					local65 = local65 >= 0 ? local65 : -local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt2440;
					local16[local26] = 4096 - local65;
				}
			}
		}
		return local16;
	}
}
