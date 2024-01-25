import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class3_Sub9_Sub26 extends Class3_Sub9 {

	@OriginalMember(owner = "client!lha", name = "H", descriptor = "I")
	private int anInt5619 = 4096;

	@OriginalMember(owner = "client!lha", name = "N", descriptor = "I")
	private int anInt5624 = 8192;

	@OriginalMember(owner = "client!lha", name = "F", descriptor = "I")
	private int anInt5618 = 2048;

	@OriginalMember(owner = "client!lha", name = "I", descriptor = "I")
	private int anInt5620 = 2048;

	@OriginalMember(owner = "client!lha", name = "O", descriptor = "I")
	private int anInt5625 = 0;

	@OriginalMember(owner = "client!lha", name = "U", descriptor = "I")
	private int anInt5631 = 0;

	@OriginalMember(owner = "client!lha", name = "V", descriptor = "I")
	private int anInt5632 = 12288;

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(BII)Z")
	private boolean method5129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = (arg1 - arg0) * this.anInt5632 >> 12;
		@Pc(28) int local28 = Static144.anIntArray235[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt5632;
		@Pc(42) int local42 = (local35 << 12) / this.anInt5624;
		@Pc(49) int local49 = local42 * this.anInt5619 >> 12;
		return arg1 + arg0 < local49 && arg1 + arg0 > -local49;
	}

	@OriginalMember(owner = "client!lha", name = "d", descriptor = "(III)Z")
	private boolean method5132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt5632 * (arg1 + arg0) >> 12;
		@Pc(22) int local22 = Static144.anIntArray235[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt5632;
		@Pc(36) int local36 = (local29 << 12) / this.anInt5624;
		@Pc(43) int local43 = local36 * this.anInt5619 >> 12;
		return local43 > arg1 - arg0 && arg1 - arg0 > -local43;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5618 = arg0.method8593();
		} else if (arg1 == 1) {
			this.anInt5631 = arg0.method8593();
		} else if (arg1 == 2) {
			this.anInt5625 = arg0.method8593();
		} else if (arg1 == 3) {
			this.anInt5620 = arg0.method8593();
		} else if (arg1 == 4) {
			this.anInt5632 = arg0.method8593();
		} else if (arg1 == 5) {
			this.anInt5619 = arg0.method8593();
		} else if (arg1 == 6) {
			this.anInt5624 = arg0.method8593();
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(27) int local27 = Static147.anIntArray259[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static62.anInt1251; local29++) {
				@Pc(37) int local37 = Static239.anIntArray394[local29] - 2048;
				@Pc(43) int local43 = local37 + this.anInt5618;
				@Pc(52) int local52 = local43 < -2048 ? local43 + 4096 : local43;
				@Pc(63) int local63 = local52 <= 2048 ? local52 : local52 - 4096;
				@Pc(68) int local68 = this.anInt5631 + local27;
				@Pc(79) int local79 = local68 >= -2048 ? local68 : local68 + 4096;
				@Pc(88) int local88 = local79 <= 2048 ? local79 : local79 - 4096;
				@Pc(93) int local93 = this.anInt5625 + local37;
				@Pc(102) int local102 = local93 < -2048 ? local93 + 4096 : local93;
				@Pc(111) int local111 = local102 > 2048 ? local102 - 4096 : local102;
				@Pc(116) int local116 = this.anInt5620 + local27;
				@Pc(127) int local127 = local116 < -2048 ? local116 + 4096 : local116;
				@Pc(136) int local136 = local127 <= 2048 ? local127 : local127 - 4096;
				local11[local29] = this.method5129(local63, local88) || this.method5132(local111, local136) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Z)V")
	@Override
	public void method9163() {
		Static609.method8656();
	}
}
