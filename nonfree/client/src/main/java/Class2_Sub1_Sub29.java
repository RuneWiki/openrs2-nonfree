import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class2_Sub1_Sub29 extends Class2_Sub1 {

	@OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
	private int anInt3760 = 585;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3760 = arg0.method269();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(24) int local24 = Static81.anIntArray174[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static135.anInt2897; local26++) {
				@Pc(32) int local32 = Static107.anIntArray304[local26];
				@Pc(64) int local64;
				if (local32 > this.anInt3760 && 4096 - this.anInt3760 > local32 && 2048 - this.anInt3760 < local24 && local24 < this.anInt3760 + 2048) {
					local64 = 2048 - local32;
					local64 = local64 < 0 ? -local64 : local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt3760;
					local16[local26] = 4096 - local64;
				} else if (local32 > 2048 - this.anInt3760 && local32 < this.anInt3760 + 2048) {
					local64 = local24 - 2048;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 -= this.anInt3760;
					local64 <<= 0xC;
					local16[local26] = local64 / (2048 - this.anInt3760);
				} else if (this.anInt3760 > local24 || local24 > 4096 - this.anInt3760) {
					local64 = local32 - 2048;
					@Pc(164) int local164 = local64 >= 0 ? local64 : -local64;
					@Pc(169) int local169 = local164 - this.anInt3760;
					@Pc(173) int local173 = local169 << 12;
					local16[local26] = local173 / (2048 - this.anInt3760);
				} else if (local32 >= this.anInt3760 && local32 <= 4096 - this.anInt3760) {
					local16[local26] = 0;
				} else {
					local64 = 2048 - local24;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt3760;
					local16[local26] = 4096 - local64;
				}
			}
		}
		return local16;
	}
}
