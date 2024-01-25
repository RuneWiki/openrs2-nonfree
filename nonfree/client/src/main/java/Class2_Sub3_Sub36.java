import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class2_Sub3_Sub36 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
	private int anInt10623;

	@OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
	private int anInt10626;

	@OriginalMember(owner = "client!vj", name = "S", descriptor = "I")
	private int anInt10629;

	@OriginalMember(owner = "client!vj", name = "W", descriptor = "I")
	private int anInt10633;

	@OriginalMember(owner = "client!vj", name = "ab", descriptor = "I")
	private int anInt10637;

	@OriginalMember(owner = "client!vj", name = "bb", descriptor = "I")
	private int anInt10638;

	@OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
	private int anInt10627 = 0;

	@OriginalMember(owner = "client!vj", name = "Y", descriptor = "I")
	private int anInt10635 = 0;

	@OriginalMember(owner = "client!vj", name = "cb", descriptor = "I")
	private int anInt10639 = 0;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(21) int[][] local21 = this.method9147(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static222.anInt4971; local47++) {
				this.method8885(local25[local47], local29[local47], local33[local47]);
				this.anInt10638 += this.anInt10627;
				this.anInt10637 += this.anInt10639;
				this.anInt10626 += this.anInt10635;
				while (this.anInt10637 < 0) {
					this.anInt10637 += 4096;
				}
				if (this.anInt10638 < 0) {
					this.anInt10638 = 0;
				}
				while (this.anInt10637 > 4096) {
					this.anInt10637 -= 4096;
				}
				if (this.anInt10626 < 0) {
					this.anInt10626 = 0;
				}
				if (this.anInt10638 > 4096) {
					this.anInt10638 = 4096;
				}
				if (this.anInt10626 > 4096) {
					this.anInt10626 = 4096;
				}
				this.method8886(this.anInt10626, this.anInt10637, this.anInt10638);
				local37[local47] = this.anInt10623;
				local41[local47] = this.anInt10633;
				local45[local47] = this.anInt10629;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIBI)V")
	private void method8885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 >= arg0 ? arg1 : arg0;
		@Pc(23) int local23 = arg2 <= local12 ? local12 : arg2;
		@Pc(34) int local34 = arg1 > arg0 ? arg0 : arg1;
		@Pc(41) int local41 = arg2 >= local34 ? local34 : arg2;
		this.anInt10626 = (local23 + local41) / 2;
		@Pc(52) int local52 = local23 - local41;
		if (local52 > 0) {
			@Pc(66) int local66 = (local23 - arg0 << 12) / local52;
			@Pc(75) int local75 = (local23 - arg1 << 12) / local52;
			@Pc(84) int local84 = (local23 - arg2 << 12) / local52;
			if (arg0 == local23) {
				this.anInt10637 = local41 == arg1 ? local84 + 20480 : -local75 + 4096;
			} else if (local23 == arg1) {
				this.anInt10637 = arg2 == local41 ? local66 + 4096 : -local84 + 12288;
			} else {
				this.anInt10637 = arg0 == local41 ? local75 + 12288 : -local66 + 20480;
			}
			this.anInt10637 /= 6;
		} else {
			this.anInt10637 = 0;
		}
		if (this.anInt10626 > 0 && this.anInt10626 < 4096) {
			this.anInt10638 = (local52 << 12) / (this.anInt10626 > 2048 ? 8192 - this.anInt10626 * 2 : this.anInt10626 * 2);
		} else {
			this.anInt10638 = 0;
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIBI)V")
	private void method8886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) int local35 = arg0 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : arg0 * (4096 - -arg2) >> 12;
		if (local35 <= 0) {
			this.anInt10623 = this.anInt10633 = this.anInt10629 = arg0;
			return;
		}
		@Pc(51) int local51 = arg1 * 6;
		@Pc(59) int local59 = arg0 + arg0 - local35;
		@Pc(68) int local68 = (local35 - local59 << 12) / local35;
		@Pc(72) int local72 = local51 >> 12;
		@Pc(79) int local79 = local51 - (local72 << 12);
		@Pc(87) int local87 = local35 * local68 >> 12;
		@Pc(93) int local93 = local87 * local79 >> 12;
		@Pc(97) int local97 = local93 + local59;
		@Pc(101) int local101 = local35 - local93;
		if (local72 == 0) {
			this.anInt10633 = local97;
			this.anInt10623 = local35;
			this.anInt10629 = local59;
		} else if (local72 == 1) {
			this.anInt10629 = local59;
			this.anInt10623 = local101;
			this.anInt10633 = local35;
		} else if (local72 == 2) {
			this.anInt10629 = local97;
			this.anInt10623 = local59;
			this.anInt10633 = local35;
		} else if (local72 == 3) {
			this.anInt10633 = local101;
			this.anInt10623 = local59;
			this.anInt10629 = local35;
		} else if (local72 == 4) {
			this.anInt10633 = local59;
			this.anInt10623 = local97;
			this.anInt10629 = local35;
		} else if (local72 == 5) {
			this.anInt10623 = local35;
			this.anInt10629 = local101;
			this.anInt10633 = local59;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10639 = arg0.method8368();
		} else if (arg1 == 1) {
			this.anInt10627 = (arg0.method8384() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt10635 = (arg0.method8384() << 12) / 100;
		}
	}
}
