import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class1_Sub4_Sub19 extends Class1_Sub4 {

	@OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
	private int anInt3179;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3179 = arg0.method546();
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(24) int local24 = Static150.anIntArray383[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static73.anInt1888; local26++) {
				@Pc(32) int local32 = Static171.anIntArray421[local26];
				@Pc(61) int local61;
				if (local32 > this.anInt3179 && local32 < 4096 - this.anInt3179 && 2048 - this.anInt3179 < local24 && this.anInt3179 + 2048 > local24) {
					local61 = 2048 - local32;
					local61 = local61 >= 0 ? local61 : -local61;
					local61 <<= 0xC;
					local61 /= 2048 - this.anInt3179;
					local16[local26] = 4096 - local61;
				} else if (2048 - this.anInt3179 < local32 && this.anInt3179 + 2048 > local32) {
					local61 = local24 - 2048;
					local61 = local61 < 0 ? -local61 : local61;
					local61 -= this.anInt3179;
					local61 <<= 0xC;
					local16[local26] = local61 / (2048 - this.anInt3179);
				} else if (local24 < this.anInt3179 || 4096 - this.anInt3179 < local24) {
					local61 = local32 - 2048;
					@Pc(158) int local158 = local61 >= 0 ? local61 : -local61;
					@Pc(163) int local163 = local158 - this.anInt3179;
					@Pc(167) int local167 = local163 << 12;
					local16[local26] = local167 / (2048 - this.anInt3179);
				} else if (local32 >= this.anInt3179 && local32 <= 4096 - this.anInt3179) {
					local16[local26] = 0;
				} else {
					local61 = 2048 - local24;
					local61 = local61 < 0 ? -local61 : local61;
					local61 <<= 0xC;
					local61 /= 2048 - this.anInt3179;
					local16[local26] = 4096 - local61;
				}
			}
		}
		return local16;
	}
}
