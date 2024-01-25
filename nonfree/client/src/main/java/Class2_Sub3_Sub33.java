import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class2_Sub3_Sub33 extends Class2_Sub3 {

	@OriginalMember(owner = "client!un", name = "I", descriptor = "I")
	private int anInt6454 = 585;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(24) int local24 = Static76.anIntArray121[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static263.anInt5504; local26++) {
				@Pc(32) int local32 = Static269.anIntArray507[local26];
				@Pc(63) int local63;
				if (this.anInt6454 < local32 && 4096 - this.anInt6454 > local32 && 2048 - this.anInt6454 < local24 && local24 < this.anInt6454 + 2048) {
					local63 = 2048 - local32;
					local63 = local63 >= 0 ? local63 : -local63;
					local63 <<= 0xC;
					local63 /= 2048 - this.anInt6454;
					local16[local26] = 4096 - local63;
				} else if (local32 > 2048 - this.anInt6454 && this.anInt6454 + 2048 > local32) {
					local63 = local24 - 2048;
					local63 = local63 < 0 ? -local63 : local63;
					local63 -= this.anInt6454;
					local63 <<= 0xC;
					local16[local26] = local63 / (2048 - this.anInt6454);
				} else if (this.anInt6454 > local24 || 4096 - this.anInt6454 < local24) {
					local63 = local32 - 2048;
					@Pc(171) int local171 = local63 >= 0 ? local63 : -local63;
					@Pc(176) int local176 = local171 - this.anInt6454;
					@Pc(180) int local180 = local176 << 12;
					local16[local26] = local180 / (2048 - this.anInt6454);
				} else if (local32 >= this.anInt6454 && 4096 - this.anInt6454 >= local32) {
					local16[local26] = 0;
				} else {
					local63 = 2048 - local24;
					local63 = local63 >= 0 ? local63 : -local63;
					local63 <<= 0xC;
					local63 /= 2048 - this.anInt6454;
					local16[local26] = 4096 - local63;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6454 = arg1.method3104();
		}
	}
}
