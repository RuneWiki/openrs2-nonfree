import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class6_Sub1_Sub34 extends Class6_Sub1 {

	@OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
	private int anInt9149;

	@OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
	private int anInt9151;

	@OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
	private int anInt9152;

	@OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
	private int anInt9154;

	@OriginalMember(owner = "client!uu", name = "O", descriptor = "I")
	private int anInt9158;

	@OriginalMember(owner = "client!uu", name = "R", descriptor = "I")
	private int anInt9160;

	@OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
	private int anInt9148 = 0;

	@OriginalMember(owner = "client!uu", name = "L", descriptor = "I")
	private int anInt9155 = 0;

	@OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
	private int anInt9153 = 0;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBII)V")
	private void method7685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 < arg2 ? arg2 : arg1;
		@Pc(23) int local23 = local16 >= arg0 ? local16 : arg0;
		@Pc(34) int local34 = arg2 >= arg1 ? arg1 : arg2;
		@Pc(41) int local41 = local34 > arg0 ? arg0 : local34;
		this.anInt9151 = (local41 + local23) / 2;
		@Pc(53) int local53 = local23 - local41;
		if (local53 > 0) {
			@Pc(64) int local64 = (local23 - arg2 << 12) / local53;
			@Pc(72) int local72 = (local23 - arg1 << 12) / local53;
			@Pc(81) int local81 = (local23 - arg0 << 12) / local53;
			if (local23 == arg2) {
				this.anInt9160 = local41 == arg1 ? local81 + 20480 : -local72 + 4096;
			} else if (arg1 == local23) {
				this.anInt9160 = local41 == arg0 ? local64 + 4096 : -local81 + 12288;
			} else {
				this.anInt9160 = arg2 == local41 ? local72 + 12288 : -local64 + 20480;
			}
			this.anInt9160 /= 6;
		} else {
			this.anInt9160 = 0;
		}
		if (this.anInt9151 > 0 && this.anInt9151 < 4096) {
			this.anInt9154 = (local53 << 12) / (this.anInt9151 <= 2048 ? this.anInt9151 * 2 : 8192 - (this.anInt9151 * 2));
		} else {
			this.anInt9154 = 0;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(27) int[][] local27 = this.method8162(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static289.anInt5549; local53++) {
				this.method7685(local39[local53], local35[local53], local31[local53]);
				this.anInt9154 += this.anInt9153;
				this.anInt9160 += this.anInt9148;
				this.anInt9151 += this.anInt9155;
				while (this.anInt9160 < 0) {
					this.anInt9160 += 4096;
				}
				while (this.anInt9160 > 4096) {
					this.anInt9160 -= 4096;
				}
				if (this.anInt9154 < 0) {
					this.anInt9154 = 0;
				}
				if (this.anInt9151 < 0) {
					this.anInt9151 = 0;
				}
				if (this.anInt9154 > 4096) {
					this.anInt9154 = 4096;
				}
				if (this.anInt9151 > 4096) {
					this.anInt9151 = 4096;
				}
				this.method7687(this.anInt9151, this.anInt9154, this.anInt9160);
				local43[local53] = this.anInt9152;
				local47[local53] = this.anInt9158;
				local51[local53] = this.anInt9149;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZII)V")
	private void method7687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg0 <= 2048 ? (arg1 + 4096) * arg0 >> 12 : arg0 + arg1 - (arg1 * arg0 >> 12);
		if (local29 <= 0) {
			this.anInt9152 = this.anInt9158 = this.anInt9149 = arg0;
			return;
		}
		@Pc(46) int local46 = arg2 * 6;
		@Pc(54) int local54 = arg0 + arg0 - local29;
		@Pc(63) int local63 = (local29 - local54 << 12) / local29;
		@Pc(67) int local67 = local46 >> 12;
		@Pc(74) int local74 = local46 - (local67 << 12);
		@Pc(82) int local82 = local63 * local29 >> 12;
		@Pc(88) int local88 = local82 * local74 >> 12;
		@Pc(92) int local92 = local88 + local54;
		@Pc(97) int local97 = local29 - local88;
		if (local67 == 0) {
			this.anInt9149 = local54;
			this.anInt9152 = local29;
			this.anInt9158 = local92;
		} else if (local67 == 1) {
			this.anInt9158 = local29;
			this.anInt9149 = local54;
			this.anInt9152 = local97;
		} else if (local67 == 2) {
			this.anInt9149 = local92;
			this.anInt9152 = local54;
			this.anInt9158 = local29;
		} else if (local67 == 3) {
			this.anInt9152 = local54;
			this.anInt9149 = local29;
			this.anInt9158 = local97;
		} else if (local67 == 4) {
			this.anInt9158 = local54;
			this.anInt9149 = local29;
			this.anInt9152 = local92;
		} else if (local67 == 5) {
			this.anInt9158 = local54;
			this.anInt9149 = local97;
			this.anInt9152 = local29;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt9148 = arg1.method4974();
		} else if (arg0 == 1) {
			this.anInt9153 = (arg1.method4972() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt9155 = (arg1.method4972() << 12) / 100;
		}
	}
}
