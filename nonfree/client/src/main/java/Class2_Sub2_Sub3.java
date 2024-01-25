import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!be", name = "I", descriptor = "I")
	private int anInt455 = 585;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(19) int local19 = Static168.anIntArray524[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static398.anInt6955; local21++) {
				@Pc(27) int local27 = Static427.anIntArray587[local21];
				@Pc(64) int local64;
				if (local27 > this.anInt455 && local27 < 4096 - this.anInt455 && 2048 - this.anInt455 < local19 && local19 < this.anInt455 + 2048) {
					local64 = 2048 - local27;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt455;
					local11[local21] = 4096 - local64;
				} else if (2048 - this.anInt455 < local27 && this.anInt455 + 2048 > local27) {
					local64 = local19 - 2048;
					local64 = local64 < 0 ? -local64 : local64;
					local64 -= this.anInt455;
					local64 <<= 0xC;
					local11[local21] = local64 / (2048 - this.anInt455);
				} else if (local19 < this.anInt455 || 4096 - this.anInt455 < local19) {
					local64 = local27 - 2048;
					@Pc(168) int local168 = local64 < 0 ? -local64 : local64;
					@Pc(173) int local173 = local168 - this.anInt455;
					@Pc(177) int local177 = local173 << 12;
					local11[local21] = local177 / (2048 - this.anInt455);
				} else if (this.anInt455 <= local27 && 4096 - this.anInt455 >= local27) {
					local11[local21] = 0;
				} else {
					local64 = 2048 - local19;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt455;
					local11[local21] = 4096 - local64;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt455 = arg0.method6148();
		}
	}
}
