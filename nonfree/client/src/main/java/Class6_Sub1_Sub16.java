import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class6_Sub1_Sub16 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
	private int anInt2366 = 585;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2366 = arg0.method4021();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(24) int local24 = Static273.anIntArray703[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static299.anInt5659; local26++) {
				@Pc(32) int local32 = Static18.anIntArray32[local26];
				@Pc(72) int local72;
				if (this.anInt2366 < local32 && 4096 - this.anInt2366 > local32 && 2048 - this.anInt2366 < local24 && local24 < this.anInt2366 + 2048) {
					local72 = 2048 - local32;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt2366;
					local16[local26] = 4096 - local72;
				} else if (2048 - this.anInt2366 < local32 && this.anInt2366 + 2048 > local32) {
					local72 = local24 - 2048;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 -= this.anInt2366;
					local72 <<= 0xC;
					local16[local26] = local72 / (2048 - this.anInt2366);
				} else if (local24 < this.anInt2366 || 4096 - this.anInt2366 < local24) {
					local72 = local32 - 2048;
					@Pc(176) int local176 = local72 < 0 ? -local72 : local72;
					@Pc(181) int local181 = local176 - this.anInt2366;
					@Pc(185) int local185 = local181 << 12;
					local16[local26] = local185 / (2048 - this.anInt2366);
				} else if (this.anInt2366 <= local32 && local32 <= 4096 - this.anInt2366) {
					local16[local26] = 0;
				} else {
					local72 = 2048 - local24;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt2366;
					local16[local26] = 4096 - local72;
				}
			}
		}
		return local16;
	}
}
