import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
	private int anInt536;

	@OriginalMember(owner = "client!bi", name = "db", descriptor = "I")
	private int anInt540;

	@OriginalMember(owner = "client!bi", name = "Z", descriptor = "I")
	private int anInt538;

	@OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
	private int anInt534;

	@OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "client!bi", name = "kb", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!bi", name = "mb", descriptor = "I")
	private int anInt548;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(27) int local27 = Static160.anIntArray399[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static22.anInt596; local29++) {
				@Pc(37) int local37 = Static167.anIntArray417[local29] - 2048;
				@Pc(42) int local42 = this.anInt536 + local37;
				@Pc(53) int local53 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(62) int local62 = local53 <= 2048 ? local53 : local53 - 4096;
				@Pc(67) int local67 = local27 + this.anInt534;
				@Pc(72) int local72 = local27 + this.anInt538;
				@Pc(83) int local83 = local72 < -2048 ? local72 + 4096 : local72;
				@Pc(92) int local92 = local83 <= 2048 ? local83 : local83 - 4096;
				@Pc(101) int local101 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(110) int local110 = local101 <= 2048 ? local101 : local101 - 4096;
				@Pc(116) int local116 = local37 + this.anInt548;
				@Pc(127) int local127 = local116 >= -2048 ? local116 : local116 + 4096;
				@Pc(136) int local136 = local127 > 2048 ? local127 - 4096 : local127;
				local7[local29] = this.method438(local62, local110) || this.method437(local92, local136) ? 4096 : 0;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt536 = arg1.method1280();
		} else if (arg0 == 1) {
			this.anInt534 = arg1.method1280();
		} else if (arg0 == 2) {
			this.anInt548 = arg1.method1280();
		} else if (arg0 == 3) {
			this.anInt538 = arg1.method1280();
		} else if (arg0 == 4) {
			this.anInt540 = arg1.method1280();
		} else if (arg0 == 5) {
			this.anInt533 = arg1.method1280();
		} else if (arg0 == 6) {
			this.anInt546 = arg1.method1280();
		}
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
	@Override
	public void method3389() {
		Static127.method2534();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)Z")
	private boolean method437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt540 * (arg0 + arg1) >> 12;
		@Pc(23) int local23 = Static185.anIntArray441[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt540;
		@Pc(37) int local37 = (local30 << 12) / this.anInt546;
		@Pc(44) int local44 = local37 * this.anInt533 >> 12;
		return local44 > arg0 - arg1 && -local44 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Z")
	private boolean method438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt540 * (arg1 - arg0) >> 12;
		@Pc(18) int local18 = Static185.anIntArray441[local8 * 255 >> 12 & 0xFF];
		@Pc(25) int local25 = (local18 << 12) / this.anInt540;
		@Pc(41) int local41 = (local25 << 12) / this.anInt546;
		@Pc(48) int local48 = local41 * this.anInt533 >> 12;
		return local48 > arg1 + arg0 && arg1 + arg0 > -local48;
	}
}
