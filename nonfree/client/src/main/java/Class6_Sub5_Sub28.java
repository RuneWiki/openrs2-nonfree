import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class6_Sub5_Sub28 extends Class6_Sub5 {

	@OriginalMember(owner = "client!r", name = "M", descriptor = "I")
	private int anInt5762 = 1;

	@OriginalMember(owner = "client!r", name = "O", descriptor = "I")
	private int anInt5764 = 0;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "I")
	private int anInt5768 = 0;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(25) int local25 = Static247.anIntArray318[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static240.anInt4386; local33++) {
				@Pc(39) int local39 = Static80.anIntArray117[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(71) int local71;
				if (this.anInt5764 == 0) {
					local71 = this.anInt5762 * (local39 - local25);
				} else {
					@Pc(61) int local61 = local31 * local31 + local45 * local45 >> 12;
					local71 = (int) (Math.sqrt((double) ((float) local61 / 4096.0F)) * 4096.0D);
					local71 = (int) ((double) (local71 * this.anInt5762) * 3.141592653589793D);
				}
				local71 -= local71 & 0xFFFFF000;
				if (this.anInt5768 == 0) {
					local71 = Static159.anIntArray388[local71 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt5768 == 2) {
					local71 -= 2048;
					if (local71 < 0) {
						local71 = -local71;
					}
					local71 = 2048 - local71 << 1;
				}
				local17[local33] = local71;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	@Override
	public void method6533() {
		Static344.method5292();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt5764 = arg1.method6433();
		} else if (arg0 == 1) {
			this.anInt5768 = arg1.method6433();
		} else if (arg0 == 3) {
			this.anInt5762 = arg1.method6433();
		}
	}
}
