import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
	private int anInt3488 = 0;

	@OriginalMember(owner = "client!gh", name = "Q", descriptor = "I")
	private int anInt3491 = 12288;

	@OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
	private int anInt3493 = 8192;

	@OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
	private int anInt3492 = 2048;

	@OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
	private int anInt3489 = 0;

	@OriginalMember(owner = "client!gh", name = "U", descriptor = "I")
	private int anInt3495 = 2048;

	@OriginalMember(owner = "client!gh", name = "T", descriptor = "I")
	private int anInt3494 = 4096;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(21) int local21 = Static324.anIntArray440[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static131.anInt2935; local23++) {
				@Pc(31) int local31 = Static361.anIntArray460[local23] - 2048;
				@Pc(36) int local36 = local31 + this.anInt3495;
				@Pc(47) int local47 = local36 < -2048 ? local36 + 4096 : local36;
				@Pc(58) int local58 = local47 > 2048 ? local47 - 4096 : local47;
				@Pc(63) int local63 = this.anInt3488 + local21;
				@Pc(72) int local72 = local63 < -2048 ? local63 + 4096 : local63;
				@Pc(83) int local83 = local72 > 2048 ? local72 - 4096 : local72;
				@Pc(88) int local88 = this.anInt3489 + local31;
				@Pc(99) int local99 = local88 < -2048 ? local88 + 4096 : local88;
				@Pc(108) int local108 = local99 > 2048 ? local99 - 4096 : local99;
				@Pc(114) int local114 = local21 + this.anInt3492;
				@Pc(123) int local123 = local114 < -2048 ? local114 + 4096 : local114;
				@Pc(134) int local134 = local123 <= 2048 ? local123 : local123 - 4096;
				local11[local23] = this.method3078(local83, local58) || this.method3077(local108, local134) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(III)Z")
	private boolean method3077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt3491 * (arg0 + arg1) >> 12;
		@Pc(28) int local28 = Static251.anIntArray323[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt3491;
		@Pc(42) int local42 = (local35 << 12) / this.anInt3493;
		@Pc(49) int local49 = this.anInt3494 * local42 >> 12;
		return local49 > arg1 - arg0 && arg1 - arg0 > -local49;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(IIB)Z")
	private boolean method3078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt3491 * (arg0 - arg1) >> 12;
		@Pc(31) int local31 = Static251.anIntArray323[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt3491;
		@Pc(45) int local45 = (local38 << 12) / this.anInt3493;
		@Pc(52) int local52 = local45 * this.anInt3494 >> 12;
		return local52 > arg0 + arg1 && -local52 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3495 = arg1.method6535();
		} else if (arg0 == 1) {
			this.anInt3488 = arg1.method6535();
		} else if (arg0 == 2) {
			this.anInt3489 = arg1.method6535();
		} else if (arg0 == 3) {
			this.anInt3492 = arg1.method6535();
		} else if (arg0 == 4) {
			this.anInt3491 = arg1.method6535();
		} else if (arg0 == 5) {
			this.anInt3494 = arg1.method6535();
		} else if (arg0 == 6) {
			this.anInt3493 = arg1.method6535();
		}
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
	@Override
	public void method8365() {
		Static535.method7879();
	}
}
