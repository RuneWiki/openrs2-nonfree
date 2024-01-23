import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
	private int anInt1751 = 585;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1751 = arg0.method3805();
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(24) int local24 = Static211.anIntArray334[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static157.anInt3431; local26++) {
				@Pc(32) int local32 = Static73.anIntArray105[local26];
				@Pc(64) int local64;
				if (local32 > this.anInt1751 && 4096 - this.anInt1751 > local32 && 2048 - this.anInt1751 < local24 && this.anInt1751 + 2048 > local24) {
					local64 = 2048 - local32;
					local64 = local64 < 0 ? -local64 : local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt1751;
					local16[local26] = 4096 - local64;
				} else if (2048 - this.anInt1751 < local32 && local32 < this.anInt1751 + 2048) {
					local64 = local24 - 2048;
					local64 = local64 < 0 ? -local64 : local64;
					local64 -= this.anInt1751;
					local64 <<= 0xC;
					local16[local26] = local64 / (2048 - this.anInt1751);
				} else if (local24 < this.anInt1751 || local24 > 4096 - this.anInt1751) {
					local64 = local32 - 2048;
					@Pc(163) int local163 = local64 >= 0 ? local64 : -local64;
					@Pc(168) int local168 = local163 - this.anInt1751;
					@Pc(172) int local172 = local168 << 12;
					local16[local26] = local172 / (2048 - this.anInt1751);
				} else if (local32 >= this.anInt1751 && local32 <= 4096 - this.anInt1751) {
					local16[local26] = 0;
				} else {
					local64 = 2048 - local24;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt1751;
					local16[local26] = 4096 - local64;
				}
			}
		}
		return local16;
	}
}
