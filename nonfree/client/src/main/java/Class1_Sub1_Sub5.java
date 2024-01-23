import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!cl", name = "Z", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!cl", name = "fb", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!cl", name = "cb", descriptor = "I")
	private int anInt1024 = 0;

	@OriginalMember(owner = "client!cl", name = "ib", descriptor = "I")
	private int anInt1030 = 0;

	@OriginalMember(owner = "client!cl", name = "lb", descriptor = "I")
	private int anInt1031 = 0;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(25) int[][] local25 = this.method4758(0, arg0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local15[0];
			@Pc(45) int[] local45 = local15[1];
			@Pc(49) int[] local49 = local15[2];
			for (@Pc(51) int local51 = 0; local51 < Static75.anInt1848; local51++) {
				this.method801(local33[local51], local29[local51], local37[local51]);
				this.anInt1013 += this.anInt1024;
				this.anInt1020 += this.anInt1031;
				while (this.anInt1013 < 0) {
					this.anInt1013 += 4096;
				}
				this.anInt1021 += this.anInt1030;
				if (this.anInt1021 < 0) {
					this.anInt1021 = 0;
				}
				if (this.anInt1021 > 4096) {
					this.anInt1021 = 4096;
				}
				if (this.anInt1020 < 0) {
					this.anInt1020 = 0;
				}
				while (this.anInt1013 > 4096) {
					this.anInt1013 -= 4096;
				}
				if (this.anInt1020 > 4096) {
					this.anInt1020 = 4096;
				}
				this.method800(this.anInt1013, this.anInt1020, this.anInt1021);
				local41[local51] = this.anInt1019;
				local45[local51] = this.anInt1015;
				local49[local51] = this.anInt1027;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBII)V")
	private void method800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(30) int local30 = arg1 <= 2048 ? arg1 * (arg2 + 4096) >> 12 : arg2 + arg1 - (arg2 * arg1 >> 12);
		if (local30 <= 0) {
			this.anInt1019 = this.anInt1015 = this.anInt1027 = arg1;
			return;
		}
		@Pc(40) int local40 = arg0 * 6;
		@Pc(46) int local46 = arg1 + arg1 - local30;
		@Pc(50) int local50 = local40 >> 12;
		@Pc(58) int local58 = (local30 - local46 << 12) / local30;
		@Pc(66) int local66 = local58 * local30 >> 12;
		@Pc(72) int local72 = local40 - (local50 << 12);
		@Pc(78) int local78 = local66 * local72 >> 12;
		@Pc(83) int local83 = local46 + local78;
		@Pc(87) int local87 = local30 - local78;
		if (local50 == 0) {
			this.anInt1019 = local30;
			this.anInt1015 = local83;
			this.anInt1027 = local46;
		} else if (local50 == 1) {
			this.anInt1027 = local46;
			this.anInt1015 = local30;
			this.anInt1019 = local87;
		} else if (local50 == 2) {
			this.anInt1019 = local46;
			this.anInt1015 = local30;
			this.anInt1027 = local83;
		} else if (local50 == 3) {
			this.anInt1027 = local30;
			this.anInt1015 = local87;
			this.anInt1019 = local46;
		} else if (local50 == 4) {
			this.anInt1015 = local46;
			this.anInt1027 = local30;
			this.anInt1019 = local83;
		} else if (local50 == 5) {
			this.anInt1015 = local46;
			this.anInt1027 = local87;
			this.anInt1019 = local30;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1024 = arg0.method2645();
		} else if (arg1 == 1) {
			this.anInt1030 = (arg0.method2633() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt1031 = (arg0.method2633() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZII)V")
	private void method801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 <= arg0 ? arg0 : arg1;
		@Pc(27) int local27 = arg1 >= arg0 ? arg0 : arg1;
		@Pc(38) int local38 = local16 >= arg2 ? local16 : arg2;
		@Pc(57) int local57 = arg2 >= local27 ? local27 : arg2;
		@Pc(62) int local62 = local38 - local57;
		this.anInt1020 = (local38 + local57) / 2;
		if (local62 > 0) {
			@Pc(82) int local82 = (local38 - arg1 << 12) / local62;
			@Pc(91) int local91 = (local38 - arg2 << 12) / local62;
			@Pc(100) int local100 = (local38 - arg0 << 12) / local62;
			if (arg1 == local38) {
				this.anInt1013 = arg0 == local57 ? local91 + 20480 : -local100 + 4096;
			} else if (arg0 == local38) {
				this.anInt1013 = local57 == arg2 ? local82 + 4096 : -local91 + 12288;
			} else {
				this.anInt1013 = arg1 == local57 ? local100 + 12288 : -local82 + 20480;
			}
			this.anInt1013 /= 6;
		} else {
			this.anInt1013 = 0;
		}
		if (this.anInt1020 > 0 && this.anInt1020 < 4096) {
			this.anInt1021 = (local62 << 12) / (this.anInt1020 > 2048 ? 8192 - (this.anInt1020 * 2) : this.anInt1020 * 2);
		} else {
			this.anInt1021 = 0;
		}
	}
}
