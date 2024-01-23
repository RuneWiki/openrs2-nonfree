import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class2_Sub1_Sub33 extends Class2_Sub1 {

	@OriginalMember(owner = "client!un", name = "T", descriptor = "I")
	private int anInt5634 = 585;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5634 = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(23) int[] local23 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(31) int local31 = Static234.anIntArray435[arg0];
			for (@Pc(33) int local33 = 0; local33 < Static114.anInt1359; local33++) {
				@Pc(44) int local44 = Static281.anIntArray506[local33];
				@Pc(75) int local75;
				if (this.anInt5634 < local44 && local44 < 4096 - this.anInt5634 && local31 > 2048 - this.anInt5634 && this.anInt5634 + 2048 > local31) {
					local75 = 2048 - local44;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt5634;
					local23[local33] = 4096 - local75;
				} else if (2048 - this.anInt5634 < local44 && local44 < this.anInt5634 + 2048) {
					local75 = local31 - 2048;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 -= this.anInt5634;
					local75 <<= 0xC;
					local23[local33] = local75 / (2048 - this.anInt5634);
				} else if (local31 < this.anInt5634 || local31 > 4096 - this.anInt5634) {
					local75 = local44 - 2048;
					@Pc(188) int local188 = local75 < 0 ? -local75 : local75;
					@Pc(193) int local193 = local188 - this.anInt5634;
					@Pc(197) int local197 = local193 << 12;
					local23[local33] = local197 / (2048 - this.anInt5634);
				} else if (this.anInt5634 <= local44 && local44 <= 4096 - this.anInt5634) {
					local23[local33] = 0;
				} else {
					local75 = 2048 - local31;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt5634;
					local23[local33] = 4096 - local75;
				}
			}
		}
		return local23;
	}
}
