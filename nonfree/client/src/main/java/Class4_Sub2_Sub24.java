import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class4_Sub2_Sub24 extends Class4_Sub2 {

	@OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
	private int anInt8333 = 585;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8333 = arg0.method7054();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(24) int local24 = Static217.anIntArray501[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static417.anInt5248; local26++) {
				@Pc(32) int local32 = Static579.anIntArray585[local26];
				@Pc(67) int local67;
				if (this.anInt8333 < local32 && local32 < 4096 - this.anInt8333 && 2048 - this.anInt8333 < local24 && local24 < this.anInt8333 + 2048) {
					local67 = 2048 - local32;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt8333;
					local11[local26] = 4096 - local67;
				} else if (2048 - this.anInt8333 < local32 && this.anInt8333 + 2048 > local32) {
					local67 = local24 - 2048;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 -= this.anInt8333;
					local67 <<= 0xC;
					local11[local26] = local67 / (2048 - this.anInt8333);
				} else if (this.anInt8333 > local24 || local24 > 4096 - this.anInt8333) {
					local67 = local32 - 2048;
					@Pc(174) int local174 = local67 >= 0 ? local67 : -local67;
					@Pc(179) int local179 = local174 - this.anInt8333;
					@Pc(183) int local183 = local179 << 12;
					local11[local26] = local183 / (2048 - this.anInt8333);
				} else if (this.anInt8333 <= local32 && local32 <= 4096 - this.anInt8333) {
					local11[local26] = 0;
				} else {
					local67 = 2048 - local24;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt8333;
					local11[local26] = 4096 - local67;
				}
			}
		}
		return local11;
	}
}
