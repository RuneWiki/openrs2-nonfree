import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class1_Sub4_Sub35 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ts", name = "B", descriptor = "I")
	private int anInt6336;

	@OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
	private int anInt6338;

	@OriginalMember(owner = "client!ts", name = "G", descriptor = "I")
	private int anInt6340;

	@OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
	private int anInt6344;

	@OriginalMember(owner = "client!ts", name = "N", descriptor = "I")
	private int anInt6346;

	@OriginalMember(owner = "client!ts", name = "S", descriptor = "I")
	private int anInt6351;

	@OriginalMember(owner = "client!ts", name = "H", descriptor = "I")
	private int anInt6341 = 0;

	@OriginalMember(owner = "client!ts", name = "Q", descriptor = "I")
	private int anInt6349 = 0;

	@OriginalMember(owner = "client!ts", name = "R", descriptor = "I")
	private int anInt6350 = 0;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(29) int[][] local29 = this.method5956(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static66.anInt1511; local55++) {
				this.method5280(local33[local55], local41[local55], local37[local55]);
				this.anInt6344 += this.anInt6341;
				this.anInt6351 += this.anInt6350;
				for (this.anInt6346 += this.anInt6349; this.anInt6346 < 0; this.anInt6346 += 4096) {
				}
				while (this.anInt6346 > 4096) {
					this.anInt6346 -= 4096;
				}
				if (this.anInt6344 < 0) {
					this.anInt6344 = 0;
				}
				if (this.anInt6344 > 4096) {
					this.anInt6344 = 4096;
				}
				if (this.anInt6351 < 0) {
					this.anInt6351 = 0;
				}
				if (this.anInt6351 > 4096) {
					this.anInt6351 = 4096;
				}
				this.method5283(this.anInt6344, this.anInt6346, this.anInt6351);
				local45[local55] = this.anInt6340;
				local49[local55] = this.anInt6338;
				local53[local55] = this.anInt6336;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBII)V")
	private void method5280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(22) int local22 = arg2 < arg0 ? arg0 : arg2;
		@Pc(33) int local33 = local22 < arg1 ? arg1 : local22;
		@Pc(44) int local44 = arg2 <= arg0 ? arg2 : arg0;
		@Pc(55) int local55 = local44 <= arg1 ? local44 : arg1;
		this.anInt6351 = (local55 + local33) / 2;
		@Pc(67) int local67 = local33 - local55;
		if (local67 <= 0) {
			this.anInt6346 = 0;
		} else {
			@Pc(83) int local83 = (local33 - arg0 << 12) / local67;
			@Pc(91) int local91 = (local33 - arg2 << 12) / local67;
			@Pc(100) int local100 = (local33 - arg1 << 12) / local67;
			if (arg0 == local33) {
				this.anInt6346 = arg2 == local55 ? local100 + 20480 : -local91 + 4096;
			} else if (arg2 == local33) {
				this.anInt6346 = arg1 == local55 ? local83 + 4096 : -local100 + 12288;
			} else {
				this.anInt6346 = local55 == arg0 ? local91 + 12288 : 20480 - local83;
			}
			this.anInt6346 /= 6;
		}
		if (this.anInt6351 > 0 && this.anInt6351 < 4096) {
			this.anInt6344 = (local67 << 12) / (this.anInt6351 <= 2048 ? this.anInt6351 * 2 : 8192 - (this.anInt6351 * 2));
		} else {
			this.anInt6344 = 0;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt6349 = arg1.method5380();
		} else if (arg0 == 1) {
			this.anInt6341 = (arg1.method5416() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt6350 = (arg1.method5416() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)V")
	private void method5283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(32) int local32 = arg2 <= 2048 ? arg2 * (arg0 + 4096) >> 12 : arg0 + arg2 - (arg0 * arg2 >> 12);
		if (local32 <= 0) {
			this.anInt6340 = this.anInt6338 = this.anInt6336 = arg2;
			return;
		}
		@Pc(38) int local38 = arg1 * 6;
		@Pc(45) int local45 = arg2 + arg2 - local32;
		@Pc(54) int local54 = (local32 - local45 << 12) / local32;
		@Pc(58) int local58 = local38 >> 12;
		@Pc(64) int local64 = local38 - (local58 << 12);
		@Pc(72) int local72 = local54 * local32 >> 12;
		@Pc(78) int local78 = local72 * local64 >> 12;
		@Pc(82) int local82 = local45 + local78;
		@Pc(87) int local87 = local32 - local78;
		if (local58 == 0) {
			this.anInt6340 = local32;
			this.anInt6336 = local45;
			this.anInt6338 = local82;
			return;
		}
		if (local58 == 1) {
			this.anInt6340 = local87;
			this.anInt6336 = local45;
			this.anInt6338 = local32;
			return;
		}
		if (local58 == 2) {
			this.anInt6336 = local82;
			this.anInt6340 = local45;
			this.anInt6338 = local32;
			return;
		}
		if (local58 == 3) {
			this.anInt6336 = local32;
			this.anInt6338 = local87;
			this.anInt6340 = local45;
			return;
		}
		if (local58 == 4) {
			this.anInt6336 = local32;
			this.anInt6338 = local45;
			this.anInt6340 = local82;
			return;
		}
		if (local58 == 5) {
			this.anInt6340 = local32;
			this.anInt6336 = local87;
			this.anInt6338 = local45;
			return;
		}
	}
}
