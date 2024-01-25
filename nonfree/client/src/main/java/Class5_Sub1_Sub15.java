import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class5_Sub1_Sub15 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
	private int anInt3720 = 8192;

	@OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
	private int anInt3722 = 2048;

	@OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
	private int anInt3719 = 4096;

	@OriginalMember(owner = "client!hr", name = "L", descriptor = "I")
	private int anInt3728 = 2048;

	@OriginalMember(owner = "client!hr", name = "O", descriptor = "I")
	private int anInt3731 = 0;

	@OriginalMember(owner = "client!hr", name = "Q", descriptor = "I")
	private int anInt3733 = 0;

	@OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
	private int anInt3732 = 12288;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(III)Z")
	private boolean method3235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21 = (arg1 + arg0) * this.anInt3732 >> 12;
		@Pc(31) int local31 = Static20.anIntArray25[local21 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt3732;
		@Pc(45) int local45 = (local38 << 12) / this.anInt3720;
		@Pc(52) int local52 = local45 * this.anInt3719 >> 12;
		return arg0 - arg1 < local52 && -local52 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
		Static340.method5294();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3722 = arg1.method4227();
		} else if (arg0 == 1) {
			this.anInt3733 = arg1.method4227();
		} else if (arg0 == 2) {
			this.anInt3731 = arg1.method4227();
		} else if (arg0 == 3) {
			this.anInt3728 = arg1.method4227();
		} else if (arg0 == 4) {
			this.anInt3732 = arg1.method4227();
		} else if (arg0 == 5) {
			this.anInt3719 = arg1.method4227();
		} else if (arg0 == 6) {
			this.anInt3720 = arg1.method4227();
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZI)Z")
	private boolean method3236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt3732 >> 12;
		@Pc(23) int local23 = Static20.anIntArray25[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt3732;
		@Pc(37) int local37 = (local30 << 12) / this.anInt3720;
		@Pc(49) int local49 = local37 * this.anInt3719 >> 12;
		return arg0 + arg1 < local49 && arg1 + arg0 > -local49;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(29) int local29 = Static295.anIntArray403[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static147.anInt3075; local31++) {
				@Pc(39) int local39 = Static315.anIntArray425[local31] - 2048;
				@Pc(44) int local44 = local39 + this.anInt3722;
				@Pc(53) int local53 = local44 < -2048 ? local44 + 4096 : local44;
				@Pc(64) int local64 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(69) int local69 = local29 + this.anInt3733;
				@Pc(78) int local78 = local69 < -2048 ? local69 + 4096 : local69;
				@Pc(89) int local89 = local78 <= 2048 ? local78 : local78 - 4096;
				@Pc(95) int local95 = local39 + this.anInt3731;
				@Pc(104) int local104 = local95 < -2048 ? local95 + 4096 : local95;
				@Pc(113) int local113 = local104 > 2048 ? local104 - 4096 : local104;
				@Pc(119) int local119 = local29 + this.anInt3728;
				@Pc(130) int local130 = local119 >= -2048 ? local119 : local119 + 4096;
				@Pc(141) int local141 = local130 <= 2048 ? local130 : local130 - 4096;
				local11[local31] = this.method3236(local89, local64) || this.method3235(local141, local113) ? 4096 : 0;
			}
		}
		return local11;
	}
}
