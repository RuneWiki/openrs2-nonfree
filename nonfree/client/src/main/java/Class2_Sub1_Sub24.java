import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class2_Sub1_Sub24 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
	private int anInt4566 = 585;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt4566 = arg1.method5753();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(24) int local24 = Static229.anIntArray382[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static391.anInt7118; local26++) {
				@Pc(32) int local32 = Static167.anIntArray267[local26];
				@Pc(64) int local64;
				if (this.anInt4566 < local32 && 4096 - this.anInt4566 > local32 && local24 > 2048 - this.anInt4566 && local24 < this.anInt4566 + 2048) {
					local64 = 2048 - local32;
					local64 = local64 < 0 ? -local64 : local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt4566;
					local16[local26] = 4096 - local64;
				} else if (local32 > 2048 - this.anInt4566 && local32 < this.anInt4566 + 2048) {
					local64 = local24 - 2048;
					local64 = local64 < 0 ? -local64 : local64;
					local64 -= this.anInt4566;
					local64 <<= 0xC;
					local16[local26] = local64 / (2048 - this.anInt4566);
				} else if (local24 < this.anInt4566 || 4096 - this.anInt4566 < local24) {
					local64 = local32 - 2048;
					@Pc(173) int local173 = local64 >= 0 ? local64 : -local64;
					@Pc(178) int local178 = local173 - this.anInt4566;
					@Pc(182) int local182 = local178 << 12;
					local16[local26] = local182 / (2048 - this.anInt4566);
				} else if (local32 >= this.anInt4566 && local32 <= 4096 - this.anInt4566) {
					local16[local26] = 0;
				} else {
					local64 = 2048 - local24;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt4566;
					local16[local26] = 4096 - local64;
				}
			}
		}
		return local16;
	}
}
