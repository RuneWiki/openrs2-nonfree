import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bn", name = "O", descriptor = "I")
	private int anInt643;

	@OriginalMember(owner = "client!bn", name = "Q", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!bn", name = "S", descriptor = "I")
	private int anInt647;

	@OriginalMember(owner = "client!bn", name = "Y", descriptor = "I")
	private int anInt650;

	@OriginalMember(owner = "client!bn", name = "bb", descriptor = "I")
	private int anInt653;

	@OriginalMember(owner = "client!bn", name = "db", descriptor = "I")
	private int anInt655;

	@OriginalMember(owner = "client!bn", name = "P", descriptor = "I")
	private int anInt644 = 0;

	@OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
	private int anInt640 = 0;

	@OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
	private int anInt648 = 0;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt648 = arg0.method2248();
		} else if (arg1 == 1) {
			this.anInt644 = (arg0.method2212() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt640 = (arg0.method2212() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(21) int[][] local21 = this.method4715(arg0, 0);
			@Pc(25) int[] local25 = local21[1];
			@Pc(29) int[] local29 = local11[2];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local21[2];
			@Pc(41) int[] local41 = local21[0];
			@Pc(45) int[] local45 = local11[0];
			for (@Pc(47) int local47 = 0; local47 < Static62.anInt1350; local47++) {
				this.method504(local37[local47], local25[local47], local41[local47]);
				this.anInt647 += this.anInt644;
				this.anInt643 += this.anInt640;
				if (this.anInt647 < 0) {
					this.anInt647 = 0;
				}
				if (this.anInt643 < 0) {
					this.anInt643 = 0;
				}
				for (this.anInt645 += this.anInt648; this.anInt645 < 0; this.anInt645 += 4096) {
				}
				if (this.anInt647 > 4096) {
					this.anInt647 = 4096;
				}
				if (this.anInt643 > 4096) {
					this.anInt643 = 4096;
				}
				while (this.anInt645 > 4096) {
					this.anInt645 -= 4096;
				}
				this.method507(this.anInt645, this.anInt647, this.anInt643);
				local45[local47] = this.anInt653;
				local33[local47] = this.anInt650;
				local29[local47] = this.anInt655;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(IIII)V")
	private void method504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg2 <= arg1 ? arg1 : arg2;
		@Pc(25) int local25 = local8 < arg0 ? arg0 : local8;
		@Pc(36) int local36 = arg2 < arg1 ? arg2 : arg1;
		@Pc(43) int local43 = arg0 >= local36 ? local36 : arg0;
		this.anInt643 = (local25 + local43) / 2;
		@Pc(55) int local55 = local25 - local43;
		if (this.anInt643 > 0 && this.anInt643 < 4096) {
			this.anInt647 = (local55 << 12) / (this.anInt643 > 2048 ? 8192 - (this.anInt643 * 2) : this.anInt643 * 2);
		} else {
			this.anInt647 = 0;
		}
		if (local55 <= 0) {
			this.anInt645 = 0;
			return;
		}
		@Pc(111) int local111 = (local25 - arg2 << 12) / local55;
		@Pc(120) int local120 = (local25 - arg0 << 12) / local55;
		@Pc(128) int local128 = (local25 - arg1 << 12) / local55;
		if (local25 == arg2) {
			this.anInt645 = local43 == arg1 ? local120 + 20480 : -local128 + 4096;
		} else if (arg1 == local25) {
			this.anInt645 = arg0 == local43 ? local111 + 4096 : -local120 + 12288;
		} else {
			this.anInt645 = arg2 == local43 ? local128 + 12288 : 20480 - local111;
		}
		this.anInt645 /= 6;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBII)V")
	private void method507(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(30) int local30 = arg2 <= 2048 ? arg2 * (arg1 + 4096) >> 12 : arg1 + arg2 - (arg1 * arg2 >> 12);
		if (local30 <= 0) {
			this.anInt653 = this.anInt650 = this.anInt655 = arg2;
			return;
		}
		@Pc(39) int local39 = arg0 * 6;
		@Pc(46) int local46 = arg2 + arg2 - local30;
		@Pc(55) int local55 = (local30 - local46 << 12) / local30;
		@Pc(59) int local59 = local39 >> 12;
		@Pc(66) int local66 = local39 - (local59 << 12);
		@Pc(74) int local74 = local55 * local30 >> 12;
		@Pc(80) int local80 = local66 * local74 >> 12;
		@Pc(84) int local84 = local80 + local46;
		@Pc(89) int local89 = local30 - local80;
		if (local59 == 0) {
			this.anInt655 = local46;
			this.anInt653 = local30;
			this.anInt650 = local84;
		} else if (local59 == 1) {
			this.anInt650 = local30;
			this.anInt653 = local89;
			this.anInt655 = local46;
		} else if (local59 == 2) {
			this.anInt650 = local30;
			this.anInt655 = local84;
			this.anInt653 = local46;
		} else if (local59 == 3) {
			this.anInt655 = local30;
			this.anInt653 = local46;
			this.anInt650 = local89;
		} else if (local59 == 4) {
			this.anInt653 = local84;
			this.anInt655 = local30;
			this.anInt650 = local46;
		} else if (local59 == 5) {
			this.anInt653 = local30;
			this.anInt650 = local46;
			this.anInt655 = local89;
		}
	}
}
