import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class2_Sub1_Sub20 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
	private int anInt3249 = 585;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(27) int local27 = Static272.anIntArray521[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static281.anInt5558; local29++) {
				@Pc(36) int local36 = Static234.anIntArray462[local29];
				@Pc(77) int local77;
				if (this.anInt3249 < local36 && local36 < 4096 - this.anInt3249 && 2048 - this.anInt3249 < local27 && this.anInt3249 + 2048 > local27) {
					local77 = 2048 - local36;
					local77 = local77 >= 0 ? local77 : -local77;
					local77 <<= 0xC;
					local77 /= 2048 - this.anInt3249;
					local13[local29] = 4096 - local77;
				} else if (2048 - this.anInt3249 < local36 && this.anInt3249 + 2048 > local36) {
					local77 = local27 - 2048;
					local77 = local77 < 0 ? -local77 : local77;
					local77 -= this.anInt3249;
					local77 <<= 0xC;
					local13[local29] = local77 / (2048 - this.anInt3249);
				} else if (local27 < this.anInt3249 || local27 > 4096 - this.anInt3249) {
					local77 = local36 - 2048;
					@Pc(186) int local186 = local77 >= 0 ? local77 : -local77;
					@Pc(191) int local191 = local186 - this.anInt3249;
					@Pc(195) int local195 = local191 << 12;
					local13[local29] = local195 / (2048 - this.anInt3249);
				} else if (this.anInt3249 <= local36 && 4096 - this.anInt3249 >= local36) {
					local13[local29] = 0;
				} else {
					local77 = 2048 - local27;
					local77 = local77 < 0 ? -local77 : local77;
					local77 <<= 0xC;
					local77 /= 2048 - this.anInt3249;
					local13[local29] = 4096 - local77;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3249 = arg0.method2130();
		}
	}
}
