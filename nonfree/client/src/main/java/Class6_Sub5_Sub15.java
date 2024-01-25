import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class6_Sub5_Sub15 extends Class6_Sub5 {

	@OriginalMember(owner = "client!gu", name = "L", descriptor = "I")
	private int anInt2929 = 585;

	static {
		new Class267("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(24) int local24 = Static247.anIntArray318[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static240.anInt4386; local26++) {
				@Pc(32) int local32 = Static80.anIntArray117[local26];
				@Pc(69) int local69;
				if (this.anInt2929 < local32 && local32 < 4096 - this.anInt2929 && 2048 - this.anInt2929 < local24 && local24 < this.anInt2929 + 2048) {
					local69 = 2048 - local32;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt2929;
					local16[local26] = 4096 - local69;
				} else if (local32 > 2048 - this.anInt2929 && this.anInt2929 + 2048 > local32) {
					local69 = local24 - 2048;
					local69 = local69 < 0 ? -local69 : local69;
					local69 -= this.anInt2929;
					local69 <<= 0xC;
					local16[local26] = local69 / (2048 - this.anInt2929);
				} else if (local24 < this.anInt2929 || 4096 - this.anInt2929 < local24) {
					local69 = local32 - 2048;
					@Pc(165) int local165 = local69 >= 0 ? local69 : -local69;
					@Pc(170) int local170 = local165 - this.anInt2929;
					@Pc(174) int local174 = local170 << 12;
					local16[local26] = local174 / (2048 - this.anInt2929);
				} else if (local32 >= this.anInt2929 && local32 <= 4096 - this.anInt2929) {
					local16[local26] = 0;
				} else {
					local69 = 2048 - local24;
					local69 = local69 < 0 ? -local69 : local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt2929;
					local16[local26] = 4096 - local69;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt2929 = arg1.method6485();
		}
	}
}
