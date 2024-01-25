import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class4_Sub2_Sub4 extends Class4_Sub2 {

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
	private int anInt1335 = 585;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt1335 = arg1.method4877();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(27) int local27 = Static293.anIntArray461[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static350.anInt6330; local29++) {
				@Pc(35) int local35 = Static197.anIntArray566[local29];
				@Pc(67) int local67;
				if (local35 > this.anInt1335 && local35 < 4096 - this.anInt1335 && local27 > 2048 - this.anInt1335 && local27 < this.anInt1335 + 2048) {
					local67 = 2048 - local35;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt1335;
					local19[local29] = 4096 - local67;
				} else if (2048 - this.anInt1335 < local35 && this.anInt1335 + 2048 > local35) {
					local67 = local27 - 2048;
					local67 = local67 < 0 ? -local67 : local67;
					local67 -= this.anInt1335;
					local67 <<= 0xC;
					local19[local29] = local67 / (2048 - this.anInt1335);
				} else if (this.anInt1335 > local27 || 4096 - this.anInt1335 < local27) {
					local67 = local35 - 2048;
					@Pc(170) int local170 = local67 < 0 ? -local67 : local67;
					@Pc(175) int local175 = local170 - this.anInt1335;
					@Pc(179) int local179 = local175 << 12;
					local19[local29] = local179 / (2048 - this.anInt1335);
				} else if (this.anInt1335 <= local35 && local35 <= 4096 - this.anInt1335) {
					local19[local29] = 0;
				} else {
					local67 = 2048 - local27;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt1335;
					local19[local29] = 4096 - local67;
				}
			}
		}
		return local19;
	}
}
