import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class6_Sub4_Sub12 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
	private int anInt2097;

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
	private int anInt2098;

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
	private int anInt2099;

	@OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
	private int anInt2101;

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
	private int anInt2105;

	@OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
	private int anInt2109;

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
	private int anInt2102 = 0;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
	private int anInt2107 = 0;

	@OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
	private int anInt2111 = 0;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt2107 = arg1.method6058();
		} else if (arg0 == 1) {
			this.anInt2111 = (arg1.method6055() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt2102 = (arg1.method6055() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(29) int[][] local29 = this.method7747(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static408.anInt7209; local55++) {
				this.method1947(local37[local55], local41[local55], local33[local55]);
				this.anInt2097 += this.anInt2102;
				this.anInt2105 += this.anInt2107;
				this.anInt2101 += this.anInt2111;
				while (this.anInt2105 < 0) {
					this.anInt2105 += 4096;
				}
				while (this.anInt2105 > 4096) {
					this.anInt2105 -= 4096;
				}
				if (this.anInt2101 < 0) {
					this.anInt2101 = 0;
				}
				if (this.anInt2097 < 0) {
					this.anInt2097 = 0;
				}
				if (this.anInt2101 > 4096) {
					this.anInt2101 = 4096;
				}
				if (this.anInt2097 > 4096) {
					this.anInt2097 = 4096;
				}
				this.method1946(this.anInt2105, this.anInt2101, this.anInt2097);
				local45[local55] = this.anInt2109;
				local49[local55] = this.anInt2098;
				local53[local55] = this.anInt2099;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
	private void method1946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg2 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : arg2 * (arg1 + 4096) >> 12;
		if (local29 <= 0) {
			this.anInt2109 = this.anInt2098 = this.anInt2099 = arg2;
			return;
		}
		@Pc(38) int local38 = arg0 * 6;
		@Pc(46) int local46 = arg2 + arg2 - local29;
		@Pc(55) int local55 = (local29 - local46 << 12) / local29;
		@Pc(59) int local59 = local38 >> 12;
		@Pc(66) int local66 = local38 - (local59 << 12);
		@Pc(74) int local74 = local55 * local29 >> 12;
		@Pc(80) int local80 = local74 * local66 >> 12;
		@Pc(84) int local84 = local80 + local46;
		@Pc(89) int local89 = local29 - local80;
		if (local59 == 0) {
			this.anInt2098 = local84;
			this.anInt2109 = local29;
			this.anInt2099 = local46;
		} else if (local59 == 1) {
			this.anInt2109 = local89;
			this.anInt2099 = local46;
			this.anInt2098 = local29;
		} else if (local59 == 2) {
			this.anInt2099 = local84;
			this.anInt2109 = local46;
			this.anInt2098 = local29;
		} else if (local59 == 3) {
			this.anInt2099 = local29;
			this.anInt2109 = local46;
			this.anInt2098 = local89;
		} else if (local59 == 4) {
			this.anInt2099 = local29;
			this.anInt2098 = local46;
			this.anInt2109 = local84;
		} else if (local59 == 5) {
			this.anInt2099 = local89;
			this.anInt2109 = local29;
			this.anInt2098 = local46;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIII)V")
	private void method1947(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 < arg2 ? arg2 : arg0;
		@Pc(23) int local23 = local12 < arg1 ? arg1 : local12;
		@Pc(30) int local30 = arg0 > arg2 ? arg2 : arg0;
		@Pc(37) int local37 = arg1 < local30 ? arg1 : local30;
		@Pc(41) int local41 = local23 - local37;
		this.anInt2097 = (local37 + local23) / 2;
		if (this.anInt2097 > 0 && this.anInt2097 < 4096) {
			this.anInt2101 = (local41 << 12) / (this.anInt2097 > 2048 ? 8192 - (this.anInt2097 * 2) : this.anInt2097 * 2);
		} else {
			this.anInt2101 = 0;
		}
		if (local41 <= 0) {
			this.anInt2105 = 0;
			return;
		}
		@Pc(103) int local103 = (local23 - arg2 << 12) / local41;
		@Pc(112) int local112 = (local23 - arg0 << 12) / local41;
		@Pc(121) int local121 = (local23 - arg1 << 12) / local41;
		if (local23 == arg2) {
			this.anInt2105 = local37 == arg0 ? local121 + 20480 : 4096 - local112;
		} else if (arg0 == local23) {
			this.anInt2105 = local37 == arg1 ? local103 + 4096 : -local121 + 12288;
		} else {
			this.anInt2105 = local37 == arg2 ? local112 + 12288 : -local103 + 20480;
		}
		this.anInt2105 /= 6;
	}
}
