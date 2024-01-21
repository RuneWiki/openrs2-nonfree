import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class3_Sub1_Sub37 extends Class3_Sub1 {

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
	private int anInt4004;

	@OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
	private int anInt4008;

	@OriginalMember(owner = "client!wh", name = "eb", descriptor = "I")
	private int anInt4015;

	@OriginalMember(owner = "client!wh", name = "fb", descriptor = "I")
	private int anInt4016;

	@OriginalMember(owner = "client!wh", name = "hb", descriptor = "I")
	private int anInt4018;

	@OriginalMember(owner = "client!wh", name = "ib", descriptor = "I")
	private int anInt4019;

	@OriginalMember(owner = "client!wh", name = "bb", descriptor = "I")
	private int anInt4012;

	@OriginalMember(owner = "client!wh", name = "jb", descriptor = "I")
	private int anInt4020;

	@OriginalMember(owner = "client!wh", name = "db", descriptor = "I")
	private int anInt4014;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(29) int[][] local29 = this.method2913(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local19[0];
			@Pc(45) int[] local45 = local29[2];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static141.anInt3261; local55++) {
				this.method2921(local33[local55], local45[local55], local37[local55]);
				this.anInt4015 += this.anInt4020;
				this.anInt4016 += this.anInt4012;
				if (this.anInt4015 < 0) {
					this.anInt4015 = 0;
				}
				while (this.anInt4016 < 0) {
					this.anInt4016 += 4096;
				}
				if (this.anInt4015 > 4096) {
					this.anInt4015 = 4096;
				}
				this.anInt4018 += this.anInt4014;
				if (this.anInt4018 < 0) {
					this.anInt4018 = 0;
				}
				if (this.anInt4018 > 4096) {
					this.anInt4018 = 4096;
				}
				while (this.anInt4016 > 4096) {
					this.anInt4016 -= 4096;
				}
				this.method2920(this.anInt4016, this.anInt4015, this.anInt4018);
				local41[local55] = this.anInt4019;
				local49[local55] = this.anInt4004;
				local53[local55] = this.anInt4008;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIII)V")
	private void method2920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg1 > 2048 ? arg2 + arg1 - (arg1 * arg2 >> 12) : arg1 * (arg2 + 4096) >> 12;
		if (local29 <= 0) {
			this.anInt4019 = this.anInt4004 = this.anInt4008 = arg1;
			return;
		}
		@Pc(38) int local38 = arg0 * 6;
		@Pc(44) int local44 = arg1 + arg1 - local29;
		@Pc(53) int local53 = (local29 - local44 << 12) / local29;
		@Pc(57) int local57 = local38 >> 12;
		@Pc(66) int local66 = local38 - (local57 << 12);
		@Pc(72) int local72 = local53 * local29 >> 12;
		@Pc(78) int local78 = local66 * local72 >> 12;
		@Pc(82) int local82 = local78 + local44;
		@Pc(87) int local87 = local29 - local78;
		if (local57 == 0) {
			this.anInt4019 = local29;
			this.anInt4008 = local44;
			this.anInt4004 = local82;
			return;
		}
		if (local57 == 1) {
			this.anInt4008 = local44;
			this.anInt4004 = local29;
			this.anInt4019 = local87;
			return;
		}
		if (local57 == 2) {
			this.anInt4019 = local44;
			this.anInt4008 = local82;
			this.anInt4004 = local29;
			return;
		}
		if (local57 == 3) {
			this.anInt4008 = local29;
			this.anInt4004 = local87;
			this.anInt4019 = local44;
			return;
		}
		if (local57 == 4) {
			this.anInt4008 = local29;
			this.anInt4019 = local82;
			this.anInt4004 = local44;
			return;
		}
		if (local57 == 5) {
			this.anInt4004 = local44;
			this.anInt4008 = local87;
			this.anInt4019 = local29;
			return;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBII)V")
	private void method2921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 <= arg2 ? arg2 : arg0;
		@Pc(19) int local19 = arg1 <= local12 ? local12 : arg1;
		@Pc(39) int local39 = arg2 > arg0 ? arg0 : arg2;
		@Pc(50) int local50 = local39 <= arg1 ? local39 : arg1;
		@Pc(55) int local55 = local19 - local50;
		this.anInt4015 = (local19 + local50) / 2;
		if (local55 <= 0) {
			return;
		}
		@Pc(72) int local72 = (local19 - arg0 << 12) / local55;
		if (this.anInt4015 > 0 && this.anInt4015 < 4096) {
			this.anInt4018 = (local55 << 12) / (this.anInt4015 > 2048 ? 8192 - this.anInt4015 * 2 : this.anInt4015 * 2);
		}
		@Pc(109) int local109 = (local19 - arg1 << 12) / local55;
		@Pc(118) int local118 = (local19 - arg2 << 12) / local55;
		if (arg0 == local19) {
			this.anInt4016 = local50 == arg2 ? local109 + 20480 : -local118 + 4096;
		} else if (arg2 == local19) {
			this.anInt4016 = local50 == arg1 ? local72 + 4096 : -local109 + 12288;
		} else {
			this.anInt4016 = local50 == arg0 ? local118 + 12288 : 20480 - local72;
		}
		this.anInt4016 /= 6;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt4012 = arg1.method220();
		} else if (arg0 == 1) {
			this.anInt4014 = (arg1.method203() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt4020 = (arg1.method203() << 12) / 100;
		}
	}
}
