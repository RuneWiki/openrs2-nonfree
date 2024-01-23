import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
	private int anInt3619;

	@OriginalMember(owner = "client!pj", name = "ab", descriptor = "I")
	private int anInt3623;

	@OriginalMember(owner = "client!pj", name = "cb", descriptor = "I")
	private int anInt3625;

	@OriginalMember(owner = "client!pj", name = "fb", descriptor = "I")
	private int anInt3628;

	@OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
	private int anInt3629;

	@OriginalMember(owner = "client!pj", name = "lb", descriptor = "I")
	private int anInt3633;

	@OriginalMember(owner = "client!pj", name = "eb", descriptor = "I")
	private int anInt3627 = 0;

	@OriginalMember(owner = "client!pj", name = "jb", descriptor = "I")
	private int anInt3631 = 0;

	@OriginalMember(owner = "client!pj", name = "mb", descriptor = "I")
	private int anInt3634 = 0;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBII)V")
	private void method2683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23 = arg1 > arg2 ? arg2 : arg1;
		@Pc(34) int local34 = arg2 > arg1 ? arg2 : arg1;
		@Pc(45) int local45 = arg0 < local23 ? arg0 : local23;
		@Pc(56) int local56 = arg0 <= local34 ? local34 : arg0;
		@Pc(61) int local61 = local56 - local45;
		this.anInt3628 = (local45 + local56) / 2;
		if (local61 > 0) {
			@Pc(80) int local80 = (local56 - arg2 << 12) / local61;
			@Pc(89) int local89 = (local56 - arg1 << 12) / local61;
			@Pc(98) int local98 = (local56 - arg0 << 12) / local61;
			if (local56 == arg2) {
				this.anInt3619 = arg1 == local45 ? local98 + 20480 : -local89 + 4096;
			} else if (local56 == arg1) {
				this.anInt3619 = local45 == arg0 ? local80 + 4096 : -local98 + 12288;
			} else {
				this.anInt3619 = arg2 == local45 ? local89 + 12288 : -local80 + 20480;
			}
			this.anInt3619 /= 6;
		} else {
			this.anInt3619 = 0;
		}
		if (this.anInt3628 > 0 && this.anInt3628 < 4096) {
			this.anInt3625 = (local61 << 12) / (this.anInt3628 > 2048 ? 8192 - (this.anInt3628 * 2) : this.anInt3628 * 2);
		} else {
			this.anInt3625 = 0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIII)V")
	private void method2684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(27) int local27 = arg0 > 2048 ? arg2 + arg0 - (arg2 * arg0 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local27 <= 0) {
			this.anInt3633 = this.anInt3623 = this.anInt3629 = arg0;
			return;
		}
		@Pc(36) int local36 = arg1 * 6;
		@Pc(40) int local40 = local36 >> 12;
		@Pc(47) int local47 = arg0 + arg0 - local27;
		@Pc(55) int local55 = (local27 - local47 << 12) / local27;
		@Pc(61) int local61 = local36 - (local40 << 12);
		@Pc(69) int local69 = local27 * local55 >> 12;
		@Pc(75) int local75 = local61 * local69 >> 12;
		@Pc(79) int local79 = local75 + local47;
		@Pc(84) int local84 = local27 - local75;
		if (local40 == 0) {
			this.anInt3633 = local27;
			this.anInt3623 = local79;
			this.anInt3629 = local47;
			return;
		}
		if (local40 == 1) {
			this.anInt3623 = local27;
			this.anInt3629 = local47;
			this.anInt3633 = local84;
			return;
		}
		if (local40 == 2) {
			this.anInt3623 = local27;
			this.anInt3633 = local47;
			this.anInt3629 = local79;
			return;
		}
		if (local40 == 3) {
			this.anInt3629 = local27;
			this.anInt3633 = local47;
			this.anInt3623 = local84;
			return;
		}
		if (local40 == 4) {
			this.anInt3629 = local27;
			this.anInt3623 = local47;
			this.anInt3633 = local79;
			return;
		}
		if (local40 == 5) {
			this.anInt3623 = local47;
			this.anInt3633 = local27;
			this.anInt3629 = local84;
			return;
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(17) int[][] local17 = this.method3713(arg0, 0);
			@Pc(21) int[] local21 = local17[1];
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[2];
			@Pc(33) int[] local33 = local7[0];
			@Pc(37) int[] local37 = local7[1];
			@Pc(41) int[] local41 = local7[2];
			for (@Pc(43) int local43 = 0; local43 < Static11.anInt294; local43++) {
				this.method2683(local29[local43], local21[local43], local25[local43]);
				this.anInt3619 += this.anInt3634;
				this.anInt3625 += this.anInt3631;
				if (this.anInt3625 < 0) {
					this.anInt3625 = 0;
				}
				if (this.anInt3625 > 4096) {
					this.anInt3625 = 4096;
				}
				this.anInt3628 += this.anInt3627;
				while (this.anInt3619 < 0) {
					this.anInt3619 += 4096;
				}
				while (this.anInt3619 > 4096) {
					this.anInt3619 -= 4096;
				}
				if (this.anInt3628 < 0) {
					this.anInt3628 = 0;
				}
				if (this.anInt3628 > 4096) {
					this.anInt3628 = 4096;
				}
				this.method2684(this.anInt3628, this.anInt3619, this.anInt3625);
				local33[local43] = this.anInt3633;
				local37[local43] = this.anInt3623;
				local41[local43] = this.anInt3629;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3634 = arg0.method2944();
		} else if (arg1 == 1) {
			this.anInt3631 = (arg0.method2992() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3627 = (arg0.method2992() << 12) / 100;
		}
	}
}
