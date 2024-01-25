import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class4_Sub4_Sub6 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ep", name = "K", descriptor = "I")
	private int anInt1714 = 585;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt1714 = arg1.method2404();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(24) int local24 = Static64.anIntArray148[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static124.anInt3576; local26++) {
				@Pc(32) int local32 = Static149.anIntArray298[local26];
				@Pc(72) int local72;
				if (this.anInt1714 < local32 && local32 < 4096 - this.anInt1714 && 2048 - this.anInt1714 < local24 && local24 < this.anInt1714 + 2048) {
					local72 = 2048 - local32;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt1714;
					local16[local26] = 4096 - local72;
				} else if (2048 - this.anInt1714 < local32 && local32 < this.anInt1714 + 2048) {
					local72 = local24 - 2048;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 -= this.anInt1714;
					local72 <<= 0xC;
					local16[local26] = local72 / (2048 - this.anInt1714);
				} else if (local24 < this.anInt1714 || 4096 - this.anInt1714 < local24) {
					local72 = local32 - 2048;
					@Pc(176) int local176 = local72 >= 0 ? local72 : -local72;
					@Pc(181) int local181 = local176 - this.anInt1714;
					@Pc(185) int local185 = local181 << 12;
					local16[local26] = local185 / (2048 - this.anInt1714);
				} else if (local32 >= this.anInt1714 && 4096 - this.anInt1714 >= local32) {
					local16[local26] = 0;
				} else {
					local72 = 2048 - local24;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt1714;
					local16[local26] = 4096 - local72;
				}
			}
		}
		return local16;
	}
}
