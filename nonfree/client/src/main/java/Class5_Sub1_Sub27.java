import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class5_Sub1_Sub27 extends Class5_Sub1 {

	@OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
	private int anInt2949 = 0;

	@OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
	private int anInt2950 = 1;

	@OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
	private int anInt2948 = 0;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
	@Override
	public void method3200() {
		Static64.method1048();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2948 = arg0.method3062();
		} else if (arg1 == 1) {
			this.anInt2949 = arg0.method3062();
		} else if (arg1 == 3) {
			this.anInt2950 = arg0.method3062();
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(23) int local23 = Static147.anIntArray321[arg0];
			@Pc(29) int local29 = local23 - 2048 >> 1;
			for (@Pc(31) int local31 = 0; local31 < Static174.anInt3489; local31++) {
				@Pc(37) int local37 = Static117.anIntArray274[local31];
				@Pc(43) int local43 = local37 - 2048 >> 1;
				@Pc(67) int local67;
				if (this.anInt2948 == 0) {
					local67 = (local37 - local23) * this.anInt2950;
				} else {
					@Pc(57) int local57 = local43 * local43 + local29 * local29 >> 12;
					local67 = (int) (Math.sqrt((double) ((float) local57 / 4096.0F)) * 4096.0D);
					local67 = (int) ((double) (this.anInt2950 * local67) * 3.141592653589793D);
				}
				local67 -= local67 & 0xFFFFF000;
				if (this.anInt2949 == 0) {
					local67 = Static94.anIntArray191[local67 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2949 == 2) {
					local67 -= 2048;
					if (local67 < 0) {
						local67 = -local67;
					}
					local67 = 2048 - local67 << 1;
				}
				local11[local31] = local67;
			}
		}
		return local11;
	}
}
