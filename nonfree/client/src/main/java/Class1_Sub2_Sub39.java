import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class1_Sub2_Sub39 extends Class1_Sub2 {

	@OriginalMember(owner = "client!va", name = "X", descriptor = "I")
	private int anInt4433;

	@OriginalMember(owner = "client!va", name = "db", descriptor = "I")
	private int anInt4438;

	@OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
	private int anInt4440;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			for (@Pc(27) int local27 = 0; local27 < Static22.anInt596; local27++) {
				@Pc(33) int local33 = Static160.anIntArray399[arg0];
				@Pc(37) int local37 = Static167.anIntArray417[local27];
				@Pc(44) int local44 = this.anInt4438 * local37 >> 12;
				@Pc(54) int local54 = this.anInt4438 * (local37 % (4096 / this.anInt4438));
				@Pc(61) int local61 = this.anInt4433 * local33 >> 12;
				@Pc(71) int local71 = local33 % (4096 / this.anInt4433) * this.anInt4433;
				if (this.anInt4440 > local71) {
					for (local44 -= local61; local44 < 0; local44 += 4) {
					}
					while (local44 > 3) {
						local44 -= 4;
					}
					if (local44 != 1) {
						local21[local27] = 0;
						continue;
					}
					if (local54 < this.anInt4440) {
						local21[local27] = 0;
						continue;
					}
				}
				if (this.anInt4440 > local54) {
					for (local44 -= local61; local44 < 0; local44 += 4) {
					}
					while (local44 > 3) {
						local44 -= 4;
					}
					if (local44 > 0) {
						local21[local27] = 0;
						continue;
					}
				}
				local21[local27] = 4096;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4438 = arg1.method1234();
		} else if (arg0 == 1) {
			this.anInt4433 = arg1.method1234();
		} else if (arg0 == 2) {
			this.anInt4440 = arg1.method1280();
		}
	}
}
