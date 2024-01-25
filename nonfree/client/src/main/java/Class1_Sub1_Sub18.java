import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
	private int anInt4567;

	@OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
	private int anInt4568;

	@OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
	private int anInt4573;

	@OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
	private int anInt4574;

	@OriginalMember(owner = "client!jp", name = "N", descriptor = "I")
	private int anInt4576;

	@OriginalMember(owner = "client!jp", name = "O", descriptor = "I")
	private int anInt4577;

	@OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
	private int anInt4566 = 0;

	@OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
	private int anInt4572 = 0;

	@OriginalMember(owner = "client!jp", name = "M", descriptor = "I")
	private int anInt4575 = 0;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(29) int[][] local29 = this.method7833(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static501.anInt8748; local55++) {
				this.method3666(local33[local55], local41[local55], local37[local55]);
				this.anInt4576 += this.anInt4572;
				this.anInt4567 += this.anInt4575;
				this.anInt4574 += this.anInt4566;
				while (this.anInt4567 < 0) {
					this.anInt4567 += 4096;
				}
				while (this.anInt4567 > 4096) {
					this.anInt4567 -= 4096;
				}
				if (this.anInt4576 < 0) {
					this.anInt4576 = 0;
				}
				if (this.anInt4576 > 4096) {
					this.anInt4576 = 4096;
				}
				if (this.anInt4574 < 0) {
					this.anInt4574 = 0;
				}
				if (this.anInt4574 > 4096) {
					this.anInt4574 = 4096;
				}
				this.method3663(this.anInt4567, this.anInt4576, this.anInt4574);
				local45[local55] = this.anInt4573;
				local49[local55] = this.anInt4577;
				local53[local55] = this.anInt4568;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)V")
	private void method3663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(32) int local32 = arg2 > 2048 ? arg1 + arg2 - (arg1 * arg2 >> 12) : arg2 * (4096 - -arg1) >> 12;
		if (local32 <= 0) {
			this.anInt4573 = this.anInt4577 = this.anInt4568 = arg2;
			return;
		}
		@Pc(38) int local38 = arg0 * 6;
		@Pc(46) int local46 = arg2 + arg2 - local32;
		@Pc(55) int local55 = (local32 - local46 << 12) / local32;
		@Pc(59) int local59 = local38 >> 12;
		@Pc(66) int local66 = local38 - (local59 << 12);
		@Pc(74) int local74 = local32 * local55 >> 12;
		@Pc(80) int local80 = local66 * local74 >> 12;
		@Pc(84) int local84 = local80 + local46;
		@Pc(89) int local89 = local32 - local80;
		if (local59 == 0) {
			this.anInt4568 = local46;
			this.anInt4573 = local32;
			this.anInt4577 = local84;
			return;
		}
		if (local59 == 1) {
			this.anInt4577 = local32;
			this.anInt4573 = local89;
			this.anInt4568 = local46;
			return;
		}
		if (local59 == 2) {
			this.anInt4577 = local32;
			this.anInt4568 = local84;
			this.anInt4573 = local46;
			return;
		}
		if (local59 == 3) {
			this.anInt4577 = local89;
			this.anInt4568 = local32;
			this.anInt4573 = local46;
			return;
		}
		if (local59 == 4) {
			this.anInt4573 = local84;
			this.anInt4577 = local46;
			this.anInt4568 = local32;
			return;
		}
		if (local59 == 5) {
			this.anInt4568 = local89;
			this.anInt4573 = local32;
			this.anInt4577 = local46;
			return;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt4575 = arg1.method7975();
		} else if (arg0 == 1) {
			this.anInt4572 = (arg1.method7963() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt4566 = (arg1.method7963() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(IIII)V")
	private void method3666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg0 <= arg2 ? arg2 : arg0;
		@Pc(19) int local19 = local12 >= arg1 ? local12 : arg1;
		@Pc(26) int local26 = arg0 < arg2 ? arg0 : arg2;
		@Pc(37) int local37 = local26 > arg1 ? arg1 : local26;
		@Pc(47) int local47 = local19 - local37;
		this.anInt4574 = (local37 + local19) / 2;
		if (local47 <= 0) {
			this.anInt4567 = 0;
		} else {
			@Pc(73) int local73 = (local19 - arg0 << 12) / local47;
			@Pc(81) int local81 = (local19 - arg2 << 12) / local47;
			@Pc(90) int local90 = (local19 - arg1 << 12) / local47;
			if (arg0 == local19) {
				this.anInt4567 = local37 == arg2 ? local90 + 20480 : 4096 - local81;
			} else if (local19 == arg2) {
				this.anInt4567 = arg1 == local37 ? local73 + 4096 : -local90 + 12288;
			} else {
				this.anInt4567 = arg0 == local37 ? local81 + 12288 : 20480 - local73;
			}
			this.anInt4567 /= 6;
		}
		if (this.anInt4574 > 0 && this.anInt4574 < 4096) {
			this.anInt4576 = (local47 << 12) / (this.anInt4574 > 2048 ? 8192 - (this.anInt4574 * 2) : this.anInt4574 * 2);
		} else {
			this.anInt4576 = 0;
		}
	}
}
