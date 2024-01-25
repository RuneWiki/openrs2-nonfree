import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jha")
public final class Class14_Sub7_Sub19 extends Class14_Sub7 {

	@OriginalMember(owner = "client!jha", name = "U", descriptor = "I")
	private int anInt5219 = 585;

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(19) int local19 = Static655.anIntArray573[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static613.anInt10114; local21++) {
				@Pc(27) int local27 = Static588.anIntArray506[local21];
				@Pc(75) int local75;
				if (local27 > this.anInt5219 && local27 < 4096 - this.anInt5219 && local19 > 2048 - this.anInt5219 && this.anInt5219 + 2048 > local19) {
					local75 = 2048 - local27;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt5219;
					local11[local21] = 4096 - local75;
				} else if (2048 - this.anInt5219 < local27 && this.anInt5219 + 2048 > local27) {
					local75 = local19 - 2048;
					local75 = local75 < 0 ? -local75 : local75;
					local75 -= this.anInt5219;
					local75 <<= 0xC;
					local11[local21] = local75 / (2048 - this.anInt5219);
				} else if (this.anInt5219 > local19 || local19 > 4096 - this.anInt5219) {
					local75 = local27 - 2048;
					@Pc(194) int local194 = local75 >= 0 ? local75 : -local75;
					@Pc(199) int local199 = local194 - this.anInt5219;
					@Pc(203) int local203 = local199 << 12;
					local11[local21] = local203 / (2048 - this.anInt5219);
				} else if (this.anInt5219 <= local27 && local27 <= 4096 - this.anInt5219) {
					local11[local21] = 0;
				} else {
					local75 = 2048 - local19;
					local75 = local75 < 0 ? -local75 : local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt5219;
					local11[local21] = 4096 - local75;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt5219 = arg1.method7717(-1978450544);
		}
	}
}
