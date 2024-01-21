import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class3_Sub5_Sub29 extends Class3_Sub5 {

	@OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
	private int anInt3712;

	@OriginalMember(owner = "client!sh", name = "bb", descriptor = "I")
	private int anInt3715;

	@OriginalMember(owner = "client!sh", name = "db", descriptor = "I")
	private int anInt3716;

	@OriginalMember(owner = "client!sh", name = "fb", descriptor = "I")
	private int anInt3717;

	@OriginalMember(owner = "client!sh", name = "ib", descriptor = "I")
	private int anInt3719;

	@OriginalMember(owner = "client!sh", name = "lb", descriptor = "I")
	private int anInt3721;

	@OriginalMember(owner = "client!sh", name = "Y", descriptor = "I")
	private int anInt3713;

	@OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
	private int anInt3709;

	@OriginalMember(owner = "client!sh", name = "U", descriptor = "I")
	private int anInt3711;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3711 = arg1.method2138();
		} else if (arg0 == 1) {
			this.anInt3713 = (arg1.method2123() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3709 = (arg1.method2123() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)V")
	private void method2678(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 <= arg2 ? arg2 : arg0;
		@Pc(19) int local19 = arg1 > local12 ? arg1 : local12;
		@Pc(39) int local39 = arg0 >= arg2 ? arg2 : arg0;
		@Pc(46) int local46 = local39 <= arg1 ? local39 : arg1;
		this.anInt3719 = (local19 + local46) / 2;
		@Pc(58) int local58 = local19 - local46;
		if (local58 > 0) {
			@Pc(69) int local69 = (local19 - arg0 << 12) / local58;
			@Pc(77) int local77 = (local19 - arg2 << 12) / local58;
			@Pc(85) int local85 = (local19 - arg1 << 12) / local58;
			if (local19 == arg0) {
				this.anInt3712 = arg2 == local46 ? local85 + 20480 : -local77 + 4096;
			} else if (local19 == arg2) {
				this.anInt3712 = local46 == arg1 ? local69 + 4096 : -local85 + 12288;
			} else {
				this.anInt3712 = arg0 == local46 ? local77 + 12288 : -local69 + 20480;
			}
			this.anInt3712 /= 6;
		} else {
			this.anInt3712 = 0;
		}
		if (this.anInt3719 > 0 && this.anInt3719 < 4096) {
			this.anInt3715 = (local58 << 12) / (this.anInt3719 <= 2048 ? this.anInt3719 * 2 : 8192 - (this.anInt3719 * 2));
		} else {
			this.anInt3715 = 0;
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(21) int[][] local21 = this.method3163(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[2];
			@Pc(33) int[] local33 = local21[1];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static104.anInt2195; local47++) {
				this.method2678(local25[local47], local29[local47], local33[local47]);
				this.anInt3719 += this.anInt3709;
				if (this.anInt3719 < 0) {
					this.anInt3719 = 0;
				}
				if (this.anInt3719 > 4096) {
					this.anInt3719 = 4096;
				}
				for (this.anInt3712 += this.anInt3711; this.anInt3712 < 0; this.anInt3712 += 4096) {
				}
				while (this.anInt3712 > 4096) {
					this.anInt3712 -= 4096;
				}
				this.anInt3715 += this.anInt3713;
				if (this.anInt3715 < 0) {
					this.anInt3715 = 0;
				}
				if (this.anInt3715 > 4096) {
					this.anInt3715 = 4096;
				}
				this.method2681(this.anInt3719, this.anInt3712, this.anInt3715);
				local37[local47] = this.anInt3717;
				local41[local47] = this.anInt3721;
				local45[local47] = this.anInt3716;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBI)V")
	private void method2681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg0 <= 2048 ? arg0 * (arg2 + 4096) >> 12 : arg0 + arg2 - (arg0 * arg2 >> 12);
		if (local29 <= 0) {
			this.anInt3717 = this.anInt3721 = this.anInt3716 = arg0;
			return;
		}
		@Pc(35) int local35 = arg1 * 6;
		@Pc(42) int local42 = arg0 + arg0 - local29;
		@Pc(51) int local51 = (local29 - local42 << 12) / local29;
		@Pc(57) int local57 = local35 >> 12;
		@Pc(63) int local63 = local51 * local29 >> 12;
		@Pc(70) int local70 = local35 - (local57 << 12);
		@Pc(76) int local76 = local70 * local63 >> 12;
		@Pc(80) int local80 = local76 + local42;
		@Pc(85) int local85 = local29 - local76;
		if (local57 == 0) {
			this.anInt3716 = local42;
			this.anInt3721 = local80;
			this.anInt3717 = local29;
			return;
		}
		if (local57 == 1) {
			this.anInt3717 = local85;
			this.anInt3716 = local42;
			this.anInt3721 = local29;
			return;
		}
		if (local57 == 2) {
			this.anInt3716 = local80;
			this.anInt3721 = local29;
			this.anInt3717 = local42;
			return;
		}
		if (local57 == 3) {
			this.anInt3716 = local29;
			this.anInt3721 = local85;
			this.anInt3717 = local42;
			return;
		}
		if (local57 == 4) {
			this.anInt3716 = local29;
			this.anInt3717 = local80;
			this.anInt3721 = local42;
			return;
		}
		if (local57 == 5) {
			this.anInt3717 = local29;
			this.anInt3721 = local42;
			this.anInt3716 = local85;
			return;
		}
	}
}
