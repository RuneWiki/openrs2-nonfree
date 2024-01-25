import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class2_Sub4_Sub20 extends Class2_Sub4 {

	@OriginalMember(owner = "client!mw", name = "G", descriptor = "I")
	private int anInt5947 = 585;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(29) int local29 = Static13.anIntArray418[arg0];
			for (@Pc(31) int local31 = 0; local31 < Static143.anInt7434; local31++) {
				@Pc(37) int local37 = Static519.anIntArray155[local31];
				@Pc(77) int local77;
				if (this.anInt5947 < local37 && 4096 - this.anInt5947 > local37 && 2048 - this.anInt5947 < local29 && this.anInt5947 + 2048 > local29) {
					local77 = 2048 - local37;
					local77 = local77 < 0 ? -local77 : local77;
					local77 <<= 0xC;
					local77 /= 2048 - this.anInt5947;
					local21[local31] = 4096 - local77;
				} else if (local37 > 2048 - this.anInt5947 && this.anInt5947 + 2048 > local37) {
					local77 = local29 - 2048;
					local77 = local77 >= 0 ? local77 : -local77;
					local77 -= this.anInt5947;
					local77 <<= 0xC;
					local21[local31] = local77 / (2048 - this.anInt5947);
				} else if (this.anInt5947 > local29 || 4096 - this.anInt5947 < local29) {
					local77 = local37 - 2048;
					@Pc(179) int local179 = local77 < 0 ? -local77 : local77;
					@Pc(184) int local184 = local179 - this.anInt5947;
					@Pc(188) int local188 = local184 << 12;
					local21[local31] = local188 / (2048 - this.anInt5947);
				} else if (this.anInt5947 <= local37 && local37 <= 4096 - this.anInt5947) {
					local21[local31] = 0;
				} else {
					local77 = 2048 - local29;
					local77 = local77 >= 0 ? local77 : -local77;
					local77 <<= 0xC;
					local77 /= 2048 - this.anInt5947;
					local21[local31] = 4096 - local77;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5947 = arg1.method4518();
		}
	}
}
