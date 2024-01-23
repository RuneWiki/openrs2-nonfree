import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class4_Sub1_Sub20 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ko", name = "T", descriptor = "I")
	private int anInt2950 = 0;

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
	private int anInt2945 = 1;

	@OriginalMember(owner = "client!ko", name = "K", descriptor = "I")
	private int anInt2942 = 0;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(20) int local20 = Static10.anIntArray7[arg0];
			@Pc(26) int local26 = local20 - 2048 >> 1;
			for (@Pc(28) int local28 = 0; local28 < Static68.anInt1753; local28++) {
				@Pc(35) int local35 = Static94.anIntArray163[local28];
				@Pc(41) int local41 = local35 - 2048 >> 1;
				@Pc(67) int local67;
				if (this.anInt2950 == 0) {
					local67 = this.anInt2945 * (local35 - local20);
				} else {
					@Pc(57) int local57 = local26 * local26 + local41 * local41 >> 12;
					local67 = (int) (Math.sqrt((double) ((float) local57 / 4096.0F)) * 4096.0D);
					local67 = (int) ((double) (this.anInt2945 * local67) * 3.141592653589793D);
				}
				local67 -= local67 & 0xFFFFF000;
				if (this.anInt2942 == 0) {
					local67 = Static144.anIntArray233[local67 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2942 == 2) {
					local67 -= 2048;
					if (local67 < 0) {
						local67 = -local67;
					}
					local67 = 2048 - local67 << 1;
				}
				local11[local28] = local67;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
	@Override
	public void method4537() {
		Static37.method1936();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt2950 = arg1.method3110();
		} else if (arg0 == 1) {
			this.anInt2942 = arg1.method3110();
		} else if (arg0 == 3) {
			this.anInt2945 = arg1.method3110();
		}
	}
}
