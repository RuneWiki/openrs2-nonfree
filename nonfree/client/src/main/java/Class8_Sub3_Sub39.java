import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class8_Sub3_Sub39 extends Class8_Sub3 {

	@OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
	private int anInt5578;

	@OriginalMember(owner = "client!vl", name = "O", descriptor = "I")
	private int anInt5582;

	@OriginalMember(owner = "client!vl", name = "P", descriptor = "I")
	private int anInt5583;

	@OriginalMember(owner = "client!vl", name = "W", descriptor = "I")
	private int anInt5589;

	@OriginalMember(owner = "client!vl", name = "Z", descriptor = "I")
	private int anInt5592;

	@OriginalMember(owner = "client!vl", name = "cb", descriptor = "I")
	private int anInt5595;

	@OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
	private int anInt5581 = 0;

	@OriginalMember(owner = "client!vl", name = "X", descriptor = "I")
	private int anInt5590 = 0;

	@OriginalMember(owner = "client!vl", name = "ab", descriptor = "I")
	private int anInt5593 = 0;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(31) int[][] local31 = this.method4224(arg0, 0);
			@Pc(35) int[] local35 = local31[1];
			@Pc(39) int[] local39 = local20[0];
			@Pc(43) int[] local43 = local31[0];
			@Pc(47) int[] local47 = local20[2];
			@Pc(51) int[] local51 = local20[1];
			@Pc(55) int[] local55 = local31[2];
			for (@Pc(57) int local57 = 0; local57 < Static239.anInt4789; local57++) {
				this.method4235(local55[local57], local43[local57], local35[local57]);
				this.anInt5589 += this.anInt5590;
				this.anInt5582 += this.anInt5593;
				this.anInt5592 += this.anInt5581;
				if (this.anInt5589 < 0) {
					this.anInt5589 = 0;
				}
				while (this.anInt5592 < 0) {
					this.anInt5592 += 4096;
				}
				if (this.anInt5582 < 0) {
					this.anInt5582 = 0;
				}
				while (this.anInt5592 > 4096) {
					this.anInt5592 -= 4096;
				}
				if (this.anInt5589 > 4096) {
					this.anInt5589 = 4096;
				}
				if (this.anInt5582 > 4096) {
					this.anInt5582 = 4096;
				}
				this.method4232(this.anInt5582, this.anInt5589, this.anInt5592);
				local39[local57] = this.anInt5578;
				local51[local57] = this.anInt5595;
				local47[local57] = this.anInt5583;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt5581 = arg1.method2360();
		} else if (arg0 == 1) {
			this.anInt5593 = (arg1.method2374() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5590 = (arg1.method2374() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIII)V")
	private void method4232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) int local34 = arg1 > 2048 ? arg1 + arg0 - (arg0 * arg1 >> 12) : arg1 * (arg0 + 4096) >> 12;
		if (local34 <= 0) {
			this.anInt5578 = this.anInt5595 = this.anInt5583 = arg1;
			return;
		}
		@Pc(54) int local54 = arg1 + arg1 - local34;
		@Pc(58) int local58 = arg2 * 6;
		@Pc(67) int local67 = (local34 - local54 << 12) / local34;
		@Pc(71) int local71 = local58 >> 12;
		@Pc(77) int local77 = local58 - (local71 << 12);
		@Pc(85) int local85 = local67 * local34 >> 12;
		@Pc(91) int local91 = local85 * local77 >> 12;
		@Pc(96) int local96 = local34 - local91;
		@Pc(100) int local100 = local91 + local54;
		if (local71 == 0) {
			this.anInt5578 = local34;
			this.anInt5583 = local54;
			this.anInt5595 = local100;
		} else if (local71 == 1) {
			this.anInt5595 = local34;
			this.anInt5583 = local54;
			this.anInt5578 = local96;
		} else if (local71 == 2) {
			this.anInt5578 = local54;
			this.anInt5595 = local34;
			this.anInt5583 = local100;
		} else if (local71 == 3) {
			this.anInt5583 = local34;
			this.anInt5578 = local54;
			this.anInt5595 = local96;
		} else if (local71 == 4) {
			this.anInt5595 = local54;
			this.anInt5583 = local34;
			this.anInt5578 = local100;
		} else if (local71 == 5) {
			this.anInt5578 = local34;
			this.anInt5583 = local96;
			this.anInt5595 = local54;
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(IIII)V")
	private void method4235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(21) int local21 = arg1 < arg2 ? arg1 : arg2;
		@Pc(28) int local28 = arg0 < local21 ? arg0 : local21;
		@Pc(39) int local39 = arg2 >= arg1 ? arg2 : arg1;
		@Pc(50) int local50 = arg0 <= local39 ? local39 : arg0;
		this.anInt5589 = (local50 + local28) / 2;
		@Pc(62) int local62 = local50 - local28;
		if (this.anInt5589 > 0 && this.anInt5589 < 4096) {
			this.anInt5582 = (local62 << 12) / (this.anInt5589 <= 2048 ? this.anInt5589 * 2 : 8192 - (this.anInt5589 * 2));
		} else {
			this.anInt5582 = 0;
		}
		if (local62 <= 0) {
			this.anInt5592 = 0;
			return;
		}
		@Pc(113) int local113 = (local50 - arg2 << 12) / local62;
		@Pc(121) int local121 = (local50 - arg1 << 12) / local62;
		@Pc(130) int local130 = (local50 - arg0 << 12) / local62;
		if (arg1 == local50) {
			this.anInt5592 = arg2 == local28 ? local130 + 20480 : -local113 + 4096;
		} else if (local50 == arg2) {
			this.anInt5592 = local28 == arg0 ? local121 + 4096 : -local130 + 12288;
		} else {
			this.anInt5592 = arg1 == local28 ? local113 + 12288 : 20480 - local121;
		}
		this.anInt5592 /= 6;
	}
}
