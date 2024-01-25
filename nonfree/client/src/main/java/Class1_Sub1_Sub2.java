import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
	private int anInt629 = 585;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(19) int local19 = Static445.anIntArray590[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static279.anInt4906; local21++) {
				@Pc(27) int local27 = Static557.anIntArray708[local21];
				@Pc(64) int local64;
				if (local27 > this.anInt629 && 4096 - this.anInt629 > local27 && local19 > 2048 - this.anInt629 && local19 < this.anInt629 + 2048) {
					local64 = 2048 - local27;
					local64 = local64 < 0 ? -local64 : local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt629;
					local11[local21] = 4096 - local64;
				} else if (local27 > 2048 - this.anInt629 && local27 < this.anInt629 + 2048) {
					local64 = local19 - 2048;
					local64 = local64 < 0 ? -local64 : local64;
					local64 -= this.anInt629;
					local64 <<= 0xC;
					local11[local21] = local64 / (2048 - this.anInt629);
				} else if (this.anInt629 > local19 || 4096 - this.anInt629 < local19) {
					local64 = local27 - 2048;
					@Pc(173) int local173 = local64 >= 0 ? local64 : -local64;
					@Pc(178) int local178 = local173 - this.anInt629;
					@Pc(182) int local182 = local178 << 12;
					local11[local21] = local182 / (2048 - this.anInt629);
				} else if (local27 >= this.anInt629 && 4096 - this.anInt629 >= local27) {
					local11[local21] = 0;
				} else {
					local64 = 2048 - local19;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt629;
					local11[local21] = 4096 - local64;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt629 = arg0.method5771();
		}
	}
}
