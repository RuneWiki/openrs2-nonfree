import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class2_Sub4_Sub27 extends Class2_Sub4 {

	@OriginalMember(owner = "client!qw", name = "C", descriptor = "I")
	private int anInt7211 = 12288;

	@OriginalMember(owner = "client!qw", name = "E", descriptor = "I")
	private int anInt7213 = 2048;

	@OriginalMember(owner = "client!qw", name = "K", descriptor = "I")
	private int anInt7219 = 0;

	@OriginalMember(owner = "client!qw", name = "G", descriptor = "I")
	private int anInt7215 = 4096;

	@OriginalMember(owner = "client!qw", name = "I", descriptor = "I")
	private int anInt7217 = 8192;

	@OriginalMember(owner = "client!qw", name = "N", descriptor = "I")
	private int anInt7222 = 2048;

	@OriginalMember(owner = "client!qw", name = "J", descriptor = "I")
	private int anInt7218 = 0;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt7213 = arg1.method4518();
		} else if (arg0 == 1) {
			this.anInt7219 = arg1.method4518();
		} else if (arg0 == 2) {
			this.anInt7218 = arg1.method4518();
		} else if (arg0 == 3) {
			this.anInt7222 = arg1.method4518();
		} else if (arg0 == 4) {
			this.anInt7211 = arg1.method4518();
		} else if (arg0 == 5) {
			this.anInt7215 = arg1.method4518();
		} else if (arg0 == 6) {
			this.anInt7217 = arg1.method4518();
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)Z")
	private boolean method5876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg0 + arg1) * this.anInt7211 >> 12;
		@Pc(31) int local31 = Static135.anIntArray552[local12 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt7211;
		@Pc(45) int local45 = (local38 << 12) / this.anInt7217;
		@Pc(52) int local52 = local45 * this.anInt7215 >> 12;
		return local52 > arg1 - arg0 && -local52 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(III)Z")
	private boolean method5877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg0 - arg1) * this.anInt7211 >> 12;
		@Pc(22) int local22 = Static135.anIntArray552[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt7211;
		@Pc(36) int local36 = (local29 << 12) / this.anInt7217;
		@Pc(47) int local47 = this.anInt7215 * local36 >> 12;
		return arg0 + arg1 < local47 && -local47 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "(I)V")
	@Override
	public void method7562() {
		Static59.method1017();
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(21) int local21 = Static13.anIntArray418[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static143.anInt7434; local23++) {
				@Pc(31) int local31 = Static519.anIntArray155[local23] - 2048;
				@Pc(36) int local36 = this.anInt7213 + local31;
				@Pc(47) int local47 = local36 < -2048 ? local36 + 4096 : local36;
				@Pc(58) int local58 = local47 > 2048 ? local47 - 4096 : local47;
				@Pc(63) int local63 = local21 + this.anInt7219;
				@Pc(74) int local74 = local63 < -2048 ? local63 + 4096 : local63;
				@Pc(85) int local85 = local74 > 2048 ? local74 - 4096 : local74;
				@Pc(90) int local90 = this.anInt7218 + local31;
				@Pc(99) int local99 = local90 >= -2048 ? local90 : local90 + 4096;
				@Pc(108) int local108 = local99 <= 2048 ? local99 : local99 - 4096;
				@Pc(113) int local113 = this.anInt7222 + local21;
				@Pc(122) int local122 = local113 >= -2048 ? local113 : local113 + 4096;
				@Pc(131) int local131 = local122 > 2048 ? local122 - 4096 : local122;
				local11[local23] = this.method5877(local85, local58) || this.method5876(local108, local131) ? 4096 : 0;
			}
		}
		return local11;
	}
}
