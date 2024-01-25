import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class4_Sub3_Sub6 extends Class4_Sub3 {

	@OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
	private int anInt1770 = 585;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(24) int local24 = Static376.anIntArray531[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static304.anInt5637; local26++) {
				@Pc(32) int local32 = Static231.anIntArray368[local26];
				@Pc(68) int local68;
				if (this.anInt1770 < local32 && 4096 - this.anInt1770 > local32 && local24 > 2048 - this.anInt1770 && this.anInt1770 + 2048 > local24) {
					local68 = 2048 - local32;
					local68 = local68 >= 0 ? local68 : -local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt1770;
					local16[local26] = 4096 - local68;
				} else if (local32 > 2048 - this.anInt1770 && this.anInt1770 + 2048 > local32) {
					local68 = local24 - 2048;
					local68 = local68 < 0 ? -local68 : local68;
					local68 -= this.anInt1770;
					local68 <<= 0xC;
					local16[local26] = local68 / (2048 - this.anInt1770);
				} else if (this.anInt1770 > local24 || 4096 - this.anInt1770 < local24) {
					local68 = local32 - 2048;
					@Pc(172) int local172 = local68 < 0 ? -local68 : local68;
					@Pc(177) int local177 = local172 - this.anInt1770;
					@Pc(181) int local181 = local177 << 12;
					local16[local26] = local181 / (2048 - this.anInt1770);
				} else if (this.anInt1770 <= local32 && local32 <= 4096 - this.anInt1770) {
					local16[local26] = 0;
				} else {
					local68 = 2048 - local24;
					local68 = local68 < 0 ? -local68 : local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt1770;
					local16[local26] = 4096 - local68;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt1770 = arg1.method4560();
		}
	}
}
