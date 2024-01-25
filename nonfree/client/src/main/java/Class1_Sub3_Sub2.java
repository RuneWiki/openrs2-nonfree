import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
	private int anInt304 = 585;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt304 = arg1.method4556();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(27) int local27 = Static266.anIntArray454[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static153.anInt3378; local29++) {
				@Pc(35) int local35 = Static107.anIntArray234[local29];
				@Pc(69) int local69;
				if (this.anInt304 < local35 && 4096 - this.anInt304 > local35 && local27 > 2048 - this.anInt304 && local27 < this.anInt304 + 2048) {
					local69 = 2048 - local35;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt304;
					local11[local29] = 4096 - local69;
				} else if (2048 - this.anInt304 < local35 && local35 < this.anInt304 + 2048) {
					local69 = local27 - 2048;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 -= this.anInt304;
					local69 <<= 0xC;
					local11[local29] = local69 / (2048 - this.anInt304);
				} else if (this.anInt304 > local27 || local27 > 4096 - this.anInt304) {
					local69 = local35 - 2048;
					@Pc(170) int local170 = local69 < 0 ? -local69 : local69;
					@Pc(175) int local175 = local170 - this.anInt304;
					@Pc(179) int local179 = local175 << 12;
					local11[local29] = local179 / (2048 - this.anInt304);
				} else if (this.anInt304 <= local35 && 4096 - this.anInt304 >= local35) {
					local11[local29] = 0;
				} else {
					local69 = 2048 - local27;
					local69 = local69 < 0 ? -local69 : local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt304;
					local11[local29] = 4096 - local69;
				}
			}
		}
		return local11;
	}
}
