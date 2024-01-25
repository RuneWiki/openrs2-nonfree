import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class5_Sub3_Sub15 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
	private int anInt3298 = 2048;

	@OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
	private int anInt3299 = 4096;

	@OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
	private int anInt3304 = 12288;

	@OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
	private int anInt3307 = 8192;

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
	private int anInt3305 = 0;

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
	private int anInt3309 = 2048;

	@OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
	private int anInt3308 = 0;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(22) int[] local22 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(32) int local32 = Static458.anIntArray438[arg0] - 2048;
			for (@Pc(34) int local34 = 0; local34 < Static7.anInt102; local34++) {
				@Pc(42) int local42 = Static382.anIntArray368[local34] - 2048;
				@Pc(47) int local47 = this.anInt3309 + local42;
				@Pc(57) int local57 = local47 >= -2048 ? local47 : local47 + 4096;
				@Pc(67) int local67 = local57 <= 2048 ? local57 : local57 - 4096;
				@Pc(72) int local72 = this.anInt3305 + local32;
				@Pc(82) int local82 = local72 >= -2048 ? local72 : local72 + 4096;
				@Pc(94) int local94 = local82 > 2048 ? local82 - 4096 : local82;
				@Pc(99) int local99 = this.anInt3308 + local42;
				@Pc(111) int local111 = local99 >= -2048 ? local99 : local99 + 4096;
				@Pc(121) int local121 = local111 <= 2048 ? local111 : local111 - 4096;
				@Pc(126) int local126 = this.anInt3298 + local32;
				@Pc(138) int local138 = local126 >= -2048 ? local126 : local126 + 4096;
				@Pc(150) int local150 = local138 > 2048 ? local138 - 4096 : local138;
				local22[local34] = this.method3056(local94, local67) || this.method3054(local150, local121) ? 4096 : 0;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)Z")
	private boolean method3054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt3304 >> 12;
		@Pc(22) int local22 = Static153.anIntArray141[local12 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local22 << 12) / this.anInt3304;
		@Pc(44) int local44 = (local37 << 12) / this.anInt3307;
		@Pc(51) int local51 = this.anInt3299 * local44 >> 12;
		return local51 > arg0 - arg1 && arg0 - arg1 > -local51;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZI)Z")
	private boolean method3056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt3304 >> 12;
		@Pc(23) int local23 = Static153.anIntArray141[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt3304;
		@Pc(37) int local37 = (local30 << 12) / this.anInt3307;
		@Pc(52) int local52 = this.anInt3299 * local37 >> 12;
		return local52 > arg0 + arg1 && arg0 + arg1 > -local52;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3309 = arg0.method7333();
		} else if (arg1 == 1) {
			this.anInt3305 = arg0.method7333();
		} else if (arg1 == 2) {
			this.anInt3308 = arg0.method7333();
		} else if (arg1 == 3) {
			this.anInt3298 = arg0.method7333();
		} else if (arg1 == 4) {
			this.anInt3304 = arg0.method7333();
		} else if (arg1 == 5) {
			this.anInt3299 = arg0.method7333();
		} else if (arg1 == 6) {
			this.anInt3307 = arg0.method7333();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	@Override
	public void method9210() {
		Static355.method5212();
	}
}
