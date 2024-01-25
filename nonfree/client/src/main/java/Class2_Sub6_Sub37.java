import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class2_Sub6_Sub37 extends Class2_Sub6 {

	@OriginalMember(owner = "client!un", name = "R", descriptor = "I")
	private int anInt6260 = 12288;

	@OriginalMember(owner = "client!un", name = "L", descriptor = "I")
	private int anInt6254 = 2048;

	@OriginalMember(owner = "client!un", name = "X", descriptor = "I")
	private int anInt6265 = 0;

	@OriginalMember(owner = "client!un", name = "W", descriptor = "I")
	private int anInt6264 = 2048;

	@OriginalMember(owner = "client!un", name = "T", descriptor = "I")
	private int anInt6262 = 8192;

	@OriginalMember(owner = "client!un", name = "db", descriptor = "I")
	private int anInt6271 = 4096;

	@OriginalMember(owner = "client!un", name = "eb", descriptor = "I")
	private int anInt6272 = 0;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(I)V")
	@Override
	public void method5639() {
		Static155.method2588();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(21) int local21 = Static138.anIntArray291[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static151.anInt2711; local23++) {
				@Pc(31) int local31 = Static160.anIntArray329[local23] - 2048;
				@Pc(36) int local36 = local31 + this.anInt6254;
				@Pc(47) int local47 = local36 < -2048 ? local36 + 4096 : local36;
				@Pc(58) int local58 = local47 <= 2048 ? local47 : local47 - 4096;
				@Pc(64) int local64 = local21 + this.anInt6265;
				@Pc(75) int local75 = local64 < -2048 ? local64 + 4096 : local64;
				@Pc(86) int local86 = local75 > 2048 ? local75 - 4096 : local75;
				@Pc(92) int local92 = local31 + this.anInt6272;
				@Pc(101) int local101 = local92 >= -2048 ? local92 : local92 + 4096;
				@Pc(110) int local110 = local101 <= 2048 ? local101 : local101 - 4096;
				@Pc(116) int local116 = local21 + this.anInt6264;
				@Pc(127) int local127 = local116 < -2048 ? local116 + 4096 : local116;
				@Pc(138) int local138 = local127 <= 2048 ? local127 : local127 - 4096;
				local11[local23] = this.method5410(local58, local86) || this.method5409(local138, local110) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(III)Z")
	private boolean method5409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt6260 >> 12;
		@Pc(22) int local22 = Static60.anIntArray160[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt6260;
		@Pc(36) int local36 = (local29 << 12) / this.anInt6262;
		@Pc(43) int local43 = local36 * this.anInt6271 >> 12;
		return local43 > arg0 - arg1 && arg0 - arg1 > -local43;
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(III)Z")
	private boolean method5410(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt6260 * (arg1 - arg0) >> 12;
		@Pc(28) int local28 = Static60.anIntArray160[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt6260;
		@Pc(42) int local42 = (local35 << 12) / this.anInt6262;
		@Pc(49) int local49 = local42 * this.anInt6271 >> 12;
		return arg1 + arg0 < local49 && arg0 + arg1 > -local49;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6254 = arg0.method4245();
		} else if (arg1 == 1) {
			this.anInt6265 = arg0.method4245();
		} else if (arg1 == 2) {
			this.anInt6272 = arg0.method4245();
		} else if (arg1 == 3) {
			this.anInt6264 = arg0.method4245();
		} else if (arg1 == 4) {
			this.anInt6260 = arg0.method4245();
		} else if (arg1 == 5) {
			this.anInt6271 = arg0.method4245();
		} else if (arg1 == 6) {
			this.anInt6262 = arg0.method4245();
		}
	}
}
