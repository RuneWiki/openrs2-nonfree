import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class5_Sub1_Sub22 extends Class5_Sub1 {

	@OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
	private int anInt6100 = 585;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt6100 = arg1.method4227();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(27) int local27 = Static295.anIntArray403[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static147.anInt3075; local29++) {
				@Pc(35) int local35 = Static315.anIntArray425[local29];
				@Pc(75) int local75;
				if (local35 > this.anInt6100 && 4096 - this.anInt6100 > local35 && 2048 - this.anInt6100 < local27 && this.anInt6100 + 2048 > local27) {
					local75 = 2048 - local35;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt6100;
					local11[local29] = 4096 - local75;
				} else if (local35 > 2048 - this.anInt6100 && this.anInt6100 + 2048 > local35) {
					local75 = local27 - 2048;
					local75 = local75 < 0 ? -local75 : local75;
					local75 -= this.anInt6100;
					local75 <<= 0xC;
					local11[local29] = local75 / (2048 - this.anInt6100);
				} else if (this.anInt6100 > local27 || local27 > 4096 - this.anInt6100) {
					local75 = local35 - 2048;
					@Pc(183) int local183 = local75 >= 0 ? local75 : -local75;
					@Pc(188) int local188 = local183 - this.anInt6100;
					@Pc(192) int local192 = local188 << 12;
					local11[local29] = local192 / (2048 - this.anInt6100);
				} else if (this.anInt6100 <= local35 && 4096 - this.anInt6100 >= local35) {
					local11[local29] = 0;
				} else {
					local75 = 2048 - local27;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt6100;
					local11[local29] = 4096 - local75;
				}
			}
		}
		return local11;
	}
}
