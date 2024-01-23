import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class4_Sub1_Sub11 extends Class4_Sub1 {

	@OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
	private int anInt1842 = 585;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt1842 = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(24) int local24 = Static10.anIntArray7[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static68.anInt1753; local26++) {
				@Pc(33) int local33 = Static94.anIntArray163[local26];
				@Pc(67) int local67;
				if (this.anInt1842 < local33 && local33 < 4096 - this.anInt1842 && 2048 - this.anInt1842 < local24 && local24 < this.anInt1842 + 2048) {
					local67 = 2048 - local33;
					local67 = local67 < 0 ? -local67 : local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt1842;
					local16[local26] = 4096 - local67;
				} else if (2048 - this.anInt1842 < local33 && local33 < this.anInt1842 + 2048) {
					local67 = local24 - 2048;
					local67 = local67 < 0 ? -local67 : local67;
					local67 -= this.anInt1842;
					local67 <<= 0xC;
					local16[local26] = local67 / (2048 - this.anInt1842);
				} else if (this.anInt1842 > local24 || local24 > 4096 - this.anInt1842) {
					local67 = local33 - 2048;
					@Pc(176) int local176 = local67 < 0 ? -local67 : local67;
					@Pc(181) int local181 = local176 - this.anInt1842;
					@Pc(185) int local185 = local181 << 12;
					local16[local26] = local185 / (2048 - this.anInt1842);
				} else if (local33 >= this.anInt1842 && local33 <= 4096 - this.anInt1842) {
					local16[local26] = 0;
				} else {
					local67 = 2048 - local24;
					local67 = local67 < 0 ? -local67 : local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt1842;
					local16[local26] = 4096 - local67;
				}
			}
		}
		return local16;
	}
}
